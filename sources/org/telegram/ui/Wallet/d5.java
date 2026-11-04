package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_wallet;
public final class d5 implements View.OnAttachStateChangeListener {
    public final ei.s f42427a;
    public final TL_wallet.walletTransaction[] f42428b;
    public final cs f42429c;
    public final int d;
    public final n10 f42430e;
    public final y2[] f42431f;
    public final String[] h;
    public final boolean[] f42432n;

    public d5(ei.s sVar, TL_wallet.walletTransaction[] wallettransactionArr, c5 c5Var, int i3, n10 n10Var, y2[] y2VarArr, String[] strArr, boolean[] zArr) {
        this.f42427a = sVar;
        this.f42428b = wallettransactionArr;
        this.f42429c = c5Var;
        this.d = i3;
        this.f42430e = n10Var;
        this.f42431f = y2VarArr;
        this.h = strArr;
        this.f42432n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42427a.a(this.f42428b[0]);
        cs csVar = this.f42429c;
        if (csVar != null) {
            int i3 = this.d;
            hs.f(i3).c(csVar, hs.f23200a4);
            hs.f(i3).c(csVar, hs.f23206b4);
        }
        n10 n10Var = this.f42430e;
        if (n10Var != null) {
            this.f42431f[0].n(new g(n10Var, (Serializable) this.h, (Serializable) this.f42432n, 14));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        cs csVar = this.f42429c;
        if (csVar != null) {
            int i3 = this.d;
            hs.f(i3).n(csVar, hs.f23200a4);
            hs.f(i3).n(csVar, hs.f23206b4);
        }
    }
}
