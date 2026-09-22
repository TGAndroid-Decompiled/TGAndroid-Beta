package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;
public final class b51 extends ScrollView {
    public Drawable f22865a;
    public d6 f22866b;
    public boolean f22867c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        d6 d6Var = this.f22866b;
        if (canScrollVertically(-1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = d6Var.d(f7, false) * 0.5f;
        if (d > 0.0f) {
            if (this.f22865a == null) {
                this.f22865a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f22865a.setBounds(0, getScrollY(), getWidth(), this.f22865a.getIntrinsicHeight() + getScrollY());
            this.f22865a.setAlpha((int) (d * 255.0f));
            this.f22865a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.f22867c != canScrollVertically) {
            invalidate();
            this.f22867c = canScrollVertically;
        }
    }
}
