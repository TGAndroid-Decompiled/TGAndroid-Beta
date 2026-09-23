package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class z0 extends FrameLayout {
    public final ci.m6 f21651a;
    public final org.telegram.ui.ActionBar.d6 f21652b;
    public float f21653c;
    public int d;

    public z0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f21652b = d6Var;
        ci.m6 m6Var = new ci.m6(this, context);
        this.f21651a = m6Var;
        m6Var.setWillNotDraw(false);
        addView(m6Var, w7.x5.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, d6Var);
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18884ic, d6Var));
        m6Var.addView(radialProgressView, w7.x5.e(32, 32, 17));
    }

    public final void a(float f7, int i10) {
        if (this.f21653c != f7) {
            invalidate();
        }
        this.f21653c = f7;
        this.d = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
    }

    public void setProgressVisible(boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.f21651a.setVisibility(i10);
    }
}
