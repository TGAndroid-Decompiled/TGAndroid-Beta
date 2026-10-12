package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class jl0 extends ImageReceiver {
    public final int f27555a;

    public jl0(int i10, View view) {
        super(view);
        this.f27555a = i10;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        switch (this.f27555a) {
            case 0:
                if (drawable instanceof fk0) {
                    ((fk0) drawable).N(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (imageBitmapByKey && (drawable instanceof fk0)) {
                    fk0 fk0Var = (fk0) drawable;
                    fk0Var.N(0, false, true);
                    fk0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
