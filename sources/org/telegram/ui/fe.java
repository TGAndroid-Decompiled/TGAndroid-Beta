package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fe extends org.telegram.ui.Components.q81 {
    public final Context f33601a;
    public final int f33602b;
    public final int f33603c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final ArrayList e = new ArrayList();
    public final ge f33604f;

    public fe(ge geVar, Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f33604f = geVar;
        this.f33601a = context;
        this.f33602b = i10;
        this.f33603c = i11;
        this.d = f6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new ee(this.f33604f, this.f33601a, i10, this.f33602b, this.f33603c, new ai.n8(this, i10, 18), this.d);
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
                return ((org.telegram.ui.Components.y51) arrayList.get(i10)).f30531z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ge geVar = this.f33604f;
        if (!geVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.y51.C(1));
        }
        if (!geVar.f33899n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.y51.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
