package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.ma1;
public final class h1 implements View.OnClickListener {
    public final int f42599a;
    public final Object f42600b;
    public final Object f42601c;
    public final Object d;

    public h1(Object obj, Object obj2, Object obj3, int i3) {
        this.f42599a = i3;
        this.f42600b = obj;
        this.f42601c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42599a) {
            case 0:
                x2 x2Var = (x2) this.f42601c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                if (org.telegram.messenger.g0.g(((JSONObject) this.f42600b).optString("text"))) {
                    org.telegram.messenger.camera.q.r(null, 2131743019, new fc(x2Var.F, e6Var));
                    return;
                }
                return;
            case 1:
                n3 n3Var = (n3) this.f42600b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f42601c;
                TL_wallet.card cardVar = (TL_wallet.card) this.d;
                if (!n3Var.S) {
                    if (n3Var.f42916e) {
                        n3Var.V = new i3(1, d2Var);
                    } else if (n3Var.d) {
                        n3Var.V = new i3(0, d2Var);
                    } else if (n3Var.f42915c && !TextUtils.isEmpty(cardVar.address)) {
                        n3Var.V = new ma1(12, d2Var, cardVar);
                    } else {
                        return;
                    }
                    n3Var.dismiss();
                    return;
                }
                return;
            case 2:
                f60 f60Var = (f60) this.d;
                f fVar = ((k0) this.f42600b).h;
                String str = ((TL_wallet.currencyRate) this.f42601c).currency;
                if (!TextUtils.equals(fVar.f42506f, str)) {
                    fVar.f42506f = str;
                    try {
                        org.telegram.messenger.t0.f25457b.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.e("[gram-wallet] failed to save currency prefs", e10);
                    }
                    fVar.f42503b.L();
                }
                f60Var.u();
                return;
            default:
                q8 q8Var = (q8) this.f42600b;
                q8Var.getClass();
                ((org.telegram.ui.ActionBar.s1[]) this.f42601c)[0].dismiss();
                org.telegram.messenger.g0.g(q8Var.f43099s);
                ((Runnable) this.d).run();
                return;
        }
    }
}
