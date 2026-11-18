package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class hf0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public TLRPC.User f48343a;
    public org.telegram.ui.Components.k80 f48344b;
    public org.telegram.ui.Components.wz f48345c;
    public boolean d;
    public int f48346e;

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Components.k80 k80Var = this.f48344b;
        org.telegram.ui.Components.wz wzVar = this.f48345c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824);
        boolean z10 = true;
        this.d = true;
        if (wzVar.getVisibility() != 0) {
            z10 = false;
        }
        k80Var.setVisibility(8);
        if (z10) {
            wzVar.setVisibility(8);
        }
        super.onMeasure(i7, makeMeasureSpec);
        if (z10) {
            wzVar.getLayoutParams().width = getMeasuredWidth();
            wzVar.setVisibility(0);
        }
        k80Var.setVisibility(0);
        k80Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
        this.d = false;
        super.onMeasure(i7, makeMeasureSpec);
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
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.I5, false);
            if (x02 != this.f48346e) {
                this.f48346e = x02;
                org.telegram.ui.ActionBar.n6.H1(getBackground(), x02, true);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
