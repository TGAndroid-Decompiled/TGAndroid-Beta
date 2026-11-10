package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
public final class ib extends w70 {
    public final int L;

    public ib(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.L = i7;
    }

    @Override
    public int a() {
        switch (this.L) {
            case 4:
                return 3;
            default:
                return super.a();
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 3:
                if (getAlpha() < 0.9f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 4:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                if (getAlpha() < 0.95f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 6:
                if (getAlpha() < 0.95f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.L) {
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.L) {
            case 0:
                super.setText(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
            case 1:
                super.setText(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
            case 2:
                super.setText(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
            default:
                super.setText(charSequence, bufferType);
                return;
        }
    }
}
