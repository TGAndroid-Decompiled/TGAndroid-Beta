package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class eo implements View.OnClickListener {
    public final int f34379a;
    public final Context f34380b;
    public final int f34381c;
    public final Object d;
    public final Object f34382e;
    public final Object f34383f;

    public eo(Object obj, Context context, Object obj2, int i7, Object obj3, int i10) {
        this.f34379a = i10;
        this.d = obj;
        this.f34380b = context;
        this.f34382e = obj2;
        this.f34381c = i7;
        this.f34383f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34379a) {
            case 0:
                ((io) this.d).a();
                ai.r1 r1Var = new ai.r1(this.f34381c, (ho) this.f34383f, 9);
                t4.D(this.f34380b, (org.telegram.ui.ActionBar.e6) this.f34382e, r1Var);
                return;
            default:
                fp fpVar = (fp) this.f34382e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f34383f;
                ((org.telegram.ui.ActionBar.u2) this.d).dismiss();
                Activity W = org.telegram.messenger.g0.W(this.f34380b);
                if (W != null) {
                    org.telegram.messenger.np.e1().edit().putBoolean("callmiconstart", fpVar.f34663a.f32441q).apply();
                    org.telegram.ui.Components.voip.c2.g(W, this.f34381c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
