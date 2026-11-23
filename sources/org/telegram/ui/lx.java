package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class lx implements org.telegram.messenger.kc {
    public final mx f49719a;
    public final boolean f49720b;
    public final org.telegram.messenger.gj f49721c;
    public final nx d;

    public lx(nx nxVar, mx mxVar, boolean z10, org.telegram.messenger.gj gjVar) {
        this.d = nxVar;
        this.f49719a = mxVar;
        this.f49720b = z10;
        this.f49721c = gjVar;
    }

    @Override
    public final void V(ImageReceiver imageReceiver) {
        org.telegram.messenger.gj gjVar;
        if (this.f49720b && (gjVar = this.f49721c) != null && gjVar.F2() && imageReceiver.B() != null && imageReceiver.B().f38236y == null) {
            try {
                this.d.H.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ImageReceiver imageReceiver2 = this.f49719a.f50025r;
        if (imageReceiver2.B() != null) {
            imageReceiver2.B().N(0, false, true);
        }
    }

    @Override
    public final void G0(int i7, Drawable drawable) {
    }
}
