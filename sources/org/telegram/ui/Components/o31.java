package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
public final class o31 extends ScrollView {
    public Drawable f37949a;
    public c6 f37950b;
    public boolean f37951c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        c6 c6Var = this.f37950b;
        if (canScrollVertically(-1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = c6Var.e(false, f10) * 0.5f;
        if (e10 > 0.0f) {
            if (this.f37949a == null) {
                this.f37949a = getContext().getResources().getDrawable(2131231237);
            }
            this.f37949a.setBounds(0, getScrollY(), getWidth(), this.f37949a.getIntrinsicHeight() + getScrollY());
            this.f37949a.setAlpha((int) (e10 * 255.0f));
            this.f37949a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        super.onNestedScroll(view, i7, i10, i11, i12);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f37951c != canScrollVertically) {
            invalidate();
            this.f37951c = canScrollVertically;
        }
    }
}
