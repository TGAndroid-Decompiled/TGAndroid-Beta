package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
public class n5 extends TextView {
    public int f28667a;
    public PorterDuffColorFilter f28668b;
    public k5 f28669c;

    public n5(Context context) {
        super(context);
        this.f28667a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28669c = o5.update(this.f28667a, this, this.f28669c, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o5.release(this, this.f28669c);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f7;
        int paddingLeft;
        Canvas canvas2;
        super.onDraw(canvas);
        if ((getGravity() & 16) != 0 && getLayout() != null) {
            f7 = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
        } else {
            f7 = 0.0f;
        }
        if (org.telegram.messenger.dd.X) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        float f10 = paddingLeft;
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        if (i10 == 0 && f10 == 0.0f) {
            canvas2 = canvas;
        } else {
            canvas.save();
            canvas2 = canvas;
            canvas2.translate(f10, f7);
        }
        o5.drawAnimatedEmojis(canvas2, getLayout(), this.f28669c, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f28668b);
        if (i10 == 0 && f10 == 0.0f) {
            return;
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f28669c = o5.update(this.f28667a, this, this.f28669c, getLayout());
    }

    public void setCacheType(int i10) {
        if (this.f28667a == i10) {
            return;
        }
        this.f28667a = i10;
        this.f28669c = o5.update(i10, this, this.f28669c, getLayout());
    }

    public void setEmojiColor(int i10) {
        this.f28668b = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f28669c = o5.update(this.f28667a, this, this.f28669c, getLayout());
    }
}
