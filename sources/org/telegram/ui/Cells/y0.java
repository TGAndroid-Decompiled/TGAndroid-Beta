package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.kb1;
public final class y0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final bh.p f25735a;
    public final RadialProgressView f25736b;
    public final org.telegram.ui.ActionBar.u6 f25737c;
    public float d;
    public int e;

    public y0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f25737c = u6Var;
        bh.p pVar = new bh.p(this, context);
        this.f25735a = pVar;
        pVar.setWillNotDraw(false);
        addView(pVar, kb1.i(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, u6Var);
        this.f25736b = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23454ic, u6Var));
        pVar.addView(radialProgressView, kb1.i(32, 32, 17));
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
        this.f25735a.setVisibility(i10);
    }

    @Override
    public final void updateColors() {
        try {
            this.f25736b.setProgressColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23454ic, this.f25737c));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
