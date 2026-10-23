package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
public final class nw0 extends tg.n {
    public final Context f39999i0;
    public final rw0 f40000j0;

    public nw0(rw0 rw0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.f40000j0 = rw0Var;
        this.f39999i0 = context2;
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
        int i19;
        rw0 rw0Var = this.f40000j0;
        PremiumPreviewFragment premiumPreviewFragment = rw0Var.f41263n;
        if (premiumPreviewFragment.f33824t0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.f39999i0;
            premiumPreviewFragment.f33824t0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            tg.g gVar = rw0Var.d.f47547b;
            ai.r rVar = new ai.r(context, 7);
            rVar.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i20 = org.telegram.ui.ActionBar.k6.f21365n5;
            org.telegram.ui.ActionBar.r6.W(textView, i20, null);
            org.telegram.messenger.sl.u(textView, 1, 16.0f, 1, 1);
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
            org.telegram.ui.Components.hp0 hp0Var = new org.telegram.ui.Components.hp0(context);
            hp0Var.setDelegate(new u10(gVar, 0));
            tg.o oVar = gVar.f47512c;
            float f12 = 0.0f;
            if (oVar == null) {
                f7 = 0.0f;
            } else {
                f7 = oVar.B / 2.0f;
            }
            hp0Var.setProgress(f7);
            hp0Var.setReportChanges(true);
            rVar.addView(hp0Var, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            org.telegram.ui.ActionBar.r6.W(textView2, i20, null);
            org.telegram.messenger.sl.u(textView2, 1, 16.0f, 1, 1);
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
            org.telegram.ui.Components.hp0 hp0Var2 = new org.telegram.ui.Components.hp0(context);
            hp0Var2.setDelegate(new u10(gVar, 1));
            tg.o oVar2 = gVar.f47512c;
            if (oVar2 == null) {
                f10 = 0.0f;
            } else {
                f10 = oVar2.C / 2.0f;
            }
            hp0Var2.setProgress(f10);
            hp0Var2.setReportChanges(true);
            rVar.addView(hp0Var2, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setText("Setup spec color");
            textView3.setTextSize(1, 16.0f);
            textView3.setLines(1);
            textView3.setGravity(17);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            int i21 = org.telegram.ui.ActionBar.k6.Sh;
            org.telegram.ui.ActionBar.r6.W(textView3, i21, null);
            int i22 = org.telegram.ui.ActionBar.k6.Oh;
            org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.a6.e(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.x0(null, i22, false));
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i22);
            org.telegram.ui.ActionBar.n6 f13 = org.telegram.ui.ActionBar.r6.f(i22);
            textView3.setBackground(e);
            org.telegram.ui.ActionBar.r6.k(textView3, e, O, f13, null);
            textView3.setOnClickListener(new v10(context, gVar, 0));
            rVar.addView(textView3, w7.z5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            org.telegram.ui.ActionBar.r6.W(textView4, i20, null);
            org.telegram.messenger.sl.u(textView4, 1, 16.0f, 1, 1);
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
            org.telegram.ui.Components.hp0 hp0Var3 = new org.telegram.ui.Components.hp0(context);
            hp0Var3.setDelegate(new u10(gVar, 2));
            tg.o oVar3 = gVar.f47512c;
            if (oVar3 == null) {
                f11 = 0.0f;
            } else {
                f11 = oVar3.D;
            }
            hp0Var3.setProgress(f11);
            hp0Var3.setReportChanges(true);
            rVar.addView(hp0Var3, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            org.telegram.ui.ActionBar.r6.W(textView5, i20, null);
            org.telegram.messenger.sl.u(textView5, 1, 16.0f, 1, 1);
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
            org.telegram.ui.Components.hp0 hp0Var4 = new org.telegram.ui.Components.hp0(context);
            hp0Var4.setDelegate(new u10(gVar, 3));
            tg.o oVar4 = gVar.f47512c;
            if (oVar4 != null) {
                f12 = oVar4.G / 2.0f;
            }
            hp0Var4.setProgress(f12);
            hp0Var4.setReportChanges(true);
            rVar.addView(hp0Var4, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            org.telegram.ui.ActionBar.r6.W(textView6, i21, null);
            org.telegram.ui.Cells.y e7 = org.telegram.ui.ActionBar.a6.e(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.x0(null, i22, false));
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i22);
            org.telegram.ui.ActionBar.n6 f14 = org.telegram.ui.ActionBar.r6.f(i22);
            textView6.setBackground(e7);
            org.telegram.ui.ActionBar.r6.k(textView6, e7, O2, f14, null);
            textView6.setOnClickListener(new v10(context, gVar, 1));
            rVar.addView(textView6, w7.z5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            org.telegram.ui.ActionBar.r6.W(textView7, i20, null);
            org.telegram.messenger.sl.u(textView7, 1, 16.0f, 1, 1);
            textView7.setSingleLine(true);
            if (LocaleController.isRTL) {
                i18 = 3;
            } else {
                i18 = 5;
            }
            textView7.setGravity(i18 | 48);
            if (LocaleController.isRTL) {
                i19 = 3;
            } else {
                i19 = 5;
            }
            rVar.addView(textView7, w7.z5.d(-2, -1.0f, i19 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.hp0 hp0Var5 = new org.telegram.ui.Components.hp0(context);
            hp0Var5.setDelegate(new pb.a(17));
            hp0Var5.setProgress(ai.r.f2098b / 2.0f);
            hp0Var5.setReportChanges(true);
            rVar.addView(hp0Var5, w7.z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            scrollView.addView(rVar);
            premiumPreviewFragment.f33824t0.addView(scrollView);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21254h5, premiumPreviewFragment.f33824t0, null);
            premiumPreviewFragment.f33805d0.addView(premiumPreviewFragment.f33824t0, w7.z5.e(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.f33824t0.getLayoutParams()).topMargin = premiumPreviewFragment.f33804c0;
            premiumPreviewFragment.f33824t0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.f33824t0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}
