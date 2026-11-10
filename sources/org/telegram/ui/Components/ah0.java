package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ah0 extends ImageReceiver {
    public final ch0 J1;

    public ah0(ch0 ch0Var) {
        super(null);
        this.J1 = ch0Var;
    }

    @Override
    public final boolean x0(Drawable drawable, String str, int i7, boolean z9, int i10) {
        if (drawable != null) {
            this.J1.c();
        }
        return super.x0(drawable, str, i7, z9, i10);
    }
}
