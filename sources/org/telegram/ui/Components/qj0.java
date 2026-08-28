package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class qj0 extends ImageReceiver {
    public final int f31979a;

    public qj0(int i9, View view) {
        super(view);
        this.f31979a = i9;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i9, boolean z10, int i10) {
        switch (this.f31979a) {
            case 0:
                if (drawable instanceof mi0) {
                    ((mi0) drawable).L(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i9, z10, i10);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i9, z10, i10);
                if (imageBitmapByKey && (drawable instanceof mi0)) {
                    mi0 mi0Var = (mi0) drawable;
                    mi0Var.L(0, false, true);
                    mi0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
