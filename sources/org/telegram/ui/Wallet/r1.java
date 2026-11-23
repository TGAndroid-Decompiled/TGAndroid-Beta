package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.o10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.lc;
public final class r1 implements View.OnClickListener {
    public final int f44873a;
    public final Object f44874b;
    public final Object f44875c;
    public final Object d;

    public r1(Object obj, Object obj2, Object obj3, int i7) {
        this.f44873a = i7;
        this.f44874b = obj;
        this.f44875c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44873a) {
            case 0:
                d3 d3Var = (d3) this.f44875c;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
                if (org.telegram.messenger.g0.g(((JSONObject) this.f44874b).optString("text"))) {
                    o10.t(null, 2131742745, new lc(d3Var.F, h6Var));
                    return;
                }
                return;
            case 1:
                n6.l0((n6) this.f44874b, (Context) this.f44875c, (org.telegram.ui.ActionBar.g5) this.d, view);
                return;
            case 2:
                a70 a70Var = (a70) this.d;
                g gVar = ((u0) this.f44874b).h;
                String str = ((TL_wallet.currencyRate) this.f44875c).currency;
                if (!TextUtils.equals(gVar.f44247f, str)) {
                    gVar.f44247f = str;
                    try {
                        org.telegram.messenger.t0.f26895b.getSharedPreferences("gram_wallet", 0).edit().putString("currency", gVar.g()).apply();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.e("[gram-wallet] failed to save currency prefs", e10);
                    }
                    gVar.f44244b.T();
                }
                a70Var.v();
                return;
            default:
                g9 g9Var = (g9) this.f44874b;
                g9Var.getClass();
                ((org.telegram.ui.ActionBar.t1[]) this.f44875c)[0].dismiss();
                org.telegram.messenger.g0.g(g9Var.f44288s);
                ((Runnable) this.d).run();
                return;
        }
    }
}
