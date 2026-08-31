package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class l31 extends FrameLayout {
    public int f38571a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f38572b;
    public TLRPC.TL_reportResultChooseOption f38573c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout f38574e;
    public final org.telegram.ui.Components.i61 f38575f;
    public final eg.q1 h;
    public j31 f38576n;
    public FrameLayout f38577r;
    public qh.d f38578s;
    public final m31 v;

    public l31(m31 m31Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var4;
        this.v = m31Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38574e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, k7.c6.e(-1, -1, 119));
        g6Var = ((org.telegram.ui.ActionBar.h3) m31Var).resourcesProvider;
        eg.q1 q1Var = new eg.q1(context, g6Var);
        TextView textView = (TextView) q1Var.f5445c;
        this.h = q1Var;
        q1Var.f5446e = new i31(this, 0);
        if (m31Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (m31Var.f38957e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        g6Var2 = ((org.telegram.ui.ActionBar.h3) m31Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.i2) q1Var.d).a(org.telegram.ui.ActionBar.k6.v0(i11, g6Var2));
        int i12 = org.telegram.ui.ActionBar.k6.f21731h5;
        g6Var3 = ((org.telegram.ui.ActionBar.h3) m31Var).resourcesProvider;
        q1Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var3));
        addView(q1Var, k7.c6.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.h3) m31Var).currentAccount;
        d5 d5Var = new d5(this, 19);
        kl0 kl0Var = new kl0(this, 15);
        g6Var4 = ((org.telegram.ui.ActionBar.h3) m31Var).resourcesProvider;
        org.telegram.ui.Components.i61 i61Var = new org.telegram.ui.Components.i61(context, i10, 0, true, d5Var, kl0Var, null, g6Var4);
        this.f38575f = i61Var;
        i61Var.setClipToPadding(false);
        i61Var.U2.k1(true);
        i61Var.setOnScrollListener(new l3(this, 27));
        frameLayout.addView(i61Var, k7.c6.c(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z4;
        this.f38571a = i10;
        if (i10 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.h.b(z4);
        org.telegram.ui.Components.i61 i61Var = this.f38575f;
        if (i61Var != null) {
            i61Var.V2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f38572b = null;
        this.f38573c = null;
        this.d = tL_reportResultAddComment;
        this.f38575f.V2.N(false);
        if (this.f38576n != null) {
            AndroidUtilities.runOnUIThread(new i31(this, 1), 120L);
        }
    }
}
