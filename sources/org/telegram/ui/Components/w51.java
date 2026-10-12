package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class w51 extends ScrollView {
    public Drawable f32281a;
    public g6 f32282b;
    public boolean f32283c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        g6 g6Var = this.f32282b;
        if (canScrollVertically(-1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = g6Var.d(f7, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f32281a == null) {
                this.f32281a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f32281a.setBounds(0, getScrollY(), getWidth(), this.f32281a.getIntrinsicHeight() + getScrollY());
            this.f32281a.setAlpha((int) (d * 255.0f));
            this.f32281a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f32283c != canScrollVertically) {
            invalidate();
            this.f32283c = canScrollVertically;
        }
    }
}
