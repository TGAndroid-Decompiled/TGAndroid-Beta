package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class j31 extends FrameLayout {
    public int f35216a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f35217b;
    public TLRPC.TL_reportResultChooseOption f35218c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.g61 f35219f;
    public final dg.s1 h;
    public h31 f35220n;
    public FrameLayout f35221r;
    public ph.d f35222s;
    public final k31 v;

    public j31(k31 k31Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.v = k31Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, k7.b6.e(-1, -1, 119));
        f6Var = ((org.telegram.ui.ActionBar.g3) k31Var).resourcesProvider;
        dg.s1 s1Var = new dg.s1(context, f6Var);
        TextView textView = (TextView) s1Var.f4782c;
        this.h = s1Var;
        s1Var.e = new g31(this, 0);
        if (k31Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (k31Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        f6Var2 = ((org.telegram.ui.ActionBar.g3) k31Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.i2) s1Var.d).a(org.telegram.ui.ActionBar.j6.v0(i11, f6Var2));
        int i12 = org.telegram.ui.ActionBar.j6.f19977h5;
        f6Var3 = ((org.telegram.ui.ActionBar.g3) k31Var).resourcesProvider;
        s1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var3));
        addView(s1Var, k7.b6.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.g3) k31Var).currentAccount;
        d5 d5Var = new d5(this, 19);
        il0 il0Var = new il0(this, 15);
        f6Var4 = ((org.telegram.ui.ActionBar.g3) k31Var).resourcesProvider;
        org.telegram.ui.Components.g61 g61Var = new org.telegram.ui.Components.g61(context, i10, 0, true, d5Var, il0Var, null, f6Var4);
        this.f35219f = g61Var;
        g61Var.setClipToPadding(false);
        g61Var.U2.k1(true);
        g61Var.setOnScrollListener(new l3(this, 27));
        frameLayout.addView(g61Var, k7.b6.c(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z4;
        this.f35216a = i10;
        if (i10 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.h.b(z4);
        org.telegram.ui.Components.g61 g61Var = this.f35219f;
        if (g61Var != null) {
            g61Var.V2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f35217b = null;
        this.f35218c = null;
        this.d = tL_reportResultAddComment;
        this.f35219f.V2.N(false);
        if (this.f35220n != null) {
            AndroidUtilities.runOnUIThread(new g31(this, 1), 120L);
        }
    }
}
