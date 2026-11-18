package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.y60;
public final class r1 implements View.OnClickListener {
    public final int f44863a;
    public final Object f44864b;
    public final Object f44865c;
    public final Object d;

    public r1(Object obj, Object obj2, Object obj3, int i7) {
        this.f44863a = i7;
        this.f44864b = obj;
        this.f44865c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44863a) {
            case 0:
                d3 d3Var = (d3) this.f44865c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                if (org.telegram.messenger.g0.g(((JSONObject) this.f44864b).optString("text"))) {
                    n10.t(null, 2131742751, new lc(d3Var.F, i6Var));
                    return;
                }
                return;
            case 1:
                n6.l0((n6) this.f44864b, (Context) this.f44865c, (org.telegram.ui.ActionBar.h5) this.d, view);
                return;
            case 2:
                y60 y60Var = (y60) this.d;
                g gVar = ((u0) this.f44864b).h;
                String str = ((TL_wallet.currencyRate) this.f44865c).currency;
                if (!TextUtils.equals(gVar.f44237f, str)) {
                    gVar.f44237f = str;
                    try {
                        org.telegram.messenger.t0.f26915b.getSharedPreferences("gram_wallet", 0).edit().putString("currency", gVar.g()).apply();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.e("[gram-wallet] failed to save currency prefs", e10);
                    }
                    gVar.f44234b.T();
                }
                y60Var.v();
                return;
            default:
                g9 g9Var = (g9) this.f44864b;
                g9Var.getClass();
                ((org.telegram.ui.ActionBar.u1[]) this.f44865c)[0].dismiss();
                org.telegram.messenger.g0.g(g9Var.f44278s);
                ((Runnable) this.d).run();
                return;
        }
    }
}
