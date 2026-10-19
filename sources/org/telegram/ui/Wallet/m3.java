package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;
public final class m3 extends tg.t {
    public final Object E;
    public final int f34499y = 1;

    public m3(i8 i8Var, Context context, n nVar) {
        super(context, nVar, 0);
        this.E = i8Var;
    }

    @Override
    public final void a() {
        switch (this.f34499y) {
            case 0:
                n3 n3Var = (n3) this.E;
                n3Var.f34570o = true;
                setPaused(true);
                setVisibility(8);
                n3Var.f34546a.invalidate();
                return;
            default:
                setPaused(true);
                setVisibility(8);
                ((i8) this.E).f34328a.setVisibility(0);
                return;
        }
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f34499y) {
            case 1:
                ImageView imageView = ((i8) this.E).f34328a;
                super.onSurfaceTextureUpdated(surfaceTexture);
                if (this.f47181n && imageView.getVisibility() == 0) {
                    imageView.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onSurfaceTextureUpdated(surfaceTexture);
                return;
        }
    }

    public m3(n3 n3Var, Context context, j3 j3Var) {
        super(context, j3Var, 2);
        this.E = n3Var;
    }
}
