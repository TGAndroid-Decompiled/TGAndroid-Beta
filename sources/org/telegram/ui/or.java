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
public final class or extends org.telegram.ui.Components.yl0 {
    public final Context f36435c;
    public final gg.c2 h;
    public mr f36437n;
    public boolean f36439s;
    public int v;
    public int f36440w;
    public int f36441x;
    public final pr f36442y;
    public ArrayList d = new ArrayList();
    public a0.i e = new a0.i();
    public ArrayList f36436f = new ArrayList();
    public int f36438r = 0;

    public or(pr prVar, Context context) {
        this.f36442y = prVar;
        this.f36435c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.h = c2Var;
        c2Var.f9683a = new nr(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f43068a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f43071f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        gg.c2 c2Var = this.h;
        int size = c2Var.f9687g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) c2Var.f9687g.get(i10 - 1);
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
        if (this.f36437n != null) {
            Utilities.searchQueue.cancelRunnable(this.f36437n);
            this.f36437n = null;
        }
        this.d.clear();
        this.e.b();
        this.f36436f.clear();
        this.h.f(null, null);
        gg.c2 c2Var = this.h;
        pr prVar = this.f36442y;
        if (prVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(prVar.f36746r)) {
            j3 = this.f36442y.N;
        } else {
            j3 = 0;
        }
        c2Var.g(null, z10, false, true, false, j3, false, this.f36442y.O, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f36439s = true;
            this.f36442y.f36712b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            mr mrVar = new mr(this, str, 0);
            this.f36437n = mrVar;
            dispatchQueue.postRunnable(mrVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f36438r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f36441x && i10 != this.v && i10 != this.f36440w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        this.f36438r = 0;
        gg.c2 c2Var = this.h;
        int size = c2Var.f9687g.size();
        if (size != 0) {
            this.v = 0;
            this.f36438r = size + 1 + this.f36438r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f36438r;
            this.f36440w = i10;
            this.f36438r = size2 + 1 + i10;
        } else {
            this.f36440w = -1;
        }
        int size3 = c2Var.e.size();
        if (size3 != 0) {
            int i11 = this.f36438r;
            this.f36441x = i11;
            this.f36438r = size3 + 1 + i11;
        } else {
            this.f36441x = -1;
        }
        pr prVar = this.f36442y;
        if (prVar.f36741o1 && (w0Var = prVar.f36715c) != null) {
            s4.h0 adapter = w0Var.getAdapter();
            or orVar = prVar.e;
            if (adapter != orVar) {
                ai.w0 w0Var2 = prVar.f36715c;
                w0Var2.Y1 = true;
                w0Var2.Z1 = 0;
                w0Var2.setAdapter(orVar);
                prVar.f36715c.setFastScrollVisible(false);
                prVar.f36715c.setVerticalScrollBarEnabled(true);
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
        pr prVar = this.f36442y;
        if (i10 != 0) {
            d6Var = ((org.telegram.ui.ActionBar.m2) prVar).resourceProvider;
            view = new org.telegram.ui.Cells.v3(this.f36435c, 26, d6Var);
            view.setBackground(null);
        } else {
            if (prVar.f36721e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f36435c, null, z10);
            b5Var.G = true;
            b5Var.setDelegate(new nr(this));
            view = b5Var;
        }
        return new s4.c1(view);
    }
}
