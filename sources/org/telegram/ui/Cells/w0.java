package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;
public final class w0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final ai.k0 f31847a;
    public final RadialProgressView f31848b;
    public final org.telegram.ui.ActionBar.e6 f31849c;
    public float d;
    public int f31850e;

    public w0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i7;
        this.f31849c = e6Var;
        ai.k0 k0Var = new ai.k0(this, context);
        this.f31847a = k0Var;
        k0Var.setWillNotDraw(false);
        addView(k0Var, c8.ja.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, e6Var);
        this.f31848b = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(28.0f));
        if (org.telegram.ui.ActionBar.j6.i1(e6Var)) {
            i7 = org.telegram.ui.ActionBar.j6.Ka;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.Zc;
        }
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        k0Var.addView(radialProgressView, c8.ja.e(32, 32, 17));
    }

    public final void a(float f10, int i7) {
        if (this.d != f10) {
            invalidate();
        }
        this.d = f10;
        this.f31850e = i7;
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
        this.f31847a.setVisibility(i7);
    }

    @Override
    public final void updateColors() {
        int i7;
        org.telegram.ui.ActionBar.e6 e6Var = this.f31849c;
        try {
            RadialProgressView radialProgressView = this.f31848b;
            if (org.telegram.ui.ActionBar.j6.i1(e6Var)) {
                i7 = org.telegram.ui.ActionBar.j6.Ka;
            } else {
                i7 = org.telegram.ui.ActionBar.j6.Zc;
            }
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
