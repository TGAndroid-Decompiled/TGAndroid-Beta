package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class bk0 extends ImageReceiver {
    public final int f27151a;

    public bk0(int i10, View view) {
        super(view);
        this.f27151a = i10;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        switch (this.f27151a) {
            case 0:
                if (drawable instanceof xi0) {
                    ((xi0) drawable).L(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (imageBitmapByKey && (drawable instanceof xi0)) {
                    xi0 xi0Var = (xi0) drawable;
                    xi0Var.L(0, false, true);
                    xi0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
