package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nc extends nb {
    public final nj0 f26777a;
    public final p90 f26778b;
    public final p90 f26779c;
    public final LinearLayout d;
    public final int e;

    public nc(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i10 = org.telegram.ui.ActionBar.i6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
        ?? imageView = new ImageView(context);
        this.f26777a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.y5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.i6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.y5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        p90 p90Var = new p90(context, null);
        this.f26778b = p90Var;
        p90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        p90Var.setTextColor(themedColor);
        p90Var.setTextSize(1, 14.0f);
        p90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(p90Var);
        p90 p90Var2 = new p90(context, null);
        this.f26779c = p90Var2;
        p90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        p90Var2.setTextColor(themedColor);
        p90Var2.setLinkTextColor(themedColor2);
        p90Var2.setTypeface(Typeface.SANS_SERIF);
        p90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(p90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        nj0 nj0Var = this.f26777a;
        nj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            nj0Var.h(this.e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f26778b.getText()) + ".\n" + ((Object) this.f26779c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f26777a.d();
    }
}
