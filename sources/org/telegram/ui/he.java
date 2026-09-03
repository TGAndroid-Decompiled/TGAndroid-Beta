package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class he extends org.telegram.ui.Components.c81 {
    public final Context f34650a;
    public final int f34651b;
    public final int f34652c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final ArrayList e = new ArrayList();
    public final ie f34653f;

    public he(ie ieVar, Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f34653f = ieVar;
        this.f34650a = context;
        this.f34651b = i10;
        this.f34652c = i11;
        this.d = f6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new ge(this.f34653f, this.f34650a, i10, this.f34651b, this.f34652c, new ah.b(this, i10, 15), this.d);
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
                return ((org.telegram.ui.Components.i51) arrayList.get(i10)).f25598z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ie ieVar = this.f34653f;
        if (!ieVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.i51.C(1));
        }
        if (!ieVar.f34911n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.i51.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
