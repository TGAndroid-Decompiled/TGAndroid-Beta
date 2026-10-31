package org.telegram.ui;

import android.graphics.SurfaceTexture;
public final class h11 implements org.telegram.ui.Components.s61, org.telegram.ui.Components.o61 {
    public final i11 f37688a;

    public h11(i11 i11Var) {
        this.f37688a = i11Var;
    }

    @Override
    public void B(boolean z10, float[] fArr) {
        this.f37688a.V.e(z10, fArr);
    }

    @Override
    public boolean k() {
        if (this.f37688a.V.f32400i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        i11 i11Var = this.f37688a;
        if (i10 == 4) {
            i11Var.dismiss();
            return;
        }
        org.telegram.messenger.i0.r(i11Var.Z);
        org.telegram.messenger.i0.h3(i11Var.Z, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onRenderedFirstFrame() {
        org.telegram.messenger.i0.g3(new wv0(this, 16));
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
    public void onError(org.telegram.ui.Components.u61 u61Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
