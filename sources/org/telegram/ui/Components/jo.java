package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class jo implements ImageReceiver.ImageReceiverDelegate {
    public boolean f25492a;
    public final hg.h f25493b;
    public final lo f25494c;

    public jo(hg.j jVar, hg.h hVar) {
        this.f25494c = jVar;
        this.f25493b = hVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        kj0 kj0Var;
        yf.e eVar;
        if (!this.f25492a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f25492a = true;
                boolean z10 = drawable instanceof kj0;
                hg.h hVar = this.f25493b;
                if (z10 && (eVar = (kj0Var = (kj0) drawable).B0) != null && eVar.g()) {
                    kj0Var.A0 = new uc(20, this, hVar);
                    return;
                }
                lo.a(this.f25494c);
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
