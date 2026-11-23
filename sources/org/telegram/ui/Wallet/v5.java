package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_wallet;
public final class v5 implements View.OnAttachStateChangeListener {
    public final fi.r f45296a;
    public final TL_wallet.walletTransaction[] f45297b;
    public final fs f45298c;
    public final int d;
    public final p10 f45299e;
    public final f3[] f45300f;
    public final String[] h;
    public final boolean[] f45301n;

    public v5(fi.r rVar, TL_wallet.walletTransaction[] wallettransactionArr, u5 u5Var, int i7, p10 p10Var, f3[] f3VarArr, String[] strArr, boolean[] zArr) {
        this.f45296a = rVar;
        this.f45297b = wallettransactionArr;
        this.f45298c = u5Var;
        this.d = i7;
        this.f45299e = p10Var;
        this.f45300f = f3VarArr;
        this.h = strArr;
        this.f45301n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f45296a.a(this.f45297b[0]);
        fs fsVar = this.f45298c;
        if (fsVar != null) {
            int i7 = this.d;
            ks.f(i7).c(fsVar, ks.f25201d4);
            ks.f(i7).c(fsVar, ks.f25207e4);
        }
        p10 p10Var = this.f45299e;
        if (p10Var != null) {
            this.f45300f[0].n(new p(p10Var, this.h, this.f45301n, 15));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        fs fsVar = this.f45298c;
        if (fsVar != null) {
            int i7 = this.d;
            ks.f(i7).n(fsVar, ks.f25201d4);
            ks.f(i7).n(fsVar, ks.f25207e4);
        }
    }
}
