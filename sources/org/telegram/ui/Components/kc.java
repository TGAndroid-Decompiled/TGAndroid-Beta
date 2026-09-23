package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class kc extends nb {
    public final bj0 f25577a;
    public final p6 f25578b;
    public final p6 f25579c;
    public final int d;

    public kc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int i10 = org.telegram.ui.ActionBar.h6.Hi;
        this.d = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        ?? imageView = new ImageView(context);
        this.f25577a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.x5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        getThemedColor(org.telegram.ui.ActionBar.h6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        p6 p6Var = new p6(context, true, true, true);
        this.f25578b = p6Var;
        p6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        p6Var.setTextColor(themedColor);
        p6Var.setTextSize(AndroidUtilities.dp(14.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setEllipsizeByGradient(true);
        linearLayout.addView(p6Var, w7.x5.n(-1, 20));
        p6 p6Var2 = new p6(context, true, true, true);
        this.f25579c = p6Var2;
        p6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        p6Var2.setTextColor(themedColor);
        p6Var2.setTypeface(Typeface.SANS_SERIF);
        p6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        p6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(p6Var2, w7.x5.n(-1, 18));
    }

    public final void c(int i10, String... strArr) {
        bj0 bj0Var = this.f25577a;
        bj0Var.f(i10, 32, 32, null);
        for (String str : strArr) {
            bj0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f25578b.getText()) + ".\n" + ((Object) this.f25579c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f25577a.d();
    }
}
