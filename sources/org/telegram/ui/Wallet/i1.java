package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.i20;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.m60;
public final class i1 implements View.OnClickListener {
    public final int f43962a;
    public final Object f43963b;
    public final Object f43964c;
    public final Object d;

    public i1(Object obj, Object obj2, Object obj3, int i7) {
        this.f43962a = i7;
        this.f43963b = obj;
        this.f43964c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43962a) {
            case 0:
                w2 w2Var = (w2) this.f43964c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                if (org.telegram.messenger.g0.g(((JSONObject) this.f43963b).optString("text"))) {
                    i20.s(null, 2131743009, new cc(w2Var.F, e6Var));
                    return;
                }
                return;
            case 1:
                m60 m60Var = (m60) this.d;
                f fVar = ((l0) this.f43963b).h;
                String str = ((TL_wallet.currencyRate) this.f43964c).currency;
                if (!TextUtils.equals(fVar.f43814f, str)) {
                    fVar.f43814f = str;
                    try {
                        org.telegram.messenger.t0.f26600b.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.e("[gram-wallet] failed to save currency prefs", e10);
                    }
                    fVar.f43811b.L();
                }
                m60Var.u();
                return;
            default:
                s8 s8Var = (s8) this.f43963b;
                s8Var.getClass();
                ((org.telegram.ui.ActionBar.t1[]) this.f43964c)[0].dismiss();
                org.telegram.messenger.g0.g(s8Var.f44497s);
                ((Runnable) this.d).run();
                return;
        }
    }
}
