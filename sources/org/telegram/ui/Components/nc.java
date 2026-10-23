package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nc extends nb {
    public final bk0 f28932a;
    public final y90 f28933b;
    public final y90 f28934c;
    public final LinearLayout d;
    public final int e;

    public nc(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
        ?? imageView = new ImageView(context);
        this.f28932a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.z5.h(56.0f, 48.0f, 8388627));
        getThemedColor(i10);
        int i11 = org.telegram.ui.ActionBar.k6.Gi;
        getThemedColor(i11);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        y90 y90Var = new y90(context, null);
        this.f28933b = y90Var;
        y90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.r6.W(y90Var, i10, g6Var);
        y90Var.setTextSize(1, 14.0f);
        y90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(y90Var);
        y90 y90Var2 = new y90(context, null);
        this.f28934c = y90Var2;
        y90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.r6.W(y90Var2, i10, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var2, i11, g6Var);
        y90Var2.setTypeface(Typeface.SANS_SERIF);
        y90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(y90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        bk0 bk0Var = this.f28932a;
        bk0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            bk0Var.h(this.e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f28933b.getText()) + ".\n" + ((Object) this.f28934c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f28932a.d();
    }
}
