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
    public final ImageView f21661a;
    public final org.telegram.ui.Components.n6 f21662b;
    public final View f21663c;

    public y1(z1 z1Var, Context context, int i10) {
        super(context);
        int i11;
        int i12;
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = z1Var.f21684b;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.f21661a = imageView;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
            imageView.setImageResource(i10);
        }
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, false);
        this.f21662b = n6Var;
        n6Var.setTextSize(AndroidUtilities.dp(13.0f));
        n6Var.setTextColor(v02);
        n6Var.setIncludeFontPadding(false);
        n6Var.setTypeface(AndroidUtilities.bold());
        View view = new View(context);
        this.f21663c = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        view.setBackground(mutate);
        if (LocaleController.isRTL) {
            addView(view, w7.x5.t(16, 16, 16, 11, 0, 3, 0));
            if (this.f21661a == null) {
                i12 = 11;
            } else {
                i12 = 3;
            }
            addView(n6Var, w7.x5.t(-2, 16, 16, 0, 0, i12, 0));
            View view2 = this.f21661a;
            if (view2 != null) {
                addView(view2, w7.x5.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = this.f21661a;
            if (view3 != null) {
                addView(view3, w7.x5.t(16, 16, 16, 11, 0, 3, 0));
            }
            if (this.f21661a == null) {
                i11 = 11;
            } else {
                i11 = 0;
            }
            addView(n6Var, w7.x5.t(-2, 16, 16, i11, 0, 3, 0));
            addView(view, w7.x5.t(16, 16, 16, 0, 0, 11, 0));
        }
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18953i6, f6Var), 16, 16));
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }
}
