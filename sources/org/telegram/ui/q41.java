package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;
public final class q41 implements org.telegram.ui.Components.h71, org.telegram.ui.Components.d71 {
    public final r41 f40338a;

    public q41(r41 r41Var) {
        this.f40338a = r41Var;
    }

    @Override
    public boolean needUpdate() {
        if (this.f40338a.S.f26214i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z4, int i10) {
        r41 r41Var = this.f40338a;
        if (i10 == 4) {
            r41Var.dismiss();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(r41Var.W);
        AndroidUtilities.runOnUIThread(r41Var.W, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVisualizerUpdate(boolean z4, boolean z10, float[] fArr) {
        this.f40338a.S.e(z4, true, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new xy0(this, 13));
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
    public void onError(org.telegram.ui.Components.k71 k71Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
