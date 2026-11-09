package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class vn implements View.OnClickListener {
    public final int f39134a;
    public final Context f39135b;
    public final int f39136c;
    public final Object d;
    public final Object f39137e;
    public final Object f39138f;

    public vn(Object obj, Context context, Object obj2, int i7, Object obj3, int i10) {
        this.f39134a = i10;
        this.d = obj;
        this.f39135b = context;
        this.f39137e = obj2;
        this.f39136c = i7;
        this.f39138f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39134a) {
            case 0:
                ((yn) this.d).a();
                l2.q qVar = new l2.q(this.f39136c, (xn) this.f39138f, 6);
                v4.D(this.f39135b, (org.telegram.ui.ActionBar.g6) this.f39137e, qVar);
                return;
            default:
                wo woVar = (wo) this.f39137e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f39138f;
                ((org.telegram.ui.ActionBar.v2) this.d).dismiss();
                Activity W = org.telegram.messenger.g0.W(this.f39135b);
                if (W != null) {
                    org.telegram.messenger.qp.e1().edit().putBoolean("callmiconstart", woVar.f40108a.f31268q).apply();
                    org.telegram.ui.Components.voip.y1.g(W, this.f39136c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
