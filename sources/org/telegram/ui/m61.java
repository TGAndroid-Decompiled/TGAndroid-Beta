package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m61 extends FrameLayout {
    public FrameLayout f35616a;
    public org.telegram.ui.Cells.v3 f35617b;
    public rg.p0 f35618c;
    public String d;
    public ValueAnimator e;
    public float f35619f;
    public Boolean h;
    public ValueAnimator f35620n;

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
    }
}
