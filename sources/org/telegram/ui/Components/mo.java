package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class mo implements ImageReceiver.ImageReceiverDelegate {
    public boolean f25261a;
    public final gg.g f25262b;
    public final oo f25263c;

    public mo(gg.i iVar, gg.g gVar) {
        this.f25263c = iVar;
        this.f25262b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        hj0 hj0Var;
        xf.e eVar;
        if (!this.f25261a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f25261a = true;
                boolean z10 = drawable instanceof hj0;
                gg.g gVar = this.f25262b;
                if (z10 && (eVar = (hj0Var = (hj0) drawable).D0) != null && eVar.g()) {
                    hj0Var.C0 = new ee(17, this, gVar);
                    return;
                }
                oo.a(this.f25263c);
                gVar.run();
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
