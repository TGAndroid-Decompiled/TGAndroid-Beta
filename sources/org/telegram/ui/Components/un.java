package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class un implements View.OnClickListener {
    public final int f38719a;
    public final Context f38720b;
    public final int f38721c;
    public final Object d;
    public final Object f38722e;
    public final Object f38723f;

    public un(Object obj, Context context, Object obj2, int i7, Object obj3, int i10) {
        this.f38719a = i10;
        this.d = obj;
        this.f38720b = context;
        this.f38722e = obj2;
        this.f38721c = i7;
        this.f38723f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38719a) {
            case 0:
                ((xn) this.d).a();
                l2.q qVar = new l2.q(this.f38721c, (wn) this.f38723f, 6);
                u4.D(this.f38720b, (org.telegram.ui.ActionBar.h6) this.f38722e, qVar);
                return;
            default:
                wo woVar = (wo) this.f38722e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f38723f;
                ((org.telegram.ui.ActionBar.w2) this.d).dismiss();
                Activity W = org.telegram.messenger.g0.W(this.f38720b);
                if (W != null) {
                    org.telegram.messenger.qp.e1().edit().putBoolean("callmiconstart", woVar.f40026a.f31279q).apply();
                    org.telegram.ui.Components.voip.y1.g(W, this.f38721c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
