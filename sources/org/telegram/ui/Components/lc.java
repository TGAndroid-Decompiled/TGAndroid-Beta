package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class lc extends ob {
    public final nj0 f28328a;
    public final p6 f28329b;
    public final p6 f28330c;
    public final int d;

    public lc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int i10 = org.telegram.ui.ActionBar.i6.Hi;
        this.d = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
        ?? imageView = new ImageView(context);
        this.f28328a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.z5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        getThemedColor(org.telegram.ui.ActionBar.i6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        p6 p6Var = new p6(context, true, true, true);
        this.f28329b = p6Var;
        p6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        p6Var.setTextColor(themedColor);
        p6Var.setTextSize(AndroidUtilities.dp(14.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setEllipsizeByGradient(true);
        linearLayout.addView(p6Var, w7.z5.n(-1, 20));
        p6 p6Var2 = new p6(context, true, true, true);
        this.f28330c = p6Var2;
        p6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        p6Var2.setTextColor(themedColor);
        p6Var2.setTypeface(Typeface.SANS_SERIF);
        p6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        p6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(p6Var2, w7.z5.n(-1, 18));
    }

    public final void c(int i10, String... strArr) {
        nj0 nj0Var = this.f28328a;
        nj0Var.f(i10, 32, 32, null);
        for (String str : strArr) {
            nj0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f28329b.getText()) + ".\n" + ((Object) this.f28330c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f28328a.d();
    }
}
