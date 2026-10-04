package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w21 extends TextView {
    public View f32449a;
    public ViewPropertyAnimator f32450b;
    public boolean f32451c;
    public br0 d;

    public final void a() {
        if (this.f32449a == null) {
            return;
        }
        View view = (View) getParent();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (View view2 = this.f32449a; view2 != view; view2 = (View) view2.getParent()) {
            i12 += view2.getTop();
            i11 += view2.getLeft();
        }
        int width = ((this.f32449a.getWidth() / 2) + i11) - (getMeasuredWidth() / 2);
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a();
    }
}
