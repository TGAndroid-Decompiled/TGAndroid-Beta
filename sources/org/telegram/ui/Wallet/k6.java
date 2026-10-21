package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
public final class k6 extends tg.n {
    public final m6 f34431i0;

    public k6(m6 m6Var, Context context) {
        super(context, 1, 4);
        this.f34431i0 = m6Var;
    }

    @Override
    public final void i() {
        m6 m6Var = this.f34431i0;
        if (m6Var.e == this) {
            m6.c(m6Var);
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
        this.f47123y = round;
        this.f47122x = round;
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
        if (!this.f34431i0.f34536x && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
