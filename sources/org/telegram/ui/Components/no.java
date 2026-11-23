package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class no implements View.OnClickListener {
    public final int f37862a;
    public final Context f37863b;
    public final int f37864c;
    public final Object d;
    public final Object f37865e;
    public final Object f37866f;

    public no(Object obj, Context context, Object obj2, int i7, Object obj3, int i10) {
        this.f37862a = i10;
        this.d = obj;
        this.f37863b = context;
        this.f37865e = obj2;
        this.f37864c = i7;
        this.f37866f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37862a) {
            case 0:
                ((ro) this.d).a();
                ai.m1 m1Var = new ai.m1(this.f37864c, (qo) this.f37866f, 8);
                c5.D(this.f37863b, (org.telegram.ui.ActionBar.h6) this.f37865e, m1Var);
                return;
            default:
                op opVar = (op) this.f37865e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f37866f;
                ((org.telegram.ui.ActionBar.w2) this.d).dismiss();
                Activity W = org.telegram.messenger.g0.W(this.f37863b);
                if (W != null) {
                    org.telegram.messenger.np.g1().edit().putBoolean("callmiconstart", opVar.f38291a.f32840q).apply();
                    org.telegram.ui.Components.voip.b2.g(W, this.f37864c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
