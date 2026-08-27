package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

public final class ah0 implements ImageReceiver.ImageReceiverDelegate {

    public final bh0 f26745a;

    public ah0(bh0 bh0Var) {
        this.f26745a = bh0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        xg0 xg0Var = this.f26745a.h.C0;
        if (xg0Var != null) {
            xg0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
