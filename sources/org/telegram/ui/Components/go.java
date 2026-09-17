package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class go implements ImageReceiver.ImageReceiverDelegate {
    public boolean f26497a;
    public final ig.g f26498b;
    public final io f26499c;

    public go(ig.i iVar, ig.g gVar) {
        this.f26499c = iVar;
        this.f26498b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        xi0 xi0Var;
        yf.e eVar;
        if (!this.f26497a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f26497a = true;
                boolean z10 = drawable instanceof xi0;
                ig.g gVar = this.f26498b;
                if (z10 && (eVar = (xi0Var = (xi0) drawable).D0) != null && eVar.g()) {
                    xi0Var.C0 = new uc(20, this, gVar);
                    return;
                }
                io.a(this.f26499c);
                gVar.run();
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
