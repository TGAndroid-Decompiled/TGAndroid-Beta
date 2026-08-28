package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public class s5 extends TextView {
    public int f32364a;
    public PorterDuffColorFilter f32365b;
    public p5 f32366c;

    public s5(Context context) {
        super(context);
        this.f32364a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32366c = t5.update(this.f32364a, this, this.f32366c, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t5.release(this, this.f32366c);
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
        if (LocaleController.isRTL) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        float f11 = paddingLeft;
        int i9 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i9 == 0 && f11 == 0.0f) {
            canvas2 = canvas;
        } else {
            canvas.save();
            canvas2 = canvas;
            canvas2.translate(f11, f10);
        }
        t5.drawAnimatedEmojis(canvas2, getLayout(), this.f32366c, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f32365b);
        if (i9 == 0 && f11 == 0.0f) {
            return;
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.f32366c = t5.update(this.f32364a, this, this.f32366c, getLayout());
    }

    public void setCacheType(int i9) {
        if (this.f32364a == i9) {
            return;
        }
        this.f32364a = i9;
        this.f32366c = t5.update(i9, this, this.f32366c, getLayout());
    }

    public void setEmojiColor(int i9) {
        this.f32365b = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f32366c = t5.update(this.f32364a, this, this.f32366c, getLayout());
    }
}
