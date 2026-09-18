package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class a51 extends ScrollView {
    public Drawable f22502a;
    public e6 f22503b;
    public boolean f22504c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        e6 e6Var = this.f22503b;
        if (canScrollVertically(-1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = e6Var.d(f7, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f22502a == null) {
                this.f22502a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f22502a.setBounds(0, getScrollY(), getWidth(), this.f22502a.getIntrinsicHeight() + getScrollY());
            this.f22502a.setAlpha((int) (d * 255.0f));
            this.f22502a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f22504c != canScrollVertically) {
            invalidate();
            this.f22504c = canScrollVertically;
        }
    }
}
