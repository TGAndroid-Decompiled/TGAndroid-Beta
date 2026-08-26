package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class StickerCategoriesListView$CategoryButton$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final StickerCategoriesListView.CategoryButton f$0;

    public StickerCategoriesListView$CategoryButton$$ExternalSyntheticLambda0(StickerCategoriesListView.CategoryButton categoryButton, int i) {
        this.$r8$classId = i;
        this.f$0 = categoryButton;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                StickerCategoriesListView.CategoryButton categoryButton = this.f$0;
                categoryButton.getClass();
                categoryButton.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                categoryButton.invalidate();
                break;
            case 1:
                StickerCategoriesListView.CategoryButton categoryButton2 = this.f$0;
                categoryButton2.getClass();
                categoryButton2.updateSelectedT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                StickerCategoriesListView.CategoryButton categoryButton3 = this.f$0;
                categoryButton3.getClass();
                categoryButton3.loadProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                categoryButton3.invalidate();
                break;
        }
    }
}
