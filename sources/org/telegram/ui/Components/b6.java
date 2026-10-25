package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public class b6 extends TextView {
    public int f26758a;
    public PorterDuffColorFilter f26759b;
    public y5 f26760c;

    public b6(Context context) {
        super(context);
        this.f26758a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26760c = c6.update(this.f26758a, this, this.f26760c, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c6.release(this, this.f26760c);
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
        if (LocaleController.isRTL) {
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
        c6.drawAnimatedEmojis(canvas2, getLayout(), this.f26760c, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f26759b);
        if (i10 == 0 && f10 == 0.0f) {
            return;
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f26760c = c6.update(this.f26758a, this, this.f26760c, getLayout());
    }

    public void setCacheType(int i10) {
        if (this.f26758a == i10) {
            return;
        }
        this.f26758a = i10;
        this.f26760c = c6.update(i10, this, this.f26760c, getLayout());
    }

    public void setEmojiColor(int i10) {
        this.f26759b = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f26760c = c6.update(this.f26758a, this, this.f26760c, getLayout());
    }
}
