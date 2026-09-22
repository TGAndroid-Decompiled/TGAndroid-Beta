package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class b41 extends FrameLayout {
    public int f32269a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f32270b;
    public TLRPC.TL_reportResultChooseOption f32271c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.u61 f32272f;
    public final t5 h;
    public a41 f32273n;
    public FrameLayout f32274r;
    public ci.d f32275s;
    public final c41 v;

    public b41(c41 c41Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.v = c41Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.y5.e(-1, -1, 119));
        f6Var = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
        t5 t5Var = new t5(context, f6Var);
        TextView textView = (TextView) t5Var.d;
        this.h = t5Var;
        t5Var.e = new z31(this, 0);
        if (c41Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (c41Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        f6Var2 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.g2) t5Var.f37645b).a(org.telegram.ui.ActionBar.j6.v0(i11, f6Var2));
        int i12 = org.telegram.ui.ActionBar.j6.f19180h5;
        f6Var3 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
        t5Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var3));
        addView(t5Var, w7.y5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.f3) c41Var).currentAccount;
        b5 b5Var = new b5(this, 19);
        ol0 ol0Var = new ol0(this, 16);
        f6Var4 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
        org.telegram.ui.Components.u61 u61Var = new org.telegram.ui.Components.u61(context, i10, 0, true, b5Var, ol0Var, null, f6Var4);
        this.f32272f = u61Var;
        u61Var.setClipToPadding(false);
        u61Var.X2.k1(true);
        u61Var.setOnScrollListener(new h3(this, 26));
        frameLayout.addView(u61Var, w7.y5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f32269a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.u61 u61Var = this.f32272f;
        if (u61Var != null) {
            u61Var.Y2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f32270b = null;
        this.f32271c = null;
        this.d = tL_reportResultAddComment;
        this.f32272f.Y2.N(false);
        if (this.f32273n != null) {
            AndroidUtilities.runOnUIThread(new z31(this, 1), 120L);
        }
    }
}
