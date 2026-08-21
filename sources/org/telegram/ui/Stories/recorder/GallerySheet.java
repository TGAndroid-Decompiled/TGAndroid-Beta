package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public class GallerySheet extends BottomSheet {
    private Boolean galleryListViewOpening;
    private ValueAnimator galleryOpenCloseAnimator;
    private SpringAnimation galleryOpenCloseSpringAnimator;
    private final GalleryListView listView;
    private Utilities.Callback onGalleryListener;

    public GallerySheet(Context context, Theme.ResourcesProvider resourcesProvider, final String str, boolean z, float f) {
        super(context, false, resourcesProvider);
        fixNavigationBar(-14737633);
        GalleryListView galleryListView = new GalleryListView(UserConfig.selectedAccount, context, new DarkThemeResourceProvider(), null, z, f, false, false) {
            @Override
            public String getTitle() {
                return str;
            }
        };
        this.listView = galleryListView;
        galleryListView.allowSearch(false);
        galleryListView.setMultipleOnClick(false);
        galleryListView.setOnBackClickListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.dismiss();
            }
        });
        galleryListView.setOnSelectListener(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                GallerySheet.m4517$r8$lambda$boleV3p_swaWSlzgvrOP5qHLLs(this.f$0, obj, (Bitmap) obj2);
            }
        });
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context);
        this.containerView = sizeNotifierFrameLayout;
        int i = this.backgroundPaddingLeft;
        sizeNotifierFrameLayout.setPadding(i, 0, i, 0);
        this.containerView.addView(galleryListView);
    }

    public static void m4517$r8$lambda$boleV3p_swaWSlzgvrOP5qHLLs(GallerySheet gallerySheet, Object obj, Bitmap bitmap) {
        Utilities.Callback callback;
        if (obj == null) {
            gallerySheet.getClass();
        } else if (gallerySheet.galleryListViewOpening == null && (obj instanceof MediaController.PhotoEntry) && (callback = gallerySheet.onGalleryListener) != null) {
            callback.run((MediaController.PhotoEntry) obj);
        }
    }

    @Override
    public void show() {
        super.show();
        animate(true, null);
    }

    @Override
    public void dismiss() {
        animate(false, new Runnable() {
            @Override
            public final void run() {
                super/*org.telegram.ui.ActionBar.BottomSheet*/.dismiss();
            }
        });
        super.dismiss();
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return !this.listView.actionBarShown;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.listView.top()) {
            dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private void animate(boolean z, final Runnable runnable) {
        float translationY = this.listView.getTranslationY();
        final float height = z ? 0.0f : (this.containerView.getHeight() - this.listView.top()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        this.galleryListViewOpening = Boolean.valueOf(z);
        if (z) {
            SpringAnimation springAnimation = new SpringAnimation(this.listView, DynamicAnimation.TRANSLATION_Y, height);
            this.galleryOpenCloseSpringAnimator = springAnimation;
            springAnimation.getSpring().setDampingRatio(0.75f);
            this.galleryOpenCloseSpringAnimator.getSpring().setStiffness(350.0f);
            this.galleryOpenCloseSpringAnimator.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                    GallerySheet.$r8$lambda$x37FlltTpeb4zFQvqEKMRa4TFIQ(this.f$0, height, runnable, dynamicAnimation, z2, f, f2);
                }
            });
            this.galleryOpenCloseSpringAnimator.start();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(translationY, height);
        this.galleryOpenCloseAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.listView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.galleryOpenCloseAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                GallerySheet.this.galleryOpenCloseAnimator = null;
                GallerySheet.this.galleryListViewOpening = null;
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        this.galleryOpenCloseAnimator.setDuration(450L);
        this.galleryOpenCloseAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.galleryOpenCloseAnimator.start();
    }

    public static void $r8$lambda$x37FlltTpeb4zFQvqEKMRa4TFIQ(GallerySheet gallerySheet, float f, Runnable runnable, DynamicAnimation dynamicAnimation, boolean z, float f2, float f3) {
        if (z) {
            gallerySheet.getClass();
            return;
        }
        gallerySheet.listView.setTranslationY(f);
        gallerySheet.listView.ignoreScroll = false;
        gallerySheet.galleryOpenCloseSpringAnimator = null;
        gallerySheet.galleryListViewOpening = null;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setOnGalleryImage(Utilities.Callback callback) {
        this.onGalleryListener = callback;
    }
}
