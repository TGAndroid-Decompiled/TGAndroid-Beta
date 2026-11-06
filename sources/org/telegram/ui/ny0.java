package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ny0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public int f48169a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f48170b;
    public TLRPC.TL_reportResultChooseOption f48171c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout f48172e;
    public final org.telegram.ui.Components.p41 f48173f;
    public final bi.m5 h;
    public ly0 f48174n;
    public FrameLayout f48175r;
    public fi.d f48176s;
    public final oy0 f48177w;

    public ny0(oy0 oy0Var, Context context) {
        super(context);
        this.f48177w = oy0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48172e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.g0.f22531m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c8.ha.e(-1, -1, 119));
        int i7 = oy0.f48567s1;
        bi.m5 m5Var = new bi.m5(context, oy0Var.I0);
        TextView textView = (TextView) m5Var.f4327c;
        this.h = m5Var;
        m5Var.f4328e = new ky0(this, 0);
        if (oy0Var.l1) {
            textView.setText(org.telegram.messenger.hd.M0(2131746235, null));
        } else if (oy0Var.f48571m1) {
            textView.setText(org.telegram.messenger.hd.M0(2131746196, null));
        } else {
            textView.setText(org.telegram.messenger.hd.M0(2131746244, null));
        }
        ((org.telegram.ui.ActionBar.y1) m5Var.d).a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, oy0Var.I0));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27921h5, m5Var, oy0Var.I0);
        addView(m5Var, c8.ha.e(-1, -2, 55));
        org.telegram.ui.Components.p41 p41Var = new org.telegram.ui.Components.p41(context, oy0Var.f28612a, 0, true, new a5(this, 20), new li0(this, 14), null, oy0Var.I0);
        this.f48173f = p41Var;
        p41Var.setClipToPadding(false);
        p41Var.f36780e3.k1(true);
        p41Var.setOnScrollListener(new g3(this, 28));
        frameLayout.addView(p41Var, c8.ha.c(-1.0f, -1));
    }

    public final void a(int i7) {
        boolean z9;
        this.f48169a = i7;
        if (i7 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.h.b(z9);
        org.telegram.ui.Components.p41 p41Var = this.f48173f;
        if (p41Var != null) {
            p41Var.f36781f3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f48170b = null;
        this.f48171c = null;
        this.d = tL_reportResultAddComment;
        this.f48173f.f36781f3.O(false);
        if (this.f48174n != null) {
            org.telegram.messenger.g0.i3(new ky0(this, 1), 120L);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.y1 y1Var;
        try {
            bi.m5 m5Var = this.h;
            if (m5Var != null && (y1Var = (org.telegram.ui.ActionBar.y1) m5Var.d) != null) {
                int i7 = org.telegram.ui.ActionBar.k6.G6;
                oy0 oy0Var = this.f48177w;
                int i10 = oy0.f48567s1;
                y1Var.a(org.telegram.ui.ActionBar.k6.w0(i7, oy0Var.I0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
