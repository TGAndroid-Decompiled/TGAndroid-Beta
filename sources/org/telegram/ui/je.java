package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class je extends org.telegram.ui.Components.l91 {
    public final Context f39187a;
    public final int f39188b;
    public final int f39189c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final ArrayList f39190e = new ArrayList();
    public final ke f39191f;

    public je(ke keVar, Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f39191f = keVar;
        this.f39187a = context;
        this.f39188b = i10;
        this.f39189c = i11;
        this.d = c6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new ie(this.f39191f, this.f39187a, i10, this.f39188b, this.f39189c, new ai.p8(this, i10, 18), this.d);
    }

    @Override
    public final int e() {
        return this.f39190e.size();
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
            ArrayList arrayList = this.f39190e;
            if (i10 < arrayList.size()) {
                return ((org.telegram.ui.Components.u61) arrayList.get(i10)).f31084z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f39190e;
        arrayList.clear();
        ke keVar = this.f39191f;
        if (!keVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.u61.C(1));
        }
        if (!keVar.f39465n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.u61.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
