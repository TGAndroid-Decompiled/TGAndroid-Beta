package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ri0 implements ImageReceiver.ImageReceiverDelegate {
    public final si0 f30451a;

    public ri0(si0 si0Var) {
        this.f30451a = si0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        oi0 oi0Var = this.f30451a.h.G0;
        if (oi0Var != null) {
            oi0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
