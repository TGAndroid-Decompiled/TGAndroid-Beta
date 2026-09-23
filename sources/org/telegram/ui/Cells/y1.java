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
public final class y1 extends LinearLayout {
    public final ImageView f21622a;
    public final org.telegram.ui.Components.p6 f21623b;
    public final View f21624c;

    public y1(z1 z1Var, Context context, int i10) {
        super(context);
        int i11;
        int i12;
        int i13 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = z1Var.f21655b;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i13, d6Var);
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.f21622a = imageView;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
            imageView.setImageResource(i10);
        }
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, true, false);
        this.f21623b = p6Var;
        p6Var.setTextSize(AndroidUtilities.dp(13.0f));
        p6Var.setTextColor(v02);
        p6Var.setIncludeFontPadding(false);
        p6Var.setTypeface(AndroidUtilities.bold());
        View view = new View(context);
        this.f21624c = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        view.setBackground(mutate);
        if (LocaleController.isRTL) {
            addView(view, w7.x5.t(16, 16, 16, 11, 0, 3, 0));
            if (this.f21622a == null) {
                i12 = 11;
            } else {
                i12 = 3;
            }
            addView(p6Var, w7.x5.t(-2, 16, 16, 0, 0, i12, 0));
            View view2 = this.f21622a;
            if (view2 != null) {
                addView(view2, w7.x5.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = this.f21622a;
            if (view3 != null) {
                addView(view3, w7.x5.t(16, 16, 16, 11, 0, 3, 0));
            }
            if (this.f21622a == null) {
                i11 = 11;
            } else {
                i11 = 0;
            }
            addView(p6Var, w7.x5.t(-2, 16, 16, i11, 0, 3, 0));
            addView(view, w7.x5.t(16, 16, 16, 0, 0, 11, 0));
        }
        setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18878i6, d6Var), 16, 16));
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }
}
