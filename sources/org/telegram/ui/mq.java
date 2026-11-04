package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class mq extends org.telegram.ui.Components.sj0 {
    public final nq E;
    public final Context f47742c;
    public final kg.v1 h;
    public jq f47745n;
    public boolean f47747s;
    public int f47748w;
    public int f47749x;
    public int f47750y;
    public ArrayList d = new ArrayList();
    public a0.h f47743e = new a0.h();
    public ArrayList f47744f = new ArrayList();
    public int f47746r = 0;

    public mq(nq nqVar, Context context) {
        this.E = nqVar;
        this.f47742c = context;
        kg.v1 v1Var = new kg.v1(true);
        this.h = v1Var;
        v1Var.f17206a = new kq(this);
    }

    @Override
    public final void A(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i3) {
        kg.v1 v1Var = this.h;
        int size = v1Var.f17211g.size();
        if (size != 0) {
            int i10 = size + 1;
            if (i10 > i3) {
                if (i3 == 0) {
                    return null;
                }
                return (TLObject) v1Var.f17211g.get(i3 - 1);
            }
            i3 -= i10;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i11 = size2 + 1;
            if (i11 > i3) {
                if (i3 == 0) {
                    return null;
                }
                return (TLObject) this.d.get(i3 - 1);
            }
            i3 -= i11;
        }
        int size3 = v1Var.f17209e.size();
        if (size3 == 0 || size3 + 1 <= i3 || i3 == 0) {
            return null;
        }
        return (TLObject) v1Var.f17209e.get(i3 - 1);
    }

    public final void F(String str) {
        boolean z10;
        long j10;
        if (this.f47745n != null) {
            Utilities.f21389g.a(this.f47745n);
            this.f47745n = null;
        }
        this.d.clear();
        this.f47743e.b();
        this.f47744f.clear();
        this.h.f(null, null);
        kg.v1 v1Var = this.h;
        nq nqVar = this.E;
        if (nqVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (org.telegram.messenger.t3.T(nqVar.f48074n)) {
            j10 = this.E.N;
        } else {
            j10 = 0;
        }
        v1Var.g(null, z10, false, true, false, j10, false, this.E.O, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            this.f47747s = true;
            this.E.f48049b.e(true, true);
            org.telegram.messenger.p5 p5Var = Utilities.f21389g;
            jq jqVar = new jq(this, str, 0);
            this.f47745n = jqVar;
            p5Var.e(jqVar, 300L);
        }
    }

    @Override
    public final int b() {
        return this.f47746r;
    }

    @Override
    public final int d(int i3) {
        if (i3 != this.f47750y && i3 != this.f47748w && i3 != this.f47749x) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        ci.j1 j1Var;
        this.f47746r = 0;
        kg.v1 v1Var = this.h;
        int size = v1Var.f17211g.size();
        if (size != 0) {
            this.f47748w = 0;
            this.f47746r = size + 1 + this.f47746r;
        } else {
            this.f47748w = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i3 = this.f47746r;
            this.f47749x = i3;
            this.f47746r = size2 + 1 + i3;
        } else {
            this.f47749x = -1;
        }
        int size3 = v1Var.f17209e.size();
        if (size3 != 0) {
            int i10 = this.f47746r;
            this.f47750y = i10;
            this.f47746r = size3 + 1 + i10;
        } else {
            this.f47750y = -1;
        }
        nq nqVar = this.E;
        if (nqVar.f48078o1 && (j1Var = nqVar.f48052c) != null) {
            u4.h0 adapter = j1Var.getAdapter();
            mq mqVar = nqVar.f48057e;
            if (adapter != mqVar) {
                ci.j1 j1Var2 = nqVar.f48052c;
                j1Var2.X1 = true;
                j1Var2.Y1 = 0;
                j1Var2.setAdapter(mqVar);
                nqVar.f48052c.setFastScrollVisible(false);
                nqVar.f48052c.setVerticalScrollBarEnabled(true);
            }
        }
        super.f();
    }

    @Override
    public final void t(u4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mq.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.e6 e6Var;
        nq nqVar = this.E;
        if (i3 != 0) {
            e6Var = ((org.telegram.ui.ActionBar.d2) nqVar).resourceProvider;
            view = new org.telegram.ui.Cells.x3(26, this.f47742c, e6Var);
            view.setBackground(null);
        } else {
            if (nqVar.f48059e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f47742c, 2, 2, z10, null);
            a5Var.H = true;
            a5Var.setDelegate(new kq(this));
            view = a5Var;
        }
        return new u4.d1(view);
    }
}
