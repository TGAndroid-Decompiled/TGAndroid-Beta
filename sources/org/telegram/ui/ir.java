package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class ir extends org.telegram.ui.Components.il0 {
    public final Context f39321c;
    public final rf.k1 h;
    public gr f39324n;
    public boolean f39326s;
    public int v;
    public int f39327w;
    public int f39328x;
    public final jr f39329y;
    public ArrayList d = new ArrayList();
    public a0.h f39322e = new a0.h();
    public ArrayList f39323f = new ArrayList();
    public int f39325r = 0;

    public ir(jr jrVar, Context context) {
        this.f39329y = jrVar;
        this.f39321c = context;
        rf.k1 k1Var = new rf.k1(true);
        this.h = k1Var;
        k1Var.f47277a = new hr(this);
    }

    @Override
    public final void A(f2.n1 n1Var) {
        View view = n1Var.f6432a;
        if (view instanceof org.telegram.ui.Cells.z4) {
            ((org.telegram.ui.Cells.z4) view).a();
        }
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        rf.k1 k1Var = this.h;
        int size = k1Var.f47282g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) k1Var.f47282g.get(i10 - 1);
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
        int size3 = k1Var.f47280e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) k1Var.f47280e.get(i10 - 1);
    }

    public final void F(String str) {
        boolean z10;
        long j10;
        if (this.f39324n != null) {
            Utilities.searchQueue.cancelRunnable(this.f39324n);
            this.f39324n = null;
        }
        this.d.clear();
        this.f39322e.b();
        this.f39323f.clear();
        this.h.f(null, null);
        rf.k1 k1Var = this.h;
        jr jrVar = this.f39329y;
        if (jrVar.K != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(jrVar.f39656r)) {
            j10 = this.f39329y.J;
        } else {
            j10 = 0;
        }
        k1Var.g(null, z10, false, true, false, j10, false, this.f39329y.K, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f39326s = true;
            this.f39329y.f39621b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            gr grVar = new gr(this, str, 0);
            this.f39324n = grVar;
            dispatchQueue.postRunnable(grVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f39325r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f39328x && i10 != this.v && i10 != this.f39327w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        jh.e1 e1Var;
        this.f39325r = 0;
        rf.k1 k1Var = this.h;
        int size = k1Var.f47282g.size();
        if (size != 0) {
            this.v = 0;
            this.f39325r = size + 1 + this.f39325r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f39325r;
            this.f39327w = i10;
            this.f39325r = size2 + 1 + i10;
        } else {
            this.f39327w = -1;
        }
        int size3 = k1Var.f47280e.size();
        if (size3 != 0) {
            int i11 = this.f39325r;
            this.f39328x = i11;
            this.f39325r = size3 + 1 + i11;
        } else {
            this.f39328x = -1;
        }
        jr jrVar = this.f39329y;
        if (jrVar.f39644k1 && (e1Var = jrVar.f39624c) != null) {
            f2.p0 adapter = e1Var.getAdapter();
            ir irVar = jrVar.f39629e;
            if (adapter != irVar) {
                jh.e1 e1Var2 = jrVar.f39624c;
                e1Var2.U1 = true;
                e1Var2.V1 = 0;
                e1Var2.setAdapter(irVar);
                jrVar.f39624c.setFastScrollVisible(false);
                jrVar.f39624c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(f2.n1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ir.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.c6 c6Var;
        jr jrVar = this.f39329y;
        if (i10 != 0) {
            c6Var = ((org.telegram.ui.ActionBar.o2) jrVar).resourceProvider;
            view = new org.telegram.ui.Cells.s3(this.f39321c, 26, c6Var);
            view.setBackground(null);
        } else {
            if (jrVar.f39620a1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.z4 z4Var = new org.telegram.ui.Cells.z4(2, 2, this.f39321c, null, z10);
            z4Var.C = true;
            z4Var.setDelegate(new hr(this));
            view = z4Var;
        }
        return new f2.n1(view);
    }
}
