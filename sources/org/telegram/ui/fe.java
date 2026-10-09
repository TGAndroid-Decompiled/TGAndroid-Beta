package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fe extends org.telegram.ui.Components.f91 {
    public final Context f37518a;
    public final int f37519b;
    public final int f37520c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final ArrayList f37521e = new ArrayList();
    public final ge f37522f;

    public fe(ge geVar, Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f37522f = geVar;
        this.f37518a = context;
        this.f37519b = i10;
        this.f37520c = i11;
        this.d = e6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new ee(this.f37522f, this.f37518a, i10, this.f37519b, this.f37520c, new ai.p8(this, i10, 18), this.d);
    }

    @Override
    public final int e() {
        return this.f37521e.size();
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
            ArrayList arrayList = this.f37521e;
            if (i10 < arrayList.size()) {
                return ((org.telegram.ui.Components.p61) arrayList.get(i10)).f29747z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f37521e;
        arrayList.clear();
        ge geVar = this.f37522f;
        if (!geVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.p61.C(1));
        }
        if (!geVar.f37988n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.p61.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
