package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class nk0 extends ImageReceiver {
    public final int f26832a;

    public nk0(int i10, View view) {
        super(view);
        this.f26832a = i10;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        switch (this.f26832a) {
            case 0:
                if (drawable instanceof jj0) {
                    ((jj0) drawable).N(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (imageBitmapByKey && (drawable instanceof jj0)) {
                    jj0 jj0Var = (jj0) drawable;
                    jj0Var.N(0, false, true);
                    jj0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
