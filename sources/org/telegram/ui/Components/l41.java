package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class l41 extends ScrollView {
    public Drawable f26571a;
    public z5 f26572b;
    public boolean f26573c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        z5 z5Var = this.f26572b;
        if (canScrollVertically(-1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = z5Var.d(f10, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f26571a == null) {
                this.f26571a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f26571a.setBounds(0, getScrollY(), getWidth(), this.f26571a.getIntrinsicHeight() + getScrollY());
            this.f26571a.setAlpha((int) (d * 255.0f));
            this.f26571a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f26573c != canScrollVertically) {
            invalidate();
            this.f26573c = canScrollVertically;
        }
    }
}
