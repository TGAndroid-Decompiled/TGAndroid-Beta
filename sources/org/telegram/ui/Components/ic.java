package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ic extends lb {
    public final bj0 f24922a;
    public final n6 f24923b;
    public final n6 f24924c;
    public final int d;

    public ic(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        this.d = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        ?? imageView = new ImageView(context);
        this.f24922a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.x5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        getThemedColor(org.telegram.ui.ActionBar.j6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        n6 n6Var = new n6(context, true, true, true);
        this.f24923b = n6Var;
        n6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        n6Var.setTextColor(themedColor);
        n6Var.setTextSize(AndroidUtilities.dp(14.0f));
        n6Var.setTypeface(AndroidUtilities.bold());
        n6Var.setEllipsizeByGradient(true);
        linearLayout.addView(n6Var, w7.x5.n(-1, 20));
        n6 n6Var2 = new n6(context, true, true, true);
        this.f24924c = n6Var2;
        n6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        n6Var2.setTextColor(themedColor);
        n6Var2.setTypeface(Typeface.SANS_SERIF);
        n6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        n6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(n6Var2, w7.x5.n(-1, 18));
    }

    public final void c(int i10, String... strArr) {
        bj0 bj0Var = this.f24922a;
        bj0Var.f(i10, 32, 32, null);
        for (String str : strArr) {
            bj0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f24923b.getText()) + ".\n" + ((Object) this.f24924c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f24922a.d();
    }
}
