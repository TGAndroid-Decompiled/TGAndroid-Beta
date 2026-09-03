package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fe extends org.telegram.ui.Components.d81 {
    public final Context f36778a;
    public final int f36779b;
    public final int f36780c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final ArrayList f36781e = new ArrayList();
    public final ge f36782f;

    public fe(ge geVar, Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f36782f = geVar;
        this.f36778a = context;
        this.f36779b = i10;
        this.f36780c = i11;
        this.d = g6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new ee(this.f36782f, this.f36778a, i10, this.f36779b, this.f36780c, new af.b(this, i10, 16), this.d);
    }

    @Override
    public final int e() {
        return this.f36781e.size();
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
            ArrayList arrayList = this.f36781e;
            if (i10 < arrayList.size()) {
                return ((org.telegram.ui.Components.h51) arrayList.get(i10)).f27388z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f36781e;
        arrayList.clear();
        ge geVar = this.f36782f;
        if (!geVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.h51.C(1));
        }
        if (!geVar.f37079n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.h51.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
