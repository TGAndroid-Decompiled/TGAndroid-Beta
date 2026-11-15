package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ly0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public int f49061a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f49062b;
    public TLRPC.TL_reportResultChooseOption f49063c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout f49064e;
    public final org.telegram.ui.Components.u41 f49065f;
    public final di.k4 h;
    public jy0 f49066n;
    public FrameLayout f49067r;
    public hi.d f49068s;
    public final my0 f49069w;

    public ly0(my0 my0Var, Context context) {
        super(context);
        this.f49069w = my0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49064e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.g0.f23603m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c8.ja.e(-1, -1, 119));
        int i7 = my0.f49340w1;
        di.k4 k4Var = new di.k4(context, my0Var.J0);
        TextView textView = (TextView) k4Var.f8908c;
        this.h = k4Var;
        k4Var.f8909e = new iy0(this, 0);
        if (my0Var.f49343p1) {
            textView.setText(org.telegram.messenger.hd.M0(2131746234, null));
        } else if (my0Var.f49344q1) {
            textView.setText(org.telegram.messenger.hd.M0(2131746195, null));
        } else {
            textView.setText(org.telegram.messenger.hd.M0(2131746243, null));
        }
        ((org.telegram.ui.ActionBar.x1) k4Var.d).a(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, my0Var.J0));
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28922h5, k4Var, my0Var.J0);
        addView(k4Var, c8.ja.e(-1, -2, 55));
        org.telegram.ui.Components.u41 u41Var = new org.telegram.ui.Components.u41(context, my0Var.f29679a, 0, true, new a5(this, 20), new ni0(this, 14), null, my0Var.J0);
        this.f49065f = u41Var;
        u41Var.setClipToPadding(false);
        u41Var.f39894f3.k1(true);
        u41Var.setOnScrollListener(new g3(this, 28));
        frameLayout.addView(u41Var, c8.ja.c(-1.0f, -1));
    }

    public final void a(int i7) {
        boolean z10;
        this.f49061a = i7;
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.u41 u41Var = this.f49065f;
        if (u41Var != null) {
            u41Var.f39895g3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f49062b = null;
        this.f49063c = null;
        this.d = tL_reportResultAddComment;
        this.f49065f.f39895g3.O(false);
        if (this.f49066n != null) {
            org.telegram.messenger.g0.i3(new iy0(this, 1), 120L);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.x1 x1Var;
        try {
            di.k4 k4Var = this.h;
            if (k4Var != null && (x1Var = (org.telegram.ui.ActionBar.x1) k4Var.d) != null) {
                int i7 = org.telegram.ui.ActionBar.j6.G6;
                my0 my0Var = this.f49069w;
                int i10 = my0.f49340w1;
                x1Var.a(org.telegram.ui.ActionBar.j6.w0(i7, my0Var.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
