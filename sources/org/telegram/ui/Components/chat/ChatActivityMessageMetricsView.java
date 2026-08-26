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
import org.telegram.ui.ChatActivity;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda36;

public final class ChatActivityMessageMetricsView extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public static final RectF tmpRect = new RectF();
    public final boolean DRAW_DEBUG;
    public int currentAccount;
    public long dialogId;
    public final LongSparseArray groupedPositions;
    public long lastTime;
    public long lastUserActivityTime;
    public ChatActivity.AnonymousClass21 list;
    public ViewTreeObserver observer;
    public ChatActivityMessageMetricsView$$ExternalSyntheticLambda1 pendingFlush;
    public final ArrayList pendingMetrics;
    public ViewGroup root;
    public final ChatActivityMessageMetricsView$$ExternalSyntheticLambda1 scheduledCheckRunnable;
    public TextPaint tmpTextPaint;
    public boolean updateInNextDraw;
    public final RectF viewPort;
    public final RectF viewPortInsets;
    public final LongSparseArray watchers;

    public final class MessageWatcher {
        public long activeTime;
        public final long groupId;
        public long lastUpdateMillis;
        public long lastViewMillis;
        public final int messageId;
        public boolean visible;
        public long visibleTime;
        public final RectF position = new RectF();
        public float maxPostTotalHeight = 0.0f;
        public float maxViewPortHeight = 0.0f;
        public float seenTopPx = Float.MAX_VALUE;
        public float seenBottomPx = 0.0f;
        public final long viewId = Utilities.random.nextLong();

        public MessageWatcher(int i, long j) {
            this.messageId = i;
            this.groupId = j;
        }

        public final TLRPC.TL_inputMessageReadMetric buildMetrics() {
            int iRound;
            TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
            tL_inputMessageReadMetric.msg_id = this.messageId;
            tL_inputMessageReadMetric.view_id = this.viewId;
            tL_inputMessageReadMetric.time_in_view_ms = (int) this.visibleTime;
            tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.activeTime;
            float f = this.maxViewPortHeight;
            tL_inputMessageReadMetric.height_to_viewport_ratio_permille = f == 0.0f ? 1000 : Math.round((this.maxPostTotalHeight / f) * 1000.0f);
            float f2 = this.maxPostTotalHeight;
            if (f2 != 0.0f) {
                float f3 = this.seenTopPx;
                float f4 = this.seenBottomPx;
                if (f3 > f4) {
                    iRound = 0;
                } else {
                    iRound = Math.round(((f4 - f3) / f2) * 1000.0f);
                }
            } else {
                iRound = 0;
            }
            tL_inputMessageReadMetric.seen_range_ratio_permille = iRound;
            return tL_inputMessageReadMetric;
        }
    }

    public ChatActivityMessageMetricsView(Context context) {
        super(context);
        this.viewPortInsets = new RectF();
        this.viewPort = new RectF();
        this.pendingMetrics = new ArrayList();
        this.watchers = new LongSparseArray();
        this.groupedPositions = new LongSparseArray();
        this.scheduledCheckRunnable = new ChatActivityMessageMetricsView$$ExternalSyntheticLambda1(this, 1);
        this.DRAW_DEBUG = SharedConfig.debugViewMetrics;
    }

    public final void flushImpl() {
        ChatActivityMessageMetricsView$$ExternalSyntheticLambda1 chatActivityMessageMetricsView$$ExternalSyntheticLambda1 = this.pendingFlush;
        if (chatActivityMessageMetricsView$$ExternalSyntheticLambda1 != null) {
            AndroidUtilities.cancelRunOnUIThread(chatActivityMessageMetricsView$$ExternalSyntheticLambda1);
            this.pendingFlush = null;
        }
        ArrayList arrayList = this.pendingMetrics;
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_reportReadMetrics tL_messages_reportReadMetrics = new TLRPC.TL_messages_reportReadMetrics();
        tL_messages_reportReadMetrics.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
        tL_messages_reportReadMetrics.metrics = new ArrayList<>(arrayList);
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_reportReadMetrics, null, new VoIPFragment$$ExternalSyntheticLambda36(2));
        arrayList.clear();
    }

    public final void init(int i, long j, ViewGroup viewGroup, ChatActivity.AnonymousClass21 anonymousClass21) {
        this.dialogId = j;
        this.currentAccount = i;
        this.root = viewGroup;
        this.list = anonymousClass21;
    }

    @Override
    public final void onAttachedToWindow() {
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
    public final void onDetachedFromWindow() {
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
    public final void onDraw(Canvas canvas) {
        int iRound;
        if (this.DRAW_DEBUG) {
            if (this.tmpTextPaint == null) {
                TextPaint textPaint = new TextPaint(1);
                this.tmpTextPaint = textPaint;
                textPaint.setColor(-16776961);
                this.tmpTextPaint.setTextSize(AndroidUtilities.dp(10.0f));
            }
            super.onDraw(canvas);
            RectF rectF = this.viewPort;
            canvas.drawRect(rectF, Theme.DEBUG_RED_STROKE);
            LongSparseArray longSparseArray = this.watchers;
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                MessageWatcher messageWatcher = (MessageWatcher) longSparseArray.valueAt(i);
                canvas.drawRect(messageWatcher.position, Theme.DEBUG_GREEN_STROKE);
                canvas.save();
                RectF rectF2 = messageWatcher.position;
                canvas.translate(rectF2.left, MathUtils.clamp(MathUtils.clamp(rectF2.centerY() - AndroidUtilities.dp(20.0f), rectF.top - AndroidUtilities.dp(40.0f), rectF.bottom), rectF2.top, rectF2.bottom - AndroidUtilities.dp(40.0f)));
                canvas.drawRect(0.0f, 0.0f, rectF2.width(), AndroidUtilities.dp(40.0f), Theme.DEBUG_GREEN_B0);
                canvas.translate(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(16.0f));
                canvas.save();
                canvas.drawText("time_in_view_ms: " + messageWatcher.visibleTime, 0.0f, 0.0f, this.tmpTextPaint);
                canvas.translate(0.0f, (float) AndroidUtilities.dp(16.0f));
                canvas.drawText("active_time_in_view_ms: " + messageWatcher.activeTime, 0.0f, 0.0f, this.tmpTextPaint);
                canvas.restore();
                canvas.save();
                canvas.translate(getWidth() / 2.0f, 0.0f);
                StringBuilder sb = new StringBuilder("height_to_viewport_ratio_permille: ");
                float f = messageWatcher.maxViewPortHeight;
                sb.append(f == 0.0f ? 1000 : Math.round((messageWatcher.maxPostTotalHeight / f) * 1000.0f));
                canvas.drawText(sb.toString(), 0.0f, 0.0f, this.tmpTextPaint);
                canvas.translate(0.0f, AndroidUtilities.dp(16.0f));
                StringBuilder sb2 = new StringBuilder("seen_range_ratio_permille: ");
                float f2 = messageWatcher.maxPostTotalHeight;
                if (f2 != 0.0f) {
                    float f3 = messageWatcher.seenTopPx;
                    float f4 = messageWatcher.seenBottomPx;
                    if (f3 > f4) {
                        iRound = 0;
                    } else {
                        iRound = Math.round(((f4 - f3) / f2) * 1000.0f);
                    }
                } else {
                    iRound = 0;
                }
                sb2.append(iRound);
                canvas.drawText(sb2.toString(), 0.0f, 0.0f, this.tmpTextPaint);
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onGlobalLayout() {
        this.updateInNextDraw = true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.viewPort;
        RectF rectF2 = this.viewPortInsets;
        rectF.set(rectF2.left, rectF2.top, getMeasuredWidth() - rectF2.right, getMeasuredHeight() - rectF2.bottom);
    }

    @Override
    public final boolean onPreDraw() {
        if (!this.updateInNextDraw) {
            return true;
        }
        processCurrentFrame();
        this.updateInNextDraw = false;
        return true;
    }

    @Override
    public final void onScrollChanged() {
        this.updateInNextDraw = true;
    }

    public final void processCurrentFrame() {
        LongSparseArray longSparseArray;
        String str;
        ArrayList arrayList;
        boolean z;
        long j;
        LongSparseArray longSparseArray2;
        String str2;
        RectF rectF;
        MessageObject messageObject;
        int i;
        long j2;
        long j3;
        MessageWatcher messageWatcher;
        if (this.root == null || this.list == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j4 = this.lastTime;
        long j5 = 0;
        long j6 = j4 == 0 ? 0L : jUptimeMillis - j4;
        this.lastTime = jUptimeMillis;
        LongSparseArray longSparseArray3 = this.groupedPositions;
        int size = longSparseArray3.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((RectF) longSparseArray3.valueAt(i2)).set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        int childCount = this.list.getChildCount();
        int i3 = 0;
        while (true) {
            longSparseArray = this.watchers;
            str = "ViewMetrics";
            if (i3 >= childCount) {
                break;
            }
            View childAt = this.list.getChildAt(i3);
            long j7 = j5;
            ViewGroup viewGroup = this.root;
            RectF rectF2 = tmpRect;
            if (ViewPositionWatcher.computeRectInParent(childAt, viewGroup, rectF2)) {
                if (childAt instanceof ChatMessageCell) {
                    messageObject = ((ChatMessageCell) childAt).getMessageObject();
                } else if (childAt instanceof ChatActionCell) {
                    messageObject = ((ChatActionCell) childAt).getMessageObject();
                } else {
                    j2 = j6;
                    i = i3;
                }
                if (messageObject == null) {
                    j2 = j6;
                    i = i3;
                } else {
                    long dialogId = messageObject.getDialogId();
                    i = i3;
                    if (dialogId != this.dialogId) {
                        j2 = j6;
                    } else {
                        int id = messageObject.getId();
                        long groupId = messageObject.getGroupId();
                        if (dialogId == j7 || id <= 0) {
                            j2 = j6;
                        } else {
                            long j8 = id;
                            MessageWatcher messageWatcher2 = (MessageWatcher) longSparseArray.get(j8);
                            if (messageWatcher2 == null) {
                                j2 = j6;
                                j3 = groupId;
                                messageWatcher = new MessageWatcher(id, j3);
                                longSparseArray.put(j8, messageWatcher);
                                if (BuildVars.LOGS_ENABLED) {
                                    Log.d("ViewMetrics", id + " " + j3 + " in screen");
                                }
                            } else {
                                j2 = j6;
                                j3 = groupId;
                                messageWatcher = messageWatcher2;
                            }
                            RectF rectF3 = messageWatcher.position;
                            rectF3.set(rectF2);
                            if (j3 != j7) {
                                RectF rectF4 = (RectF) longSparseArray3.get(j3);
                                if (rectF4 == null) {
                                    rectF4 = new RectF();
                                    longSparseArray3.put(j3, rectF4);
                                }
                                rectF4.union(rectF3);
                            }
                            messageWatcher.lastUpdateMillis = jUptimeMillis;
                        }
                    }
                }
            } else {
                j2 = j6;
                i = i3;
            }
            i3 = i + 1;
            j5 = j7;
            j6 = j2;
        }
        long j9 = j6;
        long j10 = j5;
        for (int size2 = longSparseArray3.size() - 1; size2 >= 0; size2--) {
            if (((RectF) longSparseArray3.valueAt(size2)).isEmpty()) {
                longSparseArray3.removeAt(size2);
            }
        }
        int size3 = longSparseArray.size();
        for (int i4 = 0; i4 < size3; i4++) {
            MessageWatcher messageWatcher3 = (MessageWatcher) longSparseArray.valueAt(i4);
            long j11 = messageWatcher3.groupId;
            if (j11 != j10 && (rectF = (RectF) longSparseArray3.get(j11)) != null) {
                messageWatcher3.position.set(rectF);
            }
        }
        int size4 = longSparseArray.size() - 1;
        while (true) {
            arrayList = this.pendingMetrics;
            if (size4 < 0) {
                break;
            }
            MessageWatcher messageWatcher4 = (MessageWatcher) longSparseArray.valueAt(size4);
            long j12 = messageWatcher4.messageId;
            long j13 = messageWatcher4.groupId;
            RectF rectF5 = j13 != j10 ? (RectF) longSparseArray3.get(j13) : null;
            long j14 = messageWatcher4.lastUpdateMillis;
            RectF rectF6 = this.viewPort;
            RectF rectF7 = messageWatcher4.position;
            if (j14 != jUptimeMillis && rectF5 == null) {
                z = false;
            } else if (RectF.intersects(rectF6, rectF5 != null ? rectF5 : rectF7)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                longSparseArray2 = longSparseArray;
                String str3 = str;
                if (messageWatcher4.lastViewMillis != j10) {
                    messageWatcher4.visibleTime += j9;
                    if (jUptimeMillis - this.lastUserActivityTime < 15000) {
                        messageWatcher4.activeTime += j9;
                    }
                }
                messageWatcher4.lastViewMillis = jUptimeMillis;
                float fHeight = rectF7.height();
                j = jUptimeMillis;
                float f = rectF6.top - rectF7.top;
                float f2 = fHeight - (rectF7.bottom - rectF6.bottom);
                messageWatcher4.seenTopPx = Math.min(messageWatcher4.seenTopPx, MathUtils.clamp(f, 0.0f, fHeight));
                messageWatcher4.seenBottomPx = Math.max(messageWatcher4.seenBottomPx, MathUtils.clamp(f2, 0.0f, fHeight));
                messageWatcher4.maxViewPortHeight = Math.max(messageWatcher4.maxViewPortHeight, rectF6.height());
                messageWatcher4.maxPostTotalHeight = Math.max(messageWatcher4.maxPostTotalHeight, fHeight);
                if (messageWatcher4.visible || messageWatcher4.visibleTime <= 300) {
                    str2 = str3;
                } else {
                    if (BuildVars.LOGS_ENABLED) {
                        str2 = str3;
                        Log.d(str2, j12 + " " + j13 + " in viewport");
                    } else {
                        str2 = str3;
                    }
                    messageWatcher4.visible = true;
                }
            } else {
                j = jUptimeMillis;
                longSparseArray2 = longSparseArray;
                str2 = str;
            }
            if (z || messageWatcher4.visibleTime <= j10 || j - 300 <= messageWatcher4.lastViewMillis) {
                longSparseArray = longSparseArray2;
                boolean z2 = messageWatcher4.visible;
                if (z2) {
                    String str4 = str2;
                    if (messageWatcher4.visibleTime > 300000) {
                        arrayList.add(messageWatcher4.buildMetrics());
                        longSparseArray.removeAt(size4);
                        if (BuildVars.LOGS_ENABLED) {
                            str2 = str4;
                            Log.d(str2, j12 + " " + j13 + " out of time");
                        } else {
                            str2 = str4;
                        }
                    } else {
                        str2 = str4;
                        if (z2 && messageWatcher4.lastUpdateMillis != j && (j13 == j10 || rectF5 == null)) {
                            longSparseArray.removeAt(size4);
                            if (BuildVars.LOGS_ENABLED) {
                                Log.d(str2, j12 + " " + j13 + " out of screen");
                            }
                        }
                    }
                } else if (z2) {
                }
            } else {
                if (messageWatcher4.visible) {
                    arrayList.add(messageWatcher4.buildMetrics());
                }
                longSparseArray = longSparseArray2;
                longSparseArray.removeAt(size4);
                if (BuildVars.LOGS_ENABLED) {
                    Log.d(str2, j12 + " " + j13 + " out of viewport: " + messageWatcher4.visibleTime);
                }
            }
            size4--;
            str = str2;
            jUptimeMillis = j;
        }
        if (!arrayList.isEmpty() && this.pendingFlush == null) {
            ChatActivityMessageMetricsView$$ExternalSyntheticLambda1 chatActivityMessageMetricsView$$ExternalSyntheticLambda1 = new ChatActivityMessageMetricsView$$ExternalSyntheticLambda1(this, 0);
            this.pendingFlush = chatActivityMessageMetricsView$$ExternalSyntheticLambda1;
            AndroidUtilities.runOnUIThread(chatActivityMessageMetricsView$$ExternalSyntheticLambda1, 5000L);
        }
        if (this.DRAW_DEBUG) {
            invalidate();
        }
    }

    public final void setIsUserActive() {
        this.lastUserActivityTime = SystemClock.uptimeMillis();
    }
}
