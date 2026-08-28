package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class z0 extends FrameLayout {
    public final fh.v f26006a;
    public final org.telegram.ui.ActionBar.b6 f26007b;
    public float f26008c;
    public int d;

    public z0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f26007b = b6Var;
        fh.v vVar = new fh.v(this, context);
        this.f26006a = vVar;
        vVar.setWillNotDraw(false);
        addView(vVar, g7.e6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, b6Var);
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23097ic, b6Var));
        vVar.addView(radialProgressView, g7.e6.e(32, 32, 17));
    }

    public final void a(float f10, int i9) {
        if (this.f26008c != f10) {
            invalidate();
        }
        this.f26008c = f10;
        this.d = i9;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
    }

    public void setProgressVisible(boolean z10) {
        int i9;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 4;
        }
        this.f26006a.setVisibility(i9);
    }
}
