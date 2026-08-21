package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.Property;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.view.GestureDetectorCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.pip.PipSource;
import org.telegram.messenger.pip.source.IPipSourceDelegate;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.LaunchActivity;
import org.webrtc.RendererCommon;

public class RTMPStreamPipOverlay implements NotificationCenter.NotificationCenterDelegate, IPipSourceDelegate {
    private static final FloatPropertyCompat PIP_X_PROPERTY = new SimpleFloatPropertyCompat("pipX", new SimpleFloatPropertyCompat.Getter() {
        @Override
        public final float get(Object obj) {
            return ((RTMPStreamPipOverlay) obj).pipX;
        }
    }, new SimpleFloatPropertyCompat.Setter() {
        @Override
        public final void set(Object obj, float f) {
            RTMPStreamPipOverlay.$r8$lambda$SCkwudA6M2DrlnqBYPkdXPJuITY((RTMPStreamPipOverlay) obj, f);
        }
    });
    private static final FloatPropertyCompat PIP_Y_PROPERTY = new SimpleFloatPropertyCompat("pipY", new SimpleFloatPropertyCompat.Getter() {
        @Override
        public final float get(Object obj) {
            return ((RTMPStreamPipOverlay) obj).pipY;
        }
    }, new SimpleFloatPropertyCompat.Setter() {
        @Override
        public final void set(Object obj, float f) {
            RTMPStreamPipOverlay.m2993$r8$lambda$_Tk57sOrJpPZZCDoVxB9cVvUIA((RTMPStreamPipOverlay) obj, f);
        }
    });
    private static RTMPStreamPipOverlay instance = new RTMPStreamPipOverlay();
    private AccountInstance accountInstance;
    private Float aspectRatio;
    private BackupImageView avatarImageView;
    private TLRPC.GroupCallParticipant boundParticipant;
    private boolean boundPresentation;
    private View consumingChild;
    private FrameLayout contentFrameLayout;
    private ViewGroup contentView;
    private FrameLayout controlsView;
    private Runnable firstFrameCallback;
    private boolean firstFrameRendered;
    private View flickerView;
    private GestureDetectorCompat gestureDetector;
    private boolean isScrollDisallowed;
    private boolean isScrolling;
    private boolean isShowingControls;
    private boolean isVisible;
    private int pipHeight;
    private PipSource pipSource;
    private VoIPTextureView pipTextureView;
    private int pipWidth;
    private float pipX;
    private SpringAnimation pipXSpring;
    private float pipY;
    private SpringAnimation pipYSpring;
    private boolean postedDismissControls;
    private ValueAnimator scaleAnimator;
    private ScaleGestureDetector scaleGestureDetector;
    private VoIPTextureView textureView;
    private WindowManager.LayoutParams windowLayoutParams;
    private WindowManager windowManager;
    private boolean windowViewSkipRender;
    private float minScaleFactor = 0.6f;
    private float maxScaleFactor = 1.4f;
    private CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable();
    private boolean placeholderShown = true;
    private float scaleFactor = 1.0f;
    private Runnable dismissControlsCallback = new Runnable() {
        @Override
        public final void run() {
            RTMPStreamPipOverlay.m2992$r8$lambda$5hWfXb7hfmxXoOt6eBAHhLIawU(this.f$0);
        }
    };

    @Override
    public boolean pipIsAvailable() {
        return IPipSourceDelegate.CC.$default$pipIsAvailable(this);
    }

    @Override
    public void pipRenderBackground(Canvas canvas) {
        IPipSourceDelegate.CC.$default$pipRenderBackground(this, canvas);
    }

    @Override
    public void pipRenderForeground(Canvas canvas) {
        IPipSourceDelegate.CC.$default$pipRenderForeground(this, canvas);
    }

    public static void $r8$lambda$SCkwudA6M2DrlnqBYPkdXPJuITY(RTMPStreamPipOverlay rTMPStreamPipOverlay, float f) {
        WindowManager.LayoutParams layoutParams = rTMPStreamPipOverlay.windowLayoutParams;
        rTMPStreamPipOverlay.pipX = f;
        layoutParams.x = (int) f;
        AndroidUtilities.updateViewLayout(rTMPStreamPipOverlay.windowManager, rTMPStreamPipOverlay.contentView, layoutParams);
    }

    public static void m2993$r8$lambda$_Tk57sOrJpPZZCDoVxB9cVvUIA(RTMPStreamPipOverlay rTMPStreamPipOverlay, float f) {
        WindowManager.LayoutParams layoutParams = rTMPStreamPipOverlay.windowLayoutParams;
        rTMPStreamPipOverlay.pipY = f;
        layoutParams.y = (int) f;
        AndroidUtilities.updateViewLayout(rTMPStreamPipOverlay.windowManager, rTMPStreamPipOverlay.contentView, layoutParams);
    }

    public static void m2992$r8$lambda$5hWfXb7hfmxXoOt6eBAHhLIawU(RTMPStreamPipOverlay rTMPStreamPipOverlay) {
        rTMPStreamPipOverlay.isShowingControls = false;
        rTMPStreamPipOverlay.toggleControls(false);
        rTMPStreamPipOverlay.postedDismissControls = false;
    }

    public static boolean isVisible() {
        return instance.isVisible;
    }

    public int getSuggestedWidth() {
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

    public int getSuggestedHeight() {
        return (int) (getSuggestedWidth() * getRatio());
    }

    private float getRatio() {
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

    public void toggleControls(boolean z) {
        ValueAnimator duration = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f).setDuration(200L);
        this.scaleAnimator = duration;
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.scaleAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                RTMPStreamPipOverlay.$r8$lambda$S4FhBYX9MsfALb2OCkaS7mqIXGA(this.f$0, valueAnimator);
            }
        });
        this.scaleAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                RTMPStreamPipOverlay.this.scaleAnimator = null;
            }
        });
        this.scaleAnimator.start();
    }

    public static void $r8$lambda$S4FhBYX9MsfALb2OCkaS7mqIXGA(RTMPStreamPipOverlay rTMPStreamPipOverlay, ValueAnimator valueAnimator) {
        rTMPStreamPipOverlay.getClass();
        rTMPStreamPipOverlay.controlsView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static void dismiss() {
        instance.dismissInternal();
    }

    private void dismissInternal() {
        if (this.isVisible) {
            this.isVisible = false;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                }
            }, 100L);
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
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.contentView, (Property<ViewGroup, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.contentView, (Property<ViewGroup, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.contentView, (Property<ViewGroup, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    RTMPStreamPipOverlay.this.windowManager.removeViewImmediate(RTMPStreamPipOverlay.this.contentView);
                    RTMPStreamPipOverlay.this.textureView.renderer.release();
                    RTMPStreamPipOverlay.this.boundParticipant = null;
                    RTMPStreamPipOverlay.this.placeholderShown = true;
                    RTMPStreamPipOverlay.this.firstFrameRendered = false;
                    RTMPStreamPipOverlay.this.consumingChild = null;
                    RTMPStreamPipOverlay.this.isScrolling = false;
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

    public static void show(Activity activity) {
        instance.showInternal(activity);
    }

    private void showInternal(Activity activity) {
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
        this.pipXSpring = new SpringAnimation(this, PIP_X_PROPERTY).setSpring(new SpringForce().setDampingRatio(0.75f).setStiffness(650.0f));
        this.pipYSpring = new SpringAnimation(this, PIP_Y_PROPERTY).setSpring(new SpringForce().setDampingRatio(0.75f).setStiffness(650.0f));
        final Context context = activity != null ? activity : ApplicationLoader.applicationContext;
        final int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new AnonymousClass3());
        this.scaleGestureDetector = scaleGestureDetector;
        int i = Build.VERSION.SDK_INT;
        scaleGestureDetector.setQuickScaleEnabled(false);
        if (i >= 23) {
            this.scaleGestureDetector.setStylusScaleEnabled(false);
        }
        this.gestureDetector = new GestureDetectorCompat(context, new GestureDetector.SimpleOnGestureListener() {
            private float startPipX;
            private float startPipY;

            @Override
            public boolean onDown(MotionEvent motionEvent) {
                if (RTMPStreamPipOverlay.this.isShowingControls) {
                    for (int i2 = 1; i2 < RTMPStreamPipOverlay.this.contentFrameLayout.getChildCount(); i2++) {
                        View childAt = RTMPStreamPipOverlay.this.contentFrameLayout.getChildAt(i2);
                        if (childAt.dispatchTouchEvent(motionEvent)) {
                            RTMPStreamPipOverlay.this.consumingChild = childAt;
                            return true;
                        }
                    }
                }
                this.startPipX = RTMPStreamPipOverlay.this.pipX;
                this.startPipY = RTMPStreamPipOverlay.this.pipY;
                return true;
            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                if (RTMPStreamPipOverlay.this.scaleAnimator != null) {
                    return true;
                }
                if (RTMPStreamPipOverlay.this.postedDismissControls) {
                    AndroidUtilities.cancelRunOnUIThread(RTMPStreamPipOverlay.this.dismissControlsCallback);
                    RTMPStreamPipOverlay.this.postedDismissControls = false;
                }
                RTMPStreamPipOverlay rTMPStreamPipOverlay = RTMPStreamPipOverlay.this;
                rTMPStreamPipOverlay.isShowingControls = !rTMPStreamPipOverlay.isShowingControls;
                RTMPStreamPipOverlay rTMPStreamPipOverlay2 = RTMPStreamPipOverlay.this;
                rTMPStreamPipOverlay2.toggleControls(rTMPStreamPipOverlay2.isShowingControls);
                if (RTMPStreamPipOverlay.this.isShowingControls && !RTMPStreamPipOverlay.this.postedDismissControls) {
                    AndroidUtilities.runOnUIThread(RTMPStreamPipOverlay.this.dismissControlsCallback, 2500L);
                    RTMPStreamPipOverlay.this.postedDismissControls = true;
                }
                return true;
            }

            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!RTMPStreamPipOverlay.this.isScrolling || RTMPStreamPipOverlay.this.isScrollDisallowed) {
                    return false;
                }
                SpringForce spring = ((SpringAnimation) ((SpringAnimation) RTMPStreamPipOverlay.this.pipXSpring.setStartVelocity(f)).setStartValue(RTMPStreamPipOverlay.this.pipX)).getSpring();
                float f3 = RTMPStreamPipOverlay.this.pipX + (RTMPStreamPipOverlay.this.pipWidth / 2.0f) + (f / 7.0f);
                int i2 = AndroidUtilities.displaySize.x;
                spring.setFinalPosition(f3 >= ((float) i2) / 2.0f ? (i2 - RTMPStreamPipOverlay.this.pipWidth) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f));
                RTMPStreamPipOverlay.this.pipXSpring.start();
                ((SpringAnimation) ((SpringAnimation) RTMPStreamPipOverlay.this.pipYSpring.setStartVelocity(f)).setStartValue(RTMPStreamPipOverlay.this.pipY)).getSpring().setFinalPosition(MathUtils.clamp(RTMPStreamPipOverlay.this.pipY + (f2 / 10.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - RTMPStreamPipOverlay.this.pipHeight) - AndroidUtilities.dp(16.0f)));
                RTMPStreamPipOverlay.this.pipYSpring.start();
                return true;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!RTMPStreamPipOverlay.this.isScrolling && RTMPStreamPipOverlay.this.scaleAnimator == null && !RTMPStreamPipOverlay.this.isScrollDisallowed && (Math.abs(f) >= scaledTouchSlop || Math.abs(f2) >= scaledTouchSlop)) {
                    RTMPStreamPipOverlay.this.isScrolling = true;
                    RTMPStreamPipOverlay.this.pipXSpring.cancel();
                    RTMPStreamPipOverlay.this.pipYSpring.cancel();
                }
                if (RTMPStreamPipOverlay.this.isScrolling) {
                    RTMPStreamPipOverlay.this.windowLayoutParams.x = (int) RTMPStreamPipOverlay.this.pipX = (this.startPipX + motionEvent2.getRawX()) - motionEvent.getRawX();
                    RTMPStreamPipOverlay.this.windowLayoutParams.y = (int) RTMPStreamPipOverlay.this.pipY = (this.startPipY + motionEvent2.getRawY()) - motionEvent.getRawY();
                    AndroidUtilities.updateViewLayout(RTMPStreamPipOverlay.this.windowManager, RTMPStreamPipOverlay.this.contentView, RTMPStreamPipOverlay.this.windowLayoutParams);
                }
                return true;
            }
        });
        this.contentFrameLayout = new FrameLayout(context) {
            private Path path = new Path();

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (RTMPStreamPipOverlay.this.consumingChild != null) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(RTMPStreamPipOverlay.this.consumingChild.getX(), RTMPStreamPipOverlay.this.consumingChild.getY());
                    boolean zDispatchTouchEvent = RTMPStreamPipOverlay.this.consumingChild.dispatchTouchEvent(motionEvent);
                    motionEventObtain.recycle();
                    if (action == 1 || action == 3) {
                        RTMPStreamPipOverlay.this.consumingChild = null;
                    }
                    if (zDispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                motionEventObtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean zOnTouchEvent = RTMPStreamPipOverlay.this.scaleGestureDetector.onTouchEvent(motionEventObtain2);
                motionEventObtain2.recycle();
                boolean z = !RTMPStreamPipOverlay.this.scaleGestureDetector.isInProgress() && RTMPStreamPipOverlay.this.gestureDetector.onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    RTMPStreamPipOverlay.this.isScrolling = false;
                    RTMPStreamPipOverlay.this.isScrollDisallowed = false;
                    if (!RTMPStreamPipOverlay.this.pipXSpring.isRunning()) {
                        SpringForce spring = ((SpringAnimation) RTMPStreamPipOverlay.this.pipXSpring.setStartValue(RTMPStreamPipOverlay.this.pipX)).getSpring();
                        float f = RTMPStreamPipOverlay.this.pipX + (RTMPStreamPipOverlay.this.pipWidth / 2.0f);
                        int i2 = AndroidUtilities.displaySize.x;
                        spring.setFinalPosition(f >= ((float) i2) / 2.0f ? (i2 - RTMPStreamPipOverlay.this.pipWidth) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f));
                        RTMPStreamPipOverlay.this.pipXSpring.start();
                    }
                    if (!RTMPStreamPipOverlay.this.pipYSpring.isRunning()) {
                        ((SpringAnimation) RTMPStreamPipOverlay.this.pipYSpring.setStartValue(RTMPStreamPipOverlay.this.pipY)).getSpring().setFinalPosition(MathUtils.clamp(RTMPStreamPipOverlay.this.pipY, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - RTMPStreamPipOverlay.this.pipHeight) - AndroidUtilities.dp(16.0f)));
                        RTMPStreamPipOverlay.this.pipYSpring.start();
                    }
                }
                return zOnTouchEvent || z;
            }

            @Override
            protected void onConfigurationChanged(Configuration configuration) {
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                AndroidUtilities.setPreferredMaxRefreshRate(RTMPStreamPipOverlay.this.windowManager, RTMPStreamPipOverlay.this.contentView, RTMPStreamPipOverlay.this.windowLayoutParams);
                RTMPStreamPipOverlay.this.bindTextureView();
            }

            @Override
            public void draw(Canvas canvas) {
                super.draw(canvas);
            }

            @Override
            protected void onSizeChanged(int i2, int i3, int i4, int i5) {
                super.onSizeChanged(i2, i3, i4, i5);
                this.path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i2, i3);
                this.path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
            }
        };
        ViewGroup viewGroup = new ViewGroup(context) {
            @Override
            protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                if (RTMPStreamPipOverlay.this.contentFrameLayout.getParent() == this) {
                    RTMPStreamPipOverlay.this.contentFrameLayout.layout(0, 0, RTMPStreamPipOverlay.this.pipWidth, RTMPStreamPipOverlay.this.pipHeight);
                }
            }

            @Override
            protected void onMeasure(int i2, int i3) {
                setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
                if (RTMPStreamPipOverlay.this.contentFrameLayout.getParent() == this) {
                    RTMPStreamPipOverlay.this.contentFrameLayout.measure(View.MeasureSpec.makeMeasureSpec(RTMPStreamPipOverlay.this.pipWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(RTMPStreamPipOverlay.this.pipHeight, 1073741824));
                }
            }

            @Override
            public void draw(Canvas canvas) {
                if (RTMPStreamPipOverlay.this.windowViewSkipRender) {
                    return;
                }
                super.draw(canvas);
            }
        };
        this.contentView = viewGroup;
        viewGroup.addView(this.contentFrameLayout, LayoutHelper.createFrame(-1, -1.0f));
        this.contentFrameLayout.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(10.0f));
            }
        });
        this.contentFrameLayout.setClipToOutline(true);
        this.contentFrameLayout.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_actionBar));
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        this.contentFrameLayout.addView(backupImageView, LayoutHelper.createFrame(-1, -1.0f));
        VoIPTextureView voIPTextureView = new VoIPTextureView(context, false, false, false, false);
        this.textureView = voIPTextureView;
        voIPTextureView.setAlpha(0.0f);
        this.textureView.renderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        VoIPTextureView voIPTextureView2 = this.textureView;
        voIPTextureView2.scaleType = VoIPTextureView.SCALE_TYPE_FILL;
        voIPTextureView2.renderer.setRotateTextureWithScreen(true);
        this.textureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new AnonymousClass8());
        this.contentFrameLayout.addView(this.textureView, LayoutHelper.createFrame(-1, -1.0f));
        View view = new View(context) {
            @Override
            protected void onDraw(Canvas canvas) {
                if (getAlpha() == 0.0f) {
                    return;
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                RTMPStreamPipOverlay.this.cellFlickerDrawable.draw(canvas, rectF, AndroidUtilities.dp(10.0f), null);
                invalidate();
            }

            @Override
            protected void onSizeChanged(int i2, int i3, int i4, int i5) {
                super.onSizeChanged(i2, i3, i4, i5);
                RTMPStreamPipOverlay.this.cellFlickerDrawable.setParentWidth(i2);
            }
        };
        this.flickerView = view;
        this.contentFrameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.controlsView = frameLayout;
        frameLayout.setAlpha(0.0f);
        View view2 = new View(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1140850688, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        view2.setBackground(gradientDrawable);
        this.controlsView.addView(view2, LayoutHelper.createFrame(-1, -1.0f));
        int iDp = AndroidUtilities.dp(8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.pip_video_close);
        int i2 = Theme.key_voipgroup_actionBarItems;
        imageView.setColorFilter(Theme.getColor(i2));
        int i3 = Theme.key_listSelector;
        imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(i3)));
        imageView.setPadding(iDp, iDp, iDp, iDp);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                RTMPStreamPipOverlay.dismiss();
            }
        });
        float f = 38;
        float f2 = 4;
        this.controlsView.addView(imageView, LayoutHelper.createFrame(38, f, 5, 0.0f, f2, f2, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.pip_video_expand);
        imageView2.setColorFilter(Theme.getColor(i2));
        imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(i3)));
        imageView2.setPadding(iDp, iDp, iDp, iDp);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                RTMPStreamPipOverlay.m2991$r8$lambda$3rL7lGcqh4hmab5qShhnR274jU(context, view3);
            }
        });
        this.controlsView.addView(imageView2, LayoutHelper.createFrame(38, f, 5, 0.0f, f2, 48, 0.0f));
        this.contentFrameLayout.addView(this.controlsView, LayoutHelper.createFrame(-1, -1.0f));
        this.windowManager = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams layoutParamsCreateWindowLayoutParams = PipUtils.createWindowLayoutParams(context, false);
        this.windowLayoutParams = layoutParamsCreateWindowLayoutParams;
        int i4 = this.pipWidth;
        layoutParamsCreateWindowLayoutParams.width = i4;
        layoutParamsCreateWindowLayoutParams.height = this.pipHeight;
        float fDp = (AndroidUtilities.displaySize.x - i4) - AndroidUtilities.dp(16.0f);
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
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.contentView, (Property<ViewGroup, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.contentView, (Property<ViewGroup, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.contentView, (Property<ViewGroup, Float>) View.SCALE_Y, 1.0f));
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator, boolean z) {
                if (RTMPStreamPipOverlay.this.pipSource != null) {
                    RTMPStreamPipOverlay.this.pipSource.invalidatePosition();
                }
            }
        });
        animatorSet.start();
        bindTextureView();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        PipSource pipSource = this.pipSource;
        if (pipSource != null) {
            pipSource.destroy();
            this.pipSource = null;
        }
        if (activity == null || PipUtils.checkPermissions(activity) != 1) {
            return;
        }
        this.pipSource = new PipSource.Builder(activity, this).setTagPrefix("pip-rtmp-video").setPriority(1).setCornerRadius(AndroidUtilities.dp(10.0f)).setContentView(this.contentView).setPlaceholderView(this.textureView.getPlaceholderView()).build();
    }

    class AnonymousClass3 implements ScaleGestureDetector.OnScaleGestureListener {
        AnonymousClass3() {
        }

        @Override
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            RTMPStreamPipOverlay rTMPStreamPipOverlay = RTMPStreamPipOverlay.this;
            rTMPStreamPipOverlay.scaleFactor = MathUtils.clamp(rTMPStreamPipOverlay.scaleFactor * scaleGestureDetector.getScaleFactor(), RTMPStreamPipOverlay.this.minScaleFactor, RTMPStreamPipOverlay.this.maxScaleFactor);
            RTMPStreamPipOverlay rTMPStreamPipOverlay2 = RTMPStreamPipOverlay.this;
            rTMPStreamPipOverlay2.pipWidth = (int) (rTMPStreamPipOverlay2.getSuggestedWidth() * RTMPStreamPipOverlay.this.scaleFactor);
            RTMPStreamPipOverlay rTMPStreamPipOverlay3 = RTMPStreamPipOverlay.this;
            rTMPStreamPipOverlay3.pipHeight = (int) (rTMPStreamPipOverlay3.getSuggestedHeight() * RTMPStreamPipOverlay.this.scaleFactor);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    RTMPStreamPipOverlay.AnonymousClass3.m2994$r8$lambda$F8PCOTp4wZhD9jX4K2MScoPeUY(this.f$0);
                }
            });
            SpringForce spring = ((SpringAnimation) RTMPStreamPipOverlay.this.pipXSpring.setStartValue(RTMPStreamPipOverlay.this.pipX)).getSpring();
            float focusX = scaleGestureDetector.getFocusX();
            int i = AndroidUtilities.displaySize.x;
            spring.setFinalPosition(focusX >= ((float) i) / 2.0f ? (i - RTMPStreamPipOverlay.this.pipWidth) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f));
            if (!RTMPStreamPipOverlay.this.pipXSpring.isRunning()) {
                RTMPStreamPipOverlay.this.pipXSpring.start();
            }
            ((SpringAnimation) RTMPStreamPipOverlay.this.pipYSpring.setStartValue(RTMPStreamPipOverlay.this.pipY)).getSpring().setFinalPosition(MathUtils.clamp(scaleGestureDetector.getFocusY() - (RTMPStreamPipOverlay.this.pipHeight / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - RTMPStreamPipOverlay.this.pipHeight) - AndroidUtilities.dp(16.0f)));
            if (RTMPStreamPipOverlay.this.pipYSpring.isRunning()) {
                return true;
            }
            RTMPStreamPipOverlay.this.pipYSpring.start();
            return true;
        }

        public static void m2994$r8$lambda$F8PCOTp4wZhD9jX4K2MScoPeUY(AnonymousClass3 anonymousClass3) {
            RTMPStreamPipOverlay.this.contentFrameLayout.invalidate();
            if (RTMPStreamPipOverlay.this.contentFrameLayout.isInLayout()) {
                return;
            }
            RTMPStreamPipOverlay.this.contentFrameLayout.requestLayout();
            RTMPStreamPipOverlay.this.contentView.requestLayout();
            RTMPStreamPipOverlay.this.textureView.requestLayout();
        }

        @Override
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            if (RTMPStreamPipOverlay.this.isScrolling) {
                RTMPStreamPipOverlay.this.isScrolling = false;
            }
            RTMPStreamPipOverlay.this.isScrollDisallowed = true;
            RTMPStreamPipOverlay.this.windowLayoutParams.width = (int) (RTMPStreamPipOverlay.this.getSuggestedWidth() * RTMPStreamPipOverlay.this.maxScaleFactor);
            RTMPStreamPipOverlay.this.windowLayoutParams.height = (int) (RTMPStreamPipOverlay.this.getSuggestedHeight() * RTMPStreamPipOverlay.this.maxScaleFactor);
            AndroidUtilities.updateViewLayout(RTMPStreamPipOverlay.this.windowManager, RTMPStreamPipOverlay.this.contentView, RTMPStreamPipOverlay.this.windowLayoutParams);
            return true;
        }

        @Override
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            if (RTMPStreamPipOverlay.this.pipXSpring.isRunning() || RTMPStreamPipOverlay.this.pipYSpring.isRunning()) {
                final ArrayList arrayList = new ArrayList();
                DynamicAnimation.OnAnimationEndListener onAnimationEndListener = new DynamicAnimation.OnAnimationEndListener() {
                    @Override
                    public void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                        dynamicAnimation.removeEndListener(this);
                        arrayList.add((SpringAnimation) dynamicAnimation);
                        if (arrayList.size() == 2) {
                            AnonymousClass3.this.updateLayout();
                        }
                    }
                };
                if (!RTMPStreamPipOverlay.this.pipXSpring.isRunning()) {
                    arrayList.add(RTMPStreamPipOverlay.this.pipXSpring);
                } else {
                    RTMPStreamPipOverlay.this.pipXSpring.addEndListener(onAnimationEndListener);
                }
                if (!RTMPStreamPipOverlay.this.pipYSpring.isRunning()) {
                    arrayList.add(RTMPStreamPipOverlay.this.pipYSpring);
                    return;
                } else {
                    RTMPStreamPipOverlay.this.pipYSpring.addEndListener(onAnimationEndListener);
                    return;
                }
            }
            updateLayout();
        }

        public void updateLayout() {
            RTMPStreamPipOverlay rTMPStreamPipOverlay = RTMPStreamPipOverlay.this;
            WindowManager.LayoutParams layoutParams = rTMPStreamPipOverlay.windowLayoutParams;
            int suggestedWidth = (int) (RTMPStreamPipOverlay.this.getSuggestedWidth() * RTMPStreamPipOverlay.this.scaleFactor);
            layoutParams.width = suggestedWidth;
            rTMPStreamPipOverlay.pipWidth = suggestedWidth;
            RTMPStreamPipOverlay rTMPStreamPipOverlay2 = RTMPStreamPipOverlay.this;
            WindowManager.LayoutParams layoutParams2 = rTMPStreamPipOverlay2.windowLayoutParams;
            int suggestedHeight = (int) (RTMPStreamPipOverlay.this.getSuggestedHeight() * RTMPStreamPipOverlay.this.scaleFactor);
            layoutParams2.height = suggestedHeight;
            rTMPStreamPipOverlay2.pipHeight = suggestedHeight;
            AndroidUtilities.updateViewLayout(RTMPStreamPipOverlay.this.windowManager, RTMPStreamPipOverlay.this.contentView, RTMPStreamPipOverlay.this.windowLayoutParams);
        }
    }

    class AnonymousClass8 implements RendererCommon.RendererEvents {
        AnonymousClass8() {
        }

        @Override
        public void onFirstFrameRendered() {
            RTMPStreamPipOverlay.this.firstFrameRendered = true;
            if (RTMPStreamPipOverlay.this.firstFrameCallback != null) {
                RTMPStreamPipOverlay.this.firstFrameCallback.run();
                RTMPStreamPipOverlay.this.firstFrameCallback = null;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    RTMPStreamPipOverlay.this.bindTextureView();
                }
            });
        }

        @Override
        public void onFrameResolutionChanged(final int i, final int i2, int i3) {
            if ((i3 / 90) % 2 == 0) {
                RTMPStreamPipOverlay.this.aspectRatio = Float.valueOf(i2 / i);
            } else {
                RTMPStreamPipOverlay.this.aspectRatio = Float.valueOf(i / i2);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    RTMPStreamPipOverlay.AnonymousClass8.m2995$r8$lambda$qKtX04EN3wby1G8XylIMoAAemY(this.f$0, i, i2);
                }
            });
        }

        public static void m2995$r8$lambda$qKtX04EN3wby1G8XylIMoAAemY(AnonymousClass8 anonymousClass8, int i, int i2) {
            if (RTMPStreamPipOverlay.this.pipSource != null) {
                RTMPStreamPipOverlay.this.pipSource.setContentRatio(i, i2);
            }
            RTMPStreamPipOverlay.this.bindTextureView();
        }
    }

    public static void m2991$r8$lambda$3rL7lGcqh4hmab5qShhnR274jU(Context context, View view) {
        if (VoIPService.getSharedInstance() != null) {
            Intent action = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_chat");
            action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
            if (!(context instanceof Activity)) {
                action.addFlags(268435456);
            }
            context.startActivity(action);
            dismiss();
        }
    }

    public void bindTextureView() {
        bindTextureView(false);
    }

    private void bindTextureView(boolean z) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        boolean z2 = true;
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
                    int colorForId = user != null ? AvatarDrawable.getColorForId(user.id) : ColorUtils.blendARGB(-16777216, -1, 0.2f);
                    this.avatarImageView.getImageReceiver().setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{ColorUtils.blendARGB(colorForId, -16777216, 0.2f), ColorUtils.blendARGB(colorForId, -16777216, 0.4f)}), null, user, 0);
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                    ImageLocation forChat = ImageLocation.getForChat(accountInstance.getCurrentAccount(), chat, 1);
                    int colorForId2 = chat != null ? AvatarDrawable.getColorForId(chat.id) : ColorUtils.blendARGB(-16777216, -1, 0.2f);
                    this.avatarImageView.getImageReceiver().setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{ColorUtils.blendARGB(colorForId2, -16777216, 0.2f), ColorUtils.blendARGB(colorForId2, -16777216, 0.4f)}), null, chat, 0);
                }
                this.boundParticipant = groupCallParticipant3;
            }
        } else if (this.boundParticipant != null) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(this.boundParticipant, false);
            }
            this.boundParticipant = null;
        }
        if (this.firstFrameRendered && (groupCallParticipant = this.boundParticipant) != null && (((tL_groupCallParticipantVideo = groupCallParticipant.video) != null || groupCallParticipant.presentation != null) && ((tL_groupCallParticipantVideo == null || !tL_groupCallParticipantVideo.paused) && ((tL_groupCallParticipantVideo2 = groupCallParticipant.presentation) == null || !tL_groupCallParticipantVideo2.paused)))) {
            z2 = false;
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
        SpringForce spring = ((SpringAnimation) this.pipXSpring.setStartValue(this.pipX)).getSpring();
        float suggestedWidth2 = this.pipX + ((getSuggestedWidth() * this.scaleFactor) / 2.0f);
        float f = AndroidUtilities.displaySize.x;
        spring.setFinalPosition(suggestedWidth2 >= f / 2.0f ? (f - (getSuggestedWidth() * this.scaleFactor)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f));
        this.pipXSpring.start();
        ((SpringAnimation) this.pipYSpring.setStartValue(this.pipY)).getSpring().setFinalPosition(MathUtils.clamp(this.pipY, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (getSuggestedHeight() * this.scaleFactor)) - AndroidUtilities.dp(16.0f)));
        this.pipYSpring.start();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didEndCall) {
            dismiss();
        } else if (i == NotificationCenter.groupCallUpdated) {
            bindTextureView();
        }
    }

    @Override
    public Bitmap pipCreatePrimaryWindowViewBitmap() {
        VoIPTextureView voIPTextureView = this.textureView;
        if (voIPTextureView == null || !voIPTextureView.renderer.isAvailable()) {
            return null;
        }
        return this.textureView.renderer.getBitmap();
    }

    @Override
    public View pipCreatePictureInPictureView() {
        VoIPTextureView voIPTextureView = new VoIPTextureView(this.textureView.getContext(), false, false, false, false);
        this.pipTextureView = voIPTextureView;
        voIPTextureView.renderer.setOpaque(false);
        this.pipTextureView.renderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        VoIPTextureView voIPTextureView2 = this.pipTextureView;
        voIPTextureView2.scaleType = VoIPTextureView.SCALE_TYPE_FILL;
        voIPTextureView2.renderer.setRotateTextureWithScreen(true);
        this.pipTextureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new RendererCommon.RendererEvents() {
            @Override
            public void onFrameResolutionChanged(int i, int i2, int i3) {
            }

            @Override
            public void onFirstFrameRendered() {
                if (RTMPStreamPipOverlay.this.firstFrameCallback != null) {
                    RTMPStreamPipOverlay.this.firstFrameCallback.run();
                    RTMPStreamPipOverlay.this.firstFrameCallback = null;
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
        PipSource pipSource = this.pipSource;
        if (pipSource != null && pipSource.params.isValid()) {
            WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
            int width = this.pipSource.params.getWidth();
            this.pipWidth = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.windowLayoutParams;
            int height = this.pipSource.params.getHeight();
            this.pipHeight = height;
            layoutParams2.height = height;
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
}
