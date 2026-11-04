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
public final class pr0 extends sj0 {
    public final Context f37226c;
    public final kg.v1 f37227e;
    public or0 f37228f;
    public final TLRPC.Chat f37229n;
    public final ws0 f37231s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f37230r = 0;

    public pr0(ws0 ws0Var, Context context) {
        this.f37231s = ws0Var;
        this.f37226c = context;
        kg.v1 v1Var = new kg.v1(true);
        this.f37227e = v1Var;
        v1Var.f17206a = new nr0(this);
        this.f37229n = ws0Var.G1.g();
    }

    @Override
    public final void A(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    public final TLObject E(int i3) {
        kg.v1 v1Var = this.f37227e;
        int size = v1Var.f17211g.size();
        if (i3 >= 0 && i3 < size) {
            return (TLObject) v1Var.f17211g.get(i3);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j10;
        if (this.f37228f != null) {
            Utilities.f21389g.a(this.f37228f);
            this.f37228f = null;
        }
        this.d.clear();
        this.f37227e.f(null, null);
        kg.v1 v1Var = this.f37227e;
        if (org.telegram.messenger.t3.T(this.f37229n)) {
            j10 = this.f37229n.f27001id;
        } else {
            j10 = 0;
        }
        v1Var.g(null, true, false, true, false, j10, false, 2, 0);
        f();
        int i3 = 0;
        while (true) {
            rr0[] rr0VarArr = this.f37231s.f40108n0;
            if (i3 >= rr0VarArr.length) {
                break;
            }
            if (rr0VarArr[i3].F == 7 && !TextUtils.isEmpty(str)) {
                this.f37231s.f40108n0[i3].f37790w.e(true, z10);
            }
            i3++;
        }
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.p5 p5Var = Utilities.f21389g;
            or0 or0Var = new or0(this, str, 0);
            this.f37228f = or0Var;
            p5Var.e(or0Var, 300L);
        }
    }

    @Override
    public final int b() {
        return this.h;
    }

    @Override
    public final int d(int i3) {
        return 22;
    }

    @Override
    public final void f() {
        int size = this.f37227e.f17211g.size();
        this.h = size;
        if (size > 0) {
            ws0 ws0Var = this.f37231s;
            if (ws0Var.Y0) {
                rr0 rr0Var = ws0Var.f40108n0[0];
                if (rr0Var.F == 7 && rr0Var.h.getAdapter() != this) {
                    ws0Var.z1(false);
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.User a22;
        SpannableStringBuilder spannableStringBuilder;
        ws0 ws0Var = this.f37231s;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.f40142y1;
        TLObject E = E(i3);
        if (E instanceof TLRPC.ChannelParticipant) {
            a22 = d2Var.getMessagesController().a2(Long.valueOf(org.telegram.messenger.zi.C1(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            a22 = d2Var.getMessagesController().a2(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        org.telegram.messenger.l10.n(a22);
        kg.v1 v1Var = this.f37227e;
        v1Var.f17211g.size();
        String str = v1Var.f17217n;
        if (str != null) {
            String p10 = org.telegram.messenger.l10.p(a22);
            spannableStringBuilder = new SpannableStringBuilder(p10);
            int A1 = org.telegram.messenger.g0.A1(p10, str);
            if (A1 != -1) {
                spannableStringBuilder.setSpan(new tz(org.telegram.ui.ActionBar.k6.f28121q6, ws0Var.I1), A1, str.length() + A1, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = d1Var.f55540a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i3));
            a5Var.c(a22, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ws0 ws0Var = this.f37231s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f37226c, 9, 5, true, ws0Var.I1);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, a5Var, ws0Var.I1);
        a5Var.setDelegate(new nr0(this));
        return new u4.d1(a5Var);
    }
}
