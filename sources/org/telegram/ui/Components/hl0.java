package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class hl0 extends ImageReceiver {
    public final int f27076a;

    public hl0(int i10, View view) {
        super(view);
        this.f27076a = i10;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        switch (this.f27076a) {
            case 0:
                if (drawable instanceof dk0) {
                    ((dk0) drawable).N(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (imageBitmapByKey && (drawable instanceof dk0)) {
                    dk0 dk0Var = (dk0) drawable;
                    dk0Var.N(0, false, true);
                    dk0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
