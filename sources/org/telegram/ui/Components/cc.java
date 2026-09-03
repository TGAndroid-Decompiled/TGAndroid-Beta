package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class cc extends eb {
    public final jj0 f23920a;
    public final k6 f23921b;
    public final k6 f23922c;
    public final int d;

    public cc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        this.d = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        ?? imageView = new ImageView(context);
        this.f23920a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, k7.b6.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        getThemedColor(org.telegram.ui.ActionBar.j6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.b6.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        k6 k6Var = new k6(context, true, true, true);
        this.f23921b = k6Var;
        k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        k6Var.setTextColor(themedColor);
        k6Var.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setEllipsizeByGradient(true);
        linearLayout.addView(k6Var, k7.b6.n(-1, 20));
        k6 k6Var2 = new k6(context, true, true, true);
        this.f23922c = k6Var2;
        k6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        k6Var2.setTextColor(themedColor);
        k6Var2.setTypeface(Typeface.SANS_SERIF);
        k6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(k6Var2, k7.b6.n(-1, 18));
    }

    public final void c(int i10, String... strArr) {
        jj0 jj0Var = this.f23920a;
        jj0Var.f(i10, 32, 32, null);
        for (String str : strArr) {
            jj0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f23921b.getText()) + ".\n" + ((Object) this.f23922c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f23920a.d();
    }
}
