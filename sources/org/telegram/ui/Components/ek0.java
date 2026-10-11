package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ek0 extends ImageReceiver {
    public final gk0 f26112a;

    public ek0(gk0 gk0Var) {
        this.f26112a = gk0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.f26112a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
