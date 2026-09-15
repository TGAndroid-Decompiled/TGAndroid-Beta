package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class a41 extends FrameLayout {
    public int f31689a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f31690b;
    public TLRPC.TL_reportResultChooseOption f31691c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.e61 f31692f;
    public final t5 h;
    public z31 f31693n;
    public FrameLayout f31694r;
    public ci.d f31695s;
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
        addView(frameLayout, w7.x5.e(-1, -1, 119));
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
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        e6Var2 = ((org.telegram.ui.ActionBar.f3) b41Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.g2) t5Var.f37550b).a(org.telegram.ui.ActionBar.i6.v0(i11, e6Var2));
        int i12 = org.telegram.ui.ActionBar.i6.f18907h5;
        e6Var3 = ((org.telegram.ui.ActionBar.f3) b41Var).resourcesProvider;
        t5Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i12, e6Var3));
        addView(t5Var, w7.x5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.f3) b41Var).currentAccount;
        b5 b5Var = new b5(this, 19);
        tl0 tl0Var = new tl0(this, 15);
        e6Var4 = ((org.telegram.ui.ActionBar.f3) b41Var).resourcesProvider;
        org.telegram.ui.Components.e61 e61Var = new org.telegram.ui.Components.e61(context, i10, 0, true, b5Var, tl0Var, null, e6Var4);
        this.f31692f = e61Var;
        e61Var.setClipToPadding(false);
        e61Var.X2.k1(true);
        e61Var.setOnScrollListener(new h3(this, 26));
        frameLayout.addView(e61Var, w7.x5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f31689a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.e61 e61Var = this.f31692f;
        if (e61Var != null) {
            e61Var.Y2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f31690b = null;
        this.f31691c = null;
        this.d = tL_reportResultAddComment;
        this.f31692f.Y2.N(false);
        if (this.f31693n != null) {
            AndroidUtilities.runOnUIThread(new y31(this, 1), 120L);
        }
    }
}
