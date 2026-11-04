package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
public final class s6 extends wg.m {
    public final u6 f43161j0;

    public s6(u6 u6Var, Context context) {
        super(context, 1, 4);
        this.f43161j0 = u6Var;
    }

    @Override
    public final void i() {
        u6 u6Var = this.f43161j0;
        if (u6Var.f43252e == this) {
            u6.c(u6Var);
        }
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        int round = Math.round(Math.min(i3, i10) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        super.onSurfaceTextureAvailable(surfaceTexture, round, round);
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
        int round = Math.round(Math.min(i3, i10) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        this.E = round;
        this.f57683y = round;
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
        if (!this.f43161j0.f43267y && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
