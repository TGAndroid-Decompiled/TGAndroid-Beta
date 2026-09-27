package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class jo implements ImageReceiver.ImageReceiverDelegate {
    public boolean f25514a;
    public final hg.g f25515b;
    public final lo f25516c;

    public jo(hg.i iVar, hg.g gVar) {
        this.f25516c = iVar;
        this.f25515b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        kj0 kj0Var;
        yf.e eVar;
        if (!this.f25514a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f25514a = true;
                boolean z10 = drawable instanceof kj0;
                hg.g gVar = this.f25515b;
                if (z10 && (eVar = (kj0Var = (kj0) drawable).B0) != null && eVar.g()) {
                    kj0Var.A0 = new fe(16, this, gVar);
                    return;
                }
                lo.a(this.f25516c);
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
