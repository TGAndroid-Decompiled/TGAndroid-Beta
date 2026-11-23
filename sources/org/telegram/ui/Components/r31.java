package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
public final class r31 extends ScrollView {
    public Drawable f39018a;
    public d6 f39019b;
    public boolean f39020c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        d6 d6Var = this.f39019b;
        if (canScrollVertically(-1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = d6Var.e(false, f10) * 0.5f;
        if (e10 > 0.0f) {
            if (this.f39018a == null) {
                this.f39018a = getContext().getResources().getDrawable(2131231237);
            }
            this.f39018a.setBounds(0, getScrollY(), getWidth(), this.f39018a.getIntrinsicHeight() + getScrollY());
            this.f39018a.setAlpha((int) (e10 * 255.0f));
            this.f39018a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        super.onNestedScroll(view, i7, i10, i11, i12);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f39020c != canScrollVertically) {
            invalidate();
            this.f39020c = canScrollVertically;
        }
    }
}
