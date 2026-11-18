package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;
public final class l4 extends vg.r {
    public final int E = 1;
    public final Object F;

    public l4(e9 e9Var, Context context, m mVar) {
        super(context, mVar, 0);
        this.F = e9Var;
    }

    @Override
    public final void a() {
        switch (this.E) {
            case 0:
                m4 m4Var = (m4) this.F;
                m4Var.f44540o = true;
                setPaused(true);
                setVisibility(8);
                m4Var.f44515a.invalidate();
                return;
            default:
                setPaused(true);
                setVisibility(8);
                ((e9) this.F).f44138a.setVisibility(0);
                return;
        }
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.E) {
            case 1:
                ImageView imageView = ((e9) this.F).f44138a;
                super.onSurfaceTextureUpdated(surfaceTexture);
                if (this.f59546n && imageView.getVisibility() == 0) {
                    imageView.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onSurfaceTextureUpdated(surfaceTexture);
                return;
        }
    }

    public l4(m4 m4Var, Context context, i4 i4Var) {
        super(context, i4Var, 2);
        this.F = m4Var;
    }
}
