package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class d51 implements org.telegram.ui.Components.a81, org.telegram.ui.Components.w71 {
    public final e51 f35650a;

    public d51(e51 e51Var) {
        this.f35650a = e51Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f35650a.V.f27988i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        e51 e51Var = this.f35650a;
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
        this.f35650a.V.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new hz0(this, 13));
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
    public void onError(org.telegram.ui.Components.d81 d81Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
