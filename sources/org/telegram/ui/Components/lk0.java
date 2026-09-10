package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class lk0 extends ImageReceiver {
    public final int f25023a;

    public lk0(int i10, View view) {
        super(view);
        this.f25023a = i10;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        switch (this.f25023a) {
            case 0:
                if (drawable instanceof hj0) {
                    ((hj0) drawable).N(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (imageBitmapByKey && (drawable instanceof hj0)) {
                    hj0 hj0Var = (hj0) drawable;
                    hj0Var.N(0, false, true);
                    hj0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
