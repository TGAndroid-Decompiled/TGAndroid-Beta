package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class y0 extends FrameLayout {
    public final bg.d1 f25979a;
    public final org.telegram.ui.ActionBar.c6 f25980b;
    public float f25981c;
    public int d;

    public y0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f25980b = c6Var;
        bg.d1 d1Var = new bg.d1(this, context);
        this.f25979a = d1Var;
        d1Var.setWillNotDraw(false);
        addView(d1Var, i7.f6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, c6Var);
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23158ic, c6Var));
        d1Var.addView(radialProgressView, i7.f6.e(32, 32, 17));
    }

    public final void a(float f9, int i10) {
        if (this.f25981c != f9) {
            invalidate();
        }
        this.f25981c = f9;
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
        this.f25979a.setVisibility(i10);
    }
}
