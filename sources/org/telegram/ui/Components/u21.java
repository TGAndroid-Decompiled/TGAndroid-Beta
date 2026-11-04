package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
public final class u21 extends ScrollView {
    public Drawable f38627a;
    public u5 f38628b;
    public boolean f38629c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        u5 u5Var = this.f38628b;
        if (canScrollVertically(-1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = u5Var.e(false, f10) * 0.5f;
        if (e10 > 0.0f) {
            if (this.f38627a == null) {
                this.f38627a = getContext().getResources().getDrawable(2131231237);
            }
            this.f38627a.setBounds(0, getScrollY(), getWidth(), this.f38627a.getIntrinsicHeight() + getScrollY());
            this.f38627a.setAlpha((int) (e10 * 255.0f));
            this.f38627a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i3, int i10, int i11, int i12) {
        super.onNestedScroll(view, i3, i10, i11, i12);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f38629c != canScrollVertically) {
            invalidate();
            this.f38629c = canScrollVertically;
        }
    }
}
