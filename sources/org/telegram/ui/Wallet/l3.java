package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;
public final class l3 extends ug.s {
    public final Object E;
    public final int f36838y = 1;

    public l3(i8 i8Var, Context context, m mVar) {
        super(context, mVar, 0);
        this.E = i8Var;
    }

    @Override
    public final void a() {
        switch (this.f36838y) {
            case 0:
                m3 m3Var = (m3) this.E;
                m3Var.f36911o = true;
                setPaused(true);
                setVisibility(8);
                m3Var.f36887a.invalidate();
                return;
            default:
                setPaused(true);
                setVisibility(8);
                ((i8) this.E).f36683a.setVisibility(0);
                return;
        }
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f36838y) {
            case 1:
                ImageView imageView = ((i8) this.E).f36683a;
                super.onSurfaceTextureUpdated(surfaceTexture);
                if (this.f49894n && imageView.getVisibility() == 0) {
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
