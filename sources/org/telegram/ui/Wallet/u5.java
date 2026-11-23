package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.messenger.r10;
import org.telegram.tgnet.tl.TL_wallet;
public final class u5 implements View.OnAttachStateChangeListener {
    public final fi.r f45134a;
    public final TL_wallet.walletTransaction[] f45135b;
    public final gs f45136c;
    public final int d;
    public final r10 f45137e;
    public final e3[] f45138f;
    public final String[] h;
    public final boolean[] f45139n;

    public u5(fi.r rVar, TL_wallet.walletTransaction[] wallettransactionArr, t5 t5Var, int i7, r10 r10Var, e3[] e3VarArr, String[] strArr, boolean[] zArr) {
        this.f45134a = rVar;
        this.f45135b = wallettransactionArr;
        this.f45136c = t5Var;
        this.d = i7;
        this.f45137e = r10Var;
        this.f45138f = e3VarArr;
        this.h = strArr;
        this.f45139n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f45134a.a(this.f45135b[0]);
        gs gsVar = this.f45136c;
        if (gsVar != null) {
            int i7 = this.d;
            ls.f(i7).c(gsVar, ls.f25260d4);
            ls.f(i7).c(gsVar, ls.f25266e4);
        }
        r10 r10Var = this.f45137e;
        if (r10Var != null) {
            this.f45138f[0].n(new p(r10Var, this.h, this.f45139n, 15));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        gs gsVar = this.f45136c;
        if (gsVar != null) {
            int i7 = this.d;
            ls.f(i7).n(gsVar, ls.f25260d4);
            ls.f(i7).n(gsVar, ls.f25266e4);
        }
    }
}
