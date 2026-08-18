package org.telegram.ui.Components.chat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.math.MathUtils;
import com.google.android.exoplayer2.util.Log;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;

public class ChatActivityMessageMetricsView extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private static final RectF tmpRect = new RectF();
    private final boolean DRAW_DEBUG;
    private int currentAccount;
    private long dialogId;
    private final LongSparseArray groupedPositions;
    private long lastTime;
    private long lastUserActivityTime;
    private ViewGroup list;
    private ViewTreeObserver observer;
    private Runnable pendingFlush;
    private final ArrayList pendingMetrics;
    private ViewGroup root;
    private final Runnable scheduledCheckRunnable;
    private TextPaint tmpTextPaint;
    private boolean updateInNextDraw;
    private final RectF viewPort;
    private final RectF viewPortInsets;
    private final LongSparseArray watchers;

    public static void lambda$flushImpl$0(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
    }

    public ChatActivityMessageMetricsView(Context context) {
        super(context);
        this.viewPortInsets = new RectF();
        this.viewPort = new RectF();
        this.pendingMetrics = new ArrayList();
        this.watchers = new LongSparseArray();
        this.groupedPositions = new LongSparseArray();
        this.scheduledCheckRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.scheduledCheck();
            }
        };
        this.DRAW_DEBUG = SharedConfig.debugViewMetrics;
    }

    public void init(int i, long j, ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.dialogId = j;
        this.currentAccount = i;
        this.root = viewGroup;
        this.list = viewGroup2;
    }

    public void setViewportPadding(float f, float f2, float f3, float f4) {
        this.viewPortInsets.set(f, f2, f3, f4);
        invalidateViewPort();
    }

    public void setIsUserActive() {
        this.lastUserActivityTime = SystemClock.uptimeMillis();
    }

    private void invalidateViewPort() {
        RectF rectF = this.viewPort;
        RectF rectF2 = this.viewPortInsets;
        rectF.set(rectF2.left, rectF2.top, getMeasuredWidth() - this.viewPortInsets.right, getMeasuredHeight() - this.viewPortInsets.bottom);
    }

    public void finish() {
        int size = this.watchers.size();
        for (int i = 0; i < size; i++) {
            MessageWatcher messageWatcher = (MessageWatcher) this.watchers.valueAt(i);
            if (messageWatcher.visible) {
                this.pendingMetrics.add(messageWatcher.buildMetrics());
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            Log.d("ViewMetrics", "finish");
        }
        this.watchers.clear();
        flushImpl();
    }

    public void flushImpl() {
        Runnable runnable = this.pendingFlush;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.pendingFlush = null;
        }
        if (this.pendingMetrics.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_reportReadMetrics tL_messages_reportReadMetrics = new TLRPC.TL_messages_reportReadMetrics();
        tL_messages_reportReadMetrics.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
        tL_messages_reportReadMetrics.metrics = new ArrayList<>(this.pendingMetrics);
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_reportReadMetrics, null, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                ChatActivityMessageMetricsView.lambda$flushImpl$0((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
        this.pendingMetrics.clear();
    }

    private void processCurrentFrame() {
        boolean z;
        long j;
        int i;
        boolean z2;
        RectF rectF;
        RectF rectF2;
        MessageObject messageObject;
        int i2;
        if (this.root == null || this.list == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j2 = this.lastTime;
        long j3 = 0;
        long j4 = j2 == 0 ? 0L : jUptimeMillis - j2;
        this.lastTime = jUptimeMillis;
        int size = this.groupedPositions.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((RectF) this.groupedPositions.valueAt(i3)).set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        int childCount = this.list.getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = this.list.getChildAt(i4);
            ViewGroup viewGroup = this.root;
            RectF rectF3 = tmpRect;
            if (ViewPositionWatcher.computeRectInParent(childAt, viewGroup, rectF3)) {
                if (childAt instanceof ChatMessageCell) {
                    messageObject = ((ChatMessageCell) childAt).getMessageObject();
                } else if (childAt instanceof ChatActionCell) {
                    messageObject = ((ChatActionCell) childAt).getMessageObject();
                } else {
                    i2 = childCount;
                }
                if (messageObject == null) {
                    i2 = childCount;
                } else {
                    long dialogId = messageObject.getDialogId();
                    if (dialogId != this.dialogId) {
                        i2 = childCount;
                    } else {
                        int id = messageObject.getId();
                        long groupId = messageObject.getGroupId();
                        if (dialogId == j3 || id <= 0) {
                            i2 = childCount;
                        } else {
                            long j5 = id;
                            MessageWatcher messageWatcher = (MessageWatcher) this.watchers.get(j5);
                            if (messageWatcher == null) {
                                i2 = childCount;
                                messageWatcher = new MessageWatcher(id, groupId);
                                this.watchers.put(j5, messageWatcher);
                                if (BuildVars.LOGS_ENABLED) {
                                    Log.d("ViewMetrics", id + " " + groupId + " in screen");
                                }
                            } else {
                                i2 = childCount;
                            }
                            messageWatcher.position.set(rectF3);
                            if (groupId != 0) {
                                RectF rectF4 = (RectF) this.groupedPositions.get(groupId);
                                if (rectF4 == null) {
                                    rectF4 = new RectF();
                                    this.groupedPositions.put(groupId, rectF4);
                                }
                                rectF4.union(messageWatcher.position);
                            }
                            messageWatcher.lastUpdateMillis = jUptimeMillis;
                        }
                    }
                }
            } else {
                i2 = childCount;
            }
            i4++;
            childCount = i2;
            j3 = 0;
        }
        RectF rectF5 = null;
        for (int size2 = this.groupedPositions.size() - 1; size2 >= 0; size2--) {
            if (((RectF) this.groupedPositions.valueAt(size2)).isEmpty()) {
                this.groupedPositions.removeAt(size2);
            }
        }
        int size3 = this.watchers.size();
        for (int i5 = 0; i5 < size3; i5++) {
            MessageWatcher messageWatcher2 = (MessageWatcher) this.watchers.valueAt(i5);
            long j6 = messageWatcher2.groupId;
            if (j6 != 0 && (rectF2 = (RectF) this.groupedPositions.get(j6)) != null) {
                messageWatcher2.position.set(rectF2);
            }
        }
        int size4 = this.watchers.size() - 1;
        while (size4 >= 0) {
            MessageWatcher messageWatcher3 = (MessageWatcher) this.watchers.valueAt(size4);
            long j7 = messageWatcher3.messageId;
            long j8 = messageWatcher3.groupId;
            RectF rectF6 = j8 != 0 ? (RectF) this.groupedPositions.get(j8) : rectF5;
            if (messageWatcher3.lastUpdateMillis != jUptimeMillis && rectF6 == null) {
                z = false;
            } else if (RectF.intersects(this.viewPort, rectF6 != null ? rectF6 : messageWatcher3.position)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (messageWatcher3.lastViewMillis != 0) {
                    MessageWatcher.access$514(messageWatcher3, j4);
                    i = size4;
                    z2 = z;
                    if (jUptimeMillis - this.lastUserActivityTime < 15000) {
                        MessageWatcher.access$614(messageWatcher3, j4);
                    }
                } else {
                    i = size4;
                    z2 = z;
                }
                messageWatcher3.lastViewMillis = jUptimeMillis;
                float fHeight = messageWatcher3.position.height();
                j = j4;
                float f = this.viewPort.top - messageWatcher3.position.top;
                float f2 = fHeight - (messageWatcher3.position.bottom - this.viewPort.bottom);
                rectF = rectF6;
                messageWatcher3.seenTopPx = Math.min(messageWatcher3.seenTopPx, MathUtils.clamp(f, 0.0f, fHeight));
                messageWatcher3.seenBottomPx = Math.max(messageWatcher3.seenBottomPx, MathUtils.clamp(f2, 0.0f, fHeight));
                messageWatcher3.maxViewPortHeight = Math.max(messageWatcher3.maxViewPortHeight, this.viewPort.height());
                messageWatcher3.maxPostTotalHeight = Math.max(messageWatcher3.maxPostTotalHeight, fHeight);
                if (!messageWatcher3.visible && messageWatcher3.visibleTime > 300) {
                    if (BuildVars.LOGS_ENABLED) {
                        Log.d("ViewMetrics", j7 + " " + j8 + " in viewport");
                    }
                    messageWatcher3.visible = true;
                }
            } else {
                j = j4;
                i = size4;
                z2 = z;
                rectF = rectF6;
            }
            if (z2 || messageWatcher3.visibleTime <= 0 || jUptimeMillis - 300 <= messageWatcher3.lastViewMillis) {
                if (messageWatcher3.visible && messageWatcher3.visibleTime > 300000) {
                    this.pendingMetrics.add(messageWatcher3.buildMetrics());
                    this.watchers.removeAt(i);
                    if (BuildVars.LOGS_ENABLED) {
                        Log.d("ViewMetrics", j7 + " " + j8 + " out of time");
                    }
                } else {
                    if (!messageWatcher3.visible && messageWatcher3.lastUpdateMillis != jUptimeMillis) {
                        if (messageWatcher3.groupId == 0 || rectF == null) {
                            this.watchers.removeAt(i);
                            if (BuildVars.LOGS_ENABLED) {
                                Log.d("ViewMetrics", j7 + " " + j8 + " out of screen");
                            }
                        }
                    }
                    size4 = i - 1;
                    j4 = j;
                    rectF5 = null;
                }
            } else {
                if (messageWatcher3.visible) {
                    this.pendingMetrics.add(messageWatcher3.buildMetrics());
                }
                this.watchers.removeAt(i);
                if (BuildVars.LOGS_ENABLED) {
                    Log.d("ViewMetrics", j7 + " " + j8 + " out of viewport: " + messageWatcher3.visibleTime);
                }
            }
            size4 = i - 1;
            j4 = j;
            rectF5 = null;
        }
        if (!this.pendingMetrics.isEmpty() && this.pendingFlush == null) {
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.flushImpl();
                }
            };
            this.pendingFlush = runnable;
            AndroidUtilities.runOnUIThread(runnable, 5000L);
        }
        if (this.DRAW_DEBUG) {
            invalidate();
        }
    }

    private static class MessageWatcher {
        private long activeTime;
        public final long groupId;
        private long lastUpdateMillis;
        private long lastViewMillis;
        private float maxPostTotalHeight;
        private float maxViewPortHeight;
        public final int messageId;
        private final RectF position;
        private float seenBottomPx;
        private float seenTopPx;
        private final long viewId;
        private boolean visible;
        private long visibleTime;

        static long access$514(MessageWatcher messageWatcher, long j) {
            long j2 = messageWatcher.visibleTime + j;
            messageWatcher.visibleTime = j2;
            return j2;
        }

        static long access$614(MessageWatcher messageWatcher, long j) {
            long j2 = messageWatcher.activeTime + j;
            messageWatcher.activeTime = j2;
            return j2;
        }

        private MessageWatcher(int i, long j) {
            this.position = new RectF();
            this.maxPostTotalHeight = 0.0f;
            this.maxViewPortHeight = 0.0f;
            this.seenTopPx = Float.MAX_VALUE;
            this.seenBottomPx = 0.0f;
            this.messageId = i;
            this.groupId = j;
            this.viewId = Utilities.random.nextLong();
        }

        public TLRPC.TL_inputMessageReadMetric buildMetrics() {
            TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
            tL_inputMessageReadMetric.msg_id = this.messageId;
            tL_inputMessageReadMetric.view_id = this.viewId;
            tL_inputMessageReadMetric.time_in_view_ms = (int) this.visibleTime;
            tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.activeTime;
            tL_inputMessageReadMetric.height_to_viewport_ratio_permille = getHeightToViewportRatioPermille();
            tL_inputMessageReadMetric.seen_range_ratio_permille = getSeenRangeRatioPermille();
            return tL_inputMessageReadMetric;
        }

        public int getHeightToViewportRatioPermille() {
            float f = this.maxViewPortHeight;
            if (f == 0.0f) {
                return 1000;
            }
            return Math.round((this.maxPostTotalHeight / f) * 1000.0f);
        }

        public int getSeenRangeRatioPermille() {
            float f = this.maxPostTotalHeight;
            if (f == 0.0f) {
                return 0;
            }
            float f2 = this.seenTopPx;
            float f3 = this.seenBottomPx;
            if (f2 > f3) {
                return 0;
            }
            return Math.round(((f3 - f2) / f) * 1000.0f);
        }
    }

    public void scheduledCheck() {
        AndroidUtilities.runOnUIThread(this.scheduledCheckRunnable, 400L);
        processCurrentFrame();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.lastTime = 0L;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.observer = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
        this.observer.addOnGlobalLayoutListener(this);
        this.observer.addOnScrollChangedListener(this);
        AndroidUtilities.runOnUIThread(this.scheduledCheckRunnable, 400L);
        if (BuildVars.LOGS_ENABLED) {
            Log.d("ViewMetrics", "attach");
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.observer;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.observer.removeOnPreDrawListener(this);
            this.observer.removeOnGlobalLayoutListener(this);
            this.observer.removeOnScrollChangedListener(this);
        }
        this.observer = null;
        this.lastTime = 0L;
        AndroidUtilities.cancelRunOnUIThread(this.scheduledCheckRunnable);
        if (BuildVars.LOGS_ENABLED) {
            Log.d("ViewMetrics", "detach");
        }
        super.onDetachedFromWindow();
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        invalidateViewPort();
    }

    @Override
    public void onScrollChanged() {
        this.updateInNextDraw = true;
    }

    @Override
    public void onGlobalLayout() {
        this.updateInNextDraw = true;
    }

    @Override
    public boolean onPreDraw() {
        if (!this.updateInNextDraw) {
            return true;
        }
        processCurrentFrame();
        this.updateInNextDraw = false;
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.DRAW_DEBUG) {
            if (this.tmpTextPaint == null) {
                TextPaint textPaint = new TextPaint(1);
                this.tmpTextPaint = textPaint;
                textPaint.setColor(-16776961);
                this.tmpTextPaint.setTextSize(AndroidUtilities.dp(10.0f));
            }
            super.onDraw(canvas);
            canvas.drawRect(this.viewPort, Theme.DEBUG_RED_STROKE);
            int size = this.watchers.size();
            for (int i = 0; i < size; i++) {
                MessageWatcher messageWatcher = (MessageWatcher) this.watchers.valueAt(i);
                canvas.drawRect(messageWatcher.position, Theme.DEBUG_GREEN_STROKE);
                canvas.save();
                canvas.translate(messageWatcher.position.left, MathUtils.clamp(MathUtils.clamp(messageWatcher.position.centerY() - AndroidUtilities.dp(20.0f), this.viewPort.top - AndroidUtilities.dp(40.0f), this.viewPort.bottom), messageWatcher.position.top, messageWatcher.position.bottom - AndroidUtilities.dp(40.0f)));
                canvas.drawRect(0.0f, 0.0f, messageWatcher.position.width(), AndroidUtilities.dp(40.0f), Theme.DEBUG_GREEN_B0);
                canvas.translate(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(16.0f));
                canvas.save();
                canvas.drawText("time_in_view_ms: " + messageWatcher.visibleTime, 0.0f, 0.0f, this.tmpTextPaint);
                canvas.translate(0.0f, (float) AndroidUtilities.dp(16.0f));
                canvas.drawText("active_time_in_view_ms: " + messageWatcher.activeTime, 0.0f, 0.0f, this.tmpTextPaint);
                canvas.restore();
                canvas.save();
                canvas.translate(((float) getWidth()) / 2.0f, 0.0f);
                canvas.drawText("height_to_viewport_ratio_permille: " + messageWatcher.getHeightToViewportRatioPermille(), 0.0f, 0.0f, this.tmpTextPaint);
                canvas.translate(0.0f, (float) AndroidUtilities.dp(16.0f));
                canvas.drawText("seen_range_ratio_permille: " + messageWatcher.getSeenRangeRatioPermille(), 0.0f, 0.0f, this.tmpTextPaint);
                canvas.restore();
                canvas.restore();
            }
        }
    }
}
