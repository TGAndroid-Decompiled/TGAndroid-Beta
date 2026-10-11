package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class a41 extends FrameLayout {
    public int f35876a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f35877b;
    public TLRPC.TL_reportResultChooseOption f35878c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout f35879e;
    public final org.telegram.ui.Components.m71 f35880f;
    public final s5 h;
    public z31 f35881n;
    public FrameLayout f35882r;
    public ci.d f35883s;
    public final b41 v;

    public a41(b41 b41Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var4;
        this.v = b41Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35879e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        d6Var = ((org.telegram.ui.ActionBar.e3) b41Var).resourcesProvider;
        s5 s5Var = new s5(context, d6Var);
        TextView textView = (TextView) s5Var.d;
        this.h = s5Var;
        s5Var.f41586e = new y31(this, 0);
        if (b41Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (b41Var.f36260e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        d6Var2 = ((org.telegram.ui.ActionBar.e3) b41Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.f2) s5Var.f41584b).a(org.telegram.ui.ActionBar.h6.w0(i11, d6Var2));
        int i12 = org.telegram.ui.ActionBar.h6.f20857h5;
        d6Var3 = ((org.telegram.ui.ActionBar.e3) b41Var).resourcesProvider;
        s5Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var3));
        addView(s5Var, w7.x5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.e3) b41Var).currentAccount;
        a5 a5Var = new a5(this, 19);
        gq0 gq0Var = new gq0(this, 14);
        d6Var4 = ((org.telegram.ui.ActionBar.e3) b41Var).resourcesProvider;
        org.telegram.ui.Components.m71 m71Var = new org.telegram.ui.Components.m71(context, i10, 0, true, a5Var, gq0Var, null, d6Var4);
        this.f35880f = m71Var;
        m71Var.setClipToPadding(false);
        m71Var.V2.k1(true);
        m71Var.setOnScrollListener(new h3(this, 26));
        frameLayout.addView(m71Var, w7.x5.d(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f35876a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.m71 m71Var = this.f35880f;
        if (m71Var != null) {
            m71Var.W2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f35877b = null;
        this.f35878c = null;
        this.d = tL_reportResultAddComment;
        this.f35880f.W2.N(false);
        if (this.f35881n != null) {
            AndroidUtilities.runOnUIThread(new y31(this, 1), 120L);
        }
    }
}
