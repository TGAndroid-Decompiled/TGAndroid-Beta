package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class vn implements View.OnClickListener {
    public final int f39006a;
    public final Context f39007b;
    public final int f39008c;
    public final Object d;
    public final Object f39009e;
    public final Object f39010f;

    public vn(Object obj, Context context, Object obj2, int i7, Object obj3, int i10) {
        this.f39006a = i10;
        this.d = obj;
        this.f39007b = context;
        this.f39009e = obj2;
        this.f39008c = i7;
        this.f39010f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39006a) {
            case 0:
                ((yn) this.d).a();
                l2.q qVar = new l2.q(this.f39008c, (xn) this.f39010f, 6);
                v4.D(this.f39007b, (org.telegram.ui.ActionBar.f6) this.f39009e, qVar);
                return;
            default:
                wo woVar = (wo) this.f39009e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f39010f;
                ((org.telegram.ui.ActionBar.v2) this.d).dismiss();
                Activity W = org.telegram.messenger.g0.W(this.f39007b);
                if (W != null) {
                    org.telegram.messenger.qp.e1().edit().putBoolean("callmiconstart", woVar.f40058a.f31259q).apply();
                    org.telegram.ui.Components.voip.y1.g(W, this.f39008c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
