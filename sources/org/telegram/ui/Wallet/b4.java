package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;
public final class b4 extends vg.s {
    public final int E = 0;
    public final Object F;

    public b4(q8 q8Var, Context context, l lVar) {
        super(context, lVar, 0);
        this.F = q8Var;
    }

    @Override
    public final void a() {
        switch (this.E) {
            case 0:
                c4 c4Var = (c4) this.F;
                c4Var.f43596o = true;
                setPaused(true);
                setVisibility(8);
                c4Var.f43571a.invalidate();
                return;
            default:
                setPaused(true);
                setVisibility(8);
                ((q8) this.F).f44395a.setVisibility(0);
                return;
        }
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.E) {
            case 1:
                ImageView imageView = ((q8) this.F).f44395a;
                super.onSurfaceTextureUpdated(surfaceTexture);
                if (this.f58979n && imageView.getVisibility() == 0) {
                    imageView.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onSurfaceTextureUpdated(surfaceTexture);
                return;
        }
    }

    public b4(c4 c4Var, Context context, y3 y3Var) {
        super(context, y3Var, 2);
        this.F = c4Var;
    }
}
