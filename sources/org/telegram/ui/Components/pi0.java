package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

public final class pi0 extends ImageReceiver {

    public final ri0 f31613a;

    public pi0(ri0 ri0Var) {
        this.f31613a = ri0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.f31613a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
