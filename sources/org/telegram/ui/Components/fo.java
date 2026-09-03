package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class fo implements ImageReceiver.ImageReceiverDelegate {
    public boolean f26969a;
    public final vf.g f26970b;
    public final ho f26971c;

    public fo(vf.i iVar, vf.g gVar) {
        this.f26971c = iVar;
        this.f26970b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        hj0 hj0Var;
        lf.g gVar;
        if (!this.f26969a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f26969a = true;
                boolean z4 = drawable instanceof hj0;
                vf.g gVar2 = this.f26970b;
                if (z4 && (gVar = (hj0Var = (hj0) drawable).A0) != null && gVar.g()) {
                    hj0Var.f27552z0 = new eo(0, this, gVar2);
                    return;
                }
                ho.a(this.f26971c);
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
