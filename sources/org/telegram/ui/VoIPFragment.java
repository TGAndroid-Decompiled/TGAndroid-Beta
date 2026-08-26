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
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DiffUtil;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline0;
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
import org.telegram.ui.ActionBar.FloatingToolbar;
import org.telegram.ui.ActionBar.OKLCH;
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
import org.telegram.ui.Components.voip.VoIPTimerView;
import org.telegram.ui.Components.voip.VoIPToggleButton;
import org.telegram.ui.Components.voip.VoIPWindowView;
import org.telegram.ui.Components.voip.VoIpCoverView;
import org.telegram.ui.Components.voip.VoIpCoverView$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.voip.VoIpGradientLayout;
import org.telegram.ui.Components.voip.VoIpGradientLayout$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.voip.VoIpHintView;
import org.telegram.ui.Components.voip.VoIpSnowView;
import org.telegram.ui.Components.voip.VoIpSwitchLayout;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda9;
import org.telegram.ui.Stories.recorder.HintView2;
import org.webrtc.EglBase;
import org.webrtc.GlRectDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;

public class VoIPFragment implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, IPipSourceDelegate {
    private static final int STATE_FLOATING = 2;
    private static final int STATE_FULLSCREEN = 1;
    private static final int STATE_GONE = 0;
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
    ValueAnimator.AnimatorUpdateListener statusbarAnimatorListener = new QrActivity$$ExternalSyntheticLambda8(this, 23);
    Runnable hideUIRunnable = new VoIPFragment$$ExternalSyntheticLambda1(this, 13);
    Runnable stopAnimatingBgRunnable = new VoIPFragment$$ExternalSyntheticLambda1(this, 1);
    float pinchScale = 1.0f;

    public class AnonymousClass12 implements RendererCommon.RendererEvents {
        public AnonymousClass12() {
        }

        public void lambda$onFirstFrameRendered$0() {
            VoIPFragment.this.updateViewState();
        }

        @Override
        public void onFirstFrameRendered() {
            AndroidUtilities.runOnUIThread(new VoIPFragment$8$$ExternalSyntheticLambda1(this, 17));
        }

        @Override
        public void onFrameResolutionChanged(int i, int i2, int i3) {
        }
    }

    public class AnonymousClass13 implements RendererCommon.RendererEvents {
        public AnonymousClass13() {
        }

        public void lambda$onFirstFrameRendered$0() {
            VoIPFragment.this.updateViewState();
        }

        @Override
        public void onFirstFrameRendered() {
            if (VoIPFragment.this.firstFrameCallback != null) {
                VoIPFragment.this.firstFrameCallback.run();
                VoIPFragment.this.firstFrameCallback = null;
            }
            AndroidUtilities.runOnUIThread(new VoIPFragment$8$$ExternalSyntheticLambda1(this, 18));
        }

        @Override
        public void onFrameResolutionChanged(int i, int i2, int i3) {
        }
    }

    public class AnonymousClass14 extends AnimatorListenerAdapter {
        public AnonymousClass14() {
        }

        public void lambda$onAnimationEnd$0() {
            VoIPFragment.this.notificationsLocker.unlock();
            VoIPPiPView.instance.getClass();
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().swapSinks();
            }
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

        @Override
        public void onAnimationEnd(Animator animator) {
            VoIPPiPView.instance.windowView.setAlpha(1.0f);
            AndroidUtilities.runOnUIThread(new VoIPFragment$8$$ExternalSyntheticLambda1(this, 19), 200L);
        }
    }

    public class AnonymousClass8 implements AcceptDeclineView.Listener {
        public AnonymousClass8() {
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
        public void onAccept() {
            if (VoIPFragment.this.currentState != 17) {
                if (Build.VERSION.SDK_INT >= 23 && VoIPFragment.this.activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    VoIPFragment.this.activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                    return;
                } else {
                    if (VoIPService.getSharedState() != null) {
                        VoIPFragment.this.runAcceptCallAnimation(new VoIPFragment$8$$ExternalSyntheticLambda1(this, 0));
                        return;
                    }
                    return;
                }
            }
            Intent intent = new Intent(VoIPFragment.this.activity, (Class<?>) VoIPService.class);
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
        }

        @Override
        public void onDecline() {
            if (VoIPFragment.this.currentState == 17) {
                VoIPFragment.this.windowView.finish();
            } else if (VoIPService.getSharedState() != null) {
                VoIPService.getSharedState().declineIncomingCall();
            } else {
                VoIPFragment.this.windowView.finish();
            }
        }
    }

    public static class ConferenceParticipantsView extends View {
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

        @Override
        public void onDraw(Canvas canvas) {
            if (this.text == null) {
                return;
            }
            float currentWidth = this.text.getCurrentWidth() + this.avatarsDrawable.getUsedWidth() + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(13.0f);
            float fDp = AndroidUtilities.dp(30.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - currentWidth) / 2.0f, 0.0f, (getWidth() + currentWidth) / 2.0f, getHeight());
            float f = fDp / 2.0f;
            canvas.drawRoundRect(rectF, f, f, this.backgroundPaint);
            canvas.save();
            canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
            this.avatarsDrawable.onDraw(canvas);
            canvas.translate(this.avatarsDrawable.getMaxX() + AndroidUtilities.dp(7.0f), 0.0f);
            this.text.draw(canvas, 0.0f, f, -1, 1.0f);
            canvas.restore();
        }

        @Override
        public void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(30.0f));
        }

        public void set(int i, long j, ArrayList<TLRPC.GroupCallParticipant> arrayList, int i2) {
            if (arrayList == null && i2 <= 0) {
                setVisibility(8);
                return;
            }
            int iMax = Math.max(i2, arrayList == null ? 0 : arrayList.size());
            int iMin = Math.min(3, arrayList == null ? 0 : arrayList.size());
            this.avatarsDrawable.setCount(iMin);
            for (int i3 = 0; i3 < iMin; i3++) {
                this.avatarsDrawable.setObject(i3, i, MessagesController.getInstance(i).getUserOrChat(DialogObject.getPeerDialogId(arrayList.get(i3).peer)));
            }
            this.avatarsDrawable.commitTransition(false);
            if (iMax == 1 && (arrayList == null || arrayList.size() == 0 || (arrayList.size() == 1 && DialogObject.getPeerDialogId(arrayList.get(0).peer) == j))) {
                setVisibility(8);
                return;
            }
            this.text = new Text(LocaleController.formatPluralStringComma("Participants", iMax), 14.0f, AndroidUtilities.bold());
            setVisibility(0);
            invalidate();
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
                        OKLCH.m(this.emojiViews[i3].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), CubicBezierInterpolator.EASE_OUT_BACK, 250L);
                    }
                }
            }
            this.encryptionTooltip.postDelayed(new VoIPFragment$$ExternalSyntheticLambda1(this, 0), 1000L);
        }
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
                        instance.lastInsets.getSystemWindowInsetBottom();
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
            userSelectorBottomSheet.lambda$showGiftOfferSheet$15();
            this.addPeopleSheet = null;
        }
    }

    public void expandEmoji(boolean z) {
        if (this.emojiLoaded && this.emojiExpanded != z && this.uiVisible) {
            this.emojiExpanded = z;
            VoIpCoverView voIpCoverView = this.voIpCoverView;
            if (voIpCoverView.allowAnimations && z != voIpCoverView.isEmojiExpanded) {
                voIpCoverView.isEmojiExpanded = z;
                ValueAnimator valueAnimatorOfFloat = z ? ValueAnimator.ofFloat(0.0f, 1.0f) : ValueAnimator.ofFloat(1.0f, 0.0f);
                voIpCoverView.positionAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new VoIpCoverView$$ExternalSyntheticLambda0(voIpCoverView, 1));
                voIpCoverView.positionAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                voIpCoverView.positionAnimator.setDuration(200L);
                voIpCoverView.positionAnimator.start();
            }
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
                OKLCH.m(viewPropertyAnimatorTranslationY, cubicBezierInterpolator, 400L);
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

    public void finishZoom() {
        VoIPFragment voIPFragment;
        if (this.zoomStarted) {
            this.zoomStarted = false;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.zoomBackAnimator = valueAnimatorOfFloat;
            voIPFragment = this;
            valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda31(voIPFragment, this.pinchScale, this.pinchTranslationX, this.pinchTranslationY, 0));
            voIPFragment.zoomBackAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    VoIPFragment voIPFragment2 = VoIPFragment.this;
                    voIPFragment2.zoomBackAnimator = null;
                    voIPFragment2.pinchScale = 1.0f;
                    voIPFragment2.pinchTranslationX = 0.0f;
                    VoIPFragment.this.pinchTranslationY = 0.0f;
                    VoIPFragment.this.fragmentView.invalidate();
                }
            });
            voIPFragment.zoomBackAnimator.setDuration(350L);
            voIPFragment.zoomBackAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            voIPFragment.zoomBackAnimator.start();
        } else {
            voIPFragment = this;
        }
        voIPFragment.canZoomGesture = false;
        voIPFragment.isInPinchToZoomTouchMode = false;
    }

    public VoIPTextureView getFullscreenTextureView() {
        return this.callingUserIsVideo ? this.callingUserTextureView : this.currentUserTextureView;
    }

    public static VoIPFragment getInstance() {
        return instance;
    }

    private void initRenderers() {
        this.currentUserTextureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new AnonymousClass12());
        this.callingUserTextureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new AnonymousClass13(), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.callingUserMiniTextureRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
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

    public void lambda$checkEmojiLoaded$34() {
        if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
            SharedConfig.incrementCallEncryptionHintDisplayed(1);
            this.encryptionTooltip.setTranslationY(this.emojiLayout.getY() + AndroidUtilities.dp(36.0f));
            this.encryptionTooltip.show();
        }
    }

    public void lambda$createPiPTransition$20(boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f17 = 1.0f - fFloatValue;
        this.enterTransitionProgress = f17;
        updateSystemBarColors();
        if (z) {
            float f18 = (f2 * fFloatValue) + (f * f17);
            this.currentUserCameraFloatingLayout.setScaleX(f18);
            this.currentUserCameraFloatingLayout.setScaleY(f18);
            this.currentUserCameraFloatingLayout.setTranslationX((f4 * fFloatValue) + (f3 * f17));
            this.currentUserCameraFloatingLayout.setTranslationY((f6 * fFloatValue) + (f5 * f17));
            this.currentUserCameraFloatingLayout.setCornerRadius((f8 * fFloatValue) + (f7 * f17));
            this.currentUserCameraFloatingLayout.setAlpha((f10 * fFloatValue) + (f9 * f17));
        }
        float f19 = (f12 * fFloatValue) + (f11 * f17);
        this.callingUserTextureView.setScaleX(f19);
        this.callingUserTextureView.setScaleY(f19);
        this.callingUserTextureView.setTranslationX((f14 * fFloatValue) + (f13 * f17));
        this.callingUserTextureView.setTranslationY((f16 * fFloatValue) + (f15 * f17));
        this.callingUserTextureView.setRoundCorners(((AndroidUtilities.dp(4.0f) * fFloatValue) * 1.0f) / f19);
        if (!this.currentUserCameraFloatingLayout.measuredAsFloatingMode) {
            this.currentUserTextureView.setScreenshareMiniProgress(fFloatValue, false);
        }
        this.windowView.invalidate();
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

    public static void lambda$createView$12(Boolean bool, HashSet hashSet) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.convertToConferenceCall(bool.booleanValue(), hashSet);
        }
    }

    public void lambda$createView$13(Context context, View view) {
        if (this.lockOnScreen) {
            return;
        }
        UserSelectorBottomSheet userSelectorBottomSheet = this.addPeopleSheet;
        if (userSelectorBottomSheet != null) {
            userSelectorBottomSheet.lambda$showGiftOfferSheet$15();
            this.addPeopleSheet = null;
        }
        UserSelectorBottomSheet userSelectorBottomSheet2 = new UserSelectorBottomSheet(context, this.currentAccount, null, 4, new DarkBlueThemeResourcesProvider());
        TLRPC.User user = this.currentUser;
        long j = user != null ? user.id : 0L;
        TLRPC.User user2 = this.callingUser;
        long[] jArr = {j, user2 != null ? user2.id : 0L};
        for (int i = 0; i < 2; i++) {
            userSelectorBottomSheet2.excludeUserIds.add(Long.valueOf(jArr[i]));
        }
        userSelectorBottomSheet2.updateItems(false, true);
        userSelectorBottomSheet2.onUsersSelectedListener = new VoIPFragment$$ExternalSyntheticLambda11();
        this.addPeopleSheet = userSelectorBottomSheet2;
        userSelectorBottomSheet2.show();
    }

    public void lambda$createView$14() {
        this.previousState = this.currentState;
        updateViewState();
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

    public void lambda$finishZoom$17(float f, float f2, float f3, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.pinchScale = DiffUtil.m(1.0f, fFloatValue, 1.0f, f * fFloatValue);
        this.pinchTranslationX = f2 * fFloatValue;
        this.pinchTranslationY = f3 * fFloatValue;
        this.fragmentView.invalidate();
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
            VoIpGradientLayout voIpGradientLayout = this.gradientLayout;
            if (voIpGradientLayout.isPaused) {
                return;
            }
            voIpGradientLayout.isPaused = true;
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

    public void lambda$onSignalBarsCountChanged$4(int i) {
        this.statusTextView.setSignalBarCount(i);
        if (i <= 1) {
            VoIpGradientLayout voIpGradientLayout = this.gradientLayout;
            if (voIpGradientLayout.state != 3) {
                voIpGradientLayout.state = 3;
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(voIpGradientLayout.alphaOrangeRed, 255);
                voIpGradientLayout.badConnectionAnimator = valueAnimatorOfInt;
                valueAnimatorOfInt.addUpdateListener(new VoIpGradientLayout$$ExternalSyntheticLambda0(voIpGradientLayout, 2));
                voIpGradientLayout.badConnectionAnimator.setDuration(500L);
                voIpGradientLayout.badConnectionAnimator.start();
            }
            this.statusTextView.showBadConnection(true);
            return;
        }
        VoIpGradientLayout voIpGradientLayout2 = this.gradientLayout;
        if (voIpGradientLayout2.state != 2) {
            voIpGradientLayout2.state = 2;
            voIpGradientLayout2.switchToConnectedAnimator();
            ValueAnimator valueAnimator = voIpGradientLayout2.badConnectionAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                voIpGradientLayout2.badConnectionAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(voIpGradientLayout2.alphaOrangeRed, 0);
            voIpGradientLayout2.badConnectionAnimator = valueAnimatorOfInt2;
            valueAnimatorOfInt2.addUpdateListener(new VoIpGradientLayout$$ExternalSyntheticLambda0(voIpGradientLayout2, 0));
            voIpGradientLayout2.badConnectionAnimator.setDuration(500L);
            voIpGradientLayout2.badConnectionAnimator.start();
        }
        this.statusTextView.showBadConnection(false);
    }

    public void lambda$replaceEmojiToLottieFrame$44(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        updateKeyView(true);
    }

    public void lambda$requestInlinePermissions$43(AlertDialog alertDialog, int i) {
        VoIPWindowView voIPWindowView = this.windowView;
        if (voIPWindowView != null) {
            voIPWindowView.finish();
        }
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
        this.bottomSpeakerBtn.setTranslationX(AndroidUtilities.dp(42.0f) + (i - iArr[0]));
        this.bottomSpeakerBtn.setTranslationY(AndroidUtilities.dp(44.0f) + (i2 - iArr[1]));
        this.bottomMuteBtn.getLocationOnScreen(iArr);
        this.bottomMuteBtn.setTranslationX(AndroidUtilities.dp(42.0f) + (i - iArr[0]));
        this.bottomMuteBtn.setTranslationY(AndroidUtilities.dp(44.0f) + (i2 - iArr[1]));
        this.bottomVideoBtn.getLocationOnScreen(iArr);
        this.bottomVideoBtn.setTranslationX(AndroidUtilities.dp(42.0f) + (i - iArr[0]));
        this.bottomVideoBtn.setTranslationY(AndroidUtilities.dp(44.0f) + (i2 - iArr[1]));
        this.bottomEndCallBtn.getLocationOnScreen(iArr);
        this.bottomEndCallBtn.setTranslationX((((this.acceptDeclineView.getWidth() + i) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
        this.bottomEndCallBtn.setTranslationY(AndroidUtilities.dp(44.0f) + (i2 - iArr[1]));
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

    public void lambda$setFrontalCameraAction$39(VoIPService voIPService, VoIpSwitchLayout voIpSwitchLayout, View view) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
            this.hideUiRunnableWaiting = false;
            if (this.accessibilityManager.isTouchExplorationEnabled()) {
                view.announceForAccessibility(voIPService.isFrontFaceCamera() ? LocaleController.getString(R.string.AccDescrVoipCamSwitchedToBack) : LocaleController.getString(R.string.AccDescrVoipCamSwitchedToFront));
            }
            voIpSwitchLayout.setType(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
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

    public void lambda$setSpeakerPhoneAction$38(int i, VoIpSwitchLayout voIpSwitchLayout, VoIPService voIPService, View view) {
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
            this.hideUiRunnableWaiting = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(this.activity, false, Integer.valueOf(i));
            setSpeakerPhoneAction(voIpSwitchLayout, voIPService, true);
        }
    }

    public void lambda$setVideoAction$37(View view) {
        AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
        this.hideUiRunnableWaiting = false;
        if (Build.VERSION.SDK_INT < 23 || this.activity.checkSelfPermission("android.permission.CAMERA") == 0) {
            toggleCameraInput();
        } else {
            this.activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
        }
    }

    public static WindowInsetsCompat lambda$show$3(VoIPFragment voIPFragment, View view, WindowInsetsCompat windowInsetsCompat) {
        voIPFragment.setInsets(windowInsetsCompat.toWindowInsets());
        return WindowInsetsCompat.CONSUMED;
    }

    public void lambda$showErrorDialog$42(DialogInterface dialogInterface) {
        this.windowView.finish();
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

    public void lambda$startTransitionFromPiP$19() {
        this.windowView.setAlpha(1.0f);
        this.windowView.invalidate();
        Animator animatorCreatePiPTransition = createPiPTransition(true);
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
        AndroidUtilities.runOnUIThread(new ThemeActivity$$ExternalSyntheticLambda9(13, this, animatorCreatePiPTransition), 32L);
    }

    public void lambda$updateButtons$35(View view) {
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
            this.hideUiRunnableWaiting = false;
            VoIPService.getSharedInstance().hangUp();
        }
    }

    public void lambda$updateViewState$21() {
        this.windowView.finish();
    }

    public void lambda$updateViewState$22(VoIPService voIPService, View view) {
        AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda1(this, 2));
        int i = this.selectedRating;
        if (i > 0) {
            voIPService.sendCallRating(i);
        }
    }

    public void lambda$updateViewState$23(VoIPService voIPService) {
        this.endCloseLayout.switchToClose(new VoIPFragment$$ExternalSyntheticLambda18(this, voIPService, 1), true);
    }

    public void lambda$updateViewState$24() {
        this.windowView.finish();
    }

    public void lambda$updateViewState$25(VoIPService voIPService, View view) {
        AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda1(this, 8));
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
        if (!this.canSwitchToPip || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isConverting() || this.lockOnScreen) {
            this.windowView.finish();
        } else if (PipUtils.checkPermissions(this.activity) > 0) {
            switchToPip();
        } else {
            requestInlinePermissions();
        }
    }

    public static void onPause() {
        VoIPFragment voIPFragment = instance;
        if (voIPFragment != null) {
            voIPFragment.onPauseInternal();
        }
        VoIPPiPView voIPPiPView = VoIPPiPView.instance;
        if (voIPPiPView == null || voIPPiPView.windowLayoutParams.type != 99) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (voIPPiPView.currentUserIsVideo) {
            sharedInstance.setVideoState(false, 1);
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
                runAcceptCallAnimation(new OAuthSheet$$ExternalSyntheticLambda5(27));
            } else if (!this.activity.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().declineIncomingCall();
                }
                VoIPHelper.permissionDenied(this.activity, i, new VoIPFragment$$ExternalSyntheticLambda1(this, 12));
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

    public static void onResume() {
        VoIPFragment voIPFragment = instance;
        if (voIPFragment != null) {
            voIPFragment.onResumeInternal();
        }
        VoIPPiPView voIPPiPView = VoIPPiPView.instance;
        if (voIPPiPView != null) {
            voIPPiPView.getClass();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance == null || sharedInstance.getVideoState(false) != 1) {
                return;
            }
            sharedInstance.setVideoState(false, 2);
        }
    }

    private void requestInlinePermissions() {
        AlertsCreator.createDrawOverlayPermissionDialog(this.activity, new VoIPFragment$$ExternalSyntheticLambda19(this, 1), true).show();
    }

    public void runAcceptCallAnimation(final Runnable runnable) {
        if (this.bottomVideoBtn.getVisibility() == 0) {
            this.acceptDeclineView.getLocationOnScreen(new int[2]);
            AcceptDeclineView acceptDeclineView = this.acceptDeclineView;
            ValueAnimator valueAnimator = acceptDeclineView.callAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                acceptDeclineView.callAnimator = null;
                acceptDeclineView.acceptVoiceDrawable.stop();
            }
            runnable.run();
            return;
        }
        this.bottomEndCallBtn.animate().cancel();
        this.bottomSpeakerBtn.animate().cancel();
        this.bottomMuteBtn.animate().cancel();
        this.bottomVideoBtn.animate().cancel();
        this.acceptDeclineView.getLocationOnScreen(new int[2]);
        AcceptDeclineView acceptDeclineView2 = this.acceptDeclineView;
        ValueAnimator valueAnimator2 = acceptDeclineView2.callAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            acceptDeclineView2.callAnimator = null;
            acceptDeclineView2.acceptVoiceDrawable.stop();
        }
        this.bottomEndCallBtn.setData(R.drawable.calls_decline, -1, -1041108, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.bottomSpeakerBtn.setType(5, false, false);
        this.bottomMuteBtn.setType(1, false, false);
        this.bottomVideoBtn.setType(3, true, false);
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
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                this.f$0.lambda$runAcceptCallAnimation$15(iDp2, marginEnd, iDp, marginLayoutParams, valueAnimator3);
            }
        });
        AcceptDeclineView acceptDeclineView3 = this.acceptDeclineView;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(acceptDeclineView3, (Property<AcceptDeclineView, Float>) View.SCALE_X, acceptDeclineView3.getScaleX(), 1.0f, 1.0f, 1.0f);
        AcceptDeclineView acceptDeclineView4 = this.acceptDeclineView;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(acceptDeclineView4, (Property<AcceptDeclineView, Float>) View.SCALE_Y, acceptDeclineView4.getScaleY(), 1.0f, 1.0f, 1.0f);
        AcceptDeclineView acceptDeclineView5 = this.acceptDeclineView;
        animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(acceptDeclineView5, (Property<AcceptDeclineView, Float>) View.ALPHA, acceptDeclineView5.getAlpha(), this.acceptDeclineView.getAlpha(), 0.0f, 0.0f));
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
        AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda1(this, 11), 133L);
    }

    private void setFrontalCameraAction(VoIpSwitchLayout voIpSwitchLayout, VoIPService voIPService, boolean z) {
        if (!this.currentUserIsVideo) {
            voIpSwitchLayout.setType(2, false, false);
            voIpSwitchLayout.setOnBtnClickedListener(null);
            voIpSwitchLayout.setEnabled(false);
        } else {
            voIpSwitchLayout.setEnabled(true);
            if (voIPService.isFrontFaceCamera()) {
                voIpSwitchLayout.setType(2, true ^ voIPService.isSwitchingCamera(), false);
            } else {
                voIpSwitchLayout.setType(2, voIPService.isSwitchingCamera(), false);
            }
            voIpSwitchLayout.setOnBtnClickedListener(new WearAuthSheet$$ExternalSyntheticLambda5(this, voIPService, voIpSwitchLayout, 28));
        }
    }

    private void setInsets(WindowInsets windowInsets) {
        this.lastInsets = windowInsets;
        ((FrameLayout.LayoutParams) this.buttonsLayout.getLayoutParams()).bottomMargin = this.lastInsets.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) this.acceptDeclineView.getLayoutParams()).bottomMargin = this.lastInsets.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) this.backIcon.getLayoutParams()).topMargin = this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.addIcon.getLayoutParams()).topMargin = this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.speakerPhoneIcon.getLayoutParams()).topMargin = this.lastInsets.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) this.statusLayout.getLayoutParams()).topMargin = this.lastInsets.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) this.emojiLayout.getLayoutParams()).topMargin = this.lastInsets.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) this.callingUserPhotoViewMini.getLayoutParams()).topMargin = this.lastInsets.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) this.hideEmojiLayout.getLayoutParams()).topMargin = this.lastInsets.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) this.emojiRationalLayout.getLayoutParams()).topMargin = this.lastInsets.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) this.rateCallLayout.getLayoutParams()).topMargin = this.lastInsets.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
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

    private void setMicrohoneAction(VoIpSwitchLayout voIpSwitchLayout, VoIPService voIPService, boolean z) {
        int i = 2;
        voIpSwitchLayout.setType(1, voIPService.isMicMute(), false);
        VoIPFloatingLayout voIPFloatingLayout = this.currentUserCameraFloatingLayout;
        boolean zIsMicMute = voIPService.isMicMute();
        if (z) {
            ValueAnimator valueAnimator = voIPFloatingLayout.mutedAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(voIPFloatingLayout.mutedProgress, zIsMicMute ? 1.0f : 0.0f);
            voIPFloatingLayout.mutedAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(voIPFloatingLayout.mutedUpdateListener);
            voIPFloatingLayout.mutedAnimator.setDuration(150L);
            voIPFloatingLayout.mutedAnimator.start();
        } else {
            ValueAnimator valueAnimator2 = voIPFloatingLayout.mutedAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            voIPFloatingLayout.mutedProgress = zIsMicMute ? 1.0f : 0.0f;
            voIPFloatingLayout.invalidate();
        }
        voIpSwitchLayout.setOnBtnClickedListener(new VoIPFragment$$ExternalSyntheticLambda19(this, i));
    }

    private void setSpeakerPhoneAction(VoIpSwitchLayout voIpSwitchLayout, VoIPService voIPService, boolean z) {
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i = 0;
        if (voIPService.isBluetoothOn()) {
            voIpSwitchLayout.setType(4, false, false);
            i = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            voIpSwitchLayout.setType(5, true, false);
        } else {
            voIpSwitchLayout.setType(5, false, false);
            i = 1;
        }
        voIpSwitchLayout.setEnabled(true);
        voIpSwitchLayout.setOnBtnClickedListener(new VoIPFragment$$ExternalSyntheticLambda6(this, i, voIpSwitchLayout, voIPService));
    }

    public void setVideoAction(VoIpSwitchLayout voIpSwitchLayout, VoIPService voIPService, boolean z) {
        if (!((this.currentUserIsVideo || this.callingUserIsVideo) ? true : voIPService.isVideoAvailable())) {
            voIpSwitchLayout.setType(3, true, false);
            voIpSwitchLayout.setOnClickListener(null);
            voIpSwitchLayout.setEnabled(false);
            return;
        }
        if (!this.currentUserIsVideo) {
            voIpSwitchLayout.setType(3, true, z);
        } else if (voIPService.isScreencast()) {
            voIpSwitchLayout.setType(3, false, z);
        } else {
            voIpSwitchLayout.setType(3, false, z);
        }
        voIpSwitchLayout.setOnBtnClickedListener(new VoIPFragment$$ExternalSyntheticLambda19(this, 6));
        voIpSwitchLayout.setEnabled(true);
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
        boolean z = VoIPPiPView.instance != null;
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
            public void dispatchDraw(Canvas canvas) {
                if (!voIPFragment3.switchingToPip || getAlpha() == 0.0f) {
                    super.dispatchDraw(canvas);
                    return;
                }
                float scaleX = voIPFragment3.callingUserTextureView.getScaleX() * voIPFragment3.callingUserTextureView.getWidth();
                float scaleY = voIPFragment3.callingUserTextureView.getScaleY() * voIPFragment3.callingUserTextureView.getHeight();
                float width = (voIPFragment3.callingUserTextureView.getWidth() - scaleX) / 2.0f;
                float height = (voIPFragment3.callingUserTextureView.getHeight() - scaleY) / 2.0f;
                float x = voIPFragment3.callingUserTextureView.getX() + width;
                float y = voIPFragment3.callingUserTextureView.getY() + height;
                canvas.save();
                this.clipPath.rewind();
                this.rectF.set(x, y, scaleX + x, scaleY + y);
                float fDp = AndroidUtilities.dp(4.0f);
                this.clipPath.addRoundRect(this.rectF, fDp, fDp, Path.Direction.CW);
                this.clipPath.close();
                canvas.clipPath(this.clipPath);
                super.dispatchDraw(canvas);
                canvas.restore();
            }

            @Override
            public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                VoIPServiceState sharedState;
                if (voIPFragment3.isFinished || voIPFragment3.switchingToPip) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 4 && keyEvent.getAction() == 1 && !voIPFragment3.lockOnScreen) {
                    voIPFragment3.onBackPressed();
                    return true;
                }
                if ((keyCode != 25 && keyCode != 24) || voIPFragment3.currentState != 15 || (sharedState = VoIPService.getSharedState()) == null) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                sharedState.stopRinging();
                return true;
            }

            @Override
            public void draw(Canvas canvas) {
                if (voIPFragment3.windowViewSkipRender) {
                    return;
                }
                super.draw(canvas);
            }
        };
        instance.deviceIsLocked = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        boolean zIsInteractive = ((PowerManager) activity.getSystemService("power")).isInteractive();
        VoIPFragment voIPFragment4 = instance;
        voIPFragment4.screenWasWakeup = !zIsInteractive;
        voIPWindowView2.setLockOnScreen(voIPFragment4.deviceIsLocked);
        voIPFragment3.windowView = voIPWindowView2;
        VoIPFragment$$ExternalSyntheticLambda19 voIPFragment$$ExternalSyntheticLambda19 = new VoIPFragment$$ExternalSyntheticLambda19(voIPFragment3, 4);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(voIPWindowView2, voIPFragment$$ExternalSyntheticLambda19);
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
            PipSource.Builder builder = new PipSource.Builder(activity, voIPFragment5);
            builder.tagPrefix = "voip-fragment-pip";
            VoIPTextureView voIPTextureView = voIPFragment5.callingUserTextureView;
            builder.contentView = voIPTextureView.renderer;
            builder.placeholderView = voIPTextureView.getPlaceholderView();
            voIPFragment5.pipSource = builder.build();
        }
    }

    private void showAcceptDeclineView(boolean z, boolean z2) {
        if (z2) {
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
        } else {
            this.acceptDeclineView.setVisibility(z ? 0 : 8);
        }
        this.acceptDeclineView.setEnabled(z);
        this.acceptDeclineView.setTag(z ? 1 : null);
    }

    private void showCallingUserAvatarMini(boolean z, boolean z2) {
        boolean z3 = (this.currentUserIsVideo || this.callingUserIsVideo) ? false : true;
        if (!z) {
            this.callingUserPhotoViewMini.animate().setListener(null).cancel();
            this.callingUserPhotoViewMini.setTranslationY(0.0f);
            this.callingUserPhotoViewMini.setAlpha(1.0f);
            this.callingUserPhotoViewMini.setScaleX(1.0f);
            this.callingUserPhotoViewMini.setScaleY(1.0f);
            this.callingUserPhotoViewMini.setVisibility(z3 ? 0 : 8);
        } else if (z3 && this.callingUserPhotoViewMini.getTag() == null) {
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
        this.callingUserPhotoViewMini.setTag(z3 ? 1 : null);
    }

    private void showErrorDialog(CharSequence charSequence) {
        if (this.activity.isFinishing()) {
            return;
        }
        AlertDialog alertDialogShow = new DarkAlertDialog.Builder(this.activity).setTitle(LocaleController.getString(R.string.VoipFailed)).setMessage(charSequence).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
        alertDialogShow.setCanceledOnTouchOutside(true);
        alertDialogShow.setOnDismissListener(new OAuthSheet$$ExternalSyntheticLambda18(this, 19));
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
            if (!z) {
                this.currentUserCameraFloatingLayout.setVisibility(0);
            } else if (this.currentUserCameraFloatingLayout.getTag() != null && ((Integer) this.currentUserCameraFloatingLayout.getTag()).intValue() == 0) {
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
            if (this.currentUserCameraFloatingLayout.getTag() == null || ((Integer) this.currentUserCameraFloatingLayout.getTag()).intValue() != 2) {
                VoIPFloatingLayout voIPFloatingLayout = this.currentUserCameraFloatingLayout;
                if (voIPFloatingLayout.relativePositionToSetX < 0.0f) {
                    voIPFloatingLayout.setRelativePosition(1.0f, 1.0f);
                    this.currentUserCameraIsFullscreen = true;
                }
            }
            this.currentUserCameraFloatingLayout.setFloatingMode(i == 2, z2);
            this.currentUserCameraIsFullscreen = i != 2;
        } else if (!z) {
            this.currentUserCameraFloatingLayout.setVisibility(8);
        } else if (this.currentUserCameraFloatingLayout.getTag() != null && ((Integer) this.currentUserCameraFloatingLayout.getTag()).intValue() != 0) {
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
        this.currentUserCameraFloatingLayout.setTag(Integer.valueOf(i));
    }

    public void showUi(boolean z) {
        int i;
        ValueAnimator valueAnimator = this.uiVisibilityAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z || !this.uiVisible) {
            if (z && !this.uiVisible) {
                this.tapToVideoTooltip.hide();
                this.encryptionTooltip.hide();
                ViewPropertyAnimator viewPropertyAnimatorTranslationY = this.callingUserTitle.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                viewPropertyAnimatorTranslationY.setInterpolator(cubicBezierInterpolator).start();
                this.statusTextView.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(cubicBezierInterpolator).start();
                this.speakerPhoneIcon.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                this.backIcon.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                this.addIcon.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                this.emojiLayout.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                this.buttonsLayout.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                this.bottomShadow.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                this.topShadow.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.uiVisibilityAlpha, 1.0f);
                this.uiVisibilityAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(this.statusbarAnimatorListener);
                this.uiVisibilityAnimator.setDuration(150L).setInterpolator(cubicBezierInterpolator);
                this.uiVisibilityAnimator.start();
                this.buttonsLayout.setEnabled(true);
            }
            i = 0;
        } else {
            ViewPropertyAnimator duration = this.speakerPhoneIcon.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
            duration.setInterpolator(cubicBezierInterpolator2).start();
            this.backIcon.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
            this.addIcon.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
            this.emojiLayout.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
            this.callingUserTitle.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(cubicBezierInterpolator2).start();
            this.statusTextView.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(cubicBezierInterpolator2).start();
            this.buttonsLayout.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
            this.bottomShadow.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
            this.topShadow.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator2).start();
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.uiVisibilityAlpha, 0.0f);
            this.uiVisibilityAnimator = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.addUpdateListener(this.statusbarAnimatorListener);
            this.uiVisibilityAnimator.setDuration(150L).setInterpolator(cubicBezierInterpolator2);
            this.uiVisibilityAnimator.start();
            AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
            this.hideUiRunnableWaiting = false;
            this.buttonsLayout.setEnabled(false);
            this.encryptionTooltip.hide();
            i = 150;
        }
        this.uiVisible = z;
        this.windowView.requestFullscreen(!z);
        this.notificationsLayout.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.uiVisible ? AndroidUtilities.dp(80.0f) : 0)).setDuration(150L).setStartDelay(i).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
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

    private void toggleCameraInput() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.accessibilityManager.isTouchExplorationEnabled()) {
                this.fragmentView.announceForAccessibility(!this.currentUserIsVideo ? LocaleController.getString(R.string.AccDescrVoipCamOn) : LocaleController.getString(R.string.AccDescrVoipCamOff));
            }
            if (this.currentUserIsVideo) {
                this.currentUserTextureView.saveCameraLastBitmap();
                sharedInstance.setVideoState(false, 0);
                sharedInstance.clearCamera();
                this.previousState = this.currentState;
                updateViewState();
                return;
            }
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
                    public void afterOpened() {
                        VoIPFragment.this.gradientLayout.lockDrawing = true;
                        VoIPFragment.this.gradientLayout.invalidate();
                    }

                    @Override
                    public void beforeClosed() {
                        VoIPFragment.this.gradientLayout.lockDrawing = false;
                        VoIPFragment.this.gradientLayout.invalidate();
                    }

                    @Override
                    public int[] getFloatingViewLocation() {
                        int[] iArr2 = new int[2];
                        VoIPFragment.this.currentUserCameraFloatingLayout.getLocationOnScreen(iArr2);
                        return new int[]{iArr2[0], iArr2[1], VoIPFragment.this.currentUserCameraFloatingLayout.getMeasuredWidth()};
                    }

                    @Override
                    public boolean isHasVideoOnMainScreen() {
                        return VoIPFragment.this.callingUserIsVideo;
                    }

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
                };
                this.previewDialog = privateVideoPreviewDialogNew;
                WindowInsets windowInsets = this.lastInsets;
                if (windowInsets != null) {
                    privateVideoPreviewDialogNew.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                }
                this.fragmentView.addView(this.previewDialog);
            }
        }
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
                if (sharedInstance.isScreencast() || !(this.currentUserIsVideo || this.callingUserIsVideo)) {
                    setSpeakerPhoneAction(this.bottomSpeakerBtn, sharedInstance, z);
                    this.speakerPhoneIcon.animate().alpha(0.0f).start();
                } else {
                    setFrontalCameraAction(this.bottomSpeakerBtn, sharedInstance, z);
                    if (this.uiVisible) {
                        this.speakerPhoneIcon.animate().alpha(1.0f).start();
                    }
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
            if (sharedInstance.isScreencast() || !(this.currentUserIsVideo || this.callingUserIsVideo)) {
                setSpeakerPhoneAction(this.bottomSpeakerBtn, sharedInstance, z);
                this.speakerPhoneIcon.setTag(null);
                this.speakerPhoneIcon.animate().alpha(0.0f).start();
            } else {
                setFrontalCameraAction(this.bottomSpeakerBtn, sharedInstance, z);
                if (this.uiVisible) {
                    this.speakerPhoneIcon.setTag(1);
                    this.speakerPhoneIcon.animate().alpha(1.0f).start();
                }
            }
            setVideoAction(this.bottomVideoBtn, sharedInstance, false);
            setMicrohoneAction(this.bottomMuteBtn, sharedInstance, z);
            this.bottomEndCallBtn.setData(R.drawable.calls_decline, -1, -1041108, LocaleController.getString(R.string.VoipEndCall2), false, z);
            this.bottomEndCallBtn.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda28(this, 0));
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
        } else {
            i = sharedInstance.isHeadsetPlugged() ? R.drawable.calls_menu_headset : R.drawable.calls_menu_phone;
        }
        if (this.speakerPhoneIconResId != i) {
            AndroidUtilities.updateImageViewImageAnimated(this.speakerPhoneIcon, i);
        } else {
            this.speakerPhoneIcon.setImageResource(i);
        }
        this.speakerPhoneIconResId = i;
    }

    private void updateSystemBarColors() {
        this.overlayPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (this.uiVisibilityAlpha * 102.0f * this.enterTransitionProgress)));
        this.overlayBottomPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (AndroidUtilities$$ExternalSyntheticOutline0.m(this.fillNaviagtionBarValue, 0.5f, 0.5f, 255.0f) * this.enterTransitionProgress)));
        ViewGroup viewGroup = this.fragmentView;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void updateViewState() {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        int iDp;
        boolean z5;
        boolean z6;
        int i2;
        boolean z7;
        boolean z8;
        int i3;
        float f;
        int i4;
        float f2;
        int iDp2;
        int i5;
        boolean z9;
        int i6;
        boolean z10;
        int childsHight;
        VoIPFloatingLayout voIPFloatingLayout;
        VoIPFloatingLayout voIPFloatingLayout2;
        boolean z11;
        VoIPFloatingLayout voIPFloatingLayout3;
        float f3;
        VoIPFloatingLayout voIPFloatingLayout4;
        float f4;
        boolean z12;
        int i7;
        VoIPTextureView.AnonymousClass1 anonymousClass1;
        VideoSink videoSink;
        Object objEllipsize;
        int i8;
        float f5;
        VoIPNotificationsLayout voIPNotificationsLayout;
        String firstName;
        VoIPNotificationsLayout voIPNotificationsLayout2;
        String firstName2;
        CharSequence charSequenceEllipsize;
        VoIPNotificationsLayout voIPNotificationsLayout3;
        TL_phone.PhoneCall phoneCall;
        VoIPNotificationsLayout voIPNotificationsLayout4;
        long j;
        Layout layout;
        int lineCount;
        float f6;
        float f7;
        float f8;
        int iDp3;
        TL_phone.PhoneCall phoneCall2;
        float f9;
        boolean z13;
        boolean z14;
        boolean z15;
        int i9 = 12;
        boolean z16 = true;
        int i10 = 0;
        if (this.isFinished || this.switchingToPip) {
            return;
        }
        this.lockOnScreen = false;
        boolean z17 = this.previousState != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i11 = this.currentState;
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                updateKeyView(z17);
                if (this.currentState == 5) {
                    z = this.wasEstablished;
                    if (z && this.previousState != 5) {
                        this.statusTextView.setText(LocaleController.getString(R.string.VoipConnecting), true, z17);
                    }
                    z16 = false;
                    i10 = 0;
                } else {
                    this.wasEstablished = true;
                    z = false;
                    z16 = false;
                    i10 = 1;
                }
            } else if (i11 == 4) {
                VoIPStatusTextView voIPStatusTextView = this.statusTextView;
                int i12 = R.string.VoipFailed;
                voIPStatusTextView.setText(LocaleController.getString(i12), false, z17);
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : "ERROR_UNKNOWN";
                if (TextUtils.equals(lastError, "ERROR_UNKNOWN")) {
                    AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda1(this, 5), 1000L);
                } else if (TextUtils.equals(lastError, "ERROR_INCOMPATIBLE")) {
                    TLRPC.User user = this.callingUser;
                    showErrorDialog(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerIncompatible", R.string.VoipPeerIncompatible, ContactsController.formatName(user.first_name, user.last_name))));
                } else if (TextUtils.equals(lastError, "ERROR_PEER_OUTDATED")) {
                    if (this.isVideoCall) {
                        boolean[] zArr = new boolean[1];
                        AlertDialog alertDialogShow = new DarkAlertDialog.Builder(this.activity).setTitle(LocaleController.getString(i12)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerVideoOutdated", R.string.VoipPeerVideoOutdated, UserObject.getFirstName(this.callingUser)))).setNegativeButton(LocaleController.getString(R.string.Cancel), new VoIPFragment$$ExternalSyntheticLambda19(this, 3)).setPositiveButton(LocaleController.getString(R.string.VoipPeerVideoOutdatedMakeVoice), new TodoItemMenu$$ExternalSyntheticLambda7(19, this, zArr)).show();
                        alertDialogShow.setCanceledOnTouchOutside(true);
                        alertDialogShow.setOnDismissListener(new VoIPFragment$$ExternalSyntheticLambda23(0, (Object) this, (Object) zArr));
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
                    AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda1(this, 4), 1000L);
                }
            } else if (i11 != 5) {
                switch (i11) {
                    case 11:
                        boolean z18 = sharedInstance != null && sharedInstance.hasRate();
                        this.currentUserTextureView.saveCameraLastBitmap();
                        if (!z18 || this.isFinished) {
                            AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda1(this, 3), 200L);
                        } else {
                            if (this.uiVisible) {
                                int[] iArr = new int[2];
                                int i13 = AndroidUtilities.displaySize.x;
                                this.bottomEndCallBtn.getLocationOnScreen(iArr);
                                int measuredWidth = ((i13 - iArr[0]) - ((this.bottomEndCallBtn.getMeasuredWidth() - AndroidUtilities.dp(52.0f)) / 2)) - AndroidUtilities.dp(52.0f);
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.endCloseLayout.getLayoutParams();
                                marginLayoutParams.rightMargin = measuredWidth;
                                marginLayoutParams.leftMargin = measuredWidth;
                                this.endCloseLayout.setTranslationY(iArr[1]);
                                this.endCloseLayout.setAlpha(1.0f);
                                this.endCloseLayout.setLayoutParams(marginLayoutParams);
                                this.buttonsLayout.animate().alpha(0.0f).setDuration(80L).start();
                                AndroidUtilities.runOnUIThread(new ThemeActivity$$ExternalSyntheticLambda9(i9, this, sharedInstance), 2L);
                            } else {
                                this.buttonsLayout.setVisibility(8);
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.endCloseLayout.getLayoutParams();
                                layoutParams.rightMargin = AndroidUtilities.dp(18.0f);
                                layoutParams.leftMargin = AndroidUtilities.dp(18.0f);
                                int iDp4 = AndroidUtilities.dp(36.0f);
                                layoutParams.bottomMargin = iDp4;
                                WindowInsets windowInsets = this.lastInsets;
                                if (windowInsets != null) {
                                    layoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom() + iDp4;
                                }
                                layoutParams.gravity = 80;
                                this.endCloseLayout.setLayoutParams(layoutParams);
                                this.endCloseLayout.animate().alpha(1.0f).setDuration(250L).start();
                                this.endCloseLayout.switchToClose(new VoIPFragment$$ExternalSyntheticLambda18(this, sharedInstance, i10), false);
                            }
                            this.rateCallLayout.setVisibility(0);
                            RateCallLayout rateCallLayout = this.rateCallLayout;
                            rateCallLayout.onRateSelected = new VoIPFragment$$ExternalSyntheticLambda19(this, i10);
                            RateCallLayout.RateCallContainer rateCallContainer = rateCallLayout.rateCallContainer;
                            rateCallContainer.setVisibility(0);
                            rateCallLayout.starsContainer.setVisibility(0);
                            AnimatorSet animatorSet = new AnimatorSet();
                            Property property = View.ALPHA;
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(rateCallContainer, (Property<RateCallLayout.RateCallContainer, Float>) property, 0.0f, 1.0f);
                            Property property2 = View.SCALE_X;
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(rateCallContainer, (Property<RateCallLayout.RateCallContainer, Float>) property2, 0.7f, 1.0f);
                            Property property3 = View.SCALE_Y;
                            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(rateCallContainer, (Property<RateCallLayout.RateCallContainer, Float>) property3, 0.7f, 1.0f);
                            float[] fArr = {AndroidUtilities.dp(24.0f), 0.0f};
                            Property property4 = View.TRANSLATION_Y;
                            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, ObjectAnimator.ofFloat(rateCallContainer, (Property<RateCallLayout.RateCallContainer, Float>) property4, fArr));
                            animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                            animatorSet.setDuration(250L);
                            int i14 = 0;
                            while (true) {
                                RateCallLayout.StarContainer[] starContainerArr = rateCallLayout.startsViews;
                                if (i14 >= starContainerArr.length) {
                                    animatorSet.start();
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
                                    ViewPropertyAnimator viewPropertyAnimatorAlpha = this.speakerPhoneIcon.animate().alpha(0.0f);
                                    CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
                                    OKLCH.m(viewPropertyAnimatorAlpha, cubicBezierInterpolator2, 250L);
                                    this.speakerPhoneIcon.setVisibility(8);
                                    this.statusTextView.showReconnect(false, true);
                                    this.statusTextView.showBadConnection(false);
                                    VoIPTimerView voIPTimerView = this.statusTextView.timerView;
                                    voIPTimerView.isDrawCallIcon = true;
                                    voIPTimerView.invalidate();
                                    ImageWithWavesView imageWithWavesView = this.callingUserPhotoViewMini;
                                    imageWithWavesView.setShowWaves(false);
                                    AnimatorSet animatorSet2 = imageWithWavesView.animatorSet;
                                    if (animatorSet2 != null) {
                                        animatorSet2.cancel();
                                    }
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    imageWithWavesView.animatorSet = animatorSet3;
                                    animatorSet3.playTogether(ObjectAnimator.ofFloat(imageWithWavesView, (Property<ImageWithWavesView, Float>) View.ALPHA, imageWithWavesView.getAlpha(), 1.0f), ObjectAnimator.ofFloat(imageWithWavesView, (Property<ImageWithWavesView, Float>) View.TRANSLATION_Y, imageWithWavesView.getTranslationY(), -AndroidUtilities.dp(24.0f)), ObjectAnimator.ofFloat(imageWithWavesView, (Property<ImageWithWavesView, Float>) View.SCALE_X, imageWithWavesView.getScaleX(), 0.9f, 1.0f), ObjectAnimator.ofFloat(imageWithWavesView, (Property<ImageWithWavesView, Float>) View.SCALE_Y, imageWithWavesView.getScaleY(), 0.9f, 1.0f));
                                    imageWithWavesView.animatorSet.setInterpolator(cubicBezierInterpolator2);
                                    imageWithWavesView.animatorSet.setDuration(300L);
                                    imageWithWavesView.animatorSet.setStartDelay(250L);
                                    imageWithWavesView.animatorSet.start();
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
                                    AnimatorSet animatorSet4 = new AnimatorSet();
                                    starContainerArr[i14].setAlpha(0.0f);
                                    animatorSet4.playTogether(ObjectAnimator.ofFloat(starContainerArr[i14], (Property<RateCallLayout.StarContainer, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(starContainerArr[i14], (Property<RateCallLayout.StarContainer, Float>) property2, 0.3f, 1.0f), ObjectAnimator.ofFloat(starContainerArr[i14], (Property<RateCallLayout.StarContainer, Float>) property3, 0.3f, 1.0f), ObjectAnimator.ofFloat(starContainerArr[i14], (Property<RateCallLayout.StarContainer, Float>) property4, AndroidUtilities.dp(30.0f), 0.0f));
                                    animatorSet4.setDuration(250L);
                                    animatorSet4.setStartDelay(((long) i14) * 16);
                                    animatorSet4.start();
                                    i14++;
                                    property = property;
                                    property3 = property3;
                                }
                            }
                        }
                        break;
                    case 12:
                        if (this.previousState != 12) {
                            this.statusTextView.setText(LocaleController.getString(R.string.VoipExchangingKeys), true, z17);
                        }
                        break;
                    case 13:
                        this.statusTextView.setText(LocaleController.getString(R.string.VoipWaiting), true, z17);
                        break;
                    case 14:
                        this.statusTextView.setText(LocaleController.getString(R.string.VoipRequesting), true, z17);
                        break;
                    case 15:
                        this.lockOnScreen = false;
                        this.acceptDeclineView.setRetryMod(false);
                        if (sharedState != null && sharedState.isConference()) {
                            this.statusTextView.setText(LocaleController.getString(R.string.VoipInConferenceCallBranding), false, z17);
                            this.acceptDeclineView.setTranslationY(0.0f);
                        } else if (sharedState == null || !sharedState.isCallingVideo()) {
                            this.statusTextView.setText(LocaleController.getString(R.string.VoipInCallBranding), false, z17);
                            this.acceptDeclineView.setTranslationY(0.0f);
                        } else {
                            this.statusTextView.setText(LocaleController.getString(R.string.VoipInVideoCallBranding), false, z17);
                            this.acceptDeclineView.setTranslationY(-AndroidUtilities.dp(60.0f));
                        }
                        z = false;
                        break;
                    case 16:
                        if (this.previousState != 16) {
                            this.statusTextView.setText(LocaleController.getString(R.string.VoipRinging), true, z17);
                        }
                        break;
                    case 17:
                        this.statusTextView.setText(LocaleController.getString(R.string.VoipBusy), false, z17);
                        this.acceptDeclineView.setRetryMod(true);
                        this.currentUserIsVideo = false;
                        this.callingUserIsVideo = false;
                        z = false;
                        break;
                    default:
                        break;
                }
            } else {
                updateKeyView(z17);
                if (this.currentState == 5) {
                    z = this.wasEstablished;
                    if (z) {
                    }
                    z16 = false;
                    i10 = 0;
                } else {
                    this.wasEstablished = true;
                    z = false;
                    z16 = false;
                    i10 = 1;
                }
            }
            if (this.previewDialog != null) {
                return;
            }
            if (!this.callingUserIsVideo || this.currentUserIsVideo) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (sharedInstance != null) {
                if (sharedInstance.getRemoteVideoState() == 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.callingUserIsVideo = z13;
                if (sharedInstance.getVideoState(false) != 2) {
                    z14 = true;
                    if (sharedInstance.getVideoState(false) == 1) {
                        z15 = false;
                    }
                    this.currentUserIsVideo = z15;
                    if (z15 && !this.isVideoCall) {
                        this.isVideoCall = z14;
                    }
                } else {
                    z14 = true;
                }
                z15 = true;
                this.currentUserIsVideo = z15;
                if (z15) {
                    this.isVideoCall = z14;
                }
            }
            if (z17) {
                this.currentUserCameraFloatingLayout.saveRelativePosition();
                this.callingUserMiniFloatingLayout.saveRelativePosition();
            }
            if (this.callingUserIsVideo) {
                if (this.switchingToPip) {
                    f9 = 1.0f;
                } else {
                    f9 = 1.0f;
                    this.gradientLayout.setAlpha(1.0f);
                }
                if (z17) {
                    this.callingUserTextureView.animate().alpha(f9).setDuration(250L).start();
                } else {
                    this.callingUserTextureView.animate().cancel();
                    this.callingUserTextureView.setAlpha(f9);
                }
                if (!this.callingUserTextureView.renderer.isFirstFrameRendered() || this.enterFromPiP) {
                    i = 0;
                } else {
                    i = 0;
                    this.callingUserIsVideo = false;
                }
            } else {
                i = 0;
            }
            if (!this.currentUserIsVideo || this.callingUserIsVideo) {
                this.gradientLayout.setVisibility(4);
            } else {
                this.gradientLayout.setVisibility(i);
                if (z17) {
                    this.callingUserTextureView.animate().alpha(0.0f).setDuration(250L).start();
                } else {
                    this.callingUserTextureView.animate().cancel();
                    this.callingUserTextureView.setAlpha(0.0f);
                }
            }
            z3 = this.currentUserIsVideo;
            if (z3 || !this.callingUserIsVideo) {
                this.cameraForceExpanded = false;
            }
            if (z3 || !this.cameraForceExpanded || AndroidUtilities.isInPictureInPictureMode(this.activity)) {
                z4 = false;
            } else {
                z4 = true;
            }
            showCallingUserAvatarMini(z17, z2);
            if (this.callingUserPhotoViewMini.getTag() == null) {
                iDp = 0;
            } else {
                iDp = AndroidUtilities.dp(135.0f) + AndroidUtilities.dp(12.0f);
            }
            showAcceptDeclineView(z16, z17);
            VoIPWindowView voIPWindowView = this.windowView;
            if (!this.lockOnScreen || this.deviceIsLocked) {
                z5 = true;
            } else {
                z5 = false;
            }
            voIPWindowView.setLockOnScreen(z5);
            if (this.currentState == 3 || !(this.currentUserIsVideo || this.callingUserIsVideo)) {
                z6 = false;
            } else {
                z6 = true;
            }
            this.canHideUI = z6;
            if (!z6 && !this.uiVisible) {
                showUi(true);
            }
            if (this.uiVisible && this.canHideUI && !this.hideUiRunnableWaiting && sharedInstance != null) {
                AndroidUtilities.runOnUIThread(this.hideUIRunnable, 3000L);
                this.hideUiRunnableWaiting = true;
            }
            i2 = this.currentState;
            if (i2 == 11 && !this.lockOnScreen && this.uiVisible) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z16 || i2 == 16 || i2 == 11 || i2 == 12 || i2 == 14 || i2 == 6 || this.lockOnScreen || !this.uiVisible || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (z17) {
                if (z7) {
                    f6 = 80.0f;
                    this.backIcon.animate().alpha(1.0f).start();
                } else {
                    f6 = 80.0f;
                    if (this.backIcon.getVisibility() != 0) {
                        this.backIcon.setVisibility(0);
                        f7 = 0.0f;
                        this.backIcon.setAlpha(0.0f);
                    } else {
                        f7 = 0.0f;
                    }
                    this.backIcon.animate().alpha(f7).start();
                }
                if (z8) {
                    this.addIcon.animate().alpha(1.0f).start();
                } else {
                    if (this.addIcon.getVisibility() != 0) {
                        this.addIcon.setVisibility(0);
                        f8 = 0.0f;
                        this.addIcon.setAlpha(0.0f);
                    } else {
                        f8 = 0.0f;
                    }
                    this.addIcon.animate().alpha(f8).start();
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = this.notificationsLayout.animate();
                int i15 = -AndroidUtilities.dp(16.0f);
                if (this.uiVisible) {
                    iDp3 = AndroidUtilities.dp(f6);
                } else {
                    iDp3 = 0;
                }
                viewPropertyAnimatorAnimate.translationY(i15 - iDp3).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            } else {
                ImageView imageView = this.backIcon;
                if (z7) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                imageView.setVisibility(i3);
                ImageView imageView2 = this.backIcon;
                if (z7) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                imageView2.setAlpha(f);
                ImageView imageView3 = this.addIcon;
                if (z8) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                imageView3.setVisibility(i4);
                ImageView imageView4 = this.addIcon;
                if (z8) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                imageView4.setAlpha(f2);
                VoIPNotificationsLayout voIPNotificationsLayout5 = this.notificationsLayout;
                int i16 = -AndroidUtilities.dp(16.0f);
                if (this.uiVisible) {
                    iDp2 = AndroidUtilities.dp(80.0f);
                } else {
                    iDp2 = 0;
                }
                voIPNotificationsLayout5.setTranslationY(i16 - iDp2);
            }
            i5 = this.currentState;
            if (i5 != 10 && i5 != 11) {
                updateButtons(z17);
            }
            if (i10 != 0) {
                this.statusTextView.showTimer(z17);
            }
            this.statusTextView.showReconnect(z, z17);
            if (this.callingUserPhotoViewMini.getVisibility() == 0 && this.emojiExpanded) {
                iDp += AndroidUtilities.dp(24.0f);
                layout = this.emojiRationalTextView.getLayout();
                if (layout != null && (lineCount = layout.getLineCount()) > 2) {
                    iDp = CalendarActivity$$ExternalSyntheticOutline0.m(lineCount, 2, AndroidUtilities.dp(20.0f), iDp);
                }
            }
            if (this.currentState == 11 && !this.currentUserIsVideo && !this.callingUserIsVideo) {
                iDp -= AndroidUtilities.dp(24.0f);
            }
            if (this.currentUserIsVideo || this.callingUserIsVideo) {
                iDp -= AndroidUtilities.dp(60.0f);
            }
            if (z17) {
                if (this.emojiExpanded || !(this.currentUserIsVideo || this.callingUserIsVideo)) {
                    j = 250;
                    this.statusLayout.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                } else {
                    this.statusLayout.animate().setStartDelay(0L).alpha(0.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    j = 250;
                }
                if (iDp != this.statusLayoutAnimateToOffset) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate2 = this.statusLayout.animate();
                    if (this.currentState != 11) {
                        j = 0;
                    }
                    viewPropertyAnimatorAnimate2.setStartDelay(j).translationY(iDp).setDuration(200L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                }
            } else {
                this.statusLayout.setTranslationY(iDp);
            }
            this.statusLayoutAnimateToOffset = iDp;
            if (sharedInstance == null && sharedInstance.isScreencast()) {
                z9 = true;
            } else {
                z9 = false;
            }
            i6 = this.currentState;
            if (i6 != 11 || i6 == 17 || ((!this.currentUserIsVideo || z9) && !this.callingUserIsVideo)) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.canSwitchToPip = z10;
            if (sharedInstance != null) {
                if (this.currentUserIsVideo) {
                    sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
                }
                this.currentUserTextureView.setIsScreencast(sharedInstance.isScreencast());
                this.currentUserTextureView.renderer.setMirror(sharedInstance.isFrontFaceCamera());
                if (this.currentUserIsVideo || sharedInstance.isScreencast()) {
                    anonymousClass1 = null;
                } else {
                    anonymousClass1 = this.currentUserTextureView.renderer;
                }
                if (!this.windowViewSkipRender && (voIPTextureView = this.pipTextureView) != null) {
                    videoSink = voIPTextureView.renderer;
                } else if (z4) {
                    videoSink = this.callingUserMiniTextureRenderer;
                } else {
                    VoIPTextureView voIPTextureView = this.callingUserTextureView;
                    videoSink = voIPTextureView.renderer;
                }
                sharedInstance.setSinks(anonymousClass1, videoSink);
                if (z17) {
                    voIPNotificationsLayout4 = this.notificationsLayout;
                    voIPNotificationsLayout4.wasChanged = false;
                    if (!voIPNotificationsLayout4.lockAnimation && voIPNotificationsLayout4.getParent() != null) {
                        TransitionManager.beginDelayedTransition(voIPNotificationsLayout4, voIPNotificationsLayout4.transitionSet);
                    }
                }
                if (sharedInstance.isMicMute()) {
                    this.notificationsLayout.addNotification(R.drawable.calls_mute_mini, LocaleController.getString(R.string.VoipMyMicrophoneState), "self-muted");
                } else {
                    this.notificationsLayout.removeNotification("self-muted");
                }
                objEllipsize = "";
                if ((!this.currentUserIsVideo || this.callingUserIsVideo) && (((i8 = this.currentState) == 3 || i8 == 5) && sharedInstance.getCallDuration() > 500)) {
                    if (sharedInstance.getRemoteAudioState() == 0) {
                        voIPNotificationsLayout2 = this.notificationsLayout;
                        int i17 = R.drawable.calls_mute_mini;
                        int i18 = R.string.VoipUserMicrophoneIsOff;
                        f5 = 300.0f;
                        firstName2 = UserObject.getFirstName(this.callingUser);
                        if (firstName2 == null) {
                            voIPNotificationsLayout2.getClass();
                            charSequenceEllipsize = "";
                        } else {
                            charSequenceEllipsize = TextUtils.ellipsize(firstName2, voIPNotificationsLayout2.textPaint, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
                        }
                        voIPNotificationsLayout2.addNotification(i17, LocaleController.formatString("VoipUserMicrophoneIsOff", i18, charSequenceEllipsize), "muted");
                    } else {
                        f5 = 300.0f;
                        this.notificationsLayout.removeNotification("muted");
                    }
                    if (sharedInstance.getRemoteVideoState() == 0) {
                        voIPNotificationsLayout = this.notificationsLayout;
                        int i19 = R.drawable.calls_camera_mini;
                        int i20 = R.string.VoipUserCameraIsOff;
                        firstName = UserObject.getFirstName(this.callingUser);
                        if (firstName == null) {
                            voIPNotificationsLayout.getClass();
                        } else {
                            objEllipsize = TextUtils.ellipsize(firstName, voIPNotificationsLayout.textPaint, AndroidUtilities.dp(f5), TextUtils.TruncateAt.END);
                        }
                        voIPNotificationsLayout.addNotification(i19, LocaleController.formatString("VoipUserCameraIsOff", i20, objEllipsize), "video");
                    } else {
                        this.notificationsLayout.removeNotification("video");
                    }
                } else {
                    if (sharedInstance.getRemoteAudioState() == 0) {
                        VoIPNotificationsLayout voIPNotificationsLayout6 = this.notificationsLayout;
                        int i21 = R.drawable.calls_mute_mini;
                        int i22 = R.string.VoipUserMicrophoneIsOff;
                        String firstName3 = UserObject.getFirstName(this.callingUser);
                        if (firstName3 == null) {
                            voIPNotificationsLayout6.getClass();
                        } else {
                            objEllipsize = TextUtils.ellipsize(firstName3, voIPNotificationsLayout6.textPaint, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
                        }
                        voIPNotificationsLayout6.addNotification(i21, LocaleController.formatString("VoipUserMicrophoneIsOff", i22, objEllipsize), "muted");
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
                        this.tapToVideoTooltip.setJointPx(0.0f, this.bottomVideoBtn.getX() + this.buttonsLayout.getX() + AndroidUtilities.dp(14.0f));
                        this.tapToVideoTooltip.show();
                    } else if (this.notificationsLayout.getChildCount() != 0) {
                        this.tapToVideoTooltip.hide();
                    }
                } else if (this.notificationsLayout.getChildCount() != 0) {
                    this.tapToVideoTooltip.hide();
                }
                if (z17) {
                    voIPNotificationsLayout3 = this.notificationsLayout;
                    if (voIPNotificationsLayout3.wasChanged) {
                        voIPNotificationsLayout3.lockAnimation = true;
                        AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda9(voIPNotificationsLayout3, 20), 700L);
                    }
                    voIPNotificationsLayout3.wasChanged = false;
                }
            }
            childsHight = this.notificationsLayout.getChildsHight();
            voIPFloatingLayout = this.callingUserMiniFloatingLayout;
            if (voIPFloatingLayout.getParent() == null && z17) {
                voIPFloatingLayout.bottomOffset = childsHight;
            } else {
                voIPFloatingLayout.bottomOffset = childsHight;
            }
            voIPFloatingLayout2 = this.currentUserCameraFloatingLayout;
            if (voIPFloatingLayout2.getParent() == null && z17) {
                voIPFloatingLayout2.bottomOffset = childsHight;
            } else {
                voIPFloatingLayout2.bottomOffset = childsHight;
            }
            this.currentUserCameraFloatingLayout.setUiVisible(this.uiVisible);
            this.callingUserMiniFloatingLayout.setUiVisible(this.uiVisible);
            if (this.currentUserIsVideo) {
                z11 = true;
                showFloatingLayout(0, z17);
            } else if (this.callingUserIsVideo || this.cameraForceExpanded) {
                z11 = true;
                showFloatingLayout(1, z17);
            } else {
                showFloatingLayout(2, z17);
                z11 = true;
            }
            if (!z4 && this.callingUserMiniFloatingLayout.getTag() == null) {
                this.callingUserMiniFloatingLayout.setIsActive(z11);
                if (this.callingUserMiniFloatingLayout.getVisibility() != 0) {
                    this.callingUserMiniFloatingLayout.setVisibility(0);
                    this.callingUserMiniFloatingLayout.setAlpha(0.0f);
                    this.callingUserMiniFloatingLayout.setScaleX(0.5f);
                    this.callingUserMiniFloatingLayout.setScaleY(0.5f);
                }
                this.callingUserMiniFloatingLayout.animate().setListener(null).cancel();
                VoIPFloatingLayout voIPFloatingLayout5 = this.callingUserMiniFloatingLayout;
                voIPFloatingLayout5.isAppearing = true;
                voIPFloatingLayout5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).setStartDelay(150L).withEndAction(new VoIPFragment$$ExternalSyntheticLambda1(this, 6)).start();
                this.callingUserMiniFloatingLayout.setTag(1);
            } else if (!z4 && this.callingUserMiniFloatingLayout.getTag() != null) {
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
            voIPFloatingLayout3 = this.currentUserCameraFloatingLayout;
            voIPFloatingLayout3.updatePadding();
            f3 = voIPFloatingLayout3.savedRelativePositionX;
            if (f3 >= 0.0f && !voIPFloatingLayout3.switchingToFloatingMode) {
                voIPFloatingLayout3.setRelativePositionInternal(f3, voIPFloatingLayout3.savedRelativePositionY, voIPFloatingLayout3.getMeasuredWidth(), voIPFloatingLayout3.getMeasuredHeight(), true);
                voIPFloatingLayout3.savedRelativePositionX = -1.0f;
                voIPFloatingLayout3.savedRelativePositionY = -1.0f;
            }
            voIPFloatingLayout4 = this.callingUserMiniFloatingLayout;
            voIPFloatingLayout4.updatePadding();
            f4 = voIPFloatingLayout4.savedRelativePositionX;
            if (f4 >= 0.0f && !voIPFloatingLayout4.switchingToFloatingMode) {
                voIPFloatingLayout4.setRelativePositionInternal(f4, voIPFloatingLayout4.savedRelativePositionY, voIPFloatingLayout4.getMeasuredWidth(), voIPFloatingLayout4.getMeasuredHeight(), true);
                voIPFloatingLayout4.savedRelativePositionX = -1.0f;
                voIPFloatingLayout4.savedRelativePositionY = -1.0f;
            }
            updateSpeakerPhoneIcon();
            if (this.currentState == 3) {
                this.voIpCoverView.onConnected();
                this.callingUserPhotoViewMini.onConnected();
                i7 = this.gradientLayout.state;
                if (i7 == 2 && i7 != 3) {
                    int[] iArr2 = new int[2];
                    this.callingUserPhotoViewMini.getLocationOnScreen(iArr2);
                    this.gradientLayout.switchToCallConnected(AndroidUtilities.dp(106.0f) + iArr2[0], AndroidUtilities.dp(106.0f) + iArr2[1], this.previousState != -1);
                }
            }
            if (!this.currentUserIsVideo || this.callingUserIsVideo) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.voIpSnowView.setState(z12);
            this.voIpCoverView.setState(z12);
            this.backgroundProvider.setHasVideo(z12);
            if (this.callingUserIsVideo && !z2 && this.isNearEar) {
                this.isNearEar = false;
                if (sharedInstance != null) {
                    sharedInstance.playStartRecordSound();
                }
            }
            if (z12) {
                if (this.topShadow.getVisibility() != 0) {
                    this.topShadow.setVisibility(0);
                    this.bottomShadow.setVisibility(0);
                }
            } else if (this.topShadow.getVisibility() != 4) {
                this.topShadow.setVisibility(4);
                this.bottomShadow.setVisibility(4);
            }
            AndroidUtilities.cancelRunOnUIThread(this.stopAnimatingBgRunnable);
            if (this.currentState == 3) {
                AndroidUtilities.runOnUIThread(this.stopAnimatingBgRunnable, 10000L);
            }
            if (this.pipSource != null) {
                int i23 = PipSource.sourceIdCounter;
            }
        }
        this.statusTextView.setText(LocaleController.getString(R.string.VoipConnecting), true, z17);
        z = false;
        z16 = false;
        i10 = 0;
        if (this.previewDialog != null) {
            return;
        }
        if (this.callingUserIsVideo) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (sharedInstance != null) {
            if (sharedInstance.getRemoteVideoState() == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.callingUserIsVideo = z13;
            if (sharedInstance.getVideoState(false) != 2) {
                z14 = true;
                if (sharedInstance.getVideoState(false) == 1) {
                    z15 = false;
                }
                this.currentUserIsVideo = z15;
                if (z15) {
                    this.isVideoCall = z14;
                }
            } else {
                z14 = true;
            }
            z15 = true;
            this.currentUserIsVideo = z15;
            if (z15) {
                this.isVideoCall = z14;
            }
        }
        if (z17) {
            this.currentUserCameraFloatingLayout.saveRelativePosition();
            this.callingUserMiniFloatingLayout.saveRelativePosition();
        }
        if (this.callingUserIsVideo) {
            i = 0;
        } else {
            if (this.switchingToPip) {
                f9 = 1.0f;
                this.gradientLayout.setAlpha(1.0f);
            } else {
                f9 = 1.0f;
            }
            if (z17) {
                this.callingUserTextureView.animate().alpha(f9).setDuration(250L).start();
            } else {
                this.callingUserTextureView.animate().cancel();
                this.callingUserTextureView.setAlpha(f9);
            }
            if (this.callingUserTextureView.renderer.isFirstFrameRendered()) {
                i = 0;
            } else {
                i = 0;
            }
        }
        if (this.currentUserIsVideo) {
            this.gradientLayout.setVisibility(4);
        } else {
            this.gradientLayout.setVisibility(4);
        }
        z3 = this.currentUserIsVideo;
        if (z3) {
            this.cameraForceExpanded = false;
        } else {
            this.cameraForceExpanded = false;
        }
        if (z3) {
            z4 = false;
        } else {
            z4 = false;
        }
        showCallingUserAvatarMini(z17, z2);
        if (this.callingUserPhotoViewMini.getTag() == null) {
            iDp = 0;
        } else {
            iDp = AndroidUtilities.dp(135.0f) + AndroidUtilities.dp(12.0f);
        }
        showAcceptDeclineView(z16, z17);
        VoIPWindowView voIPWindowView2 = this.windowView;
        if (this.lockOnScreen) {
            z5 = true;
        } else {
            z5 = true;
        }
        voIPWindowView2.setLockOnScreen(z5);
        if (this.currentState == 3) {
            z6 = false;
        } else {
            z6 = false;
        }
        this.canHideUI = z6;
        if (!z6) {
            showUi(true);
        }
        if (this.uiVisible) {
            AndroidUtilities.runOnUIThread(this.hideUIRunnable, 3000L);
            this.hideUiRunnableWaiting = true;
        }
        i2 = this.currentState;
        if (i2 == 11) {
            z7 = false;
        } else {
            z7 = false;
        }
        if (z16) {
            z8 = false;
        } else {
            z8 = false;
        }
        if (z17) {
            if (z7) {
                f6 = 80.0f;
                this.backIcon.animate().alpha(1.0f).start();
            } else {
                f6 = 80.0f;
                if (this.backIcon.getVisibility() != 0) {
                    this.backIcon.setVisibility(0);
                    f7 = 0.0f;
                    this.backIcon.setAlpha(0.0f);
                } else {
                    f7 = 0.0f;
                }
                this.backIcon.animate().alpha(f7).start();
            }
            if (z8) {
                this.addIcon.animate().alpha(1.0f).start();
            } else {
                if (this.addIcon.getVisibility() != 0) {
                    this.addIcon.setVisibility(0);
                    f8 = 0.0f;
                    this.addIcon.setAlpha(0.0f);
                } else {
                    f8 = 0.0f;
                }
                this.addIcon.animate().alpha(f8).start();
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate3 = this.notificationsLayout.animate();
            int i110 = -AndroidUtilities.dp(16.0f);
            if (this.uiVisible) {
                iDp3 = AndroidUtilities.dp(f6);
            } else {
                iDp3 = 0;
            }
            viewPropertyAnimatorAnimate3.translationY(i110 - iDp3).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
        } else {
            ImageView imageView5 = this.backIcon;
            if (z7) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView5.setVisibility(i3);
            ImageView imageView6 = this.backIcon;
            if (z7) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            imageView6.setAlpha(f);
            ImageView imageView7 = this.addIcon;
            if (z8) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            imageView7.setVisibility(i4);
            ImageView imageView8 = this.addIcon;
            if (z8) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            imageView8.setAlpha(f2);
            VoIPNotificationsLayout voIPNotificationsLayout7 = this.notificationsLayout;
            int i111 = -AndroidUtilities.dp(16.0f);
            if (this.uiVisible) {
                iDp2 = AndroidUtilities.dp(80.0f);
            } else {
                iDp2 = 0;
            }
            voIPNotificationsLayout7.setTranslationY(i111 - iDp2);
        }
        i5 = this.currentState;
        if (i5 != 10) {
            updateButtons(z17);
        }
        if (i10 != 0) {
            this.statusTextView.showTimer(z17);
        }
        this.statusTextView.showReconnect(z, z17);
        if (this.callingUserPhotoViewMini.getVisibility() == 0) {
            iDp += AndroidUtilities.dp(24.0f);
            layout = this.emojiRationalTextView.getLayout();
            if (layout != null) {
                iDp = CalendarActivity$$ExternalSyntheticOutline0.m(lineCount, 2, AndroidUtilities.dp(20.0f), iDp);
            }
        }
        if (this.currentState == 11) {
            iDp -= AndroidUtilities.dp(24.0f);
        }
        if (this.currentUserIsVideo) {
            iDp -= AndroidUtilities.dp(60.0f);
        } else {
            iDp -= AndroidUtilities.dp(60.0f);
        }
        if (z17) {
            if (this.emojiExpanded) {
                j = 250;
                this.statusLayout.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            } else {
                j = 250;
                this.statusLayout.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            }
            if (iDp != this.statusLayoutAnimateToOffset) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate4 = this.statusLayout.animate();
                if (this.currentState != 11) {
                    j = 0;
                }
                viewPropertyAnimatorAnimate4.setStartDelay(j).translationY(iDp).setDuration(200L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            }
        } else {
            this.statusLayout.setTranslationY(iDp);
        }
        this.statusLayoutAnimateToOffset = iDp;
        if (sharedInstance == null) {
            z9 = false;
        } else {
            z9 = false;
        }
        i6 = this.currentState;
        if (i6 != 11) {
            z10 = false;
        } else {
            z10 = false;
        }
        this.canSwitchToPip = z10;
        if (sharedInstance != null) {
            if (this.currentUserIsVideo) {
                sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
            }
            this.currentUserTextureView.setIsScreencast(sharedInstance.isScreencast());
            this.currentUserTextureView.renderer.setMirror(sharedInstance.isFrontFaceCamera());
            if (this.currentUserIsVideo) {
                anonymousClass1 = null;
            } else {
                anonymousClass1 = null;
            }
            if (!this.windowViewSkipRender) {
                if (z4) {
                    videoSink = this.callingUserMiniTextureRenderer;
                } else {
                    VoIPTextureView voIPTextureView2 = this.callingUserTextureView;
                    videoSink = voIPTextureView2.renderer;
                }
            } else if (z4) {
                videoSink = this.callingUserMiniTextureRenderer;
            } else {
                VoIPTextureView voIPTextureView3 = this.callingUserTextureView;
                videoSink = voIPTextureView3.renderer;
            }
            sharedInstance.setSinks(anonymousClass1, videoSink);
            if (z17) {
                voIPNotificationsLayout4 = this.notificationsLayout;
                voIPNotificationsLayout4.wasChanged = false;
                if (!voIPNotificationsLayout4.lockAnimation) {
                    TransitionManager.beginDelayedTransition(voIPNotificationsLayout4, voIPNotificationsLayout4.transitionSet);
                }
            }
            if (sharedInstance.isMicMute()) {
                this.notificationsLayout.addNotification(R.drawable.calls_mute_mini, LocaleController.getString(R.string.VoipMyMicrophoneState), "self-muted");
            } else {
                this.notificationsLayout.removeNotification("self-muted");
            }
            objEllipsize = "";
            if (this.currentUserIsVideo) {
                if (sharedInstance.getRemoteAudioState() == 0) {
                    voIPNotificationsLayout2 = this.notificationsLayout;
                    int i112 = R.drawable.calls_mute_mini;
                    int i113 = R.string.VoipUserMicrophoneIsOff;
                    f5 = 300.0f;
                    firstName2 = UserObject.getFirstName(this.callingUser);
                    if (firstName2 == null) {
                        voIPNotificationsLayout2.getClass();
                        charSequenceEllipsize = "";
                    } else {
                        charSequenceEllipsize = TextUtils.ellipsize(firstName2, voIPNotificationsLayout2.textPaint, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
                    }
                    voIPNotificationsLayout2.addNotification(i112, LocaleController.formatString("VoipUserMicrophoneIsOff", i113, charSequenceEllipsize), "muted");
                } else {
                    f5 = 300.0f;
                    this.notificationsLayout.removeNotification("muted");
                }
                if (sharedInstance.getRemoteVideoState() == 0) {
                    voIPNotificationsLayout = this.notificationsLayout;
                    int i114 = R.drawable.calls_camera_mini;
                    int i24 = R.string.VoipUserCameraIsOff;
                    firstName = UserObject.getFirstName(this.callingUser);
                    if (firstName == null) {
                        voIPNotificationsLayout.getClass();
                    } else {
                        objEllipsize = TextUtils.ellipsize(firstName, voIPNotificationsLayout.textPaint, AndroidUtilities.dp(f5), TextUtils.TruncateAt.END);
                    }
                    voIPNotificationsLayout.addNotification(i114, LocaleController.formatString("VoipUserCameraIsOff", i24, objEllipsize), "video");
                } else {
                    this.notificationsLayout.removeNotification("video");
                }
            } else {
                if (sharedInstance.getRemoteAudioState() == 0) {
                    voIPNotificationsLayout2 = this.notificationsLayout;
                    int i115 = R.drawable.calls_mute_mini;
                    int i116 = R.string.VoipUserMicrophoneIsOff;
                    f5 = 300.0f;
                    firstName2 = UserObject.getFirstName(this.callingUser);
                    if (firstName2 == null) {
                        voIPNotificationsLayout2.getClass();
                        charSequenceEllipsize = "";
                    } else {
                        charSequenceEllipsize = TextUtils.ellipsize(firstName2, voIPNotificationsLayout2.textPaint, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
                    }
                    voIPNotificationsLayout2.addNotification(i115, LocaleController.formatString("VoipUserMicrophoneIsOff", i116, charSequenceEllipsize), "muted");
                } else {
                    f5 = 300.0f;
                    this.notificationsLayout.removeNotification("muted");
                }
                if (sharedInstance.getRemoteVideoState() == 0) {
                    voIPNotificationsLayout = this.notificationsLayout;
                    int i117 = R.drawable.calls_camera_mini;
                    int i25 = R.string.VoipUserCameraIsOff;
                    firstName = UserObject.getFirstName(this.callingUser);
                    if (firstName == null) {
                        voIPNotificationsLayout.getClass();
                    } else {
                        objEllipsize = TextUtils.ellipsize(firstName, voIPNotificationsLayout.textPaint, AndroidUtilities.dp(f5), TextUtils.TruncateAt.END);
                    }
                    voIPNotificationsLayout.addNotification(i117, LocaleController.formatString("VoipUserCameraIsOff", i25, objEllipsize), "video");
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
            if (z17) {
                voIPNotificationsLayout3 = this.notificationsLayout;
                if (voIPNotificationsLayout3.wasChanged) {
                    voIPNotificationsLayout3.lockAnimation = true;
                    AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda9(voIPNotificationsLayout3, 20), 700L);
                }
                voIPNotificationsLayout3.wasChanged = false;
            }
        }
        childsHight = this.notificationsLayout.getChildsHight();
        voIPFloatingLayout = this.callingUserMiniFloatingLayout;
        if (voIPFloatingLayout.getParent() == null) {
            voIPFloatingLayout.bottomOffset = childsHight;
        } else {
            voIPFloatingLayout.bottomOffset = childsHight;
        }
        voIPFloatingLayout2 = this.currentUserCameraFloatingLayout;
        if (voIPFloatingLayout2.getParent() == null) {
            voIPFloatingLayout2.bottomOffset = childsHight;
        } else {
            voIPFloatingLayout2.bottomOffset = childsHight;
        }
        this.currentUserCameraFloatingLayout.setUiVisible(this.uiVisible);
        this.callingUserMiniFloatingLayout.setUiVisible(this.uiVisible);
        if (this.currentUserIsVideo) {
            z11 = true;
            showFloatingLayout(0, z17);
        } else if (this.callingUserIsVideo) {
            z11 = true;
            showFloatingLayout(1, z17);
        } else {
            z11 = true;
            showFloatingLayout(1, z17);
        }
        if (!z4) {
            if (!z4) {
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
        } else if (!z4) {
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
        voIPFloatingLayout3 = this.currentUserCameraFloatingLayout;
        voIPFloatingLayout3.updatePadding();
        f3 = voIPFloatingLayout3.savedRelativePositionX;
        if (f3 >= 0.0f) {
            voIPFloatingLayout3.setRelativePositionInternal(f3, voIPFloatingLayout3.savedRelativePositionY, voIPFloatingLayout3.getMeasuredWidth(), voIPFloatingLayout3.getMeasuredHeight(), true);
            voIPFloatingLayout3.savedRelativePositionX = -1.0f;
            voIPFloatingLayout3.savedRelativePositionY = -1.0f;
        }
        voIPFloatingLayout4 = this.callingUserMiniFloatingLayout;
        voIPFloatingLayout4.updatePadding();
        f4 = voIPFloatingLayout4.savedRelativePositionX;
        if (f4 >= 0.0f) {
            voIPFloatingLayout4.setRelativePositionInternal(f4, voIPFloatingLayout4.savedRelativePositionY, voIPFloatingLayout4.getMeasuredWidth(), voIPFloatingLayout4.getMeasuredHeight(), true);
            voIPFloatingLayout4.savedRelativePositionX = -1.0f;
            voIPFloatingLayout4.savedRelativePositionY = -1.0f;
        }
        updateSpeakerPhoneIcon();
        if (this.currentState == 3) {
            this.voIpCoverView.onConnected();
            this.callingUserPhotoViewMini.onConnected();
            i7 = this.gradientLayout.state;
            if (i7 == 2) {
            }
        }
        if (this.currentUserIsVideo) {
            z12 = true;
        } else {
            z12 = true;
        }
        this.voIpSnowView.setState(z12);
        this.voIpCoverView.setState(z12);
        this.backgroundProvider.setHasVideo(z12);
        if (this.callingUserIsVideo) {
            this.isNearEar = false;
            if (sharedInstance != null) {
                sharedInstance.playStartRecordSound();
            }
        }
        if (z12) {
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
        if (this.pipSource != null) {
            int i26 = PipSource.sourceIdCounter;
        }
    }

    public Animator createPiPTransition(boolean z) {
        char c;
        char c2;
        float measuredWidth;
        final float measuredHeight;
        float measuredWidth2;
        final boolean z2;
        final float fDp;
        final float fDp2;
        final float f;
        float f2;
        float f3;
        float f4;
        this.currentUserCameraFloatingLayout.animate().cancel();
        VoIPPiPView voIPPiPView = VoIPPiPView.instance;
        WindowManager.LayoutParams layoutParams = voIPPiPView.windowLayoutParams;
        float f5 = layoutParams.x + voIPPiPView.xOffset;
        float f6 = layoutParams.y + voIPPiPView.yOffset;
        final float x = this.currentUserCameraFloatingLayout.getX();
        final float y = this.currentUserCameraFloatingLayout.getY();
        final float scaleX = this.currentUserCameraFloatingLayout.getScaleX();
        VoIPPiPView.instance.getClass();
        final float measuredWidth3 = f5 - ((this.callingUserTextureView.getMeasuredWidth() - (this.callingUserTextureView.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f6 - ((this.callingUserTextureView.getMeasuredHeight() - (this.callingUserTextureView.getMeasuredHeight() * 0.25f)) / 2.0f);
        if (this.callingUserIsVideo) {
            int measuredWidth4 = this.currentUserCameraFloatingLayout.getMeasuredWidth();
            c = 0;
            if (!this.currentUserIsVideo || measuredWidth4 == 0) {
                c2 = 1;
                measuredWidth2 = 0.0f;
                z2 = false;
                measuredWidth = 1.0f;
                measuredHeight = 1.0f;
            } else {
                measuredWidth2 = (this.windowView.getMeasuredWidth() / measuredWidth4) * 0.25f * 0.4f;
                c2 = 1;
                float measuredWidth5 = f5 - ((this.currentUserCameraFloatingLayout.getMeasuredWidth() - (this.currentUserCameraFloatingLayout.getMeasuredWidth() * measuredWidth2)) / 2.0f);
                float f7 = VoIPPiPView.instance.parentWidth * 0.25f;
                measuredWidth = ((measuredWidth5 + f7) - (f7 * 0.4f)) - AndroidUtilities.dp(4.0f);
                float measuredHeight3 = f6 - ((this.currentUserCameraFloatingLayout.getMeasuredHeight() - (this.currentUserCameraFloatingLayout.getMeasuredHeight() * measuredWidth2)) / 2.0f);
                float f8 = VoIPPiPView.instance.parentHeight * 0.25f;
                measuredHeight = ((measuredHeight3 + f8) - (f8 * 0.4f)) - AndroidUtilities.dp(4.0f);
            }
            if (this.callingUserIsVideo) {
                fDp = AndroidUtilities.dp(4.0f);
            } else {
                fDp = 0.0f;
            }
            fDp2 = (AndroidUtilities.dp(4.0f) * 1.0f) / measuredWidth2;
            if (this.callingUserIsVideo) {
                VoIPPiPView.instance.getClass();
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            if (z) {
                if (z2) {
                    this.currentUserCameraFloatingLayout.setScaleX(measuredWidth2);
                    this.currentUserCameraFloatingLayout.setScaleY(measuredWidth2);
                    this.currentUserCameraFloatingLayout.setTranslationX(measuredWidth);
                    this.currentUserCameraFloatingLayout.setTranslationY(measuredHeight);
                    this.currentUserCameraFloatingLayout.setCornerRadius(fDp2);
                    this.currentUserCameraFloatingLayout.setAlpha(f);
                }
                this.callingUserTextureView.setScaleX(0.25f);
                this.callingUserTextureView.setScaleY(0.25f);
                this.callingUserTextureView.setTranslationX(measuredWidth3);
                this.callingUserTextureView.setTranslationY(measuredHeight2);
                this.callingUserTextureView.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / 0.25f);
            }
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            if (z) {
                f3 = 0.0f;
            } else {
                f3 = 1.0f;
            }
            float[] fArr = new float[2];
            fArr[c] = f2;
            fArr[c2] = f3;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            if (z) {
                f4 = 0.0f;
            } else {
                f4 = 1.0f;
            }
            this.enterTransitionProgress = f4;
            updateSystemBarColors();
            final float f9 = measuredWidth;
            final float f10 = measuredWidth2;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$createPiPTransition$20(z2, scaleX, f10, x, f9, y, measuredHeight, fDp, fDp2, 1.0f, f, 1.0f, 0.25f, 0.0f, measuredWidth3, 0.0f, measuredHeight2, valueAnimator);
                }
            });
            return valueAnimatorOfFloat;
        }
        c = 0;
        c2 = 1;
        measuredWidth = f5 - ((this.currentUserCameraFloatingLayout.getMeasuredWidth() - (this.currentUserCameraFloatingLayout.getMeasuredWidth() * 0.25f)) / 2.0f);
        measuredHeight = f6 - ((this.currentUserCameraFloatingLayout.getMeasuredHeight() - (this.currentUserCameraFloatingLayout.getMeasuredHeight() * 0.25f)) / 2.0f);
        measuredWidth2 = 0.25f;
        z2 = true;
        if (this.callingUserIsVideo) {
            fDp = AndroidUtilities.dp(4.0f);
        } else {
            fDp = 0.0f;
        }
        fDp2 = (AndroidUtilities.dp(4.0f) * 1.0f) / measuredWidth2;
        if (this.callingUserIsVideo) {
            VoIPPiPView.instance.getClass();
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (z) {
            if (z2) {
                this.currentUserCameraFloatingLayout.setScaleX(measuredWidth2);
                this.currentUserCameraFloatingLayout.setScaleY(measuredWidth2);
                this.currentUserCameraFloatingLayout.setTranslationX(measuredWidth);
                this.currentUserCameraFloatingLayout.setTranslationY(measuredHeight);
                this.currentUserCameraFloatingLayout.setCornerRadius(fDp2);
                this.currentUserCameraFloatingLayout.setAlpha(f);
            }
            this.callingUserTextureView.setScaleX(0.25f);
            this.callingUserTextureView.setScaleY(0.25f);
            this.callingUserTextureView.setTranslationX(measuredWidth3);
            this.callingUserTextureView.setTranslationY(measuredHeight2);
            this.callingUserTextureView.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / 0.25f);
        }
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        float[] fArr2 = new float[2];
        fArr2[c] = f2;
        fArr2[c2] = f3;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr2);
        if (z) {
            f4 = 0.0f;
        } else {
            f4 = 1.0f;
        }
        this.enterTransitionProgress = f4;
        updateSystemBarColors();
        final float f11 = measuredWidth;
        final float f12 = measuredWidth2;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$createPiPTransition$20(z2, scaleX, f12, x, f11, y, measuredHeight, fDp, fDp2, 1.0f, f, 1.0f, 0.25f, 0.0f, measuredWidth3, 0.0f, measuredHeight2, valueAnimator);
            }
        });
        return valueAnimatorOfFloat2;
    }

    public View createView(Context context) {
        int i = 2;
        int i2 = 5;
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(context, AccessibilityManager.class);
        FrameLayout frameLayout = new FrameLayout(context) {
            boolean check;
            long pressedTime;
            float pressedX;
            float pressedY;

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (view == VoIPFragment.this.gradientLayout) {
                    VoIPFragment voIPFragment = VoIPFragment.this;
                    if (voIPFragment.currentUserIsVideo || voIPFragment.callingUserIsVideo) {
                        return false;
                    }
                }
                if ((view != VoIPFragment.this.gradientLayout && view != VoIPFragment.this.callingUserTextureView && (view != VoIPFragment.this.currentUserCameraFloatingLayout || !VoIPFragment.this.currentUserCameraIsFullscreen)) || (!VoIPFragment.this.zoomStarted && VoIPFragment.this.zoomBackAnimator == null)) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                VoIPFragment voIPFragment2 = VoIPFragment.this;
                float f = voIPFragment2.pinchScale;
                canvas.scale(f, f, voIPFragment2.pinchCenterX, VoIPFragment.this.pinchCenterY);
                canvas.translate(VoIPFragment.this.pinchTranslationX, VoIPFragment.this.pinchTranslationY);
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild;
            }

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
                        if (GroupCallActivity.isLandscapeMode) {
                            rectF.top = Math.max(rectF.top, ActionBar.getCurrentActionBarHeight());
                            rectF.right = Math.min(rectF.right, fullscreenTextureView.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                        } else {
                            rectF.top = Math.max(rectF.top, ActionBar.getCurrentActionBarHeight());
                            rectF.bottom = Math.min(rectF.bottom, fullscreenTextureView.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                        }
                        VoIPFragment.this.canZoomGesture = rectF.contains(motionEvent.getX(), motionEvent.getY());
                        if (!VoIPFragment.this.canZoomGesture) {
                            VoIPFragment.this.finishZoom();
                        }
                    }
                    if (VoIPFragment.this.canZoomGesture && !VoIPFragment.this.isInPinchToZoomTouchMode && motionEvent.getPointerCount() == 2) {
                        VoIPFragment.this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        VoIPFragment voIPFragment = VoIPFragment.this;
                        voIPFragment.pinchStartCenterX = voIPFragment.pinchCenterX = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        VoIPFragment voIPFragment2 = VoIPFragment.this;
                        voIPFragment2.pinchStartCenterY = voIPFragment2.pinchCenterY = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        VoIPFragment voIPFragment3 = VoIPFragment.this;
                        voIPFragment3.pinchScale = 1.0f;
                        voIPFragment3.pointerId1 = motionEvent.getPointerId(0);
                        VoIPFragment.this.pointerId2 = motionEvent.getPointerId(1);
                        VoIPFragment.this.isInPinchToZoomTouchMode = true;
                    }
                } else if (motionEvent.getActionMasked() == 2 && VoIPFragment.this.isInPinchToZoomTouchMode) {
                    int i3 = -1;
                    int i4 = -1;
                    for (int i5 = 0; i5 < motionEvent.getPointerCount(); i5++) {
                        if (VoIPFragment.this.pointerId1 == motionEvent.getPointerId(i5)) {
                            i3 = i5;
                        }
                        if (VoIPFragment.this.pointerId2 == motionEvent.getPointerId(i5)) {
                            i4 = i5;
                        }
                    }
                    if (i3 == -1 || i4 == -1) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        VoIPFragment.this.finishZoom();
                    } else {
                        VoIPFragment.this.pinchScale = ((float) Math.hypot(motionEvent.getX(i4) - motionEvent.getX(i3), motionEvent.getY(i4) - motionEvent.getY(i3))) / VoIPFragment.this.pinchStartDistance;
                        VoIPFragment voIPFragment4 = VoIPFragment.this;
                        if (voIPFragment4.pinchScale > 1.005f && !voIPFragment4.zoomStarted) {
                            VoIPFragment.this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(i4) - motionEvent.getX(i3), motionEvent.getY(i4) - motionEvent.getY(i3));
                            VoIPFragment voIPFragment5 = VoIPFragment.this;
                            voIPFragment5.pinchStartCenterX = voIPFragment5.pinchCenterX = (motionEvent.getX(i4) + motionEvent.getX(i3)) / 2.0f;
                            VoIPFragment voIPFragment6 = VoIPFragment.this;
                            voIPFragment6.pinchStartCenterY = voIPFragment6.pinchCenterY = (motionEvent.getY(i4) + motionEvent.getY(i3)) / 2.0f;
                            VoIPFragment voIPFragment7 = VoIPFragment.this;
                            voIPFragment7.pinchScale = 1.0f;
                            voIPFragment7.pinchTranslationX = 0.0f;
                            VoIPFragment.this.pinchTranslationY = 0.0f;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            VoIPFragment.this.zoomStarted = true;
                            VoIPFragment.this.isInPinchToZoomTouchMode = true;
                        }
                        float x = (motionEvent.getX(i4) + motionEvent.getX(i3)) / 2.0f;
                        float y = (motionEvent.getY(i4) + motionEvent.getY(i3)) / 2.0f;
                        float f = VoIPFragment.this.pinchStartCenterX - x;
                        float f2 = VoIPFragment.this.pinchStartCenterY - y;
                        VoIPFragment voIPFragment8 = VoIPFragment.this;
                        voIPFragment8.pinchTranslationX = (-f) / voIPFragment8.pinchScale;
                        VoIPFragment voIPFragment9 = VoIPFragment.this;
                        voIPFragment9.pinchTranslationY = (-f2) / voIPFragment9.pinchScale;
                        invalidate();
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
                    float f3 = (y2 * y2) + (x2 * x2);
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
        };
        boolean z = false;
        z = false;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        frameLayout.setBackgroundColor(-16777216);
        updateSystemBarColors();
        this.fragmentView = frameLayout;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        int i3 = 1;
        this.gradientLayout = new VoIpGradientLayout(context, sharedState != null && sharedState.isConference(), this.backgroundProvider);
        VoIPTextureView voIPTextureView = new VoIPTextureView(context, false, true, false, false);
        this.callingUserTextureView = voIPTextureView;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        voIPTextureView.renderer.setScalingType(scalingType);
        this.callingUserTextureView.renderer.setEnableHardwareScaler(true);
        this.callingUserTextureView.renderer.setRotateTextureWithScreen(true);
        this.callingUserTextureView.scaleType = 1;
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
        voIPFloatingLayout.setDelegate(new VoIPFragment$$ExternalSyntheticLambda19(this, i2));
        this.currentUserCameraFloatingLayout.setRelativePosition(1.0f, 1.0f);
        this.currentUserCameraIsFullscreen = true;
        VoIPTextureView voIPTextureView2 = new VoIPTextureView(context, true, false, true, false);
        this.currentUserTextureView = voIPTextureView2;
        voIPTextureView2.renderer.setIsCamera(true);
        this.currentUserTextureView.renderer.setUseCameraRotation(true);
        this.currentUserCameraFloatingLayout.setOnTapListener(new VoIPFragment$$ExternalSyntheticLambda28(this, i3));
        this.currentUserTextureView.renderer.setMirror(true);
        this.currentUserCameraFloatingLayout.addView(this.currentUserTextureView);
        VoIPFloatingLayout voIPFloatingLayout2 = new VoIPFloatingLayout(context);
        this.callingUserMiniFloatingLayout = voIPFloatingLayout2;
        voIPFloatingLayout2.alwaysFloating = true;
        voIPFloatingLayout2.setFloatingMode(true, false);
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context);
        this.callingUserMiniTextureRenderer = textureViewRenderer;
        textureViewRenderer.setEnableHardwareScaler(true);
        this.callingUserMiniTextureRenderer.setIsCamera(false);
        this.callingUserMiniTextureRenderer.setFpsReduction(30.0f);
        this.callingUserMiniTextureRenderer.setScalingType(scalingType);
        this.callingUserMiniFloatingLayout.addView(this.callingUserMiniTextureRenderer, LayoutHelper.createFrame(-1, -2, 17));
        this.callingUserMiniFloatingLayout.setOnTapListener(new VoIPFragment$$ExternalSyntheticLambda28(this, i));
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
        this.emojiLayout.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda28(this, 3));
        this.hideEmojiTextView = new HideEmojiTextView(context, this.backgroundProvider);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.hideEmojiLayout = frameLayout2;
        frameLayout2.addView(this.hideEmojiTextView, LayoutHelper.createFrame(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
        this.hideEmojiLayout.setVisibility(8);
        this.hideEmojiLayout.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda28(this, 4));
        FloatingToolbar.AnonymousClass2 anonymousClass2 = new FloatingToolbar.AnonymousClass2(context, this.backgroundProvider);
        this.emojiRationalLayout = anonymousClass2;
        anonymousClass2.setOrientation(1);
        TextView textView = new TextView(context);
        this.emojiRationalTopTextView = textView;
        textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
        this.emojiRationalTopTextView.setTextSize(1, 15.0f);
        this.emojiRationalTopTextView.setTypeface(AndroidUtilities.bold());
        this.emojiRationalTopTextView.setTextColor(-1);
        this.emojiRationalTopTextView.setGravity(17);
        TextView textView2 = new TextView(context) {
            @Override
            public void onLayout(boolean z2, int i4, int i5, int i6, int i7) {
                super.onLayout(z2, i4, i5, i6, i7);
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
        int i4 = 0;
        while (i4 < 4) {
            this.emojiViews[i4] = new BackupImageView(context);
            this.emojiViews[i4].getImageReceiver().setAspectFit(true);
            this.emojiLayout.addView(this.emojiViews[i4], LayoutHelper.createLinear(25, 25, i4 == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f));
            i4++;
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
                if (sharedState2.getPrivateCall() == null || !sharedState2.getPrivateCall().video) {
                    sb.append(LocaleController.getString(R.string.VoipInCallBranding));
                } else {
                    sb.append(LocaleController.getString(R.string.VoipInVideoCallBranding));
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
        this.callingUserPhotoViewMini.backupImageView.setImage(ImageLocation.getForUserOrChat(this.currentAccount, this.callingUser, 0), (String) null, avatarDrawable, this.callingUser);
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
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        voIPStatusTextView.setImportantForAccessibility(4);
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
            public void dispatchSetPressed(boolean z2) {
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
        imageView.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(-1, 76), 1, -1));
        this.addIcon.setImageResource(R.drawable.msg_addcontact);
        this.addIcon.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        frameLayout.addView(this.addIcon, LayoutHelper.createFrame(56, 56, 53));
        ScaleStateListAnimator.apply(this.addIcon);
        ImageView imageView2 = new ImageView(context);
        this.backIcon = imageView2;
        imageView2.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(-1, 76), 1, -1));
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
        this.speakerPhoneIcon.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(-1, 76), 1, -1));
        this.speakerPhoneIcon.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.addView(this.speakerPhoneIcon, LayoutHelper.createFrame(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
        this.speakerPhoneIcon.setAlpha(0.0f);
        this.speakerPhoneIcon.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda28(this, 5));
        this.backIcon.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda28(this, 6));
        this.addIcon.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda40(z ? 1 : 0, this, context));
        if (this.windowView.isLockOnScreen()) {
            this.backIcon.setVisibility(8);
            this.addIcon.setVisibility(8);
        }
        VoIPNotificationsLayout voIPNotificationsLayout = new VoIPNotificationsLayout(context, this.backgroundProvider);
        this.notificationsLayout = voIPNotificationsLayout;
        voIPNotificationsLayout.setGravity(80);
        this.notificationsLayout.setOnViewsUpdated(new VoIPFragment$$ExternalSyntheticLambda1(this, 9));
        frameLayout.addView(this.notificationsLayout, LayoutHelper.createFrame(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        HintView2 multilineText = new VoIpHintView(context, 3, this.backgroundProvider, true).setMultilineText(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        HintView2 rounding = multilineText.setTextAlign(alignment).setDuration(-1L).setOnHiddenListener(new VoIPFragment$$ExternalSyntheticLambda1(this, 10)).setHideByTouch(true).setMaxWidth(320.0f).useScale(true).setInnerPadding(10.0f, 6.0f, 10.0f, 6.0f).setRounding(8.0f);
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

    public void finish() {
        this.windowView.finish();
    }

    @Override
    public void onAudioSettingsChanged() {
        updateButtons(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        VoIPService.StateListener.CC.$default$onCameraFirstFrameAvailable(this);
    }

    @Override
    public void onCameraSwitch(boolean z) {
        this.previousState = this.currentState;
        updateViewState();
    }

    @Override
    public void onMediaStateUpdated(int i, int i2) {
        this.previousState = this.currentState;
        if (i2 == 2 && !this.isVideoCall) {
            this.isVideoCall = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getRemoteVideoState() != 2) {
            PipSource pipSource = this.pipSource;
            if (pipSource != null) {
                pipSource.destroy();
                this.pipSource = null;
            }
        } else if (this.pipSource == null && PipUtils.checkPermissions(this.activity) == 1) {
            PipSource.Builder builder = new PipSource.Builder(this.activity, instance);
            builder.tagPrefix = "voip-fragment-pip";
            VoIPTextureView voIPTextureView = this.callingUserTextureView;
            builder.contentView = voIPTextureView.renderer;
            builder.placeholderView = voIPTextureView.getPlaceholderView();
            this.pipSource = builder.build();
        }
        updateViewState();
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
                instance.lastInsets.getSystemWindowInsetBottom();
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
        if (VoIPPiPView.instance != null) {
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

    public void onScreenCastStart() {
        PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew = this.previewDialog;
        if (privateVideoPreviewDialogNew == null) {
            return;
        }
        privateVideoPreviewDialogNew.dismiss(true, true);
    }

    @Override
    public void onScreenOnChange(boolean z) {
    }

    @Override
    public void onSignalBarsCountChanged(int i) {
        VoIpGradientLayout voIpGradientLayout;
        if (i > 0) {
            this.signalBarWasReceived = true;
        }
        if (this.statusTextView == null || (voIpGradientLayout = this.gradientLayout) == null) {
            return;
        }
        int i2 = voIpGradientLayout.state;
        if ((i2 == 2 || i2 == 3) && this.signalBarWasReceived) {
            AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda6(this, i, 25), 400L);
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
    public void onVideoAvailableChange(boolean z) {
        this.previousState = this.currentState;
        if (z && !this.isVideoCall) {
            this.isVideoCall = true;
        }
        updateViewState();
    }

    public void pipCreateActionsList(ArrayList arrayList, String str, int i) {
    }

    @Override
    public View pipCreatePictureInPictureView() {
        VoIPTextureView voIPTextureView = new VoIPTextureView(this.activity, false, true, false, false);
        this.pipTextureView = voIPTextureView;
        voIPTextureView.renderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.pipTextureView.renderer.setEnableHardwareScaler(true);
        this.pipTextureView.renderer.setRotateTextureWithScreen(true);
        VoIPTextureView voIPTextureView2 = this.pipTextureView;
        voIPTextureView2.scaleType = 1;
        voIPTextureView2.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new RendererCommon.RendererEvents() {
            @Override
            public void onFirstFrameRendered() {
                if (VoIPFragment.this.firstFrameCallback != null) {
                    VoIPFragment.this.firstFrameCallback.run();
                    VoIPFragment.this.firstFrameCallback = null;
                }
            }

            @Override
            public void onFrameResolutionChanged(int i, int i2, int i3) {
            }
        });
        View view = this.pipTextureView.backgroundView;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.pipTextureView;
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
    public Bitmap pipCreatePrimaryWindowViewBitmap() {
        VoIPTextureView voIPTextureView = this.callingUserTextureView;
        if (voIPTextureView == null || !voIPTextureView.renderer.isAvailable()) {
            return null;
        }
        return this.callingUserTextureView.renderer.getBitmap();
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
    public boolean pipIsAvailable() {
        return true;
    }

    @Override
    public void pipRenderBackground(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    @Override
    public void pipRenderForeground(Canvas canvas) {
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

    public TLRPC.Document replaceEmojiToLottieFrame(CharSequence charSequence, int[] iArr) {
        TLRPC.Document document;
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(0, spannable.length(), Emoji.EmojiSpan.class);
            AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannable.getSpans(0, spannable.length(), AnimatedEmojiSpan.class);
            if (emojiSpanArr != null) {
                if (((iArr == null ? 0 : iArr[0]) - emojiSpanArr.length) - (animatedEmojiSpanArr == null ? 0 : animatedEmojiSpanArr.length) <= 0) {
                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = "StaticEmoji";
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, true, new PollItemMenu$$ExternalSyntheticLambda15(this, 23));
                        if (stickerSet == null) {
                            break;
                        }
                        String strReplace = emojiSpan.emoji.replace("️", "");
                        ArrayList<TLRPC.Document> arrayList = stickerSet.documents;
                        int size = arrayList.size();
                        int i = 0;
                        do {
                            if (i >= size) {
                                document = null;
                                break;
                            }
                            TLRPC.Document document2 = arrayList.get(i);
                            i++;
                            document = document2;
                        } while (!TextUtils.equals(MessageObject.findAnimatedEmojiEmoticon(document, null).replace("️", ""), strReplace));
                        if (document != null) {
                            return document;
                        }
                    }
                }
            }
        }
        return null;
    }

    public void startTransitionFromPiP() {
        this.enterFromPiP = true;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getVideoState(false) == 2) {
            this.callingUserTextureView.setStub(VoIPPiPView.instance.callingUserTextureView);
            this.currentUserTextureView.setStub(VoIPPiPView.instance.currentUserTextureView);
        }
        this.windowView.setAlpha(0.0f);
        updateViewState();
        this.switchingToPip = true;
        VoIPPiPView.switchingToPip = true;
        this.notificationsLocker.lock();
        AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda1(this, 7), 32L);
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
                instance.lastInsets.getSystemWindowInsetBottom();
            }
        }
        if (VoIPPiPView.instance == null) {
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
}
