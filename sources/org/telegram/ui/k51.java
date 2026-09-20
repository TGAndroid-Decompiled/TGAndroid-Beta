package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class k51 implements org.telegram.ui.Components.q71, org.telegram.ui.Components.m71 {
    public final l51 f35040a;

    public k51(l51 l51Var) {
        this.f35040a = l51Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f35040a.V.f25279i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        l51 l51Var = this.f35040a;
        if (i10 == 4) {
            l51Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(l51Var.Z);
        AndroidUtilities.runOnUIThread(l51Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f35040a.V.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new e01(this, 12));
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
    public void onError(org.telegram.ui.Components.t71 t71Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
