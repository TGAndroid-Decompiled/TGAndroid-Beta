package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class ge extends org.telegram.ui.Components.p71 {
    public final Context f37460a;
    public final int f37461b;
    public final int f37462c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final ArrayList e = new ArrayList();
    public final he f37463f;

    public ge(he heVar, Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f37463f = heVar;
        this.f37460a = context;
        this.f37461b = i10;
        this.f37462c = i11;
        this.d = p6Var;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        this.f37463f.f37796b.L(view);
    }

    @Override
    public final View d(int i10) {
        return new fe(this.f37463f, this.f37460a, i10, this.f37461b, this.f37462c, new ag.d3(this, i10, 15), this.d);
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
            return org.telegram.messenger.dd.L0(2131748367, null);
        }
        return org.telegram.messenger.dd.L0(2131748368, null);
    }

    @Override
    public final int h(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                return ((org.telegram.ui.Components.b51) arrayList.get(i10)).f24656z;
            }
            return 1;
        }
        return 1;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        he heVar = this.f37463f;
        if (!heVar.f37799n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.b51.D(1));
        }
        if (!heVar.f37800r.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.b51.D(0));
        }
    }
}
