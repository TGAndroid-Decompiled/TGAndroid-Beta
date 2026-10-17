package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fe extends org.telegram.ui.Components.u81 {
    public final Context f36876a;
    public final int f36877b;
    public final int f36878c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final ArrayList e = new ArrayList();
    public final ge f36879f;

    public fe(ge geVar, Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f36879f = geVar;
        this.f36876a = context;
        this.f36877b = i10;
        this.f36878c = i11;
        this.d = d6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new ee(this.f36879f, this.f36876a, i10, this.f36877b, this.f36878c, new ah.g(this, i10, 21), this.d);
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
                return ((org.telegram.ui.Components.f61) arrayList.get(i10)).f26153z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ge geVar = this.f36879f;
        if (!geVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.f61.C(1));
        }
        if (!geVar.f37228n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.f61.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
