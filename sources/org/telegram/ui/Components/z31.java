package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class z31 extends ScrollView {
    public Drawable f35200a;
    public d6 f35201b;
    public boolean f35202c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        super.dispatchDraw(canvas);
        d6 d6Var = this.f35201b;
        if (canScrollVertically(-1)) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        float d = d6Var.d(f9, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f35200a == null) {
                this.f35200a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f35200a.setBounds(0, getScrollY(), getWidth(), this.f35200a.getIntrinsicHeight() + getScrollY());
            this.f35200a.setAlpha((int) (d * 255.0f));
            this.f35200a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f35202c != canScrollVertically) {
            invalidate();
            this.f35202c = canScrollVertically;
        }
    }
}
