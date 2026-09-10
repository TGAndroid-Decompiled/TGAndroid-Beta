package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
public final class hx0 extends rg.f {
    public final Context f33482b0;
    public final lx0 f33483c0;

    public hx0(lx0 lx0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.f33483c0 = lx0Var;
        this.f33482b0 = context2;
    }

    @Override
    public final void g() {
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
        float f12;
        int i18;
        int i19;
        lx0 lx0Var = this.f33483c0;
        PremiumPreviewFragment premiumPreviewFragment = lx0Var.f34805n;
        if (premiumPreviewFragment.f30289r0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.f33482b0;
            premiumPreviewFragment.f30289r0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            rg.a aVar = lx0Var.d.f41485b;
            zd zdVar = new zd(context, 5);
            zdVar.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i20 = org.telegram.ui.ActionBar.j6.f18109n5;
            org.telegram.messenger.em.r(textView, org.telegram.ui.ActionBar.j6.w0(null, i20, false), 1, 16.0f, 1);
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
            zdVar.addView(textView, w7.a6.d(-2, -1.0f, i11 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.oo0 oo0Var = new org.telegram.ui.Components.oo0(context);
            oo0Var.setDelegate(new k20(aVar, 0));
            rg.g gVar = aVar.f41455c;
            if (gVar == null) {
                f7 = 0.0f;
            } else {
                f7 = gVar.v / 2.0f;
            }
            oo0Var.setProgress(f7);
            oo0Var.setReportChanges(true);
            zdVar.addView(oo0Var, w7.a6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            org.telegram.messenger.em.r(textView2, org.telegram.ui.ActionBar.j6.w0(null, i20, false), 1, 16.0f, 1);
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
            zdVar.addView(textView2, w7.a6.d(-2, -1.0f, i13 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.oo0 oo0Var2 = new org.telegram.ui.Components.oo0(context);
            oo0Var2.setDelegate(new k20(aVar, 1));
            rg.g gVar2 = aVar.f41455c;
            if (gVar2 == null) {
                f10 = 0.0f;
            } else {
                f10 = gVar2.f41516w / 2.0f;
            }
            oo0Var2.setProgress(f10);
            oo0Var2.setReportChanges(true);
            zdVar.addView(oo0Var2, w7.a6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setText("Setup spec color");
            textView3.setTextSize(1, 16.0f);
            textView3.setLines(1);
            textView3.setGravity(17);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            int i21 = org.telegram.ui.ActionBar.j6.Sh;
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i21, false));
            int i22 = org.telegram.ui.ActionBar.j6.Oh;
            textView3.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.w0(null, i22, false)));
            textView3.setOnClickListener(new l20(context, aVar, 0));
            zdVar.addView(textView3, w7.a6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            org.telegram.messenger.em.r(textView4, org.telegram.ui.ActionBar.j6.w0(null, i20, false), 1, 16.0f, 1);
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
            zdVar.addView(textView4, w7.a6.d(-2, -1.0f, i15 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.oo0 oo0Var3 = new org.telegram.ui.Components.oo0(context);
            oo0Var3.setDelegate(new k20(aVar, 2));
            rg.g gVar3 = aVar.f41455c;
            if (gVar3 == null) {
                f11 = 0.0f;
            } else {
                f11 = gVar3.f41517x;
            }
            oo0Var3.setProgress(f11);
            oo0Var3.setReportChanges(true);
            zdVar.addView(oo0Var3, w7.a6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            org.telegram.messenger.em.r(textView5, org.telegram.ui.ActionBar.j6.w0(null, i20, false), 1, 16.0f, 1);
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
            zdVar.addView(textView5, w7.a6.d(-2, -1.0f, i17 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.oo0 oo0Var4 = new org.telegram.ui.Components.oo0(context);
            oo0Var4.setDelegate(new k20(aVar, 3));
            rg.g gVar4 = aVar.f41455c;
            if (gVar4 == null) {
                f12 = 0.0f;
            } else {
                f12 = gVar4.A / 2.0f;
            }
            oo0Var4.setProgress(f12);
            oo0Var4.setReportChanges(true);
            zdVar.addView(oo0Var4, w7.a6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            textView6.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i21, false));
            textView6.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.w0(null, i22, false)));
            textView6.setOnClickListener(new l20(context, aVar, 1));
            zdVar.addView(textView6, w7.a6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            org.telegram.messenger.em.r(textView7, org.telegram.ui.ActionBar.j6.w0(null, i20, false), 1, 16.0f, 1);
            textView7.setMaxLines(1);
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
            zdVar.addView(textView7, w7.a6.d(-2, -1.0f, i19 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.oo0 oo0Var5 = new org.telegram.ui.Components.oo0(context);
            oo0Var5.setDelegate(new Object());
            oo0Var5.setProgress(zd.f39262b / 2.0f);
            oo0Var5.setReportChanges(true);
            zdVar.addView(oo0Var5, w7.a6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            scrollView.addView(zdVar);
            premiumPreviewFragment.f30289r0.addView(scrollView);
            premiumPreviewFragment.f30289r0.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false));
            premiumPreviewFragment.f30273d0.addView(premiumPreviewFragment.f30289r0, w7.a6.e(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.f30289r0.getLayoutParams()).topMargin = premiumPreviewFragment.f30272c0;
            premiumPreviewFragment.f30289r0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.f30289r0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}
