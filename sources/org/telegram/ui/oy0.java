package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class oy0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public int f50785a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f50786b;
    public TLRPC.TL_reportResultChooseOption f50787c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout f50788e;
    public final org.telegram.ui.Components.g51 f50789f;
    public final di.n4 h;
    public my0 f50790n;
    public FrameLayout f50791r;
    public hi.e f50792s;
    public final py0 f50793w;

    public oy0(py0 py0Var, Context context) {
        super(context);
        this.f50793w = py0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50788e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.g0.f24220m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c8.na.e(-1, -1, 119));
        int i7 = py0.f51187w1;
        di.n4 n4Var = new di.n4(context, py0Var.J0);
        TextView textView = (TextView) n4Var.f9357c;
        this.h = n4Var;
        n4Var.f9358e = new ly0(this, 0);
        if (py0Var.f51190p1) {
            textView.setText(org.telegram.messenger.gd.N0(2131746038, null));
        } else if (py0Var.f51191q1) {
            textView.setText(org.telegram.messenger.gd.N0(2131745999, null));
        } else {
            textView.setText(org.telegram.messenger.gd.N0(2131746047, null));
        }
        ((org.telegram.ui.ActionBar.x1) n4Var.d).a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, py0Var.J0));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29524h5, n4Var, py0Var.J0);
        addView(n4Var, c8.na.e(-1, -2, 55));
        org.telegram.ui.Components.g51 g51Var = new org.telegram.ui.Components.g51(context, py0Var.f30223a, 0, true, new a5(this, 20), new oi0(this, 14), null, py0Var.J0);
        this.f50789f = g51Var;
        g51Var.setClipToPadding(false);
        g51Var.f35322f3.k1(true);
        g51Var.setOnScrollListener(new g3(this, 28));
        frameLayout.addView(g51Var, c8.na.c(-1.0f, -1));
    }

    public final void a(int i7) {
        boolean z10;
        this.f50785a = i7;
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.g51 g51Var = this.f50789f;
        if (g51Var != null) {
            g51Var.f35323g3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f50786b = null;
        this.f50787c = null;
        this.d = tL_reportResultAddComment;
        this.f50789f.f35323g3.O(false);
        if (this.f50790n != null) {
            org.telegram.messenger.g0.h3(new ly0(this, 1), 120L);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.x1 x1Var;
        try {
            di.n4 n4Var = this.h;
            if (n4Var != null && (x1Var = (org.telegram.ui.ActionBar.x1) n4Var.d) != null) {
                int i7 = org.telegram.ui.ActionBar.n6.G6;
                py0 py0Var = this.f50793w;
                int i10 = py0.f51187w1;
                x1Var.a(org.telegram.ui.ActionBar.n6.w0(i7, py0Var.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
