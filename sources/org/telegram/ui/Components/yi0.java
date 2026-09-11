package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class yi0 extends ImageReceiver {
    public final aj0 f32930a;

    public yi0(aj0 aj0Var) {
        this.f32930a = aj0Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable != null) {
            this.f32930a.c();
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
