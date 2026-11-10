package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.id;
public final class d2 extends FrameLayout {
    public final org.telegram.ui.Components.i6 f29027a;
    public final View f29028b;
    public final org.telegram.ui.ActionBar.h6 f29029c;

    public d2(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7;
        this.f29029c = h6Var;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, false, false, false);
        this.f29027a = i6Var;
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.Y(i6Var, i10, h6Var);
        i6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        if (id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        i6Var.setGravity(i7);
        i6Var.setImportantForAccessibility(2);
        i6Var.setOnWidthUpdatedListener(new f(this, 2));
        addView(i6Var, c8.ha.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.f29028b = view;
        Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
        org.telegram.ui.ActionBar.t6.x(this, mutate, i10, h6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        addView(view, c8.ha.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float c10 = this.f29027a.getDrawable().c() + org.telegram.messenger.g0.L(1.0f);
        boolean z9 = id.f23161a0;
        View view = this.f29028b;
        if (z9) {
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
        org.telegram.ui.ActionBar.h6 h6Var = this.f29029c;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        org.telegram.ui.ActionBar.t6.Y(this.f29027a, i7, h6Var);
        this.f29028b.getBackground().setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
    }
}
