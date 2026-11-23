package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.hd;
public final class e2 extends FrameLayout {
    public final org.telegram.ui.Components.o6 f30591a;
    public final View f30592b;
    public final org.telegram.ui.ActionBar.h6 f30593c;

    public e2(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7;
        this.f30593c = h6Var;
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f30591a = o6Var;
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.Y(o6Var, i10, h6Var);
        o6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        if (hd.f24444a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        o6Var.setGravity(i7);
        o6Var.setImportantForAccessibility(2);
        o6Var.setOnWidthUpdatedListener(new f(this, 3));
        addView(o6Var, c8.ma.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.f30592b = view;
        Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
        org.telegram.ui.ActionBar.t6.x(this, mutate, i10, h6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        addView(view, c8.ma.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float c10 = this.f30591a.getDrawable().c() + org.telegram.messenger.g0.L(1.0f);
        boolean z10 = hd.f24444a0;
        View view = this.f30592b;
        if (z10) {
            view.setTranslationX(-c10);
        } else {
            view.setTranslationX(c10);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(46.0f), 1073741824));
        a();
    }

    public void setColor(int i7) {
        org.telegram.ui.ActionBar.h6 h6Var = this.f30593c;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        org.telegram.ui.ActionBar.t6.Y(this.f30591a, i7, h6Var);
        this.f30592b.getBackground().setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
    }
}
