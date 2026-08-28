package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ae extends org.telegram.ui.Components.e71 {
    public final Context f36460a;
    public final int f36461b;
    public final int f36462c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final ArrayList f36463e = new ArrayList();
    public final be f36464f;

    public ae(be beVar, Context context, int i9, long j10, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f36464f = beVar;
        this.f36460a = context;
        this.f36461b = i9;
        this.f36462c = i10;
        this.d = b6Var;
        i();
    }

    @Override
    public final View d(int i9) {
        return new zd(this.f36464f, this.f36460a, i9, this.f36461b, this.f36462c, new bg.c2(this, i9, 17), this.d);
    }

    @Override
    public final int e() {
        return this.f36463e.size();
    }

    @Override
    public final CharSequence g(int i9) {
        int h = h(i9);
        if (h != 0) {
            if (h != 1) {
                return "";
            }
            return LocaleController.getString(R.string.MonetizationTransactionsTON);
        }
        return LocaleController.getString(R.string.MonetizationTransactionsStars);
    }

    @Override
    public final int h(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.f36463e;
            if (i9 < arrayList.size()) {
                return ((org.telegram.ui.Components.l41) arrayList.get(i9)).f30352z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f36463e;
        arrayList.clear();
        be beVar = this.f36464f;
        if (!beVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.l41.C(1));
        }
        if (!beVar.f36836n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.l41.C(0));
        }
    }

    @Override
    public final void b(View view, int i9, int i10) {
    }
}
