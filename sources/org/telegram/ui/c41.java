package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class c41 implements org.telegram.ui.Components.h61, org.telegram.ui.Components.d61 {
    public final d41 f37061a;

    public c41(d41 d41Var) {
        this.f37061a = d41Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f37061a.R.f27678i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i9) {
        d41 d41Var = this.f37061a;
        if (i9 == 4) {
            d41Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(d41Var.V);
        AndroidUtilities.runOnUIThread(d41Var.V, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f37061a.R.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new ky0(this, 14));
    }

    @Override
    public void onSeekFinished(i3.a aVar) {
    }

    @Override
    public void onSeekStarted(i3.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void onError(org.telegram.ui.Components.k61 k61Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
    }
}
