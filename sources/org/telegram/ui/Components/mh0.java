package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class mh0 implements ImageReceiver.ImageReceiverDelegate {
    public final nh0 f28449a;

    public mh0(nh0 nh0Var) {
        this.f28449a = nh0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.g5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        jh0 jh0Var = this.f28449a.h.G0;
        if (jh0Var != null) {
            jh0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
