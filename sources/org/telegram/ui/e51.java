package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e51 extends FrameLayout {
    public FrameLayout f37823a;
    public org.telegram.ui.Cells.u3 f37824b;
    public zf.p0 f37825c;
    public String d;
    public ValueAnimator f37826e;
    public float f37827f;
    public Boolean h;
    public ValueAnimator f37828n;

    @Override
    public final void onMeasure(int i9, int i10) {
        setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f));
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
    }
}
