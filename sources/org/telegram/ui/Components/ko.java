package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ko implements ImageReceiver.ImageReceiverDelegate {
    public boolean f25801a;
    public final hg.h f25802b;
    public final mo f25803c;

    public ko(hg.j jVar, hg.h hVar) {
        this.f25803c = jVar;
        this.f25802b = hVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        lj0 lj0Var;
        yf.e eVar;
        if (!this.f25801a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f25801a = true;
                boolean z10 = drawable instanceof lj0;
                hg.h hVar = this.f25802b;
                if (z10 && (eVar = (lj0Var = (lj0) drawable).B0) != null && eVar.g()) {
                    lj0Var.A0 = new ld(19, this, hVar);
                    return;
                }
                mo.a(this.f25803c);
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
