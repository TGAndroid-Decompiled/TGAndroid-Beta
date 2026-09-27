package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class he extends org.telegram.ui.Components.p81 {
    public final Context f34200a;
    public final int f34201b;
    public final int f34202c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final ArrayList e = new ArrayList();
    public final ie f34203f;

    public he(ie ieVar, Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f34203f = ieVar;
        this.f34200a = context;
        this.f34201b = i10;
        this.f34202c = i11;
        this.d = e6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new ge(this.f34203f, this.f34200a, i10, this.f34201b, this.f34202c, new ai.o8(this, i10, 18), this.d);
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
                return ((org.telegram.ui.Components.x51) arrayList.get(i10)).f30315z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ie ieVar = this.f34203f;
        if (!ieVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.x51.C(1));
        }
        if (!ieVar.f34452n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.x51.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
