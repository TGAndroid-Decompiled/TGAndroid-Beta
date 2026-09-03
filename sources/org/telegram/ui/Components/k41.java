package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class k41 extends ScrollView {
    public Drawable f28268a;
    public z5 f28269b;
    public boolean f28270c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        z5 z5Var = this.f28269b;
        if (canScrollVertically(-1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = z5Var.d(f10, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f28268a == null) {
                this.f28268a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f28268a.setBounds(0, getScrollY(), getWidth(), this.f28268a.getIntrinsicHeight() + getScrollY());
            this.f28268a.setAlpha((int) (d * 255.0f));
            this.f28268a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f28270c != canScrollVertically) {
            invalidate();
            this.f28270c = canScrollVertically;
        }
    }
}
