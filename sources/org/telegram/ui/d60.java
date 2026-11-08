package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class d60 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.k5 f44969a;
    public final org.telegram.ui.Components.z8 f44970b;
    public boolean f44971c;
    public int d;
    public final e60 f44972e;

    public d60(e60 e60Var, Context context) {
        super(context);
        this.f44972e = e60Var;
        int i7 = org.telegram.ui.ActionBar.k6.f27944i6;
        this.d = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f44969a = k5Var;
        k5Var.setTextSize(16);
        k5Var.setEllipsizeByGradient(true);
        k5Var.setRightPadding(org.telegram.messenger.g0.L(68.0f));
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.f27960j5, null);
        addView(k5Var, c8.ha.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(context, false);
        this.f44970b = z8Var;
        z8Var.f40925a.f40602a = true;
        z8Var.setStyle(11);
        z8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(z8Var, c8.ha.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.x0(null, i7, false), 0, 4));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        this.f44971c = true;
        org.telegram.ui.ActionBar.k5 k5Var = this.f44969a;
        k5Var.setVisibility(8);
        super.onMeasure(i7, i10);
        k5Var.setVisibility(0);
        k5Var.getLayoutParams().width = getMeasuredWidth();
        this.f44971c = false;
        this.f44972e.g();
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f44971c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27944i6, false);
            if (x02 != this.d) {
                this.d = x02;
                org.telegram.ui.ActionBar.k6.H1(getBackground(), x02, true);
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
