package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBoxBase;
public final class e9 extends FrameLayout {
    public final int f37196a;
    public final org.telegram.ui.Components.m9 f37197b;
    public final ImageView f37198c;
    public final org.telegram.ui.Cells.i6 d;
    public final org.telegram.ui.Components.dq f37199e;

    public e9(Context context, int i10) {
        super(context);
        int i11;
        int dp;
        float f7;
        int i12;
        int i13;
        this.f37196a = i10;
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
        i6Var.f22244b0 = AndroidUtilities.dp(f7);
        i6Var.f22245c0 = -AndroidUtilities.dp(7.0f);
        addView(i6Var, w7.x5.d(-1.0f, -1));
        org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(context, false);
        this.f37197b = m9Var;
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
        addView(m9Var, w7.x5.a(-1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 72, i12));
        ImageView imageView = new ImageView(context);
        this.f37198c = imageView;
        imageView.setColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.il, false), PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20888i6, false), 1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView, w7.x5.a(48.0f, 8.0f, 0.0f, 8.0f, 0.0f, 48, i13 | 16));
        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(context, 21, null);
        this.f37199e = dqVar;
        CheckBoxBase checkBoxBase = dqVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.hl, false);
        if (checkBoxBase.f24103x != x02) {
            checkBoxBase.f24103x = x02;
            checkBoxBase.b();
        }
        dqVar.b(-1, org.telegram.ui.ActionBar.i6.f20797d6, org.telegram.ui.ActionBar.i6.f20926k7);
        dqVar.setDrawUnchecked(false);
        dqVar.setDrawBackgroundAsArc(3);
        addView(dqVar, w7.x5.a(24.0f, 42.0f, 32.0f, 42.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 48));
    }
}
