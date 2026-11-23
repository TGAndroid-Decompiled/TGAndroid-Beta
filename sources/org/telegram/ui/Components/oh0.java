package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class oh0 extends ImageReceiver {
    public final qh0 K1;

    public oh0(qh0 qh0Var) {
        super(null);
        this.K1 = qh0Var;
    }

    @Override
    public final boolean y0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        if (drawable != null) {
            this.K1.c();
        }
        return super.y0(drawable, str, i7, z10, i10);
    }
}
