package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
public final class g5 implements View.OnAttachStateChangeListener {
    public final di.r f42526a;
    public final TL_wallet.walletTransaction[] f42527b;
    public final ls f42528c;
    public final int d;
    public final v10 f42529e;
    public final y2[] f42530f;
    public final String[] h;
    public final boolean[] f42531n;

    public g5(di.r rVar, TL_wallet.walletTransaction[] wallettransactionArr, f5 f5Var, int i7, v10 v10Var, y2[] y2VarArr, String[] strArr, boolean[] zArr) {
        this.f42526a = rVar;
        this.f42527b = wallettransactionArr;
        this.f42528c = f5Var;
        this.d = i7;
        this.f42529e = v10Var;
        this.f42530f = y2VarArr;
        this.h = strArr;
        this.f42531n = zArr;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f42526a.a(this.f42527b[0]);
        ls lsVar = this.f42528c;
        if (lsVar != null) {
            int i7 = this.d;
            qs.f(i7).c(lsVar, qs.f24975a4);
            qs.f(i7).c(lsVar, qs.f24981b4);
        }
        v10 v10Var = this.f42529e;
        if (v10Var != null) {
            this.f42530f[0].n(new g(v10Var, (Serializable) this.h, (Serializable) this.f42531n, 15));
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        ls lsVar = this.f42528c;
        if (lsVar != null) {
            int i7 = this.d;
            qs.f(i7).n(lsVar, qs.f24975a4);
            qs.f(i7).n(lsVar, qs.f24981b4);
        }
    }
}
