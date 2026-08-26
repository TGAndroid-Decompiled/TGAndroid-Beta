package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.Property;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.view.GestureDetectorCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.pip.PipSource;
import org.telegram.messenger.pip.source.IPipSourceDelegate;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.messenger.pip.utils.Trigger;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AboutLinkCell$$ExternalSyntheticLambda1;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.ChatLoadingCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda9;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.LiveStoryPipOverlay;
import org.telegram.ui.Stories.MuteButton;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.RichEditor;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer$$ExternalSyntheticLambda0;

public final class RTMPStreamPipOverlay implements NotificationCenter.NotificationCenterDelegate, IPipSourceDelegate {
    public static final SimpleFloatPropertyCompat PIP_X_PROPERTY = new SimpleFloatPropertyCompat("pipX", new LivePlayer$$ExternalSyntheticLambda1(21), new LivePlayer$$ExternalSyntheticLambda1(22));
    public static final SimpleFloatPropertyCompat PIP_Y_PROPERTY = new SimpleFloatPropertyCompat("pipY", new LivePlayer$$ExternalSyntheticLambda1(23), new LivePlayer$$ExternalSyntheticLambda1(24));
    public static final RTMPStreamPipOverlay instance = new RTMPStreamPipOverlay();
    public AccountInstance accountInstance;
    public Float aspectRatio;
    public BackupImageView avatarImageView;
    public TLRPC.GroupCallParticipant boundParticipant;
    public boolean boundPresentation;
    public View consumingChild;
    public ChatLoadingCell.AnonymousClass1 contentFrameLayout;
    public LiveStoryPipOverlay.AnonymousClass6 contentView;
    public FrameLayout controlsView;
    public Trigger firstFrameCallback;
    public boolean firstFrameRendered;
    public MuteButton.AnonymousClass1 flickerView;
    public GestureDetectorCompat gestureDetector;
    public boolean isScrollDisallowed;
    public boolean isScrolling;
    public boolean isShowingControls;
    public boolean isVisible;
    public int pipHeight;
    public PipSource pipSource;
    public VoIPTextureView pipTextureView;
    public int pipWidth;
    public float pipX;
    public SpringAnimation pipXSpring;
    public float pipY;
    public SpringAnimation pipYSpring;
    public boolean postedDismissControls;
    public ValueAnimator scaleAnimator;
    public ScaleGestureDetector scaleGestureDetector;
    public VoIPTextureView textureView;
    public WindowManager.LayoutParams windowLayoutParams;
    public WindowManager windowManager;
    public boolean windowViewSkipRender;
    public float maxScaleFactor = 1.4f;
    public final CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable(64, 204, 160);
    public boolean placeholderShown = true;
    public float scaleFactor = 1.0f;
    public final GiftSheet$$ExternalSyntheticLambda9 dismissControlsCallback = new GiftSheet$$ExternalSyntheticLambda9(this, 17);

    public final class AnonymousClass3 implements ScaleGestureDetector.OnScaleGestureListener {
        public AnonymousClass3() {
        }

        @Override
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            RTMPStreamPipOverlay rTMPStreamPipOverlay = RTMPStreamPipOverlay.this;
            rTMPStreamPipOverlay.scaleFactor = MathUtils.clamp(scaleGestureDetector.getScaleFactor() * rTMPStreamPipOverlay.scaleFactor, 0.6f, rTMPStreamPipOverlay.maxScaleFactor);
            rTMPStreamPipOverlay.pipWidth = (int) (rTMPStreamPipOverlay.getSuggestedWidth() * rTMPStreamPipOverlay.scaleFactor);
            rTMPStreamPipOverlay.pipHeight = (int) (rTMPStreamPipOverlay.getSuggestedHeight() * rTMPStreamPipOverlay.scaleFactor);
            AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda9(this, 18));
            SpringAnimation springAnimation = rTMPStreamPipOverlay.pipXSpring;
            springAnimation.mValue = rTMPStreamPipOverlay.pipX;
            springAnimation.mStartValueIsSet = true;
            SpringForce springForce = springAnimation.mSpring;
            float focusX = scaleGestureDetector.getFocusX();
            int i = AndroidUtilities.displaySize.x;
            springForce.mFinalPosition = focusX >= ((float) i) / 2.0f ? (i - rTMPStreamPipOverlay.pipWidth) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
            SpringAnimation springAnimation2 = rTMPStreamPipOverlay.pipXSpring;
            if (!springAnimation2.mRunning) {
                springAnimation2.start();
            }
            SpringAnimation springAnimation3 = rTMPStreamPipOverlay.pipYSpring;
            springAnimation3.mValue = rTMPStreamPipOverlay.pipY;
            springAnimation3.mStartValueIsSet = true;
            springAnimation3.mSpring.mFinalPosition = MathUtils.clamp(scaleGestureDetector.getFocusY() - (rTMPStreamPipOverlay.pipHeight / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - rTMPStreamPipOverlay.pipHeight) - AndroidUtilities.dp(16.0f));
            SpringAnimation springAnimation4 = rTMPStreamPipOverlay.pipYSpring;
            if (!springAnimation4.mRunning) {
                springAnimation4.start();
            }
            return true;
        }

        @Override
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            RTMPStreamPipOverlay rTMPStreamPipOverlay = RTMPStreamPipOverlay.this;
            if (rTMPStreamPipOverlay.isScrolling) {
                rTMPStreamPipOverlay.isScrolling = false;
            }
            rTMPStreamPipOverlay.isScrollDisallowed = true;
            rTMPStreamPipOverlay.windowLayoutParams.width = (int) (rTMPStreamPipOverlay.getSuggestedWidth() * rTMPStreamPipOverlay.maxScaleFactor);
            rTMPStreamPipOverlay.windowLayoutParams.height = (int) (rTMPStreamPipOverlay.getSuggestedHeight() * rTMPStreamPipOverlay.maxScaleFactor);
            AndroidUtilities.updateViewLayout(rTMPStreamPipOverlay.windowManager, rTMPStreamPipOverlay.contentView, rTMPStreamPipOverlay.windowLayoutParams);
            return true;
        }

        @Override
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            RTMPStreamPipOverlay rTMPStreamPipOverlay = RTMPStreamPipOverlay.this;
            if (!rTMPStreamPipOverlay.pipXSpring.mRunning && !rTMPStreamPipOverlay.pipYSpring.mRunning) {
                updateLayout();
                return;
            }
            ArrayList arrayList = new ArrayList();
            LiveStoryPipOverlay.AnonymousClass3.AnonymousClass1 anonymousClass1 = new LiveStoryPipOverlay.AnonymousClass3.AnonymousClass1(this, arrayList, 1);
            SpringAnimation springAnimation = rTMPStreamPipOverlay.pipXSpring;
            if (springAnimation.mRunning) {
                springAnimation.addEndListener(anonymousClass1);
            } else {
                arrayList.add(springAnimation);
            }
            SpringAnimation springAnimation2 = rTMPStreamPipOverlay.pipYSpring;
            if (springAnimation2.mRunning) {
                springAnimation2.addEndListener(anonymousClass1);
            } else {
                arrayList.add(springAnimation2);
            }
        }

        public final void updateLayout() {
            RTMPStreamPipOverlay rTMPStreamPipOverlay = RTMPStreamPipOverlay.this;
            WindowManager.LayoutParams layoutParams = rTMPStreamPipOverlay.windowLayoutParams;
            int suggestedWidth = (int) (rTMPStreamPipOverlay.getSuggestedWidth() * rTMPStreamPipOverlay.scaleFactor);
            layoutParams.width = suggestedWidth;
            rTMPStreamPipOverlay.pipWidth = suggestedWidth;
            WindowManager.LayoutParams layoutParams2 = rTMPStreamPipOverlay.windowLayoutParams;
            int suggestedHeight = (int) (rTMPStreamPipOverlay.getSuggestedHeight() * rTMPStreamPipOverlay.scaleFactor);
            layoutParams2.height = suggestedHeight;
            rTMPStreamPipOverlay.pipHeight = suggestedHeight;
            AndroidUtilities.updateViewLayout(rTMPStreamPipOverlay.windowManager, rTMPStreamPipOverlay.contentView, rTMPStreamPipOverlay.windowLayoutParams);
        }
    }

    public final class AnonymousClass8 implements RendererCommon.RendererEvents {
        public AnonymousClass8() {
        }

        @Override
        public final void onFirstFrameRendered() {
            RTMPStreamPipOverlay rTMPStreamPipOverlay = RTMPStreamPipOverlay.this;
            rTMPStreamPipOverlay.firstFrameRendered = true;
            Trigger trigger = rTMPStreamPipOverlay.firstFrameCallback;
            if (trigger != null) {
                trigger.run();
                rTMPStreamPipOverlay.firstFrameCallback = null;
            }
            AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda9(this, 19));
        }

        @Override
        public final void onFrameResolutionChanged(int i, int i2, int i3) {
            int i4 = (i3 / 90) % 2;
            RTMPStreamPipOverlay rTMPStreamPipOverlay = RTMPStreamPipOverlay.this;
            if (i4 == 0) {
                rTMPStreamPipOverlay.aspectRatio = Float.valueOf(i2 / i);
            } else {
                rTMPStreamPipOverlay.aspectRatio = Float.valueOf(i / i2);
            }
            AndroidUtilities.runOnUIThread(new SurfaceViewRenderer$$ExternalSyntheticLambda0(this, i, i2, 7));
        }
    }

    public final void bindTextureView(boolean z) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        boolean z2 = false;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.isEmpty()) {
            TLRPC.GroupCallParticipant groupCallParticipant3 = VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.get(0).participant;
            if (z || (groupCallParticipant2 = this.boundParticipant) == null || MessageObject.getPeerId(groupCallParticipant2.peer) != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                if (this.boundParticipant != null) {
                    VoIPService.getSharedInstance().removeRemoteSink(this.boundParticipant, this.boundPresentation);
                }
                VoIPTextureView voIPTextureView = this.pipTextureView;
                if (voIPTextureView == null) {
                    voIPTextureView = this.textureView;
                }
                this.boundPresentation = groupCallParticipant3.presentation != null;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(voIPTextureView.renderer, this.boundPresentation, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.boundPresentation, voIPTextureView.renderer, null);
                }
                AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
                MessagesController messagesController = accountInstance.getMessagesController();
                long peerId = MessageObject.getPeerId(groupCallParticipant3.peer);
                if (peerId > 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user, 1);
                    int colorForId = user != null ? AvatarDrawable.getColorForId(user.id) : ColorUtils.blendARGB(0.2f, -16777216, -1);
                    this.avatarImageView.getImageReceiver().setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{ColorUtils.blendARGB(0.2f, colorForId, -16777216), ColorUtils.blendARGB(0.4f, colorForId, -16777216)}), null, user, 0);
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                    ImageLocation forChat = ImageLocation.getForChat(accountInstance.getCurrentAccount(), chat, 1);
                    int colorForId2 = chat != null ? AvatarDrawable.getColorForId(chat.id) : ColorUtils.blendARGB(0.2f, -16777216, -1);
                    this.avatarImageView.getImageReceiver().setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{ColorUtils.blendARGB(0.2f, colorForId2, -16777216), ColorUtils.blendARGB(0.4f, colorForId2, -16777216)}), null, chat, 0);
                }
                this.boundParticipant = groupCallParticipant3;
            }
        } else if (this.boundParticipant != null) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(this.boundParticipant, false);
            }
            this.boundParticipant = null;
        }
        if (!this.firstFrameRendered || (groupCallParticipant = this.boundParticipant) == null || (((tL_groupCallParticipantVideo = groupCallParticipant.video) == null && groupCallParticipant.presentation == null) || ((tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo.paused) || ((tL_groupCallParticipantVideo2 = groupCallParticipant.presentation) != null && tL_groupCallParticipantVideo2.paused)))) {
            z2 = true;
        }
        if (this.placeholderShown != z2) {
            this.flickerView.animate().cancel();
            ViewPropertyAnimator duration = this.flickerView.animate().alpha(z2 ? 1.0f : 0.0f).setDuration(150L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            this.avatarImageView.animate().cancel();
            this.avatarImageView.animate().alpha(z2 ? 1.0f : 0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.textureView.animate().cancel();
            this.textureView.animate().alpha(z2 ? 0.0f : 1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.placeholderShown = z2;
        }
        if (this.pipWidth == getSuggestedWidth() * this.scaleFactor && this.pipHeight == getSuggestedHeight() * this.scaleFactor) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        int suggestedWidth = (int) (getSuggestedWidth() * this.scaleFactor);
        this.pipWidth = suggestedWidth;
        layoutParams.width = suggestedWidth;
        WindowManager.LayoutParams layoutParams2 = this.windowLayoutParams;
        int suggestedHeight = (int) (getSuggestedHeight() * this.scaleFactor);
        this.pipHeight = suggestedHeight;
        layoutParams2.height = suggestedHeight;
        AndroidUtilities.updateViewLayout(this.windowManager, this.contentView, this.windowLayoutParams);
        SpringAnimation springAnimation = this.pipXSpring;
        float f = this.pipX;
        springAnimation.mValue = f;
        springAnimation.mStartValueIsSet = true;
        SpringForce springForce = springAnimation.mSpring;
        float fM = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(getSuggestedWidth(), this.scaleFactor, 2.0f, f);
        float f2 = AndroidUtilities.displaySize.x;
        springForce.mFinalPosition = fM >= f2 / 2.0f ? (f2 - (getSuggestedWidth() * this.scaleFactor)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        this.pipXSpring.start();
        SpringAnimation springAnimation2 = this.pipYSpring;
        float f3 = this.pipY;
        springAnimation2.mValue = f3;
        springAnimation2.mStartValueIsSet = true;
        springAnimation2.mSpring.mFinalPosition = MathUtils.clamp(f3, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (getSuggestedHeight() * this.scaleFactor)) - AndroidUtilities.dp(16.0f));
        this.pipYSpring.start();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didEndCall) {
            instance.dismissInternal$1();
        } else if (i == NotificationCenter.groupCallUpdated) {
            bindTextureView(false);
        }
    }

    public final void dismissInternal$1() {
        if (this.isVisible) {
            this.isVisible = false;
            AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda2(15), 100L);
            this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
            this.accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
            ValueAnimator valueAnimator = this.scaleAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.postedDismissControls) {
                AndroidUtilities.cancelRunOnUIThread(this.dismissControlsCallback);
                this.postedDismissControls = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.contentView, (Property<LiveStoryPipOverlay.AnonymousClass6, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.contentView, (Property<LiveStoryPipOverlay.AnonymousClass6, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.contentView, (Property<LiveStoryPipOverlay.AnonymousClass6, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public final void onAnimationEnd(Animator animator) {
                    RTMPStreamPipOverlay rTMPStreamPipOverlay = RTMPStreamPipOverlay.this;
                    rTMPStreamPipOverlay.windowManager.removeViewImmediate(rTMPStreamPipOverlay.contentView);
                    rTMPStreamPipOverlay.textureView.renderer.release();
                    rTMPStreamPipOverlay.boundParticipant = null;
                    rTMPStreamPipOverlay.placeholderShown = true;
                    rTMPStreamPipOverlay.firstFrameRendered = false;
                    rTMPStreamPipOverlay.consumingChild = null;
                    rTMPStreamPipOverlay.isScrolling = false;
                }
            });
            animatorSet.start();
            PipSource pipSource = this.pipSource;
            if (pipSource != null) {
                pipSource.destroy();
                this.pipSource = null;
            }
        }
    }

    public final float getRatio() {
        float f;
        if (this.aspectRatio == null) {
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.isEmpty()) {
                f = 0.5625f;
            } else {
                float f2 = VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.get(0).aspectRatio;
                if (f2 != 0.0f) {
                    f = 1.0f / f2;
                } else {
                    f = 0.5625f;
                }
            }
            this.aspectRatio = Float.valueOf(f);
            Point point = AndroidUtilities.displaySize;
            this.maxScaleFactor = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / getSuggestedWidth();
        }
        return this.aspectRatio.floatValue();
    }

    public final int getSuggestedHeight() {
        return (int) (getRatio() * getSuggestedWidth());
    }

    public final int getSuggestedWidth() {
        float fMin;
        float f;
        if (getRatio() >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            fMin = Math.min(point.x, point.y);
            f = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            fMin = Math.min(point2.x, point2.y);
            f = 0.6f;
        }
        return (int) (fMin * f);
    }

    @Override
    public final View pipCreatePictureInPictureView() {
        VoIPTextureView voIPTextureView = new VoIPTextureView(this.textureView.getContext(), false, false, false, false);
        this.pipTextureView = voIPTextureView;
        voIPTextureView.renderer.setOpaque(false);
        this.pipTextureView.renderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        VoIPTextureView voIPTextureView2 = this.pipTextureView;
        voIPTextureView2.scaleType = 0;
        voIPTextureView2.renderer.setRotateTextureWithScreen(true);
        this.pipTextureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new RendererCommon.RendererEvents() {
            @Override
            public final void onFirstFrameRendered() {
                RTMPStreamPipOverlay rTMPStreamPipOverlay = RTMPStreamPipOverlay.this;
                Trigger trigger = rTMPStreamPipOverlay.firstFrameCallback;
                if (trigger != null) {
                    trigger.run();
                    rTMPStreamPipOverlay.firstFrameCallback = null;
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
        VoIPTextureView voIPTextureView = this.textureView;
        if (voIPTextureView == null || !voIPTextureView.renderer.isAvailable()) {
            return null;
        }
        return this.textureView.renderer.getBitmap();
    }

    @Override
    public final void pipHidePrimaryWindowView(Runnable runnable) {
        this.firstFrameCallback = (Trigger) runnable;
        VoIPTextureView voIPTextureView = this.textureView;
        if (voIPTextureView != null) {
            voIPTextureView.renderer.clearFirstFrame();
        }
        bindTextureView(true);
        this.windowViewSkipRender = true;
        this.windowManager.removeView(this.contentView);
        this.contentView.invalidate();
    }

    @Override
    public final boolean pipIsAvailable() {
        return true;
    }

    @Override
    public final void pipRenderBackground(Canvas canvas) {
    }

    @Override
    public final void pipRenderForeground(Canvas canvas) {
    }

    @Override
    public final void pipShowPrimaryWindowView(Runnable runnable) {
        this.firstFrameCallback = (Trigger) runnable;
        PipSource pipSource = this.pipSource;
        if (pipSource != null && pipSource.params.isValid()) {
            WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
            int iWidth = ((Rect) this.pipSource.params.tokenCreator).width();
            this.pipWidth = iWidth;
            layoutParams.width = iWidth;
            WindowManager.LayoutParams layoutParams2 = this.windowLayoutParams;
            int iHeight = ((Rect) this.pipSource.params.tokenCreator).height();
            this.pipHeight = iHeight;
            layoutParams2.height = iHeight;
        }
        this.windowViewSkipRender = false;
        this.windowManager.addView(this.contentView, this.windowLayoutParams);
        this.contentView.invalidate();
        VoIPTextureView voIPTextureView = this.pipTextureView;
        if (voIPTextureView != null) {
            voIPTextureView.renderer.release();
            this.pipTextureView = null;
        }
        bindTextureView(true);
    }

    public final void showInternal(Activity activity) {
        int i = 4;
        int i2 = 6;
        int i3 = 1;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || this.isVisible) {
            return;
        }
        this.isVisible = true;
        AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
        this.accountInstance = accountInstance;
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
        this.accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.applyGroupCallVisibleParticipants);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didEndCall);
        this.pipWidth = getSuggestedWidth();
        this.pipHeight = getSuggestedHeight();
        this.scaleFactor = 1.0f;
        this.isShowingControls = false;
        SpringAnimation springAnimation = new SpringAnimation(this, PIP_X_PROPERTY);
        SpringForce springForce = new SpringForce();
        springForce.setDampingRatio(0.75f);
        springForce.setStiffness(650.0f);
        springAnimation.mSpring = springForce;
        this.pipXSpring = springAnimation;
        SpringAnimation springAnimation2 = new SpringAnimation(this, PIP_Y_PROPERTY);
        SpringForce springForce2 = new SpringForce();
        springForce2.setDampingRatio(0.75f);
        springForce2.setStiffness(650.0f);
        springAnimation2.mSpring = springForce2;
        this.pipYSpring = springAnimation2;
        Context context = activity != null ? activity : ApplicationLoader.applicationContext;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new AnonymousClass3());
        this.scaleGestureDetector = scaleGestureDetector;
        int i4 = Build.VERSION.SDK_INT;
        scaleGestureDetector.setQuickScaleEnabled(false);
        if (i4 >= 23) {
            this.scaleGestureDetector.setStylusScaleEnabled(false);
        }
        this.gestureDetector = new GestureDetectorCompat(context, new LiveStoryPipOverlay.AnonymousClass4(this, scaledTouchSlop, i3));
        this.contentFrameLayout = new ChatLoadingCell.AnonymousClass1(this, context);
        LiveStoryPipOverlay.AnonymousClass6 anonymousClass6 = new LiveStoryPipOverlay.AnonymousClass6(this, context, i3);
        this.contentView = anonymousClass6;
        anonymousClass6.addView(this.contentFrameLayout, LayoutHelper.createFrame(-1, -1.0f));
        this.contentFrameLayout.setOutlineProvider(new RichEditor.AnonymousClass5(i2));
        this.contentFrameLayout.setClipToOutline(true);
        this.contentFrameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_actionBar, false));
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        this.contentFrameLayout.addView(backupImageView, LayoutHelper.createFrame(-1, -1.0f));
        VoIPTextureView voIPTextureView = new VoIPTextureView(context, false, false, false, false);
        this.textureView = voIPTextureView;
        voIPTextureView.setAlpha(0.0f);
        this.textureView.renderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        VoIPTextureView voIPTextureView2 = this.textureView;
        voIPTextureView2.scaleType = 0;
        voIPTextureView2.renderer.setRotateTextureWithScreen(true);
        this.textureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new AnonymousClass8());
        this.contentFrameLayout.addView(this.textureView, LayoutHelper.createFrame(-1, -1.0f));
        MuteButton.AnonymousClass1 anonymousClass1 = new MuteButton.AnonymousClass1(this, context, i);
        this.flickerView = anonymousClass1;
        this.contentFrameLayout.addView(anonymousClass1, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.controlsView = frameLayout;
        frameLayout.setAlpha(0.0f);
        View view = new View(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1140850688, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        view.setBackground(gradientDrawable);
        this.controlsView.addView(view, LayoutHelper.createFrame(-1, -1.0f));
        int iDp = AndroidUtilities.dp(8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.pip_video_close);
        int i5 = Theme.key_voipgroup_actionBarItems;
        imageView.setColorFilter(Theme.getColor(null, i5, false));
        int i6 = Theme.key_listSelector;
        imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, i6, false), 1, -1));
        imageView.setPadding(iDp, iDp, iDp, iDp);
        imageView.setOnClickListener(new BotAdView$$ExternalSyntheticLambda0(i2));
        float f = 38;
        float f2 = 4;
        this.controlsView.addView(imageView, LayoutHelper.createFrame(38, f, 5, 0.0f, f2, f2, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.pip_video_expand);
        imageView2.setColorFilter(Theme.getColor(null, i5, false));
        imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, i6, false), 1, -1));
        imageView2.setPadding(iDp, iDp, iDp, iDp);
        imageView2.setOnClickListener(new AboutLinkCell$$ExternalSyntheticLambda1(context, 29));
        this.controlsView.addView(imageView2, LayoutHelper.createFrame(38, f, 5, 0.0f, f2, 48, 0.0f));
        this.contentFrameLayout.addView(this.controlsView, LayoutHelper.createFrame(-1, -1.0f));
        this.windowManager = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams layoutParamsCreateWindowLayoutParams = PipUtils.createWindowLayoutParams(context, false);
        this.windowLayoutParams = layoutParamsCreateWindowLayoutParams;
        int i7 = this.pipWidth;
        layoutParamsCreateWindowLayoutParams.width = i7;
        layoutParamsCreateWindowLayoutParams.height = this.pipHeight;
        float fDp = (AndroidUtilities.displaySize.x - i7) - AndroidUtilities.dp(16.0f);
        this.pipX = fDp;
        layoutParamsCreateWindowLayoutParams.x = (int) fDp;
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        float fDp2 = (AndroidUtilities.displaySize.y - this.pipHeight) - AndroidUtilities.dp(16.0f);
        this.pipY = fDp2;
        layoutParams.y = (int) fDp2;
        WindowManager.LayoutParams layoutParams2 = this.windowLayoutParams;
        layoutParams2.dimAmount = 0.0f;
        layoutParams2.flags = 520;
        this.contentView.setAlpha(0.0f);
        this.contentView.setScaleX(0.1f);
        this.contentView.setScaleY(0.1f);
        AndroidUtilities.setPreferredMaxRefreshRate(this.windowManager, this.contentView, this.windowLayoutParams);
        this.windowManager.addView(this.contentView, this.windowLayoutParams);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.contentView, (Property<LiveStoryPipOverlay.AnonymousClass6, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.contentView, (Property<LiveStoryPipOverlay.AnonymousClass6, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.contentView, (Property<LiveStoryPipOverlay.AnonymousClass6, Float>) View.SCALE_Y, 1.0f));
        animatorSet.addListener(new AnonymousClass1(this, i3));
        animatorSet.start();
        bindTextureView(false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        PipSource pipSource = this.pipSource;
        if (pipSource != null) {
            pipSource.destroy();
            this.pipSource = null;
        }
        if (activity == null || PipUtils.checkPermissions(activity) != 1) {
            return;
        }
        PipSource.Builder builder = new PipSource.Builder(activity, this);
        builder.tagPrefix = "pip-rtmp-video";
        builder.priority = 1;
        builder.cornerRadius = AndroidUtilities.dp(10.0f);
        builder.contentView = this.contentView;
        builder.placeholderView = this.textureView.getPlaceholderView();
        this.pipSource = builder.build();
    }

    public final void toggleControls(boolean z) {
        int i = 0;
        ValueAnimator duration = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f).setDuration(200L);
        this.scaleAnimator = duration;
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.scaleAnimator.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 21));
        this.scaleAnimator.addListener(new AnonymousClass1(this, i));
        this.scaleAnimator.start();
    }

    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final RTMPStreamPipOverlay this$0;

        public AnonymousClass1(RTMPStreamPipOverlay rTMPStreamPipOverlay, int i) {
            this.$r8$classId = i;
            this.this$0 = rTMPStreamPipOverlay;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.scaleAnimator = null;
                    break;
                default:
                    super.onAnimationEnd(animator);
                    break;
            }
        }

        @Override
        public void onAnimationEnd(Animator animator, boolean z) {
            View view;
            switch (this.$r8$classId) {
                case 1:
                    PipSource pipSource = this.this$0.pipSource;
                    if (pipSource != null && (view = pipSource.contentView) != null) {
                        pipSource.updateContentPosition(view);
                        break;
                    }
                    break;
                default:
                    super.onAnimationEnd(animator, z);
                    break;
            }
        }
    }
}
