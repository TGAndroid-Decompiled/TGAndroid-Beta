package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class oc extends ob {
    public final oj0 f27053a;
    public final q90 f27054b;
    public final q90 f27055c;
    public final LinearLayout d;
    public final int e;

    public oc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int i10 = org.telegram.ui.ActionBar.h6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        ?? imageView = new ImageView(context);
        this.f27053a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.y5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.y5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        q90 q90Var = new q90(context, null);
        this.f27054b = q90Var;
        q90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        q90Var.setTextColor(themedColor);
        q90Var.setTextSize(1, 14.0f);
        q90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(q90Var);
        q90 q90Var2 = new q90(context, null);
        this.f27055c = q90Var2;
        q90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        q90Var2.setTextColor(themedColor);
        q90Var2.setLinkTextColor(themedColor2);
        q90Var2.setTypeface(Typeface.SANS_SERIF);
        q90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(q90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        oj0 oj0Var = this.f27053a;
        oj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            oj0Var.h(this.e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f27054b.getText()) + ".\n" + ((Object) this.f27055c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f27053a.d();
    }
}
