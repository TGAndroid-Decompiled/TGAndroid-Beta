package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class df0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public TLRPC.User f46388a;
    public org.telegram.ui.Components.z70 f46389b;
    public org.telegram.ui.Components.pz f46390c;
    public boolean d;
    public int f46391e;

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Components.z70 z70Var = this.f46389b;
        org.telegram.ui.Components.pz pzVar = this.f46390c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824);
        boolean z10 = true;
        this.d = true;
        if (pzVar.getVisibility() != 0) {
            z10 = false;
        }
        z70Var.setVisibility(8);
        if (z10) {
            pzVar.setVisibility(8);
        }
        super.onMeasure(i7, makeMeasureSpec);
        if (z10) {
            pzVar.getLayoutParams().width = getMeasuredWidth();
            pzVar.setVisibility(0);
        }
        z70Var.setVisibility(0);
        z70Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
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
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.I5, false);
            if (x02 != this.f46391e) {
                this.f46391e = x02;
                org.telegram.ui.ActionBar.j6.H1(getBackground(), x02, true);
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
