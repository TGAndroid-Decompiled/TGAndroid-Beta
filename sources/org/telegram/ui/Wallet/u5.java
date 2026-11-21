package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_wallet;
public final class u5 implements View.OnAttachStateChangeListener {
    public final fi.r f45165a;
    public final TL_wallet.walletTransaction[] f45166b;
    public final fs f45167c;
    public final int d;
    public final q10 f45168e;
    public final e3[] f45169f;
    public final String[] h;
    public final boolean[] f45170n;

    public u5(fi.r rVar, TL_wallet.walletTransaction[] wallettransactionArr, t5 t5Var, int i7, q10 q10Var, e3[] e3VarArr, String[] strArr, boolean[] zArr) {
        this.f45165a = rVar;
        this.f45166b = wallettransactionArr;
        this.f45167c = t5Var;
        this.d = i7;
        this.f45168e = q10Var;
        this.f45169f = e3VarArr;
        this.h = strArr;
        this.f45170n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f45165a.a(this.f45166b[0]);
        fs fsVar = this.f45167c;
        if (fsVar != null) {
            int i7 = this.d;
            ks.f(i7).c(fsVar, ks.f25130d4);
            ks.f(i7).c(fsVar, ks.f25136e4);
        }
        q10 q10Var = this.f45168e;
        if (q10Var != null) {
            this.f45169f[0].n(new p(q10Var, this.h, this.f45170n, 15));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        fs fsVar = this.f45167c;
        if (fsVar != null) {
            int i7 = this.d;
            ks.f(i7).n(fsVar, ks.f25130d4);
            ks.f(i7).n(fsVar, ks.f25136e4);
        }
    }
}
