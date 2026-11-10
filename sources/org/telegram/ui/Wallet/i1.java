package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.k60;
public final class i1 implements View.OnClickListener {
    public final int f42601a;
    public final Object f42602b;
    public final Object f42603c;
    public final Object d;

    public i1(Object obj, Object obj2, Object obj3, int i7) {
        this.f42601a = i7;
        this.f42602b = obj;
        this.f42603c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42601a) {
            case 0:
                x2 x2Var = (x2) this.f42603c;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
                if (org.telegram.messenger.g0.g(((JSONObject) this.f42602b).optString("text"))) {
                    org.telegram.messenger.camera.q.r(null, 2131743009, new gc(x2Var.E, h6Var));
                    return;
                }
                return;
            case 1:
                k60 k60Var = (k60) this.d;
                f fVar = ((l0) this.f42602b).h;
                String str = ((TL_wallet.currencyRate) this.f42603c).currency;
                if (!TextUtils.equals(fVar.f42482f, str)) {
                    fVar.f42482f = str;
                    try {
                        org.telegram.messenger.t0.f25570b.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.e("[gram-wallet] failed to save currency prefs", e10);
                    }
                    fVar.f42479b.L();
                }
                k60Var.u();
                return;
            default:
                s8 s8Var = (s8) this.f42602b;
                s8Var.getClass();
                ((org.telegram.ui.ActionBar.u1[]) this.f42603c)[0].dismiss();
                org.telegram.messenger.g0.g(s8Var.f43169s);
                ((Runnable) this.d).run();
                return;
        }
    }
}
