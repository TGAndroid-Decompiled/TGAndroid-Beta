package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class o41 implements org.telegram.ui.Components.f71, org.telegram.ui.Components.b71 {
    public final p41 f36790a;

    public o41(p41 p41Var) {
        this.f36790a = p41Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f36790a.S.f24192i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z4, int i10) {
        p41 p41Var = this.f36790a;
        if (i10 == 4) {
            p41Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(p41Var.W);
        AndroidUtilities.runOnUIThread(p41Var.W, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z4, boolean z10, float[] fArr) {
        this.f36790a.S.e(z4, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new vy0(this, 14));
    }

    @Override
    public void onSeekFinished(k3.a aVar) {
    }

    @Override
    public void onSeekStarted(k3.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void onError(org.telegram.ui.Components.i71 i71Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
