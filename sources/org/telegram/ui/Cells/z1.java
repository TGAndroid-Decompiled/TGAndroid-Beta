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

public final class z1 extends FrameLayout {

    public final org.telegram.ui.Components.j6 f26015a;

    public final View f26016b;

    public final org.telegram.ui.ActionBar.c6 f26017c;

    public z1(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f26017c = c6Var;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f26015a = j6Var;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        j6Var.setImportantForAccessibility(2);
        j6Var.setOnWidthUpdatedListener(new g(this, 2));
        addView(j6Var, h7.z5.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.f26016b = view;
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        view.setBackground(drawableMutate);
        addView(view, h7.z5.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float fD = this.f26015a.getDrawable().d() + AndroidUtilities.dp(1.0f);
        boolean z10 = LocaleController.isRTL;
        View view = this.f26016b;
        if (z10) {
            view.setTranslationX(-fD);
        } else {
            view.setTranslationX(fD);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(46.0f), 1073741824));
        a();
    }

    public void setColor(int i10) {
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, this.f26017c);
        this.f26015a.setTextColor(iV0);
        this.f26016b.getBackground().setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.MULTIPLY));
    }
}
