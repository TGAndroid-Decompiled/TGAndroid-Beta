package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;
public final class a4 extends vg.r {
    public final int D = 0;
    public final Object E;

    public a4(n8 n8Var, Context context, l lVar) {
        super(context, lVar, 0);
        this.E = n8Var;
    }

    @Override
    public final void a() {
        switch (this.D) {
            case 0:
                b4 b4Var = (b4) this.E;
                b4Var.f42247o = true;
                setPaused(true);
                setVisibility(8);
                b4Var.f42222a.invalidate();
                return;
            default:
                setPaused(true);
                setVisibility(8);
                ((n8) this.E).f42898a.setVisibility(0);
                return;
        }
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.D) {
            case 1:
                ImageView imageView = ((n8) this.E).f42898a;
                super.onSurfaceTextureUpdated(surfaceTexture);
                if (this.f57507n && imageView.getVisibility() == 0) {
                    imageView.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onSurfaceTextureUpdated(surfaceTexture);
                return;
        }
    }

    public a4(b4 b4Var, Context context, x3 x3Var) {
        super(context, x3Var, 2);
        this.E = b4Var;
    }
}
