package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class n51 extends ScrollView {
    public Drawable f27587a;
    public g6 f27588b;
    public boolean f27589c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        g6 g6Var = this.f27588b;
        if (canScrollVertically(-1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = g6Var.d(f7, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f27587a == null) {
                this.f27587a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f27587a.setBounds(0, getScrollY(), getWidth(), this.f27587a.getIntrinsicHeight() + getScrollY());
            this.f27587a.setAlpha((int) (d * 255.0f));
            this.f27587a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f27589c != canScrollVertically) {
            invalidate();
            this.f27589c = canScrollVertically;
        }
    }
}
