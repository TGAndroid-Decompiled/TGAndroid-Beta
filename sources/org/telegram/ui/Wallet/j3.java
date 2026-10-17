package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;
public final class j3 extends tg.t {
    public final Object E;
    public final int f34350y = 0;

    public j3(l8 l8Var, Context context, n nVar) {
        super(context, nVar, 0);
        this.E = l8Var;
    }

    @Override
    public final void a() {
        switch (this.f34350y) {
            case 0:
                k3 k3Var = (k3) this.E;
                k3Var.f34409o = true;
                setPaused(true);
                setVisibility(8);
                k3Var.f34385a.invalidate();
                return;
            default:
                setPaused(true);
                setVisibility(8);
                ((l8) this.E).f34516a.setVisibility(0);
                return;
        }
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f34350y) {
            case 1:
                ImageView imageView = ((l8) this.E).f34516a;
                super.onSurfaceTextureUpdated(surfaceTexture);
                if (this.f47204n && imageView.getVisibility() == 0) {
                    imageView.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onSurfaceTextureUpdated(surfaceTexture);
                return;
        }
    }

    public j3(k3 k3Var, Context context, g3 g3Var) {
        super(context, g3Var, 2);
        this.E = k3Var;
    }
}
