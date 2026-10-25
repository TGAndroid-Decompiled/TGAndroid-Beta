package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fe extends org.telegram.ui.Components.m91 {
    public final Context f39345a;
    public final int f39346b;
    public final int f39347c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final ArrayList e = new ArrayList();
    public final ge f39348f;

    public fe(ge geVar, Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f39348f = geVar;
        this.f39345a = context;
        this.f39346b = i10;
        this.f39347c = i11;
        this.d = u6Var;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        this.f39348f.f39617b.L(view);
    }

    @Override
    public final View d(int i10) {
        return new ee(this.f39348f, this.f39345a, i10, this.f39346b, this.f39347c, new ag.r0(this, i10, 21), this.d);
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
                return ((org.telegram.ui.Components.t61) arrayList.get(i10)).f32885z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ge geVar = this.f39348f;
        if (!geVar.f39620n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.t61.D(1));
        }
        if (!geVar.f39621r.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.t61.D(0));
        }
    }
}
