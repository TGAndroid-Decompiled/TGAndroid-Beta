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
public final class pr extends org.telegram.ui.Components.ll0 {
    public final Context f36166c;
    public final gg.c2 h;
    public nr f36168n;
    public boolean f36170s;
    public int v;
    public int f36171w;
    public int f36172x;
    public final qr f36173y;
    public ArrayList d = new ArrayList();
    public a0.i e = new a0.i();
    public ArrayList f36167f = new ArrayList();
    public int f36169r = 0;

    public pr(qr qrVar, Context context) {
        this.f36173y = qrVar;
        this.f36166c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.h = c2Var;
        c2Var.f9672a = new or(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42627a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42630f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        gg.c2 c2Var = this.h;
        int size = c2Var.f9676g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) c2Var.f9676g.get(i10 - 1);
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
        if (this.f36168n != null) {
            Utilities.searchQueue.cancelRunnable(this.f36168n);
            this.f36168n = null;
        }
        this.d.clear();
        this.e.b();
        this.f36167f.clear();
        this.h.f(null, null);
        gg.c2 c2Var = this.h;
        qr qrVar = this.f36173y;
        if (qrVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(qrVar.f36582r)) {
            j3 = this.f36173y.N;
        } else {
            j3 = 0;
        }
        c2Var.g(null, z10, false, true, false, j3, false, this.f36173y.O, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f36170s = true;
            this.f36173y.f36548b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            nr nrVar = new nr(this, str, 0);
            this.f36168n = nrVar;
            dispatchQueue.postRunnable(nrVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f36169r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f36172x && i10 != this.v && i10 != this.f36171w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        this.f36169r = 0;
        gg.c2 c2Var = this.h;
        int size = c2Var.f9676g.size();
        if (size != 0) {
            this.v = 0;
            this.f36169r = size + 1 + this.f36169r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f36169r;
            this.f36171w = i10;
            this.f36169r = size2 + 1 + i10;
        } else {
            this.f36171w = -1;
        }
        int size3 = c2Var.e.size();
        if (size3 != 0) {
            int i11 = this.f36169r;
            this.f36172x = i11;
            this.f36169r = size3 + 1 + i11;
        } else {
            this.f36172x = -1;
        }
        qr qrVar = this.f36173y;
        if (qrVar.f36577o1 && (w0Var = qrVar.f36551c) != null) {
            s4.h0 adapter = w0Var.getAdapter();
            pr prVar = qrVar.e;
            if (adapter != prVar) {
                ai.w0 w0Var2 = qrVar.f36551c;
                w0Var2.Y1 = true;
                w0Var2.Z1 = 0;
                w0Var2.setAdapter(prVar);
                qrVar.f36551c.setFastScrollVisible(false);
                qrVar.f36551c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pr.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.d6 d6Var;
        qr qrVar = this.f36173y;
        if (i10 != 0) {
            d6Var = ((org.telegram.ui.ActionBar.n2) qrVar).resourceProvider;
            view = new org.telegram.ui.Cells.v3(this.f36166c, 26, d6Var);
            view.setBackground(null);
        } else {
            if (qrVar.f36557e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f36166c, null, z10);
            b5Var.G = true;
            b5Var.setDelegate(new or(this));
            view = b5Var;
        }
        return new s4.c1(view);
    }
}
