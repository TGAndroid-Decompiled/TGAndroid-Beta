package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class fc extends eb {
    public final lj0 f26861a;
    public final g90 f26862b;
    public final g90 f26863c;
    public final LinearLayout d;
    public final int f26864e;

    public fc(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Hi;
        this.f26864e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
        ?? imageView = new ImageView(context);
        this.f26861a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, k7.c6.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.c6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        g90 g90Var = new g90(context, null);
        this.f26862b = g90Var;
        g90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        g90Var.setTextColor(themedColor);
        g90Var.setTextSize(1, 14.0f);
        g90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(g90Var);
        g90 g90Var2 = new g90(context, null);
        this.f26863c = g90Var2;
        g90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        g90Var2.setTextColor(themedColor);
        g90Var2.setLinkTextColor(themedColor2);
        g90Var2.setTypeface(Typeface.SANS_SERIF);
        g90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(g90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        lj0 lj0Var = this.f26861a;
        lj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            lj0Var.h(this.f26864e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f26862b.getText()) + ".\n" + ((Object) this.f26863c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f26861a.d();
    }
}
