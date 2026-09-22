package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class ok0 extends ImageReceiver {
    public final int f27122a;

    public ok0(int i10, View view) {
        super(view);
        this.f27122a = i10;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        switch (this.f27122a) {
            case 0:
                if (drawable instanceof kj0) {
                    ((kj0) drawable).N(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (imageBitmapByKey && (drawable instanceof kj0)) {
                    kj0 kj0Var = (kj0) drawable;
                    kj0Var.N(0, false, true);
                    kj0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
