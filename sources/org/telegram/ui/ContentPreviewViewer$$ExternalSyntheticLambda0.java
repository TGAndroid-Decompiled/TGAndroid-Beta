package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.PaintingOverlay;

public final class ContentPreviewViewer$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ContentPreviewViewer f$0;

    public ContentPreviewViewer$$ExternalSyntheticLambda0(ContentPreviewViewer contentPreviewViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = contentPreviewViewer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.resourcesProvider = null;
                break;
            case 1:
                ContentPreviewViewer contentPreviewViewer = this.f$0;
                contentPreviewViewer.centerImage.setImageBitmap((Bitmap) null);
                PaintingOverlay paintingOverlay = contentPreviewViewer.paintingOverlay;
                if (paintingOverlay != null) {
                    paintingOverlay.reset();
                    contentPreviewViewer.containerView.removeView(contentPreviewViewer.paintingOverlay);
                    contentPreviewViewer.paintingOverlay = null;
                }
                break;
            default:
                this.f$0.reactionsLayoutContainer.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                break;
        }
    }
}
