package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBoxBase;
public final class f9 extends FrameLayout {
    public final int f33582a;
    public final org.telegram.ui.Components.k9 f33583b;
    public final ImageView f33584c;
    public final org.telegram.ui.Cells.i6 d;
    public final org.telegram.ui.Components.op e;

    public f9(Context context, int i10) {
        super(context);
        int i11;
        int dp;
        float f7;
        int i12;
        int i13;
        this.f33582a = i10;
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
        this.d = i6Var;
        i6Var.M0 = true;
        i6Var.E0 = true;
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
        i6Var.setPadding(i11, 0, dp, 0);
        if (LocaleController.isRTL) {
            f7 = 2.0f;
        } else {
            f7 = -2.0f;
        }
        i6Var.f20432b0 = AndroidUtilities.dp(f7);
        i6Var.f20433c0 = -AndroidUtilities.dp(7.0f);
        addView(i6Var, w7.y5.c(-1.0f, -1));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context, false);
        this.f33583b = k9Var;
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        k9Var.setStepFactor(0.4f);
        k9Var.setSize(AndroidUtilities.dp(29.0f));
        k9Var.setCentered(true);
        k9Var.setVisibility(8);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(k9Var, w7.y5.d(72, -1.0f, i12, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f33584c = imageView;
        imageView.setColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.il, false), PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19149i6, false), 1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView, w7.y5.d(48, 48.0f, i13 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.op opVar = new org.telegram.ui.Components.op(context, 21, null);
        this.e = opVar;
        CheckBoxBase checkBoxBase = opVar.getCheckBoxBase();
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.hl, false);
        if (checkBoxBase.f22201x != w02) {
            checkBoxBase.f22201x = w02;
            checkBoxBase.b();
        }
        opVar.b(-1, org.telegram.ui.ActionBar.h6.f19060d6, org.telegram.ui.ActionBar.h6.f19188k7);
        opVar.setDrawUnchecked(false);
        opVar.setDrawBackgroundAsArc(3);
        addView(opVar, w7.y5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
