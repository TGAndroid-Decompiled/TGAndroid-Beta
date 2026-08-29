package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class e41 implements org.telegram.ui.Components.u61, org.telegram.ui.Components.q61 {
    public final f41 f37699a;

    public e41(f41 f41Var) {
        this.f37699a = f41Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f37699a.R.f29115i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        f41 f41Var = this.f37699a;
        if (i10 == 4) {
            f41Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(f41Var.V);
        AndroidUtilities.runOnUIThread(f41Var.V, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f37699a.R.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new ky0(this, 14));
    }

    @Override
    public void onSeekFinished(k3.a aVar) {
    }

    @Override
    public void onSeekStarted(k3.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void onError(org.telegram.ui.Components.x61 x61Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f9) {
    }
}
