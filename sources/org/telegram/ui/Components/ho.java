package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ho implements ImageReceiver.ImageReceiverDelegate {
    public boolean f24727a;
    public final hg.g f24728b;
    public final jo f24729c;

    public ho(hg.i iVar, hg.g gVar) {
        this.f24729c = iVar;
        this.f24728b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        hj0 hj0Var;
        yf.e eVar;
        if (!this.f24727a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f24727a = true;
                boolean z10 = drawable instanceof hj0;
                hg.g gVar = this.f24728b;
                if (z10 && (eVar = (hj0Var = (hj0) drawable).B0) != null && eVar.g()) {
                    hj0Var.A0 = new tc(20, this, gVar);
                    return;
                }
                jo.a(this.f24729c);
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
