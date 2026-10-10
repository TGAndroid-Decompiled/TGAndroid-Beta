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
    public final ImageView f23799a;
    public final org.telegram.ui.Components.r6 f23800b;
    public final View f23801c;

    public z1(a2 a2Var, Context context, int i10) {
        super(context);
        int i11;
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = a2Var.f21785b;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i12, e6Var);
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.f23799a = imageView;
            imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            imageView.setImageResource(i10);
        }
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, false, true, false);
        this.f23800b = r6Var;
        r6Var.setTextSize(AndroidUtilities.dp(13.0f));
        r6Var.setTextColor(w02);
        r6Var.setIncludeFontPadding(false);
        r6Var.setTypeface(AndroidUtilities.bold());
        View view = new View(context);
        this.f23801c = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        view.setBackground(mutate);
        if (LocaleController.isRTL) {
            addView(view, w7.x5.t(16, 16, 16, 11, 0, 3, 0));
            addView(r6Var, w7.x5.t(-2, 16, 16, 0, 0, this.f23799a != null ? 3 : 11, 0));
            View view2 = this.f23799a;
            if (view2 != null) {
                addView(view2, w7.x5.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = this.f23799a;
            if (view3 != null) {
                addView(view3, w7.x5.t(16, 16, 16, 11, 0, 3, 0));
            }
            if (this.f23799a == null) {
                i11 = 11;
            } else {
                i11 = 0;
            }
            addView(r6Var, w7.x5.t(-2, 16, 16, i11, 0, 3, 0));
            addView(view, w7.x5.t(16, 16, 16, 0, 0, 11, 0));
        }
        setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20892i6, e6Var), 16, 16));
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }
}
