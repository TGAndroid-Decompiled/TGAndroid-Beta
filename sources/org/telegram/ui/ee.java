package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ee extends org.telegram.ui.Components.h91 {
    public final Context f37273a;
    public final int f37274b;
    public final int f37275c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final ArrayList f37276e = new ArrayList();
    public final fe f37277f;

    public ee(fe feVar, Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f37277f = feVar;
        this.f37273a = context;
        this.f37274b = i10;
        this.f37275c = i11;
        this.d = d6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new de(this.f37277f, this.f37273a, i10, this.f37274b, this.f37275c, new ai.p8(this, i10, 18), this.d);
    }

    @Override
    public final int e() {
        return this.f37276e.size();
    }

    @Override
    public final CharSequence g(int i10) {
        int h = h(i10);
        if (h != 0) {
            if (h != 1) {
                return "";
            }
            return LocaleController.getString(R.string.MonetizationTransactionsTON);
        }
        return LocaleController.getString(R.string.MonetizationTransactionsStars);
    }

    @Override
    public final int h(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f37276e;
            if (i10 < arrayList.size()) {
                return ((org.telegram.ui.Components.r61) arrayList.get(i10)).f30374z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f37276e;
        arrayList.clear();
        fe feVar = this.f37277f;
        if (!feVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.r61.C(1));
        }
        if (!feVar.f37652n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.r61.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
