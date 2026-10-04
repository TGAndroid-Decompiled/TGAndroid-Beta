package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ko implements ImageReceiver.ImageReceiverDelegate {
    public boolean f28178a;
    public final hg.h f28179b;
    public final mo f28180c;

    public ko(hg.j jVar, hg.h hVar) {
        this.f28180c = jVar;
        this.f28179b = hVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        kj0 kj0Var;
        yf.e eVar;
        if (!this.f28178a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f28178a = true;
                boolean z10 = drawable instanceof kj0;
                hg.h hVar = this.f28179b;
                if (z10 && (eVar = (kj0Var = (kj0) drawable).B0) != null && eVar.g()) {
                    kj0Var.A0 = new be(17, this, hVar);
                    return;
                }
                mo.a(this.f28180c);
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
