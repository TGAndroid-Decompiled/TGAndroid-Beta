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
public final class ir extends org.telegram.ui.Components.km0 {
    public final Context f38367c;
    public final hg.a2 h;
    public gr f38369n;
    public boolean f38371s;
    public int v;
    public int f38372w;
    public int f38373x;
    public final jr f38374y;
    public ArrayList d = new ArrayList();
    public a0.h e = new a0.h();
    public ArrayList f38368f = new ArrayList();
    public int f38370r = 0;

    public ir(jr jrVar, Context context) {
        this.f38374y = jrVar;
        this.f38367c = context;
        hg.a2 a2Var = new hg.a2(true);
        this.h = a2Var;
        a2Var.f11819a = new hr(this);
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f46342a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46345f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        hg.a2 a2Var = this.h;
        int size = a2Var.f11823g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) a2Var.f11823g.get(i10 - 1);
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
        if (this.f38369n != null) {
            Utilities.searchQueue.cancelRunnable(this.f38369n);
            this.f38369n = null;
        }
        this.d.clear();
        this.e.b();
        this.f38368f.clear();
        this.h.f(null, null);
        hg.a2 a2Var = this.h;
        jr jrVar = this.f38374y;
        if (jrVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(jrVar.f38653r)) {
            j10 = this.f38374y.N;
        } else {
            j10 = 0;
        }
        a2Var.g(null, z10, false, true, false, j10, false, this.f38374y.O, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f38371s = true;
            this.f38374y.f38619b.e(true, true);
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            gr grVar = new gr(this, str, 0);
            this.f38369n = grVar;
            dispatchQueue2.postRunnable(grVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f38370r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f38373x && i10 != this.v && i10 != this.f38372w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ai.u1 u1Var;
        this.f38370r = 0;
        hg.a2 a2Var = this.h;
        int size = a2Var.f11823g.size();
        if (size != 0) {
            this.v = 0;
            this.f38370r = size + 1 + this.f38370r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f38370r;
            this.f38372w = i10;
            this.f38370r = size2 + 1 + i10;
        } else {
            this.f38372w = -1;
        }
        int size3 = a2Var.e.size();
        if (size3 != 0) {
            int i11 = this.f38370r;
            this.f38373x = i11;
            this.f38370r = size3 + 1 + i11;
        } else {
            this.f38373x = -1;
        }
        jr jrVar = this.f38374y;
        if (jrVar.f38648o1 && (u1Var = jrVar.f38622c) != null) {
            s4.g0 adapter = u1Var.getAdapter();
            ir irVar = jrVar.e;
            if (adapter != irVar) {
                ai.u1 u1Var2 = jrVar.f38622c;
                u1Var2.W1 = true;
                u1Var2.X1 = 0;
                u1Var2.setAdapter(irVar);
                jrVar.f38622c.setFastScrollVisible(false);
                jrVar.f38622c.setVerticalScrollBarEnabled(true);
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
        org.telegram.ui.ActionBar.g6 g6Var;
        jr jrVar = this.f38374y;
        if (i10 != 0) {
            g6Var = ((org.telegram.ui.ActionBar.o2) jrVar).resourceProvider;
            view = new org.telegram.ui.Cells.u3(this.f38367c, 26, g6Var);
            view.setBackground(null);
        } else {
            if (jrVar.f38628e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(2, 2, this.f38367c, null, z10);
            a5Var.G = true;
            a5Var.setDelegate(new hr(this));
            view = a5Var;
        }
        return new s4.b1(view);
    }
}
