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
public final class pr extends org.telegram.ui.Components.sl0 {
    public final Context f40140c;
    public final uf.k1 h;
    public nr f40143n;
    public boolean f40145s;
    public int v;
    public int f40146w;
    public int f40147x;
    public final qr f40148y;
    public ArrayList d = new ArrayList();
    public a0.h f40141e = new a0.h();
    public ArrayList f40142f = new ArrayList();
    public int f40144r = 0;

    public pr(qr qrVar, Context context) {
        this.f40148y = qrVar;
        this.f40140c = context;
        uf.k1 k1Var = new uf.k1(true);
        this.h = k1Var;
        k1Var.f48618a = new or(this);
    }

    @Override
    public final void A(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        uf.k1 k1Var = this.h;
        int size = k1Var.f48623g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) k1Var.f48623g.get(i10 - 1);
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
        int size3 = k1Var.f48621e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) k1Var.f48621e.get(i10 - 1);
    }

    public final void F(String str) {
        boolean z4;
        long j10;
        if (this.f40143n != null) {
            Utilities.searchQueue.cancelRunnable(this.f40143n);
            this.f40143n = null;
        }
        this.d.clear();
        this.f40141e.b();
        this.f40142f.clear();
        this.h.f(null, null);
        uf.k1 k1Var = this.h;
        qr qrVar = this.f40148y;
        if (qrVar.L != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (ChatObject.isChannel(qrVar.f40637r)) {
            j10 = this.f40148y.K;
        } else {
            j10 = 0;
        }
        k1Var.g(null, z4, false, true, false, j10, false, this.f40148y.L, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f40145s = true;
            this.f40148y.f40602b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            nr nrVar = new nr(this, str, 0);
            this.f40143n = nrVar;
            dispatchQueue.postRunnable(nrVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f40144r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f40147x && i10 != this.v && i10 != this.f40146w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        mh.d1 d1Var;
        this.f40144r = 0;
        uf.k1 k1Var = this.h;
        int size = k1Var.f48623g.size();
        if (size != 0) {
            this.v = 0;
            this.f40144r = size + 1 + this.f40144r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f40144r;
            this.f40146w = i10;
            this.f40144r = size2 + 1 + i10;
        } else {
            this.f40146w = -1;
        }
        int size3 = k1Var.f48621e.size();
        if (size3 != 0) {
            int i11 = this.f40144r;
            this.f40147x = i11;
            this.f40144r = size3 + 1 + i11;
        } else {
            this.f40147x = -1;
        }
        qr qrVar = this.f40148y;
        if (qrVar.l1 && (d1Var = qrVar.f40605c) != null) {
            f2.p0 adapter = d1Var.getAdapter();
            pr prVar = qrVar.f40610e;
            if (adapter != prVar) {
                mh.d1 d1Var2 = qrVar.f40605c;
                d1Var2.V1 = true;
                d1Var2.W1 = 0;
                d1Var2.setAdapter(prVar);
                qrVar.f40605c.setFastScrollVisible(false);
                qrVar.f40605c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(f2.m1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pr.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        boolean z4;
        View view;
        org.telegram.ui.ActionBar.g6 g6Var;
        qr qrVar = this.f40148y;
        if (i10 != 0) {
            g6Var = ((org.telegram.ui.ActionBar.p2) qrVar).resourceProvider;
            view = new org.telegram.ui.Cells.u3(this.f40140c, 26, g6Var);
            view.setBackground(null);
        } else {
            if (qrVar.f40604b1 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f40140c, null, z4);
            b5Var.D = true;
            b5Var.setDelegate(new or(this));
            view = b5Var;
        }
        return new f2.m1(view);
    }
}
