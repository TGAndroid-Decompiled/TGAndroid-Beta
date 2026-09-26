package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class xh0 implements ImageReceiver.ImageReceiverDelegate {
    public final yh0 f30342a;

    public xh0(yh0 yh0Var) {
        this.f30342a = yh0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        uh0 uh0Var = this.f30342a.h.G0;
        if (uh0Var != null) {
            uh0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
