package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ii0 implements ImageReceiver.ImageReceiverDelegate {
    public final ji0 f27238a;

    public ii0(ji0 ji0Var) {
        this.f27238a = ji0Var;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.k5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        fi0 fi0Var = this.f27238a.h.G0;
        if (fi0Var != null) {
            fi0Var.d();
        }
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
