package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class pc extends pb {
    public final ik0 f29480a;
    public final ia0 f29481b;
    public final ia0 f29482c;
    public final LinearLayout d;
    public final int f29483e;

    public pc(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        int i10 = org.telegram.ui.ActionBar.h6.Hi;
        this.f29483e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        ?? imageView = new ImageView(context);
        this.f29480a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.w5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.w5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        ia0 ia0Var = new ia0(context, null);
        this.f29481b = ia0Var;
        ia0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        ia0Var.setTextColor(themedColor);
        ia0Var.setTextSize(1, 14.0f);
        ia0Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(ia0Var);
        ia0 ia0Var2 = new ia0(context, null);
        this.f29482c = ia0Var2;
        ia0Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        ia0Var2.setTextColor(themedColor);
        ia0Var2.setLinkTextColor(themedColor2);
        ia0Var2.setTypeface(Typeface.SANS_SERIF);
        ia0Var2.setTextSize(1, 13.0f);
        linearLayout.addView(ia0Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        ik0 ik0Var = this.f29480a;
        ik0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            ik0Var.h(this.f29483e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f29481b.getText()) + ".\n" + ((Object) this.f29482c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f29480a.d();
    }
}
