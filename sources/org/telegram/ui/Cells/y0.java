package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class y0 extends FrameLayout {
    public final ag.l f24428a;
    public final org.telegram.ui.ActionBar.g6 f24429b;
    public float f24430c;
    public int d;

    public y0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f24429b = g6Var;
        ag.l lVar = new ag.l(this, context);
        this.f24428a = lVar;
        lVar.setWillNotDraw(false);
        addView(lVar, k7.c6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, g6Var);
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ic, g6Var));
        lVar.addView(radialProgressView, k7.c6.e(32, 32, 17));
    }

    public final void a(float f10, int i10) {
        if (this.f24430c != f10) {
            invalidate();
        }
        this.f24430c = f10;
        this.d = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
    }

    public void setProgressVisible(boolean z4) {
        int i10;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.f24428a.setVisibility(i10);
    }
}
