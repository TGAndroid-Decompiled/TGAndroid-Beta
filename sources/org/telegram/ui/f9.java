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
    public final int f32719a;
    public final org.telegram.ui.Components.j9 f32720b;
    public final ImageView f32721c;
    public final org.telegram.ui.Cells.j6 d;
    public final org.telegram.ui.Components.tp e;

    public f9(Context context, int i10) {
        super(context);
        int i11;
        int dp;
        float f7;
        int i12;
        int i13;
        this.f32719a = i10;
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
        this.d = j6Var;
        j6Var.M0 = true;
        j6Var.E0 = true;
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
        j6Var.setPadding(i11, 0, dp, 0);
        if (LocaleController.isRTL) {
            f7 = 2.0f;
        } else {
            f7 = -2.0f;
        }
        j6Var.f19358b0 = AndroidUtilities.dp(f7);
        j6Var.f19359c0 = -AndroidUtilities.dp(7.0f);
        addView(j6Var, w7.a6.c(-1.0f, -1));
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(context, false);
        this.f32720b = j9Var;
        j9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        j9Var.setStepFactor(0.4f);
        j9Var.setSize(AndroidUtilities.dp(29.0f));
        j9Var.setCentered(true);
        j9Var.setVisibility(8);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(j9Var, w7.a6.d(72, -1.0f, i12, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f32721c = imageView;
        imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.il, false), PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), 1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView, w7.a6.d(48, 48.0f, i13 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.tp tpVar = new org.telegram.ui.Components.tp(context, 21, null);
        this.e = tpVar;
        CheckBoxBase checkBoxBase = tpVar.getCheckBoxBase();
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hl, false);
        if (checkBoxBase.f21063x != w02) {
            checkBoxBase.f21063x = w02;
            checkBoxBase.b();
        }
        tpVar.b(-1, org.telegram.ui.ActionBar.j6.f17928d6, org.telegram.ui.ActionBar.j6.f18056k7);
        tpVar.setDrawUnchecked(false);
        tpVar.setDrawBackgroundAsArc(3);
        addView(tpVar, w7.a6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
