package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;
public final class y0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final ai.l0 f32371a;
    public final RadialProgressView f32372b;
    public final org.telegram.ui.ActionBar.h6 f32373c;
    public float d;
    public int f32374e;

    public y0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7;
        this.f32373c = h6Var;
        ai.l0 l0Var = new ai.l0(this, context);
        this.f32371a = l0Var;
        l0Var.setWillNotDraw(false);
        addView(l0Var, c8.ma.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, h6Var);
        this.f32372b = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(28.0f));
        if (org.telegram.ui.ActionBar.m6.i1(h6Var)) {
            i7 = org.telegram.ui.ActionBar.m6.Ka;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.Zc;
        }
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        l0Var.addView(radialProgressView, c8.ma.e(32, 32, 17));
    }

    public final void a(float f10, int i7) {
        if (this.d != f10) {
            invalidate();
        }
        this.d = f10;
        this.f32374e = i7;
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
        this.f32371a.setVisibility(i7);
    }

    @Override
    public final void updateColors() {
        int i7;
        org.telegram.ui.ActionBar.h6 h6Var = this.f32373c;
        try {
            RadialProgressView radialProgressView = this.f32372b;
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
