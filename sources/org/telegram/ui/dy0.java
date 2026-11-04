package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class dy0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public int f44828a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f44829b;
    public TLRPC.TL_reportResultChooseOption f44830c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout f44831e;
    public final org.telegram.ui.Components.l41 f44832f;
    public final ci.t4 h;
    public by0 f44833n;
    public FrameLayout f44834r;
    public gi.d f44835s;
    public final ey0 f44836w;

    public dy0(ey0 ey0Var, Context context) {
        super(context);
        this.f44836w = ey0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44831e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.g0.f22602m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, b8.mf.e(-1, -1, 119));
        int i3 = ey0.f45092t1;
        ci.t4 t4Var = new ci.t4(context, ey0Var.J0);
        TextView textView = (TextView) t4Var.f6024c;
        this.h = t4Var;
        t4Var.f6025e = new ay0(this, 0);
        if (ey0Var.m1) {
            textView.setText(org.telegram.messenger.bd.M0(2131746244, null));
        } else if (ey0Var.f45095n1) {
            textView.setText(org.telegram.messenger.bd.M0(2131746205, null));
        } else {
            textView.setText(org.telegram.messenger.bd.M0(2131746253, null));
        }
        ((org.telegram.ui.ActionBar.w1) t4Var.d).a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, ey0Var.J0));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, t4Var, ey0Var.J0);
        addView(t4Var, b8.mf.e(-1, -2, 55));
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(context, ey0Var.f28583a, 0, true, new c5(this, 19), new ci0(this, 15), null, ey0Var.J0);
        this.f44832f = l41Var;
        l41Var.setClipToPadding(false);
        l41Var.f35593f3.k1(true);
        l41Var.setOnScrollListener(new h3(this, 28));
        frameLayout.addView(l41Var, b8.mf.c(-1.0f, -1));
    }

    public final void a(int i3) {
        boolean z10;
        this.f44828a = i3;
        if (i3 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.l41 l41Var = this.f44832f;
        if (l41Var != null) {
            l41Var.f35594g3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f44829b = null;
        this.f44830c = null;
        this.d = tL_reportResultAddComment;
        this.f44832f.f35594g3.O(false);
        if (this.f44833n != null) {
            org.telegram.messenger.g0.i3(new ay0(this, 1), 120L);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.w1 w1Var;
        try {
            ci.t4 t4Var = this.h;
            if (t4Var != null && (w1Var = (org.telegram.ui.ActionBar.w1) t4Var.d) != null) {
                int i3 = org.telegram.ui.ActionBar.k6.G6;
                ey0 ey0Var = this.f44836w;
                int i10 = ey0.f45092t1;
                w1Var.a(org.telegram.ui.ActionBar.k6.w0(i3, ey0Var.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
