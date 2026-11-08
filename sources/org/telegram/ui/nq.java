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
    public final Context f48107c;
    public final jg.z1 h;
    public lq f48110n;
    public boolean f48112s;
    public int f48113w;
    public int f48114x;
    public int f48115y;
    public ArrayList d = new ArrayList();
    public a0.h f48108e = new a0.h();
    public ArrayList f48109f = new ArrayList();
    public int f48111r = 0;

    public nq(oq oqVar, Context context) {
        this.D = oqVar;
        this.f48107c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.h = z1Var;
        z1Var.f16992a = new mq(this);
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57043a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57047f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i7) {
        jg.z1 z1Var = this.h;
        int size = z1Var.f16997g.size();
        if (size != 0) {
            int i10 = size + 1;
            if (i10 > i7) {
                if (i7 == 0) {
                    return null;
                }
                return (TLObject) z1Var.f16997g.get(i7 - 1);
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
        int size3 = z1Var.f16995e.size();
        if (size3 == 0 || size3 + 1 <= i7 || i7 == 0) {
            return null;
        }
        return (TLObject) z1Var.f16995e.get(i7 - 1);
    }

    public final void F(String str) {
        boolean z9;
        long j3;
        if (this.f48110n != null) {
            Utilities.f21338g.a(this.f48110n);
            this.f48110n = null;
        }
        this.d.clear();
        this.f48108e.b();
        this.f48109f.clear();
        this.h.f(null, null);
        jg.z1 z1Var = this.h;
        oq oqVar = this.D;
        if (oqVar.N != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (org.telegram.messenger.t3.T(oqVar.f48491n)) {
            j3 = this.D.M;
        } else {
            j3 = 0;
        }
        z1Var.g(null, z9, false, true, false, j3, false, this.D.N, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            this.f48112s = true;
            this.D.f48465b.e(true, true);
            org.telegram.messenger.p5 p5Var = Utilities.f21338g;
            lq lqVar = new lq(this, str, 0);
            this.f48110n = lqVar;
            p5Var.d(lqVar, 300L);
        }
    }

    @Override
    public final int b() {
        return this.f48111r;
    }

    @Override
    public final int d(int i7) {
        if (i7 != this.f48115y && i7 != this.f48113w && i7 != this.f48114x) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        bi.q1 q1Var;
        this.f48111r = 0;
        jg.z1 z1Var = this.h;
        int size = z1Var.f16997g.size();
        if (size != 0) {
            this.f48113w = 0;
            this.f48111r = size + 1 + this.f48111r;
        } else {
            this.f48113w = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i7 = this.f48111r;
            this.f48114x = i7;
            this.f48111r = size2 + 1 + i7;
        } else {
            this.f48114x = -1;
        }
        int size3 = z1Var.f16995e.size();
        if (size3 != 0) {
            int i10 = this.f48111r;
            this.f48115y = i10;
            this.f48111r = size3 + 1 + i10;
        } else {
            this.f48115y = -1;
        }
        oq oqVar = this.D;
        if (oqVar.n1 && (q1Var = oqVar.f48468c) != null) {
            v4.g0 adapter = q1Var.getAdapter();
            nq nqVar = oqVar.f48473e;
            if (adapter != nqVar) {
                bi.q1 q1Var2 = oqVar.f48468c;
                q1Var2.W1 = true;
                q1Var2.X1 = 0;
                q1Var2.setAdapter(nqVar);
                oqVar.f48468c.setFastScrollVisible(false);
                oqVar.f48468c.setVerticalScrollBarEnabled(true);
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
            view = new org.telegram.ui.Cells.x3(26, this.f48107c, f6Var);
            view.setBackground(null);
        } else {
            if (oqVar.f48472d1 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f48107c, 2, 2, z9, null);
            a5Var.G = true;
            a5Var.setDelegate(new mq(this));
            view = a5Var;
        }
        return new v4.d1(view);
    }
}
