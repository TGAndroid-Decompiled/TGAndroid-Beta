package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class m41 extends ScrollView {
    public Drawable f28933a;
    public z5 f28934b;
    public boolean f28935c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        z5 z5Var = this.f28934b;
        if (canScrollVertically(-1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = z5Var.d(f10, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f28933a == null) {
                this.f28933a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f28933a.setBounds(0, getScrollY(), getWidth(), this.f28933a.getIntrinsicHeight() + getScrollY());
            this.f28933a.setAlpha((int) (d * 255.0f));
            this.f28933a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f28935c != canScrollVertically) {
            invalidate();
            this.f28935c = canScrollVertically;
        }
    }
}
