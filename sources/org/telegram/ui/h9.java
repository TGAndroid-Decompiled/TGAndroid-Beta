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
    public final int f37445a;
    public final org.telegram.ui.Components.k9 f37446b;
    public final ImageView f37447c;
    public final org.telegram.ui.Cells.h6 d;
    public final org.telegram.ui.Components.xp e;

    public h9(Context context, int i10) {
        super(context);
        int i11;
        int dp;
        float f7;
        int i12;
        int i13;
        this.f37445a = i10;
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
        h6Var.f22334b0 = AndroidUtilities.dp(f7);
        h6Var.f22335c0 = -AndroidUtilities.dp(7.0f);
        addView(h6Var, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context, false);
        this.f37446b = k9Var;
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
        addView(k9Var, w7.z5.d(72, -1.0f, i12, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f37447c = imageView;
        imageView.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.il, false), PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21075i6, false), 1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView, w7.z5.d(48, 48.0f, i13 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(context, 21, null);
        this.e = xpVar;
        CheckBoxBase checkBoxBase = xpVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.hl, false);
        if (checkBoxBase.f24153x != x02) {
            checkBoxBase.f24153x = x02;
            checkBoxBase.b();
        }
        xpVar.b(-1, org.telegram.ui.ActionBar.h6.f20986d6, org.telegram.ui.ActionBar.h6.f21114k7);
        xpVar.setDrawUnchecked(false);
        xpVar.setDrawBackgroundAsArc(3);
        addView(xpVar, w7.z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
