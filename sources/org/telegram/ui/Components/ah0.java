package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.HashMap;
public class ah0 extends org.telegram.ui.ActionBar.w2 {
    public final Bitmap f33522m1;
    public final TextView n1;
    public final TextView f33523o1;
    public final TextView f33524p1;
    public final int f33525q1;
    public final rh0 f33526r1;
    public boolean f33527s1;
    public int f33528t1;

    public ah0(Context context, String str, String str2, String str3, boolean z10) {
        super(1, context, (org.telegram.ui.ActionBar.h6) null, false);
        Bitmap bitmap;
        O();
        this.P = str;
        this.Q = true;
        kg.k kVar = new kg.k(context, 2);
        kVar.setScaleType(ImageView.ScaleType.FIT_XY);
        kVar.setOutlineProvider(new bg.q0(14));
        kVar.setClipToOutline(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        Bitmap bitmap2 = this.f33522m1;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(bc.b.f3130a, gc.b.M);
            hashMap.put(bc.b.f3132c, 0);
            ji.s sVar = new ji.s(1);
            bitmap = sVar.a(str2, 768, 768, hashMap, bitmap2, 1.0f, -1, -16777216);
            this.f33525q1 = sVar.f18086e;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            bitmap = null;
        }
        this.f33522m1 = bitmap;
        kVar.setImageBitmap(bitmap);
        ?? imageView = new ImageView(context);
        this.f33526r1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setBackgroundColor(-1);
        org.telegram.ui.ej0 ej0Var = new org.telegram.ui.ej0(this, context, kVar);
        ej0Var.addView(kVar, c8.ma.c(-1.0f, -1));
        ej0Var.addView((View) imageView, c8.ma.e(60, 60, 17));
        linearLayout.addView(ej0Var, c8.ma.t(220, 220, 1, 30, 0, 30, 0));
        TextView textView = new TextView(context);
        this.n1 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setText(str3);
        textView.setGravity(1);
        linearLayout.addView(textView, c8.ma.d(-1, -2.0f, 0, 40.0f, 8.0f, 40.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.f33523o1 = textView2;
        textView2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(org.telegram.messenger.hd.N0(2131745252, null));
        textView2.setOnClickListener(new m8(22, this, context));
        linearLayout.addView(textView2, c8.ma.t(-1, 48, 80, 16, 15, 16, 3));
        if (z10) {
            TextView textView3 = new TextView(context);
            this.f33524p1 = textView3;
            textView3.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setText(org.telegram.messenger.hd.N0(2131745262, null));
            textView3.setOnClickListener(new m8(23, str2, context));
            linearLayout.addView(textView3, c8.ma.t(-1, 48, 80, 16, 3, 16, 16));
        }
        updateColors();
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayout);
        this.O = scrollView;
    }

    public final void J0() {
        rh0 rh0Var = this.f33526r1;
        rh0Var.setAutoRepeat(true);
        rh0Var.f(2131624168, 60, 60, null);
        rh0Var.d();
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int i7 = org.telegram.ui.ActionBar.m6.Ji;
            int i10 = org.telegram.ui.ActionBar.m6.Fi;
            int w02 = (org.telegram.ui.ActionBar.m6.w0(i10, this.J0) * 17) + (org.telegram.ui.ActionBar.m6.w0(i7, this.J0) * 31);
            int i11 = org.telegram.ui.ActionBar.m6.Hi;
            int w03 = (org.telegram.ui.ActionBar.m6.w0(i11, this.J0) * 13) + w02;
            int i12 = org.telegram.ui.ActionBar.m6.f29473i6;
            int w04 = (org.telegram.ui.ActionBar.m6.w0(i12, this.J0) * 7) + w03;
            int i13 = org.telegram.ui.ActionBar.m6.f29773y6;
            int w05 = (org.telegram.ui.ActionBar.m6.w0(i13, this.J0) * 5) + w04;
            int i14 = org.telegram.ui.ActionBar.m6.G6;
            int w06 = (org.telegram.ui.ActionBar.m6.w0(i14, this.J0) * 3) + w05;
            int i15 = org.telegram.ui.ActionBar.m6.f29454h5;
            int w07 = w06 + org.telegram.ui.ActionBar.m6.w0(i15, this.J0);
            if (this.f33527s1 && w07 == this.f33528t1) {
                return;
            }
            this.f33527s1 = true;
            this.f33528t1 = w07;
            TextView textView = this.f33523o1;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, this.J0));
                org.telegram.ui.ActionBar.m6.H1(textView.getBackground(), org.telegram.ui.ActionBar.m6.w0(i10, this.J0), false);
                org.telegram.ui.ActionBar.m6.H1(textView.getBackground(), org.telegram.ui.ActionBar.m6.w0(i11, this.J0), true);
            }
            TextView textView2 = this.f33524p1;
            if (textView2 != null) {
                textView2.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, this.J0));
                org.telegram.ui.ActionBar.m6.H1(textView2.getBackground(), i0.a.o(org.telegram.ui.ActionBar.m6.w0(i10, this.J0), Math.min(255, Color.alpha(org.telegram.ui.ActionBar.m6.w0(i12, this.J0)) * 2)), true);
            }
            TextView textView3 = this.n1;
            if (textView3 != null) {
                textView3.setTextColor(org.telegram.ui.ActionBar.m6.w0(i13, this.J0));
            }
            org.telegram.ui.ActionBar.n2 n2Var = this.m0;
            if (n2Var != null) {
                n2Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(i14, this.J0));
            }
            v0(org.telegram.ui.ActionBar.m6.w0(i15, this.J0));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void updateColors() {
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ji, this.J0);
        TextView textView = this.f33523o1;
        textView.setTextColor(w02);
        int L = org.telegram.messenger.g0.L(24.0f);
        int i7 = org.telegram.ui.ActionBar.m6.Fi;
        int w03 = org.telegram.ui.ActionBar.m6.w0(i7, this.J0);
        int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Hi, this.J0);
        textView.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w03, w04, w04));
        TextView textView2 = this.f33524p1;
        if (textView2 != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, this.J0));
            textView2.setBackground(org.telegram.ui.ActionBar.m6.h0(i0.a.o(org.telegram.ui.ActionBar.m6.w0(i7, this.J0), Math.min(255, Color.alpha(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29473i6, this.J0)) * 2)), 7, -1));
        }
        int i10 = org.telegram.ui.ActionBar.m6.f29773y6;
        int w05 = org.telegram.ui.ActionBar.m6.w0(i10, this.J0);
        TextView textView3 = this.n1;
        textView3.setTextColor(w05);
        textView3.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, this.J0));
        org.telegram.ui.ActionBar.n2 n2Var = this.m0;
        if (n2Var != null) {
            n2Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.J0));
        }
        v0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, this.J0));
    }
}
