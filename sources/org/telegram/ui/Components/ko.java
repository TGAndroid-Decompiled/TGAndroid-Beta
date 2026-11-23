package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ko implements View.OnClickListener {
    public final int f36816a;
    public final Context f36817b;
    public final int f36818c;
    public final Object d;
    public final Object f36819e;
    public final Object f36820f;

    public ko(Object obj, Context context, Object obj2, int i7, Object obj3, int i10) {
        this.f36816a = i10;
        this.d = obj;
        this.f36817b = context;
        this.f36819e = obj2;
        this.f36818c = i7;
        this.f36820f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36816a) {
            case 0:
                ((oo) this.d).a();
                ai.n1 n1Var = new ai.n1(this.f36818c, (no) this.f36820f, 8);
                b5.D(this.f36817b, (org.telegram.ui.ActionBar.i6) this.f36819e, n1Var);
                return;
            default:
                lp lpVar = (lp) this.f36819e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f36820f;
                ((org.telegram.ui.ActionBar.w2) this.d).dismiss();
                Activity W = org.telegram.messenger.g0.W(this.f36817b);
                if (W != null) {
                    org.telegram.messenger.mp.g1().edit().putBoolean("callmiconstart", lpVar.f37189a.f32938q).apply();
                    org.telegram.ui.Components.voip.c2.g(W, this.f36818c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
