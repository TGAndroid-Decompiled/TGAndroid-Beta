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
public final class z1 extends LinearLayout {
    public final ImageView f21867a;
    public final org.telegram.ui.Components.p6 f21868b;
    public final View f21869c;

    public z1(a2 a2Var, Context context, int i10) {
        super(context);
        int i11;
        int i12;
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = a2Var.f19970b;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i13, e6Var);
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.f21867a = imageView;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
            imageView.setImageResource(i10);
        }
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, true, false);
        this.f21868b = p6Var;
        p6Var.setTextSize(AndroidUtilities.dp(13.0f));
        p6Var.setTextColor(v02);
        p6Var.setIncludeFontPadding(false);
        p6Var.setTypeface(AndroidUtilities.bold());
        View view = new View(context);
        this.f21869c = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        view.setBackground(mutate);
        if (LocaleController.isRTL) {
            addView(view, w7.y5.t(16, 16, 16, 11, 0, 3, 0));
            if (this.f21867a == null) {
                i12 = 11;
            } else {
                i12 = 3;
            }
            addView(p6Var, w7.y5.t(-2, 16, 16, 0, 0, i12, 0));
            View view2 = this.f21867a;
            if (view2 != null) {
                addView(view2, w7.y5.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = this.f21867a;
            if (view3 != null) {
                addView(view3, w7.y5.t(16, 16, 16, 11, 0, 3, 0));
            }
            if (this.f21867a == null) {
                i11 = 11;
            } else {
                i11 = 0;
            }
            addView(p6Var, w7.y5.t(-2, 16, 16, i11, 0, 3, 0));
            addView(view, w7.y5.t(16, 16, 16, 0, 0, 11, 0));
        }
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19152i6, e6Var), 16, 16));
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }
}
