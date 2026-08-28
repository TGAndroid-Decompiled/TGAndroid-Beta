package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class o31 extends ScrollView {
    public Drawable f31278a;
    public y5 f31279b;
    public boolean f31280c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        y5 y5Var = this.f31279b;
        if (canScrollVertically(-1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = y5Var.d(f10, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f31278a == null) {
                this.f31278a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f31278a.setBounds(0, getScrollY(), getWidth(), this.f31278a.getIntrinsicHeight() + getScrollY());
            this.f31278a.setAlpha((int) (d * 255.0f));
            this.f31278a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i9, int i10, int i11, int i12) {
        super.onNestedScroll(view, i9, i10, i11, i12);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f31280c != canScrollVertically) {
            invalidate();
            this.f31280c = canScrollVertically;
        }
    }
}
