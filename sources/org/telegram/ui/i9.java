package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBoxBase;
public final class i9 extends FrameLayout {
    public final int f34843a;
    public final org.telegram.ui.Components.d9 f34844b;
    public final ImageView f34845c;
    public final org.telegram.ui.Cells.g6 d;
    public final org.telegram.ui.Components.kp e;

    public i9(Context context, int i10) {
        super(context);
        int i11;
        int dp;
        float f10;
        int i12;
        int i13;
        this.f34843a = i10;
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, null);
        this.d = g6Var;
        g6Var.J0 = true;
        g6Var.B0 = true;
        if (LocaleController.isRTL) {
            i11 = AndroidUtilities.dp(32.0f);
        } else {
            i11 = 0;
        }
        if (LocaleController.isRTL) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(32.0f);
        }
        g6Var.setPadding(i11, 0, dp, 0);
        if (LocaleController.isRTL) {
            f10 = 2.0f;
        } else {
            f10 = -2.0f;
        }
        g6Var.V = AndroidUtilities.dp(f10);
        g6Var.W = -AndroidUtilities.dp(7.0f);
        addView(g6Var, k7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.d9 d9Var = new org.telegram.ui.Components.d9(context, false);
        this.f34844b = d9Var;
        d9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        d9Var.setStepFactor(0.4f);
        d9Var.setSize(AndroidUtilities.dp(29.0f));
        d9Var.setCentered(true);
        d9Var.setVisibility(8);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(d9Var, k7.b6.d(72, -1.0f, i12, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f34845c = imageView;
        imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.il, false), PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19971i6, false), 1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView, k7.b6.d(48, 48.0f, i13 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(context, 21, null);
        this.e = kpVar;
        CheckBoxBase checkBoxBase = kpVar.getCheckBoxBase();
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hl, false);
        if (checkBoxBase.f22944x != w02) {
            checkBoxBase.f22944x = w02;
            checkBoxBase.b();
        }
        kpVar.b(-1, org.telegram.ui.ActionBar.j6.f19881d6, org.telegram.ui.ActionBar.j6.f20007k7);
        kpVar.setDrawUnchecked(false);
        kpVar.setDrawBackgroundAsArc(3);
        addView(kpVar, k7.b6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
