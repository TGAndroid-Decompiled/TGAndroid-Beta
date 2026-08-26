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
                this.f$0.lambda$setPressed$4(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$setSelected$3(valueAnimator);
                break;
            default:
                this.f$0.lambda$onLoaded$2(valueAnimator);
                break;
        }
    }
}
