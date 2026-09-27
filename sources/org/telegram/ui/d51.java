package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class d51 implements org.telegram.ui.Components.r71, org.telegram.ui.Components.n71 {
    public final e51 f32867a;

    public d51(e51 e51Var) {
        this.f32867a = e51Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f32867a.V.f25657i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        e51 e51Var = this.f32867a;
        if (i10 == 4) {
            e51Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(e51Var.Z);
        AndroidUtilities.runOnUIThread(e51Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f32867a.V.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new xz0(this, 12));
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
    public void onError(org.telegram.ui.Components.u71 u71Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
