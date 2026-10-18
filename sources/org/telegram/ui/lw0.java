package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
public final class lw0 extends tg.n {
    public final Context f38985i0;
    public final pw0 f38986j0;

    public lw0(pw0 pw0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.f38986j0 = pw0Var;
        this.f38985i0 = context2;
    }

    @Override
    public final void i() {
        int i10;
        int i11;
        float f7;
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        float f11;
        int i16;
        int i17;
        int i18;
        pw0 pw0Var = this.f38986j0;
        PremiumPreviewFragment premiumPreviewFragment = pw0Var.f40258n;
        if (premiumPreviewFragment.f33514r0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.f38985i0;
            premiumPreviewFragment.f33514r0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            tg.g gVar = pw0Var.d.f47149b;
            ai.r rVar = new ai.r(context, 7);
            rVar.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i19 = org.telegram.ui.ActionBar.h6.f21175n5;
            org.telegram.messenger.kk.u(textView, org.telegram.ui.ActionBar.h6.x0(null, i19, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            if (LocaleController.isRTL) {
                i10 = 3;
            } else {
                i10 = 5;
            }
            textView.setGravity(i10 | 48);
            if (LocaleController.isRTL) {
                i11 = 3;
            } else {
                i11 = 5;
            }
            rVar.addView(textView, w7.z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i11 | 48));
            org.telegram.ui.Components.cp0 cp0Var = new org.telegram.ui.Components.cp0(context);
            cp0Var.setDelegate(new s10(gVar, 0));
            tg.o oVar = gVar.f47114c;
            float f12 = 0.0f;
            if (oVar == null) {
                f7 = 0.0f;
            } else {
                f7 = oVar.B / 2.0f;
            }
            cp0Var.setProgress(f7);
            cp0Var.setReportChanges(true);
            rVar.addView(cp0Var, w7.z5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            org.telegram.messenger.kk.u(textView2, org.telegram.ui.ActionBar.h6.x0(null, i19, false), 1, 16.0f, 1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            if (LocaleController.isRTL) {
                i12 = 3;
            } else {
                i12 = 5;
            }
            textView2.setGravity(i12 | 48);
            if (LocaleController.isRTL) {
                i13 = 3;
            } else {
                i13 = 5;
            }
            rVar.addView(textView2, w7.z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i13 | 48));
            org.telegram.ui.Components.cp0 cp0Var2 = new org.telegram.ui.Components.cp0(context);
            cp0Var2.setDelegate(new s10(gVar, 1));
            tg.o oVar2 = gVar.f47114c;
            if (oVar2 == null) {
                f10 = 0.0f;
            } else {
                f10 = oVar2.C / 2.0f;
            }
            cp0Var2.setProgress(f10);
            cp0Var2.setReportChanges(true);
            rVar.addView(cp0Var2, w7.z5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            TextView textView3 = new TextView(context);
            textView3.setText("Setup spec color");
            textView3.setTextSize(1, 16.0f);
            textView3.setLines(1);
            textView3.setGravity(17);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            int i20 = org.telegram.ui.ActionBar.h6.Sh;
            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i20, false));
            int i21 = org.telegram.ui.ActionBar.h6.Oh;
            textView3.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.x0(null, i21, false)));
            textView3.setOnClickListener(new t10(context, gVar, 0));
            rVar.addView(textView3, w7.z5.a(48.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 16));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            org.telegram.messenger.kk.u(textView4, org.telegram.ui.ActionBar.h6.x0(null, i19, false), 1, 16.0f, 1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            if (LocaleController.isRTL) {
                i14 = 3;
            } else {
                i14 = 5;
            }
            textView4.setGravity(i14 | 48);
            if (LocaleController.isRTL) {
                i15 = 3;
            } else {
                i15 = 5;
            }
            rVar.addView(textView4, w7.z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i15 | 48));
            org.telegram.ui.Components.cp0 cp0Var3 = new org.telegram.ui.Components.cp0(context);
            cp0Var3.setDelegate(new s10(gVar, 2));
            tg.o oVar3 = gVar.f47114c;
            if (oVar3 == null) {
                f11 = 0.0f;
            } else {
                f11 = oVar3.D;
            }
            cp0Var3.setProgress(f11);
            cp0Var3.setReportChanges(true);
            rVar.addView(cp0Var3, w7.z5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            org.telegram.messenger.kk.u(textView5, org.telegram.ui.ActionBar.h6.x0(null, i19, false), 1, 16.0f, 1);
            textView5.setMaxLines(1);
            textView5.setSingleLine(true);
            if (LocaleController.isRTL) {
                i16 = 3;
            } else {
                i16 = 5;
            }
            textView5.setGravity(i16 | 48);
            if (LocaleController.isRTL) {
                i17 = 3;
            } else {
                i17 = 5;
            }
            rVar.addView(textView5, w7.z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i17 | 48));
            org.telegram.ui.Components.cp0 cp0Var4 = new org.telegram.ui.Components.cp0(context);
            int i22 = 3;
            cp0Var4.setDelegate(new s10(gVar, 3));
            tg.o oVar4 = gVar.f47114c;
            if (oVar4 != null) {
                f12 = oVar4.G / 2.0f;
            }
            cp0Var4.setProgress(f12);
            cp0Var4.setReportChanges(true);
            rVar.addView(cp0Var4, w7.z5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            textView6.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i20, false));
            textView6.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.x0(null, i21, false)));
            textView6.setOnClickListener(new t10(context, gVar, 1));
            rVar.addView(textView6, w7.z5.a(48.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 16));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            org.telegram.messenger.kk.u(textView7, org.telegram.ui.ActionBar.h6.x0(null, i19, false), 1, 16.0f, 1);
            textView7.setMaxLines(1);
            textView7.setSingleLine(true);
            if (LocaleController.isRTL) {
                i18 = 3;
            } else {
                i18 = 5;
            }
            textView7.setGravity(i18 | 48);
            if (!LocaleController.isRTL) {
                i22 = 5;
            }
            rVar.addView(textView7, w7.z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i22 | 48));
            org.telegram.ui.Components.cp0 cp0Var5 = new org.telegram.ui.Components.cp0(context);
            cp0Var5.setDelegate(new pb.a(17));
            cp0Var5.setProgress(ai.r.f2092b / 2.0f);
            cp0Var5.setReportChanges(true);
            rVar.addView(cp0Var5, w7.z5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            scrollView.addView(rVar);
            premiumPreviewFragment.f33514r0.addView(scrollView);
            premiumPreviewFragment.f33514r0.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21064h5, false));
            premiumPreviewFragment.f33498d0.addView(premiumPreviewFragment.f33514r0, w7.z5.e(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.f33514r0.getLayoutParams()).topMargin = premiumPreviewFragment.f33497c0;
            premiumPreviewFragment.f33514r0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.f33514r0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}
