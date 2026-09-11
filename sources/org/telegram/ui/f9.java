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
    public final int f36339a;
    public final org.telegram.ui.Components.l9 f36340b;
    public final ImageView f36341c;
    public final org.telegram.ui.Cells.h6 d;
    public final org.telegram.ui.Components.mp f36342e;

    public f9(Context context, int i10) {
        super(context);
        int i11;
        int dp;
        float f7;
        int i12;
        int i13;
        this.f36339a = i10;
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
        this.d = h6Var;
        h6Var.M0 = true;
        h6Var.E0 = true;
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
        h6Var.setPadding(i11, 0, dp, 0);
        if (LocaleController.isRTL) {
            f7 = 2.0f;
        } else {
            f7 = -2.0f;
        }
        h6Var.f22029b0 = AndroidUtilities.dp(f7);
        h6Var.f22030c0 = -AndroidUtilities.dp(7.0f);
        addView(h6Var, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context, false);
        this.f36340b = l9Var;
        l9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        l9Var.setStepFactor(0.4f);
        l9Var.setSize(AndroidUtilities.dp(29.0f));
        l9Var.setCentered(true);
        l9Var.setVisibility(8);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(l9Var, w7.x5.d(72, -1.0f, i12, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f36341c = imageView;
        imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.il, false), PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20753i6, false), 1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView, w7.x5.d(48, 48.0f, i13 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.mp mpVar = new org.telegram.ui.Components.mp(context, 21, null);
        this.f36342e = mpVar;
        CheckBoxBase checkBoxBase = mpVar.getCheckBoxBase();
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hl, false);
        if (checkBoxBase.f23913x != w02) {
            checkBoxBase.f23913x = w02;
            checkBoxBase.b();
        }
        mpVar.b(-1, org.telegram.ui.ActionBar.j6.f20663d6, org.telegram.ui.ActionBar.j6.f20792k7);
        mpVar.setDrawUnchecked(false);
        mpVar.setDrawBackgroundAsArc(3);
        addView(mpVar, w7.x5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
