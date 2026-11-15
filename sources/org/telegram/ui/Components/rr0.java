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
public final class rr0 extends tj0 {
    public final Context f39048c;
    public final jg.z1 f39049e;
    public qr0 f39050f;
    public final TLRPC.Chat f39051n;
    public final ys0 f39053s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f39052r = 0;

    public rr0(ys0 ys0Var, Context context) {
        this.f39053s = ys0Var;
        this.f39048c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.f39049e = z1Var;
        z1Var.f17344a = new pr0(this);
        this.f39051n = ys0Var.G1.g();
    }

    @Override
    public final void A(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    public final TLObject E(int i7) {
        jg.z1 z1Var = this.f39049e;
        int size = z1Var.f17349g.size();
        if (i7 >= 0 && i7 < size) {
            return (TLObject) z1Var.f17349g.get(i7);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j3;
        if (this.f39050f != null) {
            Utilities.f22418g.a(this.f39050f);
            this.f39050f = null;
        }
        this.d.clear();
        this.f39049e.f(null, null);
        jg.z1 z1Var = this.f39049e;
        if (org.telegram.messenger.t3.T(this.f39051n)) {
            j3 = this.f39051n.f28051id;
        } else {
            j3 = 0;
        }
        z1Var.g(null, true, false, true, false, j3, false, 2, 0);
        f();
        int i7 = 0;
        while (true) {
            tr0[] tr0VarArr = this.f39053s.f42117n0;
            if (i7 >= tr0VarArr.length) {
                break;
            }
            if (tr0VarArr[i7].F == 7 && !TextUtils.isEmpty(str)) {
                this.f39053s.f42117n0[i7].f39798w.e(true, z10);
            }
            i7++;
        }
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.p5 p5Var = Utilities.f22418g;
            qr0 qr0Var = new qr0(this, str, 0);
            this.f39050f = qr0Var;
            p5Var.d(qr0Var, 300L);
        }
    }

    @Override
    public final int b() {
        return this.h;
    }

    @Override
    public final int d(int i7) {
        return 22;
    }

    @Override
    public final void f() {
        int size = this.f39049e.f17349g.size();
        this.h = size;
        if (size > 0) {
            ys0 ys0Var = this.f39053s;
            if (ys0Var.Y0) {
                tr0 tr0Var = ys0Var.f42117n0[0];
                if (tr0Var.F == 7 && tr0Var.h.getAdapter() != this) {
                    ys0Var.B1(false);
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        TLRPC.User a22;
        SpannableStringBuilder spannableStringBuilder;
        ys0 ys0Var = this.f39053s;
        org.telegram.ui.ActionBar.e2 e2Var = ys0Var.f42150y1;
        TLObject E = E(i7);
        if (E instanceof TLRPC.ChannelParticipant) {
            a22 = e2Var.getMessagesController().a2(Long.valueOf(org.telegram.messenger.gj.B1(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            a22 = e2Var.getMessagesController().a2(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        org.telegram.messenger.q10.n(a22);
        jg.z1 z1Var = this.f39049e;
        z1Var.f17349g.size();
        String str = z1Var.f17355n;
        if (str != null) {
            String p10 = org.telegram.messenger.q10.p(a22);
            spannableStringBuilder = new SpannableStringBuilder(p10);
            int A1 = org.telegram.messenger.g0.A1(p10, str);
            if (A1 != -1) {
                spannableStringBuilder.setSpan(new b00(org.telegram.ui.ActionBar.j6.f29089q6, ys0Var.I1), A1, str.length() + A1, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = e1Var.f58535a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i7));
            a5Var.c(a22, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ys0 ys0Var = this.f39053s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f39048c, 9, 5, true, ys0Var.I1);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, a5Var, ys0Var.I1);
        a5Var.setDelegate(new pr0(this));
        return new v4.e1(a5Var);
    }
}
