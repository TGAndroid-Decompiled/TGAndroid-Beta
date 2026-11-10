package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
public final class v6 extends vg.m {
    public final x6 f43264i0;

    public v6(x6 x6Var, Context context) {
        super(context, 1, 4);
        this.f43264i0 = x6Var;
    }

    @Override
    public final void i() {
        x6 x6Var = this.f43264i0;
        if (x6Var.f43340e == this) {
            x6.c(x6Var);
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
        this.f57436y = round;
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
        if (!this.f43264i0.f43355y && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
