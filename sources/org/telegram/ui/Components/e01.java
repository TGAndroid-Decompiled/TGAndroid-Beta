package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class e01 extends TextView {
    public View f33248a;
    public ViewPropertyAnimator f33249b;
    public boolean f33250c;
    public kr0 d;

    public final void a() {
        if (this.f33248a == null) {
            return;
        }
        View view = (View) getParent();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        for (View view2 = this.f33248a; view2 != view; view2 = (View) view2.getParent()) {
            i11 += view2.getTop();
            i10 += view2.getLeft();
        }
        int width = ((this.f33248a.getWidth() / 2) + i10) - (getMeasuredWidth() / 2);
        if (width >= 0) {
            if (getMeasuredWidth() + width > view.getMeasuredWidth()) {
                i7 = (view.getMeasuredWidth() - getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f);
            } else {
                i7 = width;
            }
        }
        setTranslationX(i7);
        setTranslationY(i11 - getMeasuredHeight());
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        a();
    }
}
