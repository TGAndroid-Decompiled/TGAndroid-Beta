package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class jo implements ImageReceiver.ImageReceiverDelegate {
    public boolean f25483a;
    public final hg.h f25484b;
    public final lo f25485c;

    public jo(hg.j jVar, hg.h hVar) {
        this.f25485c = jVar;
        this.f25484b = hVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        jj0 jj0Var;
        yf.e eVar;
        if (!this.f25483a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f25483a = true;
                boolean z10 = drawable instanceof jj0;
                hg.h hVar = this.f25484b;
                if (z10 && (eVar = (jj0Var = (jj0) drawable).B0) != null && eVar.g()) {
                    jj0Var.A0 = new kd(19, this, hVar);
                    return;
                }
                lo.a(this.f25485c);
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
