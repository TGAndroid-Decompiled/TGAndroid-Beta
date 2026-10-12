package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class cl0 extends ImageReceiver {
    public final int f24115a;

    public cl0(int i10, View view) {
        super(view);
        this.f24115a = i10;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        switch (this.f24115a) {
            case 0:
                if (drawable instanceof yj0) {
                    ((yj0) drawable).N(0, false, true);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            default:
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (imageBitmapByKey && (drawable instanceof yj0)) {
                    yj0 yj0Var = (yj0) drawable;
                    yj0Var.N(0, false, true);
                    yj0Var.stop();
                }
                return imageBitmapByKey;
        }
    }
}
