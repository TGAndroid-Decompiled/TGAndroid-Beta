package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.hd;
public final class d2 extends FrameLayout {
    public final org.telegram.ui.Components.h6 f30133a;
    public final View f30134b;
    public final org.telegram.ui.ActionBar.e6 f30135c;

    public d2(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i7;
        this.f30135c = e6Var;
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f30133a = h6Var;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.Y(h6Var, i10, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        if (hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        h6Var.setGravity(i7);
        h6Var.setImportantForAccessibility(2);
        h6Var.setOnWidthUpdatedListener(new f(this, 3));
        addView(h6Var, c8.ja.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.f30134b = view;
        Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
        org.telegram.ui.ActionBar.q6.x(this, mutate, i10, e6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        addView(view, c8.ja.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float c10 = this.f30133a.getDrawable().c() + org.telegram.messenger.g0.L(1.0f);
        boolean z10 = hd.f24104a0;
        View view = this.f30134b;
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f30135c;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        org.telegram.ui.ActionBar.q6.Y(this.f30133a, i7, e6Var);
        this.f30134b.getBackground().setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
    }
}
