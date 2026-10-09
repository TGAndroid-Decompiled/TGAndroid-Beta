package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class gl0 extends ImageReceiver {
    public final int f26799a;

    public gl0(int i10, View view) {
        super(view);
        this.f26799a = i10;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        switch (this.f26799a) {
            case 0:
                if (drawable instanceof ck0) {
                    ((ck0) drawable).N(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (imageBitmapByKey && (drawable instanceof ck0)) {
                    ck0 ck0Var = (ck0) drawable;
                    ck0Var.N(0, false, true);
                    ck0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
