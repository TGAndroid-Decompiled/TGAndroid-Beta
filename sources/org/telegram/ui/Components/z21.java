package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
public final class z21 extends ScrollView {
    public Drawable f40874a;
    public w5 f40875b;
    public boolean f40876c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        w5 w5Var = this.f40875b;
        if (canScrollVertically(-1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = w5Var.e(false, f10) * 0.5f;
        if (e10 > 0.0f) {
            if (this.f40874a == null) {
                this.f40874a = getContext().getResources().getDrawable(2131231237);
            }
            this.f40874a.setBounds(0, getScrollY(), getWidth(), this.f40874a.getIntrinsicHeight() + getScrollY());
            this.f40874a.setAlpha((int) (e10 * 255.0f));
            this.f40874a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        super.onNestedScroll(view, i7, i10, i11, i12);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f40876c != canScrollVertically) {
            invalidate();
            this.f40876c = canScrollVertically;
        }
    }
}
