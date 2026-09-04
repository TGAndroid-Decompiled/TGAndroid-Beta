package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m61 extends FrameLayout {
    public FrameLayout f38580a;
    public org.telegram.ui.Cells.t3 f38581b;
    public sg.r0 f38582c;
    public String d;
    public ValueAnimator f38583e;
    public float f38584f;
    public Boolean h;
    public ValueAnimator f38585n;

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
    }
}
