package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class a01 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public int f35504a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f35505b;
    public TLRPC.TL_reportResultChooseOption f35506c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.v51 f35507f;
    public final jg.b1 h;
    public yz0 f35508n;
    public FrameLayout f35509r;
    public vh.d f35510s;
    public final b01 f35511w;

    public a01(b01 b01Var, Context context) {
        super(context);
        this.f35511w = b01Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.i0.f16166m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.b6.e(-1, -1, 119));
        int i10 = b01.f35885s1;
        jg.b1 b1Var = new jg.b1(context, b01Var.I0);
        TextView textView = (TextView) b1Var.f9897c;
        this.h = b1Var;
        b1Var.e = new xz0(this, 0);
        if (b01Var.l1) {
            textView.setText(org.telegram.messenger.dd.L0(2131746251, null));
        } else if (b01Var.f35889m1) {
            textView.setText(org.telegram.messenger.dd.L0(2131746212, null));
        } else {
            textView.setText(org.telegram.messenger.dd.L0(2131746260, null));
        }
        ((org.telegram.ui.ActionBar.c2) b1Var.d).a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, b01Var.I0));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21002h5, b1Var, b01Var.I0);
        addView(b1Var, w7.b6.e(-1, -2, 55));
        org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(context, b01Var.f21584a, 0, true, new z4(this, 19), new rj0(this, 15), null, b01Var.I0);
        this.f35507f = v51Var;
        v51Var.setClipToPadding(false);
        v51Var.f31182e3.k1(true);
        v51Var.setOnScrollListener(new h3(this, 27));
        frameLayout.addView(v51Var, w7.b6.c(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f35504a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.v51 v51Var = this.f35507f;
        if (v51Var != null) {
            v51Var.f31183f3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f35505b = null;
        this.f35506c = null;
        this.d = tL_reportResultAddComment;
        this.f35507f.f31183f3.O(false);
        if (this.f35508n != null) {
            org.telegram.messenger.i0.h3(new xz0(this, 1), 120L);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.c2 c2Var;
        try {
            jg.b1 b1Var = this.h;
            if (b1Var != null && (c2Var = (org.telegram.ui.ActionBar.c2) b1Var.d) != null) {
                int i10 = org.telegram.ui.ActionBar.t6.G6;
                b01 b01Var = this.f35511w;
                int i11 = b01.f35885s1;
                c2Var.a(org.telegram.ui.ActionBar.t6.w0(i10, b01Var.I0));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
