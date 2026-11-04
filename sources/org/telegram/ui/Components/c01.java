package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class c01 extends TextView {
    public View f32493a;
    public ViewPropertyAnimator f32494b;
    public boolean f32495c;
    public sp0 d;

    public final void a() {
        if (this.f32493a == null) {
            return;
        }
        View view = (View) getParent();
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        for (View view2 = this.f32493a; view2 != view; view2 = (View) view2.getParent()) {
            i11 += view2.getTop();
            i10 += view2.getLeft();
        }
        int width = ((this.f32493a.getWidth() / 2) + i10) - (getMeasuredWidth() / 2);
        if (width >= 0) {
            if (getMeasuredWidth() + width > view.getMeasuredWidth()) {
                i3 = (view.getMeasuredWidth() - getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f);
            } else {
                i3 = width;
            }
        }
        setTranslationX(i3);
        setTranslationY(i11 - getMeasuredHeight());
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        a();
    }
}
