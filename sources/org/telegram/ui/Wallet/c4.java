package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;
public final class c4 extends vg.r {
    public final int D = 0;
    public final Object E;

    public c4(p8 p8Var, Context context, l lVar) {
        super(context, lVar, 0);
        this.E = p8Var;
    }

    @Override
    public final void a() {
        switch (this.D) {
            case 0:
                d4 d4Var = (d4) this.E;
                d4Var.f42338o = true;
                setPaused(true);
                setVisibility(8);
                d4Var.f42313a.invalidate();
                return;
            default:
                setPaused(true);
                setVisibility(8);
                ((p8) this.E).f42994a.setVisibility(0);
                return;
        }
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.D) {
            case 1:
                ImageView imageView = ((p8) this.E).f42994a;
                super.onSurfaceTextureUpdated(surfaceTexture);
                if (this.f57378n && imageView.getVisibility() == 0) {
                    imageView.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onSurfaceTextureUpdated(surfaceTexture);
                return;
        }
    }

    public c4(d4 d4Var, Context context, z3 z3Var) {
        super(context, z3Var, 2);
        this.E = d4Var;
    }
}
