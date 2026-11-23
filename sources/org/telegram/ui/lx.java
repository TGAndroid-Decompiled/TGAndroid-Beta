package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class lx implements org.telegram.messenger.kc {
    public final mx f49685a;
    public final boolean f49686b;
    public final org.telegram.messenger.gj f49687c;
    public final nx d;

    public lx(nx nxVar, mx mxVar, boolean z10, org.telegram.messenger.gj gjVar) {
        this.d = nxVar;
        this.f49685a = mxVar;
        this.f49686b = z10;
        this.f49687c = gjVar;
    }

    @Override
    public final void V(ImageReceiver imageReceiver) {
        org.telegram.messenger.gj gjVar;
        if (this.f49686b && (gjVar = this.f49687c) != null && gjVar.F2() && imageReceiver.B() != null && imageReceiver.B().f38205y == null) {
            try {
                this.d.H.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ImageReceiver imageReceiver2 = this.f49685a.f49999r;
        if (imageReceiver2.B() != null) {
            imageReceiver2.B().N(0, false, true);
        }
    }

    @Override
    public final void G0(int i7, Drawable drawable) {
    }
}
