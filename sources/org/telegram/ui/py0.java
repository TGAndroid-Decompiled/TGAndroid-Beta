package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class py0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int f51002a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f51003b;
    public TLRPC.TL_reportResultChooseOption f51004c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout f51005e;
    public final org.telegram.ui.Components.h51 f51006f;
    public final di.n4 h;
    public ny0 f51007n;
    public FrameLayout f51008r;
    public hi.e f51009s;
    public final qy0 f51010w;

    public py0(qy0 qy0Var, Context context) {
        super(context);
        this.f51010w = qy0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51005e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.g0.f24140m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c8.ma.e(-1, -1, 119));
        int i7 = qy0.f51390w1;
        di.n4 n4Var = new di.n4(context, qy0Var.J0);
        TextView textView = (TextView) n4Var.f9393c;
        this.h = n4Var;
        n4Var.f9394e = new my0(this, 0);
        if (qy0Var.f51393p1) {
            textView.setText(org.telegram.messenger.gd.N0(2131746038, null));
        } else if (qy0Var.f51394q1) {
            textView.setText(org.telegram.messenger.gd.N0(2131745999, null));
        } else {
            textView.setText(org.telegram.messenger.gd.N0(2131746047, null));
        }
        ((org.telegram.ui.ActionBar.x1) n4Var.d).a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, qy0Var.J0));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29451h5, n4Var, qy0Var.J0);
        addView(n4Var, c8.ma.e(-1, -2, 55));
        org.telegram.ui.Components.h51 h51Var = new org.telegram.ui.Components.h51(context, qy0Var.f30170a, 0, true, new a5(this, 20), new qi0(this, 14), null, qy0Var.J0);
        this.f51006f = h51Var;
        h51Var.setClipToPadding(false);
        h51Var.f35795f3.k1(true);
        h51Var.setOnScrollListener(new g3(this, 28));
        frameLayout.addView(h51Var, c8.ma.c(-1.0f, -1));
    }

    public final void a(int i7) {
        boolean z10;
        this.f51002a = i7;
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.h51 h51Var = this.f51006f;
        if (h51Var != null) {
            h51Var.f35796g3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f51003b = null;
        this.f51004c = null;
        this.d = tL_reportResultAddComment;
        this.f51006f.f35796g3.O(false);
        if (this.f51007n != null) {
            org.telegram.messenger.g0.h3(new my0(this, 1), 120L);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.x1 x1Var;
        try {
            di.n4 n4Var = this.h;
            if (n4Var != null && (x1Var = (org.telegram.ui.ActionBar.x1) n4Var.d) != null) {
                int i7 = org.telegram.ui.ActionBar.m6.G6;
                qy0 qy0Var = this.f51010w;
                int i10 = qy0.f51390w1;
                x1Var.a(org.telegram.ui.ActionBar.m6.w0(i7, qy0Var.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
