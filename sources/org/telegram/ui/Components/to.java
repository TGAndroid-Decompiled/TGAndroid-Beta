package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class to implements ImageReceiver.ImageReceiverDelegate {
    public boolean f33112a;
    public final jg.g f33113b;
    public final vo f33114c;

    public to(jg.j jVar, jg.g gVar) {
        this.f33114c = jVar;
        this.f33113b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        yj0 yj0Var;
        ag.k kVar;
        if (!this.f33112a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f33112a = true;
                boolean z10 = drawable instanceof yj0;
                jg.g gVar = this.f33113b;
                if (z10 && (kVar = (yj0Var = (yj0) drawable).B0) != null && kVar.g()) {
                    yj0Var.A0 = new so(0, this, gVar);
                    return;
                }
                vo.a(this.f33114c);
                gVar.run();
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.p5.b(this, imageReceiver);
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
