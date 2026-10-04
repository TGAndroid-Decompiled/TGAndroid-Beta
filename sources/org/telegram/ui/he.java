package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class he extends org.telegram.ui.Components.x81 {
    public final Context f37048a;
    public final int f37049b;
    public final int f37050c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final ArrayList f37051e = new ArrayList();
    public final ie f37052f;

    public he(ie ieVar, Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f37052f = ieVar;
        this.f37048a = context;
        this.f37049b = i10;
        this.f37050c = i11;
        this.d = d6Var;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        this.f37052f.f37401b.L(view);
    }

    @Override
    public final View d(int i10) {
        return new ge(this.f37052f, this.f37048a, i10, this.f37049b, this.f37050c, new ai.o8(this, i10, 18), this.d);
    }

    @Override
    public final int e() {
        return this.f37051e.size();
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
            ArrayList arrayList = this.f37051e;
            if (i10 < arrayList.size()) {
                return ((org.telegram.ui.Components.g61) arrayList.get(i10)).f26682z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f37051e;
        arrayList.clear();
        ie ieVar = this.f37052f;
        if (!ieVar.f37405n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.g61.C(1));
        }
        if (!ieVar.f37406r.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.g61.C(0));
        }
    }
}
