package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;
public final class m4 extends vg.r {
    public final int E = 1;
    public final Object F;

    public m4(f9 f9Var, Context context, m mVar) {
        super(context, mVar, 0);
        this.F = f9Var;
    }

    @Override
    public final void a() {
        switch (this.E) {
            case 0:
                n4 n4Var = (n4) this.F;
                n4Var.f44720o = true;
                setPaused(true);
                setVisibility(8);
                n4Var.f44695a.invalidate();
                return;
            default:
                setPaused(true);
                setVisibility(8);
                ((f9) this.F).f44311a.setVisibility(0);
                return;
        }
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.E) {
            case 1:
                ImageView imageView = ((f9) this.F).f44311a;
                super.onSurfaceTextureUpdated(surfaceTexture);
                if (this.f59674n && imageView.getVisibility() == 0) {
                    imageView.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onSurfaceTextureUpdated(surfaceTexture);
                return;
        }
    }

    public m4(n4 n4Var, Context context, j4 j4Var) {
        super(context, j4Var, 2);
        this.F = n4Var;
    }
}
