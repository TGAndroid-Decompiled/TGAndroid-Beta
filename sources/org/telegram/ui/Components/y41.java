package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class y41 extends ScrollView {
    public Drawable f29247a;
    public d6 f29248b;
    public boolean f29249c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        d6 d6Var = this.f29248b;
        if (canScrollVertically(-1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = d6Var.d(f7, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f29247a == null) {
                this.f29247a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f29247a.setBounds(0, getScrollY(), getWidth(), this.f29247a.getIntrinsicHeight() + getScrollY());
            this.f29247a.setAlpha((int) (d * 255.0f));
            this.f29247a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f29249c != canScrollVertically) {
            invalidate();
            this.f29249c = canScrollVertically;
        }
    }
}
