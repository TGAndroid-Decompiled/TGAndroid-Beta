package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;
public final class y0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final ai.g0 f32337a;
    public final RadialProgressView f32338b;
    public final org.telegram.ui.ActionBar.h6 f32339c;
    public float d;
    public int f32340e;

    public y0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7;
        this.f32339c = h6Var;
        ai.g0 g0Var = new ai.g0(this, context);
        this.f32337a = g0Var;
        g0Var.setWillNotDraw(false);
        addView(g0Var, c8.na.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, h6Var);
        this.f32338b = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(28.0f));
        if (org.telegram.ui.ActionBar.m6.i1(h6Var)) {
            i7 = org.telegram.ui.ActionBar.m6.Ka;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.Zc;
        }
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        g0Var.addView(radialProgressView, c8.na.e(32, 32, 17));
    }

    public final void a(float f10, int i7) {
        if (this.d != f10) {
            invalidate();
        }
        this.d = f10;
        this.f32340e = i7;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
    }

    public void setProgressVisible(boolean z10) {
        int i7;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        this.f32337a.setVisibility(i7);
    }

    @Override
    public final void updateColors() {
        int i7;
        org.telegram.ui.ActionBar.h6 h6Var = this.f32339c;
        try {
            RadialProgressView radialProgressView = this.f32338b;
            if (org.telegram.ui.ActionBar.m6.i1(h6Var)) {
                i7 = org.telegram.ui.ActionBar.m6.Ka;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.Zc;
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
