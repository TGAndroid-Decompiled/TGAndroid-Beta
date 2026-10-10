package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nc extends qb {
    public final gk0 f29095a;
    public final r6 f29096b;
    public final r6 f29097c;
    public final int d;

    public nc(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i10 = org.telegram.ui.ActionBar.i6.Hi;
        this.d = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
        ?? imageView = new ImageView(context);
        this.f29095a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.x5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        getThemedColor(org.telegram.ui.ActionBar.i6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        r6 r6Var = new r6(context, true, true, true);
        this.f29096b = r6Var;
        r6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        r6Var.setTextColor(themedColor);
        r6Var.setTextSize(AndroidUtilities.dp(14.0f));
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setEllipsizeByGradient(true);
        linearLayout.addView(r6Var, w7.x5.n(-1, 20));
        r6 r6Var2 = new r6(context, true, true, true);
        this.f29097c = r6Var2;
        r6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        r6Var2.setTextColor(themedColor);
        r6Var2.setTypeface(Typeface.SANS_SERIF);
        r6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        r6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(r6Var2, w7.x5.n(-1, 18));
    }

    public final void c(int i10, String... strArr) {
        gk0 gk0Var = this.f29095a;
        gk0Var.f(i10, 32, 32, null);
        for (String str : strArr) {
            gk0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f29096b.getText()) + ".\n" + ((Object) this.f29097c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f29095a.d();
    }
}
