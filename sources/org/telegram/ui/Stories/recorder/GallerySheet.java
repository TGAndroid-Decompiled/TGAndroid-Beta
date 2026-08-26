package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticLambda38;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.iv.RichEditor;

public final class GallerySheet extends BottomSheet {
    public Boolean galleryListViewOpening;
    public ValueAnimator galleryOpenCloseAnimator;
    public SpringAnimation galleryOpenCloseSpringAnimator;
    public final AnonymousClass1 listView;
    public Utilities.Callback onGalleryListener;

    public GallerySheet(Context context, Theme.ResourcesProvider resourcesProvider, final String str, float f) {
        super(context, false, false, resourcesProvider);
        fixNavigationBar(-14737633);
        ?? r1 = new GalleryListView(UserConfig.selectedAccount, context, new DarkThemeResourceProvider(), f) {
            @Override
            public final String getTitle() {
                return str;
            }
        };
        this.listView = r1;
        r1.searchItem.setVisibility(8);
        r1.setMultipleOnClick(false);
        r1.setOnBackClickListener(new GallerySheet$$ExternalSyntheticLambda2(this, 1));
        r1.setOnSelectListener(new PaintView$$ExternalSyntheticLambda4(this, 4));
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context);
        this.containerView = sizeNotifierFrameLayout;
        int i = this.backgroundPaddingLeft;
        sizeNotifierFrameLayout.setPadding(i, 0, i, 0);
        this.containerView.addView(r1);
    }

    public final void animate(boolean z, GallerySheet$$ExternalSyntheticLambda2 gallerySheet$$ExternalSyntheticLambda2) {
        AnonymousClass1 anonymousClass1 = this.listView;
        float translationY = anonymousClass1.getTranslationY();
        float height = z ? 0.0f : (this.containerView.getHeight() - anonymousClass1.top()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        this.galleryListViewOpening = Boolean.valueOf(z);
        if (z) {
            SpringAnimation springAnimation = new SpringAnimation(anonymousClass1, DynamicAnimation.TRANSLATION_Y, height);
            this.galleryOpenCloseSpringAnimator = springAnimation;
            springAnimation.mSpring.setDampingRatio(0.75f);
            this.galleryOpenCloseSpringAnimator.mSpring.setStiffness(350.0f);
            this.galleryOpenCloseSpringAnimator.addEndListener(new AndroidUtilities$$ExternalSyntheticLambda38(this, height, gallerySheet$$ExternalSyntheticLambda2));
            this.galleryOpenCloseSpringAnimator.start();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(translationY, height);
        this.galleryOpenCloseAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new HintView2$$ExternalSyntheticLambda1(this, 4));
        this.galleryOpenCloseAnimator.addListener(new RichEditor.AnonymousClass1(18, this, gallerySheet$$ExternalSyntheticLambda2));
        this.galleryOpenCloseAnimator.setDuration(450L);
        this.galleryOpenCloseAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.galleryOpenCloseAnimator.start();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.listView.actionBarShown;
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        animate(false, new GallerySheet$$ExternalSyntheticLambda2(this, 0));
        super.lambda$showGiftOfferSheet$15();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= top()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        lambda$showGiftOfferSheet$15();
        return true;
    }

    public final void lambda$dismiss$2() {
        super.lambda$showGiftOfferSheet$15();
    }

    @Override
    public final void show() {
        super.show();
        animate(true, null);
    }
}
