package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class wh0 implements ImageReceiver.ImageReceiverDelegate {
    public final xh0 f28775a;

    public wh0(xh0 xh0Var) {
        this.f28775a = xh0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        th0 th0Var = this.f28775a.h.G0;
        if (th0Var != null) {
            th0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
