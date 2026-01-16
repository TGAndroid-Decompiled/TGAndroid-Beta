package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
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
import androidx.core.graphics.ColorUtils;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
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
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.CallLogActivity;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.LocationCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
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
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.MainTabsActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;

public class CallLogActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, MainTabsActivity.TabFragmentDelegate {
    private final int ADDITIONAL_LIST_HEIGHT_DP;
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
    private ImageSpan getIconMissedOut;
    private Drawable greenDrawable;
    private Drawable greenDrawable2;
    private boolean hasMainTabs;
    private HeaderShadowView headerShadowView;
    private HintView2 hideCallTabsHintView;
    private boolean hideCallTabsHintWasShown;
    private IBlur3Capture iBlur3Capture;
    private final BlurredBackgroundColorProvider iBlur3ColorProviderTopPanel;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryLiquidGlass;
    private boolean iBlur3Invalidated;
    private final RectF iBlur3PositionActionBar;
    private final RectF iBlur3PositionMainTabs;
    private final ArrayList iBlur3Positions;
    private final BlurredBackgroundSourceColor iBlur3SourceColor;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    private ImageSpan iconIn;
    private ImageSpan iconMissedIn;
    private ImageSpan iconOut;
    private TLRPC.Chat lastCallChat;
    private TLRPC.User lastCallUser;
    private LinearLayoutManager layoutManager;
    private RecyclerListView listView;
    private ListAdapter listViewAdapter;
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

    public static boolean lambda$createActionMode$15(View view, MotionEvent motionEvent) {
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
        blurredBackgroundSourceColor.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        if (i >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor();
            this.iBlur3SourceGlassFrosted = new BlurredBackgroundSourceRenderNode(null);
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlass = blurredBackgroundSourceRenderNode;
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            this.iBlur3FactoryLiquidGlass = blurredBackgroundDrawableViewFactory;
            blurredBackgroundDrawableViewFactory.setLiquidGlassEffectAllowed(LiteMode.isEnabled(262144));
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3SourceGlass = null;
            this.iBlur3FactoryLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        }
        this.iBlur3ColorProviderTopPanel = new BlurredBackgroundColorProvider() {
            @Override
            public int getBackgroundColor() {
                return Theme.multAlpha(ColorUtils.blendARGB(Theme.getColor(Theme.key_windowBackgroundWhite), -1, Theme.isCurrentThemeDark() ? 0.07f : 0.0f), LiteMode.isEnabled(262144) ? 0.84f : 0.76f);
            }

            @Override
            public int getStrokeColorTop() {
                return Theme.isCurrentThemeDark() ? 553648127 : 536870912;
            }

            @Override
            public int getStrokeColorBottom() {
                return Theme.isCurrentThemeDark() ? 352321535 : 335544320;
            }

            @Override
            public int getShadowColor() {
                return Theme.isCurrentThemeDark() ? 83886079 : 536870912;
            }
        };
    }

    class EmptyTextProgressView extends FrameLayout {
        private final TextView emptyTextView1;
        private final TextView emptyTextView2;
        private final RLottieImageView imageView;
        private final View progressView;

        public static boolean lambda$new$1(View view, MotionEvent motionEvent) {
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
                    this.f$0.lambda$new$0(view2);
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
                    return CallLogActivity.EmptyTextProgressView.lambda$new$1(view2, motionEvent);
                }
            });
        }

        public void lambda$new$0(View view) {
            if (this.imageView.isPlaying()) {
                return;
            }
            this.imageView.setProgress(0.0f);
            this.imageView.playAnimation();
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
        ListAdapter listAdapter;
        CallLogRow callLogRow;
        if (i == NotificationCenter.didReceiveNewMessages) {
            if (this.firstLoaded && !((Boolean) objArr[2]).booleanValue()) {
                Iterator it = ((ArrayList) objArr[1]).iterator();
                while (it.hasNext()) {
                    MessageObject messageObject = (MessageObject) it.next();
                    TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                    if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                        long fromChatId = messageObject.getFromChatId();
                        long j = fromChatId == getUserConfig().getClientUserId() ? messageObject.messageOwner.peer_id.user_id : fromChatId;
                        int i3 = fromChatId == getUserConfig().getClientUserId() ? 0 : 1;
                        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = messageObject.messageOwner.action.reason;
                        if (i3 == 1 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                            i3 = 2;
                        }
                        if (i3 != 0 || (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                            i = i3;
                        }
                        if (!this.calls.isEmpty()) {
                            CallLogRow callLogRow2 = (CallLogRow) this.calls.get(0);
                            if (eq(j, callLogRow2.users) && callLogRow2.type == i) {
                                callLogRow2.calls.add(0, messageObject.messageOwner);
                                ListAdapter listAdapter2 = this.listViewAdapter;
                                listAdapter2.notifyItemChanged(listAdapter2.callsStartRow);
                            }
                        }
                        CallLogRow callLogRow3 = new CallLogRow();
                        callLogRow3.calls.clear();
                        callLogRow3.calls.add(messageObject.messageOwner);
                        callLogRow3.users.clear();
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j));
                        if (user != null) {
                            callLogRow3.users.add(user);
                        }
                        callLogRow3.type = i;
                        callLogRow3.video = messageObject.isVideoCall();
                        this.calls.add(0, callLogRow3);
                        this.listViewAdapter.updateRows();
                        ListAdapter listAdapter3 = this.listViewAdapter;
                        listAdapter3.notifyItemInserted(listAdapter3.callsStartRow);
                    } else if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        long fromChatId2 = messageObject.getFromChatId();
                        Set<Long> set = (Set) Collection.EL.stream(tL_messageActionConferenceCall.other_participants).map(new CallLogActivity$$ExternalSyntheticLambda11()).collect(Collectors.toSet());
                        set.add(Long.valueOf(fromChatId2 == getUserConfig().getClientUserId() ? messageObject.messageOwner.peer_id.user_id : fromChatId2));
                        int i4 = fromChatId2 == getUserConfig().getClientUserId() ? 0 : 1;
                        if (i4 == 1 && tL_messageActionConferenceCall.missed) {
                            i4 = 2;
                        }
                        i = (i4 == 0 && tL_messageActionConferenceCall.missed) ? 3 : i4;
                        if (!this.calls.isEmpty()) {
                            int i5 = 0;
                            while (true) {
                                if (i5 >= this.calls.size()) {
                                    i5 = -1;
                                    callLogRow = null;
                                    break;
                                } else {
                                    callLogRow = (CallLogRow) this.calls.get(i5);
                                    if (callLogRow.call_id == tL_messageActionConferenceCall.call_id) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            if (callLogRow != null) {
                                callLogRow.calls.add(0, messageObject.messageOwner);
                                for (Long l2 : set) {
                                    long jLongValue = l2.longValue();
                                    Iterator it2 = callLogRow.users.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (jLongValue == ((TLRPC.User) it2.next()).id) {
                                                break;
                                            }
                                        } else {
                                            TLRPC.User user2 = getMessagesController().getUser(l2);
                                            if (user2 != null) {
                                                callLogRow.users.add(user2);
                                            }
                                        }
                                    }
                                }
                                ListAdapter listAdapter4 = this.listViewAdapter;
                                listAdapter4.notifyItemChanged(listAdapter4.callsStartRow + i5);
                            }
                        }
                        CallLogRow callLogRow4 = new CallLogRow();
                        callLogRow4.call_id = tL_messageActionConferenceCall.call_id;
                        callLogRow4.calls.clear();
                        callLogRow4.calls.add(messageObject.messageOwner);
                        callLogRow4.users.clear();
                        for (Long l3 : set) {
                            l3.longValue();
                            TLRPC.User user3 = getMessagesController().getUser(l3);
                            if (user3 != null) {
                                callLogRow4.users.add(user3);
                            }
                        }
                        callLogRow4.type = i;
                        callLogRow4.video = messageObject.isVideoCall();
                        this.calls.add(0, callLogRow4);
                        ListAdapter listAdapter5 = this.listViewAdapter;
                        listAdapter5.notifyItemInserted(listAdapter5.callsStartRow);
                    }
                }
                ActionBarMenuItem actionBarMenuItem = this.otherItem;
                if (actionBarMenuItem != null) {
                    actionBarMenuItem.setVisibility(this.calls.isEmpty() ? 8 : 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.messagesDeleted) {
            if (this.firstLoaded && !((Boolean) objArr[2]).booleanValue()) {
                ArrayList arrayList = (ArrayList) objArr[0];
                Iterator it3 = this.calls.iterator();
                while (it3.hasNext()) {
                    CallLogRow callLogRow5 = (CallLogRow) it3.next();
                    Iterator it4 = callLogRow5.calls.iterator();
                    while (it4.hasNext()) {
                        if (arrayList.contains(Integer.valueOf(((TLRPC.Message) it4.next()).id))) {
                            it4.remove();
                            i = 1;
                        }
                    }
                    if (callLogRow5.calls.isEmpty()) {
                        it3.remove();
                    }
                }
                if (i == 0 || (listAdapter = this.listViewAdapter) == null) {
                    return;
                }
                listAdapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (i == NotificationCenter.activeGroupCallsUpdated) {
            this.activeGroupCalls = getMessagesController().getActiveGroupCalls();
            ListAdapter listAdapter6 = this.listViewAdapter;
            if (listAdapter6 != null) {
                listAdapter6.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (i == NotificationCenter.chatInfoDidLoad) {
            Long l4 = this.waitingForCallChatId;
            if (l4 == null || ((TLRPC.ChatFull) objArr[0]).id != l4.longValue() || getMessagesController().getGroupCall(this.waitingForCallChatId.longValue(), true) == null) {
                return;
            }
            VoIPHelper.startCall(this.lastCallChat, null, null, false, getParentActivity(), this, getAccountInstance());
            this.waitingForCallChatId = null;
            return;
        }
        if (i == NotificationCenter.groupCallUpdated && (l = this.waitingForCallChatId) != null && l.equals((Long) objArr[0])) {
            VoIPHelper.startCall(this.lastCallChat, null, null, false, getParentActivity(), this, getAccountInstance());
            this.waitingForCallChatId = null;
        }
    }

    private static boolean eq(long j, ArrayList arrayList) {
        return arrayList.size() == 1 && ((TLRPC.User) arrayList.get(0)).id == j;
    }

    private static boolean eq(Set set, ArrayList arrayList) {
        if (set.size() != arrayList.size()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!set.contains(Long.valueOf(((TLRPC.User) it.next()).id))) {
                return false;
            }
        }
        return true;
    }

    class CallCell extends FrameLayout {
        private final AvatarsImageView avatarsImageView;
        private final CheckBox2 checkBox;
        private final ImageView imageView;
        private final ProfileSearchCell profileSearchCell;

        public CallCell(Context context) {
            super(context);
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
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$3(view);
                }
            });
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

        public void lambda$new$3(View view) {
            CallLogRow callLogRow = (CallLogRow) view.getTag();
            if (callLogRow.users.size() == 1) {
                TLRPC.User user = (TLRPC.User) callLogRow.users.get(0);
                TLRPC.UserFull userFull = CallLogActivity.this.getMessagesController().getUserFull(user.id);
                TLRPC.User user2 = CallLogActivity.this.lastCallUser = user;
                boolean z = callLogRow.video;
                VoIPHelper.startCall(user2, z, z || (userFull != null && userFull.video_calls_available), CallLogActivity.this.getParentActivity(), null, CallLogActivity.this.getAccountInstance());
                return;
            }
            final boolean z2 = callLogRow.video;
            final HashSet hashSet = new HashSet();
            Iterator it = callLogRow.users.iterator();
            while (it.hasNext()) {
                hashSet.add(Long.valueOf(((TLRPC.User) it.next()).id));
            }
            final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
            tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) callLogRow.calls.get(0)).id;
            final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
            getgroupcall.call = tL_inputGroupCallInviteMessage;
            getgroupcall.limit = CallLogActivity.this.getMessagesController().conferenceCallSizeLimit;
            final int iSendRequest = CallLogActivity.this.getConnectionsManager().sendRequest(getgroupcall, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$new$1(alertDialog, hashSet, tL_inputGroupCallInviteMessage, z2, tLObject, tL_error);
                }
            });
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f$0.lambda$new$2(iSendRequest, dialogInterface);
                }
            });
            alertDialog.showDelayed(600L);
        }

        public void lambda$new$1(final AlertDialog alertDialog, final HashSet hashSet, final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, final boolean z, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$0(alertDialog, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error);
                }
            });
        }

        public void lambda$new$0(AlertDialog alertDialog, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLRPC.TL_error tL_error) {
            alertDialog.dismiss();
            if (tLObject instanceof TL_phone.groupCall) {
                TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                CallLogActivity.this.getMessagesController().putUsers(groupcall.users, false);
                CallLogActivity.this.getMessagesController().putChats(groupcall.chats, false);
                if (!groupcall.participants.isEmpty()) {
                    VoIPHelper.joinConference(CallLogActivity.this.getParentActivity(), ((BaseFragment) CallLogActivity.this).currentAccount, tL_inputGroupCallInviteMessage, z, groupcall.call);
                    return;
                } else {
                    CallLogActivity.this.showDialog(new CreateGroupCallSheet(getContext(), hashSet));
                    return;
                }
            }
            if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                CallLogActivity.this.showDialog(new CreateGroupCallSheet(getContext(), hashSet));
            } else if (tL_error != null) {
                BulletinFactory.of(CallLogActivity.this).showForError(tL_error);
            }
        }

        public void lambda$new$2(int i, DialogInterface dialogInterface) {
            CallLogActivity.this.getConnectionsManager().cancelRequest(i, true);
        }

        public void setChecked(boolean z, boolean z2) {
            CheckBox2 checkBox2 = this.checkBox;
            if (checkBox2 == null) {
                return;
            }
            checkBox2.setChecked(z, z2);
        }
    }

    class GroupCallCell extends FrameLayout {
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
            progressButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$0(view);
                }
            });
        }

        public void lambda$new$0(View view) {
            Long l = (Long) view.getTag();
            ChatObject.Call groupCall = CallLogActivity.this.getMessagesController().getGroupCall(l.longValue(), false);
            CallLogActivity callLogActivity = CallLogActivity.this;
            callLogActivity.lastCallChat = callLogActivity.getMessagesController().getChat(l);
            if (groupCall != null) {
                TLRPC.Chat chat = CallLogActivity.this.lastCallChat;
                Activity parentActivity = CallLogActivity.this.getParentActivity();
                CallLogActivity callLogActivity2 = CallLogActivity.this;
                VoIPHelper.startCall(chat, null, null, false, parentActivity, callLogActivity2, callLogActivity2.getAccountInstance());
                return;
            }
            CallLogActivity.this.waitingForCallChatId = l;
            CallLogActivity.this.getMessagesController().loadFullChat(l.longValue(), 0, true);
        }

        public void setChat(TLRPC.Chat chat) {
            this.currentChat = chat;
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
        Resources resources = getParentActivity().getResources();
        int i = R.drawable.mini_call_out_16;
        Drawable drawableMutate = resources.getDrawable(i).mutate();
        this.greenDrawable = drawableMutate;
        drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), this.greenDrawable.getIntrinsicHeight());
        Drawable drawable = this.greenDrawable;
        int i2 = Theme.key_windowBackgroundWhiteGrayText3;
        int color = Theme.getColor(i2);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
        this.iconOut = new ImageSpan(this.greenDrawable, 0);
        Resources resources2 = getParentActivity().getResources();
        int i3 = R.drawable.mini_call_in_16;
        Drawable drawableMutate2 = resources2.getDrawable(i3).mutate();
        this.greenDrawable2 = drawableMutate2;
        drawableMutate2.setBounds(0, 0, drawableMutate2.getIntrinsicWidth(), this.greenDrawable2.getIntrinsicHeight());
        this.greenDrawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2), mode));
        this.iconIn = new ImageSpan(this.greenDrawable2, 0);
        Drawable drawableMutate3 = getParentActivity().getResources().getDrawable(i3).mutate();
        this.redDrawable = drawableMutate3;
        drawableMutate3.setBounds(0, 0, drawableMutate3.getIntrinsicWidth(), this.redDrawable.getIntrinsicHeight());
        Drawable drawable2 = this.redDrawable;
        int i4 = Theme.key_fill_RedNormal;
        drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4), mode));
        this.iconMissedIn = new ImageSpan(this.redDrawable, 0);
        Drawable drawableMutate4 = getParentActivity().getResources().getDrawable(i).mutate();
        this.redDrawable2 = drawableMutate4;
        drawableMutate4.setBounds(0, 0, drawableMutate4.getIntrinsicWidth(), this.redDrawable2.getIntrinsicHeight());
        this.redDrawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4), mode));
        this.getIconMissedOut = new ImageSpan(this.redDrawable2, 0);
        if (!this.hasMainTabs) {
            this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i5) {
                if (i5 != -1) {
                    if (i5 == 2) {
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
                this.f$0.lambda$createView$0(view);
            }
        });
        this.listView = new RecyclerListView(context);
        this.contentView = new SizeNotifierFrameLayout(context) {
            @Override
            protected void onMeasure(int i5, int i6) {
                measureChildWithMargins(((BaseFragment) CallLogActivity.this).actionBar, i5, 0, i6, 0);
                ((ViewGroup.MarginLayoutParams) CallLogActivity.this.topPanelLayout.getLayoutParams()).topMargin = ((BaseFragment) CallLogActivity.this).actionBar.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                ((ViewGroup.MarginLayoutParams) CallLogActivity.this.emptyView.getLayoutParams()).topMargin = ((BaseFragment) CallLogActivity.this).actionBar.getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) CallLogActivity.this.headerShadowView.getLayoutParams()).topMargin = ((BaseFragment) CallLogActivity.this).actionBar.getMeasuredHeight();
                CallLogActivity.this.checkUi_listViewPadding();
                super.onMeasure(i5, i6);
            }

            @Override
            protected void onLayout(boolean z, int i5, int i6, int i7, int i8) {
                super.onLayout(z, i5, i6, i7, i8);
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
                        recordingCanvasBeginRecording.drawColor(CallLogActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        if (SharedConfig.chatBlurEnabled()) {
                            CallLogActivity.this.scrollableViewNoiseSuppressor.draw(recordingCanvasBeginRecording, -3);
                        }
                        CallLogActivity.this.iBlur3SourceGlassFrosted.endRecording();
                    }
                    if (CallLogActivity.this.iBlur3SourceGlass != null && !CallLogActivity.this.iBlur3SourceGlass.inRecording()) {
                        RecordingCanvas recordingCanvasBeginRecording2 = CallLogActivity.this.iBlur3SourceGlass.beginRecording(measuredWidth, measuredHeight);
                        recordingCanvasBeginRecording2.drawColor(CallLogActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        if (SharedConfig.chatBlurEnabled()) {
                            CallLogActivity.this.scrollableViewNoiseSuppressor.draw(recordingCanvasBeginRecording2, -2);
                        }
                        CallLogActivity.this.iBlur3SourceGlass.endRecording();
                    }
                    CallLogActivity.this.iBlur3Invalidated = false;
                }
                super.dispatchDraw(canvas);
                if (CallLogActivity.this.hasMainTabs) {
                    return;
                }
                AndroidUtilities.drawNavigationBarProtection(canvas, this, CallLogActivity.this.getThemedColor(Theme.key_windowBackgroundWhite), CallLogActivity.this.navigationBarHeight);
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
        RecyclerListView recyclerListView = this.listView;
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.contentView;
        Objects.requireNonNull(recyclerListView);
        this.iBlur3Capture = new ViewGroupPartRenderer(recyclerListView, sizeNotifierFrameLayout, new CallLogActivity$$ExternalSyntheticLambda3(recyclerListView));
        this.listView.setOverScrollListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$2();
            }
        });
        this.fragmentView = this.contentView;
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        this.flickerLoadingView = flickerLoadingView;
        flickerLoadingView.setViewType(8);
        this.flickerLoadingView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        this.flickerLoadingView.showDate(false);
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, this.flickerLoadingView);
        this.emptyView = emptyTextProgressView;
        this.contentView.addView(emptyTextProgressView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setClipToPadding(false);
        this.listView.setEmptyView(this.emptyView);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        RecyclerListView recyclerListView3 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listViewAdapter = listAdapter;
        recyclerListView3.setAdapter(listAdapter);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(this.listView, this.layoutManager);
        this.scrollHelper = recyclerAnimationScrollHelper;
        recyclerAnimationScrollHelper.setScrollListener(new RecyclerAnimationScrollHelper.ScrollListener() {
            @Override
            public final void onScroll() {
                this.f$0.blur3_InvalidateBlur();
            }
        });
        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = this.contentView;
        RecyclerListView recyclerListView4 = this.listView;
        float f = -this.ADDITIONAL_LIST_HEIGHT_DP;
        sizeNotifierFrameLayout2.addView(recyclerListView4, LayoutHelper.createFrame(-1, -1.0f, 3, 0.0f, f, 0.0f, f));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i5) {
                this.f$0.lambda$createView$7(view, i5);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i5) {
                return this.f$0.lambda$createView$8(view, i5);
            }
        });
        this.listView.setOnScrollListener(new AnonymousClass4());
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
                this.f$0.lambda$createView$9(view);
            }
        });
        this.contentView.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParams());
        DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = new DialogsActivityTopPanelLayout(context);
        this.topPanelLayout = dialogsActivityTopPanelLayout;
        dialogsActivityTopPanelLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        this.topPanelLayout.setOnAnimatedHeightChangedListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$10();
            }
        });
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = this.iBlur3FactoryLiquidGlass.create(this.topPanelLayout, this.iBlur3ColorProviderTopPanel);
        blurredBackgroundDrawableCreate.setStrokeWidth(AndroidUtilities.dpf2(0.4f), AndroidUtilities.dpf2(0.4f));
        blurredBackgroundDrawableCreate.setShadowParams(AndroidUtilities.dpf2(1.5f), 0.0f, AndroidUtilities.dpf2(0.5f));
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(24.0f));
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(7.0f));
        this.topPanelLayout.setBlurredBackground(blurredBackgroundDrawableCreate);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentContextViewWrapper = frameLayout;
        this.topPanelLayout.addView(frameLayout);
        this.topPanelLayout.setViewVisible(this.fragmentContextViewWrapper, true, false);
        FragmentContextView fragmentContextView = new FragmentContextView(context, this, this.contentView, false, this.resourceProvider) {
            @Override
            public void setVisibility(int i5) {
                CallLogActivity.this.topPanelLayout.setViewVisible(CallLogActivity.this.fragmentContextViewWrapper, i5 == 0);
            }
        };
        this.fragmentContextView = fragmentContextView;
        fragmentContextView.isInsideBubble = true;
        this.fragmentContextViewWrapper.addView(fragmentContextView);
        this.contentView.addView(this.topPanelLayout, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        this.contentView.addView(this.actionBar);
        HeaderShadowView headerShadowView = new HeaderShadowView(context, this.parentLayout);
        this.headerShadowView = headerShadowView;
        headerShadowView.setShadowVisible(false, false);
        this.contentView.addView(this.headerShadowView, LayoutHelper.createFrame(-1, 5, 48));
        this.actionBar.setDrawBlurBackground(this.contentView);
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
            public boolean clipWithGradient(int i5) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i5);
            }

            @Override
            public int getTopOffset(int i5) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i5);
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
                CallLogActivity.this.additionalFloatingTranslation = Math.max(0.0f, (f2 - r0.navigationBarHeight) - CallLogActivity.this.additionFloatingButtonOffset);
                CallLogActivity.this.checkUi_floatingButton();
            }

            @Override
            public int getBottomOffset(int i5) {
                return CallLogActivity.this.navigationBarHeight + CallLogActivity.this.additionFloatingButtonOffset;
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(this.fragmentView, new OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f$0.onApplyWindowInsets(view, windowInsetsCompat);
            }
        });
        return this.fragmentView;
    }

    public void lambda$createView$0(View view) {
        showItemOptions();
    }

    public void lambda$createView$2() {
        this.listView.postOnAnimation(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$1();
            }
        });
    }

    public void lambda$createView$1() {
        checkUi_listClip();
        blur3_InvalidateBlur();
    }

    public void lambda$createView$7(View view, int i) {
        if (i == this.listViewAdapter.showInMainTabsRow) {
            setCallsTabVisible(true);
            BulletinFactory.of(this).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasShownTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createView$3();
                }
            }).setDuration(5000).show();
            return;
        }
        if (i == this.listViewAdapter.createCallRow) {
            openCreateCall();
            return;
        }
        if (!(view instanceof CallCell)) {
            if (view instanceof GroupCallCell) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ((GroupCallCell) view).currentChat.id);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new ChatActivity(bundle), this.needFinishFragment);
                return;
            }
            return;
        }
        CallLogRow callLogRow = (CallLogRow) this.calls.get(i - this.listViewAdapter.callsStartRow);
        if (this.actionBar.isActionModeShowed()) {
            addOrRemoveSelectedDialog(callLogRow.calls, (CallCell) view);
            return;
        }
        if (callLogRow.call_id != 0 && !callLogRow.calls.isEmpty()) {
            final boolean z = callLogRow.video;
            final HashSet hashSet = new HashSet();
            Iterator it = callLogRow.users.iterator();
            while (it.hasNext()) {
                hashSet.add(Long.valueOf(((TLRPC.User) it.next()).id));
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
                    this.f$0.lambda$createView$5(alertDialog, hashSet, tL_inputGroupCallInviteMessage, z, tLObject, tL_error);
                }
            });
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f$0.lambda$createView$6(iSendRequest, dialogInterface);
                }
            });
            alertDialog.showDelayed(600L);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("user_id", MessageObject.getDialogId((TLRPC.Message) callLogRow.calls.get(0)));
        bundle2.putInt("message_id", ((TLRPC.Message) callLogRow.calls.get(0)).id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        presentFragment(new ChatActivity(bundle2), this.needFinishFragment);
    }

    public void lambda$createView$3() {
        setCallsTabVisible(false);
    }

    public void lambda$createView$5(final AlertDialog alertDialog, final HashSet hashSet, final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, final boolean z, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$4(alertDialog, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error);
            }
        });
    }

    public void lambda$createView$4(AlertDialog alertDialog, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            getMessagesController().putUsers(groupcall.users, false);
            getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                showDialog(new CreateGroupCallSheet(getContext(), hashSet));
                return;
            } else {
                VoIPHelper.joinConference(getParentActivity(), this.currentAccount, tL_inputGroupCallInviteMessage, z, groupcall.call);
                return;
            }
        }
        if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            showDialog(new CreateGroupCallSheet(getContext(), hashSet));
        } else if (tL_error != null) {
            BulletinFactory.of(this).showForError(tL_error);
        }
    }

    public void lambda$createView$6(int i, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
    }

    public boolean lambda$createView$8(View view, int i) {
        if (!(view instanceof CallCell)) {
            return false;
        }
        addOrRemoveSelectedDialog(((CallLogRow) this.calls.get(i - this.listViewAdapter.callsStartRow)).calls, (CallCell) view);
        return true;
    }

    class AnonymousClass4 extends RecyclerView.OnScrollListener {
        private boolean scrollUpdated;

        AnonymousClass4() {
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int iFindFirstVisibleItemPosition = CallLogActivity.this.layoutManager.findFirstVisibleItemPosition();
            int iAbs = iFindFirstVisibleItemPosition == -1 ? 0 : Math.abs(CallLogActivity.this.layoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1;
            if (iAbs > 0) {
                int itemCount = CallLogActivity.this.listViewAdapter.getItemCount();
                if (!CallLogActivity.this.endReached && !CallLogActivity.this.loading && !CallLogActivity.this.calls.isEmpty() && iAbs + iFindFirstVisibleItemPosition >= itemCount - 5) {
                    final CallLogRow callLogRow = (CallLogRow) CallLogActivity.this.calls.get(CallLogActivity.this.calls.size() - 1);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onScrolled$0(callLogRow);
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

        public void lambda$onScrolled$0(CallLogRow callLogRow) {
            CallLogActivity.this.getCalls(((TLRPC.Message) callLogRow.calls.get(r3.size() - 1)).id, 100);
        }
    }

    public void lambda$createView$9(View view) {
        openCreateCall();
    }

    public void lambda$createView$10() {
        blur3_InvalidateBlur();
        checkUi_listViewPadding();
    }

    @Override
    public void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.hideCallTabsHintWasShown || MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) >= 2) {
            return;
        }
        HintView2 hintView2 = new HintView2(getContext(), 1);
        this.hideCallTabsHintView = hintView2;
        hintView2.setDuration(3000L);
        this.hideCallTabsHintView.setJoint(1.0f, -25.0f);
        this.hideCallTabsHintView.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.hideCallTabsHintView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.TapToHideCallsTab)));
        this.hideCallTabsHintView.setRounding(AndroidUtilities.dp(12.0f));
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
        actionBarCreateActionBar.createTitleOverlayContainer();
        actionBarCreateActionBar.getTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        actionBarCreateActionBar.getTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(2.0f));
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
                CallLogActivity.lambda$showDeleteAlert$11(zArr, view);
            }
        });
        builder.setView(frameLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$showDeleteAlert$12(z, zArr, alertDialog, i);
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

    public static void lambda$showDeleteAlert$11(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public void lambda$showDeleteAlert$12(boolean z, boolean[] zArr, AlertDialog alertDialog, int i) {
        if (z) {
            deleteAllMessages(zArr[0]);
            this.calls.clear();
            this.loading = false;
            this.endReached = true;
            this.otherItem.setVisibility(8);
            this.listViewAdapter.notifyDataSetChanged();
        } else {
            getMessagesController().deleteMessages(new ArrayList<>(this.selectedIds), null, null, 0L, 0, zArr[0], 0);
        }
        hideActionMode(false);
    }

    private void deleteAllMessages(final boolean z) {
        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
        tL_messages_deletePhoneCallHistory.revoke = z;
        getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$deleteAllMessages$13(z, tLObject, tL_error);
            }
        });
    }

    public void lambda$deleteAllMessages$13(boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
            TLRPC.TL_updateDeleteMessages tL_updateDeleteMessages = new TLRPC.TL_updateDeleteMessages();
            tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
            tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
            tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
            TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
            tL_updates.updates.add(tL_updateDeleteMessages);
            getMessagesController().processUpdates(tL_updates, false);
            if (tL_messages_affectedFoundMessages.offset != 0) {
                deleteAllMessages(z);
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
    }

    public boolean isSelected(ArrayList arrayList) {
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
                    this.f$0.lambda$createActionMode$14(view);
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
                return CallLogActivity.lambda$createActionMode$15(view, motionEvent);
            }
        });
        this.actionModeViews.add(actionBarMenuCreateActionMode.addItemWithWidth(2, R.drawable.msg_delete, AndroidUtilities.dp(54.0f), LocaleController.getString(R.string.Delete)));
    }

    public void lambda$createActionMode$14(View view) {
        hideActionMode(true);
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
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
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
                this.f$0.lambda$getCalls$19(tLObject, tL_error);
            }
        }, 2), this.classGuid);
    }

    public void lambda$getCalls$19(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getCalls$18(tL_error, tLObject);
            }
        });
    }

    public void lambda$getCalls$18(org.telegram.tgnet.TLRPC.TL_error r19, org.telegram.tgnet.TLObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.CallLogActivity.lambda$getCalls$18(org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static boolean lambda$getCalls$16(long j, TLRPC.User user) {
        return user.id == j;
    }

    public static boolean lambda$getCalls$17(long j, TLRPC.User user) {
        return user.id == j;
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
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

    private class ListAdapter extends RecyclerListView.SelectionAdapter {
        private int activeEndRow;
        private int activeStartRow;
        private int callsEndRow;
        private int callsStartRow;
        private int createCallRow;
        private int loadingCallsRow;
        private final Context mContext;
        private int rowsCount;
        private int showInMainTabsRow;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        public void updateRows() {
            this.createCallRow = -1;
            this.showInMainTabsRow = -1;
            this.activeStartRow = -1;
            this.activeEndRow = -1;
            this.callsStartRow = -1;
            this.callsEndRow = -1;
            this.loadingCallsRow = -1;
            this.rowsCount = 0;
            boolean zIsEmpty = CallLogActivity.this.activeGroupCalls.isEmpty();
            boolean zIsEmpty2 = CallLogActivity.this.calls.isEmpty();
            if (!zIsEmpty || !zIsEmpty2) {
                int i = this.rowsCount;
                this.rowsCount = i + 1;
                this.createCallRow = i;
                if (!CallLogActivity.this.getUserConfig().showCallsTab) {
                    int i2 = this.rowsCount;
                    this.rowsCount = i2 + 1;
                    this.showInMainTabsRow = i2;
                }
            }
            if (!zIsEmpty) {
                int i3 = this.rowsCount;
                this.activeStartRow = i3;
                int size = i3 + CallLogActivity.this.activeGroupCalls.size();
                this.rowsCount = size;
                this.activeEndRow = size;
            }
            if (zIsEmpty2) {
                return;
            }
            int i4 = this.rowsCount;
            this.callsStartRow = i4;
            int size2 = i4 + CallLogActivity.this.calls.size();
            this.rowsCount = size2;
            this.callsEndRow = size2;
            if (CallLogActivity.this.endReached) {
                return;
            }
            int i5 = this.rowsCount;
            this.rowsCount = i5 + 1;
            this.loadingCallsRow = i5;
        }

        @Override
        public void notifyDataSetChanged() {
            updateRows();
            super.notifyDataSetChanged();
        }

        @Override
        public void notifyItemChanged(int i) {
            updateRows();
            super.notifyItemChanged(i);
        }

        @Override
        public void notifyItemRangeChanged(int i, int i2) {
            updateRows();
            super.notifyItemRangeChanged(i, i2);
        }

        @Override
        public void notifyItemRangeChanged(int i, int i2, Object obj) {
            updateRows();
            super.notifyItemRangeChanged(i, i2, obj);
        }

        @Override
        public void notifyItemInserted(int i) {
            updateRows();
            super.notifyItemInserted(i);
        }

        @Override
        public void notifyItemMoved(int i, int i2) {
            updateRows();
            super.notifyItemMoved(i, i2);
        }

        @Override
        public void notifyItemRangeInserted(int i, int i2) {
            updateRows();
            super.notifyItemRangeInserted(i, i2);
        }

        @Override
        public void notifyItemRemoved(int i) {
            updateRows();
            super.notifyItemRemoved(i);
        }

        @Override
        public void notifyItemRangeRemoved(int i, int i2) {
            updateRows();
            super.notifyItemRangeRemoved(i, i2);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 0 || itemViewType == 4 || itemViewType == 6;
        }

        @Override
        public int getItemCount() {
            return this.rowsCount;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View callCell;
            if (i == 0) {
                callCell = CallLogActivity.this.new CallCell(this.mContext);
            } else if (i == 1) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setViewType(8);
                flickerLoadingView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                flickerLoadingView.showDate(false);
                callCell = flickerLoadingView;
            } else if (i == 4) {
                callCell = CallLogActivity.this.new GroupCallCell(this.mContext);
            } else if (i == 6) {
                callCell = new TextCell(this.mContext);
            } else {
                callCell = new View(this.mContext);
            }
            return new RecyclerListView.Holder(callCell);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.itemView instanceof CallCell) {
                ((CallCell) viewHolder.itemView).setChecked(CallLogActivity.this.isSelected(((CallLogRow) CallLogActivity.this.calls.get(viewHolder.getAdapterPosition() - this.callsStartRow)).calls), false);
            }
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            SpannableString spannableString;
            String lowerCase;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType != 4) {
                    if (itemViewType != 6) {
                        return;
                    }
                    TextCell textCell = (TextCell) viewHolder.itemView;
                    if (i == this.showInMainTabsRow) {
                        textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.GroupCallShowInMainTabs), R.drawable.menu_add_tab_24, false);
                    } else {
                        textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.GroupCallCreate2), R.drawable.menu_call_create, false);
                    }
                    int i2 = Theme.key_telegram_color_text;
                    textCell.setColors(i2, i2);
                    return;
                }
                TLRPC.Chat chat = CallLogActivity.this.getMessagesController().getChat((Long) CallLogActivity.this.activeGroupCalls.get(i - this.activeStartRow));
                GroupCallCell groupCallCell = (GroupCallCell) viewHolder.itemView;
                groupCallCell.setChat(chat);
                groupCallCell.button.setTag(Long.valueOf(chat.id));
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
                groupCallCell.profileSearchCell.setData(chat, null, null, lowerCase, false, false);
                return;
            }
            CallLogRow callLogRow = (CallLogRow) CallLogActivity.this.calls.get(i - this.callsStartRow);
            CallCell callCell = (CallCell) viewHolder.itemView;
            callCell.imageView.setImageResource(callLogRow.video ? R.drawable.menu_videocall : R.drawable.menu_call_create_2_24);
            TLRPC.Message message = (TLRPC.Message) callLogRow.calls.get(0);
            String str = LocaleController.isRTL ? "\u202b" : "";
            if (callLogRow.calls.size() == 1) {
                spannableString = new SpannableString(str + "  " + LocaleController.formatDateCallLog(message.date));
            } else {
                spannableString = new SpannableString(String.format(str + "  (%d) %s", Integer.valueOf(callLogRow.calls.size()), LocaleController.formatDateCallLog(message.date)));
            }
            SpannableString spannableString2 = spannableString;
            int i3 = callLogRow.type;
            if (i3 == 0) {
                spannableString2.setSpan(CallLogActivity.this.iconOut, str.length(), str.length() + 1, 33);
            } else if (i3 == 1) {
                spannableString2.setSpan(CallLogActivity.this.iconIn, str.length(), str.length() + 1, 33);
            } else if (i3 == 2) {
                spannableString2.setSpan(CallLogActivity.this.iconMissedIn, str.length(), str.length() + 1, 33);
            } else if (i3 == 3) {
                spannableString2.setSpan(CallLogActivity.this.getIconMissedOut, str.length(), str.length() + 1, 33);
            }
            if (callLogRow.call_id == 0) {
                callCell.profileSearchCell.setAllowEmojiStatus(true);
                callCell.profileSearchCell.setData(callLogRow.users.isEmpty() ? null : callLogRow.users.get(0), null, null, spannableString2, false, false);
                callCell.avatarsImageView.setVisibility(8);
                callCell.profileSearchCell.dontDrawAvatar = false;
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i4 = 0; i4 < Math.min(3, callLogRow.users.size()); i4++) {
                    if (i4 > 0) {
                        sb.append(", ");
                    }
                    sb.append(DialogObject.getShortName((TLObject) callLogRow.users.get(i4)));
                }
                if (callLogRow.users.size() > 3) {
                    sb.append(" ");
                    sb.append(LocaleController.formatPluralString("AndOther", callLogRow.users.size() - 3, new Object[0]));
                }
                ArrayList arrayList = new ArrayList(callLogRow.users);
                arrayList.add(CallLogActivity.this.getUserConfig().getCurrentUser());
                callCell.profileSearchCell.setAllowEmojiStatus(false);
                callCell.profileSearchCell.setData(callLogRow.users.isEmpty() ? null : callLogRow.users.get(0), null, sb.toString(), spannableString2, false, false);
                callCell.avatarsImageView.setVisibility(0);
                callCell.profileSearchCell.avatarImage.clearImage();
                callCell.profileSearchCell.dontDrawAvatar = true;
                int iMin = Math.min(3, arrayList.size());
                for (int i5 = 0; i5 < iMin; i5++) {
                    callCell.avatarsImageView.setObject(i5, ((BaseFragment) CallLogActivity.this).currentAccount, (TLObject) arrayList.get(i5));
                }
                callCell.avatarsImageView.commitTransition(false);
            }
            callCell.imageView.setTag(callLogRow);
        }

        @Override
        public int getItemViewType(int i) {
            if (i >= this.callsStartRow && i < this.callsEndRow) {
                return 0;
            }
            if (i >= this.activeStartRow && i < this.activeEndRow) {
                return 4;
            }
            if (i == this.loadingCallsRow) {
                return 1;
            }
            return (i == this.createCallRow || i == this.showInMainTabsRow) ? 6 : 2;
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

    private void showItemsAnimated(final int i) {
        if (this.isPaused || !this.openTransitionStarted) {
            return;
        }
        final View view = null;
        for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
            View childAt = this.listView.getChildAt(i2);
            if (childAt instanceof FlickerLoadingView) {
                view = childAt;
            }
        }
        if (view != null) {
            this.listView.removeView(view);
        }
        AndroidUtilities.doOnPreDraw(this.listView, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showItemsAnimated$20(view, i);
            }
        });
    }

    public void lambda$showItemsAnimated$20(final View view, int i) {
        int childCount = this.listView.getChildCount();
        AnimatorSet animatorSet = new AnimatorSet();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.listView.getChildAt(i2);
            if (childAt != view && this.listView.getChildAdapterPosition(childAt) >= i && !(childAt instanceof GroupCallCell) && !(childAt instanceof TextCell)) {
                childAt.setAlpha(0.0f);
                int iMin = (int) ((Math.min(this.listView.getMeasuredHeight(), Math.max(0, childAt.getTop())) / this.listView.getMeasuredHeight()) * 100.0f);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat.setStartDelay(iMin);
                objectAnimatorOfFloat.setDuration(200L);
                animatorSet.playTogether(objectAnimatorOfFloat);
            }
        }
        if (view != null && view.getParent() == null) {
            this.listView.addView(view);
            final RecyclerView.LayoutManager layoutManager = this.listView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.ignoreView(view);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                objectAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        view.setAlpha(1.0f);
                        layoutManager.stopIgnoringView(view);
                        CallLogActivity.this.listView.removeView(view);
                    }
                });
                objectAnimatorOfFloat2.start();
            }
        }
        animatorSet.start();
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.navigationBarHeight = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom;
        checkUi_listViewPadding();
        checkUi_floatingButton();
        return WindowInsetsCompat.CONSUMED;
    }

    public void checkUi_floatingButton() {
        this.floatingButton.setTranslationY(((-this.navigationBarHeight) - this.additionFloatingButtonOffset) - this.additionalFloatingTranslation);
    }

    public void checkUi_listViewPadding() {
        this.listView.setPadding(0, AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP) + this.actionBar.getMeasuredHeight() + ((int) this.topPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.dp(14.0f))), 0, AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP) + this.navigationBarHeight + this.additionNavigationBarHeight);
        this.emptyView.setPadding(0, 0, 0, this.navigationBarHeight + this.additionNavigationBarHeight);
    }

    public void checkUi_listClip() {
        if (this.listView.hasActiveOverScroll()) {
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
                this.f$0.lambda$getThemeDescriptions$21();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        if (this.hasMainTabs) {
            arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{LocationCell.class, HeaderCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        } else {
            arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{LocationCell.class, CallCell.class, HeaderCell.class, GroupCallCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
            arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        }
        ActionBar actionBar = this.actionBar;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, i, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i2));
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
        arrayList.add(new ThemeDescription(this.flickerLoadingView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        return arrayList;
    }

    public void lambda$getThemeDescriptions$21() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof CallCell) {
                    ((CallCell) childAt).profileSearchCell.update(0);
                }
            }
        }
        ImageView imageView = this.actionModeCloseView;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarActionModeDefaultIcon), PorterDuff.Mode.MULTIPLY));
            this.actionModeCloseView.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector)));
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.updateColors();
        }
    }

    public static void showCallLinkSheet(final Context context, final int i, final TLRPC.InputGroupCall inputGroupCall, final String str, final Theme.ResourcesProvider resourcesProvider, boolean z, final boolean z2) {
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
        int i2 = R.drawable.ic_ab_other;
        imageView2.setImageResource(i2);
        int color = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(color, mode));
        int i3 = Theme.key_listSelector;
        imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(i3, resourcesProvider)));
        if (z2) {
            frameLayout.addView(imageView2, LayoutHelper.createFrame(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView = TextHelper.makeLinkTextView(context, 20.0f, i4, true, resourcesProvider);
        linksTextViewMakeLinkTextView.setText(LocaleController.getString(R.string.GroupCallCreatedLinkTitle));
        linksTextViewMakeLinkTextView.setGravity(17);
        linearLayout.addView(linksTextViewMakeLinkTextView, LayoutHelper.createLinear(-1, -2, 17, 32, 16, 32, 8));
        LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView2 = TextHelper.makeLinkTextView(context, 14.0f, i4, false, resourcesProvider);
        linksTextViewMakeLinkTextView2.setText(LocaleController.getString(R.string.GroupCallCreatedLinkText));
        linksTextViewMakeLinkTextView2.setGravity(17);
        linksTextViewMakeLinkTextView2.setMaxWidth(HintView2.cutInFancyHalf(linksTextViewMakeLinkTextView2.getText(), linksTextViewMakeLinkTextView2.getPaint()));
        linearLayout.addView(linksTextViewMakeLinkTextView2, LayoutHelper.createLinear(-1, -2, 17, 32, 0, 32, 18));
        String strSubstring = str.startsWith("https://") ? str.substring(8) : str;
        final FrameLayout frameLayout3 = new FrameLayout(context);
        ScaleStateListAnimator.apply(frameLayout3, 0.01f, 1.2f);
        int i5 = Theme.key_windowBackgroundGray;
        frameLayout3.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(i5, resourcesProvider), Theme.blendOver(Theme.getColor(i5, resourcesProvider), Theme.getColor(i3, resourcesProvider)), 12, 12));
        linearLayout.addView(frameLayout3, LayoutHelper.createLinear(-1, -2, 7, 16, 0, 16, 0));
        final LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView3 = TextHelper.makeLinkTextView(context, 13.0f, i4, false, resourcesProvider);
        linksTextViewMakeLinkTextView3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
        linksTextViewMakeLinkTextView3.setText(strSubstring);
        frameLayout3.addView(linksTextViewMakeLinkTextView3, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(ContextCompat.getDrawable(context, i2));
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
                    for (int i6 = 0; i6 < layout.getLineCount(); i6++) {
                        iMax = Math.max(iMax, (int) layout.getLineWidth(i6));
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
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    CallLogActivity.lambda$showCallLinkSheet$22(str, i, bottomSheetArr);
                }
            };
            LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView4 = TextHelper.makeLinkTextView(context, 14.0f, i4, false, resourcesProvider);
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
        }
        builder.setCustomView(linearLayout);
        final BottomSheet bottomSheetShow = builder.show();
        bottomSheetArr[0] = bottomSheetShow;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CallLogActivity.lambda$showCallLinkSheet$24(strArr, bottomSheetShow, resourcesProvider, view);
            }
        });
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CallLogActivity.lambda$showCallLinkSheet$25(strArr, bottomSheetShow, resourcesProvider, view);
            }
        });
        final Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                CallLogActivity.lambda$showCallLinkSheet$30(inputGroupCall, i, strArr, frameLayout3, linksTextViewMakeLinkTextView3, bottomSheetShow, resourcesProvider);
            }
        };
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CallLogActivity.lambda$showCallLinkSheet$33(bottomSheetShow, resourcesProvider, frameLayout3, strArr, context, z2, runnable2, view);
            }
        });
        buttonWithCounterView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CallLogActivity.lambda$showCallLinkSheet$34(context, str, strArr, resourcesProvider, bottomSheetShow, view);
            }
        });
        if (z2) {
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    CallLogActivity.lambda$showCallLinkSheet$35(bottomSheetShow, resourcesProvider, imageView2, runnable2, view);
                }
            });
        }
    }

    public static void lambda$showCallLinkSheet$22(String str, int i, BottomSheet[] bottomSheetArr) {
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        tL_inputGroupCallSlug.slug = Uri.parse(str).getPathSegments().get(r3.getPathSegments().size() - 1);
        VoIPHelper.joinConference(LaunchActivity.instance, i, tL_inputGroupCallSlug, false, null);
        bottomSheetArr[0].lambda$new$0();
    }

    public static void lambda$showCallLinkSheet$24(String[] strArr, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, View view) {
        AndroidUtilities.addToClipboard(strArr[0]);
        BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).createCopyBulletin(LocaleController.getString(R.string.LinkCopied)).show();
    }

    public static void lambda$showCallLinkSheet$25(String[] strArr, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, View view) {
        AndroidUtilities.addToClipboard(strArr[0]);
        BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).createCopyBulletin(LocaleController.getString(R.string.LinkCopied)).show();
    }

    public static void lambda$showCallLinkSheet$30(final TLRPC.InputGroupCall inputGroupCall, final int i, final String[] strArr, final FrameLayout frameLayout, final LinkSpanDrawable.LinksTextView linksTextView, final BottomSheet bottomSheet, final Theme.ResourcesProvider resourcesProvider) {
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = inputGroupCall;
        togglegroupcallsettings.reset_invite_hash = true;
        ConnectionsManager.getInstance(i).sendRequest(togglegroupcallsettings, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                CallLogActivity.lambda$showCallLinkSheet$29(i, inputGroupCall, strArr, frameLayout, linksTextView, bottomSheet, resourcesProvider, tLObject, tL_error);
            }
        });
    }

    public static void lambda$showCallLinkSheet$29(int i, TLRPC.InputGroupCall inputGroupCall, final String[] strArr, final FrameLayout frameLayout, final LinkSpanDrawable.LinksTextView linksTextView, final BottomSheet bottomSheet, final Theme.ResourcesProvider resourcesProvider, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(i).processUpdates((TLRPC.Updates) tLObject, false);
        }
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        exportgroupcallinvite.call = inputGroupCall;
        ConnectionsManager.getInstance(i).sendRequest(exportgroupcallinvite, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                CallLogActivity.lambda$showCallLinkSheet$28(strArr, frameLayout, linksTextView, bottomSheet, resourcesProvider, tLObject2, tL_error2);
            }
        });
    }

    public static void lambda$showCallLinkSheet$28(final String[] strArr, final FrameLayout frameLayout, final LinkSpanDrawable.LinksTextView linksTextView, final BottomSheet bottomSheet, final Theme.ResourcesProvider resourcesProvider, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CallLogActivity.lambda$showCallLinkSheet$27(tLObject, strArr, frameLayout, linksTextView, bottomSheet, resourcesProvider);
            }
        });
    }

    public static void lambda$showCallLinkSheet$27(TLObject tLObject, String[] strArr, final FrameLayout frameLayout, final LinkSpanDrawable.LinksTextView linksTextView, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider) {
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
                    CallLogActivity.lambda$showCallLinkSheet$26(frameLayout, atomicBoolean, linksTextView, strSubstring, valueAnimator);
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

    public static void lambda$showCallLinkSheet$26(FrameLayout frameLayout, AtomicBoolean atomicBoolean, LinkSpanDrawable.LinksTextView linksTextView, String str, ValueAnimator valueAnimator) {
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

    public static void lambda$showCallLinkSheet$33(final BottomSheet bottomSheet, final Theme.ResourcesProvider resourcesProvider, FrameLayout frameLayout, final String[] strArr, final Context context, boolean z, Runnable runnable, View view) {
        ItemOptions.makeOptions(bottomSheet.container, resourcesProvider, frameLayout).add(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                CallLogActivity.lambda$showCallLinkSheet$31(strArr, bottomSheet, resourcesProvider);
            }
        }).add(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable() {
            @Override
            public final void run() {
                CallLogActivity.lambda$showCallLinkSheet$32(context, strArr);
            }
        }).addIf(z, R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.RevokeLink), true, runnable).show();
    }

    public static void lambda$showCallLinkSheet$31(String[] strArr, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider) {
        AndroidUtilities.addToClipboard(strArr[0]);
        BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).createCopyBulletin(LocaleController.getString(R.string.LinkCopied)).show();
    }

    public static void lambda$showCallLinkSheet$32(Context context, String[] strArr) {
        QRCodeBottomSheet qRCodeBottomSheet = new QRCodeBottomSheet(context, LocaleController.getString(R.string.InviteByQRCode), strArr[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
        qRCodeBottomSheet.setCenterAnimation(R.raw.qr_code_logo);
        qRCodeBottomSheet.show();
    }

    public static void lambda$showCallLinkSheet$34(Context context, String str, String[] strArr, Theme.ResourcesProvider resourcesProvider, final BottomSheet bottomSheet, View view) {
        ArrayList arrayList = null;
        new ShareAlert(context, arrayList, str, false, strArr[0], false, resourcesProvider) {
            @Override
            protected void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                String string;
                if (z) {
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

    public static void lambda$showCallLinkSheet$35(BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, ImageView imageView, Runnable runnable, View view) {
        ItemOptions.makeOptions(bottomSheet.getContainer(), resourcesProvider, imageView).add(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), runnable).setOnTopOfScrim().translate(0.0f, -AndroidUtilities.dp(6.0f)).setDimAlpha(0).show();
    }

    private void openCreateCall() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isCall", true);
        presentFragment(new AnonymousClass11(bundle));
    }

    class AnonymousClass11 extends GroupCreateActivity {
        AnonymousClass11(Bundle bundle) {
            super(bundle);
        }

        @Override
        protected void onCallUsersSelected(final HashSet hashSet, final boolean z) {
            if (hashSet.size() == 1) {
                final TLRPC.User user = getMessagesController().getUser((Long) hashSet.iterator().next());
                TLRPC.UserFull userFull = getMessagesController().getUserFull(user.id);
                if (userFull != null) {
                    VoIPHelper.startCall(CallLogActivity.this.lastCallUser = user, z, userFull.video_calls_available, getParentActivity(), userFull, getAccountInstance());
                } else {
                    TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                    tL_users_getFullUser.id = getMessagesController().getInputUser(user.id);
                    getConnectionsManager().sendRequest(tL_users_getFullUser, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f$0.lambda$onCallUsersSelected$1(user, z, tLObject, tL_error);
                        }
                    });
                    return;
                }
            } else {
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$onCallUsersSelected$3(z, hashSet, tLObject, tL_error);
                    }
                });
            }
            finishFragment();
        }

        public void lambda$onCallUsersSelected$1(final TLRPC.User user, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onCallUsersSelected$0(tLObject, user, z);
                }
            });
        }

        public void lambda$onCallUsersSelected$0(TLObject tLObject, TLRPC.User user, boolean z) {
            TLRPC.UserFull userFull;
            if (tLObject instanceof TLRPC.TL_users_userFull) {
                TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
                MessagesController.getInstance(CallLogActivity.this.currentAccount).putUsers(tL_users_userFull.users, false);
                MessagesController.getInstance(CallLogActivity.this.currentAccount).putChats(tL_users_userFull.chats, false);
                userFull = tL_users_userFull.full_user;
            } else {
                userFull = null;
            }
            TLRPC.UserFull userFull2 = userFull;
            VoIPHelper.startCall(CallLogActivity.this.lastCallUser = user, z, userFull2 != null && userFull2.video_calls_available, getParentActivity(), userFull2, getAccountInstance());
        }

        public void lambda$onCallUsersSelected$3(final boolean z, final HashSet hashSet, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() throws InterruptedException {
                    this.f$0.lambda$onCallUsersSelected$2(tLObject, z, hashSet, tL_error);
                }
            });
        }

        public void lambda$onCallUsersSelected$2(TLObject tLObject, boolean z, HashSet hashSet, TLRPC.TL_error tL_error) throws InterruptedException {
            if (tLObject instanceof TLRPC.Updates) {
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                MessagesController.getInstance(this.currentAccount).putUsers(updates.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(updates.chats, false);
                Iterator it = MessagesController.findUpdatesAndRemove(updates, TLRPC.TL_updateGroupCall.class).iterator();
                TLRPC.GroupCall groupCall = null;
                while (it.hasNext()) {
                    groupCall = ((TLRPC.TL_updateGroupCall) it.next()).call;
                }
                if (LaunchActivity.instance == null || groupCall == null) {
                    return;
                }
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.id = groupCall.id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                VoIPHelper.joinConference(LaunchActivity.instance, this.currentAccount, tL_inputGroupCall, z, groupCall, hashSet);
                return;
            }
            if (!(tLObject instanceof TL_phone.groupCall)) {
                if (tL_error != null) {
                    BulletinFactory.of(CallLogActivity.this).showForError(tL_error);
                    return;
                }
                return;
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(groupcall.chats, false);
            if (LaunchActivity.instance == null) {
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall2 = groupcall.call;
            tL_inputGroupCall2.id = groupCall2.id;
            tL_inputGroupCall2.access_hash = groupCall2.access_hash;
            VoIPHelper.joinConference(LaunchActivity.instance, this.currentAccount, tL_inputGroupCall2, z, groupCall2, hashSet);
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
                CallLogActivity.lambda$createCallLink$39(i, alertDialog, context, resourcesProvider, runnable, tLObject, tL_error);
            }
        });
    }

    public static void lambda$createCallLink$39(final int i, final AlertDialog alertDialog, final Context context, final Theme.ResourcesProvider resourcesProvider, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CallLogActivity.lambda$createCallLink$38(tLObject, i, alertDialog, context, resourcesProvider, runnable);
            }
        });
    }

    public static void lambda$createCallLink$38(TLObject tLObject, final int i, final AlertDialog alertDialog, final Context context, final Theme.ResourcesProvider resourcesProvider, final Runnable runnable) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(i).putUsers(updates.users, false);
            MessagesController.getInstance(i).putChats(updates.chats, false);
            Iterator it = MessagesController.findUpdatesAndRemove(updates, TLRPC.TL_updateGroupCall.class).iterator();
            TLRPC.GroupCall groupCall = null;
            while (it.hasNext()) {
                groupCall = ((TLRPC.TL_updateGroupCall) it.next()).call;
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
                    CallLogActivity.lambda$createCallLink$37(alertDialog, context, i, exportgroupcallinvite, resourcesProvider, runnable, tLObject2, tL_error);
                }
            });
            return;
        }
        alertDialog.dismiss();
        AndroidUtilities.runOnUIThread(runnable);
    }

    public static void lambda$createCallLink$37(final AlertDialog alertDialog, final Context context, final int i, final TL_phone.exportGroupCallInvite exportgroupcallinvite, final Theme.ResourcesProvider resourcesProvider, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CallLogActivity.lambda$createCallLink$36(tLObject, alertDialog, context, i, exportgroupcallinvite, resourcesProvider, runnable);
            }
        });
    }

    public static void lambda$createCallLink$36(TLObject tLObject, AlertDialog alertDialog, Context context, int i, TL_phone.exportGroupCallInvite exportgroupcallinvite, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            alertDialog.dismiss();
            showCallLinkSheet(context, i, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject).link, resourcesProvider, true, true);
        } else {
            alertDialog.dismiss();
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    private void showItemOptions() {
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this, this.otherItem);
        itemOptionsMakeOptions.setDimAlpha(8);
        if (getUserConfig().showCallsTab) {
            itemOptionsMakeOptions.add(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showItemOptions$41();
                }
            });
        }
        itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.DeleteAllCalls), true, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showItemOptions$42();
            }
        });
        itemOptionsMakeOptions.show();
        itemOptionsMakeOptions.setTranslationY(-AndroidUtilities.dp(64.0f));
    }

    public void lambda$showItemOptions$41() {
        setCallsTabVisible(false);
        (this.hasMainTabs ? BulletinFactory.global() : BulletinFactory.of(this)).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showItemOptions$40();
            }
        }).setDuration(5000).show();
    }

    public void lambda$showItemOptions$40() {
        setCallsTabVisible(true);
    }

    public void lambda$showItemOptions$42() {
        showDeleteAlert(true);
    }

    private void setCallsTabVisible(boolean z) {
        if (z == getUserConfig().showCallsTab) {
            return;
        }
        getUserConfig().setShowCallsTab(z);
        if (z) {
            if (this.listViewAdapter.showInMainTabsRow != -1) {
                ListAdapter listAdapter = this.listViewAdapter;
                listAdapter.notifyItemRemoved(listAdapter.showInMainTabsRow);
            }
        } else if (this.listViewAdapter.createCallRow != -1) {
            ListAdapter listAdapter2 = this.listViewAdapter;
            listAdapter2.notifyItemInserted(listAdapter2.createCallRow + 1);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
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
