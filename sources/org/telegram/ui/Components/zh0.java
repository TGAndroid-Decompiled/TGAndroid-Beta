package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class zh0 implements ImageReceiver.ImageReceiverDelegate {
    public final ai0 f30892a;

    public zh0(ai0 ai0Var) {
        this.f30892a = ai0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        wh0 wh0Var = this.f30892a.h.G0;
        if (wh0Var != null) {
            wh0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
