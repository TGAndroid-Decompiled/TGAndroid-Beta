package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

public final class un implements ImageReceiver.ImageReceiverDelegate {

    public boolean f33137a;

    public final qf.i f33138b;

    public final wn f33139c;

    public un(qf.k kVar, qf.i iVar) {
        this.f33139c = kVar;
        this.f33138b = iVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        oi0 oi0Var;
        gf.h hVar;
        if (this.f33137a) {
            return;
        }
        if ((i10 == 0 || i10 == 3) && drawable != null) {
            this.f33137a = true;
            boolean z10 = drawable instanceof oi0;
            qf.i iVar = this.f33138b;
            if (z10 && (hVar = (oi0Var = (oi0) drawable).f31340z0) != null && hVar.g()) {
                oi0Var.f31339y0 = new org.telegram.ui.yq(26, this, iVar);
            } else {
                wn.a(this.f33139c);
                iVar.run();
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
