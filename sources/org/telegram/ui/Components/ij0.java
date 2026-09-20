package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ij0 extends ImageReceiver {
    public final kj0 f25064a;

    public ij0(kj0 kj0Var) {
        this.f25064a = kj0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.f25064a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
