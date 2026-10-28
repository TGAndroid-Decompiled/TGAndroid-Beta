package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class kc extends nb {
    public final bk0 f29925a;
    public final s6 f29926b;
    public final s6 f29927c;
    public final int d;

    public kc(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        int i10 = org.telegram.ui.ActionBar.y6.Hi;
        this.d = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
        ?? imageView = new ImageView(context);
        this.f29925a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, kb1.l(56.0f, 48.0f, 8388627));
        getThemedColor(i10);
        getThemedColor(org.telegram.ui.ActionBar.y6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, kb1.m(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        s6 s6Var = new s6(context, true, true, true);
        this.f29926b = s6Var;
        s6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.f7.Z(s6Var, i10, u6Var);
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setEllipsizeByGradient(true);
        linearLayout.addView(s6Var, kb1.r(-1, 20));
        s6 s6Var2 = new s6(context, true, true, true);
        this.f29927c = s6Var2;
        s6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.f7.Z(s6Var2, i10, u6Var);
        s6Var2.setTypeface(Typeface.SANS_SERIF);
        s6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(s6Var2, kb1.r(-1, 18));
    }

    public final void c(int i10, String... strArr) {
        bk0 bk0Var = this.f29925a;
        bk0Var.f(i10, 32, 32, null);
        for (String str : strArr) {
            bk0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f29926b.getText()) + ".\n" + ((Object) this.f29927c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f29925a.d();
    }
}
