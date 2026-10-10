package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class b41 extends FrameLayout {
    public int f36175a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f36176b;
    public TLRPC.TL_reportResultChooseOption f36177c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout f36178e;
    public final org.telegram.ui.Components.l71 f36179f;
    public final t5 h;
    public a41 f36180n;
    public FrameLayout f36181r;
    public ci.d f36182s;
    public final c41 v;

    public b41(c41 c41Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var4;
        this.v = c41Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36178e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        e6Var = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
        t5 t5Var = new t5(context, e6Var);
        TextView textView = (TextView) t5Var.d;
        this.h = t5Var;
        t5Var.f41891e = new z31(this, 0);
        if (c41Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (c41Var.f36558e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        e6Var2 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.g2) t5Var.f41889b).a(org.telegram.ui.ActionBar.i6.w0(i11, e6Var2));
        int i12 = org.telegram.ui.ActionBar.i6.f20872h5;
        e6Var3 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
        t5Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var3));
        addView(t5Var, w7.x5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.f3) c41Var).currentAccount;
        b5 b5Var = new b5(this, 19);
        hq0 hq0Var = new hq0(this, 14);
        e6Var4 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
        org.telegram.ui.Components.l71 l71Var = new org.telegram.ui.Components.l71(context, i10, 0, true, b5Var, hq0Var, null, e6Var4);
        this.f36179f = l71Var;
        l71Var.setClipToPadding(false);
        l71Var.V2.k1(true);
        l71Var.setOnScrollListener(new i3(this, 26));
        frameLayout.addView(l71Var, w7.x5.d(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f36175a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.l71 l71Var = this.f36179f;
        if (l71Var != null) {
            l71Var.W2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f36176b = null;
        this.f36177c = null;
        this.d = tL_reportResultAddComment;
        this.f36179f.W2.N(false);
        if (this.f36180n != null) {
            AndroidUtilities.runOnUIThread(new z31(this, 1), 120L);
        }
    }
}
