package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
public class o5 extends TextView {
    public int f36713a;
    public PorterDuffColorFilter f36714b;
    public l5 f36715c;

    public o5(Context context) {
        super(context);
        this.f36713a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36715c = p5.update(this.f36713a, this, this.f36715c, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p5.release(this, this.f36715c);
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
        if (org.telegram.messenger.bd.f21784a0) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        float f11 = paddingLeft;
        int i3 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i3 == 0 && f11 == 0.0f) {
            canvas2 = canvas;
        } else {
            canvas.save();
            canvas2 = canvas;
            canvas2.translate(f11, f10);
        }
        p5.drawAnimatedEmojis(canvas2, getLayout(), this.f36715c, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f36714b);
        if (i3 == 0 && f11 == 0.0f) {
            return;
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.f36715c = p5.update(this.f36713a, this, this.f36715c, getLayout());
    }

    public void setCacheType(int i3) {
        if (this.f36713a == i3) {
            return;
        }
        this.f36713a = i3;
        this.f36715c = p5.update(i3, this, this.f36715c, getLayout());
    }

    public void setEmojiColor(int i3) {
        this.f36714b = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f36715c = p5.update(this.f36713a, this, this.f36715c, getLayout());
    }
}
