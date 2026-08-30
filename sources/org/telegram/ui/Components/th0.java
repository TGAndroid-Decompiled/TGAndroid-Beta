package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class th0 implements ImageReceiver.ImageReceiverDelegate {
    public final uh0 f28979a;

    public th0(uh0 uh0Var) {
        this.f28979a = uh0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        qh0 qh0Var = this.f28979a.h.D0;
        if (qh0Var != null) {
            qh0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
    }
}
