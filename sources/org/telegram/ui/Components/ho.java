package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ho implements ImageReceiver.ImageReceiverDelegate {
    public boolean f24858a;
    public final hg.g f24859b;
    public final jo f24860c;

    public ho(hg.i iVar, hg.g gVar) {
        this.f24860c = iVar;
        this.f24859b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        kj0 kj0Var;
        yf.e eVar;
        if (!this.f24858a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f24858a = true;
                boolean z10 = drawable instanceof kj0;
                hg.g gVar = this.f24859b;
                if (z10 && (eVar = (kj0Var = (kj0) drawable).B0) != null && eVar.g()) {
                    kj0Var.A0 = new tc(20, this, gVar);
                    return;
                }
                jo.a(this.f24860c);
                gVar.run();
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
