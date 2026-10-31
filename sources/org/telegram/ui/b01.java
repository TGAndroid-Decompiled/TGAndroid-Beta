package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class b01 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public int f35919a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f35920b;
    public TLRPC.TL_reportResultChooseOption f35921c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.u51 f35922f;
    public final jg.b1 h;
    public zz0 f35923n;
    public FrameLayout f35924r;
    public vh.d f35925s;
    public final c01 f35926w;

    public b01(c01 c01Var, Context context) {
        super(context);
        this.f35926w = c01Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.i0.f16020m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.b6.e(-1, -1, 119));
        int i10 = c01.f36350s1;
        jg.b1 b1Var = new jg.b1(context, c01Var.I0);
        TextView textView = (TextView) b1Var.f9896c;
        this.h = b1Var;
        b1Var.e = new yz0(this, 0);
        if (c01Var.l1) {
            textView.setText(org.telegram.messenger.cd.L0(2131746251, null));
        } else if (c01Var.f36354m1) {
            textView.setText(org.telegram.messenger.cd.L0(2131746212, null));
        } else {
            textView.setText(org.telegram.messenger.cd.L0(2131746260, null));
        }
        ((org.telegram.ui.ActionBar.c2) b1Var.d).a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, c01Var.I0));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21001h5, b1Var, c01Var.I0);
        addView(b1Var, w7.b6.e(-1, -2, 55));
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(context, c01Var.f21583a, 0, true, new z4(this, 19), new tj0(this, 15), null, c01Var.I0);
        this.f35922f = u51Var;
        u51Var.setClipToPadding(false);
        u51Var.f30818e3.k1(true);
        u51Var.setOnScrollListener(new h3(this, 27));
        frameLayout.addView(u51Var, w7.b6.c(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f35919a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.u51 u51Var = this.f35922f;
        if (u51Var != null) {
            u51Var.f30819f3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f35920b = null;
        this.f35921c = null;
        this.d = tL_reportResultAddComment;
        this.f35922f.f30819f3.O(false);
        if (this.f35923n != null) {
            org.telegram.messenger.i0.h3(new yz0(this, 1), 120L);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.c2 c2Var;
        try {
            jg.b1 b1Var = this.h;
            if (b1Var != null && (c2Var = (org.telegram.ui.ActionBar.c2) b1Var.d) != null) {
                int i10 = org.telegram.ui.ActionBar.t6.G6;
                c01 c01Var = this.f35926w;
                int i11 = c01.f36350s1;
                c2Var.a(org.telegram.ui.ActionBar.t6.w0(i10, c01Var.I0));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
