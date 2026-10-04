package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ko implements ImageReceiver.ImageReceiverDelegate {
    public boolean f28173a;
    public final hg.g f28174b;
    public final mo f28175c;

    public ko(hg.i iVar, hg.g gVar) {
        this.f28175c = iVar;
        this.f28174b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        kj0 kj0Var;
        yf.e eVar;
        if (!this.f28173a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f28173a = true;
                boolean z10 = drawable instanceof kj0;
                hg.g gVar = this.f28174b;
                if (z10 && (eVar = (kj0Var = (kj0) drawable).B0) != null && eVar.g()) {
                    kj0Var.A0 = new be(17, this, gVar);
                    return;
                }
                mo.a(this.f28175c);
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
