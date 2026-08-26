package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Build;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda218;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda470;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.MessageEnterTransitionContainer;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TextMessageEnterTransition;

public final class GroupCallPip implements NotificationCenter.NotificationCenterDelegate {
    public static boolean forceRemoved = true;
    public static GroupCallPip instance;
    public final AnonymousClass6 alertContainer;
    public boolean animateToPrepareRemove;
    public boolean animateToShowRemoveTooltip;
    public final AvatarsImageView avatarsImageView;
    public final GroupCallPipButton button;
    public boolean buttonInAlpha;
    public final int currentAccount;
    public final RLottieDrawable deleteIcon;
    public final RLottieImageView iconView;
    public int lastScreenX;
    public int lastScreenY;
    public boolean moving;
    public ValueAnimator pinAnimator;
    public final GroupCallPipAlertView pipAlertView;
    public boolean pressedState;
    public final AnonymousClass5 removeTooltipView;
    public boolean removed;
    public boolean showAlert;
    public AnimatorSet showRemoveAnimator;
    public final AnonymousClass1 updateXlistener;
    public final AnonymousClass1 updateYlistener;
    public WindowManager.LayoutParams windowLayoutParams;
    public int windowLeft;
    public WindowManager windowManager;
    public float windowOffsetLeft;
    public float windowOffsetTop;
    public final FrameLayout windowRemoveTooltipOverlayView;
    public final AnonymousClass4 windowRemoveTooltipView;
    public int windowTop;
    public final AnonymousClass3 windowView;
    public float windowX;
    public float windowY;
    public float prepareToRemoveProgress = 0.0f;
    public final int[] location = new int[2];
    public final float[] point = new float[2];
    public float xRelative = -1.0f;
    public float yRelative = -1.0f;
    public boolean animateToPinnedToCenter = false;
    public float pinnedProgress = 0.0f;

    public final class AnonymousClass10 extends AnimatorListenerAdapter {
        public final int $r8$classId = 0;
        public final Object val$alert;
        public final Object val$windowManager;
        public final FrameLayout val$windowRemoveTooltipOverlayView;
        public final ViewGroup val$windowRemoveTooltipView;
        public final View val$windowView;

        public AnonymousClass10(AnonymousClass3 anonymousClass3, AnonymousClass4 anonymousClass4, FrameLayout frameLayout, WindowManager windowManager, AnonymousClass6 anonymousClass6) {
            this.val$windowView = anonymousClass3;
            this.val$windowRemoveTooltipView = anonymousClass4;
            this.val$windowRemoveTooltipOverlayView = frameLayout;
            this.val$windowManager = windowManager;
            this.val$alert = anonymousClass6;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    AnonymousClass3 anonymousClass3 = (AnonymousClass3) this.val$windowView;
                    if (anonymousClass3.getParent() != null) {
                        anonymousClass3.setVisibility(8);
                        AnonymousClass4 anonymousClass4 = (AnonymousClass4) this.val$windowRemoveTooltipView;
                        anonymousClass4.setVisibility(8);
                        FrameLayout frameLayout = this.val$windowRemoveTooltipOverlayView;
                        frameLayout.setVisibility(8);
                        WindowManager windowManager = (WindowManager) this.val$windowManager;
                        windowManager.removeView(anonymousClass3);
                        windowManager.removeView(anonymousClass4);
                        windowManager.removeView(frameLayout);
                        windowManager.removeView((AnonymousClass6) this.val$alert);
                    }
                    break;
                default:
                    TextMessageEnterTransition textMessageEnterTransition = (TextMessageEnterTransition) this.val$alert;
                    textMessageEnterTransition.notificationsLocker.unlock();
                    MessageEnterTransitionContainer messageEnterTransitionContainer = (MessageEnterTransitionContainer) this.val$windowView;
                    ((ArrayList) messageEnterTransitionContainer.transitions).remove(textMessageEnterTransition);
                    messageEnterTransitionContainer.checkVisibility();
                    ((ViewGroup) messageEnterTransitionContainer.parent).invalidate();
                    ChatMessageCell chatMessageCell = (ChatMessageCell) this.val$windowRemoveTooltipView;
                    chatMessageCell.setEnterTransitionInProgress(false);
                    chatMessageCell.getTransitionParams().lastDrawingBackgroundRect.set(chatMessageCell.getBackgroundDrawableLeft(), chatMessageCell.getBackgroundDrawableTop(), chatMessageCell.getBackgroundDrawableRight(), chatMessageCell.getBackgroundDrawableBottom());
                    ChatActivity.AnonymousClass39 anonymousClass39 = (ChatActivity.AnonymousClass39) this.val$windowRemoveTooltipOverlayView;
                    anonymousClass39.setTextTransitionIsRunning(false);
                    anonymousClass39.getEditField().setAlpha(1.0f);
                    ChatActivity chatActivity = (ChatActivity) this.val$windowManager;
                    ((ChatReplyContainer$Layout[]) chatActivity.replyLayout.this$0)[0].name.setAlpha(1.0f);
                    ((ChatReplyContainer$Layout[]) chatActivity.replyLayout.this$0)[0].obj.setAlpha(1.0f);
                    AnimatedEmojiSpan.release((View) null, textMessageEnterTransition.animatedEmojiStack);
                    break;
            }
        }

        public AnonymousClass10(TextMessageEnterTransition textMessageEnterTransition, MessageEnterTransitionContainer messageEnterTransitionContainer, ChatMessageCell chatMessageCell, ChatActivity.AnonymousClass39 anonymousClass39, ChatActivity chatActivity) {
            this.val$alert = textMessageEnterTransition;
            this.val$windowView = messageEnterTransitionContainer;
            this.val$windowRemoveTooltipView = chatMessageCell;
            this.val$windowRemoveTooltipOverlayView = anonymousClass39;
            this.val$windowManager = chatActivity;
        }
    }

    public final class AnonymousClass3 extends FrameLayout {
        public final ChatActivity$$ExternalSyntheticLambda470 micRunnable;
        public AnimatorSet moveToBoundsAnimator;
        public boolean pressed;
        public final AnonymousClass1 pressedRunnable;
        public float startX;
        public float startY;
        public final float val$touchSlop;

        public AnonymousClass3(Context context, float f) {
            super(context);
            this.val$touchSlop = f;
            this.pressedRunnable = new Runnable() {
                @Override
                public final void run() {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance == null || !sharedInstance.isMicMute()) {
                        return;
                    }
                    TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.get(sharedInstance.getSelfId());
                    if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        AndroidUtilities.runOnUIThread(anonymousClass3.micRunnable, 90L);
                        try {
                            anonymousClass3.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        anonymousClass3.pressed = true;
                    }
                }
            };
            this.micRunnable = new ChatActivity$$ExternalSyntheticLambda470(25);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            Point point = AndroidUtilities.displaySize;
            int i3 = point.x;
            GroupCallPip groupCallPip = GroupCallPip.this;
            if (i3 == groupCallPip.lastScreenX && groupCallPip.lastScreenY == point.y) {
                return;
            }
            groupCallPip.lastScreenX = i3;
            groupCallPip.lastScreenY = point.y;
            if (groupCallPip.xRelative < 0.0f) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
                GroupCallPip.this.xRelative = sharedPreferences.getFloat("relativeX", 1.0f);
                GroupCallPip.this.yRelative = sharedPreferences.getFloat("relativeY", 0.4f);
            }
            GroupCallPip groupCallPip2 = GroupCallPip.instance;
            if (groupCallPip2 != null) {
                GroupCallPip groupCallPip3 = GroupCallPip.this;
                float f = groupCallPip3.xRelative;
                float f2 = groupCallPip3.yRelative;
                float f3 = -AndroidUtilities.dp(36.0f);
                groupCallPip2.windowLayoutParams.x = (int) DiffUtil.m(AndroidUtilities.displaySize.x - (2.0f * f3), AndroidUtilities.dp(105.0f), f, f3);
                groupCallPip2.windowLayoutParams.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f2);
                groupCallPip2.updateAvatarsPosition();
                if (groupCallPip2.windowView.getParent() != null) {
                    groupCallPip2.windowManager.updateViewLayout(groupCallPip2.windowView, groupCallPip2.windowLayoutParams);
                }
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int i = 24;
            if (GroupCallPip.instance != null) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                ViewParent parent = getParent();
                int action = motionEvent.getAction();
                if (action == 0) {
                    getLocationOnScreen(GroupCallPip.this.location);
                    GroupCallPip groupCallPip = GroupCallPip.this;
                    int[] iArr = groupCallPip.location;
                    int i2 = iArr[0];
                    WindowManager.LayoutParams layoutParams = groupCallPip.windowLayoutParams;
                    groupCallPip.windowOffsetLeft = i2 - layoutParams.x;
                    groupCallPip.windowOffsetTop = iArr[1] - layoutParams.y;
                    this.startX = rawX;
                    this.startY = rawY;
                    System.currentTimeMillis();
                    AndroidUtilities.runOnUIThread(this.pressedRunnable, 300L);
                    GroupCallPip groupCallPip2 = GroupCallPip.this;
                    WindowManager.LayoutParams layoutParams2 = groupCallPip2.windowLayoutParams;
                    groupCallPip2.windowX = layoutParams2.x;
                    groupCallPip2.windowY = layoutParams2.y;
                    groupCallPip2.pressedState = true;
                    groupCallPip2.checkButtonAlpha();
                    return true;
                }
                if (action != 1) {
                    if (action == 2) {
                        float f = rawX - this.startX;
                        float f2 = rawY - this.startY;
                        if (!GroupCallPip.this.moving) {
                            float f3 = (f2 * f2) + (f * f);
                            float f4 = this.val$touchSlop;
                            if (f3 > f4 * f4) {
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                AndroidUtilities.cancelRunOnUIThread(this.pressedRunnable);
                                GroupCallPip groupCallPip3 = GroupCallPip.this;
                                groupCallPip3.moving = true;
                                groupCallPip3.showRemoveTooltip(true);
                                GroupCallPip.this.showAlert(false);
                                this.startX = rawX;
                                this.startY = rawY;
                                f = 0.0f;
                                f2 = 0.0f;
                            }
                        }
                        GroupCallPip groupCallPip4 = GroupCallPip.this;
                        if (!groupCallPip4.moving) {
                            return true;
                        }
                        groupCallPip4.windowX += f;
                        groupCallPip4.windowY += f2;
                        this.startX = rawX;
                        this.startY = rawY;
                        groupCallPip4.updateButtonPosition();
                        float measuredWidth = (getMeasuredWidth() / 2.0f) + GroupCallPip.this.windowX;
                        float measuredHeight = (getMeasuredHeight() / 2.0f) + GroupCallPip.this.windowY;
                        GroupCallPip groupCallPip5 = GroupCallPip.this;
                        float measuredWidth2 = (groupCallPip5.windowRemoveTooltipView.getMeasuredWidth() / 2.0f) + (groupCallPip5.windowLeft - groupCallPip5.windowOffsetLeft);
                        GroupCallPip groupCallPip6 = GroupCallPip.this;
                        float measuredHeight2 = (groupCallPip6.windowRemoveTooltipView.getMeasuredHeight() / 2.0f) + (groupCallPip6.windowTop - groupCallPip6.windowOffsetTop);
                        float f5 = measuredWidth - measuredWidth2;
                        float f6 = measuredHeight - measuredHeight2;
                        float f7 = (f6 * f6) + (f5 * f5);
                        if (f7 < AndroidUtilities.dp(80.0f) * AndroidUtilities.dp(80.0f)) {
                            GroupCallPip.this.button.setRemoveAngle((((measuredWidth <= measuredWidth2 || measuredHeight >= measuredHeight2) && (measuredWidth >= measuredWidth2 || measuredHeight >= measuredHeight2)) ? 90.0d : 270.0d) - Math.toDegrees(Math.atan(f5 / f6)));
                            z = f7 < ((float) (AndroidUtilities.dp(50.0f) * AndroidUtilities.dp(50.0f)));
                            z2 = true;
                        } else {
                            z = false;
                            z2 = false;
                        }
                        GroupCallPip groupCallPip7 = GroupCallPip.this;
                        if (!groupCallPip7.removed && groupCallPip7.animateToPinnedToCenter != z) {
                            groupCallPip7.animateToPinnedToCenter = z;
                            ValueAnimator valueAnimator = groupCallPip7.pinAnimator;
                            if (valueAnimator != null) {
                                valueAnimator.removeAllListeners();
                                groupCallPip7.pinAnimator.cancel();
                            }
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(groupCallPip7.pinnedProgress, z ? 1.0f : 0.0f);
                            groupCallPip7.pinAnimator = valueAnimatorOfFloat;
                            valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(groupCallPip7, 13));
                            groupCallPip7.pinAnimator.addListener(new ChatActivity.AnonymousClass77(i, groupCallPip7, z));
                            groupCallPip7.pinAnimator.setDuration(250L);
                            groupCallPip7.pinAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                            groupCallPip7.pinAnimator.start();
                        }
                        GroupCallPip groupCallPip8 = GroupCallPip.this;
                        if (groupCallPip8.animateToPrepareRemove != z2) {
                            groupCallPip8.animateToPrepareRemove = z2;
                            groupCallPip8.removeTooltipView.invalidate();
                            if (!groupCallPip8.removed) {
                                groupCallPip8.deleteIcon.setCustomEndFrame(z2 ? 33 : 0);
                                groupCallPip8.iconView.playAnimation();
                            }
                            if (z2) {
                                try {
                                    groupCallPip8.button.performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        GroupCallPipButton groupCallPipButton = groupCallPip8.button;
                        if (groupCallPipButton.prepareToRemove != z2) {
                            groupCallPipButton.invalidate();
                        }
                        groupCallPipButton.prepareToRemove = z2;
                        return true;
                    }
                    if (action != 3) {
                        return true;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(this.micRunnable);
                AndroidUtilities.cancelRunOnUIThread(this.pressedRunnable);
                GroupCallPip groupCallPip9 = GroupCallPip.this;
                if (!groupCallPip9.animateToPrepareRemove) {
                    boolean z3 = false;
                    groupCallPip9.pressedState = false;
                    groupCallPip9.checkButtonAlpha();
                    if (this.pressed) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(true, false, false);
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused2) {
                            }
                        }
                        this.pressed = false;
                    } else if (motionEvent.getAction() != 1 || GroupCallPip.this.moving) {
                        z3 = false;
                    } else if (VoIPService.getSharedInstance() != null) {
                        GroupCallPip groupCallPip10 = GroupCallPip.this;
                        groupCallPip10.showAlert(!groupCallPip10.showAlert);
                        return false;
                    }
                    if (parent != null && GroupCallPip.this.moving) {
                        parent.requestDisallowInterceptTouchEvent(z3);
                        Point point = AndroidUtilities.displaySize;
                        int i3 = point.x;
                        int i4 = point.y;
                        float f8 = GroupCallPip.this.windowLayoutParams.x;
                        float measuredWidth3 = getMeasuredWidth() + f8;
                        float measuredHeight3 = GroupCallPip.this.windowLayoutParams.y;
                        float measuredHeight4 = getMeasuredHeight() + measuredHeight3;
                        this.moveToBoundsAnimator = new AnimatorSet();
                        float f9 = -AndroidUtilities.dp(36.0f);
                        if (f8 < f9) {
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(GroupCallPip.this.windowLayoutParams.x, f9);
                            valueAnimatorOfFloat2.addUpdateListener(GroupCallPip.this.updateXlistener);
                            this.moveToBoundsAnimator.playTogether(valueAnimatorOfFloat2);
                            f8 = f9;
                        } else if (measuredWidth3 > i3 - f9) {
                            float f10 = GroupCallPip.this.windowLayoutParams.x;
                            float measuredWidth4 = (i3 - getMeasuredWidth()) - f9;
                            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f10, measuredWidth4);
                            valueAnimatorOfFloat3.addUpdateListener(GroupCallPip.this.updateXlistener);
                            this.moveToBoundsAnimator.playTogether(valueAnimatorOfFloat3);
                            f8 = measuredWidth4;
                        }
                        int iDp = AndroidUtilities.dp(36.0f) + i4;
                        if (measuredHeight3 < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                            float f11 = GroupCallPip.this.windowLayoutParams.y;
                            measuredHeight3 = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(f11, measuredHeight3);
                            valueAnimatorOfFloat4.addUpdateListener(GroupCallPip.this.updateYlistener);
                            this.moveToBoundsAnimator.playTogether(valueAnimatorOfFloat4);
                        } else if (measuredHeight4 > iDp) {
                            float f12 = GroupCallPip.this.windowLayoutParams.y;
                            measuredHeight3 = iDp - getMeasuredHeight();
                            ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(f12, measuredHeight3);
                            valueAnimatorOfFloat5.addUpdateListener(GroupCallPip.this.updateYlistener);
                            this.moveToBoundsAnimator.playTogether(valueAnimatorOfFloat5);
                        }
                        this.moveToBoundsAnimator.setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT);
                        this.moveToBoundsAnimator.start();
                        GroupCallPip groupCallPip11 = GroupCallPip.this;
                        if (groupCallPip11.xRelative >= 0.0f) {
                            float[] fArr = groupCallPip11.point;
                            Point point2 = AndroidUtilities.displaySize;
                            float f13 = point2.x;
                            float f14 = point2.y;
                            float f15 = -AndroidUtilities.dp(36.0f);
                            fArr[0] = (f8 - f15) / ((f13 - (f15 * 2.0f)) - AndroidUtilities.dp(105.0f));
                            fArr[1] = measuredHeight3 / (f14 - AndroidUtilities.dp(105.0f));
                            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                            SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                            GroupCallPip groupCallPip12 = GroupCallPip.this;
                            float f16 = groupCallPip12.point[0];
                            groupCallPip12.xRelative = f16;
                            SharedPreferences.Editor editorPutFloat = editorEdit.putFloat("relativeX", f16);
                            GroupCallPip groupCallPip13 = GroupCallPip.this;
                            float f17 = groupCallPip13.point[1];
                            groupCallPip13.yRelative = f17;
                            editorPutFloat.putFloat("relativeY", f17).apply();
                        }
                    }
                    GroupCallPip groupCallPip14 = GroupCallPip.this;
                    groupCallPip14.moving = false;
                    groupCallPip14.showRemoveTooltip(false);
                    return true;
                }
                if (this.pressed && VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                }
                this.pressed = false;
                final GroupCallPip groupCallPip15 = GroupCallPip.this;
                GroupCallPip groupCallPip16 = GroupCallPip.instance;
                if (groupCallPip16 == null) {
                    groupCallPip15.getClass();
                    return false;
                }
                groupCallPip15.removed = true;
                GroupCallPip.forceRemoved = true;
                groupCallPip15.button.removed = true;
                groupCallPip16.showAlert(false);
                float f18 = groupCallPip15.windowLayoutParams.x;
                AnonymousClass3 anonymousClass3 = groupCallPip15.windowView;
                float measuredWidth5 = (anonymousClass3.getMeasuredWidth() / 2.0f) + f18;
                float measuredHeight5 = (anonymousClass3.getMeasuredHeight() / 2.0f) + groupCallPip15.windowLayoutParams.y;
                float f19 = groupCallPip15.windowLeft - groupCallPip15.windowOffsetLeft;
                AnonymousClass4 anonymousClass4 = groupCallPip15.windowRemoveTooltipView;
                float measuredWidth6 = ((anonymousClass4.getMeasuredWidth() / 2.0f) + f19) - measuredWidth5;
                float measuredHeight6 = ((anonymousClass4.getMeasuredHeight() / 2.0f) + (groupCallPip15.windowTop - groupCallPip15.windowOffsetTop)) - measuredHeight5;
                GroupCallPip groupCallPip17 = GroupCallPip.instance;
                final WindowManager windowManager = groupCallPip17.windowManager;
                final FrameLayout frameLayout = groupCallPip17.windowRemoveTooltipOverlayView;
                NotificationCenter.getInstance(groupCallPip15.currentAccount).removeObserver(groupCallPip15, NotificationCenter.groupCallUpdated);
                NotificationCenter.getGlobalInstance().removeObserver(groupCallPip15, NotificationCenter.webRtcSpeakerAmplitudeEvent);
                NotificationCenter.getGlobalInstance().removeObserver(groupCallPip15, NotificationCenter.groupCallVisibilityChanged);
                NotificationCenter.getGlobalInstance().removeObserver(groupCallPip15, NotificationCenter.didEndCall);
                GroupCallPip.instance = null;
                AnimatorSet animatorSet = new AnimatorSet();
                RLottieDrawable rLottieDrawable = groupCallPip15.deleteIcon;
                int i5 = rLottieDrawable.currentFrame;
                long duration = i5 < 33 ? (long) (((1.0f - (i5 / 33.0f)) * rLottieDrawable.getDuration()) / 2.0f) : 0L;
                float f20 = groupCallPip15.windowLayoutParams.x;
                ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(f20, measuredWidth6 + f20);
                valueAnimatorOfFloat6.addUpdateListener(groupCallPip15.updateXlistener);
                ValueAnimator duration2 = valueAnimatorOfFloat6.setDuration(250L);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                duration2.setInterpolator(cubicBezierInterpolator);
                animatorSet.playTogether(valueAnimatorOfFloat6);
                float f21 = groupCallPip15.windowLayoutParams.y;
                ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(f21, (f21 + measuredHeight6) - AndroidUtilities.dp(30.0f), groupCallPip15.windowLayoutParams.y + measuredHeight6);
                valueAnimatorOfFloat7.addUpdateListener(groupCallPip15.updateYlistener);
                valueAnimatorOfFloat7.setDuration(250L).setInterpolator(cubicBezierInterpolator);
                animatorSet.playTogether(valueAnimatorOfFloat7);
                final AnonymousClass3 anonymousClass5 = groupCallPip17.windowView;
                float[] fArr2 = {anonymousClass5.getScaleX(), 0.1f};
                Property property = View.SCALE_X;
                animatorSet.playTogether(ObjectAnimator.ofFloat(anonymousClass5, (Property<AnonymousClass3, Float>) property, fArr2).setDuration(180L));
                float[] fArr3 = {anonymousClass5.getScaleY(), 0.1f};
                Property property2 = View.SCALE_Y;
                animatorSet.playTogether(ObjectAnimator.ofFloat(anonymousClass5, (Property<AnonymousClass3, Float>) property2, fArr3).setDuration(180L));
                Property property3 = View.ALPHA;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(anonymousClass5, (Property<AnonymousClass3, Float>) property3, 1.0f, 0.0f);
                float f22 = 350L;
                objectAnimatorOfFloat.setStartDelay((long) (f22 * 0.7f));
                objectAnimatorOfFloat.setDuration((long) (f22 * 0.3f));
                animatorSet.playTogether(objectAnimatorOfFloat);
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda470(24), 370L);
                long j = duration + 530;
                AnonymousClass5 anonymousClass6 = groupCallPip15.removeTooltipView;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(anonymousClass6, (Property<AnonymousClass5, Float>) property, 1.0f, 1.05f);
                objectAnimatorOfFloat2.setDuration(j);
                CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_BOTH;
                objectAnimatorOfFloat2.setInterpolator(cubicBezierInterpolator2);
                animatorSet.playTogether(objectAnimatorOfFloat2);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(anonymousClass6, (Property<AnonymousClass5, Float>) property2, 1.0f, 1.05f);
                objectAnimatorOfFloat3.setDuration(j);
                objectAnimatorOfFloat3.setInterpolator(cubicBezierInterpolator2);
                animatorSet.playTogether(objectAnimatorOfFloat3);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(anonymousClass6, (Property<AnonymousClass5, Float>) property, 1.0f, 0.3f);
                objectAnimatorOfFloat4.setStartDelay(j);
                objectAnimatorOfFloat4.setDuration(350L);
                CubicBezierInterpolator cubicBezierInterpolator3 = CubicBezierInterpolator.EASE_OUT_QUINT;
                objectAnimatorOfFloat4.setInterpolator(cubicBezierInterpolator3);
                animatorSet.playTogether(objectAnimatorOfFloat4);
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(anonymousClass6, (Property<AnonymousClass5, Float>) property2, 1.0f, 0.3f);
                objectAnimatorOfFloat5.setStartDelay(j);
                objectAnimatorOfFloat5.setDuration(350L);
                objectAnimatorOfFloat5.setInterpolator(cubicBezierInterpolator3);
                animatorSet.playTogether(objectAnimatorOfFloat5);
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(anonymousClass6, (Property<AnonymousClass5, Float>) View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
                objectAnimatorOfFloat6.setStartDelay(j);
                objectAnimatorOfFloat6.setDuration(350L);
                objectAnimatorOfFloat6.setInterpolator(cubicBezierInterpolator3);
                animatorSet.playTogether(objectAnimatorOfFloat6);
                ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(anonymousClass6, (Property<AnonymousClass5, Float>) property3, 1.0f, 0.0f);
                objectAnimatorOfFloat7.setStartDelay(j);
                objectAnimatorOfFloat7.setDuration(350L);
                objectAnimatorOfFloat7.setInterpolator(cubicBezierInterpolator3);
                animatorSet.playTogether(objectAnimatorOfFloat7);
                final AnonymousClass4 anonymousClass7 = groupCallPip17.windowRemoveTooltipView;
                final AnonymousClass6 anonymousClass8 = groupCallPip17.alertContainer;
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        NotificationCenter.getInstance(GroupCallPip.this.currentAccount).doOnIdle(new ChatActivity$$ExternalSyntheticLambda218(anonymousClass5, anonymousClass7, windowManager, frameLayout, anonymousClass8, 15));
                    }
                });
                animatorSet.start();
                rLottieDrawable.setCustomEndFrame(66);
                RLottieImageView rLottieImageView = groupCallPip15.iconView;
                rLottieImageView.stopAnimation();
                rLottieImageView.playAnimation();
                return false;
            }
            return false;
        }
    }

    public final class AnonymousClass4 extends FrameLayout {
        public AnonymousClass4(Context context) {
            super(context);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            GroupCallPip groupCallPip = GroupCallPip.this;
            groupCallPip.windowRemoveTooltipView.getLocationOnScreen(groupCallPip.location);
            int[] iArr = groupCallPip.location;
            groupCallPip.windowLeft = iArr[0];
            groupCallPip.windowTop = iArr[1] - AndroidUtilities.dp(25.0f);
        }

        @Override
        public final void setVisibility(int i) {
            super.setVisibility(i);
            GroupCallPip.this.windowRemoveTooltipOverlayView.setVisibility(i);
        }
    }

    public final class AnonymousClass5 extends View {
        public final Paint paint;

        public AnonymousClass5(Context context) {
            super(context);
            this.paint = new Paint(1);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float f;
            float f2;
            GroupCallPip groupCallPip = GroupCallPip.this;
            boolean z = groupCallPip.animateToPrepareRemove;
            if (z) {
                float f3 = groupCallPip.prepareToRemoveProgress;
                if (f3 != 1.0f) {
                    float f4 = f3 + 0.064f;
                    groupCallPip.prepareToRemoveProgress = f4;
                    if (f4 > 1.0f) {
                        groupCallPip.prepareToRemoveProgress = 1.0f;
                    }
                    invalidate();
                } else if (!z) {
                    f = groupCallPip.prepareToRemoveProgress;
                    if (f != 0.0f) {
                        f2 = f - 0.064f;
                        groupCallPip.prepareToRemoveProgress = f2;
                        if (f2 < 0.0f) {
                            groupCallPip.prepareToRemoveProgress = 0.0f;
                        }
                        invalidate();
                    }
                }
            } else if (!z) {
                f = groupCallPip.prepareToRemoveProgress;
                if (f != 0.0f) {
                    f2 = f - 0.064f;
                    groupCallPip.prepareToRemoveProgress = f2;
                    if (f2 < 0.0f) {
                        groupCallPip.prepareToRemoveProgress = 0.0f;
                    }
                    invalidate();
                }
            }
            Paint paint = this.paint;
            paint.setColor(ColorUtils.blendARGB(groupCallPip.prepareToRemoveProgress, 1711607061, 1714752530));
            canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), (AndroidUtilities.dp(5.0f) * groupCallPip.prepareToRemoveProgress) + AndroidUtilities.dp(35.0f), paint);
        }

        @Override
        public final void setAlpha(float f) {
            super.setAlpha(f);
            GroupCallPip.this.windowRemoveTooltipOverlayView.setAlpha(f);
        }

        @Override
        public final void setScaleX(float f) {
            super.setScaleX(f);
            GroupCallPip.this.windowRemoveTooltipOverlayView.setScaleX(f);
        }

        @Override
        public final void setScaleY(float f) {
            super.setScaleY(f);
            GroupCallPip.this.windowRemoveTooltipOverlayView.setScaleY(f);
        }

        @Override
        public final void setTranslationY(float f) {
            super.setTranslationY(f);
            GroupCallPip.this.windowRemoveTooltipOverlayView.setTranslationY(f);
        }
    }

    public final class AnonymousClass6 extends FrameLayout {
        public int lastSize;

        public AnonymousClass6(Context context) {
            super(context);
            this.lastSize = -1;
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            Point point = AndroidUtilities.displaySize;
            int i5 = point.x + point.y;
            int i6 = this.lastSize;
            if (i6 > 0 && i6 != i5) {
                setVisibility(8);
                GroupCallPip groupCallPip = GroupCallPip.this;
                groupCallPip.showAlert = false;
                groupCallPip.checkButtonAlpha();
            }
            this.lastSize = i5;
        }

        @Override
        public final void setVisibility(int i) {
            super.setVisibility(i);
            if (i == 8) {
                this.lastSize = -1;
            }
        }
    }

    public final class AnonymousClass8 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final GroupCallPip this$0;

        public AnonymousClass8(GroupCallPip groupCallPip, int i) {
            this.$r8$classId = i;
            this.this$0 = groupCallPip;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.alertContainer.setVisibility(8);
                    break;
                default:
                    GroupCallPip groupCallPip = this.this$0;
                    groupCallPip.windowRemoveTooltipView.setVisibility(8);
                    groupCallPip.animateToPrepareRemove = false;
                    groupCallPip.prepareToRemoveProgress = 0.0f;
                    break;
            }
        }
    }

    public GroupCallPip(Context context, int i) {
        final int i2 = 0;
        this.updateXlistener = new ValueAnimator.AnimatorUpdateListener(this) {
            public final GroupCallPip this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        GroupCallPip groupCallPip = this.this$0;
                        groupCallPip.windowLayoutParams.x = (int) fFloatValue;
                        groupCallPip.updateAvatarsPosition();
                        if (groupCallPip.windowView.getParent() != null) {
                            groupCallPip.windowManager.updateViewLayout(groupCallPip.windowView, groupCallPip.windowLayoutParams);
                        }
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        GroupCallPip groupCallPip2 = this.this$0;
                        groupCallPip2.windowLayoutParams.y = (int) fFloatValue2;
                        if (groupCallPip2.windowView.getParent() != null) {
                            groupCallPip2.windowManager.updateViewLayout(groupCallPip2.windowView, groupCallPip2.windowLayoutParams);
                        }
                        break;
                }
            }
        };
        final int i3 = 1;
        this.updateYlistener = new ValueAnimator.AnimatorUpdateListener(this) {
            public final GroupCallPip this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        GroupCallPip groupCallPip = this.this$0;
                        groupCallPip.windowLayoutParams.x = (int) fFloatValue;
                        groupCallPip.updateAvatarsPosition();
                        if (groupCallPip.windowView.getParent() != null) {
                            groupCallPip.windowManager.updateViewLayout(groupCallPip.windowView, groupCallPip.windowLayoutParams);
                        }
                        break;
                    default:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        GroupCallPip groupCallPip2 = this.this$0;
                        groupCallPip2.windowLayoutParams.y = (int) fFloatValue2;
                        if (groupCallPip2.windowView.getParent() != null) {
                            groupCallPip2.windowManager.updateViewLayout(groupCallPip2.windowView, groupCallPip2.windowLayoutParams);
                        }
                        break;
                }
            }
        };
        this.currentAccount = i;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.windowView = anonymousClass3;
        anonymousClass3.setAlpha(0.7f);
        GroupCallPipButton groupCallPipButton = new GroupCallPipButton(i, context, false);
        this.button = groupCallPipButton;
        anonymousClass3.addView(groupCallPipButton, LayoutHelper.createFrame(-1, -1, 17));
        AvatarsImageView avatarsImageView = new AvatarsImageView(context, true);
        this.avatarsImageView = avatarsImageView;
        avatarsImageView.setStyle(5);
        avatarsImageView.setCentered(true);
        avatarsImageView.setVisibility(8);
        avatarsImageView.setDelegate(new HintView$1$$ExternalSyntheticLambda0(this, 12));
        updateAvatars$1(false);
        anonymousClass3.addView(avatarsImageView, LayoutHelper.createFrame(108, 36, 49));
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(context);
        this.windowRemoveTooltipView = anonymousClass4;
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(context);
        this.removeTooltipView = anonymousClass5;
        anonymousClass4.addView(anonymousClass5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.windowRemoveTooltipOverlayView = frameLayout;
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.iconView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        int i4 = R.raw.group_pip_delete_icon;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i4, SurfaceContainer$$ExternalSyntheticOutline0.m(i4, ""), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.deleteIcon = rLottieDrawable;
        rLottieDrawable.playInDirectionOfCustomEndFrame = true;
        rLottieImageView.setAnimation(rLottieDrawable);
        rLottieImageView.setColorFilter(-1);
        frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(context);
        this.alertContainer = anonymousClass6;
        anonymousClass6.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, 24));
        anonymousClass6.setClipChildren(false);
        GroupCallPipAlertView groupCallPipAlertView = new GroupCallPipAlertView(context, i);
        this.pipAlertView = groupCallPipAlertView;
        anonymousClass6.addView(groupCallPipAlertView, LayoutHelper.createFrame(-2.0f, -2));
    }

    public static WindowManager.LayoutParams createWindowLayoutParams(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = AndroidUtilities.dp(105.0f);
        layoutParams.width = AndroidUtilities.dp(105.0f);
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (!AndroidUtilities.checkInlinePermissions(context)) {
            layoutParams.type = 99;
        } else if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2003;
        }
        layoutParams.flags = 520;
        return layoutParams;
    }

    public static boolean isShowing() {
        VoIPService sharedInstance;
        if (RTMPStreamPipOverlay.instance.isVisible || instance != null) {
            return true;
        }
        if ((Build.VERSION.SDK_INT >= 23 && !ApplicationLoader.canDrawOverlays) || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp() || forceRemoved) {
            return false;
        }
        return ApplicationLoader.mainInterfaceStopped || !GroupCallActivity.groupCallUiVisible;
    }

    public static void updateVisibility(Context context) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z = (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) ? false : true;
        if (!AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) || !z || forceRemoved || (!ApplicationLoader.mainInterfaceStopped && GroupCallActivity.groupCallUiVisible)) {
            GroupCallPip groupCallPip = instance;
            if (groupCallPip != null) {
                groupCallPip.showAlert(false);
                GroupCallPip groupCallPip2 = instance;
                WindowManager windowManager = groupCallPip2.windowManager;
                AnonymousClass3 anonymousClass3 = groupCallPip2.windowView;
                anonymousClass3.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new AnonymousClass10(anonymousClass3, groupCallPip2.windowRemoveTooltipView, groupCallPip2.windowRemoveTooltipOverlayView, windowManager, groupCallPip2.alertContainer)).start();
                GroupCallPip groupCallPip3 = instance;
                NotificationCenter.getInstance(groupCallPip3.currentAccount).removeObserver(groupCallPip3, NotificationCenter.groupCallUpdated);
                NotificationCenter.getGlobalInstance().removeObserver(groupCallPip3, NotificationCenter.webRtcSpeakerAmplitudeEvent);
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i = NotificationCenter.groupCallVisibilityChanged;
                globalInstance.removeObserver(groupCallPip3, i);
                NotificationCenter.getGlobalInstance().removeObserver(groupCallPip3, NotificationCenter.didEndCall);
                instance = null;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i, new Object[0]);
                return;
            }
            return;
        }
        int account = sharedInstance.getAccount();
        if (instance == null) {
            instance = new GroupCallPip(context, account);
            WindowManager windowManager2 = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
            instance.windowManager = windowManager2;
            WindowManager.LayoutParams layoutParamsCreateWindowLayoutParams = createWindowLayoutParams(context);
            layoutParamsCreateWindowLayoutParams.width = -1;
            layoutParamsCreateWindowLayoutParams.height = -1;
            layoutParamsCreateWindowLayoutParams.dimAmount = 0.25f;
            layoutParamsCreateWindowLayoutParams.flags = 522;
            windowManager2.addView(instance.alertContainer, layoutParamsCreateWindowLayoutParams);
            instance.alertContainer.setVisibility(8);
            WindowManager.LayoutParams layoutParamsCreateWindowLayoutParams2 = createWindowLayoutParams(context);
            layoutParamsCreateWindowLayoutParams2.gravity = 81;
            layoutParamsCreateWindowLayoutParams2.width = AndroidUtilities.dp(100.0f);
            layoutParamsCreateWindowLayoutParams2.height = AndroidUtilities.dp(150.0f);
            windowManager2.addView(instance.windowRemoveTooltipView, layoutParamsCreateWindowLayoutParams2);
            WindowManager.LayoutParams layoutParamsCreateWindowLayoutParams3 = createWindowLayoutParams(context);
            GroupCallPip groupCallPip4 = instance;
            groupCallPip4.windowLayoutParams = layoutParamsCreateWindowLayoutParams3;
            windowManager2.addView(groupCallPip4.windowView, layoutParamsCreateWindowLayoutParams3);
            WindowManager.LayoutParams layoutParamsCreateWindowLayoutParams4 = createWindowLayoutParams(context);
            layoutParamsCreateWindowLayoutParams4.gravity = 81;
            layoutParamsCreateWindowLayoutParams4.width = AndroidUtilities.dp(100.0f);
            layoutParamsCreateWindowLayoutParams4.height = AndroidUtilities.dp(150.0f);
            windowManager2.addView(instance.windowRemoveTooltipOverlayView, layoutParamsCreateWindowLayoutParams4);
            instance.windowRemoveTooltipView.setVisibility(8);
            instance.windowView.setScaleX(0.5f);
            instance.windowView.setScaleY(0.5f);
            instance.windowView.setAlpha(0.0f);
            instance.windowView.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
            NotificationCenter.getInstance(instance.currentAccount).addObserver(instance, NotificationCenter.groupCallUpdated);
            NotificationCenter.getGlobalInstance().addObserver(instance, NotificationCenter.webRtcSpeakerAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(instance, NotificationCenter.didEndCall);
        }
        GroupCallPip groupCallPip5 = instance;
        if (groupCallPip5.avatarsImageView.getTag() != null) {
            return;
        }
        groupCallPip5.avatarsImageView.animate().setListener(null).cancel();
        if (groupCallPip5.avatarsImageView.getVisibility() != 0) {
            groupCallPip5.avatarsImageView.setVisibility(0);
            groupCallPip5.avatarsImageView.setAlpha(0.0f);
            groupCallPip5.avatarsImageView.setScaleX(0.5f);
            groupCallPip5.avatarsImageView.setScaleY(0.5f);
        }
        groupCallPip5.avatarsImageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        groupCallPip5.avatarsImageView.setTag(1);
    }

    public final void checkButtonAlpha() {
        boolean z = this.pressedState || this.showAlert;
        if (this.buttonInAlpha != z) {
            this.buttonInAlpha = z;
            AnonymousClass3 anonymousClass3 = this.windowView;
            if (z) {
                anonymousClass3.animate().alpha(1.0f).start();
            } else {
                anonymousClass3.animate().alpha(0.7f).start();
            }
            this.button.setPressedState(z);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.groupCallUpdated || i == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            updateAvatars$1(true);
        } else if (i == NotificationCenter.didEndCall) {
            updateVisibility(ApplicationLoader.applicationContext);
        }
    }

    public final void showAlert(boolean z) {
        if (z != this.showAlert) {
            this.showAlert = z;
            AnonymousClass6 anonymousClass6 = this.alertContainer;
            anonymousClass6.animate().setListener(null).cancel();
            boolean z2 = this.showAlert;
            GroupCallPipAlertView groupCallPipAlertView = this.pipAlertView;
            if (z2) {
                if (anonymousClass6.getVisibility() != 0) {
                    anonymousClass6.setVisibility(0);
                    anonymousClass6.setAlpha(0.0f);
                    groupCallPipAlertView.setScaleX(0.7f);
                    groupCallPipAlertView.setScaleY(0.7f);
                }
                anonymousClass6.getViewTreeObserver().addOnPreDrawListener(new PhotoViewer.AnonymousClass9(this, 4));
                anonymousClass6.animate().alpha(1.0f).setDuration(150L).start();
                groupCallPipAlertView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                groupCallPipAlertView.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                anonymousClass6.animate().alpha(0.0f).setDuration(150L).setListener(new AnonymousClass8(this, 0)).start();
            }
        }
        checkButtonAlpha();
    }

    public final void showRemoveTooltip(boolean z) {
        int i = 1;
        if (this.animateToShowRemoveTooltip != z) {
            this.animateToShowRemoveTooltip = z;
            AnimatorSet animatorSet = this.showRemoveAnimator;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.showRemoveAnimator.cancel();
            }
            AnonymousClass5 anonymousClass5 = this.removeTooltipView;
            if (!z) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.showRemoveAnimator = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass5, (Property<AnonymousClass5, Float>) View.ALPHA, anonymousClass5.getAlpha(), 0.0f), ObjectAnimator.ofFloat(anonymousClass5, (Property<AnonymousClass5, Float>) View.SCALE_X, anonymousClass5.getScaleX(), 0.5f), ObjectAnimator.ofFloat(anonymousClass5, (Property<AnonymousClass5, Float>) View.SCALE_Y, anonymousClass5.getScaleY(), 0.5f));
                this.showRemoveAnimator.addListener(new AnonymousClass8(this, i));
                this.showRemoveAnimator.setDuration(150L);
                this.showRemoveAnimator.start();
                return;
            }
            AnonymousClass4 anonymousClass4 = this.windowRemoveTooltipView;
            if (anonymousClass4.getVisibility() != 0) {
                anonymousClass4.setVisibility(0);
                anonymousClass5.setAlpha(0.0f);
                anonymousClass5.setScaleX(0.5f);
                anonymousClass5.setScaleY(0.5f);
                this.deleteIcon.setCurrentFrame(0, true, false);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.showRemoveAnimator = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(anonymousClass5, (Property<AnonymousClass5, Float>) View.ALPHA, anonymousClass5.getAlpha(), 1.0f), ObjectAnimator.ofFloat(anonymousClass5, (Property<AnonymousClass5, Float>) View.SCALE_X, anonymousClass5.getScaleX(), 1.0f), ObjectAnimator.ofFloat(anonymousClass5, (Property<AnonymousClass5, Float>) View.SCALE_Y, anonymousClass5.getScaleY(), 1.0f));
            this.showRemoveAnimator.setDuration(150L).start();
        }
    }

    public final void updateAvatars$1(boolean z) {
        ChatObject.Call call;
        AvatarsImageView avatarsImageView = this.avatarsImageView;
        AvatarsDrawable avatarsDrawable = avatarsImageView.avatarsDrawable;
        if (avatarsDrawable.transitionProgressAnimator != null) {
            avatarsDrawable.updateAfterTransition = true;
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        ChatObject.Call call2 = sharedInstance != null ? sharedInstance.groupCall : null;
        AvatarsDrawable avatarsDrawable2 = avatarsImageView.avatarsDrawable;
        int i = 0;
        int i2 = this.currentAccount;
        if (call2 == null) {
            while (i < 3) {
                avatarsDrawable2.setObject(i, null, i2);
                i++;
            }
            avatarsDrawable2.commitTransition(z, true);
            return;
        }
        long selfId = sharedInstance.getSelfId();
        int size = call2.sortedParticipants.size();
        int i3 = 0;
        while (i < 2) {
            if (i3 < size) {
                TLRPC.GroupCallParticipant groupCallParticipant = call2.sortedParticipants.get(i3);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != selfId) {
                    call = call2;
                    if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                        avatarsDrawable2.setObject(i, groupCallParticipant, i2);
                    }
                } else {
                    call = call2;
                }
                i3++;
                call2 = call;
            } else {
                call = call2;
                avatarsDrawable2.setObject(i, null, i2);
            }
            i++;
            i3++;
            call2 = call;
        }
        avatarsDrawable2.setObject(2, null, i2);
        avatarsDrawable2.commitTransition(z, true);
    }

    public final void updateAvatarsPosition() {
        float fMax = Math.max(this.windowLayoutParams.x, -AndroidUtilities.dp(36.0f));
        int i = AndroidUtilities.displaySize.x;
        AnonymousClass3 anonymousClass3 = this.windowView;
        float fMin = Math.min(fMax, AndroidUtilities.dp(36.0f) + (i - anonymousClass3.getMeasuredWidth()));
        AvatarsImageView avatarsImageView = this.avatarsImageView;
        if (fMin < 0.0f) {
            avatarsImageView.setTranslationX(Math.abs(fMin) / 3.0f);
        } else if (fMin > i - anonymousClass3.getMeasuredWidth()) {
            avatarsImageView.setTranslationX((-Math.abs(fMin - (i - anonymousClass3.getMeasuredWidth()))) / 3.0f);
        } else {
            avatarsImageView.setTranslationX(0.0f);
        }
    }

    public final void updateButtonPosition() {
        float f = this.windowLeft - this.windowOffsetLeft;
        AnonymousClass4 anonymousClass4 = this.windowRemoveTooltipView;
        float measuredWidth = (anonymousClass4.getMeasuredWidth() / 2.0f) + f;
        AnonymousClass3 anonymousClass3 = this.windowView;
        float measuredWidth2 = measuredWidth - (anonymousClass3.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((anonymousClass4.getMeasuredHeight() / 2.0f) + (this.windowTop - this.windowOffsetTop)) - (anonymousClass3.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        float f2 = this.windowX;
        float f3 = this.pinnedProgress;
        float f4 = 1.0f - f3;
        layoutParams.x = (int) ((measuredWidth2 * f3) + (f2 * f4));
        layoutParams.y = (int) ((measuredHeight * f3) + (f4 * this.windowY));
        updateAvatarsPosition();
        if (anonymousClass3.getParent() != null) {
            this.windowManager.updateViewLayout(anonymousClass3, this.windowLayoutParams);
        }
    }
}
