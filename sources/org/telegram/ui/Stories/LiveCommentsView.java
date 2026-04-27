package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Pair;
import android.view.MotionEvent;
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
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
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
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.GradientClip;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public abstract class LiveCommentsView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private final UniversalAdapter adapter;
    private boolean allowTouches;
    public final ImageView arrowButton;
    private Bulletin.UndoButton bulletinButton;
    private Bulletin.TwoLineAnimatedLottieLayout bulletinLayout;
    private boolean callHighlight;
    private Runnable closeBulletin;
    private ValueAnimator collapseAnimator;
    private boolean collapsed;
    private final int currentAccount;
    private long dialogId;
    private final GradientClip gradientClip;
    private boolean hasTopMessages;
    private long highlightingDialog;
    private int highlightingMessageId;
    private TLRPC.InputGroupCall inputCall;
    private float keyboardFinalOffset;
    private float keyboardOffset;
    private float keyboardT;
    private long lastMinStars;
    private int lastNow;
    private final LinearLayoutManager layoutManager;
    public final RecyclerListView listView;
    private LivePlayer livePlayer;
    private long localStars;
    public int maxReadId;
    private final ArrayList messages;
    private Runnable pollStarsRunnable;
    private boolean polling;
    private Runnable removeTopSendersRunnable;
    private boolean sentStars;
    private final View shadowView;
    private Bulletin starsBulletin;
    private final StoryViewer storyViewer;
    private Bulletin.TimerView timerView;
    private final UniversalAdapter topAdapter;
    private final FrameLayout topBulletinContainer;
    private ArrayList topDonors;
    private final LinearLayoutManager topLayoutManager;
    public final RecyclerListView topListView;
    private final ArrayList topMessages;
    private final HashMap topPlaces;
    private long totalStars;
    private final Runnable updateAdapters;

    public static class Message {
        public int date;
        public long dialogId;
        public boolean fromAdmin;
        public int id;
        public boolean isReaction;
        public int place;
        public long stars;
        public TLRPC.TL_textWithEntities text;
    }

    protected TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    protected abstract boolean isMe(long j);

    protected abstract void onCancelledStarReaction(long j);

    protected abstract void onMessagesCountUpdated();

    protected abstract void onStarReaction(long j, int i, int i2);

    protected abstract void onStarsButtonCancelled();

    protected abstract void onStarsButtonPressed(long j, boolean z);

    protected abstract void onStarsCountUpdated();

    public static class TopSender {
        public int currentAccount;
        public long dialogId;
        public int lastSentDate;
        private long max_stars;
        public ArrayList messages = new ArrayList();
        public int place;

        public int getStars() {
            return getStars(ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
        }

        public int getStars(int i) {
            Iterator it = this.messages.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Message message = (Message) it.next();
                long j = message.stars;
                if (j > 0 && i - message.date <= HighlightMessageSheet.getTierOption(this.currentAccount, (int) j, HighlightMessageSheet.TIER_PERIOD)) {
                    i2 += (int) message.stars;
                }
            }
            this.max_stars = Math.max(this.max_stars, i2);
            return i2;
        }

        public float getProgress() {
            return getProgress(ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
        }

        public float getProgress(int i) {
            Iterator it = this.messages.iterator();
            int iMax = 0;
            int iMin = i;
            while (it.hasNext()) {
                Message message = (Message) it.next();
                if (message.stars > 0) {
                    iMin = Math.min(iMin, message.date);
                    iMax = Math.max(iMax, message.date + HighlightMessageSheet.getTierOption(this.currentAccount, (int) message.stars, HighlightMessageSheet.TIER_PERIOD));
                }
            }
            return AndroidUtilities.ilerp(i, iMax, iMin);
        }

        public int expiresAfter(int i) {
            Iterator it = this.messages.iterator();
            int iMin = i;
            int iMax = 0;
            while (it.hasNext()) {
                Message message = (Message) it.next();
                if (message.stars > 0) {
                    iMin = Math.min(iMin, message.date);
                    iMax = Math.max(iMax, message.date + HighlightMessageSheet.getTierOption(this.currentAccount, (int) message.stars, HighlightMessageSheet.TIER_PERIOD));
                }
            }
            return Math.max(0, iMax - i);
        }

        public boolean isExpired(int i) {
            Iterator it = this.messages.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                long j = message.stars;
                if (j > 0 && i - message.date <= HighlightMessageSheet.getTierOption(this.currentAccount, (int) j, HighlightMessageSheet.TIER_PERIOD)) {
                    return false;
                }
            }
            return true;
        }

        public void updateLastSentDate() {
            updateLastSentDate(ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
        }

        public void updateLastSentDate(int i) {
            Iterator it = this.messages.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                if (message.stars > 0) {
                    i = Math.min(i, message.date);
                }
            }
            this.lastSentDate = i;
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
            }
        }
        this.lastNow = currentTime;
        Collections.sort(this.topMessages, new LiveCommentsView$$ExternalSyntheticLambda0(this));
        this.topAdapter.update(true);
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
        long jMin = Long.MAX_VALUE;
        while (it.hasNext()) {
            jMin = Math.min(jMin, ((TopSender) it.next()).expiresAfter(currentTime) * 1000);
        }
        if (jMin >= Long.MAX_VALUE) {
            return;
        }
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$scheduleRemovingTopSenders$0();
            }
        };
        this.removeTopSendersRunnable = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, jMin);
    }

    public LiveCommentsView(Context context, final StoryViewer storyViewer, final ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.messages = new ArrayList();
        this.topMessages = new ArrayList();
        this.topPlaces = new HashMap();
        this.maxReadId = -1;
        this.allowTouches = true;
        this.gradientClip = new GradientClip();
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.topDonors = new ArrayList();
        this.pollStarsRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$9();
            }
        };
        this.closeBulletin = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$12();
            }
        };
        this.collapsed = false;
        this.updateAdapters = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$17();
            }
        };
        this.shadowView = view;
        this.storyViewer = storyViewer;
        this.topBulletinContainer = frameLayout;
        view.setAlpha(0.5f);
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public void invalidate() {
                super.invalidate();
                LiveCommentsView.this.invalidate();
            }

            @Override
            public Integer getSelectorColor(int i2) {
                return 0;
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (LiveCommentsView.this.isCollapsed()) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            public int getMaxVisibleId() {
                if (LiveCommentsView.this.collapsed) {
                    return -1;
                }
                for (int i2 = 0; i2 < getChildCount(); i2++) {
                    View childAt = getChildAt(i2);
                    if (childAt instanceof LiveCommentView) {
                        LiveCommentView liveCommentView = (LiveCommentView) childAt;
                        if (liveCommentView.message != null) {
                            return liveCommentView.message.id;
                        }
                    }
                }
                return -1;
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                int maxVisibleId = getMaxVisibleId();
                LiveCommentsView liveCommentsView = LiveCommentsView.this;
                if (maxVisibleId > liveCommentsView.maxReadId) {
                    liveCommentsView.maxReadId = maxVisibleId;
                    liveCommentsView.onMessagesCountUpdated();
                }
                super.dispatchDraw(canvas);
            }

            @Override
            protected void onMeasure(int i2, int i3) {
                int size = View.MeasureSpec.getSize(i2);
                View.MeasureSpec.getSize(i3);
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i3)));
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setWillNotDraw(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, true);
        this.layoutManager = linearLayoutManager;
        recyclerListView.setLayoutManager(linearLayoutManager);
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, context, i, 0, false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new DarkThemeResourceProvider()) {
            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                super.onBindViewHolder(viewHolder, i2);
                if (LiveCommentsView.this.callHighlight) {
                    View view2 = viewHolder.itemView;
                    if (view2 instanceof LiveCommentView) {
                        LiveCommentView liveCommentView = (LiveCommentView) view2;
                        if (liveCommentView.message == null || liveCommentView.message.id != LiveCommentsView.this.highlightingMessageId) {
                            return;
                        }
                        liveCommentView.highlight();
                        LiveCommentsView.this.callHighlight = false;
                    }
                }
            }

            @Override
            public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                super.onViewAttachedToWindow(viewHolder);
                if (LiveCommentsView.this.callHighlight) {
                    View view2 = viewHolder.itemView;
                    if (view2 instanceof LiveCommentView) {
                        LiveCommentView liveCommentView = (LiveCommentView) view2;
                        if (liveCommentView.message == null || liveCommentView.message.id != LiveCommentsView.this.highlightingMessageId) {
                            return;
                        }
                        liveCommentView.highlight();
                        LiveCommentsView.this.callHighlight = false;
                    }
                }
            }
        };
        this.adapter = universalAdapter;
        recyclerListView.setAdapter(universalAdapter);
        universalAdapter.setApplyBackground(false);
        recyclerListView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
        recyclerListView.setClipToPadding(false);
        addView(recyclerListView, LayoutHelper.createFrame(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view2, int i2) {
                this.f$0.lambda$new$5(viewGroup, storyViewer, view2, i2);
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            protected float animateByScale(View view2) {
                return 0.5f;
            }

            @Override
            protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onMoveAnimationUpdate(viewHolder);
                LiveCommentsView.this.listView.invalidate();
            }

            @Override
            protected void onAddAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onAddAnimationUpdate(viewHolder);
                LiveCommentsView.this.listView.invalidate();
            }
        };
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.setInterpolator(cubicBezierInterpolator);
        defaultItemAnimator.setDurations(280L);
        defaultItemAnimator.setDelayIncrement(14L);
        recyclerListView.setItemAnimator(defaultItemAnimator);
        ImageView imageView = new ImageView(context);
        this.arrowButton = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(Theme.createSelectorDrawable(1090519039));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$new$6(view2);
            }
        });
        RecyclerListView recyclerListView2 = new RecyclerListView(context) {
            @Override
            public Integer getSelectorColor(int i2) {
                return 0;
            }
        };
        this.topListView = recyclerListView2;
        recyclerListView2.setWillNotDraw(false);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(context, 0, false);
        this.topLayoutManager = linearLayoutManager2;
        recyclerListView2.setLayoutManager(linearLayoutManager2);
        UniversalAdapter universalAdapter2 = new UniversalAdapter(recyclerListView2, context, i, 0, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillTopItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, null);
        this.topAdapter = universalAdapter2;
        recyclerListView2.setAdapter(universalAdapter2);
        universalAdapter2.setApplyBackground(false);
        recyclerListView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        recyclerListView2.setClipToPadding(false);
        addView(recyclerListView2, LayoutHelper.createFrame(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        recyclerListView2.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view2, int i2) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view2, i2);
            }

            @Override
            public void onDoubleTap(View view2, int i2, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view2, i2, f, f2);
            }

            @Override
            public final void onItemClick(View view2, int i2, float f, float f2) {
                this.f$0.lambda$new$7(view2, i2, f, f2);
            }
        });
        DefaultItemAnimator defaultItemAnimator2 = new DefaultItemAnimator() {
            @Override
            protected float animateByScale(View view2) {
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

    public void lambda$new$5(ViewGroup viewGroup, final StoryViewer storyViewer, View view, int i) {
        final LiveCommentView liveCommentView = (LiveCommentView) view;
        final Message message = liveCommentView.message;
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(viewGroup, new DarkThemeResourceProvider(), view);
        boolean z = true;
        itemOptionsMakeOptions.addText(LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(message.date, true)), 15);
        itemOptionsMakeOptions.addGap();
        itemOptionsMakeOptions.add(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() {
            @Override
            public final void run() {
                LiveCommentsView.lambda$new$1(storyViewer, message);
            }
        });
        itemOptionsMakeOptions.addIf(!message.isReaction, R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$2(liveCommentView);
            }
        });
        if (this.dialogId != UserConfig.getInstance(this.currentAccount).getClientUserId() && !isAdmin()) {
            z = false;
        }
        itemOptionsMakeOptions.addIf(z, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$4(message);
            }
        });
        itemOptionsMakeOptions.show();
    }

    public static void lambda$new$1(StoryViewer storyViewer, Message message) {
        storyViewer.presentFragment(ProfileActivity.of(message.dialogId));
    }

    public void lambda$new$2(LiveCommentView liveCommentView) {
        AndroidUtilities.addToClipboard(liveCommentView.text);
        if (AndroidUtilities.shouldShowClipboardToast()) {
            Toast.makeText(getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
        }
    }

    public void lambda$new$4(final Message message) {
        if (isMe(message.dialogId)) {
            TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
            deletegroupcallmessages.call = this.inputCall;
            deletegroupcallmessages.messages.add(Integer.valueOf(message.id));
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletegroupcallmessages, null);
            delete(message.id);
            return;
        }
        openDeleteMessage(getContext(), message.dialogId, new Utilities.Callback3() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3) {
                this.f$0.lambda$new$3(message, (Boolean) obj, (Boolean) obj2, (Boolean) obj3);
            }
        });
    }

    public void lambda$new$3(Message message, Boolean bool, Boolean bool2, Boolean bool3) {
        if (bool2.booleanValue()) {
            TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
            deletegroupcallparticipantmessages.call = this.inputCall;
            deletegroupcallparticipantmessages.participant = MessagesController.getInstance(this.currentAccount).getInputPeer(message.dialogId);
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
            if (this.dialogId >= 0) {
                MessagesController.getInstance(this.currentAccount).blockPeer(this.dialogId);
            } else {
                MessagesController.getInstance(this.currentAccount).deleteParticipantFromChat(-this.dialogId, MessagesController.getInstance(this.currentAccount).getInputPeer(message.dialogId), false, true);
            }
        }
    }

    public void lambda$new$6(View view) {
        setCollapsed(!this.collapsed, true);
    }

    public void lambda$new$7(View view, int i, float f, float f2) {
        int i2;
        int i3;
        Message message;
        int i4;
        TopSender topSender = ((LiveTopSenderView) view).sender;
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= topSender.messages.size()) {
                break;
            }
            Message message2 = (Message) topSender.messages.get(i6);
            long j = message2.stars;
            if (j > 0 && currentTime - message2.date <= HighlightMessageSheet.getTierOption(this.currentAccount, (int) j, HighlightMessageSheet.TIER_PERIOD)) {
                hashSet.add(Integer.valueOf(message2.id));
            }
            i6++;
        }
        LivePlayer livePlayer = this.livePlayer;
        long sendPaidMessagesStars = livePlayer != null ? livePlayer.getSendPaidMessagesStars() : 0L;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i2 = -1;
            if (i7 >= this.messages.size()) {
                i3 = -1;
                break;
            }
            message = (Message) this.messages.get(i7);
            if (message.fromAdmin || !message.isReaction || message.stars >= sendPaidMessagesStars) {
                if (hashSet.contains(Integer.valueOf(message.id)) && (this.highlightingDialog != topSender.dialogId || (i4 = this.highlightingMessageId) == 0 || message.id < i4)) {
                    break;
                } else {
                    i8++;
                }
            }
            i7++;
        }
        i3 = message.id;
        if (i3 < 0) {
            int i9 = 0;
            while (true) {
                if (i5 >= this.messages.size()) {
                    break;
                }
                Message message3 = (Message) this.messages.get(i5);
                if (message3.fromAdmin || !message3.isReaction || message3.stars >= sendPaidMessagesStars) {
                    if (hashSet.contains(Integer.valueOf(message3.id))) {
                        i2 = message3.id;
                        break;
                    }
                    i9++;
                }
                i5++;
            }
            i8 = i9;
        } else {
            i2 = i3;
        }
        if (i2 < 0) {
            return;
        }
        this.highlightingDialog = topSender.dialogId;
        this.highlightingMessageId = i2;
        this.callHighlight = true;
        RecyclerView.ItemAnimator itemAnimator = this.listView.getItemAnimator();
        this.listView.setItemAnimator(null);
        this.layoutManager.scrollToPositionWithOffset(i8, this.listView.getHeight() / 2, true);
        this.adapter.notifyItemChanged(i8);
        this.listView.setItemAnimator(itemAnimator);
    }

    public int getListViewContentTop() {
        int height = this.listView.getHeight();
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            height = Math.min(this.listView.getChildAt(i).getTop(), height);
        }
        return height;
    }

    public float top() {
        return this.listView.getY() + Math.max(Math.max(0.0f, this.keyboardOffset - this.listView.getTop()), getListViewContentTop());
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= top()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.allowTouches) {
            return false;
        }
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= top()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= top()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setAllowTouches(boolean z) {
        this.allowTouches = z;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        LivePlayer livePlayer = this.livePlayer;
        long sendPaidMessagesStars = livePlayer == null ? 0L : livePlayer.getSendPaidMessagesStars();
        this.lastMinStars = sendPaidMessagesStars;
        for (int i = 0; i < this.messages.size(); i++) {
            Message message = (Message) this.messages.get(i);
            if (message.fromAdmin || !message.isReaction || message.stars >= sendPaidMessagesStars) {
                arrayList.add(LiveCommentView.Factory.of(message));
            }
        }
    }

    public void fillTopItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        for (int i = 0; i < this.topMessages.size(); i++) {
            arrayList.add(LiveTopSenderView.Factory.of((TopSender) this.topMessages.get(i)));
        }
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
        float y = this.listView.getY() + Math.max(0.0f, this.keyboardOffset - this.listView.getTop());
        canvas.saveLayerAlpha(this.listView.getX(), this.listView.getY(), this.listView.getX() + this.listView.getWidth(), this.listView.getY() + this.listView.getHeight(), 255, 31);
        canvas.save();
        canvas.translate(0.0f, (1.0f - this.listView.getAlpha()) * Math.min((this.listView.getY() + this.listView.getHeight()) - y, getListViewTop()));
        canvas.clipRect(0.0f, y, getWidth(), getHeight());
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, y, getWidth(), AndroidUtilities.dp(12.0f) + y);
        this.gradientClip.draw(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, (this.listView.getY() + this.listView.getHeight()) - AndroidUtilities.dp(12.0f), getWidth(), this.listView.getBottom() + this.listView.getHeight());
        this.gradientClip.draw(canvas, rectF, 3, 1.0f);
        canvas.restore();
        return zDrawChild;
    }

    private void updateTopMessages(boolean z) {
        if (z && this.hasTopMessages == (!this.topMessages.isEmpty())) {
            return;
        }
        boolean zIsEmpty = this.topMessages.isEmpty();
        this.hasTopMessages = !zIsEmpty;
        if (z) {
            ViewPropertyAnimator viewPropertyAnimatorTranslationY = this.listView.animate().translationY(this.hasTopMessages ? 0.0f : AndroidUtilities.dp(35.0f));
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            viewPropertyAnimatorTranslationY.setInterpolator(cubicBezierInterpolator).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$updateTopMessages$8(valueAnimator);
                }
            }).setDuration(420L).start();
            this.topListView.animate().translationY(this.hasTopMessages ? 0.0f : AndroidUtilities.dp(35.0f)).alpha(this.hasTopMessages ? 1.0f : 0.0f).setInterpolator(cubicBezierInterpolator).setDuration(420L).start();
            return;
        }
        this.listView.setTranslationY(!zIsEmpty ? 0.0f : AndroidUtilities.dp(35.0f));
        this.topListView.setTranslationY(this.hasTopMessages ? 0.0f : AndroidUtilities.dp(35.0f));
        this.topListView.setAlpha(this.hasTopMessages ? 1.0f : 0.0f);
        invalidate();
    }

    public void lambda$updateTopMessages$8(ValueAnimator valueAnimator) {
        invalidate();
    }

    public void setKeyboardOffset(float f, float f2, float f3) {
        this.keyboardT = f;
        this.keyboardOffset = f2;
        if (Math.abs(this.keyboardFinalOffset - f3) > 0.1f) {
            this.keyboardFinalOffset = f3;
            this.listView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f) + Math.max(0, ((int) f3) - this.listView.getTop()), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
            if (!this.listView.canScrollVertically(1)) {
                this.layoutManager.scrollToPositionWithOffset(0, AndroidUtilities.dp(100.0f));
            }
        }
        setTranslationY(-this.keyboardOffset);
        invalidate();
    }

    public void clear() {
        this.messages.clear();
        this.adapter.update(true);
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
            if (inputGroupCall == null) {
                AndroidUtilities.cancelRunOnUIThread(this.pollStarsRunnable);
            } else {
                this.pollStarsRunnable.run();
            }
        }
        return z;
    }

    public void saveHistory() {
        LivePlayer livePlayer = this.livePlayer;
        if (livePlayer != null) {
            livePlayer.messages = this.messages;
            livePlayer.topMessages = this.topMessages;
        }
    }

    public void setLivePlayer(LivePlayer livePlayer) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z = this.livePlayer == null;
        this.livePlayer = livePlayer;
        if (!z || livePlayer == null || (arrayList = livePlayer.messages) == null || (arrayList2 = livePlayer.topMessages) == null || arrayList == (arrayList3 = this.messages) || arrayList2 == this.topMessages || !arrayList3.isEmpty() || !this.topMessages.isEmpty()) {
            return;
        }
        this.messages.addAll(livePlayer.messages);
        this.topMessages.addAll(livePlayer.topMessages);
        this.adapter.update(true);
        this.lastNow = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        Collections.sort(this.topMessages, new LiveCommentsView$$ExternalSyntheticLambda0(this));
        this.topAdapter.update(true);
        updateTopMessages(false);
    }

    @Override
    protected void onAttachedToWindow() {
        setAllowTouches(true);
        super.onAttachedToWindow();
        if (this.inputCall != null) {
            AndroidUtilities.cancelRunOnUIThread(this.pollStarsRunnable);
            AndroidUtilities.runOnUIThread(this.pollStarsRunnable);
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.inputCall != null) {
            AndroidUtilities.cancelRunOnUIThread(this.pollStarsRunnable);
        }
    }

    public void lambda$new$9() {
        if (this.inputCall == null || this.polling) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.pollStarsRunnable);
        this.polling = true;
        final TL_phone.getGroupCallStars getgroupcallstars = new TL_phone.getGroupCallStars();
        getgroupcallstars.call = this.inputCall;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(getgroupcallstars, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$pollStars$10(getgroupcallstars, (TL_phone.groupCallStars) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public void lambda$pollStars$10(TL_phone.getGroupCallStars getgroupcallstars, TL_phone.groupCallStars groupcallstars, TLRPC.TL_error tL_error) {
        boolean z;
        this.polling = false;
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
                } else if (groupcallstars.top_donors.get(i).my) {
                    z = groupcallstars.top_donors.get(i).stars > 0;
                } else {
                    i++;
                }
            }
            long j = groupcallstars.total_stars;
            boolean z2 = (j == this.totalStars && this.sentStars == z) ? false : true;
            this.totalStars = j;
            this.topDonors = groupcallstars.top_donors;
            this.sentStars = z;
            if (z2) {
                onStarsCountUpdated();
            }
            updateMessagesPlaces();
        }
        if (isAttachedToWindow()) {
            AndroidUtilities.cancelRunOnUIThread(this.pollStarsRunnable);
            AndroidUtilities.runOnUIThread(this.pollStarsRunnable, 5000L);
        }
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
                    this.f$0.cancelStars();
                }
            });
            Bulletin.TimerView timerView = new Bulletin.TimerView(getContext(), darkThemeResourceProvider);
            this.timerView = timerView;
            timerView.timeLeft = 5000L;
            timerView.setColor(Theme.getColor(Theme.key_undo_cancelColor, darkThemeResourceProvider));
            this.bulletinButton.addView(this.timerView, LayoutHelper.createFrame(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.bulletinButton.undoTextView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.bulletinLayout.setButton(this.bulletinButton);
            Bulletin bulletinCreate = BulletinFactory.of(this.topBulletinContainer, darkThemeResourceProvider).create(this.bulletinLayout, -1);
            this.starsBulletin = bulletinCreate;
            bulletinCreate.hideAfterBottomSheet = false;
            bulletinCreate.show(true);
            this.starsBulletin.setOnHideListener(this.closeBulletin);
        }
        this.localStars += j;
        onCancelledStarReaction(getDefaultPeerId());
        onStarReaction(getDefaultPeerId(), getTotalMyStars(), (int) this.localStars);
        this.bulletinLayout.titleTextView.setText(getStarsToastTitle());
        this.bulletinLayout.subtitleTextView.setText(getStarsToastSubtitle());
        this.timerView.timeLeft = 5000L;
        AndroidUtilities.cancelRunOnUIThread(this.closeBulletin);
        AndroidUtilities.runOnUIThread(this.closeBulletin, 5000L);
        onStarsButtonPressed(this.localStars, z);
        onStarsCountUpdated();
    }

    private int getTotalMyStars() {
        int i = (int) (0 + this.localStars);
        for (int i2 = 0; i2 < this.topDonors.size(); i2++) {
            if (((TL_phone.groupCallDonor) this.topDonors.get(i2)).my) {
                i = (int) (i + ((TL_phone.groupCallDonor) this.topDonors.get(i2)).stars);
            }
        }
        return i;
    }

    public void openStarsSheet(boolean z) {
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
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            clientUserId = DialogObject.getPeerDialogId(defaultSendAs);
        }
        StarsReactionsSheet starsReactionsSheet = new StarsReactionsSheet(getContext(), this.currentAccount, this.dialogId, null, null, arrayList, !z, true, clientUserId, new DarkThemeResourceProvider() {
            @Override
            public void appendColors() {
                this.sparseIntArray.put(Theme.key_divider, 352321535);
            }
        });
        starsReactionsSheet.setLiveCommentsView(this);
        starsReactionsSheet.setOnSend(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                return this.f$0.lambda$openStarsSheet$11((Long) obj, (Long) obj2);
            }
        });
        starsReactionsSheet.show();
    }

    public Integer lambda$openStarsSheet$11(Long l, Long l2) {
        this.closeBulletin.run();
        this.localStars = l2.longValue();
        Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(this.topBulletinContainer, new DarkThemeResourceProvider()).createSimpleBulletin(R.raw.stars_topup, getStarsToastTitle(), getStarsToastSubtitle());
        boolean z = false;
        bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
        bulletinCreateSimpleBulletin.show(true);
        this.localStars = 0L;
        this.sentStars = true;
        int iSend = send(new TLRPC.TL_textWithEntities(), l2.longValue());
        LivePlayer livePlayer = this.livePlayer;
        long sendPaidMessagesStars = livePlayer != null ? livePlayer.getSendPaidMessagesStars() : 0L;
        if (getDefaultPeerId() == this.dialogId && isAdmin()) {
            z = true;
        }
        if (l2.longValue() < sendPaidMessagesStars && !z) {
            return Integer.MIN_VALUE;
        }
        return Integer.valueOf(iSend);
    }

    public void lambda$new$12() {
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
        onCancelledStarReaction(getDefaultPeerId());
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
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.listView.getAlpha(), z ? 0.0f : 1.0f);
            this.collapseAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$setCollapsed$13(valueAnimator2);
                }
            });
            this.collapseAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    LiveCommentsView.this.listView.setAlpha(z ? 0.0f : 1.0f);
                    LiveCommentsView.this.shadowView.setAlpha(z ? 0.0f : 0.5f);
                    LiveCommentsView.this.invalidate();
                }
            });
            this.collapseAnimator.setDuration(420L);
            this.collapseAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.collapseAnimator.start();
        } else {
            this.shadowView.setAlpha(z ? 0.0f : 0.5f);
            this.listView.setAlpha(z ? 0.0f : 1.0f);
        }
        invalidate();
    }

    public void lambda$setCollapsed$13(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.listView.setAlpha(fFloatValue);
        this.shadowView.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, fFloatValue));
        invalidate();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.liveStoryMessageUpdate) {
            long jLongValue = ((Long) objArr[0]).longValue();
            TLObject tLObject = (TLObject) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            if (tLObject instanceof TLRPC.TL_updateGroupCallMessage) {
                TLRPC.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TLRPC.TL_updateGroupCallMessage) tLObject;
                TLRPC.InputGroupCall inputGroupCall = this.inputCall;
                if (inputGroupCall == null || inputGroupCall.id != jLongValue) {
                    return;
                }
                TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                int i3 = groupCallMessage.date;
                int i4 = groupCallMessage.id;
                boolean z = groupCallMessage.from_admin;
                long peerDialogId = DialogObject.getPeerDialogId(groupCallMessage.from_id);
                TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                push(i3, i4, z, peerDialogId, groupCallMessage2.message, groupCallMessage2.paid_message_stars, zBooleanValue);
                return;
            }
            if (tLObject instanceof TLRPC.TL_updateDeleteGroupCallMessages) {
                TLRPC.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TLRPC.TL_updateDeleteGroupCallMessages) tLObject;
                TLRPC.InputGroupCall inputGroupCall2 = this.inputCall;
                if (inputGroupCall2 == null || inputGroupCall2.id != jLongValue) {
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
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= this.messages.size()) {
                i2 = -1;
                message = null;
                break;
            } else {
                if (((Message) this.messages.get(i2)).id == i) {
                    message = (Message) this.messages.get(i2);
                    break;
                }
                i2++;
            }
        }
        if (message == null) {
            return;
        }
        if (message.id < 0 && message.isReaction) {
            long j = message.stars;
            if (j > 0) {
                this.totalStars -= j;
                onStarsCountUpdated();
            }
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.topMessages.size()) {
                break;
            }
            if (((TopSender) this.topMessages.get(i3)).messages.contains(message)) {
                ((TopSender) this.topMessages.get(i3)).messages.remove(message);
                if (((TopSender) this.topMessages.get(i3)).messages.isEmpty()) {
                    this.topMessages.remove(i3);
                    z = true;
                } else {
                    ((TopSender) this.topMessages.get(i3)).updateLastSentDate();
                    scheduleRemovingTopSenders();
                }
            } else {
                i3++;
            }
        }
        this.messages.remove(i2);
        this.adapter.update(true);
        if (z) {
            this.lastNow = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            Collections.sort(this.topMessages, new LiveCommentsView$$ExternalSyntheticLambda0(this));
            this.topAdapter.update(true);
            updateMessagesPlaces();
            updateTopMessages(true);
        }
    }

    public int sortTopMessages(TopSender topSender, TopSender topSender2) {
        return topSender2.lastSentDate - topSender.lastSentDate;
    }

    public void deleteAllFrom(long j) {
        int i = 0;
        boolean z = false;
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
                            z = true;
                        } else {
                            scheduleRemovingTopSenders();
                        }
                    } else {
                        i2++;
                    }
                }
                this.messages.remove(i);
                this.adapter.update(true);
                i--;
            }
            i++;
        }
        if (z) {
            this.lastNow = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            Collections.sort(this.topMessages, new LiveCommentsView$$ExternalSyntheticLambda0(this));
            this.topAdapter.update(true);
            updateMessagesPlaces();
        }
    }

    public boolean isAdmin() {
        TLRPC.InputGroupCall inputGroupCall;
        if (getDefaultPeerId() < 0 && getDefaultPeerId() != this.dialogId) {
            return false;
        }
        long j = this.dialogId;
        if (j >= 0) {
            return j == UserConfig.getInstance(this.currentAccount).getClientUserId();
        }
        LivePlayer livePlayer = this.livePlayer;
        if (livePlayer == null || (inputGroupCall = this.inputCall) == null || inputGroupCall.id != livePlayer.getCallId() || !this.livePlayer.isCreator()) {
            return ChatObject.canManageCalls(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)));
        }
        return true;
    }

    private long getDefaultPeerId() {
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        LivePlayer livePlayer = this.livePlayer;
        if (livePlayer != null && livePlayer.isAdmin() && this.livePlayer.sendAsDisabled()) {
            return this.dialogId;
        }
        return defaultSendAs == null ? UserConfig.getInstance(this.currentAccount).getClientUserId() : DialogObject.getPeerDialogId(defaultSendAs);
    }

    public int send(TLRPC.TL_textWithEntities tL_textWithEntities, long j) {
        return lambda$send$14(getDefaultPeerId(), tL_textWithEntities, j);
    }

    public int lambda$send$14(final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j2) {
        long j3;
        TL_phone.groupCallDonor groupcalldonor;
        final int newMessageId = UserConfig.getInstance(this.currentAccount).getNewMessageId();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.inputCall;
        sendgroupcallmessage.message = tL_textWithEntities;
        if (j2 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j2;
        }
        sendgroupcallmessage.random_id = Utilities.random.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(sendgroupcallmessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$send$16(sendgroupcallmessage, newMessageId, j2, j, tL_textWithEntities, tLObject, tL_error);
            }
        });
        if (this.topDonors == null || j2 <= 0) {
            j3 = j;
        } else {
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
                groupcalldonor.stars += j2;
                j3 = j;
            } else {
                TL_phone.groupCallDonor groupcalldonor2 = new TL_phone.groupCallDonor();
                groupcalldonor2.my = true;
                groupcalldonor2.anonymous = false;
                j3 = j;
                groupcalldonor2.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(j3);
                groupcalldonor2.stars = j2;
                this.topDonors.add(groupcalldonor2);
            }
        }
        push(ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime(), newMessageId, j3 == this.dialogId || isAdmin(), j, tL_textWithEntities, j2, false);
        setCollapsed(false, true);
        return newMessageId;
    }

    public void lambda$send$16(TL_phone.sendGroupCallMessage sendgroupcallmessage, final int i, final long j, final long j2, final TLRPC.TL_textWithEntities tL_textWithEntities, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.Updates)) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$send$15(i, tL_error, j, j2, tL_textWithEntities);
                    }
                });
                return;
            }
            return;
        }
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

    public void lambda$send$15(int i, TLRPC.TL_error tL_error, final long j, final long j2, final TLRPC.TL_textWithEntities tL_textWithEntities) {
        delete(i);
        if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
            new StarsIntroActivity.StarsNeededSheet(getContext(), new DarkThemeResourceProvider(), j, 17, "", new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$send$14(j2, tL_textWithEntities, j);
                }
            }, this.dialogId).show();
            return;
        }
        if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            LivePlayer livePlayer = this.livePlayer;
            if (livePlayer != null) {
                livePlayer.storyDeleted();
                return;
            }
            return;
        }
        BulletinFactory.of(this.topBulletinContainer, new DarkThemeResourceProvider()).showForError(tL_error, true);
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
        if (this.maxReadId < 0) {
            return 0;
        }
        LivePlayer livePlayer = this.livePlayer;
        long sendPaidMessagesStars = livePlayer == null ? 0L : livePlayer.getSendPaidMessagesStars();
        int i = 0;
        for (int i2 = 0; i2 < this.messages.size(); i2++) {
            Message message = (Message) this.messages.get(i2);
            int i3 = message.id;
            if (i3 >= 0 && i3 > this.maxReadId && (message.fromAdmin || !message.isReaction || message.stars >= sendPaidMessagesStars)) {
                i++;
            }
        }
        return i;
    }

    public void updatedMinStars() {
        LivePlayer livePlayer = this.livePlayer;
        if (this.lastMinStars != (livePlayer == null ? 0L : livePlayer.getSendPaidMessagesStars())) {
            this.adapter.update(true);
        }
    }

    public long getStarsCount() {
        return this.totalStars + this.localStars;
    }

    public boolean areSendingStars() {
        return this.starsBulletin != null;
    }

    public void push(int i, int i2, boolean z, long j, TLRPC.TL_textWithEntities tL_textWithEntities, long j2, boolean z2) {
        int i3;
        TopSender topSender;
        boolean z3;
        for (int i4 = 0; i4 < this.messages.size(); i4++) {
            if (((Message) this.messages.get(i4)).id == i2) {
                return;
            }
        }
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        Message message = new Message();
        message.date = i;
        message.fromAdmin = z;
        message.dialogId = j;
        message.text = tL_textWithEntities;
        message.stars = j2;
        message.id = i2;
        message.isReaction = TextUtils.isEmpty(tL_textWithEntities.text);
        int tierOption = HighlightMessageSheet.getTierOption(this.currentAccount, (int) message.stars, HighlightMessageSheet.TIER_PERIOD);
        TL_phone.groupCallDonor groupcalldonor = null;
        if (message.stars > 0 && tierOption > 0 && currentTime - message.date <= tierOption) {
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
                topSender = new TopSender();
                topSender.currentAccount = this.currentAccount;
                topSender.dialogId = j;
                topSender.messages.add(message);
                this.topMessages.add(0, topSender);
                z3 = true;
            } else {
                topSender.messages.add(message);
                this.topListView.invalidateViews();
                z3 = false;
            }
            topSender.updateLastSentDate();
            updateTopMessages(true);
            scheduleRemovingTopSenders();
            this.lastNow = currentTime;
            Collections.sort(this.topMessages, new LiveCommentsView$$ExternalSyntheticLambda0(this));
            if (!z2) {
                this.topAdapter.update(true);
            }
            if (z3) {
                this.topLayoutManager.scrollToPosition(0);
            }
        }
        if (!z2 && message.isReaction) {
            long j3 = message.stars;
            if (j3 > 0) {
                this.totalStars += j3;
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
            i3 = 0;
        } else {
            i3 = 0;
        }
        this.messages.add(i3, message);
        if (!z2) {
            if (this.messages.size() > 2000) {
                ArrayList arrayList = this.messages;
                arrayList.subList(2000, arrayList.size()).clear();
            }
            this.adapter.update(true);
        }
        if (i3 <= 0 && !z2 && (!this.listView.canScrollVertically(1) || message.id < 0)) {
            this.layoutManager.scrollToPositionWithOffset(0, AndroidUtilities.dp(100.0f));
            int i6 = message.id;
            if (i6 > 0) {
                this.maxReadId = i6;
            }
        }
        invalidate();
        onMessagesCountUpdated();
        if (!z2 && i2 > 0 && message.stars > 0) {
            int i7 = 0;
            while (true) {
                if (i7 >= this.topDonors.size()) {
                    break;
                }
                if (DialogObject.getPeerDialogId(((TL_phone.groupCallDonor) this.topDonors.get(i7)).peer_id) == message.dialogId) {
                    groupcalldonor = (TL_phone.groupCallDonor) this.topDonors.get(i7);
                    break;
                }
                i7++;
            }
            if (groupcalldonor == null) {
                groupcalldonor = new TL_phone.groupCallDonor();
                groupcalldonor.my = UserConfig.getInstance(this.currentAccount).getClientUserId() == message.dialogId;
                groupcalldonor.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(message.dialogId);
                groupcalldonor.stars = 0L;
                for (int i8 = 0; i8 < this.topMessages.size(); i8++) {
                    if (((TopSender) this.topMessages.get(i8)).dialogId == message.dialogId) {
                        ((TopSender) this.topMessages.get(i8)).getStars();
                        groupcalldonor.stars += ((TopSender) this.topMessages.get(i8)).max_stars;
                    }
                }
                this.topDonors.add(groupcalldonor);
            }
            long j4 = groupcalldonor.stars;
            long j5 = message.stars;
            long j6 = j4 + j5;
            groupcalldonor.stars = j6;
            onStarReaction(message.dialogId, (int) j6, (int) j5);
        }
        updateMessagesPlaces();
        if (z2) {
            AndroidUtilities.cancelRunOnUIThread(this.updateAdapters);
            AndroidUtilities.runOnUIThread(this.updateAdapters, 100L);
        }
        saveHistory();
    }

    public void lambda$new$17() {
        this.adapter.update(true);
        this.topAdapter.update(true);
    }

    private void updateMessagesPlaces() {
        int place;
        int place2;
        this.topPlaces.clear();
        ArrayList<TL_phone.groupCallDonor> arrayList = new ArrayList();
        ArrayList arrayList2 = this.topDonors;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return LiveCommentsView.lambda$updateMessagesPlaces$18((TL_phone.groupCallDonor) obj, (TL_phone.groupCallDonor) obj2);
            }
        });
        int i = Integer.MIN_VALUE;
        int i2 = 0;
        for (TL_phone.groupCallDonor groupcalldonor : arrayList) {
            int i3 = (int) groupcalldonor.stars;
            if (i3 != i) {
                i2++;
                i = i3;
            }
            if (i2 > 3) {
                break;
            } else {
                this.topPlaces.put(Long.valueOf(DialogObject.getPeerDialogId(groupcalldonor.peer_id)), Integer.valueOf(i2));
            }
        }
        for (int i4 = 0; i4 < this.listView.getChildCount(); i4++) {
            View childAt = this.listView.getChildAt(i4);
            if (childAt instanceof LiveCommentView) {
                LiveCommentView liveCommentView = (LiveCommentView) childAt;
                if (liveCommentView.message != null && (place2 = getPlace(liveCommentView.message.dialogId)) != liveCommentView.message.place) {
                    liveCommentView.message.place = place2;
                    liveCommentView.set(liveCommentView.message);
                }
            }
        }
        for (int i5 = 0; i5 < this.messages.size(); i5++) {
            Message message = (Message) this.messages.get(i5);
            int place3 = getPlace(message.dialogId);
            if (place3 != message.place) {
                message.place = place3;
            }
        }
        for (int i6 = 0; i6 < this.topListView.getChildCount(); i6++) {
            View childAt2 = this.topListView.getChildAt(i6);
            if (childAt2 instanceof LiveTopSenderView) {
                LiveTopSenderView liveTopSenderView = (LiveTopSenderView) childAt2;
                if (liveTopSenderView.sender != null && (place = getPlace(liveTopSenderView.sender.dialogId)) != liveTopSenderView.sender.place) {
                    liveTopSenderView.sender.place = place;
                    liveTopSenderView.set(liveTopSenderView.sender);
                }
            }
        }
        for (int i7 = 0; i7 < this.topMessages.size(); i7++) {
            TopSender topSender = (TopSender) this.topMessages.get(i7);
            int place4 = getPlace(topSender.dialogId);
            if (place4 != topSender.place) {
                topSender.place = place4;
            }
        }
    }

    public static int lambda$updateMessagesPlaces$18(TL_phone.groupCallDonor groupcalldonor, TL_phone.groupCallDonor groupcalldonor2) {
        return (int) (groupcalldonor2.stars - groupcalldonor.stars);
    }

    private int getPlace(long j) {
        return ((Integer) Map.EL.getOrDefault(this.topPlaces, Long.valueOf(j), 0)).intValue();
    }

    public static class LiveCommentView extends FrameLayout implements ItemOptions.ScrimView {
        public final LinearLayout adminLayout;
        public final SpoilersTextView adminNameView;
        public final SpoilersTextView adminRoleView;
        public final AvatarDrawable avatarDrawable;
        public final BackupImageView avatarView;
        public Drawable background;
        private final Paint backgroundPaint;
        public float backgroundViewAlpha;
        private final int currentAccount;
        private boolean drawParticles;
        private boolean drawStar;
        private final boolean filled;
        private ValueAnimator highlightAnimator;
        private int highlightingMessageId;
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

        public LiveCommentView(Context context, int i, boolean z) {
            super(context);
            this.drawParticles = false;
            this.drawStar = true;
            this.backgroundViewAlpha = 0.5f;
            this.starsViewCache = new ColoredImageSpan[1];
            this.smallStarsViewCache = new ColoredImageSpan[1];
            this.backgroundPaint = new Paint(1);
            this.currentAccount = i;
            this.filled = z;
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
            addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
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
            NotificationCenter.listenEmojiLoading(spoilersTextView3);
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

        public void highlight() {
            ValueAnimator valueAnimator = this.highlightAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.highlightAnimator = null;
                Drawable drawable = this.background;
                if (drawable != null) {
                    drawable.setAlpha((int) (this.backgroundViewAlpha * 255.0f));
                    this.layout.invalidate();
                }
            }
            Message message = this.message;
            if (message == null || this.background == null) {
                return;
            }
            this.highlightingMessageId = message.id;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.highlightAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$highlight$0(valueAnimator2);
                }
            });
            this.highlightAnimator.addListener(new AnonymousClass2());
            this.highlightAnimator.setDuration(350L);
            this.highlightAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.highlightAnimator.start();
        }

        public void lambda$highlight$0(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            Drawable drawable = this.background;
            if (drawable != null) {
                drawable.setAlpha((int) (AndroidUtilities.lerp(this.backgroundViewAlpha, 1.0f, fFloatValue) * 255.0f));
                this.layout.invalidate();
            }
        }

        class AnonymousClass2 extends AnimatorListenerAdapter {
            AnonymousClass2() {
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (LiveCommentView.this.message == null || LiveCommentView.this.highlightingMessageId != LiveCommentView.this.message.id) {
                    return;
                }
                LiveCommentView.this.highlightAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
                LiveCommentView.this.highlightAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.lambda$onAnimationEnd$0(valueAnimator);
                    }
                });
                LiveCommentView.this.highlightAnimator.setStartDelay(3000L);
                LiveCommentView.this.highlightAnimator.setDuration(550L);
                LiveCommentView.this.highlightAnimator.setInterpolator(new LinearInterpolator());
                LiveCommentView.this.highlightAnimator.start();
            }

            public void lambda$onAnimationEnd$0(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                LiveCommentView liveCommentView = LiveCommentView.this;
                Drawable drawable = liveCommentView.background;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(1.0f, liveCommentView.backgroundViewAlpha, fFloatValue) * 255.0f));
                    LiveCommentView.this.layout.invalidate();
                }
            }
        }

        public void set(org.telegram.ui.Stories.LiveCommentsView.Message r20) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.LiveCommentsView.LiveCommentView.set(org.telegram.ui.Stories.LiveCommentsView$Message):void");
        }

        public static int lambda$set$1(Pair pair, Pair pair2) {
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
                this.backgroundPaint.setColor(Theme.multAlpha(-16777216, f * 0.5f));
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

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public LiveCommentView createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                LiveCommentView liveCommentView = new LiveCommentView(context, i, false);
                liveCommentView.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
                return liveCommentView;
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((LiveCommentView) view).set((Message) uItem.object);
            }

            public static UItem of(Message message) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.object = message;
                return uItemOfFactory;
            }

            @Override
            public boolean equals(UItem uItem, UItem uItem2) {
                return uItem.object == uItem2.object;
            }
        }
    }

    public static class LiveTopSenderView extends FrameLayout {
        public final AvatarDrawable avatarDrawable;
        public final BackupImageView avatarView;
        public final ImageView crownView;
        public final LinearLayout layout;
        private TopSender sender;
        public final TextView textView;

        public LiveTopSenderView(Context context) {
            super(context);
            ScaleStateListAnimator.apply(this);
            LinearLayout linearLayout = new LinearLayout(context) {
                StarsReactionsSheet.Particles particles;
                final Path clipPath = new Path();
                final Paint fillPaint = new Paint(1);
                long lastDialogId = 0;
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
                        int tierOption = HighlightMessageSheet.getTierOption(LiveTopSenderView.this.sender.currentAccount, LiveTopSenderView.this.sender.getStars(), HighlightMessageSheet.TIER_COLOR1);
                        int tierOption2 = HighlightMessageSheet.getTierOption(LiveTopSenderView.this.sender.currentAccount, LiveTopSenderView.this.sender.getStars(), HighlightMessageSheet.TIER_COLOR_BACKGROUND);
                        canvas.drawColor(tierOption);
                        if (this.lastDialogId != LiveTopSenderView.this.sender.dialogId) {
                            this.animatedProgress.force(LiveTopSenderView.this.sender.getProgress());
                        }
                        float f = this.animatedProgress.set(LiveTopSenderView.this.sender.getProgress());
                        this.lastDialogId = LiveTopSenderView.this.sender.dialogId;
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
            linearLayout.addView(backupImageView, LayoutHelper.createLinear(22, 22, 0.0f, 51, 3, 2, 7, 2));
            ImageView imageView = new ImageView(context);
            this.crownView = imageView;
            imageView.setVisibility(8);
            linearLayout.addView(imageView, LayoutHelper.createLinear(18, 18, 19, 0, 0, 3, 0));
            TextView textView = new TextView(context) {
                private int width = -1;
                private final GradientClip clip = new GradientClip();

                @Override
                protected void onMeasure(int i, int i2) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE), i2);
                }

                @Override
                public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                    super.setText(charSequence, bufferType);
                    this.width = -1;
                }

                @Override
                protected void onDraw(Canvas canvas) {
                    if (this.width < 0) {
                        this.width = getLayout() != null ? (int) getLayout().getLineWidth(0) : 0;
                    }
                    if (this.width > AndroidUtilities.dp(100.0f)) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                        super.onDraw(canvas);
                        canvas.save();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(getWidth() - AndroidUtilities.dp(15.0f), 0.0f, getWidth(), getHeight());
                        this.clip.draw(canvas, rectF, 2, 1.0f);
                        canvas.restore();
                        canvas.restore();
                        return;
                    }
                    super.onDraw(canvas);
                }
            };
            this.textView = textView;
            textView.setLines(1);
            textView.setSingleLine();
            textView.setTextColor(-1);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 7, 0));
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
            if (topSender.place > 0) {
                this.crownView.setImageDrawable(new CrownDrawable(getContext(), topSender.place));
                this.crownView.setVisibility(0);
            } else {
                this.crownView.setVisibility(8);
            }
            this.textView.setText(DialogObject.getName(topSender.dialogId));
            this.layout.invalidate();
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public LiveTopSenderView createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new LiveTopSenderView(context);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((LiveTopSenderView) view).set((TopSender) uItem.object);
            }

            public static UItem of(TopSender topSender) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.object = topSender;
                return uItemOfFactory;
            }

            @Override
            public boolean equals(UItem uItem, UItem uItem2) {
                return uItem.object == uItem2.object;
            }
        }
    }

    public static class CrownDrawable extends Drawable {
        private final Drawable crown;
        private final float scale = 0.75f;
        private final Text text;

        @Override
        public int getOpacity() {
            return -2;
        }

        public CrownDrawable(Context context, int i) {
            this.crown = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
            Text text = new Text("" + i, 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            this.text = text;
            text.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        @Override
        public void draw(Canvas canvas) {
            Rect bounds = getBounds();
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
            this.crown.setBounds(bounds);
            this.crown.draw(canvas);
            this.text.draw(canvas, bounds.centerX() - (this.text.getCurrentWidth() / 2.0f), bounds.centerY() + AndroidUtilities.dp(0.15f), -1, this.crown.getAlpha() / 255.0f);
            canvas.restore();
        }

        @Override
        public int getIntrinsicWidth() {
            return (int) (this.crown.getIntrinsicWidth() * this.scale);
        }

        @Override
        public int getIntrinsicHeight() {
            return (int) (this.crown.getIntrinsicHeight() * this.scale);
        }

        @Override
        public int getAlpha() {
            return this.crown.getAlpha();
        }

        @Override
        public void setAlpha(int i) {
            this.crown.setAlpha(i);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.crown.setColorFilter(colorFilter);
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
        textView.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 22.0f, 12.0f, 22.0f, 0.0f));
        HeaderCell headerCell = new HeaderCell(context, darkThemeResourceProvider);
        headerCell.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
        linearLayout.addView(headerCell, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 4.0f));
        final CheckBoxCell checkBoxCell = new CheckBoxCell(context, 4, 21, true, darkThemeResourceProvider);
        CheckBox2 checkBoxRound = checkBoxCell.getCheckBoxRound();
        int i = Theme.key_switch2TrackChecked;
        int i2 = Theme.key_radioBackground;
        int i3 = Theme.key_checkboxCheck;
        checkBoxRound.setColor(i, i2, i3);
        checkBoxCell.setText(LocaleController.getString(R.string.DeleteReportSpam), null, false, true);
        checkBoxCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LiveCommentsView.lambda$openDeleteMessage$19(checkBoxCell, view);
            }
        });
        int i4 = Theme.key_listSelector;
        checkBoxCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(i4, darkThemeResourceProvider), 2));
        linearLayout.addView(checkBoxCell, LayoutHelper.createLinear(-1, -2));
        final CheckBoxCell checkBoxCell2 = new CheckBoxCell(context, 4, 21, true, darkThemeResourceProvider);
        checkBoxCell2.getCheckBoxRound().setColor(i, i2, i3);
        checkBoxCell2.setText(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j)), null, false, true);
        checkBoxCell2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LiveCommentsView.lambda$openDeleteMessage$20(checkBoxCell2, view);
            }
        });
        checkBoxCell2.setBackground(Theme.createSelectorDrawable(Theme.getColor(i4, darkThemeResourceProvider), 2));
        linearLayout.addView(checkBoxCell2, LayoutHelper.createLinear(-1, -2));
        final CheckBoxCell checkBoxCell3 = new CheckBoxCell(context, 4, 21, true, darkThemeResourceProvider);
        checkBoxCell3.getCheckBoxRound().setColor(i, i2, i3);
        checkBoxCell3.setText(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j)), null, false, false);
        checkBoxCell3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LiveCommentsView.lambda$openDeleteMessage$21(checkBoxCell3, view);
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
        buttonWithCounterView.setText(LocaleController.getString(R.string.DeleteProceedBtn), false);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LiveCommentsView.lambda$openDeleteMessage$22(checkBoxCell, checkBoxCell2, checkBoxCell3, callback3, bottomSheet, view);
            }
        });
        frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2));
        bottomSheet.setCustomView(linearLayout);
        bottomSheet.show();
    }

    public static void lambda$openDeleteMessage$19(CheckBoxCell checkBoxCell, View view) {
        checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
    }

    public static void lambda$openDeleteMessage$20(CheckBoxCell checkBoxCell, View view) {
        checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
    }

    public static void lambda$openDeleteMessage$21(CheckBoxCell checkBoxCell, View view) {
        checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
    }

    public static void lambda$openDeleteMessage$22(CheckBoxCell checkBoxCell, CheckBoxCell checkBoxCell2, CheckBoxCell checkBoxCell3, Utilities.Callback3 callback3, BottomSheet bottomSheet, View view) {
        callback3.run(Boolean.valueOf(checkBoxCell.isChecked()), Boolean.valueOf(checkBoxCell2.isChecked()), Boolean.valueOf(checkBoxCell3.isChecked()));
        bottomSheet.lambda$new$0();
    }
}
