package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ro implements ImageReceiver.ImageReceiverDelegate {
    public boolean f29998a;
    public final ig.g f29999b;
    public final to f30000c;

    public ro(ig.i iVar, ig.g gVar) {
        this.f30000c = iVar;
        this.f29999b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        uj0 uj0Var;
        zf.e eVar;
        if (!this.f29998a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f29998a = true;
                boolean z10 = drawable instanceof uj0;
                ig.g gVar = this.f29999b;
                if (z10 && (eVar = (uj0Var = (uj0) drawable).B0) != null && eVar.g()) {
                    uj0Var.A0 = new ee(20, this, gVar);
                    return;
                }
                to.a(this.f30000c);
                gVar.run();
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.k5.b(this, imageReceiver);
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
