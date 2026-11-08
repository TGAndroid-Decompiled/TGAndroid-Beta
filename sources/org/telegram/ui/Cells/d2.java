package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.id;
public final class d2 extends FrameLayout {
    public final org.telegram.ui.Components.j6 f29012a;
    public final View f29013b;
    public final org.telegram.ui.ActionBar.f6 f29014c;

    public d2(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i7;
        this.f29014c = f6Var;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f29012a = j6Var;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Z(j6Var, i10, f6Var);
        j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        j6Var.setGravity(i7);
        j6Var.setImportantForAccessibility(2);
        j6Var.setOnWidthUpdatedListener(new f(this, 2));
        addView(j6Var, c8.ha.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.f29013b = view;
        Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
        org.telegram.ui.ActionBar.r6.y(this, mutate, i10, f6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        addView(view, c8.ha.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float c10 = this.f29012a.getDrawable().c() + org.telegram.messenger.g0.L(1.0f);
        boolean z9 = id.f23157a0;
        View view = this.f29013b;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f29014c;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        org.telegram.ui.ActionBar.r6.Z(this.f29012a, i7, f6Var);
        this.f29013b.getBackground().setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
    }
}
