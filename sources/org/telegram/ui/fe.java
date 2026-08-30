package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fe extends org.telegram.ui.Components.c81 {
    public final Context f34223a;
    public final int f34224b;
    public final int f34225c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final ArrayList e = new ArrayList();
    public final ge f34226f;

    public fe(ge geVar, Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f34226f = geVar;
        this.f34223a = context;
        this.f34224b = i10;
        this.f34225c = i11;
        this.d = f6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new ee(this.f34226f, this.f34223a, i10, this.f34224b, this.f34225c, new af.b(this, i10, 16), this.d);
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
                return ((org.telegram.ui.Components.i51) arrayList.get(i10)).f25578z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ge geVar = this.f34226f;
        if (!geVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.i51.C(1));
        }
        if (!geVar.f34583n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.i51.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
