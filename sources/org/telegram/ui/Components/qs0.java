package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qs0 extends sk0 {
    public final Context f29734c;
    public final zf.m1 e;
    public ps0 f29735f;
    public final TLRPC.Chat f29736n;
    public final zt0 f29738s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f29737r = 0;

    public qs0(zt0 zt0Var, Context context) {
        this.f29738s = zt0Var;
        this.f29734c = context;
        zf.m1 m1Var = new zf.m1(true);
        this.e = m1Var;
        m1Var.f55575a = new os0(this);
        this.f29736n = zt0Var.F1.g();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f47898a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final TLObject E(int i10) {
        zf.m1 m1Var = this.e;
        int size = m1Var.f55579g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) m1Var.f55579g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j10;
        if (this.f29735f != null) {
            Utilities.f14522g.a(this.f29735f);
            this.f29735f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        zf.m1 m1Var = this.e;
        if (org.telegram.messenger.w3.T(this.f29736n)) {
            j10 = this.f29736n.f19793id;
        } else {
            j10 = 0;
        }
        m1Var.g(null, true, false, true, false, j10, false, 2, 0);
        f();
        int i10 = 0;
        while (true) {
            ss0[] ss0VarArr = this.f29738s.m0;
            if (i10 >= ss0VarArr.length) {
                break;
            }
            if (ss0VarArr[i10].E == 7 && !TextUtils.isEmpty(str)) {
                this.f29738s.m0[i10].f30355w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.r5 r5Var = Utilities.f14522g;
            ps0 ps0Var = new ps0(this, str, 0);
            this.f29735f = ps0Var;
            r5Var.d(ps0Var, 300L);
        }
    }

    @Override
    public final int b() {
        return this.h;
    }

    @Override
    public final int d(int i10) {
        return 22;
    }

    @Override
    public final void f() {
        int size = this.e.f55579g.size();
        this.h = size;
        if (size > 0) {
            zt0 zt0Var = this.f29738s;
            if (zt0Var.X0) {
                ss0 ss0Var = zt0Var.m0[0];
                if (ss0Var.E == 7 && ss0Var.h.getAdapter() != this) {
                    zt0Var.w1(false);
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.User Z1;
        SpannableStringBuilder spannableStringBuilder;
        zt0 zt0Var = this.f29738s;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.f33240x1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            Z1 = k2Var.getMessagesController().Z1(Long.valueOf(org.telegram.messenger.jj.C1(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            Z1 = k2Var.getMessagesController().Z1(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        org.telegram.messenger.h20.n(Z1);
        zf.m1 m1Var = this.e;
        m1Var.f55579g.size();
        String str = m1Var.f55585n;
        if (str != null) {
            String p5 = org.telegram.messenger.h20.p(Z1);
            spannableStringBuilder = new SpannableStringBuilder(p5);
            int A1 = org.telegram.messenger.i0.A1(p5, str);
            if (A1 != -1) {
                spannableStringBuilder.setSpan(new l00(org.telegram.ui.ActionBar.t6.q6, zt0Var.H1), A1, str.length() + A1, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = c1Var.f47898a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) view;
            e5Var.setTag(Integer.valueOf(i10));
            e5Var.c(Z1, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        zt0 zt0Var = this.f29738s;
        org.telegram.ui.Cells.e5 e5Var = new org.telegram.ui.Cells.e5(9, 5, this.f29734c, zt0Var.H1, true);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, e5Var, zt0Var.H1);
        e5Var.setDelegate(new os0(this));
        return new s4.c1(e5Var);
    }
}
