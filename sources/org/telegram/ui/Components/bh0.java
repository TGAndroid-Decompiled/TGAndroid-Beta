package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class bh0 extends ImageReceiver {
    public final dh0 J1;

    public bh0(dh0 dh0Var) {
        super(null);
        this.J1 = dh0Var;
    }

    @Override
    public final boolean x0(Drawable drawable, String str, int i7, boolean z9, int i10) {
        if (drawable != null) {
            this.J1.c();
        }
        return super.x0(drawable, str, i7, z9, i10);
    }
}
