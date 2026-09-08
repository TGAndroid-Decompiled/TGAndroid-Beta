package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class kc extends nb {
    public final aj0 f27823a;
    public final q6 f27824b;
    public final q6 f27825c;
    public final int d;

    public kc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        this.d = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        ?? imageView = new ImageView(context);
        this.f27823a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.x5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        getThemedColor(org.telegram.ui.ActionBar.j6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        q6 q6Var = new q6(context, true, true, true);
        this.f27824b = q6Var;
        q6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        q6Var.setTextColor(themedColor);
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setEllipsizeByGradient(true);
        linearLayout.addView(q6Var, w7.x5.n(-1, 20));
        q6 q6Var2 = new q6(context, true, true, true);
        this.f27825c = q6Var2;
        q6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        q6Var2.setTextColor(themedColor);
        q6Var2.setTypeface(Typeface.SANS_SERIF);
        q6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        q6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(q6Var2, w7.x5.n(-1, 18));
    }

    public final void c(int i10, String... strArr) {
        aj0 aj0Var = this.f27823a;
        aj0Var.f(i10, 32, 32, null);
        for (String str : strArr) {
            aj0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f27824b.getText()) + ".\n" + ((Object) this.f27825c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f27823a.d();
    }
}
