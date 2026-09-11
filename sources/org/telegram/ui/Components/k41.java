package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class k41 extends ScrollView {
    public Drawable f27687a;
    public e6 f27688b;
    public boolean f27689c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        e6 e6Var = this.f27688b;
        if (canScrollVertically(-1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = e6Var.d(f7, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f27687a == null) {
                this.f27687a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f27687a.setBounds(0, getScrollY(), getWidth(), this.f27687a.getIntrinsicHeight() + getScrollY());
            this.f27687a.setAlpha((int) (d * 255.0f));
            this.f27687a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f27689c != canScrollVertically) {
            invalidate();
            this.f27689c = canScrollVertically;
        }
    }
}
