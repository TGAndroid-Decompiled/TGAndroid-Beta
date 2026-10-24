package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class q21 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int f40693a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f40694b;
    public TLRPC.TL_reportResultChooseOption f40695c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.i71 f40696f;
    public final ai.o5 h;
    public p21 f40697n;
    public FrameLayout f40698r;
    public ei.d f40699s;
    public final r21 v;

    public q21(r21 r21Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var4;
        this.v = r21Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        g6Var = ((org.telegram.ui.ActionBar.h3) r21Var).resourcesProvider;
        ai.o5 o5Var = new ai.o5(context, g6Var);
        TextView textView = (TextView) o5Var.f1936c;
        this.h = o5Var;
        o5Var.e = new o21(this, 0);
        if (r21Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (r21Var.f40994f) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        g6Var2 = ((org.telegram.ui.ActionBar.h3) r21Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.h2) o5Var.d).a(org.telegram.ui.ActionBar.k6.w0(i11, g6Var2));
        int i12 = org.telegram.ui.ActionBar.k6.f21255h5;
        g6Var3 = ((org.telegram.ui.ActionBar.h3) r21Var).resourcesProvider;
        org.telegram.ui.ActionBar.r6.i(i12, o5Var, g6Var3);
        addView(o5Var, w7.z5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.h3) r21Var).currentAccount;
        f5 f5Var = new f5(this, 19);
        rp0 rp0Var = new rp0(this, 14);
        g6Var4 = ((org.telegram.ui.ActionBar.h3) r21Var).resourcesProvider;
        org.telegram.ui.Components.i71 i71Var = new org.telegram.ui.Components.i71(context, i10, 0, true, f5Var, rp0Var, null, g6Var4);
        this.f40696f = i71Var;
        i71Var.setClipToPadding(false);
        i71Var.Y2.k1(true);
        i71Var.setOnScrollListener(new j3(this, 26));
        frameLayout.addView(i71Var, w7.z5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f40693a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.i71 i71Var = this.f40696f;
        if (i71Var != null) {
            i71Var.Z2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f40694b = null;
        this.f40695c = null;
        this.d = tL_reportResultAddComment;
        this.f40696f.Z2.N(false);
        if (this.f40697n != null) {
            AndroidUtilities.runOnUIThread(new o21(this, 1), 120L);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.h2 h2Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        try {
            ai.o5 o5Var = this.h;
            if (o5Var != null && (h2Var = (org.telegram.ui.ActionBar.h2) o5Var.d) != null) {
                int i10 = org.telegram.ui.ActionBar.k6.G6;
                g6Var = ((org.telegram.ui.ActionBar.h3) this.v).resourcesProvider;
                h2Var.a(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
