package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jc extends mb {
    public final nj0 f25350a;
    public final o6 f25351b;
    public final o6 f25352c;
    public final int d;

    public jc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        this.d = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        ?? imageView = new ImageView(context);
        this.f25350a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.y5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        getThemedColor(org.telegram.ui.ActionBar.j6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.y5.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        o6 o6Var = new o6(context, true, true, true);
        this.f25351b = o6Var;
        o6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        o6Var.setTextColor(themedColor);
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setEllipsizeByGradient(true);
        linearLayout.addView(o6Var, w7.y5.n(-1, 20));
        o6 o6Var2 = new o6(context, true, true, true);
        this.f25352c = o6Var2;
        o6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        o6Var2.setTextColor(themedColor);
        o6Var2.setTypeface(Typeface.SANS_SERIF);
        o6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(o6Var2, w7.y5.n(-1, 18));
    }

    public final void c(int i10, String... strArr) {
        nj0 nj0Var = this.f25350a;
        nj0Var.f(i10, 32, 32, null);
        for (String str : strArr) {
            nj0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f25351b.getText()) + ".\n" + ((Object) this.f25352c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f25350a.d();
    }
}
