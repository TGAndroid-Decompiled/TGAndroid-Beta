package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class io implements ImageReceiver.ImageReceiverDelegate {
    public boolean f25014a;
    public final hg.h f25015b;
    public final ko f25016c;

    public io(hg.j jVar, hg.h hVar) {
        this.f25016c = jVar;
        this.f25015b = hVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        yi0 yi0Var;
        yf.e eVar;
        if (!this.f25014a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f25014a = true;
                boolean z10 = drawable instanceof yi0;
                hg.h hVar = this.f25015b;
                if (z10 && (eVar = (yi0Var = (yi0) drawable).B0) != null && eVar.g()) {
                    yi0Var.A0 = new ph(14, this, hVar);
                    return;
                }
                ko.a(this.f25016c);
                hVar.run();
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
