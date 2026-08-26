package org.telegram.ui.Components.Paint;

import android.os.Looper;
import androidx.lifecycle.LiveData;

public final class RenderView$CanvasInternal$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final RenderView.CanvasInternal f$0;

    public RenderView$CanvasInternal$$ExternalSyntheticLambda1(RenderView.CanvasInternal canvasInternal, int i) {
        this.$r8$classId = i;
        this.f$0 = canvasInternal;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                RenderView.CanvasInternal canvasInternal = this.f$0;
                RenderView$CanvasInternal$$ExternalSyntheticLambda1 renderView$CanvasInternal$$ExternalSyntheticLambda1 = canvasInternal.scheduledRunnable;
                if (renderView$CanvasInternal$$ExternalSyntheticLambda1 != null) {
                    canvasInternal.cancelRunnable(renderView$CanvasInternal$$ExternalSyntheticLambda1);
                    canvasInternal.scheduledRunnable = null;
                }
                LiveData.AnonymousClass1 anonymousClass1 = canvasInternal.drawRunnable;
                canvasInternal.cancelRunnable(anonymousClass1);
                canvasInternal.postRunnable(anonymousClass1);
                break;
            case 1:
                RenderView.CanvasInternal canvasInternal2 = this.f$0;
                canvasInternal2.scheduledRunnable = null;
                canvasInternal2.drawRunnable.run();
                break;
            default:
                this.f$0.finish();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    looperMyLooper.quit();
                }
                break;
        }
    }
}
