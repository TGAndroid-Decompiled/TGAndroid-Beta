package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class e5 implements View.OnAttachStateChangeListener {
    public final di.r f42445a;
    public final TL_wallet.walletTransaction[] f42446b;
    public final ls f42447c;
    public final int d;
    public final v10 f42448e;
    public final z2[] f42449f;
    public final String[] h;
    public final boolean[] f42450n;

    public e5(di.r rVar, TL_wallet.walletTransaction[] wallettransactionArr, d5 d5Var, int i7, v10 v10Var, z2[] z2VarArr, String[] strArr, boolean[] zArr) {
        this.f42445a = rVar;
        this.f42446b = wallettransactionArr;
        this.f42447c = d5Var;
        this.d = i7;
        this.f42448e = v10Var;
        this.f42449f = z2VarArr;
        this.h = strArr;
        this.f42450n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42445a.a(this.f42446b[0]);
        ls lsVar = this.f42447c;
        if (lsVar != null) {
            int i7 = this.d;
            qs.f(i7).c(lsVar, qs.f24971a4);
            qs.f(i7).c(lsVar, qs.f24977b4);
        }
        v10 v10Var = this.f42448e;
        if (v10Var != null) {
            this.f42449f[0].n(new g(v10Var, (Serializable) this.h, (Serializable) this.f42450n, 14));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        ls lsVar = this.f42447c;
        if (lsVar != null) {
            int i7 = this.d;
            qs.f(i7).n(lsVar, qs.f24971a4);
            qs.f(i7).n(lsVar, qs.f24977b4);
        }
    }
}
