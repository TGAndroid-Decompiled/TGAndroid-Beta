package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class d41 extends FrameLayout {
    public int f36638a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f36639b;
    public TLRPC.TL_reportResultChooseOption f36640c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout f36641e;
    public final org.telegram.ui.Components.p71 f36642f;
    public final w5 h;
    public c41 f36643n;
    public FrameLayout f36644r;
    public ci.d f36645s;
    public final e41 v;

    public d41(e41 e41Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var4;
        this.v = e41Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36641e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.w5.e(-1, -1, 119));
        c6Var = ((org.telegram.ui.ActionBar.e3) e41Var).resourcesProvider;
        w5 w5Var = new w5(context, c6Var);
        TextView textView = (TextView) w5Var.d;
        this.h = w5Var;
        w5Var.f43041e = new b41(this, 0);
        if (e41Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (e41Var.f36974e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        c6Var2 = ((org.telegram.ui.ActionBar.e3) e41Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.f2) w5Var.f43039b).a(org.telegram.ui.ActionBar.h6.w0(i11, c6Var2));
        int i12 = org.telegram.ui.ActionBar.h6.f20630h5;
        c6Var3 = ((org.telegram.ui.ActionBar.e3) e41Var).resourcesProvider;
        w5Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i12, c6Var3));
        addView(w5Var, w7.w5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.e3) e41Var).currentAccount;
        e5 e5Var = new e5(this, 19);
        jq0 jq0Var = new jq0(this, 14);
        c6Var4 = ((org.telegram.ui.ActionBar.e3) e41Var).resourcesProvider;
        org.telegram.ui.Components.p71 p71Var = new org.telegram.ui.Components.p71(context, i10, 0, true, e5Var, jq0Var, null, c6Var4);
        this.f36642f = p71Var;
        p71Var.setClipToPadding(false);
        p71Var.V2.k1(true);
        p71Var.setOnScrollListener(new i3(this, 26));
        frameLayout.addView(p71Var, w7.w5.d(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f36638a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.p71 p71Var = this.f36642f;
        if (p71Var != null) {
            p71Var.W2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f36639b = null;
        this.f36640c = null;
        this.d = tL_reportResultAddComment;
        this.f36642f.W2.N(false);
        if (this.f36643n != null) {
            AndroidUtilities.runOnUIThread(new b41(this, 1), 120L);
        }
    }
}
