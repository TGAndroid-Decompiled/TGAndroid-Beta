package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;
public final class b4 extends vg.r {
    public final int D = 0;
    public final Object E;

    public b4(o8 o8Var, Context context, l lVar) {
        super(context, lVar, 0);
        this.E = o8Var;
    }

    @Override
    public final void a() {
        switch (this.D) {
            case 0:
                c4 c4Var = (c4) this.E;
                c4Var.f42333o = true;
                setPaused(true);
                setVisibility(8);
                c4Var.f42308a.invalidate();
                return;
            default:
                setPaused(true);
                setVisibility(8);
                ((o8) this.E).f42980a.setVisibility(0);
                return;
        }
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.D) {
            case 1:
                ImageView imageView = ((o8) this.E).f42980a;
                super.onSurfaceTextureUpdated(surfaceTexture);
                if (this.f57494n && imageView.getVisibility() == 0) {
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
        this.E = c4Var;
    }
}
