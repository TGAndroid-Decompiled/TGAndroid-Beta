package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
public final class aw0 extends dg.i {
    public final Context U;
    public final ew0 V;

    public aw0(ew0 ew0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.V = ew0Var;
        this.U = context2;
    }

    @Override
    public final void g() {
        int i10;
        int i11;
        float f9;
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
        ew0 ew0Var = this.V;
        PremiumPreviewFragment premiumPreviewFragment = ew0Var.f37915n;
        if (premiumPreviewFragment.f35923n0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.U;
            premiumPreviewFragment.f35923n0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            dg.a aVar = ew0Var.d.f5590b;
            bg.y3 y3Var = new bg.y3(context, 8);
            y3Var.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i19 = org.telegram.ui.ActionBar.g6.f23240n5;
            b.r(textView, org.telegram.ui.ActionBar.g6.w0(null, i19, false), 1, 16.0f, 1);
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
            y3Var.addView(textView, i7.f6.d(-2, -1.0f, i11 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.ao0 ao0Var = new org.telegram.ui.Components.ao0(context);
            ao0Var.setDelegate(new s10(aVar, 0));
            dg.j jVar = aVar.f5551c;
            if (jVar == null) {
                f9 = 0.0f;
            } else {
                f9 = jVar.v / 2.0f;
            }
            ao0Var.setProgress(f9);
            ao0Var.setReportChanges(true);
            y3Var.addView(ao0Var, i7.f6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            b.r(textView2, org.telegram.ui.ActionBar.g6.w0(null, i19, false), 1, 16.0f, 1);
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
            y3Var.addView(textView2, i7.f6.d(-2, -1.0f, i13 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.ao0 ao0Var2 = new org.telegram.ui.Components.ao0(context);
            ao0Var2.setDelegate(new s10(aVar, 1));
            dg.j jVar2 = aVar.f5551c;
            if (jVar2 == null) {
                f10 = 0.0f;
            } else {
                f10 = jVar2.f5623w / 2.0f;
            }
            ao0Var2.setProgress(f10);
            ao0Var2.setReportChanges(true);
            y3Var.addView(ao0Var2, i7.f6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setText("Setup spec color");
            textView3.setTextSize(1, 16.0f);
            textView3.setLines(1);
            textView3.setGravity(17);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            int i20 = org.telegram.ui.ActionBar.g6.Sh;
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
            int i21 = org.telegram.ui.ActionBar.g6.Oh;
            textView3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.w0(null, i21, false)));
            textView3.setOnClickListener(new t10(context, aVar, 0));
            y3Var.addView(textView3, i7.f6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            b.r(textView4, org.telegram.ui.ActionBar.g6.w0(null, i19, false), 1, 16.0f, 1);
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
            y3Var.addView(textView4, i7.f6.d(-2, -1.0f, i15 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.ao0 ao0Var3 = new org.telegram.ui.Components.ao0(context);
            ao0Var3.setDelegate(new s10(aVar, 2));
            dg.j jVar3 = aVar.f5551c;
            if (jVar3 == null) {
                f11 = 0.0f;
            } else {
                f11 = jVar3.f5624x;
            }
            ao0Var3.setProgress(f11);
            ao0Var3.setReportChanges(true);
            y3Var.addView(ao0Var3, i7.f6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            b.r(textView5, org.telegram.ui.ActionBar.g6.w0(null, i19, false), 1, 16.0f, 1);
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
            y3Var.addView(textView5, i7.f6.d(-2, -1.0f, i17 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.ao0 ao0Var4 = new org.telegram.ui.Components.ao0(context);
            int i22 = 3;
            ao0Var4.setDelegate(new s10(aVar, 3));
            dg.j jVar4 = aVar.f5551c;
            if (jVar4 == null) {
                f12 = 0.0f;
            } else {
                f12 = jVar4.A / 2.0f;
            }
            ao0Var4.setProgress(f12);
            ao0Var4.setReportChanges(true);
            y3Var.addView(ao0Var4, i7.f6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            textView6.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
            textView6.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.w0(null, i21, false)));
            textView6.setOnClickListener(new t10(context, aVar, 1));
            y3Var.addView(textView6, i7.f6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            b.r(textView7, org.telegram.ui.ActionBar.g6.w0(null, i19, false), 1, 16.0f, 1);
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
            y3Var.addView(textView7, i7.f6.d(-2, -1.0f, i22 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.ao0 ao0Var5 = new org.telegram.ui.Components.ao0(context);
            ao0Var5.setDelegate(new f7.v(17));
            ao0Var5.setProgress(bg.y3.f2630b / 2.0f);
            ao0Var5.setReportChanges(true);
            y3Var.addView(ao0Var5, i7.f6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            scrollView.addView(y3Var);
            premiumPreviewFragment.f35923n0.addView(scrollView);
            premiumPreviewFragment.f35923n0.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false));
            premiumPreviewFragment.Z.addView(premiumPreviewFragment.f35923n0, i7.f6.e(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.f35923n0.getLayoutParams()).topMargin = premiumPreviewFragment.Y;
            premiumPreviewFragment.f35923n0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.f35923n0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}
