package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class no implements View.OnClickListener {
    public final int f37905a;
    public final Context f37906b;
    public final int f37907c;
    public final Object d;
    public final Object f37908e;
    public final Object f37909f;

    public no(Object obj, Context context, Object obj2, int i7, Object obj3, int i10) {
        this.f37905a = i10;
        this.d = obj;
        this.f37906b = context;
        this.f37908e = obj2;
        this.f37907c = i7;
        this.f37909f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37905a) {
            case 0:
                ((ro) this.d).a();
                ai.v1 v1Var = new ai.v1(this.f37907c, (qo) this.f37909f, 9);
                c5.D(this.f37906b, (org.telegram.ui.ActionBar.h6) this.f37908e, v1Var);
                return;
            default:
                op opVar = (op) this.f37908e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f37909f;
                ((org.telegram.ui.ActionBar.w2) this.d).dismiss();
                Activity W = org.telegram.messenger.g0.W(this.f37906b);
                if (W != null) {
                    org.telegram.messenger.np.g1().edit().putBoolean("callmiconstart", opVar.f38320a.f32874q).apply();
                    org.telegram.ui.Components.voip.b2.g(W, this.f37907c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
