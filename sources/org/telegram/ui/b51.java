package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class b51 implements org.telegram.ui.Components.b81, org.telegram.ui.Components.x71 {
    public final c51 f35054a;

    public b51(c51 c51Var) {
        this.f35054a = c51Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f35054a.V.f28089i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        c51 c51Var = this.f35054a;
        if (i10 == 4) {
            c51Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(c51Var.Z);
        AndroidUtilities.runOnUIThread(c51Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f35054a.V.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new hz0(this, 13));
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void onError(org.telegram.ui.Components.e81 e81Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
