package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class py0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public int f51036a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f51037b;
    public TLRPC.TL_reportResultChooseOption f51038c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout f51039e;
    public final org.telegram.ui.Components.e51 f51040f;
    public final di.n4 h;
    public ny0 f51041n;
    public FrameLayout f51042r;
    public hi.d f51043s;
    public final qy0 f51044w;

    public py0(qy0 qy0Var, Context context) {
        super(context);
        this.f51044w = qy0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51039e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.g0.f24115m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c8.ma.e(-1, -1, 119));
        int i7 = qy0.f51376w1;
        di.n4 n4Var = new di.n4(context, qy0Var.J0);
        TextView textView = (TextView) n4Var.f9374c;
        this.h = n4Var;
        n4Var.f9375e = new my0(this, 0);
        if (qy0Var.f51379p1) {
            textView.setText(org.telegram.messenger.gd.M0(2131746039, null));
        } else if (qy0Var.f51380q1) {
            textView.setText(org.telegram.messenger.gd.M0(2131746000, null));
        } else {
            textView.setText(org.telegram.messenger.gd.M0(2131746048, null));
        }
        ((org.telegram.ui.ActionBar.y1) n4Var.d).a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, qy0Var.J0));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29469h5, n4Var, qy0Var.J0);
        addView(n4Var, c8.ma.e(-1, -2, 55));
        org.telegram.ui.Components.e51 e51Var = new org.telegram.ui.Components.e51(context, qy0Var.f30189a, 0, true, new a5(this, 20), new qi0(this, 14), null, qy0Var.J0);
        this.f51040f = e51Var;
        e51Var.setClipToPadding(false);
        e51Var.f34606f3.k1(true);
        e51Var.setOnScrollListener(new g3(this, 28));
        frameLayout.addView(e51Var, c8.ma.c(-1.0f, -1));
    }

    public final void a(int i7) {
        boolean z10;
        this.f51036a = i7;
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.e51 e51Var = this.f51040f;
        if (e51Var != null) {
            e51Var.f34607g3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f51037b = null;
        this.f51038c = null;
        this.d = tL_reportResultAddComment;
        this.f51040f.f34607g3.O(false);
        if (this.f51041n != null) {
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
                qy0 qy0Var = this.f51044w;
                int i10 = qy0.f51376w1;
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
