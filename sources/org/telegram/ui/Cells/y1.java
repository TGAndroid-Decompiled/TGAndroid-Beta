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
    public final ImageView f25979a;
    public final org.telegram.ui.Components.j6 f25980b;
    public final View f25981c;

    public y1(z1 z1Var, Context context, int i9) {
        super(context);
        int i10;
        int i11;
        int i12 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = z1Var.f26010b;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i12, b6Var);
        if (i9 != 0) {
            ImageView imageView = new ImageView(context);
            this.f25979a = imageView;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
            imageView.setImageResource(i9);
        }
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, false);
        this.f25980b = j6Var;
        j6Var.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var.setTextColor(v02);
        j6Var.setIncludeFontPadding(false);
        j6Var.setTypeface(AndroidUtilities.bold());
        View view = new View(context);
        this.f25981c = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        view.setBackground(mutate);
        if (LocaleController.isRTL) {
            addView(view, g7.e6.t(16, 16, 16, 11, 0, 3, 0));
            if (this.f25979a == null) {
                i11 = 11;
            } else {
                i11 = 3;
            }
            addView(j6Var, g7.e6.t(-2, 16, 16, 0, 0, i11, 0));
            View view2 = this.f25979a;
            if (view2 != null) {
                addView(view2, g7.e6.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = this.f25979a;
            if (view3 != null) {
                addView(view3, g7.e6.t(16, 16, 16, 11, 0, 3, 0));
            }
            if (this.f25979a == null) {
                i10 = 11;
            } else {
                i10 = 0;
            }
            addView(j6Var, g7.e6.t(-2, 16, 16, i10, 0, 3, 0));
            addView(view, g7.e6.t(16, 16, 16, 0, 0, 11, 0));
        }
        setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 16, 16));
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }
}
