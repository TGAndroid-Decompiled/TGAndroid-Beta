package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
public final class t6 extends vg.m {
    public final v6 f43180i0;

    public t6(v6 v6Var, Context context) {
        super(context, 1, 4);
        this.f43180i0 = v6Var;
    }

    @Override
    public final void i() {
        v6 v6Var = this.f43180i0;
        if (v6Var.f43263e == this) {
            v6.c(v6Var);
        }
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        int round = Math.round(Math.min(i7, i10) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        super.onSurfaceTextureAvailable(surfaceTexture, round, round);
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        int round = Math.round(Math.min(i7, i10) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        this.D = round;
        this.f57427y = round;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int round = Math.round(Math.min(getWidth(), getHeight()) * 3.5f);
        if (round > 0) {
            surfaceTexture.setDefaultBufferSize(round, round);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f43180i0.f43278y && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
