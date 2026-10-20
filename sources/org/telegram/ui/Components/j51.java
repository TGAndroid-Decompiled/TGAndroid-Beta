package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class j51 extends ScrollView {
    public Drawable f27405a;
    public f6 f27406b;
    public boolean f27407c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        f6 f6Var = this.f27406b;
        if (canScrollVertically(-1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = f6Var.d(f7, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f27405a == null) {
                this.f27405a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f27405a.setBounds(0, getScrollY(), getWidth(), this.f27405a.getIntrinsicHeight() + getScrollY());
            this.f27405a.setAlpha((int) (d * 255.0f));
            this.f27405a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f27407c != canScrollVertically) {
            invalidate();
            this.f27407c = canScrollVertically;
        }
    }
}
