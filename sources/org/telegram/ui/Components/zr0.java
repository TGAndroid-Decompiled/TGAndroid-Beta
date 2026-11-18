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
public final class zr0 extends bk0 {
    public final Context f42937c;
    public final jg.z1 f42938e;
    public yr0 f42939f;
    public final TLRPC.Chat f42940n;
    public final gt0 f42942s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int f42941r = 0;

    public zr0(gt0 gt0Var, Context context) {
        this.f42942s = gt0Var;
        this.f42937c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.f42938e = z1Var;
        z1Var.f17727a = new xr0(this);
        this.f42940n = gt0Var.G1.g();
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59123a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final TLObject E(int i7) {
        jg.z1 z1Var = this.f42938e;
        int size = z1Var.f17732g.size();
        if (i7 >= 0 && i7 < size) {
            return (TLObject) z1Var.f17732g.get(i7);
        }
        return null;
    }

    public final void F(String str, boolean z10) {
        long j3;
        if (this.f42939f != null) {
            Utilities.f22781g.a(this.f42939f);
            this.f42939f = null;
        }
        this.d.clear();
        this.f42938e.f(null, null);
        jg.z1 z1Var = this.f42938e;
        if (org.telegram.messenger.v3.T(this.f42940n)) {
            j3 = this.f42940n.f28403id;
        } else {
            j3 = 0;
        }
        z1Var.g(null, true, false, true, false, j3, false, 2, 0);
        f();
        int i7 = 0;
        while (true) {
            bs0[] bs0VarArr = this.f42942s.f35609n0;
            if (i7 >= bs0VarArr.length) {
                break;
            }
            if (bs0VarArr[i7].F == 7 && !TextUtils.isEmpty(str)) {
                this.f42942s.f35609n0[i7].f33774w.e(true, z10);
            }
            i7++;
        }
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.q5 q5Var = Utilities.f22781g;
            yr0 yr0Var = new yr0(this, str, 0);
            this.f42939f = yr0Var;
            q5Var.d(yr0Var, 300L);
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
        int size = this.f42938e.f17732g.size();
        this.h = size;
        if (size > 0) {
            gt0 gt0Var = this.f42942s;
            if (gt0Var.Y0) {
                bs0 bs0Var = gt0Var.f35609n0[0];
                if (bs0Var.F == 7 && bs0Var.h.getAdapter() != this) {
                    gt0Var.B1(false);
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.User c22;
        SpannableStringBuilder spannableStringBuilder;
        gt0 gt0Var = this.f42942s;
        org.telegram.ui.ActionBar.h2 h2Var = gt0Var.f35642y1;
        TLObject E = E(i7);
        if (E instanceof TLRPC.ChannelParticipant) {
            c22 = h2Var.getMessagesController().c2(Long.valueOf(org.telegram.messenger.fj.B1(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            c22 = h2Var.getMessagesController().c2(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        org.telegram.messenger.o10.o(c22);
        jg.z1 z1Var = this.f42938e;
        z1Var.f17732g.size();
        String str = z1Var.f17738n;
        if (str != null) {
            String q10 = org.telegram.messenger.o10.q(c22);
            spannableStringBuilder = new SpannableStringBuilder(q10);
            int A1 = org.telegram.messenger.g0.A1(q10, str);
            if (A1 != -1) {
                spannableStringBuilder.setSpan(new i00(org.telegram.ui.ActionBar.n6.f29634q6, gt0Var.I1), A1, str.length() + A1, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = f1Var.f59123a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i7));
            b5Var.c(c22, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        gt0 gt0Var = this.f42942s;
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(this.f42937c, 9, 5, true, gt0Var.I1);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, b5Var, gt0Var.I1);
        b5Var.setDelegate(new xr0(this));
        return new v4.f1(b5Var);
    }
}
