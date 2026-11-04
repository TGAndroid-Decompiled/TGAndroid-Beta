package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;
public final class a4 extends wg.r {
    public final int E = 0;
    public final Object F;

    public a4(o8 o8Var, Context context, l lVar) {
        super(context, lVar, 0);
        this.F = o8Var;
    }

    @Override
    public final void a() {
        switch (this.E) {
            case 0:
                b4 b4Var = (b4) this.F;
                b4Var.f42257o = true;
                setPaused(true);
                setVisibility(8);
                b4Var.f42232a.invalidate();
                return;
            default:
                setPaused(true);
                setVisibility(8);
                ((o8) this.F).f43014a.setVisibility(0);
                return;
        }
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.E) {
            case 1:
                ImageView imageView = ((o8) this.F).f43014a;
                super.onSurfaceTextureUpdated(surfaceTexture);
                if (this.f57750n && imageView.getVisibility() == 0) {
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
        this.F = b4Var;
    }
}
