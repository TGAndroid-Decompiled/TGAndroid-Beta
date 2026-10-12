package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class zo implements ImageReceiver.ImageReceiverDelegate {
    public boolean f33464a;
    public final hg.h f33465b;
    public final bp f33466c;

    public zo(hg.j jVar, hg.h hVar) {
        this.f33466c = jVar;
        this.f33465b = hVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        fk0 fk0Var;
        yf.e eVar;
        if (!this.f33464a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f33464a = true;
                boolean z10 = drawable instanceof fk0;
                hg.h hVar = this.f33465b;
                if (z10 && (eVar = (fk0Var = (fk0) drawable).B0) != null && eVar.g()) {
                    fk0Var.A0 = new md(23, this, hVar);
                    return;
                }
                bp.a(this.f33466c);
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
