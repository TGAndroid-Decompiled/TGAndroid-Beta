package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public class y5 extends TextView {
    public int f32844a;
    public PorterDuffColorFilter f32845b;
    public v5 f32846c;

    public y5(Context context) {
        super(context);
        this.f32844a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32846c = z5.update(this.f32844a, this, this.f32846c, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z5.release(this, this.f32846c);
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
        z5.drawAnimatedEmojis(canvas2, getLayout(), this.f32846c, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f32845b);
        if (i10 == 0 && f10 == 0.0f) {
            return;
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f32846c = z5.update(this.f32844a, this, this.f32846c, getLayout());
    }

    public void setCacheType(int i10) {
        if (this.f32844a == i10) {
            return;
        }
        this.f32844a = i10;
        this.f32846c = z5.update(i10, this, this.f32846c, getLayout());
    }

    public void setEmojiColor(int i10) {
        this.f32845b = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f32846c = z5.update(this.f32844a, this, this.f32846c, getLayout());
    }
}
