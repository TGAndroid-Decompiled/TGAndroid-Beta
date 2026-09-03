package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class bo implements ImageReceiver.ImageReceiverDelegate {
    public boolean f23725a;
    public final uf.g f23726b;
    public final eo f23727c;

    public bo(uf.i iVar, uf.g gVar) {
        this.f23727c = iVar;
        this.f23726b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        gj0 gj0Var;
        kf.g gVar;
        if (!this.f23725a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f23725a = true;
                boolean z4 = drawable instanceof gj0;
                uf.g gVar2 = this.f23726b;
                if (z4 && (gVar = (gj0Var = (gj0) drawable).A0) != null && gVar.g()) {
                    gj0Var.f25186z0 = new em(1, this, gVar2);
                    return;
                }
                eo.a(this.f23727c);
                gVar2.run();
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
    }
}
