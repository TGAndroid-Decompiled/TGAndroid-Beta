package org.telegram.ui;

import android.graphics.SurfaceTexture;
public final class oz0 implements org.telegram.ui.Components.s51, org.telegram.ui.Components.o51 {
    public final pz0 f50092a;

    public oz0(pz0 pz0Var) {
        this.f50092a = pz0Var;
    }

    @Override
    public void A(boolean z10, float[] fArr) {
        this.f50092a.W.e(z10, fArr);
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        pz0 pz0Var = this.f50092a;
        if (i7 == 4) {
            pz0Var.dismiss();
            return;
        }
        org.telegram.messenger.g0.r(pz0Var.f50400a0);
        org.telegram.messenger.g0.i3(pz0Var.f50400a0, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public boolean v() {
        if (this.f50092a.W.f42277i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame() {
        org.telegram.messenger.g0.h3(new pu0(this, 14));
    }

    @Override
    public void onSeekFinished(m2.a aVar) {
    }

    @Override
    public void onSeekStarted(m2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void onError(org.telegram.ui.Components.u51 u51Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
