package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class he extends org.telegram.ui.Components.x81 {
    public final Context f37047a;
    public final int f37048b;
    public final int f37049c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final ArrayList f37050e = new ArrayList();
    public final ie f37051f;

    public he(ie ieVar, Context context, int i10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f37051f = ieVar;
        this.f37047a = context;
        this.f37048b = i10;
        this.f37049c = i11;
        this.d = d6Var;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        this.f37051f.f37400b.L(view);
    }

    @Override
    public final View d(int i10) {
        return new ge(this.f37051f, this.f37047a, i10, this.f37048b, this.f37049c, new ai.o8(this, i10, 18), this.d);
    }

    @Override
    public final int e() {
        return this.f37050e.size();
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
            ArrayList arrayList = this.f37050e;
            if (i10 < arrayList.size()) {
                return ((org.telegram.ui.Components.g61) arrayList.get(i10)).f26681z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.f37050e;
        arrayList.clear();
        ie ieVar = this.f37051f;
        if (!ieVar.f37404n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.g61.C(1));
        }
        if (!ieVar.f37405r.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.g61.C(0));
        }
    }
}
