package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
public final class z5 extends tg.n {
    public final b6 f33951f0;

    public z5(b6 b6Var, Context context) {
        super(context, 1, 4);
        this.f33951f0 = b6Var;
    }

    @Override
    public final void i() {
        b6 b6Var = this.f33951f0;
        if (b6Var.e == this) {
            b6.c(b6Var);
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
        if (!this.f33951f0.f32985x && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
