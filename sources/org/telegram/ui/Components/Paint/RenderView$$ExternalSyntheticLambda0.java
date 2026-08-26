package org.telegram.ui.Components.Paint;

public final class RenderView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final RenderView f$0;

    public RenderView$$ExternalSyntheticLambda0(RenderView renderView, int i) {
        this.$r8$classId = i;
        this.f$0 = renderView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                RenderView.RenderViewDelegate renderViewDelegate = this.f$0.delegate;
                if (renderViewDelegate != null) {
                    renderViewDelegate.invalidateInputView();
                }
                break;
            case 1:
                RenderView renderView = this.f$0;
                renderView.painting.cleanResources(renderView.transformedBitmap);
                RenderView.CanvasInternal canvasInternal = renderView.internal;
                canvasInternal.getClass();
                canvasInternal.postRunnable(new RenderView$CanvasInternal$$ExternalSyntheticLambda1(canvasInternal, 2));
                renderView.internal = null;
                break;
            default:
                RenderView renderView2 = this.f$0;
                renderView2.painting.setBrush(renderView2.brush);
                break;
        }
    }
}
