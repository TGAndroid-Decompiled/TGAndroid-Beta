package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class f51 extends FrameLayout {
    public FrameLayout f39273a;
    public org.telegram.ui.Cells.y3 f39274b;
    public tg.p0 f39275c;
    public String d;
    public ValueAnimator e;
    public float f39276f;
    public Boolean h;
    public ValueAnimator f39277n;

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
    }
}
