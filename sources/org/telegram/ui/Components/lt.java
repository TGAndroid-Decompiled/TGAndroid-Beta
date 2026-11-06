package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
public final class lt extends xh.l {
    public final n2.n0 U;
    public x70 V;
    public boolean W;
    public boolean f35734a0;
    public boolean f35735b0;

    public lt(Context context) {
        super(context, null, true);
        this.U = new n2.n0(this);
    }

    @Override
    public final ClickableSpan a(int i7, int i10) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i7 - getPaddingLeft();
        int paddingTop = i10 - getPaddingTop();
        int lineForVertical = layout.getLineForVertical(paddingTop);
        float f10 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f10);
        float lineLeft = getLayout().getLineLeft(lineForVertical);
        if (lineLeft <= f10 && layout.getLineWidth(lineForVertical) + lineLeft >= f10 && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !org.telegram.messenger.g0.C1()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float paddingLeft;
        canvas.save();
        if (!this.W) {
            float f10 = 0.0f;
            if (this.f35734a0) {
                paddingLeft = 0.0f;
            } else {
                paddingLeft = getPaddingLeft();
            }
            if (!this.f35735b0) {
                f10 = getPaddingTop();
            }
            canvas.translate(paddingLeft, f10);
        }
        if (this.U.h(canvas)) {
            invalidate();
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        n2.n0 n0Var = this.U;
        if (n0Var != null) {
            Layout layout = getLayout();
            ClickableSpan a10 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a10 != null && motionEvent.getAction() == 0) {
                x70 x70Var = new x70(a10, null, motionEvent.getX(), motionEvent.getY(), 0);
                this.V = x70Var;
                n0Var.b(x70Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.V.f40190i);
                int spanEnd = spannableString.getSpanEnd(this.V.f40190i);
                r70 b10 = this.V.b();
                b10.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b10);
                org.telegram.messenger.g0.i3(new gp(this, x70Var, a10), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                n0Var.f(true);
                x70 x70Var2 = this.V;
                if (x70Var2 != null && (characterStyle = x70Var2.f40190i) == a10) {
                    if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.V = null;
                    return true;
                }
                this.V = null;
            }
            if (motionEvent.getAction() == 3) {
                n0Var.f(true);
                this.V = null;
            }
        }
        if (this.V != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public void setDisablePaddingsOffset(boolean z9) {
        this.W = z9;
    }

    @Override
    public void setDisablePaddingsOffsetX(boolean z9) {
        this.f35734a0 = z9;
    }

    @Override
    public void setDisablePaddingsOffsetY(boolean z9) {
        this.f35735b0 = z9;
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
    }
}
