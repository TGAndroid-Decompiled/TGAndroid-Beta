package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
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
import androidx.core.math.MathUtils;
import androidx.core.view.GestureDetectorCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.pip.PipSource;
import org.telegram.messenger.pip.source.IPipSourceDelegate;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.LiveStoryPipOverlay;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.LivePlayerView;

public class LiveStoryPipOverlay implements NotificationCenter.NotificationCenterDelegate, IPipSourceDelegate {
    private static final FloatPropertyCompat PIP_X_PROPERTY = new SimpleFloatPropertyCompat("pipX", new SimpleFloatPropertyCompat.Getter() {
        @Override
        public final float get(Object obj) {
            float f;
            f = ((LiveStoryPipOverlay) obj).pipX;
            return f;
        }
    }, new SimpleFloatPropertyCompat.Setter() {
        @Override
        public final void set(Object obj, float f) {
            LiveStoryPipOverlay.lambda$static$1((LiveStoryPipOverlay) obj, f);
        }
    });
    private static final FloatPropertyCompat PIP_Y_PROPERTY = new SimpleFloatPropertyCompat("pipY", new SimpleFloatPropertyCompat.Getter() {
        @Override
        public final float get(Object obj) {
            float f;
            f = ((LiveStoryPipOverlay) obj).pipY;
            return f;
        }
    }, new SimpleFloatPropertyCompat.Setter() {
        @Override
        public final void set(Object obj, float f) {
            LiveStoryPipOverlay.lambda$static$3((LiveStoryPipOverlay) obj, f);
        }
    });
    private static LiveStoryPipOverlay instance = new LiveStoryPipOverlay();
    private Float aspectRatio;
    private BackupImageView avatarImageView;
    private View consumingChild;
    private FrameLayout contentFrameLayout;
    private ViewGroup contentView;
    private FrameLayout controlsView;
    private int currentAccount;
    private Runnable firstFrameCallback;
    private boolean firstFrameRendered;
    private View flickerView;
    private GestureDetectorCompat gestureDetector;
    private boolean isScrollDisallowed;
    private boolean isScrolling;
    private boolean isShowingControls;
    private boolean isVisible;
    private LivePlayer livePlayer;
    private int pipHeight;
    private PipSource pipSource;
    private LivePlayerView pipTextureView;
    private int pipWidth;
    private float pipX;
    private SpringAnimation pipXSpring;
    private float pipY;
    private SpringAnimation pipYSpring;
    private boolean postedDismissControls;
    private ValueAnimator scaleAnimator;
    private ScaleGestureDetector scaleGestureDetector;
    private LivePlayerView textureView;
    private WindowManager.LayoutParams windowLayoutParams;
    private WindowManager windowManager;
    private boolean windowViewSkipRender;
    private float minScaleFactor = 0.6f;
    private float maxScaleFactor = 1.4f;
    private boolean placeholderShown = true;
    private float scaleFactor = 1.0f;
    private Runnable dismissControlsCallback = new Runnable() {
        @Override
        public final void run() {
            LiveStoryPipOverlay.this.lambda$new$4();
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

    public static void lambda$static$1(LiveStoryPipOverlay liveStoryPipOverlay, float f) {
        WindowManager.LayoutParams layoutParams = liveStoryPipOverlay.windowLayoutParams;
        liveStoryPipOverlay.pipX = f;
        layoutParams.x = (int) f;
        AndroidUtilities.updateViewLayout(liveStoryPipOverlay.windowManager, liveStoryPipOverlay.contentView, layoutParams);
    }

    public static void lambda$static$3(LiveStoryPipOverlay liveStoryPipOverlay, float f) {
        WindowManager.LayoutParams layoutParams = liveStoryPipOverlay.windowLayoutParams;
        liveStoryPipOverlay.pipY = f;
        layoutParams.y = (int) f;
        AndroidUtilities.updateViewLayout(liveStoryPipOverlay.windowManager, liveStoryPipOverlay.contentView, layoutParams);
    }

    public void lambda$new$4() {
        this.isShowingControls = false;
        toggleControls(false);
        this.postedDismissControls = false;
    }

    public static boolean isVisible() {
        return instance.isVisible;
    }

    public static boolean isVisible(LivePlayer livePlayer) {
        LiveStoryPipOverlay liveStoryPipOverlay = instance;
        return liveStoryPipOverlay.isVisible && liveStoryPipOverlay.livePlayer == livePlayer;
    }

    public static LivePlayer getLivePlayer() {
        return instance.livePlayer;
    }

    public static LivePlayer takeLivePlayer() {
        LiveStoryPipOverlay liveStoryPipOverlay = instance;
        LivePlayer livePlayer = liveStoryPipOverlay.livePlayer;
        liveStoryPipOverlay.livePlayer = null;
        return livePlayer;
    }

    public int getSuggestedWidth() {
        float min;
        float f;
        if (getRatio() >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            min = Math.min(point2.x, point2.y);
            f = 0.6f;
        }
        return (int) (min * f);
    }

    public int getSuggestedHeight() {
        return (int) (getSuggestedWidth() * getRatio());
    }

    private float getRatio() {
        if (this.aspectRatio == null) {
            this.aspectRatio = Float.valueOf(1.7777778f);
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
                LiveStoryPipOverlay.this.lambda$toggleControls$5(valueAnimator);
            }
        });
        this.scaleAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                LiveStoryPipOverlay.this.scaleAnimator = null;
            }
        });
        this.scaleAnimator.start();
    }

    public void lambda$toggleControls$5(ValueAnimator valueAnimator) {
        this.controlsView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static void dismiss() {
        instance.dismissInternal(true);
    }

    public static void dismiss(boolean z) {
        instance.dismissInternal(z);
    }

    private void dismissInternal(final boolean z) {
        if (this.isVisible) {
            this.isVisible = false;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LiveStoryPipOverlay.lambda$dismissInternal$6();
                }
            }, 100L);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.liveStoryUpdated);
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
                    LiveStoryPipOverlay.this.windowManager.removeViewImmediate(LiveStoryPipOverlay.this.contentView);
                    LiveStoryPipOverlay.this.textureView.release();
                    if (z && LiveStoryPipOverlay.this.livePlayer != null && LiveStoryPipOverlay.this.livePlayer != LivePlayer.recording) {
                        LiveStoryPipOverlay.this.livePlayer.destroy();
                    }
                    LiveStoryPipOverlay.this.livePlayer = null;
                    LiveStoryPipOverlay.this.placeholderShown = true;
                    LiveStoryPipOverlay.this.firstFrameRendered = false;
                    LiveStoryPipOverlay.this.consumingChild = null;
                    LiveStoryPipOverlay.this.isScrolling = false;
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

    public static void lambda$dismissInternal$6() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
    }

    public static void show(Activity activity, LivePlayer livePlayer) {
        instance.showInternal(activity, livePlayer);
    }

    private void showInternal(Activity activity, final LivePlayer livePlayer) {
        if (livePlayer == null || this.isVisible) {
            return;
        }
        this.isVisible = true;
        this.livePlayer = livePlayer;
        int i = livePlayer.currentAccount;
        this.currentAccount = i;
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.liveStoryUpdated);
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
        int i2 = Build.VERSION.SDK_INT;
        scaleGestureDetector.setQuickScaleEnabled(false);
        if (i2 >= 23) {
            this.scaleGestureDetector.setStylusScaleEnabled(false);
        }
        this.gestureDetector = new GestureDetectorCompat(context, new GestureDetector.SimpleOnGestureListener() {
            private float startPipX;
            private float startPipY;

            @Override
            public boolean onDown(MotionEvent motionEvent) {
                if (LiveStoryPipOverlay.this.isShowingControls) {
                    for (int i3 = 1; i3 < LiveStoryPipOverlay.this.contentFrameLayout.getChildCount(); i3++) {
                        View childAt = LiveStoryPipOverlay.this.contentFrameLayout.getChildAt(i3);
                        if (childAt.dispatchTouchEvent(motionEvent)) {
                            LiveStoryPipOverlay.this.consumingChild = childAt;
                            return true;
                        }
                    }
                }
                this.startPipX = LiveStoryPipOverlay.this.pipX;
                this.startPipY = LiveStoryPipOverlay.this.pipY;
                return true;
            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                if (LiveStoryPipOverlay.this.scaleAnimator != null) {
                    return true;
                }
                if (LiveStoryPipOverlay.this.postedDismissControls) {
                    AndroidUtilities.cancelRunOnUIThread(LiveStoryPipOverlay.this.dismissControlsCallback);
                    LiveStoryPipOverlay.this.postedDismissControls = false;
                }
                LiveStoryPipOverlay.this.isShowingControls = !r4.isShowingControls;
                LiveStoryPipOverlay liveStoryPipOverlay = LiveStoryPipOverlay.this;
                liveStoryPipOverlay.toggleControls(liveStoryPipOverlay.isShowingControls);
                if (LiveStoryPipOverlay.this.isShowingControls && !LiveStoryPipOverlay.this.postedDismissControls) {
                    AndroidUtilities.runOnUIThread(LiveStoryPipOverlay.this.dismissControlsCallback, 2500L);
                    LiveStoryPipOverlay.this.postedDismissControls = true;
                }
                return true;
            }

            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!LiveStoryPipOverlay.this.isScrolling || LiveStoryPipOverlay.this.isScrollDisallowed) {
                    return false;
                }
                ((SpringAnimation) ((SpringAnimation) LiveStoryPipOverlay.this.pipXSpring.setStartVelocity(f)).setStartValue(LiveStoryPipOverlay.this.pipX)).getSpring().setFinalPosition((LiveStoryPipOverlay.this.pipX + (LiveStoryPipOverlay.this.pipWidth / 2.0f)) + (f / 7.0f) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r0 - LiveStoryPipOverlay.this.pipWidth) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f));
                LiveStoryPipOverlay.this.pipXSpring.start();
                ((SpringAnimation) ((SpringAnimation) LiveStoryPipOverlay.this.pipYSpring.setStartVelocity(f)).setStartValue(LiveStoryPipOverlay.this.pipY)).getSpring().setFinalPosition(MathUtils.clamp(LiveStoryPipOverlay.this.pipY + (f2 / 10.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - LiveStoryPipOverlay.this.pipHeight) - AndroidUtilities.dp(16.0f)));
                LiveStoryPipOverlay.this.pipYSpring.start();
                return true;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!LiveStoryPipOverlay.this.isScrolling && LiveStoryPipOverlay.this.scaleAnimator == null && !LiveStoryPipOverlay.this.isScrollDisallowed && (Math.abs(f) >= scaledTouchSlop || Math.abs(f2) >= scaledTouchSlop)) {
                    LiveStoryPipOverlay.this.isScrolling = true;
                    LiveStoryPipOverlay.this.pipXSpring.cancel();
                    LiveStoryPipOverlay.this.pipYSpring.cancel();
                }
                if (LiveStoryPipOverlay.this.isScrolling) {
                    LiveStoryPipOverlay.this.windowLayoutParams.x = (int) LiveStoryPipOverlay.this.pipX = (this.startPipX + motionEvent2.getRawX()) - motionEvent.getRawX();
                    LiveStoryPipOverlay.this.windowLayoutParams.y = (int) LiveStoryPipOverlay.this.pipY = (this.startPipY + motionEvent2.getRawY()) - motionEvent.getRawY();
                    AndroidUtilities.updateViewLayout(LiveStoryPipOverlay.this.windowManager, LiveStoryPipOverlay.this.contentView, LiveStoryPipOverlay.this.windowLayoutParams);
                }
                return true;
            }
        });
        this.contentFrameLayout = new FrameLayout(context) {
            private Path path = new Path();

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (LiveStoryPipOverlay.this.consumingChild != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(LiveStoryPipOverlay.this.consumingChild.getX(), LiveStoryPipOverlay.this.consumingChild.getY());
                    boolean dispatchTouchEvent = LiveStoryPipOverlay.this.consumingChild.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        LiveStoryPipOverlay.this.consumingChild = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = LiveStoryPipOverlay.this.scaleGestureDetector.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z = !LiveStoryPipOverlay.this.scaleGestureDetector.isInProgress() && LiveStoryPipOverlay.this.gestureDetector.onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    LiveStoryPipOverlay.this.isScrolling = false;
                    LiveStoryPipOverlay.this.isScrollDisallowed = false;
                    if (!LiveStoryPipOverlay.this.pipXSpring.isRunning()) {
                        ((SpringAnimation) LiveStoryPipOverlay.this.pipXSpring.setStartValue(LiveStoryPipOverlay.this.pipX)).getSpring().setFinalPosition(LiveStoryPipOverlay.this.pipX + (LiveStoryPipOverlay.this.pipWidth / 2.0f) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r6 - LiveStoryPipOverlay.this.pipWidth) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f));
                        LiveStoryPipOverlay.this.pipXSpring.start();
                    }
                    if (!LiveStoryPipOverlay.this.pipYSpring.isRunning()) {
                        ((SpringAnimation) LiveStoryPipOverlay.this.pipYSpring.setStartValue(LiveStoryPipOverlay.this.pipY)).getSpring().setFinalPosition(MathUtils.clamp(LiveStoryPipOverlay.this.pipY, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - LiveStoryPipOverlay.this.pipHeight) - AndroidUtilities.dp(16.0f)));
                        LiveStoryPipOverlay.this.pipYSpring.start();
                    }
                }
                return onTouchEvent || z;
            }

            @Override
            protected void onConfigurationChanged(Configuration configuration) {
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                AndroidUtilities.setPreferredMaxRefreshRate(LiveStoryPipOverlay.this.windowManager, LiveStoryPipOverlay.this.contentView, LiveStoryPipOverlay.this.windowLayoutParams);
                LiveStoryPipOverlay.this.bindTextureView();
            }

            @Override
            public void draw(Canvas canvas) {
                super.draw(canvas);
            }

            @Override
            protected void onSizeChanged(int i3, int i4, int i5, int i6) {
                super.onSizeChanged(i3, i4, i5, i6);
                this.path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i3, i4);
                this.path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
            }
        };
        ViewGroup viewGroup = new ViewGroup(context) {
            @Override
            protected void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                if (LiveStoryPipOverlay.this.contentFrameLayout.getParent() == this) {
                    LiveStoryPipOverlay.this.contentFrameLayout.layout(0, 0, LiveStoryPipOverlay.this.pipWidth, LiveStoryPipOverlay.this.pipHeight);
                }
            }

            @Override
            protected void onMeasure(int i3, int i4) {
                setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i4));
                if (LiveStoryPipOverlay.this.contentFrameLayout.getParent() == this) {
                    LiveStoryPipOverlay.this.contentFrameLayout.measure(View.MeasureSpec.makeMeasureSpec(LiveStoryPipOverlay.this.pipWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(LiveStoryPipOverlay.this.pipHeight, 1073741824));
                }
            }

            @Override
            public void draw(Canvas canvas) {
                if (LiveStoryPipOverlay.this.windowViewSkipRender) {
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
        LivePlayerView livePlayerView = new LivePlayerView(context, this.currentAccount, false);
        this.textureView = livePlayerView;
        livePlayerView.setAlpha(0.0f);
        this.contentFrameLayout.addView(this.textureView, LayoutHelper.createFrame(-1, -1.0f));
        View view = new View(context) {
            @Override
            protected void onDraw(Canvas canvas) {
                if (getAlpha() == 0.0f) {
                    return;
                }
                AndroidUtilities.rectTmp.set(0.0f, 0.0f, getWidth(), getHeight());
                invalidate();
            }

            @Override
            protected void onSizeChanged(int i3, int i4, int i5, int i6) {
                super.onSizeChanged(i3, i4, i5, i6);
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
        int dp = AndroidUtilities.dp(8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.pip_video_close);
        int i3 = Theme.key_voipgroup_actionBarItems;
        imageView.setColorFilter(Theme.getColor(i3));
        int i4 = Theme.key_listSelector;
        imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(i4)));
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                LiveStoryPipOverlay.dismiss();
            }
        });
        float f = 38;
        float f2 = 4;
        this.controlsView.addView(imageView, LayoutHelper.createFrame(38, f, 5, 0.0f, f2, f2, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.pip_video_expand);
        imageView2.setColorFilter(Theme.getColor(i3));
        imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(i4)));
        imageView2.setPadding(dp, dp, dp, dp);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                LiveStoryPipOverlay.this.lambda$showInternal$8(livePlayer, context, view3);
            }
        });
        this.controlsView.addView(imageView2, LayoutHelper.createFrame(38, f, 5, 0.0f, f2, 48, 0.0f));
        this.contentFrameLayout.addView(this.controlsView, LayoutHelper.createFrame(-1, -1.0f));
        this.windowManager = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams createWindowLayoutParams = PipUtils.createWindowLayoutParams(context, false);
        this.windowLayoutParams = createWindowLayoutParams;
        int i5 = this.pipWidth;
        createWindowLayoutParams.width = i5;
        createWindowLayoutParams.height = this.pipHeight;
        float dp2 = (AndroidUtilities.displaySize.x - i5) - AndroidUtilities.dp(16.0f);
        this.pipX = dp2;
        createWindowLayoutParams.x = (int) dp2;
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        float dp3 = (AndroidUtilities.displaySize.y - this.pipHeight) - AndroidUtilities.dp(16.0f);
        this.pipY = dp3;
        layoutParams.y = (int) dp3;
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
                if (LiveStoryPipOverlay.this.pipSource != null) {
                    LiveStoryPipOverlay.this.pipSource.invalidatePosition();
                }
            }
        });
        animatorSet.start();
        bindTextureView();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        PipSource pipSource = this.pipSource;
        if (pipSource != null) {
            pipSource.destroy();
            this.pipSource = null;
        }
        if (activity == null || PipUtils.checkPermissions(activity) != 1) {
            return;
        }
        this.pipSource = new PipSource.Builder(activity, this).setTagPrefix("pip-live-story").setPriority(1).setCornerRadius(AndroidUtilities.dp(10.0f)).setContentView(this.contentView).setPlaceholderView(this.textureView.getPlaceholderView()).build();
    }

    public class AnonymousClass3 implements ScaleGestureDetector.OnScaleGestureListener {
        AnonymousClass3() {
        }

        @Override
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            LiveStoryPipOverlay liveStoryPipOverlay = LiveStoryPipOverlay.this;
            liveStoryPipOverlay.scaleFactor = MathUtils.clamp(liveStoryPipOverlay.scaleFactor * scaleGestureDetector.getScaleFactor(), LiveStoryPipOverlay.this.minScaleFactor, LiveStoryPipOverlay.this.maxScaleFactor);
            LiveStoryPipOverlay.this.pipWidth = (int) (r0.getSuggestedWidth() * LiveStoryPipOverlay.this.scaleFactor);
            LiveStoryPipOverlay.this.pipHeight = (int) (r0.getSuggestedHeight() * LiveStoryPipOverlay.this.scaleFactor);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LiveStoryPipOverlay.AnonymousClass3.this.lambda$onScale$0();
                }
            });
            ((SpringAnimation) LiveStoryPipOverlay.this.pipXSpring.setStartValue(LiveStoryPipOverlay.this.pipX)).getSpring().setFinalPosition(scaleGestureDetector.getFocusX() >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - LiveStoryPipOverlay.this.pipWidth) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f));
            if (!LiveStoryPipOverlay.this.pipXSpring.isRunning()) {
                LiveStoryPipOverlay.this.pipXSpring.start();
            }
            ((SpringAnimation) LiveStoryPipOverlay.this.pipYSpring.setStartValue(LiveStoryPipOverlay.this.pipY)).getSpring().setFinalPosition(MathUtils.clamp(scaleGestureDetector.getFocusY() - (LiveStoryPipOverlay.this.pipHeight / 2.0f), AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - LiveStoryPipOverlay.this.pipHeight) - AndroidUtilities.dp(16.0f)));
            if (LiveStoryPipOverlay.this.pipYSpring.isRunning()) {
                return true;
            }
            LiveStoryPipOverlay.this.pipYSpring.start();
            return true;
        }

        public void lambda$onScale$0() {
            LiveStoryPipOverlay.this.contentFrameLayout.invalidate();
            if (LiveStoryPipOverlay.this.contentFrameLayout.isInLayout()) {
                return;
            }
            LiveStoryPipOverlay.this.contentFrameLayout.requestLayout();
            LiveStoryPipOverlay.this.contentView.requestLayout();
            LiveStoryPipOverlay.this.textureView.requestLayout();
        }

        @Override
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            if (LiveStoryPipOverlay.this.isScrolling) {
                LiveStoryPipOverlay.this.isScrolling = false;
            }
            LiveStoryPipOverlay.this.isScrollDisallowed = true;
            LiveStoryPipOverlay.this.windowLayoutParams.width = (int) (LiveStoryPipOverlay.this.getSuggestedWidth() * LiveStoryPipOverlay.this.maxScaleFactor);
            LiveStoryPipOverlay.this.windowLayoutParams.height = (int) (LiveStoryPipOverlay.this.getSuggestedHeight() * LiveStoryPipOverlay.this.maxScaleFactor);
            AndroidUtilities.updateViewLayout(LiveStoryPipOverlay.this.windowManager, LiveStoryPipOverlay.this.contentView, LiveStoryPipOverlay.this.windowLayoutParams);
            return true;
        }

        @Override
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            if (LiveStoryPipOverlay.this.pipXSpring.isRunning() || LiveStoryPipOverlay.this.pipYSpring.isRunning()) {
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
                if (!LiveStoryPipOverlay.this.pipXSpring.isRunning()) {
                    arrayList.add(LiveStoryPipOverlay.this.pipXSpring);
                } else {
                    LiveStoryPipOverlay.this.pipXSpring.addEndListener(onAnimationEndListener);
                }
                if (!LiveStoryPipOverlay.this.pipYSpring.isRunning()) {
                    arrayList.add(LiveStoryPipOverlay.this.pipYSpring);
                    return;
                } else {
                    LiveStoryPipOverlay.this.pipYSpring.addEndListener(onAnimationEndListener);
                    return;
                }
            }
            updateLayout();
        }

        public void updateLayout() {
            LiveStoryPipOverlay liveStoryPipOverlay = LiveStoryPipOverlay.this;
            WindowManager.LayoutParams layoutParams = liveStoryPipOverlay.windowLayoutParams;
            int suggestedWidth = (int) (LiveStoryPipOverlay.this.getSuggestedWidth() * LiveStoryPipOverlay.this.scaleFactor);
            layoutParams.width = suggestedWidth;
            liveStoryPipOverlay.pipWidth = suggestedWidth;
            LiveStoryPipOverlay liveStoryPipOverlay2 = LiveStoryPipOverlay.this;
            WindowManager.LayoutParams layoutParams2 = liveStoryPipOverlay2.windowLayoutParams;
            int suggestedHeight = (int) (LiveStoryPipOverlay.this.getSuggestedHeight() * LiveStoryPipOverlay.this.scaleFactor);
            layoutParams2.height = suggestedHeight;
            liveStoryPipOverlay2.pipHeight = suggestedHeight;
            AndroidUtilities.updateViewLayout(LiveStoryPipOverlay.this.windowManager, LiveStoryPipOverlay.this.contentView, LiveStoryPipOverlay.this.windowLayoutParams);
        }
    }

    public void lambda$showInternal$8(LivePlayer livePlayer, Context context, View view) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null || livePlayer == null) {
            return;
        }
        safeLastFragment.getOrCreateStoryViewer().open(this.currentAccount, context, MessagesController.getInstance(this.currentAccount).getStoriesController().findStory(livePlayer.dialogId, livePlayer.storyId), (StoryViewer.PlaceProvider) null);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LiveStoryPipOverlay.dismiss();
            }
        }, 200L);
    }

    public void bindTextureView() {
        bindTextureView(false);
    }

    private void bindTextureView(boolean z) {
        LivePlayer livePlayer = this.livePlayer;
        if (livePlayer != null) {
            livePlayer.setVolume(1.0f);
            LivePlayerView livePlayerView = this.pipTextureView;
            if (livePlayerView != null) {
                this.livePlayer.setDisplaySink(livePlayerView.getSink());
            } else {
                this.livePlayer.setDisplaySink(this.textureView.getSink());
            }
        }
        if (this.placeholderShown) {
            this.flickerView.animate().cancel();
            ViewPropertyAnimator duration = this.flickerView.animate().alpha(0.0f).setDuration(150L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            this.avatarImageView.animate().cancel();
            this.avatarImageView.animate().alpha(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.textureView.animate().cancel();
            this.textureView.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
            this.placeholderShown = false;
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
        LivePlayerView livePlayerView = this.textureView;
        if (livePlayerView == null || !livePlayerView.isAvailable()) {
            return null;
        }
        return this.textureView.getBitmap();
    }

    @Override
    public View pipCreatePictureInPictureView() {
        LivePlayerView livePlayerView = new LivePlayerView(this.textureView.getContext(), this.currentAccount, false);
        this.pipTextureView = livePlayerView;
        return livePlayerView;
    }

    @Override
    public void pipHidePrimaryWindowView(Runnable runnable) {
        this.firstFrameCallback = runnable;
        bindTextureView(true);
        this.windowViewSkipRender = true;
        this.windowManager.removeView(this.contentView);
        this.contentView.invalidate();
    }

    @Override
    public Bitmap pipCreatePictureInPictureViewBitmap() {
        LivePlayerView livePlayerView = this.pipTextureView;
        if (livePlayerView == null || !livePlayerView.isAvailable()) {
            return null;
        }
        return this.pipTextureView.getBitmap();
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
        LivePlayerView livePlayerView = this.pipTextureView;
        if (livePlayerView != null) {
            livePlayerView.release();
            this.pipTextureView = null;
        }
        bindTextureView(true);
    }
}
