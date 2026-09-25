package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nc extends nb {
    public final lj0 f26718a;
    public final n90 f26719b;
    public final n90 f26720c;
    public final LinearLayout d;
    public final int e;

    public nc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int i10 = org.telegram.ui.ActionBar.h6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        ?? imageView = new ImageView(context);
        this.f26718a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.y5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.y5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        n90 n90Var = new n90(context, null);
        this.f26719b = n90Var;
        n90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        n90Var.setTextColor(themedColor);
        n90Var.setTextSize(1, 14.0f);
        n90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(n90Var);
        n90 n90Var2 = new n90(context, null);
        this.f26720c = n90Var2;
        n90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        n90Var2.setTextColor(themedColor);
        n90Var2.setLinkTextColor(themedColor2);
        n90Var2.setTypeface(Typeface.SANS_SERIF);
        n90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(n90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        lj0 lj0Var = this.f26718a;
        lj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            lj0Var.h(this.e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f26719b.getText()) + ".\n" + ((Object) this.f26720c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f26718a.d();
    }
}
