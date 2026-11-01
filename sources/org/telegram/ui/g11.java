package org.telegram.ui;

import android.graphics.SurfaceTexture;
public final class g11 implements org.telegram.ui.Components.t61, org.telegram.ui.Components.p61 {
    public final h11 f37272a;

    public g11(h11 h11Var) {
        this.f37272a = h11Var;
    }

    @Override
    public void B(boolean z10, float[] fArr) {
        this.f37272a.V.e(z10, fArr);
    }

    @Override
    public boolean k() {
        if (this.f37272a.V.f32479i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        h11 h11Var = this.f37272a;
        if (i10 == 4) {
            h11Var.dismiss();
            return;
        }
        org.telegram.messenger.i0.r(h11Var.Z);
        org.telegram.messenger.i0.h3(h11Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onRenderedFirstFrame() {
        org.telegram.messenger.i0.g3(new vv0(this, 16));
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
    public void onError(org.telegram.ui.Components.v61 v61Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
