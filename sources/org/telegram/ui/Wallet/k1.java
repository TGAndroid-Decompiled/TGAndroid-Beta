package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
public final class k1 implements View.OnClickListener {
    public final int f42690a;
    public final Object f42691b;
    public final Object f42692c;
    public final Object d;

    public k1(Object obj, Object obj2, Object obj3, int i7) {
        this.f42690a = i7;
        this.f42691b = obj;
        this.f42692c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42690a) {
            case 0:
                z2 z2Var = (z2) this.f42692c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                if (org.telegram.messenger.g0.g(((JSONObject) this.f42691b).optString("text"))) {
                    org.telegram.messenger.camera.q.r(null, 2131743010, new hc(z2Var.E, f6Var));
                    return;
                }
                return;
            case 1:
                p3 p3Var = (p3) this.f42691b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f42692c;
                TL_wallet.card cardVar = (TL_wallet.card) this.d;
                if (!p3Var.R) {
                    if (p3Var.f42984e) {
                        p3Var.U = new k3(1, f2Var);
                    } else if (p3Var.d) {
                        p3Var.U = new k3(0, f2Var);
                    } else if (p3Var.f42983c && !TextUtils.isEmpty(cardVar.address)) {
                        p3Var.U = new n(7, f2Var, cardVar);
                    } else {
                        return;
                    }
                    p3Var.dismiss();
                    return;
                }
                return;
            case 2:
                k60 k60Var = (k60) this.d;
                f fVar = ((n0) this.f42691b).h;
                String str = ((TL_wallet.currencyRate) this.f42692c).currency;
                if (!TextUtils.equals(fVar.f42442f, str)) {
                    fVar.f42442f = str;
                    try {
                        org.telegram.messenger.t0.f25555b.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.e("[gram-wallet] failed to save currency prefs", e10);
                    }
                    fVar.f42439b.L();
                }
                k60Var.u();
                return;
            default:
                r8 r8Var = (r8) this.f42691b;
                r8Var.getClass();
                ((org.telegram.ui.ActionBar.u1[]) this.f42692c)[0].dismiss();
                org.telegram.messenger.g0.g(r8Var.f43111s);
                ((Runnable) this.d).run();
                return;
        }
    }
}
