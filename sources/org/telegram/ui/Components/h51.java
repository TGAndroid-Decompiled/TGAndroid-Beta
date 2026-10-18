package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class h51 extends ScrollView {
    public Drawable f26778a;
    public f6 f26779b;
    public boolean f26780c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        f6 f6Var = this.f26779b;
        if (canScrollVertically(-1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = f6Var.d(f7, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f26778a == null) {
                this.f26778a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f26778a.setBounds(0, getScrollY(), getWidth(), this.f26778a.getIntrinsicHeight() + getScrollY());
            this.f26778a.setAlpha((int) (d * 255.0f));
            this.f26778a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f26780c != canScrollVertically) {
            invalidate();
            this.f26780c = canScrollVertically;
        }
    }
}
