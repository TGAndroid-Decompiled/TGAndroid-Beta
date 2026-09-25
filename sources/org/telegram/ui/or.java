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
public final class or extends org.telegram.ui.Components.vl0 {
    public final Context f36331c;
    public final gg.c2 h;
    public mr f36333n;
    public boolean f36335s;
    public int v;
    public int f36336w;
    public int f36337x;
    public final pr f36338y;
    public ArrayList d = new ArrayList();
    public a0.i e = new a0.i();
    public ArrayList f36332f = new ArrayList();
    public int f36334r = 0;

    public or(pr prVar, Context context) {
        this.f36338y = prVar;
        this.f36331c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.h = c2Var;
        c2Var.f9671a = new nr(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42961a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42964f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        gg.c2 c2Var = this.h;
        int size = c2Var.f9675g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) c2Var.f9675g.get(i10 - 1);
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
        int size3 = c2Var.e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) c2Var.e.get(i10 - 1);
    }

    public final void F(String str) {
        boolean z10;
        long j3;
        if (this.f36333n != null) {
            Utilities.searchQueue.cancelRunnable(this.f36333n);
            this.f36333n = null;
        }
        this.d.clear();
        this.e.b();
        this.f36332f.clear();
        this.h.f(null, null);
        gg.c2 c2Var = this.h;
        pr prVar = this.f36338y;
        if (prVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(prVar.f36647r)) {
            j3 = this.f36338y.N;
        } else {
            j3 = 0;
        }
        c2Var.g(null, z10, false, true, false, j3, false, this.f36338y.O, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f36335s = true;
            this.f36338y.f36613b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            mr mrVar = new mr(this, str, 0);
            this.f36333n = mrVar;
            dispatchQueue.postRunnable(mrVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f36334r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f36337x && i10 != this.v && i10 != this.f36336w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        this.f36334r = 0;
        gg.c2 c2Var = this.h;
        int size = c2Var.f9675g.size();
        if (size != 0) {
            this.v = 0;
            this.f36334r = size + 1 + this.f36334r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f36334r;
            this.f36336w = i10;
            this.f36334r = size2 + 1 + i10;
        } else {
            this.f36336w = -1;
        }
        int size3 = c2Var.e.size();
        if (size3 != 0) {
            int i11 = this.f36334r;
            this.f36337x = i11;
            this.f36334r = size3 + 1 + i11;
        } else {
            this.f36337x = -1;
        }
        pr prVar = this.f36338y;
        if (prVar.f36642o1 && (w0Var = prVar.f36616c) != null) {
            s4.h0 adapter = w0Var.getAdapter();
            or orVar = prVar.e;
            if (adapter != orVar) {
                ai.w0 w0Var2 = prVar.f36616c;
                w0Var2.Y1 = true;
                w0Var2.Z1 = 0;
                w0Var2.setAdapter(orVar);
                prVar.f36616c.setFastScrollVisible(false);
                prVar.f36616c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.or.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.d6 d6Var;
        pr prVar = this.f36338y;
        if (i10 != 0) {
            d6Var = ((org.telegram.ui.ActionBar.m2) prVar).resourceProvider;
            view = new org.telegram.ui.Cells.v3(this.f36331c, 26, d6Var);
            view.setBackground(null);
        } else {
            if (prVar.f36622e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f36331c, null, z10);
            b5Var.G = true;
            b5Var.setDelegate(new nr(this));
            view = b5Var;
        }
        return new s4.c1(view);
    }
}
