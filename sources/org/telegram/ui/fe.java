package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fe extends org.telegram.ui.Components.a81 {
    public final Context f36380a;
    public final int f36381b;
    public final int f36382c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final ArrayList f36383e = new ArrayList();
    public final ge f36384f;

    public fe(ge geVar, Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f36384f = geVar;
        this.f36380a = context;
        this.f36381b = i10;
        this.f36382c = i11;
        this.d = f6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new ee(this.f36384f, this.f36380a, i10, this.f36381b, this.f36382c, new ah.g(this, i10, 19), this.d);
    }

    @Override
    public final int e() {
        return this.f36383e.size();
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
            ArrayList arrayList = this.f36383e;
            if (i10 < arrayList.size()) {
                return ((org.telegram.ui.Components.h51) arrayList.get(i10)).f26608z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f36383e;
        arrayList.clear();
        ge geVar = this.f36384f;
        if (!geVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.h51.C(1));
        }
        if (!geVar.f36640n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.h51.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
