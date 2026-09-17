package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class k41 extends ScrollView {
    public Drawable f27688a;
    public e6 f27689b;
    public boolean f27690c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        e6 e6Var = this.f27689b;
        if (canScrollVertically(-1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = e6Var.d(f7, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f27688a == null) {
                this.f27688a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f27688a.setBounds(0, getScrollY(), getWidth(), this.f27688a.getIntrinsicHeight() + getScrollY());
            this.f27688a.setAlpha((int) (d * 255.0f));
            this.f27688a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f27690c != canScrollVertically) {
            invalidate();
            this.f27690c = canScrollVertically;
        }
    }
}
