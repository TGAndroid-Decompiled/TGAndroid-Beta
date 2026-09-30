package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class mj0 extends ImageReceiver {
    public final oj0 f26309a;

    public mj0(oj0 oj0Var) {
        this.f26309a = oj0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.f26309a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
