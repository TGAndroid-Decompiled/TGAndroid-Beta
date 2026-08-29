package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBoxBase;
public final class c9 extends FrameLayout {
    public final int f37042a;
    public final org.telegram.ui.Components.h9 f37043b;
    public final ImageView f37044c;
    public final org.telegram.ui.Cells.f6 d;
    public final org.telegram.ui.Components.hp f37045e;

    public c9(Context context, int i10) {
        super(context);
        int i11;
        int dp;
        float f9;
        int i12;
        int i13;
        this.f37042a = i10;
        org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, null);
        this.d = f6Var;
        f6Var.I0 = true;
        f6Var.A0 = true;
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
        f6Var.setPadding(i11, 0, dp, 0);
        if (LocaleController.isRTL) {
            f9 = 2.0f;
        } else {
            f9 = -2.0f;
        }
        f6Var.U = AndroidUtilities.dp(f9);
        f6Var.V = -AndroidUtilities.dp(7.0f);
        addView(f6Var, i7.f6.c(-1.0f, -1));
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9(context, false);
        this.f37043b = h9Var;
        h9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        h9Var.setStepFactor(0.4f);
        h9Var.setSize(AndroidUtilities.dp(29.0f));
        h9Var.setCentered(true);
        h9Var.setVisibility(8);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(h9Var, i7.f6.d(72, -1.0f, i12, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f37044c = imageView;
        imageView.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.il, false), PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), 1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView, i7.f6.d(48, 48.0f, i13 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.hp hpVar = new org.telegram.ui.Components.hp(context, 21, null);
        this.f37045e = hpVar;
        CheckBoxBase checkBoxBase = hpVar.getCheckBoxBase();
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hl, false);
        if (checkBoxBase.f26330x != w02) {
            checkBoxBase.f26330x = w02;
            checkBoxBase.b();
        }
        hpVar.b(-1, org.telegram.ui.ActionBar.g6.f23062d6, org.telegram.ui.ActionBar.g6.f23190k7);
        hpVar.setDrawUnchecked(false);
        hpVar.setDrawBackgroundAsArc(3);
        addView(hpVar, i7.f6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
