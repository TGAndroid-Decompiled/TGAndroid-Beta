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
import android.view.Window;
import android.view.WindowManager;
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
import j$.util.Collection;
import j$.util.function.Function$CC;
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
import java.util.function.Function;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.pip.PipSource;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
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
import org.telegram.ui.Components.RecordStatusDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.Components.voip.GroupCallGridCell;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Components.voip.GroupCallRenderersContainer;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialog;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Components.voip.VoIPTextureView;
import org.telegram.ui.Components.voip.VoIPToggleButton;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.Stories.recorder.DominantColors;
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
    private final ArrayList attachedRenderers;
    private final ArrayList attachedRenderersTmp;
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
    private FrameLayout bulletinContainer;
    private HashMap buttonsAnimationParamsX;
    private HashMap buttonsAnimationParamsY;
    private GradientDrawable buttonsBackgroundGradient;
    private final View buttonsBackgroundGradientView;
    private final View buttonsBackgroundGradientView2;
    private FrameLayout buttonsContainer;
    private int buttonsVisibility;
    private Integer cacheAudioOutputValue;
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
    public TLRPC.Chat currentChat;
    private ViewGroup currentOptionsLayout;
    private WeavingState currentState;
    private boolean delayedGroupCallUpdated;
    private DiffUtil.Callback diffUtilsCallback;
    private boolean drawSpeakingSubtitle;
    public boolean drawingForBlur;
    private ActionBarMenuSubItem editTitleItem;
    private CallEncryptionCellDrawable encryptionDrawable;
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
    private ValueAnimator liveLabelBgColorAnimator;
    private Paint liveLabelPaint;
    private TextView liveLabelTextView;
    private final LinearLayout menuItemsContainer;
    private ImageView minimizeButton;
    private RLottieImageView muteButton;
    private ValueAnimator muteButtonAnimator;
    private int muteButtonState;
    private TextView[] muteLabel;
    private boolean needTextureLightning;
    private ActionBarMenuSubItem noiseItem;
    private int oldAddMemberRow;
    private int oldConferenceAddPeopleRow;
    private int oldConferenceShareLinkRow;
    private int oldCount;
    private int oldEncryptionRow;
    private ArrayList oldInvited;
    private int oldInvitedEndRow;
    private int oldInvitedStartRow;
    private ArrayList oldParticipants;
    private ArrayList oldShadyJoin;
    private int oldShadyJoinEndRow;
    private int oldShadyJoinStartRow;
    private ArrayList oldShadyLeft;
    private int oldShadyLeftEndRow;
    private int oldShadyLeftStartRow;
    private int oldUsersEndRow;
    private int oldUsersStartRow;
    private int oldUsersVideoEndRow;
    private int oldUsersVideoStartRow;
    private int oldVideoDividerRow;
    private int oldVideoNotAvailableRow;
    private ArrayList oldVideoParticipants;
    private Runnable onUserLeaveHintListener;
    private ActionBarMenuItem otherItem;
    private Paint paint;
    private Paint paintTmp;
    private LaunchActivity parentActivity;
    private ActionBarMenuSubItem permissionItem;
    PinchToZoomHelper pinchToZoomHelper;
    private ActionBarMenuItem pipItem;
    private PipSource pipSource;
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
    private TLRPC.InputPeer schedulePeer;
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
    private boolean scrimViewAttached;
    private float scrollOffsetY;
    private TLRPC.Peer selfPeer;
    private int shaderBitmapSize;
    private Drawable shadowDrawable;
    private ShareAlert shareAlert;
    private float showLightingProgress;
    private float showWavesProgress;
    private VoIPToggleButton soundButton;
    private float soundButtonScale;
    private ActionBarMenuSubItem soundItem;
    private View soundItemDivider;
    private final GridLayoutManager.SpanSizeLookup spanSizeLookup;
    private VoIPToggleButton speakerButton;
    private FrameLayout speakerButtonContainer;
    private int speakerIcon;
    private ImageView speakerImageView;
    private boolean startingGroupCall;
    private WeavingState[] states;
    public final ArrayList statusIconPool;
    ObjectAnimator subtitleYAnimator;
    private float switchProgress;
    private float switchToButtonInt2;
    private float switchToButtonProgress;
    GroupCallTabletGridAdapter tabletGridAdapter;
    RecyclerListView tabletVideoGridView;
    private LightningView textureLightningView;
    private float textureLightningViewAnimatingAlpha;
    private final BlobDrawable tinyWaveDrawable;
    private LinearLayout titleLayout;
    private AudioPlayerAlert.ClippingTextViewSwitcher titleTextView;
    private UndoView[] undoView;
    private Runnable unmuteRunnable;
    private Runnable updateCallRecordRunnable;
    private Runnable updateSchedeulRunnable;
    private final Runnable updateTextureLightningRunnable;
    private boolean useBlur;
    private TLObject userSwitchObject;
    LongSparseIntArray visiblePeerIds;
    public final ArrayList visibleVideoParticipants;
    private Boolean wasExpandBigSize;
    private Boolean wasNotInLayoutFullscreen;
    private WatchersView watchersView;
    public static volatile DispatchQueue updateTextureLightningQueue = new DispatchQueue("updateTextureLightningQueue");
    public static final Property COLOR_PROGRESS = new AnimationProperties.FloatProperty("colorProgress") {
        @Override
        public void setValue(GroupCallActivity groupCallActivity, float f) {
            groupCallActivity.setColorProgress(f);
        }

        @Override
        public Float get(GroupCallActivity groupCallActivity) {
            return Float.valueOf(groupCallActivity.getColorProgress());
        }
    };

    public static void lambda$processSelectedOption$74(DialogInterface dialogInterface) {
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    public boolean getAudioOutputActive(int i) {
        return i != 1;
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

    static float access$12216(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.amplitude + f;
        groupCallActivity.amplitude = f2;
        return f2;
    }

    static float access$14816(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.switchProgress + f;
        groupCallActivity.switchProgress = f2;
        return f2;
    }

    static float access$15516(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showWavesProgress + f;
        groupCallActivity.showWavesProgress = f2;
        return f2;
    }

    static float access$15524(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showWavesProgress - f;
        groupCallActivity.showWavesProgress = f2;
        return f2;
    }

    static float access$15616(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showLightingProgress + f;
        groupCallActivity.showLightingProgress = f2;
        return f2;
    }

    static float access$15624(GroupCallActivity groupCallActivity, float f) {
        float f2 = groupCallActivity.showLightingProgress - f;
        groupCallActivity.showLightingProgress = f2;
        return f2;
    }

    static String access$25800() {
        return getRandomEmoji();
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
        try {
            this.muteButton.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        updateMuteButton(1, true);
        AndroidUtilities.runOnUIThread(this.unmuteRunnable, 80L);
        this.scheduled = false;
        this.pressed = true;
    }

    public class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        @Override
        public void run() {
            GroupCallGridCell findGroupCallGridCell;
            GroupCallMiniTextureView renderer;
            final VoIPTextureView voIPTextureView;
            try {
                if (GroupCallActivity.this.renderersContainer == null || GroupCallActivity.this.renderersContainer.inFullscreenMode || (findGroupCallGridCell = GroupCallActivity.this.findGroupCallGridCell()) == null || !findGroupCallGridCell.isAttachedToWindow() || (renderer = findGroupCallGridCell.getRenderer()) == null || (voIPTextureView = renderer.textureView) == null) {
                    return;
                }
                GroupCallActivity.updateTextureLightningQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        GroupCallActivity.AnonymousClass2.this.lambda$run$1(voIPTextureView);
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public void lambda$run$1(VoIPTextureView voIPTextureView) {
            try {
                Bitmap bitmap = voIPTextureView.blurRenderer.getBitmap(100, 100);
                if (bitmap == null) {
                    return;
                }
                final int[] colorsSync = DominantColors.getColorsSync(false, bitmap, true);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        GroupCallActivity.AnonymousClass2.this.lambda$run$0(colorsSync);
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public void lambda$run$0(int[] iArr) {
            GroupCallActivity.this.textureLightningView.setNewColors(iArr);
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

    public void runUpdateTextureLightningRunnable() {
        AndroidUtilities.cancelRunOnUIThread(this.updateTextureLightningRunnable);
        if (!this.needTextureLightning || this.textureLightningView == null || VoIPService.getSharedInstance() == null || !isRtmpStream() || this.listView == null || !LiteMode.isEnabled(512)) {
            return;
        }
        AndroidUtilities.runOnUIThread(this.updateTextureLightningRunnable, 30L);
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
            double participantVolume = ChatObject.getParticipantVolume(this.currentParticipant) / 100.0d;
            this.textView.setText(String.format(Locale.US, "%d%%", Integer.valueOf((int) (participantVolume > 0.0d ? Math.max(participantVolume, 1.0d) : 0.0d))));
            this.textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(43.0f) : 0, 0);
            addView(this.textView, LayoutHelper.createFrame(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
            this.paint2.setStyle(Paint.Style.STROKE);
            this.paint2.setStrokeWidth(AndroidUtilities.dp(1.5f));
            this.paint2.setStrokeCap(Paint.Cap.ROUND);
            this.paint2.setColor(-1);
            int participantVolume2 = (int) (ChatObject.getParticipantVolume(this.currentParticipant) / 100.0d);
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
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
            this.thumbX = (int) (View.MeasureSpec.getSize(i) * this.currentProgress);
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
                        onSeekBarDrag(this.thumbX / getMeasuredWidth(), true);
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
                    onSeekBarDrag(this.thumbX / getMeasuredWidth(), false);
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
            TLRPC.GroupCallParticipant groupCallParticipant = this.currentParticipant;
            groupCallParticipant.volume = (int) (d * 20000.0d);
            groupCallParticipant.volume_by_admin = false;
            groupCallParticipant.flags |= 128;
            double participantVolume = ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d;
            this.textView.setText(String.format(Locale.US, "%d%%", Integer.valueOf((int) (participantVolume > 0.0d ? Math.max(participantVolume, 1.0d) : 0.0d))));
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
            int participantVolume = (int) (ChatObject.getParticipantVolume(this.currentParticipant) / 100.0d);
            int left = this.imageView.getLeft() + (this.imageView.getMeasuredWidth() / 2) + AndroidUtilities.dp(5.0f);
            int top = this.imageView.getTop() + (this.imageView.getMeasuredHeight() / 2);
            int i5 = 0;
            while (i5 < this.volumeAlphas.length) {
                if (i5 == 0) {
                    dp = AndroidUtilities.dp(f4);
                    i2 = 0;
                } else if (i5 == i4) {
                    dp = AndroidUtilities.dp(10.0f);
                    i2 = 50;
                } else {
                    dp = AndroidUtilities.dp(14.0f);
                    i2 = 150;
                }
                float dp4 = AndroidUtilities.dp(2.0f);
                float f5 = this.volumeAlphas[i5];
                float f6 = dp4 * (f - f5);
                this.paint2.setAlpha((int) (f5 * 255.0f));
                float f7 = left;
                float f8 = top;
                this.rect.set((f7 - dp) + f6, (f8 - dp) + f6, (f7 + dp) - f6, (f8 + dp) - f6);
                int i6 = i2;
                int i7 = i5;
                canvas.drawArc(this.rect, -50.0f, 100.0f, false, this.paint2);
                if (participantVolume > i6) {
                    float[] fArr3 = this.volumeAlphas;
                    float f9 = fArr3[i7];
                    if (f9 < 1.0f) {
                        float f10 = f9 + (((float) j) / 180.0f);
                        fArr3[i7] = f10;
                        if (f10 > 1.0f) {
                            fArr3[i7] = 1.0f;
                        }
                        invalidate();
                    }
                } else {
                    float[] fArr4 = this.volumeAlphas;
                    float f11 = fArr4[i7];
                    if (f11 > 0.0f) {
                        float f12 = f11 - (((float) j) / 180.0f);
                        fArr4[i7] = f12;
                        if (f12 < 0.0f) {
                            fArr4[i7] = 0.0f;
                        }
                        invalidate();
                    }
                }
                i5 = i7 + 1;
                f = 1.0f;
                f4 = 6.0f;
                i4 = 1;
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
        this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.conferenceEmojiUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
        super.dismiss();
    }

    public boolean isStillConnecting() {
        int i = this.currentCallState;
        return i == 1 || i == 2 || i == 6 || i == 5;
    }

    public long getChatId() {
        TLRPC.Chat chat = this.currentChat;
        if (chat == null) {
            return 0L;
        }
        return chat.id;
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
        String[] strArr = null;
        int i5 = 0;
        if (i == NotificationCenter.groupCallUpdated) {
            Long l = (Long) objArr[1];
            ChatObject.Call call = this.call;
            if (call == null || call.call.id != l.longValue()) {
                return;
            }
            ChatObject.Call call2 = this.call;
            if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                dismiss();
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
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean z = this.muteButtonState == 4;
            updateState(true, booleanValue);
            updateTitle(true);
            if (z && ((i3 = this.muteButtonState) == 1 || i3 == 0)) {
                getUndoView().showWithAction(0L, 38, (Runnable) null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playAllowTalkSound();
                }
            }
            if (objArr.length >= 4) {
                Long l2 = (Long) objArr[3];
                long longValue = l2.longValue();
                if (longValue == 0 || isRtmpStream()) {
                    return;
                }
                if (isConference() && (sharedInstance = VoIPService.getSharedInstance()) != null && longValue == sharedInstance.convertingFromCallWithUserId) {
                    return;
                }
                try {
                    ArrayList<TLRPC.Dialog> allDialogs = this.accountInstance.getMessagesController().getAllDialogs();
                    if (allDialogs != null) {
                        Iterator<TLRPC.Dialog> it = allDialogs.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().id == longValue) {
                                    i5 = 1;
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
                TLRPC.Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
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
                    for (int i7 = 0; i7 < this.visibleVideoParticipants.size(); i7++) {
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) this.visibleVideoParticipants.get(i7);
                        if (this.call.currentSpeakingPeers.get(MessageObject.getPeerId(videoParticipant3.participant.peer), null) != null) {
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
                    if (ChatObject.isChannelOrGiga(this.currentChat)) {
                        string = LocaleController.getString(R.string.VoipChannelTooMuch);
                    } else {
                        string = LocaleController.getString(R.string.VoipGroupTooMuch);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    string = LocaleController.getString(R.string.ErrorOccurred) + "\n" + str;
                } else if (ChatObject.isChannelOrGiga(this.currentChat)) {
                    string = LocaleController.getString(R.string.VoipChannelJoinAnonymousAdmin);
                } else {
                    string = LocaleController.getString(R.string.VoipGroupJoinAnonymousAdmin);
                }
                AlertDialog.Builder createSimpleAlert = AlertsCreator.createSimpleAlert(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                createSimpleAlert.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        GroupCallActivity.this.lambda$didReceivedNotification$3(dialogInterface);
                    }
                });
                try {
                    createSimpleAlert.show();
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
                dismiss();
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
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i5 < childCount2) {
                RecyclerView.ViewHolder findContainingViewHolder = this.listView.findContainingViewHolder(this.listView.getChildAt(i5));
                if (findContainingViewHolder != null) {
                    View view = findContainingViewHolder.itemView;
                    if (view instanceof GroupCallUserCell) {
                        GroupCallUserCell groupCallUserCell = (GroupCallUserCell) view;
                        if (groupCallUserCell.getParticipant() != null) {
                            groupCallUserCell.getParticipant().lastVisibleDate = longValue2;
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
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                applyCallParticipantUpdates(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) == 0 && (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) == 0) {
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
                strArr = conferenceCall.getEmojis();
            }
            callEncryptionCellDrawable.setEmojis(strArr);
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
        TLRPC.GroupCallParticipant groupCallParticipant;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f = 0.0f;
        }
        setAmplitude(4000.0f * f);
        ChatObject.Call call = this.call;
        if (call == null || this.listView == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(MessageObject.getPeerId(this.selfPeer))) == null) {
            return;
        }
        if (!this.renderersContainer.inFullscreenMode) {
            int indexOf = (this.delayedGroupCallUpdated ? this.oldParticipants : this.call.visibleParticipants).indexOf(groupCallParticipant);
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
                if (MessageObject.getPeerId(groupCallUserCell.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    groupCallUserCell.setAmplitude(f * 15.0f);
                }
            }
        }
        this.renderersContainer.setAmplitude(groupCallParticipant, f * 15.0f);
    }

    public void applyCallParticipantUpdates(boolean r28) {
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
        TLObject chat;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        TLRPC.Chat chat2;
        TLRPC.Chat chat3;
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
        TLRPC.Chat chat4 = this.accountInstance.getMessagesController().getChat(Long.valueOf(getChatId()));
        if (chat4 != null) {
            this.currentChat = chat4;
        }
        if (ChatObject.canUserDoAdminAction(this.currentChat, 3) || (((!ChatObject.isChannel(this.currentChat) || ((chat3 = this.currentChat) != null && chat3.megagroup)) && (ChatObject.isPublic(this.currentChat) || ChatObject.canUserDoAdminAction(this.currentChat, 3))) || (ChatObject.isChannel(this.currentChat) && (chat2 = this.currentChat) != null && !chat2.megagroup && ChatObject.isPublic(chat2)))) {
            this.inviteItem.setVisibility(0);
        } else {
            this.inviteItem.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.participants.get(MessageObject.getPeerId(this.selfPeer));
        ChatObject.Call call3 = this.call;
        if (call3 == null || call3.isScheduled() || (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted)) {
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
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            GroupCallActivity.this.lambda$updateItems$4();
                        }
                    };
                    this.updateCallRecordRunnable = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 1000L);
                }
                this.recordItem.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                Runnable runnable2 = this.updateCallRecordRunnable;
                if (runnable2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable2);
                    this.updateCallRecordRunnable = null;
                }
                this.recordItem.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                this.screenItem.setTextAndIcon(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off);
            } else {
                this.screenItem.setTextAndIcon(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast);
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
        if (((VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().hasFewPeers) || this.scheduleHasFewPeers) && !isRtmpStream() && this.selfPeer != null) {
            this.accountSelectCell.setVisibility(0);
            this.accountGap.setVisibility(0);
            long peerId = MessageObject.getPeerId(this.selfPeer);
            if (DialogObject.isUserDialog(peerId)) {
                chat = this.accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
            } else {
                chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
            }
            this.accountSelectCell.setObject(chat);
        } else {
            this.accountSelectCell.setVisibility(8);
            this.accountGap.setVisibility(8);
        }
        TLRPC.Chat chat5 = this.currentChat;
        if (chat5 != null && !ChatObject.isChannelOrGiga(chat5) && isRtmpStream() && this.inviteItem.getVisibility() == 8) {
            this.otherItem.setVisibility(8);
        } else {
            this.otherItem.setVisibility(0);
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

    public void lambda$updateItems$4() {
        updateRecordCallText();
        AndroidUtilities.runOnUIThread(this.updateCallRecordRunnable, 1000L);
    }

    protected void makeFocusable(final BottomSheet bottomSheet, final AlertDialog alertDialog, final EditTextBoldCursor editTextBoldCursor, final boolean z) {
        if (this.enterEventSent) {
            return;
        }
        BaseFragment baseFragment = (BaseFragment) this.parentActivity.getActionBarLayout().getFragmentStack().get(this.parentActivity.getActionBarLayout().getFragmentStack().size() - 1);
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
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    AndroidUtilities.showKeyboard(EditTextBoldCursor.this);
                }
            });
        }
    }

    public static void lambda$makeFocusable$8(EditTextBoldCursor editTextBoldCursor) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
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

    private GroupCallActivity(final Activity activity, final AccountInstance accountInstance, final ChatObject.Call call, final TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z, String str) {
        super(activity, false);
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.muteLabel = new TextView[2];
        this.undoView = new UndoView[2];
        this.visibleVideoParticipants = new ArrayList();
        this.rect = new RectF();
        this.listViewBackgroundPaint = new Paint(1);
        this.oldParticipants = new ArrayList();
        this.oldVideoParticipants = new ArrayList();
        this.oldInvited = new ArrayList();
        this.oldShadyJoin = new ArrayList();
        this.oldShadyLeft = new ArrayList();
        this.muteButtonState = 0;
        this.animatingToFullscreenExpand = false;
        this.paint = new Paint(7);
        this.paintTmp = new Paint(7);
        this.leaveBackgroundPaint = new Paint(1);
        this.states = new WeavingState[8];
        this.switchProgress = 1.0f;
        this.shaderBitmapSize = 200;
        this.invalidateColors = true;
        this.colorsTmp = new int[4];
        this.attachedRenderers = new ArrayList();
        this.attachedRenderersTmp = new ArrayList();
        this.wasExpandBigSize = Boolean.TRUE;
        this.cellFlickerDrawable = new CellFlickerDrawable();
        this.statusIconPool = new ArrayList();
        this.buttonsAnimationParamsX = new HashMap();
        this.buttonsAnimationParamsY = new HashMap();
        this.onUserLeaveHintListener = new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.this.onUserLeaveHint();
            }
        };
        this.updateSchedeulRunnable = new Runnable() {
            @Override
            public void run() {
                int i;
                if (GroupCallActivity.this.scheduleTimeTextView == null || GroupCallActivity.this.isDismissed()) {
                    return;
                }
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                ChatObject.Call call2 = groupCallActivity.call;
                if (call2 == null) {
                    i = groupCallActivity.scheduleStartAt;
                } else {
                    i = call2.call.schedule_date;
                }
                if (i == 0) {
                    return;
                }
                int currentTime = i - GroupCallActivity.this.accountInstance.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    GroupCallActivity.this.scheduleTimeTextView.setText(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]));
                } else {
                    GroupCallActivity.this.scheduleTimeTextView.setText(AndroidUtilities.formatFullDuration(Math.abs(currentTime)));
                    if (currentTime < 0 && GroupCallActivity.this.scheduleStartInTextView.getTag() == null) {
                        GroupCallActivity.this.scheduleStartInTextView.setTag(1);
                        GroupCallActivity.this.scheduleStartInTextView.setText(LocaleController.getString(R.string.VoipChatLateBy));
                    }
                }
                GroupCallActivity.this.scheduleStartAtTextView.setText(LocaleController.formatStartsTime(i, 3));
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
        this.needTextureLightning = false;
        this.updateTextureLightningRunnable = new AnonymousClass2();
        this.visiblePeerIds = new LongSparseIntArray();
        this.gradientColors = new int[2];
        this.listViewVideoVisibility = true;
        this.invites = new String[2];
        this.popupAnimationIndex = -1;
        this.diffUtilsCallback = new DiffUtil.Callback() {
            @Override
            public boolean areContentsTheSame(int i, int i2) {
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
            public boolean areItemsTheSame(int i, int i2) {
                if (GroupCallActivity.this.listAdapter.addMemberRow >= 0) {
                    if (i == GroupCallActivity.this.oldAddMemberRow && i2 == GroupCallActivity.this.listAdapter.addMemberRow) {
                        return true;
                    }
                    if ((i == GroupCallActivity.this.oldAddMemberRow && i2 != GroupCallActivity.this.listAdapter.addMemberRow) || (i != GroupCallActivity.this.oldAddMemberRow && i2 == GroupCallActivity.this.listAdapter.addMemberRow)) {
                        return false;
                    }
                }
                if (GroupCallActivity.this.listAdapter.conferenceAddPeopleRow >= 0) {
                    if (i == GroupCallActivity.this.oldConferenceAddPeopleRow && i2 == GroupCallActivity.this.listAdapter.conferenceAddPeopleRow) {
                        return true;
                    }
                    if ((i == GroupCallActivity.this.oldConferenceAddPeopleRow && i2 != GroupCallActivity.this.listAdapter.conferenceAddPeopleRow) || (i != GroupCallActivity.this.oldConferenceAddPeopleRow && i2 == GroupCallActivity.this.listAdapter.conferenceAddPeopleRow)) {
                        return false;
                    }
                }
                if (GroupCallActivity.this.listAdapter.conferenceShareLinkRow >= 0) {
                    if (i == GroupCallActivity.this.oldConferenceShareLinkRow && i2 == GroupCallActivity.this.listAdapter.conferenceShareLinkRow) {
                        return true;
                    }
                    if ((i == GroupCallActivity.this.oldConferenceShareLinkRow && i2 != GroupCallActivity.this.listAdapter.conferenceShareLinkRow) || (i != GroupCallActivity.this.oldConferenceShareLinkRow && i2 == GroupCallActivity.this.listAdapter.conferenceShareLinkRow)) {
                        return false;
                    }
                }
                if (GroupCallActivity.this.listAdapter.encryptionRow >= 0) {
                    if (i == GroupCallActivity.this.oldEncryptionRow && i2 == GroupCallActivity.this.listAdapter.encryptionRow) {
                        return true;
                    }
                    if ((i == GroupCallActivity.this.oldEncryptionRow && i2 != GroupCallActivity.this.listAdapter.encryptionRow) || (i != GroupCallActivity.this.oldEncryptionRow && i2 == GroupCallActivity.this.listAdapter.encryptionRow)) {
                        return false;
                    }
                }
                if (GroupCallActivity.this.listAdapter.videoNotAvailableRow >= 0) {
                    if (i == GroupCallActivity.this.oldVideoNotAvailableRow && i2 == GroupCallActivity.this.listAdapter.videoNotAvailableRow) {
                        return true;
                    }
                    if ((i == GroupCallActivity.this.oldVideoNotAvailableRow && i2 != GroupCallActivity.this.listAdapter.videoNotAvailableRow) || (i != GroupCallActivity.this.oldVideoNotAvailableRow && i2 == GroupCallActivity.this.listAdapter.videoNotAvailableRow)) {
                        return false;
                    }
                }
                if (GroupCallActivity.this.listAdapter.videoGridDividerRow >= 0 && GroupCallActivity.this.listAdapter.videoGridDividerRow == i2 && i == GroupCallActivity.this.oldVideoDividerRow) {
                    return true;
                }
                if (i == GroupCallActivity.this.oldCount - 1 && i2 == GroupCallActivity.this.listAdapter.rowsCount - 1) {
                    return true;
                }
                if (i != GroupCallActivity.this.oldCount - 1 && i2 != GroupCallActivity.this.listAdapter.rowsCount - 1) {
                    if (i2 >= GroupCallActivity.this.listAdapter.usersVideoGridStartRow && i2 < GroupCallActivity.this.listAdapter.usersVideoGridEndRow && i >= GroupCallActivity.this.oldUsersVideoStartRow && i < GroupCallActivity.this.oldUsersVideoEndRow) {
                        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) GroupCallActivity.this.oldVideoParticipants.get(i - GroupCallActivity.this.oldUsersVideoStartRow);
                        GroupCallActivity groupCallActivity = GroupCallActivity.this;
                        return videoParticipant.equals((ChatObject.VideoParticipant) groupCallActivity.visibleVideoParticipants.get(i2 - groupCallActivity.listAdapter.usersVideoGridStartRow));
                    }
                    if (i2 >= GroupCallActivity.this.listAdapter.usersStartRow && i2 < GroupCallActivity.this.listAdapter.usersEndRow && i >= GroupCallActivity.this.oldUsersStartRow && i < GroupCallActivity.this.oldUsersEndRow) {
                        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) GroupCallActivity.this.oldParticipants.get(i - GroupCallActivity.this.oldUsersStartRow);
                        GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                        if (MessageObject.getPeerId(groupCallParticipant.peer) == MessageObject.getPeerId(groupCallActivity2.call.visibleParticipants.get(i2 - groupCallActivity2.listAdapter.usersStartRow).peer)) {
                            return i == i2 || groupCallParticipant.lastActiveDate == ((long) groupCallParticipant.active_date);
                        }
                        return false;
                    }
                    if (i2 >= GroupCallActivity.this.listAdapter.invitedStartRow && i2 < GroupCallActivity.this.listAdapter.invitedEndRow && i >= GroupCallActivity.this.oldInvitedStartRow && i < GroupCallActivity.this.oldInvitedEndRow) {
                        Long l = (Long) GroupCallActivity.this.oldInvited.get(i - GroupCallActivity.this.oldInvitedStartRow);
                        GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                        return l.equals(groupCallActivity3.call.invitedUsers.get(i2 - groupCallActivity3.listAdapter.invitedStartRow));
                    }
                    if (i2 >= GroupCallActivity.this.listAdapter.shadyJoinStartRow && i2 < GroupCallActivity.this.listAdapter.shadyJoinEndRow && i >= GroupCallActivity.this.oldShadyJoinStartRow && i < GroupCallActivity.this.oldShadyJoinEndRow) {
                        Long l2 = (Long) GroupCallActivity.this.oldShadyJoin.get(i - GroupCallActivity.this.oldShadyJoinStartRow);
                        GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                        return l2.equals(groupCallActivity4.call.shadyJoinParticipants.get(i2 - groupCallActivity4.listAdapter.shadyJoinStartRow));
                    }
                    if (i2 >= GroupCallActivity.this.listAdapter.shadyLeftStartRow && i2 < GroupCallActivity.this.listAdapter.shadyLeftEndRow && i >= GroupCallActivity.this.oldShadyLeftStartRow && i < GroupCallActivity.this.oldShadyLeftEndRow) {
                        Long l3 = (Long) GroupCallActivity.this.oldShadyLeft.get(i - GroupCallActivity.this.oldShadyLeftStartRow);
                        GroupCallActivity groupCallActivity5 = GroupCallActivity.this;
                        return l3.equals(groupCallActivity5.call.shadyLeftParticipants.get(i2 - groupCallActivity5.listAdapter.shadyLeftStartRow));
                    }
                }
                return false;
            }
        };
        setOpenNoDelay(true);
        this.accountInstance = accountInstance;
        this.call = call;
        this.schedulePeer = inputPeer;
        this.currentChat = chat;
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
            public void setAlpha(int i) {
                super.setAlpha(i);
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
        this.listAdapter = new ListAdapter(activity);
        final RecordStatusDrawable recordStatusDrawable = new RecordStatusDrawable(true);
        int i = Theme.key_voipgroup_speakingText;
        recordStatusDrawable.setColor(Theme.getColor(i));
        recordStatusDrawable.start();
        ActionBar actionBar = new ActionBar(activity) {
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
        this.actionBar.getAdditionalSubtitleTextView().setTextColor(Theme.getColor(i));
        ActionBar actionBar2 = this.actionBar;
        int i2 = Theme.key_voipgroup_lastSeenTextUnscrolled;
        actionBar2.setSubtitleColor(Theme.getColor(i2));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setOccupyStatusBar(false);
        this.actionBar.setAllowOverlayTitle(false);
        ActionBar actionBar3 = this.actionBar;
        int i3 = Theme.key_voipgroup_actionBarItems;
        actionBar3.setItemsColor(Theme.getColor(i3), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarActionModeDefaultSelector), false);
        this.actionBar.setTitleColor(Theme.getColor(i3));
        this.actionBar.setSubtitleColor(Theme.getColor(i2));
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass7(activity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.selfPeer = tL_peerUser;
            tL_peerUser.user_id = this.accountInstance.getUserConfig().getClientUserId();
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
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.conferenceEmojiUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didEndCall);
        this.shadowDrawable = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        int i4 = R.raw.voip_filled;
        this.bigMicDrawable = new RLottieDrawable(i4, "" + i4, AndroidUtilities.dp(72.0f), AndroidUtilities.dp(72.0f), true, null);
        int i5 = R.raw.hand_2;
        this.handDrawables = new RLottieDrawable(i5, "" + i5, AndroidUtilities.dp(72.0f), AndroidUtilities.dp(72.0f), true, null);
        FrameLayout frameLayout = new FrameLayout(activity) {
            private int lastSize;
            boolean localHasVideo;
            private boolean updateRenderers;
            boolean wasLayout;
            private boolean ignoreLayout = false;
            private RectF rect = new RectF();
            HashMap listCells = new HashMap();

            @Override
            protected void onMeasure(int i6, int i7) {
                int dp;
                int i8;
                int size = View.MeasureSpec.getSize(i7);
                this.ignoreLayout = true;
                boolean z2 = View.MeasureSpec.getSize(i6) > size && !AndroidUtilities.isTablet();
                GroupCallActivity.this.renderersContainer.listWidth = View.MeasureSpec.getSize(i6);
                boolean z3 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i6) > size && !GroupCallActivity.this.isRtmpStream();
                if (GroupCallActivity.isLandscapeMode != z2) {
                    GroupCallActivity.isLandscapeMode = z2;
                    int measuredWidth = GroupCallActivity.this.muteButton.getMeasuredWidth();
                    if (measuredWidth == 0) {
                        measuredWidth = GroupCallActivity.this.muteButton.getLayoutParams().width;
                    }
                    float dp2 = AndroidUtilities.dp(52.0f) / (measuredWidth - AndroidUtilities.dp(8.0f));
                    if (!GroupCallActivity.isLandscapeMode && !GroupCallActivity.this.isRtmpStream() && !GroupCallActivity.this.renderersContainer.inFullscreenMode) {
                        dp2 = 1.0f;
                    }
                    boolean z4 = GroupCallActivity.this.renderersContainer.inFullscreenMode && (AndroidUtilities.isTablet() || GroupCallActivity.isLandscapeMode == GroupCallActivity.this.isRtmpLandscapeMode());
                    ImageView imageView = z4 ? GroupCallActivity.this.minimizeButton : GroupCallActivity.this.expandButton;
                    ImageView imageView2 = z4 ? GroupCallActivity.this.expandButton : GroupCallActivity.this.minimizeButton;
                    imageView.setAlpha(1.0f);
                    imageView.setScaleX(dp2);
                    imageView.setScaleY(dp2);
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
                    if (GroupCallActivity.this.isRtmpLandscapeMode() == z2 && GroupCallActivity.this.isRtmpStream() && !GroupCallActivity.this.renderersContainer.inFullscreenMode && !GroupCallActivity.this.call.visibleVideoParticipants.isEmpty()) {
                        GroupCallActivity groupCallActivity = GroupCallActivity.this;
                        groupCallActivity.fullscreenFor(groupCallActivity.call.visibleVideoParticipants.get(0));
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
                    GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                    groupCallActivity2.fullscreenAdapter.update(false, groupCallActivity2.tabletVideoGridView);
                    if (GroupCallActivity.isTabletMode) {
                        GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                        groupCallActivity3.tabletGridAdapter.update(false, groupCallActivity3.tabletVideoGridView);
                    }
                    GroupCallActivity.this.tabletVideoGridView.setVisibility(GroupCallActivity.isTabletMode ? 0 : 8);
                    GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                    groupCallActivity4.tabletGridAdapter.setVisibility(groupCallActivity4.tabletVideoGridView, GroupCallActivity.isTabletMode && !groupCallActivity4.renderersContainer.inFullscreenMode, true);
                    GroupCallActivity groupCallActivity5 = GroupCallActivity.this;
                    groupCallActivity5.listViewVideoVisibility = !GroupCallActivity.isTabletMode || groupCallActivity5.renderersContainer.inFullscreenMode;
                    boolean z5 = !GroupCallActivity.isTabletMode && GroupCallActivity.this.renderersContainer.inFullscreenMode;
                    GroupCallActivity groupCallActivity6 = GroupCallActivity.this;
                    groupCallActivity6.fullscreenAdapter.setVisibility(groupCallActivity6.fullscreenUsersListView, z5);
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
                    for (int i9 = 0; i9 < GroupCallActivity.this.attachedRenderersTmp.size(); i9++) {
                        ((GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderersTmp.get(i9)).updateAttachState(true);
                    }
                }
                setPadding(((BottomSheet) GroupCallActivity.this).backgroundPaddingLeft, GroupCallActivity.this.getStatusBarHeight(), ((BottomSheet) GroupCallActivity.this).backgroundPaddingLeft, 0);
                int paddingTop = size - getPaddingTop();
                if (GroupCallActivity.this.isRtmpStream()) {
                    dp = AndroidUtilities.dp(72.0f);
                } else {
                    dp = AndroidUtilities.dp(245.0f);
                }
                int i10 = paddingTop - dp;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) GroupCallActivity.this.renderersContainer.getLayoutParams();
                if (GroupCallActivity.isTabletMode) {
                    layoutParams.topMargin = ActionBar.getCurrentActionBarHeight();
                } else {
                    layoutParams.topMargin = 0;
                }
                for (int i11 = 0; i11 < 2; i11++) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) GroupCallActivity.this.undoView[i11].getLayoutParams();
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
                int dp3 = AndroidUtilities.dp(GroupCallActivity.this.isRtmpStream() ? 100.0f : 150.0f);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) GroupCallActivity.this.listView.getLayoutParams();
                if (GroupCallActivity.isTabletMode) {
                    layoutParams3.gravity = GroupCallActivity.this.hasVideo ? 5 : 1;
                    layoutParams3.width = AndroidUtilities.dp(320.0f);
                    int dp4 = AndroidUtilities.dp(4.0f);
                    layoutParams3.leftMargin = dp4;
                    layoutParams3.rightMargin = dp4;
                    layoutParams3.bottomMargin = dp3;
                    layoutParams3.topMargin = ActionBar.getCurrentActionBarHeight();
                    i8 = AndroidUtilities.dp(60.0f);
                } else if (GroupCallActivity.isLandscapeMode) {
                    layoutParams3.gravity = 51;
                    layoutParams3.width = -1;
                    layoutParams3.topMargin = ActionBar.getCurrentActionBarHeight();
                    layoutParams3.bottomMargin = AndroidUtilities.dp(14.0f);
                    layoutParams3.rightMargin = AndroidUtilities.dp(90.0f);
                    layoutParams3.leftMargin = AndroidUtilities.dp(14.0f);
                    i8 = 0;
                } else {
                    layoutParams3.gravity = 51;
                    layoutParams3.width = -1;
                    int dp5 = AndroidUtilities.dp(60.0f);
                    layoutParams3.bottomMargin = dp3;
                    layoutParams3.topMargin = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.dp(14.0f);
                    int dp6 = AndroidUtilities.dp(14.0f);
                    layoutParams3.leftMargin = dp6;
                    layoutParams3.rightMargin = dp6;
                    i8 = dp5;
                }
                if (!GroupCallActivity.isLandscapeMode || GroupCallActivity.isTabletMode) {
                    GroupCallActivity.this.buttonsBackgroundGradientView.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) GroupCallActivity.this.buttonsBackgroundGradientView.getLayoutParams();
                    layoutParams4.bottomMargin = dp3;
                    if (GroupCallActivity.isTabletMode) {
                        layoutParams4.gravity = GroupCallActivity.this.hasVideo ? 85 : 81;
                        layoutParams4.width = AndroidUtilities.dp(328.0f);
                    } else {
                        layoutParams4.width = -1;
                    }
                    GroupCallActivity.this.buttonsBackgroundGradientView2.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) GroupCallActivity.this.buttonsBackgroundGradientView2.getLayoutParams();
                    layoutParams5.height = dp3;
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
                int max = GroupCallActivity.isTabletMode ? 0 : Math.max(0, (i10 - Math.max(AndroidUtilities.dp(259.0f), (i10 / 5) * 3)) + AndroidUtilities.dp(8.0f));
                if (GroupCallActivity.this.listView.getPaddingTop() != max || GroupCallActivity.this.listView.getPaddingBottom() != i8) {
                    GroupCallActivity.this.listView.setPadding(0, max, 0, i8);
                }
                if (GroupCallActivity.this.watchersView != null) {
                    FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) GroupCallActivity.this.watchersView.getLayoutParams();
                    GroupCallGridCell findGroupCallGridCell = GroupCallActivity.this.findGroupCallGridCell();
                    if (findGroupCallGridCell != null) {
                        int top = (GroupCallActivity.this.buttonsContainer.getTop() + (GroupCallActivity.this.buttonsContainer.getMeasuredHeight() / 2)) - (GroupCallActivity.this.leaveButton.getMeasuredHeight() / 2);
                        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + max + findGroupCallGridCell.getMeasuredHeight();
                        layoutParams8.topMargin = (currentActionBarHeight + ((top - currentActionBarHeight) / 2)) - AndroidUtilities.dp(32.0f);
                        layoutParams8.height = AndroidUtilities.dp(70.0f);
                    }
                }
                if (GroupCallActivity.this.textureLightningView != null) {
                    FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) GroupCallActivity.this.textureLightningView.getLayoutParams();
                    GroupCallGridCell findGroupCallGridCell2 = GroupCallActivity.this.findGroupCallGridCell();
                    if (findGroupCallGridCell2 != null) {
                        layoutParams9.height = findGroupCallGridCell2.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                        layoutParams9.width = findGroupCallGridCell2.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                        int dp7 = AndroidUtilities.dp(16.0f);
                        layoutParams9.leftMargin = dp7;
                        layoutParams9.rightMargin = dp7;
                    }
                }
                if (GroupCallActivity.this.scheduleStartAtTextView != null) {
                    int dp8 = max + (((i10 - max) + AndroidUtilities.dp(60.0f)) / 2);
                    FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) GroupCallActivity.this.scheduleStartInTextView.getLayoutParams();
                    layoutParams10.topMargin = dp8 - AndroidUtilities.dp(30.0f);
                    FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) GroupCallActivity.this.scheduleStartAtTextView.getLayoutParams();
                    layoutParams11.topMargin = AndroidUtilities.dp(80.0f) + dp8;
                    FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) GroupCallActivity.this.scheduleTimeTextView.getLayoutParams();
                    if (layoutParams10.topMargin < ActionBar.getCurrentActionBarHeight() || layoutParams11.topMargin + AndroidUtilities.dp(20.0f) > size - AndroidUtilities.dp(231.0f)) {
                        GroupCallActivity.this.scheduleStartInTextView.setVisibility(4);
                        GroupCallActivity.this.scheduleStartAtTextView.setVisibility(4);
                        layoutParams12.topMargin = dp8 - AndroidUtilities.dp(20.0f);
                    } else {
                        GroupCallActivity.this.scheduleStartInTextView.setVisibility(0);
                        GroupCallActivity.this.scheduleStartAtTextView.setVisibility(0);
                        layoutParams12.topMargin = dp8;
                    }
                }
                for (int i12 = 0; i12 < GroupCallActivity.this.attachedRenderers.size(); i12++) {
                    ((GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderers.get(i12)).setFullscreenMode(GroupCallActivity.this.renderersContainer.inFullscreenMode, true);
                }
                this.ignoreLayout = false;
                super.onMeasure(i6, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
                if (measuredHeight != this.lastSize) {
                    this.lastSize = measuredHeight;
                    GroupCallActivity.this.dismissAvatarPreview(false);
                }
                GroupCallActivity.this.cellFlickerDrawable.setParentWidth(getMeasuredWidth());
            }

            @Override
            protected void onLayout(boolean z2, int i6, int i7, int i8, int i9) {
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
                super.onLayout(z2, i6, i7, i8, i9);
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
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                GroupCallActivity.this.updateTopBulletinY();
            }

            @Override
            protected void onDraw(Canvas canvas) {
                float f;
                int dp = AndroidUtilities.dp(74.0f);
                float f2 = GroupCallActivity.this.scrollOffsetY - dp;
                int measuredHeight = getMeasuredHeight() + AndroidUtilities.dp(15.0f) + ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop;
                if (((BottomSheet) GroupCallActivity.this).backgroundPaddingTop + f2 < ActionBar.getCurrentActionBarHeight()) {
                    float min = Math.min(1.0f, ((ActionBar.getCurrentActionBarHeight() - f2) - ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop) / ((dp - ((BottomSheet) GroupCallActivity.this).backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
                    int currentActionBarHeight = (int) ((ActionBar.getCurrentActionBarHeight() - r0) * min);
                    f2 -= currentActionBarHeight;
                    measuredHeight += currentActionBarHeight;
                    f = 1.0f - min;
                } else {
                    f = 1.0f;
                }
                float paddingTop = f2 + getPaddingTop();
                GroupCallActivity.this.updateTopBulletinY();
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
                if (GroupCallActivity.this.isRtmpStream() && LiteMode.isEnabled(512)) {
                    if (GroupCallActivity.this.renderersContainer.progressToFullscreenMode < 0.15d) {
                        if (GroupCallActivity.this.needTextureLightning) {
                            return;
                        }
                        GroupCallActivity.this.needTextureLightning = true;
                        GroupCallActivity.this.runUpdateTextureLightningRunnable();
                        return;
                    }
                    if (GroupCallActivity.this.needTextureLightning) {
                        GroupCallActivity.this.needTextureLightning = false;
                        AndroidUtilities.cancelRunOnUIThread(GroupCallActivity.this.updateTextureLightningRunnable);
                    }
                }
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                float f;
                float f2;
                float f3;
                View view;
                GroupCallUserCell groupCallUserCell;
                float y;
                float left;
                GroupCallUserCell groupCallUserCell2;
                Path path;
                float[] fArr;
                GroupCallUserCell groupCallUserCell3;
                float f4;
                float left2;
                float f5;
                float f6;
                float f7;
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
                for (int i6 = 0; i6 < GroupCallActivity.this.listView.getChildCount(); i6++) {
                    View childAt = GroupCallActivity.this.listView.getChildAt(i6);
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
                        for (int i7 = 0; i7 < GroupCallActivity.this.listView.getChildCount(); i7++) {
                            View childAt2 = GroupCallActivity.this.listView.getChildAt(i7);
                            if (childAt2.isAttachedToWindow()) {
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
                        }
                        for (int i8 = 0; i8 < GroupCallActivity.this.fullscreenUsersListView.getChildCount(); i8++) {
                            GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell5 = (GroupCallFullscreenAdapter.GroupCallUserCell) GroupCallActivity.this.fullscreenUsersListView.getChildAt(i8);
                            View view2 = (View) this.listCells.get(groupCallUserCell5.getVideoParticipant());
                            if (view2 == null) {
                                view2 = (View) this.listCells.get(groupCallUserCell5.getParticipant());
                            }
                            float f8 = GroupCallActivity.this.renderersContainer.progressToFullscreenMode;
                            if (!GroupCallActivity.this.fullscreenListItemAnimator.isRunning()) {
                                groupCallUserCell5.setAlpha(1.0f);
                            }
                            if (view2 != null) {
                                if (!(view2 instanceof GroupCallGridCell)) {
                                    left2 = ((r3.getLeft() + GroupCallActivity.this.listView.getX()) - GroupCallActivity.this.renderersContainer.getLeft()) + r3.getAvatarImageView().getLeft() + (r3.getAvatarImageView().getMeasuredWidth() >> 1);
                                    float top = ((r3.getTop() + GroupCallActivity.this.listView.getY()) - GroupCallActivity.this.renderersContainer.getTop()) + r3.getAvatarImageView().getTop() + (r3.getAvatarImageView().getMeasuredHeight() >> 1);
                                    float left3 = groupCallUserCell5.getLeft() + GroupCallActivity.this.fullscreenUsersListView.getX() + (groupCallUserCell5.getMeasuredWidth() >> 1);
                                    float top2 = groupCallUserCell5.getTop() + GroupCallActivity.this.fullscreenUsersListView.getY() + (groupCallUserCell5.getMeasuredHeight() >> 1);
                                    ((GroupCallUserCell) view2).setDrawAvatar(false);
                                    f5 = top;
                                    f6 = left3;
                                    f7 = top2;
                                } else {
                                    GroupCallGridCell groupCallGridCell2 = (GroupCallGridCell) view2;
                                    left2 = (groupCallGridCell2.getLeft() + GroupCallActivity.this.listView.getX()) - GroupCallActivity.this.renderersContainer.getLeft();
                                    f5 = (groupCallGridCell2.getTop() + GroupCallActivity.this.listView.getY()) - GroupCallActivity.this.renderersContainer.getTop();
                                    f6 = groupCallUserCell5.getLeft() + GroupCallActivity.this.fullscreenUsersListView.getX();
                                    f7 = groupCallUserCell5.getTop() + GroupCallActivity.this.fullscreenUsersListView.getY();
                                }
                                float f9 = left2 - f6;
                                float f10 = 1.0f - f8;
                                groupCallUserCell5.setTranslationX(f9 * f10);
                                groupCallUserCell5.setTranslationY((f5 - f7) * f10);
                                groupCallUserCell5.setScaleX(1.0f);
                                groupCallUserCell5.setScaleY(1.0f);
                                groupCallUserCell5.setProgressToFullscreen(f8);
                            } else {
                                groupCallUserCell5.setScaleX(1.0f);
                                groupCallUserCell5.setScaleY(1.0f);
                                groupCallUserCell5.setTranslationX(0.0f);
                                groupCallUserCell5.setTranslationY(0.0f);
                                groupCallUserCell5.setProgressToFullscreen(1.0f);
                                if (groupCallUserCell5.getRenderer() == null) {
                                    groupCallUserCell5.setAlpha(f8);
                                }
                            }
                        }
                    }
                } else {
                    for (int i9 = 0; i9 < GroupCallActivity.this.fullscreenUsersListView.getChildCount(); i9++) {
                        ((GroupCallFullscreenAdapter.GroupCallUserCell) GroupCallActivity.this.fullscreenUsersListView.getChildAt(i9)).setProgressToFullscreen(1.0f);
                    }
                }
                for (int i10 = 0; i10 < GroupCallActivity.this.attachedRenderers.size(); i10++) {
                    GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderers.get(i10);
                    RecyclerListView recyclerListView = GroupCallActivity.this.listView;
                    GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                    groupCallMiniTextureView.updatePosition(recyclerListView, groupCallActivity3.tabletVideoGridView, groupCallActivity3.fullscreenUsersListView, groupCallActivity3.renderersContainer);
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
                if (GroupCallActivity.this.watchersView != null) {
                    GroupCallActivity.this.watchersView.setAlpha(1.0f - GroupCallActivity.this.renderersContainer.progressToFullscreenMode);
                    GroupCallActivity.this.watchersView.setTranslationY(GroupCallActivity.this.renderersContainer.progressToFullscreenMode * AndroidUtilities.dp(64.0f));
                }
                super.dispatchDraw(canvas);
                GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                if (groupCallActivity4.drawingForBlur) {
                    return;
                }
                float f11 = 255.0f;
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
                        if (GroupCallActivity.this.hasScrimAnchorView) {
                            int i11 = 0;
                            while (true) {
                                if (i11 >= childCount) {
                                    groupCallUserCell = null;
                                    break;
                                } else {
                                    if (GroupCallActivity.this.listView.getChildAt(i11) == GroupCallActivity.this.scrimView) {
                                        groupCallUserCell = GroupCallActivity.this.scrimView;
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        } else {
                            groupCallUserCell = GroupCallActivity.this.scrimView;
                        }
                        GroupCallUserCell groupCallUserCell6 = groupCallUserCell;
                        if (groupCallUserCell6 != null && y2 < y3) {
                            canvas.save();
                            if (GroupCallActivity.this.scrimFullscreenView == null) {
                                canvas.clipRect(0.0f, (1.0f - GroupCallActivity.this.progressToAvatarPreview) * y2, getMeasuredWidth(), ((1.0f - GroupCallActivity.this.progressToAvatarPreview) * y3) + (getMeasuredHeight() * GroupCallActivity.this.progressToAvatarPreview));
                            }
                            if (!GroupCallActivity.this.hasScrimAnchorView) {
                                y = GroupCallActivity.this.avatarPreviewContainer.getTop() + GroupCallActivity.this.avatarPreviewContainer.getMeasuredWidth();
                                left = GroupCallActivity.this.avatarPreviewContainer.getLeft();
                            } else {
                                y = ((GroupCallActivity.this.listView.getY() + groupCallUserCell6.getY()) * (1.0f - GroupCallActivity.this.progressToAvatarPreview)) + ((GroupCallActivity.this.avatarPreviewContainer.getTop() + GroupCallActivity.this.avatarPreviewContainer.getMeasuredWidth()) * GroupCallActivity.this.progressToAvatarPreview);
                                left = ((GroupCallActivity.this.listView.getLeft() + groupCallUserCell6.getX()) * (1.0f - GroupCallActivity.this.progressToAvatarPreview)) + (GroupCallActivity.this.avatarPreviewContainer.getLeft() * GroupCallActivity.this.progressToAvatarPreview);
                            }
                            float f12 = y;
                            canvas.translate(left, f12);
                            if (!GroupCallActivity.this.hasScrimAnchorView) {
                                groupCallUserCell2 = groupCallUserCell6;
                                path = path2;
                                fArr = fArr2;
                                canvas.saveLayerAlpha(0.0f, 0.0f, groupCallUserCell6.getMeasuredWidth(), groupCallUserCell6.getClipHeight(), (int) (GroupCallActivity.this.progressToAvatarPreview * 255.0f), 31);
                            } else {
                                groupCallUserCell2 = groupCallUserCell6;
                                path = path2;
                                fArr = fArr2;
                                canvas.save();
                            }
                            float measuredHeight = (int) (groupCallUserCell2.getMeasuredHeight() + ((groupCallUserCell2.getClipHeight() - groupCallUserCell2.getMeasuredHeight()) * (1.0f - CubicBezierInterpolator.EASE_OUT.getInterpolation(1.0f - GroupCallActivity.this.progressToAvatarPreview))));
                            this.rect.set(0.0f, 0.0f, groupCallUserCell2.getMeasuredWidth(), measuredHeight);
                            if (GroupCallActivity.this.hasScrimAnchorView) {
                                f4 = GroupCallActivity.this.progressToAvatarPreview;
                                groupCallUserCell3 = groupCallUserCell2;
                            } else {
                                groupCallUserCell3 = groupCallUserCell2;
                                f4 = 1.0f;
                            }
                            groupCallUserCell3.setProgressToAvatarPreview(f4);
                            for (int i12 = 0; i12 < 4; i12++) {
                                fArr[i12] = AndroidUtilities.dp(13.0f) * (1.0f - GroupCallActivity.this.progressToAvatarPreview);
                                fArr[i12 + 4] = AndroidUtilities.dp(13.0f);
                            }
                            path.reset();
                            Path path3 = path;
                            path3.addRoundRect(this.rect, fArr, Path.Direction.CW);
                            path3.close();
                            canvas.drawPath(path3, GroupCallActivity.this.listViewBackgroundPaint);
                            groupCallUserCell3.draw(canvas);
                            canvas.restore();
                            canvas.restore();
                            if (GroupCallActivity.this.scrimPopupLayout != null) {
                                float f13 = f12 + measuredHeight;
                                float measuredWidth = (getMeasuredWidth() - GroupCallActivity.this.scrimPopupLayout.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                                if (GroupCallActivity.this.progressToAvatarPreview != 1.0f) {
                                    canvas.saveLayerAlpha(measuredWidth, f13, measuredWidth + GroupCallActivity.this.scrimPopupLayout.getMeasuredWidth(), f13 + GroupCallActivity.this.scrimPopupLayout.getMeasuredHeight(), (int) (GroupCallActivity.this.progressToAvatarPreview * 255.0f), 31);
                                } else {
                                    canvas.save();
                                }
                                GroupCallActivity.this.scrimPopupLayout.setTranslationX(measuredWidth - GroupCallActivity.this.scrimPopupLayout.getLeft());
                                GroupCallActivity.this.scrimPopupLayout.setTranslationY(f13 - GroupCallActivity.this.scrimPopupLayout.getTop());
                                float f14 = (GroupCallActivity.this.progressToAvatarPreview * 0.2f) + 0.8f;
                                canvas.scale(f14, f14, (GroupCallActivity.this.scrimPopupLayout.getMeasuredWidth() / 2.0f) + measuredWidth, f13);
                                canvas.translate(measuredWidth, f13);
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
                    for (int i13 = 0; i13 < 2; i13++) {
                        if (GroupCallActivity.this.undoView[i13].getVisibility() == 0) {
                            canvas.save();
                            canvas.translate(GroupCallActivity.this.undoView[1].getX(), GroupCallActivity.this.undoView[1].getY());
                            GroupCallActivity.this.undoView[1].draw(canvas);
                            canvas.restore();
                        }
                    }
                    canvas.restore();
                    return;
                }
                if (GroupCallActivity.this.scrimView != null) {
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), GroupCallActivity.this.scrimPaint);
                    float y4 = GroupCallActivity.this.listView.getY();
                    GroupCallActivity.this.listView.getY();
                    GroupCallActivity.this.listView.getMeasuredHeight();
                    if (GroupCallActivity.this.hasScrimAnchorView) {
                        int childCount2 = GroupCallActivity.this.listView.getChildCount();
                        int i14 = 0;
                        while (i14 < childCount2) {
                            View childAt3 = GroupCallActivity.this.listView.getChildAt(i14);
                            if (childAt3 == GroupCallActivity.this.scrimView) {
                                float max = Math.max(GroupCallActivity.this.listView.getLeft(), GroupCallActivity.this.listView.getLeft() + childAt3.getX());
                                float max2 = Math.max(y4, GroupCallActivity.this.listView.getY() + childAt3.getY());
                                float min = Math.min(GroupCallActivity.this.listView.getRight(), GroupCallActivity.this.listView.getLeft() + childAt3.getX() + childAt3.getMeasuredWidth());
                                float min2 = Math.min(GroupCallActivity.this.listView.getY() + GroupCallActivity.this.listView.getMeasuredHeight(), GroupCallActivity.this.listView.getY() + childAt3.getY() + GroupCallActivity.this.scrimView.getClipHeight());
                                if (max2 < min2) {
                                    if (childAt3.getAlpha() != 1.0f) {
                                        int alpha = (int) (childAt3.getAlpha() * f11);
                                        f = min;
                                        f2 = max2;
                                        f3 = max;
                                        view = childAt3;
                                        canvas.saveLayerAlpha(max, max2, min, min2, alpha, 31);
                                    } else {
                                        f = min;
                                        f2 = max2;
                                        f3 = max;
                                        view = childAt3;
                                        canvas.save();
                                    }
                                    canvas.clipRect(f3, f2, f, getMeasuredHeight());
                                    canvas.translate(GroupCallActivity.this.listView.getLeft() + view.getX(), GroupCallActivity.this.listView.getY() + view.getY());
                                    this.rect.set(0.0f, 0.0f, view.getMeasuredWidth(), (int) (GroupCallActivity.this.scrimView.getMeasuredHeight() + ((GroupCallActivity.this.scrimView.getClipHeight() - GroupCallActivity.this.scrimView.getMeasuredHeight()) * (1.0f - CubicBezierInterpolator.EASE_OUT.getInterpolation(1.0f - r1)))));
                                    GroupCallActivity.this.scrimView.setAboutVisibleProgress(GroupCallActivity.this.listViewBackgroundPaint.getColor(), GroupCallActivity.this.scrimPaint.getAlpha() / 100.0f);
                                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), GroupCallActivity.this.listViewBackgroundPaint);
                                    view.draw(canvas);
                                    canvas.restore();
                                    i14++;
                                    f11 = 255.0f;
                                }
                            }
                            i14++;
                            f11 = 255.0f;
                        }
                        return;
                    }
                    if (GroupCallActivity.this.scrimFullscreenView == null) {
                        if (GroupCallActivity.this.scrimRenderer == null || !GroupCallActivity.this.scrimRenderer.isAttached()) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(GroupCallActivity.this.scrimRenderer.getX() + GroupCallActivity.this.renderersContainer.getX(), GroupCallActivity.this.scrimRenderer.getY() + GroupCallActivity.this.renderersContainer.getY());
                        GroupCallActivity.this.scrimRenderer.draw(canvas);
                        canvas.restore();
                        return;
                    }
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

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (!GroupCallActivity.isTabletMode && GroupCallActivity.this.renderersContainer.progressToFullscreenMode == 1.0f && (view == GroupCallActivity.this.actionBar || view == GroupCallActivity.this.actionBarShadow || view == GroupCallActivity.this.actionBarBackground || view == GroupCallActivity.this.titleTextView || view == GroupCallActivity.this.menuItemsContainer || view == GroupCallActivity.this.textureLightningView)) {
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
            public boolean onKeyDown(int i6, KeyEvent keyEvent) {
                if (GroupCallActivity.this.scrimView != null && i6 == 4) {
                    GroupCallActivity.this.dismissAvatarPreview(true);
                    return true;
                }
                return super.onKeyDown(i6, keyEvent);
            }
        };
        this.containerView = frameLayout;
        frameLayout.setFocusable(true);
        this.containerView.setFocusableInTouchMode(true);
        this.containerView.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i6 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i6, 0, i6, 0);
        this.containerView.setKeepScreenOn(true);
        this.containerView.setClipChildren(false);
        if (inputPeer != null) {
            SimpleTextView simpleTextView = new SimpleTextView(activity);
            this.scheduleStartInTextView = simpleTextView;
            simpleTextView.setGravity(17);
            this.scheduleStartInTextView.setTextColor(-1);
            this.scheduleStartInTextView.setTypeface(AndroidUtilities.bold());
            this.scheduleStartInTextView.setTextSize(18);
            this.scheduleStartInTextView.setText(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(this.scheduleStartInTextView, LayoutHelper.createFrame(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
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
                public boolean createLayout(int i7) {
                    boolean createLayout = super.createLayout(i7);
                    int textWidth = getTextWidth();
                    if (textWidth != this.lastTextWidth) {
                        float f = textWidth;
                        this.gradientWidth = 1.3f * f;
                        float textHeight = getTextHeight();
                        float f2 = f * 2.0f;
                        int color = Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient);
                        int color2 = Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient3);
                        int i8 = Theme.key_voipgroup_mutedByAdminGradient2;
                        this.linearGradient = new LinearGradient(0.0f, textHeight, f2, 0.0f, new int[]{color, color2, Theme.getColor(i8), Theme.getColor(i8)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
                        getPaint().setShader(this.linearGradient);
                        this.lastTextWidth = textWidth;
                    }
                    return createLayout;
                }

                @Override
                public void onDraw(android.graphics.Canvas r9) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.AnonymousClass9.onDraw(android.graphics.Canvas):void");
                }
            };
            this.scheduleTimeTextView = simpleTextView2;
            simpleTextView2.setGravity(17);
            this.scheduleTimeTextView.setTextColor(-1);
            this.scheduleTimeTextView.setTypeface(AndroidUtilities.bold());
            this.scheduleTimeTextView.setTextSize(60);
            this.containerView.addView(this.scheduleTimeTextView, LayoutHelper.createFrame(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            SimpleTextView simpleTextView3 = new SimpleTextView(activity);
            this.scheduleStartAtTextView = simpleTextView3;
            simpleTextView3.setGravity(17);
            this.scheduleStartAtTextView.setTextColor(-1);
            this.scheduleStartAtTextView.setTypeface(AndroidUtilities.bold());
            this.scheduleStartAtTextView.setTextSize(18);
            this.containerView.addView(this.scheduleStartAtTextView, LayoutHelper.createFrame(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (isRtmpStream()) {
            LightningView lightningView = new LightningView(activity);
            this.textureLightningView = lightningView;
            this.containerView.addView(lightningView, LayoutHelper.createFrame(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        RecyclerListView recyclerListView = new RecyclerListView(activity) {
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
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.AnonymousClass10.dispatchDraw(android.graphics.Canvas):void");
            }

            @Override
            public void setVisibility(int i7) {
                if (getVisibility() != i7) {
                    for (int i8 = 0; i8 < getChildCount(); i8++) {
                        View childAt = getChildAt(i8);
                        if (childAt instanceof GroupCallGridCell) {
                            GroupCallActivity.this.attachRenderer((GroupCallGridCell) childAt, childAt.isAttachedToWindow() && i7 == 0);
                        }
                    }
                }
                super.setVisibility(i7);
            }

            @Override
            public void onLayout(boolean z2, int i7, int i8, int i9, int i10) {
                super.onLayout(z2, i7, i8, i9, i10);
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
        final TLRPC.InputPeer inputPeer2 = groupCallPeer;
        this.itemAnimator.setRemoveDuration(350L);
        this.itemAnimator.setAddDuration(350L);
        this.itemAnimator.setMoveDuration(350L);
        this.itemAnimator.setDelayAnimations(false);
        this.listView.setItemAnimator(this.itemAnimator);
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i7, int i8) {
                GroupCallActivity groupCallActivity;
                ChatObject.Call call2;
                if (GroupCallActivity.this.listView.getChildCount() <= 0 || (call2 = (groupCallActivity = GroupCallActivity.this).call) == null) {
                    return;
                }
                if (!call2.loadingMembers && !call2.membersLoadEndReached && groupCallActivity.layoutManager.findLastVisibleItemPosition() > GroupCallActivity.this.listAdapter.getItemCount() - 5) {
                    GroupCallActivity.this.call.loadMembers(false);
                }
                GroupCallActivity.this.updateLayout(true);
                if (GroupCallActivity.this.textureLightningView != null) {
                    GroupCallActivity.this.textureLightningView.invalidate();
                }
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i7) {
                if (i7 != 0) {
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
            public int getSpanSize(int i7) {
                int i8 = GroupCallActivity.isLandscapeMode ? 6 : 2;
                if (GroupCallActivity.isTabletMode || i7 < GroupCallActivity.this.listAdapter.usersVideoGridStartRow || i7 >= GroupCallActivity.this.listAdapter.usersVideoGridEndRow) {
                    return i8;
                }
                int i9 = GroupCallActivity.this.listAdapter.usersVideoGridEndRow - GroupCallActivity.this.listAdapter.usersVideoGridStartRow;
                int i10 = (i7 != GroupCallActivity.this.listAdapter.usersVideoGridEndRow - 1 || (!GroupCallActivity.isLandscapeMode && i9 % 2 == 0)) ? 1 : 2;
                if (!GroupCallActivity.isLandscapeMode) {
                    return i10;
                }
                if (i9 == 1) {
                    return 6;
                }
                return i9 == 2 ? 3 : 2;
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
                    int i7 = childAdapterPosition - GroupCallActivity.this.listAdapter.usersVideoGridStartRow;
                    int i8 = GroupCallActivity.isLandscapeMode ? 6 : 2;
                    int i9 = i7 % i8;
                    if (i9 == 0) {
                        rect.right = AndroidUtilities.dp(2.0f);
                    } else if (i9 == i8 - 1) {
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
            public boolean hasDoubleTap(View view, int i7) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i7);
            }

            @Override
            public void onDoubleTap(View view, int i7, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i7, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i7, float f, float f2) {
                GroupCallActivity.this.lambda$new$25(activity, call, view, i7, f, f2);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i7) {
                boolean lambda$new$26;
                lambda$new$26 = GroupCallActivity.this.lambda$new$26(view, i7);
                return lambda$new$26;
            }
        });
        if (isRtmpStream()) {
            WatchersView watchersView = new WatchersView(getContext());
            this.watchersView = watchersView;
            this.containerView.addView(watchersView, LayoutHelper.createFrame(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        RecyclerListView recyclerListView3 = new RecyclerListView(activity);
        this.tabletVideoGridView = recyclerListView3;
        this.containerView.addView(recyclerListView3, LayoutHelper.createFrame(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        RecyclerListView recyclerListView4 = this.tabletVideoGridView;
        GroupCallTabletGridAdapter groupCallTabletGridAdapter = new GroupCallTabletGridAdapter(call, this.currentAccount, this);
        this.tabletGridAdapter = groupCallTabletGridAdapter;
        recyclerListView4.setAdapter(groupCallTabletGridAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(activity, 6, 1, false);
        this.tabletVideoGridView.setLayoutManager(gridLayoutManager);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i7) {
                return GroupCallActivity.this.tabletGridAdapter.getSpanCount(i7);
            }
        });
        this.tabletVideoGridView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i7) {
                GroupCallActivity.this.lambda$new$27(view, i7);
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
            public void onScrolled(RecyclerView recyclerView, int i7, int i8) {
                super.onScrolled(recyclerView, i7, i8);
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }
        });
        this.tabletGridAdapter.setVisibility(this.tabletVideoGridView, false, false);
        this.tabletVideoGridView.setVisibility(8);
        this.buttonsContainer = new AnonymousClass18(activity);
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
        int i7 = Theme.key_voipgroup_unmuteButton;
        paint2.setColor(ColorUtils.setAlphaComponent(Theme.getColor(i7), 38));
        blobDrawable2.paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(i7), 76));
        VoIPToggleButton voIPToggleButton = new VoIPToggleButton(activity);
        this.soundButton = voIPToggleButton;
        voIPToggleButton.setCheckable(true);
        this.soundButton.setTextSize(12);
        this.buttonsContainer.addView(this.soundButton, LayoutHelper.createFrame(68, 80.0f));
        this.soundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$28(view);
            }
        });
        VoIPToggleButton voIPToggleButton2 = new VoIPToggleButton(activity);
        this.cameraButton = voIPToggleButton2;
        voIPToggleButton2.setCheckable(true);
        this.cameraButton.setTextSize(12);
        this.cameraButton.showText(false, false);
        this.cameraButton.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        this.cameraButton.setVisibility(8);
        this.buttonsContainer.addView(this.cameraButton, LayoutHelper.createFrame(68, 80.0f));
        VoIPToggleButton voIPToggleButton3 = new VoIPToggleButton(activity);
        this.flipButton = voIPToggleButton3;
        voIPToggleButton3.setCheckable(true);
        this.flipButton.setTextSize(12);
        this.flipButton.showText(false, false);
        RLottieImageView rLottieImageView = new RLottieImageView(activity);
        this.flipButton.addView(rLottieImageView, LayoutHelper.createFrame(32, 32.0f, 0, 18.0f, 10.0f, 18.0f, 0.0f));
        int i8 = R.raw.camera_flip;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i8, "" + i8, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.flipIcon = rLottieDrawable;
        rLottieImageView.setAnimation(rLottieDrawable);
        this.flipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$29(view);
            }
        });
        this.flipButton.setVisibility(8);
        this.buttonsContainer.addView(this.flipButton, LayoutHelper.createFrame(68, 80.0f));
        VoIPToggleButton voIPToggleButton4 = new VoIPToggleButton(activity);
        this.speakerButton = voIPToggleButton4;
        voIPToggleButton4.setCheckable(true);
        this.speakerButton.setTextSize(12);
        this.speakerButton.showText(false, false);
        ImageView imageView = new ImageView(activity);
        this.speakerImageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ImageView imageView2 = this.speakerImageView;
        int i9 = R.drawable.filled_sound_on;
        this.speakerIcon = i9;
        imageView2.setImageResource(i9);
        this.speakerImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.speakerImageView.setScaleX(1.11f);
        this.speakerImageView.setScaleY(1.11f);
        ScaleStateListAnimator.apply(this.speakerButton);
        this.speakerButton.addView(this.speakerImageView, LayoutHelper.createFrame(30, 30.0f, 0, 19.0f, 11.0f, 18.0f, 0.0f));
        this.speakerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$31(view);
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.speakerButtonContainer = frameLayout2;
        frameLayout2.setVisibility(8);
        this.speakerButtonContainer.addView(this.speakerButton, LayoutHelper.createFrame(68, 80.0f));
        this.buttonsContainer.addView(this.speakerButtonContainer, LayoutHelper.createFrame(68, 80.0f));
        VoIPToggleButton voIPToggleButton5 = new VoIPToggleButton(activity);
        this.leaveButton = voIPToggleButton5;
        voIPToggleButton5.setDrawBackground(false);
        this.leaveButton.setTextSize(12);
        this.leaveButton.setData(R.drawable.msg_voiceclose, -1, Theme.getColor(Theme.key_voipgroup_leaveButton), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        this.buttonsContainer.addView(this.leaveButton, LayoutHelper.createFrame(68, 80.0f));
        this.leaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$32(activity, view);
            }
        });
        RLottieImageView rLottieImageView2 = new RLottieImageView(activity) {
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
                            try {
                                GroupCallActivity.this.muteButton.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                        GroupCallActivity.this.attachedRenderersTmp.clear();
                        GroupCallActivity.this.attachedRenderersTmp.addAll(GroupCallActivity.this.attachedRenderers);
                        for (int i10 = 0; i10 < GroupCallActivity.this.attachedRenderersTmp.size(); i10++) {
                            ((GroupCallMiniTextureView) GroupCallActivity.this.attachedRenderersTmp.get(i10)).updateAttachState(true);
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
                if (GroupCallActivity.this.muteButtonState == 1) {
                    accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
                }
            }
        };
        this.muteButton = rLottieImageView2;
        rLottieImageView2.setAnimation(this.bigMicDrawable);
        this.muteButton.setScaleType(ImageView.ScaleType.CENTER);
        this.buttonsContainer.addView(this.muteButton, LayoutHelper.createFrame(122, 122, 49));
        this.muteButton.setOnClickListener(new AnonymousClass20());
        int dp = AndroidUtilities.dp(38.0f);
        ImageView imageView3 = new ImageView(activity);
        this.expandButton = imageView3;
        imageView3.setScaleX(0.1f);
        this.expandButton.setScaleY(0.1f);
        this.expandButton.setAlpha(0.0f);
        this.expandButton.setImageResource(R.drawable.voice_expand);
        this.expandButton.setPadding(dp, dp, dp, dp);
        this.buttonsContainer.addView(this.expandButton, LayoutHelper.createFrame(122, 122, 49));
        ImageView imageView4 = new ImageView(activity);
        this.minimizeButton = imageView4;
        imageView4.setScaleX(0.1f);
        this.minimizeButton.setScaleY(0.1f);
        this.minimizeButton.setAlpha(0.0f);
        this.minimizeButton.setImageResource(R.drawable.voice_minimize);
        this.minimizeButton.setPadding(dp, dp, dp, dp);
        this.buttonsContainer.addView(this.minimizeButton, LayoutHelper.createFrame(122, 122, 49));
        if (this.call != null && isRtmpStream() && !this.call.isScheduled()) {
            float dp2 = AndroidUtilities.dp(52.0f) / ((this.expandButton.getMeasuredWidth() == 0 ? this.expandButton.getLayoutParams().width : r1) - AndroidUtilities.dp(8.0f));
            this.expandButton.setAlpha(1.0f);
            this.expandButton.setScaleX(dp2);
            this.expandButton.setScaleY(dp2);
            this.muteButton.setAlpha(0.0f);
        }
        RadialProgressView radialProgressView = new RadialProgressView(activity);
        this.radialProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(110.0f));
        this.radialProgressView.setStrokeWidth(4.0f);
        this.radialProgressView.setProgressColor(Theme.getColor(Theme.key_voipgroup_connectingProgress));
        int i10 = 0;
        for (int i11 = 2; i10 < i11; i11 = 2) {
            this.muteLabel[i10] = new TextView(activity);
            this.muteLabel[i10].setTextColor(Theme.getColor(Theme.key_voipgroup_actionBarItems));
            this.muteLabel[i10].setTextSize(1, 18.0f);
            this.muteLabel[i10].setGravity(1);
            this.buttonsContainer.addView(this.muteLabel[i10], LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 26.0f));
            i10++;
        }
        this.actionBar.setAlpha(0.0f);
        this.actionBar.getBackButton().setScaleX(0.9f);
        this.actionBar.getBackButton().setScaleY(0.9f);
        this.actionBar.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        this.actionBar.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        this.actionBar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        this.actionBar.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        int i12 = Theme.key_voipgroup_actionBarItems;
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(activity, null, 0, Theme.getColor(i12));
        this.otherItem = actionBarMenuItem;
        actionBarMenuItem.setLongClickEnabled(false);
        this.otherItem.setIcon(R.drawable.ic_ab_other);
        this.otherItem.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.otherItem.setSubMenuOpenSide(2);
        this.otherItem.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() {
            @Override
            public final void onItemClick(int i13) {
                GroupCallActivity.this.lambda$new$33(i13);
            }
        });
        ActionBarMenuItem actionBarMenuItem2 = this.otherItem;
        int i13 = Theme.key_voipgroup_actionBarItemsSelector;
        actionBarMenuItem2.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(i13), 6));
        this.otherItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$34(view);
            }
        });
        this.otherItem.setPopupItemsColor(Theme.getColor(i12), false);
        this.otherItem.setPopupItemsColor(Theme.getColor(i12), true);
        ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem(activity, null, 0, Theme.getColor(i12));
        this.pipItem = actionBarMenuItem3;
        actionBarMenuItem3.setLongClickEnabled(false);
        this.pipItem.setIcon(R.drawable.msg_voice_pip);
        ActionBarMenuItem actionBarMenuItem4 = this.pipItem;
        int i14 = R.string.AccDescrPipMode;
        actionBarMenuItem4.setContentDescription(LocaleController.getString(i14));
        this.pipItem.setBackground(Theme.createSelectorDrawable(Theme.getColor(i13), 6));
        this.pipItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$35(view);
            }
        });
        ActionBarMenuItem actionBarMenuItem5 = new ActionBarMenuItem(activity, null, 0, Theme.getColor(i12));
        this.screenShareItem = actionBarMenuItem5;
        actionBarMenuItem5.setLongClickEnabled(false);
        this.screenShareItem.setIcon(R.drawable.msg_screencast);
        this.screenShareItem.setContentDescription(LocaleController.getString(i14));
        this.screenShareItem.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(i13), 6));
        this.screenShareItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallActivity.this.lambda$new$36(view);
            }
        });
        this.titleTextView = new AnonymousClass21(activity, activity);
        View view = new View(activity) {
            @Override
            protected void onMeasure(int i15, int i16) {
                setMeasuredDimension(View.MeasureSpec.getSize(i15), ActionBar.getCurrentActionBarHeight());
            }
        };
        this.actionBarBackground = view;
        view.setAlpha(0.0f);
        Paint paint3 = new Paint(1);
        this.liveLabelPaint = paint3;
        paint3.setColor(-12761513);
        TextView textView = new TextView(getContext()) {
            private RectF rect = new RectF();

            @Override
            protected void onDraw(Canvas canvas) {
                this.rect.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), GroupCallActivity.this.liveLabelPaint);
                super.onDraw(canvas);
            }
        };
        this.liveLabelTextView = textView;
        textView.setTextColor(getThemedColor(i12));
        this.liveLabelTextView.setTextSize(1, 11.0f);
        this.liveLabelTextView.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        this.liveLabelTextView.setMaxLines(1);
        this.liveLabelTextView.setGravity(17);
        this.liveLabelTextView.setTypeface(AndroidUtilities.bold());
        this.liveLabelTextView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        this.liveLabelTextView.setTag(-1);
        if (!isRtmpStream()) {
            this.liveLabelTextView.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.titleLayout = linearLayout;
        linearLayout.setOrientation(0);
        this.titleLayout.addView(this.titleTextView, LayoutHelper.createLinear(0, -2, 1.0f));
        this.titleLayout.addView(this.liveLabelTextView, LayoutHelper.createLinear(-2, 18, 6.0f, 4.0f, 0.0f, 0.0f));
        this.containerView.addView(this.actionBarBackground, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(this.titleLayout, LayoutHelper.createFrame(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.menuItemsContainer = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(this.screenShareItem, LayoutHelper.createLinear(48, 48));
        linearLayout2.addView(this.pipItem, LayoutHelper.createLinear(48, 48));
        linearLayout2.addView(this.otherItem, LayoutHelper.createLinear(48, 48));
        this.containerView.addView(linearLayout2, LayoutHelper.createFrame(-2, 48, 53));
        View view2 = new View(activity);
        this.actionBarShadow = view2;
        view2.setAlpha(0.0f);
        this.actionBarShadow.setBackgroundColor(Theme.getColor(Theme.key_dialogShadowLine));
        this.containerView.addView(this.actionBarShadow, LayoutHelper.createFrame(-1, 1.0f));
        int i15 = 0;
        for (int i16 = 2; i15 < i16; i16 = 2) {
            this.undoView[i15] = new UndoView(activity) {
                @Override
                public void showWithAction(long j, int i17, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
                    if (GroupCallActivity.this.previewDialog != null) {
                        return;
                    }
                    super.showWithAction(j, i17, obj, obj2, runnable, runnable2);
                }
            };
            this.undoView[i15].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.undoView[i15].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.undoView[i15], LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            i15++;
        }
        AccountSelectCell accountSelectCell = new AccountSelectCell(activity, true);
        this.accountSelectCell = accountSelectCell;
        accountSelectCell.setTag(R.id.width_tag, 240);
        this.otherItem.addSubItem(8, this.accountSelectCell, -2, AndroidUtilities.dp(48.0f));
        this.otherItem.setShowSubmenuByMove(false);
        AccountSelectCell accountSelectCell2 = this.accountSelectCell;
        int i17 = Theme.key_voipgroup_listSelector;
        accountSelectCell2.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(i17), 6, 6));
        this.accountGap = this.otherItem.addGap(0);
        ActionBarMenuSubItem addSubItem = this.otherItem.addSubItem(1, 0, (CharSequence) LocaleController.getString(R.string.VoipGroupAllCanSpeak), true);
        this.everyoneItem = addSubItem;
        addSubItem.updateSelectorBackground(true, false);
        ActionBarMenuSubItem addSubItem2 = this.otherItem.addSubItem(2, 0, (CharSequence) LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true);
        this.adminItem = addSubItem2;
        addSubItem2.updateSelectorBackground(false, true);
        ActionBarMenuSubItem actionBarMenuSubItem = this.everyoneItem;
        int i18 = Theme.key_voipgroup_checkMenu;
        actionBarMenuSubItem.setCheckColor(i18);
        this.everyoneItem.setColors(Theme.getColor(i18), Theme.getColor(i18));
        this.adminItem.setCheckColor(i18);
        this.adminItem.setColors(Theme.getColor(i18), Theme.getColor(i18));
        Paint paint4 = new Paint(1);
        int i19 = Theme.key_voipgroup_actionBarItems;
        paint4.setColor(Theme.getColor(i19));
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint4.setStrokeCap(Paint.Cap.ROUND);
        ActionBarMenuSubItem addSubItem3 = this.otherItem.addSubItem(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false);
        this.soundItem = addSubItem3;
        addSubItem3.setItemHeight(56);
        ActionBarMenuSubItem addSubItem4 = this.otherItem.addSubItem(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false);
        this.noiseItem = addSubItem4;
        addSubItem4.setItemHeight(56);
        View addDivider = this.otherItem.addDivider(ColorUtils.blendARGB(Theme.getColor(Theme.key_voipgroup_actionBar), -16777216, 0.3f));
        this.soundItemDivider = addDivider;
        ((ViewGroup.MarginLayoutParams) addDivider.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.soundItemDivider.getLayoutParams()).bottomMargin = 0;
        this.editTitleItem = this.otherItem.addSubItem(6, R.drawable.msg_edit, this.recordCallDrawable, LocaleController.getString(ChatObject.isChannelOrGiga(this.currentChat) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false);
        this.permissionItem = this.otherItem.addSubItem(7, R.drawable.msg_permissions, this.recordCallDrawable, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false);
        this.inviteItem = this.otherItem.addSubItem(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.recordCallDrawable = new RecordCallDrawable();
        this.screenItem = this.otherItem.addSubItem(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        ActionBarMenuSubItem addSubItem5 = this.otherItem.addSubItem(5, 0, this.recordCallDrawable, LocaleController.getString(R.string.VoipGroupRecordCall), true, false);
        this.recordItem = addSubItem5;
        this.recordCallDrawable.setParentView(addSubItem5.getImageView());
        this.leaveItem = this.otherItem.addSubItem(4, R.drawable.msg_cancel, LocaleController.getString(isConference() ? R.string.VoipGroupEndConference : ChatObject.isChannelOrGiga(this.currentChat) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat));
        this.otherItem.setPopupItemsSelectorColor(Theme.getColor(i17));
        this.otherItem.getPopupLayout().setFitItems(true);
        this.soundItem.setColors(Theme.getColor(i19), Theme.getColor(i19));
        this.noiseItem.setColors(Theme.getColor(i19), Theme.getColor(i19));
        ActionBarMenuSubItem actionBarMenuSubItem2 = this.leaveItem;
        int i20 = Theme.key_voipgroup_leaveCallMenu;
        actionBarMenuSubItem2.setColors(Theme.getColor(i20), Theme.getColor(i20));
        this.inviteItem.setColors(Theme.getColor(i19), Theme.getColor(i19));
        this.editTitleItem.setColors(Theme.getColor(i19), Theme.getColor(i19));
        this.permissionItem.setColors(Theme.getColor(i19), Theme.getColor(i19));
        this.recordItem.setColors(Theme.getColor(i19), Theme.getColor(i19));
        this.screenItem.setColors(Theme.getColor(i19), Theme.getColor(i19));
        if (this.call != null) {
            initCreatedGroupCall();
        }
        if (isConference()) {
            this.encryptionDrawable = new CallEncryptionCellDrawable(activity);
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.encryptionDrawable.setEmojis((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        this.leaveBackgroundPaint.setColor(Theme.getColor(Theme.key_voipgroup_leaveButton));
        updateTitle(false);
        this.actionBar.getTitleTextView().setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                GroupCallActivity.this.lambda$new$37(view3);
            }
        });
        this.fullscreenUsersListView = new RecyclerListView(activity) {
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
            public void onScrolled(RecyclerView recyclerView, int i21, int i22) {
                super.onScrolled(recyclerView, i21, i22);
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
                GroupCallActivity.this.renderersContainer.invalidate();
            }
        });
        this.fullscreenUsersListView.setClipChildren(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
        linearLayoutManager.setOrientation(0);
        this.fullscreenUsersListView.setLayoutManager(linearLayoutManager);
        RecyclerListView recyclerListView5 = this.fullscreenUsersListView;
        GroupCallFullscreenAdapter groupCallFullscreenAdapter = new GroupCallFullscreenAdapter(call, this.currentAccount, this);
        this.fullscreenAdapter = groupCallFullscreenAdapter;
        recyclerListView5.setAdapter(groupCallFullscreenAdapter);
        this.fullscreenAdapter.setVisibility(this.fullscreenUsersListView, false);
        this.fullscreenUsersListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view3, int i21) {
                GroupCallActivity.this.lambda$new$38(view3, i21);
            }
        });
        this.fullscreenUsersListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view3, int i21) {
                boolean lambda$new$39;
                lambda$new$39 = GroupCallActivity.this.lambda$new$39(view3, i21);
                return lambda$new$39;
            }
        });
        this.fullscreenUsersListView.setVisibility(8);
        this.fullscreenUsersListView.addItemDecoration(new RecyclerView.ItemDecoration() {
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
        AnonymousClass29 anonymousClass29 = new AnonymousClass29(activity, this.listView, this.fullscreenUsersListView, this.attachedRenderers, this.call, this);
        this.renderersContainer = anonymousClass29;
        anonymousClass29.setClipChildren(false);
        this.fullscreenAdapter.setRenderersPool(this.attachedRenderers, this.renderersContainer);
        if (this.tabletVideoGridView != null) {
            this.tabletGridAdapter.setRenderersPool(this.attachedRenderers, this.renderersContainer);
        }
        AvatarPreviewPagerIndicator avatarPreviewPagerIndicator = new AvatarPreviewPagerIndicator(activity);
        this.avatarPagerIndicator = avatarPreviewPagerIndicator;
        ProfileGalleryView profileGalleryView = new ProfileGalleryView(activity, this.actionBar, this.listView, avatarPreviewPagerIndicator) {
            @Override
            public void invalidate() {
                super.invalidate();
                ((BottomSheet) GroupCallActivity.this).containerView.invalidate();
            }
        };
        this.avatarsViewPager = profileGalleryView;
        profileGalleryView.setImagesLayerNum(Integer.MAX_VALUE);
        profileGalleryView.setInvalidateWithParent(true);
        avatarPreviewPagerIndicator.setProfileGalleryView(profileGalleryView);
        FrameLayout frameLayout3 = new FrameLayout(activity) {
            Rect rect = new Rect();
            RectF rectF = new RectF();
            Path path = new Path();

            @Override
            protected void onMeasure(int i21, int i22) {
                int min = Math.min(View.MeasureSpec.getSize(i21), View.MeasureSpec.getSize(i22));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min + getPaddingBottom(), 1073741824));
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (GroupCallActivity.this.progressToAvatarPreview != 1.0f) {
                    if (GroupCallActivity.this.scrimView == null || !GroupCallActivity.this.hasScrimAnchorView) {
                        if (GroupCallActivity.this.scrimFullscreenView != null && GroupCallActivity.this.scrimRenderer == null && GroupCallActivity.this.previewTextureTransitionEnabled) {
                            canvas.save();
                            float measuredHeight = (GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight());
                            int dp3 = (int) (((1.0f - GroupCallActivity.this.progressToAvatarPreview) * measuredHeight) + (AndroidUtilities.dp(13.0f) * GroupCallActivity.this.progressToAvatarPreview));
                            int i21 = (int) (measuredHeight * (1.0f - GroupCallActivity.this.progressToAvatarPreview));
                            GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                            GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().setRoundRadius(dp3, dp3, i21, i21);
                            GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getImageReceiver().draw(canvas);
                            GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().setRoundRadius(GroupCallActivity.this.scrimFullscreenView.getAvatarImageView().getMeasuredHeight() / 2);
                            canvas.restore();
                        }
                    } else {
                        canvas.save();
                        float measuredHeight2 = (GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight());
                        int dp4 = (int) (((1.0f - GroupCallActivity.this.progressToAvatarPreview) * measuredHeight2) + (AndroidUtilities.dp(13.0f) * GroupCallActivity.this.progressToAvatarPreview));
                        int i22 = (int) (measuredHeight2 * (1.0f - GroupCallActivity.this.progressToAvatarPreview));
                        GroupCallActivity.this.scrimView.getAvatarWavesDrawable().draw(canvas, GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight() / 2, GroupCallActivity.this.scrimView.getAvatarImageView().getMeasuredHeight() / 2, this);
                        GroupCallActivity.this.scrimView.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        GroupCallActivity.this.scrimView.getAvatarImageView().setRoundRadius(dp4, dp4, i22, i22);
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
                    int i23 = this.rect.left;
                    if (i23 < (-GroupCallActivity.this.avatarsViewPager.getMeasuredWidth())) {
                        i23 += GroupCallActivity.this.avatarsViewPager.getMeasuredWidth() * 2;
                    } else if (i23 > GroupCallActivity.this.avatarsViewPager.getMeasuredWidth()) {
                        i23 -= GroupCallActivity.this.avatarsViewPager.getMeasuredWidth() * 2;
                    }
                    canvas.translate(i23, 0.0f);
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
        this.avatarPreviewContainer = frameLayout3;
        frameLayout3.setVisibility(8);
        profileGalleryView.setVisibility(0);
        profileGalleryView.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrollStateChanged(int i21) {
            }

            @Override
            public void onPageScrolled(int i21, float f, int i22) {
            }

            @Override
            public void onPageSelected(int i21) {
                GroupCallActivity.this.avatarsViewPager.getRealPosition(i21);
                GroupCallActivity.this.avatarPagerIndicator.saveCurrentPageProgress();
                GroupCallActivity.this.avatarPagerIndicator.invalidate();
            }
        });
        this.blurredView = new View(activity) {
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
        View view3 = new View(activity);
        this.buttonsBackgroundGradientView = view3;
        int[] iArr = this.gradientColors;
        iArr[0] = this.backgroundColor;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.gradientColors);
        this.buttonsBackgroundGradient = gradientDrawable;
        view3.setBackground(gradientDrawable);
        this.containerView.addView(view3, LayoutHelper.createFrame(-1, 60, 83));
        View view4 = new View(activity);
        this.buttonsBackgroundGradientView2 = view4;
        view4.setBackgroundColor(this.gradientColors[0]);
        this.containerView.addView(view4, LayoutHelper.createFrame(-1, 0, 83));
        this.containerView.addView(this.buttonsContainer, LayoutHelper.createFrame(-1, 200, 81));
        this.containerView.addView(this.blurredView);
        frameLayout3.addView(profileGalleryView, LayoutHelper.createFrame(-1, -1.0f));
        frameLayout3.addView(avatarPreviewPagerIndicator, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(frameLayout3, LayoutHelper.createFrame(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        applyCallParticipantUpdates(false);
        this.listAdapter.notifyDataSetChanged();
        if (isTabletMode) {
            this.tabletGridAdapter.update(false, this.tabletVideoGridView);
        }
        this.oldCount = this.listAdapter.getItemCount();
        if (inputPeer != null) {
            TextView textView2 = new TextView(activity);
            this.scheduleInfoTextView = textView2;
            textView2.setGravity(17);
            this.scheduleInfoTextView.setTextColor(-8682615);
            this.scheduleInfoTextView.setTextSize(1, 14.0f);
            if (ChatObject.isChannel(this.currentChat) && (chat2 = this.currentChat) != null && !chat2.megagroup) {
                this.scheduleInfoTextView.setTag(1);
            }
            this.containerView.addView(this.scheduleInfoTextView, LayoutHelper.createFrame(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            final NumberPicker numberPicker = new NumberPicker(activity);
            numberPicker.setTextColor(-1);
            numberPicker.setSelectorColor(-9598483);
            numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
            numberPicker.setItemCount(5);
            final NumberPicker numberPicker2 = new NumberPicker(activity) {
                @Override
                protected CharSequence getContentDescription(int i21) {
                    return LocaleController.formatPluralString("Hours", i21, new Object[0]);
                }
            };
            numberPicker2.setItemCount(5);
            numberPicker2.setTextColor(-1);
            numberPicker2.setSelectorColor(-9598483);
            numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
            final NumberPicker numberPicker3 = new NumberPicker(activity) {
                @Override
                protected CharSequence getContentDescription(int i21) {
                    return LocaleController.formatPluralString("Minutes", i21, new Object[0]);
                }
            };
            numberPicker3.setItemCount(5);
            numberPicker3.setTextColor(-1);
            numberPicker3.setSelectorColor(-9598483);
            numberPicker3.setTextOffset(-AndroidUtilities.dp(34.0f));
            TextView textView3 = new TextView(activity);
            this.scheduleButtonTextView = textView3;
            textView3.setLines(1);
            this.scheduleButtonTextView.setSingleLine(true);
            this.scheduleButtonTextView.setEllipsize(TextUtils.TruncateAt.END);
            this.scheduleButtonTextView.setGravity(17);
            this.scheduleButtonTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), 0, 1056964608));
            this.scheduleButtonTextView.setTextColor(-1);
            this.scheduleButtonTextView.setTypeface(AndroidUtilities.bold());
            this.scheduleButtonTextView.setTextSize(1, 14.0f);
            this.containerView.addView(this.scheduleButtonTextView, LayoutHelper.createFrame(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            this.scheduleButtonTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view5) {
                    GroupCallActivity.this.lambda$new$44(numberPicker, numberPicker2, numberPicker3, chat, accountInstance, inputPeer2, view5);
                }
            });
            LinearLayout linearLayout3 = new LinearLayout(activity) {
                boolean ignoreLayout = false;

                @Override
                protected void onMeasure(int i21, int i22) {
                    this.ignoreLayout = true;
                    numberPicker.setItemCount(5);
                    numberPicker2.setItemCount(5);
                    numberPicker3.setItemCount(5);
                    numberPicker.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                    numberPicker2.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                    numberPicker3.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
                    this.ignoreLayout = false;
                    super.onMeasure(i21, i22);
                }

                @Override
                public void requestLayout() {
                    if (this.ignoreLayout) {
                        return;
                    }
                    super.requestLayout();
                }
            };
            this.scheduleTimerContainer = linearLayout3;
            linearLayout3.setWeightSum(1.0f);
            this.scheduleTimerContainer.setOrientation(0);
            this.containerView.addView(this.scheduleTimerContainer, LayoutHelper.createFrame(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            final long currentTimeMillis = System.currentTimeMillis();
            final Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            final int i21 = calendar.get(1);
            int i22 = calendar.get(6);
            this.scheduleTimerContainer.addView(numberPicker, LayoutHelper.createLinear(0, 270, 0.5f));
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(365);
            numberPicker.setWrapSelectorWheel(false);
            numberPicker.setFormatter(new NumberPicker.Formatter() {
                @Override
                public final String format(int i23) {
                    String lambda$new$45;
                    lambda$new$45 = GroupCallActivity.lambda$new$45(currentTimeMillis, calendar, i21, i23);
                    return lambda$new$45;
                }
            });
            NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() {
                @Override
                public final void onValueChange(NumberPicker numberPicker4, int i23, int i24) {
                    GroupCallActivity.this.lambda$new$46(numberPicker, numberPicker2, numberPicker3, numberPicker4, i23, i24);
                }
            };
            numberPicker.setOnValueChangedListener(onValueChangeListener);
            numberPicker2.setMinValue(0);
            numberPicker2.setMaxValue(23);
            this.scheduleTimerContainer.addView(numberPicker2, LayoutHelper.createLinear(0, 270, 0.2f));
            numberPicker2.setFormatter(new NumberPicker.Formatter() {
                @Override
                public final String format(int i23) {
                    String lambda$new$47;
                    lambda$new$47 = GroupCallActivity.lambda$new$47(i23);
                    return lambda$new$47;
                }
            });
            numberPicker2.setOnValueChangedListener(onValueChangeListener);
            numberPicker3.setMinValue(0);
            numberPicker3.setMaxValue(59);
            numberPicker3.setValue(0);
            numberPicker3.setFormatter(new NumberPicker.Formatter() {
                @Override
                public final String format(int i23) {
                    String lambda$new$48;
                    lambda$new$48 = GroupCallActivity.lambda$new$48(i23);
                    return lambda$new$48;
                }
            });
            this.scheduleTimerContainer.addView(numberPicker3, LayoutHelper.createLinear(0, 270, 0.3f));
            numberPicker3.setOnValueChangedListener(onValueChangeListener);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i23 = calendar.get(6);
            int i24 = calendar.get(12);
            int i25 = calendar.get(11);
            numberPicker.setValue(i22 != i23 ? 1 : 0);
            numberPicker3.setValue(i24);
            numberPicker2.setValue(i25);
            AlertsCreator.checkScheduleDate(this.scheduleButtonTextView, this.scheduleInfoTextView, 604800L, 2, numberPicker, numberPicker2, numberPicker3);
        }
        PinchToZoomHelper pinchToZoomHelper = new PinchToZoomHelper((ViewGroup) getWindow().getDecorView(), this.containerView) {
            @Override
            protected void invalidateViews() {
                super.invalidateViews();
                for (int i26 = 0; i26 < GroupCallActivity.this.avatarsViewPager.getChildCount(); i26++) {
                    GroupCallActivity.this.avatarsViewPager.getChildAt(i26).invalidate();
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
                GroupCallActivity.this.lambda$new$49(activity, view5);
            }
        });
        updateScheduleUI(false);
        updateItems();
        updateSpeakerPhoneIcon(false);
        updateState(false, false);
        setColorProgress(0.0f);
        updateSubtitle();
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.bulletinContainer = frameLayout4;
        this.containerView.addView(frameLayout4, LayoutHelper.createFrame(-1, 200, 87));
    }

    public void lambda$new$10(DialogInterface dialogInterface) {
        BaseFragment baseFragment = (BaseFragment) this.parentActivity.getActionBarLayout().getFragmentStack().get(this.parentActivity.getActionBarLayout().getFragmentStack().size() - 1);
        if (this.anyEnterEventSent && (baseFragment instanceof ChatActivity)) {
            ((ChatActivity) baseFragment).onEditTextDialogClose(true, true);
        }
    }

    public class AnonymousClass7 extends ActionBar.ActionBarMenuOnItemClick {
        final Activity val$context;

        public static void lambda$onItemClick$8(TLObject tLObject, TLRPC.TL_error tL_error) {
        }

        AnonymousClass7(Activity activity) {
            this.val$context = activity;
        }

        @Override
        public void onItemClick(int i) {
            VoIPService sharedInstance;
            int i2;
            int color;
            if (i == -1) {
                GroupCallActivity.this.onBackPressed();
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
            if (i == 4) {
                AlertDialog.Builder builder = new AlertDialog.Builder(GroupCallActivity.this.getContext());
                if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                    builder.setTitle(LocaleController.getString(R.string.VoipChannelEndAlertTitle));
                    builder.setMessage(LocaleController.getString(R.string.VoipChannelEndAlertText));
                } else {
                    builder.setTitle(LocaleController.getString(R.string.VoipGroupEndAlertTitle));
                    builder.setMessage(LocaleController.getString(R.string.VoipGroupEndAlertText));
                }
                builder.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
                builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupEnd), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        GroupCallActivity.AnonymousClass7.this.lambda$onItemClick$1(alertDialog, i3);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog create = builder.create();
                create.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_dialogBackground));
                create.show();
                TextView textView = (TextView) create.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(Theme.key_voipgroup_leaveCallMenu));
                }
                create.setTextColor(Theme.getColor(Theme.key_voipgroup_actionBarItems));
                return;
            }
            if (i == 9) {
                GroupCallActivity.this.screenShareItem.callOnClick();
                return;
            }
            if (i == 5) {
                GroupCallActivity groupCallActivity3 = GroupCallActivity.this;
                ChatObject.Call call = groupCallActivity3.call;
                if (call.recording) {
                    final boolean z = call.call.record_video_active;
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(groupCallActivity3.getContext());
                    builder2.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
                    builder2.setTitle(LocaleController.getString(R.string.VoipGroupStopRecordingTitle));
                    if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                        builder2.setMessage(LocaleController.getString(R.string.VoipChannelStopRecordingText));
                    } else {
                        builder2.setMessage(LocaleController.getString(R.string.VoipGroupStopRecordingText));
                    }
                    builder2.setPositiveButton(LocaleController.getString(R.string.Stop), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i3) {
                            GroupCallActivity.AnonymousClass7.this.lambda$onItemClick$2(z, alertDialog, i3);
                        }
                    });
                    builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
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
                    return;
                } else {
                    anonymousClass1.show();
                    return;
                }
            }
            if (i == 7) {
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
                return;
            }
            if (i == 6) {
                GroupCallActivity.this.enterEventSent = false;
                final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(GroupCallActivity.this.getContext());
                editTextBoldCursor.setBackgroundDrawable(Theme.createEditTextDrawable(GroupCallActivity.this.getContext(), true));
                final AlertDialog.Builder builder3 = new AlertDialog.Builder(GroupCallActivity.this.getContext());
                builder3.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
                if (ChatObject.isChannelOrGiga(GroupCallActivity.this.currentChat)) {
                    builder3.setTitle(LocaleController.getString(R.string.VoipChannelTitle));
                } else {
                    builder3.setTitle(LocaleController.getString(R.string.VoipGroupTitle));
                }
                builder3.setCheckFocusable(false);
                builder3.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        AndroidUtilities.hideKeyboard(EditTextBoldCursor.this);
                    }
                });
                LinearLayout linearLayout = new LinearLayout(GroupCallActivity.this.getContext());
                linearLayout.setOrientation(1);
                builder3.setView(linearLayout);
                editTextBoldCursor.setTextSize(1, 16.0f);
                int i3 = Theme.key_voipgroup_nameText;
                editTextBoldCursor.setTextColor(Theme.getColor(i3));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(6);
                TLRPC.Chat chat = GroupCallActivity.this.currentChat;
                editTextBoldCursor.setHint(chat != null ? chat.title : "");
                editTextBoldCursor.setHintTextColor(Theme.getColor(Theme.key_voipgroup_lastSeenText));
                editTextBoldCursor.setCursorColor(Theme.getColor(i3));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, 36, 51, 24, 6, 24, 0));
                editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView2, int i4, KeyEvent keyEvent) {
                        boolean lambda$onItemClick$4;
                        lambda$onItemClick$4 = GroupCallActivity.AnonymousClass7.lambda$onItemClick$4(AlertDialog.Builder.this, textView2, i4, keyEvent);
                        return lambda$onItemClick$4;
                    }
                });
                editTextBoldCursor.addTextChangedListener(new TextWatcher() {
                    boolean ignoreTextChange;

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                    }

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
                });
                if (!TextUtils.isEmpty(GroupCallActivity.this.call.call.title)) {
                    editTextBoldCursor.setText(GroupCallActivity.this.call.call.title);
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                }
                builder3.setPositiveButton(LocaleController.getString(R.string.Save), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i4) {
                        GroupCallActivity.AnonymousClass7.this.lambda$onItemClick$5(editTextBoldCursor, builder3, alertDialog, i4);
                    }
                });
                final AlertDialog create3 = builder3.create();
                create3.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_inviteMembersBackground));
                create3.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        GroupCallActivity.AnonymousClass7.this.lambda$onItemClick$6(create3, editTextBoldCursor, dialogInterface);
                    }
                });
                create3.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        AndroidUtilities.hideKeyboard(EditTextBoldCursor.this);
                    }
                });
                create3.show();
                create3.setTextColor(Theme.getColor(i3));
                editTextBoldCursor.requestFocus();
                return;
            }
            if (i == 8) {
                JoinCallAlert.open(GroupCallActivity.this.getContext(), -GroupCallActivity.this.getChatId(), GroupCallActivity.this.accountInstance, null, 2, GroupCallActivity.this.selfPeer, new JoinCallAlert.JoinCallAlertDelegate() {
                    @Override
                    public final void didSelectChat(TLRPC.InputPeer inputPeer, boolean z2, boolean z3, boolean z4) {
                        GroupCallActivity.AnonymousClass7.this.lambda$onItemClick$9(inputPeer, z2, z3, z4);
                    }
                });
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
            final ArrayList arrayList3 = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
            arrayList2.add(Integer.valueOf(R.drawable.msg_voice_speaker));
            arrayList3.add(0);
            if (sharedInstance.hasEarpiece()) {
                arrayList.add(LocaleController.getString(sharedInstance.isHeadsetPlugged() ? R.string.VoipAudioRoutingHeadset : R.string.VoipAudioRoutingPhone));
                arrayList2.add(Integer.valueOf(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone));
                arrayList3.add(1);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str = sharedInstance.currentBluetoothDeviceName;
                if (str == null) {
                    str = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                }
                arrayList.add(str);
                arrayList2.add(Integer.valueOf(R.drawable.msg_voice_bluetooth));
                arrayList3.add(2);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i4 = 0; i4 < size; i4++) {
                charSequenceArr[i4] = (CharSequence) arrayList.get(i4);
                iArr[i4] = ((Integer) arrayList2.get(i4)).intValue();
            }
            BottomSheet.Builder items = new BottomSheet.Builder(this.val$context).setTitle(LocaleController.getString(R.string.VoipSelectAudioOutput), true).setItems(charSequenceArr, iArr, new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    GroupCallActivity.AnonymousClass7.this.lambda$onItemClick$11(arrayList3, dialogInterface, i5);
                }
            });
            BottomSheet create4 = items.create();
            int i5 = Theme.key_voipgroup_listViewBackgroundUnscrolled;
            create4.setBackgroundColor(Theme.getColor(i5));
            create4.fixNavigationBar(Theme.getColor(i5));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i2 = 0;
            } else {
                i2 = sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
            }
            items.show();
            create4.setTitleColor(Theme.getColor(Theme.key_voipgroup_nameText));
            for (int i6 = 0; i6 < create4.getItemViews().size(); i6++) {
                BottomSheet.BottomSheetCell bottomSheetCell = create4.getItemViews().get(i6);
                if (i6 == i2) {
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

        public void lambda$onItemClick$1(AlertDialog alertDialog, int i) {
            if (GroupCallActivity.this.call.isScheduled()) {
                TLRPC.ChatFull chatFull = GroupCallActivity.this.accountInstance.getMessagesController().getChatFull(GroupCallActivity.this.getChatId());
                if (chatFull != null) {
                    chatFull.flags &= -2097153;
                    chatFull.call = null;
                    GroupCallActivity.this.accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(GroupCallActivity.this.getChatId()), Long.valueOf(GroupCallActivity.this.call.call.id), Boolean.FALSE);
                }
                TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                discardgroupcall.call = GroupCallActivity.this.call.getInputGroupCall();
                GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(discardgroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        GroupCallActivity.AnonymousClass7.this.lambda$onItemClick$0(tLObject, tL_error);
                    }
                });
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().hangUp(1);
            }
            GroupCallActivity.this.dismiss();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
        }

        public void lambda$onItemClick$0(TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tLObject instanceof TLRPC.TL_updates) {
                GroupCallActivity.this.accountInstance.getMessagesController().processUpdates((TLRPC.TL_updates) tLObject, false);
            }
        }

        public void lambda$onItemClick$2(boolean z, AlertDialog alertDialog, int i) {
            GroupCallActivity.this.call.toggleRecord(null, 0);
            GroupCallActivity.this.getUndoView().showWithAction(0L, z ? 101 : 40, (Runnable) null);
        }

        public class AnonymousClass1 extends GroupCallRecordAlert {
            AnonymousClass1(Context context, TLRPC.Chat chat, boolean z) {
                super(context, chat, z);
            }

            @Override
            public void onStartRecord(final int i) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
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
                editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipGroupSaveFileHint));
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
                        lambda$onStartRecord$0 = GroupCallActivity.AnonymousClass7.AnonymousClass1.lambda$onStartRecord$0(AlertDialog.Builder.this, textView, i3, keyEvent);
                        return lambda$onStartRecord$0;
                    }
                });
                final AlertDialog create = builder.create();
                create.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_inviteMembersBackground));
                create.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public final void onShow(DialogInterface dialogInterface) {
                        GroupCallActivity.AnonymousClass7.AnonymousClass1.this.lambda$onStartRecord$1(create, editTextBoldCursor, dialogInterface);
                    }
                });
                create.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        AndroidUtilities.hideKeyboard(EditTextBoldCursor.this);
                    }
                });
                builder.setPositiveButton(LocaleController.getString(R.string.Start), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        GroupCallActivity.AnonymousClass7.AnonymousClass1.this.lambda$onStartRecord$3(editTextBoldCursor, i, alertDialog, i3);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i3) {
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

            public void lambda$onStartRecord$3(EditTextBoldCursor editTextBoldCursor, int i, AlertDialog alertDialog, int i2) {
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

        public void lambda$onItemClick$5(EditTextBoldCursor editTextBoldCursor, AlertDialog.Builder builder, AlertDialog alertDialog, int i) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            GroupCallActivity.this.call.setTitle(editTextBoldCursor.getText().toString());
            builder.getDismissRunnable().run();
        }

        public void lambda$onItemClick$6(AlertDialog alertDialog, EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
            GroupCallActivity.this.makeFocusable(null, alertDialog, editTextBoldCursor, true);
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
            if (GroupCallActivity.this.call.isScheduled()) {
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
                GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(savedefaultgroupcalljoinas, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                        GroupCallActivity.AnonymousClass7.lambda$onItemClick$8(tLObject2, tL_error);
                    }
                });
                GroupCallActivity.this.updateItems();
                return;
            }
            if (VoIPService.getSharedInstance() == null || !z) {
                return;
            }
            GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
            VoIPService.getSharedInstance().setGroupCallPeer(inputPeer);
            GroupCallActivity.this.userSwitchObject = tLObject;
        }

        public void lambda$onItemClick$11(ArrayList arrayList, DialogInterface dialogInterface, int i) {
            if (VoIPService.getSharedInstance() == null) {
                return;
            }
            Integer num = (Integer) arrayList.get(i);
            final int intValue = num.intValue();
            GroupCallActivity.this.cacheAudioOutputValue = num;
            GroupCallActivity.this.updateState(true, true);
            GroupCallActivity.this.cacheAudioOutputValue = null;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GroupCallActivity.AnonymousClass7.this.lambda$onItemClick$10(intValue);
                }
            });
        }

        public void lambda$onItemClick$10(int i) {
            GroupCallActivity.this.setAudioOutputValue(i);
            BulletinFactory.of(GroupCallActivity.this.topBulletinContainer, new DarkBlueThemeResourcesProvider()).createSimpleBulletin(GroupCallActivity.this.getContext().getResources().getDrawable(GroupCallActivity.this.getAudioOutputToastIcon(i)).mutate(), GroupCallActivity.this.getAudioOutputToastText(i)).show(GroupCallActivity.this.isBulletinTop());
        }
    }

    public void lambda$new$11(int[] iArr, float[] fArr, boolean[] zArr) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        for (int i = 0; i < iArr.length; i++) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.call.participantsBySources.get(iArr[i]);
            if (groupCallParticipant != null) {
                if (!this.renderersContainer.inFullscreenMode) {
                    int indexOf = (this.delayedGroupCallUpdated ? this.oldParticipants : this.call.visibleParticipants).indexOf(groupCallParticipant);
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
                        if (MessageObject.getPeerId(groupCallUserCell.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            groupCallUserCell.setAmplitude(fArr[i] * 15.0f);
                        }
                    }
                }
                this.renderersContainer.setAmplitude(groupCallParticipant, fArr[i] * 15.0f);
            }
        }
    }

    public void lambda$new$25(Activity activity, final ChatObject.Call call, View view, int i, float f, float f2) {
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
        r15 = null;
        r15 = null;
        r15 = null;
        final Long l = null;
        boolean z = false;
        if (view instanceof GroupCallInvitedCell) {
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
                this.parentActivity.lambda$runLinkRequest$95(new ProfileActivity(bundle));
                dismiss();
                return;
            }
            if (i - this.listAdapter.shadyJoinStartRow < 0 || i - this.listAdapter.shadyJoinStartRow >= this.call.shadyJoinParticipants.size()) {
                if (i - this.listAdapter.shadyLeftStartRow < 0 || i - this.listAdapter.shadyLeftStartRow >= this.call.shadyLeftParticipants.size()) {
                    int i2 = i - this.listAdapter.invitedStartRow;
                    if (this.delayedGroupCallUpdated) {
                        if (i2 >= 0 && i2 < this.oldInvited.size()) {
                            l = (Long) this.oldInvited.get(i2);
                        }
                    } else if (i2 >= 0 && i2 < this.call.invitedUsers.size()) {
                        l = this.call.invitedUsers.get(i2);
                    }
                    if (z && (invitedUser = this.call.invitedUsersMessageIds.get(l)) != null) {
                        ItemOptions.makeOptions(this.container, new DarkBlueThemeResourcesProvider(), groupCallInvitedCell).addIf(invitedUser.isCalling(), R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable() {
                            @Override
                            public final void run() {
                                GroupCallActivity.this.lambda$new$13(invitedUser, l);
                            }
                        }).add(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable() {
                            @Override
                            public final void run() {
                                GroupCallActivity.this.lambda$new$15(invitedUser, l);
                            }
                        }).setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.listViewBackgroundPaint.getColor())).setDimAlpha(96).show();
                        return;
                    }
                    return;
                }
                l = this.call.shadyLeftParticipants.get(i - this.listAdapter.shadyLeftStartRow);
            } else {
                l = this.call.shadyJoinParticipants.get(i - this.listAdapter.shadyJoinStartRow);
            }
            z = true;
            if (z) {
                return;
            }
            ItemOptions.makeOptions(this.container, new DarkBlueThemeResourcesProvider(), groupCallInvitedCell).addIf(invitedUser.isCalling(), R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable() {
                @Override
                public final void run() {
                    GroupCallActivity.this.lambda$new$13(invitedUser, l);
                }
            }).add(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable() {
                @Override
                public final void run() {
                    GroupCallActivity.this.lambda$new$15(invitedUser, l);
                }
            }).setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.listViewBackgroundPaint.getColor())).setDimAlpha(96).show();
            return;
        }
        if (i == this.listAdapter.addMemberRow) {
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
            ChatObject.Call call2 = this.call;
            GroupVoipInviteAlert groupVoipInviteAlert = new GroupVoipInviteAlert(context, currentAccount, chat2, chatFull, call2.participants, call2.invitedUsersMap);
            this.groupVoipInviteAlert = groupVoipInviteAlert;
            groupVoipInviteAlert.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    GroupCallActivity.this.lambda$new$16(dialogInterface);
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
                    } else {
                        GroupCallActivity groupCallActivity2 = GroupCallActivity.this;
                        groupCallActivity2.makeFocusable(groupCallActivity2.groupVoipInviteAlert, null, editTextBoldCursor, false);
                    }
                }
            });
            this.groupVoipInviteAlert.show();
            return;
        }
        if (i == this.listAdapter.conferenceAddPeopleRow) {
            ChatObject.Call call3 = this.call;
            if (call3 == null || call3.call == null) {
                return;
            }
            UserSelectorBottomSheet userSelectorBottomSheet = new UserSelectorBottomSheet(activity, this.currentAccount, 0L, null, 4, true, new DarkBlueThemeResourcesProvider());
            ChatObject.Call call4 = this.call;
            userSelectorBottomSheet.exceptUsers(call4 != null ? (Collection) Collection.EL.stream(call4.sortedParticipants).map(new Function() {
                public Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override
                public final Object apply(Object obj) {
                    Long lambda$new$17;
                    lambda$new$17 = GroupCallActivity.lambda$new$17((TLRPC.GroupCallParticipant) obj);
                    return lambda$new$17;
                }

                public Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toSet()) : null).setOnShareCallLinkListener(new Runnable() {
                @Override
                public final void run() {
                    GroupCallActivity.this.openShareConferenceLink();
                }
            }).setOnUsersSelector(new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    GroupCallActivity.this.lambda$new$24(call, (Boolean) obj, (HashSet) obj2);
                }
            }).show();
            return;
        }
        if (i == this.listAdapter.conferenceShareLinkRow) {
            openShareConferenceLink();
        }
    }

    public void lambda$new$13(ChatObject.Call.InvitedUser invitedUser, Long l) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(declineconferencecallinvite, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                GroupCallActivity.this.lambda$new$12(tLObject, tL_error);
            }
        });
        ChatObject.Call call = this.call;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l, invitedUser);
            applyCallParticipantUpdates(true);
        }
    }

    public void lambda$new$12(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public void lambda$new$15(ChatObject.Call.InvitedUser invitedUser, Long l) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(declineconferencecallinvite, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                GroupCallActivity.this.lambda$new$14(tLObject, tL_error);
            }
        });
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

    public void lambda$new$14(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public void lambda$new$16(DialogInterface dialogInterface) {
        this.groupVoipInviteAlert = null;
    }

    public static Long lambda$new$17(TLRPC.GroupCallParticipant groupCallParticipant) {
        return Long.valueOf(DialogObject.getPeerDialogId(groupCallParticipant.peer));
    }

    public void lambda$new$24(final ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = this.call;
        if (call2 == null || (groupCall = call2.call) == null) {
            return;
        }
        final String str = groupCall.invite_link;
        int size = hashSet.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        final HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            final long longValue = ((Long) it.next()).longValue();
            this.call.addInvitedUser(longValue);
            TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            inviteconferencecallparticipant.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall2 = this.call.call;
            tL_inputGroupCall.id = groupCall2.id;
            tL_inputGroupCall.access_hash = groupCall2.access_hash;
            inviteconferencecallparticipant.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(longValue);
            inviteconferencecallparticipant.video = bool.booleanValue();
            final AtomicInteger atomicInteger2 = atomicInteger;
            final int i = size;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(inviteconferencecallparticipant, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    GroupCallActivity.this.lambda$new$23(longValue, hashSet2, atomicInteger2, i, call, str, tLObject, tL_error);
                }
            });
            size = size;
            atomicInteger = atomicInteger;
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

    public void lambda$new$23(final long j, final HashSet hashSet, AtomicInteger atomicInteger, int i, final ChatObject.Call call, final String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            final TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GroupCallActivity.this.lambda$new$18(updates, j);
                }
            });
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j));
        }
        if (atomicInteger.incrementAndGet() != i || hashSet.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.this.lambda$new$22(hashSet, call, str);
            }
        });
    }

    public void lambda$new$18(TLRPC.Updates updates, long j) {
        TLRPC.Update update = updates.update;
        int i = 0;
        if (update instanceof TLRPC.TL_updateNewMessage) {
            TLRPC.Message message = ((TLRPC.TL_updateNewMessage) update).message;
            if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                i = message.id;
            }
        } else if (update instanceof TLRPC.TL_updateMessageID) {
            i = ((TLRPC.TL_updateMessageID) update).id;
        } else if (updates.updates != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= updates.updates.size()) {
                    break;
                }
                TLRPC.Update update2 = updates.updates.get(i2);
                if (update2 instanceof TLRPC.TL_updateNewMessage) {
                    TLRPC.Message message2 = ((TLRPC.TL_updateNewMessage) update2).message;
                    if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                        i = message2.id;
                        break;
                    }
                    i2++;
                } else {
                    if (update2 instanceof TLRPC.TL_updateMessageID) {
                        i = ((TLRPC.TL_updateMessageID) update2).id;
                        break;
                    }
                    i2++;
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

    public void lambda$new$22(HashSet hashSet, ChatObject.Call call, final String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long longValue = l.longValue();
            if (call != null) {
                call.removeInvitedUser(longValue);
            }
            arrayList.add(MessagesController.getInstance(this.currentAccount).getUser(l));
            getrequirementstocontact.id.add(MessagesController.getInstance(this.currentAccount).getInputUser(longValue));
        }
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.this.lambda$new$19(arrayList, arrayList2, arrayList3, str);
            }
        };
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            runnable.run();
        } else {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getrequirementstocontact, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    GroupCallActivity.lambda$new$21(arrayList, arrayList2, runnable, tLObject, tL_error);
                }
            });
        }
    }

    public void lambda$new$19(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(safeLastFragment, safeLastFragment.getContext(), 34, this.currentAccount, new DarkBlueThemeResourcesProvider());
        limitReachedBottomSheet.setRestrictedUsers(null, arrayList, arrayList2, arrayList3, str);
        limitReachedBottomSheet.show();
    }

    public static void lambda$new$21(final ArrayList arrayList, final ArrayList arrayList2, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.lambda$new$20(TLObject.this, arrayList, arrayList2, runnable);
            }
        });
    }

    public static void lambda$new$20(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable) {
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

    public boolean lambda$new$26(View view, int i) {
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

    public void lambda$new$27(View view, int i) {
        GroupCallGridCell groupCallGridCell = (GroupCallGridCell) view;
        if (groupCallGridCell.getParticipant() != null) {
            fullscreenFor(groupCallGridCell.getParticipant());
        }
    }

    class AnonymousClass18 extends FrameLayout {
        AnimatorSet currentButtonsAnimation;
        int currentLightColor;
        final OvershootInterpolator overshootInterpolator;

        AnonymousClass18(Context context) {
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
            int dp;
            int i5;
            int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(122.0f)) / 2;
            int measuredHeight = getMeasuredHeight();
            int i6 = GroupCallActivity.this.cameraButton.getVisibility() != 0 ? 5 : 6;
            if (GroupCallActivity.this.soundButton.getVisibility() != 0) {
                i6--;
            }
            if (GroupCallActivity.this.flipButton.getVisibility() != 0) {
                i6--;
            }
            if (GroupCallActivity.this.speakerButtonContainer.getVisibility() != 0) {
                i6--;
            }
            if (!GroupCallActivity.isLandscapeMode || GroupCallActivity.isTabletMode) {
                if ((GroupCallActivity.this.renderersContainer.inFullscreenMode && !GroupCallActivity.isTabletMode) || GroupCallActivity.this.isRtmpStream()) {
                    int measuredWidth2 = getMeasuredWidth() / i6;
                    boolean z2 = !GroupCallActivity.this.renderersContainer.inFullscreenMode && GroupCallActivity.this.isRtmpStream();
                    int dp2 = z2 ? AndroidUtilities.dp(27.0f) : 0;
                    if (GroupCallActivity.this.soundButton.getVisibility() == 0) {
                        int i7 = measuredWidth2 / 2;
                        int measuredWidth3 = i7 - (GroupCallActivity.this.cameraButton.getMeasuredWidth() / 2);
                        int measuredHeight2 = getMeasuredHeight() - GroupCallActivity.this.cameraButton.getMeasuredHeight();
                        GroupCallActivity.this.cameraButton.layout(measuredWidth3, measuredHeight2, GroupCallActivity.this.cameraButton.getMeasuredWidth() + measuredWidth3, GroupCallActivity.this.cameraButton.getMeasuredHeight() + measuredHeight2);
                        int measuredWidth4 = (i7 + (i6 == 4 ? measuredWidth2 : 0)) - (GroupCallActivity.this.leaveButton.getMeasuredWidth() / 2);
                        int measuredHeight3 = (getMeasuredHeight() - GroupCallActivity.this.soundButton.getMeasuredHeight()) - dp2;
                        GroupCallActivity.this.soundButton.layout(measuredWidth4, measuredHeight3, GroupCallActivity.this.soundButton.getMeasuredWidth() + measuredWidth4, GroupCallActivity.this.soundButton.getMeasuredHeight() + measuredHeight3);
                    } else {
                        int i8 = measuredWidth2 / 2;
                        int measuredWidth5 = ((i6 == 4 ? measuredWidth2 : 0) + i8) - (GroupCallActivity.this.cameraButton.getMeasuredWidth() / 2);
                        int measuredHeight4 = getMeasuredHeight() - GroupCallActivity.this.cameraButton.getMeasuredHeight();
                        GroupCallActivity.this.cameraButton.layout(measuredWidth5, measuredHeight4, GroupCallActivity.this.cameraButton.getMeasuredWidth() + measuredWidth5, GroupCallActivity.this.cameraButton.getMeasuredHeight() + measuredHeight4);
                        int measuredWidth6 = i8 - (GroupCallActivity.this.flipButton.getMeasuredWidth() / 2);
                        int measuredHeight5 = getMeasuredHeight() - GroupCallActivity.this.flipButton.getMeasuredHeight();
                        GroupCallActivity.this.flipButton.layout(measuredWidth6, measuredHeight5, GroupCallActivity.this.flipButton.getMeasuredWidth() + measuredWidth6, GroupCallActivity.this.flipButton.getMeasuredHeight() + measuredHeight5);
                        int measuredWidth7 = i8 - (GroupCallActivity.this.speakerButtonContainer.getMeasuredWidth() / 2);
                        int measuredHeight6 = getMeasuredHeight() - GroupCallActivity.this.speakerButtonContainer.getMeasuredHeight();
                        GroupCallActivity.this.speakerButtonContainer.layout(measuredWidth7, measuredHeight6, GroupCallActivity.this.speakerButtonContainer.getMeasuredWidth() + measuredWidth7, GroupCallActivity.this.speakerButtonContainer.getMeasuredHeight() + measuredHeight6);
                    }
                    int i9 = measuredWidth2 / 2;
                    int measuredWidth8 = ((i6 == 4 ? measuredWidth2 * 3 : measuredWidth2 * 2) + i9) - (GroupCallActivity.this.leaveButton.getMeasuredWidth() / 2);
                    int measuredHeight7 = (getMeasuredHeight() - GroupCallActivity.this.leaveButton.getMeasuredHeight()) - dp2;
                    GroupCallActivity.this.leaveButton.layout(measuredWidth8, measuredHeight7, GroupCallActivity.this.leaveButton.getMeasuredWidth() + measuredWidth8, GroupCallActivity.this.leaveButton.getMeasuredHeight() + measuredHeight7);
                    int measuredWidth9 = (i9 + (i6 == 4 ? measuredWidth2 * 2 : measuredWidth2)) - (GroupCallActivity.this.muteButton.getMeasuredWidth() / 2);
                    int measuredHeight8 = ((getMeasuredHeight() - GroupCallActivity.this.leaveButton.getMeasuredHeight()) - ((GroupCallActivity.this.muteButton.getMeasuredWidth() - AndroidUtilities.dp(52.0f)) / 2)) - dp2;
                    GroupCallActivity.this.muteButton.layout(measuredWidth9, measuredHeight8, GroupCallActivity.this.muteButton.getMeasuredWidth() + measuredWidth9, GroupCallActivity.this.muteButton.getMeasuredHeight() + measuredHeight8);
                    GroupCallActivity.this.minimizeButton.layout(measuredWidth9, measuredHeight8, GroupCallActivity.this.minimizeButton.getMeasuredWidth() + measuredWidth9, GroupCallActivity.this.minimizeButton.getMeasuredHeight() + measuredHeight8);
                    GroupCallActivity.this.expandButton.layout(measuredWidth9, measuredHeight8, GroupCallActivity.this.expandButton.getMeasuredWidth() + measuredWidth9, GroupCallActivity.this.expandButton.getMeasuredHeight() + measuredHeight8);
                    float dp3 = AndroidUtilities.dp(52.0f) / (GroupCallActivity.this.muteButton.getMeasuredWidth() - AndroidUtilities.dp(8.0f));
                    GroupCallActivity.this.muteButton.animate().scaleX(dp3).scaleY(dp3).setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    for (int i10 = 0; i10 < 2; i10++) {
                        int measuredWidth10 = (i6 == 4 ? measuredWidth2 * 2 : measuredWidth2) + ((measuredWidth2 - GroupCallActivity.this.muteLabel[i10].getMeasuredWidth()) / 2);
                        int dp4 = measuredHeight - AndroidUtilities.dp(27.0f);
                        if (z2) {
                            if (GroupCallActivity.this.renderersContainer.inFullscreenMode) {
                                dp = AndroidUtilities.dp(2.0f);
                            } else {
                                dp = AndroidUtilities.dp(25.0f);
                            }
                            dp4 -= dp;
                        }
                        GroupCallActivity.this.muteLabel[i10].layout(measuredWidth10, dp4, GroupCallActivity.this.muteLabel[i10].getMeasuredWidth() + measuredWidth10, GroupCallActivity.this.muteLabel[i10].getMeasuredHeight() + dp4);
                        GroupCallActivity.this.muteLabel[i10].animate().scaleX(0.687f).scaleY(0.687f).setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    }
                } else {
                    int dp5 = AndroidUtilities.dp(0.0f);
                    if (GroupCallActivity.this.soundButton.getVisibility() == 0) {
                        if (GroupCallActivity.this.cameraButton.getVisibility() == 0) {
                            int measuredWidth11 = (measuredWidth - GroupCallActivity.this.cameraButton.getMeasuredWidth()) / 2;
                            int measuredHeight9 = (measuredHeight - GroupCallActivity.this.cameraButton.getMeasuredHeight()) / 2;
                            GroupCallActivity.this.cameraButton.layout(measuredWidth11, measuredHeight9, GroupCallActivity.this.cameraButton.getMeasuredWidth() + measuredWidth11, GroupCallActivity.this.cameraButton.getMeasuredHeight() + measuredHeight9);
                            int measuredWidth12 = (measuredWidth - GroupCallActivity.this.soundButton.getMeasuredWidth()) / 2;
                            int measuredHeight10 = (measuredHeight - GroupCallActivity.this.leaveButton.getMeasuredHeight()) / 2;
                            GroupCallActivity.this.soundButton.layout(measuredWidth12, measuredHeight10, GroupCallActivity.this.soundButton.getMeasuredWidth() + measuredWidth12, GroupCallActivity.this.soundButton.getMeasuredHeight() + measuredHeight10);
                        } else {
                            int measuredWidth13 = (measuredWidth - GroupCallActivity.this.soundButton.getMeasuredWidth()) / 2;
                            int measuredHeight11 = (measuredHeight - GroupCallActivity.this.soundButton.getMeasuredHeight()) / 2;
                            GroupCallActivity.this.soundButton.layout(measuredWidth13, measuredHeight11, GroupCallActivity.this.soundButton.getMeasuredWidth() + measuredWidth13, GroupCallActivity.this.soundButton.getMeasuredHeight() + measuredHeight11);
                        }
                    } else {
                        int dp6 = (GroupCallActivity.this.flipButton.getVisibility() == 0 || GroupCallActivity.this.speakerButtonContainer.getVisibility() == 0) ? AndroidUtilities.dp(28.0f) : 0;
                        int measuredWidth14 = (measuredWidth - GroupCallActivity.this.flipButton.getMeasuredWidth()) / 2;
                        int measuredHeight12 = (((measuredHeight - GroupCallActivity.this.flipButton.getMeasuredHeight()) / 2) + dp5) - dp6;
                        GroupCallActivity.this.flipButton.layout(measuredWidth14, measuredHeight12, GroupCallActivity.this.flipButton.getMeasuredWidth() + measuredWidth14, GroupCallActivity.this.flipButton.getMeasuredHeight() + measuredHeight12);
                        int measuredWidth15 = (measuredWidth - GroupCallActivity.this.speakerButtonContainer.getMeasuredWidth()) / 2;
                        int measuredHeight13 = (((measuredHeight - GroupCallActivity.this.speakerButtonContainer.getMeasuredHeight()) / 2) + dp5) - dp6;
                        GroupCallActivity.this.speakerButtonContainer.layout(measuredWidth15, measuredHeight13, GroupCallActivity.this.speakerButtonContainer.getMeasuredWidth() + measuredWidth15, GroupCallActivity.this.speakerButtonContainer.getMeasuredHeight() + measuredHeight13);
                        int measuredWidth16 = (measuredWidth - GroupCallActivity.this.cameraButton.getMeasuredWidth()) / 2;
                        int measuredHeight14 = ((measuredHeight - GroupCallActivity.this.cameraButton.getMeasuredHeight()) / 2) + dp5 + dp6;
                        GroupCallActivity.this.cameraButton.layout(measuredWidth16, measuredHeight14, GroupCallActivity.this.cameraButton.getMeasuredWidth() + measuredWidth16, GroupCallActivity.this.cameraButton.getMeasuredHeight() + measuredHeight14);
                    }
                    int measuredHeight15 = ((measuredHeight - GroupCallActivity.this.leaveButton.getMeasuredHeight()) / 2) + dp5;
                    int measuredWidth17 = (getMeasuredWidth() - measuredWidth) + ((measuredWidth - GroupCallActivity.this.leaveButton.getMeasuredWidth()) / 2);
                    GroupCallActivity.this.leaveButton.layout(measuredWidth17, measuredHeight15, GroupCallActivity.this.leaveButton.getMeasuredWidth() + measuredWidth17, GroupCallActivity.this.leaveButton.getMeasuredHeight() + measuredHeight15);
                    int measuredWidth18 = (getMeasuredWidth() - GroupCallActivity.this.muteButton.getMeasuredWidth()) / 2;
                    int measuredHeight16 = ((measuredHeight - GroupCallActivity.this.muteButton.getMeasuredHeight()) / 2) - AndroidUtilities.dp(9.0f);
                    GroupCallActivity.this.muteButton.layout(measuredWidth18, measuredHeight16, GroupCallActivity.this.muteButton.getMeasuredWidth() + measuredWidth18, GroupCallActivity.this.muteButton.getMeasuredHeight() + measuredHeight16);
                    GroupCallActivity.this.minimizeButton.layout(measuredWidth18, measuredHeight16, GroupCallActivity.this.minimizeButton.getMeasuredWidth() + measuredWidth18, GroupCallActivity.this.minimizeButton.getMeasuredHeight() + measuredHeight16);
                    GroupCallActivity.this.expandButton.layout(measuredWidth18, measuredHeight16, GroupCallActivity.this.expandButton.getMeasuredWidth() + measuredWidth18, GroupCallActivity.this.expandButton.getMeasuredHeight() + measuredHeight16);
                    GroupCallActivity.this.muteButton.animate().setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).scaleX(1.0f).scaleY(1.0f).start();
                    for (int i11 = 0; i11 < 2; i11++) {
                        int measuredWidth19 = (getMeasuredWidth() - GroupCallActivity.this.muteLabel[i11].getMeasuredWidth()) / 2;
                        int dp7 = (measuredHeight - AndroidUtilities.dp(12.0f)) - GroupCallActivity.this.muteLabel[i11].getMeasuredHeight();
                        GroupCallActivity.this.muteLabel[i11].layout(measuredWidth19, dp7, GroupCallActivity.this.muteLabel[i11].getMeasuredWidth() + measuredWidth19, GroupCallActivity.this.muteLabel[i11].getMeasuredHeight() + dp7);
                        GroupCallActivity.this.muteLabel[i11].animate().scaleX(1.0f).scaleY(1.0f).setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    }
                }
            } else {
                int measuredHeight17 = getMeasuredHeight() / i6;
                if (GroupCallActivity.this.soundButton.getVisibility() == 0) {
                    int i12 = measuredHeight17 / 2;
                    int measuredHeight18 = i12 - (GroupCallActivity.this.cameraButton.getMeasuredHeight() / 2);
                    int measuredWidth20 = (getMeasuredWidth() - GroupCallActivity.this.cameraButton.getMeasuredWidth()) >> 1;
                    GroupCallActivity.this.cameraButton.layout(measuredWidth20, measuredHeight18, GroupCallActivity.this.cameraButton.getMeasuredWidth() + measuredWidth20, GroupCallActivity.this.cameraButton.getMeasuredHeight() + measuredHeight18);
                    int measuredHeight19 = (i12 + (i6 == 4 ? measuredHeight17 : 0)) - (GroupCallActivity.this.soundButton.getMeasuredHeight() / 2);
                    int measuredWidth21 = (getMeasuredWidth() - GroupCallActivity.this.soundButton.getMeasuredWidth()) >> 1;
                    GroupCallActivity.this.soundButton.layout(measuredWidth21, measuredHeight19, GroupCallActivity.this.soundButton.getMeasuredWidth() + measuredWidth21, GroupCallActivity.this.soundButton.getMeasuredHeight() + measuredHeight19);
                } else {
                    int i13 = measuredHeight17 / 2;
                    int measuredHeight20 = i13 - (GroupCallActivity.this.flipButton.getMeasuredHeight() / 2);
                    int measuredWidth22 = (getMeasuredWidth() - GroupCallActivity.this.flipButton.getMeasuredWidth()) >> 1;
                    GroupCallActivity.this.flipButton.layout(measuredWidth22, measuredHeight20, GroupCallActivity.this.flipButton.getMeasuredWidth() + measuredWidth22, GroupCallActivity.this.flipButton.getMeasuredHeight() + measuredHeight20);
                    int measuredHeight21 = i13 - (GroupCallActivity.this.speakerButtonContainer.getMeasuredHeight() / 2);
                    int measuredWidth23 = (getMeasuredWidth() - GroupCallActivity.this.speakerButtonContainer.getMeasuredWidth()) >> 1;
                    GroupCallActivity.this.speakerButtonContainer.layout(measuredWidth23, measuredHeight21, GroupCallActivity.this.speakerButtonContainer.getMeasuredWidth() + measuredWidth23, GroupCallActivity.this.speakerButtonContainer.getMeasuredHeight() + measuredHeight21);
                    int measuredHeight22 = (i13 + (i6 == 4 ? measuredHeight17 : 0)) - (GroupCallActivity.this.cameraButton.getMeasuredHeight() / 2);
                    int measuredWidth24 = (getMeasuredWidth() - GroupCallActivity.this.cameraButton.getMeasuredWidth()) >> 1;
                    GroupCallActivity.this.cameraButton.layout(measuredWidth24, measuredHeight22, GroupCallActivity.this.cameraButton.getMeasuredWidth() + measuredWidth24, GroupCallActivity.this.cameraButton.getMeasuredHeight() + measuredHeight22);
                }
                int i14 = measuredHeight17 / 2;
                int measuredHeight23 = ((i6 == 4 ? measuredHeight17 * 3 : measuredHeight17 * 2) + i14) - (GroupCallActivity.this.leaveButton.getMeasuredHeight() / 2);
                int measuredWidth25 = (getMeasuredWidth() - GroupCallActivity.this.leaveButton.getMeasuredWidth()) >> 1;
                GroupCallActivity.this.leaveButton.layout(measuredWidth25, measuredHeight23, GroupCallActivity.this.leaveButton.getMeasuredWidth() + measuredWidth25, GroupCallActivity.this.leaveButton.getMeasuredHeight() + measuredHeight23);
                int measuredWidth26 = (((i6 == 4 ? measuredHeight17 * 2 : measuredHeight17) + i14) - (GroupCallActivity.this.muteButton.getMeasuredWidth() / 2)) - AndroidUtilities.dp(4.0f);
                int measuredWidth27 = (getMeasuredWidth() - GroupCallActivity.this.muteButton.getMeasuredWidth()) >> 1;
                if (i6 == 3) {
                    measuredWidth26 -= AndroidUtilities.dp(6.0f);
                }
                GroupCallActivity.this.muteButton.layout(measuredWidth27, measuredWidth26, GroupCallActivity.this.muteButton.getMeasuredWidth() + measuredWidth27, GroupCallActivity.this.muteButton.getMeasuredHeight() + measuredWidth26);
                GroupCallActivity.this.minimizeButton.layout(measuredWidth27, measuredWidth26, GroupCallActivity.this.minimizeButton.getMeasuredWidth() + measuredWidth27, GroupCallActivity.this.minimizeButton.getMeasuredHeight() + measuredWidth26);
                GroupCallActivity.this.expandButton.layout(measuredWidth27, measuredWidth26, GroupCallActivity.this.expandButton.getMeasuredWidth() + measuredWidth27, GroupCallActivity.this.expandButton.getMeasuredHeight() + measuredWidth26);
                float dp8 = AndroidUtilities.dp(52.0f) / (GroupCallActivity.this.muteButton.getMeasuredWidth() - AndroidUtilities.dp(8.0f));
                GroupCallActivity.this.muteButton.animate().cancel();
                GroupCallActivity.this.muteButton.setScaleX(dp8);
                GroupCallActivity.this.muteButton.setScaleY(dp8);
                for (int i15 = 0; i15 < 2; i15++) {
                    int measuredWidth28 = (getMeasuredWidth() - GroupCallActivity.this.muteLabel[i15].getMeasuredWidth()) >> 1;
                    int i16 = i6 == 4 ? measuredHeight17 * 2 : measuredHeight17;
                    int measuredWidth29 = ((i14 + i16) - (GroupCallActivity.this.muteButton.getMeasuredWidth() / 2)) - AndroidUtilities.dp(4.0f);
                    if (i6 == 3) {
                        measuredWidth29 -= AndroidUtilities.dp(6.0f);
                    }
                    int measuredWidth30 = (int) (measuredWidth29 + (GroupCallActivity.this.muteButton.getMeasuredWidth() * 0.687f) + AndroidUtilities.dp(4.0f));
                    if (GroupCallActivity.this.muteLabel[i15].getMeasuredHeight() + measuredWidth30 > i16 + measuredHeight17) {
                        measuredWidth30 -= AndroidUtilities.dp(4.0f);
                    }
                    GroupCallActivity.this.muteLabel[i15].layout(measuredWidth28, measuredWidth30, GroupCallActivity.this.muteLabel[i15].getMeasuredWidth() + measuredWidth28, GroupCallActivity.this.muteLabel[i15].getMeasuredHeight() + measuredWidth30);
                    GroupCallActivity.this.muteLabel[i15].setScaleX(0.687f);
                    GroupCallActivity.this.muteLabel[i15].setScaleY(0.687f);
                }
            }
            if (GroupCallActivity.this.animateButtonsOnNextLayout) {
                AnimatorSet animatorSet = new AnimatorSet();
                int i17 = 0;
                boolean z3 = false;
                while (i17 < getChildCount()) {
                    View childAt = getChildAt(i17);
                    Float f = (Float) GroupCallActivity.this.buttonsAnimationParamsX.get(childAt);
                    Float f2 = (Float) GroupCallActivity.this.buttonsAnimationParamsY.get(childAt);
                    if (f == null || f2 == null) {
                        i5 = 1;
                    } else {
                        Property property = FrameLayout.TRANSLATION_X;
                        float floatValue = f.floatValue() - childAt.getLeft();
                        i5 = 1;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, floatValue, 0.0f));
                        animatorSet.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) FrameLayout.TRANSLATION_Y, f2.floatValue() - childAt.getTop(), 0.0f));
                        z3 = true;
                    }
                    i17 += i5;
                }
                if (z3) {
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
                            AnonymousClass18.this.currentButtonsAnimation = null;
                            for (int i18 = 0; i18 < AnonymousClass18.this.getChildCount(); i18++) {
                                View childAt2 = AnonymousClass18.this.getChildAt(i18);
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
        protected void dispatchDraw(android.graphics.Canvas r27) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.AnonymousClass18.dispatchDraw(android.graphics.Canvas):void");
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

    public void lambda$new$28(View view) {
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

    public void lambda$new$29(View view) {
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
                    GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) this.attachedRenderers.get(i);
                    ChatObject.VideoParticipant videoParticipant = groupCallMiniTextureView.participant;
                    if (videoParticipant.participant.self && !videoParticipant.presentation) {
                        groupCallMiniTextureView.startFlipAnimation();
                    }
                }
            }
        }
    }

    public void lambda$new$31(View view) {
        final int nextAudioOutputValue = getNextAudioOutputValue();
        this.cacheAudioOutputValue = Integer.valueOf(nextAudioOutputValue);
        updateState(true, true);
        this.cacheAudioOutputValue = null;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.this.lambda$new$30(nextAudioOutputValue);
            }
        });
    }

    public void lambda$new$30(int i) {
        setAudioOutputValue(i);
        BulletinFactory.of(this.topBulletinContainer, new DarkBlueThemeResourcesProvider()).createSimpleBulletin(getContext().getResources().getDrawable(getAudioOutputToastIcon(i)).mutate(), getAudioOutputToastText(i)).show(isBulletinTop());
    }

    public void lambda$new$32(Activity activity, View view) {
        this.renderersContainer.delayHideUi();
        ChatObject.Call call = this.call;
        if (call == null || call.isScheduled()) {
            dismiss();
        } else {
            updateItems();
            onLeaveClick(activity, new Runnable() {
                @Override
                public final void run() {
                    GroupCallActivity.this.dismiss();
                }
            }, false);
        }
    }

    public class AnonymousClass20 implements View.OnClickListener {
        Runnable finishRunnable = new Runnable() {
            @Override
            public void run() {
                GroupCallActivity.this.muteButton.setAnimation(GroupCallActivity.this.bigMicDrawable);
                GroupCallActivity.this.playingHandAnimation = false;
            }
        };

        AnonymousClass20() {
        }

        @Override
        public void onClick(View view) {
            int checkSelfPermission;
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
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    GroupCallActivity.this.startingGroupCall = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = GroupCallActivity.this.call.getInputGroupCall();
                    GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            GroupCallActivity.AnonymousClass20.this.lambda$onClick$1(tLObject, tL_error);
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
                    groupCallActivity2.accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            GroupCallActivity.AnonymousClass20.this.lambda$onClick$2(tLObject, tL_error);
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
                        } else {
                            if (Build.VERSION.SDK_INT >= 23 && GroupCallActivity.this.getParentActivity() != null) {
                                checkSelfPermission = GroupCallActivity.this.getParentActivity().checkSelfPermission("android.permission.RECORD_AUDIO");
                                if (checkSelfPermission != 0) {
                                    PermissionRequest.ensurePermission(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, "android.permission.RECORD_AUDIO", new Utilities.Callback() {
                                        @Override
                                        public final void run(Object obj) {
                                            ((Boolean) obj).booleanValue();
                                        }
                                    });
                                    return;
                                }
                            }
                            GroupCallActivity.this.updateMuteButton(1, true);
                            VoIPService.getSharedInstance().setMicMute(false, false, true);
                            GroupCallActivity.this.muteButton.performHapticFeedback(3, 2);
                        }
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                if (GroupCallActivity.this.isConference() || GroupCallActivity.this.playingHandAnimation) {
                    return;
                }
                GroupCallActivity.this.playingHandAnimation = true;
                AndroidUtilities.shakeView(GroupCallActivity.this.muteLabel[0]);
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused3) {
                }
                int nextInt = Utilities.random.nextInt(100);
                int i2 = 120;
                if (nextInt >= 32) {
                    i = 240;
                    if (nextInt < 64) {
                        i2 = 240;
                        i = 120;
                    } else {
                        i2 = 420;
                        if (nextInt >= 97) {
                            i = 540;
                            if (nextInt == 98) {
                                i2 = 540;
                                i = 420;
                            } else {
                                i2 = 720;
                            }
                        }
                    }
                }
                GroupCallActivity.this.handDrawables.setCustomEndFrame(i2);
                GroupCallActivity.this.handDrawables.setOnFinishCallback(this.finishRunnable, i2 - 1);
                GroupCallActivity.this.muteButton.setAnimation(GroupCallActivity.this.handDrawables);
                GroupCallActivity.this.handDrawables.setCurrentFrame(i);
                GroupCallActivity.this.muteButton.playAnimation();
                if (GroupCallActivity.this.muteButtonState == 2) {
                    GroupCallActivity groupCallActivity4 = GroupCallActivity.this;
                    long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) groupCallActivity4.call.participants.get(MessageObject.getPeerId(groupCallActivity4.selfPeer))).peer);
                    VoIPService.getSharedInstance().editCallMember(DialogObject.isUserDialog(peerId) ? GroupCallActivity.this.accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : GroupCallActivity.this.accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)), null, null, null, Boolean.TRUE, null);
                    GroupCallActivity.this.updateMuteButton(4, true);
                    return;
                }
                return;
            }
            if (GroupCallActivity.this.renderersContainer != null && GroupCallActivity.this.renderersContainer.inFullscreenMode && (AndroidUtilities.isTablet() || GroupCallActivity.isLandscapeMode == GroupCallActivity.this.isRtmpLandscapeMode())) {
                GroupCallActivity.this.fullscreenFor(null);
                if (GroupCallActivity.isLandscapeMode) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            GroupCallActivity.AnonymousClass20.this.lambda$onClick$0();
                        }
                    }, 200L);
                }
                GroupCallActivity.this.parentActivity.setRequestedOrientation(-1);
                return;
            }
            if (GroupCallActivity.this.visibleVideoParticipants.isEmpty()) {
                return;
            }
            ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) GroupCallActivity.this.visibleVideoParticipants.get(0);
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

        public void lambda$onClick$0() {
            GroupCallActivity.this.wasNotInLayoutFullscreen = null;
            GroupCallActivity.this.wasExpandBigSize = null;
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
    }

    public void lambda$new$33(int i) {
        this.actionBar.getActionBarMenuOnItemClick().onItemClick(i);
    }

    public void lambda$new$34(View view) {
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

    public void lambda$new$35(View view) {
        if (isRtmpStream()) {
            if (PipUtils.checkAnyPipPermissions(this.parentActivity)) {
                RTMPStreamPipOverlay.show(this.parentActivity);
                dismiss();
                return;
            } else {
                AlertsCreator.createDrawOverlayPermissionDialog(this.parentActivity, null, true).show();
                return;
            }
        }
        if (AndroidUtilities.checkInlinePermissions(this.parentActivity)) {
            GroupCallPip.clearForce();
            dismiss();
        } else {
            AlertsCreator.createDrawOverlayGroupCallPermissionDialog(getContext()).show();
        }
    }

    public void lambda$new$36(View view) {
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

    public class AnonymousClass21 extends AudioPlayerAlert.ClippingTextViewSwitcher {
        final Activity val$context;

        AnonymousClass21(Context context, Activity activity) {
            super(context);
            this.val$context = activity;
        }

        @Override
        protected TextView createTextView() {
            final TextView textView = new TextView(this.val$context);
            textView.setTextColor(Theme.getColor(Theme.key_voipgroup_actionBarItems));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(51);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    GroupCallActivity.AnonymousClass21.this.lambda$createTextView$0(textView, view);
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

    public void lambda$new$37(View view) {
        ChatObject.Call call = this.call;
        if (call == null || !call.recording) {
            return;
        }
        showRecordHint(this.actionBar.getTitleTextView());
    }

    public void lambda$new$38(View view, int i) {
        GroupCallFullscreenAdapter.GroupCallUserCell groupCallUserCell = (GroupCallFullscreenAdapter.GroupCallUserCell) view;
        if (groupCallUserCell.getVideoParticipant() == null) {
            fullscreenFor(new ChatObject.VideoParticipant(groupCallUserCell.getParticipant(), false, false));
        } else {
            fullscreenFor(groupCallUserCell.getVideoParticipant());
        }
    }

    public boolean lambda$new$39(View view, int i) {
        if (showMenuForCell(view)) {
            try {
                this.listView.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public class AnonymousClass29 extends GroupCallRenderersContainer {
        ValueAnimator uiVisibilityAnimator;

        AnonymousClass29(Context context, RecyclerView recyclerView, RecyclerView recyclerView2, ArrayList arrayList, ChatObject.Call call, GroupCallActivity groupCallActivity) {
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
                    if (GroupCallActivity.this.watchersView != null) {
                        GroupCallActivity.this.watchersView.setVisibility(0);
                    }
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
                    if (GroupCallActivity.this.watchersView != null) {
                        GroupCallActivity.this.watchersView.setVisibility(8);
                    }
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
            ValueAnimator ofFloat = ValueAnimator.ofFloat(GroupCallActivity.this.progressToHideUi, isUiVisible ? 0.0f : 1.0f);
            this.uiVisibilityAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    GroupCallActivity.AnonymousClass29.this.lambda$onUiVisibilityChanged$0(valueAnimator2);
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
                    AnonymousClass29 anonymousClass29 = AnonymousClass29.this;
                    anonymousClass29.uiVisibilityAnimator = null;
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

    public void lambda$new$44(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, final TLRPC.Chat chat, AccountInstance accountInstance, final TLRPC.InputPeer inputPeer, View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.scheduleAnimator = ofFloat;
        ofFloat.setDuration(600L);
        this.scheduleAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GroupCallActivity.this.lambda$new$40(valueAnimator);
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
            this.titleTextView.setText(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
        } else {
            this.titleTextView.setText(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
        }
        Calendar calendar = Calendar.getInstance();
        boolean checkScheduleDate = AlertsCreator.checkScheduleDate(null, null, 604800L, 3, numberPicker, numberPicker2, numberPicker3);
        calendar.setTimeInMillis(System.currentTimeMillis() + (numberPicker.getValue() * 86400000));
        calendar.set(11, numberPicker2.getValue());
        calendar.set(12, numberPicker3.getValue());
        if (checkScheduleDate) {
            calendar.set(13, 0);
        }
        this.scheduleStartAt = (int) (calendar.getTimeInMillis() / 1000);
        updateScheduleUI(false);
        TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
        creategroupcall.peer = MessagesController.getInputPeer(chat);
        creategroupcall.random_id = Utilities.random.nextInt();
        creategroupcall.schedule_date = this.scheduleStartAt;
        creategroupcall.flags |= 2;
        accountInstance.getConnectionsManager().sendRequest(creategroupcall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                GroupCallActivity.this.lambda$new$43(chat, inputPeer, tLObject, tL_error);
            }
        }, 2);
    }

    public void lambda$new$40(ValueAnimator valueAnimator) {
        this.switchToButtonProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateScheduleUI(true);
        this.buttonsContainer.invalidate();
        this.listView.invalidate();
    }

    public void lambda$new$43(final TLRPC.Chat chat, final TLRPC.InputPeer inputPeer, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            int i = 0;
            while (true) {
                if (i >= updates.updates.size()) {
                    break;
                }
                TLRPC.Update update = updates.updates.get(i);
                if (update instanceof TLRPC.TL_updateGroupCall) {
                    final TLRPC.TL_updateGroupCall tL_updateGroupCall = (TLRPC.TL_updateGroupCall) update;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            GroupCallActivity.this.lambda$new$41(chat, inputPeer, tL_updateGroupCall);
                        }
                    });
                    break;
                }
                i++;
            }
            this.accountInstance.getMessagesController().processUpdates(updates, false);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.this.lambda$new$42(tL_error);
            }
        });
    }

    public void lambda$new$41(TLRPC.Chat chat, TLRPC.InputPeer inputPeer, TLRPC.TL_updateGroupCall tL_updateGroupCall) {
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
        MessagesController messagesController = this.accountInstance.getMessagesController();
        ChatObject.Call call4 = this.call;
        messagesController.putGroupCall(call4.chatId, call4);
    }

    public void lambda$new$42(TLRPC.TL_error tL_error) {
        this.accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, tL_error.text);
        dismiss();
    }

    public static String lambda$new$45(long j, Calendar calendar, int i, int i2) {
        if (i2 == 0) {
            return LocaleController.getString(R.string.MessageScheduleToday);
        }
        long j2 = j + (i2 * 86400000);
        calendar.setTimeInMillis(j2);
        if (calendar.get(1) == i) {
            return LocaleController.getInstance().getFormatterWeek().format(j2) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j2);
        }
        return LocaleController.getInstance().getFormatterScheduleYear().format(j2);
    }

    public void lambda$new$46(NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, int i, int i2) {
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AlertsCreator.checkScheduleDate(this.scheduleButtonTextView, this.scheduleInfoTextView, 604800L, 2, numberPicker, numberPicker2, numberPicker3);
    }

    public static String lambda$new$47(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public static String lambda$new$48(int i) {
        return String.format("%02d", Integer.valueOf(i));
    }

    public void lambda$new$49(Activity activity, View view) {
        LaunchActivity launchActivity;
        int checkSelfPermission;
        if (Build.VERSION.SDK_INT >= 23 && (launchActivity = this.parentActivity) != null) {
            checkSelfPermission = launchActivity.checkSelfPermission("android.permission.CAMERA");
            if (checkSelfPermission != 0) {
                this.parentActivity.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                return;
            }
        }
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        boolean z = true;
        if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
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
                    final GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) this.attachedRenderersTmp.get(i);
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
                    final GroupCallMiniTextureView groupCallMiniTextureView2 = (GroupCallMiniTextureView) this.attachedRenderersTmp.get(i2);
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
                            GroupCallActivity.this.lambda$fullscreenFor$50(arrayList);
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
            return;
        }
        if (this.listView.getVisibility() != 0) {
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
            return;
        }
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

    public void lambda$fullscreenFor$50(ArrayList arrayList) {
        for (int i = 0; i < this.attachedRenderers.size(); i++) {
            if (((GroupCallMiniTextureView) this.attachedRenderers.get(i)).participant != null) {
                arrayList.remove(((GroupCallMiniTextureView) this.attachedRenderers.get(i)).participant);
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
                this.leaveItem.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                this.leaveItem.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
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
        this.speakerButton.setAlpha(f);
        this.speakerButtonContainer.setScaleY(interpolation);
        this.speakerButtonContainer.setScaleX(interpolation);
        this.otherItem.setAlpha(f);
        int i = f3 != 0.0f ? 0 : 4;
        if (i != this.scheduleTimerContainer.getVisibility()) {
            this.scheduleTimerContainer.setVisibility(i);
            this.scheduleButtonTextView.setVisibility(i);
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
        this.actionBar.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
        this.call.saveActiveDates();
        VoIPService.getSharedInstance().registerStateListener(this);
        SimpleTextView simpleTextView = this.scheduleTimeTextView;
        if (simpleTextView == null || simpleTextView.getVisibility() != 0) {
            return;
        }
        this.leaveButton.setData(R.drawable.msg_voiceclose, -1, Theme.getColor(Theme.key_voipgroup_leaveButton), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
        updateSpeakerPhoneIcon(true);
        this.leaveItem.setText(LocaleController.getString(ChatObject.isChannelOrGiga(this.currentChat) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat));
        this.listView.setVisibility(0);
        this.pipItem.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        RecyclerListView recyclerListView = this.listView;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(recyclerListView, (Property<RecyclerListView, Float>) property, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.listView, (Property<RecyclerListView, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
        SimpleTextView simpleTextView2 = this.scheduleTimeTextView;
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(simpleTextView2, (Property<SimpleTextView, Float>) property2, 0.0f);
        SimpleTextView simpleTextView3 = this.scheduleTimeTextView;
        Property property3 = View.SCALE_Y;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(simpleTextView3, (Property<SimpleTextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.scheduleTimeTextView, (Property<SimpleTextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartInTextView, (Property<SimpleTextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartInTextView, (Property<SimpleTextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartInTextView, (Property<SimpleTextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartAtTextView, (Property<SimpleTextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartAtTextView, (Property<SimpleTextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.scheduleStartAtTextView, (Property<SimpleTextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.pipItem, (Property<ActionBarMenuItem, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.pipItem, (Property<ActionBarMenuItem, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.pipItem, (Property<ActionBarMenuItem, Float>) property, 0.0f, 1.0f));
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
        WatchersView watchersView;
        if (this.actionBar == null || this.call == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i = 0;
        for (int i2 = 0; i2 < this.call.currentSpeakingPeers.size(); i2++) {
            long keyAt = this.call.currentSpeakingPeers.keyAt(i2);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.call.currentSpeakingPeers.get(keyAt);
            if (!groupCallParticipant.self && !this.renderersContainer.isVisible(groupCallParticipant) && this.visiblePeerIds.get(keyAt, 0) != 1) {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                }
                if (i < 2) {
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

    @Override
    public void show() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 2048);
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
                ((GroupCallMiniTextureView) this.attachedRenderersTmp.get(i)).saveThumb();
                this.renderersContainer.removeView((View) this.attachedRenderersTmp.get(i));
                ((GroupCallMiniTextureView) this.attachedRenderersTmp.get(i)).release();
                ((GroupCallMiniTextureView) this.attachedRenderersTmp.get(i)).forceDetach(true);
            }
            this.attachedRenderers.clear();
            if (this.renderersContainer.getParent() != null) {
                this.attachedRenderers.clear();
                this.containerView.removeView(this.renderersContainer);
            }
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 2048);
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
                this.titleTextView.setText(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z);
                return;
            } else {
                this.titleTextView.setText(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z);
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
                            GroupCallActivity.this.lambda$updateTitle$51(view);
                        }
                    });
                } else {
                    this.actionBar.setTitle(this.call.call.title);
                }
                this.titleTextView.setText(this.call.call.title, z);
            }
        } else {
            TLRPC.Chat chat = this.currentChat;
            if (chat != null && !chat.title.equals(this.actionBar.getTitle())) {
                if (z) {
                    this.actionBar.setTitleAnimated(this.currentChat.title, true, 180L);
                    this.actionBar.getTitleTextView().setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            GroupCallActivity.this.lambda$updateTitle$52(view);
                        }
                    });
                } else {
                    this.actionBar.setTitle(this.currentChat.title);
                }
                if (ChatObject.isChannelOrGiga(this.currentChat)) {
                    if (isRtmpStream()) {
                        this.titleTextView.setText(this.currentChat.title, z);
                    } else {
                        this.titleTextView.setText(LocaleController.getString(R.string.VoipChannelVoiceChat), z);
                    }
                } else {
                    this.titleTextView.setText(LocaleController.getString(R.string.VoipGroupVoiceChat), z);
                }
            } else if (this.currentChat == null) {
                ActionBar actionBar = this.actionBar;
                int i = R.string.ConferenceChat;
                actionBar.setTitle(LocaleController.getString(i));
                this.titleTextView.setText(LocaleController.getString(i), z);
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
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() != null) {
            titleTextView.setRightDrawable((Drawable) null);
            this.titleTextView.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.titleTextView.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void lambda$updateTitle$51(View view) {
        ChatObject.Call call = this.call;
        if (call == null || !call.recording) {
            return;
        }
        showRecordHint(this.actionBar.getTitleTextView());
    }

    public void lambda$updateTitle$52(View view) {
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
        CallEncryptionCellDrawable callEncryptionCellDrawable = this.encryptionDrawable;
        if (callEncryptionCellDrawable != null) {
            callEncryptionCellDrawable.setPaintBackgroundColor(offsetColor2);
        }
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

    public void getLink(final boolean z) {
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLRPC.Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(getChatId()));
        if (chat != null && !ChatObject.isPublic(chat)) {
            final TLRPC.ChatFull chatFull = this.accountInstance.getMessagesController().getChatFull(getChatId());
            String publicUsername = ChatObject.getPublicUsername(this.currentChat);
            if (TextUtils.isEmpty(publicUsername)) {
                str = (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) ? null : tL_chatInviteExported.link;
            } else {
                str = this.accountInstance.getMessagesController().linkPrefix + "/" + publicUsername;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.currentChat);
                this.accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        GroupCallActivity.this.lambda$getLink$54(chatFull, z, tLObject, tL_error);
                    }
                });
                return;
            }
            openShareAlert(true, null, str, z);
            return;
        }
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
                    GroupCallActivity.this.lambda$getLink$56(i, z, tLObject, tL_error);
                }
            });
            i++;
        }
    }

    public void lambda$getLink$54(final TLRPC.ChatFull chatFull, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.this.lambda$getLink$53(tLObject, chatFull, z);
            }
        });
    }

    public void lambda$getLink$53(TLObject tLObject, TLRPC.ChatFull chatFull, boolean z) {
        if (tLObject instanceof TLRPC.TL_chatInviteExported) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported;
            } else {
                openShareAlert(true, null, tL_chatInviteExported.link, z);
            }
        }
    }

    public void lambda$getLink$56(final int i, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.this.lambda$getLink$55(tLObject, i, z);
            }
        });
    }

    public void lambda$getLink$55(TLObject tLObject, int i, boolean z) {
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
        if (strArr[0] == null && strArr[1] == null && ChatObject.isPublic(this.currentChat)) {
            openShareAlert(true, null, this.accountInstance.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(this.currentChat), z);
            return;
        }
        String[] strArr2 = this.invites;
        openShareAlert(false, strArr2[0], strArr2[1], z);
    }

    private void openShareAlert(boolean r16, java.lang.String r17, java.lang.String r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.openShareAlert(boolean, java.lang.String, java.lang.String, boolean):void");
    }

    public void lambda$openShareAlert$57(DialogInterface dialogInterface) {
        this.shareAlert = null;
    }

    public void lambda$openShareAlert$58() {
        ShareAlert shareAlert = this.shareAlert;
        if (shareAlert != null) {
            shareAlert.show();
        }
    }

    public void inviteUserToCall(final long j, final boolean z) {
        final TLRPC.User user;
        if (this.call == null || (user = this.accountInstance.getMessagesController().getUser(Long.valueOf(j))) == null) {
            return;
        }
        final AlertDialog[] alertDialogArr = {new AlertDialog(getContext(), 3)};
        final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
        invitetogroupcall.call = this.call.getInputGroupCall();
        TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
        tL_inputUser.user_id = user.id;
        tL_inputUser.access_hash = user.access_hash;
        invitetogroupcall.users.add(tL_inputUser);
        final int sendRequest = this.accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                GroupCallActivity.this.lambda$inviteUserToCall$61(j, alertDialogArr, user, z, invitetogroupcall, tLObject, tL_error);
            }
        });
        if (sendRequest != 0) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GroupCallActivity.this.lambda$inviteUserToCall$63(alertDialogArr, sendRequest);
                }
            }, 500L);
        }
    }

    public void lambda$inviteUserToCall$61(final long j, final AlertDialog[] alertDialogArr, final TLRPC.User user, final boolean z, final TL_phone.inviteToGroupCall invitetogroupcall, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            this.accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GroupCallActivity.this.lambda$inviteUserToCall$59(j, alertDialogArr, user);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GroupCallActivity.this.lambda$inviteUserToCall$60(alertDialogArr, z, tL_error, j, invitetogroupcall);
                }
            });
        }
    }

    public void lambda$inviteUserToCall$59(long j, AlertDialog[] alertDialogArr, TLRPC.User user) {
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
        getUndoView().showWithAction(0L, 34, user, this.currentChat, (Runnable) null, (Runnable) null);
    }

    public void lambda$inviteUserToCall$60(AlertDialog[] alertDialogArr, boolean z, TLRPC.TL_error tL_error, long j, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
        if (z && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            processSelectedOption(null, j, 3);
        } else {
            AlertsCreator.processError(this.currentAccount, tL_error, (BaseFragment) this.parentActivity.getActionBarLayout().getFragmentStack().get(this.parentActivity.getActionBarLayout().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
        }
    }

    public void lambda$inviteUserToCall$63(AlertDialog[] alertDialogArr, final int i) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                GroupCallActivity.this.lambda$inviteUserToCall$62(i, dialogInterface);
            }
        });
        alertDialogArr[0].show();
    }

    public void lambda$inviteUserToCall$62(int i, DialogInterface dialogInterface) {
        this.accountInstance.getConnectionsManager().cancelRequest(i, true);
    }

    public void invalidateActionBarAlpha() {
        ActionBar actionBar = this.actionBar;
        actionBar.setAlpha((actionBar.getTag() != null ? 1.0f : 0.0f) * (1.0f - this.renderersContainer.progressToFullscreenMode));
    }

    public void updateLayout(boolean z) {
        boolean z2 = true;
        int childCount = this.listView.getChildCount();
        float f = 2.1474836E9f;
        for (int i = 0; i < childCount; i++) {
            if (this.listView.getChildAdapterPosition(this.listView.getChildAt(i)) >= 0) {
                f = Math.min(f, r8.getTop());
            }
        }
        if (f < 0.0f || f == 2.1474836E9f) {
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<SimpleTextView, Float>) property, this.actionBar.getSubtitleTextView().getTranslationY(), z3 ? 0.0f : AndroidUtilities.dp(20.0f));
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
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.actionBar.getAdditionalSubtitleTextView(), (Property<SimpleTextView, Float>) property, z3 ? 0.0f : AndroidUtilities.dp(20.0f));
            this.additionalSubtitleYAnimator = ofFloat2;
            ofFloat2.setDuration(300L);
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
        if (this.scrollOffsetY != currentActionBarHeight) {
            setScrollOffsetY(currentActionBarHeight);
        }
    }

    public void invalidateScrollOffsetY() {
        setScrollOffsetY(this.scrollOffsetY);
    }

    private void setScrollOffsetY(float f) {
        int i;
        this.scrollOffsetY = f;
        this.listView.setTopGlowOffset((int) (f - ((FrameLayout.LayoutParams) this.listView.getLayoutParams()).topMargin));
        float dp = f - AndroidUtilities.dp(74.0f);
        if (this.backgroundPaddingTop + dp < ActionBar.getCurrentActionBarHeight() * 2) {
            float min = Math.min(1.0f, (((ActionBar.getCurrentActionBarHeight() * 2) - dp) - this.backgroundPaddingTop) / (((r0 - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)) + ActionBar.getCurrentActionBarHeight()));
            i = (int) (AndroidUtilities.dp(AndroidUtilities.isTablet() ? 17.0f : 13.0f) * min);
            LightningView lightningView = this.textureLightningView;
            if (lightningView != null) {
                lightningView.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.colorProgress) > 1.0E-4f) {
                setColorProgress(Math.min(1.0f, min));
            }
            float f2 = 1.0f - ((0.1f * min) * 1.2f);
            this.titleTextView.setScaleX(Math.max(0.9f, f2));
            this.titleTextView.setScaleY(Math.max(0.9f, f2));
            float f3 = 1.0f - (min * 1.2f);
            this.titleTextView.setAlpha(Math.max(0.0f, f3) * (1.0f - this.renderersContainer.progressToFullscreenMode));
            this.liveLabelTextView.setScaleX(Math.max(0.9f, f2));
            this.liveLabelTextView.setScaleY(Math.max(0.9f, f2));
            this.liveLabelTextView.setAlpha(Math.max(0.0f, f3) * (1.0f - this.renderersContainer.progressToFullscreenMode));
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
            i = 0;
        }
        float f4 = i;
        this.menuItemsContainer.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f - AndroidUtilities.dp(53.0f)) - f4));
        this.titleLayout.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f - AndroidUtilities.dp(44.0f)) - f4));
        LightningView lightningView2 = this.textureLightningView;
        if (lightningView2 != null) {
            lightningView2.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f - AndroidUtilities.dp(37.0f)));
        }
        LinearLayout linearLayout = this.scheduleTimerContainer;
        if (linearLayout != null) {
            linearLayout.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f - AndroidUtilities.dp(44.0f)) - f4));
        }
        this.containerView.invalidate();
        updateTopBulletinY();
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

    public void updateState(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.updateState(boolean, boolean):void");
    }

    private void updateLiveLabel(boolean z) {
        if (isRtmpStream()) {
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
                if (z) {
                    final int color = this.liveLabelPaint.getColor();
                    final int i2 = z3 ? -1163700 : -12761513;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.liveLabelBgColorAnimator = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            GroupCallActivity.this.lambda$updateLiveLabel$64(color, i2, z3, valueAnimator2);
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
                    return;
                }
                this.liveLabelPaint.setColor(this.currentCallState == 3 ? -1163700 : -12761513);
                this.liveLabelTextView.invalidate();
                return;
            }
            return;
        }
        this.liveLabelTextView.setVisibility(8);
    }

    public void lambda$updateLiveLabel$64(int i, int i2, boolean z, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.liveLabelPaint.setColor(AndroidUtilities.getOffsetColor(i, i2, floatValue, 1.0f));
        this.liveLabelTextView.invalidate();
        if (!z) {
            floatValue = 1.0f - floatValue;
        }
        this.textureLightningViewAnimatingAlpha = floatValue;
        LightningView lightningView = this.textureLightningView;
        if (lightningView == null || !this.needTextureLightning) {
            return;
        }
        lightningView.invalidate();
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
            ((GroupCallMiniTextureView) this.attachedRenderersTmp.get(i)).updateAttachState(true);
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
        if (this.speakerButtonContainer.getVisibility() == 0) {
            this.speakerButton.setData(0, -1, 0, 1.0f, true, getAudioOutputName(getAudioOutputValue()), false, false);
            this.speakerButton.setChecked(getAudioOutputActive(getAudioOutputValue()), z);
        }
    }

    public void updateMuteButton(int r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.updateMuteButton(int, boolean):void");
    }

    public void lambda$updateMuteButton$65(float f, View view, ValueAnimator valueAnimator) {
        if (!isLandscapeMode && !isRtmpStream()) {
            f = AndroidUtilities.lerp(1.0f, f, this.renderersContainer.progressToFullscreenMode);
        }
        view.setScaleY(f);
    }

    public void lambda$updateMuteButton$66(float f, View view, View view2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (!isLandscapeMode && !isRtmpStream()) {
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

    public void lambda$updateMuteButton$67(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.muteLabel[0].setAlpha(1.0f - floatValue);
        this.muteLabel[0].setTranslationY(AndroidUtilities.dp(5.0f) * floatValue);
        this.muteLabel[1].setAlpha(floatValue);
        this.muteLabel[1].setTranslationY(AndroidUtilities.dp((floatValue * 5.0f) - 5.0f));
    }

    public void fillColors(int i, int[] iArr) {
        if (isRtmpStream()) {
            int i2 = Theme.key_voipgroup_disabledButton;
            iArr[0] = Theme.getColor(i2);
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_rtmpButton), Theme.getColor(Theme.key_voipgroup_soundButtonActiveScrolled), this.colorProgress, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_listViewBackgroundUnscrolled), Theme.getColor(i2), this.colorProgress, 1.0f);
        } else if (i == 0) {
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
            int i3 = Theme.key_voipgroup_disabledButton;
            iArr[0] = Theme.getColor(i3);
            iArr[1] = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_disabledButtonActive), Theme.getColor(Theme.key_voipgroup_disabledButtonActiveScrolled), this.colorProgress, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(Theme.getColor(Theme.key_voipgroup_listViewBackgroundUnscrolled), Theme.getColor(i3), this.colorProgress, 1.0f);
        }
        if (isGradientState(i)) {
            iArr[3] = ColorUtils.blendARGB(Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient), Theme.getColor(Theme.key_voipgroup_mutedByAdminGradient3), 0.5f);
        } else if (i == 1) {
            iArr[3] = ColorUtils.blendARGB(Theme.getColor(Theme.key_voipgroup_soundButtonActive2), ColorUtils.blendARGB(Theme.getColor(Theme.key_voipgroup_muteButton), Theme.getColor(Theme.key_voipgroup_muteButton3), 0.5f), 0.75f);
        } else {
            iArr[3] = ColorUtils.blendARGB(Theme.getColor(Theme.key_voipgroup_unmuteButton2), Theme.getColor(Theme.key_voipgroup_unmuteButton), 0.5f);
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

    private void updateMuteButtonState(boolean z) {
        boolean z2;
        this.muteButton.invalidate();
        WeavingState[] weavingStateArr = this.states;
        int i = this.muteButtonState;
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
            boolean z3 = false;
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
                TLRPC.GroupCall groupCall = call.call;
                groupCall.participants_count--;
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

    public static void onLeaveClick(Context context, Runnable runnable, boolean z) {
        onLeaveClick(context, runnable, z, false);
    }

    public static void onLeaveClick(Context context, final Runnable runnable, boolean z, boolean z2) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        final ChatObject.Call call = sharedInstance.groupCall;
        final long selfId = sharedInstance.getSelfId();
        if (z2 || !ChatObject.canManageCalls(chat)) {
            processOnLeave(call, false, selfId, runnable);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
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
        final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
            CheckBoxCell checkBoxCell = new CheckBoxCell(context, 1);
            checkBoxCellArr[0] = checkBoxCell;
            checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
            if (z) {
                checkBoxCellArr[0].setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
            } else {
                checkBoxCellArr[0].setTextColor(Theme.getColor(Theme.key_voipgroup_actionBarItems));
                ((CheckBoxSquare) checkBoxCellArr[0].getCheckBoxView()).setColors(Theme.key_voipgroup_mutedIcon, Theme.key_voipgroup_listeningText, Theme.key_voipgroup_nameText);
            }
            checkBoxCellArr[0].setTag(0);
            if (sharedInstance.isConference()) {
                checkBoxCellArr[0].setText(LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertEndChat), "", false, false);
            } else if (ChatObject.isChannelOrGiga(chat)) {
                checkBoxCellArr[0].setText(LocaleController.getString(R.string.VoipChannelLeaveAlertEndChat), "", false, false);
            } else {
                checkBoxCellArr[0].setText(LocaleController.getString(R.string.VoipGroupLeaveAlertEndChat), "", false, false);
            }
            checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            linearLayout.addView(checkBoxCellArr[0], LayoutHelper.createLinear(-1, -2));
            checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    GroupCallActivity.lambda$onLeaveClick$68(checkBoxCellArr, view);
                }
            });
        }
        builder.setView(linearLayout);
        builder.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
        builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupLeave), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                GroupCallActivity.lambda$onLeaveClick$69(ChatObject.Call.this, checkBoxCellArr, selfId, runnable, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
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

    public static void lambda$onLeaveClick$68(CheckBoxCell[] checkBoxCellArr, View view) {
        checkBoxCellArr[((Integer) view.getTag()).intValue()].setChecked(!checkBoxCellArr[r2.intValue()].isChecked(), true);
    }

    public static void lambda$onLeaveClick$69(ChatObject.Call call, CheckBoxCell[] checkBoxCellArr, long j, Runnable runnable, AlertDialog alertDialog, int i) {
        boolean z = false;
        CheckBoxCell checkBoxCell = checkBoxCellArr[0];
        if (checkBoxCell != null && checkBoxCell.isChecked()) {
            z = true;
        }
        processOnLeave(call, z, j, runnable);
    }

    public void processSelectedOption(TLRPC.GroupCallParticipant groupCallParticipant, final long j, int i) {
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
            boolean z = tLObject instanceof TLRPC.User;
            if (z) {
                TLRPC.User user = (TLRPC.User) tLObject;
                backupImageView.setForUserOrChat(user, avatarDrawable);
                str = UserObject.getFirstName(user);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject;
                backupImageView.setForUserOrChat(chat2, avatarDrawable);
                str = chat2.title;
            }
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(Theme.getColor(i2));
            textView3.setTextSize(1, 20.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setLines(1);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            TLRPC.Chat chat3 = this.currentChat;
            String str2 = chat3 != null ? chat3.title : "";
            if (i == 2) {
                if (isConference()) {
                    textView3.setText(LocaleController.getString(R.string.VoipConferenceRemoveMemberAlertTitle2));
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipConferenceRemoveMemberAlertText2, str)));
                } else {
                    textView3.setText(LocaleController.getString(R.string.VoipGroupRemoveMemberAlertTitle2));
                    if (ChatObject.isChannelOrGiga(this.currentChat)) {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChannelRemoveMemberAlertText2, str, str2)));
                    } else {
                        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipGroupRemoveMemberAlertText2, str, str2)));
                    }
                }
            } else {
                textView3.setText(LocaleController.getString(R.string.VoipGroupAddMemberTitle));
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipGroupAddMemberText, str, str2)));
            }
            boolean z2 = LocaleController.isRTL;
            frameLayout.addView(textView3, LayoutHelper.createFrame(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 76, 11.0f, z2 ? 76 : 21, 0.0f));
            frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (i == 2) {
                builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupUserRemove), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        GroupCallActivity.this.lambda$processSelectedOption$70(tLObject, alertDialog, i3);
                    }
                });
            } else if (z) {
                final TLRPC.User user2 = (TLRPC.User) tLObject;
                builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupAdd), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        GroupCallActivity.this.lambda$processSelectedOption$72(user2, j, alertDialog, i3);
                    }
                });
            }
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog create = builder.create();
            create.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_dialogBackground));
            create.show();
            if (i != 2 || (textView = (TextView) create.getButton(-1)) == null) {
                return;
            }
            textView.setTextColor(Theme.getColor(Theme.key_voipgroup_leaveCallMenu));
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
            this.parentActivity.lambda$runLinkRequest$95(new ChatActivity(bundle));
            dismiss();
            return;
        }
        if (i == 8) {
            this.parentActivity.switchToAccount(this.currentAccount, true);
            BaseFragment baseFragment = (BaseFragment) this.parentActivity.getActionBarLayout().getFragmentStack().get(this.parentActivity.getActionBarLayout().getFragmentStack().size() - 1);
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
            this.parentActivity.lambda$runLinkRequest$95(new ChatActivity(bundle2));
            dismiss();
            return;
        }
        if (i == 7) {
            sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, Boolean.FALSE, null);
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
                this.currentAvatarUpdater.parentFragment = this.parentActivity.getActionBarLayout().getLastFragment();
                ImageUpdater imageUpdater3 = this.currentAvatarUpdater;
                AvatarUpdaterDelegate avatarUpdaterDelegate = new AvatarUpdaterDelegate(j);
                this.avatarUpdaterDelegate = avatarUpdaterDelegate;
                imageUpdater3.setDelegate(avatarUpdaterDelegate);
                ImageUpdater imageUpdater4 = this.currentAvatarUpdater;
                TLRPC.UserProfilePhoto userProfilePhoto = currentUser.photo;
                imageUpdater4.openMenu((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new Runnable() {
                    @Override
                    public final void run() {
                        GroupCallActivity.this.lambda$processSelectedOption$73();
                    }
                }, new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        GroupCallActivity.lambda$processSelectedOption$74(dialogInterface);
                    }
                }, 0);
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
            sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
            getUndoView().showWithAction(0L, 35, tLObject);
            sharedInstance.setParticipantVolume(groupCallParticipant, 0);
            return;
        }
        if ((groupCallParticipant.flags & 128) != 0 && groupCallParticipant.volume == 0) {
            groupCallParticipant.volume = 10000;
            groupCallParticipant.volume_by_admin = false;
            sharedInstance.editCallMember(tLObject, Boolean.FALSE, null, 10000, null, null);
        } else {
            sharedInstance.editCallMember(tLObject, Boolean.FALSE, null, null, null, null);
        }
        sharedInstance.setParticipantVolume(groupCallParticipant, ChatObject.getParticipantVolume(groupCallParticipant));
        getUndoView().showWithAction(0L, i == 1 ? 31 : 36, tLObject, (Object) null, (Runnable) null, (Runnable) null);
    }

    public void lambda$processSelectedOption$70(TLObject tLObject, AlertDialog alertDialog, int i) {
        ConferenceCall conferenceCall;
        if (isConference()) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance == null || (conferenceCall = sharedInstance.conference) == null || !(tLObject instanceof TLRPC.User)) {
                return;
            }
            TLRPC.User user = (TLRPC.User) tLObject;
            conferenceCall.kick(user.id);
            this.call.addKickedUser(user.id);
            getUndoView().showWithAction(0L, 102, user, (Object) null, (Runnable) null, (Runnable) null);
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            this.accountInstance.getMessagesController().deleteParticipantFromChat(getChatId(), user2);
            getUndoView().showWithAction(0L, 32, user2, (Object) null, (Runnable) null, (Runnable) null);
        } else {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            this.accountInstance.getMessagesController().deleteParticipantFromChat(getChatId(), (TLRPC.User) null, chat, false, false);
            getUndoView().showWithAction(0L, 32, chat, (Object) null, (Runnable) null, (Runnable) null);
        }
    }

    public void lambda$processSelectedOption$72(TLRPC.User user, final long j, AlertDialog alertDialog, int i) {
        this.accountInstance.getMessagesController().addUserToChat(getChatId(), user, 0, null, (BaseFragment) this.parentActivity.getActionBarLayout().getFragmentStack().get(this.parentActivity.getActionBarLayout().getFragmentStack().size() - 1), new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.this.lambda$processSelectedOption$71(j);
            }
        });
    }

    public void lambda$processSelectedOption$71(long j) {
        inviteUserToCall(j, false);
    }

    public void lambda$processSelectedOption$73() {
        this.accountInstance.getMessagesController().deleteUserPhoto(null);
    }

    public boolean showMenuForCell(android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.showMenuForCell(android.view.View):boolean");
    }

    public void lambda$showMenuForCell$75(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.scrimPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.scrimPopupWindow.dismiss();
        }
    }

    public void lambda$showMenuForCell$76(int i, ArrayList arrayList, TLRPC.GroupCallParticipant groupCallParticipant, View view) {
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
        if (launchActivity != null) {
            this.parentActivity.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
        }
    }

    private void runAvatarPreviewTransition(final boolean r17, org.telegram.ui.Cells.GroupCallUserCell r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.runAvatarPreviewTransition(boolean, org.telegram.ui.Cells.GroupCallUserCell):void");
    }

    public void lambda$runAvatarPreviewTransition$77(float f, float f2, float f3, int i, ValueAnimator valueAnimator) {
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
        int i2 = (int) (i * (1.0f - this.progressToAvatarPreview));
        profileGalleryView.setRoundRadius(i2, i2);
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
            int size = i2 + GroupCallActivity.this.visibleVideoParticipants.size();
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
                this.rowsCount += GroupCallActivity.this.call.visibleParticipants.size();
            }
            this.usersEndRow = this.rowsCount;
            if (GroupCallActivity.this.call.invitedUsers.isEmpty() || GroupCallActivity.this.isRtmpStream()) {
                this.invitedStartRow = -1;
                this.invitedEndRow = -1;
            } else {
                int i5 = this.rowsCount;
                this.invitedStartRow = i5;
                int size2 = i5 + GroupCallActivity.this.call.invitedUsers.size();
                this.rowsCount = size2;
                this.invitedEndRow = size2;
            }
            if (GroupCallActivity.this.call.shadyJoinParticipants.isEmpty() || GroupCallActivity.this.isRtmpStream()) {
                this.shadyJoinStartRow = -1;
                this.shadyJoinEndRow = -1;
            } else {
                int i6 = this.rowsCount;
                this.shadyJoinStartRow = i6;
                int size3 = i6 + GroupCallActivity.this.call.shadyJoinParticipants.size();
                this.rowsCount = size3;
                this.shadyJoinEndRow = size3;
            }
            if (GroupCallActivity.this.call.shadyLeftParticipants.isEmpty() || GroupCallActivity.this.isRtmpStream()) {
                this.shadyLeftStartRow = -1;
                this.shadyLeftEndRow = -1;
            } else {
                int i7 = this.rowsCount;
                this.shadyLeftStartRow = i7;
                int size4 = i7 + GroupCallActivity.this.call.shadyLeftParticipants.size();
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
                return;
            }
            if (itemViewType == 2) {
                GroupCallInvitedCell groupCallInvitedCell = (GroupCallInvitedCell) viewHolder.itemView;
                int i2 = GroupCallActivity.this.actionBar.getTag() != null ? Theme.key_voipgroup_mutedIcon : Theme.key_voipgroup_mutedIconUnscrolled;
                groupCallInvitedCell.setGrayIconColor(i2, Theme.getColor(i2));
                groupCallInvitedCell.setDrawDivider(viewHolder.getAdapterPosition() != getItemCount() - 2);
            }
        }

        @Override
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r17, int r18) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallActivity.ListAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return (itemViewType == 3 || itemViewType == 4 || itemViewType == 5 || itemViewType == 6) ? false : true;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            GroupCallGridCell groupCallGridCell;
            boolean z = false;
            if (i == 0) {
                view = new GroupCallTextCell(this.mContext) {
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
                    protected void lambda$new$5(GroupCallUserCell groupCallUserCell) {
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
            } else if (i != 2) {
                if (i == 4) {
                    groupCallGridCell = new GroupCallGridCell(this.mContext, z) {
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
                    view = new View(this.mContext) {
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
                        textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", GroupCallActivity.this.accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                        groupCallGridCell = textView;
                    } else {
                        textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", GroupCallActivity.this.accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                        groupCallGridCell = textView;
                    }
                } else if (i == 7) {
                    if (GroupCallActivity.this.encryptionDrawable == null) {
                        GroupCallActivity.this.encryptionDrawable = new CallEncryptionCellDrawable(this.mContext);
                    }
                    view = new CallEncryptionCell(this.mContext, GroupCallActivity.this.encryptionDrawable);
                } else {
                    view = new View(this.mContext);
                }
                view = groupCallGridCell;
            } else {
                view = new GroupCallInvitedCell(this.mContext) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        if (AndroidUtilities.isTablet()) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i2)), 1073741824), i3);
                        } else {
                            super.onMeasure(i2, i3);
                        }
                    }
                };
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
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
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = this.call.getInputGroupCall();
        togglegroupcallsettings.join_muted = this.call.call.join_muted;
        togglegroupcallsettings.flags |= 1;
        this.accountInstance.getConnectionsManager().sendRequest(togglegroupcallsettings, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                GroupCallActivity.this.lambda$toggleAdminSpeak$78(tLObject, tL_error);
            }
        });
    }

    public void lambda$toggleAdminSpeak$78(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            this.accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override
    public void onBackPressed() {
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
            super.onBackPressed();
        }
    }

    public class AvatarUpdaterDelegate implements ImageUpdater.ImageUpdaterDelegate {
        private TLRPC.FileLocation avatar;
        private TLRPC.FileLocation avatarBig;
        private final long peerId;
        private ImageLocation uploadingImageLocation;
        public float uploadingProgress;

        @Override
        public boolean canFinishFragment() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
        }

        @Override
        public void didStartUpload(boolean z, boolean z2) {
        }

        @Override
        public void didUploadFailed() {
            ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
        }

        @Override
        public PhotoViewer.PlaceProviderObject getCloseIntoObject() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$getCloseIntoObject(this);
        }

        @Override
        public String getInitialSearchString() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$getInitialSearchString(this);
        }

        @Override
        public boolean supportsBulletin() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$supportsBulletin(this);
        }

        private AvatarUpdaterDelegate(long j) {
            this.peerId = j;
        }

        @Override
        public void didUploadPhoto(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, final TLRPC.VideoSize videoSize) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GroupCallActivity.AvatarUpdaterDelegate.this.lambda$didUploadPhoto$3(inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize);
                }
            });
        }

        public void lambda$didUploadPhoto$1(final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GroupCallActivity.AvatarUpdaterDelegate.this.lambda$didUploadPhoto$0(tL_error, tLObject, str);
                }
            });
        }

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
                    ImageLoader.getInstance().replaceImageInCache(this.avatar.volume_id + "_" + this.avatar.local_id + "@50_50", closestPhotoSizeWithSize.location.volume_id + "_" + closestPhotoSizeWithSize.location.local_id + "@50_50", ImageLocation.getForUser(user, 1), false);
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

        public void lambda$didUploadPhoto$3(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, final String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
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
                GroupCallActivity.this.accountInstance.getMessagesController().changeChatAvatar(-this.peerId, null, inputFile, inputFile2, videoSize, d, str, photoSize.location, photoSize2.location, new Runnable() {
                    @Override
                    public final void run() {
                        GroupCallActivity.AvatarUpdaterDelegate.this.lambda$didUploadPhoto$2();
                    }
                });
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
            GroupCallActivity.this.accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    GroupCallActivity.AvatarUpdaterDelegate.this.lambda$didUploadPhoto$1(str, tLObject, tL_error);
                }
            });
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
            ((GroupCallMiniTextureView) this.attachedRenderersTmp.get(i)).updateAttachState(true);
        }
        PrivateVideoPreviewDialog privateVideoPreviewDialog = this.previewDialog;
        if (privateVideoPreviewDialog != null) {
            privateVideoPreviewDialog.update();
        }
    }

    public class GroupCallItemAnimator extends DefaultItemAnimator {
        HashSet addingHolders;
        public float animationProgress;
        public ValueAnimator animator;
        float outMaxBottom;
        float outMinTop;
        HashSet removingHolders;

        private GroupCallItemAnimator() {
            this.addingHolders = new HashSet();
            this.removingHolders = new HashSet();
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
                if (findContainingViewHolder != null && findContainingViewHolder.getItemViewType() != 3 && findContainingViewHolder.getItemViewType() != 4 && findContainingViewHolder.getItemViewType() != 5 && findContainingViewHolder.getItemViewType() != 7 && !this.addingHolders.contains(findContainingViewHolder)) {
                    this.outMaxBottom = Math.max(this.outMaxBottom, childAt.getY() + childAt.getMeasuredHeight());
                    this.outMinTop = Math.min(this.outMinTop, Math.max(0.0f, childAt.getY()));
                }
            }
            this.animationProgress = 0.0f;
            GroupCallActivity.this.listView.invalidate();
        }

        @Override
        public void runPendingAnimations() {
            boolean isEmpty = this.mPendingRemovals.isEmpty();
            boolean isEmpty2 = this.mPendingMoves.isEmpty();
            boolean isEmpty3 = this.mPendingAdditions.isEmpty();
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.animator = null;
            }
            if (!isEmpty || !isEmpty2 || !isEmpty3) {
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
                    GroupCallActivity.this.lambda$onUserLeaveHint$79();
                }
            }, 100L);
        }
    }

    public void lambda$onUserLeaveHint$79() {
        RTMPStreamPipOverlay.show(this.parentActivity);
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
            ((GroupCallMiniTextureView) this.attachedRenderersTmp.get(i)).updateAttachState(true);
        }
    }

    public void onPause() {
        paused = true;
        this.attachedRenderersTmp.clear();
        this.attachedRenderersTmp.addAll(this.attachedRenderers);
        for (int i = 0; i < this.attachedRenderersTmp.size(); i++) {
            ((GroupCallMiniTextureView) this.attachedRenderersTmp.get(i)).updateAttachState(false);
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

    public boolean isConference() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return sharedInstance != null && sharedInstance.isConference();
    }

    public boolean canManageCall() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            ChatObject.Call call = this.call;
            return (call == null || (groupCall = call.call) == null || !groupCall.creator) ? false : true;
        }
        return ChatObject.canManageCalls(this.currentChat);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int streamMinVolume;
        if (this.parentActivity == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.parentActivity.getSystemService("audio");
            boolean z = false;
            streamMinVolume = audioManager.getStreamMinVolume(0);
            if (audioManager.getStreamVolume(0) == streamMinVolume && keyEvent.getKeyCode() == 25) {
                z = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                getUndoView().showWithAction(0L, z ? 42 : 43, (Runnable) null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
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
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
            addView(animatedTextView, LayoutHelper.createLinear(-1, 46));
            addView(textView, LayoutHelper.createLinear(-2, -2));
        }

        void setWatchersCount(int i) {
            String formatNumber = LocaleController.formatNumber(i, ',');
            float measureText = this.watchersCountTextView.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
            if (this.lastWidth != measureText) {
                this.watchersCountTextView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{GroupCallActivity.this.getThemedColor(Theme.key_premiumGradient1), GroupCallActivity.this.getThemedColor(Theme.key_premiumGradient3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                this.lastWidth = measureText;
            }
            this.watchersCountTextView.setText(formatNumber);
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
        protected void onDraw(Canvas canvas) {
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

    private static String getRandomEmoji() {
        return EmojiData.data[(int) Math.floor(Math.random() * r0.length)][(int) Math.floor(Math.random() * r0.length)];
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
        private final HashSet parents = new HashSet();
        private boolean attached = false;
        private final AnimatedEmojiSpan.InvalidateHolder invalidate = new AnimatedEmojiSpan.InvalidateHolder() {
            @Override
            public final void invalidate() {
                GroupCallActivity.EmojiSlot.this.lambda$new$0();
            }
        };
        private final RectF rectF = new RectF();

        public void lambda$new$0() {
            Iterator it = this.parents.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }

        public EmojiSlot(int i) {
            int i2 = 0;
            this.offset = i;
            while (true) {
                Drawable[] drawableArr = this.pool;
                if (i2 < drawableArr.length) {
                    drawableArr[i2] = Emoji.getEmojiDrawable(GroupCallActivity.access$25800());
                    i2++;
                } else {
                    this.startTime = System.currentTimeMillis();
                    return;
                }
            }
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

        private void updateEmoji() {
            TLRPC.Document document;
            if (this.real == null || this.lastEmoji == null) {
                return;
            }
            int productionAccount = UserConfig.getProductionAccount();
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(productionAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, true, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    GroupCallActivity.EmojiSlot.this.lambda$updateEmoji$1((TLRPC.TL_messages_stickerSet) obj);
                }
            });
            if (stickerSet == null) {
                return;
            }
            String replace = this.lastEmoji.replace("️", "");
            Iterator<TLRPC.Document> it = stickerSet.documents.iterator();
            while (true) {
                document = null;
                if (!it.hasNext()) {
                    break;
                }
                TLRPC.Document next = it.next();
                if (TextUtils.equals(MessageObject.findAnimatedEmojiEmoticon(next, null).replace("️", ""), replace)) {
                    document = next;
                    break;
                }
            }
            if (document != null) {
                this.real.setupDocument(document);
                return;
            }
            FileLog.e("emoji \"" + this.lastEmoji + "\" not found in addemoji/" + tL_inputStickerSetShortName.short_name);
        }

        public void lambda$updateEmoji$1(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
            updateEmoji();
        }

        public void attach(View view) {
            this.parents.add(view);
            checkAttach();
        }

        public void detach(View view) {
            this.parents.remove(view);
            checkAttach();
        }

        private void checkAttach() {
            boolean isEmpty = this.parents.isEmpty();
            boolean z = !isEmpty;
            if (this.attached != z) {
                this.attached = z;
                if (!isEmpty) {
                    onAttached();
                } else {
                    onDetached();
                }
            }
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

        public boolean draw(Canvas canvas, RectF rectF, float f) {
            float dp = AndroidUtilities.dp(6.0f);
            this.rectF.set(rectF);
            float f2 = -dp;
            this.rectF.inset(f2, f2);
            RectF rectF2 = this.rectF;
            canvas.saveLayerAlpha(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, 255, 31);
            long currentTimeMillis = System.currentTimeMillis() + (this.offset * 45);
            long j = currentTimeMillis - this.startTime;
            float f3 = ((float) j) / 180.0f;
            float min = Math.min(1.0f, f3);
            boolean z = false;
            if (this.loaded && this.real != null && this.realThumb != null && this.realAllowed) {
                this.rectF.set(rectF);
                this.rectF.offset(0.0f, (min - 1.0f) * (rectF.height() + dp));
                if (f < 1.0f) {
                    canvas.save();
                    this.realThumb.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
                    RectF rectF3 = this.rectF;
                    canvas.translate(rectF3.left, rectF3.top);
                    this.realThumb.setAlpha((int) ((1.0f - f) * 255.0f));
                    this.realThumb.draw(canvas);
                    this.realThumb.setAlpha(255);
                    canvas.restore();
                }
                if (f > 0.0f) {
                    canvas.save();
                    this.rectF.inset(AndroidUtilities.dp(-4.0f), AndroidUtilities.dp(-4.0f));
                    this.real.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
                    RectF rectF4 = this.rectF;
                    canvas.translate(rectF4.left, rectF4.top);
                    this.real.setAlpha((int) (255.0f * f));
                    this.real.draw(canvas);
                    this.real.setAlpha(255);
                    canvas.restore();
                }
            } else {
                canvas.save();
                this.rectF.set(rectF);
                this.rectF.offset(0.0f, (min - 1.0f) * (rectF.height() + dp));
                RectF rectF5 = this.rectF;
                canvas.translate(rectF5.left, rectF5.top);
                this.pool[1].setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
                this.pool[1].setAlpha(127);
                this.pool[1].draw(canvas);
                this.pool[1].setAlpha(255);
                canvas.restore();
            }
            this.rectF.set(rectF);
            this.rectF.offset(0.0f, min * (rectF.height() + dp));
            canvas.save();
            RectF rectF6 = this.rectF;
            canvas.translate(rectF6.left, rectF6.top);
            this.pool[0].setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            this.pool[0].setAlpha(127);
            this.pool[0].draw(canvas);
            this.pool[0].setAlpha(255);
            canvas.restore();
            if (f3 >= 1.0f) {
                if (this.loaded && this.realAllowed) {
                    z = true;
                } else {
                    this.startTime = currentTimeMillis - (j % 180);
                    shiftPool();
                    if (this.loaded) {
                        this.realAllowed = true;
                    }
                }
            }
            this.rectF.set(rectF);
            float f4 = (int) f2;
            this.rectF.inset(f4, f4);
            RectF rectF7 = this.rectF;
            float f5 = rectF7.left;
            float f6 = rectF7.top;
            rectF7.set(f5, f6, rectF7.right, f6 + dp);
            this.clip.draw(canvas, this.rectF, 1, 1.0f);
            this.rectF.set(rectF);
            this.rectF.inset(f4, f4);
            RectF rectF8 = this.rectF;
            float f7 = rectF8.left;
            float f8 = rectF8.bottom;
            rectF8.set(f7, f8 - dp, rectF8.right, f8);
            this.clip.draw(canvas, this.rectF, 3, 1.0f);
            canvas.restore();
            return true ^ z;
        }

        private void shiftPool() {
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.pool;
                if (i < drawableArr.length - 1) {
                    int i2 = i + 1;
                    drawableArr[i] = drawableArr[i2];
                    i = i2;
                } else {
                    drawableArr[drawableArr.length - 1] = Emoji.getEmojiDrawable(GroupCallActivity.access$25800());
                    return;
                }
            }
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
        private final AnimatedFloat loadingAlpha = new AnimatedFloat(new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.CallEncryptionCellDrawable.this.invalidate();
            }
        }, 0, 320, CubicBezierInterpolator.EASE_OUT_QUINT);
        private final RectF fromRect = new RectF();
        private final RectF toRect = new RectF();
        private final Path clipPath = new Path();

        public CallEncryptionCellDrawable(Context context) {
            int i = 0;
            while (true) {
                EmojiSlot[] emojiSlotArr = this.slots;
                if (i < emojiSlotArr.length) {
                    emojiSlotArr[i] = new EmojiSlot(i);
                    i++;
                } else {
                    this.backgroundPaint.setColor(Theme.getColor(Theme.key_voipgroup_listViewBackground));
                    this.text1 = new Text(LocaleController.getString(R.string.ConferenceEncrypted), 12.0f, AndroidUtilities.bold());
                    this.text2 = new Text(LocaleController.getString(R.string.ConferenceEncryptedInfo), 11.0f).multiline(99).setMaxWidth(AndroidUtilities.dp(200.0f)).lineSpacing(AndroidUtilities.dp(2.66f));
                    this.closeText = new Text(LocaleController.getString(R.string.ConferenceEncryptedClose), 14.0f, AndroidUtilities.bold());
                    setEmojis(null);
                    return;
                }
            }
        }

        public void invalidate() {
            View view = this.parentView;
            if (view != null) {
                view.invalidate();
            }
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

        public void resetParentView(View view) {
            if (this.parentView == view) {
                return;
            }
            int i = 0;
            while (true) {
                EmojiSlot[] emojiSlotArr = this.slots;
                if (i < emojiSlotArr.length) {
                    emojiSlotArr[i].detach(view);
                    i++;
                } else {
                    this.parentView = null;
                    return;
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

        public void setPaintBackgroundColor(int i) {
            this.listBackgroundColor = i;
            invalidate();
        }

        public boolean draw(Canvas canvas, float f, float f2) {
            canvas.save();
            this.text1.ellipsize(f - AndroidUtilities.dp(132.0f));
            this.backgroundPaint.setColor(ColorUtils.blendARGB(this.listBackgroundColor, Theme.getColor(Theme.key_voipgroup_listViewBackground), f2));
            float f3 = this.loadingAlpha.set(this.loading);
            float dp = AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(86.0f) + this.text1.getWidth();
            float dp2 = AndroidUtilities.dp(28.0f);
            float dp3 = AndroidUtilities.dp(232.0f);
            float dp4 = AndroidUtilities.dp(54.0f) + this.text2.getHeight() + AndroidUtilities.dp(50.0f);
            float lerp = AndroidUtilities.lerp(dp, dp3, f2);
            float lerp2 = AndroidUtilities.lerp(dp2, dp4, f2);
            float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), f2);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((f - lerp) / 2.0f, 0.0f, (f + lerp) / 2.0f, lerp2);
            canvas.drawRoundRect(rectF, lerp3, lerp3, this.backgroundPaint);
            this.clipPath.rewind();
            this.clipPath.addRoundRect(rectF, lerp3, lerp3, Path.Direction.CW);
            canvas.clipPath(this.clipPath);
            int dp5 = AndroidUtilities.dp(18.0f);
            int dp6 = AndroidUtilities.dp(30.0f);
            int i = dp5 / 2;
            float centerY = ((int) rectF.centerY()) - i;
            float centerY2 = ((int) rectF.centerY()) + i;
            this.fromRect.set(((((int) rectF.left) + AndroidUtilities.dp(7.0f)) + AndroidUtilities.dp(10.0f)) - i, centerY, ((int) rectF.left) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(10.0f) + i, centerY2);
            float f4 = f / 2.0f;
            float f5 = f4 - (r3 * 2);
            float dp7 = (int) ((dp3 - AndroidUtilities.dp(32.0f)) / 4.0f);
            int i2 = (int) ((0.5f * dp7) + f5);
            int i3 = dp6 / 2;
            float f6 = dp6 / 2.0f;
            this.toRect.set(i2 - i3, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f6), i2 + i3, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f6));
            RectF rectF2 = this.fromRect;
            RectF rectF3 = this.toRect;
            AndroidUtilities.lerpCentered(rectF2, rectF3, f2, rectF3);
            boolean draw = this.slots[0].draw(canvas, this.toRect, f2);
            this.fromRect.set(((((int) rectF.left) + AndroidUtilities.dp(27.0f)) + AndroidUtilities.dp(10.0f)) - i, centerY, ((int) rectF.left) + AndroidUtilities.dp(27.0f) + AndroidUtilities.dp(10.0f) + i, centerY2);
            int i4 = (int) ((1.5f * dp7) + f5);
            boolean z = draw;
            this.toRect.set(i4 - i3, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f6), i4 + i3, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f6));
            RectF rectF4 = this.fromRect;
            RectF rectF5 = this.toRect;
            AndroidUtilities.lerpCentered(rectF4, rectF5, f2, rectF5);
            if (this.slots[1].draw(canvas, this.toRect, f2)) {
                z = true;
            }
            Text text = this.text1;
            text.draw(canvas, f4 - (text.getWidth() / 2.0f), dp2 / 2.0f, -1, (1.0f - f2) * AndroidUtilities.lerp(1.0f, 0.75f, f3));
            this.fromRect.set(((((int) rectF.right) - AndroidUtilities.dp(47.0f)) + AndroidUtilities.dp(10.0f)) - i, centerY, (((int) rectF.right) - AndroidUtilities.dp(47.0f)) + AndroidUtilities.dp(10.0f) + i, centerY2);
            int i5 = (int) ((2.5f * dp7) + f5);
            this.toRect.set(i5 - i3, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f6), i5 + i3, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f6));
            RectF rectF6 = this.fromRect;
            RectF rectF7 = this.toRect;
            AndroidUtilities.lerpCentered(rectF6, rectF7, f2, rectF7);
            if (this.slots[2].draw(canvas, this.toRect, f2)) {
                z = true;
            }
            this.fromRect.set(((((int) rectF.right) - AndroidUtilities.dp(27.0f)) + AndroidUtilities.dp(10.0f)) - i, centerY, (((int) rectF.right) - AndroidUtilities.dp(27.0f)) + AndroidUtilities.dp(10.0f) + i, centerY2);
            int i6 = (int) (f5 + (dp7 * 3.5f));
            this.toRect.set(i6 - i3, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f6), i6 + i3, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f6));
            RectF rectF8 = this.fromRect;
            RectF rectF9 = this.toRect;
            AndroidUtilities.lerpCentered(rectF8, rectF9, f2, rectF9);
            boolean z2 = this.slots[3].draw(canvas, this.toRect, f2) ? true : z;
            if (f2 > 0.0f) {
                this.text2.draw(canvas, AndroidUtilities.dp(16.0f) + (rectF.centerX() - (dp3 / 2.0f)), AndroidUtilities.dp(54.0f), -1, f2);
                this.dividerPaint.setColor(-16777216);
                this.dividerPaint.setAlpha((int) (255.0f * f2));
                canvas.drawRect(rectF.left, dp4 - AndroidUtilities.dp(40.0f), rectF.right, (dp4 - AndroidUtilities.dp(40.0f)) + AndroidUtilities.dp(0.66f), this.dividerPaint);
                this.closeText.draw(canvas, rectF.centerX() - (this.closeText.getWidth() / 2.0f), dp4 - AndroidUtilities.dp(20.0f), -1, f2);
            }
            canvas.restore();
            return z2;
        }
    }

    public static final class CallEncryptionCell extends View {
        private final CallEncryptionCellDrawable drawable;

        public CallEncryptionCell(final Context context, CallEncryptionCellDrawable callEncryptionCellDrawable) {
            super(context);
            this.drawable = callEncryptionCellDrawable;
            NotificationCenter.listenEmojiLoading(this);
            setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    GroupCallActivity.CallEncryptionCell.this.lambda$new$0(context, view);
                }
            });
        }

        public void lambda$new$0(Context context, View view) {
            new EncryptionCallDialog(context, this).show();
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            CallEncryptionCellDrawable callEncryptionCellDrawable = this.drawable;
            if (callEncryptionCellDrawable != null) {
                callEncryptionCellDrawable.setParentView(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            CallEncryptionCellDrawable callEncryptionCellDrawable = this.drawable;
            if (callEncryptionCellDrawable != null) {
                callEncryptionCellDrawable.resetParentView(this);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(38.0f));
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            CallEncryptionCellDrawable callEncryptionCellDrawable = this.drawable;
            if (callEncryptionCellDrawable == null || !callEncryptionCellDrawable.draw(canvas, getMeasuredWidth(), 0.0f)) {
                return;
            }
            invalidate();
        }

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
                AndroidUtilities.makeGlobalBlurBitmap(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        GroupCallActivity.CallEncryptionCell.EncryptionCallDialog.this.lambda$new$0(callEncryptionCell, (Bitmap) obj);
                    }
                }, 14.0f);
                View view = new View(context) {
                    private final int[] p = new int[2];

                    @Override
                    public void dispatchDraw(Canvas canvas) {
                        if (EncryptionCallDialog.this.progress > 0.0f && EncryptionCallDialog.this.blurBitmapPaint != null) {
                            EncryptionCallDialog.this.blurMatrix.reset();
                            float width = getWidth() / EncryptionCallDialog.this.blurBitmap.getWidth();
                            EncryptionCallDialog.this.blurMatrix.postScale(width, width);
                            EncryptionCallDialog.this.blurBitmapShader.setLocalMatrix(EncryptionCallDialog.this.blurMatrix);
                            EncryptionCallDialog.this.blurBitmapPaint.setAlpha((int) (EncryptionCallDialog.this.progress * 255.0f));
                            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), EncryptionCallDialog.this.blurBitmapPaint);
                        }
                        CallEncryptionCell callEncryptionCell2 = callEncryptionCell;
                        if (callEncryptionCell2 != null) {
                            if (callEncryptionCell2.isAttachedToWindow() && callEncryptionCell.getAlpha() > 0.5f) {
                                callEncryptionCell.getLocationInWindow(this.p);
                            } else {
                                EncryptionCallDialog.this.dismiss();
                            }
                            canvas.save();
                            canvas.translate(this.p[0] - (callEncryptionCell.getMeasuredWidth() * (1.0f - callEncryptionCell.getScaleX())), this.p[1] - (callEncryptionCell.getMeasuredHeight() * (1.0f - callEncryptionCell.getScaleY())));
                            if (callEncryptionCell.drawable.draw(canvas, callEncryptionCell.getMeasuredWidth(), EncryptionCallDialog.this.progress)) {
                                invalidate();
                            }
                            canvas.restore();
                        }
                    }
                };
                this.windowView = view;
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        GroupCallActivity.CallEncryptionCell.EncryptionCallDialog.this.lambda$new$1(view2);
                    }
                });
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
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? -0.02f : -0.04f);
                this.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }

            public void lambda$new$1(View view) {
                dismiss();
            }

            @Override
            protected void onCreate(Bundle bundle) {
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
                attributes.flags = 131072 | i;
                int i2 = Build.VERSION.SDK_INT;
                attributes.flags = (-2013069056) | i;
                if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                    attributes.flags = i | (-2013060864);
                    AndroidUtilities.logFlagSecure();
                }
                attributes.flags |= 1152;
                if (i2 >= 28) {
                    attributes.layoutInDisplayCutoutMode = 1;
                }
                window.setAttributes(attributes);
            }

            @Override
            public void show() {
                super.show();
                animate(1.0f, null);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        GroupCallActivity.CallEncryptionCell.EncryptionCallDialog.this.lambda$show$2();
                    }
                }, 16L);
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
                animate(0.0f, new Runnable() {
                    @Override
                    public final void run() {
                        GroupCallActivity.CallEncryptionCell.EncryptionCallDialog.this.lambda$dismiss$4();
                    }
                });
                try {
                    WindowManager.LayoutParams attributes = getWindow().getAttributes();
                    attributes.flags |= 16;
                    getWindow().setAttributes(attributes);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }

            public void lambda$dismiss$4() {
                CallEncryptionCell callEncryptionCell = this.cell;
                if (callEncryptionCell != null) {
                    callEncryptionCell.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        GroupCallActivity.CallEncryptionCell.EncryptionCallDialog.this.lambda$dismiss$3();
                    }
                }, 16L);
            }

            public void lambda$dismiss$3() {
                super.dismiss();
            }

            private void animate(final float f, final Runnable runnable) {
                ValueAnimator valueAnimator = this.progressAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.progressAnimator = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.progress, f);
                this.progressAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        GroupCallActivity.CallEncryptionCell.EncryptionCallDialog.this.lambda$animate$5(valueAnimator2);
                    }
                });
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
        }
    }

    public void openShareConferenceLink() {
        ChatObject.Call call = this.call;
        if (call == null || call.call == null) {
            return;
        }
        final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
        alertDialog.showDelayed(300L);
        final TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        exportgroupcallinvite.call = tL_inputGroupCall;
        TLRPC.GroupCall groupCall = this.call.call;
        tL_inputGroupCall.id = groupCall.id;
        tL_inputGroupCall.access_hash = groupCall.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                GroupCallActivity.this.lambda$openShareConferenceLink$81(alertDialog, exportgroupcallinvite, tLObject, tL_error);
            }
        });
    }

    public void lambda$openShareConferenceLink$81(final AlertDialog alertDialog, final TL_phone.exportGroupCallInvite exportgroupcallinvite, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GroupCallActivity.this.lambda$openShareConferenceLink$80(alertDialog, tLObject, exportgroupcallinvite, tL_error);
            }
        });
    }

    public void lambda$openShareConferenceLink$80(AlertDialog alertDialog, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
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
        DarkBlueThemeResourcesProvider darkBlueThemeResourcesProvider = new DarkBlueThemeResourcesProvider();
        ChatObject.Call call = this.call;
        CallLogActivity.showCallLinkSheet(context, i, inputGroupCall, str, darkBlueThemeResourcesProvider, false, (call == null || (groupCall = call.call) == null || !groupCall.creator) ? false : true);
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

    public void setAudioOutputValue(int i) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        sharedInstance.setAudioOutput(i);
        this.cacheAudioOutputValue = Integer.valueOf(i);
    }

    public int getNextAudioOutputValue() {
        if (getAudioOutputActive(getAudioOutputValue())) {
            return 1;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return (sharedInstance == null || !sharedInstance.isBluetoothHeadsetConnected()) ? 0 : 2;
    }

    public String getAudioOutputName(int i) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i == 0) {
            return LocaleController.getString(R.string.VoipAudioRoutingSpeaker);
        }
        if (i == 1) {
            return LocaleController.getString((sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? R.string.VoipAudioRoutingPhone : R.string.VoipAudioRoutingHeadset);
        }
        if (i != 2) {
            return null;
        }
        return (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? LocaleController.getString(R.string.VoipAudioRoutingBluetooth) : str;
    }

    public int getAudioOutputIcon(int i) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isBluetoothHeadsetConnected()) {
            return R.drawable.filled_calls_bluetooth_s;
        }
        return R.drawable.filled_sound_on;
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
            return LocaleController.getString((sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? R.string.VoipAudioSwitchedToPhone : R.string.VoipAudioSwitchedToHeadset);
        }
        return LocaleController.getString(R.string.VoipAudioSwitchedToSpeaker);
    }

    public boolean isBulletinTop() {
        int dp = AndroidUtilities.dp(74.0f);
        float f = this.scrollOffsetY - dp;
        return (((((float) this.backgroundPaddingTop) + f) > ((float) ActionBar.getCurrentActionBarHeight()) ? 1 : ((((float) this.backgroundPaddingTop) + f) == ((float) ActionBar.getCurrentActionBarHeight()) ? 0 : -1)) < 0 ? Math.min(1.0f, ((((float) ActionBar.getCurrentActionBarHeight()) - f) - ((float) this.backgroundPaddingTop)) / ((float) ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)))) : 0.0f) > 0.5f;
    }

    public void updateTopBulletinY() {
        float f;
        if (this.topBulletinContainer == null) {
            return;
        }
        int dp = AndroidUtilities.dp(74.0f);
        float f2 = this.scrollOffsetY - dp;
        if (this.backgroundPaddingTop + f2 < ActionBar.getCurrentActionBarHeight()) {
            f = Math.min(1.0f, ((ActionBar.getCurrentActionBarHeight() - f2) - this.backgroundPaddingTop) / ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
            f2 -= (int) ((ActionBar.getCurrentActionBarHeight() - r0) * f);
        } else {
            f = 0.0f;
        }
        FrameLayout frameLayout = this.topBulletinContainer;
        frameLayout.setTranslationY(AndroidUtilities.lerp(((-frameLayout.getTop()) - this.topBulletinContainer.getHeight()) + f2 + this.containerView.getPaddingTop() + AndroidUtilities.dp(10.0f), (-this.topBulletinContainer.getTop()) + this.actionBar.getY() + this.actionBar.getHeight(), f));
        Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
        if (visibleBulletin == null || visibleBulletin.getLayout() == null || visibleBulletin.getLayout().getParent() == null || visibleBulletin.getLayout().getParent().getParent() != this.topBulletinContainer) {
            return;
        }
        visibleBulletin.getLayout().setTop(f > 0.5f);
    }
}
