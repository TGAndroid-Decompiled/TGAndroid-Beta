package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class uo implements ImageReceiver.ImageReceiverDelegate {
    public boolean f29740a;
    public final ig.g f29741b;
    public final wo f29742c;

    public uo(ig.i iVar, ig.g gVar) {
        this.f29742c = iVar;
        this.f29741b = gVar;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        yj0 yj0Var;
        zf.f fVar;
        if (!this.f29740a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f29740a = true;
                boolean z10 = drawable instanceof yj0;
                ig.g gVar = this.f29741b;
                if (z10 && (fVar = (yj0Var = (yj0) drawable).B0) != null && fVar.g()) {
                    yj0Var.A0 = new sk(6, this, gVar);
                    return;
                }
                wo.a(this.f29742c);
                gVar.run();
            }
        }
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
