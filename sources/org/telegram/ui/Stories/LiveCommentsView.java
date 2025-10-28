package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper$$ExternalSyntheticLambda2;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.GradientClip;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public abstract class LiveCommentsView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private final Adapter adapter;
    public final ImageView arrowButton;
    private Bulletin.UndoButton bulletinButton;
    private Bulletin.TwoLineAnimatedLottieLayout bulletinLayout;
    private Runnable closeBulletin;
    private ValueAnimator collapseAnimator;
    private boolean collapsed;
    private final int currentAccount;
    private long dialogId;
    private final GradientClip gradientClip;
    private boolean hasTopMessages;
    private TLRPC.InputGroupCall inputCall;
    private float keyboardOffset;
    private final LinearLayoutManager layoutManager;
    public final RecyclerListView listView;
    private long localStars;
    public int maxReadId;
    private final ArrayList messages;
    private Runnable pollStarsRunnable;
    private Runnable removeTopSendersRunnable;
    private boolean sentStars;
    private final LinearGradient shadowGradient;
    private final Matrix shadowGradientMatrix;
    private final Paint shadowGradientPaint;
    private Bulletin starsBulletin;
    private Bulletin.TimerView timerView;
    private final TopAdapter topAdapter;
    private final FrameLayout topBulletinContainer;
    private ArrayList topDonors;
    private final LinearLayoutManager topLayoutManager;
    public final RecyclerListView topListView;
    private final ArrayList topMessages;
    private long totalStars;
    private final AnimatedFloat unfold;

    public static class Message {
        public int date;
        public long dialogId;
        public int id;
        public boolean isReaction;
        public long stars;
        public TLRPC.TL_textWithEntities text;
    }

    public static void lambda$new$6() {
    }

    public static void lambda$new$7() {
    }

    public static void lambda$new$8() {
    }

    public static void lambda$new$9() {
    }

    protected abstract void onMessagesCountUpdated();

    protected abstract void onStarsButtonCancelled();

    protected abstract void onStarsButtonPressed(long j, boolean z);

    protected abstract void onStarsCountUpdated();

    public static class TopSender {
        public long dialogId;
        private long max_stars;
        public ArrayList messages = new ArrayList();

        public int getStars() {
            return getStars(ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime());
        }

        public int getStars(int i) {
            Iterator it = this.messages.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Message message = (Message) it.next();
                long j = message.stars;
                if (j > 0 && i - message.date <= HighlightMessageSheet.getTierOption((int) j, HighlightMessageSheet.TIER_PERIOD)) {
                    i2 += (int) message.stars;
                }
            }
            this.max_stars = Math.max(this.max_stars, i2);
            return i2;
        }

        public float getProgress() {
            return getProgress(ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime());
        }

        public float getProgress(int i) {
            Iterator it = this.messages.iterator();
            int i2 = 0;
            int i3 = i;
            while (it.hasNext()) {
                Message message = (Message) it.next();
                if (message.stars > 0) {
                    i3 = Math.min(i3, message.date);
                    i2 = Math.max(i2, message.date + HighlightMessageSheet.getTierOption((int) message.stars, HighlightMessageSheet.TIER_PERIOD));
                }
            }
            return AndroidUtilities.ilerp(i, i2, i3);
        }

        public int expiresAfter(int i) {
            Iterator it = this.messages.iterator();
            int i2 = i;
            int i3 = 0;
            while (it.hasNext()) {
                Message message = (Message) it.next();
                if (message.stars > 0) {
                    i2 = Math.min(i2, message.date);
                    i3 = Math.max(i3, message.date + HighlightMessageSheet.getTierOption((int) message.stars, HighlightMessageSheet.TIER_PERIOD));
                }
            }
            return Math.max(0, i3 - i);
        }

        public boolean isExpired(int i) {
            Iterator it = this.messages.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                long j = message.stars;
                if (j > 0 && i - message.date <= HighlightMessageSheet.getTierOption((int) j, HighlightMessageSheet.TIER_PERIOD)) {
                    return false;
                }
            }
            return true;
        }
    }

    public void lambda$scheduleRemovingTopSenders$0() {
        Runnable runnable = this.removeTopSendersRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.removeTopSendersRunnable = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        for (int size = this.topMessages.size() - 1; size >= 0; size--) {
            if (((TopSender) this.topMessages.get(size)).isExpired(currentTime)) {
                this.topMessages.remove(size);
                this.topAdapter.notifyItemRemoved(size);
            }
        }
        updateTopMessages(true);
        scheduleRemovingTopSenders();
    }

    private void scheduleRemovingTopSenders() {
        Runnable runnable = this.removeTopSendersRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.removeTopSendersRunnable = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        Iterator it = this.topMessages.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            j = Math.min(j, ((TopSender) it.next()).expiresAfter(currentTime) * 1000);
        }
        if (j >= Long.MAX_VALUE) {
            return;
        }
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                LiveCommentsView.this.lambda$scheduleRemovingTopSenders$0();
            }
        };
        this.removeTopSendersRunnable = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, j);
    }

    public LiveCommentsView(Context context, final ViewGroup viewGroup, FrameLayout frameLayout) {
        super(context);
        this.messages = new ArrayList();
        this.topMessages = new ArrayList();
        this.shadowGradientPaint = new Paint(1);
        this.shadowGradient = new LinearGradient(0.0f, -255.0f, 0.0f, 0.0f, new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.shadowGradientMatrix = new Matrix();
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.unfold = new AnimatedFloat(this, 420L, cubicBezierInterpolator);
        this.gradientClip = new GradientClip();
        this.currentAccount = UserConfig.selectedAccount;
        this.topDonors = new ArrayList();
        this.pollStarsRunnable = new Runnable() {
            @Override
            public final void run() {
                LiveCommentsView.this.lambda$new$12();
            }
        };
        this.closeBulletin = new Runnable() {
            @Override
            public final void run() {
                LiveCommentsView.this.lambda$new$15();
            }
        };
        this.collapsed = false;
        this.topBulletinContainer = frameLayout;
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public void invalidate() {
                super.invalidate();
                LiveCommentsView.this.invalidate();
            }

            public int getMaxVisibleId() {
                if (LiveCommentsView.this.collapsed) {
                    return 0;
                }
                for (int i = 0; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    if (childAt instanceof LiveCommentView) {
                        LiveCommentView liveCommentView = (LiveCommentView) childAt;
                        if (liveCommentView.message != null) {
                            return liveCommentView.message.id;
                        }
                    }
                }
                return 0;
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                int maxVisibleId = getMaxVisibleId();
                LiveCommentsView liveCommentsView = LiveCommentsView.this;
                if (maxVisibleId > liveCommentsView.maxReadId) {
                    liveCommentsView.maxReadId = maxVisibleId;
                    liveCommentsView.onMessagesCountUpdated();
                }
                super.dispatchDraw(canvas);
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setWillNotDraw(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, true);
        this.layoutManager = linearLayoutManager;
        recyclerListView.setLayoutManager(linearLayoutManager);
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        recyclerListView.setAdapter(adapter);
        recyclerListView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
        recyclerListView.setClipToPadding(false);
        addView(recyclerListView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 34.0f));
        recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i) {
                boolean lambda$new$4;
                lambda$new$4 = LiveCommentsView.this.lambda$new$4(viewGroup, view, i);
                return lambda$new$4;
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            protected float animateByScale(View view) {
                return 0.5f;
            }

            @Override
            public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onMoveAnimationUpdate(viewHolder);
                LiveCommentsView.this.listView.invalidate();
            }

            @Override
            public void onAddAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onAddAnimationUpdate(viewHolder);
                LiveCommentsView.this.listView.invalidate();
            }
        };
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(cubicBezierInterpolator);
        defaultItemAnimator.setDurations(300L);
        recyclerListView.setItemAnimator(defaultItemAnimator);
        ImageView imageView = new ImageView(context);
        this.arrowButton = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(Theme.createSelectorDrawable(1090519039));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LiveCommentsView.this.lambda$new$5(view);
            }
        });
        RecyclerListView recyclerListView2 = new RecyclerListView(context);
        this.topListView = recyclerListView2;
        recyclerListView2.setWillNotDraw(false);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(context, 0, false);
        this.topLayoutManager = linearLayoutManager2;
        recyclerListView2.setLayoutManager(linearLayoutManager2);
        TopAdapter topAdapter = new TopAdapter();
        this.topAdapter = topAdapter;
        recyclerListView2.setAdapter(topAdapter);
        recyclerListView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        recyclerListView2.setClipToPadding(false);
        addView(recyclerListView2, LayoutHelper.createFrame(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        recyclerListView2.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i) {
                boolean lambda$new$10;
                lambda$new$10 = LiveCommentsView.lambda$new$10(viewGroup, view, i);
                return lambda$new$10;
            }
        });
        DefaultItemAnimator defaultItemAnimator2 = new DefaultItemAnimator() {
            @Override
            protected float animateByScale(View view) {
                return 0.5f;
            }
        };
        defaultItemAnimator2.setSupportsChangeAnimations(false);
        defaultItemAnimator2.setDelayAnimations(false);
        defaultItemAnimator2.setInterpolator(cubicBezierInterpolator);
        defaultItemAnimator2.setDurations(350L);
        recyclerListView2.setItemAnimator(defaultItemAnimator2);
        updateTopMessages(false);
    }

    public boolean lambda$new$4(ViewGroup viewGroup, View view, int i) {
        final LiveCommentView liveCommentView = (LiveCommentView) view;
        final Message message = liveCommentView.message;
        ItemOptions makeOptions = ItemOptions.makeOptions(viewGroup, new DarkThemeResourceProvider(), view);
        makeOptions.addText("Sent " + LocaleController.formatDateTime(message.date, true), 15);
        makeOptions.addGap();
        makeOptions.add(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                LiveCommentsView.this.lambda$new$1(liveCommentView);
            }
        });
        makeOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
            @Override
            public final void run() {
                LiveCommentsView.this.lambda$new$3(message);
            }
        });
        makeOptions.setBlur(true);
        makeOptions.show();
        return true;
    }

    public void lambda$new$1(LiveCommentView liveCommentView) {
        AndroidUtilities.addToClipboard(liveCommentView.text);
        if (AndroidUtilities.shouldShowClipboardToast()) {
            Toast.makeText(getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
        }
    }

    public void lambda$new$3(final Message message) {
        openDeleteMessage(getContext(), message.dialogId, new Utilities.Callback3() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3) {
                LiveCommentsView.this.lambda$new$2(message, (Boolean) obj, (Boolean) obj2, (Boolean) obj3);
            }
        });
    }

    public void lambda$new$2(Message message, Boolean bool, Boolean bool2, Boolean bool3) {
        if (bool2.booleanValue()) {
            TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
            deletegroupcallparticipantmessages.call = this.inputCall;
            deletegroupcallparticipantmessages.participant = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletegroupcallparticipantmessages, null);
            deleteAllFrom(message.dialogId);
        } else {
            TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
            deletegroupcallmessages.call = this.inputCall;
            deletegroupcallmessages.messages.add(Integer.valueOf(message.id));
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletegroupcallmessages, null);
            delete(message.id);
        }
        if (bool3.booleanValue()) {
            MessagesController.getInstance(this.currentAccount).blockPeer(this.dialogId);
        }
    }

    public void lambda$new$5(View view) {
        setCollapsed(!this.collapsed, true);
    }

    public static boolean lambda$new$10(ViewGroup viewGroup, View view, int i) {
        ItemOptions makeOptions = ItemOptions.makeOptions(viewGroup, new DarkThemeResourceProvider(), view);
        makeOptions.add(R.drawable.input_reply, LocaleController.getString(R.string.Reply), new Runnable() {
            @Override
            public final void run() {
                LiveCommentsView.lambda$new$6();
            }
        });
        makeOptions.add(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                LiveCommentsView.lambda$new$7();
            }
        });
        makeOptions.add(R.drawable.msg_report, LocaleController.getString(R.string.Report2), new Runnable() {
            @Override
            public final void run() {
                LiveCommentsView.lambda$new$8();
            }
        });
        makeOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
            @Override
            public final void run() {
                LiveCommentsView.lambda$new$9();
            }
        });
        makeOptions.setBlur(true);
        makeOptions.show();
        return true;
    }

    private int getListViewTop() {
        int height = this.listView.getHeight();
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            height = Math.min(this.listView.getChildAt(i).getTop(), height);
        }
        return this.listView.getHeight() - height;
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        RecyclerListView recyclerListView = this.listView;
        if (view != recyclerListView) {
            return super.drawChild(canvas, view, j);
        }
        if (recyclerListView.getAlpha() <= 0.0f) {
            return true;
        }
        float y = this.listView.getY();
        float f = this.keyboardOffset;
        float f2 = y + f;
        if (f <= 0.0f) {
            this.shadowGradientMatrix.reset();
            this.shadowGradientMatrix.postScale(1.0f, (this.listView.getMeasuredHeight() / 2.0f) / 255.0f);
            this.shadowGradientMatrix.postTranslate(0.0f, getHeight());
            this.shadowGradient.setLocalMatrix(this.shadowGradientMatrix);
            this.shadowGradientPaint.setShader(this.shadowGradient);
            this.shadowGradientPaint.setAlpha((int) (this.listView.getAlpha() * 89.25f));
            canvas.drawRect(0.0f, getHeight() - (this.listView.getMeasuredHeight() / 2.0f), getWidth(), getHeight(), this.shadowGradientPaint);
        }
        canvas.saveLayerAlpha(this.listView.getX(), this.listView.getY(), this.listView.getWidth() + this.listView.getX(), this.listView.getHeight() + this.listView.getY(), 255, 31);
        canvas.save();
        canvas.translate(0.0f, (1.0f - this.listView.getAlpha()) * Math.min((this.listView.getY() + this.listView.getHeight()) - f2, getListViewTop()));
        canvas.clipRect(0.0f, f2, getWidth(), getHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, f2, getWidth(), AndroidUtilities.dp(12.0f) + f2);
        this.gradientClip.draw(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, (this.listView.getY() + this.listView.getHeight()) - AndroidUtilities.dp(12.0f), getWidth(), this.listView.getBottom() + this.listView.getHeight());
        this.gradientClip.draw(canvas, rectF, 3, 1.0f);
        canvas.restore();
        return drawChild;
    }

    private void updateTopMessages(boolean z) {
        if (z && this.hasTopMessages == (!this.topMessages.isEmpty())) {
            return;
        }
        boolean isEmpty = this.topMessages.isEmpty();
        this.hasTopMessages = !isEmpty;
        if (z) {
            ViewPropertyAnimator translationY = this.listView.animate().translationY(this.hasTopMessages ? 0.0f : AndroidUtilities.dp(35.0f));
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            translationY.setInterpolator(cubicBezierInterpolator).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LiveCommentsView.this.lambda$updateTopMessages$11(valueAnimator);
                }
            }).setDuration(420L).start();
            this.topListView.animate().translationY(this.hasTopMessages ? 0.0f : AndroidUtilities.dp(35.0f)).alpha(this.hasTopMessages ? 1.0f : 0.0f).setInterpolator(cubicBezierInterpolator).setDuration(420L).start();
            return;
        }
        this.listView.setTranslationY(!isEmpty ? 0.0f : AndroidUtilities.dp(35.0f));
        this.topListView.setTranslationY(this.hasTopMessages ? 0.0f : AndroidUtilities.dp(35.0f));
        this.topListView.setAlpha(this.hasTopMessages ? 1.0f : 0.0f);
        invalidate();
    }

    public void lambda$updateTopMessages$11(ValueAnimator valueAnimator) {
        invalidate();
    }

    public void setKeyboardOffset(float f) {
        this.keyboardOffset = f;
        setTranslationY(-f);
        invalidate();
    }

    public void clear() {
        this.messages.clear();
        this.adapter.notifyDataSetChanged();
    }

    public boolean setup(long j, TLRPC.InputGroupCall inputGroupCall) {
        boolean z;
        TLRPC.InputGroupCall inputGroupCall2 = this.inputCall;
        if ((inputGroupCall2 == null ? 0L : inputGroupCall2.id) != (inputGroupCall != null ? inputGroupCall.id : 0L)) {
            clear();
            z = true;
        } else {
            z = false;
        }
        if (this.inputCall != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        this.dialogId = j;
        this.inputCall = inputGroupCall;
        if (inputGroupCall != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        if (z) {
            this.closeBulletin.run();
            this.pollStarsRunnable.run();
        }
        return z;
    }

    public void lambda$new$12() {
        if (this.inputCall == null) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.pollStarsRunnable);
        final TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
        getgroupcallstars.call = this.inputCall;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(getgroupcallstars, new BotForumHelper$$ExternalSyntheticLambda2(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                LiveCommentsView.this.lambda$pollStars$13(getgroupcallstars, (TL_phone.groupCallStars) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public void lambda$pollStars$13(TL_phone.getGroupCallStars getgroupcallstars, TL_phone.groupCallStars groupcallstars, TLRPC.TL_error tL_error) {
        boolean z;
        TLRPC.InputGroupCall inputGroupCall = this.inputCall;
        if (inputGroupCall == null || inputGroupCall.id != getgroupcallstars.call.id) {
            return;
        }
        if (groupcallstars != null) {
            MessagesController.getInstance(this.currentAccount).putUsers(groupcallstars.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(groupcallstars.chats, false);
            int i = 0;
            while (true) {
                if (i >= groupcallstars.top_donors.size()) {
                    break;
                }
                if (!groupcallstars.top_donors.get(i).my) {
                    i++;
                } else if (groupcallstars.top_donors.get(i).stars > 0) {
                    z = true;
                }
            }
            z = false;
            long j = groupcallstars.total_stars;
            boolean z2 = (j == this.totalStars && this.sentStars == z) ? false : true;
            this.totalStars = j;
            this.topDonors = groupcallstars.top_donors;
            this.sentStars = z;
            if (z2) {
                onStarsCountUpdated();
            }
        }
        AndroidUtilities.cancelRunOnUIThread(this.pollStarsRunnable);
        AndroidUtilities.runOnUIThread(this.pollStarsRunnable, 5000L);
    }

    public LiveCommentView findComment(int i) {
        for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
            View childAt = this.listView.getChildAt(i2);
            if (childAt instanceof LiveCommentView) {
                LiveCommentView liveCommentView = (LiveCommentView) childAt;
                if (liveCommentView.message != null && liveCommentView.message.id == i) {
                    return liveCommentView;
                }
            }
        }
        return null;
    }

    public void sendStars(long j, boolean z) {
        Bulletin bulletin = this.starsBulletin;
        if (bulletin == null || !bulletin.isShowing()) {
            DarkThemeResourceProvider darkThemeResourceProvider = new DarkThemeResourceProvider();
            Bulletin.TwoLineAnimatedLottieLayout twoLineAnimatedLottieLayout = new Bulletin.TwoLineAnimatedLottieLayout(getContext(), darkThemeResourceProvider);
            this.bulletinLayout = twoLineAnimatedLottieLayout;
            twoLineAnimatedLottieLayout.setAnimation(R.raw.stars_topup, new String[0]);
            this.bulletinLayout.titleTextView.setText(getStarsToastTitle());
            Bulletin.UndoButton undoButton = new Bulletin.UndoButton(getContext(), true, false, darkThemeResourceProvider);
            this.bulletinButton = undoButton;
            undoButton.setText(LocaleController.getString(R.string.StarsSentUndo));
            this.bulletinButton.setUndoAction(new Runnable() {
                @Override
                public final void run() {
                    LiveCommentsView.this.cancelStars();
                }
            });
            Bulletin.TimerView timerView = new Bulletin.TimerView(getContext(), darkThemeResourceProvider);
            this.timerView = timerView;
            timerView.timeLeft = 5000L;
            timerView.setColor(Theme.getColor(Theme.key_undo_cancelColor, darkThemeResourceProvider));
            this.bulletinButton.addView(this.timerView, LayoutHelper.createFrame(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.bulletinButton.undoTextView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.bulletinLayout.setButton(this.bulletinButton);
            Bulletin create = BulletinFactory.of(this.topBulletinContainer, darkThemeResourceProvider).create(this.bulletinLayout, -1);
            this.starsBulletin = create;
            create.hideAfterBottomSheet = false;
            create.show(true);
            this.starsBulletin.setOnHideListener(this.closeBulletin);
        }
        this.localStars += j;
        this.bulletinLayout.titleTextView.setText(getStarsToastTitle());
        this.bulletinLayout.subtitleTextView.setText(getStarsToastSubtitle());
        this.timerView.timeLeft = 5000L;
        AndroidUtilities.cancelRunOnUIThread(this.closeBulletin);
        AndroidUtilities.runOnUIThread(this.closeBulletin, 5000L);
        onStarsButtonPressed(this.localStars, z);
        onStarsCountUpdated();
    }

    public void openStarsSheet() {
        this.closeBulletin.run();
        ArrayList arrayList = new ArrayList();
        if (this.topDonors != null) {
            for (int i = 0; i < this.topDonors.size(); i++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.topDonors.get(i);
                TLRPC.TL_messageReactor tL_messageReactor = new TLRPC.TL_messageReactor();
                tL_messageReactor.anonymous = groupcalldonor.anonymous;
                tL_messageReactor.my = groupcalldonor.my;
                tL_messageReactor.count = (int) groupcalldonor.stars;
                tL_messageReactor.peer_id = groupcalldonor.peer_id;
                arrayList.add(tL_messageReactor);
            }
        }
        StarsReactionsSheet starsReactionsSheet = new StarsReactionsSheet(getContext(), this.currentAccount, this.dialogId, null, null, arrayList, true, true, new DarkThemeResourceProvider() {
            @Override
            public void appendColors() {
                this.sparseIntArray.put(Theme.key_divider, 352321535);
            }
        });
        starsReactionsSheet.setLiveCommentsView(this);
        starsReactionsSheet.setOnSend(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                Integer lambda$openStarsSheet$14;
                lambda$openStarsSheet$14 = LiveCommentsView.this.lambda$openStarsSheet$14((Long) obj, (Long) obj2);
                return lambda$openStarsSheet$14;
            }
        });
        starsReactionsSheet.show();
    }

    public Integer lambda$openStarsSheet$14(Long l, Long l2) {
        this.closeBulletin.run();
        this.localStars = l2.longValue();
        Bulletin createSimpleBulletin = BulletinFactory.of(this.topBulletinContainer, new DarkThemeResourceProvider()).createSimpleBulletin(R.raw.stars_topup, getStarsToastTitle(), getStarsToastSubtitle());
        createSimpleBulletin.hideAfterBottomSheet = false;
        createSimpleBulletin.show(true);
        this.localStars = 0L;
        this.sentStars = true;
        return Integer.valueOf(send(new TLRPC.TL_textWithEntities(), l2.longValue()));
    }

    public void lambda$new$15() {
        AndroidUtilities.cancelRunOnUIThread(this.closeBulletin);
        Bulletin bulletin = this.starsBulletin;
        if (bulletin != null) {
            bulletin.hide();
            this.starsBulletin = null;
        }
        long j = this.localStars;
        if (j > 0) {
            this.localStars = 0L;
            this.sentStars = true;
            send(new TLRPC.TL_textWithEntities(), j);
            return;
        }
        onStarsCountUpdated();
    }

    public void cancelStars() {
        this.localStars = 0L;
        onStarsButtonCancelled();
        onStarsCountUpdated();
    }

    private String getStarsToastTitle() {
        return LocaleController.getString(R.string.StarsSentTitle);
    }

    private CharSequence getStarsToastSubtitle() {
        return AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("PaidMessageSentSubtitle", Math.max(0, (int) this.localStars)));
    }

    public boolean isCollapsed() {
        return this.collapsed;
    }

    public void setCollapsed(final boolean z, boolean z2) {
        if (z2 && this.collapsed == z) {
            return;
        }
        this.collapsed = z;
        ValueAnimator valueAnimator = this.collapseAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.collapseAnimator = null;
        }
        this.listView.invalidate();
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.listView.getAlpha(), z ? 0.0f : 1.0f);
            this.collapseAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    LiveCommentsView.this.lambda$setCollapsed$16(valueAnimator2);
                }
            });
            this.collapseAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    LiveCommentsView.this.listView.setAlpha(z ? 0.0f : 1.0f);
                    LiveCommentsView.this.invalidate();
                }
            });
            this.collapseAnimator.setDuration(420L);
            this.collapseAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.collapseAnimator.start();
        } else {
            this.listView.setAlpha(z ? 0.0f : 1.0f);
        }
        invalidate();
    }

    public void lambda$setCollapsed$16(ValueAnimator valueAnimator) {
        this.listView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        invalidate();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.liveStoryMessageUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            TLObject tLObject = (TLObject) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (tLObject instanceof TLRPC.TL_updateGroupCallMessage) {
                TLRPC.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TLRPC.TL_updateGroupCallMessage) tLObject;
                TLRPC.InputGroupCall inputGroupCall = this.inputCall;
                if (inputGroupCall == null || inputGroupCall.id != longValue) {
                    return;
                }
                TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                int i3 = groupCallMessage.date;
                int i4 = groupCallMessage.id;
                long peerDialogId = DialogObject.getPeerDialogId(groupCallMessage.from_id);
                TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                push(i3, i4, peerDialogId, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
                return;
            }
            if (tLObject instanceof TLRPC.TL_updateDeleteGroupCallMessages) {
                TLRPC.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TLRPC.TL_updateDeleteGroupCallMessages) tLObject;
                TLRPC.InputGroupCall inputGroupCall2 = this.inputCall;
                if (inputGroupCall2 == null || inputGroupCall2.id != longValue) {
                    return;
                }
                Iterator<Integer> it = tL_updateDeleteGroupCallMessages.messages.iterator();
                while (it.hasNext()) {
                    delete(it.next().intValue());
                }
            }
        }
    }

    public void delete(int i) {
        Message message;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= this.messages.size()) {
                i3 = -1;
                message = null;
                break;
            } else {
                if (((Message) this.messages.get(i3)).id == i) {
                    message = (Message) this.messages.get(i3);
                    break;
                }
                i3++;
            }
        }
        if (message == null) {
            return;
        }
        while (true) {
            if (i2 >= this.topMessages.size()) {
                break;
            }
            if (((TopSender) this.topMessages.get(i2)).messages.contains(message)) {
                ((TopSender) this.topMessages.get(i2)).messages.remove(message);
                if (((TopSender) this.topMessages.get(i2)).messages.isEmpty()) {
                    this.topMessages.remove(i2);
                    this.topAdapter.notifyItemRemoved(i2);
                } else {
                    scheduleRemovingTopSenders();
                }
            } else {
                i2++;
            }
        }
        this.messages.remove(i3);
        this.adapter.notifyItemRemoved(i3);
    }

    public void deleteAllFrom(long j) {
        int i = 0;
        while (i < this.messages.size()) {
            if (((Message) this.messages.get(i)).dialogId == j) {
                Message message = (Message) this.messages.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 >= this.topMessages.size()) {
                        break;
                    }
                    if (((TopSender) this.topMessages.get(i2)).messages.contains(message)) {
                        ((TopSender) this.topMessages.get(i2)).messages.remove(message);
                        if (((TopSender) this.topMessages.get(i2)).messages.isEmpty()) {
                            this.topMessages.remove(i2);
                            this.topAdapter.notifyItemRemoved(i2);
                        } else {
                            scheduleRemovingTopSenders();
                        }
                    } else {
                        i2++;
                    }
                }
                this.messages.remove(i);
                this.adapter.notifyItemRemoved(i);
                i--;
            }
            i++;
        }
    }

    public int send(TLRPC.TL_textWithEntities tL_textWithEntities, long j) {
        TL_phone.groupCallDonor groupcalldonor;
        long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        final int newMessageId = UserConfig.getInstance(this.currentAccount).getNewMessageId();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.inputCall;
        sendgroupcallmessage.message = tL_textWithEntities;
        if (j > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j;
        }
        sendgroupcallmessage.random_id = Utilities.random.nextLong();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(sendgroupcallmessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LiveCommentsView.this.lambda$send$17(sendgroupcallmessage, newMessageId, tLObject, tL_error);
            }
        });
        if (this.topDonors != null) {
            int i = 0;
            while (true) {
                if (i >= this.topDonors.size()) {
                    groupcalldonor = null;
                    break;
                }
                if (((TL_phone.groupCallDonor) this.topDonors.get(i)).my) {
                    groupcalldonor = (TL_phone.groupCallDonor) this.topDonors.get(i);
                    break;
                }
                i++;
            }
            if (groupcalldonor != null) {
                groupcalldonor.stars += j;
            } else {
                TL_phone.groupCallDonor groupcalldonor2 = new TL_phone.groupCallDonor();
                groupcalldonor2.my = true;
                groupcalldonor2.anonymous = false;
                groupcalldonor2.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(clientUserId);
                groupcalldonor2.stars = j;
                this.topDonors.add(groupcalldonor2);
            }
        }
        push(ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime(), newMessageId, clientUserId, tL_textWithEntities, j, false);
        setCollapsed(false, true);
        return newMessageId;
    }

    public void lambda$send$17(TL_phone.sendGroupCallMessage sendgroupcallmessage, int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            Iterator it = MessagesController.findUpdatesAndRemove(updates, TLRPC.TL_updateMessageID.class).iterator();
            while (it.hasNext()) {
                TLRPC.TL_updateMessageID tL_updateMessageID = (TLRPC.TL_updateMessageID) it.next();
                if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                    updateMessageId(i, tL_updateMessageID.id);
                }
            }
            MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
        }
    }

    private void updateMessageId(int i, int i2) {
        Iterator it = this.messages.iterator();
        while (it.hasNext()) {
            Message message = (Message) it.next();
            if (message.id == i) {
                message.id = i2;
                return;
            }
        }
    }

    public int getMessagesCount() {
        return this.messages.size();
    }

    public int getUnreadMessagesCount() {
        int i = 0;
        for (int i2 = 0; i2 < this.messages.size(); i2++) {
            int i3 = ((Message) this.messages.get(i2)).id;
            if (i3 >= 0 && i3 > this.maxReadId) {
                i++;
            }
        }
        return i;
    }

    public long getStarsCount() {
        return this.totalStars + this.localStars;
    }

    public boolean areSendingStars() {
        return this.starsBulletin != null;
    }

    public void push(int i, int i2, long j, TLRPC.TL_textWithEntities tL_textWithEntities, long j2, boolean z) {
        int i3;
        TopSender topSender;
        for (int i4 = 0; i4 < this.messages.size(); i4++) {
            if (((Message) this.messages.get(i4)).id == i2) {
                return;
            }
        }
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        Message message = new Message();
        message.date = i;
        message.dialogId = j;
        message.text = tL_textWithEntities;
        message.stars = j2;
        message.id = i2;
        message.isReaction = TextUtils.isEmpty(tL_textWithEntities.text);
        long j3 = message.stars;
        if (j3 > 0 && currentTime - message.date <= HighlightMessageSheet.getTierOption((int) j3, HighlightMessageSheet.TIER_PERIOD)) {
            int i5 = 0;
            while (true) {
                if (i5 >= this.topMessages.size()) {
                    topSender = null;
                    break;
                } else {
                    if (((TopSender) this.topMessages.get(i5)).dialogId == j) {
                        topSender = (TopSender) this.topMessages.get(i5);
                        break;
                    }
                    i5++;
                }
            }
            if (topSender == null) {
                TopSender topSender2 = new TopSender();
                topSender2.dialogId = j;
                topSender2.messages.add(message);
                this.topMessages.add(0, topSender2);
                this.topAdapter.notifyItemInserted(0);
            } else {
                topSender.messages.add(message);
                this.topListView.invalidateViews();
            }
            updateTopMessages(true);
            scheduleRemovingTopSenders();
        }
        if (!z && message.isReaction) {
            long j4 = message.stars;
            if (j4 > 0) {
                this.totalStars += j4;
                onStarsCountUpdated();
            }
        }
        if (message.id >= 0) {
            for (int size = this.messages.size() - 1; size >= 0; size--) {
                if (message.id < ((Message) this.messages.get(size)).id) {
                    i3 = size + 1;
                    break;
                }
            }
        }
        i3 = 0;
        this.messages.add(i3, message);
        this.adapter.notifyItemInserted(i3);
        if (i3 <= 0 && !this.listView.canScrollVertically(1)) {
            this.layoutManager.scrollToPositionWithOffset(0, AndroidUtilities.dp(100.0f));
        }
        invalidate();
        onMessagesCountUpdated();
    }

    public class Adapter extends RecyclerListView.SelectionAdapter {
        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        private Adapter() {
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(new LiveCommentView(LiveCommentsView.this.getContext(), false));
        }

        @Override
        public int getItemCount() {
            return LiveCommentsView.this.messages.size();
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (i < 0 || i >= LiveCommentsView.this.messages.size()) {
                return;
            }
            ((LiveCommentView) viewHolder.itemView).set(LiveCommentsView.this.dialogId, (Message) LiveCommentsView.this.messages.get(i));
        }
    }

    public class TopAdapter extends RecyclerListView.SelectionAdapter {
        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        private TopAdapter() {
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(new LiveTopSenderView(LiveCommentsView.this.getContext()));
        }

        @Override
        public int getItemCount() {
            return LiveCommentsView.this.topMessages.size();
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (i < 0 || i >= LiveCommentsView.this.topMessages.size()) {
                return;
            }
            ((LiveTopSenderView) viewHolder.itemView).set((TopSender) LiveCommentsView.this.topMessages.get(i));
        }
    }

    public static class LiveCommentView extends LinearLayout implements ItemOptions.ScrimView {
        public final LinearLayout adminLayout;
        public final SpoilersTextView adminNameView;
        public final SpoilersTextView adminRoleView;
        public final AvatarDrawable avatarDrawable;
        public final BackupImageView avatarView;
        private final Paint backgroundPaint;
        private boolean drawParticles;
        private boolean drawStar;
        private final boolean filled;
        public final LinearLayout layout;
        private Message message;
        public final TextView smallStarsView;
        private final ColoredImageSpan[] smallStarsViewCache;
        public final TextView starsView;
        private final ColoredImageSpan[] starsViewCache;
        public CharSequence text;
        public final LinearLayout textLayout;
        public final SpoilersTextView textView;

        @Override
        public void getBounds(RectF rectF) {
            ItemOptions.ScrimView.CC.$default$getBounds(this, rectF);
        }

        public void setDrawStar(boolean z) {
            this.drawStar = z;
            ColoredImageSpan coloredImageSpan = this.starsViewCache[0];
            if (coloredImageSpan == null || coloredImageSpan.draw == z) {
                return;
            }
            coloredImageSpan.draw = z;
            this.starsView.invalidate();
        }

        public void getStarLocation(RectF rectF) {
            if (this.starsViewCache[0] == null || this.starsView.getLayout() == null) {
                return;
            }
            float x = this.starsView.getX() + this.starsView.getPaddingLeft() + this.starsViewCache[0].translateX;
            float y = this.starsView.getY() + this.starsView.getPaddingTop() + this.starsViewCache[0].translateY;
            rectF.set(x, y, r3.drawable.getBounds().width() + x, this.starsViewCache[0].drawable.getBounds().height() + y);
        }

        public LiveCommentView(Context context, boolean z) {
            super(context);
            this.drawParticles = false;
            this.drawStar = true;
            this.starsViewCache = new ColoredImageSpan[1];
            this.smallStarsViewCache = new ColoredImageSpan[1];
            this.backgroundPaint = new Paint(1);
            this.filled = z;
            setOrientation(0);
            LinearLayout linearLayout = new LinearLayout(context) {
                Path clipPath = new Path();
                StarsReactionsSheet.Particles particles;

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    if (LiveCommentView.this.drawParticles) {
                        this.clipPath.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        this.clipPath.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(this.clipPath);
                        if (this.particles == null) {
                            this.particles = new StarsReactionsSheet.Particles(1, 250);
                        }
                        this.particles.setBounds(0, 0, getWidth(), getHeight());
                        this.particles.setSpeed(30.0f);
                        this.particles.process();
                        this.particles.draw(canvas, -1, 0.85f);
                        invalidate();
                        canvas.restore();
                    }
                    super.dispatchDraw(canvas);
                }
            };
            this.layout = linearLayout;
            linearLayout.setOrientation(0);
            addView(linearLayout, LayoutHelper.createLinear(-2, -2, 51, 0.0f, 0.5f, 0.0f, 0.5f));
            this.avatarDrawable = new AvatarDrawable();
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(11.0f));
            linearLayout.addView(backupImageView, LayoutHelper.createLinear(22, 22, 0.0f, 51, 3, 2, 3, 2));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.textLayout = linearLayout2;
            linearLayout2.setOrientation(1);
            linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-2, -2, 1.0f, 51, 4, 3, 7, 3));
            LinearLayout linearLayout3 = new LinearLayout(context);
            this.adminLayout = linearLayout3;
            linearLayout3.setOrientation(0);
            linearLayout3.setVisibility(8);
            linearLayout2.addView(linearLayout3, LayoutHelper.createLinear(-2, -2));
            SpoilersTextView spoilersTextView = new SpoilersTextView(context);
            this.adminNameView = spoilersTextView;
            spoilersTextView.setTextColor(-1);
            spoilersTextView.setTextSize(1, 14.0f);
            spoilersTextView.setGravity(3);
            spoilersTextView.setTypeface(AndroidUtilities.bold());
            linearLayout3.addView(spoilersTextView, LayoutHelper.createLinear(-2, -2, 1.0f, 51, 0, 0, 16, 0));
            SpoilersTextView spoilersTextView2 = new SpoilersTextView(context);
            this.adminRoleView = spoilersTextView2;
            spoilersTextView2.setTextColor(Theme.multAlpha(-1, 0.55f));
            spoilersTextView2.setTextSize(1, 12.0f);
            spoilersTextView2.setGravity(5);
            linearLayout3.addView(spoilersTextView2, LayoutHelper.createLinear(-2, -2, 0.0f, 53, 0, 0, 0, 0));
            SpoilersTextView spoilersTextView3 = new SpoilersTextView(context);
            this.textView = spoilersTextView3;
            spoilersTextView3.setTextColor(-1);
            spoilersTextView3.setTextSize(1, 14.0f);
            spoilersTextView3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), Theme.multAlpha(-16777216, 0.6f));
            linearLayout2.addView(spoilersTextView3, LayoutHelper.createLinear(-2, -2));
            TextView textView = new TextView(context);
            this.starsView = textView;
            textView.setTextColor(-1);
            textView.setTextSize(1, 11.0f);
            textView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
            textView.setVisibility(8);
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, 16, 0.0f, 21, -3, 0, 6, 0));
            TextView textView2 = new TextView(context);
            this.smallStarsView = textView2;
            textView2.setTextColor(-1);
            textView2.setAlpha(0.65f);
            textView2.setTextSize(1, 11.0f);
            textView2.setVisibility(8);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 0.0f, 85, 0, 3, 10, 0));
        }

        public void set(long r18, org.telegram.ui.Stories.LiveCommentsView.Message r20) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.LiveCommentsView.LiveCommentView.set(long, org.telegram.ui.Stories.LiveCommentsView$Message):void");
        }

        public static int lambda$set$0(Pair pair, Pair pair2) {
            return ((Integer) pair.first).intValue() - ((Integer) pair2.first).intValue();
        }

        public static final class AlphaSpan extends CharacterStyle {
            private final float alpha;

            public AlphaSpan(float f) {
                this.alpha = f;
            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                textPaint.setAlpha((int) (this.alpha * textPaint.getAlpha()));
            }
        }

        @Override
        public void drawScrim(Canvas canvas, float f) {
            if (this.layout.getBackground() == null) {
                this.backgroundPaint.setColor(Theme.multAlpha(-16777216, f * 0.35f));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.layout.getX(), this.layout.getY(), this.layout.getX() + this.layout.getWidth(), this.layout.getY() + this.layout.getHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.backgroundPaint);
            }
            draw(canvas);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            setPivotX(0.0f);
            setPivotY(getMeasuredHeight());
        }
    }

    public static class LiveTopSenderView extends FrameLayout {
        public final AvatarDrawable avatarDrawable;
        public final BackupImageView avatarView;
        public final LinearLayout layout;
        private TopSender sender;
        public final SpoilersTextView textView;

        public LiveTopSenderView(Context context) {
            super(context);
            LinearLayout linearLayout = new LinearLayout(context) {
                StarsReactionsSheet.Particles particles;
                final Path clipPath = new Path();
                final Paint fillPaint = new Paint(1);
                final AnimatedFloat animatedProgress = new AnimatedFloat(this, 0, 1000, new LinearInterpolator());

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    this.clipPath.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    this.clipPath.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(this.clipPath);
                    if (LiveTopSenderView.this.sender != null) {
                        int tierOption = HighlightMessageSheet.getTierOption(LiveTopSenderView.this.sender.getStars(), HighlightMessageSheet.TIER_COLOR1);
                        int tierOption2 = HighlightMessageSheet.getTierOption(LiveTopSenderView.this.sender.getStars(), HighlightMessageSheet.TIER_COLOR_BACKGROUND);
                        canvas.drawColor(tierOption);
                        float f = this.animatedProgress.set(LiveTopSenderView.this.sender.getProgress());
                        this.fillPaint.setColor(tierOption2);
                        this.fillPaint.setAlpha(127);
                        canvas.drawRect(getWidth() * f, 0.0f, getWidth(), getHeight(), this.fillPaint);
                    }
                    if (this.particles == null) {
                        this.particles = new StarsReactionsSheet.Particles(1, 250);
                    }
                    this.particles.setBounds(0, 0, getWidth(), getHeight());
                    this.particles.setSpeed(30.0f);
                    this.particles.process();
                    this.particles.draw(canvas, -1, 0.85f);
                    invalidate();
                    canvas.restore();
                    super.dispatchDraw(canvas);
                }
            };
            this.layout = linearLayout;
            linearLayout.setOrientation(0);
            addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
            this.avatarDrawable = new AvatarDrawable();
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(11.0f));
            linearLayout.addView(backupImageView, LayoutHelper.createLinear(22, 22, 0.0f, 51, 3, 2, 3, 2));
            SpoilersTextView spoilersTextView = new SpoilersTextView(context);
            this.textView = spoilersTextView;
            spoilersTextView.setTextColor(-1);
            spoilersTextView.setTextSize(1, 14.0f);
            spoilersTextView.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(spoilersTextView, LayoutHelper.createLinear(-2, -2, 16, 4, 0, 7, 0));
        }

        public void set(TopSender topSender) {
            this.sender = topSender;
            if (topSender.dialogId >= 0) {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(topSender.dialogId));
                this.avatarDrawable.setInfo(user);
                this.avatarView.setForUserOrChat(user, this.avatarDrawable);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-topSender.dialogId));
                this.avatarDrawable.setInfo(chat);
                this.avatarView.setForUserOrChat(chat, this.avatarDrawable);
            }
            this.textView.setText(DialogObject.getName(topSender.dialogId));
            this.layout.invalidate();
        }
    }

    public static void openDeleteMessage(Context context, long j, final Utilities.Callback3 callback3) {
        DarkThemeResourceProvider darkThemeResourceProvider = new DarkThemeResourceProvider() {
            @Override
            public void appendColors() {
                this.sparseIntArray.append(Theme.key_dialogBackground, -14671840);
            }
        };
        final BottomSheet bottomSheet = new BottomSheet(context, false, darkThemeResourceProvider);
        bottomSheet.fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, darkThemeResourceProvider));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText("Delete Message");
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 22.0f, 12.0f, 22.0f, 0.0f));
        HeaderCell headerCell = new HeaderCell(context, darkThemeResourceProvider);
        headerCell.setText("Additional actions");
        linearLayout.addView(headerCell, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 4.0f));
        final CheckBoxCell checkBoxCell = new CheckBoxCell(context, 4, 21, true, darkThemeResourceProvider);
        CheckBox2 checkBoxRound = checkBoxCell.getCheckBoxRound();
        int i = Theme.key_switch2TrackChecked;
        int i2 = Theme.key_radioBackground;
        int i3 = Theme.key_checkboxCheck;
        checkBoxRound.setColor(i, i2, i3);
        checkBoxCell.setText("Report Spam", null, false, true);
        checkBoxCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LiveCommentsView.lambda$openDeleteMessage$18(CheckBoxCell.this, view);
            }
        });
        int i4 = Theme.key_listSelector;
        checkBoxCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(i4, darkThemeResourceProvider), 2));
        linearLayout.addView(checkBoxCell, LayoutHelper.createLinear(-1, -2));
        final CheckBoxCell checkBoxCell2 = new CheckBoxCell(context, 4, 21, true, darkThemeResourceProvider);
        checkBoxCell2.getCheckBoxRound().setColor(i, i2, i3);
        checkBoxCell2.setText("Delete All from " + DialogObject.getName(j), null, false, true);
        checkBoxCell2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LiveCommentsView.lambda$openDeleteMessage$19(CheckBoxCell.this, view);
            }
        });
        checkBoxCell2.setBackground(Theme.createSelectorDrawable(Theme.getColor(i4, darkThemeResourceProvider), 2));
        linearLayout.addView(checkBoxCell2, LayoutHelper.createLinear(-1, -2));
        final CheckBoxCell checkBoxCell3 = new CheckBoxCell(context, 4, 21, true, darkThemeResourceProvider);
        checkBoxCell3.getCheckBoxRound().setColor(i, i2, i3);
        checkBoxCell3.setText("Ban " + DialogObject.getName(j), null, false, false);
        checkBoxCell3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LiveCommentsView.lambda$openDeleteMessage$20(CheckBoxCell.this, view);
            }
        });
        checkBoxCell3.setBackground(Theme.createSelectorDrawable(Theme.getColor(i4, darkThemeResourceProvider), 2));
        linearLayout.addView(checkBoxCell3, LayoutHelper.createLinear(-1, -2));
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, darkThemeResourceProvider);
        textInfoPrivacyCell.setBackgroundColor(-16777216);
        textInfoPrivacyCell.setFixedSize(12);
        linearLayout.addView(textInfoPrivacyCell, LayoutHelper.createLinear(-1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, darkThemeResourceProvider);
        buttonWithCounterView.setText("Proceed", false);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LiveCommentsView.lambda$openDeleteMessage$21(CheckBoxCell.this, checkBoxCell2, checkBoxCell3, callback3, bottomSheet, view);
            }
        });
        frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2));
        bottomSheet.setCustomView(linearLayout);
        bottomSheet.show();
    }

    public static void lambda$openDeleteMessage$18(CheckBoxCell checkBoxCell, View view) {
        checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
    }

    public static void lambda$openDeleteMessage$19(CheckBoxCell checkBoxCell, View view) {
        checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
    }

    public static void lambda$openDeleteMessage$20(CheckBoxCell checkBoxCell, View view) {
        checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
    }

    public static void lambda$openDeleteMessage$21(CheckBoxCell checkBoxCell, CheckBoxCell checkBoxCell2, CheckBoxCell checkBoxCell3, Utilities.Callback3 callback3, BottomSheet bottomSheet, View view) {
        callback3.run(Boolean.valueOf(checkBoxCell.isChecked()), Boolean.valueOf(checkBoxCell2.isChecked()), Boolean.valueOf(checkBoxCell3.isChecked()));
        bottomSheet.lambda$new$0();
    }
}
