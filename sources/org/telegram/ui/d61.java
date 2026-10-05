package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class d61 extends FrameLayout {
    public FrameLayout f35668a;
    public org.telegram.ui.Cells.u3 f35669b;
    public rg.q0 f35670c;
    public String d;
    public ValueAnimator f35671e;
    public float f35672f;
    public Boolean h;
    public ValueAnimator f35673n;

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
    }
}
