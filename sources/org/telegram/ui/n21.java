package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class n21 extends FrameLayout {
    public int f39392a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f39393b;
    public TLRPC.TL_reportResultChooseOption f39394c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.b71 f39395f;
    public final ai.n5 h;
    public m21 f39396n;
    public FrameLayout f39397r;
    public ei.d f39398s;
    public final o21 v;

    public n21(o21 o21Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var4;
        this.v = o21Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        d6Var = ((org.telegram.ui.ActionBar.f3) o21Var).resourcesProvider;
        ai.n5 n5Var = new ai.n5(context, d6Var);
        TextView textView = (TextView) n5Var.f1888c;
        this.h = n5Var;
        n5Var.e = new l21(this, 0);
        if (o21Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (o21Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        d6Var2 = ((org.telegram.ui.ActionBar.f3) o21Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.g2) n5Var.d).a(org.telegram.ui.ActionBar.h6.w0(i11, d6Var2));
        int i12 = org.telegram.ui.ActionBar.h6.f21060h5;
        d6Var3 = ((org.telegram.ui.ActionBar.f3) o21Var).resourcesProvider;
        n5Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var3));
        addView(n5Var, w7.z5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.f3) o21Var).currentAccount;
        g5 g5Var = new g5(this, 19);
        pp0 pp0Var = new pp0(this, 14);
        d6Var4 = ((org.telegram.ui.ActionBar.f3) o21Var).resourcesProvider;
        org.telegram.ui.Components.b71 b71Var = new org.telegram.ui.Components.b71(context, i10, 0, true, g5Var, pp0Var, null, d6Var4);
        this.f39395f = b71Var;
        b71Var.setClipToPadding(false);
        b71Var.V2.k1(true);
        b71Var.setOnScrollListener(new k3(this, 26));
        frameLayout.addView(b71Var, w7.z5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f39392a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.b71 b71Var = this.f39395f;
        if (b71Var != null) {
            b71Var.W2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f39393b = null;
        this.f39394c = null;
        this.d = tL_reportResultAddComment;
        this.f39395f.W2.N(false);
        if (this.f39396n != null) {
            AndroidUtilities.runOnUIThread(new l21(this, 1), 120L);
        }
    }
}
