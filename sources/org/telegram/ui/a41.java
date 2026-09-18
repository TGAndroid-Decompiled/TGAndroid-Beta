package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class a41 extends FrameLayout {
    public int f31945a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f31946b;
    public TLRPC.TL_reportResultChooseOption f31947c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.t61 f31948f;
    public final t5 h;
    public z31 f31949n;
    public FrameLayout f31950r;
    public ci.d f31951s;
    public final b41 v;

    public a41(b41 b41Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var4;
        this.v = b41Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.y5.e(-1, -1, 119));
        e6Var = ((org.telegram.ui.ActionBar.f3) b41Var).resourcesProvider;
        t5 t5Var = new t5(context, e6Var);
        TextView textView = (TextView) t5Var.d;
        this.h = t5Var;
        t5Var.e = new y31(this, 0);
        if (b41Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (b41Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        e6Var2 = ((org.telegram.ui.ActionBar.f3) b41Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.g2) t5Var.f37567b).a(org.telegram.ui.ActionBar.j6.v0(i11, e6Var2));
        int i12 = org.telegram.ui.ActionBar.j6.f19133h5;
        e6Var3 = ((org.telegram.ui.ActionBar.f3) b41Var).resourcesProvider;
        t5Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, e6Var3));
        addView(t5Var, w7.y5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.f3) b41Var).currentAccount;
        b5 b5Var = new b5(this, 19);
        ol0 ol0Var = new ol0(this, 16);
        e6Var4 = ((org.telegram.ui.ActionBar.f3) b41Var).resourcesProvider;
        org.telegram.ui.Components.t61 t61Var = new org.telegram.ui.Components.t61(context, i10, 0, true, b5Var, ol0Var, null, e6Var4);
        this.f31948f = t61Var;
        t61Var.setClipToPadding(false);
        t61Var.X2.k1(true);
        t61Var.setOnScrollListener(new h3(this, 26));
        frameLayout.addView(t61Var, w7.y5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f31945a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.t61 t61Var = this.f31948f;
        if (t61Var != null) {
            t61Var.Y2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f31946b = null;
        this.f31947c = null;
        this.d = tL_reportResultAddComment;
        this.f31948f.Y2.N(false);
        if (this.f31949n != null) {
            AndroidUtilities.runOnUIThread(new y31(this, 1), 120L);
        }
    }
}
