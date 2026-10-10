package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class n61 extends FrameLayout {
    public FrameLayout f40128a;
    public org.telegram.ui.Cells.u3 f40129b;
    public rg.p0 f40130c;
    public String d;
    public ValueAnimator f40131e;
    public float f40132f;
    public Boolean h;
    public ValueAnimator f40133n;

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
    }
}
