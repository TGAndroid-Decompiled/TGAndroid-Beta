package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class yk0 extends ImageReceiver {
    public final int f32682a;

    public yk0(int i10, View view) {
        super(view);
        this.f32682a = i10;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        switch (this.f32682a) {
            case 0:
                if (drawable instanceof uj0) {
                    ((uj0) drawable).N(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (imageBitmapByKey && (drawable instanceof uj0)) {
                    uj0 uj0Var = (uj0) drawable;
                    uj0Var.N(0, false, true);
                    uj0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
