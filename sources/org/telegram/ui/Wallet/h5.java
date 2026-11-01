package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.at;
import org.telegram.messenger.k20;
import org.telegram.messenger.vs;
import org.telegram.tgnet.tl.TL_wallet;
public final class h5 implements View.OnAttachStateChangeListener {
    public final q4 f34623a;
    public final TL_wallet.walletTransaction[] f34624b;
    public final vs f34625c;
    public final int d;
    public final k20 e;
    public final a3[] f34626f;
    public final String[] h;
    public final boolean[] f34627n;

    public h5(q4 q4Var, TL_wallet.walletTransaction[] wallettransactionArr, g5 g5Var, int i10, k20 k20Var, a3[] a3VarArr, String[] strArr, boolean[] zArr) {
        this.f34623a = q4Var;
        this.f34624b = wallettransactionArr;
        this.f34625c = g5Var;
        this.d = i10;
        this.e = k20Var;
        this.f34626f = a3VarArr;
        this.h = strArr;
        this.f34627n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f34623a.a(this.f34624b[0]);
        vs vsVar = this.f34625c;
        if (vsVar != null) {
            int i10 = this.d;
            at.f(i10).c(vsVar, at.f14678a4);
            at.f(i10).c(vsVar, at.f14684b4);
        }
        k20 k20Var = this.e;
        if (k20Var != null) {
            this.f34626f[0].n(new g(k20Var, (Serializable) this.h, (Serializable) this.f34627n, 14));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        vs vsVar = this.f34625c;
        if (vsVar != null) {
            int i10 = this.d;
            at.f(i10).n(vsVar, at.f14678a4);
            at.f(i10).n(vsVar, at.f14684b4);
        }
    }
}
