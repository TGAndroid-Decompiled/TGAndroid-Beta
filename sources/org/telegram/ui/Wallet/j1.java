package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
public final class j1 implements View.OnClickListener {
    public final int f42660a;
    public final Object f42661b;
    public final Object f42662c;
    public final Object d;

    public j1(Object obj, Object obj2, Object obj3, int i7) {
        this.f42660a = i7;
        this.f42661b = obj;
        this.f42662c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42660a) {
            case 0:
                y2 y2Var = (y2) this.f42662c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                if (org.telegram.messenger.g0.g(((JSONObject) this.f42661b).optString("text"))) {
                    org.telegram.messenger.camera.q.r(null, 2131743012, new hc(y2Var.E, f6Var));
                    return;
                }
                return;
            case 1:
                o3 o3Var = (o3) this.f42661b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f42662c;
                TL_wallet.card cardVar = (TL_wallet.card) this.d;
                if (!o3Var.R) {
                    if (o3Var.f42945e) {
                        o3Var.U = new j3(1, f2Var);
                    } else if (o3Var.d) {
                        o3Var.U = new j3(0, f2Var);
                    } else if (o3Var.f42944c && !TextUtils.isEmpty(cardVar.address)) {
                        o3Var.U = new n(7, f2Var, cardVar);
                    } else {
                        return;
                    }
                    o3Var.dismiss();
                    return;
                }
                return;
            case 2:
                k60 k60Var = (k60) this.d;
                f fVar = ((m0) this.f42661b).h;
                String str = ((TL_wallet.currencyRate) this.f42662c).currency;
                if (!TextUtils.equals(fVar.f42483f, str)) {
                    fVar.f42483f = str;
                    try {
                        org.telegram.messenger.t0.f25566b.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.e("[gram-wallet] failed to save currency prefs", e10);
                    }
                    fVar.f42480b.L();
                }
                k60Var.u();
                return;
            default:
                q8 q8Var = (q8) this.f42661b;
                q8Var.getClass();
                ((org.telegram.ui.ActionBar.u1[]) this.f42662c)[0].dismiss();
                org.telegram.messenger.g0.g(q8Var.f43079s);
                ((Runnable) this.d).run();
                return;
        }
    }
}
