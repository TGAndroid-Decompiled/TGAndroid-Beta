package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class lj0 extends ImageReceiver {
    public final nj0 f26130a;

    public lj0(nj0 nj0Var) {
        this.f26130a = nj0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.f26130a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
