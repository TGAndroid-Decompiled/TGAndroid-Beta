package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class to implements ImageReceiver.ImageReceiverDelegate {
    public boolean f33114a;
    public final jg.g f33115b;
    public final vo f33116c;

    public to(jg.j jVar, jg.g gVar) {
        this.f33116c = jVar;
        this.f33115b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        xj0 xj0Var;
        ag.k kVar;
        if (!this.f33114a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f33114a = true;
                boolean z10 = drawable instanceof xj0;
                jg.g gVar = this.f33115b;
                if (z10 && (kVar = (xj0Var = (xj0) drawable).B0) != null && kVar.g()) {
                    xj0Var.A0 = new so(0, this, gVar);
                    return;
                }
                vo.a(this.f33116c);
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
