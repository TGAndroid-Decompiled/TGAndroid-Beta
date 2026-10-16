package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class q51 implements org.telegram.ui.Components.f81, org.telegram.ui.Components.b81 {
    public final r51 f39066a;

    public q51(r51 r51Var) {
        this.f39066a = r51Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f39066a.V.f27304i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        r51 r51Var = this.f39066a;
        if (i10 == 4) {
            r51Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(r51Var.Z);
        AndroidUtilities.runOnUIThread(r51Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f39066a.V.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new tz0(this, 13));
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
    public void onError(org.telegram.ui.Components.i81 i81Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
