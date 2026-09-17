package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class nh0 implements ImageReceiver.ImageReceiverDelegate {
    public final oh0 f26458a;

    public nh0(oh0 oh0Var) {
        this.f26458a = oh0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        kh0 kh0Var = this.f26458a.h.G0;
        if (kh0Var != null) {
            kh0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
