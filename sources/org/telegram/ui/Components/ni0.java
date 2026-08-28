package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ni0 extends ImageReceiver {
    public final pi0 f31118a;

    public ni0(pi0 pi0Var) {
        this.f31118a = pi0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i9, boolean z10, int i10) {
        if (drawable != null) {
            this.f31118a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i9, z10, i10);
    }
}
