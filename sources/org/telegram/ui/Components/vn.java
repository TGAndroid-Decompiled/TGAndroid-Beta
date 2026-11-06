package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class vn implements View.OnClickListener {
    public final int f38988a;
    public final Context f38989b;
    public final int f38990c;
    public final Object d;
    public final Object f38991e;
    public final Object f38992f;

    public vn(Object obj, Context context, Object obj2, int i7, Object obj3, int i10) {
        this.f38988a = i10;
        this.d = obj;
        this.f38989b = context;
        this.f38991e = obj2;
        this.f38990c = i7;
        this.f38992f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38988a) {
            case 0:
                ((yn) this.d).a();
                l2.q qVar = new l2.q(this.f38990c, (xn) this.f38992f, 6);
                v4.D(this.f38989b, (org.telegram.ui.ActionBar.f6) this.f38991e, qVar);
                return;
            default:
                wo woVar = (wo) this.f38991e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f38992f;
                ((org.telegram.ui.ActionBar.v2) this.d).dismiss();
                Activity W = org.telegram.messenger.g0.W(this.f38989b);
                if (W != null) {
                    org.telegram.messenger.qp.e1().edit().putBoolean("callmiconstart", woVar.f40043a.f31258q).apply();
                    org.telegram.ui.Components.voip.y1.g(W, this.f38990c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
