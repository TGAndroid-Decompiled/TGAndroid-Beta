package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class pk0 extends ImageReceiver {
    public final int f27393a;

    public pk0(int i10, View view) {
        super(view);
        this.f27393a = i10;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        switch (this.f27393a) {
            case 0:
                if (drawable instanceof lj0) {
                    ((lj0) drawable).N(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (imageBitmapByKey && (drawable instanceof lj0)) {
                    lj0 lj0Var = (lj0) drawable;
                    lj0Var.N(0, false, true);
                    lj0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
