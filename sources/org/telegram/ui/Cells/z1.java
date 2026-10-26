package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gb1;
public final class z1 extends FrameLayout {
    public final org.telegram.ui.Components.s6 f25775a;
    public final View f25776b;
    public final org.telegram.ui.ActionBar.u6 f25777c;

    public z1(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i10;
        this.f25777c = u6Var;
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.f25775a = s6Var;
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.Z(s6Var, i11, u6Var);
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        s6Var.setGravity(i10);
        s6Var.setImportantForAccessibility(2);
        s6Var.setOnWidthUpdatedListener(new g(this, 2));
        addView(s6Var, gb1.m(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.f25776b = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        org.telegram.ui.ActionBar.f7.y(this, mutate, i11, u6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        addView(view, gb1.m(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float c10 = this.f25775a.getDrawable().c() + AndroidUtilities.dp(1.0f);
        boolean z10 = LocaleController.isRTL;
        View view = this.f25776b;
        if (z10) {
            view.setTranslationX(-c10);
        } else {
            view.setTranslationX(c10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(46.0f), 1073741824));
        a();
    }

    public void setColor(int i10) {
        org.telegram.ui.ActionBar.u6 u6Var = this.f25777c;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        org.telegram.ui.ActionBar.f7.Z(this.f25775a, i10, u6Var);
        this.f25776b.getBackground().setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
    }
}
