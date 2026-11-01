package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class co implements View.OnClickListener {
    public final int f25190a;
    public final Context f25191b;
    public final int f25192c;
    public final Object d;
    public final Object e;
    public final Object f25193f;

    public co(Object obj, Context context, Object obj2, int i10, Object obj3, int i11) {
        this.f25190a = i11;
        this.d = obj;
        this.f25191b = context;
        this.e = obj2;
        this.f25192c = i10;
        this.f25193f = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25190a) {
            case 0:
                ((go) this.d).a();
                i2.q qVar = new i2.q(this.f25192c, (fo) this.f25193f, 8);
                s4.F(this.f25191b, (org.telegram.ui.ActionBar.p6) this.e, qVar);
                return;
            default:
                ep epVar = (ep) this.e;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) this.f25193f;
                ((org.telegram.ui.ActionBar.z2) this.d).dismiss();
                Activity W = org.telegram.messenger.i0.W(this.f25191b);
                if (W != null) {
                    org.telegram.messenger.wp.d1().edit().putBoolean("callmiconstart", epVar.f25895a.f23920q).apply();
                    org.telegram.ui.Components.voip.n1.g(W, this.f25192c, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
