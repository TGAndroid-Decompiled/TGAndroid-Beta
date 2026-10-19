package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class de extends org.telegram.ui.Components.v81 {
    public final Context f36333a;
    public final int f36334b;
    public final int f36335c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final ArrayList e = new ArrayList();
    public final ee f36336f;

    public de(ee eeVar, Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f36336f = eeVar;
        this.f36333a = context;
        this.f36334b = i10;
        this.f36335c = i11;
        this.d = d6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new ce(this.f36336f, this.f36333a, i10, this.f36334b, this.f36335c, new ah.g(this, i10, 21), this.d);
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
                return ((org.telegram.ui.Components.g61) arrayList.get(i10)).f26510z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ee eeVar = this.f36336f;
        if (!eeVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.g61.C(1));
        }
        if (!eeVar.f36637n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.g61.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
