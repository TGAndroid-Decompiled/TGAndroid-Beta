package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class lo implements View.OnClickListener {
    public final int f37153a;
    public final Context f37154b;
    public final int f37155c;
    public final Object d;
    public final Object f37156e;
    public final Object f37157f;

    public lo(Object obj, Context context, Object obj2, int i7, Object obj3, int i10) {
        this.f37153a = i10;
        this.d = obj;
        this.f37154b = context;
        this.f37156e = obj2;
        this.f37155c = i7;
        this.f37157f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37153a) {
            case 0:
                ((po) this.d).a();
                ai.s1 s1Var = new ai.s1(this.f37155c, (oo) this.f37157f, 9);
                b5.D(this.f37154b, (org.telegram.ui.ActionBar.i6) this.f37156e, s1Var);
                return;
            default:
                mp mpVar = (mp) this.f37156e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f37157f;
                ((org.telegram.ui.ActionBar.x2) this.d).dismiss();
                Activity W = org.telegram.messenger.g0.W(this.f37154b);
                if (W != null) {
                    org.telegram.messenger.mp.g1().edit().putBoolean("callmiconstart", mpVar.f37598a.f32838q).apply();
                    org.telegram.ui.Components.voip.b2.g(W, this.f37155c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
