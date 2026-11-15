package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class pq extends org.telegram.ui.Components.tj0 {
    public final qq E;
    public final Context f50335c;
    public final jg.z1 h;
    public nq f50338n;
    public boolean f50340s;
    public int f50341w;
    public int f50342x;
    public int f50343y;
    public ArrayList d = new ArrayList();
    public a0.h f50336e = new a0.h();
    public ArrayList f50337f = new ArrayList();
    public int f50339r = 0;

    public pq(qq qqVar, Context context) {
        this.E = qqVar;
        this.f50335c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.h = z1Var;
        z1Var.f17344a = new oq(this);
    }

    @Override
    public final void A(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i7) {
        jg.z1 z1Var = this.h;
        int size = z1Var.f17349g.size();
        if (size != 0) {
            int i10 = size + 1;
            if (i10 > i7) {
                if (i7 == 0) {
                    return null;
                }
                return (TLObject) z1Var.f17349g.get(i7 - 1);
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
        int size3 = z1Var.f17347e.size();
        if (size3 == 0 || size3 + 1 <= i7 || i7 == 0) {
            return null;
        }
        return (TLObject) z1Var.f17347e.get(i7 - 1);
    }

    public final void F(String str) {
        boolean z10;
        long j3;
        if (this.f50338n != null) {
            Utilities.f22418g.a(this.f50338n);
            this.f50338n = null;
        }
        this.d.clear();
        this.f50336e.b();
        this.f50337f.clear();
        this.h.f(null, null);
        jg.z1 z1Var = this.h;
        qq qqVar = this.E;
        if (qqVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (org.telegram.messenger.t3.T(qqVar.f50738n)) {
            j3 = this.E.N;
        } else {
            j3 = 0;
        }
        z1Var.g(null, z10, false, true, false, j3, false, this.E.O, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            this.f50340s = true;
            this.E.f50712b.e(true, true);
            org.telegram.messenger.p5 p5Var = Utilities.f22418g;
            nq nqVar = new nq(this, str, 0);
            this.f50338n = nqVar;
            p5Var.d(nqVar, 300L);
        }
    }

    @Override
    public final int b() {
        return this.f50339r;
    }

    @Override
    public final int d(int i7) {
        if (i7 != this.f50343y && i7 != this.f50341w && i7 != this.f50342x) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        di.c1 c1Var;
        this.f50339r = 0;
        jg.z1 z1Var = this.h;
        int size = z1Var.f17349g.size();
        if (size != 0) {
            this.f50341w = 0;
            this.f50339r = size + 1 + this.f50339r;
        } else {
            this.f50341w = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i7 = this.f50339r;
            this.f50342x = i7;
            this.f50339r = size2 + 1 + i7;
        } else {
            this.f50342x = -1;
        }
        int size3 = z1Var.f17347e.size();
        if (size3 != 0) {
            int i10 = this.f50339r;
            this.f50343y = i10;
            this.f50339r = size3 + 1 + i10;
        } else {
            this.f50343y = -1;
        }
        qq qqVar = this.E;
        if (qqVar.f50741o1 && (c1Var = qqVar.f50715c) != null) {
            v4.h0 adapter = c1Var.getAdapter();
            pq pqVar = qqVar.f50720e;
            if (adapter != pqVar) {
                di.c1 c1Var2 = qqVar.f50715c;
                c1Var2.X1 = true;
                c1Var2.Y1 = 0;
                c1Var2.setAdapter(pqVar);
                qqVar.f50715c.setFastScrollVisible(false);
                qqVar.f50715c.setVerticalScrollBarEnabled(true);
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.e1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pq.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.e6 e6Var;
        qq qqVar = this.E;
        if (i7 != 0) {
            e6Var = ((org.telegram.ui.ActionBar.e2) qqVar).resourceProvider;
            view = new org.telegram.ui.Cells.x3(26, this.f50335c, e6Var);
            view.setBackground(null);
        } else {
            if (qqVar.f50722e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f50335c, 2, 2, z10, null);
            a5Var.H = true;
            a5Var.setDelegate(new oq(this));
            view = a5Var;
        }
        return new v4.e1(view);
    }
}
