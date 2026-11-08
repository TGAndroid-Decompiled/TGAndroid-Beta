package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
public class q5 extends TextView {
    public int f37196a;
    public PorterDuffColorFilter f37197b;
    public n5 f37198c;

    public q5(Context context) {
        super(context);
        this.f37196a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37198c = r5.update(this.f37196a, this, this.f37198c, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r5.release(this, this.f37198c);
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
        if (org.telegram.messenger.id.f23157a0) {
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
        r5.drawAnimatedEmojis(canvas2, getLayout(), this.f37198c, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f37197b);
        if (i7 == 0 && f11 == 0.0f) {
            return;
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f37198c = r5.update(this.f37196a, this, this.f37198c, getLayout());
    }

    public void setCacheType(int i7) {
        if (this.f37196a == i7) {
            return;
        }
        this.f37196a = i7;
        this.f37198c = r5.update(i7, this, this.f37198c, getLayout());
    }

    public void setEmojiColor(int i7) {
        this.f37197b = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f37198c = r5.update(this.f37196a, this, this.f37198c, getLayout());
    }
}
