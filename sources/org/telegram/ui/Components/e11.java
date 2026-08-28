package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class e11 extends TextView {
    public View f27898a;
    public ViewPropertyAnimator f27899b;
    public boolean f27900c;
    public tp0 d;

    public final void a() {
        if (this.f27898a == null) {
            return;
        }
        View view = (View) getParent();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (View view2 = this.f27898a; view2 != view; view2 = (View) view2.getParent()) {
            i11 += view2.getTop();
            i10 += view2.getLeft();
        }
        int width = ((this.f27898a.getWidth() / 2) + i10) - (getMeasuredWidth() / 2);
        if (width >= 0) {
            if (getMeasuredWidth() + width > view.getMeasuredWidth()) {
                i9 = (view.getMeasuredWidth() - getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
            } else {
                i9 = width;
            }
        }
        setTranslationX(i9);
        setTranslationY(i11 - getMeasuredHeight());
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        a();
    }
}
