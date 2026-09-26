package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class y41 extends ScrollView {
    public Drawable f30504a;
    public e6 f30505b;
    public boolean f30506c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        e6 e6Var = this.f30505b;
        if (canScrollVertically(-1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = e6Var.d(f7, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f30504a == null) {
                this.f30504a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f30504a.setBounds(0, getScrollY(), getWidth(), this.f30504a.getIntrinsicHeight() + getScrollY());
            this.f30504a.setAlpha((int) (d * 255.0f));
            this.f30504a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f30506c != canScrollVertically) {
            invalidate();
            this.f30506c = canScrollVertically;
        }
    }
}
