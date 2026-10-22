package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nc extends nb {
    public final yj0 f28777a;
    public final x90 f28778b;
    public final x90 f28779c;
    public final LinearLayout d;
    public final int e;

    public nc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int i10 = org.telegram.ui.ActionBar.h6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        ?? imageView = new ImageView(context);
        this.f28777a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.z5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        x90 x90Var = new x90(context, null);
        this.f28778b = x90Var;
        x90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        x90Var.setTextColor(themedColor);
        x90Var.setTextSize(1, 14.0f);
        x90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(x90Var);
        x90 x90Var2 = new x90(context, null);
        this.f28779c = x90Var2;
        x90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        x90Var2.setTextColor(themedColor);
        x90Var2.setLinkTextColor(themedColor2);
        x90Var2.setTypeface(Typeface.SANS_SERIF);
        x90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(x90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        yj0 yj0Var = this.f28777a;
        yj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            yj0Var.h(this.e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f28778b.getText()) + ".\n" + ((Object) this.f28779c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f28777a.d();
    }
}
