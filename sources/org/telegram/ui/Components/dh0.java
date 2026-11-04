package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class dh0 extends ImageReceiver {
    public final fh0 K1;

    public dh0(fh0 fh0Var) {
        super(null);
        this.K1 = fh0Var;
    }

    @Override
    public final boolean x0(Drawable drawable, String str, int i3, boolean z10, int i10) {
        if (drawable != null) {
            this.K1.c();
        }
        return super.x0(drawable, str, i3, z10, i10);
    }
}
