package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class gk0 extends ImageReceiver {
    public final ik0 f26450a;

    public gk0(ik0 ik0Var) {
        this.f26450a = ik0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.f26450a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
