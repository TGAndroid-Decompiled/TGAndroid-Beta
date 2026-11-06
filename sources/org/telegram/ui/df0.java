package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class df0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public TLRPC.User f45059a;
    public org.telegram.ui.Components.w70 f45060b;
    public org.telegram.ui.Components.lz f45061c;
    public boolean d;
    public int f45062e;

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Components.w70 w70Var = this.f45060b;
        org.telegram.ui.Components.lz lzVar = this.f45061c;
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
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false);
            if (x02 != this.f45062e) {
                this.f45062e = x02;
                org.telegram.ui.ActionBar.k6.H1(getBackground(), x02, true);
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
