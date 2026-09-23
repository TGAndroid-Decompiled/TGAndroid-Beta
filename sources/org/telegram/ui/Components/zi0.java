package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class zi0 extends ImageReceiver {
    public final bj0 f30606a;

    public zi0(bj0 bj0Var) {
        this.f30606a = bj0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.f30606a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
