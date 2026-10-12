package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class q51 implements org.telegram.ui.Components.e81, org.telegram.ui.Components.a81 {
    public final r51 f39345a;

    public q51(r51 r51Var) {
        this.f39345a = r51Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f39345a.V.f27608i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        r51 r51Var = this.f39345a;
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
        this.f39345a.V.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new uz0(this, 13));
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
    public void onError(org.telegram.ui.Components.h81 h81Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
