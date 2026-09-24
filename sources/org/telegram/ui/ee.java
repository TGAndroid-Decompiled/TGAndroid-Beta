package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ee extends org.telegram.ui.Components.n81 {
    public final Context f33353a;
    public final int f33354b;
    public final int f33355c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final ArrayList e = new ArrayList();
    public final fe f33356f;

    public ee(fe feVar, Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f33356f = feVar;
        this.f33353a = context;
        this.f33354b = i10;
        this.f33355c = i11;
        this.d = d6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new de(this.f33356f, this.f33353a, i10, this.f33354b, this.f33355c, new ai.o8(this, i10, 18), this.d);
    }

    @Override
    public final int e() {
        return this.e.size();
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
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                return ((org.telegram.ui.Components.v51) arrayList.get(i10)).f29055z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        fe feVar = this.f33356f;
        if (!feVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.v51.C(1));
        }
        if (!feVar.f33632n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.v51.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
