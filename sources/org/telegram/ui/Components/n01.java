package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class n01 extends TextView {
    public View f37685a;
    public ViewPropertyAnimator f37686b;
    public boolean f37687c;
    public ap0 d;

    public final void a() {
        if (this.f37685a == null) {
            return;
        }
        View view = (View) getParent();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        for (View view2 = this.f37685a; view2 != view; view2 = (View) view2.getParent()) {
            i11 += view2.getTop();
            i10 += view2.getLeft();
        }
        int width = ((this.f37685a.getWidth() / 2) + i10) - (getMeasuredWidth() / 2);
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
