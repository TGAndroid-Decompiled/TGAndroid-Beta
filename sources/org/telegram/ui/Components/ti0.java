package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ti0 implements ImageReceiver.ImageReceiverDelegate {
    public final ui0 f31104a;

    public ti0(ui0 ui0Var) {
        this.f31104a = ui0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        qi0 qi0Var = this.f31104a.h.G0;
        if (qi0Var != null) {
            qi0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
