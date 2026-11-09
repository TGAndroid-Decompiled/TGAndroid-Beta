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
public final class sr0 extends pj0 {
    public final Context f38141c;
    public final jg.z1 f38142e;
    public rr0 f38143f;
    public final TLRPC.Chat f38144n;
    public final zs0 f38146s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f38145r = 0;

    public sr0(zs0 zs0Var, Context context) {
        this.f38146s = zs0Var;
        this.f38141c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.f38142e = z1Var;
        z1Var.f16992a = new qr0(this);
        this.f38144n = zs0Var.F1.g();
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57056a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    public final TLObject E(int i7) {
        jg.z1 z1Var = this.f38142e;
        int size = z1Var.f16997g.size();
        if (i7 >= 0 && i7 < size) {
            return (TLObject) z1Var.f16997g.get(i7);
        }
        return null;
    }

    public final void F(String str, boolean z9) {
        long j3;
        if (this.f38143f != null) {
            Utilities.f21338g.a(this.f38143f);
            this.f38143f = null;
        }
        this.d.clear();
        this.f38142e.f(null, null);
        jg.z1 z1Var = this.f38142e;
        if (org.telegram.messenger.t3.T(this.f38144n)) {
            j3 = this.f38144n.f26956id;
        } else {
            j3 = 0;
        }
        z1Var.g(null, true, false, true, false, j3, false, 2, 0);
        f();
        int i7 = 0;
        while (true) {
            ur0[] ur0VarArr = this.f38146s.m0;
            if (i7 >= ur0VarArr.length) {
                break;
            }
            if (ur0VarArr[i7].E == 7 && !TextUtils.isEmpty(str)) {
                this.f38146s.m0[i7].f38795w.e(true, z9);
            }
            i7++;
        }
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.p5 p5Var = Utilities.f21338g;
            rr0 rr0Var = new rr0(this, str, 0);
            this.f38143f = rr0Var;
            p5Var.d(rr0Var, 300L);
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
        int size = this.f38142e.f16997g.size();
        this.h = size;
        if (size > 0) {
            zs0 zs0Var = this.f38146s;
            if (zs0Var.X0) {
                ur0 ur0Var = zs0Var.m0[0];
                if (ur0Var.E == 7 && ur0Var.h.getAdapter() != this) {
                    zs0Var.B1(false);
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.User a22;
        SpannableStringBuilder spannableStringBuilder;
        zs0 zs0Var = this.f38146s;
        org.telegram.ui.ActionBar.f2 f2Var = zs0Var.f41127x1;
        TLObject E = E(i7);
        if (E instanceof TLRPC.ChannelParticipant) {
            a22 = f2Var.getMessagesController().a2(Long.valueOf(org.telegram.messenger.ij.B1(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            a22 = f2Var.getMessagesController().a2(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        org.telegram.messenger.t10.n(a22);
        jg.z1 z1Var = this.f38142e;
        z1Var.f16997g.size();
        String str = z1Var.f17003n;
        if (str != null) {
            String p10 = org.telegram.messenger.t10.p(a22);
            spannableStringBuilder = new SpannableStringBuilder(p10);
            int A1 = org.telegram.messenger.g0.A1(p10, str);
            if (A1 != -1) {
                spannableStringBuilder.setSpan(new yz(org.telegram.ui.ActionBar.l6.f28105q6, zs0Var.H1), A1, str.length() + A1, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = d1Var.f57056a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i7));
            a5Var.c(a22, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        zs0 zs0Var = this.f38146s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f38141c, 9, 5, true, zs0Var.H1);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, a5Var, zs0Var.H1);
        a5Var.setDelegate(new qr0(this));
        return new v4.d1(a5Var);
    }
}
