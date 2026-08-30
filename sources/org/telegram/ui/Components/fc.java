package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class fc extends eb {
    public final jj0 f24845a;
    public final e90 f24846b;
    public final e90 f24847c;
    public final LinearLayout d;
    public final int e;

    public fc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        ?? imageView = new ImageView(context);
        this.f24845a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, k7.b6.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.b6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        e90 e90Var = new e90(context, null);
        this.f24846b = e90Var;
        e90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        e90Var.setTextColor(themedColor);
        e90Var.setTextSize(1, 14.0f);
        e90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(e90Var);
        e90 e90Var2 = new e90(context, null);
        this.f24847c = e90Var2;
        e90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        e90Var2.setTextColor(themedColor);
        e90Var2.setLinkTextColor(themedColor2);
        e90Var2.setTypeface(Typeface.SANS_SERIF);
        e90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(e90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        jj0 jj0Var = this.f24845a;
        jj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            jj0Var.h(this.e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f24846b.getText()) + ".\n" + ((Object) this.f24847c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f24845a.d();
    }
}
