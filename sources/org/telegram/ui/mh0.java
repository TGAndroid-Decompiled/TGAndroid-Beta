package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

public abstract class mh0 extends FrameLayout {

    public TLRPC.User f40511a;

    public org.telegram.ui.Components.p80 f40512b;

    public org.telegram.ui.Components.h00 f40513c;
    public boolean d;

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.p80 p80Var = this.f40512b;
        org.telegram.ui.Components.h00 h00Var = this.f40513c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824);
        this.d = true;
        boolean z10 = h00Var.getVisibility() == 0;
        p80Var.setVisibility(8);
        if (z10) {
            h00Var.setVisibility(8);
        }
        super.onMeasure(i10, iMakeMeasureSpec);
        if (z10) {
            h00Var.getLayoutParams().width = getMeasuredWidth();
            h00Var.setVisibility(0);
        }
        p80Var.setVisibility(0);
        p80Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
        this.d = false;
        super.onMeasure(i10, iMakeMeasureSpec);
    }

    @Override
    public final void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }
}
