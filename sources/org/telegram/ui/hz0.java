package org.telegram.ui;

import android.graphics.SurfaceTexture;
public final class hz0 implements org.telegram.ui.Components.k51, org.telegram.ui.Components.g51 {
    public final iz0 f46018a;

    public hz0(iz0 iz0Var) {
        this.f46018a = iz0Var;
    }

    @Override
    public boolean b() {
        if (this.f46018a.W.f31756i != null) {
            return true;
        }
        return false;
    }

    @Override
    public void onRenderedFirstFrame(l2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i3) {
        iz0 iz0Var = this.f46018a;
        if (i3 == 4) {
            iz0Var.dismiss();
            return;
        }
        org.telegram.messenger.g0.r(iz0Var.f46457a0);
        org.telegram.messenger.g0.i3(iz0Var.f46457a0, 16L);
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void r(boolean z10, float[] fArr) {
        this.f46018a.W.e(z10, fArr);
    }

    @Override
    public void onRenderedFirstFrame() {
        org.telegram.messenger.g0.h3(new pu0(this, 13));
    }

    @Override
    public void onSeekFinished(l2.a aVar) {
    }

    @Override
    public void onSeekStarted(l2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void onError(org.telegram.ui.Components.m51 m51Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
    }
}
