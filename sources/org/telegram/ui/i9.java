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
    public final int f37069a;
    public final org.telegram.ui.Components.n9 f37070b;
    public final ImageView f37071c;
    public final org.telegram.ui.Cells.i6 d;
    public final org.telegram.ui.Components.aq e;

    public i9(Context context, int i10) {
        super(context);
        int i11;
        int dp;
        float f7;
        int i12;
        int i13;
        this.f37069a = i10;
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
        i6Var.f21316b0 = AndroidUtilities.dp(f7);
        i6Var.f21317c0 = -AndroidUtilities.dp(7.0f);
        addView(i6Var, w7.a6.d(-1.0f, -1));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context, false);
        this.f37070b = n9Var;
        n9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        n9Var.setStepFactor(0.4f);
        n9Var.setSize(AndroidUtilities.dp(29.0f));
        n9Var.setCentered(true);
        n9Var.setVisibility(8);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(n9Var, w7.a6.a(-1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 72, i12));
        ImageView imageView = new ImageView(context);
        this.f37071c = imageView;
        imageView.setColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.il, false), PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19990i6, false), 1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView, w7.a6.a(48.0f, 8.0f, 0.0f, 8.0f, 0.0f, 48, i13 | 16));
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, 21, null);
        this.e = aqVar;
        CheckBoxBase checkBoxBase = aqVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.hl, false);
        if (checkBoxBase.f23098x != x02) {
            checkBoxBase.f23098x = x02;
            checkBoxBase.b();
        }
        aqVar.b(-1, org.telegram.ui.ActionBar.g6.f19901d6, org.telegram.ui.ActionBar.g6.f20029k7);
        aqVar.setDrawUnchecked(false);
        aqVar.setDrawBackgroundAsArc(3);
        addView(aqVar, w7.a6.a(24.0f, 42.0f, 32.0f, 42.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 48));
    }
}
