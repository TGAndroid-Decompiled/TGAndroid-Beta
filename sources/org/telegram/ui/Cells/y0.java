package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.RadialProgressView;
public final class y0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final ah.v f23965a;
    public final RadialProgressView f23966b;
    public final org.telegram.ui.ActionBar.g6 f23967c;
    public float d;
    public int e;

    public y0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f23967c = g6Var;
        ah.v vVar = new ah.v(this, context);
        this.f23965a = vVar;
        vVar.setWillNotDraw(false);
        addView(vVar, w7.z5.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, g6Var);
        this.f23966b = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21278ic, g6Var));
        vVar.addView(radialProgressView, w7.z5.e(32, 32, 17));
    }

    public final void a(float f7, int i10) {
        if (this.d != f7) {
            invalidate();
        }
        this.d = f7;
        this.e = i10;
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
        this.f23965a.setVisibility(i10);
    }

    @Override
    public final void updateColors() {
        try {
            this.f23966b.setProgressColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21278ic, this.f23967c));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
