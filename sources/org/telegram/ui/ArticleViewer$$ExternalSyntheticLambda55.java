package org.telegram.ui;

import android.view.View;

public final class ArticleViewer$$ExternalSyntheticLambda55 implements Runnable {
    public final int $r8$classId = 0;
    public final View f$0;
    public final ArticleViewer.DrawingText f$1;

    public ArticleViewer$$ExternalSyntheticLambda55(View view, ArticleViewer.DrawingText drawingText) {
        this.f$0 = view;
        this.f$1 = drawingText;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer.DrawingText drawingText = this.f$1;
                View view = this.f$0;
                view.post(new ArticleViewer$$ExternalSyntheticLambda55(drawingText, view));
                break;
            default:
                ArticleViewer.DrawingText drawingText2 = this.f$1;
                drawingText2.spoilers.clear();
                drawingText2.spoilersPatchedLayout.set(null);
                this.f$0.invalidate();
                break;
        }
    }

    public ArticleViewer$$ExternalSyntheticLambda55(ArticleViewer.DrawingText drawingText, View view) {
        this.f$1 = drawingText;
        this.f$0 = view;
    }
}
