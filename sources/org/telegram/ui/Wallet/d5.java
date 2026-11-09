package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class d5 implements View.OnAttachStateChangeListener {
    public final di.r f42363a;
    public final TL_wallet.walletTransaction[] f42364b;
    public final ls f42365c;
    public final int d;
    public final v10 f42366e;
    public final y2[] f42367f;
    public final String[] h;
    public final boolean[] f42368n;

    public d5(di.r rVar, TL_wallet.walletTransaction[] wallettransactionArr, c5 c5Var, int i7, v10 v10Var, y2[] y2VarArr, String[] strArr, boolean[] zArr) {
        this.f42363a = rVar;
        this.f42364b = wallettransactionArr;
        this.f42365c = c5Var;
        this.d = i7;
        this.f42366e = v10Var;
        this.f42367f = y2VarArr;
        this.h = strArr;
        this.f42368n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42363a.a(this.f42364b[0]);
        ls lsVar = this.f42365c;
        if (lsVar != null) {
            int i7 = this.d;
            qs.f(i7).c(lsVar, qs.f24971a4);
            qs.f(i7).c(lsVar, qs.f24977b4);
        }
        v10 v10Var = this.f42366e;
        if (v10Var != null) {
            this.f42367f[0].n(new g(v10Var, (Serializable) this.h, (Serializable) this.f42368n, 14));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        ls lsVar = this.f42365c;
        if (lsVar != null) {
            int i7 = this.d;
            qs.f(i7).n(lsVar, qs.f24971a4);
            qs.f(i7).n(lsVar, qs.f24977b4);
        }
    }
}
