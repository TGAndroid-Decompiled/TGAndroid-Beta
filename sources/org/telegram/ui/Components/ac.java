package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ac extends eb {
    public final pi0 f26754a;
    public final j6 f26755b;
    public final j6 f26756c;
    public final int d;

    public ac(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        int i9 = org.telegram.ui.ActionBar.f6.Hi;
        this.d = getThemedColor(i9);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.f6.Fi));
        ?? imageView = new ImageView(context);
        this.f26754a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, g7.e6.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i9);
        getThemedColor(org.telegram.ui.ActionBar.f6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, g7.e6.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        j6 j6Var = new j6(context, true, true, true);
        this.f26755b = j6Var;
        j6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        j6Var.setTextColor(themedColor);
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setEllipsizeByGradient(true);
        linearLayout.addView(j6Var, g7.e6.n(-1, 20));
        j6 j6Var2 = new j6(context, true, true, true);
        this.f26756c = j6Var2;
        j6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        j6Var2.setTextColor(themedColor);
        j6Var2.setTypeface(Typeface.SANS_SERIF);
        j6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(j6Var2, g7.e6.n(-1, 18));
    }

    public final void c(int i9, String... strArr) {
        pi0 pi0Var = this.f26754a;
        pi0Var.f(i9, 32, 32, null);
        for (String str : strArr) {
            pi0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f26755b.getText()) + ".\n" + ((Object) this.f26756c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f26754a.d();
    }
}
