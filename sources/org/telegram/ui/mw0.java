package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
public final class mw0 extends gg.i {
    public final Context V;
    public final qw0 W;

    public mw0(qw0 qw0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.W = qw0Var;
        this.V = context2;
    }

    @Override
    public final void g() {
        int i10;
        int i11;
        float f10;
        int i12;
        int i13;
        float f11;
        int i14;
        int i15;
        float f12;
        int i16;
        int i17;
        float f13;
        int i18;
        qw0 qw0Var = this.W;
        PremiumPreviewFragment premiumPreviewFragment = qw0Var.f40712n;
        if (premiumPreviewFragment.f34499o0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.V;
            premiumPreviewFragment.f34499o0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            gg.a aVar = qw0Var.d.f7087b;
            eg.s3 s3Var = new eg.s3(context, 8);
            s3Var.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i19 = org.telegram.ui.ActionBar.k6.f21838n5;
            b.q(textView, org.telegram.ui.ActionBar.k6.w0(null, i19, false), 1, 16.0f, 1);
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
            s3Var.addView(textView, k7.c6.d(-2, -1.0f, i11 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.lo0 lo0Var = new org.telegram.ui.Components.lo0(context);
            lo0Var.setDelegate(new f20(aVar, 0));
            gg.j jVar = aVar.f7048c;
            if (jVar == null) {
                f10 = 0.0f;
            } else {
                f10 = jVar.v / 2.0f;
            }
            lo0Var.setProgress(f10);
            lo0Var.setReportChanges(true);
            s3Var.addView(lo0Var, k7.c6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            b.q(textView2, org.telegram.ui.ActionBar.k6.w0(null, i19, false), 1, 16.0f, 1);
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
            s3Var.addView(textView2, k7.c6.d(-2, -1.0f, i13 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.lo0 lo0Var2 = new org.telegram.ui.Components.lo0(context);
            lo0Var2.setDelegate(new f20(aVar, 1));
            gg.j jVar2 = aVar.f7048c;
            if (jVar2 == null) {
                f11 = 0.0f;
            } else {
                f11 = jVar2.f7120w / 2.0f;
            }
            lo0Var2.setProgress(f11);
            lo0Var2.setReportChanges(true);
            s3Var.addView(lo0Var2, k7.c6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setText("Setup spec color");
            textView3.setTextSize(1, 16.0f);
            textView3.setLines(1);
            textView3.setGravity(17);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            int i20 = org.telegram.ui.ActionBar.k6.Sh;
            textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i20, false));
            int i21 = org.telegram.ui.ActionBar.k6.Oh;
            textView3.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.w0(null, i21, false)));
            textView3.setOnClickListener(new g20(context, aVar, 0));
            s3Var.addView(textView3, k7.c6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            b.q(textView4, org.telegram.ui.ActionBar.k6.w0(null, i19, false), 1, 16.0f, 1);
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
            s3Var.addView(textView4, k7.c6.d(-2, -1.0f, i15 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.lo0 lo0Var3 = new org.telegram.ui.Components.lo0(context);
            lo0Var3.setDelegate(new f20(aVar, 2));
            gg.j jVar3 = aVar.f7048c;
            if (jVar3 == null) {
                f12 = 0.0f;
            } else {
                f12 = jVar3.f7121x;
            }
            lo0Var3.setProgress(f12);
            lo0Var3.setReportChanges(true);
            s3Var.addView(lo0Var3, k7.c6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            b.q(textView5, org.telegram.ui.ActionBar.k6.w0(null, i19, false), 1, 16.0f, 1);
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
            s3Var.addView(textView5, k7.c6.d(-2, -1.0f, i17 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.lo0 lo0Var4 = new org.telegram.ui.Components.lo0(context);
            int i22 = 3;
            lo0Var4.setDelegate(new f20(aVar, 3));
            gg.j jVar4 = aVar.f7048c;
            if (jVar4 == null) {
                f13 = 0.0f;
            } else {
                f13 = jVar4.A / 2.0f;
            }
            lo0Var4.setProgress(f13);
            lo0Var4.setReportChanges(true);
            s3Var.addView(lo0Var4, k7.c6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            textView6.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i20, false));
            textView6.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.w0(null, i21, false)));
            textView6.setOnClickListener(new g20(context, aVar, 1));
            s3Var.addView(textView6, k7.c6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            b.q(textView7, org.telegram.ui.ActionBar.k6.w0(null, i19, false), 1, 16.0f, 1);
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
            s3Var.addView(textView7, k7.c6.d(-2, -1.0f, i22 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.lo0 lo0Var5 = new org.telegram.ui.Components.lo0(context);
            lo0Var5.setDelegate(new cb.b(16));
            lo0Var5.setProgress(eg.s3.f5476b / 2.0f);
            lo0Var5.setReportChanges(true);
            s3Var.addView(lo0Var5, k7.c6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            scrollView.addView(s3Var);
            premiumPreviewFragment.f34499o0.addView(scrollView);
            premiumPreviewFragment.f34499o0.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21731h5, false));
            premiumPreviewFragment.f34481a0.addView(premiumPreviewFragment.f34499o0, k7.c6.e(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.f34499o0.getLayoutParams()).topMargin = premiumPreviewFragment.Z;
            premiumPreviewFragment.f34499o0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.f34499o0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}
