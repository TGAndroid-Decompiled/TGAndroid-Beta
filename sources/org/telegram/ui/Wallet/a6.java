package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
public final class a6 extends tg.n {
    public final c6 f32668f0;

    public a6(c6 c6Var, Context context) {
        super(context, 1, 4);
        this.f32668f0 = c6Var;
    }

    @Override
    public final void i() {
        c6 c6Var = this.f32668f0;
        if (c6Var.e == this) {
            c6.c(c6Var);
        }
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int round = Math.round(Math.min(i10, i11) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        super.onSurfaceTextureAvailable(surfaceTexture, round, round);
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int round = Math.round(Math.min(i10, i11) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        this.f45752y = round;
        this.f45751x = round;
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
        if (!this.f32668f0.f32761x && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
