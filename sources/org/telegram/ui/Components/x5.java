package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
public class x5 extends TextView {
    public int f41976a;
    public PorterDuffColorFilter f41977b;
    public u5 f41978c;

    public x5(Context context) {
        super(context);
        this.f41976a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41978c = y5.update(this.f41976a, this, this.f41978c, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y5.release(this, this.f41978c);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        int paddingLeft;
        Canvas canvas2;
        super.onDraw(canvas);
        if ((getGravity() & 16) != 0 && getLayout() != null) {
            f10 = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
        } else {
            f10 = 0.0f;
        }
        if (org.telegram.messenger.hd.f24444a0) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        float f11 = paddingLeft;
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i7 == 0 && f11 == 0.0f) {
            canvas2 = canvas;
        } else {
            canvas.save();
            canvas2 = canvas;
            canvas2.translate(f11, f10);
        }
        y5.drawAnimatedEmojis(canvas2, getLayout(), this.f41978c, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f41977b);
        if (i7 == 0 && f11 == 0.0f) {
            return;
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f41978c = y5.update(this.f41976a, this, this.f41978c, getLayout());
    }

    public void setCacheType(int i7) {
        if (this.f41976a == i7) {
            return;
        }
        this.f41976a = i7;
        this.f41978c = y5.update(i7, this, this.f41978c, getLayout());
    }

    public void setEmojiColor(int i7) {
        this.f41977b = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f41978c = y5.update(this.f41976a, this, this.f41978c, getLayout());
    }
}
