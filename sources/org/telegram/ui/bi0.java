package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public abstract class bi0 extends FrameLayout {
    public TLRPC.User f36396a;
    public org.telegram.ui.Components.fa0 f36397b;
    public org.telegram.ui.Components.k10 f36398c;
    public boolean d;

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.fa0 fa0Var = this.f36397b;
        org.telegram.ui.Components.k10 k10Var = this.f36398c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824);
        boolean z10 = true;
        this.d = true;
        if (k10Var.getVisibility() != 0) {
            z10 = false;
        }
        fa0Var.setVisibility(8);
        if (z10) {
            k10Var.setVisibility(8);
        }
        super.onMeasure(i10, makeMeasureSpec);
        if (z10) {
            k10Var.getLayoutParams().width = getMeasuredWidth();
            k10Var.setVisibility(0);
        }
        fa0Var.setVisibility(0);
        fa0Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
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
