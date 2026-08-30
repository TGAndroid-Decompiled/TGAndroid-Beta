package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class y0 extends FrameLayout {
    public final ah.d f22603a;
    public final org.telegram.ui.ActionBar.f6 f22604b;
    public float f22605c;
    public int d;

    public y0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f22604b = f6Var;
        ah.d dVar = new ah.d(this, context);
        this.f22603a = dVar;
        dVar.setWillNotDraw(false);
        addView(dVar, k7.b6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, f6Var);
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ic, f6Var));
        dVar.addView(radialProgressView, k7.b6.e(32, 32, 17));
    }

    public final void a(float f10, int i10) {
        if (this.f22605c != f10) {
            invalidate();
        }
        this.f22605c = f10;
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
        this.f22603a.setVisibility(i10);
    }
}
