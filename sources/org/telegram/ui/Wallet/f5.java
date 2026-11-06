package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class f5 implements View.OnAttachStateChangeListener {
    public final di.r f42478a;
    public final TL_wallet.walletTransaction[] f42479b;
    public final ls f42480c;
    public final int d;
    public final v10 f42481e;
    public final a3[] f42482f;
    public final String[] h;
    public final boolean[] f42483n;

    public f5(di.r rVar, TL_wallet.walletTransaction[] wallettransactionArr, e5 e5Var, int i7, v10 v10Var, a3[] a3VarArr, String[] strArr, boolean[] zArr) {
        this.f42478a = rVar;
        this.f42479b = wallettransactionArr;
        this.f42480c = e5Var;
        this.d = i7;
        this.f42481e = v10Var;
        this.f42482f = a3VarArr;
        this.h = strArr;
        this.f42483n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42478a.a(this.f42479b[0]);
        ls lsVar = this.f42480c;
        if (lsVar != null) {
            int i7 = this.d;
            qs.f(i7).c(lsVar, qs.f24954a4);
            qs.f(i7).c(lsVar, qs.f24960b4);
        }
        v10 v10Var = this.f42481e;
        if (v10Var != null) {
            this.f42482f[0].n(new g(v10Var, (Serializable) this.h, (Serializable) this.f42483n, 14));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        ls lsVar = this.f42480c;
        if (lsVar != null) {
            int i7 = this.d;
            qs.f(i7).n(lsVar, qs.f24954a4);
            qs.f(i7).n(lsVar, qs.f24960b4);
        }
    }
}
