package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.CheckBoxBase;
public final class f9 extends FrameLayout {
    public final int f47725a;
    public final org.telegram.ui.Components.d9 f47726b;
    public final ImageView f47727c;
    public final org.telegram.ui.Cells.g6 d;
    public final org.telegram.ui.Components.lp f47728e;
    public Drawable f47729f;
    public Drawable h;

    public f9(Context context, int i7) {
        super(context);
        int i10;
        int L;
        float f10;
        int i11;
        int i12;
        this.f47725a = i7;
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, null);
        this.d = g6Var;
        g6Var.N0 = true;
        g6Var.F0 = true;
        if (org.telegram.messenger.gd.f24314a0) {
            i10 = org.telegram.messenger.g0.L(32.0f);
        } else {
            i10 = 0;
        }
        if (org.telegram.messenger.gd.f24314a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(32.0f);
        }
        g6Var.setPadding(i10, 0, L, 0);
        if (org.telegram.messenger.gd.f24314a0) {
            f10 = 2.0f;
        } else {
            f10 = -2.0f;
        }
        g6Var.f30762c0 = org.telegram.messenger.g0.L(f10);
        g6Var.f30763d0 = -org.telegram.messenger.g0.L(7.0f);
        addView(g6Var, c8.na.c(-1.0f, -1));
        org.telegram.ui.Components.d9 d9Var = new org.telegram.ui.Components.d9(context, false);
        this.f47726b = d9Var;
        d9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        d9Var.setStepFactor(0.4f);
        d9Var.setSize(org.telegram.messenger.g0.L(29.0f));
        d9Var.setCentered(true);
        d9Var.setVisibility(8);
        if (org.telegram.messenger.gd.f24314a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(d9Var, c8.na.d(72, -1.0f, i11, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f47727c = imageView;
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.Zl, null, PorterDuff.Mode.SRC_IN);
        int i13 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i13, false), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i13);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.gd.N0(2131752622, null));
        if (org.telegram.messenger.gd.f24314a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(imageView, c8.na.d(48, 48.0f, i12 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(21, context, null);
        this.f47728e = lpVar;
        CheckBoxBase checkBoxBase = lpVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yl, false);
        if (checkBoxBase.f32944x != x02) {
            checkBoxBase.f32944x = x02;
            checkBoxBase.b();
        }
        lpVar.b(-1, org.telegram.ui.ActionBar.n6.f29451d6, org.telegram.ui.ActionBar.n6.f29581k7);
        lpVar.setDrawUnchecked(false);
        lpVar.setDrawBackgroundAsArc(3);
        addView(lpVar, c8.na.d(24, 24.0f, (org.telegram.messenger.gd.f24314a0 ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
