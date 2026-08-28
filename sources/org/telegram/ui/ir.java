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
public final class ir extends org.telegram.ui.Components.vk0 {
    public final Context f39256c;
    public final of.v1 h;
    public fr f39259n;
    public boolean f39261s;
    public int v;
    public int f39262w;
    public int f39263x;
    public final jr f39264y;
    public ArrayList d = new ArrayList();
    public a0.h f39257e = new a0.h();
    public ArrayList f39258f = new ArrayList();
    public int f39260r = 0;

    public ir(jr jrVar, Context context) {
        this.f39264y = jrVar;
        this.f39256c = context;
        of.v1 v1Var = new of.v1(true);
        this.h = v1Var;
        v1Var.f19524a = new gr(this);
    }

    @Override
    public final void A(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i9) {
        of.v1 v1Var = this.h;
        int size = v1Var.f19529g.size();
        if (size != 0) {
            int i10 = size + 1;
            if (i10 > i9) {
                if (i9 == 0) {
                    return null;
                }
                return (TLObject) v1Var.f19529g.get(i9 - 1);
            }
            i9 -= i10;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i11 = size2 + 1;
            if (i11 > i9) {
                if (i9 == 0) {
                    return null;
                }
                return (TLObject) this.d.get(i9 - 1);
            }
            i9 -= i11;
        }
        int size3 = v1Var.f19527e.size();
        if (size3 == 0 || size3 + 1 <= i9 || i9 == 0) {
            return null;
        }
        return (TLObject) v1Var.f19527e.get(i9 - 1);
    }

    public final void F(String str) {
        boolean z10;
        long j10;
        if (this.f39259n != null) {
            Utilities.searchQueue.cancelRunnable(this.f39259n);
            this.f39259n = null;
        }
        this.d.clear();
        this.f39257e.b();
        this.f39258f.clear();
        this.h.f(null, null);
        of.v1 v1Var = this.h;
        jr jrVar = this.f39264y;
        if (jrVar.K != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(jrVar.f39595r)) {
            j10 = this.f39264y.J;
        } else {
            j10 = 0;
        }
        v1Var.g(null, z10, false, true, false, j10, false, this.f39264y.K, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f39261s = true;
            this.f39264y.f39560b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            fr frVar = new fr(this, str, 0);
            this.f39259n = frVar;
            dispatchQueue.postRunnable(frVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f39260r;
    }

    @Override
    public final int j(int i9) {
        if (i9 != this.f39263x && i9 != this.v && i9 != this.f39262w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        gh.f1 f1Var;
        this.f39260r = 0;
        of.v1 v1Var = this.h;
        int size = v1Var.f19529g.size();
        if (size != 0) {
            this.v = 0;
            this.f39260r = size + 1 + this.f39260r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i9 = this.f39260r;
            this.f39262w = i9;
            this.f39260r = size2 + 1 + i9;
        } else {
            this.f39262w = -1;
        }
        int size3 = v1Var.f19527e.size();
        if (size3 != 0) {
            int i10 = this.f39260r;
            this.f39263x = i10;
            this.f39260r = size3 + 1 + i10;
        } else {
            this.f39263x = -1;
        }
        jr jrVar = this.f39264y;
        if (jrVar.f39583k1 && (f1Var = jrVar.f39563c) != null) {
            f2.r0 adapter = f1Var.getAdapter();
            ir irVar = jrVar.f39568e;
            if (adapter != irVar) {
                gh.f1 f1Var2 = jrVar.f39563c;
                f1Var2.U1 = true;
                f1Var2.V1 = 0;
                f1Var2.setAdapter(irVar);
                jrVar.f39563c.setFastScrollVisible(false);
                jrVar.f39563c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(f2.q1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ir.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.b6 b6Var;
        jr jrVar = this.f39264y;
        if (i9 != 0) {
            b6Var = ((org.telegram.ui.ActionBar.o2) jrVar).resourceProvider;
            view = new org.telegram.ui.Cells.v3(this.f39256c, 26, b6Var);
            view.setBackground(null);
        } else {
            if (jrVar.f39559a1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f39256c, null, z10);
            b5Var.C = true;
            b5Var.setDelegate(new gr(this));
            view = b5Var;
        }
        return new f2.q1(view);
    }
}
