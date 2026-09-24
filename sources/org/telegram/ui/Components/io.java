package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class io implements ImageReceiver.ImageReceiverDelegate {
    public boolean f25103a;
    public final hg.h f25104b;
    public final ko f25105c;

    public io(hg.j jVar, hg.h hVar) {
        this.f25105c = jVar;
        this.f25104b = hVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        ij0 ij0Var;
        yf.e eVar;
        if (!this.f25103a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f25103a = true;
                boolean z10 = drawable instanceof ij0;
                hg.h hVar = this.f25104b;
                if (z10 && (eVar = (ij0Var = (ij0) drawable).B0) != null && eVar.g()) {
                    ij0Var.A0 = new uc(20, this, hVar);
                    return;
                }
                ko.a(this.f25105c);
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
