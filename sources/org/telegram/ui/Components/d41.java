package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
public final class d41 extends ScrollView {
    public Drawable f25366a;
    public t5 f25367b;
    public boolean f25368c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        t5 t5Var = this.f25367b;
        if (canScrollVertically(-1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float e = t5Var.e(false, f7) * 0.5f;
        if (e > 0.0f) {
            if (this.f25366a == null) {
                this.f25366a = getContext().getResources().getDrawable(2131231238);
            }
            this.f25366a.setBounds(0, getScrollY(), getWidth(), this.f25366a.getIntrinsicHeight() + getScrollY());
            this.f25366a.setAlpha((int) (e * 255.0f));
            this.f25366a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f25368c != canScrollVertically) {
            invalidate();
            this.f25368c = canScrollVertically;
        }
    }
}
