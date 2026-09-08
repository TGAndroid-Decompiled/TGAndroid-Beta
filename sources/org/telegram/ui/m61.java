package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m61 extends FrameLayout {
    public FrameLayout f38607a;
    public org.telegram.ui.Cells.t3 f38608b;
    public sg.r0 f38609c;
    public String d;
    public ValueAnimator f38610e;
    public float f38611f;
    public Boolean h;
    public ValueAnimator f38612n;

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
    }
}
