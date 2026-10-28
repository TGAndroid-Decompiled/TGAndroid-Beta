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
public final class j9 extends FrameLayout {
    public final int f40468a;
    public final org.telegram.ui.Components.m9 f40469b;
    public final ImageView f40470c;
    public final org.telegram.ui.Cells.m6 d;
    public final org.telegram.ui.Components.aq e;
    public Drawable f40471f;
    public Drawable h;

    public j9(Context context, int i10) {
        super(context);
        int i11;
        int dp;
        float f7;
        int i12;
        int i13;
        this.f40468a = i10;
        org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(context, null);
        this.d = m6Var;
        m6Var.M0 = true;
        m6Var.E0 = true;
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
        m6Var.setPadding(i11, 0, dp, 0);
        if (LocaleController.isRTL) {
            f7 = 2.0f;
        } else {
            f7 = -2.0f;
        }
        m6Var.f24455b0 = AndroidUtilities.dp(f7);
        m6Var.f24456c0 = -AndroidUtilities.dp(7.0f);
        addView(m6Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(context, false);
        this.f40469b = m9Var;
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
        addView(m9Var, org.telegram.ui.Components.kb1.h(72, -1.0f, i12, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f40470c = imageView;
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.il, null, PorterDuff.Mode.SRC_IN);
        int i14 = org.telegram.ui.ActionBar.y6.f23449i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i14, false), 1, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i14);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView, org.telegram.ui.Components.kb1.h(48, 48.0f, i13 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, 21, null);
        this.e = aqVar;
        CheckBoxBase checkBoxBase = aqVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.hl, false);
        if (checkBoxBase.f26097x != x02) {
            checkBoxBase.f26097x = x02;
            checkBoxBase.b();
        }
        aqVar.b(-1, org.telegram.ui.ActionBar.y6.f23357d6, org.telegram.ui.ActionBar.y6.f23486k7);
        aqVar.setDrawUnchecked(false);
        aqVar.setDrawBackgroundAsArc(3);
        addView(aqVar, org.telegram.ui.Components.kb1.h(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
