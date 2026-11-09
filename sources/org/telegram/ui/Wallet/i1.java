package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.l60;
import org.telegram.ui.wb1;
public final class i1 implements View.OnClickListener {
    public final int f42578a;
    public final Object f42579b;
    public final Object f42580c;
    public final Object d;

    public i1(Object obj, Object obj2, Object obj3, int i7) {
        this.f42578a = i7;
        this.f42579b = obj;
        this.f42580c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42578a) {
            case 0:
                x2 x2Var = (x2) this.f42580c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                if (org.telegram.messenger.g0.g(((JSONObject) this.f42579b).optString("text"))) {
                    org.telegram.messenger.camera.q.r(null, 2131743009, new hc(x2Var.E, g6Var));
                    return;
                }
                return;
            case 1:
                n3 n3Var = (n3) this.f42579b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f42580c;
                TL_wallet.card cardVar = (TL_wallet.card) this.d;
                if (!n3Var.R) {
                    if (n3Var.f42863e) {
                        n3Var.U = new i3(1, f2Var);
                    } else if (n3Var.d) {
                        n3Var.U = new i3(0, f2Var);
                    } else if (n3Var.f42862c && !TextUtils.isEmpty(cardVar.address)) {
                        n3Var.U = new wb1(8, f2Var, cardVar);
                    } else {
                        return;
                    }
                    n3Var.dismiss();
                    return;
                }
                return;
            case 2:
                l60 l60Var = (l60) this.d;
                f fVar = ((l0) this.f42579b).h;
                String str = ((TL_wallet.currencyRate) this.f42580c).currency;
                if (!TextUtils.equals(fVar.f42434f, str)) {
                    fVar.f42434f = str;
                    try {
                        org.telegram.messenger.t0.f25566b.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.e("[gram-wallet] failed to save currency prefs", e10);
                    }
                    fVar.f42431b.L();
                }
                l60Var.u();
                return;
            default:
                p8 p8Var = (p8) this.f42579b;
                p8Var.getClass();
                ((org.telegram.ui.ActionBar.u1[]) this.f42580c)[0].dismiss();
                org.telegram.messenger.g0.g(p8Var.f42997s);
                ((Runnable) this.d).run();
                return;
        }
    }
}
