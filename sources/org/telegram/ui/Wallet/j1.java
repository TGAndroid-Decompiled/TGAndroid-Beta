package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.a30;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.z60;
public final class j1 implements View.OnClickListener {
    public final int f34743a;
    public final Object f34744b;
    public final Object f34745c;
    public final Object d;

    public j1(Object obj, Object obj2, Object obj3, int i10) {
        this.f34743a = i10;
        this.f34744b = obj;
        this.f34745c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34743a) {
            case 0:
                z2 z2Var = (z2) this.f34745c;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.d;
                if (org.telegram.messenger.i0.g(((JSONObject) this.f34744b).optString("text"))) {
                    a30.r(null, 2131743035, new cc(z2Var.E, p6Var));
                    return;
                }
                return;
            case 1:
                p3 p3Var = (p3) this.f34744b;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f34745c;
                TL_wallet.card cardVar = (TL_wallet.card) this.d;
                if (!p3Var.R) {
                    if (p3Var.e) {
                        p3Var.U = new k3(1, k2Var);
                    } else if (p3Var.d) {
                        p3Var.U = new k3(0, k2Var);
                    } else if (p3Var.f35018c && !TextUtils.isEmpty(cardVar.address)) {
                        p3Var.U = new m2(1, k2Var, cardVar);
                    } else {
                        return;
                    }
                    p3Var.dismiss();
                    return;
                }
                return;
            case 2:
                z60 z60Var = (z60) this.d;
                f fVar = ((k0) this.f34744b).h;
                String str = ((TL_wallet.currencyRate) this.f34745c).currency;
                if (!TextUtils.equals(fVar.f34476f, str)) {
                    fVar.f34476f = str;
                    try {
                        org.telegram.messenger.w0.f18945b.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e) {
                        org.telegram.messenger.f8.e("[gram-wallet] failed to save currency prefs", e);
                    }
                    fVar.f34474b.L();
                }
                z60Var.u();
                return;
            default:
                w8 w8Var = (w8) this.f34744b;
                w8Var.getClass();
                ((org.telegram.ui.ActionBar.x1[]) this.f34745c)[0].dismiss();
                org.telegram.messenger.i0.g(w8Var.f35379s);
                ((Runnable) this.d).run();
                return;
        }
    }
}
