package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class a1 extends FrameLayout {
    public final ah.v f20893a;
    public final org.telegram.ui.ActionBar.c6 f20894b;
    public float f20895c;
    public int d;

    public a1(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f20894b = c6Var;
        ah.v vVar = new ah.v(this, context);
        this.f20893a = vVar;
        vVar.setWillNotDraw(false);
        addView(vVar, w7.a6.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, c6Var);
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19995ic, c6Var));
        vVar.addView(radialProgressView, w7.a6.e(32, 32, 17));
    }

    public final void a(float f7, int i10) {
        if (this.f20895c != f7) {
            invalidate();
        }
        this.f20895c = f7;
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
        this.f20893a.setVisibility(i10);
    }
}
