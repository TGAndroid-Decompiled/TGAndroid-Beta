package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class z0 extends FrameLayout {
    public final ah.w f23615a;
    public final org.telegram.ui.ActionBar.f6 f23616b;
    public float f23617c;
    public int d;

    public z0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f23616b = f6Var;
        ah.w wVar = new ah.w(this, context);
        this.f23615a = wVar;
        wVar.setWillNotDraw(false);
        addView(wVar, w7.x5.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, f6Var);
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20786ic, f6Var));
        wVar.addView(radialProgressView, w7.x5.e(32, 32, 17));
    }

    public final void a(float f7, int i10) {
        if (this.f23617c != f7) {
            invalidate();
        }
        this.f23617c = f7;
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
        this.f23615a.setVisibility(i10);
    }
}
