package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
public final class c41 extends ScrollView {
    public Drawable f24982a;
    public t5 f24983b;
    public boolean f24984c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        t5 t5Var = this.f24983b;
        if (canScrollVertically(-1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float e = t5Var.e(false, f7) * 0.5f;
        if (e > 0.0f) {
            if (this.f24982a == null) {
                this.f24982a = getContext().getResources().getDrawable(2131231238);
            }
            this.f24982a.setBounds(0, getScrollY(), getWidth(), this.f24982a.getIntrinsicHeight() + getScrollY());
            this.f24982a.setAlpha((int) (e * 255.0f));
            this.f24982a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f24984c != canScrollVertically) {
            invalidate();
            this.f24984c = canScrollVertically;
        }
    }
}
