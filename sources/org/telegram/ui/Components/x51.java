package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class x51 extends ScrollView {
    public Drawable f34679a;
    public h6 f34680b;
    public boolean f34681c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        h6 h6Var = this.f34680b;
        if (canScrollVertically(-1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = h6Var.d(f7, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f34679a == null) {
                this.f34679a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f34679a.setBounds(0, getScrollY(), getWidth(), this.f34679a.getIntrinsicHeight() + getScrollY());
            this.f34679a.setAlpha((int) (d * 255.0f));
            this.f34679a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f34681c != canScrollVertically) {
            invalidate();
            this.f34681c = canScrollVertically;
        }
    }
}
