package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class a21 extends TextView {
    public View f25140a;
    public ViewPropertyAnimator f25141b;
    public boolean f25142c;
    public nq0 d;

    public final void a() {
        if (this.f25140a == null) {
            return;
        }
        View view = (View) getParent();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (View view2 = this.f25140a; view2 != view; view2 = (View) view2.getParent()) {
            i12 += view2.getTop();
            i11 += view2.getLeft();
        }
        int width = ((this.f25140a.getWidth() / 2) + i11) - (getMeasuredWidth() / 2);
        if (width >= 0) {
            if (getMeasuredWidth() + width > view.getMeasuredWidth()) {
                i10 = (view.getMeasuredWidth() - getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
            } else {
                i10 = width;
            }
        }
        setTranslationX(i10);
        setTranslationY(i12 - getMeasuredHeight());
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        a();
    }
}
