package org.telegram.ui;

import android.animation.ValueAnimator;

public final class ArticleViewer$Sheet$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ArticleViewer.Sheet f$0;

    public ArticleViewer$Sheet$$ExternalSyntheticLambda1(ArticleViewer.Sheet sheet, int i) {
        this.$r8$classId = i;
        this.f$0 = sheet;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer.Sheet sheet = this.f$0;
                sheet.getClass();
                sheet.backProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sheet.windowView.invalidate();
                sheet.checkNavColor();
                sheet.checkFullyVisible();
                break;
            case 1:
                ArticleViewer.Sheet sheet2 = this.f$0;
                sheet2.getClass();
                sheet2.dismissProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!sheet2.dismissingIntoTabs) {
                    sheet2.updateTranslation();
                }
                sheet2.checkNavColor();
                sheet2.checkFullyVisible();
                break;
            default:
                ArticleViewer.Sheet sheet3 = this.f$0;
                sheet3.getClass();
                sheet3.openProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sheet3.updateTranslation();
                sheet3.checkNavColor();
                sheet3.checkFullyVisible();
                break;
        }
    }
}
