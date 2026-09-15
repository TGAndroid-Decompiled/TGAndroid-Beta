package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ho implements ImageReceiver.ImageReceiverDelegate {
    public boolean f24732a;
    public final hg.g f24733b;
    public final jo f24734c;

    public ho(hg.i iVar, hg.g gVar) {
        this.f24734c = iVar;
        this.f24733b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        xi0 xi0Var;
        yf.e eVar;
        if (!this.f24732a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f24732a = true;
                boolean z10 = drawable instanceof xi0;
                hg.g gVar = this.f24733b;
                if (z10 && (eVar = (xi0Var = (xi0) drawable).D0) != null && eVar.g()) {
                    xi0Var.C0 = new oh(14, this, gVar);
                    return;
                }
                jo.a(this.f24734c);
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
