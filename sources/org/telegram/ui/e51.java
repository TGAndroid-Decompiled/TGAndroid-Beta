package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e51 extends FrameLayout {
    public FrameLayout f36821a;
    public org.telegram.ui.Cells.t3 f36822b;
    public sg.p0 f36823c;
    public String d;
    public ValueAnimator e;
    public float f36824f;
    public Boolean h;
    public ValueAnimator f36825n;

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
    }
}
