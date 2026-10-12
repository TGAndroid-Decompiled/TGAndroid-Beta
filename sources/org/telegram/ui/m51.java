package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class m51 implements org.telegram.ui.Components.n81, org.telegram.ui.Components.j81 {
    public final n51 f39920a;

    public m51(n51 n51Var) {
        this.f39920a = n51Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f39920a.V.f28425i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        n51 n51Var = this.f39920a;
        if (i10 == 4) {
            n51Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(n51Var.Z);
        AndroidUtilities.runOnUIThread(n51Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f39920a.V.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new pz0(this, 13));
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
    public void onError(org.telegram.ui.Components.q81 q81Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
