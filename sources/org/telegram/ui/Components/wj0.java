package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class wj0 extends ImageReceiver {
    public final yj0 f32142a;

    public wj0(yj0 yj0Var) {
        this.f32142a = yj0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.f32142a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
