package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class nk0 extends ImageReceiver {
    public final int f29534a;

    public nk0(int i10, View view) {
        super(view);
        this.f29534a = i10;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z4, int i11) {
        switch (this.f29534a) {
            case 0:
                if (drawable instanceof ij0) {
                    ((ij0) drawable).L(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z4, i11);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z4, i11);
                if (imageBitmapByKey && (drawable instanceof ij0)) {
                    ij0 ij0Var = (ij0) drawable;
                    ij0Var.L(0, false, true);
                    ij0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
