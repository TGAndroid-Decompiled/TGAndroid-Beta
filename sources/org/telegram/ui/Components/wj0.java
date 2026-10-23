package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class wj0 extends ImageReceiver {
    public final yj0 f32146a;

    public wj0(yj0 yj0Var) {
        this.f32146a = yj0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.f32146a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
