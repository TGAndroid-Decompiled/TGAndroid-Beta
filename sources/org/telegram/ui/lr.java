package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class lr extends org.telegram.ui.Components.mm0 {
    public final Context f41237c;
    public final ig.a2 h;
    public jr f41239n;
    public boolean f41241s;
    public int v;
    public int f41242w;
    public int f41243x;
    public final mr f41244y;
    public ArrayList d = new ArrayList();
    public a0.h e = new a0.h();
    public ArrayList f41238f = new ArrayList();
    public int f41240r = 0;

    public lr(mr mrVar, Context context) {
        this.f41244y = mrVar;
        this.f41237c = context;
        ig.a2 a2Var = new ig.a2(true);
        this.h = a2Var;
        a2Var.f13987a = new kr(this);
    }

    @Override
    public final void A(s4.e1 e1Var) {
        View view = e1Var.f47773a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47776f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        ig.a2 a2Var = this.h;
        int size = a2Var.f13991g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) a2Var.f13991g.get(i10 - 1);
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
        int size3 = a2Var.e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) a2Var.e.get(i10 - 1);
    }

    public final void F(String str) {
        boolean z10;
        long j10;
        if (this.f41239n != null) {
            Utilities.searchQueue.cancelRunnable(this.f41239n);
            this.f41239n = null;
        }
        this.d.clear();
        this.e.b();
        this.f41238f.clear();
        this.h.f(null, null);
        ig.a2 a2Var = this.h;
        mr mrVar = this.f41244y;
        if (mrVar.N != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(mrVar.f41530n)) {
            j10 = this.f41244y.M;
        } else {
            j10 = 0;
        }
        a2Var.g(null, z10, false, true, false, j10, false, this.f41244y.N, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f41241s = true;
            this.f41244y.f41505b.e(true, true);
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            jr jrVar = new jr(this, str, 0);
            this.f41239n = jrVar;
            dispatchQueue2.postRunnable(jrVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f41240r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f41243x && i10 != this.v && i10 != this.f41242w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        bi.r1 r1Var;
        this.f41240r = 0;
        ig.a2 a2Var = this.h;
        int size = a2Var.f13991g.size();
        if (size != 0) {
            this.v = 0;
            this.f41240r = size + 1 + this.f41240r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f41240r;
            this.f41242w = i10;
            this.f41240r = size2 + 1 + i10;
        } else {
            this.f41242w = -1;
        }
        int size3 = a2Var.e.size();
        if (size3 != 0) {
            int i11 = this.f41240r;
            this.f41243x = i11;
            this.f41240r = size3 + 1 + i11;
        } else {
            this.f41243x = -1;
        }
        mr mrVar = this.f41244y;
        if (mrVar.f41532n1 && (r1Var = mrVar.f41508c) != null) {
            s4.h0 adapter = r1Var.getAdapter();
            lr lrVar = mrVar.e;
            if (adapter != lrVar) {
                bi.r1 r1Var2 = mrVar.f41508c;
                r1Var2.W1 = true;
                r1Var2.X1 = 0;
                r1Var2.setAdapter(lrVar);
                mrVar.f41508c.setFastScrollVisible(false);
                mrVar.f41508c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.e1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lr.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.u6 u6Var;
        mr mrVar = this.f41244y;
        if (i10 != 0) {
            u6Var = ((org.telegram.ui.ActionBar.r2) mrVar).resourceProvider;
            view = new org.telegram.ui.Cells.z3(this.f41237c, 26, u6Var);
            view.setBackground(null);
        } else {
            if (mrVar.f41512d1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.f5 f5Var = new org.telegram.ui.Cells.f5(2, 2, this.f41237c, null, z10);
            f5Var.G = true;
            f5Var.setDelegate(new kr(this));
            view = f5Var;
        }
        return new s4.e1(view);
    }
}
