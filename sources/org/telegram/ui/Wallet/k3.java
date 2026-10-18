package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;
public final class k3 extends tg.t {
    public final Object E;
    public final int f34386y = 0;

    public k3(o8 o8Var, Context context, n nVar) {
        super(context, nVar, 0);
        this.E = o8Var;
    }

    @Override
    public final void a() {
        switch (this.f34386y) {
            case 0:
                l3 l3Var = (l3) this.E;
                l3Var.f34470o = true;
                setPaused(true);
                setVisibility(8);
                l3Var.f34446a.invalidate();
                return;
            default:
                setPaused(true);
                setVisibility(8);
                ((o8) this.E).f34681a.setVisibility(0);
                return;
        }
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f34386y) {
            case 1:
                ImageView imageView = ((o8) this.E).f34681a;
                super.onSurfaceTextureUpdated(surfaceTexture);
                if (this.f47229n && imageView.getVisibility() == 0) {
                    imageView.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onSurfaceTextureUpdated(surfaceTexture);
                return;
        }
    }

    public k3(l3 l3Var, Context context, h3 h3Var) {
        super(context, h3Var, 2);
        this.E = l3Var;
    }
}
