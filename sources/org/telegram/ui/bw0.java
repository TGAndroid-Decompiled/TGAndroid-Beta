package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
public final class bw0 extends ag.j {
    public final Context U;
    public final fw0 V;

    public bw0(fw0 fw0Var, Context context, int i9, int i10, Context context2) {
        super(context, i9, i10);
        this.V = fw0Var;
        this.U = context2;
    }

    @Override
    public final void g() {
        int i9;
        int i10;
        float f10;
        int i11;
        int i12;
        float f11;
        int i13;
        int i14;
        float f12;
        int i15;
        int i16;
        float f13;
        int i17;
        fw0 fw0Var = this.V;
        PremiumPreviewFragment premiumPreviewFragment = fw0Var.f38361n;
        if (premiumPreviewFragment.f35857n0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.U;
            premiumPreviewFragment.f35857n0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            ag.a aVar = fw0Var.d.f205b;
            gh.m mVar = new gh.m(context, 7);
            mVar.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i18 = org.telegram.ui.ActionBar.f6.f23178n5;
            org.telegram.messenger.ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, i18, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            if (LocaleController.isRTL) {
                i9 = 3;
            } else {
                i9 = 5;
            }
            textView.setGravity(i9 | 48);
            if (LocaleController.isRTL) {
                i10 = 3;
            } else {
                i10 = 5;
            }
            mVar.addView(textView, g7.e6.d(-2, -1.0f, i10 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.pn0 pn0Var = new org.telegram.ui.Components.pn0(context);
            pn0Var.setDelegate(new q10(aVar, 0));
            ag.k kVar = aVar.f164c;
            if (kVar == null) {
                f10 = 0.0f;
            } else {
                f10 = kVar.v / 2.0f;
            }
            pn0Var.setProgress(f10);
            pn0Var.setReportChanges(true);
            mVar.addView(pn0Var, g7.e6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            org.telegram.messenger.ll.s(textView2, org.telegram.ui.ActionBar.f6.w0(null, i18, false), 1, 16.0f, 1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            if (LocaleController.isRTL) {
                i11 = 3;
            } else {
                i11 = 5;
            }
            textView2.setGravity(i11 | 48);
            if (LocaleController.isRTL) {
                i12 = 3;
            } else {
                i12 = 5;
            }
            mVar.addView(textView2, g7.e6.d(-2, -1.0f, i12 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.pn0 pn0Var2 = new org.telegram.ui.Components.pn0(context);
            pn0Var2.setDelegate(new q10(aVar, 1));
            ag.k kVar2 = aVar.f164c;
            if (kVar2 == null) {
                f11 = 0.0f;
            } else {
                f11 = kVar2.f238w / 2.0f;
            }
            pn0Var2.setProgress(f11);
            pn0Var2.setReportChanges(true);
            mVar.addView(pn0Var2, g7.e6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setText("Setup spec color");
            textView3.setTextSize(1, 16.0f);
            textView3.setLines(1);
            textView3.setGravity(17);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            int i19 = org.telegram.ui.ActionBar.f6.Sh;
            textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i19, false));
            int i20 = org.telegram.ui.ActionBar.f6.Oh;
            textView3.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.w0(null, i20, false)));
            textView3.setOnClickListener(new r10(context, aVar, 0));
            mVar.addView(textView3, g7.e6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            org.telegram.messenger.ll.s(textView4, org.telegram.ui.ActionBar.f6.w0(null, i18, false), 1, 16.0f, 1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            if (LocaleController.isRTL) {
                i13 = 3;
            } else {
                i13 = 5;
            }
            textView4.setGravity(i13 | 48);
            if (LocaleController.isRTL) {
                i14 = 3;
            } else {
                i14 = 5;
            }
            mVar.addView(textView4, g7.e6.d(-2, -1.0f, i14 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.pn0 pn0Var3 = new org.telegram.ui.Components.pn0(context);
            pn0Var3.setDelegate(new q10(aVar, 2));
            ag.k kVar3 = aVar.f164c;
            if (kVar3 == null) {
                f12 = 0.0f;
            } else {
                f12 = kVar3.f239x;
            }
            pn0Var3.setProgress(f12);
            pn0Var3.setReportChanges(true);
            mVar.addView(pn0Var3, g7.e6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            org.telegram.messenger.ll.s(textView5, org.telegram.ui.ActionBar.f6.w0(null, i18, false), 1, 16.0f, 1);
            textView5.setMaxLines(1);
            textView5.setSingleLine(true);
            if (LocaleController.isRTL) {
                i15 = 3;
            } else {
                i15 = 5;
            }
            textView5.setGravity(i15 | 48);
            if (LocaleController.isRTL) {
                i16 = 3;
            } else {
                i16 = 5;
            }
            mVar.addView(textView5, g7.e6.d(-2, -1.0f, i16 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.pn0 pn0Var4 = new org.telegram.ui.Components.pn0(context);
            int i21 = 3;
            pn0Var4.setDelegate(new q10(aVar, 3));
            ag.k kVar4 = aVar.f164c;
            if (kVar4 == null) {
                f13 = 0.0f;
            } else {
                f13 = kVar4.A / 2.0f;
            }
            pn0Var4.setProgress(f13);
            pn0Var4.setReportChanges(true);
            mVar.addView(pn0Var4, g7.e6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            textView6.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i19, false));
            textView6.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.w0(null, i20, false)));
            textView6.setOnClickListener(new r10(context, aVar, 1));
            mVar.addView(textView6, g7.e6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            org.telegram.messenger.ll.s(textView7, org.telegram.ui.ActionBar.f6.w0(null, i18, false), 1, 16.0f, 1);
            textView7.setMaxLines(1);
            textView7.setSingleLine(true);
            if (LocaleController.isRTL) {
                i17 = 3;
            } else {
                i17 = 5;
            }
            textView7.setGravity(i17 | 48);
            if (!LocaleController.isRTL) {
                i21 = 5;
            }
            mVar.addView(textView7, g7.e6.d(-2, -1.0f, i21 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.pn0 pn0Var5 = new org.telegram.ui.Components.pn0(context);
            pn0Var5.setDelegate(new ya.b(18));
            pn0Var5.setProgress(gh.m.f8529b / 2.0f);
            pn0Var5.setReportChanges(true);
            mVar.addView(pn0Var5, g7.e6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            scrollView.addView(mVar);
            premiumPreviewFragment.f35857n0.addView(scrollView);
            premiumPreviewFragment.f35857n0.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false));
            premiumPreviewFragment.Z.addView(premiumPreviewFragment.f35857n0, g7.e6.e(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.f35857n0.getLayoutParams()).topMargin = premiumPreviewFragment.Y;
            premiumPreviewFragment.f35857n0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.f35857n0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}
