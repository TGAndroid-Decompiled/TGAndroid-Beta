package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class le extends org.telegram.ui.Components.d91 {
    public final Context f37720a;
    public final int f37721b;
    public final int f37722c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final ArrayList e = new ArrayList();
    public final me f37723f;

    public le(me meVar, Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f37723f = meVar;
        this.f37720a = context;
        this.f37721b = i10;
        this.f37722c = i11;
        this.d = c6Var;
        i();
    }

    @Override
    public final View d(int i10) {
        return new ke(this.f37723f, this.f37720a, i10, this.f37721b, this.f37722c, new ah.g(this, i10, 19), this.d);
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
                return ((org.telegram.ui.Components.m61) arrayList.get(i10)).f26959z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        me meVar = this.f37723f;
        if (!meVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.m61.C(1));
        }
        if (!meVar.f37976n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.m61.C(0));
        }
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
