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
    public final org.telegram.ui.Components.o6 f26031a;
    public final View f26032b;
    public final org.telegram.ui.ActionBar.c6 f26033c;

    public z1(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        this.f26033c = c6Var;
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f26031a = o6Var;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        o6Var.setGravity(i10);
        o6Var.setImportantForAccessibility(2);
        o6Var.setOnWidthUpdatedListener(new g(this, 2));
        addView(o6Var, i7.f6.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.f26032b = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
        view.setBackground(mutate);
        addView(view, i7.f6.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float d = this.f26031a.getDrawable().d() + AndroidUtilities.dp(1.0f);
        boolean z10 = LocaleController.isRTL;
        View view = this.f26032b;
        if (z10) {
            view.setTranslationX(-d);
        } else {
            view.setTranslationX(d);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(46.0f), 1073741824));
        a();
    }

    public void setColor(int i10) {
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, this.f26033c);
        this.f26031a.setTextColor(v02);
        this.f26032b.getBackground().setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
    }
}
