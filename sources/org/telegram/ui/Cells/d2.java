package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.gd;
public final class d2 extends FrameLayout {
    public final org.telegram.ui.Components.n6 f30514a;
    public final View f30515b;
    public final org.telegram.ui.ActionBar.i6 f30516c;

    public d2(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i7;
        this.f30516c = i6Var;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, false, false);
        this.f30514a = n6Var;
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.Y(n6Var, i10, i6Var);
        n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        if (gd.f24216a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        n6Var.setGravity(i7);
        n6Var.setImportantForAccessibility(2);
        n6Var.setOnWidthUpdatedListener(new f(this, 3));
        addView(n6Var, c8.ma.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.f30515b = view;
        Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
        org.telegram.ui.ActionBar.u6.x(this, mutate, i10, i6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        addView(view, c8.ma.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float c10 = this.f30514a.getDrawable().c() + org.telegram.messenger.g0.L(1.0f);
        boolean z10 = gd.f24216a0;
        View view = this.f30515b;
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
        org.telegram.ui.ActionBar.i6 i6Var = this.f30516c;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        org.telegram.ui.ActionBar.u6.Y(this.f30514a, i7, i6Var);
        this.f30515b.getBackground().setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
    }
}
