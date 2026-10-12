package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ui0 implements ImageReceiver.ImageReceiverDelegate {
    public final vi0 f31169a;

    public ui0(vi0 vi0Var) {
        this.f31169a = vi0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        ri0 ri0Var = this.f31169a.h.G0;
        if (ri0Var != null) {
            ri0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
