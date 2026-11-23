package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.CheckBoxBase;
public final class f9 extends FrameLayout {
    public final int f47644a;
    public final org.telegram.ui.Components.e9 f47645b;
    public final ImageView f47646c;
    public final org.telegram.ui.Cells.h6 d;
    public final org.telegram.ui.Components.op f47647e;
    public Drawable f47648f;
    public Drawable h;

    public f9(Context context, int i7) {
        super(context);
        int i10;
        int L;
        float f10;
        int i11;
        int i12;
        this.f47644a = i7;
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
        this.d = h6Var;
        h6Var.N0 = true;
        h6Var.F0 = true;
        if (org.telegram.messenger.hd.f24444a0) {
            i10 = org.telegram.messenger.g0.L(32.0f);
        } else {
            i10 = 0;
        }
        if (org.telegram.messenger.hd.f24444a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(32.0f);
        }
        h6Var.setPadding(i10, 0, L, 0);
        if (org.telegram.messenger.hd.f24444a0) {
            f10 = 2.0f;
        } else {
            f10 = -2.0f;
        }
        h6Var.f30736c0 = org.telegram.messenger.g0.L(f10);
        h6Var.f30737d0 = -org.telegram.messenger.g0.L(7.0f);
        addView(h6Var, c8.ma.c(-1.0f, -1));
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9(context, false);
        this.f47645b = e9Var;
        e9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        e9Var.setStepFactor(0.4f);
        e9Var.setSize(org.telegram.messenger.g0.L(29.0f));
        e9Var.setCentered(true);
        e9Var.setVisibility(8);
        if (org.telegram.messenger.hd.f24444a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(e9Var, c8.ma.d(72, -1.0f, i11, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f47646c = imageView;
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.Zl, null, PorterDuff.Mode.SRC_IN);
        int i13 = org.telegram.ui.ActionBar.m6.f29473i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i13, false), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.hd.N0(2131752622, null));
        if (org.telegram.messenger.hd.f24444a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(imageView, c8.ma.d(48, 48.0f, i12 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.op opVar = new org.telegram.ui.Components.op(21, context, null);
        this.f47647e = opVar;
        CheckBoxBase checkBoxBase = opVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yl, false);
        if (checkBoxBase.f32880x != x02) {
            checkBoxBase.f32880x = x02;
            checkBoxBase.b();
        }
        opVar.b(-1, org.telegram.ui.ActionBar.m6.f29381d6, org.telegram.ui.ActionBar.m6.f29511k7);
        opVar.setDrawUnchecked(false);
        opVar.setDrawBackgroundAsArc(3);
        addView(opVar, c8.ma.d(24, 24.0f, (org.telegram.messenger.hd.f24444a0 ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
