package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class yi0 extends ImageReceiver {
    public final aj0 f32957a;

    public yi0(aj0 aj0Var) {
        this.f32957a = aj0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.f32957a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
