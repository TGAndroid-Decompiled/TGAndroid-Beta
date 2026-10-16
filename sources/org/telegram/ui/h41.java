package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class h41 extends FrameLayout {
    public int f36389a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f36390b;
    public TLRPC.TL_reportResultChooseOption f36391c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.i71 f36392f;
    public final x5 h;
    public g41 f36393n;
    public FrameLayout f36394r;
    public di.d f36395s;
    public final i41 v;

    public h41(i41 i41Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var4;
        this.v = i41Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        c6Var = ((org.telegram.ui.ActionBar.e3) i41Var).resourcesProvider;
        x5 x5Var = new x5(context, c6Var);
        TextView textView = (TextView) x5Var.d;
        this.h = x5Var;
        x5Var.e = new f41(this, 0);
        if (i41Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (i41Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        c6Var2 = ((org.telegram.ui.ActionBar.e3) i41Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.f2) x5Var.f41432b).a(org.telegram.ui.ActionBar.g6.w0(i11, c6Var2));
        int i12 = org.telegram.ui.ActionBar.g6.f19672h5;
        c6Var3 = ((org.telegram.ui.ActionBar.e3) i41Var).resourcesProvider;
        x5Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var3));
        addView(x5Var, w7.z5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.e3) i41Var).currentAccount;
        f5 f5Var = new f5(this, 19);
        lq0 lq0Var = new lq0(this, 14);
        c6Var4 = ((org.telegram.ui.ActionBar.e3) i41Var).resourcesProvider;
        org.telegram.ui.Components.i71 i71Var = new org.telegram.ui.Components.i71(context, i10, 0, true, f5Var, lq0Var, null, c6Var4);
        this.f36392f = i71Var;
        i71Var.setClipToPadding(false);
        i71Var.V2.k1(true);
        i71Var.setOnScrollListener(new k3(this, 26));
        frameLayout.addView(i71Var, w7.z5.d(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f36389a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.i71 i71Var = this.f36392f;
        if (i71Var != null) {
            i71Var.W2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f36390b = null;
        this.f36391c = null;
        this.d = tL_reportResultAddComment;
        this.f36392f.W2.N(false);
        if (this.f36393n != null) {
            AndroidUtilities.runOnUIThread(new f41(this, 1), 120L);
        }
    }
}
