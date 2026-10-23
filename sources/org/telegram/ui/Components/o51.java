package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class o51 extends ScrollView {
    public Drawable f29098a;
    public f6 f29099b;
    public boolean f29100c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        f6 f6Var = this.f29099b;
        if (canScrollVertically(-1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = f6Var.d(f7, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f29098a == null) {
                this.f29098a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f29098a.setBounds(0, getScrollY(), getWidth(), this.f29098a.getIntrinsicHeight() + getScrollY());
            this.f29098a.setAlpha((int) (d * 255.0f));
            this.f29098a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f29100c != canScrollVertically) {
            invalidate();
            this.f29100c = canScrollVertically;
        }
    }
}
