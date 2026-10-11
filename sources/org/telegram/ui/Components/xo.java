package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class xo implements ImageReceiver.ImageReceiverDelegate {
    public boolean f33043a;
    public final hg.h f33044b;
    public final zo f33045c;

    public xo(hg.j jVar, hg.h hVar) {
        this.f33045c = jVar;
        this.f33044b = hVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        dk0 dk0Var;
        yf.e eVar;
        if (!this.f33043a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f33043a = true;
                boolean z10 = drawable instanceof dk0;
                hg.h hVar = this.f33044b;
                if (z10 && (eVar = (dk0Var = (dk0) drawable).B0) != null && eVar.g()) {
                    dk0Var.A0 = new wc(24, this, hVar);
                    return;
                }
                zo.a(this.f33045c);
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
