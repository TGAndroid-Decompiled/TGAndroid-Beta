package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.util.StateSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.internal.mlkit_language_id_common.zzit;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.google.android.gms.internal.mlkit_vision_common.zzlo;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline0;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda8;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$MediaCell$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticLambda80;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AccountSelectCell;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda10;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.GroupCallInvitedCell;
import org.telegram.ui.Cells.GroupCallTextCell;
import org.telegram.ui.Cells.GroupCallUserCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AlertsCreator$$ExternalSyntheticLambda121;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BlobDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.CodepointsLengthInputFilter;
import org.telegram.ui.Components.ColorPicker;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.FillLastGridLayoutManager;
import org.telegram.ui.Components.GroupCallFullscreenAdapter;
import org.telegram.ui.Components.GroupCallPip;
import org.telegram.ui.Components.GroupCallRecordAlert;
import org.telegram.ui.Components.GroupVoipInviteAlert;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.JoinCallAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Components.PopupSwipeBackLayout;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.ProfileGalleryView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecordStatusDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Shaker;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TopicsTabsView;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.conference.GroupCallActivityButtonsLayout;
import org.telegram.ui.Components.conference.message.GroupCallMessageCell;
import org.telegram.ui.Components.conference.message.GroupCallMessagesListView;
import org.telegram.ui.Components.inset.WindowInsetsStateHolder;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.Components.voip.GroupCallGridCell;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Components.voip.GroupCallRenderersContainer;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialog;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Components.voip.VoIPBackgroundProvider;
import org.telegram.ui.Components.voip.VoIPToggleButton;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.bots.BotVerifySheet$$ExternalSyntheticLambda0;
import org.webrtc.voiceengine.WebRtcAudioTrack;

public final class GroupCallActivity extends BottomSheet implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, FactorAnimator.Target {
    public static GroupCallActivity groupCallInstance;
    public static boolean groupCallUiVisible;
    public static boolean isLandscapeMode;
    public static boolean isTabletMode;
    public static boolean paused;
    public static volatile DispatchQueue updateTextureLightningQueue = new DispatchQueue("updateTextureLightningQueue");
    public final AccountInstance accountInstance;
    public final AccountSelectCell accountSelectCell;
    public final AnonymousClass5 actionBar;
    public AnimatorSet actionBarAnimation;
    public final AnonymousClass21 actionBarBackground;
    public final View actionBarShadow;
    public ObjectAnimator additionalSubtitleYAnimator;
    public final ActionBarMenuSubItem adminItem;
    public float amplitude;
    public float animateAmplitudeDiff;
    public float animateToAmplitude;
    public boolean animatingToFullscreenExpand;
    public final BoolAnimator animatorHasVideo;
    public final BoolAnimator animatorHideButtons;
    public final FactorAnimator animatorMessageInputHeight;
    public final BoolAnimator animatorMessageIsEmpty;
    public boolean anyEnterEventSent;
    public final ArrayList attachedRenderers;
    public final ArrayList attachedRenderersTmp;
    public final AnonymousClass29 avatarPagerIndicator;
    public final AnonymousClass31 avatarPreviewContainer;
    public boolean avatarPriviewTransitionInProgress;
    public AvatarUpdaterDelegate avatarUpdaterDelegate;
    public boolean avatarsPreviewShowed;
    public final AnonymousClass30 avatarsViewPager;
    public int backgroundColor;
    public final RLottieDrawable bigMicDrawable;
    public final BlobDrawable bigWaveDrawable;
    public final AnonymousClass33 blurredView;
    public GradientDrawable buttonsBackgroundGradient;
    public final View buttonsBackgroundGradientView;
    public final View buttonsBackgroundGradientView2;
    public final AnonymousClass17 buttonsContainer;
    public int buttonsVisibility;
    public Integer cacheAudioOutputValue;
    public ChatObject.Call call;
    public boolean callInitied;
    public final AnonymousClass39 callMessageEnterContainer;
    public final Paint callMessageEnterContainerBgPaint;
    public final AnonymousClass38 callMessageEnterUnderContainer;
    public final AnonymousClass36 callMessageEnterView;
    public final ImageView callMessageHideButton;
    public final ImageView callMessageSendButton;
    public final VoIPToggleButton cameraButton;
    public final CellFlickerDrawable cellFlickerDrawable;
    public boolean changingPermissions;
    public float colorProgress;
    public final int[] colorsTmp;
    public boolean contentFullyOverlayed;
    public long creatingServiceTime;
    public ImageUpdater currentAvatarUpdater;
    public int currentCallState;
    public TLRPC.Chat currentChat;
    public LinearLayout currentOptionsLayout;
    public WeavingState currentState;
    public boolean delayedGroupCallUpdated;
    public final AnonymousClass65 diffUtilsCallback;
    public final ActionBarMenuSubItem disableComments;
    public boolean drawSpeakingSubtitle;
    public boolean drawingForBlur;
    public final ActionBarMenuSubItem editTitleItem;
    public final ActionBarMenuSubItem enableComments;
    public CallEncryptionCellDrawable encryptionDrawable;
    public boolean enterEventSent;
    public final ActionBarMenuSubItem everyoneItem;
    public final ImageView expandOrMinimizeButton;
    public final VoIPToggleButton flipButton;
    public final RLottieDrawable flipIcon;
    public int flipIconCurrentEndFrame;
    public final GroupCallFullscreenAdapter fullscreenAdapter;
    public final AnonymousClass25 fullscreenListItemAnimator;
    public final AnonymousClass24 fullscreenUsersListView;
    public final int[] gradientColors;
    public final GroupCallMessagesListView groupCallMessagesListView;
    public GroupVoipInviteAlert groupVoipInviteAlert;
    public final RLottieDrawable handDrawables;
    public boolean hasScrimAnchorView;
    public boolean hasVideo;
    public boolean invalidateColors;
    public final ActionBarMenuSubItem inviteItem;
    public final String[] invites;
    public boolean isInDrawRenderNodeBlur;
    public boolean isInFullscreen;
    public final GroupCallItemAnimator itemAnimator;
    public long lastUpdateTime;
    public final FillLastGridLayoutManager layoutManager;
    public final VoIPToggleButton leaveButton;
    public final ActionBarMenuSubItem leaveItem;
    public final AnimatedTextView limitTextView;
    public final ListAdapter listAdapter;
    public final AnonymousClass9 listView;
    public final Paint listViewBackgroundPaint;
    public boolean listViewVideoVisibility;
    public ValueAnimator liveLabelBgColorAnimator;
    public final Paint liveLabelPaint;
    public final AnonymousClass22 liveLabelTextView;
    public final int maxGroupCallMessageLength;
    public final LinearLayout menuItemsContainer;
    public final VoIPToggleButton messageButton;
    public final VoIPToggleButton muteButton;
    public final AnonymousClass18 muteButtonIcon;
    public int muteButtonState;
    public boolean needTextureLightning;
    public final ActionBarMenuSubItem noiseItem;
    public int oldAddMemberRow;
    public int oldConferenceAddPeopleRow;
    public int oldConferenceShareLinkRow;
    public int oldCount;
    public int oldEncryptionRow;
    public final ArrayList oldInvited;
    public int oldInvitedEndRow;
    public int oldInvitedStartRow;
    public final ArrayList oldParticipants;
    public final ArrayList oldShadyJoin;
    public int oldShadyJoinEndRow;
    public int oldShadyJoinStartRow;
    public final ArrayList oldShadyLeft;
    public int oldShadyLeftEndRow;
    public int oldShadyLeftStartRow;
    public int oldUsersEndRow;
    public int oldUsersStartRow;
    public int oldUsersVideoEndRow;
    public int oldUsersVideoStartRow;
    public int oldVideoDividerRow;
    public int oldVideoNotAvailableRow;
    public final ArrayList oldVideoParticipants;
    public final GroupCallActivity$$ExternalSyntheticLambda8 onUserLeaveHintListener;
    public final ActionBarMenuItem otherItem;
    public final Paint paint;
    public final Paint paintTmp;
    public LaunchActivity parentActivity;
    public Boolean pendingCommentsEnabled;
    public final ActionBarMenuSubItem permissionItem;
    public final AnonymousClass45 pinchToZoomHelper;
    public final ActionBarMenuItem pipItem;
    public boolean playingHandAnimation;
    public int popupAnimationIndex;
    public final GroupCallActivity$$ExternalSyntheticLambda8 pressRunnable;
    public boolean pressed;
    public WeavingState prevState;
    public AnonymousClass47 previewDialog;
    public boolean previewTextureTransitionEnabled;
    public float progressToAvatarPreview;
    public RadialGradient radialGradient;
    public final Matrix radialMatrix;
    public final Paint radialPaint;
    public final RadialProgressView radialProgressView;
    public final ImageReceiver reactionEffectImageReceiver;
    public ReactionsContainerLayout reactionsContainerLayout;
    public final RecordCallDrawable recordCallDrawable;
    public HintView recordHintView;
    public final ActionBarMenuSubItem recordItem;
    public final RectF rect;
    public HintView reminderHintView;
    public RenderNode renderNodeBlur;
    public float renderNodeBlurScale;
    public final AnonymousClass28 renderersContainer;
    public ViewTreeObserver.OnPreDrawListener requestFullscreenListener;
    public ValueAnimator scheduleAnimator;
    public final AnonymousClass42 scheduleButtonTextView;
    public final boolean scheduleHasFewPeers;
    public final TextView scheduleInfoTextView;
    public TLRPC.InputPeer schedulePeer;
    public int scheduleStartAt;
    public final SimpleTextView scheduleStartAtTextView;
    public final SimpleTextView scheduleStartInTextView;
    public final AnonymousClass8 scheduleTimeTextView;
    public final AnonymousClass44 scheduleTimerContainer;
    public boolean scheduled;
    public final String scheduledHash;
    public final ActionBarMenuSubItem screenItem;
    public final ActionBarMenuItem screenShareItem;
    public AnimatorSet scrimAnimatorSet;
    public GroupCallFullscreenAdapter.GroupCallUserCell scrimFullscreenView;
    public GroupCallGridCell scrimGridView;
    public final AnonymousClass4 scrimPaint;
    public ActionBarPopupWindow.ActionBarPopupWindowLayout scrimPopupLayout;
    public AnonymousClass63 scrimPopupWindow;
    public GroupCallMiniTextureView scrimRenderer;
    public GroupCallUserCell scrimView;
    public float scrollOffsetY;
    public TLRPC.Peer selfPeer;
    public final Drawable shadowDrawable;
    public AnonymousClass55 shareAlert;
    public float showLightingProgress;
    public float showWavesProgress;
    public final AnonymousClass7 sizeNotifierFrameLayout;
    public final VoIPToggleButton soundButton;
    public final ActionBarMenuSubItem soundItem;
    public final TextView soundItemDivider;
    public final AnonymousClass11 spanSizeLookup;
    public final VoIPToggleButton speakerButton;
    public int speakerIcon;
    public final ImageView speakerImageView;
    public boolean startingGroupCall;
    public final WeavingState[] states;
    public final ArrayList statusIconPool;
    public ObjectAnimator subtitleYAnimator;
    public float switchProgress;
    public float switchToButtonInt2;
    public float switchToButtonProgress;
    public final GroupCallTabletGridAdapter tabletGridAdapter;
    public final RecyclerListView tabletVideoGridView;
    public final LightningView textureLightningView;
    public float textureLightningViewAnimatingAlpha;
    public final BlobDrawable tinyWaveDrawable;
    public final LinearLayout titleLayout;
    public final AnonymousClass20 titleTextView;
    public final UndoView[] undoView;
    public final QrActivity$5$$ExternalSyntheticLambda1 unmuteRunnable;
    public GroupCallActivity$$ExternalSyntheticLambda8 updateCallRecordRunnable;
    public final AnonymousClass1 updateSchedeulRunnable;
    public final LaunchActivity.AnonymousClass18 updateTextureLightningRunnable;
    public boolean useBlur;
    public TLObject userSwitchObject;
    public final LongSparseIntArray visiblePeerIds;
    public final ArrayList visibleVideoParticipants;
    public Boolean wasNotInLayoutFullscreen;
    public final WatchersView watchersView;
    public final WindowInsetsStateHolder windowInsetsStateHolder;

    public final class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override
        public final void run() {
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            if (groupCallActivity.scheduleTimeTextView == null || groupCallActivity.isDismissed()) {
                return;
            }
            ChatObject.Call call = groupCallActivity.call;
            int i = call != null ? call.call.schedule_date : groupCallActivity.scheduleStartAt;
            if (i == 0) {
                return;
            }
            int currentTime = i - groupCallActivity.accountInstance.getConnectionsManager().getCurrentTime();
            if (currentTime >= 86400) {
                groupCallActivity.scheduleTimeTextView.setText(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
            } else {
                groupCallActivity.scheduleTimeTextView.setText(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
                if (currentTime < 0 && groupCallActivity.scheduleStartInTextView.getTag() == null) {
                    groupCallActivity.scheduleStartInTextView.setTag(1);
                    groupCallActivity.scheduleStartInTextView.setText(LocaleController.getString(R.string.VoipChatLateBy), false);
                }
            }
            groupCallActivity.scheduleStartAtTextView.setText(LocaleController.formatStartsTime(i, 3), false);
            AndroidUtilities.runOnUIThread(groupCallActivity.updateSchedeulRunnable, 1000L);
        }
    }

    public final class AnonymousClass11 extends BaseMenuWrapper {
        public AnonymousClass11() {
        }

        @Override
        public final int getSpanSize(int i) {
            ListAdapter listAdapter;
            int i2;
            int i3;
            int i4 = GroupCallActivity.isLandscapeMode ? 6 : 2;
            if (GroupCallActivity.isTabletMode || i < (i2 = (listAdapter = GroupCallActivity.this.listAdapter).usersVideoGridStartRow) || i >= (i3 = listAdapter.usersVideoGridEndRow)) {
                return i4;
            }
            int i5 = i3 - i2;
            int i6 = (i != i3 - 1 || (!GroupCallActivity.isLandscapeMode && i5 % 2 == 0)) ? 1 : 2;
            if (!GroupCallActivity.isLandscapeMode) {
                return i6;
            }
            if (i5 == 1) {
                return 6;
            }
            return i5 == 2 ? 3 : 2;
        }
    }

    public final class AnonymousClass13 {
        public AnonymousClass13() {
        }
    }

    public final class AnonymousClass19 implements View.OnClickListener {
        public final LaunchActivity.AnonymousClass18 finishRunnable = new LaunchActivity.AnonymousClass18(this, 11);

        public AnonymousClass19() {
        }

        @Override
        public final void onClick(View view) {
            HintView hintView;
            int i;
            int i2;
            LaunchActivity launchActivity;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            if (groupCallActivity.call == null || groupCallActivity.muteButtonState == 3) {
                return;
            }
            if (groupCallActivity.isRtmpStream() && !groupCallActivity.call.isScheduled()) {
                AnonymousClass28 anonymousClass28 = groupCallActivity.renderersContainer;
                if (anonymousClass28 != null && anonymousClass28.inFullscreenMode && (AndroidUtilities.isTablet() || GroupCallActivity.isLandscapeMode == groupCallActivity.isRtmpLandscapeMode())) {
                    groupCallActivity.fullscreenFor(null);
                    if (GroupCallActivity.isLandscapeMode) {
                        AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda6(this, 3), 200L);
                    }
                    groupCallActivity.parentActivity.setRequestedOrientation(-1);
                    return;
                }
                ArrayList arrayList = groupCallActivity.visibleVideoParticipants;
                if (arrayList.isEmpty()) {
                    return;
                }
                ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
                if (AndroidUtilities.isTablet()) {
                    groupCallActivity.fullscreenFor(videoParticipant);
                    return;
                }
                if (GroupCallActivity.isLandscapeMode == groupCallActivity.isRtmpLandscapeMode()) {
                    groupCallActivity.fullscreenFor(videoParticipant);
                }
                if (groupCallActivity.isRtmpLandscapeMode()) {
                    groupCallActivity.parentActivity.setRequestedOrientation(6);
                    return;
                } else {
                    groupCallActivity.parentActivity.setRequestedOrientation(1);
                    return;
                }
            }
            int i3 = groupCallActivity.muteButtonState;
            AccountInstance accountInstance = groupCallActivity.accountInstance;
            if (i3 == 5) {
                if (groupCallActivity.startingGroupCall) {
                    return;
                }
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                groupCallActivity.startingGroupCall = true;
                TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                startscheduledgroupcall.call = groupCallActivity.call.getInputGroupCall();
                final int i4 = 0;
                accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                    public final GroupCallActivity.AnonymousClass19 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i4) {
                            case 0:
                                GroupCallActivity.AnonymousClass19 anonymousClass19 = this.f$0;
                                if (tLObject == null) {
                                    anonymousClass19.getClass();
                                } else {
                                    GroupCallActivity.this.accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                break;
                            default:
                                GroupCallActivity.AnonymousClass19 anonymousClass110 = this.f$0;
                                if (tLObject == null) {
                                    anonymousClass110.getClass();
                                } else {
                                    GroupCallActivity.this.accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                break;
                        }
                    }
                });
                return;
            }
            if (i3 == 7 || i3 == 6) {
                if (i3 == 6 && (hintView = groupCallActivity.reminderHintView) != null) {
                    hintView.hide(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = groupCallActivity.call.getInputGroupCall();
                TLRPC.GroupCall groupCall = groupCallActivity.call.call;
                boolean z = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z;
                togglegroupcallstartsubscription.subscribed = z;
                final int i5 = 1;
                accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final GroupCallActivity.AnonymousClass19 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i5) {
                            case 0:
                                GroupCallActivity.AnonymousClass19 anonymousClass19 = this.f$0;
                                if (tLObject == null) {
                                    anonymousClass19.getClass();
                                } else {
                                    GroupCallActivity.this.accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                break;
                            default:
                                GroupCallActivity.AnonymousClass19 anonymousClass110 = this.f$0;
                                if (tLObject == null) {
                                    anonymousClass110.getClass();
                                } else {
                                    GroupCallActivity.this.accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                break;
                        }
                    }
                });
                groupCallActivity.updateMuteButton(groupCallActivity.call.call.schedule_start_subscribed ? 7 : 6, true);
                return;
            }
            if (VoIPService.getSharedInstance() == null || (i = groupCallActivity.currentCallState) == 1 || i == 2 || i == 6 || i == 5) {
                return;
            }
            int i6 = groupCallActivity.muteButtonState;
            VoIPToggleButton voIPToggleButton = groupCallActivity.muteButton;
            if (i6 != 2 && i6 != 4) {
                try {
                    if (i6 != 0) {
                        groupCallActivity.updateMuteButton(0, true);
                        VoIPService.getSharedInstance().setMicMute(true, false, true);
                        voIPToggleButton.performHapticFeedback(3, 2);
                        return;
                    } else {
                        if (Build.VERSION.SDK_INT >= 23 && (launchActivity = groupCallActivity.parentActivity) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                            PermissionRequest.ensureEitherPermission(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new LinkEditActivity$$ExternalSyntheticLambda9(5));
                            return;
                        }
                        groupCallActivity.updateMuteButton(1, true);
                        VoIPService.getSharedInstance().setMicMute(false, false, true);
                        voIPToggleButton.performHapticFeedback(3, 2);
                        return;
                    }
                } catch (Exception unused2) {
                    return;
                }
            }
            if (groupCallActivity.isConference() || groupCallActivity.playingHandAnimation) {
                return;
            }
            groupCallActivity.playingHandAnimation = true;
            AndroidUtilities.shakeView(voIPToggleButton.getTextView());
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused3) {
            }
            int iNextInt = Utilities.random.nextInt(100);
            int i7 = 120;
            if (iNextInt < 32) {
                i2 = 0;
            } else {
                i2 = 240;
                if (iNextInt < 64) {
                    i7 = 240;
                    i2 = 120;
                } else {
                    i7 = 420;
                    if (iNextInt >= 97) {
                        i2 = 540;
                        if (iNextInt == 98) {
                            i7 = 540;
                            i2 = 420;
                        } else {
                            i7 = 720;
                        }
                    }
                }
            }
            RLottieDrawable rLottieDrawable = groupCallActivity.handDrawables;
            rLottieDrawable.setCustomEndFrame(i7);
            rLottieDrawable.setOnFinishCallback(i7 - 1, this.finishRunnable);
            AnonymousClass18 anonymousClass18 = groupCallActivity.muteButtonIcon;
            anonymousClass18.setAnimation(rLottieDrawable);
            rLottieDrawable.setCurrentFrame(i2, true, false);
            anonymousClass18.playAnimation();
            if (groupCallActivity.muteButtonState == 2) {
                long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) groupCallActivity.call.participants.get(MessageObject.getPeerId(groupCallActivity.selfPeer))).peer);
                VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
                groupCallActivity.updateMuteButton(4, true);
            }
        }
    }

    public final class AnonymousClass20 extends AudioPlayerAlert.ClippingTextViewSwitcher {
        public final LaunchActivity val$context;

        public AnonymousClass20(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
            super(launchActivity);
            this.val$context = launchActivity2;
        }

        @Override
        public final TextView createTextView() {
            TextView textView = new TextView(this.val$context);
            textView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_actionBarItems, false));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(51);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(16, this, textView));
            return textView;
        }
    }

    public final class AnonymousClass28 extends GroupCallRenderersContainer {
        public AnonymousClass28(LaunchActivity launchActivity, AnonymousClass9 anonymousClass9, AnonymousClass24 anonymousClass24, ArrayList arrayList, ChatObject.Call call, GroupCallActivity groupCallActivity) {
            super(launchActivity, anonymousClass9, anonymousClass24, arrayList, call, groupCallActivity);
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            if (view == GroupCallActivity.this.scrimRenderer) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }

        @Override
        public final void onFullScreenModeChanged(boolean z) {
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            groupCallActivity.delayedGroupCallUpdated = z;
            boolean z2 = GroupCallActivity.isTabletMode;
            AnonymousClass28 anonymousClass28 = groupCallActivity.renderersContainer;
            if (z2) {
                if (z || !anonymousClass28.inFullscreenMode) {
                    return;
                }
                groupCallActivity.tabletGridAdapter.setVisibility(groupCallActivity.tabletVideoGridView, false, true);
                return;
            }
            WatchersView watchersView = groupCallActivity.watchersView;
            AnonymousClass5 anonymousClass5 = groupCallActivity.actionBar;
            AnonymousClass9 anonymousClass9 = groupCallActivity.listView;
            GroupCallFullscreenAdapter groupCallFullscreenAdapter = groupCallActivity.fullscreenAdapter;
            AnonymousClass24 anonymousClass24 = groupCallActivity.fullscreenUsersListView;
            if (z) {
                groupCallActivity.undoView[0].hide(1, false);
                anonymousClass28.undoView[0].hide(2, false);
                if (!anonymousClass28.inFullscreenMode) {
                    anonymousClass9.setVisibility(0);
                    anonymousClass5.setVisibility(0);
                    if (watchersView != null) {
                        watchersView.setVisibility(0);
                    }
                }
                groupCallActivity.updateState(true, false);
                groupCallActivity.buttonsContainer.requestLayout();
                if (anonymousClass24.getVisibility() != 0) {
                    anonymousClass24.setVisibility(0);
                    groupCallFullscreenAdapter.setVisibility(anonymousClass24, true);
                    groupCallFullscreenAdapter.update(anonymousClass24, false);
                } else {
                    groupCallFullscreenAdapter.setVisibility(anonymousClass24, true);
                    groupCallActivity.applyCallParticipantUpdates(true);
                }
            } else {
                if (anonymousClass28.inFullscreenMode) {
                    anonymousClass5.setVisibility(8);
                    anonymousClass9.setVisibility(8);
                    if (watchersView != null) {
                        watchersView.setVisibility(8);
                    }
                } else {
                    anonymousClass24.setVisibility(8);
                    groupCallFullscreenAdapter.setVisibility(anonymousClass24, false);
                }
                if (anonymousClass24.getVisibility() == 0) {
                    for (int i = 0; i < anonymousClass24.getChildCount(); i++) {
                        View childAt = anonymousClass24.getChildAt(i);
                        childAt.setAlpha(1.0f);
                        childAt.setScaleX(1.0f);
                        childAt.setScaleY(1.0f);
                        childAt.setTranslationX(0.0f);
                        childAt.setTranslationY(0.0f);
                        ((GroupCallFullscreenAdapter.GroupCallUserCell) childAt).setProgressToFullscreen(anonymousClass28.progressToFullscreenMode);
                    }
                }
            }
            groupCallActivity.buttonsBackgroundGradientView2.setVisibility(z ? 0 : 8);
            if (groupCallActivity.delayedGroupCallUpdated) {
                return;
            }
            groupCallActivity.applyCallParticipantUpdates(true);
        }

        @Override
        public final void update() {
            invalidate();
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            float f = groupCallActivity.colorProgress;
            AnonymousClass28 anonymousClass28 = groupCallActivity.renderersContainer;
            ((BottomSheet) groupCallActivity).navBarColor = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_actionBarUnscrolled, false), Theme.getColor(null, Theme.key_voipgroup_actionBar, false), Math.max(f, anonymousClass28 == null ? 0.0f : anonymousClass28.progressToFullscreenMode), 1.0f);
            ((BottomSheet) groupCallActivity).containerView.invalidate();
            groupCallActivity.setColorProgress(groupCallActivity.colorProgress);
        }
    }

    public final class AnonymousClass30 extends ProfileGalleryView {
        public AnonymousClass30(LaunchActivity launchActivity, AnonymousClass5 anonymousClass5, AnonymousClass9 anonymousClass9, AnonymousClass29 anonymousClass29) {
            super(launchActivity, anonymousClass5, anonymousClass9, anonymousClass29);
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
        }
    }

    public final class AnonymousClass31 extends FrameLayout {
        public final Path path;
        public final Rect rect;
        public final RectF rectF;

        public AnonymousClass31(LaunchActivity launchActivity) {
            super(launchActivity);
            this.rect = new Rect();
            this.rectF = new RectF();
            this.path = new Path();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            View childAt;
            GroupCallMiniTextureView groupCallMiniTextureView;
            int i = 0;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            if (groupCallActivity.progressToAvatarPreview != 1.0f) {
                if (groupCallActivity.scrimView != null && groupCallActivity.hasScrimAnchorView) {
                    canvas.save();
                    float measuredHeight = (groupCallActivity.scrimView.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / groupCallActivity.scrimView.getAvatarImageView().getMeasuredHeight());
                    float f = (1.0f - groupCallActivity.progressToAvatarPreview) * measuredHeight;
                    float fDp = AndroidUtilities.dp(13.0f);
                    float f2 = groupCallActivity.progressToAvatarPreview;
                    int i2 = (int) ((fDp * f2) + f);
                    int i3 = (int) ((1.0f - f2) * measuredHeight);
                    groupCallActivity.scrimView.getAvatarWavesDrawable().draw(canvas, groupCallActivity.scrimView.getAvatarImageView().getMeasuredHeight() / 2, groupCallActivity.scrimView.getAvatarImageView().getMeasuredHeight() / 2, this);
                    groupCallActivity.scrimView.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    BackupImageView avatarImageView = groupCallActivity.scrimView.getAvatarImageView();
                    avatarImageView.imageReceiver.setRoundRadius(i2, i2, i3, i3);
                    if (avatarImageView.blurAllowed) {
                        avatarImageView.blurImageReceiver.setRoundRadius(i2, i2, i3, i3);
                    }
                    avatarImageView.invalidate();
                    groupCallActivity.scrimView.getAvatarImageView().getImageReceiver().draw(canvas);
                    groupCallActivity.scrimView.getAvatarImageView().setRoundRadius(groupCallActivity.scrimView.getAvatarImageView().getMeasuredHeight() / 2);
                    canvas.restore();
                } else if (groupCallActivity.scrimFullscreenView != null && groupCallActivity.scrimRenderer == null && groupCallActivity.previewTextureTransitionEnabled) {
                    canvas.save();
                    float measuredHeight2 = (groupCallActivity.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / groupCallActivity.scrimFullscreenView.getAvatarImageView().getMeasuredHeight());
                    float f3 = (1.0f - groupCallActivity.progressToAvatarPreview) * measuredHeight2;
                    float fDp2 = AndroidUtilities.dp(13.0f);
                    float f4 = groupCallActivity.progressToAvatarPreview;
                    int i4 = (int) ((fDp2 * f4) + f3);
                    int i5 = (int) ((1.0f - f4) * measuredHeight2);
                    groupCallActivity.scrimFullscreenView.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    BackupImageView avatarImageView2 = groupCallActivity.scrimFullscreenView.getAvatarImageView();
                    avatarImageView2.imageReceiver.setRoundRadius(i4, i4, i5, i5);
                    if (avatarImageView2.blurAllowed) {
                        avatarImageView2.blurImageReceiver.setRoundRadius(i4, i4, i5, i5);
                    }
                    avatarImageView2.invalidate();
                    groupCallActivity.scrimFullscreenView.getAvatarImageView().getImageReceiver().draw(canvas);
                    groupCallActivity.scrimFullscreenView.getAvatarImageView().setRoundRadius(groupCallActivity.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() / 2);
                    canvas.restore();
                }
            }
            float f5 = groupCallActivity.progressToAvatarPreview;
            AnonymousClass30 anonymousClass30 = groupCallActivity.avatarsViewPager;
            anonymousClass30.setAlpha(f5);
            Path path = this.path;
            path.reset();
            RectF rectF = this.rectF;
            rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
            path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
            canvas.save();
            canvas.clipPath(path);
            if (!anonymousClass30.hasActiveVideo) {
                childAt = null;
                break;
            }
            while (true) {
                if (i >= anonymousClass30.getChildCount()) {
                    childAt = null;
                    break;
                }
                childAt = anonymousClass30.getChildAt(i);
                if (childAt instanceof ProfileGalleryView.TextureStubView) {
                    break;
                } else {
                    i++;
                }
            }
            if (childAt != null && (groupCallMiniTextureView = groupCallActivity.scrimRenderer) != null && groupCallMiniTextureView.attached && !groupCallActivity.drawingForBlur) {
                canvas.save();
                Rect rect = this.rect;
                rect.setEmpty();
                anonymousClass30.getChildVisibleRect(childAt, rect, null);
                int measuredWidth = rect.left;
                if (measuredWidth < (-anonymousClass30.getMeasuredWidth())) {
                    measuredWidth += anonymousClass30.getMeasuredWidth() * 2;
                } else if (measuredWidth > anonymousClass30.getMeasuredWidth()) {
                    measuredWidth -= anonymousClass30.getMeasuredWidth() * 2;
                }
                canvas.translate(measuredWidth, 0.0f);
                groupCallActivity.scrimRenderer.draw(canvas);
                canvas.restore();
            }
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int iMin = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + iMin, 1073741824));
        }
    }

    public final class AnonymousClass33 extends View {
        public AnonymousClass33(LaunchActivity launchActivity) {
            super(launchActivity);
        }

        @Override
        public final void setAlpha(float f) {
            if (getAlpha() != f) {
                super.setAlpha(f);
                GroupCallActivity.this.checkContentOverlayed();
            }
        }
    }

    public final class AnonymousClass34 implements GroupCallMessagesListView.Delegate {
        public AnonymousClass34() {
        }
    }

    public final class AnonymousClass35 implements GroupCallMessageCell.Delegate {
        public AnonymousClass35() {
        }

        public final void openSenderProfile(GroupCallMessage groupCallMessage) {
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment == null) {
                return;
            }
            boolean z = lastFragment instanceof ProfileActivity;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            if (z && ((ProfileActivity) lastFragment).getDialogId() == groupCallMessage.fromId) {
                groupCallActivity.lambda$showGiftOfferSheet$15();
                return;
            }
            int childCount = groupCallActivity.listView.getChildCount();
            int iMin = Integer.MAX_VALUE;
            for (int i = 0; i < childCount; i++) {
                AnonymousClass9 anonymousClass9 = groupCallActivity.listView;
                View childAt = anonymousClass9.getChildAt(i);
                anonymousClass9.getClass();
                if (RecyclerView.getChildAdapterPosition(childAt) >= 0) {
                    iMin = Math.min(iMin, childAt.getTop());
                }
            }
            Bundle bundle = new Bundle();
            long j = groupCallMessage.fromId;
            if (j > 0) {
                bundle.putLong("user_id", j);
            } else {
                bundle.putLong("chat_id", -j);
            }
            long j2 = groupCallMessage.fromId;
            boolean z2 = true;
            if (j2 == groupCallActivity.accountInstance.getUserConfig().getClientUserId()) {
                bundle.putBoolean("my_profile", true);
            }
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            if (iMin > 0 && iMin != Integer.MAX_VALUE) {
                z2 = false;
            }
            lastFragment.presentFragment(profileActivity, false, z2);
            groupCallActivity.lambda$showGiftOfferSheet$15();
        }
    }

    public final class AnonymousClass4 extends Paint {
        public AnonymousClass4() {
        }

        @Override
        public final void setAlpha(int i) {
            super.setAlpha(i);
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            if (((BottomSheet) groupCallActivity).containerView != null) {
                ((BottomSheet) groupCallActivity).containerView.invalidate();
            }
        }
    }

    public final class AnonymousClass47 extends PrivateVideoPreviewDialog {
        public AnonymousClass47(LaunchActivity launchActivity, boolean z) {
            super(launchActivity, z);
        }
    }

    public final class AnonymousClass5 extends ActionBar {
        public final RecordStatusDrawable val$recordStatusDrawable;

        public AnonymousClass5(LaunchActivity launchActivity, RecordStatusDrawable recordStatusDrawable) {
            super(launchActivity, null);
            this.val$recordStatusDrawable = recordStatusDrawable;
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (getAdditionalSubtitleTextView().getVisibility() == 0) {
                canvas.save();
                canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
                int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
                RecordStatusDrawable recordStatusDrawable = this.val$recordStatusDrawable;
                recordStatusDrawable.alpha = alpha;
                recordStatusDrawable.draw(canvas);
                canvas.restore();
                invalidate();
            }
        }

        @Override
        public final void setAlpha(float f) {
            if (getAlpha() != f) {
                super.setAlpha(f);
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }
        }
    }

    public final class AnonymousClass54 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final GroupCallActivity this$0;

        public AnonymousClass54(GroupCallActivity groupCallActivity, int i) {
            this.$r8$classId = i;
            this.this$0 = groupCallActivity;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    GroupCallActivity groupCallActivity = this.this$0;
                    groupCallActivity.scheduleTimeTextView.setVisibility(4);
                    groupCallActivity.scheduleStartAtTextView.setVisibility(4);
                    groupCallActivity.scheduleStartInTextView.setVisibility(4);
                    break;
                case 1:
                    this.this$0.actionBarAnimation = null;
                    break;
                default:
                    GroupCallActivity groupCallActivity2 = this.this$0;
                    groupCallActivity2.liveLabelBgColorAnimator = null;
                    groupCallActivity2.liveLabelPaint.setColor(groupCallActivity2.currentCallState == 3 ? -1163700 : -12761513);
                    groupCallActivity2.liveLabelTextView.invalidate();
                    break;
            }
        }
    }

    public final class AnonymousClass61 extends LinearLayout {
        public final int $r8$classId;
        public final Object val$buttonsLayout;
        public Object val$volumeLayout;

        public AnonymousClass61(Context context, Object obj, LinearLayout linearLayout, int i) {
            super(context);
            this.$r8$classId = i;
            this.val$buttonsLayout = obj;
            this.val$volumeLayout = linearLayout;
        }

        public static boolean isParent(View view, View view2) {
            if (view == view2) {
                return true;
            }
            if (view.getParent() == null) {
                return false;
            }
            if (view.getParent() instanceof View) {
                return isParent((View) view.getParent(), view2);
            }
            return view.getParent() == view2 || view.getRootView() == view2;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 4:
                    super.dispatchDraw(canvas);
                    ((Text) this.val$buttonsLayout).draw(canvas, ((NumberPicker) this.val$volumeLayout).getX() - AndroidUtilities.dp(50.0f), getHeight() / 2.0f, 1.0f);
                    break;
                case 5:
                default:
                    super.dispatchDraw(canvas);
                    break;
                case 6:
                    canvas.save();
                    TopicsTabsView.VerticalTabView verticalTabView = (TopicsTabsView.VerticalTabView) this.val$volumeLayout;
                    float f = ((AnimatedFloat) this.val$buttonsLayout).set(verticalTabView.reorder);
                    if (f > 0.0f) {
                        if (verticalTabView.shaker == null) {
                            verticalTabView.shaker = new Shaker(this);
                        }
                        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                        verticalTabView.shaker.concat(canvas, f);
                        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                    }
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    break;
                case 7:
                    RectF rectF = (RectF) this.val$buttonsLayout;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    float x = getX();
                    float y = getY();
                    VoIPBackgroundProvider voIPBackgroundProvider = (VoIPBackgroundProvider) this.val$volumeLayout;
                    voIPBackgroundProvider.setDarkTranslation(x, y);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), voIPBackgroundProvider.getDarkPaint());
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 2:
                    boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (!zDispatchTouchEvent) {
                        int[] iArr = (int[]) this.val$buttonsLayout;
                        getLocationOnScreen(iArr);
                        motionEvent.offsetLocation(iArr[0], iArr[1]);
                        if (motionEvent.getAction() == 0) {
                            List<View> listAllGlobalViews = AndroidUtilities.allGlobalViews();
                            if (listAllGlobalViews != null && listAllGlobalViews.size() > 1) {
                                for (int size = listAllGlobalViews.size() - 2; size >= 0; size--) {
                                    View view = listAllGlobalViews.get(size);
                                    if (!isParent(this, view)) {
                                        view.getLocationOnScreen(iArr);
                                        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                                        zDispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
                                        if (zDispatchTouchEvent) {
                                            this.val$volumeLayout = view;
                                            return true;
                                        }
                                        motionEvent.offsetLocation(iArr[0], iArr[1]);
                                    }
                                }
                            }
                        } else {
                            View view2 = (View) this.val$volumeLayout;
                            if (view2 != null) {
                                view2.getLocationOnScreen(iArr);
                                motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                                zDispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
                            }
                        }
                    }
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.val$volumeLayout = null;
                    }
                    return zDispatchTouchEvent;
                default:
                    return super.dispatchTouchEvent(motionEvent);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 3:
                    canvas.drawPath((Path) this.val$buttonsLayout, (Paint) this.val$volumeLayout);
                    super.onDraw(canvas);
                    break;
                case 5:
                    super.onDraw(canvas);
                    LPhotoPaintView lPhotoPaintView = (LPhotoPaintView) this.val$volumeLayout;
                    TextView textView = (TextView) getChildAt(lPhotoPaintView.tabsSelectedIndex);
                    int i = lPhotoPaintView.tabsNewSelectedIndex;
                    TextView textView2 = i != -1 ? (TextView) getChildAt(i) : null;
                    Paint paint = (Paint) this.val$buttonsLayout;
                    paint.setColor(textView.getCurrentTextColor());
                    float y = ((textView.getY() + textView.getHeight()) - textView.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                    Layout layout = textView.getLayout();
                    Layout layout2 = textView2 != null ? textView2.getLayout() : null;
                    float interpolation = layout2 == null ? 0.0f : CubicBezierInterpolator.DEFAULT.getInterpolation(lPhotoPaintView.tabsSelectionProgress);
                    float fLerp = AndroidUtilities.lerp(layout.getPrimaryHorizontal(layout.getLineStart(0)) + textView.getX(), textView2 != null ? layout2.getPrimaryHorizontal(layout.getLineStart(0)) + textView2.getX() : 0.0f, interpolation);
                    canvas.drawLine(fLerp, y, AndroidUtilities.lerp(layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0)), layout2 != null ? layout2.getPrimaryHorizontal(layout2.getLineEnd(0)) - layout2.getPrimaryHorizontal(layout2.getLineStart(0)) : 0.0f, interpolation) + fLerp, y, paint);
                    break;
                case 8:
                    super.onDraw(canvas);
                    PaintView paintView = (PaintView) this.val$volumeLayout;
                    TextView textView3 = (TextView) getChildAt(paintView.tabsSelectedIndex);
                    int i2 = paintView.tabsNewSelectedIndex;
                    TextView textView4 = i2 != -1 ? (TextView) getChildAt(i2) : null;
                    Paint paint2 = (Paint) this.val$buttonsLayout;
                    paint2.setColor(textView3.getCurrentTextColor());
                    float y2 = ((textView3.getY() + textView3.getHeight()) - textView3.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                    Layout layout3 = textView3.getLayout();
                    if (layout3 != null) {
                        Layout layout4 = textView4 != null ? textView4.getLayout() : null;
                        float interpolation2 = layout4 == null ? 0.0f : CubicBezierInterpolator.DEFAULT.getInterpolation(paintView.tabsSelectionProgress);
                        float fLerp2 = AndroidUtilities.lerp(layout3.getPrimaryHorizontal(layout3.getLineStart(0)) + textView3.getX(), layout4 != null ? layout4.getPrimaryHorizontal(layout3.getLineStart(0)) + textView4.getX() : 0.0f, interpolation2);
                        canvas.drawLine(fLerp2, y2, AndroidUtilities.lerp(layout3.getPrimaryHorizontal(layout3.getLineEnd(0)) - layout3.getPrimaryHorizontal(layout3.getLineStart(0)), layout4 != null ? layout4.getPrimaryHorizontal(layout4.getLineEnd(0)) - layout4.getPrimaryHorizontal(layout4.getLineStart(0)) : 0.0f, interpolation2) + fLerp2, y2, paint2);
                        break;
                    }
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                    LinearLayout linearLayout = (LinearLayout) this.val$buttonsLayout;
                    linearLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    LinearLayout linearLayout2 = (LinearLayout) this.val$volumeLayout;
                    if (linearLayout2 == null) {
                        setMeasuredDimension(linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight());
                    } else {
                        linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        setMeasuredDimension(linearLayout.getMeasuredWidth(), linearLayout2.getMeasuredHeight() + linearLayout.getMeasuredHeight());
                    }
                    break;
                case 1:
                    ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) this.val$volumeLayout;
                    actionBarMenuItem.popupLayout.measure(i, i2);
                    PopupSwipeBackLayout swipeBack = actionBarMenuItem.popupLayout.getSwipeBack();
                    View view = (View) this.val$buttonsLayout;
                    if (swipeBack != null) {
                        view.getLayoutParams().width = actionBarMenuItem.popupLayout.getSwipeBack().getChildAt(0).getMeasuredWidth();
                    } else {
                        view.getLayoutParams().width = actionBarMenuItem.popupLayout.getMeasuredWidth() - AndroidUtilities.dp(16.0f);
                    }
                    super.onMeasure(i, i2);
                    break;
                case 2:
                default:
                    super.onMeasure(i, i2);
                    break;
                case 3:
                    super.onMeasure(i, i2);
                    Path path = (Path) this.val$buttonsLayout;
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f));
                    path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                    break;
            }
        }

        public AnonymousClass61(Activity activity, VoIPBackgroundProvider voIPBackgroundProvider) {
            super(activity);
            this.$r8$classId = 7;
            this.val$buttonsLayout = new RectF();
            this.val$volumeLayout = voIPBackgroundProvider;
            voIPBackgroundProvider.views.add(this);
        }

        public AnonymousClass61(Context context, int i) {
            super(context);
            this.$r8$classId = i;
            switch (i) {
                case 3:
                    super(context);
                    this.val$buttonsLayout = new Path();
                    Paint paint = new Paint(1);
                    this.val$volumeLayout = paint;
                    paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
                    break;
                default:
                    this.val$buttonsLayout = new int[2];
                    this.val$volumeLayout = null;
                    break;
            }
        }

        public AnonymousClass61(ActionBarMenuItem actionBarMenuItem, Context context, View view) {
            super(context);
            this.$r8$classId = 1;
            this.val$volumeLayout = actionBarMenuItem;
            this.val$buttonsLayout = view;
        }

        public AnonymousClass61(LPhotoPaintView lPhotoPaintView, Context context) {
            super(context);
            this.$r8$classId = 5;
            this.val$volumeLayout = lPhotoPaintView;
            Paint paint = new Paint(1);
            this.val$buttonsLayout = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            setWillNotDraw(false);
        }

        public AnonymousClass61(TopicsTabsView.VerticalTabView verticalTabView, Context context) {
            super(context);
            this.$r8$classId = 6;
            this.val$volumeLayout = verticalTabView;
            this.val$buttonsLayout = new AnimatedFloat(360L, this, CubicBezierInterpolator.EASE_OUT_QUINT);
        }

        public AnonymousClass61(PaintView paintView, Context context) {
            super(context);
            this.$r8$classId = 8;
            this.val$volumeLayout = paintView;
            Paint paint = new Paint(1);
            this.val$buttonsLayout = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            setWillNotDraw(false);
        }
    }

    public final class AnonymousClass63 extends ActionBarPopupWindow {
        public AnonymousClass63(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
            super(actionBarPopupWindowLayout);
        }

        @Override
        public final void dismiss() {
            dismiss(true);
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            if (groupCallActivity.scrimPopupWindow != this) {
                return;
            }
            groupCallActivity.scrimPopupWindow = null;
            AnimatorSet animatorSet = groupCallActivity.scrimAnimatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
                groupCallActivity.scrimAnimatorSet = null;
            }
            groupCallActivity.layoutManager.canScrollVertically = true;
            groupCallActivity.scrimAnimatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofInt(groupCallActivity.scrimPaint, AnimationProperties.PAINT_ALPHA, 0));
            groupCallActivity.scrimAnimatorSet.playTogether(arrayList);
            groupCallActivity.scrimAnimatorSet.setDuration(220L);
            groupCallActivity.scrimAnimatorSet.addListener(new PhotoViewer$41$1(this, 14));
            groupCallActivity.scrimAnimatorSet.start();
        }
    }

    public final class AnonymousClass9 extends RecyclerListView {
        public final LongSparseIntArray visiblePeerTmp;

        public AnonymousClass9(LaunchActivity launchActivity) {
            super(launchActivity, null);
            this.visiblePeerTmp = new LongSparseIntArray();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            float f;
            int i;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            boolean z = groupCallActivity.itemAnimator.outMinTop != Float.MAX_VALUE;
            LongSparseIntArray longSparseIntArray = this.visiblePeerTmp;
            longSparseIntArray.clear();
            for (int i2 = 0; i2 < groupCallActivity.visiblePeerIds.size(); i2++) {
                longSparseIntArray.put(groupCallActivity.visiblePeerIds.keyAt(i2), 1);
            }
            groupCallActivity.visiblePeerIds.clear();
            int childCount = getChildCount();
            int i3 = 0;
            boolean z2 = false;
            float fMin = Float.MAX_VALUE;
            float fMax = 0.0f;
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                RecyclerView.ViewHolder viewHolderFindContainingViewHolder = findContainingViewHolder(childAt);
                if (viewHolderFindContainingViewHolder == null || (i = viewHolderFindContainingViewHolder.mItemViewType) == 3 || i == 4 || i == 5 || i == 6 || i == 7) {
                    z2 = z2;
                } else {
                    if (i == 1) {
                        View view = viewHolderFindContainingViewHolder.itemView;
                        if (view instanceof GroupCallUserCell) {
                            GroupCallUserCell groupCallUserCell = (GroupCallUserCell) view;
                            i3 = i3;
                            groupCallActivity.visiblePeerIds.append(groupCallUserCell.getPeerId(), 1);
                            if (longSparseIntArray.get(groupCallUserCell.getPeerId(), 0) == 0) {
                                z2 = true;
                            } else {
                                longSparseIntArray.delete(groupCallUserCell.getPeerId());
                            }
                        } else {
                            i3 = i3;
                        }
                        z2 = z2;
                    } else {
                        i3 = i3;
                        z2 = z2;
                    }
                    if (!z) {
                        fMax = Math.max(fMax, childAt.getY() + childAt.getMeasuredHeight());
                        fMin = Math.min(fMin, Math.max(0.0f, childAt.getY()));
                    } else if (!groupCallActivity.itemAnimator.removingHolders.contains(viewHolderFindContainingViewHolder)) {
                        fMin = Math.min(fMin, Math.max(0, childAt.getTop()));
                        fMax = Math.max(fMax, childAt.getBottom());
                    }
                }
                i3++;
            }
            if (longSparseIntArray.size() > 0 ? true : z2) {
                groupCallActivity.updateSubtitle$1();
            }
            if (z) {
                GroupCallItemAnimator groupCallItemAnimator = groupCallActivity.itemAnimator;
                float f2 = groupCallItemAnimator.outMinTop;
                float f3 = groupCallItemAnimator.animationProgress;
                float f4 = 1.0f - f3;
                f = (fMin * f3) + (f2 * f4);
                fMax = (fMax * f3) + (f4 * groupCallItemAnimator.outMaxBottom);
            } else {
                f = fMin;
            }
            if (fMin != Float.MAX_VALUE) {
                int measuredWidth = (getMeasuredWidth() - (AndroidUtilities.isTablet() ? Math.min(AndroidUtilities.dp(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1;
                groupCallActivity.rect.set(measuredWidth, f, getMeasuredWidth() - measuredWidth, Math.min(getMeasuredHeight() - getTranslationY(), fMax));
                canvas.drawRoundRect(groupCallActivity.rect, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), groupCallActivity.listViewBackgroundPaint);
            }
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            if (view == GroupCallActivity.this.scrimView) {
                return false;
            }
            return super.drawChild(canvas, view, j);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            super.onLayout(z, i, i2, i3, i4);
            GroupCallItemAnimator groupCallItemAnimator = GroupCallActivity.this.itemAnimator;
            if (groupCallItemAnimator.animator != null) {
                return;
            }
            HashSet hashSet = groupCallItemAnimator.addingHolders;
            hashSet.clear();
            hashSet.addAll(groupCallItemAnimator.mPendingAdditions);
            HashSet hashSet2 = groupCallItemAnimator.removingHolders;
            hashSet2.clear();
            hashSet2.addAll(groupCallItemAnimator.mPendingRemovals);
            groupCallItemAnimator.outMaxBottom = 0.0f;
            groupCallItemAnimator.outMinTop = Float.MAX_VALUE;
            if (hashSet.isEmpty() && hashSet2.isEmpty()) {
                return;
            }
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            int childCount = groupCallActivity.listView.getChildCount();
            int i6 = 0;
            while (true) {
                AnonymousClass9 anonymousClass9 = groupCallActivity.listView;
                if (i6 >= childCount) {
                    groupCallItemAnimator.animationProgress = 0.0f;
                    anonymousClass9.invalidate();
                    return;
                }
                View childAt = anonymousClass9.getChildAt(i6);
                RecyclerView.ViewHolder viewHolderFindContainingViewHolder = anonymousClass9.findContainingViewHolder(childAt);
                if (viewHolderFindContainingViewHolder != null && (i5 = viewHolderFindContainingViewHolder.mItemViewType) != 3 && i5 != 4 && i5 != 5 && i5 != 7 && !hashSet.contains(viewHolderFindContainingViewHolder)) {
                    groupCallItemAnimator.outMaxBottom = Math.max(groupCallItemAnimator.outMaxBottom, childAt.getY() + childAt.getMeasuredHeight());
                    groupCallItemAnimator.outMinTop = Math.min(groupCallItemAnimator.outMinTop, Math.max(0.0f, childAt.getY()));
                }
                i6++;
            }
        }

        @Override
        public final void setVisibility(int i) {
            if (getVisibility() != i) {
                for (int i2 = 0; i2 < getChildCount(); i2++) {
                    View childAt = getChildAt(i2);
                    if (childAt instanceof GroupCallGridCell) {
                        GroupCallActivity.access$12900(GroupCallActivity.this, (GroupCallGridCell) childAt, childAt.isAttachedToWindow() && i == 0);
                    }
                }
            }
            super.setVisibility(i);
        }
    }

    public final class AvatarUpdaterDelegate implements ImageUpdater.ImageUpdaterDelegate {
        public TLRPC.FileLocation avatar;
        public TLRPC.FileLocation avatarBig;
        public final long peerId;
        public ImageLocation uploadingImageLocation;
        public float uploadingProgress;

        public AvatarUpdaterDelegate(long j) {
            this.peerId = j;
        }

        @Override
        public final boolean canFinishFragment() {
            return true;
        }

        @Override
        public final void didStartUpload(boolean z, boolean z2) {
        }

        @Override
        public final void didUploadFailed() {
        }

        @Override
        public final void didUploadPhoto(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
            AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda76(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 3));
        }

        @Override
        public final PhotoViewer.PlaceProviderObject getCloseIntoObject() {
            return null;
        }

        @Override
        public final String getInitialSearchString() {
            return null;
        }

        @Override
        public final void onUploadProgressChanged(float f) {
            GroupCallActivity.this.avatarsViewPager.setUploadProgress(this.uploadingImageLocation, f);
            updateAvatarUploadingProgress(f);
        }

        @Override
        public final boolean supportsBulletin() {
            return false;
        }

        public final void updateAvatarUploadingProgress(float f) {
            this.uploadingProgress = f;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            if (groupCallActivity.listView == null) {
                return;
            }
            for (int i = 0; i < groupCallActivity.listView.getChildCount(); i++) {
                View childAt = groupCallActivity.listView.getChildAt(i);
                if (childAt instanceof GroupCallUserCell) {
                    GroupCallUserCell groupCallUserCell = (GroupCallUserCell) childAt;
                    if (groupCallUserCell.isSelfUser()) {
                        ProfileActivity.AnonymousClass22 anonymousClass22 = groupCallUserCell.avatarProgressView;
                        anonymousClass22.setProgress(f);
                        if (f < 1.0f) {
                            AndroidUtilities.updateViewVisibilityAnimated(anonymousClass22, true, 1.0f, true);
                        } else {
                            AndroidUtilities.updateViewVisibilityAnimated(anonymousClass22, false, 1.0f, true);
                        }
                    }
                }
            }
        }
    }

    public final class CallEncryptionCellDrawable {
        public final Text closeText;
        public int listBackgroundColor;
        public QrActivity.AnonymousClass2 parentView;
        public final Text text1;
        public final Text text2;
        public final Paint backgroundPaint = new Paint(1);
        public final Paint dividerPaint = new Paint(1);
        public final EmojiSlot[] slots = new EmojiSlot[4];
        public boolean loading = true;
        public final AnimatedFloat loadingAlpha = new AnimatedFloat(new IntroActivity$$ExternalSyntheticLambda6(this, 5), 320, CubicBezierInterpolator.EASE_OUT_QUINT, 0);
        public final RectF fromRect = new RectF();
        public final RectF toRect = new RectF();
        public final Path clipPath = new Path();

        public CallEncryptionCellDrawable() {
            int i = 0;
            while (true) {
                EmojiSlot[] emojiSlotArr = this.slots;
                if (i >= emojiSlotArr.length) {
                    break;
                }
                emojiSlotArr[i] = new EmojiSlot(i);
                i++;
            }
            this.backgroundPaint.setColor(Theme.getColor(null, Theme.key_voipgroup_listViewBackground, false));
            this.text1 = new Text(LocaleController.getString(R.string.ConferenceEncrypted), 12.0f, AndroidUtilities.bold());
            Text text = new Text(LocaleController.getString(R.string.ConferenceEncryptedInfo), 11.0f, null);
            text.maxLines = 99;
            text.setText(text.layout.getText());
            text.maxWidth = AndroidUtilities.dp(200.0f);
            text.setText(text.layout.getText());
            float fDp = AndroidUtilities.dp(2.66f);
            if (text.lineSpacingAdd != fDp) {
                text.lineSpacingAdd = fDp;
                text.setText(text.layout.getText());
            }
            this.text2 = text;
            this.closeText = new Text(LocaleController.getString(R.string.ConferenceEncryptedClose), 14.0f, AndroidUtilities.bold());
            setEmojis(null);
        }

        public final boolean draw(Canvas canvas, float f, float f2) {
            canvas.save();
            float fDp = f - AndroidUtilities.dp(132.0f);
            Text text = this.text1;
            text.ellipsizeWidth = fDp;
            Paint paint = this.backgroundPaint;
            paint.setColor(ColorUtils.blendARGB(f2, this.listBackgroundColor, Theme.getColor(null, Theme.key_voipgroup_listViewBackground, false)));
            float f3 = this.loadingAlpha.set(this.loading);
            float width = text.getWidth() + AndroidUtilities.dp(86.0f) + AndroidUtilities.dp(14.0f);
            float fDp2 = AndroidUtilities.dp(28.0f);
            float fDp3 = AndroidUtilities.dp(232.0f);
            float fDp4 = AndroidUtilities.dp(54.0f) + this.text2.layout.getHeight() + AndroidUtilities.dp(50.0f);
            float fLerp = AndroidUtilities.lerp(width, fDp3, f2);
            float fLerp2 = AndroidUtilities.lerp(fDp2, fDp4, f2);
            float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), f2);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((f - fLerp) / 2.0f, 0.0f, (f + fLerp) / 2.0f, fLerp2);
            canvas.drawRoundRect(rectF, fLerp3, fLerp3, paint);
            Path path = this.clipPath;
            path.rewind();
            path.addRoundRect(rectF, fLerp3, fLerp3, Path.Direction.CW);
            canvas.clipPath(path);
            int iDp = AndroidUtilities.dp(18.0f);
            int iDp2 = (int) ((fDp3 - AndroidUtilities.dp(32.0f)) / 4.0f);
            int iDp3 = AndroidUtilities.dp(30.0f);
            int i = iDp / 2;
            int iCenterY = ((int) rectF.centerY()) - i;
            int iCenterY2 = ((int) rectF.centerY()) + i;
            RectF rectF2 = this.fromRect;
            float f4 = iDp / 2.0f;
            float f5 = iCenterY;
            float f6 = iCenterY2;
            rectF2.set((AndroidUtilities.dp(10.0f) + (AndroidUtilities.dp(7.0f) + ((int) rectF.left))) - f4, f5, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(7.0f) + ((int) rectF.left) + f4, f6);
            float f7 = f / 2.0f;
            float f8 = f7 - (iDp2 * 2);
            float f9 = iDp2;
            RectF rectF3 = this.toRect;
            float f10 = (int) ((0.5f * f9) + f8);
            float f11 = iDp3 / 2.0f;
            rectF3.set(f10 - f11, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f11), f10 + f11, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f11));
            AndroidUtilities.lerpCentered(rectF2, rectF3, f2, rectF3);
            EmojiSlot[] emojiSlotArr = this.slots;
            boolean zDraw = emojiSlotArr[0].draw(canvas, rectF3, f2);
            rectF2.set((AndroidUtilities.dp(10.0f) + (AndroidUtilities.dp(27.0f) + ((int) rectF.left))) - f4, f5, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(27.0f) + ((int) rectF.left) + f4, f6);
            float f12 = (int) ((f9 * 1.5f) + f8);
            boolean z = zDraw;
            rectF3.set(f12 - f11, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f11), f12 + f11, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f11));
            AndroidUtilities.lerpCentered(rectF2, rectF3, f2, rectF3);
            if (emojiSlotArr[1].draw(canvas, rectF3, f2)) {
                z = true;
            }
            text.draw(f7 - (text.getWidth() / 2.0f), fDp2 / 2.0f, AndroidUtilities.lerp(1.0f, 0.75f, f3) * (1.0f - f2), -1, canvas);
            rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f))) - f4, f5, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f)) + f4, f6);
            float f13 = (int) ((f9 * 2.5f) + f8);
            rectF3.set(f13 - f11, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f11), f13 + f11, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f11));
            AndroidUtilities.lerpCentered(rectF2, rectF3, f2, rectF3);
            if (emojiSlotArr[2].draw(canvas, rectF3, f2)) {
                z = true;
            }
            rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f))) - f4, f5, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f)) + f4, f6);
            float f14 = (int) ((f9 * 3.5f) + f8);
            rectF3.set(f14 - f11, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f11), f14 + f11, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f11));
            AndroidUtilities.lerpCentered(rectF2, rectF3, f2, rectF3);
            boolean z2 = emojiSlotArr[3].draw(canvas, rectF3, f2) ? true : z;
            if (f2 > 0.0f) {
                this.text2.draw(AndroidUtilities.dp(16.0f) + (rectF.centerX() - (fDp3 / 2.0f)), AndroidUtilities.dp(54.0f), f2, -1, canvas);
                Paint paint2 = this.dividerPaint;
                paint2.setColor(-16777216);
                paint2.setAlpha((int) (255.0f * f2));
                canvas.drawRect(rectF.left, fDp4 - AndroidUtilities.dp(40.0f), rectF.right, AndroidUtilities.dp(0.66f) + (fDp4 - AndroidUtilities.dp(40.0f)), paint2);
                this.closeText.draw(rectF.centerX() - (this.closeText.getWidth() / 2.0f), fDp4 - AndroidUtilities.dp(20.0f), f2, -1, canvas);
            }
            canvas.restore();
            return z2;
        }

        public final void setEmojis(String[] strArr) {
            this.loading = strArr == null;
            for (int i = 0; i < 4; i++) {
                EmojiSlot emojiSlot = this.slots[i];
                String str = strArr == null ? null : strArr[i];
                boolean z = emojiSlot.loaded;
                emojiSlot.loaded = str != null;
                if (str != null && (emojiSlot.real == null || !TextUtils.equals(emojiSlot.lastEmoji, str))) {
                    AnimatedEmojiDrawable animatedEmojiDrawable = emojiSlot.real;
                    ChatMessageCell$$ExternalSyntheticLambda10 chatMessageCell$$ExternalSyntheticLambda10 = emojiSlot.invalidate;
                    if (animatedEmojiDrawable != null) {
                        animatedEmojiDrawable.removeView(chatMessageCell$$ExternalSyntheticLambda10);
                    }
                    emojiSlot.realThumb = Emoji.getEmojiDrawable(str);
                    AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(UserConfig.getProductionAccount());
                    emojiSlot.real = animatedEmojiDrawable2;
                    emojiSlot.lastEmoji = str;
                    animatedEmojiDrawable2.setupEmojiThumb(str);
                    emojiSlot.updateEmoji();
                    if (emojiSlot.attached) {
                        emojiSlot.real.addView(chatMessageCell$$ExternalSyntheticLambda10);
                    }
                }
                if (emojiSlot.loaded && !z) {
                    emojiSlot.realAllowed = false;
                }
            }
            QrActivity.AnonymousClass2 anonymousClass2 = this.parentView;
            if (anonymousClass2 != null) {
                anonymousClass2.invalidate();
            }
        }
    }

    public final class EmojiSlot {
        public String lastEmoji;
        public boolean loaded;
        public final int offset;
        public AnimatedEmojiDrawable real;
        public boolean realAllowed;
        public Emoji.EmojiDrawable realThumb;
        public long startTime;
        public final Drawable[] pool = new Drawable[6];
        public final GradientClip clip = new GradientClip();
        public final HashSet parents = new HashSet();
        public boolean attached = false;
        public final ChatMessageCell$$ExternalSyntheticLambda10 invalidate = new ChatMessageCell$$ExternalSyntheticLambda10(this, 1);
        public final RectF rectF = new RectF();

        public EmojiSlot(int i) {
            int i2 = 0;
            this.offset = i;
            while (true) {
                Drawable[] drawableArr = this.pool;
                if (i2 >= drawableArr.length) {
                    this.startTime = System.currentTimeMillis();
                    return;
                }
                GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
                String[][] strArr = EmojiData.data;
                String[] strArr2 = strArr[(int) Math.floor(Math.random() * ((double) strArr.length))];
                drawableArr[i2] = Emoji.getEmojiDrawable(strArr2[(int) Math.floor(Math.random() * ((double) strArr2.length))]);
                i2++;
            }
        }

        public final boolean draw(Canvas canvas, RectF rectF, float f) {
            float f2;
            float f3;
            float fDp = AndroidUtilities.dp(6.0f);
            RectF rectF2 = this.rectF;
            rectF2.set(rectF);
            float f4 = -fDp;
            rectF2.inset(f4, f4);
            canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 255, 31);
            long jCurrentTimeMillis = (((long) this.offset) * 45) + System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.startTime;
            float f5 = j / 180.0f;
            float fMin = Math.min(1.0f, f5);
            boolean z = this.loaded;
            Drawable[] drawableArr = this.pool;
            boolean z2 = false;
            if (!z || this.real == null || this.realThumb == null || !this.realAllowed) {
                j = j;
                canvas.save();
                rectF2.set(rectF);
                rectF2.offset(0.0f, (rectF.height() + fDp) * (fMin - 1.0f));
                canvas.translate(rectF2.left, rectF2.top);
                drawableArr[1].setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                drawableArr[1].setAlpha(127);
                drawableArr[1].draw(canvas);
                drawableArr[1].setAlpha(255);
                canvas.restore();
            } else {
                rectF2.set(rectF);
                rectF2.offset(0.0f, (fMin - 1.0f) * (rectF.height() + fDp));
                if (f < 1.0f) {
                    canvas.save();
                    f2 = 255.0f;
                    f3 = 0.0f;
                    this.realThumb.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                    canvas.translate(rectF2.left, rectF2.top);
                    this.realThumb.setAlpha((int) ((1.0f - f) * 255.0f));
                    this.realThumb.draw(canvas);
                    this.realThumb.setAlpha(255);
                    canvas.restore();
                } else {
                    f2 = 255.0f;
                    f3 = 0.0f;
                }
                if (f > f3) {
                    canvas.save();
                    rectF2.inset(AndroidUtilities.dp(-4.0f), AndroidUtilities.dp(-4.0f));
                    this.real.setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
                    canvas.translate(rectF2.left, rectF2.top);
                    this.real.setAlpha((int) (f * f2));
                    this.real.draw(canvas);
                    this.real.setAlpha(255);
                    canvas.restore();
                }
            }
            rectF2.set(rectF);
            rectF2.offset(0.0f, (rectF.height() + fDp) * fMin);
            canvas.save();
            canvas.translate(rectF2.left, rectF2.top);
            drawableArr[0].setBounds(0, 0, (int) rectF2.width(), (int) rectF2.height());
            drawableArr[0].setAlpha(127);
            drawableArr[0].draw(canvas);
            drawableArr[0].setAlpha(255);
            canvas.restore();
            if (f5 >= 1.0f) {
                if (this.loaded && this.realAllowed) {
                    z2 = true;
                } else {
                    this.startTime = jCurrentTimeMillis - (j % 180);
                    int i = 0;
                    while (i < drawableArr.length - 1) {
                        int i2 = i + 1;
                        drawableArr[i] = drawableArr[i2];
                        i = i2;
                    }
                    int length = drawableArr.length - 1;
                    GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
                    String[][] strArr = EmojiData.data;
                    String[] strArr2 = strArr[(int) Math.floor(Math.random() * ((double) strArr.length))];
                    drawableArr[length] = Emoji.getEmojiDrawable(strArr2[(int) Math.floor(Math.random() * ((double) strArr2.length))]);
                    if (this.loaded) {
                        this.realAllowed = true;
                    }
                }
            }
            rectF2.set(rectF);
            float f6 = (int) f4;
            rectF2.inset(f6, f6);
            float f7 = rectF2.left;
            float f8 = rectF2.top;
            rectF2.set(f7, f8, rectF2.right, f8 + fDp);
            GradientClip gradientClip = this.clip;
            gradientClip.draw(canvas, rectF2, 1, 1.0f);
            rectF2.set(rectF);
            rectF2.inset(f6, f6);
            float f9 = rectF2.left;
            float f10 = rectF2.bottom;
            rectF2.set(f9, f10 - fDp, rectF2.right, f10);
            gradientClip.draw(canvas, rectF2, 3, 1.0f);
            canvas.restore();
            return !z2;
        }

        public final void updateEmoji() {
            TLRPC.Document document;
            if (this.real == null || this.lastEmoji == null) {
                return;
            }
            int productionAccount = UserConfig.getProductionAccount();
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(productionAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, true, new PollItemMenu$$ExternalSyntheticLambda14(this, 16));
            if (stickerSet == null) {
                return;
            }
            String strReplace = this.lastEmoji.replace("️", "");
            ArrayList<TLRPC.Document> arrayList = stickerSet.documents;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                document = null;
                if (i >= size) {
                    break;
                }
                TLRPC.Document document2 = arrayList.get(i);
                i++;
                TLRPC.Document document3 = document2;
                if (TextUtils.equals(MessageObject.findAnimatedEmojiEmoticon(document3, null).replace("️", ""), strReplace)) {
                    document = document3;
                    break;
                }
            }
            if (document != null) {
                AnimatedEmojiDrawable animatedEmojiDrawable = this.real;
                animatedEmojiDrawable.document = document;
                animatedEmojiDrawable.initDocument(false);
            } else {
                FileLog.e("emoji \"" + this.lastEmoji + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
            }
        }
    }

    public final class GroupCallItemAnimator extends DefaultItemAnimator {
        public float animationProgress;
        public ValueAnimator animator;
        public float outMaxBottom;
        public float outMinTop;
        public final HashSet addingHolders = new HashSet();
        public final HashSet removingHolders = new HashSet();

        public GroupCallItemAnimator() {
        }

        @Override
        public final void endAnimations() {
            super.endAnimations();
            this.removingHolders.clear();
            this.addingHolders.clear();
            this.outMinTop = Float.MAX_VALUE;
            GroupCallActivity.this.listView.invalidate();
        }

        @Override
        public final void runPendingAnimations() {
            boolean zIsEmpty = this.mPendingRemovals.isEmpty();
            boolean zIsEmpty2 = this.mPendingMoves.isEmpty();
            boolean zIsEmpty3 = this.mPendingAdditions.isEmpty();
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.animator = null;
            }
            if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty3) {
                this.animationProgress = 0.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.animator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, 17));
                this.animator.addListener(new PhotoViewer$41$1(this, 15));
                this.animator.setDuration(350L);
                this.animator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animator.start();
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                groupCallActivity.listView.invalidate();
                groupCallActivity.renderersContainer.invalidate();
            }
            super.runPendingAnimations();
        }
    }

    public final class LightningView extends View {
        public int[] currentColors;
        public final Paint paint;
        public int parentBackgroundColor;
        public float shadowOffset;

        public LightningView(LaunchActivity launchActivity) {
            super(launchActivity);
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setStyle(Paint.Style.FILL);
            paint.setAlpha(0);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            if (!groupCallActivity.needTextureLightning || groupCallActivity.renderersContainer.progressToFullscreenMode >= 0.1d) {
                return;
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.paint);
        }

        public void setNewColors(int[] iArr) {
            int[] iArr2 = this.currentColors;
            Paint paint = this.paint;
            boolean z = true;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            boolean z2 = false;
            if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
                if (iArr2 == null) {
                    paint.setAlpha(255);
                }
                this.currentColors = iArr;
                if (groupCallActivity.liveLabelBgColorAnimator != null) {
                    float f = groupCallActivity.textureLightningViewAnimatingAlpha;
                    if (f != 1.0f) {
                        iArr[0] = ColorUtils.setAlphaComponent(iArr[0], (int) (f * 255.0f));
                        int[] iArr3 = this.currentColors;
                        iArr3[1] = ColorUtils.setAlphaComponent(iArr3[1], (int) (groupCallActivity.textureLightningViewAnimatingAlpha * 255.0f));
                    }
                }
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, groupCallActivity.textureLightningView.getMeasuredHeight(), this.currentColors, (float[]) null, Shader.TileMode.CLAMP));
                z2 = true;
            }
            if (this.parentBackgroundColor != groupCallActivity.backgroundColor) {
                paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.shadowOffset, groupCallActivity.backgroundColor);
                this.parentBackgroundColor = groupCallActivity.backgroundColor;
            } else {
                z = z2;
            }
            if (z) {
                invalidate();
            }
            groupCallActivity.runUpdateTextureLightningRunnable();
        }

        public void setShadowOffset(int i) {
            float f = i;
            if (this.shadowOffset != f) {
                this.paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.shadowOffset, GroupCallActivity.this.backgroundColor);
                this.shadowOffset = f;
                invalidate();
            }
        }
    }

    public final class RecordCallDrawable extends Drawable {
        public float alpha;
        public long lastUpdateTime;
        public final Paint paint;
        public final Paint paint2;
        public ImageView parentView;
        public boolean recording;
        public int state;

        public RecordCallDrawable() {
            Paint paint = new Paint(1);
            this.paint = paint;
            this.paint2 = new Paint(1);
            this.alpha = 1.0f;
            paint.setColor(-1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        }

        @Override
        public final void draw(Canvas canvas) {
            float fCenterX = getBounds().centerX();
            float fCenterY = getBounds().centerY();
            canvas.drawCircle(fCenterX, fCenterY, AndroidUtilities.dp(10.0f), this.paint);
            Paint paint = this.paint2;
            paint.setColor(this.recording ? -1147527 : -1);
            paint.setAlpha((int) (this.alpha * 255.0f));
            canvas.drawCircle(fCenterX, fCenterY, AndroidUtilities.dp(5.0f), paint);
            if (this.recording) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.lastUpdateTime;
                if (j > 17) {
                    j = 17;
                }
                this.lastUpdateTime = jElapsedRealtime;
                int i = this.state;
                if (i == 0) {
                    float f = (j / 2000.0f) + this.alpha;
                    this.alpha = f;
                    if (f >= 1.0f) {
                        this.alpha = 1.0f;
                        this.state = 1;
                    }
                } else if (i == 1) {
                    float f2 = this.alpha - (j / 2000.0f);
                    this.alpha = f2;
                    if (f2 < 0.5f) {
                        this.alpha = 0.5f;
                        this.state = 0;
                    }
                }
                this.parentView.invalidate();
            }
        }

        @Override
        public final int getIntrinsicHeight() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public final int getIntrinsicWidth() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }

        public final void setParentView(ImageView imageView) {
            this.parentView = imageView;
        }
    }

    public final class SmallRecordCallDrawable extends Drawable {
        public long lastUpdateTime;
        public final View parentView;
        public int state;
        public final Paint paint2 = new Paint(1);
        public float alpha = 1.0f;

        public SmallRecordCallDrawable(View view) {
            this.parentView = view;
        }

        @Override
        public final void draw(Canvas canvas) {
            int iDp;
            int iCenterX = getBounds().centerX();
            int iCenterY = getBounds().centerY();
            View view = this.parentView;
            if (view instanceof SimpleTextView) {
                iDp = AndroidUtilities.dp(1.0f) + iCenterY;
                iCenterX -= AndroidUtilities.dp(3.0f);
            } else {
                iDp = AndroidUtilities.dp(2.0f) + iCenterY;
            }
            Paint paint = this.paint2;
            paint.setColor(-1147527);
            paint.setAlpha((int) (this.alpha * 255.0f));
            canvas.drawCircle(iCenterX, iDp, AndroidUtilities.dp(4.0f), paint);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.lastUpdateTime;
            if (j > 17) {
                j = 17;
            }
            this.lastUpdateTime = jElapsedRealtime;
            int i = this.state;
            if (i == 0) {
                float f = (j / 2000.0f) + this.alpha;
                this.alpha = f;
                if (f >= 1.0f) {
                    this.alpha = 1.0f;
                    this.state = 1;
                }
            } else if (i == 1) {
                float f2 = this.alpha - (j / 2000.0f);
                this.alpha = f2;
                if (f2 < 0.5f) {
                    this.alpha = 0.5f;
                    this.state = 0;
                }
            }
            view.invalidate();
        }

        @Override
        public final int getIntrinsicHeight() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public final int getIntrinsicWidth() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public final class UpdateCallback implements ListUpdateCallback {
        public final int $r8$classId;
        public final RecyclerView.Adapter adapter;

        public UpdateCallback(RecyclerView.Adapter adapter, int i) {
            this.$r8$classId = i;
            this.adapter = adapter;
        }

        @Override
        public final void onChanged(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    this.adapter.notifyItemRangeChanged(i, i2, null);
                    break;
                default:
                    this.adapter.notifyItemRangeChanged(i, i2, null);
                    break;
            }
        }

        @Override
        public final void onInserted(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    this.adapter.notifyItemRangeInserted(i, i2);
                    break;
                default:
                    this.adapter.notifyItemRangeInserted(i, i2);
                    break;
            }
        }

        @Override
        public final void onMoved(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    this.adapter.notifyItemMoved(i, i2);
                    break;
                default:
                    this.adapter.notifyItemMoved(i, i2);
                    break;
            }
        }

        @Override
        public final void onRemoved(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    this.adapter.notifyItemRangeRemoved(i, i2);
                    break;
                default:
                    this.adapter.notifyItemRangeRemoved(i, i2);
                    break;
            }
        }
    }

    public final class VolumeSlider extends FrameLayout {
        public boolean captured;
        public float colorChangeProgress;
        public int currentColor;
        public final TLRPC.GroupCallParticipant currentParticipant;
        public double currentProgress;
        public boolean dragging;
        public final RLottieImageView imageView;
        public long lastUpdateTime;
        public int oldColor;
        public final Paint paint;
        public final Paint paint2;
        public final Path path;
        public final float[] radii;
        public final RectF rect;
        public final RLottieDrawable speakerDrawable;
        public float sx;
        public float sy;
        public final TextView textView;
        public int thumbX;
        public final float[] volumeAlphas;

        public VolumeSlider(Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
            super(context);
            this.paint = new Paint(1);
            Paint paint = new Paint(1);
            this.paint2 = paint;
            this.path = new Path();
            this.radii = new float[8];
            this.rect = new RectF();
            this.volumeAlphas = new float[3];
            setWillNotDraw(false);
            this.currentParticipant = groupCallParticipant;
            this.currentProgress = ChatObject.getParticipantVolume(groupCallParticipant) / 20000.0f;
            this.colorChangeProgress = 1.0f;
            setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            int i = R.raw.speaker;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i, SurfaceContainer$$ExternalSyntheticOutline0.m(i, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
            this.speakerDrawable = rLottieDrawable;
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            rLottieImageView.setAnimation(rLottieDrawable);
            rLottieImageView.setTag(this.currentProgress == 0.0d ? 1 : null);
            addView(rLottieImageView, LayoutHelper.createFrame(-2, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, 0.0f, 0.0f, 0.0f, 0.0f));
            rLottieDrawable.setCustomEndFrame(this.currentProgress == 0.0d ? 17 : 34);
            rLottieDrawable.setCurrentFrame(rLottieDrawable.customEndFrame - 1, false, true);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setLines(1);
            textView.setSingleLine(true);
            textView.setGravity(3);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_actionBarItems, false));
            textView.setTextSize(1, 16.0f);
            double participantVolume = ((double) ChatObject.getParticipantVolume(groupCallParticipant)) / 100.0d;
            Locale locale = Locale.US;
            textView.setText(((int) (participantVolume > 0.0d ? Math.max(participantVolume, 1.0d) : 0.0d)) + "%");
            textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(43.0f) : 0, 0);
            addView(textView, LayoutHelper.createFrame(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setColor(-1);
            int participantVolume2 = (int) (((double) ChatObject.getParticipantVolume(groupCallParticipant)) / 100.0d);
            int i2 = 0;
            while (true) {
                float[] fArr = this.volumeAlphas;
                if (i2 >= fArr.length) {
                    return;
                }
                if (participantVolume2 > (i2 == 0 ? 0 : i2 == 1 ? 50 : 150)) {
                    fArr[i2] = 1.0f;
                } else {
                    fArr[i2] = 0.0f;
                }
                i2++;
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int i;
            float fDp;
            int i2;
            VolumeSlider volumeSlider = this;
            int i3 = volumeSlider.currentColor;
            double d = volumeSlider.currentProgress;
            if (d < 0.25d) {
                volumeSlider.currentColor = -3385513;
            } else if (d > 0.25d && d < 0.5d) {
                volumeSlider.currentColor = -3562181;
            } else if (d < 0.5d || d > 0.75d) {
                volumeSlider.currentColor = -11688225;
            } else {
                volumeSlider.currentColor = -11027349;
            }
            if (i3 == 0) {
                i = volumeSlider.currentColor;
                volumeSlider.colorChangeProgress = 1.0f;
            } else {
                int offsetColor = AndroidUtilities.getOffsetColor(volumeSlider.oldColor, i3, volumeSlider.colorChangeProgress, 1.0f);
                if (i3 != volumeSlider.currentColor) {
                    volumeSlider.colorChangeProgress = 0.0f;
                    volumeSlider.oldColor = offsetColor;
                }
                i = offsetColor;
            }
            Paint paint = volumeSlider.paint;
            paint.setColor(i);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - volumeSlider.lastUpdateTime;
            if (j > 17) {
                j = 17;
            }
            volumeSlider.lastUpdateTime = jElapsedRealtime;
            float f = volumeSlider.colorChangeProgress;
            if (f < 1.0f) {
                float f2 = (j / 200.0f) + f;
                volumeSlider.colorChangeProgress = f2;
                if (f2 > 1.0f) {
                    volumeSlider.colorChangeProgress = 1.0f;
                } else {
                    volumeSlider.invalidate();
                }
            }
            Path path = volumeSlider.path;
            path.reset();
            float f3 = 6.0f;
            float fDp2 = AndroidUtilities.dp(6.0f);
            float[] fArr = volumeSlider.radii;
            fArr[7] = fDp2;
            fArr[6] = fDp2;
            int i4 = 1;
            fArr[1] = fDp2;
            fArr[0] = fDp2;
            float fDp3 = AndroidUtilities.dp(6.0f) * (volumeSlider.thumbX < AndroidUtilities.dp(12.0f) ? Math.max(0.0f, (volumeSlider.thumbX - AndroidUtilities.dp(6.0f)) / AndroidUtilities.dp(6.0f)) : 1.0f);
            fArr[5] = fDp3;
            fArr[4] = fDp3;
            fArr[3] = fDp3;
            fArr[2] = fDp3;
            RectF rectF = volumeSlider.rect;
            rectF.set(0.0f, 0.0f, volumeSlider.thumbX, volumeSlider.getMeasuredHeight());
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            path.close();
            Canvas canvas2 = canvas;
            canvas2.drawPath(path, paint);
            float f4 = 1.0f;
            int participantVolume = (int) (((double) ChatObject.getParticipantVolume(volumeSlider.currentParticipant)) / 100.0d);
            RLottieImageView rLottieImageView = volumeSlider.imageView;
            int iDp = AndroidUtilities.dp(5.0f) + (rLottieImageView.getMeasuredWidth() / 2) + rLottieImageView.getLeft();
            int measuredHeight = (rLottieImageView.getMeasuredHeight() / 2) + rLottieImageView.getTop();
            int i5 = 0;
            while (true) {
                float[] fArr2 = volumeSlider.volumeAlphas;
                if (i5 >= fArr2.length) {
                    return;
                }
                if (i5 == 0) {
                    fDp = AndroidUtilities.dp(f3);
                    i2 = 0;
                } else if (i5 == i4) {
                    fDp = AndroidUtilities.dp(10.0f);
                    i2 = 50;
                } else {
                    fDp = AndroidUtilities.dp(14.0f);
                    i2 = 150;
                }
                float fDp4 = AndroidUtilities.dp(2.0f);
                float f5 = fArr2[i5];
                float f6 = (f4 - f5) * fDp4;
                Paint paint2 = volumeSlider.paint2;
                paint2.setAlpha((int) (f5 * 255.0f));
                float f7 = iDp;
                float f8 = measuredHeight;
                rectF.set((f7 - fDp) + f6, (f8 - fDp) + f6, (f7 + fDp) - f6, (f8 + fDp) - f6);
                canvas2.drawArc(rectF, -50.0f, 100.0f, false, paint2);
                if (participantVolume > i2) {
                    float f9 = fArr2[i5];
                    if (f9 < 1.0f) {
                        float f10 = (j / 180.0f) + f9;
                        fArr2[i5] = f10;
                        if (f10 > 1.0f) {
                            fArr2[i5] = 1.0f;
                        }
                        invalidate();
                    }
                } else {
                    float f11 = fArr2[i5];
                    if (f11 > 0.0f) {
                        float f12 = f11 - (j / 180.0f);
                        fArr2[i5] = f12;
                        if (f12 < 0.0f) {
                            fArr2[i5] = 0.0f;
                        }
                        invalidate();
                    }
                }
                i5++;
                canvas2 = canvas;
                f3 = 6.0f;
                f4 = 1.0f;
                i4 = 1;
                volumeSlider = this;
            }
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return onTouch(motionEvent);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
            this.thumbX = (int) (((double) View.MeasureSpec.getSize(i)) * this.currentProgress);
        }

        public final void onSeekBarDrag(double d, boolean z) {
            if (VoIPService.getSharedInstance() == null) {
                return;
            }
            this.currentProgress = d;
            TLRPC.GroupCallParticipant groupCallParticipant = this.currentParticipant;
            groupCallParticipant.volume = (int) (d * 20000.0d);
            groupCallParticipant.volume_by_admin = false;
            groupCallParticipant.flags |= 128;
            double participantVolume = ((double) ChatObject.getParticipantVolume(groupCallParticipant)) / 100.0d;
            TextView textView = this.textView;
            Locale locale = Locale.US;
            textView.setText(((int) (participantVolume > 0.0d ? Math.max(participantVolume, 1.0d) : 0.0d)) + "%");
            VoIPService.getSharedInstance().setParticipantVolume(groupCallParticipant, groupCallParticipant.volume);
            if (z) {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                TLObject user = peerId > 0 ? groupCallActivity.accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : groupCallActivity.accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                if (groupCallParticipant.volume == 0) {
                    AnonymousClass63 anonymousClass63 = groupCallActivity.scrimPopupWindow;
                    if (anonymousClass63 != null) {
                        anonymousClass63.dismiss();
                        groupCallActivity.scrimPopupWindow = null;
                    }
                    groupCallActivity.dismissAvatarPreview(true);
                    groupCallActivity.processSelectedOption(groupCallParticipant, peerId, groupCallActivity.canManageCall() ? 0 : 5);
                } else {
                    VoIPService.getSharedInstance().editCallMember(user, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
                }
            }
            Integer num = this.currentProgress == 0.0d ? 1 : null;
            RLottieImageView rLottieImageView = this.imageView;
            if ((rLottieImageView.getTag() != null || num == null) && (rLottieImageView.getTag() == null || num != null)) {
                return;
            }
            RLottieDrawable rLottieDrawable = this.speakerDrawable;
            rLottieDrawable.setCustomEndFrame(this.currentProgress == 0.0d ? 17 : 34);
            rLottieDrawable.setCurrentFrame(this.currentProgress == 0.0d ? 0 : 17, true, false);
            rLottieDrawable.start();
            rLottieImageView.setTag(num);
        }

        public final boolean onTouch(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.sx = motionEvent.getX();
                this.sy = motionEvent.getY();
                return true;
            }
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.captured = false;
                if (motionEvent.getAction() == 1) {
                    if (Math.abs(motionEvent.getY() - this.sy) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                        int x = (int) motionEvent.getX();
                        this.thumbX = x;
                        if (x < 0) {
                            this.thumbX = 0;
                        } else if (x > getMeasuredWidth()) {
                            this.thumbX = getMeasuredWidth();
                        }
                        this.dragging = true;
                    }
                }
                if (this.dragging) {
                    if (motionEvent.getAction() == 1) {
                        onSeekBarDrag(((double) this.thumbX) / ((double) getMeasuredWidth()), true);
                    }
                    this.dragging = false;
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 2) {
                if (!this.captured) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.sy) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.sx) > viewConfiguration.getScaledTouchSlop()) {
                        this.captured = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            int x2 = (int) motionEvent.getX();
                            this.thumbX = x2;
                            if (x2 < 0) {
                                this.thumbX = 0;
                            } else if (x2 > getMeasuredWidth()) {
                                this.thumbX = getMeasuredWidth();
                            }
                            this.dragging = true;
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.dragging) {
                    int x3 = (int) motionEvent.getX();
                    this.thumbX = x3;
                    if (x3 < 0) {
                        this.thumbX = 0;
                    } else if (x3 > getMeasuredWidth()) {
                        this.thumbX = getMeasuredWidth();
                    }
                    onSeekBarDrag(((double) this.thumbX) / ((double) getMeasuredWidth()), false);
                    invalidate();
                    return true;
                }
            }
            return false;
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return onTouch(motionEvent);
        }
    }

    public final class WatchersView extends LinearLayout {
        public float lastWidth;
        public final AnimatedTextView watchersCountTextView;

        public WatchersView(Context context) {
            super(context);
            this.lastWidth = 0.0f;
            setOrientation(1);
            setGravity(17);
            AnimatedTextView animatedTextView = new AnimatedTextView(context, true, false, false);
            this.watchersCountTextView = animatedTextView;
            animatedTextView.setTextColor(-1);
            animatedTextView.setTextSize(AndroidUtilities.dp(46.0f));
            animatedTextView.setTypeface(AndroidUtilities.bold());
            animatedTextView.setGravity(1);
            TextView textView = new TextView(context);
            textView.setTextColor(-1);
            zzkk.m(14.0f, 1, textView);
            textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
            addView(animatedTextView, LayoutHelper.createLinear(-1, 46));
            addView(textView, LayoutHelper.createLinear(-2, -2));
        }

        public void setWatchersCount(int i) {
            String number = LocaleController.formatNumber(i, ',');
            AnimatedTextView animatedTextView = this.watchersCountTextView;
            float fMeasureText = animatedTextView.getPaint().measureText((CharSequence) number, 0, number.length());
            if (this.lastWidth != fMeasureText) {
                int i2 = Theme.key_premiumGradient1;
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                animatedTextView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, fMeasureText, 0.0f, new int[]{groupCallActivity.getThemedColor(i2), groupCallActivity.getThemedColor(Theme.key_premiumGradient3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                this.lastWidth = fMeasureText;
            }
            animatedTextView.setText(number);
        }
    }

    public final class WeavingState {
        public final int currentState;
        public float duration;
        public Shader shader;
        public float startX;
        public float startY;
        public float time;
        public float targetX = -1.0f;
        public float targetY = -1.0f;
        public final Matrix matrix = new Matrix();

        public WeavingState(int i) {
            this.currentState = i;
        }

        public final void setTarget() {
            int i = this.currentState;
            if (GroupCallActivity.isGradientState(i)) {
                this.targetX = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Utilities.random.nextInt(100), 0.2f, 100.0f, 0.85f);
                this.targetY = 1.0f;
            } else if (i == 1) {
                this.targetX = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.2f);
                this.targetY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
            } else {
                this.targetX = zzjd.m(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
                this.targetY = Utilities.random.nextInt(100) / 100.0f;
            }
        }

        public final void update(int i, int i2, int i3, long j, float f) {
            if (this.shader == null) {
                return;
            }
            float f2 = this.duration;
            if (f2 == 0.0f || this.time >= f2) {
                this.duration = Utilities.random.nextInt(200) + 1500;
                this.time = 0.0f;
                if (this.targetX == -1.0f) {
                    setTarget();
                }
                this.startX = this.targetX;
                this.startY = this.targetY;
                setTarget();
            }
            float f3 = j;
            float f4 = 1.0f;
            float f5 = (f3 * 0.02f * f) + (f3 * 1.0f) + this.time;
            this.time = f5;
            float f6 = this.duration;
            if (f5 > f6) {
                this.time = f6;
            }
            float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.time / f6);
            float f7 = i3;
            float f8 = this.startX;
            float f9 = (((((this.targetX - f8) * interpolation) + f8) * f7) + i2) - 200.0f;
            float f10 = this.startY;
            float f11 = (((((this.targetY - f10) * interpolation) + f10) * f7) + i) - 200.0f;
            int i4 = this.currentState;
            if (!GroupCallActivity.isGradientState(i4)) {
                f4 = i4 == 1 ? 4.0f : 2.5f;
            }
            float fDp = (AndroidUtilities.dp(122.0f) / 400.0f) * f4;
            Matrix matrix = this.matrix;
            matrix.reset();
            matrix.postTranslate(f9, f11);
            matrix.postScale(fDp, fDp, f9 + 200.0f, f11 + 200.0f);
            this.shader.setLocalMatrix(matrix);
        }
    }

    public GroupCallActivity(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z, String str) {
        boolean z2;
        int i;
        int i2;
        AnonymousClass28 anonymousClass28;
        GroupCallMessagesListView groupCallMessagesListView;
        final GroupCallActivity groupCallActivity;
        TextView textView;
        int i3;
        int i4;
        int i5;
        TLRPC.Chat chat2;
        VoIPService sharedInstance;
        String[] emojis;
        ConferenceCall conferenceCall;
        super(launchActivity, null, true, true);
        int i6 = 3;
        this.callMessageEnterContainerBgPaint = new Paint(1);
        this.undoView = new UndoView[2];
        this.visibleVideoParticipants = new ArrayList();
        this.rect = new RectF();
        this.listViewBackgroundPaint = new Paint(1);
        this.oldParticipants = new ArrayList();
        this.oldVideoParticipants = new ArrayList();
        this.oldInvited = new ArrayList();
        this.oldShadyJoin = new ArrayList();
        this.oldShadyLeft = new ArrayList();
        this.windowInsetsStateHolder = new WindowInsetsStateHolder(new GroupCallActivity$$ExternalSyntheticLambda8(this, 0));
        this.muteButtonState = 0;
        this.animatingToFullscreenExpand = false;
        this.paint = new Paint(7);
        this.paintTmp = new Paint(7);
        this.states = new WeavingState[8];
        this.switchProgress = 1.0f;
        this.invalidateColors = true;
        this.colorsTmp = new int[4];
        this.attachedRenderers = new ArrayList();
        this.attachedRenderersTmp = new ArrayList();
        this.cellFlickerDrawable = new CellFlickerDrawable();
        this.statusIconPool = new ArrayList();
        this.onUserLeaveHintListener = new GroupCallActivity$$ExternalSyntheticLambda8(this, 1);
        this.updateSchedeulRunnable = new AnonymousClass1();
        this.unmuteRunnable = new QrActivity$5$$ExternalSyntheticLambda1(14);
        this.pressRunnable = new GroupCallActivity$$ExternalSyntheticLambda8(this, 2);
        this.needTextureLightning = false;
        this.updateTextureLightningRunnable = new LaunchActivity.AnonymousClass18(this, 12);
        this.visiblePeerIds = new LongSparseIntArray();
        this.gradientColors = new int[2];
        this.listViewVideoVisibility = true;
        this.invites = new String[2];
        this.popupAnimationIndex = -1;
        this.diffUtilsCallback = new DiffUtil() {
            @Override
            public final boolean areContentsTheSame(int i7, int i8) {
                return true;
            }

            @Override
            public final boolean areItemsTheSame(int i7, int i8) {
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                ListAdapter listAdapter = groupCallActivity2.listAdapter;
                int i14 = listAdapter.addMemberRow;
                if (i14 >= 0) {
                    int i15 = groupCallActivity2.oldAddMemberRow;
                    if (i7 == i15 && i8 == i14) {
                        return true;
                    }
                    if ((i7 == i15 && i8 != i14) || (i7 != i15 && i8 == i14)) {
                        return false;
                    }
                }
                int i16 = listAdapter.conferenceAddPeopleRow;
                if (i16 >= 0) {
                    int i17 = groupCallActivity2.oldConferenceAddPeopleRow;
                    if (i7 == i17 && i8 == i16) {
                        return true;
                    }
                    if ((i7 == i17 && i8 != i16) || (i7 != i17 && i8 == i16)) {
                        return false;
                    }
                }
                int i18 = listAdapter.conferenceShareLinkRow;
                if (i18 >= 0) {
                    int i19 = groupCallActivity2.oldConferenceShareLinkRow;
                    if (i7 == i19 && i8 == i18) {
                        return true;
                    }
                    if ((i7 == i19 && i8 != i18) || (i7 != i19 && i8 == i18)) {
                        return false;
                    }
                }
                int i20 = listAdapter.encryptionRow;
                if (i20 >= 0) {
                    int i21 = groupCallActivity2.oldEncryptionRow;
                    if (i7 == i21 && i8 == i20) {
                        return true;
                    }
                    if ((i7 == i21 && i8 != i20) || (i7 != i21 && i8 == i20)) {
                        return false;
                    }
                }
                int i22 = listAdapter.videoNotAvailableRow;
                if (i22 >= 0) {
                    int i23 = groupCallActivity2.oldVideoNotAvailableRow;
                    if (i7 == i23 && i8 == i22) {
                        return true;
                    }
                    if ((i7 == i23 && i8 != i22) || (i7 != i23 && i8 == i22)) {
                        return false;
                    }
                }
                int i24 = listAdapter.videoGridDividerRow;
                if (i24 >= 0 && i24 == i8 && i7 == groupCallActivity2.oldVideoDividerRow) {
                    return true;
                }
                int i25 = groupCallActivity2.oldCount - 1;
                if (i7 == i25 && i8 == listAdapter.rowsCount - 1) {
                    return true;
                }
                if (i7 != i25 && i8 != listAdapter.rowsCount - 1) {
                    if (i8 >= listAdapter.usersVideoGridStartRow && i8 < listAdapter.usersVideoGridEndRow && i7 >= (i13 = groupCallActivity2.oldUsersVideoStartRow) && i7 < groupCallActivity2.oldUsersVideoEndRow) {
                        return ((ChatObject.VideoParticipant) groupCallActivity2.oldVideoParticipants.get(i7 - i13)).equals((ChatObject.VideoParticipant) groupCallActivity2.visibleVideoParticipants.get(i8 - groupCallActivity2.listAdapter.usersVideoGridStartRow));
                    }
                    if (i8 >= listAdapter.usersStartRow && i8 < listAdapter.usersEndRow && i7 >= (i12 = groupCallActivity2.oldUsersStartRow) && i7 < groupCallActivity2.oldUsersEndRow) {
                        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) groupCallActivity2.oldParticipants.get(i7 - i12);
                        return MessageObject.getPeerId(groupCallParticipant.peer) == MessageObject.getPeerId(groupCallActivity2.call.visibleParticipants.get(i8 - groupCallActivity2.listAdapter.usersStartRow).peer) && (i7 == i8 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
                    }
                    if (i8 >= listAdapter.invitedStartRow && i8 < listAdapter.invitedEndRow && i7 >= (i11 = groupCallActivity2.oldInvitedStartRow) && i7 < groupCallActivity2.oldInvitedEndRow) {
                        return ((Long) groupCallActivity2.oldInvited.get(i7 - i11)).equals(groupCallActivity2.call.invitedUsers.get(i8 - groupCallActivity2.listAdapter.invitedStartRow));
                    }
                    if (i8 >= listAdapter.shadyJoinStartRow && i8 < listAdapter.shadyJoinEndRow && i7 >= (i10 = groupCallActivity2.oldShadyJoinStartRow) && i7 < groupCallActivity2.oldShadyJoinEndRow) {
                        return ((Long) groupCallActivity2.oldShadyJoin.get(i7 - i10)).equals(groupCallActivity2.call.shadyJoinParticipants.get(i8 - groupCallActivity2.listAdapter.shadyJoinStartRow));
                    }
                    if (i8 >= listAdapter.shadyLeftStartRow && i8 < listAdapter.shadyLeftEndRow && i7 >= (i9 = groupCallActivity2.oldShadyLeftStartRow) && i7 < groupCallActivity2.oldShadyLeftEndRow) {
                        return ((Long) groupCallActivity2.oldShadyLeft.get(i7 - i9)).equals(groupCallActivity2.call.shadyLeftParticipants.get(i8 - groupCallActivity2.listAdapter.shadyLeftStartRow));
                    }
                }
                return false;
            }

            @Override
            public final int getNewListSize() {
                return GroupCallActivity.this.listAdapter.rowsCount;
            }

            @Override
            public final int getOldListSize() {
                return GroupCallActivity.this.oldCount;
            }
        };
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        this.animatorHideButtons = new BoolAnimator(2, this, cubicBezierInterpolator);
        int i7 = 0;
        this.animatorMessageIsEmpty = new BoolAnimator(3, this, cubicBezierInterpolator, 220L, true);
        this.animatorMessageInputHeight = new FactorAnimator(4, this, cubicBezierInterpolator, 350L);
        this.animatorHasVideo = new BoolAnimator(5, this, cubicBezierInterpolator);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.accountInstance = accountInstance;
        this.call = call;
        this.schedulePeer = inputPeer;
        this.currentChat = chat;
        this.scheduledHash = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.scheduleHasFewPeers = z;
        this.resourcesProvider = new ShareAlert.AnonymousClass3();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.maxGroupCallMessageLength = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        isTabletMode = false;
        isLandscapeMode = false;
        paused = false;
        setDelegate(new BottomSheet.BottomSheetDelegateInterface() {
            @Override
            public final boolean canDismiss() {
                return true;
            }

            @Override
            public final void onOpenAnimationEnd() {
                CountDownLatch groupCallBottomSheetLatch;
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && (groupCallBottomSheetLatch = sharedInstance2.getGroupCallBottomSheetLatch()) != null) {
                    groupCallBottomSheetLatch.countDown();
                }
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                if (groupCallActivity2.muteButtonState == 6) {
                    GroupCallActivity.access$3100(groupCallActivity2);
                }
            }
        });
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.scrimPaint = new AnonymousClass4();
        setOnDismissListener(new GroupCallActivity$$ExternalSyntheticLambda32(this, i7));
        setDimBehindAlpha(75);
        ListAdapter listAdapter = new ListAdapter(launchActivity);
        this.listAdapter = listAdapter;
        RecordStatusDrawable recordStatusDrawable = new RecordStatusDrawable(true);
        int i8 = Theme.key_voipgroup_speakingText;
        recordStatusDrawable.setColor(Theme.getColor(i8));
        recordStatusDrawable.start();
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(launchActivity, recordStatusDrawable);
        this.actionBar = anonymousClass5;
        anonymousClass5.setSubtitle("");
        anonymousClass5.getSubtitleTextView().setVisibility(0);
        anonymousClass5.createAdditionalSubtitleTextView();
        anonymousClass5.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(anonymousClass5.getAdditionalSubtitleTextView(), this.drawSpeakingSubtitle, 1.0f, false);
        anonymousClass5.getAdditionalSubtitleTextView().setTextColor(Theme.getColor(i8));
        int i9 = Theme.key_voipgroup_lastSeenTextUnscrolled;
        anonymousClass5.setSubtitleColor(Theme.getColor(i9));
        anonymousClass5.setBackButtonImage(R.drawable.ic_ab_back);
        anonymousClass5.setOccupyStatusBar(false);
        anonymousClass5.setAllowOverlayTitle(false);
        int i10 = Theme.key_voipgroup_actionBarItems;
        anonymousClass5.setItemsColor(Theme.getColor(i10), false);
        anonymousClass5.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarActionModeDefaultSelector), false);
        anonymousClass5.setTitleColor(Theme.getColor(i10));
        anonymousClass5.setSubtitleColor(Theme.getColor(i9));
        anonymousClass5.setActionBarMenuOnItemClick(new AnonymousClass6(launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.selfPeer = tL_peerUser;
            tL_peerUser.user_id = accountInstance.getUserConfig().getClientUserId();
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            this.selfPeer = tL_peerChannel;
            tL_peerChannel.channel_id = groupCallPeer.channel_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.selfPeer = tL_peerUser2;
            tL_peerUser2.user_id = groupCallPeer.user_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            this.selfPeer = tL_peerChat;
            tL_peerChat.chat_id = groupCallPeer.chat_id;
        }
        VoIPService.audioLevelsCallback = new GroupCallActivity$$ExternalSyntheticLambda12(this, i6);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.needShowAlert);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.didLoadChatAdmins);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.applyGroupCallVisibleParticipants);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.mainUserInfoChanged);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallScreencastStateChanged);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallSpeakingUsersUpdated);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.conferenceEmojiUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didEndCall);
        this.shadowDrawable = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        int i11 = R.raw.voip_filled;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i11, SurfaceContainer$$ExternalSyntheticOutline0.m(i11, ""), AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.bigMicDrawable = rLottieDrawable;
        int i12 = R.raw.hand_2;
        this.handDrawables = new RLottieDrawable(i12, SurfaceContainer$$ExternalSyntheticOutline0.m(i12, ""), AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        ?? r14 = new SizeNotifierFrameLayout(launchActivity) {
            public int lastSize;
            public boolean localHasVideo;
            public boolean updateRenderers;
            public boolean wasLayout;
            public boolean ignoreLayout = false;
            public final RectF rect = new RectF();
            public final HashMap listCells = new HashMap();

            @Override
            public final void dispatchDraw(Canvas canvas) {
                AnonymousClass9 anonymousClass9;
                Canvas canvas2;
                Canvas canvas3;
                Paint paint;
                GroupCallUserCell groupCallUserCell;
                float f;
                float f2;
                float measuredWidth;
                float left;
                GroupCallUserCell groupCallUserCell2;
                float f3;
                boolean z3;
                float x;
                float y;
                float x2;
                float y2;
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                int i13 = 1;
                if (!groupCallActivity2.isInDrawRenderNodeBlur && !groupCallActivity2.drawingForBlur && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
                    if (groupCallActivity2.renderNodeBlur == null) {
                        groupCallActivity2.renderNodeBlur = PhotoViewer$$ExternalSyntheticApiModelOutline3.m$2();
                        groupCallActivity2.renderNodeBlurScale = SizeNotifierFrameLayout.getRenderNodeScale();
                        ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                        float blurRadius = SizeNotifierFrameLayout.getBlurRadius();
                        RenderNode renderNode = groupCallActivity2.renderNodeBlur;
                        Shader.TileMode unused = Shader.TileMode.DECAL;
                        renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, Shader.TileMode.DECAL), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                        GroupCallMessagesListView groupCallMessagesListView2 = groupCallActivity2.groupCallMessagesListView;
                        groupCallMessagesListView2.setBlurRoot(this);
                        RenderNode renderNode2 = groupCallActivity2.renderNodeBlur;
                        float f4 = groupCallActivity2.renderNodeBlurScale;
                        groupCallMessagesListView2.renderNode = renderNode2;
                        groupCallMessagesListView2.renderNodeScale = f4;
                    }
                    int iRound = Math.round(getMeasuredWidth() / groupCallActivity2.renderNodeBlurScale);
                    int iRound2 = Math.round(getMeasuredHeight() / groupCallActivity2.renderNodeBlurScale);
                    groupCallActivity2.isInDrawRenderNodeBlur = true;
                    groupCallActivity2.renderNodeBlur.setPosition(0, 0, iRound, iRound2);
                    RecordingCanvas recordingCanvasBeginRecording = groupCallActivity2.renderNodeBlur.beginRecording();
                    float f5 = 1.0f / groupCallActivity2.renderNodeBlurScale;
                    recordingCanvasBeginRecording.scale(f5, f5);
                    dispatchDraw(recordingCanvasBeginRecording);
                    groupCallActivity2.renderNodeBlur.endRecording();
                    groupCallActivity2.isInDrawRenderNodeBlur = false;
                }
                int i14 = 0;
                while (true) {
                    anonymousClass9 = groupCallActivity2.listView;
                    if (i14 >= anonymousClass9.getChildCount()) {
                        break;
                    }
                    View childAt = anonymousClass9.getChildAt(i14);
                    if (childAt instanceof GroupCallUserCell) {
                        ((GroupCallUserCell) childAt).setDrawAvatar(true);
                    }
                    if (!(childAt instanceof GroupCallGridCell)) {
                        if (childAt.getMeasuredWidth() != anonymousClass9.getMeasuredWidth()) {
                            childAt.setTranslationX((anonymousClass9.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                        } else {
                            childAt.setTranslationX(0.0f);
                        }
                    }
                    i14++;
                }
                AnonymousClass28 anonymousClass29 = groupCallActivity2.renderersContainer;
                ValueAnimator valueAnimator = anonymousClass29.fullscreenAnimator;
                AnonymousClass24 anonymousClass24 = groupCallActivity2.fullscreenUsersListView;
                if (valueAnimator == null) {
                    for (int i15 = 0; i15 < anonymousClass24.getChildCount(); i15++) {
                        ((GroupCallFullscreenAdapter.GroupCallUserCell) anonymousClass24.getChildAt(i15)).setProgressToFullscreen(1.0f);
                    }
                } else if (anonymousClass24.getVisibility() == 0) {
                    HashMap map = this.listCells;
                    map.clear();
                    for (int i16 = 0; i16 < anonymousClass9.getChildCount(); i16++) {
                        View childAt2 = anonymousClass9.getChildAt(i16);
                        if (childAt2.isAttachedToWindow()) {
                            if (childAt2 instanceof GroupCallGridCell) {
                                anonymousClass9.getClass();
                                if (RecyclerView.getChildAdapterPosition(childAt2) >= 0) {
                                    GroupCallGridCell groupCallGridCell = (GroupCallGridCell) childAt2;
                                    if (groupCallGridCell.getRenderer() != anonymousClass29.fullscreenTextureView) {
                                        map.put(groupCallGridCell.getParticipant(), childAt2);
                                    }
                                } else if (childAt2 instanceof GroupCallUserCell) {
                                    anonymousClass9.getClass();
                                    if (RecyclerView.getChildAdapterPosition(childAt2) >= 0) {
                                        GroupCallUserCell groupCallUserCell3 = (GroupCallUserCell) childAt2;
                                        map.put(groupCallUserCell3.getParticipant(), groupCallUserCell3);
                                    }
                                }
                            } else if (childAt2 instanceof GroupCallUserCell) {
                                anonymousClass9.getClass();
                                if (RecyclerView.getChildAdapterPosition(childAt2) >= 0) {
                                    GroupCallUserCell groupCallUserCell4 = (GroupCallUserCell) childAt2;
                                    map.put(groupCallUserCell4.getParticipant(), groupCallUserCell4);
                                }
                            }
                        }
                    }
                    int i17 = 0;
                    while (i17 < anonymousClass24.getChildCount()) {
                        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell5 = (GroupCallFullscreenAdapter.GroupCallUserCell) anonymousClass24.getChildAt(i17);
                        View view = (View) map.get(groupCallUserCell5.getVideoParticipant());
                        if (view == null) {
                            view = (View) map.get(groupCallUserCell5.getParticipant());
                        }
                        float f6 = anonymousClass29.progressToFullscreenMode;
                        if (!groupCallActivity2.fullscreenListItemAnimator.isRunning()) {
                            groupCallUserCell5.setAlpha(1.0f);
                        }
                        if (view != null) {
                            if (view instanceof GroupCallGridCell) {
                                GroupCallGridCell groupCallGridCell2 = (GroupCallGridCell) view;
                                x = (anonymousClass9.getX() + groupCallGridCell2.getLeft()) - anonymousClass29.getLeft();
                                y = (anonymousClass9.getY() + groupCallGridCell2.getTop()) - anonymousClass29.getTop();
                                x2 = anonymousClass24.getX() + groupCallUserCell5.getLeft();
                                y2 = anonymousClass24.getY() + groupCallUserCell5.getTop();
                            } else {
                                GroupCallUserCell groupCallUserCell6 = (GroupCallUserCell) view;
                                x = ((anonymousClass9.getX() + groupCallUserCell6.getLeft()) - anonymousClass29.getLeft()) + groupCallUserCell6.getAvatarImageView().getLeft() + (groupCallUserCell6.getAvatarImageView().getMeasuredWidth() >> i13);
                                y = ((anonymousClass9.getY() + groupCallUserCell6.getTop()) - anonymousClass29.getTop()) + groupCallUserCell6.getAvatarImageView().getTop() + (groupCallUserCell6.getAvatarImageView().getMeasuredHeight() >> i13);
                                x2 = anonymousClass24.getX() + groupCallUserCell5.getLeft() + (groupCallUserCell5.getMeasuredWidth() >> i13);
                                y2 = anonymousClass24.getY() + groupCallUserCell5.getTop() + (groupCallUserCell5.getMeasuredHeight() >> 1);
                                groupCallUserCell6.setDrawAvatar(false);
                            }
                            float f7 = 1.0f - f6;
                            groupCallUserCell5.setTranslationX((x - x2) * f7);
                            groupCallUserCell5.setTranslationY((y - y2) * f7);
                            groupCallUserCell5.setScaleX(1.0f);
                            groupCallUserCell5.setScaleY(1.0f);
                            groupCallUserCell5.setProgressToFullscreen(f6);
                        } else {
                            groupCallUserCell5.setScaleX(1.0f);
                            groupCallUserCell5.setScaleY(1.0f);
                            groupCallUserCell5.setTranslationX(0.0f);
                            groupCallUserCell5.setTranslationY(0.0f);
                            groupCallUserCell5.setProgressToFullscreen(1.0f);
                            if (groupCallUserCell5.getRenderer() == null) {
                                groupCallUserCell5.setAlpha(f6);
                            }
                        }
                        i17++;
                        i13 = 1;
                    }
                }
                int i18 = 0;
                while (true) {
                    ArrayList arrayList = groupCallActivity2.attachedRenderers;
                    if (i18 >= arrayList.size()) {
                        break;
                    }
                    GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) arrayList.get(i18);
                    RecyclerListView recyclerListView = groupCallActivity2.tabletVideoGridView;
                    if (!groupCallMiniTextureView.showingAsScrimView && !groupCallMiniTextureView.animateToScrimView) {
                        if (!groupCallMiniTextureView.forceDetached) {
                            groupCallMiniTextureView.drawFirst = false;
                            float f8 = anonymousClass29.progressToFullscreenMode;
                            boolean z4 = groupCallMiniTextureView.animateToFullscreen;
                            GroupCallMiniTextureView.AnonymousClass1 anonymousClass1 = groupCallMiniTextureView.textureView;
                            if (z4 || groupCallMiniTextureView.showingInFullscreen) {
                                GroupCallGridCell groupCallGridCell3 = groupCallMiniTextureView.primaryView;
                                if (groupCallGridCell3 == null && groupCallMiniTextureView.tabletGridView == null) {
                                    groupCallMiniTextureView.setTranslationX(0.0f);
                                    groupCallMiniTextureView.setTranslationY(0.0f);
                                } else {
                                    GroupCallGridCell groupCallGridCell4 = groupCallMiniTextureView.tabletGridView;
                                    if (groupCallGridCell4 != null) {
                                        groupCallGridCell3 = groupCallGridCell4;
                                    }
                                    if (groupCallGridCell4 == null) {
                                        recyclerListView = anonymousClass9;
                                    }
                                    float x3 = ((recyclerListView.getX() + groupCallGridCell3.getX()) - groupCallMiniTextureView.getLeft()) - anonymousClass29.getLeft();
                                    float y3 = ((recyclerListView.getY() + (groupCallGridCell3.getY() + AndroidUtilities.dp(2.0f))) - groupCallMiniTextureView.getTop()) - anonymousClass29.getTop();
                                    float f9 = 1.0f - f8;
                                    float f10 = f8 * 0.0f;
                                    groupCallMiniTextureView.setTranslationX((x3 * f9) + f10);
                                    groupCallMiniTextureView.setTranslationY((y3 * f9) + f10);
                                }
                                anonymousClass1.setRoundCorners(AndroidUtilities.dp(8.0f));
                                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell7 = groupCallMiniTextureView.secondaryView;
                                if (groupCallUserCell7 != null) {
                                    groupCallUserCell7.setAlpha(f8);
                                }
                                if (!groupCallMiniTextureView.showingInFullscreen && groupCallMiniTextureView.primaryView == null && groupCallMiniTextureView.tabletGridView == null) {
                                    groupCallMiniTextureView.setAlpha(f8);
                                } else if (!groupCallMiniTextureView.animateEnter) {
                                    groupCallMiniTextureView.setAlpha(1.0f);
                                }
                            } else {
                                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell8 = groupCallMiniTextureView.secondaryView;
                                if (groupCallUserCell8 != null) {
                                    anonymousClass24.getClass();
                                    if (RecyclerView.getChildAdapterPosition(groupCallUserCell8) == -1) {
                                        groupCallMiniTextureView.setAlpha(groupCallMiniTextureView.secondaryView.getAlpha());
                                    } else if (groupCallMiniTextureView.primaryView == null) {
                                        if (groupCallMiniTextureView.attached && !groupCallMiniTextureView.animateEnter) {
                                            groupCallMiniTextureView.setAlpha(f8);
                                        }
                                        groupCallMiniTextureView.secondaryView.setAlpha(f8);
                                        f8 = 1.0f;
                                    } else {
                                        groupCallMiniTextureView.secondaryView.setAlpha(1.0f);
                                        if (groupCallMiniTextureView.attached && !groupCallMiniTextureView.animateEnter) {
                                            groupCallMiniTextureView.setAlpha(1.0f);
                                        }
                                    }
                                    groupCallMiniTextureView.setTranslationX((anonymousClass24.getX() + groupCallMiniTextureView.secondaryView.getX()) - groupCallMiniTextureView.getLeft());
                                    float f11 = 1.0f - f8;
                                    groupCallMiniTextureView.setTranslationY((anonymousClass24.getY() + (groupCallMiniTextureView.secondaryView.getY() + (AndroidUtilities.dp(2.0f) * f11))) - groupCallMiniTextureView.getTop());
                                    anonymousClass1.setRoundCorners((AndroidUtilities.dp(8.0f) * f11) + (AndroidUtilities.dp(13.0f) * f8));
                                } else {
                                    GroupCallGridCell groupCallGridCell5 = groupCallMiniTextureView.primaryView;
                                    if (groupCallGridCell5 != null || groupCallMiniTextureView.tabletGridView != null) {
                                        GroupCallGridCell groupCallGridCell6 = groupCallMiniTextureView.tabletGridView;
                                        if (groupCallGridCell6 == null || groupCallGridCell5 == null) {
                                            f3 = 2.0f;
                                            if (groupCallGridCell6 != null) {
                                                groupCallGridCell5 = groupCallGridCell6;
                                            }
                                            if (groupCallGridCell6 == null) {
                                                recyclerListView = anonymousClass9;
                                            }
                                        } else {
                                            if (GroupCallActivity.isTabletMode) {
                                                f3 = 2.0f;
                                                z3 = groupCallMiniTextureView.parentContainer.inFullscreenMode ? false : true;
                                                if (z3) {
                                                    groupCallGridCell5 = groupCallGridCell6;
                                                }
                                                if (!z3) {
                                                    recyclerListView = anonymousClass9;
                                                }
                                            } else {
                                                f3 = 2.0f;
                                            }
                                            if (z3) {
                                                groupCallGridCell5 = groupCallGridCell6;
                                            }
                                            if (!z3) {
                                                recyclerListView = anonymousClass9;
                                            }
                                        }
                                        groupCallMiniTextureView.setTranslationX(((recyclerListView.getX() + groupCallGridCell5.getX()) - groupCallMiniTextureView.getLeft()) - anonymousClass29.getLeft());
                                        groupCallMiniTextureView.setTranslationY(((recyclerListView.getY() + (groupCallGridCell5.getY() + AndroidUtilities.dp(f3))) - groupCallMiniTextureView.getTop()) - anonymousClass29.getTop());
                                        anonymousClass1.setRoundCorners(AndroidUtilities.dp(8.0f));
                                        if (groupCallMiniTextureView.attached && !groupCallMiniTextureView.animateEnter) {
                                            if (!GroupCallActivity.isTabletMode) {
                                                groupCallMiniTextureView.drawFirst = true;
                                                groupCallMiniTextureView.setAlpha(groupCallGridCell5.getAlpha() * (1.0f - f8));
                                            } else if (groupCallMiniTextureView.primaryView != null && groupCallMiniTextureView.tabletGridView == null) {
                                                groupCallMiniTextureView.setAlpha(groupCallGridCell5.getAlpha() * f8);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i18++;
                }
                boolean z5 = GroupCallActivity.isTabletMode;
                View view2 = groupCallActivity2.buttonsBackgroundGradientView2;
                View view3 = groupCallActivity2.buttonsBackgroundGradientView;
                if (z5) {
                    view3.setAlpha(1.0f);
                    view2.setAlpha(1.0f);
                } else {
                    view3.setAlpha(1.0f - anonymousClass29.progressToFullscreenMode);
                    view2.setAlpha(1.0f - anonymousClass29.progressToFullscreenMode);
                }
                if (anonymousClass29.swipedBack) {
                    anonymousClass9.setAlpha(1.0f - anonymousClass29.progressToFullscreenMode);
                } else {
                    anonymousClass9.setAlpha(1.0f);
                }
                WatchersView watchersView = groupCallActivity2.watchersView;
                if (watchersView != null) {
                    watchersView.setAlpha(1.0f - anonymousClass29.progressToFullscreenMode);
                    watchersView.setTranslationY(anonymousClass29.progressToFullscreenMode * AndroidUtilities.dp(64.0f));
                }
                super.dispatchDraw(canvas);
                if (groupCallActivity2.drawingForBlur) {
                    return;
                }
                boolean z6 = groupCallActivity2.avatarsPreviewShowed;
                RectF rectF = this.rect;
                Paint paint2 = groupCallActivity2.listViewBackgroundPaint;
                if (!z6) {
                    if (groupCallActivity2.scrimView != null) {
                        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), groupCallActivity2.scrimPaint);
                        float y4 = anonymousClass9.getY();
                        anonymousClass9.getY();
                        anonymousClass9.getMeasuredHeight();
                        if (!groupCallActivity2.hasScrimAnchorView) {
                            if (groupCallActivity2.scrimFullscreenView == null) {
                                GroupCallMiniTextureView groupCallMiniTextureView2 = groupCallActivity2.scrimRenderer;
                                if (groupCallMiniTextureView2 == null || !groupCallMiniTextureView2.attached) {
                                    return;
                                }
                                canvas.save();
                                canvas.translate(anonymousClass29.getX() + groupCallActivity2.scrimRenderer.getX(), anonymousClass29.getY() + groupCallActivity2.scrimRenderer.getY());
                                groupCallActivity2.scrimRenderer.draw(canvas);
                                canvas.restore();
                                return;
                            }
                            canvas.save();
                            canvas.translate(anonymousClass29.getX() + anonymousClass24.getX() + groupCallActivity2.scrimFullscreenView.getX(), anonymousClass29.getY() + anonymousClass24.getY() + groupCallActivity2.scrimFullscreenView.getY());
                            if (groupCallActivity2.scrimFullscreenView.getRenderer() == null || !groupCallActivity2.scrimFullscreenView.getRenderer().attached || groupCallActivity2.scrimFullscreenView.getRenderer().showingInFullscreen) {
                                groupCallActivity2.scrimFullscreenView.draw(canvas);
                            } else {
                                groupCallActivity2.scrimFullscreenView.getRenderer().draw(canvas);
                            }
                            groupCallActivity2.scrimFullscreenView.drawOverlays(canvas);
                            canvas.restore();
                            return;
                        }
                        int childCount = anonymousClass9.getChildCount();
                        for (int i19 = 0; i19 < childCount; i19++) {
                            View childAt3 = anonymousClass9.getChildAt(i19);
                            if (childAt3 == groupCallActivity2.scrimView) {
                                float fMax = Math.max(anonymousClass9.getLeft(), childAt3.getX() + anonymousClass9.getLeft());
                                float fMax2 = Math.max(y4, childAt3.getY() + anonymousClass9.getY());
                                float fMin = Math.min(anonymousClass9.getRight(), childAt3.getX() + anonymousClass9.getLeft() + childAt3.getMeasuredWidth());
                                float fMin2 = Math.min(anonymousClass9.getY() + anonymousClass9.getMeasuredHeight(), childAt3.getY() + anonymousClass9.getY() + groupCallActivity2.scrimView.getClipHeight());
                                if (fMax2 < fMin2) {
                                    if (childAt3.getAlpha() != 1.0f) {
                                        int alpha = (int) (childAt3.getAlpha() * 255.0f);
                                        canvas2 = canvas;
                                        canvas2.saveLayerAlpha(fMax, fMax2, fMin, fMin2, alpha, 31);
                                    } else {
                                        canvas2 = canvas;
                                        canvas2.save();
                                    }
                                    canvas2.clipRect(fMax, fMax2, fMin, getMeasuredHeight());
                                    canvas2.translate(childAt3.getX() + anonymousClass9.getLeft(), childAt3.getY() + anonymousClass9.getY());
                                    float alpha2 = groupCallActivity2.scrimPaint.getAlpha() / 100.0f;
                                    rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((groupCallActivity2.scrimView.getClipHeight() - groupCallActivity2.scrimView.getMeasuredHeight()) * (1.0f - CubicBezierInterpolator.EASE_OUT.getInterpolation(1.0f - alpha2))) + groupCallActivity2.scrimView.getMeasuredHeight()));
                                    GroupCallUserCell groupCallUserCell9 = groupCallActivity2.scrimView;
                                    paint2.getColor();
                                    if (TextUtils.isEmpty(groupCallUserCell9.statusTextView[4].getText())) {
                                        alpha2 = 0.0f;
                                    }
                                    SimpleTextView[] simpleTextViewArr = groupCallUserCell9.statusTextView;
                                    simpleTextViewArr[4].setFullAlpha(alpha2);
                                    simpleTextViewArr[4].setFullLayoutAdditionalWidth(0, 0);
                                    groupCallUserCell9.invalidate();
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint2);
                                    childAt3.draw(canvas2);
                                    canvas2.restore();
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                if (groupCallActivity2.scrimView != null) {
                    if (groupCallActivity2.useBlur) {
                        canvas3 = canvas;
                        paint = paint2;
                    } else {
                        paint = paint2;
                        canvas3 = canvas;
                        canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), groupCallActivity2.scrimPaint);
                    }
                    float y5 = anonymousClass9.getY();
                    float[] fArr = new float[8];
                    Path path = new Path();
                    int childCount2 = anonymousClass9.getChildCount();
                    float y6 = anonymousClass9.getY() + anonymousClass9.getMeasuredHeight();
                    if (groupCallActivity2.hasScrimAnchorView) {
                        int i20 = 0;
                        while (true) {
                            if (i20 >= childCount2) {
                                groupCallUserCell = null;
                                break;
                            }
                            View childAt4 = anonymousClass9.getChildAt(i20);
                            groupCallUserCell = groupCallActivity2.scrimView;
                            if (childAt4 == groupCallUserCell) {
                                break;
                            } else {
                                i20++;
                            }
                        }
                    } else {
                        groupCallUserCell = groupCallActivity2.scrimView;
                    }
                    AnonymousClass31 anonymousClass31 = groupCallActivity2.avatarPreviewContainer;
                    if (groupCallUserCell == null || y5 >= y6) {
                        anonymousClass31 = anonymousClass31;
                        f = 1.0f;
                    } else {
                        canvas3.save();
                        if (groupCallActivity2.scrimFullscreenView == null) {
                            f2 = 13.0f;
                            f = 1.0f;
                            canvas3.clipRect(0.0f, (1.0f - groupCallActivity2.progressToAvatarPreview) * y5, getMeasuredWidth(), (groupCallActivity2.progressToAvatarPreview * getMeasuredHeight()) + ((1.0f - groupCallActivity2.progressToAvatarPreview) * y6));
                        } else {
                            f2 = 13.0f;
                            f = 1.0f;
                        }
                        if (groupCallActivity2.hasScrimAnchorView) {
                            measuredWidth = (groupCallActivity2.progressToAvatarPreview * (anonymousClass31.getMeasuredWidth() + anonymousClass31.getTop())) + ((f - groupCallActivity2.progressToAvatarPreview) * (groupCallUserCell.getY() + anonymousClass9.getY()));
                            left = (groupCallActivity2.progressToAvatarPreview * anonymousClass31.getLeft()) + ((f - groupCallActivity2.progressToAvatarPreview) * (groupCallUserCell.getX() + anonymousClass9.getLeft()));
                        } else {
                            measuredWidth = anonymousClass31.getMeasuredWidth() + anonymousClass31.getTop();
                            left = anonymousClass31.getLeft();
                        }
                        float f12 = measuredWidth;
                        canvas3.translate(left, f12);
                        if (groupCallActivity2.hasScrimAnchorView) {
                            groupCallUserCell2 = groupCallUserCell;
                            canvas3.save();
                        } else {
                            groupCallUserCell2 = groupCallUserCell;
                            canvas3.saveLayerAlpha(0.0f, 0.0f, groupCallUserCell.getMeasuredWidth(), groupCallUserCell.getClipHeight(), (int) (groupCallActivity2.progressToAvatarPreview * 255.0f), 31);
                        }
                        float clipHeight = (int) (((groupCallUserCell2.getClipHeight() - groupCallUserCell2.getMeasuredHeight()) * (f - CubicBezierInterpolator.EASE_OUT.getInterpolation(f - groupCallActivity2.progressToAvatarPreview))) + groupCallUserCell2.getMeasuredHeight());
                        rectF.set(0.0f, 0.0f, groupCallUserCell2.getMeasuredWidth(), clipHeight);
                        groupCallUserCell2.setProgressToAvatarPreview(groupCallActivity2.hasScrimAnchorView ? groupCallActivity2.progressToAvatarPreview : 1.0f);
                        for (int i21 = 0; i21 < 4; i21++) {
                            fArr[i21] = (f - groupCallActivity2.progressToAvatarPreview) * AndroidUtilities.dp(f2);
                            fArr[i21 + 4] = AndroidUtilities.dp(f2);
                        }
                        path.reset();
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        path.close();
                        canvas3.drawPath(path, paint);
                        groupCallUserCell2.draw(canvas3);
                        canvas3.restore();
                        canvas3.restore();
                        if (groupCallActivity2.scrimPopupLayout != null) {
                            float f13 = f12 + clipHeight;
                            float measuredWidth2 = (getMeasuredWidth() - groupCallActivity2.scrimPopupLayout.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                            if (groupCallActivity2.progressToAvatarPreview != f) {
                                canvas3.saveLayerAlpha(measuredWidth2, f13, groupCallActivity2.scrimPopupLayout.getMeasuredWidth() + measuredWidth2, groupCallActivity2.scrimPopupLayout.getMeasuredHeight() + f13, (int) (groupCallActivity2.progressToAvatarPreview * 255.0f), 31);
                            } else {
                                canvas3.save();
                            }
                            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = groupCallActivity2.scrimPopupLayout;
                            actionBarPopupWindowLayout.setTranslationX(measuredWidth2 - actionBarPopupWindowLayout.getLeft());
                            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = groupCallActivity2.scrimPopupLayout;
                            actionBarPopupWindowLayout2.setTranslationY(f13 - actionBarPopupWindowLayout2.getTop());
                            float f14 = (groupCallActivity2.progressToAvatarPreview * 0.2f) + 0.8f;
                            canvas3.scale(f14, f14, (groupCallActivity2.scrimPopupLayout.getMeasuredWidth() / 2.0f) + measuredWidth2, f13);
                            canvas3.translate(measuredWidth2, f13);
                            groupCallActivity2.scrimPopupLayout.draw(canvas3);
                            canvas3.restore();
                        }
                    }
                    if (groupCallActivity2.pinchToZoomHelper.inOverlayMode) {
                        return;
                    }
                    canvas3.save();
                    if (groupCallActivity2.hasScrimAnchorView && groupCallActivity2.scrimFullscreenView == null) {
                        canvas3.clipRect(0.0f, (f - groupCallActivity2.progressToAvatarPreview) * y5, getMeasuredWidth(), (groupCallActivity2.progressToAvatarPreview * getMeasuredHeight()) + ((f - groupCallActivity2.progressToAvatarPreview) * y6));
                    }
                    canvas3.scale(anonymousClass31.getScaleX(), anonymousClass31.getScaleY(), anonymousClass31.getX(), anonymousClass31.getY());
                    canvas3.translate(anonymousClass31.getX(), anonymousClass31.getY());
                    anonymousClass31.draw(canvas3);
                    canvas3.restore();
                }
            }

            @Override
            public final boolean drawChild(Canvas canvas, View view, long j) {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                boolean z3 = groupCallActivity2.isInDrawRenderNodeBlur;
                AnonymousClass17 anonymousClass17 = groupCallActivity2.buttonsContainer;
                AnonymousClass28 anonymousClass29 = groupCallActivity2.renderersContainer;
                AnonymousClass9 anonymousClass9 = groupCallActivity2.listView;
                if (z3) {
                    if (view == anonymousClass9) {
                        int childCount = anonymousClass9.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = anonymousClass9.getChildAt(i13);
                            if (childAt.getVisibility() == 0) {
                                canvas.save();
                                canvas.translate(childAt.getX(), childAt.getY());
                                childAt.draw(canvas);
                                canvas.restore();
                            }
                        }
                    }
                    if (view == anonymousClass29 || view == anonymousClass17) {
                        return super.drawChild(canvas, view, j);
                    }
                } else if (GroupCallActivity.isTabletMode || anonymousClass29.progressToFullscreenMode != 1.0f || (view != groupCallActivity2.actionBar && view != groupCallActivity2.actionBarShadow && view != groupCallActivity2.actionBarBackground && view != groupCallActivity2.titleTextView && view != groupCallActivity2.menuItemsContainer && view != groupCallActivity2.textureLightningView)) {
                    if (groupCallActivity2.drawingForBlur && view == anonymousClass29) {
                        canvas.save();
                        float x = anonymousClass29.getX();
                        AnonymousClass24 anonymousClass24 = groupCallActivity2.fullscreenUsersListView;
                        canvas.translate(anonymousClass24.getX() + x, anonymousClass24.getY() + anonymousClass29.getY());
                        anonymousClass24.draw(canvas);
                        canvas.restore();
                        return true;
                    }
                    if (view != groupCallActivity2.avatarPreviewContainer && view != groupCallActivity2.scrimPopupLayout && view != groupCallActivity2.scrimView && (!groupCallActivity2.contentFullyOverlayed || !groupCallActivity2.useBlur || (view != anonymousClass9 && view != anonymousClass17 && view != groupCallActivity2.groupCallMessagesListView))) {
                        return super.drawChild(canvas, view, j);
                    }
                }
                return true;
            }

            @Override
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                GroupCallActivity.this.reactionEffectImageReceiver.onAttachedToWindow();
            }

            @Override
            public final void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                GroupCallActivity.this.reactionEffectImageReceiver.onDetachedFromWindow();
            }

            @Override
            public final void onDraw(Canvas canvas) {
                float f;
                int iDp = AndroidUtilities.dp(74.0f);
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                float f2 = groupCallActivity2.scrollOffsetY - iDp;
                int iDp2 = ((BottomSheet) groupCallActivity2).backgroundPaddingTop + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (((BottomSheet) groupCallActivity2).backgroundPaddingTop + f2 < ActionBar.getCurrentActionBarHeight()) {
                    int iDp3 = (iDp - ((BottomSheet) groupCallActivity2).backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
                    float fMin = Math.min(1.0f, ((ActionBar.getCurrentActionBarHeight() - f2) - ((BottomSheet) groupCallActivity2).backgroundPaddingTop) / iDp3);
                    int currentActionBarHeight = (int) ((ActionBar.getCurrentActionBarHeight() - iDp3) * fMin);
                    f2 -= currentActionBarHeight;
                    iDp2 += currentActionBarHeight;
                    f = 1.0f - fMin;
                } else {
                    f = 1.0f;
                }
                float paddingTop = f2 + getPaddingTop();
                groupCallActivity2.updateTopBulletinY();
                AnonymousClass28 anonymousClass29 = groupCallActivity2.renderersContainer;
                if (anonymousClass29.progressToFullscreenMode != 1.0f) {
                    int measuredWidth = getMeasuredWidth();
                    Drawable drawable = groupCallActivity2.shadowDrawable;
                    drawable.setBounds(0, (int) paddingTop, measuredWidth, iDp2);
                    drawable.draw(canvas);
                    if (f != 1.0f) {
                        Theme.dialogs_onlineCirclePaint.setColor(groupCallActivity2.backgroundColor);
                        RectF rectF = this.rect;
                        rectF.set(((BottomSheet) groupCallActivity2).backgroundPaddingLeft, ((BottomSheet) groupCallActivity2).backgroundPaddingTop + paddingTop, getMeasuredWidth() - ((BottomSheet) groupCallActivity2).backgroundPaddingLeft, ((BottomSheet) groupCallActivity2).backgroundPaddingTop + paddingTop + AndroidUtilities.dp(24.0f));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f, AndroidUtilities.dp(12.0f) * f, Theme.dialogs_onlineCirclePaint);
                    }
                    Theme.dialogs_onlineCirclePaint.setColor(Color.argb((int) (groupCallActivity2.actionBar.getAlpha() * 255.0f), (int) (Color.red(groupCallActivity2.backgroundColor) * 0.8f), (int) (Color.green(groupCallActivity2.backgroundColor) * 0.8f), (int) (Color.blue(groupCallActivity2.backgroundColor) * 0.8f)));
                    canvas.drawRect(((BottomSheet) groupCallActivity2).backgroundPaddingLeft, 0.0f, getMeasuredWidth() - ((BottomSheet) groupCallActivity2).backgroundPaddingLeft, groupCallActivity2.getStatusBarHeight(), Theme.dialogs_onlineCirclePaint);
                    AnonymousClass47 anonymousClass47 = groupCallActivity2.previewDialog;
                    if (anonymousClass47 != null) {
                        Theme.dialogs_onlineCirclePaint.setColor(anonymousClass47.getBackgroundColor());
                        canvas.drawRect(((BottomSheet) groupCallActivity2).backgroundPaddingLeft, 0.0f, getMeasuredWidth() - ((BottomSheet) groupCallActivity2).backgroundPaddingLeft, groupCallActivity2.getStatusBarHeight(), Theme.dialogs_onlineCirclePaint);
                    }
                }
                if (anonymousClass29.progressToFullscreenMode != 0.0f) {
                    Theme.dialogs_onlineCirclePaint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_voipgroup_actionBar, false), (int) (anonymousClass29.progressToFullscreenMode * 255.0f)));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), Theme.dialogs_onlineCirclePaint);
                }
                if (groupCallActivity2.isRtmpStream() && LiteMode.isEnabled(512)) {
                    if (anonymousClass29.progressToFullscreenMode < 0.15d) {
                        if (!groupCallActivity2.needTextureLightning) {
                            groupCallActivity2.needTextureLightning = true;
                            groupCallActivity2.runUpdateTextureLightningRunnable();
                        }
                    } else if (groupCallActivity2.needTextureLightning) {
                        groupCallActivity2.needTextureLightning = false;
                        AndroidUtilities.cancelRunOnUIThread(groupCallActivity2.updateTextureLightningRunnable);
                    }
                }
                float measuredWidth2 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f);
                float measuredHeight = (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f);
                ImageReceiver imageReceiver = groupCallActivity2.reactionEffectImageReceiver;
                imageReceiver.setImageCoords(measuredWidth2, measuredHeight, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver.draw(canvas);
            }

            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                if (groupCallActivity2.scrimView != null && motionEvent.getAction() == 0) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    RectF rectF = this.rect;
                    rectF.set(groupCallActivity2.scrimPopupLayout.getX(), groupCallActivity2.scrimPopupLayout.getY(), groupCallActivity2.scrimPopupLayout.getX() + groupCallActivity2.scrimPopupLayout.getMeasuredWidth(), groupCallActivity2.scrimPopupLayout.getY() + groupCallActivity2.scrimPopupLayout.getMeasuredHeight());
                    boolean z3 = !rectF.contains(x, y);
                    AnonymousClass31 anonymousClass31 = groupCallActivity2.avatarPreviewContainer;
                    rectF.set(anonymousClass31.getX(), anonymousClass31.getY(), anonymousClass31.getX() + anonymousClass31.getMeasuredWidth(), anonymousClass31.getY() + anonymousClass31.getMeasuredWidth() + groupCallActivity2.scrimView.getMeasuredHeight());
                    if (rectF.contains(x, y)) {
                        z3 = false;
                    }
                    if (z3) {
                        groupCallActivity2.dismissAvatarPreview(true);
                        return true;
                    }
                }
                if (motionEvent.getAction() != 0 || groupCallActivity2.scrollOffsetY == 0.0f || motionEvent.getY() >= groupCallActivity2.scrollOffsetY - AndroidUtilities.dp(37.0f) || groupCallActivity2.actionBar.getAlpha() != 0.0f || groupCallActivity2.avatarsPreviewShowed || groupCallActivity2.previewDialog != null || groupCallActivity2.renderersContainer.inFullscreenMode) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                groupCallActivity2.lambda$showGiftOfferSheet$15();
                return true;
            }

            @Override
            public final boolean onKeyDown(int i13, KeyEvent keyEvent) {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                if (groupCallActivity2.scrimView == null || i13 != 4) {
                    return super.onKeyDown(i13, keyEvent);
                }
                groupCallActivity2.dismissAvatarPreview(true);
                return true;
            }

            @Override
            public final void onLayout(boolean z3, int i13, int i14, int i15, int i16) {
                float x;
                boolean z4;
                boolean z5 = GroupCallActivity.isTabletMode;
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                if (z5 && this.localHasVideo != groupCallActivity2.hasVideo && this.wasLayout) {
                    x = groupCallActivity2.listView.getX();
                    z4 = true;
                } else {
                    x = 0.0f;
                    z4 = false;
                }
                this.localHasVideo = groupCallActivity2.hasVideo;
                AnonymousClass28 anonymousClass29 = groupCallActivity2.renderersContainer;
                anonymousClass29.inLayout = true;
                super.onLayout(z3, i13, i14, i15, i16);
                anonymousClass29.inLayout = false;
                GroupCallActivity.access$8700(groupCallActivity2);
                this.wasLayout = true;
                if (z4) {
                    AnonymousClass9 anonymousClass9 = groupCallActivity2.listView;
                    if (anonymousClass9.getLeft() != x) {
                        float left = x - anonymousClass9.getLeft();
                        anonymousClass9.setTranslationX(left);
                        AnonymousClass17 anonymousClass17 = groupCallActivity2.buttonsContainer;
                        anonymousClass17.setTranslationX(left);
                        View view = groupCallActivity2.buttonsBackgroundGradientView;
                        view.setTranslationX(left);
                        View view2 = groupCallActivity2.buttonsBackgroundGradientView2;
                        view2.setTranslationX(left);
                        ViewPropertyAnimator duration = anonymousClass9.animate().translationX(0.0f).setDuration(350L);
                        CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
                        duration.setInterpolator(cubicBezierInterpolator2).start();
                        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator2).start();
                        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator2).start();
                        anonymousClass17.animate().translationX(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator2).start();
                    }
                }
            }

            @Override
            public final void onMeasure(int i13, int i14) {
                int iDp;
                float f;
                int size = View.MeasureSpec.getSize(i14);
                this.ignoreLayout = true;
                boolean z3 = View.MeasureSpec.getSize(i13) > size && !AndroidUtilities.isTablet();
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                AnonymousClass28 anonymousClass29 = groupCallActivity2.renderersContainer;
                View.MeasureSpec.getSize(i13);
                anonymousClass29.getClass();
                boolean z4 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i13) > size && !groupCallActivity2.isRtmpStream();
                boolean z5 = GroupCallActivity.isLandscapeMode;
                FillLastGridLayoutManager fillLastGridLayoutManager = groupCallActivity2.layoutManager;
                AnonymousClass28 anonymousClass210 = groupCallActivity2.renderersContainer;
                AnonymousClass9 anonymousClass9 = groupCallActivity2.listView;
                AnonymousClass24 anonymousClass24 = groupCallActivity2.fullscreenUsersListView;
                if (z5 != z3) {
                    GroupCallActivity.isLandscapeMode = z3;
                    VoIPToggleButton voIPToggleButton = groupCallActivity2.muteButton;
                    if (voIPToggleButton.getMeasuredWidth() == 0) {
                        int i15 = voIPToggleButton.getLayoutParams().width;
                    }
                    GroupCallActivity.access$6500(groupCallActivity2);
                    fillLastGridLayoutManager.setSpanCount(GroupCallActivity.isLandscapeMode ? 6 : 2);
                    anonymousClass9.invalidateItemDecorations();
                    anonymousClass24.invalidateItemDecorations();
                    this.updateRenderers = true;
                    TextView textView2 = groupCallActivity2.scheduleInfoTextView;
                    if (textView2 != null) {
                        textView2.setVisibility(!GroupCallActivity.isLandscapeMode ? 0 : 8);
                    }
                    if (groupCallActivity2.isRtmpLandscapeMode() == z3 && groupCallActivity2.isRtmpStream() && !anonymousClass210.inFullscreenMode && !groupCallActivity2.call.visibleVideoParticipants.isEmpty()) {
                        groupCallActivity2.fullscreenFor(groupCallActivity2.call.visibleVideoParticipants.get(0));
                        boolean z6 = anonymousClass210.hideUiRunnableIsScheduled;
                        LaunchActivity.AnonymousClass18 anonymousClass18 = anonymousClass210.hideUiRunnable;
                        if (z6) {
                            AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
                        }
                        AndroidUtilities.runOnUIThread(anonymousClass18, 3000L);
                        anonymousClass210.hideUiRunnableIsScheduled = true;
                    }
                }
                boolean z7 = GroupCallActivity.isTabletMode;
                RecyclerListView recyclerListView = groupCallActivity2.tabletVideoGridView;
                if (z7 != z4) {
                    GroupCallActivity.isTabletMode = z4;
                    recyclerListView.setVisibility(z4 ? 0 : 8);
                    anonymousClass9.invalidateItemDecorations();
                    anonymousClass24.invalidateItemDecorations();
                    this.updateRenderers = true;
                }
                boolean z8 = this.updateRenderers;
                ArrayList arrayList = groupCallActivity2.attachedRenderers;
                if (z8) {
                    groupCallActivity2.applyCallParticipantUpdates(true);
                    ListAdapter listAdapter2 = groupCallActivity2.listAdapter;
                    listAdapter2.updateRows$31();
                    listAdapter2.mObservable.notifyChanged();
                    GroupCallFullscreenAdapter groupCallFullscreenAdapter = groupCallActivity2.fullscreenAdapter;
                    groupCallFullscreenAdapter.update(recyclerListView, false);
                    boolean z9 = GroupCallActivity.isTabletMode;
                    GroupCallTabletGridAdapter groupCallTabletGridAdapter = groupCallActivity2.tabletGridAdapter;
                    if (z9) {
                        groupCallTabletGridAdapter.update(recyclerListView, false);
                    }
                    recyclerListView.setVisibility(GroupCallActivity.isTabletMode ? 0 : 8);
                    groupCallTabletGridAdapter.setVisibility(recyclerListView, GroupCallActivity.isTabletMode && !anonymousClass210.inFullscreenMode, true);
                    boolean z10 = GroupCallActivity.isTabletMode;
                    groupCallActivity2.listViewVideoVisibility = !z10 || anonymousClass210.inFullscreenMode;
                    boolean z11 = !z10 && anonymousClass210.inFullscreenMode;
                    groupCallFullscreenAdapter.setVisibility(anonymousClass24, z11);
                    anonymousClass24.setVisibility(z11 ? 0 : 8);
                    anonymousClass9.setVisibility((GroupCallActivity.isTabletMode || !anonymousClass210.inFullscreenMode) ? 0 : 8);
                    fillLastGridLayoutManager.setSpanCount(GroupCallActivity.isLandscapeMode ? 6 : 2);
                    groupCallActivity2.updateState(false, false);
                    anonymousClass9.invalidateItemDecorations();
                    anonymousClass24.invalidateItemDecorations();
                    AndroidUtilities.updateVisibleRows(anonymousClass9);
                    this.updateRenderers = false;
                    ArrayList arrayList2 = groupCallActivity2.attachedRenderersTmp;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    anonymousClass210.setIsTablet(GroupCallActivity.isTabletMode);
                    for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                        ((GroupCallMiniTextureView) arrayList2.get(i16)).updateAttachState(true);
                    }
                }
                int paddingTop = (size - getPaddingTop()) - (groupCallActivity2.isRtmpStream() ? AndroidUtilities.dp(72.0f) : AndroidUtilities.dp(245.0f));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anonymousClass210.getLayoutParams();
                if (GroupCallActivity.isTabletMode) {
                    layoutParams.topMargin = ActionBar.getCurrentActionBarHeight();
                } else {
                    layoutParams.topMargin = 0;
                }
                for (int i17 = 0; i17 < 2; i17++) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) groupCallActivity2.undoView[i17].getLayoutParams();
                    if (GroupCallActivity.isTabletMode) {
                        layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
                    } else {
                        layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
                    }
                }
                if (recyclerListView != null) {
                    ((FrameLayout.LayoutParams) recyclerListView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight();
                }
                AnonymousClass36 anonymousClass36 = groupCallActivity2.callMessageEnterView;
                if (anonymousClass36.getEmojiView() != null) {
                    ((FrameLayout.LayoutParams) anonymousClass36.getEmojiView().getLayoutParams()).gravity = 80;
                }
                int iDp2 = AndroidUtilities.dp(groupCallActivity2.isRtmpStream() ? 40.0f : 90.0f);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) anonymousClass9.getLayoutParams();
                if (GroupCallActivity.isTabletMode) {
                    layoutParams3.gravity = groupCallActivity2.hasVideo ? 5 : 1;
                    layoutParams3.width = AndroidUtilities.dp(320.0f);
                    int iDp3 = AndroidUtilities.dp(4.0f);
                    layoutParams3.leftMargin = iDp3;
                    layoutParams3.rightMargin = iDp3;
                    layoutParams3.bottomMargin = iDp2;
                    layoutParams3.topMargin = ActionBar.getCurrentActionBarHeight();
                    iDp = AndroidUtilities.dp(60.0f);
                } else if (GroupCallActivity.isLandscapeMode) {
                    layoutParams3.gravity = 51;
                    layoutParams3.width = -1;
                    layoutParams3.topMargin = ActionBar.getCurrentActionBarHeight();
                    layoutParams3.bottomMargin = AndroidUtilities.dp(14.0f);
                    layoutParams3.rightMargin = AndroidUtilities.dp(90.0f);
                    layoutParams3.leftMargin = AndroidUtilities.dp(14.0f);
                    iDp = 0;
                } else {
                    layoutParams3.gravity = 51;
                    layoutParams3.width = -1;
                    iDp = AndroidUtilities.dp(60.0f);
                    layoutParams3.bottomMargin = iDp2;
                    layoutParams3.topMargin = AndroidUtilities.dp(14.0f) + ActionBar.getCurrentActionBarHeight();
                    int iDp4 = AndroidUtilities.dp(14.0f);
                    layoutParams3.leftMargin = iDp4;
                    layoutParams3.rightMargin = iDp4;
                }
                boolean z12 = GroupCallActivity.isLandscapeMode;
                View view = groupCallActivity2.buttonsBackgroundGradientView2;
                View view2 = groupCallActivity2.buttonsBackgroundGradientView;
                if (!z12 || GroupCallActivity.isTabletMode) {
                    view2.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    layoutParams4.bottomMargin = iDp2;
                    if (GroupCallActivity.isTabletMode) {
                        layoutParams4.gravity = groupCallActivity2.hasVideo ? 85 : 81;
                        layoutParams4.width = AndroidUtilities.dp(328.0f);
                    } else {
                        layoutParams4.width = -1;
                    }
                    view.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view.getLayoutParams();
                    layoutParams5.height = iDp2;
                    if (GroupCallActivity.isTabletMode) {
                        layoutParams5.gravity = groupCallActivity2.hasVideo ? 85 : 81;
                        layoutParams5.width = AndroidUtilities.dp(328.0f);
                    } else {
                        layoutParams5.width = -1;
                    }
                } else {
                    view2.setVisibility(8);
                    view.setVisibility(8);
                }
                if (GroupCallActivity.isLandscapeMode) {
                    anonymousClass24.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
                } else {
                    anonymousClass24.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
                }
                AnonymousClass17 anonymousClass17 = groupCallActivity2.buttonsContainer;
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) anonymousClass17.getLayoutParams();
                if (GroupCallActivity.isTabletMode) {
                    layoutParams6.width = AndroidUtilities.dp(320.0f);
                    layoutParams6.height = AndroidUtilities.dp(120.0f);
                    layoutParams6.gravity = groupCallActivity2.hasVideo ? 85 : 81;
                    layoutParams6.rightMargin = 0;
                } else if (GroupCallActivity.isLandscapeMode) {
                    layoutParams6.width = AndroidUtilities.dp(90.0f);
                    layoutParams6.height = -1;
                    layoutParams6.gravity = 53;
                } else {
                    layoutParams6.width = -1;
                    layoutParams6.height = AndroidUtilities.dp(120.0f);
                    layoutParams6.gravity = 81;
                    layoutParams6.rightMargin = 0;
                }
                boolean z13 = GroupCallActivity.isLandscapeMode;
                LinearLayout linearLayout = groupCallActivity2.menuItemsContainer;
                AnonymousClass5 anonymousClass6 = groupCallActivity2.actionBar;
                View view3 = groupCallActivity2.actionBarShadow;
                if (!z13 || GroupCallActivity.isTabletMode) {
                    ((FrameLayout.LayoutParams) anonymousClass6.getLayoutParams()).rightMargin = 0;
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
                    ((FrameLayout.LayoutParams) groupCallActivity2.actionBarBackground.getLayoutParams()).rightMargin = 0;
                    ((FrameLayout.LayoutParams) view3.getLayoutParams()).rightMargin = 0;
                } else {
                    ((FrameLayout.LayoutParams) anonymousClass6.getLayoutParams()).rightMargin = AndroidUtilities.dp(90.0f);
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(90.0f);
                    ((FrameLayout.LayoutParams) groupCallActivity2.actionBarBackground.getLayoutParams()).rightMargin = AndroidUtilities.dp(90.0f);
                    ((FrameLayout.LayoutParams) view3.getLayoutParams()).rightMargin = AndroidUtilities.dp(90.0f);
                }
                FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) anonymousClass24.getLayoutParams();
                if (GroupCallActivity.isLandscapeMode) {
                    f = 80.0f;
                    if (((LinearLayoutManager) anonymousClass24.getLayoutManager()).mOrientation != 1) {
                        ((LinearLayoutManager) anonymousClass24.getLayoutManager()).setOrientation(1);
                    }
                    layoutParams7.height = -1;
                    layoutParams7.width = AndroidUtilities.dp(80.0f);
                    layoutParams7.gravity = 53;
                    layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
                    layoutParams7.bottomMargin = 0;
                } else {
                    f = 80.0f;
                    if (((LinearLayoutManager) anonymousClass24.getLayoutManager()).mOrientation != 0) {
                        ((LinearLayoutManager) anonymousClass24.getLayoutManager()).setOrientation(0);
                    }
                    layoutParams7.height = AndroidUtilities.dp(80.0f);
                    layoutParams7.width = -1;
                    layoutParams7.gravity = 80;
                    layoutParams7.rightMargin = 0;
                    layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
                }
                ((FrameLayout.LayoutParams) view3.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight();
                groupCallActivity2.callMessageEnterUnderContainer.invalidate();
                FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) groupCallActivity2.callMessageEnterUnderContainer.getLayoutParams();
                layoutParams8.height = size;
                layoutParams8.topMargin = -getPaddingTop();
                if (anonymousClass36.getEmojiView() != null) {
                    ((FrameLayout.LayoutParams) anonymousClass36.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
                }
                int iM = GroupCallActivity.isTabletMode ? 0 : MessageObject$$ExternalSyntheticOutline0.m(paddingTop - Math.max(AndroidUtilities.dp(259.0f), (paddingTop / 5) * 3), 8.0f, 0);
                if (anonymousClass9.getPaddingTop() != iM || anonymousClass9.getPaddingBottom() != iDp) {
                    anonymousClass9.setPadding(0, iM, 0, iDp);
                }
                WatchersView watchersView = groupCallActivity2.watchersView;
                if (watchersView != null) {
                    FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) watchersView.getLayoutParams();
                    GroupCallGridCell groupCallGridCellAccess$700 = GroupCallActivity.access$700(groupCallActivity2);
                    if (groupCallGridCellAccess$700 != null) {
                        int measuredHeight = ((anonymousClass17.getMeasuredHeight() / 2) + anonymousClass17.getTop()) - (groupCallActivity2.leaveButton.getMeasuredHeight() / 2);
                        int measuredHeight2 = groupCallGridCellAccess$700.getMeasuredHeight() + ActionBar.getCurrentActionBarHeight() + iM;
                        layoutParams9.topMargin = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                        layoutParams9.height = AndroidUtilities.dp(70.0f);
                    }
                }
                LightningView lightningView = groupCallActivity2.textureLightningView;
                if (lightningView != null) {
                    FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) lightningView.getLayoutParams();
                    GroupCallGridCell groupCallGridCellAccess$701 = GroupCallActivity.access$700(groupCallActivity2);
                    if (groupCallGridCellAccess$701 != null) {
                        layoutParams10.height = groupCallGridCellAccess$701.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                        layoutParams10.width = groupCallGridCellAccess$701.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                        int iDp5 = AndroidUtilities.dp(16.0f);
                        layoutParams10.leftMargin = iDp5;
                        layoutParams10.rightMargin = iDp5;
                    }
                }
                SimpleTextView simpleTextView = groupCallActivity2.scheduleStartAtTextView;
                if (simpleTextView != null) {
                    int iDp6 = ((AndroidUtilities.dp(60.0f) + (paddingTop - iM)) / 2) + iM;
                    SimpleTextView simpleTextView2 = groupCallActivity2.scheduleStartInTextView;
                    FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) simpleTextView2.getLayoutParams();
                    layoutParams11.topMargin = iDp6 - AndroidUtilities.dp(30.0f);
                    FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) simpleTextView.getLayoutParams();
                    layoutParams12.topMargin = AndroidUtilities.dp(f) + iDp6;
                    FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) groupCallActivity2.scheduleTimeTextView.getLayoutParams();
                    if (layoutParams11.topMargin < ActionBar.getCurrentActionBarHeight()) {
                        simpleTextView2.setVisibility(4);
                        simpleTextView.setVisibility(4);
                        layoutParams13.topMargin = iDp6 - AndroidUtilities.dp(20.0f);
                    } else if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin > size - AndroidUtilities.dp(231.0f)) {
                        simpleTextView2.setVisibility(4);
                        simpleTextView.setVisibility(4);
                        layoutParams13.topMargin = iDp6 - AndroidUtilities.dp(20.0f);
                    } else {
                        simpleTextView2.setVisibility(0);
                        simpleTextView.setVisibility(0);
                        layoutParams13.topMargin = iDp6;
                    }
                }
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    ((GroupCallMiniTextureView) arrayList.get(i18)).setFullscreenMode(anonymousClass210.inFullscreenMode, true);
                }
                this.ignoreLayout = false;
                super.onMeasure(i13, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
                if (measuredHeight3 != this.lastSize) {
                    this.lastSize = measuredHeight3;
                    groupCallActivity2.dismissAvatarPreview(false);
                }
                groupCallActivity2.cellFlickerDrawable.parentWidth = getMeasuredWidth();
                groupCallActivity2.checkGroupCallUiPositions_MessagesList();
            }

            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                return !GroupCallActivity.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            public final void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }

            @Override
            public final void setTranslationY(float f) {
                super.setTranslationY(f);
                GroupCallActivity.this.updateTopBulletinY();
            }
        };
        this.sizeNotifierFrameLayout = r14;
        this.containerView = r14;
        r14.setClipToPadding(false);
        this.containerView.setFocusable(true);
        this.containerView.setFocusableInTouchMode(true);
        this.containerView.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i13, 0, i13, 0);
        this.containerView.setKeepScreenOn(true);
        this.containerView.setClipChildren(false);
        this.reactionEffectImageReceiver = new ImageReceiver(this.containerView);
        if (inputPeer != null) {
            SimpleTextView simpleTextView = new SimpleTextView(launchActivity);
            this.scheduleStartInTextView = simpleTextView;
            simpleTextView.setGravity(17);
            simpleTextView.setTextColor(-1);
            simpleTextView.setTypeface(AndroidUtilities.bold());
            simpleTextView.setTextSize(18);
            simpleTextView.setText(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(simpleTextView, LayoutHelper.createFrame(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            ?? r13 = new SimpleTextView(launchActivity) {
                public float duration;
                public float gradientWidth;
                public int lastTextWidth;
                public long lastUpdateTime;
                public LinearGradient linearGradient;
                public float startX;
                public float time;
                public final Matrix matrix = new Matrix();
                public float targetX = -1.0f;

                @Override
                public final void createLayout(int i14) {
                    super.createLayout(i14);
                    int textWidth = getTextWidth();
                    if (textWidth != this.lastTextWidth) {
                        float f = textWidth;
                        this.gradientWidth = 1.3f * f;
                        float textHeight = getTextHeight();
                        float f2 = f * 2.0f;
                        int color = Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient, false);
                        int color2 = Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient3, false);
                        int i15 = Theme.key_voipgroup_mutedByAdminGradient2;
                        this.linearGradient = new LinearGradient(0.0f, textHeight, f2, 0.0f, new int[]{color, color2, Theme.getColor(null, i15, false), Theme.getColor(null, i15, false)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
                        getPaint().setShader(this.linearGradient);
                        this.lastTextWidth = textWidth;
                    }
                }

                @Override
                public final void onDraw(Canvas canvas) {
                    float f;
                    if (this.linearGradient != null) {
                        GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                        ChatObject.Call call2 = groupCallActivity2.call;
                        if (call2 == null || !call2.isScheduled()) {
                            f = 0.0f;
                        } else {
                            long currentTimeMillis = (((long) groupCallActivity2.call.call.schedule_date) * 1000) - groupCallActivity2.accountInstance.getConnectionsManager().getCurrentTimeMillis();
                            if (currentTimeMillis < 0) {
                                f = 1.0f;
                            } else if (currentTimeMillis < 5000) {
                                f = 1.0f - (currentTimeMillis / 5000.0f);
                            } else {
                                f = 0.0f;
                            }
                        }
                        Matrix matrix = this.matrix;
                        matrix.reset();
                        matrix.postTranslate((-this.lastTextWidth) * 0.7f * f, 0.0f);
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        long j = jElapsedRealtime - this.lastUpdateTime;
                        if (j > 20) {
                            j = 17;
                        }
                        this.lastUpdateTime = jElapsedRealtime;
                        float f2 = this.duration;
                        if (f2 == 0.0f || this.time >= f2) {
                            this.duration = Utilities.random.nextInt(200) + 1500;
                            this.time = 0.0f;
                            if (this.targetX == -1.0f) {
                                this.targetX = ((Utilities.random.nextInt(100) - 50) * 0.2f) / 50.0f;
                            }
                            this.startX = this.targetX;
                            this.targetX = ((Utilities.random.nextInt(100) - 50) * 0.2f) / 50.0f;
                        }
                        float f3 = j;
                        float fM = OKLCH.m(f3 * 0.02f, groupCallActivity2.amplitude, 1.0f * f3, this.time);
                        this.time = fM;
                        float f4 = this.duration;
                        if (fM > f4) {
                            this.time = f4;
                        }
                        float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.time / f4);
                        float f5 = this.gradientWidth;
                        float f6 = this.startX;
                        matrix.postTranslate(((((this.targetX - f6) * interpolation) + f6) * f5) - (f5 / 2.0f), 0.0f);
                        this.linearGradient.setLocalMatrix(matrix);
                        invalidate();
                    }
                    super.onDraw(canvas);
                }
            };
            this.scheduleTimeTextView = r13;
            r13.setGravity(17);
            r13.setTextColor(-1);
            r13.setTypeface(AndroidUtilities.bold());
            r13.setTextSize(60);
            this.containerView.addView((View) r13, LayoutHelper.createFrame(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            SimpleTextView simpleTextView2 = new SimpleTextView(launchActivity);
            this.scheduleStartAtTextView = simpleTextView2;
            simpleTextView2.setGravity(17);
            simpleTextView2.setTextColor(-1);
            simpleTextView2.setTypeface(AndroidUtilities.bold());
            simpleTextView2.setTextSize(18);
            this.containerView.addView(simpleTextView2, LayoutHelper.createFrame(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (isRtmpStream()) {
            LightningView lightningView = new LightningView(launchActivity);
            this.textureLightningView = lightningView;
            this.containerView.addView(lightningView, LayoutHelper.createFrame(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(launchActivity);
        this.listView = anonymousClass9;
        anonymousClass9.setClipToPadding(false);
        anonymousClass9.setClipChildren(false);
        GroupCallItemAnimator groupCallItemAnimator = new GroupCallItemAnimator();
        this.itemAnimator = groupCallItemAnimator;
        groupCallItemAnimator.translationInterpolator = cubicBezierInterpolator;
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        groupCallItemAnimator.mRemoveDuration = 350L;
        groupCallItemAnimator.mAddDuration = 350L;
        groupCallItemAnimator.mMoveDuration = 350L;
        groupCallItemAnimator.setDelayAnimations();
        anonymousClass9.setItemAnimator(groupCallItemAnimator);
        anonymousClass9.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrollStateChanged(RecyclerView recyclerView, int i14) {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                if (i14 != 0) {
                    HintView hintView = groupCallActivity2.recordHintView;
                    if (hintView != null) {
                        hintView.hide(true);
                    }
                    HintView hintView2 = groupCallActivity2.reminderHintView;
                    if (hintView2 != null) {
                        hintView2.hide(true);
                        return;
                    }
                    return;
                }
                if ((groupCallActivity2.scrollOffsetY - AndroidUtilities.dp(74.0f)) + ((BottomSheet) groupCallActivity2).backgroundPaddingTop < ActionBar.getCurrentActionBarHeight()) {
                    AnonymousClass9 anonymousClass10 = groupCallActivity2.listView;
                    if (anonymousClass10.canScrollVertically(1)) {
                        anonymousClass10.getChildAt(0);
                        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass10.findViewHolderForAdapterPosition(0);
                        if (holder != null) {
                            View view = holder.itemView;
                            if (view.getTop() > 0) {
                                anonymousClass10.smoothScrollBy(0, view.getTop(), null);
                            }
                        }
                    }
                }
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i14, int i15) {
                ChatObject.Call call2;
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                if (groupCallActivity2.listView.getChildCount() <= 0 || (call2 = groupCallActivity2.call) == null) {
                    return;
                }
                if (!call2.loadingMembers && !call2.membersLoadEndReached && groupCallActivity2.layoutManager.findLastVisibleItemPosition() > groupCallActivity2.listAdapter.rowsCount - 5) {
                    groupCallActivity2.call.loadMembers(false);
                }
                GroupCallActivity.access$8700(groupCallActivity2);
                LightningView lightningView2 = groupCallActivity2.textureLightningView;
                if (lightningView2 != null) {
                    lightningView2.invalidate();
                }
                ((BottomSheet) groupCallActivity2).containerView.invalidate();
            }
        });
        anonymousClass9.setVerticalScrollBarEnabled(false);
        getContext();
        FillLastGridLayoutManager fillLastGridLayoutManager = new FillLastGridLayoutManager(isLandscapeMode ? 6 : 2, anonymousClass9);
        this.layoutManager = fillLastGridLayoutManager;
        anonymousClass9.setLayoutManager(fillLastGridLayoutManager);
        AnonymousClass11 anonymousClass11 = new AnonymousClass11();
        this.spanSizeLookup = anonymousClass11;
        fillLastGridLayoutManager.setSpanSizeLookup(anonymousClass11);
        anonymousClass9.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                recyclerView.getClass();
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition >= 0) {
                    rect.setEmpty();
                    ListAdapter listAdapter2 = GroupCallActivity.this.listAdapter;
                    int i14 = listAdapter2.usersVideoGridStartRow;
                    if (childAdapterPosition < i14 || childAdapterPosition >= listAdapter2.usersVideoGridEndRow) {
                        return;
                    }
                    int i15 = childAdapterPosition - i14;
                    int i16 = GroupCallActivity.isLandscapeMode ? 6 : 2;
                    int i17 = i15 % i16;
                    if (i17 == 0) {
                        rect.right = AndroidUtilities.dp(2.0f);
                    } else if (i17 == i16 - 1) {
                        rect.left = AndroidUtilities.dp(2.0f);
                    } else {
                        rect.left = AndroidUtilities.dp(1.0f);
                    }
                }
            }
        });
        fillLastGridLayoutManager.setBind();
        this.containerView.addView(anonymousClass9, LayoutHelper.createFrame(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        anonymousClass9.setAdapter(listAdapter);
        anonymousClass9.setTopBottomSelectorRadius(13);
        anonymousClass9.setSelectorDrawableColor(Theme.getColor(Theme.key_voipgroup_listSelector));
        anonymousClass9.setOnItemClickListener(new VoIPFragment$$ExternalSyntheticLambda42(this, launchActivity, call, 11));
        anonymousClass9.setOnItemLongClickListener(new GroupCallActivity$$ExternalSyntheticLambda12(this, 4));
        if (isRtmpStream()) {
            WatchersView watchersView = new WatchersView(getContext());
            this.watchersView = watchersView;
            this.containerView.addView(watchersView, LayoutHelper.createFrame(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        RecyclerListView recyclerListView = new RecyclerListView(launchActivity);
        this.tabletVideoGridView = recyclerListView;
        this.containerView.addView(recyclerListView, LayoutHelper.createFrame(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        GroupCallTabletGridAdapter groupCallTabletGridAdapter = new GroupCallTabletGridAdapter(call, this.currentAccount, this);
        this.tabletGridAdapter = groupCallTabletGridAdapter;
        recyclerListView.setAdapter(groupCallTabletGridAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(6, false);
        recyclerListView.setLayoutManager(gridLayoutManager);
        gridLayoutManager.setSpanSizeLookup(new BaseMenuWrapper() {
            @Override
            public final int getSpanSize(int i14) {
                int size = GroupCallActivity.this.tabletGridAdapter.videoParticipants.size();
                if (size > 1 && size != 2) {
                    return (size != 3 || i14 == 0 || i14 == 1) ? 3 : 6;
                }
                return 6;
            }
        });
        final int i14 = 1;
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener(this) {
            public final GroupCallActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onItemClick(int i15, View view) {
                switch (i14) {
                    case 0:
                        GroupCallActivity groupCallActivity2 = this.f$0;
                        groupCallActivity2.getClass();
                        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) view;
                        if (groupCallUserCell.getVideoParticipant() != null) {
                            groupCallActivity2.fullscreenFor(groupCallUserCell.getVideoParticipant());
                        } else {
                            groupCallActivity2.fullscreenFor(new ChatObject.VideoParticipant(groupCallUserCell.getParticipant(), false, false));
                        }
                        break;
                    default:
                        GroupCallActivity groupCallActivity3 = this.f$0;
                        groupCallActivity3.getClass();
                        GroupCallGridCell groupCallGridCell = (GroupCallGridCell) view;
                        if (groupCallGridCell.getParticipant() != null) {
                            groupCallActivity3.fullscreenFor(groupCallGridCell.getParticipant());
                        }
                        break;
                }
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDelayAnimations();
        defaultItemAnimator.translationInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveDuration = 350L;
        defaultItemAnimator.mAddDuration = 350L;
        defaultItemAnimator.mMoveDuration = 350L;
        recyclerListView.setItemAnimator(new DefaultItemAnimator() {
            @Override
            public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                groupCallActivity2.listView.invalidate();
                groupCallActivity2.renderersContainer.invalidate();
                ((BottomSheet) groupCallActivity2).containerView.invalidate();
                GroupCallActivity.access$8700(groupCallActivity2);
            }
        });
        recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrolled(RecyclerView recyclerView, int i15, int i16) {
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }
        });
        groupCallTabletGridAdapter.setVisibility(recyclerListView, false, false);
        recyclerListView.setVisibility(8);
        ?? r3 = new GroupCallActivityButtonsLayout(launchActivity) {
            public int currentLightColor;
            public final OvershootInterpolator overshootInterpolator = new OvershootInterpolator(1.5f);

            @Override
            public final void dispatchDraw(Canvas canvas) {
                WeavingState weavingState;
                boolean z3;
                float interpolation;
                WeavingState weavingState2;
                VoIPToggleButton voIPToggleButton;
                RadialProgressView radialProgressView;
                int i15;
                float f;
                BlobDrawable blobDrawable;
                RadialProgressView radialProgressView2;
                BlobDrawable blobDrawable2;
                float f2;
                int iDp;
                float f3;
                float measuredWidth;
                float y;
                BlobDrawable blobDrawable3;
                float fDp;
                float f4;
                AnonymousClass42 anonymousClass42;
                WeavingState weavingState3;
                int i16;
                float f5;
                float f6;
                float f7;
                float f8;
                WeavingState weavingState4;
                int i17;
                boolean z4;
                boolean z5;
                float f9;
                float f10;
                float f11;
                float f12;
                float f13;
                float f14;
                float f15;
                float f16;
                WeavingState weavingState5;
                int i18;
                boolean z6;
                WeavingState weavingState6;
                int iBlendARGB;
                int iBlendARGB2;
                int iBlendARGB3;
                int iBlendARGB4;
                WeavingState weavingState7;
                WeavingState weavingState8;
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                if (groupCallActivity2.contentFullyOverlayed && groupCallActivity2.useBlur) {
                    return;
                }
                int measuredWidth2 = (getMeasuredWidth() - getMeasuredHeight()) / 2;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - groupCallActivity2.lastUpdateTime;
                groupCallActivity2.lastUpdateTime = jElapsedRealtime;
                if (j > 20) {
                    j = 17;
                }
                long j2 = j;
                WeavingState weavingState9 = groupCallActivity2.currentState;
                if (weavingState9 != null) {
                    weavingState9.update(0, measuredWidth2, getMeasuredHeight(), j2, groupCallActivity2.amplitude);
                }
                BlobDrawable blobDrawable4 = groupCallActivity2.tinyWaveDrawable;
                blobDrawable4.minRadius = AndroidUtilities.dp(62.0f) * 0.46296296f;
                blobDrawable4.maxRadius = AndroidUtilities$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(20.0f), 0.6f, AndroidUtilities.dp(62.0f), 0.48076922f);
                BlobDrawable blobDrawable5 = groupCallActivity2.bigWaveDrawable;
                blobDrawable5.minRadius = AndroidUtilities.dp(65.0f) * 0.46296296f;
                blobDrawable5.maxRadius = AndroidUtilities$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(20.0f), 0.6f, AndroidUtilities.dp(65.0f), 0.48076922f);
                float f17 = groupCallActivity2.animateToAmplitude;
                float f18 = groupCallActivity2.amplitude;
                if (f17 != f18) {
                    float f19 = groupCallActivity2.animateAmplitudeDiff;
                    float f20 = (j2 * f19) + f18;
                    groupCallActivity2.amplitude = f20;
                    if (f19 > 0.0f) {
                        if (f20 > f17) {
                            groupCallActivity2.amplitude = f17;
                        }
                    } else if (f20 < f17) {
                        groupCallActivity2.amplitude = f17;
                    }
                }
                WeavingState weavingState10 = groupCallActivity2.prevState;
                RadialProgressView radialProgressView3 = groupCallActivity2.radialProgressView;
                if (weavingState10 != null && weavingState10.currentState == 3) {
                    radialProgressView3.toCircle = true;
                    if (Math.abs(radialProgressView3.drawingCircleLenght) < 360.0f) {
                        z3 = false;
                    }
                    VoIPToggleButton voIPToggleButton2 = groupCallActivity2.soundButton;
                    VoIPToggleButton voIPToggleButton3 = groupCallActivity2.messageButton;
                    Paint paint = groupCallActivity2.radialPaint;
                    if (z3) {
                        f7 = groupCallActivity2.switchProgress;
                        if (f7 != 1.0f) {
                            weavingState7 = groupCallActivity2.prevState;
                            if (weavingState7 == null && weavingState7.currentState == 3) {
                                groupCallActivity2.switchProgress = (j2 / 100.0f) + f7;
                            } else {
                                groupCallActivity2.switchProgress = (j2 / 180.0f) + f7;
                            }
                            if (groupCallActivity2.switchProgress >= 1.0f) {
                                groupCallActivity2.switchProgress = 1.0f;
                                groupCallActivity2.prevState = null;
                                weavingState8 = groupCallActivity2.currentState;
                                if (weavingState8 != null && weavingState8.currentState == 3) {
                                    radialProgressView3.toCircle = false;
                                }
                            }
                            groupCallActivity2.invalidateColors = true;
                        }
                        if (groupCallActivity2.invalidateColors || (weavingState6 = groupCallActivity2.currentState) == null) {
                            z3 = z3;
                            radialProgressView3 = radialProgressView3;
                            f8 = 1.0f;
                        } else {
                            groupCallActivity2.invalidateColors = false;
                            WeavingState weavingState11 = groupCallActivity2.prevState;
                            f8 = 1.0f;
                            int[] iArr = groupCallActivity2.colorsTmp;
                            if (weavingState11 != null) {
                                GroupCallActivity.access$14800(groupCallActivity2, weavingState11.currentState, iArr);
                                int i19 = iArr[0];
                                int i20 = iArr[1];
                                int i21 = iArr[2];
                                int i22 = iArr[3];
                                GroupCallActivity.access$14800(groupCallActivity2, groupCallActivity2.currentState.currentState, iArr);
                                iBlendARGB = ColorUtils.blendARGB(groupCallActivity2.switchProgress, i19, iArr[0]);
                                iBlendARGB2 = ColorUtils.blendARGB(groupCallActivity2.switchProgress, i20, iArr[1]);
                                iBlendARGB3 = ColorUtils.blendARGB(groupCallActivity2.switchProgress, i21, iArr[2]);
                                iBlendARGB4 = ColorUtils.blendARGB(groupCallActivity2.switchProgress, i22, iArr[3]);
                            } else {
                                GroupCallActivity.access$14800(groupCallActivity2, weavingState6.currentState, iArr);
                                iBlendARGB = iArr[0];
                                iBlendARGB2 = iArr[1];
                                iBlendARGB3 = iArr[2];
                                iBlendARGB4 = iArr[3];
                            }
                            if (this.currentLightColor != iBlendARGB) {
                                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(45.454548f), new int[]{ColorUtils.setAlphaComponent(iBlendARGB, 60), ColorUtils.setAlphaComponent(iBlendARGB, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                                groupCallActivity2.radialGradient = radialGradient;
                                paint.setShader(radialGradient);
                                this.currentLightColor = iBlendARGB;
                            }
                            voIPToggleButton3.setBackgroundColor(iBlendARGB3, iBlendARGB2);
                            voIPToggleButton2.setBackgroundColor(iBlendARGB3, iBlendARGB2);
                            groupCallActivity2.cameraButton.setBackgroundColor(iBlendARGB3, iBlendARGB2);
                            groupCallActivity2.flipButton.setBackgroundColor(iBlendARGB3, iBlendARGB2);
                            VoIPToggleButton voIPToggleButton4 = groupCallActivity2.leaveButton;
                            int i23 = Theme.key_voipgroup_leaveButton;
                            voIPToggleButton4.setBackgroundColor(Theme.getColor(null, i23, false), Theme.getColor(null, i23, false));
                            groupCallActivity2.speakerButton.setBackgroundColor(iBlendARGB2, iBlendARGB4);
                        }
                        weavingState4 = groupCallActivity2.currentState;
                        if (weavingState4 != null) {
                            i18 = weavingState4.currentState;
                            if (i18 != 1 || i18 == 0 || GroupCallActivity.isGradientState(i18)) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            i17 = 3;
                            if (groupCallActivity2.currentState.currentState != 3) {
                                z5 = z6;
                                z4 = true;
                            } else {
                                z5 = z6;
                                z4 = false;
                            }
                        } else {
                            i17 = 3;
                            z4 = false;
                            z5 = false;
                        }
                        if (groupCallActivity2.prevState == null && (weavingState5 = groupCallActivity2.currentState) != null && weavingState5.currentState == i17) {
                            float f21 = groupCallActivity2.showWavesProgress - (j2 / 180.0f);
                            groupCallActivity2.showWavesProgress = f21;
                            if (f21 < 0.0f) {
                                groupCallActivity2.showWavesProgress = 0.0f;
                            }
                        } else if (z5) {
                            f11 = groupCallActivity2.showWavesProgress;
                            if (f11 != f8) {
                                f12 = (j2 / 350.0f) + f11;
                                groupCallActivity2.showWavesProgress = f12;
                                if (f12 > f8) {
                                    groupCallActivity2.showWavesProgress = 1.0f;
                                }
                            } else if (!z5) {
                                f9 = groupCallActivity2.showWavesProgress;
                                if (f9 != 0.0f) {
                                    f10 = f9 - (j2 / 350.0f);
                                    groupCallActivity2.showWavesProgress = f10;
                                    if (f10 < 0.0f) {
                                        groupCallActivity2.showWavesProgress = 0.0f;
                                    }
                                }
                            }
                        } else if (!z5) {
                            f9 = groupCallActivity2.showWavesProgress;
                            if (f9 != 0.0f) {
                                f10 = f9 - (j2 / 350.0f);
                                groupCallActivity2.showWavesProgress = f10;
                                if (f10 < 0.0f) {
                                    groupCallActivity2.showWavesProgress = 0.0f;
                                }
                            }
                        }
                        if (z4) {
                            f15 = groupCallActivity2.showLightingProgress;
                            if (f15 != 1.0f) {
                                f16 = (j2 / 350.0f) + f15;
                                groupCallActivity2.showLightingProgress = f16;
                                if (f16 > 1.0f) {
                                    groupCallActivity2.showLightingProgress = 1.0f;
                                }
                            } else if (!z4) {
                                f13 = groupCallActivity2.showLightingProgress;
                                if (f13 != 0.0f) {
                                    f14 = f13 - (j2 / 350.0f);
                                    groupCallActivity2.showLightingProgress = f14;
                                    if (f14 < 0.0f) {
                                        groupCallActivity2.showLightingProgress = 0.0f;
                                    }
                                }
                            }
                        } else if (!z4) {
                            f13 = groupCallActivity2.showLightingProgress;
                            if (f13 != 0.0f) {
                                f14 = f13 - (j2 / 350.0f);
                                groupCallActivity2.showLightingProgress = f14;
                                if (f14 < 0.0f) {
                                    groupCallActivity2.showLightingProgress = 0.0f;
                                }
                            }
                        }
                    } else {
                        z3 = z3;
                        radialProgressView3 = radialProgressView3;
                    }
                    interpolation = (this.overshootInterpolator.getInterpolation(groupCallActivity2.showWavesProgress) * 0.6f) + 0.4f;
                    blobDrawable5.update(groupCallActivity2.amplitude, 1.0f);
                    blobDrawable4.update(groupCallActivity2.amplitude, 1.0f);
                    weavingState2 = groupCallActivity2.prevState;
                    Matrix matrix = groupCallActivity2.radialMatrix;
                    voIPToggleButton = groupCallActivity2.muteButton;
                    Paint paint2 = groupCallActivity2.paint;
                    if (weavingState2 != null || groupCallActivity2.currentState == null || groupCallActivity2.isRtmpStream() || !((i16 = (weavingState3 = groupCallActivity2.currentState).currentState) == 3 || groupCallActivity2.prevState.currentState == 3)) {
                        radialProgressView = radialProgressView3;
                        i15 = 0;
                        while (i15 < 2) {
                            float fDp2 = AndroidUtilities.dp(25.909092f);
                            if (i15 != 0 && groupCallActivity2.prevState != null) {
                                if (!groupCallActivity2.isRtmpStream()) {
                                    paint2.setShader(groupCallActivity2.prevState.shader);
                                }
                                f2 = 1.0f - groupCallActivity2.switchProgress;
                                if (groupCallActivity2.prevState.currentState == 3) {
                                    iDp = AndroidUtilities.dp(2.0f);
                                    fDp2 -= f2 * iDp;
                                    f3 = f2;
                                    if (paint2.getShader() != null) {
                                    }
                                    if (groupCallActivity2.isRtmpStream()) {
                                        int color = Theme.getColor(null, Theme.key_voipgroup_rtmpButton, false);
                                        int i24 = Theme.key_voipgroup_disabledButton;
                                        int offsetColor = AndroidUtilities.getOffsetColor(color, Theme.getColor(null, i24, false), groupCallActivity2.colorProgress, 1.0f);
                                        paint2.setColor(offsetColor);
                                        paint2.setShader(null);
                                        int i25 = Theme.key_voipgroup_listViewBackgroundUnscrolled;
                                        voIPToggleButton2.setBackgroundColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, i25, false), Theme.getColor(null, i24, false), groupCallActivity2.colorProgress, 1.0f), offsetColor);
                                        voIPToggleButton3.setBackgroundColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, i25, false), Theme.getColor(null, i24, false), groupCallActivity2.colorProgress, 1.0f), offsetColor);
                                    }
                                    measuredWidth = (int) ((voIPToggleButton.getMeasuredWidth() / 2.0f) + voIPToggleButton.getX());
                                    y = (int) (voIPToggleButton.getY() + AndroidUtilities.dp(25.0f));
                                    matrix.setTranslate(measuredWidth, y);
                                    groupCallActivity2.radialGradient.setLocalMatrix(matrix);
                                    paint2.setAlpha((int) (groupCallActivity2.switchToButtonProgress * 76.0f * f3));
                                    canvas.save();
                                    canvas.scale(voIPToggleButton.getScaleX() * 1.0f, voIPToggleButton.getScaleX() * 1.0f, measuredWidth, y);
                                    canvas.save();
                                    float fM = groupCallActivity2.showLightingProgress * SurfaceContainer$$ExternalSyntheticOutline0.m(groupCallActivity2.amplitude, 0.807f, 0.5f, 0.878f);
                                    canvas.scale(fM, fM, measuredWidth, y);
                                    if (i15 != 1) {
                                    }
                                    canvas.restore();
                                    if (groupCallActivity2.isRtmpStream()) {
                                        blobDrawable2 = blobDrawable4;
                                        blobDrawable3 = blobDrawable5;
                                    } else {
                                        blobDrawable2 = blobDrawable4;
                                        blobDrawable3 = blobDrawable5;
                                    }
                                    if (GroupCallActivity.isLandscapeMode) {
                                        if (i15 == 0) {
                                            paint2.setAlpha((int) (groupCallActivity2.switchToButtonInt2 * 255.0f));
                                        } else {
                                            paint2.setAlpha((int) (groupCallActivity2.switchToButtonInt2 * f3 * 255.0f));
                                        }
                                    } else if (i15 == 0) {
                                        paint2.setAlpha(255);
                                    } else {
                                        paint2.setAlpha((int) (f3 * 255.0f));
                                    }
                                    float measuredWidth3 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                                    float fDp3 = AndroidUtilities.dp(24.0f);
                                    float f22 = (fDp2 - measuredWidth3) + measuredWidth3;
                                    float f23 = groupCallActivity2.switchToButtonProgress;
                                    float f24 = f22 * f23;
                                    float f25 = ((fDp2 - fDp3) + fDp3) * f23;
                                    RectF rectF = groupCallActivity2.rect;
                                    f = interpolation;
                                    float f26 = measuredWidth + f24;
                                    blobDrawable = blobDrawable3;
                                    rectF.set(measuredWidth - f24, y - f25, f26, y + f25);
                                    fDp = (fDp2 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                                    paint2.setAlpha((int) (groupCallActivity2.switchToButtonProgress * paint2.getAlpha()));
                                    canvas.drawRoundRect(rectF, fDp, fDp, paint2);
                                    if (i15 == 1) {
                                        f4 = 4.0f;
                                        if (groupCallActivity2.currentState.currentState == 3) {
                                            if (groupCallActivity2.isRtmpStream()) {
                                                radialProgressView2 = radialProgressView;
                                                radialProgressView2.setSize((int) ((fDp * 2.0f) - AndroidUtilities.dp(4.0f)));
                                            } else {
                                                radialProgressView2 = radialProgressView;
                                            }
                                            radialProgressView2.draw(canvas, measuredWidth, y);
                                        } else {
                                            radialProgressView2 = radialProgressView;
                                        }
                                    } else {
                                        radialProgressView2 = radialProgressView;
                                        f4 = 4.0f;
                                    }
                                    canvas.restore();
                                    anonymousClass42 = groupCallActivity2.scheduleButtonTextView;
                                    if (anonymousClass42 == null) {
                                    }
                                } else {
                                    f3 = f2;
                                    if (paint2.getShader() != null) {
                                    }
                                    if (groupCallActivity2.isRtmpStream()) {
                                        int color2 = Theme.getColor(null, Theme.key_voipgroup_rtmpButton, false);
                                        int i26 = Theme.key_voipgroup_disabledButton;
                                        int offsetColor2 = AndroidUtilities.getOffsetColor(color2, Theme.getColor(null, i26, false), groupCallActivity2.colorProgress, 1.0f);
                                        paint2.setColor(offsetColor2);
                                        paint2.setShader(null);
                                        int i27 = Theme.key_voipgroup_listViewBackgroundUnscrolled;
                                        voIPToggleButton2.setBackgroundColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, i27, false), Theme.getColor(null, i26, false), groupCallActivity2.colorProgress, 1.0f), offsetColor2);
                                        voIPToggleButton3.setBackgroundColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, i27, false), Theme.getColor(null, i26, false), groupCallActivity2.colorProgress, 1.0f), offsetColor2);
                                    }
                                    measuredWidth = (int) ((voIPToggleButton.getMeasuredWidth() / 2.0f) + voIPToggleButton.getX());
                                    y = (int) (voIPToggleButton.getY() + AndroidUtilities.dp(25.0f));
                                    matrix.setTranslate(measuredWidth, y);
                                    groupCallActivity2.radialGradient.setLocalMatrix(matrix);
                                    paint2.setAlpha((int) (groupCallActivity2.switchToButtonProgress * 76.0f * f3));
                                    canvas.save();
                                    canvas.scale(voIPToggleButton.getScaleX() * 1.0f, voIPToggleButton.getScaleX() * 1.0f, measuredWidth, y);
                                    canvas.save();
                                    float fM2 = groupCallActivity2.showLightingProgress * SurfaceContainer$$ExternalSyntheticOutline0.m(groupCallActivity2.amplitude, 0.807f, 0.5f, 0.878f);
                                    canvas.scale(fM2, fM2, measuredWidth, y);
                                    if (i15 != 1) {
                                    }
                                    canvas.restore();
                                    if (groupCallActivity2.isRtmpStream()) {
                                        blobDrawable2 = blobDrawable4;
                                        blobDrawable3 = blobDrawable5;
                                    } else {
                                        blobDrawable2 = blobDrawable4;
                                        blobDrawable3 = blobDrawable5;
                                    }
                                    if (GroupCallActivity.isLandscapeMode) {
                                        if (i15 == 0) {
                                            paint2.setAlpha((int) (groupCallActivity2.switchToButtonInt2 * 255.0f));
                                        } else {
                                            paint2.setAlpha((int) (groupCallActivity2.switchToButtonInt2 * f3 * 255.0f));
                                        }
                                    } else if (i15 == 0) {
                                        paint2.setAlpha(255);
                                    } else {
                                        paint2.setAlpha((int) (f3 * 255.0f));
                                    }
                                    float measuredWidth4 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                                    float fDp4 = AndroidUtilities.dp(24.0f);
                                    float f27 = (fDp2 - measuredWidth4) + measuredWidth4;
                                    float f28 = groupCallActivity2.switchToButtonProgress;
                                    float f29 = f27 * f28;
                                    float f210 = ((fDp2 - fDp4) + fDp4) * f28;
                                    RectF rectF2 = groupCallActivity2.rect;
                                    f = interpolation;
                                    float f211 = measuredWidth + f29;
                                    blobDrawable = blobDrawable3;
                                    rectF2.set(measuredWidth - f29, y - f210, f211, y + f210);
                                    fDp = (fDp2 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                                    paint2.setAlpha((int) (groupCallActivity2.switchToButtonProgress * paint2.getAlpha()));
                                    canvas.drawRoundRect(rectF2, fDp, fDp, paint2);
                                    if (i15 == 1) {
                                        f4 = 4.0f;
                                        if (groupCallActivity2.currentState.currentState == 3) {
                                            if (groupCallActivity2.isRtmpStream()) {
                                                radialProgressView2 = radialProgressView;
                                                radialProgressView2.setSize((int) ((fDp * 2.0f) - AndroidUtilities.dp(4.0f)));
                                            } else {
                                                radialProgressView2 = radialProgressView;
                                            }
                                            radialProgressView2.draw(canvas, measuredWidth, y);
                                        } else {
                                            radialProgressView2 = radialProgressView;
                                        }
                                    } else {
                                        radialProgressView2 = radialProgressView;
                                        f4 = 4.0f;
                                    }
                                    canvas.restore();
                                    anonymousClass42 = groupCallActivity2.scheduleButtonTextView;
                                    if (anonymousClass42 == null) {
                                    }
                                }
                            } else if (i15 == 1 || groupCallActivity2.currentState == null) {
                                f = interpolation;
                                blobDrawable = blobDrawable5;
                                voIPToggleButton = voIPToggleButton;
                                radialProgressView2 = radialProgressView;
                                blobDrawable2 = blobDrawable4;
                            } else {
                                if (!groupCallActivity2.isRtmpStream()) {
                                    paint2.setShader(groupCallActivity2.currentState.shader);
                                }
                                f2 = groupCallActivity2.switchProgress;
                                if (groupCallActivity2.currentState.currentState == 3) {
                                    iDp = AndroidUtilities.dp(2.0f);
                                    fDp2 -= f2 * iDp;
                                    f3 = f2;
                                    if (paint2.getShader() != null && !groupCallActivity2.isRtmpStream()) {
                                        paint2.setColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_listViewBackgroundUnscrolled, false), Theme.getColor(null, Theme.key_voipgroup_disabledButton, false), groupCallActivity2.colorProgress, 1.0f));
                                    }
                                    if (groupCallActivity2.isRtmpStream()) {
                                        int color3 = Theme.getColor(null, Theme.key_voipgroup_rtmpButton, false);
                                        int i28 = Theme.key_voipgroup_disabledButton;
                                        int offsetColor3 = AndroidUtilities.getOffsetColor(color3, Theme.getColor(null, i28, false), groupCallActivity2.colorProgress, 1.0f);
                                        paint2.setColor(offsetColor3);
                                        paint2.setShader(null);
                                        int i29 = Theme.key_voipgroup_listViewBackgroundUnscrolled;
                                        voIPToggleButton2.setBackgroundColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, i29, false), Theme.getColor(null, i28, false), groupCallActivity2.colorProgress, 1.0f), offsetColor3);
                                        voIPToggleButton3.setBackgroundColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, i29, false), Theme.getColor(null, i28, false), groupCallActivity2.colorProgress, 1.0f), offsetColor3);
                                    }
                                    measuredWidth = (int) ((voIPToggleButton.getMeasuredWidth() / 2.0f) + voIPToggleButton.getX());
                                    y = (int) (voIPToggleButton.getY() + AndroidUtilities.dp(25.0f));
                                    matrix.setTranslate(measuredWidth, y);
                                    groupCallActivity2.radialGradient.setLocalMatrix(matrix);
                                    paint2.setAlpha((int) (groupCallActivity2.switchToButtonProgress * 76.0f * f3));
                                    canvas.save();
                                    canvas.scale(voIPToggleButton.getScaleX() * 1.0f, voIPToggleButton.getScaleX() * 1.0f, measuredWidth, y);
                                    canvas.save();
                                    float fM3 = groupCallActivity2.showLightingProgress * SurfaceContainer$$ExternalSyntheticOutline0.m(groupCallActivity2.amplitude, 0.807f, 0.5f, 0.878f);
                                    canvas.scale(fM3, fM3, measuredWidth, y);
                                    if (i15 != 1 && !groupCallActivity2.isRtmpStream() && LiteMode.isEnabled(512)) {
                                        canvas.save();
                                        canvas.scale(1.2f, 1.2f, measuredWidth, y);
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) ((1.0f - groupCallActivity2.animatorHideButtons.floatValue) * groupCallActivity2.switchToButtonProgress * alpha));
                                        canvas.drawCircle(measuredWidth, y, AndroidUtilities.dp(160.0f), paint);
                                        paint.setAlpha(alpha);
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                    if (groupCallActivity2.isRtmpStream() || groupCallActivity2.switchToButtonProgress <= 0.0f) {
                                        blobDrawable2 = blobDrawable4;
                                        blobDrawable3 = blobDrawable5;
                                    } else {
                                        canvas.save();
                                        float fM4 = SurfaceContainer$$ExternalSyntheticOutline0.m(groupCallActivity2.amplitude, 0.807f, interpolation, 0.878f);
                                        canvas.scale(fM4, fM4, measuredWidth, y);
                                        blobDrawable3 = blobDrawable5;
                                        blobDrawable3.draw(measuredWidth, y, canvas, paint2);
                                        canvas.restore();
                                        canvas.save();
                                        float fM5 = SurfaceContainer$$ExternalSyntheticOutline0.m(groupCallActivity2.amplitude, 0.704f, interpolation, 0.926f);
                                        canvas.scale(fM5, fM5, measuredWidth, y);
                                        blobDrawable2 = blobDrawable4;
                                        blobDrawable2.draw(measuredWidth, y, canvas, paint2);
                                        canvas.restore();
                                    }
                                    if (GroupCallActivity.isLandscapeMode) {
                                        if (i15 == 0) {
                                            paint2.setAlpha((int) (groupCallActivity2.switchToButtonInt2 * 255.0f));
                                        } else {
                                            paint2.setAlpha((int) (groupCallActivity2.switchToButtonInt2 * f3 * 255.0f));
                                        }
                                    } else if (i15 == 0) {
                                        paint2.setAlpha(255);
                                    } else {
                                        paint2.setAlpha((int) (f3 * 255.0f));
                                    }
                                    float measuredWidth5 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                                    float fDp5 = AndroidUtilities.dp(24.0f);
                                    float f212 = (fDp2 - measuredWidth5) + measuredWidth5;
                                    float f213 = groupCallActivity2.switchToButtonProgress;
                                    float f214 = f212 * f213;
                                    float f215 = ((fDp2 - fDp5) + fDp5) * f213;
                                    RectF rectF3 = groupCallActivity2.rect;
                                    f = interpolation;
                                    float f216 = measuredWidth + f214;
                                    blobDrawable = blobDrawable3;
                                    rectF3.set(measuredWidth - f214, y - f215, f216, y + f215);
                                    fDp = (fDp2 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                                    paint2.setAlpha((int) (groupCallActivity2.switchToButtonProgress * paint2.getAlpha()));
                                    canvas.drawRoundRect(rectF3, fDp, fDp, paint2);
                                    if (i15 == 1) {
                                        f4 = 4.0f;
                                        if (groupCallActivity2.currentState.currentState == 3) {
                                            if (groupCallActivity2.isRtmpStream()) {
                                                radialProgressView2 = radialProgressView;
                                                radialProgressView2.setSize((int) ((fDp * 2.0f) - AndroidUtilities.dp(4.0f)));
                                            } else {
                                                radialProgressView2 = radialProgressView;
                                            }
                                            radialProgressView2.draw(canvas, measuredWidth, y);
                                        } else {
                                            radialProgressView2 = radialProgressView;
                                        }
                                    } else {
                                        radialProgressView2 = radialProgressView;
                                        f4 = 4.0f;
                                    }
                                    canvas.restore();
                                    anonymousClass42 = groupCallActivity2.scheduleButtonTextView;
                                    if (anonymousClass42 == null && anonymousClass42.getVisibility() == 0) {
                                        paint2.setAlpha((int) (anonymousClass42.getAlpha() * 255.0f));
                                        float x = anonymousClass42.getX() - getX();
                                        float y2 = anonymousClass42.getY() - getY();
                                        rectF3.set(x, y2, anonymousClass42.getMeasuredWidth() + x, anonymousClass42.getMeasuredHeight() + y2);
                                        canvas.save();
                                        canvas.scale(anonymousClass42.getScaleX(), anonymousClass42.getScaleY(), rectF3.centerX(), rectF3.centerY());
                                        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(f4), AndroidUtilities.dp(f4), paint2);
                                        canvas.restore();
                                    }
                                } else {
                                    f3 = f2;
                                    if (paint2.getShader() != null) {
                                    }
                                    if (groupCallActivity2.isRtmpStream()) {
                                        int color4 = Theme.getColor(null, Theme.key_voipgroup_rtmpButton, false);
                                        int i210 = Theme.key_voipgroup_disabledButton;
                                        int offsetColor4 = AndroidUtilities.getOffsetColor(color4, Theme.getColor(null, i210, false), groupCallActivity2.colorProgress, 1.0f);
                                        paint2.setColor(offsetColor4);
                                        paint2.setShader(null);
                                        int i211 = Theme.key_voipgroup_listViewBackgroundUnscrolled;
                                        voIPToggleButton2.setBackgroundColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, i211, false), Theme.getColor(null, i210, false), groupCallActivity2.colorProgress, 1.0f), offsetColor4);
                                        voIPToggleButton3.setBackgroundColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, i211, false), Theme.getColor(null, i210, false), groupCallActivity2.colorProgress, 1.0f), offsetColor4);
                                    }
                                    measuredWidth = (int) ((voIPToggleButton.getMeasuredWidth() / 2.0f) + voIPToggleButton.getX());
                                    y = (int) (voIPToggleButton.getY() + AndroidUtilities.dp(25.0f));
                                    matrix.setTranslate(measuredWidth, y);
                                    groupCallActivity2.radialGradient.setLocalMatrix(matrix);
                                    paint2.setAlpha((int) (groupCallActivity2.switchToButtonProgress * 76.0f * f3));
                                    canvas.save();
                                    canvas.scale(voIPToggleButton.getScaleX() * 1.0f, voIPToggleButton.getScaleX() * 1.0f, measuredWidth, y);
                                    canvas.save();
                                    float fM6 = groupCallActivity2.showLightingProgress * SurfaceContainer$$ExternalSyntheticOutline0.m(groupCallActivity2.amplitude, 0.807f, 0.5f, 0.878f);
                                    canvas.scale(fM6, fM6, measuredWidth, y);
                                    if (i15 != 1) {
                                    }
                                    canvas.restore();
                                    if (groupCallActivity2.isRtmpStream()) {
                                        blobDrawable2 = blobDrawable4;
                                        blobDrawable3 = blobDrawable5;
                                    } else {
                                        blobDrawable2 = blobDrawable4;
                                        blobDrawable3 = blobDrawable5;
                                    }
                                    if (GroupCallActivity.isLandscapeMode) {
                                        if (i15 == 0) {
                                            paint2.setAlpha((int) (groupCallActivity2.switchToButtonInt2 * 255.0f));
                                        } else {
                                            paint2.setAlpha((int) (groupCallActivity2.switchToButtonInt2 * f3 * 255.0f));
                                        }
                                    } else if (i15 == 0) {
                                        paint2.setAlpha(255);
                                    } else {
                                        paint2.setAlpha((int) (f3 * 255.0f));
                                    }
                                    float measuredWidth6 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                                    float fDp6 = AndroidUtilities.dp(24.0f);
                                    float f217 = (fDp2 - measuredWidth6) + measuredWidth6;
                                    float f218 = groupCallActivity2.switchToButtonProgress;
                                    float f219 = f217 * f218;
                                    float f2110 = ((fDp2 - fDp6) + fDp6) * f218;
                                    RectF rectF4 = groupCallActivity2.rect;
                                    f = interpolation;
                                    float f2111 = measuredWidth + f219;
                                    blobDrawable = blobDrawable3;
                                    rectF4.set(measuredWidth - f219, y - f2110, f2111, y + f2110);
                                    fDp = (fDp2 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                                    paint2.setAlpha((int) (groupCallActivity2.switchToButtonProgress * paint2.getAlpha()));
                                    canvas.drawRoundRect(rectF4, fDp, fDp, paint2);
                                    if (i15 == 1) {
                                        f4 = 4.0f;
                                        if (groupCallActivity2.currentState.currentState == 3) {
                                            if (groupCallActivity2.isRtmpStream()) {
                                                radialProgressView2 = radialProgressView;
                                                radialProgressView2.setSize((int) ((fDp * 2.0f) - AndroidUtilities.dp(4.0f)));
                                            } else {
                                                radialProgressView2 = radialProgressView;
                                            }
                                            radialProgressView2.draw(canvas, measuredWidth, y);
                                        } else {
                                            radialProgressView2 = radialProgressView;
                                        }
                                    } else {
                                        radialProgressView2 = radialProgressView;
                                        f4 = 4.0f;
                                    }
                                    canvas.restore();
                                    anonymousClass42 = groupCallActivity2.scheduleButtonTextView;
                                    if (anonymousClass42 == null) {
                                    }
                                }
                            }
                            i15++;
                            blobDrawable4 = blobDrawable2;
                            radialProgressView = radialProgressView2;
                            voIPToggleButton = voIPToggleButton;
                            blobDrawable5 = blobDrawable;
                            interpolation = f;
                        }
                    } else {
                        if (i16 == 3) {
                            f6 = groupCallActivity2.switchProgress;
                            paint2.setShader(groupCallActivity2.prevState.shader);
                            f5 = 1.0f;
                        } else {
                            f5 = 1.0f;
                            f6 = 1.0f - groupCallActivity2.switchProgress;
                            paint2.setShader(weavingState3.shader);
                        }
                        Paint paint3 = groupCallActivity2.paintTmp;
                        paint3.setColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_listViewBackgroundUnscrolled, false), Theme.getColor(null, Theme.key_voipgroup_disabledButton, false), groupCallActivity2.colorProgress, f5));
                        float measuredWidth7 = (int) ((voIPToggleButton.getMeasuredWidth() / 2.0f) + voIPToggleButton.getX());
                        float y3 = (int) (voIPToggleButton.getY() + AndroidUtilities.dp(25.0f));
                        matrix.setTranslate(measuredWidth7, y3);
                        groupCallActivity2.radialGradient.setLocalMatrix(matrix);
                        paint2.setAlpha(76);
                        canvas.save();
                        canvas.scale(voIPToggleButton.getScaleX() * 1.0f, voIPToggleButton.getScaleY() * 1.0f, measuredWidth7, y3);
                        canvas.save();
                        float fM7 = SurfaceContainer$$ExternalSyntheticOutline0.m(groupCallActivity2.amplitude, 0.807f, 0.5f, 0.878f) * groupCallActivity2.showLightingProgress;
                        canvas.scale(fM7, fM7, measuredWidth7, y3);
                        canvas.save();
                        canvas.scale(1.2f, 1.2f, measuredWidth7, y3);
                        canvas.drawCircle(measuredWidth7, y3, AndroidUtilities.dp(160.0f), paint);
                        canvas.restore();
                        canvas.restore();
                        if (groupCallActivity2.call != null) {
                            canvas.save();
                            float fM8 = AndroidUtilities$$ExternalSyntheticOutline0.m(groupCallActivity2.amplitude, 0.807f, 0.878f, interpolation);
                            canvas.scale(fM8, fM8, measuredWidth7, y3);
                            blobDrawable5.draw(measuredWidth7, y3, canvas, paint2);
                            canvas.restore();
                            canvas.save();
                            float fM9 = AndroidUtilities$$ExternalSyntheticOutline0.m(groupCallActivity2.amplitude, 0.704f, 0.926f, interpolation);
                            canvas.scale(fM9, fM9, measuredWidth7, y3);
                            blobDrawable4.draw(measuredWidth7, y3, canvas, paint2);
                            canvas.restore();
                        }
                        paint2.setAlpha(255);
                        if (z3) {
                            canvas.drawCircle(measuredWidth7, y3, AndroidUtilities.dp(25.909092f), paint2);
                            paint2.setColor(Theme.getColor(null, Theme.key_voipgroup_connectingProgress, false));
                            if (f6 != 0.0f) {
                                paint2.setAlpha((int) (f6 * 255.0f));
                                paint2.setShader(null);
                                canvas.drawCircle(measuredWidth7, y3, AndroidUtilities.dp(25.909092f), paint2);
                            }
                        }
                        canvas.drawCircle(measuredWidth7, y3, AndroidUtilities.dp(25.0f) * f6, paint3);
                        if (!z3) {
                            radialProgressView3.draw(canvas, measuredWidth7, y3);
                        }
                        canvas.restore();
                    }
                    super.dispatchDraw(canvas);
                    if (groupCallActivity2.renderersContainer.fullscreenAnimator != null) {
                        return;
                    }
                    invalidate();
                }
                if (weavingState10 != null && (weavingState = groupCallActivity2.currentState) != null && weavingState.currentState == 3) {
                    radialProgressView3.toCircle = true;
                    radialProgressView3.toCircleProgress = 1.0f;
                }
                z3 = true;
                VoIPToggleButton voIPToggleButton5 = groupCallActivity2.soundButton;
                VoIPToggleButton voIPToggleButton6 = groupCallActivity2.messageButton;
                Paint paint4 = groupCallActivity2.radialPaint;
                if (z3) {
                    f7 = groupCallActivity2.switchProgress;
                    if (f7 != 1.0f) {
                        weavingState7 = groupCallActivity2.prevState;
                        if (weavingState7 == null) {
                            groupCallActivity2.switchProgress = (j2 / 180.0f) + f7;
                        } else {
                            groupCallActivity2.switchProgress = (j2 / 180.0f) + f7;
                        }
                        if (groupCallActivity2.switchProgress >= 1.0f) {
                            groupCallActivity2.switchProgress = 1.0f;
                            groupCallActivity2.prevState = null;
                            weavingState8 = groupCallActivity2.currentState;
                            if (weavingState8 != null) {
                                radialProgressView3.toCircle = false;
                            }
                        }
                        groupCallActivity2.invalidateColors = true;
                    }
                    if (groupCallActivity2.invalidateColors) {
                        z3 = z3;
                        radialProgressView3 = radialProgressView3;
                        f8 = 1.0f;
                    } else {
                        z3 = z3;
                        radialProgressView3 = radialProgressView3;
                        f8 = 1.0f;
                    }
                    weavingState4 = groupCallActivity2.currentState;
                    if (weavingState4 != null) {
                        i18 = weavingState4.currentState;
                        if (i18 != 1) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        i17 = 3;
                        if (groupCallActivity2.currentState.currentState != 3) {
                            z5 = z6;
                            z4 = true;
                        } else {
                            z5 = z6;
                            z4 = false;
                        }
                    } else {
                        i17 = 3;
                        z4 = false;
                        z5 = false;
                    }
                    if (groupCallActivity2.prevState == null) {
                        if (z5) {
                            f11 = groupCallActivity2.showWavesProgress;
                            if (f11 != f8) {
                                f12 = (j2 / 350.0f) + f11;
                                groupCallActivity2.showWavesProgress = f12;
                                if (f12 > f8) {
                                    groupCallActivity2.showWavesProgress = 1.0f;
                                }
                            } else if (!z5) {
                                f9 = groupCallActivity2.showWavesProgress;
                                if (f9 != 0.0f) {
                                    f10 = f9 - (j2 / 350.0f);
                                    groupCallActivity2.showWavesProgress = f10;
                                    if (f10 < 0.0f) {
                                        groupCallActivity2.showWavesProgress = 0.0f;
                                    }
                                }
                            }
                        } else if (!z5) {
                            f9 = groupCallActivity2.showWavesProgress;
                            if (f9 != 0.0f) {
                                f10 = f9 - (j2 / 350.0f);
                                groupCallActivity2.showWavesProgress = f10;
                                if (f10 < 0.0f) {
                                    groupCallActivity2.showWavesProgress = 0.0f;
                                }
                            }
                        }
                    } else if (z5) {
                        f11 = groupCallActivity2.showWavesProgress;
                        if (f11 != f8) {
                            f12 = (j2 / 350.0f) + f11;
                            groupCallActivity2.showWavesProgress = f12;
                            if (f12 > f8) {
                                groupCallActivity2.showWavesProgress = 1.0f;
                            }
                        } else if (!z5) {
                            f9 = groupCallActivity2.showWavesProgress;
                            if (f9 != 0.0f) {
                                f10 = f9 - (j2 / 350.0f);
                                groupCallActivity2.showWavesProgress = f10;
                                if (f10 < 0.0f) {
                                    groupCallActivity2.showWavesProgress = 0.0f;
                                }
                            }
                        }
                    } else if (!z5) {
                        f9 = groupCallActivity2.showWavesProgress;
                        if (f9 != 0.0f) {
                            f10 = f9 - (j2 / 350.0f);
                            groupCallActivity2.showWavesProgress = f10;
                            if (f10 < 0.0f) {
                                groupCallActivity2.showWavesProgress = 0.0f;
                            }
                        }
                    }
                    if (z4) {
                        f15 = groupCallActivity2.showLightingProgress;
                        if (f15 != 1.0f) {
                            f16 = (j2 / 350.0f) + f15;
                            groupCallActivity2.showLightingProgress = f16;
                            if (f16 > 1.0f) {
                                groupCallActivity2.showLightingProgress = 1.0f;
                            }
                        } else if (!z4) {
                            f13 = groupCallActivity2.showLightingProgress;
                            if (f13 != 0.0f) {
                                f14 = f13 - (j2 / 350.0f);
                                groupCallActivity2.showLightingProgress = f14;
                                if (f14 < 0.0f) {
                                    groupCallActivity2.showLightingProgress = 0.0f;
                                }
                            }
                        }
                    } else if (!z4) {
                        f13 = groupCallActivity2.showLightingProgress;
                        if (f13 != 0.0f) {
                            f14 = f13 - (j2 / 350.0f);
                            groupCallActivity2.showLightingProgress = f14;
                            if (f14 < 0.0f) {
                                groupCallActivity2.showLightingProgress = 0.0f;
                            }
                        }
                    }
                } else {
                    z3 = z3;
                    radialProgressView3 = radialProgressView3;
                }
                interpolation = (this.overshootInterpolator.getInterpolation(groupCallActivity2.showWavesProgress) * 0.6f) + 0.4f;
                blobDrawable5.update(groupCallActivity2.amplitude, 1.0f);
                blobDrawable4.update(groupCallActivity2.amplitude, 1.0f);
                weavingState2 = groupCallActivity2.prevState;
                Matrix matrix2 = groupCallActivity2.radialMatrix;
                voIPToggleButton = groupCallActivity2.muteButton;
                Paint paint5 = groupCallActivity2.paint;
                if (weavingState2 != null) {
                    radialProgressView = radialProgressView3;
                    i15 = 0;
                    while (i15 < 2) {
                        float fDp7 = AndroidUtilities.dp(25.909092f);
                        if (i15 != 0) {
                            if (i15 == 1) {
                            }
                            f = interpolation;
                            blobDrawable = blobDrawable5;
                            voIPToggleButton = voIPToggleButton;
                            radialProgressView2 = radialProgressView;
                            blobDrawable2 = blobDrawable4;
                        } else {
                            if (i15 == 1) {
                            }
                            f = interpolation;
                            blobDrawable = blobDrawable5;
                            voIPToggleButton = voIPToggleButton;
                            radialProgressView2 = radialProgressView;
                            blobDrawable2 = blobDrawable4;
                        }
                        i15++;
                        blobDrawable4 = blobDrawable2;
                        radialProgressView = radialProgressView2;
                        voIPToggleButton = voIPToggleButton;
                        blobDrawable5 = blobDrawable;
                        interpolation = f;
                    }
                } else {
                    radialProgressView = radialProgressView3;
                    i15 = 0;
                    while (i15 < 2) {
                        float fDp8 = AndroidUtilities.dp(25.909092f);
                        if (i15 != 0) {
                            if (i15 == 1) {
                            }
                            f = interpolation;
                            blobDrawable = blobDrawable5;
                            voIPToggleButton = voIPToggleButton;
                            radialProgressView2 = radialProgressView;
                            blobDrawable2 = blobDrawable4;
                        } else {
                            if (i15 == 1) {
                            }
                            f = interpolation;
                            blobDrawable = blobDrawable5;
                            voIPToggleButton = voIPToggleButton;
                            radialProgressView2 = radialProgressView;
                            blobDrawable2 = blobDrawable4;
                        }
                        i15++;
                        blobDrawable4 = blobDrawable2;
                        radialProgressView = radialProgressView2;
                        voIPToggleButton = voIPToggleButton;
                        blobDrawable5 = blobDrawable;
                        interpolation = f;
                    }
                }
                super.dispatchDraw(canvas);
                if (groupCallActivity2.renderersContainer.fullscreenAnimator != null) {
                    return;
                }
                invalidate();
            }
        };
        this.buttonsContainer = r3;
        int color = Theme.getColor(Theme.key_voipgroup_unmuteButton2);
        int iRed = Color.red(color);
        int iGreen = Color.green(color);
        int iBlue = Color.blue(color);
        this.radialMatrix = new Matrix();
        this.radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, iRed, iGreen, iBlue), Color.argb(0, iRed, iGreen, iBlue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.radialPaint = paint;
        paint.setShader(this.radialGradient);
        BlobDrawable blobDrawable = new BlobDrawable(9);
        this.tinyWaveDrawable = blobDrawable;
        BlobDrawable blobDrawable2 = new BlobDrawable(12);
        this.bigWaveDrawable = blobDrawable2;
        blobDrawable.minRadius = AndroidUtilities.dp(62.0f) * 0.45454547f;
        blobDrawable.maxRadius = AndroidUtilities.dp(72.0f) * 0.45454547f;
        blobDrawable.generateBlob();
        blobDrawable2.minRadius = AndroidUtilities.dp(65.0f) * 0.45454547f;
        blobDrawable2.maxRadius = AndroidUtilities.dp(75.0f) * 0.45454547f;
        blobDrawable2.generateBlob();
        Paint paint2 = blobDrawable.paint;
        int i15 = Theme.key_voipgroup_unmuteButton;
        paint2.setColor(ColorUtils.setAlphaComponent(Theme.getColor(i15), 38));
        blobDrawable2.paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(i15), 76));
        VoIPToggleButton voIPToggleButton = new VoIPToggleButton(launchActivity, 50.0f);
        this.soundButton = voIPToggleButton;
        voIPToggleButton.setCheckable(true);
        voIPToggleButton.setTextSize(12);
        r3.addButton(voIPToggleButton);
        voIPToggleButton.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda9(this, 9));
        VoIPToggleButton voIPToggleButton2 = new VoIPToggleButton(launchActivity, 50.0f);
        this.cameraButton = voIPToggleButton2;
        voIPToggleButton2.setCheckable(true);
        voIPToggleButton2.setTextSize(12);
        voIPToggleButton2.showText(false, false);
        voIPToggleButton2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        voIPToggleButton2.setData(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        VoIPToggleButton voIPToggleButton3 = new VoIPToggleButton(launchActivity, 50.0f);
        this.flipButton = voIPToggleButton3;
        voIPToggleButton3.setCheckable(true);
        voIPToggleButton3.setTextSize(12);
        voIPToggleButton3.showText(false, false);
        RLottieImageView rLottieImageView = new RLottieImageView(launchActivity);
        voIPToggleButton3.addView(rLottieImageView, LayoutHelper.createFrame(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        int i16 = R.raw.camera_flip;
        RLottieDrawable rLottieDrawable2 = new RLottieDrawable(i16, SurfaceContainer$$ExternalSyntheticOutline0.m(i16, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.flipIcon = rLottieDrawable2;
        rLottieImageView.setAnimation(rLottieDrawable2);
        voIPToggleButton3.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda9(this, 0));
        r3.addButton(voIPToggleButton3);
        VoIPToggleButton voIPToggleButton4 = new VoIPToggleButton(launchActivity, 50.0f);
        this.speakerButton = voIPToggleButton4;
        voIPToggleButton4.setCheckable(true);
        voIPToggleButton4.setTextSize(12);
        voIPToggleButton4.showText(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.speakerImageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i17 = R.drawable.filled_sound_on;
        this.speakerIcon = i17;
        imageView.setImageResource(i17);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        voIPToggleButton4.addView(imageView, LayoutHelper.createFrame(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        voIPToggleButton4.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda9(this, 1));
        r3.addButton(voIPToggleButton4);
        r3.addButton(voIPToggleButton2);
        VoIPToggleButton voIPToggleButton5 = new VoIPToggleButton(launchActivity, 50.0f);
        this.leaveButton = voIPToggleButton5;
        voIPToggleButton5.setTextSize(12);
        voIPToggleButton5.setData(R.drawable.calls_decline, -1, Theme.getColor(Theme.key_voipgroup_leaveButton), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i18 = 0;
        voIPToggleButton5.setOnClickListener(new View.OnClickListener(this) {
            public final GroupCallActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        GroupCallActivity groupCallActivity2 = this.f$0;
                        GroupCallActivity.AnonymousClass28 anonymousClass29 = groupCallActivity2.renderersContainer;
                        boolean z3 = anonymousClass29.hideUiRunnableIsScheduled;
                        LaunchActivity.AnonymousClass18 anonymousClass18 = anonymousClass29.hideUiRunnable;
                        if (z3) {
                            AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
                        }
                        AndroidUtilities.runOnUIThread(anonymousClass18, 3000L);
                        anonymousClass29.hideUiRunnableIsScheduled = true;
                        ChatObject.Call call2 = groupCallActivity2.call;
                        if (call2 == null || call2.isScheduled()) {
                            groupCallActivity2.lambda$showGiftOfferSheet$15();
                        } else {
                            groupCallActivity2.updateItems$1$1();
                            GroupCallActivity.onLeaveClick(launchActivity, new GroupCallActivity$$ExternalSyntheticLambda8(groupCallActivity2, 7), false, false);
                        }
                        break;
                    default:
                        this.f$0.lambda$new$50(launchActivity);
                        break;
                }
            }
        });
        VoIPToggleButton voIPToggleButton6 = new VoIPToggleButton(launchActivity, 50.0f);
        this.messageButton = voIPToggleButton6;
        voIPToggleButton6.setCheckable(true);
        voIPToggleButton6.setChecked(true, false);
        voIPToggleButton6.setTextSize(12);
        voIPToggleButton6.setData(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipMessage), false, false);
        ?? r9 = new RLottieImageView(launchActivity) {
            @Override
            public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(Button.class.getName());
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                int i19 = groupCallActivity2.muteButtonState;
                accessibilityNodeInfo.setEnabled(i19 == 0 || i19 == 1);
                if (groupCallActivity2.muteButtonState == 1) {
                    accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
                }
            }

            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                if (groupCallActivity2.isRtmpStream()) {
                    return super.onTouchEvent(motionEvent);
                }
                int action = motionEvent.getAction();
                GroupCallActivity$$ExternalSyntheticLambda8 groupCallActivity$$ExternalSyntheticLambda8 = groupCallActivity2.pressRunnable;
                if (action == 0 && groupCallActivity2.muteButtonState == 0 && groupCallActivity2.call != null) {
                    AndroidUtilities.runOnUIThread(groupCallActivity$$ExternalSyntheticLambda8, 300L);
                    groupCallActivity2.scheduled = true;
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (groupCallActivity2.scheduled) {
                        AndroidUtilities.cancelRunOnUIThread(groupCallActivity$$ExternalSyntheticLambda8);
                        groupCallActivity2.scheduled = false;
                    } else if (groupCallActivity2.pressed) {
                        AndroidUtilities.cancelRunOnUIThread(groupCallActivity2.unmuteRunnable);
                        groupCallActivity2.updateMuteButton(0, true);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(true, true, false);
                            try {
                                groupCallActivity2.muteButton.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                        ArrayList arrayList = groupCallActivity2.attachedRenderersTmp;
                        arrayList.clear();
                        arrayList.addAll(groupCallActivity2.attachedRenderers);
                        for (int i19 = 0; i19 < arrayList.size(); i19++) {
                            ((GroupCallMiniTextureView) arrayList.get(i19)).updateAttachState(true);
                        }
                        groupCallActivity2.pressed = false;
                        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                        super.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.muteButtonIcon = r9;
        r9.setAnimation(rLottieDrawable);
        r9.setScaleType(ImageView.ScaleType.CENTER);
        VoIPToggleButton voIPToggleButton7 = new VoIPToggleButton(launchActivity, 50.0f);
        this.muteButton = voIPToggleButton7;
        voIPToggleButton7.setDrawBackground(false);
        voIPToggleButton7.setTextSize(12);
        voIPToggleButton7.setData();
        voIPToggleButton7.addView((View) r9, LayoutHelper.createFrame(50, 50, 49));
        r3.addButton(voIPToggleButton7);
        voIPToggleButton7.setOnClickListener(new AnonymousClass19());
        r3.addButton(voIPToggleButton6);
        r3.addButton(voIPToggleButton5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.expandOrMinimizeButton = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        voIPToggleButton7.addView(imageView2, LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.call != null && isRtmpStream() && !this.call.isScheduled()) {
            imageView2.setVisibility(0);
            r9.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.radialProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(Theme.getColor(Theme.key_voipgroup_connectingProgress));
        anonymousClass5.setAlpha(0.0f);
        anonymousClass5.getBackButton().setScaleX(0.9f);
        anonymousClass5.getBackButton().setScaleY(0.9f);
        anonymousClass5.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        anonymousClass5.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        anonymousClass5.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        anonymousClass5.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(launchActivity, Theme.getColor(i10));
        this.otherItem = actionBarMenuItem;
        actionBarMenuItem.setLongClickEnabled(false);
        actionBarMenuItem.setIcon(R.drawable.ic_ab_other);
        actionBarMenuItem.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        actionBarMenuItem.setSubMenuOpenSide(2);
        actionBarMenuItem.setDelegate(new GroupCallActivity$$ExternalSyntheticLambda12(this, 0));
        int i19 = Theme.key_voipgroup_actionBarItemsSelector;
        actionBarMenuItem.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(i19), 6));
        actionBarMenuItem.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda9(this, 2));
        actionBarMenuItem.setPopupItemsColor(Theme.getColor(i10), false);
        actionBarMenuItem.setPopupItemsColor(Theme.getColor(i10), true);
        ActionBarMenuItem actionBarMenuItem2 = new ActionBarMenuItem(launchActivity, Theme.getColor(i10));
        this.pipItem = actionBarMenuItem2;
        actionBarMenuItem2.setLongClickEnabled(false);
        actionBarMenuItem2.setIcon(R.drawable.msg_voice_pip);
        int i20 = R.string.AccDescrPipMode;
        actionBarMenuItem2.setContentDescription(LocaleController.getString(i20));
        actionBarMenuItem2.setBackground(Theme.createSelectorDrawable(Theme.getColor(i19), 6));
        actionBarMenuItem2.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda9(this, 3));
        ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem(launchActivity, Theme.getColor(i10));
        this.screenShareItem = actionBarMenuItem3;
        actionBarMenuItem3.setLongClickEnabled(false);
        actionBarMenuItem3.setIcon(R.drawable.msg_screencast);
        actionBarMenuItem3.setContentDescription(LocaleController.getString(i20));
        actionBarMenuItem3.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(i19), 6));
        actionBarMenuItem3.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda9(this, 4));
        AnonymousClass20 anonymousClass20 = new AnonymousClass20(launchActivity, launchActivity);
        this.titleTextView = anonymousClass20;
        ?? r6 = new View(launchActivity) {
            @Override
            public final void onMeasure(int i21, int i22) {
                setMeasuredDimension(View.MeasureSpec.getSize(i21), ActionBar.getCurrentActionBarHeight());
            }
        };
        this.actionBarBackground = r6;
        r6.setAlpha(0.0f);
        Paint paint3 = new Paint(1);
        this.liveLabelPaint = paint3;
        paint3.setColor(-12761513);
        ?? r15 = new TextView(getContext()) {
            public final RectF rect = new RectF();

            @Override
            public final void onDraw(Canvas canvas) {
                RectF rectF = this.rect;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), GroupCallActivity.this.liveLabelPaint);
                super.onDraw(canvas);
            }
        };
        this.liveLabelTextView = r15;
        r15.setTextColor(getThemedColor(i10));
        r15.setTextSize(1, 11.0f);
        r15.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        r15.setMaxLines(1);
        r15.setGravity(17);
        r15.setTypeface(AndroidUtilities.bold());
        r15.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        r15.setTag(-1);
        if (!isRtmpStream()) {
            r15.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.titleLayout = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(anonymousClass20, LayoutHelper.createLinear(1.0f, 0, -2));
        linearLayout.addView((View) r15, LayoutHelper.createLinear(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView((View) r6, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(anonymousClass5, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.menuItemsContainer = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(actionBarMenuItem3, LayoutHelper.createLinear(48, 48));
        linearLayout2.addView(actionBarMenuItem2, LayoutHelper.createLinear(48, 48));
        linearLayout2.addView(actionBarMenuItem, LayoutHelper.createLinear(48, 48));
        this.containerView.addView(linearLayout2, LayoutHelper.createFrame(-2, 48, 53));
        View view = new View(launchActivity);
        this.actionBarShadow = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(Theme.getColor(Theme.key_dialogShadowLine));
        this.containerView.addView(view, LayoutHelper.createFrame(1.0f, -1));
        for (int i21 = 0; i21 < 2; i21++) {
            this.undoView[i21] = new UndoView(launchActivity) {
                @Override
                public final void showWithAction(long j, int i22, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
                    if (GroupCallActivity.this.previewDialog != null) {
                        return;
                    }
                    super.showWithAction(j, i22, obj, obj2, runnable, runnable2);
                }
            };
            this.undoView[i21].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.undoView[i21].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.undoView[i21], LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        AccountSelectCell accountSelectCell = new AccountSelectCell(launchActivity, true);
        this.accountSelectCell = accountSelectCell;
        accountSelectCell.setTag(R.id.fit_width_tag, 240);
        this.otherItem.addSubItem(accountSelectCell, AndroidUtilities.dp(48.0f));
        this.otherItem.setShowSubmenuByMove(false);
        int i22 = Theme.key_voipgroup_listSelector;
        accountSelectCell.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(i22), 6, 6));
        ActionBarMenuItem actionBarMenuItem4 = this.otherItem;
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem = actionBarMenuItem4.addSubItem(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, actionBarMenuItem4.resourcesProvider);
        this.everyoneItem = actionBarMenuSubItemAddSubItem;
        if (!actionBarMenuSubItemAddSubItem.top || actionBarMenuSubItemAddSubItem.bottom) {
            actionBarMenuSubItemAddSubItem.top = true;
            actionBarMenuSubItemAddSubItem.bottom = false;
            actionBarMenuSubItemAddSubItem.updateBackground();
        }
        ActionBarMenuItem actionBarMenuItem5 = this.otherItem;
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem2 = actionBarMenuItem5.addSubItem(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, actionBarMenuItem5.resourcesProvider);
        this.adminItem = actionBarMenuSubItemAddSubItem2;
        if (!actionBarMenuSubItemAddSubItem2.top) {
            z2 = true;
            if (!actionBarMenuSubItemAddSubItem2.bottom) {
            }
            int i23 = Theme.key_voipgroup_checkMenu;
            actionBarMenuSubItemAddSubItem.setCheckColor(i23);
            actionBarMenuSubItemAddSubItem.setColors(Theme.getColor(i23), Theme.getColor(i23));
            actionBarMenuSubItemAddSubItem2.setCheckColor(i23);
            actionBarMenuSubItemAddSubItem2.setColors(Theme.getColor(i23), Theme.getColor(i23));
            Paint paint4 = new Paint(1);
            int i24 = Theme.key_voipgroup_actionBarItems;
            paint4.setColor(Theme.getColor(i24));
            paint4.setStyle(Paint.Style.STROKE);
            paint4.setStrokeWidth(AndroidUtilities.dp(1.5f));
            paint4.setStrokeCap(Paint.Cap.ROUND);
            ActionBarMenuItem actionBarMenuItem6 = this.otherItem;
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem3 = actionBarMenuItem6.addSubItem(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, actionBarMenuItem6.resourcesProvider);
            this.soundItem = actionBarMenuSubItemAddSubItem3;
            actionBarMenuSubItemAddSubItem3.setItemHeight(56);
            ActionBarMenuItem actionBarMenuItem7 = this.otherItem;
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem4 = actionBarMenuItem7.addSubItem(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, actionBarMenuItem7.resourcesProvider);
            this.noiseItem = actionBarMenuSubItemAddSubItem4;
            actionBarMenuSubItemAddSubItem4.setItemHeight(56);
            TextView textViewAddDivider = this.otherItem.addDivider(ColorUtils.blendARGB(0.3f, Theme.getColor(Theme.key_voipgroup_actionBar), -16777216));
            this.soundItemDivider = textViewAddDivider;
            ((ViewGroup.MarginLayoutParams) textViewAddDivider.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) textViewAddDivider.getLayoutParams()).bottomMargin = 0;
            ActionBarMenuItem actionBarMenuItem8 = this.otherItem;
            int i25 = R.drawable.msg_edit;
            RecordCallDrawable recordCallDrawable = this.recordCallDrawable;
            if (ChatObject.isChannelOrGiga(this.currentChat)) {
                i = R.string.VoipChannelEditTitle;
            } else {
                i = R.string.VoipGroupEditTitle;
            }
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem5 = actionBarMenuItem8.addSubItem(6, i25, recordCallDrawable, LocaleController.getString(i), true, false, actionBarMenuItem8.resourcesProvider);
            this.editTitleItem = actionBarMenuSubItemAddSubItem5;
            ActionBarMenuItem actionBarMenuItem9 = this.otherItem;
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem6 = actionBarMenuItem9.addSubItem(7, R.drawable.msg_permissions, this.recordCallDrawable, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, actionBarMenuItem9.resourcesProvider);
            this.permissionItem = actionBarMenuSubItemAddSubItem6;
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem7 = this.otherItem.addSubItem(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
            this.inviteItem = actionBarMenuSubItemAddSubItem7;
            RecordCallDrawable recordCallDrawable2 = new RecordCallDrawable();
            this.recordCallDrawable = recordCallDrawable2;
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem8 = this.otherItem.addSubItem(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
            this.screenItem = actionBarMenuSubItemAddSubItem8;
            ActionBarMenuItem actionBarMenuItem10 = this.otherItem;
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem9 = actionBarMenuItem10.addSubItem(5, 0, recordCallDrawable2, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, actionBarMenuItem10.resourcesProvider);
            this.recordItem = actionBarMenuSubItemAddSubItem9;
            recordCallDrawable2.setParentView(actionBarMenuSubItemAddSubItem9.getImageView());
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem10 = this.otherItem.addSubItem(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
            this.enableComments = actionBarMenuSubItemAddSubItem10;
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem11 = this.otherItem.addSubItem(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
            this.disableComments = actionBarMenuSubItemAddSubItem11;
            ActionBarMenuItem actionBarMenuItem11 = this.otherItem;
            int i26 = R.drawable.msg_cancel;
            if (isConference()) {
                i2 = R.string.VoipGroupEndConference;
            } else if (ChatObject.isChannelOrGiga(this.currentChat)) {
                i2 = R.string.VoipChannelEndChat;
            } else {
                i2 = R.string.VoipGroupEndChat;
            }
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem12 = actionBarMenuItem11.addSubItem(4, i26, LocaleController.getString(i2));
            this.leaveItem = actionBarMenuSubItemAddSubItem12;
            this.otherItem.setPopupItemsSelectorColor(Theme.getColor(i22));
            this.otherItem.getPopupLayout().setFitItems(true);
            actionBarMenuSubItemAddSubItem10.setColors(Theme.getColor(i24), Theme.getColor(i24));
            actionBarMenuSubItemAddSubItem11.setColors(Theme.getColor(i24), Theme.getColor(i24));
            actionBarMenuSubItemAddSubItem3.setColors(Theme.getColor(i24), Theme.getColor(i24));
            actionBarMenuSubItemAddSubItem4.setColors(Theme.getColor(i24), Theme.getColor(i24));
            int i27 = Theme.key_voipgroup_leaveCallMenu;
            actionBarMenuSubItemAddSubItem12.setColors(Theme.getColor(i27), Theme.getColor(i27));
            actionBarMenuSubItemAddSubItem7.setColors(Theme.getColor(i24), Theme.getColor(i24));
            actionBarMenuSubItemAddSubItem5.setColors(Theme.getColor(i24), Theme.getColor(i24));
            actionBarMenuSubItemAddSubItem6.setColors(Theme.getColor(i24), Theme.getColor(i24));
            actionBarMenuSubItemAddSubItem9.setColors(Theme.getColor(i24), Theme.getColor(i24));
            actionBarMenuSubItemAddSubItem8.setColors(Theme.getColor(i24), Theme.getColor(i24));
            if (this.call != null) {
                initCreatedGroupCall();
            }
            if (isConference()) {
                this.encryptionDrawable = new CallEncryptionCellDrawable();
                sharedInstance = VoIPService.getSharedInstance();
                CallEncryptionCellDrawable callEncryptionCellDrawable = this.encryptionDrawable;
                if (sharedInstance != null || (conferenceCall = sharedInstance.conference) == null) {
                    emojis = null;
                } else {
                    emojis = conferenceCall.getEmojis();
                }
                callEncryptionCellDrawable.setEmojis(emojis);
            }
            updateTitle$2(false);
            this.actionBar.getTitleTextView().setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda9(this, 5));
            ?? r4 = new RecyclerListView(launchActivity) {
                @Override
                public final boolean drawChild(Canvas canvas, View view2, long j) {
                    GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) view2;
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    if (groupCallActivity2.renderersContainer.fullscreenAnimator == null && !groupCallActivity2.fullscreenListItemAnimator.isRunning()) {
                        groupCallUserCell.setAlpha(1.0f);
                        groupCallUserCell.setTranslationX(0.0f);
                        groupCallUserCell.setTranslationY(0.0f);
                    }
                    AnonymousClass24 anonymousClass24 = groupCallActivity2.fullscreenUsersListView;
                    groupCallUserCell.getClass();
                    anonymousClass24.getClass();
                    if (RecyclerView.getChildAdapterPosition(groupCallUserCell) == -1 && groupCallUserCell.getRenderer() != null) {
                        return true;
                    }
                    if (groupCallUserCell.getTranslationY() == 0.0f || groupCallUserCell.getRenderer() == null || groupCallUserCell.getRenderer().primaryView == null) {
                        return super.drawChild(canvas, view2, j);
                    }
                    float top = groupCallActivity2.listView.getTop() - getTop();
                    float measuredHeight = groupCallActivity2.listView.getMeasuredHeight() + top;
                    float f = groupCallActivity2.renderersContainer.progressToFullscreenMode;
                    canvas.save();
                    float f2 = 1.0f - f;
                    canvas.clipRect(0.0f, top * f2, getMeasuredWidth(), (getMeasuredHeight() * f) + (measuredHeight * f2));
                    boolean zDrawChild = super.drawChild(canvas, view2, j);
                    canvas.restore();
                    return zDrawChild;
                }
            };
            this.fullscreenUsersListView = r4;
            ?? r0 = new DefaultItemAnimator() {
                @Override
                public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    groupCallActivity2.listView.invalidate();
                    groupCallActivity2.renderersContainer.invalidate();
                    ((BottomSheet) groupCallActivity2).containerView.invalidate();
                    GroupCallActivity.access$8700(groupCallActivity2);
                }
            };
            this.fullscreenListItemAnimator = r0;
            final int i28 = 0;
            r4.setClipToPadding(false);
            r0.setDelayAnimations();
            r0.translationInterpolator = CubicBezierInterpolator.DEFAULT;
            r0.mRemoveDuration = 350L;
            r0.mAddDuration = 350L;
            r0.mMoveDuration = 350L;
            r4.setItemAnimator(r0);
            r4.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public final void onScrolled(RecyclerView recyclerView, int i29, int i30) {
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    ((BottomSheet) groupCallActivity2).containerView.invalidate();
                    groupCallActivity2.renderersContainer.invalidate();
                }
            });
            r4.setClipChildren(false);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.setOrientation(0);
            r4.setLayoutManager(linearLayoutManager);
            GroupCallFullscreenAdapter groupCallFullscreenAdapter = new GroupCallFullscreenAdapter(call, this.currentAccount, this);
            this.fullscreenAdapter = groupCallFullscreenAdapter;
            r4.setAdapter(groupCallFullscreenAdapter);
            groupCallFullscreenAdapter.setVisibility(r4, false);
            r4.setOnItemClickListener(new RecyclerListView.OnItemClickListener(this) {
                public final GroupCallActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onItemClick(int i110, View view2) {
                    switch (i28) {
                        case 0:
                            GroupCallActivity groupCallActivity2 = this.f$0;
                            groupCallActivity2.getClass();
                            GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) view2;
                            if (groupCallUserCell.getVideoParticipant() != null) {
                                groupCallActivity2.fullscreenFor(groupCallUserCell.getVideoParticipant());
                            } else {
                                groupCallActivity2.fullscreenFor(new ChatObject.VideoParticipant(groupCallUserCell.getParticipant(), false, false));
                            }
                            break;
                        default:
                            GroupCallActivity groupCallActivity3 = this.f$0;
                            groupCallActivity3.getClass();
                            GroupCallGridCell groupCallGridCell = (GroupCallGridCell) view2;
                            if (groupCallGridCell.getParticipant() != null) {
                                groupCallActivity3.fullscreenFor(groupCallGridCell.getParticipant());
                            }
                            break;
                    }
                }
            });
            r4.setOnItemLongClickListener(new GroupCallActivity$$ExternalSyntheticLambda12(this, 1));
            r4.setVisibility(8);
            r4.addItemDecoration(new RecyclerView.ItemDecoration() {
                @Override
                public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.State state) {
                    recyclerView.getClass();
                    RecyclerView.getChildAdapterPosition(view2);
                    if (GroupCallActivity.isLandscapeMode) {
                        rect.set(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                    } else {
                        rect.set(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    }
                }
            });
            anonymousClass28 = new AnonymousClass28(launchActivity, this.listView, r4, this.attachedRenderers, this.call, this);
            this.renderersContainer = anonymousClass28;
            anonymousClass28.setClipChildren(false);
            groupCallFullscreenAdapter.setRenderersPool(this.attachedRenderers, anonymousClass28);
            if (this.tabletVideoGridView != null) {
                this.tabletGridAdapter.setRenderersPool(this.attachedRenderers, anonymousClass28);
            }
            ?? r5 = new AvatarPreviewPagerIndicator(launchActivity) {
                @Override
                public final void onPhotosLoaded() {
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    long dialogId = groupCallActivity2.avatarsViewPager.getDialogId();
                    if (dialogId > 0) {
                        TLRPC.User user = groupCallActivity2.accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
                        groupCallActivity2.avatarsViewPager.initIfEmpty(null, ImageLocation.getForUserOrChat(groupCallActivity2.accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(groupCallActivity2.accountInstance.getCurrentAccount(), user, 1), false);
                    }
                }
            };
            this.avatarPagerIndicator = r5;
            AnonymousClass30 anonymousClass30 = new AnonymousClass30(launchActivity, this.actionBar, this.listView, r5);
            this.avatarsViewPager = anonymousClass30;
            anonymousClass30.setImagesLayerNum(Integer.MAX_VALUE);
            anonymousClass30.setInvalidateWithParent(true);
            r5.setProfileGalleryView(anonymousClass30);
            AnonymousClass31 anonymousClass31 = new AnonymousClass31(launchActivity);
            this.avatarPreviewContainer = anonymousClass31;
            anonymousClass31.setVisibility(8);
            anonymousClass30.setVisibility(0);
            anonymousClass30.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public final void onPageScrollStateChanged(int i29) {
                }

                @Override
                public final void onPageSelected(int i29) {
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    ((ProfileGalleryView) groupCallActivity2.avatarsViewPager).adapter.getRealPosition(i29);
                    AnonymousClass29 anonymousClass29 = groupCallActivity2.avatarPagerIndicator;
                    anonymousClass29.previousSelectedProgress = anonymousClass29.currentProgress;
                    anonymousClass29.previousSelectedPotision = anonymousClass29.selectedPosition;
                    anonymousClass29.currentLoadingAnimationProgress = 0.0f;
                    anonymousClass29.currentLoadingAnimationDirection = 1;
                    anonymousClass29.invalidate();
                }

                @Override
                public final void onPageScrolled(float f, int i29, int i30) {
                }
            });
            AnonymousClass33 anonymousClass33 = new AnonymousClass33(launchActivity);
            this.blurredView = anonymousClass33;
            this.containerView.addView(anonymousClass28);
            anonymousClass28.addView((View) r4, LayoutHelper.createFrame(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
            setWillNotDraw(false);
            View view2 = new View(launchActivity);
            this.buttonsBackgroundGradientView = view2;
            int[] iArr = this.gradientColors;
            iArr[0] = this.backgroundColor;
            iArr[1] = 0;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.gradientColors);
            this.buttonsBackgroundGradient = gradientDrawable;
            view2.setBackground(gradientDrawable);
            this.containerView.addView(view2, LayoutHelper.createFrame(-1, 60, 83));
            View view3 = new View(launchActivity);
            this.buttonsBackgroundGradientView2 = view3;
            view3.setBackgroundColor(this.gradientColors[0]);
            this.containerView.addView(view3, LayoutHelper.createFrame(-1, 0, 83));
            groupCallMessagesListView = new GroupCallMessagesListView(launchActivity);
            this.groupCallMessagesListView = groupCallMessagesListView;
            groupCallMessagesListView.setDelegate(new AnonymousClass34());
            groupCallMessagesListView.setClickCellDelegate(new AnonymousClass35());
            if (this.call != null) {
                groupCallMessagesListView.setGroupCall(this.accountInstance.getCurrentAccount(), this.call.getInputGroupCall(false));
            }
            this.containerView.addView(groupCallMessagesListView, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            AnimatedTextView animatedTextView = new AnimatedTextView(launchActivity, false, true, true);
            this.limitTextView = animatedTextView;
            animatedTextView.setGravity(17);
            animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
            animatedTextView.setTextColor(-1);
            animatedTextView.setAnimationProperties(CubicBezierInterpolator.EASE_OUT_QUINT);
            animatedTextView.setTypeface(AndroidUtilities.bold());
            this.containerView.addView(this.buttonsContainer);
            ?? r1 = new EditTextEmoji(launchActivity, this.sizeNotifierFrameLayout, LaunchActivity.getLastFragment(), this.resourcesProvider) {
                @Override
                public final void createEmojiView() {
                    super.createEmojiView();
                    EmojiView emojiView = getEmojiView();
                    if (emojiView != null) {
                        emojiView.shouldLightenBackground = false;
                        emojiView.fixBottomTabContainerTranslation = false;
                        emojiView.setShouldDrawBackground(false);
                        emojiView.setBottomInset(((BottomSheet) GroupCallActivity.this).containerView.getPaddingBottom());
                    }
                }

                @Override
                public final boolean drawChild(Canvas canvas, View view4, long j) {
                    if (view4 != getEditText()) {
                        return super.drawChild(canvas, view4, j);
                    }
                    canvas.save();
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    groupCallActivity2.callMessageEnterView.getEditText().setTranslationY(view4.getMeasuredHeight() - groupCallActivity2.animatorMessageInputHeight.factor);
                    boolean zDrawChild = super.drawChild(canvas, view4, j);
                    canvas.restore();
                    return zDrawChild;
                }

                @Override
                public final void onEmojiKeyboardUpdate() {
                    int iMax;
                    if (this.emojiViewVisible) {
                        iMax = Math.max(0, getEmojiPadding());
                    } else {
                        iMax = this.waitingForKeyboardOpen ? Math.max(0, getKeyboardHeight()) : 0;
                    }
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    if (iMax <= 0) {
                        groupCallActivity2.windowInsetsStateHolder.resetInAppKeyboardHeight(false);
                        return;
                    }
                    WindowInsetsStateHolder windowInsetsStateHolder = groupCallActivity2.windowInsetsStateHolder;
                    if (windowInsetsStateHolder.inAppKeyboardHeight == iMax && windowInsetsStateHolder.inAppKeyboardState == 0) {
                        return;
                    }
                    AndroidUtilities.cancelRunOnUIThread(windowInsetsStateHolder.closeInAppKeyboard);
                    windowInsetsStateHolder.inAppKeyboardViewHeight = Math.max(windowInsetsStateHolder.inAppKeyboardHeight, iMax);
                    windowInsetsStateHolder.inAppKeyboardHeight = iMax;
                    windowInsetsStateHolder.inAppKeyboardState = 0;
                    windowInsetsStateHolder.setInsets(windowInsetsStateHolder.lastInsets);
                }

                @Override
                public final void onMeasure(int i29, int i30) {
                    super.onMeasure(i29, i30);
                    FactorAnimator factorAnimator = GroupCallActivity.this.animatorMessageInputHeight;
                    if (factorAnimator.factor == 0.0f) {
                        factorAnimator.forceFactor(getMeasuredHeight());
                    } else {
                        factorAnimator.animateTo(getMeasuredHeight());
                    }
                }

                @Override
                public final void updatedEmojiExpanded() {
                    ((BottomSheet) GroupCallActivity.this).containerView.requestApplyInsets();
                }
            };
            this.callMessageEnterView = r1;
            r1.includeNavigationBar = true;
            r1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.maxGroupCallMessageLength)});
            r1.getEditText().setLinkTextColor(-11683585);
            r1.setHint(LocaleController.getString(R.string.TypeMessage));
            r1.getEditText().addTextChangedListener(new TextWatcher() {
                @Override
                public final void afterTextChanged(Editable editable) {
                    String str2;
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    groupCallActivity2.animatorMessageIsEmpty.setValue(TextUtils.isEmpty(editable), true);
                    int iCodePointCount = Character.codePointCount(editable, 0, editable.length());
                    int i29 = groupCallActivity2.maxGroupCallMessageLength;
                    if (iCodePointCount + 25 > i29) {
                        str2 = "" + (i29 - iCodePointCount);
                    } else {
                        str2 = null;
                    }
                    groupCallActivity2.limitTextView.drawable.cancelAnimation();
                    groupCallActivity2.limitTextView.setText(str2);
                    groupCallActivity2.limitTextView.setTextColor(iCodePointCount >= i29 ? -1280137 : -1);
                    if (iCodePointCount > i29) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    }
                }

                @Override
                public final void beforeTextChanged(CharSequence charSequence, int i29, int i30, int i31) {
                }

                @Override
                public final void onTextChanged(CharSequence charSequence, int i29, int i30, int i31) {
                }
            });
            r1.onResume();
            ?? r2 = new FrameLayout(launchActivity) {
                public final RectF tmpRect = new RectF();
                public final RectF tmpRect2 = new RectF();
                public final RectF tmpRect3 = new RectF();
                public final Paint backgroundPaint = new Paint(1);

                @Override
                public final void dispatchDraw(Canvas canvas) {
                    RectF rectF = this.tmpRect;
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    float y = groupCallActivity2.callMessageEnterContainer.getY();
                    AnonymousClass39 anonymousClass39 = groupCallActivity2.callMessageEnterContainer;
                    float measuredHeight = y + anonymousClass39.getMeasuredHeight();
                    FactorAnimator factorAnimator = groupCallActivity2.animatorMessageInputHeight;
                    rectF.set(0.0f, measuredHeight - factorAnimator.factor, getMeasuredWidth(), getMeasuredHeight());
                    RectF rectF2 = this.tmpRect2;
                    rectF2.set(0.0f, anonymousClass39.getY() + anonymousClass39.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    RectF rectF3 = this.tmpRect3;
                    rectF3.set(0.0f, (anonymousClass39.getY() + anonymousClass39.getMeasuredHeight()) - factorAnimator.factor, getMeasuredWidth(), anonymousClass39.getY() + anonymousClass39.getMeasuredHeight());
                    int i29 = Build.VERSION.SDK_INT;
                    Paint paint5 = this.backgroundPaint;
                    if (i29 < 29 || groupCallActivity2.renderNodeBlur == null || !canvas.isHardwareAccelerated()) {
                        paint5.setColor(-14933463);
                        canvas.drawRect(rectF3, paint5);
                        paint5.setColor(ColorUtils.compositeColors(234881023, -14933463));
                        canvas.drawRect(rectF2, paint5);
                    } else {
                        paint5.setColor(-14933463);
                        canvas.drawRect(rectF, paint5);
                        canvas.save();
                        canvas.clipRect(rectF);
                        canvas.translate(-getX(), -getY());
                        float f = groupCallActivity2.renderNodeBlurScale;
                        canvas.scale(f, f);
                        canvas.drawRenderNode(groupCallActivity2.renderNodeBlur);
                        canvas.restore();
                        paint5.setColor(234881023);
                        canvas.drawRect(rectF2, paint5);
                    }
                    super.dispatchDraw(canvas);
                }
            };
            this.callMessageEnterUnderContainer = r2;
            this.containerView.addView((View) r2, LayoutHelper.createFrame(-1.0f, -1));
            ?? r7 = new FrameLayout(launchActivity) {
                @Override
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    if (getAlpha() <= 0.95f) {
                        return false;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            };
            this.callMessageEnterContainer = r7;
            r7.addView(r1, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
            r7.addView(animatedTextView, LayoutHelper.createFrame(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
            animatedTextView.setTranslationY(-AndroidUtilities.dp(20.0f));
            this.containerView.addView((View) r7, LayoutHelper.createFrame(-1, -2, 80));
            ImageView imageView3 = new ImageView(launchActivity);
            this.callMessageHideButton = imageView3;
            int i29 = Theme.key_listSelector;
            imageView3.setBackground(Theme.createSelectorDrawable(getThemedColor(i29), 1, -1));
            int color2 = Theme.getColor(Theme.key_graySectionText, this.resourcesProvider);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView3.setColorFilter(new PorterDuffColorFilter(color2, mode));
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView3.setScaleType(scaleType);
            imageView3.setImageResource(R.drawable.arrow_more);
            imageView3.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda9(this, 6));
            ImageView imageView4 = new ImageView(launchActivity);
            this.callMessageSendButton = imageView4;
            imageView4.setBackground(Theme.createSelectorDrawable(getThemedColor(i29), 1, -1));
            imageView4.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, this.resourcesProvider), mode));
            imageView4.setScaleType(scaleType);
            imageView4.setImageResource(R.drawable.ic_send);
            imageView4.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda9(this, 7));
            r7.addView(imageView3, LayoutHelper.createFrame(48, 48, 85));
            r7.addView(imageView4, LayoutHelper.createFrame(48, 48, 85));
            this.containerView.addView(anonymousClass33);
            anonymousClass31.addView(anonymousClass30, LayoutHelper.createFrame(-1.0f, -1));
            anonymousClass31.addView((View) r5, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            this.containerView.addView(anonymousClass31, LayoutHelper.createFrame(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
            applyCallParticipantUpdates(false);
            this.listAdapter.notifyDataSetChanged();
            if (isTabletMode) {
                this.tabletGridAdapter.update(this.tabletVideoGridView, false);
            }
            this.oldCount = this.listAdapter.getItemCount();
            if (inputPeer != null) {
                textView = new TextView(launchActivity);
                this.scheduleInfoTextView = textView;
                textView.setGravity(17);
                textView.setTextColor(-8682615);
                textView.setTextSize(1, 14.0f);
                if (ChatObject.isChannel(this.currentChat) && (chat2 = this.currentChat) != null && !chat2.megagroup) {
                    textView.setTag(1);
                }
                this.containerView.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
                final NumberPicker numberPicker = new NumberPicker(launchActivity);
                numberPicker.setTextColor(-1);
                numberPicker.setSelectorColor(-9598483);
                numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
                numberPicker.setItemCount(5);
                final ?? r8 = new NumberPicker(launchActivity) {
                    @Override
                    public final CharSequence getContentDescription(int i30) {
                        return LocaleController.formatPluralString("Hours", i30, new Object[0]);
                    }
                };
                r8.setItemCount(5);
                r8.setTextColor(-1);
                r8.setSelectorColor(-9598483);
                r8.setTextOffset(-AndroidUtilities.dp(10.0f));
                final ?? r10 = new NumberPicker(launchActivity) {
                    @Override
                    public final CharSequence getContentDescription(int i30) {
                        return LocaleController.formatPluralString("Minutes", i30, new Object[0]);
                    }
                };
                r10.setItemCount(5);
                r10.setTextColor(-1);
                r10.setSelectorColor(-9598483);
                r10.setTextOffset(-AndroidUtilities.dp(34.0f));
                ?? r11 = new TextView(launchActivity) {
                    public final Paint tmpPaint;
                    public final RectF tmpRectF = new RectF();

                    {
                        Paint paint5 = new Paint(1);
                        this.tmpPaint = paint5;
                        paint5.setStyle(Paint.Style.FILL);
                        paint5.setColor(-16711936);
                    }

                    @Override
                    public final void dispatchDraw(Canvas canvas) {
                        RectF rectF = this.tmpRectF;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.tmpPaint);
                        super.dispatchDraw(canvas);
                    }

                    @Override
                    public final void onDraw(Canvas canvas) {
                        Paint paint5 = this.tmpPaint;
                        paint5.setColor(-16711936);
                        RectF rectF = this.tmpRectF;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint5);
                        super.onDraw(canvas);
                    }

                    @Override
                    public final void onMeasure(int i30, int i31) {
                        super.onMeasure(i30, i31);
                    }
                };
                this.scheduleButtonTextView = r11;
                r11.setLines(1);
                r11.setSingleLine(true);
                r11.setEllipsize(TextUtils.TruncateAt.END);
                r11.setGravity(17);
                r11.setTextColor(-1);
                r11.setTypeface(AndroidUtilities.bold());
                r11.setTextSize(1, 14.0f);
                this.containerView.addView((View) r11, LayoutHelper.createFrame(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
                r11.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda22(this, numberPicker, r8, r10, chat, accountInstance, inputPeer2, 0));
                ?? r12 = new LinearLayout(launchActivity) {
                    public boolean ignoreLayout = false;

                    @Override
                    public final void onMeasure(int i30, int i31) {
                        this.ignoreLayout = true;
                        NumberPicker numberPicker2 = numberPicker;
                        numberPicker2.setItemCount(5);
                        AnonymousClass40 anonymousClass40 = r8;
                        anonymousClass40.setItemCount(5);
                        AnonymousClass41 anonymousClass41 = r10;
                        anonymousClass41.setItemCount(5);
                        numberPicker2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                        anonymousClass40.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                        anonymousClass41.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                        this.ignoreLayout = false;
                        super.onMeasure(i30, i31);
                    }

                    @Override
                    public final void requestLayout() {
                        if (this.ignoreLayout) {
                            return;
                        }
                        super.requestLayout();
                    }
                };
                this.scheduleTimerContainer = r12;
                r12.setWeightSum(1.0f);
                r12.setOrientation(0);
                this.containerView.addView((View) r12, LayoutHelper.createFrame(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
                long jCurrentTimeMillis = System.currentTimeMillis();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(jCurrentTimeMillis);
                int i30 = calendar.get(1);
                i3 = calendar.get(6);
                r12.addView(numberPicker, LayoutHelper.createLinear(0.5f, 0, 270));
                numberPicker.setMinValue(0);
                numberPicker.setMaxValue(365);
                numberPicker.setWrapSelectorWheel(false);
                numberPicker.setFormatter(new GroupCallActivity$$ExternalSyntheticLambda23(jCurrentTimeMillis, calendar, i30, 0));
                ArticleViewer$$ExternalSyntheticLambda54 articleViewer$$ExternalSyntheticLambda54 = new ArticleViewer$$ExternalSyntheticLambda54(this, numberPicker, (Object) r8, (Object) r10, 10);
                groupCallActivity = this;
                numberPicker.setOnValueChangedListener(articleViewer$$ExternalSyntheticLambda54);
                r8.setMinValue(0);
                r8.setMaxValue(23);
                r12.addView(r8, LayoutHelper.createLinear(0.2f, 0, 270));
                r8.setFormatter(new PhotoViewer$$ExternalSyntheticLambda97(7));
                r8.setOnValueChangedListener(articleViewer$$ExternalSyntheticLambda54);
                r10.setMinValue(0);
                r10.setMaxValue(59);
                r10.setValue(0);
                r10.setFormatter(new PhotoViewer$$ExternalSyntheticLambda97(8));
                r12.addView(r10, LayoutHelper.createLinear(0.3f, 0, 270));
                r10.setOnValueChangedListener(articleViewer$$ExternalSyntheticLambda54);
                calendar.setTimeInMillis(jCurrentTimeMillis + 10800000);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                i4 = calendar.get(6);
                int i31 = calendar.get(12);
                int i32 = calendar.get(11);
                if (i3 != i4) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                numberPicker.setValue(i5);
                r10.setValue(i31);
                r8.setValue(i32);
                AlertsCreator.checkScheduleDate(r11, textView, numberPicker, r8, r10);
            } else {
                groupCallActivity = this;
            }
            ?? r16 = new PinchToZoomHelper((ViewGroup) groupCallActivity.getWindow().getDecorView(), groupCallActivity.containerView) {
                @Override
                public final void drawOverlays(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
                    if (f > 0.0f) {
                        GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                        float x = ((BottomSheet) groupCallActivity2).containerView.getX() + groupCallActivity2.avatarPreviewContainer.getX();
                        AnonymousClass31 anonymousClass32 = groupCallActivity2.avatarPreviewContainer;
                        float y = ((BottomSheet) groupCallActivity2).containerView.getY() + anonymousClass32.getY();
                        RectF rectF = AndroidUtilities.rectTmp;
                        AnonymousClass30 anonymousClass34 = groupCallActivity2.avatarsViewPager;
                        rectF.set(x, y, anonymousClass34.getMeasuredWidth() + x, anonymousClass34.getMeasuredHeight() + y);
                        canvas.saveLayerAlpha(rectF, (int) (f * 255.0f), 31);
                        canvas.translate(x, y);
                        anonymousClass32.draw(canvas);
                        canvas.restore();
                    }
                }

                @Override
                public final void invalidateViews() {
                    super.invalidateViews();
                    int i33 = 0;
                    while (true) {
                        GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                        if (i33 >= groupCallActivity2.avatarsViewPager.getChildCount()) {
                            return;
                        }
                        groupCallActivity2.avatarsViewPager.getChildAt(i33).invalidate();
                        i33++;
                    }
                }
            };
            groupCallActivity.pinchToZoomHelper = r16;
            r16.callback = new PinchToZoomHelper.Callback() {
                @Override
                public final TextureView getCurrentTextureView() {
                    return null;
                }

                @Override
                public final void onZoomFinished(MessageObject messageObject) {
                    ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                }

                @Override
                public final void onZoomStarted(MessageObject messageObject) {
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    groupCallActivity2.listView.cancelClickRunnables(true);
                    groupCallActivity2.pinchToZoomHelper.childImage.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
                    ((BottomSheet) groupCallActivity2).containerView.invalidate();
                }
            };
            anonymousClass30.setPinchToZoomHelper(r16);
            final int i33 = 1;
            groupCallActivity.cameraButton.setOnClickListener(new View.OnClickListener(groupCallActivity) {
                public final GroupCallActivity f$0;

                {
                    this.f$0 = groupCallActivity;
                }

                @Override
                public final void onClick(View view4) {
                    switch (i33) {
                        case 0:
                            GroupCallActivity groupCallActivity2 = this.f$0;
                            GroupCallActivity.AnonymousClass28 anonymousClass29 = groupCallActivity2.renderersContainer;
                            boolean z3 = anonymousClass29.hideUiRunnableIsScheduled;
                            LaunchActivity.AnonymousClass18 anonymousClass18 = anonymousClass29.hideUiRunnable;
                            if (z3) {
                                AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
                            }
                            AndroidUtilities.runOnUIThread(anonymousClass18, 3000L);
                            anonymousClass29.hideUiRunnableIsScheduled = true;
                            ChatObject.Call call2 = groupCallActivity2.call;
                            if (call2 == null || call2.isScheduled()) {
                                groupCallActivity2.lambda$showGiftOfferSheet$15();
                            } else {
                                groupCallActivity2.updateItems$1$1();
                                GroupCallActivity.onLeaveClick(launchActivity, new GroupCallActivity$$ExternalSyntheticLambda8(groupCallActivity2, 7), false, false);
                            }
                            break;
                        default:
                            this.f$0.lambda$new$50(launchActivity);
                            break;
                    }
                }
            });
            groupCallActivity.updateScheduleUI(false);
            groupCallActivity.updateItems$1$1();
            groupCallActivity.updateSpeakerPhoneIcon(false);
            groupCallActivity.updateState(false, false);
            groupCallActivity.setColorProgress(0.0f);
            groupCallActivity.updateSubtitle$1();
            groupCallActivity.containerView.addView(new FrameLayout(launchActivity), LayoutHelper.createFrame(-1, 200, 87));
            groupCallActivity.messageButton.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda9(groupCallActivity, 8));
            groupCallActivity.checkGroupCallUi();
            ScaleStateListAnimator.apply(groupCallActivity.cameraButton);
            ScaleStateListAnimator.apply(groupCallActivity.soundButton);
            ScaleStateListAnimator.apply(groupCallActivity.flipButton);
            ScaleStateListAnimator.apply(groupCallActivity.speakerButton);
            ScaleStateListAnimator.apply(groupCallActivity.muteButton);
            ScaleStateListAnimator.apply(groupCallActivity.leaveButton);
            ScaleStateListAnimator.apply(groupCallActivity.messageButton);
            ViewCompat.setOnApplyWindowInsetsListener(groupCallActivity.containerView, new GroupCallActivity$$ExternalSyntheticLambda12(groupCallActivity, 2));
        }
        z2 = true;
        actionBarMenuSubItemAddSubItem2.top = false;
        actionBarMenuSubItemAddSubItem2.bottom = z2;
        actionBarMenuSubItemAddSubItem2.updateBackground();
        int i210 = Theme.key_voipgroup_checkMenu;
        actionBarMenuSubItemAddSubItem.setCheckColor(i210);
        actionBarMenuSubItemAddSubItem.setColors(Theme.getColor(i210), Theme.getColor(i210));
        actionBarMenuSubItemAddSubItem2.setCheckColor(i210);
        actionBarMenuSubItemAddSubItem2.setColors(Theme.getColor(i210), Theme.getColor(i210));
        Paint paint5 = new Paint(1);
        int i211 = Theme.key_voipgroup_actionBarItems;
        paint5.setColor(Theme.getColor(i211));
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint5.setStrokeCap(Paint.Cap.ROUND);
        ActionBarMenuItem actionBarMenuItem12 = this.otherItem;
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem13 = actionBarMenuItem12.addSubItem(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, actionBarMenuItem12.resourcesProvider);
        this.soundItem = actionBarMenuSubItemAddSubItem13;
        actionBarMenuSubItemAddSubItem13.setItemHeight(56);
        ActionBarMenuItem actionBarMenuItem13 = this.otherItem;
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem14 = actionBarMenuItem13.addSubItem(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, actionBarMenuItem13.resourcesProvider);
        this.noiseItem = actionBarMenuSubItemAddSubItem14;
        actionBarMenuSubItemAddSubItem14.setItemHeight(56);
        TextView textViewAddDivider2 = this.otherItem.addDivider(ColorUtils.blendARGB(0.3f, Theme.getColor(Theme.key_voipgroup_actionBar), -16777216));
        this.soundItemDivider = textViewAddDivider2;
        ((ViewGroup.MarginLayoutParams) textViewAddDivider2.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) textViewAddDivider2.getLayoutParams()).bottomMargin = 0;
        ActionBarMenuItem actionBarMenuItem14 = this.otherItem;
        int i212 = R.drawable.msg_edit;
        RecordCallDrawable recordCallDrawable3 = this.recordCallDrawable;
        if (ChatObject.isChannelOrGiga(this.currentChat)) {
            i = R.string.VoipChannelEditTitle;
        } else {
            i = R.string.VoipGroupEditTitle;
        }
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem15 = actionBarMenuItem14.addSubItem(6, i212, recordCallDrawable3, LocaleController.getString(i), true, false, actionBarMenuItem14.resourcesProvider);
        this.editTitleItem = actionBarMenuSubItemAddSubItem15;
        ActionBarMenuItem actionBarMenuItem15 = this.otherItem;
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem16 = actionBarMenuItem15.addSubItem(7, R.drawable.msg_permissions, this.recordCallDrawable, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, actionBarMenuItem15.resourcesProvider);
        this.permissionItem = actionBarMenuSubItemAddSubItem16;
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem17 = this.otherItem.addSubItem(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.inviteItem = actionBarMenuSubItemAddSubItem17;
        RecordCallDrawable recordCallDrawable4 = new RecordCallDrawable();
        this.recordCallDrawable = recordCallDrawable4;
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem18 = this.otherItem.addSubItem(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.screenItem = actionBarMenuSubItemAddSubItem18;
        ActionBarMenuItem actionBarMenuItem16 = this.otherItem;
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem19 = actionBarMenuItem16.addSubItem(5, 0, recordCallDrawable4, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, actionBarMenuItem16.resourcesProvider);
        this.recordItem = actionBarMenuSubItemAddSubItem19;
        recordCallDrawable4.setParentView(actionBarMenuSubItemAddSubItem19.getImageView());
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem110 = this.otherItem.addSubItem(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.enableComments = actionBarMenuSubItemAddSubItem110;
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem111 = this.otherItem.addSubItem(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.disableComments = actionBarMenuSubItemAddSubItem111;
        ActionBarMenuItem actionBarMenuItem17 = this.otherItem;
        int i213 = R.drawable.msg_cancel;
        if (isConference()) {
            i2 = R.string.VoipGroupEndConference;
        } else if (ChatObject.isChannelOrGiga(this.currentChat)) {
            i2 = R.string.VoipChannelEndChat;
        } else {
            i2 = R.string.VoipGroupEndChat;
        }
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem112 = actionBarMenuItem17.addSubItem(4, i213, LocaleController.getString(i2));
        this.leaveItem = actionBarMenuSubItemAddSubItem112;
        this.otherItem.setPopupItemsSelectorColor(Theme.getColor(i22));
        this.otherItem.getPopupLayout().setFitItems(true);
        actionBarMenuSubItemAddSubItem110.setColors(Theme.getColor(i211), Theme.getColor(i211));
        actionBarMenuSubItemAddSubItem111.setColors(Theme.getColor(i211), Theme.getColor(i211));
        actionBarMenuSubItemAddSubItem13.setColors(Theme.getColor(i211), Theme.getColor(i211));
        actionBarMenuSubItemAddSubItem14.setColors(Theme.getColor(i211), Theme.getColor(i211));
        int i214 = Theme.key_voipgroup_leaveCallMenu;
        actionBarMenuSubItemAddSubItem112.setColors(Theme.getColor(i214), Theme.getColor(i214));
        actionBarMenuSubItemAddSubItem17.setColors(Theme.getColor(i211), Theme.getColor(i211));
        actionBarMenuSubItemAddSubItem15.setColors(Theme.getColor(i211), Theme.getColor(i211));
        actionBarMenuSubItemAddSubItem16.setColors(Theme.getColor(i211), Theme.getColor(i211));
        actionBarMenuSubItemAddSubItem19.setColors(Theme.getColor(i211), Theme.getColor(i211));
        actionBarMenuSubItemAddSubItem18.setColors(Theme.getColor(i211), Theme.getColor(i211));
        if (this.call != null) {
            initCreatedGroupCall();
        }
        if (isConference()) {
            this.encryptionDrawable = new CallEncryptionCellDrawable();
            sharedInstance = VoIPService.getSharedInstance();
            CallEncryptionCellDrawable callEncryptionCellDrawable2 = this.encryptionDrawable;
            if (sharedInstance != null) {
                emojis = null;
            } else {
                emojis = null;
            }
            callEncryptionCellDrawable2.setEmojis(emojis);
        }
        updateTitle$2(false);
        this.actionBar.getTitleTextView().setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda9(this, 5));
        ?? r17 = new RecyclerListView(launchActivity) {
            @Override
            public final boolean drawChild(Canvas canvas, View view4, long j) {
                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) view4;
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                if (groupCallActivity2.renderersContainer.fullscreenAnimator == null && !groupCallActivity2.fullscreenListItemAnimator.isRunning()) {
                    groupCallUserCell.setAlpha(1.0f);
                    groupCallUserCell.setTranslationX(0.0f);
                    groupCallUserCell.setTranslationY(0.0f);
                }
                AnonymousClass24 anonymousClass24 = groupCallActivity2.fullscreenUsersListView;
                groupCallUserCell.getClass();
                anonymousClass24.getClass();
                if (RecyclerView.getChildAdapterPosition(groupCallUserCell) == -1 && groupCallUserCell.getRenderer() != null) {
                    return true;
                }
                if (groupCallUserCell.getTranslationY() == 0.0f || groupCallUserCell.getRenderer() == null || groupCallUserCell.getRenderer().primaryView == null) {
                    return super.drawChild(canvas, view4, j);
                }
                float top = groupCallActivity2.listView.getTop() - getTop();
                float measuredHeight = groupCallActivity2.listView.getMeasuredHeight() + top;
                float f = groupCallActivity2.renderersContainer.progressToFullscreenMode;
                canvas.save();
                float f2 = 1.0f - f;
                canvas.clipRect(0.0f, top * f2, getMeasuredWidth(), (getMeasuredHeight() * f) + (measuredHeight * f2));
                boolean zDrawChild = super.drawChild(canvas, view4, j);
                canvas.restore();
                return zDrawChild;
            }
        };
        this.fullscreenUsersListView = r17;
        ?? r18 = new DefaultItemAnimator() {
            @Override
            public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                groupCallActivity2.listView.invalidate();
                groupCallActivity2.renderersContainer.invalidate();
                ((BottomSheet) groupCallActivity2).containerView.invalidate();
                GroupCallActivity.access$8700(groupCallActivity2);
            }
        };
        this.fullscreenListItemAnimator = r18;
        final int i215 = 0;
        r17.setClipToPadding(false);
        r18.setDelayAnimations();
        r18.translationInterpolator = CubicBezierInterpolator.DEFAULT;
        r18.mRemoveDuration = 350L;
        r18.mAddDuration = 350L;
        r18.mMoveDuration = 350L;
        r17.setItemAnimator(r18);
        r17.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrolled(RecyclerView recyclerView, int i216, int i34) {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                ((BottomSheet) groupCallActivity2).containerView.invalidate();
                groupCallActivity2.renderersContainer.invalidate();
            }
        });
        r17.setClipChildren(false);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager();
        linearLayoutManager2.setOrientation(0);
        r17.setLayoutManager(linearLayoutManager2);
        GroupCallFullscreenAdapter groupCallFullscreenAdapter2 = new GroupCallFullscreenAdapter(call, this.currentAccount, this);
        this.fullscreenAdapter = groupCallFullscreenAdapter2;
        r17.setAdapter(groupCallFullscreenAdapter2);
        groupCallFullscreenAdapter2.setVisibility(r17, false);
        r17.setOnItemClickListener(new RecyclerListView.OnItemClickListener(this) {
            public final GroupCallActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onItemClick(int i110, View view4) {
                switch (i215) {
                    case 0:
                        GroupCallActivity groupCallActivity2 = this.f$0;
                        groupCallActivity2.getClass();
                        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) view4;
                        if (groupCallUserCell.getVideoParticipant() != null) {
                            groupCallActivity2.fullscreenFor(groupCallUserCell.getVideoParticipant());
                        } else {
                            groupCallActivity2.fullscreenFor(new ChatObject.VideoParticipant(groupCallUserCell.getParticipant(), false, false));
                        }
                        break;
                    default:
                        GroupCallActivity groupCallActivity3 = this.f$0;
                        groupCallActivity3.getClass();
                        GroupCallGridCell groupCallGridCell = (GroupCallGridCell) view4;
                        if (groupCallGridCell.getParticipant() != null) {
                            groupCallActivity3.fullscreenFor(groupCallGridCell.getParticipant());
                        }
                        break;
                }
            }
        });
        r17.setOnItemLongClickListener(new GroupCallActivity$$ExternalSyntheticLambda12(this, 1));
        r17.setVisibility(8);
        r17.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public final void getItemOffsets(Rect rect, View view4, RecyclerView recyclerView, RecyclerView.State state) {
                recyclerView.getClass();
                RecyclerView.getChildAdapterPosition(view4);
                if (GroupCallActivity.isLandscapeMode) {
                    rect.set(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                } else {
                    rect.set(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                }
            }
        });
        anonymousClass28 = new AnonymousClass28(launchActivity, this.listView, r17, this.attachedRenderers, this.call, this);
        this.renderersContainer = anonymousClass28;
        anonymousClass28.setClipChildren(false);
        groupCallFullscreenAdapter2.setRenderersPool(this.attachedRenderers, anonymousClass28);
        if (this.tabletVideoGridView != null) {
            this.tabletGridAdapter.setRenderersPool(this.attachedRenderers, anonymousClass28);
        }
        ?? r19 = new AvatarPreviewPagerIndicator(launchActivity) {
            @Override
            public final void onPhotosLoaded() {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                long dialogId = groupCallActivity2.avatarsViewPager.getDialogId();
                if (dialogId > 0) {
                    TLRPC.User user = groupCallActivity2.accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
                    groupCallActivity2.avatarsViewPager.initIfEmpty(null, ImageLocation.getForUserOrChat(groupCallActivity2.accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(groupCallActivity2.accountInstance.getCurrentAccount(), user, 1), false);
                }
            }
        };
        this.avatarPagerIndicator = r19;
        AnonymousClass30 anonymousClass32 = new AnonymousClass30(launchActivity, this.actionBar, this.listView, r19);
        this.avatarsViewPager = anonymousClass32;
        anonymousClass32.setImagesLayerNum(Integer.MAX_VALUE);
        anonymousClass32.setInvalidateWithParent(true);
        r19.setProfileGalleryView(anonymousClass32);
        AnonymousClass31 anonymousClass34 = new AnonymousClass31(launchActivity);
        this.avatarPreviewContainer = anonymousClass34;
        anonymousClass34.setVisibility(8);
        anonymousClass32.setVisibility(0);
        anonymousClass32.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public final void onPageScrollStateChanged(int i216) {
            }

            @Override
            public final void onPageSelected(int i216) {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                ((ProfileGalleryView) groupCallActivity2.avatarsViewPager).adapter.getRealPosition(i216);
                AnonymousClass29 anonymousClass29 = groupCallActivity2.avatarPagerIndicator;
                anonymousClass29.previousSelectedProgress = anonymousClass29.currentProgress;
                anonymousClass29.previousSelectedPotision = anonymousClass29.selectedPosition;
                anonymousClass29.currentLoadingAnimationProgress = 0.0f;
                anonymousClass29.currentLoadingAnimationDirection = 1;
                anonymousClass29.invalidate();
            }

            @Override
            public final void onPageScrolled(float f, int i216, int i34) {
            }
        });
        AnonymousClass33 anonymousClass35 = new AnonymousClass33(launchActivity);
        this.blurredView = anonymousClass35;
        this.containerView.addView(anonymousClass28);
        anonymousClass28.addView((View) r17, LayoutHelper.createFrame(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        setWillNotDraw(false);
        View view4 = new View(launchActivity);
        this.buttonsBackgroundGradientView = view4;
        int[] iArr2 = this.gradientColors;
        iArr2[0] = this.backgroundColor;
        iArr2[1] = 0;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.gradientColors);
        this.buttonsBackgroundGradient = gradientDrawable2;
        view4.setBackground(gradientDrawable2);
        this.containerView.addView(view4, LayoutHelper.createFrame(-1, 60, 83));
        View view5 = new View(launchActivity);
        this.buttonsBackgroundGradientView2 = view5;
        view5.setBackgroundColor(this.gradientColors[0]);
        this.containerView.addView(view5, LayoutHelper.createFrame(-1, 0, 83));
        groupCallMessagesListView = new GroupCallMessagesListView(launchActivity);
        this.groupCallMessagesListView = groupCallMessagesListView;
        groupCallMessagesListView.setDelegate(new AnonymousClass34());
        groupCallMessagesListView.setClickCellDelegate(new AnonymousClass35());
        if (this.call != null) {
            groupCallMessagesListView.setGroupCall(this.accountInstance.getCurrentAccount(), this.call.getInputGroupCall(false));
        }
        this.containerView.addView(groupCallMessagesListView, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        AnimatedTextView animatedTextView2 = new AnimatedTextView(launchActivity, false, true, true);
        this.limitTextView = animatedTextView2;
        animatedTextView2.setGravity(17);
        animatedTextView2.setTextSize(AndroidUtilities.dp(15.0f));
        animatedTextView2.setTextColor(-1);
        animatedTextView2.setAnimationProperties(CubicBezierInterpolator.EASE_OUT_QUINT);
        animatedTextView2.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.buttonsContainer);
        ?? r20 = new EditTextEmoji(launchActivity, this.sizeNotifierFrameLayout, LaunchActivity.getLastFragment(), this.resourcesProvider) {
            @Override
            public final void createEmojiView() {
                super.createEmojiView();
                EmojiView emojiView = getEmojiView();
                if (emojiView != null) {
                    emojiView.shouldLightenBackground = false;
                    emojiView.fixBottomTabContainerTranslation = false;
                    emojiView.setShouldDrawBackground(false);
                    emojiView.setBottomInset(((BottomSheet) GroupCallActivity.this).containerView.getPaddingBottom());
                }
            }

            @Override
            public final boolean drawChild(Canvas canvas, View view6, long j) {
                if (view6 != getEditText()) {
                    return super.drawChild(canvas, view6, j);
                }
                canvas.save();
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                groupCallActivity2.callMessageEnterView.getEditText().setTranslationY(view6.getMeasuredHeight() - groupCallActivity2.animatorMessageInputHeight.factor);
                boolean zDrawChild = super.drawChild(canvas, view6, j);
                canvas.restore();
                return zDrawChild;
            }

            @Override
            public final void onEmojiKeyboardUpdate() {
                int iMax;
                if (this.emojiViewVisible) {
                    iMax = Math.max(0, getEmojiPadding());
                } else {
                    iMax = this.waitingForKeyboardOpen ? Math.max(0, getKeyboardHeight()) : 0;
                }
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                if (iMax <= 0) {
                    groupCallActivity2.windowInsetsStateHolder.resetInAppKeyboardHeight(false);
                    return;
                }
                WindowInsetsStateHolder windowInsetsStateHolder = groupCallActivity2.windowInsetsStateHolder;
                if (windowInsetsStateHolder.inAppKeyboardHeight == iMax && windowInsetsStateHolder.inAppKeyboardState == 0) {
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(windowInsetsStateHolder.closeInAppKeyboard);
                windowInsetsStateHolder.inAppKeyboardViewHeight = Math.max(windowInsetsStateHolder.inAppKeyboardHeight, iMax);
                windowInsetsStateHolder.inAppKeyboardHeight = iMax;
                windowInsetsStateHolder.inAppKeyboardState = 0;
                windowInsetsStateHolder.setInsets(windowInsetsStateHolder.lastInsets);
            }

            @Override
            public final void onMeasure(int i216, int i34) {
                super.onMeasure(i216, i34);
                FactorAnimator factorAnimator = GroupCallActivity.this.animatorMessageInputHeight;
                if (factorAnimator.factor == 0.0f) {
                    factorAnimator.forceFactor(getMeasuredHeight());
                } else {
                    factorAnimator.animateTo(getMeasuredHeight());
                }
            }

            @Override
            public final void updatedEmojiExpanded() {
                ((BottomSheet) GroupCallActivity.this).containerView.requestApplyInsets();
            }
        };
        this.callMessageEnterView = r20;
        r20.includeNavigationBar = true;
        r20.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.maxGroupCallMessageLength)});
        r20.getEditText().setLinkTextColor(-11683585);
        r20.setHint(LocaleController.getString(R.string.TypeMessage));
        r20.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                String str2;
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                groupCallActivity2.animatorMessageIsEmpty.setValue(TextUtils.isEmpty(editable), true);
                int iCodePointCount = Character.codePointCount(editable, 0, editable.length());
                int i216 = groupCallActivity2.maxGroupCallMessageLength;
                if (iCodePointCount + 25 > i216) {
                    str2 = "" + (i216 - iCodePointCount);
                } else {
                    str2 = null;
                }
                groupCallActivity2.limitTextView.drawable.cancelAnimation();
                groupCallActivity2.limitTextView.setText(str2);
                groupCallActivity2.limitTextView.setTextColor(iCodePointCount >= i216 ? -1280137 : -1);
                if (iCodePointCount > i216) {
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                }
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i216, int i34, int i35) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i216, int i34, int i35) {
            }
        });
        r20.onResume();
        ?? r21 = new FrameLayout(launchActivity) {
            public final RectF tmpRect = new RectF();
            public final RectF tmpRect2 = new RectF();
            public final RectF tmpRect3 = new RectF();
            public final Paint backgroundPaint = new Paint(1);

            @Override
            public final void dispatchDraw(Canvas canvas) {
                RectF rectF = this.tmpRect;
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                float y = groupCallActivity2.callMessageEnterContainer.getY();
                AnonymousClass39 anonymousClass39 = groupCallActivity2.callMessageEnterContainer;
                float measuredHeight = y + anonymousClass39.getMeasuredHeight();
                FactorAnimator factorAnimator = groupCallActivity2.animatorMessageInputHeight;
                rectF.set(0.0f, measuredHeight - factorAnimator.factor, getMeasuredWidth(), getMeasuredHeight());
                RectF rectF2 = this.tmpRect2;
                rectF2.set(0.0f, anonymousClass39.getY() + anonymousClass39.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                RectF rectF3 = this.tmpRect3;
                rectF3.set(0.0f, (anonymousClass39.getY() + anonymousClass39.getMeasuredHeight()) - factorAnimator.factor, getMeasuredWidth(), anonymousClass39.getY() + anonymousClass39.getMeasuredHeight());
                int i216 = Build.VERSION.SDK_INT;
                Paint paint6 = this.backgroundPaint;
                if (i216 < 29 || groupCallActivity2.renderNodeBlur == null || !canvas.isHardwareAccelerated()) {
                    paint6.setColor(-14933463);
                    canvas.drawRect(rectF3, paint6);
                    paint6.setColor(ColorUtils.compositeColors(234881023, -14933463));
                    canvas.drawRect(rectF2, paint6);
                } else {
                    paint6.setColor(-14933463);
                    canvas.drawRect(rectF, paint6);
                    canvas.save();
                    canvas.clipRect(rectF);
                    canvas.translate(-getX(), -getY());
                    float f = groupCallActivity2.renderNodeBlurScale;
                    canvas.scale(f, f);
                    canvas.drawRenderNode(groupCallActivity2.renderNodeBlur);
                    canvas.restore();
                    paint6.setColor(234881023);
                    canvas.drawRect(rectF2, paint6);
                }
                super.dispatchDraw(canvas);
            }
        };
        this.callMessageEnterUnderContainer = r21;
        this.containerView.addView((View) r21, LayoutHelper.createFrame(-1.0f, -1));
        ?? r22 = new FrameLayout(launchActivity) {
            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (getAlpha() <= 0.95f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.callMessageEnterContainer = r22;
        r22.addView(r20, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        r22.addView(animatedTextView2, LayoutHelper.createFrame(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        animatedTextView2.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView((View) r22, LayoutHelper.createFrame(-1, -2, 80));
        ImageView imageView5 = new ImageView(launchActivity);
        this.callMessageHideButton = imageView5;
        int i216 = Theme.key_listSelector;
        imageView5.setBackground(Theme.createSelectorDrawable(getThemedColor(i216), 1, -1));
        int color3 = Theme.getColor(Theme.key_graySectionText, this.resourcesProvider);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        imageView5.setColorFilter(new PorterDuffColorFilter(color3, mode2));
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView5.setScaleType(scaleType2);
        imageView5.setImageResource(R.drawable.arrow_more);
        imageView5.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda9(this, 6));
        ImageView imageView6 = new ImageView(launchActivity);
        this.callMessageSendButton = imageView6;
        imageView6.setBackground(Theme.createSelectorDrawable(getThemedColor(i216), 1, -1));
        imageView6.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, this.resourcesProvider), mode2));
        imageView6.setScaleType(scaleType2);
        imageView6.setImageResource(R.drawable.ic_send);
        imageView6.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda9(this, 7));
        r22.addView(imageView5, LayoutHelper.createFrame(48, 48, 85));
        r22.addView(imageView6, LayoutHelper.createFrame(48, 48, 85));
        this.containerView.addView(anonymousClass35);
        anonymousClass34.addView(anonymousClass32, LayoutHelper.createFrame(-1.0f, -1));
        anonymousClass34.addView((View) r19, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(anonymousClass34, LayoutHelper.createFrame(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        applyCallParticipantUpdates(false);
        this.listAdapter.notifyDataSetChanged();
        if (isTabletMode) {
            this.tabletGridAdapter.update(this.tabletVideoGridView, false);
        }
        this.oldCount = this.listAdapter.getItemCount();
        if (inputPeer != null) {
            textView = new TextView(launchActivity);
            this.scheduleInfoTextView = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (ChatObject.isChannel(this.currentChat)) {
                textView.setTag(1);
            }
            this.containerView.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            final NumberPicker numberPicker2 = new NumberPicker(launchActivity);
            numberPicker2.setTextColor(-1);
            numberPicker2.setSelectorColor(-9598483);
            numberPicker2.setTextOffset(AndroidUtilities.dp(10.0f));
            numberPicker2.setItemCount(5);
            final AnonymousClass40 r23 = new NumberPicker(launchActivity) {
                @Override
                public final CharSequence getContentDescription(int i34) {
                    return LocaleController.formatPluralString("Hours", i34, new Object[0]);
                }
            };
            r23.setItemCount(5);
            r23.setTextColor(-1);
            r23.setSelectorColor(-9598483);
            r23.setTextOffset(-AndroidUtilities.dp(10.0f));
            final AnonymousClass41 r110 = new NumberPicker(launchActivity) {
                @Override
                public final CharSequence getContentDescription(int i34) {
                    return LocaleController.formatPluralString("Minutes", i34, new Object[0]);
                }
            };
            r110.setItemCount(5);
            r110.setTextColor(-1);
            r110.setSelectorColor(-9598483);
            r110.setTextOffset(-AndroidUtilities.dp(34.0f));
            ?? r111 = new TextView(launchActivity) {
                public final Paint tmpPaint;
                public final RectF tmpRectF = new RectF();

                {
                    Paint paint6 = new Paint(1);
                    this.tmpPaint = paint6;
                    paint6.setStyle(Paint.Style.FILL);
                    paint6.setColor(-16711936);
                }

                @Override
                public final void dispatchDraw(Canvas canvas) {
                    RectF rectF = this.tmpRectF;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.tmpPaint);
                    super.dispatchDraw(canvas);
                }

                @Override
                public final void onDraw(Canvas canvas) {
                    Paint paint6 = this.tmpPaint;
                    paint6.setColor(-16711936);
                    RectF rectF = this.tmpRectF;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint6);
                    super.onDraw(canvas);
                }

                @Override
                public final void onMeasure(int i34, int i35) {
                    super.onMeasure(i34, i35);
                }
            };
            this.scheduleButtonTextView = r111;
            r111.setLines(1);
            r111.setSingleLine(true);
            r111.setEllipsize(TextUtils.TruncateAt.END);
            r111.setGravity(17);
            r111.setTextColor(-1);
            r111.setTypeface(AndroidUtilities.bold());
            r111.setTextSize(1, 14.0f);
            this.containerView.addView((View) r111, LayoutHelper.createFrame(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            r111.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda22(this, numberPicker2, r23, r110, chat, accountInstance, inputPeer2, 0));
            ?? r112 = new LinearLayout(launchActivity) {
                public boolean ignoreLayout = false;

                @Override
                public final void onMeasure(int i34, int i35) {
                    this.ignoreLayout = true;
                    NumberPicker numberPicker3 = numberPicker2;
                    numberPicker3.setItemCount(5);
                    AnonymousClass40 anonymousClass40 = r23;
                    anonymousClass40.setItemCount(5);
                    AnonymousClass41 anonymousClass41 = r110;
                    anonymousClass41.setItemCount(5);
                    numberPicker3.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                    anonymousClass40.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                    anonymousClass41.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                    this.ignoreLayout = false;
                    super.onMeasure(i34, i35);
                }

                @Override
                public final void requestLayout() {
                    if (this.ignoreLayout) {
                        return;
                    }
                    super.requestLayout();
                }
            };
            this.scheduleTimerContainer = r112;
            r112.setWeightSum(1.0f);
            r112.setOrientation(0);
            this.containerView.addView((View) r112, LayoutHelper.createFrame(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(jCurrentTimeMillis2);
            int i34 = calendar2.get(1);
            i3 = calendar2.get(6);
            r112.addView(numberPicker2, LayoutHelper.createLinear(0.5f, 0, 270));
            numberPicker2.setMinValue(0);
            numberPicker2.setMaxValue(365);
            numberPicker2.setWrapSelectorWheel(false);
            numberPicker2.setFormatter(new GroupCallActivity$$ExternalSyntheticLambda23(jCurrentTimeMillis2, calendar2, i34, 0));
            ArticleViewer$$ExternalSyntheticLambda54 articleViewer$$ExternalSyntheticLambda55 = new ArticleViewer$$ExternalSyntheticLambda54(this, numberPicker2, (Object) r23, (Object) r110, 10);
            groupCallActivity = this;
            numberPicker2.setOnValueChangedListener(articleViewer$$ExternalSyntheticLambda55);
            r23.setMinValue(0);
            r23.setMaxValue(23);
            r112.addView(r23, LayoutHelper.createLinear(0.2f, 0, 270));
            r23.setFormatter(new PhotoViewer$$ExternalSyntheticLambda97(7));
            r23.setOnValueChangedListener(articleViewer$$ExternalSyntheticLambda55);
            r110.setMinValue(0);
            r110.setMaxValue(59);
            r110.setValue(0);
            r110.setFormatter(new PhotoViewer$$ExternalSyntheticLambda97(8));
            r112.addView(r110, LayoutHelper.createLinear(0.3f, 0, 270));
            r110.setOnValueChangedListener(articleViewer$$ExternalSyntheticLambda55);
            calendar2.setTimeInMillis(jCurrentTimeMillis2 + 10800000);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            i4 = calendar2.get(6);
            int i35 = calendar2.get(12);
            int i36 = calendar2.get(11);
            if (i3 != i4) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            numberPicker2.setValue(i5);
            r110.setValue(i35);
            r23.setValue(i36);
            AlertsCreator.checkScheduleDate(r111, textView, numberPicker2, r23, r110);
        } else {
            groupCallActivity = this;
        }
        ?? r113 = new PinchToZoomHelper((ViewGroup) groupCallActivity.getWindow().getDecorView(), groupCallActivity.containerView) {
            @Override
            public final void drawOverlays(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
                if (f > 0.0f) {
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    float x = ((BottomSheet) groupCallActivity2).containerView.getX() + groupCallActivity2.avatarPreviewContainer.getX();
                    AnonymousClass31 anonymousClass36 = groupCallActivity2.avatarPreviewContainer;
                    float y = ((BottomSheet) groupCallActivity2).containerView.getY() + anonymousClass36.getY();
                    RectF rectF = AndroidUtilities.rectTmp;
                    AnonymousClass30 anonymousClass37 = groupCallActivity2.avatarsViewPager;
                    rectF.set(x, y, anonymousClass37.getMeasuredWidth() + x, anonymousClass37.getMeasuredHeight() + y);
                    canvas.saveLayerAlpha(rectF, (int) (f * 255.0f), 31);
                    canvas.translate(x, y);
                    anonymousClass36.draw(canvas);
                    canvas.restore();
                }
            }

            @Override
            public final void invalidateViews() {
                super.invalidateViews();
                int i37 = 0;
                while (true) {
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    if (i37 >= groupCallActivity2.avatarsViewPager.getChildCount()) {
                        return;
                    }
                    groupCallActivity2.avatarsViewPager.getChildAt(i37).invalidate();
                    i37++;
                }
            }
        };
        groupCallActivity.pinchToZoomHelper = r113;
        r113.callback = new PinchToZoomHelper.Callback() {
            @Override
            public final TextureView getCurrentTextureView() {
                return null;
            }

            @Override
            public final void onZoomFinished(MessageObject messageObject) {
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }

            @Override
            public final void onZoomStarted(MessageObject messageObject) {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                groupCallActivity2.listView.cancelClickRunnables(true);
                groupCallActivity2.pinchToZoomHelper.childImage.setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
                ((BottomSheet) groupCallActivity2).containerView.invalidate();
            }
        };
        anonymousClass32.setPinchToZoomHelper(r113);
        final int i37 = 1;
        groupCallActivity.cameraButton.setOnClickListener(new View.OnClickListener(groupCallActivity) {
            public final GroupCallActivity f$0;

            {
                this.f$0 = groupCallActivity;
            }

            @Override
            public final void onClick(View view6) {
                switch (i37) {
                    case 0:
                        GroupCallActivity groupCallActivity2 = this.f$0;
                        GroupCallActivity.AnonymousClass28 anonymousClass29 = groupCallActivity2.renderersContainer;
                        boolean z3 = anonymousClass29.hideUiRunnableIsScheduled;
                        LaunchActivity.AnonymousClass18 anonymousClass18 = anonymousClass29.hideUiRunnable;
                        if (z3) {
                            AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
                        }
                        AndroidUtilities.runOnUIThread(anonymousClass18, 3000L);
                        anonymousClass29.hideUiRunnableIsScheduled = true;
                        ChatObject.Call call2 = groupCallActivity2.call;
                        if (call2 == null || call2.isScheduled()) {
                            groupCallActivity2.lambda$showGiftOfferSheet$15();
                        } else {
                            groupCallActivity2.updateItems$1$1();
                            GroupCallActivity.onLeaveClick(launchActivity, new GroupCallActivity$$ExternalSyntheticLambda8(groupCallActivity2, 7), false, false);
                        }
                        break;
                    default:
                        this.f$0.lambda$new$50(launchActivity);
                        break;
                }
            }
        });
        groupCallActivity.updateScheduleUI(false);
        groupCallActivity.updateItems$1$1();
        groupCallActivity.updateSpeakerPhoneIcon(false);
        groupCallActivity.updateState(false, false);
        groupCallActivity.setColorProgress(0.0f);
        groupCallActivity.updateSubtitle$1();
        groupCallActivity.containerView.addView(new FrameLayout(launchActivity), LayoutHelper.createFrame(-1, 200, 87));
        groupCallActivity.messageButton.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda9(groupCallActivity, 8));
        groupCallActivity.checkGroupCallUi();
        ScaleStateListAnimator.apply(groupCallActivity.cameraButton);
        ScaleStateListAnimator.apply(groupCallActivity.soundButton);
        ScaleStateListAnimator.apply(groupCallActivity.flipButton);
        ScaleStateListAnimator.apply(groupCallActivity.speakerButton);
        ScaleStateListAnimator.apply(groupCallActivity.muteButton);
        ScaleStateListAnimator.apply(groupCallActivity.leaveButton);
        ScaleStateListAnimator.apply(groupCallActivity.messageButton);
        ViewCompat.setOnApplyWindowInsetsListener(groupCallActivity.containerView, new GroupCallActivity$$ExternalSyntheticLambda12(groupCallActivity, 2));
    }

    public static void access$12900(GroupCallActivity groupCallActivity, GroupCallGridCell groupCallGridCell, boolean z) {
        if (groupCallActivity.isDismissed()) {
            return;
        }
        if (z && groupCallGridCell.getRenderer() == null) {
            groupCallGridCell.setRenderer(GroupCallMiniTextureView.getOrCreate(groupCallActivity.attachedRenderers, groupCallActivity.renderersContainer, groupCallGridCell, null, null, groupCallGridCell.getParticipant(), groupCallActivity.call, groupCallActivity));
            return;
        }
        if (z || groupCallGridCell.getRenderer() == null) {
            return;
        }
        groupCallGridCell.getRenderer().setPrimaryView(null);
        groupCallGridCell.setRenderer(null);
    }

    public static void access$14800(GroupCallActivity groupCallActivity, int i, int[] iArr) {
        if (groupCallActivity.isRtmpStream()) {
            int i2 = Theme.key_voipgroup_disabledButton;
            iArr[0] = Theme.getColor(null, i2, false);
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_rtmpButton, false), Theme.getColor(null, Theme.key_voipgroup_soundButtonActiveScrolled, false), groupCallActivity.colorProgress, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_listViewBackgroundUnscrolled, false), Theme.getColor(null, i2, false), groupCallActivity.colorProgress, 1.0f);
        } else if (i == 0) {
            iArr[0] = Theme.getColor(null, Theme.key_voipgroup_unmuteButton2, false);
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_soundButtonActive, false), Theme.getColor(null, Theme.key_voipgroup_soundButtonActiveScrolled, false), groupCallActivity.colorProgress, 1.0f);
            iArr[2] = Theme.getColor(null, Theme.key_voipgroup_soundButton, false);
        } else if (i == 1) {
            iArr[0] = Theme.getColor(null, Theme.key_voipgroup_muteButton2, false);
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_soundButtonActive2, false), Theme.getColor(null, Theme.key_voipgroup_soundButtonActive2Scrolled, false), groupCallActivity.colorProgress, 1.0f);
            iArr[2] = Theme.getColor(null, Theme.key_voipgroup_soundButton2, false);
        } else if (isGradientState(i)) {
            iArr[0] = Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient3, false);
            iArr[1] = Theme.getColor(null, Theme.key_voipgroup_mutedByAdminMuteButton, false);
            iArr[2] = Theme.getColor(null, Theme.key_voipgroup_mutedByAdminMuteButtonDisabled, false);
        } else {
            int i3 = Theme.key_voipgroup_disabledButton;
            iArr[0] = Theme.getColor(null, i3, false);
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_disabledButtonActive, false), Theme.getColor(null, Theme.key_voipgroup_disabledButtonActiveScrolled, false), groupCallActivity.colorProgress, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_listViewBackgroundUnscrolled, false), Theme.getColor(null, i3, false), groupCallActivity.colorProgress, 1.0f);
        }
        if (isGradientState(i)) {
            iArr[3] = ColorUtils.blendARGB(0.5f, Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient, false), Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient3, false));
        } else if (i == 1) {
            iArr[3] = ColorUtils.blendARGB(0.75f, Theme.getColor(null, Theme.key_voipgroup_soundButtonActive2, false), ColorUtils.blendARGB(0.5f, Theme.getColor(null, Theme.key_voipgroup_muteButton, false), Theme.getColor(null, Theme.key_voipgroup_muteButton3, false)));
        } else {
            iArr[3] = ColorUtils.blendARGB(0.5f, Theme.getColor(null, Theme.key_voipgroup_unmuteButton2, false), Theme.getColor(null, Theme.key_voipgroup_unmuteButton, false));
        }
    }

    public static void access$3100(GroupCallActivity groupCallActivity) {
        groupCallActivity.getClass();
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (groupCallActivity.reminderHintView == null) {
            HintView hintView = new HintView(8, groupCallActivity.getContext(), null, false);
            groupCallActivity.reminderHintView = hintView;
            hintView.setAlpha(0.0f);
            groupCallActivity.reminderHintView.setVisibility(4);
            groupCallActivity.reminderHintView.setShowingDuration(4000L);
            groupCallActivity.containerView.addView(groupCallActivity.reminderHintView, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            groupCallActivity.reminderHintView.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            groupCallActivity.reminderHintView.setBackgroundColor();
        }
        groupCallActivity.reminderHintView.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        groupCallActivity.reminderHintView.showForView(groupCallActivity.muteButton, true);
    }

    public static void access$6500(GroupCallActivity groupCallActivity) {
        int i;
        if (!groupCallActivity.isRtmpStream()) {
            groupCallActivity.isFullscreen = false;
            return;
        }
        AnonymousClass28 anonymousClass28 = groupCallActivity.renderersContainer;
        boolean z = (!anonymousClass28.uiVisible && anonymousClass28.inFullscreenMode && (isLandscapeMode == groupCallActivity.isRtmpLandscapeMode() || AndroidUtilities.isTablet())) ? false : true;
        Boolean bool = groupCallActivity.wasNotInLayoutFullscreen;
        if (bool == null || z != bool.booleanValue()) {
            int systemUiVisibility = groupCallActivity.containerView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility & (-7);
                groupCallActivity.getWindow().clearFlags(1024);
                groupCallActivity.setHideSystemVerticalInsets(false);
            } else {
                groupCallActivity.setHideSystemVerticalInsets(true);
                i = systemUiVisibility | 6;
                groupCallActivity.getWindow().addFlags(1024);
            }
            groupCallActivity.containerView.setSystemUiVisibility(i);
            groupCallActivity.wasNotInLayoutFullscreen = Boolean.valueOf(z);
            groupCallActivity.isInFullscreen = !z;
            groupCallActivity.containerView.requestApplyInsets();
        }
    }

    public static GroupCallGridCell access$700(GroupCallActivity groupCallActivity) {
        for (int i = 0; i < groupCallActivity.listView.getChildCount(); i++) {
            AnonymousClass9 anonymousClass9 = groupCallActivity.listView;
            View childAt = anonymousClass9.getChildAt(i);
            if (childAt.isAttachedToWindow() && (childAt instanceof GroupCallGridCell)) {
                anonymousClass9.getClass();
                if (RecyclerView.getChildAdapterPosition(childAt) >= 0) {
                    return (GroupCallGridCell) childAt;
                }
            }
        }
        return null;
    }

    public static void access$8700(GroupCallActivity groupCallActivity) {
        AnonymousClass9 anonymousClass9;
        char c;
        float fDp;
        boolean z = true;
        z = true;
        int childCount = groupCallActivity.listView.getChildCount();
        int i = 0;
        float paddingTop = 2.1474836E9f;
        while (true) {
            anonymousClass9 = groupCallActivity.listView;
            if (i >= childCount) {
                break;
            }
            View childAt = anonymousClass9.getChildAt(i);
            if (RecyclerView.getChildAdapterPosition(childAt) >= 0) {
                paddingTop = Math.min(paddingTop, childAt.getTop());
            }
            i++;
        }
        if (paddingTop < 0.0f || paddingTop == 2.1474836E9f) {
            paddingTop = childCount != 0 ? 0.0f : anonymousClass9.getPaddingTop();
        }
        boolean z2 = paddingTop <= ((float) (ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)));
        float fDp2 = paddingTop + AndroidUtilities.dp(14.0f) + ActionBar.getCurrentActionBarHeight();
        AnonymousClass5 anonymousClass5 = groupCallActivity.actionBar;
        if ((z2 && anonymousClass5.getTag() == null) || (!z2 && anonymousClass5.getTag() != null)) {
            anonymousClass5.setTag(z2 ? 1 : null);
            AnimatorSet animatorSet = groupCallActivity.actionBarAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                groupCallActivity.actionBarAnimation = null;
            }
            groupCallActivity.setUseLightStatusBar(anonymousClass5.getTag() == null);
            ViewPropertyAnimator duration = anonymousClass5.getBackButton().animate().scaleX(z2 ? 1.0f : 0.9f).scaleY(z2 ? 1.0f : 0.9f).translationX(z2 ? 0.0f : -AndroidUtilities.dp(14.0f)).setDuration(300L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            anonymousClass5.getTitleTextView().animate().translationY(z2 ? 0.0f : AndroidUtilities.dp(23.0f)).setDuration(300L).setInterpolator(cubicBezierInterpolator).start();
            ObjectAnimator objectAnimator = groupCallActivity.subtitleYAnimator;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                groupCallActivity.subtitleYAnimator.cancel();
            }
            SimpleTextView subtitleTextView = anonymousClass5.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = anonymousClass5.getSubtitleTextView().getTranslationY();
            if (z2) {
                fDp = 0.0f;
                c = 0;
            } else {
                c = 0;
                fDp = AndroidUtilities.dp(20.0f);
            }
            float[] fArr = new float[2];
            fArr[c] = translationY;
            fArr[1] = fDp;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<SimpleTextView, Float>) property, fArr);
            groupCallActivity.subtitleYAnimator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(300L);
            groupCallActivity.subtitleYAnimator.setInterpolator(cubicBezierInterpolator);
            groupCallActivity.subtitleYAnimator.addListener(new LoginActivity.AnonymousClass9(19, groupCallActivity, z2));
            groupCallActivity.subtitleYAnimator.start();
            ObjectAnimator objectAnimator2 = groupCallActivity.additionalSubtitleYAnimator;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            SimpleTextView additionalSubtitleTextView = anonymousClass5.getAdditionalSubtitleTextView();
            float[] fArr2 = new float[1];
            fArr2[c] = z2 ? 0.0f : AndroidUtilities.dp(20.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, (Property<SimpleTextView, Float>) property, fArr2);
            groupCallActivity.additionalSubtitleYAnimator = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(300L);
            groupCallActivity.additionalSubtitleYAnimator.setInterpolator(cubicBezierInterpolator);
            groupCallActivity.additionalSubtitleYAnimator.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            groupCallActivity.actionBarAnimation = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = groupCallActivity.actionBarAnimation;
            Property property2 = View.ALPHA;
            float[] fArr3 = new float[1];
            fArr3[c] = z2 ? 1.0f : 0.0f;
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(anonymousClass5, (Property<AnonymousClass5, Float>) property2, fArr3);
            float[] fArr4 = new float[1];
            fArr4[c] = z2 ? 1.0f : 0.0f;
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(groupCallActivity.actionBarBackground, (Property<AnonymousClass21, Float>) property2, fArr4);
            float[] fArr5 = new float[1];
            fArr5[c] = z2 ? 1.0f : 0.0f;
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(groupCallActivity.actionBarShadow, (Property<View, Float>) property2, fArr5);
            Animator[] animatorArr = new Animator[3];
            animatorArr[c] = objectAnimatorOfFloat3;
            animatorArr[1] = objectAnimatorOfFloat4;
            animatorArr[2] = objectAnimatorOfFloat5;
            animatorSet3.playTogether(animatorArr);
            groupCallActivity.actionBarAnimation.addListener(new AnonymousClass54(groupCallActivity, true ? 1 : 0));
            groupCallActivity.actionBarAnimation.start();
            ImageView imageView = groupCallActivity.renderersContainer.pipView;
            if (z2 && !isLandscapeMode) {
                z = false;
            }
            imageView.setClickable(z);
        }
        if (groupCallActivity.scrollOffsetY != fDp2) {
            groupCallActivity.setScrollOffsetY(fDp2);
        }
    }

    public static void create(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z, String str) {
        if (groupCallInstance == null) {
            if (inputPeer == null && VoIPService.getSharedInstance() == null) {
                return;
            }
            if (inputPeer != null) {
                groupCallInstance = new GroupCallActivity(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.id, false), chat, inputPeer, z, str);
            } else {
                ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                if (call == null) {
                    return;
                }
                TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                call.addSelfDummyParticipant(true);
                groupCallInstance = new GroupCallActivity(launchActivity, accountInstance, call, chat2, null, z, str);
            }
            groupCallInstance.parentActivity = launchActivity;
            AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(15));
        }
    }

    public static String getAudioOutputName(int i) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i == 0) {
            return LocaleController.getString(R.string.VoipAudioRoutingSpeaker);
        }
        if (i == 1) {
            return (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? LocaleController.getString(R.string.VoipAudioRoutingPhone) : LocaleController.getString(R.string.VoipAudioRoutingHeadset);
        }
        if (i != 2) {
            return null;
        }
        return (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? LocaleController.getString(R.string.VoipAudioRoutingBluetooth) : str;
    }

    public static String getAudioOutputToastText(int i) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i == 2) {
            return (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? LocaleController.getString(R.string.VoipAudioSwitchedToBluetooth) : LocaleController.formatString(R.string.VoipAudioSwitchedToBluetoothDevice, str);
        }
        if (i == 1) {
            return (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? LocaleController.getString(R.string.VoipAudioSwitchedToPhone) : LocaleController.getString(R.string.VoipAudioSwitchedToHeadset);
        }
        return LocaleController.getString(R.string.VoipAudioSwitchedToSpeaker);
    }

    public static boolean isGradientState(int i) {
        return !(VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) || i == 2 || i == 4 || i == 5 || i == 6 || i == 7;
    }

    public static void onLeaveClick(Context context, Runnable runnable, boolean z, boolean z2) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        ChatObject.Call call = sharedInstance.groupCall;
        long selfId = sharedInstance.getSelfId();
        if (z2 || !ChatObject.canManageCalls(chat)) {
            processOnLeave(call, false, selfId, runnable);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
        boolean zIsConference = sharedInstance.isConference();
        AlertDialog alertDialog = builder.alertDialog;
        if (zIsConference) {
            alertDialog.title = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
            alertDialog.message = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
        } else if (ChatObject.isChannelOrGiga(chat)) {
            alertDialog.title = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
            alertDialog.message = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
        } else {
            alertDialog.title = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
            alertDialog.message = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
        }
        sharedInstance.getAccount();
        CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
            CheckBoxCell checkBoxCell = new CheckBoxCell(context, 1);
            checkBoxCellArr[0] = checkBoxCell;
            checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
            if (z) {
                checkBoxCellArr[0].setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
            } else {
                checkBoxCellArr[0].setTextColor(Theme.getColor(null, Theme.key_voipgroup_actionBarItems, false));
                CheckBoxSquare checkBoxSquare = (CheckBoxSquare) checkBoxCellArr[0].getCheckBoxView();
                int i = Theme.key_voipgroup_mutedIcon;
                int i2 = Theme.key_voipgroup_listeningText;
                int i3 = Theme.key_voipgroup_nameText;
                checkBoxSquare.key1 = i;
                checkBoxSquare.key2 = i2;
                checkBoxSquare.key3 = i3;
                checkBoxSquare.invalidate();
            }
            checkBoxCellArr[0].setTag(0);
            if (sharedInstance.isConference()) {
                checkBoxCellArr[0].setText(LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertEndChat), "", false, false, false);
            } else if (ChatObject.isChannelOrGiga(chat)) {
                checkBoxCellArr[0].setText(LocaleController.getString(R.string.VoipChannelLeaveAlertEndChat), "", false, false, false);
            } else {
                checkBoxCellArr[0].setText(LocaleController.getString(R.string.VoipGroupLeaveAlertEndChat), "", false, false, false);
            }
            checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            linearLayoutM.addView(checkBoxCellArr[0], LayoutHelper.createLinear(-1, -2));
            checkBoxCellArr[0].setOnClickListener(new ProfileActivity$$ExternalSyntheticLambda60(checkBoxCellArr, 3));
        }
        builder.setView(linearLayoutM);
        alertDialog.dialogButtonColorKey = Theme.key_voipgroup_listeningText;
        builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupLeave), new ChatActivity$$ExternalSyntheticLambda299(call, checkBoxCellArr, selfId, runnable, 5));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        if (z) {
            alertDialog.dimEnabled = false;
        }
        if (z) {
            if (Build.VERSION.SDK_INT >= 26) {
                alertDialog.getWindow().setType(2038);
            } else {
                alertDialog.getWindow().setType(2003);
            }
            alertDialog.getWindow().clearFlags(2);
        }
        if (!z) {
            alertDialog.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_dialogBackground, false));
        }
        alertDialog.show();
        if (z) {
            return;
        }
        TextView textView = (TextView) alertDialog.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_leaveCallMenu, false));
        }
        alertDialog.setTextColor(Theme.getColor(null, Theme.key_voipgroup_actionBarItems, false));
    }

    public static void processOnLeave(ChatObject.Call call, boolean z, long j, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z ? 1 : 0);
        }
        if (call != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(j);
            if (groupCallParticipant != null) {
                call.participants.delete(j);
                call.sortedParticipants.remove(groupCallParticipant);
                call.visibleParticipants.remove(groupCallParticipant);
                int i = 0;
                while (i < call.visibleVideoParticipants.size()) {
                    if (MessageObject.getPeerId(call.visibleVideoParticipants.get(i).participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        call.visibleVideoParticipants.remove(i);
                        i--;
                    }
                    i++;
                }
                call.call.participants_count--;
            }
            for (int i2 = 0; i2 < call.sortedParticipants.size(); i2++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = call.sortedParticipants.get(i2);
                groupCallParticipant2.lastActiveDate = groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }

    public final void applyCallParticipantUpdates(boolean z) {
        AnonymousClass9 anonymousClass9;
        ListAdapter listAdapter;
        AnonymousClass28 anonymousClass28;
        AnonymousClass9 anonymousClass10;
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        ListAdapter listAdapter2;
        int i3;
        int i4;
        AnonymousClass9 anonymousClass11;
        AnonymousClass28 anonymousClass29;
        boolean z3;
        AnonymousClass24 anonymousClass24;
        ArrayList arrayList2;
        int i5;
        ChatObject.Call call;
        ChatObject.Call call2;
        boolean z4;
        ChatObject.VideoParticipant videoParticipant;
        ChatObject.VideoParticipant videoParticipant2;
        View childAt;
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
        boolean z5;
        boolean z6;
        GroupCallActivity groupCallActivity = this;
        ListAdapter listAdapter3 = groupCallActivity.listAdapter;
        AnonymousClass28 anonymousClass210 = groupCallActivity.renderersContainer;
        if (anonymousClass210 == null || (anonymousClass9 = groupCallActivity.listView) == null || groupCallActivity.call == null || groupCallActivity.delayedGroupCallUpdated) {
            return;
        }
        if (anonymousClass210.inFullscreenMode) {
            anonymousClass210.setVisibleParticipant(true);
        }
        long peerId = MessageObject.getPeerId(groupCallActivity.call.selfPeer);
        if (peerId != MessageObject.getPeerId(groupCallActivity.selfPeer) && groupCallActivity.call.participants.get(peerId) != null) {
            groupCallActivity.selfPeer = groupCallActivity.call.selfPeer;
        }
        int childCount = anonymousClass9.getChildCount();
        int top = Integer.MAX_VALUE;
        View view = null;
        int layoutPosition = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = anonymousClass9.getChildAt(i6);
            RecyclerView.ViewHolder viewHolderFindContainingViewHolder2 = anonymousClass9.findContainingViewHolder(childAt2);
            if (viewHolderFindContainingViewHolder2 != null && viewHolderFindContainingViewHolder2.getAdapterPosition() != -1 && viewHolderFindContainingViewHolder2.getLayoutPosition() != -1 && (view == null || childAt2.getTop() < top)) {
                layoutPosition = viewHolderFindContainingViewHolder2.getLayoutPosition();
                top = childAt2.getTop();
                view = childAt2;
            }
        }
        ArrayList arrayList3 = groupCallActivity.visibleVideoParticipants;
        arrayList3.clear();
        if (!isTabletMode) {
            arrayList3.addAll(groupCallActivity.call.visibleVideoParticipants);
        } else if (anonymousClass210.inFullscreenMode) {
            arrayList3.addAll(groupCallActivity.call.visibleVideoParticipants);
            ChatObject.VideoParticipant videoParticipant3 = anonymousClass210.fullscreenParticipant;
            if (videoParticipant3 != null) {
                arrayList3.remove(videoParticipant3);
            }
        }
        if (anonymousClass9.getItemAnimator() != null && !z) {
            anonymousClass9.setItemAnimator(null);
        } else if (anonymousClass9.getItemAnimator() == null && z) {
            anonymousClass9.setItemAnimator(groupCallActivity.itemAnimator);
        }
        try {
            UpdateCallback updateCallback = new UpdateCallback(listAdapter3, 0);
            try {
                try {
                    z2 = true;
                    try {
                        try {
                            arrayList = arrayList3;
                            try {
                                i2 = layoutPosition;
                                try {
                                    anonymousClass28 = anonymousClass210;
                                    try {
                                        anonymousClass10 = anonymousClass9;
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        arrayList = arrayList;
                                                        i2 = i2;
                                                        anonymousClass28 = anonymousClass28;
                                                        i = childCount;
                                                        groupCallActivity = this;
                                                        listAdapter = listAdapter3;
                                                        try {
                                                            groupCallActivity.setOldRows(listAdapter3.encryptionRow, listAdapter3.addMemberRow, listAdapter3.usersStartRow, listAdapter3.usersEndRow, listAdapter3.invitedStartRow, listAdapter3.invitedEndRow, listAdapter3.shadyJoinStartRow, listAdapter3.shadyJoinEndRow, listAdapter3.shadyLeftStartRow, listAdapter3.shadyLeftEndRow, listAdapter3.usersVideoGridStartRow, listAdapter3.usersVideoGridEndRow, listAdapter3.videoGridDividerRow, listAdapter3.videoNotAvailableRow, listAdapter3.conferenceAddPeopleRow, listAdapter3.conferenceShareLinkRow);
                                                            listAdapter.updateRows$31();
                                                            z2 = true;
                                                            try {
                                                                DiffUtil.calculateDiff(groupCallActivity.diffUtilsCallback, true).dispatchUpdatesTo(updateCallback);
                                                                listAdapter2 = listAdapter;
                                                            } catch (Exception e) {
                                                                e = e;
                                                                FileLog.e(e);
                                                                listAdapter.updateRows$31();
                                                                listAdapter2 = listAdapter;
                                                                listAdapter2.mObservable.notifyChanged();
                                                            }
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            z2 = true;
                                                            FileLog.e(e);
                                                            listAdapter.updateRows$31();
                                                            listAdapter2 = listAdapter;
                                                            listAdapter2.mObservable.notifyChanged();
                                                            groupCallActivity.call.saveActiveDates();
                                                            if (view != null) {
                                                                int top2 = view.getTop() - anonymousClass10.getPaddingTop();
                                                                FillLastGridLayoutManager fillLastGridLayoutManager = groupCallActivity.layoutManager;
                                                                fillLastGridLayoutManager.scrollToPositionWithOffset(i2, top2, fillLastGridLayoutManager.mShouldReverseLayout);
                                                            }
                                                            ArrayList arrayList4 = groupCallActivity.oldParticipants;
                                                            arrayList4.clear();
                                                            arrayList4.addAll(groupCallActivity.call.visibleParticipants);
                                                            ArrayList arrayList5 = groupCallActivity.oldVideoParticipants;
                                                            arrayList5.clear();
                                                            ArrayList arrayList6 = arrayList;
                                                            arrayList5.addAll(arrayList6);
                                                            ArrayList arrayList7 = groupCallActivity.oldInvited;
                                                            arrayList7.clear();
                                                            arrayList7.addAll(groupCallActivity.call.invitedUsers);
                                                            ArrayList arrayList8 = groupCallActivity.oldShadyJoin;
                                                            arrayList8.clear();
                                                            arrayList8.addAll(groupCallActivity.call.shadyJoinParticipants);
                                                            ArrayList arrayList9 = groupCallActivity.oldShadyLeft;
                                                            arrayList9.clear();
                                                            arrayList9.addAll(groupCallActivity.call.shadyLeftParticipants);
                                                            groupCallActivity.oldCount = listAdapter2.rowsCount;
                                                            i3 = i;
                                                            i4 = 0;
                                                            while (i4 < i3) {
                                                                AnonymousClass9 anonymousClass12 = anonymousClass10;
                                                                childAt = anonymousClass12.getChildAt(i4);
                                                                if (childAt instanceof GroupCallUserCell) {
                                                                    if (childAt instanceof GroupCallUserCell) {
                                                                        GroupCallUserCell groupCallUserCell = (GroupCallUserCell) childAt;
                                                                        if (viewHolderFindContainingViewHolder.getAdapterPosition() != listAdapter2.rowsCount - 2) {
                                                                            z6 = true;
                                                                        } else {
                                                                            z6 = false;
                                                                        }
                                                                        groupCallUserCell.setDrawDivider(z6);
                                                                    } else {
                                                                        GroupCallInvitedCell groupCallInvitedCell = (GroupCallInvitedCell) childAt;
                                                                        if (viewHolderFindContainingViewHolder.getAdapterPosition() != listAdapter2.rowsCount - 2) {
                                                                            z5 = true;
                                                                        } else {
                                                                            z5 = false;
                                                                        }
                                                                        groupCallInvitedCell.setDrawDivider(z5);
                                                                    }
                                                                } else if (childAt instanceof GroupCallUserCell) {
                                                                    GroupCallUserCell groupCallUserCell2 = (GroupCallUserCell) childAt;
                                                                    if (viewHolderFindContainingViewHolder.getAdapterPosition() != listAdapter2.rowsCount - 2) {
                                                                        z6 = true;
                                                                    } else {
                                                                        z6 = false;
                                                                    }
                                                                    groupCallUserCell2.setDrawDivider(z6);
                                                                } else {
                                                                    GroupCallInvitedCell groupCallInvitedCell2 = (GroupCallInvitedCell) childAt;
                                                                    if (viewHolderFindContainingViewHolder.getAdapterPosition() != listAdapter2.rowsCount - 2) {
                                                                        z5 = true;
                                                                    } else {
                                                                        z5 = false;
                                                                    }
                                                                    groupCallInvitedCell2.setDrawDivider(z5);
                                                                }
                                                                i4++;
                                                                anonymousClass10 = anonymousClass12;
                                                            }
                                                            anonymousClass11 = anonymousClass10;
                                                            anonymousClass29 = anonymousClass28;
                                                            if (anonymousClass29.hasPinnedVideo) {
                                                                z3 = false;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            if (!anonymousClass29.inFullscreenMode) {
                                                            }
                                                            GroupCallFullscreenAdapter groupCallFullscreenAdapter = groupCallActivity.fullscreenAdapter;
                                                            anonymousClass24 = groupCallActivity.fullscreenUsersListView;
                                                            groupCallFullscreenAdapter.update(anonymousClass24, z2);
                                                            if (anonymousClass24.getVisibility() == 0) {
                                                                AndroidUtilities.updateVisibleRows(anonymousClass24);
                                                            }
                                                            if (isTabletMode) {
                                                                groupCallActivity.tabletGridAdapter.update(groupCallActivity.tabletVideoGridView, z2);
                                                            }
                                                            if (anonymousClass11.getVisibility() == 0) {
                                                                AndroidUtilities.updateVisibleRows(anonymousClass11);
                                                            }
                                                            arrayList2 = groupCallActivity.attachedRenderersTmp;
                                                            arrayList2.clear();
                                                            arrayList2.addAll(groupCallActivity.attachedRenderers);
                                                            for (i5 = 0; i5 < arrayList2.size(); i5++) {
                                                                ((GroupCallMiniTextureView) arrayList2.get(i5)).updateAttachState(z2);
                                                            }
                                                            call = groupCallActivity.call;
                                                            if (call != null) {
                                                                call.participants.get(MessageObject.getPeerId(videoParticipant.participant.peer));
                                                            }
                                                            call2 = groupCallActivity.call;
                                                            if (call2 != null) {
                                                                z4 = false;
                                                            } else {
                                                                z4 = false;
                                                            }
                                                            groupCallActivity.animatorHasVideo.setValue(z4, z);
                                                            if (z4 != groupCallActivity.hasVideo) {
                                                                groupCallActivity.hasVideo = z4;
                                                                if (isTabletMode) {
                                                                    groupCallActivity.containerView.requestLayout();
                                                                }
                                                            }
                                                        }
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        z2 = true;
                                                        groupCallActivity = this;
                                                        arrayList = arrayList;
                                                        i2 = i2;
                                                        anonymousClass28 = anonymousClass28;
                                                        i = childCount;
                                                        listAdapter = listAdapter3;
                                                        FileLog.e(e);
                                                        listAdapter.updateRows$31();
                                                        listAdapter2 = listAdapter;
                                                        listAdapter2.mObservable.notifyChanged();
                                                        groupCallActivity.call.saveActiveDates();
                                                        if (view != null) {
                                                            int top3 = view.getTop() - anonymousClass10.getPaddingTop();
                                                            FillLastGridLayoutManager fillLastGridLayoutManager2 = groupCallActivity.layoutManager;
                                                            fillLastGridLayoutManager2.scrollToPositionWithOffset(i2, top3, fillLastGridLayoutManager2.mShouldReverseLayout);
                                                        }
                                                        ArrayList arrayList10 = groupCallActivity.oldParticipants;
                                                        arrayList10.clear();
                                                        arrayList10.addAll(groupCallActivity.call.visibleParticipants);
                                                        ArrayList arrayList11 = groupCallActivity.oldVideoParticipants;
                                                        arrayList11.clear();
                                                        ArrayList arrayList12 = arrayList;
                                                        arrayList11.addAll(arrayList12);
                                                        ArrayList arrayList13 = groupCallActivity.oldInvited;
                                                        arrayList13.clear();
                                                        arrayList13.addAll(groupCallActivity.call.invitedUsers);
                                                        ArrayList arrayList14 = groupCallActivity.oldShadyJoin;
                                                        arrayList14.clear();
                                                        arrayList14.addAll(groupCallActivity.call.shadyJoinParticipants);
                                                        ArrayList arrayList15 = groupCallActivity.oldShadyLeft;
                                                        arrayList15.clear();
                                                        arrayList15.addAll(groupCallActivity.call.shadyLeftParticipants);
                                                        groupCallActivity.oldCount = listAdapter2.rowsCount;
                                                        i3 = i;
                                                        i4 = 0;
                                                        while (i4 < i3) {
                                                            AnonymousClass9 anonymousClass13 = anonymousClass10;
                                                            childAt = anonymousClass13.getChildAt(i4);
                                                            if (childAt instanceof GroupCallUserCell) {
                                                                if (childAt instanceof GroupCallUserCell) {
                                                                    GroupCallUserCell groupCallUserCell3 = (GroupCallUserCell) childAt;
                                                                    if (viewHolderFindContainingViewHolder.getAdapterPosition() != listAdapter2.rowsCount - 2) {
                                                                        z6 = true;
                                                                    } else {
                                                                        z6 = false;
                                                                    }
                                                                    groupCallUserCell3.setDrawDivider(z6);
                                                                } else {
                                                                    GroupCallInvitedCell groupCallInvitedCell3 = (GroupCallInvitedCell) childAt;
                                                                    if (viewHolderFindContainingViewHolder.getAdapterPosition() != listAdapter2.rowsCount - 2) {
                                                                        z5 = true;
                                                                    } else {
                                                                        z5 = false;
                                                                    }
                                                                    groupCallInvitedCell3.setDrawDivider(z5);
                                                                }
                                                            } else if (childAt instanceof GroupCallUserCell) {
                                                                GroupCallUserCell groupCallUserCell4 = (GroupCallUserCell) childAt;
                                                                if (viewHolderFindContainingViewHolder.getAdapterPosition() != listAdapter2.rowsCount - 2) {
                                                                    z6 = true;
                                                                } else {
                                                                    z6 = false;
                                                                }
                                                                groupCallUserCell4.setDrawDivider(z6);
                                                            } else {
                                                                GroupCallInvitedCell groupCallInvitedCell4 = (GroupCallInvitedCell) childAt;
                                                                if (viewHolderFindContainingViewHolder.getAdapterPosition() != listAdapter2.rowsCount - 2) {
                                                                    z5 = true;
                                                                } else {
                                                                    z5 = false;
                                                                }
                                                                groupCallInvitedCell4.setDrawDivider(z5);
                                                            }
                                                            i4++;
                                                            anonymousClass10 = anonymousClass13;
                                                        }
                                                        anonymousClass11 = anonymousClass10;
                                                        anonymousClass29 = anonymousClass28;
                                                        if (anonymousClass29.hasPinnedVideo) {
                                                            z3 = false;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                        if (!anonymousClass29.inFullscreenMode) {
                                                        }
                                                        GroupCallFullscreenAdapter groupCallFullscreenAdapter2 = groupCallActivity.fullscreenAdapter;
                                                        anonymousClass24 = groupCallActivity.fullscreenUsersListView;
                                                        groupCallFullscreenAdapter2.update(anonymousClass24, z2);
                                                        if (anonymousClass24.getVisibility() == 0) {
                                                            AndroidUtilities.updateVisibleRows(anonymousClass24);
                                                        }
                                                        if (isTabletMode) {
                                                            groupCallActivity.tabletGridAdapter.update(groupCallActivity.tabletVideoGridView, z2);
                                                        }
                                                        if (anonymousClass11.getVisibility() == 0) {
                                                            AndroidUtilities.updateVisibleRows(anonymousClass11);
                                                        }
                                                        arrayList2 = groupCallActivity.attachedRenderersTmp;
                                                        arrayList2.clear();
                                                        arrayList2.addAll(groupCallActivity.attachedRenderers);
                                                        while (i5 < arrayList2.size()) {
                                                            ((GroupCallMiniTextureView) arrayList2.get(i5)).updateAttachState(z2);
                                                        }
                                                        call = groupCallActivity.call;
                                                        if (call != null) {
                                                            call.participants.get(MessageObject.getPeerId(videoParticipant.participant.peer));
                                                        }
                                                        call2 = groupCallActivity.call;
                                                        if (call2 != null) {
                                                            z4 = false;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        groupCallActivity.animatorHasVideo.setValue(z4, z);
                                                        if (z4 != groupCallActivity.hasVideo) {
                                                            groupCallActivity.hasVideo = z4;
                                                            if (isTabletMode) {
                                                                groupCallActivity.containerView.requestLayout();
                                                            }
                                                        }
                                                    }
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    i = childCount;
                                                    z2 = true;
                                                    listAdapter = listAdapter3;
                                                    FileLog.e(e);
                                                    listAdapter.updateRows$31();
                                                    listAdapter2 = listAdapter;
                                                    listAdapter2.mObservable.notifyChanged();
                                                    groupCallActivity.call.saveActiveDates();
                                                    if (view != null) {
                                                        int top4 = view.getTop() - anonymousClass10.getPaddingTop();
                                                        FillLastGridLayoutManager fillLastGridLayoutManager3 = groupCallActivity.layoutManager;
                                                        fillLastGridLayoutManager3.scrollToPositionWithOffset(i2, top4, fillLastGridLayoutManager3.mShouldReverseLayout);
                                                    }
                                                    ArrayList arrayList16 = groupCallActivity.oldParticipants;
                                                    arrayList16.clear();
                                                    arrayList16.addAll(groupCallActivity.call.visibleParticipants);
                                                    ArrayList arrayList17 = groupCallActivity.oldVideoParticipants;
                                                    arrayList17.clear();
                                                    ArrayList arrayList18 = arrayList;
                                                    arrayList17.addAll(arrayList18);
                                                    ArrayList arrayList19 = groupCallActivity.oldInvited;
                                                    arrayList19.clear();
                                                    arrayList19.addAll(groupCallActivity.call.invitedUsers);
                                                    ArrayList arrayList110 = groupCallActivity.oldShadyJoin;
                                                    arrayList110.clear();
                                                    arrayList110.addAll(groupCallActivity.call.shadyJoinParticipants);
                                                    ArrayList arrayList111 = groupCallActivity.oldShadyLeft;
                                                    arrayList111.clear();
                                                    arrayList111.addAll(groupCallActivity.call.shadyLeftParticipants);
                                                    groupCallActivity.oldCount = listAdapter2.rowsCount;
                                                    i3 = i;
                                                    i4 = 0;
                                                    while (i4 < i3) {
                                                        AnonymousClass9 anonymousClass14 = anonymousClass10;
                                                        childAt = anonymousClass14.getChildAt(i4);
                                                        if (childAt instanceof GroupCallUserCell) {
                                                            if (childAt instanceof GroupCallUserCell) {
                                                                GroupCallUserCell groupCallUserCell5 = (GroupCallUserCell) childAt;
                                                                if (viewHolderFindContainingViewHolder.getAdapterPosition() != listAdapter2.rowsCount - 2) {
                                                                    z6 = true;
                                                                } else {
                                                                    z6 = false;
                                                                }
                                                                groupCallUserCell5.setDrawDivider(z6);
                                                            } else {
                                                                GroupCallInvitedCell groupCallInvitedCell5 = (GroupCallInvitedCell) childAt;
                                                                if (viewHolderFindContainingViewHolder.getAdapterPosition() != listAdapter2.rowsCount - 2) {
                                                                    z5 = true;
                                                                } else {
                                                                    z5 = false;
                                                                }
                                                                groupCallInvitedCell5.setDrawDivider(z5);
                                                            }
                                                        } else if (childAt instanceof GroupCallUserCell) {
                                                            GroupCallUserCell groupCallUserCell6 = (GroupCallUserCell) childAt;
                                                            if (viewHolderFindContainingViewHolder.getAdapterPosition() != listAdapter2.rowsCount - 2) {
                                                                z6 = true;
                                                            } else {
                                                                z6 = false;
                                                            }
                                                            groupCallUserCell6.setDrawDivider(z6);
                                                        } else {
                                                            GroupCallInvitedCell groupCallInvitedCell6 = (GroupCallInvitedCell) childAt;
                                                            if (viewHolderFindContainingViewHolder.getAdapterPosition() != listAdapter2.rowsCount - 2) {
                                                                z5 = true;
                                                            } else {
                                                                z5 = false;
                                                            }
                                                            groupCallInvitedCell6.setDrawDivider(z5);
                                                        }
                                                        i4++;
                                                        anonymousClass10 = anonymousClass14;
                                                    }
                                                    anonymousClass11 = anonymousClass10;
                                                    anonymousClass29 = anonymousClass28;
                                                    if (anonymousClass29.hasPinnedVideo) {
                                                        z3 = false;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    if (!anonymousClass29.inFullscreenMode) {
                                                    }
                                                    GroupCallFullscreenAdapter groupCallFullscreenAdapter3 = groupCallActivity.fullscreenAdapter;
                                                    anonymousClass24 = groupCallActivity.fullscreenUsersListView;
                                                    groupCallFullscreenAdapter3.update(anonymousClass24, z2);
                                                    if (anonymousClass24.getVisibility() == 0) {
                                                        AndroidUtilities.updateVisibleRows(anonymousClass24);
                                                    }
                                                    if (isTabletMode) {
                                                        groupCallActivity.tabletGridAdapter.update(groupCallActivity.tabletVideoGridView, z2);
                                                    }
                                                    if (anonymousClass11.getVisibility() == 0) {
                                                        AndroidUtilities.updateVisibleRows(anonymousClass11);
                                                    }
                                                    arrayList2 = groupCallActivity.attachedRenderersTmp;
                                                    arrayList2.clear();
                                                    arrayList2.addAll(groupCallActivity.attachedRenderers);
                                                    while (i5 < arrayList2.size()) {
                                                        ((GroupCallMiniTextureView) arrayList2.get(i5)).updateAttachState(z2);
                                                    }
                                                    call = groupCallActivity.call;
                                                    if (call != null) {
                                                        call.participants.get(MessageObject.getPeerId(videoParticipant.participant.peer));
                                                    }
                                                    call2 = groupCallActivity.call;
                                                    if (call2 != null) {
                                                        z4 = false;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    groupCallActivity.animatorHasVideo.setValue(z4, z);
                                                    if (z4 != groupCallActivity.hasVideo) {
                                                        groupCallActivity.hasVideo = z4;
                                                        if (isTabletMode) {
                                                            groupCallActivity.containerView.requestLayout();
                                                        }
                                                    }
                                                }
                                            } catch (Exception e5) {
                                                e = e5;
                                                i = childCount;
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            i = childCount;
                                            arrayList = arrayList;
                                            i2 = i2;
                                            anonymousClass28 = anonymousClass28;
                                            listAdapter = listAdapter3;
                                            FileLog.e(e);
                                            listAdapter.updateRows$31();
                                            listAdapter2 = listAdapter;
                                            listAdapter2.mObservable.notifyChanged();
                                            groupCallActivity.call.saveActiveDates();
                                            if (view != null) {
                                                int top5 = view.getTop() - anonymousClass10.getPaddingTop();
                                                FillLastGridLayoutManager fillLastGridLayoutManager4 = groupCallActivity.layoutManager;
                                                fillLastGridLayoutManager4.scrollToPositionWithOffset(i2, top5, fillLastGridLayoutManager4.mShouldReverseLayout);
                                            }
                                            ArrayList arrayList112 = groupCallActivity.oldParticipants;
                                            arrayList112.clear();
                                            arrayList112.addAll(groupCallActivity.call.visibleParticipants);
                                            ArrayList arrayList113 = groupCallActivity.oldVideoParticipants;
                                            arrayList113.clear();
                                            ArrayList arrayList114 = arrayList;
                                            arrayList113.addAll(arrayList114);
                                            ArrayList arrayList115 = groupCallActivity.oldInvited;
                                            arrayList115.clear();
                                            arrayList115.addAll(groupCallActivity.call.invitedUsers);
                                            ArrayList arrayList116 = groupCallActivity.oldShadyJoin;
                                            arrayList116.clear();
                                            arrayList116.addAll(groupCallActivity.call.shadyJoinParticipants);
                                            ArrayList arrayList117 = groupCallActivity.oldShadyLeft;
                                            arrayList117.clear();
                                            arrayList117.addAll(groupCallActivity.call.shadyLeftParticipants);
                                            groupCallActivity.oldCount = listAdapter2.rowsCount;
                                            i3 = i;
                                            i4 = 0;
                                            while (i4 < i3) {
                                                AnonymousClass9 anonymousClass15 = anonymousClass10;
                                                childAt = anonymousClass15.getChildAt(i4);
                                                if (childAt instanceof GroupCallUserCell) {
                                                    if (childAt instanceof GroupCallUserCell) {
                                                        GroupCallUserCell groupCallUserCell7 = (GroupCallUserCell) childAt;
                                                        if (viewHolderFindContainingViewHolder.getAdapterPosition() != listAdapter2.rowsCount - 2) {
                                                            z6 = true;
                                                        } else {
                                                            z6 = false;
                                                        }
                                                        groupCallUserCell7.setDrawDivider(z6);
                                                    } else {
                                                        GroupCallInvitedCell groupCallInvitedCell7 = (GroupCallInvitedCell) childAt;
                                                        if (viewHolderFindContainingViewHolder.getAdapterPosition() != listAdapter2.rowsCount - 2) {
                                                            z5 = true;
                                                        } else {
                                                            z5 = false;
                                                        }
                                                        groupCallInvitedCell7.setDrawDivider(z5);
                                                    }
                                                } else if (childAt instanceof GroupCallUserCell) {
                                                    GroupCallUserCell groupCallUserCell8 = (GroupCallUserCell) childAt;
                                                    if (viewHolderFindContainingViewHolder.getAdapterPosition() != listAdapter2.rowsCount - 2) {
                                                        z6 = true;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    groupCallUserCell8.setDrawDivider(z6);
                                                } else {
                                                    GroupCallInvitedCell groupCallInvitedCell8 = (GroupCallInvitedCell) childAt;
                                                    if (viewHolderFindContainingViewHolder.getAdapterPosition() != listAdapter2.rowsCount - 2) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    groupCallInvitedCell8.setDrawDivider(z5);
                                                }
                                                i4++;
                                                anonymousClass10 = anonymousClass15;
                                            }
                                            anonymousClass11 = anonymousClass10;
                                            anonymousClass29 = anonymousClass28;
                                            if (anonymousClass29.hasPinnedVideo) {
                                                z3 = false;
                                            } else {
                                                z3 = false;
                                            }
                                            if (!anonymousClass29.inFullscreenMode) {
                                            }
                                            GroupCallFullscreenAdapter groupCallFullscreenAdapter4 = groupCallActivity.fullscreenAdapter;
                                            anonymousClass24 = groupCallActivity.fullscreenUsersListView;
                                            groupCallFullscreenAdapter4.update(anonymousClass24, z2);
                                            if (anonymousClass24.getVisibility() == 0) {
                                                AndroidUtilities.updateVisibleRows(anonymousClass24);
                                            }
                                            if (isTabletMode) {
                                                groupCallActivity.tabletGridAdapter.update(groupCallActivity.tabletVideoGridView, z2);
                                            }
                                            if (anonymousClass11.getVisibility() == 0) {
                                                AndroidUtilities.updateVisibleRows(anonymousClass11);
                                            }
                                            arrayList2 = groupCallActivity.attachedRenderersTmp;
                                            arrayList2.clear();
                                            arrayList2.addAll(groupCallActivity.attachedRenderers);
                                            while (i5 < arrayList2.size()) {
                                                ((GroupCallMiniTextureView) arrayList2.get(i5)).updateAttachState(z2);
                                            }
                                            call = groupCallActivity.call;
                                            if (call != null) {
                                                call.participants.get(MessageObject.getPeerId(videoParticipant.participant.peer));
                                            }
                                            call2 = groupCallActivity.call;
                                            if (call2 != null) {
                                                z4 = false;
                                            } else {
                                                z4 = false;
                                            }
                                            groupCallActivity.animatorHasVideo.setValue(z4, z);
                                            if (z4 != groupCallActivity.hasVideo) {
                                                groupCallActivity.hasVideo = z4;
                                                if (isTabletMode) {
                                                    groupCallActivity.containerView.requestLayout();
                                                }
                                            }
                                        }
                                    } catch (Exception e7) {
                                        e = e7;
                                        anonymousClass10 = anonymousClass9;
                                    }
                                } catch (Exception e8) {
                                    e = e8;
                                    anonymousClass28 = anonymousClass210;
                                    anonymousClass10 = anonymousClass9;
                                    i = childCount;
                                    arrayList = arrayList;
                                    i2 = i2;
                                }
                            } catch (Exception e9) {
                                e = e9;
                                i2 = layoutPosition;
                                anonymousClass28 = anonymousClass210;
                                anonymousClass10 = anonymousClass9;
                                i = childCount;
                                arrayList = arrayList;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            listAdapter = listAdapter3;
                            arrayList = arrayList3;
                            i2 = layoutPosition;
                            anonymousClass28 = anonymousClass210;
                            anonymousClass10 = anonymousClass9;
                            i = childCount;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        listAdapter = listAdapter3;
                        i = childCount;
                        arrayList = arrayList3;
                        i2 = layoutPosition;
                        anonymousClass28 = anonymousClass210;
                        anonymousClass10 = anonymousClass9;
                    }
                } catch (Exception e12) {
                    e = e12;
                    listAdapter = listAdapter3;
                    i = childCount;
                    arrayList = arrayList3;
                    i2 = layoutPosition;
                    anonymousClass28 = anonymousClass210;
                    anonymousClass10 = anonymousClass9;
                }
            } catch (Exception e13) {
                e = e13;
                listAdapter = listAdapter3;
                anonymousClass10 = anonymousClass9;
                i = childCount;
                arrayList = arrayList3;
                i2 = layoutPosition;
                anonymousClass28 = anonymousClass210;
            }
        } catch (Exception e14) {
            e = e14;
            listAdapter = listAdapter3;
            anonymousClass28 = anonymousClass210;
            anonymousClass10 = anonymousClass9;
            i = childCount;
            arrayList = arrayList3;
            i2 = layoutPosition;
        }
        groupCallActivity.call.saveActiveDates();
        if (view != null) {
            int top6 = view.getTop() - anonymousClass10.getPaddingTop();
            FillLastGridLayoutManager fillLastGridLayoutManager5 = groupCallActivity.layoutManager;
            fillLastGridLayoutManager5.scrollToPositionWithOffset(i2, top6, fillLastGridLayoutManager5.mShouldReverseLayout);
        }
        ArrayList arrayList118 = groupCallActivity.oldParticipants;
        arrayList118.clear();
        arrayList118.addAll(groupCallActivity.call.visibleParticipants);
        ArrayList arrayList119 = groupCallActivity.oldVideoParticipants;
        arrayList119.clear();
        ArrayList arrayList1110 = arrayList;
        arrayList119.addAll(arrayList1110);
        ArrayList arrayList1111 = groupCallActivity.oldInvited;
        arrayList1111.clear();
        arrayList1111.addAll(groupCallActivity.call.invitedUsers);
        ArrayList arrayList1112 = groupCallActivity.oldShadyJoin;
        arrayList1112.clear();
        arrayList1112.addAll(groupCallActivity.call.shadyJoinParticipants);
        ArrayList arrayList1113 = groupCallActivity.oldShadyLeft;
        arrayList1113.clear();
        arrayList1113.addAll(groupCallActivity.call.shadyLeftParticipants);
        groupCallActivity.oldCount = listAdapter2.rowsCount;
        i3 = i;
        i4 = 0;
        while (i4 < i3) {
            AnonymousClass9 anonymousClass16 = anonymousClass10;
            childAt = anonymousClass16.getChildAt(i4);
            if (((childAt instanceof GroupCallUserCell) || (childAt instanceof GroupCallInvitedCell)) && (viewHolderFindContainingViewHolder = anonymousClass16.findContainingViewHolder(childAt)) != null) {
                if (childAt instanceof GroupCallUserCell) {
                    GroupCallUserCell groupCallUserCell9 = (GroupCallUserCell) childAt;
                    if (viewHolderFindContainingViewHolder.getAdapterPosition() != listAdapter2.rowsCount - 2) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    groupCallUserCell9.setDrawDivider(z6);
                } else {
                    GroupCallInvitedCell groupCallInvitedCell9 = (GroupCallInvitedCell) childAt;
                    if (viewHolderFindContainingViewHolder.getAdapterPosition() != listAdapter2.rowsCount - 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    groupCallInvitedCell9.setDrawDivider(z5);
                }
            }
            i4++;
            anonymousClass10 = anonymousClass16;
        }
        anonymousClass11 = anonymousClass10;
        anonymousClass29 = anonymousClass28;
        if (anonymousClass29.hasPinnedVideo || System.currentTimeMillis() - anonymousClass29.lastUpdateTime <= 2000 || anonymousClass29.swipeToBackGesture || anonymousClass29.isInPinchToZoomTouchMode) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!anonymousClass29.inFullscreenMode && (videoParticipant2 = anonymousClass29.fullscreenParticipant) != null && !ChatObject.Call.videoIsActive(videoParticipant2.participant, videoParticipant2.presentation, groupCallActivity.call)) {
            if (arrayList1110.isEmpty()) {
                groupCallActivity.fullscreenFor(null);
            } else if (z3) {
                groupCallActivity.fullscreenFor((ChatObject.VideoParticipant) arrayList1110.get(0));
            }
        }
        GroupCallFullscreenAdapter groupCallFullscreenAdapter5 = groupCallActivity.fullscreenAdapter;
        anonymousClass24 = groupCallActivity.fullscreenUsersListView;
        groupCallFullscreenAdapter5.update(anonymousClass24, z2);
        if (anonymousClass24.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(anonymousClass24);
        }
        if (isTabletMode) {
            groupCallActivity.tabletGridAdapter.update(groupCallActivity.tabletVideoGridView, z2);
        }
        if (anonymousClass11.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(anonymousClass11);
        }
        arrayList2 = groupCallActivity.attachedRenderersTmp;
        arrayList2.clear();
        arrayList2.addAll(groupCallActivity.attachedRenderers);
        while (i5 < arrayList2.size()) {
            ((GroupCallMiniTextureView) arrayList2.get(i5)).updateAttachState(z2);
        }
        call = groupCallActivity.call;
        if (call != null && anonymousClass29.inFullscreenMode && (videoParticipant = anonymousClass29.fullscreenParticipant) != null) {
            call.participants.get(MessageObject.getPeerId(videoParticipant.participant.peer));
        }
        call2 = groupCallActivity.call;
        if (call2 != null || call2.visibleVideoParticipants.isEmpty()) {
            z4 = false;
        } else {
            z4 = true;
        }
        groupCallActivity.animatorHasVideo.setValue(z4, z);
        if (z4 != groupCallActivity.hasVideo) {
            groupCallActivity.hasVideo = z4;
            if (isTabletMode) {
                groupCallActivity.containerView.requestLayout();
            }
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return !this.renderersContainer.inFullscreenMode;
    }

    public final boolean canManageCall() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isConference()) {
            return ChatObject.canManageCalls(this.currentChat);
        }
        ChatObject.Call call = this.call;
        return (call == null || (groupCall = call.call) == null || !groupCall.creator) ? false : true;
    }

    public final void cancelMutePress() {
        if (this.scheduled) {
            this.scheduled = false;
            AndroidUtilities.cancelRunOnUIThread(this.pressRunnable);
        }
        if (this.pressed) {
            this.pressed = false;
            MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.muteButton.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    public final void checkContentOverlayed() {
        boolean z;
        if (this.avatarPriviewTransitionInProgress) {
            z = false;
        } else {
            AnonymousClass33 anonymousClass33 = this.blurredView;
            if (anonymousClass33.getVisibility() == 0 && anonymousClass33.getAlpha() == 1.0f) {
                z = true;
            } else {
                z = false;
            }
        }
        if (this.contentFullyOverlayed != z) {
            this.contentFullyOverlayed = z;
            invalidate();
            this.containerView.invalidate();
            this.listView.invalidate();
        }
    }

    public final void checkGroupCallUi() {
        setTranslationY((-this.windowInsetsStateHolder.getAnimatedMaxBottomInset()) + this.containerView.getPaddingBottom());
        invalidate();
        checkGroupCallUiPositions_ReactionsLayout();
        checkGroupCallUiPositions_MessagesList();
        checkGroupCallUiPositions_ButtonsList();
        checkGroupCallUiPositions_FullscreenUsersList();
        checkGroupCallUiPositions_SendButton();
        setAlpha(1.0f - this.animatorHideButtons.floatValue);
        checkGroupCallUiAlpha_EnterView();
        checkGroupCallUiAlpha_ReactionsLayout();
    }

    public final void checkGroupCallUiAlpha_EnterView() {
        float f = this.windowInsetsStateHolder.keyboardVisibility.now;
        int i = f > 0.0f ? 0 : 8;
        AnonymousClass39 anonymousClass39 = this.callMessageEnterContainer;
        anonymousClass39.setAlpha(f);
        AnonymousClass38 anonymousClass38 = this.callMessageEnterUnderContainer;
        anonymousClass38.setAlpha(f);
        if (anonymousClass39.getVisibility() != i) {
            anonymousClass39.setVisibility(i);
            anonymousClass38.setVisibility(i);
            if (i == 8) {
                AnonymousClass36 anonymousClass36 = this.callMessageEnterView;
                if (anonymousClass36.isFocused()) {
                    anonymousClass36.clearFocus();
                }
            }
        }
    }

    public final void checkGroupCallUiAlpha_ReactionsLayout() {
        ReactionsContainerLayout reactionsContainerLayout = this.reactionsContainerLayout;
        if (reactionsContainerLayout != null) {
            float f = this.windowInsetsStateHolder.keyboardVisibility.now * this.animatorMessageIsEmpty.floatValue;
            reactionsContainerLayout.setAlpha(f);
            int i = f > 0.0f ? 0 : 8;
            if (this.reactionsContainerLayout.getVisibility() != i) {
                this.reactionsContainerLayout.setVisibility(i);
                if (i == 8) {
                    this.reactionsContainerLayout.reset();
                }
            }
            ReactionsContainerLayout reactionsContainerLayout2 = this.reactionsContainerLayout;
            if (reactionsContainerLayout2.skipEnterAnimation || f != 1.0f) {
                return;
            }
            reactionsContainerLayout2.skipEnterAnimation = true;
        }
    }

    public final void checkGroupCallUiPositions_ButtonsList() {
        boolean z = isTabletMode;
        AnonymousClass17 anonymousClass17 = this.buttonsContainer;
        if (z) {
            anonymousClass17.setTranslationX(0.0f);
            anonymousClass17.setTranslationY(0.0f);
            return;
        }
        boolean z2 = isLandscapeMode;
        BoolAnimator boolAnimator = this.animatorHideButtons;
        if (z2) {
            anonymousClass17.setTranslationX(boolAnimator.floatValue * AndroidUtilities.dp(94.0f));
            anonymousClass17.setTranslationY(0.0f);
        } else {
            anonymousClass17.setTranslationX(0.0f);
            anonymousClass17.setTranslationY(boolAnimator.floatValue * AndroidUtilities.dp(94.0f));
        }
    }

    public final void checkGroupCallUiPositions_FullscreenUsersList() {
        boolean z = isTabletMode;
        AnonymousClass24 anonymousClass24 = this.fullscreenUsersListView;
        if (z) {
            anonymousClass24.setTranslationX(0.0f);
            anonymousClass24.setTranslationY(0.0f);
            return;
        }
        boolean z2 = isLandscapeMode;
        BoolAnimator boolAnimator = this.animatorHideButtons;
        if (z2) {
            anonymousClass24.setTranslationX(boolAnimator.floatValue * AndroidUtilities.dp(94.0f));
            anonymousClass24.setTranslationY(0.0f);
        } else {
            anonymousClass24.setTranslationX(0.0f);
            anonymousClass24.setTranslationY(boolAnimator.floatValue * AndroidUtilities.dp(94.0f));
        }
    }

    public final void checkGroupCallUiPositions_MessagesList() {
        float fDp;
        float f = this.animatorMessageInputHeight.factor;
        WindowInsetsStateHolder windowInsetsStateHolder = this.windowInsetsStateHolder;
        float f2 = -((windowInsetsStateHolder.getAnimatedMaxBottomInset() - this.containerView.getPaddingBottom()) + f + (AndroidUtilities.dp(68.0f) * this.animatorMessageIsEmpty.floatValue) + AndroidUtilities.dp(10.0f));
        if (isTabletMode) {
            fDp = (1.0f - this.animatorHasVideo.floatValue) * AndroidUtilities.dp(-91.0f);
        } else {
            fDp = isLandscapeMode ? 0.0f : ((this.animatorHideButtons.floatValue * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.renderersContainer.progressToFullscreenMode)) - AndroidUtilities.dp(91.0f);
        }
        float fLerp = AndroidUtilities.lerp(fDp, f2, windowInsetsStateHolder.keyboardVisibility.now);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.scrollOffsetY) + fLerp) - this.backgroundPaddingTop;
        float fMax = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        GroupCallMessagesListView groupCallMessagesListView = this.groupCallMessagesListView;
        groupCallMessagesListView.setTranslationY(fLerp);
        groupCallMessagesListView.setVisibleHeight((int) fMax);
    }

    public final void checkGroupCallUiPositions_ReactionsLayout() {
        if (this.reactionsContainerLayout != null) {
            this.reactionsContainerLayout.setTranslationY((-this.windowInsetsStateHolder.getAnimatedMaxBottomInset()) + this.containerView.getPaddingBottom() + ((-this.animatorMessageIsEmpty.floatValue) * AndroidUtilities.dp(64.0f)));
        }
    }

    public final void checkGroupCallUiPositions_SendButton() {
        float f = this.animatorMessageIsEmpty.floatValue;
        float fLerp = AndroidUtilities.lerp(0.25f, 1.0f, f);
        ImageView imageView = this.callMessageHideButton;
        imageView.setScaleX(fLerp);
        imageView.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f));
        imageView.setAlpha(f);
        imageView.setClickable(f > 0.9f);
        float f2 = 1.0f - f;
        float fLerp2 = AndroidUtilities.lerp(0.25f, 1.0f, f2);
        ImageView imageView2 = this.callMessageSendButton;
        imageView2.setScaleX(fLerp2);
        imageView2.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f2));
        imageView2.setAlpha(f2);
        imageView2.setClickable(f2 > 0.9f);
    }

    public final void checkInsets$2() {
        checkGroupCallUiPositions_MessagesList();
        checkGroupCallUiAlpha_ReactionsLayout();
        checkGroupCallUiAlpha_EnterView();
        setTranslationY((-this.windowInsetsStateHolder.getAnimatedMaxBottomInset()) + this.containerView.getPaddingBottom());
        invalidate();
        checkGroupCallUiPositions_ReactionsLayout();
        this.containerView.invalidate();
    }

    public final void clearScrimView() {
        GroupCallMiniTextureView groupCallMiniTextureView = this.scrimRenderer;
        if (groupCallMiniTextureView != null) {
            groupCallMiniTextureView.textureView.setRoundCorners(AndroidUtilities.dp(8.0f));
            GroupCallMiniTextureView groupCallMiniTextureView2 = this.scrimRenderer;
            groupCallMiniTextureView2.showingAsScrimView = false;
            groupCallMiniTextureView2.updateAttachState(false);
            this.scrimRenderer.invalidate();
            this.renderersContainer.invalidate();
        }
        GroupCallUserCell groupCallUserCell = this.scrimView;
        if (groupCallUserCell != null && !this.hasScrimAnchorView && groupCallUserCell.getParent() != null) {
            this.containerView.removeView(this.scrimView);
        }
        GroupCallUserCell groupCallUserCell2 = this.scrimView;
        if (groupCallUserCell2 != null) {
            groupCallUserCell2.setProgressToAvatarPreview(0.0f);
            this.scrimView.setAboutVisible(false);
            this.scrimView.getAvatarImageView().setAlpha(1.0f);
        }
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell3 = this.scrimFullscreenView;
        if (groupCallUserCell3 != null) {
            groupCallUserCell3.getAvatarImageView().setAlpha(1.0f);
        }
        this.scrimView = null;
        this.scrimGridView = null;
        this.scrimFullscreenView = null;
        this.scrimRenderer = null;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        String string;
        ChatObject.VideoParticipant videoParticipant;
        VoIPService sharedInstance;
        int i3;
        int i4;
        int i5 = NotificationCenter.groupCallUpdated;
        AnonymousClass9 anonymousClass9 = this.listView;
        int i6 = 0;
        if (i == i5) {
            Long l = (Long) objArr[1];
            ChatObject.Call call = this.call;
            if (call == null || call.call.id != l.longValue()) {
                return;
            }
            ChatObject.Call call2 = this.call;
            if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                lambda$showGiftOfferSheet$15();
                return;
            }
            long j = this.creatingServiceTime;
            AccountInstance accountInstance = this.accountInstance;
            if (j == 0 && (((i4 = this.muteButtonState) == 7 || i4 == 5 || i4 == 6) && !call2.isScheduled())) {
                try {
                    Intent intent = new Intent(this.parentActivity, (Class<?>) VoIPService.class);
                    intent.putExtra("chat_id", getChatId());
                    intent.putExtra("createGroupCall", false);
                    intent.putExtra("hasFewPeers", this.scheduleHasFewPeers);
                    intent.putExtra("peerChannelId", this.schedulePeer.channel_id);
                    intent.putExtra("peerChatId", this.schedulePeer.chat_id);
                    intent.putExtra("peerUserId", this.schedulePeer.user_id);
                    intent.putExtra("hash", this.scheduledHash);
                    intent.putExtra("peerAccessHash", this.schedulePeer.access_hash);
                    intent.putExtra("is_outgoing", true);
                    intent.putExtra("start_incall_activity", false);
                    intent.putExtra("account", accountInstance.getCurrentAccount());
                    intent.putExtra("scheduleDate", this.scheduleStartAt);
                    this.parentActivity.startService(intent);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
                this.creatingServiceTime = SystemClock.elapsedRealtime();
                AndroidUtilities.runOnUIThread(new GroupCallActivity$$ExternalSyntheticLambda8(this, 3), 3000L);
            }
            if (!this.callInitied && VoIPService.getSharedInstance() != null) {
                this.call.addSelfDummyParticipant(false);
                initCreatedGroupCall();
                VoIPService.getSharedInstance().playConnectedSound();
            }
            updateItems$1$1();
            int childCount = anonymousClass9.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = anonymousClass9.getChildAt(i7);
                if (childAt instanceof GroupCallUserCell) {
                    ((GroupCallUserCell) childAt).applyParticipantChanges(true, false);
                }
            }
            if (this.scrimView != null) {
                this.delayedGroupCallUpdated = true;
            } else {
                applyCallParticipantUpdates(true);
            }
            updateSubtitle$1();
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean z = this.muteButtonState == 4;
            updateState(true, zBooleanValue);
            updateTitle$2(true);
            if (z && ((i3 = this.muteButtonState) == 1 || i3 == 0)) {
                getUndoView().showWithAction(0L, 38, (Object) null, (Object) null, (Runnable) null, (Runnable) null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playAllowTalkSound();
                }
            }
            if (objArr.length >= 4) {
                Long l2 = (Long) objArr[3];
                long jLongValue = l2.longValue();
                if (jLongValue == 0 || isRtmpStream()) {
                    return;
                }
                if (isConference() && (sharedInstance = VoIPService.getSharedInstance()) != null && jLongValue == sharedInstance.convertingFromCallWithUserId) {
                    return;
                }
                try {
                    ArrayList<TLRPC.Dialog> allDialogs = accountInstance.getMessagesController().getAllDialogs();
                    if (allDialogs != null) {
                        int size = allDialogs.size();
                        int i8 = 0;
                        while (i8 < size) {
                            TLRPC.Dialog dialog = allDialogs.get(i8);
                            i8++;
                            if (dialog.id == jLongValue) {
                                i6 = 1;
                                break;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                if (DialogObject.isUserDialog(jLongValue)) {
                    TLRPC.User user = accountInstance.getMessagesController().getUser(l2);
                    if (user != null) {
                        if (this.call.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i6 != 0) {
                            getUndoView().showWithAction(0L, 44, user, this.currentChat, (Runnable) null, (Runnable) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-jLongValue));
                if (chat != null) {
                    if (this.call.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i6 != 0) {
                        getUndoView().showWithAction(0L, 44, chat, this.currentChat, (Runnable) null, (Runnable) null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        String[] emojis = null;
        if (i == NotificationCenter.groupCallSpeakingUsersUpdated) {
            AnonymousClass28 anonymousClass28 = this.renderersContainer;
            if (anonymousClass28.inFullscreenMode && this.call != null) {
                boolean z2 = (anonymousClass28.hasPinnedVideo || System.currentTimeMillis() - anonymousClass28.lastUpdateTime <= 2000 || anonymousClass28.swipeToBackGesture || anonymousClass28.isInPinchToZoomTouchMode) ? false : true;
                ChatObject.Call call3 = this.call;
                if (call3 != null && anonymousClass28.inFullscreenMode && (videoParticipant = anonymousClass28.fullscreenParticipant) != null && call3.participants.get(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    z2 = true;
                }
                if (z2) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i9 = 0;
                    while (true) {
                        ArrayList arrayList = this.visibleVideoParticipants;
                        if (i9 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i9);
                        if (this.call.currentSpeakingPeers.get(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && anonymousClass28.fullscreenPeerId != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                                videoParticipant2 = videoParticipant3;
                            }
                        }
                        i9++;
                    }
                    if (videoParticipant2 != null) {
                        fullscreenFor(videoParticipant2);
                    }
                }
            }
            anonymousClass28.setVisibleParticipant(true);
            updateSubtitle$1();
            return;
        }
        if (i == NotificationCenter.webRtcMicAmplitudeEvent) {
            setMicAmplitude(((Float) objArr[0]).floatValue());
            return;
        }
        if (i == NotificationCenter.needShowAlert) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    string = ChatObject.isChannelOrGiga(this.currentChat) ? LocaleController.getString(R.string.VoipChannelTooMuch) : LocaleController.getString(R.string.VoipGroupTooMuch);
                } else if ("ANONYMOUS_CALLS_DISABLED".equals(str) || "GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    string = ChatObject.isChannelOrGiga(this.currentChat) ? LocaleController.getString(R.string.VoipChannelJoinAnonymousAdmin) : LocaleController.getString(R.string.VoipGroupJoinAnonymousAdmin);
                } else {
                    string = LocaleController.getString(R.string.ErrorOccurred) + "\n" + str;
                }
                AlertDialog.Builder builderCreateSimpleAlert = AlertsCreator.createSimpleAlert(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                builderCreateSimpleAlert.alertDialog.setOnDismissListener(new GroupCallActivity$$ExternalSyntheticLambda32(this, 1));
                try {
                    builderCreateSimpleAlert.show();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        if (i == NotificationCenter.didEndCall) {
            if (VoIPService.getSharedInstance() == null) {
                lambda$showGiftOfferSheet$15();
                return;
            }
            return;
        }
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == getChatId()) {
                updateItems$1$1();
                updateState(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.selfPeer);
            ChatObject.Call call4 = this.call;
            if (call4 == null || chatFull.id != (-peerId) || (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.get(peerId)) == null) {
                return;
            }
            groupCallParticipant2.about = chatFull.about;
            applyCallParticipantUpdates(true);
            AndroidUtilities.updateVisibleRows(anonymousClass9);
            if (this.currentOptionsLayout != null) {
                while (i6 < this.currentOptionsLayout.getChildCount()) {
                    View childAt2 = this.currentOptionsLayout.getChildAt(i6);
                    if ((childAt2 instanceof ActionBarMenuSubItem) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                        ((ActionBarMenuSubItem) childAt2).setTextAndIcon(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant2.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription), TextUtils.isEmpty(groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i6++;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.didLoadChatAdmins) {
            if (((Long) objArr[0]).longValue() == getChatId()) {
                updateItems$1$1();
                updateState(isShowing(), false);
                return;
            }
            return;
        }
        if (i == NotificationCenter.applyGroupCallVisibleParticipants) {
            int childCount2 = anonymousClass9.getChildCount();
            long jLongValue2 = ((Long) objArr[0]).longValue();
            while (i6 < childCount2) {
                RecyclerView.ViewHolder viewHolderFindContainingViewHolder = anonymousClass9.findContainingViewHolder(anonymousClass9.getChildAt(i6));
                if (viewHolderFindContainingViewHolder != null) {
                    View view = viewHolderFindContainingViewHolder.itemView;
                    if (view instanceof GroupCallUserCell) {
                        GroupCallUserCell groupCallUserCell = (GroupCallUserCell) view;
                        if (groupCallUserCell.getParticipant() != null) {
                            groupCallUserCell.getParticipant().lastVisibleDate = jLongValue2;
                        }
                    }
                }
                i6++;
            }
            return;
        }
        if (i == NotificationCenter.userInfoDidLoad) {
            Long l3 = (Long) objArr[0];
            long peerId2 = MessageObject.getPeerId(this.selfPeer);
            if (this.call == null || peerId2 != l3.longValue() || (groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.participants.get(peerId2)) == null) {
                return;
            }
            groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
            applyCallParticipantUpdates(true);
            AndroidUtilities.updateVisibleRows(anonymousClass9);
            if (this.currentOptionsLayout != null) {
                while (i6 < this.currentOptionsLayout.getChildCount()) {
                    View childAt3 = this.currentOptionsLayout.getChildAt(i6);
                    if ((childAt3 instanceof ActionBarMenuSubItem) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                        ((ActionBarMenuSubItem) childAt3).setTextAndIcon(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant.about) ? R.string.VoipAddBio : R.string.VoipEditBio), TextUtils.isEmpty(groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i6++;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.mainUserInfoChanged) {
            applyCallParticipantUpdates(true);
            AndroidUtilities.updateVisibleRows(anonymousClass9);
            return;
        }
        if (i == NotificationCenter.updateInterfaces) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & iIntValue) != 0) {
                applyCallParticipantUpdates(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & iIntValue) == 0 && (iIntValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) == 0) {
                return;
            }
            AndroidUtilities.updateVisibleRows(anonymousClass9);
            return;
        }
        if (i == NotificationCenter.groupCallScreencastStateChanged) {
            AnonymousClass47 anonymousClass47 = this.previewDialog;
            if (anonymousClass47 != null) {
                anonymousClass47.dismiss(true, true);
            }
            updateItems$1$1();
            return;
        }
        if (i == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            CallEncryptionCellDrawable callEncryptionCellDrawable = this.encryptionDrawable;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                emojis = conferenceCall.getEmojis();
            }
            callEncryptionCellDrawable.setEmojis(emojis);
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        this.parentActivity.onUserLeaveHintListeners.remove(this.onUserLeaveHintListener);
        this.parentActivity.setRequestedOrientation(-1);
        groupCallUiVisible = false;
        GroupVoipInviteAlert groupVoipInviteAlert = this.groupVoipInviteAlert;
        if (groupVoipInviteAlert != null) {
            groupVoipInviteAlert.lambda$showGiftOfferSheet$15();
        }
        this.delayedGroupCallUpdated = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        AccountInstance accountInstance = this.accountInstance;
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.needShowAlert);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.didLoadChatAdmins);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.applyGroupCallVisibleParticipants);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.mainUserInfoChanged);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallScreencastStateChanged);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallSpeakingUsersUpdated);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.conferenceEmojiUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
        super.lambda$showGiftOfferSheet$15();
    }

    public final void dismissAvatarPreview(boolean z) {
        if (this.avatarPriviewTransitionInProgress || !this.avatarsPreviewShowed) {
            return;
        }
        if (z) {
            this.avatarPriviewTransitionInProgress = true;
            runAvatarPreviewTransition(false, this.scrimView);
            return;
        }
        clearScrimView();
        this.containerView.removeView(this.scrimPopupLayout);
        this.scrimPopupLayout = null;
        this.avatarPreviewContainer.setVisibility(8);
        this.containerView.invalidate();
        this.avatarsPreviewShowed = false;
        this.layoutManager.canScrollVertically = true;
        this.listView.invalidate();
        this.blurredView.setVisibility(8);
        if (this.delayedGroupCallUpdated) {
            this.delayedGroupCallUpdated = false;
            applyCallParticipantUpdates(true);
        }
        checkContentOverlayed();
    }

    @Override
    public final void dismissInternal() {
        AnonymousClass28 anonymousClass28 = this.renderersContainer;
        if (anonymousClass28 != null) {
            if (this.requestFullscreenListener != null) {
                this.listView.getViewTreeObserver().removeOnPreDrawListener(this.requestFullscreenListener);
                this.requestFullscreenListener = null;
            }
            ArrayList arrayList = this.attachedRenderersTmp;
            arrayList.clear();
            ArrayList arrayList2 = this.attachedRenderers;
            arrayList.addAll(arrayList2);
            for (int i = 0; i < arrayList.size(); i++) {
                ((GroupCallMiniTextureView) arrayList.get(i)).saveThumb();
                anonymousClass28.removeView((View) arrayList.get(i));
                ((GroupCallMiniTextureView) arrayList.get(i)).release();
                ((GroupCallMiniTextureView) arrayList.get(i)).forceDetach(true);
            }
            arrayList2.clear();
            if (anonymousClass28.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(anonymousClass28);
            }
        }
        super.dismissInternal();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (groupCallInstance == this) {
            groupCallInstance = null;
        }
        groupCallUiVisible = false;
        VoIPService.audioLevelsCallback = null;
        GroupCallPip.updateVisibility(getContext());
        ChatObject.Call call = this.call;
        if (call != null) {
            call.clearVideFramesInfo();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.parentActivity == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean zIsSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.parentActivity.getSystemService("audio");
            boolean z = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z);
            if (zIsSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                getUndoView().showWithAction(0L, z ? 42 : 43, (Object) null, (Object) null, (Runnable) null, (Runnable) null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void fullscreenFor(final ChatObject.VideoParticipant videoParticipant) {
        LinearLayoutManager linearLayoutManager;
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null) {
            this.parentActivity.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            AnonymousClass28 anonymousClass28 = this.renderersContainer;
            if (anonymousClass28.fullscreenAnimator != null) {
                return;
            }
            boolean z = isTabletMode;
            AnonymousClass9 anonymousClass9 = this.listView;
            int i = 0;
            if (!z) {
                if (this.requestFullscreenListener != null) {
                    anonymousClass9.getViewTreeObserver().removeOnPreDrawListener(this.requestFullscreenListener);
                    this.requestFullscreenListener = null;
                }
                if (videoParticipant == null) {
                    if (anonymousClass9.getVisibility() == 0) {
                        ViewTreeObserver viewTreeObserver = anonymousClass9.getViewTreeObserver();
                        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() {
                            @Override
                            public final boolean onPreDraw() {
                                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                                groupCallActivity.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                                groupCallActivity.renderersContainer.requestFullscreen(null);
                                AndroidUtilities.updateVisibleRows(groupCallActivity.fullscreenUsersListView);
                                ((BottomSheet) groupCallActivity).containerView.requestLayout();
                                return false;
                            }
                        };
                        this.requestFullscreenListener = onPreDrawListener;
                        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
                        return;
                    }
                    anonymousClass9.setVisibility(0);
                    applyCallParticipantUpdates(false);
                    this.delayedGroupCallUpdated = true;
                    ViewTreeObserver viewTreeObserver2 = anonymousClass9.getViewTreeObserver();
                    ViewTreeObserver.OnPreDrawListener onPreDrawListener2 = new ViewTreeObserver.OnPreDrawListener() {
                        @Override
                        public final boolean onPreDraw() {
                            GroupCallActivity groupCallActivity = GroupCallActivity.this;
                            groupCallActivity.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                            groupCallActivity.renderersContainer.requestFullscreen(null);
                            AndroidUtilities.updateVisibleRows(groupCallActivity.fullscreenUsersListView);
                            ((BottomSheet) groupCallActivity).containerView.requestLayout();
                            return false;
                        }
                    };
                    this.requestFullscreenListener = onPreDrawListener2;
                    viewTreeObserver2.addOnPreDrawListener(onPreDrawListener2);
                    return;
                }
                AnonymousClass24 anonymousClass24 = this.fullscreenUsersListView;
                if (anonymousClass24.getVisibility() == 0) {
                    anonymousClass28.requestFullscreen(videoParticipant);
                    AndroidUtilities.updateVisibleRows(anonymousClass24);
                    return;
                }
                anonymousClass24.setVisibility(0);
                GroupCallFullscreenAdapter groupCallFullscreenAdapter = this.fullscreenAdapter;
                groupCallFullscreenAdapter.update(anonymousClass24, false);
                this.delayedGroupCallUpdated = true;
                if (!anonymousClass28.inFullscreenMode && (linearLayoutManager = (LinearLayoutManager) anonymousClass24.getLayoutManager()) != null) {
                    while (true) {
                        ArrayList arrayList = groupCallFullscreenAdapter.videoParticipants;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        if (((ChatObject.VideoParticipant) arrayList.get(i)).equals(videoParticipant)) {
                            linearLayoutManager.scrollToPositionWithOffset(i, AndroidUtilities.dp(13.0f));
                            break;
                        }
                        i++;
                    }
                }
                ViewTreeObserver viewTreeObserver3 = anonymousClass9.getViewTreeObserver();
                ViewTreeObserver.OnPreDrawListener onPreDrawListener3 = new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public final boolean onPreDraw() {
                        GroupCallActivity groupCallActivity = GroupCallActivity.this;
                        groupCallActivity.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                        groupCallActivity.requestFullscreenListener = null;
                        groupCallActivity.renderersContainer.requestFullscreen(videoParticipant);
                        AndroidUtilities.updateVisibleRows(groupCallActivity.fullscreenUsersListView);
                        ((BottomSheet) groupCallActivity).containerView.requestLayout();
                        return false;
                    }
                };
                this.requestFullscreenListener = onPreDrawListener3;
                viewTreeObserver3.addOnPreDrawListener(onPreDrawListener3);
                return;
            }
            if (this.requestFullscreenListener != null) {
                anonymousClass9.getViewTreeObserver().removeOnPreDrawListener(this.requestFullscreenListener);
                this.requestFullscreenListener = null;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = this.attachedRenderers;
            ArrayList arrayList4 = this.attachedRenderersTmp;
            GroupCallTabletGridAdapter groupCallTabletGridAdapter = this.tabletGridAdapter;
            if (videoParticipant == null) {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                    final GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) arrayList4.get(i2);
                    GroupCallGridCell groupCallGridCell = groupCallMiniTextureView.primaryView;
                    if (groupCallGridCell != null) {
                        groupCallGridCell.setRenderer(null);
                        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = groupCallMiniTextureView.secondaryView;
                        if (groupCallUserCell != null) {
                            groupCallUserCell.setRenderer(null);
                        }
                        GroupCallGridCell groupCallGridCell2 = groupCallMiniTextureView.tabletGridView;
                        if (groupCallGridCell2 != null) {
                            groupCallGridCell2.setRenderer(null);
                        }
                        arrayList2.add(groupCallMiniTextureView.participant);
                        groupCallMiniTextureView.forceDetach(false);
                        groupCallMiniTextureView.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public final void onAnimationEnd(Animator animator) {
                                GroupCallMiniTextureView groupCallMiniTextureView2 = groupCallMiniTextureView;
                                if (groupCallMiniTextureView2.getParent() != null) {
                                    ((BottomSheet) GroupCallActivity.this).containerView.removeView(groupCallMiniTextureView2);
                                }
                            }
                        });
                    }
                }
                this.listViewVideoVisibility = false;
                groupCallTabletGridAdapter.setVisibility(this.tabletVideoGridView, true, true);
            } else {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                    final GroupCallMiniTextureView groupCallMiniTextureView2 = (GroupCallMiniTextureView) arrayList4.get(i3);
                    if (groupCallMiniTextureView2.tabletGridView != null && ((videoParticipant2 = groupCallMiniTextureView2.participant) == null || !videoParticipant2.equals(videoParticipant))) {
                        arrayList2.add(groupCallMiniTextureView2.participant);
                        groupCallMiniTextureView2.forceDetach(false);
                        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell2 = groupCallMiniTextureView2.secondaryView;
                        if (groupCallUserCell2 != null) {
                            groupCallUserCell2.setRenderer(null);
                        }
                        GroupCallGridCell groupCallGridCell3 = groupCallMiniTextureView2.primaryView;
                        if (groupCallGridCell3 != null) {
                            groupCallGridCell3.setRenderer(null);
                        }
                        groupCallMiniTextureView2.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public final void onAnimationEnd(Animator animator) {
                                GroupCallMiniTextureView groupCallMiniTextureView3 = groupCallMiniTextureView2;
                                if (groupCallMiniTextureView3.getParent() != null) {
                                    ((BottomSheet) GroupCallActivity.this).containerView.removeView(groupCallMiniTextureView3);
                                }
                            }
                        });
                    }
                }
                this.listViewVideoVisibility = true;
                groupCallTabletGridAdapter.visible = false;
                if (!arrayList2.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda13(11, this, arrayList2));
                }
            }
            final boolean z2 = !anonymousClass28.inFullscreenMode;
            ViewTreeObserver viewTreeObserver4 = anonymousClass9.getViewTreeObserver();
            ViewTreeObserver.OnPreDrawListener onPreDrawListener4 = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    AnonymousClass9 anonymousClass10 = groupCallActivity.listView;
                    anonymousClass10.getViewTreeObserver().removeOnPreDrawListener(this);
                    groupCallActivity.requestFullscreenListener = null;
                    AnonymousClass28 anonymousClass29 = groupCallActivity.renderersContainer;
                    ChatObject.VideoParticipant videoParticipant3 = videoParticipant;
                    anonymousClass29.requestFullscreen(videoParticipant3);
                    if (groupCallActivity.delayedGroupCallUpdated) {
                        groupCallActivity.delayedGroupCallUpdated = false;
                        groupCallActivity.applyCallParticipantUpdates(true);
                        if (z2 && videoParticipant3 != null) {
                            anonymousClass10.scrollToPosition(0);
                        }
                        groupCallActivity.delayedGroupCallUpdated = true;
                    } else {
                        groupCallActivity.applyCallParticipantUpdates(true);
                    }
                    ((BottomSheet) groupCallActivity).containerView.requestLayout();
                    return false;
                }
            };
            this.requestFullscreenListener = onPreDrawListener4;
            viewTreeObserver4.addOnPreDrawListener(onPreDrawListener4);
        }
    }

    public final int getAudioOutputValue() {
        Integer num = this.cacheAudioOutputValue;
        if (num != null) {
            return num.intValue();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return 0;
        }
        int currentAudioRoute = sharedInstance.getCurrentAudioRoute();
        if (currentAudioRoute != 0) {
            return currentAudioRoute != 1 ? 2 : 0;
        }
        return 1;
    }

    public final long getChatId() {
        TLRPC.Chat chat = this.currentChat;
        if (chat == null) {
            return 0L;
        }
        return chat.id;
    }

    public final void getLink(boolean z) {
        String strM;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        AccountInstance accountInstance = this.accountInstance;
        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(getChatId()));
        if (chat == null || ChatObject.isPublic(chat)) {
            if (this.call == null) {
                return;
            }
            int i = 0;
            while (i < 2) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.call.getInputGroupCall();
                exportgroupcallinvite.can_self_unmute = i == 1;
                accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new GroupCallActivity$$ExternalSyntheticLambda42(this, i, z, 0));
                i++;
            }
            return;
        }
        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(getChatId());
        String publicUsername = ChatObject.getPublicUsername(this.currentChat);
        if (TextUtils.isEmpty(publicUsername)) {
            strM = (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) ? null : tL_chatInviteExported.link;
        } else {
            strM = SurfaceContainer$$ExternalSyntheticOutline0.m(accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder());
        }
        if (!TextUtils.isEmpty(strM)) {
            openShareAlert(null, strM, true, z);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.currentChat);
        accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new DialogsActivity$50$$ExternalSyntheticLambda2(this, chatFull, z, 4));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final UndoView getUndoView() {
        if (!isTabletMode) {
            AnonymousClass28 anonymousClass28 = this.renderersContainer;
            if (anonymousClass28.inFullscreenMode) {
                return anonymousClass28.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.undoView;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.hide(2, true);
            this.containerView.removeView(undoViewArr[0]);
            this.containerView.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void initCreatedGroupCall() {
        VoIPService sharedInstance;
        if (this.callInitied || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        this.callInitied = true;
        this.oldParticipants.addAll(this.call.visibleParticipants);
        this.oldVideoParticipants.addAll(this.visibleVideoParticipants);
        this.oldInvited.addAll(this.call.invitedUsers);
        this.oldShadyJoin.addAll(this.call.shadyJoinParticipants);
        this.oldShadyLeft.addAll(this.call.shadyLeftParticipants);
        this.currentCallState = sharedInstance.getCallState();
        if (this.call == null) {
            ChatObject.Call call = sharedInstance.groupCall;
            this.call = call;
            this.fullscreenAdapter.groupCall = call;
            this.renderersContainer.setGroupCall(call);
            this.tabletGridAdapter.groupCall = this.call;
        }
        GroupCallMessagesListView groupCallMessagesListView = this.groupCallMessagesListView;
        if (groupCallMessagesListView != null) {
            groupCallMessagesListView.setGroupCall(this.accountInstance.getCurrentAccount(), this.call.getInputGroupCall(false));
        }
        this.actionBar.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
        this.call.saveActiveDates();
        VoIPService.getSharedInstance().registerStateListener(this);
        AnonymousClass8 anonymousClass8 = this.scheduleTimeTextView;
        if (anonymousClass8 == null || anonymousClass8.getVisibility() != 0) {
            return;
        }
        this.leaveButton.setData(R.drawable.calls_decline, -1, Theme.getColor(null, Theme.key_voipgroup_leaveButton, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
        updateSpeakerPhoneIcon(true);
        this.leaveItem.setText(LocaleController.getString(ChatObject.isChannelOrGiga(this.currentChat) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat));
        AnonymousClass9 anonymousClass9 = this.listView;
        anonymousClass9.setVisibility(0);
        ActionBarMenuItem actionBarMenuItem = this.pipItem;
        actionBarMenuItem.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(anonymousClass9, (Property<AnonymousClass9, Float>) property, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(anonymousClass9, (Property<AnonymousClass9, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(anonymousClass8, (Property<AnonymousClass8, Float>) property2, 0.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(anonymousClass8, (Property<AnonymousClass8, Float>) property3, 0.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(anonymousClass8, (Property<AnonymousClass8, Float>) property, 0.0f);
        SimpleTextView simpleTextView = this.scheduleStartInTextView;
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(simpleTextView, (Property<SimpleTextView, Float>) property2, 0.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(simpleTextView, (Property<SimpleTextView, Float>) property3, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(simpleTextView, (Property<SimpleTextView, Float>) property, 0.0f);
        SimpleTextView simpleTextView2 = this.scheduleStartAtTextView;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimatorOfFloat7, objectAnimatorOfFloat8, ObjectAnimator.ofFloat(simpleTextView2, (Property<SimpleTextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(simpleTextView2, (Property<SimpleTextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(simpleTextView2, (Property<SimpleTextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(actionBarMenuItem, (Property<ActionBarMenuItem, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(actionBarMenuItem, (Property<ActionBarMenuItem, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(actionBarMenuItem, (Property<ActionBarMenuItem, Float>) property, 0.0f, 1.0f));
        animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        animatorSet.addListener(new AnonymousClass54(this, 0));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public final void inviteUserToCall(final long j, final boolean z) {
        if (this.call != null) {
            AccountInstance accountInstance = this.accountInstance;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j));
            if (user != null) {
                final AlertDialog[] alertDialogArr = {new AlertDialog(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.call.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int iSendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AlertDialog[] alertDialogArr2 = alertDialogArr;
                        GroupCallActivity groupCallActivity = this.f$0;
                        long j2 = j;
                        if (tLObject != null) {
                            groupCallActivity.accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda121(groupCallActivity, j2, alertDialogArr2, user, 29));
                        } else {
                            groupCallActivity.getClass();
                            AndroidUtilities.runOnUIThread(new GroupCallActivity$$ExternalSyntheticLambda88(groupCallActivity, alertDialogArr2, z, tL_error, j2, invitetogroupcall));
                        }
                    }
                });
                if (iSendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda17(this, alertDialogArr, iSendRequest, 20), 500L);
                }
            }
        }
    }

    public final boolean isBulletinTop() {
        float fMin;
        int iDp = AndroidUtilities.dp(74.0f);
        float f = this.scrollOffsetY - iDp;
        if (this.backgroundPaddingTop + f < ActionBar.getCurrentActionBarHeight()) {
            fMin = Math.min(1.0f, ((ActionBar.getCurrentActionBarHeight() - f) - this.backgroundPaddingTop) / ((iDp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
        } else {
            fMin = 0.0f;
        }
        return fMin > 0.5f;
    }

    public final boolean isConference() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return sharedInstance != null && sharedInstance.isConference();
    }

    public final boolean isRtmpLandscapeMode() {
        return isRtmpStream() && !this.call.visibleVideoParticipants.isEmpty() && (this.call.visibleVideoParticipants.get(0).aspectRatio == 0.0f || this.call.visibleVideoParticipants.get(0).aspectRatio >= 1.0f);
    }

    public final boolean isRtmpStream() {
        ChatObject.Call call = this.call;
        return call != null && call.call.rtmp_stream;
    }

    public final void lambda$inviteUserToCall$62(AlertDialog[] alertDialogArr, boolean z, TLRPC.TL_error tL_error, long j, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
        if (z && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            processSelectedOption(null, j, 3);
            return;
        }
        AlertsCreator.processError(this.currentAccount, tL_error, (BaseFragment) ArticleViewer.IBlock.CC.m((ActionBarLayout) this.parentActivity.getActionBarLayout(), 1, ((ActionBarLayout) this.parentActivity.getActionBarLayout()).getFragmentStack()), invitetogroupcall, new Object[0]);
    }

    public final void lambda$new$10(float[] fArr, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.call.participantsBySources.get(iArr[i]);
            if (groupCallParticipant != null) {
                AnonymousClass28 anonymousClass28 = this.renderersContainer;
                if (anonymousClass28.inFullscreenMode) {
                    int i2 = 0;
                    while (true) {
                        AnonymousClass24 anonymousClass24 = this.fullscreenUsersListView;
                        if (i2 >= anonymousClass24.getChildCount()) {
                            break;
                        }
                        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) anonymousClass24.getChildAt(i2);
                        if (MessageObject.getPeerId(groupCallUserCell.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            groupCallUserCell.setAmplitude(fArr[i] * 15.0f);
                        }
                        i2++;
                    }
                } else {
                    int iIndexOf = (this.delayedGroupCallUpdated ? this.oldParticipants : this.call.visibleParticipants).indexOf(groupCallParticipant);
                    if (iIndexOf >= 0) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(iIndexOf + this.listAdapter.usersStartRow);
                        if (viewHolderFindViewHolderForAdapterPosition != null) {
                            View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                            if (view instanceof GroupCallUserCell) {
                                ((GroupCallUserCell) view).setAmplitude(fArr[i] * 15.0f);
                                if (view == this.scrimView && !this.contentFullyOverlayed) {
                                    this.containerView.invalidate();
                                }
                            }
                        }
                    }
                }
                float f = fArr[i] * 15.0f;
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = anonymousClass28.attachedRenderers;
                    if (i3 < arrayList.size()) {
                        if (MessageObject.getPeerId(((GroupCallMiniTextureView) arrayList.get(i3)).participant.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            ((GroupCallMiniTextureView) arrayList.get(i3)).setAmplitude(f);
                        }
                        i3++;
                    }
                }
            }
        }
    }

    public final void lambda$new$11(TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public final void lambda$new$12(ChatObject.Call.InvitedUser invitedUser, Long l) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(declineconferencecallinvite, new GroupCallActivity$$ExternalSyntheticLambda59(this, 1));
        ChatObject.Call call = this.call;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l, invitedUser);
            applyCallParticipantUpdates(true);
        }
    }

    public final void lambda$new$13(TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public final void lambda$new$14(ChatObject.Call.InvitedUser invitedUser, Long l) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(declineconferencecallinvite, new GroupCallActivity$$ExternalSyntheticLambda59(this, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(this.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = this.call;
        if (call != null) {
            call.invitedUsers.remove(l);
            this.call.invitedUsersMap.remove(l);
            this.call.invitedUsersMessageIds.remove(l);
            applyCallParticipantUpdates(true);
        }
    }

    public final void lambda$new$18(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(34, this.currentAccount, safeLastFragment.getContext(), safeLastFragment, new ShareAlert.AnonymousClass3());
        limitReachedBottomSheet.setRestrictedUsers(null, arrayList, arrayList2, arrayList3, str);
        limitReachedBottomSheet.show();
    }

    public final void lambda$new$21(HashSet hashSet, ChatObject.Call call, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long jLongValue = l.longValue();
            if (call != null) {
                call.removeInvitedUser(jLongValue);
            }
            arrayList.add(MessagesController.getInstance(this.currentAccount).getUser(l));
            getrequirementstocontact.id.add(MessagesController.getInstance(this.currentAccount).getInputUser(jLongValue));
        }
        ChatActivity$$ExternalSyntheticLambda218 chatActivity$$ExternalSyntheticLambda218 = new ChatActivity$$ExternalSyntheticLambda218(this, arrayList, arrayList2, arrayList3, str, 27);
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            chatActivity$$ExternalSyntheticLambda218.run();
        } else {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getrequirementstocontact, new LinkManager$$ExternalSyntheticLambda0(arrayList, arrayList2, chatActivity$$ExternalSyntheticLambda218, 3));
        }
    }

    public final void lambda$new$22(long j, HashSet hashSet, AtomicInteger atomicInteger, int i, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda12(this, updates, j, 18));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j));
        }
        if (atomicInteger.incrementAndGet() != i || hashSet.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(this, hashSet, call, str, 1));
    }

    public final void lambda$new$23(ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = this.call;
        if (call2 == null || (groupCall = call2.call) == null) {
            return;
        }
        String str = groupCall.invite_link;
        int size = hashSet.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            this.call.addInvitedUser(jLongValue);
            TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            inviteconferencecallparticipant.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall2 = this.call.call;
            tL_inputGroupCall.id = groupCall2.id;
            tL_inputGroupCall.access_hash = groupCall2.access_hash;
            inviteconferencecallparticipant.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(jLongValue);
            inviteconferencecallparticipant.video = bool.booleanValue();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(inviteconferencecallparticipant, new LaunchActivity$$ExternalSyntheticLambda147(this, jLongValue, hashSet2, atomicInteger, size, call, str));
        }
        applyCallParticipantUpdates(true);
        if (!bool.booleanValue() || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(false) == 1) {
            return;
        }
        sharedInstance.createCaptureDevice(false);
        if (!sharedInstance.isFrontFaceCamera()) {
            sharedInstance.switchCamera();
        }
        sharedInstance.requestVideoCall(false);
        sharedInstance.setVideoState(false, 2);
        sharedInstance.setMicMute(false, false, true);
        sharedInstance.switchToSpeaker();
        updateState(true, true);
    }

    public final void lambda$new$24(LaunchActivity launchActivity, ChatObject.Call call, View view, int i) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        if (view instanceof GroupCallGridCell) {
            fullscreenFor(((GroupCallGridCell) view).getParticipant());
            return;
        }
        if (view instanceof GroupCallUserCell) {
            showMenuForCell((GroupCallUserCell) view);
            return;
        }
        boolean z = view instanceof GroupCallInvitedCell;
        l = null;
        l = null;
        l = null;
        final Long l = null;
        boolean z2 = true;
        ListAdapter listAdapter = this.listAdapter;
        if (!z) {
            if (i != listAdapter.addMemberRow) {
                if (i != listAdapter.conferenceAddPeopleRow) {
                    if (i == listAdapter.conferenceShareLinkRow) {
                        openShareConferenceLink();
                        return;
                    }
                    return;
                }
                ChatObject.Call call2 = this.call;
                if (call2 == null || call2.call == null) {
                    return;
                }
                UserSelectorBottomSheet userSelectorBottomSheet = new UserSelectorBottomSheet(launchActivity, this.currentAccount, null, 4, new ShareAlert.AnonymousClass3());
                ChatObject.Call call3 = this.call;
                userSelectorBottomSheet.excludeUserIds.addAll(call3 != null ? (Collection) j$.util.Collection.EL.stream(call3.sortedParticipants).map(new GroupCallSheet$$ExternalSyntheticLambda3(5)).collect(Collectors.toSet()) : null);
                userSelectorBottomSheet.updateItems(false, true);
                userSelectorBottomSheet.onShareCallLinkListener = new GroupCallActivity$$ExternalSyntheticLambda8(this, 6);
                userSelectorBottomSheet.updateItems(false, true);
                userSelectorBottomSheet.onUsersSelectedListener = new OAuthSheet$$ExternalSyntheticLambda18(15, this, call);
                userSelectorBottomSheet.show();
                return;
            }
            if (ChatObject.isChannel(this.currentChat) && (chat = this.currentChat) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                getLink(false);
                return;
            }
            AccountInstance accountInstance = this.accountInstance;
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(getChatId());
            if (chatFull == null) {
                return;
            }
            this.enterEventSent = false;
            Context context = getContext();
            int currentAccount = accountInstance.getCurrentAccount();
            TLRPC.Chat chat2 = this.currentChat;
            ChatObject.Call call4 = this.call;
            GroupVoipInviteAlert groupVoipInviteAlert = new GroupVoipInviteAlert(context, currentAccount, chat2, chatFull, call4.participants, call4.invitedUsersMap);
            this.groupVoipInviteAlert = groupVoipInviteAlert;
            groupVoipInviteAlert.setOnDismissListener(new GroupCallActivity$$ExternalSyntheticLambda32(this, 2));
            GroupVoipInviteAlert groupVoipInviteAlert2 = this.groupVoipInviteAlert;
            groupVoipInviteAlert2.delegate = new AnonymousClass13();
            groupVoipInviteAlert2.show();
            return;
        }
        GroupCallInvitedCell groupCallInvitedCell = (GroupCallInvitedCell) view;
        if (groupCallInvitedCell.getUser() == null) {
            return;
        }
        if (!isConference()) {
            this.parentActivity.switchToAccount(this.currentAccount);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", groupCallInvitedCell.getUser().id);
            if (groupCallInvitedCell.avatarImageView.getImageReceiver().hasNotThumb()) {
                bundle.putBoolean("expandPhoto", true);
            }
            this.parentActivity.presentFragment(new ProfileActivity(bundle, null));
            lambda$showGiftOfferSheet$15();
            return;
        }
        int i2 = i - listAdapter.shadyJoinStartRow;
        if (i2 < 0 || i2 >= this.call.shadyJoinParticipants.size()) {
            int i3 = i - listAdapter.shadyLeftStartRow;
            if (i3 < 0 || i3 >= this.call.shadyLeftParticipants.size()) {
                int i4 = i - listAdapter.invitedStartRow;
                if (this.delayedGroupCallUpdated) {
                    if (i4 >= 0) {
                        ArrayList arrayList = this.oldInvited;
                        if (i4 < arrayList.size()) {
                            l = (Long) arrayList.get(i4);
                        }
                    }
                } else if (i4 >= 0 && i4 < this.call.invitedUsers.size()) {
                    l = this.call.invitedUsers.get(i4);
                }
                z2 = false;
            } else {
                l = this.call.shadyLeftParticipants.get(i - listAdapter.shadyLeftStartRow);
            }
        } else {
            l = this.call.shadyJoinParticipants.get(i - listAdapter.shadyJoinStartRow);
        }
        if (z2 || (invitedUser = this.call.invitedUsersMessageIds.get(l)) == null) {
            return;
        }
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.container, this.resourcesProvider, groupCallInvitedCell);
        final int i5 = 0;
        itemOptionsMakeOptions.addIf(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(this) {
            public final GroupCallActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i5) {
                    case 0:
                        this.f$0.lambda$new$12(invitedUser, l);
                        break;
                    default:
                        this.f$0.lambda$new$14(invitedUser, l);
                        break;
                }
            }
        }, invitedUser.isCalling());
        final int i6 = 1;
        itemOptionsMakeOptions.add(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(this) {
            public final GroupCallActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i6) {
                    case 0:
                        this.f$0.lambda$new$12(invitedUser, l);
                        break;
                    default:
                        this.f$0.lambda$new$14(invitedUser, l);
                        break;
                }
            }
        }, false);
        itemOptionsMakeOptions.setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.listViewBackgroundPaint.getColor()));
        itemOptionsMakeOptions.dimAlpha = 96;
        itemOptionsMakeOptions.show();
    }

    public final void lambda$new$40() {
        Editable text = getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(new CharSequence[]{text}, true);
        sendGroupCallMessage(tL_textWithEntities);
    }

    public final void lambda$new$50(LaunchActivity launchActivity) {
        LaunchActivity launchActivity2;
        if (Build.VERSION.SDK_INT >= 23 && (launchActivity2 = this.parentActivity) != null && launchActivity2.checkSelfPermission("android.permission.CAMERA") != 0) {
            this.parentActivity.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
            return;
        }
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
            VoIPService.getSharedInstance().setVideoState(false, 0);
            updateState(true, false);
            updateSpeakerPhoneIcon(false);
            this.call.sortParticipants();
            applyCallParticipantUpdates(true);
            requestLayout();
            return;
        }
        this.undoView[0].hide(1, false);
        if (this.previewDialog == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.createCaptureDevice(false);
            }
            AnonymousClass47 anonymousClass47 = new AnonymousClass47(launchActivity, VoIPService.getSharedInstance().getVideoState(true) != 2);
            this.previewDialog = anonymousClass47;
            anonymousClass47.setBottomPadding(this.containerView.getPaddingBottom());
            this.container.addView(this.previewDialog);
            if (sharedInstance == null || sharedInstance.isFrontFaceCamera()) {
                return;
            }
            sharedInstance.switchCamera();
        }
    }

    public final void lambda$openShareConferenceLink$81(AlertDialog alertDialog, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        TLRPC.GroupCall groupCall;
        alertDialog.dismiss();
        if (!(tLObject instanceof TL_phone.exportedGroupCallInvite)) {
            if (tL_error != null) {
                new BulletinFactory(this.topBulletinContainer, new ShareAlert.AnonymousClass3()).showForError(false, tL_error);
                return;
            }
            return;
        }
        Context context = getContext();
        int i = this.currentAccount;
        TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
        String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        ChatObject.Call call = this.call;
        CallLogActivity.showCallLinkSheet(context, i, inputGroupCall, str, resourcesProvider, false, (call == null || (groupCall = call.call) == null || !groupCall.creator) ? false : true);
    }

    public final void lambda$runAvatarPreviewTransition$76(float f, float f2, float f3, int i, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.progressToAvatarPreview = fFloatValue;
        this.renderersContainer.progressToScrimView = fFloatValue;
        float f4 = (fFloatValue * 1.0f) + ((1.0f - fFloatValue) * f);
        AnonymousClass31 anonymousClass31 = this.avatarPreviewContainer;
        anonymousClass31.setScaleX(f4);
        anonymousClass31.setScaleY(f4);
        anonymousClass31.setTranslationX((1.0f - this.progressToAvatarPreview) * f2);
        anonymousClass31.setTranslationY((1.0f - this.progressToAvatarPreview) * f3);
        if (!this.useBlur) {
            this.scrimPaint.setAlpha((int) (this.progressToAvatarPreview * 100.0f));
        }
        GroupCallMiniTextureView groupCallMiniTextureView = this.scrimRenderer;
        if (groupCallMiniTextureView != null) {
            groupCallMiniTextureView.textureView.setRoundCorners((1.0f - this.progressToAvatarPreview) * AndroidUtilities.dp(8.0f));
        }
        anonymousClass31.invalidate();
        this.containerView.invalidate();
        int i2 = (int) ((1.0f - this.progressToAvatarPreview) * i);
        this.avatarsViewPager.setRoundRadius(i2, i2);
    }

    public final void makeFocusable(BottomSheet bottomSheet, EditTextBoldCursor editTextBoldCursor, boolean z, AlertDialog alertDialog) {
        if (this.enterEventSent) {
            return;
        }
        BaseFragment baseFragment = (BaseFragment) ArticleViewer.IBlock.CC.m((ActionBarLayout) this.parentActivity.getActionBarLayout(), 1, ((ActionBarLayout) this.parentActivity.getActionBarLayout()).getFragmentStack());
        if (baseFragment instanceof ChatActivity) {
            boolean zNeedEnterText = ((ChatActivity) baseFragment).needEnterText();
            this.enterEventSent = true;
            this.anyEnterEventSent = true;
            AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda15(bottomSheet, editTextBoldCursor, z, alertDialog, 17), zNeedEnterText ? 200L : 0L);
            return;
        }
        this.enterEventSent = true;
        this.anyEnterEventSent = true;
        if (bottomSheet != null) {
            bottomSheet.setFocusable(true);
        } else if (alertDialog != null) {
            alertDialog.setFocusable(true);
        }
        if (z) {
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda422(6, editTextBoldCursor), 100L);
        }
    }

    public final WindowInsetsCompat onApplyWindowInsets$4(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat.Impl impl = windowInsetsCompat.mImpl;
        Insets insets = impl.getInsets(647);
        Insets insets2 = impl.getInsets(8);
        AnonymousClass36 anonymousClass36 = this.callMessageEnterView;
        int iMax = Math.max(insets2.bottom, (anonymousClass36.waitingForKeyboardOpen || anonymousClass36.emojiViewVisible) ? anonymousClass36.getKeyboardHeight() : 0);
        ViewGroup.LayoutParams layoutParams = this.blurredView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -insets.bottom;
        }
        if (anonymousClass36.getEmojiView() != null) {
            anonymousClass36.getEmojiView().setBottomInset(insets.bottom);
        }
        if (this.isInFullscreen) {
            ViewGroup viewGroup = this.containerView;
            int i = this.backgroundPaddingLeft;
            viewGroup.setPadding(i, 0, i, 0);
        } else {
            ViewGroup viewGroup2 = this.containerView;
            int i2 = this.backgroundPaddingLeft;
            viewGroup2.setPadding(insets.left + i2, insets.top, i2 + insets.right, insets.bottom);
        }
        this.containerView.requestLayout();
        if (iMax == 0 && !anonymousClass36.waitingForKeyboardOpen && !anonymousClass36.emojiViewVisible && !anonymousClass36.isAnimatePopupClosing) {
            anonymousClass36.hideEmojiView();
        }
        if (iMax > 0) {
            ReactionsContainerLayout reactionsContainerLayout = this.reactionsContainerLayout;
            if (reactionsContainerLayout == null) {
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                reactionsContainerLayout = null;
                if (lastFragment != null) {
                    ReactionsContainerLayout reactionsContainerLayout2 = new ReactionsContainerLayout(1, this.currentAccount, getContext(), lastFragment, this.resourcesProvider);
                    this.reactionsContainerLayout = reactionsContainerLayout2;
                    reactionsContainerLayout2.setDelegate(new ReactionsContainerLayout.ReactionsContainerDelegate() {
                        public final Paint bgPaint;
                        public final Path clipPath = new Path();

                        {
                            Paint paint = new Paint(1);
                            this.bgPaint = paint;
                            paint.setColor(-14603467);
                        }

                        @Override
                        public final boolean allowLongPress() {
                            return false;
                        }

                        @Override
                        public final boolean drawBackground() {
                            return true;
                        }

                        @Override
                        public final void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i3, boolean z) {
                            Paint paint = this.bgPaint;
                            if (f > 0.0f) {
                                canvas.drawRoundRect(rectF, f, f, paint);
                            } else {
                                canvas.drawRect(rectF, paint);
                            }
                            if (Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
                                return;
                            }
                            GroupCallActivity groupCallActivity = GroupCallActivity.this;
                            if (groupCallActivity.renderNodeBlur != null) {
                                canvas.save();
                                if (f > 0.0f) {
                                    Path path = this.clipPath;
                                    path.rewind();
                                    path.addRoundRect(rectF, f, f, Path.Direction.CW);
                                    path.close();
                                    canvas.clipPath(path);
                                } else {
                                    canvas.clipRect(rectF);
                                }
                                canvas.translate(-groupCallActivity.reactionsContainerLayout.getX(), -groupCallActivity.reactionsContainerLayout.getY());
                                float f4 = groupCallActivity.renderNodeBlurScale;
                                canvas.scale(f4, f4);
                                canvas.drawRenderNode(groupCallActivity.renderNodeBlur);
                                canvas.restore();
                            }
                        }

                        @Override
                        public final boolean needEnterText() {
                            return false;
                        }

                        @Override
                        public final void onEmojiWindowDismissed() {
                        }

                        @Override
                        public final void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                            String str = visibleReaction.emojicon;
                            if (str == null) {
                                str = "👍";
                            }
                            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                            tL_textWithEntities.text = str;
                            long j = visibleReaction.documentId;
                            if (j != 0) {
                                tL_messageEntityCustomEmoji.document_id = j;
                                tL_messageEntityCustomEmoji.offset = 0;
                                tL_messageEntityCustomEmoji.length = str.length();
                                tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
                            }
                            GroupCallActivity groupCallActivity = GroupCallActivity.this;
                            groupCallActivity.sendGroupCallMessage(tL_textWithEntities);
                            AnonymousClass36 anonymousClass37 = groupCallActivity.callMessageEnterView;
                            if (anonymousClass37.isPopupVisible()) {
                                anonymousClass37.hideEmojiView();
                            } else {
                                AndroidUtilities.hideKeyboard(anonymousClass37.editText);
                            }
                            CustomEmojiReactionsWindow reactionsWindow = groupCallActivity.reactionsContainerLayout.getReactionsWindow();
                            if (reactionsWindow == null || reactionsWindow.dismissed) {
                                return;
                            }
                            groupCallActivity.reactionsContainerLayout.getReactionsWindow().dismissWithAlpha();
                            groupCallActivity.reactionsContainerLayout.reset();
                        }
                    });
                    this.containerView.addView(this.reactionsContainerLayout, LayoutHelper.createFrame(-2, 52, 81));
                    this.reactionsContainerLayout.setMessage(null, null, false);
                    bringToFront();
                    bringToFront();
                    reactionsContainerLayout = this.reactionsContainerLayout;
                }
            }
            this.reactionsContainerLayout = reactionsContainerLayout;
        }
        anonymousClass36.onSizeChanged(insets2.bottom, false);
        this.windowInsetsStateHolder.setInsets(windowInsetsCompat);
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public final void onAudioSettingsChanged() {
        updateSpeakerPhoneIcon(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            setMicAmplitude(0.0f);
        }
        AnonymousClass9 anonymousClass9 = this.listView;
        if (anonymousClass9.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(anonymousClass9);
        }
        AnonymousClass24 anonymousClass24 = this.fullscreenUsersListView;
        if (anonymousClass24.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(anonymousClass24);
        }
        ArrayList arrayList = this.attachedRenderersTmp;
        arrayList.clear();
        arrayList.addAll(this.attachedRenderers);
        for (int i = 0; i < arrayList.size(); i++) {
            ((GroupCallMiniTextureView) arrayList.get(i)).updateAttachState(true);
        }
    }

    @Override
    public final void lambda$openCrafting$8() {
        AnonymousClass47 anonymousClass47 = this.previewDialog;
        if (anonymousClass47 != null) {
            anonymousClass47.dismiss(false, false);
            return;
        }
        if (this.avatarsPreviewShowed) {
            dismissAvatarPreview(true);
        } else if (this.renderersContainer.inFullscreenMode) {
            fullscreenFor(null);
        } else {
            super.lambda$openCrafting$8();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        VoIPService.StateListener.CC.$default$onCameraFirstFrameAvailable(this);
    }

    @Override
    public final void onCameraSwitch(boolean z) {
        ArrayList arrayList = this.attachedRenderersTmp;
        arrayList.clear();
        arrayList.addAll(this.attachedRenderers);
        for (int i = 0; i < arrayList.size(); i++) {
            ((GroupCallMiniTextureView) arrayList.get(i)).updateAttachState(true);
        }
        AnonymousClass47 anonymousClass47 = this.previewDialog;
        if (anonymousClass47 == null || VoIPService.getSharedInstance() == null) {
            return;
        }
        anonymousClass47.textureView.renderer.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.parentActivity.onUserLeaveHintListeners.add(this.onUserLeaveHintListener);
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        groupCallUiVisible = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        GroupCallPip.updateVisibility(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 2) {
            checkGroupCallUiPositions_MessagesList();
            checkGroupCallUiPositions_ButtonsList();
            checkGroupCallUiPositions_FullscreenUsersList();
            float f3 = 1.0f - this.animatorHideButtons.floatValue;
            AnonymousClass17 anonymousClass17 = this.buttonsContainer;
            anonymousClass17.setAlpha(f3);
            this.renderersContainer.setProgressToHideUi(f);
            invalidate();
            this.containerView.invalidate();
            anonymousClass17.invalidate();
        }
        if (i == 3) {
            checkGroupCallUiPositions_ReactionsLayout();
            checkGroupCallUiPositions_MessagesList();
            checkGroupCallUiPositions_SendButton();
            checkGroupCallUiAlpha_ReactionsLayout();
            this.containerView.invalidate();
        }
        if (i == 4) {
            checkGroupCallUiPositions_MessagesList();
            invalidate();
            invalidate();
        }
        if (i == 5) {
            checkGroupCallUiPositions_MessagesList();
            this.containerView.invalidate();
        }
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
        VoIPService.StateListener.CC.$default$onMediaStateUpdated(this, i, i2);
    }

    @Override
    public final void onScreenOnChange(boolean z) {
        VoIPService.StateListener.CC.$default$onScreenOnChange(this, z);
    }

    @Override
    public final void onSignalBarsCountChanged(int i) {
        VoIPService.StateListener.CC.$default$onSignalBarsCountChanged(this, i);
    }

    @Override
    public final void onStateChanged(int i) {
        this.currentCallState = i;
        updateState(isShowing(), false);
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
        VoIPService.StateListener.CC.$default$onVideoAvailableChange(this, z);
    }

    public final void openShareAlert(String str, String str2, boolean z, boolean z2) {
        boolean zNeedEnterText;
        String str3;
        String str4;
        String string;
        if (isRtmpStream() && str != null) {
            str2 = null;
        }
        if (z2) {
            if (str == null) {
                str = str2;
            }
            AndroidUtilities.addToClipboard(str);
            if (AndroidUtilities.shouldShowClipboardToast()) {
                getUndoView().showWithAction(0L, 33, (Object) null, (Object) null, (Runnable) null, (Runnable) null);
                return;
            }
            return;
        }
        LaunchActivity launchActivity = this.parentActivity;
        if (launchActivity != null) {
            BaseFragment baseFragment = (BaseFragment) ArticleViewer.IBlock.CC.m((ActionBarLayout) this.parentActivity.getActionBarLayout(), 1, ((ActionBarLayout) launchActivity.getActionBarLayout()).getFragmentStack());
            if (baseFragment instanceof ChatActivity) {
                zNeedEnterText = ((ChatActivity) baseFragment).needEnterText();
                this.anyEnterEventSent = true;
                this.enterEventSent = true;
            } else {
                zNeedEnterText = false;
            }
        } else {
            zNeedEnterText = false;
        }
        if (str == null || str2 != null) {
            str3 = str;
            str4 = str2;
        } else {
            str4 = str;
            str3 = null;
        }
        if (str3 == null && z) {
            string = ChatObject.isChannelOrGiga(this.currentChat) ? LocaleController.formatString("VoipChannelInviteText", R.string.VoipChannelInviteText, str4) : LocaleController.formatString("VoipGroupInviteText", R.string.VoipGroupInviteText, str4);
        } else {
            string = str4;
        }
        ?? r4 = new ShareAlert(getContext(), string, str3, str4, str3) {
            @Override
            public final void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z3) {
                if (z3) {
                    int size = longSparseArray.size();
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    if (size == 1) {
                        groupCallActivity.getUndoView().showWithAction(((TLRPC.Dialog) longSparseArray.valueAt(0)).id, 41, Integer.valueOf(i), (Object) null, (Runnable) null, (Runnable) null);
                    } else {
                        groupCallActivity.getUndoView().showWithAction(0L, 41, Integer.valueOf(i), Integer.valueOf(longSparseArray.size()), (Runnable) null, (Runnable) null);
                    }
                }
            }
        };
        this.shareAlert = r4;
        r4.delegate = new PhotoViewer.AnonymousClass49(this, 6);
        r4.setOnDismissListener(new GroupCallActivity$$ExternalSyntheticLambda32(this, 3));
        AndroidUtilities.runOnUIThread(new GroupCallActivity$$ExternalSyntheticLambda8(this, 8), zNeedEnterText ? 200L : 0L);
    }

    public final void openShareConferenceLink() {
        ChatObject.Call call = this.call;
        if (call == null || call.call == null) {
            return;
        }
        AlertDialog alertDialog = new AlertDialog(getContext(), 3, null);
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 300L);
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        exportgroupcallinvite.call = tL_inputGroupCall;
        TLRPC.GroupCall groupCall = this.call.call;
        tL_inputGroupCall.id = groupCall.id;
        tL_inputGroupCall.access_hash = groupCall.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new LinkManager$$ExternalSyntheticLambda0(this, alertDialog, exportgroupcallinvite, 2));
    }

    public final void processSelectedOption(TLRPC.GroupCallParticipant groupCallParticipant, final long j, int i) {
        String firstName;
        TextView textView;
        String str;
        String str2;
        EditText editText;
        int i2;
        float f;
        int i3;
        final int i4;
        int i5;
        int iDp;
        int iDp2;
        int i6 = 10;
        int i7 = 9;
        int i8 = 6;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        AccountInstance accountInstance = this.accountInstance;
        TLObject user = j > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(j)) : accountInstance.getMessagesController().getChat(Long.valueOf(-j));
        if (i == 0 || i == 2 || i == 3) {
            if (i == 0) {
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                VoIPService.getSharedInstance().editCallMember(user, Boolean.TRUE, null, null, null, null);
                getUndoView().showWithAction(0L, 30, user, (Object) null, (Runnable) null, (Runnable) null);
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
            int i9 = Theme.key_voipgroup_listeningText;
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.dialogButtonColorKey = i9;
            TextView textView2 = new TextView(getContext());
            int i10 = Theme.key_voipgroup_actionBarItems;
            textView2.setTextColor(Theme.getColor(null, i10, false));
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(getContext());
            builder.setView(frameLayout);
            AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            avatarDrawable.namePaint.setTextSize(AndroidUtilities.dp(12.0f));
            BackupImageView backupImageView = new BackupImageView(getContext());
            backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(backupImageView, LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            avatarDrawable.setInfo(this.currentAccount, user);
            boolean z = user instanceof TLRPC.User;
            if (z) {
                TLRPC.User user2 = (TLRPC.User) user;
                backupImageView.imageReceiver.setForUserOrChat(user2, avatarDrawable);
                backupImageView.onNewImageSet();
                firstName = UserObject.getFirstName(user2);
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) user;
                backupImageView.imageReceiver.setForUserOrChat(chat, avatarDrawable);
                backupImageView.onNewImageSet();
                firstName = chat.title;
            }
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(Theme.getColor(null, i10, false));
            textView3.setTextSize(1, 20.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setLines(1);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            TLRPC.Chat chat2 = this.currentChat;
            String str3 = chat2 != null ? chat2.title : "";
            if (i != 2) {
                textView3.setText(LocaleController.getString(R.string.VoipGroupAddMemberTitle));
                zzko.m(R.string.VoipGroupAddMemberText, new Object[]{firstName, str3}, textView2);
            } else if (isConference()) {
                textView3.setText(LocaleController.getString(R.string.VoipConferenceRemoveMemberAlertTitle2));
                zzko.m(R.string.VoipConferenceRemoveMemberAlertText2, new Object[]{firstName}, textView2);
            } else {
                textView3.setText(LocaleController.getString(R.string.VoipGroupRemoveMemberAlertTitle2));
                if (ChatObject.isChannelOrGiga(this.currentChat)) {
                    zzko.m(R.string.VoipChannelRemoveMemberAlertText2, new Object[]{firstName, str3}, textView2);
                } else {
                    zzko.m(R.string.VoipGroupRemoveMemberAlertText2, new Object[]{firstName, str3}, textView2);
                }
            }
            boolean z2 = LocaleController.isRTL;
            frameLayout.addView(textView3, LayoutHelper.createFrame(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 76, 11.0f, z2 ? 76 : 21, 0.0f));
            frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (i == 2) {
                builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupUserRemove), new DialogsActivity$$ExternalSyntheticLambda89(i6, this, user));
            } else if (z) {
                builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupAdd), new ProfileActivity$$ExternalSyntheticLambda22(this, (TLRPC.User) user, j, 7));
            }
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            alertDialog.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_dialogBackground, false));
            alertDialog.show();
            if (i != 2 || (textView = (TextView) alertDialog.getButton(-1)) == null) {
                return;
            }
            textView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_leaveCallMenu, false));
            return;
        }
        if (i == 6) {
            this.parentActivity.switchToAccount(this.currentAccount);
            Bundle bundle = new Bundle();
            if (j > 0) {
                bundle.putLong("user_id", j);
            } else {
                bundle.putLong("chat_id", -j);
            }
            this.parentActivity.presentFragment(new ChatActivity(bundle));
            lambda$showGiftOfferSheet$15();
            return;
        }
        if (i == 8) {
            this.parentActivity.switchToAccount(this.currentAccount);
            BaseFragment baseFragment = (BaseFragment) ArticleViewer.IBlock.CC.m((ActionBarLayout) this.parentActivity.getActionBarLayout(), 1, ((ActionBarLayout) this.parentActivity.getActionBarLayout()).getFragmentStack());
            if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).getDialogId() == j) {
                lambda$showGiftOfferSheet$15();
                return;
            }
            Bundle bundle2 = new Bundle();
            if (j > 0) {
                bundle2.putLong("user_id", j);
            } else {
                bundle2.putLong("chat_id", -j);
            }
            this.parentActivity.presentFragment(new ChatActivity(bundle2));
            lambda$showGiftOfferSheet$15();
            return;
        }
        if (i == 7) {
            sharedInstance.editCallMember(user, Boolean.TRUE, null, null, Boolean.FALSE, null);
            updateMuteButton(2, true);
            return;
        }
        if (i == 9) {
            ImageUpdater imageUpdater = this.currentAvatarUpdater;
            if (imageUpdater == null || !imageUpdater.isUploadingImage()) {
                TLRPC.User currentUser = accountInstance.getUserConfig().getCurrentUser();
                ImageUpdater imageUpdater2 = new ImageUpdater(0, true, true);
                this.currentAvatarUpdater = imageUpdater2;
                imageUpdater2.openWithFrontfaceCamera = true;
                imageUpdater2.forceDarkTheme = true;
                imageUpdater2.useAttachMenu = true;
                imageUpdater2.searchAvailable = true;
                imageUpdater2.showingFromDialog = true;
                imageUpdater2.parentFragment = ((ActionBarLayout) this.parentActivity.getActionBarLayout()).getLastFragment();
                ImageUpdater imageUpdater3 = this.currentAvatarUpdater;
                AvatarUpdaterDelegate avatarUpdaterDelegate = new AvatarUpdaterDelegate(j);
                this.avatarUpdaterDelegate = avatarUpdaterDelegate;
                imageUpdater3.delegate = avatarUpdaterDelegate;
                TLRPC.UserProfilePhoto userProfilePhoto = currentUser.photo;
                imageUpdater3.openMenu((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new GroupCallActivity$$ExternalSyntheticLambda8(this, i7), new SettingsActivity$$ExternalSyntheticLambda21(i8), 0);
                return;
            }
            return;
        }
        if (i != 10) {
            if (i != 11) {
                if (i == 5) {
                    sharedInstance.editCallMember(user, Boolean.TRUE, null, null, null, null);
                    getUndoView().showWithAction(0L, 35, user, (Object) null, (Runnable) null, (Runnable) null);
                    sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                    return;
                }
                if ((groupCallParticipant.flags & 128) == 0 || groupCallParticipant.volume != 0) {
                    sharedInstance.editCallMember(user, Boolean.FALSE, null, null, null, null);
                } else {
                    groupCallParticipant.volume = 10000;
                    groupCallParticipant.volume_by_admin = false;
                    sharedInstance.editCallMember(user, Boolean.FALSE, null, 10000, null, null);
                }
                sharedInstance.setParticipantVolume(groupCallParticipant, ChatObject.getParticipantVolume(groupCallParticipant));
                getUndoView().showWithAction(0L, i == 1 ? 31 : 36, user, (Object) null, (Runnable) null, (Runnable) null);
                return;
            }
            Context context = getContext();
            int i11 = this.currentAccount;
            Pattern pattern = AlertsCreator.URL_PATTERN;
            if (DialogObject.isUserDialog(j)) {
                TLRPC.User user3 = MessagesController.getInstance(i11).getUser(Long.valueOf(j));
                str = user3.first_name;
                str2 = user3.last_name;
            } else {
                str = MessagesController.getInstance(i11).getChat(Long.valueOf(-j)).title;
                str2 = null;
            }
            AlertDialog.Builder builder2 = new AlertDialog.Builder(context, 0, null);
            String string = LocaleController.getString(j > 0 ? R.string.VoipEditName : R.string.VoipEditTitle);
            AlertDialog alertDialog2 = builder2.alertDialog;
            alertDialog2.title = string;
            LinearLayout linearLayoutM = zzkf.m(context, 1);
            EditText editText2 = new EditText(context);
            int i12 = Theme.key_voipgroup_actionBarItems;
            editText2.setTextColor(Theme.getColor(null, i12, false));
            editText2.setTextSize(1, 16.0f);
            editText2.setMaxLines(1);
            editText2.setLines(1);
            editText2.setSingleLine(true);
            editText2.setGravity(LocaleController.isRTL ? 5 : 3);
            editText2.setInputType(49152);
            editText2.setImeOptions(j > 0 ? 5 : 6);
            editText2.setHint(LocaleController.getString(j > 0 ? R.string.FirstName : R.string.VoipEditTitleHint));
            editText2.setBackground(Theme.createEditTextDrawable(context));
            editText2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            editText2.requestFocus();
            if (j > 0) {
                EditText editText3 = new EditText(context);
                editText3.setTextColor(Theme.getColor(null, i12, false));
                editText3.setTextSize(1, 16.0f);
                editText3.setMaxLines(1);
                editText3.setLines(1);
                editText3.setSingleLine(true);
                editText3.setGravity(LocaleController.isRTL ? 5 : 3);
                editText3.setInputType(49152);
                editText3.setImeOptions(6);
                editText3.setHint(LocaleController.getString(R.string.LastName));
                editText3.setBackground(Theme.createEditTextDrawable(context));
                editText3.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                editText = editText3;
            } else {
                editText = null;
            }
            AndroidUtilities.showKeyboard(editText2);
            linearLayoutM.addView(editText2, LayoutHelper.createLinear(-1, -2, 0, 23, 12, 23, 21));
            if (editText != null) {
                linearLayoutM.addView(editText, LayoutHelper.createLinear(-1, -2, 0, 23, 12, 23, 21));
            }
            editText2.setText(str);
            editText2.setSelection(editText2.getText().toString().length());
            if (editText != null) {
                editText.setText(str2);
                editText.setSelection(editText.getText().toString().length());
            }
            builder2.setView(linearLayoutM);
            AlertDialog.OnButtonClickListener botVerifySheet$$ExternalSyntheticLambda0 = new BotVerifySheet$$ExternalSyntheticLambda0(editText2, j, i11, editText);
            builder2.setPositiveButton(LocaleController.getString(R.string.Save), botVerifySheet$$ExternalSyntheticLambda0);
            builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            alertDialog2.onDismissListener = new VoIPFragment$$ExternalSyntheticLambda16(5, editText2, editText);
            alertDialog2.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_dialogBackground, false));
            alertDialog2.show();
            alertDialog2.setTextColor(Theme.getColor(null, i12, false));
            ChannelMonetizationLayout$$ExternalSyntheticLambda7 channelMonetizationLayout$$ExternalSyntheticLambda7 = new ChannelMonetizationLayout$$ExternalSyntheticLambda7(1, alertDialog2, botVerifySheet$$ExternalSyntheticLambda0);
            if (editText != null) {
                editText.setOnEditorActionListener(channelMonetizationLayout$$ExternalSyntheticLambda7);
                return;
            } else {
                editText2.setOnEditorActionListener(channelMonetizationLayout$$ExternalSyntheticLambda7);
                return;
            }
        }
        String str4 = groupCallParticipant.about;
        final Context context2 = getContext();
        int i13 = this.currentAccount;
        Pattern pattern2 = AlertsCreator.URL_PATTERN;
        AlertDialog.Builder builder3 = new AlertDialog.Builder(context2, 0, null);
        String string2 = LocaleController.getString(j > 0 ? R.string.UserBio : R.string.DescriptionPlaceholder);
        final AlertDialog alertDialog3 = builder3.alertDialog;
        alertDialog3.title = string2;
        alertDialog3.message = LocaleController.getString(j > 0 ? R.string.VoipGroupBioEditAlertText : R.string.DescriptionInfo);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        frameLayout2.setClipChildren(false);
        if (j < 0) {
            i2 = i13;
            long j2 = -j;
            if (MessagesController.getInstance(i13).getChatFull(j2) == null) {
                f = 8.0f;
                MessagesController.getInstance(i2).loadFullChat(j2, ConnectionsManager.generateClassGuid(), true);
            }
            final NumberTextView numberTextView = new NumberTextView(context2);
            EditText editText4 = new EditText(context2);
            int i14 = Theme.key_voipgroup_actionBarItems;
            editText4.setTextColor(Theme.getColor(null, i14, false));
            if (j > 0) {
                i3 = R.string.UserBio;
            } else {
                i3 = R.string.DescriptionPlaceholder;
            }
            editText4.setHint(LocaleController.getString(i3));
            editText4.setTextSize(1, 16.0f);
            editText4.setBackground(Theme.createEditTextDrawable(context2));
            editText4.setMaxLines(4);
            editText4.setRawInputType(147457);
            editText4.setImeOptions(6);
            if (j > 0) {
                i4 = 70;
            } else {
                i4 = 255;
            }
            editText4.setFilters(new InputFilter[]{new CodepointsLengthInputFilter(i4) {
                public final NumberTextView val$checkTextView;
                public final Context val$context;

                public AnonymousClass17(final int i15) {
                    super(i15);
                    context = context2;
                    numberTextView = numberTextView;
                }

                @Override
                public final CharSequence filter(CharSequence charSequence, int i15, int i16, Spanned spanned, int i17, int i18) {
                    CharSequence charSequenceFilter = super.filter(charSequence, i15, i16, spanned, i17, i18);
                    if (charSequenceFilter != null && charSequence != null && charSequenceFilter.length() != charSequence.length()) {
                        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(numberTextView);
                    }
                    return charSequenceFilter;
                }
            }});
            numberTextView.setCenterAlign(true);
            numberTextView.setTextSize(15);
            numberTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false));
            numberTextView.setImportantForAccessibility(2);
            if (LocaleController.isRTL) {
                i5 = 3;
            } else {
                i5 = 5;
            }
            frameLayout2.addView(numberTextView, LayoutHelper.createFrame(20, 20.0f, i5, 0.0f, 14.0f, 21.0f, 0.0f));
            if (LocaleController.isRTL) {
                iDp = AndroidUtilities.dp(24.0f);
            } else {
                iDp = 0;
            }
            int iDp3 = AndroidUtilities.dp(f);
            if (LocaleController.isRTL) {
                iDp2 = 0;
            } else {
                iDp2 = AndroidUtilities.dp(24.0f);
            }
            editText4.setPadding(iDp, iDp3, iDp2, AndroidUtilities.dp(f));
            editText4.addTextChangedListener(new ColorPicker.AnonymousClass4(i15, numberTextView));
            AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false, 0.0f, false);
            editText4.setText(str4);
            editText4.setSelection(editText4.getText().toString().length());
            builder3.setView(frameLayout2);
            final VoIPService$$ExternalSyntheticLambda80 voIPService$$ExternalSyntheticLambda80 = new VoIPService$$ExternalSyntheticLambda80(editText4, i2, j, 2);
            builder3.setPositiveButton(LocaleController.getString(R.string.Save), voIPService$$ExternalSyntheticLambda80);
            builder3.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            alertDialog3.onDismissListener = new AlertsCreator$$ExternalSyntheticLambda121(editText4, 1);
            frameLayout2.addView(editText4, LayoutHelper.createFrame(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
            editText4.requestFocus();
            AndroidUtilities.showKeyboard(editText4);
            editText4.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView4, int i15, KeyEvent keyEvent) {
                    if (i15 == 6 || (j > 0 && keyEvent.getKeyCode() == 66)) {
                        AlertDialog alertDialog4 = alertDialog3;
                        if (alertDialog4.isShowing()) {
                            voIPService$$ExternalSyntheticLambda80.onClick(alertDialog4, 0);
                            return true;
                        }
                    }
                    return false;
                }
            });
            alertDialog3.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_dialogBackground, false));
            alertDialog3.show();
            alertDialog3.setTextColor(Theme.getColor(null, i14, false));
        }
        i2 = i13;
        f = 8.0f;
        final NumberTextView numberTextView2 = new NumberTextView(context2);
        EditText editText5 = new EditText(context2);
        int i15 = Theme.key_voipgroup_actionBarItems;
        editText5.setTextColor(Theme.getColor(null, i15, false));
        if (j > 0) {
            i3 = R.string.UserBio;
        } else {
            i3 = R.string.DescriptionPlaceholder;
        }
        editText5.setHint(LocaleController.getString(i3));
        editText5.setTextSize(1, 16.0f);
        editText5.setBackground(Theme.createEditTextDrawable(context2));
        editText5.setMaxLines(4);
        editText5.setRawInputType(147457);
        editText5.setImeOptions(6);
        if (j > 0) {
            i15 = 70;
        } else {
            i15 = 255;
        }
        editText5.setFilters(new InputFilter[]{new CodepointsLengthInputFilter(i15) {
            public final NumberTextView val$checkTextView;
            public final Context val$context;

            public AnonymousClass17(final int i16) {
                super(i16);
                context = context2;
                numberTextView = numberTextView2;
            }

            @Override
            public final CharSequence filter(CharSequence charSequence, int i16, int i17, Spanned spanned, int i18, int i19) {
                CharSequence charSequenceFilter = super.filter(charSequence, i16, i17, spanned, i18, i19);
                if (charSequenceFilter != null && charSequence != null && charSequenceFilter.length() != charSequence.length()) {
                    Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(numberTextView);
                }
                return charSequenceFilter;
            }
        }});
        numberTextView2.setCenterAlign(true);
        numberTextView2.setTextSize(15);
        numberTextView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false));
        numberTextView2.setImportantForAccessibility(2);
        if (LocaleController.isRTL) {
            i5 = 3;
        } else {
            i5 = 5;
        }
        frameLayout2.addView(numberTextView2, LayoutHelper.createFrame(20, 20.0f, i5, 0.0f, 14.0f, 21.0f, 0.0f));
        if (LocaleController.isRTL) {
            iDp = AndroidUtilities.dp(24.0f);
        } else {
            iDp = 0;
        }
        int iDp4 = AndroidUtilities.dp(f);
        if (LocaleController.isRTL) {
            iDp2 = 0;
        } else {
            iDp2 = AndroidUtilities.dp(24.0f);
        }
        editText5.setPadding(iDp, iDp4, iDp2, AndroidUtilities.dp(f));
        editText5.addTextChangedListener(new ColorPicker.AnonymousClass4(i16, numberTextView2));
        AndroidUtilities.updateViewVisibilityAnimated(numberTextView2, false, 0.0f, false);
        editText5.setText(str4);
        editText5.setSelection(editText5.getText().toString().length());
        builder3.setView(frameLayout2);
        final VoIPService$$ExternalSyntheticLambda80 voIPService$$ExternalSyntheticLambda81 = new VoIPService$$ExternalSyntheticLambda80(editText5, i2, j, 2);
        builder3.setPositiveButton(LocaleController.getString(R.string.Save), voIPService$$ExternalSyntheticLambda81);
        builder3.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        alertDialog3.onDismissListener = new AlertsCreator$$ExternalSyntheticLambda121(editText5, 1);
        frameLayout2.addView(editText5, LayoutHelper.createFrame(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
        editText5.requestFocus();
        AndroidUtilities.showKeyboard(editText5);
        editText5.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView4, int i16, KeyEvent keyEvent) {
                if (i16 == 6 || (j > 0 && keyEvent.getKeyCode() == 66)) {
                    AlertDialog alertDialog4 = alertDialog3;
                    if (alertDialog4.isShowing()) {
                        voIPService$$ExternalSyntheticLambda81.onClick(alertDialog4, 0);
                        return true;
                    }
                }
                return false;
            }
        });
        alertDialog3.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_dialogBackground, false));
        alertDialog3.show();
        alertDialog3.setTextColor(Theme.getColor(null, i15, false));
    }

    public final void runAvatarPreviewTransition(boolean z, GroupCallUserCell groupCallUserCell) {
        float measuredHeight;
        float y;
        final float x;
        int measuredHeight2;
        GroupCallMiniTextureView groupCallMiniTextureView;
        GroupCallMiniTextureView groupCallMiniTextureView2;
        float paddingLeft = this.containerView.getPaddingLeft() + AndroidUtilities.dp(14.0f);
        float paddingTop = this.containerView.getPaddingTop() + AndroidUtilities.dp(14.0f);
        boolean z2 = this.hasScrimAnchorView;
        AnonymousClass30 anonymousClass30 = this.avatarsViewPager;
        AnonymousClass9 anonymousClass9 = this.listView;
        if (z2) {
            x = (anonymousClass9.getX() + (groupCallUserCell.getX() + groupCallUserCell.getAvatarImageView().getX())) - paddingLeft;
            y = (anonymousClass9.getY() + (groupCallUserCell.getY() + groupCallUserCell.getAvatarImageView().getY())) - paddingTop;
            measuredHeight = groupCallUserCell.getAvatarImageView().getMeasuredHeight() / anonymousClass9.getMeasuredWidth();
            measuredHeight2 = (int) ((groupCallUserCell.getAvatarImageView().getMeasuredHeight() >> 1) / measuredHeight);
        } else {
            if (this.scrimRenderer == null) {
                this.previewTextureTransitionEnabled = true;
            } else {
                this.previewTextureTransitionEnabled = z || ((ProfileGalleryView) anonymousClass30).adapter.getRealPosition(anonymousClass30.getCurrentItem()) == 0;
            }
            GroupCallGridCell groupCallGridCell = this.scrimGridView;
            AnonymousClass28 anonymousClass28 = this.renderersContainer;
            if (groupCallGridCell == null || !this.previewTextureTransitionEnabled) {
                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell2 = this.scrimFullscreenView;
                if (groupCallUserCell2 != null) {
                    GroupCallMiniTextureView groupCallMiniTextureView3 = this.scrimRenderer;
                    AnonymousClass24 anonymousClass24 = this.fullscreenUsersListView;
                    if (groupCallMiniTextureView3 == null) {
                        float x2 = (anonymousClass28.getX() + (anonymousClass24.getX() + (this.scrimFullscreenView.getX() + groupCallUserCell2.getAvatarImageView().getX()))) - paddingLeft;
                        float y2 = (anonymousClass28.getY() + (anonymousClass24.getY() + (this.scrimFullscreenView.getY() + this.scrimFullscreenView.getAvatarImageView().getY()))) - paddingTop;
                        measuredHeight = this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() / anonymousClass9.getMeasuredWidth();
                        measuredHeight2 = (int) ((this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() >> 1) / measuredHeight);
                        y = y2;
                        x = x2;
                    } else {
                        if (this.previewTextureTransitionEnabled) {
                            x = (anonymousClass28.getX() + (anonymousClass24.getX() + groupCallUserCell2.getX())) - paddingLeft;
                            y = (anonymousClass28.getY() + (anonymousClass24.getY() + this.scrimFullscreenView.getY())) - paddingTop;
                        }
                        measuredHeight2 = 0;
                    }
                    if (!this.previewTextureTransitionEnabled && (groupCallMiniTextureView = this.scrimRenderer) != null) {
                        groupCallMiniTextureView.invalidate();
                        anonymousClass28.invalidate();
                        GroupCallMiniTextureView groupCallMiniTextureView4 = this.scrimRenderer;
                        groupCallMiniTextureView4.showingAsScrimView = false;
                        groupCallMiniTextureView4.updateAttachState(false);
                        this.scrimRenderer = null;
                    }
                }
                measuredHeight = 0.96f;
                y = 0.0f;
                x = 0.0f;
                measuredHeight2 = 0;
                if (!this.previewTextureTransitionEnabled) {
                    groupCallMiniTextureView.invalidate();
                    anonymousClass28.invalidate();
                    GroupCallMiniTextureView groupCallMiniTextureView5 = this.scrimRenderer;
                    groupCallMiniTextureView5.showingAsScrimView = false;
                    groupCallMiniTextureView5.updateAttachState(false);
                    this.scrimRenderer = null;
                }
            } else {
                float x3 = (anonymousClass9.getX() + groupCallGridCell.getX()) - paddingLeft;
                y = ((anonymousClass9.getY() + this.scrimGridView.getY()) + AndroidUtilities.dp(2.0f)) - paddingTop;
                x = x3;
            }
            measuredHeight = 1.0f;
            measuredHeight2 = 0;
            if (!this.previewTextureTransitionEnabled) {
                groupCallMiniTextureView.invalidate();
                anonymousClass28.invalidate();
                GroupCallMiniTextureView groupCallMiniTextureView6 = this.scrimRenderer;
                groupCallMiniTextureView6.showingAsScrimView = false;
                groupCallMiniTextureView6.updateAttachState(false);
                this.scrimRenderer = null;
            }
        }
        final float f = y;
        final float f2 = measuredHeight;
        AnonymousClass29 anonymousClass29 = this.avatarPagerIndicator;
        if (z) {
            AnonymousClass31 anonymousClass31 = this.avatarPreviewContainer;
            anonymousClass31.setScaleX(f2);
            anonymousClass31.setScaleY(f2);
            anonymousClass31.setTranslationX(x);
            anonymousClass31.setTranslationY(f);
            anonymousClass29.setAlpha(0.0f);
        }
        anonymousClass30.setRoundRadius(measuredHeight2, measuredHeight2);
        if (this.useBlur) {
            AnonymousClass33 anonymousClass33 = this.blurredView;
            if (z) {
                anonymousClass33.setAlpha(0.0f);
            }
            OKLCH.m(anonymousClass33.animate(), z ? 1.0f : 0.0f, 220L);
        }
        OKLCH.m(anonymousClass29.animate(), z ? 1.0f : 0.0f, 220L);
        if (!z && (groupCallMiniTextureView2 = this.scrimRenderer) != null) {
            groupCallMiniTextureView2.showingAsScrimView = false;
            groupCallMiniTextureView2.updateAttachState(true);
            if (((ProfileGalleryView) anonymousClass30).adapter.getRealPosition(anonymousClass30.getCurrentItem()) != 0) {
                GroupCallMiniTextureView.AnonymousClass1 anonymousClass1 = this.scrimRenderer.textureView;
                anonymousClass1.animateOnNextLayout = false;
                anonymousClass1.animateNextDuration = 0L;
                this.scrimGridView = null;
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
        final int i = measuredHeight2;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$runAvatarPreviewTransition$76(f2, x, f, i, valueAnimator);
            }
        });
        this.popupAnimationIndex = this.accountInstance.getNotificationCenter().setAnimationInProgress(this.popupAnimationIndex, new int[]{NotificationCenter.dialogPhotosLoaded, NotificationCenter.fileLoaded, NotificationCenter.messagesDidLoad});
        GroupCallMiniTextureView groupCallMiniTextureView7 = this.scrimGridView != null ? this.scrimRenderer : null;
        if (groupCallMiniTextureView7 != null) {
            groupCallMiniTextureView7.animateToScrimView = true;
        }
        valueAnimatorOfFloat.addListener(new ChatActivity.AnonymousClass63(this, groupCallMiniTextureView7, z, 8));
        if (this.hasScrimAnchorView || this.scrimRenderer == null) {
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            valueAnimatorOfFloat.setDuration(220L);
            valueAnimatorOfFloat.start();
        } else {
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            valueAnimatorOfFloat.setDuration(220L);
            this.scrimRenderer.textureView.setAnimateNextDuration(220L);
            GroupCallMiniTextureView.AnonymousClass1 anonymousClass2 = this.scrimRenderer.textureView;
            if (anonymousClass2.animateOnNextLayout) {
                anonymousClass2.animateOnNextLayoutAnimations.add(valueAnimatorOfFloat);
            } else {
                valueAnimatorOfFloat.start();
            }
        }
        checkContentOverlayed();
    }

    public final void runUpdateTextureLightningRunnable() {
        LaunchActivity.AnonymousClass18 anonymousClass18 = this.updateTextureLightningRunnable;
        AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
        if (!this.needTextureLightning || this.textureLightningView == null || VoIPService.getSharedInstance() == null || !isRtmpStream() || this.listView == null || !LiteMode.isEnabled(512)) {
            return;
        }
        AndroidUtilities.runOnUIThread(anonymousClass18, 30L);
    }

    public final void sendGroupCallMessage(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        setText("");
        ChatObject.Call call = this.call;
        if (call == null || call.call == null || (inputGroupCall = call.getInputGroupCall()) == null) {
            return;
        }
        ChatObject.Call call2 = this.call;
        long j = call2.call.id;
        TLRPC.Peer peer = call2.selfPeer;
        GroupCallMessagesController.getInstance(this.currentAccount).sendCallMessage(peer != null ? DialogObject.getPeerDialogId(peer) : UserConfig.getInstance(this.currentAccount).clientUserId, tL_textWithEntities, j, inputGroupCall);
    }

    public final void setColorProgress(float f) {
        this.colorProgress = f;
        AnonymousClass28 anonymousClass28 = this.renderersContainer;
        float fMax = Math.max(f, anonymousClass28 == null ? 0.0f : anonymousClass28.progressToFullscreenMode);
        int i = Theme.key_voipgroup_actionBarUnscrolled;
        int color = Theme.getColor(null, i, false);
        int i2 = Theme.key_voipgroup_actionBar;
        int offsetColor = AndroidUtilities.getOffsetColor(color, Theme.getColor(null, i2, false), f, 1.0f);
        this.backgroundColor = offsetColor;
        setBackgroundColor(offsetColor);
        this.otherItem.redrawPopup(-14472653);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(this.backgroundColor, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(Theme.getColor(null, i, false), Theme.getColor(null, i2, false), fMax, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_listViewBackgroundUnscrolled, false), Theme.getColor(null, Theme.key_voipgroup_listViewBackground, false), f, 1.0f);
        CallEncryptionCellDrawable callEncryptionCellDrawable = this.encryptionDrawable;
        if (callEncryptionCellDrawable != null) {
            callEncryptionCellDrawable.listBackgroundColor = offsetColor2;
            QrActivity.AnonymousClass2 anonymousClass2 = callEncryptionCellDrawable.parentView;
            if (anonymousClass2 != null) {
                anonymousClass2.invalidate();
            }
        }
        this.listViewBackgroundPaint.setColor(offsetColor2);
        this.callMessageEnterContainerBgPaint.setColor(offsetColor2);
        invalidate();
        AnonymousClass9 anonymousClass9 = this.listView;
        anonymousClass9.setGlowColor(offsetColor2);
        int i3 = this.muteButtonState;
        if (i3 == 3 || isGradientState(i3)) {
            this.muteButton.invalidate();
        }
        View view = this.buttonsBackgroundGradientView;
        if (view != null) {
            int i4 = this.backgroundColor;
            int[] iArr = this.gradientColors;
            iArr[0] = i4;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.buttonsBackgroundGradient.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.buttonsBackgroundGradient = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.buttonsBackgroundGradientView2.setBackgroundColor(iArr[0]);
        }
        int offsetColor3 = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_leaveButton, false), Theme.getColor(null, Theme.key_voipgroup_leaveButtonScrolled, false), f, 1.0f);
        this.leaveButton.setBackgroundColor(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_lastSeenTextUnscrolled, false), Theme.getColor(null, Theme.key_voipgroup_lastSeenText, false), f, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_mutedIconUnscrolled, false), Theme.getColor(null, Theme.key_voipgroup_mutedIcon, false), f, 1.0f);
        int color2 = Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider);
        int childCount = anonymousClass9.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = anonymousClass9.getChildAt(i5);
            if (childAt instanceof GroupCallTextCell) {
                GroupCallTextCell groupCallTextCell = (GroupCallTextCell) childAt;
                if (isConference()) {
                    groupCallTextCell.setColors(color2, color2);
                } else {
                    groupCallTextCell.setColors(offsetColor5, offsetColor4);
                }
            } else {
                boolean z = childAt instanceof GroupCallUserCell;
                AnonymousClass5 anonymousClass5 = this.actionBar;
                if (z) {
                    ((GroupCallUserCell) childAt).setGrayIconColor(anonymousClass5.getTag() != null ? Theme.key_voipgroup_mutedIcon : Theme.key_voipgroup_mutedIconUnscrolled, offsetColor5);
                } else if (childAt instanceof GroupCallInvitedCell) {
                    GroupCallInvitedCell groupCallInvitedCell = (GroupCallInvitedCell) childAt;
                    groupCallInvitedCell.grayIconColor = anonymousClass5.getTag() != null ? Theme.key_voipgroup_mutedIcon : Theme.key_voipgroup_mutedIconUnscrolled;
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(offsetColor5, PorterDuff.Mode.MULTIPLY);
                    ImageView imageView = groupCallInvitedCell.muteButton;
                    imageView.setColorFilter(porterDuffColorFilter);
                    groupCallInvitedCell.statusTextView.setTextColor(offsetColor5);
                    Theme.setSelectorDrawableColor(imageView.getDrawable(), 620756991 & offsetColor5, true);
                }
            }
        }
        this.containerView.invalidate();
        anonymousClass9.invalidate();
        this.container.invalidate();
    }

    public final void setCommentsEnabled(boolean z) {
        if (this.call == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = this.call.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z);
        this.pendingCommentsEnabled = Boolean.valueOf(z);
        updateButtonsVisibility(true);
        ConnectionsManager connectionsManager = this.accountInstance.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new ChatThemeController$$ExternalSyntheticLambda8(dispatchQueue), new GroupCallActivity$$ExternalSyntheticLambda65(this, 0));
    }

    public final void setMicAmplitude(float f) {
        AnonymousClass9 anonymousClass9;
        TLRPC.GroupCallParticipant groupCallParticipant;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f = 0.0f;
        }
        float fMin = (float) (Math.min(8500.0d, 4000.0f * f) / 8500.0d);
        this.animateToAmplitude = fMin;
        this.animateAmplitudeDiff = (fMin - this.amplitude) / 265.0f;
        ChatObject.Call call = this.call;
        if (call == null || (anonymousClass9 = this.listView) == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(MessageObject.getPeerId(this.selfPeer))) == null) {
            return;
        }
        AnonymousClass28 anonymousClass28 = this.renderersContainer;
        int i = 0;
        if (anonymousClass28.inFullscreenMode) {
            int i2 = 0;
            while (true) {
                AnonymousClass24 anonymousClass24 = this.fullscreenUsersListView;
                if (i2 >= anonymousClass24.getChildCount()) {
                    break;
                }
                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) anonymousClass24.getChildAt(i2);
                if (MessageObject.getPeerId(groupCallUserCell.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    groupCallUserCell.setAmplitude(f * 15.0f);
                }
                i2++;
            }
        } else {
            int iIndexOf = (this.delayedGroupCallUpdated ? this.oldParticipants : this.call.visibleParticipants).indexOf(groupCallParticipant);
            if (iIndexOf >= 0 && (viewHolderFindViewHolderForAdapterPosition = anonymousClass9.findViewHolderForAdapterPosition(iIndexOf + this.listAdapter.usersStartRow)) != null) {
                View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                if (view instanceof GroupCallUserCell) {
                    ((GroupCallUserCell) view).setAmplitude(f * 15.0f);
                    if (view == this.scrimView && !this.contentFullyOverlayed) {
                        this.containerView.invalidate();
                    }
                }
            }
        }
        float f2 = f * 15.0f;
        while (true) {
            ArrayList arrayList = anonymousClass28.attachedRenderers;
            if (i >= arrayList.size()) {
                return;
            }
            if (MessageObject.getPeerId(((GroupCallMiniTextureView) arrayList.get(i)).participant.participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                ((GroupCallMiniTextureView) arrayList.get(i)).setAmplitude(f2);
            }
            i++;
        }
    }

    public final void setOldRows(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.oldEncryptionRow = i;
        this.oldAddMemberRow = i2;
        this.oldUsersStartRow = i3;
        this.oldUsersEndRow = i4;
        this.oldInvitedStartRow = i5;
        this.oldInvitedEndRow = i6;
        this.oldShadyJoinStartRow = i7;
        this.oldShadyJoinEndRow = i8;
        this.oldShadyLeftStartRow = i9;
        this.oldShadyLeftEndRow = i10;
        this.oldUsersVideoStartRow = i11;
        this.oldUsersVideoEndRow = i12;
        this.oldVideoDividerRow = i13;
        this.oldVideoNotAvailableRow = i14;
        this.oldConferenceAddPeopleRow = i15;
        this.oldConferenceShareLinkRow = i16;
    }

    public final void setScrollOffsetY(float f) {
        int iDp;
        this.scrollOffsetY = f;
        AnonymousClass9 anonymousClass9 = this.listView;
        anonymousClass9.setTopGlowOffset((int) (f - ((FrameLayout.LayoutParams) anonymousClass9.getLayoutParams()).topMargin));
        int iDp2 = AndroidUtilities.dp(74.0f);
        float f2 = f - iDp2;
        float f3 = this.backgroundPaddingTop + f2;
        float currentActionBarHeight = ActionBar.getCurrentActionBarHeight() * 2;
        LightningView lightningView = this.textureLightningView;
        AnonymousClass28 anonymousClass28 = this.renderersContainer;
        AnonymousClass22 anonymousClass22 = this.liveLabelTextView;
        AnonymousClass20 anonymousClass20 = this.titleTextView;
        if (f3 < currentActionBarHeight) {
            float fMin = Math.min(1.0f, (((ActionBar.getCurrentActionBarHeight() * 2) - f2) - this.backgroundPaddingTop) / (ActionBar.getCurrentActionBarHeight() + ((iDp2 - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            iDp = (int) (AndroidUtilities.dp(AndroidUtilities.isTablet() ? 17.0f : 13.0f) * fMin);
            if (lightningView != null) {
                lightningView.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * fMin));
            }
            if (Math.abs(Math.min(1.0f, fMin) - this.colorProgress) > 1.0E-4f) {
                setColorProgress(Math.min(1.0f, fMin));
            }
            float f4 = 1.0f - ((0.1f * fMin) * 1.2f);
            anonymousClass20.setScaleX(Math.max(0.9f, f4));
            anonymousClass20.setScaleY(Math.max(0.9f, f4));
            float f5 = 1.0f - (fMin * 1.2f);
            anonymousClass20.setAlpha((1.0f - anonymousClass28.progressToFullscreenMode) * Math.max(0.0f, f5));
            anonymousClass22.setScaleX(Math.max(0.9f, f4));
            anonymousClass22.setScaleY(Math.max(0.9f, f4));
            anonymousClass22.setAlpha((1.0f - anonymousClass28.progressToFullscreenMode) * Math.max(0.0f, f5));
        } else {
            anonymousClass20.setScaleX(1.0f);
            anonymousClass20.setScaleY(1.0f);
            anonymousClass20.setAlpha(1.0f - anonymousClass28.progressToFullscreenMode);
            anonymousClass22.setScaleX(1.0f);
            anonymousClass22.setScaleY(1.0f);
            anonymousClass22.setAlpha(1.0f - anonymousClass28.progressToFullscreenMode);
            if (this.colorProgress > 1.0E-4f) {
                setColorProgress(0.0f);
            }
            iDp = 0;
        }
        checkGroupCallUiPositions_MessagesList();
        float f6 = iDp;
        this.menuItemsContainer.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f - AndroidUtilities.dp(53.0f)) - f6));
        this.titleLayout.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f - AndroidUtilities.dp(44.0f)) - f6));
        if (lightningView != null) {
            lightningView.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f - AndroidUtilities.dp(37.0f)));
        }
        AnonymousClass44 anonymousClass44 = this.scheduleTimerContainer;
        if (anonymousClass44 != null) {
            anonymousClass44.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f - AndroidUtilities.dp(44.0f)) - f6));
        }
        this.containerView.invalidate();
        updateTopBulletinY();
    }

    @Override
    public final void show() {
        super.show();
        RTMPStreamPipOverlay rTMPStreamPipOverlay = RTMPStreamPipOverlay.instance;
        if (rTMPStreamPipOverlay.isVisible) {
            rTMPStreamPipOverlay.dismissInternal$1();
        }
    }

    public final boolean showMenuForCell(View view) {
        GroupCallUserCell groupCallUserCell;
        boolean z;
        TLRPC.GroupCallParticipant participant;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        VolumeSlider volumeSlider;
        float f;
        ScrollView anonymousClass3;
        long peerId;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z2;
        AccountInstance accountInstance;
        ScrollView scrollView;
        long j;
        VolumeSlider volumeSlider2;
        AccountInstance accountInstance2;
        boolean z3;
        long j2;
        TLRPC.Peer peer;
        long j3;
        TLRPC.Peer peer2;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        long j4;
        int size;
        int i;
        AnonymousClass9 anonymousClass9;
        AnimatorSet animatorSet;
        long j5;
        ImageLocation forUserOrChat;
        ImageLocation forUserOrChat2;
        GroupCallMiniTextureView groupCallMiniTextureView;
        boolean z4;
        AnonymousClass30 anonymousClass30;
        GroupCallMiniTextureView groupCallMiniTextureView2;
        AvatarUpdaterDelegate avatarUpdaterDelegate;
        TLRPC.FileLocation fileLocation;
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell2;
        int x;
        float y;
        float y2;
        int measuredHeight;
        int y3;
        boolean z5;
        AnonymousClass28 anonymousClass28;
        AnonymousClass24 anonymousClass24;
        AnonymousClass33 anonymousClass33;
        int i2;
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell3;
        TLRPC.User user;
        ActionBarMenuSubItem actionBarMenuSubItem;
        boolean z6;
        boolean z7;
        boolean z8;
        ?? r15;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        int size2;
        int i8;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChannelParticipant adminInChannel;
        GroupCallActivity groupCallActivity = this;
        if (!groupCallActivity.itemAnimator.isRunning() && groupCallActivity.getContext() != null) {
            if (groupCallActivity.avatarPriviewTransitionInProgress || groupCallActivity.avatarsPreviewShowed) {
                groupCallActivity.dismissAvatarPreview(true);
                return false;
            }
            AnonymousClass63 anonymousClass63 = groupCallActivity.scrimPopupWindow;
            if (anonymousClass63 != null) {
                anonymousClass63.dismiss();
                groupCallActivity.scrimPopupWindow = null;
                return false;
            }
            groupCallActivity.clearScrimView();
            if (view instanceof GroupCallGridCell) {
                GroupCallGridCell groupCallGridCell = (GroupCallGridCell) view;
                if (groupCallGridCell.getParticipant() != groupCallActivity.call.videoNotAvailableParticipant) {
                    groupCallUserCell = new GroupCallUserCell(groupCallGridCell.getContext());
                    groupCallUserCell.setData(groupCallActivity.accountInstance, groupCallGridCell.getParticipant().participant, groupCallActivity.call, MessageObject.getPeerId(groupCallActivity.selfPeer), null, false);
                    AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = groupCallUserCell.rightDrawable;
                    if (swapAnimatedEmojiDrawable != null) {
                        swapAnimatedEmojiDrawable.play();
                    }
                    groupCallActivity.hasScrimAnchorView = false;
                    groupCallActivity.scrimGridView = groupCallGridCell;
                    groupCallActivity.scrimRenderer = groupCallGridCell.getRenderer();
                    if (!isTabletMode && !isLandscapeMode) {
                        groupCallActivity.containerView.addView(groupCallUserCell, LayoutHelper.createFrame(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                    if (groupCallUserCell != null) {
                        if (!isLandscapeMode || isTabletMode || AndroidUtilities.isInMultiwindow) {
                            z = false;
                        } else {
                            z = true;
                        }
                        participant = groupCallUserCell.getParticipant();
                        if (participant != null) {
                            Rect rect = new Rect();
                            actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(groupCallActivity.getContext());
                            actionBarPopupWindowLayout.setBackgroundDrawable(null);
                            actionBarPopupWindowLayout.setPadding(0, 0, 0, 0);
                            actionBarPopupWindowLayout.setOnTouchListener(new ChatActivity.AnonymousClass116(groupCallActivity, rect));
                            actionBarPopupWindowLayout.setDispatchKeyEventListener(new GroupCallActivity$$ExternalSyntheticLambda12(groupCallActivity, 5));
                            linearLayout = new LinearLayout(groupCallActivity.getContext());
                            if (participant.muted_by_you) {
                                linearLayout2 = null;
                            } else {
                                linearLayout2 = new LinearLayout(groupCallActivity.getContext());
                            }
                            groupCallActivity.currentOptionsLayout = linearLayout;
                            AnonymousClass61 anonymousClass61 = new AnonymousClass61(groupCallActivity.getContext(), linearLayout, linearLayout2, 0);
                            anonymousClass61.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            anonymousClass61.setOrientation(1);
                            int offsetColor = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_listViewBackgroundUnscrolled, false), Theme.getColor(null, Theme.key_voipgroup_listViewBackground, false), groupCallActivity.colorProgress, 1.0f);
                            if (linearLayout2 != null || groupCallUserCell.isSelfUser() || participant.muted_by_you || (participant.muted && !participant.can_self_unmute)) {
                                volumeSlider = null;
                            } else {
                                Drawable drawableMutate = groupCallActivity.getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                                drawableMutate.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                                linearLayout2.setBackgroundDrawable(drawableMutate);
                                anonymousClass61.addView(linearLayout2, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                                VolumeSlider volumeSlider3 = groupCallActivity.new VolumeSlider(groupCallActivity.getContext(), participant);
                                linearLayout2.addView(volumeSlider3, -1, 48);
                                volumeSlider = volumeSlider3;
                            }
                            linearLayout.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            linearLayout.setOrientation(1);
                            Drawable drawableMutate2 = groupCallActivity.getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                            drawableMutate2.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                            linearLayout.setBackgroundDrawable(drawableMutate2);
                            if (volumeSlider != null) {
                                f = -8.0f;
                            } else {
                                f = 0.0f;
                            }
                            anonymousClass61.addView(linearLayout, LayoutHelper.createLinear(0.0f, f, 0.0f, 0.0f, -2, -2));
                            anonymousClass3 = new LoginActivity.AnonymousClass3(groupCallActivity.getContext(), R.style.scrollbarShapeStyle, anonymousClass61);
                            anonymousClass3.setClipToPadding(false);
                            actionBarPopupWindowLayout.addView(anonymousClass3, LayoutHelper.createFrame(-2.0f, -2));
                            peerId = MessageObject.getPeerId(participant.peer);
                            arrayList = new ArrayList(2);
                            arrayList2 = new ArrayList(2);
                            arrayList3 = new ArrayList(2);
                            z2 = participant.peer instanceof TLRPC.TL_peerUser;
                            accountInstance = groupCallActivity.accountInstance;
                            if (z2) {
                                scrollView = anonymousClass3;
                                j = peerId;
                                volumeSlider2 = volumeSlider;
                                accountInstance2 = accountInstance;
                                if (j == (-groupCallActivity.getChatId())) {
                                }
                            } else if (ChatObject.isChannel(groupCallActivity.currentChat)) {
                                scrollView = anonymousClass3;
                                volumeSlider2 = volumeSlider;
                                accountInstance2 = accountInstance;
                                j = peerId;
                                adminInChannel = accountInstance.getMessagesController().getAdminInChannel(participant.peer.user_id, groupCallActivity.getChatId());
                                if (adminInChannel != null || (!(adminInChannel instanceof TLRPC.TL_channelParticipantCreator) && !adminInChannel.admin_rights.manage_call)) {
                                }
                            } else {
                                scrollView = anonymousClass3;
                                j = peerId;
                                volumeSlider2 = volumeSlider;
                                accountInstance2 = accountInstance;
                                chatFull = accountInstance2.getMessagesController().getChatFull(groupCallActivity.getChatId());
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                    size2 = chatParticipants.participants.size();
                                    i8 = 0;
                                    while (true) {
                                        if (i8 < size2) {
                                            chatParticipant = chatFull.participants.participants.get(i8);
                                            chatFull2 = chatFull;
                                            if (chatParticipant.user_id == participant.peer.user_id) {
                                                z3 = !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator);
                                            } else {
                                                i8++;
                                                chatFull = chatFull2;
                                            }
                                        }
                                    }
                                }
                            }
                            if (groupCallUserCell.isSelfUser()) {
                                if (groupCallActivity.isConference() && groupCallUserCell.lastRaisedHand) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupCancelRaiseHand));
                                    zzlo.m(R.drawable.msg_handdown, 7, arrayList2, arrayList3);
                                }
                                if (groupCallUserCell.avatarImageView.getImageReceiver().hasNotThumb()) {
                                    i3 = R.string.VoipAddPhoto;
                                } else {
                                    i3 = R.string.VoipSetNewPhoto;
                                }
                                arrayList.add(LocaleController.getString(i3));
                                zzlo.m(R.drawable.msg_addphoto, 9, arrayList2, arrayList3);
                                if (j > 0) {
                                    if (TextUtils.isEmpty(participant.about)) {
                                        i7 = R.string.VoipAddBio;
                                    } else {
                                        i7 = R.string.VoipEditBio;
                                    }
                                    arrayList.add(LocaleController.getString(i7));
                                } else {
                                    if (TextUtils.isEmpty(participant.about)) {
                                        i4 = R.string.VoipAddDescription;
                                    } else {
                                        i4 = R.string.VoipEditDescription;
                                    }
                                    arrayList.add(LocaleController.getString(i4));
                                }
                                if (TextUtils.isEmpty(participant.about)) {
                                    i5 = R.drawable.msg_addbio;
                                } else {
                                    i5 = R.drawable.msg_info;
                                }
                                zzlo.m(i5, 10, arrayList2, arrayList3);
                                if (j > 0) {
                                    i6 = R.string.VoipEditName;
                                } else {
                                    i6 = R.string.VoipEditTitle;
                                }
                                arrayList.add(LocaleController.getString(i6));
                                zzlo.m(R.drawable.msg_edit, 11, arrayList2, arrayList3);
                                j2 = 0;
                            } else {
                                j2 = 0;
                                if (groupCallActivity.canManageCall()) {
                                    if (groupCallActivity.isConference() && z3 && participant.muted) {
                                        if (groupCallActivity.isConference() && participant.muted_by_you) {
                                            arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                            zzlo.m(R.drawable.msg_voice_unmuted, 4, arrayList2, arrayList3);
                                        }
                                    } else if (participant.muted || participant.can_self_unmute) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupMute));
                                        zzlo.m(R.drawable.msg_voice_muted, 0, arrayList2, arrayList3);
                                    } else {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupAllowToSpeak));
                                        if (participant.raise_hand_rating != 0) {
                                            arrayList2.add(Integer.valueOf(R.drawable.msg_allowspeak));
                                        } else {
                                            arrayList2.add(Integer.valueOf(R.drawable.msg_voice_unmuted));
                                        }
                                        arrayList3.add(1);
                                    }
                                    peer2 = participant.peer;
                                    if (peer2 != null) {
                                        j4 = peer2.channel_id;
                                        if (j4 != 0 || ChatObject.isMegagroup(groupCallActivity.currentAccount, j4)) {
                                            arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                            zzlo.m(R.drawable.msg_openprofile, 6, arrayList2, arrayList3);
                                        } else {
                                            arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChannel));
                                            zzlo.m(R.drawable.msg_channel, 8, arrayList2, arrayList3);
                                        }
                                    } else {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                        zzlo.m(R.drawable.msg_openprofile, 6, arrayList2, arrayList3);
                                    }
                                    if (groupCallActivity.isConference() ? !(z3 || !ChatObject.canBlockUsers(groupCallActivity.currentChat)) : !((call = groupCallActivity.call) == null || (groupCall = call.call) == null || !groupCall.creator)) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupUserRemove));
                                        zzlo.m(R.drawable.msg_block2, 2, arrayList2, arrayList3);
                                    }
                                } else {
                                    if (participant.muted_by_you) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                        zzlo.m(R.drawable.msg_voice_unmuted, 4, arrayList2, arrayList3);
                                    } else {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupMuteForMe));
                                        zzlo.m(R.drawable.msg_voice_muted, 5, arrayList2, arrayList3);
                                    }
                                    peer = participant.peer;
                                    if (peer != null) {
                                        j3 = peer.channel_id;
                                        if (j3 != 0 || ChatObject.isMegagroup(groupCallActivity.currentAccount, j3)) {
                                            arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                            zzlo.m(R.drawable.msg_msgbubble3, 6, arrayList2, arrayList3);
                                        } else {
                                            arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChannel));
                                            zzlo.m(R.drawable.msg_msgbubble3, 8, arrayList2, arrayList3);
                                        }
                                    } else {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                        zzlo.m(R.drawable.msg_msgbubble3, 6, arrayList2, arrayList3);
                                    }
                                }
                            }
                            size = arrayList.size();
                            i = 0;
                            while (i < size) {
                                Context context = groupCallActivity.getContext();
                                if (i == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (i == size - 1) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                actionBarMenuSubItem = new ActionBarMenuSubItem(0, context, null, z6, z7);
                                if (((Integer) arrayList3.get(i)).intValue() != 2) {
                                    int i9 = Theme.key_voipgroup_actionBarItems;
                                    z8 = false;
                                    r15 = 0;
                                    int color = Theme.getColor(null, i9, false);
                                    int color2 = Theme.getColor(null, i9, false);
                                    actionBarMenuSubItem.setTextColor(color);
                                    actionBarMenuSubItem.setIconColor(color2);
                                } else {
                                    z8 = false;
                                    r15 = 0;
                                    int i10 = Theme.key_voipgroup_leaveCallMenu;
                                    int color3 = Theme.getColor(null, i10, false);
                                    int color4 = Theme.getColor(null, i10, false);
                                    actionBarMenuSubItem.setTextColor(color3);
                                    actionBarMenuSubItem.setIconColor(color4);
                                }
                                actionBarMenuSubItem.setSelectorColor(Theme.getColor(r15, Theme.key_voipgroup_listSelector, z8));
                                actionBarMenuSubItem.setTextAndIcon((CharSequence) arrayList.get(i), ((Integer) arrayList2.get(i)).intValue(), r15);
                                linearLayout.addView(actionBarMenuSubItem);
                                actionBarMenuSubItem.setTag(arrayList3.get(i));
                                groupCallActivity = this;
                                actionBarMenuSubItem.setOnClickListener(new TopicsFragment$$ExternalSyntheticLambda17(groupCallActivity, i, arrayList3, participant, 3));
                                i++;
                                arrayList = arrayList;
                            }
                            scrollView.addView(anonymousClass61, LayoutHelper.createScroll(-2, -2, 51));
                            anonymousClass9 = groupCallActivity.listView;
                            anonymousClass9.stopScroll();
                            groupCallActivity.layoutManager.canScrollVertically = false;
                            groupCallActivity.scrimView = groupCallUserCell;
                            groupCallUserCell.setAboutVisible(true);
                            groupCallActivity.containerView.invalidate();
                            anonymousClass9.invalidate();
                            animatorSet = groupCallActivity.scrimAnimatorSet;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                            }
                            groupCallActivity.scrimPopupLayout = actionBarPopupWindowLayout;
                            if (j > j2) {
                                user = accountInstance2.getMessagesController().getUser(Long.valueOf(j));
                                forUserOrChat = ImageLocation.getForUserOrChat(accountInstance2.getCurrentAccount(), user, 0);
                                forUserOrChat2 = ImageLocation.getForUserOrChat(accountInstance2.getCurrentAccount(), user, 1);
                                j5 = j;
                                if (MessagesController.getInstance(groupCallActivity.currentAccount).getUserFull(j5) == null) {
                                    MessagesController.getInstance(groupCallActivity.currentAccount).loadUserInfo(user, false, 0);
                                }
                            } else {
                                j5 = j;
                                TLRPC.Chat chat = accountInstance2.getMessagesController().getChat(Long.valueOf(-j5));
                                forUserOrChat = ImageLocation.getForUserOrChat(accountInstance2.getCurrentAccount(), chat, 0);
                                forUserOrChat2 = ImageLocation.getForUserOrChat(accountInstance2.getCurrentAccount(), chat, 1);
                            }
                            groupCallMiniTextureView = groupCallActivity.scrimRenderer;
                            if (groupCallMiniTextureView == null && groupCallMiniTextureView.attached) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (forUserOrChat != null && !z4) {
                                z = false;
                            } else if (z) {
                                BackupImageView avatarImageView = groupCallActivity.scrimView.getAvatarImageView();
                                anonymousClass30 = groupCallActivity.avatarsViewPager;
                                anonymousClass30.setParentAvatarImage(avatarImageView);
                                anonymousClass30.setHasActiveVideo(z4);
                                anonymousClass30.setData(j5, true);
                                anonymousClass30.setCreateThumbFromParent(true);
                                anonymousClass30.initIfEmpty(null, forUserOrChat, forUserOrChat2, true);
                                groupCallMiniTextureView2 = groupCallActivity.scrimRenderer;
                                if (groupCallMiniTextureView2 != null) {
                                    groupCallMiniTextureView2.showingAsScrimView = true;
                                    groupCallMiniTextureView2.updateAttachState(true);
                                }
                                if (MessageObject.getPeerId(groupCallActivity.selfPeer) == j5 && groupCallActivity.currentAvatarUpdater != null && (avatarUpdaterDelegate = groupCallActivity.avatarUpdaterDelegate) != null && (fileLocation = avatarUpdaterDelegate.avatar) != null) {
                                    anonymousClass30.addUploadingImage(avatarUpdaterDelegate.uploadingImageLocation, ImageLocation.getForLocal(fileLocation));
                                }
                            }
                            if (z) {
                                groupCallActivity.avatarsPreviewShowed = true;
                                actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                                groupCallActivity.containerView.addView(groupCallActivity.scrimPopupLayout, LayoutHelper.createFrame(-2.0f, -2));
                                groupCallActivity.useBlur = true;
                                anonymousClass33 = groupCallActivity.blurredView;
                                if (anonymousClass33 == null) {
                                    i2 = 0;
                                } else {
                                    int measuredWidth = (int) ((groupCallActivity.containerView.getMeasuredWidth() - (groupCallActivity.backgroundPaddingLeft * 2)) / 6.0f);
                                    int measuredHeight2 = (int) ((groupCallActivity.containerView.getMeasuredHeight() - AndroidUtilities.statusBarHeight) / 6.0f);
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight2, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                                    canvas.scale(0.16666667f, 0.16666667f);
                                    canvas.save();
                                    canvas.translate(0.0f, -AndroidUtilities.statusBarHeight);
                                    ((ActionBarLayout) groupCallActivity.parentActivity.getActionBarLayout()).getView().draw(canvas);
                                    canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, 76));
                                    canvas.restore();
                                    canvas.save();
                                    canvas.translate(groupCallActivity.containerView.getX(), -AndroidUtilities.statusBarHeight);
                                    groupCallActivity.drawingForBlur = true;
                                    groupCallActivity.containerView.draw(canvas);
                                    i2 = 0;
                                    groupCallActivity.drawingForBlur = false;
                                    Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight2) / 180));
                                    anonymousClass33.setBackground(new BitmapDrawable(bitmapCreateBitmap));
                                    anonymousClass33.setAlpha(0.0f);
                                    anonymousClass33.setVisibility(0);
                                    anonymousClass33.bringToFront();
                                }
                                groupCallActivity.avatarPriviewTransitionInProgress = true;
                                groupCallActivity.avatarPreviewContainer.setVisibility(i2);
                                if (volumeSlider2 != null) {
                                    volumeSlider2.invalidate();
                                }
                                groupCallActivity.runAvatarPreviewTransition(true, groupCallUserCell);
                                groupCallUserCell3 = groupCallActivity.scrimFullscreenView;
                                if (groupCallUserCell3 != null) {
                                    groupCallUserCell3.getAvatarImageView().setAlpha(0.0f);
                                }
                                return true;
                            }
                            groupCallActivity.avatarsPreviewShowed = false;
                            AnonymousClass63 anonymousClass64 = groupCallActivity.new AnonymousClass63(actionBarPopupWindowLayout);
                            groupCallActivity.scrimPopupWindow = anonymousClass64;
                            anonymousClass64.pauseNotifications = true;
                            anonymousClass64.dismissAnimationDuration = 220;
                            anonymousClass64.setOutsideTouchable(true);
                            groupCallActivity.scrimPopupWindow.setClippingEnabled(true);
                            groupCallActivity.scrimPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                            groupCallActivity.scrimPopupWindow.setFocusable(true);
                            actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                            groupCallActivity.scrimPopupWindow.setInputMethodMode(2);
                            groupCallActivity.scrimPopupWindow.setSoftInputMode(0);
                            groupCallActivity.scrimPopupWindow.getContentView().setFocusableInTouchMode(true);
                            groupCallUserCell2 = groupCallActivity.scrimFullscreenView;
                            if (groupCallUserCell2 != null) {
                                z5 = isLandscapeMode;
                                anonymousClass28 = groupCallActivity.renderersContainer;
                                anonymousClass24 = groupCallActivity.fullscreenUsersListView;
                                if (z5) {
                                    x = AndroidUtilities.dp(32.0f) + (((int) (anonymousClass28.getX() + (anonymousClass24.getX() + groupCallUserCell2.getX()))) - actionBarPopupWindowLayout.getMeasuredWidth());
                                    y3 = ((int) (anonymousClass28.getY() + (anonymousClass24.getY() + groupCallActivity.scrimFullscreenView.getY()))) - AndroidUtilities.dp(6.0f);
                                } else {
                                    x = ((int) (anonymousClass28.getX() + (anonymousClass24.getX() + groupCallUserCell2.getX()))) - AndroidUtilities.dp(14.0f);
                                    y = (anonymousClass28.getY() + (anonymousClass24.getY() + groupCallActivity.scrimFullscreenView.getY())) - actionBarPopupWindowLayout.getMeasuredHeight();
                                    y3 = (int) y;
                                }
                            } else {
                                x = (int) (((anonymousClass9.getX() + anonymousClass9.getMeasuredWidth()) + AndroidUtilities.dp(8.0f)) - actionBarPopupWindowLayout.getMeasuredWidth());
                                if (groupCallActivity.hasScrimAnchorView) {
                                    y2 = groupCallUserCell.getY() + anonymousClass9.getY();
                                    measuredHeight = groupCallUserCell.getClipHeight();
                                } else if (groupCallActivity.scrimGridView != null) {
                                    y2 = groupCallActivity.scrimGridView.getY() + anonymousClass9.getY();
                                    measuredHeight = groupCallActivity.scrimGridView.getMeasuredHeight();
                                } else {
                                    y = anonymousClass9.getY();
                                    y3 = (int) y;
                                }
                                y3 = (int) (y2 + measuredHeight);
                            }
                            groupCallActivity.scrimPopupWindow.showAtLocation(anonymousClass9, 51, x, y3);
                            groupCallActivity.scrimAnimatorSet = new AnimatorSet();
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(ObjectAnimator.ofInt(groupCallActivity.scrimPaint, AnimationProperties.PAINT_ALPHA, 0, 100));
                            groupCallActivity.scrimAnimatorSet.playTogether(arrayList4);
                            groupCallActivity.scrimAnimatorSet.setDuration(150L);
                            groupCallActivity.scrimAnimatorSet.start();
                            return true;
                        }
                    }
                }
            } else {
                if (view instanceof GroupCallFullscreenAdapter.GroupCallUserCell) {
                    GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell4 = (GroupCallFullscreenAdapter.GroupCallUserCell) view;
                    if (groupCallUserCell4.getParticipant() != groupCallActivity.call.videoNotAvailableParticipant.participant) {
                        groupCallUserCell = new GroupCallUserCell(groupCallUserCell4.getContext());
                        groupCallUserCell.setData(groupCallActivity.accountInstance, groupCallUserCell4.getParticipant(), groupCallActivity.call, MessageObject.getPeerId(groupCallActivity.selfPeer), null, false);
                        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = groupCallUserCell.rightDrawable;
                        if (swapAnimatedEmojiDrawable2 != null) {
                            swapAnimatedEmojiDrawable2.play();
                        }
                        groupCallActivity.hasScrimAnchorView = false;
                        groupCallActivity.scrimFullscreenView = groupCallUserCell4;
                        GroupCallMiniTextureView renderer = groupCallUserCell4.getRenderer();
                        groupCallActivity.scrimRenderer = renderer;
                        if (renderer != null && renderer.showingInFullscreen) {
                            groupCallActivity.scrimRenderer = null;
                        }
                        groupCallActivity.containerView.addView(groupCallUserCell, LayoutHelper.createFrame(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                } else {
                    groupCallUserCell = (GroupCallUserCell) view;
                    groupCallActivity.hasScrimAnchorView = true;
                }
                if (groupCallUserCell != null) {
                    if (isLandscapeMode) {
                        z = false;
                    } else {
                        z = false;
                    }
                    participant = groupCallUserCell.getParticipant();
                    if (participant != null) {
                        Rect rect2 = new Rect();
                        actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(groupCallActivity.getContext());
                        actionBarPopupWindowLayout.setBackgroundDrawable(null);
                        actionBarPopupWindowLayout.setPadding(0, 0, 0, 0);
                        actionBarPopupWindowLayout.setOnTouchListener(new ChatActivity.AnonymousClass116(groupCallActivity, rect2));
                        actionBarPopupWindowLayout.setDispatchKeyEventListener(new GroupCallActivity$$ExternalSyntheticLambda12(groupCallActivity, 5));
                        linearLayout = new LinearLayout(groupCallActivity.getContext());
                        if (participant.muted_by_you) {
                            linearLayout2 = new LinearLayout(groupCallActivity.getContext());
                        } else {
                            linearLayout2 = null;
                        }
                        groupCallActivity.currentOptionsLayout = linearLayout;
                        AnonymousClass61 anonymousClass62 = new AnonymousClass61(groupCallActivity.getContext(), linearLayout, linearLayout2, 0);
                        anonymousClass62.setMinimumWidth(AndroidUtilities.dp(240.0f));
                        anonymousClass62.setOrientation(1);
                        int offsetColor2 = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_listViewBackgroundUnscrolled, false), Theme.getColor(null, Theme.key_voipgroup_listViewBackground, false), groupCallActivity.colorProgress, 1.0f);
                        if (linearLayout2 != null) {
                            volumeSlider = null;
                        } else {
                            volumeSlider = null;
                        }
                        linearLayout.setMinimumWidth(AndroidUtilities.dp(240.0f));
                        linearLayout.setOrientation(1);
                        Drawable drawableMutate3 = groupCallActivity.getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        drawableMutate3.setColorFilter(new PorterDuffColorFilter(offsetColor2, PorterDuff.Mode.MULTIPLY));
                        linearLayout.setBackgroundDrawable(drawableMutate3);
                        if (volumeSlider != null) {
                            f = -8.0f;
                        } else {
                            f = 0.0f;
                        }
                        anonymousClass62.addView(linearLayout, LayoutHelper.createLinear(0.0f, f, 0.0f, 0.0f, -2, -2));
                        anonymousClass3 = new LoginActivity.AnonymousClass3(groupCallActivity.getContext(), R.style.scrollbarShapeStyle, anonymousClass62);
                        anonymousClass3.setClipToPadding(false);
                        actionBarPopupWindowLayout.addView(anonymousClass3, LayoutHelper.createFrame(-2.0f, -2));
                        peerId = MessageObject.getPeerId(participant.peer);
                        arrayList = new ArrayList(2);
                        arrayList2 = new ArrayList(2);
                        arrayList3 = new ArrayList(2);
                        z2 = participant.peer instanceof TLRPC.TL_peerUser;
                        accountInstance = groupCallActivity.accountInstance;
                        if (z2) {
                            scrollView = anonymousClass3;
                            j = peerId;
                            volumeSlider2 = volumeSlider;
                            accountInstance2 = accountInstance;
                            if (j == (-groupCallActivity.getChatId())) {
                            }
                        } else if (ChatObject.isChannel(groupCallActivity.currentChat)) {
                            scrollView = anonymousClass3;
                            volumeSlider2 = volumeSlider;
                            accountInstance2 = accountInstance;
                            j = peerId;
                            adminInChannel = accountInstance.getMessagesController().getAdminInChannel(participant.peer.user_id, groupCallActivity.getChatId());
                            if (adminInChannel != null) {
                            }
                        } else {
                            scrollView = anonymousClass3;
                            j = peerId;
                            volumeSlider2 = volumeSlider;
                            accountInstance2 = accountInstance;
                            chatFull = accountInstance2.getMessagesController().getChatFull(groupCallActivity.getChatId());
                            if (chatFull != null) {
                                size2 = chatParticipants.participants.size();
                                i8 = 0;
                                while (true) {
                                    if (i8 < size2) {
                                        chatParticipant = chatFull.participants.participants.get(i8);
                                        chatFull2 = chatFull;
                                        if (chatParticipant.user_id == participant.peer.user_id) {
                                            if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                                            }
                                        } else {
                                            i8++;
                                            chatFull = chatFull2;
                                        }
                                    }
                                }
                            }
                        }
                        if (groupCallUserCell.isSelfUser()) {
                            if (groupCallActivity.isConference()) {
                                arrayList.add(LocaleController.getString(R.string.VoipGroupCancelRaiseHand));
                                zzlo.m(R.drawable.msg_handdown, 7, arrayList2, arrayList3);
                            }
                            if (groupCallUserCell.avatarImageView.getImageReceiver().hasNotThumb()) {
                                i3 = R.string.VoipAddPhoto;
                            } else {
                                i3 = R.string.VoipSetNewPhoto;
                            }
                            arrayList.add(LocaleController.getString(i3));
                            zzlo.m(R.drawable.msg_addphoto, 9, arrayList2, arrayList3);
                            if (j > 0) {
                                if (TextUtils.isEmpty(participant.about)) {
                                    i7 = R.string.VoipAddBio;
                                } else {
                                    i7 = R.string.VoipEditBio;
                                }
                                arrayList.add(LocaleController.getString(i7));
                            } else {
                                if (TextUtils.isEmpty(participant.about)) {
                                    i4 = R.string.VoipAddDescription;
                                } else {
                                    i4 = R.string.VoipEditDescription;
                                }
                                arrayList.add(LocaleController.getString(i4));
                            }
                            if (TextUtils.isEmpty(participant.about)) {
                                i5 = R.drawable.msg_addbio;
                            } else {
                                i5 = R.drawable.msg_info;
                            }
                            zzlo.m(i5, 10, arrayList2, arrayList3);
                            if (j > 0) {
                                i6 = R.string.VoipEditName;
                            } else {
                                i6 = R.string.VoipEditTitle;
                            }
                            arrayList.add(LocaleController.getString(i6));
                            zzlo.m(R.drawable.msg_edit, 11, arrayList2, arrayList3);
                            j2 = 0;
                        } else {
                            j2 = 0;
                            if (groupCallActivity.canManageCall()) {
                                if (groupCallActivity.isConference()) {
                                    if (participant.muted) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupMute));
                                        zzlo.m(R.drawable.msg_voice_muted, 0, arrayList2, arrayList3);
                                    } else {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupMute));
                                        zzlo.m(R.drawable.msg_voice_muted, 0, arrayList2, arrayList3);
                                    }
                                } else if (participant.muted) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMute));
                                    zzlo.m(R.drawable.msg_voice_muted, 0, arrayList2, arrayList3);
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMute));
                                    zzlo.m(R.drawable.msg_voice_muted, 0, arrayList2, arrayList3);
                                }
                                peer2 = participant.peer;
                                if (peer2 != null) {
                                    j4 = peer2.channel_id;
                                    if (j4 != 0) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                        zzlo.m(R.drawable.msg_openprofile, 6, arrayList2, arrayList3);
                                    } else {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                        zzlo.m(R.drawable.msg_openprofile, 6, arrayList2, arrayList3);
                                    }
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                    zzlo.m(R.drawable.msg_openprofile, 6, arrayList2, arrayList3);
                                }
                                if (groupCallActivity.isConference()) {
                                }
                            } else {
                                if (participant.muted_by_you) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                    zzlo.m(R.drawable.msg_voice_unmuted, 4, arrayList2, arrayList3);
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMuteForMe));
                                    zzlo.m(R.drawable.msg_voice_muted, 5, arrayList2, arrayList3);
                                }
                                peer = participant.peer;
                                if (peer != null) {
                                    j3 = peer.channel_id;
                                    if (j3 != 0) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                        zzlo.m(R.drawable.msg_msgbubble3, 6, arrayList2, arrayList3);
                                    } else {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                        zzlo.m(R.drawable.msg_msgbubble3, 6, arrayList2, arrayList3);
                                    }
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                    zzlo.m(R.drawable.msg_msgbubble3, 6, arrayList2, arrayList3);
                                }
                            }
                        }
                        size = arrayList.size();
                        i = 0;
                        while (i < size) {
                            Context context2 = groupCallActivity.getContext();
                            if (i == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (i == size - 1) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            actionBarMenuSubItem = new ActionBarMenuSubItem(0, context2, null, z6, z7);
                            if (((Integer) arrayList3.get(i)).intValue() != 2) {
                                int i11 = Theme.key_voipgroup_actionBarItems;
                                z8 = false;
                                r15 = 0;
                                int color5 = Theme.getColor(null, i11, false);
                                int color6 = Theme.getColor(null, i11, false);
                                actionBarMenuSubItem.setTextColor(color5);
                                actionBarMenuSubItem.setIconColor(color6);
                            } else {
                                z8 = false;
                                r15 = 0;
                                int i12 = Theme.key_voipgroup_leaveCallMenu;
                                int color7 = Theme.getColor(null, i12, false);
                                int color8 = Theme.getColor(null, i12, false);
                                actionBarMenuSubItem.setTextColor(color7);
                                actionBarMenuSubItem.setIconColor(color8);
                            }
                            actionBarMenuSubItem.setSelectorColor(Theme.getColor(r15, Theme.key_voipgroup_listSelector, z8));
                            actionBarMenuSubItem.setTextAndIcon((CharSequence) arrayList.get(i), ((Integer) arrayList2.get(i)).intValue(), r15);
                            linearLayout.addView(actionBarMenuSubItem);
                            actionBarMenuSubItem.setTag(arrayList3.get(i));
                            groupCallActivity = this;
                            actionBarMenuSubItem.setOnClickListener(new TopicsFragment$$ExternalSyntheticLambda17(groupCallActivity, i, arrayList3, participant, 3));
                            i++;
                            arrayList = arrayList;
                        }
                        scrollView.addView(anonymousClass62, LayoutHelper.createScroll(-2, -2, 51));
                        anonymousClass9 = groupCallActivity.listView;
                        anonymousClass9.stopScroll();
                        groupCallActivity.layoutManager.canScrollVertically = false;
                        groupCallActivity.scrimView = groupCallUserCell;
                        groupCallUserCell.setAboutVisible(true);
                        groupCallActivity.containerView.invalidate();
                        anonymousClass9.invalidate();
                        animatorSet = groupCallActivity.scrimAnimatorSet;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        groupCallActivity.scrimPopupLayout = actionBarPopupWindowLayout;
                        if (j > j2) {
                            user = accountInstance2.getMessagesController().getUser(Long.valueOf(j));
                            forUserOrChat = ImageLocation.getForUserOrChat(accountInstance2.getCurrentAccount(), user, 0);
                            forUserOrChat2 = ImageLocation.getForUserOrChat(accountInstance2.getCurrentAccount(), user, 1);
                            j5 = j;
                            if (MessagesController.getInstance(groupCallActivity.currentAccount).getUserFull(j5) == null) {
                                MessagesController.getInstance(groupCallActivity.currentAccount).loadUserInfo(user, false, 0);
                            }
                        } else {
                            j5 = j;
                            TLRPC.Chat chat2 = accountInstance2.getMessagesController().getChat(Long.valueOf(-j5));
                            forUserOrChat = ImageLocation.getForUserOrChat(accountInstance2.getCurrentAccount(), chat2, 0);
                            forUserOrChat2 = ImageLocation.getForUserOrChat(accountInstance2.getCurrentAccount(), chat2, 1);
                        }
                        groupCallMiniTextureView = groupCallActivity.scrimRenderer;
                        if (groupCallMiniTextureView == null) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (forUserOrChat != null) {
                            if (z) {
                                BackupImageView avatarImageView2 = groupCallActivity.scrimView.getAvatarImageView();
                                anonymousClass30 = groupCallActivity.avatarsViewPager;
                                anonymousClass30.setParentAvatarImage(avatarImageView2);
                                anonymousClass30.setHasActiveVideo(z4);
                                anonymousClass30.setData(j5, true);
                                anonymousClass30.setCreateThumbFromParent(true);
                                anonymousClass30.initIfEmpty(null, forUserOrChat, forUserOrChat2, true);
                                groupCallMiniTextureView2 = groupCallActivity.scrimRenderer;
                                if (groupCallMiniTextureView2 != null) {
                                    groupCallMiniTextureView2.showingAsScrimView = true;
                                    groupCallMiniTextureView2.updateAttachState(true);
                                }
                                if (MessageObject.getPeerId(groupCallActivity.selfPeer) == j5) {
                                    anonymousClass30.addUploadingImage(avatarUpdaterDelegate.uploadingImageLocation, ImageLocation.getForLocal(fileLocation));
                                }
                            }
                        } else if (z) {
                            BackupImageView avatarImageView3 = groupCallActivity.scrimView.getAvatarImageView();
                            anonymousClass30 = groupCallActivity.avatarsViewPager;
                            anonymousClass30.setParentAvatarImage(avatarImageView3);
                            anonymousClass30.setHasActiveVideo(z4);
                            anonymousClass30.setData(j5, true);
                            anonymousClass30.setCreateThumbFromParent(true);
                            anonymousClass30.initIfEmpty(null, forUserOrChat, forUserOrChat2, true);
                            groupCallMiniTextureView2 = groupCallActivity.scrimRenderer;
                            if (groupCallMiniTextureView2 != null) {
                                groupCallMiniTextureView2.showingAsScrimView = true;
                                groupCallMiniTextureView2.updateAttachState(true);
                            }
                            if (MessageObject.getPeerId(groupCallActivity.selfPeer) == j5) {
                                anonymousClass30.addUploadingImage(avatarUpdaterDelegate.uploadingImageLocation, ImageLocation.getForLocal(fileLocation));
                            }
                        }
                        if (z) {
                            groupCallActivity.avatarsPreviewShowed = true;
                            actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                            groupCallActivity.containerView.addView(groupCallActivity.scrimPopupLayout, LayoutHelper.createFrame(-2.0f, -2));
                            groupCallActivity.useBlur = true;
                            anonymousClass33 = groupCallActivity.blurredView;
                            if (anonymousClass33 == null) {
                                i2 = 0;
                            } else {
                                int measuredWidth2 = (int) ((groupCallActivity.containerView.getMeasuredWidth() - (groupCallActivity.backgroundPaddingLeft * 2)) / 6.0f);
                                int measuredHeight3 = (int) ((groupCallActivity.containerView.getMeasuredHeight() - AndroidUtilities.statusBarHeight) / 6.0f);
                                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(measuredWidth2, measuredHeight3, Bitmap.Config.ARGB_8888);
                                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                                canvas2.scale(0.16666667f, 0.16666667f);
                                canvas2.save();
                                canvas2.translate(0.0f, -AndroidUtilities.statusBarHeight);
                                ((ActionBarLayout) groupCallActivity.parentActivity.getActionBarLayout()).getView().draw(canvas2);
                                canvas2.drawColor(ColorUtils.setAlphaComponent(-16777216, 76));
                                canvas2.restore();
                                canvas2.save();
                                canvas2.translate(groupCallActivity.containerView.getX(), -AndroidUtilities.statusBarHeight);
                                groupCallActivity.drawingForBlur = true;
                                groupCallActivity.containerView.draw(canvas2);
                                i2 = 0;
                                groupCallActivity.drawingForBlur = false;
                                Utilities.stackBlurBitmap(bitmapCreateBitmap2, Math.max(7, Math.max(measuredWidth2, measuredHeight3) / 180));
                                anonymousClass33.setBackground(new BitmapDrawable(bitmapCreateBitmap2));
                                anonymousClass33.setAlpha(0.0f);
                                anonymousClass33.setVisibility(0);
                                anonymousClass33.bringToFront();
                            }
                            groupCallActivity.avatarPriviewTransitionInProgress = true;
                            groupCallActivity.avatarPreviewContainer.setVisibility(i2);
                            if (volumeSlider2 != null) {
                                volumeSlider2.invalidate();
                            }
                            groupCallActivity.runAvatarPreviewTransition(true, groupCallUserCell);
                            groupCallUserCell3 = groupCallActivity.scrimFullscreenView;
                            if (groupCallUserCell3 != null) {
                                groupCallUserCell3.getAvatarImageView().setAlpha(0.0f);
                            }
                            return true;
                        }
                        groupCallActivity.avatarsPreviewShowed = false;
                        AnonymousClass63 anonymousClass65 = groupCallActivity.new AnonymousClass63(actionBarPopupWindowLayout);
                        groupCallActivity.scrimPopupWindow = anonymousClass65;
                        anonymousClass65.pauseNotifications = true;
                        anonymousClass65.dismissAnimationDuration = 220;
                        anonymousClass65.setOutsideTouchable(true);
                        groupCallActivity.scrimPopupWindow.setClippingEnabled(true);
                        groupCallActivity.scrimPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                        groupCallActivity.scrimPopupWindow.setFocusable(true);
                        actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                        groupCallActivity.scrimPopupWindow.setInputMethodMode(2);
                        groupCallActivity.scrimPopupWindow.setSoftInputMode(0);
                        groupCallActivity.scrimPopupWindow.getContentView().setFocusableInTouchMode(true);
                        groupCallUserCell2 = groupCallActivity.scrimFullscreenView;
                        if (groupCallUserCell2 != null) {
                            z5 = isLandscapeMode;
                            anonymousClass28 = groupCallActivity.renderersContainer;
                            anonymousClass24 = groupCallActivity.fullscreenUsersListView;
                            if (z5) {
                                x = AndroidUtilities.dp(32.0f) + (((int) (anonymousClass28.getX() + (anonymousClass24.getX() + groupCallUserCell2.getX()))) - actionBarPopupWindowLayout.getMeasuredWidth());
                                y3 = ((int) (anonymousClass28.getY() + (anonymousClass24.getY() + groupCallActivity.scrimFullscreenView.getY()))) - AndroidUtilities.dp(6.0f);
                            } else {
                                x = ((int) (anonymousClass28.getX() + (anonymousClass24.getX() + groupCallUserCell2.getX()))) - AndroidUtilities.dp(14.0f);
                                y = (anonymousClass28.getY() + (anonymousClass24.getY() + groupCallActivity.scrimFullscreenView.getY())) - actionBarPopupWindowLayout.getMeasuredHeight();
                                y3 = (int) y;
                            }
                        } else {
                            x = (int) (((anonymousClass9.getX() + anonymousClass9.getMeasuredWidth()) + AndroidUtilities.dp(8.0f)) - actionBarPopupWindowLayout.getMeasuredWidth());
                            if (groupCallActivity.hasScrimAnchorView) {
                                y2 = groupCallUserCell.getY() + anonymousClass9.getY();
                                measuredHeight = groupCallUserCell.getClipHeight();
                            } else if (groupCallActivity.scrimGridView != null) {
                                y2 = groupCallActivity.scrimGridView.getY() + anonymousClass9.getY();
                                measuredHeight = groupCallActivity.scrimGridView.getMeasuredHeight();
                            } else {
                                y = anonymousClass9.getY();
                                y3 = (int) y;
                            }
                            y3 = (int) (y2 + measuredHeight);
                        }
                        groupCallActivity.scrimPopupWindow.showAtLocation(anonymousClass9, 51, x, y3);
                        groupCallActivity.scrimAnimatorSet = new AnimatorSet();
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(ObjectAnimator.ofInt(groupCallActivity.scrimPaint, AnimationProperties.PAINT_ALPHA, 0, 100));
                        groupCallActivity.scrimAnimatorSet.playTogether(arrayList5);
                        groupCallActivity.scrimAnimatorSet.setDuration(150L);
                        groupCallActivity.scrimAnimatorSet.start();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void showRecordHint(View view) {
        if (this.recordHintView == null) {
            HintView hintView = new HintView(8, getContext(), null, true);
            this.recordHintView = hintView;
            hintView.setAlpha(0.0f);
            this.recordHintView.setVisibility(4);
            this.recordHintView.setShowingDuration(3000L);
            this.containerView.addView(this.recordHintView, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (ChatObject.isChannelOrGiga(this.currentChat)) {
                this.recordHintView.setText(LocaleController.getString(R.string.VoipChannelRecording));
            } else {
                this.recordHintView.setText(LocaleController.getString(R.string.VoipGroupRecording));
            }
            this.recordHintView.setBackgroundColor();
        }
        this.recordHintView.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.recordHintView.showForView(view, true);
    }

    public final void toggleAdminSpeak() {
        ChatObject.Call call = this.call;
        if (call == null || call.call == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = this.call.getInputGroupCall();
        togglegroupcallsettings.join_muted = Boolean.valueOf(this.call.call.join_muted);
        ConnectionsManager connectionsManager = this.accountInstance.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new ChatThemeController$$ExternalSyntheticLambda8(dispatchQueue), new GroupCallActivity$$ExternalSyntheticLambda65(this, 1));
    }

    public final void updateButtonsVisibility(boolean z) {
        boolean zBooleanValue;
        boolean z2;
        boolean z3;
        boolean z4;
        ChatObject.Call call = this.call;
        VoIPToggleButton voIPToggleButton = this.messageButton;
        VoIPToggleButton voIPToggleButton2 = this.speakerButton;
        VoIPToggleButton voIPToggleButton3 = this.soundButton;
        VoIPToggleButton voIPToggleButton4 = this.flipButton;
        VoIPToggleButton voIPToggleButton5 = this.cameraButton;
        VoIPToggleButton voIPToggleButton6 = this.leaveButton;
        VoIPToggleButton voIPToggleButton7 = this.muteButton;
        AnonymousClass17 anonymousClass17 = this.buttonsContainer;
        boolean z5 = false;
        if (call == null || call.isScheduled()) {
            anonymousClass17.setButtonVisibility(voIPToggleButton7, this.switchToButtonProgress > 0.1f, z);
            anonymousClass17.setButtonVisibility(voIPToggleButton6, this.switchToButtonProgress > 0.1f, z);
            anonymousClass17.setButtonVisibility(voIPToggleButton3, this.switchToButtonProgress > 0.1f, z);
            anonymousClass17.setButtonVisibility(voIPToggleButton5, false, z);
            anonymousClass17.setButtonVisibility(voIPToggleButton4, false, z);
            anonymousClass17.setButtonVisibility(voIPToggleButton2, false, z);
            anonymousClass17.setButtonVisibility(voIPToggleButton, false, z);
            return;
        }
        boolean z6 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
        boolean z7 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || canManageCall()) ? false : true;
        Boolean bool = this.pendingCommentsEnabled;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            TLRPC.GroupCall groupCall = this.call.call;
            zBooleanValue = groupCall != null && groupCall.messages_enabled;
        }
        if (((z7 || !this.call.canRecordVideo()) && !z6) || isRtmpStream()) {
            z5 = true;
            z2 = false;
        } else {
            z2 = true;
        }
        if (z6) {
            z3 = false;
            z4 = true;
        } else {
            z3 = !z7;
            z4 = false;
        }
        if (isLandscapeMode) {
            z3 = false;
            z4 = false;
        }
        anonymousClass17.setButtonVisibility(voIPToggleButton7, true, z);
        anonymousClass17.setButtonVisibility(voIPToggleButton6, true, z);
        anonymousClass17.setButtonVisibility(voIPToggleButton5, z2, z);
        anonymousClass17.setButtonVisibility(voIPToggleButton4, z4, z);
        anonymousClass17.setButtonVisibility(voIPToggleButton3, z5, z);
        anonymousClass17.setButtonVisibility(voIPToggleButton2, z3, z);
        anonymousClass17.setButtonVisibility(voIPToggleButton, zBooleanValue, z);
    }

    public final void updateItems$1$1() {
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        ChatObject.Call call2 = this.call;
        ActionBarMenuItem actionBarMenuItem = this.otherItem;
        ActionBarMenuItem actionBarMenuItem2 = this.screenShareItem;
        if (call2 == null || call2.isScheduled()) {
            this.pipItem.setVisibility(4);
            actionBarMenuItem2.setVisibility(8);
            if (this.call == null) {
                actionBarMenuItem.setVisibility(8);
                return;
            }
        }
        if (this.changingPermissions) {
            return;
        }
        AccountInstance accountInstance = this.accountInstance;
        TLRPC.Chat chat3 = accountInstance.getMessagesController().getChat(Long.valueOf(getChatId()));
        if (chat3 != null) {
            this.currentChat = chat3;
        }
        boolean zCanUserDoAdminAction = ChatObject.canUserDoAdminAction(this.currentChat, 3);
        ActionBarMenuSubItem actionBarMenuSubItem = this.inviteItem;
        if (zCanUserDoAdminAction || (((!ChatObject.isChannel(this.currentChat) || ((chat2 = this.currentChat) != null && chat2.megagroup)) && (ChatObject.isPublic(this.currentChat) || ChatObject.canUserDoAdminAction(this.currentChat, 3))) || (ChatObject.isChannel(this.currentChat) && (chat = this.currentChat) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
            actionBarMenuSubItem.setVisibility(0);
        } else {
            actionBarMenuSubItem.setVisibility(8);
        }
        ChatObject.Call call3 = this.call;
        ActionBarMenuSubItem actionBarMenuSubItem2 = this.disableComments;
        ActionBarMenuSubItem actionBarMenuSubItem3 = this.enableComments;
        if (call3 == null || (groupCall2 = call3.call) == null || !groupCall2.can_change_messages_enabled) {
            actionBarMenuSubItem3.setVisibility(8);
            actionBarMenuSubItem2.setVisibility(8);
        } else {
            actionBarMenuSubItem3.setVisibility(groupCall2.messages_enabled ? 8 : 0);
            actionBarMenuSubItem2.setVisibility(this.call.call.messages_enabled ? 0 : 8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
        ChatObject.Call call4 = this.call;
        ActionBarMenuSubItem actionBarMenuSubItem4 = this.noiseItem;
        if (call4 == null || call4.isScheduled() || !(groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            actionBarMenuSubItem4.setVisibility(8);
        } else {
            actionBarMenuSubItem4.setVisibility(0);
        }
        actionBarMenuSubItem4.setIcon(SharedConfig.noiseSupression ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        actionBarMenuSubItem4.setSubtext(LocaleController.getString(SharedConfig.noiseSupression ? R.string.VoipNoiseCancellationEnabled : R.string.VoipNoiseCancellationDisabled));
        boolean zCanManageCall = canManageCall();
        ActionBarMenuSubItem actionBarMenuSubItem5 = this.leaveItem;
        ActionBarMenuSubItem actionBarMenuSubItem6 = this.editTitleItem;
        ActionBarMenuSubItem actionBarMenuSubItem7 = this.recordItem;
        ActionBarMenuSubItem actionBarMenuSubItem8 = this.screenItem;
        if (zCanManageCall) {
            actionBarMenuSubItem5.setVisibility(0);
            actionBarMenuSubItem6.setVisibility(0);
            if (isRtmpStream()) {
                actionBarMenuSubItem7.setVisibility(0);
                actionBarMenuSubItem8.setVisibility(8);
            } else if (this.call.isScheduled()) {
                actionBarMenuSubItem7.setVisibility(8);
                actionBarMenuSubItem8.setVisibility(8);
            } else {
                actionBarMenuSubItem7.setVisibility(0);
            }
            if (isConference()) {
                actionBarMenuSubItem7.setVisibility(8);
                actionBarMenuSubItem6.setVisibility(8);
            }
            if (!this.call.canRecordVideo() || this.call.isScheduled() || isRtmpStream()) {
                actionBarMenuSubItem8.setVisibility(8);
            } else {
                actionBarMenuSubItem8.setVisibility(0);
            }
            actionBarMenuItem2.setVisibility(8);
            boolean z = this.call.recording;
            RecordCallDrawable recordCallDrawable = this.recordCallDrawable;
            recordCallDrawable.recording = z;
            recordCallDrawable.alpha = 1.0f;
            recordCallDrawable.invalidateSelf();
            if (this.call.recording) {
                if (this.updateCallRecordRunnable == null) {
                    GroupCallActivity$$ExternalSyntheticLambda8 groupCallActivity$$ExternalSyntheticLambda8 = new GroupCallActivity$$ExternalSyntheticLambda8(this, 4);
                    this.updateCallRecordRunnable = groupCallActivity$$ExternalSyntheticLambda8;
                    AndroidUtilities.runOnUIThread(groupCallActivity$$ExternalSyntheticLambda8, 1000L);
                }
                actionBarMenuSubItem7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                GroupCallActivity$$ExternalSyntheticLambda8 groupCallActivity$$ExternalSyntheticLambda9 = this.updateCallRecordRunnable;
                if (groupCallActivity$$ExternalSyntheticLambda9 != null) {
                    AndroidUtilities.cancelRunOnUIThread(groupCallActivity$$ExternalSyntheticLambda9);
                    this.updateCallRecordRunnable = null;
                }
                actionBarMenuSubItem7.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getVideoState(true) != 2) {
                actionBarMenuSubItem8.setTextAndIcon(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
            } else {
                actionBarMenuSubItem8.setTextAndIcon(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
            }
            if (this.call != null) {
                int currentTime = accountInstance.getConnectionsManager().getCurrentTime();
                ChatObject.Call call5 = this.call;
                int i = currentTime - call5.call.record_start_date;
                if (call5.recording) {
                    actionBarMenuSubItem7.setSubtext(AndroidUtilities.formatDuration(i, false));
                } else {
                    actionBarMenuSubItem7.setSubtext(null);
                }
            }
        } else {
            boolean z2 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || canManageCall()) ? false : true;
            boolean z3 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2;
            if (z2 || (!(this.call.canRecordVideo() || z3) || this.call.isScheduled() || isRtmpStream())) {
                actionBarMenuItem2.setVisibility(8);
                actionBarMenuSubItem8.setVisibility(8);
            } else if (z3) {
                actionBarMenuItem2.setVisibility(8);
                actionBarMenuSubItem8.setVisibility(0);
                int i2 = R.string.VoipChatStopScreenCapture;
                actionBarMenuSubItem8.setTextAndIcon(LocaleController.getString(i2), R.drawable.msg_screencast_off, null);
                actionBarMenuSubItem8.setContentDescription(LocaleController.getString(i2));
            } else {
                int i3 = R.string.VoipChatStartScreenCapture;
                actionBarMenuSubItem8.setTextAndIcon(LocaleController.getString(i3), R.drawable.msg_screencast, null);
                actionBarMenuSubItem8.setContentDescription(LocaleController.getString(i3));
                actionBarMenuItem2.setVisibility(8);
                actionBarMenuSubItem8.setVisibility(0);
            }
            actionBarMenuSubItem5.setVisibility(8);
            actionBarMenuSubItem6.setVisibility(8);
            actionBarMenuSubItem7.setVisibility(8);
        }
        boolean zCanManageCall2 = canManageCall();
        ActionBarMenuSubItem actionBarMenuSubItem9 = this.permissionItem;
        if (zCanManageCall2 && this.call.call.can_change_join_muted && !isConference()) {
            actionBarMenuSubItem9.setVisibility(0);
        } else {
            actionBarMenuSubItem9.setVisibility(8);
        }
        if (isConference() && ((call = this.call) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            actionBarMenuItem.hideSubItem(4);
        } else {
            actionBarMenuItem.showSubItem$1(4);
        }
        this.soundItem.setVisibility((!isRtmpStream() || this.call.isScheduled()) ? 0 : 8);
        int visibility = actionBarMenuSubItem6.getVisibility();
        TextView textView = this.soundItemDivider;
        if (visibility == 0 || actionBarMenuSubItem9.getVisibility() == 0 || actionBarMenuSubItem.getVisibility() == 0 || actionBarMenuSubItem8.getVisibility() == 0 || actionBarMenuSubItem7.getVisibility() == 0 || actionBarMenuSubItem5.getVisibility() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        AccountSelectCell accountSelectCell = this.accountSelectCell;
        if (((sharedInstance == null || !VoIPService.getSharedInstance().hasFewPeers) && !this.scheduleHasFewPeers) || isRtmpStream() || this.selfPeer == null) {
            accountSelectCell.setVisibility(8);
        } else {
            accountSelectCell.setVisibility(0);
            long peerId = MessageObject.getPeerId(this.selfPeer);
            accountSelectCell.setObject(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)));
        }
        TLRPC.Chat chat4 = this.currentChat;
        if (chat4 == null || ChatObject.isChannelOrGiga(chat4) || !isRtmpStream() || actionBarMenuSubItem.getVisibility() != 8) {
            actionBarMenuItem.setVisibility(0);
        } else {
            actionBarMenuItem.setVisibility(8);
        }
        LinearLayout linearLayout = this.titleLayout;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.menuItemsContainer.getLayoutParams()).rightMargin = 0;
        this.actionBar.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    public final void updateMuteButton(int i, boolean z) {
        boolean z2;
        boolean customEndFrame;
        int i2;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        boolean customEndFrame2;
        String string6;
        boolean customEndFrame3;
        String string7;
        boolean customEndFrame4;
        String str;
        String str2;
        String strM;
        ImageView imageView;
        AnonymousClass18 anonymousClass18;
        int i3;
        WeavingState[] weavingStateArr;
        WeavingState weavingState;
        WeavingState weavingState2;
        WeavingState weavingState3;
        boolean z3;
        boolean z4;
        float f;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        AnonymousClass28 anonymousClass28 = this.renderersContainer;
        boolean z5 = anonymousClass28 != null && anonymousClass28.inFullscreenMode && (AndroidUtilities.isTablet() || isLandscapeMode == isRtmpLandscapeMode());
        if (!isRtmpStream() && this.muteButtonState == i && z) {
            return;
        }
        RLottieDrawable rLottieDrawable = this.bigMicDrawable;
        if (i != 7) {
            if (i == 6) {
                string7 = LocaleController.getString(R.string.VoipGroupSetReminderShort);
                customEndFrame4 = rLottieDrawable.setCustomEndFrame(344);
            } else {
                if (i == 5) {
                    string6 = LocaleController.getString(R.string.VoipGroupStartNowShort);
                    customEndFrame = rLottieDrawable.setCustomEndFrame(377);
                } else {
                    if (i == 0) {
                        string4 = LocaleController.getString(R.string.VoipGroupUnmuteShort);
                        string5 = LocaleController.getString(R.string.VoipHoldAndTalk);
                        int i9 = this.muteButtonState;
                        if (i9 == 3) {
                            int i10 = rLottieDrawable.customEndFrame;
                            if (i10 == 136 || i10 == 173 || i10 == 274 || i10 == 311) {
                                customEndFrame2 = rLottieDrawable.setCustomEndFrame(99);
                            } else {
                                string3 = string4;
                                string2 = string5;
                                z2 = false;
                                customEndFrame = false;
                            }
                            i2 = 3;
                        } else if (i9 == 5) {
                            customEndFrame2 = rLottieDrawable.setCustomEndFrame(404);
                        } else if (i9 == 7) {
                            customEndFrame2 = rLottieDrawable.setCustomEndFrame(376);
                        } else if (i9 == 6) {
                            customEndFrame2 = rLottieDrawable.setCustomEndFrame(237);
                        } else {
                            if (i9 == 2) {
                                customEndFrame = rLottieDrawable.setCustomEndFrame(36);
                                string3 = string4;
                                string2 = string5;
                                z2 = false;
                            } else {
                                customEndFrame2 = rLottieDrawable.setCustomEndFrame(99);
                            }
                            i2 = 3;
                        }
                    } else {
                        if (i == 1) {
                            string6 = LocaleController.getString(isConference() ? R.string.VoipTapToMuteConferenceShort : R.string.VoipTapToMuteShort);
                            customEndFrame3 = rLottieDrawable.setCustomEndFrame(this.muteButtonState == 4 ? 99 : 69);
                        } else if (isConference() && i == 2) {
                            string6 = LocaleController.getString(R.string.VoipMutedByAdminShort);
                            customEndFrame3 = rLottieDrawable.setCustomEndFrame(99);
                        } else if (i == 4) {
                            string4 = LocaleController.getString(R.string.VoipMutedTapedForSpeakShort);
                            string5 = LocaleController.getString(R.string.VoipMutedTapedForSpeakInfo);
                            customEndFrame2 = rLottieDrawable.setCustomEndFrame(136);
                        } else {
                            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
                            z2 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || canManageCall()) ? false : true;
                            if (z2) {
                                int i11 = this.muteButtonState;
                                if (i11 == 7) {
                                    customEndFrame = rLottieDrawable.setCustomEndFrame(311);
                                } else if (i11 == 6) {
                                    customEndFrame = rLottieDrawable.setCustomEndFrame(274);
                                } else {
                                    customEndFrame = i11 == 1 ? rLottieDrawable.setCustomEndFrame(173) : rLottieDrawable.setCustomEndFrame(136);
                                }
                            } else {
                                int i12 = this.muteButtonState;
                                if (i12 == 5) {
                                    customEndFrame = rLottieDrawable.setCustomEndFrame(404);
                                } else if (i12 == 7) {
                                    customEndFrame = rLottieDrawable.setCustomEndFrame(376);
                                } else if (i12 == 6) {
                                    customEndFrame = rLottieDrawable.setCustomEndFrame(237);
                                } else {
                                    if (i12 == 2 || i12 == 4) {
                                        customEndFrame = rLottieDrawable.setCustomEndFrame(36);
                                    } else {
                                        customEndFrame = rLottieDrawable.setCustomEndFrame(99);
                                    }
                                    i2 = 3;
                                    if (i == 3) {
                                        string = LocaleController.getString(R.string.Connecting);
                                        string2 = "";
                                    } else {
                                        string = LocaleController.getString(R.string.VoipMutedByAdminShort);
                                        string2 = LocaleController.getString(R.string.VoipMutedTapForSpeak);
                                    }
                                    string3 = string;
                                }
                            }
                            i2 = 3;
                            if (i == 3) {
                                string = LocaleController.getString(R.string.Connecting);
                                string2 = "";
                            } else {
                                string = LocaleController.getString(R.string.VoipMutedByAdminShort);
                                string2 = LocaleController.getString(R.string.VoipMutedTapForSpeak);
                            }
                            string3 = string;
                        }
                        customEndFrame = customEndFrame3;
                    }
                    customEndFrame = customEndFrame2;
                    string3 = string4;
                    string2 = string5;
                    z2 = false;
                    i2 = 3;
                }
                string2 = "";
                string3 = string6;
                z2 = false;
                i2 = 3;
            }
            if (isRtmpStream() || i == i2 || this.call.isScheduled()) {
                str = string2;
            } else {
                string3 = LocaleController.getString(z5 ? R.string.VoipGroupMinimizeStream : R.string.VoipGroupExpandStream);
                customEndFrame = this.animatingToFullscreenExpand != z5;
                this.animatingToFullscreenExpand = z5;
                str = "";
            }
            str2 = string3;
            if (TextUtils.isEmpty(str)) {
                strM = str2;
            } else {
                strM = zzit.m(str2, " ", str);
            }
            VoIPToggleButton voIPToggleButton = this.muteButton;
            voIPToggleButton.setContentDescription(strM);
            voIPToggleButton.setData(0, 0, 0, 1.0f, true, str2, false, z);
            imageView = this.expandOrMinimizeButton;
            anonymousClass18 = this.muteButtonIcon;
            if (z) {
                if (customEndFrame) {
                    if (i == 5) {
                        rLottieDrawable.setCurrentFrame(376, true, false);
                    } else if (i == 7) {
                        rLottieDrawable.setCurrentFrame(173, true, false);
                    } else if (i == 6) {
                        rLottieDrawable.setCurrentFrame(311, true, false);
                    } else if (i == 0) {
                        i8 = this.muteButtonState;
                        if (i8 == 5) {
                            rLottieDrawable.setCurrentFrame(376, true, false);
                        } else if (i8 == 7) {
                            rLottieDrawable.setCurrentFrame(344, true, false);
                        } else if (i8 == 6) {
                            rLottieDrawable.setCurrentFrame(202, true, false);
                        } else if (i8 == 2) {
                            rLottieDrawable.setCurrentFrame(0, true, false);
                        } else {
                            rLottieDrawable.setCurrentFrame(69, true, false);
                        }
                    } else if (i != 1 || (this.muteButtonState == 2 && isConference())) {
                        if (this.muteButtonState == 4) {
                            i7 = 69;
                        } else {
                            i7 = 36;
                        }
                        rLottieDrawable.setCurrentFrame(i7, true, false);
                    } else if (i == 4) {
                        rLottieDrawable.setCurrentFrame(99, true, false);
                    } else if (z2) {
                        int i13 = this.muteButtonState;
                        if (i13 == 7) {
                            rLottieDrawable.setCurrentFrame(274, true, false);
                        } else if (i13 == 6) {
                            rLottieDrawable.setCurrentFrame(237, true, false);
                        } else if (i13 == 1) {
                            rLottieDrawable.setCurrentFrame(136, true, false);
                        } else {
                            rLottieDrawable.setCurrentFrame(99, true, false);
                        }
                    } else {
                        int i14 = this.muteButtonState;
                        if (i14 == 5) {
                            rLottieDrawable.setCurrentFrame(376, true, false);
                        } else if (i14 == 7) {
                            rLottieDrawable.setCurrentFrame(344, true, false);
                        } else if (i14 == 6) {
                            rLottieDrawable.setCurrentFrame(202, true, false);
                        } else if (i14 == 2 || i14 == 4) {
                            rLottieDrawable.setCurrentFrame(0, true, false);
                        } else {
                            rLottieDrawable.setCurrentFrame(69, true, false);
                        }
                    }
                }
                anonymousClass18.playAnimation();
                if (isRtmpStream() || this.call.isScheduled()) {
                    imageView.setVisibility(8);
                    anonymousClass18.setVisibility(0);
                } else {
                    imageView.setImageResource((anonymousClass28 != null && anonymousClass28.inFullscreenMode && (AndroidUtilities.isTablet() || isLandscapeMode == isRtmpLandscapeMode())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                    imageView.setVisibility(0);
                    anonymousClass18.setVisibility(8);
                }
                this.muteButtonState = i;
            } else {
                this.muteButtonState = i;
                rLottieDrawable.setCurrentFrame(rLottieDrawable.customEndFrame - 1, false, true);
                if (isRtmpStream() || this.call.isScheduled()) {
                    imageView.setVisibility(8);
                    anonymousClass18.setVisibility(0);
                } else {
                    imageView.setImageResource((anonymousClass28 != null && anonymousClass28.inFullscreenMode && (AndroidUtilities.isTablet() || isLandscapeMode == isRtmpLandscapeMode())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                    imageView.setVisibility(0);
                    anonymousClass18.setVisibility(8);
                }
            }
            voIPToggleButton.invalidate();
            i3 = this.muteButtonState;
            weavingStateArr = this.states;
            if (weavingStateArr[i3] == null) {
                weavingStateArr[i3] = new WeavingState(i3);
                i5 = this.muteButtonState;
                if (i5 == 3) {
                    weavingStateArr[i5].shader = null;
                } else if (isGradientState(i5)) {
                    weavingStateArr[this.muteButtonState].shader = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient, false), Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient3, false), Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient2, false)}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    i6 = this.muteButtonState;
                    if (i6 == 1) {
                        weavingStateArr[i6].shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{Theme.getColor(null, Theme.key_voipgroup_muteButton, false), Theme.getColor(null, Theme.key_voipgroup_muteButton3, false)}, (float[]) null, Shader.TileMode.CLAMP);
                    } else {
                        weavingStateArr[i6].shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{Theme.getColor(null, Theme.key_voipgroup_unmuteButton2, false), Theme.getColor(null, Theme.key_voipgroup_unmuteButton, false)}, (float[]) null, Shader.TileMode.CLAMP);
                    }
                }
            }
            weavingState = weavingStateArr[this.muteButtonState];
            weavingState2 = this.currentState;
            if (weavingState != weavingState2) {
                this.prevState = weavingState2;
                this.currentState = weavingState;
                if (weavingState2 == null && z) {
                    this.switchProgress = 0.0f;
                } else {
                    this.switchProgress = 1.0f;
                    this.prevState = null;
                }
            }
            if (!z) {
                weavingState3 = this.currentState;
                if (weavingState3 != null) {
                    i4 = weavingState3.currentState;
                    z3 = true;
                    if (i4 != 1 || i4 == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (i4 == 3) {
                        z3 = false;
                    }
                } else {
                    z3 = false;
                    z4 = false;
                }
                if (z4) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                this.showWavesProgress = f;
                this.showLightingProgress = z3 ? 1.0f : 0.0f;
            }
            invalidate();
        }
        string7 = LocaleController.getString(R.string.VoipGroupCancelReminderShort);
        customEndFrame4 = rLottieDrawable.setCustomEndFrame(202);
        string2 = "";
        string3 = string7;
        customEndFrame = customEndFrame4;
        z2 = false;
        i2 = 3;
        if (isRtmpStream()) {
            str = string2;
        } else {
            str = string2;
        }
        str2 = string3;
        if (TextUtils.isEmpty(str)) {
            strM = zzit.m(str2, " ", str);
        } else {
            strM = str2;
        }
        VoIPToggleButton voIPToggleButton2 = this.muteButton;
        voIPToggleButton2.setContentDescription(strM);
        voIPToggleButton2.setData(0, 0, 0, 1.0f, true, str2, false, z);
        imageView = this.expandOrMinimizeButton;
        anonymousClass18 = this.muteButtonIcon;
        if (z) {
            if (customEndFrame) {
                if (i == 5) {
                    rLottieDrawable.setCurrentFrame(376, true, false);
                } else if (i == 7) {
                    rLottieDrawable.setCurrentFrame(173, true, false);
                } else if (i == 6) {
                    rLottieDrawable.setCurrentFrame(311, true, false);
                } else if (i == 0) {
                    i8 = this.muteButtonState;
                    if (i8 == 5) {
                        rLottieDrawable.setCurrentFrame(376, true, false);
                    } else if (i8 == 7) {
                        rLottieDrawable.setCurrentFrame(344, true, false);
                    } else if (i8 == 6) {
                        rLottieDrawable.setCurrentFrame(202, true, false);
                    } else if (i8 == 2) {
                        rLottieDrawable.setCurrentFrame(0, true, false);
                    } else {
                        rLottieDrawable.setCurrentFrame(69, true, false);
                    }
                } else if (i != 1) {
                    if (this.muteButtonState == 4) {
                        i7 = 69;
                    } else {
                        i7 = 36;
                    }
                    rLottieDrawable.setCurrentFrame(i7, true, false);
                } else {
                    if (this.muteButtonState == 4) {
                        i7 = 69;
                    } else {
                        i7 = 36;
                    }
                    rLottieDrawable.setCurrentFrame(i7, true, false);
                }
            }
            anonymousClass18.playAnimation();
            if (isRtmpStream()) {
                imageView.setVisibility(8);
                anonymousClass18.setVisibility(0);
            } else {
                imageView.setVisibility(8);
                anonymousClass18.setVisibility(0);
            }
            this.muteButtonState = i;
        } else {
            this.muteButtonState = i;
            rLottieDrawable.setCurrentFrame(rLottieDrawable.customEndFrame - 1, false, true);
            if (isRtmpStream()) {
                imageView.setVisibility(8);
                anonymousClass18.setVisibility(0);
            } else {
                imageView.setVisibility(8);
                anonymousClass18.setVisibility(0);
            }
        }
        voIPToggleButton2.invalidate();
        i3 = this.muteButtonState;
        weavingStateArr = this.states;
        if (weavingStateArr[i3] == null) {
            weavingStateArr[i3] = new WeavingState(i3);
            i5 = this.muteButtonState;
            if (i5 == 3) {
                weavingStateArr[i5].shader = null;
            } else if (isGradientState(i5)) {
                weavingStateArr[this.muteButtonState].shader = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient, false), Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient3, false), Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient2, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                i6 = this.muteButtonState;
                if (i6 == 1) {
                    weavingStateArr[i6].shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{Theme.getColor(null, Theme.key_voipgroup_muteButton, false), Theme.getColor(null, Theme.key_voipgroup_muteButton3, false)}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    weavingStateArr[i6].shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{Theme.getColor(null, Theme.key_voipgroup_unmuteButton2, false), Theme.getColor(null, Theme.key_voipgroup_unmuteButton, false)}, (float[]) null, Shader.TileMode.CLAMP);
                }
            }
        }
        weavingState = weavingStateArr[this.muteButtonState];
        weavingState2 = this.currentState;
        if (weavingState != weavingState2) {
            this.prevState = weavingState2;
            this.currentState = weavingState;
            if (weavingState2 == null) {
                this.switchProgress = 1.0f;
                this.prevState = null;
            } else {
                this.switchProgress = 1.0f;
                this.prevState = null;
            }
        }
        if (!z) {
            weavingState3 = this.currentState;
            if (weavingState3 != null) {
                i4 = weavingState3.currentState;
                z3 = true;
                if (i4 != 1) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (i4 == 3) {
                    z3 = false;
                }
            } else {
                z3 = false;
                z4 = false;
            }
            if (z4) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.showWavesProgress = f;
            this.showLightingProgress = z3 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void updateScheduleUI(boolean z) {
        float interpolation;
        float f;
        AnonymousClass44 anonymousClass44 = this.scheduleTimerContainer;
        if ((anonymousClass44 == null || this.call != null) && this.scheduleAnimator == null) {
            this.switchToButtonInt2 = 1.0f;
            this.switchToButtonProgress = 1.0f;
            if (anonymousClass44 == null) {
                return;
            }
        }
        if (!z) {
            AnonymousClass1 anonymousClass1 = this.updateSchedeulRunnable;
            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
            anonymousClass1.run();
            ChatObject.Call call = this.call;
            AnonymousClass9 anonymousClass9 = this.listView;
            if (call == null || call.isScheduled()) {
                anonymousClass9.setVisibility(4);
            } else {
                anonymousClass9.setVisibility(0);
            }
            boolean zIsChannelOrGiga = ChatObject.isChannelOrGiga(this.currentChat);
            ActionBarMenuSubItem actionBarMenuSubItem = this.leaveItem;
            if (zIsChannelOrGiga) {
                actionBarMenuSubItem.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                actionBarMenuSubItem.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f2 = this.switchToButtonProgress;
        if (f2 > 0.6f) {
            interpolation = 1.05f - (CubicBezierInterpolator.DEFAULT.getInterpolation((f2 - 0.6f) / 0.4f) * 0.05f);
            this.switchToButtonInt2 = 1.0f;
            f = 1.0f;
        } else {
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            this.switchToButtonInt2 = cubicBezierInterpolator.getInterpolation(f2 / 0.6f);
            interpolation = 1.05f * cubicBezierInterpolator.getInterpolation(this.switchToButtonProgress / 0.6f);
            f = this.switchToButtonProgress / 0.6f;
        }
        updateButtonsVisibility(true);
        float f3 = 1.0f - f;
        anonymousClass44.setAlpha(f3);
        this.scheduleStartInTextView.setAlpha(f);
        this.scheduleStartAtTextView.setAlpha(f);
        AnonymousClass8 anonymousClass8 = this.scheduleTimeTextView;
        anonymousClass8.setAlpha(f);
        anonymousClass8.setScaleX(interpolation);
        anonymousClass8.setScaleY(interpolation);
        AnonymousClass42 anonymousClass42 = this.scheduleButtonTextView;
        anonymousClass42.setScaleX(f3);
        anonymousClass42.setScaleY(f3);
        anonymousClass42.setAlpha(f3);
        this.scheduleInfoTextView.setAlpha(f3);
        this.otherItem.setAlpha(f);
        int i = f3 != 0.0f ? 0 : 4;
        if (i != anonymousClass44.getVisibility()) {
            anonymousClass44.setVisibility(i);
            anonymousClass42.setVisibility(i);
        }
    }

    public final void updateSpeakerPhoneIcon(boolean z) {
        VoIPToggleButton voIPToggleButton = this.soundButton;
        if (voIPToggleButton == null || voIPToggleButton.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        AnonymousClass17 anonymousClass17 = this.buttonsContainer;
        if (sharedInstance == null || isRtmpStream()) {
            voIPToggleButton.setData(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z);
            boolean z2 = ChatObject.isPublic(this.currentChat) || (ChatObject.hasAdminRights(this.currentChat) && ChatObject.canAddUsers(this.currentChat));
            GroupCallActivityButtonsLayout.ButtonHolder buttonHolder = (GroupCallActivityButtonsLayout.ButtonHolder) anonymousClass17.holders.get(voIPToggleButton);
            if (buttonHolder != null) {
                buttonHolder.enabled.setValue(z2, z);
                voIPToggleButton.setEnabled(z2);
            }
            voIPToggleButton.setChecked(true, false);
            return;
        }
        GroupCallActivityButtonsLayout.ButtonHolder buttonHolder2 = (GroupCallActivityButtonsLayout.ButtonHolder) anonymousClass17.holders.get(voIPToggleButton);
        if (buttonHolder2 != null) {
            buttonHolder2.enabled.setValue(true, z);
            voIPToggleButton.setEnabled(true);
        }
        boolean z3 = sharedInstance.isBluetoothOn() || sharedInstance.isBluetoothWillOn();
        boolean z4 = !z3 && sharedInstance.isSpeakerphoneOn();
        if (z3) {
            voIPToggleButton.setData(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z);
        } else if (z4) {
            voIPToggleButton.setData(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z);
        } else if (sharedInstance.isHeadsetPlugged()) {
            voIPToggleButton.setData(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z);
        } else {
            voIPToggleButton.setData(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z);
        }
        voIPToggleButton.setChecked(z4, z);
        getAudioOutputValue();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        int i = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
        if (this.speakerIcon != i) {
            this.speakerIcon = i;
            AndroidUtilities.updateImageViewImageAnimated(this.speakerImageView, i);
        }
        VoIPToggleButton voIPToggleButton2 = this.speakerButton;
        if (voIPToggleButton2.getVisibility() == 0) {
            voIPToggleButton2.setData(0, -1, 0, 1.0f, true, getAudioOutputName(getAudioOutputValue()), false, z);
            voIPToggleButton2.setChecked(getAudioOutputValue() != 1, z);
        }
    }

    public final void updateState(boolean z, boolean z2) {
        long j;
        boolean z3;
        TLRPC.GroupCallParticipant groupCallParticipant;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i;
        boolean z8;
        int i2;
        int i3;
        int i4;
        AnonymousClass28 anonymousClass28;
        int i5;
        int i6;
        int i7;
        boolean z9;
        boolean z10;
        VoIPToggleButton voIPToggleButton;
        VoIPToggleButton voIPToggleButton2;
        VoIPToggleButton voIPToggleButton3;
        boolean z11;
        VoIPToggleButton voIPToggleButton4;
        VoIPToggleButton voIPToggleButton5;
        int i8;
        boolean zIsRtmpStream;
        AnonymousClass22 anonymousClass22;
        boolean z12;
        int i9;
        final boolean z13;
        ValueAnimator valueAnimator;
        Paint paint;
        VoIPService sharedInstance;
        int i10;
        boolean z14;
        int i11;
        ChatObject.Call call = this.call;
        VoIPToggleButton voIPToggleButton6 = this.leaveButton;
        int i12 = 5;
        if (call == null || call.isScheduled()) {
            if (!canManageCall()) {
                i12 = this.call.call.schedule_start_subscribed ? 7 : 6;
            }
            updateMuteButton(i12, z);
            voIPToggleButton6.setData(R.drawable.calls_decline, -1, Theme.getColor(null, Theme.key_voipgroup_leaveButton, false), 0.3f, false, LocaleController.getString(R.string.Close), false, false);
            updateScheduleUI(false);
            return;
        }
        updateButtonsVisibility(z);
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (sharedInstance2 == null) {
            return;
        }
        if (!sharedInstance2.isConverting() && !sharedInstance2.isSwitchingStream()) {
            j = 0;
            if ((this.creatingServiceTime == 0 || Math.abs(SystemClock.elapsedRealtime() - this.creatingServiceTime) > 3000) && ((i11 = this.currentCallState) == 1 || i11 == 2 || i11 == 6 || i11 == 5)) {
                cancelMutePress();
                updateMuteButton(3, z);
            }
            if (VoIPService.getSharedInstance() == null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
            if (groupCallParticipant != null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || canManageCall()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!((z4 && this.call.canRecordVideo()) || z3) || isRtmpStream()) {
                z5 = false;
                z6 = true;
            } else {
                z5 = true;
                z6 = false;
            }
            if (z3) {
                z7 = false;
                i = 1;
            } else {
                z7 = !z4;
                i = 0;
            }
            if (isLandscapeMode) {
                z8 = false;
                i2 = 0;
            } else {
                z8 = z7;
                i2 = i;
            }
            if (z6) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            int i13 = i2 + i3;
            if (z5) {
                i4 = 4;
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            anonymousClass28 = this.renderersContainer;
            if (anonymousClass28 == null && anonymousClass28.inFullscreenMode) {
                i5 = 8;
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (z8) {
                i6 = 16;
            } else {
                i6 = 0;
            }
            i7 = i15 + i6;
            if ((this.buttonsVisibility | 2) != (i7 | 2)) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.buttonsVisibility = i7;
            z10 = z3;
            voIPToggleButton = this.cameraButton;
            if (z5) {
                voIPToggleButton.setData(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), !z10, z);
                voIPToggleButton.setChecked(true, false);
            }
            voIPToggleButton2 = this.flipButton;
            if (i2 != 0) {
                voIPToggleButton2.setData(0, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipFlip), false, false);
                voIPToggleButton2.setChecked(true, false);
            }
            voIPToggleButton3 = this.speakerButton;
            if (z8) {
                getAudioOutputValue();
                sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance == null && sharedInstance.isBluetoothHeadsetConnected()) {
                    i10 = R.drawable.filled_calls_bluetooth_s;
                } else {
                    i10 = R.drawable.filled_sound_on;
                }
                if (this.speakerIcon != i10) {
                    this.speakerIcon = i10;
                    AndroidUtilities.updateImageViewImageAnimated(this.speakerImageView, i10);
                }
                voIPToggleButton5 = voIPToggleButton;
                voIPToggleButton4 = voIPToggleButton2;
                z11 = z;
                voIPToggleButton3.setData(0, -1, 0, 1.0f, true, getAudioOutputName(getAudioOutputValue()), false, z11);
                if (getAudioOutputValue() != 1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                voIPToggleButton3.setChecked(z14, z11);
            } else {
                z11 = z;
                voIPToggleButton4 = voIPToggleButton2;
                voIPToggleButton5 = voIPToggleButton;
            }
            if (isRtmpStream()) {
                i8 = R.drawable.msg_voiceclose;
            } else {
                i8 = R.drawable.calls_decline;
            }
            voIPToggleButton6.setData(i8, -1, Theme.getColor(null, Theme.key_voipgroup_leaveButton, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
            if (z9 && z6) {
                updateSpeakerPhoneIcon(false);
            }
            voIPToggleButton5.showText(true, z11);
            voIPToggleButton4.showText(true, z11);
            voIPToggleButton3.showText(true, z11);
            zIsRtmpStream = isRtmpStream();
            anonymousClass22 = this.liveLabelTextView;
            if (zIsRtmpStream) {
                anonymousClass22.setVisibility(0);
                if (((Integer) anonymousClass22.getTag()).intValue() == 3) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i9 = this.currentCallState;
                if (i9 == 3) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                anonymousClass22.setTag(Integer.valueOf(i9));
                if (z12 != z13) {
                    valueAnimator = this.liveLabelBgColorAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    paint = this.liveLabelPaint;
                    if (z11) {
                        final int color = paint.getColor();
                        final int i16 = z13 ? -1163700 : -12761513;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.liveLabelBgColorAnimator = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                GroupCallActivity groupCallActivity = this.f$0;
                                groupCallActivity.getClass();
                                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                groupCallActivity.liveLabelPaint.setColor(AndroidUtilities.getOffsetColor(color, i16, fFloatValue, 1.0f));
                                groupCallActivity.liveLabelTextView.invalidate();
                                if (!z13) {
                                    fFloatValue = 1.0f - fFloatValue;
                                }
                                groupCallActivity.textureLightningViewAnimatingAlpha = fFloatValue;
                                GroupCallActivity.LightningView lightningView = groupCallActivity.textureLightningView;
                                if (lightningView == null || !groupCallActivity.needTextureLightning) {
                                    return;
                                }
                                lightningView.invalidate();
                            }
                        });
                        this.liveLabelBgColorAnimator.setDuration(300L);
                        this.liveLabelBgColorAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        this.liveLabelBgColorAnimator.addListener(new AnonymousClass54(this, 2));
                        this.liveLabelBgColorAnimator.start();
                    } else {
                        paint.setColor(this.currentCallState == 3 ? -1163700 : -12761513);
                        anonymousClass22.invalidate();
                    }
                }
            } else {
                anonymousClass22.setVisibility(8);
            }
            if (isRtmpStream() || !LiteMode.isEnabled(512)) {
            }
            if (this.currentCallState == 3) {
                this.needTextureLightning = true;
                runUpdateTextureLightningRunnable();
                return;
            } else {
                this.needTextureLightning = false;
                AndroidUtilities.cancelRunOnUIThread(this.updateTextureLightningRunnable);
                return;
            }
        }
        j = 0;
        if (this.userSwitchObject != null) {
            getUndoView().showWithAction(0L, 37, this.userSwitchObject, this.currentChat, (Runnable) null, (Runnable) null);
            this.userSwitchObject = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
        if (sharedInstance2.micSwitching || groupCallParticipant2 == null || groupCallParticipant2.can_self_unmute || !groupCallParticipant2.muted || canManageCall()) {
            boolean zIsMicMute = sharedInstance2.isMicMute();
            if (!sharedInstance2.micSwitching && z2 && groupCallParticipant2 != null && groupCallParticipant2.muted && !zIsMicMute) {
                cancelMutePress();
                sharedInstance2.setMicMute(true, false, false);
                zIsMicMute = true;
            }
            if (zIsMicMute) {
                updateMuteButton(0, z);
            } else {
                updateMuteButton(1, z);
            }
        } else {
            cancelMutePress();
            if (groupCallParticipant2.raise_hand_rating != j) {
                updateMuteButton(4, z);
            } else {
                updateMuteButton(2, z);
            }
            sharedInstance2.setMicMute(true, false, false);
        }
        if (VoIPService.getSharedInstance() == null) {
            z3 = false;
        } else {
            z3 = false;
        }
        groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
        if (groupCallParticipant != null) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (z4) {
        }
        z5 = false;
        z6 = true;
        if (z3) {
            z7 = false;
            i = 1;
        } else {
            z7 = !z4;
            i = 0;
        }
        if (isLandscapeMode) {
            z8 = false;
            i2 = 0;
        } else {
            z8 = z7;
            i2 = i;
        }
        if (z6) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        int i17 = i2 + i3;
        if (z5) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        int i18 = i17 + i4;
        anonymousClass28 = this.renderersContainer;
        if (anonymousClass28 == null) {
            i5 = 0;
        } else {
            i5 = 0;
        }
        int i19 = i18 + i5;
        if (z8) {
            i6 = 16;
        } else {
            i6 = 0;
        }
        i7 = i19 + i6;
        if ((this.buttonsVisibility | 2) != (i7 | 2)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.buttonsVisibility = i7;
        z10 = z3;
        voIPToggleButton = this.cameraButton;
        if (z5) {
            voIPToggleButton.setData(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), !z10, z);
            voIPToggleButton.setChecked(true, false);
        }
        voIPToggleButton2 = this.flipButton;
        if (i2 != 0) {
            voIPToggleButton2.setData(0, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipFlip), false, false);
            voIPToggleButton2.setChecked(true, false);
        }
        voIPToggleButton3 = this.speakerButton;
        if (z8) {
            getAudioOutputValue();
            sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance == null) {
                i10 = R.drawable.filled_sound_on;
            } else {
                i10 = R.drawable.filled_sound_on;
            }
            if (this.speakerIcon != i10) {
                this.speakerIcon = i10;
                AndroidUtilities.updateImageViewImageAnimated(this.speakerImageView, i10);
            }
            voIPToggleButton5 = voIPToggleButton;
            voIPToggleButton4 = voIPToggleButton2;
            z11 = z;
            voIPToggleButton3.setData(0, -1, 0, 1.0f, true, getAudioOutputName(getAudioOutputValue()), false, z11);
            if (getAudioOutputValue() != 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            voIPToggleButton3.setChecked(z14, z11);
        } else {
            z11 = z;
            voIPToggleButton4 = voIPToggleButton2;
            voIPToggleButton5 = voIPToggleButton;
        }
        if (isRtmpStream()) {
            i8 = R.drawable.msg_voiceclose;
        } else {
            i8 = R.drawable.calls_decline;
        }
        voIPToggleButton6.setData(i8, -1, Theme.getColor(null, Theme.key_voipgroup_leaveButton, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        if (z9) {
            updateSpeakerPhoneIcon(false);
        }
        voIPToggleButton5.showText(true, z11);
        voIPToggleButton4.showText(true, z11);
        voIPToggleButton3.showText(true, z11);
        zIsRtmpStream = isRtmpStream();
        anonymousClass22 = this.liveLabelTextView;
        if (zIsRtmpStream) {
            anonymousClass22.setVisibility(0);
            if (((Integer) anonymousClass22.getTag()).intValue() == 3) {
                z12 = true;
            } else {
                z12 = false;
            }
            i9 = this.currentCallState;
            if (i9 == 3) {
                z13 = true;
            } else {
                z13 = false;
            }
            anonymousClass22.setTag(Integer.valueOf(i9));
            if (z12 != z13) {
                valueAnimator = this.liveLabelBgColorAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                paint = this.liveLabelPaint;
                if (z11) {
                    final int color2 = paint.getColor();
                    if (z13) {
                    }
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.liveLabelBgColorAnimator = valueAnimatorOfFloat2;
                    valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            GroupCallActivity groupCallActivity = this.f$0;
                            groupCallActivity.getClass();
                            float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            groupCallActivity.liveLabelPaint.setColor(AndroidUtilities.getOffsetColor(color2, i16, fFloatValue, 1.0f));
                            groupCallActivity.liveLabelTextView.invalidate();
                            if (!z13) {
                                fFloatValue = 1.0f - fFloatValue;
                            }
                            groupCallActivity.textureLightningViewAnimatingAlpha = fFloatValue;
                            GroupCallActivity.LightningView lightningView = groupCallActivity.textureLightningView;
                            if (lightningView == null || !groupCallActivity.needTextureLightning) {
                                return;
                            }
                            lightningView.invalidate();
                        }
                    });
                    this.liveLabelBgColorAnimator.setDuration(300L);
                    this.liveLabelBgColorAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    this.liveLabelBgColorAnimator.addListener(new AnonymousClass54(this, 2));
                    this.liveLabelBgColorAnimator.start();
                } else {
                    paint.setColor(this.currentCallState == 3 ? -1163700 : -12761513);
                    anonymousClass22.invalidate();
                }
            }
        } else {
            anonymousClass22.setVisibility(8);
        }
        if (isRtmpStream()) {
        }
    }

    public final void updateSubtitle$1() {
        boolean z;
        WatchersView watchersView;
        AnonymousClass5 anonymousClass5 = this.actionBar;
        if (anonymousClass5 == null || this.call == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i = 0;
        for (int i2 = 0; i2 < this.call.currentSpeakingPeers.size(); i2++) {
            long jKeyAt = this.call.currentSpeakingPeers.keyAt(i2);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.currentSpeakingPeers.get(jKeyAt);
            if (!groupCallParticipant.self) {
                AnonymousClass28 anonymousClass28 = this.renderersContainer;
                anonymousClass28.getClass();
                if (anonymousClass28.attachedPeerIds.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.visiblePeerIds.get(jKeyAt, 0) != 1) {
                    long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    if (i >= 2) {
                        i++;
                        if (i == 2) {
                            break;
                        }
                    } else {
                        TLRPC.User user = peerId > 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)) : null;
                        TLRPC.Chat chat = peerId <= 0 ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(peerId)) : null;
                        if (user != null || chat != null) {
                            if (i != 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            if (user != null) {
                                spannableStringBuilder.append(UserObject.getFirstName(user), new TypefaceSpan(AndroidUtilities.bold()), 0);
                            } else {
                                spannableStringBuilder.append(chat.title, new TypefaceSpan(AndroidUtilities.bold()), 0);
                            }
                            i++;
                            if (i == 2) {
                                break;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (i > 0) {
            String pluralString = LocaleController.getPluralString("MembersAreSpeakingToast", i);
            int iIndexOf = pluralString.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
            spannableStringBuilder2.replace(iIndexOf, iIndexOf + 3, (CharSequence) spannableStringBuilder);
            anonymousClass5.getAdditionalSubtitleTextView().setText(spannableStringBuilder2);
            z = true;
        } else {
            z = false;
        }
        SimpleTextView subtitleTextView = anonymousClass5.getSubtitleTextView();
        String str = isRtmpStream() ? "ViewersWatching" : "Participants";
        int i3 = this.call.call.participants_count;
        ListAdapter listAdapter = this.listAdapter;
        subtitleTextView.setText(LocaleController.formatPluralString(str, i3 + ((GroupCallActivity.this.isRtmpStream() || listAdapter.hasSelfUser || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined() ? 1 : 0), new Object[0]));
        if (isRtmpStream() && (watchersView = this.watchersView) != null) {
            watchersView.setWatchersCount(this.call.call.participants_count);
        }
        if (z != this.drawSpeakingSubtitle) {
            this.drawSpeakingSubtitle = z;
            anonymousClass5.invalidate();
            anonymousClass5.getSubtitleTextView().setPivotX(0.0f);
            anonymousClass5.getSubtitleTextView().setPivotY(anonymousClass5.getMeasuredHeight() >> 1);
            anonymousClass5.getSubtitleTextView().animate().scaleX(this.drawSpeakingSubtitle ? 0.98f : 1.0f).scaleY(this.drawSpeakingSubtitle ? 0.9f : 1.0f).alpha(this.drawSpeakingSubtitle ? 0.0f : 1.0f).setDuration(150L);
            AndroidUtilities.updateViewVisibilityAnimated(anonymousClass5.getAdditionalSubtitleTextView(), this.drawSpeakingSubtitle);
        }
    }

    public final void updateTitle$2(boolean z) {
        ChatObject.Call call = this.call;
        AnonymousClass20 anonymousClass20 = this.titleTextView;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.currentChat)) {
                anonymousClass20.setText(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z);
                return;
            } else {
                anonymousClass20.setText(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z);
                return;
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(call.call.title);
        AnonymousClass5 anonymousClass5 = this.actionBar;
        if (zIsEmpty) {
            TLRPC.Chat chat = this.currentChat;
            if (chat != null && !chat.title.equals(anonymousClass5.getTitle())) {
                if (z) {
                    this.actionBar.setTitleAnimated(this.currentChat.title, true, 180L, null);
                    anonymousClass5.getTitleTextView().setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda9(this, 11));
                } else {
                    anonymousClass5.setTitle(this.currentChat.title);
                }
                if (!ChatObject.isChannelOrGiga(this.currentChat)) {
                    anonymousClass20.setText(LocaleController.getString(R.string.VoipGroupVoiceChat), z);
                } else if (isRtmpStream()) {
                    anonymousClass20.setText(this.currentChat.title, z);
                } else {
                    anonymousClass20.setText(LocaleController.getString(R.string.VoipChannelVoiceChat), z);
                }
            } else if (this.currentChat == null) {
                int i = R.string.ConferenceChat;
                anonymousClass5.setTitle(LocaleController.getString(i));
                anonymousClass20.setText(LocaleController.getString(i), z);
            }
        } else if (!this.call.call.title.equals(anonymousClass5.getTitle())) {
            if (z) {
                this.actionBar.setTitleAnimated(this.call.call.title, true, 180L, null);
                anonymousClass5.getTitleTextView().setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda9(this, 10));
            } else {
                anonymousClass5.setTitle(this.call.call.title);
            }
            anonymousClass20.setText(this.call.call.title, z);
        }
        SimpleTextView titleTextView = anonymousClass5.getTitleTextView();
        if (!this.call.recording) {
            if (titleTextView.getRightDrawable() != null) {
                titleTextView.setRightDrawable((Drawable) null);
                anonymousClass20.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                anonymousClass20.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() == null) {
            titleTextView.setRightDrawable(new SmallRecordCallDrawable(titleTextView));
            TextView textView = anonymousClass20.getTextView();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new SmallRecordCallDrawable(textView), (Drawable) null);
            TextView nextTextView = anonymousClass20.getNextTextView();
            nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new SmallRecordCallDrawable(nextTextView), (Drawable) null);
        }
    }

    public final void updateTopBulletinY() {
        float fMin;
        Bulletin.Layout layout;
        if (this.topBulletinContainer == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(74.0f);
        float currentActionBarHeight = this.scrollOffsetY - iDp;
        if (this.backgroundPaddingTop + currentActionBarHeight < ActionBar.getCurrentActionBarHeight()) {
            int iDp2 = (iDp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
            fMin = Math.min(1.0f, ((ActionBar.getCurrentActionBarHeight() - currentActionBarHeight) - this.backgroundPaddingTop) / iDp2);
            currentActionBarHeight -= (int) ((ActionBar.getCurrentActionBarHeight() - iDp2) * fMin);
        } else {
            fMin = 0.0f;
        }
        float paddingTop = currentActionBarHeight + this.containerView.getPaddingTop();
        FrameLayout frameLayout = this.topBulletinContainer;
        float height = ((-frameLayout.getTop()) - this.topBulletinContainer.getHeight()) + paddingTop + AndroidUtilities.dp(10.0f);
        float f = -this.topBulletinContainer.getTop();
        AnonymousClass5 anonymousClass5 = this.actionBar;
        frameLayout.setTranslationY(AndroidUtilities.lerp(height, anonymousClass5.getY() + f + anonymousClass5.getHeight(), fMin));
        Bulletin bulletin = Bulletin.visibleBulletin;
        if (bulletin == null || (layout = bulletin.layout) == null || layout.getParent() == null || layout.getParent().getParent() != this.topBulletinContainer) {
            return;
        }
        layout.setTop(fMin > 0.5f);
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public int addMemberRow;
        public int conferenceAddPeopleRow;
        public int conferenceShareLinkRow;
        public int encryptionRow;
        public boolean hasSelfUser;
        public int invitedEndRow;
        public int invitedStartRow;
        public int lastRow;
        public final LaunchActivity mContext;
        public int rowsCount;
        public int shadyJoinEndRow;
        public int shadyJoinStartRow;
        public int shadyLeftEndRow;
        public int shadyLeftStartRow;
        public int usersEndRow;
        public int usersStartRow;
        public int usersVideoGridEndRow;
        public int usersVideoGridStartRow;
        public int videoGridDividerRow;
        public int videoNotAvailableRow;

        public final class AnonymousClass1 extends GroupCallTextCell {
            @Override
            public final void onMeasure(int i, int i2) {
                if (AndroidUtilities.isTablet()) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i)), 1073741824), i2);
                } else {
                    super.onMeasure(i, i2);
                }
            }
        }

        public final class AnonymousClass3 extends GroupCallInvitedCell {
            @Override
            public final void onMeasure(int i, int i2) {
                if (AndroidUtilities.isTablet()) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i)), 1073741824), i2);
                } else {
                    super.onMeasure(i, i2);
                }
            }
        }

        public ListAdapter(LaunchActivity launchActivity) {
            this.mContext = launchActivity;
        }

        @Override
        public final int getItemCount() {
            return this.rowsCount;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i == this.lastRow) {
                return 3;
            }
            if (i == this.addMemberRow || i == this.conferenceAddPeopleRow || i == this.conferenceShareLinkRow) {
                return 0;
            }
            if (i == this.videoGridDividerRow) {
                return 5;
            }
            if (i >= this.usersStartRow && i < this.usersEndRow) {
                return 1;
            }
            if (i >= this.usersVideoGridStartRow && i < this.usersVideoGridEndRow) {
                return 4;
            }
            if (i == this.videoNotAvailableRow) {
                return 6;
            }
            return i == this.encryptionRow ? 7 : 2;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return (i == 3 || i == 4 || i == 5 || i == 6) ? false : true;
        }

        @Override
        public final void notifyDataSetChanged() {
            updateRows$31();
            this.mObservable.notifyChanged();
        }

        @Override
        public final void notifyItemChanged(int i) {
            updateRows$31();
            super.notifyItemChanged(i);
        }

        @Override
        public final void notifyItemMoved(int i, int i2) {
            updateRows$31();
            this.mObservable.notifyItemMoved(i, i2);
        }

        @Override
        public final void notifyItemRangeChanged(int i, int i2) {
            updateRows$31();
            this.mObservable.notifyItemRangeChanged(i, i2, null);
        }

        @Override
        public final void notifyItemRangeInserted(int i, int i2) {
            updateRows$31();
            this.mObservable.notifyItemRangeInserted(i, i2);
        }

        @Override
        public final void notifyItemRangeRemoved(int i, int i2) {
            updateRows$31();
            this.mObservable.notifyItemRangeRemoved(i, i2);
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.Chat chat;
            TLRPC.GroupCallParticipant groupCallParticipant;
            TLRPC.GroupCallParticipant groupCallParticipant2;
            AvatarUpdaterDelegate avatarUpdaterDelegate;
            ChatObject.Call.InvitedUser invitedUser;
            boolean z;
            boolean z2;
            TLRPC.User user;
            AvatarDrawable avatarDrawable;
            int i2;
            float f;
            float f2;
            float f3;
            ChatObject.VideoParticipant videoParticipant;
            AvatarUpdaterDelegate avatarUpdaterDelegate2;
            int i3 = viewHolder.mItemViewType;
            float f4 = 0.0f;
            TLRPC.FileLocation fileLocation = null;
            fileLocation = null;
            TLRPC.FileLocation fileLocation2 = null;
            l = null;
            l = null;
            l = null;
            Long l = null;
            fileLocation = null;
            boolean z3 = true;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            View view = viewHolder.itemView;
            if (i3 == 0) {
                GroupCallTextCell groupCallTextCell = (GroupCallTextCell) view;
                if (i == this.conferenceAddPeopleRow) {
                    int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, ((BottomSheet) groupCallActivity).resourcesProvider);
                    groupCallTextCell.setColors(color, color);
                    groupCallTextCell.setTextAndIcon(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipConferenceAddPeople), true);
                    return;
                } else {
                    if (i == this.conferenceShareLinkRow) {
                        int color2 = Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, ((BottomSheet) groupCallActivity).resourcesProvider);
                        groupCallTextCell.setColors(color2, color2);
                        groupCallTextCell.setTextAndIcon(R.drawable.msg_link2, LocaleController.getString(R.string.VoipConferenceShareLink), false);
                        return;
                    }
                    int offsetColor = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_lastSeenTextUnscrolled, false), Theme.getColor(null, Theme.key_voipgroup_lastSeenText, false), groupCallActivity.actionBar.getTag() != null ? 1.0f : 0.0f, 1.0f);
                    groupCallTextCell.setColors(offsetColor, offsetColor);
                    if (!ChatObject.isChannel(groupCallActivity.currentChat) || (chat = groupCallActivity.currentChat) == null || chat.megagroup || !ChatObject.isPublic(chat)) {
                        groupCallTextCell.setTextAndIcon(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipGroupInviteMember), false);
                        return;
                    } else {
                        groupCallTextCell.setTextAndIcon(R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareLink), false);
                        return;
                    }
                }
            }
            if (i3 == 1) {
                GroupCallUserCell groupCallUserCell = (GroupCallUserCell) view;
                int i4 = i - this.usersStartRow;
                if (groupCallActivity.delayedGroupCallUpdated) {
                    if (i4 >= 0) {
                        ArrayList arrayList = groupCallActivity.oldParticipants;
                        if (i4 < arrayList.size()) {
                            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i4);
                            groupCallParticipant2 = groupCallParticipant;
                        }
                    }
                    groupCallParticipant2 = null;
                } else if (i4 < 0 || i4 >= groupCallActivity.call.visibleParticipants.size()) {
                    groupCallParticipant2 = null;
                } else {
                    groupCallParticipant = groupCallActivity.call.visibleParticipants.get(i4);
                    groupCallParticipant2 = groupCallParticipant;
                }
                if (groupCallParticipant2 != null) {
                    long peerId = MessageObject.getPeerId(groupCallParticipant2.peer);
                    long peerId2 = MessageObject.getPeerId(groupCallActivity.selfPeer);
                    if (peerId == peerId2 && (avatarUpdaterDelegate = groupCallActivity.avatarUpdaterDelegate) != null) {
                        fileLocation = avatarUpdaterDelegate.avatar;
                    }
                    TLRPC.FileLocation fileLocation3 = fileLocation;
                    float f5 = fileLocation3 != null ? groupCallActivity.avatarUpdaterDelegate.uploadingProgress : 1.0f;
                    boolean z4 = groupCallUserCell.getParticipant() != null && MessageObject.getPeerId(groupCallUserCell.getParticipant().peer) == peerId;
                    groupCallUserCell.setData(groupCallActivity.accountInstance, groupCallParticipant2, groupCallActivity.call, peerId2, fileLocation3, z4);
                    boolean z5 = z4;
                    ProfileActivity.AnonymousClass22 anonymousClass22 = groupCallUserCell.avatarProgressView;
                    anonymousClass22.setProgress(f5);
                    if (f5 < 1.0f) {
                        AndroidUtilities.updateViewVisibilityAnimated(anonymousClass22, true, 1.0f, z5);
                        return;
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(anonymousClass22, false, 1.0f, z5);
                        return;
                    }
                }
                return;
            }
            if (i3 != 2) {
                if (i3 != 4) {
                    return;
                }
                GroupCallGridCell groupCallGridCell = (GroupCallGridCell) view;
                ChatObject.VideoParticipant participant = groupCallGridCell.getParticipant();
                int i5 = i - this.usersVideoGridStartRow;
                groupCallGridCell.spanCount = groupCallActivity.spanSizeLookup.getSpanSize(i);
                if (groupCallActivity.delayedGroupCallUpdated) {
                    if (i5 >= 0) {
                        ArrayList arrayList2 = groupCallActivity.oldVideoParticipants;
                        if (i5 < arrayList2.size()) {
                            videoParticipant = (ChatObject.VideoParticipant) arrayList2.get(i5);
                        } else {
                            videoParticipant = null;
                        }
                    } else {
                        videoParticipant = null;
                    }
                } else if (i5 >= 0) {
                    ArrayList arrayList3 = groupCallActivity.visibleVideoParticipants;
                    if (i5 < arrayList3.size()) {
                        videoParticipant = (ChatObject.VideoParticipant) arrayList3.get(i5);
                    } else {
                        videoParticipant = null;
                    }
                } else {
                    videoParticipant = null;
                }
                if (videoParticipant != null) {
                    if (MessageObject.getPeerId(videoParticipant.participant.peer) == MessageObject.getPeerId(groupCallActivity.selfPeer) && (avatarUpdaterDelegate2 = groupCallActivity.avatarUpdaterDelegate) != null) {
                        fileLocation2 = avatarUpdaterDelegate2.avatar;
                    }
                    if (fileLocation2 != null) {
                        float f6 = groupCallActivity.avatarUpdaterDelegate.uploadingProgress;
                    }
                    if (groupCallGridCell.getParticipant() != null) {
                        groupCallGridCell.getParticipant().equals(videoParticipant);
                    }
                    groupCallGridCell.participant = videoParticipant;
                }
                if (participant == null || participant.equals(videoParticipant) || !groupCallGridCell.attached || groupCallGridCell.getRenderer() == null) {
                    return;
                }
                GroupCallActivity.access$12900(groupCallActivity, groupCallGridCell, false);
                GroupCallActivity.access$12900(groupCallActivity, groupCallGridCell, true);
                return;
            }
            GroupCallInvitedCell groupCallInvitedCell = (GroupCallInvitedCell) view;
            int i6 = i - this.invitedStartRow;
            int i7 = i - this.shadyJoinStartRow;
            if (i7 < 0 || i7 >= groupCallActivity.call.shadyJoinParticipants.size()) {
                int i8 = i - this.shadyLeftStartRow;
                if (i8 < 0 || i8 >= groupCallActivity.call.shadyLeftParticipants.size()) {
                    if (groupCallActivity.delayedGroupCallUpdated) {
                        if (i6 >= 0) {
                            ArrayList arrayList4 = groupCallActivity.oldInvited;
                            if (i6 < arrayList4.size()) {
                                l = (Long) arrayList4.get(i6);
                            }
                        }
                    } else if (i6 >= 0 && i6 < groupCallActivity.call.invitedUsers.size() && (invitedUser = groupCallActivity.call.invitedUsersMessageIds.get((l = groupCallActivity.call.invitedUsers.get(i6)))) != null && invitedUser.isCalling()) {
                        z = false;
                        z2 = false;
                    }
                    z = false;
                } else {
                    l = groupCallActivity.call.shadyLeftParticipants.get(i - this.shadyLeftStartRow);
                    z = false;
                    z2 = true;
                    z3 = false;
                }
                if (l != null) {
                    int i9 = ((BottomSheet) groupCallActivity).currentAccount;
                    groupCallInvitedCell.getClass();
                    user = MessagesController.getInstance(i9).getUser(l);
                    groupCallInvitedCell.currentUser = user;
                    avatarDrawable = groupCallInvitedCell.avatarDrawable;
                    if (user == null) {
                        avatarDrawable.setAvatarType(21);
                    } else {
                        avatarDrawable.setInfo(UserConfig.selectedAccount, user);
                    }
                    SimpleTextView simpleTextView = groupCallInvitedCell.nameTextView;
                    simpleTextView.setText(UserObject.getUserName(groupCallInvitedCell.currentUser), false);
                    BackupImageView backupImageView = groupCallInvitedCell.avatarImageView;
                    backupImageView.getImageReceiver().setCurrentAccount(i9);
                    backupImageView.imageReceiver.setForUserOrChat(groupCallInvitedCell.currentUser, avatarDrawable);
                    backupImageView.onNewImageSet();
                    SimpleTextView simpleTextView2 = groupCallInvitedCell.statusTextView;
                    if (z2) {
                        i2 = R.string.ShadyLeaving;
                    } else if (z) {
                        i2 = R.string.ShadyJoining;
                    } else if (z3) {
                        i2 = R.string.ConferenceCalling;
                    } else {
                        i2 = R.string.Invited;
                    }
                    simpleTextView2.setText(LocaleController.getString(i2), false);
                    f = 0.5f;
                    if (!z || z2) {
                        f2 = 0.5f;
                    } else {
                        f2 = 1.0f;
                    }
                    backupImageView.setAlpha(f2);
                    if (!z || z2) {
                        f3 = 0.5f;
                    } else {
                        f3 = 1.0f;
                    }
                    simpleTextView.setAlpha(f3);
                    if (!z && !z2) {
                        f = 1.0f;
                    }
                    simpleTextView2.setAlpha(f);
                    ImageView imageView = groupCallInvitedCell.muteButton;
                    if (!z && !z2) {
                        f4 = 1.0f;
                    }
                    imageView.setAlpha(f4);
                }
            }
            l = groupCallActivity.call.shadyJoinParticipants.get(i - this.shadyJoinStartRow);
            z = true;
            z2 = false;
            z3 = false;
            if (l != null) {
                int i10 = ((BottomSheet) groupCallActivity).currentAccount;
                groupCallInvitedCell.getClass();
                user = MessagesController.getInstance(i10).getUser(l);
                groupCallInvitedCell.currentUser = user;
                avatarDrawable = groupCallInvitedCell.avatarDrawable;
                if (user == null) {
                    avatarDrawable.setAvatarType(21);
                } else {
                    avatarDrawable.setInfo(UserConfig.selectedAccount, user);
                }
                SimpleTextView simpleTextView3 = groupCallInvitedCell.nameTextView;
                simpleTextView3.setText(UserObject.getUserName(groupCallInvitedCell.currentUser), false);
                BackupImageView backupImageView2 = groupCallInvitedCell.avatarImageView;
                backupImageView2.getImageReceiver().setCurrentAccount(i10);
                backupImageView2.imageReceiver.setForUserOrChat(groupCallInvitedCell.currentUser, avatarDrawable);
                backupImageView2.onNewImageSet();
                SimpleTextView simpleTextView4 = groupCallInvitedCell.statusTextView;
                if (z2) {
                    i2 = R.string.ShadyLeaving;
                } else if (z) {
                    i2 = R.string.ShadyJoining;
                } else if (z3) {
                    i2 = R.string.ConferenceCalling;
                } else {
                    i2 = R.string.Invited;
                }
                simpleTextView4.setText(LocaleController.getString(i2), false);
                f = 0.5f;
                if (z) {
                    f2 = 0.5f;
                } else {
                    f2 = 0.5f;
                }
                backupImageView2.setAlpha(f2);
                if (z) {
                    f3 = 0.5f;
                } else {
                    f3 = 0.5f;
                }
                simpleTextView3.setAlpha(f3);
                if (!z) {
                    f = 1.0f;
                }
                simpleTextView4.setAlpha(f);
                ImageView imageView2 = groupCallInvitedCell.muteButton;
                if (!z) {
                    f4 = 1.0f;
                }
                imageView2.setAlpha(f4);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View anonymousClass1;
            LaunchActivity launchActivity = this.mContext;
            if (i == 0) {
                anonymousClass1 = new AnonymousClass1(launchActivity);
            } else if (i == 1) {
                anonymousClass1 = new GroupCallUserCell(launchActivity) {
                    @Override
                    public final void onMeasure(int i2, int i3) {
                        if (AndroidUtilities.isTablet()) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i2)), 1073741824), i3);
                        } else {
                            super.onMeasure(i2, i3);
                        }
                    }

                    @Override
                    public final void onMuteClick(GroupCallUserCell groupCallUserCell) {
                        GroupCallActivity groupCallActivity = GroupCallActivity.this;
                        GroupCallActivity groupCallActivity2 = GroupCallActivity.groupCallInstance;
                        groupCallActivity.showMenuForCell(groupCallUserCell);
                    }
                };
            } else if (i == 2) {
                anonymousClass1 = new AnonymousClass3(launchActivity);
            } else if (i == 4) {
                anonymousClass1 = new GroupCallGridCell(launchActivity) {
                    @Override
                    public final void onAttachedToWindow() {
                        super.onAttachedToWindow();
                        ListAdapter listAdapter = ListAdapter.this;
                        if (GroupCallActivity.this.listView.getVisibility() == 0) {
                            GroupCallActivity groupCallActivity = GroupCallActivity.this;
                            if (groupCallActivity.listViewVideoVisibility) {
                                GroupCallActivity.access$12900(groupCallActivity, this, true);
                            }
                        }
                    }

                    @Override
                    public final void onDetachedFromWindow() {
                        super.onDetachedFromWindow();
                        GroupCallActivity.access$12900(GroupCallActivity.this, this, false);
                    }
                };
            } else if (i != 5) {
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                if (i == 6) {
                    TextView textView = new TextView(launchActivity);
                    textView.setTextColor(-8682615);
                    textView.setTextSize(1, 13.0f);
                    textView.setGravity(1);
                    textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
                    boolean zIsChannelOrGiga = ChatObject.isChannelOrGiga(groupCallActivity.currentChat);
                    AccountInstance accountInstance = groupCallActivity.accountInstance;
                    if (zIsChannelOrGiga) {
                        textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                    } else {
                        textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                    }
                    anonymousClass1 = textView;
                } else if (i != 7) {
                    anonymousClass1 = new View(launchActivity);
                } else {
                    if (groupCallActivity.encryptionDrawable == null) {
                        groupCallActivity.encryptionDrawable = new CallEncryptionCellDrawable();
                    }
                    anonymousClass1 = new QrActivity.AnonymousClass2(launchActivity, groupCallActivity.encryptionDrawable);
                }
            } else {
                anonymousClass1 = new PaymentFormActivity.AnonymousClass2(launchActivity, 16);
            }
            return zzkl.m(anonymousClass1, anonymousClass1);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            View view = viewHolder.itemView;
            if (i == 1) {
                GroupCallUserCell groupCallUserCell = (GroupCallUserCell) view;
                int i2 = groupCallActivity.actionBar.getTag() != null ? Theme.key_voipgroup_mutedIcon : Theme.key_voipgroup_mutedIconUnscrolled;
                groupCallUserCell.setGrayIconColor(i2, Theme.getColor(null, i2, false));
                groupCallUserCell.setDrawDivider(viewHolder.getAdapterPosition() != this.rowsCount - 2);
                return;
            }
            if (i == 2) {
                GroupCallInvitedCell groupCallInvitedCell = (GroupCallInvitedCell) view;
                int i3 = groupCallActivity.actionBar.getTag() != null ? Theme.key_voipgroup_mutedIcon : Theme.key_voipgroup_mutedIconUnscrolled;
                int color = Theme.getColor(null, i3, false);
                groupCallInvitedCell.grayIconColor = i3;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY);
                ImageView imageView = groupCallInvitedCell.muteButton;
                imageView.setColorFilter(porterDuffColorFilter);
                groupCallInvitedCell.statusTextView.setTextColor(color);
                Theme.setSelectorDrawableColor(imageView.getDrawable(), color & 620756991, true);
                groupCallInvitedCell.setDrawDivider(viewHolder.getAdapterPosition() != this.rowsCount - 2);
            }
        }

        public final void updateRows$31() {
            TLRPC.Chat chat;
            TLRPC.Chat chat2;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            ChatObject.Call call = groupCallActivity.call;
            if (call == null || call.isScheduled() || groupCallActivity.delayedGroupCallUpdated) {
                return;
            }
            this.addMemberRow = -1;
            this.conferenceAddPeopleRow = -1;
            this.conferenceShareLinkRow = -1;
            this.videoGridDividerRow = -1;
            this.videoNotAvailableRow = -1;
            this.encryptionRow = -1;
            this.rowsCount = 0;
            this.hasSelfUser = groupCallActivity.call.participants.indexOfKey(MessageObject.getPeerId(groupCallActivity.selfPeer)) >= 0;
            if (groupCallActivity.isConference()) {
                int i = this.rowsCount;
                this.rowsCount = i + 1;
                this.encryptionRow = i;
            }
            int i2 = this.rowsCount;
            this.usersVideoGridStartRow = i2;
            ArrayList arrayList = groupCallActivity.visibleVideoParticipants;
            int size = arrayList.size() + i2;
            this.rowsCount = size;
            this.usersVideoGridEndRow = size;
            if (arrayList.size() > 0) {
                int i3 = this.rowsCount;
                this.rowsCount = i3 + 1;
                this.videoGridDividerRow = i3;
            }
            if (!arrayList.isEmpty() && groupCallActivity.canManageCall() && groupCallActivity.call.call.participants_count > groupCallActivity.accountInstance.getMessagesController().groupCallVideoMaxParticipants) {
                int i4 = this.rowsCount;
                this.rowsCount = i4 + 1;
                this.videoNotAvailableRow = i4;
            }
            this.usersStartRow = this.rowsCount;
            if (!groupCallActivity.isRtmpStream()) {
                this.rowsCount = groupCallActivity.call.visibleParticipants.size() + this.rowsCount;
            }
            this.usersEndRow = this.rowsCount;
            if (groupCallActivity.call.invitedUsers.isEmpty() || groupCallActivity.isRtmpStream()) {
                this.invitedStartRow = -1;
                this.invitedEndRow = -1;
            } else {
                int i5 = this.rowsCount;
                this.invitedStartRow = i5;
                int size2 = groupCallActivity.call.invitedUsers.size() + i5;
                this.rowsCount = size2;
                this.invitedEndRow = size2;
            }
            if (groupCallActivity.call.shadyJoinParticipants.isEmpty() || groupCallActivity.isRtmpStream()) {
                this.shadyJoinStartRow = -1;
                this.shadyJoinEndRow = -1;
            } else {
                int i6 = this.rowsCount;
                this.shadyJoinStartRow = i6;
                int size3 = groupCallActivity.call.shadyJoinParticipants.size() + i6;
                this.rowsCount = size3;
                this.shadyJoinEndRow = size3;
            }
            if (groupCallActivity.call.shadyLeftParticipants.isEmpty() || groupCallActivity.isRtmpStream()) {
                this.shadyLeftStartRow = -1;
                this.shadyLeftEndRow = -1;
            } else {
                int i7 = this.rowsCount;
                this.shadyLeftStartRow = i7;
                int size4 = groupCallActivity.call.shadyLeftParticipants.size() + i7;
                this.rowsCount = size4;
                this.shadyLeftEndRow = size4;
            }
            if (groupCallActivity.isConference()) {
                int i8 = this.rowsCount;
                this.conferenceAddPeopleRow = i8;
                this.rowsCount = i8 + 2;
                this.conferenceShareLinkRow = i8 + 1;
            } else if (!groupCallActivity.isRtmpStream() && (((!ChatObject.isChannel(groupCallActivity.currentChat) || ((chat2 = groupCallActivity.currentChat) != null && chat2.megagroup)) && ChatObject.canWriteToChat(groupCallActivity.currentChat)) || (ChatObject.isChannel(groupCallActivity.currentChat) && (chat = groupCallActivity.currentChat) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
                int i9 = this.rowsCount;
                this.rowsCount = i9 + 1;
                this.addMemberRow = i9;
            }
            int i10 = this.rowsCount;
            this.rowsCount = i10 + 1;
            this.lastRow = i10;
        }

        @Override
        public final void notifyItemRangeChanged(int i, int i2, Integer num) {
            updateRows$31();
            this.mObservable.notifyItemRangeChanged(i, i2, num);
        }
    }

    public final class AnonymousClass6 extends ActionBar.ActionBarMenuOnItemClick {
        public final LaunchActivity val$context;

        public final class AnonymousClass1 extends GroupCallRecordAlert {
            public AnonymousClass1(Context context, TLRPC.Chat chat, boolean z) {
                super(context, chat, z);
            }

            public final void onStartRecord(int i) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
                int i2 = Theme.key_voipgroup_listeningText;
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.dialogButtonColorKey = i2;
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                groupCallActivity.enterEventSent = false;
                alertDialog.title = LocaleController.getString(R.string.VoipGroupStartRecordingTitle);
                if (i == 0) {
                    alertDialog.message = LocaleController.getString(groupCallActivity.call.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpText : R.string.VoipGroupStartRecordingText);
                } else if (ChatObject.isChannelOrGiga(groupCallActivity.currentChat)) {
                    alertDialog.message = LocaleController.getString(groupCallActivity.call.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpVideoText : R.string.VoipChannelStartRecordingVideoText);
                } else {
                    alertDialog.message = LocaleController.getString(groupCallActivity.call.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpVideoText : R.string.VoipGroupStartRecordingVideoText);
                }
                alertDialog.checkFocusable = false;
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
                Context context = getContext();
                int color = Theme.getColor(null, Theme.key_voipgroup_windowBackgroundWhiteInputField, false);
                int color2 = Theme.getColor(null, Theme.key_voipgroup_windowBackgroundWhiteInputFieldActivated, false);
                Resources resources = context.getResources();
                Drawable drawableMutate = resources.getDrawable(R.drawable.search_dark).mutate();
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(color, mode));
                Drawable drawableMutate2 = resources.getDrawable(R.drawable.search_dark_activated).mutate();
                drawableMutate2.setColorFilter(new PorterDuffColorFilter(color2, mode));
                Theme.AnonymousClass3 anonymousClass3 = new Theme.AnonymousClass3();
                anonymousClass3.addState(new int[]{16842910, 16842908}, drawableMutate2);
                anonymousClass3.addState(new int[]{16842908}, drawableMutate2);
                anonymousClass3.addState(StateSet.WILD_CARD, drawableMutate);
                editTextBoldCursor.setBackgroundDrawable(anonymousClass3);
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                builder.setView(linearLayout);
                editTextBoldCursor.setTextSize(1, 16.0f);
                int i3 = Theme.key_voipgroup_nameText;
                editTextBoldCursor.setTextColor(Theme.getColor(null, i3, false));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipGroupSaveFileHint));
                editTextBoldCursor.setImeOptions(6);
                editTextBoldCursor.setHintTextColor(Theme.getColor(null, Theme.key_voipgroup_lastSeenText, false));
                editTextBoldCursor.setCursorColor(Theme.getColor(null, i3, false));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, 36, 51, 24, 0, 24, 12));
                editTextBoldCursor.setOnEditorActionListener(new GroupCallActivity$6$$ExternalSyntheticLambda3(3, builder));
                alertDialog.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_inviteMembersBackground, false));
                alertDialog.setOnShowListener(new GroupCallActivity$6$$ExternalSyntheticLambda5(this, alertDialog, editTextBoldCursor, 1));
                alertDialog.setOnDismissListener(new GroupCallActivity$6$$ExternalSyntheticLambda6(3, editTextBoldCursor));
                builder.setPositiveButton(LocaleController.getString(R.string.Start), new PassportActivity$$ExternalSyntheticLambda52(this, editTextBoldCursor, i, 11));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new GroupCallActivity$6$$ExternalSyntheticLambda2(3, editTextBoldCursor));
                alertDialog.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_dialogBackground, false));
                alertDialog.show();
                alertDialog.setTextColor(Theme.getColor(null, i3, false));
                editTextBoldCursor.requestFocus();
            }
        }

        public AnonymousClass6(LaunchActivity launchActivity) {
            this.val$context = launchActivity;
        }

        @Override
        public final void onItemClick(int i) {
            VoIPService sharedInstance;
            int color;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            if (i == -1) {
                groupCallActivity.lambda$openCrafting$8();
                return;
            }
            if (i == 1) {
                groupCallActivity.call.call.join_muted = false;
                groupCallActivity.toggleAdminSpeak();
                return;
            }
            if (i == 2) {
                groupCallActivity.call.call.join_muted = true;
                groupCallActivity.toggleAdminSpeak();
                return;
            }
            if (i == 3) {
                groupCallActivity.getLink(false);
                return;
            }
            if (i == 12) {
                groupCallActivity.setCommentsEnabled(true);
                return;
            }
            if (i == 13) {
                groupCallActivity.setCommentsEnabled(false);
                return;
            }
            if (i == 4) {
                AlertDialog.Builder builder = new AlertDialog.Builder(groupCallActivity.getContext(), 0, null);
                boolean zIsChannelOrGiga = ChatObject.isChannelOrGiga(groupCallActivity.currentChat);
                AlertDialog alertDialog = builder.alertDialog;
                if (zIsChannelOrGiga) {
                    alertDialog.title = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                    alertDialog.message = LocaleController.getString(R.string.VoipChannelEndAlertText);
                } else {
                    alertDialog.title = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                    alertDialog.message = LocaleController.getString(R.string.VoipGroupEndAlertText);
                }
                alertDialog.dialogButtonColorKey = Theme.key_voipgroup_listeningText;
                builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupEnd), new GroupCallActivity$6$$ExternalSyntheticLambda0(this));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                alertDialog.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_dialogBackground, false));
                alertDialog.show();
                TextView textView = (TextView) alertDialog.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_leaveCallMenu, false));
                }
                alertDialog.setTextColor(Theme.getColor(null, Theme.key_voipgroup_actionBarItems, false));
                return;
            }
            if (i == 9) {
                groupCallActivity.screenShareItem.callOnClick();
                return;
            }
            if (i == 5) {
                ChatObject.Call call = groupCallActivity.call;
                if (!call.recording) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(groupCallActivity.getContext(), groupCallActivity.currentChat, groupCallActivity.hasVideo);
                    if (groupCallActivity.isRtmpStream()) {
                        anonymousClass1.onStartRecord(2);
                        return;
                    } else {
                        anonymousClass1.show();
                        return;
                    }
                }
                boolean z = call.call.record_video_active;
                AlertDialog.Builder builder2 = new AlertDialog.Builder(groupCallActivity.getContext(), 0, null);
                int i2 = Theme.key_voipgroup_listeningText;
                AlertDialog alertDialog2 = builder2.alertDialog;
                alertDialog2.dialogButtonColorKey = i2;
                alertDialog2.title = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
                if (ChatObject.isChannelOrGiga(groupCallActivity.currentChat)) {
                    alertDialog2.message = LocaleController.getString(R.string.VoipChannelStopRecordingText);
                } else {
                    alertDialog2.message = LocaleController.getString(R.string.VoipGroupStopRecordingText);
                }
                builder2.setPositiveButton(LocaleController.getString(R.string.Stop), new ChatActivity$$ExternalSyntheticLambda168(8, this, z));
                builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                alertDialog2.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_dialogBackground, false));
                alertDialog2.show();
                alertDialog2.setTextColor(Theme.getColor(null, Theme.key_voipgroup_nameText, false));
                return;
            }
            if (i == 7) {
                groupCallActivity.changingPermissions = true;
                groupCallActivity.everyoneItem.setVisibility(0);
                groupCallActivity.adminItem.setVisibility(0);
                groupCallActivity.inviteItem.setVisibility(8);
                groupCallActivity.enableComments.setVisibility(8);
                groupCallActivity.disableComments.setVisibility(8);
                groupCallActivity.leaveItem.setVisibility(8);
                groupCallActivity.permissionItem.setVisibility(8);
                groupCallActivity.editTitleItem.setVisibility(8);
                groupCallActivity.recordItem.setVisibility(8);
                groupCallActivity.screenItem.setVisibility(8);
                groupCallActivity.accountSelectCell.setVisibility(8);
                groupCallActivity.soundItem.setVisibility(8);
                groupCallActivity.noiseItem.setVisibility(8);
                ActionBarMenuItem actionBarMenuItem = groupCallActivity.otherItem;
                ActionBarPopupWindow actionBarPopupWindow = actionBarMenuItem.popupWindow;
                if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
                    return;
                }
                actionBarMenuItem.popupLayout.measure(OKLCH.m(AndroidUtilities.displaySize.x, 40.0f, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                actionBarMenuItem.updateOrShowPopup(true, true);
                return;
            }
            if (i == 6) {
                groupCallActivity.enterEventSent = false;
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(groupCallActivity.getContext());
                editTextBoldCursor.setBackgroundDrawable(Theme.createEditTextDrawable(groupCallActivity.getContext()));
                AlertDialog.Builder builder3 = new AlertDialog.Builder(groupCallActivity.getContext(), 0, null);
                int i3 = Theme.key_voipgroup_listeningText;
                AlertDialog alertDialog3 = builder3.alertDialog;
                alertDialog3.dialogButtonColorKey = i3;
                if (ChatObject.isChannelOrGiga(groupCallActivity.currentChat)) {
                    alertDialog3.title = LocaleController.getString(R.string.VoipChannelTitle);
                } else {
                    alertDialog3.title = LocaleController.getString(R.string.VoipGroupTitle);
                }
                alertDialog3.checkFocusable = false;
                builder3.setNegativeButton(LocaleController.getString(R.string.Cancel), new GroupCallActivity$6$$ExternalSyntheticLambda2(0, editTextBoldCursor));
                LinearLayout linearLayout = new LinearLayout(groupCallActivity.getContext());
                linearLayout.setOrientation(1);
                builder3.setView(linearLayout);
                editTextBoldCursor.setTextSize(1, 16.0f);
                int i4 = Theme.key_voipgroup_nameText;
                editTextBoldCursor.setTextColor(Theme.getColor(null, i4, false));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(6);
                TLRPC.Chat chat = groupCallActivity.currentChat;
                editTextBoldCursor.setHint(chat != null ? chat.title : "");
                editTextBoldCursor.setHintTextColor(Theme.getColor(null, Theme.key_voipgroup_lastSeenText, false));
                editTextBoldCursor.setCursorColor(Theme.getColor(null, i4, false));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, 36, 51, 24, 6, 24, 0));
                int i5 = 0;
                editTextBoldCursor.setOnEditorActionListener(new GroupCallActivity$6$$ExternalSyntheticLambda3(i5, builder3));
                editTextBoldCursor.addTextChangedListener(new AnonymousClass2(i5, editTextBoldCursor));
                if (!TextUtils.isEmpty(groupCallActivity.call.call.title)) {
                    editTextBoldCursor.setText(groupCallActivity.call.call.title);
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                }
                builder3.setPositiveButton(LocaleController.getString(R.string.Save), new VoIPFragment$$ExternalSyntheticLambda42(this, editTextBoldCursor, builder3, 12));
                alertDialog3.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_inviteMembersBackground, false));
                int i6 = 0;
                alertDialog3.setOnShowListener(new GroupCallActivity$6$$ExternalSyntheticLambda5(this, alertDialog3, editTextBoldCursor, i6));
                alertDialog3.setOnDismissListener(new GroupCallActivity$6$$ExternalSyntheticLambda6(i6, editTextBoldCursor));
                alertDialog3.show();
                alertDialog3.setTextColor(Theme.getColor(null, i4, false));
                editTextBoldCursor.requestFocus();
                return;
            }
            if (i == 8) {
                JoinCallAlert.open(groupCallActivity.getContext(), -groupCallActivity.getChatId(), groupCallActivity.accountInstance, null, 2, groupCallActivity.selfPeer, new GroupCallActivity$6$$ExternalSyntheticLambda0(this));
                return;
            }
            if (i == 11) {
                SharedConfig.toggleNoiseSupression();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 == null) {
                    return;
                }
                sharedInstance2.setNoiseSupressionEnabled(SharedConfig.noiseSupression);
                return;
            }
            if (i != 10 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
            arrayList2.add(Integer.valueOf(R.drawable.msg_voice_speaker));
            arrayList3.add(0);
            if (sharedInstance.hasEarpiece()) {
                arrayList.add(LocaleController.getString(sharedInstance.isHeadsetPlugged() ? R.string.VoipAudioRoutingHeadset : R.string.VoipAudioRoutingPhone));
                zzlo.m(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone, 1, arrayList2, arrayList3);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String string = sharedInstance.currentBluetoothDeviceName;
                if (string == null) {
                    string = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                }
                arrayList.add(string);
                zzlo.m(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i7 = 0; i7 < size; i7++) {
                charSequenceArr[i7] = (CharSequence) arrayList.get(i7);
                iArr[i7] = ((Integer) arrayList2.get(i7)).intValue();
            }
            BottomSheet bottomSheet = new BottomSheet(this.val$context, null, false, false);
            bottomSheet.fixNavigationBar();
            bottomSheet.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
            bottomSheet.bigTitle = true;
            ArticleViewer$$ExternalSyntheticLambda24 articleViewer$$ExternalSyntheticLambda24 = new ArticleViewer$$ExternalSyntheticLambda24(9, this, arrayList3);
            bottomSheet.items = charSequenceArr;
            bottomSheet.itemIcons = iArr;
            bottomSheet.onClickListener = articleViewer$$ExternalSyntheticLambda24;
            int i8 = Theme.key_voipgroup_listViewBackgroundUnscrolled;
            bottomSheet.setBackgroundColor(Theme.getColor(null, i8, false));
            bottomSheet.fixNavigationBar(Theme.getColor(null, i8, false));
            int i9 = sharedInstance.getCurrentAudioRoute() == 1 ? 0 : sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
            bottomSheet.show();
            bottomSheet.setTitleColor(Theme.getColor(null, Theme.key_voipgroup_nameText, false));
            for (int i10 = 0; i10 < bottomSheet.getItemViews().size(); i10++) {
                BottomSheet.BottomSheetCell bottomSheetCell = bottomSheet.getItemViews().get(i10);
                if (i10 == i9) {
                    color = Theme.getColor(null, Theme.key_voipgroup_listeningText, false);
                    bottomSheetCell.isSelected = true;
                } else {
                    color = Theme.getColor(null, Theme.key_voipgroup_nameText, false);
                }
                bottomSheetCell.setTextColor(color);
                bottomSheetCell.setIconColor(color);
                bottomSheetCell.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_voipgroup_actionBarItems, false), 12), 2, -1));
            }
        }

        public final class AnonymousClass2 implements TextWatcher {
            public final int $r8$classId;
            public boolean ignoreTextChange;
            public final EditTextBoldCursor val$editText;

            public AnonymousClass2(int i, EditTextBoldCursor editTextBoldCursor) {
                this.$r8$classId = i;
                this.val$editText = editTextBoldCursor;
            }

            @Override
            public final void afterTextChanged(Editable editable) {
                switch (this.$r8$classId) {
                    case 0:
                        if (!this.ignoreTextChange && editable.length() > 40) {
                            this.ignoreTextChange = true;
                            editable.delete(40, editable.length());
                            EditTextBoldCursor editTextBoldCursor = this.val$editText;
                            AndroidUtilities.shakeView(editTextBoldCursor);
                            try {
                                editTextBoldCursor.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                            }
                            this.ignoreTextChange = false;
                        }
                        break;
                    default:
                        if (!this.ignoreTextChange && editable.length() > 32) {
                            this.ignoreTextChange = true;
                            editable.delete(32, editable.length());
                            EditTextBoldCursor editTextBoldCursor2 = this.val$editText;
                            AndroidUtilities.shakeView(editTextBoldCursor2);
                            try {
                                editTextBoldCursor2.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused2) {
                            }
                            this.ignoreTextChange = false;
                        }
                        break;
                }
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int i4 = this.$r8$classId;
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int i4 = this.$r8$classId;
            }

            private final void beforeTextChanged$org$telegram$ui$FilterChatlistActivity$ListAdapter$1$1(int i, int i2, int i3, CharSequence charSequence) {
            }

            private final void beforeTextChanged$org$telegram$ui$GroupCallActivity$6$2(int i, int i2, int i3, CharSequence charSequence) {
            }

            private final void onTextChanged$org$telegram$ui$FilterChatlistActivity$ListAdapter$1$1(int i, int i2, int i3, CharSequence charSequence) {
            }

            private final void onTextChanged$org$telegram$ui$GroupCallActivity$6$2(int i, int i2, int i3, CharSequence charSequence) {
            }
        }
    }
}
