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
    public final Context f33806c;
    public final jg.z1 f33807e;
    public zr0 f33808f;
    public final TLRPC.Chat f33809n;
    public final it0 f33811s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f33810r = 0;

    public bs0(it0 it0Var, Context context) {
        this.f33811s = it0Var;
        this.f33806c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.f33807e = z1Var;
        z1Var.f17823a = new yr0(this);
        this.f33809n = it0Var.G1.g();
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59245a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final TLObject E(int i7) {
        jg.z1 z1Var = this.f33807e;
        int size = z1Var.f17828g.size();
        if (i7 >= 0 && i7 < size) {
            return (TLObject) z1Var.f17828g.get(i7);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j3;
        if (this.f33808f != null) {
            Utilities.f22879g.a(this.f33808f);
            this.f33808f = null;
        }
        this.d.clear();
        this.f33807e.f(null, null);
        jg.z1 z1Var = this.f33807e;
        if (org.telegram.messenger.v3.T(this.f33809n)) {
            j3 = this.f33809n.f28492id;
        } else {
            j3 = 0;
        }
        z1Var.g(null, true, false, true, false, j3, false, 2, 0);
        f();
        int i7 = 0;
        while (true) {
            ds0[] ds0VarArr = this.f33811s.f36133n0;
            if (i7 >= ds0VarArr.length) {
                break;
            }
            if (ds0VarArr[i7].F == 7 && !TextUtils.isEmpty(str)) {
                this.f33811s.f36133n0[i7].f34449w.e(true, z10);
            }
            i7++;
        }
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.q5 q5Var = Utilities.f22879g;
            zr0 zr0Var = new zr0(this, str, 0);
            this.f33808f = zr0Var;
            q5Var.d(zr0Var, 300L);
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
        int size = this.f33807e.f17828g.size();
        this.h = size;
        if (size > 0) {
            it0 it0Var = this.f33811s;
            if (it0Var.Y0) {
                ds0 ds0Var = it0Var.f36133n0[0];
                if (ds0Var.F == 7 && ds0Var.h.getAdapter() != this) {
                    it0Var.B1(false);
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.User c22;
        SpannableStringBuilder spannableStringBuilder;
        it0 it0Var = this.f33811s;
        org.telegram.ui.ActionBar.g2 g2Var = it0Var.f36166y1;
        TLObject E = E(i7);
        if (E instanceof TLRPC.ChannelParticipant) {
            c22 = g2Var.getMessagesController().c2(Long.valueOf(org.telegram.messenger.fj.B1(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            c22 = g2Var.getMessagesController().c2(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        org.telegram.messenger.n10.o(c22);
        jg.z1 z1Var = this.f33807e;
        z1Var.f17828g.size();
        String str = z1Var.f17834n;
        if (str != null) {
            String q10 = org.telegram.messenger.n10.q(c22);
            spannableStringBuilder = new SpannableStringBuilder(q10);
            int A1 = org.telegram.messenger.g0.A1(q10, str);
            if (A1 != -1) {
                spannableStringBuilder.setSpan(new i00(org.telegram.ui.ActionBar.n6.f29691q6, it0Var.I1), A1, str.length() + A1, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = f1Var.f59245a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i7));
            b5Var.c(c22, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        it0 it0Var = this.f33811s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(this.f33806c, 9, 5, true, it0Var.I1);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, b5Var, it0Var.I1);
        b5Var.setDelegate(new yr0(this));
        return new v4.f1(b5Var);
    }
}
