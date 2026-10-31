package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.j20;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_wallet;
public final class h5 implements View.OnAttachStateChangeListener {
    public final q4 f34616a;
    public final TL_wallet.walletTransaction[] f34617b;
    public final us f34618c;
    public final int d;
    public final j20 e;
    public final z2[] f34619f;
    public final String[] h;
    public final boolean[] f34620n;

    public h5(q4 q4Var, TL_wallet.walletTransaction[] wallettransactionArr, g5 g5Var, int i10, j20 j20Var, z2[] z2VarArr, String[] strArr, boolean[] zArr) {
        this.f34616a = q4Var;
        this.f34617b = wallettransactionArr;
        this.f34618c = g5Var;
        this.d = i10;
        this.e = j20Var;
        this.f34619f = z2VarArr;
        this.h = strArr;
        this.f34620n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f34616a.a(this.f34617b[0]);
        us usVar = this.f34618c;
        if (usVar != null) {
            int i10 = this.d;
            zs.f(i10).c(usVar, zs.f19582a4);
            zs.f(i10).c(usVar, zs.f19588b4);
        }
        j20 j20Var = this.e;
        if (j20Var != null) {
            this.f34619f[0].o(new g(j20Var, (Serializable) this.h, (Serializable) this.f34620n, 14));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        us usVar = this.f34618c;
        if (usVar != null) {
            int i10 = this.d;
            zs.f(i10).n(usVar, zs.f19582a4);
            zs.f(i10).n(usVar, zs.f19588b4);
        }
    }
}
