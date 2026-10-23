package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ro implements ImageReceiver.ImageReceiverDelegate {
    public boolean f30235a;
    public final ig.g f30236b;
    public final to f30237c;

    public ro(ig.i iVar, ig.g gVar) {
        this.f30237c = iVar;
        this.f30236b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        yj0 yj0Var;
        zf.e eVar;
        if (!this.f30235a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f30235a = true;
                boolean z10 = drawable instanceof yj0;
                ig.g gVar = this.f30236b;
                if (z10 && (eVar = (yj0Var = (yj0) drawable).B0) != null && eVar.g()) {
                    yj0Var.A0 = new ee(20, this, gVar);
                    return;
                }
                to.a(this.f30237c);
                gVar.run();
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
