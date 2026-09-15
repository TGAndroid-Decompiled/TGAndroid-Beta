package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class l41 extends ScrollView {
    public Drawable f25830a;
    public c6 f25831b;
    public boolean f25832c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        c6 c6Var = this.f25831b;
        if (canScrollVertically(-1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = c6Var.d(f7, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f25830a == null) {
                this.f25830a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f25830a.setBounds(0, getScrollY(), getWidth(), this.f25830a.getIntrinsicHeight() + getScrollY());
            this.f25830a.setAlpha((int) (d * 255.0f));
            this.f25830a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f25832c != canScrollVertically) {
            invalidate();
            this.f25832c = canScrollVertically;
        }
    }
}
