package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class ArticleViewer$$ExternalSyntheticLambda38 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ArticleViewer f$0;

    public ArticleViewer$$ExternalSyntheticLambda38(ArticleViewer articleViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = articleViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer articleViewer = this.f$0;
                articleViewer.getClass();
                articleViewer.setCurrentHeaderHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                ArticleViewer articleViewer2 = this.f$0;
                articleViewer2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                articleViewer2.searchPanelAlpha = fFloatValue;
                articleViewer2.searchPanel.setTranslationY(((1.0f - fFloatValue) * AndroidUtilities.dp(51.0f)) + articleViewer2.searchPanelTranslation);
                break;
        }
    }
}
