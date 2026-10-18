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
public final class ir extends org.telegram.ui.Components.hm0 {
    public final Context f37974c;
    public final hg.a2 h;
    public gr f37976n;
    public boolean f37978s;
    public int v;
    public int f37979w;
    public int f37980x;
    public final jr f37981y;
    public ArrayList d = new ArrayList();
    public a0.h e = new a0.h();
    public ArrayList f37975f = new ArrayList();
    public int f37977r = 0;

    public ir(jr jrVar, Context context) {
        this.f37981y = jrVar;
        this.f37974c = context;
        hg.a2 a2Var = new hg.a2(true);
        this.h = a2Var;
        a2Var.f11795a = new hr(this);
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f45958a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45961f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        hg.a2 a2Var = this.h;
        int size = a2Var.f11799g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) a2Var.f11799g.get(i10 - 1);
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
        if (this.f37976n != null) {
            Utilities.searchQueue.cancelRunnable(this.f37976n);
            this.f37976n = null;
        }
        this.d.clear();
        this.e.b();
        this.f37975f.clear();
        this.h.f(null, null);
        hg.a2 a2Var = this.h;
        jr jrVar = this.f37981y;
        if (jrVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(jrVar.f38310r)) {
            j10 = this.f37981y.N;
        } else {
            j10 = 0;
        }
        a2Var.g(null, z10, false, true, false, j10, false, this.f37981y.O, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f37978s = true;
            this.f37981y.f38276b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            gr grVar = new gr(this, str, 0);
            this.f37976n = grVar;
            dispatchQueue.postRunnable(grVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f37977r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f37980x && i10 != this.v && i10 != this.f37979w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ai.u1 u1Var;
        this.f37977r = 0;
        hg.a2 a2Var = this.h;
        int size = a2Var.f11799g.size();
        if (size != 0) {
            this.v = 0;
            this.f37977r = size + 1 + this.f37977r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f37977r;
            this.f37979w = i10;
            this.f37977r = size2 + 1 + i10;
        } else {
            this.f37979w = -1;
        }
        int size3 = a2Var.e.size();
        if (size3 != 0) {
            int i11 = this.f37977r;
            this.f37980x = i11;
            this.f37977r = size3 + 1 + i11;
        } else {
            this.f37980x = -1;
        }
        jr jrVar = this.f37981y;
        if (jrVar.f38305o1 && (u1Var = jrVar.f38279c) != null) {
            s4.g0 adapter = u1Var.getAdapter();
            ir irVar = jrVar.e;
            if (adapter != irVar) {
                ai.u1 u1Var2 = jrVar.f38279c;
                u1Var2.W1 = true;
                u1Var2.X1 = 0;
                u1Var2.setAdapter(irVar);
                jrVar.f38279c.setFastScrollVisible(false);
                jrVar.f38279c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.b1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ir.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.d6 d6Var;
        jr jrVar = this.f37981y;
        if (i10 != 0) {
            d6Var = ((org.telegram.ui.ActionBar.n2) jrVar).resourceProvider;
            view = new org.telegram.ui.Cells.u3(this.f37974c, 26, d6Var);
            view.setBackground(null);
        } else {
            if (jrVar.f38285e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(2, 2, this.f37974c, null, z10);
            a5Var.G = true;
            a5Var.setDelegate(new hr(this));
            view = a5Var;
        }
        return new s4.b1(view);
    }
}
