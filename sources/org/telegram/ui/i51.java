package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class i51 implements org.telegram.ui.Components.i81, org.telegram.ui.Components.e81 {
    public final j51 f38618a;

    public i51(j51 j51Var) {
        this.f38618a = j51Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f38618a.V.f28787i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        j51 j51Var = this.f38618a;
        if (i10 == 4) {
            j51Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(j51Var.Z);
        AndroidUtilities.runOnUIThread(j51Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f38618a.V.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new mz0(this, 13));
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
    public void onError(org.telegram.ui.Components.l81 l81Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
