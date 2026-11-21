package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class no implements View.OnClickListener {
    public final int f37901a;
    public final Context f37902b;
    public final int f37903c;
    public final Object d;
    public final Object f37904e;
    public final Object f37905f;

    public no(Object obj, Context context, Object obj2, int i7, Object obj3, int i10) {
        this.f37901a = i10;
        this.d = obj;
        this.f37902b = context;
        this.f37904e = obj2;
        this.f37903c = i7;
        this.f37905f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37901a) {
            case 0:
                ((ro) this.d).a();
                ai.u1 u1Var = new ai.u1(this.f37903c, (qo) this.f37905f, 9);
                c5.D(this.f37902b, (org.telegram.ui.ActionBar.h6) this.f37904e, u1Var);
                return;
            default:
                op opVar = (op) this.f37904e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f37905f;
                ((org.telegram.ui.ActionBar.w2) this.d).dismiss();
                Activity W = org.telegram.messenger.g0.W(this.f37902b);
                if (W != null) {
                    org.telegram.messenger.mp.g1().edit().putBoolean("callmiconstart", opVar.f38327a.f32871q).apply();
                    org.telegram.ui.Components.voip.b2.g(W, this.f37903c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
