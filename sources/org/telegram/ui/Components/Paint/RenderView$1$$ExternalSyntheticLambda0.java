package org.telegram.ui.Components.Paint;

public final class RenderView$1$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final RenderView.AnonymousClass1 f$0;

    public RenderView$1$$ExternalSyntheticLambda0(RenderView.AnonymousClass1 anonymousClass1, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass1;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                RenderView.CanvasInternal canvasInternal = RenderView.this.internal;
                if (canvasInternal != null) {
                    canvasInternal.postRunnable(canvasInternal.drawRunnable);
                }
                break;
            case 1:
                RenderView.CanvasInternal canvasInternal2 = RenderView.this.internal;
                if (canvasInternal2 != null) {
                    canvasInternal2.postRunnable(canvasInternal2.drawRunnable);
                }
                break;
            default:
                RenderView renderView = RenderView.this;
                RenderView.CanvasInternal canvasInternal3 = renderView.internal;
                canvasInternal3.getClass();
                canvasInternal3.postRunnable(new RenderView$CanvasInternal$$ExternalSyntheticLambda1(canvasInternal3, 2));
                renderView.internal = null;
                break;
        }
    }
}
