package org.telegram.p009ui.Components.Premium;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.Premium.CarouselView;
import org.telegram.p009ui.LaunchActivity;
import org.telegram.p009ui.UnlockPremiumView;
import org.telegram.tgnet.TLRPC$TL_availableReaction;

public class UnlockPremiumReactionsWindow {
    View blurView;
    CarouselView carouselView;
    private boolean closed;
    long enterDuration = 400;
    Activity parentActivity;
    UnlockPremiumView unlockPremiumView;
    WindowManager.LayoutParams windowLayoutParams;
    WindowManager windowManager;
    FrameLayout windowView;

    public void show(Activity activity, List<TLRPC$TL_availableReaction> list, Theme.ResourcesProvider resourcesProvider, float f, float f2) {
        this.parentActivity = activity;
        this.windowView = createView(activity, list, resourcesProvider, f, f2);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.windowLayoutParams = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        if (Build.VERSION.SDK_INT >= 21) {
            layoutParams.flags = -2147417856;
        } else {
            layoutParams.flags = 0;
        }
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.windowManager = windowManager;
        windowManager.addView(this.windowView, this.windowLayoutParams);
    }

    private FrameLayout createView(Context context, List<TLRPC$TL_availableReaction> list, Theme.ResourcesProvider resourcesProvider, final float f, final float f2) {
        final FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    UnlockPremiumReactionsWindow.this.close();
                }
                return true;
            }
        };
        View view = new View(context);
        this.blurView = view;
        frameLayout.addView(view);
        prepareBlurBitmap();
        UnlockPremiumView unlockPremiumView = new UnlockPremiumView(context, resourcesProvider);
        this.unlockPremiumView = unlockPremiumView;
        frameLayout.addView(unlockPremiumView, LayoutHelper.createFrame(-1, -1.0f));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            ReactionDrawingObject reactionDrawingObject = new ReactionDrawingObject(this, i);
            reactionDrawingObject.set(list.get(0));
            arrayList.add(reactionDrawingObject);
        }
        CarouselView carouselView = new CarouselView(context, arrayList);
        this.carouselView = carouselView;
        frameLayout.addView(carouselView, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 60.0f));
        frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                frameLayout.removeOnLayoutChangeListener(this);
                UnlockPremiumReactionsWindow.this.blurView.setAlpha(0.0f);
                UnlockPremiumReactionsWindow.this.unlockPremiumView.setAlpha(0.0f);
                UnlockPremiumReactionsWindow.this.carouselView.setAlpha(0.0f);
                int[] iArr = new int[2];
                UnlockPremiumReactionsWindow.this.carouselView.getLocationOnScreen(iArr);
                float measuredWidth = iArr[0] + (UnlockPremiumReactionsWindow.this.carouselView.getMeasuredWidth() / 2.0f);
                float measuredHeight = iArr[1] + (UnlockPremiumReactionsWindow.this.carouselView.getMeasuredHeight() / 2.0f);
                UnlockPremiumReactionsWindow.this.carouselView.setTranslationX(-(measuredWidth - f));
                UnlockPremiumReactionsWindow.this.carouselView.setTranslationY(-(measuredHeight - f2));
                float dp = AndroidUtilities.m34dp(30.0f) / UnlockPremiumReactionsWindow.this.carouselView.getMeasuredWidth();
                UnlockPremiumReactionsWindow.this.carouselView.setScaleX(dp);
                UnlockPremiumReactionsWindow.this.carouselView.setScaleY(dp);
                ViewPropertyAnimator duration = UnlockPremiumReactionsWindow.this.unlockPremiumView.animate().setDuration(UnlockPremiumReactionsWindow.this.enterDuration);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                duration.setInterpolator(cubicBezierInterpolator).alpha(1.0f).start();
                UnlockPremiumReactionsWindow.this.blurView.animate().setDuration(UnlockPremiumReactionsWindow.this.enterDuration).setInterpolator(cubicBezierInterpolator).alpha(1.0f).start();
                UnlockPremiumReactionsWindow.this.carouselView.animate().alpha(1.0f).translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(UnlockPremiumReactionsWindow.this.enterDuration).setInterpolator(cubicBezierInterpolator).start();
            }
        });
        return frameLayout;
    }

    public void close() {
        if (!this.closed) {
            this.closed = true;
            this.blurView.animate().setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    try {
                        UnlockPremiumReactionsWindow unlockPremiumReactionsWindow = UnlockPremiumReactionsWindow.this;
                        unlockPremiumReactionsWindow.windowManager.removeView(unlockPremiumReactionsWindow.windowView);
                    } catch (Exception e) {
                        FileLog.m30e(e);
                    }
                }
            }).alpha(0.0f);
            this.unlockPremiumView.animate().alpha(0.0f);
            this.carouselView.animate().alpha(0.0f);
        }
    }

    private void prepareBlurBitmap() {
        Activity activity = this.parentActivity;
        if (activity != null) {
            View decorView = activity.getWindow().getDecorView();
            int measuredWidth = (int) (decorView.getMeasuredWidth() / 12.0f);
            int measuredHeight = (int) (decorView.getMeasuredHeight() / 12.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.083333336f, 0.083333336f);
            decorView.draw(canvas);
            canvas.drawColor(Theme.getActiveTheme().isDark() ? 1895825408 : 1912602623);
            Activity activity2 = this.parentActivity;
            if ((activity2 instanceof LaunchActivity) && ((LaunchActivity) activity2).getActionBarLayout().getLastFragment().getVisibleDialog() != null) {
                ((LaunchActivity) this.parentActivity).getActionBarLayout().getLastFragment().getVisibleDialog().getWindow().getDecorView().draw(canvas);
            }
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
            this.blurView.setBackgroundDrawable(new BitmapDrawable(createBitmap));
        }
    }

    public class ReactionDrawingObject extends CarouselView.DrawingObject {
        long lastSelectedTime;
        private View parentView;
        private int position;
        TLRPC$TL_availableReaction reaction;
        private boolean selected;
        ImageReceiver imageReceiver = new ImageReceiver();
        ImageReceiver actionReceiver = new ImageReceiver();
        ImageReceiver effectImageReceiver = new ImageReceiver();
        Rect rect = new Rect();

        public ReactionDrawingObject(UnlockPremiumReactionsWindow unlockPremiumReactionsWindow, int i) {
            this.position = i;
        }

        @Override
        public void onAttachToWindow(View view) {
            this.parentView = view;
            this.imageReceiver.setParentView(view);
            ImageReceiver imageReceiver = this.imageReceiver;
            imageReceiver.setUniqKeyPrefix(this.position + "_");
            this.imageReceiver.onAttachedToWindow();
            this.effectImageReceiver.setParentView(view);
            ImageReceiver imageReceiver2 = this.effectImageReceiver;
            imageReceiver2.setUniqKeyPrefix(this.position + "_");
            this.effectImageReceiver.onAttachedToWindow();
            this.actionReceiver.setParentView(view);
            ImageReceiver imageReceiver3 = this.actionReceiver;
            imageReceiver3.setUniqKeyPrefix(this.position + "_");
            this.actionReceiver.onAttachedToWindow();
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(this.reaction.activate_animation, "windowBackgroundGray", 1.0f);
            this.imageReceiver.setImage(ImageLocation.getForDocument(this.reaction.appear_animation), "60_60_nolimit", null, null, svgThumb, 0, "tgs", this.reaction, 0);
            this.imageReceiver.setAutoRepeat(0);
            if (this.imageReceiver.getLottieAnimation() != null) {
                this.imageReceiver.getLottieAnimation().setCurrentFrame(0, false);
            }
            this.imageReceiver.startAnimation();
            this.effectImageReceiver.setAllowStartLottieAnimation(false);
            this.effectImageReceiver.setImage(ImageLocation.getForDocument(this.reaction.around_animation), "120_120", null, null, null, 0, "tgs", this.reaction, 0);
            this.effectImageReceiver.setAutoRepeat(0);
            if (this.effectImageReceiver.getLottieAnimation() != null) {
                this.effectImageReceiver.getLottieAnimation().setCurrentFrame(0, false);
                this.effectImageReceiver.getLottieAnimation().stop();
            }
            this.actionReceiver.setAllowStartLottieAnimation(false);
            this.actionReceiver.setImage(ImageLocation.getForDocument(this.reaction.activate_animation), "60_60_nolimit", null, null, svgThumb, 0, "tgs", this.reaction, 0);
            this.actionReceiver.setAutoRepeat(0);
            if (this.actionReceiver.getLottieAnimation() != null) {
                this.actionReceiver.getLottieAnimation().setCurrentFrame(0, false);
                this.actionReceiver.getLottieAnimation().stop();
            }
        }

        @Override
        public void onDetachFromWindow() {
            this.imageReceiver.onDetachedFromWindow();
            this.imageReceiver.setParentView(null);
            this.effectImageReceiver.onDetachedFromWindow();
            this.effectImageReceiver.setParentView(null);
            this.actionReceiver.onDetachedFromWindow();
            this.actionReceiver.setParentView(null);
        }

        @Override
        public void draw(Canvas canvas, float f, float f2) {
            super.draw(canvas, f, f2);
            int dp = AndroidUtilities.m34dp(120.0f);
            int dp2 = AndroidUtilities.m34dp(350.0f);
            float f3 = dp;
            float f4 = f3 / 2.0f;
            float f5 = f - f4;
            float f6 = f2 - f4;
            this.rect.set((int) f5, (int) f6, (int) (f + f4), (int) (f4 + f2));
            this.imageReceiver.setImageCoords(f5, f6, f3, f3);
            this.actionReceiver.setImageCoords(f5, f6, f3, f3);
            if (this.selected) {
                float f7 = dp2;
                float f8 = f7 / 2.0f;
                this.effectImageReceiver.setImageCoords(f - f8, f2 - f8, f7, f7);
                this.effectImageReceiver.draw(canvas);
            }
            if (this.actionReceiver.hasBitmapImage()) {
                this.actionReceiver.draw(canvas);
                if (this.actionReceiver.getLottieAnimation() != null && this.actionReceiver.getLottieAnimation().isLastFrame()) {
                    this.selected = false;
                    return;
                }
                return;
            }
            this.imageReceiver.draw(canvas);
        }

        @Override
        public boolean checkTap(float f, float f2) {
            if (!this.rect.contains((int) f, (int) f2)) {
                return false;
            }
            select();
            return true;
        }

        @Override
        public void select() {
            if (System.currentTimeMillis() - this.lastSelectedTime >= 3000) {
                this.selected = true;
                this.lastSelectedTime = System.currentTimeMillis();
                if (this.effectImageReceiver.getLottieAnimation() != null) {
                    this.effectImageReceiver.getLottieAnimation().setCurrentFrame(0, false);
                    this.effectImageReceiver.getLottieAnimation().start();
                }
                if (this.actionReceiver.getLottieAnimation() != null) {
                    this.actionReceiver.getLottieAnimation().setCurrentFrame(0, false);
                    this.actionReceiver.getLottieAnimation().start();
                }
                this.parentView.invalidate();
            }
        }

        public void set(TLRPC$TL_availableReaction tLRPC$TL_availableReaction) {
            this.reaction = tLRPC$TL_availableReaction;
        }
    }
}
