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
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
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
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.stripe.android.Stripe;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
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
import org.telegram.messenger.pip.utils.Trigger;
import org.telegram.messenger.voip.EncryptionKeyEmojifier;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.DarkAlertDialog;
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
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.Tooltip$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.voip.AcceptDeclineView;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
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
import org.telegram.ui.Components.voip.VoIpHintView;
import org.telegram.ui.Components.voip.VoIpSnowView;
import org.telegram.ui.Components.voip.VoIpSwitchLayout;
import org.telegram.ui.web.WebBrowserSettings;
import org.webrtc.EglBase;
import org.webrtc.GlRectDrawer;
import org.webrtc.OrientationHelper;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;

public final class VoIPFragment implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, IPipSourceDelegate {
    public static VoIPFragment instance;
    public AcceptDeclineView acceptDeclineView;
    public AccessibilityManager accessibilityManager;
    public Activity activity;
    public ImageView addIcon;
    public UserSelectorBottomSheet addPeopleSheet;
    public ImageView backIcon;
    public AnonymousClass7 bottomEndCallBtn;
    public VoIpSwitchLayout bottomMuteBtn;
    public View bottomShadow;
    public VoIpSwitchLayout bottomSpeakerBtn;
    public VoIpSwitchLayout bottomVideoBtn;
    public VoIPButtonsLayout buttonsLayout;
    public final TLRPC.User callingUser;
    public boolean callingUserIsVideo;
    public VoIPFloatingLayout callingUserMiniFloatingLayout;
    public TextureViewRenderer callingUserMiniTextureRenderer;
    public ImageWithWavesView callingUserPhotoViewMini;
    public VoIPTextureView callingUserTextureView;
    public TextView callingUserTitle;
    public boolean cameraForceExpanded;
    public AnimatorSet cameraShowingAnimator;
    public boolean canHideUI;
    public boolean canSwitchToPip;
    public boolean canZoomGesture;
    public final int currentAccount;
    public int currentState;
    public final TLRPC.User currentUser;
    public VoIPFloatingLayout currentUserCameraFloatingLayout;
    public boolean currentUserCameraIsFullscreen;
    public boolean currentUserIsVideo;
    public VoIPTextureView currentUserTextureView;
    public boolean deviceIsLocked;
    public boolean emojiExpanded;
    public PhotoViewer.AnonymousClass35 emojiLayout;
    public boolean emojiLoaded;
    public GroupCallActivity.AnonymousClass61 emojiRationalLayout;
    public AnonymousClass5 emojiRationalTextView;
    public TextView emojiRationalTopTextView;
    public VoIpHintView encryptionTooltip;
    public EndCloseLayout endCloseLayout;
    public boolean enterFromPiP;
    public float enterTransitionProgress;
    public Trigger firstFrameCallback;
    public AnonymousClass2 fragmentView;
    public VoIpGradientLayout gradientLayout;
    public FrameLayout hideEmojiLayout;
    public HideEmojiTextView hideEmojiTextView;
    public boolean hideUiRunnableWaiting;
    public boolean isFinished;
    public boolean isInPinchToZoomTouchMode;
    public boolean isNearEar;
    public boolean isVideoCall;
    public long lastContentTapTime;
    public WindowInsets lastInsets;
    public VoIPNotificationsLayout notificationsLayout;
    public ConferenceParticipantsView participantsView;
    public float pinchCenterX;
    public float pinchCenterY;
    public float pinchStartCenterX;
    public float pinchStartCenterY;
    public float pinchStartDistance;
    public float pinchTranslationX;
    public float pinchTranslationY;
    public PipSource pipSource;
    public VoIPTextureView pipTextureView;
    public int pointerId1;
    public int pointerId2;
    public AnonymousClass24 previewDialog;
    public int previousState;
    public RateCallLayout rateCallLayout;
    public int selectedRating;
    public boolean signalBarWasReceived;
    public AnonymousClass9 speakerPhoneIcon;
    public int speakerPhoneIconResId;
    public AnonymousClass6 statusLayout;
    public int statusLayoutAnimateToOffset;
    public VoIPStatusTextView statusTextView;
    public boolean switchingToPip;
    public VoIpHintView tapToVideoTooltip;
    public View topShadow;
    public float touchSlop;
    public ValueAnimator uiVisibilityAnimator;
    public VoIpCoverView voIpCoverView;
    public VoIpSnowView voIpSnowView;
    public boolean wasEstablished;
    public AnonymousClass1 windowView;
    public boolean windowViewSkipRender;
    public ValueAnimator zoomBackAnimator;
    public boolean zoomStarted;
    public final VoIPBackgroundProvider backgroundProvider = new VoIPBackgroundProvider();
    public final BackupImageView[] emojiViews = new BackupImageView[4];
    public final Drawable[] emojiDrawables = new Drawable[4];
    public final Paint overlayPaint = new Paint();
    public final Paint overlayBottomPaint = new Paint();
    public boolean uiVisible = true;
    public float uiVisibilityAlpha = 1.0f;
    public final AnimationNotificationsLocker notificationsLocker = new AnimationNotificationsLocker();
    public final VoIPFragment$$ExternalSyntheticLambda4 statusbarAnimatorListener = new VoIPFragment$$ExternalSyntheticLambda4(this, 0);
    public final VoIPFragment$$ExternalSyntheticLambda2 hideUIRunnable = new VoIPFragment$$ExternalSyntheticLambda2(this, 12);
    public final VoIPFragment$$ExternalSyntheticLambda2 stopAnimatingBgRunnable = new VoIPFragment$$ExternalSyntheticLambda2(this, 13);
    public float pinchScale = 1.0f;

    public final class AnonymousClass11 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final VoIPFragment this$0;

        public AnonymousClass11(VoIPFragment voIPFragment, int i) {
            this.$r8$classId = i;
            this.this$0 = voIPFragment;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            PhotoViewer.AnonymousClass11 anonymousClass11;
            PhotoViewer.AnonymousClass11 anonymousClass12;
            switch (this.$r8$classId) {
                case 0:
                    VoIPFragment voIPFragment = this.this$0;
                    voIPFragment.zoomBackAnimator = null;
                    voIPFragment.pinchScale = 1.0f;
                    voIPFragment.pinchTranslationX = 0.0f;
                    voIPFragment.pinchTranslationY = 0.0f;
                    voIPFragment.fragmentView.invalidate();
                    break;
                case 1:
                    VoIPPiPView.instance.windowView.setAlpha(1.0f);
                    AndroidUtilities.runOnUIThread(new VoIPFragment$8$$ExternalSyntheticLambda1(this, 1), 200L);
                    break;
                case 2:
                    VoIPFragment voIPFragment2 = this.this$0;
                    voIPFragment2.notificationsLocker.unlock();
                    voIPFragment2.currentUserCameraFloatingLayout.setCornerRadius(-1.0f);
                    voIPFragment2.switchingToPip = false;
                    voIPFragment2.currentUserCameraFloatingLayout.switchingToPip = false;
                    voIPFragment2.previousState = voIPFragment2.currentState;
                    voIPFragment2.updateViewState$1();
                    break;
                case 3:
                    for (BackupImageView backupImageView : this.this$0.emojiViews) {
                        AnimatedEmojiDrawable animatedEmojiDrawable = backupImageView.animatedEmojiDrawable;
                        if (animatedEmojiDrawable != null && (anonymousClass11 = animatedEmojiDrawable.imageReceiver) != null) {
                            anonymousClass11.setAllowStartAnimation(true);
                            backupImageView.animatedEmojiDrawable.imageReceiver.startAnimation();
                        }
                    }
                    break;
                case 4:
                    VoIPFragment voIPFragment3 = this.this$0;
                    voIPFragment3.startWaitingFoHideUi();
                    for (BackupImageView backupImageView2 : voIPFragment3.emojiViews) {
                        AnimatedEmojiDrawable animatedEmojiDrawable2 = backupImageView2.animatedEmojiDrawable;
                        if (animatedEmojiDrawable2 != null && (anonymousClass12 = animatedEmojiDrawable2.imageReceiver) != null) {
                            anonymousClass12.setAllowStartAnimation(false);
                            backupImageView2.animatedEmojiDrawable.imageReceiver.stopAnimation();
                        }
                    }
                    voIPFragment3.emojiRationalLayout.setVisibility(8);
                    break;
                case 5:
                    VoIPFragment voIPFragment4 = this.this$0;
                    if (voIPFragment4.callingUserMiniFloatingLayout.getTag() == null) {
                        voIPFragment4.callingUserMiniFloatingLayout.setVisibility(8);
                    }
                    break;
                case 6:
                    VoIPFragment voIPFragment5 = this.this$0;
                    voIPFragment5.currentUserCameraFloatingLayout.setTranslationX(0.0f);
                    voIPFragment5.currentUserCameraFloatingLayout.setTranslationY(0.0f);
                    voIPFragment5.currentUserCameraFloatingLayout.setScaleY(1.0f);
                    voIPFragment5.currentUserCameraFloatingLayout.setScaleX(1.0f);
                    voIPFragment5.currentUserCameraFloatingLayout.setVisibility(8);
                    break;
                case 7:
                    this.this$0.callingUserPhotoViewMini.setVisibility(8);
                    break;
                default:
                    this.this$0.acceptDeclineView.setVisibility(8);
                    break;
            }
        }
    }

    public final class AnonymousClass12 implements RendererCommon.RendererEvents {
        public AnonymousClass12() {
        }

        @Override
        public final void onFirstFrameRendered() {
            AndroidUtilities.runOnUIThread(new VoIPFragment$12$$ExternalSyntheticLambda0(this, 0));
        }

        @Override
        public final void onFrameResolutionChanged(int i, int i2, int i3) {
        }
    }

    public final class AnonymousClass13 implements RendererCommon.RendererEvents {
        public AnonymousClass13() {
        }

        @Override
        public final void onFirstFrameRendered() {
            VoIPFragment voIPFragment = VoIPFragment.this;
            Trigger trigger = voIPFragment.firstFrameCallback;
            if (trigger != null) {
                trigger.run();
                voIPFragment.firstFrameCallback = null;
            }
            AndroidUtilities.runOnUIThread(new VoIPFragment$12$$ExternalSyntheticLambda0(this, 29));
        }

        @Override
        public final void onFrameResolutionChanged(int i, int i2, int i3) {
        }
    }

    public final class AnonymousClass23 extends Visibility {
        public final int $r8$classId;

        public AnonymousClass23(int i) {
            this.$r8$classId = i;
        }

        @Override
        public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
            switch (this.$r8$classId) {
                case 0:
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
                case 1:
                    if (!(view instanceof ActionBarMenuItem.SearchFilterView)) {
                        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.5f, 1.0f));
                    animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    return animatorSet;
                case 2:
                    if (!(view instanceof ActionBarMenuItem.SearchFilterView)) {
                        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.5f, 1.0f));
                    animatorSet2.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    return animatorSet2;
                case 3:
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(20.0f), 0.0f));
                    animatorSet3.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    return animatorSet3;
                case 4:
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.5f, 1.0f));
                    animatorSet4.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    return animatorSet4;
                default:
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    view.setAlpha(0.0f);
                    view.setScaleY(0.6f);
                    view.setScaleX(0.6f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.6f, 1.0f));
                    animatorSet5.setInterpolator(CubicBezierInterpolator.EASE_OUT_BACK);
                    return animatorSet5;
            }
        }

        @Override
        public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
            switch (this.$r8$classId) {
                case 0:
                    return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, view.getTranslationY(), AndroidUtilities.dp(100.0f)), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, view.getScaleY(), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, view.getScaleX(), 0.0f));
                case 1:
                    if (!(view instanceof ActionBarMenuItem.SearchFilterView)) {
                        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleX(), 0.5f));
                    animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    return animatorSet;
                case 2:
                    if (!(view instanceof ActionBarMenuItem.SearchFilterView)) {
                        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleX(), 0.5f));
                    animatorSet2.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    return animatorSet2;
                case 3:
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, -AndroidUtilities.dp(20.0f)));
                    animatorSet3.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    return animatorSet3;
                case 4:
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleX(), 0.5f));
                    animatorSet4.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    return animatorSet4;
                default:
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    if (view instanceof VoIPNotificationsLayout.NotificationView) {
                        ((VoIPNotificationsLayout.NotificationView) view).ignoreShader = true;
                    }
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.7f, 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f, 0.6f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.6f));
                    animatorSet5.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    return animatorSet5;
            }
        }
    }

    public final class AnonymousClass24 extends PrivateVideoPreviewDialogNew {
        public AnonymousClass24(Context context, float f, float f2) {
            super(context, f, f2);
        }

        @Override
        public final int[] getFloatingViewLocation() {
            int[] iArr = new int[2];
            VoIPFragment voIPFragment = VoIPFragment.this;
            voIPFragment.currentUserCameraFloatingLayout.getLocationOnScreen(iArr);
            return new int[]{iArr[0], iArr[1], voIPFragment.currentUserCameraFloatingLayout.getMeasuredWidth()};
        }
    }

    public final class AnonymousClass3 extends zzms {
        public final int $r8$classId;
        public final NotificationCenter.NotificationCenterDelegate this$0;

        public AnonymousClass3(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i) {
            this.$r8$classId = i;
            this.this$0 = notificationCenterDelegate;
        }

        @Override
        public void onAllSizesReady() {
            switch (this.$r8$classId) {
                case 0:
                    ((VoIPFragment) this.this$0).gradientLayout.invalidate();
                    break;
            }
        }

        @Override
        public void onSizeReady(int i, int i2) {
            switch (this.$r8$classId) {
                case 1:
                    Point point = AndroidUtilities.displaySize;
                    if ((point.x <= point.y) == (i <= i2)) {
                        ((ThemePreviewActivity) this.this$0).backgroundImage.invalidate();
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass5 extends TextView {
        public final int $r8$classId;
        public Object this$0;

        public AnonymousClass5(Object obj, Context context, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public void draw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 3:
                    super.draw(canvas);
                    SessionsActivity.ScanQRCodeView scanQRCodeView = (SessionsActivity.ScanQRCodeView) this.this$0;
                    if (scanQRCodeView.flickerDrawable.progress <= 1.0f) {
                        SessionsActivity sessionsActivity = SessionsActivity.this;
                        if (sessionsActivity.highlightLinkDesktopDevice && sessionsActivity.fragmentOpened) {
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                            int measuredWidth = getMeasuredWidth();
                            CellFlickerDrawable cellFlickerDrawable = scanQRCodeView.flickerDrawable;
                            cellFlickerDrawable.parentWidth = measuredWidth;
                            cellFlickerDrawable.draw(AndroidUtilities.dp(8.0f), canvas, rectF, null);
                            invalidate();
                            break;
                        }
                    }
                    break;
                default:
                    super.draw(canvas);
                    break;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 1:
                    super.onDraw(canvas);
                    if (((CellFlickerDrawable) this.this$0) == null) {
                        CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable(64, 204, 160);
                        this.this$0 = cellFlickerDrawable;
                        cellFlickerDrawable.drawFrame = false;
                        cellFlickerDrawable.repeatProgress = 2.0f;
                    }
                    ((CellFlickerDrawable) this.this$0).parentWidth = getMeasuredWidth();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((CellFlickerDrawable) this.this$0).draw(AndroidUtilities.dp(22.0f), canvas, rectF, null);
                    invalidate();
                    break;
                case 4:
                    super.onDraw(canvas);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), (Paint) this.this$0);
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 0:
                    super.onLayout(z, i, i2, i3, i4);
                    if (z) {
                        ((VoIPFragment) this.this$0).updateViewState$1();
                    }
                    break;
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 2:
                    super.onMeasure(i, i2);
                    if (LocaleController.isRTL) {
                        ((TranslateAlert2.HeaderView) this.this$0).titleTextView.setPivotX(getMeasuredWidth());
                    }
                    break;
                case 5:
                    super.onMeasure(i, i2);
                    ((WebBrowserSettings.WebsiteView) this.this$0).subtitleView.setPivotY(getMeasuredHeight() / 2.0f);
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        public AnonymousClass5(Activity activity, Paint paint) {
            super(activity);
            this.$r8$classId = 4;
            this.this$0 = paint;
        }

        public AnonymousClass5(Context context) {
            super(context);
            this.$r8$classId = 1;
        }
    }

    public final class AnonymousClass7 extends VoIPToggleButton {
        @Override
        public final void dispatchSetPressed(boolean z) {
            super.dispatchSetPressed(z);
            setPressedBtn(z);
        }
    }

    public final class AnonymousClass8 implements AcceptDeclineView.Listener {
        public AnonymousClass8() {
        }

        public final void onAccept() {
            VoIPFragment voIPFragment = VoIPFragment.this;
            if (voIPFragment.currentState != 17) {
                if (Build.VERSION.SDK_INT >= 23 && voIPFragment.activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    voIPFragment.activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                    return;
                } else {
                    if (VoIPService.getSharedState() != null) {
                        voIPFragment.runAcceptCallAnimation(new VoIPFragment$8$$ExternalSyntheticLambda1(this, 0));
                        return;
                    }
                    return;
                }
            }
            Intent intent = new Intent(voIPFragment.activity, (Class<?>) VoIPService.class);
            intent.putExtra("user_id", voIPFragment.callingUser.id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", voIPFragment.isVideoCall);
            intent.putExtra("can_video_call", voIPFragment.isVideoCall);
            intent.putExtra("account", voIPFragment.currentAccount);
            try {
                voIPFragment.activity.startService(intent);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    public final class AnonymousClass9 extends ImageView {
        public final int $r8$classId;

        public AnonymousClass9(Context context, int i) {
            super(context);
            this.$r8$classId = i;
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 2:
                    if (getAlpha() < 0.5f) {
                        return false;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                default:
                    return super.dispatchTouchEvent(motionEvent);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 4:
                    super.onDraw(canvas);
                    invalidate();
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            switch (this.$r8$classId) {
                case 0:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
                    accessibilityNodeInfo.setCheckable(true);
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null) {
                        accessibilityNodeInfo.setChecked(sharedInstance.isSpeakerphoneOn());
                    }
                    break;
                default:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            float f;
            float f2;
            switch (this.$r8$classId) {
                case 1:
                    super.onMeasure(i, i2);
                    Matrix imageMatrix = getImageMatrix();
                    int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                    int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                    int intrinsicWidth = getDrawable().getIntrinsicWidth();
                    int intrinsicHeight = getDrawable().getIntrinsicHeight();
                    if (intrinsicWidth * measuredHeight > intrinsicHeight * measuredWidth) {
                        f = measuredHeight;
                        f2 = intrinsicHeight;
                    } else {
                        f = measuredWidth;
                        f2 = intrinsicWidth;
                    }
                    float f3 = f / f2;
                    imageMatrix.setScale(f3, f3);
                    setImageMatrix(imageMatrix);
                    break;
                case 2:
                default:
                    super.onMeasure(i, i2);
                    break;
                case 3:
                    int size = View.MeasureSpec.getSize(i);
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                    break;
            }
        }
    }

    public final class ConferenceParticipantsView extends View {
        public final AvatarsDrawable avatarsDrawable;
        public final Paint backgroundPaint;
        public Text text;

        public ConferenceParticipantsView(Activity activity) {
            super(activity);
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            paint.setColor(-14538189);
            AvatarsDrawable avatarsDrawable = new AvatarsDrawable(this, false);
            this.avatarsDrawable = avatarsDrawable;
            avatarsDrawable.width = AndroidUtilities.dp(100.0f);
            avatarsDrawable.height = AndroidUtilities.dp(30.0f);
            avatarsDrawable.drawStoriesCircle = false;
            avatarsDrawable.overrideSize = AndroidUtilities.dp(24.0f);
            avatarsDrawable.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            avatarsDrawable.overrideSizeStepFactor = 0.58f;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            if (this.text == null) {
                return;
            }
            float fDp = AndroidUtilities.dp(4.0f);
            AvatarsDrawable avatarsDrawable = this.avatarsDrawable;
            float usedWidth = avatarsDrawable.getUsedWidth() + fDp + AndroidUtilities.dp(7.0f) + this.text.width + AndroidUtilities.dp(13.0f);
            float fDp2 = AndroidUtilities.dp(30.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - usedWidth) / 2.0f, 0.0f, (getWidth() + usedWidth) / 2.0f, getHeight());
            float f = fDp2 / 2.0f;
            canvas.drawRoundRect(rectF, f, f, this.backgroundPaint);
            canvas.save();
            canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
            avatarsDrawable.onDraw(canvas);
            canvas.translate(avatarsDrawable.maxX + AndroidUtilities.dp(7.0f), 0.0f);
            this.text.draw(0.0f, f, 1.0f, -1, canvas);
            canvas.restore();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(30.0f));
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
        sharedState.isOutgoing();
        this.previousState = -1;
        this.currentState = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static void show(Activity activity, int i) {
        int i2 = 3;
        int i3 = 2;
        int i4 = 1;
        VoIPFragment voIPFragment = instance;
        int i5 = 0;
        if (voIPFragment != null && voIPFragment.windowView.getParent() == null) {
            VoIPFragment voIPFragment2 = instance;
            if (voIPFragment2 != null) {
                voIPFragment2.callingUserTextureView.renderer.release();
                instance.currentUserTextureView.renderer.release();
                instance.callingUserMiniTextureRenderer.release();
                AnonymousClass1 anonymousClass1 = instance.windowView;
                if (anonymousClass1 != null && anonymousClass1.getParent() != null) {
                    AndroidUtilities.unlockOrientation(anonymousClass1.activity);
                    WindowManager windowManager = (WindowManager) anonymousClass1.activity.getSystemService("window");
                    anonymousClass1.setVisibility(8);
                    windowManager.removeView(anonymousClass1);
                    OrientationHelper.cameraRotationDisabled = false;
                }
                instance.destroy$1$1();
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
        ?? r0 = new VoIPWindowView(activity, !z) {
            public final Path clipPath = new Path();
            public final RectF rectF = new RectF();

            @Override
            public final void dispatchDraw(Canvas canvas) {
                VoIPFragment voIPFragment4 = voIPFragment3;
                if (!voIPFragment4.switchingToPip || getAlpha() == 0.0f) {
                    super.dispatchDraw(canvas);
                    return;
                }
                float scaleX = voIPFragment4.callingUserTextureView.getScaleX() * voIPFragment4.callingUserTextureView.getWidth();
                float scaleY = voIPFragment4.callingUserTextureView.getScaleY() * voIPFragment4.callingUserTextureView.getHeight();
                float width = (voIPFragment4.callingUserTextureView.getWidth() - scaleX) / 2.0f;
                float height = (voIPFragment4.callingUserTextureView.getHeight() - scaleY) / 2.0f;
                float x = voIPFragment4.callingUserTextureView.getX() + width;
                float y = voIPFragment4.callingUserTextureView.getY() + height;
                canvas.save();
                Path path = this.clipPath;
                path.rewind();
                RectF rectF = this.rectF;
                rectF.set(x, y, scaleX + x, scaleY + y);
                float fDp = AndroidUtilities.dp(4.0f);
                path.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
                path.close();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
            }

            @Override
            public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
                VoIPServiceState sharedState;
                VoIPFragment voIPFragment4 = voIPFragment3;
                if (voIPFragment4.isFinished || voIPFragment4.switchingToPip) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 4 && keyEvent.getAction() == 1) {
                    voIPFragment4.onBackPressed$1();
                    return true;
                }
                if ((keyCode != 25 && keyCode != 24) || voIPFragment4.currentState != 15 || (sharedState = VoIPService.getSharedState()) == null) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                sharedState.stopRinging();
                return true;
            }

            @Override
            public final void draw(Canvas canvas) {
                if (voIPFragment3.windowViewSkipRender) {
                    return;
                }
                super.draw(canvas);
            }
        };
        instance.deviceIsLocked = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        ((PowerManager) activity.getSystemService("power")).isInteractive();
        instance.getClass();
        r0.setLockOnScreen(instance.deviceIsLocked);
        voIPFragment3.windowView = r0;
        VoIPFragment$$ExternalSyntheticLambda12 voIPFragment$$ExternalSyntheticLambda12 = new VoIPFragment$$ExternalSyntheticLambda12(voIPFragment3, i3);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(r0, voIPFragment$$ExternalSyntheticLambda12);
        ((WindowManager) activity.getSystemService("window")).addView(r0, VoIPWindowView.createWindowLayoutParams());
        voIPFragment3.touchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        voIPFragment3.accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(activity, AccessibilityManager.class);
        ?? r2 = new FrameLayout(activity) {
            public boolean check;
            public long pressedTime;
            public float pressedX;
            public float pressedY;

            @Override
            public final boolean drawChild(Canvas canvas, View view, long j) {
                VoIPFragment voIPFragment4 = VoIPFragment.this;
                VoIpGradientLayout voIpGradientLayout = voIPFragment4.gradientLayout;
                if (view == voIpGradientLayout && (voIPFragment4.currentUserIsVideo || voIPFragment4.callingUserIsVideo)) {
                    return false;
                }
                if ((view != voIpGradientLayout && view != voIPFragment4.callingUserTextureView && (view != voIPFragment4.currentUserCameraFloatingLayout || !voIPFragment4.currentUserCameraIsFullscreen)) || (!voIPFragment4.zoomStarted && voIPFragment4.zoomBackAnimator == null)) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                float f = voIPFragment4.pinchScale;
                canvas.scale(f, f, voIPFragment4.pinchCenterX, voIPFragment4.pinchCenterY);
                canvas.translate(voIPFragment4.pinchTranslationX, voIPFragment4.pinchTranslationY);
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild;
            }

            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 1) {
                    VoIPFragment voIPFragment4 = VoIPFragment.this;
                    voIPFragment4.callingUserPhotoViewMini.setMute(false, false);
                    voIPFragment4.gradientLayout.resume();
                    VoIPFragment$$ExternalSyntheticLambda2 voIPFragment$$ExternalSyntheticLambda2 = voIPFragment4.stopAnimatingBgRunnable;
                    AndroidUtilities.cancelRunOnUIThread(voIPFragment$$ExternalSyntheticLambda2);
                    if (voIPFragment4.currentState == 3) {
                        AndroidUtilities.runOnUIThread(voIPFragment$$ExternalSyntheticLambda2, 10000L);
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                VoIpHintView voIpHintView;
                int actionMasked = motionEvent.getActionMasked();
                VoIPFragment voIPFragment4 = VoIPFragment.this;
                if (actionMasked == 1) {
                    voIPFragment4.callingUserPhotoViewMini.setMute(false, false);
                    voIPFragment4.gradientLayout.resume();
                    VoIPFragment$$ExternalSyntheticLambda2 voIPFragment$$ExternalSyntheticLambda2 = voIPFragment4.stopAnimatingBgRunnable;
                    AndroidUtilities.cancelRunOnUIThread(voIPFragment$$ExternalSyntheticLambda2);
                    if (voIPFragment4.currentState == 3) {
                        AndroidUtilities.runOnUIThread(voIPFragment$$ExternalSyntheticLambda2, 10000L);
                    }
                }
                if (!voIPFragment4.canZoomGesture && !voIPFragment4.isInPinchToZoomTouchMode && !voIPFragment4.zoomStarted && motionEvent.getActionMasked() != 0) {
                    voIPFragment4.finishZoom$1();
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    voIPFragment4.canZoomGesture = false;
                    voIPFragment4.isInPinchToZoomTouchMode = false;
                    voIPFragment4.zoomStarted = false;
                }
                VoIPTextureView voIPTextureView = voIPFragment4.callingUserIsVideo ? voIPFragment4.callingUserTextureView : voIPFragment4.currentUserTextureView;
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (motionEvent.getActionMasked() == 0) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(voIPTextureView.getX(), voIPTextureView.getY(), voIPTextureView.getX() + voIPTextureView.getMeasuredWidth(), voIPTextureView.getY() + voIPTextureView.getMeasuredHeight());
                        rectF.inset(((voIPTextureView.getMeasuredHeight() * voIPTextureView.scaleTextureToFill) - voIPTextureView.getMeasuredHeight()) / 2.0f, ((voIPTextureView.getMeasuredWidth() * voIPTextureView.scaleTextureToFill) - voIPTextureView.getMeasuredWidth()) / 2.0f);
                        if (GroupCallActivity.isLandscapeMode) {
                            rectF.top = Math.max(rectF.top, ActionBar.getCurrentActionBarHeight());
                            rectF.right = Math.min(rectF.right, voIPTextureView.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                        } else {
                            rectF.top = Math.max(rectF.top, ActionBar.getCurrentActionBarHeight());
                            rectF.bottom = Math.min(rectF.bottom, voIPTextureView.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                        }
                        boolean zContains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                        voIPFragment4.canZoomGesture = zContains;
                        if (!zContains) {
                            voIPFragment4.finishZoom$1();
                        }
                    }
                    if (voIPFragment4.canZoomGesture && !voIPFragment4.isInPinchToZoomTouchMode && motionEvent.getPointerCount() == 2) {
                        voIPFragment4.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        float x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        voIPFragment4.pinchCenterX = x;
                        voIPFragment4.pinchStartCenterX = x;
                        float y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        voIPFragment4.pinchCenterY = y;
                        voIPFragment4.pinchStartCenterY = y;
                        voIPFragment4.pinchScale = 1.0f;
                        voIPFragment4.pointerId1 = motionEvent.getPointerId(0);
                        voIPFragment4.pointerId2 = motionEvent.getPointerId(1);
                        voIPFragment4.isInPinchToZoomTouchMode = true;
                    }
                } else if (motionEvent.getActionMasked() == 2 && voIPFragment4.isInPinchToZoomTouchMode) {
                    int i6 = -1;
                    int i7 = -1;
                    for (int i8 = 0; i8 < motionEvent.getPointerCount(); i8++) {
                        if (voIPFragment4.pointerId1 == motionEvent.getPointerId(i8)) {
                            i6 = i8;
                        }
                        if (voIPFragment4.pointerId2 == motionEvent.getPointerId(i8)) {
                            i7 = i8;
                        }
                    }
                    if (i6 == -1 || i7 == -1) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        voIPFragment4.finishZoom$1();
                    } else {
                        float fHypot = ((float) Math.hypot(motionEvent.getX(i7) - motionEvent.getX(i6), motionEvent.getY(i7) - motionEvent.getY(i6))) / voIPFragment4.pinchStartDistance;
                        voIPFragment4.pinchScale = fHypot;
                        if (fHypot > 1.005f && !voIPFragment4.zoomStarted) {
                            voIPFragment4.pinchStartDistance = (float) Math.hypot(motionEvent.getX(i7) - motionEvent.getX(i6), motionEvent.getY(i7) - motionEvent.getY(i6));
                            float x2 = (motionEvent.getX(i7) + motionEvent.getX(i6)) / 2.0f;
                            voIPFragment4.pinchCenterX = x2;
                            voIPFragment4.pinchStartCenterX = x2;
                            float y2 = (motionEvent.getY(i7) + motionEvent.getY(i6)) / 2.0f;
                            voIPFragment4.pinchCenterY = y2;
                            voIPFragment4.pinchStartCenterY = y2;
                            voIPFragment4.pinchScale = 1.0f;
                            voIPFragment4.pinchTranslationX = 0.0f;
                            voIPFragment4.pinchTranslationY = 0.0f;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            voIPFragment4.zoomStarted = true;
                            voIPFragment4.isInPinchToZoomTouchMode = true;
                        }
                        float x3 = (motionEvent.getX(i7) + motionEvent.getX(i6)) / 2.0f;
                        float y3 = (motionEvent.getY(i7) + motionEvent.getY(i6)) / 2.0f;
                        float f = voIPFragment4.pinchStartCenterX - x3;
                        float f2 = voIPFragment4.pinchStartCenterY - y3;
                        float f3 = voIPFragment4.pinchScale;
                        voIPFragment4.pinchTranslationX = (-f) / f3;
                        voIPFragment4.pinchTranslationY = (-f2) / f3;
                        invalidate();
                    }
                } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((voIPFragment4.pointerId1 == motionEvent.getPointerId(0) && voIPFragment4.pointerId2 == motionEvent.getPointerId(1)) || (voIPFragment4.pointerId1 == motionEvent.getPointerId(1) && voIPFragment4.pointerId2 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    voIPFragment4.finishZoom$1();
                }
                voIPFragment4.fragmentView.invalidate();
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
                    float x4 = motionEvent.getX() - this.pressedX;
                    float y4 = motionEvent.getY() - this.pressedY;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    float f4 = (y4 * y4) + (x4 * x4);
                    float f5 = voIPFragment4.touchSlop;
                    if (f4 < f5 * f5 && jCurrentTimeMillis - this.pressedTime < 300 && jCurrentTimeMillis - voIPFragment4.lastContentTapTime > 300) {
                        voIPFragment4.lastContentTapTime = System.currentTimeMillis();
                        if (voIPFragment4.emojiExpanded) {
                            voIPFragment4.expandEmoji(false);
                        } else if (voIPFragment4.canHideUI) {
                            voIPFragment4.showUi(!voIPFragment4.uiVisible);
                            voIPFragment4.previousState = voIPFragment4.currentState;
                            if (!voIPFragment4.uiVisible && (voIpHintView = voIPFragment4.tapToVideoTooltip) != null && voIpHintView.shown) {
                                voIpHintView.hide(true);
                            }
                            voIPFragment4.updateViewState$1();
                        }
                    }
                    this.check = false;
                }
                return voIPFragment4.canZoomGesture || this.check;
            }
        };
        r2.setClipToPadding(false);
        r2.setClipChildren(false);
        r2.setBackgroundColor(-16777216);
        voIPFragment3.updateSystemBarColors();
        voIPFragment3.fragmentView = r2;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        boolean z2 = sharedState != null && sharedState.isConference();
        VoIPBackgroundProvider voIPBackgroundProvider = voIPFragment3.backgroundProvider;
        voIPFragment3.gradientLayout = new VoIpGradientLayout(activity, z2, voIPBackgroundProvider);
        VoIPTextureView voIPTextureView = new VoIPTextureView(activity, false, true, false, false);
        voIPFragment3.callingUserTextureView = voIPTextureView;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        voIPTextureView.renderer.setScalingType(scalingType);
        voIPFragment3.callingUserTextureView.renderer.setEnableHardwareScaler(true);
        voIPFragment3.callingUserTextureView.renderer.setRotateTextureWithScreen(true);
        voIPFragment3.callingUserTextureView.scaleType = 1;
        r2.addView(voIPFragment3.gradientLayout, LayoutHelper.createFrame(-1.0f, -1));
        TLRPC.User user = voIPFragment3.callingUser;
        VoIpCoverView voIpCoverView = new VoIpCoverView(activity, user, voIPBackgroundProvider);
        voIPFragment3.voIpCoverView = voIpCoverView;
        r2.addView(voIpCoverView, LayoutHelper.createFrame(-1.0f, -1));
        VoIpSnowView voIpSnowView = new VoIpSnowView(activity);
        voIPFragment3.voIpSnowView = voIpSnowView;
        r2.addView(voIpSnowView, LayoutHelper.createFrame(220.0f, -1));
        r2.addView(voIPFragment3.callingUserTextureView);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        new BackgroundGradientDrawable(orientation, new int[]{-14994098, -14328963}).startDithering(Stripe.ofDeviceScreen(0.5f, 1), new AnonymousClass3(voIPFragment3, i5), 0L);
        VoIPFloatingLayout voIPFloatingLayout = new VoIPFloatingLayout(activity);
        voIPFragment3.currentUserCameraFloatingLayout = voIPFloatingLayout;
        voIPFloatingLayout.setDelegate(new VoIPFragment$$ExternalSyntheticLambda12(voIPFragment3, i2));
        voIPFragment3.currentUserCameraFloatingLayout.setRelativePosition(1.0f, 1.0f);
        voIPFragment3.currentUserCameraIsFullscreen = true;
        VoIPTextureView voIPTextureView2 = new VoIPTextureView(activity, true, false, true, false);
        voIPFragment3.currentUserTextureView = voIPTextureView2;
        voIPTextureView2.renderer.setIsCamera(true);
        voIPFragment3.currentUserTextureView.renderer.setUseCameraRotation(true);
        voIPFragment3.currentUserCameraFloatingLayout.setOnTapListener(new VoIPFragment$$ExternalSyntheticLambda22(voIPFragment3, i5));
        voIPFragment3.currentUserTextureView.renderer.setMirror(true);
        voIPFragment3.currentUserCameraFloatingLayout.addView(voIPFragment3.currentUserTextureView);
        VoIPFloatingLayout voIPFloatingLayout2 = new VoIPFloatingLayout(activity);
        voIPFragment3.callingUserMiniFloatingLayout = voIPFloatingLayout2;
        voIPFloatingLayout2.alwaysFloating = true;
        voIPFloatingLayout2.setFloatingMode(true, false);
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
        voIPFragment3.callingUserMiniTextureRenderer = textureViewRenderer;
        textureViewRenderer.setEnableHardwareScaler(true);
        voIPFragment3.callingUserMiniTextureRenderer.setIsCamera(false);
        voIPFragment3.callingUserMiniTextureRenderer.setFpsReduction(30.0f);
        voIPFragment3.callingUserMiniTextureRenderer.setScalingType(scalingType);
        voIPFragment3.callingUserMiniFloatingLayout.addView(voIPFragment3.callingUserMiniTextureRenderer, LayoutHelper.createFrame(-1, -2, 17));
        voIPFragment3.callingUserMiniFloatingLayout.setOnTapListener(new VoIPFragment$$ExternalSyntheticLambda22(voIPFragment3, i4));
        voIPFragment3.callingUserMiniFloatingLayout.setVisibility(8);
        r2.addView(voIPFragment3.currentUserCameraFloatingLayout, LayoutHelper.createFrame(-2.0f, -2));
        r2.addView(voIPFragment3.callingUserMiniFloatingLayout);
        View view = new View(activity);
        voIPFragment3.bottomShadow = view;
        view.setBackground(new GradientDrawable(orientation, new int[]{0, ColorUtils.setAlphaComponent(-16777216, 127)}));
        r2.addView(voIPFragment3.bottomShadow, LayoutHelper.createFrame(-1, 160, 80));
        View view2 = new View(activity);
        voIPFragment3.topShadow = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{ColorUtils.setAlphaComponent(-16777216, 102), 0}));
        r2.addView(voIPFragment3.topShadow, LayoutHelper.createFrame(-1, 160, 48));
        PhotoViewer.AnonymousClass35 anonymousClass35 = new PhotoViewer.AnonymousClass35(voIPFragment3, activity, 16);
        voIPFragment3.emojiLayout = anonymousClass35;
        anonymousClass35.setOrientation(0);
        voIPFragment3.emojiLayout.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
        voIPFragment3.emojiLayout.setClipToPadding(false);
        voIPFragment3.emojiLayout.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
        voIPFragment3.emojiLayout.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda22(voIPFragment3, 2));
        voIPFragment3.hideEmojiTextView = new HideEmojiTextView(activity, voIPBackgroundProvider);
        FrameLayout frameLayout = new FrameLayout(activity);
        voIPFragment3.hideEmojiLayout = frameLayout;
        frameLayout.addView(voIPFragment3.hideEmojiTextView, LayoutHelper.createFrame(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
        voIPFragment3.hideEmojiLayout.setVisibility(8);
        voIPFragment3.hideEmojiLayout.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda22(voIPFragment3, i2));
        GroupCallActivity.AnonymousClass61 anonymousClass61 = new GroupCallActivity.AnonymousClass61(activity, voIPBackgroundProvider);
        voIPFragment3.emojiRationalLayout = anonymousClass61;
        anonymousClass61.setOrientation(1);
        TextView textView = new TextView(activity);
        voIPFragment3.emojiRationalTopTextView = textView;
        textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
        voIPFragment3.emojiRationalTopTextView.setTextSize(1, 15.0f);
        voIPFragment3.emojiRationalTopTextView.setTypeface(AndroidUtilities.bold());
        voIPFragment3.emojiRationalTopTextView.setTextColor(-1);
        voIPFragment3.emojiRationalTopTextView.setGravity(17);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(voIPFragment3, activity, i5);
        voIPFragment3.emojiRationalTextView = anonymousClass5;
        anonymousClass5.setTextSize(1, 15.0f);
        voIPFragment3.emojiRationalTextView.setTextColor(-1);
        voIPFragment3.emojiRationalTextView.setGravity(17);
        voIPFragment3.emojiRationalTextView.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), voIPFragment3.emojiRationalTextView.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
        voIPFragment3.emojiRationalLayout.setVisibility(8);
        voIPFragment3.emojiRationalLayout.addView(voIPFragment3.emojiRationalTopTextView);
        voIPFragment3.emojiRationalLayout.addView(voIPFragment3.emojiRationalTextView, LayoutHelper.createLinear(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
        voIPFragment3.emojiRationalLayout.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
        int i6 = 0;
        while (i6 < 4) {
            BackupImageView backupImageView = new BackupImageView(activity);
            BackupImageView[] backupImageViewArr = voIPFragment3.emojiViews;
            backupImageViewArr[i6] = backupImageView;
            backupImageView.getImageReceiver().setAspectFit(true);
            voIPFragment3.emojiLayout.addView(backupImageViewArr[i6], LayoutHelper.createLinear(i6 == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f, 25, 25));
            i6++;
        }
        ?? r1 = new LinearLayout(activity) {
            @Override
            public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
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
        voIPFragment3.statusLayout = r1;
        r1.setOrientation(1);
        voIPFragment3.statusLayout.setFocusable(true);
        voIPFragment3.statusLayout.setFocusableInTouchMode(true);
        voIPFragment3.callingUserPhotoViewMini = new ImageWithWavesView(activity);
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable.setInfo(UserConfig.selectedAccount, user);
        voIPFragment3.callingUserPhotoViewMini.backupImageView.setImage(ImageLocation.getForUserOrChat(voIPFragment3.currentAccount, user, 0), null, avatarDrawable, user);
        voIPFragment3.callingUserPhotoViewMini.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
        TextView textView2 = new TextView(activity);
        voIPFragment3.callingUserTitle = textView2;
        textView2.setTextSize(1, 28.0f);
        voIPFragment3.callingUserTitle.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), voIPFragment3.callingUserTitle.getPaint().getFontMetricsInt(), false));
        voIPFragment3.callingUserTitle.setMaxLines(2);
        voIPFragment3.callingUserTitle.setEllipsize(TextUtils.TruncateAt.END);
        voIPFragment3.callingUserTitle.setTextColor(-1);
        voIPFragment3.callingUserTitle.setGravity(1);
        voIPFragment3.callingUserTitle.setImportantForAccessibility(2);
        voIPFragment3.statusLayout.addView(voIPFragment3.callingUserTitle, LayoutHelper.createLinear(-2, -2, 1, 8, 0, 8, 6));
        VoIPStatusTextView voIPStatusTextView = new VoIPStatusTextView(activity, voIPBackgroundProvider);
        voIPFragment3.statusTextView = voIPStatusTextView;
        WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
        voIPStatusTextView.setImportantForAccessibility(4);
        voIPFragment3.statusLayout.addView(voIPFragment3.statusTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 6));
        if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
            ConferenceParticipantsView conferenceParticipantsView = new ConferenceParticipantsView(activity);
            voIPFragment3.participantsView = conferenceParticipantsView;
            long j = sharedState.getUser().id;
            ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
            int i7 = sharedState.getGroupCall().participants_count;
            if (groupParticipants != null || i7 > 0) {
                int iMax = Math.max(i7, groupParticipants == null ? 0 : groupParticipants.size());
                int iMin = Math.min(3, groupParticipants == null ? 0 : groupParticipants.size());
                conferenceParticipantsView.avatarsDrawable.setCount(iMin);
                int i8 = 0;
                while (i8 < iMin) {
                    long peerDialogId = DialogObject.getPeerDialogId(groupParticipants.get(i8).peer);
                    int i9 = voIPFragment3.currentAccount;
                    conferenceParticipantsView.avatarsDrawable.setObject(i8, MessagesController.getInstance(i9).getUserOrChat(peerDialogId), i9);
                    i8++;
                    j = j;
                }
                long j2 = j;
                conferenceParticipantsView.avatarsDrawable.commitTransition(false, true);
                if (iMax == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j2))) {
                    conferenceParticipantsView.setVisibility(8);
                } else {
                    conferenceParticipantsView.text = new Text(LocaleController.formatPluralStringComma("Participants", iMax), 14.0f, AndroidUtilities.bold());
                    conferenceParticipantsView.setVisibility(0);
                    conferenceParticipantsView.invalidate();
                }
            } else {
                conferenceParticipantsView.setVisibility(8);
            }
            voIPFragment3.statusLayout.addView(voIPFragment3.participantsView, LayoutHelper.createLinear(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
        }
        voIPFragment3.statusLayout.setClipChildren(false);
        voIPFragment3.statusLayout.setClipToPadding(false);
        voIPFragment3.statusLayout.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
        voIPFragment3.endCloseLayout = new EndCloseLayout(activity);
        voIPFragment3.rateCallLayout = new RateCallLayout(activity, voIPBackgroundProvider);
        voIPFragment3.endCloseLayout.setAlpha(0.0f);
        voIPFragment3.rateCallLayout.setVisibility(8);
        r2.addView(voIPFragment3.callingUserPhotoViewMini, LayoutHelper.createFrame(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
        r2.addView(voIPFragment3.statusLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
        r2.addView(voIPFragment3.hideEmojiLayout, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        r2.addView(voIPFragment3.emojiRationalLayout, LayoutHelper.createFrame(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
        r2.addView(voIPFragment3.emojiLayout, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        r2.addView(voIPFragment3.endCloseLayout, LayoutHelper.createFrame(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
        r2.addView(voIPFragment3.rateCallLayout, LayoutHelper.createFrame(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
        voIPFragment3.buttonsLayout = new VoIPButtonsLayout(activity);
        voIPFragment3.bottomSpeakerBtn = new VoIpSwitchLayout(activity, voIPBackgroundProvider);
        voIPFragment3.bottomVideoBtn = new VoIpSwitchLayout(activity, voIPBackgroundProvider);
        voIPFragment3.bottomMuteBtn = new VoIpSwitchLayout(activity, voIPBackgroundProvider);
        voIPFragment3.bottomEndCallBtn = new AnonymousClass7(activity, 52.0f);
        voIPFragment3.bottomSpeakerBtn.setTranslationY(AndroidUtilities.dp(100.0f));
        voIPFragment3.bottomSpeakerBtn.setScaleX(0.0f);
        voIPFragment3.bottomSpeakerBtn.setScaleY(0.0f);
        voIPFragment3.bottomSpeakerBtn.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        voIPFragment3.bottomVideoBtn.setTranslationY(AndroidUtilities.dp(100.0f));
        voIPFragment3.bottomVideoBtn.setScaleX(0.0f);
        voIPFragment3.bottomVideoBtn.setScaleY(0.0f);
        voIPFragment3.bottomVideoBtn.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        voIPFragment3.bottomMuteBtn.setTranslationY(AndroidUtilities.dp(100.0f));
        voIPFragment3.bottomMuteBtn.setScaleX(0.0f);
        voIPFragment3.bottomMuteBtn.setScaleY(0.0f);
        voIPFragment3.bottomMuteBtn.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        voIPFragment3.bottomEndCallBtn.setTranslationY(AndroidUtilities.dp(100.0f));
        voIPFragment3.bottomEndCallBtn.setScaleX(0.0f);
        voIPFragment3.bottomEndCallBtn.setScaleY(0.0f);
        voIPFragment3.bottomEndCallBtn.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        voIPFragment3.buttonsLayout.addView(voIPFragment3.bottomSpeakerBtn);
        voIPFragment3.buttonsLayout.addView(voIPFragment3.bottomVideoBtn);
        voIPFragment3.buttonsLayout.addView(voIPFragment3.bottomMuteBtn);
        voIPFragment3.buttonsLayout.addView(voIPFragment3.bottomEndCallBtn);
        AcceptDeclineView acceptDeclineView = new AcceptDeclineView(activity);
        voIPFragment3.acceptDeclineView = acceptDeclineView;
        acceptDeclineView.setListener(voIPFragment3.new AnonymousClass8());
        voIPFragment3.acceptDeclineView.setScaleX(1.15f);
        voIPFragment3.acceptDeclineView.setScaleY(1.15f);
        r2.addView(voIPFragment3.buttonsLayout, LayoutHelper.createFrame(-1, -2, 80));
        float f = AndroidUtilities.isTablet() ? 100 : 27;
        r2.addView(voIPFragment3.acceptDeclineView, LayoutHelper.createFrame(-1, 186.0f, 80, f, 0.0f, f, 0.0f));
        ImageView imageView = new ImageView(activity);
        voIPFragment3.addIcon = imageView;
        imageView.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(-1, 76), 1, -1));
        voIPFragment3.addIcon.setImageResource(R.drawable.msg_addcontact);
        voIPFragment3.addIcon.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        r2.addView(voIPFragment3.addIcon, LayoutHelper.createFrame(56, 56, 53));
        ScaleStateListAnimator.apply(voIPFragment3.addIcon, 0.1f, 1.5f);
        ImageView imageView2 = new ImageView(activity);
        voIPFragment3.backIcon = imageView2;
        imageView2.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(-1, 76), 1, -1));
        voIPFragment3.backIcon.setImageResource(R.drawable.msg_call_minimize_shadow);
        voIPFragment3.backIcon.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        voIPFragment3.backIcon.setContentDescription(LocaleController.getString(R.string.Back));
        r2.addView(voIPFragment3.backIcon, LayoutHelper.createFrame(56, 56, 51));
        ScaleStateListAnimator.apply(voIPFragment3.backIcon, 0.1f, 1.5f);
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(activity, i5);
        voIPFragment3.speakerPhoneIcon = anonymousClass9;
        anonymousClass9.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
        voIPFragment3.speakerPhoneIcon.setBackground(Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(-1, 76), 1, -1));
        voIPFragment3.speakerPhoneIcon.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        r2.addView(voIPFragment3.speakerPhoneIcon, LayoutHelper.createFrame(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
        voIPFragment3.speakerPhoneIcon.setAlpha(0.0f);
        voIPFragment3.speakerPhoneIcon.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda22(voIPFragment3, 4));
        voIPFragment3.backIcon.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda22(voIPFragment3, 5));
        voIPFragment3.addIcon.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda28(i5, voIPFragment3, activity));
        if (voIPFragment3.windowView.lockOnScreen) {
            voIPFragment3.backIcon.setVisibility(8);
            voIPFragment3.addIcon.setVisibility(8);
        }
        VoIPNotificationsLayout voIPNotificationsLayout = new VoIPNotificationsLayout(activity, voIPBackgroundProvider);
        voIPFragment3.notificationsLayout = voIPNotificationsLayout;
        voIPNotificationsLayout.setGravity(80);
        voIPFragment3.notificationsLayout.setOnViewsUpdated(new VoIPFragment$$ExternalSyntheticLambda2(voIPFragment3, 5));
        r2.addView(voIPFragment3.notificationsLayout, LayoutHelper.createFrame(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        VoIpHintView voIpHintView = new VoIpHintView(activity, 3, voIPBackgroundProvider, true);
        voIpHintView.setMultilineText(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        voIpHintView.textLayoutAlignment = alignment;
        voIpHintView.duration = -1L;
        voIpHintView.onHidden = new VoIPFragment$$ExternalSyntheticLambda2(voIPFragment3, 6);
        voIpHintView.hideByTouch = true;
        voIpHintView.textMaxWidth = AndroidUtilities.dp(320.0f);
        voIpHintView.useScale = true;
        voIpHintView.setInnerPadding(10.0f, 6.0f, 10.0f, 6.0f);
        voIpHintView.setRounding(8.0f);
        voIPFragment3.tapToVideoTooltip = voIpHintView;
        voIpHintView.setText(LocaleController.getString(R.string.TapToTurnCamera));
        r2.addView(voIPFragment3.tapToVideoTooltip, LayoutHelper.createFrame(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
        VoIpHintView voIpHintView2 = new VoIpHintView(activity, 1, voIPBackgroundProvider, false);
        voIpHintView2.setMultilineText(true);
        voIpHintView2.textLayoutAlignment = alignment;
        voIpHintView2.duration = 4000L;
        voIpHintView2.hideByTouch = true;
        voIpHintView2.textMaxWidth = AndroidUtilities.dp(320.0f);
        voIpHintView2.useScale = true;
        voIpHintView2.setInnerPadding(10.0f, 6.0f, 10.0f, 6.0f);
        voIpHintView2.setRounding(8.0f);
        voIPFragment3.encryptionTooltip = voIpHintView2;
        voIpHintView2.setText(LocaleController.getString(R.string.VoipHintEncryptionKey));
        r2.addView(voIPFragment3.encryptionTooltip, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        voIPFragment3.updateViewState$1();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!voIPFragment3.isVideoCall) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                voIPFragment3.isVideoCall = phoneCall != null && phoneCall.video;
            }
            voIPFragment3.currentUserTextureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), voIPFragment3.new AnonymousClass12());
            voIPFragment3.callingUserTextureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), voIPFragment3.new AnonymousClass13(), EglBase.CONFIG_PLAIN, new GlRectDrawer());
            voIPFragment3.callingUserMiniTextureRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        }
        r0.addView(r2);
        if (z) {
            voIPFragment3.enterTransitionProgress = 0.0f;
            voIPFragment3.enterFromPiP = true;
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                voIPFragment3.callingUserTextureView.setStub(VoIPPiPView.instance.callingUserTextureView);
                voIPFragment3.currentUserTextureView.setStub(VoIPPiPView.instance.currentUserTextureView);
            }
            voIPFragment3.windowView.setAlpha(0.0f);
            voIPFragment3.updateViewState$1();
            voIPFragment3.switchingToPip = true;
            VoIPPiPView.switchingToPip = true;
            voIPFragment3.notificationsLocker.lock();
            AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda2(voIPFragment3, 9), 32L);
        } else {
            voIPFragment3.enterTransitionProgress = 1.0f;
            voIPFragment3.updateSystemBarColors();
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && PipUtils.checkPermissions(activity) == 1) {
            VoIPFragment voIPFragment4 = instance;
            PipSource.Builder builder = new PipSource.Builder(activity, voIPFragment4);
            builder.tagPrefix = "voip-fragment-pip";
            VoIPTextureView voIPTextureView3 = voIPFragment4.callingUserTextureView;
            builder.contentView = voIPTextureView3.renderer;
            builder.placeholderView = voIPTextureView3.getPlaceholderView();
            voIPFragment4.pipSource = builder.build();
        }
    }

    public final ValueAnimator createPiPTransition(boolean z) {
        char c;
        char c2;
        float measuredHeight;
        final float f;
        float measuredWidth;
        final float f2;
        final boolean z2;
        final float fDp;
        final float fDp2;
        final float f3;
        float f4;
        float f5;
        float f6;
        this.currentUserCameraFloatingLayout.animate().cancel();
        VoIPPiPView voIPPiPView = VoIPPiPView.instance;
        WindowManager.LayoutParams layoutParams = voIPPiPView.windowLayoutParams;
        float f7 = layoutParams.x + voIPPiPView.xOffset;
        float f8 = layoutParams.y + voIPPiPView.yOffset;
        final float x = this.currentUserCameraFloatingLayout.getX();
        final float y = this.currentUserCameraFloatingLayout.getY();
        final float scaleX = this.currentUserCameraFloatingLayout.getScaleX();
        VoIPPiPView.instance.getClass();
        final float measuredWidth2 = f7 - ((this.callingUserTextureView.getMeasuredWidth() - (this.callingUserTextureView.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f8 - ((this.callingUserTextureView.getMeasuredHeight() - (this.callingUserTextureView.getMeasuredHeight() * 0.25f)) / 2.0f);
        if (this.callingUserIsVideo) {
            int measuredWidth3 = this.currentUserCameraFloatingLayout.getMeasuredWidth();
            c = 0;
            if (!this.currentUserIsVideo || measuredWidth3 == 0) {
                c2 = 1;
                scaleX = scaleX;
                measuredWidth = 0.0f;
                z2 = false;
                f = 1.0f;
                f2 = 1.0f;
            } else {
                measuredWidth = (getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c2 = 1;
                float measuredWidth4 = f7 - ((this.currentUserCameraFloatingLayout.getMeasuredWidth() - (this.currentUserCameraFloatingLayout.getMeasuredWidth() * measuredWidth)) / 2.0f);
                int i = VoIPPiPView.instance.parentWidth;
                float fDp3 = (((i * 0.25f) + measuredWidth4) - ((i * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                float measuredHeight3 = f8 - ((this.currentUserCameraFloatingLayout.getMeasuredHeight() - (this.currentUserCameraFloatingLayout.getMeasuredHeight() * measuredWidth)) / 2.0f);
                int i2 = VoIPPiPView.instance.parentHeight;
                measuredHeight = (((i2 * 0.25f) + measuredHeight3) - ((i2 * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                f = fDp3;
            }
            if (this.callingUserIsVideo) {
                fDp = AndroidUtilities.dp(4.0f);
            } else {
                fDp = 0.0f;
            }
            fDp2 = (AndroidUtilities.dp(4.0f) * 1.0f) / measuredWidth;
            if (this.callingUserIsVideo) {
                VoIPPiPView.instance.getClass();
                f3 = 0.0f;
            } else {
                f3 = 1.0f;
            }
            if (z) {
                if (z2) {
                    this.currentUserCameraFloatingLayout.setScaleX(measuredWidth);
                    this.currentUserCameraFloatingLayout.setScaleY(measuredWidth);
                    this.currentUserCameraFloatingLayout.setTranslationX(f);
                    this.currentUserCameraFloatingLayout.setTranslationY(f2);
                    this.currentUserCameraFloatingLayout.setCornerRadius(fDp2);
                    this.currentUserCameraFloatingLayout.setAlpha(f3);
                }
                this.callingUserTextureView.setScaleX(0.25f);
                this.callingUserTextureView.setScaleY(0.25f);
                this.callingUserTextureView.setTranslationX(measuredWidth2);
                this.callingUserTextureView.setTranslationY(measuredHeight2);
                this.callingUserTextureView.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / 0.25f);
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
            float[] fArr = new float[2];
            fArr[c] = f4;
            fArr[c2] = f5;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            if (z) {
                f6 = 0.0f;
            } else {
                f6 = 1.0f;
            }
            this.enterTransitionProgress = f6;
            updateSystemBarColors();
            final float f9 = measuredWidth;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    VoIPFragment voIPFragment = this.f$0;
                    voIPFragment.getClass();
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    float f10 = 1.0f - fFloatValue;
                    voIPFragment.enterTransitionProgress = f10;
                    voIPFragment.updateSystemBarColors();
                    if (z2) {
                        float f11 = (f9 * fFloatValue) + (scaleX * f10);
                        voIPFragment.currentUserCameraFloatingLayout.setScaleX(f11);
                        voIPFragment.currentUserCameraFloatingLayout.setScaleY(f11);
                        voIPFragment.currentUserCameraFloatingLayout.setTranslationX((f * fFloatValue) + (x * f10));
                        voIPFragment.currentUserCameraFloatingLayout.setTranslationY((f2 * fFloatValue) + (y * f10));
                        voIPFragment.currentUserCameraFloatingLayout.setCornerRadius((fDp2 * fFloatValue) + (fDp * f10));
                        voIPFragment.currentUserCameraFloatingLayout.setAlpha((f3 * fFloatValue) + (1.0f * f10));
                    }
                    float f12 = (0.25f * fFloatValue) + (1.0f * f10);
                    voIPFragment.callingUserTextureView.setScaleX(f12);
                    voIPFragment.callingUserTextureView.setScaleY(f12);
                    float f13 = 0.0f * f10;
                    float f14 = (measuredWidth2 * fFloatValue) + f13;
                    float f15 = (measuredHeight2 * fFloatValue) + f13;
                    voIPFragment.callingUserTextureView.setTranslationX(f14);
                    voIPFragment.callingUserTextureView.setTranslationY(f15);
                    voIPFragment.callingUserTextureView.setRoundCorners(((AndroidUtilities.dp(4.0f) * fFloatValue) * 1.0f) / f12);
                    if (!voIPFragment.currentUserCameraFloatingLayout.measuredAsFloatingMode) {
                        voIPFragment.currentUserTextureView.setScreenshareMiniProgress(fFloatValue, false);
                    }
                    voIPFragment.windowView.invalidate();
                }
            });
            return valueAnimatorOfFloat;
        }
        c = 0;
        c2 = 1;
        float measuredWidth5 = f7 - ((this.currentUserCameraFloatingLayout.getMeasuredWidth() - (this.currentUserCameraFloatingLayout.getMeasuredWidth() * 0.25f)) / 2.0f);
        measuredHeight = f8 - ((this.currentUserCameraFloatingLayout.getMeasuredHeight() - (this.currentUserCameraFloatingLayout.getMeasuredHeight() * 0.25f)) / 2.0f);
        f = measuredWidth5;
        measuredWidth = 0.25f;
        z2 = true;
        f2 = measuredHeight;
        if (this.callingUserIsVideo) {
            fDp = AndroidUtilities.dp(4.0f);
        } else {
            fDp = 0.0f;
        }
        fDp2 = (AndroidUtilities.dp(4.0f) * 1.0f) / measuredWidth;
        if (this.callingUserIsVideo) {
            VoIPPiPView.instance.getClass();
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        if (z) {
            if (z2) {
                this.currentUserCameraFloatingLayout.setScaleX(measuredWidth);
                this.currentUserCameraFloatingLayout.setScaleY(measuredWidth);
                this.currentUserCameraFloatingLayout.setTranslationX(f);
                this.currentUserCameraFloatingLayout.setTranslationY(f2);
                this.currentUserCameraFloatingLayout.setCornerRadius(fDp2);
                this.currentUserCameraFloatingLayout.setAlpha(f3);
            }
            this.callingUserTextureView.setScaleX(0.25f);
            this.callingUserTextureView.setScaleY(0.25f);
            this.callingUserTextureView.setTranslationX(measuredWidth2);
            this.callingUserTextureView.setTranslationY(measuredHeight2);
            this.callingUserTextureView.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / 0.25f);
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
        float[] fArr2 = new float[2];
        fArr2[c] = f4;
        fArr2[c2] = f5;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr2);
        if (z) {
            f6 = 0.0f;
        } else {
            f6 = 1.0f;
        }
        this.enterTransitionProgress = f6;
        updateSystemBarColors();
        final float f10 = measuredWidth;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoIPFragment voIPFragment = this.f$0;
                voIPFragment.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f11 = 1.0f - fFloatValue;
                voIPFragment.enterTransitionProgress = f11;
                voIPFragment.updateSystemBarColors();
                if (z2) {
                    float f12 = (f10 * fFloatValue) + (scaleX * f11);
                    voIPFragment.currentUserCameraFloatingLayout.setScaleX(f12);
                    voIPFragment.currentUserCameraFloatingLayout.setScaleY(f12);
                    voIPFragment.currentUserCameraFloatingLayout.setTranslationX((f * fFloatValue) + (x * f11));
                    voIPFragment.currentUserCameraFloatingLayout.setTranslationY((f2 * fFloatValue) + (y * f11));
                    voIPFragment.currentUserCameraFloatingLayout.setCornerRadius((fDp2 * fFloatValue) + (fDp * f11));
                    voIPFragment.currentUserCameraFloatingLayout.setAlpha((f3 * fFloatValue) + (1.0f * f11));
                }
                float f13 = (0.25f * fFloatValue) + (1.0f * f11);
                voIPFragment.callingUserTextureView.setScaleX(f13);
                voIPFragment.callingUserTextureView.setScaleY(f13);
                float f14 = 0.0f * f11;
                float f15 = (measuredWidth2 * fFloatValue) + f14;
                float f16 = (measuredHeight2 * fFloatValue) + f14;
                voIPFragment.callingUserTextureView.setTranslationX(f15);
                voIPFragment.callingUserTextureView.setTranslationY(f16);
                voIPFragment.callingUserTextureView.setRoundCorners(((AndroidUtilities.dp(4.0f) * fFloatValue) * 1.0f) / f13);
                if (!voIPFragment.currentUserCameraFloatingLayout.measuredAsFloatingMode) {
                    voIPFragment.currentUserTextureView.setScreenshareMiniProgress(fFloatValue, false);
                }
                voIPFragment.windowView.invalidate();
            }
        });
        return valueAnimatorOfFloat2;
    }

    public final void destroy$1$1() {
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

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.voipServiceCreated) {
            if (this.currentState != 17 || VoIPService.getSharedInstance() == null) {
                return;
            }
            this.currentUserTextureView.renderer.release();
            this.callingUserTextureView.renderer.release();
            this.callingUserMiniTextureRenderer.release();
            this.currentUserTextureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new AnonymousClass12());
            this.callingUserTextureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new AnonymousClass13(), EglBase.CONFIG_PLAIN, new GlRectDrawer());
            this.callingUserMiniTextureRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
            VoIPService.getSharedInstance().registerStateListener(this);
            return;
        }
        if (i == NotificationCenter.emojiLoaded) {
            updateKeyView(true);
            return;
        }
        if (i == NotificationCenter.closeInCallActivity) {
            finish(330L);
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

    public final void expandEmoji(boolean z) {
        int i = 1;
        if (this.emojiLoaded && this.emojiExpanded != z && this.uiVisible) {
            this.emojiExpanded = z;
            VoIpCoverView voIpCoverView = this.voIpCoverView;
            if (voIpCoverView.allowAnimations && z != voIpCoverView.isEmojiExpanded) {
                voIpCoverView.isEmojiExpanded = z;
                ValueAnimator valueAnimatorOfFloat = z ? ValueAnimator.ofFloat(0.0f, 1.0f) : ValueAnimator.ofFloat(1.0f, 0.0f);
                voIpCoverView.positionAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new VoIpCoverView$$ExternalSyntheticLambda0(voIpCoverView, i));
                voIpCoverView.positionAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                voIpCoverView.positionAnimator.setDuration(200L);
                voIpCoverView.positionAnimator.start();
            }
            if (z) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.encryptionTooltip.hide(true);
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
                this.emojiRationalLayout.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new AnonymousClass11(this, 3)).setInterpolator(cubicBezierInterpolator).start();
            } else {
                if (this.callingUserPhotoViewMini.getVisibility() == 0) {
                    this.callingUserPhotoViewMini.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                }
                this.hideEmojiLayout.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.hideEmojiLayout.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
                duration.setInterpolator(cubicBezierInterpolator2).setListener(new ChatActivity.AnonymousClass77(this.hideEmojiLayout)).start();
                this.emojiLayout.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(cubicBezierInterpolator2).setDuration(280L).start();
                this.emojiRationalLayout.animate().setListener(null).cancel();
                this.emojiRationalLayout.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new AnonymousClass11(this, 4)).setDuration(250L).setInterpolator(cubicBezierInterpolator2).start();
            }
            this.previousState = this.currentState;
            updateViewState$1();
        }
    }

    public final void finishZoom$1() {
        VoIPFragment voIPFragment;
        int i = 0;
        if (this.zoomStarted) {
            this.zoomStarted = false;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.zoomBackAnimator = valueAnimatorOfFloat;
            voIPFragment = this;
            valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda35(voIPFragment, this.pinchScale, this.pinchTranslationX, this.pinchTranslationY, 0));
            voIPFragment.zoomBackAnimator.addListener(new AnonymousClass11(this, i));
            voIPFragment.zoomBackAnimator.setDuration(350L);
            voIPFragment.zoomBackAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            voIPFragment.zoomBackAnimator.start();
        } else {
            voIPFragment = this;
        }
        voIPFragment.canZoomGesture = false;
        voIPFragment.isInPinchToZoomTouchMode = false;
    }

    @Override
    public final void onAudioSettingsChanged() {
        updateButtons$1(true);
    }

    public final void onBackPressed$1() {
        if (this.isFinished || this.switchingToPip) {
            return;
        }
        AnonymousClass24 anonymousClass24 = this.previewDialog;
        if (anonymousClass24 != null) {
            anonymousClass24.dismiss(false, false);
            return;
        }
        if (this.callingUserIsVideo && this.currentUserIsVideo && this.cameraForceExpanded) {
            this.cameraForceExpanded = false;
            this.currentUserCameraFloatingLayout.setRelativePosition(this.callingUserMiniFloatingLayout);
            this.currentUserCameraIsFullscreen = false;
            this.previousState = this.currentState;
            updateViewState$1();
            return;
        }
        if (this.emojiExpanded) {
            expandEmoji(false);
            return;
        }
        if (this.emojiRationalLayout.getVisibility() != 8) {
            return;
        }
        if (!this.canSwitchToPip || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isConverting()) {
            finish(330L);
            return;
        }
        if (PipUtils.checkPermissions(this.activity) <= 0) {
            AlertsCreator.createDrawOverlayPermissionDialog(this.activity, new VoIPFragment$$ExternalSyntheticLambda12(this, 6), true).show();
            return;
        }
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
        animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
        this.buttonsLayout.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.bottomShadow.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.topShadow.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.callingUserMiniFloatingLayout.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        this.notificationsLayout.animate().alpha(0.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
        VoIPPiPView.switchingToPip = true;
        this.switchingToPip = true;
        ValueAnimator valueAnimatorCreatePiPTransition = createPiPTransition(false);
        this.notificationsLocker.lock();
        valueAnimatorCreatePiPTransition.addListener(new AnonymousClass11(this, 1));
        valueAnimatorCreatePiPTransition.setDuration(350L);
        valueAnimatorCreatePiPTransition.setInterpolator(cubicBezierInterpolator);
        valueAnimatorCreatePiPTransition.start();
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        VoIPService.StateListener.CC.$default$onCameraFirstFrameAvailable(this);
    }

    @Override
    public final void onCameraSwitch(boolean z) {
        this.previousState = this.currentState;
        updateViewState$1();
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
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
        updateViewState$1();
    }

    public final void onRequestPermissionsResultInternal$1(int i, int[] iArr) {
        if (i == 101) {
            if (VoIPService.getSharedState() == null) {
                finish(330L);
                return;
            }
            if (iArr.length > 0 && iArr[0] == 0) {
                runAcceptCallAnimation(new VoIPFragment$$ExternalSyntheticLambda31(0));
            } else if (!this.activity.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().declineIncomingCall();
                }
                VoIPHelper.permissionDenied(i, this.activity, new VoIPFragment$$ExternalSyntheticLambda2(this, 7));
                return;
            }
        }
        if (i == 102) {
            if (VoIPService.getSharedState() == null) {
                finish(330L);
            } else {
                if (iArr.length <= 0 || iArr[0] != 0) {
                    return;
                }
                toggleCameraInput();
            }
        }
    }

    @Override
    public final void onScreenOnChange(boolean z) {
    }

    @Override
    public final void onSignalBarsCountChanged(int i) {
        VoIpGradientLayout voIpGradientLayout;
        if (i > 0) {
            this.signalBarWasReceived = true;
        }
        if (this.statusTextView == null || (voIpGradientLayout = this.gradientLayout) == null) {
            return;
        }
        int i2 = voIpGradientLayout.state;
        if ((i2 == 2 || i2 == 3) && this.signalBarWasReceived) {
            AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda9(this, i, 0), 400L);
        }
    }

    @Override
    public final void onStateChanged(int i) {
        int i2 = this.currentState;
        if (i2 != i) {
            this.previousState = i2;
            this.currentState = i;
            if (this.windowView != null) {
                updateViewState$1();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
        this.previousState = this.currentState;
        if (z && !this.isVideoCall) {
            this.isVideoCall = true;
        }
        updateViewState$1();
    }

    @Override
    public final View pipCreatePictureInPictureView() {
        VoIPTextureView voIPTextureView = new VoIPTextureView(this.activity, false, true, false, false);
        this.pipTextureView = voIPTextureView;
        voIPTextureView.renderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.pipTextureView.renderer.setEnableHardwareScaler(true);
        this.pipTextureView.renderer.setRotateTextureWithScreen(true);
        VoIPTextureView voIPTextureView2 = this.pipTextureView;
        voIPTextureView2.scaleType = 1;
        voIPTextureView2.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new RendererCommon.RendererEvents() {
            @Override
            public final void onFirstFrameRendered() {
                VoIPFragment voIPFragment = VoIPFragment.this;
                Trigger trigger = voIPFragment.firstFrameCallback;
                if (trigger != null) {
                    trigger.run();
                    voIPFragment.firstFrameCallback = null;
                }
            }

            @Override
            public final void onFrameResolutionChanged(int i, int i2, int i3) {
            }
        });
        View view = this.pipTextureView.backgroundView;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.pipTextureView;
    }

    @Override
    public final Bitmap pipCreatePictureInPictureViewBitmap() {
        VoIPTextureView voIPTextureView = this.pipTextureView;
        if (voIPTextureView == null || !voIPTextureView.renderer.isAvailable()) {
            return null;
        }
        return this.pipTextureView.renderer.getBitmap();
    }

    @Override
    public final Bitmap pipCreatePrimaryWindowViewBitmap() {
        VoIPTextureView voIPTextureView = this.callingUserTextureView;
        if (voIPTextureView == null || !voIPTextureView.renderer.isAvailable()) {
            return null;
        }
        return this.callingUserTextureView.renderer.getBitmap();
    }

    @Override
    public final void pipHidePrimaryWindowView(Trigger trigger) {
        this.firstFrameCallback = trigger;
        VoIPTextureView voIPTextureView = this.callingUserTextureView;
        if (voIPTextureView != null) {
            voIPTextureView.renderer.clearFirstFrame();
        }
        this.windowViewSkipRender = true;
        updateViewState$1();
        ((WindowManager) this.activity.getSystemService("window")).removeView(this.windowView);
        invalidate();
    }

    @Override
    public final boolean pipIsAvailable() {
        return true;
    }

    @Override
    public final void pipRenderBackground(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    @Override
    public final void pipRenderForeground(Canvas canvas) {
    }

    @Override
    public final void pipShowPrimaryWindowView(Trigger trigger) {
        this.firstFrameCallback = trigger;
        WindowManager windowManager = (WindowManager) this.activity.getSystemService("window");
        AnonymousClass1 anonymousClass1 = this.windowView;
        anonymousClass1.getClass();
        windowManager.addView(anonymousClass1, VoIPWindowView.createWindowLayoutParams());
        this.windowViewSkipRender = false;
        updateViewState$1();
        invalidate();
        VoIPTextureView voIPTextureView = this.pipTextureView;
        if (voIPTextureView != null) {
            voIPTextureView.renderer.release();
            this.pipTextureView = null;
        }
    }

    public final void runAcceptCallAnimation(Runnable runnable) {
        if (this.bottomVideoBtn.getVisibility() == 0) {
            this.acceptDeclineView.getLocationOnScreen(new int[2]);
            AcceptDeclineView acceptDeclineView = this.acceptDeclineView;
            ValueAnimator valueAnimator = acceptDeclineView.callAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                acceptDeclineView.callAnimator = null;
                RLottieDrawable rLottieDrawable = acceptDeclineView.acceptVoiceDrawable;
                rLottieDrawable.isRunning = false;
                rLottieDrawable.checkChoreographer$1();
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
            RLottieDrawable rLottieDrawable2 = acceptDeclineView2.acceptVoiceDrawable;
            rLottieDrawable2.isRunning = false;
            rLottieDrawable2.checkChoreographer$1();
        }
        this.bottomEndCallBtn.setData(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
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
                VoIPFragment voIPFragment = this.f$0;
                voIPFragment.getClass();
                float fFloatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                voIPFragment.acceptDeclineView.setTranslationY(iDp2 * fFloatValue);
                int i = marginEnd;
                int i2 = (int) (i - ((i + iDp) * fFloatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i2;
                marginLayoutParams2.rightMargin = i2;
                voIPFragment.acceptDeclineView.requestLayout();
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
        animatorSet.addListener(new QrActivity.AnonymousClass4(22, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda2(this, 10), 133L);
    }

    public final void setFrontalCameraAction(VoIpSwitchLayout voIpSwitchLayout, VoIPService voIPService) {
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
            voIpSwitchLayout.setOnBtnClickedListener(new VoIPFragment$$ExternalSyntheticLambda42(this, voIPService, voIpSwitchLayout, 0));
        }
    }

    public final void setMicrohoneAction(VoIpSwitchLayout voIpSwitchLayout, VoIPService voIPService, boolean z) {
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
        voIpSwitchLayout.setOnBtnClickedListener(new VoIPFragment$$ExternalSyntheticLambda12(this, 4));
    }

    public final void setSpeakerPhoneAction(VoIpSwitchLayout voIpSwitchLayout, VoIPService voIPService) {
        int i;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (voIPService.isBluetoothOn()) {
            voIpSwitchLayout.setType(4, false, false);
            i = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            voIpSwitchLayout.setType(5, true, false);
            i = 0;
        } else {
            voIpSwitchLayout.setType(5, false, false);
            i = 1;
        }
        voIpSwitchLayout.setEnabled(true);
        voIpSwitchLayout.setOnBtnClickedListener(new VoIPFragment$$ExternalSyntheticLambda37(this, i, voIpSwitchLayout, voIPService, 0));
    }

    public final void setVideoAction(VoIpSwitchLayout voIpSwitchLayout, VoIPService voIPService, boolean z) {
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
        voIpSwitchLayout.setOnBtnClickedListener(new VoIPFragment$$ExternalSyntheticLambda12(this, 5));
        voIpSwitchLayout.setEnabled(true);
    }

    public final void showAcceptDeclineView(boolean z, boolean z2) {
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
                this.acceptDeclineView.animate().setListener(new AnonymousClass11(this, 8)).alpha(0.0f);
            }
        } else {
            this.acceptDeclineView.setVisibility(z ? 0 : 8);
        }
        this.acceptDeclineView.setEnabled(z);
        this.acceptDeclineView.setTag(z ? 1 : null);
    }

    public final void showCallingUserAvatarMini(boolean z, boolean z2) {
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
            this.callingUserPhotoViewMini.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(CubicBezierInterpolator.DEFAULT).setListener(new AnonymousClass11(this, 7)).start();
        }
        this.callingUserPhotoViewMini.setTag(z3 ? 1 : null);
    }

    public final void showErrorDialog(CharSequence charSequence) {
        TextView textView;
        if (this.activity.isFinishing()) {
            return;
        }
        DarkAlertDialog darkAlertDialog = new DarkAlertDialog(this.activity);
        boolean[] zArr = new boolean[3];
        darkAlertDialog.title = LocaleController.getString(R.string.VoipFailed);
        darkAlertDialog.message = charSequence;
        darkAlertDialog.positiveButtonText = LocaleController.getString(R.string.OK);
        darkAlertDialog.positiveButtonListener = null;
        darkAlertDialog.show();
        for (int i = 0; i < 3; i++) {
            if (zArr[i] && (textView = (TextView) darkAlertDialog.getButton(-(i + 1))) != null) {
                textView.setTextColor(darkAlertDialog.getThemedColor(Theme.key_text_RedBold));
            }
        }
        darkAlertDialog.setCanceledOnTouchOutside(true);
        darkAlertDialog.setOnDismissListener(new ShareActivity$$ExternalSyntheticLambda0(this, 7));
    }

    public final void showFloatingLayout(int i, boolean z) {
        AnimatorSet animatorSet;
        if (this.currentUserCameraFloatingLayout.getTag() == null || ((Integer) this.currentUserCameraFloatingLayout.getTag()).intValue() != 2) {
            this.currentUserCameraFloatingLayout.setUiVisible(this.uiVisible);
        }
        if (!z && (animatorSet = this.cameraShowingAnimator) != null) {
            animatorSet.removeAllListeners();
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
                AnimatorSet animatorSet2 = this.cameraShowingAnimator;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.cameraShowingAnimator.cancel();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.currentUserCameraFloatingLayout, (Property<VoIPFloatingLayout, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.currentUserCameraFloatingLayout, (Property<VoIPFloatingLayout, Float>) View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.currentUserCameraFloatingLayout, (Property<VoIPFloatingLayout, Float>) View.SCALE_Y, 0.7f, 1.0f));
                this.cameraShowingAnimator = animatorSet3;
                animatorSet3.setDuration(150L).start();
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
            AnimatorSet animatorSet4 = this.cameraShowingAnimator;
            if (animatorSet4 != null) {
                animatorSet4.removeAllListeners();
                this.cameraShowingAnimator.cancel();
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            VoIPFloatingLayout voIPFloatingLayout2 = this.currentUserCameraFloatingLayout;
            animatorSet5.playTogether(ObjectAnimator.ofFloat(voIPFloatingLayout2, (Property<VoIPFloatingLayout, Float>) View.ALPHA, voIPFloatingLayout2.getAlpha(), 0.0f));
            if (this.currentUserCameraFloatingLayout.getTag() != null && ((Integer) this.currentUserCameraFloatingLayout.getTag()).intValue() == 2) {
                VoIPFloatingLayout voIPFloatingLayout3 = this.currentUserCameraFloatingLayout;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(voIPFloatingLayout3, (Property<VoIPFloatingLayout, Float>) View.SCALE_X, voIPFloatingLayout3.getScaleX(), 0.7f);
                VoIPFloatingLayout voIPFloatingLayout4 = this.currentUserCameraFloatingLayout;
                animatorSet5.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(voIPFloatingLayout4, (Property<VoIPFloatingLayout, Float>) View.SCALE_Y, voIPFloatingLayout4.getScaleX(), 0.7f));
            }
            this.cameraShowingAnimator = animatorSet5;
            animatorSet5.addListener(new AnonymousClass11(this, 6));
            this.cameraShowingAnimator.setDuration(250L).setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.cameraShowingAnimator.setStartDelay(50L);
            this.cameraShowingAnimator.start();
        }
        this.currentUserCameraFloatingLayout.setTag(Integer.valueOf(i));
    }

    public final void showUi(boolean z) {
        int i;
        ValueAnimator valueAnimator = this.uiVisibilityAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        VoIPFragment$$ExternalSyntheticLambda4 voIPFragment$$ExternalSyntheticLambda4 = this.statusbarAnimatorListener;
        if (z || !this.uiVisible) {
            if (z && !this.uiVisible) {
                this.tapToVideoTooltip.hide(true);
                this.encryptionTooltip.hide(true);
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
                valueAnimatorOfFloat.addUpdateListener(voIPFragment$$ExternalSyntheticLambda4);
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
            valueAnimatorOfFloat2.addUpdateListener(voIPFragment$$ExternalSyntheticLambda4);
            this.uiVisibilityAnimator.setDuration(150L).setInterpolator(cubicBezierInterpolator2);
            this.uiVisibilityAnimator.start();
            AndroidUtilities.cancelRunOnUIThread(this.hideUIRunnable);
            this.hideUiRunnableWaiting = false;
            this.buttonsLayout.setEnabled(false);
            this.encryptionTooltip.hide(true);
            i = 150;
        }
        this.uiVisible = z;
        AnonymousClass1 anonymousClass1 = this.windowView;
        if (z) {
            anonymousClass1.setSystemUiVisibility(anonymousClass1.getSystemUiVisibility() & (-5));
        } else {
            anonymousClass1.setSystemUiVisibility(anonymousClass1.getSystemUiVisibility() | 4);
        }
        this.notificationsLayout.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.uiVisible ? AndroidUtilities.dp(80.0f) : 0)).setDuration(150L).setStartDelay(i).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
    }

    public final void startWaitingFoHideUi() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPFragment$$ExternalSyntheticLambda2 voIPFragment$$ExternalSyntheticLambda2 = this.hideUIRunnable;
            AndroidUtilities.cancelRunOnUIThread(voIPFragment$$ExternalSyntheticLambda2);
            this.hideUiRunnableWaiting = false;
            if (this.canHideUI && this.uiVisible) {
                AndroidUtilities.runOnUIThread(voIPFragment$$ExternalSyntheticLambda2, 3000L);
                this.hideUiRunnableWaiting = true;
            }
        }
    }

    public final void toggleCameraInput() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.accessibilityManager.isTouchExplorationEnabled()) {
                announceForAccessibility(!this.currentUserIsVideo ? LocaleController.getString(R.string.AccDescrVoipCamOn) : LocaleController.getString(R.string.AccDescrVoipCamOff));
            }
            if (this.currentUserIsVideo) {
                this.currentUserTextureView.saveCameraLastBitmap();
                sharedInstance.setVideoState(false, 0);
                sharedInstance.clearCamera();
                this.previousState = this.currentState;
                updateViewState$1();
                return;
            }
            if (this.previewDialog == null) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                setLockOnScreen(true);
                int[] iArr = new int[2];
                this.bottomVideoBtn.getLocationOnScreen(iArr);
                AnonymousClass24 anonymousClass24 = new AnonymousClass24(getContext(), iArr[0], iArr[1]);
                this.previewDialog = anonymousClass24;
                WindowInsets windowInsets = this.lastInsets;
                if (windowInsets != null) {
                    anonymousClass24.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                }
                addView(this.previewDialog);
            }
        }
    }

    public final void updateButtons$1(boolean z) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (z) {
            TransitionSet transitionSet = new TransitionSet();
            Transition duration = new AnonymousClass23(0).setDuration(250L);
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
                    setSpeakerPhoneAction(this.bottomSpeakerBtn, sharedInstance);
                    this.speakerPhoneIcon.animate().alpha(0.0f).start();
                } else {
                    setFrontalCameraAction(this.bottomSpeakerBtn, sharedInstance);
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
                setSpeakerPhoneAction(this.bottomSpeakerBtn, sharedInstance);
                this.speakerPhoneIcon.setTag(null);
                this.speakerPhoneIcon.animate().alpha(0.0f).start();
            } else {
                setFrontalCameraAction(this.bottomSpeakerBtn, sharedInstance);
                if (this.uiVisible) {
                    this.speakerPhoneIcon.setTag(1);
                    this.speakerPhoneIcon.animate().alpha(1.0f).start();
                }
            }
            setVideoAction(this.bottomVideoBtn, sharedInstance, false);
            setMicrohoneAction(this.bottomMuteBtn, sharedInstance, z);
            this.bottomEndCallBtn.setData(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z);
            this.bottomEndCallBtn.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda22(this, 6));
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

    public final void updateKeyView(boolean z) {
        VoIPService sharedInstance;
        byte[] byteArray;
        ?? r7;
        ?? r8;
        boolean zIsLoaded;
        PhotoViewer.AnonymousClass11 anonymousClass11;
        String[] strArr;
        TLRPC.Document document;
        ?? r3;
        int i;
        AnimatedEmojiDrawable animatedEmojiDrawable;
        if (this.emojiLoaded || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        boolean z2 = false;
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
        int i2 = 0;
        while (true) {
            r7 = this.emojiViews;
            r8 = this.emojiDrawables;
            if (i2 >= 4) {
                break;
            }
            Emoji.preloadEmoji(strArrEmojifyForCall[i2]);
            ?? emojiDrawable = Emoji.getEmojiDrawable(strArrEmojifyForCall[i2]);
            if (emojiDrawable != 0) {
                emojiDrawable.setBounds(z2 ? 1 : 0, z2 ? 1 : 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                emojiDrawable.preload();
                int[] iArr = new int[1];
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(AndroidUtilities.dp(28.0f));
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(strArrEmojifyForCall[i2], textPaint.getFontMetricsInt(), z2, iArr);
                boolean z3 = charSequenceReplaceEmoji instanceof Spannable;
                int i3 = this.currentAccount;
                if (!z3) {
                    strArr = strArrEmojifyForCall;
                    document = null;
                    break;
                }
                Spannable spannable = (Spannable) charSequenceReplaceEmoji;
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(z2 ? 1 : 0, spannable.length(), Emoji.EmojiSpan.class);
                AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannable.getSpans(z2 ? 1 : 0, spannable.length(), AnimatedEmojiSpan.class);
                if (emojiSpanArr == null) {
                    strArr = strArrEmojifyForCall;
                    document = null;
                    break;
                }
                if ((iArr[z2 ? 1 : 0] - emojiSpanArr.length) - (animatedEmojiSpanArr == null ? 0 : animatedEmojiSpanArr.length) > 0) {
                    strArr = strArrEmojifyForCall;
                    document = null;
                    break;
                }
                int length = emojiSpanArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        r3 = z2;
                        strArr = strArrEmojifyForCall;
                        document = null;
                        break;
                    }
                    Emoji.EmojiSpan emojiSpan = emojiSpanArr[i4];
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = "StaticEmoji";
                    TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i3).getStickerSet(tL_inputStickerSetShortName, Integer.valueOf((int) r3), false, true, new VoIPFragment$$ExternalSyntheticLambda7(this, 0));
                    if (stickerSet == null) {
                        r3 = z2;
                        strArr = strArrEmojifyForCall;
                        document = null;
                        break;
                    }
                    String strReplace = emojiSpan.emoji.replace("️", "");
                    ArrayList<TLRPC.Document> arrayList = stickerSet.documents;
                    int size = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            r3 = z2;
                            strArr = strArrEmojifyForCall;
                            i = length;
                            document = null;
                            break;
                        }
                        TLRPC.Document document2 = arrayList.get(i5);
                        i5++;
                        strArr = strArrEmojifyForCall;
                        document = document2;
                        ArrayList<TLRPC.Document> arrayList2 = arrayList;
                        i = length;
                        if (TextUtils.equals(MessageObject.findAnimatedEmojiEmoticon(document, null).replace("️", ""), strReplace)) {
                            break;
                        }
                        r3 = z2;
                        length = i;
                        strArrEmojifyForCall = strArr;
                        arrayList = arrayList2;
                    }
                    if (document != null) {
                        break;
                    }
                    r3 = z2;
                    i4++;
                    length = i;
                    strArrEmojifyForCall = strArr;
                    r3 = 0;
                }
                if (document != null) {
                    r3 = z2;
                    ?? r2 = r8[i2];
                    if ((r2 instanceof AnimatedEmojiDrawable) && ((AnimatedEmojiDrawable) r2).getDocumentId() == document.id) {
                        animatedEmojiDrawable = (AnimatedEmojiDrawable) r8[i2];
                    } else {
                        AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(21, i3, document);
                        r8[i2] = animatedEmojiDrawable2;
                        animatedEmojiDrawable = animatedEmojiDrawable2;
                    }
                    animatedEmojiDrawable.setupEmojiThumb(strArr[i2]);
                    r7[i2].setAnimatedEmojiDrawable(animatedEmojiDrawable);
                    r7[i2].getImageReceiver().clearImage();
                    emojiDrawable = animatedEmojiDrawable;
                } else {
                    r3 = z2;
                    r7[i2].setImageDrawable(emojiDrawable);
                    emojiDrawable = emojiDrawable;
                }
                r7[i2].setVisibility(8);
            } else {
                strArr = strArrEmojifyForCall;
            }
            r8[i2] = emojiDrawable;
            i2++;
            strArrEmojifyForCall = strArr;
            z2 = false;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            ?? r4 = r8[i7];
            if (r4 instanceof Emoji.EmojiDrawable) {
                zIsLoaded = ((Emoji.EmojiDrawable) r4).isLoaded();
            } else if (!(r4 instanceof AnimatedEmojiDrawable) || (anonymousClass11 = ((AnimatedEmojiDrawable) r4).imageReceiver) == null) {
                zIsLoaded = false;
            } else {
                Drawable thumb = anonymousClass11.getThumb();
                if (!(thumb instanceof Emoji.EmojiDrawable) || ((Emoji.EmojiDrawable) thumb).isLoaded()) {
                    zIsLoaded = true;
                } else {
                    zIsLoaded = false;
                }
            }
            if (zIsLoaded) {
                i6++;
            }
        }
        if (i6 == 4) {
            this.emojiLoaded = true;
            for (int i8 = 0; i8 < 4; i8++) {
                if (r7[i8].getVisibility() != 0) {
                    r7[i8].setVisibility(0);
                    if (z) {
                        r7[i8].setAlpha(0.0f);
                        r7[i8].setScaleX(0.0f);
                        r7[i8].setScaleY(0.0f);
                        OKLCH.m(r7[i8].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), CubicBezierInterpolator.EASE_OUT_BACK, 250L);
                    }
                }
            }
            this.encryptionTooltip.postDelayed(new VoIPFragment$$ExternalSyntheticLambda2(this, 0), 1000L);
        }
    }

    public final void updateSpeakerPhoneIcon() {
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

    public final void updateSystemBarColors() {
        this.overlayPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (this.uiVisibilityAlpha * 102.0f * this.enterTransitionProgress)));
        this.overlayBottomPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (this.enterTransitionProgress * 127.5f)));
        AnonymousClass2 anonymousClass2 = this.fragmentView;
        if (anonymousClass2 != null) {
            anonymousClass2.invalidate();
        }
    }

    public final void updateViewState$1() {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        int iDp;
        boolean z5;
        int i2;
        boolean z6;
        boolean z7;
        int i3;
        float f;
        int i4;
        float f2;
        int iDp2;
        int i5;
        boolean z8;
        int i6;
        boolean z9;
        int childsHight;
        VoIPFloatingLayout voIPFloatingLayout;
        VoIPFloatingLayout voIPFloatingLayout2;
        boolean z10;
        VoIPFloatingLayout voIPFloatingLayout3;
        float f3;
        VoIPFloatingLayout voIPFloatingLayout4;
        float f4;
        boolean z11;
        VoIPFragment$$ExternalSyntheticLambda2 voIPFragment$$ExternalSyntheticLambda2;
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
        boolean z12;
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
        TextView textView;
        int i9 = 0;
        boolean z16 = true;
        if (this.isFinished || this.switchingToPip) {
            return;
        }
        boolean z17 = this.previousState != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i10 = this.currentState;
        TLRPC.User user = this.callingUser;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        switch (i10) {
                            case 11:
                                boolean z18 = sharedInstance != null && sharedInstance.hasRate();
                                this.currentUserTextureView.saveCameraLastBitmap();
                                if (!z18 || this.isFinished) {
                                    user = user;
                                    AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda2(this, 1), 200L);
                                } else {
                                    if (this.uiVisible) {
                                        int[] iArr = new int[2];
                                        int i11 = AndroidUtilities.displaySize.x;
                                        this.bottomEndCallBtn.getLocationOnScreen(iArr);
                                        int measuredWidth = ((i11 - iArr[0]) - ((this.bottomEndCallBtn.getMeasuredWidth() - AndroidUtilities.dp(52.0f)) / 2)) - AndroidUtilities.dp(52.0f);
                                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.endCloseLayout.getLayoutParams();
                                        marginLayoutParams.rightMargin = measuredWidth;
                                        marginLayoutParams.leftMargin = measuredWidth;
                                        this.endCloseLayout.setTranslationY(iArr[1]);
                                        this.endCloseLayout.setAlpha(1.0f);
                                        this.endCloseLayout.setLayoutParams(marginLayoutParams);
                                        this.buttonsLayout.animate().alpha(0.0f).setDuration(80L).start();
                                        AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda9(23, this, sharedInstance), 2L);
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
                                        this.endCloseLayout.switchToClose(new VoIPFragment$$ExternalSyntheticLambda11(this, sharedInstance, i9), false);
                                    }
                                    this.rateCallLayout.setVisibility(0);
                                    RateCallLayout rateCallLayout = this.rateCallLayout;
                                    rateCallLayout.onRateSelected = new VoIPFragment$$ExternalSyntheticLambda12(this, i9);
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
                                    int i12 = 0;
                                    while (true) {
                                        RateCallLayout.StarContainer[] starContainerArr = rateCallLayout.startsViews;
                                        if (i12 >= starContainerArr.length) {
                                            animatorSet.start();
                                            if (this.emojiExpanded) {
                                                this.emojiExpanded = false;
                                                ViewPropertyAnimator duration = this.hideEmojiLayout.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(250L);
                                                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                                                duration.setInterpolator(cubicBezierInterpolator).setListener(new ChatActivity.AnonymousClass77(this.hideEmojiLayout)).start();
                                                this.emojiLayout.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(cubicBezierInterpolator).setDuration(250L).start();
                                                this.emojiRationalLayout.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new ChatActivity.AnonymousClass77(this.hideEmojiLayout)).setDuration(250L).setInterpolator(cubicBezierInterpolator).start();
                                            }
                                            for (BackupImageView backupImageView : this.emojiViews) {
                                                backupImageView.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(CubicBezierInterpolator.DEFAULT).setDuration(250L).start();
                                            }
                                            this.callingUserTitle.animate().alpha(0.0f).setDuration(70L).setListener(new AnimatorListenerAdapter() {
                                                @Override
                                                public final void onAnimationEnd(Animator animator) {
                                                    VoIPFragment voIPFragment = VoIPFragment.this;
                                                    voIPFragment.callingUserTitle.setText(LocaleController.getString(R.string.VoipCallEnded));
                                                    voIPFragment.callingUserTitle.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
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
                                            updateButtons$1(true);
                                            this.bottomEndCallBtn.setVisibility(4);
                                            this.callingUserMiniFloatingLayout.setAlpha(0.0f);
                                            this.callingUserMiniFloatingLayout.setVisibility(8);
                                            this.currentUserCameraFloatingLayout.setAlpha(0.0f);
                                            this.currentUserCameraFloatingLayout.setVisibility(8);
                                            AnonymousClass24 anonymousClass24 = this.previewDialog;
                                            if (anonymousClass24 != null) {
                                                anonymousClass24.dismiss(false, false);
                                            }
                                            this.notificationsLayout.animate().alpha(0.0f).setDuration(250L).start();
                                        } else {
                                            AnimatorSet animatorSet4 = new AnimatorSet();
                                            starContainerArr[i12].setAlpha(0.0f);
                                            animatorSet4.playTogether(ObjectAnimator.ofFloat(starContainerArr[i12], (Property<RateCallLayout.StarContainer, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(starContainerArr[i12], (Property<RateCallLayout.StarContainer, Float>) property2, 0.3f, 1.0f), ObjectAnimator.ofFloat(starContainerArr[i12], (Property<RateCallLayout.StarContainer, Float>) property3, 0.3f, 1.0f), ObjectAnimator.ofFloat(starContainerArr[i12], (Property<RateCallLayout.StarContainer, Float>) property4, AndroidUtilities.dp(30.0f), 0.0f));
                                            animatorSet4.setDuration(250L);
                                            animatorSet4.setStartDelay(((long) i12) * 16);
                                            animatorSet4.start();
                                            i12++;
                                            property = property;
                                        }
                                    }
                                }
                                break;
                            case 12:
                                if (this.previousState != 12) {
                                    this.statusTextView.setText(LocaleController.getString(R.string.VoipExchangingKeys), true, z17);
                                }
                                user = user;
                                break;
                            case 13:
                                this.statusTextView.setText(LocaleController.getString(R.string.VoipWaiting), true, z17);
                                user = user;
                                break;
                            case 14:
                                this.statusTextView.setText(LocaleController.getString(R.string.VoipRequesting), true, z17);
                                user = user;
                                break;
                            case 15:
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
                                user = user;
                                z = false;
                                break;
                            case 16:
                                if (this.previousState != 16) {
                                    this.statusTextView.setText(LocaleController.getString(R.string.VoipRinging), true, z17);
                                }
                                user = user;
                                break;
                            case 17:
                                this.statusTextView.setText(LocaleController.getString(R.string.VoipBusy), false, z17);
                                this.acceptDeclineView.setRetryMod(true);
                                this.currentUserIsVideo = false;
                                this.callingUserIsVideo = false;
                                user = user;
                                z = false;
                                break;
                            default:
                                user = user;
                                break;
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
                            if (sharedInstance.getVideoState(false) != 1) {
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
                    setLockOnScreen(this.deviceIsLocked);
                    if (this.currentState == 3 || !(this.currentUserIsVideo || this.callingUserIsVideo)) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    this.canHideUI = z5;
                    if (!z5 && !this.uiVisible) {
                        showUi(true);
                    }
                    if (this.uiVisible && this.canHideUI && !this.hideUiRunnableWaiting && sharedInstance != null) {
                        AndroidUtilities.runOnUIThread(this.hideUIRunnable, 3000L);
                        this.hideUiRunnableWaiting = true;
                    }
                    i2 = this.currentState;
                    if (i2 == 11 && this.uiVisible) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!z16 || i2 == 16 || i2 == 11 || i2 == 12 || i2 == 14 || i2 == 6 || !this.uiVisible || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (z17) {
                        if (z6) {
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
                        if (z7) {
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
                        int i13 = -AndroidUtilities.dp(16.0f);
                        if (this.uiVisible) {
                            iDp3 = AndroidUtilities.dp(f6);
                        } else {
                            iDp3 = 0;
                        }
                        viewPropertyAnimatorAnimate.translationY(i13 - iDp3).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    } else {
                        ImageView imageView = this.backIcon;
                        if (z6) {
                            i3 = 0;
                        } else {
                            i3 = 8;
                        }
                        imageView.setVisibility(i3);
                        ImageView imageView2 = this.backIcon;
                        if (z6) {
                            f = 1.0f;
                        } else {
                            f = 0.0f;
                        }
                        imageView2.setAlpha(f);
                        ImageView imageView3 = this.addIcon;
                        if (z7) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        imageView3.setVisibility(i4);
                        ImageView imageView4 = this.addIcon;
                        if (z7) {
                            f2 = 1.0f;
                        } else {
                            f2 = 0.0f;
                        }
                        imageView4.setAlpha(f2);
                        VoIPNotificationsLayout voIPNotificationsLayout5 = this.notificationsLayout;
                        int i14 = -AndroidUtilities.dp(16.0f);
                        if (this.uiVisible) {
                            iDp2 = AndroidUtilities.dp(80.0f);
                        } else {
                            iDp2 = 0;
                        }
                        voIPNotificationsLayout5.setTranslationY(i14 - iDp2);
                    }
                    i5 = this.currentState;
                    if (i5 != 10 && i5 != 11) {
                        updateButtons$1(z17);
                    }
                    if (i9 != 0) {
                        this.statusTextView.showTimer(z17);
                    }
                    this.statusTextView.showReconnect(z, z17);
                    if (this.callingUserPhotoViewMini.getVisibility() == 0 && this.emojiExpanded) {
                        iDp += AndroidUtilities.dp(24.0f);
                        layout = this.emojiRationalTextView.getLayout();
                        if (layout != null && (lineCount = layout.getLineCount()) > 2) {
                            iDp = zzkv.m(lineCount, 2, AndroidUtilities.dp(20.0f), iDp);
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
                            animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                        } else {
                            animate().setStartDelay(0L).alpha(0.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                            j = 250;
                        }
                        if (iDp != this.statusLayoutAnimateToOffset) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = animate();
                            if (this.currentState != 11) {
                                j = 0;
                            }
                            viewPropertyAnimatorAnimate2.setStartDelay(j).translationY(iDp).setDuration(200L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                        }
                    } else {
                        setTranslationY(iDp);
                    }
                    this.statusLayoutAnimateToOffset = iDp;
                    if (sharedInstance == null && sharedInstance.isScreencast()) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    i6 = this.currentState;
                    if (i6 != 11 || i6 == 17 || ((!this.currentUserIsVideo || z8) && !this.callingUserIsVideo)) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    this.canSwitchToPip = z9;
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
                                int i15 = R.drawable.calls_mute_mini;
                                f5 = 300.0f;
                                int i16 = R.string.VoipUserMicrophoneIsOff;
                                firstName2 = UserObject.getFirstName(user);
                                if (firstName2 == null) {
                                    voIPNotificationsLayout2.getClass();
                                    charSequenceEllipsize = "";
                                } else {
                                    charSequenceEllipsize = TextUtils.ellipsize(firstName2, voIPNotificationsLayout2.textPaint, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
                                }
                                voIPNotificationsLayout2.addNotification(i15, LocaleController.formatString("VoipUserMicrophoneIsOff", i16, charSequenceEllipsize), "muted");
                            } else {
                                z2 = z2;
                                f5 = 300.0f;
                                this.notificationsLayout.removeNotification("muted");
                            }
                            if (sharedInstance.getRemoteVideoState() == 0) {
                                voIPNotificationsLayout = this.notificationsLayout;
                                int i17 = R.drawable.calls_camera_mini;
                                int i18 = R.string.VoipUserCameraIsOff;
                                firstName = UserObject.getFirstName(user);
                                if (firstName == null) {
                                    voIPNotificationsLayout.getClass();
                                } else {
                                    objEllipsize = TextUtils.ellipsize(firstName, voIPNotificationsLayout.textPaint, AndroidUtilities.dp(f5), TextUtils.TruncateAt.END);
                                }
                                voIPNotificationsLayout.addNotification(i17, LocaleController.formatString("VoipUserCameraIsOff", i18, objEllipsize), "video");
                            } else {
                                this.notificationsLayout.removeNotification("video");
                            }
                        } else {
                            z2 = z2;
                            if (sharedInstance.getRemoteAudioState() == 0) {
                                VoIPNotificationsLayout voIPNotificationsLayout6 = this.notificationsLayout;
                                int i19 = R.drawable.calls_mute_mini;
                                int i20 = R.string.VoipUserMicrophoneIsOff;
                                String firstName3 = UserObject.getFirstName(user);
                                if (firstName3 == null) {
                                    voIPNotificationsLayout6.getClass();
                                } else {
                                    objEllipsize = TextUtils.ellipsize(firstName3, voIPNotificationsLayout6.textPaint, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
                                }
                                voIPNotificationsLayout6.addNotification(i19, LocaleController.formatString("VoipUserMicrophoneIsOff", i20, objEllipsize), "muted");
                            } else {
                                this.notificationsLayout.removeNotification("muted");
                            }
                            this.notificationsLayout.removeNotification("video");
                        }
                        if (this.notificationsLayout.getChildCount() != 0 && this.callingUserIsVideo && (phoneCall = sharedInstance.privateCall) != null && !phoneCall.video) {
                            VoIPService.SharedUIParams sharedUIParams = sharedInstance.sharedUIParams;
                            if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                sharedUIParams.tapToVideoTooltipWasShowed = true;
                                this.tapToVideoTooltip.setTranslationY(-((getMeasuredHeight() - this.buttonsLayout.getY()) + AndroidUtilities.dp(6.0f)));
                                this.tapToVideoTooltip.setJointPx(0.0f, this.bottomVideoBtn.getX() + this.buttonsLayout.getX() + AndroidUtilities.dp(14.0f));
                                this.tapToVideoTooltip.show();
                            } else if (this.notificationsLayout.getChildCount() != 0) {
                                z12 = true;
                                this.tapToVideoTooltip.hide(true);
                            }
                            z12 = true;
                        } else if (this.notificationsLayout.getChildCount() != 0) {
                            z12 = true;
                            this.tapToVideoTooltip.hide(true);
                        } else {
                            z12 = true;
                        }
                        if (z17) {
                            voIPNotificationsLayout3 = this.notificationsLayout;
                            if (voIPNotificationsLayout3.wasChanged) {
                                voIPNotificationsLayout3.lockAnimation = z12;
                                AndroidUtilities.runOnUIThread(new Tooltip$$ExternalSyntheticLambda0(voIPNotificationsLayout3, 29), 700L);
                            }
                            voIPNotificationsLayout3.wasChanged = false;
                        }
                    } else {
                        z2 = z2;
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
                    if (!this.currentUserIsVideo) {
                        z10 = true;
                        showFloatingLayout(0, z17);
                    } else if (this.callingUserIsVideo || this.cameraForceExpanded) {
                        z10 = true;
                        showFloatingLayout(1, z17);
                    } else {
                        showFloatingLayout(2, z17);
                        z10 = true;
                    }
                    if (!z4 && this.callingUserMiniFloatingLayout.getTag() == null) {
                        this.callingUserMiniFloatingLayout.setIsActive(z10);
                        if (this.callingUserMiniFloatingLayout.getVisibility() != 0) {
                            this.callingUserMiniFloatingLayout.setVisibility(0);
                            this.callingUserMiniFloatingLayout.setAlpha(0.0f);
                            this.callingUserMiniFloatingLayout.setScaleX(0.5f);
                            this.callingUserMiniFloatingLayout.setScaleY(0.5f);
                        }
                        this.callingUserMiniFloatingLayout.animate().setListener(null).cancel();
                        VoIPFloatingLayout voIPFloatingLayout5 = this.callingUserMiniFloatingLayout;
                        voIPFloatingLayout5.isAppearing = true;
                        voIPFloatingLayout5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).setStartDelay(150L).withEndAction(new VoIPFragment$$ExternalSyntheticLambda2(this, 4)).start();
                        this.callingUserMiniFloatingLayout.setTag(1);
                    } else if (!z4 && this.callingUserMiniFloatingLayout.getTag() != null) {
                        this.callingUserMiniFloatingLayout.setIsActive(false);
                        this.callingUserMiniFloatingLayout.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new AnonymousClass11(this, 5)).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
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
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.voIpSnowView.setState(z11);
                    this.voIpCoverView.setState(z11);
                    this.backgroundProvider.setHasVideo(z11);
                    if (this.callingUserIsVideo && !z2 && this.isNearEar) {
                        this.isNearEar = false;
                        if (sharedInstance != null) {
                            sharedInstance.playStartRecordSound();
                        }
                    }
                    if (z11) {
                        if (this.topShadow.getVisibility() != 0) {
                            this.topShadow.setVisibility(0);
                            this.bottomShadow.setVisibility(0);
                        }
                    } else if (this.topShadow.getVisibility() != 4) {
                        this.topShadow.setVisibility(4);
                        this.bottomShadow.setVisibility(4);
                    }
                    voIPFragment$$ExternalSyntheticLambda2 = this.stopAnimatingBgRunnable;
                    AndroidUtilities.cancelRunOnUIThread(voIPFragment$$ExternalSyntheticLambda2);
                    if (this.currentState == 3) {
                        AndroidUtilities.runOnUIThread(voIPFragment$$ExternalSyntheticLambda2, 10000L);
                    }
                    if (this.pipSource != null) {
                        int i21 = PipSource.sourceIdCounter;
                    }
                }
                user = user;
                VoIPStatusTextView voIPStatusTextView = this.statusTextView;
                int i22 = R.string.VoipFailed;
                voIPStatusTextView.setText(LocaleController.getString(i22), false, z17);
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : "ERROR_UNKNOWN";
                if (TextUtils.equals(lastError, "ERROR_UNKNOWN")) {
                    AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda2(this, 3), 1000L);
                } else if (TextUtils.equals(lastError, "ERROR_INCOMPATIBLE")) {
                    showErrorDialog(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerIncompatible", R.string.VoipPeerIncompatible, ContactsController.formatName(user.first_name, user.last_name))));
                } else if (TextUtils.equals(lastError, "ERROR_PEER_OUTDATED")) {
                    if (this.isVideoCall) {
                        String string = LocaleController.formatString("VoipPeerVideoOutdated", R.string.VoipPeerVideoOutdated, UserObject.getFirstName(user));
                        boolean[] zArr = new boolean[1];
                        DarkAlertDialog darkAlertDialog = new DarkAlertDialog(this.activity);
                        boolean[] zArr2 = new boolean[3];
                        darkAlertDialog.title = LocaleController.getString(i22);
                        darkAlertDialog.message = AndroidUtilities.replaceTags(string);
                        String string2 = LocaleController.getString(R.string.Cancel);
                        VoIPFragment$$ExternalSyntheticLambda12 voIPFragment$$ExternalSyntheticLambda12 = new VoIPFragment$$ExternalSyntheticLambda12(this, 1);
                        darkAlertDialog.negativeButtonText = string2;
                        darkAlertDialog.negativeButtonListener = voIPFragment$$ExternalSyntheticLambda12;
                        String string3 = LocaleController.getString(R.string.VoipPeerVideoOutdatedMakeVoice);
                        TodoItemMenu$$ExternalSyntheticLambda19 todoItemMenu$$ExternalSyntheticLambda19 = new TodoItemMenu$$ExternalSyntheticLambda19(4, this, zArr);
                        darkAlertDialog.positiveButtonText = string3;
                        darkAlertDialog.positiveButtonListener = todoItemMenu$$ExternalSyntheticLambda19;
                        darkAlertDialog.show();
                        for (int i23 = 0; i23 < 3; i23++) {
                            if (zArr2[i23] && (textView = (TextView) darkAlertDialog.getButton(-(i23 + 1))) != null) {
                                textView.setTextColor(darkAlertDialog.getThemedColor(Theme.key_text_RedBold));
                            }
                        }
                        darkAlertDialog.setCanceledOnTouchOutside(true);
                        darkAlertDialog.setOnDismissListener(new VoIPFragment$$ExternalSyntheticLambda16(0, this, zArr));
                    } else {
                        showErrorDialog(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerOutdated", R.string.VoipPeerOutdated, UserObject.getFirstName(user))));
                    }
                } else if (TextUtils.equals(lastError, "ERROR_PRIVACY")) {
                    showErrorDialog(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallNotAvailable, ContactsController.formatName(user.first_name, user.last_name))));
                    AlertsCreator.showCallsForbidden(this.activity, this.currentAccount, user.id);
                } else if (TextUtils.equals(lastError, "ERROR_AUDIO_IO")) {
                    showErrorDialog("Error initializing audio hardware");
                } else if (TextUtils.equals(lastError, "ERROR_LOCALIZED")) {
                    finish(330L);
                } else if (TextUtils.equals(lastError, "ERROR_CONNECTION_SERVICE")) {
                    showErrorDialog(LocaleController.getString(R.string.VoipErrorUnknown));
                } else {
                    AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda2(this, 2), 1000L);
                }
            }
            updateKeyView(z17);
            if (this.currentState == 5) {
                z = this.wasEstablished;
                if (!z && this.previousState != 5) {
                    this.statusTextView.setText(LocaleController.getString(R.string.VoipConnecting), true, z17);
                }
                i9 = 0;
            } else {
                this.wasEstablished = true;
                z = false;
                i9 = 1;
            }
            z16 = false;
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
                    if (sharedInstance.getVideoState(false) != 1) {
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
            setLockOnScreen(this.deviceIsLocked);
            if (this.currentState == 3) {
                z5 = false;
            } else {
                z5 = false;
            }
            this.canHideUI = z5;
            if (!z5) {
                showUi(true);
            }
            if (this.uiVisible) {
                AndroidUtilities.runOnUIThread(this.hideUIRunnable, 3000L);
                this.hideUiRunnableWaiting = true;
            }
            i2 = this.currentState;
            if (i2 == 11) {
                z6 = false;
            } else {
                z6 = false;
            }
            if (z16) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (z17) {
                if (z6) {
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
                if (z7) {
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
                if (z6) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                imageView5.setVisibility(i3);
                ImageView imageView6 = this.backIcon;
                if (z6) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                imageView6.setAlpha(f);
                ImageView imageView7 = this.addIcon;
                if (z7) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                imageView7.setVisibility(i4);
                ImageView imageView8 = this.addIcon;
                if (z7) {
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
                updateButtons$1(z17);
            }
            if (i9 != 0) {
                this.statusTextView.showTimer(z17);
            }
            this.statusTextView.showReconnect(z, z17);
            if (this.callingUserPhotoViewMini.getVisibility() == 0) {
                iDp += AndroidUtilities.dp(24.0f);
                layout = this.emojiRationalTextView.getLayout();
                if (layout != null) {
                    iDp = zzkv.m(lineCount, 2, AndroidUtilities.dp(20.0f), iDp);
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
                    animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                } else {
                    j = 250;
                    animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                }
                if (iDp != this.statusLayoutAnimateToOffset) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate4 = animate();
                    if (this.currentState != 11) {
                        j = 0;
                    }
                    viewPropertyAnimatorAnimate4.setStartDelay(j).translationY(iDp).setDuration(200L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                }
            } else {
                setTranslationY(iDp);
            }
            this.statusLayoutAnimateToOffset = iDp;
            if (sharedInstance == null) {
                z8 = false;
            } else {
                z8 = false;
            }
            i6 = this.currentState;
            if (i6 != 11) {
                z9 = false;
            } else {
                z9 = false;
            }
            this.canSwitchToPip = z9;
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
                        f5 = 300.0f;
                        int i113 = R.string.VoipUserMicrophoneIsOff;
                        firstName2 = UserObject.getFirstName(user);
                        if (firstName2 == null) {
                            voIPNotificationsLayout2.getClass();
                            charSequenceEllipsize = "";
                        } else {
                            charSequenceEllipsize = TextUtils.ellipsize(firstName2, voIPNotificationsLayout2.textPaint, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
                        }
                        voIPNotificationsLayout2.addNotification(i112, LocaleController.formatString("VoipUserMicrophoneIsOff", i113, charSequenceEllipsize), "muted");
                    } else {
                        z2 = z2;
                        f5 = 300.0f;
                        this.notificationsLayout.removeNotification("muted");
                    }
                    if (sharedInstance.getRemoteVideoState() == 0) {
                        voIPNotificationsLayout = this.notificationsLayout;
                        int i114 = R.drawable.calls_camera_mini;
                        int i115 = R.string.VoipUserCameraIsOff;
                        firstName = UserObject.getFirstName(user);
                        if (firstName == null) {
                            voIPNotificationsLayout.getClass();
                        } else {
                            objEllipsize = TextUtils.ellipsize(firstName, voIPNotificationsLayout.textPaint, AndroidUtilities.dp(f5), TextUtils.TruncateAt.END);
                        }
                        voIPNotificationsLayout.addNotification(i114, LocaleController.formatString("VoipUserCameraIsOff", i115, objEllipsize), "video");
                    } else {
                        this.notificationsLayout.removeNotification("video");
                    }
                } else {
                    if (sharedInstance.getRemoteAudioState() == 0) {
                        voIPNotificationsLayout2 = this.notificationsLayout;
                        int i116 = R.drawable.calls_mute_mini;
                        f5 = 300.0f;
                        int i117 = R.string.VoipUserMicrophoneIsOff;
                        firstName2 = UserObject.getFirstName(user);
                        if (firstName2 == null) {
                            voIPNotificationsLayout2.getClass();
                            charSequenceEllipsize = "";
                        } else {
                            charSequenceEllipsize = TextUtils.ellipsize(firstName2, voIPNotificationsLayout2.textPaint, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
                        }
                        voIPNotificationsLayout2.addNotification(i116, LocaleController.formatString("VoipUserMicrophoneIsOff", i117, charSequenceEllipsize), "muted");
                    } else {
                        z2 = z2;
                        f5 = 300.0f;
                        this.notificationsLayout.removeNotification("muted");
                    }
                    if (sharedInstance.getRemoteVideoState() == 0) {
                        voIPNotificationsLayout = this.notificationsLayout;
                        int i118 = R.drawable.calls_camera_mini;
                        int i119 = R.string.VoipUserCameraIsOff;
                        firstName = UserObject.getFirstName(user);
                        if (firstName == null) {
                            voIPNotificationsLayout.getClass();
                        } else {
                            objEllipsize = TextUtils.ellipsize(firstName, voIPNotificationsLayout.textPaint, AndroidUtilities.dp(f5), TextUtils.TruncateAt.END);
                        }
                        voIPNotificationsLayout.addNotification(i118, LocaleController.formatString("VoipUserCameraIsOff", i119, objEllipsize), "video");
                    } else {
                        this.notificationsLayout.removeNotification("video");
                    }
                }
                if (this.notificationsLayout.getChildCount() != 0) {
                    if (this.notificationsLayout.getChildCount() != 0) {
                        z12 = true;
                        this.tapToVideoTooltip.hide(true);
                    } else {
                        z12 = true;
                    }
                } else if (this.notificationsLayout.getChildCount() != 0) {
                    z12 = true;
                    this.tapToVideoTooltip.hide(true);
                } else {
                    z12 = true;
                }
                if (z17) {
                    voIPNotificationsLayout3 = this.notificationsLayout;
                    if (voIPNotificationsLayout3.wasChanged) {
                        voIPNotificationsLayout3.lockAnimation = z12;
                        AndroidUtilities.runOnUIThread(new Tooltip$$ExternalSyntheticLambda0(voIPNotificationsLayout3, 29), 700L);
                    }
                    voIPNotificationsLayout3.wasChanged = false;
                }
            } else {
                z2 = z2;
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
            if (!this.currentUserIsVideo) {
                z10 = true;
                showFloatingLayout(0, z17);
            } else if (this.callingUserIsVideo) {
                z10 = true;
                showFloatingLayout(1, z17);
            } else {
                z10 = true;
                showFloatingLayout(1, z17);
            }
            if (!z4) {
                if (!z4) {
                    this.callingUserMiniFloatingLayout.setIsActive(false);
                    this.callingUserMiniFloatingLayout.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new AnonymousClass11(this, 5)).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    this.callingUserMiniFloatingLayout.setTag(null);
                }
            } else if (!z4) {
                this.callingUserMiniFloatingLayout.setIsActive(false);
                this.callingUserMiniFloatingLayout.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new AnonymousClass11(this, 5)).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
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
                z11 = true;
            } else {
                z11 = true;
            }
            this.voIpSnowView.setState(z11);
            this.voIpCoverView.setState(z11);
            this.backgroundProvider.setHasVideo(z11);
            if (this.callingUserIsVideo) {
                this.isNearEar = false;
                if (sharedInstance != null) {
                    sharedInstance.playStartRecordSound();
                }
            }
            if (z11) {
                if (this.topShadow.getVisibility() != 4) {
                    this.topShadow.setVisibility(4);
                    this.bottomShadow.setVisibility(4);
                }
            } else if (this.topShadow.getVisibility() != 0) {
                this.topShadow.setVisibility(0);
                this.bottomShadow.setVisibility(0);
            }
            voIPFragment$$ExternalSyntheticLambda2 = this.stopAnimatingBgRunnable;
            AndroidUtilities.cancelRunOnUIThread(voIPFragment$$ExternalSyntheticLambda2);
            if (this.currentState == 3) {
                AndroidUtilities.runOnUIThread(voIPFragment$$ExternalSyntheticLambda2, 10000L);
            }
            if (this.pipSource != null) {
                int i24 = PipSource.sourceIdCounter;
            }
        }
        user = user;
        this.statusTextView.setText(LocaleController.getString(R.string.VoipConnecting), true, z17);
        z = false;
        i9 = 0;
        z16 = false;
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
                if (sharedInstance.getVideoState(false) != 1) {
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
        setLockOnScreen(this.deviceIsLocked);
        if (this.currentState == 3) {
            z5 = false;
        } else {
            z5 = false;
        }
        this.canHideUI = z5;
        if (!z5) {
            showUi(true);
        }
        if (this.uiVisible) {
            AndroidUtilities.runOnUIThread(this.hideUIRunnable, 3000L);
            this.hideUiRunnableWaiting = true;
        }
        i2 = this.currentState;
        if (i2 == 11) {
            z6 = false;
        } else {
            z6 = false;
        }
        if (z16) {
            z7 = false;
        } else {
            z7 = false;
        }
        if (z17) {
            if (z6) {
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
            if (z7) {
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
            ViewPropertyAnimator viewPropertyAnimatorAnimate5 = this.notificationsLayout.animate();
            int i1110 = -AndroidUtilities.dp(16.0f);
            if (this.uiVisible) {
                iDp3 = AndroidUtilities.dp(f6);
            } else {
                iDp3 = 0;
            }
            viewPropertyAnimatorAnimate5.translationY(i1110 - iDp3).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
        } else {
            ImageView imageView9 = this.backIcon;
            if (z6) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView9.setVisibility(i3);
            ImageView imageView10 = this.backIcon;
            if (z6) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            imageView10.setAlpha(f);
            ImageView imageView11 = this.addIcon;
            if (z7) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            imageView11.setVisibility(i4);
            ImageView imageView12 = this.addIcon;
            if (z7) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            imageView12.setAlpha(f2);
            VoIPNotificationsLayout voIPNotificationsLayout8 = this.notificationsLayout;
            int i1111 = -AndroidUtilities.dp(16.0f);
            if (this.uiVisible) {
                iDp2 = AndroidUtilities.dp(80.0f);
            } else {
                iDp2 = 0;
            }
            voIPNotificationsLayout8.setTranslationY(i1111 - iDp2);
        }
        i5 = this.currentState;
        if (i5 != 10) {
            updateButtons$1(z17);
        }
        if (i9 != 0) {
            this.statusTextView.showTimer(z17);
        }
        this.statusTextView.showReconnect(z, z17);
        if (this.callingUserPhotoViewMini.getVisibility() == 0) {
            iDp += AndroidUtilities.dp(24.0f);
            layout = this.emojiRationalTextView.getLayout();
            if (layout != null) {
                iDp = zzkv.m(lineCount, 2, AndroidUtilities.dp(20.0f), iDp);
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
                animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            } else {
                j = 250;
                animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            }
            if (iDp != this.statusLayoutAnimateToOffset) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate6 = animate();
                if (this.currentState != 11) {
                    j = 0;
                }
                viewPropertyAnimatorAnimate6.setStartDelay(j).translationY(iDp).setDuration(200L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            }
        } else {
            setTranslationY(iDp);
        }
        this.statusLayoutAnimateToOffset = iDp;
        if (sharedInstance == null) {
            z8 = false;
        } else {
            z8 = false;
        }
        i6 = this.currentState;
        if (i6 != 11) {
            z9 = false;
        } else {
            z9 = false;
        }
        this.canSwitchToPip = z9;
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
                    VoIPTextureView voIPTextureView4 = this.callingUserTextureView;
                    videoSink = voIPTextureView4.renderer;
                }
            } else if (z4) {
                videoSink = this.callingUserMiniTextureRenderer;
            } else {
                VoIPTextureView voIPTextureView5 = this.callingUserTextureView;
                videoSink = voIPTextureView5.renderer;
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
                    int i1112 = R.drawable.calls_mute_mini;
                    f5 = 300.0f;
                    int i1113 = R.string.VoipUserMicrophoneIsOff;
                    firstName2 = UserObject.getFirstName(user);
                    if (firstName2 == null) {
                        voIPNotificationsLayout2.getClass();
                        charSequenceEllipsize = "";
                    } else {
                        charSequenceEllipsize = TextUtils.ellipsize(firstName2, voIPNotificationsLayout2.textPaint, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
                    }
                    voIPNotificationsLayout2.addNotification(i1112, LocaleController.formatString("VoipUserMicrophoneIsOff", i1113, charSequenceEllipsize), "muted");
                } else {
                    z2 = z2;
                    f5 = 300.0f;
                    this.notificationsLayout.removeNotification("muted");
                }
                if (sharedInstance.getRemoteVideoState() == 0) {
                    voIPNotificationsLayout = this.notificationsLayout;
                    int i1114 = R.drawable.calls_camera_mini;
                    int i1115 = R.string.VoipUserCameraIsOff;
                    firstName = UserObject.getFirstName(user);
                    if (firstName == null) {
                        voIPNotificationsLayout.getClass();
                    } else {
                        objEllipsize = TextUtils.ellipsize(firstName, voIPNotificationsLayout.textPaint, AndroidUtilities.dp(f5), TextUtils.TruncateAt.END);
                    }
                    voIPNotificationsLayout.addNotification(i1114, LocaleController.formatString("VoipUserCameraIsOff", i1115, objEllipsize), "video");
                } else {
                    this.notificationsLayout.removeNotification("video");
                }
            } else {
                if (sharedInstance.getRemoteAudioState() == 0) {
                    voIPNotificationsLayout2 = this.notificationsLayout;
                    int i1116 = R.drawable.calls_mute_mini;
                    f5 = 300.0f;
                    int i1117 = R.string.VoipUserMicrophoneIsOff;
                    firstName2 = UserObject.getFirstName(user);
                    if (firstName2 == null) {
                        voIPNotificationsLayout2.getClass();
                        charSequenceEllipsize = "";
                    } else {
                        charSequenceEllipsize = TextUtils.ellipsize(firstName2, voIPNotificationsLayout2.textPaint, AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END);
                    }
                    voIPNotificationsLayout2.addNotification(i1116, LocaleController.formatString("VoipUserMicrophoneIsOff", i1117, charSequenceEllipsize), "muted");
                } else {
                    z2 = z2;
                    f5 = 300.0f;
                    this.notificationsLayout.removeNotification("muted");
                }
                if (sharedInstance.getRemoteVideoState() == 0) {
                    voIPNotificationsLayout = this.notificationsLayout;
                    int i1118 = R.drawable.calls_camera_mini;
                    int i1119 = R.string.VoipUserCameraIsOff;
                    firstName = UserObject.getFirstName(user);
                    if (firstName == null) {
                        voIPNotificationsLayout.getClass();
                    } else {
                        objEllipsize = TextUtils.ellipsize(firstName, voIPNotificationsLayout.textPaint, AndroidUtilities.dp(f5), TextUtils.TruncateAt.END);
                    }
                    voIPNotificationsLayout.addNotification(i1118, LocaleController.formatString("VoipUserCameraIsOff", i1119, objEllipsize), "video");
                } else {
                    this.notificationsLayout.removeNotification("video");
                }
            }
            if (this.notificationsLayout.getChildCount() != 0) {
                if (this.notificationsLayout.getChildCount() != 0) {
                    z12 = true;
                    this.tapToVideoTooltip.hide(true);
                } else {
                    z12 = true;
                }
            } else if (this.notificationsLayout.getChildCount() != 0) {
                z12 = true;
                this.tapToVideoTooltip.hide(true);
            } else {
                z12 = true;
            }
            if (z17) {
                voIPNotificationsLayout3 = this.notificationsLayout;
                if (voIPNotificationsLayout3.wasChanged) {
                    voIPNotificationsLayout3.lockAnimation = z12;
                    AndroidUtilities.runOnUIThread(new Tooltip$$ExternalSyntheticLambda0(voIPNotificationsLayout3, 29), 700L);
                }
                voIPNotificationsLayout3.wasChanged = false;
            }
        } else {
            z2 = z2;
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
        if (!this.currentUserIsVideo) {
            z10 = true;
            showFloatingLayout(0, z17);
        } else if (this.callingUserIsVideo) {
            z10 = true;
            showFloatingLayout(1, z17);
        } else {
            z10 = true;
            showFloatingLayout(1, z17);
        }
        if (!z4) {
            if (!z4) {
                this.callingUserMiniFloatingLayout.setIsActive(false);
                this.callingUserMiniFloatingLayout.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new AnonymousClass11(this, 5)).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                this.callingUserMiniFloatingLayout.setTag(null);
            }
        } else if (!z4) {
            this.callingUserMiniFloatingLayout.setIsActive(false);
            this.callingUserMiniFloatingLayout.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new AnonymousClass11(this, 5)).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
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
            z11 = true;
        } else {
            z11 = true;
        }
        this.voIpSnowView.setState(z11);
        this.voIpCoverView.setState(z11);
        this.backgroundProvider.setHasVideo(z11);
        if (this.callingUserIsVideo) {
            this.isNearEar = false;
            if (sharedInstance != null) {
                sharedInstance.playStartRecordSound();
            }
        }
        if (z11) {
            if (this.topShadow.getVisibility() != 4) {
                this.topShadow.setVisibility(4);
                this.bottomShadow.setVisibility(4);
            }
        } else if (this.topShadow.getVisibility() != 0) {
            this.topShadow.setVisibility(0);
            this.bottomShadow.setVisibility(0);
        }
        voIPFragment$$ExternalSyntheticLambda2 = this.stopAnimatingBgRunnable;
        AndroidUtilities.cancelRunOnUIThread(voIPFragment$$ExternalSyntheticLambda2);
        if (this.currentState == 3) {
            AndroidUtilities.runOnUIThread(voIPFragment$$ExternalSyntheticLambda2, 10000L);
        }
        if (this.pipSource != null) {
            int i25 = PipSource.sourceIdCounter;
        }
    }
}
