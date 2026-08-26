package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
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
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
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
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline0;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController$$ExternalSyntheticLambda8;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
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
import org.telegram.messenger.pip.PipSource;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
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
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.AccountSelectCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.GroupCallInvitedCell;
import org.telegram.ui.Cells.GroupCallTextCell;
import org.telegram.ui.Cells.GroupCallUserCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
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
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.ProfileGalleryView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecordStatusDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.conference.GroupCallActivityButtonsLayout;
import org.telegram.ui.Components.conference.message.GroupCallMessageCell;
import org.telegram.ui.Components.conference.message.GroupCallMessagesListView;
import org.telegram.ui.Components.inset.WindowInsetsStateHolder;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.Components.voip.GroupCallGridCell;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.voip.GroupCallRenderersContainer;
import org.telegram.ui.Components.voip.GroupCallStatusIcon;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialog;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Components.voip.VoIPTextureView;
import org.telegram.ui.Components.voip.VoIPToggleButton;
import org.telegram.ui.Stories.recorder.DominantColors;
import org.webrtc.voiceengine.WebRtcAudioTrack;

public class GroupCallActivity extends BottomSheet implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, FactorAnimator.Target {
    private static final int ANIMATOR_ID_HAS_VIDEO = 5;
    private static final int ANIMATOR_ID_HIDE_BUTTONS = 2;
    private static final int ANIMATOR_ID_MESSAGE_INPUT_HEIGHT = 4;
    private static final int ANIMATOR_ID_MESSAGE_INPUT_IS_EMPTY = 3;
    public static final float MAX_AMPLITUDE = 8500.0f;
    private static final int MUTE_BUTTON_STATE_CANCEL_REMINDER = 7;
    private static final int MUTE_BUTTON_STATE_CONNECTING = 3;
    private static final int MUTE_BUTTON_STATE_MUTE = 1;
    private static final int MUTE_BUTTON_STATE_MUTED_BY_ADMIN = 2;
    private static final int MUTE_BUTTON_STATE_RAISED_HAND = 4;
    private static final int MUTE_BUTTON_STATE_SET_REMINDER = 6;
    private static final int MUTE_BUTTON_STATE_START_NOW = 5;
    private static final int MUTE_BUTTON_STATE_UNMUTE = 0;
    public static final int TABLET_LIST_SIZE = 320;
    public static final long TRANSITION_DURATION = 350;
    private static final int admin_can_speak_item = 2;
    private static final int comments_disable_item = 13;
    private static final int comments_enable_item = 12;
    private static final int edit_item = 6;
    private static final int eveyone_can_speak_item = 1;
    public static GroupCallActivity groupCallInstance = null;
    public static boolean groupCallUiVisible = false;
    public static boolean isLandscapeMode = false;
    public static boolean isTabletMode = false;
    private static final int leave_item = 4;
    private static final int noise_item = 11;
    public static boolean paused = false;
    private static final int permission_item = 7;
    private static final int screen_capture_item = 9;
    private static final int share_invite_link_item = 3;
    private static final int sound_item = 10;
    private static final int start_record_item = 5;
    public static volatile DispatchQueue updateTextureLightningQueue = new DispatchQueue("updateTextureLightningQueue");
    private static final int user_item = 8;
    private static final int user_item_gap = 0;
    private final AccountInstance accountInstance;
    private final AccountSelectCell accountSelectCell;
    private final ActionBar actionBar;
    private AnimatorSet actionBarAnimation;
    private final View actionBarBackground;
    private final View actionBarShadow;
    ObjectAnimator additionalSubtitleYAnimator;
    private ActionBarMenuSubItem adminItem;
    private float amplitude;
    private float animateAmplitudeDiff;
    private float animateToAmplitude;
    private boolean animatingToFullscreenExpand;
    private final BoolAnimator animatorHasVideo;
    private final BoolAnimator animatorHideButtons;
    private final FactorAnimator animatorMessageInputHeight;
    private final BoolAnimator animatorMessageIsEmpty;
    private boolean anyEnterEventSent;
    private final ArrayList<GroupCallMiniTextureView> attachedRenderers;
    private final ArrayList<GroupCallMiniTextureView> attachedRenderersTmp;
    private final AvatarPreviewPagerIndicator avatarPagerIndicator;
    private final FrameLayout avatarPreviewContainer;
    private boolean avatarPriviewTransitionInProgress;
    AvatarUpdaterDelegate avatarUpdaterDelegate;
    private boolean avatarsPreviewShowed;
    private final ProfileGalleryView avatarsViewPager;
    private int backgroundColor;
    private final RLottieDrawable bigMicDrawable;
    private final BlobDrawable bigWaveDrawable;
    private final View blurredView;
    private final FrameLayout bulletinContainer;
    private GradientDrawable buttonsBackgroundGradient;
    private final View buttonsBackgroundGradientView;
    private final View buttonsBackgroundGradientView2;
    private final GroupCallActivityButtonsLayout buttonsContainer;
    private int buttonsVisibility;
    private Integer cacheAudioOutputValue;
    public ChatObject.Call call;
    private boolean callInitied;
    private final FrameLayout callMessageEnterContainer;
    private final Paint callMessageEnterContainerBgPaint;
    private final FrameLayout callMessageEnterUnderContainer;
    private final EditTextEmoji callMessageEnterView;
    private final ImageView callMessageHideButton;
    private final ImageView callMessageSendButton;
    private final VoIPToggleButton cameraButton;
    public CellFlickerDrawable cellFlickerDrawable;
    private boolean changingPermissions;
    private float colorProgress;
    private final int[] colorsTmp;
    private boolean contentFullyOverlayed;
    private long creatingServiceTime;
    ImageUpdater currentAvatarUpdater;
    private int currentCallState;
    public TLRPC.Chat currentChat;
    private ViewGroup currentOptionsLayout;
    private WeavingState currentState;
    private boolean delayedGroupCallUpdated;
    private DiffUtil.Callback diffUtilsCallback;
    private final ActionBarMenuSubItem disableComments;
    private boolean drawSpeakingSubtitle;
    public boolean drawingForBlur;
    private final ActionBarMenuSubItem editTitleItem;
    private final ActionBarMenuSubItem enableComments;
    private CallEncryptionCellDrawable encryptionDrawable;
    private boolean enterEventSent;
    private ActionBarMenuSubItem everyoneItem;
    private final ImageView expandOrMinimizeButton;
    private final VoIPToggleButton flipButton;
    private final RLottieDrawable flipIcon;
    private int flipIconCurrentEndFrame;
    GroupCallFullscreenAdapter fullscreenAdapter;
    private final DefaultItemAnimator fullscreenListItemAnimator;
    ValueAnimator fullscreenModeAnimator;
    RecyclerListView fullscreenUsersListView;
    private final int[] gradientColors;
    private final GroupCallMessagesListView groupCallMessagesListView;
    private GroupVoipInviteAlert groupVoipInviteAlert;
    private final RLottieDrawable handDrawables;
    private boolean hasScrimAnchorView;
    private boolean hasVideo;
    private boolean invalidateColors;
    private final ActionBarMenuSubItem inviteItem;
    private String[] invites;
    private boolean isInDrawRenderNodeBlur;
    private boolean isInFullscreen;
    private final GroupCallItemAnimator itemAnimator;
    private long lastUpdateTime;
    private final FillLastGridLayoutManager layoutManager;
    private final VoIPToggleButton leaveButton;
    private final ActionBarMenuSubItem leaveItem;
    private final AnimatedTextView limitTextView;
    private final ListAdapter listAdapter;
    private RecyclerListView listView;
    private final Paint listViewBackgroundPaint;
    private boolean listViewVideoVisibility;
    private ValueAnimator liveLabelBgColorAnimator;
    private final Paint liveLabelPaint;
    private final TextView liveLabelTextView;
    private final int maxGroupCallMessageLength;
    private final LinearLayout menuItemsContainer;
    private final VoIPToggleButton messageButton;
    private final VoIPToggleButton muteButton;
    private final RLottieImageView muteButtonIcon;
    private int muteButtonState;
    private boolean needTextureLightning;
    private final ActionBarMenuSubItem noiseItem;
    private int oldAddMemberRow;
    private int oldConferenceAddPeopleRow;
    private int oldConferenceShareLinkRow;
    private int oldCount;
    private int oldEncryptionRow;
    private final ArrayList<Long> oldInvited;
    private int oldInvitedEndRow;
    private int oldInvitedStartRow;
    private final ArrayList<TLRPC.GroupCallParticipant> oldParticipants;
    private final ArrayList<Long> oldShadyJoin;
    private int oldShadyJoinEndRow;
    private int oldShadyJoinStartRow;
    private final ArrayList<Long> oldShadyLeft;
    private int oldShadyLeftEndRow;
    private int oldShadyLeftStartRow;
    private int oldUsersEndRow;
    private int oldUsersStartRow;
    private int oldUsersVideoEndRow;
    private int oldUsersVideoStartRow;
    private int oldVideoDividerRow;
    private int oldVideoNotAvailableRow;
    private final ArrayList<ChatObject.VideoParticipant> oldVideoParticipants;
    private final Runnable onUserLeaveHintListener;
    private final ActionBarMenuItem otherItem;
    private Paint paint;
    private Paint paintTmp;
    private LaunchActivity parentActivity;
    private Boolean pendingCommentsEnabled;
    private final ActionBarMenuSubItem permissionItem;
    PinchToZoomHelper pinchToZoomHelper;
    private final ActionBarMenuItem pipItem;
    private PipSource pipSource;
    private boolean playingHandAnimation;
    private int popupAnimationIndex;
    private final Runnable pressRunnable;
    private boolean pressed;
    private WeavingState prevState;
    PrivateVideoPreviewDialog previewDialog;
    private boolean previewTextureTransitionEnabled;
    private float progressToAvatarPreview;
    private RadialGradient radialGradient;
    private final Matrix radialMatrix;
    private final Paint radialPaint;
    private final RadialProgressView radialProgressView;
    private final ImageReceiver reactionEffectImageReceiver;
    private ReactionsContainerLayout reactionsContainerLayout;
    private RecordCallDrawable recordCallDrawable;
    private HintView recordHintView;
    private final ActionBarMenuSubItem recordItem;
    private final RectF rect;
    private HintView reminderHintView;
    private RenderNode renderNodeBlur;
    private float renderNodeBlurScale;
    private GroupCallRenderersContainer renderersContainer;
    ViewTreeObserver.OnPreDrawListener requestFullscreenListener;
    private ValueAnimator scheduleAnimator;
    private TextView scheduleButtonTextView;
    private final boolean scheduleHasFewPeers;
    private TextView scheduleInfoTextView;
    private TLRPC.InputPeer schedulePeer;
    private int scheduleStartAt;
    private SimpleTextView scheduleStartAtTextView;
    private SimpleTextView scheduleStartInTextView;
    private SimpleTextView scheduleTimeTextView;
    private LinearLayout scheduleTimerContainer;
    private boolean scheduled;
    private final String scheduledHash;
    private final ActionBarMenuSubItem screenItem;
    private final ActionBarMenuItem screenShareItem;
    private AnimatorSet scrimAnimatorSet;
    private GroupCallFullscreenAdapter.GroupCallUserCell scrimFullscreenView;
    private GroupCallGridCell scrimGridView;
    private Paint scrimPaint;
    private View scrimPopupLayout;
    private ActionBarPopupWindow scrimPopupWindow;
    private GroupCallMiniTextureView scrimRenderer;
    private GroupCallUserCell scrimView;
    private boolean scrimViewAttached;
    private float scrollOffsetY;
    private TLRPC.Peer selfPeer;
    private final Drawable shadowDrawable;
    private ShareAlert shareAlert;
    private float showLightingProgress;
    private float showWavesProgress;
    private final SizeNotifierFrameLayout sizeNotifierFrameLayout;
    private final VoIPToggleButton soundButton;
    private ActionBarMenuSubItem soundItem;
    private final View soundItemDivider;
    private final GridLayoutManager.SpanSizeLookup spanSizeLookup;
    private final VoIPToggleButton speakerButton;
    private int speakerIcon;
    private final ImageView speakerImageView;
    private boolean startingGroupCall;
    private WeavingState[] states;
    public final ArrayList<GroupCallStatusIcon> statusIconPool;
    ObjectAnimator subtitleYAnimator;
    private float switchProgress;
    private float switchToButtonInt2;
    private float switchToButtonProgress;
    GroupCallTabletGridAdapter tabletGridAdapter;
    RecyclerListView tabletVideoGridView;
    private LightningView textureLightningView;
    private float textureLightningViewAnimatingAlpha;
    private final BlobDrawable tinyWaveDrawable;
    private final LinearLayout titleLayout;
    private final AudioPlayerAlert.ClippingTextViewSwitcher titleTextView;
    private final UndoView[] undoView;
    private final Runnable unmuteRunnable;
    private Runnable updateCallRecordRunnable;
    private final Runnable updateSchedeulRunnable;
    private final Runnable updateTextureLightningRunnable;
    private boolean useBlur;
    private TLObject userSwitchObject;
    LongSparseIntArray visiblePeerIds;
    public final ArrayList<ChatObject.VideoParticipant> visibleVideoParticipants;
    private Boolean wasExpandBigSize;
    private Boolean wasNotInLayoutFullscreen;
    private WatchersView watchersView;
    private final WindowInsetsStateHolder windowInsetsStateHolder;

    public class AnonymousClass19 implements View.OnClickListener {
        Runnable finishRunnable = new Runnable() {
            @Override
            public void run() {
                GroupCallActivity.this.muteButtonIcon.setAnimation(GroupCallActivity.this.bigMicDrawable);
                GroupCallActivity.this.playingHandAnimation = false;
            }
        };

        public AnonymousClass19() {
        }

        public void lambda$onClick$0() {
            GroupCallActivity.this.wasNotInLayoutFullscreen = null;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            groupCallActivity.updateMuteButton(groupCallActivity.muteButtonState, true);
        }

        public void lambda$onClick$1(TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tLObject != null) {
                GroupCallActivity.this.accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            }
        }

        public void lambda$onClick$2(TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tLObject != null) {
                GroupCallActivity.this.accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            }
        }

        @Override
        public void onClick(View view) {
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            if (groupCallActivity.call == null || groupCallActivity.muteButtonState == 3) {
                return;
            }
            int i = 0;
            if (GroupCallActivity.this.isRtmpStream() && !GroupCallActivity.this.call.isScheduled()) {
                if (GroupCallActivity.this.renderersContainer != null && GroupCallActivity.this.renderersContainer.inFullscreenMode && (AndroidUtilities.isTablet() || GroupCallActivity.isLandscapeMode == GroupCallActivity.this.isRtmpLandscapeMode())) {
                    GroupCallActivity.this.fullscreenFor(null);
                    if (GroupCallActivity.isLandscapeMode) {
                        AndroidUtilities.runOnUIThread(new ChatActivity$21$$ExternalSyntheticLambda4(this, 24), 200L);
                    }
                    GroupCallActivity.this.parentActivity.setRequestedOrientation(-1);
                    return;
                }
                if (GroupCallActivity.this.visibleVideoParticipants.isEmpty()) {
                    return;
                }
                ChatObject.VideoParticipant videoParticipant = GroupCallActivity.this.visibleVideoParticipants.get(0);
                if (AndroidUtilities.isTablet()) {
                    GroupCallActivity.this.fullscreenFor(videoParticipant);
                    return;
                }
                if (GroupCallActivity.isLandscapeMode == GroupCallActivity.this.isRtmpLandscapeMode()) {
                    GroupCallActivity.this.fullscreenFor(videoParticipant);
                }
                if (GroupCallActivity.this.isRtmpLandscapeMode()) {
                    GroupCallActivity.this.parentActivity.setRequestedOrientation(6);
                    return;
                } else {
                    GroupCallActivity.this.parentActivity.setRequestedOrientation(1);
                    return;
                }
            }
            if (GroupCallActivity.this.muteButtonState == 5) {
                if (GroupCallActivity.this.startingGroupCall) {
                    return;
                }
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                GroupCallActivity.this.startingGroupCall = true;
                TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                startscheduledgroupcall.call = GroupCallActivity.this.call.getInputGroupCall();
                final int i2 = 0;
                GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                    public final GroupCallActivity.AnonymousClass19 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i2) {
                            case 0:
                                this.f$0.lambda$onClick$1(tLObject, tL_error);
                                break;
                            default:
                                this.f$0.lambda$onClick$2(tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            if (GroupCallActivity.this.muteButtonState == 7 || GroupCallActivity.this.muteButtonState == 6) {
                if (GroupCallActivity.this.muteButtonState == 6 && GroupCallActivity.this.reminderHintView != null) {
                    GroupCallActivity.this.reminderHintView.hide();
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = GroupCallActivity.this.call.getInputGroupCall();
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                TLRPC.GroupCall groupCall = groupCallActivity2.call.call;
                boolean z = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z;
                togglegroupcallstartsubscription.subscribed = z;
                final int i3 = 1;
                groupCallActivity2.accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final GroupCallActivity.AnonymousClass19 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i3) {
                            case 0:
                                this.f$0.lambda$onClick$1(tLObject, tL_error);
                                break;
                            default:
                                this.f$0.lambda$onClick$2(tLObject, tL_error);
                                break;
                        }
                    }
                });
                GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                groupCallActivity3.updateMuteButton(groupCallActivity3.call.call.schedule_start_subscribed ? 7 : 6, true);
                return;
            }
            if (VoIPService.getSharedInstance() == null || GroupCallActivity.this.isStillConnecting()) {
                return;
            }
            if (GroupCallActivity.this.muteButtonState != 2 && GroupCallActivity.this.muteButtonState != 4) {
                try {
                    if (GroupCallActivity.this.muteButtonState != 0) {
                        GroupCallActivity.this.updateMuteButton(0, true);
                        VoIPService.getSharedInstance().setMicMute(true, false, true);
                        GroupCallActivity.this.muteButton.performHapticFeedback(3, 2);
                        return;
                    } else {
                        if (Build.VERSION.SDK_INT >= 23 && GroupCallActivity.this.getParentActivity() != null && GroupCallActivity.this.getParentActivity().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                            PermissionRequest.ensurePermission(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, "android.permission.RECORD_AUDIO", new LinkEditActivity$$ExternalSyntheticLambda14(1));
                            return;
                        }
                        GroupCallActivity.this.updateMuteButton(1, true);
                        VoIPService.getSharedInstance().setMicMute(false, false, true);
                        GroupCallActivity.this.muteButton.performHapticFeedback(3, 2);
                        return;
                    }
                } catch (Exception unused2) {
                    return;
                }
            }
            if (GroupCallActivity.this.isConference() || GroupCallActivity.this.playingHandAnimation) {
                return;
            }
            GroupCallActivity.this.playingHandAnimation = true;
            AndroidUtilities.shakeView(GroupCallActivity.this.muteButton.getTextView());
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused3) {
            }
            int iNextInt = Utilities.random.nextInt(100);
            int i4 = 120;
            if (iNextInt >= 32) {
                i = 240;
                if (iNextInt < 64) {
                    i4 = 240;
                    i = 120;
                } else {
                    i4 = 420;
                    if (iNextInt >= 97) {
                        i = 540;
                        if (iNextInt == 98) {
                            i4 = 540;
                            i = 420;
                        } else {
                            i4 = 720;
                        }
                    }
                }
            }
            GroupCallActivity.this.handDrawables.setCustomEndFrame(i4);
            GroupCallActivity.this.handDrawables.setOnFinishCallback(this.finishRunnable, i4 - 1);
            GroupCallActivity.this.muteButtonIcon.setAnimation(GroupCallActivity.this.handDrawables);
            GroupCallActivity.this.handDrawables.setCurrentFrame(i);
            GroupCallActivity.this.muteButtonIcon.playAnimation();
            if (GroupCallActivity.this.muteButtonState == 2) {
                GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) groupCallActivity4.call.participants.get(MessageObject.getPeerId(groupCallActivity4.selfPeer))).peer);
                VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? GroupCallActivity.this.accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : GroupCallActivity.this.accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
                GroupCallActivity.this.updateMuteButton(4, true);
            }
        }
    }

    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        public void lambda$run$0(int[] iArr) {
            GroupCallActivity.this.textureLightningView.setNewColors(iArr);
        }

        public void lambda$run$1(VoIPTextureView voIPTextureView) {
            try {
                Bitmap bitmap = voIPTextureView.blurRenderer.getBitmap(100, 100);
                if (bitmap == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new PhotoViewer$44$$ExternalSyntheticLambda0(19, this, DominantColors.getColorsSync(bitmap, true)));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void run() {
            GroupCallGridCell groupCallGridCellFindGroupCallGridCell;
            GroupCallMiniTextureView renderer;
            GroupCallMiniTextureView.AnonymousClass1 anonymousClass1;
            try {
                if (GroupCallActivity.this.renderersContainer != null && !GroupCallActivity.this.renderersContainer.inFullscreenMode && (groupCallGridCellFindGroupCallGridCell = GroupCallActivity.this.findGroupCallGridCell()) != null && groupCallGridCellFindGroupCallGridCell.isAttachedToWindow() && (renderer = groupCallGridCellFindGroupCallGridCell.getRenderer()) != null && (anonymousClass1 = renderer.textureView) != null) {
                    GroupCallActivity.updateTextureLightningQueue.postRunnable(new PhotoViewer$44$$ExternalSyntheticLambda0(20, this, anonymousClass1));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public class AnonymousClass20 extends AudioPlayerAlert.ClippingTextViewSwitcher {
        final Activity val$context;

        public AnonymousClass20(Context context, Activity activity) {
            super(context);
            this.val$context = activity;
        }

        public void lambda$createTextView$0(TextView textView, View view) {
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            ChatObject.Call call = groupCallActivity.call;
            if (call == null || !call.recording) {
                return;
            }
            groupCallActivity.showRecordHint(textView);
        }

        @Override
        public TextView createTextView() {
            TextView textView = new TextView(this.val$context);
            textView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_actionBarItems, false));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(51);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setOnClickListener(new ArticleViewer$$ExternalSyntheticLambda53(7, this, textView));
            return textView;
        }
    }

    public class AnonymousClass6 extends ActionBar.ActionBarMenuOnItemClick {
        final Activity val$context;

        public class AnonymousClass1 extends GroupCallRecordAlert {
            public AnonymousClass1(Context context, TLRPC.Chat chat, boolean z) {
                super(context, chat, z);
            }

            public static boolean lambda$onStartRecord$0(AlertDialog.Builder builder, TextView textView, int i, KeyEvent keyEvent) {
                AndroidUtilities.hideKeyboard(textView);
                builder.create().getButton(-1).callOnClick();
                return false;
            }

            public void lambda$onStartRecord$1(AlertDialog alertDialog, EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
                GroupCallActivity.this.makeFocusable(null, alertDialog, editTextBoldCursor, true);
            }

            public void lambda$onStartRecord$3(EditTextBoldCursor editTextBoldCursor, int i, AlertDialog alertDialog, int i2) {
                GroupCallActivity.this.call.toggleRecord(editTextBoldCursor.getText().toString(), i);
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                GroupCallActivity.this.getUndoView().showWithAction(0L, i == 0 ? 39 : 100, (Runnable) null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                }
            }

            @Override
            public void onStartRecord(int i) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
                builder.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
                GroupCallActivity.this.enterEventSent = false;
                builder.setTitle(LocaleController.getString(R.string.VoipGroupStartRecordingTitle));
                if (i == 0) {
                    builder.setMessage(LocaleController.getString(GroupCallActivity.this.call.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpText : R.string.VoipGroupStartRecordingText));
                } else if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                    builder.setMessage(LocaleController.getString(GroupCallActivity.this.call.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpVideoText : R.string.VoipChannelStartRecordingVideoText));
                } else {
                    builder.setMessage(LocaleController.getString(GroupCallActivity.this.call.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpVideoText : R.string.VoipGroupStartRecordingVideoText));
                }
                builder.setCheckFocusable(false);
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
                int i2 = Theme.key_voipgroup_nameText;
                editTextBoldCursor.setTextColor(Theme.getColor(null, i2, false));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipGroupSaveFileHint));
                editTextBoldCursor.setImeOptions(6);
                editTextBoldCursor.setHintTextColor(Theme.getColor(null, Theme.key_voipgroup_lastSeenText, false));
                editTextBoldCursor.setCursorColor(Theme.getColor(null, i2, false));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, 36, 51, 24, 0, 24, 12));
                editTextBoldCursor.setOnEditorActionListener(new GroupCallActivity$6$$ExternalSyntheticLambda4(builder, 2));
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_inviteMembersBackground, false));
                alertDialogCreate.setOnShowListener(new GroupCallActivity$6$$ExternalSyntheticLambda6(this, alertDialogCreate, editTextBoldCursor, 1));
                alertDialogCreate.setOnDismissListener(new GroupCallActivity$6$$ExternalSyntheticLambda7(2, editTextBoldCursor));
                builder.setPositiveButton(LocaleController.getString(R.string.Start), new ChatActivity$$ExternalSyntheticLambda437(this, editTextBoldCursor, i, 1));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new GroupCallActivity$6$$ExternalSyntheticLambda3(2, editTextBoldCursor));
                AlertDialog alertDialogCreate2 = builder.create();
                alertDialogCreate2.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_dialogBackground, false));
                alertDialogCreate2.show();
                alertDialogCreate2.setTextColor(Theme.getColor(null, i2, false));
                editTextBoldCursor.requestFocus();
            }

            @Override
            public void setLastVisible(boolean z) {
            }
        }

        public AnonymousClass6(Activity activity) {
            this.val$context = activity;
        }

        public void lambda$onItemClick$0(TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tLObject instanceof TLRPC.TL_updates) {
                GroupCallActivity.this.accountInstance.getMessagesController().processUpdates((TLRPC.TL_updates) tLObject, false);
            }
        }

        public void lambda$onItemClick$1(AlertDialog alertDialog, int i) {
            int i2 = 2;
            if (GroupCallActivity.this.call.isScheduled()) {
                TLRPC.ChatFull chatFull = GroupCallActivity.this.accountInstance.getMessagesController().getChatFull(GroupCallActivity.this.getChatId());
                if (chatFull != null) {
                    chatFull.flags &= -2097153;
                    chatFull.call = null;
                    GroupCallActivity.this.accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(GroupCallActivity.this.getChatId()), Long.valueOf(GroupCallActivity.this.call.call.id), Boolean.FALSE);
                }
                TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                discardgroupcall.call = GroupCallActivity.this.call.getInputGroupCall();
                GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(discardgroupcall, new LinkManager$$ExternalSyntheticLambda10(this, i2));
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().hangUp(1);
            }
            GroupCallActivity.this.lambda$showGiftOfferSheet$15();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
        }

        public void lambda$onItemClick$10(int i) {
            GroupCallActivity.this.setAudioOutputValue(i);
            BulletinFactory.of(GroupCallActivity.this.topBulletinContainer, new DarkBlueThemeResourcesProvider()).createSimpleBulletin(GroupCallActivity.this.getContext().getResources().getDrawable(GroupCallActivity.this.getAudioOutputToastIcon(i)).mutate(), GroupCallActivity.this.getAudioOutputToastText(i)).show(GroupCallActivity.this.isBulletinTop());
        }

        public void lambda$onItemClick$11(ArrayList arrayList, DialogInterface dialogInterface, int i) {
            if (VoIPService.getSharedInstance() == null) {
                return;
            }
            Integer num = (Integer) arrayList.get(i);
            int iIntValue = num.intValue();
            GroupCallActivity.this.cacheAudioOutputValue = num;
            GroupCallActivity.this.updateState(true, true);
            GroupCallActivity.this.cacheAudioOutputValue = null;
            AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda6(this, iIntValue, 10));
        }

        public void lambda$onItemClick$2(boolean z, AlertDialog alertDialog, int i) {
            GroupCallActivity.this.call.toggleRecord(null, 0);
            GroupCallActivity.this.getUndoView().showWithAction(0L, z ? 101 : 40, (Runnable) null);
        }

        public static boolean lambda$onItemClick$4(AlertDialog.Builder builder, TextView textView, int i, KeyEvent keyEvent) {
            AndroidUtilities.hideKeyboard(textView);
            builder.create().getButton(-1).callOnClick();
            return false;
        }

        public void lambda$onItemClick$5(EditTextBoldCursor editTextBoldCursor, AlertDialog.Builder builder, AlertDialog alertDialog, int i) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            GroupCallActivity.this.call.setTitle(editTextBoldCursor.getText().toString());
            builder.getDismissRunnable().run();
        }

        public void lambda$onItemClick$6(AlertDialog alertDialog, EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
            GroupCallActivity.this.makeFocusable(null, alertDialog, editTextBoldCursor, true);
        }

        public static void lambda$onItemClick$8(TLObject tLObject, TLRPC.TL_error tL_error) {
        }

        public void lambda$onItemClick$9(TLRPC.InputPeer inputPeer, boolean z, boolean z2, boolean z3) {
            TLObject chat;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            if (groupCallActivity.call == null) {
                return;
            }
            boolean z4 = inputPeer instanceof TLRPC.TL_inputPeerUser;
            if (z4) {
                chat = groupCallActivity.accountInstance.getMessagesController().getUser(Long.valueOf(inputPeer.user_id));
            } else {
                chat = inputPeer instanceof TLRPC.TL_inputPeerChat ? groupCallActivity.accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.chat_id)) : groupCallActivity.accountInstance.getMessagesController().getChat(Long.valueOf(inputPeer.channel_id));
            }
            TLObject tLObject = chat;
            if (!GroupCallActivity.this.call.isScheduled()) {
                if (VoIPService.getSharedInstance() == null || !z) {
                    return;
                }
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
                GroupCallActivity.this.userSwitchObject = tLObject;
                return;
            }
            GroupCallActivity.this.getUndoView().showWithAction(0L, 37, tLObject, GroupCallActivity.this.currentChat, (Runnable) null, (Runnable) null);
            if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                GroupCallActivity.this.selfPeer = new TLRPC.TL_peerChannel();
                GroupCallActivity.this.selfPeer.channel_id = inputPeer.channel_id;
            } else if (z4) {
                GroupCallActivity.this.selfPeer = new TLRPC.TL_peerUser();
                GroupCallActivity.this.selfPeer.user_id = inputPeer.user_id;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                GroupCallActivity.this.selfPeer = new TLRPC.TL_peerChat();
                GroupCallActivity.this.selfPeer.chat_id = inputPeer.chat_id;
            }
            GroupCallActivity.this.schedulePeer = inputPeer;
            TLRPC.ChatFull chatFull = GroupCallActivity.this.accountInstance.getMessagesController().getChatFull(GroupCallActivity.this.getChatId());
            if (chatFull != null) {
                chatFull.groupcall_default_join_as = GroupCallActivity.this.selfPeer;
                if (chatFull instanceof TLRPC.TL_chatFull) {
                    chatFull.flags |= 32768;
                } else {
                    chatFull.flags |= 67108864;
                }
            }
            TL_phone.saveDefaultGroupCallJoinAs savedefaultgroupcalljoinas = new TL_phone.saveDefaultGroupCallJoinAs();
            savedefaultgroupcalljoinas.peer = MessagesController.getInputPeer(GroupCallActivity.this.currentChat);
            savedefaultgroupcalljoinas.join_as = inputPeer;
            GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(savedefaultgroupcalljoinas, new PassportActivity$$ExternalSyntheticLambda3(2));
            GroupCallActivity.this.updateItems();
        }

        @Override
        public void onItemClick(int i) {
            VoIPService sharedInstance;
            int color;
            if (i == -1) {
                GroupCallActivity.this.lambda$openCrafting$8();
                return;
            }
            if (i == 1) {
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                groupCallActivity.call.call.join_muted = false;
                groupCallActivity.toggleAdminSpeak();
                return;
            }
            if (i == 2) {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                groupCallActivity2.call.call.join_muted = true;
                groupCallActivity2.toggleAdminSpeak();
                return;
            }
            if (i == 3) {
                GroupCallActivity.this.getLink(false);
                return;
            }
            if (i == 12) {
                GroupCallActivity.this.setCommentsEnabled(true);
                return;
            }
            if (i == 13) {
                GroupCallActivity.this.setCommentsEnabled(false);
                return;
            }
            if (i == 4) {
                AlertDialog.Builder builder = new AlertDialog.Builder(GroupCallActivity.this.getContext(), 0, null);
                if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                    builder.setTitle(LocaleController.getString(R.string.VoipChannelEndAlertTitle));
                    builder.setMessage(LocaleController.getString(R.string.VoipChannelEndAlertText));
                } else {
                    builder.setTitle(LocaleController.getString(R.string.VoipGroupEndAlertTitle));
                    builder.setMessage(LocaleController.getString(R.string.VoipGroupEndAlertText));
                }
                builder.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
                builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupEnd), new GroupCallActivity$6$$ExternalSyntheticLambda1(this));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_dialogBackground, false));
                alertDialogCreate.show();
                TextView textView = (TextView) alertDialogCreate.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_leaveCallMenu, false));
                }
                alertDialogCreate.setTextColor(Theme.getColor(null, Theme.key_voipgroup_actionBarItems, false));
                return;
            }
            if (i == 9) {
                GroupCallActivity.this.screenShareItem.callOnClick();
                return;
            }
            if (i == 5) {
                GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                ChatObject.Call call = groupCallActivity3.call;
                if (!call.recording) {
                    Context context = GroupCallActivity.this.getContext();
                    GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, groupCallActivity4.currentChat, groupCallActivity4.hasVideo);
                    if (GroupCallActivity.this.isRtmpStream()) {
                        anonymousClass1.onStartRecord(2);
                        return;
                    } else {
                        anonymousClass1.show();
                        return;
                    }
                }
                boolean z = call.call.record_video_active;
                AlertDialog.Builder builder2 = new AlertDialog.Builder(groupCallActivity3.getContext(), 0, null);
                builder2.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
                builder2.setTitle(LocaleController.getString(R.string.VoipGroupStopRecordingTitle));
                if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                    builder2.setMessage(LocaleController.getString(R.string.VoipChannelStopRecordingText));
                } else {
                    builder2.setMessage(LocaleController.getString(R.string.VoipGroupStopRecordingText));
                }
                builder2.setPositiveButton(LocaleController.getString(R.string.Stop), new ChatActivity$$ExternalSyntheticLambda142(this, z, 2));
                builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialogCreate2 = builder2.create();
                alertDialogCreate2.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_dialogBackground, false));
                alertDialogCreate2.show();
                alertDialogCreate2.setTextColor(Theme.getColor(null, Theme.key_voipgroup_nameText, false));
                return;
            }
            if (i == 7) {
                GroupCallActivity.this.changingPermissions = true;
                GroupCallActivity.this.everyoneItem.setVisibility(0);
                GroupCallActivity.this.adminItem.setVisibility(0);
                GroupCallActivity.this.inviteItem.setVisibility(8);
                GroupCallActivity.this.enableComments.setVisibility(8);
                GroupCallActivity.this.disableComments.setVisibility(8);
                GroupCallActivity.this.leaveItem.setVisibility(8);
                GroupCallActivity.this.permissionItem.setVisibility(8);
                GroupCallActivity.this.editTitleItem.setVisibility(8);
                GroupCallActivity.this.recordItem.setVisibility(8);
                GroupCallActivity.this.screenItem.setVisibility(8);
                GroupCallActivity.this.accountSelectCell.setVisibility(8);
                GroupCallActivity.this.soundItem.setVisibility(8);
                GroupCallActivity.this.noiseItem.setVisibility(8);
                GroupCallActivity.this.otherItem.forceUpdatePopupPosition();
                return;
            }
            if (i == 6) {
                GroupCallActivity.this.enterEventSent = false;
                final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(GroupCallActivity.this.getContext());
                editTextBoldCursor.setBackgroundDrawable(Theme.createEditTextDrawable(GroupCallActivity.this.getContext()));
                AlertDialog.Builder builder3 = new AlertDialog.Builder(GroupCallActivity.this.getContext(), 0, null);
                builder3.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
                if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                    builder3.setTitle(LocaleController.getString(R.string.VoipChannelTitle));
                } else {
                    builder3.setTitle(LocaleController.getString(R.string.VoipGroupTitle));
                }
                builder3.setCheckFocusable(false);
                builder3.setNegativeButton(LocaleController.getString(R.string.Cancel), new GroupCallActivity$6$$ExternalSyntheticLambda3(0, editTextBoldCursor));
                LinearLayout linearLayout = new LinearLayout(GroupCallActivity.this.getContext());
                linearLayout.setOrientation(1);
                builder3.setView(linearLayout);
                editTextBoldCursor.setTextSize(1, 16.0f);
                int i2 = Theme.key_voipgroup_nameText;
                editTextBoldCursor.setTextColor(Theme.getColor(null, i2, false));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(6);
                TLRPC.Chat chat = GroupCallActivity.this.currentChat;
                editTextBoldCursor.setHint(chat != null ? chat.title : "");
                editTextBoldCursor.setHintTextColor(Theme.getColor(null, Theme.key_voipgroup_lastSeenText, false));
                editTextBoldCursor.setCursorColor(Theme.getColor(null, i2, false));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, 36, 51, 24, 6, 24, 0));
                editTextBoldCursor.setOnEditorActionListener(new GroupCallActivity$6$$ExternalSyntheticLambda4(builder3, 0));
                editTextBoldCursor.addTextChangedListener(new TextWatcher() {
                    boolean ignoreTextChange;

                    @Override
                    public void afterTextChanged(Editable editable) {
                        if (!this.ignoreTextChange && editable.length() > 40) {
                            this.ignoreTextChange = true;
                            editable.delete(40, editable.length());
                            AndroidUtilities.shakeView(editTextBoldCursor);
                            try {
                                editTextBoldCursor.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            this.ignoreTextChange = false;
                        }
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                    }
                });
                if (!TextUtils.isEmpty(GroupCallActivity.this.call.call.title)) {
                    editTextBoldCursor.setText(GroupCallActivity.this.call.call.title);
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                }
                builder3.setPositiveButton(LocaleController.getString(R.string.Save), new WearAuthSheet$$ExternalSyntheticLambda5(this, editTextBoldCursor, builder3, 7));
                AlertDialog alertDialogCreate3 = builder3.create();
                alertDialogCreate3.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_inviteMembersBackground, false));
                int i3 = 0;
                alertDialogCreate3.setOnShowListener(new GroupCallActivity$6$$ExternalSyntheticLambda6(this, alertDialogCreate3, editTextBoldCursor, i3));
                alertDialogCreate3.setOnDismissListener(new GroupCallActivity$6$$ExternalSyntheticLambda7(i3, editTextBoldCursor));
                alertDialogCreate3.show();
                alertDialogCreate3.setTextColor(Theme.getColor(null, i2, false));
                editTextBoldCursor.requestFocus();
                return;
            }
            if (i == 8) {
                JoinCallAlert.open(GroupCallActivity.this.getContext(), -GroupCallActivity.this.getChatId(), GroupCallActivity.this.accountInstance, null, 2, GroupCallActivity.this.selfPeer, new GroupCallActivity$6$$ExternalSyntheticLambda1(this));
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
                ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone, arrayList2, 1, arrayList3);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String string = sharedInstance.currentBluetoothDeviceName;
                if (string == null) {
                    string = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                }
                arrayList.add(string);
                ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_voice_bluetooth, arrayList2, 2, arrayList3);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i4 = 0; i4 < size; i4++) {
                charSequenceArr[i4] = (CharSequence) arrayList.get(i4);
                iArr[i4] = ((Integer) arrayList2.get(i4)).intValue();
            }
            BottomSheet bottomSheet = new BottomSheet(this.val$context, false, false, null);
            bottomSheet.fixNavigationBar();
            bottomSheet.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
            bottomSheet.bigTitle = true;
            ArticleViewer$$ExternalSyntheticLambda1 articleViewer$$ExternalSyntheticLambda1 = new ArticleViewer$$ExternalSyntheticLambda1(3, this, arrayList3);
            bottomSheet.items = charSequenceArr;
            bottomSheet.itemIcons = iArr;
            bottomSheet.onClickListener = articleViewer$$ExternalSyntheticLambda1;
            int i5 = Theme.key_voipgroup_listViewBackgroundUnscrolled;
            bottomSheet.setBackgroundColor(Theme.getColor(null, i5, false));
            bottomSheet.fixNavigationBar(Theme.getColor(null, i5, false));
            int i6 = sharedInstance.getCurrentAudioRoute() == 1 ? 0 : sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
            bottomSheet.show();
            bottomSheet.setTitleColor(Theme.getColor(null, Theme.key_voipgroup_nameText, false));
            for (int i7 = 0; i7 < bottomSheet.getItemViews().size(); i7++) {
                BottomSheet.BottomSheetCell bottomSheetCell = bottomSheet.getItemViews().get(i7);
                if (i7 == i6) {
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
    }

    public class AvatarUpdaterDelegate implements ImageUpdater.ImageUpdaterDelegate {
        private TLRPC.FileLocation avatar;
        private TLRPC.FileLocation avatarBig;
        private final long peerId;
        private ImageLocation uploadingImageLocation;
        public float uploadingProgress;

        public void lambda$didUploadPhoto$0(TLRPC.TL_error tL_error, TLObject tLObject, String str) {
            if (this.uploadingImageLocation != null) {
                GroupCallActivity.this.avatarsViewPager.removeUploadingImage(this.uploadingImageLocation);
                this.uploadingImageLocation = null;
            }
            if (tL_error == null) {
                TLRPC.User user = GroupCallActivity.this.accountInstance.getMessagesController().getUser(Long.valueOf(GroupCallActivity.this.accountInstance.getUserConfig().getClientUserId()));
                if (user == null) {
                    user = GroupCallActivity.this.accountInstance.getUserConfig().getCurrentUser();
                    if (user == null) {
                        return;
                    } else {
                        GroupCallActivity.this.accountInstance.getMessagesController().putUser(user, false);
                    }
                } else {
                    GroupCallActivity.this.accountInstance.getUserConfig().setCurrentUser(user);
                }
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 150);
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
                TLRPC.VideoSize videoSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : tL_photos_photo.photo.video_sizes.get(0);
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                user.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                if (closestPhotoSizeWithSize != null) {
                    tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                }
                if (closestPhotoSizeWithSize2 != null) {
                    tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                }
                if (closestPhotoSizeWithSize != null && this.avatar != null) {
                    FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(this.avatar, true).renameTo(FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.avatar.volume_id);
                    sb.append("_");
                    String strM = Fragment$$ExternalSyntheticOutline0.m(this.avatar.local_id, "@50_50", sb);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(closestPhotoSizeWithSize.location.volume_id);
                    sb2.append("_");
                    ImageLoader.getInstance().replaceImageInCache(strM, Fragment$$ExternalSyntheticOutline0.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForUser(((BottomSheet) GroupCallActivity.this).currentAccount, user, 1), false);
                }
                if (closestPhotoSizeWithSize2 != null && this.avatarBig != null) {
                    FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(this.avatarBig, true).renameTo(FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
                }
                if (videoSize != null && str != null) {
                    new File(str).renameTo(FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(videoSize, "mp4", true));
                }
                GroupCallActivity.this.accountInstance.getMessagesController().getDialogPhotos(user.id).reset();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(user);
                GroupCallActivity.this.accountInstance.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                TLRPC.User user2 = GroupCallActivity.this.accountInstance.getMessagesController().getUser(Long.valueOf(this.peerId));
                ImageLocation forUser = ImageLocation.getForUser(GroupCallActivity.this.accountInstance.getCurrentAccount(), user2, 0);
                ImageLocation forUser2 = ImageLocation.getForUser(GroupCallActivity.this.accountInstance.getCurrentAccount(), user2, 1);
                if (ImageLocation.getForLocal(this.avatarBig) == null) {
                    forUser2 = ImageLocation.getForLocal(this.avatar);
                }
                GroupCallActivity.this.avatarsViewPager.setCreateThumbFromParent(false);
                GroupCallActivity.this.avatarsViewPager.initIfEmpty(null, forUser, forUser2, true);
                this.avatar = null;
                this.avatarBig = null;
                AndroidUtilities.updateVisibleRows(GroupCallActivity.this.listView);
                updateAvatarUploadingProgress(1.0f);
            }
            GroupCallActivity.this.accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
            GroupCallActivity.this.accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            GroupCallActivity.this.accountInstance.getUserConfig().saveConfig(true);
        }

        public void lambda$didUploadPhoto$1(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda5(4, this, tL_error, tLObject, str));
        }

        public void lambda$didUploadPhoto$2() {
            if (this.uploadingImageLocation != null) {
                GroupCallActivity.this.avatarsViewPager.removeUploadingImage(this.uploadingImageLocation);
                this.uploadingImageLocation = null;
            }
            TLRPC.Chat chat = GroupCallActivity.this.accountInstance.getMessagesController().getChat(Long.valueOf(-this.peerId));
            ImageLocation forChat = ImageLocation.getForChat(chat, 0);
            ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
            if (ImageLocation.getForLocal(this.avatarBig) == null) {
                forChat2 = ImageLocation.getForLocal(this.avatar);
            }
            GroupCallActivity.this.avatarsViewPager.setCreateThumbFromParent(false);
            GroupCallActivity.this.avatarsViewPager.initIfEmpty(null, forChat, forChat2, true);
            this.avatar = null;
            this.avatarBig = null;
            AndroidUtilities.updateVisibleRows(GroupCallActivity.this.listView);
            updateAvatarUploadingProgress(1.0f);
        }

        public void lambda$didUploadPhoto$3(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
            if (inputFile == null && inputFile2 == null && videoSize == null) {
                this.avatar = photoSize.location;
                TLRPC.FileLocation fileLocation = photoSize2.location;
                this.avatarBig = fileLocation;
                this.uploadingImageLocation = ImageLocation.getForLocal(fileLocation);
                GroupCallActivity.this.avatarsViewPager.addUploadingImage(this.uploadingImageLocation, ImageLocation.getForLocal(this.avatar));
                AndroidUtilities.updateVisibleRows(GroupCallActivity.this.listView);
                return;
            }
            if (this.peerId <= 0) {
                GroupCallActivity.this.accountInstance.getMessagesController().changeChatAvatar(-this.peerId, null, inputFile, inputFile2, videoSize, d, str, photoSize.location, photoSize2.location, new ChatActivity$21$$ExternalSyntheticLambda4(this, 25));
                return;
            }
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new IntroActivity$$ExternalSyntheticLambda6(5, this, str));
        }

        @Override
        public final boolean canFinishFragment() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
        }

        @Override
        public void didStartUpload(boolean z, boolean z2) {
        }

        @Override
        public final void didUploadFailed() {
            ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
        }

        @Override
        public void didUploadPhoto(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
            AndroidUtilities.runOnUIThread(new ChatEditActivity$$ExternalSyntheticLambda50(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 1));
        }

        @Override
        public final PhotoViewer.PlaceProviderObject getCloseIntoObject() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$getCloseIntoObject(this);
        }

        @Override
        public final String getInitialSearchString() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$getInitialSearchString(this);
        }

        @Override
        public void onUploadProgressChanged(float f) {
            GroupCallActivity.this.avatarsViewPager.setUploadProgress(this.uploadingImageLocation, f);
            updateAvatarUploadingProgress(f);
        }

        @Override
        public final boolean supportsBulletin() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$supportsBulletin(this);
        }

        public void updateAvatarUploadingProgress(float f) {
            this.uploadingProgress = f;
            if (GroupCallActivity.this.listView == null) {
                return;
            }
            for (int i = 0; i < GroupCallActivity.this.listView.getChildCount(); i++) {
                View childAt = GroupCallActivity.this.listView.getChildAt(i);
                if (childAt instanceof GroupCallUserCell) {
                    GroupCallUserCell groupCallUserCell = (GroupCallUserCell) childAt;
                    if (groupCallUserCell.isSelfUser()) {
                        groupCallUserCell.setUploadProgress(f, true);
                    }
                }
            }
        }

        private AvatarUpdaterDelegate(long j) {
            this.peerId = j;
        }
    }

    public static final class CallEncryptionCell extends View {
        private final CallEncryptionCellDrawable drawable;

        public static final class EncryptionCallDialog extends Dialog {
            private Bitmap blurBitmap;
            private Paint blurBitmapPaint;
            private BitmapShader blurBitmapShader;
            private final Matrix blurMatrix;
            private final CallEncryptionCell cell;
            private boolean dismissing;
            private float progress;
            private ValueAnimator progressAnimator;
            private final View windowView;

            public EncryptionCallDialog(Context context, final CallEncryptionCell callEncryptionCell) {
                super(context, R.style.TransparentDialog);
                this.blurMatrix = new Matrix();
                this.cell = callEncryptionCell;
                if (callEncryptionCell != null) {
                    callEncryptionCell.setVisibility(4);
                }
                AndroidUtilities.makeGlobalBlurBitmap(new OAuthSheet$$ExternalSyntheticLambda1(8, this, callEncryptionCell), 14.0f);
                View view = new View(context) {
                    private final int[] p = new int[2];

                    @Override
                    public void dispatchDraw(Canvas canvas) {
                        Canvas canvas2;
                        if (EncryptionCallDialog.this.progress <= 0.0f || EncryptionCallDialog.this.blurBitmapPaint == null) {
                            canvas2 = canvas;
                        } else {
                            EncryptionCallDialog.this.blurMatrix.reset();
                            float width = getWidth() / EncryptionCallDialog.this.blurBitmap.getWidth();
                            EncryptionCallDialog.this.blurMatrix.postScale(width, width);
                            EncryptionCallDialog.this.blurBitmapShader.setLocalMatrix(EncryptionCallDialog.this.blurMatrix);
                            EncryptionCallDialog.this.blurBitmapPaint.setAlpha((int) (EncryptionCallDialog.this.progress * 255.0f));
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), EncryptionCallDialog.this.blurBitmapPaint);
                        }
                        CallEncryptionCell callEncryptionCell2 = callEncryptionCell;
                        if (callEncryptionCell2 != null) {
                            if (!callEncryptionCell2.isAttachedToWindow() || callEncryptionCell.getAlpha() <= 0.5f) {
                                EncryptionCallDialog.this.dismiss();
                            } else {
                                callEncryptionCell.getLocationInWindow(this.p);
                            }
                            canvas2.save();
                            canvas2.translate(this.p[0] - ((1.0f - callEncryptionCell.getScaleX()) * callEncryptionCell.getMeasuredWidth()), this.p[1] - ((1.0f - callEncryptionCell.getScaleY()) * callEncryptionCell.getMeasuredHeight()));
                            if (callEncryptionCell.drawable.draw(canvas2, callEncryptionCell.getMeasuredWidth(), EncryptionCallDialog.this.progress)) {
                                invalidate();
                            }
                            canvas2.restore();
                        }
                    }
                };
                this.windowView = view;
                view.setOnClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(this, 13));
            }

            private void animate(final float f, final Runnable runnable) {
                ValueAnimator valueAnimator = this.progressAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.progressAnimator = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.progress, f);
                this.progressAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, 4));
                this.progressAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        EncryptionCallDialog.this.progress = f;
                        EncryptionCallDialog.this.windowView.invalidate();
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
                this.progressAnimator.setDuration(420L);
                this.progressAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.progressAnimator.start();
            }

            public void lambda$animate$5(ValueAnimator valueAnimator) {
                this.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.windowView.invalidate();
            }

            public void lambda$dismiss$3() {
                super.dismiss();
            }

            public void lambda$dismiss$4() {
                CallEncryptionCell callEncryptionCell = this.cell;
                if (callEncryptionCell != null) {
                    callEncryptionCell.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda0(this, 0), 16L);
            }

            public void lambda$new$0(CallEncryptionCell callEncryptionCell, Bitmap bitmap) {
                if (callEncryptionCell != null) {
                    callEncryptionCell.setVisibility(0);
                }
                this.blurBitmap = bitmap;
                Paint paint = new Paint(1);
                this.blurBitmapPaint = paint;
                Bitmap bitmap2 = this.blurBitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                this.blurBitmapShader = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.currentTheme.isDark() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.currentTheme.isDark() ? -0.02f : -0.04f);
                this.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }

            public void lambda$new$1(View view) {
                dismiss();
            }

            public void lambda$show$2() {
                CallEncryptionCell callEncryptionCell = this.cell;
                if (callEncryptionCell != null) {
                    callEncryptionCell.setVisibility(4);
                }
            }

            @Override
            public void dismiss() {
                if (this.dismissing) {
                    return;
                }
                this.dismissing = true;
                animate(0.0f, new GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda0(this, 1));
                try {
                    WindowManager.LayoutParams attributes = getWindow().getAttributes();
                    attributes.flags |= 16;
                    getWindow().setAttributes(attributes);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }

            @Override
            public void onCreate(Bundle bundle) {
                super.onCreate(bundle);
                Window window = getWindow();
                window.setWindowAnimations(R.style.DialogNoAnimation);
                setContentView(this.windowView, new ViewGroup.LayoutParams(-1, -1));
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                attributes.height = -1;
                attributes.gravity = 119;
                attributes.dimAmount = 0.0f;
                int i = attributes.flags & (-3);
                attributes.softInputMode = 48;
                attributes.flags = (-2013069056) | i;
                if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                    attributes.flags = i | (-2013060864);
                    AndroidUtilities.logFlagSecure();
                }
                attributes.flags |= 1152;
                if (Build.VERSION.SDK_INT >= 28) {
                    attributes.layoutInDisplayCutoutMode = 1;
                }
                window.setAttributes(attributes);
            }

            @Override
            public void show() {
                super.show();
                animate(1.0f, null);
                AndroidUtilities.runOnUIThread(new GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda0(this, 2), 16L);
            }
        }

        public CallEncryptionCell(Context context, CallEncryptionCellDrawable callEncryptionCellDrawable) {
            super(context);
            this.drawable = callEncryptionCellDrawable;
            NotificationCenter.listenEmojiLoading(this);
            setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(4, this, context));
        }

        public void lambda$new$0(Context context, View view) {
            new EncryptionCallDialog(context, this).show();
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            CallEncryptionCellDrawable callEncryptionCellDrawable = this.drawable;
            if (callEncryptionCellDrawable == null || !callEncryptionCellDrawable.draw(canvas, getMeasuredWidth(), 0.0f)) {
                return;
            }
            invalidate();
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            CallEncryptionCellDrawable callEncryptionCellDrawable = this.drawable;
            if (callEncryptionCellDrawable != null) {
                callEncryptionCellDrawable.setParentView(this);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            CallEncryptionCellDrawable callEncryptionCellDrawable = this.drawable;
            if (callEncryptionCellDrawable != null) {
                callEncryptionCellDrawable.resetParentView(this);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(38.0f));
        }
    }

    public static final class CallEncryptionCellDrawable {
        private final Text closeText;
        private int listBackgroundColor;
        private View parentView;
        private final Text text1;
        private final Text text2;
        private final Paint backgroundPaint = new Paint(1);
        private final Paint dividerPaint = new Paint(1);
        private final EmojiSlot[] slots = new EmojiSlot[4];
        private boolean loading = true;
        private final AnimatedFloat loadingAlpha = new AnimatedFloat(new IntroActivity$$ExternalSyntheticLambda5(this, 27), 0, 320, CubicBezierInterpolator.EASE_OUT_QUINT);
        private final RectF fromRect = new RectF();
        private final RectF toRect = new RectF();
        private final Path clipPath = new Path();

        public CallEncryptionCellDrawable(Context context) {
            int i = 0;
            while (true) {
                EmojiSlot[] emojiSlotArr = this.slots;
                if (i >= emojiSlotArr.length) {
                    this.backgroundPaint.setColor(Theme.getColor(null, Theme.key_voipgroup_listViewBackground, false));
                    this.text1 = new Text(LocaleController.getString(R.string.ConferenceEncrypted), 12.0f, AndroidUtilities.bold());
                    this.text2 = new Text(LocaleController.getString(R.string.ConferenceEncryptedInfo), 11.0f).multiline(99).setMaxWidth(AndroidUtilities.dp(200.0f)).lineSpacing(AndroidUtilities.dp(2.66f));
                    this.closeText = new Text(LocaleController.getString(R.string.ConferenceEncryptedClose), 14.0f, AndroidUtilities.bold());
                    setEmojis(null);
                    return;
                }
                emojiSlotArr[i] = new EmojiSlot(i);
                i++;
            }
        }

        public void invalidate() {
            View view = this.parentView;
            if (view != null) {
                view.invalidate();
            }
        }

        public void setPaintBackgroundColor(int i) {
            this.listBackgroundColor = i;
            invalidate();
        }

        public boolean draw(Canvas canvas, float f, float f2) {
            canvas.save();
            this.text1.ellipsize(f - AndroidUtilities.dp(132.0f));
            this.backgroundPaint.setColor(ColorUtils.blendARGB(f2, this.listBackgroundColor, Theme.getColor(null, Theme.key_voipgroup_listViewBackground, false)));
            float f3 = this.loadingAlpha.set(this.loading);
            float width = this.text1.getWidth() + AndroidUtilities.dp(86.0f) + AndroidUtilities.dp(14.0f);
            float fDp = AndroidUtilities.dp(28.0f);
            float fDp2 = AndroidUtilities.dp(232.0f);
            float height = this.text2.getHeight() + AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(50.0f);
            float fLerp = AndroidUtilities.lerp(width, fDp2, f2);
            float fLerp2 = AndroidUtilities.lerp(fDp, height, f2);
            float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), f2);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((f - fLerp) / 2.0f, 0.0f, (f + fLerp) / 2.0f, fLerp2);
            canvas.drawRoundRect(rectF, fLerp3, fLerp3, this.backgroundPaint);
            this.clipPath.rewind();
            this.clipPath.addRoundRect(rectF, fLerp3, fLerp3, Path.Direction.CW);
            canvas.clipPath(this.clipPath);
            int iDp = AndroidUtilities.dp(18.0f);
            int iDp2 = (int) ((fDp2 - AndroidUtilities.dp(32.0f)) / 4.0f);
            int iDp3 = AndroidUtilities.dp(30.0f);
            int i = iDp / 2;
            int iCenterY = ((int) rectF.centerY()) - i;
            float f4 = iDp / 2.0f;
            float f5 = iCenterY;
            float fCenterY = ((int) rectF.centerY()) + i;
            this.fromRect.set((AndroidUtilities.dp(10.0f) + (AndroidUtilities.dp(7.0f) + ((int) rectF.left))) - f4, f5, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(7.0f) + ((int) rectF.left) + f4, fCenterY);
            float f6 = f / 2.0f;
            float f7 = f6 - (iDp2 * 2);
            float f8 = iDp2;
            float f9 = (int) ((0.5f * f8) + f7);
            float f10 = iDp3 / 2.0f;
            this.toRect.set(f9 - f10, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f10), f9 + f10, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f10));
            RectF rectF2 = this.fromRect;
            RectF rectF3 = this.toRect;
            AndroidUtilities.lerpCentered(rectF2, rectF3, f2, rectF3);
            boolean zDraw = this.slots[0].draw(canvas, this.toRect, f2);
            this.fromRect.set((AndroidUtilities.dp(10.0f) + (AndroidUtilities.dp(27.0f) + ((int) rectF.left))) - f4, f5, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(27.0f) + ((int) rectF.left) + f4, fCenterY);
            float f11 = (int) ((1.5f * f8) + f7);
            boolean z = zDraw;
            this.toRect.set(f11 - f10, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f10), f11 + f10, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f10));
            RectF rectF4 = this.fromRect;
            RectF rectF5 = this.toRect;
            AndroidUtilities.lerpCentered(rectF4, rectF5, f2, rectF5);
            if (this.slots[1].draw(canvas, this.toRect, f2)) {
                z = true;
            }
            Text text = this.text1;
            text.draw(canvas, f6 - (text.getWidth() / 2.0f), fDp / 2.0f, -1, AndroidUtilities.lerp(1.0f, 0.75f, f3) * (1.0f - f2));
            this.fromRect.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f))) - f4, f5, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f)) + f4, fCenterY);
            float f12 = (int) ((2.5f * f8) + f7);
            this.toRect.set(f12 - f10, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f10), f12 + f10, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f10));
            RectF rectF6 = this.fromRect;
            RectF rectF7 = this.toRect;
            AndroidUtilities.lerpCentered(rectF6, rectF7, f2, rectF7);
            if (this.slots[2].draw(canvas, this.toRect, f2)) {
                z = true;
            }
            this.fromRect.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f))) - f4, f5, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f)) + f4, fCenterY);
            float f13 = (int) ((f8 * 3.5f) + f7);
            this.toRect.set(f13 - f10, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f10), f13 + f10, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f10));
            RectF rectF8 = this.fromRect;
            RectF rectF9 = this.toRect;
            AndroidUtilities.lerpCentered(rectF8, rectF9, f2, rectF9);
            boolean z2 = this.slots[3].draw(canvas, this.toRect, f2) ? true : z;
            if (f2 > 0.0f) {
                this.text2.draw(canvas, (rectF.centerX() - (fDp2 / 2.0f)) + AndroidUtilities.dp(16.0f), AndroidUtilities.dp(54.0f), -1, f2);
                this.dividerPaint.setColor(-16777216);
                this.dividerPaint.setAlpha((int) (255.0f * f2));
                canvas.drawRect(rectF.left, height - AndroidUtilities.dp(40.0f), rectF.right, AndroidUtilities.dp(0.66f) + (height - AndroidUtilities.dp(40.0f)), this.dividerPaint);
                this.closeText.draw(canvas, rectF.centerX() - (this.closeText.getWidth() / 2.0f), height - AndroidUtilities.dp(20.0f), -1, f2);
            }
            canvas.restore();
            return z2;
        }

        public void resetParentView(View view) {
            if (this.parentView == view) {
                return;
            }
            int i = 0;
            while (true) {
                EmojiSlot[] emojiSlotArr = this.slots;
                if (i >= emojiSlotArr.length) {
                    this.parentView = null;
                    return;
                } else {
                    emojiSlotArr[i].detach(view);
                    i++;
                }
            }
        }

        public void setEmojis(String[] strArr) {
            this.loading = strArr == null;
            for (int i = 0; i < 4; i++) {
                this.slots[i].set(strArr == null ? null : strArr[i]);
            }
            invalidate();
        }

        public void setParentView(View view) {
            this.parentView = view;
            int i = 0;
            while (true) {
                EmojiSlot[] emojiSlotArr = this.slots;
                if (i >= emojiSlotArr.length) {
                    return;
                }
                emojiSlotArr[i].attach(view);
                i++;
            }
        }
    }

    public static final class EmojiSlot {
        private String lastEmoji;
        private boolean loaded;
        private final int offset;
        private AnimatedEmojiDrawable real;
        private boolean realAllowed;
        private Drawable realThumb;
        private long startTime;
        private final long INTERVAL = 180;
        private final Drawable[] pool = new Drawable[6];
        private GradientClip clip = new GradientClip();
        private final HashSet<View> parents = new HashSet<>();
        private boolean attached = false;
        private final AnimatedEmojiSpan.InvalidateHolder invalidate = new GroupCallActivity$EmojiSlot$$ExternalSyntheticLambda1(this, 0);
        private final RectF rectF = new RectF();

        public EmojiSlot(int i) {
            int i2 = 0;
            this.offset = i;
            while (true) {
                Drawable[] drawableArr = this.pool;
                if (i2 >= drawableArr.length) {
                    this.startTime = System.currentTimeMillis();
                    return;
                } else {
                    drawableArr[i2] = Emoji.getEmojiDrawable(GroupCallActivity.getRandomEmoji());
                    i2++;
                }
            }
        }

        private void checkAttach() {
            boolean zIsEmpty = this.parents.isEmpty();
            boolean z = !zIsEmpty;
            if (this.attached != z) {
                this.attached = z;
                if (zIsEmpty) {
                    onDetached();
                } else {
                    onAttached();
                }
            }
        }

        public void lambda$new$0() {
            Iterator<View> it = this.parents.iterator();
            while (it.hasNext()) {
                it.next().invalidate();
            }
        }

        public void lambda$updateEmoji$1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
            updateEmoji();
        }

        private void onAttached() {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.real;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(this.invalidate);
            }
        }

        private void onDetached() {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.real;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(this.invalidate);
            }
        }

        private void shiftPool() {
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.pool;
                if (i >= drawableArr.length - 1) {
                    drawableArr[drawableArr.length - 1] = Emoji.getEmojiDrawable(GroupCallActivity.getRandomEmoji());
                    return;
                } else {
                    int i2 = i + 1;
                    drawableArr[i] = drawableArr[i2];
                    i = i2;
                }
            }
        }

        private void updateEmoji() {
            TLRPC.Document document;
            if (this.real == null || this.lastEmoji == null) {
                return;
            }
            int productionAccount = UserConfig.getProductionAccount();
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            MediaDataController mediaDataController = MediaDataController.getInstance(productionAccount);
            int i = 0;
            TLRPC.TL_messages_stickerSet stickerSet = mediaDataController.getStickerSet(tL_inputStickerSetShortName, 0, false, true, new PollItemMenu$$ExternalSyntheticLambda15(this, 9));
            if (stickerSet == null) {
                return;
            }
            String strReplace = this.lastEmoji.replace("️", "");
            ArrayList<TLRPC.Document> arrayList = stickerSet.documents;
            int size = arrayList.size();
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
                this.real.setupDocument(document);
                return;
            }
            FileLog.e("emoji \"" + this.lastEmoji + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
        }

        public void attach(View view) {
            this.parents.add(view);
            checkAttach();
        }

        public void detach(View view) {
            this.parents.remove(view);
            checkAttach();
        }

        public boolean draw(Canvas canvas, RectF rectF, float f) {
            float f2;
            float f3;
            float fDp = AndroidUtilities.dp(6.0f);
            this.rectF.set(rectF);
            float f4 = -fDp;
            this.rectF.inset(f4, f4);
            RectF rectF2 = this.rectF;
            canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 255, 31);
            long jCurrentTimeMillis = (((long) this.offset) * 45) + System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.startTime;
            float f5 = j / 180.0f;
            float fMin = Math.min(1.0f, f5);
            boolean z = false;
            if (!this.loaded || this.real == null || this.realThumb == null || !this.realAllowed) {
                canvas.save();
                this.rectF.set(rectF);
                this.rectF.offset(0.0f, (rectF.height() + fDp) * (fMin - 1.0f));
                RectF rectF3 = this.rectF;
                canvas.translate(rectF3.left, rectF3.top);
                this.pool[1].setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
                this.pool[1].setAlpha(127);
                this.pool[1].draw(canvas);
                this.pool[1].setAlpha(255);
                canvas.restore();
            } else {
                this.rectF.set(rectF);
                this.rectF.offset(0.0f, (rectF.height() + fDp) * (fMin - 1.0f));
                if (f < 1.0f) {
                    canvas.save();
                    f2 = 255.0f;
                    f3 = 0.0f;
                    this.realThumb.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
                    RectF rectF4 = this.rectF;
                    canvas.translate(rectF4.left, rectF4.top);
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
                    this.rectF.inset(AndroidUtilities.dp(-4.0f), AndroidUtilities.dp(-4.0f));
                    this.real.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
                    RectF rectF5 = this.rectF;
                    canvas.translate(rectF5.left, rectF5.top);
                    this.real.setAlpha((int) (f * f2));
                    this.real.draw(canvas);
                    this.real.setAlpha(255);
                    canvas.restore();
                }
            }
            this.rectF.set(rectF);
            this.rectF.offset(0.0f, (rectF.height() + fDp) * fMin);
            canvas.save();
            RectF rectF6 = this.rectF;
            canvas.translate(rectF6.left, rectF6.top);
            this.pool[0].setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            this.pool[0].setAlpha(127);
            this.pool[0].draw(canvas);
            this.pool[0].setAlpha(255);
            canvas.restore();
            if (f5 >= 1.0f) {
                if (this.loaded && this.realAllowed) {
                    z = true;
                } else {
                    this.startTime = jCurrentTimeMillis - (j % 180);
                    shiftPool();
                    if (this.loaded) {
                        this.realAllowed = true;
                    }
                }
            }
            this.rectF.set(rectF);
            float f6 = (int) f4;
            this.rectF.inset(f6, f6);
            RectF rectF7 = this.rectF;
            float f7 = rectF7.left;
            float f8 = rectF7.top;
            rectF7.set(f7, f8, rectF7.right, f8 + fDp);
            this.clip.draw(canvas, this.rectF, 1, 1.0f);
            this.rectF.set(rectF);
            this.rectF.inset(f6, f6);
            RectF rectF8 = this.rectF;
            float f9 = rectF8.left;
            float f10 = rectF8.bottom;
            rectF8.set(f9, f10 - fDp, rectF8.right, f10);
            this.clip.draw(canvas, this.rectF, 3, 1.0f);
            canvas.restore();
            return !z;
        }

        public void set(String str) {
            boolean z = this.loaded;
            this.loaded = str != null;
            if (str != null && (this.real == null || !TextUtils.equals(this.lastEmoji, str))) {
                AnimatedEmojiDrawable animatedEmojiDrawable = this.real;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.removeView(this.invalidate);
                }
                this.realThumb = Emoji.getEmojiDrawable(str);
                AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(21, UserConfig.getProductionAccount());
                this.real = animatedEmojiDrawable2;
                this.lastEmoji = str;
                animatedEmojiDrawable2.setupEmojiThumb(str);
                updateEmoji();
                if (this.attached) {
                    this.real.addView(this.invalidate);
                }
            }
            if (!this.loaded || z) {
                return;
            }
            this.realAllowed = false;
        }
    }

    public class GroupCallItemAnimator extends DefaultItemAnimator {
        HashSet<RecyclerView.ViewHolder> addingHolders;
        public float animationProgress;
        public ValueAnimator animator;
        float outMaxBottom;
        float outMinTop;
        HashSet<RecyclerView.ViewHolder> removingHolders;

        private GroupCallItemAnimator() {
            this.addingHolders = new HashSet<>();
            this.removingHolders = new HashSet<>();
        }

        public void lambda$runPendingAnimations$0(ValueAnimator valueAnimator) {
            this.animationProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            GroupCallActivity.this.listView.invalidate();
            GroupCallActivity.this.renderersContainer.invalidate();
            ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            GroupCallActivity.this.updateLayout(true);
        }

        @Override
        public void endAnimations() {
            super.endAnimations();
            this.removingHolders.clear();
            this.addingHolders.clear();
            this.outMinTop = Float.MAX_VALUE;
            GroupCallActivity.this.listView.invalidate();
        }

        @Override
        public void runPendingAnimations() {
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
                valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, 5));
                this.animator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        GroupCallItemAnimator groupCallItemAnimator = GroupCallItemAnimator.this;
                        groupCallItemAnimator.animator = null;
                        GroupCallActivity.this.listView.invalidate();
                        GroupCallActivity.this.renderersContainer.invalidate();
                        ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                        GroupCallActivity.this.updateLayout(true);
                        GroupCallItemAnimator.this.addingHolders.clear();
                        GroupCallItemAnimator.this.removingHolders.clear();
                    }
                });
                this.animator.setDuration(350L);
                this.animator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animator.start();
                GroupCallActivity.this.listView.invalidate();
                GroupCallActivity.this.renderersContainer.invalidate();
            }
            super.runPendingAnimations();
        }

        public void updateBackgroundBeforeAnimation() {
            if (this.animator != null) {
                return;
            }
            this.addingHolders.clear();
            this.addingHolders.addAll(this.mPendingAdditions);
            this.removingHolders.clear();
            this.removingHolders.addAll(this.mPendingRemovals);
            this.outMaxBottom = 0.0f;
            this.outMinTop = Float.MAX_VALUE;
            if (this.addingHolders.isEmpty() && this.removingHolders.isEmpty()) {
                return;
            }
            int childCount = GroupCallActivity.this.listView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = GroupCallActivity.this.listView.getChildAt(i);
                RecyclerView.ViewHolder viewHolderFindContainingViewHolder = GroupCallActivity.this.listView.findContainingViewHolder(childAt);
                if (viewHolderFindContainingViewHolder != null && viewHolderFindContainingViewHolder.getItemViewType() != 3 && viewHolderFindContainingViewHolder.getItemViewType() != 4 && viewHolderFindContainingViewHolder.getItemViewType() != 5 && viewHolderFindContainingViewHolder.getItemViewType() != 7 && !this.addingHolders.contains(viewHolderFindContainingViewHolder)) {
                    this.outMaxBottom = Math.max(this.outMaxBottom, childAt.getY() + childAt.getMeasuredHeight());
                    this.outMinTop = Math.min(this.outMinTop, Math.max(0.0f, childAt.getY()));
                }
            }
            this.animationProgress = 0.0f;
            GroupCallActivity.this.listView.invalidate();
        }
    }

    public class LightningView extends View {
        private int[] currentColors;
        private final Paint paint;
        private int parentBackgroundColor;
        private float shadowOffset;

        public LightningView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setStyle(Paint.Style.FILL);
            paint.setAlpha(0);
        }

        @Override
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (!GroupCallActivity.this.needTextureLightning || GroupCallActivity.this.renderersContainer.progressToFullscreenMode >= 0.1d) {
                return;
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.paint);
        }

        public void setNewColors(int[] iArr) {
            int[] iArr2 = this.currentColors;
            boolean z = true;
            boolean z2 = false;
            if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
                if (iArr2 == null) {
                    this.paint.setAlpha(255);
                }
                this.currentColors = iArr;
                if (GroupCallActivity.this.liveLabelBgColorAnimator != null && GroupCallActivity.this.textureLightningViewAnimatingAlpha != 1.0f) {
                    int[] iArr3 = this.currentColors;
                    iArr3[0] = ColorUtils.setAlphaComponent(iArr3[0], (int) (GroupCallActivity.this.textureLightningViewAnimatingAlpha * 255.0f));
                    int[] iArr4 = this.currentColors;
                    iArr4[1] = ColorUtils.setAlphaComponent(iArr4[1], (int) (GroupCallActivity.this.textureLightningViewAnimatingAlpha * 255.0f));
                }
                this.paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, GroupCallActivity.this.textureLightningView.getMeasuredHeight(), this.currentColors, (float[]) null, Shader.TileMode.CLAMP));
                z2 = true;
            }
            if (this.parentBackgroundColor != GroupCallActivity.this.backgroundColor) {
                this.paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.shadowOffset, GroupCallActivity.this.backgroundColor);
                this.parentBackgroundColor = GroupCallActivity.this.backgroundColor;
            } else {
                z = z2;
            }
            if (z) {
                invalidate();
            }
            GroupCallActivity.this.runUpdateTextureLightningRunnable();
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

    public static class RecordCallDrawable extends Drawable {
        private long lastUpdateTime;
        private View parentView;
        private boolean recording;
        private int state;
        private Paint paint = new Paint(1);
        private Paint paint2 = new Paint(1);
        private float alpha = 1.0f;

        public RecordCallDrawable() {
            this.paint.setColor(-1);
            this.paint.setStyle(Paint.Style.STROKE);
            this.paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        }

        @Override
        public void draw(Canvas canvas) {
            float fCenterX = getBounds().centerX();
            float fCenterY = getBounds().centerY();
            canvas.drawCircle(fCenterX, fCenterY, AndroidUtilities.dp(10.0f), this.paint);
            this.paint2.setColor(this.recording ? -1147527 : -1);
            this.paint2.setAlpha((int) (this.alpha * 255.0f));
            canvas.drawCircle(fCenterX, fCenterY, AndroidUtilities.dp(5.0f), this.paint2);
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
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        public boolean isRecording() {
            return this.recording;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public void setParentView(View view) {
            this.parentView = view;
        }

        public void setRecording(boolean z) {
            this.recording = z;
            this.alpha = 1.0f;
            invalidateSelf();
        }
    }

    public static class SmallRecordCallDrawable extends Drawable {
        private long lastUpdateTime;
        private View parentView;
        private int state;
        private Paint paint2 = new Paint(1);
        private float alpha = 1.0f;

        public SmallRecordCallDrawable(View view) {
            this.parentView = view;
        }

        @Override
        public void draw(Canvas canvas) {
            int iDp;
            int iCenterX = getBounds().centerX();
            int iCenterY = getBounds().centerY();
            if (this.parentView instanceof SimpleTextView) {
                iDp = AndroidUtilities.dp(1.0f) + iCenterY;
                iCenterX -= AndroidUtilities.dp(3.0f);
            } else {
                iDp = AndroidUtilities.dp(2.0f) + iCenterY;
            }
            this.paint2.setColor(-1147527);
            this.paint2.setAlpha((int) (this.alpha * 255.0f));
            canvas.drawCircle(iCenterX, iDp, AndroidUtilities.dp(4.0f), this.paint2);
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

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public static class UpdateCallback implements ListUpdateCallback {
        final RecyclerView.Adapter adapter;

        @Override
        public void onChanged(int i, int i2, Object obj) {
            this.adapter.notifyItemRangeChanged(i, i2, obj);
        }

        @Override
        public void onInserted(int i, int i2) {
            this.adapter.notifyItemRangeInserted(i, i2);
        }

        @Override
        public void onMoved(int i, int i2) {
            this.adapter.notifyItemMoved(i, i2);
        }

        @Override
        public void onRemoved(int i, int i2) {
            this.adapter.notifyItemRangeRemoved(i, i2);
        }

        private UpdateCallback(RecyclerView.Adapter adapter) {
            this.adapter = adapter;
        }
    }

    public class VolumeSlider extends FrameLayout {
        private boolean captured;
        private float colorChangeProgress;
        private int currentColor;
        private TLRPC.GroupCallParticipant currentParticipant;
        private double currentProgress;
        private boolean dragging;
        private RLottieImageView imageView;
        private long lastUpdateTime;
        private int oldColor;
        private Paint paint;
        private Paint paint2;
        private Path path;
        private float[] radii;
        private RectF rect;
        private RLottieDrawable speakerDrawable;
        private float sx;
        private float sy;
        private TextView textView;
        private int thumbX;
        private float[] volumeAlphas;

        public VolumeSlider(Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
            super(context);
            this.paint = new Paint(1);
            this.paint2 = new Paint(1);
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
            this.speakerDrawable = new RLottieDrawable(i, Fragment$$ExternalSyntheticOutline0.m(i, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.setAnimation(this.speakerDrawable);
            this.imageView.setTag(this.currentProgress == 0.0d ? 1 : null);
            addView(this.imageView, LayoutHelper.createFrame(-2, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, 0.0f, 0.0f, 0.0f, 0.0f));
            this.speakerDrawable.setCustomEndFrame(this.currentProgress == 0.0d ? 17 : 34);
            RLottieDrawable rLottieDrawable = this.speakerDrawable;
            rLottieDrawable.setCurrentFrame(rLottieDrawable.getCustomEndFrame() - 1, false, true);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setLines(1);
            this.textView.setSingleLine(true);
            this.textView.setGravity(3);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_actionBarItems, false));
            this.textView.setTextSize(1, 16.0f);
            double participantVolume = ((double) ChatObject.getParticipantVolume(this.currentParticipant)) / 100.0d;
            TextView textView2 = this.textView;
            Locale locale = Locale.US;
            textView2.setText(((int) (participantVolume > 0.0d ? Math.max(participantVolume, 1.0d) : 0.0d)) + "%");
            this.textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(43.0f) : 0, 0);
            addView(this.textView, LayoutHelper.createFrame(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
            this.paint2.setStyle(Paint.Style.STROKE);
            this.paint2.setStrokeWidth(AndroidUtilities.dp(1.5f));
            this.paint2.setStrokeCap(Paint.Cap.ROUND);
            this.paint2.setColor(-1);
            int participantVolume2 = (int) (((double) ChatObject.getParticipantVolume(this.currentParticipant)) / 100.0d);
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

        private void onSeekBarDrag(double d, boolean z) {
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
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            TLRPC.GroupCallParticipant groupCallParticipant2 = this.currentParticipant;
            sharedInstance.setParticipantVolume(groupCallParticipant2, groupCallParticipant2.volume);
            if (z) {
                long peerId = MessageObject.getPeerId(this.currentParticipant.peer);
                TLObject user = peerId > 0 ? GroupCallActivity.this.accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : GroupCallActivity.this.accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                if (this.currentParticipant.volume == 0) {
                    if (GroupCallActivity.this.scrimPopupWindow != null) {
                        GroupCallActivity.this.scrimPopupWindow.dismiss();
                        GroupCallActivity.this.scrimPopupWindow = null;
                    }
                    GroupCallActivity.this.dismissAvatarPreview(true);
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    groupCallActivity.processSelectedOption(this.currentParticipant, peerId, groupCallActivity.canManageCall() ? 0 : 5);
                } else {
                    VoIPService.getSharedInstance().editCallMember(user, null, null, Integer.valueOf(this.currentParticipant.volume), null, null);
                }
            }
            Integer num = this.currentProgress == 0.0d ? 1 : null;
            if ((this.imageView.getTag() != null || num == null) && (this.imageView.getTag() == null || num != null)) {
                return;
            }
            this.speakerDrawable.setCustomEndFrame(this.currentProgress == 0.0d ? 17 : 34);
            this.speakerDrawable.setCurrentFrame(this.currentProgress != 0.0d ? 17 : 0);
            this.speakerDrawable.start();
            this.imageView.setTag(num);
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i;
            float fDp;
            int i2;
            int i3 = this.currentColor;
            double d = this.currentProgress;
            if (d < 0.25d) {
                this.currentColor = -3385513;
            } else if (d > 0.25d && d < 0.5d) {
                this.currentColor = -3562181;
            } else if (d < 0.5d || d > 0.75d) {
                this.currentColor = -11688225;
            } else {
                this.currentColor = -11027349;
            }
            float f = 1.0f;
            if (i3 == 0) {
                i = this.currentColor;
                this.colorChangeProgress = 1.0f;
            } else {
                int offsetColor = AndroidUtilities.getOffsetColor(this.oldColor, i3, this.colorChangeProgress, 1.0f);
                if (i3 != this.currentColor) {
                    this.colorChangeProgress = 0.0f;
                    this.oldColor = offsetColor;
                }
                i = offsetColor;
            }
            this.paint.setColor(i);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.lastUpdateTime;
            if (j > 17) {
                j = 17;
            }
            this.lastUpdateTime = jElapsedRealtime;
            float f2 = this.colorChangeProgress;
            if (f2 < 1.0f) {
                float f3 = (j / 200.0f) + f2;
                this.colorChangeProgress = f3;
                if (f3 > 1.0f) {
                    this.colorChangeProgress = 1.0f;
                } else {
                    invalidate();
                }
            }
            this.path.reset();
            float[] fArr = this.radii;
            float f4 = 6.0f;
            float fDp2 = AndroidUtilities.dp(6.0f);
            fArr[7] = fDp2;
            fArr[6] = fDp2;
            int i4 = 1;
            fArr[1] = fDp2;
            fArr[0] = fDp2;
            float fMax = this.thumbX < AndroidUtilities.dp(12.0f) ? Math.max(0.0f, (this.thumbX - AndroidUtilities.dp(6.0f)) / AndroidUtilities.dp(6.0f)) : 1.0f;
            float[] fArr2 = this.radii;
            float fDp3 = AndroidUtilities.dp(6.0f) * fMax;
            fArr2[5] = fDp3;
            fArr2[4] = fDp3;
            fArr2[3] = fDp3;
            fArr2[2] = fDp3;
            this.rect.set(0.0f, 0.0f, this.thumbX, getMeasuredHeight());
            this.path.addRoundRect(this.rect, this.radii, Path.Direction.CW);
            this.path.close();
            Canvas canvas2 = canvas;
            canvas2.drawPath(this.path, this.paint);
            int participantVolume = (int) (((double) ChatObject.getParticipantVolume(this.currentParticipant)) / 100.0d);
            int iDp = AndroidUtilities.dp(5.0f) + (this.imageView.getMeasuredWidth() / 2) + this.imageView.getLeft();
            int measuredHeight = (this.imageView.getMeasuredHeight() / 2) + this.imageView.getTop();
            int i5 = 0;
            while (i5 < this.volumeAlphas.length) {
                if (i5 == 0) {
                    fDp = AndroidUtilities.dp(f4);
                    i2 = 0;
                } else if (i5 == i4) {
                    fDp = AndroidUtilities.dp(10.0f);
                    i2 = 50;
                } else {
                    fDp = AndroidUtilities.dp(14.0f);
                    i2 = 150;
                }
                float fDp4 = AndroidUtilities.dp(2.0f);
                float f5 = this.volumeAlphas[i5];
                float f6 = (f - f5) * fDp4;
                this.paint2.setAlpha((int) (f5 * 255.0f));
                float f7 = iDp;
                float f8 = measuredHeight;
                this.rect.set((f7 - fDp) + f6, (f8 - fDp) + f6, (f7 + fDp) - f6, (f8 + fDp) - f6);
                int i6 = i5;
                int i7 = i2;
                canvas2.drawArc(this.rect, -50.0f, 100.0f, false, this.paint2);
                if (participantVolume > i7) {
                    float[] fArr3 = this.volumeAlphas;
                    float f9 = fArr3[i6];
                    if (f9 < 1.0f) {
                        float f10 = (j / 180.0f) + f9;
                        fArr3[i6] = f10;
                        if (f10 > 1.0f) {
                            fArr3[i6] = 1.0f;
                        }
                        invalidate();
                    }
                } else {
                    float[] fArr4 = this.volumeAlphas;
                    float f11 = fArr4[i6];
                    if (f11 > 0.0f) {
                        float f12 = f11 - (j / 180.0f);
                        fArr4[i6] = f12;
                        if (f12 < 0.0f) {
                            fArr4[i6] = 0.0f;
                        }
                        invalidate();
                    }
                }
                i5 = i6 + 1;
                canvas2 = canvas;
                f = 1.0f;
                f4 = 6.0f;
                i4 = 1;
            }
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return onTouch(motionEvent);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
            this.thumbX = (int) (((double) View.MeasureSpec.getSize(i)) * this.currentProgress);
        }

        public boolean onTouch(MotionEvent motionEvent) {
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
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return onTouch(motionEvent);
        }
    }

    public class WatchersView extends LinearLayout {
        private float lastWidth;
        private final AnimatedTextView watchersCountTextView;

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
            zzkb.m(14.0f, 1, textView);
            textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
            addView(animatedTextView, LayoutHelper.createLinear(-1, 46));
            addView(textView, LayoutHelper.createLinear(-2, -2));
        }

        public void setWatchersCount(int i) {
            String number = LocaleController.formatNumber(i, ',');
            float fMeasureText = this.watchersCountTextView.getPaint().measureText((CharSequence) number, 0, number.length());
            if (this.lastWidth != fMeasureText) {
                this.watchersCountTextView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, fMeasureText, 0.0f, new int[]{GroupCallActivity.this.getThemedColor(Theme.key_premiumGradient1), GroupCallActivity.this.getThemedColor(Theme.key_premiumGradient3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                this.lastWidth = fMeasureText;
            }
            this.watchersCountTextView.setText(number);
        }
    }

    public static class WeavingState {
        public int currentState;
        private float duration;
        public Shader shader;
        private float startX;
        private float startY;
        private float time;
        private float targetX = -1.0f;
        private float targetY = -1.0f;
        private final Matrix matrix = new Matrix();

        public WeavingState(int i) {
            this.currentState = i;
        }

        private void setTarget() {
            if (GroupCallActivity.isGradientState(this.currentState)) {
                this.targetX = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Utilities.random.nextInt(100), 0.2f, 100.0f, 0.85f);
                this.targetY = 1.0f;
            } else if (this.currentState == 1) {
                this.targetX = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.2f);
                this.targetY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
            } else {
                this.targetX = zzir.m(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
                this.targetY = Utilities.random.nextInt(100) / 100.0f;
            }
        }

        public void update(int i, int i2, int i3, long j, float f) {
            float f2;
            if (this.shader == null) {
                return;
            }
            float f3 = this.duration;
            if (f3 == 0.0f || this.time >= f3) {
                this.duration = Utilities.random.nextInt(200) + 1500;
                this.time = 0.0f;
                if (this.targetX == -1.0f) {
                    setTarget();
                }
                this.startX = this.targetX;
                this.startY = this.targetY;
                setTarget();
            }
            float f4 = j;
            float f5 = (BlobDrawable.GRADIENT_SPEED_MAX * 2.0f * f4 * f) + ((BlobDrawable.GRADIENT_SPEED_MIN + 0.5f) * f4) + this.time;
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
            if (GroupCallActivity.isGradientState(this.currentState)) {
                f2 = 1.0f;
            } else {
                f2 = this.currentState == 1 ? 4.0f : 2.5f;
            }
            float fDp = (AndroidUtilities.dp(122.0f) / 400.0f) * f2;
            this.matrix.reset();
            this.matrix.postTranslate(f9, f11);
            this.matrix.postScale(fDp, fDp, f9 + 200.0f, f11 + 200.0f);
            this.shader.setLocalMatrix(this.matrix);
        }
    }

    private GroupCallActivity(final Activity activity, final AccountInstance accountInstance, ChatObject.Call call, final TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z, String str) {
        int i;
        final Activity activity2;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        super(activity, true, true, null);
        int i2 = 1;
        this.callMessageEnterContainerBgPaint = new Paint(1);
        this.undoView = new UndoView[2];
        this.visibleVideoParticipants = new ArrayList<>();
        this.rect = new RectF();
        this.listViewBackgroundPaint = new Paint(1);
        this.oldParticipants = new ArrayList<>();
        this.oldVideoParticipants = new ArrayList<>();
        this.oldInvited = new ArrayList<>();
        this.oldShadyJoin = new ArrayList<>();
        this.oldShadyLeft = new ArrayList<>();
        this.windowInsetsStateHolder = new WindowInsetsStateHolder(new GroupCallActivity$$ExternalSyntheticLambda28(this, 2));
        this.muteButtonState = 0;
        this.animatingToFullscreenExpand = false;
        this.paint = new Paint(7);
        this.paintTmp = new Paint(7);
        this.states = new WeavingState[8];
        this.switchProgress = 1.0f;
        this.invalidateColors = true;
        this.colorsTmp = new int[4];
        this.attachedRenderers = new ArrayList<>();
        this.attachedRenderersTmp = new ArrayList<>();
        this.wasExpandBigSize = Boolean.TRUE;
        this.cellFlickerDrawable = new CellFlickerDrawable();
        this.statusIconPool = new ArrayList<>();
        this.onUserLeaveHintListener = new GroupCallActivity$$ExternalSyntheticLambda28(this, 3);
        this.updateSchedeulRunnable = new Runnable() {
            @Override
            public void run() {
                if (GroupCallActivity.this.scheduleTimeTextView == null || GroupCallActivity.this.isDismissed()) {
                    return;
                }
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                ChatObject.Call call2 = groupCallActivity.call;
                int i3 = call2 != null ? call2.call.schedule_date : groupCallActivity.scheduleStartAt;
                if (i3 == 0) {
                    return;
                }
                int currentTime = i3 - GroupCallActivity.this.accountInstance.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    GroupCallActivity.this.scheduleTimeTextView.setText(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]));
                } else {
                    GroupCallActivity.this.scheduleTimeTextView.setText(AndroidUtilities.formatFullDuration(Math.abs(currentTime)));
                    if (currentTime < 0 && GroupCallActivity.this.scheduleStartInTextView.getTag() == null) {
                        GroupCallActivity.this.scheduleStartInTextView.setTag(1);
                        GroupCallActivity.this.scheduleStartInTextView.setText(LocaleController.getString(R.string.VoipChatLateBy));
                    }
                }
                GroupCallActivity.this.scheduleStartAtTextView.setText(LocaleController.formatStartsTime(i3, 3));
                AndroidUtilities.runOnUIThread(GroupCallActivity.this.updateSchedeulRunnable, 1000L);
            }
        };
        this.unmuteRunnable = new OAuthSheet$$ExternalSyntheticLambda5(16);
        this.pressRunnable = new GroupCallActivity$$ExternalSyntheticLambda28(this, 4);
        this.needTextureLightning = false;
        this.updateTextureLightningRunnable = new AnonymousClass2();
        this.visiblePeerIds = new LongSparseIntArray();
        this.gradientColors = new int[2];
        this.listViewVideoVisibility = true;
        this.invites = new String[2];
        this.popupAnimationIndex = -1;
        this.diffUtilsCallback = new DiffUtil.Callback() {
            @Override
            public boolean areContentsTheSame(int i3, int i4) {
                return true;
            }

            @Override
            public boolean areItemsTheSame(int i3, int i4) {
                if (GroupCallActivity.this.listAdapter.addMemberRow >= 0) {
                    if (i3 == GroupCallActivity.this.oldAddMemberRow && i4 == GroupCallActivity.this.listAdapter.addMemberRow) {
                        return true;
                    }
                    if ((i3 == GroupCallActivity.this.oldAddMemberRow && i4 != GroupCallActivity.this.listAdapter.addMemberRow) || (i3 != GroupCallActivity.this.oldAddMemberRow && i4 == GroupCallActivity.this.listAdapter.addMemberRow)) {
                        return false;
                    }
                }
                if (GroupCallActivity.this.listAdapter.conferenceAddPeopleRow >= 0) {
                    if (i3 == GroupCallActivity.this.oldConferenceAddPeopleRow && i4 == GroupCallActivity.this.listAdapter.conferenceAddPeopleRow) {
                        return true;
                    }
                    if ((i3 == GroupCallActivity.this.oldConferenceAddPeopleRow && i4 != GroupCallActivity.this.listAdapter.conferenceAddPeopleRow) || (i3 != GroupCallActivity.this.oldConferenceAddPeopleRow && i4 == GroupCallActivity.this.listAdapter.conferenceAddPeopleRow)) {
                        return false;
                    }
                }
                if (GroupCallActivity.this.listAdapter.conferenceShareLinkRow >= 0) {
                    if (i3 == GroupCallActivity.this.oldConferenceShareLinkRow && i4 == GroupCallActivity.this.listAdapter.conferenceShareLinkRow) {
                        return true;
                    }
                    if ((i3 == GroupCallActivity.this.oldConferenceShareLinkRow && i4 != GroupCallActivity.this.listAdapter.conferenceShareLinkRow) || (i3 != GroupCallActivity.this.oldConferenceShareLinkRow && i4 == GroupCallActivity.this.listAdapter.conferenceShareLinkRow)) {
                        return false;
                    }
                }
                if (GroupCallActivity.this.listAdapter.encryptionRow >= 0) {
                    if (i3 == GroupCallActivity.this.oldEncryptionRow && i4 == GroupCallActivity.this.listAdapter.encryptionRow) {
                        return true;
                    }
                    if ((i3 == GroupCallActivity.this.oldEncryptionRow && i4 != GroupCallActivity.this.listAdapter.encryptionRow) || (i3 != GroupCallActivity.this.oldEncryptionRow && i4 == GroupCallActivity.this.listAdapter.encryptionRow)) {
                        return false;
                    }
                }
                if (GroupCallActivity.this.listAdapter.videoNotAvailableRow >= 0) {
                    if (i3 == GroupCallActivity.this.oldVideoNotAvailableRow && i4 == GroupCallActivity.this.listAdapter.videoNotAvailableRow) {
                        return true;
                    }
                    if ((i3 == GroupCallActivity.this.oldVideoNotAvailableRow && i4 != GroupCallActivity.this.listAdapter.videoNotAvailableRow) || (i3 != GroupCallActivity.this.oldVideoNotAvailableRow && i4 == GroupCallActivity.this.listAdapter.videoNotAvailableRow)) {
                        return false;
                    }
                }
                if (GroupCallActivity.this.listAdapter.videoGridDividerRow >= 0 && GroupCallActivity.this.listAdapter.videoGridDividerRow == i4 && i3 == GroupCallActivity.this.oldVideoDividerRow) {
                    return true;
                }
                if (i3 == GroupCallActivity.this.oldCount - 1 && i4 == GroupCallActivity.this.listAdapter.rowsCount - 1) {
                    return true;
                }
                if (i3 != GroupCallActivity.this.oldCount - 1 && i4 != GroupCallActivity.this.listAdapter.rowsCount - 1) {
                    if (i4 >= GroupCallActivity.this.listAdapter.usersVideoGridStartRow && i4 < GroupCallActivity.this.listAdapter.usersVideoGridEndRow && i3 >= GroupCallActivity.this.oldUsersVideoStartRow && i3 < GroupCallActivity.this.oldUsersVideoEndRow) {
                        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) GroupCallActivity.this.oldVideoParticipants.get(i3 - GroupCallActivity.this.oldUsersVideoStartRow);
                        GroupCallActivity groupCallActivity = GroupCallActivity.this;
                        return videoParticipant.equals(groupCallActivity.visibleVideoParticipants.get(i4 - groupCallActivity.listAdapter.usersVideoGridStartRow));
                    }
                    if (i4 >= GroupCallActivity.this.listAdapter.usersStartRow && i4 < GroupCallActivity.this.listAdapter.usersEndRow && i3 >= GroupCallActivity.this.oldUsersStartRow && i3 < GroupCallActivity.this.oldUsersEndRow) {
                        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) GroupCallActivity.this.oldParticipants.get(i3 - GroupCallActivity.this.oldUsersStartRow);
                        GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                        return MessageObject.getPeerId(groupCallParticipant.peer) == MessageObject.getPeerId(groupCallActivity2.call.visibleParticipants.get(i4 - groupCallActivity2.listAdapter.usersStartRow).peer) && (i3 == i4 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date));
                    }
                    if (i4 >= GroupCallActivity.this.listAdapter.invitedStartRow && i4 < GroupCallActivity.this.listAdapter.invitedEndRow && i3 >= GroupCallActivity.this.oldInvitedStartRow && i3 < GroupCallActivity.this.oldInvitedEndRow) {
                        Long l = (Long) GroupCallActivity.this.oldInvited.get(i3 - GroupCallActivity.this.oldInvitedStartRow);
                        GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                        return l.equals(groupCallActivity3.call.invitedUsers.get(i4 - groupCallActivity3.listAdapter.invitedStartRow));
                    }
                    if (i4 >= GroupCallActivity.this.listAdapter.shadyJoinStartRow && i4 < GroupCallActivity.this.listAdapter.shadyJoinEndRow && i3 >= GroupCallActivity.this.oldShadyJoinStartRow && i3 < GroupCallActivity.this.oldShadyJoinEndRow) {
                        Long l2 = (Long) GroupCallActivity.this.oldShadyJoin.get(i3 - GroupCallActivity.this.oldShadyJoinStartRow);
                        GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                        return l2.equals(groupCallActivity4.call.shadyJoinParticipants.get(i4 - groupCallActivity4.listAdapter.shadyJoinStartRow));
                    }
                    if (i4 >= GroupCallActivity.this.listAdapter.shadyLeftStartRow && i4 < GroupCallActivity.this.listAdapter.shadyLeftEndRow && i3 >= GroupCallActivity.this.oldShadyLeftStartRow && i3 < GroupCallActivity.this.oldShadyLeftEndRow) {
                        Long l3 = (Long) GroupCallActivity.this.oldShadyLeft.get(i3 - GroupCallActivity.this.oldShadyLeftStartRow);
                        GroupCallActivity groupCallActivity5 = GroupCallActivity.this;
                        return l3.equals(groupCallActivity5.call.shadyLeftParticipants.get(i4 - groupCallActivity5.listAdapter.shadyLeftStartRow));
                    }
                }
                return false;
            }

            @Override
            public int getNewListSize() {
                return GroupCallActivity.this.listAdapter.rowsCount;
            }

            @Override
            public int getOldListSize() {
                return GroupCallActivity.this.oldCount;
            }
        };
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        this.animatorHideButtons = new BoolAnimator(2, this, cubicBezierInterpolator, 350L);
        this.animatorMessageIsEmpty = new BoolAnimator(3, this, cubicBezierInterpolator, 220L, true);
        this.animatorMessageInputHeight = new FactorAnimator(4, this, cubicBezierInterpolator, 350L);
        final GroupCallActivity groupCallActivity = this;
        groupCallActivity.animatorHasVideo = new BoolAnimator(5, this, cubicBezierInterpolator, 350L);
        AndroidUtilities.enableEdgeToEdge(groupCallActivity.getWindow());
        groupCallActivity.setOpenNoDelay(true);
        groupCallActivity.accountInstance = accountInstance;
        groupCallActivity.call = call;
        groupCallActivity.schedulePeer = inputPeer;
        groupCallActivity.currentChat = chat;
        groupCallActivity.scheduledHash = str;
        groupCallActivity.currentAccount = accountInstance.getCurrentAccount();
        groupCallActivity.scheduleHasFewPeers = z;
        groupCallActivity.resourcesProvider = new DarkBlueThemeResourcesProvider();
        groupCallActivity.smoothKeyboardAnimationEnabled = true;
        groupCallActivity.smoothKeyboardByBottom = true;
        groupCallActivity.maxGroupCallMessageLength = MessagesController.getInstance(groupCallActivity.currentAccount).config.groupCallMessageLengthLimit.get();
        groupCallActivity.fullWidth = true;
        isTabletMode = false;
        isLandscapeMode = false;
        paused = false;
        groupCallActivity.setDelegate(new BottomSheet.BottomSheetDelegateInterface() {
            @Override
            public boolean canDismiss() {
                return true;
            }

            @Override
            public void onOpenAnimationEnd() {
                CountDownLatch groupCallBottomSheetLatch;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
                    groupCallBottomSheetLatch.countDown();
                }
                if (GroupCallActivity.this.muteButtonState == 6) {
                    GroupCallActivity.this.showReminderHint();
                }
            }

            public void onOpenAnimationStart() {
            }
        });
        groupCallActivity.drawDoubleNavigationBar = true;
        groupCallActivity.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            groupCallActivity.getWindow().setNavigationBarColor(-16777216);
        }
        groupCallActivity.scrollNavBar = true;
        groupCallActivity.navBarColorKey = -1;
        groupCallActivity.scrimPaint = new Paint() {
            @Override
            public void setAlpha(int i3) {
                super.setAlpha(i3);
                if (((BottomSheet) GroupCallActivity.this).containerView != null) {
                    ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                }
            }
        };
        groupCallActivity.setOnDismissListener(new GroupCallActivity$$ExternalSyntheticLambda27(groupCallActivity, i2));
        groupCallActivity.setDimBehindAlpha(75);
        ListAdapter listAdapter = groupCallActivity.new ListAdapter(activity);
        groupCallActivity.listAdapter = listAdapter;
        final RecordStatusDrawable recordStatusDrawable = new RecordStatusDrawable(true);
        int i3 = Theme.key_voipgroup_speakingText;
        recordStatusDrawable.setColor(Theme.getColor(i3));
        recordStatusDrawable.start();
        ActionBar actionBar = new ActionBar(activity) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                if (getAdditionalSubtitleTextView().getVisibility() == 0) {
                    canvas.save();
                    canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
                    recordStatusDrawable.setAlpha((int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f));
                    recordStatusDrawable.draw(canvas);
                    canvas.restore();
                    invalidate();
                }
            }

            @Override
            public void onFactorChangeFinished(int i4, float f, FactorAnimator factorAnimator) {
            }

            @Override
            public void setAlpha(float f) {
                if (getAlpha() != f) {
                    super.setAlpha(f);
                    ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                }
            }
        };
        groupCallActivity.actionBar = actionBar;
        actionBar.setSubtitle("");
        actionBar.getSubtitleTextView().setVisibility(0);
        actionBar.createAdditionalSubtitleTextView();
        actionBar.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(actionBar.getAdditionalSubtitleTextView(), groupCallActivity.drawSpeakingSubtitle, 1.0f, false);
        actionBar.getAdditionalSubtitleTextView().setTextColor(Theme.getColor(i3));
        int i4 = Theme.key_voipgroup_lastSeenTextUnscrolled;
        actionBar.setSubtitleColor(Theme.getColor(i4));
        actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        actionBar.setOccupyStatusBar(false);
        actionBar.setAllowOverlayTitle(false);
        int i5 = Theme.key_voipgroup_actionBarItems;
        actionBar.setItemsColor(Theme.getColor(i5), false);
        actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarActionModeDefaultSelector), false);
        actionBar.setTitleColor(Theme.getColor(i5));
        actionBar.setSubtitleColor(Theme.getColor(i4));
        actionBar.setActionBarMenuOnItemClick(groupCallActivity.new AnonymousClass6(activity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            groupCallActivity.selfPeer = tL_peerUser;
            tL_peerUser.user_id = accountInstance.getUserConfig().getClientUserId();
            i = i5;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            groupCallActivity.selfPeer = tL_peerChannel;
            i = i5;
            tL_peerChannel.channel_id = groupCallPeer.channel_id;
        } else {
            i = i5;
            if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                groupCallActivity.selfPeer = tL_peerUser2;
                tL_peerUser2.user_id = groupCallPeer.user_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                groupCallActivity.selfPeer = tL_peerChat;
                tL_peerChat.chat_id = groupCallPeer.chat_id;
            }
        }
        VoIPService.audioLevelsCallback = new GroupCallActivity$$ExternalSyntheticLambda10(groupCallActivity, 4);
        accountInstance.getNotificationCenter().addObserver(groupCallActivity, NotificationCenter.groupCallUpdated);
        accountInstance.getNotificationCenter().addObserver(groupCallActivity, NotificationCenter.needShowAlert);
        accountInstance.getNotificationCenter().addObserver(groupCallActivity, NotificationCenter.chatInfoDidLoad);
        accountInstance.getNotificationCenter().addObserver(groupCallActivity, NotificationCenter.didLoadChatAdmins);
        accountInstance.getNotificationCenter().addObserver(groupCallActivity, NotificationCenter.applyGroupCallVisibleParticipants);
        accountInstance.getNotificationCenter().addObserver(groupCallActivity, NotificationCenter.userInfoDidLoad);
        accountInstance.getNotificationCenter().addObserver(groupCallActivity, NotificationCenter.mainUserInfoChanged);
        accountInstance.getNotificationCenter().addObserver(groupCallActivity, NotificationCenter.updateInterfaces);
        accountInstance.getNotificationCenter().addObserver(groupCallActivity, NotificationCenter.groupCallScreencastStateChanged);
        accountInstance.getNotificationCenter().addObserver(groupCallActivity, NotificationCenter.groupCallSpeakingUsersUpdated);
        accountInstance.getNotificationCenter().addObserver(groupCallActivity, NotificationCenter.conferenceEmojiUpdated);
        NotificationCenter.getGlobalInstance().addObserver(groupCallActivity, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().addObserver(groupCallActivity, NotificationCenter.didEndCall);
        groupCallActivity.shadowDrawable = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        int i6 = R.raw.voip_filled;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i6, Fragment$$ExternalSyntheticOutline0.m(i6, ""), AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        groupCallActivity.bigMicDrawable = rLottieDrawable;
        int i7 = R.raw.hand_2;
        groupCallActivity.handDrawables = new RLottieDrawable(i7, Fragment$$ExternalSyntheticOutline0.m(i7, ""), AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(activity) {
            private int lastSize;
            boolean localHasVideo;
            private boolean updateRenderers;
            boolean wasLayout;
            private boolean ignoreLayout = false;
            private RectF rect = new RectF();
            HashMap<Object, View> listCells = new HashMap<>();

            @Override
            public void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                Canvas canvas3;
                GroupCallUserCell groupCallUserCell;
                float f;
                float y;
                float x;
                float[] fArr;
                GroupCallUserCell groupCallUserCell2;
                float x2;
                float measuredHeight;
                float measuredWidth;
                float measuredHeight2;
                boolean z2 = false;
                if (!GroupCallActivity.this.isInDrawRenderNodeBlur && !GroupCallActivity.this.drawingForBlur && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
                    if (GroupCallActivity.this.renderNodeBlur == null) {
                        GroupCallActivity.this.renderNodeBlur = PhotoViewer$$ExternalSyntheticApiModelOutline1.m$2();
                        GroupCallActivity.this.renderNodeBlurScale = SizeNotifierFrameLayout.getRenderNodeScale();
                        ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                        float blurRadius = SizeNotifierFrameLayout.getBlurRadius();
                        RenderNode renderNode = GroupCallActivity.this.renderNodeBlur;
                        Shader.TileMode unused = Shader.TileMode.DECAL;
                        renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, Shader.TileMode.DECAL), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                        GroupCallActivity.this.groupCallMessagesListView.setBlurRoot(this);
                        GroupCallMessagesListView groupCallMessagesListView = GroupCallActivity.this.groupCallMessagesListView;
                        RenderNode renderNode2 = GroupCallActivity.this.renderNodeBlur;
                        float f2 = GroupCallActivity.this.renderNodeBlurScale;
                        groupCallMessagesListView.renderNode = renderNode2;
                        groupCallMessagesListView.renderNodeScale = f2;
                    }
                    int iRound = Math.round(getMeasuredWidth() / GroupCallActivity.this.renderNodeBlurScale);
                    int iRound2 = Math.round(getMeasuredHeight() / GroupCallActivity.this.renderNodeBlurScale);
                    GroupCallActivity.this.isInDrawRenderNodeBlur = true;
                    GroupCallActivity.this.renderNodeBlur.setPosition(0, 0, iRound, iRound2);
                    RecordingCanvas recordingCanvasBeginRecording = GroupCallActivity.this.renderNodeBlur.beginRecording();
                    recordingCanvasBeginRecording.scale(1.0f / GroupCallActivity.this.renderNodeBlurScale, 1.0f / GroupCallActivity.this.renderNodeBlurScale);
                    dispatchDraw(recordingCanvasBeginRecording);
                    GroupCallActivity.this.renderNodeBlur.endRecording();
                    GroupCallActivity.this.isInDrawRenderNodeBlur = false;
                }
                for (int i8 = 0; i8 < GroupCallActivity.this.listView.getChildCount(); i8++) {
                    View childAt = GroupCallActivity.this.listView.getChildAt(i8);
                    if (childAt instanceof GroupCallUserCell) {
                        ((GroupCallUserCell) childAt).setDrawAvatar(true);
                    }
                    if (!(childAt instanceof GroupCallGridCell)) {
                        if (childAt.getMeasuredWidth() != GroupCallActivity.this.listView.getMeasuredWidth()) {
                            childAt.setTranslationX((GroupCallActivity.this.listView.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                        } else {
                            childAt.setTranslationX(0.0f);
                        }
                    }
                }
                if (!GroupCallActivity.this.renderersContainer.isAnimating()) {
                    for (int i9 = 0; i9 < GroupCallActivity.this.fullscreenUsersListView.getChildCount(); i9++) {
                        ((GroupCallFullscreenAdapter.GroupCallUserCell) GroupCallActivity.this.fullscreenUsersListView.getChildAt(i9)).setProgressToFullscreen(1.0f);
                    }
                } else if (GroupCallActivity.this.fullscreenUsersListView.getVisibility() == 0) {
                    this.listCells.clear();
                    for (int i10 = 0; i10 < GroupCallActivity.this.listView.getChildCount(); i10++) {
                        View childAt2 = GroupCallActivity.this.listView.getChildAt(i10);
                        if (childAt2.isAttachedToWindow()) {
                            if ((childAt2 instanceof GroupCallGridCell) && GroupCallActivity.this.listView.getChildAdapterPosition(childAt2) >= 0) {
                                GroupCallGridCell groupCallGridCell = (GroupCallGridCell) childAt2;
                                if (groupCallGridCell.getRenderer() != GroupCallActivity.this.renderersContainer.fullscreenTextureView) {
                                    this.listCells.put(groupCallGridCell.getParticipant(), childAt2);
                                }
                            } else if ((childAt2 instanceof GroupCallUserCell) && GroupCallActivity.this.listView.getChildAdapterPosition(childAt2) >= 0) {
                                GroupCallUserCell groupCallUserCell3 = (GroupCallUserCell) childAt2;
                                this.listCells.put(groupCallUserCell3.getParticipant(), groupCallUserCell3);
                            }
                        }
                    }
                    for (int i11 = 0; i11 < GroupCallActivity.this.fullscreenUsersListView.getChildCount(); i11++) {
                        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell4 = (GroupCallFullscreenAdapter.GroupCallUserCell) GroupCallActivity.this.fullscreenUsersListView.getChildAt(i11);
                        View view = this.listCells.get(groupCallUserCell4.getVideoParticipant());
                        if (view == null) {
                            view = this.listCells.get(groupCallUserCell4.getParticipant());
                        }
                        float f3 = GroupCallActivity.this.renderersContainer.progressToFullscreenMode;
                        if (!GroupCallActivity.this.fullscreenListItemAnimator.isRunning()) {
                            groupCallUserCell4.setAlpha(1.0f);
                        }
                        if (view != null) {
                            if (view instanceof GroupCallGridCell) {
                                GroupCallGridCell groupCallGridCell2 = (GroupCallGridCell) view;
                                x2 = (GroupCallActivity.this.listView.getX() + groupCallGridCell2.getLeft()) - GroupCallActivity.this.renderersContainer.getLeft();
                                measuredHeight = (GroupCallActivity.this.listView.getY() + groupCallGridCell2.getTop()) - GroupCallActivity.this.renderersContainer.getTop();
                                measuredWidth = GroupCallActivity.this.fullscreenUsersListView.getX() + groupCallUserCell4.getLeft();
                                measuredHeight2 = GroupCallActivity.this.fullscreenUsersListView.getY() + groupCallUserCell4.getTop();
                            } else {
                                GroupCallUserCell groupCallUserCell5 = (GroupCallUserCell) view;
                                x2 = ((GroupCallActivity.this.listView.getX() + groupCallUserCell5.getLeft()) - GroupCallActivity.this.renderersContainer.getLeft()) + groupCallUserCell5.getAvatarImageView().getLeft() + (groupCallUserCell5.getAvatarImageView().getMeasuredWidth() >> 1);
                                measuredHeight = (groupCallUserCell5.getAvatarImageView().getMeasuredHeight() >> 1) + ((GroupCallActivity.this.listView.getY() + groupCallUserCell5.getTop()) - GroupCallActivity.this.renderersContainer.getTop()) + groupCallUserCell5.getAvatarImageView().getTop();
                                measuredWidth = (groupCallUserCell4.getMeasuredWidth() >> 1) + GroupCallActivity.this.fullscreenUsersListView.getX() + groupCallUserCell4.getLeft();
                                measuredHeight2 = (groupCallUserCell4.getMeasuredHeight() >> 1) + GroupCallActivity.this.fullscreenUsersListView.getY() + groupCallUserCell4.getTop();
                                groupCallUserCell5.setDrawAvatar(false);
                            }
                            float f4 = 1.0f - f3;
                            groupCallUserCell4.setTranslationX((x2 - measuredWidth) * f4);
                            groupCallUserCell4.setTranslationY((measuredHeight - measuredHeight2) * f4);
                            groupCallUserCell4.setScaleX(1.0f);
                            groupCallUserCell4.setScaleY(1.0f);
                            groupCallUserCell4.setProgressToFullscreen(f3);
                        } else {
                            groupCallUserCell4.setScaleX(1.0f);
                            groupCallUserCell4.setScaleY(1.0f);
                            groupCallUserCell4.setTranslationX(0.0f);
                            groupCallUserCell4.setTranslationY(0.0f);
                            groupCallUserCell4.setProgressToFullscreen(1.0f);
                            if (groupCallUserCell4.getRenderer() == null) {
                                groupCallUserCell4.setAlpha(f3);
                            }
                        }
                    }
                }
                int i12 = 0;
                while (i12 < GroupCallActivity.this.attachedRenderers.size()) {
                    GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderers.get(i12);
                    RecyclerListView recyclerListView = GroupCallActivity.this.listView;
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    RecyclerListView recyclerListView2 = groupCallActivity2.tabletVideoGridView;
                    RecyclerListView recyclerListView3 = groupCallActivity2.fullscreenUsersListView;
                    GroupCallRenderersContainer groupCallRenderersContainer = groupCallActivity2.renderersContainer;
                    if (!groupCallMiniTextureView.showingAsScrimView && !groupCallMiniTextureView.animateToScrimView && !groupCallMiniTextureView.forceDetached) {
                        groupCallMiniTextureView.drawFirst = z2;
                        float f5 = groupCallRenderersContainer.progressToFullscreenMode;
                        boolean z3 = groupCallMiniTextureView.animateToFullscreen;
                        GroupCallMiniTextureView.AnonymousClass1 anonymousClass1 = groupCallMiniTextureView.textureView;
                        if (z3 || groupCallMiniTextureView.showingInFullscreen) {
                            GroupCallGridCell groupCallGridCell3 = groupCallMiniTextureView.primaryView;
                            if (groupCallGridCell3 == null && groupCallMiniTextureView.tabletGridView == null) {
                                groupCallMiniTextureView.setTranslationX(0.0f);
                                groupCallMiniTextureView.setTranslationY(0.0f);
                            } else {
                                GroupCallGridCell groupCallGridCell4 = groupCallMiniTextureView.tabletGridView;
                                if (groupCallGridCell4 != null) {
                                    groupCallGridCell3 = groupCallGridCell4;
                                }
                                if (groupCallGridCell4 != null) {
                                    recyclerListView = recyclerListView2;
                                }
                                float x3 = ((recyclerListView.getX() + groupCallGridCell3.getX()) - groupCallMiniTextureView.getLeft()) - groupCallRenderersContainer.getLeft();
                                float y2 = ((recyclerListView.getY() + (groupCallGridCell3.getY() + AndroidUtilities.dp(2.0f))) - groupCallMiniTextureView.getTop()) - groupCallRenderersContainer.getTop();
                                float f6 = 1.0f - f5;
                                float f7 = f5 * 0.0f;
                                groupCallMiniTextureView.setTranslationX((x3 * f6) + f7);
                                groupCallMiniTextureView.setTranslationY((y2 * f6) + f7);
                            }
                            anonymousClass1.setRoundCorners(AndroidUtilities.dp(8.0f));
                            GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell6 = groupCallMiniTextureView.secondaryView;
                            if (groupCallUserCell6 != null) {
                                groupCallUserCell6.setAlpha(f5);
                            }
                            if (!groupCallMiniTextureView.showingInFullscreen && groupCallMiniTextureView.primaryView == null && groupCallMiniTextureView.tabletGridView == null) {
                                groupCallMiniTextureView.setAlpha(f5);
                            } else if (!groupCallMiniTextureView.animateEnter) {
                                groupCallMiniTextureView.setAlpha(1.0f);
                            }
                        } else {
                            GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell7 = groupCallMiniTextureView.secondaryView;
                            if (groupCallUserCell7 != null) {
                                if (groupCallUserCell7.isRemoving(recyclerListView3)) {
                                    groupCallMiniTextureView.setAlpha(groupCallMiniTextureView.secondaryView.getAlpha());
                                } else if (groupCallMiniTextureView.primaryView == null) {
                                    if (groupCallMiniTextureView.attached && !groupCallMiniTextureView.animateEnter) {
                                        groupCallMiniTextureView.setAlpha(f5);
                                    }
                                    groupCallMiniTextureView.secondaryView.setAlpha(f5);
                                    f5 = 1.0f;
                                } else {
                                    groupCallMiniTextureView.secondaryView.setAlpha(1.0f);
                                    if (groupCallMiniTextureView.attached && !groupCallMiniTextureView.animateEnter) {
                                        groupCallMiniTextureView.setAlpha(1.0f);
                                    }
                                }
                                groupCallMiniTextureView.setTranslationX((recyclerListView3.getX() + groupCallMiniTextureView.secondaryView.getX()) - groupCallMiniTextureView.getLeft());
                                float f8 = 1.0f - f5;
                                groupCallMiniTextureView.setTranslationY((recyclerListView3.getY() + (groupCallMiniTextureView.secondaryView.getY() + (AndroidUtilities.dp(2.0f) * f8))) - groupCallMiniTextureView.getTop());
                                anonymousClass1.setRoundCorners((AndroidUtilities.dp(8.0f) * f8) + (AndroidUtilities.dp(13.0f) * f5));
                            } else {
                                GroupCallGridCell groupCallGridCell5 = groupCallMiniTextureView.primaryView;
                                if (groupCallGridCell5 != null || groupCallMiniTextureView.tabletGridView != null) {
                                    GroupCallGridCell groupCallGridCell6 = groupCallMiniTextureView.tabletGridView;
                                    if (groupCallGridCell6 == null || groupCallGridCell5 == null) {
                                        if (groupCallGridCell6 != null) {
                                            groupCallGridCell5 = groupCallGridCell6;
                                        }
                                        if (groupCallGridCell6 != null) {
                                            recyclerListView = recyclerListView2;
                                        }
                                    } else {
                                        boolean z4 = GroupCallActivity.isTabletMode && !groupCallMiniTextureView.parentContainer.inFullscreenMode;
                                        if (z4) {
                                            groupCallGridCell5 = groupCallGridCell6;
                                        }
                                        if (z4) {
                                            recyclerListView = recyclerListView2;
                                        }
                                    }
                                    groupCallMiniTextureView.setTranslationX(((recyclerListView.getX() + groupCallGridCell5.getX()) - groupCallMiniTextureView.getLeft()) - groupCallRenderersContainer.getLeft());
                                    groupCallMiniTextureView.setTranslationY(((recyclerListView.getY() + (groupCallGridCell5.getY() + AndroidUtilities.dp(2.0f))) - groupCallMiniTextureView.getTop()) - groupCallRenderersContainer.getTop());
                                    anonymousClass1.setRoundCorners(AndroidUtilities.dp(8.0f));
                                    if (groupCallMiniTextureView.attached && !groupCallMiniTextureView.animateEnter) {
                                        if (!GroupCallActivity.isTabletMode) {
                                            groupCallMiniTextureView.drawFirst = true;
                                            groupCallMiniTextureView.setAlpha(groupCallGridCell5.getAlpha() * (1.0f - f5));
                                        } else if (groupCallMiniTextureView.primaryView != null && groupCallMiniTextureView.tabletGridView == null) {
                                            groupCallMiniTextureView.setAlpha(groupCallGridCell5.getAlpha() * f5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i12++;
                    z2 = false;
                }
                if (GroupCallActivity.isTabletMode) {
                    GroupCallActivity.this.buttonsBackgroundGradientView.setAlpha(1.0f);
                    GroupCallActivity.this.buttonsBackgroundGradientView2.setAlpha(1.0f);
                } else {
                    GroupCallActivity.this.buttonsBackgroundGradientView.setAlpha(1.0f - GroupCallActivity.this.renderersContainer.progressToFullscreenMode);
                    GroupCallActivity.this.buttonsBackgroundGradientView2.setAlpha(1.0f - GroupCallActivity.this.renderersContainer.progressToFullscreenMode);
                }
                if (GroupCallActivity.this.renderersContainer.swipedBack) {
                    GroupCallActivity.this.listView.setAlpha(1.0f - GroupCallActivity.this.renderersContainer.progressToFullscreenMode);
                } else {
                    GroupCallActivity.this.listView.setAlpha(1.0f);
                }
                if (GroupCallActivity.this.watchersView != null) {
                    GroupCallActivity.this.watchersView.setAlpha(1.0f - GroupCallActivity.this.renderersContainer.progressToFullscreenMode);
                    GroupCallActivity.this.watchersView.setTranslationY(GroupCallActivity.this.renderersContainer.progressToFullscreenMode * AndroidUtilities.dp(64.0f));
                }
                super.dispatchDraw(canvas);
                GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                if (groupCallActivity3.drawingForBlur) {
                    return;
                }
                if (!groupCallActivity3.avatarsPreviewShowed) {
                    if (GroupCallActivity.this.scrimView != null) {
                        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), GroupCallActivity.this.scrimPaint);
                        float y3 = GroupCallActivity.this.listView.getY();
                        GroupCallActivity.this.listView.getY();
                        GroupCallActivity.this.listView.getMeasuredHeight();
                        if (!GroupCallActivity.this.hasScrimAnchorView) {
                            if (GroupCallActivity.this.scrimFullscreenView == null) {
                                if (GroupCallActivity.this.scrimRenderer == null || !GroupCallActivity.this.scrimRenderer.attached) {
                                    return;
                                }
                                canvas.save();
                                canvas.translate(GroupCallActivity.this.renderersContainer.getX() + GroupCallActivity.this.scrimRenderer.getX(), GroupCallActivity.this.renderersContainer.getY() + GroupCallActivity.this.scrimRenderer.getY());
                                GroupCallActivity.this.scrimRenderer.draw(canvas);
                                canvas.restore();
                                return;
                            }
                            canvas.save();
                            canvas.translate(GroupCallActivity.this.renderersContainer.getX() + GroupCallActivity.this.fullscreenUsersListView.getX() + GroupCallActivity.this.scrimFullscreenView.getX(), GroupCallActivity.this.renderersContainer.getY() + GroupCallActivity.this.fullscreenUsersListView.getY() + GroupCallActivity.this.scrimFullscreenView.getY());
                            if (GroupCallActivity.this.scrimFullscreenView.getRenderer() == null || !GroupCallActivity.this.scrimFullscreenView.getRenderer().attached || GroupCallActivity.this.scrimFullscreenView.getRenderer().showingInFullscreen) {
                                GroupCallActivity.this.scrimFullscreenView.draw(canvas);
                            } else {
                                GroupCallActivity.this.scrimFullscreenView.getRenderer().draw(canvas);
                            }
                            GroupCallActivity.this.scrimFullscreenView.drawOverlays(canvas);
                            canvas.restore();
                            return;
                        }
                        int childCount = GroupCallActivity.this.listView.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt3 = GroupCallActivity.this.listView.getChildAt(i13);
                            if (childAt3 == GroupCallActivity.this.scrimView) {
                                float fMax = Math.max(GroupCallActivity.this.listView.getLeft(), childAt3.getX() + GroupCallActivity.this.listView.getLeft());
                                float fMax2 = Math.max(y3, childAt3.getY() + GroupCallActivity.this.listView.getY());
                                float fMin = Math.min(GroupCallActivity.this.listView.getRight(), childAt3.getX() + GroupCallActivity.this.listView.getLeft() + childAt3.getMeasuredWidth());
                                float fMin2 = Math.min(GroupCallActivity.this.listView.getY() + GroupCallActivity.this.listView.getMeasuredHeight(), childAt3.getY() + GroupCallActivity.this.listView.getY() + GroupCallActivity.this.scrimView.getClipHeight());
                                if (fMax2 < fMin2) {
                                    if (childAt3.getAlpha() != 1.0f) {
                                        canvas2 = canvas;
                                        canvas2.saveLayerAlpha(fMax, fMax2, fMin, fMin2, (int) (childAt3.getAlpha() * 255.0f), 31);
                                    } else {
                                        canvas2 = canvas;
                                        canvas2.save();
                                    }
                                    canvas2.clipRect(fMax, fMax2, fMin, getMeasuredHeight());
                                    canvas2.translate(childAt3.getX() + GroupCallActivity.this.listView.getLeft(), childAt3.getY() + GroupCallActivity.this.listView.getY());
                                    float alpha = GroupCallActivity.this.scrimPaint.getAlpha() / 100.0f;
                                    this.rect.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((GroupCallActivity.this.scrimView.getClipHeight() - GroupCallActivity.this.scrimView.getMeasuredHeight()) * (1.0f - CubicBezierInterpolator.EASE_OUT.getInterpolation(1.0f - alpha))) + GroupCallActivity.this.scrimView.getMeasuredHeight()));
                                    GroupCallActivity.this.scrimView.setAboutVisibleProgress(GroupCallActivity.this.listViewBackgroundPaint.getColor(), alpha);
                                    canvas2.drawRoundRect(this.rect, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), GroupCallActivity.this.listViewBackgroundPaint);
                                    childAt3.draw(canvas2);
                                    canvas2.restore();
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                if (GroupCallActivity.this.scrimView != null) {
                    if (GroupCallActivity.this.useBlur) {
                        canvas3 = canvas;
                    } else {
                        canvas3 = canvas;
                        canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), GroupCallActivity.this.scrimPaint);
                    }
                    float y4 = GroupCallActivity.this.listView.getY();
                    float[] fArr2 = new float[8];
                    Path path = new Path();
                    int childCount2 = GroupCallActivity.this.listView.getChildCount();
                    float y5 = GroupCallActivity.this.listView.getY() + GroupCallActivity.this.listView.getMeasuredHeight();
                    if (GroupCallActivity.this.hasScrimAnchorView) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= childCount2) {
                                groupCallUserCell = null;
                                break;
                            } else {
                                if (GroupCallActivity.this.listView.getChildAt(i14) == GroupCallActivity.this.scrimView) {
                                    groupCallUserCell = GroupCallActivity.this.scrimView;
                                    break;
                                }
                                i14++;
                            }
                        }
                    } else {
                        groupCallUserCell = GroupCallActivity.this.scrimView;
                    }
                    if (groupCallUserCell != null && y4 < y5) {
                        canvas3.save();
                        if (GroupCallActivity.this.scrimFullscreenView == null) {
                            f = 255.0f;
                            canvas3.clipRect(0.0f, (1.0f - GroupCallActivity.this.progressToAvatarPreview) * y4, getMeasuredWidth(), (GroupCallActivity.this.progressToAvatarPreview * getMeasuredHeight()) + ((1.0f - GroupCallActivity.this.progressToAvatarPreview) * y5));
                        } else {
                            f = 255.0f;
                        }
                        if (GroupCallActivity.this.hasScrimAnchorView) {
                            y = ((1.0f - GroupCallActivity.this.progressToAvatarPreview) * (groupCallUserCell.getY() + GroupCallActivity.this.listView.getY())) + (GroupCallActivity.this.progressToAvatarPreview * (GroupCallActivity.this.avatarPreviewContainer.getMeasuredWidth() + GroupCallActivity.this.avatarPreviewContainer.getTop()));
                            x = ((1.0f - GroupCallActivity.this.progressToAvatarPreview) * (groupCallUserCell.getX() + GroupCallActivity.this.listView.getLeft())) + (GroupCallActivity.this.progressToAvatarPreview * GroupCallActivity.this.avatarPreviewContainer.getLeft());
                        } else {
                            y = GroupCallActivity.this.avatarPreviewContainer.getMeasuredWidth() + GroupCallActivity.this.avatarPreviewContainer.getTop();
                            x = GroupCallActivity.this.avatarPreviewContainer.getLeft();
                        }
                        float f9 = y;
                        canvas3.translate(x, f9);
                        if (GroupCallActivity.this.hasScrimAnchorView) {
                            fArr = fArr2;
                            groupCallUserCell2 = groupCallUserCell;
                            canvas3.save();
                        } else {
                            groupCallUserCell2 = groupCallUserCell;
                            fArr = fArr2;
                            canvas3.saveLayerAlpha(0.0f, 0.0f, groupCallUserCell.getMeasuredWidth(), groupCallUserCell.getClipHeight(), (int) (GroupCallActivity.this.progressToAvatarPreview * f), 31);
                        }
                        float clipHeight = (int) (((groupCallUserCell2.getClipHeight() - groupCallUserCell2.getMeasuredHeight()) * (1.0f - CubicBezierInterpolator.EASE_OUT.getInterpolation(1.0f - GroupCallActivity.this.progressToAvatarPreview))) + groupCallUserCell2.getMeasuredHeight());
                        this.rect.set(0.0f, 0.0f, groupCallUserCell2.getMeasuredWidth(), clipHeight);
                        GroupCallUserCell groupCallUserCell8 = groupCallUserCell2;
                        groupCallUserCell8.setProgressToAvatarPreview(GroupCallActivity.this.hasScrimAnchorView ? GroupCallActivity.this.progressToAvatarPreview : 1.0f);
                        for (int i15 = 0; i15 < 4; i15++) {
                            fArr[i15] = (1.0f - GroupCallActivity.this.progressToAvatarPreview) * AndroidUtilities.dp(13.0f);
                            fArr[i15 + 4] = AndroidUtilities.dp(13.0f);
                        }
                        path.reset();
                        path.addRoundRect(this.rect, fArr, Path.Direction.CW);
                        path.close();
                        canvas3.drawPath(path, GroupCallActivity.this.listViewBackgroundPaint);
                        groupCallUserCell8.draw(canvas3);
                        canvas3.restore();
                        canvas3.restore();
                        if (GroupCallActivity.this.scrimPopupLayout != null) {
                            float f10 = f9 + clipHeight;
                            float measuredWidth2 = (getMeasuredWidth() - GroupCallActivity.this.scrimPopupLayout.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                            if (GroupCallActivity.this.progressToAvatarPreview != 1.0f) {
                                canvas3.saveLayerAlpha(measuredWidth2, f10, GroupCallActivity.this.scrimPopupLayout.getMeasuredWidth() + measuredWidth2, GroupCallActivity.this.scrimPopupLayout.getMeasuredHeight() + f10, (int) (GroupCallActivity.this.progressToAvatarPreview * f), 31);
                            } else {
                                canvas3.save();
                            }
                            GroupCallActivity.this.scrimPopupLayout.setTranslationX(measuredWidth2 - GroupCallActivity.this.scrimPopupLayout.getLeft());
                            GroupCallActivity.this.scrimPopupLayout.setTranslationY(f10 - GroupCallActivity.this.scrimPopupLayout.getTop());
                            float f11 = (GroupCallActivity.this.progressToAvatarPreview * 0.2f) + 0.8f;
                            canvas3.scale(f11, f11, (GroupCallActivity.this.scrimPopupLayout.getMeasuredWidth() / 2.0f) + measuredWidth2, f10);
                            canvas3.translate(measuredWidth2, f10);
                            GroupCallActivity.this.scrimPopupLayout.draw(canvas3);
                            canvas3.restore();
                        }
                    }
                    if (GroupCallActivity.this.pinchToZoomHelper.isInOverlayMode()) {
                        return;
                    }
                    canvas3.save();
                    if (GroupCallActivity.this.hasScrimAnchorView && GroupCallActivity.this.scrimFullscreenView == null) {
                        canvas3.clipRect(0.0f, (1.0f - GroupCallActivity.this.progressToAvatarPreview) * y4, getMeasuredWidth(), (GroupCallActivity.this.progressToAvatarPreview * getMeasuredHeight()) + ((1.0f - GroupCallActivity.this.progressToAvatarPreview) * y5));
                    }
                    canvas3.scale(GroupCallActivity.this.avatarPreviewContainer.getScaleX(), GroupCallActivity.this.avatarPreviewContainer.getScaleY(), GroupCallActivity.this.avatarPreviewContainer.getX(), GroupCallActivity.this.avatarPreviewContainer.getY());
                    canvas3.translate(GroupCallActivity.this.avatarPreviewContainer.getX(), GroupCallActivity.this.avatarPreviewContainer.getY());
                    GroupCallActivity.this.avatarPreviewContainer.draw(canvas3);
                    canvas3.restore();
                }
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (GroupCallActivity.this.isInDrawRenderNodeBlur) {
                    if (view == GroupCallActivity.this.listView) {
                        int childCount = GroupCallActivity.this.listView.getChildCount();
                        for (int i8 = 0; i8 < childCount; i8++) {
                            View childAt = GroupCallActivity.this.listView.getChildAt(i8);
                            if (childAt.getVisibility() == 0) {
                                canvas.save();
                                canvas.translate(childAt.getX(), childAt.getY());
                                childAt.draw(canvas);
                                canvas.restore();
                            }
                        }
                    }
                    if (view == GroupCallActivity.this.renderersContainer || view == GroupCallActivity.this.buttonsContainer) {
                        return super.drawChild(canvas, view, j);
                    }
                    return true;
                }
                if (!GroupCallActivity.isTabletMode && GroupCallActivity.this.renderersContainer.progressToFullscreenMode == 1.0f && (view == GroupCallActivity.this.actionBar || view == GroupCallActivity.this.actionBarShadow || view == GroupCallActivity.this.actionBarBackground || view == GroupCallActivity.this.titleTextView || view == GroupCallActivity.this.menuItemsContainer || view == GroupCallActivity.this.textureLightningView)) {
                    return true;
                }
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                if (groupCallActivity2.drawingForBlur && view == groupCallActivity2.renderersContainer) {
                    canvas.save();
                    canvas.translate(GroupCallActivity.this.fullscreenUsersListView.getX() + GroupCallActivity.this.renderersContainer.getX(), GroupCallActivity.this.fullscreenUsersListView.getY() + GroupCallActivity.this.renderersContainer.getY());
                    GroupCallActivity.this.fullscreenUsersListView.draw(canvas);
                    canvas.restore();
                    return true;
                }
                if (view == GroupCallActivity.this.avatarPreviewContainer || view == GroupCallActivity.this.scrimPopupLayout || view == GroupCallActivity.this.scrimView) {
                    return true;
                }
                if (GroupCallActivity.this.contentFullyOverlayed && GroupCallActivity.this.useBlur && (view == GroupCallActivity.this.listView || view == GroupCallActivity.this.buttonsContainer || view == GroupCallActivity.this.groupCallMessagesListView)) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            }

            @Override
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                GroupCallActivity.this.reactionEffectImageReceiver.onAttachedToWindow();
            }

            @Override
            public void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                GroupCallActivity.this.reactionEffectImageReceiver.onDetachedFromWindow();
            }

            @Override
            public void onDraw(Canvas canvas) {
                float f;
                int iDp = AndroidUtilities.dp(74.0f);
                float f2 = GroupCallActivity.this.scrollOffsetY - iDp;
                int iDp2 = ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (((BottomSheet) GroupCallActivity.this).backgroundPaddingTop + f2 < ActionBar.getCurrentActionBarHeight()) {
                    int iDp3 = (iDp - ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
                    float fMin = Math.min(1.0f, ((ActionBar.getCurrentActionBarHeight() - f2) - ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop) / iDp3);
                    int currentActionBarHeight = (int) ((ActionBar.getCurrentActionBarHeight() - iDp3) * fMin);
                    f2 -= currentActionBarHeight;
                    iDp2 += currentActionBarHeight;
                    f = 1.0f - fMin;
                } else {
                    f = 1.0f;
                }
                float paddingTop = f2 + getPaddingTop();
                GroupCallActivity.this.updateTopBulletinY();
                if (GroupCallActivity.this.renderersContainer.progressToFullscreenMode != 1.0f) {
                    GroupCallActivity.this.shadowDrawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), iDp2);
                    GroupCallActivity.this.shadowDrawable.draw(canvas);
                    if (f != 1.0f) {
                        Theme.dialogs_onlineCirclePaint.setColor(GroupCallActivity.this.backgroundColor);
                        this.rect.set(((BottomSheet) GroupCallActivity.this).backgroundPaddingLeft, ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop + paddingTop, getMeasuredWidth() - ((BottomSheet) GroupCallActivity.this).backgroundPaddingLeft, ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop + paddingTop + AndroidUtilities.dp(24.0f));
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(12.0f) * f, AndroidUtilities.dp(12.0f) * f, Theme.dialogs_onlineCirclePaint);
                    }
                    Theme.dialogs_onlineCirclePaint.setColor(Color.argb((int) (GroupCallActivity.this.actionBar.getAlpha() * 255.0f), (int) (Color.red(GroupCallActivity.this.backgroundColor) * 0.8f), (int) (Color.green(GroupCallActivity.this.backgroundColor) * 0.8f), (int) (Color.blue(GroupCallActivity.this.backgroundColor) * 0.8f)));
                    canvas.drawRect(((BottomSheet) GroupCallActivity.this).backgroundPaddingLeft, 0.0f, getMeasuredWidth() - ((BottomSheet) GroupCallActivity.this).backgroundPaddingLeft, GroupCallActivity.this.getStatusBarHeight(), Theme.dialogs_onlineCirclePaint);
                    PrivateVideoPreviewDialog privateVideoPreviewDialog = GroupCallActivity.this.previewDialog;
                    if (privateVideoPreviewDialog != null) {
                        Theme.dialogs_onlineCirclePaint.setColor(privateVideoPreviewDialog.getBackgroundColor());
                        canvas.drawRect(((BottomSheet) GroupCallActivity.this).backgroundPaddingLeft, 0.0f, getMeasuredWidth() - ((BottomSheet) GroupCallActivity.this).backgroundPaddingLeft, GroupCallActivity.this.getStatusBarHeight(), Theme.dialogs_onlineCirclePaint);
                    }
                }
                if (GroupCallActivity.this.renderersContainer.progressToFullscreenMode != 0.0f) {
                    Theme.dialogs_onlineCirclePaint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_voipgroup_actionBar, false), (int) (GroupCallActivity.this.renderersContainer.progressToFullscreenMode * 255.0f)));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), Theme.dialogs_onlineCirclePaint);
                }
                if (GroupCallActivity.this.isRtmpStream() && LiteMode.isEnabled(512)) {
                    if (GroupCallActivity.this.renderersContainer.progressToFullscreenMode < 0.15d) {
                        if (!GroupCallActivity.this.needTextureLightning) {
                            GroupCallActivity.this.needTextureLightning = true;
                            GroupCallActivity.this.runUpdateTextureLightningRunnable();
                        }
                    } else if (GroupCallActivity.this.needTextureLightning) {
                        GroupCallActivity.this.needTextureLightning = false;
                        AndroidUtilities.cancelRunOnUIThread(GroupCallActivity.this.updateTextureLightningRunnable);
                    }
                }
                GroupCallActivity.this.reactionEffectImageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                GroupCallActivity.this.reactionEffectImageReceiver.draw(canvas);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (GroupCallActivity.this.scrimView != null && motionEvent.getAction() == 0) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.rect.set(GroupCallActivity.this.scrimPopupLayout.getX(), GroupCallActivity.this.scrimPopupLayout.getY(), GroupCallActivity.this.scrimPopupLayout.getX() + GroupCallActivity.this.scrimPopupLayout.getMeasuredWidth(), GroupCallActivity.this.scrimPopupLayout.getY() + GroupCallActivity.this.scrimPopupLayout.getMeasuredHeight());
                    boolean z2 = !this.rect.contains(x, y);
                    this.rect.set(GroupCallActivity.this.avatarPreviewContainer.getX(), GroupCallActivity.this.avatarPreviewContainer.getY(), GroupCallActivity.this.avatarPreviewContainer.getX() + GroupCallActivity.this.avatarPreviewContainer.getMeasuredWidth(), GroupCallActivity.this.avatarPreviewContainer.getY() + GroupCallActivity.this.avatarPreviewContainer.getMeasuredWidth() + GroupCallActivity.this.scrimView.getMeasuredHeight());
                    if (this.rect.contains(x, y)) {
                        z2 = false;
                    }
                    if (z2) {
                        GroupCallActivity.this.dismissAvatarPreview(true);
                        return true;
                    }
                }
                if (motionEvent.getAction() == 0 && GroupCallActivity.this.scrollOffsetY != 0.0f && motionEvent.getY() < GroupCallActivity.this.scrollOffsetY - AndroidUtilities.dp(37.0f) && GroupCallActivity.this.actionBar.getAlpha() == 0.0f && !GroupCallActivity.this.avatarsPreviewShowed) {
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    if (groupCallActivity2.previewDialog == null && !groupCallActivity2.renderersContainer.inFullscreenMode) {
                        GroupCallActivity.this.lambda$showGiftOfferSheet$15();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean onKeyDown(int i8, KeyEvent keyEvent) {
                if (GroupCallActivity.this.scrimView == null || i8 != 4) {
                    return super.onKeyDown(i8, keyEvent);
                }
                GroupCallActivity.this.dismissAvatarPreview(true);
                return true;
            }

            @Override
            public void onLayout(boolean z2, int i8, int i9, int i10, int i11) {
                float x;
                boolean z3;
                if (GroupCallActivity.isTabletMode && this.localHasVideo != GroupCallActivity.this.hasVideo && this.wasLayout) {
                    x = GroupCallActivity.this.listView.getX();
                    z3 = true;
                } else {
                    x = 0.0f;
                    z3 = false;
                }
                this.localHasVideo = GroupCallActivity.this.hasVideo;
                GroupCallActivity.this.renderersContainer.inLayout = true;
                super.onLayout(z2, i8, i9, i10, i11);
                GroupCallActivity.this.renderersContainer.inLayout = false;
                GroupCallActivity.this.updateLayout(false);
                this.wasLayout = true;
                if (!z3 || GroupCallActivity.this.listView.getLeft() == x) {
                    return;
                }
                float left = x - GroupCallActivity.this.listView.getLeft();
                GroupCallActivity.this.listView.setTranslationX(left);
                GroupCallActivity.this.buttonsContainer.setTranslationX(left);
                GroupCallActivity.this.buttonsBackgroundGradientView.setTranslationX(left);
                GroupCallActivity.this.buttonsBackgroundGradientView2.setTranslationX(left);
                ViewPropertyAnimator duration = GroupCallActivity.this.listView.animate().translationX(0.0f).setDuration(350L);
                CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
                duration.setInterpolator(cubicBezierInterpolator2).start();
                GroupCallActivity.this.buttonsBackgroundGradientView.animate().translationX(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator2).start();
                GroupCallActivity.this.buttonsBackgroundGradientView2.animate().translationX(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator2).start();
                GroupCallActivity.this.buttonsContainer.animate().translationX(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator2).start();
            }

            @Override
            public void onMeasure(int i8, int i9) {
                float f;
                int iDp;
                int size = View.MeasureSpec.getSize(i9);
                this.ignoreLayout = true;
                boolean z2 = View.MeasureSpec.getSize(i8) > size && !AndroidUtilities.isTablet();
                GroupCallActivity.this.renderersContainer.listWidth = View.MeasureSpec.getSize(i8);
                boolean z3 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i8) > size && !GroupCallActivity.this.isRtmpStream();
                if (GroupCallActivity.isLandscapeMode != z2) {
                    GroupCallActivity.isLandscapeMode = z2;
                    if (GroupCallActivity.this.muteButton.getMeasuredWidth() == 0) {
                        int i10 = GroupCallActivity.this.muteButton.getLayoutParams().width;
                    }
                    GroupCallActivity.this.invalidateLayoutFullscreen();
                    GroupCallActivity.this.layoutManager.setSpanCount(GroupCallActivity.isLandscapeMode ? 6 : 2);
                    GroupCallActivity.this.listView.invalidateItemDecorations();
                    GroupCallActivity.this.fullscreenUsersListView.invalidateItemDecorations();
                    this.updateRenderers = true;
                    if (GroupCallActivity.this.scheduleInfoTextView != null) {
                        GroupCallActivity.this.scheduleInfoTextView.setVisibility(!GroupCallActivity.isLandscapeMode ? 0 : 8);
                    }
                    if (GroupCallActivity.this.isRtmpLandscapeMode() == z2 && GroupCallActivity.this.isRtmpStream() && !GroupCallActivity.this.renderersContainer.inFullscreenMode && !GroupCallActivity.this.call.visibleVideoParticipants.isEmpty()) {
                        GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                        groupCallActivity2.fullscreenFor(groupCallActivity2.call.visibleVideoParticipants.get(0));
                        GroupCallActivity.this.renderersContainer.delayHideUi();
                    }
                }
                if (GroupCallActivity.isTabletMode != z3) {
                    GroupCallActivity.isTabletMode = z3;
                    GroupCallActivity.this.tabletVideoGridView.setVisibility(z3 ? 0 : 8);
                    GroupCallActivity.this.listView.invalidateItemDecorations();
                    GroupCallActivity.this.fullscreenUsersListView.invalidateItemDecorations();
                    this.updateRenderers = true;
                }
                if (this.updateRenderers) {
                    GroupCallActivity.this.applyCallParticipantUpdates(true);
                    GroupCallActivity.this.listAdapter.notifyDataSetChanged();
                    GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                    groupCallActivity3.fullscreenAdapter.update(false, groupCallActivity3.tabletVideoGridView);
                    if (GroupCallActivity.isTabletMode) {
                        GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                        groupCallActivity4.tabletGridAdapter.update(false, groupCallActivity4.tabletVideoGridView);
                    }
                    GroupCallActivity.this.tabletVideoGridView.setVisibility(GroupCallActivity.isTabletMode ? 0 : 8);
                    GroupCallActivity groupCallActivity5 = GroupCallActivity.this;
                    groupCallActivity5.tabletGridAdapter.setVisibility(groupCallActivity5.tabletVideoGridView, GroupCallActivity.isTabletMode && !groupCallActivity5.renderersContainer.inFullscreenMode, true);
                    GroupCallActivity groupCallActivity6 = GroupCallActivity.this;
                    groupCallActivity6.listViewVideoVisibility = !GroupCallActivity.isTabletMode || groupCallActivity6.renderersContainer.inFullscreenMode;
                    boolean z4 = !GroupCallActivity.isTabletMode && GroupCallActivity.this.renderersContainer.inFullscreenMode;
                    GroupCallActivity groupCallActivity7 = GroupCallActivity.this;
                    groupCallActivity7.fullscreenAdapter.setVisibility(groupCallActivity7.fullscreenUsersListView, z4);
                    GroupCallActivity.this.fullscreenUsersListView.setVisibility(z4 ? 0 : 8);
                    GroupCallActivity.this.listView.setVisibility((GroupCallActivity.isTabletMode || !GroupCallActivity.this.renderersContainer.inFullscreenMode) ? 0 : 8);
                    GroupCallActivity.this.layoutManager.setSpanCount(GroupCallActivity.isLandscapeMode ? 6 : 2);
                    GroupCallActivity.this.updateState(false, false);
                    GroupCallActivity.this.listView.invalidateItemDecorations();
                    GroupCallActivity.this.fullscreenUsersListView.invalidateItemDecorations();
                    AndroidUtilities.updateVisibleRows(GroupCallActivity.this.listView);
                    this.updateRenderers = false;
                    GroupCallActivity.this.attachedRenderersTmp.clear();
                    GroupCallActivity.this.attachedRenderersTmp.addAll(GroupCallActivity.this.attachedRenderers);
                    GroupCallActivity.this.renderersContainer.setIsTablet(GroupCallActivity.isTabletMode);
                    for (int i11 = 0; i11 < GroupCallActivity.this.attachedRenderersTmp.size(); i11++) {
                        ((GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderersTmp.get(i11)).updateAttachState(true);
                    }
                }
                int paddingTop = (size - getPaddingTop()) - (GroupCallActivity.this.isRtmpStream() ? AndroidUtilities.dp(72.0f) : AndroidUtilities.dp(245.0f));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) GroupCallActivity.this.renderersContainer.getLayoutParams();
                if (GroupCallActivity.isTabletMode) {
                    layoutParams.topMargin = ActionBar.getCurrentActionBarHeight();
                } else {
                    layoutParams.topMargin = 0;
                }
                for (int i12 = 0; i12 < 2; i12++) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) GroupCallActivity.this.undoView[i12].getLayoutParams();
                    if (GroupCallActivity.isTabletMode) {
                        layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
                    } else {
                        layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
                    }
                }
                RecyclerListView recyclerListView = GroupCallActivity.this.tabletVideoGridView;
                if (recyclerListView != null) {
                    ((FrameLayout.LayoutParams) recyclerListView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight();
                }
                if (GroupCallActivity.this.callMessageEnterView.getEmojiView() != null) {
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.callMessageEnterView.getEmojiView().getLayoutParams()).gravity = 80;
                }
                int iDp2 = AndroidUtilities.dp(GroupCallActivity.this.isRtmpStream() ? 40.0f : 90.0f);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) GroupCallActivity.this.listView.getLayoutParams();
                if (GroupCallActivity.isTabletMode) {
                    layoutParams3.gravity = GroupCallActivity.this.hasVideo ? 5 : 1;
                    layoutParams3.width = AndroidUtilities.dp(320.0f);
                    int iDp3 = AndroidUtilities.dp(4.0f);
                    layoutParams3.leftMargin = iDp3;
                    layoutParams3.rightMargin = iDp3;
                    layoutParams3.bottomMargin = iDp2;
                    layoutParams3.topMargin = ActionBar.getCurrentActionBarHeight();
                    iDp = AndroidUtilities.dp(60.0f);
                    f = 90.0f;
                } else {
                    f = 90.0f;
                    if (GroupCallActivity.isLandscapeMode) {
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
                        int iDp4 = AndroidUtilities.dp(60.0f);
                        layoutParams3.bottomMargin = iDp2;
                        layoutParams3.topMargin = AndroidUtilities.dp(14.0f) + ActionBar.getCurrentActionBarHeight();
                        int iDp5 = AndroidUtilities.dp(14.0f);
                        layoutParams3.leftMargin = iDp5;
                        layoutParams3.rightMargin = iDp5;
                        iDp = iDp4;
                    }
                }
                if (!GroupCallActivity.isLandscapeMode || GroupCallActivity.isTabletMode) {
                    GroupCallActivity.this.buttonsBackgroundGradientView.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) GroupCallActivity.this.buttonsBackgroundGradientView.getLayoutParams();
                    layoutParams4.bottomMargin = iDp2;
                    if (GroupCallActivity.isTabletMode) {
                        layoutParams4.gravity = GroupCallActivity.this.hasVideo ? 85 : 81;
                        layoutParams4.width = AndroidUtilities.dp(328.0f);
                    } else {
                        layoutParams4.width = -1;
                    }
                    GroupCallActivity.this.buttonsBackgroundGradientView2.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) GroupCallActivity.this.buttonsBackgroundGradientView2.getLayoutParams();
                    layoutParams5.height = iDp2;
                    if (GroupCallActivity.isTabletMode) {
                        layoutParams5.gravity = GroupCallActivity.this.hasVideo ? 85 : 81;
                        layoutParams5.width = AndroidUtilities.dp(328.0f);
                    } else {
                        layoutParams5.width = -1;
                    }
                } else {
                    GroupCallActivity.this.buttonsBackgroundGradientView.setVisibility(8);
                    GroupCallActivity.this.buttonsBackgroundGradientView2.setVisibility(8);
                }
                if (GroupCallActivity.isLandscapeMode) {
                    GroupCallActivity.this.fullscreenUsersListView.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
                } else {
                    GroupCallActivity.this.fullscreenUsersListView.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
                }
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) GroupCallActivity.this.buttonsContainer.getLayoutParams();
                if (GroupCallActivity.isTabletMode) {
                    layoutParams6.width = AndroidUtilities.dp(320.0f);
                    layoutParams6.height = AndroidUtilities.dp(120.0f);
                    layoutParams6.gravity = GroupCallActivity.this.hasVideo ? 85 : 81;
                    layoutParams6.rightMargin = 0;
                } else if (GroupCallActivity.isLandscapeMode) {
                    layoutParams6.width = AndroidUtilities.dp(f);
                    layoutParams6.height = -1;
                    layoutParams6.gravity = 53;
                } else {
                    layoutParams6.width = -1;
                    layoutParams6.height = AndroidUtilities.dp(120.0f);
                    layoutParams6.gravity = 81;
                    layoutParams6.rightMargin = 0;
                }
                if (!GroupCallActivity.isLandscapeMode || GroupCallActivity.isTabletMode) {
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBar.getLayoutParams()).rightMargin = 0;
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.menuItemsContainer.getLayoutParams()).rightMargin = 0;
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBarBackground.getLayoutParams()).rightMargin = 0;
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBarShadow.getLayoutParams()).rightMargin = 0;
                } else {
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBar.getLayoutParams()).rightMargin = AndroidUtilities.dp(f);
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.menuItemsContainer.getLayoutParams()).rightMargin = AndroidUtilities.dp(f);
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBarBackground.getLayoutParams()).rightMargin = AndroidUtilities.dp(f);
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBarShadow.getLayoutParams()).rightMargin = AndroidUtilities.dp(f);
                }
                FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) GroupCallActivity.this.fullscreenUsersListView.getLayoutParams();
                if (GroupCallActivity.isLandscapeMode) {
                    if (((LinearLayoutManager) GroupCallActivity.this.fullscreenUsersListView.getLayoutManager()).getOrientation() != 1) {
                        ((LinearLayoutManager) GroupCallActivity.this.fullscreenUsersListView.getLayoutManager()).setOrientation(1);
                    }
                    layoutParams7.height = -1;
                    layoutParams7.width = AndroidUtilities.dp(80.0f);
                    layoutParams7.gravity = 53;
                    layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
                    layoutParams7.bottomMargin = 0;
                } else {
                    if (((LinearLayoutManager) GroupCallActivity.this.fullscreenUsersListView.getLayoutManager()).getOrientation() != 0) {
                        ((LinearLayoutManager) GroupCallActivity.this.fullscreenUsersListView.getLayoutManager()).setOrientation(0);
                    }
                    layoutParams7.height = AndroidUtilities.dp(80.0f);
                    layoutParams7.width = -1;
                    layoutParams7.gravity = 80;
                    layoutParams7.rightMargin = 0;
                    layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
                }
                ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBarShadow.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight();
                GroupCallActivity.this.callMessageEnterUnderContainer.invalidate();
                FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) GroupCallActivity.this.callMessageEnterUnderContainer.getLayoutParams();
                layoutParams8.height = size;
                layoutParams8.topMargin = -getPaddingTop();
                if (GroupCallActivity.this.callMessageEnterView.getEmojiView() != null) {
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.callMessageEnterView.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
                }
                int iM = GroupCallActivity.isTabletMode ? 0 : MessageObject$$ExternalSyntheticOutline0.m(8.0f, paddingTop - Math.max(AndroidUtilities.dp(259.0f), (paddingTop / 5) * 3), 0);
                if (GroupCallActivity.this.listView.getPaddingTop() != iM || GroupCallActivity.this.listView.getPaddingBottom() != iDp) {
                    GroupCallActivity.this.listView.setPadding(0, iM, 0, iDp);
                }
                if (GroupCallActivity.this.watchersView != null) {
                    FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) GroupCallActivity.this.watchersView.getLayoutParams();
                    GroupCallGridCell groupCallGridCellFindGroupCallGridCell = GroupCallActivity.this.findGroupCallGridCell();
                    if (groupCallGridCellFindGroupCallGridCell != null) {
                        int measuredHeight = ((GroupCallActivity.this.buttonsContainer.getMeasuredHeight() / 2) + GroupCallActivity.this.buttonsContainer.getTop()) - (GroupCallActivity.this.leaveButton.getMeasuredHeight() / 2);
                        int measuredHeight2 = groupCallGridCellFindGroupCallGridCell.getMeasuredHeight() + ActionBar.getCurrentActionBarHeight() + iM;
                        layoutParams9.topMargin = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                        layoutParams9.height = AndroidUtilities.dp(70.0f);
                    }
                }
                if (GroupCallActivity.this.textureLightningView != null) {
                    FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) GroupCallActivity.this.textureLightningView.getLayoutParams();
                    GroupCallGridCell groupCallGridCellFindGroupCallGridCell2 = GroupCallActivity.this.findGroupCallGridCell();
                    if (groupCallGridCellFindGroupCallGridCell2 != null) {
                        layoutParams10.height = groupCallGridCellFindGroupCallGridCell2.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                        layoutParams10.width = groupCallGridCellFindGroupCallGridCell2.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                        int iDp6 = AndroidUtilities.dp(16.0f);
                        layoutParams10.leftMargin = iDp6;
                        layoutParams10.rightMargin = iDp6;
                    }
                }
                if (GroupCallActivity.this.scheduleStartAtTextView != null) {
                    int iDp7 = ((AndroidUtilities.dp(60.0f) + (paddingTop - iM)) / 2) + iM;
                    FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) GroupCallActivity.this.scheduleStartInTextView.getLayoutParams();
                    layoutParams11.topMargin = iDp7 - AndroidUtilities.dp(30.0f);
                    FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) GroupCallActivity.this.scheduleStartAtTextView.getLayoutParams();
                    layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + iDp7;
                    FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) GroupCallActivity.this.scheduleTimeTextView.getLayoutParams();
                    if (layoutParams11.topMargin < ActionBar.getCurrentActionBarHeight()) {
                        GroupCallActivity.this.scheduleStartInTextView.setVisibility(4);
                        GroupCallActivity.this.scheduleStartAtTextView.setVisibility(4);
                        layoutParams13.topMargin = iDp7 - AndroidUtilities.dp(20.0f);
                    } else if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin > size - AndroidUtilities.dp(231.0f)) {
                        GroupCallActivity.this.scheduleStartInTextView.setVisibility(4);
                        GroupCallActivity.this.scheduleStartAtTextView.setVisibility(4);
                        layoutParams13.topMargin = iDp7 - AndroidUtilities.dp(20.0f);
                    } else {
                        GroupCallActivity.this.scheduleStartInTextView.setVisibility(0);
                        GroupCallActivity.this.scheduleStartAtTextView.setVisibility(0);
                        layoutParams13.topMargin = iDp7;
                    }
                }
                for (int i13 = 0; i13 < GroupCallActivity.this.attachedRenderers.size(); i13++) {
                    ((GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderers.get(i13)).setFullscreenMode(GroupCallActivity.this.renderersContainer.inFullscreenMode, true);
                }
                this.ignoreLayout = false;
                super.onMeasure(i8, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
                if (measuredHeight3 != this.lastSize) {
                    this.lastSize = measuredHeight3;
                    GroupCallActivity.this.dismissAvatarPreview(false);
                }
                GroupCallActivity.this.cellFlickerDrawable.parentWidth = getMeasuredWidth();
                GroupCallActivity.this.checkGroupCallUiPositions_MessagesList();
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !GroupCallActivity.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }

            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                GroupCallActivity.this.updateTopBulletinY();
            }
        };
        groupCallActivity.sizeNotifierFrameLayout = sizeNotifierFrameLayout;
        groupCallActivity.containerView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setClipToPadding(false);
        groupCallActivity.containerView.setFocusable(true);
        groupCallActivity.containerView.setFocusableInTouchMode(true);
        groupCallActivity.containerView.setWillNotDraw(false);
        ViewGroup viewGroup = groupCallActivity.containerView;
        int i8 = groupCallActivity.backgroundPaddingLeft;
        viewGroup.setPadding(i8, 0, i8, 0);
        groupCallActivity.containerView.setKeepScreenOn(true);
        groupCallActivity.containerView.setClipChildren(false);
        groupCallActivity.reactionEffectImageReceiver = new ImageReceiver(groupCallActivity.containerView);
        if (inputPeer != null) {
            SimpleTextView simpleTextView = new SimpleTextView(activity);
            groupCallActivity.scheduleStartInTextView = simpleTextView;
            simpleTextView.setGravity(17);
            groupCallActivity.scheduleStartInTextView.setTextColor(-1);
            groupCallActivity.scheduleStartInTextView.setTypeface(AndroidUtilities.bold());
            groupCallActivity.scheduleStartInTextView.setTextSize(18);
            groupCallActivity.scheduleStartInTextView.setText(LocaleController.getString(R.string.VoipChatStartsIn));
            groupCallActivity.containerView.addView(groupCallActivity.scheduleStartInTextView, LayoutHelper.createFrame(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            SimpleTextView simpleTextView2 = new SimpleTextView(activity) {
                private float duration;
                private float gradientWidth;
                private int lastTextWidth;
                private long lastUpdateTime;
                private LinearGradient linearGradient;
                private float startX;
                private float time;
                private Matrix matrix = new Matrix();
                private float targetX = -1.0f;

                private void setTarget() {
                    this.targetX = ((Utilities.random.nextInt(100) - 50) * 0.2f) / 50.0f;
                }

                @Override
                public boolean createLayout(int i9) {
                    boolean zCreateLayout = super.createLayout(i9);
                    int textWidth = getTextWidth();
                    if (textWidth != this.lastTextWidth) {
                        float f = textWidth;
                        this.gradientWidth = 1.3f * f;
                        float textHeight = getTextHeight();
                        float f2 = f * 2.0f;
                        int color = Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient, false);
                        int color2 = Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient3, false);
                        int i10 = Theme.key_voipgroup_mutedByAdminGradient2;
                        this.linearGradient = new LinearGradient(0.0f, textHeight, f2, 0.0f, new int[]{color, color2, Theme.getColor(null, i10, false), Theme.getColor(null, i10, false)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
                        getPaint().setShader(this.linearGradient);
                        this.lastTextWidth = textWidth;
                    }
                    return zCreateLayout;
                }

                @Override
                public void onDraw(Canvas canvas) {
                    float f;
                    if (this.linearGradient != null) {
                        ChatObject.Call call2 = GroupCallActivity.this.call;
                        if (call2 == null || !call2.isScheduled()) {
                            f = 0.0f;
                        } else {
                            GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                            long currentTimeMillis = (((long) groupCallActivity2.call.call.schedule_date) * 1000) - groupCallActivity2.accountInstance.getConnectionsManager().getCurrentTimeMillis();
                            f = 1.0f;
                            if (currentTimeMillis >= 0) {
                                if (currentTimeMillis < 5000) {
                                    f = 1.0f - (currentTimeMillis / 5000.0f);
                                } else {
                                    f = 0.0f;
                                }
                            }
                        }
                        this.matrix.reset();
                        this.matrix.postTranslate((-this.lastTextWidth) * 0.7f * f, 0.0f);
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
                                setTarget();
                            }
                            this.startX = this.targetX;
                            setTarget();
                        }
                        float f3 = j;
                        float f4 = (GroupCallActivity.this.amplitude * BlobDrawable.GRADIENT_SPEED_MAX * 2.0f * f3) + ((BlobDrawable.GRADIENT_SPEED_MIN + 0.5f) * f3) + this.time;
                        this.time = f4;
                        float f5 = this.duration;
                        if (f4 > f5) {
                            this.time = f5;
                        }
                        float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.time / f5);
                        float f6 = this.gradientWidth;
                        float f7 = this.startX;
                        this.matrix.postTranslate(((((this.targetX - f7) * interpolation) + f7) * f6) - (f6 / 2.0f), 0.0f);
                        this.linearGradient.setLocalMatrix(this.matrix);
                        invalidate();
                    }
                    super.onDraw(canvas);
                }
            };
            groupCallActivity.scheduleTimeTextView = simpleTextView2;
            simpleTextView2.setGravity(17);
            groupCallActivity.scheduleTimeTextView.setTextColor(-1);
            groupCallActivity.scheduleTimeTextView.setTypeface(AndroidUtilities.bold());
            groupCallActivity.scheduleTimeTextView.setTextSize(60);
            groupCallActivity.containerView.addView(groupCallActivity.scheduleTimeTextView, LayoutHelper.createFrame(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            SimpleTextView simpleTextView3 = new SimpleTextView(activity);
            groupCallActivity.scheduleStartAtTextView = simpleTextView3;
            simpleTextView3.setGravity(17);
            groupCallActivity.scheduleStartAtTextView.setTextColor(-1);
            groupCallActivity.scheduleStartAtTextView.setTypeface(AndroidUtilities.bold());
            groupCallActivity.scheduleStartAtTextView.setTextSize(18);
            groupCallActivity.containerView.addView(groupCallActivity.scheduleStartAtTextView, LayoutHelper.createFrame(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (groupCallActivity.isRtmpStream()) {
            LightningView lightningView = groupCallActivity.new LightningView(activity);
            groupCallActivity.textureLightningView = lightningView;
            groupCallActivity.containerView.addView(lightningView, LayoutHelper.createFrame(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        RecyclerListView recyclerListView = new RecyclerListView(activity) {
            private final LongSparseIntArray visiblePeerTmp = new LongSparseIntArray();

            @Override
            public void dispatchDraw(Canvas canvas) {
                float f;
                int i9;
                int i10;
                boolean z2 = GroupCallActivity.this.itemAnimator.outMinTop != Float.MAX_VALUE;
                this.visiblePeerTmp.clear();
                for (int i11 = 0; i11 < GroupCallActivity.this.visiblePeerIds.size(); i11++) {
                    this.visiblePeerTmp.put(GroupCallActivity.this.visiblePeerIds.keyAt(i11), 1);
                }
                GroupCallActivity.this.visiblePeerIds.clear();
                int childCount = getChildCount();
                int i12 = 0;
                boolean z3 = false;
                float fMin = Float.MAX_VALUE;
                float fMax = 0.0f;
                while (i12 < childCount) {
                    View childAt = getChildAt(i12);
                    RecyclerView.ViewHolder viewHolderFindContainingViewHolder = findContainingViewHolder(childAt);
                    if (viewHolderFindContainingViewHolder == null || viewHolderFindContainingViewHolder.getItemViewType() == 3 || viewHolderFindContainingViewHolder.getItemViewType() == 4 || viewHolderFindContainingViewHolder.getItemViewType() == 5 || viewHolderFindContainingViewHolder.getItemViewType() == 6 || viewHolderFindContainingViewHolder.getItemViewType() == 7) {
                        i9 = childCount;
                        i10 = i12;
                    } else {
                        if (viewHolderFindContainingViewHolder.getItemViewType() == 1) {
                            View view = viewHolderFindContainingViewHolder.itemView;
                            if (view instanceof GroupCallUserCell) {
                                GroupCallUserCell groupCallUserCell = (GroupCallUserCell) view;
                                i9 = childCount;
                                GroupCallActivity.this.visiblePeerIds.append(groupCallUserCell.getPeerId(), 1);
                                i10 = i12;
                                if (this.visiblePeerTmp.get(groupCallUserCell.getPeerId(), 0) == 0) {
                                    z3 = true;
                                } else {
                                    this.visiblePeerTmp.delete(groupCallUserCell.getPeerId());
                                }
                            } else {
                                i9 = childCount;
                                i10 = i12;
                            }
                        } else {
                            i9 = childCount;
                            i10 = i12;
                        }
                        if (!z2) {
                            fMax = Math.max(fMax, childAt.getY() + childAt.getMeasuredHeight());
                            fMin = Math.min(fMin, Math.max(0.0f, childAt.getY()));
                        } else if (!GroupCallActivity.this.itemAnimator.removingHolders.contains(viewHolderFindContainingViewHolder)) {
                            fMin = Math.min(fMin, Math.max(0, childAt.getTop()));
                            fMax = Math.max(fMax, childAt.getBottom());
                        }
                    }
                    i12 = i10 + 1;
                    childCount = i9;
                }
                if (this.visiblePeerTmp.size() > 0) {
                    z3 = true;
                }
                if (z3) {
                    GroupCallActivity.this.updateSubtitle();
                }
                if (z2) {
                    f = (GroupCallActivity.this.itemAnimator.animationProgress * fMin) + ((1.0f - GroupCallActivity.this.itemAnimator.animationProgress) * GroupCallActivity.this.itemAnimator.outMinTop);
                    fMax = (fMax * GroupCallActivity.this.itemAnimator.animationProgress) + ((1.0f - GroupCallActivity.this.itemAnimator.animationProgress) * GroupCallActivity.this.itemAnimator.outMaxBottom);
                } else {
                    f = fMin;
                }
                if (fMin != Float.MAX_VALUE) {
                    int measuredWidth = (getMeasuredWidth() - (AndroidUtilities.isTablet() ? Math.min(AndroidUtilities.dp(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1;
                    GroupCallActivity.this.rect.set(measuredWidth, f, getMeasuredWidth() - measuredWidth, Math.min(getMeasuredHeight() - getTranslationY(), fMax));
                    canvas.drawRoundRect(GroupCallActivity.this.rect, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), GroupCallActivity.this.listViewBackgroundPaint);
                }
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                super.dispatchDraw(canvas);
                canvas.restore();
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (view == GroupCallActivity.this.scrimView) {
                    return false;
                }
                return super.drawChild(canvas, view, j);
            }

            @Override
            public void onLayout(boolean z2, int i9, int i10, int i11, int i12) {
                super.onLayout(z2, i9, i10, i11, i12);
                GroupCallActivity.this.itemAnimator.updateBackgroundBeforeAnimation();
            }

            @Override
            public void setVisibility(int i9) {
                if (getVisibility() != i9) {
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        View childAt = getChildAt(i10);
                        if (childAt instanceof GroupCallGridCell) {
                            GroupCallActivity.this.attachRenderer((GroupCallGridCell) childAt, childAt.isAttachedToWindow() && i9 == 0);
                        }
                    }
                }
                super.setVisibility(i9);
            }
        };
        groupCallActivity.listView = recyclerListView;
        recyclerListView.setClipToPadding(false);
        groupCallActivity.listView.setClipChildren(false);
        GroupCallItemAnimator groupCallItemAnimator = new GroupCallItemAnimator();
        groupCallActivity.itemAnimator = groupCallItemAnimator;
        groupCallItemAnimator.setTranslationInterpolator(cubicBezierInterpolator);
        groupCallItemAnimator.setRemoveDuration(350L);
        groupCallItemAnimator.setAddDuration(350L);
        groupCallItemAnimator.setMoveDuration(350L);
        groupCallItemAnimator.setDelayAnimations(false);
        groupCallActivity.listView.lambda$onCellEnter$52(groupCallItemAnimator);
        groupCallActivity.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i9) {
                if (i9 != 0) {
                    if (GroupCallActivity.this.recordHintView != null) {
                        GroupCallActivity.this.recordHintView.hide();
                    }
                    if (GroupCallActivity.this.reminderHintView != null) {
                        GroupCallActivity.this.reminderHintView.hide();
                        return;
                    }
                    return;
                }
                if ((GroupCallActivity.this.scrollOffsetY - AndroidUtilities.dp(74.0f)) + ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop >= ActionBar.getCurrentActionBarHeight() || !GroupCallActivity.this.listView.canScrollVertically(1)) {
                    return;
                }
                GroupCallActivity.this.listView.getChildAt(0);
                RecyclerListView.Holder holder = (RecyclerListView.Holder) GroupCallActivity.this.listView.findViewHolderForAdapterPosition(0);
                if (holder == null || holder.itemView.getTop() <= 0) {
                    return;
                }
                GroupCallActivity.this.listView.smoothScrollBy(0, holder.itemView.getTop());
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i9, int i10) {
                GroupCallActivity groupCallActivity2;
                ChatObject.Call call2;
                if (GroupCallActivity.this.listView.getChildCount() <= 0 || (call2 = (groupCallActivity2 = GroupCallActivity.this).call) == null) {
                    return;
                }
                if (!call2.loadingMembers && !call2.membersLoadEndReached && groupCallActivity2.layoutManager.findLastVisibleItemPosition() > GroupCallActivity.this.listAdapter.getItemCount() - 5) {
                    GroupCallActivity.this.call.loadMembers(false);
                }
                GroupCallActivity.this.updateLayout(true);
                if (GroupCallActivity.this.textureLightningView != null) {
                    GroupCallActivity.this.textureLightningView.invalidate();
                }
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }
        });
        groupCallActivity.listView.setVerticalScrollBarEnabled(false);
        RecyclerListView recyclerListView2 = groupCallActivity.listView;
        FillLastGridLayoutManager fillLastGridLayoutManager = new FillLastGridLayoutManager(groupCallActivity.getContext(), isLandscapeMode ? 6 : 2, 1, false, 0, groupCallActivity.listView);
        groupCallActivity.layoutManager = fillLastGridLayoutManager;
        recyclerListView2.setLayoutManager(fillLastGridLayoutManager);
        GridLayoutManager.SpanSizeLookup spanSizeLookup = new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i9) {
                int i10 = GroupCallActivity.isLandscapeMode ? 6 : 2;
                if (GroupCallActivity.isTabletMode || i9 < GroupCallActivity.this.listAdapter.usersVideoGridStartRow || i9 >= GroupCallActivity.this.listAdapter.usersVideoGridEndRow) {
                    return i10;
                }
                int i11 = GroupCallActivity.this.listAdapter.usersVideoGridEndRow - GroupCallActivity.this.listAdapter.usersVideoGridStartRow;
                int i12 = (i9 != GroupCallActivity.this.listAdapter.usersVideoGridEndRow - 1 || (!GroupCallActivity.isLandscapeMode && i11 % 2 == 0)) ? 1 : 2;
                if (!GroupCallActivity.isLandscapeMode) {
                    return i12;
                }
                if (i11 == 1) {
                    return 6;
                }
                return i11 == 2 ? 3 : 2;
            }
        };
        groupCallActivity.spanSizeLookup = spanSizeLookup;
        fillLastGridLayoutManager.setSpanSizeLookup(spanSizeLookup);
        groupCallActivity.listView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition >= 0) {
                    rect.setEmpty();
                    if (childAdapterPosition < GroupCallActivity.this.listAdapter.usersVideoGridStartRow || childAdapterPosition >= GroupCallActivity.this.listAdapter.usersVideoGridEndRow) {
                        return;
                    }
                    int i9 = childAdapterPosition - GroupCallActivity.this.listAdapter.usersVideoGridStartRow;
                    int i10 = GroupCallActivity.isLandscapeMode ? 6 : 2;
                    int i11 = i9 % i10;
                    if (i11 == 0) {
                        rect.right = AndroidUtilities.dp(2.0f);
                    } else if (i11 == i10 - 1) {
                        rect.left = AndroidUtilities.dp(2.0f);
                    } else {
                        rect.left = AndroidUtilities.dp(1.0f);
                    }
                }
            }
        });
        fillLastGridLayoutManager.setBind(false);
        groupCallActivity.containerView.addView(groupCallActivity.listView, LayoutHelper.createFrame(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        groupCallActivity.listView.setAdapter(listAdapter);
        groupCallActivity.listView.setTopBottomSelectorRadius(13);
        groupCallActivity.listView.setSelectorDrawableColor(Theme.getColor(Theme.key_voipgroup_listSelector));
        groupCallActivity.listView.setOnItemClickListener(new WearAuthSheet$$ExternalSyntheticLambda5(groupCallActivity, activity, call, 24));
        groupCallActivity.listView.setOnItemLongClickListener(new GroupCallActivity$$ExternalSyntheticLambda10(groupCallActivity, 5));
        if (groupCallActivity.isRtmpStream()) {
            WatchersView watchersView = groupCallActivity.new WatchersView(groupCallActivity.getContext());
            groupCallActivity.watchersView = watchersView;
            groupCallActivity.containerView.addView(watchersView, LayoutHelper.createFrame(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        RecyclerListView recyclerListView3 = new RecyclerListView(activity);
        groupCallActivity.tabletVideoGridView = recyclerListView3;
        groupCallActivity.containerView.addView(recyclerListView3, LayoutHelper.createFrame(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        RecyclerListView recyclerListView4 = groupCallActivity.tabletVideoGridView;
        GroupCallTabletGridAdapter groupCallTabletGridAdapter = new GroupCallTabletGridAdapter(call, groupCallActivity.currentAccount, groupCallActivity);
        groupCallActivity.tabletGridAdapter = groupCallTabletGridAdapter;
        recyclerListView4.setAdapter(groupCallTabletGridAdapter);
        final int i9 = 1;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(6, 1, false);
        groupCallActivity.tabletVideoGridView.setLayoutManager(gridLayoutManager);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i10) {
                return GroupCallActivity.this.tabletGridAdapter.getSpanCount(i10);
            }
        });
        groupCallActivity.tabletVideoGridView.setOnItemClickListener(new RecyclerListView.OnItemClickListener(groupCallActivity) {
            public final GroupCallActivity f$0;

            {
                this.f$0 = groupCallActivity;
            }

            @Override
            public final void onItemClick(View view, int i10) {
                switch (i9) {
                    case 0:
                        this.f$0.lambda$new$37(view, i10);
                        break;
                    default:
                        this.f$0.lambda$new$26(view, i10);
                        break;
                }
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setTranslationInterpolator(cubicBezierInterpolator);
        defaultItemAnimator.setRemoveDuration(350L);
        defaultItemAnimator.setAddDuration(350L);
        defaultItemAnimator.setMoveDuration(350L);
        groupCallActivity.tabletVideoGridView.lambda$onCellEnter$52(new DefaultItemAnimator() {
            @Override
            public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                GroupCallActivity.this.listView.invalidate();
                GroupCallActivity.this.renderersContainer.invalidate();
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                GroupCallActivity.this.updateLayout(true);
            }
        });
        groupCallActivity.tabletVideoGridView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
                super.onScrolled(recyclerView, i10, i11);
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }
        });
        groupCallActivity.tabletGridAdapter.setVisibility(groupCallActivity.tabletVideoGridView, false, false);
        groupCallActivity.tabletVideoGridView.setVisibility(8);
        GroupCallActivityButtonsLayout groupCallActivityButtonsLayout = new GroupCallActivityButtonsLayout(activity) {
            int currentLightColor;
            final OvershootInterpolator overshootInterpolator = new OvershootInterpolator(1.5f);

            @Override
            public void dispatchDraw(Canvas canvas) {
                boolean z2;
                float f;
                float f2;
                int i10;
                float f3;
                int iDp;
                float f4;
                float f5;
                float f6;
                float measuredWidth;
                float y;
                float fDp;
                float f7;
                float f8;
                float f9;
                float f10;
                boolean z3;
                boolean z4;
                int iBlendARGB;
                int iBlendARGB2;
                int iBlendARGB3;
                int iBlendARGB4;
                if (GroupCallActivity.this.contentFullyOverlayed && GroupCallActivity.this.useBlur) {
                    return;
                }
                int measuredWidth2 = (getMeasuredWidth() - getMeasuredHeight()) / 2;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - GroupCallActivity.this.lastUpdateTime;
                GroupCallActivity.this.lastUpdateTime = jElapsedRealtime;
                if (j > 20) {
                    j = 17;
                }
                long j2 = j;
                if (GroupCallActivity.this.currentState != null) {
                    GroupCallActivity.this.currentState.update(0, measuredWidth2, getMeasuredHeight(), j2, GroupCallActivity.this.amplitude);
                }
                GroupCallActivity.this.tinyWaveDrawable.minRadius = AndroidUtilities.dp(62.0f) * 0.46296296f;
                GroupCallActivity.this.tinyWaveDrawable.maxRadius = AndroidUtilities$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(20.0f), BlobDrawable.FORM_SMALL_MAX, AndroidUtilities.dp(62.0f), 0.48076922f);
                GroupCallActivity.this.bigWaveDrawable.minRadius = AndroidUtilities.dp(65.0f) * 0.46296296f;
                GroupCallActivity.this.bigWaveDrawable.maxRadius = AndroidUtilities$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(20.0f), BlobDrawable.FORM_BIG_MAX, AndroidUtilities.dp(65.0f), 0.48076922f);
                if (GroupCallActivity.this.animateToAmplitude != GroupCallActivity.this.amplitude) {
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    GroupCallActivity.access$12516(groupCallActivity2, groupCallActivity2.animateAmplitudeDiff * j2);
                    if (GroupCallActivity.this.animateAmplitudeDiff > 0.0f) {
                        if (GroupCallActivity.this.amplitude > GroupCallActivity.this.animateToAmplitude) {
                            GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                            groupCallActivity3.amplitude = groupCallActivity3.animateToAmplitude;
                        }
                    } else if (GroupCallActivity.this.amplitude < GroupCallActivity.this.animateToAmplitude) {
                        GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                        groupCallActivity4.amplitude = groupCallActivity4.animateToAmplitude;
                    }
                }
                int i11 = 1;
                if (GroupCallActivity.this.prevState != null && GroupCallActivity.this.prevState.currentState == 3) {
                    GroupCallActivity.this.radialProgressView.toCircle(true, true);
                    z2 = GroupCallActivity.this.radialProgressView.isCircle();
                    if (!z2) {
                        if (GroupCallActivity.this.switchProgress != 1.0f) {
                            if (GroupCallActivity.this.prevState == null && GroupCallActivity.this.prevState.currentState == 3) {
                                GroupCallActivity.access$14516(GroupCallActivity.this, j2 / 100.0f);
                            } else {
                                GroupCallActivity.access$14516(GroupCallActivity.this, j2 / 180.0f);
                            }
                            if (GroupCallActivity.this.switchProgress >= 1.0f) {
                                GroupCallActivity.this.switchProgress = 1.0f;
                                GroupCallActivity.this.prevState = null;
                                if (GroupCallActivity.this.currentState != null && GroupCallActivity.this.currentState.currentState == 3) {
                                    GroupCallActivity.this.radialProgressView.toCircle(false, true);
                                }
                            }
                            GroupCallActivity.this.invalidateColors = true;
                        }
                        if (GroupCallActivity.this.invalidateColors || GroupCallActivity.this.currentState == null) {
                            f8 = 180.0f;
                            f9 = 1.0f;
                            f10 = 0.0f;
                        } else {
                            GroupCallActivity.this.invalidateColors = false;
                            if (GroupCallActivity.this.prevState != null) {
                                GroupCallActivity groupCallActivity5 = GroupCallActivity.this;
                                groupCallActivity5.fillColors(groupCallActivity5.prevState.currentState, GroupCallActivity.this.colorsTmp);
                                int i12 = GroupCallActivity.this.colorsTmp[0];
                                int i13 = GroupCallActivity.this.colorsTmp[1];
                                int i14 = GroupCallActivity.this.colorsTmp[2];
                                f8 = 180.0f;
                                int i15 = GroupCallActivity.this.colorsTmp[3];
                                GroupCallActivity groupCallActivity6 = GroupCallActivity.this;
                                f9 = 1.0f;
                                f10 = 0.0f;
                                groupCallActivity6.fillColors(groupCallActivity6.currentState.currentState, GroupCallActivity.this.colorsTmp);
                                iBlendARGB = ColorUtils.blendARGB(GroupCallActivity.this.switchProgress, i12, GroupCallActivity.this.colorsTmp[0]);
                                iBlendARGB2 = ColorUtils.blendARGB(GroupCallActivity.this.switchProgress, i13, GroupCallActivity.this.colorsTmp[1]);
                                iBlendARGB3 = ColorUtils.blendARGB(GroupCallActivity.this.switchProgress, i14, GroupCallActivity.this.colorsTmp[2]);
                                iBlendARGB4 = ColorUtils.blendARGB(GroupCallActivity.this.switchProgress, i15, GroupCallActivity.this.colorsTmp[3]);
                            } else {
                                f8 = 180.0f;
                                f9 = 1.0f;
                                f10 = 0.0f;
                                GroupCallActivity groupCallActivity7 = GroupCallActivity.this;
                                groupCallActivity7.fillColors(groupCallActivity7.currentState.currentState, GroupCallActivity.this.colorsTmp);
                                iBlendARGB = GroupCallActivity.this.colorsTmp[0];
                                iBlendARGB2 = GroupCallActivity.this.colorsTmp[1];
                                iBlendARGB3 = GroupCallActivity.this.colorsTmp[2];
                                iBlendARGB4 = GroupCallActivity.this.colorsTmp[3];
                            }
                            if (this.currentLightColor != iBlendARGB) {
                                GroupCallActivity.this.radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(45.454548f), new int[]{ColorUtils.setAlphaComponent(iBlendARGB, 60), ColorUtils.setAlphaComponent(iBlendARGB, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                                GroupCallActivity.this.radialPaint.setShader(GroupCallActivity.this.radialGradient);
                                this.currentLightColor = iBlendARGB;
                            }
                            GroupCallActivity.this.messageButton.setBackgroundColor(iBlendARGB3, iBlendARGB2);
                            GroupCallActivity.this.soundButton.setBackgroundColor(iBlendARGB3, iBlendARGB2);
                            GroupCallActivity.this.cameraButton.setBackgroundColor(iBlendARGB3, iBlendARGB2);
                            GroupCallActivity.this.flipButton.setBackgroundColor(iBlendARGB3, iBlendARGB2);
                            VoIPToggleButton voIPToggleButton = GroupCallActivity.this.leaveButton;
                            int i16 = Theme.key_voipgroup_leaveButton;
                            voIPToggleButton.setBackgroundColor(Theme.getColor(null, i16, false), Theme.getColor(null, i16, false));
                            GroupCallActivity.this.speakerButton.setBackgroundColor(iBlendARGB2, iBlendARGB4);
                        }
                        if (GroupCallActivity.this.currentState != null) {
                            if (GroupCallActivity.this.currentState.currentState != 1 || GroupCallActivity.this.currentState.currentState == 0 || GroupCallActivity.isGradientState(GroupCallActivity.this.currentState.currentState)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z4 = GroupCallActivity.this.currentState.currentState != 3;
                            if (GroupCallActivity.this.prevState == null && GroupCallActivity.this.currentState != null && GroupCallActivity.this.currentState.currentState == 3) {
                                GroupCallActivity.access$15624(GroupCallActivity.this, j2 / f8);
                                if (GroupCallActivity.this.showWavesProgress < f10) {
                                    GroupCallActivity.this.showWavesProgress = 0.0f;
                                }
                            } else if (!z3 && GroupCallActivity.this.showWavesProgress != f9) {
                                GroupCallActivity.access$15616(GroupCallActivity.this, j2 / 350.0f);
                                if (GroupCallActivity.this.showWavesProgress > f9) {
                                    GroupCallActivity.this.showWavesProgress = 1.0f;
                                }
                            } else if (!z3 && GroupCallActivity.this.showWavesProgress != 0.0f) {
                                GroupCallActivity.access$15624(GroupCallActivity.this, j2 / 350.0f);
                                if (GroupCallActivity.this.showWavesProgress < 0.0f) {
                                    GroupCallActivity.this.showWavesProgress = 0.0f;
                                }
                            }
                            if (!z4 && GroupCallActivity.this.showLightingProgress != 1.0f) {
                                GroupCallActivity.access$15716(GroupCallActivity.this, j2 / 350.0f);
                                if (GroupCallActivity.this.showLightingProgress > 1.0f) {
                                    GroupCallActivity.this.showLightingProgress = 1.0f;
                                }
                            } else if (!z4 && GroupCallActivity.this.showLightingProgress != 0.0f) {
                                GroupCallActivity.access$15724(GroupCallActivity.this, j2 / 350.0f);
                                if (GroupCallActivity.this.showLightingProgress < 0.0f) {
                                    GroupCallActivity.this.showLightingProgress = 0.0f;
                                }
                            }
                        } else {
                            z3 = false;
                        }
                        if (GroupCallActivity.this.prevState == null) {
                            if (!z3) {
                                if (!z3) {
                                    GroupCallActivity.access$15624(GroupCallActivity.this, j2 / 350.0f);
                                    if (GroupCallActivity.this.showWavesProgress < 0.0f) {
                                        GroupCallActivity.this.showWavesProgress = 0.0f;
                                    }
                                }
                            } else if (!z3) {
                                GroupCallActivity.access$15624(GroupCallActivity.this, j2 / 350.0f);
                                if (GroupCallActivity.this.showWavesProgress < 0.0f) {
                                    GroupCallActivity.this.showWavesProgress = 0.0f;
                                }
                            }
                        } else if (!z3) {
                            if (!z3) {
                                GroupCallActivity.access$15624(GroupCallActivity.this, j2 / 350.0f);
                                if (GroupCallActivity.this.showWavesProgress < 0.0f) {
                                    GroupCallActivity.this.showWavesProgress = 0.0f;
                                }
                            }
                        } else if (!z3) {
                            GroupCallActivity.access$15624(GroupCallActivity.this, j2 / 350.0f);
                            if (GroupCallActivity.this.showWavesProgress < 0.0f) {
                                GroupCallActivity.this.showWavesProgress = 0.0f;
                            }
                        }
                        if (!z4) {
                            if (!z4) {
                                GroupCallActivity.access$15724(GroupCallActivity.this, j2 / 350.0f);
                                if (GroupCallActivity.this.showLightingProgress < 0.0f) {
                                    GroupCallActivity.this.showLightingProgress = 0.0f;
                                }
                            }
                        } else if (!z4) {
                            GroupCallActivity.access$15724(GroupCallActivity.this, j2 / 350.0f);
                            if (GroupCallActivity.this.showLightingProgress < 0.0f) {
                                GroupCallActivity.this.showLightingProgress = 0.0f;
                            }
                        }
                    }
                    float interpolation = (this.overshootInterpolator.getInterpolation(GroupCallActivity.this.showWavesProgress) * 0.6f) + 0.4f;
                    GroupCallActivity.this.bigWaveDrawable.update(GroupCallActivity.this.amplitude, 1.0f);
                    GroupCallActivity.this.tinyWaveDrawable.update(GroupCallActivity.this.amplitude, 1.0f);
                    f = 25.909092f;
                    f2 = 2.0f;
                    if (GroupCallActivity.this.prevState != null || GroupCallActivity.this.currentState == null || GroupCallActivity.this.isRtmpStream() || !(GroupCallActivity.this.currentState.currentState == 3 || GroupCallActivity.this.prevState.currentState == 3)) {
                        i10 = 0;
                        while (i10 < 2) {
                            float fDp2 = AndroidUtilities.dp(f);
                            if (i10 != 0 && GroupCallActivity.this.prevState != null) {
                                if (!GroupCallActivity.this.isRtmpStream()) {
                                    GroupCallActivity.this.paint.setShader(GroupCallActivity.this.prevState.shader);
                                }
                                f3 = 1.0f - GroupCallActivity.this.switchProgress;
                                if (GroupCallActivity.this.prevState.currentState == 3) {
                                    iDp = AndroidUtilities.dp(f2);
                                    fDp2 -= iDp * f3;
                                    if (GroupCallActivity.this.paint.getShader() == null) {
                                        f4 = 25.0f;
                                    } else {
                                        f4 = 25.0f;
                                    }
                                    if (GroupCallActivity.this.isRtmpStream()) {
                                        int color = Theme.getColor(null, Theme.key_voipgroup_rtmpButton, false);
                                        int i17 = Theme.key_voipgroup_disabledButton;
                                        int offsetColor = AndroidUtilities.getOffsetColor(color, Theme.getColor(null, i17, false), GroupCallActivity.this.colorProgress, 1.0f);
                                        GroupCallActivity.this.paint.setColor(offsetColor);
                                        GroupCallActivity.this.paint.setShader(null);
                                        VoIPToggleButton voIPToggleButton2 = GroupCallActivity.this.soundButton;
                                        int i18 = Theme.key_voipgroup_listViewBackgroundUnscrolled;
                                        f5 = 255.0f;
                                        f6 = 2.0f;
                                        voIPToggleButton2.setBackgroundColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, i18, false), Theme.getColor(null, i17, false), GroupCallActivity.this.colorProgress, 1.0f), offsetColor);
                                        GroupCallActivity.this.messageButton.setBackgroundColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, i18, false), Theme.getColor(null, i17, false), GroupCallActivity.this.colorProgress, 1.0f), offsetColor);
                                    } else {
                                        f5 = 255.0f;
                                        f6 = 2.0f;
                                    }
                                    measuredWidth = (int) ((GroupCallActivity.this.muteButton.getMeasuredWidth() / f6) + GroupCallActivity.this.muteButton.getX());
                                    y = (int) (GroupCallActivity.this.muteButton.getY() + AndroidUtilities.dp(f4));
                                    GroupCallActivity.this.radialMatrix.setTranslate(measuredWidth, y);
                                    GroupCallActivity.this.radialGradient.setLocalMatrix(GroupCallActivity.this.radialMatrix);
                                    GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.switchToButtonProgress * 76.0f * f3));
                                    canvas.save();
                                    canvas.scale(GroupCallActivity.this.muteButton.getScaleX() * BlobDrawable.GLOBAL_SCALE, GroupCallActivity.this.muteButton.getScaleX() * BlobDrawable.GLOBAL_SCALE, measuredWidth, y);
                                    canvas.save();
                                    float f11 = (GroupCallActivity.this.amplitude * BlobDrawable.SCALE_BIG * 0.5f) + BlobDrawable.SCALE_BIG_MIN;
                                    canvas.scale(GroupCallActivity.this.showLightingProgress * f11, GroupCallActivity.this.showLightingProgress * f11, measuredWidth, y);
                                    if (i10 != 1) {
                                    }
                                    canvas.restore();
                                    if (!GroupCallActivity.this.isRtmpStream()) {
                                        canvas.save();
                                        float f12 = (GroupCallActivity.this.amplitude * BlobDrawable.SCALE_BIG * interpolation) + BlobDrawable.SCALE_BIG_MIN;
                                        canvas.scale(f12, f12, measuredWidth, y);
                                        GroupCallActivity.this.bigWaveDrawable.draw(measuredWidth, y, canvas, GroupCallActivity.this.paint);
                                        canvas.restore();
                                        canvas.save();
                                        float f13 = (GroupCallActivity.this.amplitude * BlobDrawable.SCALE_SMALL * interpolation) + BlobDrawable.SCALE_SMALL_MIN;
                                        canvas.scale(f13, f13, measuredWidth, y);
                                        GroupCallActivity.this.tinyWaveDrawable.draw(measuredWidth, y, canvas, GroupCallActivity.this.paint);
                                        canvas.restore();
                                    }
                                    if (GroupCallActivity.isLandscapeMode) {
                                        if (i10 == 0) {
                                            GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.switchToButtonInt2 * f5));
                                        } else {
                                            GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.switchToButtonInt2 * f3 * f5));
                                        }
                                    } else if (i10 == 0) {
                                        GroupCallActivity.this.paint.setAlpha(255);
                                    } else {
                                        GroupCallActivity.this.paint.setAlpha((int) (f3 * f5));
                                    }
                                    float measuredWidth3 = (getMeasuredWidth() / f6) - AndroidUtilities.dp(21.0f);
                                    float fDp3 = AndroidUtilities.dp(24.0f);
                                    float f14 = GroupCallActivity.this.switchToButtonProgress * ((fDp2 - measuredWidth3) + measuredWidth3);
                                    float f15 = GroupCallActivity.this.switchToButtonProgress * ((fDp2 - fDp3) + fDp3);
                                    GroupCallActivity.this.rect.set(measuredWidth - f14, y - f15, f14 + measuredWidth, f15 + y);
                                    fDp = (fDp2 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                                    GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.switchToButtonProgress * GroupCallActivity.this.paint.getAlpha()));
                                    canvas.drawRoundRect(GroupCallActivity.this.rect, fDp, fDp, GroupCallActivity.this.paint);
                                    if (i10 == 1) {
                                        if (GroupCallActivity.this.isRtmpStream()) {
                                            GroupCallActivity.this.radialProgressView.setSize((int) ((fDp * f6) - AndroidUtilities.dp(4.0f)));
                                        }
                                        GroupCallActivity.this.radialProgressView.draw(canvas, measuredWidth, y);
                                    }
                                    canvas.restore();
                                    if (GroupCallActivity.this.scheduleButtonTextView == null) {
                                    }
                                } else {
                                    if (GroupCallActivity.this.paint.getShader() == null) {
                                        f4 = 25.0f;
                                    } else {
                                        f4 = 25.0f;
                                    }
                                    if (GroupCallActivity.this.isRtmpStream()) {
                                        int color2 = Theme.getColor(null, Theme.key_voipgroup_rtmpButton, false);
                                        int i19 = Theme.key_voipgroup_disabledButton;
                                        int offsetColor2 = AndroidUtilities.getOffsetColor(color2, Theme.getColor(null, i19, false), GroupCallActivity.this.colorProgress, 1.0f);
                                        GroupCallActivity.this.paint.setColor(offsetColor2);
                                        GroupCallActivity.this.paint.setShader(null);
                                        VoIPToggleButton voIPToggleButton3 = GroupCallActivity.this.soundButton;
                                        int i110 = Theme.key_voipgroup_listViewBackgroundUnscrolled;
                                        f5 = 255.0f;
                                        f6 = 2.0f;
                                        voIPToggleButton3.setBackgroundColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, i110, false), Theme.getColor(null, i19, false), GroupCallActivity.this.colorProgress, 1.0f), offsetColor2);
                                        GroupCallActivity.this.messageButton.setBackgroundColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, i110, false), Theme.getColor(null, i19, false), GroupCallActivity.this.colorProgress, 1.0f), offsetColor2);
                                    } else {
                                        f5 = 255.0f;
                                        f6 = 2.0f;
                                    }
                                    measuredWidth = (int) ((GroupCallActivity.this.muteButton.getMeasuredWidth() / f6) + GroupCallActivity.this.muteButton.getX());
                                    y = (int) (GroupCallActivity.this.muteButton.getY() + AndroidUtilities.dp(f4));
                                    GroupCallActivity.this.radialMatrix.setTranslate(measuredWidth, y);
                                    GroupCallActivity.this.radialGradient.setLocalMatrix(GroupCallActivity.this.radialMatrix);
                                    GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.switchToButtonProgress * 76.0f * f3));
                                    canvas.save();
                                    canvas.scale(GroupCallActivity.this.muteButton.getScaleX() * BlobDrawable.GLOBAL_SCALE, GroupCallActivity.this.muteButton.getScaleX() * BlobDrawable.GLOBAL_SCALE, measuredWidth, y);
                                    canvas.save();
                                    float f16 = (GroupCallActivity.this.amplitude * BlobDrawable.SCALE_BIG * 0.5f) + BlobDrawable.SCALE_BIG_MIN;
                                    canvas.scale(GroupCallActivity.this.showLightingProgress * f16, GroupCallActivity.this.showLightingProgress * f16, measuredWidth, y);
                                    if (i10 != 1) {
                                    }
                                    canvas.restore();
                                    if (!GroupCallActivity.this.isRtmpStream()) {
                                        canvas.save();
                                        float f17 = (GroupCallActivity.this.amplitude * BlobDrawable.SCALE_BIG * interpolation) + BlobDrawable.SCALE_BIG_MIN;
                                        canvas.scale(f17, f17, measuredWidth, y);
                                        GroupCallActivity.this.bigWaveDrawable.draw(measuredWidth, y, canvas, GroupCallActivity.this.paint);
                                        canvas.restore();
                                        canvas.save();
                                        float f18 = (GroupCallActivity.this.amplitude * BlobDrawable.SCALE_SMALL * interpolation) + BlobDrawable.SCALE_SMALL_MIN;
                                        canvas.scale(f18, f18, measuredWidth, y);
                                        GroupCallActivity.this.tinyWaveDrawable.draw(measuredWidth, y, canvas, GroupCallActivity.this.paint);
                                        canvas.restore();
                                    }
                                    if (GroupCallActivity.isLandscapeMode) {
                                        if (i10 == 0) {
                                            GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.switchToButtonInt2 * f5));
                                        } else {
                                            GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.switchToButtonInt2 * f3 * f5));
                                        }
                                    } else if (i10 == 0) {
                                        GroupCallActivity.this.paint.setAlpha(255);
                                    } else {
                                        GroupCallActivity.this.paint.setAlpha((int) (f3 * f5));
                                    }
                                    float measuredWidth4 = (getMeasuredWidth() / f6) - AndroidUtilities.dp(21.0f);
                                    float fDp4 = AndroidUtilities.dp(24.0f);
                                    float f19 = GroupCallActivity.this.switchToButtonProgress * ((fDp2 - measuredWidth4) + measuredWidth4);
                                    float f110 = GroupCallActivity.this.switchToButtonProgress * ((fDp2 - fDp4) + fDp4);
                                    GroupCallActivity.this.rect.set(measuredWidth - f19, y - f110, f19 + measuredWidth, f110 + y);
                                    fDp = (fDp2 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                                    GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.switchToButtonProgress * GroupCallActivity.this.paint.getAlpha()));
                                    canvas.drawRoundRect(GroupCallActivity.this.rect, fDp, fDp, GroupCallActivity.this.paint);
                                    if (i10 == 1) {
                                        if (GroupCallActivity.this.isRtmpStream()) {
                                            GroupCallActivity.this.radialProgressView.setSize((int) ((fDp * f6) - AndroidUtilities.dp(4.0f)));
                                        }
                                        GroupCallActivity.this.radialProgressView.draw(canvas, measuredWidth, y);
                                    }
                                    canvas.restore();
                                    if (GroupCallActivity.this.scheduleButtonTextView == null) {
                                    }
                                }
                            } else if (i10 != i11 && GroupCallActivity.this.currentState != null) {
                                if (!GroupCallActivity.this.isRtmpStream()) {
                                    GroupCallActivity.this.paint.setShader(GroupCallActivity.this.currentState.shader);
                                }
                                f3 = GroupCallActivity.this.switchProgress;
                                if (GroupCallActivity.this.currentState.currentState == 3) {
                                    iDp = AndroidUtilities.dp(f2);
                                    fDp2 -= iDp * f3;
                                    if (GroupCallActivity.this.paint.getShader() == null || GroupCallActivity.this.isRtmpStream()) {
                                        f4 = 25.0f;
                                    } else {
                                        f4 = 25.0f;
                                        GroupCallActivity.this.paint.setColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_listViewBackgroundUnscrolled, false), Theme.getColor(null, Theme.key_voipgroup_disabledButton, false), GroupCallActivity.this.colorProgress, 1.0f));
                                    }
                                    if (GroupCallActivity.this.isRtmpStream()) {
                                        int color3 = Theme.getColor(null, Theme.key_voipgroup_rtmpButton, false);
                                        int i111 = Theme.key_voipgroup_disabledButton;
                                        int offsetColor3 = AndroidUtilities.getOffsetColor(color3, Theme.getColor(null, i111, false), GroupCallActivity.this.colorProgress, 1.0f);
                                        GroupCallActivity.this.paint.setColor(offsetColor3);
                                        GroupCallActivity.this.paint.setShader(null);
                                        VoIPToggleButton voIPToggleButton4 = GroupCallActivity.this.soundButton;
                                        int i112 = Theme.key_voipgroup_listViewBackgroundUnscrolled;
                                        f5 = 255.0f;
                                        f6 = 2.0f;
                                        voIPToggleButton4.setBackgroundColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, i112, false), Theme.getColor(null, i111, false), GroupCallActivity.this.colorProgress, 1.0f), offsetColor3);
                                        GroupCallActivity.this.messageButton.setBackgroundColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, i112, false), Theme.getColor(null, i111, false), GroupCallActivity.this.colorProgress, 1.0f), offsetColor3);
                                    } else {
                                        f5 = 255.0f;
                                        f6 = 2.0f;
                                    }
                                    measuredWidth = (int) ((GroupCallActivity.this.muteButton.getMeasuredWidth() / f6) + GroupCallActivity.this.muteButton.getX());
                                    y = (int) (GroupCallActivity.this.muteButton.getY() + AndroidUtilities.dp(f4));
                                    GroupCallActivity.this.radialMatrix.setTranslate(measuredWidth, y);
                                    GroupCallActivity.this.radialGradient.setLocalMatrix(GroupCallActivity.this.radialMatrix);
                                    GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.switchToButtonProgress * 76.0f * f3));
                                    canvas.save();
                                    canvas.scale(GroupCallActivity.this.muteButton.getScaleX() * BlobDrawable.GLOBAL_SCALE, GroupCallActivity.this.muteButton.getScaleX() * BlobDrawable.GLOBAL_SCALE, measuredWidth, y);
                                    canvas.save();
                                    float f111 = (GroupCallActivity.this.amplitude * BlobDrawable.SCALE_BIG * 0.5f) + BlobDrawable.SCALE_BIG_MIN;
                                    canvas.scale(GroupCallActivity.this.showLightingProgress * f111, GroupCallActivity.this.showLightingProgress * f111, measuredWidth, y);
                                    if (i10 != 1 && !GroupCallActivity.this.isRtmpStream() && LiteMode.isEnabled(512)) {
                                        float f20 = BlobDrawable.LIGHT_GRADIENT_SIZE + 0.7f;
                                        canvas.save();
                                        canvas.scale(f20, f20, measuredWidth, y);
                                        int alpha = GroupCallActivity.this.radialPaint.getAlpha();
                                        GroupCallActivity.this.radialPaint.setAlpha((int) ((1.0f - GroupCallActivity.this.animatorHideButtons.floatValue) * GroupCallActivity.this.switchToButtonProgress * alpha));
                                        canvas.drawCircle(measuredWidth, y, AndroidUtilities.dp(160.0f), GroupCallActivity.this.radialPaint);
                                        GroupCallActivity.this.radialPaint.setAlpha(alpha);
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                    if (!GroupCallActivity.this.isRtmpStream() && GroupCallActivity.this.switchToButtonProgress > 0.0f) {
                                        canvas.save();
                                        float f112 = (GroupCallActivity.this.amplitude * BlobDrawable.SCALE_BIG * interpolation) + BlobDrawable.SCALE_BIG_MIN;
                                        canvas.scale(f112, f112, measuredWidth, y);
                                        GroupCallActivity.this.bigWaveDrawable.draw(measuredWidth, y, canvas, GroupCallActivity.this.paint);
                                        canvas.restore();
                                        canvas.save();
                                        float f113 = (GroupCallActivity.this.amplitude * BlobDrawable.SCALE_SMALL * interpolation) + BlobDrawable.SCALE_SMALL_MIN;
                                        canvas.scale(f113, f113, measuredWidth, y);
                                        GroupCallActivity.this.tinyWaveDrawable.draw(measuredWidth, y, canvas, GroupCallActivity.this.paint);
                                        canvas.restore();
                                    }
                                    if (GroupCallActivity.isLandscapeMode) {
                                        if (i10 == 0) {
                                            GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.switchToButtonInt2 * f5));
                                        } else {
                                            GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.switchToButtonInt2 * f3 * f5));
                                        }
                                    } else if (i10 == 0) {
                                        GroupCallActivity.this.paint.setAlpha(255);
                                    } else {
                                        GroupCallActivity.this.paint.setAlpha((int) (f3 * f5));
                                    }
                                    float measuredWidth5 = (getMeasuredWidth() / f6) - AndroidUtilities.dp(21.0f);
                                    float fDp5 = AndroidUtilities.dp(24.0f);
                                    float f114 = GroupCallActivity.this.switchToButtonProgress * ((fDp2 - measuredWidth5) + measuredWidth5);
                                    float f115 = GroupCallActivity.this.switchToButtonProgress * ((fDp2 - fDp5) + fDp5);
                                    GroupCallActivity.this.rect.set(measuredWidth - f114, y - f115, f114 + measuredWidth, f115 + y);
                                    fDp = (fDp2 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                                    GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.switchToButtonProgress * GroupCallActivity.this.paint.getAlpha()));
                                    canvas.drawRoundRect(GroupCallActivity.this.rect, fDp, fDp, GroupCallActivity.this.paint);
                                    if (i10 == 1 && GroupCallActivity.this.currentState.currentState == 3) {
                                        if (GroupCallActivity.this.isRtmpStream()) {
                                            GroupCallActivity.this.radialProgressView.setSize((int) ((fDp * f6) - AndroidUtilities.dp(4.0f)));
                                        }
                                        GroupCallActivity.this.radialProgressView.draw(canvas, measuredWidth, y);
                                    }
                                    canvas.restore();
                                    if (GroupCallActivity.this.scheduleButtonTextView == null && GroupCallActivity.this.scheduleButtonTextView.getVisibility() == 0) {
                                        GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.scheduleButtonTextView.getAlpha() * f5));
                                        float x = GroupCallActivity.this.scheduleButtonTextView.getX() - getX();
                                        float y2 = GroupCallActivity.this.scheduleButtonTextView.getY() - getY();
                                        GroupCallActivity.this.rect.set(x, y2, GroupCallActivity.this.scheduleButtonTextView.getMeasuredWidth() + x, GroupCallActivity.this.scheduleButtonTextView.getMeasuredHeight() + y2);
                                        canvas.save();
                                        canvas.scale(GroupCallActivity.this.scheduleButtonTextView.getScaleX(), GroupCallActivity.this.scheduleButtonTextView.getScaleY(), GroupCallActivity.this.rect.centerX(), GroupCallActivity.this.rect.centerY());
                                        canvas.drawRoundRect(GroupCallActivity.this.rect, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), GroupCallActivity.this.paint);
                                        canvas.restore();
                                    }
                                } else {
                                    if (GroupCallActivity.this.paint.getShader() == null) {
                                        f4 = 25.0f;
                                    } else {
                                        f4 = 25.0f;
                                    }
                                    if (GroupCallActivity.this.isRtmpStream()) {
                                        int color4 = Theme.getColor(null, Theme.key_voipgroup_rtmpButton, false);
                                        int i113 = Theme.key_voipgroup_disabledButton;
                                        int offsetColor4 = AndroidUtilities.getOffsetColor(color4, Theme.getColor(null, i113, false), GroupCallActivity.this.colorProgress, 1.0f);
                                        GroupCallActivity.this.paint.setColor(offsetColor4);
                                        GroupCallActivity.this.paint.setShader(null);
                                        VoIPToggleButton voIPToggleButton5 = GroupCallActivity.this.soundButton;
                                        int i114 = Theme.key_voipgroup_listViewBackgroundUnscrolled;
                                        f5 = 255.0f;
                                        f6 = 2.0f;
                                        voIPToggleButton5.setBackgroundColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, i114, false), Theme.getColor(null, i113, false), GroupCallActivity.this.colorProgress, 1.0f), offsetColor4);
                                        GroupCallActivity.this.messageButton.setBackgroundColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, i114, false), Theme.getColor(null, i113, false), GroupCallActivity.this.colorProgress, 1.0f), offsetColor4);
                                    } else {
                                        f5 = 255.0f;
                                        f6 = 2.0f;
                                    }
                                    measuredWidth = (int) ((GroupCallActivity.this.muteButton.getMeasuredWidth() / f6) + GroupCallActivity.this.muteButton.getX());
                                    y = (int) (GroupCallActivity.this.muteButton.getY() + AndroidUtilities.dp(f4));
                                    GroupCallActivity.this.radialMatrix.setTranslate(measuredWidth, y);
                                    GroupCallActivity.this.radialGradient.setLocalMatrix(GroupCallActivity.this.radialMatrix);
                                    GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.switchToButtonProgress * 76.0f * f3));
                                    canvas.save();
                                    canvas.scale(GroupCallActivity.this.muteButton.getScaleX() * BlobDrawable.GLOBAL_SCALE, GroupCallActivity.this.muteButton.getScaleX() * BlobDrawable.GLOBAL_SCALE, measuredWidth, y);
                                    canvas.save();
                                    float f116 = (GroupCallActivity.this.amplitude * BlobDrawable.SCALE_BIG * 0.5f) + BlobDrawable.SCALE_BIG_MIN;
                                    canvas.scale(GroupCallActivity.this.showLightingProgress * f116, GroupCallActivity.this.showLightingProgress * f116, measuredWidth, y);
                                    if (i10 != 1) {
                                    }
                                    canvas.restore();
                                    if (!GroupCallActivity.this.isRtmpStream()) {
                                        canvas.save();
                                        float f117 = (GroupCallActivity.this.amplitude * BlobDrawable.SCALE_BIG * interpolation) + BlobDrawable.SCALE_BIG_MIN;
                                        canvas.scale(f117, f117, measuredWidth, y);
                                        GroupCallActivity.this.bigWaveDrawable.draw(measuredWidth, y, canvas, GroupCallActivity.this.paint);
                                        canvas.restore();
                                        canvas.save();
                                        float f118 = (GroupCallActivity.this.amplitude * BlobDrawable.SCALE_SMALL * interpolation) + BlobDrawable.SCALE_SMALL_MIN;
                                        canvas.scale(f118, f118, measuredWidth, y);
                                        GroupCallActivity.this.tinyWaveDrawable.draw(measuredWidth, y, canvas, GroupCallActivity.this.paint);
                                        canvas.restore();
                                    }
                                    if (GroupCallActivity.isLandscapeMode) {
                                        if (i10 == 0) {
                                            GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.switchToButtonInt2 * f5));
                                        } else {
                                            GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.switchToButtonInt2 * f3 * f5));
                                        }
                                    } else if (i10 == 0) {
                                        GroupCallActivity.this.paint.setAlpha(255);
                                    } else {
                                        GroupCallActivity.this.paint.setAlpha((int) (f3 * f5));
                                    }
                                    float measuredWidth6 = (getMeasuredWidth() / f6) - AndroidUtilities.dp(21.0f);
                                    float fDp6 = AndroidUtilities.dp(24.0f);
                                    float f119 = GroupCallActivity.this.switchToButtonProgress * ((fDp2 - measuredWidth6) + measuredWidth6);
                                    float f1110 = GroupCallActivity.this.switchToButtonProgress * ((fDp2 - fDp6) + fDp6);
                                    GroupCallActivity.this.rect.set(measuredWidth - f119, y - f1110, f119 + measuredWidth, f1110 + y);
                                    fDp = (fDp2 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                                    GroupCallActivity.this.paint.setAlpha((int) (GroupCallActivity.this.switchToButtonProgress * GroupCallActivity.this.paint.getAlpha()));
                                    canvas.drawRoundRect(GroupCallActivity.this.rect, fDp, fDp, GroupCallActivity.this.paint);
                                    if (i10 == 1) {
                                        if (GroupCallActivity.this.isRtmpStream()) {
                                            GroupCallActivity.this.radialProgressView.setSize((int) ((fDp * f6) - AndroidUtilities.dp(4.0f)));
                                        }
                                        GroupCallActivity.this.radialProgressView.draw(canvas, measuredWidth, y);
                                    }
                                    canvas.restore();
                                    if (GroupCallActivity.this.scheduleButtonTextView == null) {
                                    }
                                }
                            }
                            i10++;
                            i11 = 1;
                            f = 25.909092f;
                            f2 = 2.0f;
                        }
                    } else {
                        if (GroupCallActivity.this.currentState.currentState == 3) {
                            f7 = GroupCallActivity.this.switchProgress;
                            GroupCallActivity.this.paint.setShader(GroupCallActivity.this.prevState.shader);
                        } else {
                            f7 = 1.0f - GroupCallActivity.this.switchProgress;
                            GroupCallActivity.this.paint.setShader(GroupCallActivity.this.currentState.shader);
                        }
                        GroupCallActivity.this.paintTmp.setColor(AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_listViewBackgroundUnscrolled, false), Theme.getColor(null, Theme.key_voipgroup_disabledButton, false), GroupCallActivity.this.colorProgress, 1.0f));
                        float measuredWidth7 = (int) ((GroupCallActivity.this.muteButton.getMeasuredWidth() / 2.0f) + GroupCallActivity.this.muteButton.getX());
                        float y3 = (int) (GroupCallActivity.this.muteButton.getY() + AndroidUtilities.dp(25.0f));
                        GroupCallActivity.this.radialMatrix.setTranslate(measuredWidth7, y3);
                        GroupCallActivity.this.radialGradient.setLocalMatrix(GroupCallActivity.this.radialMatrix);
                        GroupCallActivity.this.paint.setAlpha(76);
                        canvas.save();
                        canvas.scale(GroupCallActivity.this.muteButton.getScaleX() * BlobDrawable.GLOBAL_SCALE, GroupCallActivity.this.muteButton.getScaleY() * BlobDrawable.GLOBAL_SCALE, measuredWidth7, y3);
                        canvas.save();
                        float f21 = (GroupCallActivity.this.amplitude * BlobDrawable.SCALE_BIG * 0.5f) + BlobDrawable.SCALE_BIG_MIN;
                        canvas.scale(GroupCallActivity.this.showLightingProgress * f21, GroupCallActivity.this.showLightingProgress * f21, measuredWidth7, y3);
                        float f22 = BlobDrawable.LIGHT_GRADIENT_SIZE + 0.7f;
                        canvas.save();
                        canvas.scale(f22, f22, measuredWidth7, y3);
                        canvas.drawCircle(measuredWidth7, y3, AndroidUtilities.dp(160.0f), GroupCallActivity.this.radialPaint);
                        canvas.restore();
                        canvas.restore();
                        if (GroupCallActivity.this.call != null) {
                            canvas.save();
                            float f23 = ((GroupCallActivity.this.amplitude * BlobDrawable.SCALE_BIG) + BlobDrawable.SCALE_BIG_MIN) * interpolation;
                            canvas.scale(f23, f23, measuredWidth7, y3);
                            GroupCallActivity.this.bigWaveDrawable.draw(measuredWidth7, y3, canvas, GroupCallActivity.this.paint);
                            canvas.restore();
                            canvas.save();
                            float f24 = ((GroupCallActivity.this.amplitude * BlobDrawable.SCALE_SMALL) + BlobDrawable.SCALE_SMALL_MIN) * interpolation;
                            canvas.scale(f24, f24, measuredWidth7, y3);
                            GroupCallActivity.this.tinyWaveDrawable.draw(measuredWidth7, y3, canvas, GroupCallActivity.this.paint);
                            canvas.restore();
                        }
                        GroupCallActivity.this.paint.setAlpha(255);
                        if (z2) {
                            canvas.drawCircle(measuredWidth7, y3, AndroidUtilities.dp(25.909092f), GroupCallActivity.this.paint);
                            GroupCallActivity.this.paint.setColor(Theme.getColor(null, Theme.key_voipgroup_connectingProgress, false));
                            if (f7 != 0.0f) {
                                GroupCallActivity.this.paint.setAlpha((int) (255.0f * f7));
                                GroupCallActivity.this.paint.setShader(null);
                                canvas.drawCircle(measuredWidth7, y3, AndroidUtilities.dp(25.909092f), GroupCallActivity.this.paint);
                            }
                        }
                        canvas.drawCircle(measuredWidth7, y3, AndroidUtilities.dp(25.0f) * f7, GroupCallActivity.this.paintTmp);
                        if (!z2) {
                            GroupCallActivity.this.radialProgressView.draw(canvas, measuredWidth7, y3);
                        }
                        canvas.restore();
                    }
                    super.dispatchDraw(canvas);
                    if (GroupCallActivity.this.renderersContainer.isAnimating()) {
                    }
                    invalidate();
                }
                if (GroupCallActivity.this.prevState != null && GroupCallActivity.this.currentState != null && GroupCallActivity.this.currentState.currentState == 3) {
                    GroupCallActivity.this.radialProgressView.toCircle(true, false);
                }
                if (!z2) {
                    if (GroupCallActivity.this.switchProgress != 1.0f) {
                        if (GroupCallActivity.this.prevState == null) {
                            GroupCallActivity.access$14516(GroupCallActivity.this, j2 / 180.0f);
                        } else {
                            GroupCallActivity.access$14516(GroupCallActivity.this, j2 / 180.0f);
                        }
                        if (GroupCallActivity.this.switchProgress >= 1.0f) {
                            GroupCallActivity.this.switchProgress = 1.0f;
                            GroupCallActivity.this.prevState = null;
                            if (GroupCallActivity.this.currentState != null) {
                                GroupCallActivity.this.radialProgressView.toCircle(false, true);
                            }
                        }
                        GroupCallActivity.this.invalidateColors = true;
                    }
                    if (GroupCallActivity.this.invalidateColors) {
                        f8 = 180.0f;
                        f9 = 1.0f;
                        f10 = 0.0f;
                    } else {
                        f8 = 180.0f;
                        f9 = 1.0f;
                        f10 = 0.0f;
                    }
                    if (GroupCallActivity.this.currentState != null) {
                        if (GroupCallActivity.this.currentState.currentState != 1) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (GroupCallActivity.this.currentState.currentState != 3) {
                        }
                        if (GroupCallActivity.this.prevState == null) {
                            if (!z3) {
                                if (!z3) {
                                    GroupCallActivity.access$15624(GroupCallActivity.this, j2 / 350.0f);
                                    if (GroupCallActivity.this.showWavesProgress < 0.0f) {
                                        GroupCallActivity.this.showWavesProgress = 0.0f;
                                    }
                                }
                            } else if (!z3) {
                                GroupCallActivity.access$15624(GroupCallActivity.this, j2 / 350.0f);
                                if (GroupCallActivity.this.showWavesProgress < 0.0f) {
                                    GroupCallActivity.this.showWavesProgress = 0.0f;
                                }
                            }
                        } else if (!z3) {
                            if (!z3) {
                                GroupCallActivity.access$15624(GroupCallActivity.this, j2 / 350.0f);
                                if (GroupCallActivity.this.showWavesProgress < 0.0f) {
                                    GroupCallActivity.this.showWavesProgress = 0.0f;
                                }
                            }
                        } else if (!z3) {
                            GroupCallActivity.access$15624(GroupCallActivity.this, j2 / 350.0f);
                            if (GroupCallActivity.this.showWavesProgress < 0.0f) {
                                GroupCallActivity.this.showWavesProgress = 0.0f;
                            }
                        }
                        if (!z4) {
                            if (!z4) {
                                GroupCallActivity.access$15724(GroupCallActivity.this, j2 / 350.0f);
                                if (GroupCallActivity.this.showLightingProgress < 0.0f) {
                                    GroupCallActivity.this.showLightingProgress = 0.0f;
                                }
                            }
                        } else if (!z4) {
                            GroupCallActivity.access$15724(GroupCallActivity.this, j2 / 350.0f);
                            if (GroupCallActivity.this.showLightingProgress < 0.0f) {
                                GroupCallActivity.this.showLightingProgress = 0.0f;
                            }
                        }
                    } else {
                        z3 = false;
                    }
                    if (GroupCallActivity.this.prevState == null) {
                        if (!z3) {
                            if (!z3) {
                                GroupCallActivity.access$15624(GroupCallActivity.this, j2 / 350.0f);
                                if (GroupCallActivity.this.showWavesProgress < 0.0f) {
                                    GroupCallActivity.this.showWavesProgress = 0.0f;
                                }
                            }
                        } else if (!z3) {
                            GroupCallActivity.access$15624(GroupCallActivity.this, j2 / 350.0f);
                            if (GroupCallActivity.this.showWavesProgress < 0.0f) {
                                GroupCallActivity.this.showWavesProgress = 0.0f;
                            }
                        }
                    } else if (!z3) {
                        if (!z3) {
                            GroupCallActivity.access$15624(GroupCallActivity.this, j2 / 350.0f);
                            if (GroupCallActivity.this.showWavesProgress < 0.0f) {
                                GroupCallActivity.this.showWavesProgress = 0.0f;
                            }
                        }
                    } else if (!z3) {
                        GroupCallActivity.access$15624(GroupCallActivity.this, j2 / 350.0f);
                        if (GroupCallActivity.this.showWavesProgress < 0.0f) {
                            GroupCallActivity.this.showWavesProgress = 0.0f;
                        }
                    }
                    if (!z4) {
                        if (!z4) {
                            GroupCallActivity.access$15724(GroupCallActivity.this, j2 / 350.0f);
                            if (GroupCallActivity.this.showLightingProgress < 0.0f) {
                                GroupCallActivity.this.showLightingProgress = 0.0f;
                            }
                        }
                    } else if (!z4) {
                        GroupCallActivity.access$15724(GroupCallActivity.this, j2 / 350.0f);
                        if (GroupCallActivity.this.showLightingProgress < 0.0f) {
                            GroupCallActivity.this.showLightingProgress = 0.0f;
                        }
                    }
                }
                float interpolation2 = (this.overshootInterpolator.getInterpolation(GroupCallActivity.this.showWavesProgress) * 0.6f) + 0.4f;
                GroupCallActivity.this.bigWaveDrawable.update(GroupCallActivity.this.amplitude, 1.0f);
                GroupCallActivity.this.tinyWaveDrawable.update(GroupCallActivity.this.amplitude, 1.0f);
                f = 25.909092f;
                f2 = 2.0f;
                if (GroupCallActivity.this.prevState != null) {
                    i10 = 0;
                    while (i10 < 2) {
                        float fDp7 = AndroidUtilities.dp(f);
                        if (i10 != 0) {
                            if (i10 != i11) {
                            }
                        } else if (i10 != i11) {
                        }
                        i10++;
                        i11 = 1;
                        f = 25.909092f;
                        f2 = 2.0f;
                    }
                } else {
                    i10 = 0;
                    while (i10 < 2) {
                        float fDp8 = AndroidUtilities.dp(f);
                        if (i10 != 0) {
                            if (i10 != i11) {
                            }
                        } else if (i10 != i11) {
                        }
                        i10++;
                        i11 = 1;
                        f = 25.909092f;
                        f2 = 2.0f;
                    }
                }
                super.dispatchDraw(canvas);
                if (GroupCallActivity.this.renderersContainer.isAnimating()) {
                    invalidate();
                }
            }
        };
        groupCallActivity.buttonsContainer = groupCallActivityButtonsLayout;
        int color = Theme.getColor(Theme.key_voipgroup_unmuteButton2);
        int iRed = Color.red(color);
        int iGreen = Color.green(color);
        int iBlue = Color.blue(color);
        groupCallActivity.radialMatrix = new Matrix();
        groupCallActivity.radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, iRed, iGreen, iBlue), Color.argb(0, iRed, iGreen, iBlue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        groupCallActivity.radialPaint = paint;
        paint.setShader(groupCallActivity.radialGradient);
        BlobDrawable blobDrawable = new BlobDrawable(9);
        groupCallActivity.tinyWaveDrawable = blobDrawable;
        BlobDrawable blobDrawable2 = new BlobDrawable(12);
        groupCallActivity.bigWaveDrawable = blobDrawable2;
        blobDrawable.minRadius = AndroidUtilities.dp(62.0f) * 0.45454547f;
        blobDrawable.maxRadius = AndroidUtilities.dp(72.0f) * 0.45454547f;
        blobDrawable.generateBlob();
        blobDrawable2.minRadius = AndroidUtilities.dp(65.0f) * 0.45454547f;
        blobDrawable2.maxRadius = AndroidUtilities.dp(75.0f) * 0.45454547f;
        blobDrawable2.generateBlob();
        Paint paint2 = blobDrawable.paint;
        int i10 = Theme.key_voipgroup_unmuteButton;
        paint2.setColor(ColorUtils.setAlphaComponent(Theme.getColor(i10), 38));
        blobDrawable2.paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(i10), 76));
        VoIPToggleButton voIPToggleButton = new VoIPToggleButton(activity, 50.0f);
        groupCallActivity.soundButton = voIPToggleButton;
        voIPToggleButton.setCheckable(true);
        voIPToggleButton.setTextSize(12);
        groupCallActivityButtonsLayout.addButton(voIPToggleButton);
        voIPToggleButton.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda34(groupCallActivity, 9));
        VoIPToggleButton voIPToggleButton2 = new VoIPToggleButton(activity, 50.0f);
        groupCallActivity.cameraButton = voIPToggleButton2;
        voIPToggleButton2.setCheckable(true);
        voIPToggleButton2.setTextSize(12);
        voIPToggleButton2.showText(false, false);
        voIPToggleButton2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        voIPToggleButton2.setData(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        VoIPToggleButton voIPToggleButton3 = new VoIPToggleButton(activity, 50.0f);
        groupCallActivity.flipButton = voIPToggleButton3;
        voIPToggleButton3.setCheckable(true);
        voIPToggleButton3.setTextSize(12);
        voIPToggleButton3.showText(false, false);
        RLottieImageView rLottieImageView = new RLottieImageView(activity);
        voIPToggleButton3.addView(rLottieImageView, LayoutHelper.createFrame(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        int i11 = R.raw.camera_flip;
        RLottieDrawable rLottieDrawable2 = new RLottieDrawable(i11, Fragment$$ExternalSyntheticOutline0.m(i11, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        groupCallActivity.flipIcon = rLottieDrawable2;
        rLottieImageView.setAnimation(rLottieDrawable2);
        voIPToggleButton3.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda34(groupCallActivity, 0));
        groupCallActivityButtonsLayout.addButton(voIPToggleButton3);
        VoIPToggleButton voIPToggleButton4 = new VoIPToggleButton(activity, 50.0f);
        groupCallActivity.speakerButton = voIPToggleButton4;
        voIPToggleButton4.setCheckable(true);
        voIPToggleButton4.setTextSize(12);
        voIPToggleButton4.showText(false, false);
        ImageView imageView = new ImageView(activity);
        groupCallActivity.speakerImageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i12 = R.drawable.filled_sound_on;
        groupCallActivity.speakerIcon = i12;
        imageView.setImageResource(i12);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        voIPToggleButton4.addView(imageView, LayoutHelper.createFrame(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        voIPToggleButton4.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda34(groupCallActivity, 1));
        groupCallActivityButtonsLayout.addButton(voIPToggleButton4);
        groupCallActivityButtonsLayout.addButton(voIPToggleButton2);
        VoIPToggleButton voIPToggleButton5 = new VoIPToggleButton(activity, 50.0f);
        groupCallActivity.leaveButton = voIPToggleButton5;
        voIPToggleButton5.setTextSize(12);
        voIPToggleButton5.setData(R.drawable.calls_decline, -1, Theme.getColor(Theme.key_voipgroup_leaveButton), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i13 = 0;
        voIPToggleButton5.setOnClickListener(new View.OnClickListener(groupCallActivity) {
            public final GroupCallActivity f$0;

            {
                this.f$0 = groupCallActivity;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.f$0.lambda$new$31(activity, view);
                        break;
                    default:
                        this.f$0.lambda$new$50(activity, view);
                        break;
                }
            }
        });
        VoIPToggleButton voIPToggleButton6 = new VoIPToggleButton(activity, 50.0f);
        groupCallActivity.messageButton = voIPToggleButton6;
        voIPToggleButton6.setCheckable(true);
        voIPToggleButton6.setChecked(true, false);
        voIPToggleButton6.setTextSize(12);
        voIPToggleButton6.setData(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipMessage), false, false);
        RLottieImageView rLottieImageView2 = new RLottieImageView(activity) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setEnabled(GroupCallActivity.this.muteButtonState == 0 || GroupCallActivity.this.muteButtonState == 1);
                if (GroupCallActivity.this.muteButtonState == 1) {
                    accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                int i14;
                if (GroupCallActivity.this.isRtmpStream()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0 && GroupCallActivity.this.muteButtonState == 0) {
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    if (groupCallActivity2.call != null) {
                        AndroidUtilities.runOnUIThread(groupCallActivity2.pressRunnable, 300L);
                        GroupCallActivity.this.scheduled = true;
                    } else if (motionEvent.getAction() != 1) {
                        if (GroupCallActivity.this.scheduled) {
                            AndroidUtilities.cancelRunOnUIThread(GroupCallActivity.this.pressRunnable);
                            GroupCallActivity.this.scheduled = false;
                        } else if (GroupCallActivity.this.pressed) {
                            AndroidUtilities.cancelRunOnUIThread(GroupCallActivity.this.unmuteRunnable);
                            GroupCallActivity.this.updateMuteButton(0, true);
                            if (VoIPService.getSharedInstance() != null) {
                                VoIPService.getSharedInstance().setMicMute(true, true, false);
                                GroupCallActivity.this.muteButton.performHapticFeedback(3, 2);
                            }
                            GroupCallActivity.this.attachedRenderersTmp.clear();
                            GroupCallActivity.this.attachedRenderersTmp.addAll(GroupCallActivity.this.attachedRenderers);
                            for (i14 = 0; i14 < GroupCallActivity.this.attachedRenderersTmp.size(); i14++) {
                                ((GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderersTmp.get(i14)).updateAttachState(true);
                            }
                            GroupCallActivity.this.pressed = false;
                            MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            super.onTouchEvent(motionEventObtain);
                            motionEventObtain.recycle();
                            return true;
                        }
                    } else if (GroupCallActivity.this.scheduled) {
                        AndroidUtilities.cancelRunOnUIThread(GroupCallActivity.this.pressRunnable);
                        GroupCallActivity.this.scheduled = false;
                    } else if (GroupCallActivity.this.pressed) {
                        AndroidUtilities.cancelRunOnUIThread(GroupCallActivity.this.unmuteRunnable);
                        GroupCallActivity.this.updateMuteButton(0, true);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(true, true, false);
                            GroupCallActivity.this.muteButton.performHapticFeedback(3, 2);
                        }
                        GroupCallActivity.this.attachedRenderersTmp.clear();
                        GroupCallActivity.this.attachedRenderersTmp.addAll(GroupCallActivity.this.attachedRenderers);
                        while (i14 < GroupCallActivity.this.attachedRenderersTmp.size()) {
                            ((GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderersTmp.get(i14)).updateAttachState(true);
                        }
                        GroupCallActivity.this.pressed = false;
                        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                        super.onTouchEvent(motionEventObtain2);
                        motionEventObtain2.recycle();
                        return true;
                    }
                } else if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                    if (GroupCallActivity.this.scheduled) {
                        AndroidUtilities.cancelRunOnUIThread(GroupCallActivity.this.pressRunnable);
                        GroupCallActivity.this.scheduled = false;
                    } else if (GroupCallActivity.this.pressed) {
                        AndroidUtilities.cancelRunOnUIThread(GroupCallActivity.this.unmuteRunnable);
                        GroupCallActivity.this.updateMuteButton(0, true);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(true, true, false);
                            try {
                                GroupCallActivity.this.muteButton.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                        GroupCallActivity.this.attachedRenderersTmp.clear();
                        GroupCallActivity.this.attachedRenderersTmp.addAll(GroupCallActivity.this.attachedRenderers);
                        while (i14 < GroupCallActivity.this.attachedRenderersTmp.size()) {
                            ((GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderersTmp.get(i14)).updateAttachState(true);
                        }
                        GroupCallActivity.this.pressed = false;
                        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                        super.onTouchEvent(motionEventObtain3);
                        motionEventObtain3.recycle();
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        groupCallActivity.muteButtonIcon = rLottieImageView2;
        rLottieImageView2.setAnimation(rLottieDrawable);
        rLottieImageView2.setScaleType(ImageView.ScaleType.CENTER);
        VoIPToggleButton voIPToggleButton7 = new VoIPToggleButton(activity, 50.0f);
        groupCallActivity.muteButton = voIPToggleButton7;
        voIPToggleButton7.setDrawBackground(false);
        voIPToggleButton7.setTextSize(12);
        voIPToggleButton7.setData(0, 0, 0, "Text", false, false);
        voIPToggleButton7.addView(rLottieImageView2, LayoutHelper.createFrame(50, 50, 49));
        groupCallActivityButtonsLayout.addButton(voIPToggleButton7);
        voIPToggleButton7.setOnClickListener(groupCallActivity.new AnonymousClass19());
        groupCallActivityButtonsLayout.addButton(voIPToggleButton6);
        groupCallActivityButtonsLayout.addButton(voIPToggleButton5);
        ImageView imageView2 = new ImageView(activity);
        groupCallActivity.expandOrMinimizeButton = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        voIPToggleButton7.addView(imageView2, LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (groupCallActivity.call != null && groupCallActivity.isRtmpStream() && !groupCallActivity.call.isScheduled()) {
            imageView2.setVisibility(0);
            rLottieImageView2.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(activity);
        groupCallActivity.radialProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(Theme.getColor(Theme.key_voipgroup_connectingProgress));
        actionBar.setAlpha(0.0f);
        actionBar.getBackButton().setScaleX(0.9f);
        actionBar.getBackButton().setScaleY(0.9f);
        actionBar.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        actionBar.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        actionBar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        actionBar.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(activity, Theme.getColor(i));
        groupCallActivity.otherItem = actionBarMenuItem;
        actionBarMenuItem.setLongClickEnabled(false);
        actionBarMenuItem.setIcon(R.drawable.ic_ab_other);
        actionBarMenuItem.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        actionBarMenuItem.setSubMenuOpenSide(2);
        actionBarMenuItem.setDelegate(new GroupCallActivity$$ExternalSyntheticLambda10(groupCallActivity, 1));
        int i14 = Theme.key_voipgroup_actionBarItemsSelector;
        actionBarMenuItem.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(i14), 6));
        actionBarMenuItem.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda34(groupCallActivity, 2));
        actionBarMenuItem.setPopupItemsColor(Theme.getColor(i), false);
        actionBarMenuItem.setPopupItemsColor(Theme.getColor(i), true);
        ActionBarMenuItem actionBarMenuItem2 = new ActionBarMenuItem(activity, Theme.getColor(i));
        groupCallActivity.pipItem = actionBarMenuItem2;
        actionBarMenuItem2.setLongClickEnabled(false);
        actionBarMenuItem2.setIcon(R.drawable.msg_voice_pip);
        int i15 = R.string.AccDescrPipMode;
        actionBarMenuItem2.setContentDescription(LocaleController.getString(i15));
        actionBarMenuItem2.setBackground(Theme.createSelectorDrawable(Theme.getColor(i14), 6));
        actionBarMenuItem2.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda34(groupCallActivity, 3));
        ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem(activity, Theme.getColor(i));
        groupCallActivity.screenShareItem = actionBarMenuItem3;
        actionBarMenuItem3.setLongClickEnabled(false);
        actionBarMenuItem3.setIcon(R.drawable.msg_screencast);
        actionBarMenuItem3.setContentDescription(LocaleController.getString(i15));
        actionBarMenuItem3.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(i14), 6));
        actionBarMenuItem3.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda34(groupCallActivity, 4));
        AnonymousClass20 anonymousClass20 = groupCallActivity.new AnonymousClass20(activity, activity);
        groupCallActivity.titleTextView = anonymousClass20;
        View view = new View(activity) {
            @Override
            public void onMeasure(int i16, int i17) {
                setMeasuredDimension(View.MeasureSpec.getSize(i16), ActionBar.getCurrentActionBarHeight());
            }
        };
        groupCallActivity.actionBarBackground = view;
        view.setAlpha(0.0f);
        Paint paint3 = new Paint(1);
        groupCallActivity.liveLabelPaint = paint3;
        paint3.setColor(-12761513);
        TextView textView = new TextView(groupCallActivity.getContext()) {
            private RectF rect = new RectF();

            @Override
            public void onDraw(Canvas canvas) {
                this.rect.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), GroupCallActivity.this.liveLabelPaint);
                super.onDraw(canvas);
            }
        };
        groupCallActivity.liveLabelTextView = textView;
        textView.setTextColor(groupCallActivity.getThemedColor(i));
        textView.setTextSize(1, 11.0f);
        textView.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        textView.setMaxLines(1);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        textView.setTag(-1);
        if (!groupCallActivity.isRtmpStream()) {
            textView.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(groupCallActivity.getContext());
        groupCallActivity.titleLayout = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(anonymousClass20, LayoutHelper.createLinear(0, -2, 1.0f));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, 18, 6.0f, 4.0f, 0.0f, 0.0f));
        groupCallActivity.containerView.addView(view, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        groupCallActivity.containerView.addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        groupCallActivity.containerView.addView(actionBar, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        groupCallActivity.menuItemsContainer = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(actionBarMenuItem3, LayoutHelper.createLinear(48, 48));
        linearLayout2.addView(actionBarMenuItem2, LayoutHelper.createLinear(48, 48));
        linearLayout2.addView(actionBarMenuItem, LayoutHelper.createLinear(48, 48));
        groupCallActivity.containerView.addView(linearLayout2, LayoutHelper.createFrame(-2, 48, 53));
        View view2 = new View(activity);
        groupCallActivity.actionBarShadow = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundColor(Theme.getColor(Theme.key_dialogShadowLine));
        groupCallActivity.containerView.addView(view2, LayoutHelper.createFrame(-1, 1.0f));
        for (int i16 = 0; i16 < 2; i16++) {
            groupCallActivity.undoView[i16] = new UndoView(activity) {
                @Override
                public void showWithAction(long j, int i17, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
                    if (GroupCallActivity.this.previewDialog != null) {
                        return;
                    }
                    super.showWithAction(j, i17, obj, obj2, runnable, runnable2);
                }
            };
            groupCallActivity.undoView[i16].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            groupCallActivity.undoView[i16].setTranslationZ(AndroidUtilities.dp(5.0f));
            groupCallActivity.containerView.addView(groupCallActivity.undoView[i16], LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        AccountSelectCell accountSelectCell = new AccountSelectCell(activity, true);
        groupCallActivity.accountSelectCell = accountSelectCell;
        accountSelectCell.setTag(R.id.fit_width_tag, 240);
        groupCallActivity.otherItem.addSubItem(8, accountSelectCell, -2, AndroidUtilities.dp(48.0f));
        groupCallActivity.otherItem.setShowSubmenuByMove(false);
        int i17 = Theme.key_voipgroup_listSelector;
        accountSelectCell.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(i17), 6, 6));
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem = groupCallActivity.otherItem.addSubItem(1, 0, (CharSequence) LocaleController.getString(R.string.VoipGroupAllCanSpeak), true);
        groupCallActivity.everyoneItem = actionBarMenuSubItemAddSubItem;
        actionBarMenuSubItemAddSubItem.updateSelectorBackground(true, false);
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem2 = groupCallActivity.otherItem.addSubItem(2, 0, (CharSequence) LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true);
        groupCallActivity.adminItem = actionBarMenuSubItemAddSubItem2;
        actionBarMenuSubItemAddSubItem2.updateSelectorBackground(false, true);
        ActionBarMenuSubItem actionBarMenuSubItem = groupCallActivity.everyoneItem;
        int i18 = Theme.key_voipgroup_checkMenu;
        actionBarMenuSubItem.setCheckColor(i18);
        groupCallActivity.everyoneItem.setColors(Theme.getColor(i18), Theme.getColor(i18));
        groupCallActivity.adminItem.setCheckColor(i18);
        groupCallActivity.adminItem.setColors(Theme.getColor(i18), Theme.getColor(i18));
        Paint paint4 = new Paint(1);
        int i19 = Theme.key_voipgroup_actionBarItems;
        paint4.setColor(Theme.getColor(i19));
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint4.setStrokeCap(Paint.Cap.ROUND);
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem3 = groupCallActivity.otherItem.addSubItem(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false);
        groupCallActivity.soundItem = actionBarMenuSubItemAddSubItem3;
        actionBarMenuSubItemAddSubItem3.setItemHeight(56);
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem4 = groupCallActivity.otherItem.addSubItem(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false);
        groupCallActivity.noiseItem = actionBarMenuSubItemAddSubItem4;
        actionBarMenuSubItemAddSubItem4.setItemHeight(56);
        View viewAddDivider = groupCallActivity.otherItem.addDivider(ColorUtils.blendARGB(0.3f, Theme.getColor(Theme.key_voipgroup_actionBar), -16777216));
        groupCallActivity.soundItemDivider = viewAddDivider;
        ((ViewGroup.MarginLayoutParams) viewAddDivider.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) viewAddDivider.getLayoutParams()).bottomMargin = 0;
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem5 = groupCallActivity.otherItem.addSubItem(6, R.drawable.msg_edit, groupCallActivity.recordCallDrawable, LocaleController.getString(ChatObject.isChannelOrGiga(groupCallActivity.currentChat) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false);
        groupCallActivity.editTitleItem = actionBarMenuSubItemAddSubItem5;
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem6 = groupCallActivity.otherItem.addSubItem(7, R.drawable.msg_permissions, groupCallActivity.recordCallDrawable, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false);
        groupCallActivity.permissionItem = actionBarMenuSubItemAddSubItem6;
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem7 = groupCallActivity.otherItem.addSubItem(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        groupCallActivity.inviteItem = actionBarMenuSubItemAddSubItem7;
        groupCallActivity.recordCallDrawable = new RecordCallDrawable();
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem8 = groupCallActivity.otherItem.addSubItem(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        groupCallActivity.screenItem = actionBarMenuSubItemAddSubItem8;
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem9 = groupCallActivity.otherItem.addSubItem(5, 0, groupCallActivity.recordCallDrawable, LocaleController.getString(R.string.VoipGroupRecordCall), true, false);
        groupCallActivity.recordItem = actionBarMenuSubItemAddSubItem9;
        groupCallActivity.recordCallDrawable.setParentView(actionBarMenuSubItemAddSubItem9.getImageView());
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem10 = groupCallActivity.otherItem.addSubItem(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        groupCallActivity.enableComments = actionBarMenuSubItemAddSubItem10;
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem11 = groupCallActivity.otherItem.addSubItem(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        groupCallActivity.disableComments = actionBarMenuSubItemAddSubItem11;
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem12 = groupCallActivity.otherItem.addSubItem(4, R.drawable.msg_cancel, LocaleController.getString(groupCallActivity.isConference() ? R.string.VoipGroupEndConference : ChatObject.isChannelOrGiga(groupCallActivity.currentChat) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat));
        groupCallActivity.leaveItem = actionBarMenuSubItemAddSubItem12;
        groupCallActivity.otherItem.setPopupItemsSelectorColor(Theme.getColor(i17));
        groupCallActivity.otherItem.getPopupLayout().setFitItems(true);
        actionBarMenuSubItemAddSubItem10.setColors(Theme.getColor(i19), Theme.getColor(i19));
        actionBarMenuSubItemAddSubItem11.setColors(Theme.getColor(i19), Theme.getColor(i19));
        groupCallActivity.soundItem.setColors(Theme.getColor(i19), Theme.getColor(i19));
        actionBarMenuSubItemAddSubItem4.setColors(Theme.getColor(i19), Theme.getColor(i19));
        int i20 = Theme.key_voipgroup_leaveCallMenu;
        actionBarMenuSubItemAddSubItem12.setColors(Theme.getColor(i20), Theme.getColor(i20));
        actionBarMenuSubItemAddSubItem7.setColors(Theme.getColor(i19), Theme.getColor(i19));
        actionBarMenuSubItemAddSubItem5.setColors(Theme.getColor(i19), Theme.getColor(i19));
        actionBarMenuSubItemAddSubItem6.setColors(Theme.getColor(i19), Theme.getColor(i19));
        actionBarMenuSubItemAddSubItem9.setColors(Theme.getColor(i19), Theme.getColor(i19));
        actionBarMenuSubItemAddSubItem8.setColors(Theme.getColor(i19), Theme.getColor(i19));
        if (groupCallActivity.call != null) {
            groupCallActivity.initCreatedGroupCall();
        }
        if (groupCallActivity.isConference()) {
            groupCallActivity.encryptionDrawable = new CallEncryptionCellDrawable(activity);
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            groupCallActivity.encryptionDrawable.setEmojis((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        groupCallActivity.updateTitle(false);
        groupCallActivity.actionBar.getTitleTextView().setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda34(groupCallActivity, 5));
        groupCallActivity.fullscreenUsersListView = new RecyclerListView(activity) {
            @Override
            public boolean drawChild(Canvas canvas, View view3, long j) {
                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) view3;
                if (!GroupCallActivity.this.renderersContainer.isAnimating() && !GroupCallActivity.this.fullscreenListItemAnimator.isRunning()) {
                    groupCallUserCell.setAlpha(1.0f);
                    groupCallUserCell.setTranslationX(0.0f);
                    groupCallUserCell.setTranslationY(0.0f);
                }
                if (groupCallUserCell.isRemoving(GroupCallActivity.this.fullscreenUsersListView) && groupCallUserCell.getRenderer() != null) {
                    return true;
                }
                if (groupCallUserCell.getTranslationY() == 0.0f || groupCallUserCell.getRenderer() == null || groupCallUserCell.getRenderer().primaryView == null) {
                    return super.drawChild(canvas, view3, j);
                }
                float top = GroupCallActivity.this.listView.getTop() - getTop();
                float measuredHeight = GroupCallActivity.this.listView.getMeasuredHeight() + top;
                float f = GroupCallActivity.this.renderersContainer.progressToFullscreenMode;
                canvas.save();
                float f2 = 1.0f - f;
                canvas.clipRect(0.0f, top * f2, getMeasuredWidth(), (getMeasuredHeight() * f) + (measuredHeight * f2));
                boolean zDrawChild = super.drawChild(canvas, view3, j);
                canvas.restore();
                return zDrawChild;
            }
        };
        DefaultItemAnimator defaultItemAnimator2 = new DefaultItemAnimator() {
            @Override
            public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                GroupCallActivity.this.listView.invalidate();
                GroupCallActivity.this.renderersContainer.invalidate();
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                GroupCallActivity.this.updateLayout(true);
            }
        };
        groupCallActivity.fullscreenListItemAnimator = defaultItemAnimator2;
        groupCallActivity.fullscreenUsersListView.setClipToPadding(false);
        defaultItemAnimator2.setDelayAnimations(false);
        defaultItemAnimator2.setTranslationInterpolator(CubicBezierInterpolator.DEFAULT);
        defaultItemAnimator2.setRemoveDuration(350L);
        defaultItemAnimator2.setAddDuration(350L);
        defaultItemAnimator2.setMoveDuration(350L);
        groupCallActivity.fullscreenUsersListView.lambda$onCellEnter$52(defaultItemAnimator2);
        groupCallActivity.fullscreenUsersListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i21, int i22) {
                super.onScrolled(recyclerView, i21, i22);
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                GroupCallActivity.this.renderersContainer.invalidate();
            }
        });
        final int i21 = 0;
        groupCallActivity.fullscreenUsersListView.setClipChildren(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.setOrientation(0);
        groupCallActivity.fullscreenUsersListView.setLayoutManager(linearLayoutManager);
        RecyclerListView recyclerListView5 = groupCallActivity.fullscreenUsersListView;
        GroupCallFullscreenAdapter groupCallFullscreenAdapter = new GroupCallFullscreenAdapter(call, groupCallActivity.currentAccount, groupCallActivity);
        groupCallActivity.fullscreenAdapter = groupCallFullscreenAdapter;
        recyclerListView5.setAdapter(groupCallFullscreenAdapter);
        groupCallActivity.fullscreenAdapter.setVisibility(groupCallActivity.fullscreenUsersListView, false);
        groupCallActivity.fullscreenUsersListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener(groupCallActivity) {
            public final GroupCallActivity f$0;

            {
                this.f$0 = groupCallActivity;
            }

            @Override
            public final void onItemClick(View view3, int i110) {
                switch (i21) {
                    case 0:
                        this.f$0.lambda$new$37(view3, i110);
                        break;
                    default:
                        this.f$0.lambda$new$26(view3, i110);
                        break;
                }
            }
        });
        groupCallActivity.fullscreenUsersListView.setOnItemLongClickListener(new GroupCallActivity$$ExternalSyntheticLambda10(groupCallActivity, 2));
        groupCallActivity.fullscreenUsersListView.setVisibility(8);
        groupCallActivity.fullscreenUsersListView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view3, RecyclerView recyclerView, RecyclerView.State state) {
                recyclerView.getChildAdapterPosition(view3);
                if (GroupCallActivity.isLandscapeMode) {
                    rect.set(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                } else {
                    rect.set(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                }
            }
        });
        GroupCallRenderersContainer groupCallRenderersContainer = new GroupCallRenderersContainer(activity, groupCallActivity.listView, groupCallActivity.fullscreenUsersListView, groupCallActivity.attachedRenderers, groupCallActivity.call, this) {
            @Override
            public boolean canHideUI() {
                return this.inFullscreenMode && GroupCallActivity.this.previewDialog == null;
            }

            @Override
            public boolean drawChild(Canvas canvas, View view3, long j) {
                if (view3 == GroupCallActivity.this.scrimRenderer) {
                    return true;
                }
                return super.drawChild(canvas, view3, j);
            }

            @Override
            public void onBackPressed() {
                GroupCallActivity.this.lambda$openCrafting$8();
            }

            @Override
            public void onFullScreenModeChanged(boolean z2) {
                GroupCallActivity.this.delayedGroupCallUpdated = z2;
                if (GroupCallActivity.isTabletMode) {
                    if (z2 || !GroupCallActivity.this.renderersContainer.inFullscreenMode) {
                        return;
                    }
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    groupCallActivity2.tabletGridAdapter.setVisibility(groupCallActivity2.tabletVideoGridView, false, true);
                    return;
                }
                if (z2) {
                    GroupCallActivity.this.undoView[0].hide(false, 1);
                    GroupCallActivity.this.renderersContainer.undoView[0].hide(false, 2);
                    if (!GroupCallActivity.this.renderersContainer.inFullscreenMode) {
                        GroupCallActivity.this.listView.setVisibility(0);
                        GroupCallActivity.this.actionBar.setVisibility(0);
                        if (GroupCallActivity.this.watchersView != null) {
                            GroupCallActivity.this.watchersView.setVisibility(0);
                        }
                    }
                    GroupCallActivity.this.updateState(true, false);
                    GroupCallActivity.this.buttonsContainer.requestLayout();
                    if (GroupCallActivity.this.fullscreenUsersListView.getVisibility() != 0) {
                        GroupCallActivity.this.fullscreenUsersListView.setVisibility(0);
                        GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                        groupCallActivity3.fullscreenAdapter.setVisibility(groupCallActivity3.fullscreenUsersListView, true);
                        GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                        groupCallActivity4.fullscreenAdapter.update(false, groupCallActivity4.fullscreenUsersListView);
                    } else {
                        GroupCallActivity groupCallActivity5 = GroupCallActivity.this;
                        groupCallActivity5.fullscreenAdapter.setVisibility(groupCallActivity5.fullscreenUsersListView, true);
                        GroupCallActivity.this.applyCallParticipantUpdates(true);
                    }
                } else {
                    if (GroupCallActivity.this.renderersContainer.inFullscreenMode) {
                        GroupCallActivity.this.actionBar.setVisibility(8);
                        GroupCallActivity.this.listView.setVisibility(8);
                        if (GroupCallActivity.this.watchersView != null) {
                            GroupCallActivity.this.watchersView.setVisibility(8);
                        }
                    } else {
                        GroupCallActivity.this.fullscreenUsersListView.setVisibility(8);
                        GroupCallActivity groupCallActivity6 = GroupCallActivity.this;
                        groupCallActivity6.fullscreenAdapter.setVisibility(groupCallActivity6.fullscreenUsersListView, false);
                    }
                    if (GroupCallActivity.this.fullscreenUsersListView.getVisibility() == 0) {
                        for (int i22 = 0; i22 < GroupCallActivity.this.fullscreenUsersListView.getChildCount(); i22++) {
                            View childAt = GroupCallActivity.this.fullscreenUsersListView.getChildAt(i22);
                            childAt.setAlpha(1.0f);
                            childAt.setScaleX(1.0f);
                            childAt.setScaleY(1.0f);
                            childAt.setTranslationX(0.0f);
                            childAt.setTranslationY(0.0f);
                            ((GroupCallFullscreenAdapter.GroupCallUserCell) childAt).setProgressToFullscreen(GroupCallActivity.this.renderersContainer.progressToFullscreenMode);
                        }
                    }
                }
                GroupCallActivity.this.buttonsBackgroundGradientView2.setVisibility(z2 ? 0 : 8);
                if (GroupCallActivity.this.delayedGroupCallUpdated) {
                    return;
                }
                GroupCallActivity.this.applyCallParticipantUpdates(true);
            }

            @Override
            public void onUiVisibilityChanged() {
                if (GroupCallActivity.this.renderersContainer == null) {
                    return;
                }
                GroupCallActivity.this.animatorHideButtons.setValue(!GroupCallActivity.this.renderersContainer.isUiVisible(), true);
            }

            @Override
            public void update() {
                invalidate();
                ((BottomSheet) GroupCallActivity.this).navBarColor = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_actionBarUnscrolled, false), Theme.getColor(null, Theme.key_voipgroup_actionBar, false), Math.max(GroupCallActivity.this.colorProgress, GroupCallActivity.this.renderersContainer == null ? 0.0f : GroupCallActivity.this.renderersContainer.progressToFullscreenMode), 1.0f);
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                groupCallActivity2.setColorProgress(groupCallActivity2.colorProgress);
            }
        };
        groupCallActivity.renderersContainer = groupCallRenderersContainer;
        groupCallRenderersContainer.setClipChildren(false);
        groupCallActivity.fullscreenAdapter.setRenderersPool(groupCallActivity.attachedRenderers, groupCallActivity.renderersContainer);
        if (groupCallActivity.tabletVideoGridView != null) {
            groupCallActivity.tabletGridAdapter.setRenderersPool(groupCallActivity.attachedRenderers, groupCallActivity.renderersContainer);
        }
        AvatarPreviewPagerIndicator avatarPreviewPagerIndicator = new AvatarPreviewPagerIndicator(activity) {
            @Override
            public void onPhotosLoaded() {
                super.onPhotosLoaded();
                long dialogId = GroupCallActivity.this.avatarsViewPager.getDialogId();
                if (dialogId > 0) {
                    TLRPC.User user = GroupCallActivity.this.accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
                    GroupCallActivity.this.avatarsViewPager.initIfEmpty(null, ImageLocation.getForUserOrChat(GroupCallActivity.this.accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(GroupCallActivity.this.accountInstance.getCurrentAccount(), user, 1), false);
                }
            }
        };
        groupCallActivity.avatarPagerIndicator = avatarPreviewPagerIndicator;
        ProfileGalleryView profileGalleryView = new ProfileGalleryView(activity, groupCallActivity.actionBar, groupCallActivity.listView, avatarPreviewPagerIndicator) {
            @Override
            public void invalidate() {
                super.invalidate();
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }
        };
        groupCallActivity.avatarsViewPager = profileGalleryView;
        profileGalleryView.setImagesLayerNum(Integer.MAX_VALUE);
        profileGalleryView.setInvalidateWithParent(true);
        avatarPreviewPagerIndicator.setProfileGalleryView(profileGalleryView);
        FrameLayout frameLayout = new FrameLayout(activity) {
            final Rect rect = new Rect();
            final RectF rectF = new RectF();
            final Path path = new Path();

            @Override
            public void dispatchDraw(Canvas canvas) {
                if (GroupCallActivity.this.progressToAvatarPreview != 1.0f) {
                    if (GroupCallActivity.this.scrimView != null && GroupCallActivity.this.hasScrimAnchorView) {
                        canvas.save();
                        float measuredHeight = (GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight());
                        int iDp = (int) ((GroupCallActivity.this.progressToAvatarPreview * AndroidUtilities.dp(13.0f)) + ((1.0f - GroupCallActivity.this.progressToAvatarPreview) * measuredHeight));
                        int i22 = (int) ((1.0f - GroupCallActivity.this.progressToAvatarPreview) * measuredHeight);
                        GroupCallActivity.this.scrimView.getAvatarWavesDrawable().draw(canvas, this, GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight() / 2, GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight() / 2);
                        GroupCallActivity.this.scrimView.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        GroupCallActivity.this.scrimView.getAvatarImageView().setRoundRadius(iDp, iDp, i22, i22);
                        GroupCallActivity.this.scrimView.getAvatarImageView().getImageReceiver().draw(canvas);
                        GroupCallActivity.this.scrimView.getAvatarImageView().setRoundRadius(GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight() / 2);
                        canvas.restore();
                    } else if (GroupCallActivity.this.scrimFullscreenView != null && GroupCallActivity.this.scrimRenderer == null && GroupCallActivity.this.previewTextureTransitionEnabled) {
                        canvas.save();
                        float measuredHeight2 = (GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight());
                        int iDp2 = (int) ((GroupCallActivity.this.progressToAvatarPreview * AndroidUtilities.dp(13.0f)) + ((1.0f - GroupCallActivity.this.progressToAvatarPreview) * measuredHeight2));
                        int i23 = (int) ((1.0f - GroupCallActivity.this.progressToAvatarPreview) * measuredHeight2);
                        GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().setRoundRadius(iDp2, iDp2, i23, i23);
                        GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getImageReceiver().draw(canvas);
                        GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().setRoundRadius(GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() / 2);
                        canvas.restore();
                    }
                }
                GroupCallActivity.this.avatarsViewPager.setAlpha(GroupCallActivity.this.progressToAvatarPreview);
                this.path.reset();
                this.rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
                this.path.addRoundRect(this.rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
                canvas.save();
                canvas.clipPath(this.path);
                View viewFindVideoActiveView = GroupCallActivity.this.avatarsViewPager.findVideoActiveView();
                if (viewFindVideoActiveView != null && GroupCallActivity.this.scrimRenderer != null && GroupCallActivity.this.scrimRenderer.attached && !GroupCallActivity.this.drawingForBlur) {
                    canvas.save();
                    this.rect.setEmpty();
                    GroupCallActivity.this.avatarsViewPager.getChildVisibleRect(viewFindVideoActiveView, this.rect, null);
                    int measuredWidth = this.rect.left;
                    if (measuredWidth < (-GroupCallActivity.this.avatarsViewPager.getMeasuredWidth())) {
                        measuredWidth += GroupCallActivity.this.avatarsViewPager.getMeasuredWidth() * 2;
                    } else if (measuredWidth > GroupCallActivity.this.avatarsViewPager.getMeasuredWidth()) {
                        measuredWidth -= GroupCallActivity.this.avatarsViewPager.getMeasuredWidth() * 2;
                    }
                    canvas.translate(measuredWidth, 0.0f);
                    GroupCallActivity.this.scrimRenderer.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                canvas.restore();
            }

            @Override
            public void invalidate() {
                super.invalidate();
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }

            @Override
            public void onMeasure(int i22, int i23) {
                int iMin = Math.min(View.MeasureSpec.getSize(i22), View.MeasureSpec.getSize(i23));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + iMin, 1073741824));
            }
        };
        groupCallActivity.avatarPreviewContainer = frameLayout;
        frameLayout.setVisibility(8);
        profileGalleryView.setVisibility(0);
        profileGalleryView.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrollStateChanged(int i22) {
            }

            @Override
            public void onPageScrolled(int i22, float f, int i23) {
            }

            @Override
            public void onPageSelected(int i22) {
                GroupCallActivity.this.avatarsViewPager.getRealPosition(i22);
                GroupCallActivity.this.avatarPagerIndicator.saveCurrentPageProgress();
                GroupCallActivity.this.avatarPagerIndicator.invalidate();
            }
        });
        View view3 = new View(activity) {
            @Override
            public void setAlpha(float f) {
                if (getAlpha() != f) {
                    super.setAlpha(f);
                    GroupCallActivity.this.checkContentOverlayed();
                }
            }
        };
        groupCallActivity.blurredView = view3;
        groupCallActivity.containerView.addView(groupCallActivity.renderersContainer);
        groupCallActivity.renderersContainer.addView(groupCallActivity.fullscreenUsersListView, LayoutHelper.createFrame(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        groupCallActivity.buttonsContainer.setWillNotDraw(false);
        View view4 = new View(activity);
        groupCallActivity.buttonsBackgroundGradientView = view4;
        int[] iArr = groupCallActivity.gradientColors;
        iArr[0] = groupCallActivity.backgroundColor;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, groupCallActivity.gradientColors);
        groupCallActivity.buttonsBackgroundGradient = gradientDrawable;
        view4.setBackground(gradientDrawable);
        groupCallActivity.containerView.addView(view4, LayoutHelper.createFrame(-1, 60, 83));
        View view5 = new View(activity);
        groupCallActivity.buttonsBackgroundGradientView2 = view5;
        view5.setBackgroundColor(groupCallActivity.gradientColors[0]);
        groupCallActivity.containerView.addView(view5, LayoutHelper.createFrame(-1, 0, 83));
        GroupCallMessagesListView groupCallMessagesListView = new GroupCallMessagesListView(activity);
        groupCallActivity.groupCallMessagesListView = groupCallMessagesListView;
        groupCallMessagesListView.setDelegate(new GroupCallMessagesListView.Delegate() {
            @Override
            public void showReaction(GroupCallMessageCell groupCallMessageCell, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
                ReactionsEffectOverlay reactionsEffectOverlay = new ReactionsEffectOverlay(GroupCallActivity.this.getContext(), null, GroupCallActivity.this.reactionsContainerLayout, groupCallMessageCell, null, 0.0f, 0.0f, visibleReaction, ((BottomSheet) GroupCallActivity.this).currentAccount, 1, false);
                ReactionsEffectOverlay.currentOverlay = reactionsEffectOverlay;
                int i22 = R.id.parent_tag;
                ReactionsEffectOverlay.AnonymousClass1 anonymousClass1 = reactionsEffectOverlay.windowView;
                anonymousClass1.setTag(i22, 1);
                GroupCallActivity.this.container.addView(anonymousClass1);
                reactionsEffectOverlay.started = true;
                reactionsEffectOverlay.startTime = System.currentTimeMillis();
            }
        });
        groupCallMessagesListView.setClickCellDelegate(new GroupCallMessageCell.Delegate() {
            private void openSenderProfile(GroupCallMessage groupCallMessage) {
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment == null) {
                    return;
                }
                if ((lastFragment instanceof ProfileActivity) && ((ProfileActivity) lastFragment).getDialogId() == groupCallMessage.fromId) {
                    GroupCallActivity.this.lambda$showGiftOfferSheet$15();
                    return;
                }
                int iCalculateScrollTopOffset = GroupCallActivity.this.calculateScrollTopOffset();
                Bundle bundle = new Bundle();
                long j = groupCallMessage.fromId;
                if (j > 0) {
                    bundle.putLong("user_id", j);
                } else {
                    bundle.putLong("chat_id", -j);
                }
                long j2 = groupCallMessage.fromId;
                boolean z2 = true;
                if (j2 == GroupCallActivity.this.accountInstance.getUserConfig().getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
                ProfileActivity profileActivity = new ProfileActivity(bundle);
                if (iCalculateScrollTopOffset > 0 && iCalculateScrollTopOffset != Integer.MAX_VALUE) {
                    z2 = false;
                }
                lastFragment.presentFragment(profileActivity, false, z2);
                GroupCallActivity.this.lambda$showGiftOfferSheet$15();
            }

            @Override
            public void didClickAvatar(GroupCallMessageCell groupCallMessageCell, GroupCallMessage groupCallMessage, float f, float f2) {
                openSenderProfile(groupCallMessage);
            }

            @Override
            public void didClickSenderName(GroupCallMessageCell groupCallMessageCell, GroupCallMessage groupCallMessage) {
                openSenderProfile(groupCallMessage);
            }
        });
        if (groupCallActivity.call != null) {
            groupCallMessagesListView.setGroupCall(groupCallActivity.accountInstance.getCurrentAccount(), groupCallActivity.call.getInputGroupCall(false));
        }
        groupCallActivity.containerView.addView(groupCallMessagesListView, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(activity, false, true, true);
        groupCallActivity.limitTextView = animatedTextView;
        animatedTextView.setGravity(17);
        animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
        animatedTextView.setTextColor(-1);
        animatedTextView.setAnimationProperties(0.4f, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        animatedTextView.setTypeface(AndroidUtilities.bold());
        groupCallActivity.containerView.addView(groupCallActivity.buttonsContainer);
        EditTextEmoji editTextEmoji = new EditTextEmoji(activity, groupCallActivity.sizeNotifierFrameLayout, LaunchActivity.getLastFragment(), 5, true, groupCallActivity.resourcesProvider) {
            @Override
            public boolean allowSearch() {
                return true;
            }

            @Override
            public void createEmojiView() {
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
            public boolean drawChild(Canvas canvas, View view6, long j) {
                if (view6 != getEditText()) {
                    return super.drawChild(canvas, view6, j);
                }
                canvas.save();
                GroupCallActivity.this.callMessageEnterView.getEditText().setTranslationY(view6.getMeasuredHeight() - GroupCallActivity.this.animatorMessageInputHeight.factor);
                boolean zDrawChild = super.drawChild(canvas, view6, j);
                canvas.restore();
                return zDrawChild;
            }

            @Override
            public void onEmojiKeyboardUpdate() {
                int iMax;
                super.onEmojiKeyboardUpdate();
                if (isPopupShowing()) {
                    iMax = Math.max(0, getEmojiPadding());
                } else {
                    iMax = isWaitingForKeyboardOpen() ? Math.max(0, getKeyboardHeight()) : 0;
                }
                if (iMax <= 0) {
                    GroupCallActivity.this.windowInsetsStateHolder.resetInAppKeyboardHeight(false);
                    return;
                }
                WindowInsetsStateHolder windowInsetsStateHolder = GroupCallActivity.this.windowInsetsStateHolder;
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
            public void onMeasure(int i22, int i23) {
                super.onMeasure(i22, i23);
                if (GroupCallActivity.this.animatorMessageInputHeight.factor == 0.0f) {
                    GroupCallActivity.this.animatorMessageInputHeight.forceFactor(getMeasuredHeight());
                } else {
                    GroupCallActivity.this.animatorMessageInputHeight.animateTo(getMeasuredHeight());
                }
            }

            @Override
            public void updatedEmojiExpanded() {
                super.updatedEmojiExpanded();
                ((BottomSheet) GroupCallActivity.this).containerView.requestApplyInsets();
            }
        };
        groupCallActivity.callMessageEnterView = editTextEmoji;
        editTextEmoji.includeNavigationBar = true;
        editTextEmoji.setFilters(new InputFilter[]{new InputFilter.LengthFilter(groupCallActivity.maxGroupCallMessageLength)});
        editTextEmoji.getEditText().setLinkTextColor(-11683585);
        editTextEmoji.setHint(LocaleController.getString(R.string.TypeMessage));
        editTextEmoji.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                String str2;
                GroupCallActivity.this.animatorMessageIsEmpty.setValue(TextUtils.isEmpty(editable), true);
                int iCodePointCount = Character.codePointCount(editable, 0, editable.length());
                int i22 = GroupCallActivity.this.maxGroupCallMessageLength;
                if (iCodePointCount + 25 > i22) {
                    str2 = "" + (i22 - iCodePointCount);
                } else {
                    str2 = null;
                }
                GroupCallActivity.this.limitTextView.cancelAnimation();
                GroupCallActivity.this.limitTextView.setText(str2);
                GroupCallActivity.this.limitTextView.setTextColor(iCodePointCount >= i22 ? -1280137 : -1);
                if (iCodePointCount > i22) {
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                }
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i22, int i23, int i24) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i22, int i23, int i24) {
            }
        });
        editTextEmoji.onResume();
        FrameLayout frameLayout2 = new FrameLayout(activity) {
            private final RectF tmpRect = new RectF();
            private final RectF tmpRect2 = new RectF();
            private final RectF tmpRect3 = new RectF();
            private final Paint backgroundPaint = new Paint(1);

            @Override
            public void dispatchDraw(Canvas canvas) {
                this.tmpRect.set(0.0f, (GroupCallActivity.this.callMessageEnterContainer.getY() + GroupCallActivity.this.callMessageEnterContainer.getMeasuredHeight()) - GroupCallActivity.this.animatorMessageInputHeight.factor, getMeasuredWidth(), getMeasuredHeight());
                this.tmpRect2.set(0.0f, GroupCallActivity.this.callMessageEnterContainer.getY() + GroupCallActivity.this.callMessageEnterContainer.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                this.tmpRect3.set(0.0f, (GroupCallActivity.this.callMessageEnterContainer.getY() + GroupCallActivity.this.callMessageEnterContainer.getMeasuredHeight()) - GroupCallActivity.this.animatorMessageInputHeight.factor, getMeasuredWidth(), GroupCallActivity.this.callMessageEnterContainer.getY() + GroupCallActivity.this.callMessageEnterContainer.getMeasuredHeight());
                if (Build.VERSION.SDK_INT < 29 || GroupCallActivity.this.renderNodeBlur == null || !canvas.isHardwareAccelerated()) {
                    this.backgroundPaint.setColor(-14933463);
                    canvas.drawRect(this.tmpRect3, this.backgroundPaint);
                    this.backgroundPaint.setColor(ColorUtils.compositeColors(234881023, -14933463));
                    canvas.drawRect(this.tmpRect2, this.backgroundPaint);
                } else {
                    this.backgroundPaint.setColor(-14933463);
                    canvas.drawRect(this.tmpRect, this.backgroundPaint);
                    canvas.save();
                    canvas.clipRect(this.tmpRect);
                    canvas.translate(-getX(), -getY());
                    canvas.scale(GroupCallActivity.this.renderNodeBlurScale, GroupCallActivity.this.renderNodeBlurScale);
                    canvas.drawRenderNode(GroupCallActivity.this.renderNodeBlur);
                    canvas.restore();
                    this.backgroundPaint.setColor(234881023);
                    canvas.drawRect(this.tmpRect2, this.backgroundPaint);
                }
                super.dispatchDraw(canvas);
            }
        };
        groupCallActivity.callMessageEnterUnderContainer = frameLayout2;
        groupCallActivity.containerView.addView(frameLayout2, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout3 = new FrameLayout(activity) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (getAlpha() <= 0.95f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        groupCallActivity.callMessageEnterContainer = frameLayout3;
        frameLayout3.addView(editTextEmoji, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        frameLayout3.addView(animatedTextView, LayoutHelper.createFrame(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        animatedTextView.setTranslationY(-AndroidUtilities.dp(20.0f));
        groupCallActivity.containerView.addView(frameLayout3, LayoutHelper.createFrame(-1, -2, 80));
        ImageView imageView3 = new ImageView(activity);
        groupCallActivity.callMessageHideButton = imageView3;
        int i22 = Theme.key_listSelector;
        imageView3.setBackground(Theme.createSelectorDrawable(groupCallActivity.getThemedColor(i22), 1, -1));
        int color2 = Theme.getColor(Theme.key_graySectionText, groupCallActivity.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(color2, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda34(groupCallActivity, 6));
        ImageView imageView4 = new ImageView(activity);
        groupCallActivity.callMessageSendButton = imageView4;
        imageView4.setBackground(Theme.createSelectorDrawable(groupCallActivity.getThemedColor(i22), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, groupCallActivity.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda34(groupCallActivity, 7));
        frameLayout3.addView(imageView3, LayoutHelper.createFrame(48, 48, 85));
        frameLayout3.addView(imageView4, LayoutHelper.createFrame(48, 48, 85));
        groupCallActivity.containerView.addView(view3);
        frameLayout.addView(profileGalleryView, LayoutHelper.createFrame(-1, -1.0f));
        frameLayout.addView(avatarPreviewPagerIndicator, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        groupCallActivity.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        groupCallActivity.applyCallParticipantUpdates(false);
        groupCallActivity.listAdapter.notifyDataSetChanged();
        if (isTabletMode) {
            groupCallActivity.tabletGridAdapter.update(false, groupCallActivity.tabletVideoGridView);
        }
        groupCallActivity.oldCount = groupCallActivity.listAdapter.getItemCount();
        if (inputPeer != null) {
            TextView textView2 = new TextView(activity);
            groupCallActivity.scheduleInfoTextView = textView2;
            textView2.setGravity(17);
            groupCallActivity.scheduleInfoTextView.setTextColor(-8682615);
            groupCallActivity.scheduleInfoTextView.setTextSize(1, 14.0f);
            if (ChatObject.isChannel(groupCallActivity.currentChat) && (chat2 = groupCallActivity.currentChat) != null && !chat2.megagroup) {
                groupCallActivity.scheduleInfoTextView.setTag(1);
            }
            groupCallActivity.containerView.addView(groupCallActivity.scheduleInfoTextView, LayoutHelper.createFrame(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            final NumberPicker numberPicker = new NumberPicker(activity);
            numberPicker.setTextColor(-1);
            numberPicker.setSelectorColor(-9598483);
            numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
            numberPicker.setItemCount(5);
            final NumberPicker numberPicker2 = new NumberPicker(activity) {
                @Override
                public CharSequence getContentDescription(int i23) {
                    return LocaleController.formatPluralString("Hours", i23, new Object[0]);
                }
            };
            numberPicker2.setItemCount(5);
            numberPicker2.setTextColor(-1);
            numberPicker2.setSelectorColor(-9598483);
            numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
            final NumberPicker numberPicker3 = new NumberPicker(activity) {
                @Override
                public CharSequence getContentDescription(int i23) {
                    return LocaleController.formatPluralString("Minutes", i23, new Object[0]);
                }
            };
            numberPicker3.setItemCount(5);
            numberPicker3.setTextColor(-1);
            numberPicker3.setSelectorColor(-9598483);
            numberPicker3.setTextOffset(-AndroidUtilities.dp(34.0f));
            TextView textView3 = new TextView(activity) {
                private final Paint tmpPaint;
                private final RectF tmpRectF = new RectF();

                {
                    Paint paint5 = new Paint(1);
                    this.tmpPaint = paint5;
                    paint5.setStyle(Paint.Style.FILL);
                    paint5.setColor(-16711936);
                }

                @Override
                public void dispatchDraw(Canvas canvas) {
                    this.tmpRectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(this.tmpRectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.tmpPaint);
                    super.dispatchDraw(canvas);
                }

                @Override
                public void draw(Canvas canvas) {
                    super.draw(canvas);
                }

                @Override
                public void onDraw(Canvas canvas) {
                    this.tmpPaint.setColor(-16711936);
                    this.tmpRectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(this.tmpRectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.tmpPaint);
                    super.onDraw(canvas);
                }

                @Override
                public void onMeasure(int i23, int i24) {
                    super.onMeasure(i23, i24);
                }
            };
            groupCallActivity.scheduleButtonTextView = textView3;
            textView3.setLines(1);
            groupCallActivity.scheduleButtonTextView.setSingleLine(true);
            groupCallActivity.scheduleButtonTextView.setEllipsize(TextUtils.TruncateAt.END);
            groupCallActivity.scheduleButtonTextView.setGravity(17);
            groupCallActivity.scheduleButtonTextView.setTextColor(-1);
            groupCallActivity.scheduleButtonTextView.setTypeface(AndroidUtilities.bold());
            groupCallActivity.scheduleButtonTextView.setTextSize(1, 14.0f);
            groupCallActivity.containerView.addView(groupCallActivity.scheduleButtonTextView, LayoutHelper.createFrame(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            final TLRPC.InputPeer inputPeer2 = groupCallPeer;
            groupCallActivity.scheduleButtonTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view6) {
                    this.f$0.lambda$new$45(numberPicker, numberPicker2, numberPicker3, chat, accountInstance, inputPeer2, view6);
                }
            });
            LinearLayout linearLayout3 = new LinearLayout(activity) {
                boolean ignoreLayout = false;

                @Override
                public void onMeasure(int i23, int i24) {
                    this.ignoreLayout = true;
                    numberPicker.setItemCount(5);
                    numberPicker2.setItemCount(5);
                    numberPicker3.setItemCount(5);
                    numberPicker.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                    numberPicker2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                    numberPicker3.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                    this.ignoreLayout = false;
                    super.onMeasure(i23, i24);
                }

                @Override
                public void requestLayout() {
                    if (this.ignoreLayout) {
                        return;
                    }
                    super.requestLayout();
                }
            };
            groupCallActivity = this;
            activity2 = activity;
            groupCallActivity.scheduleTimerContainer = linearLayout3;
            linearLayout3.setWeightSum(1.0f);
            groupCallActivity.scheduleTimerContainer.setOrientation(0);
            groupCallActivity.containerView.addView(groupCallActivity.scheduleTimerContainer, LayoutHelper.createFrame(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long jCurrentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jCurrentTimeMillis);
            int i23 = calendar.get(1);
            int i24 = calendar.get(6);
            groupCallActivity.scheduleTimerContainer.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.5f));
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(365);
            numberPicker.setWrapSelectorWheel(false);
            numberPicker.setFormatter(new GroupCallActivity$$ExternalSyntheticLambda48(jCurrentTimeMillis, calendar, i23, 0));
            ArticleViewer$$ExternalSyntheticLambda11 articleViewer$$ExternalSyntheticLambda11 = new ArticleViewer$$ExternalSyntheticLambda11(5, groupCallActivity, numberPicker, numberPicker2, numberPicker3);
            numberPicker.setOnValueChangedListener(articleViewer$$ExternalSyntheticLambda11);
            numberPicker2.setMinValue(0);
            numberPicker2.setMaxValue(23);
            groupCallActivity.scheduleTimerContainer.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
            numberPicker2.setFormatter(new ChatActivity$$ExternalSyntheticLambda49(23));
            numberPicker2.setOnValueChangedListener(articleViewer$$ExternalSyntheticLambda11);
            numberPicker3.setMinValue(0);
            numberPicker3.setMaxValue(59);
            numberPicker3.setValue(0);
            numberPicker3.setFormatter(new ChatActivity$$ExternalSyntheticLambda49(24));
            groupCallActivity.scheduleTimerContainer.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.3f));
            numberPicker3.setOnValueChangedListener(articleViewer$$ExternalSyntheticLambda11);
            calendar.setTimeInMillis(jCurrentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i25 = calendar.get(6);
            int i26 = calendar.get(12);
            int i27 = calendar.get(11);
            numberPicker.setValue(i24 != i25 ? 1 : 0);
            numberPicker3.setValue(i26);
            numberPicker2.setValue(i27);
            AlertsCreator.checkScheduleDate(groupCallActivity.scheduleButtonTextView, groupCallActivity.scheduleInfoTextView, 604800L, 2, numberPicker, numberPicker2, numberPicker3);
        } else {
            activity2 = activity;
        }
        PinchToZoomHelper pinchToZoomHelper = new PinchToZoomHelper((ViewGroup) groupCallActivity.getWindow().getDecorView(), groupCallActivity.containerView) {
            @Override
            public void drawOverlays(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
                if (f > 0.0f) {
                    float x = ((BottomSheet) GroupCallActivity.this).containerView.getX() + GroupCallActivity.this.avatarPreviewContainer.getX();
                    float y = ((BottomSheet) GroupCallActivity.this).containerView.getY() + GroupCallActivity.this.avatarPreviewContainer.getY();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(x, y, GroupCallActivity.this.avatarsViewPager.getMeasuredWidth() + x, GroupCallActivity.this.avatarsViewPager.getMeasuredHeight() + y);
                    canvas.saveLayerAlpha(rectF, (int) (f * 255.0f), 31);
                    canvas.translate(x, y);
                    GroupCallActivity.this.avatarPreviewContainer.draw(canvas);
                    canvas.restore();
                }
            }

            @Override
            public void invalidateViews() {
                super.invalidateViews();
                for (int i28 = 0; i28 < GroupCallActivity.this.avatarsViewPager.getChildCount(); i28++) {
                    GroupCallActivity.this.avatarsViewPager.getChildAt(i28).invalidate();
                }
            }
        };
        groupCallActivity.pinchToZoomHelper = pinchToZoomHelper;
        pinchToZoomHelper.setCallback(new PinchToZoomHelper.Callback() {
            @Override
            public final TextureView getCurrentTextureView() {
                return PinchToZoomHelper.Callback.CC.$default$getCurrentTextureView(this);
            }

            @Override
            public void onZoomFinished(MessageObject messageObject) {
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }

            @Override
            public void onZoomStarted(MessageObject messageObject) {
                GroupCallActivity.this.listView.cancelClickRunnables(true);
                GroupCallActivity.this.pinchToZoomHelper.getPhotoImage().setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }
        });
        profileGalleryView.setPinchToZoomHelper(groupCallActivity.pinchToZoomHelper);
        final int i28 = 1;
        groupCallActivity.cameraButton.setOnClickListener(new View.OnClickListener(groupCallActivity) {
            public final GroupCallActivity f$0;

            {
                this.f$0 = groupCallActivity;
            }

            @Override
            public final void onClick(View view6) {
                switch (i28) {
                    case 0:
                        this.f$0.lambda$new$31(activity2, view6);
                        break;
                    default:
                        this.f$0.lambda$new$50(activity2, view6);
                        break;
                }
            }
        });
        groupCallActivity.updateScheduleUI(false);
        groupCallActivity.updateItems();
        groupCallActivity.updateSpeakerPhoneIcon(false);
        groupCallActivity.updateState(false, false);
        groupCallActivity.setColorProgress(0.0f);
        groupCallActivity.updateSubtitle();
        FrameLayout frameLayout4 = new FrameLayout(activity2);
        groupCallActivity.bulletinContainer = frameLayout4;
        groupCallActivity.containerView.addView(frameLayout4, LayoutHelper.createFrame(-1, 200, 87));
        groupCallActivity.messageButton.setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda34(groupCallActivity, 8));
        groupCallActivity.checkGroupCallUi();
        ScaleStateListAnimator.apply(groupCallActivity.cameraButton);
        ScaleStateListAnimator.apply(groupCallActivity.soundButton);
        ScaleStateListAnimator.apply(groupCallActivity.flipButton);
        ScaleStateListAnimator.apply(groupCallActivity.speakerButton);
        ScaleStateListAnimator.apply(groupCallActivity.muteButton);
        ScaleStateListAnimator.apply(groupCallActivity.leaveButton);
        ScaleStateListAnimator.apply(groupCallActivity.messageButton);
        ViewCompat.setOnApplyWindowInsetsListener(groupCallActivity.containerView, new GroupCallActivity$$ExternalSyntheticLambda10(groupCallActivity, 3));
    }

    public static float access$12516(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.amplitude + f;
        groupCallActivity.amplitude = f2;
        return f2;
    }

    public static float access$14516(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.switchProgress + f;
        groupCallActivity.switchProgress = f2;
        return f2;
    }

    public static float access$15616(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showWavesProgress + f;
        groupCallActivity.showWavesProgress = f2;
        return f2;
    }

    public static float access$15624(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showWavesProgress - f;
        groupCallActivity.showWavesProgress = f2;
        return f2;
    }

    public static float access$15716(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showLightingProgress + f;
        groupCallActivity.showLightingProgress = f2;
        return f2;
    }

    public static float access$15724(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showLightingProgress - f;
        groupCallActivity.showLightingProgress = f2;
        return f2;
    }

    public void applyCallParticipantUpdates(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        GroupCallRenderersContainer groupCallRenderersContainer;
        int i5;
        ChatObject.Call call;
        ChatObject.Call call2;
        GroupCallRenderersContainer groupCallRenderersContainer2;
        ChatObject.VideoParticipant videoParticipant;
        ChatObject.VideoParticipant videoParticipant2;
        View childAt;
        boolean z2;
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
        boolean z3;
        boolean z4;
        GroupCallRenderersContainer groupCallRenderersContainer3 = this.renderersContainer;
        if (groupCallRenderersContainer3 == null || this.listView == null || this.call == null || this.delayedGroupCallUpdated) {
            return;
        }
        boolean z5 = true;
        if (groupCallRenderersContainer3.inFullscreenMode) {
            groupCallRenderersContainer3.setVisibleParticipant(true);
        }
        long peerId = MessageObject.getPeerId(this.call.selfPeer);
        if (peerId != MessageObject.getPeerId(this.selfPeer) && this.call.participants.get(peerId) != null) {
            this.selfPeer = this.call.selfPeer;
        }
        int childCount = this.listView.getChildCount();
        int top = Integer.MAX_VALUE;
        View view = null;
        int layoutPosition = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = this.listView.getChildAt(i6);
            RecyclerView.ViewHolder viewHolderFindContainingViewHolder2 = this.listView.findContainingViewHolder(childAt2);
            if (viewHolderFindContainingViewHolder2 != null && viewHolderFindContainingViewHolder2.getAdapterPosition() != -1 && viewHolderFindContainingViewHolder2.getLayoutPosition() != -1 && (view == null || childAt2.getTop() < top)) {
                layoutPosition = viewHolderFindContainingViewHolder2.getLayoutPosition();
                top = childAt2.getTop();
                view = childAt2;
            }
        }
        updateVideoParticipantList();
        if (this.listView.getItemAnimator() != null && !z) {
            this.listView.lambda$onCellEnter$52(null);
        } else if (this.listView.getItemAnimator() == null && z) {
            this.listView.lambda$onCellEnter$52(this.itemAnimator);
        }
        try {
            UpdateCallback updateCallback = new UpdateCallback(this.listAdapter);
            try {
                try {
                    i2 = layoutPosition;
                    i = childCount;
                    try {
                        setOldRows(this.listAdapter.encryptionRow, this.listAdapter.addMemberRow, this.listAdapter.usersStartRow, this.listAdapter.usersEndRow, this.listAdapter.invitedStartRow, this.listAdapter.invitedEndRow, this.listAdapter.shadyJoinStartRow, this.listAdapter.shadyJoinEndRow, this.listAdapter.shadyLeftStartRow, this.listAdapter.shadyLeftEndRow, this.listAdapter.usersVideoGridStartRow, this.listAdapter.usersVideoGridEndRow, this.listAdapter.videoGridDividerRow, this.listAdapter.videoNotAvailableRow, this.listAdapter.conferenceAddPeopleRow, this.listAdapter.conferenceShareLinkRow);
                        this.listAdapter.updateRows();
                        z5 = true;
                        try {
                            DiffUtil.calculateDiff(this.diffUtilsCallback, true).dispatchUpdatesTo(updateCallback);
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            this.listAdapter.notifyDataSetChanged();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        z5 = true;
                        FileLog.e(e);
                        this.listAdapter.notifyDataSetChanged();
                        this.call.saveActiveDates();
                        if (view != null) {
                            this.layoutManager.scrollToPositionWithOffset(i2, view.getTop() - this.listView.getPaddingTop());
                        }
                        this.oldParticipants.clear();
                        this.oldParticipants.addAll(this.call.visibleParticipants);
                        this.oldVideoParticipants.clear();
                        this.oldVideoParticipants.addAll(this.visibleVideoParticipants);
                        this.oldInvited.clear();
                        this.oldInvited.addAll(this.call.invitedUsers);
                        this.oldShadyJoin.clear();
                        this.oldShadyJoin.addAll(this.call.shadyJoinParticipants);
                        this.oldShadyLeft.clear();
                        this.oldShadyLeft.addAll(this.call.shadyLeftParticipants);
                        this.oldCount = this.listAdapter.getItemCount();
                        i3 = i;
                        for (i4 = 0; i4 < i3; i4++) {
                            childAt = this.listView.getChildAt(i4);
                            z2 = childAt instanceof GroupCallUserCell;
                            if (z2) {
                                if (z2) {
                                    GroupCallUserCell groupCallUserCell = (GroupCallUserCell) childAt;
                                    if (viewHolderFindContainingViewHolder.getAdapterPosition() != this.listAdapter.getItemCount() - 2) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    groupCallUserCell.setDrawDivider(z4);
                                } else {
                                    GroupCallInvitedCell groupCallInvitedCell = (GroupCallInvitedCell) childAt;
                                    if (viewHolderFindContainingViewHolder.getAdapterPosition() != this.listAdapter.getItemCount() - 2) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    groupCallInvitedCell.setDrawDivider(z3);
                                }
                            } else if (z2) {
                                GroupCallUserCell groupCallUserCell2 = (GroupCallUserCell) childAt;
                                if (viewHolderFindContainingViewHolder.getAdapterPosition() != this.listAdapter.getItemCount() - 2) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                groupCallUserCell2.setDrawDivider(z4);
                            } else {
                                GroupCallInvitedCell groupCallInvitedCell2 = (GroupCallInvitedCell) childAt;
                                if (viewHolderFindContainingViewHolder.getAdapterPosition() != this.listAdapter.getItemCount() - 2) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                groupCallInvitedCell2.setDrawDivider(z3);
                            }
                        }
                        boolean zAutoPinEnabled = this.renderersContainer.autoPinEnabled();
                        groupCallRenderersContainer = this.renderersContainer;
                        if (!groupCallRenderersContainer.inFullscreenMode) {
                        }
                        this.fullscreenAdapter.update(z5, this.fullscreenUsersListView);
                        if (this.fullscreenUsersListView.getVisibility() == 0) {
                            AndroidUtilities.updateVisibleRows(this.fullscreenUsersListView);
                        }
                        if (isTabletMode) {
                            this.tabletGridAdapter.update(z5, this.tabletVideoGridView);
                        }
                        if (this.listView.getVisibility() == 0) {
                            AndroidUtilities.updateVisibleRows(this.listView);
                        }
                        this.attachedRenderersTmp.clear();
                        this.attachedRenderersTmp.addAll(this.attachedRenderers);
                        for (i5 = 0; i5 < this.attachedRenderersTmp.size(); i5++) {
                            this.attachedRenderersTmp.get(i5).updateAttachState(z5);
                        }
                        call = this.call;
                        if (call != null) {
                            groupCallRenderersContainer2 = this.renderersContainer;
                            if (groupCallRenderersContainer2.inFullscreenMode) {
                                call.participants.get(MessageObject.getPeerId(videoParticipant.participant.peer));
                            }
                        }
                        call2 = this.call;
                        if (call2 != null) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        this.animatorHasVideo.setValue(z5, z);
                        if (z5 != this.hasVideo) {
                            this.hasVideo = z5;
                            if (isTabletMode) {
                                this.containerView.requestLayout();
                            }
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    i2 = layoutPosition;
                    i = childCount;
                }
            } catch (Exception e4) {
                e = e4;
                i = childCount;
                i2 = layoutPosition;
            }
        } catch (Exception e5) {
            e = e5;
            i = childCount;
            i2 = layoutPosition;
        }
        this.call.saveActiveDates();
        if (view != null) {
            this.layoutManager.scrollToPositionWithOffset(i2, view.getTop() - this.listView.getPaddingTop());
        }
        this.oldParticipants.clear();
        this.oldParticipants.addAll(this.call.visibleParticipants);
        this.oldVideoParticipants.clear();
        this.oldVideoParticipants.addAll(this.visibleVideoParticipants);
        this.oldInvited.clear();
        this.oldInvited.addAll(this.call.invitedUsers);
        this.oldShadyJoin.clear();
        this.oldShadyJoin.addAll(this.call.shadyJoinParticipants);
        this.oldShadyLeft.clear();
        this.oldShadyLeft.addAll(this.call.shadyLeftParticipants);
        this.oldCount = this.listAdapter.getItemCount();
        i3 = i;
        while (i4 < i3) {
            childAt = this.listView.getChildAt(i4);
            z2 = childAt instanceof GroupCallUserCell;
            if ((z2 || (childAt instanceof GroupCallInvitedCell)) && (viewHolderFindContainingViewHolder = this.listView.findContainingViewHolder(childAt)) != null) {
                if (z2) {
                    GroupCallUserCell groupCallUserCell3 = (GroupCallUserCell) childAt;
                    if (viewHolderFindContainingViewHolder.getAdapterPosition() != this.listAdapter.getItemCount() - 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    groupCallUserCell3.setDrawDivider(z4);
                } else {
                    GroupCallInvitedCell groupCallInvitedCell3 = (GroupCallInvitedCell) childAt;
                    if (viewHolderFindContainingViewHolder.getAdapterPosition() != this.listAdapter.getItemCount() - 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    groupCallInvitedCell3.setDrawDivider(z3);
                }
            }
        }
        boolean zAutoPinEnabled2 = this.renderersContainer.autoPinEnabled();
        groupCallRenderersContainer = this.renderersContainer;
        if (!groupCallRenderersContainer.inFullscreenMode && (videoParticipant2 = groupCallRenderersContainer.fullscreenParticipant) != null && !ChatObject.Call.videoIsActive(videoParticipant2.participant, videoParticipant2.presentation, this.call)) {
            if (this.visibleVideoParticipants.isEmpty()) {
                fullscreenFor(null);
            } else if (zAutoPinEnabled2) {
                fullscreenFor(this.visibleVideoParticipants.get(0));
            }
        }
        this.fullscreenAdapter.update(z5, this.fullscreenUsersListView);
        if (this.fullscreenUsersListView.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(this.fullscreenUsersListView);
        }
        if (isTabletMode) {
            this.tabletGridAdapter.update(z5, this.tabletVideoGridView);
        }
        if (this.listView.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(this.listView);
        }
        this.attachedRenderersTmp.clear();
        this.attachedRenderersTmp.addAll(this.attachedRenderers);
        while (i5 < this.attachedRenderersTmp.size()) {
            this.attachedRenderersTmp.get(i5).updateAttachState(z5);
        }
        call = this.call;
        if (call != null) {
            groupCallRenderersContainer2 = this.renderersContainer;
            if (groupCallRenderersContainer2.inFullscreenMode && (videoParticipant = groupCallRenderersContainer2.fullscreenParticipant) != null) {
                call.participants.get(MessageObject.getPeerId(videoParticipant.participant.peer));
            }
        }
        call2 = this.call;
        if (call2 != null || call2.visibleVideoParticipants.isEmpty()) {
            z5 = false;
        }
        this.animatorHasVideo.setValue(z5, z);
        if (z5 != this.hasVideo) {
            this.hasVideo = z5;
            if (isTabletMode) {
                this.containerView.requestLayout();
            }
        }
    }

    public void attachRenderer(GroupCallGridCell groupCallGridCell, boolean z) {
        if (isDismissed()) {
            return;
        }
        if (z && groupCallGridCell.getRenderer() == null) {
            groupCallGridCell.setRenderer(GroupCallMiniTextureView.getOrCreate(this.attachedRenderers, this.renderersContainer, groupCallGridCell, null, null, groupCallGridCell.getParticipant(), this.call, this));
        } else {
            if (z || groupCallGridCell.getRenderer() == null) {
                return;
            }
            groupCallGridCell.getRenderer().setPrimaryView(null);
            groupCallGridCell.setRenderer(null);
        }
    }

    public int calculateScrollTopOffset() {
        int childCount = this.listView.getChildCount();
        int iMin = Integer.MAX_VALUE;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if (this.listView.getChildAdapterPosition(childAt) >= 0) {
                iMin = Math.min(iMin, childAt.getTop());
            }
        }
        return iMin;
    }

    private void cancelMutePress() {
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

    public void checkContentOverlayed() {
        boolean z = !this.avatarPriviewTransitionInProgress && this.blurredView.getVisibility() == 0 && this.blurredView.getAlpha() == 1.0f;
        if (this.contentFullyOverlayed != z) {
            this.contentFullyOverlayed = z;
            this.buttonsContainer.invalidate();
            this.containerView.invalidate();
            this.listView.invalidate();
        }
    }

    private void checkGroupCallUi() {
        checkGroupCallUiPositions_EnterView();
        checkGroupCallUiPositions_ReactionsLayout();
        checkGroupCallUiPositions_MessagesList();
        checkGroupCallUiPositions_ButtonsList();
        checkGroupCallUiPositions_FullscreenUsersList();
        checkGroupCallUiPositions_SendButton();
        checkGroupCallUiAlpha_ButtonsList();
        checkGroupCallUiAlpha_EnterView();
        checkGroupCallUiAlpha_ReactionsLayout();
    }

    private void checkGroupCallUiAlpha_ButtonsList() {
        this.buttonsContainer.setAlpha(1.0f - this.animatorHideButtons.floatValue);
    }

    private void checkGroupCallUiAlpha_EnterView() {
        float f = this.windowInsetsStateHolder.keyboardVisibility.now;
        int i = f > 0.0f ? 0 : 8;
        this.callMessageEnterContainer.setAlpha(f);
        this.callMessageEnterUnderContainer.setAlpha(f);
        if (this.callMessageEnterContainer.getVisibility() != i) {
            this.callMessageEnterContainer.setVisibility(i);
            this.callMessageEnterUnderContainer.setVisibility(i);
            if (i == 8 && this.callMessageEnterView.isFocused()) {
                this.callMessageEnterView.clearFocus();
            }
        }
    }

    private void checkGroupCallUiAlpha_ReactionsLayout() {
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

    private void checkGroupCallUiPositions_ButtonsList() {
        if (isTabletMode) {
            this.buttonsContainer.setTranslationX(0.0f);
            this.buttonsContainer.setTranslationY(0.0f);
        } else if (isLandscapeMode) {
            this.buttonsContainer.setTranslationX(this.animatorHideButtons.floatValue * AndroidUtilities.dp(94.0f));
            this.buttonsContainer.setTranslationY(0.0f);
        } else {
            this.buttonsContainer.setTranslationX(0.0f);
            this.buttonsContainer.setTranslationY(this.animatorHideButtons.floatValue * AndroidUtilities.dp(94.0f));
        }
    }

    private void checkGroupCallUiPositions_EnterView() {
        this.callMessageEnterContainer.setTranslationY((-this.windowInsetsStateHolder.getAnimatedMaxBottomInset()) + this.containerView.getPaddingBottom());
        this.callMessageEnterUnderContainer.invalidate();
    }

    private void checkGroupCallUiPositions_FullscreenUsersList() {
        if (isTabletMode) {
            this.fullscreenUsersListView.setTranslationX(0.0f);
            this.fullscreenUsersListView.setTranslationY(0.0f);
        } else if (isLandscapeMode) {
            this.fullscreenUsersListView.setTranslationX(this.animatorHideButtons.floatValue * AndroidUtilities.dp(94.0f));
            this.fullscreenUsersListView.setTranslationY(0.0f);
        } else {
            this.fullscreenUsersListView.setTranslationX(0.0f);
            this.fullscreenUsersListView.setTranslationY(this.animatorHideButtons.floatValue * AndroidUtilities.dp(94.0f));
        }
    }

    public void checkGroupCallUiPositions_MessagesList() {
        float fDp;
        float f = -((this.windowInsetsStateHolder.getAnimatedMaxBottomInset() - this.containerView.getPaddingBottom()) + this.animatorMessageInputHeight.factor + (AndroidUtilities.dp(68.0f) * this.animatorMessageIsEmpty.floatValue) + AndroidUtilities.dp(10.0f));
        if (isTabletMode) {
            fDp = (1.0f - this.animatorHasVideo.floatValue) * AndroidUtilities.dp(-91.0f);
        } else {
            fDp = isLandscapeMode ? 0.0f : ((this.animatorHideButtons.floatValue * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.renderersContainer.progressToFullscreenMode)) - AndroidUtilities.dp(91.0f);
        }
        float fLerp = AndroidUtilities.lerp(fDp, f, this.windowInsetsStateHolder.keyboardVisibility.now);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.scrollOffsetY) + fLerp) - this.backgroundPaddingTop;
        float fMax = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        this.groupCallMessagesListView.setTranslationY(fLerp);
        this.groupCallMessagesListView.setVisibleHeight((int) fMax);
    }

    private void checkGroupCallUiPositions_ReactionsLayout() {
        if (this.reactionsContainerLayout != null) {
            this.reactionsContainerLayout.setTranslationY((-this.windowInsetsStateHolder.getAnimatedMaxBottomInset()) + this.containerView.getPaddingBottom() + ((-this.animatorMessageIsEmpty.floatValue) * AndroidUtilities.dp(64.0f)));
        }
    }

    private void checkGroupCallUiPositions_SendButton() {
        float f = this.animatorMessageIsEmpty.floatValue;
        this.callMessageHideButton.setScaleX(AndroidUtilities.lerp(0.25f, 1.0f, f));
        this.callMessageHideButton.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f));
        this.callMessageHideButton.setAlpha(f);
        this.callMessageHideButton.setClickable(f > 0.9f);
        float f2 = 1.0f - f;
        this.callMessageSendButton.setScaleX(AndroidUtilities.lerp(0.25f, 1.0f, f2));
        this.callMessageSendButton.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f2));
        this.callMessageSendButton.setAlpha(f2);
        this.callMessageSendButton.setClickable(f2 > 0.9f);
    }

    public void checkInsets() {
        checkGroupCallUiPositions_MessagesList();
        checkGroupCallUiAlpha_ReactionsLayout();
        checkGroupCallUiAlpha_EnterView();
        checkGroupCallUiPositions_EnterView();
        checkGroupCallUiPositions_ReactionsLayout();
        this.containerView.invalidate();
    }

    public void clearScrimView() {
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
            AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda5(15));
        }
    }

    private ReactionsContainerLayout createReactionsLayout() {
        ReactionsContainerLayout reactionsContainerLayout = this.reactionsContainerLayout;
        if (reactionsContainerLayout != null) {
            return reactionsContainerLayout;
        }
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return null;
        }
        ReactionsContainerLayout reactionsContainerLayout2 = new ReactionsContainerLayout(1, lastFragment, getContext(), this.currentAccount, this.resourcesProvider);
        this.reactionsContainerLayout = reactionsContainerLayout2;
        reactionsContainerLayout2.setDelegate(new ReactionsContainerLayout.ReactionsContainerDelegate() {
            private final Paint bgPaint;
            private final Path clipPath = new Path();

            {
                Paint paint = new Paint(1);
                this.bgPaint = paint;
                paint.setColor(-14603467);
            }

            @Override
            public boolean allowLongPress() {
                return false;
            }

            @Override
            public boolean drawBackground() {
                return true;
            }

            @Override
            public void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
                if (f > 0.0f) {
                    canvas.drawRoundRect(rectF, f, f, this.bgPaint);
                } else {
                    canvas.drawRect(rectF, this.bgPaint);
                }
                if (Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated() || GroupCallActivity.this.renderNodeBlur == null) {
                    return;
                }
                canvas.save();
                if (f > 0.0f) {
                    this.clipPath.rewind();
                    this.clipPath.addRoundRect(rectF, f, f, Path.Direction.CW);
                    this.clipPath.close();
                    canvas.clipPath(this.clipPath);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-GroupCallActivity.this.reactionsContainerLayout.getX(), -GroupCallActivity.this.reactionsContainerLayout.getY());
                canvas.scale(GroupCallActivity.this.renderNodeBlurScale, GroupCallActivity.this.renderNodeBlurScale);
                canvas.drawRenderNode(GroupCallActivity.this.renderNodeBlur);
                canvas.restore();
            }

            @Override
            public final void hideMenu() {
                ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$hideMenu(this);
            }

            @Override
            public final boolean needEnterText() {
                return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$needEnterText(this);
            }

            @Override
            public final void onEmojiWindowDismissed() {
                ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$onEmojiWindowDismissed(this);
            }

            @Override
            public void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
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
                GroupCallActivity.this.sendGroupCallMessage(tL_textWithEntities);
                GroupCallActivity.this.hideKeyboardOrEmojiView();
                CustomEmojiReactionsWindow reactionsWindow = GroupCallActivity.this.reactionsContainerLayout.getReactionsWindow();
                if (reactionsWindow == null || reactionsWindow.dismissed) {
                    return;
                }
                GroupCallActivity.this.reactionsContainerLayout.getReactionsWindow().dismissWithAlpha();
                GroupCallActivity.this.reactionsContainerLayout.reset();
            }
        });
        this.containerView.addView(this.reactionsContainerLayout, LayoutHelper.createFrame(-2, 52, 81));
        this.reactionsContainerLayout.setMessage(null, null, false);
        this.callMessageEnterUnderContainer.bringToFront();
        this.callMessageEnterContainer.bringToFront();
        return this.reactionsContainerLayout;
    }

    public void dismissAvatarPreview(boolean z) {
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
        this.layoutManager.setCanScrollVertically(true);
        this.listView.invalidate();
        this.blurredView.setVisibility(8);
        if (this.delayedGroupCallUpdated) {
            this.delayedGroupCallUpdated = false;
            applyCallParticipantUpdates(true);
        }
        checkContentOverlayed();
    }

    public void fillColors(int i, int[] iArr) {
        if (isRtmpStream()) {
            int i2 = Theme.key_voipgroup_disabledButton;
            iArr[0] = Theme.getColor(null, i2, false);
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_rtmpButton, false), Theme.getColor(null, Theme.key_voipgroup_soundButtonActiveScrolled, false), this.colorProgress, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_listViewBackgroundUnscrolled, false), Theme.getColor(null, i2, false), this.colorProgress, 1.0f);
        } else if (i == 0) {
            iArr[0] = Theme.getColor(null, Theme.key_voipgroup_unmuteButton2, false);
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_soundButtonActive, false), Theme.getColor(null, Theme.key_voipgroup_soundButtonActiveScrolled, false), this.colorProgress, 1.0f);
            iArr[2] = Theme.getColor(null, Theme.key_voipgroup_soundButton, false);
        } else if (i == 1) {
            iArr[0] = Theme.getColor(null, Theme.key_voipgroup_muteButton2, false);
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_soundButtonActive2, false), Theme.getColor(null, Theme.key_voipgroup_soundButtonActive2Scrolled, false), this.colorProgress, 1.0f);
            iArr[2] = Theme.getColor(null, Theme.key_voipgroup_soundButton2, false);
        } else if (isGradientState(i)) {
            iArr[0] = Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient3, false);
            iArr[1] = Theme.getColor(null, Theme.key_voipgroup_mutedByAdminMuteButton, false);
            iArr[2] = Theme.getColor(null, Theme.key_voipgroup_mutedByAdminMuteButtonDisabled, false);
        } else {
            int i3 = Theme.key_voipgroup_disabledButton;
            iArr[0] = Theme.getColor(null, i3, false);
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_disabledButtonActive, false), Theme.getColor(null, Theme.key_voipgroup_disabledButtonActiveScrolled, false), this.colorProgress, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_listViewBackgroundUnscrolled, false), Theme.getColor(null, i3, false), this.colorProgress, 1.0f);
        }
        if (isGradientState(i)) {
            iArr[3] = ColorUtils.blendARGB(0.5f, Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient, false), Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient3, false));
        } else if (i == 1) {
            iArr[3] = ColorUtils.blendARGB(0.75f, Theme.getColor(null, Theme.key_voipgroup_soundButtonActive2, false), ColorUtils.blendARGB(0.5f, Theme.getColor(null, Theme.key_voipgroup_muteButton, false), Theme.getColor(null, Theme.key_voipgroup_muteButton3, false)));
        } else {
            iArr[3] = ColorUtils.blendARGB(0.5f, Theme.getColor(null, Theme.key_voipgroup_unmuteButton2, false), Theme.getColor(null, Theme.key_voipgroup_unmuteButton, false));
        }
    }

    public GroupCallGridCell findGroupCallGridCell() {
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt.isAttachedToWindow() && (childAt instanceof GroupCallGridCell) && this.listView.getChildAdapterPosition(childAt) >= 0) {
                return (GroupCallGridCell) childAt;
            }
        }
        return null;
    }

    private float getColorProgress() {
        return this.colorProgress;
    }

    public void getLink(final boolean z) {
        String strM;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLRPC.Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(getChatId()));
        if (chat == null || ChatObject.isPublic(chat)) {
            if (this.call == null) {
                return;
            }
            final int i = 0;
            while (i < 2) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.call.getInputGroupCall();
                exportgroupcallinvite.can_self_unmute = i == 1;
                this.accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$getLink$58(i, z, tLObject, tL_error);
                    }
                });
                i++;
            }
            return;
        }
        TLRPC.ChatFull chatFull = this.accountInstance.getMessagesController().getChatFull(getChatId());
        String publicUsername = ChatObject.getPublicUsername(this.currentChat);
        if (TextUtils.isEmpty(publicUsername)) {
            strM = (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) ? null : tL_chatInviteExported.link;
        } else {
            strM = Fragment$$ExternalSyntheticOutline0.m(this.accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder());
        }
        if (!TextUtils.isEmpty(strM)) {
            openShareAlert(true, null, strM, z);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.currentChat);
        this.accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new LinkManager$1$$ExternalSyntheticLambda2(this, chatFull, z, 6));
    }

    public static String getRandomEmoji() {
        String[][] strArr = EmojiData.data;
        String[] strArr2 = strArr[(int) Math.floor(Math.random() * ((double) strArr.length))];
        return strArr2[(int) Math.floor(Math.random() * ((double) strArr2.length))];
    }

    public void hideKeyboardOrEmojiView() {
        if (this.callMessageEnterView.isPopupVisible()) {
            this.callMessageEnterView.hideEmojiView();
        } else {
            this.callMessageEnterView.closeKeyboard();
        }
    }

    private void initCreatedGroupCall() {
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
            this.fullscreenAdapter.setGroupCall(call);
            this.renderersContainer.setGroupCall(this.call);
            this.tabletGridAdapter.setGroupCall(this.call);
        }
        GroupCallMessagesListView groupCallMessagesListView = this.groupCallMessagesListView;
        if (groupCallMessagesListView != null) {
            groupCallMessagesListView.setGroupCall(this.accountInstance.getCurrentAccount(), this.call.getInputGroupCall(false));
        }
        this.actionBar.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
        this.call.saveActiveDates();
        VoIPService.getSharedInstance().registerStateListener(this);
        SimpleTextView simpleTextView = this.scheduleTimeTextView;
        if (simpleTextView == null || simpleTextView.getVisibility() != 0) {
            return;
        }
        this.leaveButton.setData(R.drawable.calls_decline, -1, Theme.getColor(null, Theme.key_voipgroup_leaveButton, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
        updateSpeakerPhoneIcon(true);
        this.leaveItem.setText(LocaleController.getString(ChatObject.isChannelOrGiga(this.currentChat) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat));
        this.listView.setVisibility(0);
        this.pipItem.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        RecyclerListView recyclerListView = this.listView;
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(recyclerListView, (Property<RecyclerListView, Float>) property, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.listView, (Property<RecyclerListView, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
        SimpleTextView simpleTextView2 = this.scheduleTimeTextView;
        Property property2 = View.SCALE_X;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(simpleTextView2, (Property<SimpleTextView, Float>) property2, 0.0f);
        SimpleTextView simpleTextView3 = this.scheduleTimeTextView;
        Property property3 = View.SCALE_Y;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, ObjectAnimator.ofFloat(simpleTextView3, (Property<SimpleTextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.scheduleTimeTextView, (Property<SimpleTextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartInTextView, (Property<SimpleTextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartInTextView, (Property<SimpleTextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartInTextView, (Property<SimpleTextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartAtTextView, (Property<SimpleTextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartAtTextView, (Property<SimpleTextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartAtTextView, (Property<SimpleTextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.pipItem, (Property<ActionBarMenuItem, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.pipItem, (Property<ActionBarMenuItem, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.pipItem, (Property<ActionBarMenuItem, Float>) property, 0.0f, 1.0f));
        animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                GroupCallActivity.this.scheduleTimeTextView.setVisibility(4);
                GroupCallActivity.this.scheduleStartAtTextView.setVisibility(4);
                GroupCallActivity.this.scheduleStartInTextView.setVisibility(4);
            }
        });
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public void invalidateLayoutFullscreen() {
        int i;
        if (!isRtmpStream()) {
            this.isFullscreen = false;
            return;
        }
        boolean z = (!this.renderersContainer.isUiVisible() && this.renderersContainer.inFullscreenMode && (isLandscapeMode == isRtmpLandscapeMode() || AndroidUtilities.isTablet())) ? false : true;
        Boolean bool = this.wasNotInLayoutFullscreen;
        if (bool == null || z != bool.booleanValue()) {
            int systemUiVisibility = this.containerView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility & (-7);
                getWindow().clearFlags(1024);
                setHideSystemVerticalInsets(false);
            } else {
                setHideSystemVerticalInsets(true);
                i = systemUiVisibility | 6;
                getWindow().addFlags(1024);
            }
            this.containerView.setSystemUiVisibility(i);
            this.wasNotInLayoutFullscreen = Boolean.valueOf(z);
            this.isInFullscreen = !z;
            this.containerView.requestApplyInsets();
        }
    }

    public void inviteUserToCall(final long j, final boolean z) {
        final TLRPC.User user;
        if (this.call == null || (user = this.accountInstance.getMessagesController().getUser(Long.valueOf(j))) == null) {
            return;
        }
        final AlertDialog[] alertDialogArr = {new AlertDialog(getContext(), 3, null)};
        final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
        invitetogroupcall.call = this.call.getInputGroupCall();
        TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
        tL_inputUser.user_id = user.id;
        tL_inputUser.access_hash = user.access_hash;
        invitetogroupcall.users.add(tL_inputUser);
        int iSendRequest = this.accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                TL_phone.inviteToGroupCall invitetogroupcall2 = invitetogroupcall;
                this.f$0.lambda$inviteUserToCall$63(j, alertDialogArr, user, z, invitetogroupcall2, tLObject, tL_error);
            }
        });
        if (iSendRequest != 0) {
            AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda2(this, alertDialogArr, iSendRequest, 18), 500L);
        }
    }

    public boolean isBulletinTop() {
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

    public static boolean isGradientState(int i) {
        return !(VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) || i == 2 || i == 4 || i == 5 || i == 6 || i == 7;
    }

    public boolean isStillConnecting() {
        int i = this.currentCallState;
        return i == 1 || i == 2 || i == 6 || i == 5;
    }

    public static void lambda$create$8() {
        GroupCallActivity groupCallActivity = groupCallInstance;
        if (groupCallActivity != null) {
            groupCallActivity.show();
        }
    }

    public void lambda$didReceivedNotification$1() {
        if (isStillConnecting()) {
            updateState(true, false);
        }
    }

    public void lambda$didReceivedNotification$2(DialogInterface dialogInterface) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$fullscreenFor$52(ArrayList arrayList) {
        for (int i = 0; i < this.attachedRenderers.size(); i++) {
            if (this.attachedRenderers.get(i).participant != null) {
                arrayList.remove(this.attachedRenderers.get(i).participant);
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i2);
            if (videoParticipant.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, videoParticipant.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
    }

    public void lambda$getLink$55(TLObject tLObject, TLRPC.ChatFull chatFull, boolean z) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported;
            } else {
                openShareAlert(true, null, tL_chatInviteExported.link, z);
            }
        }
    }

    public void lambda$getLink$56(TLRPC.ChatFull chatFull, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda3(this, tLObject, chatFull, z, 10));
    }

    public void lambda$getLink$57(TLObject tLObject, int i, boolean z) {
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            this.invites[i] = ((TL_phone.exportedGroupCallInvite) tLObject).link;
        } else {
            this.invites[i] = "";
        }
        for (int i2 = 0; i2 < 2; i2++) {
            String str = this.invites[i2];
            if (str == null) {
                return;
            }
            if (str.length() == 0) {
                this.invites[i2] = null;
            }
        }
        if (!z && canManageCall() && !this.call.call.join_muted) {
            this.invites[0] = null;
        }
        String[] strArr = this.invites;
        if (strArr[0] != null || strArr[1] != null || !ChatObject.isPublic(this.currentChat)) {
            String[] strArr2 = this.invites;
            openShareAlert(false, strArr2[0], strArr2[1], z);
            return;
        }
        openShareAlert(true, null, this.accountInstance.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(this.currentChat), z);
    }

    public void lambda$getLink$58(int i, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatActivity$70$$ExternalSyntheticLambda1(this, tLObject, i, z, 1));
    }

    public void lambda$inviteUserToCall$61(long j, AlertDialog[] alertDialogArr, TLRPC.User user) {
        ChatObject.Call call = this.call;
        if (call == null || this.delayedGroupCallUpdated) {
            return;
        }
        call.addInvitedUser(j);
        applyCallParticipantUpdates(true);
        GroupVoipInviteAlert groupVoipInviteAlert = this.groupVoipInviteAlert;
        if (groupVoipInviteAlert != null) {
            groupVoipInviteAlert.lambda$showGiftOfferSheet$15();
        }
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
        getUndoView().showWithAction(0L, 34, user, this.currentChat, (Runnable) null, (Runnable) null);
    }

    public void lambda$inviteUserToCall$62(AlertDialog[] alertDialogArr, boolean z, TLRPC.TL_error tL_error, long j, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
        if (z && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            processSelectedOption(null, j, 3);
            return;
        }
        AlertsCreator.processError(this.currentAccount, tL_error, (BaseFragment) Theme.ResourcesProvider.CC.m((ActionBarLayout) this.parentActivity.getActionBarLayout(), 1, ((ActionBarLayout) this.parentActivity.getActionBarLayout()).getFragmentStack()), invitetogroupcall, new Object[0]);
    }

    public void lambda$inviteUserToCall$63(long j, AlertDialog[] alertDialogArr, TLRPC.User user, boolean z, TL_phone.inviteToGroupCall invitetogroupcall, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null) {
            AndroidUtilities.runOnUIThread(new ProfileActivity$6$$ExternalSyntheticLambda12(this, alertDialogArr, z, tL_error, j, invitetogroupcall));
        } else {
            this.accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda144(this, j, alertDialogArr, user));
        }
    }

    public void lambda$inviteUserToCall$64(int i, DialogInterface dialogInterface) {
        this.accountInstance.getConnectionsManager().cancelRequest(i, true);
    }

    public void lambda$inviteUserToCall$65(AlertDialog[] alertDialogArr, int i) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new ChangeBioActivity$$ExternalSyntheticLambda5(this, i, 4));
        alertDialogArr[0].show();
    }

    public static void lambda$makeFocusable$6(BottomSheet bottomSheet, EditTextBoldCursor editTextBoldCursor, boolean z, AlertDialog alertDialog) {
        if (bottomSheet != null && !bottomSheet.isDismissed()) {
            bottomSheet.setFocusable(true);
            editTextBoldCursor.requestFocus();
            if (z) {
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda119(3, editTextBoldCursor));
                return;
            }
            return;
        }
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        alertDialog.setFocusable(true);
        editTextBoldCursor.requestFocus();
        if (z) {
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda119(4, editTextBoldCursor));
        }
    }

    public static void lambda$makeFocusable$7(EditTextBoldCursor editTextBoldCursor) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void lambda$new$0() {
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().setMicMute(false, true, false);
    }

    public void lambda$new$10(int[] iArr, float[] fArr, boolean[] zArr) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        for (int i = 0; i < iArr.length; i++) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.call.participantsBySources.get(iArr[i]);
            if (groupCallParticipant != null) {
                if (this.renderersContainer.inFullscreenMode) {
                    for (int i2 = 0; i2 < this.fullscreenUsersListView.getChildCount(); i2++) {
                        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) this.fullscreenUsersListView.getChildAt(i2);
                        if (MessageObject.getPeerId(groupCallUserCell.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            groupCallUserCell.setAmplitude(fArr[i] * 15.0f);
                        }
                    }
                } else {
                    int iIndexOf = (this.delayedGroupCallUpdated ? this.oldParticipants : this.call.visibleParticipants).indexOf(groupCallParticipant);
                    if (iIndexOf >= 0 && (viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(iIndexOf + this.listAdapter.usersStartRow)) != null) {
                        View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                        if (view instanceof GroupCallUserCell) {
                            ((GroupCallUserCell) view).setAmplitude(fArr[i] * 15.0f);
                            if (viewHolderFindViewHolderForAdapterPosition.itemView == this.scrimView && !this.contentFullyOverlayed) {
                                this.containerView.invalidate();
                            }
                        }
                    }
                }
                this.renderersContainer.setAmplitude(groupCallParticipant, fArr[i] * 15.0f);
            }
        }
    }

    public void lambda$new$11(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public void lambda$new$12(ChatObject.Call.InvitedUser invitedUser, Long l) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(declineconferencecallinvite, new GroupCallActivity$$ExternalSyntheticLambda16(this, 1));
        ChatObject.Call call = this.call;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l, invitedUser);
            applyCallParticipantUpdates(true);
        }
    }

    public void lambda$new$13(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public void lambda$new$14(ChatObject.Call.InvitedUser invitedUser, Long l) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(declineconferencecallinvite, new GroupCallActivity$$ExternalSyntheticLambda16(this, 0));
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

    public void lambda$new$15(DialogInterface dialogInterface) {
        this.groupVoipInviteAlert = null;
    }

    public static Long lambda$new$16(TLRPC.GroupCallParticipant groupCallParticipant) {
        return Long.valueOf(DialogObject.getPeerDialogId(groupCallParticipant.peer));
    }

    public void lambda$new$17(TLRPC.Updates updates, long j) {
        TLRPC.Update update = updates.update;
        int i = 0;
        if (update instanceof TL_update.TL_updateNewMessage) {
            TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
            if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                i = message.id;
            }
        } else if (update instanceof TL_update.TL_updateMessageID) {
            i = ((TL_update.TL_updateMessageID) update).id;
        } else if (updates.updates != null) {
            for (int i2 = 0; i2 < updates.updates.size(); i2++) {
                TLRPC.Update update2 = updates.updates.get(i2);
                if (update2 instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                    if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                        i = message2.id;
                        break;
                    }
                } else {
                    if (update2 instanceof TL_update.TL_updateMessageID) {
                        i = ((TL_update.TL_updateMessageID) update2).id;
                        break;
                    }
                }
            }
        }
        ChatObject.Call call = this.call;
        if (call == null || i == 0) {
            return;
        }
        call.invitedUsersMessageIds.put(Long.valueOf(j), ChatObject.Call.InvitedUser.make(i));
        applyCallParticipantUpdates(true);
    }

    public void lambda$new$18(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(34, safeLastFragment, safeLastFragment.getContext(), this.currentAccount, new DarkBlueThemeResourcesProvider());
        limitReachedBottomSheet.setRestrictedUsers(null, arrayList, arrayList2, arrayList3, str);
        limitReachedBottomSheet.show();
    }

    public static void lambda$new$19(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            for (int i = 0; i < Math.min(arrayList.size(), vector.objects.size()); i++) {
                if (vector.objects.get(i) instanceof TL_account.requirementToContactPremium) {
                    arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i)).id));
                }
            }
        }
        runnable.run();
    }

    public static void lambda$new$20(ArrayList arrayList, ArrayList arrayList2, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda5(26, tLObject, arrayList, arrayList2, runnable));
    }

    public void lambda$new$21(HashSet hashSet, ChatObject.Call call, String str) {
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
        LinkManager$$ExternalSyntheticLambda22 linkManager$$ExternalSyntheticLambda22 = new LinkManager$$ExternalSyntheticLambda22(this, arrayList, arrayList2, arrayList3, str, 18);
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            linkManager$$ExternalSyntheticLambda22.run();
        } else {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getrequirementstocontact, new LinkManager$$ExternalSyntheticLambda0(arrayList, arrayList2, linkManager$$ExternalSyntheticLambda22, 19));
        }
    }

    public void lambda$new$22(long j, HashSet hashSet, AtomicInteger atomicInteger, int i, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda10(this, updates, j, 5));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j));
        }
        if (atomicInteger.incrementAndGet() != i || hashSet.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda5(28, this, hashSet, call, str));
    }

    public void lambda$new$23(ChatObject.Call call, Boolean bool, HashSet hashSet) {
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(inviteconferencecallparticipant, new LaunchActivity$$ExternalSyntheticLambda117(this, jLongValue, hashSet2, atomicInteger, size, call, str));
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

    public void lambda$new$24(Activity activity, ChatObject.Call call, View view, int i, float f, float f2) {
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
        l = null;
        l = null;
        l = null;
        final Long l = null;
        boolean z = false;
        if (!(view instanceof GroupCallInvitedCell)) {
            if (i != this.listAdapter.addMemberRow) {
                if (i != this.listAdapter.conferenceAddPeopleRow) {
                    if (i == this.listAdapter.conferenceShareLinkRow) {
                        openShareConferenceLink();
                        return;
                    }
                    return;
                }
                ChatObject.Call call2 = this.call;
                if (call2 == null || call2.call == null) {
                    return;
                }
                UserSelectorBottomSheet userSelectorBottomSheet = new UserSelectorBottomSheet(activity, this.currentAccount, null, 4, new DarkBlueThemeResourcesProvider());
                ChatObject.Call call3 = this.call;
                userSelectorBottomSheet.excludeUserIds.addAll(call3 != null ? (Collection) j$.util.Collection.EL.stream(call3.sortedParticipants).map(new GroupCallSheet$$ExternalSyntheticLambda0(3)).collect(Collectors.toSet()) : null);
                userSelectorBottomSheet.updateItems(false, true);
                userSelectorBottomSheet.onShareCallLinkListener = new GroupCallActivity$$ExternalSyntheticLambda28(this, 5);
                userSelectorBottomSheet.updateItems(false, true);
                userSelectorBottomSheet.onUsersSelectedListener = new OAuthSheet$$ExternalSyntheticLambda19(6, this, call);
                userSelectorBottomSheet.show();
                return;
            }
            if (ChatObject.isChannel(this.currentChat) && (chat = this.currentChat) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                getLink(false);
                return;
            }
            TLRPC.ChatFull chatFull = this.accountInstance.getMessagesController().getChatFull(getChatId());
            if (chatFull == null) {
                return;
            }
            this.enterEventSent = false;
            Context context = getContext();
            int currentAccount = this.accountInstance.getCurrentAccount();
            TLRPC.Chat chat2 = this.currentChat;
            ChatObject.Call call4 = this.call;
            GroupVoipInviteAlert groupVoipInviteAlert = new GroupVoipInviteAlert(context, currentAccount, chat2, chatFull, call4.participants, call4.invitedUsersMap);
            this.groupVoipInviteAlert = groupVoipInviteAlert;
            groupVoipInviteAlert.setOnDismissListener(new GroupCallActivity$$ExternalSyntheticLambda27(this, 2));
            this.groupVoipInviteAlert.setDelegate(new GroupVoipInviteAlert.GroupVoipInviteAlertDelegate() {
                @Override
                public void copyInviteLink() {
                    GroupCallActivity.this.getLink(true);
                }

                @Override
                public void inviteUser(long j) {
                    GroupCallActivity.this.inviteUserToCall(j, true);
                }

                @Override
                public void needOpenSearch(MotionEvent motionEvent, EditTextBoldCursor editTextBoldCursor) {
                    if (GroupCallActivity.this.enterEventSent) {
                        return;
                    }
                    if (motionEvent.getX() <= editTextBoldCursor.getLeft() || motionEvent.getX() >= editTextBoldCursor.getRight() || motionEvent.getY() <= editTextBoldCursor.getTop() || motionEvent.getY() >= editTextBoldCursor.getBottom()) {
                        GroupCallActivity groupCallActivity = GroupCallActivity.this;
                        groupCallActivity.makeFocusable(groupCallActivity.groupVoipInviteAlert, null, editTextBoldCursor, false);
                    } else {
                        GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                        groupCallActivity2.makeFocusable(groupCallActivity2.groupVoipInviteAlert, null, editTextBoldCursor, true);
                    }
                }
            });
            this.groupVoipInviteAlert.show();
            return;
        }
        GroupCallInvitedCell groupCallInvitedCell = (GroupCallInvitedCell) view;
        if (groupCallInvitedCell.getUser() == null) {
            return;
        }
        if (!isConference()) {
            this.parentActivity.switchToAccount(this.currentAccount, true);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", groupCallInvitedCell.getUser().id);
            if (groupCallInvitedCell.hasAvatarSet()) {
                bundle.putBoolean("expandPhoto", true);
            }
            this.parentActivity.lambda$runLinkRequest$100(new ProfileActivity(bundle));
            lambda$showGiftOfferSheet$15();
            return;
        }
        if (i - this.listAdapter.shadyJoinStartRow < 0 || i - this.listAdapter.shadyJoinStartRow >= this.call.shadyJoinParticipants.size()) {
            if (i - this.listAdapter.shadyLeftStartRow < 0 || i - this.listAdapter.shadyLeftStartRow >= this.call.shadyLeftParticipants.size()) {
                int i2 = i - this.listAdapter.invitedStartRow;
                if (this.delayedGroupCallUpdated) {
                    if (i2 >= 0 && i2 < this.oldInvited.size()) {
                        l = this.oldInvited.get(i2);
                    }
                } else if (i2 >= 0 && i2 < this.call.invitedUsers.size()) {
                    l = this.call.invitedUsers.get(i2);
                }
            } else {
                l = this.call.shadyLeftParticipants.get(i - this.listAdapter.shadyLeftStartRow);
            }
            if (z && (invitedUser = this.call.invitedUsersMessageIds.get(l)) != null) {
                final int i3 = 0;
                final int i4 = 1;
                ItemOptions.makeOptions(this.container, this.resourcesProvider, groupCallInvitedCell).addIf(invitedUser.isCalling(), R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(this) {
                    public final GroupCallActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i3) {
                            case 0:
                                this.f$0.lambda$new$12(invitedUser, l);
                                break;
                            default:
                                this.f$0.lambda$new$14(invitedUser, l);
                                break;
                        }
                    }
                }).add(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(this) {
                    public final GroupCallActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i4) {
                            case 0:
                                this.f$0.lambda$new$12(invitedUser, l);
                                break;
                            default:
                                this.f$0.lambda$new$14(invitedUser, l);
                                break;
                        }
                    }
                }).setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.listViewBackgroundPaint.getColor())).setDimAlpha(96).show();
            }
            return;
        }
        l = this.call.shadyJoinParticipants.get(i - this.listAdapter.shadyJoinStartRow);
        z = true;
        if (z) {
            return;
        }
        final int i5 = 0;
        final int i6 = 1;
        ItemOptions.makeOptions(this.container, this.resourcesProvider, groupCallInvitedCell).addIf(invitedUser.isCalling(), R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(this) {
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
        }).add(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(this) {
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
        }).setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.listViewBackgroundPaint.getColor())).setDimAlpha(96).show();
    }

    public boolean lambda$new$25(View view, int i) {
        if (isRtmpStream()) {
            return false;
        }
        if (view instanceof GroupCallGridCell) {
            return showMenuForCell(view);
        }
        if (!(view instanceof GroupCallUserCell)) {
            return false;
        }
        updateItems();
        return ((GroupCallUserCell) view).clickMuteButton();
    }

    public void lambda$new$26(View view, int i) {
        GroupCallGridCell groupCallGridCell = (GroupCallGridCell) view;
        if (groupCallGridCell.getParticipant() != null) {
            fullscreenFor(groupCallGridCell.getParticipant());
        }
    }

    public void lambda$new$27(View view) {
        ChatObject.Call call = this.call;
        if (call == null || call.isScheduled() || isRtmpStream()) {
            getLink(false);
        } else {
            if (VoIPService.getSharedInstance() == null) {
                return;
            }
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(getContext(), false);
        }
    }

    public void lambda$new$28(View view) {
        int i = 1;
        int i2 = 2;
        this.renderersContainer.delayHideUi();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getVideoState(false) != 2) {
            return;
        }
        sharedInstance.switchCamera();
        if (this.flipIconCurrentEndFrame == 18) {
            RLottieDrawable rLottieDrawable = this.flipIcon;
            this.flipIconCurrentEndFrame = 39;
            rLottieDrawable.setCustomEndFrame(39);
            this.flipIcon.start();
        } else {
            this.flipIcon.setCurrentFrame(0, false);
            RLottieDrawable rLottieDrawable2 = this.flipIcon;
            this.flipIconCurrentEndFrame = 18;
            rLottieDrawable2.setCustomEndFrame(18);
            this.flipIcon.start();
        }
        for (int i3 = 0; i3 < this.attachedRenderers.size(); i3++) {
            GroupCallMiniTextureView groupCallMiniTextureView = this.attachedRenderers.get(i3);
            ChatObject.VideoParticipant videoParticipant = groupCallMiniTextureView.participant;
            if (videoParticipant.participant.self && !videoParticipant.presentation && groupCallMiniTextureView.flipAnimator == null) {
                groupCallMiniTextureView.flipHalfReached = false;
                ImageView imageView = groupCallMiniTextureView.blurredFlippingStub;
                if (imageView == null) {
                    groupCallMiniTextureView.blurredFlippingStub = new ImageView(groupCallMiniTextureView.getContext());
                } else {
                    imageView.animate().cancel();
                }
                GroupCallMiniTextureView.AnonymousClass1 anonymousClass1 = groupCallMiniTextureView.textureView;
                if (anonymousClass1.renderer.isFirstFrameRendered()) {
                    Bitmap bitmap = anonymousClass1.blurRenderer.getBitmap(100, 100);
                    if (bitmap != null) {
                        Utilities.blurBitmap(bitmap, 3);
                        groupCallMiniTextureView.blurredFlippingStub.setBackground(new BitmapDrawable(bitmap));
                    }
                    groupCallMiniTextureView.blurredFlippingStub.setAlpha(0.0f);
                } else {
                    groupCallMiniTextureView.blurredFlippingStub.setAlpha(1.0f);
                }
                if (groupCallMiniTextureView.blurredFlippingStub.getParent() == null) {
                    anonymousClass1.addView(groupCallMiniTextureView.blurredFlippingStub);
                }
                ((FrameLayout.LayoutParams) groupCallMiniTextureView.blurredFlippingStub.getLayoutParams()).gravity = 17;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                groupCallMiniTextureView.flipAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new GroupCallMiniTextureView$$ExternalSyntheticLambda3(groupCallMiniTextureView, i));
                groupCallMiniTextureView.flipAnimator.addListener(new GroupCallMiniTextureView.AnonymousClass5(groupCallMiniTextureView, i2));
                groupCallMiniTextureView.flipAnimator.setDuration(400L);
                groupCallMiniTextureView.flipAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                groupCallMiniTextureView.flipAnimator.start();
            }
        }
    }

    public void lambda$new$29(int i) {
        setAudioOutputValue(i);
        BulletinFactory.of(this.topBulletinContainer, new DarkBlueThemeResourcesProvider()).createSimpleBulletin(getContext().getResources().getDrawable(getAudioOutputToastIcon(i)).mutate(), getAudioOutputToastText(i)).show(isBulletinTop());
    }

    public void lambda$new$30(View view) {
        int nextAudioOutputValue = getNextAudioOutputValue();
        this.cacheAudioOutputValue = Integer.valueOf(nextAudioOutputValue);
        updateState(true, true);
        this.cacheAudioOutputValue = null;
        AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda6(this, nextAudioOutputValue, 16));
    }

    public void lambda$new$31(Activity activity, View view) {
        this.renderersContainer.delayHideUi();
        ChatObject.Call call = this.call;
        if (call == null || call.isScheduled()) {
            lambda$showGiftOfferSheet$15();
        } else {
            updateItems();
            onLeaveClick(activity, new GroupCallActivity$$ExternalSyntheticLambda28(this, 9), false);
        }
    }

    public void lambda$new$32(int i) {
        this.actionBar.getActionBarMenuOnItemClick().onItemClick(i);
    }

    public void lambda$new$33(View view) {
        ChatObject.Call call = this.call;
        if (call == null || this.renderersContainer.inFullscreenMode) {
            return;
        }
        if (call.call.join_muted) {
            ActionBarMenuSubItem actionBarMenuSubItem = this.everyoneItem;
            int i = Theme.key_voipgroup_actionBarItems;
            actionBarMenuSubItem.setColors(Theme.getColor(null, i, false), Theme.getColor(null, i, false));
            this.everyoneItem.setChecked(false);
            ActionBarMenuSubItem actionBarMenuSubItem2 = this.adminItem;
            int i2 = Theme.key_voipgroup_checkMenu;
            actionBarMenuSubItem2.setColors(Theme.getColor(null, i2, false), Theme.getColor(null, i2, false));
            this.adminItem.setChecked(true);
        } else {
            ActionBarMenuSubItem actionBarMenuSubItem3 = this.everyoneItem;
            int i3 = Theme.key_voipgroup_checkMenu;
            actionBarMenuSubItem3.setColors(Theme.getColor(null, i3, false), Theme.getColor(null, i3, false));
            this.everyoneItem.setChecked(true);
            ActionBarMenuSubItem actionBarMenuSubItem4 = this.adminItem;
            int i4 = Theme.key_voipgroup_actionBarItems;
            actionBarMenuSubItem4.setColors(Theme.getColor(null, i4, false), Theme.getColor(null, i4, false));
            this.adminItem.setChecked(false);
        }
        this.changingPermissions = false;
        this.otherItem.hideSubItem(1);
        this.otherItem.hideSubItem(2);
        if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
            int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
            if (currentAudioRoute == 2) {
                this.soundItem.setIcon(R.drawable.msg_voice_bluetooth);
                this.soundItem.setSubtext(VoIPService.getSharedInstance().currentBluetoothDeviceName != null ? VoIPService.getSharedInstance().currentBluetoothDeviceName : LocaleController.getString(R.string.VoipAudioRoutingBluetooth));
            } else if (currentAudioRoute == 0) {
                this.soundItem.setIcon(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone);
                this.soundItem.setSubtext(LocaleController.getString(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.string.VoipAudioRoutingHeadset : R.string.VoipAudioRoutingPhone));
            } else if (currentAudioRoute == 1) {
                if (VoipAudioManager.get().isSpeakerphoneOn()) {
                    this.soundItem.setIcon(R.drawable.msg_voice_speaker);
                    this.soundItem.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
                } else {
                    this.soundItem.setIcon(R.drawable.msg_voice_phone);
                    this.soundItem.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingPhone));
                }
            }
        }
        updateItems();
        this.otherItem.toggleSubMenu();
    }

    public void lambda$new$34(View view) {
        if (!isRtmpStream()) {
            if (!AndroidUtilities.checkInlinePermissions(this.parentActivity)) {
                AlertsCreator.createDrawOverlayGroupCallPermissionDialog(getContext()).show();
                return;
            } else {
                GroupCallPip.clearForce();
                lambda$showGiftOfferSheet$15();
                return;
            }
        }
        if (PipUtils.checkPermissions(this.parentActivity) <= 0) {
            AlertsCreator.createDrawOverlayPermissionDialog(this.parentActivity, null, true).show();
            return;
        }
        RTMPStreamPipOverlay.instance.showInternal(this.parentActivity);
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$35(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.getVideoState(true) == 2) {
            sharedInstance.stopScreenCapture();
        } else {
            startScreenCapture();
        }
    }

    public void lambda$new$36(View view) {
        ChatObject.Call call = this.call;
        if (call == null || !call.recording) {
            return;
        }
        showRecordHint(this.actionBar.getTitleTextView());
    }

    public void lambda$new$37(View view, int i) {
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) view;
        if (groupCallUserCell.getVideoParticipant() == null) {
            fullscreenFor(new ChatObject.VideoParticipant(groupCallUserCell.getParticipant(), false, false));
        } else {
            fullscreenFor(groupCallUserCell.getVideoParticipant());
        }
    }

    public boolean lambda$new$38(View view, int i) {
        if (showMenuForCell(view)) {
            try {
                this.listView.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void lambda$new$39(View view) {
        hideKeyboardOrEmojiView();
    }

    public void lambda$new$40(View view) {
        Editable text = this.callMessageEnterView.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(new CharSequence[]{text}, true);
        sendGroupCallMessage(tL_textWithEntities);
    }

    public void lambda$new$41(ValueAnimator valueAnimator) {
        this.switchToButtonProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateScheduleUI(true);
        this.buttonsContainer.invalidate();
        this.listView.invalidate();
    }

    public void lambda$new$42(TLRPC.Chat chat, TLRPC.InputPeer inputPeer, TL_update.TL_updateGroupCall tL_updateGroupCall) {
        ChatObject.Call call = new ChatObject.Call();
        this.call = call;
        call.call = new TLRPC.TL_groupCall();
        ChatObject.Call call2 = this.call;
        TLRPC.GroupCall groupCall = call2.call;
        groupCall.participants_count = 0;
        groupCall.version = 1;
        groupCall.can_start_video = true;
        groupCall.can_change_join_muted = true;
        call2.chatId = chat == null ? 0L : chat.id;
        groupCall.schedule_date = this.scheduleStartAt;
        groupCall.flags |= 128;
        call2.currentAccount = this.accountInstance;
        call2.setSelfPeer(inputPeer);
        ChatObject.Call call3 = this.call;
        TLRPC.GroupCall groupCall2 = call3.call;
        TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
        groupCall2.access_hash = groupCall3.access_hash;
        groupCall2.id = groupCall3.id;
        call3.createNoVideoParticipant();
        this.fullscreenAdapter.setGroupCall(this.call);
        this.renderersContainer.setGroupCall(this.call);
        this.tabletGridAdapter.setGroupCall(this.call);
        this.groupCallMessagesListView.setGroupCall(this.accountInstance.getCurrentAccount(), this.call.getInputGroupCall(false));
        MessagesController messagesController = this.accountInstance.getMessagesController();
        ChatObject.Call call4 = this.call;
        messagesController.putGroupCall(call4.chatId, call4);
    }

    public void lambda$new$43(TLRPC.TL_error tL_error) {
        this.accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, tL_error.text);
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$44(TLRPC.Chat chat, TLRPC.InputPeer inputPeer, TLObject tLObject, TLRPC.TL_error tL_error) {
        GroupCallActivity groupCallActivity;
        if (tLObject == null) {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda2(10, this, tL_error));
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        for (int i = 0; i < updates.updates.size(); i++) {
            TLRPC.Update update = updates.updates.get(i);
            if (update instanceof TL_update.TL_updateGroupCall) {
                groupCallActivity = this;
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda5(27, groupCallActivity, chat, inputPeer, (TL_update.TL_updateGroupCall) update));
                groupCallActivity.accountInstance.getMessagesController().processUpdates(updates, false);
            }
        }
        groupCallActivity = this;
        groupCallActivity.accountInstance.getMessagesController().processUpdates(updates, false);
    }

    public void lambda$new$45(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, TLRPC.Chat chat, AccountInstance accountInstance, TLRPC.InputPeer inputPeer, View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.scheduleAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(600L);
        this.scheduleAnimator.addUpdateListener(new QrActivity$$ExternalSyntheticLambda8(this, 8));
        this.scheduleAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                GroupCallActivity.this.scheduleAnimator = null;
            }
        });
        this.scheduleAnimator.start();
        if (ChatObject.isChannelOrGiga(this.currentChat)) {
            this.titleTextView.setText(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
        } else {
            this.titleTextView.setText(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
        }
        Calendar calendar = Calendar.getInstance();
        boolean zCheckScheduleDate = AlertsCreator.checkScheduleDate(null, null, 604800L, 3, numberPicker, numberPicker2, numberPicker3);
        calendar.setTimeInMillis((((long) numberPicker.getValue()) * 86400000) + System.currentTimeMillis());
        calendar.set(11, numberPicker2.getValue());
        calendar.set(12, numberPicker3.getValue());
        if (zCheckScheduleDate) {
            calendar.set(13, 0);
        }
        this.scheduleStartAt = (int) (calendar.getTimeInMillis() / 1000);
        updateScheduleUI(false);
        TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
        creategroupcall.peer = MessagesController.getInputPeer(chat);
        creategroupcall.random_id = Utilities.random.nextInt();
        creategroupcall.schedule_date = this.scheduleStartAt;
        creategroupcall.flags |= 2;
        accountInstance.getConnectionsManager().sendRequest(creategroupcall, new LinkManager$$ExternalSyntheticLambda0(this, chat, inputPeer, 20), 2);
    }

    public static String lambda$new$46(long j, Calendar calendar, int i, int i2) {
        if (i2 == 0) {
            return LocaleController.getString(R.string.MessageScheduleToday);
        }
        long j2 = (((long) i2) * 86400000) + j;
        calendar.setTimeInMillis(j2);
        if (calendar.get(1) != i) {
            return LocaleController.getInstance().getFormatterScheduleYear().format(j2);
        }
        return LocaleController.getInstance().getFormatterWeek().format(j2) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j2);
    }

    public void lambda$new$47(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i, int i2) {
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AlertsCreator.checkScheduleDate(this.scheduleButtonTextView, this.scheduleInfoTextView, 604800L, 2, numberPicker, numberPicker2, numberPicker3);
    }

    public static String lambda$new$48(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static String lambda$new$49(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public void lambda$new$50(Activity activity, View view) {
        LaunchActivity launchActivity;
        if (Build.VERSION.SDK_INT >= 23 && (launchActivity = this.parentActivity) != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            this.parentActivity.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
            return;
        }
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        boolean z = true;
        if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
            VoIPService.getSharedInstance().setVideoState(false, 0);
            updateState(true, false);
            updateSpeakerPhoneIcon(false);
            this.call.sortParticipants();
            applyCallParticipantUpdates(true);
            this.buttonsContainer.requestLayout();
            return;
        }
        this.undoView[0].hide(false, 1);
        if (this.previewDialog == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.createCaptureDevice(false);
            }
            PrivateVideoPreviewDialog privateVideoPreviewDialog = new PrivateVideoPreviewDialog(activity, z, VoIPService.getSharedInstance().getVideoState(true) != 2) {
                @Override
                public void onDismiss(boolean z2, boolean z3) {
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    boolean z4 = groupCallActivity.previewDialog.micEnabled;
                    groupCallActivity.previewDialog = null;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (!z3) {
                        if (sharedInstance2 != null) {
                            sharedInstance2.setVideoState(false, 0);
                            return;
                        }
                        return;
                    }
                    if (sharedInstance2 != null) {
                        sharedInstance2.setupCaptureDevice(z2, z4);
                    }
                    if (z2 && sharedInstance2 != null) {
                        sharedInstance2.setVideoState(false, 0);
                    }
                    GroupCallActivity.this.updateState(true, false);
                    GroupCallActivity.this.call.sortParticipants();
                    GroupCallActivity.this.applyCallParticipantUpdates(true);
                    GroupCallActivity.this.buttonsContainer.requestLayout();
                }
            };
            this.previewDialog = privateVideoPreviewDialog;
            privateVideoPreviewDialog.setBottomPadding(this.containerView.getPaddingBottom());
            this.container.addView(this.previewDialog);
            if (sharedInstance == null || sharedInstance.isFrontFaceCamera()) {
                return;
            }
            sharedInstance.switchCamera();
        }
    }

    public void lambda$new$51(View view) {
        int iCalculateScrollTopOffset = calculateScrollTopOffset();
        if (iCalculateScrollTopOffset > 0 && iCalculateScrollTopOffset != Integer.MAX_VALUE) {
            this.listView.smoothScrollBy(0, iCalculateScrollTopOffset);
        }
        this.callMessageEnterView.openKeyboard();
    }

    public void lambda$new$9(DialogInterface dialogInterface) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (this.anyEnterEventSent && (safeLastFragment instanceof ChatActivity)) {
            ((ChatActivity) safeLastFragment).onEditTextDialogClose(true, true);
        }
    }

    public static void lambda$onLeaveClick$67(CheckBoxCell[] checkBoxCellArr, View view) {
        Integer num = (Integer) view.getTag();
        checkBoxCellArr[num.intValue()].setChecked(!checkBoxCellArr[num.intValue()].isChecked(), true);
    }

    public static void lambda$onLeaveClick$68(ChatObject.Call call, CheckBoxCell[] checkBoxCellArr, long j, Runnable runnable, AlertDialog alertDialog, int i) {
        boolean z = false;
        CheckBoxCell checkBoxCell = checkBoxCellArr[0];
        if (checkBoxCell != null && checkBoxCell.isChecked()) {
            z = true;
        }
        processOnLeave(call, z, j, runnable);
    }

    public void lambda$onUserLeaveHint$80() {
        RTMPStreamPipOverlay.instance.showInternal(this.parentActivity);
    }

    public void lambda$openShareAlert$59(DialogInterface dialogInterface) {
        this.shareAlert = null;
    }

    public void lambda$openShareAlert$60() {
        ShareAlert shareAlert = this.shareAlert;
        if (shareAlert != null) {
            shareAlert.show();
        }
    }

    public void lambda$openShareConferenceLink$81(AlertDialog alertDialog, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        TLRPC.GroupCall groupCall;
        alertDialog.dismiss();
        if (!(tLObject instanceof TL_phone.exportedGroupCallInvite)) {
            if (tL_error != null) {
                BulletinFactory.of(this.topBulletinContainer, new DarkBlueThemeResourcesProvider()).showForError(tL_error);
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

    public void lambda$openShareConferenceLink$82(AlertDialog alertDialog, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda22((Object) this, (Object) alertDialog, tLObject, (TLObject) exportgroupcallinvite, tL_error, 17));
    }

    public void lambda$processSelectedOption$69(TLObject tLObject, AlertDialog alertDialog, int i) {
        ConferenceCall conferenceCall;
        if (!isConference()) {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                this.accountInstance.getMessagesController().deleteParticipantFromChat(getChatId(), user);
                getUndoView().showWithAction(0L, 32, user, (Object) null, (Runnable) null, (Runnable) null);
                return;
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.accountInstance.getMessagesController().deleteParticipantFromChat(getChatId(), (TLRPC.User) null, chat, false, false);
                getUndoView().showWithAction(0L, 32, chat, (Object) null, (Runnable) null, (Runnable) null);
                return;
            }
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || (conferenceCall = sharedInstance.conference) == null || !(tLObject instanceof TLRPC.User)) {
            return;
        }
        TLRPC.User user2 = (TLRPC.User) tLObject;
        conferenceCall.kick(user2.id);
        this.call.addKickedUser(user2.id);
        getUndoView().showWithAction(0L, 102, user2, (Object) null, (Runnable) null, (Runnable) null);
    }

    public void lambda$processSelectedOption$70(long j) {
        inviteUserToCall(j, false);
    }

    public void lambda$processSelectedOption$71(TLRPC.User user, long j, AlertDialog alertDialog, int i) {
        this.accountInstance.getMessagesController().addUserToChat(getChatId(), user, 0, null, (BaseFragment) Theme.ResourcesProvider.CC.m((ActionBarLayout) this.parentActivity.getActionBarLayout(), 1, ((ActionBarLayout) this.parentActivity.getActionBarLayout()).getFragmentStack()), new LinkManager$3$$ExternalSyntheticLambda0(this, j, 3));
    }

    public void lambda$processSelectedOption$72() {
        this.accountInstance.getMessagesController().deleteUserPhoto(null);
    }

    public static void lambda$processSelectedOption$73(DialogInterface dialogInterface) {
    }

    public void lambda$runAvatarPreviewTransition$76(float f, float f2, float f3, int i, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.progressToAvatarPreview = fFloatValue;
        this.renderersContainer.progressToScrimView = fFloatValue;
        float f4 = (fFloatValue * 1.0f) + ((1.0f - fFloatValue) * f);
        this.avatarPreviewContainer.setScaleX(f4);
        this.avatarPreviewContainer.setScaleY(f4);
        this.avatarPreviewContainer.setTranslationX((1.0f - this.progressToAvatarPreview) * f2);
        this.avatarPreviewContainer.setTranslationY((1.0f - this.progressToAvatarPreview) * f3);
        if (!this.useBlur) {
            this.scrimPaint.setAlpha((int) (this.progressToAvatarPreview * 100.0f));
        }
        GroupCallMiniTextureView groupCallMiniTextureView = this.scrimRenderer;
        if (groupCallMiniTextureView != null) {
            groupCallMiniTextureView.textureView.setRoundCorners((1.0f - this.progressToAvatarPreview) * AndroidUtilities.dp(8.0f));
        }
        this.avatarPreviewContainer.invalidate();
        this.containerView.invalidate();
        ProfileGalleryView profileGalleryView = this.avatarsViewPager;
        int i2 = (int) ((1.0f - this.progressToAvatarPreview) * i);
        profileGalleryView.setRoundRadius(i2, i2);
    }

    public void lambda$setCommentsEnabled$78() {
        this.pendingCommentsEnabled = null;
        updateButtonsVisibility(true);
    }

    public void lambda$setCommentsEnabled$79(TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            this.accountInstance.getMessagesController().processUpdates(updates, false);
        }
        AndroidUtilities.runOnUIThread(new GroupCallActivity$$ExternalSyntheticLambda28(this, 1));
    }

    public void lambda$showMenuForCell$74(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.scrimPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.scrimPopupWindow.dismiss();
        }
    }

    public void lambda$showMenuForCell$75(int i, ArrayList arrayList, TLRPC.GroupCallParticipant groupCallParticipant, View view) {
        if (i >= arrayList.size()) {
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.call.participants.get(MessageObject.getPeerId(groupCallParticipant.peer));
        if (groupCallParticipant2 != null) {
            groupCallParticipant = groupCallParticipant2;
        }
        processSelectedOption(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i)).intValue());
        ActionBarPopupWindow actionBarPopupWindow = this.scrimPopupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
        } else {
            if (((Integer) arrayList.get(i)).intValue() == 9 || ((Integer) arrayList.get(i)).intValue() == 10 || ((Integer) arrayList.get(i)).intValue() == 11) {
                return;
            }
            dismissAvatarPreview(true);
        }
    }

    public void lambda$toggleAdminSpeak$77(TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            this.accountInstance.getMessagesController().processUpdates(updates, false);
        }
    }

    public void lambda$updateItems$3() {
        updateRecordCallText();
        AndroidUtilities.runOnUIThread(this.updateCallRecordRunnable, 1000L);
    }

    public void lambda$updateLiveLabel$66(int i, int i2, boolean z, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.liveLabelPaint.setColor(AndroidUtilities.getOffsetColor(i, i2, fFloatValue, 1.0f));
        this.liveLabelTextView.invalidate();
        if (!z) {
            fFloatValue = 1.0f - fFloatValue;
        }
        this.textureLightningViewAnimatingAlpha = fFloatValue;
        LightningView lightningView = this.textureLightningView;
        if (lightningView == null || !this.needTextureLightning) {
            return;
        }
        lightningView.invalidate();
    }

    public void lambda$updateTitle$53(View view) {
        ChatObject.Call call = this.call;
        if (call == null || !call.recording) {
            return;
        }
        showRecordHint(this.actionBar.getTitleTextView());
    }

    public void lambda$updateTitle$54(View view) {
        ChatObject.Call call = this.call;
        if (call == null || !call.recording) {
            return;
        }
        showRecordHint(this.actionBar.getTitleTextView());
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.mImpl.getInsets(647);
        Insets insets2 = windowInsetsCompat.mImpl.getInsets(8);
        int iMax = Math.max(insets2.bottom, (this.callMessageEnterView.isWaitingForKeyboardOpen() || this.callMessageEnterView.isPopupShowing()) ? this.callMessageEnterView.getKeyboardHeight() : 0);
        ViewGroup.LayoutParams layoutParams = this.blurredView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -insets.bottom;
        }
        if (this.callMessageEnterView.getEmojiView() != null) {
            this.callMessageEnterView.getEmojiView().setBottomInset(insets.bottom);
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
        if (iMax == 0 && !this.callMessageEnterView.isWaitingForKeyboardOpen() && !this.callMessageEnterView.isPopupShowing() && !this.callMessageEnterView.isAnimatePopupClosing()) {
            this.callMessageEnterView.hideEmojiView();
        }
        if (iMax > 0) {
            this.reactionsContainerLayout = createReactionsLayout();
        }
        this.callMessageEnterView.onSizeChanged(insets2.bottom, false);
        this.windowInsetsStateHolder.setInsets(windowInsetsCompat);
        return WindowInsetsCompat.CONSUMED;
    }

    public static void onLeaveClick(Context context, Runnable runnable, boolean z) {
        onLeaveClick(context, runnable, z, false);
    }

    public void onUserLeaveHint() {
        if (isRtmpStream() && AndroidUtilities.checkInlinePermissions(this.parentActivity) && !RTMPStreamPipOverlay.instance.isVisible) {
            lambda$showGiftOfferSheet$15();
            AndroidUtilities.runOnUIThread(new GroupCallActivity$$ExternalSyntheticLambda28(this, 6), 100L);
        }
    }

    private void openShareAlert(boolean z, String str, String str2, boolean z2) {
        boolean z3;
        String str3;
        String str4;
        String string;
        int i = 0;
        String str5 = (!isRtmpStream() || str == null) ? str2 : null;
        if (z2) {
            if (str != null) {
                str5 = str;
            }
            AndroidUtilities.addToClipboard(str5);
            if (AndroidUtilities.shouldShowClipboardToast()) {
                getUndoView().showWithAction(0L, 33, (Object) null, (Object) null, (Runnable) null, (Runnable) null);
                return;
            }
            return;
        }
        LaunchActivity launchActivity = this.parentActivity;
        if (launchActivity != null) {
            BaseFragment baseFragment = (BaseFragment) Theme.ResourcesProvider.CC.m((ActionBarLayout) this.parentActivity.getActionBarLayout(), 1, ((ActionBarLayout) launchActivity.getActionBarLayout()).getFragmentStack());
            if (baseFragment instanceof ChatActivity) {
                boolean zNeedEnterText = ((ChatActivity) baseFragment).needEnterText();
                this.anyEnterEventSent = true;
                this.enterEventSent = true;
                z3 = zNeedEnterText;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        if (str == null || str5 != null) {
            str3 = str;
            str4 = str5;
        } else {
            str4 = str;
            str3 = null;
        }
        if (str3 == null && z) {
            string = ChatObject.isChannelOrGiga(this.currentChat) ? LocaleController.formatString("VoipChannelInviteText", R.string.VoipChannelInviteText, str4) : LocaleController.formatString("VoipGroupInviteText", R.string.VoipGroupInviteText, str4);
        } else {
            string = str4;
        }
        ShareAlert shareAlert = new ShareAlert(getContext(), null, null, string, str3, false, str4, str3, false, true) {
            @Override
            public void onSend(LongSparseArray longSparseArray, int i2, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
                if (z4) {
                    if (longSparseArray.size() == 1) {
                        GroupCallActivity.this.getUndoView().showWithAction(((TLRPC.Dialog) longSparseArray.valueAt(0)).id, 41, Integer.valueOf(i2));
                    } else {
                        GroupCallActivity.this.getUndoView().showWithAction(0L, 41, Integer.valueOf(i2), Integer.valueOf(longSparseArray.size()), (Runnable) null, (Runnable) null);
                    }
                }
            }

            @Override
            public void setLastVisible(boolean z4) {
            }
        };
        this.shareAlert = shareAlert;
        shareAlert.setDelegate(new ShareAlert.ShareAlertDelegate() {
            @Override
            public boolean didCopy() {
                if (!AndroidUtilities.shouldShowClipboardToast()) {
                    return true;
                }
                GroupCallActivity.this.getUndoView().showWithAction(0L, 33, (Object) null, (Object) null, (Runnable) null, (Runnable) null);
                return true;
            }

            @Override
            public final void didShare() {
                ShareAlert.ShareAlertDelegate.CC.$default$didShare(this);
            }
        });
        this.shareAlert.setOnDismissListener(new GroupCallActivity$$ExternalSyntheticLambda27(this, i));
        AndroidUtilities.runOnUIThread(new GroupCallActivity$$ExternalSyntheticLambda28(this, i), z3 ? 200L : 0L);
    }

    private void prepareBlurBitmap() {
        if (this.blurredView == null) {
            return;
        }
        int measuredWidth = (int) ((this.containerView.getMeasuredWidth() - (this.backgroundPaddingLeft * 2)) / 6.0f);
        int measuredHeight = (int) ((this.containerView.getMeasuredHeight() - AndroidUtilities.statusBarHeight) / 6.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        canvas.translate(0.0f, -AndroidUtilities.statusBarHeight);
        ((ActionBarLayout) this.parentActivity.getActionBarLayout()).getView().draw(canvas);
        canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, 76));
        canvas.restore();
        canvas.save();
        canvas.translate(this.containerView.getX(), -AndroidUtilities.statusBarHeight);
        this.drawingForBlur = true;
        this.containerView.draw(canvas);
        this.drawingForBlur = false;
        Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        this.blurredView.setBackground(new BitmapDrawable(bitmapCreateBitmap));
        this.blurredView.setAlpha(0.0f);
        this.blurredView.setVisibility(0);
        this.blurredView.bringToFront();
    }

    public void pressRunnableImpl() {
        if (this.call == null || !this.scheduled || VoIPService.getSharedInstance() == null) {
            return;
        }
        try {
            this.muteButton.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        updateMuteButton(1, true);
        AndroidUtilities.runOnUIThread(this.unmuteRunnable, 80L);
        this.scheduled = false;
        this.pressed = true;
    }

    private static void processOnLeave(ChatObject.Call call, boolean z, long j, Runnable runnable) {
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

    public void processSelectedOption(TLRPC.GroupCallParticipant groupCallParticipant, long j, int i) {
        String firstName;
        TextView textView;
        int i2 = 7;
        int i3 = 2;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        TLObject user = j > 0 ? this.accountInstance.getMessagesController().getUser(Long.valueOf(j)) : this.accountInstance.getMessagesController().getChat(Long.valueOf(-j));
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
            builder.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
            TextView textView2 = new TextView(getContext());
            int i4 = Theme.key_voipgroup_actionBarItems;
            textView2.setTextColor(Theme.getColor(null, i4, false));
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(getContext());
            builder.setView(frameLayout);
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setTextSize(AndroidUtilities.dp(12.0f));
            BackupImageView backupImageView = new BackupImageView(getContext());
            backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(backupImageView, LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            avatarDrawable.setInfo(this.currentAccount, user);
            boolean z = user instanceof TLRPC.User;
            if (z) {
                TLRPC.User user2 = (TLRPC.User) user;
                backupImageView.setForUserOrChat(user2, avatarDrawable);
                firstName = UserObject.getFirstName(user2);
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) user;
                backupImageView.setForUserOrChat(chat, avatarDrawable);
                firstName = chat.title;
            }
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(Theme.getColor(null, i4, false));
            textView3.setTextSize(1, 20.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setLines(1);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            TLRPC.Chat chat2 = this.currentChat;
            String str = chat2 != null ? chat2.title : "";
            if (i != 2) {
                textView3.setText(LocaleController.getString(R.string.VoipGroupAddMemberTitle));
                ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(R.string.VoipGroupAddMemberText, new Object[]{firstName, str}, textView2);
            } else if (isConference()) {
                textView3.setText(LocaleController.getString(R.string.VoipConferenceRemoveMemberAlertTitle2));
                ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(R.string.VoipConferenceRemoveMemberAlertText2, new Object[]{firstName}, textView2);
            } else {
                textView3.setText(LocaleController.getString(R.string.VoipGroupRemoveMemberAlertTitle2));
                if (ChatObject.isChannelOrGiga(this.currentChat)) {
                    ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(R.string.VoipChannelRemoveMemberAlertText2, new Object[]{firstName, str}, textView2);
                } else {
                    ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(R.string.VoipGroupRemoveMemberAlertText2, new Object[]{firstName, str}, textView2);
                }
            }
            boolean z2 = LocaleController.isRTL;
            frameLayout.addView(textView3, LayoutHelper.createFrame(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 76, 11.0f, z2 ? 76 : 21, 0.0f));
            frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (i == 2) {
                builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupUserRemove), new DialogsActivity$$ExternalSyntheticLambda6(11, this, user));
            } else if (z) {
                builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupAdd), new ProfileActivity$$ExternalSyntheticLambda98(this, (TLRPC.User) user, j));
            }
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            alertDialogCreate.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_dialogBackground, false));
            alertDialogCreate.show();
            if (i != 2 || (textView = (TextView) alertDialogCreate.getButton(-1)) == null) {
                return;
            }
            textView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_leaveCallMenu, false));
            return;
        }
        if (i == 6) {
            this.parentActivity.switchToAccount(this.currentAccount, true);
            Bundle bundle = new Bundle();
            if (j > 0) {
                bundle.putLong("user_id", j);
            } else {
                bundle.putLong("chat_id", -j);
            }
            this.parentActivity.lambda$runLinkRequest$100(new ChatActivity(bundle));
            lambda$showGiftOfferSheet$15();
            return;
        }
        if (i == 8) {
            this.parentActivity.switchToAccount(this.currentAccount, true);
            BaseFragment baseFragment = (BaseFragment) Theme.ResourcesProvider.CC.m((ActionBarLayout) this.parentActivity.getActionBarLayout(), 1, ((ActionBarLayout) this.parentActivity.getActionBarLayout()).getFragmentStack());
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
            this.parentActivity.lambda$runLinkRequest$100(new ChatActivity(bundle2));
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
                TLRPC.User currentUser = this.accountInstance.getUserConfig().getCurrentUser();
                ImageUpdater imageUpdater2 = new ImageUpdater(true, 0, true);
                this.currentAvatarUpdater = imageUpdater2;
                imageUpdater2.setOpenWithFrontfaceCamera(true);
                this.currentAvatarUpdater.setForceDarkTheme(true);
                this.currentAvatarUpdater.setSearchAvailable(true, true);
                this.currentAvatarUpdater.setShowingFromDialog(true);
                this.currentAvatarUpdater.parentFragment = ((ActionBarLayout) this.parentActivity.getActionBarLayout()).getLastFragment();
                ImageUpdater imageUpdater3 = this.currentAvatarUpdater;
                AvatarUpdaterDelegate avatarUpdaterDelegate = new AvatarUpdaterDelegate(j);
                this.avatarUpdaterDelegate = avatarUpdaterDelegate;
                imageUpdater3.setDelegate(avatarUpdaterDelegate);
                ImageUpdater imageUpdater4 = this.currentAvatarUpdater;
                TLRPC.UserProfilePhoto userProfilePhoto = currentUser.photo;
                imageUpdater4.openMenu((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new GroupCallActivity$$ExternalSyntheticLambda28(this, i2), new SettingsActivity$$ExternalSyntheticLambda4(i3), 0);
                return;
            }
            return;
        }
        if (i == 10) {
            AlertsCreator.createChangeBioAlert(groupCallParticipant.about, j, getContext(), this.currentAccount);
            return;
        }
        if (i == 11) {
            AlertsCreator.createChangeNameAlert(j, getContext(), this.currentAccount);
            return;
        }
        if (i == 5) {
            sharedInstance.editCallMember(user, Boolean.TRUE, null, null, null, null);
            getUndoView().showWithAction(0L, 35, user);
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
    }

    private void runAvatarPreviewTransition(final boolean z, GroupCallUserCell groupCallUserCell) {
        boolean z2;
        float measuredHeight;
        float y;
        final float x;
        int measuredHeight2;
        GroupCallMiniTextureView groupCallMiniTextureView;
        GroupCallMiniTextureView groupCallMiniTextureView2;
        float paddingLeft = this.containerView.getPaddingLeft() + AndroidUtilities.dp(14.0f);
        float paddingTop = this.containerView.getPaddingTop() + AndroidUtilities.dp(14.0f);
        if (this.hasScrimAnchorView) {
            x = (this.listView.getX() + (groupCallUserCell.getX() + groupCallUserCell.getAvatarImageView().getX())) - paddingLeft;
            y = (this.listView.getY() + (groupCallUserCell.getY() + groupCallUserCell.getAvatarImageView().getY())) - paddingTop;
            measuredHeight = groupCallUserCell.getAvatarImageView().getMeasuredHeight() / this.listView.getMeasuredWidth();
            measuredHeight2 = (int) ((groupCallUserCell.getAvatarImageView().getMeasuredHeight() >> 1) / measuredHeight);
        } else {
            if (this.scrimRenderer == null) {
                this.previewTextureTransitionEnabled = true;
            } else {
                if (z) {
                    z2 = true;
                } else {
                    ProfileGalleryView profileGalleryView = this.avatarsViewPager;
                    if (profileGalleryView.getRealPosition(profileGalleryView.getCurrentItem()) == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                this.previewTextureTransitionEnabled = z2;
            }
            GroupCallGridCell groupCallGridCell = this.scrimGridView;
            if (groupCallGridCell == null || !this.previewTextureTransitionEnabled) {
                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell2 = this.scrimFullscreenView;
                if (groupCallUserCell2 != null) {
                    if (this.scrimRenderer == null) {
                        float x2 = (this.renderersContainer.getX() + (this.fullscreenUsersListView.getX() + (this.scrimFullscreenView.getX() + groupCallUserCell2.getAvatarImageView().getX()))) - paddingLeft;
                        float y2 = (this.renderersContainer.getY() + (this.fullscreenUsersListView.getY() + (this.scrimFullscreenView.getY() + this.scrimFullscreenView.getAvatarImageView().getY()))) - paddingTop;
                        measuredHeight = this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() / this.listView.getMeasuredWidth();
                        measuredHeight2 = (int) ((this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() >> 1) / measuredHeight);
                        y = y2;
                        x = x2;
                    } else {
                        if (this.previewTextureTransitionEnabled) {
                            x = (this.renderersContainer.getX() + (this.fullscreenUsersListView.getX() + groupCallUserCell2.getX())) - paddingLeft;
                            y = (this.renderersContainer.getY() + (this.fullscreenUsersListView.getY() + this.scrimFullscreenView.getY())) - paddingTop;
                        }
                        measuredHeight2 = 0;
                    }
                    if (!this.previewTextureTransitionEnabled && (groupCallMiniTextureView = this.scrimRenderer) != null) {
                        groupCallMiniTextureView.invalidate();
                        this.renderersContainer.invalidate();
                        GroupCallMiniTextureView groupCallMiniTextureView3 = this.scrimRenderer;
                        groupCallMiniTextureView3.showingAsScrimView = false;
                        groupCallMiniTextureView3.updateAttachState(false);
                        this.scrimRenderer = null;
                    }
                }
                measuredHeight = 0.96f;
                y = 0.0f;
                x = 0.0f;
                measuredHeight2 = 0;
                if (!this.previewTextureTransitionEnabled) {
                    groupCallMiniTextureView.invalidate();
                    this.renderersContainer.invalidate();
                    GroupCallMiniTextureView groupCallMiniTextureView4 = this.scrimRenderer;
                    groupCallMiniTextureView4.showingAsScrimView = false;
                    groupCallMiniTextureView4.updateAttachState(false);
                    this.scrimRenderer = null;
                }
            } else {
                float x3 = (this.listView.getX() + groupCallGridCell.getX()) - paddingLeft;
                y = ((this.listView.getY() + this.scrimGridView.getY()) + AndroidUtilities.dp(2.0f)) - paddingTop;
                x = x3;
            }
            measuredHeight = 1.0f;
            measuredHeight2 = 0;
            if (!this.previewTextureTransitionEnabled) {
                groupCallMiniTextureView.invalidate();
                this.renderersContainer.invalidate();
                GroupCallMiniTextureView groupCallMiniTextureView5 = this.scrimRenderer;
                groupCallMiniTextureView5.showingAsScrimView = false;
                groupCallMiniTextureView5.updateAttachState(false);
                this.scrimRenderer = null;
            }
        }
        final float f = y;
        final float f2 = measuredHeight;
        if (z) {
            this.avatarPreviewContainer.setScaleX(f2);
            this.avatarPreviewContainer.setScaleY(f2);
            this.avatarPreviewContainer.setTranslationX(x);
            this.avatarPreviewContainer.setTranslationY(f);
            this.avatarPagerIndicator.setAlpha(0.0f);
        }
        this.avatarsViewPager.setRoundRadius(measuredHeight2, measuredHeight2);
        if (this.useBlur) {
            if (z) {
                this.blurredView.setAlpha(0.0f);
            }
            OKLCH.m(this.blurredView.animate(), z ? 1.0f : 0.0f, 220L);
        }
        OKLCH.m(this.avatarPagerIndicator.animate(), z ? 1.0f : 0.0f, 220L);
        if (!z && (groupCallMiniTextureView2 = this.scrimRenderer) != null) {
            groupCallMiniTextureView2.showingAsScrimView = false;
            groupCallMiniTextureView2.updateAttachState(true);
            ProfileGalleryView profileGalleryView2 = this.avatarsViewPager;
            if (profileGalleryView2.getRealPosition(profileGalleryView2.getCurrentItem()) != 0) {
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
        final GroupCallMiniTextureView groupCallMiniTextureView6 = this.scrimGridView != null ? this.scrimRenderer : null;
        if (groupCallMiniTextureView6 != null) {
            groupCallMiniTextureView6.animateToScrimView = true;
        }
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                GroupCallMiniTextureView groupCallMiniTextureView7 = groupCallMiniTextureView6;
                if (groupCallMiniTextureView7 != null) {
                    groupCallMiniTextureView7.animateToScrimView = false;
                }
                GroupCallActivity.this.accountInstance.getNotificationCenter().onAnimationFinish(GroupCallActivity.this.popupAnimationIndex);
                GroupCallActivity.this.avatarPriviewTransitionInProgress = false;
                GroupCallActivity.this.progressToAvatarPreview = z ? 1.0f : 0.0f;
                GroupCallActivity.this.renderersContainer.progressToScrimView = GroupCallActivity.this.progressToAvatarPreview;
                if (z) {
                    GroupCallActivity.this.avatarPreviewContainer.setAlpha(1.0f);
                    GroupCallActivity.this.avatarPreviewContainer.setScaleX(1.0f);
                    GroupCallActivity.this.avatarPreviewContainer.setScaleY(1.0f);
                    GroupCallActivity.this.avatarPreviewContainer.setTranslationX(0.0f);
                    GroupCallActivity.this.avatarPreviewContainer.setTranslationY(0.0f);
                } else {
                    GroupCallActivity.this.scrimPaint.setAlpha(0);
                    GroupCallActivity.this.clearScrimView();
                    if (GroupCallActivity.this.scrimPopupLayout.getParent() != null) {
                        ((BottomSheet) GroupCallActivity.this).containerView.removeView(GroupCallActivity.this.scrimPopupLayout);
                    }
                    GroupCallActivity.this.scrimPopupLayout = null;
                    GroupCallActivity.this.avatarPreviewContainer.setVisibility(8);
                    GroupCallActivity.this.avatarsPreviewShowed = false;
                    GroupCallActivity.this.layoutManager.setCanScrollVertically(true);
                    GroupCallActivity.this.blurredView.setVisibility(8);
                    if (GroupCallActivity.this.delayedGroupCallUpdated) {
                        GroupCallActivity.this.delayedGroupCallUpdated = false;
                        GroupCallActivity.this.applyCallParticipantUpdates(true);
                    }
                    if (GroupCallActivity.this.scrimRenderer != null) {
                        GroupCallActivity.this.scrimRenderer.textureView.setRoundCorners(0.0f);
                    }
                }
                GroupCallActivity.this.checkContentOverlayed();
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                GroupCallActivity.this.avatarsViewPager.invalidate();
                GroupCallActivity.this.listView.invalidate();
            }
        });
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

    public void runUpdateTextureLightningRunnable() {
        AndroidUtilities.cancelRunOnUIThread(this.updateTextureLightningRunnable);
        if (!this.needTextureLightning || this.textureLightningView == null || VoIPService.getSharedInstance() == null || !isRtmpStream() || this.listView == null || !LiteMode.isEnabled(512)) {
            return;
        }
        AndroidUtilities.runOnUIThread(this.updateTextureLightningRunnable, 30L);
    }

    public void sendGroupCallMessage(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        this.callMessageEnterView.setText("");
        ChatObject.Call call = this.call;
        if (call == null || call.call == null || (inputGroupCall = call.getInputGroupCall()) == null) {
            return;
        }
        ChatObject.Call call2 = this.call;
        long j = call2.call.id;
        TLRPC.Peer peer = call2.selfPeer;
        GroupCallMessagesController.getInstance(this.currentAccount).sendCallMessage(peer != null ? DialogObject.getPeerDialogId(peer) : UserConfig.getInstance(this.currentAccount).clientUserId, tL_textWithEntities, j, inputGroupCall);
    }

    private void setAmplitude(double d) {
        float fMin = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.animateToAmplitude = fMin;
        this.animateAmplitudeDiff = (fMin - this.amplitude) / ((BlobDrawable.AMPLITUDE_SPEED * 500.0f) + 100.0f);
    }

    public void setColorProgress(float f) {
        this.colorProgress = f;
        GroupCallRenderersContainer groupCallRenderersContainer = this.renderersContainer;
        float fMax = Math.max(f, groupCallRenderersContainer == null ? 0.0f : groupCallRenderersContainer.progressToFullscreenMode);
        int i = Theme.key_voipgroup_actionBarUnscrolled;
        int color = Theme.getColor(null, i, false);
        int i2 = Theme.key_voipgroup_actionBar;
        int offsetColor = AndroidUtilities.getOffsetColor(color, Theme.getColor(null, i2, false), f, 1.0f);
        this.backgroundColor = offsetColor;
        this.actionBarBackground.setBackgroundColor(offsetColor);
        this.otherItem.redrawPopup(-14472653);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(this.backgroundColor, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(Theme.getColor(null, i, false), Theme.getColor(null, i2, false), fMax, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_listViewBackgroundUnscrolled, false), Theme.getColor(null, Theme.key_voipgroup_listViewBackground, false), f, 1.0f);
        CallEncryptionCellDrawable callEncryptionCellDrawable = this.encryptionDrawable;
        if (callEncryptionCellDrawable != null) {
            callEncryptionCellDrawable.setPaintBackgroundColor(offsetColor2);
        }
        this.listViewBackgroundPaint.setColor(offsetColor2);
        this.callMessageEnterContainerBgPaint.setColor(offsetColor2);
        this.callMessageEnterContainer.invalidate();
        this.listView.setGlowColor(offsetColor2);
        int i3 = this.muteButtonState;
        if (i3 == 3 || isGradientState(i3)) {
            this.muteButton.invalidate();
        }
        View view = this.buttonsBackgroundGradientView;
        if (view != null) {
            int[] iArr = this.gradientColors;
            iArr[0] = this.backgroundColor;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.buttonsBackgroundGradient.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.gradientColors);
                this.buttonsBackgroundGradient = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.buttonsBackgroundGradientView2.setBackgroundColor(this.gradientColors[0]);
        }
        int offsetColor3 = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_leaveButton, false), Theme.getColor(null, Theme.key_voipgroup_leaveButtonScrolled, false), f, 1.0f);
        this.leaveButton.setBackgroundColor(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_lastSeenTextUnscrolled, false), Theme.getColor(null, Theme.key_voipgroup_lastSeenText, false), f, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_mutedIconUnscrolled, false), Theme.getColor(null, Theme.key_voipgroup_mutedIcon, false), f, 1.0f);
        int color2 = Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider);
        int childCount = this.listView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = this.listView.getChildAt(i4);
            if (childAt instanceof GroupCallTextCell) {
                GroupCallTextCell groupCallTextCell = (GroupCallTextCell) childAt;
                if (isConference()) {
                    groupCallTextCell.setColors(color2, color2);
                } else {
                    groupCallTextCell.setColors(offsetColor5, offsetColor4);
                }
            } else if (childAt instanceof GroupCallUserCell) {
                ((GroupCallUserCell) childAt).setGrayIconColor(this.actionBar.getTag() != null ? Theme.key_voipgroup_mutedIcon : Theme.key_voipgroup_mutedIconUnscrolled, offsetColor5);
            } else if (childAt instanceof GroupCallInvitedCell) {
                ((GroupCallInvitedCell) childAt).setGrayIconColor(this.actionBar.getTag() != null ? Theme.key_voipgroup_mutedIcon : Theme.key_voipgroup_mutedIconUnscrolled, offsetColor5);
            }
        }
        this.containerView.invalidate();
        this.listView.invalidate();
        this.container.invalidate();
    }

    public void setCommentsEnabled(boolean z) {
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
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new ChatThemeController$$ExternalSyntheticLambda8(dispatchQueue), new GroupCallActivity$$ExternalSyntheticLambda63(this, 0));
    }

    private void setMicAmplitude(float f) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f = 0.0f;
        }
        setAmplitude(4000.0f * f);
        ChatObject.Call call = this.call;
        if (call == null || this.listView == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(MessageObject.getPeerId(this.selfPeer))) == null) {
            return;
        }
        if (this.renderersContainer.inFullscreenMode) {
            for (int i = 0; i < this.fullscreenUsersListView.getChildCount(); i++) {
                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) this.fullscreenUsersListView.getChildAt(i);
                if (MessageObject.getPeerId(groupCallUserCell.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    groupCallUserCell.setAmplitude(f * 15.0f);
                }
            }
        } else {
            int iIndexOf = (this.delayedGroupCallUpdated ? this.oldParticipants : this.call.visibleParticipants).indexOf(groupCallParticipant);
            if (iIndexOf >= 0 && (viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(iIndexOf + this.listAdapter.usersStartRow)) != null) {
                View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                if (view instanceof GroupCallUserCell) {
                    ((GroupCallUserCell) view).setAmplitude(f * 15.0f);
                    if (viewHolderFindViewHolderForAdapterPosition.itemView == this.scrimView && !this.contentFullyOverlayed) {
                        this.containerView.invalidate();
                    }
                }
            }
        }
        this.renderersContainer.setAmplitude(groupCallParticipant, f * 15.0f);
    }

    private void setScrollOffsetY(float f) {
        int iDp;
        this.scrollOffsetY = f;
        this.listView.setTopGlowOffset((int) (f - ((FrameLayout.LayoutParams) this.listView.getLayoutParams()).topMargin));
        int iDp2 = AndroidUtilities.dp(74.0f);
        float f2 = f - iDp2;
        if (this.backgroundPaddingTop + f2 < ActionBar.getCurrentActionBarHeight() * 2) {
            float fMin = Math.min(1.0f, (((ActionBar.getCurrentActionBarHeight() * 2) - f2) - this.backgroundPaddingTop) / (ActionBar.getCurrentActionBarHeight() + ((iDp2 - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            iDp = (int) (AndroidUtilities.dp(AndroidUtilities.isTablet() ? 17.0f : 13.0f) * fMin);
            LightningView lightningView = this.textureLightningView;
            if (lightningView != null) {
                lightningView.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * fMin));
            }
            if (Math.abs(Math.min(1.0f, fMin) - this.colorProgress) > 1.0E-4f) {
                setColorProgress(Math.min(1.0f, fMin));
            }
            float f3 = 1.0f - ((0.1f * fMin) * 1.2f);
            this.titleTextView.setScaleX(Math.max(0.9f, f3));
            this.titleTextView.setScaleY(Math.max(0.9f, f3));
            float f4 = 1.0f - (fMin * 1.2f);
            this.titleTextView.setAlpha((1.0f - this.renderersContainer.progressToFullscreenMode) * Math.max(0.0f, f4));
            this.liveLabelTextView.setScaleX(Math.max(0.9f, f3));
            this.liveLabelTextView.setScaleY(Math.max(0.9f, f3));
            this.liveLabelTextView.setAlpha((1.0f - this.renderersContainer.progressToFullscreenMode) * Math.max(0.0f, f4));
        } else {
            this.titleTextView.setScaleX(1.0f);
            this.titleTextView.setScaleY(1.0f);
            this.titleTextView.setAlpha(1.0f - this.renderersContainer.progressToFullscreenMode);
            this.liveLabelTextView.setScaleX(1.0f);
            this.liveLabelTextView.setScaleY(1.0f);
            this.liveLabelTextView.setAlpha(1.0f - this.renderersContainer.progressToFullscreenMode);
            if (this.colorProgress > 1.0E-4f) {
                setColorProgress(0.0f);
            }
            iDp = 0;
        }
        checkGroupCallUiPositions_MessagesList();
        float f5 = iDp;
        this.menuItemsContainer.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f - AndroidUtilities.dp(53.0f)) - f5));
        this.titleLayout.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f - AndroidUtilities.dp(44.0f)) - f5));
        LightningView lightningView2 = this.textureLightningView;
        if (lightningView2 != null) {
            lightningView2.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f - AndroidUtilities.dp(37.0f)));
        }
        LinearLayout linearLayout = this.scheduleTimerContainer;
        if (linearLayout != null) {
            linearLayout.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f - AndroidUtilities.dp(44.0f)) - f5));
        }
        this.containerView.invalidate();
        updateTopBulletinY();
    }

    public boolean showMenuForCell(View view) {
        GroupCallUserCell groupCallUserCell;
        boolean z;
        TLRPC.GroupCallParticipant participant;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout;
        final LinearLayout linearLayout;
        final LinearLayout linearLayout2;
        final LinearLayout linearLayout3;
        VolumeSlider volumeSlider;
        float f;
        ScrollView scrollView;
        ArrayList arrayList;
        long peerId;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ScrollView scrollView2;
        LinearLayout linearLayout4;
        ArrayList arrayList4;
        GroupCallUserCell groupCallUserCell2;
        boolean z2;
        ArrayList arrayList5;
        long j;
        TLRPC.Peer peer;
        long j2;
        TLRPC.Peer peer2;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        long j3;
        int size;
        int i;
        long j4;
        AnimatorSet animatorSet;
        ImageLocation forUserOrChat;
        ImageLocation forUserOrChat2;
        GroupCallMiniTextureView groupCallMiniTextureView;
        boolean z3;
        GroupCallMiniTextureView groupCallMiniTextureView2;
        AvatarUpdaterDelegate avatarUpdaterDelegate;
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell3;
        int x;
        float y;
        float y2;
        int measuredHeight;
        int y3;
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell4;
        TLRPC.User user;
        ActionBarMenuSubItem actionBarMenuSubItem;
        boolean z4;
        boolean z5;
        boolean[] zArr;
        boolean z6;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        TLRPC.ChannelParticipant adminInChannel;
        GroupCallActivity groupCallActivity = this;
        if (!groupCallActivity.itemAnimator.isRunning() && groupCallActivity.getContext() != null) {
            if (groupCallActivity.avatarPriviewTransitionInProgress || groupCallActivity.avatarsPreviewShowed) {
                groupCallActivity.dismissAvatarPreview(true);
                return false;
            }
            ActionBarPopupWindow actionBarPopupWindow = groupCallActivity.scrimPopupWindow;
            if (actionBarPopupWindow != null) {
                actionBarPopupWindow.dismiss();
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
                    if (isTabletMode || isLandscapeMode) {
                        groupCallActivity.scrimViewAttached = false;
                    } else {
                        groupCallActivity.scrimViewAttached = true;
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
                            final Rect rect = new Rect();
                            actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(groupCallActivity.getContext());
                            actionBarPopupWindowLayout.setBackgroundDrawable(null);
                            actionBarPopupWindowLayout.setPadding(0, 0, 0, 0);
                            actionBarPopupWindowLayout.setOnTouchListener(new View.OnTouchListener() {
                                private int[] pos = new int[2];

                                @Override
                                public boolean onTouch(View view2, MotionEvent motionEvent) {
                                    if (motionEvent.getActionMasked() == 0) {
                                        if (GroupCallActivity.this.scrimPopupWindow != null && GroupCallActivity.this.scrimPopupWindow.isShowing()) {
                                            View contentView = GroupCallActivity.this.scrimPopupWindow.getContentView();
                                            contentView.getLocationInWindow(this.pos);
                                            Rect rect2 = rect;
                                            int[] iArr = this.pos;
                                            int i7 = iArr[0];
                                            rect2.set(i7, iArr[1], contentView.getMeasuredWidth() + i7, contentView.getMeasuredHeight() + this.pos[1]);
                                            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                GroupCallActivity.this.scrimPopupWindow.dismiss();
                                            }
                                        }
                                    } else if (motionEvent.getActionMasked() == 4 && GroupCallActivity.this.scrimPopupWindow != null && GroupCallActivity.this.scrimPopupWindow.isShowing()) {
                                        GroupCallActivity.this.scrimPopupWindow.dismiss();
                                    }
                                    return false;
                                }
                            });
                            actionBarPopupWindowLayout.setDispatchKeyEventListener(new GroupCallActivity$$ExternalSyntheticLambda10(groupCallActivity, 0));
                            linearLayout = new LinearLayout(groupCallActivity.getContext());
                            if (participant.muted_by_you) {
                                linearLayout2 = null;
                            } else {
                                linearLayout2 = new LinearLayout(groupCallActivity.getContext());
                            }
                            groupCallActivity.currentOptionsLayout = linearLayout;
                            linearLayout3 = new LinearLayout(groupCallActivity.getContext()) {
                                @Override
                                public void onMeasure(int i7, int i8) {
                                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                                    LinearLayout linearLayout5 = linearLayout2;
                                    if (linearLayout5 == null) {
                                        setMeasuredDimension(linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight());
                                        return;
                                    }
                                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                                    setMeasuredDimension(linearLayout.getMeasuredWidth(), linearLayout2.getMeasuredHeight() + linearLayout.getMeasuredHeight());
                                }
                            };
                            linearLayout3.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            linearLayout3.setOrientation(1);
                            int offsetColor = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_listViewBackgroundUnscrolled, false), Theme.getColor(null, Theme.key_voipgroup_listViewBackground, false), groupCallActivity.colorProgress, 1.0f);
                            if (linearLayout2 != null || groupCallUserCell.isSelfUser() || participant.muted_by_you || (participant.muted && !participant.can_self_unmute)) {
                                volumeSlider = null;
                            } else {
                                Drawable drawableMutate = groupCallActivity.getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                                drawableMutate.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                                linearLayout2.setBackgroundDrawable(drawableMutate);
                                linearLayout3.addView(linearLayout2, LayoutHelper.createLinear(-2, -2, 0.0f, 0.0f, 0.0f, 0.0f));
                                VolumeSlider volumeSlider2 = groupCallActivity.new VolumeSlider(groupCallActivity.getContext(), participant);
                                linearLayout2.addView(volumeSlider2, -1, 48);
                                volumeSlider = volumeSlider2;
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
                            linearLayout3.addView(linearLayout, LayoutHelper.createLinear(-2, -2, 0.0f, f, 0.0f, 0.0f));
                            scrollView = new ScrollView(groupCallActivity.getContext(), null, 0, R.style.scrollbarShapeStyle) {
                                @Override
                                public void onMeasure(int i7, int i8) {
                                    super.onMeasure(i7, i8);
                                    setMeasuredDimension(linearLayout3.getMeasuredWidth(), getMeasuredHeight());
                                }
                            };
                            scrollView.setClipToPadding(false);
                            actionBarPopupWindowLayout.addView(scrollView, LayoutHelper.createFrame(-2, -2.0f));
                            peerId = MessageObject.getPeerId(participant.peer);
                            arrayList = new ArrayList(2);
                            arrayList2 = new ArrayList(2);
                            arrayList3 = new ArrayList(2);
                            if (participant.peer instanceof TLRPC.TL_peerUser) {
                                scrollView2 = scrollView;
                                linearLayout4 = linearLayout3;
                                arrayList4 = arrayList;
                                groupCallUserCell2 = groupCallUserCell;
                                if (peerId == (-groupCallActivity.getChatId())) {
                                }
                            } else if (ChatObject.isChannel(groupCallActivity.currentChat)) {
                                linearLayout4 = linearLayout3;
                                arrayList4 = arrayList;
                                adminInChannel = groupCallActivity.accountInstance.getMessagesController().getAdminInChannel(participant.peer.user_id, groupCallActivity.getChatId());
                                if (adminInChannel != null && ((adminInChannel instanceof TLRPC.TL_channelParticipantCreator) || adminInChannel.admin_rights.manage_call)) {
                                    scrollView2 = scrollView;
                                    groupCallUserCell2 = groupCallUserCell;
                                }
                                scrollView2 = scrollView;
                                groupCallUserCell2 = groupCallUserCell;
                            } else {
                                linearLayout4 = linearLayout3;
                                arrayList4 = arrayList;
                                chatFull = groupCallActivity.accountInstance.getMessagesController().getChatFull(groupCallActivity.getChatId());
                                if (chatFull != null || (chatParticipants = chatFull.participants) == null) {
                                    scrollView2 = scrollView;
                                    groupCallUserCell2 = groupCallUserCell;
                                } else {
                                    int size2 = chatParticipants.participants.size();
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 < size2) {
                                            TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i7);
                                            groupCallUserCell2 = groupCallUserCell;
                                            scrollView2 = scrollView;
                                            int i8 = size2;
                                            int i9 = i7;
                                            if (chatParticipant.user_id == participant.peer.user_id) {
                                                z2 = (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator);
                                            } else {
                                                i7 = i9 + 1;
                                                groupCallUserCell = groupCallUserCell2;
                                                scrollView = scrollView2;
                                                size2 = i8;
                                            }
                                        } else {
                                            scrollView2 = scrollView;
                                            groupCallUserCell2 = groupCallUserCell;
                                        }
                                    }
                                }
                            }
                            if (groupCallUserCell2.isSelfUser()) {
                                if (groupCallActivity.isConference() || !groupCallUserCell2.isHandRaised()) {
                                    arrayList5 = arrayList4;
                                } else {
                                    arrayList5 = arrayList4;
                                    arrayList5.add(LocaleController.getString(R.string.VoipGroupCancelRaiseHand));
                                    ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_handdown, arrayList2, 7, arrayList3);
                                }
                                if (groupCallUserCell2.hasAvatarSet()) {
                                    i2 = R.string.VoipAddPhoto;
                                } else {
                                    i2 = R.string.VoipSetNewPhoto;
                                }
                                arrayList5.add(LocaleController.getString(i2));
                                ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_addphoto, arrayList2, 9, arrayList3);
                                if (peerId > 0) {
                                    if (TextUtils.isEmpty(participant.about)) {
                                        i6 = R.string.VoipAddBio;
                                    } else {
                                        i6 = R.string.VoipEditBio;
                                    }
                                    arrayList5.add(LocaleController.getString(i6));
                                } else {
                                    if (TextUtils.isEmpty(participant.about)) {
                                        i3 = R.string.VoipAddDescription;
                                    } else {
                                        i3 = R.string.VoipEditDescription;
                                    }
                                    arrayList5.add(LocaleController.getString(i3));
                                }
                                if (TextUtils.isEmpty(participant.about)) {
                                    i4 = R.drawable.msg_addbio;
                                } else {
                                    i4 = R.drawable.msg_info;
                                }
                                ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(i4, arrayList2, 10, arrayList3);
                                if (peerId > 0) {
                                    i5 = R.string.VoipEditName;
                                } else {
                                    i5 = R.string.VoipEditTitle;
                                }
                                arrayList5.add(LocaleController.getString(i5));
                                ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_edit, arrayList2, 11, arrayList3);
                                j = 0;
                            } else {
                                arrayList5 = arrayList4;
                                j = 0;
                                if (groupCallActivity.canManageCall()) {
                                    if (groupCallActivity.isConference() && z2 && participant.muted) {
                                        if (groupCallActivity.isConference() && participant.muted_by_you) {
                                            arrayList5.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_voice_unmuted, arrayList2, 4, arrayList3);
                                        }
                                    } else if (participant.muted || participant.can_self_unmute) {
                                        arrayList5.add(LocaleController.getString(R.string.VoipGroupMute));
                                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_voice_muted, arrayList2, 0, arrayList3);
                                    } else {
                                        arrayList5.add(LocaleController.getString(R.string.VoipGroupAllowToSpeak));
                                        if (participant.raise_hand_rating != 0) {
                                            arrayList2.add(Integer.valueOf(R.drawable.msg_allowspeak));
                                        } else {
                                            arrayList2.add(Integer.valueOf(R.drawable.msg_voice_unmuted));
                                        }
                                        arrayList3.add(1);
                                    }
                                    peer2 = participant.peer;
                                    if (peer2 != null) {
                                        j3 = peer2.channel_id;
                                        if (j3 != 0 || ChatObject.isMegagroup(groupCallActivity.currentAccount, j3)) {
                                            arrayList5.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_openprofile, arrayList2, 6, arrayList3);
                                        } else {
                                            arrayList5.add(LocaleController.getString(R.string.VoipGroupOpenChannel));
                                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_channel, arrayList2, 8, arrayList3);
                                        }
                                    } else {
                                        arrayList5.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_openprofile, arrayList2, 6, arrayList3);
                                    }
                                    if (groupCallActivity.isConference() ? !(z2 || !ChatObject.canBlockUsers(groupCallActivity.currentChat)) : !((call = groupCallActivity.call) == null || (groupCall = call.call) == null || !groupCall.creator)) {
                                        arrayList5.add(LocaleController.getString(R.string.VoipGroupUserRemove));
                                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_block2, arrayList2, 2, arrayList3);
                                    }
                                } else {
                                    if (participant.muted_by_you) {
                                        arrayList5.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_voice_unmuted, arrayList2, 4, arrayList3);
                                    } else {
                                        arrayList5.add(LocaleController.getString(R.string.VoipGroupMuteForMe));
                                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_voice_muted, arrayList2, 5, arrayList3);
                                    }
                                    peer = participant.peer;
                                    if (peer != null) {
                                        j2 = peer.channel_id;
                                        if (j2 != 0 || ChatObject.isMegagroup(groupCallActivity.currentAccount, j2)) {
                                            arrayList5.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_msgbubble3, arrayList2, 6, arrayList3);
                                        } else {
                                            arrayList5.add(LocaleController.getString(R.string.VoipGroupOpenChannel));
                                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_msgbubble3, arrayList2, 8, arrayList3);
                                        }
                                    } else {
                                        arrayList5.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_msgbubble3, arrayList2, 6, arrayList3);
                                    }
                                }
                            }
                            size = arrayList5.size();
                            i = 0;
                            while (i < size) {
                                Context context = groupCallActivity.getContext();
                                if (i == 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (i == size - 1) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                actionBarMenuSubItem = new ActionBarMenuSubItem(0, context, null, z4, z5);
                                if (((Integer) arrayList3.get(i)).intValue() != 2) {
                                    int i10 = Theme.key_voipgroup_actionBarItems;
                                    zArr = null;
                                    z6 = false;
                                    actionBarMenuSubItem.setColors(Theme.getColor(null, i10, false), Theme.getColor(null, i10, false));
                                } else {
                                    zArr = null;
                                    z6 = false;
                                    int i11 = Theme.key_voipgroup_leaveCallMenu;
                                    actionBarMenuSubItem.setColors(Theme.getColor(null, i11, false), Theme.getColor(null, i11, false));
                                }
                                actionBarMenuSubItem.setSelectorColor(Theme.getColor(zArr, Theme.key_voipgroup_listSelector, z6));
                                actionBarMenuSubItem.setTextAndIcon((CharSequence) arrayList5.get(i), ((Integer) arrayList2.get(i)).intValue());
                                linearLayout.addView(actionBarMenuSubItem);
                                actionBarMenuSubItem.setTag(arrayList3.get(i));
                                groupCallActivity = this;
                                long j5 = peerId;
                                ArrayList arrayList6 = arrayList2;
                                TLRPC.GroupCallParticipant groupCallParticipant = participant;
                                actionBarMenuSubItem.setOnClickListener(new ProfileActivity$$ExternalSyntheticLambda1(groupCallActivity, i, arrayList3, groupCallParticipant, 2));
                                i++;
                                participant = groupCallParticipant;
                                arrayList2 = arrayList6;
                                peerId = j5;
                            }
                            j4 = peerId;
                            scrollView2.addView(linearLayout4, LayoutHelper.createScroll(-2, -2, 51));
                            groupCallActivity.listView.stopScroll();
                            groupCallActivity.layoutManager.setCanScrollVertically(false);
                            groupCallActivity.scrimView = groupCallUserCell2;
                            groupCallUserCell2.setAboutVisible(true);
                            groupCallActivity.containerView.invalidate();
                            groupCallActivity.listView.invalidate();
                            animatorSet = groupCallActivity.scrimAnimatorSet;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                            }
                            groupCallActivity.scrimPopupLayout = actionBarPopupWindowLayout;
                            if (j4 > j) {
                                user = groupCallActivity.accountInstance.getMessagesController().getUser(Long.valueOf(j4));
                                forUserOrChat = ImageLocation.getForUserOrChat(groupCallActivity.accountInstance.getCurrentAccount(), user, 0);
                                forUserOrChat2 = ImageLocation.getForUserOrChat(groupCallActivity.accountInstance.getCurrentAccount(), user, 1);
                                if (MessagesController.getInstance(groupCallActivity.currentAccount).getUserFull(j4) == null) {
                                    MessagesController.getInstance(groupCallActivity.currentAccount).loadUserInfo(user, false, 0);
                                }
                            } else {
                                TLRPC.Chat chat = groupCallActivity.accountInstance.getMessagesController().getChat(Long.valueOf(-j4));
                                forUserOrChat = ImageLocation.getForUserOrChat(groupCallActivity.accountInstance.getCurrentAccount(), chat, 0);
                                forUserOrChat2 = ImageLocation.getForUserOrChat(groupCallActivity.accountInstance.getCurrentAccount(), chat, 1);
                            }
                            groupCallMiniTextureView = groupCallActivity.scrimRenderer;
                            if (groupCallMiniTextureView == null && groupCallMiniTextureView.attached) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (forUserOrChat != null && !z3) {
                                z = false;
                            } else if (z) {
                                groupCallActivity.avatarsViewPager.setParentAvatarImage(groupCallActivity.scrimView.getAvatarImageView());
                                groupCallActivity.avatarsViewPager.setHasActiveVideo(z3);
                                groupCallActivity.avatarsViewPager.setData(j4, true);
                                groupCallActivity.avatarsViewPager.setCreateThumbFromParent(true);
                                groupCallActivity.avatarsViewPager.initIfEmpty(null, forUserOrChat, forUserOrChat2, true);
                                groupCallMiniTextureView2 = groupCallActivity.scrimRenderer;
                                if (groupCallMiniTextureView2 != null) {
                                    groupCallMiniTextureView2.showingAsScrimView = true;
                                    groupCallMiniTextureView2.updateAttachState(true);
                                }
                                if (MessageObject.getPeerId(groupCallActivity.selfPeer) == j4 && groupCallActivity.currentAvatarUpdater != null && (avatarUpdaterDelegate = groupCallActivity.avatarUpdaterDelegate) != null && avatarUpdaterDelegate.avatar != null) {
                                    groupCallActivity.avatarsViewPager.addUploadingImage(groupCallActivity.avatarUpdaterDelegate.uploadingImageLocation, ImageLocation.getForLocal(groupCallActivity.avatarUpdaterDelegate.avatar));
                                }
                            }
                            if (z) {
                                groupCallActivity.avatarsPreviewShowed = true;
                                actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                                groupCallActivity.containerView.addView(groupCallActivity.scrimPopupLayout, LayoutHelper.createFrame(-2, -2.0f));
                                groupCallActivity.useBlur = true;
                                groupCallActivity.prepareBlurBitmap();
                                groupCallActivity.avatarPriviewTransitionInProgress = true;
                                groupCallActivity.avatarPreviewContainer.setVisibility(0);
                                if (volumeSlider != null) {
                                    volumeSlider.invalidate();
                                }
                                groupCallActivity.runAvatarPreviewTransition(true, groupCallUserCell2);
                                groupCallUserCell4 = groupCallActivity.scrimFullscreenView;
                                if (groupCallUserCell4 != null) {
                                    groupCallUserCell4.getAvatarImageView().setAlpha(0.0f);
                                }
                                return true;
                            }
                            groupCallActivity.avatarsPreviewShowed = false;
                            int i12 = -2;
                            ActionBarPopupWindow actionBarPopupWindow2 = new ActionBarPopupWindow(actionBarPopupWindowLayout, i12, i12) {
                                @Override
                                public void dismiss() {
                                    dismiss(true);
                                    if (GroupCallActivity.this.scrimPopupWindow != this) {
                                        return;
                                    }
                                    GroupCallActivity.this.scrimPopupWindow = null;
                                    if (GroupCallActivity.this.scrimAnimatorSet != null) {
                                        GroupCallActivity.this.scrimAnimatorSet.cancel();
                                        GroupCallActivity.this.scrimAnimatorSet = null;
                                    }
                                    GroupCallActivity.this.layoutManager.setCanScrollVertically(true);
                                    GroupCallActivity.this.scrimAnimatorSet = new AnimatorSet();
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.add(ObjectAnimator.ofInt(GroupCallActivity.this.scrimPaint, AnimationProperties.PAINT_ALPHA, 0));
                                    GroupCallActivity.this.scrimAnimatorSet.playTogether(arrayList7);
                                    GroupCallActivity.this.scrimAnimatorSet.setDuration(220L);
                                    GroupCallActivity.this.scrimAnimatorSet.addListener(new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animator) {
                                            GroupCallActivity.this.clearScrimView();
                                            ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                                            GroupCallActivity.this.listView.invalidate();
                                            if (GroupCallActivity.this.delayedGroupCallUpdated) {
                                                GroupCallActivity.this.delayedGroupCallUpdated = false;
                                                GroupCallActivity.this.applyCallParticipantUpdates(true);
                                            }
                                        }
                                    });
                                    GroupCallActivity.this.scrimAnimatorSet.start();
                                }
                            };
                            groupCallActivity.scrimPopupWindow = actionBarPopupWindow2;
                            actionBarPopupWindow2.setPauseNotifications(true);
                            groupCallActivity.scrimPopupWindow.setDismissAnimationDuration(220);
                            groupCallActivity.scrimPopupWindow.setOutsideTouchable(true);
                            groupCallActivity.scrimPopupWindow.setClippingEnabled(true);
                            groupCallActivity.scrimPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                            groupCallActivity.scrimPopupWindow.setFocusable(true);
                            actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                            groupCallActivity.scrimPopupWindow.setInputMethodMode(2);
                            groupCallActivity.scrimPopupWindow.setSoftInputMode(0);
                            groupCallActivity.scrimPopupWindow.getContentView().setFocusableInTouchMode(true);
                            groupCallUserCell3 = groupCallActivity.scrimFullscreenView;
                            if (groupCallUserCell3 != null) {
                                x = (int) (((groupCallActivity.listView.getX() + groupCallActivity.listView.getMeasuredWidth()) + AndroidUtilities.dp(8.0f)) - actionBarPopupWindowLayout.getMeasuredWidth());
                                if (groupCallActivity.hasScrimAnchorView) {
                                    y2 = groupCallUserCell2.getY() + groupCallActivity.listView.getY();
                                    measuredHeight = groupCallUserCell2.getClipHeight();
                                } else if (groupCallActivity.scrimGridView != null) {
                                    y2 = groupCallActivity.scrimGridView.getY() + groupCallActivity.listView.getY();
                                    measuredHeight = groupCallActivity.scrimGridView.getMeasuredHeight();
                                } else {
                                    y = groupCallActivity.listView.getY();
                                    y3 = (int) y;
                                }
                                y3 = (int) (y2 + measuredHeight);
                            } else if (isLandscapeMode) {
                                x = AndroidUtilities.dp(32.0f) + (((int) (groupCallActivity.renderersContainer.getX() + (groupCallActivity.fullscreenUsersListView.getX() + groupCallUserCell3.getX()))) - actionBarPopupWindowLayout.getMeasuredWidth());
                                y3 = ((int) (groupCallActivity.renderersContainer.getY() + (groupCallActivity.fullscreenUsersListView.getY() + groupCallActivity.scrimFullscreenView.getY()))) - AndroidUtilities.dp(6.0f);
                            } else {
                                x = ((int) (groupCallActivity.renderersContainer.getX() + (groupCallActivity.fullscreenUsersListView.getX() + groupCallUserCell3.getX()))) - AndroidUtilities.dp(14.0f);
                                y = (groupCallActivity.renderersContainer.getY() + (groupCallActivity.fullscreenUsersListView.getY() + groupCallActivity.scrimFullscreenView.getY())) - actionBarPopupWindowLayout.getMeasuredHeight();
                                y3 = (int) y;
                            }
                            groupCallActivity.scrimPopupWindow.showAtLocation(groupCallActivity.listView, 51, x, y3);
                            groupCallActivity.scrimAnimatorSet = new AnimatorSet();
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.add(ObjectAnimator.ofInt(groupCallActivity.scrimPaint, AnimationProperties.PAINT_ALPHA, 0, 100));
                            groupCallActivity.scrimAnimatorSet.playTogether(arrayList7);
                            groupCallActivity.scrimAnimatorSet.setDuration(150L);
                            groupCallActivity.scrimAnimatorSet.start();
                            return true;
                        }
                    }
                }
            } else {
                if (view instanceof GroupCallFullscreenAdapter.GroupCallUserCell) {
                    GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell5 = (GroupCallFullscreenAdapter.GroupCallUserCell) view;
                    if (groupCallUserCell5.getParticipant() != groupCallActivity.call.videoNotAvailableParticipant.participant) {
                        groupCallUserCell = new GroupCallUserCell(groupCallUserCell5.getContext());
                        groupCallUserCell.setData(groupCallActivity.accountInstance, groupCallUserCell5.getParticipant(), groupCallActivity.call, MessageObject.getPeerId(groupCallActivity.selfPeer), null, false);
                        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = groupCallUserCell.rightDrawable;
                        if (swapAnimatedEmojiDrawable2 != null) {
                            swapAnimatedEmojiDrawable2.play();
                        }
                        groupCallActivity.hasScrimAnchorView = false;
                        groupCallActivity.scrimFullscreenView = groupCallUserCell5;
                        GroupCallMiniTextureView renderer = groupCallUserCell5.getRenderer();
                        groupCallActivity.scrimRenderer = renderer;
                        if (renderer != null && renderer.showingInFullscreen) {
                            groupCallActivity.scrimRenderer = null;
                        }
                        groupCallActivity.containerView.addView(groupCallUserCell, LayoutHelper.createFrame(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                        groupCallActivity.scrimViewAttached = true;
                    }
                } else {
                    groupCallUserCell = (GroupCallUserCell) view;
                    groupCallActivity.hasScrimAnchorView = true;
                    groupCallActivity.scrimViewAttached = true;
                }
                if (groupCallUserCell != null) {
                    if (isLandscapeMode) {
                        z = false;
                    } else {
                        z = false;
                    }
                    participant = groupCallUserCell.getParticipant();
                    if (participant != null) {
                        final Rect rect2 = new Rect();
                        actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(groupCallActivity.getContext());
                        actionBarPopupWindowLayout.setBackgroundDrawable(null);
                        actionBarPopupWindowLayout.setPadding(0, 0, 0, 0);
                        actionBarPopupWindowLayout.setOnTouchListener(new View.OnTouchListener() {
                            private int[] pos = new int[2];

                            @Override
                            public boolean onTouch(View view2, MotionEvent motionEvent) {
                                if (motionEvent.getActionMasked() == 0) {
                                    if (GroupCallActivity.this.scrimPopupWindow != null && GroupCallActivity.this.scrimPopupWindow.isShowing()) {
                                        View contentView = GroupCallActivity.this.scrimPopupWindow.getContentView();
                                        contentView.getLocationInWindow(this.pos);
                                        Rect rect3 = rect2;
                                        int[] iArr = this.pos;
                                        int i13 = iArr[0];
                                        rect3.set(i13, iArr[1], contentView.getMeasuredWidth() + i13, contentView.getMeasuredHeight() + this.pos[1]);
                                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                            GroupCallActivity.this.scrimPopupWindow.dismiss();
                                        }
                                    }
                                } else if (motionEvent.getActionMasked() == 4 && GroupCallActivity.this.scrimPopupWindow != null && GroupCallActivity.this.scrimPopupWindow.isShowing()) {
                                    GroupCallActivity.this.scrimPopupWindow.dismiss();
                                }
                                return false;
                            }
                        });
                        actionBarPopupWindowLayout.setDispatchKeyEventListener(new GroupCallActivity$$ExternalSyntheticLambda10(groupCallActivity, 0));
                        linearLayout = new LinearLayout(groupCallActivity.getContext());
                        if (participant.muted_by_you) {
                            linearLayout2 = new LinearLayout(groupCallActivity.getContext());
                        } else {
                            linearLayout2 = null;
                        }
                        groupCallActivity.currentOptionsLayout = linearLayout;
                        linearLayout3 = new LinearLayout(groupCallActivity.getContext()) {
                            @Override
                            public void onMeasure(int i13, int i14) {
                                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i13), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                                LinearLayout linearLayout5 = linearLayout2;
                                if (linearLayout5 == null) {
                                    setMeasuredDimension(linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight());
                                    return;
                                }
                                linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                                setMeasuredDimension(linearLayout.getMeasuredWidth(), linearLayout2.getMeasuredHeight() + linearLayout.getMeasuredHeight());
                            }
                        };
                        linearLayout3.setMinimumWidth(AndroidUtilities.dp(240.0f));
                        linearLayout3.setOrientation(1);
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
                        linearLayout3.addView(linearLayout, LayoutHelper.createLinear(-2, -2, 0.0f, f, 0.0f, 0.0f));
                        scrollView = new ScrollView(groupCallActivity.getContext(), null, 0, R.style.scrollbarShapeStyle) {
                            @Override
                            public void onMeasure(int i13, int i14) {
                                super.onMeasure(i13, i14);
                                setMeasuredDimension(linearLayout3.getMeasuredWidth(), getMeasuredHeight());
                            }
                        };
                        scrollView.setClipToPadding(false);
                        actionBarPopupWindowLayout.addView(scrollView, LayoutHelper.createFrame(-2, -2.0f));
                        peerId = MessageObject.getPeerId(participant.peer);
                        arrayList = new ArrayList(2);
                        arrayList2 = new ArrayList(2);
                        arrayList3 = new ArrayList(2);
                        if (participant.peer instanceof TLRPC.TL_peerUser) {
                            scrollView2 = scrollView;
                            linearLayout4 = linearLayout3;
                            arrayList4 = arrayList;
                            groupCallUserCell2 = groupCallUserCell;
                            if (peerId == (-groupCallActivity.getChatId())) {
                            }
                        } else if (ChatObject.isChannel(groupCallActivity.currentChat)) {
                            linearLayout4 = linearLayout3;
                            arrayList4 = arrayList;
                            adminInChannel = groupCallActivity.accountInstance.getMessagesController().getAdminInChannel(participant.peer.user_id, groupCallActivity.getChatId());
                            if (adminInChannel != null) {
                                scrollView2 = scrollView;
                                groupCallUserCell2 = groupCallUserCell;
                            }
                            scrollView2 = scrollView;
                            groupCallUserCell2 = groupCallUserCell;
                        } else {
                            linearLayout4 = linearLayout3;
                            arrayList4 = arrayList;
                            chatFull = groupCallActivity.accountInstance.getMessagesController().getChatFull(groupCallActivity.getChatId());
                            if (chatFull != null) {
                                scrollView2 = scrollView;
                                groupCallUserCell2 = groupCallUserCell;
                            } else {
                                scrollView2 = scrollView;
                                groupCallUserCell2 = groupCallUserCell;
                            }
                        }
                        if (groupCallUserCell2.isSelfUser()) {
                            if (groupCallActivity.isConference()) {
                                arrayList5 = arrayList4;
                            } else {
                                arrayList5 = arrayList4;
                            }
                            if (groupCallUserCell2.hasAvatarSet()) {
                                i2 = R.string.VoipAddPhoto;
                            } else {
                                i2 = R.string.VoipSetNewPhoto;
                            }
                            arrayList5.add(LocaleController.getString(i2));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_addphoto, arrayList2, 9, arrayList3);
                            if (peerId > 0) {
                                if (TextUtils.isEmpty(participant.about)) {
                                    i6 = R.string.VoipAddBio;
                                } else {
                                    i6 = R.string.VoipEditBio;
                                }
                                arrayList5.add(LocaleController.getString(i6));
                            } else {
                                if (TextUtils.isEmpty(participant.about)) {
                                    i3 = R.string.VoipAddDescription;
                                } else {
                                    i3 = R.string.VoipEditDescription;
                                }
                                arrayList5.add(LocaleController.getString(i3));
                            }
                            if (TextUtils.isEmpty(participant.about)) {
                                i4 = R.drawable.msg_addbio;
                            } else {
                                i4 = R.drawable.msg_info;
                            }
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(i4, arrayList2, 10, arrayList3);
                            if (peerId > 0) {
                                i5 = R.string.VoipEditName;
                            } else {
                                i5 = R.string.VoipEditTitle;
                            }
                            arrayList5.add(LocaleController.getString(i5));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_edit, arrayList2, 11, arrayList3);
                            j = 0;
                        } else {
                            arrayList5 = arrayList4;
                            j = 0;
                            if (groupCallActivity.canManageCall()) {
                                if (groupCallActivity.isConference()) {
                                    if (participant.muted) {
                                        arrayList5.add(LocaleController.getString(R.string.VoipGroupMute));
                                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_voice_muted, arrayList2, 0, arrayList3);
                                    } else {
                                        arrayList5.add(LocaleController.getString(R.string.VoipGroupMute));
                                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_voice_muted, arrayList2, 0, arrayList3);
                                    }
                                } else if (participant.muted) {
                                    arrayList5.add(LocaleController.getString(R.string.VoipGroupMute));
                                    ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_voice_muted, arrayList2, 0, arrayList3);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.VoipGroupMute));
                                    ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_voice_muted, arrayList2, 0, arrayList3);
                                }
                                peer2 = participant.peer;
                                if (peer2 != null) {
                                    j3 = peer2.channel_id;
                                    if (j3 != 0) {
                                        arrayList5.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_openprofile, arrayList2, 6, arrayList3);
                                    } else {
                                        arrayList5.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_openprofile, arrayList2, 6, arrayList3);
                                    }
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                    ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_openprofile, arrayList2, 6, arrayList3);
                                }
                                if (groupCallActivity.isConference()) {
                                }
                            } else {
                                if (participant.muted_by_you) {
                                    arrayList5.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                    ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_voice_unmuted, arrayList2, 4, arrayList3);
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.VoipGroupMuteForMe));
                                    ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_voice_muted, arrayList2, 5, arrayList3);
                                }
                                peer = participant.peer;
                                if (peer != null) {
                                    j2 = peer.channel_id;
                                    if (j2 != 0) {
                                        arrayList5.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_msgbubble3, arrayList2, 6, arrayList3);
                                    } else {
                                        arrayList5.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_msgbubble3, arrayList2, 6, arrayList3);
                                    }
                                } else {
                                    arrayList5.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                    ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_msgbubble3, arrayList2, 6, arrayList3);
                                }
                            }
                        }
                        size = arrayList5.size();
                        i = 0;
                        while (i < size) {
                            Context context2 = groupCallActivity.getContext();
                            if (i == 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (i == size - 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            actionBarMenuSubItem = new ActionBarMenuSubItem(0, context2, null, z4, z5);
                            if (((Integer) arrayList3.get(i)).intValue() != 2) {
                                int i13 = Theme.key_voipgroup_actionBarItems;
                                zArr = null;
                                z6 = false;
                                actionBarMenuSubItem.setColors(Theme.getColor(null, i13, false), Theme.getColor(null, i13, false));
                            } else {
                                zArr = null;
                                z6 = false;
                                int i14 = Theme.key_voipgroup_leaveCallMenu;
                                actionBarMenuSubItem.setColors(Theme.getColor(null, i14, false), Theme.getColor(null, i14, false));
                            }
                            actionBarMenuSubItem.setSelectorColor(Theme.getColor(zArr, Theme.key_voipgroup_listSelector, z6));
                            actionBarMenuSubItem.setTextAndIcon((CharSequence) arrayList5.get(i), ((Integer) arrayList2.get(i)).intValue());
                            linearLayout.addView(actionBarMenuSubItem);
                            actionBarMenuSubItem.setTag(arrayList3.get(i));
                            groupCallActivity = this;
                            long j6 = peerId;
                            ArrayList arrayList8 = arrayList2;
                            TLRPC.GroupCallParticipant groupCallParticipant2 = participant;
                            actionBarMenuSubItem.setOnClickListener(new ProfileActivity$$ExternalSyntheticLambda1(groupCallActivity, i, arrayList3, groupCallParticipant2, 2));
                            i++;
                            participant = groupCallParticipant2;
                            arrayList2 = arrayList8;
                            peerId = j6;
                        }
                        j4 = peerId;
                        scrollView2.addView(linearLayout4, LayoutHelper.createScroll(-2, -2, 51));
                        groupCallActivity.listView.stopScroll();
                        groupCallActivity.layoutManager.setCanScrollVertically(false);
                        groupCallActivity.scrimView = groupCallUserCell2;
                        groupCallUserCell2.setAboutVisible(true);
                        groupCallActivity.containerView.invalidate();
                        groupCallActivity.listView.invalidate();
                        animatorSet = groupCallActivity.scrimAnimatorSet;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        groupCallActivity.scrimPopupLayout = actionBarPopupWindowLayout;
                        if (j4 > j) {
                            user = groupCallActivity.accountInstance.getMessagesController().getUser(Long.valueOf(j4));
                            forUserOrChat = ImageLocation.getForUserOrChat(groupCallActivity.accountInstance.getCurrentAccount(), user, 0);
                            forUserOrChat2 = ImageLocation.getForUserOrChat(groupCallActivity.accountInstance.getCurrentAccount(), user, 1);
                            if (MessagesController.getInstance(groupCallActivity.currentAccount).getUserFull(j4) == null) {
                                MessagesController.getInstance(groupCallActivity.currentAccount).loadUserInfo(user, false, 0);
                            }
                        } else {
                            TLRPC.Chat chat2 = groupCallActivity.accountInstance.getMessagesController().getChat(Long.valueOf(-j4));
                            forUserOrChat = ImageLocation.getForUserOrChat(groupCallActivity.accountInstance.getCurrentAccount(), chat2, 0);
                            forUserOrChat2 = ImageLocation.getForUserOrChat(groupCallActivity.accountInstance.getCurrentAccount(), chat2, 1);
                        }
                        groupCallMiniTextureView = groupCallActivity.scrimRenderer;
                        if (groupCallMiniTextureView == null) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (forUserOrChat != null) {
                            if (z) {
                                groupCallActivity.avatarsViewPager.setParentAvatarImage(groupCallActivity.scrimView.getAvatarImageView());
                                groupCallActivity.avatarsViewPager.setHasActiveVideo(z3);
                                groupCallActivity.avatarsViewPager.setData(j4, true);
                                groupCallActivity.avatarsViewPager.setCreateThumbFromParent(true);
                                groupCallActivity.avatarsViewPager.initIfEmpty(null, forUserOrChat, forUserOrChat2, true);
                                groupCallMiniTextureView2 = groupCallActivity.scrimRenderer;
                                if (groupCallMiniTextureView2 != null) {
                                    groupCallMiniTextureView2.showingAsScrimView = true;
                                    groupCallMiniTextureView2.updateAttachState(true);
                                }
                                if (MessageObject.getPeerId(groupCallActivity.selfPeer) == j4) {
                                    groupCallActivity.avatarsViewPager.addUploadingImage(groupCallActivity.avatarUpdaterDelegate.uploadingImageLocation, ImageLocation.getForLocal(groupCallActivity.avatarUpdaterDelegate.avatar));
                                }
                            }
                        } else if (z) {
                            groupCallActivity.avatarsViewPager.setParentAvatarImage(groupCallActivity.scrimView.getAvatarImageView());
                            groupCallActivity.avatarsViewPager.setHasActiveVideo(z3);
                            groupCallActivity.avatarsViewPager.setData(j4, true);
                            groupCallActivity.avatarsViewPager.setCreateThumbFromParent(true);
                            groupCallActivity.avatarsViewPager.initIfEmpty(null, forUserOrChat, forUserOrChat2, true);
                            groupCallMiniTextureView2 = groupCallActivity.scrimRenderer;
                            if (groupCallMiniTextureView2 != null) {
                                groupCallMiniTextureView2.showingAsScrimView = true;
                                groupCallMiniTextureView2.updateAttachState(true);
                            }
                            if (MessageObject.getPeerId(groupCallActivity.selfPeer) == j4) {
                                groupCallActivity.avatarsViewPager.addUploadingImage(groupCallActivity.avatarUpdaterDelegate.uploadingImageLocation, ImageLocation.getForLocal(groupCallActivity.avatarUpdaterDelegate.avatar));
                            }
                        }
                        if (z) {
                            groupCallActivity.avatarsPreviewShowed = true;
                            actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                            groupCallActivity.containerView.addView(groupCallActivity.scrimPopupLayout, LayoutHelper.createFrame(-2, -2.0f));
                            groupCallActivity.useBlur = true;
                            groupCallActivity.prepareBlurBitmap();
                            groupCallActivity.avatarPriviewTransitionInProgress = true;
                            groupCallActivity.avatarPreviewContainer.setVisibility(0);
                            if (volumeSlider != null) {
                                volumeSlider.invalidate();
                            }
                            groupCallActivity.runAvatarPreviewTransition(true, groupCallUserCell2);
                            groupCallUserCell4 = groupCallActivity.scrimFullscreenView;
                            if (groupCallUserCell4 != null) {
                                groupCallUserCell4.getAvatarImageView().setAlpha(0.0f);
                            }
                            return true;
                        }
                        groupCallActivity.avatarsPreviewShowed = false;
                        int i15 = -2;
                        ActionBarPopupWindow actionBarPopupWindow3 = new ActionBarPopupWindow(actionBarPopupWindowLayout, i15, i15) {
                            @Override
                            public void dismiss() {
                                dismiss(true);
                                if (GroupCallActivity.this.scrimPopupWindow != this) {
                                    return;
                                }
                                GroupCallActivity.this.scrimPopupWindow = null;
                                if (GroupCallActivity.this.scrimAnimatorSet != null) {
                                    GroupCallActivity.this.scrimAnimatorSet.cancel();
                                    GroupCallActivity.this.scrimAnimatorSet = null;
                                }
                                GroupCallActivity.this.layoutManager.setCanScrollVertically(true);
                                GroupCallActivity.this.scrimAnimatorSet = new AnimatorSet();
                                ArrayList arrayList9 = new ArrayList();
                                arrayList9.add(ObjectAnimator.ofInt(GroupCallActivity.this.scrimPaint, AnimationProperties.PAINT_ALPHA, 0));
                                GroupCallActivity.this.scrimAnimatorSet.playTogether(arrayList9);
                                GroupCallActivity.this.scrimAnimatorSet.setDuration(220L);
                                GroupCallActivity.this.scrimAnimatorSet.addListener(new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animator) {
                                        GroupCallActivity.this.clearScrimView();
                                        ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                                        GroupCallActivity.this.listView.invalidate();
                                        if (GroupCallActivity.this.delayedGroupCallUpdated) {
                                            GroupCallActivity.this.delayedGroupCallUpdated = false;
                                            GroupCallActivity.this.applyCallParticipantUpdates(true);
                                        }
                                    }
                                });
                                GroupCallActivity.this.scrimAnimatorSet.start();
                            }
                        };
                        groupCallActivity.scrimPopupWindow = actionBarPopupWindow3;
                        actionBarPopupWindow3.setPauseNotifications(true);
                        groupCallActivity.scrimPopupWindow.setDismissAnimationDuration(220);
                        groupCallActivity.scrimPopupWindow.setOutsideTouchable(true);
                        groupCallActivity.scrimPopupWindow.setClippingEnabled(true);
                        groupCallActivity.scrimPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                        groupCallActivity.scrimPopupWindow.setFocusable(true);
                        actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                        groupCallActivity.scrimPopupWindow.setInputMethodMode(2);
                        groupCallActivity.scrimPopupWindow.setSoftInputMode(0);
                        groupCallActivity.scrimPopupWindow.getContentView().setFocusableInTouchMode(true);
                        groupCallUserCell3 = groupCallActivity.scrimFullscreenView;
                        if (groupCallUserCell3 != null) {
                            x = (int) (((groupCallActivity.listView.getX() + groupCallActivity.listView.getMeasuredWidth()) + AndroidUtilities.dp(8.0f)) - actionBarPopupWindowLayout.getMeasuredWidth());
                            if (groupCallActivity.hasScrimAnchorView) {
                                y2 = groupCallUserCell2.getY() + groupCallActivity.listView.getY();
                                measuredHeight = groupCallUserCell2.getClipHeight();
                            } else if (groupCallActivity.scrimGridView != null) {
                                y2 = groupCallActivity.scrimGridView.getY() + groupCallActivity.listView.getY();
                                measuredHeight = groupCallActivity.scrimGridView.getMeasuredHeight();
                            } else {
                                y = groupCallActivity.listView.getY();
                                y3 = (int) y;
                            }
                            y3 = (int) (y2 + measuredHeight);
                        } else if (isLandscapeMode) {
                            x = AndroidUtilities.dp(32.0f) + (((int) (groupCallActivity.renderersContainer.getX() + (groupCallActivity.fullscreenUsersListView.getX() + groupCallUserCell3.getX()))) - actionBarPopupWindowLayout.getMeasuredWidth());
                            y3 = ((int) (groupCallActivity.renderersContainer.getY() + (groupCallActivity.fullscreenUsersListView.getY() + groupCallActivity.scrimFullscreenView.getY()))) - AndroidUtilities.dp(6.0f);
                        } else {
                            x = ((int) (groupCallActivity.renderersContainer.getX() + (groupCallActivity.fullscreenUsersListView.getX() + groupCallUserCell3.getX()))) - AndroidUtilities.dp(14.0f);
                            y = (groupCallActivity.renderersContainer.getY() + (groupCallActivity.fullscreenUsersListView.getY() + groupCallActivity.scrimFullscreenView.getY())) - actionBarPopupWindowLayout.getMeasuredHeight();
                            y3 = (int) y;
                        }
                        groupCallActivity.scrimPopupWindow.showAtLocation(groupCallActivity.listView, 51, x, y3);
                        groupCallActivity.scrimAnimatorSet = new AnimatorSet();
                        ArrayList arrayList9 = new ArrayList();
                        arrayList9.add(ObjectAnimator.ofInt(groupCallActivity.scrimPaint, AnimationProperties.PAINT_ALPHA, 0, 100));
                        groupCallActivity.scrimAnimatorSet.playTogether(arrayList9);
                        groupCallActivity.scrimAnimatorSet.setDuration(150L);
                        groupCallActivity.scrimAnimatorSet.start();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void showRecordHint(View view) {
        if (this.recordHintView == null) {
            HintView hintView = new HintView(getContext(), 8, true);
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
            this.recordHintView.setBackgroundColor(-366530760, -1);
        }
        this.recordHintView.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.recordHintView.showForView(view, true);
    }

    public void showReminderHint() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (this.reminderHintView == null) {
            HintView hintView = new HintView(getContext(), 8);
            this.reminderHintView = hintView;
            hintView.setAlpha(0.0f);
            this.reminderHintView.setVisibility(4);
            this.reminderHintView.setShowingDuration(4000L);
            this.containerView.addView(this.reminderHintView, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            this.reminderHintView.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            this.reminderHintView.setBackgroundColor(-366530760, -1);
        }
        this.reminderHintView.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.reminderHintView.showForView(this.muteButton, true);
    }

    private void startScreenCapture() {
        LaunchActivity launchActivity = this.parentActivity;
        if (launchActivity == null) {
            return;
        }
        this.parentActivity.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
    }

    public void toggleAdminSpeak() {
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
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new ChatThemeController$$ExternalSyntheticLambda8(dispatchQueue), new GroupCallActivity$$ExternalSyntheticLambda63(this, 1));
    }

    private void updateButtonsVisibility(boolean z) {
        boolean zBooleanValue;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ChatObject.Call call = this.call;
        boolean z6 = false;
        if (call == null || call.isScheduled()) {
            this.buttonsContainer.setButtonVisibility(this.muteButton, this.switchToButtonProgress > 0.1f, z);
            this.buttonsContainer.setButtonVisibility(this.leaveButton, this.switchToButtonProgress > 0.1f, z);
            this.buttonsContainer.setButtonVisibility(this.soundButton, this.switchToButtonProgress > 0.1f, z);
            this.buttonsContainer.setButtonVisibility(this.cameraButton, false, z);
            this.buttonsContainer.setButtonVisibility(this.flipButton, false, z);
            this.buttonsContainer.setButtonVisibility(this.speakerButton, false, z);
            this.buttonsContainer.setButtonVisibility(this.messageButton, false, z);
            return;
        }
        boolean z7 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
        boolean z8 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || canManageCall()) ? false : true;
        Boolean bool = this.pendingCommentsEnabled;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            TLRPC.GroupCall groupCall = this.call.call;
            zBooleanValue = groupCall != null && groupCall.messages_enabled;
        }
        if (((z8 || !this.call.canRecordVideo()) && !z7) || isRtmpStream()) {
            z2 = false;
            z3 = true;
        } else {
            z2 = true;
            z3 = false;
        }
        if (z7) {
            z4 = false;
            z5 = true;
        } else {
            z4 = !z8;
            z5 = false;
        }
        if (isLandscapeMode) {
            z4 = false;
        } else {
            z6 = z5;
        }
        this.buttonsContainer.setButtonVisibility(this.muteButton, true, z);
        this.buttonsContainer.setButtonVisibility(this.leaveButton, true, z);
        this.buttonsContainer.setButtonVisibility(this.cameraButton, z2, z);
        this.buttonsContainer.setButtonVisibility(this.flipButton, z6, z);
        this.buttonsContainer.setButtonVisibility(this.soundButton, z3, z);
        this.buttonsContainer.setButtonVisibility(this.speakerButton, z4, z);
        this.buttonsContainer.setButtonVisibility(this.messageButton, zBooleanValue, z);
    }

    public void updateItems() {
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        ChatObject.Call call2 = this.call;
        if (call2 == null || call2.isScheduled()) {
            this.pipItem.setVisibility(4);
            this.screenShareItem.setVisibility(8);
            if (this.call == null) {
                this.otherItem.setVisibility(8);
                return;
            }
        }
        if (this.changingPermissions) {
            return;
        }
        TLRPC.Chat chat3 = this.accountInstance.getMessagesController().getChat(Long.valueOf(getChatId()));
        if (chat3 != null) {
            this.currentChat = chat3;
        }
        if (ChatObject.canUserDoAdminAction(this.currentChat, 3) || (((!ChatObject.isChannel(this.currentChat) || ((chat2 = this.currentChat) != null && chat2.megagroup)) && (ChatObject.isPublic(this.currentChat) || ChatObject.canUserDoAdminAction(this.currentChat, 3))) || (ChatObject.isChannel(this.currentChat) && (chat = this.currentChat) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
            this.inviteItem.setVisibility(0);
        } else {
            this.inviteItem.setVisibility(8);
        }
        ChatObject.Call call3 = this.call;
        if (call3 == null || (groupCall2 = call3.call) == null || !groupCall2.can_change_messages_enabled) {
            this.enableComments.setVisibility(8);
            this.disableComments.setVisibility(8);
        } else {
            this.enableComments.setVisibility(groupCall2.messages_enabled ? 8 : 0);
            this.disableComments.setVisibility(this.call.call.messages_enabled ? 0 : 8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
        ChatObject.Call call4 = this.call;
        if (call4 == null || call4.isScheduled() || !(groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            this.noiseItem.setVisibility(8);
        } else {
            this.noiseItem.setVisibility(0);
        }
        this.noiseItem.setIcon(SharedConfig.noiseSupression ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        this.noiseItem.setSubtext(LocaleController.getString(SharedConfig.noiseSupression ? R.string.VoipNoiseCancellationEnabled : R.string.VoipNoiseCancellationDisabled));
        boolean z = true;
        if (canManageCall()) {
            this.leaveItem.setVisibility(0);
            this.editTitleItem.setVisibility(0);
            if (isRtmpStream()) {
                this.recordItem.setVisibility(0);
                this.screenItem.setVisibility(8);
            } else if (this.call.isScheduled()) {
                this.recordItem.setVisibility(8);
                this.screenItem.setVisibility(8);
            } else {
                this.recordItem.setVisibility(0);
            }
            if (isConference()) {
                this.recordItem.setVisibility(8);
                this.editTitleItem.setVisibility(8);
            }
            if (!this.call.canRecordVideo() || this.call.isScheduled() || isRtmpStream()) {
                this.screenItem.setVisibility(8);
            } else {
                this.screenItem.setVisibility(0);
            }
            this.screenShareItem.setVisibility(8);
            this.recordCallDrawable.setRecording(this.call.recording);
            if (this.call.recording) {
                if (this.updateCallRecordRunnable == null) {
                    GroupCallActivity$$ExternalSyntheticLambda28 groupCallActivity$$ExternalSyntheticLambda28 = new GroupCallActivity$$ExternalSyntheticLambda28(this, 10);
                    this.updateCallRecordRunnable = groupCallActivity$$ExternalSyntheticLambda28;
                    AndroidUtilities.runOnUIThread(groupCallActivity$$ExternalSyntheticLambda28, 1000L);
                }
                this.recordItem.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                Runnable runnable = this.updateCallRecordRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    this.updateCallRecordRunnable = null;
                }
                this.recordItem.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getVideoState(true) != 2) {
                this.screenItem.setTextAndIcon(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast);
            } else {
                this.screenItem.setTextAndIcon(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off);
            }
            updateRecordCallText();
        } else {
            boolean z2 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || canManageCall()) ? false : true;
            boolean z3 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2;
            if (z2 || (!(this.call.canRecordVideo() || z3) || this.call.isScheduled() || isRtmpStream())) {
                this.screenShareItem.setVisibility(8);
                this.screenItem.setVisibility(8);
            } else if (z3) {
                this.screenShareItem.setVisibility(8);
                this.screenItem.setVisibility(0);
                ActionBarMenuSubItem actionBarMenuSubItem = this.screenItem;
                int i = R.string.VoipChatStopScreenCapture;
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(i), R.drawable.msg_screencast_off);
                this.screenItem.setContentDescription(LocaleController.getString(i));
            } else {
                ActionBarMenuSubItem actionBarMenuSubItem2 = this.screenItem;
                int i2 = R.string.VoipChatStartScreenCapture;
                actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(i2), R.drawable.msg_screencast);
                this.screenItem.setContentDescription(LocaleController.getString(i2));
                this.screenShareItem.setVisibility(8);
                this.screenItem.setVisibility(0);
            }
            this.leaveItem.setVisibility(8);
            this.editTitleItem.setVisibility(8);
            this.recordItem.setVisibility(8);
        }
        if (canManageCall() && this.call.call.can_change_join_muted && !isConference()) {
            this.permissionItem.setVisibility(0);
        } else {
            this.permissionItem.setVisibility(8);
        }
        ActionBarMenuItem actionBarMenuItem = this.otherItem;
        if (isConference() && ((call = this.call) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z = false;
        }
        actionBarMenuItem.setSubItemShown(4, z);
        this.soundItem.setVisibility((!isRtmpStream() || this.call.isScheduled()) ? 0 : 8);
        if (this.editTitleItem.getVisibility() == 0 || this.permissionItem.getVisibility() == 0 || this.inviteItem.getVisibility() == 0 || this.screenItem.getVisibility() == 0 || this.recordItem.getVisibility() == 0 || this.leaveItem.getVisibility() == 0) {
            this.soundItemDivider.setVisibility(0);
        } else {
            this.soundItemDivider.setVisibility(8);
        }
        if (((VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().hasFewPeers) && !this.scheduleHasFewPeers) || isRtmpStream() || this.selfPeer == null) {
            this.accountSelectCell.setVisibility(8);
        } else {
            this.accountSelectCell.setVisibility(0);
            long peerId = MessageObject.getPeerId(this.selfPeer);
            this.accountSelectCell.setObject(DialogObject.isUserDialog(peerId) ? this.accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : this.accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)));
        }
        TLRPC.Chat chat4 = this.currentChat;
        if (chat4 == null || ChatObject.isChannelOrGiga(chat4) || !isRtmpStream() || this.inviteItem.getVisibility() != 8) {
            this.otherItem.setVisibility(0);
        } else {
            this.otherItem.setVisibility(8);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.titleLayout.getLayoutParams();
        float f = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f);
            this.titleLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.menuItemsContainer.getLayoutParams()).rightMargin = 0;
        this.actionBar.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    public void updateLayout(boolean z) {
        boolean z2 = true;
        int childCount = this.listView.getChildCount();
        float paddingTop = 2.1474836E9f;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if (this.listView.getChildAdapterPosition(childAt) >= 0) {
                paddingTop = Math.min(paddingTop, childAt.getTop());
            }
        }
        if (paddingTop < 0.0f || paddingTop == 2.1474836E9f) {
            paddingTop = childCount != 0 ? 0.0f : this.listView.getPaddingTop();
        }
        final boolean z3 = paddingTop <= ((float) (ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)));
        float fDp = paddingTop + AndroidUtilities.dp(14.0f) + ActionBar.getCurrentActionBarHeight();
        if ((z3 && this.actionBar.getTag() == null) || (!z3 && this.actionBar.getTag() != null)) {
            this.actionBar.setTag(z3 ? 1 : null);
            AnimatorSet animatorSet = this.actionBarAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.actionBarAnimation = null;
            }
            setUseLightStatusBar(this.actionBar.getTag() == null);
            ViewPropertyAnimator duration = this.actionBar.getBackButton().animate().scaleX(z3 ? 1.0f : 0.9f).scaleY(z3 ? 1.0f : 0.9f).translationX(z3 ? 0.0f : -AndroidUtilities.dp(14.0f)).setDuration(300L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            this.actionBar.getTitleTextView().animate().translationY(z3 ? 0.0f : AndroidUtilities.dp(23.0f)).setDuration(300L).setInterpolator(cubicBezierInterpolator).start();
            ObjectAnimator objectAnimator = this.subtitleYAnimator;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.subtitleYAnimator.cancel();
            }
            SimpleTextView subtitleTextView = this.actionBar.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<SimpleTextView, Float>) property, this.actionBar.getSubtitleTextView().getTranslationY(), z3 ? 0.0f : AndroidUtilities.dp(20.0f));
            this.subtitleYAnimator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(300L);
            this.subtitleYAnimator.setInterpolator(cubicBezierInterpolator);
            this.subtitleYAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    groupCallActivity.subtitleYAnimator = null;
                    groupCallActivity.actionBar.getSubtitleTextView().setTranslationY(z3 ? 0.0f : AndroidUtilities.dp(20.0f));
                }
            });
            this.subtitleYAnimator.start();
            ObjectAnimator objectAnimator2 = this.additionalSubtitleYAnimator;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.actionBar.getAdditionalSubtitleTextView(), (Property<SimpleTextView, Float>) property, z3 ? 0.0f : AndroidUtilities.dp(20.0f));
            this.additionalSubtitleYAnimator = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(300L);
            this.additionalSubtitleYAnimator.setInterpolator(cubicBezierInterpolator);
            this.additionalSubtitleYAnimator.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.actionBarAnimation = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = this.actionBarAnimation;
            ActionBar actionBar = this.actionBar;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(actionBar, (Property<ActionBar, Float>) property2, z3 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.actionBarBackground, (Property<View, Float>) property2, z3 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.actionBarShadow, (Property<View, Float>) property2, z3 ? 1.0f : 0.0f));
            this.actionBarAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    GroupCallActivity.this.actionBarAnimation = null;
                }
            });
            this.actionBarAnimation.start();
            ImageView imageView = this.renderersContainer.pipView;
            if (z3 && !isLandscapeMode) {
                z2 = false;
            }
            imageView.setClickable(z2);
        }
        if (this.scrollOffsetY != fDp) {
            setScrollOffsetY(fDp);
        }
    }

    private void updateLiveLabel(boolean z) {
        if (!isRtmpStream()) {
            this.liveLabelTextView.setVisibility(8);
            return;
        }
        this.liveLabelTextView.setVisibility(0);
        boolean z2 = ((Integer) this.liveLabelTextView.getTag()).intValue() == 3;
        int i = this.currentCallState;
        final boolean z3 = i == 3;
        this.liveLabelTextView.setTag(Integer.valueOf(i));
        if (z2 != z3) {
            ValueAnimator valueAnimator = this.liveLabelBgColorAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (!z) {
                this.liveLabelPaint.setColor(this.currentCallState == 3 ? -1163700 : -12761513);
                this.liveLabelTextView.invalidate();
                return;
            }
            final int color = this.liveLabelPaint.getColor();
            final int i2 = z3 ? -1163700 : -12761513;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.liveLabelBgColorAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$updateLiveLabel$66(color, i2, z3, valueAnimator2);
                }
            });
            this.liveLabelBgColorAnimator.setDuration(300L);
            this.liveLabelBgColorAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.liveLabelBgColorAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    GroupCallActivity.this.liveLabelBgColorAnimator = null;
                    GroupCallActivity.this.liveLabelPaint.setColor(GroupCallActivity.this.currentCallState == 3 ? -1163700 : -12761513);
                    GroupCallActivity.this.liveLabelTextView.invalidate();
                }
            });
            this.liveLabelBgColorAnimator.start();
        }
    }

    public void updateMuteButton(int i, boolean z) {
        boolean customEndFrame;
        int i2;
        String string;
        boolean z2;
        String string2;
        String string3;
        String string4;
        boolean customEndFrame2;
        String str;
        String str2;
        boolean z3;
        String strM;
        int i3;
        int i4;
        GroupCallRenderersContainer groupCallRenderersContainer = this.renderersContainer;
        boolean z4 = groupCallRenderersContainer != null && groupCallRenderersContainer.inFullscreenMode && (AndroidUtilities.isTablet() || isLandscapeMode == isRtmpLandscapeMode());
        if (!isRtmpStream() && this.muteButtonState == i && z) {
            return;
        }
        if (i != 7) {
            if (i == 6) {
                string3 = LocaleController.getString(R.string.VoipGroupSetReminderShort);
                customEndFrame2 = this.bigMicDrawable.setCustomEndFrame(344);
            } else {
                if (i == 5) {
                    string3 = LocaleController.getString(R.string.VoipGroupStartNowShort);
                    customEndFrame = this.bigMicDrawable.setCustomEndFrame(377);
                } else {
                    if (i == 0) {
                        string3 = LocaleController.getString(R.string.VoipGroupUnmuteShort);
                        string4 = LocaleController.getString(R.string.VoipHoldAndTalk);
                        int i5 = this.muteButtonState;
                        if (i5 == 3) {
                            int customEndFrame3 = this.bigMicDrawable.getCustomEndFrame();
                            if (customEndFrame3 == 136 || customEndFrame3 == 173 || customEndFrame3 == 274 || customEndFrame3 == 311) {
                                customEndFrame = this.bigMicDrawable.setCustomEndFrame(99);
                            } else {
                                string = string4;
                                string2 = string3;
                                customEndFrame = false;
                            }
                            i2 = 3;
                            z2 = false;
                        } else if (i5 == 5) {
                            customEndFrame = this.bigMicDrawable.setCustomEndFrame(404);
                        } else if (i5 == 7) {
                            customEndFrame = this.bigMicDrawable.setCustomEndFrame(376);
                        } else if (i5 == 6) {
                            customEndFrame = this.bigMicDrawable.setCustomEndFrame(237);
                        } else {
                            if (i5 == 2) {
                                customEndFrame = this.bigMicDrawable.setCustomEndFrame(36);
                                string = string4;
                                string2 = string3;
                            } else {
                                customEndFrame = this.bigMicDrawable.setCustomEndFrame(99);
                            }
                            i2 = 3;
                            z2 = false;
                        }
                    } else if (i == 1) {
                        string3 = LocaleController.getString(isConference() ? R.string.VoipTapToMuteConferenceShort : R.string.VoipTapToMuteShort);
                        customEndFrame = this.bigMicDrawable.setCustomEndFrame(this.muteButtonState == 4 ? 99 : 69);
                    } else if (isConference() && i == 2) {
                        string3 = LocaleController.getString(R.string.VoipMutedByAdminShort);
                        customEndFrame = this.bigMicDrawable.setCustomEndFrame(99);
                    } else if (i == 4) {
                        string3 = LocaleController.getString(R.string.VoipMutedTapedForSpeakShort);
                        string4 = LocaleController.getString(R.string.VoipMutedTapedForSpeakInfo);
                        customEndFrame = this.bigMicDrawable.setCustomEndFrame(136);
                    } else {
                        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
                        boolean z5 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || canManageCall()) ? false : true;
                        if (z5) {
                            int i6 = this.muteButtonState;
                            if (i6 == 7) {
                                customEndFrame = this.bigMicDrawable.setCustomEndFrame(311);
                            } else if (i6 == 6) {
                                customEndFrame = this.bigMicDrawable.setCustomEndFrame(274);
                            } else {
                                customEndFrame = i6 == 1 ? this.bigMicDrawable.setCustomEndFrame(173) : this.bigMicDrawable.setCustomEndFrame(136);
                            }
                        } else {
                            int i7 = this.muteButtonState;
                            if (i7 == 5) {
                                customEndFrame = this.bigMicDrawable.setCustomEndFrame(404);
                            } else if (i7 == 7) {
                                customEndFrame = this.bigMicDrawable.setCustomEndFrame(376);
                            } else if (i7 == 6) {
                                customEndFrame = this.bigMicDrawable.setCustomEndFrame(237);
                            } else {
                                if (i7 == 2 || i7 == 4) {
                                    customEndFrame = this.bigMicDrawable.setCustomEndFrame(36);
                                } else {
                                    customEndFrame = this.bigMicDrawable.setCustomEndFrame(99);
                                }
                                i2 = 3;
                                if (i == 3) {
                                    z2 = z5;
                                    string2 = LocaleController.getString(R.string.Connecting);
                                    string = "";
                                } else {
                                    String string5 = LocaleController.getString(R.string.VoipMutedByAdminShort);
                                    string = LocaleController.getString(R.string.VoipMutedTapForSpeak);
                                    z2 = z5;
                                    string2 = string5;
                                }
                            }
                        }
                        i2 = 3;
                        if (i == 3) {
                            z2 = z5;
                            string2 = LocaleController.getString(R.string.Connecting);
                            string = "";
                        } else {
                            String string6 = LocaleController.getString(R.string.VoipMutedByAdminShort);
                            string = LocaleController.getString(R.string.VoipMutedTapForSpeak);
                            z2 = z5;
                            string2 = string6;
                        }
                    }
                    string = string4;
                    string2 = string3;
                    i2 = 3;
                    z2 = false;
                }
                string = "";
                string2 = string3;
                i2 = 3;
                z2 = false;
            }
            if (isRtmpStream() || i == i2 || this.call.isScheduled()) {
                str = string;
            } else {
                string2 = LocaleController.getString(z4 ? R.string.VoipGroupMinimizeStream : R.string.VoipGroupExpandStream);
                customEndFrame = this.animatingToFullscreenExpand != z4;
                this.animatingToFullscreenExpand = z4;
                str = "";
            }
            str2 = string2;
            z3 = customEndFrame;
            if (TextUtils.isEmpty(str)) {
                strM = str2;
            } else {
                strM = zziq.m(str2, " ", str);
            }
            this.muteButton.setContentDescription(strM);
            this.muteButton.setData(0, 0, 0, str2, false, z);
            if (z) {
                if (z3) {
                    if (i == 5) {
                        this.bigMicDrawable.setCurrentFrame(376);
                    } else if (i == 7) {
                        this.bigMicDrawable.setCurrentFrame(173);
                    } else if (i == 6) {
                        this.bigMicDrawable.setCurrentFrame(311);
                    } else if (i == 0) {
                        i4 = this.muteButtonState;
                        if (i4 == 5) {
                            this.bigMicDrawable.setCurrentFrame(376);
                        } else if (i4 == 7) {
                            this.bigMicDrawable.setCurrentFrame(344);
                        } else if (i4 == 6) {
                            this.bigMicDrawable.setCurrentFrame(202);
                        } else if (i4 == 2) {
                            this.bigMicDrawable.setCurrentFrame(0);
                        } else {
                            this.bigMicDrawable.setCurrentFrame(69);
                        }
                    } else if (i != 1 || (this.muteButtonState == 2 && isConference())) {
                        RLottieDrawable rLottieDrawable = this.bigMicDrawable;
                        if (this.muteButtonState == 4) {
                            i3 = 69;
                        } else {
                            i3 = 36;
                        }
                        rLottieDrawable.setCurrentFrame(i3);
                    } else if (i == 4) {
                        this.bigMicDrawable.setCurrentFrame(99);
                    } else if (z2) {
                        int i8 = this.muteButtonState;
                        if (i8 == 7) {
                            this.bigMicDrawable.setCurrentFrame(274);
                        } else if (i8 == 6) {
                            this.bigMicDrawable.setCurrentFrame(237);
                        } else if (i8 == 1) {
                            this.bigMicDrawable.setCurrentFrame(136);
                        } else {
                            this.bigMicDrawable.setCurrentFrame(99);
                        }
                    } else {
                        int i9 = this.muteButtonState;
                        if (i9 == 5) {
                            this.bigMicDrawable.setCurrentFrame(376);
                        } else if (i9 == 7) {
                            this.bigMicDrawable.setCurrentFrame(344);
                        } else if (i9 == 6) {
                            this.bigMicDrawable.setCurrentFrame(202);
                        } else if (i9 == 2 || i9 == 4) {
                            this.bigMicDrawable.setCurrentFrame(0);
                        } else {
                            this.bigMicDrawable.setCurrentFrame(69);
                        }
                    }
                }
                this.muteButtonIcon.playAnimation();
                if (isRtmpStream() || this.call.isScheduled()) {
                    this.expandOrMinimizeButton.setVisibility(8);
                    this.muteButtonIcon.setVisibility(0);
                } else {
                    GroupCallRenderersContainer groupCallRenderersContainer2 = this.renderersContainer;
                    this.expandOrMinimizeButton.setImageResource(groupCallRenderersContainer2 != null && groupCallRenderersContainer2.inFullscreenMode && (AndroidUtilities.isTablet() || isLandscapeMode == isRtmpLandscapeMode()) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                    this.expandOrMinimizeButton.setVisibility(0);
                    this.muteButtonIcon.setVisibility(8);
                }
                this.muteButtonState = i;
            } else {
                this.muteButtonState = i;
                RLottieDrawable rLottieDrawable2 = this.bigMicDrawable;
                rLottieDrawable2.setCurrentFrame(rLottieDrawable2.getCustomEndFrame() - 1, false, true);
                if (isRtmpStream() || this.call.isScheduled()) {
                    this.expandOrMinimizeButton.setVisibility(8);
                    this.muteButtonIcon.setVisibility(0);
                } else {
                    GroupCallRenderersContainer groupCallRenderersContainer3 = this.renderersContainer;
                    this.expandOrMinimizeButton.setImageResource(groupCallRenderersContainer3 != null && groupCallRenderersContainer3.inFullscreenMode && (AndroidUtilities.isTablet() || isLandscapeMode == isRtmpLandscapeMode()) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                    this.expandOrMinimizeButton.setVisibility(0);
                    this.muteButtonIcon.setVisibility(8);
                }
            }
            updateMuteButtonState(z);
        }
        string3 = LocaleController.getString(R.string.VoipGroupCancelReminderShort);
        customEndFrame2 = this.bigMicDrawable.setCustomEndFrame(202);
        customEndFrame = customEndFrame2;
        string = "";
        string2 = string3;
        i2 = 3;
        z2 = false;
        if (isRtmpStream()) {
            str = string;
        } else {
            str = string;
        }
        str2 = string2;
        z3 = customEndFrame;
        if (TextUtils.isEmpty(str)) {
            strM = zziq.m(str2, " ", str);
        } else {
            strM = str2;
        }
        this.muteButton.setContentDescription(strM);
        this.muteButton.setData(0, 0, 0, str2, false, z);
        if (z) {
            if (z3) {
                if (i == 5) {
                    this.bigMicDrawable.setCurrentFrame(376);
                } else if (i == 7) {
                    this.bigMicDrawable.setCurrentFrame(173);
                } else if (i == 6) {
                    this.bigMicDrawable.setCurrentFrame(311);
                } else if (i == 0) {
                    i4 = this.muteButtonState;
                    if (i4 == 5) {
                        this.bigMicDrawable.setCurrentFrame(376);
                    } else if (i4 == 7) {
                        this.bigMicDrawable.setCurrentFrame(344);
                    } else if (i4 == 6) {
                        this.bigMicDrawable.setCurrentFrame(202);
                    } else if (i4 == 2) {
                        this.bigMicDrawable.setCurrentFrame(0);
                    } else {
                        this.bigMicDrawable.setCurrentFrame(69);
                    }
                } else if (i != 1) {
                    RLottieDrawable rLottieDrawable3 = this.bigMicDrawable;
                    if (this.muteButtonState == 4) {
                        i3 = 69;
                    } else {
                        i3 = 36;
                    }
                    rLottieDrawable3.setCurrentFrame(i3);
                } else {
                    RLottieDrawable rLottieDrawable4 = this.bigMicDrawable;
                    if (this.muteButtonState == 4) {
                        i3 = 69;
                    } else {
                        i3 = 36;
                    }
                    rLottieDrawable4.setCurrentFrame(i3);
                }
            }
            this.muteButtonIcon.playAnimation();
            if (isRtmpStream()) {
                this.expandOrMinimizeButton.setVisibility(8);
                this.muteButtonIcon.setVisibility(0);
            } else {
                this.expandOrMinimizeButton.setVisibility(8);
                this.muteButtonIcon.setVisibility(0);
            }
            this.muteButtonState = i;
        } else {
            this.muteButtonState = i;
            RLottieDrawable rLottieDrawable5 = this.bigMicDrawable;
            rLottieDrawable5.setCurrentFrame(rLottieDrawable5.getCustomEndFrame() - 1, false, true);
            if (isRtmpStream()) {
                this.expandOrMinimizeButton.setVisibility(8);
                this.muteButtonIcon.setVisibility(0);
            } else {
                this.expandOrMinimizeButton.setVisibility(8);
                this.muteButtonIcon.setVisibility(0);
            }
        }
        updateMuteButtonState(z);
    }

    private void updateMuteButtonState(boolean z) {
        boolean z2;
        this.muteButton.invalidate();
        WeavingState[] weavingStateArr = this.states;
        int i = this.muteButtonState;
        boolean z3 = false;
        if (weavingStateArr[i] == null) {
            weavingStateArr[i] = new WeavingState(i);
            int i2 = this.muteButtonState;
            if (i2 == 3) {
                this.states[i2].shader = null;
            } else if (isGradientState(i2)) {
                this.states[this.muteButtonState].shader = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient, false), Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient3, false), Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient2, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                int i3 = this.muteButtonState;
                if (i3 == 1) {
                    this.states[i3].shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{Theme.getColor(null, Theme.key_voipgroup_muteButton, false), Theme.getColor(null, Theme.key_voipgroup_muteButton3, false)}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    this.states[i3].shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{Theme.getColor(null, Theme.key_voipgroup_unmuteButton2, false), Theme.getColor(null, Theme.key_voipgroup_unmuteButton, false)}, (float[]) null, Shader.TileMode.CLAMP);
                }
            }
        }
        WeavingState weavingState = this.states[this.muteButtonState];
        WeavingState weavingState2 = this.currentState;
        if (weavingState != weavingState2) {
            this.prevState = weavingState2;
            this.currentState = weavingState;
            if (weavingState2 == null || !z) {
                this.switchProgress = 1.0f;
                this.prevState = null;
            } else {
                this.switchProgress = 0.0f;
            }
        }
        if (!z) {
            WeavingState weavingState3 = this.currentState;
            if (weavingState3 != null) {
                int i4 = weavingState3.currentState;
                boolean z4 = i4 == 1 || i4 == 0;
                z2 = i4 != 3;
                z3 = z4;
            } else {
                z2 = false;
            }
            this.showWavesProgress = z3 ? 1.0f : 0.0f;
            this.showLightingProgress = z2 ? 1.0f : 0.0f;
        }
        this.buttonsContainer.invalidate();
    }

    private void updateRecordCallText() {
        if (this.call == null) {
            return;
        }
        int currentTime = this.accountInstance.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.call;
        int i = currentTime - call.call.record_start_date;
        if (call.recording) {
            this.recordItem.setSubtext(AndroidUtilities.formatDuration(i, false));
        } else {
            this.recordItem.setSubtext(null);
        }
    }

    private void updateScheduleUI(boolean z) {
        float interpolation;
        float f;
        LinearLayout linearLayout = this.scheduleTimerContainer;
        if ((linearLayout == null || this.call != null) && this.scheduleAnimator == null) {
            this.switchToButtonInt2 = 1.0f;
            this.switchToButtonProgress = 1.0f;
            if (linearLayout == null) {
                return;
            }
        }
        if (!z) {
            AndroidUtilities.cancelRunOnUIThread(this.updateSchedeulRunnable);
            this.updateSchedeulRunnable.run();
            ChatObject.Call call = this.call;
            if (call == null || call.isScheduled()) {
                this.listView.setVisibility(4);
            } else {
                this.listView.setVisibility(0);
            }
            if (ChatObject.isChannelOrGiga(this.currentChat)) {
                this.leaveItem.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                this.leaveItem.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
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
        this.scheduleTimerContainer.setAlpha(f3);
        this.scheduleStartInTextView.setAlpha(f);
        this.scheduleStartAtTextView.setAlpha(f);
        this.scheduleTimeTextView.setAlpha(f);
        this.scheduleTimeTextView.setScaleX(interpolation);
        this.scheduleTimeTextView.setScaleY(interpolation);
        this.scheduleButtonTextView.setScaleX(f3);
        this.scheduleButtonTextView.setScaleY(f3);
        this.scheduleButtonTextView.setAlpha(f3);
        this.scheduleInfoTextView.setAlpha(f3);
        this.otherItem.setAlpha(f);
        int i = f3 != 0.0f ? 0 : 4;
        if (i != this.scheduleTimerContainer.getVisibility()) {
            this.scheduleTimerContainer.setVisibility(i);
            this.scheduleButtonTextView.setVisibility(i);
        }
    }

    private void updateSpeakerPhoneIcon(boolean z) {
        VoIPToggleButton voIPToggleButton = this.soundButton;
        if (voIPToggleButton == null || voIPToggleButton.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z2 = false;
        if (sharedInstance == null || isRtmpStream()) {
            this.soundButton.setData(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z);
            this.buttonsContainer.setButtonEnabled(this.soundButton, ChatObject.isPublic(this.currentChat) || (ChatObject.hasAdminRights(this.currentChat) && ChatObject.canAddUsers(this.currentChat)), z);
            this.soundButton.setChecked(true, false);
            return;
        }
        this.buttonsContainer.setButtonEnabled(this.soundButton, true, z);
        boolean z3 = sharedInstance.isBluetoothOn() || sharedInstance.isBluetoothWillOn();
        if (!z3 && sharedInstance.isSpeakerphoneOn()) {
            z2 = true;
        }
        if (z3) {
            this.soundButton.setData(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z);
        } else if (z2) {
            this.soundButton.setData(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z);
        } else if (sharedInstance.isHeadsetPlugged()) {
            this.soundButton.setData(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z);
        } else {
            this.soundButton.setData(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z);
        }
        this.soundButton.setChecked(z2, z);
        int audioOutputIcon = getAudioOutputIcon(getAudioOutputValue());
        if (this.speakerIcon != audioOutputIcon) {
            ImageView imageView = this.speakerImageView;
            this.speakerIcon = audioOutputIcon;
            AndroidUtilities.updateImageViewImageAnimated(imageView, audioOutputIcon);
        }
        if (this.speakerButton.getVisibility() == 0) {
            this.speakerButton.setData(0, -1, 0, 1.0f, true, getAudioOutputName(getAudioOutputValue()), false, z);
            this.speakerButton.setChecked(getAudioOutputActive(getAudioOutputValue()), z);
        }
    }

    public void updateState(boolean z, boolean z2) {
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
        GroupCallRenderersContainer groupCallRenderersContainer;
        int i4;
        int i5;
        int i6;
        boolean z9;
        boolean z10;
        int i7;
        int audioOutputIcon;
        ChatObject.Call call = this.call;
        int i8 = 5;
        if (call == null || call.isScheduled()) {
            if (!canManageCall()) {
                i8 = this.call.call.schedule_start_subscribed ? 7 : 6;
            }
            updateMuteButton(i8, z);
            this.leaveButton.setData(R.drawable.calls_decline, -1, Theme.getColor(null, Theme.key_voipgroup_leaveButton, false), 0.3f, false, LocaleController.getString(R.string.Close), false, false);
            updateScheduleUI(false);
            return;
        }
        updateButtonsVisibility(z);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (!sharedInstance.isConverting() && !sharedInstance.isSwitchingStream()) {
            if (this.creatingServiceTime != 0) {
                j = 0;
                if (Math.abs(SystemClock.elapsedRealtime() - this.creatingServiceTime) > 3000) {
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
                int i9 = i2 + i3 + (z5 ? 4 : 0);
                groupCallRenderersContainer = this.renderersContainer;
                if (groupCallRenderersContainer == null && groupCallRenderersContainer.inFullscreenMode) {
                    i4 = 8;
                } else {
                    i4 = 0;
                }
                int i10 = i9 + i4;
                if (z8) {
                    i5 = 16;
                } else {
                    i5 = 0;
                }
                i6 = i10 + i5;
                if ((this.buttonsVisibility | 2) != (i6 | 2)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.buttonsVisibility = i6;
                if (z5) {
                    this.cameraButton.setData(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), !z3, z);
                    this.cameraButton.setChecked(true, false);
                }
                if (i2 != 0) {
                    this.flipButton.setData(0, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipFlip), false, false);
                    this.flipButton.setChecked(true, false);
                }
                if (z8) {
                    audioOutputIcon = getAudioOutputIcon(getAudioOutputValue());
                    if (this.speakerIcon != audioOutputIcon) {
                        ImageView imageView = this.speakerImageView;
                        this.speakerIcon = audioOutputIcon;
                        AndroidUtilities.updateImageViewImageAnimated(imageView, audioOutputIcon);
                    }
                    z10 = z;
                    this.speakerButton.setData(0, -1, 0, 1.0f, true, getAudioOutputName(getAudioOutputValue()), false, z10);
                    this.speakerButton.setChecked(getAudioOutputActive(getAudioOutputValue()), z10);
                } else {
                    z10 = z;
                }
                VoIPToggleButton voIPToggleButton = this.leaveButton;
                if (isRtmpStream()) {
                    i7 = R.drawable.msg_voiceclose;
                } else {
                    i7 = R.drawable.calls_decline;
                }
                voIPToggleButton.setData(i7, -1, Theme.getColor(null, Theme.key_voipgroup_leaveButton, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
                if (z9 && z6) {
                    updateSpeakerPhoneIcon(false);
                }
                this.cameraButton.showText(true, z10);
                this.flipButton.showText(true, z10);
                this.speakerButton.showText(true, z10);
                updateLiveLabel(z);
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
            int i11 = this.currentCallState;
            if (i11 == 1 || i11 == 2 || i11 == 6 || i11 == 5) {
                cancelMutePress();
                updateMuteButton(3, z);
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
            int i12 = i2 + i3 + (z5 ? 4 : 0);
            groupCallRenderersContainer = this.renderersContainer;
            if (groupCallRenderersContainer == null) {
                i4 = 0;
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (z8) {
                i5 = 16;
            } else {
                i5 = 0;
            }
            i6 = i13 + i5;
            if ((this.buttonsVisibility | 2) != (i6 | 2)) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.buttonsVisibility = i6;
            if (z5) {
                this.cameraButton.setData(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), !z3, z);
                this.cameraButton.setChecked(true, false);
            }
            if (i2 != 0) {
                this.flipButton.setData(0, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipFlip), false, false);
                this.flipButton.setChecked(true, false);
            }
            if (z8) {
                audioOutputIcon = getAudioOutputIcon(getAudioOutputValue());
                if (this.speakerIcon != audioOutputIcon) {
                    ImageView imageView2 = this.speakerImageView;
                    this.speakerIcon = audioOutputIcon;
                    AndroidUtilities.updateImageViewImageAnimated(imageView2, audioOutputIcon);
                }
                z10 = z;
                this.speakerButton.setData(0, -1, 0, 1.0f, true, getAudioOutputName(getAudioOutputValue()), false, z10);
                this.speakerButton.setChecked(getAudioOutputActive(getAudioOutputValue()), z10);
            } else {
                z10 = z;
            }
            VoIPToggleButton voIPToggleButton2 = this.leaveButton;
            if (isRtmpStream()) {
                i7 = R.drawable.msg_voiceclose;
            } else {
                i7 = R.drawable.calls_decline;
            }
            voIPToggleButton2.setData(i7, -1, Theme.getColor(null, Theme.key_voipgroup_leaveButton, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
            if (z9) {
                updateSpeakerPhoneIcon(false);
            }
            this.cameraButton.showText(true, z10);
            this.flipButton.showText(true, z10);
            this.speakerButton.showText(true, z10);
            updateLiveLabel(z);
            if (isRtmpStream()) {
            }
        }
        j = 0;
        if (this.userSwitchObject != null) {
            getUndoView().showWithAction(0L, 37, this.userSwitchObject, this.currentChat, (Runnable) null, (Runnable) null);
            this.userSwitchObject = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
        if (sharedInstance.micSwitching || groupCallParticipant2 == null || groupCallParticipant2.can_self_unmute || !groupCallParticipant2.muted || canManageCall()) {
            boolean zIsMicMute = sharedInstance.isMicMute();
            if (!sharedInstance.micSwitching && z2 && groupCallParticipant2 != null && groupCallParticipant2.muted && !zIsMicMute) {
                cancelMutePress();
                sharedInstance.setMicMute(true, false, false);
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
            sharedInstance.setMicMute(true, false, false);
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
        int i14 = i2 + i3 + (z5 ? 4 : 0);
        groupCallRenderersContainer = this.renderersContainer;
        if (groupCallRenderersContainer == null) {
            i4 = 0;
        } else {
            i4 = 0;
        }
        int i15 = i14 + i4;
        if (z8) {
            i5 = 16;
        } else {
            i5 = 0;
        }
        i6 = i15 + i5;
        if ((this.buttonsVisibility | 2) != (i6 | 2)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.buttonsVisibility = i6;
        if (z5) {
            this.cameraButton.setData(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), !z3, z);
            this.cameraButton.setChecked(true, false);
        }
        if (i2 != 0) {
            this.flipButton.setData(0, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipFlip), false, false);
            this.flipButton.setChecked(true, false);
        }
        if (z8) {
            audioOutputIcon = getAudioOutputIcon(getAudioOutputValue());
            if (this.speakerIcon != audioOutputIcon) {
                ImageView imageView3 = this.speakerImageView;
                this.speakerIcon = audioOutputIcon;
                AndroidUtilities.updateImageViewImageAnimated(imageView3, audioOutputIcon);
            }
            z10 = z;
            this.speakerButton.setData(0, -1, 0, 1.0f, true, getAudioOutputName(getAudioOutputValue()), false, z10);
            this.speakerButton.setChecked(getAudioOutputActive(getAudioOutputValue()), z10);
        } else {
            z10 = z;
        }
        VoIPToggleButton voIPToggleButton3 = this.leaveButton;
        if (isRtmpStream()) {
            i7 = R.drawable.msg_voiceclose;
        } else {
            i7 = R.drawable.calls_decline;
        }
        voIPToggleButton3.setData(i7, -1, Theme.getColor(null, Theme.key_voipgroup_leaveButton, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        if (z9) {
            updateSpeakerPhoneIcon(false);
        }
        this.cameraButton.showText(true, z10);
        this.flipButton.showText(true, z10);
        this.speakerButton.showText(true, z10);
        updateLiveLabel(z);
        if (isRtmpStream()) {
        }
    }

    public void updateSubtitle() {
        boolean z;
        WatchersView watchersView;
        if (this.actionBar == null || this.call == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i = 0;
        for (int i2 = 0; i2 < this.call.currentSpeakingPeers.size(); i2++) {
            long jKeyAt = this.call.currentSpeakingPeers.keyAt(i2);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.currentSpeakingPeers.get(jKeyAt);
            if (!groupCallParticipant.self && !this.renderersContainer.isVisible(groupCallParticipant) && this.visiblePeerIds.get(jKeyAt, 0) != 1) {
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
        if (i > 0) {
            String pluralString = LocaleController.getPluralString("MembersAreSpeakingToast", i);
            int iIndexOf = pluralString.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
            spannableStringBuilder2.replace(iIndexOf, iIndexOf + 3, (CharSequence) spannableStringBuilder);
            this.actionBar.getAdditionalSubtitleTextView().setText(spannableStringBuilder2);
            z = true;
        } else {
            z = false;
        }
        this.actionBar.getSubtitleTextView().setText(LocaleController.formatPluralString(isRtmpStream() ? "ViewersWatching" : "Participants", this.call.call.participants_count + (this.listAdapter.addSelfToCounter() ? 1 : 0), new Object[0]));
        if (isRtmpStream() && (watchersView = this.watchersView) != null) {
            watchersView.setWatchersCount(this.call.call.participants_count);
        }
        if (z != this.drawSpeakingSubtitle) {
            this.drawSpeakingSubtitle = z;
            this.actionBar.invalidate();
            this.actionBar.getSubtitleTextView().setPivotX(0.0f);
            this.actionBar.getSubtitleTextView().setPivotY(this.actionBar.getMeasuredHeight() >> 1);
            this.actionBar.getSubtitleTextView().animate().scaleX(this.drawSpeakingSubtitle ? 0.98f : 1.0f).scaleY(this.drawSpeakingSubtitle ? 0.9f : 1.0f).alpha(this.drawSpeakingSubtitle ? 0.0f : 1.0f).setDuration(150L);
            AndroidUtilities.updateViewVisibilityAnimated(this.actionBar.getAdditionalSubtitleTextView(), this.drawSpeakingSubtitle);
        }
    }

    private void updateTitle(boolean z) {
        ChatObject.Call call = this.call;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.currentChat)) {
                this.titleTextView.setText(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z);
                return;
            } else {
                this.titleTextView.setText(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z);
                return;
            }
        }
        if (TextUtils.isEmpty(call.call.title)) {
            TLRPC.Chat chat = this.currentChat;
            if (chat != null && !chat.title.equals(this.actionBar.getTitle())) {
                if (z) {
                    this.actionBar.setTitleAnimated(this.currentChat.title, true, 180L);
                    this.actionBar.getTitleTextView().setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda34(this, 11));
                } else {
                    this.actionBar.setTitle(this.currentChat.title);
                }
                if (!ChatObject.isChannelOrGiga(this.currentChat)) {
                    this.titleTextView.setText(LocaleController.getString(R.string.VoipGroupVoiceChat), z);
                } else if (isRtmpStream()) {
                    this.titleTextView.setText(this.currentChat.title, z);
                } else {
                    this.titleTextView.setText(LocaleController.getString(R.string.VoipChannelVoiceChat), z);
                }
            } else if (this.currentChat == null) {
                ActionBar actionBar = this.actionBar;
                int i = R.string.ConferenceChat;
                actionBar.setTitle(LocaleController.getString(i));
                this.titleTextView.setText(LocaleController.getString(i), z);
            }
        } else if (!this.call.call.title.equals(this.actionBar.getTitle())) {
            if (z) {
                this.actionBar.setTitleAnimated(this.call.call.title, true, 180L);
                this.actionBar.getTitleTextView().setOnClickListener(new GroupCallActivity$$ExternalSyntheticLambda34(this, 10));
            } else {
                this.actionBar.setTitle(this.call.call.title);
            }
            this.titleTextView.setText(this.call.call.title, z);
        }
        SimpleTextView titleTextView = this.actionBar.getTitleTextView();
        if (!this.call.recording) {
            if (titleTextView.getRightDrawable() != null) {
                titleTextView.setRightDrawable((Drawable) null);
                this.titleTextView.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                this.titleTextView.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() == null) {
            titleTextView.setRightDrawable(new SmallRecordCallDrawable(titleTextView));
            TextView textView = this.titleTextView.getTextView();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new SmallRecordCallDrawable(textView), (Drawable) null);
            TextView nextTextView = this.titleTextView.getNextTextView();
            nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new SmallRecordCallDrawable(nextTextView), (Drawable) null);
        }
    }

    public void updateTopBulletinY() {
        float fMin;
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
        frameLayout.setTranslationY(AndroidUtilities.lerp(((-frameLayout.getTop()) - this.topBulletinContainer.getHeight()) + paddingTop + AndroidUtilities.dp(10.0f), this.actionBar.getY() + (-this.topBulletinContainer.getTop()) + this.actionBar.getHeight(), fMin));
        Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
        if (visibleBulletin == null || visibleBulletin.getLayout() == null || visibleBulletin.getLayout().getParent() == null || visibleBulletin.getLayout().getParent().getParent() != this.topBulletinContainer) {
            return;
        }
        visibleBulletin.getLayout().setTop(fMin > 0.5f);
    }

    private void updateVideoParticipantList() {
        this.visibleVideoParticipants.clear();
        if (!isTabletMode) {
            this.visibleVideoParticipants.addAll(this.call.visibleVideoParticipants);
            return;
        }
        if (this.renderersContainer.inFullscreenMode) {
            this.visibleVideoParticipants.addAll(this.call.visibleVideoParticipants);
            ChatObject.VideoParticipant videoParticipant = this.renderersContainer.fullscreenParticipant;
            if (videoParticipant != null) {
                this.visibleVideoParticipants.remove(videoParticipant);
            }
        }
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public boolean canDismissWithTouchOutside() {
        return !this.renderersContainer.inFullscreenMode;
    }

    public boolean canManageCall() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isConference()) {
            return ChatObject.canManageCalls(this.currentChat);
        }
        ChatObject.Call call = this.call;
        return (call == null || (groupCall = call.call) == null || !groupCall.creator) ? false : true;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        String string;
        ChatObject.VideoParticipant videoParticipant;
        VoIPService sharedInstance;
        int i3;
        int i4;
        String[] emojis = null;
        int i5 = 0;
        if (i == NotificationCenter.groupCallUpdated) {
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
            if (this.creatingServiceTime == 0 && (((i4 = this.muteButtonState) == 7 || i4 == 5 || i4 == 6) && !call2.isScheduled())) {
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
                    intent.putExtra("account", this.accountInstance.getCurrentAccount());
                    intent.putExtra("scheduleDate", this.scheduleStartAt);
                    this.parentActivity.startService(intent);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
                this.creatingServiceTime = SystemClock.elapsedRealtime();
                AndroidUtilities.runOnUIThread(new GroupCallActivity$$ExternalSyntheticLambda28(this, 8), 3000L);
            }
            if (!this.callInitied && VoIPService.getSharedInstance() != null) {
                this.call.addSelfDummyParticipant(false);
                initCreatedGroupCall();
                VoIPService.getSharedInstance().playConnectedSound();
            }
            updateItems();
            int childCount = this.listView.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = this.listView.getChildAt(i6);
                if (childAt instanceof GroupCallUserCell) {
                    ((GroupCallUserCell) childAt).applyParticipantChanges(true);
                }
            }
            if (this.scrimView != null) {
                this.delayedGroupCallUpdated = true;
            } else {
                applyCallParticipantUpdates(true);
            }
            updateSubtitle();
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean z = this.muteButtonState == 4;
            updateState(true, zBooleanValue);
            updateTitle(true);
            if (z && ((i3 = this.muteButtonState) == 1 || i3 == 0)) {
                getUndoView().showWithAction(0L, 38, (Runnable) null);
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
                    ArrayList<TLRPC.Dialog> allDialogs = this.accountInstance.getMessagesController().getAllDialogs();
                    if (allDialogs != null) {
                        int size = allDialogs.size();
                        int i7 = 0;
                        while (i7 < size) {
                            TLRPC.Dialog dialog = allDialogs.get(i7);
                            i7++;
                            if (dialog.id == jLongValue) {
                                i5 = 1;
                                break;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                if (DialogObject.isUserDialog(jLongValue)) {
                    TLRPC.User user = this.accountInstance.getMessagesController().getUser(l2);
                    if (user != null) {
                        if (this.call.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i5 != 0) {
                            getUndoView().showWithAction(0L, 44, user, this.currentChat, (Runnable) null, (Runnable) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-jLongValue));
                if (chat != null) {
                    if (this.call.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i5 != 0) {
                        getUndoView().showWithAction(0L, 44, chat, this.currentChat, (Runnable) null, (Runnable) null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.groupCallSpeakingUsersUpdated) {
            GroupCallRenderersContainer groupCallRenderersContainer = this.renderersContainer;
            if (groupCallRenderersContainer.inFullscreenMode && this.call != null) {
                boolean zAutoPinEnabled = groupCallRenderersContainer.autoPinEnabled();
                ChatObject.Call call3 = this.call;
                if (call3 != null) {
                    GroupCallRenderersContainer groupCallRenderersContainer2 = this.renderersContainer;
                    if (groupCallRenderersContainer2.inFullscreenMode && (videoParticipant = groupCallRenderersContainer2.fullscreenParticipant) != null && call3.participants.get(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                        zAutoPinEnabled = true;
                    }
                }
                if (zAutoPinEnabled) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    for (int i8 = 0; i8 < this.visibleVideoParticipants.size(); i8++) {
                        ChatObject.VideoParticipant videoParticipant3 = this.visibleVideoParticipants.get(i8);
                        if (this.call.currentSpeakingPeers.get(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && this.renderersContainer.fullscreenPeerId != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                                videoParticipant2 = videoParticipant3;
                            }
                        }
                    }
                    if (videoParticipant2 != null) {
                        fullscreenFor(videoParticipant2);
                    }
                }
            }
            this.renderersContainer.setVisibleParticipant(true);
            updateSubtitle();
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
                builderCreateSimpleAlert.setOnDismissListener(new GroupCallActivity$$ExternalSyntheticLambda27(this, 3));
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
                updateItems();
                updateState(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.selfPeer);
            ChatObject.Call call4 = this.call;
            if (call4 == null || chatFull.id != (-peerId) || (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.get(peerId)) == null) {
                return;
            }
            groupCallParticipant2.about = chatFull.about;
            applyCallParticipantUpdates(true);
            AndroidUtilities.updateVisibleRows(this.listView);
            if (this.currentOptionsLayout != null) {
                while (i5 < this.currentOptionsLayout.getChildCount()) {
                    View childAt2 = this.currentOptionsLayout.getChildAt(i5);
                    if ((childAt2 instanceof ActionBarMenuSubItem) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                        ((ActionBarMenuSubItem) childAt2).setTextAndIcon(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant2.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription), TextUtils.isEmpty(groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info);
                    }
                    i5++;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.didLoadChatAdmins) {
            if (((Long) objArr[0]).longValue() == getChatId()) {
                updateItems();
                updateState(isShowing(), false);
                return;
            }
            return;
        }
        if (i == NotificationCenter.applyGroupCallVisibleParticipants) {
            int childCount2 = this.listView.getChildCount();
            long jLongValue2 = ((Long) objArr[0]).longValue();
            while (i5 < childCount2) {
                RecyclerView.ViewHolder viewHolderFindContainingViewHolder = this.listView.findContainingViewHolder(this.listView.getChildAt(i5));
                if (viewHolderFindContainingViewHolder != null) {
                    View view = viewHolderFindContainingViewHolder.itemView;
                    if (view instanceof GroupCallUserCell) {
                        GroupCallUserCell groupCallUserCell = (GroupCallUserCell) view;
                        if (groupCallUserCell.getParticipant() != null) {
                            groupCallUserCell.getParticipant().lastVisibleDate = jLongValue2;
                        }
                    }
                }
                i5++;
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
            AndroidUtilities.updateVisibleRows(this.listView);
            if (this.currentOptionsLayout != null) {
                while (i5 < this.currentOptionsLayout.getChildCount()) {
                    View childAt3 = this.currentOptionsLayout.getChildAt(i5);
                    if ((childAt3 instanceof ActionBarMenuSubItem) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                        ((ActionBarMenuSubItem) childAt3).setTextAndIcon(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant.about) ? R.string.VoipAddBio : R.string.VoipEditBio), TextUtils.isEmpty(groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info);
                    }
                    i5++;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.mainUserInfoChanged) {
            applyCallParticipantUpdates(true);
            AndroidUtilities.updateVisibleRows(this.listView);
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
            AndroidUtilities.updateVisibleRows(this.listView);
            return;
        }
        if (i == NotificationCenter.groupCallScreencastStateChanged) {
            PrivateVideoPreviewDialog privateVideoPreviewDialog = this.previewDialog;
            if (privateVideoPreviewDialog != null) {
                privateVideoPreviewDialog.dismiss(true, true);
            }
            updateItems();
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
    public void lambda$showGiftOfferSheet$15() {
        this.parentActivity.removeOnUserLeaveHintListener(this.onUserLeaveHintListener);
        this.parentActivity.setRequestedOrientation(-1);
        groupCallUiVisible = false;
        GroupVoipInviteAlert groupVoipInviteAlert = this.groupVoipInviteAlert;
        if (groupVoipInviteAlert != null) {
            groupVoipInviteAlert.lambda$showGiftOfferSheet$15();
        }
        this.delayedGroupCallUpdated = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.needShowAlert);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.didLoadChatAdmins);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.applyGroupCallVisibleParticipants);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.mainUserInfoChanged);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallScreencastStateChanged);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallSpeakingUsersUpdated);
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.conferenceEmojiUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
        super.lambda$showGiftOfferSheet$15();
    }

    @Override
    public void dismissInternal() {
        if (this.renderersContainer != null) {
            if (this.requestFullscreenListener != null) {
                this.listView.getViewTreeObserver().removeOnPreDrawListener(this.requestFullscreenListener);
                this.requestFullscreenListener = null;
            }
            this.attachedRenderersTmp.clear();
            this.attachedRenderersTmp.addAll(this.attachedRenderers);
            for (int i = 0; i < this.attachedRenderersTmp.size(); i++) {
                this.attachedRenderersTmp.get(i).saveThumb();
                this.renderersContainer.removeView(this.attachedRenderersTmp.get(i));
                this.attachedRenderersTmp.get(i).release();
                this.attachedRenderersTmp.get(i).forceDetach(true);
            }
            this.attachedRenderers.clear();
            if (this.renderersContainer.getParent() != null) {
                this.attachedRenderers.clear();
                this.containerView.removeView(this.renderersContainer);
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
        PipSource pipSource = this.pipSource;
        if (pipSource != null) {
            pipSource.destroy();
            this.pipSource = null;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
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
                getUndoView().showWithAction(0L, z ? 42 : 43, (Runnable) null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void enableCamera() {
        this.cameraButton.callOnClick();
    }

    public void fullscreenFor(final ChatObject.VideoParticipant videoParticipant) {
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null) {
            this.parentActivity.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() == null || this.renderersContainer.isAnimating()) {
            return;
        }
        if (!isTabletMode) {
            if (this.requestFullscreenListener != null) {
                this.listView.getViewTreeObserver().removeOnPreDrawListener(this.requestFullscreenListener);
                this.requestFullscreenListener = null;
            }
            if (videoParticipant != null) {
                if (this.fullscreenUsersListView.getVisibility() == 0) {
                    this.renderersContainer.requestFullscreen(videoParticipant);
                    AndroidUtilities.updateVisibleRows(this.fullscreenUsersListView);
                    return;
                }
                this.fullscreenUsersListView.setVisibility(0);
                this.fullscreenAdapter.update(false, this.fullscreenUsersListView);
                this.delayedGroupCallUpdated = true;
                if (!this.renderersContainer.inFullscreenMode) {
                    this.fullscreenAdapter.scrollTo(videoParticipant, this.fullscreenUsersListView);
                }
                ViewTreeObserver viewTreeObserver = this.listView.getViewTreeObserver();
                ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public boolean onPreDraw() {
                        GroupCallActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                        GroupCallActivity groupCallActivity = GroupCallActivity.this;
                        groupCallActivity.requestFullscreenListener = null;
                        groupCallActivity.renderersContainer.requestFullscreen(videoParticipant);
                        AndroidUtilities.updateVisibleRows(GroupCallActivity.this.fullscreenUsersListView);
                        ((BottomSheet) GroupCallActivity.this).containerView.requestLayout();
                        return false;
                    }
                };
                this.requestFullscreenListener = onPreDrawListener;
                viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
                return;
            }
            if (this.listView.getVisibility() == 0) {
                ViewTreeObserver viewTreeObserver2 = this.listView.getViewTreeObserver();
                ViewTreeObserver.OnPreDrawListener onPreDrawListener2 = new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public boolean onPreDraw() {
                        GroupCallActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                        GroupCallActivity.this.renderersContainer.requestFullscreen(null);
                        AndroidUtilities.updateVisibleRows(GroupCallActivity.this.fullscreenUsersListView);
                        ((BottomSheet) GroupCallActivity.this).containerView.requestLayout();
                        return false;
                    }
                };
                this.requestFullscreenListener = onPreDrawListener2;
                viewTreeObserver2.addOnPreDrawListener(onPreDrawListener2);
                return;
            }
            this.listView.setVisibility(0);
            applyCallParticipantUpdates(false);
            this.delayedGroupCallUpdated = true;
            ViewTreeObserver viewTreeObserver3 = this.listView.getViewTreeObserver();
            ViewTreeObserver.OnPreDrawListener onPreDrawListener3 = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public boolean onPreDraw() {
                    GroupCallActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                    GroupCallActivity.this.renderersContainer.requestFullscreen(null);
                    AndroidUtilities.updateVisibleRows(GroupCallActivity.this.fullscreenUsersListView);
                    ((BottomSheet) GroupCallActivity.this).containerView.requestLayout();
                    return false;
                }
            };
            this.requestFullscreenListener = onPreDrawListener3;
            viewTreeObserver3.addOnPreDrawListener(onPreDrawListener3);
            return;
        }
        if (this.requestFullscreenListener != null) {
            this.listView.getViewTreeObserver().removeOnPreDrawListener(this.requestFullscreenListener);
            this.requestFullscreenListener = null;
        }
        ArrayList arrayList = new ArrayList();
        if (videoParticipant == null) {
            this.attachedRenderersTmp.clear();
            this.attachedRenderersTmp.addAll(this.attachedRenderers);
            for (int i = 0; i < this.attachedRenderersTmp.size(); i++) {
                final GroupCallMiniTextureView groupCallMiniTextureView = this.attachedRenderersTmp.get(i);
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
                    arrayList.add(groupCallMiniTextureView.participant);
                    groupCallMiniTextureView.forceDetach(false);
                    groupCallMiniTextureView.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (groupCallMiniTextureView.getParent() != null) {
                                ((BottomSheet) GroupCallActivity.this).containerView.removeView(groupCallMiniTextureView);
                            }
                        }
                    });
                }
            }
            this.listViewVideoVisibility = false;
            this.tabletGridAdapter.setVisibility(this.tabletVideoGridView, true, true);
        } else {
            this.attachedRenderersTmp.clear();
            this.attachedRenderersTmp.addAll(this.attachedRenderers);
            for (int i2 = 0; i2 < this.attachedRenderersTmp.size(); i2++) {
                final GroupCallMiniTextureView groupCallMiniTextureView2 = this.attachedRenderersTmp.get(i2);
                if (groupCallMiniTextureView2.tabletGridView != null && ((videoParticipant2 = groupCallMiniTextureView2.participant) == null || !videoParticipant2.equals(videoParticipant))) {
                    arrayList.add(groupCallMiniTextureView2.participant);
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
                        public void onAnimationEnd(Animator animator) {
                            if (groupCallMiniTextureView2.getParent() != null) {
                                ((BottomSheet) GroupCallActivity.this).containerView.removeView(groupCallMiniTextureView2);
                            }
                        }
                    });
                }
            }
            this.listViewVideoVisibility = true;
            this.tabletGridAdapter.setVisibility(this.tabletVideoGridView, false, false);
            if (!arrayList.isEmpty()) {
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda2(9, this, arrayList));
            }
        }
        final boolean z = !this.renderersContainer.inFullscreenMode;
        ViewTreeObserver viewTreeObserver4 = this.listView.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener4 = new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                GroupCallActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                groupCallActivity.requestFullscreenListener = null;
                groupCallActivity.renderersContainer.requestFullscreen(videoParticipant);
                if (GroupCallActivity.this.delayedGroupCallUpdated) {
                    GroupCallActivity.this.delayedGroupCallUpdated = false;
                    GroupCallActivity.this.applyCallParticipantUpdates(true);
                    if (z && videoParticipant != null) {
                        GroupCallActivity.this.listView.scrollToPosition(0);
                    }
                    GroupCallActivity.this.delayedGroupCallUpdated = true;
                } else {
                    GroupCallActivity.this.applyCallParticipantUpdates(true);
                }
                ((BottomSheet) GroupCallActivity.this).containerView.requestLayout();
                return false;
            }
        };
        this.requestFullscreenListener = onPreDrawListener4;
        viewTreeObserver4.addOnPreDrawListener(onPreDrawListener4);
    }

    public boolean getAudioOutputActive(int i) {
        return i != 1;
    }

    public int getAudioOutputIcon(int i) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return (sharedInstance == null || !sharedInstance.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
    }

    public String getAudioOutputName(int i) {
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

    public int getAudioOutputToastIcon(int i) {
        if (i == 2) {
            return R.drawable.msg_voice_bluetooth;
        }
        if (i == 0) {
            return R.drawable.msg_voice_speaker;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
    }

    public String getAudioOutputToastText(int i) {
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

    public int getAudioOutputValue() {
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

    public long getChatId() {
        TLRPC.Chat chat = this.currentChat;
        if (chat == null) {
            return 0L;
        }
        return chat.id;
    }

    public LinearLayout getMenuItemsContainer() {
        return this.menuItemsContainer;
    }

    public int getNextAudioOutputValue() {
        if (getAudioOutputActive(getAudioOutputValue())) {
            return 1;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return (sharedInstance == null || !sharedInstance.isBluetoothHeadsetConnected()) ? 0 : 2;
    }

    public LaunchActivity getParentActivity() {
        return this.parentActivity;
    }

    public View getScrimView() {
        return this.scrimView;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return new ArrayList<>();
    }

    public UndoView getUndoView() {
        if (!isTabletMode) {
            GroupCallRenderersContainer groupCallRenderersContainer = this.renderersContainer;
            if (groupCallRenderersContainer.inFullscreenMode) {
                return groupCallRenderersContainer.getUndoView();
            }
        }
        if (this.undoView[0].getVisibility() == 0) {
            UndoView[] undoViewArr = this.undoView;
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.hide(true, 2);
            this.containerView.removeView(this.undoView[0]);
            this.containerView.addView(this.undoView[0]);
        }
        return this.undoView[0];
    }

    public void invalidateActionBarAlpha() {
        ActionBar actionBar = this.actionBar;
        actionBar.setAlpha((1.0f - this.renderersContainer.progressToFullscreenMode) * (actionBar.getTag() != null ? 1.0f : 0.0f));
    }

    public void invalidateScrollOffsetY() {
        setScrollOffsetY(this.scrollOffsetY);
    }

    public boolean isConference() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return sharedInstance != null && sharedInstance.isConference();
    }

    public boolean isRtmpLandscapeMode() {
        return isRtmpStream() && !this.call.visibleVideoParticipants.isEmpty() && (this.call.visibleVideoParticipants.get(0).aspectRatio == 0.0f || this.call.visibleVideoParticipants.get(0).aspectRatio >= 1.0f);
    }

    public boolean isRtmpStream() {
        ChatObject.Call call = this.call;
        return call != null && call.call.rtmp_stream;
    }

    public void makeFocusable(BottomSheet bottomSheet, AlertDialog alertDialog, EditTextBoldCursor editTextBoldCursor, boolean z) {
        if (this.enterEventSent) {
            return;
        }
        BaseFragment baseFragment = (BaseFragment) Theme.ResourcesProvider.CC.m((ActionBarLayout) this.parentActivity.getActionBarLayout(), 1, ((ActionBarLayout) this.parentActivity.getActionBarLayout()).getFragmentStack());
        if (baseFragment instanceof ChatActivity) {
            boolean zNeedEnterText = ((ChatActivity) baseFragment).needEnterText();
            this.enterEventSent = true;
            this.anyEnterEventSent = true;
            AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda3(bottomSheet, editTextBoldCursor, z, alertDialog, 9), zNeedEnterText ? 200L : 0L);
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
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda119(2, editTextBoldCursor), 100L);
        }
    }

    @Override
    public void onAudioSettingsChanged() {
        updateSpeakerPhoneIcon(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            setMicAmplitude(0.0f);
        }
        if (this.listView.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(this.listView);
        }
        if (this.fullscreenUsersListView.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(this.fullscreenUsersListView);
        }
        this.attachedRenderersTmp.clear();
        this.attachedRenderersTmp.addAll(this.attachedRenderers);
        for (int i = 0; i < this.attachedRenderersTmp.size(); i++) {
            this.attachedRenderersTmp.get(i).updateAttachState(true);
        }
    }

    @Override
    public void lambda$openCrafting$8() {
        PrivateVideoPreviewDialog privateVideoPreviewDialog = this.previewDialog;
        if (privateVideoPreviewDialog != null) {
            privateVideoPreviewDialog.dismiss(false, false);
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
    public void onCameraSwitch(boolean z) {
        this.attachedRenderersTmp.clear();
        this.attachedRenderersTmp.addAll(this.attachedRenderers);
        for (int i = 0; i < this.attachedRenderersTmp.size(); i++) {
            this.attachedRenderersTmp.get(i).updateAttachState(true);
        }
        PrivateVideoPreviewDialog privateVideoPreviewDialog = this.previewDialog;
        if (privateVideoPreviewDialog != null) {
            privateVideoPreviewDialog.update();
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.parentActivity.addOnUserLeaveHintListener(this.onUserLeaveHintListener);
    }

    @Override
    public boolean onCustomOpenAnimation() {
        groupCallUiVisible = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        GroupCallPip.updateVisibility(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 2) {
            checkGroupCallUiPositions_MessagesList();
            checkGroupCallUiPositions_ButtonsList();
            checkGroupCallUiPositions_FullscreenUsersList();
            checkGroupCallUiAlpha_ButtonsList();
            this.renderersContainer.setProgressToHideUi(f);
            this.fullscreenUsersListView.invalidate();
            this.containerView.invalidate();
            this.buttonsContainer.invalidate();
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
            this.callMessageEnterUnderContainer.invalidate();
            this.callMessageEnterView.invalidate();
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

    public void onPause() {
        paused = true;
        this.attachedRenderersTmp.clear();
        this.attachedRenderersTmp.addAll(this.attachedRenderers);
        for (int i = 0; i < this.attachedRenderersTmp.size(); i++) {
            this.attachedRenderersTmp.get(i).updateAttachState(false);
        }
        this.sizeNotifierFrameLayout.onPause();
        this.callMessageEnterView.onPause();
    }

    public void onResume() {
        paused = false;
        this.listAdapter.notifyDataSetChanged();
        if (this.fullscreenUsersListView.getVisibility() == 0) {
            this.fullscreenAdapter.update(false, this.fullscreenUsersListView);
        }
        if (isTabletMode) {
            this.tabletGridAdapter.update(false, this.tabletVideoGridView);
        }
        this.attachedRenderersTmp.clear();
        this.attachedRenderersTmp.addAll(this.attachedRenderers);
        for (int i = 0; i < this.attachedRenderersTmp.size(); i++) {
            this.attachedRenderersTmp.get(i).updateAttachState(true);
        }
        this.sizeNotifierFrameLayout.onResume();
        this.callMessageEnterView.onResume();
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
    public void onStateChanged(int i) {
        this.currentCallState = i;
        updateState(isShowing(), false);
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
        VoIPService.StateListener.CC.$default$onVideoAvailableChange(this, z);
    }

    public void openShareConferenceLink() {
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new LinkManager$$ExternalSyntheticLambda0(this, alertDialog, exportgroupcallinvite, 18));
    }

    public void setAudioOutputValue(int i) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        sharedInstance.setAudioOutput(i);
        this.cacheAudioOutputValue = Integer.valueOf(i);
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    public void setOldRows(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
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

    @Override
    public void show() {
        super.show();
        RTMPStreamPipOverlay rTMPStreamPipOverlay = RTMPStreamPipOverlay.instance;
        if (rTMPStreamPipOverlay.isVisible) {
            rTMPStreamPipOverlay.dismissInternal$1();
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        public static final int VIEW_TYPE_CALL_INVITED = 2;
        public static final int VIEW_TYPE_ENCRYPTION = 7;
        public static final int VIEW_TYPE_GRID = 4;
        public static final int VIEW_TYPE_INVITE_MEMBERS = 0;
        public static final int VIEW_TYPE_LAST_PADDING = 3;
        public static final int VIEW_TYPE_PARTICIPANT = 1;
        public static final int VIEW_TYPE_VIDEO_GRID_DIVIDER = 5;
        public static final int VIEW_TYPE_VIDEO_NOT_AVAILABLE = 6;
        private int addMemberRow;
        private int conferenceAddPeopleRow;
        private int conferenceShareLinkRow;
        private int encryptionRow;
        private boolean hasSelfUser;
        private int invitedEndRow;
        private int invitedStartRow;
        private int lastRow;
        private Context mContext;
        private int rowsCount;
        private int shadyJoinEndRow;
        private int shadyJoinStartRow;
        private int shadyLeftEndRow;
        private int shadyLeftStartRow;
        private int usersEndRow;
        private int usersStartRow;
        private int usersVideoGridEndRow;
        private int usersVideoGridStartRow;
        private int videoGridDividerRow;
        private int videoNotAvailableRow;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        public void updateRows() {
            TLRPC.Chat chat;
            TLRPC.Chat chat2;
            ChatObject.Call call = GroupCallActivity.this.call;
            if (call == null || call.isScheduled() || GroupCallActivity.this.delayedGroupCallUpdated) {
                return;
            }
            this.addMemberRow = -1;
            this.conferenceAddPeopleRow = -1;
            this.conferenceShareLinkRow = -1;
            this.videoGridDividerRow = -1;
            this.videoNotAvailableRow = -1;
            this.encryptionRow = -1;
            this.rowsCount = 0;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            this.hasSelfUser = groupCallActivity.call.participants.indexOfKey(MessageObject.getPeerId(groupCallActivity.selfPeer)) >= 0;
            if (GroupCallActivity.this.isConference()) {
                int i = this.rowsCount;
                this.rowsCount = i + 1;
                this.encryptionRow = i;
            }
            int i2 = this.rowsCount;
            this.usersVideoGridStartRow = i2;
            int size = GroupCallActivity.this.visibleVideoParticipants.size() + i2;
            this.rowsCount = size;
            this.usersVideoGridEndRow = size;
            if (GroupCallActivity.this.visibleVideoParticipants.size() > 0) {
                int i3 = this.rowsCount;
                this.rowsCount = i3 + 1;
                this.videoGridDividerRow = i3;
            }
            if (!GroupCallActivity.this.visibleVideoParticipants.isEmpty() && GroupCallActivity.this.canManageCall()) {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                if (groupCallActivity2.call.call.participants_count > groupCallActivity2.accountInstance.getMessagesController().groupCallVideoMaxParticipants) {
                    int i4 = this.rowsCount;
                    this.rowsCount = i4 + 1;
                    this.videoNotAvailableRow = i4;
                }
            }
            this.usersStartRow = this.rowsCount;
            if (!GroupCallActivity.this.isRtmpStream()) {
                this.rowsCount = GroupCallActivity.this.call.visibleParticipants.size() + this.rowsCount;
            }
            this.usersEndRow = this.rowsCount;
            if (GroupCallActivity.this.call.invitedUsers.isEmpty() || GroupCallActivity.this.isRtmpStream()) {
                this.invitedStartRow = -1;
                this.invitedEndRow = -1;
            } else {
                int i5 = this.rowsCount;
                this.invitedStartRow = i5;
                int size2 = GroupCallActivity.this.call.invitedUsers.size() + i5;
                this.rowsCount = size2;
                this.invitedEndRow = size2;
            }
            if (GroupCallActivity.this.call.shadyJoinParticipants.isEmpty() || GroupCallActivity.this.isRtmpStream()) {
                this.shadyJoinStartRow = -1;
                this.shadyJoinEndRow = -1;
            } else {
                int i6 = this.rowsCount;
                this.shadyJoinStartRow = i6;
                int size3 = GroupCallActivity.this.call.shadyJoinParticipants.size() + i6;
                this.rowsCount = size3;
                this.shadyJoinEndRow = size3;
            }
            if (GroupCallActivity.this.call.shadyLeftParticipants.isEmpty() || GroupCallActivity.this.isRtmpStream()) {
                this.shadyLeftStartRow = -1;
                this.shadyLeftEndRow = -1;
            } else {
                int i7 = this.rowsCount;
                this.shadyLeftStartRow = i7;
                int size4 = GroupCallActivity.this.call.shadyLeftParticipants.size() + i7;
                this.rowsCount = size4;
                this.shadyLeftEndRow = size4;
            }
            if (GroupCallActivity.this.isConference()) {
                int i8 = this.rowsCount;
                this.conferenceAddPeopleRow = i8;
                this.rowsCount = i8 + 2;
                this.conferenceShareLinkRow = i8 + 1;
            } else if (!GroupCallActivity.this.isRtmpStream() && (((!ChatObject.isChannel(GroupCallActivity.this.currentChat) || ((chat2 = GroupCallActivity.this.currentChat) != null && chat2.megagroup)) && ChatObject.canWriteToChat(GroupCallActivity.this.currentChat)) || (ChatObject.isChannel(GroupCallActivity.this.currentChat) && (chat = GroupCallActivity.this.currentChat) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
                int i9 = this.rowsCount;
                this.rowsCount = i9 + 1;
                this.addMemberRow = i9;
            }
            int i10 = this.rowsCount;
            this.rowsCount = i10 + 1;
            this.lastRow = i10;
        }

        public boolean addSelfToCounter() {
            if (GroupCallActivity.this.isRtmpStream() || this.hasSelfUser || VoIPService.getSharedInstance() == null) {
                return false;
            }
            return !VoIPService.getSharedInstance().isJoined();
        }

        @Override
        public int getItemCount() {
            return this.rowsCount;
        }

        @Override
        public int getItemViewType(int i) {
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
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return (itemViewType == 3 || itemViewType == 4 || itemViewType == 5 || itemViewType == 6) ? false : true;
        }

        @Override
        public void notifyDataSetChanged() {
            updateRows();
            super.notifyDataSetChanged();
        }

        @Override
        public void lambda$onBindViewHolder$31(int i) {
            updateRows();
            super.lambda$onBindViewHolder$31(i);
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
        public void notifyItemRangeChanged(int i, int i2) {
            updateRows();
            super.notifyItemRangeChanged(i, i2);
        }

        @Override
        public void notifyItemRangeInserted(int i, int i2) {
            updateRows();
            super.notifyItemRangeInserted(i, i2);
        }

        @Override
        public void notifyItemRangeRemoved(int i, int i2) {
            updateRows();
            super.notifyItemRangeRemoved(i, i2);
        }

        @Override
        public void notifyItemRemoved(int i) {
            updateRows();
            super.notifyItemRemoved(i);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.Chat chat;
            TLRPC.GroupCallParticipant groupCallParticipant;
            TLRPC.GroupCallParticipant groupCallParticipant2;
            AvatarUpdaterDelegate avatarUpdaterDelegate;
            ChatObject.Call.InvitedUser invitedUser;
            Object obj;
            boolean z;
            boolean z2;
            ?? r10;
            boolean z3;
            Object obj2;
            ChatObject.VideoParticipant videoParticipant;
            ChatObject.VideoParticipant videoParticipant2;
            AvatarUpdaterDelegate avatarUpdaterDelegate2;
            int itemViewType = viewHolder.getItemViewType();
            Object obj3 = null;
            if (itemViewType == 0) {
                GroupCallTextCell groupCallTextCell = (GroupCallTextCell) viewHolder.itemView;
                if (i == this.conferenceAddPeopleRow) {
                    int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, ((BottomSheet) GroupCallActivity.this).resourcesProvider);
                    groupCallTextCell.setColors(color, color);
                    groupCallTextCell.setTextAndIcon(LocaleController.getString(R.string.VoipConferenceAddPeople), R.drawable.msg_contact_add, true);
                    return;
                } else {
                    if (i == this.conferenceShareLinkRow) {
                        int color2 = Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, ((BottomSheet) GroupCallActivity.this).resourcesProvider);
                        groupCallTextCell.setColors(color2, color2);
                        groupCallTextCell.setTextAndIcon(LocaleController.getString(R.string.VoipConferenceShareLink), R.drawable.msg_link2, false);
                        return;
                    }
                    int offsetColor = AndroidUtilities.getOffsetColor(Theme.getColor(null, Theme.key_voipgroup_lastSeenTextUnscrolled, false), Theme.getColor(null, Theme.key_voipgroup_lastSeenText, false), GroupCallActivity.this.actionBar.getTag() != null ? 1.0f : 0.0f, 1.0f);
                    groupCallTextCell.setColors(offsetColor, offsetColor);
                    if (!ChatObject.isChannel(GroupCallActivity.this.currentChat) || (chat = GroupCallActivity.this.currentChat) == null || chat.megagroup || !ChatObject.isPublic(chat)) {
                        groupCallTextCell.setTextAndIcon(LocaleController.getString(R.string.VoipGroupInviteMember), R.drawable.msg_contact_add, false);
                        return;
                    } else {
                        groupCallTextCell.setTextAndIcon(LocaleController.getString(R.string.VoipGroupShareLink), R.drawable.msg_link, false);
                        return;
                    }
                }
            }
            if (itemViewType == 1) {
                ?? r8 = (GroupCallUserCell) viewHolder.itemView;
                int i2 = i - this.usersStartRow;
                if (GroupCallActivity.this.delayedGroupCallUpdated) {
                    if (i2 < 0 || i2 >= GroupCallActivity.this.oldParticipants.size()) {
                        groupCallParticipant2 = null;
                    } else {
                        groupCallParticipant = (TLRPC.GroupCallParticipant) GroupCallActivity.this.oldParticipants.get(i2);
                        groupCallParticipant2 = groupCallParticipant;
                    }
                } else if (i2 < 0 || i2 >= GroupCallActivity.this.call.visibleParticipants.size()) {
                    groupCallParticipant2 = null;
                } else {
                    groupCallParticipant = GroupCallActivity.this.call.visibleParticipants.get(i2);
                    groupCallParticipant2 = groupCallParticipant;
                }
                if (groupCallParticipant2 != null) {
                    long peerId = MessageObject.getPeerId(groupCallParticipant2.peer);
                    long peerId2 = MessageObject.getPeerId(GroupCallActivity.this.selfPeer);
                    if (peerId == peerId2 && (avatarUpdaterDelegate = GroupCallActivity.this.avatarUpdaterDelegate) != null) {
                        obj3 = avatarUpdaterDelegate.avatar;
                    }
                    ?? r14 = obj3;
                    float f = r14 != 0 ? GroupCallActivity.this.avatarUpdaterDelegate.uploadingProgress : 1.0f;
                    boolean z4 = r8.getParticipant() != null && MessageObject.getPeerId(r8.getParticipant().peer) == peerId;
                    r8.setData(GroupCallActivity.this.accountInstance, groupCallParticipant2, GroupCallActivity.this.call, peerId2, r14, z4);
                    r8.setUploadProgress(f, z4);
                    return;
                }
                return;
            }
            if (itemViewType != 2) {
                if (itemViewType != 4) {
                    return;
                }
                GroupCallGridCell groupCallGridCell = (GroupCallGridCell) viewHolder.itemView;
                ChatObject.VideoParticipant participant = groupCallGridCell.getParticipant();
                int i3 = i - this.usersVideoGridStartRow;
                groupCallGridCell.spanCount = GroupCallActivity.this.spanSizeLookup.getSpanSize(i);
                if (GroupCallActivity.this.delayedGroupCallUpdated) {
                    if (i3 < 0 || i3 >= GroupCallActivity.this.oldVideoParticipants.size()) {
                        videoParticipant2 = null;
                    } else {
                        videoParticipant = (ChatObject.VideoParticipant) GroupCallActivity.this.oldVideoParticipants.get(i3);
                        videoParticipant2 = videoParticipant;
                    }
                } else if (i3 < 0 || i3 >= GroupCallActivity.this.visibleVideoParticipants.size()) {
                    videoParticipant2 = null;
                } else {
                    videoParticipant = GroupCallActivity.this.visibleVideoParticipants.get(i3);
                    videoParticipant2 = videoParticipant;
                }
                if (videoParticipant2 != null) {
                    long peerId3 = MessageObject.getPeerId(videoParticipant2.participant.peer);
                    long peerId4 = MessageObject.getPeerId(GroupCallActivity.this.selfPeer);
                    if (peerId3 == peerId4 && (avatarUpdaterDelegate2 = GroupCallActivity.this.avatarUpdaterDelegate) != null) {
                        obj3 = avatarUpdaterDelegate2.avatar;
                    }
                    if (obj3 != null) {
                        float f2 = GroupCallActivity.this.avatarUpdaterDelegate.uploadingProgress;
                    }
                    if (groupCallGridCell.getParticipant() != null) {
                        groupCallGridCell.getParticipant().equals(videoParticipant2);
                    }
                    groupCallGridCell.setData(GroupCallActivity.this.accountInstance, videoParticipant2, GroupCallActivity.this.call, peerId4);
                }
                if (participant == null || participant.equals(videoParticipant2) || !groupCallGridCell.attached || groupCallGridCell.getRenderer() == null) {
                    return;
                }
                GroupCallActivity.this.attachRenderer(groupCallGridCell, false);
                GroupCallActivity.this.attachRenderer(groupCallGridCell, true);
                return;
            }
            ?? r9 = (GroupCallInvitedCell) viewHolder.itemView;
            int i4 = i - this.invitedStartRow;
            int i5 = i - this.shadyJoinStartRow;
            if (i5 < 0 || i5 >= GroupCallActivity.this.call.shadyJoinParticipants.size()) {
                int i6 = i - this.shadyLeftStartRow;
                if (i6 < 0 || i6 >= GroupCallActivity.this.call.shadyLeftParticipants.size()) {
                    if (!GroupCallActivity.this.delayedGroupCallUpdated) {
                        if (i4 >= 0 && i4 < GroupCallActivity.this.call.invitedUsers.size() && (invitedUser = GroupCallActivity.this.call.invitedUsersMessageIds.get((obj3 = (Long) GroupCallActivity.this.call.invitedUsers.get(i4)))) != null && invitedUser.isCalling()) {
                            obj = obj3;
                            z = true;
                        }
                        z2 = false;
                        obj2 = obj;
                    } else if (i4 >= 0 && i4 < GroupCallActivity.this.oldInvited.size()) {
                        obj3 = (Long) GroupCallActivity.this.oldInvited.get(i4);
                    }
                    obj = obj3;
                    z = false;
                    z2 = false;
                    obj2 = obj;
                } else {
                    r10 = GroupCallActivity.this.call.shadyLeftParticipants.get(i - this.shadyLeftStartRow);
                    z = false;
                    z2 = false;
                    z3 = true;
                }
                if (r10 != 0) {
                    r9.setData(((BottomSheet) GroupCallActivity.this).currentAccount, r10, z, z2, z3);
                }
            }
            obj2 = (Long) GroupCallActivity.this.call.shadyJoinParticipants.get(i - this.shadyJoinStartRow);
            z = false;
            z2 = true;
            z3 = false;
            r10 = obj2;
            if (r10 != 0) {
                r9.setData(((BottomSheet) GroupCallActivity.this).currentAccount, r10, z, z2, z3);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View callEncryptionCell;
            View view;
            boolean z = false;
            if (i == 0) {
                callEncryptionCell = new GroupCallTextCell(this.mContext) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        if (AndroidUtilities.isTablet()) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i2)), 1073741824), i3);
                        } else {
                            super.onMeasure(i2, i3);
                        }
                    }
                };
            } else if (i == 1) {
                callEncryptionCell = new GroupCallUserCell(this.mContext) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        if (AndroidUtilities.isTablet()) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i2)), 1073741824), i3);
                        } else {
                            super.onMeasure(i2, i3);
                        }
                    }

                    @Override
                    public void lambda$new$5(GroupCallUserCell groupCallUserCell) {
                        GroupCallActivity.this.showMenuForCell(groupCallUserCell);
                    }
                };
            } else if (i != 2) {
                if (i == 4) {
                    view = new GroupCallGridCell(this.mContext, z) {
                        @Override
                        public void onAttachedToWindow() {
                            super.onAttachedToWindow();
                            if (GroupCallActivity.this.listView.getVisibility() == 0 && GroupCallActivity.this.listViewVideoVisibility) {
                                GroupCallActivity.this.attachRenderer(this, true);
                            }
                        }

                        @Override
                        public void onDetachedFromWindow() {
                            super.onDetachedFromWindow();
                            GroupCallActivity.this.attachRenderer(this, false);
                        }
                    };
                } else if (i == 5) {
                    callEncryptionCell = new View(this.mContext) {
                        @Override
                        public void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(GroupCallActivity.isLandscapeMode ? 0.0f : 8.0f), 1073741824));
                        }
                    };
                } else if (i == 6) {
                    TextView textView = new TextView(this.mContext);
                    textView.setTextColor(-8682615);
                    textView.setTextSize(1, 13.0f);
                    textView.setGravity(1);
                    textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
                    if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                        textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", GroupCallActivity.this.accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                        view = textView;
                    } else {
                        textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", GroupCallActivity.this.accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                        view = textView;
                    }
                } else if (i != 7) {
                    callEncryptionCell = new View(this.mContext);
                } else {
                    if (GroupCallActivity.this.encryptionDrawable == null) {
                        GroupCallActivity.this.encryptionDrawable = new CallEncryptionCellDrawable(this.mContext);
                    }
                    callEncryptionCell = new CallEncryptionCell(this.mContext, GroupCallActivity.this.encryptionDrawable);
                }
                callEncryptionCell = view;
            } else {
                callEncryptionCell = new GroupCallInvitedCell(this.mContext) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        if (AndroidUtilities.isTablet()) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i2)), 1073741824), i3);
                        } else {
                            super.onMeasure(i2, i3);
                        }
                    }
                };
            }
            return zzkd.m(callEncryptionCell, callEncryptionCell, -2);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 1) {
                GroupCallUserCell groupCallUserCell = (GroupCallUserCell) viewHolder.itemView;
                int i = GroupCallActivity.this.actionBar.getTag() != null ? Theme.key_voipgroup_mutedIcon : Theme.key_voipgroup_mutedIconUnscrolled;
                groupCallUserCell.setGrayIconColor(i, Theme.getColor(null, i, false));
                groupCallUserCell.setDrawDivider(viewHolder.getAdapterPosition() != getItemCount() - 2);
                return;
            }
            if (itemViewType == 2) {
                GroupCallInvitedCell groupCallInvitedCell = (GroupCallInvitedCell) viewHolder.itemView;
                int i2 = GroupCallActivity.this.actionBar.getTag() != null ? Theme.key_voipgroup_mutedIcon : Theme.key_voipgroup_mutedIconUnscrolled;
                groupCallInvitedCell.setGrayIconColor(i2, Theme.getColor(null, i2, false));
                groupCallInvitedCell.setDrawDivider(viewHolder.getAdapterPosition() != getItemCount() - 2);
            }
        }

        @Override
        public void notifyItemChanged(int i, Object obj) {
            updateRows();
            super.notifyItemChanged(i, obj);
        }

        @Override
        public void notifyItemRangeChanged(int i, int i2, Object obj) {
            updateRows();
            super.notifyItemRangeChanged(i, i2, obj);
        }
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
        if (sharedInstance.isConference()) {
            builder.setTitle(LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle));
            builder.setMessage(LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText));
        } else if (ChatObject.isChannelOrGiga(chat)) {
            builder.setTitle(LocaleController.getString(R.string.VoipChannelLeaveAlertTitle));
            builder.setMessage(LocaleController.getString(R.string.VoipChannelLeaveAlertText));
        } else {
            builder.setTitle(LocaleController.getString(R.string.VoipGroupLeaveAlertTitle));
            builder.setMessage(LocaleController.getString(R.string.VoipGroupLeaveAlertText));
        }
        sharedInstance.getAccount();
        CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
            CheckBoxCell checkBoxCell = new CheckBoxCell(context, 1);
            checkBoxCellArr[0] = checkBoxCell;
            checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
            if (z) {
                checkBoxCellArr[0].setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
            } else {
                checkBoxCellArr[0].setTextColor(Theme.getColor(null, Theme.key_voipgroup_actionBarItems, false));
                ((CheckBoxSquare) checkBoxCellArr[0].getCheckBoxView()).setColors(Theme.key_voipgroup_mutedIcon, Theme.key_voipgroup_listeningText, Theme.key_voipgroup_nameText);
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
            checkBoxCellArr[0].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda204(checkBoxCellArr, 1));
        }
        builder.setView(linearLayoutM);
        builder.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
        builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupLeave), new ChatActivity$$ExternalSyntheticLambda123(call, checkBoxCellArr, selfId, runnable, 2));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        if (z) {
            builder.setDimEnabled(false);
        }
        AlertDialog alertDialogCreate = builder.create();
        if (z) {
            if (Build.VERSION.SDK_INT >= 26) {
                alertDialogCreate.getWindow().setType(2038);
            } else {
                alertDialogCreate.getWindow().setType(2003);
            }
            alertDialogCreate.getWindow().clearFlags(2);
        }
        if (!z) {
            alertDialogCreate.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_dialogBackground, false));
        }
        alertDialogCreate.show();
        if (z) {
            return;
        }
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_leaveCallMenu, false));
        }
        alertDialogCreate.setTextColor(Theme.getColor(null, Theme.key_voipgroup_actionBarItems, false));
    }
}
