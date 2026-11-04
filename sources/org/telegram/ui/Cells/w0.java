package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;
public final class w0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final ai.c0 f30771a;
    public final RadialProgressView f30772b;
    public final org.telegram.ui.ActionBar.e6 f30773c;
    public float d;
    public int f30774e;

    public w0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3;
        this.f30773c = e6Var;
        ai.c0 c0Var = new ai.c0(this, context);
        this.f30771a = c0Var;
        c0Var.setWillNotDraw(false);
        addView(c0Var, mf.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, e6Var);
        this.f30772b = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(28.0f));
        if (org.telegram.ui.ActionBar.k6.i1(e6Var)) {
            i3 = org.telegram.ui.ActionBar.k6.Ka;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.Wc;
        }
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        c0Var.addView(radialProgressView, mf.e(32, 32, 17));
    }

    public final void a(float f10, int i3) {
        if (this.d != f10) {
            invalidate();
        }
        this.d = f10;
        this.f30774e = i3;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
    }

    public void setProgressVisible(boolean z10) {
        int i3;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        this.f30771a.setVisibility(i3);
    }

    @Override
    public final void updateColors() {
        int i3;
        org.telegram.ui.ActionBar.e6 e6Var = this.f30773c;
        try {
            RadialProgressView radialProgressView = this.f30772b;
            if (org.telegram.ui.ActionBar.k6.i1(e6Var)) {
                i3 = org.telegram.ui.ActionBar.k6.Ka;
            } else {
                i3 = org.telegram.ui.ActionBar.k6.Wc;
            }
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
