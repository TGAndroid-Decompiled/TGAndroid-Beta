package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
public final class j6 extends ug.n {
    public final l6 f36737i0;

    public j6(l6 l6Var, Context context) {
        super(context, 1, 4);
        this.f36737i0 = l6Var;
    }

    @Override
    public final void i() {
        l6 l6Var = this.f36737i0;
        if (l6Var.e == this) {
            l6.c(l6Var);
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
        this.f49831y = round;
        this.f49830x = round;
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
        if (!this.f36737i0.f36866x && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
