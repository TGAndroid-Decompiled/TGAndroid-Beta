package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ih0 implements ImageReceiver.ImageReceiverDelegate {
    public final jh0 f29392a;

    public ih0(jh0 jh0Var) {
        this.f29392a = jh0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        fh0 fh0Var = this.f29392a.h.C0;
        if (fh0Var != null) {
            fh0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
