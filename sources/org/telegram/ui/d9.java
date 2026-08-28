package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBoxBase;
public final class d9 extends FrameLayout {
    public final int f37452a;
    public final org.telegram.ui.Components.c9 f37453b;
    public final ImageView f37454c;
    public final org.telegram.ui.Cells.h6 d;
    public final org.telegram.ui.Components.dp f37455e;

    public d9(Context context, int i9) {
        super(context);
        int i10;
        int dp;
        float f10;
        int i11;
        int i12;
        this.f37452a = i9;
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
        this.d = h6Var;
        h6Var.I0 = true;
        h6Var.A0 = true;
        if (LocaleController.isRTL) {
            i10 = AndroidUtilities.dp(32.0f);
        } else {
            i10 = 0;
        }
        if (LocaleController.isRTL) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(32.0f);
        }
        h6Var.setPadding(i10, 0, dp, 0);
        if (LocaleController.isRTL) {
            f10 = 2.0f;
        } else {
            f10 = -2.0f;
        }
        h6Var.U = AndroidUtilities.dp(f10);
        h6Var.V = -AndroidUtilities.dp(7.0f);
        addView(h6Var, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.c9 c9Var = new org.telegram.ui.Components.c9(context, false);
        this.f37453b = c9Var;
        c9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        c9Var.setStepFactor(0.4f);
        c9Var.setSize(AndroidUtilities.dp(29.0f));
        c9Var.setCentered(true);
        c9Var.setVisibility(8);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(c9Var, g7.e6.d(72, -1.0f, i11, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f37454c = imageView;
        imageView.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.il, false), PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(imageView, g7.e6.d(48, 48.0f, i12 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.dp dpVar = new org.telegram.ui.Components.dp(context, 21, null);
        this.f37455e = dpVar;
        CheckBoxBase checkBoxBase = dpVar.getCheckBoxBase();
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hl, false);
        if (checkBoxBase.f26319x != w02) {
            checkBoxBase.f26319x = w02;
            checkBoxBase.b();
        }
        dpVar.b(-1, org.telegram.ui.ActionBar.f6.f23001d6, org.telegram.ui.ActionBar.f6.f23128k7);
        dpVar.setDrawUnchecked(false);
        dpVar.setDrawBackgroundAsArc(3);
        addView(dpVar, g7.e6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
