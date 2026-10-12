package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q61 extends FrameLayout {
    public FrameLayout f41194a;
    public org.telegram.ui.Cells.u3 f41195b;
    public rg.q0 f41196c;
    public String d;
    public ValueAnimator f41197e;
    public float f41198f;
    public Boolean h;
    public ValueAnimator f41199n;

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
    }
}
