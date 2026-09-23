package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nc extends nb {
    public final bj0 f26407a;
    public final d90 f26408b;
    public final d90 f26409c;
    public final LinearLayout d;
    public final int e;

    public nc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int i10 = org.telegram.ui.ActionBar.h6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        ?? imageView = new ImageView(context);
        this.f26407a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.x5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        d90 d90Var = new d90(context, null);
        this.f26408b = d90Var;
        d90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        d90Var.setTextColor(themedColor);
        d90Var.setTextSize(1, 14.0f);
        d90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(d90Var);
        d90 d90Var2 = new d90(context, null);
        this.f26409c = d90Var2;
        d90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        d90Var2.setTextColor(themedColor);
        d90Var2.setLinkTextColor(themedColor2);
        d90Var2.setTypeface(Typeface.SANS_SERIF);
        d90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(d90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        bj0 bj0Var = this.f26407a;
        bj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            bj0Var.h(this.e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f26408b.getText()) + ".\n" + ((Object) this.f26409c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f26407a.d();
    }
}
