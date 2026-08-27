package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class ae extends org.telegram.ui.Components.g71 {

    public final Context f36516a;

    public final int f36517b;

    public final int f36518c;
    public final org.telegram.ui.ActionBar.c6 d;

    public final ArrayList f36519e = new ArrayList();

    public final be f36520f;

    public ae(be beVar, Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f36520f = beVar;
        this.f36516a = context;
        this.f36517b = i10;
        this.f36518c = i11;
        this.d = c6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new zd(this.f36520f, this.f36516a, i10, this.f36517b, this.f36518c, new cg.w1(this, i10, 16), this.d);
    }

    @Override
    public final int e() {
        return this.f36519e.size();
    }

    @Override
    public final CharSequence g(int i10) {
        int iH = h(i10);
        if (iH != 0) {
            return iH != 1 ? "" : LocaleController.getString(R.string.MonetizationTransactionsTON);
        }
        return LocaleController.getString(R.string.MonetizationTransactionsStars);
    }

    @Override
    public final int h(int i10) {
        if (i10 < 0) {
            return 1;
        }
        ArrayList arrayList = this.f36519e;
        if (i10 >= arrayList.size()) {
            return 1;
        }
        return ((org.telegram.ui.Components.n41) arrayList.get(i10)).f30857z;
    }

    public final void i() {
        ArrayList arrayList = this.f36519e;
        arrayList.clear();
        be beVar = this.f36520f;
        if (!beVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.n41.C(1));
        }
        if (beVar.f36790n.isEmpty()) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.n41.C(0));
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
