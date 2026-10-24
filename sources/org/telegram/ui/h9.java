package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBoxBase;
public final class h9 extends FrameLayout {
    public final int f37788a;
    public final org.telegram.ui.Components.i9 f37789b;
    public final ImageView f37790c;
    public final org.telegram.ui.Cells.i6 d;
    public final org.telegram.ui.Components.vp e;
    public Drawable f37791f;
    public Drawable h;

    public h9(Context context, int i10) {
        super(context);
        int i11;
        int dp;
        float f7;
        int i12;
        int i13;
        this.f37788a = i10;
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
        i6Var.f22509b0 = AndroidUtilities.dp(f7);
        i6Var.f22510c0 = -AndroidUtilities.dp(7.0f);
        addView(i6Var, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context, false);
        this.f37789b = i9Var;
        i9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        i9Var.setStepFactor(0.4f);
        i9Var.setSize(AndroidUtilities.dp(29.0f));
        i9Var.setCentered(true);
        i9Var.setVisibility(8);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(i9Var, w7.z5.d(72, -1.0f, i12, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f37790c = imageView;
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.il, null, PorterDuff.Mode.SRC_IN);
        int i14 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 1, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView, w7.z5.d(48, 48.0f, i13 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.vp vpVar = new org.telegram.ui.Components.vp(context, 21, null);
        this.e = vpVar;
        CheckBoxBase checkBoxBase = vpVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.hl, false);
        if (checkBoxBase.f24303x != x02) {
            checkBoxBase.f24303x = x02;
            checkBoxBase.b();
        }
        vpVar.b(-1, org.telegram.ui.ActionBar.k6.f21184d6, org.telegram.ui.ActionBar.k6.f21312k7);
        vpVar.setDrawUnchecked(false);
        vpVar.setDrawBackgroundAsArc(3);
        addView(vpVar, w7.z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
