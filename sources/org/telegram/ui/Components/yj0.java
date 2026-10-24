package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class yj0 extends ImageReceiver {
    public final ak0 f32941a;

    public yj0(ak0 ak0Var) {
        this.f32941a = ak0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.f32941a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
