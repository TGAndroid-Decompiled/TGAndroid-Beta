package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fe extends org.telegram.ui.Components.g91 {
    public final Context f37564a;
    public final int f37565b;
    public final int f37566c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final ArrayList f37567e = new ArrayList();
    public final ge f37568f;

    public fe(ge geVar, Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f37568f = geVar;
        this.f37564a = context;
        this.f37565b = i10;
        this.f37566c = i11;
        this.d = e6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new ee(this.f37568f, this.f37564a, i10, this.f37565b, this.f37566c, new ai.p8(this, i10, 18), this.d);
    }

    @Override
    public final int e() {
        return this.f37567e.size();
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
            ArrayList arrayList = this.f37567e;
            if (i10 < arrayList.size()) {
                return ((org.telegram.ui.Components.q61) arrayList.get(i10)).f30076z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f37567e;
        arrayList.clear();
        ge geVar = this.f37568f;
        if (!geVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.q61.C(1));
        }
        if (!geVar.f38034n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.q61.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
