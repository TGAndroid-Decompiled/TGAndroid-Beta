package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.messenger.r10;
import org.telegram.tgnet.tl.TL_wallet;
public final class u5 implements View.OnAttachStateChangeListener {
    public final fi.r f45169a;
    public final TL_wallet.walletTransaction[] f45170b;
    public final gs f45171c;
    public final int d;
    public final r10 f45172e;
    public final e3[] f45173f;
    public final String[] h;
    public final boolean[] f45174n;

    public u5(fi.r rVar, TL_wallet.walletTransaction[] wallettransactionArr, t5 t5Var, int i7, r10 r10Var, e3[] e3VarArr, String[] strArr, boolean[] zArr) {
        this.f45169a = rVar;
        this.f45170b = wallettransactionArr;
        this.f45171c = t5Var;
        this.d = i7;
        this.f45172e = r10Var;
        this.f45173f = e3VarArr;
        this.h = strArr;
        this.f45174n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f45169a.a(this.f45170b[0]);
        gs gsVar = this.f45171c;
        if (gsVar != null) {
            int i7 = this.d;
            ls.f(i7).c(gsVar, ls.f25296d4);
            ls.f(i7).c(gsVar, ls.f25302e4);
        }
        r10 r10Var = this.f45172e;
        if (r10Var != null) {
            this.f45173f[0].n(new p(r10Var, this.h, this.f45174n, 15));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        gs gsVar = this.f45171c;
        if (gsVar != null) {
            int i7 = this.d;
            ls.f(i7).n(gsVar, ls.f25296d4);
            ls.f(i7).n(gsVar, ls.f25302e4);
        }
    }
}
