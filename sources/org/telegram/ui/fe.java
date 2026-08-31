package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fe extends org.telegram.ui.Components.e81 {
    public final Context f36859a;
    public final int f36860b;
    public final int f36861c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final ArrayList f36862e = new ArrayList();
    public final ge f36863f;

    public fe(ge geVar, Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f36863f = geVar;
        this.f36859a = context;
        this.f36860b = i10;
        this.f36861c = i11;
        this.d = g6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new ee(this.f36863f, this.f36859a, i10, this.f36860b, this.f36861c, new af.b(this, i10, 16), this.d);
    }

    @Override
    public final int e() {
        return this.f36862e.size();
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
            ArrayList arrayList = this.f36862e;
            if (i10 < arrayList.size()) {
                return ((org.telegram.ui.Components.j51) arrayList.get(i10)).f28027z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f36862e;
        arrayList.clear();
        ge geVar = this.f36863f;
        if (!geVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.j51.C(1));
        }
        if (!geVar.f37172n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.j51.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
