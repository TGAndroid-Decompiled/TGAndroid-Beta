package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class zj0 extends ImageReceiver {
    public final bk0 f31889a;

    public zj0(bk0 bk0Var) {
        this.f31889a = bk0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.f31889a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
