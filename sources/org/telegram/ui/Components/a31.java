package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
public final class a31 extends ScrollView {
    public Drawable f31701a;
    public w5 f31702b;
    public boolean f31703c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        w5 w5Var = this.f31702b;
        if (canScrollVertically(-1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = w5Var.e(false, f10) * 0.5f;
        if (e10 > 0.0f) {
            if (this.f31701a == null) {
                this.f31701a = getContext().getResources().getDrawable(2131231237);
            }
            this.f31701a.setBounds(0, getScrollY(), getWidth(), this.f31701a.getIntrinsicHeight() + getScrollY());
            this.f31701a.setAlpha((int) (e10 * 255.0f));
            this.f31701a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        super.onNestedScroll(view, i7, i10, i11, i12);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f31703c != canScrollVertically) {
            invalidate();
            this.f31703c = canScrollVertically;
        }
    }
}
