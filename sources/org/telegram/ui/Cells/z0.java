package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class z0 extends FrameLayout {
    public final bi.n7 f20765a;
    public final org.telegram.ui.ActionBar.f6 f20766b;
    public float f20767c;
    public int d;

    public z0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f20766b = f6Var;
        bi.n7 n7Var = new bi.n7(this, context);
        this.f20765a = n7Var;
        n7Var.setWillNotDraw(false);
        addView(n7Var, w7.a6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, f6Var);
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18023ic, f6Var));
        n7Var.addView(radialProgressView, w7.a6.e(32, 32, 17));
    }

    public final void a(float f7, int i10) {
        if (this.f20767c != f7) {
            invalidate();
        }
        this.f20767c = f7;
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
        this.f20765a.setVisibility(i10);
    }
}
