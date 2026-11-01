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
public final class rs0 extends tk0 {
    public final Context f30080c;
    public final zf.m1 e;
    public qs0 f30081f;
    public final TLRPC.Chat f30082n;
    public final au0 f30084s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f30083r = 0;

    public rs0(au0 au0Var, Context context) {
        this.f30084s = au0Var;
        this.f30080c = context;
        zf.m1 m1Var = new zf.m1(true);
        this.e = m1Var;
        m1Var.f55593a = new ps0(this);
        this.f30082n = au0Var.F1.g();
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f47909a;
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
        int size = m1Var.f55597g.size();
        if (i10 >= 0 && i10 < size) {
            return (TLObject) m1Var.f55597g.get(i10);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j10;
        if (this.f30081f != null) {
            Utilities.f14523g.a(this.f30081f);
            this.f30081f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        zf.m1 m1Var = this.e;
        if (org.telegram.messenger.w3.T(this.f30082n)) {
            j10 = this.f30082n.f19794id;
        } else {
            j10 = 0;
        }
        m1Var.g(null, true, false, true, false, j10, false, 2, 0);
        f();
        int i10 = 0;
        while (true) {
            ts0[] ts0VarArr = this.f30084s.m0;
            if (i10 >= ts0VarArr.length) {
                break;
            }
            if (ts0VarArr[i10].E == 7 && !TextUtils.isEmpty(str)) {
                this.f30084s.m0[i10].f30722w.e(true, z10);
            }
            i10++;
        }
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.r5 r5Var = Utilities.f14523g;
            qs0 qs0Var = new qs0(this, str, 0);
            this.f30081f = qs0Var;
            r5Var.d(qs0Var, 300L);
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
        int size = this.e.f55597g.size();
        this.h = size;
        if (size > 0) {
            au0 au0Var = this.f30084s;
            if (au0Var.X0) {
                ts0 ts0Var = au0Var.m0[0];
                if (ts0Var.E == 7 && ts0Var.h.getAdapter() != this) {
                    au0Var.x1(false);
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.User Z1;
        SpannableStringBuilder spannableStringBuilder;
        au0 au0Var = this.f30084s;
        org.telegram.ui.ActionBar.k2 k2Var = au0Var.f24568x1;
        TLObject E = E(i10);
        if (E instanceof TLRPC.ChannelParticipant) {
            Z1 = k2Var.getMessagesController().Z1(Long.valueOf(org.telegram.messenger.kj.C1(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            Z1 = k2Var.getMessagesController().Z1(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        org.telegram.messenger.i20.n(Z1);
        zf.m1 m1Var = this.e;
        m1Var.f55597g.size();
        String str = m1Var.f55603n;
        if (str != null) {
            String p5 = org.telegram.messenger.i20.p(Z1);
            spannableStringBuilder = new SpannableStringBuilder(p5);
            int A1 = org.telegram.messenger.i0.A1(p5, str);
            if (A1 != -1) {
                spannableStringBuilder.setSpan(new l00(org.telegram.ui.ActionBar.t6.q6, au0Var.H1), A1, str.length() + A1, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = c1Var.f47909a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) view;
            e5Var.setTag(Integer.valueOf(i10));
            e5Var.c(Z1, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        au0 au0Var = this.f30084s;
        org.telegram.ui.Cells.e5 e5Var = new org.telegram.ui.Cells.e5(9, 5, this.f30080c, au0Var.H1, true);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, e5Var, au0Var.H1);
        e5Var.setDelegate(new ps0(this));
        return new s4.c1(e5Var);
    }
}
