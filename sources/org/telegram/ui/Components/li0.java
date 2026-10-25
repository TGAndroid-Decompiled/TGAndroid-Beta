package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class li0 implements ImageReceiver.ImageReceiverDelegate {
    public final mi0 f30216a;

    public li0(mi0 mi0Var) {
        this.f30216a = mi0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.o5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        ii0 ii0Var = this.f30216a.h.G0;
        if (ii0Var != null) {
            ii0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
