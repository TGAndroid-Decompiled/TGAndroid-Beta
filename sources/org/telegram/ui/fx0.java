package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
public final class fx0 extends sg.n {
    public final Context f37715f0;
    public final jx0 f37716g0;

    public fx0(jx0 jx0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.f37716g0 = jx0Var;
        this.f37715f0 = context2;
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
        jx0 jx0Var = this.f37716g0;
        PremiumPreviewFragment premiumPreviewFragment = jx0Var.f39042n;
        if (premiumPreviewFragment.f34148r0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.f37715f0;
            premiumPreviewFragment.f34148r0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            sg.g gVar = jx0Var.d.f48078b;
            yd ydVar = new yd(context, 5);
            ydVar.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i20 = org.telegram.ui.ActionBar.i6.f20981n5;
            org.telegram.messenger.bi.u(textView, org.telegram.ui.ActionBar.i6.x0(null, i20, false), 1, 16.0f, 1);
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
            ydVar.addView(textView, w7.x5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i11 | 48));
            org.telegram.ui.Components.kp0 kp0Var = new org.telegram.ui.Components.kp0(context);
            kp0Var.setDelegate(new h20(gVar, 0));
            sg.o oVar = gVar.f48042c;
            float f12 = 0.0f;
            if (oVar == null) {
                f7 = 0.0f;
            } else {
                f7 = oVar.B / 2.0f;
            }
            kp0Var.setProgress(f7);
            kp0Var.setReportChanges(true);
            ydVar.addView(kp0Var, w7.x5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            org.telegram.messenger.bi.u(textView2, org.telegram.ui.ActionBar.i6.x0(null, i20, false), 1, 16.0f, 1);
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
            ydVar.addView(textView2, w7.x5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i13 | 48));
            org.telegram.ui.Components.kp0 kp0Var2 = new org.telegram.ui.Components.kp0(context);
            kp0Var2.setDelegate(new h20(gVar, 1));
            sg.o oVar2 = gVar.f48042c;
            if (oVar2 == null) {
                f10 = 0.0f;
            } else {
                f10 = oVar2.C / 2.0f;
            }
            kp0Var2.setProgress(f10);
            kp0Var2.setReportChanges(true);
            ydVar.addView(kp0Var2, w7.x5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            TextView textView3 = new TextView(context);
            textView3.setText("Setup spec color");
            textView3.setTextSize(1, 16.0f);
            textView3.setLines(1);
            textView3.setGravity(17);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            int i21 = org.telegram.ui.ActionBar.i6.Sh;
            textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i21, false));
            int i22 = org.telegram.ui.ActionBar.i6.Oh;
            textView3.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.x0(null, i22, false)));
            textView3.setOnClickListener(new i20(context, gVar, 0));
            ydVar.addView(textView3, w7.x5.a(48.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 16));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            org.telegram.messenger.bi.u(textView4, org.telegram.ui.ActionBar.i6.x0(null, i20, false), 1, 16.0f, 1);
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
            ydVar.addView(textView4, w7.x5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i15 | 48));
            org.telegram.ui.Components.kp0 kp0Var3 = new org.telegram.ui.Components.kp0(context);
            kp0Var3.setDelegate(new h20(gVar, 2));
            sg.o oVar3 = gVar.f48042c;
            if (oVar3 == null) {
                f11 = 0.0f;
            } else {
                f11 = oVar3.D;
            }
            kp0Var3.setProgress(f11);
            kp0Var3.setReportChanges(true);
            ydVar.addView(kp0Var3, w7.x5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            org.telegram.messenger.bi.u(textView5, org.telegram.ui.ActionBar.i6.x0(null, i20, false), 1, 16.0f, 1);
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
            ydVar.addView(textView5, w7.x5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i17 | 48));
            org.telegram.ui.Components.kp0 kp0Var4 = new org.telegram.ui.Components.kp0(context);
            kp0Var4.setDelegate(new h20(gVar, 3));
            sg.o oVar4 = gVar.f48042c;
            if (oVar4 != null) {
                f12 = oVar4.G / 2.0f;
            }
            kp0Var4.setProgress(f12);
            kp0Var4.setReportChanges(true);
            ydVar.addView(kp0Var4, w7.x5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            textView6.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i21, false));
            textView6.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.x0(null, i22, false)));
            textView6.setOnClickListener(new i20(context, gVar, 1));
            ydVar.addView(textView6, w7.x5.a(48.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 16));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            org.telegram.messenger.bi.u(textView7, org.telegram.ui.ActionBar.i6.x0(null, i20, false), 1, 16.0f, 1);
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
            ydVar.addView(textView7, w7.x5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i19 | 48));
            org.telegram.ui.Components.kp0 kp0Var5 = new org.telegram.ui.Components.kp0(context);
            kp0Var5.setDelegate(new Object());
            kp0Var5.setProgress(yd.f44318b / 2.0f);
            kp0Var5.setReportChanges(true);
            ydVar.addView(kp0Var5, w7.x5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
            scrollView.addView(ydVar);
            premiumPreviewFragment.f34148r0.addView(scrollView);
            premiumPreviewFragment.f34148r0.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false));
            premiumPreviewFragment.f34131d0.addView(premiumPreviewFragment.f34148r0, w7.x5.e(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.f34148r0.getLayoutParams()).topMargin = premiumPreviewFragment.f34130c0;
            premiumPreviewFragment.f34148r0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.f34148r0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}
