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
    public final ImageView f20743a;
    public final org.telegram.ui.Components.o6 f20744b;
    public final View f20745c;

    public y1(z1 z1Var, Context context, int i10) {
        super(context);
        int i11;
        int i12;
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = z1Var.f20769b;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.f20743a = imageView;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
            imageView.setImageResource(i10);
        }
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, false);
        this.f20744b = o6Var;
        o6Var.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var.setTextColor(v02);
        o6Var.setIncludeFontPadding(false);
        o6Var.setTypeface(AndroidUtilities.bold());
        View view = new View(context);
        this.f20745c = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        view.setBackground(mutate);
        if (LocaleController.isRTL) {
            addView(view, w7.a6.t(16, 16, 16, 11, 0, 3, 0));
            if (this.f20743a == null) {
                i12 = 11;
            } else {
                i12 = 3;
            }
            addView(o6Var, w7.a6.t(-2, 16, 16, 0, 0, i12, 0));
            View view2 = this.f20743a;
            if (view2 != null) {
                addView(view2, w7.a6.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = this.f20743a;
            if (view3 != null) {
                addView(view3, w7.a6.t(16, 16, 16, 11, 0, 3, 0));
            }
            if (this.f20743a == null) {
                i11 = 11;
            } else {
                i11 = 0;
            }
            addView(o6Var, w7.a6.t(-2, 16, 16, i11, 0, 3, 0));
            addView(view, w7.a6.t(16, 16, 16, 0, 0, 11, 0));
        }
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var), 16, 16));
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }
}
