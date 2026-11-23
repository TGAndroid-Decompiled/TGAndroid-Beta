package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
public final class q31 extends ScrollView {
    public Drawable f38681a;
    public c6 f38682b;
    public boolean f38683c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        c6 c6Var = this.f38682b;
        if (canScrollVertically(-1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = c6Var.e(false, f10) * 0.5f;
        if (e10 > 0.0f) {
            if (this.f38681a == null) {
                this.f38681a = getContext().getResources().getDrawable(2131231240);
            }
            this.f38681a.setBounds(0, getScrollY(), getWidth(), this.f38681a.getIntrinsicHeight() + getScrollY());
            this.f38681a.setAlpha((int) (e10 * 255.0f));
            this.f38681a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        super.onNestedScroll(view, i7, i10, i11, i12);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f38683c != canScrollVertically) {
            invalidate();
            this.f38683c = canScrollVertically;
        }
    }
}
