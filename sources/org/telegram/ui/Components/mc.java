package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class mc extends pb {
    public final bk0 f27353a;
    public final s6 f27354b;
    public final s6 f27355c;
    public final int d;

    public mc(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        int i10 = org.telegram.ui.ActionBar.g6.Hi;
        this.d = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
        ?? imageView = new ImageView(context);
        this.f27353a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.a6.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        getThemedColor(org.telegram.ui.ActionBar.g6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.a6.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        s6 s6Var = new s6(context, true, true, true);
        this.f27354b = s6Var;
        s6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        s6Var.setTextColor(themedColor);
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setEllipsizeByGradient(true);
        linearLayout.addView(s6Var, w7.a6.n(-1, 20));
        s6 s6Var2 = new s6(context, true, true, true);
        this.f27355c = s6Var2;
        s6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        s6Var2.setTextColor(themedColor);
        s6Var2.setTypeface(Typeface.SANS_SERIF);
        s6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(s6Var2, w7.a6.n(-1, 18));
    }

    public final void c(int i10, String... strArr) {
        bk0 bk0Var = this.f27353a;
        bk0Var.f(i10, 32, 32, null);
        for (String str : strArr) {
            bk0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f27354b.getText()) + ".\n" + ((Object) this.f27355c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f27353a.d();
    }
}
