package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ij0 extends ImageReceiver {
    public final kj0 f27843a;

    public ij0(kj0 kj0Var) {
        this.f27843a = kj0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z4, int i11) {
        if (drawable != null) {
            this.f27843a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z4, i11);
    }
}
