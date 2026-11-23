package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.m10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.x60;
public final class s1 implements View.OnClickListener {
    public final int f45035a;
    public final Object f45036b;
    public final Object f45037c;
    public final Object d;

    public s1(Object obj, Object obj2, Object obj3, int i7) {
        this.f45035a = i7;
        this.f45036b = obj;
        this.f45037c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45035a) {
            case 0:
                e3 e3Var = (e3) this.f45037c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                if (org.telegram.messenger.g0.g(((JSONObject) this.f45036b).optString("text"))) {
                    m10.t(null, 2131742738, new kc(e3Var.F, i6Var));
                    return;
                }
                return;
            case 1:
                o6.l0((o6) this.f45036b, (Context) this.f45037c, (org.telegram.ui.ActionBar.g5) this.d, view);
                return;
            case 2:
                x60 x60Var = (x60) this.d;
                g gVar = ((v0) this.f45036b).h;
                String str = ((TL_wallet.currencyRate) this.f45037c).currency;
                if (!TextUtils.equals(gVar.f44335f, str)) {
                    gVar.f44335f = str;
                    try {
                        org.telegram.messenger.t0.f27013b.getSharedPreferences("gram_wallet", 0).edit().putString("currency", gVar.g()).apply();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.e("[gram-wallet] failed to save currency prefs", e10);
                    }
                    gVar.f44332b.T();
                }
                x60Var.v();
                return;
            default:
                h9 h9Var = (h9) this.f45036b;
                h9Var.getClass();
                ((org.telegram.ui.ActionBar.t1[]) this.f45037c)[0].dismiss();
                org.telegram.messenger.g0.g(h9Var.f44450s);
                ((Runnable) this.d).run();
                return;
        }
    }
}
