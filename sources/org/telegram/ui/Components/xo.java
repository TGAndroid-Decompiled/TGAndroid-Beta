package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class xo implements ImageReceiver.ImageReceiverDelegate {
    public boolean f33005a;
    public final hg.h f33006b;
    public final zo f33007c;

    public xo(hg.j jVar, hg.h hVar) {
        this.f33007c = jVar;
        this.f33006b = hVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        dk0 dk0Var;
        yf.e eVar;
        if (!this.f33005a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f33005a = true;
                boolean z10 = drawable instanceof dk0;
                hg.h hVar = this.f33006b;
                if (z10 && (eVar = (dk0Var = (dk0) drawable).B0) != null && eVar.g()) {
                    dk0Var.A0 = new ea(25, this, hVar);
                    return;
                }
                zo.a(this.f33007c);
                hVar.run();
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
