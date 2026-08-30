package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class co implements ImageReceiver.ImageReceiverDelegate {
    public boolean f24028a;
    public final uf.g f24029b;
    public final fo f24030c;

    public co(uf.i iVar, uf.g gVar) {
        this.f24030c = iVar;
        this.f24029b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        gj0 gj0Var;
        lf.g gVar;
        if (!this.f24028a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f24028a = true;
                boolean z4 = drawable instanceof gj0;
                uf.g gVar2 = this.f24029b;
                if (z4 && (gVar = (gj0Var = (gj0) drawable).A0) != null && gVar.g()) {
                    gj0Var.f25180z0 = new il(2, this, gVar2);
                    return;
                }
                fo.a(this.f24030c);
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
