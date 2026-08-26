package org.telegram.ui;

import android.view.View;

public final class ArticleViewer$$ExternalSyntheticLambda12 implements Runnable {
    public final int $r8$classId = 1;
    public final ArticleViewer.DrawingText f$0;
    public final View f$1;

    public ArticleViewer$$ExternalSyntheticLambda12(View view, ArticleViewer.DrawingText drawingText) {
        this.f$1 = view;
        this.f$0 = drawingText;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer.lambda$checkLayoutForLinks$6(this.f$0, this.f$1);
                break;
            default:
                ArticleViewer.lambda$checkLayoutForLinks$7(this.f$1, this.f$0);
                break;
        }
    }

    public ArticleViewer$$ExternalSyntheticLambda12(ArticleViewer.DrawingText drawingText, View view) {
        this.f$0 = drawingText;
        this.f$1 = view;
    }
}
