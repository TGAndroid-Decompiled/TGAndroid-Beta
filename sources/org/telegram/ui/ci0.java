package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public abstract class ci0 extends FrameLayout {
    public TLRPC.User f36682a;
    public org.telegram.ui.Components.ea0 f36683b;
    public org.telegram.ui.Components.j10 f36684c;
    public boolean d;

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.ea0 ea0Var = this.f36683b;
        org.telegram.ui.Components.j10 j10Var = this.f36684c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824);
        boolean z10 = true;
        this.d = true;
        if (j10Var.getVisibility() != 0) {
            z10 = false;
        }
        ea0Var.setVisibility(8);
        if (z10) {
            j10Var.setVisibility(8);
        }
        super.onMeasure(i10, makeMeasureSpec);
        if (z10) {
            j10Var.getLayoutParams().width = getMeasuredWidth();
            j10Var.setVisibility(0);
        }
        ea0Var.setVisibility(0);
        ea0Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
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
