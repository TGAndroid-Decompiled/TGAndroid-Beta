package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class m41 extends ScrollView {
    public Drawable f26051a;
    public c6 f26052b;
    public boolean f26053c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        c6 c6Var = this.f26052b;
        if (canScrollVertically(-1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = c6Var.d(f7, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f26051a == null) {
                this.f26051a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f26051a.setBounds(0, getScrollY(), getWidth(), this.f26051a.getIntrinsicHeight() + getScrollY());
            this.f26051a.setAlpha((int) (d * 255.0f));
            this.f26051a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f26053c != canScrollVertically) {
            invalidate();
            this.f26053c = canScrollVertically;
        }
    }
}
