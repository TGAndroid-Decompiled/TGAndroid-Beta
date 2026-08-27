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

    public final int f37671a;

    public final org.telegram.ui.Components.b9 f37672b;

    public final ImageView f37673c;
    public final org.telegram.ui.Cells.e6 d;

    public final org.telegram.ui.Components.bp f37674e;

    public e9(Context context, int i10) {
        super(context);
        this.f37671a = i10;
        org.telegram.ui.Cells.e6 e6Var = new org.telegram.ui.Cells.e6(context, null);
        this.d = e6Var;
        e6Var.I0 = true;
        e6Var.A0 = true;
        e6Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(32.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(32.0f), 0);
        int iDp = AndroidUtilities.dp(LocaleController.isRTL ? 2.0f : -2.0f);
        int i11 = -AndroidUtilities.dp(7.0f);
        e6Var.U = iDp;
        e6Var.V = i11;
        addView(e6Var, h7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9(context, false);
        this.f37672b = b9Var;
        b9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        b9Var.setStepFactor(0.4f);
        b9Var.setSize(AndroidUtilities.dp(29.0f));
        b9Var.setCentered(true);
        b9Var.setVisibility(8);
        addView(b9Var, h7.z5.d(72, -1.0f, LocaleController.isRTL ? 5 : 3, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f37673c = imageView;
        imageView.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.il, false), PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        addView(imageView, h7.z5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(context, 21, null);
        this.f37674e = bpVar;
        CheckBoxBase checkBoxBase = bpVar.getCheckBoxBase();
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hl, false);
        if (checkBoxBase.f26315x != iW0) {
            checkBoxBase.f26315x = iW0;
            checkBoxBase.b();
        }
        bpVar.b(-1, org.telegram.ui.ActionBar.g6.f23053d6, org.telegram.ui.ActionBar.g6.f23182k7);
        bpVar.setDrawUnchecked(false);
        bpVar.setDrawBackgroundAsArc(3);
        addView(bpVar, h7.z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
