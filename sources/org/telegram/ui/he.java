package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class he extends org.telegram.ui.Components.y81 {
    public final Context f37067a;
    public final int f37068b;
    public final int f37069c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final ArrayList f37070e = new ArrayList();
    public final ie f37071f;

    public he(ie ieVar, Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f37071f = ieVar;
        this.f37067a = context;
        this.f37068b = i10;
        this.f37069c = i11;
        this.d = d6Var;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        this.f37071f.f37389b.L(view);
    }

    @Override
    public final View d(int i10) {
        return new ge(this.f37071f, this.f37067a, i10, this.f37068b, this.f37069c, new ai.o8(this, i10, 18), this.d);
    }

    @Override
    public final int e() {
        return this.f37070e.size();
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
            ArrayList arrayList = this.f37070e;
            if (i10 < arrayList.size()) {
                return ((org.telegram.ui.Components.h61) arrayList.get(i10)).f27106z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f37070e;
        arrayList.clear();
        ie ieVar = this.f37071f;
        if (!ieVar.f37393n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.h61.D(1));
        }
        if (!ieVar.f37394r.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.h61.D(0));
        }
    }
}
