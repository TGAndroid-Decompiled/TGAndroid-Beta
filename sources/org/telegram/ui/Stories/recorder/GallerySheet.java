package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticLambda39;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda1;
import org.telegram.ui.QrActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda4;

public final class GallerySheet extends BottomSheet {
    public Boolean galleryListViewOpening;
    public ValueAnimator galleryOpenCloseAnimator;
    public SpringAnimation galleryOpenCloseSpringAnimator;
    public final AnonymousClass1 listView;
    public Utilities.Callback onGalleryListener;

    public GallerySheet(Context context, Theme.ResourcesProvider resourcesProvider, final String str, float f) {
        super(context, resourcesProvider, false, false);
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
        r1.setOnBackClickListener(new GallerySheet$$ExternalSyntheticLambda0(this, 1));
        r1.setOnSelectListener(new LinkManager$$ExternalSyntheticLambda1(this, 29));
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context, null);
        this.containerView = sizeNotifierFrameLayout;
        int i = this.backgroundPaddingLeft;
        sizeNotifierFrameLayout.setPadding(i, 0, i, 0);
        this.containerView.addView(r1);
    }

    public final void animate(GallerySheet$$ExternalSyntheticLambda0 gallerySheet$$ExternalSyntheticLambda0, boolean z) {
        AnonymousClass1 anonymousClass1 = this.listView;
        float translationY = anonymousClass1.getTranslationY();
        float height = z ? 0.0f : (this.containerView.getHeight() - anonymousClass1.top()) + (AndroidUtilities.navigationBarHeight * 2.5f);
        this.galleryListViewOpening = Boolean.valueOf(z);
        if (z) {
            SpringAnimation springAnimation = new SpringAnimation(anonymousClass1, DynamicAnimation.TRANSLATION_Y, height);
            this.galleryOpenCloseSpringAnimator = springAnimation;
            springAnimation.mSpring.setDampingRatio(0.75f);
            this.galleryOpenCloseSpringAnimator.mSpring.setStiffness(350.0f);
            this.galleryOpenCloseSpringAnimator.addEndListener(new AndroidUtilities$$ExternalSyntheticLambda39(this, height, gallerySheet$$ExternalSyntheticLambda0));
            this.galleryOpenCloseSpringAnimator.start();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(translationY, height);
        this.galleryOpenCloseAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(this, 8));
        this.galleryOpenCloseAnimator.addListener(new QrActivity.AnonymousClass4(18, this, gallerySheet$$ExternalSyntheticLambda0));
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
        animate(new GallerySheet$$ExternalSyntheticLambda0(this, 0), false);
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
        animate(null, true);
    }
}
