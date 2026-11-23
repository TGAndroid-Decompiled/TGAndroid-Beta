package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class o01 extends TextView {
    public View f38032a;
    public ViewPropertyAnimator f38033b;
    public boolean f38034c;
    public cp0 d;

    public final void a() {
        if (this.f38032a == null) {
            return;
        }
        View view = (View) getParent();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        for (View view2 = this.f38032a; view2 != view; view2 = (View) view2.getParent()) {
            i11 += view2.getTop();
            i10 += view2.getLeft();
        }
        int width = ((this.f38032a.getWidth() / 2) + i10) - (getMeasuredWidth() / 2);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        a();
    }
}
