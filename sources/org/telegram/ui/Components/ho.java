package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ho implements ImageReceiver.ImageReceiverDelegate {
    public boolean f24707a;
    public final hg.g f24708b;
    public final jo f24709c;

    public ho(hg.i iVar, hg.g gVar) {
        this.f24709c = iVar;
        this.f24708b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        ij0 ij0Var;
        yf.e eVar;
        if (!this.f24707a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f24707a = true;
                boolean z10 = drawable instanceof ij0;
                hg.g gVar = this.f24708b;
                if (z10 && (eVar = (ij0Var = (ij0) drawable).B0) != null && eVar.g()) {
                    ij0Var.A0 = new zd(18, this, gVar);
                    return;
                }
                jo.a(this.f24709c);
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
