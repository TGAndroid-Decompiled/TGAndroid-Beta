package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class d41 extends FrameLayout {
    public int f35672a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f35673b;
    public TLRPC.TL_reportResultChooseOption f35674c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout f35675e;
    public final org.telegram.ui.Components.d61 f35676f;
    public final t5 h;
    public c41 f35677n;
    public FrameLayout f35678r;
    public di.d f35679s;
    public final e41 v;

    public d41(e41 e41Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.v = e41Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35675e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        f6Var = ((org.telegram.ui.ActionBar.f3) e41Var).resourcesProvider;
        t5 t5Var = new t5(context, f6Var);
        TextView textView = (TextView) t5Var.d;
        this.h = t5Var;
        t5Var.f40648e = new b41(this, 0);
        if (e41Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (e41Var.f35953e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        f6Var2 = ((org.telegram.ui.ActionBar.f3) e41Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.g2) t5Var.f40646b).a(org.telegram.ui.ActionBar.j6.v0(i11, f6Var2));
        int i12 = org.telegram.ui.ActionBar.j6.f20761h5;
        f6Var3 = ((org.telegram.ui.ActionBar.f3) e41Var).resourcesProvider;
        t5Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var3));
        addView(t5Var, w7.x5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.f3) e41Var).currentAccount;
        b5 b5Var = new b5(this, 19);
        vl0 vl0Var = new vl0(this, 15);
        f6Var4 = ((org.telegram.ui.ActionBar.f3) e41Var).resourcesProvider;
        org.telegram.ui.Components.d61 d61Var = new org.telegram.ui.Components.d61(context, i10, 0, true, b5Var, vl0Var, null, f6Var4);
        this.f35676f = d61Var;
        d61Var.setClipToPadding(false);
        d61Var.X2.k1(true);
        d61Var.setOnScrollListener(new i3(this, 26));
        frameLayout.addView(d61Var, w7.x5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f35672a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.d61 d61Var = this.f35676f;
        if (d61Var != null) {
            d61Var.Y2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f35673b = null;
        this.f35674c = null;
        this.d = tL_reportResultAddComment;
        this.f35676f.Y2.N(false);
        if (this.f35677n != null) {
            AndroidUtilities.runOnUIThread(new b41(this, 1), 120L);
        }
    }
}
