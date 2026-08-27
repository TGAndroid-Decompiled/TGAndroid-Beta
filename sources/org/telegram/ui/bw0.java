package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;

public final class bw0 extends bg.i {
    public final Context U;
    public final fw0 V;

    public bw0(fw0 fw0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.V = fw0Var;
        this.U = context2;
    }

    @Override
    public final void g() {
        fw0 fw0Var = this.V;
        PremiumPreviewFragment premiumPreviewFragment = fw0Var.f38219n;
        if (premiumPreviewFragment.f35860n0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.U;
            premiumPreviewFragment.f35860n0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            bg.a aVar = fw0Var.d.f2129b;
            hh.m mVar = new hh.m(context, 7);
            int i10 = 1;
            mVar.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i11 = org.telegram.ui.ActionBar.g6.f23233n5;
            int i12 = 0;
            org.telegram.messenger.rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            mVar.addView(textView, h7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.qn0 qn0Var = new org.telegram.ui.Components.qn0(context);
            qn0Var.setDelegate(new t10(aVar, 0));
            bg.j jVar = aVar.f2090c;
            qn0Var.setProgress(jVar == null ? 0.0f : jVar.v / 2.0f);
            qn0Var.setReportChanges(true);
            mVar.addView(qn0Var, h7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            org.telegram.messenger.rl.p(textView2, org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, 16.0f, 1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            mVar.addView(textView2, h7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.qn0 qn0Var2 = new org.telegram.ui.Components.qn0(context);
            qn0Var2.setDelegate(new t10(aVar, 1));
            bg.j jVar2 = aVar.f2090c;
            qn0Var2.setProgress(jVar2 == null ? 0.0f : jVar2.f2162w / 2.0f);
            qn0Var2.setReportChanges(true);
            mVar.addView(qn0Var2, h7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setText("Setup spec color");
            textView3.setTextSize(1, 16.0f);
            textView3.setLines(1);
            textView3.setGravity(17);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            int i13 = org.telegram.ui.ActionBar.g6.Sh;
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            int i14 = org.telegram.ui.ActionBar.g6.Oh;
            textView3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.w0(null, i14, false)));
            textView3.setOnClickListener(new u10(context, aVar, i12));
            mVar.addView(textView3, h7.z5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            org.telegram.messenger.rl.p(textView4, org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, 16.0f, 1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            mVar.addView(textView4, h7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.qn0 qn0Var3 = new org.telegram.ui.Components.qn0(context);
            qn0Var3.setDelegate(new t10(aVar, 2));
            bg.j jVar3 = aVar.f2090c;
            qn0Var3.setProgress(jVar3 == null ? 0.0f : jVar3.f2163x);
            qn0Var3.setReportChanges(true);
            mVar.addView(qn0Var3, h7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            org.telegram.messenger.rl.p(textView5, org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, 16.0f, 1);
            textView5.setMaxLines(1);
            textView5.setSingleLine(true);
            textView5.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            mVar.addView(textView5, h7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.qn0 qn0Var4 = new org.telegram.ui.Components.qn0(context);
            qn0Var4.setDelegate(new t10(aVar, 3));
            bg.j jVar4 = aVar.f2090c;
            qn0Var4.setProgress(jVar4 == null ? 0.0f : jVar4.A / 2.0f);
            qn0Var4.setReportChanges(true);
            mVar.addView(qn0Var4, h7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            textView6.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            textView6.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.w0(null, i14, false)));
            textView6.setOnClickListener(new u10(context, aVar, i10));
            mVar.addView(textView6, h7.z5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            org.telegram.messenger.rl.p(textView7, org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, 16.0f, 1);
            textView7.setMaxLines(1);
            textView7.setSingleLine(true);
            textView7.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            mVar.addView(textView7, h7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.qn0 qn0Var5 = new org.telegram.ui.Components.qn0(context);
            qn0Var5.setDelegate(new za.b(18));
            qn0Var5.setProgress(hh.m.f9702b / 2.0f);
            qn0Var5.setReportChanges(true);
            mVar.addView(qn0Var5, h7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            scrollView.addView(mVar);
            premiumPreviewFragment.f35860n0.addView(scrollView);
            premiumPreviewFragment.f35860n0.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
            premiumPreviewFragment.Z.addView(premiumPreviewFragment.f35860n0, h7.z5.e(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.f35860n0.getLayoutParams()).topMargin = premiumPreviewFragment.Y;
            premiumPreviewFragment.f35860n0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.f35860n0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}
