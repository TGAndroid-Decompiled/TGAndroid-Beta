package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public abstract class jh0 extends FrameLayout {
    public TLRPC.User f39554a;
    public org.telegram.ui.Components.y80 f39555b;
    public org.telegram.ui.Components.p00 f39556c;
    public boolean d;

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.y80 y80Var = this.f39555b;
        org.telegram.ui.Components.p00 p00Var = this.f39556c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824);
        boolean z10 = true;
        this.d = true;
        if (p00Var.getVisibility() != 0) {
            z10 = false;
        }
        y80Var.setVisibility(8);
        if (z10) {
            p00Var.setVisibility(8);
        }
        super.onMeasure(i10, makeMeasureSpec);
        if (z10) {
            p00Var.getLayoutParams().width = getMeasuredWidth();
            p00Var.setVisibility(0);
        }
        y80Var.setVisibility(0);
        y80Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
        this.d = false;
        super.onMeasure(i10, makeMeasureSpec);
    }

    @Override
    public final void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }
}
