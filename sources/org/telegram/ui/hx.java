package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class hx implements org.telegram.messenger.kc {
    public final ix f47836a;
    public final boolean f47837b;
    public final org.telegram.messenger.gj f47838c;
    public final jx d;

    public hx(jx jxVar, ix ixVar, boolean z10, org.telegram.messenger.gj gjVar) {
        this.d = jxVar;
        this.f47836a = ixVar;
        this.f47837b = z10;
        this.f47838c = gjVar;
    }

    @Override
    public final void A(ImageReceiver imageReceiver) {
        org.telegram.messenger.gj gjVar;
        if (this.f47837b && (gjVar = this.f47838c) != null && gjVar.F2() && imageReceiver.B() != null && imageReceiver.B().f33603y == null) {
            try {
                this.d.H.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ImageReceiver imageReceiver2 = this.f47836a.f48154r;
        if (imageReceiver2.B() != null) {
            imageReceiver2.B().N(0, false, true);
        }
    }

    @Override
    public final void O(int i7, Drawable drawable) {
    }
}
