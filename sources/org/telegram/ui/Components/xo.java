package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class xo implements ImageReceiver.ImageReceiverDelegate {
    public boolean f32995a;
    public final hg.h f32996b;
    public final zo f32997c;

    public xo(hg.j jVar, hg.h hVar) {
        this.f32997c = jVar;
        this.f32996b = hVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        ek0 ek0Var;
        yf.e eVar;
        if (!this.f32995a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f32995a = true;
                boolean z10 = drawable instanceof ek0;
                hg.h hVar = this.f32996b;
                if (z10 && (eVar = (ek0Var = (ek0) drawable).B0) != null && eVar.g()) {
                    ek0Var.A0 = new wc(24, this, hVar);
                    return;
                }
                zo.a(this.f32997c);
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
