package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class py0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public int f50957a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f50958b;
    public TLRPC.TL_reportResultChooseOption f50959c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout f50960e;
    public final org.telegram.ui.Components.e51 f50961f;
    public final di.n4 h;
    public ny0 f50962n;
    public FrameLayout f50963r;
    public hi.d f50964s;
    public final qy0 f50965w;

    public py0(qy0 qy0Var, Context context) {
        super(context);
        this.f50965w = qy0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50960e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.g0.f24112m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c8.ma.e(-1, -1, 119));
        int i7 = qy0.f51336w1;
        di.n4 n4Var = new di.n4(context, qy0Var.J0);
        TextView textView = (TextView) n4Var.f9371c;
        this.h = n4Var;
        n4Var.f9372e = new my0(this, 0);
        if (qy0Var.f51339p1) {
            textView.setText(org.telegram.messenger.gd.M0(2131746039, null));
        } else if (qy0Var.f51340q1) {
            textView.setText(org.telegram.messenger.gd.M0(2131746000, null));
        } else {
            textView.setText(org.telegram.messenger.gd.M0(2131746048, null));
        }
        ((org.telegram.ui.ActionBar.y1) n4Var.d).a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, qy0Var.J0));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29467h5, n4Var, qy0Var.J0);
        addView(n4Var, c8.ma.e(-1, -2, 55));
        org.telegram.ui.Components.e51 e51Var = new org.telegram.ui.Components.e51(context, qy0Var.f30187a, 0, true, new a5(this, 20), new qi0(this, 14), null, qy0Var.J0);
        this.f50961f = e51Var;
        e51Var.setClipToPadding(false);
        e51Var.f34606f3.k1(true);
        e51Var.setOnScrollListener(new g3(this, 28));
        frameLayout.addView(e51Var, c8.ma.c(-1.0f, -1));
    }

    public final void a(int i7) {
        boolean z10;
        this.f50957a = i7;
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.e51 e51Var = this.f50961f;
        if (e51Var != null) {
            e51Var.f34607g3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f50958b = null;
        this.f50959c = null;
        this.d = tL_reportResultAddComment;
        this.f50961f.f34607g3.O(false);
        if (this.f50962n != null) {
            org.telegram.messenger.g0.h3(new my0(this, 1), 120L);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.y1 y1Var;
        try {
            di.n4 n4Var = this.h;
            if (n4Var != null && (y1Var = (org.telegram.ui.ActionBar.y1) n4Var.d) != null) {
                int i7 = org.telegram.ui.ActionBar.n6.G6;
                qy0 qy0Var = this.f50965w;
                int i10 = qy0.f51336w1;
                y1Var.a(org.telegram.ui.ActionBar.n6.w0(i7, qy0Var.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
