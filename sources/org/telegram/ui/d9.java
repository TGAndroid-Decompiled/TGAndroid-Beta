package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.CheckBoxBase;
public final class d9 extends FrameLayout {
    public final int f44604a;
    public final org.telegram.ui.Components.x8 f44605b;
    public final ImageView f44606c;
    public final org.telegram.ui.Cells.f6 d;
    public final org.telegram.ui.Components.wo f44607e;
    public Drawable f44608f;
    public Drawable h;

    public d9(Context context, int i3) {
        super(context);
        int i10;
        int L;
        float f10;
        int i11;
        int i12;
        this.f44604a = i3;
        org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, null);
        this.d = f6Var;
        f6Var.N0 = true;
        f6Var.F0 = true;
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = org.telegram.messenger.g0.L(32.0f);
        } else {
            i10 = 0;
        }
        if (org.telegram.messenger.bd.f21784a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(32.0f);
        }
        f6Var.setPadding(i10, 0, L, 0);
        if (org.telegram.messenger.bd.f21784a0) {
            f10 = 2.0f;
        } else {
            f10 = -2.0f;
        }
        f6Var.f29182c0 = org.telegram.messenger.g0.L(f10);
        f6Var.f29183d0 = -org.telegram.messenger.g0.L(7.0f);
        addView(f6Var, b8.mf.c(-1.0f, -1));
        org.telegram.ui.Components.x8 x8Var = new org.telegram.ui.Components.x8(context, false);
        this.f44605b = x8Var;
        x8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        x8Var.setStepFactor(0.4f);
        x8Var.setSize(org.telegram.messenger.g0.L(29.0f));
        x8Var.setCentered(true);
        x8Var.setVisibility(8);
        if (org.telegram.messenger.bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(x8Var, b8.mf.d(72, -1.0f, i11, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f44606c = imageView;
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Wl, null, PorterDuff.Mode.SRC_IN);
        int i13 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i13, false), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131752634, null));
        if (org.telegram.messenger.bd.f21784a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(imageView, b8.mf.d(48, 48.0f, i12 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(21, context, null);
        this.f44607e = woVar;
        CheckBoxBase checkBoxBase = woVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vl, false);
        if (checkBoxBase.f31340x != x02) {
            checkBoxBase.f31340x = x02;
            checkBoxBase.b();
        }
        woVar.b(-1, org.telegram.ui.ActionBar.k6.f27878d6, org.telegram.ui.ActionBar.k6.f28008k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        addView(woVar, b8.mf.d(24, 24.0f, (org.telegram.messenger.bd.f21784a0 ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
