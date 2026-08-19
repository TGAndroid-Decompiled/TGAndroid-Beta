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
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.GroupCallActivity;

public class GroupCallPip implements NotificationCenter.NotificationCenterDelegate {
    private static boolean forceRemoved = true;
    private static GroupCallPip instance;
    FrameLayout alertContainer;
    boolean animateToPrepareRemove;
    boolean animateToShowRemoveTooltip;
    AvatarsImageView avatarsImageView;
    private final GroupCallPipButton button;
    boolean buttonInAlpha;
    int currentAccount;
    RLottieDrawable deleteIcon;
    private final RLottieImageView iconView;
    int lastScreenX;
    int lastScreenY;
    boolean moving;
    ValueAnimator pinAnimator;
    GroupCallPipAlertView pipAlertView;
    boolean pressedState;
    View removeTooltipView;
    boolean removed;
    boolean showAlert;
    AnimatorSet showRemoveAnimator;
    WindowManager.LayoutParams windowLayoutParams;
    int windowLeft;
    WindowManager windowManager;
    float windowOffsetLeft;
    float windowOffsetTop;
    FrameLayout windowRemoveTooltipOverlayView;
    FrameLayout windowRemoveTooltipView;
    int windowTop;
    FrameLayout windowView;
    float windowX;
    float windowY;
    float prepareToRemoveProgress = 0.0f;
    int[] location = new int[2];
    float[] point = new float[2];
    float xRelative = -1.0f;
    float yRelative = -1.0f;
    private ValueAnimator.AnimatorUpdateListener updateXlistener = new ValueAnimator.AnimatorUpdateListener() {
        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            GroupCallPip groupCallPip = GroupCallPip.this;
            groupCallPip.windowLayoutParams.x = (int) fFloatValue;
            groupCallPip.updateAvatarsPosition();
            if (GroupCallPip.this.windowView.getParent() != null) {
                GroupCallPip groupCallPip2 = GroupCallPip.this;
                groupCallPip2.windowManager.updateViewLayout(groupCallPip2.windowView, groupCallPip2.windowLayoutParams);
            }
        }
    };
    private ValueAnimator.AnimatorUpdateListener updateYlistener = new ValueAnimator.AnimatorUpdateListener() {
        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            GroupCallPip groupCallPip = GroupCallPip.this;
            groupCallPip.windowLayoutParams.y = (int) fFloatValue;
            if (groupCallPip.windowView.getParent() != null) {
                GroupCallPip groupCallPip2 = GroupCallPip.this;
                groupCallPip2.windowManager.updateViewLayout(groupCallPip2.windowView, groupCallPip2.windowLayoutParams);
            }
        }
    };
    boolean animateToPinnedToCenter = false;
    float pinnedProgress = 0.0f;

    public GroupCallPip(Context context, int i) {
        this.currentAccount = i;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.windowView = anonymousClass3;
        anonymousClass3.setAlpha(0.7f);
        GroupCallPipButton groupCallPipButton = new GroupCallPipButton(context, this.currentAccount, false);
        this.button = groupCallPipButton;
        this.windowView.addView(groupCallPipButton, LayoutHelper.createFrame(-1, -1, 17));
        AvatarsImageView avatarsImageView = new AvatarsImageView(context, true);
        this.avatarsImageView = avatarsImageView;
        avatarsImageView.setStyle(5);
        this.avatarsImageView.setCentered(true);
        this.avatarsImageView.setVisibility(8);
        this.avatarsImageView.setDelegate(new Runnable() {
            @Override
            public final void run() {
                this.f$0.updateAvatars(true);
            }
        });
        updateAvatars(false);
        this.windowView.addView(this.avatarsImageView, LayoutHelper.createFrame(108, 36, 49));
        this.windowRemoveTooltipView = new FrameLayout(context) {
            @Override
            protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                super.onLayout(z, i2, i3, i4, i5);
                GroupCallPip groupCallPip = GroupCallPip.this;
                groupCallPip.windowRemoveTooltipView.getLocationOnScreen(groupCallPip.location);
                GroupCallPip groupCallPip2 = GroupCallPip.this;
                int[] iArr = groupCallPip2.location;
                groupCallPip2.windowLeft = iArr[0];
                groupCallPip2.windowTop = iArr[1] - AndroidUtilities.dp(25.0f);
            }

            @Override
            public void setVisibility(int i2) {
                super.setVisibility(i2);
                GroupCallPip.this.windowRemoveTooltipOverlayView.setVisibility(i2);
            }
        };
        View view = new View(context) {
            Paint paint = new Paint(1);

            @Override
            protected void onDraw(Canvas canvas) {
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
                this.paint.setColor(ColorUtils.blendARGB(1711607061, 1714752530, GroupCallPip.this.prepareToRemoveProgress));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(25.0f), AndroidUtilities.dp(35.0f) + (AndroidUtilities.dp(5.0f) * GroupCallPip.this.prepareToRemoveProgress), this.paint);
            }

            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                GroupCallPip.this.windowRemoveTooltipOverlayView.setAlpha(f);
            }

            @Override
            public void setScaleX(float f) {
                super.setScaleX(f);
                GroupCallPip.this.windowRemoveTooltipOverlayView.setScaleX(f);
            }

            @Override
            public void setScaleY(float f) {
                super.setScaleY(f);
                GroupCallPip.this.windowRemoveTooltipOverlayView.setScaleY(f);
            }

            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                GroupCallPip.this.windowRemoveTooltipOverlayView.setTranslationY(f);
            }
        };
        this.removeTooltipView = view;
        this.windowRemoveTooltipView.addView(view);
        this.windowRemoveTooltipOverlayView = new FrameLayout(context);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.iconView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        int i2 = R.raw.group_pip_delete_icon;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i2, "" + i2, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.deleteIcon = rLottieDrawable;
        rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
        rLottieImageView.setAnimation(this.deleteIcon);
        rLottieImageView.setColorFilter(-1);
        this.windowRemoveTooltipOverlayView.addView(rLottieImageView, LayoutHelper.createFrame(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        FrameLayout frameLayout = new FrameLayout(context) {
            int lastSize = -1;

            @Override
            protected void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                super.onLayout(z, i3, i4, i5, i6);
                Point point = AndroidUtilities.displaySize;
                int i7 = point.x + point.y;
                int i8 = this.lastSize;
                if (i8 > 0 && i8 != i7) {
                    setVisibility(8);
                    GroupCallPip groupCallPip = GroupCallPip.this;
                    groupCallPip.showAlert = false;
                    groupCallPip.checkButtonAlpha();
                }
                this.lastSize = i7;
            }

            @Override
            public void setVisibility(int i3) {
                super.setVisibility(i3);
                if (i3 == 8) {
                    this.lastSize = -1;
                }
            }
        };
        this.alertContainer = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.showAlert(false);
            }
        });
        this.alertContainer.setClipChildren(false);
        FrameLayout frameLayout2 = this.alertContainer;
        GroupCallPipAlertView groupCallPipAlertView = new GroupCallPipAlertView(context, this.currentAccount);
        this.pipAlertView = groupCallPipAlertView;
        frameLayout2.addView(groupCallPipAlertView, LayoutHelper.createFrame(-2, -2.0f));
    }

    class AnonymousClass3 extends FrameLayout {
        Runnable micRunnable;
        AnimatorSet moveToBoundsAnimator;
        boolean pressed;
        Runnable pressedRunnable;
        long startTime;
        float startX;
        float startY;
        final float val$touchSlop;

        AnonymousClass3(Context context, float f) {
            super(context);
            this.val$touchSlop = f;
            this.pressedRunnable = new Runnable() {
                @Override
                public void run() {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance == null || !sharedInstance.isMicMute()) {
                        return;
                    }
                    TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.get(sharedInstance.getSelfId());
                    if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                        AndroidUtilities.runOnUIThread(AnonymousClass3.this.micRunnable, 90L);
                        try {
                            AnonymousClass3.this.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AnonymousClass3.this.pressed = true;
                    }
                }
            };
            this.micRunnable = new Runnable() {
                @Override
                public final void run() {
                    GroupCallPip.AnonymousClass3.$r8$lambda$mg6HLiI7KXGgamRg3qp8i90PRYE();
                }
            };
        }

        public static void $r8$lambda$mg6HLiI7KXGgamRg3qp8i90PRYE() {
            if (VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute()) {
                return;
            }
            VoIPService.getSharedInstance().setMicMute(false, true, false);
        }

        @Override
        protected void onMeasure(int i, int i2) {
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
            if (GroupCallPip.instance != null) {
                GroupCallPip groupCallPip2 = GroupCallPip.instance;
                GroupCallPip groupCallPip3 = GroupCallPip.this;
                groupCallPip2.setPosition(groupCallPip3.xRelative, groupCallPip3.yRelative);
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            GroupCallPip groupCallPip;
            int i;
            float f;
            float measuredWidth;
            float measuredHeight;
            float measuredHeight2;
            float f2;
            int iDp;
            GroupCallPip groupCallPip2;
            boolean z;
            boolean z2 = false;
            if (GroupCallPip.instance == null) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            ViewParent parent = getParent();
            int action = motionEvent.getAction();
            if (action != 0) {
                float f3 = 0.0f;
                if (action == 1) {
                    AndroidUtilities.cancelRunOnUIThread(this.micRunnable);
                    AndroidUtilities.cancelRunOnUIThread(this.pressedRunnable);
                    groupCallPip = GroupCallPip.this;
                    if (groupCallPip.animateToPrepareRemove) {
                        if (this.pressed && VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(true, false, false);
                        }
                        this.pressed = false;
                        GroupCallPip.this.remove();
                        return false;
                    }
                    groupCallPip.pressedState = false;
                    groupCallPip.checkButtonAlpha();
                    if (this.pressed) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(true, false, false);
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                        this.pressed = false;
                    } else if (motionEvent.getAction() == 1 && !GroupCallPip.this.moving) {
                        onTap();
                        return false;
                    }
                    if (parent != null && GroupCallPip.this.moving) {
                        parent.requestDisallowInterceptTouchEvent(false);
                        Point point = AndroidUtilities.displaySize;
                        i = point.x;
                        int i2 = point.y;
                        f = GroupCallPip.this.windowLayoutParams.x;
                        measuredWidth = getMeasuredWidth() + f;
                        measuredHeight = GroupCallPip.this.windowLayoutParams.y;
                        measuredHeight2 = getMeasuredHeight() + measuredHeight;
                        this.moveToBoundsAnimator = new AnimatorSet();
                        f2 = -AndroidUtilities.dp(36.0f);
                        if (f < f2) {
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(GroupCallPip.this.windowLayoutParams.x, f2);
                            valueAnimatorOfFloat.addUpdateListener(GroupCallPip.this.updateXlistener);
                            this.moveToBoundsAnimator.playTogether(valueAnimatorOfFloat);
                            f = f2;
                        } else if (measuredWidth > i - f2) {
                            float f4 = GroupCallPip.this.windowLayoutParams.x;
                            float measuredWidth2 = (i - getMeasuredWidth()) - f2;
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f4, measuredWidth2);
                            valueAnimatorOfFloat2.addUpdateListener(GroupCallPip.this.updateXlistener);
                            this.moveToBoundsAnimator.playTogether(valueAnimatorOfFloat2);
                            f = measuredWidth2;
                        }
                        iDp = i2 + AndroidUtilities.dp(36.0f);
                        if (measuredHeight < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                            float f5 = GroupCallPip.this.windowLayoutParams.y;
                            measuredHeight = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f5, measuredHeight);
                            valueAnimatorOfFloat3.addUpdateListener(GroupCallPip.this.updateYlistener);
                            this.moveToBoundsAnimator.playTogether(valueAnimatorOfFloat3);
                        } else if (measuredHeight2 > iDp) {
                            float f6 = GroupCallPip.this.windowLayoutParams.y;
                            measuredHeight = iDp - getMeasuredHeight();
                            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(f6, measuredHeight);
                            valueAnimatorOfFloat4.addUpdateListener(GroupCallPip.this.updateYlistener);
                            this.moveToBoundsAnimator.playTogether(valueAnimatorOfFloat4);
                        }
                        this.moveToBoundsAnimator.setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT);
                        this.moveToBoundsAnimator.start();
                        groupCallPip2 = GroupCallPip.this;
                        if (groupCallPip2.xRelative >= 0.0f) {
                            groupCallPip2.getRelativePosition(f, measuredHeight, groupCallPip2.point);
                            SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                            GroupCallPip groupCallPip3 = GroupCallPip.this;
                            float f7 = groupCallPip3.point[0];
                            groupCallPip3.xRelative = f7;
                            SharedPreferences.Editor editorPutFloat = editorEdit.putFloat("relativeX", f7);
                            GroupCallPip groupCallPip4 = GroupCallPip.this;
                            float f8 = groupCallPip4.point[1];
                            groupCallPip4.yRelative = f8;
                            editorPutFloat.putFloat("relativeY", f8).apply();
                        }
                    }
                    GroupCallPip groupCallPip5 = GroupCallPip.this;
                    groupCallPip5.moving = false;
                    groupCallPip5.showRemoveTooltip(false);
                } else if (action == 2) {
                    float f9 = rawX - this.startX;
                    float f10 = rawY - this.startY;
                    if (GroupCallPip.this.moving) {
                        f3 = f9;
                    } else {
                        float f11 = (f9 * f9) + (f10 * f10);
                        float f12 = this.val$touchSlop;
                        if (f11 > f12 * f12) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            AndroidUtilities.cancelRunOnUIThread(this.pressedRunnable);
                            GroupCallPip groupCallPip6 = GroupCallPip.this;
                            groupCallPip6.moving = true;
                            groupCallPip6.showRemoveTooltip(true);
                            GroupCallPip.this.showAlert(false);
                            this.startX = rawX;
                            this.startY = rawY;
                            f10 = 0.0f;
                        } else {
                            f3 = f9;
                        }
                    }
                    GroupCallPip groupCallPip7 = GroupCallPip.this;
                    if (groupCallPip7.moving) {
                        groupCallPip7.windowX += f3;
                        groupCallPip7.windowY += f10;
                        this.startX = rawX;
                        this.startY = rawY;
                        groupCallPip7.updateButtonPosition();
                        float measuredWidth3 = GroupCallPip.this.windowX + (getMeasuredWidth() / 2.0f);
                        float measuredHeight3 = GroupCallPip.this.windowY + (getMeasuredHeight() / 2.0f);
                        GroupCallPip groupCallPip8 = GroupCallPip.this;
                        float measuredWidth4 = (groupCallPip8.windowLeft - groupCallPip8.windowOffsetLeft) + (groupCallPip8.windowRemoveTooltipView.getMeasuredWidth() / 2.0f);
                        GroupCallPip groupCallPip9 = GroupCallPip.this;
                        float measuredHeight4 = (groupCallPip9.windowTop - groupCallPip9.windowOffsetTop) + (groupCallPip9.windowRemoveTooltipView.getMeasuredHeight() / 2.0f);
                        float f13 = measuredWidth3 - measuredWidth4;
                        float f14 = measuredHeight3 - measuredHeight4;
                        float f15 = (f13 * f13) + (f14 * f14);
                        if (f15 < AndroidUtilities.dp(80.0f) * AndroidUtilities.dp(80.0f)) {
                            GroupCallPip.this.button.setRemoveAngle((((measuredWidth3 <= measuredWidth4 || measuredHeight3 >= measuredHeight4) && (measuredWidth3 >= measuredWidth4 || measuredHeight3 >= measuredHeight4)) ? 90.0d : 270.0d) - Math.toDegrees(Math.atan(f13 / f14)));
                            if (f15 < AndroidUtilities.dp(50.0f) * AndroidUtilities.dp(50.0f)) {
                                z = true;
                                z2 = true;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        GroupCallPip.this.pinnedToCenter(z2);
                        GroupCallPip.this.prepareToRemove(z);
                    }
                } else if (action == 3) {
                    AndroidUtilities.cancelRunOnUIThread(this.micRunnable);
                    AndroidUtilities.cancelRunOnUIThread(this.pressedRunnable);
                    groupCallPip = GroupCallPip.this;
                    if (groupCallPip.animateToPrepareRemove) {
                        if (this.pressed) {
                            VoIPService.getSharedInstance().setMicMute(true, false, false);
                        }
                        this.pressed = false;
                        GroupCallPip.this.remove();
                        return false;
                    }
                    groupCallPip.pressedState = false;
                    groupCallPip.checkButtonAlpha();
                    if (this.pressed) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(true, false, false);
                            performHapticFeedback(3, 2);
                        }
                        this.pressed = false;
                    } else if (motionEvent.getAction() == 1) {
                        onTap();
                        return false;
                    }
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(false);
                        Point point2 = AndroidUtilities.displaySize;
                        i = point2.x;
                        int i3 = point2.y;
                        f = GroupCallPip.this.windowLayoutParams.x;
                        measuredWidth = getMeasuredWidth() + f;
                        measuredHeight = GroupCallPip.this.windowLayoutParams.y;
                        measuredHeight2 = getMeasuredHeight() + measuredHeight;
                        this.moveToBoundsAnimator = new AnimatorSet();
                        f2 = -AndroidUtilities.dp(36.0f);
                        if (f < f2) {
                            ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(GroupCallPip.this.windowLayoutParams.x, f2);
                            valueAnimatorOfFloat5.addUpdateListener(GroupCallPip.this.updateXlistener);
                            this.moveToBoundsAnimator.playTogether(valueAnimatorOfFloat5);
                            f = f2;
                        } else if (measuredWidth > i - f2) {
                            float f16 = GroupCallPip.this.windowLayoutParams.x;
                            float measuredWidth5 = (i - getMeasuredWidth()) - f2;
                            ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(f16, measuredWidth5);
                            valueAnimatorOfFloat6.addUpdateListener(GroupCallPip.this.updateXlistener);
                            this.moveToBoundsAnimator.playTogether(valueAnimatorOfFloat6);
                            f = measuredWidth5;
                        }
                        iDp = i3 + AndroidUtilities.dp(36.0f);
                        if (measuredHeight < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                            float f17 = GroupCallPip.this.windowLayoutParams.y;
                            measuredHeight = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                            ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(f17, measuredHeight);
                            valueAnimatorOfFloat7.addUpdateListener(GroupCallPip.this.updateYlistener);
                            this.moveToBoundsAnimator.playTogether(valueAnimatorOfFloat7);
                        } else if (measuredHeight2 > iDp) {
                            float f18 = GroupCallPip.this.windowLayoutParams.y;
                            measuredHeight = iDp - getMeasuredHeight();
                            ValueAnimator valueAnimatorOfFloat8 = ValueAnimator.ofFloat(f18, measuredHeight);
                            valueAnimatorOfFloat8.addUpdateListener(GroupCallPip.this.updateYlistener);
                            this.moveToBoundsAnimator.playTogether(valueAnimatorOfFloat8);
                        }
                        this.moveToBoundsAnimator.setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT);
                        this.moveToBoundsAnimator.start();
                        groupCallPip2 = GroupCallPip.this;
                        if (groupCallPip2.xRelative >= 0.0f) {
                            groupCallPip2.getRelativePosition(f, measuredHeight, groupCallPip2.point);
                            SharedPreferences.Editor editorEdit2 = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                            GroupCallPip groupCallPip10 = GroupCallPip.this;
                            float f19 = groupCallPip10.point[0];
                            groupCallPip10.xRelative = f19;
                            SharedPreferences.Editor editorPutFloat2 = editorEdit2.putFloat("relativeX", f19);
                            GroupCallPip groupCallPip11 = GroupCallPip.this;
                            float f20 = groupCallPip11.point[1];
                            groupCallPip11.yRelative = f20;
                            editorPutFloat2.putFloat("relativeY", f20).apply();
                        }
                    }
                    GroupCallPip groupCallPip12 = GroupCallPip.this;
                    groupCallPip12.moving = false;
                    groupCallPip12.showRemoveTooltip(false);
                }
            } else {
                getLocationOnScreen(GroupCallPip.this.location);
                GroupCallPip groupCallPip13 = GroupCallPip.this;
                int[] iArr = groupCallPip13.location;
                int i4 = iArr[0];
                WindowManager.LayoutParams layoutParams = groupCallPip13.windowLayoutParams;
                groupCallPip13.windowOffsetLeft = i4 - layoutParams.x;
                groupCallPip13.windowOffsetTop = iArr[1] - layoutParams.y;
                this.startX = rawX;
                this.startY = rawY;
                this.startTime = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(this.pressedRunnable, 300L);
                GroupCallPip groupCallPip14 = GroupCallPip.this;
                WindowManager.LayoutParams layoutParams2 = groupCallPip14.windowLayoutParams;
                groupCallPip14.windowX = layoutParams2.x;
                groupCallPip14.windowY = layoutParams2.y;
                groupCallPip14.pressedState = true;
                groupCallPip14.checkButtonAlpha();
            }
            return true;
        }

        private void onTap() {
            if (VoIPService.getSharedInstance() != null) {
                GroupCallPip groupCallPip = GroupCallPip.this;
                groupCallPip.showAlert(!groupCallPip.showAlert);
            }
        }
    }

    public static boolean isShowing() {
        VoIPService sharedInstance;
        if (!RTMPStreamPipOverlay.isVisible() && instance == null) {
            return (!checkInlinePermissions() || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp() || forceRemoved || (!ApplicationLoader.mainInterfaceStopped && GroupCallActivity.groupCallUiVisible)) ? false : true;
        }
        return true;
    }

    public static boolean onBackPressed() {
        GroupCallPip groupCallPip = instance;
        if (groupCallPip == null || !groupCallPip.showAlert) {
            return false;
        }
        groupCallPip.showAlert(false);
        return true;
    }

    public void showAlert(boolean z) {
        if (z != this.showAlert) {
            this.showAlert = z;
            this.alertContainer.animate().setListener(null).cancel();
            if (this.showAlert) {
                if (this.alertContainer.getVisibility() != 0) {
                    this.alertContainer.setVisibility(0);
                    this.alertContainer.setAlpha(0.0f);
                    this.pipAlertView.setScaleX(0.7f);
                    this.pipAlertView.setScaleY(0.7f);
                }
                this.alertContainer.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public boolean onPreDraw() {
                        GroupCallPip.this.alertContainer.getViewTreeObserver().removeOnPreDrawListener(this);
                        GroupCallPip groupCallPip = GroupCallPip.this;
                        groupCallPip.alertContainer.getLocationOnScreen(groupCallPip.location);
                        GroupCallPip groupCallPip2 = GroupCallPip.this;
                        float measuredWidth = groupCallPip2.windowLayoutParams.x + groupCallPip2.windowOffsetLeft + (groupCallPip2.button.getMeasuredWidth() / 2.0f);
                        GroupCallPip groupCallPip3 = GroupCallPip.this;
                        float f = measuredWidth - groupCallPip3.location[0];
                        float measuredWidth2 = ((groupCallPip3.windowLayoutParams.y + groupCallPip3.windowOffsetTop) + (groupCallPip3.button.getMeasuredWidth() / 2.0f)) - GroupCallPip.this.location[1];
                        boolean z2 = measuredWidth2 - ((float) AndroidUtilities.dp(61.0f)) > 0.0f && ((float) AndroidUtilities.dp(61.0f)) + measuredWidth2 < ((float) GroupCallPip.this.alertContainer.getMeasuredHeight());
                        if (AndroidUtilities.dp(61.0f) + f + GroupCallPip.this.pipAlertView.getMeasuredWidth() < GroupCallPip.this.alertContainer.getMeasuredWidth() - AndroidUtilities.dp(16.0f) && z2) {
                            GroupCallPip.this.pipAlertView.setTranslationX(AndroidUtilities.dp(61.0f) + f);
                            float measuredHeight = measuredWidth2 / GroupCallPip.this.alertContainer.getMeasuredHeight();
                            float fDp = AndroidUtilities.dp(40.0f) / GroupCallPip.this.pipAlertView.getMeasuredHeight();
                            float fMax = Math.max(fDp, Math.min(measuredHeight, 1.0f - fDp));
                            GroupCallPipAlertView groupCallPipAlertView = GroupCallPip.this.pipAlertView;
                            groupCallPipAlertView.setTranslationY((int) (measuredWidth2 - (groupCallPipAlertView.getMeasuredHeight() * fMax)));
                            GroupCallPip.this.pipAlertView.setPosition(0, f, measuredWidth2);
                        } else if ((f - AndroidUtilities.dp(61.0f)) - GroupCallPip.this.pipAlertView.getMeasuredWidth() > AndroidUtilities.dp(16.0f) && z2) {
                            float measuredHeight2 = measuredWidth2 / GroupCallPip.this.alertContainer.getMeasuredHeight();
                            float fDp2 = AndroidUtilities.dp(40.0f) / GroupCallPip.this.pipAlertView.getMeasuredHeight();
                            float fMax2 = Math.max(fDp2, Math.min(measuredHeight2, 1.0f - fDp2));
                            GroupCallPip.this.pipAlertView.setTranslationX((int) ((f - AndroidUtilities.dp(61.0f)) - GroupCallPip.this.pipAlertView.getMeasuredWidth()));
                            GroupCallPipAlertView groupCallPipAlertView2 = GroupCallPip.this.pipAlertView;
                            groupCallPipAlertView2.setTranslationY((int) (measuredWidth2 - (groupCallPipAlertView2.getMeasuredHeight() * fMax2)));
                            GroupCallPip.this.pipAlertView.setPosition(1, f, measuredWidth2);
                        } else if (measuredWidth2 > GroupCallPip.this.alertContainer.getMeasuredHeight() * 0.3f) {
                            float measuredWidth3 = f / GroupCallPip.this.alertContainer.getMeasuredWidth();
                            float fDp3 = AndroidUtilities.dp(40.0f) / GroupCallPip.this.pipAlertView.getMeasuredWidth();
                            float fMax3 = Math.max(fDp3, Math.min(measuredWidth3, 1.0f - fDp3));
                            GroupCallPipAlertView groupCallPipAlertView3 = GroupCallPip.this.pipAlertView;
                            groupCallPipAlertView3.setTranslationX((int) (f - (groupCallPipAlertView3.getMeasuredWidth() * fMax3)));
                            GroupCallPipAlertView groupCallPipAlertView4 = GroupCallPip.this.pipAlertView;
                            groupCallPipAlertView4.setTranslationY((int) ((measuredWidth2 - groupCallPipAlertView4.getMeasuredHeight()) - AndroidUtilities.dp(61.0f)));
                            GroupCallPip.this.pipAlertView.setPosition(3, f, measuredWidth2);
                        } else {
                            float measuredWidth4 = f / GroupCallPip.this.alertContainer.getMeasuredWidth();
                            float fDp4 = AndroidUtilities.dp(40.0f) / GroupCallPip.this.pipAlertView.getMeasuredWidth();
                            float fMax4 = Math.max(fDp4, Math.min(measuredWidth4, 1.0f - fDp4));
                            GroupCallPipAlertView groupCallPipAlertView5 = GroupCallPip.this.pipAlertView;
                            groupCallPipAlertView5.setTranslationX((int) (f - (groupCallPipAlertView5.getMeasuredWidth() * fMax4)));
                            GroupCallPip.this.pipAlertView.setTranslationY((int) (AndroidUtilities.dp(61.0f) + measuredWidth2));
                            GroupCallPip.this.pipAlertView.setPosition(2, f, measuredWidth2);
                        }
                        return false;
                    }
                });
                this.alertContainer.animate().alpha(1.0f).setDuration(150L).start();
                this.pipAlertView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                this.pipAlertView.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                this.alertContainer.animate().alpha(0.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        GroupCallPip.this.alertContainer.setVisibility(8);
                    }
                }).start();
            }
        }
        checkButtonAlpha();
    }

    public void checkButtonAlpha() {
        boolean z = this.pressedState || this.showAlert;
        if (this.buttonInAlpha != z) {
            this.buttonInAlpha = z;
            if (z) {
                this.windowView.animate().alpha(1.0f).start();
            } else {
                this.windowView.animate().alpha(0.7f).start();
            }
            this.button.setPressedState(z);
        }
    }

    public static GroupCallPip getInstance() {
        return instance;
    }

    public void remove() {
        GroupCallPip groupCallPip = instance;
        if (groupCallPip == null) {
            return;
        }
        this.removed = true;
        forceRemoved = true;
        this.button.removed = true;
        groupCallPip.showAlert(false);
        float measuredWidth = this.windowLayoutParams.x + (this.windowView.getMeasuredWidth() / 2.0f);
        float measuredHeight = this.windowLayoutParams.y + (this.windowView.getMeasuredHeight() / 2.0f);
        float measuredWidth2 = ((this.windowLeft - this.windowOffsetLeft) + (this.windowRemoveTooltipView.getMeasuredWidth() / 2.0f)) - measuredWidth;
        float measuredHeight2 = ((this.windowTop - this.windowOffsetTop) + (this.windowRemoveTooltipView.getMeasuredHeight() / 2.0f)) - measuredHeight;
        GroupCallPip groupCallPip2 = instance;
        WindowManager windowManager = groupCallPip2.windowManager;
        FrameLayout frameLayout = groupCallPip2.windowView;
        FrameLayout frameLayout2 = groupCallPip2.windowRemoveTooltipView;
        FrameLayout frameLayout3 = groupCallPip2.windowRemoveTooltipOverlayView;
        FrameLayout frameLayout4 = groupCallPip2.alertContainer;
        onDestroy();
        instance = null;
        AnimatorSet animatorSet = new AnimatorSet();
        long currentFrame = this.deleteIcon.getCurrentFrame() < 33 ? (long) (((1.0f - (this.deleteIcon.getCurrentFrame() / 33.0f)) * this.deleteIcon.getDuration()) / 2.0f) : 0L;
        float f = this.windowLayoutParams.x;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, measuredWidth2 + f);
        valueAnimatorOfFloat.addUpdateListener(this.updateXlistener);
        ValueAnimator duration = valueAnimatorOfFloat.setDuration(250L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        duration.setInterpolator(cubicBezierInterpolator);
        animatorSet.playTogether(valueAnimatorOfFloat);
        float f2 = this.windowLayoutParams.y;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f2, (f2 + measuredHeight2) - AndroidUtilities.dp(30.0f), this.windowLayoutParams.y + measuredHeight2);
        valueAnimatorOfFloat2.addUpdateListener(this.updateYlistener);
        valueAnimatorOfFloat2.setDuration(250L).setInterpolator(cubicBezierInterpolator);
        animatorSet.playTogether(valueAnimatorOfFloat2);
        Property property = View.SCALE_X;
        animatorSet.playTogether(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, frameLayout.getScaleX(), 0.1f).setDuration(180L));
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property2, frameLayout.getScaleY(), 0.1f).setDuration(180L));
        Property property3 = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property3, 1.0f, 0.0f);
        float f3 = 350L;
        objectAnimatorOfFloat.setStartDelay((long) (f3 * 0.7f));
        objectAnimatorOfFloat.setDuration((long) (f3 * 0.3f));
        animatorSet.playTogether(objectAnimatorOfFloat);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
            }
        }, 370L);
        long j = currentFrame + 530;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.removeTooltipView, (Property<View, Float>) property, 1.0f, 1.05f);
        objectAnimatorOfFloat2.setDuration(j);
        CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_BOTH;
        objectAnimatorOfFloat2.setInterpolator(cubicBezierInterpolator2);
        animatorSet.playTogether(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.removeTooltipView, (Property<View, Float>) property2, 1.0f, 1.05f);
        objectAnimatorOfFloat3.setDuration(j);
        objectAnimatorOfFloat3.setInterpolator(cubicBezierInterpolator2);
        animatorSet.playTogether(objectAnimatorOfFloat3);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.removeTooltipView, (Property<View, Float>) property, 1.0f, 0.3f);
        objectAnimatorOfFloat4.setStartDelay(j);
        objectAnimatorOfFloat4.setDuration(350L);
        CubicBezierInterpolator cubicBezierInterpolator3 = CubicBezierInterpolator.EASE_OUT_QUINT;
        objectAnimatorOfFloat4.setInterpolator(cubicBezierInterpolator3);
        animatorSet.playTogether(objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.removeTooltipView, (Property<View, Float>) property2, 1.0f, 0.3f);
        objectAnimatorOfFloat5.setStartDelay(j);
        objectAnimatorOfFloat5.setDuration(350L);
        objectAnimatorOfFloat5.setInterpolator(cubicBezierInterpolator3);
        animatorSet.playTogether(objectAnimatorOfFloat5);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.removeTooltipView, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
        objectAnimatorOfFloat6.setStartDelay(j);
        objectAnimatorOfFloat6.setDuration(350L);
        objectAnimatorOfFloat6.setInterpolator(cubicBezierInterpolator3);
        animatorSet.playTogether(objectAnimatorOfFloat6);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.removeTooltipView, (Property<View, Float>) property3, 1.0f, 0.0f);
        objectAnimatorOfFloat7.setStartDelay(j);
        objectAnimatorOfFloat7.setDuration(350L);
        objectAnimatorOfFloat7.setInterpolator(cubicBezierInterpolator3);
        animatorSet.playTogether(objectAnimatorOfFloat7);
        animatorSet.addListener(new AnonymousClass9(frameLayout, frameLayout2, windowManager, frameLayout3, frameLayout4));
        animatorSet.start();
        this.deleteIcon.setCustomEndFrame(66);
        this.iconView.stopAnimation();
        this.iconView.playAnimation();
    }

    class AnonymousClass9 extends AnimatorListenerAdapter {
        final View val$alert;
        final WindowManager val$windowManager;
        final View val$windowRemoveTooltipOverlayView;
        final View val$windowRemoveTooltipView;
        final View val$windowView;

        AnonymousClass9(View view, View view2, WindowManager windowManager, View view3, View view4) {
            this.val$windowView = view;
            this.val$windowRemoveTooltipView = view2;
            this.val$windowManager = windowManager;
            this.val$windowRemoveTooltipOverlayView = view3;
            this.val$alert = view4;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            NotificationCenter notificationCenter = NotificationCenter.getInstance(GroupCallPip.this.currentAccount);
            final View view = this.val$windowView;
            final View view2 = this.val$windowRemoveTooltipView;
            final WindowManager windowManager = this.val$windowManager;
            final View view3 = this.val$windowRemoveTooltipOverlayView;
            final View view4 = this.val$alert;
            notificationCenter.doOnIdle(new Runnable() {
                @Override
                public final void run() {
                    GroupCallPip.AnonymousClass9.$r8$lambda$ReVuHfSmyrmXgr5wuhGaW32XCbI(view, view2, windowManager, view3, view4);
                }
            });
        }

        public static void $r8$lambda$ReVuHfSmyrmXgr5wuhGaW32XCbI(View view, View view2, WindowManager windowManager, View view3, View view4) {
            view.setVisibility(8);
            view2.setVisibility(8);
            windowManager.removeView(view);
            windowManager.removeView(view2);
            windowManager.removeView(view3);
            windowManager.removeView(view4);
        }
    }

    public void updateAvatars(boolean z) {
        AvatarsImageView avatarsImageView = this.avatarsImageView;
        if (avatarsImageView.avatarsDrawable.transitionProgressAnimator == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            ChatObject.Call call = sharedInstance != null ? sharedInstance.groupCall : null;
            int i = 0;
            if (call != null) {
                long selfId = sharedInstance.getSelfId();
                int size = call.sortedParticipants.size();
                int i2 = 0;
                while (i < 2) {
                    if (i2 < size) {
                        TLRPC.GroupCallParticipant groupCallParticipant = call.sortedParticipants.get(i2);
                        if (MessageObject.getPeerId(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                            this.avatarsImageView.setObject(i, this.currentAccount, groupCallParticipant);
                        }
                        i2++;
                    } else {
                        this.avatarsImageView.setObject(i, this.currentAccount, null);
                    }
                    i++;
                    i2++;
                }
                this.avatarsImageView.setObject(2, this.currentAccount, null);
                this.avatarsImageView.commitTransition(z);
                return;
            }
            while (i < 3) {
                this.avatarsImageView.setObject(i, this.currentAccount, null);
                i++;
            }
            this.avatarsImageView.commitTransition(z);
            return;
        }
        avatarsImageView.updateAfterTransitionEnd();
    }

    public static void show(Context context, int i) {
        if (instance != null) {
            return;
        }
        instance = new GroupCallPip(context, i);
        WindowManager windowManager = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
        instance.windowManager = windowManager;
        WindowManager.LayoutParams layoutParamsCreateWindowLayoutParams = createWindowLayoutParams(context);
        layoutParamsCreateWindowLayoutParams.width = -1;
        layoutParamsCreateWindowLayoutParams.height = -1;
        layoutParamsCreateWindowLayoutParams.dimAmount = 0.25f;
        layoutParamsCreateWindowLayoutParams.flags = 522;
        windowManager.addView(instance.alertContainer, layoutParamsCreateWindowLayoutParams);
        instance.alertContainer.setVisibility(8);
        WindowManager.LayoutParams layoutParamsCreateWindowLayoutParams2 = createWindowLayoutParams(context);
        layoutParamsCreateWindowLayoutParams2.gravity = 81;
        layoutParamsCreateWindowLayoutParams2.width = AndroidUtilities.dp(100.0f);
        layoutParamsCreateWindowLayoutParams2.height = AndroidUtilities.dp(150.0f);
        windowManager.addView(instance.windowRemoveTooltipView, layoutParamsCreateWindowLayoutParams2);
        WindowManager.LayoutParams layoutParamsCreateWindowLayoutParams3 = createWindowLayoutParams(context);
        GroupCallPip groupCallPip = instance;
        groupCallPip.windowLayoutParams = layoutParamsCreateWindowLayoutParams3;
        windowManager.addView(groupCallPip.windowView, layoutParamsCreateWindowLayoutParams3);
        WindowManager.LayoutParams layoutParamsCreateWindowLayoutParams4 = createWindowLayoutParams(context);
        layoutParamsCreateWindowLayoutParams4.gravity = 81;
        layoutParamsCreateWindowLayoutParams4.width = AndroidUtilities.dp(100.0f);
        layoutParamsCreateWindowLayoutParams4.height = AndroidUtilities.dp(150.0f);
        windowManager.addView(instance.windowRemoveTooltipOverlayView, layoutParamsCreateWindowLayoutParams4);
        instance.windowRemoveTooltipView.setVisibility(8);
        instance.windowView.setScaleX(0.5f);
        instance.windowView.setScaleY(0.5f);
        instance.windowView.setAlpha(0.0f);
        instance.windowView.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
        NotificationCenter.getInstance(instance.currentAccount).addObserver(instance, NotificationCenter.groupCallUpdated);
        NotificationCenter.getGlobalInstance().addObserver(instance, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getGlobalInstance().addObserver(instance, NotificationCenter.didEndCall);
    }

    private void onDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.groupCallVisibilityChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
    }

    public void setPosition(float f, float f2) {
        float f3 = -AndroidUtilities.dp(36.0f);
        this.windowLayoutParams.x = (int) (f3 + (((AndroidUtilities.displaySize.x - (2.0f * f3)) - AndroidUtilities.dp(105.0f)) * f));
        this.windowLayoutParams.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f2);
        updateAvatarsPosition();
        if (this.windowView.getParent() != null) {
            this.windowManager.updateViewLayout(this.windowView, this.windowLayoutParams);
        }
    }

    public static void finish() {
        GroupCallPip groupCallPip = instance;
        if (groupCallPip != null) {
            groupCallPip.showAlert(false);
            GroupCallPip groupCallPip2 = instance;
            final WindowManager windowManager = groupCallPip2.windowManager;
            final FrameLayout frameLayout = groupCallPip2.windowView;
            final FrameLayout frameLayout2 = groupCallPip2.windowRemoveTooltipView;
            final FrameLayout frameLayout3 = groupCallPip2.windowRemoveTooltipOverlayView;
            final FrameLayout frameLayout4 = groupCallPip2.alertContainer;
            frameLayout.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (frameLayout.getParent() != null) {
                        frameLayout.setVisibility(8);
                        frameLayout2.setVisibility(8);
                        frameLayout3.setVisibility(8);
                        windowManager.removeView(frameLayout);
                        windowManager.removeView(frameLayout2);
                        windowManager.removeView(frameLayout3);
                        windowManager.removeView(frameLayout4);
                    }
                }
            }).start();
            instance.onDestroy();
            instance = null;
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        }
    }

    private static WindowManager.LayoutParams createWindowLayoutParams(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = AndroidUtilities.dp(105.0f);
        layoutParams.width = AndroidUtilities.dp(105.0f);
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (AndroidUtilities.checkInlinePermissions(context)) {
            if (Build.VERSION.SDK_INT >= 26) {
                layoutParams.type = 2038;
            } else {
                layoutParams.type = 2003;
            }
        } else {
            layoutParams.type = 99;
        }
        layoutParams.flags = 520;
        return layoutParams;
    }

    void showRemoveTooltip(boolean z) {
        if (this.animateToShowRemoveTooltip != z) {
            this.animateToShowRemoveTooltip = z;
            AnimatorSet animatorSet = this.showRemoveAnimator;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.showRemoveAnimator.cancel();
            }
            if (z) {
                if (this.windowRemoveTooltipView.getVisibility() != 0) {
                    this.windowRemoveTooltipView.setVisibility(0);
                    this.removeTooltipView.setAlpha(0.0f);
                    this.removeTooltipView.setScaleX(0.5f);
                    this.removeTooltipView.setScaleY(0.5f);
                    this.deleteIcon.setCurrentFrame(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.showRemoveAnimator = animatorSet2;
                View view = this.removeTooltipView;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 1.0f);
                View view2 = this.removeTooltipView;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_X, view2.getScaleX(), 1.0f);
                View view3 = this.removeTooltipView;
                animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.SCALE_Y, view3.getScaleY(), 1.0f));
                this.showRemoveAnimator.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.showRemoveAnimator = animatorSet3;
            View view4 = this.removeTooltipView;
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view4, (Property<View, Float>) View.ALPHA, view4.getAlpha(), 0.0f);
            View view5 = this.removeTooltipView;
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view5, (Property<View, Float>) View.SCALE_X, view5.getScaleX(), 0.5f);
            View view6 = this.removeTooltipView;
            animatorSet3.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4, ObjectAnimator.ofFloat(view6, (Property<View, Float>) View.SCALE_Y, view6.getScaleY(), 0.5f));
            this.showRemoveAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    GroupCallPip.this.windowRemoveTooltipView.setVisibility(8);
                    GroupCallPip groupCallPip = GroupCallPip.this;
                    groupCallPip.animateToPrepareRemove = false;
                    groupCallPip.prepareToRemoveProgress = 0.0f;
                }
            });
            this.showRemoveAnimator.setDuration(150L);
            this.showRemoveAnimator.start();
        }
    }

    void prepareToRemove(boolean z) {
        if (this.animateToPrepareRemove != z) {
            this.animateToPrepareRemove = z;
            this.removeTooltipView.invalidate();
            if (!this.removed) {
                this.deleteIcon.setCustomEndFrame(z ? 33 : 0);
                this.iconView.playAnimation();
            }
            if (z) {
                try {
                    this.button.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        }
        this.button.prepareToRemove(z);
    }

    void pinnedToCenter(final boolean z) {
        if (this.removed || this.animateToPinnedToCenter == z) {
            return;
        }
        this.animateToPinnedToCenter = z;
        ValueAnimator valueAnimator = this.pinAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.pinAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.pinnedProgress, z ? 1.0f : 0.0f);
        this.pinAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                GroupCallPip.$r8$lambda$CdVOnqvZdoksuNHfZLk7VgkgSvY(this.f$0, valueAnimator2);
            }
        });
        this.pinAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                GroupCallPip groupCallPip = GroupCallPip.this;
                if (groupCallPip.removed) {
                    return;
                }
                groupCallPip.pinnedProgress = z ? 1.0f : 0.0f;
                groupCallPip.button.setPinnedProgress(GroupCallPip.this.pinnedProgress);
                GroupCallPip groupCallPip2 = GroupCallPip.this;
                groupCallPip2.windowView.setScaleX(1.0f - (groupCallPip2.pinnedProgress * 0.6f));
                GroupCallPip groupCallPip3 = GroupCallPip.this;
                groupCallPip3.windowView.setScaleY(1.0f - (groupCallPip3.pinnedProgress * 0.6f));
                GroupCallPip groupCallPip4 = GroupCallPip.this;
                if (groupCallPip4.moving) {
                    groupCallPip4.updateButtonPosition();
                }
            }
        });
        this.pinAnimator.setDuration(250L);
        this.pinAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.pinAnimator.start();
    }

    public static void $r8$lambda$CdVOnqvZdoksuNHfZLk7VgkgSvY(GroupCallPip groupCallPip, ValueAnimator valueAnimator) {
        if (groupCallPip.removed) {
            return;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        groupCallPip.pinnedProgress = fFloatValue;
        groupCallPip.button.setPinnedProgress(fFloatValue);
        groupCallPip.windowView.setScaleX(1.0f - (groupCallPip.pinnedProgress * 0.6f));
        groupCallPip.windowView.setScaleY(1.0f - (groupCallPip.pinnedProgress * 0.6f));
        if (groupCallPip.moving) {
            groupCallPip.updateButtonPosition();
        }
    }

    public void updateButtonPosition() {
        float measuredWidth = ((this.windowLeft - this.windowOffsetLeft) + (this.windowRemoveTooltipView.getMeasuredWidth() / 2.0f)) - (this.windowView.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((this.windowTop - this.windowOffsetTop) + (this.windowRemoveTooltipView.getMeasuredHeight() / 2.0f)) - (this.windowView.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(25.0f);
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        float f = this.windowX;
        float f2 = this.pinnedProgress;
        float f3 = 1.0f - f2;
        layoutParams.x = (int) ((f * f3) + (measuredWidth * f2));
        layoutParams.y = (int) ((this.windowY * f3) + (measuredHeight * f2));
        updateAvatarsPosition();
        if (this.windowView.getParent() != null) {
            this.windowManager.updateViewLayout(this.windowView, this.windowLayoutParams);
        }
    }

    public void updateAvatarsPosition() {
        float fMax = Math.max(this.windowLayoutParams.x, -AndroidUtilities.dp(36.0f));
        int i = AndroidUtilities.displaySize.x;
        float fMin = Math.min(fMax, (i - this.windowView.getMeasuredWidth()) + AndroidUtilities.dp(36.0f));
        if (fMin < 0.0f) {
            this.avatarsImageView.setTranslationX(Math.abs(fMin) / 3.0f);
        } else if (fMin > i - this.windowView.getMeasuredWidth()) {
            this.avatarsImageView.setTranslationX((-Math.abs(fMin - (i - this.windowView.getMeasuredWidth()))) / 3.0f);
        } else {
            this.avatarsImageView.setTranslationX(0.0f);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.groupCallUpdated || i == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            updateAvatars(true);
        } else if (i == NotificationCenter.didEndCall) {
            updateVisibility(ApplicationLoader.applicationContext);
        }
    }

    public void getRelativePosition(float f, float f2, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        float f3 = point.x;
        float f4 = point.y;
        float f5 = -AndroidUtilities.dp(36.0f);
        fArr[0] = (f - f5) / ((f3 - (f5 * 2.0f)) - AndroidUtilities.dp(105.0f));
        fArr[1] = f2 / (f4 - AndroidUtilities.dp(105.0f));
        fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
        fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
    }

    public static void updateVisibility(Context context) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z = (sharedInstance == null || sharedInstance.groupCall == null || sharedInstance.isHangingUp()) ? false : true;
        if (AndroidUtilities.checkInlinePermissions(ApplicationLoader.applicationContext) && z && !forceRemoved && (ApplicationLoader.mainInterfaceStopped || !GroupCallActivity.groupCallUiVisible)) {
            show(context, sharedInstance.getAccount());
            instance.showAvatars(true);
        } else {
            finish();
        }
    }

    private void showAvatars(boolean z) {
        if (z != (this.avatarsImageView.getTag() != null)) {
            this.avatarsImageView.animate().setListener(null).cancel();
            if (z) {
                if (this.avatarsImageView.getVisibility() != 0) {
                    this.avatarsImageView.setVisibility(0);
                    this.avatarsImageView.setAlpha(0.0f);
                    this.avatarsImageView.setScaleX(0.5f);
                    this.avatarsImageView.setScaleY(0.5f);
                }
                this.avatarsImageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                this.avatarsImageView.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        GroupCallPip.this.avatarsImageView.setVisibility(8);
                    }
                }).start();
            }
            this.avatarsImageView.setTag(z ? 1 : null);
        }
    }

    public static void clearForce() {
        forceRemoved = false;
    }

    public static boolean checkInlinePermissions() {
        return Build.VERSION.SDK_INT < 23 || ApplicationLoader.canDrawOverlays;
    }
}
