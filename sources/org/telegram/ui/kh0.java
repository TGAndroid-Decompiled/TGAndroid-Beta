package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public abstract class kh0 extends FrameLayout {
    public TLRPC.User f39841a;
    public org.telegram.ui.Components.l80 f39842b;
    public org.telegram.ui.Components.e00 f39843c;
    public boolean d;

    @Override
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.Components.l80 l80Var = this.f39842b;
        org.telegram.ui.Components.e00 e00Var = this.f39843c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i9 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824);
        boolean z10 = true;
        this.d = true;
        if (e00Var.getVisibility() != 0) {
            z10 = false;
        }
        l80Var.setVisibility(8);
        if (z10) {
            e00Var.setVisibility(8);
        }
        super.onMeasure(i9, makeMeasureSpec);
        if (z10) {
            e00Var.getLayoutParams().width = getMeasuredWidth();
            e00Var.setVisibility(0);
        }
        l80Var.setVisibility(0);
        l80Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
        this.d = false;
        super.onMeasure(i9, makeMeasureSpec);
    }

    @Override
    public final void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }
}
