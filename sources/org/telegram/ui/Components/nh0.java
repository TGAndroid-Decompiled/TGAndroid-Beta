package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class nh0 extends ImageReceiver {
    public final ph0 K1;

    public nh0(ph0 ph0Var) {
        super(null);
        this.K1 = ph0Var;
    }

    @Override
    public final boolean x0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        if (drawable != null) {
            this.K1.c();
        }
        return super.x0(drawable, str, i7, z10, i10);
    }
}
