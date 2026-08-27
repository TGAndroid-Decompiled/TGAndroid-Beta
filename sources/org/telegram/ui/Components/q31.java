package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;

public final class q31 extends ScrollView {

    public Drawable f31776a;

    public y5 f31777b;

    public boolean f31778c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float fD = this.f31777b.d(canScrollVertically(-1) ? 1.0f : 0.0f, false) * 0.5f;
        if (fD > 0.0f) {
            if (this.f31776a == null) {
                this.f31776a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.f31776a.setBounds(0, getScrollY(), getWidth(), this.f31776a.getIntrinsicHeight() + getScrollY());
            this.f31776a.setAlpha((int) (fD * 255.0f));
            this.f31776a.draw(canvas);
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean zCanScrollVertically = canScrollVertically(-1);
        if (this.f31778c != zCanScrollVertically) {
            invalidate();
            this.f31778c = zCanScrollVertically;
        }
    }
}
