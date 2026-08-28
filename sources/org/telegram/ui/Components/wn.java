package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class wn implements ImageReceiver.ImageReceiverDelegate {
    public boolean f34296a;
    public final pf.h f34297b;
    public final yn f34298c;

    public wn(pf.j jVar, pf.h hVar) {
        this.f34298c = jVar;
        this.f34297b = hVar;
    }

    @Override
    public final void didSetImageBitmap(int i9, String str, Drawable drawable) {
        mi0 mi0Var;
        ff.h hVar;
        if (!this.f34296a) {
            if ((i9 == 0 || i9 == 3) && drawable != null) {
                this.f34296a = true;
                boolean z10 = drawable instanceof mi0;
                pf.h hVar2 = this.f34297b;
                if (z10 && (hVar = (mi0Var = (mi0) drawable).f30875z0) != null && hVar.g()) {
                    mi0Var.f30874y0 = new org.telegram.ui.wq(26, this, hVar2);
                    return;
                }
                yn.a(this.f34298c);
                hVar2.run();
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
