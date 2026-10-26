package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class w51 extends ScrollView {
    public Drawable f34371a;
    public h6 f34372b;
    public boolean f34373c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        h6 h6Var = this.f34372b;
        if (canScrollVertically(-1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = h6Var.d(f7, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f34371a == null) {
                this.f34371a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f34371a.setBounds(0, getScrollY(), getWidth(), this.f34371a.getIntrinsicHeight() + getScrollY());
            this.f34371a.setAlpha((int) (d * 255.0f));
            this.f34371a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f34373c != canScrollVertically) {
            invalidate();
            this.f34373c = canScrollVertically;
        }
    }
}
