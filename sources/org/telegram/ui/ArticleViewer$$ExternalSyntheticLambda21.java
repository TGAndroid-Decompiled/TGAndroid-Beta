package org.telegram.ui;

import android.animation.ValueAnimator;

public final class ArticleViewer$$ExternalSyntheticLambda21 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ArticleViewer f$0;

    public ArticleViewer$$ExternalSyntheticLambda21(ArticleViewer articleViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = articleViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showSearchPanel$51(valueAnimator);
                break;
            default:
                this.f$0.lambda$checkScrollAnimated$52(valueAnimator);
                break;
        }
    }
}
