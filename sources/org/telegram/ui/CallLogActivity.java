package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.DialogsActivityTopPanelLayout;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.ProgressButton;
import org.telegram.ui.Components.QRCodeBottomSheet;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;

public class CallLogActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, MainTabsActivity.TabFragmentDelegate {
    private final int ADDITIONAL_LIST_HEIGHT_DP;
    private final int ID_CREATE_CALL;
    private final int ID_SHOW_IN_MAIN_TABS;
    private ImageView actionModeCloseView;
    private final ArrayList actionModeViews;
    private ArrayList activeGroupCalls;
    private int additionFloatingButtonOffset;
    private int additionNavigationBarHeight;
    private float additionalFloatingTranslation;
    private final ArrayList calls;
    private SizeNotifierFrameLayout contentView;
    private EmptyTextProgressView emptyView;
    private boolean endReached;
    private boolean firstLoaded;
    private FlickerLoadingView flickerLoadingView;
    private FragmentFloatingButton floatingButton;
    private FragmentContextView fragmentContextView;
    private FrameLayout fragmentContextViewWrapper;
    private Drawable greenDrawable;
    private Drawable greenDrawable2;
    private boolean hasMainTabs;
    private HeaderShadowView headerShadowView;
    private HintView2 hideCallTabsHintView;
    private boolean hideCallTabsHintWasShown;
    private IBlur3Capture iBlur3Capture;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryLiquidGlass;
    private boolean iBlur3Invalidated;
    private final RectF iBlur3PositionActionBar;
    private final RectF iBlur3PositionMainTabs;
    private final ArrayList iBlur3Positions;
    private final BlurredBackgroundSourceColor iBlur3SourceColor;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    private TLRPC.Chat lastCallChat;
    private TLRPC.User lastCallUser;
    private LinearLayoutManager layoutManager;
    private UniversalRecyclerView listView;
    private boolean loading;
    private int navigationBarHeight;
    private boolean needFinishFragment;
    private boolean openTransitionStarted;
    private ActionBarMenuItem otherItem;
    private Drawable redDrawable;
    private Drawable redDrawable2;
    private RecyclerAnimationScrollHelper scrollHelper;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    private NumberTextView selectedDialogsCountTextView;
    private final ArrayList selectedIds;
    private final Rect tmpClipRect;
    private DialogsActivityTopPanelLayout topPanelLayout;
    private Long waitingForCallChatId;

    public static boolean $r8$lambda$_WRNyBc9vp0gUodekqiw3i7dFMI(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean canParentTabsSlide(MotionEvent motionEvent, boolean z) {
        return true;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean needDelayOpenAnimation() {
        return true;
    }

    public CallLogActivity() {
        this(null);
    }

    public CallLogActivity(Bundle bundle) {
        super(bundle);
        int i = Build.VERSION.SDK_INT;
        this.ADDITIONAL_LIST_HEIGHT_DP = i >= 31 ? 48 : 0;
        this.needFinishFragment = true;
        this.actionModeViews = new ArrayList();
        this.calls = new ArrayList();
        this.selectedIds = new ArrayList();
        this.ID_CREATE_CALL = 1;
        this.ID_SHOW_IN_MAIN_TABS = 2;
        this.hideCallTabsHintWasShown = false;
        this.tmpClipRect = new Rect();
        ArrayList arrayList = new ArrayList();
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        RectF rectF2 = new RectF();
        this.iBlur3PositionMainTabs = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.iBlur3SourceColor = blurredBackgroundSourceColor;
        blurredBackgroundSourceColor.setColor(getThemedColor(Theme.key_windowBackgroundGray));
        if (i >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor();
            this.iBlur3SourceGlassFrosted = new BlurredBackgroundSourceRenderNode(null);
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlass = blurredBackgroundSourceRenderNode;
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            this.iBlur3FactoryLiquidGlass = blurredBackgroundDrawableViewFactory;
            blurredBackgroundDrawableViewFactory.setLiquidGlassEffectAllowed(LiteMode.isEnabled(262144));
            return;
        }
        this.scrollableViewNoiseSuppressor = null;
        this.iBlur3SourceGlassFrosted = null;
        this.iBlur3SourceGlass = null;
        this.iBlur3FactoryLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
    }

    class EmptyTextProgressView extends FrameLayout {
        private final TextView emptyTextView1;
        private final TextView emptyTextView2;
        private final RLottieImageView imageView;
        private final View progressView;

        public static boolean m1460$r8$lambda$r2yXPcVr5CyXIjl7raCNSCXp8(View view, MotionEvent motionEvent) {
            return true;
        }

        @Override
        public boolean hasOverlappingRendering() {
            return false;
        }

        public EmptyTextProgressView(Context context, View view) {
            super(context);
            addView(view, LayoutHelper.createFrame(-1, -1.0f));
            this.progressView = view;
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setAnimation(R.raw.utyan_call, 110, 110);
            rLottieImageView.setAutoRepeat(false);
            addView(rLottieImageView, LayoutHelper.createFrame(110, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
            rLottieImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    CallLogActivity.EmptyTextProgressView.m1461$r8$lambda$cnIdYaFZ0iLuVdYDvlCvN6grts(this.f$0, view2);
                }
            });
            TextView textView = new TextView(context);
            this.emptyTextView1 = textView;
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            textView.setText(LocaleController.getString(R.string.MakeYourFirstCall));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.emptyTextView2 = textView2;
            String string = LocaleController.formatString(R.string.MakeYourFirstCallHint, Integer.valueOf(CallLogActivity.this.getMessagesController().conferenceCallSizeLimit));
            if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                string = string.replace('\n', ' ');
            }
            textView2.setText(string);
            textView2.setTextColor(Theme.getColor(Theme.key_emptyListPlaceholder));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
            view.setAlpha(0.0f);
            rLottieImageView.setAlpha(0.0f);
            textView.setAlpha(0.0f);
            textView2.setAlpha(0.0f);
            setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return CallLogActivity.EmptyTextProgressView.m1460$r8$lambda$r2yXPcVr5CyXIjl7raCNSCXp8(view2, motionEvent);
                }
            });
        }

        public static void m1461$r8$lambda$cnIdYaFZ0iLuVdYDvlCvN6grts(EmptyTextProgressView emptyTextProgressView, View view) {
            if (emptyTextProgressView.imageView.isPlaying()) {
                return;
            }
            emptyTextProgressView.imageView.setProgress(0.0f);
            emptyTextProgressView.imageView.playAnimation();
        }

        public void showProgress() {
            this.imageView.animate().alpha(0.0f).setDuration(150L).start();
            this.emptyTextView1.animate().alpha(0.0f).setDuration(150L).start();
            this.emptyTextView2.animate().alpha(0.0f).setDuration(150L).start();
            this.progressView.animate().alpha(1.0f).setDuration(150L).start();
        }

        public void showTextView() {
            this.imageView.animate().alpha(1.0f).setDuration(150L).start();
            this.emptyTextView1.animate().alpha(1.0f).setDuration(150L).start();
            this.emptyTextView2.animate().alpha(1.0f).setDuration(150L).start();
            this.progressView.animate().alpha(0.0f).setDuration(150L).start();
            this.imageView.playAnimation();
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        Long l;
        UniversalRecyclerView universalRecyclerView;
        CallLogRow callLogRow;
        TLRPC.User user;
        CallLogRow callLogRow2;
        Object obj;
        CallLogRow callLogRow3;
        TLRPC.User user2;
        CallLogActivity callLogActivity = this;
        int i3 = 0;
        boolean z = true;
        if (i == NotificationCenter.didReceiveNewMessages) {
            if (callLogActivity.firstLoaded && !((Boolean) objArr[2]).booleanValue()) {
                ArrayList arrayList = (ArrayList) objArr[1];
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    MessageObject messageObject = (MessageObject) obj2;
                    TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                    int i5 = 3;
                    if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                        long fromChatId = messageObject.getFromChatId();
                        long j = fromChatId == callLogActivity.getUserConfig().getClientUserId() ? messageObject.messageOwner.peer_id.user_id : fromChatId;
                        int i6 = fromChatId == callLogActivity.getUserConfig().getClientUserId() ? 0 : 1;
                        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = messageObject.messageOwner.action.reason;
                        if (i6 == z && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                            i6 = 2;
                        }
                        if (i6 != 0 || (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                            i5 = i6;
                        }
                        if (!callLogActivity.calls.isEmpty()) {
                            CallLogRow callLogRow4 = (CallLogRow) callLogActivity.calls.get(0);
                            if (eq(j, callLogRow4.users) && callLogRow4.type == i5) {
                                callLogRow4.calls.add(0, messageObject.messageOwner);
                            } else {
                                callLogRow3 = new CallLogRow();
                                callLogRow3.calls.clear();
                                callLogRow3.calls.add(messageObject.messageOwner);
                                callLogRow3.users.clear();
                                user2 = callLogActivity.getMessagesController().getUser(Long.valueOf(j));
                                if (user2 != null) {
                                    callLogRow3.users.add(user2);
                                }
                                callLogRow3.type = i5;
                                callLogRow3.video = messageObject.isVideoCall();
                                callLogActivity.calls.add(0, callLogRow3);
                                callLogActivity.listView.adapter.update(z);
                            }
                        } else {
                            callLogRow3 = new CallLogRow();
                            callLogRow3.calls.clear();
                            callLogRow3.calls.add(messageObject.messageOwner);
                            callLogRow3.users.clear();
                            user2 = callLogActivity.getMessagesController().getUser(Long.valueOf(j));
                            if (user2 != null) {
                                callLogRow3.users.add(user2);
                            }
                            callLogRow3.type = i5;
                            callLogRow3.video = messageObject.isVideoCall();
                            callLogActivity.calls.add(0, callLogRow3);
                            callLogActivity.listView.adapter.update(z);
                        }
                    } else if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        long fromChatId2 = messageObject.getFromChatId();
                        Set<Long> set = (Set) Collection.EL.stream(tL_messageActionConferenceCall.other_participants).map(new CallLogActivity$$ExternalSyntheticLambda12()).collect(Collectors.toSet());
                        set.add(Long.valueOf(fromChatId2 == callLogActivity.getUserConfig().getClientUserId() ? messageObject.messageOwner.peer_id.user_id : fromChatId2));
                        int i7 = fromChatId2 == callLogActivity.getUserConfig().getClientUserId() ? 0 : 1;
                        if (i7 == z && tL_messageActionConferenceCall.missed) {
                            i7 = 2;
                        }
                        i5 = (i7 == 0 && tL_messageActionConferenceCall.missed) ? 3 : i7;
                        if (callLogActivity.calls.isEmpty()) {
                            callLogRow = new CallLogRow();
                            callLogRow.call_id = tL_messageActionConferenceCall.call_id;
                            callLogRow.calls.clear();
                            callLogRow.calls.add(messageObject.messageOwner);
                            callLogRow.users.clear();
                            for (Long l2 : set) {
                                l2.getClass();
                                user = callLogActivity.getMessagesController().getUser(l2);
                                if (user != null) {
                                    callLogRow.users.add(user);
                                }
                            }
                            callLogRow.type = i5;
                            callLogRow.video = messageObject.isVideoCall();
                            callLogActivity.calls.add(0, callLogRow);
                            callLogActivity.listView.adapter.update(true);
                        } else {
                            int i8 = 0;
                            while (true) {
                                if (i8 >= callLogActivity.calls.size()) {
                                    callLogRow2 = null;
                                    break;
                                }
                                callLogRow2 = (CallLogRow) callLogActivity.calls.get(i8);
                                if (callLogRow2.call_id == tL_messageActionConferenceCall.call_id) {
                                    break;
                                }
                                i8++;
                                callLogActivity = this;
                            }
                            if (callLogRow2 != null) {
                                callLogRow2.calls.add(0, messageObject.messageOwner);
                                for (Long l3 : set) {
                                    long jLongValue = l3.longValue();
                                    ArrayList arrayList2 = callLogRow2.users;
                                    int size2 = arrayList2.size();
                                    int i9 = 0;
                                    do {
                                        if (i9 >= size2) {
                                            TLRPC.User user3 = getMessagesController().getUser(l3);
                                            if (user3 == null) {
                                                break;
                                            }
                                            callLogRow2.users.add(user3);
                                            break;
                                        }
                                        obj = arrayList2.get(i9);
                                        i9++;
                                    } while (jLongValue != ((TLRPC.User) obj).id);
                                }
                                callLogActivity = this;
                                callLogActivity.listView.adapter.update(true);
                            } else {
                                callLogActivity = this;
                                callLogRow = new CallLogRow();
                                callLogRow.call_id = tL_messageActionConferenceCall.call_id;
                                callLogRow.calls.clear();
                                callLogRow.calls.add(messageObject.messageOwner);
                                callLogRow.users.clear();
                                while (r9.hasNext()) {
                                    l2.getClass();
                                    user = callLogActivity.getMessagesController().getUser(l2);
                                    if (user != null) {
                                        callLogRow.users.add(user);
                                    }
                                }
                                callLogRow.type = i5;
                                callLogRow.video = messageObject.isVideoCall();
                                callLogActivity.calls.add(0, callLogRow);
                                callLogActivity.listView.adapter.update(true);
                            }
                        }
                    }
                    z = true;
                }
                ActionBarMenuItem actionBarMenuItem = callLogActivity.otherItem;
                if (actionBarMenuItem != null) {
                    actionBarMenuItem.setVisibility(callLogActivity.calls.isEmpty() ? 8 : 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.messagesDeleted) {
            if (callLogActivity.firstLoaded && !((Boolean) objArr[2]).booleanValue()) {
                ArrayList arrayList3 = (ArrayList) objArr[0];
                Iterator it = callLogActivity.calls.iterator();
                while (it.hasNext()) {
                    CallLogRow callLogRow5 = (CallLogRow) it.next();
                    Iterator it2 = callLogRow5.calls.iterator();
                    while (it2.hasNext()) {
                        if (arrayList3.contains(Integer.valueOf(((TLRPC.Message) it2.next()).id))) {
                            it2.remove();
                            i3 = 1;
                        }
                    }
                    if (callLogRow5.calls.isEmpty()) {
                        it.remove();
                    }
                }
                if (i3 == 0 || (universalRecyclerView = callLogActivity.listView) == null) {
                    return;
                }
                universalRecyclerView.adapter.update(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.activeGroupCallsUpdated) {
            callLogActivity.activeGroupCalls = callLogActivity.getMessagesController().getActiveGroupCalls();
            UniversalRecyclerView universalRecyclerView2 = callLogActivity.listView;
            if (universalRecyclerView2 != null) {
                universalRecyclerView2.adapter.update(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.chatInfoDidLoad) {
            Long l4 = callLogActivity.waitingForCallChatId;
            if (l4 == null || ((TLRPC.ChatFull) objArr[0]).id != l4.longValue() || callLogActivity.getMessagesController().getGroupCall(callLogActivity.waitingForCallChatId.longValue(), true) == null) {
                return;
            }
            VoIPHelper.startCall(callLogActivity.lastCallChat, null, null, false, callLogActivity.getParentActivity(), callLogActivity, callLogActivity.getAccountInstance());
            callLogActivity.waitingForCallChatId = null;
            return;
        }
        if (i == NotificationCenter.groupCallUpdated && (l = callLogActivity.waitingForCallChatId) != null && l.equals((Long) objArr[0])) {
            VoIPHelper.startCall(callLogActivity.lastCallChat, null, null, false, callLogActivity.getParentActivity(), callLogActivity, callLogActivity.getAccountInstance());
            callLogActivity.waitingForCallChatId = null;
        }
    }

    private static boolean eq(long j, ArrayList arrayList) {
        return arrayList.size() == 1 && ((TLRPC.User) arrayList.get(0)).id == j;
    }

    private static boolean eq(Set set, ArrayList arrayList) {
        if (set.size() != arrayList.size()) {
            return false;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (!set.contains(Long.valueOf(((TLRPC.User) obj).id))) {
                return false;
            }
        }
        return true;
    }

    static class CallCell extends FrameLayout {
        private final AvatarsImageView avatarsImageView;
        private final CheckBox2 checkBox;
        private final int currentAccount;
        private final ImageView imageView;
        private final ProfileSearchCell profileSearchCell;

        public CallCell(Context context, int i) {
            super(context);
            this.currentAccount = i;
            ProfileSearchCell profileSearchCell = new ProfileSearchCell(context);
            this.profileSearchCell = profileSearchCell;
            profileSearchCell.setCallCellStyle();
            profileSearchCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(32.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(32.0f), 0);
            profileSearchCell.setSublabelOffset(AndroidUtilities.dp(LocaleController.isRTL ? 2.0f : -2.0f), -AndroidUtilities.dp(7.0f));
            addView(profileSearchCell, LayoutHelper.createFrame(-1, -1.0f));
            AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
            this.avatarsImageView = avatarsImageView;
            avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            avatarsImageView.setStepFactor(0.4f);
            avatarsImageView.setSize(AndroidUtilities.dp(29.0f));
            avatarsImageView.setCentered(true);
            avatarsImageView.setVisibility(8);
            addView(avatarsImageView, LayoutHelper.createFrame(72, -1.0f, LocaleController.isRTL ? 5 : 3, -2.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setColorFilter(Theme.getColor(Theme.key_telegram_color_text), PorterDuff.Mode.SRC_IN);
            imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector), 1));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setContentDescription(LocaleController.getString(R.string.Call));
            addView(imageView, LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
            CheckBox2 checkBox2 = new CheckBox2(context, 21);
            this.checkBox = checkBox2;
            checkBox2.getCheckBoxBase().setBackgroundColor(Theme.getColor(Theme.key_telegram_color));
            checkBox2.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(false);
            checkBox2.setDrawBackgroundAsArc(3);
            addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
        }

        public void setChecked(boolean z, boolean z2) {
            CheckBox2 checkBox2 = this.checkBox;
            if (checkBox2 == null) {
                return;
            }
            checkBox2.setChecked(z, z2);
        }

        public void set(CallLogRow callLogRow, View.OnClickListener onClickListener) {
            SpannableString spannableString;
            this.imageView.setImageResource(callLogRow.video ? R.drawable.menu_videocall : R.drawable.menu_call_create_2_24);
            TLRPC.Message message = (TLRPC.Message) callLogRow.calls.get(0);
            String str = LocaleController.isRTL ? "\u202b" : "";
            if (callLogRow.calls.size() == 1) {
                spannableString = new SpannableString(str + "  " + LocaleController.formatDateCallLog(message.date));
            } else {
                spannableString = new SpannableString(String.format(str + "  (%d) %s", Integer.valueOf(callLogRow.calls.size()), LocaleController.formatDateCallLog(message.date)));
            }
            SpannableString spannableString2 = spannableString;
            int i = callLogRow.type;
            if (i == 0) {
                spannableString2.setSpan(iconOut(getContext()), str.length(), str.length() + 1, 33);
            } else if (i == 1) {
                spannableString2.setSpan(iconIn(getContext()), str.length(), str.length() + 1, 33);
            } else if (i == 2) {
                spannableString2.setSpan(iconMissedIn(getContext()), str.length(), str.length() + 1, 33);
            } else if (i == 3) {
                spannableString2.setSpan(iconMissedOut(getContext()), str.length(), str.length() + 1, 33);
            }
            if (callLogRow.call_id != 0) {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < Math.min(3, callLogRow.users.size()); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(DialogObject.getShortName((TLObject) callLogRow.users.get(i2)));
                }
                if (callLogRow.users.size() > 3) {
                    sb.append(" ");
                    sb.append(LocaleController.formatPluralString("AndOther", callLogRow.users.size() - 3, new Object[0]));
                }
                ArrayList arrayList = new ArrayList(callLogRow.users);
                arrayList.add(UserConfig.getInstance(this.currentAccount).getCurrentUser());
                this.profileSearchCell.setAllowEmojiStatus(false);
                this.profileSearchCell.setData(callLogRow.users.isEmpty() ? null : callLogRow.users.get(0), null, sb.toString(), spannableString2, false, false);
                this.avatarsImageView.setVisibility(0);
                this.profileSearchCell.avatarImage.clearImage();
                this.profileSearchCell.dontDrawAvatar = true;
                int iMin = Math.min(3, arrayList.size());
                for (int i3 = 0; i3 < iMin; i3++) {
                    this.avatarsImageView.setObject(i3, this.currentAccount, (TLObject) arrayList.get(i3));
                }
                this.avatarsImageView.commitTransition(false);
            } else {
                this.profileSearchCell.setAllowEmojiStatus(true);
                this.profileSearchCell.setData(callLogRow.users.isEmpty() ? null : callLogRow.users.get(0), null, null, spannableString2, false, false);
                this.avatarsImageView.setVisibility(8);
                this.profileSearchCell.dontDrawAvatar = false;
            }
            this.imageView.setTag(callLogRow);
            this.imageView.setOnClickListener(onClickListener);
        }

        private static ImageSpan iconOut(Context context) {
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
            drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3), PorterDuff.Mode.MULTIPLY));
            return new ImageSpan(drawableMutate, 0);
        }

        private static ImageSpan iconIn(Context context) {
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
            drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3), PorterDuff.Mode.MULTIPLY));
            return new ImageSpan(drawableMutate, 0);
        }

        private static ImageSpan iconMissedIn(Context context) {
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
            drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_fill_RedNormal), PorterDuff.Mode.MULTIPLY));
            return new ImageSpan(drawableMutate, 0);
        }

        private static ImageSpan iconMissedOut(Context context) {
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
            drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_fill_RedNormal), PorterDuff.Mode.MULTIPLY));
            return new ImageSpan(drawableMutate, 0);
        }

        public static final class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public CallCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new CallCell(context, i);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                CallCell callCell = (CallCell) view;
                callCell.set((CallLogRow) uItem.object, uItem.clickCallback);
                callCell.setChecked(uItem.checked, false);
            }

            public static UItem of(CallLogRow callLogRow, View.OnClickListener onClickListener) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.object = callLogRow;
                uItemOfFactory.clickCallback = onClickListener;
                return uItemOfFactory;
            }
        }
    }

    private static class GroupCallCell extends FrameLayout {
        private final ProgressButton button;
        private TLRPC.Chat currentChat;
        private final ProfileSearchCell profileSearchCell;

        public GroupCallCell(Context context) {
            super(context);
            String string = LocaleController.getString(R.string.VoipChatJoin);
            ProgressButton progressButton = new ProgressButton(context);
            this.button = progressButton;
            int iCeil = (int) Math.ceil(progressButton.getPaint().measureText(string));
            ProfileSearchCell profileSearchCell = new ProfileSearchCell(context);
            this.profileSearchCell = profileSearchCell;
            profileSearchCell.setCallCellStyle();
            profileSearchCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(44.0f) + iCeil : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(44.0f) + iCeil, 0);
            profileSearchCell.setSublabelOffset(0, -AndroidUtilities.dp(4.0f));
            addView(profileSearchCell, LayoutHelper.createFrame(-1, -1.0f));
            progressButton.setText(string);
            progressButton.setTextSize(1, 14.0f);
            progressButton.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText));
            progressButton.setProgressColor(Theme.getColor(Theme.key_featuredStickers_buttonProgress));
            progressButton.setBackgroundRoundRect(Theme.getColor(Theme.key_telegram_color), Theme.getColor(Theme.key_featuredStickers_addButtonPressed), 16.0f);
            progressButton.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
            addView(progressButton, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
        }

        public void setChat(TLRPC.Chat chat, View.OnClickListener onClickListener) {
            String lowerCase;
            this.currentChat = chat;
            this.button.setTag(Long.valueOf(chat.id));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                if (!ChatObject.isPublic(chat)) {
                    lowerCase = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                } else {
                    lowerCase = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                }
            } else if (chat.has_geo) {
                lowerCase = LocaleController.getString(R.string.MegaLocation);
            } else if (!ChatObject.isPublic(chat)) {
                lowerCase = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
            } else {
                lowerCase = LocaleController.getString(R.string.MegaPublic).toLowerCase();
            }
            this.profileSearchCell.setData(chat, null, null, lowerCase, false, false);
            this.button.setOnClickListener(onClickListener);
        }

        public static final class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public GroupCallCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new GroupCallCell(context);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((GroupCallCell) view).setChat((TLRPC.Chat) uItem.object, uItem.clickCallback);
            }

            public static UItem of(TLRPC.Chat chat, View.OnClickListener onClickListener) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.object = chat;
                uItemOfFactory.clickCallback = onClickListener;
                return uItemOfFactory;
            }
        }
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        getCalls(0, 50);
        this.activeGroupCalls = getMessagesController().getActiveGroupCalls();
        getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.activeGroupCallsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.needFinishFragment = bundle.getBoolean("needFinishFragment", true);
            this.hasMainTabs = this.arguments.getBoolean("hasMainTabs", false);
        }
        this.additionNavigationBarHeight = this.hasMainTabs ? AndroidUtilities.dp(72.0f) : 0;
        this.additionFloatingButtonOffset = this.hasMainTabs ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.activeGroupCallsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
    }

    @Override
    public View createView(Context context) {
        if (!this.hasMainTabs) {
            this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i != -1) {
                    if (i == 2) {
                        CallLogActivity.this.showDeleteAlert(false);
                    }
                } else if (((BaseFragment) CallLogActivity.this).actionBar.isActionModeShowed()) {
                    CallLogActivity.this.hideActionMode(true);
                } else {
                    CallLogActivity.this.finishFragment();
                }
            }
        });
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(10, R.drawable.ic_ab_other);
        this.otherItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.otherItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.showItemOptions();
            }
        });
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.f$0.onClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, new Utilities.Callback5Return() {
            @Override
            public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return Boolean.valueOf(this.f$0.onLongClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue()));
            }
        });
        this.listView = universalRecyclerView;
        int i = Theme.key_windowBackgroundGray;
        universalRecyclerView.setBackgroundColor(Theme.getColor(i, this.resourceProvider));
        this.listView.setSections();
        this.listView.adapter.setApplyBackground(false);
        this.contentView = new SizeNotifierFrameLayout(context) {
            @Override
            protected void onMeasure(int i2, int i3) {
                measureChildWithMargins(((BaseFragment) CallLogActivity.this).actionBar, i2, 0, i3, 0);
                ((ViewGroup.MarginLayoutParams) CallLogActivity.this.topPanelLayout.getLayoutParams()).topMargin = ((BaseFragment) CallLogActivity.this).actionBar.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                ((ViewGroup.MarginLayoutParams) CallLogActivity.this.emptyView.getLayoutParams()).topMargin = ((BaseFragment) CallLogActivity.this).actionBar.getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) CallLogActivity.this.headerShadowView.getLayoutParams()).topMargin = ((BaseFragment) CallLogActivity.this).actionBar.getMeasuredHeight();
                CallLogActivity.this.checkUi_listViewPadding();
                super.onMeasure(i2, i3);
            }

            @Override
            protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                super.onLayout(z, i2, i3, i4, i5);
                CallLogActivity.this.checkUi_floatingButton();
                CallLogActivity.this.checkUi_listClip();
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (Build.VERSION.SDK_INT >= 31 && CallLogActivity.this.scrollableViewNoiseSuppressor != null) {
                    CallLogActivity.this.blur3_InvalidateBlur();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (CallLogActivity.this.iBlur3SourceGlassFrosted != null && !CallLogActivity.this.iBlur3SourceGlassFrosted.inRecording()) {
                        RecordingCanvas recordingCanvasBeginRecording = CallLogActivity.this.iBlur3SourceGlassFrosted.beginRecording(measuredWidth, measuredHeight);
                        recordingCanvasBeginRecording.drawColor(CallLogActivity.this.getThemedColor(Theme.key_windowBackgroundGray));
                        if (SharedConfig.chatBlurEnabled()) {
                            CallLogActivity.this.scrollableViewNoiseSuppressor.draw(recordingCanvasBeginRecording, -3);
                        }
                        CallLogActivity.this.iBlur3SourceGlassFrosted.endRecording();
                    }
                    if (CallLogActivity.this.iBlur3SourceGlass != null && !CallLogActivity.this.iBlur3SourceGlass.inRecording()) {
                        RecordingCanvas recordingCanvasBeginRecording2 = CallLogActivity.this.iBlur3SourceGlass.beginRecording(measuredWidth, measuredHeight);
                        recordingCanvasBeginRecording2.drawColor(CallLogActivity.this.getThemedColor(Theme.key_windowBackgroundGray));
                        if (SharedConfig.chatBlurEnabled()) {
                            CallLogActivity.this.scrollableViewNoiseSuppressor.draw(recordingCanvasBeginRecording2, -2);
                        }
                        CallLogActivity.this.iBlur3SourceGlass.endRecording();
                    }
                    CallLogActivity.this.iBlur3Invalidated = false;
                }
                super.dispatchDraw(canvas);
            }

            @Override
            public void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
                if (Build.VERSION.SDK_INT < 29 || !SharedConfig.chatBlurEnabled() || CallLogActivity.this.iBlur3SourceGlassFrosted == null) {
                    canvas.drawRect(rect, paint);
                    return;
                }
                canvas.save();
                canvas.translate(0.0f, -f);
                CallLogActivity.this.iBlur3SourceGlassFrosted.draw(canvas, rect.left, rect.top + f, rect.right, rect.bottom + f);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(178);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
            }
        };
        this.iBlur3FactoryLiquidGlass.setSourceRootView(new ViewPositionWatcher(this.contentView), this.contentView);
        UniversalRecyclerView universalRecyclerView2 = this.listView;
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.contentView;
        Objects.requireNonNull(universalRecyclerView2);
        this.iBlur3Capture = new ViewGroupPartRenderer(universalRecyclerView2, sizeNotifierFrameLayout, new CallLogActivity$$ExternalSyntheticLambda6(universalRecyclerView2));
        this.listView.addEdgeEffectListener(new Runnable() {
            @Override
            public final void run() {
                CallLogActivity callLogActivity = this.f$0;
                callLogActivity.listView.postOnAnimation(new Runnable() {
                    @Override
                    public final void run() {
                        CallLogActivity.$r8$lambda$qN2blfs3Lfi6WHzs2zRuObCSTes(this.f$0);
                    }
                });
            }
        });
        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = this.contentView;
        this.fragmentView = sizeNotifierFrameLayout2;
        sizeNotifierFrameLayout2.setBackgroundColor(Theme.getColor(i));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        this.flickerLoadingView = flickerLoadingView;
        flickerLoadingView.setViewType(8);
        this.flickerLoadingView.setBackgroundColor(Theme.getColor(i));
        this.flickerLoadingView.showDate(false);
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, this.flickerLoadingView);
        this.emptyView = emptyTextProgressView;
        this.contentView.addView(emptyTextProgressView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setClipToPadding(false);
        this.listView.setEmptyView(this.emptyView);
        UniversalRecyclerView universalRecyclerView3 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        universalRecyclerView3.setLayoutManager(linearLayoutManager);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(this.listView, this.layoutManager);
        this.scrollHelper = recyclerAnimationScrollHelper;
        recyclerAnimationScrollHelper.setScrollListener(new RecyclerAnimationScrollHelper.ScrollListener() {
            @Override
            public final void onScroll() {
                this.f$0.blur3_InvalidateBlur();
            }
        });
        SizeNotifierFrameLayout sizeNotifierFrameLayout3 = this.contentView;
        UniversalRecyclerView universalRecyclerView4 = this.listView;
        float f = -this.ADDITIONAL_LIST_HEIGHT_DP;
        sizeNotifierFrameLayout3.addView(universalRecyclerView4, LayoutHelper.createFrame(-1, -1.0f, 3, 0.0f, f, 0.0f, f));
        this.listView.setOnScrollListener(new AnonymousClass3());
        if (this.loading) {
            this.emptyView.showProgress();
        } else {
            this.emptyView.showTextView();
        }
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider);
        this.floatingButton = fragmentFloatingButton;
        fragmentFloatingButton.imageView.setImageResource(R.drawable.filled_calls_plus);
        this.floatingButton.setContentDescription(LocaleController.getString(R.string.Call));
        this.floatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.openCreateCall();
            }
        });
        this.contentView.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParams());
        DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = new DialogsActivityTopPanelLayout(context);
        this.topPanelLayout = dialogsActivityTopPanelLayout;
        dialogsActivityTopPanelLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        this.topPanelLayout.setOnAnimatedHeightChangedListener(new Runnable() {
            @Override
            public final void run() {
                CallLogActivity.m1454$r8$lambda$cSpa1HsOBBiFNriA8HdYrNe_0(this.f$0);
            }
        });
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = this.iBlur3FactoryLiquidGlass.create(this.topPanelLayout, BlurredBackgroundProviderImpl.topPanel(this.resourceProvider));
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(24.0f));
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(7.0f));
        this.topPanelLayout.setBlurredBackground(blurredBackgroundDrawableCreate);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentContextViewWrapper = frameLayout;
        this.topPanelLayout.addView(frameLayout);
        this.topPanelLayout.setViewVisible(this.fragmentContextViewWrapper, true, false);
        FragmentContextView fragmentContextView = new FragmentContextView(context, this, this.contentView, false, this.resourceProvider) {
            @Override
            public void setVisibility(int i2) {
                CallLogActivity.this.topPanelLayout.setViewVisible(CallLogActivity.this.fragmentContextViewWrapper, i2 == 0);
            }
        };
        this.fragmentContextView = fragmentContextView;
        this.fragmentContextViewWrapper.addView(fragmentContextView);
        this.topPanelLayout.setCallFragmentContextView(this.fragmentContextView);
        this.contentView.addView(this.topPanelLayout, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        this.contentView.addView(this.actionBar);
        HeaderShadowView headerShadowView = new HeaderShadowView(context, this.parentLayout);
        this.headerShadowView = headerShadowView;
        headerShadowView.setShadowVisible(false, false);
        this.contentView.addView(this.headerShadowView, LayoutHelper.createFrame(-1, 5, 48));
        this.actionBar.setDrawBlurBackground(this.contentView);
        this.actionBar.setAdaptiveBackground(this.listView);
        Bulletin.addDelegate(this, new Bulletin.Delegate() {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public boolean clipWithGradient(int i2) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i2);
            }

            @Override
            public int getTopOffset(int i2) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i2);
            }

            @Override
            public void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }

            @Override
            public void onBottomOffsetChange(float f2) {
                CallLogActivity callLogActivity = CallLogActivity.this;
                callLogActivity.additionalFloatingTranslation = Math.max(0.0f, (f2 - callLogActivity.navigationBarHeight) - CallLogActivity.this.additionFloatingButtonOffset);
                CallLogActivity.this.checkUi_floatingButton();
            }

            @Override
            public int getBottomOffset(int i2) {
                return CallLogActivity.this.navigationBarHeight + CallLogActivity.this.additionFloatingButtonOffset;
            }
        });
        if (this.hasMainTabs) {
            ViewCompat.setOnApplyWindowInsetsListener(this.fragmentView, new OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return this.f$0.onInsetsInternal(view, windowInsetsCompat);
                }
            });
        }
        return this.fragmentView;
    }

    public static void $r8$lambda$qN2blfs3Lfi6WHzs2zRuObCSTes(CallLogActivity callLogActivity) {
        callLogActivity.checkUi_listClip();
        callLogActivity.blur3_InvalidateBlur();
    }

    class AnonymousClass3 extends RecyclerView.OnScrollListener {
        private boolean scrollUpdated;

        AnonymousClass3() {
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int iFindFirstVisibleItemPosition = CallLogActivity.this.layoutManager.findFirstVisibleItemPosition();
            int iAbs = iFindFirstVisibleItemPosition == -1 ? 0 : Math.abs(CallLogActivity.this.layoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1;
            if (iAbs > 0) {
                int itemCount = CallLogActivity.this.listView.adapter.getItemCount();
                if (!CallLogActivity.this.endReached && !CallLogActivity.this.loading && !CallLogActivity.this.calls.isEmpty() && iAbs + iFindFirstVisibleItemPosition >= itemCount - 5) {
                    final CallLogRow callLogRow = (CallLogRow) CallLogActivity.this.calls.get(CallLogActivity.this.calls.size() - 1);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            CallLogActivity.AnonymousClass3.$r8$lambda$M0op4PJx3nSJ6p4kubFGvVsfgY4(this.f$0, callLogRow);
                        }
                    });
                }
            }
            View childAt = recyclerView.getChildAt(0);
            int top = childAt != null ? childAt.getTop() : 0;
            if (i2 != 0 && this.scrollUpdated) {
                CallLogActivity.this.floatingButton.setButtonVisible(i2 < 0, true);
            }
            this.scrollUpdated = true;
            CallLogActivity.this.headerShadowView.setShadowVisible(iFindFirstVisibleItemPosition != 0 || top < CallLogActivity.this.listView.getPaddingTop(), true);
            if (Build.VERSION.SDK_INT < 31 || CallLogActivity.this.scrollableViewNoiseSuppressor == null) {
                return;
            }
            CallLogActivity.this.scrollableViewNoiseSuppressor.onScrolled(i, i2);
            CallLogActivity.this.blur3_InvalidateBlur();
        }

        public static void $r8$lambda$M0op4PJx3nSJ6p4kubFGvVsfgY4(AnonymousClass3 anonymousClass3, CallLogRow callLogRow) {
            CallLogActivity callLogActivity = CallLogActivity.this;
            ArrayList arrayList = callLogRow.calls;
            callLogActivity.getCalls(((TLRPC.Message) arrayList.get(arrayList.size() - 1)).id, 100);
        }
    }

    public static void m1454$r8$lambda$cSpa1HsOBBiFNriA8HdYrNe_0(CallLogActivity callLogActivity) {
        callLogActivity.blur3_InvalidateBlur();
        callLogActivity.checkUi_listViewPadding();
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        TLRPC.Chat chat;
        boolean zIsEmpty = this.activeGroupCalls.isEmpty();
        boolean zIsEmpty2 = this.calls.isEmpty();
        if (!zIsEmpty || !zIsEmpty2) {
            arrayList.add(UItem.asButton(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2)).accent());
            if (!getUserConfig().showCallsTab) {
                arrayList.add(UItem.asButton(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs)).accent());
            }
            arrayList.add(UItem.asShadow(null));
        }
        int i = 0;
        if (!zIsEmpty) {
            ArrayList arrayList2 = this.activeGroupCalls;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                Long l = (Long) obj;
                if (l != null && (chat = getMessagesController().getChat(l)) != null) {
                    arrayList.add(GroupCallCell.Factory.of(chat, new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.onGroupCallClick(view);
                        }
                    }));
                }
            }
            arrayList.add(UItem.asShadow(null));
        }
        if (zIsEmpty2) {
            return;
        }
        ArrayList arrayList3 = this.calls;
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            CallLogRow callLogRow = (CallLogRow) obj2;
            arrayList.add(CallCell.Factory.of(callLogRow, onCallClick(callLogRow)).setChecked(isSelected(callLogRow.calls)));
        }
        if (this.endReached) {
            return;
        }
        arrayList.add(UItem.asFlicker(-1, 8));
        arrayList.add(UItem.asFlicker(-2, 8));
        arrayList.add(UItem.asFlicker(-3, 8));
    }

    private View.OnClickListener onCallClick(final CallLogRow callLogRow) {
        return new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CallLogActivity.$r8$lambda$m7UEKMmZG6TWYjlrQxTQRWVS340(this.f$0, callLogRow, view);
            }
        };
    }

    public static void $r8$lambda$m7UEKMmZG6TWYjlrQxTQRWVS340(final CallLogActivity callLogActivity, CallLogRow callLogRow, View view) {
        callLogActivity.getClass();
        if (callLogRow.users.size() == 1) {
            TLRPC.User user = (TLRPC.User) callLogRow.users.get(0);
            TLRPC.UserFull userFull = callLogActivity.getMessagesController().getUserFull(user.id);
            callLogActivity.lastCallUser = user;
            boolean z = callLogRow.video;
            VoIPHelper.startCall(user, z, z || (userFull != null && userFull.video_calls_available), callLogActivity.getParentActivity(), null, callLogActivity.getAccountInstance());
            return;
        }
        final boolean z2 = callLogRow.video;
        final HashSet hashSet = new HashSet();
        ArrayList arrayList = callLogRow.users;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hashSet.add(Long.valueOf(((TLRPC.User) obj).id));
        }
        final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) callLogRow.calls.get(0)).id;
        final AlertDialog alertDialog = new AlertDialog(callLogActivity.getContext(), 3);
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = callLogActivity.getMessagesController().conferenceCallSizeLimit;
        final int iSendRequest = callLogActivity.getConnectionsManager().sendRequest(getgroupcall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                CallLogActivity.$r8$lambda$ozUEIPtChsruTx7l9EX_dHK_Hfo(this.f$0, alertDialog, hashSet, tL_inputGroupCallInviteMessage, z2, tLObject, tL_error);
            }
        });
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                this.f$0.getConnectionsManager().cancelRequest(iSendRequest, true);
            }
        });
        alertDialog.showDelayed(600L);
    }

    public static void $r8$lambda$ozUEIPtChsruTx7l9EX_dHK_Hfo(final CallLogActivity callLogActivity, final AlertDialog alertDialog, final HashSet hashSet, final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, final boolean z, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        callLogActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CallLogActivity.$r8$lambda$nPGHsNUpojB8BO7bFDCMDldnWNE(this.f$0, alertDialog, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error);
            }
        });
    }

    public static void $r8$lambda$nPGHsNUpojB8BO7bFDCMDldnWNE(CallLogActivity callLogActivity, AlertDialog alertDialog, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLRPC.TL_error tL_error) {
        callLogActivity.getClass();
        alertDialog.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            callLogActivity.getMessagesController().putUsers(groupcall.users, false);
            callLogActivity.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                callLogActivity.showDialog(new CreateGroupCallSheet(callLogActivity.getContext(), hashSet));
                return;
            } else {
                VoIPHelper.joinConference(callLogActivity.getParentActivity(), callLogActivity.currentAccount, tL_inputGroupCallInviteMessage, z, groupcall.call);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            callLogActivity.showDialog(new CreateGroupCallSheet(callLogActivity.getContext(), hashSet));
        } else if (tL_error != null) {
            BulletinFactory.of(callLogActivity).showForError(tL_error);
        }
    }

    public void onGroupCallClick(View view) {
        Long l = (Long) view.getTag();
        ChatObject.Call groupCall = getMessagesController().getGroupCall(l.longValue(), false);
        TLRPC.Chat chat = getMessagesController().getChat(l);
        this.lastCallChat = chat;
        if (groupCall != null) {
            VoIPHelper.startCall(chat, null, null, false, getParentActivity(), this, getAccountInstance());
        } else {
            this.waitingForCallChatId = l;
            getMessagesController().loadFullChat(l.longValue(), 0, true);
        }
    }

    public void onClick(UItem uItem, View view, int i, float f, float f2) {
        int i2 = uItem.id;
        if (i2 == 2) {
            setCallsTabVisible(true);
            BulletinFactory.of(this).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasShownTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.setCallsTabVisible(false);
                }
            }).setDuration(5000).show();
            return;
        }
        if (i2 == 1) {
            openCreateCall();
            return;
        }
        Object obj = uItem.object;
        if (obj instanceof CallLogRow) {
            CallLogRow callLogRow = (CallLogRow) obj;
            if (this.actionBar.isActionModeShowed()) {
                addOrRemoveSelectedDialog(callLogRow.calls, (CallCell) view);
                return;
            }
            if (callLogRow.call_id != 0 && !callLogRow.calls.isEmpty()) {
                final boolean z = callLogRow.video;
                final HashSet hashSet = new HashSet();
                ArrayList arrayList = callLogRow.users;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    hashSet.add(Long.valueOf(((TLRPC.User) obj2).id));
                }
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) callLogRow.calls.get(0)).id;
                final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = getMessagesController().conferenceCallSizeLimit;
                final int iSendRequest = getConnectionsManager().sendRequest(getgroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        CallLogActivity.m1447$r8$lambda$OkHhIWKA2MSMYxdWfDEaOx9o68(this.f$0, alertDialog, hashSet, tL_inputGroupCallInviteMessage, z, tLObject, tL_error);
                    }
                });
                alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public final void onCancel(DialogInterface dialogInterface) {
                        this.f$0.getConnectionsManager().cancelRequest(iSendRequest, true);
                    }
                });
                alertDialog.showDelayed(600L);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", MessageObject.getDialogId((TLRPC.Message) callLogRow.calls.get(0)));
            bundle.putInt("message_id", ((TLRPC.Message) callLogRow.calls.get(0)).id);
            getNotificationCenter().postNotificationName(NotificationCenter.closeChats, new Object[0]);
            presentFragment(new ChatActivity(bundle), this.needFinishFragment);
            return;
        }
        if (view instanceof GroupCallCell) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", ((GroupCallCell) view).currentChat.id);
            getNotificationCenter().postNotificationName(NotificationCenter.closeChats, new Object[0]);
            presentFragment(new ChatActivity(bundle2), this.needFinishFragment);
        }
    }

    public static void m1447$r8$lambda$OkHhIWKA2MSMYxdWfDEaOx9o68(final CallLogActivity callLogActivity, final AlertDialog alertDialog, final HashSet hashSet, final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, final boolean z, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        callLogActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CallLogActivity.$r8$lambda$HHgZDKo79OmwyOuZ1flN6pWbJlc(this.f$0, alertDialog, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error);
            }
        });
    }

    public static void $r8$lambda$HHgZDKo79OmwyOuZ1flN6pWbJlc(CallLogActivity callLogActivity, AlertDialog alertDialog, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLRPC.TL_error tL_error) {
        callLogActivity.getClass();
        alertDialog.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            callLogActivity.getMessagesController().putUsers(groupcall.users, false);
            callLogActivity.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                callLogActivity.showDialog(new CreateGroupCallSheet(callLogActivity.getContext(), hashSet));
                return;
            } else {
                VoIPHelper.joinConference(callLogActivity.getParentActivity(), callLogActivity.currentAccount, tL_inputGroupCallInviteMessage, z, groupcall.call);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            callLogActivity.showDialog(new CreateGroupCallSheet(callLogActivity.getContext(), hashSet));
        } else if (tL_error != null) {
            BulletinFactory.of(callLogActivity).showForError(tL_error);
        }
    }

    public boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        Object obj = uItem.object;
        if (!(obj instanceof CallLogRow)) {
            return false;
        }
        addOrRemoveSelectedDialog(((CallLogRow) obj).calls, (CallCell) view);
        return true;
    }

    @Override
    public void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.hideCallTabsHintWasShown || !getUserConfig().showCallsTab || MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) >= 2) {
            return;
        }
        HintView2 hintView2 = new HintView2(getContext(), 1);
        this.hideCallTabsHintView = hintView2;
        hintView2.setDuration(3000L);
        this.hideCallTabsHintView.setJoint(1.0f, -25.0f);
        this.hideCallTabsHintView.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.hideCallTabsHintView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.TapToHideCallsTab)));
        this.contentView.addView(this.hideCallTabsHintView, LayoutHelper.createFrame(-1, 80, 48));
        this.hideCallTabsHintView.setTranslationY((AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(16.0f));
        this.hideCallTabsHintView.show();
        this.hideCallTabsHintWasShown = true;
        MessagesController.getGlobalMainSettings().edit().putInt("hidecallshint", MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) + 1).apply();
    }

    @Override
    public ActionBar createActionBar(Context context) {
        ActionBar actionBarCreateActionBar = super.createActionBar(context);
        actionBarCreateActionBar.setUseContainerForTitles();
        actionBarCreateActionBar.createAdditionalSubTitleOverlayContainer();
        actionBarCreateActionBar.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        actionBarCreateActionBar.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(2.0f));
        actionBarCreateActionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        actionBarCreateActionBar.setAddToContainer(false);
        return actionBarCreateActionBar;
    }

    public void showDeleteAlert(final boolean z) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        if (z) {
            builder.setTitle(LocaleController.getString(R.string.DeleteAllCalls));
            builder.setMessage(LocaleController.getString(R.string.DeleteAllCallsText));
        } else {
            builder.setTitle(LocaleController.getString(R.string.DeleteCalls));
            builder.setMessage(LocaleController.getString(R.string.DeleteSelectedCallsText));
        }
        final boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 1);
        checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
        checkBoxCell.setText(LocaleController.getString(R.string.DeleteCallsForEveryone), "", false, false);
        checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(8.0f), 0);
        frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        checkBoxCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CallLogActivity.$r8$lambda$uV1lQwC7qTyx7Jl5yfLxKGDNuYM(zArr, view);
            }
        });
        builder.setView(frameLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                CallLogActivity.$r8$lambda$VPUE_VhzqxkXUAV4id7yfSN7MxI(this.f$0, z, zArr, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public static void $r8$lambda$uV1lQwC7qTyx7Jl5yfLxKGDNuYM(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void $r8$lambda$VPUE_VhzqxkXUAV4id7yfSN7MxI(CallLogActivity callLogActivity, boolean z, boolean[] zArr, AlertDialog alertDialog, int i) {
        if (z) {
            callLogActivity.getClass();
            callLogActivity.deleteAllMessages(zArr[0]);
            callLogActivity.calls.clear();
            callLogActivity.loading = false;
            callLogActivity.endReached = true;
            callLogActivity.otherItem.setVisibility(8);
            callLogActivity.listView.adapter.update(true);
        } else {
            callLogActivity.getMessagesController().deleteMessages(new ArrayList<>(callLogActivity.selectedIds), null, null, 0L, 0, zArr[0], 0);
        }
        callLogActivity.hideActionMode(false);
    }

    private void deleteAllMessages(final boolean z) {
        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
        tL_messages_deletePhoneCallHistory.revoke = z;
        getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                CallLogActivity.$r8$lambda$xb7f3CTGxpchsGCIGSnxeNcCsks(this.f$0, z, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$xb7f3CTGxpchsGCIGSnxeNcCsks(CallLogActivity callLogActivity, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        callLogActivity.getClass();
        if (tLObject != null) {
            TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
            TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
            tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
            tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
            tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
            TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
            tL_updates.updates.add(tL_updateDeleteMessages);
            callLogActivity.getMessagesController().processUpdates(tL_updates, false);
            if (tL_messages_affectedFoundMessages.offset != 0) {
                callLogActivity.deleteAllMessages(z);
            }
        }
    }

    public void hideActionMode(boolean z) {
        this.actionBar.hideActionMode();
        this.selectedIds.clear();
        int childCount = this.listView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof CallCell) {
                ((CallCell) childAt).setChecked(false, z);
            }
        }
        this.listView.adapter.update(true);
    }

    private boolean isSelected(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (this.selectedIds.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i)).id))) {
                return true;
            }
        }
        return false;
    }

    private void createActionMode() {
        if (this.actionBar.actionModeIsExist(null)) {
            return;
        }
        ActionBarMenu actionBarMenuCreateActionMode = this.actionBar.createActionMode();
        if (this.hasMainTabs) {
            ImageView imageView = new ImageView(getContext());
            this.actionModeCloseView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.actionModeCloseView.setImageDrawable(new BackDrawable(true));
            this.actionModeCloseView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarActionModeDefaultIcon), PorterDuff.Mode.MULTIPLY));
            this.actionModeCloseView.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector)));
            this.actionModeCloseView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.hideActionMode(true);
                }
            });
            actionBarMenuCreateActionMode.addView(this.actionModeCloseView, LayoutHelper.createLinear(54, 54, 16));
            this.actionModeViews.add(this.actionModeCloseView);
        }
        NumberTextView numberTextView = new NumberTextView(actionBarMenuCreateActionMode.getContext());
        this.selectedDialogsCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedDialogsCountTextView.setTypeface(AndroidUtilities.bold());
        this.selectedDialogsCountTextView.setTextColor(Theme.getColor(Theme.key_actionBarActionModeDefaultIcon));
        actionBarMenuCreateActionMode.addView(this.selectedDialogsCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, this.hasMainTabs ? 18 : 72, 0, 0, 0));
        this.selectedDialogsCountTextView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return CallLogActivity.$r8$lambda$_WRNyBc9vp0gUodekqiw3i7dFMI(view, motionEvent);
            }
        });
        this.actionModeViews.add(actionBarMenuCreateActionMode.addItemWithWidth(2, R.drawable.msg_delete, AndroidUtilities.dp(54.0f), LocaleController.getString(R.string.Delete)));
    }

    private boolean addOrRemoveSelectedDialog(ArrayList arrayList, CallCell callCell) {
        if (arrayList.isEmpty()) {
            return false;
        }
        if (isSelected(arrayList)) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.selectedIds.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i)).id));
            }
            callCell.setChecked(false, true);
            showOrUpdateActionMode();
            return false;
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Integer numValueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i2)).id);
            if (!this.selectedIds.contains(numValueOf)) {
                this.selectedIds.add(numValueOf);
            }
        }
        callCell.setChecked(true, true);
        showOrUpdateActionMode();
        return true;
    }

    private void showOrUpdateActionMode() {
        boolean z = true;
        if (this.actionBar.isActionModeShowed()) {
            if (this.selectedIds.isEmpty()) {
                hideActionMode(true);
                return;
            }
        } else {
            createActionMode();
            this.actionBar.showActionMode();
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.actionModeViews.size(); i++) {
                View view = (View) this.actionModeViews.get(i);
                view.setPivotY(ActionBar.getCurrentActionBarHeight() / 2.0f);
                AndroidUtilities.clearDrawableAnimation(view);
                arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.start();
            z = false;
        }
        this.selectedDialogsCountTextView.setNumber(this.selectedIds.size(), z);
    }

    public void getCalls(int i, int i2) {
        if (this.loading) {
            return;
        }
        this.loading = true;
        EmptyTextProgressView emptyTextProgressView = this.emptyView;
        if (emptyTextProgressView != null && !this.firstLoaded) {
            emptyTextProgressView.showProgress();
        }
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i2;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.q = "";
        tL_messages_search.offset_id = i;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                CallLogActivity.m1445$r8$lambda$CGWiUpo2arwqgOxi3LlJWv1dM8(this.f$0, tLObject, tL_error);
            }
        }, 2), this.classGuid);
    }

    public static void m1445$r8$lambda$CGWiUpo2arwqgOxi3LlJWv1dM8(final CallLogActivity callLogActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        callLogActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CallLogActivity.$r8$lambda$M_FQe7DSToe_3WODBWDXYIrN0Cs(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void $r8$lambda$M_FQe7DSToe_3WODBWDXYIrN0Cs(CallLogActivity callLogActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z;
        CallLogRow callLogRow;
        int i;
        TLRPC.User user;
        CallLogRow callLogRow2;
        TLRPC.User user2;
        Object obj;
        int i2 = 1;
        if (tL_error == null) {
            callLogActivity.getClass();
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(callLogActivity.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(callLogActivity.currentAccount).putChats(messages_messages.chats, false);
            callLogActivity.endReached = messages_messages.messages.isEmpty();
            if (callLogActivity.calls.isEmpty()) {
                callLogRow = null;
            } else {
                ArrayList arrayList = callLogActivity.calls;
                callLogRow = (CallLogRow) arrayList.get(arrayList.size() - 1);
            }
            int i3 = 0;
            while (i3 < messages_messages.messages.size()) {
                TLRPC.Message message = messages_messages.messages.get(i3);
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction == null || (messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                    i = i3;
                } else {
                    final long fromChatId = MessageObject.getFromChatId(message);
                    if (fromChatId == callLogActivity.getUserConfig().getClientUserId()) {
                        fromChatId = message.peer_id.user_id;
                    }
                    HashSet<Long> hashSet = new HashSet();
                    int i4 = MessageObject.getFromChatId(message) == callLogActivity.getUserConfig().getClientUserId() ? 0 : 1;
                    TLRPC.MessageAction messageAction2 = message.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction2;
                        hashSet.add(Long.valueOf(fromChatId));
                        hashSet.addAll((java.util.Collection) Collection.EL.stream(tL_messageActionConferenceCall.other_participants).map(new CallLogActivity$$ExternalSyntheticLambda12()).collect(Collectors.toSet()));
                        if (i4 == i2 && tL_messageActionConferenceCall.missed) {
                            i4 = 2;
                        }
                        int i5 = (i4 == 0 && tL_messageActionConferenceCall.missed) ? 3 : i4;
                        i = i3;
                        if (callLogRow == null || callLogRow.call_id != tL_messageActionConferenceCall.call_id) {
                            int i6 = 0;
                            while (true) {
                                if (i6 >= callLogActivity.calls.size()) {
                                    callLogRow2 = null;
                                    break;
                                }
                                CallLogRow callLogRow3 = (CallLogRow) callLogActivity.calls.get(i6);
                                int i7 = i6;
                                if (callLogRow3.call_id == tL_messageActionConferenceCall.call_id) {
                                    callLogRow2 = callLogRow3;
                                    break;
                                }
                                i6 = i7 + 1;
                            }
                        } else {
                            callLogRow2 = callLogRow;
                        }
                        if (callLogRow2 != null) {
                            callLogRow2.calls.add(0, message);
                            for (Long l : hashSet) {
                                long jLongValue = l.longValue();
                                ArrayList arrayList2 = callLogRow2.users;
                                int size = arrayList2.size();
                                int i8 = 0;
                                do {
                                    if (i8 >= size) {
                                        TLRPC.User user3 = callLogActivity.getMessagesController().getUser(l);
                                        if (user3 == null) {
                                            break;
                                        }
                                        callLogRow2.users.add(user3);
                                        break;
                                    }
                                    obj = arrayList2.get(i8);
                                    i8++;
                                } while (jLongValue != ((TLRPC.User) obj).id);
                            }
                        } else {
                            if (callLogRow != null && !callLogActivity.calls.contains(callLogRow)) {
                                callLogActivity.calls.add(callLogRow);
                            }
                            CallLogRow callLogRow4 = new CallLogRow();
                            callLogRow4.call_id = tL_messageActionConferenceCall.call_id;
                            callLogRow4.calls.clear();
                            callLogRow4.calls.add(message);
                            for (Long l2 : hashSet) {
                                l2.getClass();
                                if (Collection.EL.stream(callLogRow4.users).noneMatch(new Predicate() {
                                    public Predicate and(Predicate predicate) {
                                        return Predicate$CC.$default$and(this, predicate);
                                    }

                                    public Predicate negate() {
                                        return Predicate$CC.$default$negate(this);
                                    }

                                    public Predicate or(Predicate predicate) {
                                        return Predicate$CC.$default$or(this, predicate);
                                    }

                                    @Override
                                    public final boolean test(Object obj2) {
                                        return CallLogActivity.$r8$lambda$_0SBMTDZzqEhCFeXNeob46nKQg4(fromChatId, (TLRPC.User) obj2);
                                    }
                                }) && (user2 = callLogActivity.getMessagesController().getUser(l2)) != null) {
                                    callLogRow4.users.add(user2);
                                }
                            }
                            callLogRow4.type = i5;
                            TLRPC.MessageAction messageAction3 = message.action;
                            callLogRow4.video = messageAction3 != null && messageAction3.video;
                            callLogRow = callLogRow4;
                        }
                    } else {
                        i = i3;
                        hashSet.add(Long.valueOf(fromChatId));
                        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = message.action.reason;
                        if (i4 == 1 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                            i4 = 2;
                        }
                        int i9 = (i4 == 0 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) ? 3 : i4;
                        if (callLogRow == null || !eq(hashSet, callLogRow.users) || callLogRow.type != i9) {
                            if (callLogRow != null && !callLogActivity.calls.contains(callLogRow)) {
                                callLogActivity.calls.add(callLogRow);
                            }
                            callLogRow = new CallLogRow();
                            callLogRow.calls.clear();
                            for (Long l3 : hashSet) {
                                l3.getClass();
                                if (Collection.EL.stream(callLogRow.users).noneMatch(new Predicate() {
                                    public Predicate and(Predicate predicate) {
                                        return Predicate$CC.$default$and(this, predicate);
                                    }

                                    public Predicate negate() {
                                        return Predicate$CC.$default$negate(this);
                                    }

                                    public Predicate or(Predicate predicate) {
                                        return Predicate$CC.$default$or(this, predicate);
                                    }

                                    @Override
                                    public final boolean test(Object obj2) {
                                        return CallLogActivity.$r8$lambda$j1RuPRJt9VDbdYTsNdijSEZTiRQ(fromChatId, (TLRPC.User) obj2);
                                    }
                                }) && (user = callLogActivity.getMessagesController().getUser(l3)) != null) {
                                    callLogRow.users.add(user);
                                }
                            }
                            callLogRow.type = i9;
                            TLRPC.MessageAction messageAction4 = message.action;
                            callLogRow.video = messageAction4 != null && messageAction4.video;
                        }
                        callLogRow.calls.add(message);
                    }
                    i3 = i + 1;
                    i2 = 1;
                }
                i3 = i + 1;
                i2 = 1;
            }
            if (callLogRow != null && !callLogRow.calls.isEmpty() && !callLogActivity.calls.contains(callLogRow)) {
                callLogActivity.calls.add(callLogRow);
            }
            z = true;
        } else {
            z = true;
            callLogActivity.endReached = true;
        }
        callLogActivity.loading = false;
        if (!callLogActivity.firstLoaded) {
            callLogActivity.resumeDelayedFragmentAnimation();
        }
        callLogActivity.firstLoaded = z;
        callLogActivity.otherItem.setVisibility(callLogActivity.calls.isEmpty() ? 8 : 0);
        EmptyTextProgressView emptyTextProgressView = callLogActivity.emptyView;
        if (emptyTextProgressView != null) {
            emptyTextProgressView.showTextView();
        }
        UniversalRecyclerView universalRecyclerView = callLogActivity.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
    }

    public static boolean $r8$lambda$_0SBMTDZzqEhCFeXNeob46nKQg4(long j, TLRPC.User user) {
        return user.id == j;
    }

    public static boolean $r8$lambda$j1RuPRJt9VDbdYTsNdijSEZTiRQ(long j, TLRPC.User user) {
        return user.id == j;
    }

    @Override
    public void onResume() {
        super.onResume();
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        boolean z;
        if (i == 101 || i == 102 || i == 103) {
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = true;
                    break;
                } else {
                    if (iArr[i2] != 0) {
                        z = false;
                        break;
                    }
                    i2++;
                }
            }
            if (iArr.length <= 0 || !z) {
                VoIPHelper.permissionDenied(getParentActivity(), null, i);
            } else if (i == 103) {
                VoIPHelper.startCall(this.lastCallChat, null, null, false, getParentActivity(), this, getAccountInstance());
            } else {
                TLRPC.UserFull userFull = this.lastCallUser != null ? getMessagesController().getUserFull(this.lastCallUser.id) : null;
                VoIPHelper.startCall(this.lastCallUser, i == 102, i == 102 || (userFull != null && userFull.video_calls_available), getParentActivity(), null, getAccountInstance());
            }
        }
    }

    static class CallLogRow {
        public long call_id;
        public final ArrayList calls;
        public int type;
        public final ArrayList users;
        public boolean video;

        private CallLogRow() {
            this.users = new ArrayList();
            this.calls = new ArrayList();
        }
    }

    @Override
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        if (z) {
            this.openTransitionStarted = true;
        }
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.navigationBarHeight = i4;
        checkUi_listViewPadding();
        checkUi_floatingButton();
    }

    public void checkUi_floatingButton() {
        this.floatingButton.setTranslationY(((-this.navigationBarHeight) - this.additionFloatingButtonOffset) - this.additionalFloatingTranslation);
    }

    public void checkUi_listViewPadding() {
        this.listView.setPadding(0, AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP) + this.actionBar.getMeasuredHeight() + ((int) this.topPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.dp(14.0f))), 0, AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP) + this.navigationBarHeight + this.additionNavigationBarHeight);
        this.emptyView.setPadding(0, 0, 0, this.navigationBarHeight + this.additionNavigationBarHeight);
    }

    public void checkUi_listClip() {
        if (this.listView.hasActiveEdgeEffects()) {
            this.listView.setClipBounds(null);
        } else {
            this.tmpClipRect.set(0, AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP) + this.actionBar.getMeasuredHeight(), this.listView.getMeasuredWidth(), this.listView.getMeasuredHeight() - AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP));
            this.listView.setClipBounds(this.tmpClipRect);
        }
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (!this.actionBar.isActionModeShowed()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        hideActionMode(true);
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                CallLogActivity.$r8$lambda$3meoZ2NYTcjDhrnIcTbJALk2INc(this.f$0);
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        View view = this.fragmentView;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_windowBackgroundGray;
        arrayList.add(new ThemeDescription(view, i, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{EmptyTextProgressView.class}, new String[]{"emptyTextView1"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{EmptyTextProgressView.class}, new String[]{"emptyTextView2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_progressCircle));
        int i3 = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        if (this.floatingButton != null) {
            arrayList.add(new ThemeDescription(this.floatingButton.imageView, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, Theme.key_chats_actionIcon));
            arrayList.add(new ThemeDescription(this.floatingButton.imageView, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_chats_actionBackground));
            arrayList.add(new ThemeDescription(this.floatingButton.imageView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, Theme.key_chats_actionPressedBackground));
        }
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_telegram_color_text));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, null, new Drawable[]{Theme.dialogs_verifiedCheckDrawable}, null, Theme.key_chats_verifiedCheck));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, null, new Drawable[]{Theme.dialogs_verifiedDrawable}, null, Theme.key_chats_verifiedBackground));
        TextPaint textPaint = Theme.dialogs_offlinePaint;
        int i4 = Theme.key_windowBackgroundWhiteGrayText3;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, textPaint, null, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, Theme.dialogs_onlinePaint, null, null, Theme.key_windowBackgroundWhiteBlueText3));
        TextPaint[] textPaintArr = Theme.dialogs_namePaint;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, (String[]) null, new Paint[]{textPaintArr[0], textPaintArr[1], Theme.dialogs_searchNamePaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chats_name));
        TextPaint[] textPaintArr2 = Theme.dialogs_nameEncryptedPaint;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, (String[]) null, new Paint[]{textPaintArr2[0], textPaintArr2[1], Theme.dialogs_searchNameEncryptedPaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chats_secretName));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{CallCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, null, new Drawable[]{this.greenDrawable, this.greenDrawable2, Theme.calllog_msgCallUpRedDrawable, Theme.calllog_msgCallDownRedDrawable}, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, null, new Drawable[]{this.redDrawable, this.redDrawable2, Theme.calllog_msgCallUpGreenDrawable, Theme.calllog_msgCallDownGreenDrawable}, null, Theme.key_fill_RedNormal));
        arrayList.add(new ThemeDescription(this.flickerLoadingView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        return arrayList;
    }

    public static void $r8$lambda$3meoZ2NYTcjDhrnIcTbJALk2INc(CallLogActivity callLogActivity) {
        UniversalRecyclerView universalRecyclerView = callLogActivity.listView;
        if (universalRecyclerView != null) {
            int childCount = universalRecyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = callLogActivity.listView.getChildAt(i);
                if (childAt instanceof CallCell) {
                    ((CallCell) childAt).profileSearchCell.update(0);
                }
            }
        }
        ImageView imageView = callLogActivity.actionModeCloseView;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(callLogActivity.getThemedColor(Theme.key_actionBarActionModeDefaultIcon), PorterDuff.Mode.MULTIPLY));
            callLogActivity.actionModeCloseView.setBackground(Theme.createSelectorDrawable(callLogActivity.getThemedColor(Theme.key_actionBarActionModeDefaultSelector)));
        }
        ActionBar actionBar = callLogActivity.actionBar;
        if (actionBar != null) {
            actionBar.updateColors();
        }
    }

    public static void showCallLinkSheet(final Context context, int i, final TLRPC.InputGroupCall inputGroupCall, final String str, final Theme.ResourcesProvider resourcesProvider, boolean z, final boolean z2) {
        final int i2;
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider, Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        final String[] strArr = {str};
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, LayoutHelper.createFrame(-1, -1, 17));
        frameLayout2.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        final ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        int i3 = R.drawable.ic_ab_other;
        imageView2.setImageResource(i3);
        int color = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(color, mode));
        int i4 = Theme.key_listSelector;
        imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(i4, resourcesProvider)));
        if (z2) {
            frameLayout.addView(imageView2, LayoutHelper.createFrame(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i5 = Theme.key_windowBackgroundWhiteBlackText;
        LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView = TextHelper.makeLinkTextView(context, 20.0f, i5, true, resourcesProvider);
        linksTextViewMakeLinkTextView.setText(LocaleController.getString(R.string.GroupCallCreatedLinkTitle));
        linksTextViewMakeLinkTextView.setGravity(17);
        linearLayout.addView(linksTextViewMakeLinkTextView, LayoutHelper.createLinear(-1, -2, 17, 32, 16, 32, 8));
        LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView2 = TextHelper.makeLinkTextView(context, 14.0f, i5, false, resourcesProvider);
        linksTextViewMakeLinkTextView2.setText(LocaleController.getString(R.string.GroupCallCreatedLinkText));
        linksTextViewMakeLinkTextView2.setGravity(17);
        linksTextViewMakeLinkTextView2.setMaxWidth(HintView2.cutInFancyHalf(linksTextViewMakeLinkTextView2.getText(), linksTextViewMakeLinkTextView2.getPaint()));
        linearLayout.addView(linksTextViewMakeLinkTextView2, LayoutHelper.createLinear(-1, -2, 17, 32, 0, 32, 18));
        String strSubstring = str.startsWith("https://") ? str.substring(8) : str;
        final FrameLayout frameLayout3 = new FrameLayout(context);
        ScaleStateListAnimator.apply(frameLayout3, 0.01f, 1.2f);
        int i6 = Theme.key_windowBackgroundGray;
        frameLayout3.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(i6, resourcesProvider), Theme.blendOver(Theme.getColor(i6, resourcesProvider), Theme.getColor(i4, resourcesProvider)), 12, 12));
        linearLayout.addView(frameLayout3, LayoutHelper.createLinear(-1, -2, 7, 16, 0, 16, 0));
        final LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView3 = TextHelper.makeLinkTextView(context, 13.0f, i5, false, resourcesProvider);
        linksTextViewMakeLinkTextView3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
        linksTextViewMakeLinkTextView3.setText(strSubstring);
        frameLayout3.addView(linksTextViewMakeLinkTextView3, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(ContextCompat.getDrawable(context, i3));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogTextGray3, resourcesProvider), mode));
        frameLayout3.addView(imageView3, LayoutHelper.createFrame(40, 48, 21));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 16.0f, 12.0f, 16.0f, 0.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkCopy));
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_copy_filled), 0, 1, 33);
        buttonWithCounterView.setText(spannableStringBuilder, false);
        linearLayout2.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, resourcesProvider);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkShare));
        spannableStringBuilder2.setSpan(new ColoredImageSpan(R.drawable.msg_share_filled), 0, 1, 33);
        buttonWithCounterView2.setText(spannableStringBuilder2, false);
        linearLayout2.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        final BottomSheet[] bottomSheetArr = new BottomSheet[1];
        if (z) {
            TextView textView = new TextView(context) {
                private final Paint paint = new Paint(1);

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    this.paint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider), 0.8f));
                    this.paint.setStyle(Paint.Style.STROKE);
                    this.paint.setStrokeWidth(1.0f);
                    float height = getHeight() / 2.0f;
                    Layout layout = getLayout();
                    int iMax = 0;
                    for (int i7 = 0; i7 < layout.getLineCount(); i7++) {
                        iMax = Math.max(iMax, (int) layout.getLineWidth(i7));
                    }
                    float f = iMax / 2.0f;
                    canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f) - AndroidUtilities.dp(8.0f), height, this.paint);
                    canvas.drawLine((getWidth() / 2.0f) + f + AndroidUtilities.dp(8.0f), height, getWidth(), height, this.paint);
                    super.dispatchDraw(canvas);
                }
            };
            textView.setGravity(17);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            textView.setText(" " + LocaleController.getString(R.string.GroupCallCreatedLinkJoinOr) + " ");
            textView.setTextSize(14.0f);
            linearLayout.addView(textView, LayoutHelper.createLinear(190, -2, 1, 28, 12, 28, 8));
            i2 = i;
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    CallLogActivity.$r8$lambda$1eqLQe7XXil8QKhSc0HOpDp6Sis(str, i2, bottomSheetArr);
                }
            };
            LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView4 = TextHelper.makeLinkTextView(context, 14.0f, i5, false, resourcesProvider);
            linksTextViewMakeLinkTextView4.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GroupCallCreatedLinkJoinText), runnable), true));
            linksTextViewMakeLinkTextView4.setGravity(17);
            linksTextViewMakeLinkTextView4.setMaxWidth(HintView2.cutInFancyHalf(linksTextViewMakeLinkTextView4.getText(), linksTextViewMakeLinkTextView4.getPaint()));
            linearLayout.addView(linksTextViewMakeLinkTextView4, LayoutHelper.createLinear(-1, -2, 17, 32, 8, 32, 12));
            ScaleStateListAnimator.apply(linksTextViewMakeLinkTextView4, 0.05f, 1.2f);
            linksTextViewMakeLinkTextView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        } else {
            i2 = i;
        }
        builder.setCustomView(linearLayout);
        final BottomSheet bottomSheetShow = builder.show();
        bottomSheetArr[0] = bottomSheetShow;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CallLogActivity.$r8$lambda$BsdDJzHH2jXeuHHHw9yzq0gKRJM(strArr, bottomSheetShow, resourcesProvider, view);
            }
        });
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CallLogActivity.m1443$r8$lambda$1EFOwZ77UqkTcqErUyM45xhGTk(strArr, bottomSheetShow, resourcesProvider, view);
            }
        });
        final Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                CallLogActivity.m1444$r8$lambda$2prmdrrmAf0kUoNk0dOqcJaAs(inputGroupCall, i2, strArr, frameLayout3, linksTextViewMakeLinkTextView3, bottomSheetShow, resourcesProvider);
            }
        };
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BottomSheet bottomSheet = bottomSheetShow;
                Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                FrameLayout frameLayout4 = frameLayout3;
                String[] strArr2 = strArr;
                ItemOptions.makeOptions(bottomSheet.container, resourcesProvider2, frameLayout4).add(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
                    @Override
                    public final void run() {
                        CallLogActivity.$r8$lambda$PLg6mSTanxGc9UtnR7bnEEzTVXc(strArr2, bottomSheet, resourcesProvider2);
                    }
                }).add(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable() {
                    @Override
                    public final void run() {
                        CallLogActivity.m1457$r8$lambda$ofizaQ8fz8pIkZ0CmoIzuZ1WxU(context, strArr2);
                    }
                }).addIf(z2, R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.RevokeLink), true, runnable2).show();
            }
        });
        buttonWithCounterView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                new ShareAlert(context, null, str, false, strArr[0], false, resourcesProvider) {
                    @Override
                    protected void onSend(LongSparseArray longSparseArray, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z3) {
                        String string;
                        if (z3) {
                            if (longSparseArray != null && longSparseArray.size() == 1) {
                                long j = ((TLRPC.Dialog) longSparseArray.valueAt(0)).id;
                                if (j == 0 || j == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                    string = LocaleController.getString(R.string.InvLinkToSavedMessages);
                                } else {
                                    string = LocaleController.formatString(R.string.InvLinkToUser, MessagesController.getInstance(this.currentAccount).getPeerName(j, true));
                                }
                            } else {
                                string = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", longSparseArray == null ? 1 : longSparseArray.size(), new Object[0]));
                            }
                            Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(bottomSheet.topBulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(string));
                            bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
                            bulletinCreateSimpleBulletin.show();
                        }
                    }
                }.show();
            }
        });
        if (z2) {
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    BottomSheet bottomSheet = bottomSheetShow;
                    ItemOptions.makeOptions(bottomSheet.getContainer(), resourcesProvider, imageView2).add(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), runnable2).setOnTopOfScrim().translate(0.0f, -AndroidUtilities.dp(6.0f)).setDimAlpha(0).show();
                }
            });
        }
    }

    public static void $r8$lambda$1eqLQe7XXil8QKhSc0HOpDp6Sis(String str, int i, BottomSheet[] bottomSheetArr) {
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        Uri uri = Uri.parse(str);
        tL_inputGroupCallSlug.slug = uri.getPathSegments().get(uri.getPathSegments().size() - 1);
        VoIPHelper.joinConference(LaunchActivity.instance, i, tL_inputGroupCallSlug, false, null);
        bottomSheetArr[0].dismiss();
    }

    public static void $r8$lambda$BsdDJzHH2jXeuHHHw9yzq0gKRJM(String[] strArr, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, View view) {
        AndroidUtilities.addToClipboard(strArr[0]);
        BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).createCopyBulletin(LocaleController.getString(R.string.LinkCopied)).show();
    }

    public static void m1443$r8$lambda$1EFOwZ77UqkTcqErUyM45xhGTk(String[] strArr, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, View view) {
        AndroidUtilities.addToClipboard(strArr[0]);
        BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).createCopyBulletin(LocaleController.getString(R.string.LinkCopied)).show();
    }

    public static void m1444$r8$lambda$2prmdrrmAf0kUoNk0dOqcJaAs(final TLRPC.InputGroupCall inputGroupCall, final int i, final String[] strArr, final FrameLayout frameLayout, final LinkSpanDrawable.LinksTextView linksTextView, final BottomSheet bottomSheet, final Theme.ResourcesProvider resourcesProvider) {
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = inputGroupCall;
        togglegroupcallsettings.reset_invite_hash = true;
        ConnectionsManager.getInstance(i).sendRequest(togglegroupcallsettings, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                CallLogActivity.$r8$lambda$GHC6S6IidW7fVoaBk9qPej04rH0(i, inputGroupCall, strArr, frameLayout, linksTextView, bottomSheet, resourcesProvider, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$GHC6S6IidW7fVoaBk9qPej04rH0(int i, TLRPC.InputGroupCall inputGroupCall, final String[] strArr, final FrameLayout frameLayout, final LinkSpanDrawable.LinksTextView linksTextView, final BottomSheet bottomSheet, final Theme.ResourcesProvider resourcesProvider, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(i).processUpdates((TLRPC.Updates) tLObject, false);
        }
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        exportgroupcallinvite.call = inputGroupCall;
        ConnectionsManager.getInstance(i).sendRequest(exportgroupcallinvite, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        CallLogActivity.m1451$r8$lambda$XP3zZ7XrhNj3c7Y0VBP453XMXs(tLObject2, strArr, frameLayout, linksTextView, bottomSheet, resourcesProvider);
                    }
                });
            }
        });
    }

    public static void m1451$r8$lambda$XP3zZ7XrhNj3c7Y0VBP453XMXs(TLObject tLObject, String[] strArr, final FrameLayout frameLayout, final LinkSpanDrawable.LinksTextView linksTextView, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider) {
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            final String strSubstring = ((TL_phone.exportedGroupCallInvite) tLObject).link;
            strArr[0] = strSubstring;
            if (strSubstring.startsWith("https://")) {
                strSubstring = strSubstring.substring(8);
            }
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(220L);
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CallLogActivity.$r8$lambda$QNeaNZs9dHyaPKY9Uvb0ULRNf5w(frameLayout, atomicBoolean, linksTextView, strSubstring, valueAnimator);
                }
            });
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    atomicBoolean.set(true);
                    linksTextView.setText(strSubstring);
                }
            });
            duration.start();
            BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).createSimpleBulletin(R.raw.linkbroken, LocaleController.getString(R.string.GroupCallCreatedLinkRevokedTitle), LocaleController.getString(R.string.GroupCallCreatedLinkRevokedText)).show();
        }
    }

    public static void $r8$lambda$QNeaNZs9dHyaPKY9Uvb0ULRNf5w(FrameLayout frameLayout, AtomicBoolean atomicBoolean, LinkSpanDrawable.LinksTextView linksTextView, String str, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float fAbs = (Math.abs(fFloatValue - 0.5f) / 5.0f) + 0.9f;
        frameLayout.setScaleX(fAbs);
        frameLayout.setScaleY(fAbs);
        if (fFloatValue < 0.5f || atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        linksTextView.setText(str);
    }

    public static void $r8$lambda$PLg6mSTanxGc9UtnR7bnEEzTVXc(String[] strArr, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider) {
        AndroidUtilities.addToClipboard(strArr[0]);
        BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).createCopyBulletin(LocaleController.getString(R.string.LinkCopied)).show();
    }

    public static void m1457$r8$lambda$ofizaQ8fz8pIkZ0CmoIzuZ1WxU(Context context, String[] strArr) {
        QRCodeBottomSheet qRCodeBottomSheet = new QRCodeBottomSheet(context, LocaleController.getString(R.string.InviteByQRCode), strArr[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
        qRCodeBottomSheet.setCenterAnimation(R.raw.qr_code_logo);
        qRCodeBottomSheet.show();
    }

    public void openCreateCall() {
        openCreateCall(this);
    }

    public static void openCreateCall(BaseFragment baseFragment) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isCall", true);
        baseFragment.presentFragment(new AnonymousClass9(bundle, baseFragment.getCurrentAccount(), baseFragment));
    }

    class AnonymousClass9 extends GroupCreateActivity {
        final int val$account;
        final BaseFragment val$parent;

        AnonymousClass9(Bundle bundle, int i, BaseFragment baseFragment) {
            super(bundle);
            this.val$account = i;
            this.val$parent = baseFragment;
        }

        @Override
        protected void onCallUsersSelected(final HashSet hashSet, final boolean z) {
            if (hashSet.size() == 1) {
                final TLRPC.User user = MessagesController.getInstance(this.val$account).getUser((Long) hashSet.iterator().next());
                TLRPC.UserFull userFull = MessagesController.getInstance(this.val$account).getUserFull(user.id);
                if (userFull == null) {
                    TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                    tL_users_getFullUser.id = MessagesController.getInstance(this.val$account).getInputUser(user.id);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.val$account);
                    final int i = this.val$account;
                    connectionsManager.sendRequest(tL_users_getFullUser, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            CallLogActivity.AnonymousClass9.$r8$lambda$j21VxLP3_Z0a5R_dIAtiF70wAFA(this.f$0, i, user, z, tLObject, tL_error);
                        }
                    });
                    return;
                }
                VoIPHelper.startCall(user, z, userFull.video_calls_available, getParentActivity(), userFull, AccountInstance.getInstance(this.val$account));
            } else {
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.val$account);
                final int i2 = this.val$account;
                final BaseFragment baseFragment = this.val$parent;
                connectionsManager2.sendRequest(createconferencecall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                CallLogActivity.AnonymousClass9.m1459$r8$lambda$HNxXsgbSysl7L8tDBtVrPFkeYc(tLObject, i, z, hashSet, tL_error, baseFragment);
                            }
                        });
                    }
                });
            }
            finishFragment();
        }

        public static void $r8$lambda$j21VxLP3_Z0a5R_dIAtiF70wAFA(final AnonymousClass9 anonymousClass9, final int i, final TLRPC.User user, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
            anonymousClass9.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    CallLogActivity.AnonymousClass9.$r8$lambda$jhJbr3r2uog88FLlzkaYNbase74(this.f$0, tLObject, i, user, z);
                }
            });
        }

        public static void $r8$lambda$jhJbr3r2uog88FLlzkaYNbase74(AnonymousClass9 anonymousClass9, TLObject tLObject, int i, TLRPC.User user, boolean z) {
            TLRPC.UserFull userFull;
            anonymousClass9.getClass();
            if (tLObject instanceof TLRPC.TL_users_userFull) {
                TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
                MessagesController.getInstance(i).putUsers(tL_users_userFull.users, false);
                MessagesController.getInstance(i).putChats(tL_users_userFull.chats, false);
                userFull = tL_users_userFull.full_user;
            } else {
                userFull = null;
            }
            TLRPC.UserFull userFull2 = userFull;
            VoIPHelper.startCall(user, z, userFull2 != null && userFull2.video_calls_available, anonymousClass9.getParentActivity(), userFull2, AccountInstance.getInstance(i));
        }

        public static void m1459$r8$lambda$HNxXsgbSysl7L8tDBtVrPFkeYc(TLObject tLObject, int i, boolean z, HashSet hashSet, TLRPC.TL_error tL_error, BaseFragment baseFragment) {
            int i2 = 0;
            if (tLObject instanceof TLRPC.Updates) {
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                MessagesController.getInstance(i).putUsers(updates.users, false);
                MessagesController.getInstance(i).putChats(updates.chats, false);
                ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                int size = arrayListFindUpdatesAndRemove.size();
                TLRPC.GroupCall groupCall = null;
                while (i2 < size) {
                    Object obj = arrayListFindUpdatesAndRemove.get(i2);
                    i2++;
                    groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                }
                if (LaunchActivity.instance == null || groupCall == null) {
                    return;
                }
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.id = groupCall.id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                VoIPHelper.joinConference(LaunchActivity.instance, i, tL_inputGroupCall, z, groupCall, hashSet);
                return;
            }
            if (!(tLObject instanceof TL_phone.groupCall)) {
                if (tL_error != null) {
                    BulletinFactory.of(baseFragment).showForError(tL_error);
                    return;
                }
                return;
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(i).putUsers(groupcall.users, false);
            MessagesController.getInstance(i).putChats(groupcall.chats, false);
            if (LaunchActivity.instance == null) {
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall2 = groupcall.call;
            tL_inputGroupCall2.id = groupCall2.id;
            tL_inputGroupCall2.access_hash = groupCall2.access_hash;
            VoIPHelper.joinConference(LaunchActivity.instance, i, tL_inputGroupCall2, z, groupCall2, hashSet);
        }
    }

    public static void createCallLink(final Context context, final int i, final Theme.ResourcesProvider resourcesProvider, final Runnable runnable) {
        final AlertDialog alertDialog = new AlertDialog(context, 3);
        alertDialog.showDelayed(500L);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(i).sendRequest(createconferencecall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        CallLogActivity.m1455$r8$lambda$gyhVDjUE7ARRTUf1l96t6off0(tLObject, i, alertDialog, context, resourcesProvider, runnable);
                    }
                });
            }
        });
    }

    public static void m1455$r8$lambda$gyhVDjUE7ARRTUf1l96t6off0(TLObject tLObject, final int i, final AlertDialog alertDialog, final Context context, final Theme.ResourcesProvider resourcesProvider, final Runnable runnable) {
        int i2 = 0;
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(i).putUsers(updates.users, false);
            MessagesController.getInstance(i).putChats(updates.chats, false);
            ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
            int size = arrayListFindUpdatesAndRemove.size();
            TLRPC.GroupCall groupCall = null;
            while (i2 < size) {
                Object obj = arrayListFindUpdatesAndRemove.get(i2);
                i2++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            alertDialog.dismiss();
            if (groupCall != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.id = groupCall.id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                showCallLinkSheet(context, i, tL_inputGroupCall, groupCall.invite_link, resourcesProvider, true, true);
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            return;
        }
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(i).putUsers(groupcall.users, false);
            MessagesController.getInstance(i).putChats(groupcall.chats, false);
            final TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall2;
            TLRPC.GroupCall groupCall2 = groupcall.call;
            tL_inputGroupCall2.id = groupCall2.id;
            tL_inputGroupCall2.access_hash = groupCall2.access_hash;
            ConnectionsManager.getInstance(i).sendRequest(exportgroupcallinvite, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            CallLogActivity.m1456$r8$lambda$k3EfdJ6Yoam0W237sh_2inFJEA(tLObject2, alertDialog, context, i, exportgroupcallinvite, resourcesProvider, runnable);
                        }
                    });
                }
            });
            return;
        }
        alertDialog.dismiss();
        AndroidUtilities.runOnUIThread(runnable);
    }

    public static void m1456$r8$lambda$k3EfdJ6Yoam0W237sh_2inFJEA(TLObject tLObject, AlertDialog alertDialog, Context context, int i, TL_phone.exportGroupCallInvite exportgroupcallinvite, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            alertDialog.dismiss();
            showCallLinkSheet(context, i, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject).link, resourcesProvider, true, true);
        } else {
            alertDialog.dismiss();
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void showItemOptions() {
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this, this.otherItem);
        itemOptionsMakeOptions.setDimAlpha(8);
        if (getUserConfig().showCallsTab) {
            itemOptionsMakeOptions.add(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new Runnable() {
                @Override
                public final void run() {
                    CallLogActivity.m1448$r8$lambda$Pr5g9Kg58XyB3ftR62jtiBUfGs(this.f$0);
                }
            });
        }
        itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.DeleteAllCalls), true, new Runnable() {
            @Override
            public final void run() {
                this.f$0.showDeleteAlert(true);
            }
        });
        itemOptionsMakeOptions.show();
        itemOptionsMakeOptions.setTranslationY(-AndroidUtilities.dp(64.0f));
    }

    public static void m1448$r8$lambda$Pr5g9Kg58XyB3ftR62jtiBUfGs(final CallLogActivity callLogActivity) {
        callLogActivity.setCallsTabVisible(false);
        (callLogActivity.hasMainTabs ? BulletinFactory.global() : BulletinFactory.of(callLogActivity)).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new Runnable() {
            @Override
            public final void run() {
                this.f$0.setCallsTabVisible(true);
            }
        }).setDuration(5000).show();
    }

    public void setCallsTabVisible(boolean z) {
        if (z == getUserConfig().showCallsTab) {
            return;
        }
        getUserConfig().setShowCallsTab(z);
        this.listView.adapter.update(true);
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    public void blur3_InvalidateBlur() {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f) + ((int) this.topPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.dp(7.0f)));
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int iDp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.iBlur3PositionActionBar.set(0.0f, -iDp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + iDp);
        this.iBlur3PositionMainTabs.set(0.0f, iDp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        this.iBlur3PositionMainTabs.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        this.scrollableViewNoiseSuppressor.setupRenderNodes(this.iBlur3Positions, this.hasMainTabs ? 2 : 1);
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override
    public BlurredBackgroundSourceRenderNode getGlassSource() {
        return this.iBlur3SourceGlass;
    }

    @Override
    public void onParentScrollToTop() {
        if (this.layoutManager.findFirstVisibleItemPosition() < 15) {
            this.listView.smoothScrollToPosition(0);
        } else {
            this.scrollHelper.setScrollDirection(1);
            this.scrollHelper.scrollToPosition(0, 0, false, true);
        }
    }
}
