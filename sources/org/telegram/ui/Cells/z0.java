package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class z0 extends FrameLayout {
    public final ah.v f23860a;
    public final org.telegram.ui.ActionBar.d6 f23861b;
    public float f23862c;
    public int d;

    public z0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f23861b = d6Var;
        ah.v vVar = new ah.v(this, context);
        this.f23860a = vVar;
        vVar.setWillNotDraw(false);
        addView(vVar, w7.z5.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, d6Var);
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21084ic, d6Var));
        vVar.addView(radialProgressView, w7.z5.e(32, 32, 17));
    }

    public final void a(float f7, int i10) {
        if (this.f23862c != f7) {
            invalidate();
        }
        this.f23862c = f7;
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
        this.f23860a.setVisibility(i10);
    }
}
