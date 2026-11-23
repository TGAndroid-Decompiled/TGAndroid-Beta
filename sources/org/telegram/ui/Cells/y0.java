package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;
public final class y0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final ai.h0 f32438a;
    public final RadialProgressView f32439b;
    public final org.telegram.ui.ActionBar.i6 f32440c;
    public float d;
    public int f32441e;

    public y0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i7;
        this.f32440c = i6Var;
        ai.h0 h0Var = new ai.h0(this, context);
        this.f32438a = h0Var;
        h0Var.setWillNotDraw(false);
        addView(h0Var, c8.na.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, i6Var);
        this.f32439b = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(28.0f));
        if (org.telegram.ui.ActionBar.n6.i1(i6Var)) {
            i7 = org.telegram.ui.ActionBar.n6.Ka;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.Zc;
        }
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        h0Var.addView(radialProgressView, c8.na.e(32, 32, 17));
    }

    public final void a(float f10, int i7) {
        if (this.d != f10) {
            invalidate();
        }
        this.d = f10;
        this.f32441e = i7;
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
        this.f32438a.setVisibility(i7);
    }

    @Override
    public final void updateColors() {
        int i7;
        org.telegram.ui.ActionBar.i6 i6Var = this.f32440c;
        try {
            RadialProgressView radialProgressView = this.f32439b;
            if (org.telegram.ui.ActionBar.n6.i1(i6Var)) {
                i7 = org.telegram.ui.ActionBar.n6.Ka;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.Zc;
            }
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
