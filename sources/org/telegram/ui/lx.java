package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class lx implements org.telegram.messenger.jc {
    public final mx f49715a;
    public final boolean f49716b;
    public final org.telegram.messenger.fj f49717c;
    public final nx d;

    public lx(nx nxVar, mx mxVar, boolean z10, org.telegram.messenger.fj fjVar) {
        this.d = nxVar;
        this.f49715a = mxVar;
        this.f49716b = z10;
        this.f49717c = fjVar;
    }

    @Override
    public final void V(ImageReceiver imageReceiver) {
        org.telegram.messenger.fj fjVar;
        if (this.f49716b && (fjVar = this.f49717c) != null && fjVar.F2() && imageReceiver.B() != null && imageReceiver.B().f38243y == null) {
            try {
                this.d.H.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ImageReceiver imageReceiver2 = this.f49715a.f50021r;
        if (imageReceiver2.B() != null) {
            imageReceiver2.B().N(0, false, true);
        }
    }

    @Override
    public final void G0(int i7, Drawable drawable) {
    }
}
