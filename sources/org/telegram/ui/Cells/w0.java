package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;
public final class w0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final bi.x5 f30711a;
    public final RadialProgressView f30712b;
    public final org.telegram.ui.ActionBar.h6 f30713c;
    public float d;
    public int f30714e;

    public w0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7;
        this.f30713c = h6Var;
        bi.x5 x5Var = new bi.x5(this, context);
        this.f30711a = x5Var;
        x5Var.setWillNotDraw(false);
        addView(x5Var, c8.ha.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, h6Var);
        this.f30712b = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(28.0f));
        if (org.telegram.ui.ActionBar.m6.i1(h6Var)) {
            i7 = org.telegram.ui.ActionBar.m6.Ka;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.Wc;
        }
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        x5Var.addView(radialProgressView, c8.ha.e(32, 32, 17));
    }

    public final void a(float f10, int i7) {
        if (this.d != f10) {
            invalidate();
        }
        this.d = f10;
        this.f30714e = i7;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
    }

    public void setProgressVisible(boolean z9) {
        int i7;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        this.f30711a.setVisibility(i7);
    }

    @Override
    public final void updateColors() {
        int i7;
        org.telegram.ui.ActionBar.h6 h6Var = this.f30713c;
        try {
            RadialProgressView radialProgressView = this.f30712b;
            if (org.telegram.ui.ActionBar.m6.i1(h6Var)) {
                i7 = org.telegram.ui.ActionBar.m6.Ka;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.Wc;
            }
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
