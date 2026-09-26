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
    public final Context f36330c;
    public final gg.c2 h;
    public mr f36332n;
    public boolean f36334s;
    public int v;
    public int f36335w;
    public int f36336x;
    public final pr f36337y;
    public ArrayList d = new ArrayList();
    public a0.i e = new a0.i();
    public ArrayList f36331f = new ArrayList();
    public int f36333r = 0;

    public or(pr prVar, Context context) {
        this.f36337y = prVar;
        this.f36330c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.h = c2Var;
        c2Var.f9671a = new nr(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42960a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42963f != 1) {
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
        if (this.f36332n != null) {
            Utilities.searchQueue.cancelRunnable(this.f36332n);
            this.f36332n = null;
        }
        this.d.clear();
        this.e.b();
        this.f36331f.clear();
        this.h.f(null, null);
        gg.c2 c2Var = this.h;
        pr prVar = this.f36337y;
        if (prVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(prVar.f36646r)) {
            j3 = this.f36337y.N;
        } else {
            j3 = 0;
        }
        c2Var.g(null, z10, false, true, false, j3, false, this.f36337y.O, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f36334s = true;
            this.f36337y.f36612b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            mr mrVar = new mr(this, str, 0);
            this.f36332n = mrVar;
            dispatchQueue.postRunnable(mrVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f36333r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f36336x && i10 != this.v && i10 != this.f36335w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        this.f36333r = 0;
        gg.c2 c2Var = this.h;
        int size = c2Var.f9675g.size();
        if (size != 0) {
            this.v = 0;
            this.f36333r = size + 1 + this.f36333r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f36333r;
            this.f36335w = i10;
            this.f36333r = size2 + 1 + i10;
        } else {
            this.f36335w = -1;
        }
        int size3 = c2Var.e.size();
        if (size3 != 0) {
            int i11 = this.f36333r;
            this.f36336x = i11;
            this.f36333r = size3 + 1 + i11;
        } else {
            this.f36336x = -1;
        }
        pr prVar = this.f36337y;
        if (prVar.f36641o1 && (w0Var = prVar.f36615c) != null) {
            s4.h0 adapter = w0Var.getAdapter();
            or orVar = prVar.e;
            if (adapter != orVar) {
                ai.w0 w0Var2 = prVar.f36615c;
                w0Var2.Y1 = true;
                w0Var2.Z1 = 0;
                w0Var2.setAdapter(orVar);
                prVar.f36615c.setFastScrollVisible(false);
                prVar.f36615c.setVerticalScrollBarEnabled(true);
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
        pr prVar = this.f36337y;
        if (i10 != 0) {
            d6Var = ((org.telegram.ui.ActionBar.m2) prVar).resourceProvider;
            view = new org.telegram.ui.Cells.v3(this.f36330c, 26, d6Var);
            view.setBackground(null);
        } else {
            if (prVar.f36621e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f36330c, null, z10);
            b5Var.G = true;
            b5Var.setDelegate(new nr(this));
            view = b5Var;
        }
        return new s4.c1(view);
    }
}
