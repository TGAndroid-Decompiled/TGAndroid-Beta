package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class hj0 extends ImageReceiver {
    public final jj0 f25428a;

    public hj0(jj0 jj0Var) {
        this.f25428a = jj0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z4, int i11) {
        if (drawable != null) {
            this.f25428a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z4, i11);
    }
}
