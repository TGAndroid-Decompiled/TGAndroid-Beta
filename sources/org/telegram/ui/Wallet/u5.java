package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_wallet;
public final class u5 implements View.OnAttachStateChangeListener {
    public final fi.r f45124a;
    public final TL_wallet.walletTransaction[] f45125b;
    public final fs f45126c;
    public final int d;
    public final q10 f45127e;
    public final e3[] f45128f;
    public final String[] h;
    public final boolean[] f45129n;

    public u5(fi.r rVar, TL_wallet.walletTransaction[] wallettransactionArr, t5 t5Var, int i7, q10 q10Var, e3[] e3VarArr, String[] strArr, boolean[] zArr) {
        this.f45124a = rVar;
        this.f45125b = wallettransactionArr;
        this.f45126c = t5Var;
        this.d = i7;
        this.f45127e = q10Var;
        this.f45128f = e3VarArr;
        this.h = strArr;
        this.f45129n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f45124a.a(this.f45125b[0]);
        fs fsVar = this.f45126c;
        if (fsVar != null) {
            int i7 = this.d;
            ks.f(i7).c(fsVar, ks.f25102d4);
            ks.f(i7).c(fsVar, ks.f25108e4);
        }
        q10 q10Var = this.f45127e;
        if (q10Var != null) {
            this.f45128f[0].n(new p(q10Var, this.h, this.f45129n, 15));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        fs fsVar = this.f45126c;
        if (fsVar != null) {
            int i7 = this.d;
            ks.f(i7).n(fsVar, ks.f25102d4);
            ks.f(i7).n(fsVar, ks.f25108e4);
        }
    }
}
