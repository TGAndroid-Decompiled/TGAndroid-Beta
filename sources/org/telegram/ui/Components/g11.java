package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class g11 extends TextView {

    public View f28500a;

    public ViewPropertyAnimator f28501b;

    public boolean f28502c;
    public up0 d;

    public final void a() {
        if (this.f28500a == null) {
            return;
        }
        View view = (View) getParent();
        int left = 0;
        int top = 0;
        for (View view2 = this.f28500a; view2 != view; view2 = (View) view2.getParent()) {
            top += view2.getTop();
            left += view2.getLeft();
        }
        int width = ((this.f28500a.getWidth() / 2) + left) - (getMeasuredWidth() / 2);
        setTranslationX(width >= 0 ? getMeasuredWidth() + width > view.getMeasuredWidth() ? (view.getMeasuredWidth() - getMeasuredWidth()) - AndroidUtilities.dp(16.0f) : width : 0);
        setTranslationY(top - getMeasuredHeight());
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a();
    }
}
