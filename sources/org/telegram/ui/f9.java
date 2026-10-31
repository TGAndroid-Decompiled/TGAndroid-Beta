package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.CheckBoxBase;
public final class f9 extends FrameLayout {
    public final int f37211a;
    public final org.telegram.ui.Components.u8 f37212b;
    public final ImageView f37213c;
    public final org.telegram.ui.Cells.k6 d;
    public final org.telegram.ui.Components.ep e;
    public Drawable f37214f;
    public Drawable h;

    public f9(Context context, int i10) {
        super(context);
        int i11;
        int L;
        float f7;
        int i12;
        int i13;
        this.f37211a = i10;
        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, null);
        this.d = k6Var;
        k6Var.M0 = true;
        k6Var.E0 = true;
        if (org.telegram.messenger.cd.X) {
            i11 = org.telegram.messenger.i0.L(32.0f);
        } else {
            i11 = 0;
        }
        if (org.telegram.messenger.cd.X) {
            L = 0;
        } else {
            L = org.telegram.messenger.i0.L(32.0f);
        }
        k6Var.setPadding(i11, 0, L, 0);
        if (org.telegram.messenger.cd.X) {
            f7 = 2.0f;
        } else {
            f7 = -2.0f;
        }
        k6Var.f22124b0 = org.telegram.messenger.i0.L(f7);
        k6Var.f22125c0 = -org.telegram.messenger.i0.L(7.0f);
        addView(k6Var, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(context, false);
        this.f37212b = u8Var;
        u8Var.setAvatarsTextSize(org.telegram.messenger.i0.L(18.0f));
        u8Var.setStepFactor(0.4f);
        u8Var.setSize(org.telegram.messenger.i0.L(29.0f));
        u8Var.setCentered(true);
        u8Var.setVisibility(8);
        if (org.telegram.messenger.cd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(u8Var, w7.b6.d(72, -1.0f, i12, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f37213c = imageView;
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.Wl, null, PorterDuff.Mode.SRC_IN);
        int i14 = org.telegram.ui.ActionBar.t6.f21020i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i14, false), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i14);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.cd.L0(2131752634, null));
        if (org.telegram.messenger.cd.X) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView, w7.b6.d(48, 48.0f, i13 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.ep epVar = new org.telegram.ui.Components.ep(21, context, null);
        this.e = epVar;
        CheckBoxBase checkBoxBase = epVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vl, false);
        if (checkBoxBase.f23925x != x02) {
            checkBoxBase.f23925x = x02;
            checkBoxBase.b();
        }
        epVar.b(-1, org.telegram.ui.ActionBar.t6.f20929d6, org.telegram.ui.ActionBar.t6.f21059k7);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(3);
        addView(epVar, w7.b6.d(24, 24.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
