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
public final class xt extends nh.p {
    public final ji.a U;
    public q80 V;
    public boolean W;
    public boolean f32631a0;
    public boolean f32632b0;

    public xt(Context context) {
        super(context, null, true);
        this.U = new ji.a(this);
    }

    @Override
    public final ClickableSpan a(int i10, int i11) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i10 - getPaddingLeft();
        int paddingTop = i11 - getPaddingTop();
        int lineForVertical = layout.getLineForVertical(paddingTop);
        float f7 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f7);
        float lineLeft = getLayout().getLineLeft(lineForVertical);
        if (lineLeft <= f7 && layout.getLineWidth(lineForVertical) + lineLeft >= f7 && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !org.telegram.messenger.i0.C1()) {
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
            float f7 = 0.0f;
            if (this.f32631a0) {
                paddingLeft = 0.0f;
            } else {
                paddingLeft = getPaddingLeft();
            }
            if (!this.f32632b0) {
                f7 = getPaddingTop();
            }
            canvas.translate(paddingLeft, f7);
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
        ji.a aVar = this.U;
        if (aVar != null) {
            Layout layout = getLayout();
            ClickableSpan a2 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a2 != null && motionEvent.getAction() == 0) {
                q80 q80Var = new q80(a2, null, motionEvent.getX(), motionEvent.getY(), 0);
                this.V = q80Var;
                aVar.b(q80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.V.f29671i);
                int spanEnd = spannableString.getSpanEnd(this.V.f29671i);
                k80 b10 = this.V.b();
                b10.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b10);
                org.telegram.messenger.i0.h3(new ho(this, q80Var, a2), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                aVar.f(true);
                q80 q80Var2 = this.V;
                if (q80Var2 != null && (characterStyle = q80Var2.f29671i) == a2) {
                    if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.V = null;
                    return true;
                }
                this.V = null;
            }
            if (motionEvent.getAction() == 3) {
                aVar.f(true);
                this.V = null;
            }
        }
        if (this.V != null || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public void setDisablePaddingsOffset(boolean z10) {
        this.W = z10;
    }

    @Override
    public void setDisablePaddingsOffsetX(boolean z10) {
        this.f32631a0 = z10;
    }

    @Override
    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f32632b0 = z10;
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(org.telegram.messenger.k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
    }
}
