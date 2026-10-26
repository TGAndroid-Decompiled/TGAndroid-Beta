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
import org.telegram.ui.Components.gb1;
public final class x1 extends LinearLayout {
    public final ImageView f25684a;
    public final org.telegram.ui.Components.s6 f25685b;
    public final View f25686c;

    public x1(y1 y1Var, Context context, int i10) {
        super(context);
        int i11;
        int i12 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = y1Var.f25737b;
        org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.f25684a = imageView;
            org.telegram.ui.ActionBar.f7.t(imageView, i12, u6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(i10);
        }
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, true, false);
        this.f25685b = s6Var;
        s6Var.setTextSize(AndroidUtilities.dp(13.0f));
        org.telegram.ui.ActionBar.f7.Z(s6Var, i12, u6Var);
        s6Var.setIncludeFontPadding(false);
        s6Var.setTypeface(AndroidUtilities.bold());
        View view = new View(context);
        this.f25686c = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        org.telegram.ui.ActionBar.f7.y(this, mutate, i12, u6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        if (LocaleController.isRTL) {
            addView(view, gb1.x(16, 16, 16, 11, 0, 3, 0));
            addView(s6Var, gb1.x(-2, 16, 16, 0, 0, this.f25684a != null ? 3 : 11, 0));
            View view2 = this.f25684a;
            if (view2 != null) {
                addView(view2, gb1.x(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = this.f25684a;
            if (view3 != null) {
                addView(view3, gb1.x(16, 16, 16, 11, 0, 3, 0));
            }
            if (this.f25684a == null) {
                i11 = 11;
            } else {
                i11 = 0;
            }
            addView(s6Var, gb1.x(-2, 16, 16, i11, 0, 3, 0));
            addView(view, gb1.x(16, 16, 16, 0, 0, 11, 0));
        }
        int i13 = org.telegram.ui.ActionBar.y6.f23448i6;
        Drawable Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i13, u6Var), 16, 16);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i13);
        setBackground(Z);
        org.telegram.ui.ActionBar.f7.k(this, Z, null, N, u6Var);
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }
}
