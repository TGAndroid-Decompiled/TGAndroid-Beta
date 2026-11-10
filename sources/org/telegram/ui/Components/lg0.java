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
public class lg0 extends org.telegram.ui.ActionBar.w2 {
    public final Bitmap l1;
    public final TextView f35669m1;
    public final TextView n1;
    public final TextView f35670o1;
    public final int f35671p1;
    public final ch0 f35672q1;
    public boolean f35673r1;
    public int f35674s1;

    public lg0(Context context, String str, String str2, String str3, boolean z9) {
        super(1, context, (org.telegram.ui.ActionBar.h6) null, false);
        Bitmap bitmap;
        N();
        this.O = str;
        this.P = true;
        kg.k kVar = new kg.k(context, 3);
        kVar.setScaleType(ImageView.ScaleType.FIT_XY);
        kVar.setOutlineProvider(new bg.q0(14));
        kVar.setClipToOutline(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        Bitmap bitmap2 = this.l1;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(bc.b.f3158a, gc.b.M);
            hashMap.put(bc.b.f3160c, 0);
            org.telegram.messenger.xz xzVar = new org.telegram.messenger.xz();
            bitmap = xzVar.a(str2, 768, 768, hashMap, bitmap2, 1.0f, -1, -16777216);
            this.f35671p1 = xzVar.f26567f;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            bitmap = null;
        }
        this.l1 = bitmap;
        kVar.setImageBitmap(bitmap);
        ?? imageView = new ImageView(context);
        this.f35672q1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setBackgroundColor(-1);
        org.telegram.ui.bj0 bj0Var = new org.telegram.ui.bj0(this, context, kVar);
        bj0Var.addView(kVar, c8.ha.c(-1.0f, -1));
        bj0Var.addView((View) imageView, c8.ha.e(60, 60, 17));
        linearLayout.addView(bj0Var, c8.ha.t(220, 220, 1, 30, 0, 30, 0));
        TextView textView = new TextView(context);
        this.f35669m1 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setText(str3);
        textView.setGravity(1);
        linearLayout.addView(textView, c8.ha.d(-1, -2.0f, 0, 40.0f, 8.0f, 40.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.n1 = textView2;
        textView2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(org.telegram.messenger.id.M0(2131745448, null));
        textView2.setOnClickListener(new kk(20, this, context));
        linearLayout.addView(textView2, c8.ha.t(-1, 48, 80, 16, 15, 16, 3));
        if (z9) {
            TextView textView3 = new TextView(context);
            this.f35670o1 = textView3;
            textView3.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setText(org.telegram.messenger.id.M0(2131745458, null));
            textView3.setOnClickListener(new kk(21, str2, context));
            linearLayout.addView(textView3, c8.ha.t(-1, 48, 80, 16, 3, 16, 16));
        }
        updateColors();
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayout);
        this.N = scrollView;
    }

    public final void I0() {
        ch0 ch0Var = this.f35672q1;
        ch0Var.setAutoRepeat(true);
        ch0Var.f(2131624167, 60, 60, null);
        ch0Var.d();
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int i7 = org.telegram.ui.ActionBar.m6.Gi;
            int i10 = org.telegram.ui.ActionBar.m6.Ci;
            int w02 = (org.telegram.ui.ActionBar.m6.w0(i10, this.I0) * 17) + (org.telegram.ui.ActionBar.m6.w0(i7, this.I0) * 31);
            int i11 = org.telegram.ui.ActionBar.m6.Ei;
            int w03 = (org.telegram.ui.ActionBar.m6.w0(i11, this.I0) * 13) + w02;
            int i12 = org.telegram.ui.ActionBar.m6.f27982i6;
            int w04 = (org.telegram.ui.ActionBar.m6.w0(i12, this.I0) * 7) + w03;
            int i13 = org.telegram.ui.ActionBar.m6.f28282y6;
            int w05 = (org.telegram.ui.ActionBar.m6.w0(i13, this.I0) * 5) + w04;
            int i14 = org.telegram.ui.ActionBar.m6.G6;
            int w06 = (org.telegram.ui.ActionBar.m6.w0(i14, this.I0) * 3) + w05;
            int i15 = org.telegram.ui.ActionBar.m6.f27963h5;
            int w07 = w06 + org.telegram.ui.ActionBar.m6.w0(i15, this.I0);
            if (this.f35673r1 && w07 == this.f35674s1) {
                return;
            }
            this.f35673r1 = true;
            this.f35674s1 = w07;
            TextView textView = this.n1;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, this.I0));
                org.telegram.ui.ActionBar.m6.H1(textView.getBackground(), org.telegram.ui.ActionBar.m6.w0(i10, this.I0), false);
                org.telegram.ui.ActionBar.m6.H1(textView.getBackground(), org.telegram.ui.ActionBar.m6.w0(i11, this.I0), true);
            }
            TextView textView2 = this.f35670o1;
            if (textView2 != null) {
                textView2.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, this.I0));
                org.telegram.ui.ActionBar.m6.H1(textView2.getBackground(), i0.a.o(org.telegram.ui.ActionBar.m6.w0(i10, this.I0), Math.min(255, Color.alpha(org.telegram.ui.ActionBar.m6.w0(i12, this.I0)) * 2)), true);
            }
            TextView textView3 = this.f35669m1;
            if (textView3 != null) {
                textView3.setTextColor(org.telegram.ui.ActionBar.m6.w0(i13, this.I0));
            }
            org.telegram.ui.ActionBar.n2 n2Var = this.f28695l0;
            if (n2Var != null) {
                n2Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(i14, this.I0));
            }
            v0(org.telegram.ui.ActionBar.m6.w0(i15, this.I0));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void updateColors() {
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Gi, this.I0);
        TextView textView = this.n1;
        textView.setTextColor(w02);
        int L = org.telegram.messenger.g0.L(24.0f);
        int i7 = org.telegram.ui.ActionBar.m6.Ci;
        int w03 = org.telegram.ui.ActionBar.m6.w0(i7, this.I0);
        int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ei, this.I0);
        textView.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w03, w04, w04));
        TextView textView2 = this.f35670o1;
        if (textView2 != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, this.I0));
            textView2.setBackground(org.telegram.ui.ActionBar.m6.h0(i0.a.o(org.telegram.ui.ActionBar.m6.w0(i7, this.I0), Math.min(255, Color.alpha(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27982i6, this.I0)) * 2)), 7, -1));
        }
        int i10 = org.telegram.ui.ActionBar.m6.f28282y6;
        int w05 = org.telegram.ui.ActionBar.m6.w0(i10, this.I0);
        TextView textView3 = this.f35669m1;
        textView3.setTextColor(w05);
        textView3.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, this.I0));
        org.telegram.ui.ActionBar.n2 n2Var = this.f28695l0;
        if (n2Var != null) {
            n2Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.I0));
        }
        v0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, this.I0));
    }
}
