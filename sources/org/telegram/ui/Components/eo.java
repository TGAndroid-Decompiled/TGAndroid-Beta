package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class eo implements View.OnClickListener {
    public final int f34378a;
    public final Context f34379b;
    public final int f34380c;
    public final Object d;
    public final Object f34381e;
    public final Object f34382f;

    public eo(Object obj, Context context, Object obj2, int i7, Object obj3, int i10) {
        this.f34378a = i10;
        this.d = obj;
        this.f34379b = context;
        this.f34381e = obj2;
        this.f34380c = i7;
        this.f34382f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34378a) {
            case 0:
                ((io) this.d).a();
                ai.s1 s1Var = new ai.s1(this.f34380c, (ho) this.f34382f, 9);
                t4.D(this.f34379b, (org.telegram.ui.ActionBar.e6) this.f34381e, s1Var);
                return;
            default:
                fp fpVar = (fp) this.f34381e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f34382f;
                ((org.telegram.ui.ActionBar.u2) this.d).dismiss();
                Activity W = org.telegram.messenger.g0.W(this.f34379b);
                if (W != null) {
                    org.telegram.messenger.np.e1().edit().putBoolean("callmiconstart", fpVar.f34667a.f32441q).apply();
                    org.telegram.ui.Components.voip.c2.g(W, this.f34380c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
