package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class or extends org.telegram.ui.Components.sk0 {
    public final pr D;
    public final Context f40369c;
    public final zf.m1 h;
    public mr f40371n;
    public boolean f40373s;
    public int f40374w;
    public int f40375x;
    public int f40376y;
    public ArrayList d = new ArrayList();
    public a0.h e = new a0.h();
    public ArrayList f40370f = new ArrayList();
    public int f40372r = 0;

    public or(pr prVar, Context context) {
        this.D = prVar;
        this.f40369c = context;
        zf.m1 m1Var = new zf.m1(true);
        this.h = m1Var;
        m1Var.f55575a = new nr(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f47898a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        zf.m1 m1Var = this.h;
        int size = m1Var.f55579g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) m1Var.f55579g.get(i10 - 1);
            }
            i10 -= i11;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i12 = size2 + 1;
            if (i12 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) this.d.get(i10 - 1);
            }
            i10 -= i12;
        }
        int size3 = m1Var.e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) m1Var.e.get(i10 - 1);
    }

    public final void F(String str) {
        boolean z10;
        long j10;
        if (this.f40371n != null) {
            Utilities.f14522g.a(this.f40371n);
            this.f40371n = null;
        }
        this.d.clear();
        this.e.b();
        this.f40370f.clear();
        this.h.f(null, null);
        zf.m1 m1Var = this.h;
        pr prVar = this.D;
        if (prVar.N != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (org.telegram.messenger.w3.T(prVar.f40746n)) {
            j10 = this.D.M;
        } else {
            j10 = 0;
        }
        m1Var.g(null, z10, false, true, false, j10, false, this.D.N, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            this.f40373s = true;
            this.D.f40721b.e(true, true);
            org.telegram.messenger.r5 r5Var = Utilities.f14522g;
            mr mrVar = new mr(this, str, 0);
            this.f40371n = mrVar;
            r5Var.d(mrVar, 300L);
        }
    }

    @Override
    public final int b() {
        return this.f40372r;
    }

    @Override
    public final int d(int i10) {
        if (i10 != this.f40376y && i10 != this.f40374w && i10 != this.f40375x) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        ag.b1 b1Var;
        this.f40372r = 0;
        zf.m1 m1Var = this.h;
        int size = m1Var.f55579g.size();
        if (size != 0) {
            this.f40374w = 0;
            this.f40372r = size + 1 + this.f40372r;
        } else {
            this.f40374w = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f40372r;
            this.f40375x = i10;
            this.f40372r = size2 + 1 + i10;
        } else {
            this.f40375x = -1;
        }
        int size3 = m1Var.e.size();
        if (size3 != 0) {
            int i11 = this.f40372r;
            this.f40376y = i11;
            this.f40372r = size3 + 1 + i11;
        } else {
            this.f40376y = -1;
        }
        pr prVar = this.D;
        if (prVar.f40748n1 && (b1Var = prVar.f40724c) != null) {
            s4.g0 adapter = b1Var.getAdapter();
            or orVar = prVar.e;
            if (adapter != orVar) {
                ag.b1 b1Var2 = prVar.f40724c;
                b1Var2.W1 = true;
                b1Var2.X1 = 0;
                b1Var2.setAdapter(orVar);
                prVar.f40724c.setFastScrollVisible(false);
                prVar.f40724c.setVerticalScrollBarEnabled(true);
            }
        }
        super.f();
    }

    @Override
    public final void t(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.or.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.p6 p6Var;
        pr prVar = this.D;
        if (i10 != 0) {
            p6Var = ((org.telegram.ui.ActionBar.k2) prVar).resourceProvider;
            view = new org.telegram.ui.Cells.z3(26, this.f40369c, p6Var);
            view.setBackground(null);
        } else {
            if (prVar.f40728d1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.e5 e5Var = new org.telegram.ui.Cells.e5(2, 2, this.f40369c, null, z10);
            e5Var.G = true;
            e5Var.setDelegate(new nr(this));
            view = e5Var;
        }
        return new s4.c1(view);
    }
}
