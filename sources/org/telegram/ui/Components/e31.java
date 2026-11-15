package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
public final class e31 extends ScrollView {
    public Drawable f34170a;
    public u5 f34171b;
    public boolean f34172c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        u5 u5Var = this.f34171b;
        if (canScrollVertically(-1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = u5Var.e(false, f10) * 0.5f;
        if (e10 > 0.0f) {
            if (this.f34170a == null) {
                this.f34170a = getContext().getResources().getDrawable(2131231237);
            }
            this.f34170a.setBounds(0, getScrollY(), getWidth(), this.f34170a.getIntrinsicHeight() + getScrollY());
            this.f34170a.setAlpha((int) (e10 * 255.0f));
            this.f34170a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        super.onNestedScroll(view, i7, i10, i11, i12);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f34172c != canScrollVertically) {
            invalidate();
            this.f34172c = canScrollVertically;
        }
    }
}
