package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class fc extends eb {
    public final jj0 f24858a;
    public final f90 f24859b;
    public final f90 f24860c;
    public final LinearLayout d;
    public final int e;

    public fc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        ?? imageView = new ImageView(context);
        this.f24858a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, k7.b6.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.b6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        f90 f90Var = new f90(context, null);
        this.f24859b = f90Var;
        f90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        f90Var.setTextColor(themedColor);
        f90Var.setTextSize(1, 14.0f);
        f90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(f90Var);
        f90 f90Var2 = new f90(context, null);
        this.f24860c = f90Var2;
        f90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        f90Var2.setTextColor(themedColor);
        f90Var2.setLinkTextColor(themedColor2);
        f90Var2.setTypeface(Typeface.SANS_SERIF);
        f90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(f90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        jj0 jj0Var = this.f24858a;
        jj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            jj0Var.h(this.e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f24859b.getText()) + ".\n" + ((Object) this.f24860c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f24858a.d();
    }
}
