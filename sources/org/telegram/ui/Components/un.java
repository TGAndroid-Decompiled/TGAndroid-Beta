package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class un implements View.OnClickListener {
    public final int f38823a;
    public final Context f38824b;
    public final int f38825c;
    public final Object d;
    public final Object f38826e;
    public final Object f38827f;

    public un(Object obj, Context context, Object obj2, int i3, Object obj3, int i10) {
        this.f38823a = i10;
        this.d = obj;
        this.f38824b = context;
        this.f38826e = obj2;
        this.f38825c = i3;
        this.f38827f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38823a) {
            case 0:
                ((xn) this.d).a();
                k2.q qVar = new k2.q(this.f38825c, (wn) this.f38827f, 7);
                t4.F(this.f38824b, (org.telegram.ui.ActionBar.e6) this.f38826e, qVar);
                return;
            default:
                wo woVar = (wo) this.f38826e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f38827f;
                ((org.telegram.ui.ActionBar.t2) this.d).dismiss();
                Activity W = org.telegram.messenger.g0.W(this.f38824b);
                if (W != null) {
                    org.telegram.messenger.hp.e1().edit().putBoolean("callmiconstart", woVar.f40035a.f31334q).apply();
                    org.telegram.ui.Components.voip.n1.g(W, this.f38825c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
