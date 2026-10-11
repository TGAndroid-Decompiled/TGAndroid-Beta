package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class fk0 extends ImageReceiver {
    public final hk0 f26368a;

    public fk0(hk0 hk0Var) {
        this.f26368a = hk0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.f26368a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
