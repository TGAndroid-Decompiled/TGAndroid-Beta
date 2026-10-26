package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fe extends org.telegram.ui.Components.m91 {
    public final Context f39348a;
    public final int f39349b;
    public final int f39350c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final ArrayList e = new ArrayList();
    public final ge f39351f;

    public fe(ge geVar, Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f39351f = geVar;
        this.f39348a = context;
        this.f39349b = i10;
        this.f39350c = i11;
        this.d = u6Var;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        this.f39351f.f39620b.L(view);
    }

    @Override
    public final View d(int i10) {
        return new ee(this.f39351f, this.f39348a, i10, this.f39349b, this.f39350c, new ag.r0(this, i10, 21), this.d);
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
                return ((org.telegram.ui.Components.t61) arrayList.get(i10)).f32888z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ge geVar = this.f39351f;
        if (!geVar.f39623n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.t61.D(1));
        }
        if (!geVar.f39624r.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.t61.D(0));
        }
    }
}
