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
public final class jr extends org.telegram.ui.Components.lm0 {
    public final Context f40722c;
    public final ig.a2 h;
    public hr f40724n;
    public boolean f40726s;
    public int v;
    public int f40727w;
    public int f40728x;
    public final kr f40729y;
    public ArrayList d = new ArrayList();
    public a0.h e = new a0.h();
    public ArrayList f40723f = new ArrayList();
    public int f40725r = 0;

    public jr(kr krVar, Context context) {
        this.f40729y = krVar;
        this.f40722c = context;
        ig.a2 a2Var = new ig.a2(true);
        this.h = a2Var;
        a2Var.f13988a = new ir(this);
    }

    @Override
    public final void A(s4.e1 e1Var) {
        View view = e1Var.f47738a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47741f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        ig.a2 a2Var = this.h;
        int size = a2Var.f13992g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) a2Var.f13992g.get(i10 - 1);
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
        if (this.f40724n != null) {
            Utilities.searchQueue.cancelRunnable(this.f40724n);
            this.f40724n = null;
        }
        this.d.clear();
        this.e.b();
        this.f40723f.clear();
        this.h.f(null, null);
        ig.a2 a2Var = this.h;
        kr krVar = this.f40729y;
        if (krVar.N != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(krVar.f41032n)) {
            j10 = this.f40729y.M;
        } else {
            j10 = 0;
        }
        a2Var.g(null, z10, false, true, false, j10, false, this.f40729y.N, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f40726s = true;
            this.f40729y.f41007b.e(true, true);
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            hr hrVar = new hr(this, str, 0);
            this.f40724n = hrVar;
            dispatchQueue2.postRunnable(hrVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f40725r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f40728x && i10 != this.v && i10 != this.f40727w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        bi.r1 r1Var;
        this.f40725r = 0;
        ig.a2 a2Var = this.h;
        int size = a2Var.f13992g.size();
        if (size != 0) {
            this.v = 0;
            this.f40725r = size + 1 + this.f40725r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f40725r;
            this.f40727w = i10;
            this.f40725r = size2 + 1 + i10;
        } else {
            this.f40727w = -1;
        }
        int size3 = a2Var.e.size();
        if (size3 != 0) {
            int i11 = this.f40725r;
            this.f40728x = i11;
            this.f40725r = size3 + 1 + i11;
        } else {
            this.f40728x = -1;
        }
        kr krVar = this.f40729y;
        if (krVar.f41034n1 && (r1Var = krVar.f41010c) != null) {
            s4.h0 adapter = r1Var.getAdapter();
            jr jrVar = krVar.e;
            if (adapter != jrVar) {
                bi.r1 r1Var2 = krVar.f41010c;
                r1Var2.W1 = true;
                r1Var2.X1 = 0;
                r1Var2.setAdapter(jrVar);
                krVar.f41010c.setFastScrollVisible(false);
                krVar.f41010c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.e1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jr.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.u6 u6Var;
        kr krVar = this.f40729y;
        if (i10 != 0) {
            u6Var = ((org.telegram.ui.ActionBar.r2) krVar).resourceProvider;
            view = new org.telegram.ui.Cells.z3(this.f40722c, 26, u6Var);
            view.setBackground(null);
        } else {
            if (krVar.f41014d1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.f5 f5Var = new org.telegram.ui.Cells.f5(2, 2, this.f40722c, null, z10);
            f5Var.G = true;
            f5Var.setDelegate(new ir(this));
            view = f5Var;
        }
        return new s4.e1(view);
    }
}
