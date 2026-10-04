package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class he extends org.telegram.ui.Components.x81 {
    public final Context f37053a;
    public final int f37054b;
    public final int f37055c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final ArrayList f37056e = new ArrayList();
    public final ie f37057f;

    public he(ie ieVar, Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f37057f = ieVar;
        this.f37053a = context;
        this.f37054b = i10;
        this.f37055c = i11;
        this.d = d6Var;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        this.f37057f.f37406b.L(view);
    }

    @Override
    public final View d(int i10) {
        return new ge(this.f37057f, this.f37053a, i10, this.f37054b, this.f37055c, new ai.o8(this, i10, 18), this.d);
    }

    @Override
    public final int e() {
        return this.f37056e.size();
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
            ArrayList arrayList = this.f37056e;
            if (i10 < arrayList.size()) {
                return ((org.telegram.ui.Components.g61) arrayList.get(i10)).f26687z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f37056e;
        arrayList.clear();
        ie ieVar = this.f37057f;
        if (!ieVar.f37410n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.g61.C(1));
        }
        if (!ieVar.f37411r.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.g61.C(0));
        }
    }
}
