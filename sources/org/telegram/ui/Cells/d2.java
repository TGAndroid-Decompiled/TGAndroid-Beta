package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.dd;
public final class d2 extends FrameLayout {
    public final org.telegram.ui.Components.f6 f21807a;
    public final View f21808b;
    public final org.telegram.ui.ActionBar.p6 f21809c;

    public d2(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10;
        this.f21809c = p6Var;
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, false, false);
        this.f21807a = f6Var;
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.Z(f6Var, i11, p6Var);
        f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        f6Var.setGravity(i10);
        f6Var.setImportantForAccessibility(2);
        f6Var.setOnWidthUpdatedListener(new f(this, 2));
        addView(f6Var, w7.b6.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.f21808b = view;
        Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
        org.telegram.ui.ActionBar.a7.y(this, mutate, i11, p6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        addView(view, w7.b6.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float c10 = this.f21807a.getDrawable().c() + org.telegram.messenger.i0.L(1.0f);
        boolean z10 = dd.X;
        View view = this.f21808b;
        if (z10) {
            view.setTranslationX(-c10);
        } else {
            view.setTranslationX(c10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(46.0f), 1073741824));
        a();
    }

    public void setColor(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.f21809c;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        org.telegram.ui.ActionBar.a7.Z(this.f21807a, i10, p6Var);
        this.f21808b.getBackground().setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
    }
}
