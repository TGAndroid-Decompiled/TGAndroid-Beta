package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class g51 implements org.telegram.ui.Components.d71, org.telegram.ui.Components.z61 {
    public final h51 f33767a;

    public g51(h51 h51Var) {
        this.f33767a = h51Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f33767a.V.f24943i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        h51 h51Var = this.f33767a;
        if (i10 == 4) {
            h51Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(h51Var.Z);
        AndroidUtilities.runOnUIThread(h51Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f33767a.V.e(z10, true, fArr);
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
    public void onError(org.telegram.ui.Components.g71 g71Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
