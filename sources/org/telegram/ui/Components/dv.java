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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
public final class dv extends vh.n {
    public final fa0 U;
    public ja0 V;
    public boolean W;
    public boolean f25470a0;
    public boolean f25471b0;

    public dv(Context context) {
        super(context, null, true);
        this.U = new fa0(this);
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
            if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
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
            if (this.f25470a0) {
                paddingLeft = 0.0f;
            } else {
                paddingLeft = getPaddingLeft();
            }
            if (!this.f25471b0) {
                f7 = getPaddingTop();
            }
            canvas.translate(paddingLeft, f7);
        }
        if (this.U.f(canvas)) {
            invalidate();
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        fa0 fa0Var = this.U;
        if (fa0Var != null) {
            Layout layout = getLayout();
            ClickableSpan a2 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a2 != null && motionEvent.getAction() == 0) {
                ja0 ja0Var = new ja0(a2, null, motionEvent.getX(), motionEvent.getY(), 0);
                this.V = ja0Var;
                fa0Var.a(ja0Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.V.f27429i);
                int spanEnd = spannableString.getSpanEnd(this.V.f27429i);
                ca0 b10 = this.V.b();
                b10.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b10);
                AndroidUtilities.runOnUIThread(new pq(this, ja0Var, a2), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                fa0Var.d(true);
                ja0 ja0Var2 = this.V;
                if (ja0Var2 != null && (characterStyle = ja0Var2.f27429i) == a2) {
                    if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.V = null;
                    return true;
                }
                this.V = null;
            }
            if (motionEvent.getAction() == 3) {
                fa0Var.d(true);
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
        this.f25470a0 = z10;
    }

    @Override
    public void setDisablePaddingsOffsetY(boolean z10) {
        this.f25471b0 = z10;
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
    }
}
