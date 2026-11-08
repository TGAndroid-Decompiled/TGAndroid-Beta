package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class vn implements View.OnClickListener {
    public final int f39041a;
    public final Context f39042b;
    public final int f39043c;
    public final Object d;
    public final Object f39044e;
    public final Object f39045f;

    public vn(Object obj, Context context, Object obj2, int i7, Object obj3, int i10) {
        this.f39041a = i10;
        this.d = obj;
        this.f39042b = context;
        this.f39044e = obj2;
        this.f39043c = i7;
        this.f39045f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39041a) {
            case 0:
                ((yn) this.d).a();
                l2.q qVar = new l2.q(this.f39043c, (xn) this.f39045f, 6);
                v4.D(this.f39042b, (org.telegram.ui.ActionBar.f6) this.f39044e, qVar);
                return;
            default:
                wo woVar = (wo) this.f39044e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f39045f;
                ((org.telegram.ui.ActionBar.v2) this.d).dismiss();
                Activity W = org.telegram.messenger.g0.W(this.f39042b);
                if (W != null) {
                    org.telegram.messenger.qp.e1().edit().putBoolean("callmiconstart", woVar.f40008a.f31263q).apply();
                    org.telegram.ui.Components.voip.y1.g(W, this.f39043c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
