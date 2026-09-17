package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class ck0 extends ImageReceiver {
    public final int f23081a;

    public ck0(int i10, View view) {
        super(view);
        this.f23081a = i10;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        switch (this.f23081a) {
            case 0:
                if (drawable instanceof yi0) {
                    ((yi0) drawable).N(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (imageBitmapByKey && (drawable instanceof yi0)) {
                    yi0 yi0Var = (yi0) drawable;
                    yi0Var.N(0, false, true);
                    yi0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
