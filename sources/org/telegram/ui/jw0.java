package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
public final class jw0 extends tg.n {
    public final Context f38379i0;
    public final nw0 f38380j0;

    public jw0(nw0 nw0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.f38380j0 = nw0Var;
        this.f38379i0 = context2;
    }

    @Override
    public final void h() {
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
        nw0 nw0Var = this.f38380j0;
        PremiumPreviewFragment premiumPreviewFragment = nw0Var.f39704n;
        if (premiumPreviewFragment.f33524r0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.f38379i0;
            premiumPreviewFragment.f33524r0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            tg.g gVar = nw0Var.d.f47112b;
            ai.r rVar = new ai.r(context, 7);
            rVar.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i19 = org.telegram.ui.ActionBar.h6.f21176n5;
            org.telegram.messenger.nk.u(textView, org.telegram.ui.ActionBar.h6.x0(null, i19, false), 1, 16.0f, 1);
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
            rVar.addView(textView, w7.z5.d(-2, -1.0f, i11 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.dp0 dp0Var = new org.telegram.ui.Components.dp0(context);
            dp0Var.setDelegate(new q10(gVar, 0));
            tg.o oVar = gVar.f47077c;
            float f12 = 0.0f;
            if (oVar == null) {
                f7 = 0.0f;
            } else {
                f7 = oVar.B / 2.0f;
            }
            dp0Var.setProgress(f7);
            dp0Var.setReportChanges(true);
            rVar.addView(dp0Var, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            org.telegram.messenger.nk.u(textView2, org.telegram.ui.ActionBar.h6.x0(null, i19, false), 1, 16.0f, 1);
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
            rVar.addView(textView2, w7.z5.d(-2, -1.0f, i13 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.dp0 dp0Var2 = new org.telegram.ui.Components.dp0(context);
            dp0Var2.setDelegate(new q10(gVar, 1));
            tg.o oVar2 = gVar.f47077c;
            if (oVar2 == null) {
                f10 = 0.0f;
            } else {
                f10 = oVar2.C / 2.0f;
            }
            dp0Var2.setProgress(f10);
            dp0Var2.setReportChanges(true);
            rVar.addView(dp0Var2, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
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
            textView3.setOnClickListener(new r10(context, gVar, 0));
            rVar.addView(textView3, w7.z5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            org.telegram.messenger.nk.u(textView4, org.telegram.ui.ActionBar.h6.x0(null, i19, false), 1, 16.0f, 1);
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
            rVar.addView(textView4, w7.z5.d(-2, -1.0f, i15 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.dp0 dp0Var3 = new org.telegram.ui.Components.dp0(context);
            dp0Var3.setDelegate(new q10(gVar, 2));
            tg.o oVar3 = gVar.f47077c;
            if (oVar3 == null) {
                f11 = 0.0f;
            } else {
                f11 = oVar3.D;
            }
            dp0Var3.setProgress(f11);
            dp0Var3.setReportChanges(true);
            rVar.addView(dp0Var3, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            org.telegram.messenger.nk.u(textView5, org.telegram.ui.ActionBar.h6.x0(null, i19, false), 1, 16.0f, 1);
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
            rVar.addView(textView5, w7.z5.d(-2, -1.0f, i17 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.dp0 dp0Var4 = new org.telegram.ui.Components.dp0(context);
            int i22 = 3;
            dp0Var4.setDelegate(new q10(gVar, 3));
            tg.o oVar4 = gVar.f47077c;
            if (oVar4 != null) {
                f12 = oVar4.G / 2.0f;
            }
            dp0Var4.setProgress(f12);
            dp0Var4.setReportChanges(true);
            rVar.addView(dp0Var4, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            textView6.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i20, false));
            textView6.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.x0(null, i21, false)));
            textView6.setOnClickListener(new r10(context, gVar, 1));
            rVar.addView(textView6, w7.z5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            org.telegram.messenger.nk.u(textView7, org.telegram.ui.ActionBar.h6.x0(null, i19, false), 1, 16.0f, 1);
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
            rVar.addView(textView7, w7.z5.d(-2, -1.0f, i22 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.dp0 dp0Var5 = new org.telegram.ui.Components.dp0(context);
            dp0Var5.setDelegate(new pb.a(17));
            dp0Var5.setProgress(ai.r.f2093b / 2.0f);
            dp0Var5.setReportChanges(true);
            rVar.addView(dp0Var5, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            scrollView.addView(rVar);
            premiumPreviewFragment.f33524r0.addView(scrollView);
            premiumPreviewFragment.f33524r0.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21065h5, false));
            premiumPreviewFragment.f33508d0.addView(premiumPreviewFragment.f33524r0, w7.z5.e(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.f33524r0.getLayoutParams()).topMargin = premiumPreviewFragment.f33507c0;
            premiumPreviewFragment.f33524r0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.f33524r0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}
