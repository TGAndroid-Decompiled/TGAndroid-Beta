package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.CheckBoxBase;
public final class e9 extends FrameLayout {
    public final int f46637a;
    public final org.telegram.ui.Components.w8 f46638b;
    public final ImageView f46639c;
    public final org.telegram.ui.Cells.f6 d;
    public final org.telegram.ui.Components.fp f46640e;
    public Drawable f46641f;
    public Drawable h;

    public e9(Context context, int i7) {
        super(context);
        int i10;
        int L;
        float f10;
        int i11;
        int i12;
        this.f46637a = i7;
        org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, null);
        this.d = f6Var;
        f6Var.N0 = true;
        f6Var.F0 = true;
        if (org.telegram.messenger.hd.f24104a0) {
            i10 = org.telegram.messenger.g0.L(32.0f);
        } else {
            i10 = 0;
        }
        if (org.telegram.messenger.hd.f24104a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(32.0f);
        }
        f6Var.setPadding(i10, 0, L, 0);
        if (org.telegram.messenger.hd.f24104a0) {
            f10 = 2.0f;
        } else {
            f10 = -2.0f;
        }
        f6Var.f30241c0 = org.telegram.messenger.g0.L(f10);
        f6Var.f30242d0 = -org.telegram.messenger.g0.L(7.0f);
        addView(f6Var, c8.ja.c(-1.0f, -1));
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(context, false);
        this.f46638b = w8Var;
        w8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        w8Var.setStepFactor(0.4f);
        w8Var.setSize(org.telegram.messenger.g0.L(29.0f));
        w8Var.setCentered(true);
        w8Var.setVisibility(8);
        if (org.telegram.messenger.hd.f24104a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(w8Var, c8.ja.d(72, -1.0f, i11, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f46639c = imageView;
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.Zl, null, PorterDuff.Mode.SRC_IN);
        int i13 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i13, false), 1, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i13);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, M, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131752634, null));
        if (org.telegram.messenger.hd.f24104a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(imageView, c8.ja.d(48, 48.0f, i12 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.fp fpVar = new org.telegram.ui.Components.fp(21, context, null);
        this.f46640e = fpVar;
        CheckBoxBase checkBoxBase = fpVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Yl, false);
        if (checkBoxBase.f32447x != x02) {
            checkBoxBase.f32447x = x02;
            checkBoxBase.b();
        }
        fpVar.b(-1, org.telegram.ui.ActionBar.j6.f28849d6, org.telegram.ui.ActionBar.j6.f28979k7);
        fpVar.setDrawUnchecked(false);
        fpVar.setDrawBackgroundAsArc(3);
        addView(fpVar, c8.ja.d(24, 24.0f, (org.telegram.messenger.hd.f24104a0 ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
