package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class nq extends org.telegram.ui.Components.oj0 {
    public final oq D;
    public final Context f48108c;
    public final jg.z1 h;
    public lq f48111n;
    public boolean f48113s;
    public int f48114w;
    public int f48115x;
    public int f48116y;
    public ArrayList d = new ArrayList();
    public a0.h f48109e = new a0.h();
    public ArrayList f48110f = new ArrayList();
    public int f48112r = 0;

    public nq(oq oqVar, Context context) {
        this.D = oqVar;
        this.f48108c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.h = z1Var;
        z1Var.f16989a = new mq(this);
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f56952a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f56956f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i7) {
        jg.z1 z1Var = this.h;
        int size = z1Var.f16994g.size();
        if (size != 0) {
            int i10 = size + 1;
            if (i10 > i7) {
                if (i7 == 0) {
                    return null;
                }
                return (TLObject) z1Var.f16994g.get(i7 - 1);
            }
            i7 -= i10;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i11 = size2 + 1;
            if (i11 > i7) {
                if (i7 == 0) {
                    return null;
                }
                return (TLObject) this.d.get(i7 - 1);
            }
            i7 -= i11;
        }
        int size3 = z1Var.f16992e.size();
        if (size3 == 0 || size3 + 1 <= i7 || i7 == 0) {
            return null;
        }
        return (TLObject) z1Var.f16992e.get(i7 - 1);
    }

    public final void F(String str) {
        boolean z9;
        long j3;
        if (this.f48111n != null) {
            Utilities.f21335g.a(this.f48111n);
            this.f48111n = null;
        }
        this.d.clear();
        this.f48109e.b();
        this.f48110f.clear();
        this.h.f(null, null);
        jg.z1 z1Var = this.h;
        oq oqVar = this.D;
        if (oqVar.N != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (org.telegram.messenger.t3.T(oqVar.f48498n)) {
            j3 = this.D.M;
        } else {
            j3 = 0;
        }
        z1Var.g(null, z9, false, true, false, j3, false, this.D.N, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            this.f48113s = true;
            this.D.f48472b.e(true, true);
            org.telegram.messenger.p5 p5Var = Utilities.f21335g;
            lq lqVar = new lq(this, str, 0);
            this.f48111n = lqVar;
            p5Var.d(lqVar, 300L);
        }
    }

    @Override
    public final int b() {
        return this.f48112r;
    }

    @Override
    public final int d(int i7) {
        if (i7 != this.f48116y && i7 != this.f48114w && i7 != this.f48115x) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        bi.q1 q1Var;
        this.f48112r = 0;
        jg.z1 z1Var = this.h;
        int size = z1Var.f16994g.size();
        if (size != 0) {
            this.f48114w = 0;
            this.f48112r = size + 1 + this.f48112r;
        } else {
            this.f48114w = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i7 = this.f48112r;
            this.f48115x = i7;
            this.f48112r = size2 + 1 + i7;
        } else {
            this.f48115x = -1;
        }
        int size3 = z1Var.f16992e.size();
        if (size3 != 0) {
            int i10 = this.f48112r;
            this.f48116y = i10;
            this.f48112r = size3 + 1 + i10;
        } else {
            this.f48116y = -1;
        }
        oq oqVar = this.D;
        if (oqVar.n1 && (q1Var = oqVar.f48475c) != null) {
            v4.g0 adapter = q1Var.getAdapter();
            nq nqVar = oqVar.f48480e;
            if (adapter != nqVar) {
                bi.q1 q1Var2 = oqVar.f48475c;
                q1Var2.W1 = true;
                q1Var2.X1 = 0;
                q1Var2.setAdapter(nqVar);
                oqVar.f48475c.setFastScrollVisible(false);
                oqVar.f48475c.setVerticalScrollBarEnabled(true);
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nq.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        boolean z9;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        oq oqVar = this.D;
        if (i7 != 0) {
            f6Var = ((org.telegram.ui.ActionBar.f2) oqVar).resourceProvider;
            view = new org.telegram.ui.Cells.x3(26, this.f48108c, f6Var);
            view.setBackground(null);
        } else {
            if (oqVar.f48479d1 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f48108c, 2, 2, z9, null);
            a5Var.G = true;
            a5Var.setDelegate(new mq(this));
            view = a5Var;
        }
        return new v4.d1(view);
    }
}
