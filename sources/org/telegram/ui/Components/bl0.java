package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class bl0 extends ImageReceiver {
    public final int f26900a;

    public bl0(int i10, View view) {
        super(view);
        this.f26900a = i10;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        switch (this.f26900a) {
            case 0:
                if (drawable instanceof xj0) {
                    ((xj0) drawable).N(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (imageBitmapByKey && (drawable instanceof xj0)) {
                    xj0 xj0Var = (xj0) drawable;
                    xj0Var.N(0, false, true);
                    xj0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
