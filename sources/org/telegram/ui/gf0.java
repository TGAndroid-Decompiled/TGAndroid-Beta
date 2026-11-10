package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class gf0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public TLRPC.User f46086a;
    public org.telegram.ui.Components.w70 f46087b;
    public org.telegram.ui.Components.lz f46088c;
    public boolean d;
    public int f46089e;

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Components.w70 w70Var = this.f46087b;
        org.telegram.ui.Components.lz lzVar = this.f46088c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), 1073741824);
        boolean z9 = true;
        this.d = true;
        if (lzVar.getVisibility() != 0) {
            z9 = false;
        }
        w70Var.setVisibility(8);
        if (z9) {
            lzVar.setVisibility(8);
        }
        super.onMeasure(i7, makeMeasureSpec);
        if (z9) {
            lzVar.getLayoutParams().width = getMeasuredWidth();
            lzVar.setVisibility(0);
        }
        w70Var.setVisibility(0);
        w70Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
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
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.I5, false);
            if (x02 != this.f46089e) {
                this.f46089e = x02;
                org.telegram.ui.ActionBar.m6.H1(getBackground(), x02, true);
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
