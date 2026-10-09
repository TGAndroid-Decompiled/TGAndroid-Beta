package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class xo implements ImageReceiver.ImageReceiverDelegate {
    public boolean f32984a;
    public final hg.h f32985b;
    public final zo f32986c;

    public xo(hg.j jVar, hg.h hVar) {
        this.f32986c = jVar;
        this.f32985b = hVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        ck0 ck0Var;
        yf.e eVar;
        if (!this.f32984a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f32984a = true;
                boolean z10 = drawable instanceof ck0;
                hg.h hVar = this.f32985b;
                if (z10 && (eVar = (ck0Var = (ck0) drawable).B0) != null && eVar.g()) {
                    ck0Var.A0 = new ea(25, this, hVar);
                    return;
                }
                zo.a(this.f32986c);
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
