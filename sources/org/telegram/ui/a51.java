package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class a51 implements org.telegram.ui.Components.r71, org.telegram.ui.Components.n71 {
    public final b51 f31991a;

    public a51(b51 b51Var) {
        this.f31991a = b51Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f31991a.V.f25629i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        b51 b51Var = this.f31991a;
        if (i10 == 4) {
            b51Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(b51Var.Z);
        AndroidUtilities.runOnUIThread(b51Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f31991a.V.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new vz0(this, 12));
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
