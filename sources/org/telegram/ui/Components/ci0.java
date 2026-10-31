package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ci0 extends ImageReceiver {
    public final ei0 J1;

    public ci0(ei0 ei0Var) {
        super(null);
        this.J1 = ei0Var;
    }

    @Override
    public final boolean x0(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.J1.c();
        }
        return super.x0(drawable, str, i10, z10, i11);
    }
}
