package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public abstract class ph0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public TLRPC.User f40486a;
    public org.telegram.ui.Components.y90 f40487b;
    public org.telegram.ui.Components.b10 f40488c;
    public boolean d;
    public int e;

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.y90 y90Var = this.f40487b;
        org.telegram.ui.Components.b10 b10Var = this.f40488c;
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
        y90Var.setVisibility(8);
        if (z10) {
            b10Var.setVisibility(8);
        }
        super.onMeasure(i10, makeMeasureSpec);
        if (z10) {
            b10Var.getLayoutParams().width = getMeasuredWidth();
            b10Var.setVisibility(0);
        }
        y90Var.setVisibility(0);
        y90Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
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

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false);
            if (x02 != this.e) {
                this.e = x02;
                org.telegram.ui.ActionBar.k6.E1(getBackground(), x02, true);
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
