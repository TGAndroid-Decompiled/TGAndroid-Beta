package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.PowerManager;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
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
import org.telegram.messenger.pip.source.IPipSourceDelegate;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.messenger.voip.EncryptionKeyEmojifier;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.DarkAlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.AvatarsDrawable;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.HideViewAfterAnimation;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.voip.AcceptDeclineView;
import org.telegram.ui.Components.voip.EmojiRationalLayout;
import org.telegram.ui.Components.voip.EndCloseLayout;
import org.telegram.ui.Components.voip.HideEmojiTextView;
import org.telegram.ui.Components.voip.ImageWithWavesView;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialogNew;
import org.telegram.ui.Components.voip.RateCallLayout;
import org.telegram.ui.Components.voip.VoIPBackgroundProvider;
import org.telegram.ui.Components.voip.VoIPButtonsLayout;
import org.telegram.ui.Components.voip.VoIPFloatingLayout;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Components.voip.VoIPNotificationsLayout;
import org.telegram.ui.Components.voip.VoIPPiPView;
import org.telegram.ui.Components.voip.VoIPStatusTextView;
import org.telegram.ui.Components.voip.VoIPTextureView;
import org.telegram.ui.Components.voip.VoIPToggleButton;
import org.telegram.ui.Components.voip.VoIPWindowView;
import org.telegram.ui.Components.voip.VoIpCoverView;
import org.telegram.ui.Components.voip.VoIpGradientLayout;
import org.telegram.ui.Components.voip.VoIpHintView;
import org.telegram.ui.Components.voip.VoIpSnowView;
import org.telegram.ui.Components.voip.VoIpSwitchLayout;
import org.telegram.ui.Stories.recorder.HintView2;
import org.webrtc.EglBase;
import org.webrtc.GlRectDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;

public class VoIPFragment implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, IPipSourceDelegate {
    private static VoIPFragment instance;
    private AcceptDeclineView acceptDeclineView;
    private AccessibilityManager accessibilityManager;
    Activity activity;
    private ImageView addIcon;
    private UserSelectorBottomSheet addPeopleSheet;
    private ImageView backIcon;
    private VoIPToggleButton bottomEndCallBtn;
    private VoIpSwitchLayout bottomMuteBtn;
    View bottomShadow;
    private VoIpSwitchLayout bottomSpeakerBtn;
    private VoIpSwitchLayout bottomVideoBtn;
    private VoIPButtonsLayout buttonsLayout;
    TLRPC.User callingUser;
    boolean callingUserIsVideo;
    private VoIPFloatingLayout callingUserMiniFloatingLayout;
    private TextureViewRenderer callingUserMiniTextureRenderer;
    private ImageWithWavesView callingUserPhotoViewMini;
    private VoIPTextureView callingUserTextureView;
    private TextView callingUserTitle;
    boolean cameraForceExpanded;
    private Animator cameraShowingAnimator;
    private boolean canHideUI;
    private boolean canSwitchToPip;
    private boolean canZoomGesture;
    private final int currentAccount;
    private int currentState;
    TLRPC.User currentUser;
    private VoIPFloatingLayout currentUserCameraFloatingLayout;
    private boolean currentUserCameraIsFullscreen;
    boolean currentUserIsVideo;
    private VoIPTextureView currentUserTextureView;
    private boolean deviceIsLocked;
    private boolean emojiExpanded;
    LinearLayout emojiLayout;
    private boolean emojiLoaded;
    LinearLayout emojiRationalLayout;
    TextView emojiRationalTextView;
    TextView emojiRationalTopTextView;
    HintView2 encryptionTooltip;
    EndCloseLayout endCloseLayout;
    boolean enterFromPiP;
    private float enterTransitionProgress;
    float fillNaviagtionBarValue;
    private Runnable firstFrameCallback;
    private ViewGroup fragmentView;
    private VoIpGradientLayout gradientLayout;
    FrameLayout hideEmojiLayout;
    TextView hideEmojiTextView;
    boolean hideUiRunnableWaiting;
    private boolean isFinished;
    private boolean isInPinchToZoomTouchMode;
    private boolean isNearEar;
    boolean isOutgoing;
    private boolean isVideoCall;
    long lastContentTapTime;
    private WindowInsets lastInsets;
    private boolean lockOnScreen;
    VoIPNotificationsLayout notificationsLayout;
    private ConferenceParticipantsView participantsView;
    private float pinchCenterX;
    private float pinchCenterY;
    private float pinchStartCenterX;
    private float pinchStartCenterY;
    private float pinchStartDistance;
    private float pinchTranslationX;
    private float pinchTranslationY;
    private PipSource pipSource;
    private VoIPTextureView pipTextureView;
    private int pointerId1;
    private int pointerId2;
    private PrivateVideoPreviewDialogNew previewDialog;
    private int previousState;
    RateCallLayout rateCallLayout;
    private boolean screenWasWakeup;
    private int selectedRating;
    private boolean signalBarWasReceived;
    private ImageView speakerPhoneIcon;
    private int speakerPhoneIconResId;
    LinearLayout statusLayout;
    private int statusLayoutAnimateToOffset;
    private VoIPStatusTextView statusTextView;
    private boolean switchingToPip;
    HintView2 tapToVideoTooltip;
    View topShadow;
    float touchSlop;
    ValueAnimator uiVisibilityAnimator;
    private VoIpCoverView voIpCoverView;
    private VoIpSnowView voIpSnowView;
    private boolean wasEstablished;
    private VoIPWindowView windowView;
    private boolean windowViewSkipRender;
    ValueAnimator zoomBackAnimator;
    private boolean zoomStarted;
    private final VoIPBackgroundProvider backgroundProvider = new VoIPBackgroundProvider();
    BackupImageView[] emojiViews = new BackupImageView[4];
    Drawable[] emojiDrawables = new Drawable[4];
    Paint overlayPaint = new Paint();
    Paint overlayBottomPaint = new Paint();
    private boolean uiVisible = true;
    float uiVisibilityAlpha = 1.0f;
    AnimationNotificationsLocker notificationsLocker = new AnimationNotificationsLocker();
    ValueAnimator.AnimatorUpdateListener statusbarAnimatorListener = new ValueAnimator.AnimatorUpdateListener() {
        @Override
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f$0.lambda$new$0(valueAnimator);
        }
    };
    Runnable hideUIRunnable = new Runnable() {
        @Override
        public final void run() {
            this.f$0.lambda$new$1();
        }
    };
    Runnable stopAnimatingBgRunnable = new Runnable() {
        @Override
        public final void run() {
            this.f$0.lambda$new$2();
        }
    };
    float pinchScale = 1.0f;

    @Override
    public void onCameraFirstFrameAvailable() {
        VoIPService.StateListener.CC.$default$onCameraFirstFrameAvailable(this);
    }

    @Override
    public void onScreenOnChange(boolean z) {
    }

    @Override
    public boolean pipIsAvailable() {
        return IPipSourceDelegate.CC.$default$pipIsAvailable(this);
    }

    @Override
    public void pipRenderForeground(Canvas canvas) {
        IPipSourceDelegate.CC.$default$pipRenderForeground(this, canvas);
    }

    public void lambda$new$0(ValueAnimator valueAnimator) {
        this.uiVisibilityAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateSystemBarColors();
    }

    public void lambda$new$1() {
        this.hideUiRunnableWaiting = false;
        HintView2 hintView2 = this.tapToVideoTooltip;
        boolean z = hintView2 != null && hintView2.shown();
        if (!this.canHideUI || !this.uiVisible || this.emojiExpanded || z) {
            return;
        }
        this.lastContentTapTime = System.currentTimeMillis();
        showUi(false);
        this.previousState = this.currentState;
        updateViewState();
    }

    public void lambda$new$2() {
        if (this.currentState == 3) {
            this.callingUserPhotoViewMini.setMute(true, false);
            this.gradientLayout.pause();
        }
    }

    public static void show(Activity activity, int i) {
        VoIPFragment voIPFragment = instance;
        if (voIPFragment != null && voIPFragment.windowView.getParent() == null) {
            VoIPFragment voIPFragment2 = instance;
            if (voIPFragment2 != null) {
                voIPFragment2.callingUserTextureView.renderer.release();
                instance.currentUserTextureView.renderer.release();
                instance.callingUserMiniTextureRenderer.release();
                VoIPWindowView voIPWindowView = instance.windowView;
                if (voIPWindowView != null) {
                    voIPWindowView.finishImmediate();
                }
                instance.destroy();
            }
            instance = null;
        }
        if (instance != null || activity.isFinishing()) {
            return;
        }
        boolean z = VoIPPiPView.getInstance() != null;
        if (VoIPService.getSharedState() == null || VoIPService.getSharedState().getUser() == null) {
            return;
        }
        final VoIPFragment voIPFragment3 = new VoIPFragment(i);
        voIPFragment3.activity = activity;
        instance = voIPFragment3;
        VoIPWindowView voIPWindowView2 = new VoIPWindowView(activity, !z) {
            private final Path clipPath = new Path();
            private final RectF rectF = new RectF();

            @Override
            public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                VoIPServiceState sharedState;
                if (voIPFragment3.isFinished || voIPFragment3.switchingToPip) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 4 || keyEvent.getAction() != 1 || voIPFragment3.lockOnScreen) {
                    if ((keyCode == 25 || keyCode == 24) && voIPFragment3.currentState == 15 && (sharedState = VoIPService.getSharedState()) != null) {
                        sharedState.stopRinging();
                        return true;
                    }
                    return super.dispatchKeyEvent(keyEvent);
                }
                voIPFragment3.onBackPressed();
                return true;
            }

            @Override
            public void draw(Canvas canvas) {
                if (voIPFragment3.windowViewSkipRender) {
                    return;
                }
                super.draw(canvas);
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (voIPFragment3.switchingToPip && getAlpha() != 0.0f) {
                    float width = voIPFragment3.callingUserTextureView.getWidth() * voIPFragment3.callingUserTextureView.getScaleX();
                    float height = voIPFragment3.callingUserTextureView.getHeight() * voIPFragment3.callingUserTextureView.getScaleY();
                    float width2 = (voIPFragment3.callingUserTextureView.getWidth() - width) / 2.0f;
                    float height2 = (voIPFragment3.callingUserTextureView.getHeight() - height) / 2.0f;
                    float x = voIPFragment3.callingUserTextureView.getX() + width2;
                    float y = voIPFragment3.callingUserTextureView.getY() + height2;
                    canvas.save();
                    this.clipPath.rewind();
                    this.rectF.set(x, y, width + x, height + y);
                    float fDp = AndroidUtilities.dp(4.0f);
                    this.clipPath.addRoundRect(this.rectF, fDp, fDp, Path.Direction.CW);
                    this.clipPath.close();
                    canvas.clipPath(this.clipPath);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
            }
        };
        instance.deviceIsLocked = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        boolean zIsInteractive = ((PowerManager) activity.getSystemService("power")).isInteractive();
        VoIPFragment voIPFragment4 = instance;
        voIPFragment4.screenWasWakeup = !zIsInteractive;
        voIPWindowView2.setLockOnScreen(voIPFragment4.deviceIsLocked);
        voIPFragment3.windowView = voIPWindowView2;
        ViewCompat.setOnApplyWindowInsetsListener(voIPWindowView2, new OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return VoIPFragment.lambda$show$3(this.f$0, view, windowInsetsCompat);
            }
        });
        ((WindowManager) activity.getSystemService("window")).addView(voIPWindowView2, voIPWindowView2.createWindowLayoutParams());
        voIPWindowView2.addView(voIPFragment3.createView(activity));
        if (z) {
            voIPFragment3.enterTransitionProgress = 0.0f;
            voIPFragment3.startTransitionFromPiP();
        } else {
            voIPFragment3.enterTransitionProgress = 1.0f;
            voIPFragment3.updateSystemBarColors();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2 && PipUtils.checkPermissions(activity) == 1) {
            VoIPFragment voIPFragment5 = instance;
            voIPFragment5.pipSource = new PipSource.Builder(activity, voIPFragment5).setTagPrefix("voip-fragment-pip").setContentView(instance.callingUserTextureView.renderer).setPlaceholderView(instance.callingUserTextureView.getPlaceholderView()).build();
        }
    }

    public static WindowInsetsCompat lambda$show$3(VoIPFragment voIPFragment, View view, WindowInsetsCompat windowInsetsCompat) {
        voIPFragment.setInsets(windowInsetsCompat.toWindowInsets());
        return WindowInsetsCompat.CONSUMED;
    }

    public void onBackPressed() {
        if (this.isFinished || this.switchingToPip) {
            return;
        }
        PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew = this.previewDialog;
        if (privateVideoPreviewDialogNew != null) {
            privateVideoPreviewDialogNew.dismiss(false, false);
            return;
        }
        if (this.callingUserIsVideo && this.currentUserIsVideo && this.cameraForceExpanded) {
            this.cameraForceExpanded = false;
            this.currentUserCameraFloatingLayout.setRelativePosition(this.callingUserMiniFloatingLayout);
            this.currentUserCameraIsFullscreen = false;
            this.previousState = this.currentState;
            updateViewState();
            return;
        }
        if (this.emojiExpanded) {
            expandEmoji(false);
            return;
        }
        if (this.emojiRationalLayout.getVisibility() != 8) {
            return;
        }
        if (this.canSwitchToPip && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && !this.lockOnScreen) {
            if (PipUtils.checkAnyPipPermissions(this.activity)) {
                switchToPip();
                return;
            } else {
                requestInlinePermissions();
                return;
            }
        }
        this.windowView.finish();
    }

    public void finish() {
        this.windowView.finish();
    }

    public static void clearInstance() {
        if (instance != null) {
            if (VoIPService.getSharedInstance() != null) {
                int measuredHeight = instance.windowView.getMeasuredHeight();
                if (instance.canSwitchToPip && !VoIPService.getSharedInstance().isConverting()) {
                    VoIPFragment voIPFragment = instance;
                    VoIPPiPView.show(voIPFragment.activity, voIPFragment.currentAccount, voIPFragment.windowView.getMeasuredWidth(), measuredHeight, 0);
                    WindowInsets windowInsets = instance.lastInsets;
                    if (windowInsets != null) {
                        VoIPPiPView.topInset = windowInsets.getSystemWindowInsetTop();
                        VoIPPiPView.bottomInset = instance.lastInsets.getSystemWindowInsetBottom();
                    }
                }
            }
            instance.callingUserTextureView.renderer.release();
            instance.currentUserTextureView.renderer.release();
            instance.callingUserMiniTextureRenderer.release();
            instance.destroy();
        }
        instance = null;
    }

    public static VoIPFragment getInstance() {
        return instance;
    }

    private void setInsets(WindowInsets windowInsets) {
        this.lastInsets = windowInsets;
        ((FrameLayout.LayoutParams) this.buttonsLayout.getLayoutParams()).bottomMargin = this.lastInsets.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) this.acceptDeclineView.getLayoutParams()).bottomMargin = this.lastInsets.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) this.backIcon.getLayoutParams()).topMargin = this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.addIcon.getLayoutParams()).topMargin = this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.speakerPhoneIcon.getLayoutParams()).topMargin = AndroidUtilities.dp(56.0f) + this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.statusLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(135.0f) + this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.emojiLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(17.0f) + this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.callingUserPhotoViewMini.getLayoutParams()).topMargin = AndroidUtilities.dp(93.0f) + this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.hideEmojiLayout.getLayoutParams()).topMargin = this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.emojiRationalLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(118.0f) + this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.rateCallLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(380.0f) + this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.callingUserMiniFloatingLayout.getLayoutParams()).bottomMargin = this.lastInsets.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) this.notificationsLayout.getLayoutParams()).bottomMargin = this.lastInsets.getSystemWindowInsetBottom();
        this.currentUserCameraFloatingLayout.setInsets(this.lastInsets);
        this.callingUserMiniFloatingLayout.setInsets(this.lastInsets);
        this.fragmentView.requestLayout();
        PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew = this.previewDialog;
        if (privateVideoPreviewDialogNew != null) {
            privateVideoPreviewDialogNew.setBottomPadding(this.lastInsets.getSystemWindowInsetBottom());
        }
    }

    public VoIPFragment(int i) {
        this.currentAccount = i;
        this.currentUser = MessagesController.getInstance(i).getUser(Long.valueOf(UserConfig.getInstance(i).getClientUserId()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.callingUser = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        this.isOutgoing = sharedState.isOutgoing();
        this.previousState = -1;
        this.currentState = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public void destroy() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        PipSource pipSource = this.pipSource;
        if (pipSource != null) {
            pipSource.destroy();
            this.pipSource = null;
        }
        UserSelectorBottomSheet userSelectorBottomSheet = this.addPeopleSheet;
        if (userSelectorBottomSheet != null) {
            userSelectorBottomSheet.dismiss();
            this.addPeopleSheet = null;
        }
    }

    @Override
    public void onStateChanged(int i) {
        int i2 = this.currentState;
        if (i2 != i) {
            this.previousState = i2;
            this.currentState = i;
            if (this.windowView != null) {
                updateViewState();
            }
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.voipServiceCreated) {
            if (this.currentState != 17 || VoIPService.getSharedInstance() == null) {
                return;
            }
            this.currentUserTextureView.renderer.release();
            this.callingUserTextureView.renderer.release();
            this.callingUserMiniTextureRenderer.release();
            initRenderers();
            VoIPService.getSharedInstance().registerStateListener(this);
            return;
        }
        if (i == NotificationCenter.emojiLoaded) {
            updateKeyView(true);
            return;
        }
        if (i == NotificationCenter.closeInCallActivity) {
            this.windowView.finish();
            return;
        }
        if (i == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.callingUserPhotoViewMini.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
            return;
        }
        if (i == NotificationCenter.nearEarEvent) {
            boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
            this.isNearEar = zBooleanValue;
            if (zBooleanValue) {
                this.callingUserPhotoViewMini.setMute(true, true);
            }
        }
    }

    @Override
    public void onSignalBarsCountChanged(final int i) {
        VoIpGradientLayout voIpGradientLayout;
        if (i > 0) {
            this.signalBarWasReceived = true;
        }
        if (this.statusTextView == null || (voIpGradientLayout = this.gradientLayout) == null || !voIpGradientLayout.isConnectedCalled() || !this.signalBarWasReceived) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onSignalBarsCountChanged$4(i);
            }
        }, 400L);
    }

    public void lambda$onSignalBarsCountChanged$4(int i) {
        this.statusTextView.setSignalBarCount(i);
        if (i <= 1) {
            this.gradientLayout.showToBadConnection();
            this.statusTextView.showBadConnection(true, true);
        } else {
            this.gradientLayout.hideBadConnection();
            this.statusTextView.showBadConnection(false, true);
        }
    }

    @Override
    public void onAudioSettingsChanged() {
        updateButtons(true);
    }

    @Override
    public void onMediaStateUpdated(int i, int i2) {
        this.previousState = this.currentState;
        if (i2 == 2 && !this.isVideoCall) {
            this.isVideoCall = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.pipSource == null && PipUtils.checkPermissions(this.activity) == 1) {
                this.pipSource = new PipSource.Builder(this.activity, instance).setTagPrefix("voip-fragment-pip").setContentView(this.callingUserTextureView.renderer).setPlaceholderView(this.callingUserTextureView.getPlaceholderView()).build();
            }
        } else {
            PipSource pipSource = this.pipSource;
            if (pipSource != null) {
                pipSource.destroy();
                this.pipSource = null;
            }
        }
        updateViewState();
    }

    @Override
    public void onCameraSwitch(boolean z) {
        this.previousState = this.currentState;
        updateViewState();
    }

    @Override
    public void onVideoAvailableChange(boolean z) {
        this.previousState = this.currentState;
        if (z && !this.isVideoCall) {
            this.isVideoCall = true;
        }
        updateViewState();
    }

    public View createView(final Context context) {
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(context, AccessibilityManager.class);
        FrameLayout frameLayout = new FrameLayout(context) {
            boolean check;
            long pressedTime;
            float pressedX;
            float pressedY;

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 1) {
                    VoIPFragment.this.callingUserPhotoViewMini.setMute(false, false);
                    VoIPFragment.this.gradientLayout.resume();
                    AndroidUtilities.cancelRunOnUIThread(VoIPFragment.this.stopAnimatingBgRunnable);
                    if (VoIPFragment.this.currentState == 3) {
                        AndroidUtilities.runOnUIThread(VoIPFragment.this.stopAnimatingBgRunnable, 10000L);
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                HintView2 hintView2;
                if (motionEvent.getActionMasked() == 1) {
                    VoIPFragment.this.callingUserPhotoViewMini.setMute(false, false);
                    VoIPFragment.this.gradientLayout.resume();
                    AndroidUtilities.cancelRunOnUIThread(VoIPFragment.this.stopAnimatingBgRunnable);
                    if (VoIPFragment.this.currentState == 3) {
                        AndroidUtilities.runOnUIThread(VoIPFragment.this.stopAnimatingBgRunnable, 10000L);
                    }
                }
                if (!VoIPFragment.this.canZoomGesture && !VoIPFragment.this.isInPinchToZoomTouchMode && !VoIPFragment.this.zoomStarted && motionEvent.getActionMasked() != 0) {
                    VoIPFragment.this.finishZoom();
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    VoIPFragment.this.canZoomGesture = false;
                    VoIPFragment.this.isInPinchToZoomTouchMode = false;
                    VoIPFragment.this.zoomStarted = false;
                }
                VoIPTextureView fullscreenTextureView = VoIPFragment.this.getFullscreenTextureView();
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (motionEvent.getActionMasked() == 0) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(fullscreenTextureView.getX(), fullscreenTextureView.getY(), fullscreenTextureView.getX() + fullscreenTextureView.getMeasuredWidth(), fullscreenTextureView.getY() + fullscreenTextureView.getMeasuredHeight());
                        rectF.inset(((fullscreenTextureView.getMeasuredHeight() * fullscreenTextureView.scaleTextureToFill) - fullscreenTextureView.getMeasuredHeight()) / 2.0f, ((fullscreenTextureView.getMeasuredWidth() * fullscreenTextureView.scaleTextureToFill) - fullscreenTextureView.getMeasuredWidth()) / 2.0f);
                        if (!GroupCallActivity.isLandscapeMode) {
                            rectF.top = Math.max(rectF.top, ActionBar.getCurrentActionBarHeight());
                            rectF.bottom = Math.min(rectF.bottom, fullscreenTextureView.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                        } else {
                            rectF.top = Math.max(rectF.top, ActionBar.getCurrentActionBarHeight());
                            rectF.right = Math.min(rectF.right, fullscreenTextureView.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                        }
                        VoIPFragment.this.canZoomGesture = rectF.contains(motionEvent.getX(), motionEvent.getY());
                        if (!VoIPFragment.this.canZoomGesture) {
                            VoIPFragment.this.finishZoom();
                        }
                    }
                    if (VoIPFragment.this.canZoomGesture && !VoIPFragment.this.isInPinchToZoomTouchMode && motionEvent.getPointerCount() == 2) {
                        VoIPFragment.this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        VoIPFragment voIPFragment = VoIPFragment.this;
                        voIPFragment.pinchStartCenterX = voIPFragment.pinchCenterX = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
                        VoIPFragment voIPFragment2 = VoIPFragment.this;
                        voIPFragment2.pinchStartCenterY = voIPFragment2.pinchCenterY = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
                        VoIPFragment voIPFragment3 = VoIPFragment.this;
                        voIPFragment3.pinchScale = 1.0f;
                        voIPFragment3.pointerId1 = motionEvent.getPointerId(0);
                        VoIPFragment.this.pointerId2 = motionEvent.getPointerId(1);
                        VoIPFragment.this.isInPinchToZoomTouchMode = true;
                    }
                } else if (motionEvent.getActionMasked() == 2 && VoIPFragment.this.isInPinchToZoomTouchMode) {
                    int i = -1;
                    int i2 = -1;
                    for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
                        if (VoIPFragment.this.pointerId1 == motionEvent.getPointerId(i3)) {
                            i = i3;
                        }
                        if (VoIPFragment.this.pointerId2 == motionEvent.getPointerId(i3)) {
                            i2 = i3;
                        }
                    }
                    if (i != -1 && i2 != -1) {
                        VoIPFragment.this.pinchScale = ((float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i))) / VoIPFragment.this.pinchStartDistance;
                        VoIPFragment voIPFragment4 = VoIPFragment.this;
                        if (voIPFragment4.pinchScale > 1.005f && !voIPFragment4.zoomStarted) {
                            VoIPFragment.this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i));
                            VoIPFragment voIPFragment5 = VoIPFragment.this;
                            voIPFragment5.pinchStartCenterX = voIPFragment5.pinchCenterX = (motionEvent.getX(i) + motionEvent.getX(i2)) / 2.0f;
                            VoIPFragment voIPFragment6 = VoIPFragment.this;
                            voIPFragment6.pinchStartCenterY = voIPFragment6.pinchCenterY = (motionEvent.getY(i) + motionEvent.getY(i2)) / 2.0f;
                            VoIPFragment voIPFragment7 = VoIPFragment.this;
                            voIPFragment7.pinchScale = 1.0f;
                            voIPFragment7.pinchTranslationX = 0.0f;
                            VoIPFragment.this.pinchTranslationY = 0.0f;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            VoIPFragment.this.zoomStarted = true;
                            VoIPFragment.this.isInPinchToZoomTouchMode = true;
                        }
                        float x = (motionEvent.getX(i) + motionEvent.getX(i2)) / 2.0f;
                        float y = (motionEvent.getY(i) + motionEvent.getY(i2)) / 2.0f;
                        float f = VoIPFragment.this.pinchStartCenterX - x;
                        float f2 = VoIPFragment.this.pinchStartCenterY - y;
                        VoIPFragment voIPFragment8 = VoIPFragment.this;
                        voIPFragment8.pinchTranslationX = (-f) / voIPFragment8.pinchScale;
                        VoIPFragment voIPFragment9 = VoIPFragment.this;
                        voIPFragment9.pinchTranslationY = (-f2) / voIPFragment9.pinchScale;
                        invalidate();
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        VoIPFragment.this.finishZoom();
                    }
                } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && VoIPFragment.this.checkPointerIds(motionEvent)) || motionEvent.getActionMasked() == 3)) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    VoIPFragment.this.finishZoom();
                }
                VoIPFragment.this.fragmentView.invalidate();
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.pressedX = motionEvent.getX();
                    this.pressedY = motionEvent.getY();
                    this.check = true;
                    this.pressedTime = System.currentTimeMillis();
                } else if (action != 1) {
                    if (action == 3) {
                        this.check = false;
                    }
                } else if (this.check) {
                    float x2 = motionEvent.getX() - this.pressedX;
                    float y2 = motionEvent.getY() - this.pressedY;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    float f3 = (x2 * x2) + (y2 * y2);
                    VoIPFragment voIPFragment10 = VoIPFragment.this;
                    float f4 = voIPFragment10.touchSlop;
                    if (f3 < f4 * f4 && jCurrentTimeMillis - this.pressedTime < 300 && jCurrentTimeMillis - voIPFragment10.lastContentTapTime > 300) {
                        voIPFragment10.lastContentTapTime = System.currentTimeMillis();
                        if (VoIPFragment.this.emojiExpanded) {
                            VoIPFragment.this.expandEmoji(false);
                        } else if (VoIPFragment.this.canHideUI) {
                            VoIPFragment voIPFragment11 = VoIPFragment.this;
                            voIPFragment11.showUi(!voIPFragment11.uiVisible);
                            VoIPFragment voIPFragment12 = VoIPFragment.this;
                            voIPFragment12.previousState = voIPFragment12.currentState;
                            if (!VoIPFragment.this.uiVisible && (hintView2 = VoIPFragment.this.tapToVideoTooltip) != null && hintView2.shown()) {
                                VoIPFragment.this.tapToVideoTooltip.hide();
                            }
                            VoIPFragment.this.updateViewState();
                        }
                    }
                    this.check = false;
                }
                return VoIPFragment.this.canZoomGesture || this.check;
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (view == VoIPFragment.this.gradientLayout) {
                    VoIPFragment voIPFragment = VoIPFragment.this;
                    if (voIPFragment.currentUserIsVideo || voIPFragment.callingUserIsVideo) {
                        return false;
                    }
                }
                if ((view == VoIPFragment.this.gradientLayout || view == VoIPFragment.this.callingUserTextureView || (view == VoIPFragment.this.currentUserCameraFloatingLayout && VoIPFragment.this.currentUserCameraIsFullscreen)) && (VoIPFragment.this.zoomStarted || VoIPFragment.this.zoomBackAnimator != null)) {
                    canvas.save();
                    VoIPFragment voIPFragment2 = VoIPFragment.this;
                    float f = voIPFragment2.pinchScale;
                    canvas.scale(f, f, voIPFragment2.pinchCenterX, VoIPFragment.this.pinchCenterY);
                    canvas.translate(VoIPFragment.this.pinchTranslationX, VoIPFragment.this.pinchTranslationY);
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild;
                }
                return super.drawChild(canvas, view, j);
            }
        };
        boolean z = false;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        frameLayout.setBackgroundColor(-16777216);
        updateSystemBarColors();
        this.fragmentView = frameLayout;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        this.gradientLayout = new VoIpGradientLayout(context, sharedState != null && sharedState.isConference(), this.backgroundProvider);
        VoIPTextureView voIPTextureView = new VoIPTextureView(context, false, true, false, false);
        this.callingUserTextureView = voIPTextureView;
        TextureViewRenderer textureViewRenderer = voIPTextureView.renderer;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        textureViewRenderer.setScalingType(scalingType);
        this.callingUserTextureView.renderer.setEnableHardwareScaler(true);
        this.callingUserTextureView.renderer.setRotateTextureWithScreen(true);
        this.callingUserTextureView.scaleType = VoIPTextureView.SCALE_TYPE_FIT;
        frameLayout.addView(this.gradientLayout, LayoutHelper.createFrame(-1, -1.0f));
        VoIpCoverView voIpCoverView = new VoIpCoverView(context, this.callingUser, this.backgroundProvider);
        this.voIpCoverView = voIpCoverView;
        frameLayout.addView(voIpCoverView, LayoutHelper.createFrame(-1, -1.0f));
        VoIpSnowView voIpSnowView = new VoIpSnowView(context);
        this.voIpSnowView = voIpSnowView;
        frameLayout.addView(voIpSnowView, LayoutHelper.createFrame(-1, 220.0f));
        frameLayout.addView(this.callingUserTextureView);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        new BackgroundGradientDrawable(orientation, new int[]{-14994098, -14328963}).startDithering(BackgroundGradientDrawable.Sizes.ofDeviceScreen(BackgroundGradientDrawable.Sizes.Orientation.PORTRAIT), new BackgroundGradientDrawable.ListenerAdapter() {
            @Override
            public void onAllSizesReady() {
                VoIPFragment.this.gradientLayout.invalidate();
            }
        });
        VoIPFloatingLayout voIPFloatingLayout = new VoIPFloatingLayout(context);
        this.currentUserCameraFloatingLayout = voIPFloatingLayout;
        voIPFloatingLayout.setDelegate(new VoIPFloatingLayout.VoIPFloatingLayoutDelegate() {
            @Override
            public final void onChange(float f, boolean z2) {
                this.f$0.lambda$createView$5(f, z2);
            }
        });
        this.currentUserCameraFloatingLayout.setRelativePosition(1.0f, 1.0f);
        this.currentUserCameraIsFullscreen = true;
        VoIPTextureView voIPTextureView2 = new VoIPTextureView(context, true, false);
        this.currentUserTextureView = voIPTextureView2;
        voIPTextureView2.renderer.setIsCamera(true);
        this.currentUserTextureView.renderer.setUseCameraRotation(true);
        this.currentUserCameraFloatingLayout.setOnTapListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createView$6(view);
            }
        });
        this.currentUserTextureView.renderer.setMirror(true);
        this.currentUserCameraFloatingLayout.addView(this.currentUserTextureView);
        VoIPFloatingLayout voIPFloatingLayout2 = new VoIPFloatingLayout(context);
        this.callingUserMiniFloatingLayout = voIPFloatingLayout2;
        voIPFloatingLayout2.alwaysFloating = true;
        voIPFloatingLayout2.setFloatingMode(true, false);
        TextureViewRenderer textureViewRenderer2 = new TextureViewRenderer(context);
        this.callingUserMiniTextureRenderer = textureViewRenderer2;
        textureViewRenderer2.setEnableHardwareScaler(true);
        this.callingUserMiniTextureRenderer.setIsCamera(false);
        this.callingUserMiniTextureRenderer.setFpsReduction(30.0f);
        this.callingUserMiniTextureRenderer.setScalingType(scalingType);
        this.callingUserMiniFloatingLayout.addView(this.callingUserMiniTextureRenderer, LayoutHelper.createFrame(-1, -2, 17));
        this.callingUserMiniFloatingLayout.setOnTapListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createView$7(view);
            }
        });
        this.callingUserMiniFloatingLayout.setVisibility(8);
        frameLayout.addView(this.currentUserCameraFloatingLayout, LayoutHelper.createFrame(-2, -2.0f));
        frameLayout.addView(this.callingUserMiniFloatingLayout);
        View view = new View(context);
        this.bottomShadow = view;
        view.setBackground(new GradientDrawable(orientation, new int[]{0, ColorUtils.setAlphaComponent(-16777216, 127)}));
        frameLayout.addView(this.bottomShadow, LayoutHelper.createFrame(-1, 160, 80));
        View view2 = new View(context);
        this.topShadow = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{ColorUtils.setAlphaComponent(-16777216, 102), 0}));
        frameLayout.addView(this.topShadow, LayoutHelper.createFrame(-1, 160, 48));
        LinearLayout linearLayout = new LinearLayout(context) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(VoIPFragment.this.emojiLoaded);
            }
        };
        this.emojiLayout = linearLayout;
        linearLayout.setOrientation(0);
        this.emojiLayout.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
        this.emojiLayout.setClipToPadding(false);
        this.emojiLayout.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
        this.emojiLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                this.f$0.lambda$createView$8(view3);
            }
        });
        this.hideEmojiTextView = new HideEmojiTextView(context, this.backgroundProvider);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.hideEmojiLayout = frameLayout2;
        frameLayout2.addView(this.hideEmojiTextView, LayoutHelper.createFrame(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
        this.hideEmojiLayout.setVisibility(8);
        this.hideEmojiLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                this.f$0.lambda$createView$9(view3);
            }
        });
        EmojiRationalLayout emojiRationalLayout = new EmojiRationalLayout(context, this.backgroundProvider);
        this.emojiRationalLayout = emojiRationalLayout;
        emojiRationalLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.emojiRationalTopTextView = textView;
        textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
        this.emojiRationalTopTextView.setTextSize(1, 15.0f);
        this.emojiRationalTopTextView.setTypeface(AndroidUtilities.bold());
        this.emojiRationalTopTextView.setTextColor(-1);
        this.emojiRationalTopTextView.setGravity(17);
        TextView textView2 = new TextView(context) {
            @Override
            protected void onLayout(boolean z2, int i, int i2, int i3, int i4) {
                super.onLayout(z2, i, i2, i3, i4);
                if (z2) {
                    VoIPFragment.this.updateViewState();
                }
            }
        };
        this.emojiRationalTextView = textView2;
        textView2.setTextSize(1, 15.0f);
        this.emojiRationalTextView.setTextColor(-1);
        this.emojiRationalTextView.setGravity(17);
        this.emojiRationalTextView.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(this.callingUser), this.emojiRationalTextView.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
        this.emojiRationalLayout.setVisibility(8);
        this.emojiRationalLayout.addView(this.emojiRationalTopTextView);
        this.emojiRationalLayout.addView(this.emojiRationalTextView, LayoutHelper.createLinear(-2, -2, 0.0f, 8.0f, 0.0f, 0.0f));
        this.emojiRationalLayout.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
        int i = 0;
        while (i < 4) {
            this.emojiViews[i] = new BackupImageView(context);
            this.emojiViews[i].getImageReceiver().setAspectFit(true);
            this.emojiLayout.addView(this.emojiViews[i], LayoutHelper.createLinear(25, 25, i == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f));
            i++;
        }
        LinearLayout linearLayout2 = new LinearLayout(context) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                VoIPServiceState sharedState2 = VoIPService.getSharedState();
                CharSequence text = VoIPFragment.this.callingUserTitle.getText();
                if (sharedState2 == null || TextUtils.isEmpty(text)) {
                    return;
                }
                StringBuilder sb = new StringBuilder(text);
                sb.append(", ");
                if (sharedState2.getPrivateCall() != null && sharedState2.getPrivateCall().video) {
                    sb.append(LocaleController.getString(R.string.VoipInVideoCallBranding));
                } else {
                    sb.append(LocaleController.getString(R.string.VoipInCallBranding));
                }
                long callDuration = sharedState2.getCallDuration();
                if (callDuration > 0) {
                    sb.append(", ");
                    sb.append(LocaleController.formatDuration((int) (callDuration / 1000)));
                }
                accessibilityNodeInfo.setText(sb);
            }
        };
        this.statusLayout = linearLayout2;
        linearLayout2.setOrientation(1);
        this.statusLayout.setFocusable(true);
        this.statusLayout.setFocusableInTouchMode(true);
        this.callingUserPhotoViewMini = new ImageWithWavesView(context);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(this.callingUser);
        this.callingUserPhotoViewMini.setImage(ImageLocation.getForUserOrChat(this.currentAccount, this.callingUser, 0), null, avatarDrawable, this.callingUser);
        this.callingUserPhotoViewMini.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
        TextView textView3 = new TextView(context);
        this.callingUserTitle = textView3;
        textView3.setTextSize(1, 28.0f);
        TLRPC.User user = this.callingUser;
        this.callingUserTitle.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), this.callingUserTitle.getPaint().getFontMetricsInt(), false));
        this.callingUserTitle.setMaxLines(2);
        this.callingUserTitle.setEllipsize(TextUtils.TruncateAt.END);
        this.callingUserTitle.setTextColor(-1);
        this.callingUserTitle.setGravity(1);
        this.callingUserTitle.setImportantForAccessibility(2);
        this.statusLayout.addView(this.callingUserTitle, LayoutHelper.createLinear(-2, -2, 1, 8, 0, 8, 6));
        VoIPStatusTextView voIPStatusTextView = new VoIPStatusTextView(context, this.backgroundProvider);
        this.statusTextView = voIPStatusTextView;
        ViewCompat.setImportantForAccessibility(voIPStatusTextView, 4);
        this.statusLayout.addView(this.statusTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 6));
        if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
            ConferenceParticipantsView conferenceParticipantsView = new ConferenceParticipantsView(context);
            this.participantsView = conferenceParticipantsView;
            conferenceParticipantsView.set(this.currentAccount, sharedState.getUser().id, sharedState.getGroupParticipants(), sharedState.getGroupCall().participants_count);
            this.statusLayout.addView(this.participantsView, LayoutHelper.createLinear(-1, 30, 0.0f, 22.0f, 0.0f, 0.0f));
        }
        this.statusLayout.setClipChildren(false);
        this.statusLayout.setClipToPadding(false);
        this.statusLayout.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
        this.endCloseLayout = new EndCloseLayout(context);
        this.rateCallLayout = new RateCallLayout(context, this.backgroundProvider);
        this.endCloseLayout.setAlpha(0.0f);
        this.rateCallLayout.setVisibility(8);
        frameLayout.addView(this.callingUserPhotoViewMini, LayoutHelper.createFrame(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
        frameLayout.addView(this.statusLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
        frameLayout.addView(this.hideEmojiLayout, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(this.emojiRationalLayout, LayoutHelper.createFrame(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
        frameLayout.addView(this.emojiLayout, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(this.endCloseLayout, LayoutHelper.createFrame(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.addView(this.rateCallLayout, LayoutHelper.createFrame(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
        this.buttonsLayout = new VoIPButtonsLayout(context);
        this.bottomSpeakerBtn = new VoIpSwitchLayout(context, this.backgroundProvider);
        this.bottomVideoBtn = new VoIpSwitchLayout(context, this.backgroundProvider);
        this.bottomMuteBtn = new VoIpSwitchLayout(context, this.backgroundProvider);
        this.bottomEndCallBtn = new VoIPToggleButton(context, 52.0f) {
            @Override
            protected void dispatchSetPressed(boolean z2) {
                super.dispatchSetPressed(z2);
                setPressedBtn(z2);
            }
        };
        this.bottomSpeakerBtn.setTranslationY(AndroidUtilities.dp(100.0f));
        this.bottomSpeakerBtn.setScaleX(0.0f);
        this.bottomSpeakerBtn.setScaleY(0.0f);
        this.bottomSpeakerBtn.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        this.bottomVideoBtn.setTranslationY(AndroidUtilities.dp(100.0f));
        this.bottomVideoBtn.setScaleX(0.0f);
        this.bottomVideoBtn.setScaleY(0.0f);
        this.bottomVideoBtn.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        this.bottomMuteBtn.setTranslationY(AndroidUtilities.dp(100.0f));
        this.bottomMuteBtn.setScaleX(0.0f);
        this.bottomMuteBtn.setScaleY(0.0f);
        this.bottomMuteBtn.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        this.bottomEndCallBtn.setTranslationY(AndroidUtilities.dp(100.0f));
        this.bottomEndCallBtn.setScaleX(0.0f);
        this.bottomEndCallBtn.setScaleY(0.0f);
        this.bottomEndCallBtn.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        this.buttonsLayout.addView(this.bottomSpeakerBtn);
        this.buttonsLayout.addView(this.bottomVideoBtn);
        this.buttonsLayout.addView(this.bottomMuteBtn);
        this.buttonsLayout.addView(this.bottomEndCallBtn);
        AcceptDeclineView acceptDeclineView = new AcceptDeclineView(context);
        this.acceptDeclineView = acceptDeclineView;
        acceptDeclineView.setListener(new AnonymousClass8());
        this.acceptDeclineView.setScaleX(1.15f);
        this.acceptDeclineView.setScaleY(1.15f);
        frameLayout.addView(this.buttonsLayout, LayoutHelper.createFrame(-1, -2, 80));
        float f = AndroidUtilities.isTablet() ? 100 : 27;
        frameLayout.addView(this.acceptDeclineView, LayoutHelper.createFrame(-1, 186.0f, 80, f, 0.0f, f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.addIcon = imageView;
        imageView.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(-1, 76)));
        this.addIcon.setImageResource(R.drawable.msg_addcontact);
        this.addIcon.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        frameLayout.addView(this.addIcon, LayoutHelper.createFrame(56, 56, 53));
        ScaleStateListAnimator.apply(this.addIcon);
        ImageView imageView2 = new ImageView(context);
        this.backIcon = imageView2;
        imageView2.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(-1, 76)));
        this.backIcon.setImageResource(R.drawable.msg_call_minimize_shadow);
        this.backIcon.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        this.backIcon.setContentDescription(LocaleController.getString(R.string.Back));
        frameLayout.addView(this.backIcon, LayoutHelper.createFrame(56, 56, 51));
        ScaleStateListAnimator.apply(this.backIcon);
        ImageView imageView3 = new ImageView(context) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
                accessibilityNodeInfo.setCheckable(true);
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    accessibilityNodeInfo.setChecked(sharedInstance.isSpeakerphoneOn());
                }
            }
        };
        this.speakerPhoneIcon = imageView3;
        imageView3.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
        this.speakerPhoneIcon.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(-1, 76)));
        this.speakerPhoneIcon.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.addView(this.speakerPhoneIcon, LayoutHelper.createFrame(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
        this.speakerPhoneIcon.setAlpha(0.0f);
        this.speakerPhoneIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                this.f$0.lambda$createView$10(view3);
            }
        });
        this.backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                this.f$0.lambda$createView$11(view3);
            }
        });
        this.addIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                this.f$0.lambda$createView$13(context, view3);
            }
        });
        if (this.windowView.isLockOnScreen()) {
            this.backIcon.setVisibility(8);
            this.addIcon.setVisibility(8);
        }
        VoIPNotificationsLayout voIPNotificationsLayout = new VoIPNotificationsLayout(context, this.backgroundProvider);
        this.notificationsLayout = voIPNotificationsLayout;
        voIPNotificationsLayout.setGravity(80);
        this.notificationsLayout.setOnViewsUpdated(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$14();
            }
        });
        frameLayout.addView(this.notificationsLayout, LayoutHelper.createFrame(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        HintView2 multilineText = new VoIpHintView(context, 3, this.backgroundProvider, true).setMultilineText(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        HintView2 rounding = multilineText.setTextAlign(alignment).setDuration(-1L).setOnHiddenListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.startWaitingFoHideUi();
            }
        }).setHideByTouch(true).setMaxWidth(320.0f).useScale(true).setInnerPadding(10.0f, 6.0f, 10.0f, 6.0f).setRounding(8.0f);
        this.tapToVideoTooltip = rounding;
        rounding.setText(LocaleController.getString(R.string.TapToTurnCamera));
        frameLayout.addView(this.tapToVideoTooltip, LayoutHelper.createFrame(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
        HintView2 rounding2 = new VoIpHintView(context, 1, this.backgroundProvider, false).setMultilineText(true).setTextAlign(alignment).setDuration(4000L).setHideByTouch(true).setMaxWidth(320.0f).useScale(true).setInnerPadding(10.0f, 6.0f, 10.0f, 6.0f).setRounding(8.0f);
        this.encryptionTooltip = rounding2;
        rounding2.setText(LocaleController.getString(R.string.VoipHintEncryptionKey));
        frameLayout.addView(this.encryptionTooltip, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        updateViewState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!this.isVideoCall) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video) {
                    z = true;
                }
                this.isVideoCall = z;
            }
            initRenderers();
        }
        return frameLayout;
    }

    public void lambda$createView$5(float f, boolean z) {
        this.currentUserTextureView.setScreenshareMiniProgress(f, z);
    }

    public void lambda$createView$6(View view) {
        if (this.currentUserIsVideo && this.callingUserIsVideo && System.currentTimeMillis() - this.lastContentTapTime > 500) {
            AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
            this.hideUiRunnableWaiting = false;
            this.lastContentTapTime = System.currentTimeMillis();
            this.callingUserMiniFloatingLayout.setRelativePosition(this.currentUserCameraFloatingLayout);
            this.currentUserCameraIsFullscreen = true;
            this.cameraForceExpanded = true;
            this.previousState = this.currentState;
            updateViewState();
        }
    }

    public void lambda$createView$7(View view) {
        if (!this.cameraForceExpanded || System.currentTimeMillis() - this.lastContentTapTime <= 500) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
        this.hideUiRunnableWaiting = false;
        this.lastContentTapTime = System.currentTimeMillis();
        this.currentUserCameraFloatingLayout.setRelativePosition(this.callingUserMiniFloatingLayout);
        this.currentUserCameraIsFullscreen = false;
        this.cameraForceExpanded = false;
        this.previousState = this.currentState;
        updateViewState();
    }

    public void lambda$createView$8(View view) {
        if (System.currentTimeMillis() - this.lastContentTapTime < 500) {
            return;
        }
        this.lastContentTapTime = System.currentTimeMillis();
        boolean z = this.emojiExpanded;
        if (!z && this.emojiLoaded) {
            expandEmoji(!z);
        }
    }

    public void lambda$createView$9(View view) {
        if (System.currentTimeMillis() - this.lastContentTapTime < 500) {
            return;
        }
        this.lastContentTapTime = System.currentTimeMillis();
        if (this.emojiLoaded) {
            expandEmoji(!this.emojiExpanded);
        }
    }

    class AnonymousClass8 implements AcceptDeclineView.Listener {
        AnonymousClass8() {
        }

        @Override
        public void onAccept() {
            if (VoIPFragment.this.currentState == 17) {
                Intent intent = new Intent(VoIPFragment.this.activity, (Class<?>) VoIPService.class);
                intent.putExtra("user_id", VoIPFragment.this.callingUser.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", VoIPFragment.this.isVideoCall);
                intent.putExtra("can_video_call", VoIPFragment.this.isVideoCall);
                intent.putExtra("account", VoIPFragment.this.currentAccount);
                try {
                    VoIPFragment.this.activity.startService(intent);
                    return;
                } catch (Throwable th) {
                    FileLog.e(th);
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 23 && VoIPFragment.this.activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                VoIPFragment.this.activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
            } else if (VoIPService.getSharedState() != null) {
                VoIPFragment.this.runAcceptCallAnimation(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onAccept$0();
                    }
                });
            }
        }

        public void lambda$onAccept$0() {
            if (VoIPService.getSharedState() != null) {
                VoIPService.getSharedState().acceptIncomingCall();
                if (!VoIPFragment.this.currentUserIsVideo || VoIPService.getSharedInstance() == null) {
                    return;
                }
                VoIPService.getSharedInstance().requestVideoCall(false);
            }
        }

        @Override
        public void onDecline() {
            if (VoIPFragment.this.currentState == 17) {
                VoIPFragment.this.windowView.finish();
            } else if (VoIPService.getSharedState() == null) {
                VoIPFragment.this.windowView.finish();
            } else {
                VoIPService.getSharedState().declineIncomingCall();
            }
        }
    }

    public void lambda$createView$10(View view) {
        VoIPService sharedInstance;
        int i;
        if (this.speakerPhoneIcon.getTag() == null || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        startWaitingFoHideUi();
        if (sharedInstance.isBluetoothOn()) {
            i = 2;
        } else {
            i = sharedInstance.isSpeakerphoneOn() ? 0 : 1;
        }
        sharedInstance.toggleSpeakerphoneOrShowRouteSheet(this.activity, false, Integer.valueOf(i));
    }

    public void lambda$createView$11(View view) {
        if (this.lockOnScreen) {
            return;
        }
        onBackPressed();
    }

    public void lambda$createView$13(Context context, View view) {
        if (this.lockOnScreen) {
            return;
        }
        UserSelectorBottomSheet userSelectorBottomSheet = this.addPeopleSheet;
        if (userSelectorBottomSheet != null) {
            userSelectorBottomSheet.dismiss();
            this.addPeopleSheet = null;
        }
        UserSelectorBottomSheet userSelectorBottomSheet2 = new UserSelectorBottomSheet(context, this.currentAccount, 0L, null, 4, true, new DarkBlueThemeResourcesProvider());
        TLRPC.User user = this.currentUser;
        long j = user != null ? user.id : 0L;
        TLRPC.User user2 = this.callingUser;
        UserSelectorBottomSheet onUsersSelector = userSelectorBottomSheet2.exceptUsers(j, user2 != null ? user2.id : 0L).setOnUsersSelector(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                VoIPFragment.lambda$createView$12((Boolean) obj, (HashSet) obj2);
            }
        });
        this.addPeopleSheet = onUsersSelector;
        onUsersSelector.show();
    }

    public static void lambda$createView$12(Boolean bool, HashSet hashSet) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.convertToConferenceCall(bool.booleanValue(), hashSet);
        }
    }

    public void lambda$createView$14() {
        this.previousState = this.currentState;
        updateViewState();
    }

    public void runAcceptCallAnimation(final Runnable runnable) {
        if (this.bottomVideoBtn.getVisibility() == 0) {
            this.acceptDeclineView.getLocationOnScreen(new int[2]);
            this.acceptDeclineView.stopAnimations();
            runnable.run();
            return;
        }
        this.bottomEndCallBtn.animate().cancel();
        this.bottomSpeakerBtn.animate().cancel();
        this.bottomMuteBtn.animate().cancel();
        this.bottomVideoBtn.animate().cancel();
        this.acceptDeclineView.getLocationOnScreen(new int[2]);
        this.acceptDeclineView.stopAnimations();
        this.bottomEndCallBtn.setData(R.drawable.calls_decline, -1, -1041108, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.bottomSpeakerBtn.setType(VoIpSwitchLayout.Type.SPEAKER, false);
        this.bottomMuteBtn.setType(VoIpSwitchLayout.Type.MICRO, false);
        this.bottomVideoBtn.setType(VoIpSwitchLayout.Type.VIDEO, true);
        this.bottomEndCallBtn.setVisibility(0);
        this.bottomSpeakerBtn.setVisibility(0);
        this.bottomMuteBtn.setVisibility(0);
        this.bottomVideoBtn.setVisibility(0);
        this.bottomEndCallBtn.setAlpha(0.0f);
        this.bottomSpeakerBtn.setAlpha(0.0f);
        this.bottomMuteBtn.setAlpha(0.0f);
        this.bottomVideoBtn.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.acceptDeclineView.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int iDp = AndroidUtilities.dp(24.0f);
        final int iDp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$runAcceptCallAnimation$15(iDp2, marginEnd, iDp, marginLayoutParams, valueAnimator);
            }
        });
        AcceptDeclineView acceptDeclineView = this.acceptDeclineView;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(acceptDeclineView, (Property<AcceptDeclineView, Float>) View.SCALE_X, acceptDeclineView.getScaleX(), 1.0f, 1.0f, 1.0f);
        AcceptDeclineView acceptDeclineView2 = this.acceptDeclineView;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(acceptDeclineView2, (Property<AcceptDeclineView, Float>) View.SCALE_Y, acceptDeclineView2.getScaleY(), 1.0f, 1.0f, 1.0f);
        AcceptDeclineView acceptDeclineView3 = this.acceptDeclineView;
        animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(acceptDeclineView3, (Property<AcceptDeclineView, Float>) View.ALPHA, acceptDeclineView3.getAlpha(), this.acceptDeclineView.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                runnable.run();
                VoIPFragment.this.acceptDeclineView.setScaleX(1.15f);
                VoIPFragment.this.acceptDeclineView.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) VoIPFragment.this.acceptDeclineView.getLayoutParams();
                marginLayoutParams2.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams2.rightMargin = AndroidUtilities.dp(10.0f);
                VoIPFragment.this.acceptDeclineView.setVisibility(8);
            }
        });
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runAcceptCallAnimation$16();
            }
        }, 133L);
    }

    public void lambda$runAcceptCallAnimation$15(int i, int i2, int i3, ViewGroup.MarginLayoutParams marginLayoutParams, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.acceptDeclineView.setTranslationY(i * fFloatValue);
        int i4 = (int) (i2 - ((i2 + i3) * fFloatValue));
        marginLayoutParams.leftMargin = i4;
        marginLayoutParams.rightMargin = i4;
        this.acceptDeclineView.requestLayout();
    }

    public void lambda$runAcceptCallAnimation$16() {
        int[] iArr = new int[2];
        this.acceptDeclineView.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        this.bottomSpeakerBtn.getLocationOnScreen(iArr);
        this.bottomSpeakerBtn.setTranslationX((i - iArr[0]) + AndroidUtilities.dp(42.0f));
        this.bottomSpeakerBtn.setTranslationY((i2 - iArr[1]) + AndroidUtilities.dp(44.0f));
        this.bottomMuteBtn.getLocationOnScreen(iArr);
        this.bottomMuteBtn.setTranslationX((i - iArr[0]) + AndroidUtilities.dp(42.0f));
        this.bottomMuteBtn.setTranslationY((i2 - iArr[1]) + AndroidUtilities.dp(44.0f));
        this.bottomVideoBtn.getLocationOnScreen(iArr);
        this.bottomVideoBtn.setTranslationX((i - iArr[0]) + AndroidUtilities.dp(42.0f));
        this.bottomVideoBtn.setTranslationY((i2 - iArr[1]) + AndroidUtilities.dp(44.0f));
        this.bottomEndCallBtn.getLocationOnScreen(iArr);
        this.bottomEndCallBtn.setTranslationX((((i + this.acceptDeclineView.getWidth()) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
        this.bottomEndCallBtn.setTranslationY((i2 - iArr[1]) + AndroidUtilities.dp(44.0f));
        this.bottomEndCallBtn.setAlpha(1.0f);
        this.bottomSpeakerBtn.setAlpha(1.0f);
        this.bottomMuteBtn.setAlpha(1.0f);
        this.bottomVideoBtn.setAlpha(1.0f);
        long j = 200;
        this.bottomEndCallBtn.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j).start();
        this.bottomSpeakerBtn.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j).start();
        this.bottomMuteBtn.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j).start();
        this.bottomVideoBtn.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j).start();
    }

    public boolean checkPointerIds(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return false;
        }
        if (this.pointerId1 == motionEvent.getPointerId(0) && this.pointerId2 == motionEvent.getPointerId(1)) {
            return true;
        }
        return this.pointerId1 == motionEvent.getPointerId(1) && this.pointerId2 == motionEvent.getPointerId(0);
    }

    public VoIPTextureView getFullscreenTextureView() {
        if (this.callingUserIsVideo) {
            return this.callingUserTextureView;
        }
        return this.currentUserTextureView;
    }

    public void finishZoom() {
        if (this.zoomStarted) {
            this.zoomStarted = false;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.zoomBackAnimator = valueAnimatorOfFloat;
            final float f = this.pinchScale;
            final float f2 = this.pinchTranslationX;
            final float f3 = this.pinchTranslationY;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$finishZoom$17(f, f2, f3, valueAnimator);
                }
            });
            this.zoomBackAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    VoIPFragment voIPFragment = VoIPFragment.this;
                    voIPFragment.zoomBackAnimator = null;
                    voIPFragment.pinchScale = 1.0f;
                    voIPFragment.pinchTranslationX = 0.0f;
                    VoIPFragment.this.pinchTranslationY = 0.0f;
                    VoIPFragment.this.fragmentView.invalidate();
                }
            });
            this.zoomBackAnimator.setDuration(350L);
            this.zoomBackAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.zoomBackAnimator.start();
        }
        this.canZoomGesture = false;
        this.isInPinchToZoomTouchMode = false;
    }

    public void lambda$finishZoom$17(float f, float f2, float f3, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.pinchScale = (f * fFloatValue) + ((1.0f - fFloatValue) * 1.0f);
        this.pinchTranslationX = f2 * fFloatValue;
        this.pinchTranslationY = f3 * fFloatValue;
        this.fragmentView.invalidate();
    }

    class AnonymousClass12 implements RendererCommon.RendererEvents {
        @Override
        public void onFrameResolutionChanged(int i, int i2, int i3) {
        }

        AnonymousClass12() {
        }

        public void lambda$onFirstFrameRendered$0() {
            VoIPFragment.this.updateViewState();
        }

        @Override
        public void onFirstFrameRendered() {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onFirstFrameRendered$0();
                }
            });
        }
    }

    private void initRenderers() {
        this.currentUserTextureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new AnonymousClass12());
        this.callingUserTextureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new AnonymousClass13(), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.callingUserMiniTextureRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    class AnonymousClass13 implements RendererCommon.RendererEvents {
        @Override
        public void onFrameResolutionChanged(int i, int i2, int i3) {
        }

        AnonymousClass13() {
        }

        @Override
        public void onFirstFrameRendered() {
            if (VoIPFragment.this.firstFrameCallback != null) {
                VoIPFragment.this.firstFrameCallback.run();
                VoIPFragment.this.firstFrameCallback = null;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onFirstFrameRendered$0();
                }
            });
        }

        public void lambda$onFirstFrameRendered$0() {
            VoIPFragment.this.updateViewState();
        }
    }

    public void switchToPip() {
        if (this.isFinished || instance == null) {
            return;
        }
        this.isFinished = true;
        if (VoIPService.getSharedInstance() != null) {
            int measuredHeight = instance.windowView.getMeasuredHeight();
            VoIPFragment voIPFragment = instance;
            VoIPPiPView.show(voIPFragment.activity, voIPFragment.currentAccount, voIPFragment.windowView.getMeasuredWidth(), measuredHeight, 1);
            WindowInsets windowInsets = instance.lastInsets;
            if (windowInsets != null) {
                VoIPPiPView.topInset = windowInsets.getSystemWindowInsetTop();
                VoIPPiPView.bottomInset = instance.lastInsets.getSystemWindowInsetBottom();
            }
        }
        if (VoIPPiPView.getInstance() == null) {
            return;
        }
        ViewPropertyAnimator duration = this.speakerPhoneIcon.animate().alpha(0.0f).setDuration(150L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        duration.setInterpolator(cubicBezierInterpolator).start();
        this.backIcon.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.addIcon.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.emojiLayout.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.statusLayout.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.buttonsLayout.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.bottomShadow.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.topShadow.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.callingUserMiniFloatingLayout.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.notificationsLayout.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        VoIPPiPView.switchingToPip = true;
        this.switchingToPip = true;
        Animator animatorCreatePiPTransition = createPiPTransition(false);
        this.notificationsLocker.lock();
        animatorCreatePiPTransition.addListener(new AnonymousClass14());
        animatorCreatePiPTransition.setDuration(350L);
        animatorCreatePiPTransition.setInterpolator(cubicBezierInterpolator);
        animatorCreatePiPTransition.start();
    }

    class AnonymousClass14 extends AnimatorListenerAdapter {
        AnonymousClass14() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            VoIPPiPView.getInstance().windowView.setAlpha(1.0f);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onAnimationEnd$0();
                }
            }, 200L);
        }

        public void lambda$onAnimationEnd$0() {
            VoIPFragment.this.notificationsLocker.unlock();
            VoIPPiPView.getInstance().onTransitionEnd();
            VoIPFragment.this.currentUserCameraFloatingLayout.setCornerRadius(-1.0f);
            VoIPFragment.this.callingUserTextureView.renderer.release();
            VoIPFragment.this.currentUserTextureView.renderer.release();
            VoIPFragment.this.callingUserMiniTextureRenderer.release();
            VoIPFragment.this.destroy();
            VoIPFragment.this.windowView.finishImmediate();
            VoIPPiPView.switchingToPip = false;
            VoIPFragment.this.switchingToPip = false;
            VoIPFragment unused = VoIPFragment.instance = null;
        }
    }

    public void startTransitionFromPiP() {
        this.enterFromPiP = true;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getVideoState(false) == 2) {
            this.callingUserTextureView.setStub(VoIPPiPView.getInstance().callingUserTextureView);
            this.currentUserTextureView.setStub(VoIPPiPView.getInstance().currentUserTextureView);
        }
        this.windowView.setAlpha(0.0f);
        updateViewState();
        this.switchingToPip = true;
        VoIPPiPView.switchingToPip = true;
        VoIPPiPView.prepareForTransition();
        this.notificationsLocker.lock();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$startTransitionFromPiP$19();
            }
        }, 32L);
    }

    public void lambda$startTransitionFromPiP$19() {
        this.windowView.setAlpha(1.0f);
        this.windowView.invalidate();
        final Animator animatorCreatePiPTransition = createPiPTransition(true);
        this.backIcon.setAlpha(0.0f);
        this.addIcon.setAlpha(0.0f);
        this.emojiLayout.setAlpha(0.0f);
        this.statusLayout.setAlpha(0.0f);
        this.buttonsLayout.setAlpha(0.0f);
        this.bottomShadow.setAlpha(0.0f);
        this.topShadow.setAlpha(0.0f);
        this.speakerPhoneIcon.setAlpha(0.0f);
        this.notificationsLayout.setAlpha(0.0f);
        this.currentUserCameraFloatingLayout.switchingToPip = true;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$startTransitionFromPiP$18(animatorCreatePiPTransition);
            }
        }, 32L);
    }

    public void lambda$startTransitionFromPiP$18(Animator animator) {
        VoIPPiPView.switchingToPip = false;
        VoIPPiPView.finish();
        ViewPropertyAnimator duration = this.speakerPhoneIcon.animate().setDuration(150L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        duration.setInterpolator(cubicBezierInterpolator).start();
        this.backIcon.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.addIcon.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.emojiLayout.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.statusLayout.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.buttonsLayout.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.bottomShadow.animate().alpha(1.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.topShadow.animate().alpha(1.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.notificationsLayout.animate().alpha(1.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator2) {
                VoIPFragment.this.notificationsLocker.unlock();
                VoIPFragment.this.currentUserCameraFloatingLayout.setCornerRadius(-1.0f);
                VoIPFragment.this.switchingToPip = false;
                VoIPFragment.this.currentUserCameraFloatingLayout.switchingToPip = false;
                VoIPFragment voIPFragment = VoIPFragment.this;
                voIPFragment.previousState = voIPFragment.currentState;
                VoIPFragment.this.updateViewState();
            }
        });
        animator.setDuration(350L);
        animator.setInterpolator(cubicBezierInterpolator);
        animator.start();
    }

    public Animator createPiPTransition(boolean z) {
        float measuredHeight;
        float f;
        float f2;
        final boolean z2;
        float fDp;
        final float fDp2;
        float f3;
        float f4;
        float f5;
        float f6;
        this.currentUserCameraFloatingLayout.animate().cancel();
        float f7 = VoIPPiPView.getInstance().windowLayoutParams.x + VoIPPiPView.getInstance().xOffset;
        float f8 = VoIPPiPView.getInstance().windowLayoutParams.y + VoIPPiPView.getInstance().yOffset;
        final float x = this.currentUserCameraFloatingLayout.getX();
        final float y = this.currentUserCameraFloatingLayout.getY();
        final float scaleX = this.currentUserCameraFloatingLayout.getScaleX();
        float f9 = VoIPPiPView.isExpanding() ? 0.4f : 0.25f;
        final float measuredWidth = f7 - ((this.callingUserTextureView.getMeasuredWidth() - (this.callingUserTextureView.getMeasuredWidth() * f9)) / 2.0f);
        final float measuredHeight2 = f8 - ((this.callingUserTextureView.getMeasuredHeight() - (this.callingUserTextureView.getMeasuredHeight() * f9)) / 2.0f);
        if (this.callingUserIsVideo) {
            int measuredWidth2 = this.currentUserCameraFloatingLayout.getMeasuredWidth();
            if (!this.currentUserIsVideo || measuredWidth2 == 0) {
                z2 = false;
                measuredHeight = 1.0f;
                f2 = 0.0f;
                f = 1.0f;
            } else {
                float measuredWidth3 = (this.windowView.getMeasuredWidth() / measuredWidth2) * f9 * 0.4f;
                float measuredWidth4 = (((f7 - ((this.currentUserCameraFloatingLayout.getMeasuredWidth() - (this.currentUserCameraFloatingLayout.getMeasuredWidth() * measuredWidth3)) / 2.0f)) + (VoIPPiPView.getInstance().parentWidth * f9)) - ((VoIPPiPView.getInstance().parentWidth * f9) * 0.4f)) - AndroidUtilities.dp(4.0f);
                measuredHeight = (((f8 - ((this.currentUserCameraFloatingLayout.getMeasuredHeight() - (this.currentUserCameraFloatingLayout.getMeasuredHeight() * measuredWidth3)) / 2.0f)) + (VoIPPiPView.getInstance().parentHeight * f9)) - ((VoIPPiPView.getInstance().parentHeight * f9) * 0.4f)) - AndroidUtilities.dp(4.0f);
                f = measuredWidth4;
                f2 = measuredWidth3;
            }
            if (this.callingUserIsVideo) {
                fDp = AndroidUtilities.dp(4.0f);
            } else {
                fDp = 0.0f;
            }
            fDp2 = (AndroidUtilities.dp(4.0f) * 1.0f) / f2;
            if (this.callingUserIsVideo || VoIPPiPView.isExpanding()) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            if (z) {
                if (z2) {
                    this.currentUserCameraFloatingLayout.setScaleX(f2);
                    this.currentUserCameraFloatingLayout.setScaleY(f2);
                    this.currentUserCameraFloatingLayout.setTranslationX(f);
                    this.currentUserCameraFloatingLayout.setTranslationY(measuredHeight);
                    this.currentUserCameraFloatingLayout.setCornerRadius(fDp2);
                    this.currentUserCameraFloatingLayout.setAlpha(f3);
                }
                this.callingUserTextureView.setScaleX(f9);
                this.callingUserTextureView.setScaleY(f9);
                this.callingUserTextureView.setTranslationX(measuredWidth);
                this.callingUserTextureView.setTranslationY(measuredHeight2);
                this.callingUserTextureView.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / f9);
            }
            if (z) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            if (z) {
                f5 = 0.0f;
            } else {
                f5 = 1.0f;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f4, f5);
            if (z) {
                f6 = 0.0f;
            } else {
                f6 = 1.0f;
            }
            this.enterTransitionProgress = f6;
            updateSystemBarColors();
            final float f10 = 1.0f;
            final float f11 = 1.0f;
            final float f12 = 0.0f;
            final float f13 = f3;
            final float f14 = 0.0f;
            final float f15 = measuredHeight;
            final float f16 = f2;
            final float f17 = f;
            final float f18 = fDp;
            final float f19 = f9;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$createPiPTransition$20(z2, scaleX, f16, x, f17, y, f15, f18, fDp2, f10, f13, f11, f19, f12, measuredWidth, f14, measuredHeight2, valueAnimator);
                }
            });
            return valueAnimatorOfFloat;
        }
        float measuredWidth5 = f7 - ((this.currentUserCameraFloatingLayout.getMeasuredWidth() - (this.currentUserCameraFloatingLayout.getMeasuredWidth() * f9)) / 2.0f);
        measuredHeight = f8 - ((this.currentUserCameraFloatingLayout.getMeasuredHeight() - (this.currentUserCameraFloatingLayout.getMeasuredHeight() * f9)) / 2.0f);
        f = measuredWidth5;
        f2 = f9;
        z2 = true;
        if (this.callingUserIsVideo) {
            fDp = AndroidUtilities.dp(4.0f);
        } else {
            fDp = 0.0f;
        }
        fDp2 = (AndroidUtilities.dp(4.0f) * 1.0f) / f2;
        if (this.callingUserIsVideo) {
            f3 = 1.0f;
        } else {
            f3 = 1.0f;
        }
        if (z) {
            if (z2) {
                this.currentUserCameraFloatingLayout.setScaleX(f2);
                this.currentUserCameraFloatingLayout.setScaleY(f2);
                this.currentUserCameraFloatingLayout.setTranslationX(f);
                this.currentUserCameraFloatingLayout.setTranslationY(measuredHeight);
                this.currentUserCameraFloatingLayout.setCornerRadius(fDp2);
                this.currentUserCameraFloatingLayout.setAlpha(f3);
            }
            this.callingUserTextureView.setScaleX(f9);
            this.callingUserTextureView.setScaleY(f9);
            this.callingUserTextureView.setTranslationX(measuredWidth);
            this.callingUserTextureView.setTranslationY(measuredHeight2);
            this.callingUserTextureView.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / f9);
        }
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        if (z) {
            f5 = 0.0f;
        } else {
            f5 = 1.0f;
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f4, f5);
        if (z) {
            f6 = 0.0f;
        } else {
            f6 = 1.0f;
        }
        this.enterTransitionProgress = f6;
        updateSystemBarColors();
        final float f110 = 1.0f;
        final float f111 = 1.0f;
        final float f112 = 0.0f;
        final float f113 = f3;
        final float f114 = 0.0f;
        final float f115 = measuredHeight;
        final float f116 = f2;
        final float f117 = f;
        final float f118 = fDp;
        final float f119 = f9;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$createPiPTransition$20(z2, scaleX, f116, x, f117, y, f115, f118, fDp2, f110, f113, f111, f119, f112, measuredWidth, f114, measuredHeight2, valueAnimator);
            }
        });
        return valueAnimatorOfFloat2;
    }

    public void lambda$createPiPTransition$20(boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f17 = 1.0f - fFloatValue;
        this.enterTransitionProgress = f17;
        updateSystemBarColors();
        if (z) {
            float f18 = (f * f17) + (f2 * fFloatValue);
            this.currentUserCameraFloatingLayout.setScaleX(f18);
            this.currentUserCameraFloatingLayout.setScaleY(f18);
            this.currentUserCameraFloatingLayout.setTranslationX((f3 * f17) + (f4 * fFloatValue));
            this.currentUserCameraFloatingLayout.setTranslationY((f5 * f17) + (f6 * fFloatValue));
            this.currentUserCameraFloatingLayout.setCornerRadius((f7 * f17) + (f8 * fFloatValue));
            this.currentUserCameraFloatingLayout.setAlpha((f9 * f17) + (f10 * fFloatValue));
        }
        float f19 = (f11 * f17) + (f12 * fFloatValue);
        this.callingUserTextureView.setScaleX(f19);
        this.callingUserTextureView.setScaleY(f19);
        this.callingUserTextureView.setTranslationX((f13 * f17) + (f14 * fFloatValue));
        this.callingUserTextureView.setTranslationY((f17 * f15) + (f16 * fFloatValue));
        this.callingUserTextureView.setRoundCorners(((AndroidUtilities.dp(4.0f) * fFloatValue) * 1.0f) / f19);
        if (!this.currentUserCameraFloatingLayout.measuredAsFloatingMode) {
            this.currentUserTextureView.setScreenshareMiniProgress(fFloatValue, false);
        }
        this.windowView.invalidate();
    }

    public void expandEmoji(boolean z) {
        if (this.emojiLoaded && this.emojiExpanded != z && this.uiVisible) {
            this.emojiExpanded = z;
            this.voIpCoverView.onEmojiExpanded(z);
            if (z) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.encryptionTooltip.hide();
                AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
                this.hideUiRunnableWaiting = false;
                if (this.callingUserPhotoViewMini.getVisibility() == 0) {
                    this.callingUserPhotoViewMini.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                }
                this.hideEmojiLayout.animate().setListener(null).cancel();
                this.hideEmojiLayout.setVisibility(0);
                this.hideEmojiLayout.setAlpha(0.0f);
                this.hideEmojiLayout.setScaleX(0.3f);
                this.hideEmojiLayout.setScaleY(0.3f);
                this.hideEmojiLayout.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                ViewPropertyAnimator viewPropertyAnimatorTranslationY = this.emojiLayout.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                viewPropertyAnimatorTranslationY.setInterpolator(cubicBezierInterpolator).setDuration(400L).start();
                this.emojiRationalLayout.animate().setListener(null).cancel();
                this.emojiRationalLayout.setVisibility(0);
                this.emojiRationalLayout.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.emojiRationalLayout.setScaleX(0.7f);
                this.emojiRationalLayout.setScaleY(0.7f);
                this.emojiRationalLayout.setAlpha(0.0f);
                this.emojiRationalLayout.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        for (BackupImageView backupImageView : VoIPFragment.this.emojiViews) {
                            AnimatedEmojiDrawable animatedEmojiDrawable = backupImageView.animatedEmojiDrawable;
                            if (animatedEmojiDrawable != null && animatedEmojiDrawable.getImageReceiver() != null) {
                                backupImageView.animatedEmojiDrawable.getImageReceiver().setAllowStartAnimation(true);
                                backupImageView.animatedEmojiDrawable.getImageReceiver().startAnimation();
                            }
                        }
                    }
                }).setInterpolator(cubicBezierInterpolator).start();
            } else {
                if (this.callingUserPhotoViewMini.getVisibility() == 0) {
                    this.callingUserPhotoViewMini.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                }
                this.hideEmojiLayout.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.hideEmojiLayout.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
                duration.setInterpolator(cubicBezierInterpolator2).setListener(new HideViewAfterAnimation(this.hideEmojiLayout)).start();
                this.emojiLayout.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(cubicBezierInterpolator2).setDuration(280L).start();
                this.emojiRationalLayout.animate().setListener(null).cancel();
                this.emojiRationalLayout.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        VoIPFragment.this.startWaitingFoHideUi();
                        for (BackupImageView backupImageView : VoIPFragment.this.emojiViews) {
                            AnimatedEmojiDrawable animatedEmojiDrawable = backupImageView.animatedEmojiDrawable;
                            if (animatedEmojiDrawable != null && animatedEmojiDrawable.getImageReceiver() != null) {
                                backupImageView.animatedEmojiDrawable.getImageReceiver().setAllowStartAnimation(false);
                                backupImageView.animatedEmojiDrawable.getImageReceiver().stopAnimation();
                            }
                        }
                        VoIPFragment.this.emojiRationalLayout.setVisibility(8);
                    }
                }).setDuration(250L).setInterpolator(cubicBezierInterpolator2).start();
            }
            this.previousState = this.currentState;
            updateViewState();
        }
    }

    public void startWaitingFoHideUi() {
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
            this.hideUiRunnableWaiting = false;
            if (this.canHideUI && this.uiVisible) {
                AndroidUtilities.runOnUIThread(this.hideUIRunnable, 3000L);
                this.hideUiRunnableWaiting = true;
            }
        }
    }

    public void updateViewState() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int iDp;
        boolean z7;
        boolean z8;
        int i;
        boolean z9;
        boolean z10;
        int i2;
        float f;
        int i3;
        float f2;
        int iDp2;
        int i4;
        long j;
        boolean z11;
        int i5;
        boolean z12;
        boolean z13;
        boolean z14;
        PipSource pipSource;
        boolean z15;
        TextureViewRenderer textureViewRenderer;
        TextureViewRenderer textureViewRenderer2;
        int i6;
        TL_phone.PhoneCall phoneCall;
        long j2;
        int lineCount;
        float f3;
        float f4;
        int iDp3;
        TL_phone.PhoneCall phoneCall2;
        boolean z16;
        boolean z17;
        if (this.isFinished || this.switchingToPip) {
            return;
        }
        this.lockOnScreen = false;
        boolean z18 = this.previousState != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        final VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i7 = this.currentState;
        if (i7 == 1 || i7 == 2) {
            this.statusTextView.setText(LocaleController.getString(R.string.VoipConnecting), true, z18);
        } else {
            if (i7 != 3) {
                if (i7 == 4) {
                    VoIPStatusTextView voIPStatusTextView = this.statusTextView;
                    int i8 = R.string.VoipFailed;
                    voIPStatusTextView.setText(LocaleController.getString(i8), false, z18);
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : "ERROR_UNKNOWN";
                    if (!TextUtils.equals(lastError, "ERROR_UNKNOWN")) {
                        if (TextUtils.equals(lastError, "ERROR_INCOMPATIBLE")) {
                            TLRPC.User user = this.callingUser;
                            showErrorDialog(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerIncompatible", R.string.VoipPeerIncompatible, ContactsController.formatName(user.first_name, user.last_name))));
                        } else if (TextUtils.equals(lastError, "ERROR_PEER_OUTDATED")) {
                            if (this.isVideoCall) {
                                final boolean[] zArr = new boolean[1];
                                AlertDialog alertDialogShow = new DarkAlertDialog.Builder(this.activity).setTitle(LocaleController.getString(i8)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerVideoOutdated", R.string.VoipPeerVideoOutdated, UserObject.getFirstName(this.callingUser)))).setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                                    @Override
                                    public final void onClick(AlertDialog alertDialog, int i9) {
                                        this.f$0.lambda$updateViewState$28(alertDialog, i9);
                                    }
                                }).setPositiveButton(LocaleController.getString(R.string.VoipPeerVideoOutdatedMakeVoice), new AlertDialog.OnButtonClickListener() {
                                    @Override
                                    public final void onClick(AlertDialog alertDialog, int i9) {
                                        this.f$0.lambda$updateViewState$29(zArr, alertDialog, i9);
                                    }
                                }).show();
                                alertDialogShow.setCanceledOnTouchOutside(true);
                                alertDialogShow.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                    @Override
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        this.f$0.lambda$updateViewState$30(zArr, dialogInterface);
                                    }
                                });
                            } else {
                                showErrorDialog(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerOutdated", R.string.VoipPeerOutdated, UserObject.getFirstName(this.callingUser))));
                            }
                        } else if (TextUtils.equals(lastError, "ERROR_PRIVACY")) {
                            TLRPC.User user2 = this.callingUser;
                            showErrorDialog(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallNotAvailable, ContactsController.formatName(user2.first_name, user2.last_name))));
                            AlertsCreator.showCallsForbidden(this.activity, this.currentAccount, this.callingUser.id, null);
                        } else if (TextUtils.equals(lastError, "ERROR_AUDIO_IO")) {
                            showErrorDialog("Error initializing audio hardware");
                        } else if (TextUtils.equals(lastError, "ERROR_LOCALIZED")) {
                            this.windowView.finish();
                        } else if (TextUtils.equals(lastError, "ERROR_CONNECTION_SERVICE")) {
                            showErrorDialog(LocaleController.getString(R.string.VoipErrorUnknown));
                        } else {
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    this.f$0.lambda$updateViewState$31();
                                }
                            }, 1000L);
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$updateViewState$32();
                            }
                        }, 1000L);
                    }
                } else {
                    if (i7 != 5) {
                        switch (i7) {
                            case 11:
                                boolean z19 = sharedInstance != null && sharedInstance.hasRate();
                                this.currentUserTextureView.saveCameraLastBitmap();
                                if (z19 && !this.isFinished) {
                                    if (this.uiVisible) {
                                        int[] iArr = new int[2];
                                        int i9 = AndroidUtilities.displaySize.x;
                                        this.bottomEndCallBtn.getLocationOnScreen(iArr);
                                        int measuredWidth = ((i9 - iArr[0]) - ((this.bottomEndCallBtn.getMeasuredWidth() - AndroidUtilities.dp(52.0f)) / 2)) - AndroidUtilities.dp(52.0f);
                                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.endCloseLayout.getLayoutParams();
                                        marginLayoutParams.rightMargin = measuredWidth;
                                        marginLayoutParams.leftMargin = measuredWidth;
                                        this.endCloseLayout.setTranslationY(iArr[1]);
                                        this.endCloseLayout.setAlpha(1.0f);
                                        this.endCloseLayout.setLayoutParams(marginLayoutParams);
                                        this.buttonsLayout.animate().alpha(0.0f).setDuration(80L).start();
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                this.f$0.lambda$updateViewState$23(sharedInstance);
                                            }
                                        }, 2L);
                                    } else {
                                        this.buttonsLayout.setVisibility(8);
                                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.endCloseLayout.getLayoutParams();
                                        layoutParams.rightMargin = AndroidUtilities.dp(18.0f);
                                        layoutParams.leftMargin = AndroidUtilities.dp(18.0f);
                                        int iDp4 = AndroidUtilities.dp(36.0f);
                                        layoutParams.bottomMargin = iDp4;
                                        WindowInsets windowInsets = this.lastInsets;
                                        if (windowInsets != null) {
                                            layoutParams.bottomMargin = iDp4 + windowInsets.getSystemWindowInsetBottom();
                                        }
                                        layoutParams.gravity = 80;
                                        this.endCloseLayout.setLayoutParams(layoutParams);
                                        this.endCloseLayout.animate().alpha(1.0f).setDuration(250L).start();
                                        this.endCloseLayout.switchToClose(new View.OnClickListener() {
                                            @Override
                                            public final void onClick(View view) {
                                                this.f$0.lambda$updateViewState$25(sharedInstance, view);
                                            }
                                        }, false);
                                    }
                                    this.rateCallLayout.setVisibility(0);
                                    this.rateCallLayout.show(new RateCallLayout.OnRateSelected() {
                                        @Override
                                        public final void onRateSelected(int i10) {
                                            this.f$0.lambda$updateViewState$26(i10);
                                        }
                                    });
                                    if (this.emojiExpanded) {
                                        this.emojiExpanded = false;
                                        ViewPropertyAnimator duration = this.hideEmojiLayout.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(250L);
                                        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                                        duration.setInterpolator(cubicBezierInterpolator).setListener(new HideViewAfterAnimation(this.hideEmojiLayout)).start();
                                        this.emojiLayout.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(cubicBezierInterpolator).setDuration(250L).start();
                                        this.emojiRationalLayout.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new HideViewAfterAnimation(this.hideEmojiLayout)).setDuration(250L).setInterpolator(cubicBezierInterpolator).start();
                                    }
                                    for (BackupImageView backupImageView : this.emojiViews) {
                                        backupImageView.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(CubicBezierInterpolator.DEFAULT).setDuration(250L).start();
                                    }
                                    this.callingUserTitle.animate().alpha(0.0f).setDuration(70L).setListener(new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animator) {
                                            VoIPFragment.this.callingUserTitle.setText(LocaleController.getString(R.string.VoipCallEnded));
                                            VoIPFragment.this.callingUserTitle.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                                        }
                                    }).start();
                                    this.speakerPhoneIcon.animate().alpha(0.0f).setInterpolator(CubicBezierInterpolator.DEFAULT).setDuration(250L).start();
                                    this.speakerPhoneIcon.setVisibility(8);
                                    this.statusTextView.showReconnect(false, true);
                                    this.statusTextView.showBadConnection(false, true);
                                    this.statusTextView.setDrawCallIcon();
                                    this.callingUserPhotoViewMini.onNeedRating();
                                    updateButtons(true);
                                    this.bottomEndCallBtn.setVisibility(4);
                                    this.callingUserMiniFloatingLayout.setAlpha(0.0f);
                                    this.callingUserMiniFloatingLayout.setVisibility(8);
                                    this.currentUserCameraFloatingLayout.setAlpha(0.0f);
                                    this.currentUserCameraFloatingLayout.setVisibility(8);
                                    PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew = this.previewDialog;
                                    if (privateVideoPreviewDialogNew != null) {
                                        privateVideoPreviewDialogNew.dismiss(false, false);
                                    }
                                    this.notificationsLayout.animate().alpha(0.0f).setDuration(250L).start();
                                } else {
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            this.f$0.lambda$updateViewState$27();
                                        }
                                    }, 200L);
                                }
                                break;
                            case 12:
                                if (this.previousState != 12) {
                                    this.statusTextView.setText(LocaleController.getString(R.string.VoipExchangingKeys), true, z18);
                                }
                                break;
                            case 13:
                                this.statusTextView.setText(LocaleController.getString(R.string.VoipWaiting), true, z18);
                                break;
                            case 14:
                                this.statusTextView.setText(LocaleController.getString(R.string.VoipRequesting), true, z18);
                                break;
                            case 15:
                                this.lockOnScreen = false;
                                this.acceptDeclineView.setRetryMod(false);
                                if (sharedState != null && sharedState.isConference()) {
                                    this.statusTextView.setText(LocaleController.getString(R.string.VoipInConferenceCallBranding), false, z18);
                                    this.acceptDeclineView.setTranslationY(0.0f);
                                } else if (sharedState != null && sharedState.isCallingVideo()) {
                                    this.statusTextView.setText(LocaleController.getString(R.string.VoipInVideoCallBranding), false, z18);
                                    this.acceptDeclineView.setTranslationY(-AndroidUtilities.dp(60.0f));
                                } else {
                                    this.statusTextView.setText(LocaleController.getString(R.string.VoipInCallBranding), false, z18);
                                    this.acceptDeclineView.setTranslationY(0.0f);
                                }
                                z3 = false;
                                z2 = true;
                                break;
                            case 16:
                                if (this.previousState != 16) {
                                    this.statusTextView.setText(LocaleController.getString(R.string.VoipRinging), true, z18);
                                }
                                break;
                            case 17:
                                this.statusTextView.setText(LocaleController.getString(R.string.VoipBusy), false, z18);
                                this.acceptDeclineView.setRetryMod(true);
                                this.currentUserIsVideo = false;
                                this.callingUserIsVideo = false;
                                z3 = false;
                                z2 = true;
                                break;
                            default:
                                break;
                        }
                        z = false;
                    }
                    if (this.previewDialog != null) {
                        return;
                    }
                    if (!this.callingUserIsVideo || this.currentUserIsVideo) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (sharedInstance != null) {
                        if (sharedInstance.getRemoteVideoState() == 2) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        this.callingUserIsVideo = z16;
                        if (sharedInstance.getVideoState(false) != 2 || sharedInstance.getVideoState(false) == 1) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        this.currentUserIsVideo = z17;
                        if (z17 && !this.isVideoCall) {
                            this.isVideoCall = true;
                        }
                    }
                    if (z18) {
                        this.currentUserCameraFloatingLayout.saveRelativePosition();
                        this.callingUserMiniFloatingLayout.saveRelativePosition();
                    }
                    if (this.callingUserIsVideo) {
                        if (!this.switchingToPip) {
                            this.gradientLayout.setAlpha(1.0f);
                        }
                        if (z18) {
                            this.callingUserTextureView.animate().alpha(1.0f).setDuration(250L).start();
                        } else {
                            this.callingUserTextureView.animate().cancel();
                            this.callingUserTextureView.setAlpha(1.0f);
                        }
                        if (!this.callingUserTextureView.renderer.isFirstFrameRendered() && !this.enterFromPiP) {
                            this.callingUserIsVideo = false;
                        }
                    }
                    if (!this.currentUserIsVideo || this.callingUserIsVideo) {
                        this.gradientLayout.setVisibility(4);
                    } else {
                        this.gradientLayout.setVisibility(0);
                        if (z18) {
                            this.callingUserTextureView.animate().alpha(0.0f).setDuration(250L).start();
                        } else {
                            this.callingUserTextureView.animate().cancel();
                            this.callingUserTextureView.setAlpha(0.0f);
                        }
                    }
                    z5 = this.currentUserIsVideo;
                    if (z5 || !this.callingUserIsVideo) {
                        this.cameraForceExpanded = false;
                    }
                    if (z5 || !this.cameraForceExpanded || AndroidUtilities.isInPictureInPictureMode(this.activity)) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    showCallingUserAvatarMini(z18, z4);
                    if (this.callingUserPhotoViewMini.getTag() == null) {
                        iDp = 0;
                    } else {
                        iDp = AndroidUtilities.dp(135.0f) + AndroidUtilities.dp(12.0f);
                    }
                    showAcceptDeclineView(z2, z18);
                    VoIPWindowView voIPWindowView = this.windowView;
                    if (!this.lockOnScreen || this.deviceIsLocked) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    voIPWindowView.setLockOnScreen(z7);
                    if (this.currentState == 3 || !(this.currentUserIsVideo || this.callingUserIsVideo)) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    this.canHideUI = z8;
                    if (!z8 && !this.uiVisible) {
                        showUi(true);
                    }
                    if (this.uiVisible && this.canHideUI && !this.hideUiRunnableWaiting && sharedInstance != null) {
                        AndroidUtilities.runOnUIThread(this.hideUIRunnable, 3000L);
                        this.hideUiRunnableWaiting = true;
                    }
                    i = this.currentState;
                    if (i == 11 && !this.lockOnScreen && this.uiVisible) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z2 || i == 16 || i == 11 || i == 12 || i == 14 || i == 6 || this.lockOnScreen || !this.uiVisible || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z18) {
                        if (z9) {
                            this.backIcon.animate().alpha(1.0f).start();
                        } else {
                            if (this.backIcon.getVisibility() != 0) {
                                this.backIcon.setVisibility(0);
                                f3 = 0.0f;
                                this.backIcon.setAlpha(0.0f);
                            } else {
                                f3 = 0.0f;
                            }
                            this.backIcon.animate().alpha(f3).start();
                        }
                        if (z10) {
                            this.addIcon.animate().alpha(1.0f).start();
                        } else {
                            if (this.addIcon.getVisibility() != 0) {
                                this.addIcon.setVisibility(0);
                                f4 = 0.0f;
                                this.addIcon.setAlpha(0.0f);
                            } else {
                                f4 = 0.0f;
                            }
                            this.addIcon.animate().alpha(f4).start();
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = this.notificationsLayout.animate();
                        int i10 = -AndroidUtilities.dp(16.0f);
                        if (this.uiVisible) {
                            iDp3 = AndroidUtilities.dp(80.0f);
                        } else {
                            iDp3 = 0;
                        }
                        viewPropertyAnimatorAnimate.translationY(i10 - iDp3).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    } else {
                        ImageView imageView = this.backIcon;
                        if (z9) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        imageView.setVisibility(i2);
                        ImageView imageView2 = this.backIcon;
                        if (z9) {
                            f = 1.0f;
                        } else {
                            f = 0.0f;
                        }
                        imageView2.setAlpha(f);
                        ImageView imageView3 = this.addIcon;
                        if (z10) {
                            i3 = 0;
                        } else {
                            i3 = 8;
                        }
                        imageView3.setVisibility(i3);
                        ImageView imageView4 = this.addIcon;
                        if (z10) {
                            f2 = 1.0f;
                        } else {
                            f2 = 0.0f;
                        }
                        imageView4.setAlpha(f2);
                        VoIPNotificationsLayout voIPNotificationsLayout = this.notificationsLayout;
                        int i11 = -AndroidUtilities.dp(16.0f);
                        if (this.uiVisible) {
                            iDp2 = AndroidUtilities.dp(80.0f);
                        } else {
                            iDp2 = 0;
                        }
                        voIPNotificationsLayout.setTranslationY(i11 - iDp2);
                    }
                    i4 = this.currentState;
                    if (i4 != 10 && i4 != 11) {
                        updateButtons(z18);
                    }
                    if (z) {
                        this.statusTextView.showTimer(z18);
                    }
                    this.statusTextView.showReconnect(z3, z18);
                    if (this.callingUserPhotoViewMini.getVisibility() == 0 || !this.emojiExpanded) {
                        j = 150;
                    } else {
                        iDp += AndroidUtilities.dp(24.0f);
                        Layout layout = this.emojiRationalTextView.getLayout();
                        if (layout == null || (lineCount = layout.getLineCount()) <= 2) {
                            j = 150;
                        } else {
                            j = 150;
                            iDp += AndroidUtilities.dp(20.0f) * (lineCount - 2);
                        }
                    }
                    if (this.currentState == 11 && !this.currentUserIsVideo && !this.callingUserIsVideo) {
                        iDp -= AndroidUtilities.dp(24.0f);
                    }
                    if (!this.currentUserIsVideo || this.callingUserIsVideo) {
                        iDp -= AndroidUtilities.dp(60.0f);
                    }
                    if (z18) {
                        if (!this.emojiExpanded && (this.currentUserIsVideo || this.callingUserIsVideo)) {
                            this.statusLayout.animate().setStartDelay(0L).alpha(0.0f).setDuration(j).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                        } else {
                            this.statusLayout.animate().setStartDelay(250L).alpha(1.0f).setDuration(j).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                        }
                        if (iDp != this.statusLayoutAnimateToOffset) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = this.statusLayout.animate();
                            if (this.currentState == 11) {
                                j2 = 250;
                            } else {
                                j2 = 0;
                            }
                            viewPropertyAnimatorAnimate2.setStartDelay(j2).translationY(iDp).setDuration(200L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                        }
                    } else {
                        this.statusLayout.setTranslationY(iDp);
                    }
                    this.statusLayoutAnimateToOffset = iDp;
                    if (sharedInstance == null && sharedInstance.isScreencast()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i5 = this.currentState;
                    if (i5 != 11 || i5 == 17 || ((!this.currentUserIsVideo || z11) && !this.callingUserIsVideo)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    this.canSwitchToPip = z12;
                    if (sharedInstance != null) {
                        if (this.currentUserIsVideo) {
                            sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
                        }
                        this.currentUserTextureView.setIsScreencast(sharedInstance.isScreencast());
                        this.currentUserTextureView.renderer.setMirror(sharedInstance.isFrontFaceCamera());
                        if (this.currentUserIsVideo || sharedInstance.isScreencast()) {
                            textureViewRenderer = null;
                        } else {
                            textureViewRenderer = this.currentUserTextureView.renderer;
                        }
                        if (!this.windowViewSkipRender && (voIPTextureView = this.pipTextureView) != null) {
                            textureViewRenderer2 = voIPTextureView.renderer;
                        } else if (z6) {
                            textureViewRenderer2 = this.callingUserMiniTextureRenderer;
                        } else {
                            VoIPTextureView voIPTextureView = this.callingUserTextureView;
                            textureViewRenderer2 = voIPTextureView.renderer;
                        }
                        sharedInstance.setSinks(textureViewRenderer, textureViewRenderer2);
                        if (z18) {
                            this.notificationsLayout.beforeLayoutChanges();
                        }
                        if (sharedInstance.isMicMute()) {
                            this.notificationsLayout.addNotification(R.drawable.calls_mute_mini, LocaleController.getString(R.string.VoipMyMicrophoneState), "self-muted", z18);
                        } else {
                            this.notificationsLayout.removeNotification("self-muted");
                        }
                        if ((!this.currentUserIsVideo || this.callingUserIsVideo) && (((i6 = this.currentState) == 3 || i6 == 5) && sharedInstance.getCallDuration() > 500)) {
                            if (sharedInstance.getRemoteAudioState() == 0) {
                                VoIPNotificationsLayout voIPNotificationsLayout2 = this.notificationsLayout;
                                voIPNotificationsLayout2.addNotification(R.drawable.calls_mute_mini, LocaleController.formatString(r2, R.string.VoipUserMicrophoneIsOff, voIPNotificationsLayout2.ellipsize(UserObject.getFirstName(this.callingUser))), "muted", z18);
                            } else {
                                this.notificationsLayout.removeNotification("muted");
                            }
                            if (sharedInstance.getRemoteVideoState() == 0) {
                                VoIPNotificationsLayout voIPNotificationsLayout3 = this.notificationsLayout;
                                voIPNotificationsLayout3.addNotification(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, voIPNotificationsLayout3.ellipsize(UserObject.getFirstName(this.callingUser))), "video", z18);
                            } else {
                                this.notificationsLayout.removeNotification("video");
                            }
                        } else {
                            if (sharedInstance.getRemoteAudioState() == 0) {
                                VoIPNotificationsLayout voIPNotificationsLayout4 = this.notificationsLayout;
                                voIPNotificationsLayout4.addNotification(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, voIPNotificationsLayout4.ellipsize(UserObject.getFirstName(this.callingUser))), "muted", z18);
                            } else {
                                this.notificationsLayout.removeNotification("muted");
                            }
                            this.notificationsLayout.removeNotification("video");
                        }
                        if (this.notificationsLayout.getChildCount() != 0 && this.callingUserIsVideo && (phoneCall = sharedInstance.privateCall) != null && !phoneCall.video) {
                            VoIPService.SharedUIParams sharedUIParams = sharedInstance.sharedUIParams;
                            if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                sharedUIParams.tapToVideoTooltipWasShowed = true;
                                this.tapToVideoTooltip.setTranslationY(-((this.fragmentView.getMeasuredHeight() - this.buttonsLayout.getY()) + AndroidUtilities.dp(6.0f)));
                                this.tapToVideoTooltip.setJointPx(0.0f, this.buttonsLayout.getX() + this.bottomVideoBtn.getX() + AndroidUtilities.dp(14.0f));
                                this.tapToVideoTooltip.show();
                            } else if (this.notificationsLayout.getChildCount() != 0) {
                                this.tapToVideoTooltip.hide();
                            }
                        } else if (this.notificationsLayout.getChildCount() != 0) {
                            this.tapToVideoTooltip.hide();
                        }
                        if (z18) {
                            this.notificationsLayout.animateLayoutChanges();
                        }
                    }
                    int childsHight = this.notificationsLayout.getChildsHight();
                    this.callingUserMiniFloatingLayout.setBottomOffset(childsHight, z18);
                    this.currentUserCameraFloatingLayout.setBottomOffset(childsHight, z18);
                    this.currentUserCameraFloatingLayout.setUiVisible(this.uiVisible);
                    this.callingUserMiniFloatingLayout.setUiVisible(this.uiVisible);
                    if (this.currentUserIsVideo) {
                        if (this.callingUserIsVideo || this.cameraForceExpanded) {
                            z13 = true;
                            showFloatingLayout(1, z18);
                        } else {
                            showFloatingLayout(2, z18);
                            z13 = true;
                        }
                    } else {
                        z13 = true;
                        showFloatingLayout(0, z18);
                    }
                    if (z6 && this.callingUserMiniFloatingLayout.getTag() == null) {
                        this.callingUserMiniFloatingLayout.setIsActive(z13);
                        if (this.callingUserMiniFloatingLayout.getVisibility() != 0) {
                            this.callingUserMiniFloatingLayout.setVisibility(0);
                            this.callingUserMiniFloatingLayout.setAlpha(0.0f);
                            this.callingUserMiniFloatingLayout.setScaleX(0.5f);
                            this.callingUserMiniFloatingLayout.setScaleY(0.5f);
                        }
                        this.callingUserMiniFloatingLayout.animate().setListener(null).cancel();
                        VoIPFloatingLayout voIPFloatingLayout = this.callingUserMiniFloatingLayout;
                        voIPFloatingLayout.isAppearing = true;
                        voIPFloatingLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).setStartDelay(150L).withEndAction(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$updateViewState$33();
                            }
                        }).start();
                        this.callingUserMiniFloatingLayout.setTag(1);
                    } else if (!z6 && this.callingUserMiniFloatingLayout.getTag() != null) {
                        this.callingUserMiniFloatingLayout.setIsActive(false);
                        this.callingUserMiniFloatingLayout.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (VoIPFragment.this.callingUserMiniFloatingLayout.getTag() == null) {
                                    VoIPFragment.this.callingUserMiniFloatingLayout.setVisibility(8);
                                }
                            }
                        }).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                        this.callingUserMiniFloatingLayout.setTag(null);
                    }
                    this.currentUserCameraFloatingLayout.restoreRelativePosition();
                    this.callingUserMiniFloatingLayout.restoreRelativePosition();
                    updateSpeakerPhoneIcon();
                    if (this.currentState == 3) {
                        this.voIpCoverView.onConnected();
                        this.callingUserPhotoViewMini.onConnected();
                        if (!this.gradientLayout.isConnectedCalled()) {
                            int[] iArr2 = new int[2];
                            this.callingUserPhotoViewMini.getLocationOnScreen(iArr2);
                            if (this.previousState != -1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            this.gradientLayout.switchToCallConnected(iArr2[0] + AndroidUtilities.dp(106.0f), iArr2[1] + AndroidUtilities.dp(106.0f), z15);
                        }
                    }
                    if (!this.currentUserIsVideo || this.callingUserIsVideo) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.voIpSnowView.setState(z14);
                    this.voIpCoverView.setState(z14);
                    this.backgroundProvider.setHasVideo(z14);
                    if (this.callingUserIsVideo && !z4 && this.isNearEar) {
                        this.isNearEar = false;
                        if (sharedInstance != null) {
                            sharedInstance.playStartRecordSound();
                        }
                    }
                    if (!z14) {
                        if (this.topShadow.getVisibility() != 4) {
                            this.topShadow.setVisibility(4);
                            this.bottomShadow.setVisibility(4);
                        }
                    } else if (this.topShadow.getVisibility() != 0) {
                        this.topShadow.setVisibility(0);
                        this.bottomShadow.setVisibility(0);
                    }
                    AndroidUtilities.cancelRunOnUIThread(this.stopAnimatingBgRunnable);
                    if (this.currentState == 3) {
                        AndroidUtilities.runOnUIThread(this.stopAnimatingBgRunnable, 10000L);
                    }
                    pipSource = this.pipSource;
                    if (pipSource != null) {
                        pipSource.invalidateActions();
                    }
                }
            }
            updateKeyView(z18);
            if (this.currentState == 5) {
                z3 = this.wasEstablished;
                if (!z3 && this.previousState != 5) {
                    this.statusTextView.setText(LocaleController.getString(R.string.VoipConnecting), true, z18);
                }
                z2 = false;
                z = false;
            } else {
                this.wasEstablished = true;
                z3 = false;
                z2 = false;
                z = true;
            }
            if (this.previewDialog != null) {
                return;
            }
            if (this.callingUserIsVideo) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (sharedInstance != null) {
                if (sharedInstance.getRemoteVideoState() == 2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                this.callingUserIsVideo = z16;
                if (sharedInstance.getVideoState(false) != 2) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                this.currentUserIsVideo = z17;
                if (z17) {
                    this.isVideoCall = true;
                }
            }
            if (z18) {
                this.currentUserCameraFloatingLayout.saveRelativePosition();
                this.callingUserMiniFloatingLayout.saveRelativePosition();
            }
            if (this.callingUserIsVideo) {
                if (!this.switchingToPip) {
                    this.gradientLayout.setAlpha(1.0f);
                }
                if (z18) {
                    this.callingUserTextureView.animate().alpha(1.0f).setDuration(250L).start();
                } else {
                    this.callingUserTextureView.animate().cancel();
                    this.callingUserTextureView.setAlpha(1.0f);
                }
                if (!this.callingUserTextureView.renderer.isFirstFrameRendered()) {
                    this.callingUserIsVideo = false;
                }
            }
            if (!this.currentUserIsVideo) {
                this.gradientLayout.setVisibility(4);
            } else {
                this.gradientLayout.setVisibility(4);
            }
            z5 = this.currentUserIsVideo;
            if (z5) {
                this.cameraForceExpanded = false;
            } else {
                this.cameraForceExpanded = false;
            }
            if (z5) {
                z6 = false;
            } else {
                z6 = false;
            }
            showCallingUserAvatarMini(z18, z4);
            if (this.callingUserPhotoViewMini.getTag() == null) {
                iDp = 0;
            } else {
                iDp = AndroidUtilities.dp(135.0f) + AndroidUtilities.dp(12.0f);
            }
            showAcceptDeclineView(z2, z18);
            VoIPWindowView voIPWindowView2 = this.windowView;
            if (this.lockOnScreen) {
                z7 = true;
            } else {
                z7 = true;
            }
            voIPWindowView2.setLockOnScreen(z7);
            if (this.currentState == 3) {
                z8 = false;
            } else {
                z8 = false;
            }
            this.canHideUI = z8;
            if (!z8) {
                showUi(true);
            }
            if (this.uiVisible) {
                AndroidUtilities.runOnUIThread(this.hideUIRunnable, 3000L);
                this.hideUiRunnableWaiting = true;
            }
            i = this.currentState;
            if (i == 11) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z2) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z18) {
                if (z9) {
                    this.backIcon.animate().alpha(1.0f).start();
                } else {
                    if (this.backIcon.getVisibility() != 0) {
                        this.backIcon.setVisibility(0);
                        f3 = 0.0f;
                        this.backIcon.setAlpha(0.0f);
                    } else {
                        f3 = 0.0f;
                    }
                    this.backIcon.animate().alpha(f3).start();
                }
                if (z10) {
                    this.addIcon.animate().alpha(1.0f).start();
                } else {
                    if (this.addIcon.getVisibility() != 0) {
                        this.addIcon.setVisibility(0);
                        f4 = 0.0f;
                        this.addIcon.setAlpha(0.0f);
                    } else {
                        f4 = 0.0f;
                    }
                    this.addIcon.animate().alpha(f4).start();
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate3 = this.notificationsLayout.animate();
                int i12 = -AndroidUtilities.dp(16.0f);
                if (this.uiVisible) {
                    iDp3 = AndroidUtilities.dp(80.0f);
                } else {
                    iDp3 = 0;
                }
                viewPropertyAnimatorAnimate3.translationY(i12 - iDp3).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            } else {
                ImageView imageView5 = this.backIcon;
                if (z9) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                imageView5.setVisibility(i2);
                ImageView imageView6 = this.backIcon;
                if (z9) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                imageView6.setAlpha(f);
                ImageView imageView7 = this.addIcon;
                if (z10) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                imageView7.setVisibility(i3);
                ImageView imageView8 = this.addIcon;
                if (z10) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                imageView8.setAlpha(f2);
                VoIPNotificationsLayout voIPNotificationsLayout5 = this.notificationsLayout;
                int i13 = -AndroidUtilities.dp(16.0f);
                if (this.uiVisible) {
                    iDp2 = AndroidUtilities.dp(80.0f);
                } else {
                    iDp2 = 0;
                }
                voIPNotificationsLayout5.setTranslationY(i13 - iDp2);
            }
            i4 = this.currentState;
            if (i4 != 10) {
                updateButtons(z18);
            }
            if (z) {
                this.statusTextView.showTimer(z18);
            }
            this.statusTextView.showReconnect(z3, z18);
            if (this.callingUserPhotoViewMini.getVisibility() == 0) {
                j = 150;
            } else {
                j = 150;
            }
            if (this.currentState == 11) {
                iDp -= AndroidUtilities.dp(24.0f);
            }
            if (!this.currentUserIsVideo) {
                iDp -= AndroidUtilities.dp(60.0f);
            } else {
                iDp -= AndroidUtilities.dp(60.0f);
            }
            if (z18) {
                if (!this.emojiExpanded) {
                    this.statusLayout.animate().setStartDelay(250L).alpha(1.0f).setDuration(j).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                } else {
                    this.statusLayout.animate().setStartDelay(250L).alpha(1.0f).setDuration(j).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                }
                if (iDp != this.statusLayoutAnimateToOffset) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate4 = this.statusLayout.animate();
                    if (this.currentState == 11) {
                        j2 = 250;
                    } else {
                        j2 = 0;
                    }
                    viewPropertyAnimatorAnimate4.setStartDelay(j2).translationY(iDp).setDuration(200L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                }
            } else {
                this.statusLayout.setTranslationY(iDp);
            }
            this.statusLayoutAnimateToOffset = iDp;
            if (sharedInstance == null) {
                z11 = false;
            } else {
                z11 = false;
            }
            i5 = this.currentState;
            if (i5 != 11) {
                z12 = false;
            } else {
                z12 = false;
            }
            this.canSwitchToPip = z12;
            if (sharedInstance != null) {
                if (this.currentUserIsVideo) {
                    sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
                }
                this.currentUserTextureView.setIsScreencast(sharedInstance.isScreencast());
                this.currentUserTextureView.renderer.setMirror(sharedInstance.isFrontFaceCamera());
                if (this.currentUserIsVideo) {
                    textureViewRenderer = null;
                } else {
                    textureViewRenderer = null;
                }
                if (!this.windowViewSkipRender) {
                    if (z6) {
                        textureViewRenderer2 = this.callingUserMiniTextureRenderer;
                    } else {
                        VoIPTextureView voIPTextureView2 = this.callingUserTextureView;
                        textureViewRenderer2 = voIPTextureView2.renderer;
                    }
                } else if (z6) {
                    textureViewRenderer2 = this.callingUserMiniTextureRenderer;
                } else {
                    VoIPTextureView voIPTextureView3 = this.callingUserTextureView;
                    textureViewRenderer2 = voIPTextureView3.renderer;
                }
                sharedInstance.setSinks(textureViewRenderer, textureViewRenderer2);
                if (z18) {
                    this.notificationsLayout.beforeLayoutChanges();
                }
                if (sharedInstance.isMicMute()) {
                    this.notificationsLayout.addNotification(R.drawable.calls_mute_mini, LocaleController.getString(R.string.VoipMyMicrophoneState), "self-muted", z18);
                } else {
                    this.notificationsLayout.removeNotification("self-muted");
                }
                if (!this.currentUserIsVideo) {
                    if (sharedInstance.getRemoteAudioState() == 0) {
                        VoIPNotificationsLayout voIPNotificationsLayout6 = this.notificationsLayout;
                        voIPNotificationsLayout6.addNotification(R.drawable.calls_mute_mini, LocaleController.formatString(r2, R.string.VoipUserMicrophoneIsOff, voIPNotificationsLayout6.ellipsize(UserObject.getFirstName(this.callingUser))), "muted", z18);
                    } else {
                        this.notificationsLayout.removeNotification("muted");
                    }
                    if (sharedInstance.getRemoteVideoState() == 0) {
                        VoIPNotificationsLayout voIPNotificationsLayout7 = this.notificationsLayout;
                        voIPNotificationsLayout7.addNotification(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, voIPNotificationsLayout7.ellipsize(UserObject.getFirstName(this.callingUser))), "video", z18);
                    } else {
                        this.notificationsLayout.removeNotification("video");
                    }
                } else {
                    if (sharedInstance.getRemoteAudioState() == 0) {
                        VoIPNotificationsLayout voIPNotificationsLayout8 = this.notificationsLayout;
                        voIPNotificationsLayout8.addNotification(R.drawable.calls_mute_mini, LocaleController.formatString(r2, R.string.VoipUserMicrophoneIsOff, voIPNotificationsLayout8.ellipsize(UserObject.getFirstName(this.callingUser))), "muted", z18);
                    } else {
                        this.notificationsLayout.removeNotification("muted");
                    }
                    if (sharedInstance.getRemoteVideoState() == 0) {
                        VoIPNotificationsLayout voIPNotificationsLayout9 = this.notificationsLayout;
                        voIPNotificationsLayout9.addNotification(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, voIPNotificationsLayout9.ellipsize(UserObject.getFirstName(this.callingUser))), "video", z18);
                    } else {
                        this.notificationsLayout.removeNotification("video");
                    }
                }
                if (this.notificationsLayout.getChildCount() != 0) {
                    if (this.notificationsLayout.getChildCount() != 0) {
                        this.tapToVideoTooltip.hide();
                    }
                } else if (this.notificationsLayout.getChildCount() != 0) {
                    this.tapToVideoTooltip.hide();
                }
                if (z18) {
                    this.notificationsLayout.animateLayoutChanges();
                }
            }
            int childsHight2 = this.notificationsLayout.getChildsHight();
            this.callingUserMiniFloatingLayout.setBottomOffset(childsHight2, z18);
            this.currentUserCameraFloatingLayout.setBottomOffset(childsHight2, z18);
            this.currentUserCameraFloatingLayout.setUiVisible(this.uiVisible);
            this.callingUserMiniFloatingLayout.setUiVisible(this.uiVisible);
            if (this.currentUserIsVideo) {
                if (this.callingUserIsVideo) {
                    z13 = true;
                    showFloatingLayout(1, z18);
                } else {
                    z13 = true;
                    showFloatingLayout(1, z18);
                }
            } else {
                z13 = true;
                showFloatingLayout(0, z18);
            }
            if (z6) {
                if (!z6) {
                    this.callingUserMiniFloatingLayout.setIsActive(false);
                    this.callingUserMiniFloatingLayout.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (VoIPFragment.this.callingUserMiniFloatingLayout.getTag() == null) {
                                VoIPFragment.this.callingUserMiniFloatingLayout.setVisibility(8);
                            }
                        }
                    }).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    this.callingUserMiniFloatingLayout.setTag(null);
                }
            } else if (!z6) {
                this.callingUserMiniFloatingLayout.setIsActive(false);
                this.callingUserMiniFloatingLayout.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (VoIPFragment.this.callingUserMiniFloatingLayout.getTag() == null) {
                            VoIPFragment.this.callingUserMiniFloatingLayout.setVisibility(8);
                        }
                    }
                }).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                this.callingUserMiniFloatingLayout.setTag(null);
            }
            this.currentUserCameraFloatingLayout.restoreRelativePosition();
            this.callingUserMiniFloatingLayout.restoreRelativePosition();
            updateSpeakerPhoneIcon();
            if (this.currentState == 3) {
                this.voIpCoverView.onConnected();
                this.callingUserPhotoViewMini.onConnected();
                if (!this.gradientLayout.isConnectedCalled()) {
                    int[] iArr3 = new int[2];
                    this.callingUserPhotoViewMini.getLocationOnScreen(iArr3);
                    if (this.previousState != -1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    this.gradientLayout.switchToCallConnected(iArr3[0] + AndroidUtilities.dp(106.0f), iArr3[1] + AndroidUtilities.dp(106.0f), z15);
                }
            }
            if (this.currentUserIsVideo) {
                z14 = true;
            } else {
                z14 = true;
            }
            this.voIpSnowView.setState(z14);
            this.voIpCoverView.setState(z14);
            this.backgroundProvider.setHasVideo(z14);
            if (this.callingUserIsVideo) {
                this.isNearEar = false;
                if (sharedInstance != null) {
                    sharedInstance.playStartRecordSound();
                }
            }
            if (!z14) {
                if (this.topShadow.getVisibility() != 4) {
                    this.topShadow.setVisibility(4);
                    this.bottomShadow.setVisibility(4);
                }
            } else if (this.topShadow.getVisibility() != 0) {
                this.topShadow.setVisibility(0);
                this.bottomShadow.setVisibility(0);
            }
            AndroidUtilities.cancelRunOnUIThread(this.stopAnimatingBgRunnable);
            if (this.currentState == 3) {
                AndroidUtilities.runOnUIThread(this.stopAnimatingBgRunnable, 10000L);
            }
            pipSource = this.pipSource;
            if (pipSource != null) {
                pipSource.invalidateActions();
            }
        }
        z3 = false;
        z2 = false;
        z = false;
        if (this.previewDialog != null) {
            return;
        }
        if (this.callingUserIsVideo) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (sharedInstance != null) {
            if (sharedInstance.getRemoteVideoState() == 2) {
                z16 = true;
            } else {
                z16 = false;
            }
            this.callingUserIsVideo = z16;
            if (sharedInstance.getVideoState(false) != 2) {
                z17 = true;
            } else {
                z17 = true;
            }
            this.currentUserIsVideo = z17;
            if (z17) {
                this.isVideoCall = true;
            }
        }
        if (z18) {
            this.currentUserCameraFloatingLayout.saveRelativePosition();
            this.callingUserMiniFloatingLayout.saveRelativePosition();
        }
        if (this.callingUserIsVideo) {
            if (!this.switchingToPip) {
                this.gradientLayout.setAlpha(1.0f);
            }
            if (z18) {
                this.callingUserTextureView.animate().alpha(1.0f).setDuration(250L).start();
            } else {
                this.callingUserTextureView.animate().cancel();
                this.callingUserTextureView.setAlpha(1.0f);
            }
            if (!this.callingUserTextureView.renderer.isFirstFrameRendered()) {
                this.callingUserIsVideo = false;
            }
        }
        if (!this.currentUserIsVideo) {
            this.gradientLayout.setVisibility(4);
        } else {
            this.gradientLayout.setVisibility(4);
        }
        z5 = this.currentUserIsVideo;
        if (z5) {
            this.cameraForceExpanded = false;
        } else {
            this.cameraForceExpanded = false;
        }
        if (z5) {
            z6 = false;
        } else {
            z6 = false;
        }
        showCallingUserAvatarMini(z18, z4);
        if (this.callingUserPhotoViewMini.getTag() == null) {
            iDp = 0;
        } else {
            iDp = AndroidUtilities.dp(135.0f) + AndroidUtilities.dp(12.0f);
        }
        showAcceptDeclineView(z2, z18);
        VoIPWindowView voIPWindowView3 = this.windowView;
        if (this.lockOnScreen) {
            z7 = true;
        } else {
            z7 = true;
        }
        voIPWindowView3.setLockOnScreen(z7);
        if (this.currentState == 3) {
            z8 = false;
        } else {
            z8 = false;
        }
        this.canHideUI = z8;
        if (!z8) {
            showUi(true);
        }
        if (this.uiVisible) {
            AndroidUtilities.runOnUIThread(this.hideUIRunnable, 3000L);
            this.hideUiRunnableWaiting = true;
        }
        i = this.currentState;
        if (i == 11) {
            z9 = false;
        } else {
            z9 = false;
        }
        if (z2) {
            z10 = false;
        } else {
            z10 = false;
        }
        if (z18) {
            if (z9) {
                this.backIcon.animate().alpha(1.0f).start();
            } else {
                if (this.backIcon.getVisibility() != 0) {
                    this.backIcon.setVisibility(0);
                    f3 = 0.0f;
                    this.backIcon.setAlpha(0.0f);
                } else {
                    f3 = 0.0f;
                }
                this.backIcon.animate().alpha(f3).start();
            }
            if (z10) {
                this.addIcon.animate().alpha(1.0f).start();
            } else {
                if (this.addIcon.getVisibility() != 0) {
                    this.addIcon.setVisibility(0);
                    f4 = 0.0f;
                    this.addIcon.setAlpha(0.0f);
                } else {
                    f4 = 0.0f;
                }
                this.addIcon.animate().alpha(f4).start();
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate5 = this.notificationsLayout.animate();
            int i14 = -AndroidUtilities.dp(16.0f);
            if (this.uiVisible) {
                iDp3 = AndroidUtilities.dp(80.0f);
            } else {
                iDp3 = 0;
            }
            viewPropertyAnimatorAnimate5.translationY(i14 - iDp3).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
        } else {
            ImageView imageView9 = this.backIcon;
            if (z9) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView9.setVisibility(i2);
            ImageView imageView10 = this.backIcon;
            if (z9) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            imageView10.setAlpha(f);
            ImageView imageView11 = this.addIcon;
            if (z10) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView11.setVisibility(i3);
            ImageView imageView12 = this.addIcon;
            if (z10) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            imageView12.setAlpha(f2);
            VoIPNotificationsLayout voIPNotificationsLayout10 = this.notificationsLayout;
            int i15 = -AndroidUtilities.dp(16.0f);
            if (this.uiVisible) {
                iDp2 = AndroidUtilities.dp(80.0f);
            } else {
                iDp2 = 0;
            }
            voIPNotificationsLayout10.setTranslationY(i15 - iDp2);
        }
        i4 = this.currentState;
        if (i4 != 10) {
            updateButtons(z18);
        }
        if (z) {
            this.statusTextView.showTimer(z18);
        }
        this.statusTextView.showReconnect(z3, z18);
        if (this.callingUserPhotoViewMini.getVisibility() == 0) {
            j = 150;
        } else {
            j = 150;
        }
        if (this.currentState == 11) {
            iDp -= AndroidUtilities.dp(24.0f);
        }
        if (!this.currentUserIsVideo) {
            iDp -= AndroidUtilities.dp(60.0f);
        } else {
            iDp -= AndroidUtilities.dp(60.0f);
        }
        if (z18) {
            if (!this.emojiExpanded) {
                this.statusLayout.animate().setStartDelay(250L).alpha(1.0f).setDuration(j).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            } else {
                this.statusLayout.animate().setStartDelay(250L).alpha(1.0f).setDuration(j).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            }
            if (iDp != this.statusLayoutAnimateToOffset) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate6 = this.statusLayout.animate();
                if (this.currentState == 11) {
                    j2 = 250;
                } else {
                    j2 = 0;
                }
                viewPropertyAnimatorAnimate6.setStartDelay(j2).translationY(iDp).setDuration(200L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            }
        } else {
            this.statusLayout.setTranslationY(iDp);
        }
        this.statusLayoutAnimateToOffset = iDp;
        if (sharedInstance == null) {
            z11 = false;
        } else {
            z11 = false;
        }
        i5 = this.currentState;
        if (i5 != 11) {
            z12 = false;
        } else {
            z12 = false;
        }
        this.canSwitchToPip = z12;
        if (sharedInstance != null) {
            if (this.currentUserIsVideo) {
                sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
            }
            this.currentUserTextureView.setIsScreencast(sharedInstance.isScreencast());
            this.currentUserTextureView.renderer.setMirror(sharedInstance.isFrontFaceCamera());
            if (this.currentUserIsVideo) {
                textureViewRenderer = null;
            } else {
                textureViewRenderer = null;
            }
            if (!this.windowViewSkipRender) {
                if (z6) {
                    textureViewRenderer2 = this.callingUserMiniTextureRenderer;
                } else {
                    VoIPTextureView voIPTextureView4 = this.callingUserTextureView;
                    textureViewRenderer2 = voIPTextureView4.renderer;
                }
            } else if (z6) {
                textureViewRenderer2 = this.callingUserMiniTextureRenderer;
            } else {
                VoIPTextureView voIPTextureView5 = this.callingUserTextureView;
                textureViewRenderer2 = voIPTextureView5.renderer;
            }
            sharedInstance.setSinks(textureViewRenderer, textureViewRenderer2);
            if (z18) {
                this.notificationsLayout.beforeLayoutChanges();
            }
            if (sharedInstance.isMicMute()) {
                this.notificationsLayout.addNotification(R.drawable.calls_mute_mini, LocaleController.getString(R.string.VoipMyMicrophoneState), "self-muted", z18);
            } else {
                this.notificationsLayout.removeNotification("self-muted");
            }
            if (!this.currentUserIsVideo) {
                if (sharedInstance.getRemoteAudioState() == 0) {
                    VoIPNotificationsLayout voIPNotificationsLayout11 = this.notificationsLayout;
                    voIPNotificationsLayout11.addNotification(R.drawable.calls_mute_mini, LocaleController.formatString(r2, R.string.VoipUserMicrophoneIsOff, voIPNotificationsLayout11.ellipsize(UserObject.getFirstName(this.callingUser))), "muted", z18);
                } else {
                    this.notificationsLayout.removeNotification("muted");
                }
                if (sharedInstance.getRemoteVideoState() == 0) {
                    VoIPNotificationsLayout voIPNotificationsLayout12 = this.notificationsLayout;
                    voIPNotificationsLayout12.addNotification(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, voIPNotificationsLayout12.ellipsize(UserObject.getFirstName(this.callingUser))), "video", z18);
                } else {
                    this.notificationsLayout.removeNotification("video");
                }
            } else {
                if (sharedInstance.getRemoteAudioState() == 0) {
                    VoIPNotificationsLayout voIPNotificationsLayout13 = this.notificationsLayout;
                    voIPNotificationsLayout13.addNotification(R.drawable.calls_mute_mini, LocaleController.formatString(r2, R.string.VoipUserMicrophoneIsOff, voIPNotificationsLayout13.ellipsize(UserObject.getFirstName(this.callingUser))), "muted", z18);
                } else {
                    this.notificationsLayout.removeNotification("muted");
                }
                if (sharedInstance.getRemoteVideoState() == 0) {
                    VoIPNotificationsLayout voIPNotificationsLayout14 = this.notificationsLayout;
                    voIPNotificationsLayout14.addNotification(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, voIPNotificationsLayout14.ellipsize(UserObject.getFirstName(this.callingUser))), "video", z18);
                } else {
                    this.notificationsLayout.removeNotification("video");
                }
            }
            if (this.notificationsLayout.getChildCount() != 0) {
                if (this.notificationsLayout.getChildCount() != 0) {
                    this.tapToVideoTooltip.hide();
                }
            } else if (this.notificationsLayout.getChildCount() != 0) {
                this.tapToVideoTooltip.hide();
            }
            if (z18) {
                this.notificationsLayout.animateLayoutChanges();
            }
        }
        int childsHight3 = this.notificationsLayout.getChildsHight();
        this.callingUserMiniFloatingLayout.setBottomOffset(childsHight3, z18);
        this.currentUserCameraFloatingLayout.setBottomOffset(childsHight3, z18);
        this.currentUserCameraFloatingLayout.setUiVisible(this.uiVisible);
        this.callingUserMiniFloatingLayout.setUiVisible(this.uiVisible);
        if (this.currentUserIsVideo) {
            if (this.callingUserIsVideo) {
                z13 = true;
                showFloatingLayout(1, z18);
            } else {
                z13 = true;
                showFloatingLayout(1, z18);
            }
        } else {
            z13 = true;
            showFloatingLayout(0, z18);
        }
        if (z6) {
            if (!z6) {
                this.callingUserMiniFloatingLayout.setIsActive(false);
                this.callingUserMiniFloatingLayout.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (VoIPFragment.this.callingUserMiniFloatingLayout.getTag() == null) {
                            VoIPFragment.this.callingUserMiniFloatingLayout.setVisibility(8);
                        }
                    }
                }).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                this.callingUserMiniFloatingLayout.setTag(null);
            }
        } else if (!z6) {
            this.callingUserMiniFloatingLayout.setIsActive(false);
            this.callingUserMiniFloatingLayout.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (VoIPFragment.this.callingUserMiniFloatingLayout.getTag() == null) {
                        VoIPFragment.this.callingUserMiniFloatingLayout.setVisibility(8);
                    }
                }
            }).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            this.callingUserMiniFloatingLayout.setTag(null);
        }
        this.currentUserCameraFloatingLayout.restoreRelativePosition();
        this.callingUserMiniFloatingLayout.restoreRelativePosition();
        updateSpeakerPhoneIcon();
        if (this.currentState == 3) {
            this.voIpCoverView.onConnected();
            this.callingUserPhotoViewMini.onConnected();
            if (!this.gradientLayout.isConnectedCalled()) {
                int[] iArr4 = new int[2];
                this.callingUserPhotoViewMini.getLocationOnScreen(iArr4);
                if (this.previousState != -1) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                this.gradientLayout.switchToCallConnected(iArr4[0] + AndroidUtilities.dp(106.0f), iArr4[1] + AndroidUtilities.dp(106.0f), z15);
            }
        }
        if (this.currentUserIsVideo) {
            z14 = true;
        } else {
            z14 = true;
        }
        this.voIpSnowView.setState(z14);
        this.voIpCoverView.setState(z14);
        this.backgroundProvider.setHasVideo(z14);
        if (this.callingUserIsVideo) {
            this.isNearEar = false;
            if (sharedInstance != null) {
                sharedInstance.playStartRecordSound();
            }
        }
        if (!z14) {
            if (this.topShadow.getVisibility() != 4) {
                this.topShadow.setVisibility(4);
                this.bottomShadow.setVisibility(4);
            }
        } else if (this.topShadow.getVisibility() != 0) {
            this.topShadow.setVisibility(0);
            this.bottomShadow.setVisibility(0);
        }
        AndroidUtilities.cancelRunOnUIThread(this.stopAnimatingBgRunnable);
        if (this.currentState == 3) {
            AndroidUtilities.runOnUIThread(this.stopAnimatingBgRunnable, 10000L);
        }
        pipSource = this.pipSource;
        if (pipSource != null) {
            pipSource.invalidateActions();
        }
    }

    public void lambda$updateViewState$23(final VoIPService voIPService) {
        this.endCloseLayout.switchToClose(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$updateViewState$22(voIPService, view);
            }
        }, true);
    }

    public void lambda$updateViewState$21() {
        this.windowView.finish();
    }

    public void lambda$updateViewState$22(VoIPService voIPService, View view) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateViewState$21();
            }
        });
        int i = this.selectedRating;
        if (i > 0) {
            voIPService.sendCallRating(i);
        }
    }

    public void lambda$updateViewState$24() {
        this.windowView.finish();
    }

    public void lambda$updateViewState$25(VoIPService voIPService, View view) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateViewState$24();
            }
        });
        int i = this.selectedRating;
        if (i > 0) {
            voIPService.sendCallRating(i);
        }
    }

    public void lambda$updateViewState$26(int i) {
        this.selectedRating = i;
    }

    public void lambda$updateViewState$27() {
        this.windowView.finish();
    }

    public void lambda$updateViewState$28(AlertDialog alertDialog, int i) {
        this.windowView.finish();
    }

    public void lambda$updateViewState$29(boolean[] zArr, AlertDialog alertDialog, int i) {
        zArr[0] = true;
        this.currentState = 17;
        Intent intent = new Intent(this.activity, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", this.callingUser.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", false);
        intent.putExtra("can_video_call", false);
        intent.putExtra("account", this.currentAccount);
        try {
            this.activity.startService(intent);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public void lambda$updateViewState$30(boolean[] zArr, DialogInterface dialogInterface) {
        if (zArr[0]) {
            return;
        }
        this.windowView.finish();
    }

    public void lambda$updateViewState$31() {
        this.windowView.finish();
    }

    public void lambda$updateViewState$32() {
        this.windowView.finish();
    }

    public void lambda$updateViewState$33() {
        VoIPFloatingLayout voIPFloatingLayout = this.callingUserMiniFloatingLayout;
        voIPFloatingLayout.isAppearing = false;
        voIPFloatingLayout.invalidate();
    }

    public void showUi(boolean z) {
        int i;
        ValueAnimator valueAnimator = this.uiVisibilityAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z && this.uiVisible) {
            ViewPropertyAnimator duration = this.speakerPhoneIcon.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            this.backIcon.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.addIcon.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.emojiLayout.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.callingUserTitle.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(cubicBezierInterpolator).start();
            this.statusTextView.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(cubicBezierInterpolator).start();
            this.buttonsLayout.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.bottomShadow.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.topShadow.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.uiVisibilityAlpha, 0.0f);
            this.uiVisibilityAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(this.statusbarAnimatorListener);
            this.uiVisibilityAnimator.setDuration(150L).setInterpolator(cubicBezierInterpolator);
            this.uiVisibilityAnimator.start();
            AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
            this.hideUiRunnableWaiting = false;
            this.buttonsLayout.setEnabled(false);
            this.encryptionTooltip.hide();
            i = 150;
        } else {
            if (z && !this.uiVisible) {
                this.tapToVideoTooltip.hide();
                this.encryptionTooltip.hide();
                ViewPropertyAnimator viewPropertyAnimatorTranslationY = this.callingUserTitle.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
                viewPropertyAnimatorTranslationY.setInterpolator(cubicBezierInterpolator2).start();
                this.statusTextView.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(cubicBezierInterpolator2).start();
                this.speakerPhoneIcon.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
                this.backIcon.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
                this.addIcon.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
                this.emojiLayout.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
                this.buttonsLayout.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
                this.bottomShadow.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
                this.topShadow.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.uiVisibilityAlpha, 1.0f);
                this.uiVisibilityAnimator = valueAnimatorOfFloat2;
                valueAnimatorOfFloat2.addUpdateListener(this.statusbarAnimatorListener);
                this.uiVisibilityAnimator.setDuration(150L).setInterpolator(cubicBezierInterpolator2);
                this.uiVisibilityAnimator.start();
                this.buttonsLayout.setEnabled(true);
            }
            i = 0;
        }
        this.uiVisible = z;
        this.windowView.requestFullscreen(!z);
        this.notificationsLayout.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.uiVisible ? AndroidUtilities.dp(80.0f) : 0)).setDuration(150L).setStartDelay(i).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
    }

    private void showFloatingLayout(int i, boolean z) {
        Animator animator;
        if (this.currentUserCameraFloatingLayout.getTag() == null || ((Integer) this.currentUserCameraFloatingLayout.getTag()).intValue() != 2) {
            this.currentUserCameraFloatingLayout.setUiVisible(this.uiVisible);
        }
        if (!z && (animator = this.cameraShowingAnimator) != null) {
            animator.removeAllListeners();
            this.cameraShowingAnimator.cancel();
        }
        if (i != 0) {
            boolean z2 = (this.currentUserCameraFloatingLayout.getTag() == null || ((Integer) this.currentUserCameraFloatingLayout.getTag()).intValue() == 0) ? false : z;
            if (z) {
                if (this.currentUserCameraFloatingLayout.getTag() != null && ((Integer) this.currentUserCameraFloatingLayout.getTag()).intValue() == 0) {
                    if (this.currentUserCameraFloatingLayout.getVisibility() == 8) {
                        this.currentUserCameraFloatingLayout.setAlpha(0.0f);
                        this.currentUserCameraFloatingLayout.setScaleX(0.7f);
                        this.currentUserCameraFloatingLayout.setScaleY(0.7f);
                        this.currentUserCameraFloatingLayout.setVisibility(0);
                    }
                    Animator animator2 = this.cameraShowingAnimator;
                    if (animator2 != null) {
                        animator2.removeAllListeners();
                        this.cameraShowingAnimator.cancel();
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.currentUserCameraFloatingLayout, (Property<VoIPFloatingLayout, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.currentUserCameraFloatingLayout, (Property<VoIPFloatingLayout, Float>) View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.currentUserCameraFloatingLayout, (Property<VoIPFloatingLayout, Float>) View.SCALE_Y, 0.7f, 1.0f));
                    this.cameraShowingAnimator = animatorSet;
                    animatorSet.setDuration(150L).start();
                }
            } else {
                this.currentUserCameraFloatingLayout.setVisibility(0);
            }
            if (this.currentUserCameraFloatingLayout.getTag() == null || ((Integer) this.currentUserCameraFloatingLayout.getTag()).intValue() != 2) {
                VoIPFloatingLayout voIPFloatingLayout = this.currentUserCameraFloatingLayout;
                if (voIPFloatingLayout.relativePositionToSetX < 0.0f) {
                    voIPFloatingLayout.setRelativePosition(1.0f, 1.0f);
                    this.currentUserCameraIsFullscreen = true;
                }
            }
            this.currentUserCameraFloatingLayout.setFloatingMode(i == 2, z2);
            this.currentUserCameraIsFullscreen = i != 2;
        } else if (z) {
            if (this.currentUserCameraFloatingLayout.getTag() != null && ((Integer) this.currentUserCameraFloatingLayout.getTag()).intValue() != 0) {
                Animator animator3 = this.cameraShowingAnimator;
                if (animator3 != null) {
                    animator3.removeAllListeners();
                    this.cameraShowingAnimator.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                VoIPFloatingLayout voIPFloatingLayout2 = this.currentUserCameraFloatingLayout;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(voIPFloatingLayout2, (Property<VoIPFloatingLayout, Float>) View.ALPHA, voIPFloatingLayout2.getAlpha(), 0.0f));
                if (this.currentUserCameraFloatingLayout.getTag() != null && ((Integer) this.currentUserCameraFloatingLayout.getTag()).intValue() == 2) {
                    VoIPFloatingLayout voIPFloatingLayout3 = this.currentUserCameraFloatingLayout;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(voIPFloatingLayout3, (Property<VoIPFloatingLayout, Float>) View.SCALE_X, voIPFloatingLayout3.getScaleX(), 0.7f);
                    VoIPFloatingLayout voIPFloatingLayout4 = this.currentUserCameraFloatingLayout;
                    animatorSet2.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(voIPFloatingLayout4, (Property<VoIPFloatingLayout, Float>) View.SCALE_Y, voIPFloatingLayout4.getScaleX(), 0.7f));
                }
                this.cameraShowingAnimator = animatorSet2;
                animatorSet2.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator4) {
                        VoIPFragment.this.currentUserCameraFloatingLayout.setTranslationX(0.0f);
                        VoIPFragment.this.currentUserCameraFloatingLayout.setTranslationY(0.0f);
                        VoIPFragment.this.currentUserCameraFloatingLayout.setScaleY(1.0f);
                        VoIPFragment.this.currentUserCameraFloatingLayout.setScaleX(1.0f);
                        VoIPFragment.this.currentUserCameraFloatingLayout.setVisibility(8);
                    }
                });
                this.cameraShowingAnimator.setDuration(250L).setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.cameraShowingAnimator.setStartDelay(50L);
                this.cameraShowingAnimator.start();
            }
        } else {
            this.currentUserCameraFloatingLayout.setVisibility(8);
        }
        this.currentUserCameraFloatingLayout.setTag(Integer.valueOf(i));
    }

    private void showCallingUserAvatarMini(boolean z, boolean z2) {
        boolean z3 = (this.currentUserIsVideo || this.callingUserIsVideo) ? false : true;
        if (z) {
            if (z3 && this.callingUserPhotoViewMini.getTag() == null) {
                this.callingUserPhotoViewMini.animate().setListener(null).cancel();
                this.callingUserPhotoViewMini.setVisibility(0);
                if (this.emojiExpanded) {
                    if (z2) {
                        this.callingUserPhotoViewMini.setAlpha(0.0f);
                        this.callingUserPhotoViewMini.setTranslationY(AndroidUtilities.dp(48.0f));
                        this.callingUserPhotoViewMini.setScaleX(0.1f);
                        this.callingUserPhotoViewMini.setScaleY(0.1f);
                    }
                } else if (z2) {
                    this.callingUserPhotoViewMini.setAlpha(0.0f);
                    this.callingUserPhotoViewMini.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                } else {
                    this.callingUserPhotoViewMini.setAlpha(0.0f);
                    this.callingUserPhotoViewMini.setTranslationY(-AndroidUtilities.dp(135.0f));
                    this.callingUserPhotoViewMini.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                }
            } else if (!z3 && this.callingUserPhotoViewMini.getTag() != null) {
                this.callingUserPhotoViewMini.animate().setListener(null).cancel();
                this.callingUserPhotoViewMini.setTranslationY(0.0f);
                this.callingUserPhotoViewMini.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(CubicBezierInterpolator.DEFAULT).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        VoIPFragment.this.callingUserPhotoViewMini.setVisibility(8);
                    }
                }).start();
            }
        } else {
            this.callingUserPhotoViewMini.animate().setListener(null).cancel();
            this.callingUserPhotoViewMini.setTranslationY(0.0f);
            this.callingUserPhotoViewMini.setAlpha(1.0f);
            this.callingUserPhotoViewMini.setScaleX(1.0f);
            this.callingUserPhotoViewMini.setScaleY(1.0f);
            this.callingUserPhotoViewMini.setVisibility(z3 ? 0 : 8);
        }
        this.callingUserPhotoViewMini.setTag(z3 ? 1 : null);
    }

    private void updateKeyView(boolean z) {
        VoIPService sharedInstance;
        byte[] byteArray;
        AnimatedEmojiDrawable animatedEmojiDrawable;
        if (this.emojiLoaded || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(sharedInstance.getEncryptionKey());
            byteArrayOutputStream.write(sharedInstance.getGA());
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
            byteArray = null;
        }
        if (byteArray == null) {
            return;
        }
        String[] strArrEmojifyForCall = EncryptionKeyEmojifier.emojifyForCall(Utilities.computeSHA256(byteArray, 0, byteArray.length));
        for (int i = 0; i < 4; i++) {
            Emoji.preloadEmoji(strArrEmojifyForCall[i]);
            ?? emojiDrawable = Emoji.getEmojiDrawable(strArrEmojifyForCall[i]);
            if (emojiDrawable != 0) {
                emojiDrawable.setBounds(0, 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                emojiDrawable.preload();
                int[] iArr = new int[1];
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(AndroidUtilities.dp(28.0f));
                TLRPC.Document documentReplaceEmojiToLottieFrame = replaceEmojiToLottieFrame(Emoji.replaceEmoji((CharSequence) strArrEmojifyForCall[i], textPaint.getFontMetricsInt(), false, iArr), iArr);
                if (documentReplaceEmojiToLottieFrame != null) {
                    Drawable drawable = this.emojiDrawables[i];
                    if ((drawable instanceof AnimatedEmojiDrawable) && ((AnimatedEmojiDrawable) drawable).getDocumentId() == documentReplaceEmojiToLottieFrame.id) {
                        animatedEmojiDrawable = (AnimatedEmojiDrawable) this.emojiDrawables[i];
                    } else {
                        Drawable[] drawableArr = this.emojiDrawables;
                        AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(21, this.currentAccount, documentReplaceEmojiToLottieFrame);
                        drawableArr[i] = animatedEmojiDrawable2;
                        animatedEmojiDrawable = animatedEmojiDrawable2;
                    }
                    animatedEmojiDrawable.setupEmojiThumb(strArrEmojifyForCall[i]);
                    this.emojiViews[i].setAnimatedEmojiDrawable(animatedEmojiDrawable);
                    this.emojiViews[i].getImageReceiver().clearImage();
                    emojiDrawable = animatedEmojiDrawable;
                } else {
                    this.emojiViews[i].setImageDrawable(emojiDrawable);
                    emojiDrawable = emojiDrawable;
                }
                this.emojiViews[i].setVisibility(8);
            }
            this.emojiDrawables[i] = emojiDrawable;
        }
        checkEmojiLoaded(z);
    }

    private boolean isLoaded(Drawable drawable) {
        ImageReceiver imageReceiver;
        if (drawable instanceof Emoji.EmojiDrawable) {
            return ((Emoji.EmojiDrawable) drawable).isLoaded();
        }
        if (!(drawable instanceof AnimatedEmojiDrawable) || (imageReceiver = ((AnimatedEmojiDrawable) drawable).getImageReceiver()) == null) {
            return false;
        }
        Drawable thumb = imageReceiver.getThumb();
        return !(thumb instanceof Emoji.EmojiDrawable) || ((Emoji.EmojiDrawable) thumb).isLoaded();
    }

    private void checkEmojiLoaded(boolean z) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (isLoaded(this.emojiDrawables[i2])) {
                i++;
            }
        }
        if (i == 4) {
            this.emojiLoaded = true;
            for (int i3 = 0; i3 < 4; i3++) {
                if (this.emojiViews[i3].getVisibility() != 0) {
                    this.emojiViews[i3].setVisibility(0);
                    if (z) {
                        this.emojiViews[i3].setAlpha(0.0f);
                        this.emojiViews[i3].setScaleX(0.0f);
                        this.emojiViews[i3].setScaleY(0.0f);
                        this.emojiViews[i3].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_BACK).setDuration(250L).start();
                    }
                }
            }
            this.encryptionTooltip.postDelayed(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkEmojiLoaded$34();
                }
            }, 1000L);
        }
    }

    public void lambda$checkEmojiLoaded$34() {
        if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
            SharedConfig.incrementCallEncryptionHintDisplayed(1);
            this.encryptionTooltip.setTranslationY(this.emojiLayout.getY() + AndroidUtilities.dp(36.0f));
            this.encryptionTooltip.show();
        }
    }

    private void showAcceptDeclineView(boolean z, boolean z2) {
        if (!z2) {
            this.acceptDeclineView.setVisibility(z ? 0 : 8);
        } else {
            if (z && this.acceptDeclineView.getTag() == null) {
                this.acceptDeclineView.animate().setListener(null).cancel();
                if (this.acceptDeclineView.getVisibility() == 8) {
                    this.acceptDeclineView.setVisibility(0);
                    this.acceptDeclineView.setAlpha(0.0f);
                }
                this.acceptDeclineView.animate().alpha(1.0f);
            }
            if (!z && this.acceptDeclineView.getTag() != null) {
                this.acceptDeclineView.animate().setListener(null).cancel();
                this.acceptDeclineView.animate().setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        VoIPFragment.this.acceptDeclineView.setVisibility(8);
                    }
                }).alpha(0.0f);
            }
        }
        this.acceptDeclineView.setEnabled(z);
        this.acceptDeclineView.setTag(z ? 1 : null);
    }

    private void updateButtons(boolean z) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (z) {
            TransitionSet transitionSet = new TransitionSet();
            Transition duration = new Visibility() {
                @Override
                public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                    ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(100.0f), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.0f, 1.0f));
                    if (view instanceof VoIPToggleButton) {
                        view.setTranslationY(AndroidUtilities.dp(100.0f));
                        view.setScaleX(0.0f);
                        view.setScaleY(0.0f);
                        objectAnimatorOfPropertyValuesHolder.setStartDelay(((VoIPToggleButton) view).animationDelay);
                    }
                    if (view instanceof VoIpSwitchLayout) {
                        view.setTranslationY(AndroidUtilities.dp(100.0f));
                        view.setScaleX(0.0f);
                        view.setScaleY(0.0f);
                        objectAnimatorOfPropertyValuesHolder.setStartDelay(((VoIpSwitchLayout) view).animationDelay);
                    }
                    return objectAnimatorOfPropertyValuesHolder;
                }

                @Override
                public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                    return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, view.getTranslationY(), AndroidUtilities.dp(100.0f)), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, view.getScaleY(), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, view.getScaleX(), 0.0f));
                }
            }.setDuration(250L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            transitionSet.addTransition(duration.setInterpolator(cubicBezierInterpolator)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(cubicBezierInterpolator));
            transitionSet.excludeChildren(VoIPToggleButton.class, true);
            transitionSet.excludeChildren(VoIpSwitchLayout.class, true);
            TransitionManager.beginDelayedTransition(this.buttonsLayout, transitionSet);
        }
        int i = this.currentState;
        if (i == 11) {
            this.bottomSpeakerBtn.setVisibility(8);
            this.bottomVideoBtn.setVisibility(8);
            this.bottomMuteBtn.setVisibility(8);
            this.bottomEndCallBtn.setVisibility(8);
            return;
        }
        int i2 = 0;
        if (i == 15 || i == 17) {
            TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
            if (phoneCall != null && phoneCall.video && i == 15) {
                if (!sharedInstance.isScreencast() && (this.currentUserIsVideo || this.callingUserIsVideo)) {
                    setFrontalCameraAction(this.bottomSpeakerBtn, sharedInstance, z);
                    if (this.uiVisible) {
                        this.speakerPhoneIcon.animate().alpha(1.0f).start();
                    }
                } else {
                    setSpeakerPhoneAction(this.bottomSpeakerBtn, sharedInstance, z);
                    this.speakerPhoneIcon.animate().alpha(0.0f).start();
                }
                setVideoAction(this.bottomVideoBtn, sharedInstance, false);
                setMicrohoneAction(this.bottomMuteBtn, sharedInstance, z);
            } else {
                this.bottomSpeakerBtn.setVisibility(8);
                this.bottomVideoBtn.setVisibility(8);
                this.bottomMuteBtn.setVisibility(8);
            }
            this.bottomEndCallBtn.setVisibility(8);
        } else {
            if (instance == null) {
                return;
            }
            if (!sharedInstance.isScreencast() && (this.currentUserIsVideo || this.callingUserIsVideo)) {
                setFrontalCameraAction(this.bottomSpeakerBtn, sharedInstance, z);
                if (this.uiVisible) {
                    this.speakerPhoneIcon.setTag(1);
                    this.speakerPhoneIcon.animate().alpha(1.0f).start();
                }
            } else {
                setSpeakerPhoneAction(this.bottomSpeakerBtn, sharedInstance, z);
                this.speakerPhoneIcon.setTag(null);
                this.speakerPhoneIcon.animate().alpha(0.0f).start();
            }
            setVideoAction(this.bottomVideoBtn, sharedInstance, false);
            setMicrohoneAction(this.bottomMuteBtn, sharedInstance, z);
            this.bottomEndCallBtn.setData(R.drawable.calls_decline, -1, -1041108, LocaleController.getString(R.string.VoipEndCall2), false, z);
            this.bottomEndCallBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$updateButtons$35(view);
                }
            });
        }
        if (this.bottomSpeakerBtn.getVisibility() == 0) {
            this.bottomSpeakerBtn.animationDelay = 0;
            i2 = 16;
        }
        if (this.bottomVideoBtn.getVisibility() == 0) {
            this.bottomVideoBtn.animationDelay = i2;
            i2 += 16;
        }
        if (this.bottomMuteBtn.getVisibility() == 0) {
            this.bottomMuteBtn.animationDelay = i2;
            i2 += 16;
        }
        if (this.bottomEndCallBtn.getVisibility() == 0) {
            this.bottomEndCallBtn.animationDelay = i2;
        }
        updateSpeakerPhoneIcon();
    }

    public void lambda$updateButtons$35(View view) {
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
            this.hideUiRunnableWaiting = false;
            VoIPService.getSharedInstance().hangUp();
        }
    }

    private void setMicrohoneAction(VoIpSwitchLayout voIpSwitchLayout, VoIPService voIPService, boolean z) {
        voIpSwitchLayout.setType(VoIpSwitchLayout.Type.MICRO, voIPService.isMicMute());
        this.currentUserCameraFloatingLayout.setMuted(voIPService.isMicMute(), z);
        voIpSwitchLayout.setOnBtnClickedListener(new VoIpSwitchLayout.VoIpButtonView.OnBtnClickedListener() {
            @Override
            public final void onClicked(View view) {
                this.f$0.lambda$setMicrohoneAction$36(view);
            }
        });
    }

    public void lambda$setMicrohoneAction$36(View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
            this.hideUiRunnableWaiting = false;
            boolean zIsMicMute = sharedInstance.isMicMute();
            boolean z = !zIsMicMute;
            if (this.accessibilityManager.isTouchExplorationEnabled()) {
                view.announceForAccessibility(LocaleController.getString(!zIsMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
            }
            sharedInstance.setMicMute(z, false, true);
            this.previousState = this.currentState;
            updateViewState();
        }
    }

    public void setVideoAction(VoIpSwitchLayout voIpSwitchLayout, VoIPService voIPService, boolean z) {
        if ((this.currentUserIsVideo || this.callingUserIsVideo) ? true : voIPService.isVideoAvailable()) {
            if (this.currentUserIsVideo) {
                if (voIPService.isScreencast()) {
                    voIpSwitchLayout.setType(VoIpSwitchLayout.Type.VIDEO, false, z);
                } else {
                    voIpSwitchLayout.setType(VoIpSwitchLayout.Type.VIDEO, false, z);
                }
            } else {
                voIpSwitchLayout.setType(VoIpSwitchLayout.Type.VIDEO, true, z);
            }
            voIpSwitchLayout.setOnBtnClickedListener(new VoIpSwitchLayout.VoIpButtonView.OnBtnClickedListener() {
                @Override
                public final void onClicked(View view) {
                    this.f$0.lambda$setVideoAction$37(view);
                }
            });
            voIpSwitchLayout.setEnabled(true);
            return;
        }
        voIpSwitchLayout.setType(VoIpSwitchLayout.Type.VIDEO, true);
        voIpSwitchLayout.setOnClickListener(null);
        voIpSwitchLayout.setEnabled(false);
    }

    public void lambda$setVideoAction$37(View view) {
        AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
        this.hideUiRunnableWaiting = false;
        if (Build.VERSION.SDK_INT >= 23 && this.activity.checkSelfPermission("android.permission.CAMERA") != 0) {
            this.activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
        } else {
            toggleCameraInput();
        }
    }

    private void updateSpeakerPhoneIcon() {
        int i;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isBluetoothOn()) {
            i = R.drawable.calls_bluetooth;
        } else if (VoipAudioManager.get().isSpeakerphoneOn()) {
            i = R.drawable.calls_speaker;
        } else if (sharedInstance.isHeadsetPlugged()) {
            i = R.drawable.calls_menu_headset;
        } else {
            i = R.drawable.calls_menu_phone;
        }
        if (this.speakerPhoneIconResId != i) {
            AndroidUtilities.updateImageViewImageAnimated(this.speakerPhoneIcon, i);
        } else {
            this.speakerPhoneIcon.setImageResource(i);
        }
        this.speakerPhoneIconResId = i;
    }

    private void setSpeakerPhoneAction(final VoIpSwitchLayout voIpSwitchLayout, final VoIPService voIPService, boolean z) {
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        final int i = 0;
        if (voIPService.isBluetoothOn()) {
            voIpSwitchLayout.setType(VoIpSwitchLayout.Type.BLUETOOTH, false);
            i = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            voIpSwitchLayout.setType(VoIpSwitchLayout.Type.SPEAKER, true);
        } else {
            voIpSwitchLayout.setType(VoIpSwitchLayout.Type.SPEAKER, false);
            i = 1;
        }
        voIpSwitchLayout.setEnabled(true);
        voIpSwitchLayout.setOnBtnClickedListener(new VoIpSwitchLayout.VoIpButtonView.OnBtnClickedListener() {
            @Override
            public final void onClicked(View view) {
                this.f$0.lambda$setSpeakerPhoneAction$38(i, voIpSwitchLayout, voIPService, view);
            }
        });
    }

    public void lambda$setSpeakerPhoneAction$38(int i, VoIpSwitchLayout voIpSwitchLayout, VoIPService voIPService, View view) {
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
            this.hideUiRunnableWaiting = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(this.activity, false, Integer.valueOf(i));
            setSpeakerPhoneAction(voIpSwitchLayout, voIPService, true);
        }
    }

    private void setFrontalCameraAction(final VoIpSwitchLayout voIpSwitchLayout, final VoIPService voIPService, boolean z) {
        if (!this.currentUserIsVideo) {
            voIpSwitchLayout.setType(VoIpSwitchLayout.Type.CAMERA, false);
            voIpSwitchLayout.setOnBtnClickedListener(null);
            voIpSwitchLayout.setEnabled(false);
        } else {
            voIpSwitchLayout.setEnabled(true);
            if (voIPService.isFrontFaceCamera()) {
                voIpSwitchLayout.setType(VoIpSwitchLayout.Type.CAMERA, true ^ voIPService.isSwitchingCamera());
            } else {
                voIpSwitchLayout.setType(VoIpSwitchLayout.Type.CAMERA, voIPService.isSwitchingCamera());
            }
            voIpSwitchLayout.setOnBtnClickedListener(new VoIpSwitchLayout.VoIpButtonView.OnBtnClickedListener() {
                @Override
                public final void onClicked(View view) {
                    this.f$0.lambda$setFrontalCameraAction$39(voIPService, voIpSwitchLayout, view);
                }
            });
        }
    }

    public void lambda$setFrontalCameraAction$39(VoIPService voIPService, VoIpSwitchLayout voIpSwitchLayout, View view) {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
            this.hideUiRunnableWaiting = false;
            if (this.accessibilityManager.isTouchExplorationEnabled()) {
                if (voIPService.isFrontFaceCamera()) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamSwitchedToBack);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamSwitchedToFront);
                }
                view.announceForAccessibility(string);
            }
            voIpSwitchLayout.setType(VoIpSwitchLayout.Type.CAMERA, !voIPService.isFrontFaceCamera());
            sharedInstance.switchCamera();
        }
    }

    public void onScreenCastStart() {
        PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew = this.previewDialog;
        if (privateVideoPreviewDialogNew == null) {
            return;
        }
        privateVideoPreviewDialogNew.dismiss(true, true);
    }

    private void toggleCameraInput() {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.accessibilityManager.isTouchExplorationEnabled()) {
                if (!this.currentUserIsVideo) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOn);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOff);
                }
                this.fragmentView.announceForAccessibility(string);
            }
            if (!this.currentUserIsVideo) {
                if (this.previewDialog == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.windowView.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.bottomVideoBtn.getLocationOnScreen(iArr);
                    PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew = new PrivateVideoPreviewDialogNew(this.fragmentView.getContext(), iArr[0], iArr[1]) {
                        @Override
                        public void onDismiss(boolean z, boolean z2) {
                            VoIPFragment.this.previewDialog = null;
                            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                            VoIPFragment.this.windowView.setLockOnScreen(false);
                            if (z2) {
                                VoIPFragment.this.currentUserIsVideo = true;
                                if (sharedInstance2 != null && !z) {
                                    sharedInstance2.requestVideoCall(false);
                                    sharedInstance2.setVideoState(false, 2);
                                    sharedInstance2.switchToSpeaker();
                                }
                                if (sharedInstance2 != null) {
                                    VoIPFragment voIPFragment = VoIPFragment.this;
                                    voIPFragment.setVideoAction(voIPFragment.bottomVideoBtn, sharedInstance2, true);
                                }
                            } else if (sharedInstance2 != null) {
                                sharedInstance2.setVideoState(false, 0);
                            }
                            VoIPFragment voIPFragment2 = VoIPFragment.this;
                            voIPFragment2.previousState = voIPFragment2.currentState;
                            VoIPFragment.this.updateViewState();
                        }

                        @Override
                        protected void afterOpened() {
                            VoIPFragment.this.gradientLayout.lockDrawing = true;
                            VoIPFragment.this.gradientLayout.invalidate();
                        }

                        @Override
                        protected void beforeClosed() {
                            VoIPFragment.this.gradientLayout.lockDrawing = false;
                            VoIPFragment.this.gradientLayout.invalidate();
                        }

                        @Override
                        protected int[] getFloatingViewLocation() {
                            int[] iArr2 = new int[2];
                            VoIPFragment.this.currentUserCameraFloatingLayout.getLocationOnScreen(iArr2);
                            return new int[]{iArr2[0], iArr2[1], VoIPFragment.this.currentUserCameraFloatingLayout.getMeasuredWidth()};
                        }

                        @Override
                        protected boolean isHasVideoOnMainScreen() {
                            return VoIPFragment.this.callingUserIsVideo;
                        }
                    };
                    this.previewDialog = privateVideoPreviewDialogNew;
                    WindowInsets windowInsets = this.lastInsets;
                    if (windowInsets != null) {
                        privateVideoPreviewDialogNew.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.fragmentView.addView(this.previewDialog);
                    return;
                }
                return;
            }
            this.currentUserTextureView.saveCameraLastBitmap();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.previousState = this.currentState;
            updateViewState();
        }
    }

    public static void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        VoIPFragment voIPFragment = instance;
        if (voIPFragment != null) {
            voIPFragment.onRequestPermissionsResultInternal(i, strArr, iArr);
        }
    }

    private void onRequestPermissionsResultInternal(int i, String[] strArr, int[] iArr) {
        if (i == 101) {
            if (VoIPService.getSharedState() == null) {
                this.windowView.finish();
                return;
            }
            if (iArr.length > 0 && iArr[0] == 0) {
                runAcceptCallAnimation(new Runnable() {
                    @Override
                    public final void run() {
                        VoIPFragment.lambda$onRequestPermissionsResultInternal$40();
                    }
                });
            } else if (!this.activity.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().declineIncomingCall();
                }
                VoIPHelper.permissionDenied(this.activity, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onRequestPermissionsResultInternal$41();
                    }
                }, i);
                return;
            }
        }
        if (i == 102) {
            if (VoIPService.getSharedState() == null) {
                this.windowView.finish();
            } else {
                if (iArr.length <= 0 || iArr[0] != 0) {
                    return;
                }
                toggleCameraInput();
            }
        }
    }

    public static void lambda$onRequestPermissionsResultInternal$40() {
        if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().acceptIncomingCall();
        }
    }

    public void lambda$onRequestPermissionsResultInternal$41() {
        this.windowView.finish();
    }

    private void updateSystemBarColors() {
        this.overlayPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (this.uiVisibilityAlpha * 102.0f * this.enterTransitionProgress)));
        this.overlayBottomPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (((this.fillNaviagtionBarValue * 0.5f) + 0.5f) * 255.0f * this.enterTransitionProgress)));
        ViewGroup viewGroup = this.fragmentView;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public static void onPause() {
        VoIPFragment voIPFragment = instance;
        if (voIPFragment != null) {
            voIPFragment.onPauseInternal();
        }
        if (VoIPPiPView.getInstance() != null) {
            VoIPPiPView.getInstance().onPause();
        }
    }

    public static void onResume() {
        VoIPFragment voIPFragment = instance;
        if (voIPFragment != null) {
            voIPFragment.onResumeInternal();
        }
        if (VoIPPiPView.getInstance() != null) {
            VoIPPiPView.getInstance().onResume();
        }
    }

    public void onPauseInternal() {
        VoIPService sharedInstance;
        boolean zIsInteractive = ((PowerManager) this.activity.getSystemService("power")).isInteractive();
        int iCheckPermissions = PipUtils.checkPermissions(this.activity);
        boolean z = iCheckPermissions > 0;
        if (this.canSwitchToPip && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && iCheckPermissions == 2) {
            int measuredHeight = instance.windowView.getMeasuredHeight();
            VoIPFragment voIPFragment = instance;
            VoIPPiPView.show(voIPFragment.activity, voIPFragment.currentAccount, voIPFragment.windowView.getMeasuredWidth(), measuredHeight, 0);
            WindowInsets windowInsets = instance.lastInsets;
            if (windowInsets != null) {
                VoIPPiPView.topInset = windowInsets.getSystemWindowInsetTop();
                VoIPPiPView.bottomInset = instance.lastInsets.getSystemWindowInsetBottom();
            }
        }
        if (this.currentUserIsVideo) {
            if ((z && zIsInteractive) || (sharedInstance = VoIPService.getSharedInstance()) == null) {
                return;
            }
            sharedInstance.setVideoState(false, 1);
        }
    }

    public void onResumeInternal() {
        if (VoIPPiPView.getInstance() != null) {
            VoIPPiPView.finish();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (sharedInstance.getVideoState(false) == 1) {
                sharedInstance.setVideoState(false, 2);
            }
            updateViewState();
        } else if (VoIPService.getSharedState() == null) {
            this.windowView.finish();
        }
        this.deviceIsLocked = ((KeyguardManager) this.activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    private void showErrorDialog(CharSequence charSequence) {
        if (this.activity.isFinishing()) {
            return;
        }
        AlertDialog alertDialogShow = new DarkAlertDialog.Builder(this.activity).setTitle(LocaleController.getString(R.string.VoipFailed)).setMessage(charSequence).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
        alertDialogShow.setCanceledOnTouchOutside(true);
        alertDialogShow.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f$0.lambda$showErrorDialog$42(dialogInterface);
            }
        });
    }

    public void lambda$showErrorDialog$42(DialogInterface dialogInterface) {
        this.windowView.finish();
    }

    private void requestInlinePermissions() {
        AlertsCreator.createDrawOverlayPermissionDialog(this.activity, new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$requestInlinePermissions$43(alertDialog, i);
            }
        }, true).show();
    }

    public void lambda$requestInlinePermissions$43(AlertDialog alertDialog, int i) {
        VoIPWindowView voIPWindowView = this.windowView;
        if (voIPWindowView != null) {
            voIPWindowView.finish();
        }
    }

    public TLRPC.Document replaceEmojiToLottieFrame(CharSequence charSequence, int[] iArr) {
        TLRPC.Document next;
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        Spannable spannable = (Spannable) charSequence;
        Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(0, spannable.length(), Emoji.EmojiSpan.class);
        AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannable.getSpans(0, spannable.length(), AnimatedEmojiSpan.class);
        if (emojiSpanArr != null) {
            if (((iArr == null ? 0 : iArr[0]) - emojiSpanArr.length) - (animatedEmojiSpanArr == null ? 0 : animatedEmojiSpanArr.length) <= 0) {
                for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = "StaticEmoji";
                    TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, true, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.lambda$replaceEmojiToLottieFrame$44((TLRPC.TL_messages_stickerSet) obj);
                        }
                    });
                    if (stickerSet == null) {
                        return null;
                    }
                    String strReplace = emojiSpan.emoji.replace("️", "");
                    Iterator<TLRPC.Document> it = stickerSet.documents.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!TextUtils.equals(MessageObject.findAnimatedEmojiEmoticon(next, null).replace("️", ""), strReplace));
                    if (next != null) {
                        return next;
                    }
                }
            }
        }
        return null;
    }

    public void lambda$replaceEmojiToLottieFrame$44(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        updateKeyView(true);
    }

    @Override
    public Bitmap pipCreatePrimaryWindowViewBitmap() {
        VoIPTextureView voIPTextureView = this.callingUserTextureView;
        if (voIPTextureView == null || !voIPTextureView.renderer.isAvailable()) {
            return null;
        }
        return this.callingUserTextureView.renderer.getBitmap();
    }

    @Override
    public void pipRenderBackground(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    @Override
    public View pipCreatePictureInPictureView() {
        VoIPTextureView voIPTextureView = new VoIPTextureView(this.activity, false, true, false, false);
        this.pipTextureView = voIPTextureView;
        voIPTextureView.renderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.pipTextureView.renderer.setEnableHardwareScaler(true);
        this.pipTextureView.renderer.setRotateTextureWithScreen(true);
        VoIPTextureView voIPTextureView2 = this.pipTextureView;
        voIPTextureView2.scaleType = VoIPTextureView.SCALE_TYPE_FIT;
        voIPTextureView2.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new RendererCommon.RendererEvents() {
            @Override
            public void onFrameResolutionChanged(int i, int i2, int i3) {
            }

            @Override
            public void onFirstFrameRendered() {
                if (VoIPFragment.this.firstFrameCallback != null) {
                    VoIPFragment.this.firstFrameCallback.run();
                    VoIPFragment.this.firstFrameCallback = null;
                }
            }
        });
        View view = this.pipTextureView.backgroundView;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.pipTextureView;
    }

    @Override
    public void pipHidePrimaryWindowView(Runnable runnable) {
        this.firstFrameCallback = runnable;
        VoIPTextureView voIPTextureView = this.callingUserTextureView;
        if (voIPTextureView != null) {
            voIPTextureView.renderer.clearFirstFrame();
        }
        this.windowViewSkipRender = true;
        updateViewState();
        ((WindowManager) this.activity.getSystemService("window")).removeView(this.windowView);
        this.windowView.invalidate();
    }

    @Override
    public Bitmap pipCreatePictureInPictureViewBitmap() {
        VoIPTextureView voIPTextureView = this.pipTextureView;
        if (voIPTextureView == null || !voIPTextureView.renderer.isAvailable()) {
            return null;
        }
        return this.pipTextureView.renderer.getBitmap();
    }

    @Override
    public void pipShowPrimaryWindowView(Runnable runnable) {
        this.firstFrameCallback = runnable;
        WindowManager windowManager = (WindowManager) this.activity.getSystemService("window");
        VoIPWindowView voIPWindowView = this.windowView;
        windowManager.addView(voIPWindowView, voIPWindowView.createWindowLayoutParams());
        this.windowViewSkipRender = false;
        updateViewState();
        this.windowView.invalidate();
        VoIPTextureView voIPTextureView = this.pipTextureView;
        if (voIPTextureView != null) {
            voIPTextureView.renderer.release();
            this.pipTextureView = null;
        }
    }

    private static class ConferenceParticipantsView extends View {
        private final AvatarsDrawable avatarsDrawable;
        private final Paint backgroundPaint;
        private Text text;

        public ConferenceParticipantsView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            paint.setColor(-14538189);
            AvatarsDrawable avatarsDrawable = new AvatarsDrawable(this, false);
            this.avatarsDrawable = avatarsDrawable;
            avatarsDrawable.width = AndroidUtilities.dp(100.0f);
            avatarsDrawable.height = AndroidUtilities.dp(30.0f);
            avatarsDrawable.drawStoriesCircle = false;
            avatarsDrawable.setSize(AndroidUtilities.dp(24.0f));
            avatarsDrawable.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            avatarsDrawable.setStepFactor(0.58f);
        }

        public void set(int i, long j, ArrayList arrayList, int i2) {
            if (arrayList == null && i2 <= 0) {
                setVisibility(8);
                return;
            }
            int iMax = Math.max(i2, arrayList == null ? 0 : arrayList.size());
            int iMin = Math.min(3, arrayList == null ? 0 : arrayList.size());
            this.avatarsDrawable.setCount(iMin);
            for (int i3 = 0; i3 < iMin; i3++) {
                this.avatarsDrawable.setObject(i3, i, MessagesController.getInstance(i).getUserOrChat(DialogObject.getPeerDialogId(((TLRPC.GroupCallParticipant) arrayList.get(i3)).peer)));
            }
            this.avatarsDrawable.commitTransition(false);
            if (iMax == 1 && (arrayList == null || arrayList.size() == 0 || (arrayList.size() == 1 && DialogObject.getPeerDialogId(((TLRPC.GroupCallParticipant) arrayList.get(0)).peer) == j))) {
                setVisibility(8);
                return;
            }
            this.text = new Text(LocaleController.formatPluralStringComma("Participants", iMax), 14.0f, AndroidUtilities.bold());
            setVisibility(0);
            invalidate();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(30.0f));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.text == null) {
                return;
            }
            float fDp = AndroidUtilities.dp(4.0f) + this.avatarsDrawable.getUsedWidth() + AndroidUtilities.dp(7.0f) + this.text.getCurrentWidth() + AndroidUtilities.dp(13.0f);
            float fDp2 = AndroidUtilities.dp(30.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - fDp) / 2.0f, 0.0f, (getWidth() + fDp) / 2.0f, getHeight());
            float f = fDp2 / 2.0f;
            canvas.drawRoundRect(rectF, f, f, this.backgroundPaint);
            canvas.save();
            canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
            this.avatarsDrawable.onDraw(canvas);
            canvas.translate(this.avatarsDrawable.getMaxX() + AndroidUtilities.dp(7.0f), 0.0f);
            this.text.draw(canvas, 0.0f, f, -1, 1.0f);
            canvas.restore();
        }
    }
}
