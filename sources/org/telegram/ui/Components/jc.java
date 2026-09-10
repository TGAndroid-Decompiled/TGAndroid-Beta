package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jc extends mb {
    public final kj0 f24341a;
    public final o6 f24342b;
    public final o6 f24343c;
    public final int d;

    public jc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        this.d = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        ?? imageView = new ImageView(context);
        this.f24341a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.a6.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        getThemedColor(org.telegram.ui.ActionBar.j6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.a6.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        o6 o6Var = new o6(context, true, true, true);
        this.f24342b = o6Var;
        o6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        o6Var.setTextColor(themedColor);
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setEllipsizeByGradient(true);
        linearLayout.addView(o6Var, w7.a6.n(-1, 20));
        o6 o6Var2 = new o6(context, true, true, true);
        this.f24343c = o6Var2;
        o6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        o6Var2.setTextColor(themedColor);
        o6Var2.setTypeface(Typeface.SANS_SERIF);
        o6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(o6Var2, w7.a6.n(-1, 18));
    }

    public final void c(int i10, String... strArr) {
        kj0 kj0Var = this.f24341a;
        kj0Var.f(i10, 32, 32, null);
        for (String str : strArr) {
            kj0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f24342b.getText()) + ".\n" + ((Object) this.f24343c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f24341a.d();
    }
}
