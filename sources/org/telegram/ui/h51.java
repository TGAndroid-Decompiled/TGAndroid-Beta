package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class h51 implements org.telegram.ui.Components.d71, org.telegram.ui.Components.z61 {
    public final i51 f34100a;

    public h51(i51 i51Var) {
        this.f34100a = i51Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f34100a.V.f24949i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        i51 i51Var = this.f34100a;
        if (i10 == 4) {
            i51Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(i51Var.Z);
        AndroidUtilities.runOnUIThread(i51Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.f34100a.V.e(z10, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new f01(this, 12));
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
