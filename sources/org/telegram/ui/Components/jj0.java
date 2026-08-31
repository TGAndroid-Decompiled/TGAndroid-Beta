package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class jj0 extends ImageReceiver {
    public final lj0 f28137a;

    public jj0(lj0 lj0Var) {
        this.f28137a = lj0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z4, int i11) {
        if (drawable != null) {
            this.f28137a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z4, i11);
    }
}
