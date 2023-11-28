package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
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
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$GroupCall;
import org.telegram.tgnet.TLRPC$InputFile;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_chatFull;
import org.telegram.tgnet.TLRPC$TL_chatInviteExported;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_groupCall;
import org.telegram.tgnet.TLRPC$TL_groupCallDiscarded;
import org.telegram.tgnet.TLRPC$TL_groupCallParticipant;
import org.telegram.tgnet.TLRPC$TL_inputPeerChannel;
import org.telegram.tgnet.TLRPC$TL_inputPeerChat;
import org.telegram.tgnet.TLRPC$TL_inputPeerUser;
import org.telegram.tgnet.TLRPC$TL_inputUser;
import org.telegram.tgnet.TLRPC$TL_messages_exportChatInvite;
import org.telegram.tgnet.TLRPC$TL_peerChannel;
import org.telegram.tgnet.TLRPC$TL_peerChat;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_phone_createGroupCall;
import org.telegram.tgnet.TLRPC$TL_phone_discardGroupCall;
import org.telegram.tgnet.TLRPC$TL_phone_exportGroupCallInvite;
import org.telegram.tgnet.TLRPC$TL_phone_exportedGroupCallInvite;
import org.telegram.tgnet.TLRPC$TL_phone_inviteToGroupCall;
import org.telegram.tgnet.TLRPC$TL_phone_saveDefaultGroupCallJoinAs;
import org.telegram.tgnet.TLRPC$TL_phone_startScheduledGroupCall;
import org.telegram.tgnet.TLRPC$TL_phone_toggleGroupCallSettings;
import org.telegram.tgnet.TLRPC$TL_phone_toggleGroupCallStartSubscription;
import org.telegram.tgnet.TLRPC$TL_photos_photo;
import org.telegram.tgnet.TLRPC$TL_photos_uploadProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_updateGroupCall;
import org.telegram.tgnet.TLRPC$TL_updates;
import org.telegram.tgnet.TLRPC$TL_userProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_userProfilePhotoEmpty;
import org.telegram.tgnet.TLRPC$Update;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
import org.telegram.tgnet.TLRPC$VideoSize;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.AccountSelectCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.GroupCallInvitedCell;
import org.telegram.ui.Cells.GroupCallTextCell;
import org.telegram.ui.Cells.GroupCallUserCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BlobDrawable;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FillLastGridLayoutManager;
import org.telegram.ui.Components.GroupCallFullscreenAdapter;
import org.telegram.ui.Components.GroupCallPip;
import org.telegram.ui.Components.GroupCallRecordAlert;
import org.telegram.ui.Components.GroupVoipInviteAlert;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.JoinCallAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.ProfileGalleryView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecordStatusDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.Components.voip.GroupCallGridCell;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Components.voip.GroupCallRenderersContainer;
import org.telegram.ui.Components.voip.GroupCallStatusIcon;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialog;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Components.voip.VoIPToggleButton;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.PinchToZoomHelper;
import org.webrtc.MediaStreamTrack;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public class GroupCallActivity extends BottomSheet implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener {
    public static GroupCallActivity groupCallInstance;
    public static boolean groupCallUiVisible;
    public static boolean isLandscapeMode;
    public static boolean isTabletMode;
    public static boolean paused;
    private View accountGap;
    private AccountInstance accountInstance;
    private AccountSelectCell accountSelectCell;
    private ActionBar actionBar;
    private AnimatorSet actionBarAnimation;
    private View actionBarBackground;
    private View actionBarShadow;
    ObjectAnimator additionalSubtitleYAnimator;
    private ActionBarMenuSubItem adminItem;
    private float amplitude;
    private float animateAmplitudeDiff;
    boolean animateButtonsOnNextLayout;
    private float animateToAmplitude;
    private boolean animatingToFullscreenExpand;
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
    private RLottieDrawable bigMicDrawable;
    private final BlobDrawable bigWaveDrawable;
    private View blurredView;
    private HashMap<View, Float> buttonsAnimationParamsX;
    private HashMap<View, Float> buttonsAnimationParamsY;
    private GradientDrawable buttonsBackgroundGradient;
    private final View buttonsBackgroundGradientView;
    private final View buttonsBackgroundGradientView2;
    private FrameLayout buttonsContainer;
    private int buttonsVisibility;
    public ChatObject.Call call;
    private boolean callInitied;
    private VoIPToggleButton cameraButton;
    private float cameraButtonScale;
    public CellFlickerDrawable cellFlickerDrawable;
    private boolean changingPermissions;
    private float colorProgress;
    private final int[] colorsTmp;
    private boolean contentFullyOverlayed;
    private long creatingServiceTime;
    ImageUpdater currentAvatarUpdater;
    private int currentCallState;
    public TLRPC$Chat currentChat;
    private ViewGroup currentOptionsLayout;
    private WeavingState currentState;
    private boolean delayedGroupCallUpdated;
    private DiffUtil.Callback diffUtilsCallback;
    private boolean drawSpeakingSubtitle;
    public boolean drawingForBlur;
    private ActionBarMenuSubItem editTitleItem;
    private boolean enterEventSent;
    private ActionBarMenuSubItem everyoneItem;
    private ValueAnimator expandAnimator;
    private ImageView expandButton;
    private ValueAnimator expandSizeAnimator;
    private VoIPToggleButton flipButton;
    private final RLottieDrawable flipIcon;
    private int flipIconCurrentEndFrame;
    GroupCallFullscreenAdapter fullscreenAdapter;
    private final DefaultItemAnimator fullscreenListItemAnimator;
    RecyclerListView fullscreenUsersListView;
    private int[] gradientColors;
    private GroupVoipInviteAlert groupVoipInviteAlert;
    private RLottieDrawable handDrawables;
    private boolean hasScrimAnchorView;
    private boolean hasVideo;
    private boolean invalidateColors;
    private ActionBarMenuSubItem inviteItem;
    private String[] invites;
    private GroupCallItemAnimator itemAnimator;
    private long lastUpdateTime;
    private FillLastGridLayoutManager layoutManager;
    private Paint leaveBackgroundPaint;
    private VoIPToggleButton leaveButton;
    private ActionBarMenuSubItem leaveItem;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private Paint listViewBackgroundPaint;
    private boolean listViewVideoVisibility;
    private final LinearLayout menuItemsContainer;
    private ImageView minimizeButton;
    private RLottieImageView muteButton;
    private ValueAnimator muteButtonAnimator;
    private int muteButtonState;
    private TextView[] muteLabel;
    private ActionBarMenuSubItem noiseItem;
    private int oldAddMemberRow;
    private int oldCount;
    private ArrayList<Long> oldInvited;
    private int oldInvitedEndRow;
    private int oldInvitedStartRow;
    private ArrayList<TLRPC$TL_groupCallParticipant> oldParticipants;
    private int oldUsersEndRow;
    private int oldUsersStartRow;
    private int oldUsersVideoEndRow;
    private int oldUsersVideoStartRow;
    private int oldVideoDividerRow;
    private int oldVideoNotAvailableRow;
    private ArrayList<ChatObject.VideoParticipant> oldVideoParticipants;
    private Runnable onUserLeaveHintListener;
    private ActionBarMenuItem otherItem;
    private Paint paint;
    private Paint paintTmp;
    private LaunchActivity parentActivity;
    private ActionBarMenuSubItem permissionItem;
    PinchToZoomHelper pinchToZoomHelper;
    private ActionBarMenuItem pipItem;
    private boolean playingHandAnimation;
    private int popupAnimationIndex;
    private Runnable pressRunnable;
    private boolean pressed;
    private WeavingState prevState;
    PrivateVideoPreviewDialog previewDialog;
    private boolean previewTextureTransitionEnabled;
    private float progressToAvatarPreview;
    float progressToHideUi;
    private RadialGradient radialGradient;
    private final Matrix radialMatrix;
    private final Paint radialPaint;
    private RadialProgressView radialProgressView;
    private RecordCallDrawable recordCallDrawable;
    private HintView recordHintView;
    private ActionBarMenuSubItem recordItem;
    private RectF rect;
    private HintView reminderHintView;
    private GroupCallRenderersContainer renderersContainer;
    ViewTreeObserver.OnPreDrawListener requestFullscreenListener;
    private ValueAnimator scheduleAnimator;
    private TextView scheduleButtonTextView;
    private float scheduleButtonsScale;
    private boolean scheduleHasFewPeers;
    private TextView scheduleInfoTextView;
    private TLRPC$InputPeer schedulePeer;
    private int scheduleStartAt;
    private SimpleTextView scheduleStartAtTextView;
    private SimpleTextView scheduleStartInTextView;
    private SimpleTextView scheduleTimeTextView;
    private LinearLayout scheduleTimerContainer;
    private boolean scheduled;
    private String scheduledHash;
    private ActionBarMenuSubItem screenItem;
    private ActionBarMenuItem screenShareItem;
    private AnimatorSet scrimAnimatorSet;
    private GroupCallFullscreenAdapter.GroupCallUserCell scrimFullscreenView;
    private GroupCallGridCell scrimGridView;
    private Paint scrimPaint;
    private View scrimPopupLayout;
    private ActionBarPopupWindow scrimPopupWindow;
    private GroupCallMiniTextureView scrimRenderer;
    private GroupCallUserCell scrimView;
    private float scrollOffsetY;
    private TLRPC$Peer selfPeer;
    private Drawable shadowDrawable;
    private ShareAlert shareAlert;
    private float showLightingProgress;
    private float showWavesProgress;
    private VoIPToggleButton soundButton;
    private float soundButtonScale;
    private ActionBarMenuSubItem soundItem;
    private View soundItemDivider;
    private final GridLayoutManager.SpanSizeLookup spanSizeLookup;
    private boolean startingGroupCall;
    private WeavingState[] states;
    public final ArrayList<GroupCallStatusIcon> statusIconPool;
    ObjectAnimator subtitleYAnimator;
    private float switchProgress;
    private float switchToButtonInt2;
    private float switchToButtonProgress;
    GroupCallTabletGridAdapter tabletGridAdapter;
    RecyclerListView tabletVideoGridView;
    private final BlobDrawable tinyWaveDrawable;
    private AudioPlayerAlert.ClippingTextViewSwitcher titleTextView;
    private UndoView[] undoView;
    private Runnable unmuteRunnable;
    private Runnable updateCallRecordRunnable;
    private Runnable updateSchedeulRunnable;
    private boolean useBlur;
    private TLObject userSwitchObject;
    LongSparseIntArray visiblePeerIds;
    public final ArrayList<ChatObject.VideoParticipant> visibleVideoParticipants;
    private Boolean wasExpandBigSize;
    private Boolean wasNotInLayoutFullscreen;

    public static void lambda$processSelectedOption$59(DialogInterface dialogInterface) {
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void onCameraFirstFrameAvailable() {
        VoIPService.StateListener.CC.$default$onCameraFirstFrameAvailable(this);
    }

    @Override
    public void onMediaStateUpdated(int i, int i2) {
        VoIPService.StateListener.CC.$default$onMediaStateUpdated(this, i, i2);
    }

    @Override
    public void onScreenOnChange(boolean z) {
        VoIPService.StateListener.CC.$default$onScreenOnChange(this, z);
    }

    @Override
    public void onSignalBarsCountChanged(int i) {
        VoIPService.StateListener.CC.$default$onSignalBarsCountChanged(this, i);
    }

    @Override
    public void onVideoAvailableChange(boolean z) {
        VoIPService.StateListener.CC.$default$onVideoAvailableChange(this, z);
    }

    static float access$10516(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.amplitude + f;
        groupCallActivity.amplitude = f2;
        return f2;
    }

    static float access$13116(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.switchProgress + f;
        groupCallActivity.switchProgress = f2;
        return f2;
    }

    static float access$13716(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showWavesProgress + f;
        groupCallActivity.showWavesProgress = f2;
        return f2;
    }

    static float access$13724(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showWavesProgress - f;
        groupCallActivity.showWavesProgress = f2;
        return f2;
    }

    static float access$13816(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showLightingProgress + f;
        groupCallActivity.showLightingProgress = f2;
        return f2;
    }

    static float access$13824(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showLightingProgress - f;
        groupCallActivity.showLightingProgress = f2;
        return f2;
    }

    public static void lambda$new$0() {
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().setMicMute(false, true, false);
    }

    public void lambda$new$1() {
        if (this.call == null || !this.scheduled || VoIPService.getSharedInstance() == null) {
            return;
        }
        this.muteButton.performHapticFeedback(3, 2);
        updateMuteButton(1, true);
        AndroidUtilities.runOnUIThread(this.unmuteRunnable, 80L);
        this.scheduled = false;
        this.pressed = true;
    }

    static {
        new AnimationProperties.FloatProperty<GroupCallActivity>("colorProgress") {
            @Override
            public void setValue(GroupCallActivity groupCallActivity, float f) {
                groupCallActivity.setColorProgress(f);
            }

            @Override
            public Float get(GroupCallActivity groupCallActivity) {
                return Float.valueOf(groupCallActivity.getColorProgress());
            }
        };
    }

    public static class SmallRecordCallDrawable extends Drawable {
        private long lastUpdateTime;
        private View parentView;
        private int state;
        private Paint paint2 = new Paint(1);
        private float alpha = 1.0f;

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

        public SmallRecordCallDrawable(View view) {
            this.parentView = view;
        }

        @Override
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public void draw(Canvas canvas) {
            int dp;
            int centerX = getBounds().centerX();
            int centerY = getBounds().centerY();
            if (this.parentView instanceof SimpleTextView) {
                dp = centerY + AndroidUtilities.dp(1.0f);
                centerX -= AndroidUtilities.dp(3.0f);
            } else {
                dp = centerY + AndroidUtilities.dp(2.0f);
            }
            this.paint2.setColor(-1147527);
            this.paint2.setAlpha((int) (this.alpha * 255.0f));
            canvas.drawCircle(centerX, dp, AndroidUtilities.dp(4.0f), this.paint2);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.lastUpdateTime;
            if (j > 17) {
                j = 17;
            }
            this.lastUpdateTime = elapsedRealtime;
            int i = this.state;
            if (i == 0) {
                float f = this.alpha + (((float) j) / 2000.0f);
                this.alpha = f;
                if (f >= 1.0f) {
                    this.alpha = 1.0f;
                    this.state = 1;
                }
            } else if (i == 1) {
                float f2 = this.alpha - (((float) j) / 2000.0f);
                this.alpha = f2;
                if (f2 < 0.5f) {
                    this.alpha = 0.5f;
                    this.state = 0;
                }
            }
            this.parentView.invalidate();
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

        public RecordCallDrawable() {
            this.paint.setColor(-1);
            this.paint.setStyle(Paint.Style.STROKE);
            this.paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        }

        public void setParentView(View view) {
            this.parentView = view;
        }

        @Override
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(24.0f);
        }

        public void setRecording(boolean z) {
            this.recording = z;
            this.alpha = 1.0f;
            invalidateSelf();
        }

        @Override
        public void draw(Canvas canvas) {
            float centerX = getBounds().centerX();
            float centerY = getBounds().centerY();
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f), this.paint);
            this.paint2.setColor(this.recording ? -1147527 : -1);
            this.paint2.setAlpha((int) (this.alpha * 255.0f));
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(5.0f), this.paint2);
            if (this.recording) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.lastUpdateTime;
                if (j > 17) {
                    j = 17;
                }
                this.lastUpdateTime = elapsedRealtime;
                int i = this.state;
                if (i == 0) {
                    float f = this.alpha + (((float) j) / 2000.0f);
                    this.alpha = f;
                    if (f >= 1.0f) {
                        this.alpha = 1.0f;
                        this.state = 1;
                    }
                } else if (i == 1) {
                    float f2 = this.alpha - (((float) j) / 2000.0f);
                    this.alpha = f2;
                    if (f2 < 0.5f) {
                        this.alpha = 0.5f;
                        this.state = 0;
                    }
                }
                this.parentView.invalidate();
            }
        }
    }

    public class VolumeSlider extends FrameLayout {
        private boolean captured;
        private float colorChangeProgress;
        private int currentColor;
        private TLRPC$TL_groupCallParticipant currentParticipant;
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

        public VolumeSlider(Context context, TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant) {
            super(context);
            this.paint = new Paint(1);
            this.paint2 = new Paint(1);
            this.path = new Path();
            this.radii = new float[8];
            this.rect = new RectF();
            this.volumeAlphas = new float[3];
            setWillNotDraw(false);
            this.currentParticipant = tLRPC$TL_groupCallParticipant;
            this.currentProgress = ChatObject.getParticipantVolume(tLRPC$TL_groupCallParticipant) / 20000.0f;
            this.colorChangeProgress = 1.0f;
            setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            int i = R.raw.speaker;
            this.speakerDrawable = new RLottieDrawable(i, "" + i, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
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
            this.textView.setTextColor(Theme.getColor(Theme.key_voipgroup_actionBarItems));
            this.textView.setTextSize(1, 16.0f);
            double participantVolume = ChatObject.getParticipantVolume(this.currentParticipant);
            Double.isNaN(participantVolume);
            double d = participantVolume / 100.0d;
            TextView textView2 = this.textView;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf((int) (d > 0.0d ? Math.max(d, 1.0d) : 0.0d));
            textView2.setText(String.format(locale, "%d%%", objArr));
            this.textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(43.0f) : 0, 0);
            addView(this.textView, LayoutHelper.createFrame(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
            this.paint2.setStyle(Paint.Style.STROKE);
            this.paint2.setStrokeWidth(AndroidUtilities.dp(1.5f));
            this.paint2.setStrokeCap(Paint.Cap.ROUND);
            this.paint2.setColor(-1);
            double participantVolume2 = ChatObject.getParticipantVolume(this.currentParticipant);
            Double.isNaN(participantVolume2);
            int i2 = (int) (participantVolume2 / 100.0d);
            int i3 = 0;
            while (true) {
                float[] fArr = this.volumeAlphas;
                if (i3 >= fArr.length) {
                    return;
                }
                if (i2 > (i3 == 0 ? 0 : i3 == 1 ? 50 : ImageReceiver.DEFAULT_CROSSFADE_DURATION)) {
                    fArr[i3] = 1.0f;
                } else {
                    fArr[i3] = 0.0f;
                }
                i3++;
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
            double size = View.MeasureSpec.getSize(i);
            double d = this.currentProgress;
            Double.isNaN(size);
            this.thumbX = (int) (size * d);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return onTouch(motionEvent);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return onTouch(motionEvent);
        }

        boolean onTouch(MotionEvent motionEvent) {
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
                        double d = this.thumbX;
                        double measuredWidth = getMeasuredWidth();
                        Double.isNaN(d);
                        Double.isNaN(measuredWidth);
                        onSeekBarDrag(d / measuredWidth, true);
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
                    double d2 = this.thumbX;
                    double measuredWidth2 = getMeasuredWidth();
                    Double.isNaN(d2);
                    Double.isNaN(measuredWidth2);
                    onSeekBarDrag(d2 / measuredWidth2, false);
                    invalidate();
                    return true;
                }
            }
            return false;
        }

        private void onSeekBarDrag(double d, boolean z) {
            if (VoIPService.getSharedInstance() == null) {
                return;
            }
            this.currentProgress = d;
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant = this.currentParticipant;
            tLRPC$TL_groupCallParticipant.volume = (int) (d * 20000.0d);
            tLRPC$TL_groupCallParticipant.volume_by_admin = false;
            tLRPC$TL_groupCallParticipant.flags |= 128;
            double participantVolume = ChatObject.getParticipantVolume(tLRPC$TL_groupCallParticipant);
            Double.isNaN(participantVolume);
            double d2 = participantVolume / 100.0d;
            TextView textView = this.textView;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf((int) (d2 > 0.0d ? Math.max(d2, 1.0d) : 0.0d));
            textView.setText(String.format(locale, "%d%%", objArr));
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant2 = this.currentParticipant;
            sharedInstance.setParticipantVolume(tLRPC$TL_groupCallParticipant2, tLRPC$TL_groupCallParticipant2.volume);
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
                    groupCallActivity.processSelectedOption(this.currentParticipant, peerId, ChatObject.canManageCalls(groupCallActivity.currentChat) ? 0 : 5);
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
        protected void onDraw(Canvas canvas) {
            int i;
            float dp;
            int i2;
            int i3 = this.currentColor;
            double d = this.currentProgress;
            if (d < 0.25d) {
                this.currentColor = -3385513;
            } else if (d > 0.25d && d < 0.5d) {
                this.currentColor = -3562181;
            } else if (d >= 0.5d && d <= 0.75d) {
                this.currentColor = -11027349;
            } else {
                this.currentColor = -11688225;
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
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.lastUpdateTime;
            if (j > 17) {
                j = 17;
            }
            this.lastUpdateTime = elapsedRealtime;
            float f2 = this.colorChangeProgress;
            if (f2 < 1.0f) {
                float f3 = f2 + (((float) j) / 200.0f);
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
            float dp2 = AndroidUtilities.dp(6.0f);
            fArr[7] = dp2;
            fArr[6] = dp2;
            int i4 = 1;
            fArr[1] = dp2;
            fArr[0] = dp2;
            float max = this.thumbX < AndroidUtilities.dp(12.0f) ? Math.max(0.0f, (this.thumbX - AndroidUtilities.dp(6.0f)) / AndroidUtilities.dp(6.0f)) : 1.0f;
            float[] fArr2 = this.radii;
            float dp3 = AndroidUtilities.dp(6.0f) * max;
            fArr2[5] = dp3;
            fArr2[4] = dp3;
            fArr2[3] = dp3;
            fArr2[2] = dp3;
            this.rect.set(0.0f, 0.0f, this.thumbX, getMeasuredHeight());
            this.path.addRoundRect(this.rect, this.radii, Path.Direction.CW);
            this.path.close();
            canvas.drawPath(this.path, this.paint);
            double participantVolume = ChatObject.getParticipantVolume(this.currentParticipant);
            Double.isNaN(participantVolume);
            int i5 = (int) (participantVolume / 100.0d);
            int left = this.imageView.getLeft() + (this.imageView.getMeasuredWidth() / 2) + AndroidUtilities.dp(5.0f);
            int top = this.imageView.getTop() + (this.imageView.getMeasuredHeight() / 2);
            int i6 = 0;
            while (i6 < this.volumeAlphas.length) {
                if (i6 == 0) {
                    dp = AndroidUtilities.dp(f4);
                    i2 = 0;
                } else if (i6 == i4) {
                    dp = AndroidUtilities.dp(10.0f);
                    i2 = 50;
                } else {
                    dp = AndroidUtilities.dp(14.0f);
                    i2 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
                }
                float[] fArr3 = this.volumeAlphas;
                float dp4 = AndroidUtilities.dp(2.0f) * (f - fArr3[i6]);
                this.paint2.setAlpha((int) (fArr3[i6] * 255.0f));
                float f5 = left;
                float f6 = top;
                this.rect.set((f5 - dp) + dp4, (f6 - dp) + dp4, (f5 + dp) - dp4, (f6 + dp) - dp4);
                int i7 = i2;
                int i8 = i6;
                canvas.drawArc(this.rect, -50.0f, 100.0f, false, this.paint2);
                if (i5 > i7) {
                    float[] fArr4 = this.volumeAlphas;
                    if (fArr4[i8] < 1.0f) {
                        fArr4[i8] = fArr4[i8] + (((float) j) / 180.0f);
                        if (fArr4[i8] > 1.0f) {
                            fArr4[i8] = 1.0f;
                        }
                        invalidate();
                    }
                } else {
                    float[] fArr5 = this.volumeAlphas;
                    if (fArr5[i8] > 0.0f) {
                        fArr5[i8] = fArr5[i8] - (((float) j) / 180.0f);
                        if (fArr5[i8] < 0.0f) {
                            fArr5[i8] = 0.0f;
                        }
                        invalidate();
                    }
                }
                i6 = i8 + 1;
                f = 1.0f;
                i4 = 1;
                f4 = 6.0f;
            }
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
        private Matrix matrix = new Matrix();

        public WeavingState(int i) {
            this.currentState = i;
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
            float f4 = (float) j;
            float f5 = this.time + ((BlobDrawable.GRADIENT_SPEED_MIN + 0.5f) * f4) + (f4 * BlobDrawable.GRADIENT_SPEED_MAX * 2.0f * f);
            this.time = f5;
            float f6 = this.duration;
            if (f5 > f6) {
                this.time = f6;
            }
            float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.time / f6);
            float f7 = i3;
            float f8 = this.startX;
            float f9 = (i2 + ((f8 + ((this.targetX - f8) * interpolation)) * f7)) - 200.0f;
            float f10 = this.startY;
            float f11 = (i + (f7 * (f10 + ((this.targetY - f10) * interpolation)))) - 200.0f;
            if (GroupCallActivity.isGradientState(this.currentState)) {
                f2 = 1.0f;
            } else {
                f2 = this.currentState == 1 ? 4.0f : 2.5f;
            }
            float dp = (AndroidUtilities.dp(122.0f) / 400.0f) * f2;
            this.matrix.reset();
            this.matrix.postTranslate(f9, f11);
            this.matrix.postScale(dp, dp, f9 + 200.0f, f11 + 200.0f);
            this.shader.setLocalMatrix(this.matrix);
        }

        private void setTarget() {
            if (GroupCallActivity.isGradientState(this.currentState)) {
                this.targetX = ((Utilities.random.nextInt(100) * 0.2f) / 100.0f) + 0.85f;
                this.targetY = 1.0f;
            } else if (this.currentState == 1) {
                this.targetX = ((Utilities.random.nextInt(100) * 0.3f) / 100.0f) + 0.2f;
                this.targetY = ((Utilities.random.nextInt(100) * 0.3f) / 100.0f) + 0.7f;
            } else {
                this.targetX = ((Utilities.random.nextInt(100) / 100.0f) * 0.2f) + 0.8f;
                this.targetY = Utilities.random.nextInt(100) / 100.0f;
            }
        }
    }

    public static boolean isGradientState(int i) {
        return !(VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) || i == 2 || i == 4 || i == 5 || i == 6 || i == 7;
    }

    private void prepareBlurBitmap() {
        if (this.blurredView == null) {
            return;
        }
        int measuredWidth = (int) ((this.containerView.getMeasuredWidth() - (this.backgroundPaddingLeft * 2)) / 6.0f);
        int measuredHeight = (int) ((this.containerView.getMeasuredHeight() - AndroidUtilities.statusBarHeight) / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        canvas.translate(0.0f, -AndroidUtilities.statusBarHeight);
        this.parentActivity.getActionBarLayout().getView().draw(canvas);
        canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, 76));
        canvas.restore();
        canvas.save();
        canvas.translate(this.containerView.getX(), -AndroidUtilities.statusBarHeight);
        this.drawingForBlur = true;
        this.containerView.draw(canvas);
        this.drawingForBlur = false;
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        this.blurredView.setBackground(new BitmapDrawable(createBitmap));
        this.blurredView.setAlpha(0.0f);
        this.blurredView.setVisibility(0);
    }

    @Override
    public boolean onCustomOpenAnimation() {
        groupCallUiVisible = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        GroupCallPip.updateVisibility(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override
    public void dismiss() {
        this.parentActivity.removeOnUserLeaveHintListener(this.onUserLeaveHintListener);
        this.parentActivity.setRequestedOrientation(-1);
        groupCallUiVisible = false;
        GroupVoipInviteAlert groupVoipInviteAlert = this.groupVoipInviteAlert;
        if (groupVoipInviteAlert != null) {
            groupVoipInviteAlert.dismiss();
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
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
        super.dismiss();
    }

    public boolean isStillConnecting() {
        int i = this.currentCallState;
        return i == 1 || i == 2 || i == 6 || i == 5;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant;
        int i3;
        String str;
        TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant2;
        int i4;
        String str2;
        String string;
        ChatObject.VideoParticipant videoParticipant;
        int i5;
        int i6;
        int i7 = 0;
        if (i == NotificationCenter.groupCallUpdated) {
            Long l = (Long) objArr[1];
            ChatObject.Call call = this.call;
            if (call == null || call.call.id != l.longValue()) {
                return;
            }
            ChatObject.Call call2 = this.call;
            if (call2.call instanceof TLRPC$TL_groupCallDiscarded) {
                dismiss();
                return;
            }
            if (this.creatingServiceTime == 0 && (((i6 = this.muteButtonState) == 7 || i6 == 5 || i6 == 6) && !call2.isScheduled())) {
                try {
                    Intent intent = new Intent(this.parentActivity, VoIPService.class);
                    intent.putExtra("chat_id", this.currentChat.id);
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
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        GroupCallActivity.this.lambda$didReceivedNotification$2();
                    }
                }, 3000L);
            }
            if (!this.callInitied && VoIPService.getSharedInstance() != null) {
                this.call.addSelfDummyParticipant(false);
                initCreatedGroupCall();
                VoIPService.getSharedInstance().playConnectedSound();
            }
            updateItems();
            int childCount = this.listView.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = this.listView.getChildAt(i8);
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
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean z = this.muteButtonState == 4;
            updateState(true, booleanValue);
            updateTitle(true);
            if (z && ((i5 = this.muteButtonState) == 1 || i5 == 0)) {
                getUndoView().showWithAction(0L, 38, (Runnable) null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playAllowTalkSound();
                }
            }
            if (objArr.length >= 4) {
                long longValue = ((Long) objArr[3]).longValue();
                if (longValue == 0 || isRtmpStream()) {
                    return;
                }
                try {
                    ArrayList<TLRPC$Dialog> allDialogs = this.accountInstance.getMessagesController().getAllDialogs();
                    if (allDialogs != null) {
                        Iterator<TLRPC$Dialog> it = allDialogs.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().id == longValue) {
                                    i7 = 1;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                if (DialogObject.isUserDialog(longValue)) {
                    TLRPC$User user = this.accountInstance.getMessagesController().getUser(Long.valueOf(longValue));
                    if (user != null) {
                        if (this.call.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i7 != 0) {
                            getUndoView().showWithAction(0L, 44, user, this.currentChat, (Runnable) null, (Runnable) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                TLRPC$Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    if (this.call.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i7 != 0) {
                        getUndoView().showWithAction(0L, 44, chat, this.currentChat, (Runnable) null, (Runnable) null);
                    }
                }
            }
        } else if (i == NotificationCenter.groupCallSpeakingUsersUpdated) {
            GroupCallRenderersContainer groupCallRenderersContainer = this.renderersContainer;
            if (groupCallRenderersContainer.inFullscreenMode && this.call != null) {
                boolean autoPinEnabled = groupCallRenderersContainer.autoPinEnabled();
                ChatObject.Call call3 = this.call;
                if (call3 != null) {
                    GroupCallRenderersContainer groupCallRenderersContainer2 = this.renderersContainer;
                    if (groupCallRenderersContainer2.inFullscreenMode && (videoParticipant = groupCallRenderersContainer2.fullscreenParticipant) != null && call3.participants.get(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                        autoPinEnabled = true;
                    }
                }
                if (autoPinEnabled) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    for (int i9 = 0; i9 < this.visibleVideoParticipants.size(); i9++) {
                        ChatObject.VideoParticipant videoParticipant3 = this.visibleVideoParticipants.get(i9);
                        if (this.call.currentSpeakingPeers.get(MessageObject.getPeerId(videoParticipant3.participant.peer), null) != null) {
                            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant3 = videoParticipant3.participant;
                            if (!tLRPC$TL_groupCallParticipant3.muted_by_you && this.renderersContainer.fullscreenPeerId != MessageObject.getPeerId(tLRPC$TL_groupCallParticipant3.peer)) {
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
        } else if (i == NotificationCenter.webRtcMicAmplitudeEvent) {
            setMicAmplitude(((Float) objArr[0]).floatValue());
        } else if (i == NotificationCenter.needShowAlert) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str3 = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str3)) {
                    if (ChatObject.isChannelOrGiga(this.currentChat)) {
                        string = LocaleController.getString("VoipChannelTooMuch", R.string.VoipChannelTooMuch);
                    } else {
                        string = LocaleController.getString("VoipGroupTooMuch", R.string.VoipGroupTooMuch);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str3) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str3)) {
                    string = LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + str3;
                } else if (ChatObject.isChannelOrGiga(this.currentChat)) {
                    string = LocaleController.getString("VoipChannelJoinAnonymousAdmin", R.string.VoipChannelJoinAnonymousAdmin);
                } else {
                    string = LocaleController.getString("VoipGroupJoinAnonymousAdmin", R.string.VoipGroupJoinAnonymousAdmin);
                }
                AlertDialog.Builder createSimpleAlert = AlertsCreator.createSimpleAlert(getContext(), LocaleController.getString("VoipGroupVoiceChat", R.string.VoipGroupVoiceChat), string);
                createSimpleAlert.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        GroupCallActivity.this.lambda$didReceivedNotification$3(dialogInterface);
                    }
                });
                try {
                    createSimpleAlert.show();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else if (i == NotificationCenter.didEndCall) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
            }
        } else if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC$ChatFull tLRPC$ChatFull = (TLRPC$ChatFull) objArr[0];
            if (tLRPC$ChatFull.id == this.currentChat.id) {
                updateItems();
                updateState(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.selfPeer);
            ChatObject.Call call4 = this.call;
            if (call4 == null || tLRPC$ChatFull.id != (-peerId) || (tLRPC$TL_groupCallParticipant2 = call4.participants.get(peerId)) == null) {
                return;
            }
            tLRPC$TL_groupCallParticipant2.about = tLRPC$ChatFull.about;
            applyCallParticipantUpdates(true);
            AndroidUtilities.updateVisibleRows(this.listView);
            if (this.currentOptionsLayout != null) {
                while (i7 < this.currentOptionsLayout.getChildCount()) {
                    View childAt2 = this.currentOptionsLayout.getChildAt(i7);
                    if ((childAt2 instanceof ActionBarMenuSubItem) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                        ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) childAt2;
                        if (TextUtils.isEmpty(tLRPC$TL_groupCallParticipant2.about)) {
                            i4 = R.string.VoipAddDescription;
                            str2 = "VoipAddDescription";
                        } else {
                            i4 = R.string.VoipEditDescription;
                            str2 = "VoipEditDescription";
                        }
                        actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(str2, i4), TextUtils.isEmpty(tLRPC$TL_groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info);
                    }
                    i7++;
                }
            }
        } else if (i == NotificationCenter.didLoadChatAdmins) {
            if (((Long) objArr[0]).longValue() == this.currentChat.id) {
                updateItems();
                updateState(isShowing(), false);
            }
        } else if (i == NotificationCenter.applyGroupCallVisibleParticipants) {
            int childCount2 = this.listView.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i7 < childCount2) {
                RecyclerView.ViewHolder findContainingViewHolder = this.listView.findContainingViewHolder(this.listView.getChildAt(i7));
                if (findContainingViewHolder != null) {
                    View view = findContainingViewHolder.itemView;
                    if (view instanceof GroupCallUserCell) {
                        GroupCallUserCell groupCallUserCell = (GroupCallUserCell) view;
                        if (groupCallUserCell.getParticipant() != null) {
                            groupCallUserCell.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i7++;
            }
        } else if (i == NotificationCenter.userInfoDidLoad) {
            Long l2 = (Long) objArr[0];
            long peerId2 = MessageObject.getPeerId(this.selfPeer);
            if (this.call == null || peerId2 != l2.longValue() || (tLRPC$TL_groupCallParticipant = this.call.participants.get(peerId2)) == null) {
                return;
            }
            tLRPC$TL_groupCallParticipant.about = ((TLRPC$UserFull) objArr[1]).about;
            applyCallParticipantUpdates(true);
            AndroidUtilities.updateVisibleRows(this.listView);
            if (this.currentOptionsLayout != null) {
                while (i7 < this.currentOptionsLayout.getChildCount()) {
                    View childAt3 = this.currentOptionsLayout.getChildAt(i7);
                    if ((childAt3 instanceof ActionBarMenuSubItem) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                        ActionBarMenuSubItem actionBarMenuSubItem2 = (ActionBarMenuSubItem) childAt3;
                        if (TextUtils.isEmpty(tLRPC$TL_groupCallParticipant.about)) {
                            i3 = R.string.VoipAddBio;
                            str = "VoipAddBio";
                        } else {
                            i3 = R.string.VoipEditBio;
                            str = "VoipEditBio";
                        }
                        actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(str, i3), TextUtils.isEmpty(tLRPC$TL_groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info);
                    }
                    i7++;
                }
            }
        } else if (i == NotificationCenter.mainUserInfoChanged) {
            applyCallParticipantUpdates(true);
            AndroidUtilities.updateVisibleRows(this.listView);
        } else if (i == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                applyCallParticipantUpdates(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) == 0 && (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) == 0) {
                return;
            }
            AndroidUtilities.updateVisibleRows(this.listView);
        } else if (i == NotificationCenter.groupCallScreencastStateChanged) {
            PrivateVideoPreviewDialog privateVideoPreviewDialog = this.previewDialog;
            if (privateVideoPreviewDialog != null) {
                privateVideoPreviewDialog.dismiss(true, true);
            }
            updateItems();
        }
    }

    public void lambda$didReceivedNotification$2() {
        if (isStillConnecting()) {
            updateState(true, false);
        }
    }

    public void lambda$didReceivedNotification$3(DialogInterface dialogInterface) {
        dismiss();
    }

    private void setMicAmplitude(float f) {
        TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        f = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        setAmplitude(4000.0f * f);
        ChatObject.Call call = this.call;
        if (call == null || this.listView == null || (tLRPC$TL_groupCallParticipant = call.participants.get(MessageObject.getPeerId(this.selfPeer))) == null) {
            return;
        }
        if (!this.renderersContainer.inFullscreenMode) {
            int indexOf = (this.delayedGroupCallUpdated ? this.oldParticipants : this.call.visibleParticipants).indexOf(tLRPC$TL_groupCallParticipant);
            if (indexOf >= 0 && (findViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(indexOf + this.listAdapter.usersStartRow)) != null) {
                View view = findViewHolderForAdapterPosition.itemView;
                if (view instanceof GroupCallUserCell) {
                    ((GroupCallUserCell) view).setAmplitude(f * 15.0f);
                    if (findViewHolderForAdapterPosition.itemView == this.scrimView && !this.contentFullyOverlayed) {
                        this.containerView.invalidate();
                    }
                }
            }
        } else {
            for (int i = 0; i < this.fullscreenUsersListView.getChildCount(); i++) {
                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) this.fullscreenUsersListView.getChildAt(i);
                if (MessageObject.getPeerId(groupCallUserCell.getParticipant().peer) == MessageObject.getPeerId(tLRPC$TL_groupCallParticipant.peer)) {
                    groupCallUserCell.setAmplitude(f * 15.0f);
                }
            }
        }
        this.renderersContainer.setAmplitude(tLRPC$TL_groupCallParticipant, f * 15.0f);
    }

    public void applyCallParticipantUpdates(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.applyCallParticipantUpdates(boolean):void");
    }

    private void updateVideoParticipantList() {
        this.visibleVideoParticipants.clear();
        if (isTabletMode) {
            if (this.renderersContainer.inFullscreenMode) {
                this.visibleVideoParticipants.addAll(this.call.visibleVideoParticipants);
                ChatObject.VideoParticipant videoParticipant = this.renderersContainer.fullscreenParticipant;
                if (videoParticipant != null) {
                    this.visibleVideoParticipants.remove(videoParticipant);
                    return;
                }
                return;
            }
            return;
        }
        this.visibleVideoParticipants.addAll(this.call.visibleVideoParticipants);
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

    public void updateItems() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.updateItems():void");
    }

    public void lambda$updateItems$4() {
        updateRecordCallText();
        AndroidUtilities.runOnUIThread(this.updateCallRecordRunnable, 1000L);
    }

    protected void makeFocusable(final BottomSheet bottomSheet, final AlertDialog alertDialog, final EditTextBoldCursor editTextBoldCursor, final boolean z) {
        if (this.enterEventSent) {
            return;
        }
        BaseFragment baseFragment = this.parentActivity.getActionBarLayout().getFragmentStack().get(this.parentActivity.getActionBarLayout().getFragmentStack().size() - 1);
        if (baseFragment instanceof ChatActivity) {
            boolean needEnterText = ((ChatActivity) baseFragment).needEnterText();
            this.enterEventSent = true;
            this.anyEnterEventSent = true;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GroupCallActivity.lambda$makeFocusable$7(BottomSheet.this, editTextBoldCursor, z, alertDialog);
                }
            }, needEnterText ? 200L : 0L);
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
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GroupCallActivity.lambda$makeFocusable$8(EditTextBoldCursor.this);
                }
            }, 100L);
        }
    }

    public static void lambda$makeFocusable$7(BottomSheet bottomSheet, final EditTextBoldCursor editTextBoldCursor, boolean z, AlertDialog alertDialog) {
        if (bottomSheet != null && !bottomSheet.isDismissed()) {
            bottomSheet.setFocusable(true);
            editTextBoldCursor.requestFocus();
            if (z) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        AndroidUtilities.showKeyboard(EditTextBoldCursor.this);
                    }
                });
            }
        } else if (alertDialog == null || !alertDialog.isShowing()) {
        } else {
            alertDialog.setFocusable(true);
            editTextBoldCursor.requestFocus();
            if (z) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        AndroidUtilities.showKeyboard(EditTextBoldCursor.this);
                    }
                });
            }
        }
    }

    public static void lambda$makeFocusable$8(EditTextBoldCursor editTextBoldCursor) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void create(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC$Chat tLRPC$Chat, TLRPC$InputPeer tLRPC$InputPeer, boolean z, String str) {
        TLRPC$Chat chat;
        if (groupCallInstance == null) {
            if (tLRPC$InputPeer == null && VoIPService.getSharedInstance() == null) {
                return;
            }
            if (tLRPC$InputPeer != null) {
                groupCallInstance = new GroupCallActivity(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(tLRPC$Chat.id, false), tLRPC$Chat, tLRPC$InputPeer, z, str);
            } else {
                ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                if (call == null || (chat = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId))) == null) {
                    return;
                }
                call.addSelfDummyParticipant(true);
                groupCallInstance = new GroupCallActivity(launchActivity, accountInstance, call, chat, null, z, str);
            }
            groupCallInstance.parentActivity = launchActivity;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GroupCallActivity.lambda$create$9();
                }
            });
        }
    }

    public static void lambda$create$9() {
        GroupCallActivity groupCallActivity = groupCallInstance;
        if (groupCallActivity != null) {
            groupCallActivity.show();
        }
    }

    private GroupCallActivity(final Context context, final AccountInstance accountInstance, ChatObject.Call call, final TLRPC$Chat tLRPC$Chat, TLRPC$InputPeer tLRPC$InputPeer, boolean z, String str) {
        super(context, false);
        int i;
        String str2;
        int i2;
        String str3;
        ViewGroup viewGroup;
        this.muteLabel = new TextView[2];
        this.undoView = new UndoView[2];
        this.visibleVideoParticipants = new ArrayList<>();
        this.rect = new RectF();
        this.listViewBackgroundPaint = new Paint(1);
        this.oldParticipants = new ArrayList<>();
        this.oldVideoParticipants = new ArrayList<>();
        this.oldInvited = new ArrayList<>();
        this.muteButtonState = 0;
        this.animatingToFullscreenExpand = false;
        this.paint = new Paint(7);
        this.paintTmp = new Paint(7);
        this.leaveBackgroundPaint = new Paint(1);
        this.states = new WeavingState[8];
        this.switchProgress = 1.0f;
        this.invalidateColors = true;
        this.colorsTmp = new int[3];
        this.attachedRenderers = new ArrayList<>();
        this.attachedRenderersTmp = new ArrayList<>();
        this.wasExpandBigSize = Boolean.TRUE;
        this.cellFlickerDrawable = new CellFlickerDrawable();
        this.statusIconPool = new ArrayList<>();
        this.buttonsAnimationParamsX = new HashMap<>();
        this.buttonsAnimationParamsY = new HashMap<>();
        this.onUserLeaveHintListener = new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.this.onUserLeaveHint();
            }
        };
        this.updateSchedeulRunnable = new Runnable() {
            @Override
            public void run() {
                int i3;
                if (GroupCallActivity.this.scheduleTimeTextView == null || GroupCallActivity.this.isDismissed()) {
                    return;
                }
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                ChatObject.Call call2 = groupCallActivity.call;
                if (call2 == null) {
                    i3 = groupCallActivity.scheduleStartAt;
                } else {
                    i3 = call2.call.schedule_date;
                }
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
                        GroupCallActivity.this.scheduleStartInTextView.setText(LocaleController.getString("VoipChatLateBy", R.string.VoipChatLateBy));
                    }
                }
                GroupCallActivity.this.scheduleStartAtTextView.setText(LocaleController.formatStartsTime(i3, 3));
                AndroidUtilities.runOnUIThread(GroupCallActivity.this.updateSchedeulRunnable, 1000L);
            }
        };
        this.unmuteRunnable = new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.lambda$new$0();
            }
        };
        this.pressRunnable = new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.this.lambda$new$1();
            }
        };
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
            public int getOldListSize() {
                return GroupCallActivity.this.oldCount;
            }

            @Override
            public int getNewListSize() {
                return GroupCallActivity.this.listAdapter.rowsCount;
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
                    if (i4 < GroupCallActivity.this.listAdapter.usersVideoGridStartRow || i4 >= GroupCallActivity.this.listAdapter.usersVideoGridEndRow || i3 < GroupCallActivity.this.oldUsersVideoStartRow || i3 >= GroupCallActivity.this.oldUsersVideoEndRow) {
                        if (i4 >= GroupCallActivity.this.listAdapter.usersStartRow && i4 < GroupCallActivity.this.listAdapter.usersEndRow && i3 >= GroupCallActivity.this.oldUsersStartRow && i3 < GroupCallActivity.this.oldUsersEndRow) {
                            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant = (TLRPC$TL_groupCallParticipant) GroupCallActivity.this.oldParticipants.get(i3 - GroupCallActivity.this.oldUsersStartRow);
                            GroupCallActivity groupCallActivity = GroupCallActivity.this;
                            if (MessageObject.getPeerId(tLRPC$TL_groupCallParticipant.peer) == MessageObject.getPeerId(groupCallActivity.call.visibleParticipants.get(i4 - groupCallActivity.listAdapter.usersStartRow).peer)) {
                                return i3 == i4 || tLRPC$TL_groupCallParticipant.lastActiveDate == ((long) tLRPC$TL_groupCallParticipant.active_date);
                            }
                            return false;
                        } else if (i4 >= GroupCallActivity.this.listAdapter.invitedStartRow && i4 < GroupCallActivity.this.listAdapter.invitedEndRow && i3 >= GroupCallActivity.this.oldInvitedStartRow && i3 < GroupCallActivity.this.oldInvitedEndRow) {
                            GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                            return ((Long) GroupCallActivity.this.oldInvited.get(i3 - GroupCallActivity.this.oldInvitedStartRow)).equals(groupCallActivity2.call.invitedUsers.get(i4 - groupCallActivity2.listAdapter.invitedStartRow));
                        }
                    } else {
                        GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                        return ((ChatObject.VideoParticipant) GroupCallActivity.this.oldVideoParticipants.get(i3 - GroupCallActivity.this.oldUsersVideoStartRow)).equals(groupCallActivity3.visibleVideoParticipants.get(i4 - groupCallActivity3.listAdapter.usersVideoGridStartRow));
                    }
                }
                return false;
            }
        };
        setOpenNoDelay(true);
        this.accountInstance = accountInstance;
        this.call = call;
        this.schedulePeer = tLRPC$InputPeer;
        this.currentChat = tLRPC$Chat;
        this.scheduledHash = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.scheduleHasFewPeers = z;
        this.fullWidth = true;
        isTabletMode = false;
        isLandscapeMode = false;
        paused = false;
        setDelegate(new BottomSheet.BottomSheetDelegateInterface() {
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
        });
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.scrimPaint = new Paint() {
            @Override
            public void setAlpha(int i3) {
                super.setAlpha(i3);
                if (((BottomSheet) GroupCallActivity.this).containerView != null) {
                    ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                }
            }
        };
        setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                GroupCallActivity.this.lambda$new$10(dialogInterface);
            }
        });
        setDimBehindAlpha(75);
        this.listAdapter = new ListAdapter(context);
        final RecordStatusDrawable recordStatusDrawable = new RecordStatusDrawable(true);
        int i3 = Theme.key_voipgroup_speakingText;
        recordStatusDrawable.setColor(Theme.getColor(i3));
        recordStatusDrawable.start();
        ActionBar actionBar = new ActionBar(context) {
            @Override
            public void setAlpha(float f) {
                if (getAlpha() != f) {
                    super.setAlpha(f);
                    ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                }
            }

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
        };
        this.actionBar = actionBar;
        actionBar.setSubtitle("");
        this.actionBar.getSubtitleTextView().setVisibility(0);
        this.actionBar.createAdditionalSubtitleTextView();
        this.actionBar.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(this.actionBar.getAdditionalSubtitleTextView(), this.drawSpeakingSubtitle, 1.0f, false);
        this.actionBar.getAdditionalSubtitleTextView().setTextColor(Theme.getColor(i3));
        ActionBar actionBar2 = this.actionBar;
        int i4 = Theme.key_voipgroup_lastSeenTextUnscrolled;
        actionBar2.setSubtitleColor(Theme.getColor(i4));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setOccupyStatusBar(false);
        this.actionBar.setAllowOverlayTitle(false);
        ActionBar actionBar3 = this.actionBar;
        int i5 = Theme.key_voipgroup_actionBarItems;
        actionBar3.setItemsColor(Theme.getColor(i5), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarActionModeDefaultSelector), false);
        this.actionBar.setTitleColor(Theme.getColor(i5));
        this.actionBar.setSubtitleColor(Theme.getColor(i4));
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass6(context));
        TLRPC$InputPeer groupCallPeer = tLRPC$InputPeer != null ? tLRPC$InputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
            this.selfPeer = tLRPC$TL_peerUser;
            tLRPC$TL_peerUser.user_id = this.accountInstance.getUserConfig().getClientUserId();
        } else if (groupCallPeer instanceof TLRPC$TL_inputPeerChannel) {
            TLRPC$TL_peerChannel tLRPC$TL_peerChannel = new TLRPC$TL_peerChannel();
            this.selfPeer = tLRPC$TL_peerChannel;
            tLRPC$TL_peerChannel.channel_id = groupCallPeer.channel_id;
        } else if (groupCallPeer instanceof TLRPC$TL_inputPeerUser) {
            TLRPC$TL_peerUser tLRPC$TL_peerUser2 = new TLRPC$TL_peerUser();
            this.selfPeer = tLRPC$TL_peerUser2;
            tLRPC$TL_peerUser2.user_id = groupCallPeer.user_id;
        } else if (groupCallPeer instanceof TLRPC$TL_inputPeerChat) {
            TLRPC$TL_peerChat tLRPC$TL_peerChat = new TLRPC$TL_peerChat();
            this.selfPeer = tLRPC$TL_peerChat;
            tLRPC$TL_peerChat.chat_id = groupCallPeer.chat_id;
        }
        VoIPService.audioLevelsCallback = new NativeInstance.AudioLevelsCallback() {
            @Override
            public final void run(int[] iArr, float[] fArr, boolean[] zArr) {
                GroupCallActivity.this.lambda$new$11(iArr, fArr, zArr);
            }
        };
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.needShowAlert);
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.didLoadChatAdmins);
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.applyGroupCallVisibleParticipants);
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.mainUserInfoChanged);
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallScreencastStateChanged);
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallSpeakingUsersUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didEndCall);
        this.shadowDrawable = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        int i6 = R.raw.voip_filled;
        this.bigMicDrawable = new RLottieDrawable(i6, "" + i6, AndroidUtilities.dp(72.0f), AndroidUtilities.dp(72.0f), true, null);
        int i7 = R.raw.hand_2;
        this.handDrawables = new RLottieDrawable(i7, "" + i7, AndroidUtilities.dp(72.0f), AndroidUtilities.dp(72.0f), true, null);
        FrameLayout frameLayout = new FrameLayout(context) {
            private int lastSize;
            boolean localHasVideo;
            private boolean updateRenderers;
            boolean wasLayout;
            private boolean ignoreLayout = false;
            private RectF rect = new RectF();
            HashMap<Object, View> listCells = new HashMap<>();

            @Override
            protected void onMeasure(int i8, int i9) {
                int i10;
                int size = View.MeasureSpec.getSize(i9);
                this.ignoreLayout = true;
                boolean z2 = View.MeasureSpec.getSize(i8) > size && !AndroidUtilities.isTablet();
                GroupCallActivity.this.renderersContainer.listWidth = View.MeasureSpec.getSize(i8);
                boolean z3 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i8) > size && !GroupCallActivity.this.isRtmpStream();
                if (GroupCallActivity.isLandscapeMode != z2) {
                    GroupCallActivity.isLandscapeMode = z2;
                    int measuredWidth = GroupCallActivity.this.muteButton.getMeasuredWidth();
                    if (measuredWidth == 0) {
                        measuredWidth = GroupCallActivity.this.muteButton.getLayoutParams().width;
                    }
                    float dp = AndroidUtilities.dp(52.0f) / (measuredWidth - AndroidUtilities.dp(8.0f));
                    if (!GroupCallActivity.isLandscapeMode && !GroupCallActivity.this.renderersContainer.inFullscreenMode) {
                        dp = 1.0f;
                    }
                    boolean z4 = GroupCallActivity.this.renderersContainer.inFullscreenMode && (AndroidUtilities.isTablet() || GroupCallActivity.isLandscapeMode == GroupCallActivity.this.isRtmpLandscapeMode());
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    ImageView imageView = z4 ? groupCallActivity.minimizeButton : groupCallActivity.expandButton;
                    ImageView imageView2 = z4 ? GroupCallActivity.this.expandButton : GroupCallActivity.this.minimizeButton;
                    imageView.setAlpha(1.0f);
                    imageView.setScaleX(dp);
                    imageView.setScaleY(dp);
                    imageView2.setAlpha(0.0f);
                    GroupCallActivity.this.muteLabel[0].setAlpha(1.0f);
                    GroupCallActivity.this.muteLabel[1].setAlpha(1.0f);
                    if (GroupCallActivity.this.renderersContainer.inFullscreenMode || (GroupCallActivity.isLandscapeMode && !AndroidUtilities.isTablet())) {
                        GroupCallActivity.this.muteLabel[0].setScaleX(0.687f);
                        GroupCallActivity.this.muteLabel[1].setScaleY(0.687f);
                    } else {
                        GroupCallActivity.this.muteLabel[0].setScaleX(1.0f);
                        GroupCallActivity.this.muteLabel[1].setScaleY(1.0f);
                    }
                    GroupCallActivity.this.invalidateLayoutFullscreen();
                    GroupCallActivity.this.layoutManager.setSpanCount(GroupCallActivity.isLandscapeMode ? 6 : 2);
                    GroupCallActivity.this.listView.invalidateItemDecorations();
                    GroupCallActivity.this.fullscreenUsersListView.invalidateItemDecorations();
                    this.updateRenderers = true;
                    if (GroupCallActivity.this.scheduleInfoTextView != null) {
                        GroupCallActivity.this.scheduleInfoTextView.setVisibility(!GroupCallActivity.isLandscapeMode ? 0 : 8);
                    }
                    if ((GroupCallActivity.this.isRtmpLandscapeMode() == z2) && GroupCallActivity.this.isRtmpStream() && !GroupCallActivity.this.renderersContainer.inFullscreenMode && !GroupCallActivity.this.call.visibleVideoParticipants.isEmpty()) {
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
                    boolean z5 = !GroupCallActivity.isTabletMode && GroupCallActivity.this.renderersContainer.inFullscreenMode;
                    GroupCallActivity groupCallActivity7 = GroupCallActivity.this;
                    groupCallActivity7.fullscreenAdapter.setVisibility(groupCallActivity7.fullscreenUsersListView, z5);
                    GroupCallActivity.this.fullscreenUsersListView.setVisibility(z5 ? 0 : 8);
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
                if (Build.VERSION.SDK_INT >= 21) {
                    setPadding(((BottomSheet) GroupCallActivity.this).backgroundPaddingLeft, GroupCallActivity.this.getStatusBarHeight(), ((BottomSheet) GroupCallActivity.this).backgroundPaddingLeft, 0);
                }
                int paddingTop = (size - getPaddingTop()) - AndroidUtilities.dp(245.0f);
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
                int dp2 = AndroidUtilities.dp(150.0f);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) GroupCallActivity.this.listView.getLayoutParams();
                if (GroupCallActivity.isTabletMode) {
                    layoutParams3.gravity = GroupCallActivity.this.hasVideo ? 5 : 1;
                    layoutParams3.width = AndroidUtilities.dp(320.0f);
                    int dp3 = AndroidUtilities.dp(4.0f);
                    layoutParams3.leftMargin = dp3;
                    layoutParams3.rightMargin = dp3;
                    layoutParams3.bottomMargin = dp2;
                    layoutParams3.topMargin = ActionBar.getCurrentActionBarHeight();
                    i10 = AndroidUtilities.dp(60.0f);
                } else if (GroupCallActivity.isLandscapeMode) {
                    layoutParams3.gravity = 51;
                    layoutParams3.width = -1;
                    layoutParams3.topMargin = ActionBar.getCurrentActionBarHeight();
                    layoutParams3.bottomMargin = AndroidUtilities.dp(14.0f);
                    layoutParams3.rightMargin = AndroidUtilities.dp(90.0f);
                    layoutParams3.leftMargin = AndroidUtilities.dp(14.0f);
                    i10 = 0;
                } else {
                    layoutParams3.gravity = 51;
                    layoutParams3.width = -1;
                    int dp4 = AndroidUtilities.dp(60.0f);
                    layoutParams3.bottomMargin = dp2;
                    layoutParams3.topMargin = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.dp(14.0f);
                    int dp5 = AndroidUtilities.dp(14.0f);
                    layoutParams3.leftMargin = dp5;
                    layoutParams3.rightMargin = dp5;
                    i10 = dp4;
                }
                if (!GroupCallActivity.isLandscapeMode || GroupCallActivity.isTabletMode) {
                    GroupCallActivity.this.buttonsBackgroundGradientView.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) GroupCallActivity.this.buttonsBackgroundGradientView.getLayoutParams();
                    layoutParams4.bottomMargin = dp2;
                    if (GroupCallActivity.isTabletMode) {
                        layoutParams4.gravity = GroupCallActivity.this.hasVideo ? 85 : 81;
                        layoutParams4.width = AndroidUtilities.dp(328.0f);
                    } else {
                        layoutParams4.width = -1;
                    }
                    GroupCallActivity.this.buttonsBackgroundGradientView2.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) GroupCallActivity.this.buttonsBackgroundGradientView2.getLayoutParams();
                    layoutParams5.height = dp2;
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
                    layoutParams6.height = AndroidUtilities.dp(200.0f);
                    layoutParams6.gravity = GroupCallActivity.this.hasVideo ? 85 : 81;
                    layoutParams6.rightMargin = 0;
                } else if (GroupCallActivity.isLandscapeMode) {
                    layoutParams6.width = AndroidUtilities.dp(90.0f);
                    layoutParams6.height = -1;
                    layoutParams6.gravity = 53;
                } else {
                    layoutParams6.width = -1;
                    layoutParams6.height = AndroidUtilities.dp(200.0f);
                    layoutParams6.gravity = 81;
                    layoutParams6.rightMargin = 0;
                }
                if (GroupCallActivity.isLandscapeMode && !GroupCallActivity.isTabletMode) {
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBar.getLayoutParams()).rightMargin = AndroidUtilities.dp(90.0f);
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.menuItemsContainer.getLayoutParams()).rightMargin = AndroidUtilities.dp(90.0f);
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBarBackground.getLayoutParams()).rightMargin = AndroidUtilities.dp(90.0f);
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBarShadow.getLayoutParams()).rightMargin = AndroidUtilities.dp(90.0f);
                } else {
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBar.getLayoutParams()).rightMargin = 0;
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.menuItemsContainer.getLayoutParams()).rightMargin = 0;
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBarBackground.getLayoutParams()).rightMargin = 0;
                    ((FrameLayout.LayoutParams) GroupCallActivity.this.actionBarShadow.getLayoutParams()).rightMargin = 0;
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
                int max = GroupCallActivity.isTabletMode ? 0 : Math.max(0, (paddingTop - Math.max(AndroidUtilities.dp(259.0f), (paddingTop / 5) * 3)) + AndroidUtilities.dp(8.0f));
                if (GroupCallActivity.this.listView.getPaddingTop() != max || GroupCallActivity.this.listView.getPaddingBottom() != i10) {
                    GroupCallActivity.this.listView.setPadding(0, max, 0, i10);
                }
                if (GroupCallActivity.this.scheduleStartAtTextView != null) {
                    int dp6 = max + (((paddingTop - max) + AndroidUtilities.dp(60.0f)) / 2);
                    FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) GroupCallActivity.this.scheduleStartInTextView.getLayoutParams();
                    layoutParams8.topMargin = dp6 - AndroidUtilities.dp(30.0f);
                    FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) GroupCallActivity.this.scheduleStartAtTextView.getLayoutParams();
                    layoutParams9.topMargin = AndroidUtilities.dp(80.0f) + dp6;
                    FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) GroupCallActivity.this.scheduleTimeTextView.getLayoutParams();
                    if (layoutParams8.topMargin < ActionBar.getCurrentActionBarHeight() || layoutParams9.topMargin + AndroidUtilities.dp(20.0f) > size - AndroidUtilities.dp(231.0f)) {
                        GroupCallActivity.this.scheduleStartInTextView.setVisibility(4);
                        GroupCallActivity.this.scheduleStartAtTextView.setVisibility(4);
                        layoutParams10.topMargin = dp6 - AndroidUtilities.dp(20.0f);
                    } else {
                        GroupCallActivity.this.scheduleStartInTextView.setVisibility(0);
                        GroupCallActivity.this.scheduleStartAtTextView.setVisibility(0);
                        layoutParams10.topMargin = dp6;
                    }
                }
                for (int i13 = 0; i13 < GroupCallActivity.this.attachedRenderers.size(); i13++) {
                    ((GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderers.get(i13)).setFullscreenMode(GroupCallActivity.this.renderersContainer.inFullscreenMode, true);
                }
                this.ignoreLayout = false;
                super.onMeasure(i8, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
                if (measuredHeight != this.lastSize) {
                    this.lastSize = measuredHeight;
                    GroupCallActivity.this.dismissAvatarPreview(false);
                }
                GroupCallActivity.this.cellFlickerDrawable.setParentWidth(getMeasuredWidth());
            }

            @Override
            protected void onLayout(boolean z2, int i8, int i9, int i10, int i11) {
                float f;
                boolean z3;
                if (GroupCallActivity.isTabletMode && this.localHasVideo != GroupCallActivity.this.hasVideo && this.wasLayout) {
                    f = GroupCallActivity.this.listView.getX();
                    z3 = true;
                } else {
                    f = 0.0f;
                    z3 = false;
                }
                this.localHasVideo = GroupCallActivity.this.hasVideo;
                GroupCallActivity.this.renderersContainer.inLayout = true;
                super.onLayout(z2, i8, i9, i10, i11);
                GroupCallActivity.this.renderersContainer.inLayout = false;
                GroupCallActivity.this.updateLayout(false);
                this.wasLayout = true;
                if (!z3 || GroupCallActivity.this.listView.getLeft() == f) {
                    return;
                }
                float left = f - GroupCallActivity.this.listView.getLeft();
                GroupCallActivity.this.listView.setTranslationX(left);
                GroupCallActivity.this.buttonsContainer.setTranslationX(left);
                GroupCallActivity.this.buttonsBackgroundGradientView.setTranslationX(left);
                GroupCallActivity.this.buttonsBackgroundGradientView2.setTranslationX(left);
                ViewPropertyAnimator duration = GroupCallActivity.this.listView.animate().translationX(0.0f).setDuration(350L);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                duration.setInterpolator(cubicBezierInterpolator).start();
                GroupCallActivity.this.buttonsBackgroundGradientView.animate().translationX(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
                GroupCallActivity.this.buttonsBackgroundGradientView2.animate().translationX(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
                GroupCallActivity.this.buttonsContainer.animate().translationX(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
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
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    if (groupCallActivity.previewDialog == null && !groupCallActivity.renderersContainer.inFullscreenMode) {
                        GroupCallActivity.this.dismiss();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
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
            protected void onDraw(Canvas canvas) {
                float f;
                int dp = AndroidUtilities.dp(74.0f);
                float f2 = GroupCallActivity.this.scrollOffsetY - dp;
                int measuredHeight = getMeasuredHeight() + AndroidUtilities.dp(15.0f) + ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop;
                if (((BottomSheet) GroupCallActivity.this).backgroundPaddingTop + f2 < ActionBar.getCurrentActionBarHeight()) {
                    int dp2 = (dp - ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
                    float min = Math.min(1.0f, ((ActionBar.getCurrentActionBarHeight() - f2) - ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop) / dp2);
                    int currentActionBarHeight = (int) ((ActionBar.getCurrentActionBarHeight() - dp2) * min);
                    f2 -= currentActionBarHeight;
                    measuredHeight += currentActionBarHeight;
                    f = 1.0f - min;
                } else {
                    f = 1.0f;
                }
                float paddingTop = f2 + getPaddingTop();
                if (GroupCallActivity.this.renderersContainer.progressToFullscreenMode != 1.0f) {
                    GroupCallActivity.this.shadowDrawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), measuredHeight);
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
                    Theme.dialogs_onlineCirclePaint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_voipgroup_actionBar), (int) (GroupCallActivity.this.renderersContainer.progressToFullscreenMode * 255.0f)));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), Theme.dialogs_onlineCirclePaint);
                }
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                float f;
                float f2;
                float f3;
                View view;
                float alpha;
                float y;
                float left;
                GroupCallUserCell groupCallUserCell;
                Path path;
                float[] fArr;
                GroupCallUserCell groupCallUserCell2;
                float f4;
                GroupCallUserCell groupCallUserCell3;
                float left2;
                float f5;
                float f6;
                float top;
                if (GroupCallActivity.isTabletMode) {
                    GroupCallActivity.this.buttonsContainer.setTranslationY(0.0f);
                    GroupCallActivity.this.fullscreenUsersListView.setTranslationY(0.0f);
                    GroupCallActivity.this.buttonsContainer.setTranslationX(0.0f);
                    GroupCallActivity.this.fullscreenUsersListView.setTranslationY(0.0f);
                } else if (GroupCallActivity.isLandscapeMode) {
                    GroupCallActivity.this.buttonsContainer.setTranslationY(0.0f);
                    GroupCallActivity.this.fullscreenUsersListView.setTranslationY(0.0f);
                    GroupCallActivity.this.buttonsContainer.setTranslationX(GroupCallActivity.this.progressToHideUi * AndroidUtilities.dp(94.0f));
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    groupCallActivity.fullscreenUsersListView.setTranslationX(groupCallActivity.progressToHideUi * AndroidUtilities.dp(94.0f));
                } else {
                    GroupCallActivity.this.buttonsContainer.setTranslationX(0.0f);
                    GroupCallActivity.this.fullscreenUsersListView.setTranslationX(0.0f);
                    GroupCallActivity.this.buttonsContainer.setTranslationY(GroupCallActivity.this.progressToHideUi * AndroidUtilities.dp(94.0f));
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    groupCallActivity2.fullscreenUsersListView.setTranslationY(groupCallActivity2.progressToHideUi * AndroidUtilities.dp(94.0f));
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
                if (GroupCallActivity.this.renderersContainer.isAnimating()) {
                    if (GroupCallActivity.this.fullscreenUsersListView.getVisibility() == 0) {
                        this.listCells.clear();
                        for (int i9 = 0; i9 < GroupCallActivity.this.listView.getChildCount(); i9++) {
                            View childAt2 = GroupCallActivity.this.listView.getChildAt(i9);
                            if ((childAt2 instanceof GroupCallGridCell) && GroupCallActivity.this.listView.getChildAdapterPosition(childAt2) >= 0) {
                                GroupCallGridCell groupCallGridCell = (GroupCallGridCell) childAt2;
                                if (groupCallGridCell.getRenderer() != GroupCallActivity.this.renderersContainer.fullscreenTextureView) {
                                    this.listCells.put(groupCallGridCell.getParticipant(), childAt2);
                                }
                            } else if ((childAt2 instanceof GroupCallUserCell) && GroupCallActivity.this.listView.getChildAdapterPosition(childAt2) >= 0) {
                                GroupCallUserCell groupCallUserCell4 = (GroupCallUserCell) childAt2;
                                this.listCells.put(groupCallUserCell4.getParticipant(), groupCallUserCell4);
                            }
                        }
                        for (int i10 = 0; i10 < GroupCallActivity.this.fullscreenUsersListView.getChildCount(); i10++) {
                            GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell5 = (GroupCallFullscreenAdapter.GroupCallUserCell) GroupCallActivity.this.fullscreenUsersListView.getChildAt(i10);
                            View view2 = this.listCells.get(groupCallUserCell5.getVideoParticipant());
                            if (view2 == null) {
                                view2 = this.listCells.get(groupCallUserCell5.getParticipant());
                            }
                            float f7 = GroupCallActivity.this.renderersContainer.progressToFullscreenMode;
                            if (!GroupCallActivity.this.fullscreenListItemAnimator.isRunning()) {
                                groupCallUserCell5.setAlpha(1.0f);
                            }
                            if (view2 != null) {
                                if (!(view2 instanceof GroupCallGridCell)) {
                                    left2 = ((groupCallUserCell3.getLeft() + GroupCallActivity.this.listView.getX()) - GroupCallActivity.this.renderersContainer.getLeft()) + groupCallUserCell3.getAvatarImageView().getLeft() + (groupCallUserCell3.getAvatarImageView().getMeasuredWidth() >> 1);
                                    float top2 = ((groupCallUserCell3.getTop() + GroupCallActivity.this.listView.getY()) - GroupCallActivity.this.renderersContainer.getTop()) + groupCallUserCell3.getAvatarImageView().getTop() + (groupCallUserCell3.getAvatarImageView().getMeasuredHeight() >> 1);
                                    float left3 = groupCallUserCell5.getLeft() + GroupCallActivity.this.fullscreenUsersListView.getX() + (groupCallUserCell5.getMeasuredWidth() >> 1);
                                    ((GroupCallUserCell) view2).setDrawAvatar(false);
                                    f5 = top2;
                                    f6 = left3;
                                    top = groupCallUserCell5.getTop() + GroupCallActivity.this.fullscreenUsersListView.getY() + (groupCallUserCell5.getMeasuredHeight() >> 1);
                                } else {
                                    GroupCallGridCell groupCallGridCell2 = (GroupCallGridCell) view2;
                                    left2 = (groupCallGridCell2.getLeft() + GroupCallActivity.this.listView.getX()) - GroupCallActivity.this.renderersContainer.getLeft();
                                    f5 = (groupCallGridCell2.getTop() + GroupCallActivity.this.listView.getY()) - GroupCallActivity.this.renderersContainer.getTop();
                                    f6 = groupCallUserCell5.getLeft() + GroupCallActivity.this.fullscreenUsersListView.getX();
                                    top = groupCallUserCell5.getTop() + GroupCallActivity.this.fullscreenUsersListView.getY();
                                }
                                float f8 = left2 - f6;
                                float f9 = 1.0f - f7;
                                groupCallUserCell5.setTranslationX(f8 * f9);
                                groupCallUserCell5.setTranslationY((f5 - top) * f9);
                                groupCallUserCell5.setScaleX(1.0f);
                                groupCallUserCell5.setScaleY(1.0f);
                                groupCallUserCell5.setProgressToFullscreen(f7);
                            } else {
                                groupCallUserCell5.setScaleX(1.0f);
                                groupCallUserCell5.setScaleY(1.0f);
                                groupCallUserCell5.setTranslationX(0.0f);
                                groupCallUserCell5.setTranslationY(0.0f);
                                groupCallUserCell5.setProgressToFullscreen(1.0f);
                                if (groupCallUserCell5.getRenderer() == null) {
                                    groupCallUserCell5.setAlpha(f7);
                                }
                            }
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < GroupCallActivity.this.fullscreenUsersListView.getChildCount(); i11++) {
                        ((GroupCallFullscreenAdapter.GroupCallUserCell) GroupCallActivity.this.fullscreenUsersListView.getChildAt(i11)).setProgressToFullscreen(1.0f);
                    }
                }
                for (int i12 = 0; i12 < GroupCallActivity.this.attachedRenderers.size(); i12++) {
                    RecyclerListView recyclerListView = GroupCallActivity.this.listView;
                    GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                    ((GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderers.get(i12)).updatePosition(recyclerListView, groupCallActivity3.tabletVideoGridView, groupCallActivity3.fullscreenUsersListView, groupCallActivity3.renderersContainer);
                }
                if (!GroupCallActivity.isTabletMode) {
                    GroupCallActivity.this.buttonsBackgroundGradientView.setAlpha(1.0f - GroupCallActivity.this.renderersContainer.progressToFullscreenMode);
                    GroupCallActivity.this.buttonsBackgroundGradientView2.setAlpha(1.0f - GroupCallActivity.this.renderersContainer.progressToFullscreenMode);
                } else {
                    GroupCallActivity.this.buttonsBackgroundGradientView.setAlpha(1.0f);
                    GroupCallActivity.this.buttonsBackgroundGradientView2.setAlpha(1.0f);
                }
                if (GroupCallActivity.this.renderersContainer.swipedBack) {
                    GroupCallActivity.this.listView.setAlpha(1.0f - GroupCallActivity.this.renderersContainer.progressToFullscreenMode);
                } else {
                    GroupCallActivity.this.listView.setAlpha(1.0f);
                }
                super.dispatchDraw(canvas);
                GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                if (groupCallActivity4.drawingForBlur) {
                    return;
                }
                float f10 = 255.0f;
                if (groupCallActivity4.avatarsPreviewShowed) {
                    if (GroupCallActivity.this.scrimView != null) {
                        if (!GroupCallActivity.this.useBlur) {
                            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), GroupCallActivity.this.scrimPaint);
                        }
                        float y2 = GroupCallActivity.this.listView.getY();
                        float[] fArr2 = new float[8];
                        Path path2 = new Path();
                        int childCount = GroupCallActivity.this.listView.getChildCount();
                        float y3 = GroupCallActivity.this.listView.getY() + GroupCallActivity.this.listView.getMeasuredHeight();
                        GroupCallUserCell groupCallUserCell6 = null;
                        if (GroupCallActivity.this.hasScrimAnchorView) {
                            int i13 = 0;
                            while (true) {
                                if (i13 >= childCount) {
                                    break;
                                } else if (GroupCallActivity.this.listView.getChildAt(i13) == GroupCallActivity.this.scrimView) {
                                    groupCallUserCell6 = GroupCallActivity.this.scrimView;
                                    break;
                                } else {
                                    i13++;
                                }
                            }
                        } else {
                            groupCallUserCell6 = GroupCallActivity.this.scrimView;
                        }
                        GroupCallUserCell groupCallUserCell7 = groupCallUserCell6;
                        if (groupCallUserCell7 != null && y2 < y3) {
                            canvas.save();
                            if (GroupCallActivity.this.scrimFullscreenView == null) {
                                canvas.clipRect(0.0f, (1.0f - GroupCallActivity.this.progressToAvatarPreview) * y2, getMeasuredWidth(), ((1.0f - GroupCallActivity.this.progressToAvatarPreview) * y3) + (getMeasuredHeight() * GroupCallActivity.this.progressToAvatarPreview));
                            }
                            if (!GroupCallActivity.this.hasScrimAnchorView) {
                                y = GroupCallActivity.this.avatarPreviewContainer.getTop() + GroupCallActivity.this.avatarPreviewContainer.getMeasuredWidth();
                                left = GroupCallActivity.this.avatarPreviewContainer.getLeft();
                            } else {
                                y = ((GroupCallActivity.this.listView.getY() + groupCallUserCell7.getY()) * (1.0f - GroupCallActivity.this.progressToAvatarPreview)) + ((GroupCallActivity.this.avatarPreviewContainer.getTop() + GroupCallActivity.this.avatarPreviewContainer.getMeasuredWidth()) * GroupCallActivity.this.progressToAvatarPreview);
                                left = ((GroupCallActivity.this.listView.getLeft() + groupCallUserCell7.getX()) * (1.0f - GroupCallActivity.this.progressToAvatarPreview)) + (GroupCallActivity.this.avatarPreviewContainer.getLeft() * GroupCallActivity.this.progressToAvatarPreview);
                            }
                            float f11 = y;
                            canvas.translate(left, f11);
                            if (!GroupCallActivity.this.hasScrimAnchorView) {
                                groupCallUserCell = groupCallUserCell7;
                                path = path2;
                                fArr = fArr2;
                                canvas.saveLayerAlpha(0.0f, 0.0f, groupCallUserCell7.getMeasuredWidth(), groupCallUserCell7.getClipHeight(), (int) (GroupCallActivity.this.progressToAvatarPreview * 255.0f), 31);
                            } else {
                                groupCallUserCell = groupCallUserCell7;
                                path = path2;
                                fArr = fArr2;
                                canvas.save();
                            }
                            float measuredHeight = (int) (groupCallUserCell.getMeasuredHeight() + ((groupCallUserCell.getClipHeight() - groupCallUserCell.getMeasuredHeight()) * (1.0f - CubicBezierInterpolator.EASE_OUT.getInterpolation(1.0f - GroupCallActivity.this.progressToAvatarPreview))));
                            this.rect.set(0.0f, 0.0f, groupCallUserCell.getMeasuredWidth(), measuredHeight);
                            if (GroupCallActivity.this.hasScrimAnchorView) {
                                f4 = GroupCallActivity.this.progressToAvatarPreview;
                                groupCallUserCell2 = groupCallUserCell;
                            } else {
                                groupCallUserCell2 = groupCallUserCell;
                                f4 = 1.0f;
                            }
                            groupCallUserCell2.setProgressToAvatarPreview(f4);
                            for (int i14 = 0; i14 < 4; i14++) {
                                fArr[i14] = AndroidUtilities.dp(13.0f) * (1.0f - GroupCallActivity.this.progressToAvatarPreview);
                                fArr[i14 + 4] = AndroidUtilities.dp(13.0f);
                            }
                            path.reset();
                            Path path3 = path;
                            path3.addRoundRect(this.rect, fArr, Path.Direction.CW);
                            path3.close();
                            canvas.drawPath(path3, GroupCallActivity.this.listViewBackgroundPaint);
                            groupCallUserCell2.draw(canvas);
                            canvas.restore();
                            canvas.restore();
                            if (GroupCallActivity.this.scrimPopupLayout != null) {
                                float f12 = f11 + measuredHeight;
                                float measuredWidth = (getMeasuredWidth() - GroupCallActivity.this.scrimPopupLayout.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                                if (GroupCallActivity.this.progressToAvatarPreview != 1.0f) {
                                    canvas.saveLayerAlpha(measuredWidth, f12, measuredWidth + GroupCallActivity.this.scrimPopupLayout.getMeasuredWidth(), f12 + GroupCallActivity.this.scrimPopupLayout.getMeasuredHeight(), (int) (GroupCallActivity.this.progressToAvatarPreview * 255.0f), 31);
                                } else {
                                    canvas.save();
                                }
                                GroupCallActivity.this.scrimPopupLayout.setTranslationX(measuredWidth - GroupCallActivity.this.scrimPopupLayout.getLeft());
                                GroupCallActivity.this.scrimPopupLayout.setTranslationY(f12 - GroupCallActivity.this.scrimPopupLayout.getTop());
                                float f13 = (GroupCallActivity.this.progressToAvatarPreview * 0.2f) + 0.8f;
                                canvas.scale(f13, f13, (GroupCallActivity.this.scrimPopupLayout.getMeasuredWidth() / 2.0f) + measuredWidth, f12);
                                canvas.translate(measuredWidth, f12);
                                GroupCallActivity.this.scrimPopupLayout.draw(canvas);
                                canvas.restore();
                            }
                        }
                        if (!GroupCallActivity.this.pinchToZoomHelper.isInOverlayMode()) {
                            canvas.save();
                            if (GroupCallActivity.this.hasScrimAnchorView && GroupCallActivity.this.scrimFullscreenView == null) {
                                canvas.clipRect(0.0f, y2 * (1.0f - GroupCallActivity.this.progressToAvatarPreview), getMeasuredWidth(), (y3 * (1.0f - GroupCallActivity.this.progressToAvatarPreview)) + (getMeasuredHeight() * GroupCallActivity.this.progressToAvatarPreview));
                            }
                            canvas.scale(GroupCallActivity.this.avatarPreviewContainer.getScaleX(), GroupCallActivity.this.avatarPreviewContainer.getScaleY(), GroupCallActivity.this.avatarPreviewContainer.getX(), GroupCallActivity.this.avatarPreviewContainer.getY());
                            canvas.translate(GroupCallActivity.this.avatarPreviewContainer.getX(), GroupCallActivity.this.avatarPreviewContainer.getY());
                            GroupCallActivity.this.avatarPreviewContainer.draw(canvas);
                            canvas.restore();
                        }
                    }
                    if (GroupCallActivity.this.progressToAvatarPreview == 1.0f || GroupCallActivity.this.scrimFullscreenView != null) {
                        return;
                    }
                    canvas.saveLayerAlpha((int) GroupCallActivity.this.buttonsBackgroundGradientView2.getX(), (int) GroupCallActivity.this.buttonsBackgroundGradientView.getY(), (int) (GroupCallActivity.this.buttonsBackgroundGradientView2.getX() + GroupCallActivity.this.buttonsBackgroundGradientView2.getMeasuredWidth()), getMeasuredHeight(), (int) ((1.0f - GroupCallActivity.this.progressToAvatarPreview) * 255.0f), 31);
                    canvas.save();
                    canvas.translate(GroupCallActivity.this.buttonsBackgroundGradientView2.getX(), GroupCallActivity.this.buttonsBackgroundGradientView2.getY());
                    GroupCallActivity.this.buttonsBackgroundGradientView2.draw(canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(GroupCallActivity.this.buttonsBackgroundGradientView.getX(), GroupCallActivity.this.buttonsBackgroundGradientView.getY());
                    GroupCallActivity.this.buttonsBackgroundGradientView.draw(canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(GroupCallActivity.this.buttonsContainer.getX(), GroupCallActivity.this.buttonsContainer.getY());
                    GroupCallActivity.this.buttonsContainer.draw(canvas);
                    canvas.restore();
                    for (int i15 = 0; i15 < 2; i15++) {
                        if (GroupCallActivity.this.undoView[i15].getVisibility() == 0) {
                            canvas.save();
                            canvas.translate(GroupCallActivity.this.undoView[1].getX(), GroupCallActivity.this.undoView[1].getY());
                            GroupCallActivity.this.undoView[1].draw(canvas);
                            canvas.restore();
                        }
                    }
                    canvas.restore();
                } else if (GroupCallActivity.this.scrimView != null) {
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), GroupCallActivity.this.scrimPaint);
                    float y4 = GroupCallActivity.this.listView.getY();
                    GroupCallActivity.this.listView.getY();
                    GroupCallActivity.this.listView.getMeasuredHeight();
                    if (GroupCallActivity.this.hasScrimAnchorView) {
                        int childCount2 = GroupCallActivity.this.listView.getChildCount();
                        int i16 = 0;
                        while (i16 < childCount2) {
                            View childAt3 = GroupCallActivity.this.listView.getChildAt(i16);
                            if (childAt3 == GroupCallActivity.this.scrimView) {
                                float max = Math.max(GroupCallActivity.this.listView.getLeft(), GroupCallActivity.this.listView.getLeft() + childAt3.getX());
                                float max2 = Math.max(y4, GroupCallActivity.this.listView.getY() + childAt3.getY());
                                float min = Math.min(GroupCallActivity.this.listView.getRight(), GroupCallActivity.this.listView.getLeft() + childAt3.getX() + childAt3.getMeasuredWidth());
                                float min2 = Math.min(GroupCallActivity.this.listView.getY() + GroupCallActivity.this.listView.getMeasuredHeight(), GroupCallActivity.this.listView.getY() + childAt3.getY() + GroupCallActivity.this.scrimView.getClipHeight());
                                if (max2 < min2) {
                                    if (childAt3.getAlpha() != 1.0f) {
                                        f = min;
                                        f2 = max2;
                                        f3 = max;
                                        view = childAt3;
                                        canvas.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * f10), 31);
                                    } else {
                                        f = min;
                                        f2 = max2;
                                        f3 = max;
                                        view = childAt3;
                                        canvas.save();
                                    }
                                    canvas.clipRect(f3, f2, f, getMeasuredHeight());
                                    canvas.translate(GroupCallActivity.this.listView.getLeft() + view.getX(), GroupCallActivity.this.listView.getY() + view.getY());
                                    this.rect.set(0.0f, 0.0f, view.getMeasuredWidth(), (int) (GroupCallActivity.this.scrimView.getMeasuredHeight() + ((GroupCallActivity.this.scrimView.getClipHeight() - GroupCallActivity.this.scrimView.getMeasuredHeight()) * (1.0f - CubicBezierInterpolator.EASE_OUT.getInterpolation(1.0f - alpha)))));
                                    GroupCallActivity.this.scrimView.setAboutVisibleProgress(GroupCallActivity.this.listViewBackgroundPaint.getColor(), GroupCallActivity.this.scrimPaint.getAlpha() / 100.0f);
                                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), GroupCallActivity.this.listViewBackgroundPaint);
                                    view.draw(canvas);
                                    canvas.restore();
                                    i16++;
                                    f10 = 255.0f;
                                }
                            }
                            i16++;
                            f10 = 255.0f;
                        }
                    } else if (GroupCallActivity.this.scrimFullscreenView == null) {
                        if (GroupCallActivity.this.scrimRenderer == null || !GroupCallActivity.this.scrimRenderer.isAttached()) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(GroupCallActivity.this.scrimRenderer.getX() + GroupCallActivity.this.renderersContainer.getX(), GroupCallActivity.this.scrimRenderer.getY() + GroupCallActivity.this.renderersContainer.getY());
                        GroupCallActivity.this.scrimRenderer.draw(canvas);
                        canvas.restore();
                    } else {
                        canvas.save();
                        canvas.translate(GroupCallActivity.this.scrimFullscreenView.getX() + GroupCallActivity.this.fullscreenUsersListView.getX() + GroupCallActivity.this.renderersContainer.getX(), GroupCallActivity.this.scrimFullscreenView.getY() + GroupCallActivity.this.fullscreenUsersListView.getY() + GroupCallActivity.this.renderersContainer.getY());
                        if (GroupCallActivity.this.scrimFullscreenView.getRenderer() == null || !GroupCallActivity.this.scrimFullscreenView.getRenderer().isAttached() || GroupCallActivity.this.scrimFullscreenView.getRenderer().showingInFullscreen) {
                            GroupCallActivity.this.scrimFullscreenView.draw(canvas);
                        } else {
                            GroupCallActivity.this.scrimFullscreenView.getRenderer().draw(canvas);
                        }
                        GroupCallActivity.this.scrimFullscreenView.drawOverlays(canvas);
                        canvas.restore();
                    }
                }
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (!GroupCallActivity.isTabletMode && GroupCallActivity.this.renderersContainer.progressToFullscreenMode == 1.0f && (view == GroupCallActivity.this.actionBar || view == GroupCallActivity.this.actionBarShadow || view == GroupCallActivity.this.actionBarBackground || view == GroupCallActivity.this.titleTextView || view == GroupCallActivity.this.menuItemsContainer)) {
                    return true;
                }
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                if (!groupCallActivity.drawingForBlur || view != groupCallActivity.renderersContainer) {
                    if (view == GroupCallActivity.this.avatarPreviewContainer || view == GroupCallActivity.this.scrimPopupLayout || view == GroupCallActivity.this.scrimView) {
                        return true;
                    }
                    if (GroupCallActivity.this.contentFullyOverlayed && GroupCallActivity.this.useBlur && (view == GroupCallActivity.this.listView || view == GroupCallActivity.this.buttonsContainer)) {
                        return true;
                    }
                    if (GroupCallActivity.this.scrimFullscreenView == null) {
                        GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                        if (!groupCallActivity2.drawingForBlur && groupCallActivity2.avatarsPreviewShowed && (view == GroupCallActivity.this.buttonsBackgroundGradientView2 || view == GroupCallActivity.this.buttonsBackgroundGradientView || view == GroupCallActivity.this.buttonsContainer || view == GroupCallActivity.this.undoView[0] || view == GroupCallActivity.this.undoView[1])) {
                            return true;
                        }
                    }
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.translate(GroupCallActivity.this.renderersContainer.getX() + GroupCallActivity.this.fullscreenUsersListView.getX(), GroupCallActivity.this.renderersContainer.getY() + GroupCallActivity.this.fullscreenUsersListView.getY());
                GroupCallActivity.this.fullscreenUsersListView.draw(canvas);
                canvas.restore();
                return true;
            }

            @Override
            public boolean onKeyDown(int i8, KeyEvent keyEvent) {
                if (GroupCallActivity.this.scrimView != null && i8 == 4) {
                    GroupCallActivity.this.dismissAvatarPreview(true);
                    return true;
                }
                return super.onKeyDown(i8, keyEvent);
            }
        };
        this.containerView = frameLayout;
        frameLayout.setFocusable(true);
        this.containerView.setFocusableInTouchMode(true);
        this.containerView.setWillNotDraw(false);
        ViewGroup viewGroup2 = this.containerView;
        int i8 = this.backgroundPaddingLeft;
        viewGroup2.setPadding(i8, 0, i8, 0);
        this.containerView.setKeepScreenOn(true);
        this.containerView.setClipChildren(false);
        if (tLRPC$InputPeer != null) {
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.scheduleStartInTextView = simpleTextView;
            simpleTextView.setGravity(17);
            this.scheduleStartInTextView.setTextColor(-1);
            this.scheduleStartInTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.scheduleStartInTextView.setTextSize(18);
            this.scheduleStartInTextView.setText(LocaleController.getString("VoipChatStartsIn", R.string.VoipChatStartsIn));
            this.containerView.addView(this.scheduleStartInTextView, LayoutHelper.createFrame(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            SimpleTextView simpleTextView2 = new SimpleTextView(context) {
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
                    boolean createLayout = super.createLayout(i9);
                    int textWidth = getTextWidth();
                    if (textWidth != this.lastTextWidth) {
                        float f = textWidth;
                        this.gradientWidth = 1.3f * f;
                        int i10 = Theme.key_voipgroup_mutedByAdminGradient2;
                        this.linearGradient = new LinearGradient(0.0f, getTextHeight(), f * 2.0f, 0.0f, new int[]{Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient), Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient3), Theme.getColor(i10), Theme.getColor(i10)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
                        getPaint().setShader(this.linearGradient);
                        this.lastTextWidth = textWidth;
                    }
                    return createLayout;
                }

                @Override
                public void onDraw(android.graphics.Canvas r9) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.AnonymousClass8.onDraw(android.graphics.Canvas):void");
                }
            };
            this.scheduleTimeTextView = simpleTextView2;
            simpleTextView2.setGravity(17);
            this.scheduleTimeTextView.setTextColor(-1);
            this.scheduleTimeTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.scheduleTimeTextView.setTextSize(60);
            this.containerView.addView(this.scheduleTimeTextView, LayoutHelper.createFrame(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            SimpleTextView simpleTextView3 = new SimpleTextView(context);
            this.scheduleStartAtTextView = simpleTextView3;
            simpleTextView3.setGravity(17);
            this.scheduleStartAtTextView.setTextColor(-1);
            this.scheduleStartAtTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.scheduleStartAtTextView.setTextSize(18);
            this.containerView.addView(this.scheduleStartAtTextView, LayoutHelper.createFrame(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            private final LongSparseIntArray visiblePeerTmp = new LongSparseIntArray();

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (view == GroupCallActivity.this.scrimView) {
                    return false;
                }
                return super.drawChild(canvas, view, j);
            }

            @Override
            public void dispatchDraw(android.graphics.Canvas r18) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.AnonymousClass9.dispatchDraw(android.graphics.Canvas):void");
            }

            @Override
            public void setVisibility(int i9) {
                if (getVisibility() != i9) {
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        View childAt = getChildAt(i10);
                        if (childAt instanceof GroupCallGridCell) {
                            GroupCallActivity.this.attachRenderer((GroupCallGridCell) childAt, i9 == 0);
                        }
                    }
                }
                super.setVisibility(i9);
            }

            @Override
            public void onLayout(boolean z2, int i9, int i10, int i11, int i12) {
                super.onLayout(z2, i9, i10, i11, i12);
                GroupCallActivity.this.itemAnimator.updateBackgroundBeforeAnimation();
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setClipToPadding(false);
        this.listView.setClipChildren(false);
        GroupCallItemAnimator groupCallItemAnimator = new GroupCallItemAnimator();
        this.itemAnimator = groupCallItemAnimator;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        groupCallItemAnimator.setTranslationInterpolator(cubicBezierInterpolator);
        this.itemAnimator.setRemoveDuration(350L);
        this.itemAnimator.setAddDuration(350L);
        this.itemAnimator.setMoveDuration(350L);
        this.itemAnimator.setDelayAnimations(false);
        this.listView.setItemAnimator(this.itemAnimator);
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i9, int i10) {
                GroupCallActivity groupCallActivity;
                ChatObject.Call call2;
                if (GroupCallActivity.this.listView.getChildCount() <= 0 || (call2 = (groupCallActivity = GroupCallActivity.this).call) == null) {
                    return;
                }
                if (!call2.loadingMembers && !call2.membersLoadEndReached && groupCallActivity.layoutManager.findLastVisibleItemPosition() > GroupCallActivity.this.listAdapter.getItemCount() - 5) {
                    GroupCallActivity.this.call.loadMembers(false);
                }
                GroupCallActivity.this.updateLayout(true);
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }

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
        });
        this.listView.setVerticalScrollBarEnabled(false);
        RecyclerListView recyclerListView2 = this.listView;
        FillLastGridLayoutManager fillLastGridLayoutManager = new FillLastGridLayoutManager(getContext(), isLandscapeMode ? 6 : 2, 1, false, 0, this.listView);
        this.layoutManager = fillLastGridLayoutManager;
        recyclerListView2.setLayoutManager(fillLastGridLayoutManager);
        FillLastGridLayoutManager fillLastGridLayoutManager2 = this.layoutManager;
        GridLayoutManager.SpanSizeLookup spanSizeLookup = new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i9) {
                int i10 = GroupCallActivity.isLandscapeMode ? 6 : 2;
                if (GroupCallActivity.isTabletMode || i9 < GroupCallActivity.this.listAdapter.usersVideoGridStartRow || i9 >= GroupCallActivity.this.listAdapter.usersVideoGridEndRow) {
                    return i10;
                }
                int i11 = GroupCallActivity.this.listAdapter.usersVideoGridEndRow - GroupCallActivity.this.listAdapter.usersVideoGridStartRow;
                int i12 = (i9 != GroupCallActivity.this.listAdapter.usersVideoGridEndRow - 1 || (!GroupCallActivity.isLandscapeMode && i11 % 2 == 0)) ? 1 : 2;
                if (GroupCallActivity.isLandscapeMode) {
                    if (i11 == 1) {
                        return 6;
                    }
                    return i11 == 2 ? 3 : 2;
                }
                return i12;
            }
        };
        this.spanSizeLookup = spanSizeLookup;
        fillLastGridLayoutManager2.setSpanSizeLookup(spanSizeLookup);
        this.listView.addItemDecoration(new RecyclerView.ItemDecoration() {
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
        this.layoutManager.setBind(false);
        this.containerView.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setTopBottomSelectorRadius(13);
        this.listView.setSelectorDrawableColor(Theme.getColor(Theme.key_voipgroup_listSelector));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i9) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i9);
            }

            @Override
            public void onDoubleTap(View view, int i9, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i9, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i9, float f, float f2) {
                GroupCallActivity.this.lambda$new$13(view, i9, f, f2);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i9) {
                boolean lambda$new$14;
                lambda$new$14 = GroupCallActivity.this.lambda$new$14(view, i9);
                return lambda$new$14;
            }
        });
        RecyclerListView recyclerListView3 = new RecyclerListView(context);
        this.tabletVideoGridView = recyclerListView3;
        this.containerView.addView(recyclerListView3, LayoutHelper.createFrame(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        RecyclerListView recyclerListView4 = this.tabletVideoGridView;
        GroupCallTabletGridAdapter groupCallTabletGridAdapter = new GroupCallTabletGridAdapter(call, this.currentAccount, this);
        this.tabletGridAdapter = groupCallTabletGridAdapter;
        recyclerListView4.setAdapter(groupCallTabletGridAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 6, 1, false);
        this.tabletVideoGridView.setLayoutManager(gridLayoutManager);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i9) {
                return GroupCallActivity.this.tabletGridAdapter.getSpanCount(i9);
            }
        });
        this.tabletVideoGridView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i9) {
                GroupCallActivity.this.lambda$new$15(view, i9);
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setTranslationInterpolator(cubicBezierInterpolator);
        defaultItemAnimator.setRemoveDuration(350L);
        defaultItemAnimator.setAddDuration(350L);
        defaultItemAnimator.setMoveDuration(350L);
        this.tabletVideoGridView.setItemAnimator(new DefaultItemAnimator() {
            @Override
            public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                GroupCallActivity.this.listView.invalidate();
                GroupCallActivity.this.renderersContainer.invalidate();
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                GroupCallActivity.this.updateLayout(true);
            }
        });
        this.tabletVideoGridView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i9, int i10) {
                super.onScrolled(recyclerView, i9, i10);
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }
        });
        this.tabletGridAdapter.setVisibility(this.tabletVideoGridView, false, false);
        this.tabletVideoGridView.setVisibility(8);
        this.buttonsContainer = new AnonymousClass17(context);
        int color = Theme.getColor(Theme.key_voipgroup_unmuteButton2);
        int red = Color.red(color);
        int green = Color.green(color);
        int blue = Color.blue(color);
        this.radialMatrix = new Matrix();
        this.radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(160.0f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.radialPaint = paint;
        paint.setShader(this.radialGradient);
        BlobDrawable blobDrawable = new BlobDrawable(9);
        this.tinyWaveDrawable = blobDrawable;
        BlobDrawable blobDrawable2 = new BlobDrawable(12);
        this.bigWaveDrawable = blobDrawable2;
        blobDrawable.minRadius = AndroidUtilities.dp(62.0f);
        blobDrawable.maxRadius = AndroidUtilities.dp(72.0f);
        blobDrawable.generateBlob();
        blobDrawable2.minRadius = AndroidUtilities.dp(65.0f);
        blobDrawable2.maxRadius = AndroidUtilities.dp(75.0f);
        blobDrawable2.generateBlob();
        Paint paint2 = blobDrawable.paint;
        int i9 = Theme.key_voipgroup_unmuteButton;
        paint2.setColor(ColorUtils.setAlphaComponent(Theme.getColor(i9), 38));
        blobDrawable2.paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(i9), 76));
        VoIPToggleButton voIPToggleButton = new VoIPToggleButton(context);
        this.soundButton = voIPToggleButton;
        voIPToggleButton.setCheckable(true);
        this.soundButton.setTextSize(12);
        this.buttonsContainer.addView(this.soundButton, LayoutHelper.createFrame(68, 80.0f));
        this.soundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$16(view);
            }
        });
        VoIPToggleButton voIPToggleButton2 = new VoIPToggleButton(context);
        this.cameraButton = voIPToggleButton2;
        voIPToggleButton2.setCheckable(true);
        this.cameraButton.setTextSize(12);
        this.cameraButton.showText(false, false);
        this.cameraButton.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        this.cameraButton.setVisibility(8);
        this.buttonsContainer.addView(this.cameraButton, LayoutHelper.createFrame(68, 80.0f));
        VoIPToggleButton voIPToggleButton3 = new VoIPToggleButton(context);
        this.flipButton = voIPToggleButton3;
        voIPToggleButton3.setCheckable(true);
        this.flipButton.setTextSize(12);
        this.flipButton.showText(false, false);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.flipButton.addView(rLottieImageView, LayoutHelper.createFrame(32, 32.0f, 0, 18.0f, 10.0f, 18.0f, 0.0f));
        int i10 = R.raw.camera_flip;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i10, "" + i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.flipIcon = rLottieDrawable;
        rLottieImageView.setAnimation(rLottieDrawable);
        this.flipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$17(view);
            }
        });
        this.flipButton.setVisibility(8);
        this.buttonsContainer.addView(this.flipButton, LayoutHelper.createFrame(68, 80.0f));
        VoIPToggleButton voIPToggleButton4 = new VoIPToggleButton(context);
        this.leaveButton = voIPToggleButton4;
        voIPToggleButton4.setDrawBackground(false);
        this.leaveButton.setTextSize(12);
        this.leaveButton.setData((this.call == null || !isRtmpStream()) ? R.drawable.calls_decline : R.drawable.msg_voiceclose, -1, Theme.getColor(Theme.key_voipgroup_leaveButton), 0.3f, false, LocaleController.getString("VoipGroupLeave", R.string.VoipGroupLeave), false, false);
        this.buttonsContainer.addView(this.leaveButton, LayoutHelper.createFrame(68, 80.0f));
        this.leaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$18(context, view);
            }
        });
        RLottieImageView rLottieImageView2 = new RLottieImageView(context) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (GroupCallActivity.this.isRtmpStream()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0 && GroupCallActivity.this.muteButtonState == 0) {
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    if (groupCallActivity.call != null) {
                        AndroidUtilities.runOnUIThread(groupCallActivity.pressRunnable, 300L);
                        GroupCallActivity.this.scheduled = true;
                        return super.onTouchEvent(motionEvent);
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
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
                        for (int i11 = 0; i11 < GroupCallActivity.this.attachedRenderersTmp.size(); i11++) {
                            ((GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderersTmp.get(i11)).updateAttachState(true);
                        }
                        GroupCallActivity.this.pressed = false;
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                        super.onTouchEvent(obtain);
                        obtain.recycle();
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            }

            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setEnabled(GroupCallActivity.this.muteButtonState == 0 || GroupCallActivity.this.muteButtonState == 1);
                if (GroupCallActivity.this.muteButtonState != 1 || Build.VERSION.SDK_INT < 21) {
                    return;
                }
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString("VoipMute", R.string.VoipMute)));
            }
        };
        this.muteButton = rLottieImageView2;
        rLottieImageView2.setAnimation(this.bigMicDrawable);
        this.muteButton.setScaleType(ImageView.ScaleType.CENTER);
        this.buttonsContainer.addView(this.muteButton, LayoutHelper.createFrame(122, 122, 49));
        this.muteButton.setOnClickListener(new AnonymousClass19());
        int dp = AndroidUtilities.dp(38.0f);
        ImageView imageView = new ImageView(context);
        this.expandButton = imageView;
        imageView.setScaleX(0.1f);
        this.expandButton.setScaleY(0.1f);
        this.expandButton.setAlpha(0.0f);
        this.expandButton.setImageResource(R.drawable.voice_expand);
        this.expandButton.setPadding(dp, dp, dp, dp);
        this.buttonsContainer.addView(this.expandButton, LayoutHelper.createFrame(122, 122, 49));
        ImageView imageView2 = new ImageView(context);
        this.minimizeButton = imageView2;
        imageView2.setScaleX(0.1f);
        this.minimizeButton.setScaleY(0.1f);
        this.minimizeButton.setAlpha(0.0f);
        this.minimizeButton.setImageResource(R.drawable.voice_minimize);
        this.minimizeButton.setPadding(dp, dp, dp, dp);
        this.buttonsContainer.addView(this.minimizeButton, LayoutHelper.createFrame(122, 122, 49));
        if (this.call != null && isRtmpStream() && !this.call.isScheduled()) {
            this.expandButton.setAlpha(1.0f);
            this.expandButton.setScaleX(1.0f);
            this.expandButton.setScaleY(1.0f);
            this.muteButton.setAlpha(0.0f);
        }
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.radialProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(110.0f));
        this.radialProgressView.setStrokeWidth(4.0f);
        this.radialProgressView.setProgressColor(Theme.getColor(Theme.key_voipgroup_connectingProgress));
        for (int i11 = 0; i11 < 2; i11++) {
            this.muteLabel[i11] = new TextView(context);
            this.muteLabel[i11].setTextColor(Theme.getColor(Theme.key_voipgroup_actionBarItems));
            this.muteLabel[i11].setTextSize(1, 18.0f);
            this.muteLabel[i11].setGravity(1);
            this.buttonsContainer.addView(this.muteLabel[i11], LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 26.0f));
        }
        this.actionBar.setAlpha(0.0f);
        this.actionBar.getBackButton().setScaleX(0.9f);
        this.actionBar.getBackButton().setScaleY(0.9f);
        this.actionBar.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        this.actionBar.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        this.actionBar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        this.actionBar.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        int i12 = Theme.key_voipgroup_actionBarItems;
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, 0, Theme.getColor(i12));
        this.otherItem = actionBarMenuItem;
        actionBarMenuItem.setLongClickEnabled(false);
        this.otherItem.setIcon(R.drawable.ic_ab_other);
        this.otherItem.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        this.otherItem.setSubMenuOpenSide(2);
        this.otherItem.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() {
            @Override
            public final void onItemClick(int i13) {
                GroupCallActivity.this.lambda$new$19(i13);
            }
        });
        ActionBarMenuItem actionBarMenuItem2 = this.otherItem;
        int i13 = Theme.key_voipgroup_actionBarItemsSelector;
        actionBarMenuItem2.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(i13), 6));
        this.otherItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$20(view);
            }
        });
        this.otherItem.setPopupItemsColor(Theme.getColor(i12), false);
        this.otherItem.setPopupItemsColor(Theme.getColor(i12), true);
        ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem(context, null, 0, Theme.getColor(i12));
        this.pipItem = actionBarMenuItem3;
        actionBarMenuItem3.setLongClickEnabled(false);
        this.pipItem.setIcon((this.call == null || !isRtmpStream()) ? R.drawable.msg_voice_pip : R.drawable.ic_goinline);
        ActionBarMenuItem actionBarMenuItem4 = this.pipItem;
        int i14 = R.string.AccDescrPipMode;
        actionBarMenuItem4.setContentDescription(LocaleController.getString("AccDescrPipMode", i14));
        this.pipItem.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(i13), 6));
        this.pipItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$21(view);
            }
        });
        ActionBarMenuItem actionBarMenuItem5 = new ActionBarMenuItem(context, null, 0, Theme.getColor(i12));
        this.screenShareItem = actionBarMenuItem5;
        actionBarMenuItem5.setLongClickEnabled(false);
        this.screenShareItem.setIcon(R.drawable.msg_screencast);
        this.screenShareItem.setContentDescription(LocaleController.getString("AccDescrPipMode", i14));
        this.screenShareItem.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(i13), 6));
        this.screenShareItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$22(view);
            }
        });
        this.titleTextView = new AnonymousClass20(context, context);
        View view = new View(this, context) {
            @Override
            protected void onMeasure(int i15, int i16) {
                setMeasuredDimension(View.MeasureSpec.getSize(i15), ActionBar.getCurrentActionBarHeight());
            }
        };
        this.actionBarBackground = view;
        view.setAlpha(0.0f);
        this.containerView.addView(this.actionBarBackground, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(this.titleTextView, LayoutHelper.createFrame(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.menuItemsContainer = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(this.screenShareItem, LayoutHelper.createLinear(48, 48));
        linearLayout.addView(this.pipItem, LayoutHelper.createLinear(48, 48));
        linearLayout.addView(this.otherItem, LayoutHelper.createLinear(48, 48));
        this.containerView.addView(linearLayout, LayoutHelper.createFrame(-2, 48, 53));
        View view2 = new View(context);
        this.actionBarShadow = view2;
        view2.setAlpha(0.0f);
        this.actionBarShadow.setBackgroundColor(Theme.getColor(Theme.key_dialogShadowLine));
        this.containerView.addView(this.actionBarShadow, LayoutHelper.createFrame(-1, 1.0f));
        for (int i15 = 0; i15 < 2; i15++) {
            this.undoView[i15] = new UndoView(context) {
                @Override
                public void showWithAction(long j, int i16, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
                    if (GroupCallActivity.this.previewDialog != null) {
                        return;
                    }
                    super.showWithAction(j, i16, obj, obj2, runnable, runnable2);
                }
            };
            this.undoView[i15].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            if (Build.VERSION.SDK_INT >= 21) {
                this.undoView[i15].setTranslationZ(AndroidUtilities.dp(5.0f));
            }
            this.containerView.addView(this.undoView[i15], LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        AccountSelectCell accountSelectCell = new AccountSelectCell(context, true);
        this.accountSelectCell = accountSelectCell;
        accountSelectCell.setTag(R.id.width_tag, 240);
        this.otherItem.addSubItem(8, this.accountSelectCell, -2, AndroidUtilities.dp(48.0f));
        this.otherItem.setShowSubmenuByMove(false);
        AccountSelectCell accountSelectCell2 = this.accountSelectCell;
        int i16 = Theme.key_voipgroup_listSelector;
        accountSelectCell2.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(i16), 6, 6));
        this.accountGap = this.otherItem.addGap(0);
        ActionBarMenuSubItem addSubItem = this.otherItem.addSubItem(1, 0, (CharSequence) LocaleController.getString("VoipGroupAllCanSpeak", R.string.VoipGroupAllCanSpeak), true);
        this.everyoneItem = addSubItem;
        addSubItem.updateSelectorBackground(true, false);
        ActionBarMenuSubItem addSubItem2 = this.otherItem.addSubItem(2, 0, (CharSequence) LocaleController.getString("VoipGroupOnlyAdminsCanSpeak", R.string.VoipGroupOnlyAdminsCanSpeak), true);
        this.adminItem = addSubItem2;
        addSubItem2.updateSelectorBackground(false, true);
        ActionBarMenuSubItem actionBarMenuSubItem = this.everyoneItem;
        int i17 = Theme.key_voipgroup_checkMenu;
        actionBarMenuSubItem.setCheckColor(i17);
        this.everyoneItem.setColors(Theme.getColor(i17), Theme.getColor(i17));
        this.adminItem.setCheckColor(i17);
        this.adminItem.setColors(Theme.getColor(i17), Theme.getColor(i17));
        Paint paint3 = new Paint(1);
        int i18 = Theme.key_voipgroup_actionBarItems;
        paint3.setColor(Theme.getColor(i18));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        ActionBarMenuSubItem addSubItem3 = this.otherItem.addSubItem(10, R.drawable.msg_voice_speaker, null, LocaleController.getString("VoipGroupAudio", R.string.VoipGroupAudio), true, false);
        this.soundItem = addSubItem3;
        addSubItem3.setItemHeight(56);
        ActionBarMenuSubItem addSubItem4 = this.otherItem.addSubItem(11, R.drawable.msg_noise_on, null, LocaleController.getString("VoipNoiseCancellation", R.string.VoipNoiseCancellation), true, false);
        this.noiseItem = addSubItem4;
        addSubItem4.setItemHeight(56);
        View addDivider = this.otherItem.addDivider(ColorUtils.blendARGB(Theme.getColor(Theme.key_voipgroup_actionBar), -16777216, 0.3f));
        this.soundItemDivider = addDivider;
        ((ViewGroup.MarginLayoutParams) addDivider.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.soundItemDivider.getLayoutParams()).bottomMargin = 0;
        ActionBarMenuItem actionBarMenuItem6 = this.otherItem;
        int i19 = R.drawable.msg_edit;
        RecordCallDrawable recordCallDrawable = this.recordCallDrawable;
        if (ChatObject.isChannelOrGiga(this.currentChat)) {
            i = R.string.VoipChannelEditTitle;
            str2 = "VoipChannelEditTitle";
        } else {
            i = R.string.VoipGroupEditTitle;
            str2 = "VoipGroupEditTitle";
        }
        this.editTitleItem = actionBarMenuItem6.addSubItem(6, i19, recordCallDrawable, LocaleController.getString(str2, i), true, false);
        this.permissionItem = this.otherItem.addSubItem(7, R.drawable.msg_permissions, this.recordCallDrawable, LocaleController.getString("VoipGroupEditPermissions", R.string.VoipGroupEditPermissions), false, false);
        this.inviteItem = this.otherItem.addSubItem(3, R.drawable.msg_link, LocaleController.getString("VoipGroupShareInviteLink", R.string.VoipGroupShareInviteLink));
        this.recordCallDrawable = new RecordCallDrawable();
        this.screenItem = this.otherItem.addSubItem(9, R.drawable.msg_screencast, LocaleController.getString("VoipChatStartScreenCapture", R.string.VoipChatStartScreenCapture));
        ActionBarMenuSubItem addSubItem5 = this.otherItem.addSubItem(5, 0, this.recordCallDrawable, LocaleController.getString("VoipGroupRecordCall", R.string.VoipGroupRecordCall), true, false);
        this.recordItem = addSubItem5;
        this.recordCallDrawable.setParentView(addSubItem5.getImageView());
        ActionBarMenuItem actionBarMenuItem7 = this.otherItem;
        int i20 = R.drawable.msg_endcall;
        if (ChatObject.isChannelOrGiga(this.currentChat)) {
            i2 = R.string.VoipChannelEndChat;
            str3 = "VoipChannelEndChat";
        } else {
            i2 = R.string.VoipGroupEndChat;
            str3 = "VoipGroupEndChat";
        }
        this.leaveItem = actionBarMenuItem7.addSubItem(4, i20, LocaleController.getString(str3, i2));
        this.otherItem.setPopupItemsSelectorColor(Theme.getColor(i16));
        this.otherItem.getPopupLayout().setFitItems(true);
        this.soundItem.setColors(Theme.getColor(i18), Theme.getColor(i18));
        this.noiseItem.setColors(Theme.getColor(i18), Theme.getColor(i18));
        ActionBarMenuSubItem actionBarMenuSubItem2 = this.leaveItem;
        int i21 = Theme.key_voipgroup_leaveCallMenu;
        actionBarMenuSubItem2.setColors(Theme.getColor(i21), Theme.getColor(i21));
        this.inviteItem.setColors(Theme.getColor(i18), Theme.getColor(i18));
        this.editTitleItem.setColors(Theme.getColor(i18), Theme.getColor(i18));
        this.permissionItem.setColors(Theme.getColor(i18), Theme.getColor(i18));
        this.recordItem.setColors(Theme.getColor(i18), Theme.getColor(i18));
        this.screenItem.setColors(Theme.getColor(i18), Theme.getColor(i18));
        if (this.call != null) {
            initCreatedGroupCall();
        }
        this.leaveBackgroundPaint.setColor(Theme.getColor(Theme.key_voipgroup_leaveButton));
        updateTitle(false);
        this.actionBar.getTitleTextView().setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                GroupCallActivity.this.lambda$new$23(view3);
            }
        });
        this.fullscreenUsersListView = new RecyclerListView(context) {
            @Override
            public boolean drawChild(Canvas canvas, View view3, long j) {
                GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) view3;
                if (!GroupCallActivity.this.renderersContainer.isAnimating() && !GroupCallActivity.this.fullscreenListItemAnimator.isRunning()) {
                    groupCallUserCell.setAlpha(1.0f);
                    groupCallUserCell.setTranslationX(0.0f);
                    groupCallUserCell.setTranslationY(0.0f);
                }
                if (!groupCallUserCell.isRemoving(GroupCallActivity.this.fullscreenUsersListView) || groupCallUserCell.getRenderer() == null) {
                    if (groupCallUserCell.getTranslationY() != 0.0f && groupCallUserCell.getRenderer() != null && groupCallUserCell.getRenderer().primaryView != null) {
                        float top = GroupCallActivity.this.listView.getTop() - getTop();
                        float f = GroupCallActivity.this.renderersContainer.progressToFullscreenMode;
                        canvas.save();
                        float f2 = 1.0f - f;
                        canvas.clipRect(0.0f, top * f2, getMeasuredWidth(), ((GroupCallActivity.this.listView.getMeasuredHeight() + top) * f2) + (getMeasuredHeight() * f));
                        boolean drawChild = super.drawChild(canvas, view3, j);
                        canvas.restore();
                        return drawChild;
                    }
                    return super.drawChild(canvas, view3, j);
                }
                return true;
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
        this.fullscreenListItemAnimator = defaultItemAnimator2;
        this.fullscreenUsersListView.setClipToPadding(false);
        defaultItemAnimator2.setDelayAnimations(false);
        defaultItemAnimator2.setTranslationInterpolator(CubicBezierInterpolator.DEFAULT);
        defaultItemAnimator2.setRemoveDuration(350L);
        defaultItemAnimator2.setAddDuration(350L);
        defaultItemAnimator2.setMoveDuration(350L);
        this.fullscreenUsersListView.setItemAnimator(defaultItemAnimator2);
        this.fullscreenUsersListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i22, int i23) {
                super.onScrolled(recyclerView, i22, i23);
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                GroupCallActivity.this.renderersContainer.invalidate();
            }
        });
        this.fullscreenUsersListView.setClipChildren(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        this.fullscreenUsersListView.setLayoutManager(linearLayoutManager);
        RecyclerListView recyclerListView5 = this.fullscreenUsersListView;
        GroupCallFullscreenAdapter groupCallFullscreenAdapter = new GroupCallFullscreenAdapter(call, this.currentAccount, this);
        this.fullscreenAdapter = groupCallFullscreenAdapter;
        recyclerListView5.setAdapter(groupCallFullscreenAdapter);
        this.fullscreenAdapter.setVisibility(this.fullscreenUsersListView, false);
        this.fullscreenUsersListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view3, int i22) {
                GroupCallActivity.this.lambda$new$24(view3, i22);
            }
        });
        this.fullscreenUsersListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view3, int i22) {
                boolean lambda$new$25;
                lambda$new$25 = GroupCallActivity.this.lambda$new$25(view3, i22);
                return lambda$new$25;
            }
        });
        this.fullscreenUsersListView.setVisibility(8);
        this.fullscreenUsersListView.addItemDecoration(new RecyclerView.ItemDecoration(this) {
            @Override
            public void getItemOffsets(Rect rect, View view3, RecyclerView recyclerView, RecyclerView.State state) {
                recyclerView.getChildAdapterPosition(view3);
                if (!GroupCallActivity.isLandscapeMode) {
                    rect.set(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                } else {
                    rect.set(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                }
            }
        });
        AnonymousClass27 anonymousClass27 = new AnonymousClass27(context, this.listView, this.fullscreenUsersListView, this.attachedRenderers, this.call, this);
        this.renderersContainer = anonymousClass27;
        anonymousClass27.setClipChildren(false);
        this.fullscreenAdapter.setRenderersPool(this.attachedRenderers, this.renderersContainer);
        if (this.tabletVideoGridView != null) {
            this.tabletGridAdapter.setRenderersPool(this.attachedRenderers, this.renderersContainer);
        }
        AvatarPreviewPagerIndicator avatarPreviewPagerIndicator = new AvatarPreviewPagerIndicator(context);
        this.avatarPagerIndicator = avatarPreviewPagerIndicator;
        ProfileGalleryView profileGalleryView = new ProfileGalleryView(context, this.actionBar, this.listView, avatarPreviewPagerIndicator) {
            @Override
            public void invalidate() {
                super.invalidate();
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }
        };
        this.avatarsViewPager = profileGalleryView;
        profileGalleryView.setImagesLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        profileGalleryView.setInvalidateWithParent(true);
        avatarPreviewPagerIndicator.setProfileGalleryView(profileGalleryView);
        FrameLayout frameLayout2 = new FrameLayout(context) {
            Rect rect = new Rect();
            RectF rectF = new RectF();
            Path path = new Path();

            @Override
            protected void onMeasure(int i22, int i23) {
                int min = Math.min(View.MeasureSpec.getSize(i22), View.MeasureSpec.getSize(i23));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min + getPaddingBottom(), 1073741824));
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (GroupCallActivity.this.progressToAvatarPreview != 1.0f) {
                    if (GroupCallActivity.this.scrimView == null || !GroupCallActivity.this.hasScrimAnchorView) {
                        if (GroupCallActivity.this.scrimFullscreenView != null && GroupCallActivity.this.scrimRenderer == null && GroupCallActivity.this.previewTextureTransitionEnabled) {
                            canvas.save();
                            float measuredHeight = (GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight());
                            int dp2 = (int) (((1.0f - GroupCallActivity.this.progressToAvatarPreview) * measuredHeight) + (AndroidUtilities.dp(13.0f) * GroupCallActivity.this.progressToAvatarPreview));
                            int i22 = (int) (measuredHeight * (1.0f - GroupCallActivity.this.progressToAvatarPreview));
                            GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                            GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().setRoundRadius(dp2, dp2, i22, i22);
                            GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getImageReceiver().draw(canvas);
                            GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().setRoundRadius(GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() / 2);
                            canvas.restore();
                        }
                    } else {
                        canvas.save();
                        float measuredHeight2 = (GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight());
                        int dp3 = (int) (((1.0f - GroupCallActivity.this.progressToAvatarPreview) * measuredHeight2) + (AndroidUtilities.dp(13.0f) * GroupCallActivity.this.progressToAvatarPreview));
                        int i23 = (int) (measuredHeight2 * (1.0f - GroupCallActivity.this.progressToAvatarPreview));
                        GroupCallActivity.this.scrimView.getAvatarWavesDrawable().draw(canvas, GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight() / 2, GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight() / 2, this);
                        GroupCallActivity.this.scrimView.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        GroupCallActivity.this.scrimView.getAvatarImageView().setRoundRadius(dp3, dp3, i23, i23);
                        GroupCallActivity.this.scrimView.getAvatarImageView().getImageReceiver().draw(canvas);
                        GroupCallActivity.this.scrimView.getAvatarImageView().setRoundRadius(GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight() / 2);
                        canvas.restore();
                    }
                }
                GroupCallActivity.this.avatarsViewPager.setAlpha(GroupCallActivity.this.progressToAvatarPreview);
                this.path.reset();
                this.rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
                this.path.addRoundRect(this.rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
                canvas.save();
                canvas.clipPath(this.path);
                View findVideoActiveView = GroupCallActivity.this.avatarsViewPager.findVideoActiveView();
                if (findVideoActiveView != null && GroupCallActivity.this.scrimRenderer != null && GroupCallActivity.this.scrimRenderer.isAttached() && !GroupCallActivity.this.drawingForBlur) {
                    canvas.save();
                    this.rect.setEmpty();
                    GroupCallActivity.this.avatarsViewPager.getChildVisibleRect(findVideoActiveView, this.rect, null);
                    int i24 = this.rect.left;
                    if (i24 < (-GroupCallActivity.this.avatarsViewPager.getMeasuredWidth())) {
                        i24 += GroupCallActivity.this.avatarsViewPager.getMeasuredWidth() * 2;
                    } else if (i24 > GroupCallActivity.this.avatarsViewPager.getMeasuredWidth()) {
                        i24 -= GroupCallActivity.this.avatarsViewPager.getMeasuredWidth() * 2;
                    }
                    canvas.translate(i24, 0.0f);
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
        };
        this.avatarPreviewContainer = frameLayout2;
        frameLayout2.setVisibility(8);
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
        this.blurredView = new View(context) {
            @Override
            public void setAlpha(float f) {
                if (getAlpha() != f) {
                    super.setAlpha(f);
                    GroupCallActivity.this.checkContentOverlayed();
                }
            }
        };
        this.containerView.addView(this.renderersContainer);
        this.renderersContainer.addView(this.fullscreenUsersListView, LayoutHelper.createFrame(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.buttonsContainer.setWillNotDraw(false);
        View view3 = new View(context);
        this.buttonsBackgroundGradientView = view3;
        int[] iArr = this.gradientColors;
        iArr[0] = this.backgroundColor;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.gradientColors);
        this.buttonsBackgroundGradient = gradientDrawable;
        view3.setBackground(gradientDrawable);
        this.containerView.addView(view3, LayoutHelper.createFrame(-1, 60, 83));
        View view4 = new View(context);
        this.buttonsBackgroundGradientView2 = view4;
        view4.setBackgroundColor(this.gradientColors[0]);
        this.containerView.addView(view4, LayoutHelper.createFrame(-1, 0, 83));
        this.containerView.addView(this.buttonsContainer, LayoutHelper.createFrame(-1, 200, 81));
        this.containerView.addView(this.blurredView);
        frameLayout2.addView(profileGalleryView, LayoutHelper.createFrame(-1, -1.0f));
        frameLayout2.addView(avatarPreviewPagerIndicator, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(frameLayout2, LayoutHelper.createFrame(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        applyCallParticipantUpdates(false);
        this.listAdapter.notifyDataSetChanged();
        if (isTabletMode) {
            this.tabletGridAdapter.update(false, this.tabletVideoGridView);
        }
        this.oldCount = this.listAdapter.getItemCount();
        if (tLRPC$InputPeer != null) {
            TextView textView = new TextView(context);
            this.scheduleInfoTextView = textView;
            textView.setGravity(17);
            this.scheduleInfoTextView.setTextColor(-8682615);
            this.scheduleInfoTextView.setTextSize(1, 14.0f);
            if (ChatObject.isChannel(this.currentChat) && !this.currentChat.megagroup) {
                this.scheduleInfoTextView.setTag(1);
            }
            this.containerView.addView(this.scheduleInfoTextView, LayoutHelper.createFrame(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            final NumberPicker numberPicker = new NumberPicker(context);
            numberPicker.setTextColor(-1);
            numberPicker.setSelectorColor(-9598483);
            numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
            numberPicker.setItemCount(5);
            final NumberPicker numberPicker2 = new NumberPicker(this, context) {
                @Override
                protected CharSequence getContentDescription(int i22) {
                    return LocaleController.formatPluralString("Hours", i22, new Object[0]);
                }
            };
            numberPicker2.setItemCount(5);
            numberPicker2.setTextColor(-1);
            numberPicker2.setSelectorColor(-9598483);
            numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
            final NumberPicker numberPicker3 = new NumberPicker(this, context) {
                @Override
                protected CharSequence getContentDescription(int i22) {
                    return LocaleController.formatPluralString("Minutes", i22, new Object[0]);
                }
            };
            numberPicker3.setItemCount(5);
            numberPicker3.setTextColor(-1);
            numberPicker3.setSelectorColor(-9598483);
            numberPicker3.setTextOffset(-AndroidUtilities.dp(34.0f));
            TextView textView2 = new TextView(context);
            this.scheduleButtonTextView = textView2;
            textView2.setLines(1);
            this.scheduleButtonTextView.setSingleLine(true);
            this.scheduleButtonTextView.setEllipsize(TextUtils.TruncateAt.END);
            this.scheduleButtonTextView.setGravity(17);
            this.scheduleButtonTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), 0, 1056964608));
            this.scheduleButtonTextView.setTextColor(-1);
            this.scheduleButtonTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.scheduleButtonTextView.setTextSize(1, 14.0f);
            this.containerView.addView(this.scheduleButtonTextView, LayoutHelper.createFrame(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            final TLRPC$InputPeer tLRPC$InputPeer2 = groupCallPeer;
            this.scheduleButtonTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view5) {
                    GroupCallActivity.this.lambda$new$30(numberPicker, numberPicker2, numberPicker3, tLRPC$Chat, accountInstance, tLRPC$InputPeer2, view5);
                }
            });
            LinearLayout linearLayout2 = new LinearLayout(this, context) {
                boolean ignoreLayout = false;

                @Override
                protected void onMeasure(int i22, int i23) {
                    this.ignoreLayout = true;
                    numberPicker.setItemCount(5);
                    numberPicker2.setItemCount(5);
                    numberPicker3.setItemCount(5);
                    numberPicker.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                    numberPicker2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                    numberPicker3.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                    this.ignoreLayout = false;
                    super.onMeasure(i22, i23);
                }

                @Override
                public void requestLayout() {
                    if (this.ignoreLayout) {
                        return;
                    }
                    super.requestLayout();
                }
            };
            this.scheduleTimerContainer = linearLayout2;
            linearLayout2.setWeightSum(1.0f);
            this.scheduleTimerContainer.setOrientation(0);
            this.containerView.addView(this.scheduleTimerContainer, LayoutHelper.createFrame(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            final long currentTimeMillis = System.currentTimeMillis();
            final Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            final int i22 = calendar.get(1);
            int i23 = calendar.get(6);
            this.scheduleTimerContainer.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.5f));
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(365);
            numberPicker.setWrapSelectorWheel(false);
            numberPicker.setFormatter(new NumberPicker.Formatter() {
                @Override
                public final String format(int i24) {
                    String lambda$new$31;
                    lambda$new$31 = GroupCallActivity.lambda$new$31(currentTimeMillis, calendar, i22, i24);
                    return lambda$new$31;
                }
            });
            NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
                @Override
                public final void onValueChange(NumberPicker numberPicker4, int i24, int i25) {
                    GroupCallActivity.this.lambda$new$32(numberPicker, numberPicker2, numberPicker3, numberPicker4, i24, i25);
                }
            };
            numberPicker.setOnValueChangedListener(onValueChangeListener);
            numberPicker2.setMinValue(0);
            numberPicker2.setMaxValue(23);
            this.scheduleTimerContainer.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
            numberPicker2.setFormatter(new NumberPicker.Formatter() {
                @Override
                public final String format(int i24) {
                    String lambda$new$33;
                    lambda$new$33 = GroupCallActivity.lambda$new$33(i24);
                    return lambda$new$33;
                }
            });
            numberPicker2.setOnValueChangedListener(onValueChangeListener);
            numberPicker3.setMinValue(0);
            numberPicker3.setMaxValue(59);
            numberPicker3.setValue(0);
            numberPicker3.setFormatter(new NumberPicker.Formatter() {
                @Override
                public final String format(int i24) {
                    String lambda$new$34;
                    lambda$new$34 = GroupCallActivity.lambda$new$34(i24);
                    return lambda$new$34;
                }
            });
            this.scheduleTimerContainer.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.3f));
            numberPicker3.setOnValueChangedListener(onValueChangeListener);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i24 = calendar.get(6);
            int i25 = calendar.get(12);
            int i26 = calendar.get(11);
            numberPicker.setValue(i23 != i24 ? 1 : 0);
            numberPicker3.setValue(i25);
            numberPicker2.setValue(i26);
            AlertsCreator.checkScheduleDate(this.scheduleButtonTextView, this.scheduleInfoTextView, 604800L, 2, numberPicker, numberPicker2, numberPicker3);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            viewGroup = (ViewGroup) getWindow().getDecorView();
        } else {
            viewGroup = this.containerView;
        }
        PinchToZoomHelper pinchToZoomHelper = new PinchToZoomHelper(viewGroup, this.containerView) {
            @Override
            public void invalidateViews() {
                super.invalidateViews();
                for (int i27 = 0; i27 < GroupCallActivity.this.avatarsViewPager.getChildCount(); i27++) {
                    GroupCallActivity.this.avatarsViewPager.getChildAt(i27).invalidate();
                }
            }

            @Override
            protected void drawOverlays(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
                if (f > 0.0f) {
                    float x = GroupCallActivity.this.avatarPreviewContainer.getX() + ((BottomSheet) GroupCallActivity.this).containerView.getX();
                    float y = GroupCallActivity.this.avatarPreviewContainer.getY() + ((BottomSheet) GroupCallActivity.this).containerView.getY();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(x, y, GroupCallActivity.this.avatarsViewPager.getMeasuredWidth() + x, GroupCallActivity.this.avatarsViewPager.getMeasuredHeight() + y);
                    canvas.saveLayerAlpha(rectF, (int) (f * 255.0f), 31);
                    canvas.translate(x, y);
                    GroupCallActivity.this.avatarPreviewContainer.draw(canvas);
                    canvas.restore();
                }
            }
        };
        this.pinchToZoomHelper = pinchToZoomHelper;
        pinchToZoomHelper.setCallback(new PinchToZoomHelper.Callback() {
            @Override
            public TextureView getCurrentTextureView() {
                return PinchToZoomHelper.Callback.CC.$default$getCurrentTextureView(this);
            }

            @Override
            public void onZoomStarted(MessageObject messageObject) {
                GroupCallActivity.this.listView.cancelClickRunnables(true);
                GroupCallActivity.this.pinchToZoomHelper.getPhotoImage().setRoundRadius(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0, 0);
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }

            @Override
            public void onZoomFinished(MessageObject messageObject) {
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }
        });
        profileGalleryView.setPinchToZoomHelper(this.pinchToZoomHelper);
        this.cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view5) {
                GroupCallActivity.this.lambda$new$35(context, view5);
            }
        });
        updateScheduleUI(false);
        updateItems();
        updateSpeakerPhoneIcon(false);
        updateState(false, false);
        setColorProgress(0.0f);
        updateSubtitle();
    }

    public void lambda$new$10(DialogInterface dialogInterface) {
        BaseFragment baseFragment = this.parentActivity.getActionBarLayout().getFragmentStack().get(this.parentActivity.getActionBarLayout().getFragmentStack().size() - 1);
        if (this.anyEnterEventSent && (baseFragment instanceof ChatActivity)) {
            ((ChatActivity) baseFragment).onEditTextDialogClose(true, true);
        }
    }

    public class AnonymousClass6 extends ActionBar.ActionBarMenuOnItemClick {
        final Context val$context;

        public static void lambda$onItemClick$8(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        }

        AnonymousClass6(Context context) {
            this.val$context = context;
        }

        @Override
        public void onItemClick(int i) {
            final VoIPService sharedInstance;
            int i2;
            int color;
            int i3;
            String str;
            if (i == -1) {
                GroupCallActivity.this.onBackPressed();
                return;
            }
            if (i == 1) {
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                groupCallActivity.call.call.join_muted = false;
                groupCallActivity.toggleAdminSpeak();
            } else if (i == 2) {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                groupCallActivity2.call.call.join_muted = true;
                groupCallActivity2.toggleAdminSpeak();
            } else if (i == 3) {
                GroupCallActivity.this.getLink(false);
            } else if (i == 4) {
                AlertDialog.Builder builder = new AlertDialog.Builder(GroupCallActivity.this.getContext());
                if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                    builder.setTitle(LocaleController.getString("VoipChannelEndAlertTitle", R.string.VoipChannelEndAlertTitle));
                    builder.setMessage(LocaleController.getString("VoipChannelEndAlertText", R.string.VoipChannelEndAlertText));
                } else {
                    builder.setTitle(LocaleController.getString("VoipGroupEndAlertTitle", R.string.VoipGroupEndAlertTitle));
                    builder.setMessage(LocaleController.getString("VoipGroupEndAlertText", R.string.VoipGroupEndAlertText));
                }
                builder.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
                builder.setPositiveButton(LocaleController.getString("VoipGroupEnd", R.string.VoipGroupEnd), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        GroupCallActivity.AnonymousClass6.this.lambda$onItemClick$1(dialogInterface, i4);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                AlertDialog create = builder.create();
                create.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_dialogBackground));
                create.show();
                TextView textView = (TextView) create.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(Theme.key_voipgroup_leaveCallMenu));
                }
                create.setTextColor(Theme.getColor(Theme.key_voipgroup_actionBarItems));
            } else if (i == 9) {
                GroupCallActivity.this.screenShareItem.callOnClick();
            } else if (i == 5) {
                GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                ChatObject.Call call = groupCallActivity3.call;
                if (call.recording) {
                    final boolean z = call.call.record_video_active;
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(groupCallActivity3.getContext());
                    builder2.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
                    builder2.setTitle(LocaleController.getString("VoipGroupStopRecordingTitle", R.string.VoipGroupStopRecordingTitle));
                    if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                        builder2.setMessage(LocaleController.getString("VoipChannelStopRecordingText", R.string.VoipChannelStopRecordingText));
                    } else {
                        builder2.setMessage(LocaleController.getString("VoipGroupStopRecordingText", R.string.VoipGroupStopRecordingText));
                    }
                    builder2.setPositiveButton(LocaleController.getString("Stop", R.string.Stop), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            GroupCallActivity.AnonymousClass6.this.lambda$onItemClick$2(z, dialogInterface, i4);
                        }
                    });
                    builder2.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                    AlertDialog create2 = builder2.create();
                    create2.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_dialogBackground));
                    create2.show();
                    create2.setTextColor(Theme.getColor(Theme.key_voipgroup_nameText));
                    return;
                }
                Context context = GroupCallActivity.this.getContext();
                GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, groupCallActivity4.currentChat, groupCallActivity4.hasVideo);
                if (GroupCallActivity.this.isRtmpStream()) {
                    anonymousClass1.onStartRecord(2);
                } else {
                    anonymousClass1.show();
                }
            } else if (i == 7) {
                GroupCallActivity.this.changingPermissions = true;
                GroupCallActivity.this.everyoneItem.setVisibility(0);
                GroupCallActivity.this.adminItem.setVisibility(0);
                GroupCallActivity.this.accountGap.setVisibility(8);
                GroupCallActivity.this.inviteItem.setVisibility(8);
                GroupCallActivity.this.leaveItem.setVisibility(8);
                GroupCallActivity.this.permissionItem.setVisibility(8);
                GroupCallActivity.this.editTitleItem.setVisibility(8);
                GroupCallActivity.this.recordItem.setVisibility(8);
                GroupCallActivity.this.screenItem.setVisibility(8);
                GroupCallActivity.this.accountSelectCell.setVisibility(8);
                GroupCallActivity.this.soundItem.setVisibility(8);
                GroupCallActivity.this.noiseItem.setVisibility(8);
                GroupCallActivity.this.otherItem.forceUpdatePopupPosition();
            } else if (i == 6) {
                GroupCallActivity.this.enterEventSent = false;
                final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(GroupCallActivity.this.getContext());
                editTextBoldCursor.setBackgroundDrawable(Theme.createEditTextDrawable(GroupCallActivity.this.getContext(), true));
                final AlertDialog.Builder builder3 = new AlertDialog.Builder(GroupCallActivity.this.getContext());
                builder3.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
                if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                    builder3.setTitle(LocaleController.getString("VoipChannelTitle", R.string.VoipChannelTitle));
                } else {
                    builder3.setTitle(LocaleController.getString("VoipGroupTitle", R.string.VoipGroupTitle));
                }
                builder3.setCheckFocusable(false);
                builder3.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        AndroidUtilities.hideKeyboard(EditTextBoldCursor.this);
                    }
                });
                LinearLayout linearLayout = new LinearLayout(GroupCallActivity.this.getContext());
                linearLayout.setOrientation(1);
                builder3.setView(linearLayout);
                editTextBoldCursor.setTextSize(1, 16.0f);
                int i4 = Theme.key_voipgroup_nameText;
                editTextBoldCursor.setTextColor(Theme.getColor(i4));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(6);
                editTextBoldCursor.setHint(GroupCallActivity.this.currentChat.title);
                editTextBoldCursor.setHintTextColor(Theme.getColor(Theme.key_voipgroup_lastSeenText));
                editTextBoldCursor.setCursorColor(Theme.getColor(i4));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, 36, 51, 24, 6, 24, 0));
                editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView2, int i5, KeyEvent keyEvent) {
                        boolean lambda$onItemClick$4;
                        lambda$onItemClick$4 = GroupCallActivity.AnonymousClass6.lambda$onItemClick$4(AlertDialog.Builder.this, textView2, i5, keyEvent);
                        return lambda$onItemClick$4;
                    }
                });
                editTextBoldCursor.addTextChangedListener(new TextWatcher(this) {
                    boolean ignoreTextChange;

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        if (!this.ignoreTextChange && editable.length() > 40) {
                            this.ignoreTextChange = true;
                            editable.delete(40, editable.length());
                            AndroidUtilities.shakeView(editTextBoldCursor);
                            editTextBoldCursor.performHapticFeedback(3, 2);
                            this.ignoreTextChange = false;
                        }
                    }
                });
                if (!TextUtils.isEmpty(GroupCallActivity.this.call.call.title)) {
                    editTextBoldCursor.setText(GroupCallActivity.this.call.call.title);
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                }
                builder3.setPositiveButton(LocaleController.getString("Save", R.string.Save), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        GroupCallActivity.AnonymousClass6.this.lambda$onItemClick$5(editTextBoldCursor, builder3, dialogInterface, i5);
                    }
                });
                final AlertDialog create3 = builder3.create();
                create3.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_inviteMembersBackground));
                create3.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        GroupCallActivity.AnonymousClass6.this.lambda$onItemClick$6(create3, editTextBoldCursor, dialogInterface);
                    }
                });
                create3.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        AndroidUtilities.hideKeyboard(EditTextBoldCursor.this);
                    }
                });
                create3.show();
                create3.setTextColor(Theme.getColor(i4));
                editTextBoldCursor.requestFocus();
            } else if (i == 8) {
                Context context2 = GroupCallActivity.this.getContext();
                GroupCallActivity groupCallActivity5 = GroupCallActivity.this;
                JoinCallAlert.open(context2, -groupCallActivity5.currentChat.id, groupCallActivity5.accountInstance, null, 2, GroupCallActivity.this.selfPeer, new JoinCallAlert.JoinCallAlertDelegate() {
                    @Override
                    public final void didSelectChat(TLRPC$InputPeer tLRPC$InputPeer, boolean z2, boolean z3) {
                        GroupCallActivity.AnonymousClass6.this.lambda$onItemClick$9(tLRPC$InputPeer, z2, z3);
                    }
                });
            } else if (i == 11) {
                SharedConfig.toggleNoiseSupression();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 == null) {
                    return;
                }
                sharedInstance2.setNoiseSupressionEnabled(SharedConfig.noiseSupression);
            } else if (i == 10 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                arrayList.add(LocaleController.getString("VoipAudioRoutingSpeaker", R.string.VoipAudioRoutingSpeaker));
                arrayList2.add(Integer.valueOf(R.drawable.msg_voice_speaker));
                arrayList3.add(0);
                if (sharedInstance.hasEarpiece()) {
                    if (sharedInstance.isHeadsetPlugged()) {
                        i3 = R.string.VoipAudioRoutingHeadset;
                        str = "VoipAudioRoutingHeadset";
                    } else {
                        i3 = R.string.VoipAudioRoutingPhone;
                        str = "VoipAudioRoutingPhone";
                    }
                    arrayList.add(LocaleController.getString(str, i3));
                    arrayList2.add(Integer.valueOf(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone));
                    arrayList3.add(1);
                }
                if (sharedInstance.isBluetoothHeadsetConnected()) {
                    String str2 = sharedInstance.currentBluetoothDeviceName;
                    if (str2 == null) {
                        str2 = LocaleController.getString("VoipAudioRoutingBluetooth", R.string.VoipAudioRoutingBluetooth);
                    }
                    arrayList.add(str2);
                    arrayList2.add(Integer.valueOf(R.drawable.msg_voice_bluetooth));
                    arrayList3.add(2);
                }
                int size = arrayList.size();
                CharSequence[] charSequenceArr = new CharSequence[size];
                int[] iArr = new int[size];
                for (int i5 = 0; i5 < size; i5++) {
                    charSequenceArr[i5] = (CharSequence) arrayList.get(i5);
                    iArr[i5] = ((Integer) arrayList2.get(i5)).intValue();
                }
                BottomSheet.Builder items = new BottomSheet.Builder(this.val$context).setTitle(LocaleController.getString("VoipSelectAudioOutput", R.string.VoipSelectAudioOutput), true).setItems(charSequenceArr, iArr, new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i6) {
                        GroupCallActivity.AnonymousClass6.lambda$onItemClick$10(VoIPService.this, arrayList3, dialogInterface, i6);
                    }
                });
                BottomSheet create4 = items.create();
                int i6 = Theme.key_voipgroup_listViewBackgroundUnscrolled;
                create4.setBackgroundColor(Theme.getColor(i6));
                create4.fixNavigationBar(Theme.getColor(i6));
                if (sharedInstance.getCurrentAudioRoute() == 1) {
                    i2 = 0;
                } else {
                    i2 = sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
                }
                items.show();
                create4.setTitleColor(Theme.getColor(Theme.key_voipgroup_nameText));
                for (int i7 = 0; i7 < create4.getItemViews().size(); i7++) {
                    BottomSheet.BottomSheetCell bottomSheetCell = create4.getItemViews().get(i7);
                    if (i7 == i2) {
                        color = Theme.getColor(Theme.key_voipgroup_listeningText);
                        bottomSheetCell.isSelected = true;
                    } else {
                        color = Theme.getColor(Theme.key_voipgroup_nameText);
                    }
                    bottomSheetCell.setTextColor(color);
                    bottomSheetCell.setIconColor(color);
                    bottomSheetCell.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_voipgroup_actionBarItems), 12), 2));
                }
            }
        }

        public void lambda$onItemClick$1(DialogInterface dialogInterface, int i) {
            if (GroupCallActivity.this.call.isScheduled()) {
                TLRPC$ChatFull chatFull = GroupCallActivity.this.accountInstance.getMessagesController().getChatFull(GroupCallActivity.this.currentChat.id);
                if (chatFull != null) {
                    chatFull.flags &= -2097153;
                    chatFull.call = null;
                    GroupCallActivity.this.accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(GroupCallActivity.this.currentChat.id), Long.valueOf(GroupCallActivity.this.call.call.id), Boolean.FALSE);
                }
                TLRPC$TL_phone_discardGroupCall tLRPC$TL_phone_discardGroupCall = new TLRPC$TL_phone_discardGroupCall();
                tLRPC$TL_phone_discardGroupCall.call = GroupCallActivity.this.call.getInputGroupCall();
                GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_phone_discardGroupCall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        GroupCallActivity.AnonymousClass6.this.lambda$onItemClick$0(tLObject, tLRPC$TL_error);
                    }
                });
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().hangUp(1);
            }
            GroupCallActivity.this.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
        }

        public void lambda$onItemClick$0(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (tLObject instanceof TLRPC$TL_updates) {
                GroupCallActivity.this.accountInstance.getMessagesController().processUpdates((TLRPC$TL_updates) tLObject, false);
            }
        }

        public void lambda$onItemClick$2(boolean z, DialogInterface dialogInterface, int i) {
            GroupCallActivity.this.call.toggleRecord(null, 0);
            GroupCallActivity.this.getUndoView().showWithAction(0L, z ? FileLoader.MEDIA_DIR_VIDEO_PUBLIC : 40, (Runnable) null);
        }

        public class AnonymousClass1 extends GroupCallRecordAlert {
            AnonymousClass1(Context context, TLRPC$Chat tLRPC$Chat, boolean z) {
                super(context, tLRPC$Chat, z);
            }

            @Override
            public void onStartRecord(final int i) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
                GroupCallActivity.this.enterEventSent = false;
                builder.setTitle(LocaleController.getString("VoipGroupStartRecordingTitle", R.string.VoipGroupStartRecordingTitle));
                if (i == 0) {
                    builder.setMessage(LocaleController.getString(GroupCallActivity.this.call.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpText : R.string.VoipGroupStartRecordingText));
                } else if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                    builder.setMessage(LocaleController.getString(GroupCallActivity.this.call.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpVideoText : R.string.VoipChannelStartRecordingVideoText));
                } else {
                    builder.setMessage(LocaleController.getString(GroupCallActivity.this.call.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpVideoText : R.string.VoipGroupStartRecordingVideoText));
                }
                builder.setCheckFocusable(false);
                final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
                editTextBoldCursor.setBackgroundDrawable(Theme.createEditTextDrawable(getContext(), Theme.getColor(Theme.key_voipgroup_windowBackgroundWhiteInputField), Theme.getColor(Theme.key_voipgroup_windowBackgroundWhiteInputFieldActivated)));
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                builder.setView(linearLayout);
                editTextBoldCursor.setTextSize(1, 16.0f);
                int i2 = Theme.key_voipgroup_nameText;
                editTextBoldCursor.setTextColor(Theme.getColor(i2));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setHint(LocaleController.getString("VoipGroupSaveFileHint", R.string.VoipGroupSaveFileHint));
                editTextBoldCursor.setImeOptions(6);
                editTextBoldCursor.setHintTextColor(Theme.getColor(Theme.key_voipgroup_lastSeenText));
                editTextBoldCursor.setCursorColor(Theme.getColor(i2));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, 36, 51, 24, 0, 24, 12));
                editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                        boolean lambda$onStartRecord$0;
                        lambda$onStartRecord$0 = GroupCallActivity.AnonymousClass6.AnonymousClass1.lambda$onStartRecord$0(AlertDialog.Builder.this, textView, i3, keyEvent);
                        return lambda$onStartRecord$0;
                    }
                });
                final AlertDialog create = builder.create();
                create.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_inviteMembersBackground));
                create.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        GroupCallActivity.AnonymousClass6.AnonymousClass1.this.lambda$onStartRecord$1(create, editTextBoldCursor, dialogInterface);
                    }
                });
                create.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        AndroidUtilities.hideKeyboard(EditTextBoldCursor.this);
                    }
                });
                builder.setPositiveButton(LocaleController.getString("Start", R.string.Start), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        GroupCallActivity.AnonymousClass6.AnonymousClass1.this.lambda$onStartRecord$3(editTextBoldCursor, i, dialogInterface, i3);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        AndroidUtilities.hideKeyboard(EditTextBoldCursor.this);
                    }
                });
                AlertDialog create2 = builder.create();
                create2.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_dialogBackground));
                create2.show();
                create2.setTextColor(Theme.getColor(i2));
                editTextBoldCursor.requestFocus();
            }

            public static boolean lambda$onStartRecord$0(AlertDialog.Builder builder, TextView textView, int i, KeyEvent keyEvent) {
                AndroidUtilities.hideKeyboard(textView);
                builder.create().getButton(-1).callOnClick();
                return false;
            }

            public void lambda$onStartRecord$1(AlertDialog alertDialog, EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
                GroupCallActivity.this.makeFocusable(null, alertDialog, editTextBoldCursor, true);
            }

            public void lambda$onStartRecord$3(EditTextBoldCursor editTextBoldCursor, int i, DialogInterface dialogInterface, int i2) {
                GroupCallActivity.this.call.toggleRecord(editTextBoldCursor.getText().toString(), i);
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                GroupCallActivity.this.getUndoView().showWithAction(0L, i == 0 ? 39 : 100, (Runnable) null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                }
            }
        }

        public static boolean lambda$onItemClick$4(AlertDialog.Builder builder, TextView textView, int i, KeyEvent keyEvent) {
            AndroidUtilities.hideKeyboard(textView);
            builder.create().getButton(-1).callOnClick();
            return false;
        }

        public void lambda$onItemClick$5(EditTextBoldCursor editTextBoldCursor, AlertDialog.Builder builder, DialogInterface dialogInterface, int i) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            GroupCallActivity.this.call.setTitle(editTextBoldCursor.getText().toString());
            builder.getDismissRunnable().run();
        }

        public void lambda$onItemClick$6(AlertDialog alertDialog, EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
            GroupCallActivity.this.makeFocusable(null, alertDialog, editTextBoldCursor, true);
        }

        public void lambda$onItemClick$9(TLRPC$InputPeer tLRPC$InputPeer, boolean z, boolean z2) {
            TLObject chat;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            if (groupCallActivity.call == null) {
                return;
            }
            boolean z3 = tLRPC$InputPeer instanceof TLRPC$TL_inputPeerUser;
            if (z3) {
                chat = groupCallActivity.accountInstance.getMessagesController().getUser(Long.valueOf(tLRPC$InputPeer.user_id));
            } else {
                chat = tLRPC$InputPeer instanceof TLRPC$TL_inputPeerChat ? groupCallActivity.accountInstance.getMessagesController().getChat(Long.valueOf(tLRPC$InputPeer.chat_id)) : groupCallActivity.accountInstance.getMessagesController().getChat(Long.valueOf(tLRPC$InputPeer.channel_id));
            }
            TLObject tLObject = chat;
            if (GroupCallActivity.this.call.isScheduled()) {
                GroupCallActivity.this.getUndoView().showWithAction(0L, 37, tLObject, GroupCallActivity.this.currentChat, (Runnable) null, (Runnable) null);
                if (tLRPC$InputPeer instanceof TLRPC$TL_inputPeerChannel) {
                    GroupCallActivity.this.selfPeer = new TLRPC$TL_peerChannel();
                    GroupCallActivity.this.selfPeer.channel_id = tLRPC$InputPeer.channel_id;
                } else if (z3) {
                    GroupCallActivity.this.selfPeer = new TLRPC$TL_peerUser();
                    GroupCallActivity.this.selfPeer.user_id = tLRPC$InputPeer.user_id;
                } else if (tLRPC$InputPeer instanceof TLRPC$TL_inputPeerChat) {
                    GroupCallActivity.this.selfPeer = new TLRPC$TL_peerChat();
                    GroupCallActivity.this.selfPeer.chat_id = tLRPC$InputPeer.chat_id;
                }
                GroupCallActivity.this.schedulePeer = tLRPC$InputPeer;
                TLRPC$ChatFull chatFull = GroupCallActivity.this.accountInstance.getMessagesController().getChatFull(GroupCallActivity.this.currentChat.id);
                if (chatFull != null) {
                    chatFull.groupcall_default_join_as = GroupCallActivity.this.selfPeer;
                    if (chatFull instanceof TLRPC$TL_chatFull) {
                        chatFull.flags |= LiteMode.FLAG_CHAT_SCALE;
                    } else {
                        chatFull.flags |= ConnectionsManager.FileTypeFile;
                    }
                }
                TLRPC$TL_phone_saveDefaultGroupCallJoinAs tLRPC$TL_phone_saveDefaultGroupCallJoinAs = new TLRPC$TL_phone_saveDefaultGroupCallJoinAs();
                tLRPC$TL_phone_saveDefaultGroupCallJoinAs.peer = MessagesController.getInputPeer(GroupCallActivity.this.currentChat);
                tLRPC$TL_phone_saveDefaultGroupCallJoinAs.join_as = tLRPC$InputPeer;
                GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_phone_saveDefaultGroupCallJoinAs, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                        GroupCallActivity.AnonymousClass6.lambda$onItemClick$8(tLObject2, tLRPC$TL_error);
                    }
                });
                GroupCallActivity.this.updateItems();
            } else if (VoIPService.getSharedInstance() == null || !z) {
            } else {
                GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                groupCallActivity2.call.participants.get(MessageObject.getPeerId(groupCallActivity2.selfPeer));
                VoIPService.getSharedInstance().setGroupCallPeer(tLRPC$InputPeer);
                GroupCallActivity.this.userSwitchObject = tLObject;
            }
        }

        public static void lambda$onItemClick$10(VoIPService voIPService, ArrayList arrayList, DialogInterface dialogInterface, int i) {
            if (VoIPService.getSharedInstance() == null) {
                return;
            }
            voIPService.setAudioOutput(((Integer) arrayList.get(i)).intValue());
        }
    }

    public void lambda$new$11(int[] iArr, float[] fArr, boolean[] zArr) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        for (int i = 0; i < iArr.length; i++) {
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant = this.call.participantsBySources.get(iArr[i]);
            if (tLRPC$TL_groupCallParticipant != null) {
                if (!this.renderersContainer.inFullscreenMode) {
                    int indexOf = (this.delayedGroupCallUpdated ? this.oldParticipants : this.call.visibleParticipants).indexOf(tLRPC$TL_groupCallParticipant);
                    if (indexOf >= 0 && (findViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(indexOf + this.listAdapter.usersStartRow)) != null) {
                        View view = findViewHolderForAdapterPosition.itemView;
                        if (view instanceof GroupCallUserCell) {
                            ((GroupCallUserCell) view).setAmplitude(fArr[i] * 15.0f);
                            if (findViewHolderForAdapterPosition.itemView == this.scrimView && !this.contentFullyOverlayed) {
                                this.containerView.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i2 = 0; i2 < this.fullscreenUsersListView.getChildCount(); i2++) {
                        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) this.fullscreenUsersListView.getChildAt(i2);
                        if (MessageObject.getPeerId(groupCallUserCell.getParticipant().peer) == MessageObject.getPeerId(tLRPC$TL_groupCallParticipant.peer)) {
                            groupCallUserCell.setAmplitude(fArr[i] * 15.0f);
                        }
                    }
                }
                this.renderersContainer.setAmplitude(tLRPC$TL_groupCallParticipant, fArr[i] * 15.0f);
            }
        }
    }

    public void lambda$new$13(View view, int i, float f, float f2) {
        if (view instanceof GroupCallGridCell) {
            fullscreenFor(((GroupCallGridCell) view).getParticipant());
        } else if (view instanceof GroupCallUserCell) {
            showMenuForCell((GroupCallUserCell) view);
        } else if (view instanceof GroupCallInvitedCell) {
            GroupCallInvitedCell groupCallInvitedCell = (GroupCallInvitedCell) view;
            if (groupCallInvitedCell.getUser() == null) {
                return;
            }
            this.parentActivity.switchToAccount(this.currentAccount, true);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", groupCallInvitedCell.getUser().id);
            if (groupCallInvitedCell.hasAvatarSet()) {
                bundle.putBoolean("expandPhoto", true);
            }
            this.parentActivity.lambda$runLinkRequest$87(new ProfileActivity(bundle));
            dismiss();
        } else if (i == this.listAdapter.addMemberRow) {
            if (ChatObject.isChannel(this.currentChat)) {
                TLRPC$Chat tLRPC$Chat = this.currentChat;
                if (!tLRPC$Chat.megagroup && ChatObject.isPublic(tLRPC$Chat)) {
                    getLink(false);
                    return;
                }
            }
            TLRPC$ChatFull chatFull = this.accountInstance.getMessagesController().getChatFull(this.currentChat.id);
            if (chatFull == null) {
                return;
            }
            this.enterEventSent = false;
            Context context = getContext();
            int currentAccount = this.accountInstance.getCurrentAccount();
            TLRPC$Chat tLRPC$Chat2 = this.currentChat;
            ChatObject.Call call = this.call;
            GroupVoipInviteAlert groupVoipInviteAlert = new GroupVoipInviteAlert(context, currentAccount, tLRPC$Chat2, chatFull, call.participants, call.invitedUsersMap);
            this.groupVoipInviteAlert = groupVoipInviteAlert;
            groupVoipInviteAlert.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    GroupCallActivity.this.lambda$new$12(dialogInterface);
                }
            });
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
                    if (motionEvent.getX() > editTextBoldCursor.getLeft() && motionEvent.getX() < editTextBoldCursor.getRight() && motionEvent.getY() > editTextBoldCursor.getTop() && motionEvent.getY() < editTextBoldCursor.getBottom()) {
                        GroupCallActivity groupCallActivity = GroupCallActivity.this;
                        groupCallActivity.makeFocusable(groupCallActivity.groupVoipInviteAlert, null, editTextBoldCursor, true);
                        return;
                    }
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    groupCallActivity2.makeFocusable(groupCallActivity2.groupVoipInviteAlert, null, editTextBoldCursor, false);
                }
            });
            this.groupVoipInviteAlert.show();
        }
    }

    public void lambda$new$12(DialogInterface dialogInterface) {
        this.groupVoipInviteAlert = null;
    }

    public boolean lambda$new$14(View view, int i) {
        if (isRtmpStream()) {
            return false;
        }
        if (view instanceof GroupCallGridCell) {
            return showMenuForCell(view);
        }
        if (view instanceof GroupCallUserCell) {
            updateItems();
            return ((GroupCallUserCell) view).clickMuteButton();
        }
        return false;
    }

    public void lambda$new$15(View view, int i) {
        GroupCallGridCell groupCallGridCell = (GroupCallGridCell) view;
        if (groupCallGridCell.getParticipant() != null) {
            fullscreenFor(groupCallGridCell.getParticipant());
        }
    }

    class AnonymousClass17 extends FrameLayout {
        AnimatorSet currentButtonsAnimation;
        int currentLightColor;
        final OvershootInterpolator overshootInterpolator;

        AnonymousClass17(Context context) {
            super(context);
            this.overshootInterpolator = new OvershootInterpolator(1.5f);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            if (!GroupCallActivity.isLandscapeMode) {
                i = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(460.0f), View.MeasureSpec.getSize(i)), 1073741824);
            }
            for (int i3 = 0; i3 < 2; i3++) {
                if (!GroupCallActivity.isLandscapeMode || GroupCallActivity.isTabletMode) {
                    GroupCallActivity.this.muteLabel[i3].getLayoutParams().width = -2;
                } else {
                    GroupCallActivity.this.muteLabel[i3].getLayoutParams().width = (int) (View.MeasureSpec.getSize(i) / 0.68f);
                }
            }
            super.onMeasure(i, i2);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(122.0f)) / 2;
            int measuredHeight = getMeasuredHeight();
            int i5 = GroupCallActivity.this.cameraButton.getVisibility() != 0 ? 4 : 5;
            if (GroupCallActivity.this.soundButton.getVisibility() != 0) {
                i5--;
            }
            if (GroupCallActivity.this.flipButton.getVisibility() != 0) {
                i5--;
            }
            if (!GroupCallActivity.isLandscapeMode || GroupCallActivity.isTabletMode) {
                if (GroupCallActivity.this.renderersContainer.inFullscreenMode && !GroupCallActivity.isTabletMode) {
                    int measuredWidth2 = getMeasuredWidth() / i5;
                    if (GroupCallActivity.this.soundButton.getVisibility() == 0) {
                        int i6 = measuredWidth2 / 2;
                        int measuredWidth3 = i6 - (GroupCallActivity.this.cameraButton.getMeasuredWidth() / 2);
                        int measuredHeight2 = getMeasuredHeight() - GroupCallActivity.this.cameraButton.getMeasuredHeight();
                        GroupCallActivity.this.cameraButton.layout(measuredWidth3, measuredHeight2, GroupCallActivity.this.cameraButton.getMeasuredWidth() + measuredWidth3, GroupCallActivity.this.cameraButton.getMeasuredHeight() + measuredHeight2);
                        int measuredWidth4 = (i6 + (i5 == 4 ? measuredWidth2 : 0)) - (GroupCallActivity.this.leaveButton.getMeasuredWidth() / 2);
                        int measuredHeight3 = getMeasuredHeight() - GroupCallActivity.this.soundButton.getMeasuredHeight();
                        GroupCallActivity.this.soundButton.layout(measuredWidth4, measuredHeight3, GroupCallActivity.this.soundButton.getMeasuredWidth() + measuredWidth4, GroupCallActivity.this.soundButton.getMeasuredHeight() + measuredHeight3);
                    } else {
                        int i7 = measuredWidth2 / 2;
                        int measuredWidth5 = ((i5 == 4 ? measuredWidth2 : 0) + i7) - (GroupCallActivity.this.cameraButton.getMeasuredWidth() / 2);
                        int measuredHeight4 = getMeasuredHeight() - GroupCallActivity.this.cameraButton.getMeasuredHeight();
                        GroupCallActivity.this.cameraButton.layout(measuredWidth5, measuredHeight4, GroupCallActivity.this.cameraButton.getMeasuredWidth() + measuredWidth5, GroupCallActivity.this.cameraButton.getMeasuredHeight() + measuredHeight4);
                        int measuredWidth6 = i7 - (GroupCallActivity.this.flipButton.getMeasuredWidth() / 2);
                        int measuredHeight5 = getMeasuredHeight() - GroupCallActivity.this.flipButton.getMeasuredHeight();
                        GroupCallActivity.this.flipButton.layout(measuredWidth6, measuredHeight5, GroupCallActivity.this.flipButton.getMeasuredWidth() + measuredWidth6, GroupCallActivity.this.flipButton.getMeasuredHeight() + measuredHeight5);
                    }
                    int i8 = measuredWidth2 / 2;
                    int measuredWidth7 = ((i5 == 4 ? measuredWidth2 * 3 : measuredWidth2 * 2) + i8) - (GroupCallActivity.this.leaveButton.getMeasuredWidth() / 2);
                    int measuredHeight6 = getMeasuredHeight() - GroupCallActivity.this.leaveButton.getMeasuredHeight();
                    GroupCallActivity.this.leaveButton.layout(measuredWidth7, measuredHeight6, GroupCallActivity.this.leaveButton.getMeasuredWidth() + measuredWidth7, GroupCallActivity.this.leaveButton.getMeasuredHeight() + measuredHeight6);
                    int measuredWidth8 = (i8 + (i5 == 4 ? measuredWidth2 * 2 : measuredWidth2)) - (GroupCallActivity.this.muteButton.getMeasuredWidth() / 2);
                    int measuredHeight7 = (getMeasuredHeight() - GroupCallActivity.this.leaveButton.getMeasuredHeight()) - ((GroupCallActivity.this.muteButton.getMeasuredWidth() - AndroidUtilities.dp(52.0f)) / 2);
                    GroupCallActivity.this.muteButton.layout(measuredWidth8, measuredHeight7, GroupCallActivity.this.muteButton.getMeasuredWidth() + measuredWidth8, GroupCallActivity.this.muteButton.getMeasuredHeight() + measuredHeight7);
                    GroupCallActivity.this.minimizeButton.layout(measuredWidth8, measuredHeight7, GroupCallActivity.this.minimizeButton.getMeasuredWidth() + measuredWidth8, GroupCallActivity.this.minimizeButton.getMeasuredHeight() + measuredHeight7);
                    GroupCallActivity.this.expandButton.layout(measuredWidth8, measuredHeight7, GroupCallActivity.this.expandButton.getMeasuredWidth() + measuredWidth8, GroupCallActivity.this.expandButton.getMeasuredHeight() + measuredHeight7);
                    float dp = AndroidUtilities.dp(52.0f) / (GroupCallActivity.this.muteButton.getMeasuredWidth() - AndroidUtilities.dp(8.0f));
                    GroupCallActivity.this.muteButton.animate().scaleX(dp).scaleY(dp).setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    for (int i9 = 0; i9 < 2; i9++) {
                        int measuredWidth9 = (i5 == 4 ? measuredWidth2 * 2 : measuredWidth2) + ((measuredWidth2 - GroupCallActivity.this.muteLabel[i9].getMeasuredWidth()) / 2);
                        int dp2 = measuredHeight - AndroidUtilities.dp(27.0f);
                        GroupCallActivity.this.muteLabel[i9].layout(measuredWidth9, dp2, GroupCallActivity.this.muteLabel[i9].getMeasuredWidth() + measuredWidth9, GroupCallActivity.this.muteLabel[i9].getMeasuredHeight() + dp2);
                        GroupCallActivity.this.muteLabel[i9].animate().scaleX(0.687f).scaleY(0.687f).setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    }
                } else {
                    int dp3 = AndroidUtilities.dp(0.0f);
                    if (GroupCallActivity.this.soundButton.getVisibility() == 0) {
                        if (GroupCallActivity.this.cameraButton.getVisibility() == 0) {
                            int measuredWidth10 = (measuredWidth - GroupCallActivity.this.cameraButton.getMeasuredWidth()) / 2;
                            int measuredHeight8 = (measuredHeight - GroupCallActivity.this.cameraButton.getMeasuredHeight()) / 2;
                            GroupCallActivity.this.cameraButton.layout(measuredWidth10, measuredHeight8, GroupCallActivity.this.cameraButton.getMeasuredWidth() + measuredWidth10, GroupCallActivity.this.cameraButton.getMeasuredHeight() + measuredHeight8);
                            int measuredWidth11 = (measuredWidth - GroupCallActivity.this.soundButton.getMeasuredWidth()) / 2;
                            int measuredHeight9 = (measuredHeight - GroupCallActivity.this.leaveButton.getMeasuredHeight()) / 2;
                            GroupCallActivity.this.soundButton.layout(measuredWidth11, measuredHeight9, GroupCallActivity.this.soundButton.getMeasuredWidth() + measuredWidth11, GroupCallActivity.this.soundButton.getMeasuredHeight() + measuredHeight9);
                        } else {
                            int measuredWidth12 = (measuredWidth - GroupCallActivity.this.soundButton.getMeasuredWidth()) / 2;
                            int measuredHeight10 = (measuredHeight - GroupCallActivity.this.soundButton.getMeasuredHeight()) / 2;
                            GroupCallActivity.this.soundButton.layout(measuredWidth12, measuredHeight10, GroupCallActivity.this.soundButton.getMeasuredWidth() + measuredWidth12, GroupCallActivity.this.soundButton.getMeasuredHeight() + measuredHeight10);
                        }
                    } else {
                        int dp4 = GroupCallActivity.this.flipButton.getVisibility() == 0 ? AndroidUtilities.dp(28.0f) : 0;
                        int measuredWidth13 = (measuredWidth - GroupCallActivity.this.flipButton.getMeasuredWidth()) / 2;
                        int measuredHeight11 = (((measuredHeight - GroupCallActivity.this.flipButton.getMeasuredHeight()) / 2) + dp3) - dp4;
                        GroupCallActivity.this.flipButton.layout(measuredWidth13, measuredHeight11, GroupCallActivity.this.flipButton.getMeasuredWidth() + measuredWidth13, GroupCallActivity.this.flipButton.getMeasuredHeight() + measuredHeight11);
                        int measuredWidth14 = (measuredWidth - GroupCallActivity.this.cameraButton.getMeasuredWidth()) / 2;
                        int measuredHeight12 = ((measuredHeight - GroupCallActivity.this.cameraButton.getMeasuredHeight()) / 2) + dp3 + dp4;
                        GroupCallActivity.this.cameraButton.layout(measuredWidth14, measuredHeight12, GroupCallActivity.this.cameraButton.getMeasuredWidth() + measuredWidth14, GroupCallActivity.this.cameraButton.getMeasuredHeight() + measuredHeight12);
                    }
                    int measuredHeight13 = ((measuredHeight - GroupCallActivity.this.leaveButton.getMeasuredHeight()) / 2) + dp3;
                    int measuredWidth15 = (getMeasuredWidth() - measuredWidth) + ((measuredWidth - GroupCallActivity.this.leaveButton.getMeasuredWidth()) / 2);
                    GroupCallActivity.this.leaveButton.layout(measuredWidth15, measuredHeight13, GroupCallActivity.this.leaveButton.getMeasuredWidth() + measuredWidth15, GroupCallActivity.this.leaveButton.getMeasuredHeight() + measuredHeight13);
                    int measuredWidth16 = (getMeasuredWidth() - GroupCallActivity.this.muteButton.getMeasuredWidth()) / 2;
                    int measuredHeight14 = ((measuredHeight - GroupCallActivity.this.muteButton.getMeasuredHeight()) / 2) - AndroidUtilities.dp(9.0f);
                    GroupCallActivity.this.muteButton.layout(measuredWidth16, measuredHeight14, GroupCallActivity.this.muteButton.getMeasuredWidth() + measuredWidth16, GroupCallActivity.this.muteButton.getMeasuredHeight() + measuredHeight14);
                    GroupCallActivity.this.minimizeButton.layout(measuredWidth16, measuredHeight14, GroupCallActivity.this.minimizeButton.getMeasuredWidth() + measuredWidth16, GroupCallActivity.this.minimizeButton.getMeasuredHeight() + measuredHeight14);
                    GroupCallActivity.this.expandButton.layout(measuredWidth16, measuredHeight14, GroupCallActivity.this.expandButton.getMeasuredWidth() + measuredWidth16, GroupCallActivity.this.expandButton.getMeasuredHeight() + measuredHeight14);
                    GroupCallActivity.this.muteButton.animate().setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).scaleX(1.0f).scaleY(1.0f).start();
                    for (int i10 = 0; i10 < 2; i10++) {
                        int measuredWidth17 = (getMeasuredWidth() - GroupCallActivity.this.muteLabel[i10].getMeasuredWidth()) / 2;
                        int dp5 = (measuredHeight - AndroidUtilities.dp(12.0f)) - GroupCallActivity.this.muteLabel[i10].getMeasuredHeight();
                        GroupCallActivity.this.muteLabel[i10].layout(measuredWidth17, dp5, GroupCallActivity.this.muteLabel[i10].getMeasuredWidth() + measuredWidth17, GroupCallActivity.this.muteLabel[i10].getMeasuredHeight() + dp5);
                        GroupCallActivity.this.muteLabel[i10].animate().scaleX(1.0f).scaleY(1.0f).setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    }
                }
            } else {
                int measuredHeight15 = getMeasuredHeight() / i5;
                if (GroupCallActivity.this.soundButton.getVisibility() == 0) {
                    int i11 = measuredHeight15 / 2;
                    int measuredHeight16 = i11 - (GroupCallActivity.this.cameraButton.getMeasuredHeight() / 2);
                    int measuredWidth18 = (getMeasuredWidth() - GroupCallActivity.this.cameraButton.getMeasuredWidth()) >> 1;
                    GroupCallActivity.this.cameraButton.layout(measuredWidth18, measuredHeight16, GroupCallActivity.this.cameraButton.getMeasuredWidth() + measuredWidth18, GroupCallActivity.this.cameraButton.getMeasuredHeight() + measuredHeight16);
                    int measuredHeight17 = (i11 + (i5 == 4 ? measuredHeight15 : 0)) - (GroupCallActivity.this.soundButton.getMeasuredHeight() / 2);
                    int measuredWidth19 = (getMeasuredWidth() - GroupCallActivity.this.soundButton.getMeasuredWidth()) >> 1;
                    GroupCallActivity.this.soundButton.layout(measuredWidth19, measuredHeight17, GroupCallActivity.this.soundButton.getMeasuredWidth() + measuredWidth19, GroupCallActivity.this.soundButton.getMeasuredHeight() + measuredHeight17);
                } else {
                    int i12 = measuredHeight15 / 2;
                    int measuredHeight18 = i12 - (GroupCallActivity.this.flipButton.getMeasuredHeight() / 2);
                    int measuredWidth20 = (getMeasuredWidth() - GroupCallActivity.this.flipButton.getMeasuredWidth()) >> 1;
                    GroupCallActivity.this.flipButton.layout(measuredWidth20, measuredHeight18, GroupCallActivity.this.flipButton.getMeasuredWidth() + measuredWidth20, GroupCallActivity.this.flipButton.getMeasuredHeight() + measuredHeight18);
                    int measuredHeight19 = (i12 + (i5 == 4 ? measuredHeight15 : 0)) - (GroupCallActivity.this.cameraButton.getMeasuredHeight() / 2);
                    int measuredWidth21 = (getMeasuredWidth() - GroupCallActivity.this.cameraButton.getMeasuredWidth()) >> 1;
                    GroupCallActivity.this.cameraButton.layout(measuredWidth21, measuredHeight19, GroupCallActivity.this.cameraButton.getMeasuredWidth() + measuredWidth21, GroupCallActivity.this.cameraButton.getMeasuredHeight() + measuredHeight19);
                }
                int i13 = measuredHeight15 / 2;
                int measuredHeight20 = ((i5 == 4 ? measuredHeight15 * 3 : measuredHeight15 * 2) + i13) - (GroupCallActivity.this.leaveButton.getMeasuredHeight() / 2);
                int measuredWidth22 = (getMeasuredWidth() - GroupCallActivity.this.leaveButton.getMeasuredWidth()) >> 1;
                GroupCallActivity.this.leaveButton.layout(measuredWidth22, measuredHeight20, GroupCallActivity.this.leaveButton.getMeasuredWidth() + measuredWidth22, GroupCallActivity.this.leaveButton.getMeasuredHeight() + measuredHeight20);
                int measuredWidth23 = (((i5 == 4 ? measuredHeight15 * 2 : measuredHeight15) + i13) - (GroupCallActivity.this.muteButton.getMeasuredWidth() / 2)) - AndroidUtilities.dp(4.0f);
                int measuredWidth24 = (getMeasuredWidth() - GroupCallActivity.this.muteButton.getMeasuredWidth()) >> 1;
                if (i5 == 3) {
                    measuredWidth23 -= AndroidUtilities.dp(6.0f);
                }
                GroupCallActivity.this.muteButton.layout(measuredWidth24, measuredWidth23, GroupCallActivity.this.muteButton.getMeasuredWidth() + measuredWidth24, GroupCallActivity.this.muteButton.getMeasuredHeight() + measuredWidth23);
                GroupCallActivity.this.minimizeButton.layout(measuredWidth24, measuredWidth23, GroupCallActivity.this.minimizeButton.getMeasuredWidth() + measuredWidth24, GroupCallActivity.this.minimizeButton.getMeasuredHeight() + measuredWidth23);
                GroupCallActivity.this.expandButton.layout(measuredWidth24, measuredWidth23, GroupCallActivity.this.expandButton.getMeasuredWidth() + measuredWidth24, GroupCallActivity.this.expandButton.getMeasuredHeight() + measuredWidth23);
                float dp6 = AndroidUtilities.dp(52.0f) / (GroupCallActivity.this.muteButton.getMeasuredWidth() - AndroidUtilities.dp(8.0f));
                GroupCallActivity.this.muteButton.animate().cancel();
                GroupCallActivity.this.muteButton.setScaleX(dp6);
                GroupCallActivity.this.muteButton.setScaleY(dp6);
                for (int i14 = 0; i14 < 2; i14++) {
                    int measuredWidth25 = (getMeasuredWidth() - GroupCallActivity.this.muteLabel[i14].getMeasuredWidth()) >> 1;
                    int i15 = i5 == 4 ? measuredHeight15 * 2 : measuredHeight15;
                    int measuredWidth26 = ((i13 + i15) - (GroupCallActivity.this.muteButton.getMeasuredWidth() / 2)) - AndroidUtilities.dp(4.0f);
                    if (i5 == 3) {
                        measuredWidth26 -= AndroidUtilities.dp(6.0f);
                    }
                    int measuredWidth27 = (int) (measuredWidth26 + (GroupCallActivity.this.muteButton.getMeasuredWidth() * 0.687f) + AndroidUtilities.dp(4.0f));
                    if (GroupCallActivity.this.muteLabel[i14].getMeasuredHeight() + measuredWidth27 > i15 + measuredHeight15) {
                        measuredWidth27 -= AndroidUtilities.dp(4.0f);
                    }
                    GroupCallActivity.this.muteLabel[i14].layout(measuredWidth25, measuredWidth27, GroupCallActivity.this.muteLabel[i14].getMeasuredWidth() + measuredWidth25, GroupCallActivity.this.muteLabel[i14].getMeasuredHeight() + measuredWidth27);
                    GroupCallActivity.this.muteLabel[i14].setScaleX(0.687f);
                    GroupCallActivity.this.muteLabel[i14].setScaleY(0.687f);
                }
            }
            if (GroupCallActivity.this.animateButtonsOnNextLayout) {
                AnimatorSet animatorSet = new AnimatorSet();
                boolean z2 = false;
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    Float f = (Float) GroupCallActivity.this.buttonsAnimationParamsX.get(childAt);
                    Float f2 = (Float) GroupCallActivity.this.buttonsAnimationParamsY.get(childAt);
                    if (f != null && f2 != null) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(childAt, FrameLayout.TRANSLATION_X, f.floatValue() - childAt.getLeft(), 0.0f));
                        animatorSet.playTogether(ObjectAnimator.ofFloat(childAt, FrameLayout.TRANSLATION_Y, f2.floatValue() - childAt.getTop(), 0.0f));
                        z2 = true;
                    }
                }
                if (z2) {
                    AnimatorSet animatorSet2 = this.currentButtonsAnimation;
                    if (animatorSet2 != null) {
                        animatorSet2.removeAllListeners();
                        this.currentButtonsAnimation.cancel();
                    }
                    this.currentButtonsAnimation = animatorSet;
                    animatorSet.setDuration(350L);
                    animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    animatorSet.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            AnonymousClass17.this.currentButtonsAnimation = null;
                            for (int i17 = 0; i17 < AnonymousClass17.this.getChildCount(); i17++) {
                                View childAt2 = AnonymousClass17.this.getChildAt(i17);
                                childAt2.setTranslationX(0.0f);
                                childAt2.setTranslationY(0.0f);
                            }
                        }
                    });
                    animatorSet.start();
                }
                GroupCallActivity.this.buttonsAnimationParamsX.clear();
                GroupCallActivity.this.buttonsAnimationParamsY.clear();
            }
            GroupCallActivity.this.animateButtonsOnNextLayout = false;
        }

        @Override
        @android.annotation.SuppressLint({"DrawAllocation"})
        protected void dispatchDraw(android.graphics.Canvas r27) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.AnonymousClass17.dispatchDraw(android.graphics.Canvas):void");
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == GroupCallActivity.this.muteButton && view.getScaleX() != 1.0f) {
                canvas.save();
                float scaleX = (((1.0f / GroupCallActivity.this.muteButton.getScaleX()) - 1.0f) * 0.2f) + 1.0f;
                canvas.scale(scaleX, scaleX, view.getX() + (view.getMeasuredWidth() / 2.0f), view.getY() + (view.getMeasuredHeight() / 2.0f));
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            }
            return super.drawChild(canvas, view, j);
        }
    }

    public void lambda$new$16(View view) {
        ChatObject.Call call = this.call;
        if (call == null || call.isScheduled() || isRtmpStream()) {
            getLink(false);
        } else if (VoIPService.getSharedInstance() == null) {
        } else {
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(getContext(), false);
        }
    }

    public void lambda$new$17(View view) {
        this.renderersContainer.delayHideUi();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (sharedInstance.getVideoState(false) == 2) {
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
                for (int i = 0; i < this.attachedRenderers.size(); i++) {
                    GroupCallMiniTextureView groupCallMiniTextureView = this.attachedRenderers.get(i);
                    ChatObject.VideoParticipant videoParticipant = groupCallMiniTextureView.participant;
                    if (videoParticipant.participant.self && !videoParticipant.presentation) {
                        groupCallMiniTextureView.startFlipAnimation();
                    }
                }
            }
        }
    }

    public void lambda$new$18(Context context, View view) {
        this.renderersContainer.delayHideUi();
        ChatObject.Call call = this.call;
        if (call == null || call.isScheduled()) {
            dismiss();
            return;
        }
        updateItems();
        onLeaveClick(context, new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.this.dismiss();
            }
        }, false);
    }

    public class AnonymousClass19 implements View.OnClickListener {
        Runnable finishRunnable = new Runnable() {
            @Override
            public void run() {
                GroupCallActivity.this.muteButton.setAnimation(GroupCallActivity.this.bigMicDrawable);
                GroupCallActivity.this.playingHandAnimation = false;
            }
        };

        AnonymousClass19() {
        }

        @Override
        @SuppressLint({"SourceLockedOrientationActivity"})
        public void onClick(View view) {
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            if (groupCallActivity.call == null || groupCallActivity.muteButtonState == 3) {
                return;
            }
            int i = 0;
            if (!GroupCallActivity.this.isRtmpStream() || GroupCallActivity.this.call.isScheduled()) {
                if (GroupCallActivity.this.muteButtonState == 5) {
                    if (GroupCallActivity.this.startingGroupCall) {
                        return;
                    }
                    view.performHapticFeedback(3, 2);
                    GroupCallActivity.this.startingGroupCall = true;
                    TLRPC$TL_phone_startScheduledGroupCall tLRPC$TL_phone_startScheduledGroupCall = new TLRPC$TL_phone_startScheduledGroupCall();
                    tLRPC$TL_phone_startScheduledGroupCall.call = GroupCallActivity.this.call.getInputGroupCall();
                    GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_phone_startScheduledGroupCall, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            GroupCallActivity.AnonymousClass19.this.lambda$onClick$1(tLObject, tLRPC$TL_error);
                        }
                    });
                    return;
                } else if (GroupCallActivity.this.muteButtonState == 7 || GroupCallActivity.this.muteButtonState == 6) {
                    if (GroupCallActivity.this.muteButtonState == 6 && GroupCallActivity.this.reminderHintView != null) {
                        GroupCallActivity.this.reminderHintView.hide();
                    }
                    TLRPC$TL_phone_toggleGroupCallStartSubscription tLRPC$TL_phone_toggleGroupCallStartSubscription = new TLRPC$TL_phone_toggleGroupCallStartSubscription();
                    tLRPC$TL_phone_toggleGroupCallStartSubscription.call = GroupCallActivity.this.call.getInputGroupCall();
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    TLRPC$GroupCall tLRPC$GroupCall = groupCallActivity2.call.call;
                    boolean z = !tLRPC$GroupCall.schedule_start_subscribed;
                    tLRPC$GroupCall.schedule_start_subscribed = z;
                    tLRPC$TL_phone_toggleGroupCallStartSubscription.subscribed = z;
                    groupCallActivity2.accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_phone_toggleGroupCallStartSubscription, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            GroupCallActivity.AnonymousClass19.this.lambda$onClick$2(tLObject, tLRPC$TL_error);
                        }
                    });
                    GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                    groupCallActivity3.updateMuteButton(groupCallActivity3.call.call.schedule_start_subscribed ? 7 : 6, true);
                    return;
                } else if (VoIPService.getSharedInstance() == null || GroupCallActivity.this.isStillConnecting()) {
                    return;
                } else {
                    if (GroupCallActivity.this.muteButtonState == 2 || GroupCallActivity.this.muteButtonState == 4) {
                        if (GroupCallActivity.this.playingHandAnimation) {
                            return;
                        }
                        GroupCallActivity.this.playingHandAnimation = true;
                        AndroidUtilities.shakeView(GroupCallActivity.this.muteLabel[0]);
                        view.performHapticFeedback(3, 2);
                        int nextInt = Utilities.random.nextInt(100);
                        int i2 = 540;
                        if (nextInt < 32) {
                            i2 = 120;
                        } else if (nextInt < 64) {
                            i2 = 240;
                            i = 120;
                        } else if (nextInt < 97) {
                            i2 = 420;
                            i = 240;
                        } else if (nextInt == 98) {
                            i = 420;
                        } else {
                            i2 = 720;
                            i = 540;
                        }
                        GroupCallActivity.this.handDrawables.setCustomEndFrame(i2);
                        GroupCallActivity.this.handDrawables.setOnFinishCallback(this.finishRunnable, i2 - 1);
                        GroupCallActivity.this.muteButton.setAnimation(GroupCallActivity.this.handDrawables);
                        GroupCallActivity.this.handDrawables.setCurrentFrame(i);
                        GroupCallActivity.this.muteButton.playAnimation();
                        if (GroupCallActivity.this.muteButtonState == 2) {
                            GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                            long peerId = MessageObject.getPeerId(groupCallActivity4.call.participants.get(MessageObject.getPeerId(groupCallActivity4.selfPeer)).peer);
                            VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? GroupCallActivity.this.accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : GroupCallActivity.this.accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
                            GroupCallActivity.this.updateMuteButton(4, true);
                            return;
                        }
                        return;
                    } else if (GroupCallActivity.this.muteButtonState == 0) {
                        GroupCallActivity.this.updateMuteButton(1, true);
                        VoIPService.getSharedInstance().setMicMute(false, false, true);
                        GroupCallActivity.this.muteButton.performHapticFeedback(3, 2);
                        return;
                    } else {
                        GroupCallActivity.this.updateMuteButton(0, true);
                        VoIPService.getSharedInstance().setMicMute(true, false, true);
                        GroupCallActivity.this.muteButton.performHapticFeedback(3, 2);
                        return;
                    }
                }
            }
            if (GroupCallActivity.this.renderersContainer != null && GroupCallActivity.this.renderersContainer.inFullscreenMode && (AndroidUtilities.isTablet() || GroupCallActivity.isLandscapeMode == GroupCallActivity.this.isRtmpLandscapeMode())) {
                GroupCallActivity.this.fullscreenFor(null);
                if (GroupCallActivity.isLandscapeMode) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            GroupCallActivity.AnonymousClass19.this.lambda$onClick$0();
                        }
                    }, 200L);
                }
                GroupCallActivity.this.parentActivity.setRequestedOrientation(-1);
            } else if (GroupCallActivity.this.visibleVideoParticipants.isEmpty()) {
            } else {
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
                } else {
                    GroupCallActivity.this.parentActivity.setRequestedOrientation(1);
                }
            }
        }

        public void lambda$onClick$0() {
            GroupCallActivity.this.wasNotInLayoutFullscreen = null;
            GroupCallActivity.this.wasExpandBigSize = null;
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            groupCallActivity.updateMuteButton(groupCallActivity.muteButtonState, true);
        }

        public void lambda$onClick$1(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (tLObject != null) {
                GroupCallActivity.this.accountInstance.getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
            }
        }

        public void lambda$onClick$2(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (tLObject != null) {
                GroupCallActivity.this.accountInstance.getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
            }
        }
    }

    public void lambda$new$19(int i) {
        this.actionBar.getActionBarMenuOnItemClick().onItemClick(i);
    }

    public void lambda$new$20(View view) {
        ChatObject.Call call = this.call;
        if (call == null || this.renderersContainer.inFullscreenMode) {
            return;
        }
        if (call.call.join_muted) {
            ActionBarMenuSubItem actionBarMenuSubItem = this.everyoneItem;
            int i = Theme.key_voipgroup_actionBarItems;
            actionBarMenuSubItem.setColors(Theme.getColor(i), Theme.getColor(i));
            this.everyoneItem.setChecked(false);
            ActionBarMenuSubItem actionBarMenuSubItem2 = this.adminItem;
            int i2 = Theme.key_voipgroup_checkMenu;
            actionBarMenuSubItem2.setColors(Theme.getColor(i2), Theme.getColor(i2));
            this.adminItem.setChecked(true);
        } else {
            ActionBarMenuSubItem actionBarMenuSubItem3 = this.everyoneItem;
            int i3 = Theme.key_voipgroup_checkMenu;
            actionBarMenuSubItem3.setColors(Theme.getColor(i3), Theme.getColor(i3));
            this.everyoneItem.setChecked(true);
            ActionBarMenuSubItem actionBarMenuSubItem4 = this.adminItem;
            int i4 = Theme.key_voipgroup_actionBarItems;
            actionBarMenuSubItem4.setColors(Theme.getColor(i4), Theme.getColor(i4));
            this.adminItem.setChecked(false);
        }
        this.changingPermissions = false;
        this.otherItem.hideSubItem(1);
        this.otherItem.hideSubItem(2);
        if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
            int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
            if (currentAudioRoute == 2) {
                this.soundItem.setIcon(R.drawable.msg_voice_bluetooth);
                this.soundItem.setSubtext(VoIPService.getSharedInstance().currentBluetoothDeviceName != null ? VoIPService.getSharedInstance().currentBluetoothDeviceName : LocaleController.getString("VoipAudioRoutingBluetooth", R.string.VoipAudioRoutingBluetooth));
            } else if (currentAudioRoute == 0) {
                this.soundItem.setIcon(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone);
                this.soundItem.setSubtext(VoIPService.getSharedInstance().isHeadsetPlugged() ? LocaleController.getString("VoipAudioRoutingHeadset", R.string.VoipAudioRoutingHeadset) : LocaleController.getString("VoipAudioRoutingPhone", R.string.VoipAudioRoutingPhone));
            } else if (currentAudioRoute == 1) {
                if (VoipAudioManager.get().isSpeakerphoneOn()) {
                    this.soundItem.setIcon(R.drawable.msg_voice_speaker);
                    this.soundItem.setSubtext(LocaleController.getString("VoipAudioRoutingSpeaker", R.string.VoipAudioRoutingSpeaker));
                } else {
                    this.soundItem.setIcon(R.drawable.msg_voice_phone);
                    this.soundItem.setSubtext(LocaleController.getString("VoipAudioRoutingPhone", R.string.VoipAudioRoutingPhone));
                }
            }
        }
        updateItems();
        this.otherItem.toggleSubMenu();
    }

    public void lambda$new$21(View view) {
        if (isRtmpStream()) {
            if (AndroidUtilities.checkInlinePermissions(this.parentActivity)) {
                RTMPStreamPipOverlay.show();
                dismiss();
                return;
            }
            AlertsCreator.createDrawOverlayPermissionDialog(this.parentActivity, null).show();
        } else if (AndroidUtilities.checkInlinePermissions(this.parentActivity)) {
            GroupCallPip.clearForce();
            dismiss();
        } else {
            AlertsCreator.createDrawOverlayGroupCallPermissionDialog(getContext()).show();
        }
    }

    public void lambda$new$22(View view) {
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

    public class AnonymousClass20 extends AudioPlayerAlert.ClippingTextViewSwitcher {
        final Context val$context;

        AnonymousClass20(Context context, Context context2) {
            super(context);
            this.val$context = context2;
        }

        @Override
        protected TextView createTextView() {
            final TextView textView = new TextView(this.val$context);
            textView.setTextColor(Theme.getColor(Theme.key_voipgroup_actionBarItems));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            textView.setGravity(51);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    GroupCallActivity.AnonymousClass20.this.lambda$createTextView$0(textView, view);
                }
            });
            return textView;
        }

        public void lambda$createTextView$0(TextView textView, View view) {
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            ChatObject.Call call = groupCallActivity.call;
            if (call == null || !call.recording) {
                return;
            }
            groupCallActivity.showRecordHint(textView);
        }
    }

    public void lambda$new$23(View view) {
        ChatObject.Call call = this.call;
        if (call == null || !call.recording) {
            return;
        }
        showRecordHint(this.actionBar.getTitleTextView());
    }

    public void lambda$new$24(View view, int i) {
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) view;
        if (groupCallUserCell.getVideoParticipant() == null) {
            fullscreenFor(new ChatObject.VideoParticipant(groupCallUserCell.getParticipant(), false, false));
        } else {
            fullscreenFor(groupCallUserCell.getVideoParticipant());
        }
    }

    public boolean lambda$new$25(View view, int i) {
        if (showMenuForCell(view)) {
            this.listView.performHapticFeedback(0);
        }
        return false;
    }

    public class AnonymousClass27 extends GroupCallRenderersContainer {
        ValueAnimator uiVisibilityAnimator;

        AnonymousClass27(Context context, RecyclerView recyclerView, RecyclerView recyclerView2, ArrayList arrayList, ChatObject.Call call, GroupCallActivity groupCallActivity) {
            super(context, recyclerView, recyclerView2, arrayList, call, groupCallActivity);
        }

        @Override
        protected void update() {
            super.update();
            ((BottomSheet) GroupCallActivity.this).navBarColor = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_actionBarUnscrolled), Theme.getColor(Theme.key_voipgroup_actionBar), Math.max(GroupCallActivity.this.colorProgress, GroupCallActivity.this.renderersContainer == null ? 0.0f : GroupCallActivity.this.renderersContainer.progressToFullscreenMode), 1.0f);
            ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            GroupCallActivity groupCallActivity = GroupCallActivity.this;
            groupCallActivity.setColorProgress(groupCallActivity.colorProgress);
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == GroupCallActivity.this.scrimRenderer) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }

        @Override
        protected void onFullScreenModeChanged(boolean z) {
            GroupCallActivity.this.delayedGroupCallUpdated = z;
            if (GroupCallActivity.isTabletMode) {
                if (z || !GroupCallActivity.this.renderersContainer.inFullscreenMode) {
                    return;
                }
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                groupCallActivity.tabletGridAdapter.setVisibility(groupCallActivity.tabletVideoGridView, false, true);
                return;
            }
            if (z) {
                GroupCallActivity.this.undoView[0].hide(false, 1);
                GroupCallActivity.this.renderersContainer.undoView[0].hide(false, 2);
                if (!GroupCallActivity.this.renderersContainer.inFullscreenMode) {
                    GroupCallActivity.this.listView.setVisibility(0);
                    GroupCallActivity.this.actionBar.setVisibility(0);
                }
                GroupCallActivity.this.updateState(true, false);
                GroupCallActivity.this.buttonsContainer.requestLayout();
                if (GroupCallActivity.this.fullscreenUsersListView.getVisibility() != 0) {
                    GroupCallActivity.this.fullscreenUsersListView.setVisibility(0);
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    groupCallActivity2.fullscreenAdapter.setVisibility(groupCallActivity2.fullscreenUsersListView, true);
                    GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                    groupCallActivity3.fullscreenAdapter.update(false, groupCallActivity3.fullscreenUsersListView);
                } else {
                    GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                    groupCallActivity4.fullscreenAdapter.setVisibility(groupCallActivity4.fullscreenUsersListView, true);
                    GroupCallActivity.this.applyCallParticipantUpdates(true);
                }
            } else {
                if (GroupCallActivity.this.renderersContainer.inFullscreenMode) {
                    GroupCallActivity.this.actionBar.setVisibility(8);
                    GroupCallActivity.this.listView.setVisibility(8);
                } else {
                    GroupCallActivity.this.fullscreenUsersListView.setVisibility(8);
                    GroupCallActivity groupCallActivity5 = GroupCallActivity.this;
                    groupCallActivity5.fullscreenAdapter.setVisibility(groupCallActivity5.fullscreenUsersListView, false);
                }
                if (GroupCallActivity.this.fullscreenUsersListView.getVisibility() == 0) {
                    for (int i = 0; i < GroupCallActivity.this.fullscreenUsersListView.getChildCount(); i++) {
                        View childAt = GroupCallActivity.this.fullscreenUsersListView.getChildAt(i);
                        childAt.setAlpha(1.0f);
                        childAt.setScaleX(1.0f);
                        childAt.setScaleY(1.0f);
                        childAt.setTranslationX(0.0f);
                        childAt.setTranslationY(0.0f);
                        ((GroupCallFullscreenAdapter.GroupCallUserCell) childAt).setProgressToFullscreen(GroupCallActivity.this.renderersContainer.progressToFullscreenMode);
                    }
                }
            }
            GroupCallActivity.this.buttonsBackgroundGradientView2.setVisibility(z ? 0 : 8);
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
            final boolean isUiVisible = GroupCallActivity.this.renderersContainer.isUiVisible();
            ValueAnimator valueAnimator = this.uiVisibilityAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.uiVisibilityAnimator.cancel();
            }
            float[] fArr = new float[2];
            fArr[0] = GroupCallActivity.this.progressToHideUi;
            fArr[1] = isUiVisible ? 0.0f : 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.uiVisibilityAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    GroupCallActivity.AnonymousClass27.this.lambda$onUiVisibilityChanged$0(valueAnimator2);
                }
            });
            this.uiVisibilityAnimator.setDuration(350L);
            this.uiVisibilityAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.uiVisibilityAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationStart(Animator animator) {
                    GroupCallActivity.this.invalidateLayoutFullscreen();
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    AnonymousClass27 anonymousClass27 = AnonymousClass27.this;
                    anonymousClass27.uiVisibilityAnimator = null;
                    GroupCallActivity groupCallActivity = GroupCallActivity.this;
                    groupCallActivity.progressToHideUi = isUiVisible ? 0.0f : 1.0f;
                    groupCallActivity.renderersContainer.setProgressToHideUi(GroupCallActivity.this.progressToHideUi);
                    GroupCallActivity.this.fullscreenUsersListView.invalidate();
                    ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                    GroupCallActivity.this.buttonsContainer.invalidate();
                }
            });
            this.uiVisibilityAnimator.start();
        }

        public void lambda$onUiVisibilityChanged$0(ValueAnimator valueAnimator) {
            GroupCallActivity.this.progressToHideUi = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            GroupCallActivity.this.renderersContainer.setProgressToHideUi(GroupCallActivity.this.progressToHideUi);
            GroupCallActivity.this.fullscreenUsersListView.invalidate();
            ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            GroupCallActivity.this.buttonsContainer.invalidate();
        }

        @Override
        protected boolean canHideUI() {
            return super.canHideUI() && GroupCallActivity.this.previewDialog == null;
        }

        @Override
        protected void onBackPressed() {
            GroupCallActivity.this.onBackPressed();
        }
    }

    public void lambda$new$30(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, final TLRPC$Chat tLRPC$Chat, AccountInstance accountInstance, final TLRPC$InputPeer tLRPC$InputPeer, View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.scheduleAnimator = ofFloat;
        ofFloat.setDuration(600L);
        this.scheduleAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GroupCallActivity.this.lambda$new$26(valueAnimator);
            }
        });
        this.scheduleAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                GroupCallActivity.this.scheduleAnimator = null;
            }
        });
        this.scheduleAnimator.start();
        if (ChatObject.isChannelOrGiga(this.currentChat)) {
            this.titleTextView.setText(LocaleController.getString("VoipChannelVoiceChat", R.string.VoipChannelVoiceChat), true);
        } else {
            this.titleTextView.setText(LocaleController.getString("VoipGroupVoiceChat", R.string.VoipGroupVoiceChat), true);
        }
        Calendar calendar = Calendar.getInstance();
        boolean checkScheduleDate = AlertsCreator.checkScheduleDate(null, null, 604800L, 3, numberPicker, numberPicker2, numberPicker3);
        calendar.setTimeInMillis(System.currentTimeMillis() + (numberPicker.getValue() * 24 * 3600 * 1000));
        calendar.set(11, numberPicker2.getValue());
        calendar.set(12, numberPicker3.getValue());
        if (checkScheduleDate) {
            calendar.set(13, 0);
        }
        this.scheduleStartAt = (int) (calendar.getTimeInMillis() / 1000);
        updateScheduleUI(false);
        TLRPC$TL_phone_createGroupCall tLRPC$TL_phone_createGroupCall = new TLRPC$TL_phone_createGroupCall();
        tLRPC$TL_phone_createGroupCall.peer = MessagesController.getInputPeer(tLRPC$Chat);
        tLRPC$TL_phone_createGroupCall.random_id = Utilities.random.nextInt();
        tLRPC$TL_phone_createGroupCall.schedule_date = this.scheduleStartAt;
        tLRPC$TL_phone_createGroupCall.flags |= 2;
        accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_phone_createGroupCall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                GroupCallActivity.this.lambda$new$29(tLRPC$Chat, tLRPC$InputPeer, tLObject, tLRPC$TL_error);
            }
        }, 2);
    }

    public void lambda$new$26(ValueAnimator valueAnimator) {
        this.switchToButtonProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateScheduleUI(true);
        this.buttonsContainer.invalidate();
        this.listView.invalidate();
    }

    public void lambda$new$29(final TLRPC$Chat tLRPC$Chat, final TLRPC$InputPeer tLRPC$InputPeer, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
            int i = 0;
            while (true) {
                if (i >= tLRPC$Updates.updates.size()) {
                    break;
                }
                TLRPC$Update tLRPC$Update = tLRPC$Updates.updates.get(i);
                if (tLRPC$Update instanceof TLRPC$TL_updateGroupCall) {
                    final TLRPC$TL_updateGroupCall tLRPC$TL_updateGroupCall = (TLRPC$TL_updateGroupCall) tLRPC$Update;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            GroupCallActivity.this.lambda$new$27(tLRPC$Chat, tLRPC$InputPeer, tLRPC$TL_updateGroupCall);
                        }
                    });
                    break;
                }
                i++;
            }
            this.accountInstance.getMessagesController().processUpdates(tLRPC$Updates, false);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.this.lambda$new$28(tLRPC$TL_error);
            }
        });
    }

    public void lambda$new$27(TLRPC$Chat tLRPC$Chat, TLRPC$InputPeer tLRPC$InputPeer, TLRPC$TL_updateGroupCall tLRPC$TL_updateGroupCall) {
        ChatObject.Call call = new ChatObject.Call();
        this.call = call;
        call.call = new TLRPC$TL_groupCall();
        ChatObject.Call call2 = this.call;
        TLRPC$GroupCall tLRPC$GroupCall = call2.call;
        tLRPC$GroupCall.participants_count = 0;
        tLRPC$GroupCall.version = 1;
        tLRPC$GroupCall.can_start_video = true;
        tLRPC$GroupCall.can_change_join_muted = true;
        call2.chatId = tLRPC$Chat.id;
        tLRPC$GroupCall.schedule_date = this.scheduleStartAt;
        tLRPC$GroupCall.flags |= 128;
        call2.currentAccount = this.accountInstance;
        call2.setSelfPeer(tLRPC$InputPeer);
        ChatObject.Call call3 = this.call;
        TLRPC$GroupCall tLRPC$GroupCall2 = call3.call;
        TLRPC$GroupCall tLRPC$GroupCall3 = tLRPC$TL_updateGroupCall.call;
        tLRPC$GroupCall2.access_hash = tLRPC$GroupCall3.access_hash;
        tLRPC$GroupCall2.id = tLRPC$GroupCall3.id;
        call3.createNoVideoParticipant();
        this.fullscreenAdapter.setGroupCall(this.call);
        this.renderersContainer.setGroupCall(this.call);
        this.tabletGridAdapter.setGroupCall(this.call);
        MessagesController messagesController = this.accountInstance.getMessagesController();
        ChatObject.Call call4 = this.call;
        messagesController.putGroupCall(call4.chatId, call4);
    }

    public void lambda$new$28(TLRPC$TL_error tLRPC$TL_error) {
        this.accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, tLRPC$TL_error.text);
        dismiss();
    }

    public static String lambda$new$31(long j, Calendar calendar, int i, int i2) {
        if (i2 == 0) {
            return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
        }
        long j2 = j + (i2 * 86400000);
        calendar.setTimeInMillis(j2);
        if (calendar.get(1) == i) {
            return LocaleController.getInstance().formatterWeek.format(j2) + " " + LocaleController.getInstance().formatterScheduleDay.format(j2);
        }
        return LocaleController.getInstance().formatterScheduleYear.format(j2);
    }

    public void lambda$new$32(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i, int i2) {
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AlertsCreator.checkScheduleDate(this.scheduleButtonTextView, this.scheduleInfoTextView, 604800L, 2, numberPicker, numberPicker2, numberPicker3);
    }

    public static String lambda$new$33(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static String lambda$new$34(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public void lambda$new$35(Context context, View view) {
        LaunchActivity launchActivity;
        if (Build.VERSION.SDK_INT >= 23 && (launchActivity = this.parentActivity) != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            this.parentActivity.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
        } else if (VoIPService.getSharedInstance() == null) {
        } else {
            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                this.undoView[0].hide(false, 1);
                if (this.previewDialog == null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null) {
                        sharedInstance.createCaptureDevice(false);
                    }
                    PrivateVideoPreviewDialog privateVideoPreviewDialog = new PrivateVideoPreviewDialog(context, true, VoIPService.getSharedInstance().getVideoState(true) != 2) {
                        @Override
                        public void onDismiss(boolean z, boolean z2) {
                            GroupCallActivity groupCallActivity = GroupCallActivity.this;
                            boolean z3 = groupCallActivity.previewDialog.micEnabled;
                            groupCallActivity.previewDialog = null;
                            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                            if (!z2) {
                                if (sharedInstance2 != null) {
                                    sharedInstance2.setVideoState(false, 0);
                                    return;
                                }
                                return;
                            }
                            if (sharedInstance2 != null) {
                                sharedInstance2.setupCaptureDevice(z, z3);
                            }
                            if (z && sharedInstance2 != null) {
                                sharedInstance2.setVideoState(false, 0);
                            }
                            GroupCallActivity.this.updateState(true, false);
                            GroupCallActivity.this.call.sortParticipants();
                            GroupCallActivity.this.applyCallParticipantUpdates(true);
                            GroupCallActivity.this.buttonsContainer.requestLayout();
                        }
                    };
                    this.previewDialog = privateVideoPreviewDialog;
                    this.container.addView(privateVideoPreviewDialog);
                    if (sharedInstance == null || sharedInstance.isFrontFaceCamera()) {
                        return;
                    }
                    sharedInstance.switchCamera();
                    return;
                }
                return;
            }
            VoIPService.getSharedInstance().setVideoState(false, 0);
            updateState(true, false);
            updateSpeakerPhoneIcon(false);
            this.call.sortParticipants();
            applyCallParticipantUpdates(true);
            this.buttonsContainer.requestLayout();
        }
    }

    public LaunchActivity getParentActivity() {
        return this.parentActivity;
    }

    public void invalidateLayoutFullscreen() {
        int i;
        if (isRtmpStream()) {
            boolean z = (!this.renderersContainer.isUiVisible() && this.renderersContainer.inFullscreenMode && (isLandscapeMode == isRtmpLandscapeMode() || AndroidUtilities.isTablet())) ? false : true;
            Boolean bool = this.wasNotInLayoutFullscreen;
            if (bool == null || z != bool.booleanValue()) {
                int systemUiVisibility = this.containerView.getSystemUiVisibility();
                if (z) {
                    i = systemUiVisibility & (-5) & (-3);
                    getWindow().clearFlags(1024);
                    setHideSystemVerticalInsets(false);
                } else {
                    setHideSystemVerticalInsets(true);
                    i = systemUiVisibility | 4 | 2;
                    getWindow().addFlags(1024);
                }
                this.containerView.setSystemUiVisibility(i);
                this.wasNotInLayoutFullscreen = Boolean.valueOf(z);
            }
        }
    }

    public LinearLayout getMenuItemsContainer() {
        return this.menuItemsContainer;
    }

    public void fullscreenFor(final ChatObject.VideoParticipant videoParticipant) {
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null) {
            this.parentActivity.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() == null || this.renderersContainer.isAnimating()) {
            return;
        }
        if (isTabletMode) {
            if (this.requestFullscreenListener != null) {
                this.listView.getViewTreeObserver().removeOnPreDrawListener(this.requestFullscreenListener);
                this.requestFullscreenListener = null;
            }
            final ArrayList arrayList = new ArrayList();
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
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            GroupCallActivity.this.lambda$fullscreenFor$36(arrayList);
                        }
                    });
                }
            }
            final boolean z = !this.renderersContainer.inFullscreenMode;
            ViewTreeObserver viewTreeObserver = this.listView.getViewTreeObserver();
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() {
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
                    return false;
                }
            };
            this.requestFullscreenListener = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
            return;
        }
        if (this.requestFullscreenListener != null) {
            this.listView.getViewTreeObserver().removeOnPreDrawListener(this.requestFullscreenListener);
            this.requestFullscreenListener = null;
        }
        if (videoParticipant != null) {
            if (this.fullscreenUsersListView.getVisibility() != 0) {
                this.fullscreenUsersListView.setVisibility(0);
                this.fullscreenAdapter.update(false, this.fullscreenUsersListView);
                this.delayedGroupCallUpdated = true;
                if (!this.renderersContainer.inFullscreenMode) {
                    this.fullscreenAdapter.scrollTo(videoParticipant, this.fullscreenUsersListView);
                }
                ViewTreeObserver viewTreeObserver2 = this.listView.getViewTreeObserver();
                ViewTreeObserver.OnPreDrawListener onPreDrawListener2 = new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public boolean onPreDraw() {
                        GroupCallActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                        GroupCallActivity groupCallActivity = GroupCallActivity.this;
                        groupCallActivity.requestFullscreenListener = null;
                        groupCallActivity.renderersContainer.requestFullscreen(videoParticipant);
                        AndroidUtilities.updateVisibleRows(GroupCallActivity.this.fullscreenUsersListView);
                        return false;
                    }
                };
                this.requestFullscreenListener = onPreDrawListener2;
                viewTreeObserver2.addOnPreDrawListener(onPreDrawListener2);
                return;
            }
            this.renderersContainer.requestFullscreen(videoParticipant);
            AndroidUtilities.updateVisibleRows(this.fullscreenUsersListView);
        } else if (this.listView.getVisibility() != 0) {
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
                    return false;
                }
            };
            this.requestFullscreenListener = onPreDrawListener3;
            viewTreeObserver3.addOnPreDrawListener(onPreDrawListener3);
        } else {
            ViewTreeObserver viewTreeObserver4 = this.listView.getViewTreeObserver();
            ViewTreeObserver.OnPreDrawListener onPreDrawListener4 = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public boolean onPreDraw() {
                    GroupCallActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                    GroupCallActivity.this.renderersContainer.requestFullscreen(null);
                    AndroidUtilities.updateVisibleRows(GroupCallActivity.this.fullscreenUsersListView);
                    return false;
                }
            };
            this.requestFullscreenListener = onPreDrawListener4;
            viewTreeObserver4.addOnPreDrawListener(onPreDrawListener4);
        }
    }

    public void lambda$fullscreenFor$36(ArrayList arrayList) {
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

    public void enableCamera() {
        this.cameraButton.callOnClick();
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

    private void updateScheduleUI(boolean z) {
        float interpolation;
        float f;
        LinearLayout linearLayout = this.scheduleTimerContainer;
        if ((linearLayout == null || this.call != null) && this.scheduleAnimator == null) {
            this.scheduleButtonsScale = 1.0f;
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
                this.leaveItem.setText(LocaleController.getString("VoipChannelCancelChat", R.string.VoipChannelCancelChat));
            } else {
                this.leaveItem.setText(LocaleController.getString("VoipGroupCancelChat", R.string.VoipGroupCancelChat));
            }
        }
        float f2 = this.switchToButtonProgress;
        if (f2 > 0.6f) {
            interpolation = 1.05f - (CubicBezierInterpolator.DEFAULT.getInterpolation((f2 - 0.6f) / 0.4f) * 0.05f);
            this.scheduleButtonsScale = interpolation;
            this.switchToButtonInt2 = 1.0f;
            f = 1.0f;
        } else {
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            this.scheduleButtonsScale = (cubicBezierInterpolator.getInterpolation(f2 / 0.6f) * 0.05f) + 1.0f;
            this.switchToButtonInt2 = cubicBezierInterpolator.getInterpolation(this.switchToButtonProgress / 0.6f);
            interpolation = 1.05f * cubicBezierInterpolator.getInterpolation(this.switchToButtonProgress / 0.6f);
            f = this.switchToButtonProgress / 0.6f;
        }
        float dp = isLandscapeMode ? (AndroidUtilities.dp(52.0f) * interpolation) / (this.muteButton.getMeasuredWidth() - AndroidUtilities.dp(8.0f)) : interpolation;
        float f3 = 1.0f - f;
        this.leaveButton.setAlpha(f);
        VoIPToggleButton voIPToggleButton = this.soundButton;
        voIPToggleButton.setAlpha((voIPToggleButton.isEnabled() ? 1.0f : 0.5f) * f);
        this.muteButton.setAlpha(f);
        this.scheduleTimerContainer.setAlpha(f3);
        this.scheduleStartInTextView.setAlpha(f);
        this.scheduleStartAtTextView.setAlpha(f);
        this.scheduleTimeTextView.setAlpha(f);
        this.muteLabel[0].setAlpha(f);
        this.scheduleTimeTextView.setScaleX(interpolation);
        this.scheduleTimeTextView.setScaleY(interpolation);
        this.leaveButton.setScaleX(interpolation);
        this.leaveButton.setScaleY(interpolation);
        this.soundButton.setScaleX(interpolation);
        this.soundButton.setScaleY(interpolation);
        this.muteButton.setScaleX(dp);
        this.muteButton.setScaleY(dp);
        this.scheduleButtonTextView.setScaleX(f3);
        this.scheduleButtonTextView.setScaleY(f3);
        this.scheduleButtonTextView.setAlpha(f3);
        this.scheduleInfoTextView.setAlpha(f3);
        this.cameraButton.setAlpha(f);
        this.cameraButton.setScaleY(interpolation);
        this.cameraButton.setScaleX(interpolation);
        this.flipButton.setAlpha(f);
        this.flipButton.setScaleY(interpolation);
        this.flipButton.setScaleX(interpolation);
        this.otherItem.setAlpha(f);
        int i = f3 != 0.0f ? 0 : 4;
        if (i != this.scheduleTimerContainer.getVisibility()) {
            this.scheduleTimerContainer.setVisibility(i);
            this.scheduleButtonTextView.setVisibility(i);
        }
    }

    private void initCreatedGroupCall() {
        VoIPService sharedInstance;
        int i;
        String str;
        if (this.callInitied || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        this.callInitied = true;
        this.oldParticipants.addAll(this.call.visibleParticipants);
        this.oldVideoParticipants.addAll(this.visibleVideoParticipants);
        this.oldInvited.addAll(this.call.invitedUsers);
        this.currentCallState = sharedInstance.getCallState();
        if (this.call == null) {
            ChatObject.Call call = sharedInstance.groupCall;
            this.call = call;
            this.fullscreenAdapter.setGroupCall(call);
            this.renderersContainer.setGroupCall(this.call);
            this.tabletGridAdapter.setGroupCall(this.call);
        }
        this.actionBar.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
        this.call.saveActiveDates();
        VoIPService.getSharedInstance().registerStateListener(this);
        SimpleTextView simpleTextView = this.scheduleTimeTextView;
        if (simpleTextView == null || simpleTextView.getVisibility() != 0) {
            return;
        }
        this.leaveButton.setData(isRtmpStream() ? R.drawable.msg_voiceclose : R.drawable.calls_decline, -1, Theme.getColor(Theme.key_voipgroup_leaveButton), 0.3f, false, LocaleController.getString("VoipGroupLeave", R.string.VoipGroupLeave), false, true);
        updateSpeakerPhoneIcon(true);
        ActionBarMenuSubItem actionBarMenuSubItem = this.leaveItem;
        if (ChatObject.isChannelOrGiga(this.currentChat)) {
            i = R.string.VoipChannelEndChat;
            str = "VoipChannelEndChat";
        } else {
            i = R.string.VoipGroupEndChat;
            str = "VoipGroupEndChat";
        }
        actionBarMenuSubItem.setText(LocaleController.getString(str, i));
        this.listView.setVisibility(0);
        this.pipItem.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.listView, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.listView, View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f), ObjectAnimator.ofFloat(this.scheduleTimeTextView, View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this.scheduleTimeTextView, View.SCALE_Y, 0.0f), ObjectAnimator.ofFloat(this.scheduleTimeTextView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartInTextView, View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartInTextView, View.SCALE_Y, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartInTextView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartAtTextView, View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartAtTextView, View.SCALE_Y, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartAtTextView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.pipItem, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.pipItem, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.pipItem, View.ALPHA, 0.0f, 1.0f));
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

    public void updateSubtitle() {
        boolean z;
        if (this.actionBar == null || this.call == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i = 0;
        for (int i2 = 0; i2 < this.call.currentSpeakingPeers.size(); i2++) {
            long keyAt = this.call.currentSpeakingPeers.keyAt(i2);
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant = this.call.currentSpeakingPeers.get(keyAt);
            if (!tLRPC$TL_groupCallParticipant.self && !this.renderersContainer.isVisible(tLRPC$TL_groupCallParticipant) && this.visiblePeerIds.get(keyAt, 0) != 1) {
                long peerId = MessageObject.getPeerId(tLRPC$TL_groupCallParticipant.peer);
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                }
                if (i < 2) {
                    TLRPC$User user = peerId > 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)) : null;
                    TLRPC$Chat chat = peerId <= 0 ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(peerId)) : null;
                    if (user != null || chat != null) {
                        if (i != 0) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        if (user != null) {
                            if (Build.VERSION.SDK_INT >= 21) {
                                spannableStringBuilder.append(UserObject.getFirstName(user), new TypefaceSpan(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM)), 0);
                            } else {
                                spannableStringBuilder.append((CharSequence) UserObject.getFirstName(user));
                            }
                        } else if (Build.VERSION.SDK_INT >= 21) {
                            spannableStringBuilder.append(chat.title, new TypefaceSpan(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM)), 0);
                        } else {
                            spannableStringBuilder.append((CharSequence) chat.title);
                        }
                    }
                }
                i++;
                if (i == 2) {
                    break;
                }
            }
        }
        if (i > 0) {
            String pluralString = LocaleController.getPluralString("MembersAreSpeakingToast", i);
            int indexOf = pluralString.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
            spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
            this.actionBar.getAdditionalSubtitleTextView().setText(spannableStringBuilder2);
            z = true;
        } else {
            z = false;
        }
        this.actionBar.getSubtitleTextView().setText(LocaleController.formatPluralString(isRtmpStream() ? "ViewersWatching" : "Participants", this.call.call.participants_count + (this.listAdapter.addSelfToCounter() ? 1 : 0), new Object[0]));
        if (z != this.drawSpeakingSubtitle) {
            this.drawSpeakingSubtitle = z;
            this.actionBar.invalidate();
            this.actionBar.getSubtitleTextView().setPivotX(0.0f);
            this.actionBar.getSubtitleTextView().setPivotY(this.actionBar.getMeasuredHeight() >> 1);
            this.actionBar.getSubtitleTextView().animate().scaleX(this.drawSpeakingSubtitle ? 0.98f : 1.0f).scaleY(this.drawSpeakingSubtitle ? 0.9f : 1.0f).alpha(this.drawSpeakingSubtitle ? 0.0f : 1.0f).setDuration(150L);
            AndroidUtilities.updateViewVisibilityAnimated(this.actionBar.getAdditionalSubtitleTextView(), this.drawSpeakingSubtitle);
        }
    }

    @Override
    public void show() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, Integer.valueOf((int) LiteMode.FLAG_AUTOPLAY_GIFS));
        super.show();
        if (RTMPStreamPipOverlay.isVisible()) {
            RTMPStreamPipOverlay.dismiss();
        }
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
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, Integer.valueOf((int) LiteMode.FLAG_AUTOPLAY_GIFS));
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

    private void setAmplitude(double d) {
        float min = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.animateToAmplitude = min;
        this.animateAmplitudeDiff = (min - this.amplitude) / ((BlobDrawable.AMPLITUDE_SPEED * 500.0f) + 100.0f);
    }

    @Override
    public void onStateChanged(int i) {
        this.currentCallState = i;
        updateState(isShowing(), false);
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

    public float getColorProgress() {
        return this.colorProgress;
    }

    private void updateTitle(boolean z) {
        ChatObject.Call call = this.call;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.currentChat)) {
                this.titleTextView.setText(LocaleController.getString("VoipChannelScheduleVoiceChat", R.string.VoipChannelScheduleVoiceChat), z);
                return;
            } else {
                this.titleTextView.setText(LocaleController.getString("VoipGroupScheduleVoiceChat", R.string.VoipGroupScheduleVoiceChat), z);
                return;
            }
        }
        if (!TextUtils.isEmpty(call.call.title)) {
            if (!this.call.call.title.equals(this.actionBar.getTitle())) {
                if (z) {
                    this.actionBar.setTitleAnimated(this.call.call.title, true, 180L);
                    this.actionBar.getTitleTextView().setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            GroupCallActivity.this.lambda$updateTitle$37(view);
                        }
                    });
                } else {
                    this.actionBar.setTitle(this.call.call.title);
                }
                this.titleTextView.setText(this.call.call.title, z);
            }
        } else if (!this.currentChat.title.equals(this.actionBar.getTitle())) {
            if (z) {
                this.actionBar.setTitleAnimated(this.currentChat.title, true, 180L);
                this.actionBar.getTitleTextView().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        GroupCallActivity.this.lambda$updateTitle$38(view);
                    }
                });
            } else {
                this.actionBar.setTitle(this.currentChat.title);
            }
            if (ChatObject.isChannelOrGiga(this.currentChat)) {
                this.titleTextView.setText(LocaleController.getString("VoipChannelVoiceChat", R.string.VoipChannelVoiceChat), z);
            } else {
                this.titleTextView.setText(LocaleController.getString("VoipGroupVoiceChat", R.string.VoipGroupVoiceChat), z);
            }
        }
        SimpleTextView titleTextView = this.actionBar.getTitleTextView();
        if (this.call.recording) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.setRightDrawable(new SmallRecordCallDrawable(titleTextView));
                TextView textView = this.titleTextView.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new SmallRecordCallDrawable(textView), (Drawable) null);
                TextView nextTextView = this.titleTextView.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new SmallRecordCallDrawable(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.setRightDrawable((Drawable) null);
            this.titleTextView.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.titleTextView.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void lambda$updateTitle$37(View view) {
        ChatObject.Call call = this.call;
        if (call == null || !call.recording) {
            return;
        }
        showRecordHint(this.actionBar.getTitleTextView());
    }

    public void lambda$updateTitle$38(View view) {
        ChatObject.Call call = this.call;
        if (call == null || !call.recording) {
            return;
        }
        showRecordHint(this.actionBar.getTitleTextView());
    }

    public void setColorProgress(float f) {
        this.colorProgress = f;
        GroupCallRenderersContainer groupCallRenderersContainer = this.renderersContainer;
        float max = Math.max(f, groupCallRenderersContainer == null ? 0.0f : groupCallRenderersContainer.progressToFullscreenMode);
        int i = Theme.key_voipgroup_actionBarUnscrolled;
        int color = Theme.getColor(i);
        int i2 = Theme.key_voipgroup_actionBar;
        int offsetColor = AndroidUtilities.getOffsetColor(color, Theme.getColor(i2), f, 1.0f);
        this.backgroundColor = offsetColor;
        this.actionBarBackground.setBackgroundColor(offsetColor);
        this.otherItem.redrawPopup(-14472653);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(this.backgroundColor, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(Theme.getColor(i), Theme.getColor(i2), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_listViewBackgroundUnscrolled), Theme.getColor(Theme.key_voipgroup_listViewBackground), f, 1.0f);
        this.listViewBackgroundPaint.setColor(offsetColor2);
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
        int offsetColor3 = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_leaveButton), Theme.getColor(Theme.key_voipgroup_leaveButtonScrolled), f, 1.0f);
        this.leaveButton.setBackgroundColor(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_lastSeenTextUnscrolled), Theme.getColor(Theme.key_voipgroup_lastSeenText), f, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_mutedIconUnscrolled), Theme.getColor(Theme.key_voipgroup_mutedIcon), f, 1.0f);
        int childCount = this.listView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = this.listView.getChildAt(i4);
            if (childAt instanceof GroupCallTextCell) {
                ((GroupCallTextCell) childAt).setColors(offsetColor5, offsetColor4);
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

    public void getLink(final boolean z) {
        String str;
        TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported;
        TLRPC$Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(this.currentChat.id));
        if (chat != null && !ChatObject.isPublic(chat)) {
            final TLRPC$ChatFull chatFull = this.accountInstance.getMessagesController().getChatFull(this.currentChat.id);
            String publicUsername = ChatObject.getPublicUsername(this.currentChat);
            if (TextUtils.isEmpty(publicUsername)) {
                str = (chatFull == null || (tLRPC$TL_chatInviteExported = chatFull.exported_invite) == null) ? null : tLRPC$TL_chatInviteExported.link;
            } else {
                str = this.accountInstance.getMessagesController().linkPrefix + "/" + publicUsername;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC$TL_messages_exportChatInvite tLRPC$TL_messages_exportChatInvite = new TLRPC$TL_messages_exportChatInvite();
                tLRPC$TL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.currentChat);
                this.accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_messages_exportChatInvite, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        GroupCallActivity.this.lambda$getLink$40(chatFull, z, tLObject, tLRPC$TL_error);
                    }
                });
                return;
            }
            openShareAlert(true, null, str, z);
        } else if (this.call == null) {
        } else {
            final int i = 0;
            while (i < 2) {
                TLRPC$TL_phone_exportGroupCallInvite tLRPC$TL_phone_exportGroupCallInvite = new TLRPC$TL_phone_exportGroupCallInvite();
                tLRPC$TL_phone_exportGroupCallInvite.call = this.call.getInputGroupCall();
                tLRPC$TL_phone_exportGroupCallInvite.can_self_unmute = i == 1;
                this.accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_phone_exportGroupCallInvite, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        GroupCallActivity.this.lambda$getLink$42(i, z, tLObject, tLRPC$TL_error);
                    }
                });
                i++;
            }
        }
    }

    public void lambda$getLink$40(final TLRPC$ChatFull tLRPC$ChatFull, final boolean z, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.this.lambda$getLink$39(tLObject, tLRPC$ChatFull, z);
            }
        });
    }

    public void lambda$getLink$39(TLObject tLObject, TLRPC$ChatFull tLRPC$ChatFull, boolean z) {
        if (tLObject instanceof TLRPC$TL_chatInviteExported) {
            TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported = (TLRPC$TL_chatInviteExported) tLObject;
            if (tLRPC$ChatFull != null) {
                tLRPC$ChatFull.exported_invite = tLRPC$TL_chatInviteExported;
            } else {
                openShareAlert(true, null, tLRPC$TL_chatInviteExported.link, z);
            }
        }
    }

    public void lambda$getLink$42(final int i, final boolean z, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.this.lambda$getLink$41(tLObject, i, z);
            }
        });
    }

    public void lambda$getLink$41(TLObject tLObject, int i, boolean z) {
        if (tLObject instanceof TLRPC$TL_phone_exportedGroupCallInvite) {
            this.invites[i] = ((TLRPC$TL_phone_exportedGroupCallInvite) tLObject).link;
        } else {
            this.invites[i] = "";
        }
        for (int i2 = 0; i2 < 2; i2++) {
            String[] strArr = this.invites;
            if (strArr[i2] == null) {
                return;
            }
            if (strArr[i2].length() == 0) {
                this.invites[i2] = null;
            }
        }
        if (!z && ChatObject.canManageCalls(this.currentChat) && !this.call.call.join_muted) {
            this.invites[0] = null;
        }
        String[] strArr2 = this.invites;
        if (strArr2[0] == null && strArr2[1] == null && ChatObject.isPublic(this.currentChat)) {
            openShareAlert(true, null, this.accountInstance.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(this.currentChat), z);
            return;
        }
        String[] strArr3 = this.invites;
        openShareAlert(false, strArr3[0], strArr3[1], z);
    }

    private void openShareAlert(boolean r16, java.lang.String r17, java.lang.String r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.openShareAlert(boolean, java.lang.String, java.lang.String, boolean):void");
    }

    public void lambda$openShareAlert$43(DialogInterface dialogInterface) {
        this.shareAlert = null;
    }

    public void lambda$openShareAlert$44() {
        ShareAlert shareAlert = this.shareAlert;
        if (shareAlert != null) {
            shareAlert.show();
        }
    }

    public void inviteUserToCall(final long j, final boolean z) {
        final TLRPC$User user;
        if (this.call == null || (user = this.accountInstance.getMessagesController().getUser(Long.valueOf(j))) == null) {
            return;
        }
        final AlertDialog[] alertDialogArr = {new AlertDialog(getContext(), 3)};
        final TLRPC$TL_phone_inviteToGroupCall tLRPC$TL_phone_inviteToGroupCall = new TLRPC$TL_phone_inviteToGroupCall();
        tLRPC$TL_phone_inviteToGroupCall.call = this.call.getInputGroupCall();
        TLRPC$TL_inputUser tLRPC$TL_inputUser = new TLRPC$TL_inputUser();
        tLRPC$TL_inputUser.user_id = user.id;
        tLRPC$TL_inputUser.access_hash = user.access_hash;
        tLRPC$TL_phone_inviteToGroupCall.users.add(tLRPC$TL_inputUser);
        final int sendRequest = this.accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_phone_inviteToGroupCall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                GroupCallActivity.this.lambda$inviteUserToCall$47(j, alertDialogArr, user, z, tLRPC$TL_phone_inviteToGroupCall, tLObject, tLRPC$TL_error);
            }
        });
        if (sendRequest != 0) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GroupCallActivity.this.lambda$inviteUserToCall$49(alertDialogArr, sendRequest);
                }
            }, 500L);
        }
    }

    public void lambda$inviteUserToCall$47(final long j, final AlertDialog[] alertDialogArr, final TLRPC$User tLRPC$User, final boolean z, final TLRPC$TL_phone_inviteToGroupCall tLRPC$TL_phone_inviteToGroupCall, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            this.accountInstance.getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GroupCallActivity.this.lambda$inviteUserToCall$45(j, alertDialogArr, tLRPC$User);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.this.lambda$inviteUserToCall$46(alertDialogArr, z, tLRPC$TL_error, j, tLRPC$TL_phone_inviteToGroupCall);
            }
        });
    }

    public void lambda$inviteUserToCall$45(long j, AlertDialog[] alertDialogArr, TLRPC$User tLRPC$User) {
        ChatObject.Call call = this.call;
        if (call == null || this.delayedGroupCallUpdated) {
            return;
        }
        call.addInvitedUser(j);
        applyCallParticipantUpdates(true);
        GroupVoipInviteAlert groupVoipInviteAlert = this.groupVoipInviteAlert;
        if (groupVoipInviteAlert != null) {
            groupVoipInviteAlert.dismiss();
        }
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
        getUndoView().showWithAction(0L, 34, tLRPC$User, this.currentChat, (Runnable) null, (Runnable) null);
    }

    public void lambda$inviteUserToCall$46(AlertDialog[] alertDialogArr, boolean z, TLRPC$TL_error tLRPC$TL_error, long j, TLRPC$TL_phone_inviteToGroupCall tLRPC$TL_phone_inviteToGroupCall) {
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
        if (z && "USER_NOT_PARTICIPANT".equals(tLRPC$TL_error.text)) {
            processSelectedOption(null, j, 3);
            return;
        }
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, this.parentActivity.getActionBarLayout().getFragmentStack().get(this.parentActivity.getActionBarLayout().getFragmentStack().size() - 1), tLRPC$TL_phone_inviteToGroupCall, new Object[0]);
    }

    public void lambda$inviteUserToCall$49(AlertDialog[] alertDialogArr, final int i) {
        if (alertDialogArr[0] == null) {
            return;
        }
        alertDialogArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                GroupCallActivity.this.lambda$inviteUserToCall$48(i, dialogInterface);
            }
        });
        alertDialogArr[0].show();
    }

    public void lambda$inviteUserToCall$48(int i, DialogInterface dialogInterface) {
        this.accountInstance.getConnectionsManager().cancelRequest(i, true);
    }

    public void invalidateActionBarAlpha() {
        ActionBar actionBar = this.actionBar;
        actionBar.setAlpha((actionBar.getTag() != null ? 1.0f : 0.0f) * (1.0f - this.renderersContainer.progressToFullscreenMode));
    }

    public void updateLayout(boolean z) {
        int childCount = this.listView.getChildCount();
        boolean z2 = false;
        float f = 2.14748365E9f;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if (this.listView.getChildAdapterPosition(childAt) >= 0) {
                f = Math.min(f, childAt.getTop());
            }
        }
        if (f < 0.0f || f == 2.14748365E9f) {
            f = childCount != 0 ? 0.0f : this.listView.getPaddingTop();
        }
        final boolean z3 = f <= ((float) (ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)));
        float currentActionBarHeight = f + ActionBar.getCurrentActionBarHeight() + AndroidUtilities.dp(14.0f);
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
            float[] fArr = new float[2];
            fArr[0] = this.actionBar.getSubtitleTextView().getTranslationY();
            fArr[1] = z3 ? 0.0f : AndroidUtilities.dp(20.0f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, fArr);
            this.subtitleYAnimator = ofFloat;
            ofFloat.setDuration(300L);
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
            SimpleTextView additionalSubtitleTextView = this.actionBar.getAdditionalSubtitleTextView();
            Property property2 = View.TRANSLATION_Y;
            float[] fArr2 = new float[1];
            fArr2[0] = z3 ? 0.0f : AndroidUtilities.dp(20.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property2, fArr2);
            this.additionalSubtitleYAnimator = ofFloat2;
            ofFloat2.setDuration(300L);
            this.additionalSubtitleYAnimator.setInterpolator(cubicBezierInterpolator);
            this.additionalSubtitleYAnimator.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.actionBarAnimation = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = this.actionBarAnimation;
            Animator[] animatorArr = new Animator[3];
            ActionBar actionBar = this.actionBar;
            Property property3 = View.ALPHA;
            float[] fArr3 = new float[1];
            fArr3[0] = z3 ? 1.0f : 0.0f;
            animatorArr[0] = ObjectAnimator.ofFloat(actionBar, property3, fArr3);
            View view = this.actionBarBackground;
            Property property4 = View.ALPHA;
            float[] fArr4 = new float[1];
            fArr4[0] = z3 ? 1.0f : 0.0f;
            animatorArr[1] = ObjectAnimator.ofFloat(view, property4, fArr4);
            View view2 = this.actionBarShadow;
            Property property5 = View.ALPHA;
            float[] fArr5 = new float[1];
            fArr5[0] = z3 ? 1.0f : 0.0f;
            animatorArr[2] = ObjectAnimator.ofFloat(view2, property5, fArr5);
            animatorSet3.playTogether(animatorArr);
            this.actionBarAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    GroupCallActivity.this.actionBarAnimation = null;
                }
            });
            this.actionBarAnimation.start();
            this.renderersContainer.pipView.setClickable((!z3 || isLandscapeMode) ? true : true);
        }
        if (this.scrollOffsetY != currentActionBarHeight) {
            setScrollOffsetY(currentActionBarHeight);
        }
    }

    public void invalidateScrollOffsetY() {
        setScrollOffsetY(this.scrollOffsetY);
    }

    private void setScrollOffsetY(float f) {
        int dp;
        int i;
        this.scrollOffsetY = f;
        this.listView.setTopGlowOffset((int) (f - ((FrameLayout.LayoutParams) this.listView.getLayoutParams()).topMargin));
        float dp2 = f - AndroidUtilities.dp(74.0f);
        if (this.backgroundPaddingTop + dp2 < ActionBar.getCurrentActionBarHeight() * 2) {
            float min = Math.min(1.0f, (((ActionBar.getCurrentActionBarHeight() * 2) - dp2) - this.backgroundPaddingTop) / (((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)) + ActionBar.getCurrentActionBarHeight()));
            i = (int) (AndroidUtilities.dp(AndroidUtilities.isTablet() ? 17.0f : 13.0f) * min);
            if (Math.abs(Math.min(1.0f, min) - this.colorProgress) > 1.0E-4f) {
                setColorProgress(Math.min(1.0f, min));
            }
            float f2 = 1.0f - ((0.1f * min) * 1.2f);
            this.titleTextView.setScaleX(Math.max(0.9f, f2));
            this.titleTextView.setScaleY(Math.max(0.9f, f2));
            this.titleTextView.setAlpha(Math.max(0.0f, 1.0f - (min * 1.2f)) * (1.0f - this.renderersContainer.progressToFullscreenMode));
        } else {
            i = 0;
            this.titleTextView.setScaleX(1.0f);
            this.titleTextView.setScaleY(1.0f);
            this.titleTextView.setAlpha(1.0f - this.renderersContainer.progressToFullscreenMode);
            if (this.colorProgress > 1.0E-4f) {
                setColorProgress(0.0f);
            }
        }
        float f3 = i;
        this.menuItemsContainer.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f - AndroidUtilities.dp(53.0f)) - f3));
        this.titleTextView.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f - AndroidUtilities.dp(44.0f)) - f3));
        LinearLayout linearLayout = this.scheduleTimerContainer;
        if (linearLayout != null) {
            linearLayout.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f - AndroidUtilities.dp(44.0f)) - f3));
        }
        this.containerView.invalidate();
    }

    private void cancelMutePress() {
        if (this.scheduled) {
            this.scheduled = false;
            AndroidUtilities.cancelRunOnUIThread(this.pressRunnable);
        }
        if (this.pressed) {
            this.pressed = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.muteButton.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public void updateState(boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.updateState(boolean, boolean):void");
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

    private void updateSpeakerPhoneIcon(boolean z) {
        VoIPToggleButton voIPToggleButton = this.soundButton;
        if (voIPToggleButton == null || voIPToggleButton.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z2 = false;
        if (sharedInstance == null || isRtmpStream()) {
            this.soundButton.setData(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString("VoipChatShare", R.string.VoipChatShare), false, z);
            this.soundButton.setEnabled(ChatObject.isPublic(this.currentChat) || (ChatObject.hasAdminRights(this.currentChat) && ChatObject.canAddUsers(this.currentChat)), false);
            this.soundButton.setChecked(true, false);
            return;
        }
        this.soundButton.setEnabled(true, z);
        boolean z3 = sharedInstance.isBluetoothOn() || sharedInstance.isBluetoothWillOn();
        if (!z3 && sharedInstance.isSpeakerphoneOn()) {
            z2 = true;
        }
        if (z3) {
            this.soundButton.setData(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString("VoipAudioRoutingBluetooth", R.string.VoipAudioRoutingBluetooth), false, z);
        } else if (z2) {
            this.soundButton.setData(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString("VoipSpeaker", R.string.VoipSpeaker), false, z);
        } else if (sharedInstance.isHeadsetPlugged()) {
            this.soundButton.setData(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString("VoipAudioRoutingHeadset", R.string.VoipAudioRoutingHeadset), false, z);
        } else {
            this.soundButton.setData(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString("VoipSpeaker", R.string.VoipSpeaker), false, z);
        }
        this.soundButton.setChecked(z2, z);
    }

    public void updateMuteButton(int r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.updateMuteButton(int, boolean):void");
    }

    public void lambda$updateMuteButton$50(float f, View view, ValueAnimator valueAnimator) {
        if (!isLandscapeMode) {
            f = AndroidUtilities.lerp(1.0f, f, this.renderersContainer.progressToFullscreenMode);
        }
        view.setScaleX(f);
        view.setScaleY(f);
    }

    public void lambda$updateMuteButton$51(float f, View view, View view2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (!isLandscapeMode) {
            f = AndroidUtilities.lerp(1.0f, f, this.renderersContainer.progressToFullscreenMode);
        }
        float f2 = 1.0f - floatValue;
        view.setAlpha(f2);
        float f3 = ((f2 * 0.9f) + 0.1f) * f;
        view.setScaleX(f3);
        view.setScaleY(f3);
        view2.setAlpha(floatValue);
        float f4 = ((floatValue * 0.9f) + 0.1f) * f;
        view2.setScaleX(f4);
        view2.setScaleY(f4);
    }

    public void lambda$updateMuteButton$52(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.muteLabel[0].setAlpha(1.0f - floatValue);
        this.muteLabel[0].setTranslationY(AndroidUtilities.dp(5.0f) * floatValue);
        this.muteLabel[1].setAlpha(floatValue);
        this.muteLabel[1].setTranslationY(AndroidUtilities.dp((floatValue * 5.0f) - 5.0f));
    }

    public void fillColors(int i, int[] iArr) {
        if (i == 0) {
            iArr[0] = Theme.getColor(Theme.key_voipgroup_unmuteButton2);
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_soundButtonActive), Theme.getColor(Theme.key_voipgroup_soundButtonActiveScrolled), this.colorProgress, 1.0f);
            iArr[2] = Theme.getColor(Theme.key_voipgroup_soundButton);
        } else if (i == 1) {
            iArr[0] = Theme.getColor(Theme.key_voipgroup_muteButton2);
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_soundButtonActive2), Theme.getColor(Theme.key_voipgroup_soundButtonActive2Scrolled), this.colorProgress, 1.0f);
            iArr[2] = Theme.getColor(Theme.key_voipgroup_soundButton2);
        } else if (isGradientState(i)) {
            iArr[0] = Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient3);
            iArr[1] = Theme.getColor(Theme.key_voipgroup_mutedByAdminMuteButton);
            iArr[2] = Theme.getColor(Theme.key_voipgroup_mutedByAdminMuteButtonDisabled);
        } else {
            int i2 = Theme.key_voipgroup_disabledButton;
            iArr[0] = Theme.getColor(i2);
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_disabledButtonActive), Theme.getColor(Theme.key_voipgroup_disabledButtonActiveScrolled), this.colorProgress, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_listViewBackgroundUnscrolled), Theme.getColor(i2), this.colorProgress, 1.0f);
        }
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
                this.recordHintView.setText(LocaleController.getString("VoipChannelRecording", R.string.VoipChannelRecording));
            } else {
                this.recordHintView.setText(LocaleController.getString("VoipGroupRecording", R.string.VoipGroupRecording));
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
            this.reminderHintView.setText(LocaleController.getString("VoipChatReminderHint", R.string.VoipChatReminderHint));
            this.reminderHintView.setBackgroundColor(-366530760, -1);
        }
        this.reminderHintView.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.reminderHintView.showForView(this.muteButton, true);
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
                this.states[this.muteButtonState].shader = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient), Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient3), Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient2)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                int i3 = this.muteButtonState;
                if (i3 == 1) {
                    this.states[i3].shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{Theme.getColor(Theme.key_voipgroup_muteButton), Theme.getColor(Theme.key_voipgroup_muteButton3)}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    this.states[i3].shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{Theme.getColor(Theme.key_voipgroup_unmuteButton2), Theme.getColor(Theme.key_voipgroup_unmuteButton)}, (float[]) null, Shader.TileMode.CLAMP);
                }
            }
        }
        WeavingState[] weavingStateArr2 = this.states;
        int i4 = this.muteButtonState;
        WeavingState weavingState = weavingStateArr2[i4];
        WeavingState weavingState2 = this.currentState;
        if (weavingState != weavingState2) {
            this.prevState = weavingState2;
            this.currentState = weavingStateArr2[i4];
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
                int i5 = weavingState3.currentState;
                boolean z4 = i5 == 1 || i5 == 0;
                z2 = i5 != 3;
                z3 = z4;
            } else {
                z2 = false;
            }
            this.showWavesProgress = z3 ? 1.0f : 0.0f;
            this.showLightingProgress = z2 ? 1.0f : 0.0f;
        }
        this.buttonsContainer.invalidate();
    }

    private static void processOnLeave(ChatObject.Call call, boolean z, long j, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z ? 1 : 0);
        }
        if (call != null) {
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant = call.participants.get(j);
            if (tLRPC$TL_groupCallParticipant != null) {
                call.participants.delete(j);
                call.sortedParticipants.remove(tLRPC$TL_groupCallParticipant);
                call.visibleParticipants.remove(tLRPC$TL_groupCallParticipant);
                int i = 0;
                while (i < call.visibleVideoParticipants.size()) {
                    if (MessageObject.getPeerId(call.visibleVideoParticipants.get(i).participant.peer) == MessageObject.getPeerId(tLRPC$TL_groupCallParticipant.peer)) {
                        call.visibleVideoParticipants.remove(i);
                        i--;
                    }
                    i++;
                }
                TLRPC$GroupCall tLRPC$GroupCall = call.call;
                tLRPC$GroupCall.participants_count--;
            }
            for (int i2 = 0; i2 < call.sortedParticipants.size(); i2++) {
                TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant2 = call.sortedParticipants.get(i2);
                tLRPC$TL_groupCallParticipant2.lastActiveDate = tLRPC$TL_groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }

    public static void onLeaveClick(Context context, final Runnable runnable, boolean z) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        TLRPC$Chat chat = sharedInstance.getChat();
        final ChatObject.Call call = sharedInstance.groupCall;
        final long selfId = sharedInstance.getSelfId();
        if (!ChatObject.canManageCalls(chat)) {
            processOnLeave(call, false, selfId, runnable);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (ChatObject.isChannelOrGiga(chat)) {
            builder.setTitle(LocaleController.getString("VoipChannelLeaveAlertTitle", R.string.VoipChannelLeaveAlertTitle));
            builder.setMessage(LocaleController.getString("VoipChannelLeaveAlertText", R.string.VoipChannelLeaveAlertText));
        } else {
            builder.setTitle(LocaleController.getString("VoipGroupLeaveAlertTitle", R.string.VoipGroupLeaveAlertTitle));
            builder.setMessage(LocaleController.getString("VoipGroupLeaveAlertText", R.string.VoipGroupLeaveAlertText));
        }
        sharedInstance.getAccount();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        final CheckBoxCell[] checkBoxCellArr = {new CheckBoxCell(context, 1)};
        checkBoxCellArr[0].setBackgroundDrawable(Theme.getSelectorDrawable(false));
        if (z) {
            checkBoxCellArr[0].setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
        } else {
            checkBoxCellArr[0].setTextColor(Theme.getColor(Theme.key_voipgroup_actionBarItems));
            ((CheckBoxSquare) checkBoxCellArr[0].getCheckBoxView()).setColors(Theme.key_voipgroup_mutedIcon, Theme.key_voipgroup_listeningText, Theme.key_voipgroup_nameText);
        }
        checkBoxCellArr[0].setTag(0);
        if (ChatObject.isChannelOrGiga(chat)) {
            checkBoxCellArr[0].setText(LocaleController.getString("VoipChannelLeaveAlertEndChat", R.string.VoipChannelLeaveAlertEndChat), "", false, false);
        } else {
            checkBoxCellArr[0].setText(LocaleController.getString("VoipGroupLeaveAlertEndChat", R.string.VoipGroupLeaveAlertEndChat), "", false, false);
        }
        checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
        linearLayout.addView(checkBoxCellArr[0], LayoutHelper.createLinear(-1, -2));
        checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallActivity.lambda$onLeaveClick$53(checkBoxCellArr, view);
            }
        });
        builder.setView(linearLayout);
        builder.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
        builder.setPositiveButton(LocaleController.getString("VoipGroupLeave", R.string.VoipGroupLeave), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                GroupCallActivity.lambda$onLeaveClick$54(ChatObject.Call.this, checkBoxCellArr, selfId, runnable, dialogInterface, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        if (z) {
            builder.setDimEnabled(false);
        }
        AlertDialog create = builder.create();
        if (z) {
            if (Build.VERSION.SDK_INT >= 26) {
                create.getWindow().setType(2038);
            } else {
                create.getWindow().setType(2003);
            }
            create.getWindow().clearFlags(2);
        }
        if (!z) {
            create.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_dialogBackground));
        }
        create.show();
        if (z) {
            return;
        }
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_voipgroup_leaveCallMenu));
        }
        create.setTextColor(Theme.getColor(Theme.key_voipgroup_actionBarItems));
    }

    public static void lambda$onLeaveClick$53(CheckBoxCell[] checkBoxCellArr, View view) {
        Integer num = (Integer) view.getTag();
        checkBoxCellArr[num.intValue()].setChecked(!checkBoxCellArr[num.intValue()].isChecked(), true);
    }

    public static void lambda$onLeaveClick$54(ChatObject.Call call, CheckBoxCell[] checkBoxCellArr, long j, Runnable runnable, DialogInterface dialogInterface, int i) {
        processOnLeave(call, checkBoxCellArr[0].isChecked(), j, runnable);
    }

    public void processSelectedOption(TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant, final long j, int i) {
        TLObject chat;
        String str;
        TextView textView;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (j > 0) {
            chat = this.accountInstance.getMessagesController().getUser(Long.valueOf(j));
        } else {
            chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-j));
        }
        final TLObject tLObject = chat;
        boolean z = true;
        if (i == 0 || i == 2 || i == 3) {
            if (i == 0) {
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                VoIPService.getSharedInstance().editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
                getUndoView().showWithAction(0L, 30, tLObject, (Object) null, (Runnable) null, (Runnable) null);
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            builder.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
            TextView textView2 = new TextView(getContext());
            int i2 = Theme.key_voipgroup_actionBarItems;
            textView2.setTextColor(Theme.getColor(i2));
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(getContext());
            builder.setView(frameLayout);
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setTextSize(AndroidUtilities.dp(12.0f));
            BackupImageView backupImageView = new BackupImageView(getContext());
            backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(backupImageView, LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            avatarDrawable.setInfo(this.currentAccount, tLObject);
            boolean z2 = tLObject instanceof TLRPC$User;
            if (z2) {
                TLRPC$User tLRPC$User = (TLRPC$User) tLObject;
                backupImageView.setForUserOrChat(tLRPC$User, avatarDrawable);
                str = UserObject.getFirstName(tLRPC$User);
            } else {
                TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) tLObject;
                backupImageView.setForUserOrChat(tLRPC$Chat, avatarDrawable);
                str = tLRPC$Chat.title;
            }
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(Theme.getColor(i2));
            textView3.setTextSize(1, 20.0f);
            textView3.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            textView3.setLines(1);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            if (i == 2) {
                textView3.setText(LocaleController.getString("VoipGroupRemoveMemberAlertTitle2", R.string.VoipGroupRemoveMemberAlertTitle2));
                if (ChatObject.isChannelOrGiga(this.currentChat)) {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelRemoveMemberAlertText2", R.string.VoipChannelRemoveMemberAlertText2, str, this.currentChat.title)));
                } else {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupRemoveMemberAlertText2", R.string.VoipGroupRemoveMemberAlertText2, str, this.currentChat.title)));
                }
            } else {
                textView3.setText(LocaleController.getString("VoipGroupAddMemberTitle", R.string.VoipGroupAddMemberTitle));
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupAddMemberText", R.string.VoipGroupAddMemberText, str, this.currentChat.title)));
            }
            boolean z3 = LocaleController.isRTL;
            frameLayout.addView(textView3, LayoutHelper.createFrame(-1, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 21 : 76, 11.0f, z3 ? 76 : 21, 0.0f));
            frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (i == 2) {
                builder.setPositiveButton(LocaleController.getString("VoipGroupUserRemove", R.string.VoipGroupUserRemove), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        GroupCallActivity.this.lambda$processSelectedOption$55(tLObject, dialogInterface, i3);
                    }
                });
            } else if (z2) {
                final TLRPC$User tLRPC$User2 = (TLRPC$User) tLObject;
                builder.setPositiveButton(LocaleController.getString("VoipGroupAdd", R.string.VoipGroupAdd), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        GroupCallActivity.this.lambda$processSelectedOption$57(tLRPC$User2, j, dialogInterface, i3);
                    }
                });
            }
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            AlertDialog create = builder.create();
            create.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_dialogBackground));
            create.show();
            if (i != 2 || (textView = (TextView) create.getButton(-1)) == null) {
                return;
            }
            textView.setTextColor(Theme.getColor(Theme.key_voipgroup_leaveCallMenu));
        } else if (i == 6) {
            this.parentActivity.switchToAccount(this.currentAccount, true);
            Bundle bundle = new Bundle();
            if (j > 0) {
                bundle.putLong("user_id", j);
            } else {
                bundle.putLong("chat_id", -j);
            }
            this.parentActivity.lambda$runLinkRequest$87(new ChatActivity(bundle));
            dismiss();
        } else if (i == 8) {
            this.parentActivity.switchToAccount(this.currentAccount, true);
            BaseFragment baseFragment = this.parentActivity.getActionBarLayout().getFragmentStack().get(this.parentActivity.getActionBarLayout().getFragmentStack().size() - 1);
            if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).getDialogId() == j) {
                dismiss();
                return;
            }
            Bundle bundle2 = new Bundle();
            if (j > 0) {
                bundle2.putLong("user_id", j);
            } else {
                bundle2.putLong("chat_id", -j);
            }
            this.parentActivity.lambda$runLinkRequest$87(new ChatActivity(bundle2));
            dismiss();
        } else if (i == 7) {
            sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, Boolean.FALSE, null);
            updateMuteButton(2, true);
        } else if (i == 9) {
            ImageUpdater imageUpdater = this.currentAvatarUpdater;
            if (imageUpdater == null || !imageUpdater.isUploadingImage()) {
                TLRPC$User currentUser = this.accountInstance.getUserConfig().getCurrentUser();
                ImageUpdater imageUpdater2 = new ImageUpdater(true, 0, true);
                this.currentAvatarUpdater = imageUpdater2;
                imageUpdater2.setOpenWithFrontfaceCamera(true);
                this.currentAvatarUpdater.setForceDarkTheme(true);
                this.currentAvatarUpdater.setSearchAvailable(true, true);
                this.currentAvatarUpdater.setShowingFromDialog(true);
                this.currentAvatarUpdater.parentFragment = this.parentActivity.getActionBarLayout().getLastFragment();
                ImageUpdater imageUpdater3 = this.currentAvatarUpdater;
                AvatarUpdaterDelegate avatarUpdaterDelegate = new AvatarUpdaterDelegate(j);
                this.avatarUpdaterDelegate = avatarUpdaterDelegate;
                imageUpdater3.setDelegate(avatarUpdaterDelegate);
                ImageUpdater imageUpdater4 = this.currentAvatarUpdater;
                TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = currentUser.photo;
                imageUpdater4.openMenu((tLRPC$UserProfilePhoto == null || tLRPC$UserProfilePhoto.photo_big == null || (tLRPC$UserProfilePhoto instanceof TLRPC$TL_userProfilePhotoEmpty)) ? false : false, new Runnable() {
                    @Override
                    public final void run() {
                        GroupCallActivity.this.lambda$processSelectedOption$58();
                    }
                }, new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        GroupCallActivity.lambda$processSelectedOption$59(dialogInterface);
                    }
                }, 0);
            }
        } else if (i == 10) {
            AlertsCreator.createChangeBioAlert(tLRPC$TL_groupCallParticipant.about, j, getContext(), this.currentAccount);
        } else if (i == 11) {
            AlertsCreator.createChangeNameAlert(j, getContext(), this.currentAccount);
        } else if (i == 5) {
            sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
            getUndoView().showWithAction(0L, 35, tLObject);
            sharedInstance.setParticipantVolume(tLRPC$TL_groupCallParticipant, 0);
        } else {
            if ((tLRPC$TL_groupCallParticipant.flags & 128) != 0 && tLRPC$TL_groupCallParticipant.volume == 0) {
                tLRPC$TL_groupCallParticipant.volume = 10000;
                tLRPC$TL_groupCallParticipant.volume_by_admin = false;
                sharedInstance.editCallMember(tLObject, Boolean.FALSE, null, 10000, null, null);
            } else {
                sharedInstance.editCallMember(tLObject, Boolean.FALSE, null, null, null, null);
            }
            sharedInstance.setParticipantVolume(tLRPC$TL_groupCallParticipant, ChatObject.getParticipantVolume(tLRPC$TL_groupCallParticipant));
            getUndoView().showWithAction(0L, i == 1 ? 31 : 36, tLObject, (Object) null, (Runnable) null, (Runnable) null);
        }
    }

    public void lambda$processSelectedOption$55(TLObject tLObject, DialogInterface dialogInterface, int i) {
        if (tLObject instanceof TLRPC$User) {
            TLRPC$User tLRPC$User = (TLRPC$User) tLObject;
            this.accountInstance.getMessagesController().deleteParticipantFromChat(this.currentChat.id, tLRPC$User);
            getUndoView().showWithAction(0L, 32, tLRPC$User, (Object) null, (Runnable) null, (Runnable) null);
            return;
        }
        TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) tLObject;
        this.accountInstance.getMessagesController().deleteParticipantFromChat(this.currentChat.id, null, tLRPC$Chat, false, false);
        getUndoView().showWithAction(0L, 32, tLRPC$Chat, (Object) null, (Runnable) null, (Runnable) null);
    }

    public void lambda$processSelectedOption$57(TLRPC$User tLRPC$User, final long j, DialogInterface dialogInterface, int i) {
        this.accountInstance.getMessagesController().addUserToChat(this.currentChat.id, tLRPC$User, 0, null, this.parentActivity.getActionBarLayout().getFragmentStack().get(this.parentActivity.getActionBarLayout().getFragmentStack().size() - 1), new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.this.lambda$processSelectedOption$56(j);
            }
        });
    }

    public void lambda$processSelectedOption$56(long j) {
        inviteUserToCall(j, false);
    }

    public void lambda$processSelectedOption$58() {
        this.accountInstance.getMessagesController().deleteUserPhoto(null);
    }

    public boolean showMenuForCell(android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.showMenuForCell(android.view.View):boolean");
    }

    public void lambda$showMenuForCell$60(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.scrimPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.scrimPopupWindow.dismiss();
        }
    }

    public void lambda$showMenuForCell$61(int i, ArrayList arrayList, TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant, View view) {
        if (i >= arrayList.size()) {
            return;
        }
        TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant2 = this.call.participants.get(MessageObject.getPeerId(tLRPC$TL_groupCallParticipant.peer));
        if (tLRPC$TL_groupCallParticipant2 != null) {
            tLRPC$TL_groupCallParticipant = tLRPC$TL_groupCallParticipant2;
        }
        processSelectedOption(tLRPC$TL_groupCallParticipant, MessageObject.getPeerId(tLRPC$TL_groupCallParticipant.peer), ((Integer) arrayList.get(i)).intValue());
        ActionBarPopupWindow actionBarPopupWindow = this.scrimPopupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
        } else if (((Integer) arrayList.get(i)).intValue() == 9 || ((Integer) arrayList.get(i)).intValue() == 10 || ((Integer) arrayList.get(i)).intValue() == 11) {
        } else {
            dismissAvatarPreview(true);
        }
    }

    public void clearScrimView() {
        GroupCallMiniTextureView groupCallMiniTextureView = this.scrimRenderer;
        if (groupCallMiniTextureView != null) {
            groupCallMiniTextureView.textureView.setRoundCorners(AndroidUtilities.dp(8.0f));
            this.scrimRenderer.setShowingAsScrimView(false, false);
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

    private void startScreenCapture() {
        LaunchActivity launchActivity = this.parentActivity;
        if (launchActivity == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        this.parentActivity.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
    }

    private void runAvatarPreviewTransition(final boolean r18, org.telegram.ui.Cells.GroupCallUserCell r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.runAvatarPreviewTransition(boolean, org.telegram.ui.Cells.GroupCallUserCell):void");
    }

    public void lambda$runAvatarPreviewTransition$62(float f, float f2, float f3, int i, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.progressToAvatarPreview = floatValue;
        this.renderersContainer.progressToScrimView = floatValue;
        float f4 = (f * (1.0f - floatValue)) + (floatValue * 1.0f);
        this.avatarPreviewContainer.setScaleX(f4);
        this.avatarPreviewContainer.setScaleY(f4);
        this.avatarPreviewContainer.setTranslationX(f2 * (1.0f - this.progressToAvatarPreview));
        this.avatarPreviewContainer.setTranslationY(f3 * (1.0f - this.progressToAvatarPreview));
        if (!this.useBlur) {
            this.scrimPaint.setAlpha((int) (this.progressToAvatarPreview * 100.0f));
        }
        GroupCallMiniTextureView groupCallMiniTextureView = this.scrimRenderer;
        if (groupCallMiniTextureView != null) {
            groupCallMiniTextureView.textureView.setRoundCorners(AndroidUtilities.dp(8.0f) * (1.0f - this.progressToAvatarPreview));
        }
        this.avatarPreviewContainer.invalidate();
        this.containerView.invalidate();
        ProfileGalleryView profileGalleryView = this.avatarsViewPager;
        float f5 = i;
        float f6 = this.progressToAvatarPreview;
        profileGalleryView.setRoundRadius((int) ((1.0f - f6) * f5), (int) (f5 * (1.0f - f6)));
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

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private int addMemberRow;
        private boolean hasSelfUser;
        private int invitedEndRow;
        private int invitedStartRow;
        private int lastRow;
        private Context mContext;
        private int rowsCount;
        private int usersEndRow;
        private int usersStartRow;
        private int usersVideoGridEndRow;
        private int usersVideoGridStartRow;
        private int videoGridDividerRow;
        private int videoNotAvailableRow;

        public ListAdapter(Context context) {
            this.mContext = context;
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

        public void updateRows() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.ListAdapter.updateRows():void");
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
        public void notifyItemRangeRemoved(int i, int i2) {
            updateRows();
            super.notifyItemRangeRemoved(i, i2);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 1) {
                GroupCallUserCell groupCallUserCell = (GroupCallUserCell) viewHolder.itemView;
                int i = GroupCallActivity.this.actionBar.getTag() != null ? Theme.key_voipgroup_mutedIcon : Theme.key_voipgroup_mutedIconUnscrolled;
                groupCallUserCell.setGrayIconColor(i, Theme.getColor(i));
                groupCallUserCell.setDrawDivider(viewHolder.getAdapterPosition() != getItemCount() - 2);
            } else if (itemViewType == 2) {
                GroupCallInvitedCell groupCallInvitedCell = (GroupCallInvitedCell) viewHolder.itemView;
                int i2 = GroupCallActivity.this.actionBar.getTag() != null ? Theme.key_voipgroup_mutedIcon : Theme.key_voipgroup_mutedIconUnscrolled;
                groupCallInvitedCell.setGrayIconColor(i2, Theme.getColor(i2));
                groupCallInvitedCell.setDrawDivider(viewHolder.getAdapterPosition() != getItemCount() - 2);
            }
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant;
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant2;
            AvatarUpdaterDelegate avatarUpdaterDelegate;
            ChatObject.VideoParticipant videoParticipant;
            AvatarUpdaterDelegate avatarUpdaterDelegate2;
            int itemViewType = viewHolder.getItemViewType();
            boolean z = false;
            if (itemViewType == 0) {
                GroupCallTextCell groupCallTextCell = (GroupCallTextCell) viewHolder.itemView;
                int offsetColor = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_lastSeenTextUnscrolled), Theme.getColor(Theme.key_voipgroup_lastSeenText), GroupCallActivity.this.actionBar.getTag() != null ? 1.0f : 0.0f, 1.0f);
                groupCallTextCell.setColors(offsetColor, offsetColor);
                if (ChatObject.isChannel(GroupCallActivity.this.currentChat)) {
                    TLRPC$Chat tLRPC$Chat = GroupCallActivity.this.currentChat;
                    if (!tLRPC$Chat.megagroup && ChatObject.isPublic(tLRPC$Chat)) {
                        groupCallTextCell.setTextAndIcon(LocaleController.getString("VoipGroupShareLink", R.string.VoipGroupShareLink), R.drawable.msg_link, false);
                        return;
                    }
                }
                groupCallTextCell.setTextAndIcon(LocaleController.getString("VoipGroupInviteMember", R.string.VoipGroupInviteMember), R.drawable.msg_contact_add, false);
                return;
            }
            TLRPC$FileLocation tLRPC$FileLocation = null;
            r7 = null;
            TLRPC$FileLocation tLRPC$FileLocation2 = null;
            r7 = null;
            r7 = null;
            r7 = null;
            Long l = null;
            tLRPC$FileLocation = null;
            if (itemViewType == 1) {
                GroupCallUserCell groupCallUserCell = (GroupCallUserCell) viewHolder.itemView;
                int i2 = i - this.usersStartRow;
                if (GroupCallActivity.this.delayedGroupCallUpdated) {
                    if (i2 >= 0 && i2 < GroupCallActivity.this.oldParticipants.size()) {
                        tLRPC$TL_groupCallParticipant = (TLRPC$TL_groupCallParticipant) GroupCallActivity.this.oldParticipants.get(i2);
                        tLRPC$TL_groupCallParticipant2 = tLRPC$TL_groupCallParticipant;
                    }
                    tLRPC$TL_groupCallParticipant2 = null;
                } else {
                    if (i2 >= 0 && i2 < GroupCallActivity.this.call.visibleParticipants.size()) {
                        tLRPC$TL_groupCallParticipant = GroupCallActivity.this.call.visibleParticipants.get(i2);
                        tLRPC$TL_groupCallParticipant2 = tLRPC$TL_groupCallParticipant;
                    }
                    tLRPC$TL_groupCallParticipant2 = null;
                }
                if (tLRPC$TL_groupCallParticipant2 != null) {
                    long peerId = MessageObject.getPeerId(tLRPC$TL_groupCallParticipant2.peer);
                    long peerId2 = MessageObject.getPeerId(GroupCallActivity.this.selfPeer);
                    if (peerId == peerId2 && (avatarUpdaterDelegate = GroupCallActivity.this.avatarUpdaterDelegate) != null) {
                        tLRPC$FileLocation = avatarUpdaterDelegate.avatar;
                    }
                    TLRPC$FileLocation tLRPC$FileLocation3 = tLRPC$FileLocation;
                    float f = tLRPC$FileLocation3 != null ? GroupCallActivity.this.avatarUpdaterDelegate.uploadingProgress : 1.0f;
                    if (groupCallUserCell.getParticipant() != null && MessageObject.getPeerId(groupCallUserCell.getParticipant().peer) == peerId) {
                        z = true;
                    }
                    groupCallUserCell.setData(GroupCallActivity.this.accountInstance, tLRPC$TL_groupCallParticipant2, GroupCallActivity.this.call, peerId2, tLRPC$FileLocation3, z);
                    groupCallUserCell.setUploadProgress(f, z);
                }
            } else if (itemViewType == 2) {
                GroupCallInvitedCell groupCallInvitedCell = (GroupCallInvitedCell) viewHolder.itemView;
                int i3 = i - this.invitedStartRow;
                if (GroupCallActivity.this.delayedGroupCallUpdated) {
                    if (i3 >= 0 && i3 < GroupCallActivity.this.oldInvited.size()) {
                        l = (Long) GroupCallActivity.this.oldInvited.get(i3);
                    }
                } else if (i3 >= 0 && i3 < GroupCallActivity.this.call.invitedUsers.size()) {
                    l = GroupCallActivity.this.call.invitedUsers.get(i3);
                }
                if (l != null) {
                    groupCallInvitedCell.setData(((BottomSheet) GroupCallActivity.this).currentAccount, l);
                }
            } else if (itemViewType != 4) {
            } else {
                GroupCallGridCell groupCallGridCell = (GroupCallGridCell) viewHolder.itemView;
                ChatObject.VideoParticipant participant = groupCallGridCell.getParticipant();
                int i4 = i - this.usersVideoGridStartRow;
                groupCallGridCell.spanCount = GroupCallActivity.this.spanSizeLookup.getSpanSize(i);
                if (GroupCallActivity.this.delayedGroupCallUpdated) {
                    if (i4 >= 0 && i4 < GroupCallActivity.this.oldVideoParticipants.size()) {
                        videoParticipant = (ChatObject.VideoParticipant) GroupCallActivity.this.oldVideoParticipants.get(i4);
                    }
                    videoParticipant = null;
                } else {
                    if (i4 >= 0 && i4 < GroupCallActivity.this.visibleVideoParticipants.size()) {
                        videoParticipant = GroupCallActivity.this.visibleVideoParticipants.get(i4);
                    }
                    videoParticipant = null;
                }
                if (videoParticipant != null) {
                    long peerId3 = MessageObject.getPeerId(videoParticipant.participant.peer);
                    long peerId4 = MessageObject.getPeerId(GroupCallActivity.this.selfPeer);
                    if (peerId3 == peerId4 && (avatarUpdaterDelegate2 = GroupCallActivity.this.avatarUpdaterDelegate) != null) {
                        tLRPC$FileLocation2 = avatarUpdaterDelegate2.avatar;
                    }
                    if (tLRPC$FileLocation2 != null) {
                        float f2 = GroupCallActivity.this.avatarUpdaterDelegate.uploadingProgress;
                    }
                    if (groupCallGridCell.getParticipant() != null) {
                        groupCallGridCell.getParticipant().equals(videoParticipant);
                    }
                    groupCallGridCell.setData(GroupCallActivity.this.accountInstance, videoParticipant, GroupCallActivity.this.call, peerId4);
                }
                if (participant == null || participant.equals(videoParticipant) || !groupCallGridCell.attached || groupCallGridCell.getRenderer() == null) {
                    return;
                }
                GroupCallActivity.this.attachRenderer(groupCallGridCell, false);
                GroupCallActivity.this.attachRenderer(groupCallGridCell, true);
            }
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return (itemViewType == 3 || itemViewType == 4 || itemViewType == 5 || itemViewType == 6) ? false : true;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                view = new GroupCallTextCell(this, this.mContext) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        if (AndroidUtilities.isTablet()) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i2)), 1073741824), i3);
                        } else {
                            super.onMeasure(i2, i3);
                        }
                    }
                };
            } else if (i == 1) {
                view = new GroupCallUserCell(this.mContext) {
                    @Override
                    protected void onMuteClick(GroupCallUserCell groupCallUserCell) {
                        GroupCallActivity.this.showMenuForCell(groupCallUserCell);
                    }

                    @Override
                    protected void onMeasure(int i2, int i3) {
                        if (AndroidUtilities.isTablet()) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i2)), 1073741824), i3);
                        } else {
                            super.onMeasure(i2, i3);
                        }
                    }
                };
            } else if (i == 2) {
                view = new GroupCallInvitedCell(this, this.mContext) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        if (AndroidUtilities.isTablet()) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i2)), 1073741824), i3);
                        } else {
                            super.onMeasure(i2, i3);
                        }
                    }
                };
            } else if (i == 4) {
                view = new GroupCallGridCell(this.mContext, false) {
                    @Override
                    protected void onAttachedToWindow() {
                        super.onAttachedToWindow();
                        if (GroupCallActivity.this.listView.getVisibility() == 0 && GroupCallActivity.this.listViewVideoVisibility) {
                            GroupCallActivity.this.attachRenderer(this, true);
                        }
                    }

                    @Override
                    protected void onDetachedFromWindow() {
                        super.onDetachedFromWindow();
                        GroupCallActivity.this.attachRenderer(this, false);
                    }
                };
            } else if (i == 5) {
                view = new View(this, this.mContext) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
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
                    textView.setText(LocaleController.formatString("VoipChannelVideoNotAvailableAdmin", R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", GroupCallActivity.this.accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                } else {
                    textView.setText(LocaleController.formatString("VoipVideoNotAvailableAdmin", R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", GroupCallActivity.this.accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                }
                view = textView;
            } else {
                view = new View(this.mContext);
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
        }

        @Override
        public int getItemViewType(int i) {
            if (i == this.lastRow) {
                return 3;
            }
            if (i == this.addMemberRow) {
                return 0;
            }
            if (i == this.videoGridDividerRow) {
                return 5;
            }
            if (i < this.usersStartRow || i >= this.usersEndRow) {
                if (i < this.usersVideoGridStartRow || i >= this.usersVideoGridEndRow) {
                    return i == this.videoNotAvailableRow ? 6 : 2;
                }
                return 4;
            }
            return 1;
        }
    }

    public void attachRenderer(GroupCallGridCell groupCallGridCell, boolean z) {
        if (isDismissed()) {
            return;
        }
        if (z && groupCallGridCell.getRenderer() == null) {
            groupCallGridCell.setRenderer(GroupCallMiniTextureView.getOrCreate(this.attachedRenderers, this.renderersContainer, groupCallGridCell, null, null, groupCallGridCell.getParticipant(), this.call, this));
        } else if (z || groupCallGridCell.getRenderer() == null) {
        } else {
            groupCallGridCell.getRenderer().setPrimaryView(null);
            groupCallGridCell.setRenderer(null);
        }
    }

    public void setOldRows(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.oldAddMemberRow = i;
        this.oldUsersStartRow = i2;
        this.oldUsersEndRow = i3;
        this.oldInvitedStartRow = i4;
        this.oldInvitedEndRow = i5;
        this.oldUsersVideoStartRow = i6;
        this.oldUsersVideoEndRow = i7;
        this.oldVideoDividerRow = i8;
        this.oldVideoNotAvailableRow = i9;
    }

    public static class UpdateCallback implements ListUpdateCallback {
        final RecyclerView.Adapter adapter;

        private UpdateCallback(RecyclerView.Adapter adapter) {
            this.adapter = adapter;
        }

        @Override
        public void onInserted(int i, int i2) {
            this.adapter.notifyItemRangeInserted(i, i2);
        }

        @Override
        public void onRemoved(int i, int i2) {
            this.adapter.notifyItemRangeRemoved(i, i2);
        }

        @Override
        public void onMoved(int i, int i2) {
            this.adapter.notifyItemMoved(i, i2);
        }

        @Override
        public void onChanged(int i, int i2, Object obj) {
            this.adapter.notifyItemRangeChanged(i, i2, obj);
        }
    }

    public void toggleAdminSpeak() {
        TLRPC$TL_phone_toggleGroupCallSettings tLRPC$TL_phone_toggleGroupCallSettings = new TLRPC$TL_phone_toggleGroupCallSettings();
        tLRPC$TL_phone_toggleGroupCallSettings.call = this.call.getInputGroupCall();
        tLRPC$TL_phone_toggleGroupCallSettings.join_muted = this.call.call.join_muted;
        tLRPC$TL_phone_toggleGroupCallSettings.flags |= 1;
        this.accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_phone_toggleGroupCallSettings, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                GroupCallActivity.this.lambda$toggleAdminSpeak$63(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$toggleAdminSpeak$63(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            this.accountInstance.getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return new ArrayList<>();
    }

    @Override
    public void onBackPressed() {
        PrivateVideoPreviewDialog privateVideoPreviewDialog = this.previewDialog;
        if (privateVideoPreviewDialog != null) {
            privateVideoPreviewDialog.dismiss(false, false);
        } else if (this.avatarsPreviewShowed) {
            dismissAvatarPreview(true);
        } else if (this.renderersContainer.inFullscreenMode) {
            fullscreenFor(null);
        } else {
            super.onBackPressed();
        }
    }

    public class AvatarUpdaterDelegate implements ImageUpdater.ImageUpdaterDelegate {
        private TLRPC$FileLocation avatar;
        private TLRPC$FileLocation avatarBig;
        private final long peerId;
        private ImageLocation uploadingImageLocation;
        public float uploadingProgress;

        @Override
        public boolean canFinishFragment() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
        }

        @Override
        public void didStartUpload(boolean z) {
        }

        @Override
        public void didUploadFailed() {
            ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
        }

        @Override
        public String getInitialSearchString() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$getInitialSearchString(this);
        }

        private AvatarUpdaterDelegate(long j) {
            this.peerId = j;
        }

        @Override
        public void didUploadPhoto(final TLRPC$InputFile tLRPC$InputFile, final TLRPC$InputFile tLRPC$InputFile2, final double d, final String str, final TLRPC$PhotoSize tLRPC$PhotoSize, final TLRPC$PhotoSize tLRPC$PhotoSize2, boolean z, final TLRPC$VideoSize tLRPC$VideoSize) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GroupCallActivity.AvatarUpdaterDelegate.this.lambda$didUploadPhoto$3(tLRPC$InputFile, tLRPC$InputFile2, tLRPC$VideoSize, d, str, tLRPC$PhotoSize2, tLRPC$PhotoSize);
                }
            });
        }

        public void lambda$didUploadPhoto$1(final String str, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GroupCallActivity.AvatarUpdaterDelegate.this.lambda$didUploadPhoto$0(tLRPC$TL_error, tLObject, str);
                }
            });
        }

        public void lambda$didUploadPhoto$0(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, String str) {
            if (this.uploadingImageLocation != null) {
                GroupCallActivity.this.avatarsViewPager.removeUploadingImage(this.uploadingImageLocation);
                this.uploadingImageLocation = null;
            }
            if (tLRPC$TL_error == null) {
                TLRPC$User user = GroupCallActivity.this.accountInstance.getMessagesController().getUser(Long.valueOf(GroupCallActivity.this.accountInstance.getUserConfig().getClientUserId()));
                if (user == null) {
                    user = GroupCallActivity.this.accountInstance.getUserConfig().getCurrentUser();
                    if (user == null) {
                        return;
                    }
                    GroupCallActivity.this.accountInstance.getMessagesController().putUser(user, false);
                } else {
                    GroupCallActivity.this.accountInstance.getUserConfig().setCurrentUser(user);
                }
                TLRPC$TL_photos_photo tLRPC$TL_photos_photo = (TLRPC$TL_photos_photo) tLObject;
                ArrayList<TLRPC$PhotoSize> arrayList = tLRPC$TL_photos_photo.photo.sizes;
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
                TLRPC$VideoSize tLRPC$VideoSize = tLRPC$TL_photos_photo.photo.video_sizes.isEmpty() ? null : tLRPC$TL_photos_photo.photo.video_sizes.get(0);
                TLRPC$TL_userProfilePhoto tLRPC$TL_userProfilePhoto = new TLRPC$TL_userProfilePhoto();
                user.photo = tLRPC$TL_userProfilePhoto;
                tLRPC$TL_userProfilePhoto.photo_id = tLRPC$TL_photos_photo.photo.id;
                if (closestPhotoSizeWithSize != null) {
                    tLRPC$TL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                }
                if (closestPhotoSizeWithSize2 != null) {
                    tLRPC$TL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                }
                if (closestPhotoSizeWithSize != null && this.avatar != null) {
                    FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(this.avatar, true).renameTo(FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                    ImageLoader.getInstance().replaceImageInCache(this.avatar.volume_id + "_" + this.avatar.local_id + "@50_50", closestPhotoSizeWithSize.location.volume_id + "_" + closestPhotoSizeWithSize.location.local_id + "@50_50", ImageLocation.getForUser(user, 1), false);
                }
                if (closestPhotoSizeWithSize2 != null && this.avatarBig != null) {
                    FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(this.avatarBig, true).renameTo(FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
                }
                if (tLRPC$VideoSize != null && str != null) {
                    new File(str).renameTo(FileLoader.getInstance(((BottomSheet) GroupCallActivity.this).currentAccount).getPathToAttach(tLRPC$VideoSize, "mp4", true));
                }
                GroupCallActivity.this.accountInstance.getMessagesController().getDialogPhotos(user.id).reset();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(user);
                GroupCallActivity.this.accountInstance.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                TLRPC$User user2 = GroupCallActivity.this.accountInstance.getMessagesController().getUser(Long.valueOf(this.peerId));
                ImageLocation forUser = ImageLocation.getForUser(user2, 0);
                ImageLocation forUser2 = ImageLocation.getForUser(user2, 1);
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

        public void lambda$didUploadPhoto$2() {
            if (this.uploadingImageLocation != null) {
                GroupCallActivity.this.avatarsViewPager.removeUploadingImage(this.uploadingImageLocation);
                this.uploadingImageLocation = null;
            }
            TLRPC$Chat chat = GroupCallActivity.this.accountInstance.getMessagesController().getChat(Long.valueOf(-this.peerId));
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

        public void lambda$didUploadPhoto$3(TLRPC$InputFile tLRPC$InputFile, TLRPC$InputFile tLRPC$InputFile2, TLRPC$VideoSize tLRPC$VideoSize, double d, final String str, TLRPC$PhotoSize tLRPC$PhotoSize, TLRPC$PhotoSize tLRPC$PhotoSize2) {
            if (tLRPC$InputFile != null || tLRPC$InputFile2 != null || tLRPC$VideoSize != null) {
                if (this.peerId <= 0) {
                    GroupCallActivity.this.accountInstance.getMessagesController().changeChatAvatar(-this.peerId, null, tLRPC$InputFile, tLRPC$InputFile2, tLRPC$VideoSize, d, str, tLRPC$PhotoSize.location, tLRPC$PhotoSize2.location, new Runnable() {
                        @Override
                        public final void run() {
                            GroupCallActivity.AvatarUpdaterDelegate.this.lambda$didUploadPhoto$2();
                        }
                    });
                    return;
                }
                TLRPC$TL_photos_uploadProfilePhoto tLRPC$TL_photos_uploadProfilePhoto = new TLRPC$TL_photos_uploadProfilePhoto();
                if (tLRPC$InputFile != null) {
                    tLRPC$TL_photos_uploadProfilePhoto.file = tLRPC$InputFile;
                    tLRPC$TL_photos_uploadProfilePhoto.flags |= 1;
                }
                if (tLRPC$InputFile2 != null) {
                    tLRPC$TL_photos_uploadProfilePhoto.video = tLRPC$InputFile2;
                    int i = tLRPC$TL_photos_uploadProfilePhoto.flags | 2;
                    tLRPC$TL_photos_uploadProfilePhoto.flags = i;
                    tLRPC$TL_photos_uploadProfilePhoto.video_start_ts = d;
                    tLRPC$TL_photos_uploadProfilePhoto.flags = i | 4;
                }
                if (tLRPC$VideoSize != null) {
                    tLRPC$TL_photos_uploadProfilePhoto.video_emoji_markup = tLRPC$VideoSize;
                    tLRPC$TL_photos_uploadProfilePhoto.flags |= 16;
                }
                GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_photos_uploadProfilePhoto, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        GroupCallActivity.AvatarUpdaterDelegate.this.lambda$didUploadPhoto$1(str, tLObject, tLRPC$TL_error);
                    }
                });
                return;
            }
            this.avatar = tLRPC$PhotoSize.location;
            TLRPC$FileLocation tLRPC$FileLocation = tLRPC$PhotoSize2.location;
            this.avatarBig = tLRPC$FileLocation;
            this.uploadingImageLocation = ImageLocation.getForLocal(tLRPC$FileLocation);
            GroupCallActivity.this.avatarsViewPager.addUploadingImage(this.uploadingImageLocation, ImageLocation.getForLocal(this.avatar));
            AndroidUtilities.updateVisibleRows(GroupCallActivity.this.listView);
        }

        @Override
        public void onUploadProgressChanged(float f) {
            GroupCallActivity.this.avatarsViewPager.setUploadProgress(this.uploadingImageLocation, f);
            updateAvatarUploadingProgress(f);
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
    }

    public View getScrimView() {
        return this.scrimView;
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

        @Override
        public void endAnimations() {
            super.endAnimations();
            this.removingHolders.clear();
            this.addingHolders.clear();
            this.outMinTop = Float.MAX_VALUE;
            GroupCallActivity.this.listView.invalidate();
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
                RecyclerView.ViewHolder findContainingViewHolder = GroupCallActivity.this.listView.findContainingViewHolder(childAt);
                if (findContainingViewHolder != null && findContainingViewHolder.getItemViewType() != 3 && findContainingViewHolder.getItemViewType() != 4 && findContainingViewHolder.getItemViewType() != 5 && !this.addingHolders.contains(findContainingViewHolder)) {
                    this.outMaxBottom = Math.max(this.outMaxBottom, childAt.getY() + childAt.getMeasuredHeight());
                    this.outMinTop = Math.min(this.outMinTop, Math.max(0.0f, childAt.getY()));
                }
            }
            this.animationProgress = 0.0f;
            GroupCallActivity.this.listView.invalidate();
        }

        @Override
        public void runPendingAnimations() {
            boolean z = !this.mPendingRemovals.isEmpty();
            boolean z2 = !this.mPendingMoves.isEmpty();
            boolean z3 = !this.mPendingAdditions.isEmpty();
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.animator = null;
            }
            if (z || z2 || z3) {
                this.animationProgress = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.animator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        GroupCallActivity.GroupCallItemAnimator.this.lambda$runPendingAnimations$0(valueAnimator2);
                    }
                });
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

        public void lambda$runPendingAnimations$0(ValueAnimator valueAnimator) {
            this.animationProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            GroupCallActivity.this.listView.invalidate();
            GroupCallActivity.this.renderersContainer.invalidate();
            ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            GroupCallActivity.this.updateLayout(true);
        }
    }

    @Override
    protected boolean canDismissWithTouchOutside() {
        return !this.renderersContainer.inFullscreenMode;
    }

    public void onUserLeaveHint() {
        if (isRtmpStream() && AndroidUtilities.checkInlinePermissions(this.parentActivity) && !RTMPStreamPipOverlay.isVisible()) {
            dismiss();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    RTMPStreamPipOverlay.show();
                }
            }, 100L);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.parentActivity.addOnUserLeaveHintListener(this.onUserLeaveHintListener);
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
    }

    public void onPause() {
        paused = true;
        this.attachedRenderersTmp.clear();
        this.attachedRenderersTmp.addAll(this.attachedRenderers);
        for (int i = 0; i < this.attachedRenderersTmp.size(); i++) {
            this.attachedRenderersTmp.get(i).updateAttachState(false);
        }
    }

    public boolean isRtmpLandscapeMode() {
        if (!isRtmpStream() || this.call.visibleVideoParticipants.isEmpty()) {
            return false;
        }
        return this.call.visibleVideoParticipants.get(0).aspectRatio == 0.0f || this.call.visibleVideoParticipants.get(0).aspectRatio >= 1.0f;
    }

    public boolean isRtmpStream() {
        ChatObject.Call call = this.call;
        return call != null && call.call.rtmp_stream;
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.parentActivity == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.parentActivity.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            boolean z = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                getUndoView().showWithAction(0L, z ? 42 : 43, (Runnable) null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }
}
