package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ao implements ImageReceiver.ImageReceiverDelegate {
    public boolean f26807a;
    public final sf.h f26808b;
    public final co f26809c;

    public ao(sf.j jVar, sf.h hVar) {
        this.f26809c = jVar;
        this.f26808b = hVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        xi0 xi0Var;
        jf.g gVar;
        if (!this.f26807a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f26807a = true;
                boolean z10 = drawable instanceof xi0;
                sf.h hVar = this.f26808b;
                if (z10 && (gVar = (xi0Var = (xi0) drawable).f34765z0) != null && gVar.g()) {
                    xi0Var.f34764y0 = new z2(23, this, hVar);
                    return;
                }
                co.a(this.f26809c);
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
