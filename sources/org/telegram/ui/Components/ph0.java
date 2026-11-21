package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ph0 extends ImageReceiver {
    public final rh0 K1;

    public ph0(rh0 rh0Var) {
        super(null);
        this.K1 = rh0Var;
    }

    @Override
    public final boolean x0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        if (drawable != null) {
            this.K1.c();
        }
        return super.x0(drawable, str, i7, z10, i10);
    }
}
