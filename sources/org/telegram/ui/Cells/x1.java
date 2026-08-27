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

    public final ImageView f25922a;

    public final org.telegram.ui.Components.j6 f25923b;

    public final View f25924c;

    public x1(y1 y1Var, Context context, int i10) {
        super(context);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = y1Var.f25976b;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.f25922a = imageView;
            imageView.setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.MULTIPLY));
            imageView.setImageResource(i10);
        }
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, false);
        this.f25923b = j6Var;
        j6Var.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var.setTextColor(iV0);
        j6Var.setIncludeFontPadding(false);
        j6Var.setTypeface(AndroidUtilities.bold());
        View view = new View(context);
        this.f25924c = view;
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.MULTIPLY));
        view.setBackground(drawableMutate);
        if (LocaleController.isRTL) {
            addView(view, h7.z5.t(16, 16, 16, 11, 0, 3, 0));
            addView(j6Var, h7.z5.t(-2, 16, 16, 0, 0, this.f25922a == null ? 11 : 3, 0));
            View view2 = this.f25922a;
            if (view2 != null) {
                addView(view2, h7.z5.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = this.f25922a;
            if (view3 != null) {
                addView(view3, h7.z5.t(16, 16, 16, 11, 0, 3, 0));
            }
            addView(j6Var, h7.z5.t(-2, 16, 16, this.f25922a == null ? 11 : 0, 0, 3, 0));
            addView(view, h7.z5.t(16, 16, 16, 0, 0, 11, 0));
        }
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 16, 16));
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }
}
