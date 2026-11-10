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
public final class rr0 extends oj0 {
    public final Context f37725c;
    public final jg.z1 f37726e;
    public qr0 f37727f;
    public final TLRPC.Chat f37728n;
    public final ys0 f37730s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f37729r = 0;

    public rr0(ys0 ys0Var, Context context) {
        this.f37730s = ys0Var;
        this.f37725c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.f37726e = z1Var;
        z1Var.f16992a = new pr0(this);
        this.f37728n = ys0Var.F1.g();
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57052a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    public final TLObject E(int i7) {
        jg.z1 z1Var = this.f37726e;
        int size = z1Var.f16997g.size();
        if (i7 >= 0 && i7 < size) {
            return (TLObject) z1Var.f16997g.get(i7);
        }
        return null;
    }

    public final void F(String str, boolean z9) {
        long j3;
        if (this.f37727f != null) {
            Utilities.f21343g.a(this.f37727f);
            this.f37727f = null;
        }
        this.d.clear();
        this.f37726e.f(null, null);
        jg.z1 z1Var = this.f37726e;
        if (org.telegram.messenger.t3.T(this.f37728n)) {
            j3 = this.f37728n.f26960id;
        } else {
            j3 = 0;
        }
        z1Var.g(null, true, false, true, false, j3, false, 2, 0);
        f();
        int i7 = 0;
        while (true) {
            tr0[] tr0VarArr = this.f37730s.m0;
            if (i7 >= tr0VarArr.length) {
                break;
            }
            if (tr0VarArr[i7].E == 7 && !TextUtils.isEmpty(str)) {
                this.f37730s.m0[i7].f38389w.e(true, z9);
            }
            i7++;
        }
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.p5 p5Var = Utilities.f21343g;
            qr0 qr0Var = new qr0(this, str, 0);
            this.f37727f = qr0Var;
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
        int size = this.f37726e.f16997g.size();
        this.h = size;
        if (size > 0) {
            ys0 ys0Var = this.f37730s;
            if (ys0Var.X0) {
                tr0 tr0Var = ys0Var.m0[0];
                if (tr0Var.E == 7 && tr0Var.h.getAdapter() != this) {
                    ys0Var.B1(false);
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.User a22;
        SpannableStringBuilder spannableStringBuilder;
        ys0 ys0Var = this.f37730s;
        org.telegram.ui.ActionBar.f2 f2Var = ys0Var.f40719x1;
        TLObject E = E(i7);
        if (E instanceof TLRPC.ChannelParticipant) {
            a22 = f2Var.getMessagesController().a2(Long.valueOf(org.telegram.messenger.ij.B1(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            a22 = f2Var.getMessagesController().a2(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        org.telegram.messenger.t10.n(a22);
        jg.z1 z1Var = this.f37726e;
        z1Var.f16997g.size();
        String str = z1Var.f17003n;
        if (str != null) {
            String p10 = org.telegram.messenger.t10.p(a22);
            spannableStringBuilder = new SpannableStringBuilder(p10);
            int A1 = org.telegram.messenger.g0.A1(p10, str);
            if (A1 != -1) {
                spannableStringBuilder.setSpan(new xz(org.telegram.ui.ActionBar.m6.f28130q6, ys0Var.H1), A1, str.length() + A1, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = d1Var.f57052a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i7));
            a5Var.c(a22, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ys0 ys0Var = this.f37730s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f37725c, 9, 5, true, ys0Var.H1);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, a5Var, ys0Var.H1);
        a5Var.setDelegate(new pr0(this));
        return new v4.d1(a5Var);
    }
}
