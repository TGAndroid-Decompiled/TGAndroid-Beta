package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;
public final class w0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final bi.x5 f30700a;
    public final RadialProgressView f30701b;
    public final org.telegram.ui.ActionBar.g6 f30702c;
    public float d;
    public int f30703e;

    public w0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i7;
        this.f30702c = g6Var;
        bi.x5 x5Var = new bi.x5(this, context);
        this.f30700a = x5Var;
        x5Var.setWillNotDraw(false);
        addView(x5Var, c8.ha.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, g6Var);
        this.f30701b = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(28.0f));
        if (org.telegram.ui.ActionBar.l6.i1(g6Var)) {
            i7 = org.telegram.ui.ActionBar.l6.Ka;
        } else {
            i7 = org.telegram.ui.ActionBar.l6.Wc;
        }
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        x5Var.addView(radialProgressView, c8.ha.e(32, 32, 17));
    }

    public final void a(float f10, int i7) {
        if (this.d != f10) {
            invalidate();
        }
        this.d = f10;
        this.f30703e = i7;
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
        this.f30700a.setVisibility(i7);
    }

    @Override
    public final void updateColors() {
        int i7;
        org.telegram.ui.ActionBar.g6 g6Var = this.f30702c;
        try {
            RadialProgressView radialProgressView = this.f30701b;
            if (org.telegram.ui.ActionBar.l6.i1(g6Var)) {
                i7 = org.telegram.ui.ActionBar.l6.Ka;
            } else {
                i7 = org.telegram.ui.ActionBar.l6.Wc;
            }
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
