package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class kj0 extends ImageReceiver {
    public final mj0 f25744a;

    public kj0(mj0 mj0Var) {
        this.f25744a = mj0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.f25744a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
