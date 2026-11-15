package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.tgnet.tl.TL_wallet;
public final class f5 implements View.OnAttachStateChangeListener {
    public final fi.r f43828a;
    public final TL_wallet.walletTransaction[] f43829b;
    public final is f43830c;
    public final int d;
    public final s10 f43831e;
    public final x2[] f43832f;
    public final String[] h;
    public final boolean[] f43833n;

    public f5(fi.r rVar, TL_wallet.walletTransaction[] wallettransactionArr, e5 e5Var, int i7, s10 s10Var, x2[] x2VarArr, String[] strArr, boolean[] zArr) {
        this.f43828a = rVar;
        this.f43829b = wallettransactionArr;
        this.f43830c = e5Var;
        this.d = i7;
        this.f43831e = s10Var;
        this.f43832f = x2VarArr;
        this.h = strArr;
        this.f43833n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f43828a.a(this.f43829b[0]);
        is isVar = this.f43830c;
        if (isVar != null) {
            int i7 = this.d;
            ns.f(i7).c(isVar, ns.f25468a4);
            ns.f(i7).c(isVar, ns.f25474b4);
        }
        s10 s10Var = this.f43831e;
        if (s10Var != null) {
            this.f43832f[0].n(new g(s10Var, (Serializable) this.h, (Serializable) this.f43833n, 15));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        is isVar = this.f43830c;
        if (isVar != null) {
            int i7 = this.d;
            ns.f(i7).n(isVar, ns.f25468a4);
            ns.f(i7).n(isVar, ns.f25474b4);
        }
    }
}
