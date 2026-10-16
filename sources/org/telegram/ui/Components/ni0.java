package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ni0 implements ImageReceiver.ImageReceiverDelegate {
    public final oi0 f27363a;

    public ni0(oi0 oi0Var) {
        this.f27363a = oi0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        ki0 ki0Var = this.f27363a.h.G0;
        if (ki0Var != null) {
            ki0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
