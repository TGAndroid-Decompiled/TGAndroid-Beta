package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class jo implements ImageReceiver.ImageReceiverDelegate {
    public boolean f25493a;
    public final hg.h f25494b;
    public final lo f25495c;

    public jo(hg.j jVar, hg.h hVar) {
        this.f25495c = jVar;
        this.f25494b = hVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        kj0 kj0Var;
        yf.e eVar;
        if (!this.f25493a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f25493a = true;
                boolean z10 = drawable instanceof kj0;
                hg.h hVar = this.f25494b;
                if (z10 && (eVar = (kj0Var = (kj0) drawable).B0) != null && eVar.g()) {
                    kj0Var.A0 = new kd(19, this, hVar);
                    return;
                }
                lo.a(this.f25495c);
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
