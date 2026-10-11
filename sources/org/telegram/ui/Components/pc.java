package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class pc extends pb {
    public final gk0 f29839a;
    public final ea0 f29840b;
    public final ea0 f29841c;
    public final LinearLayout d;
    public final int f29842e;

    public pc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int i10 = org.telegram.ui.ActionBar.h6.Hi;
        this.f29842e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        ?? imageView = new ImageView(context);
        this.f29839a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.x5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        ea0 ea0Var = new ea0(context, null);
        this.f29840b = ea0Var;
        ea0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        ea0Var.setTextColor(themedColor);
        ea0Var.setTextSize(1, 14.0f);
        ea0Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(ea0Var);
        ea0 ea0Var2 = new ea0(context, null);
        this.f29841c = ea0Var2;
        ea0Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        ea0Var2.setTextColor(themedColor);
        ea0Var2.setLinkTextColor(themedColor2);
        ea0Var2.setTypeface(Typeface.SANS_SERIF);
        ea0Var2.setTextSize(1, 13.0f);
        linearLayout.addView(ea0Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        gk0 gk0Var = this.f29839a;
        gk0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            gk0Var.h(this.f29842e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f29840b.getText()) + ".\n" + ((Object) this.f29841c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f29839a.d();
    }
}
