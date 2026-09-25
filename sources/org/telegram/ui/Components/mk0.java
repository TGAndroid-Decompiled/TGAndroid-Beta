package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class mk0 extends ImageReceiver {
    public final int f26537a;

    public mk0(int i10, View view) {
        super(view);
        this.f26537a = i10;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        switch (this.f26537a) {
            case 0:
                if (drawable instanceof ij0) {
                    ((ij0) drawable).N(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (imageBitmapByKey && (drawable instanceof ij0)) {
                    ij0 ij0Var = (ij0) drawable;
                    ij0Var.N(0, false, true);
                    ij0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
