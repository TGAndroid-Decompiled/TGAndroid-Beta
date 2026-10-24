package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class lc extends lb {
    public final ak0 f28317a;
    public final w90 f28318b;
    public final w90 f28319c;
    public final LinearLayout d;
    public final int e;

    public lc(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
        ?? imageView = new ImageView(context);
        this.f28317a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.z5.h(56.0f, 48.0f, 8388627));
        getThemedColor(i10);
        int i11 = org.telegram.ui.ActionBar.k6.Gi;
        getThemedColor(i11);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        w90 w90Var = new w90(context, null);
        this.f28318b = w90Var;
        w90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.r6.W(w90Var, i10, g6Var);
        w90Var.setTextSize(1, 14.0f);
        w90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(w90Var);
        w90 w90Var2 = new w90(context, null);
        this.f28319c = w90Var2;
        w90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.r6.W(w90Var2, i10, g6Var);
        org.telegram.ui.ActionBar.r6.I(w90Var2, i11, g6Var);
        w90Var2.setTypeface(Typeface.SANS_SERIF);
        w90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(w90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        ak0 ak0Var = this.f28317a;
        ak0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            ak0Var.h(this.e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f28318b.getText()) + ".\n" + ((Object) this.f28319c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f28317a.d();
    }
}
