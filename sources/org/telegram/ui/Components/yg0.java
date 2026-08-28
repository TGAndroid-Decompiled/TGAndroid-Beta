package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class yg0 implements ImageReceiver.ImageReceiverDelegate {
    public final zg0 f34968a;

    public yg0(zg0 zg0Var) {
        this.f34968a = zg0Var;
    }

    @Override
    public final void didSetImageBitmap(int i9, String str, Drawable drawable) {
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        vg0 vg0Var = this.f34968a.h.C0;
        if (vg0Var != null) {
            vg0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
