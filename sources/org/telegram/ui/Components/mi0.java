package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class mi0 implements ImageReceiver.ImageReceiverDelegate {
    public final ni0 f30545a;

    public mi0(ni0 ni0Var) {
        this.f30545a = ni0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.p5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        ji0 ji0Var = this.f30545a.h.G0;
        if (ji0Var != null) {
            ji0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
