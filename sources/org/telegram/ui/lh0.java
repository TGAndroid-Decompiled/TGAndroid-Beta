package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public abstract class lh0 extends FrameLayout {
    public TLRPC.User f38923a;
    public org.telegram.ui.Components.x90 f38924b;
    public org.telegram.ui.Components.b10 f38925c;
    public boolean d;

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.x90 x90Var = this.f38924b;
        org.telegram.ui.Components.b10 b10Var = this.f38925c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824);
        boolean z10 = true;
        this.d = true;
        if (b10Var.getVisibility() != 0) {
            z10 = false;
        }
        x90Var.setVisibility(8);
        if (z10) {
            b10Var.setVisibility(8);
        }
        super.onMeasure(i10, makeMeasureSpec);
        if (z10) {
            b10Var.getLayoutParams().width = getMeasuredWidth();
            b10Var.setVisibility(0);
        }
        x90Var.setVisibility(0);
        x90Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
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
