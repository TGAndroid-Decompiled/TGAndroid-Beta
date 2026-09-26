package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class yh0 implements ImageReceiver.ImageReceiverDelegate {
    public final zh0 f30644a;

    public yh0(zh0 zh0Var) {
        this.f30644a = zh0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        vh0 vh0Var = this.f30644a.h.G0;
        if (vh0Var != null) {
            vh0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
