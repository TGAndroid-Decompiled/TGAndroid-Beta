package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class i51 implements org.telegram.ui.Components.j81, org.telegram.ui.Components.f81 {
    public final j51 f38584a;

    public i51(j51 j51Var) {
        this.f38584a = j51Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f38584a.V.f28592i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        j51 j51Var = this.f38584a;
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
        this.f38584a.V.e(z10, true, fArr);
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
    public void onError(org.telegram.ui.Components.m81 m81Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
