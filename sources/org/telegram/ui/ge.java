package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ge extends org.telegram.ui.Components.b81 {
    public final Context f33958a;
    public final int f33959b;
    public final int f33960c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final ArrayList e = new ArrayList();
    public final he f33961f;

    public ge(he heVar, Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f33961f = heVar;
        this.f33958a = context;
        this.f33959b = i10;
        this.f33960c = i11;
        this.d = f6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new fe(this.f33961f, this.f33958a, i10, this.f33959b, this.f33960c, new ai.n8(this, i10, 18), this.d);
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
                return ((org.telegram.ui.Components.j51) arrayList.get(i10)).f25140z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        he heVar = this.f33961f;
        if (!heVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.j51.C(1));
        }
        if (!heVar.f34251n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.j51.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
