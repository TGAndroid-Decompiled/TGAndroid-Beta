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
public final class qr0 extends oj0 {
    public final Context f37385c;
    public final jg.z1 f37386e;
    public pr0 f37387f;
    public final TLRPC.Chat f37388n;
    public final xs0 f37390s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f37389r = 0;

    public qr0(xs0 xs0Var, Context context) {
        this.f37390s = xs0Var;
        this.f37385c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.f37386e = z1Var;
        z1Var.f16989a = new or0(this);
        this.f37388n = xs0Var.F1.g();
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f56952a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    public final TLObject E(int i7) {
        jg.z1 z1Var = this.f37386e;
        int size = z1Var.f16994g.size();
        if (i7 >= 0 && i7 < size) {
            return (TLObject) z1Var.f16994g.get(i7);
        }
        return null;
    }

    public final void F(String str, boolean z9) {
        long j3;
        if (this.f37387f != null) {
            Utilities.f21335g.a(this.f37387f);
            this.f37387f = null;
        }
        this.d.clear();
        this.f37386e.f(null, null);
        jg.z1 z1Var = this.f37386e;
        if (org.telegram.messenger.t3.T(this.f37388n)) {
            j3 = this.f37388n.f26952id;
        } else {
            j3 = 0;
        }
        z1Var.g(null, true, false, true, false, j3, false, 2, 0);
        f();
        int i7 = 0;
        while (true) {
            sr0[] sr0VarArr = this.f37390s.m0;
            if (i7 >= sr0VarArr.length) {
                break;
            }
            if (sr0VarArr[i7].E == 7 && !TextUtils.isEmpty(str)) {
                this.f37390s.m0[i7].f38109w.e(true, z9);
            }
            i7++;
        }
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.p5 p5Var = Utilities.f21335g;
            pr0 pr0Var = new pr0(this, str, 0);
            this.f37387f = pr0Var;
            p5Var.d(pr0Var, 300L);
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
        int size = this.f37386e.f16994g.size();
        this.h = size;
        if (size > 0) {
            xs0 xs0Var = this.f37390s;
            if (xs0Var.X0) {
                sr0 sr0Var = xs0Var.m0[0];
                if (sr0Var.E == 7 && sr0Var.h.getAdapter() != this) {
                    xs0Var.z1(false);
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.User a22;
        SpannableStringBuilder spannableStringBuilder;
        xs0 xs0Var = this.f37390s;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.f40424x1;
        TLObject E = E(i7);
        if (E instanceof TLRPC.ChannelParticipant) {
            a22 = f2Var.getMessagesController().a2(Long.valueOf(org.telegram.messenger.ij.C1(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            a22 = f2Var.getMessagesController().a2(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        org.telegram.messenger.t10.n(a22);
        jg.z1 z1Var = this.f37386e;
        z1Var.f16994g.size();
        String str = z1Var.f17000n;
        if (str != null) {
            String p10 = org.telegram.messenger.t10.p(a22);
            spannableStringBuilder = new SpannableStringBuilder(p10);
            int A1 = org.telegram.messenger.g0.A1(p10, str);
            if (A1 != -1) {
                spannableStringBuilder.setSpan(new xz(org.telegram.ui.ActionBar.k6.f28088q6, xs0Var.H1), A1, str.length() + A1, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = d1Var.f56952a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i7));
            a5Var.c(a22, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        xs0 xs0Var = this.f37390s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f37385c, 9, 5, true, xs0Var.H1);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, a5Var, xs0Var.H1);
        a5Var.setDelegate(new or0(this));
        return new v4.d1(a5Var);
    }
}
