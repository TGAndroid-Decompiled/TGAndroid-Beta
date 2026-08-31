package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class vh0 implements ImageReceiver.ImageReceiverDelegate {
    public final wh0 f31910a;

    public vh0(wh0 wh0Var) {
        this.f31910a = wh0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        sh0 sh0Var = this.f31910a.h.D0;
        if (sh0Var != null) {
            sh0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
    }
}
