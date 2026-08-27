package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class d51 extends FrameLayout {

    public FrameLayout f37267a;

    public org.telegram.ui.Cells.r3 f37268b;

    public ag.s1 f37269c;
    public String d;

    public ValueAnimator f37270e;

    public float f37271f;
    public Boolean h;

    public ValueAnimator f37272n;

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), 1073741824));
    }
}
