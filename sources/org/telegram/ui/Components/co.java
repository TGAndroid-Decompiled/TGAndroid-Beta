package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class co implements View.OnClickListener {
    public final int f25108a;
    public final Context f25109b;
    public final int f25110c;
    public final Object d;
    public final Object e;
    public final Object f25111f;

    public co(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f25108a = i11;
        this.d = obj;
        this.f25109b = context;
        this.e = obj2;
        this.f25110c = i10;
        this.f25111f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25108a) {
            case 0:
                ((go) this.d).a();
                i2.q qVar = new i2.q(this.f25110c, (fo) this.f25111f, 8);
                s4.F(this.f25109b, (org.telegram.ui.ActionBar.p6) this.e, qVar);
                return;
            default:
                ep epVar = (ep) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f25111f;
                ((org.telegram.ui.ActionBar.z2) this.d).dismiss();
                Activity W = org.telegram.messenger.i0.W(this.f25109b);
                if (W != null) {
                    org.telegram.messenger.vp.d1().edit().putBoolean("callmiconstart", epVar.f25836a.f23919q).apply();
                    org.telegram.ui.Components.voip.m1.g(W, this.f25110c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
