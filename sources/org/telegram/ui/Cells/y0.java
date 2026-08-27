package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

public final class y0 extends FrameLayout {

    public final ag.y1 f25972a;

    public final org.telegram.ui.ActionBar.c6 f25973b;

    public float f25974c;
    public int d;

    public y0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f25973b = c6Var;
        ag.y1 y1Var = new ag.y1(this, context);
        this.f25972a = y1Var;
        y1Var.setWillNotDraw(false);
        addView(y1Var, h7.z5.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, c6Var);
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23150ic, c6Var));
        y1Var.addView(radialProgressView, h7.z5.e(32, 32, 17));
    }

    public final void a(float f10, int i10) {
        if (this.f25974c != f10) {
            invalidate();
        }
        this.f25974c = f10;
        this.d = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
    }

    public void setProgressVisible(boolean z10) {
        this.f25972a.setVisibility(z10 ? 0 : 4);
    }
}
