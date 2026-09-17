package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class c41 extends FrameLayout {
    public int f32660a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f32661b;
    public TLRPC.TL_reportResultChooseOption f32662c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.f61 f32663f;
    public final t5 h;
    public b41 f32664n;
    public FrameLayout f32665r;
    public ci.d f32666s;
    public final d41 v;

    public c41(d41 d41Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.v = d41Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        f6Var = ((org.telegram.ui.ActionBar.g3) d41Var).resourcesProvider;
        t5 t5Var = new t5(context, f6Var);
        TextView textView = (TextView) t5Var.d;
        this.h = t5Var;
        t5Var.e = new a41(this, 0);
        if (d41Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (d41Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        f6Var2 = ((org.telegram.ui.ActionBar.g3) d41Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.h2) t5Var.f37652b).a(org.telegram.ui.ActionBar.j6.v0(i11, f6Var2));
        int i12 = org.telegram.ui.ActionBar.j6.f18933h5;
        f6Var3 = ((org.telegram.ui.ActionBar.g3) d41Var).resourcesProvider;
        t5Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var3));
        addView(t5Var, w7.x5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.g3) d41Var).currentAccount;
        b5 b5Var = new b5(this, 19);
        nl0 nl0Var = new nl0(this, 16);
        f6Var4 = ((org.telegram.ui.ActionBar.g3) d41Var).resourcesProvider;
        org.telegram.ui.Components.f61 f61Var = new org.telegram.ui.Components.f61(context, i10, 0, true, b5Var, nl0Var, null, f6Var4);
        this.f32663f = f61Var;
        f61Var.setClipToPadding(false);
        f61Var.X2.k1(true);
        f61Var.setOnScrollListener(new h3(this, 26));
        frameLayout.addView(f61Var, w7.x5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f32660a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.f61 f61Var = this.f32663f;
        if (f61Var != null) {
            f61Var.Y2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f32661b = null;
        this.f32662c = null;
        this.d = tL_reportResultAddComment;
        this.f32663f.Y2.N(false);
        if (this.f32664n != null) {
            AndroidUtilities.runOnUIThread(new a41(this, 1), 120L);
        }
    }
}
