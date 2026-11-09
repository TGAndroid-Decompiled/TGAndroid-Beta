package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
public final class s6 extends vg.m {
    public final u6 f43098i0;

    public s6(u6 u6Var, Context context) {
        super(context, 1, 4);
        this.f43098i0 = u6Var;
    }

    @Override
    public final void i() {
        u6 u6Var = this.f43098i0;
        if (u6Var.f43181e == this) {
            u6.c(u6Var);
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
        this.f57440y = round;
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
        if (!this.f43098i0.f43196y && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
