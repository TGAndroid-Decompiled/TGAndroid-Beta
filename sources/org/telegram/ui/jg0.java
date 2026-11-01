package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class jg0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public TLRPC.User f38391a;
    public org.telegram.ui.Components.p80 f38392b;
    public org.telegram.ui.Components.zz f38393c;
    public boolean d;
    public int e;

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.p80 p80Var = this.f38392b;
        org.telegram.ui.Components.zz zzVar = this.f38393c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(36.0f), 1073741824);
        boolean z10 = true;
        this.d = true;
        if (zzVar.getVisibility() != 0) {
            z10 = false;
        }
        p80Var.setVisibility(8);
        if (z10) {
            zzVar.setVisibility(8);
        }
        super.onMeasure(i10, makeMeasureSpec);
        if (z10) {
            zzVar.getLayoutParams().width = getMeasuredWidth();
            zzVar.setVisibility(0);
        }
        p80Var.setVisibility(0);
        p80Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.i0.L(24.0f);
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
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.I5, false);
            if (x02 != this.e) {
                this.e = x02;
                org.telegram.ui.ActionBar.t6.H1(getBackground(), x02, true);
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
