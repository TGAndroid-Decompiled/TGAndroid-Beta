package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ge extends org.telegram.ui.Components.n81 {
    public final Context f33066a;
    public final int f33067b;
    public final int f33068c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final ArrayList e = new ArrayList();
    public final he f33069f;

    public ge(he heVar, Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f33069f = heVar;
        this.f33066a = context;
        this.f33067b = i10;
        this.f33068c = i11;
        this.d = f6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new fe(this.f33069f, this.f33066a, i10, this.f33067b, this.f33068c, new bi.s(this, i10, 17), this.d);
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
                return ((org.telegram.ui.Components.v51) arrayList.get(i10)).f27842z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        he heVar = this.f33069f;
        if (!heVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.v51.C(1));
        }
        if (!heVar.f33359n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.v51.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
