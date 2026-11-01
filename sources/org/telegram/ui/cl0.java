package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
public final class cl0 extends TextView {
    public final int f36346a;

    public cl0(Context context, int i10) {
        super(context);
        this.f36346a = i10;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f36346a) {
            case 4:
                super.dispatchDraw(canvas);
                canvas.drawCircle(org.telegram.messenger.i0.L(3.5f), org.telegram.messenger.i0.L(11.5f), org.telegram.messenger.i0.L(2.5f), getPaint());
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f36346a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(100.0f), Integer.MIN_VALUE));
                return;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(org.telegram.messenger.i0.L(26.0f)), 1073741824));
                return;
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f36346a) {
            case 5:
                super.setText(org.telegram.messenger.k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
            default:
                super.setText(charSequence, bufferType);
                return;
        }
    }
}
