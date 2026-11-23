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
public final class bs0 extends dk0 {
    public final Context f33871c;
    public final jg.z1 f33872e;
    public as0 f33873f;
    public final TLRPC.Chat f33874n;
    public final jt0 f33876s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f33875r = 0;

    public bs0(jt0 jt0Var, Context context) {
        this.f33876s = jt0Var;
        this.f33871c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.f33872e = z1Var;
        z1Var.f17721a = new zr0(this);
        this.f33874n = jt0Var.G1.g();
    }

    @Override
    public final void A(v4.e1 e1Var) {
        View view = e1Var.f59111a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    public final TLObject E(int i7) {
        jg.z1 z1Var = this.f33872e;
        int size = z1Var.f17726g.size();
        if (i7 >= 0 && i7 < size) {
            return (TLObject) z1Var.f17726g.get(i7);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j3;
        if (this.f33873f != null) {
            Utilities.f22776g.a(this.f33873f);
            this.f33873f = null;
        }
        this.d.clear();
        this.f33872e.f(null, null);
        jg.z1 z1Var = this.f33872e;
        if (org.telegram.messenger.v3.T(this.f33874n)) {
            j3 = this.f33874n.f28398id;
        } else {
            j3 = 0;
        }
        z1Var.g(null, true, false, true, false, j3, false, 2, 0);
        f();
        int i7 = 0;
        while (true) {
            ds0[] ds0VarArr = this.f33876s.f36605n0;
            if (i7 >= ds0VarArr.length) {
                break;
            }
            if (ds0VarArr[i7].F == 7 && !TextUtils.isEmpty(str)) {
                this.f33876s.f36605n0[i7].f34543w.e(true, z10);
            }
            i7++;
        }
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.q5 q5Var = Utilities.f22776g;
            as0 as0Var = new as0(this, str, 0);
            this.f33873f = as0Var;
            q5Var.d(as0Var, 300L);
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
        int size = this.f33872e.f17726g.size();
        this.h = size;
        if (size > 0) {
            jt0 jt0Var = this.f33876s;
            if (jt0Var.Y0) {
                ds0 ds0Var = jt0Var.f36605n0[0];
                if (ds0Var.F == 7 && ds0Var.h.getAdapter() != this) {
                    jt0Var.B1(false);
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        TLRPC.User c22;
        SpannableStringBuilder spannableStringBuilder;
        jt0 jt0Var = this.f33876s;
        org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36638y1;
        TLObject E = E(i7);
        if (E instanceof TLRPC.ChannelParticipant) {
            c22 = g2Var.getMessagesController().c2(Long.valueOf(org.telegram.messenger.gj.B1(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            c22 = g2Var.getMessagesController().c2(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        org.telegram.messenger.p10.o(c22);
        jg.z1 z1Var = this.f33872e;
        z1Var.f17726g.size();
        String str = z1Var.f17732n;
        if (str != null) {
            String q10 = org.telegram.messenger.p10.q(c22);
            spannableStringBuilder = new SpannableStringBuilder(q10);
            int A1 = org.telegram.messenger.g0.A1(q10, str);
            if (A1 != -1) {
                spannableStringBuilder.setSpan(new k00(org.telegram.ui.ActionBar.m6.f29587q6, jt0Var.I1), A1, str.length() + A1, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = e1Var.f59111a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i7));
            b5Var.c(c22, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        jt0 jt0Var = this.f33876s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(this.f33871c, 9, 5, true, jt0Var.I1);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, b5Var, jt0Var.I1);
        b5Var.setDelegate(new zr0(this));
        return new v4.e1(b5Var);
    }
}
