package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class j61 extends FrameLayout {
    public FrameLayout f34818a;
    public org.telegram.ui.Cells.t3 f34819b;
    public rg.p0 f34820c;
    public String d;
    public ValueAnimator e;
    public float f34821f;
    public Boolean h;
    public ValueAnimator f34822n;

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
    }
}
