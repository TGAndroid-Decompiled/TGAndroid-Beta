package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ro implements ImageReceiver.ImageReceiverDelegate {
    public boolean f29983a;
    public final ig.g f29984b;
    public final to f29985c;

    public ro(ig.i iVar, ig.g gVar) {
        this.f29985c = iVar;
        this.f29984b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        vj0 vj0Var;
        zf.e eVar;
        if (!this.f29983a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f29983a = true;
                boolean z10 = drawable instanceof vj0;
                ig.g gVar = this.f29984b;
                if (z10 && (eVar = (vj0Var = (vj0) drawable).B0) != null && eVar.g()) {
                    vj0Var.A0 = new ee(20, this, gVar);
                    return;
                }
                to.a(this.f29985c);
                gVar.run();
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.n5.b(this, imageReceiver);
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
