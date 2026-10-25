package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class f51 extends FrameLayout {
    public FrameLayout f39270a;
    public org.telegram.ui.Cells.y3 f39271b;
    public tg.p0 f39272c;
    public String d;
    public ValueAnimator e;
    public float f39273f;
    public Boolean h;
    public ValueAnimator f39274n;

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
    }
}
