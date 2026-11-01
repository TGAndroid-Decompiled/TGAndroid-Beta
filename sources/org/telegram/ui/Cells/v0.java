package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;
public final class v0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final fg.i f23168a;
    public final RadialProgressView f23169b;
    public final org.telegram.ui.ActionBar.p6 f23170c;
    public float d;
    public int e;

    public v0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10;
        this.f23170c = p6Var;
        fg.i iVar = new fg.i(this, context);
        this.f23168a = iVar;
        iVar.setWillNotDraw(false);
        addView(iVar, w7.b6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, p6Var);
        this.f23169b = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.i0.L(28.0f));
        if (org.telegram.ui.ActionBar.t6.i1(p6Var)) {
            i10 = org.telegram.ui.ActionBar.t6.Ka;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.Wc;
        }
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        iVar.addView(radialProgressView, w7.b6.e(32, 32, 17));
    }

    public final void a(float f7, int i10) {
        if (this.d != f7) {
            invalidate();
        }
        this.d = f7;
        this.e = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), 1073741824));
    }

    public void setProgressVisible(boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.f23168a.setVisibility(i10);
    }

    @Override
    public final void updateColors() {
        int i10;
        org.telegram.ui.ActionBar.p6 p6Var = this.f23170c;
        try {
            RadialProgressView radialProgressView = this.f23169b;
            if (org.telegram.ui.ActionBar.t6.i1(p6Var)) {
                i10 = org.telegram.ui.ActionBar.t6.Ka;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.Wc;
            }
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
