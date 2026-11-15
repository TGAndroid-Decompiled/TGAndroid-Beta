package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class hx implements org.telegram.messenger.kc {
    public final ix f47826a;
    public final boolean f47827b;
    public final org.telegram.messenger.gj f47828c;
    public final jx d;

    public hx(jx jxVar, ix ixVar, boolean z10, org.telegram.messenger.gj gjVar) {
        this.d = jxVar;
        this.f47826a = ixVar;
        this.f47827b = z10;
        this.f47828c = gjVar;
    }

    @Override
    public final void A(ImageReceiver imageReceiver) {
        org.telegram.messenger.gj gjVar;
        if (this.f47827b && (gjVar = this.f47828c) != null && gjVar.F2() && imageReceiver.B() != null && imageReceiver.B().f33605y == null) {
            try {
                this.d.H.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ImageReceiver imageReceiver2 = this.f47826a.f48139r;
        if (imageReceiver2.B() != null) {
            imageReceiver2.B().N(0, false, true);
        }
    }

    @Override
    public final void O(int i7, Drawable drawable) {
    }
}
