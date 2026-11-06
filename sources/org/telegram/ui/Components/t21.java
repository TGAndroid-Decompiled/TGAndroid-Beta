package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
public final class t21 extends ScrollView {
    public Drawable f38241a;
    public w5 f38242b;
    public boolean f38243c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        w5 w5Var = this.f38242b;
        if (canScrollVertically(-1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = w5Var.e(false, f10) * 0.5f;
        if (e10 > 0.0f) {
            if (this.f38241a == null) {
                this.f38241a = getContext().getResources().getDrawable(2131231237);
            }
            this.f38241a.setBounds(0, getScrollY(), getWidth(), this.f38241a.getIntrinsicHeight() + getScrollY());
            this.f38241a.setAlpha((int) (e10 * 255.0f));
            this.f38241a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        super.onNestedScroll(view, i7, i10, i11, i12);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f38243c != canScrollVertically) {
            invalidate();
            this.f38243c = canScrollVertically;
        }
    }
}
