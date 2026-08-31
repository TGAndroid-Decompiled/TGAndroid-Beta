package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class fo implements ImageReceiver.ImageReceiverDelegate {
    public boolean f26968a;
    public final vf.g f26969b;
    public final ho f26970c;

    public fo(vf.i iVar, vf.g gVar) {
        this.f26970c = iVar;
        this.f26969b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        ij0 ij0Var;
        lf.g gVar;
        if (!this.f26968a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f26968a = true;
                boolean z4 = drawable instanceof ij0;
                vf.g gVar2 = this.f26969b;
                if (z4 && (gVar = (ij0Var = (ij0) drawable).A0) != null && gVar.g()) {
                    ij0Var.f27845z0 = new gm(1, this, gVar2);
                    return;
                }
                ho.a(this.f26970c);
                gVar2.run();
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
    }
}
