package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
public final class e31 extends ScrollView {
    public Drawable f34183a;
    public u5 f34184b;
    public boolean f34185c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        u5 u5Var = this.f34184b;
        if (canScrollVertically(-1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = u5Var.e(false, f10) * 0.5f;
        if (e10 > 0.0f) {
            if (this.f34183a == null) {
                this.f34183a = getContext().getResources().getDrawable(2131231237);
            }
            this.f34183a.setBounds(0, getScrollY(), getWidth(), this.f34183a.getIntrinsicHeight() + getScrollY());
            this.f34183a.setAlpha((int) (e10 * 255.0f));
            this.f34183a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        super.onNestedScroll(view, i7, i10, i11, i12);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f34185c != canScrollVertically) {
            invalidate();
            this.f34185c = canScrollVertically;
        }
    }
}
