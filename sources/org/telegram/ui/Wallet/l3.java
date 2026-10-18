package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;
public final class l3 extends tg.t {
    public final Object E;
    public final int f34434y = 1;

    public l3(i8 i8Var, Context context, n nVar) {
        super(context, nVar, 0);
        this.E = i8Var;
    }

    @Override
    public final void a() {
        switch (this.f34434y) {
            case 0:
                m3 m3Var = (m3) this.E;
                m3Var.f34506o = true;
                setPaused(true);
                setVisibility(8);
                m3Var.f34482a.invalidate();
                return;
            default:
                setPaused(true);
                setVisibility(8);
                ((i8) this.E).f34309a.setVisibility(0);
                return;
        }
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f34434y) {
            case 1:
                ImageView imageView = ((i8) this.E).f34309a;
                super.onSurfaceTextureUpdated(surfaceTexture);
                if (this.f47179n && imageView.getVisibility() == 0) {
                    imageView.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onSurfaceTextureUpdated(surfaceTexture);
                return;
        }
    }

    public l3(m3 m3Var, Context context, i3 i3Var) {
        super(context, i3Var, 2);
        this.E = m3Var;
    }
}
