package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

public final class sj0 extends ImageReceiver {

    public final int f32476a;

    public sj0(int i10, View view) {
        super(view);
        this.f32476a = i10;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        switch (this.f32476a) {
            case 0:
                if (drawable instanceof oi0) {
                    ((oi0) drawable).L(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (imageBitmapByKey && (drawable instanceof oi0)) {
                    oi0 oi0Var = (oi0) drawable;
                    oi0Var.L(0, false, true);
                    oi0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
