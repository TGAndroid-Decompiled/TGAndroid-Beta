package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;
public final class y0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final ai.l0 f32368a;
    public final RadialProgressView f32369b;
    public final org.telegram.ui.ActionBar.h6 f32370c;
    public float d;
    public int f32371e;

    public y0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7;
        this.f32370c = h6Var;
        ai.l0 l0Var = new ai.l0(this, context);
        this.f32368a = l0Var;
        l0Var.setWillNotDraw(false);
        addView(l0Var, c8.ma.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, h6Var);
        this.f32369b = radialProgressView;
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
        this.f32371e = i7;
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
        this.f32368a.setVisibility(i7);
    }

    @Override
    public final void updateColors() {
        int i7;
        org.telegram.ui.ActionBar.h6 h6Var = this.f32370c;
        try {
            RadialProgressView radialProgressView = this.f32369b;
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
