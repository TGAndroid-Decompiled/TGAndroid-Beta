package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBoxBase;
public final class h9 extends FrameLayout {
    public final int f38296a;
    public final org.telegram.ui.Components.m9 f38297b;
    public final ImageView f38298c;
    public final org.telegram.ui.Cells.i6 d;
    public final org.telegram.ui.Components.fq f38299e;

    public h9(Context context, int i10) {
        super(context);
        int i11;
        int dp;
        float f7;
        int i12;
        int i13;
        this.f38296a = i10;
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
        i6Var.f22006b0 = AndroidUtilities.dp(f7);
        i6Var.f22007c0 = -AndroidUtilities.dp(7.0f);
        addView(i6Var, w7.w5.d(-1.0f, -1));
        org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(context, false);
        this.f38297b = m9Var;
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        m9Var.setStepFactor(0.4f);
        m9Var.setSize(AndroidUtilities.dp(29.0f));
        m9Var.setCentered(true);
        m9Var.setVisibility(8);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(m9Var, w7.w5.a(-1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 72, i12));
        ImageView imageView = new ImageView(context);
        this.f38298c = imageView;
        imageView.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.il, false), PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20650i6, false), 1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView, w7.w5.a(48.0f, 8.0f, 0.0f, 8.0f, 0.0f, 48, i13 | 16));
        org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(context, 21, null);
        this.f38299e = fqVar;
        CheckBoxBase checkBoxBase = fqVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.hl, false);
        if (checkBoxBase.f23880x != x02) {
            checkBoxBase.f23880x = x02;
            checkBoxBase.b();
        }
        fqVar.b(-1, org.telegram.ui.ActionBar.h6.f20559d6, org.telegram.ui.ActionBar.h6.f20688k7);
        fqVar.setDrawUnchecked(false);
        fqVar.setDrawBackgroundAsArc(3);
        addView(fqVar, w7.w5.a(24.0f, 42.0f, 32.0f, 42.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 48));
    }
}
