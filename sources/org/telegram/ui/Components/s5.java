package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;

public class s5 extends TextView {

    public int f32335a;

    public PorterDuffColorFilter f32336b;

    public p5 f32337c;

    public s5(Context context) {
        super(context);
        this.f32335a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32337c = t5.update(this.f32335a, this, this.f32337c, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t5.release(this, this.f32337c);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float height;
        Canvas canvas2;
        super.onDraw(canvas);
        if ((getGravity() & 16) == 0 || getLayout() == null) {
            height = 0.0f;
        } else {
            height = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
        }
        float paddingRight = LocaleController.isRTL ? getPaddingRight() : getPaddingLeft();
        if (height == 0.0f && paddingRight == 0.0f) {
            canvas2 = canvas;
        } else {
            canvas.save();
            canvas2 = canvas;
            canvas2.translate(paddingRight, height);
        }
        t5.drawAnimatedEmojis(canvas2, getLayout(), this.f32337c, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f32336b);
        if (height == 0.0f && paddingRight == 0.0f) {
            return;
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f32337c = t5.update(this.f32335a, this, this.f32337c, getLayout());
    }

    public void setCacheType(int i10) {
        if (this.f32335a == i10) {
            return;
        }
        this.f32335a = i10;
        this.f32337c = t5.update(i10, this, this.f32337c, getLayout());
    }

    public void setEmojiColor(int i10) {
        this.f32336b = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f32337c = t5.update(this.f32335a, this, this.f32337c, getLayout());
    }
}
