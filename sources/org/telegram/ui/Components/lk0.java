package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class lk0 extends ImageReceiver {
    public final int f26786a;

    public lk0(int i10, View view) {
        super(view);
        this.f26786a = i10;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z4, int i11) {
        switch (this.f26786a) {
            case 0:
                if (drawable instanceof gj0) {
                    ((gj0) drawable).L(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z4, i11);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z4, i11);
                if (imageBitmapByKey && (drawable instanceof gj0)) {
                    gj0 gj0Var = (gj0) drawable;
                    gj0Var.L(0, false, true);
                    gj0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
