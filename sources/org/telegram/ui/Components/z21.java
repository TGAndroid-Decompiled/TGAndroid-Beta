package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
public final class z21 extends ScrollView {
    public Drawable f40843a;
    public v5 f40844b;
    public boolean f40845c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        v5 v5Var = this.f40844b;
        if (canScrollVertically(-1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = v5Var.e(false, f10) * 0.5f;
        if (e10 > 0.0f) {
            if (this.f40843a == null) {
                this.f40843a = getContext().getResources().getDrawable(2131231237);
            }
            this.f40843a.setBounds(0, getScrollY(), getWidth(), this.f40843a.getIntrinsicHeight() + getScrollY());
            this.f40843a.setAlpha((int) (e10 * 255.0f));
            this.f40843a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        super.onNestedScroll(view, i7, i10, i11, i12);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f40845c != canScrollVertically) {
            invalidate();
            this.f40845c = canScrollVertically;
        }
    }
}
