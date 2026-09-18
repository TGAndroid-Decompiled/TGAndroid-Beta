package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ho implements ImageReceiver.ImageReceiverDelegate {
    public boolean f24703a;
    public final hg.g f24704b;
    public final jo f24705c;

    public ho(hg.i iVar, hg.g gVar) {
        this.f24705c = iVar;
        this.f24704b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        yi0 yi0Var;
        yf.e eVar;
        if (!this.f24703a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f24703a = true;
                boolean z10 = drawable instanceof yi0;
                hg.g gVar = this.f24704b;
                if (z10 && (eVar = (yi0Var = (yi0) drawable).B0) != null && eVar.g()) {
                    yi0Var.A0 = new oh(14, this, gVar);
                    return;
                }
                jo.a(this.f24705c);
                gVar.run();
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
