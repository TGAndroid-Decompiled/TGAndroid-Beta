package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class g51 extends FrameLayout {
    public FrameLayout f38466a;
    public org.telegram.ui.Cells.r3 f38467b;
    public cg.d1 f38468c;
    public String d;
    public ValueAnimator f38469e;
    public float f38470f;
    public Boolean h;
    public ValueAnimator f38471n;

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
    }
}
