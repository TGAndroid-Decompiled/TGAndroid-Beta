package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class jj0 extends ImageReceiver {
    public final lj0 f25438a;

    public jj0(lj0 lj0Var) {
        this.f25438a = lj0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.f25438a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
