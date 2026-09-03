package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class mk0 extends ImageReceiver {
    public final int f29148a;

    public mk0(int i10, View view) {
        super(view);
        this.f29148a = i10;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z4, int i11) {
        switch (this.f29148a) {
            case 0:
                if (drawable instanceof hj0) {
                    ((hj0) drawable).L(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z4, i11);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z4, i11);
                if (imageBitmapByKey && (drawable instanceof hj0)) {
                    hj0 hj0Var = (hj0) drawable;
                    hj0Var.L(0, false, true);
                    hj0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
