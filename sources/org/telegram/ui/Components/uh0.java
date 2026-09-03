package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class uh0 implements ImageReceiver.ImageReceiverDelegate {
    public final vh0 f29214a;

    public uh0(vh0 vh0Var) {
        this.f29214a = vh0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        rh0 rh0Var = this.f29214a.h.D0;
        if (rh0Var != null) {
            rh0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
    }
}
