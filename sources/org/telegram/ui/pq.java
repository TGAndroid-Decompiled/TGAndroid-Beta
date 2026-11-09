package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class pq extends org.telegram.ui.Components.pj0 {
    public final qq D;
    public final Context f48778c;
    public final jg.z1 h;
    public nq f48781n;
    public boolean f48783s;
    public int f48784w;
    public int f48785x;
    public int f48786y;
    public ArrayList d = new ArrayList();
    public a0.h f48779e = new a0.h();
    public ArrayList f48780f = new ArrayList();
    public int f48782r = 0;

    public pq(qq qqVar, Context context) {
        this.D = qqVar;
        this.f48778c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.h = z1Var;
        z1Var.f16992a = new oq(this);
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57056a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57060f != 1) {
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
        if (this.f48781n != null) {
            Utilities.f21338g.a(this.f48781n);
            this.f48781n = null;
        }
        this.d.clear();
        this.f48779e.b();
        this.f48780f.clear();
        this.h.f(null, null);
        jg.z1 z1Var = this.h;
        qq qqVar = this.D;
        if (qqVar.N != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (org.telegram.messenger.t3.T(qqVar.f49144n)) {
            j3 = this.D.M;
        } else {
            j3 = 0;
        }
        z1Var.g(null, z9, false, true, false, j3, false, this.D.N, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            this.f48783s = true;
            this.D.f49118b.e(true, true);
            org.telegram.messenger.p5 p5Var = Utilities.f21338g;
            nq nqVar = new nq(this, str, 0);
            this.f48781n = nqVar;
            p5Var.d(nqVar, 300L);
        }
    }

    @Override
    public final int b() {
        return this.f48782r;
    }

    @Override
    public final int d(int i7) {
        if (i7 != this.f48786y && i7 != this.f48784w && i7 != this.f48785x) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        bi.q1 q1Var;
        this.f48782r = 0;
        jg.z1 z1Var = this.h;
        int size = z1Var.f16997g.size();
        if (size != 0) {
            this.f48784w = 0;
            this.f48782r = size + 1 + this.f48782r;
        } else {
            this.f48784w = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i7 = this.f48782r;
            this.f48785x = i7;
            this.f48782r = size2 + 1 + i7;
        } else {
            this.f48785x = -1;
        }
        int size3 = z1Var.f16995e.size();
        if (size3 != 0) {
            int i10 = this.f48782r;
            this.f48786y = i10;
            this.f48782r = size3 + 1 + i10;
        } else {
            this.f48786y = -1;
        }
        qq qqVar = this.D;
        if (qqVar.n1 && (q1Var = qqVar.f49121c) != null) {
            v4.g0 adapter = q1Var.getAdapter();
            pq pqVar = qqVar.f49126e;
            if (adapter != pqVar) {
                bi.q1 q1Var2 = qqVar.f49121c;
                q1Var2.W1 = true;
                q1Var2.X1 = 0;
                q1Var2.setAdapter(pqVar);
                qqVar.f49121c.setFastScrollVisible(false);
                qqVar.f49121c.setVerticalScrollBarEnabled(true);
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pq.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        boolean z9;
        View view;
        org.telegram.ui.ActionBar.g6 g6Var;
        qq qqVar = this.D;
        if (i7 != 0) {
            g6Var = ((org.telegram.ui.ActionBar.f2) qqVar).resourceProvider;
            view = new org.telegram.ui.Cells.x3(26, this.f48778c, g6Var);
            view.setBackground(null);
        } else {
            if (qqVar.f49125d1 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f48778c, 2, 2, z9, null);
            a5Var.G = true;
            a5Var.setDelegate(new oq(this));
            view = a5Var;
        }
        return new v4.d1(view);
    }
}
