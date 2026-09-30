package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ai0 implements ImageReceiver.ImageReceiverDelegate {
    public final bi0 f22636a;

    public ai0(bi0 bi0Var) {
        this.f22636a = bi0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        xh0 xh0Var = this.f22636a.h.G0;
        if (xh0Var != null) {
            xh0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
