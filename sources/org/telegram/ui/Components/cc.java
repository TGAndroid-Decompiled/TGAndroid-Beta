package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class cc extends eb {
    public final kj0 f25886a;
    public final k6 f25887b;
    public final k6 f25888c;
    public final int d;

    public cc(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Hi;
        this.d = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
        ?? imageView = new ImageView(context);
        this.f25886a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, k7.c6.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        getThemedColor(org.telegram.ui.ActionBar.k6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.c6.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        k6 k6Var = new k6(context, true, true, true);
        this.f25887b = k6Var;
        k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        k6Var.setTextColor(themedColor);
        k6Var.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setEllipsizeByGradient(true);
        linearLayout.addView(k6Var, k7.c6.n(-1, 20));
        k6 k6Var2 = new k6(context, true, true, true);
        this.f25888c = k6Var2;
        k6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        k6Var2.setTextColor(themedColor);
        k6Var2.setTypeface(Typeface.SANS_SERIF);
        k6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(k6Var2, k7.c6.n(-1, 18));
    }

    public final void c(int i10, String... strArr) {
        kj0 kj0Var = this.f25886a;
        kj0Var.f(i10, 32, 32, null);
        for (String str : strArr) {
            kj0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f25887b.getText()) + ".\n" + ((Object) this.f25888c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f25886a.d();
    }
}
