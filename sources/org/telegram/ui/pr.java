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
public final class pr extends org.telegram.ui.Components.xl0 {
    public final Context f36520c;
    public final gg.c2 h;
    public nr f36522n;
    public boolean f36524s;
    public int v;
    public int f36525w;
    public int f36526x;
    public final qr f36527y;
    public ArrayList d = new ArrayList();
    public a0.i e = new a0.i();
    public ArrayList f36521f = new ArrayList();
    public int f36523r = 0;

    public pr(qr qrVar, Context context) {
        this.f36527y = qrVar;
        this.f36520c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.h = c2Var;
        c2Var.f9677a = new or(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f43005a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f43008f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        gg.c2 c2Var = this.h;
        int size = c2Var.f9681g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) c2Var.f9681g.get(i10 - 1);
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
        if (this.f36522n != null) {
            Utilities.searchQueue.cancelRunnable(this.f36522n);
            this.f36522n = null;
        }
        this.d.clear();
        this.e.b();
        this.f36521f.clear();
        this.h.f(null, null);
        gg.c2 c2Var = this.h;
        qr qrVar = this.f36527y;
        if (qrVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(qrVar.f36854r)) {
            j3 = this.f36527y.N;
        } else {
            j3 = 0;
        }
        c2Var.g(null, z10, false, true, false, j3, false, this.f36527y.O, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f36524s = true;
            this.f36527y.f36820b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            nr nrVar = new nr(this, str, 0);
            this.f36522n = nrVar;
            dispatchQueue.postRunnable(nrVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f36523r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f36526x && i10 != this.v && i10 != this.f36525w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        this.f36523r = 0;
        gg.c2 c2Var = this.h;
        int size = c2Var.f9681g.size();
        if (size != 0) {
            this.v = 0;
            this.f36523r = size + 1 + this.f36523r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f36523r;
            this.f36525w = i10;
            this.f36523r = size2 + 1 + i10;
        } else {
            this.f36525w = -1;
        }
        int size3 = c2Var.e.size();
        if (size3 != 0) {
            int i11 = this.f36523r;
            this.f36526x = i11;
            this.f36523r = size3 + 1 + i11;
        } else {
            this.f36526x = -1;
        }
        qr qrVar = this.f36527y;
        if (qrVar.f36849o1 && (w0Var = qrVar.f36823c) != null) {
            s4.h0 adapter = w0Var.getAdapter();
            pr prVar = qrVar.e;
            if (adapter != prVar) {
                ai.w0 w0Var2 = qrVar.f36823c;
                w0Var2.Y1 = true;
                w0Var2.Z1 = 0;
                w0Var2.setAdapter(prVar);
                qrVar.f36823c.setFastScrollVisible(false);
                qrVar.f36823c.setVerticalScrollBarEnabled(true);
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
        org.telegram.ui.ActionBar.e6 e6Var;
        qr qrVar = this.f36527y;
        if (i10 != 0) {
            e6Var = ((org.telegram.ui.ActionBar.o2) qrVar).resourceProvider;
            view = new org.telegram.ui.Cells.v3(this.f36520c, 26, e6Var);
            view.setBackground(null);
        } else {
            if (qrVar.f36829e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f36520c, null, z10);
            b5Var.G = true;
            b5Var.setDelegate(new or(this));
            view = b5Var;
        }
        return new s4.c1(view);
    }
}
