package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class b41 extends FrameLayout {
    public int f36129a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f36130b;
    public TLRPC.TL_reportResultChooseOption f36131c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout f36132e;
    public final org.telegram.ui.Components.k71 f36133f;
    public final t5 h;
    public a41 f36134n;
    public FrameLayout f36135r;
    public ci.d f36136s;
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
        this.f36132e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        e6Var = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
        t5 t5Var = new t5(context, e6Var);
        TextView textView = (TextView) t5Var.d;
        this.h = t5Var;
        t5Var.f41845e = new z31(this, 0);
        if (c41Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (c41Var.f36512e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        e6Var2 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.g2) t5Var.f41843b).a(org.telegram.ui.ActionBar.i6.w0(i11, e6Var2));
        int i12 = org.telegram.ui.ActionBar.i6.f20868h5;
        e6Var3 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
        t5Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var3));
        addView(t5Var, w7.x5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.f3) c41Var).currentAccount;
        b5 b5Var = new b5(this, 19);
        hq0 hq0Var = new hq0(this, 14);
        e6Var4 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
        org.telegram.ui.Components.k71 k71Var = new org.telegram.ui.Components.k71(context, i10, 0, true, b5Var, hq0Var, null, e6Var4);
        this.f36133f = k71Var;
        k71Var.setClipToPadding(false);
        k71Var.V2.k1(true);
        k71Var.setOnScrollListener(new i3(this, 26));
        frameLayout.addView(k71Var, w7.x5.d(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f36129a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.k71 k71Var = this.f36133f;
        if (k71Var != null) {
            k71Var.W2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f36130b = null;
        this.f36131c = null;
        this.d = tL_reportResultAddComment;
        this.f36133f.W2.N(false);
        if (this.f36134n != null) {
            AndroidUtilities.runOnUIThread(new z31(this, 1), 120L);
        }
    }
}
