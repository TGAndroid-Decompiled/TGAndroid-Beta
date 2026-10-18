package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class vj0 extends ImageReceiver {
    public final xj0 f31311a;

    public vj0(xj0 xj0Var) {
        this.f31311a = xj0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.f31311a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
