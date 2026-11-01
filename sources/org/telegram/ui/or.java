package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class or extends org.telegram.ui.Components.tk0 {
    public final pr D;
    public final Context f40251c;
    public final zf.m1 h;
    public mr f40253n;
    public boolean f40255s;
    public int f40256w;
    public int f40257x;
    public int f40258y;
    public ArrayList d = new ArrayList();
    public a0.h e = new a0.h();
    public ArrayList f40252f = new ArrayList();
    public int f40254r = 0;

    public or(pr prVar, Context context) {
        this.D = prVar;
        this.f40251c = context;
        zf.m1 m1Var = new zf.m1(true);
        this.h = m1Var;
        m1Var.f55593a = new nr(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f47909a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        zf.m1 m1Var = this.h;
        int size = m1Var.f55597g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) m1Var.f55597g.get(i10 - 1);
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
        if (this.f40253n != null) {
            Utilities.f14523g.a(this.f40253n);
            this.f40253n = null;
        }
        this.d.clear();
        this.e.b();
        this.f40252f.clear();
        this.h.f(null, null);
        zf.m1 m1Var = this.h;
        pr prVar = this.D;
        if (prVar.N != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (org.telegram.messenger.w3.T(prVar.f40553n)) {
            j10 = this.D.M;
        } else {
            j10 = 0;
        }
        m1Var.g(null, z10, false, true, false, j10, false, this.D.N, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            this.f40255s = true;
            this.D.f40528b.e(true, true);
            org.telegram.messenger.r5 r5Var = Utilities.f14523g;
            mr mrVar = new mr(this, str, 0);
            this.f40253n = mrVar;
            r5Var.d(mrVar, 300L);
        }
    }

    @Override
    public final int b() {
        return this.f40254r;
    }

    @Override
    public final int d(int i10) {
        if (i10 != this.f40258y && i10 != this.f40256w && i10 != this.f40257x) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        ag.b1 b1Var;
        this.f40254r = 0;
        zf.m1 m1Var = this.h;
        int size = m1Var.f55597g.size();
        if (size != 0) {
            this.f40256w = 0;
            this.f40254r = size + 1 + this.f40254r;
        } else {
            this.f40256w = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f40254r;
            this.f40257x = i10;
            this.f40254r = size2 + 1 + i10;
        } else {
            this.f40257x = -1;
        }
        int size3 = m1Var.e.size();
        if (size3 != 0) {
            int i11 = this.f40254r;
            this.f40258y = i11;
            this.f40254r = size3 + 1 + i11;
        } else {
            this.f40258y = -1;
        }
        pr prVar = this.D;
        if (prVar.f40555n1 && (b1Var = prVar.f40531c) != null) {
            s4.g0 adapter = b1Var.getAdapter();
            or orVar = prVar.e;
            if (adapter != orVar) {
                ag.b1 b1Var2 = prVar.f40531c;
                b1Var2.W1 = true;
                b1Var2.X1 = 0;
                b1Var2.setAdapter(orVar);
                prVar.f40531c.setFastScrollVisible(false);
                prVar.f40531c.setVerticalScrollBarEnabled(true);
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
            view = new org.telegram.ui.Cells.z3(26, this.f40251c, p6Var);
            view.setBackground(null);
        } else {
            if (prVar.f40535d1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.e5 e5Var = new org.telegram.ui.Cells.e5(2, 2, this.f40251c, null, z10);
            e5Var.G = true;
            e5Var.setDelegate(new nr(this));
            view = e5Var;
        }
        return new s4.c1(view);
    }
}
