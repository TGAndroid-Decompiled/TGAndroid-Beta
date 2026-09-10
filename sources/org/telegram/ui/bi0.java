package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public abstract class bi0 extends FrameLayout {
    public TLRPC.User f31270a;
    public org.telegram.ui.Components.m90 f31271b;
    public org.telegram.ui.Components.a10 f31272c;
    public boolean d;

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.m90 m90Var = this.f31271b;
        org.telegram.ui.Components.a10 a10Var = this.f31272c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824);
        boolean z10 = true;
        this.d = true;
        if (a10Var.getVisibility() != 0) {
            z10 = false;
        }
        m90Var.setVisibility(8);
        if (z10) {
            a10Var.setVisibility(8);
        }
        super.onMeasure(i10, makeMeasureSpec);
        if (z10) {
            a10Var.getLayoutParams().width = getMeasuredWidth();
            a10Var.setVisibility(0);
        }
        m90Var.setVisibility(0);
        m90Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
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
