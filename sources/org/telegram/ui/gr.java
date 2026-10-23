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
public final class gr extends org.telegram.ui.Components.im0 {
    public final Context f37399c;
    public final hg.a2 h;
    public er f37401n;
    public boolean f37403s;
    public int v;
    public int f37404w;
    public int f37405x;
    public final hr f37406y;
    public ArrayList d = new ArrayList();
    public a0.h e = new a0.h();
    public ArrayList f37400f = new ArrayList();
    public int f37402r = 0;

    public gr(hr hrVar, Context context) {
        this.f37406y = hrVar;
        this.f37399c = context;
        hg.a2 a2Var = new hg.a2(true);
        this.h = a2Var;
        a2Var.f11792a = new fr(this);
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f45921a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45924f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        hg.a2 a2Var = this.h;
        int size = a2Var.f11796g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) a2Var.f11796g.get(i10 - 1);
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
        if (this.f37401n != null) {
            Utilities.searchQueue.cancelRunnable(this.f37401n);
            this.f37401n = null;
        }
        this.d.clear();
        this.e.b();
        this.f37400f.clear();
        this.h.f(null, null);
        hg.a2 a2Var = this.h;
        hr hrVar = this.f37406y;
        if (hrVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(hrVar.f37757r)) {
            j10 = this.f37406y.N;
        } else {
            j10 = 0;
        }
        a2Var.g(null, z10, false, true, false, j10, false, this.f37406y.O, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f37403s = true;
            this.f37406y.f37723b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            er erVar = new er(this, str, 0);
            this.f37401n = erVar;
            dispatchQueue.postRunnable(erVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f37402r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f37405x && i10 != this.v && i10 != this.f37404w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ai.u1 u1Var;
        this.f37402r = 0;
        hg.a2 a2Var = this.h;
        int size = a2Var.f11796g.size();
        if (size != 0) {
            this.v = 0;
            this.f37402r = size + 1 + this.f37402r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f37402r;
            this.f37404w = i10;
            this.f37402r = size2 + 1 + i10;
        } else {
            this.f37404w = -1;
        }
        int size3 = a2Var.e.size();
        if (size3 != 0) {
            int i11 = this.f37402r;
            this.f37405x = i11;
            this.f37402r = size3 + 1 + i11;
        } else {
            this.f37405x = -1;
        }
        hr hrVar = this.f37406y;
        if (hrVar.f37752o1 && (u1Var = hrVar.f37726c) != null) {
            s4.g0 adapter = u1Var.getAdapter();
            gr grVar = hrVar.e;
            if (adapter != grVar) {
                ai.u1 u1Var2 = hrVar.f37726c;
                u1Var2.W1 = true;
                u1Var2.X1 = 0;
                u1Var2.setAdapter(grVar);
                hrVar.f37726c.setFastScrollVisible(false);
                hrVar.f37726c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.b1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gr.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.d6 d6Var;
        hr hrVar = this.f37406y;
        if (i10 != 0) {
            d6Var = ((org.telegram.ui.ActionBar.n2) hrVar).resourceProvider;
            view = new org.telegram.ui.Cells.u3(this.f37399c, 26, d6Var);
            view.setBackground(null);
        } else {
            if (hrVar.f37732e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(2, 2, this.f37399c, null, z10);
            a5Var.G = true;
            a5Var.setDelegate(new fr(this));
            view = a5Var;
        }
        return new s4.b1(view);
    }
}
