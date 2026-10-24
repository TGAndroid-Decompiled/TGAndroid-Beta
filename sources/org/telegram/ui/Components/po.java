package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class po implements ImageReceiver.ImageReceiverDelegate {
    public boolean f29631a;
    public final ig.g f29632b;
    public final ro f29633c;

    public po(ig.i iVar, ig.g gVar) {
        this.f29633c = iVar;
        this.f29632b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        xj0 xj0Var;
        zf.e eVar;
        if (!this.f29631a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f29631a = true;
                boolean z10 = drawable instanceof xj0;
                ig.g gVar = this.f29632b;
                if (z10 && (eVar = (xj0Var = (xj0) drawable).B0) != null && eVar.g()) {
                    xj0Var.A0 = new ce(20, this, gVar);
                    return;
                }
                ro.a(this.f29633c);
                gVar.run();
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.n5.b(this, imageReceiver);
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
