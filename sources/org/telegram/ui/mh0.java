package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public abstract class mh0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public TLRPC.User f41564a;
    public org.telegram.ui.Components.z90 f41565b;
    public org.telegram.ui.Components.c10 f41566c;
    public boolean d;
    public int e;

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.z90 z90Var = this.f41565b;
        org.telegram.ui.Components.c10 c10Var = this.f41566c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824);
        boolean z10 = true;
        this.d = true;
        if (c10Var.getVisibility() != 0) {
            z10 = false;
        }
        z90Var.setVisibility(8);
        if (z10) {
            c10Var.setVisibility(8);
        }
        super.onMeasure(i10, makeMeasureSpec);
        if (z10) {
            c10Var.getLayoutParams().width = getMeasuredWidth();
            c10Var.setVisibility(0);
        }
        z90Var.setVisibility(0);
        z90Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
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
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.I5, false);
            if (x02 != this.e) {
                this.e = x02;
                org.telegram.ui.ActionBar.y6.E1(getBackground(), x02, true);
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
