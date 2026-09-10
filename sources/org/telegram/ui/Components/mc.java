package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class mc extends mb {
    public final kj0 f25215a;
    public final m90 f25216b;
    public final m90 f25217c;
    public final LinearLayout d;
    public final int e;

    public mc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        ?? imageView = new ImageView(context);
        this.f25215a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.a6.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.a6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        m90 m90Var = new m90(context, null);
        this.f25216b = m90Var;
        m90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        m90Var.setTextColor(themedColor);
        m90Var.setTextSize(1, 14.0f);
        m90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(m90Var);
        m90 m90Var2 = new m90(context, null);
        this.f25217c = m90Var2;
        m90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        m90Var2.setTextColor(themedColor);
        m90Var2.setLinkTextColor(themedColor2);
        m90Var2.setTypeface(Typeface.SANS_SERIF);
        m90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(m90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        kj0 kj0Var = this.f25215a;
        kj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            kj0Var.h(this.e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f25216b.getText()) + ".\n" + ((Object) this.f25217c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f25215a.d();
    }
}
