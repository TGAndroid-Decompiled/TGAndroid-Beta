package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ji0 implements ImageReceiver.ImageReceiverDelegate {
    public final ki0 f27540a;

    public ji0(ki0 ki0Var) {
        this.f27540a = ki0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.n5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        gi0 gi0Var = this.f27540a.h.G0;
        if (gi0Var != null) {
            gi0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
