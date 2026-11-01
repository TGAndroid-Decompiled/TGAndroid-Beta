package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class k21 extends FrameLayout {
    public FrameLayout f38637a;
    public org.telegram.ui.Cells.y3 f38638b;
    public kg.x0 f38639c;
    public String d;
    public ValueAnimator e;
    public float f38640f;
    public Boolean h;
    public ValueAnimator f38641n;

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(8.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.i0.L(44.0f), 1073741824));
    }
}
