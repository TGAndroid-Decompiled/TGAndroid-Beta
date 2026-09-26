package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nc extends nb {
    public final mj0 f26747a;
    public final o90 f26748b;
    public final o90 f26749c;
    public final LinearLayout d;
    public final int e;

    public nc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int i10 = org.telegram.ui.ActionBar.h6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        ?? imageView = new ImageView(context);
        this.f26747a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.y5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.y5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        o90 o90Var = new o90(context, null);
        this.f26748b = o90Var;
        o90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        o90Var.setTextColor(themedColor);
        o90Var.setTextSize(1, 14.0f);
        o90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(o90Var);
        o90 o90Var2 = new o90(context, null);
        this.f26749c = o90Var2;
        o90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        o90Var2.setTextColor(themedColor);
        o90Var2.setLinkTextColor(themedColor2);
        o90Var2.setTypeface(Typeface.SANS_SERIF);
        o90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(o90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        mj0 mj0Var = this.f26747a;
        mj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            mj0Var.h(this.e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f26748b.getText()) + ".\n" + ((Object) this.f26749c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f26747a.d();
    }
}
