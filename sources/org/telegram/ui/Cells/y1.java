package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class y1 extends LinearLayout {
    public final ImageView f23968a;
    public final org.telegram.ui.Components.o6 f23969b;
    public final View f23970c;

    public y1(z1 z1Var, Context context, int i10) {
        super(context);
        int i11;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = z1Var.f24012b;
        org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.f23968a = imageView;
            org.telegram.ui.ActionBar.r6.t(imageView, i12, g6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(i10);
        }
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, false);
        this.f23969b = o6Var;
        o6Var.setTextSize(AndroidUtilities.dp(13.0f));
        org.telegram.ui.ActionBar.r6.a0(o6Var, i12, g6Var);
        o6Var.setIncludeFontPadding(false);
        o6Var.setTypeface(AndroidUtilities.bold());
        View view = new View(context);
        this.f23970c = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        org.telegram.ui.ActionBar.r6.z(this, mutate, i12, g6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        if (LocaleController.isRTL) {
            addView(view, w7.z5.t(16, 16, 16, 11, 0, 3, 0));
            addView(o6Var, w7.z5.t(-2, 16, 16, 0, 0, this.f23968a != null ? 3 : 11, 0));
            View view2 = this.f23968a;
            if (view2 != null) {
                addView(view2, w7.z5.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = this.f23968a;
            if (view3 != null) {
                addView(view3, w7.z5.t(16, 16, 16, 11, 0, 3, 0));
            }
            if (this.f23968a == null) {
                i11 = 11;
            } else {
                i11 = 0;
            }
            addView(o6Var, w7.z5.t(-2, 16, 16, i11, 0, 3, 0));
            addView(view, w7.z5.t(16, 16, 16, 0, 0, 11, 0));
        }
        int i13 = org.telegram.ui.ActionBar.k6.f21273i6;
        Drawable Z = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i13, g6Var), 16, 16);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i13);
        setBackground(Z);
        org.telegram.ui.ActionBar.r6.k(this, Z, null, O, g6Var);
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }
}
