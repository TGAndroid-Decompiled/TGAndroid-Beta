package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class zo implements ImageReceiver.ImageReceiverDelegate {
    public boolean f33462a;
    public final hg.h f33463b;
    public final bp f33464c;

    public zo(hg.j jVar, hg.h hVar) {
        this.f33464c = jVar;
        this.f33463b = hVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        fk0 fk0Var;
        yf.e eVar;
        if (!this.f33462a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f33462a = true;
                boolean z10 = drawable instanceof fk0;
                hg.h hVar = this.f33463b;
                if (z10 && (eVar = (fk0Var = (fk0) drawable).B0) != null && eVar.g()) {
                    fk0Var.A0 = new md(22, this, hVar);
                    return;
                }
                bp.a(this.f33464c);
                hVar.run();
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
