package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.PowerManager;
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
import androidx.core.view.ViewCompat;
import java.io.ByteArrayOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.EncryptionKeyEmojifier;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC$PhoneCall;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.DarkAlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.voip.AcceptDeclineView;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialog;
import org.telegram.ui.Components.voip.VoIPButtonsLayout;
import org.telegram.ui.Components.voip.VoIPFloatingLayout;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Components.voip.VoIPNotificationsLayout;
import org.telegram.ui.Components.voip.VoIPOverlayBackground;
import org.telegram.ui.Components.voip.VoIPPiPView;
import org.telegram.ui.Components.voip.VoIPStatusTextView;
import org.telegram.ui.Components.voip.VoIPTextureView;
import org.telegram.ui.Components.voip.VoIPToggleButton;
import org.telegram.ui.Components.voip.VoIPWindowView;
import org.telegram.ui.VoIPFragment;
import org.webrtc.EglBase;
import org.webrtc.GlRectDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;
public class VoIPFragment implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate {
    private static VoIPFragment instance;
    private AcceptDeclineView acceptDeclineView;
    private AccessibilityManager accessibilityManager;
    Activity activity;
    private ImageView backIcon;
    View bottomShadow;
    private VoIPButtonsLayout buttonsLayout;
    TLRPC$User callingUser;
    boolean callingUserIsVideo;
    private VoIPFloatingLayout callingUserMiniFloatingLayout;
    private TextureViewRenderer callingUserMiniTextureRenderer;
    private BackupImageView callingUserPhotoView;
    private BackupImageView callingUserPhotoViewMini;
    private VoIPTextureView callingUserTextureView;
    private TextView callingUserTitle;
    boolean cameraForceExpanded;
    private Animator cameraShowingAnimator;
    private boolean canHideUI;
    private boolean canSwitchToPip;
    private boolean canZoomGesture;
    private final int currentAccount;
    private int currentState;
    private VoIPFloatingLayout currentUserCameraFloatingLayout;
    private boolean currentUserCameraIsFullscreen;
    boolean currentUserIsVideo;
    private VoIPTextureView currentUserTextureView;
    private boolean deviceIsLocked;
    private boolean emojiExpanded;
    LinearLayout emojiLayout;
    private boolean emojiLoaded;
    TextView emojiRationalTextView;
    boolean enterFromPiP;
    private float enterTransitionProgress;
    boolean fillNaviagtionBar;
    float fillNaviagtionBarValue;
    private ViewGroup fragmentView;
    boolean hideUiRunnableWaiting;
    private boolean isFinished;
    private boolean isInPinchToZoomTouchMode;
    private boolean isVideoCall;
    long lastContentTapTime;
    private WindowInsets lastInsets;
    private boolean lockOnScreen;
    ValueAnimator naviagtionBarAnimator;
    VoIPNotificationsLayout notificationsLayout;
    private VoIPOverlayBackground overlayBackground;
    private float pinchCenterX;
    private float pinchCenterY;
    private float pinchStartCenterX;
    private float pinchStartCenterY;
    private float pinchStartDistance;
    private float pinchTranslationX;
    private float pinchTranslationY;
    private int pointerId1;
    private int pointerId2;
    private PrivateVideoPreviewDialog previewDialog;
    private int previousState;
    private boolean screenWasWakeup;
    private ImageView speakerPhoneIcon;
    LinearLayout statusLayout;
    private int statusLayoutAnimateToOffset;
    private VoIPStatusTextView statusTextView;
    private boolean switchingToPip;
    HintView tapToVideoTooltip;
    View topShadow;
    float touchSlop;
    ValueAnimator uiVisibilityAnimator;
    private VoIPWindowView windowView;
    ValueAnimator zoomBackAnimator;
    private boolean zoomStarted;
    VoIPToggleButton[] bottomButtons = new VoIPToggleButton[4];
    ImageView[] emojiViews = new ImageView[4];
    Emoji.EmojiDrawable[] emojiDrawables = new Emoji.EmojiDrawable[4];
    Paint overlayPaint = new Paint();
    Paint overlayBottomPaint = new Paint();
    private boolean uiVisible = true;
    float uiVisibilityAlpha = 1.0f;
    AnimationNotificationsLocker notificationsLocker = new AnimationNotificationsLocker();
    ValueAnimator.AnimatorUpdateListener statusbarAnimatorListener = new ValueAnimator.AnimatorUpdateListener() {
        @Override
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            VoIPFragment.this.lambda$new$0(valueAnimator);
        }
    };
    ValueAnimator.AnimatorUpdateListener navigationBarAnimationListener = new ValueAnimator.AnimatorUpdateListener() {
        @Override
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            VoIPFragment.this.lambda$new$1(valueAnimator);
        }
    };
    Runnable hideUIRunnable = new Runnable() {
        @Override
        public final void run() {
            VoIPFragment.this.lambda$new$2();
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

    public void lambda$new$0(ValueAnimator valueAnimator) {
        this.uiVisibilityAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateSystemBarColors();
    }

    public void lambda$new$1(ValueAnimator valueAnimator) {
        this.fillNaviagtionBarValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateSystemBarColors();
    }

    public void lambda$new$2() {
        this.hideUiRunnableWaiting = false;
        if (this.canHideUI && this.uiVisible && !this.emojiExpanded) {
            this.lastContentTapTime = System.currentTimeMillis();
            showUi(false);
            this.previousState = this.currentState;
            updateViewState();
        }
    }

    public static void show(Activity activity, int i) {
        show(activity, false, i);
    }

    public static void show(Activity activity, boolean z, int i) {
        boolean isScreenOn;
        VoIPFragment voIPFragment = instance;
        if (voIPFragment != null && voIPFragment.windowView.getParent() == null) {
            VoIPFragment voIPFragment2 = instance;
            if (voIPFragment2 != null) {
                voIPFragment2.callingUserTextureView.renderer.release();
                instance.currentUserTextureView.renderer.release();
                instance.callingUserMiniTextureRenderer.release();
                instance.destroy();
            }
            instance = null;
        }
        if (instance != null || activity.isFinishing()) {
            return;
        }
        boolean z2 = VoIPPiPView.getInstance() != null;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getUser() == null) {
            return;
        }
        final VoIPFragment voIPFragment3 = new VoIPFragment(i);
        voIPFragment3.activity = activity;
        instance = voIPFragment3;
        VoIPWindowView voIPWindowView = new VoIPWindowView(activity, !z2) {
            private Path clipPath = new Path();
            private RectF rectF = new RectF();

            @Override
            public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                VoIPService sharedInstance;
                if (voIPFragment3.isFinished || voIPFragment3.switchingToPip) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 4 || keyEvent.getAction() != 1 || voIPFragment3.lockOnScreen) {
                    if ((keyCode == 25 || keyCode == 24) && voIPFragment3.currentState == 15 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                        sharedInstance.stopRinging();
                        return true;
                    }
                    return super.dispatchKeyEvent(keyEvent);
                }
                voIPFragment3.onBackPressed();
                return true;
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (voIPFragment3.switchingToPip && getAlpha() != 0.0f) {
                    float width = voIPFragment3.callingUserTextureView.getWidth() * voIPFragment3.callingUserTextureView.getScaleX();
                    float height = voIPFragment3.callingUserTextureView.getHeight() * voIPFragment3.callingUserTextureView.getScaleY();
                    float x = voIPFragment3.callingUserTextureView.getX() + ((voIPFragment3.callingUserTextureView.getWidth() - width) / 2.0f);
                    float y = voIPFragment3.callingUserTextureView.getY() + ((voIPFragment3.callingUserTextureView.getHeight() - height) / 2.0f);
                    canvas.save();
                    this.clipPath.rewind();
                    this.rectF.set(x, y, width + x, height + y);
                    float dp = AndroidUtilities.dp(4.0f);
                    this.clipPath.addRoundRect(this.rectF, dp, dp, Path.Direction.CW);
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
        PowerManager powerManager = (PowerManager) activity.getSystemService("power");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            isScreenOn = powerManager.isInteractive();
        } else {
            isScreenOn = powerManager.isScreenOn();
        }
        VoIPFragment voIPFragment4 = instance;
        voIPFragment4.screenWasWakeup = true ^ isScreenOn;
        voIPWindowView.setLockOnScreen(voIPFragment4.deviceIsLocked);
        voIPFragment3.windowView = voIPWindowView;
        if (i2 >= 20) {
            voIPWindowView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets lambda$show$3;
                    lambda$show$3 = VoIPFragment.lambda$show$3(VoIPFragment.this, view, windowInsets);
                    return lambda$show$3;
                }
            });
        }
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        WindowManager.LayoutParams createWindowLayoutParams = voIPWindowView.createWindowLayoutParams();
        if (z) {
            if (i2 >= 26) {
                createWindowLayoutParams.type = 2038;
            } else {
                createWindowLayoutParams.type = 2003;
            }
        }
        windowManager.addView(voIPWindowView, createWindowLayoutParams);
        voIPWindowView.addView(voIPFragment3.createView(activity));
        if (z2) {
            voIPFragment3.enterTransitionProgress = 0.0f;
            voIPFragment3.startTransitionFromPiP();
            return;
        }
        voIPFragment3.enterTransitionProgress = 1.0f;
        voIPFragment3.updateSystemBarColors();
    }

    public static WindowInsets lambda$show$3(VoIPFragment voIPFragment, View view, WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            voIPFragment.setInsets(windowInsets);
        }
        if (i >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public void onBackPressed() {
        if (this.isFinished || this.switchingToPip) {
            return;
        }
        PrivateVideoPreviewDialog privateVideoPreviewDialog = this.previewDialog;
        if (privateVideoPreviewDialog != null) {
            privateVideoPreviewDialog.dismiss(false, false);
        } else if (this.callingUserIsVideo && this.currentUserIsVideo && this.cameraForceExpanded) {
            this.cameraForceExpanded = false;
            this.currentUserCameraFloatingLayout.setRelativePosition(this.callingUserMiniFloatingLayout);
            this.currentUserCameraIsFullscreen = false;
            this.previousState = this.currentState;
            updateViewState();
        } else if (this.emojiExpanded) {
            expandEmoji(false);
        } else if (this.emojiRationalTextView.getVisibility() != 8) {
        } else {
            if (this.canSwitchToPip && !this.lockOnScreen) {
                if (AndroidUtilities.checkInlinePermissions(this.activity)) {
                    switchToPip();
                    return;
                } else {
                    requestInlinePermissions();
                    return;
                }
            }
            this.windowView.finish();
        }
    }

    public static void clearInstance() {
        WindowInsets windowInsets;
        WindowInsets windowInsets2;
        if (instance != null) {
            if (VoIPService.getSharedInstance() != null) {
                int measuredHeight = instance.windowView.getMeasuredHeight();
                int i = Build.VERSION.SDK_INT;
                if (i >= 20 && (windowInsets2 = instance.lastInsets) != null) {
                    measuredHeight -= windowInsets2.getSystemWindowInsetBottom();
                }
                VoIPFragment voIPFragment = instance;
                if (voIPFragment.canSwitchToPip) {
                    VoIPPiPView.show(voIPFragment.activity, voIPFragment.currentAccount, voIPFragment.windowView.getMeasuredWidth(), measuredHeight, 0);
                    if (i >= 20 && (windowInsets = instance.lastInsets) != null) {
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
        ((FrameLayout.LayoutParams) this.speakerPhoneIcon.getLayoutParams()).topMargin = this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.topShadow.getLayoutParams()).topMargin = this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.statusLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(68.0f) + this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.emojiLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(17.0f) + this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.callingUserPhotoViewMini.getLayoutParams()).topMargin = AndroidUtilities.dp(68.0f) + this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.currentUserCameraFloatingLayout.getLayoutParams()).bottomMargin = this.lastInsets.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) this.callingUserMiniFloatingLayout.getLayoutParams()).bottomMargin = this.lastInsets.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) this.callingUserTextureView.getLayoutParams()).bottomMargin = this.lastInsets.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) this.notificationsLayout.getLayoutParams()).bottomMargin = this.lastInsets.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) this.bottomShadow.getLayoutParams()).bottomMargin = this.lastInsets.getSystemWindowInsetBottom();
        this.currentUserCameraFloatingLayout.setInsets(this.lastInsets);
        this.callingUserMiniFloatingLayout.setInsets(this.lastInsets);
        this.fragmentView.requestLayout();
        PrivateVideoPreviewDialog privateVideoPreviewDialog = this.previewDialog;
        if (privateVideoPreviewDialog != null) {
            privateVideoPreviewDialog.setBottomPadding(this.lastInsets.getSystemWindowInsetBottom());
        }
    }

    public VoIPFragment(int i) {
        this.currentAccount = i;
        MessagesController.getInstance(i).getUser(Long.valueOf(UserConfig.getInstance(i).getClientUserId()));
        this.callingUser = VoIPService.getSharedInstance().getUser();
        VoIPService.getSharedInstance().registerStateListener(this);
        VoIPService.getSharedInstance().isOutgoing();
        this.previousState = -1;
        this.currentState = VoIPService.getSharedInstance().getCallState();
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
    }

    public void destroy() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
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
        } else if (i == NotificationCenter.emojiLoaded) {
            updateKeyView(true);
        } else if (i == NotificationCenter.closeInCallActivity) {
            this.windowView.finish();
        }
    }

    @Override
    public void onSignalBarsCountChanged(int i) {
        VoIPStatusTextView voIPStatusTextView = this.statusTextView;
        if (voIPStatusTextView != null) {
            voIPStatusTextView.setSignalBarCount(i);
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

    public View createView(Context context) {
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(context, AccessibilityManager.class);
        FrameLayout frameLayout = new FrameLayout(context) {
            boolean check;
            long pressedTime;
            float pressedX;
            float pressedY;

            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                int i = Build.VERSION.SDK_INT;
                if (i >= 20 && VoIPFragment.this.lastInsets != null) {
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), VoIPFragment.this.lastInsets.getSystemWindowInsetTop(), VoIPFragment.this.overlayPaint);
                }
                if (i < 20 || VoIPFragment.this.lastInsets == null) {
                    return;
                }
                canvas.drawRect(0.0f, getMeasuredHeight() - VoIPFragment.this.lastInsets.getSystemWindowInsetBottom(), getMeasuredWidth(), getMeasuredHeight(), VoIPFragment.this.overlayBottomPaint);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
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
                        float x = VoIPFragment.this.pinchStartCenterX - ((motionEvent.getX(i) + motionEvent.getX(i2)) / 2.0f);
                        float y = VoIPFragment.this.pinchStartCenterY - ((motionEvent.getY(i) + motionEvent.getY(i2)) / 2.0f);
                        VoIPFragment voIPFragment8 = VoIPFragment.this;
                        voIPFragment8.pinchTranslationX = (-x) / voIPFragment8.pinchScale;
                        VoIPFragment voIPFragment9 = VoIPFragment.this;
                        voIPFragment9.pinchTranslationY = (-y) / voIPFragment9.pinchScale;
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
                    long currentTimeMillis = System.currentTimeMillis();
                    float f = (x2 * x2) + (y2 * y2);
                    VoIPFragment voIPFragment10 = VoIPFragment.this;
                    float f2 = voIPFragment10.touchSlop;
                    if (f < f2 * f2 && currentTimeMillis - this.pressedTime < 300 && currentTimeMillis - voIPFragment10.lastContentTapTime > 300) {
                        voIPFragment10.lastContentTapTime = System.currentTimeMillis();
                        if (VoIPFragment.this.emojiExpanded) {
                            VoIPFragment.this.expandEmoji(false);
                        } else if (VoIPFragment.this.canHideUI) {
                            VoIPFragment voIPFragment11 = VoIPFragment.this;
                            voIPFragment11.showUi(!voIPFragment11.uiVisible);
                            VoIPFragment voIPFragment12 = VoIPFragment.this;
                            voIPFragment12.previousState = voIPFragment12.currentState;
                            VoIPFragment.this.updateViewState();
                        }
                    }
                    this.check = false;
                }
                return VoIPFragment.this.canZoomGesture || this.check;
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (view == VoIPFragment.this.callingUserPhotoView) {
                    VoIPFragment voIPFragment = VoIPFragment.this;
                    if (voIPFragment.currentUserIsVideo || voIPFragment.callingUserIsVideo) {
                        return false;
                    }
                }
                if ((view == VoIPFragment.this.callingUserPhotoView || view == VoIPFragment.this.callingUserTextureView || (view == VoIPFragment.this.currentUserCameraFloatingLayout && VoIPFragment.this.currentUserCameraIsFullscreen)) && (VoIPFragment.this.zoomStarted || VoIPFragment.this.zoomBackAnimator != null)) {
                    canvas.save();
                    VoIPFragment voIPFragment2 = VoIPFragment.this;
                    float f = voIPFragment2.pinchScale;
                    canvas.scale(f, f, voIPFragment2.pinchCenterX, VoIPFragment.this.pinchCenterY);
                    canvas.translate(VoIPFragment.this.pinchTranslationX, VoIPFragment.this.pinchTranslationY);
                    boolean drawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return drawChild;
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
        frameLayout.setFitsSystemWindows(true);
        this.callingUserPhotoView = new BackupImageView(this, context) {
            int blackoutColor = ColorUtils.setAlphaComponent(-16777216, 76);

            @Override
            public void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                canvas.drawColor(this.blackoutColor);
            }
        };
        VoIPTextureView voIPTextureView = new VoIPTextureView(context, false, true, false, false);
        this.callingUserTextureView = voIPTextureView;
        TextureViewRenderer textureViewRenderer = voIPTextureView.renderer;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        textureViewRenderer.setScalingType(scalingType);
        this.callingUserTextureView.renderer.setEnableHardwareScaler(true);
        this.callingUserTextureView.renderer.setRotateTextureWithScreen(true);
        this.callingUserTextureView.scaleType = VoIPTextureView.SCALE_TYPE_FIT;
        frameLayout.addView(this.callingUserPhotoView);
        frameLayout.addView(this.callingUserTextureView);
        BackgroundGradientDrawable backgroundGradientDrawable = new BackgroundGradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-14994098, -14328963});
        backgroundGradientDrawable.startDithering(BackgroundGradientDrawable.Sizes.ofDeviceScreen(BackgroundGradientDrawable.Sizes.Orientation.PORTRAIT), new BackgroundGradientDrawable.ListenerAdapter() {
            @Override
            public void onAllSizesReady() {
                VoIPFragment.this.callingUserPhotoView.invalidate();
            }
        });
        VoIPOverlayBackground voIPOverlayBackground = new VoIPOverlayBackground(context);
        this.overlayBackground = voIPOverlayBackground;
        voIPOverlayBackground.setVisibility(8);
        this.callingUserPhotoView.getImageReceiver().setDelegate(new ImageReceiver.ImageReceiverDelegate() {
            @Override
            public final void didSetImage(ImageReceiver imageReceiver, boolean z2, boolean z3, boolean z4) {
                VoIPFragment.this.lambda$createView$4(imageReceiver, z2, z3, z4);
            }

            @Override
            public void onAnimationReady(ImageReceiver imageReceiver) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
            }
        });
        this.callingUserPhotoView.setImage(ImageLocation.getForUserOrChat(this.callingUser, 0), (String) null, backgroundGradientDrawable, this.callingUser);
        VoIPFloatingLayout voIPFloatingLayout = new VoIPFloatingLayout(context);
        this.currentUserCameraFloatingLayout = voIPFloatingLayout;
        voIPFloatingLayout.setDelegate(new VoIPFloatingLayout.VoIPFloatingLayoutDelegate() {
            @Override
            public final void onChange(float f, boolean z2) {
                VoIPFragment.this.lambda$createView$5(f, z2);
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
                VoIPFragment.this.lambda$createView$6(view);
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
        View view = new View(context);
        view.setBackgroundColor(-14999773);
        this.callingUserMiniFloatingLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f));
        this.callingUserMiniFloatingLayout.addView(this.callingUserMiniTextureRenderer, LayoutHelper.createFrame(-1, -2, 17));
        this.callingUserMiniFloatingLayout.setOnTapListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                VoIPFragment.this.lambda$createView$7(view2);
            }
        });
        this.callingUserMiniFloatingLayout.setVisibility(8);
        frameLayout.addView(this.currentUserCameraFloatingLayout, LayoutHelper.createFrame(-2, -2.0f));
        frameLayout.addView(this.callingUserMiniFloatingLayout);
        frameLayout.addView(this.overlayBackground);
        View view2 = new View(context);
        this.bottomShadow = view2;
        view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, ColorUtils.setAlphaComponent(-16777216, 127)}));
        frameLayout.addView(this.bottomShadow, LayoutHelper.createFrame(-1, 140, 80));
        View view3 = new View(context);
        this.topShadow = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{ColorUtils.setAlphaComponent(-16777216, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu), 0}));
        frameLayout.addView(this.topShadow, LayoutHelper.createFrame(-1, 140, 48));
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
        this.emojiLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                VoIPFragment.this.lambda$createView$8(view4);
            }
        });
        TextView textView = new TextView(context);
        this.emojiRationalTextView = textView;
        textView.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, UserObject.getFirstName(this.callingUser)));
        this.emojiRationalTextView.setTextSize(1, 16.0f);
        this.emojiRationalTextView.setTextColor(-1);
        this.emojiRationalTextView.setGravity(17);
        this.emojiRationalTextView.setVisibility(8);
        int i = 0;
        while (i < 4) {
            this.emojiViews[i] = new ImageView(context);
            this.emojiViews[i].setScaleType(ImageView.ScaleType.FIT_XY);
            this.emojiLayout.addView(this.emojiViews[i], LayoutHelper.createLinear(22, 22, i == 0 ? 0.0f : 4.0f, 0.0f, 0.0f, 0.0f));
            i++;
        }
        LinearLayout linearLayout2 = new LinearLayout(context) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                CharSequence text = VoIPFragment.this.callingUserTitle.getText();
                if (sharedInstance == null || TextUtils.isEmpty(text)) {
                    return;
                }
                StringBuilder sb = new StringBuilder(text);
                sb.append(", ");
                TLRPC$PhoneCall tLRPC$PhoneCall = sharedInstance.privateCall;
                if (tLRPC$PhoneCall != null && tLRPC$PhoneCall.video) {
                    sb.append(LocaleController.getString("VoipInVideoCallBranding", R.string.VoipInVideoCallBranding));
                } else {
                    sb.append(LocaleController.getString("VoipInCallBranding", R.string.VoipInCallBranding));
                }
                long callDuration = sharedInstance.getCallDuration();
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
        BackupImageView backupImageView = new BackupImageView(context);
        this.callingUserPhotoViewMini = backupImageView;
        backupImageView.setImage(ImageLocation.getForUserOrChat(this.callingUser, 1), (String) null, Theme.createCircleDrawable(AndroidUtilities.dp(135.0f), -16777216), this.callingUser);
        this.callingUserPhotoViewMini.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
        this.callingUserPhotoViewMini.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.callingUserTitle = textView2;
        textView2.setTextSize(1, 24.0f);
        TLRPC$User tLRPC$User = this.callingUser;
        this.callingUserTitle.setText(Emoji.replaceEmoji((CharSequence) ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name), this.callingUserTitle.getPaint().getFontMetricsInt(), AndroidUtilities.dp(20.0f), false));
        this.callingUserTitle.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(0.6666667f), 1275068416);
        this.callingUserTitle.setTextColor(-1);
        this.callingUserTitle.setGravity(1);
        this.callingUserTitle.setImportantForAccessibility(2);
        this.statusLayout.addView(this.callingUserTitle, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 6));
        VoIPStatusTextView voIPStatusTextView = new VoIPStatusTextView(context);
        this.statusTextView = voIPStatusTextView;
        ViewCompat.setImportantForAccessibility(voIPStatusTextView, 4);
        this.statusLayout.addView(this.statusTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 6));
        this.statusLayout.setClipChildren(false);
        this.statusLayout.setClipToPadding(false);
        this.statusLayout.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
        frameLayout.addView(this.callingUserPhotoViewMini, LayoutHelper.createFrame(135, 135.0f, 1, 0.0f, 68.0f, 0.0f, 0.0f));
        frameLayout.addView(this.statusLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 68.0f, 0.0f, 0.0f));
        frameLayout.addView(this.emojiLayout, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 17.0f, 0.0f, 0.0f));
        frameLayout.addView(this.emojiRationalTextView, LayoutHelper.createFrame(-1, -2.0f, 17, 24.0f, 32.0f, 24.0f, 0.0f));
        this.buttonsLayout = new VoIPButtonsLayout(context);
        for (int i2 = 0; i2 < 4; i2++) {
            this.bottomButtons[i2] = new VoIPToggleButton(context);
            this.buttonsLayout.addView(this.bottomButtons[i2]);
        }
        AcceptDeclineView acceptDeclineView = new AcceptDeclineView(context);
        this.acceptDeclineView = acceptDeclineView;
        acceptDeclineView.setListener(new AcceptDeclineView.Listener() {
            @Override
            public void onAccept() {
                if (VoIPFragment.this.currentState == 17) {
                    Intent intent = new Intent(VoIPFragment.this.activity, VoIPService.class);
                    intent.putExtra("user_id", VoIPFragment.this.callingUser.id);
                    intent.putExtra("is_outgoing", true);
                    intent.putExtra("start_incall_activity", false);
                    intent.putExtra("video_call", VoIPFragment.this.isVideoCall);
                    intent.putExtra("can_video_call", VoIPFragment.this.isVideoCall);
                    intent.putExtra("account", VoIPFragment.this.currentAccount);
                    try {
                        VoIPFragment.this.activity.startService(intent);
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                } else if (Build.VERSION.SDK_INT >= 23 && VoIPFragment.this.activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    VoIPFragment.this.activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().acceptIncomingCall();
                    if (VoIPFragment.this.currentUserIsVideo) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                    }
                }
            }

            @Override
            public void onDecline() {
                if (VoIPFragment.this.currentState == 17) {
                    VoIPFragment.this.windowView.finish();
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().declineIncomingCall();
                }
            }
        });
        this.acceptDeclineView.setScreenWasWakeup(this.screenWasWakeup);
        frameLayout.addView(this.buttonsLayout, LayoutHelper.createFrame(-1, -2, 80));
        frameLayout.addView(this.acceptDeclineView, LayoutHelper.createFrame(-1, 186, 80));
        ImageView imageView = new ImageView(context);
        this.backIcon = imageView;
        imageView.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(-1, 76)));
        this.backIcon.setImageResource(R.drawable.ic_ab_back);
        this.backIcon.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        this.backIcon.setContentDescription(LocaleController.getString("Back", R.string.Back));
        frameLayout.addView(this.backIcon, LayoutHelper.createFrame(56, 56, 51));
        ImageView imageView2 = new ImageView(this, context) {
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
        this.speakerPhoneIcon = imageView2;
        imageView2.setContentDescription(LocaleController.getString("VoipSpeaker", R.string.VoipSpeaker));
        this.speakerPhoneIcon.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(-1, 76)));
        this.speakerPhoneIcon.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.addView(this.speakerPhoneIcon, LayoutHelper.createFrame(56, 56, 53));
        this.speakerPhoneIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                VoIPFragment.this.lambda$createView$9(view4);
            }
        });
        this.backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                VoIPFragment.this.lambda$createView$10(view4);
            }
        });
        if (this.windowView.isLockOnScreen()) {
            this.backIcon.setVisibility(8);
        }
        VoIPNotificationsLayout voIPNotificationsLayout = new VoIPNotificationsLayout(context);
        this.notificationsLayout = voIPNotificationsLayout;
        voIPNotificationsLayout.setGravity(80);
        this.notificationsLayout.setOnViewsUpdated(new Runnable() {
            @Override
            public final void run() {
                VoIPFragment.this.lambda$createView$11();
            }
        });
        frameLayout.addView(this.notificationsLayout, LayoutHelper.createFrame(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        HintView hintView = new HintView(context, 4);
        this.tapToVideoTooltip = hintView;
        hintView.setText(LocaleController.getString("TapToTurnCamera", R.string.TapToTurnCamera));
        frameLayout.addView(this.tapToVideoTooltip, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 8.0f));
        this.tapToVideoTooltip.setBottomOffset(AndroidUtilities.dp(4.0f));
        this.tapToVideoTooltip.setVisibility(8);
        updateViewState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!this.isVideoCall) {
                TLRPC$PhoneCall tLRPC$PhoneCall = sharedInstance.privateCall;
                if (tLRPC$PhoneCall != null && tLRPC$PhoneCall.video) {
                    z = true;
                }
                this.isVideoCall = z;
            }
            initRenderers();
        }
        return frameLayout;
    }

    public void lambda$createView$4(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (bitmapSafe != null) {
            this.overlayBackground.setBackground(bitmapSafe);
        }
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
        if (this.emojiLoaded) {
            expandEmoji(!this.emojiExpanded);
        }
    }

    public void lambda$createView$9(View view) {
        if (this.speakerPhoneIcon.getTag() == null || VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(this.activity, false);
    }

    public void lambda$createView$10(View view) {
        if (this.lockOnScreen) {
            return;
        }
        onBackPressed();
    }

    public void lambda$createView$11() {
        this.previousState = this.currentState;
        updateViewState();
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
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.zoomBackAnimator = ofFloat;
            final float f = this.pinchScale;
            final float f2 = this.pinchTranslationX;
            final float f3 = this.pinchTranslationY;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    VoIPFragment.this.lambda$finishZoom$12(f, f2, f3, valueAnimator);
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

    public void lambda$finishZoom$12(float f, float f2, float f3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.pinchScale = (f * floatValue) + ((1.0f - floatValue) * 1.0f);
        this.pinchTranslationX = f2 * floatValue;
        this.pinchTranslationY = f3 * floatValue;
        this.fragmentView.invalidate();
    }

    public class AnonymousClass10 implements RendererCommon.RendererEvents {
        @Override
        public void onFrameResolutionChanged(int i, int i2, int i3) {
        }

        AnonymousClass10() {
        }

        public void lambda$onFirstFrameRendered$0() {
            VoIPFragment.this.updateViewState();
        }

        @Override
        public void onFirstFrameRendered() {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    VoIPFragment.AnonymousClass10.this.lambda$onFirstFrameRendered$0();
                }
            });
        }
    }

    private void initRenderers() {
        this.currentUserTextureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new AnonymousClass10());
        this.callingUserTextureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new AnonymousClass11(), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.callingUserMiniTextureRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public class AnonymousClass11 implements RendererCommon.RendererEvents {
        @Override
        public void onFrameResolutionChanged(int i, int i2, int i3) {
        }

        AnonymousClass11() {
        }

        public void lambda$onFirstFrameRendered$0() {
            VoIPFragment.this.updateViewState();
        }

        @Override
        public void onFirstFrameRendered() {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    VoIPFragment.AnonymousClass11.this.lambda$onFirstFrameRendered$0();
                }
            });
        }
    }

    public void switchToPip() {
        WindowInsets windowInsets;
        WindowInsets windowInsets2;
        if (this.isFinished || !AndroidUtilities.checkInlinePermissions(this.activity) || instance == null) {
            return;
        }
        this.isFinished = true;
        if (VoIPService.getSharedInstance() != null) {
            int measuredHeight = instance.windowView.getMeasuredHeight();
            int i = Build.VERSION.SDK_INT;
            if (i >= 20 && (windowInsets2 = instance.lastInsets) != null) {
                measuredHeight -= windowInsets2.getSystemWindowInsetBottom();
            }
            VoIPFragment voIPFragment = instance;
            VoIPPiPView.show(voIPFragment.activity, voIPFragment.currentAccount, voIPFragment.windowView.getMeasuredWidth(), measuredHeight, 1);
            if (i >= 20 && (windowInsets = instance.lastInsets) != null) {
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
        this.emojiLayout.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.statusLayout.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.buttonsLayout.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.bottomShadow.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.topShadow.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.callingUserMiniFloatingLayout.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.notificationsLayout.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        VoIPPiPView.switchingToPip = true;
        this.switchingToPip = true;
        Animator createPiPTransition = createPiPTransition(false);
        this.notificationsLocker.lock();
        createPiPTransition.addListener(new AnonymousClass12());
        createPiPTransition.setDuration(350L);
        createPiPTransition.setInterpolator(cubicBezierInterpolator);
        createPiPTransition.start();
    }

    public class AnonymousClass12 extends AnimatorListenerAdapter {
        AnonymousClass12() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            VoIPPiPView.getInstance().windowView.setAlpha(1.0f);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    VoIPFragment.AnonymousClass12.this.lambda$onAnimationEnd$0();
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
                VoIPFragment.this.lambda$startTransitionFromPiP$14();
            }
        }, 32L);
    }

    public void lambda$startTransitionFromPiP$14() {
        this.windowView.setAlpha(1.0f);
        this.windowView.invalidate();
        final Animator createPiPTransition = createPiPTransition(true);
        this.backIcon.setAlpha(0.0f);
        this.emojiLayout.setAlpha(0.0f);
        this.statusLayout.setAlpha(0.0f);
        this.buttonsLayout.setAlpha(0.0f);
        this.bottomShadow.setAlpha(0.0f);
        this.topShadow.setAlpha(0.0f);
        this.speakerPhoneIcon.setAlpha(0.0f);
        this.notificationsLayout.setAlpha(0.0f);
        this.callingUserPhotoView.setAlpha(0.0f);
        this.currentUserCameraFloatingLayout.switchingToPip = true;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPFragment.this.lambda$startTransitionFromPiP$13(createPiPTransition);
            }
        }, 32L);
    }

    public void lambda$startTransitionFromPiP$13(Animator animator) {
        VoIPPiPView.switchingToPip = false;
        VoIPPiPView.finish();
        ViewPropertyAnimator duration = this.speakerPhoneIcon.animate().setDuration(150L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        duration.setInterpolator(cubicBezierInterpolator).start();
        this.backIcon.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.emojiLayout.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.statusLayout.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.buttonsLayout.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.bottomShadow.animate().alpha(1.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.topShadow.animate().alpha(1.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.notificationsLayout.animate().alpha(1.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.callingUserPhotoView.animate().alpha(1.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
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
        final float measuredWidth;
        final float measuredHeight;
        final float f;
        final boolean z2;
        float f2;
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
        final float measuredWidth2 = f7 - ((this.callingUserTextureView.getMeasuredWidth() - (this.callingUserTextureView.getMeasuredWidth() * f9)) / 2.0f);
        final float measuredHeight2 = f8 - ((this.callingUserTextureView.getMeasuredHeight() - (this.callingUserTextureView.getMeasuredHeight() * f9)) / 2.0f);
        if (this.callingUserIsVideo) {
            int measuredWidth3 = this.currentUserCameraFloatingLayout.getMeasuredWidth();
            if (!this.currentUserIsVideo || measuredWidth3 == 0) {
                f4 = 1.0f;
                f5 = 1.0f;
                z2 = false;
                f6 = 0.0f;
            } else {
                f6 = (this.windowView.getMeasuredWidth() / measuredWidth3) * f9 * 0.4f;
                f4 = (((f7 - ((this.currentUserCameraFloatingLayout.getMeasuredWidth() - (this.currentUserCameraFloatingLayout.getMeasuredWidth() * f6)) / 2.0f)) + (VoIPPiPView.getInstance().parentWidth * f9)) - ((VoIPPiPView.getInstance().parentWidth * f9) * 0.4f)) - AndroidUtilities.dp(4.0f);
                f5 = (((f8 - ((this.currentUserCameraFloatingLayout.getMeasuredHeight() - (this.currentUserCameraFloatingLayout.getMeasuredHeight() * f6)) / 2.0f)) + (VoIPPiPView.getInstance().parentHeight * f9)) - ((VoIPPiPView.getInstance().parentHeight * f9) * 0.4f)) - AndroidUtilities.dp(4.0f);
                z2 = true;
            }
            measuredWidth = f4;
            measuredHeight = f5;
            f = f6;
        } else {
            measuredWidth = f7 - ((this.currentUserCameraFloatingLayout.getMeasuredWidth() - (this.currentUserCameraFloatingLayout.getMeasuredWidth() * f9)) / 2.0f);
            measuredHeight = f8 - ((this.currentUserCameraFloatingLayout.getMeasuredHeight() - (this.currentUserCameraFloatingLayout.getMeasuredHeight() * f9)) / 2.0f);
            f = f9;
            z2 = true;
        }
        final float dp = this.callingUserIsVideo ? AndroidUtilities.dp(4.0f) : 0.0f;
        final float dp2 = (AndroidUtilities.dp(4.0f) * 1.0f) / f;
        if (this.callingUserIsVideo) {
            f2 = VoIPPiPView.isExpanding() ? 1.0f : 0.0f;
        } else {
            f2 = 1.0f;
        }
        if (z) {
            if (z2) {
                this.currentUserCameraFloatingLayout.setScaleX(f);
                this.currentUserCameraFloatingLayout.setScaleY(f);
                this.currentUserCameraFloatingLayout.setTranslationX(measuredWidth);
                this.currentUserCameraFloatingLayout.setTranslationY(measuredHeight);
                this.currentUserCameraFloatingLayout.setCornerRadius(dp2);
                this.currentUserCameraFloatingLayout.setAlpha(f2);
            }
            this.callingUserTextureView.setScaleX(f9);
            this.callingUserTextureView.setScaleY(f9);
            this.callingUserTextureView.setTranslationX(measuredWidth2);
            this.callingUserTextureView.setTranslationY(measuredHeight2);
            this.callingUserTextureView.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / f9);
            f3 = 0.0f;
            this.callingUserPhotoView.setAlpha(0.0f);
            this.callingUserPhotoView.setScaleX(f9);
            this.callingUserPhotoView.setScaleY(f9);
            this.callingUserPhotoView.setTranslationX(measuredWidth2);
            this.callingUserPhotoView.setTranslationY(measuredHeight2);
        } else {
            f3 = 0.0f;
        }
        float[] fArr = new float[2];
        fArr[0] = z ? 1.0f : 0.0f;
        fArr[1] = z ? 0.0f : 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        if (!z) {
            f3 = 1.0f;
        }
        this.enterTransitionProgress = f3;
        updateSystemBarColors();
        final float f10 = f2;
        final float f11 = f9;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoIPFragment.this.lambda$createPiPTransition$15(z2, scaleX, f, x, measuredWidth, y, measuredHeight, dp, dp2, r13, f10, r15, f11, r17, measuredWidth2, r19, measuredHeight2, valueAnimator);
            }
        });
        return ofFloat;
    }

    public void lambda$createPiPTransition$15(boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f17 = 1.0f - floatValue;
        this.enterTransitionProgress = f17;
        updateSystemBarColors();
        if (z) {
            float f18 = (f * f17) + (f2 * floatValue);
            this.currentUserCameraFloatingLayout.setScaleX(f18);
            this.currentUserCameraFloatingLayout.setScaleY(f18);
            this.currentUserCameraFloatingLayout.setTranslationX((f3 * f17) + (f4 * floatValue));
            this.currentUserCameraFloatingLayout.setTranslationY((f5 * f17) + (f6 * floatValue));
            this.currentUserCameraFloatingLayout.setCornerRadius((f7 * f17) + (f8 * floatValue));
            this.currentUserCameraFloatingLayout.setAlpha((f9 * f17) + (f10 * floatValue));
        }
        float f19 = (f11 * f17) + (f12 * floatValue);
        this.callingUserTextureView.setScaleX(f19);
        this.callingUserTextureView.setScaleY(f19);
        float f20 = (f13 * f17) + (f14 * floatValue);
        float f21 = (f15 * f17) + (f16 * floatValue);
        this.callingUserTextureView.setTranslationX(f20);
        this.callingUserTextureView.setTranslationY(f21);
        this.callingUserTextureView.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f19);
        if (!this.currentUserCameraFloatingLayout.measuredAsFloatingMode) {
            this.currentUserTextureView.setScreenshareMiniProgress(floatValue, false);
        }
        this.windowView.invalidate();
        this.callingUserPhotoView.setScaleX(f19);
        this.callingUserPhotoView.setScaleY(f19);
        this.callingUserPhotoView.setTranslationX(f20);
        this.callingUserPhotoView.setTranslationY(f21);
        this.callingUserPhotoView.setAlpha(f17);
    }

    public void expandEmoji(boolean z) {
        if (this.emojiLoaded && this.emojiExpanded != z && this.uiVisible) {
            this.emojiExpanded = z;
            if (z) {
                AndroidUtilities.runOnUIThread(this.hideUIRunnable);
                this.hideUiRunnableWaiting = false;
                float measuredWidth = (this.windowView.getMeasuredWidth() - AndroidUtilities.dp(128.0f)) / this.emojiLayout.getMeasuredWidth();
                this.emojiLayout.animate().scaleX(measuredWidth).scaleY(measuredWidth).translationY((this.windowView.getHeight() / 2.0f) - this.emojiLayout.getBottom()).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(250L).start();
                this.emojiRationalTextView.animate().setListener(null).cancel();
                if (this.emojiRationalTextView.getVisibility() != 0) {
                    this.emojiRationalTextView.setVisibility(0);
                    this.emojiRationalTextView.setAlpha(0.0f);
                }
                this.emojiRationalTextView.animate().alpha(1.0f).setDuration(150L).start();
                this.overlayBackground.animate().setListener(null).cancel();
                if (this.overlayBackground.getVisibility() != 0) {
                    this.overlayBackground.setVisibility(0);
                    this.overlayBackground.setAlpha(0.0f);
                    this.overlayBackground.setShowBlackout(this.currentUserIsVideo || this.callingUserIsVideo, false);
                }
                this.overlayBackground.animate().alpha(1.0f).setDuration(150L).start();
                return;
            }
            this.emojiLayout.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(CubicBezierInterpolator.DEFAULT).setDuration(150L).start();
            if (this.emojiRationalTextView.getVisibility() != 8) {
                this.emojiRationalTextView.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (VoIPFragment.this.canHideUI && !VoIPFragment.this.hideUiRunnableWaiting && sharedInstance != null && !sharedInstance.isMicMute()) {
                            AndroidUtilities.runOnUIThread(VoIPFragment.this.hideUIRunnable, 3000L);
                            VoIPFragment.this.hideUiRunnableWaiting = true;
                        }
                        VoIPFragment.this.emojiRationalTextView.setVisibility(8);
                    }
                }).setDuration(150L).start();
                this.overlayBackground.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        VoIPFragment.this.overlayBackground.setVisibility(8);
                    }
                }).setDuration(150L).start();
            }
        }
    }

    public void updateViewState() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.VoIPFragment.updateViewState():void");
    }

    public void lambda$updateViewState$16() {
        this.windowView.finish();
    }

    public void lambda$updateViewState$17(DialogInterface dialogInterface, int i) {
        this.windowView.finish();
    }

    public void lambda$updateViewState$18(boolean[] zArr, DialogInterface dialogInterface, int i) {
        zArr[0] = true;
        this.currentState = 17;
        Intent intent = new Intent(this.activity, VoIPService.class);
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

    public void lambda$updateViewState$19(boolean[] zArr, DialogInterface dialogInterface) {
        if (zArr[0]) {
            return;
        }
        this.windowView.finish();
    }

    public void lambda$updateViewState$20() {
        this.windowView.finish();
    }

    public void lambda$updateViewState$21() {
        this.windowView.finish();
    }

    private void fillNavigationBar(boolean z, boolean z2) {
        if (this.switchingToPip) {
            return;
        }
        if (!z2) {
            ValueAnimator valueAnimator = this.naviagtionBarAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.fillNaviagtionBarValue = z ? 1.0f : 0.0f;
            this.overlayBottomPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) ((z ? 1.0f : 0.5f) * 255.0f)));
        } else if (z != this.fillNaviagtionBar) {
            ValueAnimator valueAnimator2 = this.naviagtionBarAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float[] fArr = new float[2];
            fArr[0] = this.fillNaviagtionBarValue;
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.naviagtionBarAnimator = ofFloat;
            ofFloat.addUpdateListener(this.navigationBarAnimationListener);
            this.naviagtionBarAnimator.setDuration(300L);
            this.naviagtionBarAnimator.setInterpolator(new LinearInterpolator());
            this.naviagtionBarAnimator.start();
        }
        this.fillNaviagtionBar = z;
    }

    public void showUi(boolean z) {
        ValueAnimator valueAnimator = this.uiVisibilityAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z && this.uiVisible) {
            ViewPropertyAnimator duration = this.speakerPhoneIcon.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(50.0f)).setDuration(150L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            this.backIcon.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(50.0f)).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.emojiLayout.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(50.0f)).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.statusLayout.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.buttonsLayout.animate().alpha(0.0f).translationY(AndroidUtilities.dp(50.0f)).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.bottomShadow.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.topShadow.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.uiVisibilityAlpha, 0.0f);
            this.uiVisibilityAnimator = ofFloat;
            ofFloat.addUpdateListener(this.statusbarAnimatorListener);
            this.uiVisibilityAnimator.setDuration(150L).setInterpolator(cubicBezierInterpolator);
            this.uiVisibilityAnimator.start();
            AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
            this.hideUiRunnableWaiting = false;
            this.buttonsLayout.setEnabled(false);
        } else if (z && !this.uiVisible) {
            this.tapToVideoTooltip.hide();
            ViewPropertyAnimator duration2 = this.speakerPhoneIcon.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
            CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
            duration2.setInterpolator(cubicBezierInterpolator2).start();
            this.backIcon.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
            this.emojiLayout.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
            this.statusLayout.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
            this.buttonsLayout.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
            this.bottomShadow.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
            this.topShadow.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.uiVisibilityAlpha, 1.0f);
            this.uiVisibilityAnimator = ofFloat2;
            ofFloat2.addUpdateListener(this.statusbarAnimatorListener);
            this.uiVisibilityAnimator.setDuration(150L).setInterpolator(cubicBezierInterpolator2);
            this.uiVisibilityAnimator.start();
            this.buttonsLayout.setEnabled(true);
        }
        this.uiVisible = z;
        this.windowView.requestFullscreen(!z);
        this.notificationsLayout.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.uiVisible ? AndroidUtilities.dp(80.0f) : 0)).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
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
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.currentUserCameraFloatingLayout, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.currentUserCameraFloatingLayout, View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.currentUserCameraFloatingLayout, View.SCALE_Y, 0.7f, 1.0f));
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
                animatorSet2.playTogether(ObjectAnimator.ofFloat(voIPFloatingLayout2, View.ALPHA, voIPFloatingLayout2.getAlpha(), 0.0f));
                if (this.currentUserCameraFloatingLayout.getTag() != null && ((Integer) this.currentUserCameraFloatingLayout.getTag()).intValue() == 2) {
                    VoIPFloatingLayout voIPFloatingLayout3 = this.currentUserCameraFloatingLayout;
                    Property property = View.SCALE_X;
                    float[] fArr = {voIPFloatingLayout3.getScaleX(), 0.7f};
                    VoIPFloatingLayout voIPFloatingLayout4 = this.currentUserCameraFloatingLayout;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(voIPFloatingLayout3, property, fArr), ObjectAnimator.ofFloat(voIPFloatingLayout4, View.SCALE_Y, voIPFloatingLayout4.getScaleX(), 0.7f));
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
        if (z2) {
            if (z && this.callingUserPhotoViewMini.getTag() == null) {
                this.callingUserPhotoViewMini.animate().setListener(null).cancel();
                this.callingUserPhotoViewMini.setVisibility(0);
                this.callingUserPhotoViewMini.setAlpha(0.0f);
                this.callingUserPhotoViewMini.setTranslationY(-AndroidUtilities.dp(135.0f));
                this.callingUserPhotoViewMini.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            } else if (!z && this.callingUserPhotoViewMini.getTag() != null) {
                this.callingUserPhotoViewMini.animate().setListener(null).cancel();
                this.callingUserPhotoViewMini.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(135.0f)).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).setListener(new AnimatorListenerAdapter() {
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
            this.callingUserPhotoViewMini.setVisibility(z ? 0 : 8);
        }
        this.callingUserPhotoViewMini.setTag(z ? 1 : null);
    }

    private void updateKeyView(boolean z) {
        VoIPService sharedInstance;
        if (this.emojiLoaded || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        byte[] bArr = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(sharedInstance.getEncryptionKey());
            byteArrayOutputStream.write(sharedInstance.getGA());
            bArr = byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
        }
        if (bArr == null) {
            return;
        }
        String[] emojifyForCall = EncryptionKeyEmojifier.emojifyForCall(Utilities.computeSHA256(bArr, 0, bArr.length));
        for (int i = 0; i < 4; i++) {
            Emoji.preloadEmoji(emojifyForCall[i]);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(emojifyForCall[i]);
            if (emojiDrawable != null) {
                emojiDrawable.setBounds(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
                emojiDrawable.preload();
                this.emojiViews[i].setImageDrawable(emojiDrawable);
                this.emojiViews[i].setContentDescription(emojifyForCall[i]);
                this.emojiViews[i].setVisibility(8);
            }
            this.emojiDrawables[i] = emojiDrawable;
        }
        checkEmojiLoaded(z);
    }

    private void checkEmojiLoaded(boolean z) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            Emoji.EmojiDrawable[] emojiDrawableArr = this.emojiDrawables;
            if (emojiDrawableArr[i2] != null && emojiDrawableArr[i2].isLoaded()) {
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
                        this.emojiViews[i3].setTranslationY(AndroidUtilities.dp(30.0f));
                        this.emojiViews[i3].animate().alpha(1.0f).translationY(0.0f).setDuration(200L).setStartDelay(i3 * 20).start();
                    }
                }
            }
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
        if (z && Build.VERSION.SDK_INT >= 19) {
            TransitionSet transitionSet = new TransitionSet();
            Transition duration = new Visibility(this) {
                @Override
                public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, AndroidUtilities.dp(100.0f), 0.0f);
                    if (view instanceof VoIPToggleButton) {
                        view.setTranslationY(AndroidUtilities.dp(100.0f));
                        ofFloat.setStartDelay(((VoIPToggleButton) view).animationDelay);
                    }
                    return ofFloat;
                }

                @Override
                public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                    return ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, view.getTranslationY(), AndroidUtilities.dp(100.0f));
                }
            }.setDuration(150L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            transitionSet.addTransition(duration.setInterpolator(cubicBezierInterpolator)).addTransition(new ChangeBounds().setDuration(150L).setInterpolator(cubicBezierInterpolator));
            transitionSet.excludeChildren(VoIPToggleButton.class, true);
            TransitionManager.beginDelayedTransition(this.buttonsLayout, transitionSet);
        }
        int i = this.currentState;
        if (i == 15 || i == 17) {
            TLRPC$PhoneCall tLRPC$PhoneCall = sharedInstance.privateCall;
            if (tLRPC$PhoneCall != null && tLRPC$PhoneCall.video && i == 15) {
                if (!sharedInstance.isScreencast() && (this.currentUserIsVideo || this.callingUserIsVideo)) {
                    setFrontalCameraAction(this.bottomButtons[0], sharedInstance, z);
                    if (this.uiVisible) {
                        this.speakerPhoneIcon.animate().alpha(1.0f).start();
                    }
                } else {
                    setSpeakerPhoneAction(this.bottomButtons[0], sharedInstance, z);
                    this.speakerPhoneIcon.animate().alpha(0.0f).start();
                }
                setVideoAction(this.bottomButtons[1], sharedInstance, z);
                setMicrophoneAction(this.bottomButtons[2], sharedInstance, z);
            } else {
                this.bottomButtons[0].setVisibility(8);
                this.bottomButtons[1].setVisibility(8);
                this.bottomButtons[2].setVisibility(8);
            }
            this.bottomButtons[3].setVisibility(8);
        } else if (instance == null) {
            return;
        } else {
            if (!sharedInstance.isScreencast() && (this.currentUserIsVideo || this.callingUserIsVideo)) {
                setFrontalCameraAction(this.bottomButtons[0], sharedInstance, z);
                if (this.uiVisible) {
                    this.speakerPhoneIcon.setTag(1);
                    this.speakerPhoneIcon.animate().alpha(1.0f).start();
                }
            } else {
                setSpeakerPhoneAction(this.bottomButtons[0], sharedInstance, z);
                this.speakerPhoneIcon.setTag(null);
                this.speakerPhoneIcon.animate().alpha(0.0f).start();
            }
            setVideoAction(this.bottomButtons[1], sharedInstance, z);
            setMicrophoneAction(this.bottomButtons[2], sharedInstance, z);
            this.bottomButtons[3].setData(R.drawable.calls_decline, -1, -1041108, LocaleController.getString("VoipEndCall", R.string.VoipEndCall), false, z);
            this.bottomButtons[3].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    VoIPFragment.lambda$updateButtons$22(view);
                }
            });
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.bottomButtons[i3].getVisibility() == 0) {
                this.bottomButtons[i3].animationDelay = i2;
                i2 += 16;
            }
        }
        updateSpeakerPhoneIcon();
    }

    public static void lambda$updateButtons$22(View view) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp();
        }
    }

    private void setMicrophoneAction(VoIPToggleButton voIPToggleButton, VoIPService voIPService, boolean z) {
        if (voIPService.isMicMute()) {
            voIPToggleButton.setData(R.drawable.calls_unmute, -16777216, -1, LocaleController.getString("VoipUnmute", R.string.VoipUnmute), true, z);
        } else {
            voIPToggleButton.setData(R.drawable.calls_unmute, -1, ColorUtils.setAlphaComponent(-1, 30), LocaleController.getString("VoipMute", R.string.VoipMute), false, z);
        }
        this.currentUserCameraFloatingLayout.setMuted(voIPService.isMicMute(), z);
        voIPToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                VoIPFragment.this.lambda$setMicrophoneAction$23(view);
            }
        });
    }

    public void lambda$setMicrophoneAction$23(View view) {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            boolean z = !sharedInstance.isMicMute();
            if (this.accessibilityManager.isTouchExplorationEnabled()) {
                if (z) {
                    string = LocaleController.getString("AccDescrVoipMicOff", R.string.AccDescrVoipMicOff);
                } else {
                    string = LocaleController.getString("AccDescrVoipMicOn", R.string.AccDescrVoipMicOn);
                }
                view.announceForAccessibility(string);
            }
            sharedInstance.setMicMute(z, false, true);
            this.previousState = this.currentState;
            updateViewState();
        }
    }

    private void setVideoAction(VoIPToggleButton voIPToggleButton, final VoIPService voIPService, boolean z) {
        if ((this.currentUserIsVideo || this.callingUserIsVideo) ? true : voIPService.isVideoAvailable()) {
            if (this.currentUserIsVideo) {
                voIPToggleButton.setData(voIPService.isScreencast() ? R.drawable.calls_sharescreen : R.drawable.calls_video, -1, ColorUtils.setAlphaComponent(-1, 30), LocaleController.getString("VoipStopVideo", R.string.VoipStopVideo), false, z);
            } else {
                voIPToggleButton.setData(R.drawable.calls_video, -16777216, -1, LocaleController.getString("VoipStartVideo", R.string.VoipStartVideo), true, z);
            }
            voIPToggleButton.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
            voIPToggleButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    VoIPFragment.this.lambda$setVideoAction$25(voIPService, view);
                }
            });
            voIPToggleButton.setEnabled(true);
            return;
        }
        voIPToggleButton.setData(R.drawable.calls_video, ColorUtils.setAlphaComponent(-1, 127), ColorUtils.setAlphaComponent(-1, 30), "Video", false, z);
        voIPToggleButton.setOnClickListener(null);
        voIPToggleButton.setEnabled(false);
    }

    public void lambda$setVideoAction$25(final VoIPService voIPService, View view) {
        TLRPC$PhoneCall tLRPC$PhoneCall;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && this.activity.checkSelfPermission("android.permission.CAMERA") != 0) {
            this.activity.requestPermissions(new String[]{"android.permission.CAMERA"}, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
        } else if (i < 21 && (tLRPC$PhoneCall = voIPService.privateCall) != null && !tLRPC$PhoneCall.video && !this.callingUserIsVideo && !voIPService.sharedUIParams.cameraAlertWasShowed) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.activity);
            builder.setMessage(LocaleController.getString("VoipSwitchToVideoCall", R.string.VoipSwitchToVideoCall));
            builder.setPositiveButton(LocaleController.getString("VoipSwitch", R.string.VoipSwitch), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    VoIPFragment.this.lambda$setVideoAction$24(voIPService, dialogInterface, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            builder.create().show();
        } else {
            toggleCameraInput();
        }
    }

    public void lambda$setVideoAction$24(VoIPService voIPService, DialogInterface dialogInterface, int i) {
        voIPService.sharedUIParams.cameraAlertWasShowed = true;
        toggleCameraInput();
    }

    private void updateSpeakerPhoneIcon() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isBluetoothOn()) {
            this.speakerPhoneIcon.setImageResource(R.drawable.calls_bluetooth);
        } else if (sharedInstance.isSpeakerphoneOn()) {
            this.speakerPhoneIcon.setImageResource(R.drawable.calls_speaker);
        } else if (sharedInstance.isHeadsetPlugged()) {
            this.speakerPhoneIcon.setImageResource(R.drawable.calls_menu_headset);
        } else {
            this.speakerPhoneIcon.setImageResource(R.drawable.calls_menu_phone);
        }
    }

    private void setSpeakerPhoneAction(VoIPToggleButton voIPToggleButton, VoIPService voIPService, boolean z) {
        if (voIPService.isBluetoothOn()) {
            voIPToggleButton.setData(R.drawable.calls_bluetooth, -1, ColorUtils.setAlphaComponent(-1, 30), LocaleController.getString("VoipAudioRoutingBluetooth", R.string.VoipAudioRoutingBluetooth), false, z);
            voIPToggleButton.setChecked(false, z);
        } else if (voIPService.isSpeakerphoneOn()) {
            voIPToggleButton.setData(R.drawable.calls_speaker, -16777216, -1, LocaleController.getString("VoipSpeaker", R.string.VoipSpeaker), false, z);
            voIPToggleButton.setChecked(true, z);
        } else {
            voIPToggleButton.setData(R.drawable.calls_speaker, -1, ColorUtils.setAlphaComponent(-1, 30), LocaleController.getString("VoipSpeaker", R.string.VoipSpeaker), false, z);
            voIPToggleButton.setChecked(false, z);
        }
        voIPToggleButton.setCheckableForAccessibility(true);
        voIPToggleButton.setEnabled(true);
        voIPToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                VoIPFragment.this.lambda$setSpeakerPhoneAction$26(view);
            }
        });
    }

    public void lambda$setSpeakerPhoneAction$26(View view) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(this.activity, false);
        }
    }

    private void setFrontalCameraAction(VoIPToggleButton voIPToggleButton, final VoIPService voIPService, boolean z) {
        if (!this.currentUserIsVideo) {
            voIPToggleButton.setData(R.drawable.calls_flip, ColorUtils.setAlphaComponent(-1, 127), ColorUtils.setAlphaComponent(-1, 30), LocaleController.getString("VoipFlip", R.string.VoipFlip), false, z);
            voIPToggleButton.setOnClickListener(null);
            voIPToggleButton.setEnabled(false);
            return;
        }
        voIPToggleButton.setEnabled(true);
        if (!voIPService.isFrontFaceCamera()) {
            voIPToggleButton.setData(R.drawable.calls_flip, -16777216, -1, LocaleController.getString("VoipFlip", R.string.VoipFlip), false, z);
        } else {
            voIPToggleButton.setData(R.drawable.calls_flip, -1, ColorUtils.setAlphaComponent(-1, 30), LocaleController.getString("VoipFlip", R.string.VoipFlip), false, z);
        }
        voIPToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                VoIPFragment.this.lambda$setFrontalCameraAction$27(voIPService, view);
            }
        });
    }

    public void lambda$setFrontalCameraAction$27(VoIPService voIPService, View view) {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.accessibilityManager.isTouchExplorationEnabled()) {
                if (voIPService.isFrontFaceCamera()) {
                    string = LocaleController.getString("AccDescrVoipCamSwitchedToBack", R.string.AccDescrVoipCamSwitchedToBack);
                } else {
                    string = LocaleController.getString("AccDescrVoipCamSwitchedToFront", R.string.AccDescrVoipCamSwitchedToFront);
                }
                view.announceForAccessibility(string);
            }
            sharedInstance.switchCamera();
        }
    }

    public void onScreenCastStart() {
        PrivateVideoPreviewDialog privateVideoPreviewDialog = this.previewDialog;
        if (privateVideoPreviewDialog == null) {
            return;
        }
        privateVideoPreviewDialog.dismiss(true, true);
    }

    private void toggleCameraInput() {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.accessibilityManager.isTouchExplorationEnabled()) {
                if (!this.currentUserIsVideo) {
                    string = LocaleController.getString("AccDescrVoipCamOn", R.string.AccDescrVoipCamOn);
                } else {
                    string = LocaleController.getString("AccDescrVoipCamOff", R.string.AccDescrVoipCamOff);
                }
                this.fragmentView.announceForAccessibility(string);
            }
            if (!this.currentUserIsVideo) {
                if (Build.VERSION.SDK_INT >= 21) {
                    if (this.previewDialog == null) {
                        sharedInstance.createCaptureDevice(false);
                        if (!sharedInstance.isFrontFaceCamera()) {
                            sharedInstance.switchCamera();
                        }
                        this.windowView.setLockOnScreen(true);
                        PrivateVideoPreviewDialog privateVideoPreviewDialog = new PrivateVideoPreviewDialog(this.fragmentView.getContext(), false, true) {
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
                                    }
                                } else if (sharedInstance2 != null) {
                                    sharedInstance2.setVideoState(false, 0);
                                }
                                VoIPFragment voIPFragment = VoIPFragment.this;
                                voIPFragment.previousState = voIPFragment.currentState;
                                VoIPFragment.this.updateViewState();
                            }
                        };
                        this.previewDialog = privateVideoPreviewDialog;
                        WindowInsets windowInsets = this.lastInsets;
                        if (windowInsets != null) {
                            privateVideoPreviewDialog.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                        }
                        this.fragmentView.addView(this.previewDialog);
                        return;
                    }
                    return;
                }
                this.currentUserIsVideo = true;
                if (!sharedInstance.isSpeakerphoneOn()) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(this.activity, false);
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
            } else {
                this.currentUserTextureView.saveCameraLastBitmap();
                sharedInstance.setVideoState(false, 0);
                if (Build.VERSION.SDK_INT >= 21) {
                    sharedInstance.clearCamera();
                }
            }
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

    @TargetApi(23)
    private void onRequestPermissionsResultInternal(int i, String[] strArr, int[] iArr) {
        if (i == 101) {
            if (VoIPService.getSharedInstance() == null) {
                this.windowView.finish();
                return;
            } else if (iArr.length > 0 && iArr[0] == 0) {
                VoIPService.getSharedInstance().acceptIncomingCall();
            } else if (!this.activity.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                VoIPService.getSharedInstance().declineIncomingCall();
                VoIPHelper.permissionDenied(this.activity, new Runnable() {
                    @Override
                    public final void run() {
                        VoIPFragment.this.lambda$onRequestPermissionsResultInternal$28();
                    }
                }, i);
                return;
            }
        }
        if (i == 102) {
            if (VoIPService.getSharedInstance() == null) {
                this.windowView.finish();
            } else if (iArr.length <= 0 || iArr[0] != 0) {
            } else {
                toggleCameraInput();
            }
        }
    }

    public void lambda$onRequestPermissionsResultInternal$28() {
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
        boolean isScreenOn;
        VoIPService sharedInstance;
        WindowInsets windowInsets;
        WindowInsets windowInsets2;
        PowerManager powerManager = (PowerManager) this.activity.getSystemService("power");
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            isScreenOn = powerManager.isInteractive();
        } else {
            isScreenOn = powerManager.isScreenOn();
        }
        boolean checkInlinePermissions = AndroidUtilities.checkInlinePermissions(this.activity);
        if (this.canSwitchToPip && checkInlinePermissions) {
            int measuredHeight = instance.windowView.getMeasuredHeight();
            if (i >= 20 && (windowInsets2 = instance.lastInsets) != null) {
                measuredHeight -= windowInsets2.getSystemWindowInsetBottom();
            }
            VoIPFragment voIPFragment = instance;
            VoIPPiPView.show(voIPFragment.activity, voIPFragment.currentAccount, voIPFragment.windowView.getMeasuredWidth(), measuredHeight, 0);
            if (i >= 20 && (windowInsets = instance.lastInsets) != null) {
                VoIPPiPView.topInset = windowInsets.getSystemWindowInsetTop();
                VoIPPiPView.bottomInset = instance.lastInsets.getSystemWindowInsetBottom();
            }
        }
        if (this.currentUserIsVideo) {
            if ((checkInlinePermissions && isScreenOn) || (sharedInstance = VoIPService.getSharedInstance()) == null) {
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
        } else {
            this.windowView.finish();
        }
        this.deviceIsLocked = ((KeyguardManager) this.activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    private void showErrorDialog(CharSequence charSequence) {
        if (this.activity.isFinishing()) {
            return;
        }
        AlertDialog show = new DarkAlertDialog.Builder(this.activity).setTitle(LocaleController.getString("VoipFailed", R.string.VoipFailed)).setMessage(charSequence).setPositiveButton(LocaleController.getString("OK", R.string.OK), null).show();
        show.setCanceledOnTouchOutside(true);
        show.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                VoIPFragment.this.lambda$showErrorDialog$29(dialogInterface);
            }
        });
    }

    public void lambda$showErrorDialog$29(DialogInterface dialogInterface) {
        this.windowView.finish();
    }

    @SuppressLint({"InlinedApi"})
    private void requestInlinePermissions() {
        if (Build.VERSION.SDK_INT >= 21) {
            AlertsCreator.createDrawOverlayPermissionDialog(this.activity, new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    VoIPFragment.this.lambda$requestInlinePermissions$30(dialogInterface, i);
                }
            }).show();
        }
    }

    public void lambda$requestInlinePermissions$30(DialogInterface dialogInterface, int i) {
        VoIPWindowView voIPWindowView = this.windowView;
        if (voIPWindowView != null) {
            voIPWindowView.finish();
        }
    }
}
