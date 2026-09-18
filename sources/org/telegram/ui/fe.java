package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fe extends org.telegram.ui.Components.o81 {
    public final Context f33517a;
    public final int f33518b;
    public final int f33519c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final ArrayList e = new ArrayList();
    public final ge f33520f;

    public fe(ge geVar, Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f33520f = geVar;
        this.f33517a = context;
        this.f33518b = i10;
        this.f33519c = i11;
        this.d = e6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new ee(this.f33520f, this.f33517a, i10, this.f33518b, this.f33519c, new ai.n8(this, i10, 20), this.d);
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
                return ((org.telegram.ui.Components.x51) arrayList.get(i10)).f30261z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ge geVar = this.f33520f;
        if (!geVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.x51.C(1));
        }
        if (!geVar.f33820n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.x51.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
