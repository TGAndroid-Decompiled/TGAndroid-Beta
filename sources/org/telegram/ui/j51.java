package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class j51 implements org.telegram.ui.Components.h81, org.telegram.ui.Components.d81 {
    public final k51 f38827a;

    public j51(k51 k51Var) {
        this.f38827a = k51Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f38827a.V.f28743i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        k51 k51Var = this.f38827a;
        if (i10 == 4) {
            k51Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(k51Var.Z);
        AndroidUtilities.runOnUIThread(k51Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f38827a.V.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new nz0(this, 13));
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
    public void onError(org.telegram.ui.Components.k81 k81Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
