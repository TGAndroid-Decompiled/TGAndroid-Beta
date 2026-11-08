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
    public final Context f37410c;
    public final jg.z1 f37411e;
    public pr0 f37412f;
    public final TLRPC.Chat f37413n;
    public final xs0 f37415s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f37414r = 0;

    public qr0(xs0 xs0Var, Context context) {
        this.f37415s = xs0Var;
        this.f37410c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.f37411e = z1Var;
        z1Var.f16992a = new or0(this);
        this.f37413n = xs0Var.F1.g();
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57044a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    public final TLObject E(int i7) {
        jg.z1 z1Var = this.f37411e;
        int size = z1Var.f16997g.size();
        if (i7 >= 0 && i7 < size) {
            return (TLObject) z1Var.f16997g.get(i7);
        }
        return null;
    }

    public final void F(String str, boolean z9) {
        long j3;
        if (this.f37412f != null) {
            Utilities.f21338g.a(this.f37412f);
            this.f37412f = null;
        }
        this.d.clear();
        this.f37411e.f(null, null);
        jg.z1 z1Var = this.f37411e;
        if (org.telegram.messenger.t3.T(this.f37413n)) {
            j3 = this.f37413n.f26956id;
        } else {
            j3 = 0;
        }
        z1Var.g(null, true, false, true, false, j3, false, 2, 0);
        f();
        int i7 = 0;
        while (true) {
            sr0[] sr0VarArr = this.f37415s.m0;
            if (i7 >= sr0VarArr.length) {
                break;
            }
            if (sr0VarArr[i7].E == 7 && !TextUtils.isEmpty(str)) {
                this.f37415s.m0[i7].f38129w.e(true, z9);
            }
            i7++;
        }
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.p5 p5Var = Utilities.f21338g;
            pr0 pr0Var = new pr0(this, str, 0);
            this.f37412f = pr0Var;
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
        int size = this.f37411e.f16997g.size();
        this.h = size;
        if (size > 0) {
            xs0 xs0Var = this.f37415s;
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
        xs0 xs0Var = this.f37415s;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.f40461x1;
        TLObject E = E(i7);
        if (E instanceof TLRPC.ChannelParticipant) {
            a22 = f2Var.getMessagesController().a2(Long.valueOf(org.telegram.messenger.ij.C1(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            a22 = f2Var.getMessagesController().a2(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        org.telegram.messenger.t10.n(a22);
        jg.z1 z1Var = this.f37411e;
        z1Var.f16997g.size();
        String str = z1Var.f17003n;
        if (str != null) {
            String p10 = org.telegram.messenger.t10.p(a22);
            spannableStringBuilder = new SpannableStringBuilder(p10);
            int A1 = org.telegram.messenger.g0.A1(p10, str);
            if (A1 != -1) {
                spannableStringBuilder.setSpan(new yz(org.telegram.ui.ActionBar.k6.f28092q6, xs0Var.H1), A1, str.length() + A1, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = d1Var.f57044a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            a5Var.setTag(Integer.valueOf(i7));
            a5Var.c(a22, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        xs0 xs0Var = this.f37415s;
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f37410c, 9, 5, true, xs0Var.H1);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, a5Var, xs0Var.H1);
        a5Var.setDelegate(new or0(this));
        return new v4.d1(a5Var);
    }
}
