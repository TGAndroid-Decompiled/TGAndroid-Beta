package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class qc extends qb {
    public final gk0 f30174a;
    public final fa0 f30175b;
    public final fa0 f30176c;
    public final LinearLayout d;
    public final int f30177e;

    public qc(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i10 = org.telegram.ui.ActionBar.i6.Hi;
        this.f30177e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
        ?? imageView = new ImageView(context);
        this.f30174a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.x5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.i6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        fa0 fa0Var = new fa0(context, null);
        this.f30175b = fa0Var;
        fa0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        fa0Var.setTextColor(themedColor);
        fa0Var.setTextSize(1, 14.0f);
        fa0Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(fa0Var);
        fa0 fa0Var2 = new fa0(context, null);
        this.f30176c = fa0Var2;
        fa0Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        fa0Var2.setTextColor(themedColor);
        fa0Var2.setLinkTextColor(themedColor2);
        fa0Var2.setTypeface(Typeface.SANS_SERIF);
        fa0Var2.setTextSize(1, 13.0f);
        linearLayout.addView(fa0Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        gk0 gk0Var = this.f30174a;
        gk0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            gk0Var.h(this.f30177e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f30175b.getText()) + ".\n" + ((Object) this.f30176c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f30174a.d();
    }
}
