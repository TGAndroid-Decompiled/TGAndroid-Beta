package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class e41 implements org.telegram.ui.Components.q81, org.telegram.ui.Components.m81 {
    public final f41 f38754a;

    public e41(f41 f41Var) {
        this.f38754a = f41Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f38754a.V.f30772i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        f41 f41Var = this.f38754a;
        if (i10 == 4) {
            f41Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(f41Var.Z);
        AndroidUtilities.runOnUIThread(f41Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f38754a.V.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new oy0(this, 15));
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
    public void onError(org.telegram.ui.Components.t81 t81Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
