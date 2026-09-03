package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class p31 extends FrameLayout {
    public int f36929a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f36930b;
    public TLRPC.TL_reportResultChooseOption f36931c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.g61 f36932f;
    public final dg.s1 h;
    public o31 f36933n;
    public FrameLayout f36934r;
    public ph.d f36935s;
    public final q31 v;

    public p31(q31 q31Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.v = q31Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, k7.b6.e(-1, -1, 119));
        f6Var = ((org.telegram.ui.ActionBar.g3) q31Var).resourcesProvider;
        dg.s1 s1Var = new dg.s1(context, f6Var);
        TextView textView = (TextView) s1Var.f4788c;
        this.h = s1Var;
        s1Var.e = new n31(this, 0);
        if (q31Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (q31Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        f6Var2 = ((org.telegram.ui.ActionBar.g3) q31Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.i2) s1Var.d).a(org.telegram.ui.ActionBar.j6.v0(i11, f6Var2));
        int i12 = org.telegram.ui.ActionBar.j6.f19952h5;
        f6Var3 = ((org.telegram.ui.ActionBar.g3) q31Var).resourcesProvider;
        s1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var3));
        addView(s1Var, k7.b6.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.g3) q31Var).currentAccount;
        f5 f5Var = new f5(this, 19);
        kl0 kl0Var = new kl0(this, 15);
        f6Var4 = ((org.telegram.ui.ActionBar.g3) q31Var).resourcesProvider;
        org.telegram.ui.Components.g61 g61Var = new org.telegram.ui.Components.g61(context, i10, 0, true, f5Var, kl0Var, null, f6Var4);
        this.f36932f = g61Var;
        g61Var.setClipToPadding(false);
        g61Var.U2.k1(true);
        g61Var.setOnScrollListener(new n3(this, 26));
        frameLayout.addView(g61Var, k7.b6.c(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z4;
        this.f36929a = i10;
        if (i10 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.h.b(z4);
        org.telegram.ui.Components.g61 g61Var = this.f36932f;
        if (g61Var != null) {
            g61Var.V2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f36930b = null;
        this.f36931c = null;
        this.d = tL_reportResultAddComment;
        this.f36932f.V2.N(false);
        if (this.f36933n != null) {
            AndroidUtilities.runOnUIThread(new n31(this, 1), 120L);
        }
    }
}
