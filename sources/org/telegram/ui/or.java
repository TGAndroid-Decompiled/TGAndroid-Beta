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
public final class or extends org.telegram.ui.Components.rl0 {
    public final Context f36960c;
    public final tf.k1 h;
    public mr f36962n;
    public boolean f36964s;
    public int v;
    public int f36965w;
    public int f36966x;
    public final pr f36967y;
    public ArrayList d = new ArrayList();
    public a0.h e = new a0.h();
    public ArrayList f36961f = new ArrayList();
    public int f36963r = 0;

    public or(pr prVar, Context context) {
        this.f36967y = prVar;
        this.f36960c = context;
        tf.k1 k1Var = new tf.k1(true);
        this.h = k1Var;
        k1Var.f44769a = new nr(this);
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5785a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        tf.k1 k1Var = this.h;
        int size = k1Var.f44773g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) k1Var.f44773g.get(i10 - 1);
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
        int size3 = k1Var.e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) k1Var.e.get(i10 - 1);
    }

    public final void F(String str) {
        boolean z4;
        long j10;
        if (this.f36962n != null) {
            Utilities.searchQueue.cancelRunnable(this.f36962n);
            this.f36962n = null;
        }
        this.d.clear();
        this.e.b();
        this.f36961f.clear();
        this.h.f(null, null);
        tf.k1 k1Var = this.h;
        pr prVar = this.f36967y;
        if (prVar.L != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (ChatObject.isChannel(prVar.f37481r)) {
            j10 = this.f36967y.K;
        } else {
            j10 = 0;
        }
        k1Var.g(null, z4, false, true, false, j10, false, this.f36967y.L, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f36964s = true;
            this.f36967y.f37447b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            mr mrVar = new mr(this, str, 0);
            this.f36962n = mrVar;
            dispatchQueue.postRunnable(mrVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f36963r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f36966x && i10 != this.v && i10 != this.f36965w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        lh.e1 e1Var;
        this.f36963r = 0;
        tf.k1 k1Var = this.h;
        int size = k1Var.f44773g.size();
        if (size != 0) {
            this.v = 0;
            this.f36963r = size + 1 + this.f36963r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f36963r;
            this.f36965w = i10;
            this.f36963r = size2 + 1 + i10;
        } else {
            this.f36965w = -1;
        }
        int size3 = k1Var.e.size();
        if (size3 != 0) {
            int i11 = this.f36963r;
            this.f36966x = i11;
            this.f36963r = size3 + 1 + i11;
        } else {
            this.f36966x = -1;
        }
        pr prVar = this.f36967y;
        if (prVar.l1 && (e1Var = prVar.f37450c) != null) {
            f2.o0 adapter = e1Var.getAdapter();
            or orVar = prVar.e;
            if (adapter != orVar) {
                lh.e1 e1Var2 = prVar.f37450c;
                e1Var2.V1 = true;
                e1Var2.W1 = 0;
                e1Var2.setAdapter(orVar);
                prVar.f37450c.setFastScrollVisible(false);
                prVar.f37450c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(f2.l1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.or.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        boolean z4;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        pr prVar = this.f36967y;
        if (i10 != 0) {
            f6Var = ((org.telegram.ui.ActionBar.p2) prVar).resourceProvider;
            view = new org.telegram.ui.Cells.u3(this.f36960c, 26, f6Var);
            view.setBackground(null);
        } else {
            if (prVar.f37449b1 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f36960c, null, z4);
            b5Var.D = true;
            b5Var.setDelegate(new nr(this));
            view = b5Var;
        }
        return new f2.l1(view);
    }
}
