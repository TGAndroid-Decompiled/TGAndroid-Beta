package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class to implements ImageReceiver.ImageReceiverDelegate {
    public boolean f33117a;
    public final jg.g f33118b;
    public final vo f33119c;

    public to(jg.j jVar, jg.g gVar) {
        this.f33119c = jVar;
        this.f33118b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        xj0 xj0Var;
        ag.k kVar;
        if (!this.f33117a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f33117a = true;
                boolean z10 = drawable instanceof xj0;
                jg.g gVar = this.f33118b;
                if (z10 && (kVar = (xj0Var = (xj0) drawable).B0) != null && kVar.g()) {
                    xj0Var.A0 = new so(0, this, gVar);
                    return;
                }
                vo.a(this.f33119c);
                gVar.run();
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.o5.b(this, imageReceiver);
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
