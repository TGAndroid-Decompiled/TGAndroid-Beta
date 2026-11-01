package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class di0 extends ImageReceiver {
    public final fi0 J1;

    public di0(fi0 fi0Var) {
        super(null);
        this.J1 = fi0Var;
    }

    @Override
    public final boolean x0(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.J1.c();
        }
        return super.x0(drawable, str, i10, z10, i11);
    }
}
