package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class m21 extends FrameLayout {
    public FrameLayout f39459a;
    public org.telegram.ui.Cells.y3 f39460b;
    public kg.x0 f39461c;
    public String d;
    public ValueAnimator e;
    public float f39462f;
    public Boolean h;
    public ValueAnimator f39463n;

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(8.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.i0.L(44.0f), 1073741824));
    }
}
