package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x1 extends LinearLayout {
    public final ImageView f25910a;
    public final org.telegram.ui.Components.o6 f25911b;
    public final View f25912c;

    public x1(y1 y1Var, Context context, int i10) {
        super(context);
        int i11;
        int i12;
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = y1Var.f25983b;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i13, c6Var);
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.f25910a = imageView;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
            imageView.setImageResource(i10);
        }
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, false);
        this.f25911b = o6Var;
        o6Var.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var.setTextColor(v02);
        o6Var.setIncludeFontPadding(false);
        o6Var.setTypeface(AndroidUtilities.bold());
        View view = new View(context);
        this.f25912c = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        view.setBackground(mutate);
        if (LocaleController.isRTL) {
            addView(view, i7.f6.t(16, 16, 16, 11, 0, 3, 0));
            if (this.f25910a == null) {
                i12 = 11;
            } else {
                i12 = 3;
            }
            addView(o6Var, i7.f6.t(-2, 16, 16, 0, 0, i12, 0));
            View view2 = this.f25910a;
            if (view2 != null) {
                addView(view2, i7.f6.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = this.f25910a;
            if (view3 != null) {
                addView(view3, i7.f6.t(16, 16, 16, 11, 0, 3, 0));
            }
            if (this.f25910a == null) {
                i11 = 11;
            } else {
                i11 = 0;
            }
            addView(o6Var, i7.f6.t(-2, 16, 16, i11, 0, 3, 0));
            addView(view, i7.f6.t(16, 16, 16, 0, 0, 11, 0));
        }
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 16, 16));
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }
}
