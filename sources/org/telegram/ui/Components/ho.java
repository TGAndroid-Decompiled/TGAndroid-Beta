package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ho implements ImageReceiver.ImageReceiverDelegate {
    public boolean f24738a;
    public final hg.h f24739b;
    public final jo f24740c;

    public ho(hg.j jVar, hg.h hVar) {
        this.f24740c = jVar;
        this.f24739b = hVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        xi0 xi0Var;
        yf.e eVar;
        if (!this.f24738a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f24738a = true;
                boolean z10 = drawable instanceof xi0;
                hg.h hVar = this.f24739b;
                if (z10 && (eVar = (xi0Var = (xi0) drawable).B0) != null && eVar.g()) {
                    xi0Var.A0 = new oh(14, this, hVar);
                    return;
                }
                jo.a(this.f24740c);
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
