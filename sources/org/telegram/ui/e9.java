package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.CheckBoxBase;
public final class e9 extends FrameLayout {
    public final int f45336a;
    public final org.telegram.ui.Components.z8 f45337b;
    public final ImageView f45338c;
    public final org.telegram.ui.Cells.g6 d;
    public final org.telegram.ui.Components.wo f45339e;
    public Drawable f45340f;
    public Drawable h;

    public e9(Context context, int i7) {
        super(context);
        int i10;
        int L;
        float f10;
        int i11;
        int i12;
        this.f45336a = i7;
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, null);
        this.d = g6Var;
        g6Var.M0 = true;
        g6Var.E0 = true;
        if (org.telegram.messenger.id.f23157a0) {
            i10 = org.telegram.messenger.g0.L(32.0f);
        } else {
            i10 = 0;
        }
        if (org.telegram.messenger.id.f23157a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(32.0f);
        }
        g6Var.setPadding(i10, 0, L, 0);
        if (org.telegram.messenger.id.f23157a0) {
            f10 = 2.0f;
        } else {
            f10 = -2.0f;
        }
        g6Var.f29152b0 = org.telegram.messenger.g0.L(f10);
        g6Var.f29153c0 = -org.telegram.messenger.g0.L(7.0f);
        addView(g6Var, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(context, false);
        this.f45337b = z8Var;
        z8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        z8Var.setStepFactor(0.4f);
        z8Var.setSize(org.telegram.messenger.g0.L(29.0f));
        z8Var.setCentered(true);
        z8Var.setVisibility(8);
        if (org.telegram.messenger.id.f23157a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(z8Var, c8.ha.d(72, -1.0f, i11, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f45338c = imageView;
        org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.Wl, null, PorterDuff.Mode.SRC_IN);
        int i13 = org.telegram.ui.ActionBar.l6.f27957i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i13, false), 1, -1);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i13);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(imageView, h02, null, M, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131752634, null));
        if (org.telegram.messenger.id.f23157a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(imageView, c8.ha.d(48, 48.0f, i12 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(21, context, null);
        this.f45339e = woVar;
        CheckBoxBase checkBoxBase = woVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Vl, false);
        if (checkBoxBase.f31274x != x02) {
            checkBoxBase.f31274x = x02;
            checkBoxBase.b();
        }
        woVar.b(-1, org.telegram.ui.ActionBar.l6.f27865d6, org.telegram.ui.ActionBar.l6.f27995k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        addView(woVar, c8.ha.d(24, 24.0f, (org.telegram.messenger.id.f23157a0 ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
