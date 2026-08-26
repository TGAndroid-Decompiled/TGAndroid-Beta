package org.telegram.ui;

import android.animation.ValueAnimator;

public final class ArticleViewer$Sheet$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ArticleViewer.Sheet f$0;

    public ArticleViewer$Sheet$$ExternalSyntheticLambda0(ArticleViewer.Sheet sheet, int i) {
        this.$r8$classId = i;
        this.f$0 = sheet;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$animateOpen$2(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$animateBackProgressTo$4(valueAnimator);
                break;
            default:
                this.f$0.lambda$animateDismiss$3(valueAnimator);
                break;
        }
    }
}
