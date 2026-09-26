package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class jj0 extends ImageReceiver {
    public final lj0 f25437a;

    public jj0(lj0 lj0Var) {
        this.f25437a = lj0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.f25437a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
