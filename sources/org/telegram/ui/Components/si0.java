package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class si0 implements ImageReceiver.ImageReceiverDelegate {
    public final ti0 f30793a;

    public si0(ti0 ti0Var) {
        this.f30793a = ti0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        pi0 pi0Var = this.f30793a.h.G0;
        if (pi0Var != null) {
            pi0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
