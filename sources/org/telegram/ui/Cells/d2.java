package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.messenger.bd;
public final class d2 extends FrameLayout {
    public final org.telegram.ui.Components.h6 f29075a;
    public final View f29076b;
    public final org.telegram.ui.ActionBar.e6 f29077c;

    public d2(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3;
        this.f29077c = e6Var;
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f29075a = h6Var;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i10, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        h6Var.setGravity(i3);
        h6Var.setImportantForAccessibility(2);
        h6Var.setOnWidthUpdatedListener(new f(this, 2));
        addView(h6Var, mf.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.f29076b = view;
        Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
        org.telegram.ui.ActionBar.r6.y(this, mutate, i10, e6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        addView(view, mf.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float c2 = this.f29075a.getDrawable().c() + org.telegram.messenger.g0.L(1.0f);
        boolean z10 = bd.f21784a0;
        View view = this.f29076b;
        if (z10) {
            view.setTranslationX(-c2);
        } else {
            view.setTranslationX(c2);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(46.0f), 1073741824));
        a();
    }

    public void setColor(int i3) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f29077c;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        org.telegram.ui.ActionBar.r6.Z(this.f29075a, i3, e6Var);
        this.f29076b.getBackground().setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
    }
}
