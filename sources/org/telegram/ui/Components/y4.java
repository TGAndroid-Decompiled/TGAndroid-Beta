package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.text.TextUtils;
public abstract class y4 extends s70 implements te.b {
    public final te.c P0;
    public Picture Q0;
    public float R0;
    public int S0;
    public Paint T0;

    public y4(Context context) {
        super(context);
        this.P0 = new te.c(0, this, xq.h, 320L, 1.0f);
        this.S0 = 0;
    }

    @Override
    public final void F(float f10, int i7) {
        if (f10 == 1.0f) {
            if (this.Q0 != null) {
                this.Q0 = null;
                super.setLayerType(this.S0, this.T0);
            }
            invalidate();
        }
    }

    @Override
    public int getLayerType() {
        return this.S0;
    }

    public final void n(Canvas canvas, float f10, float f11) {
        if (f10 >= 1.0f && f11 == 0.0f) {
            super.onDraw(canvas);
            return;
        }
        canvas.save();
        canvas.translate(0.0f, f11);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f10 * 255.0f));
        super.onDraw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public final boolean o(CharSequence charSequence, boolean z9) {
        CharSequence text = getText();
        if (TextUtils.equals(text, charSequence)) {
            return l(charSequence, false);
        }
        te.c cVar = this.P0;
        if (z9 && isAttachedToWindow() && isLaidOut() && getVisibility() == 0 && getAlpha() > 0.0f && getWidth() > 0 && getHeight() > 0 && !TextUtils.isEmpty(text)) {
            Picture picture = new Picture();
            n(picture.beginRecording(getWidth(), getHeight()), 1.0f, 0.0f);
            picture.endRecording();
            cVar.c(0.0f);
            this.Q0 = picture;
            this.R0 = getTranslationX();
            super.setLayerType(0, null);
            cVar.a(1.0f);
        } else {
            cVar.c(1.0f);
            if (this.Q0 != null) {
                this.Q0 = null;
                super.setLayerType(this.S0, this.T0);
            }
            invalidate();
        }
        invalidate();
        return l(charSequence, false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.Q0 == null) {
            super.onDraw(canvas);
            return;
        }
        float f10 = this.P0.f55492f;
        int L = org.telegram.messenger.g0.L(6.0f);
        canvas.save();
        canvas.translate(this.R0 - getTranslationX(), (-L) * f10);
        float f11 = 1.0f - f10;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.Q0.getWidth(), this.Q0.getHeight(), (int) (255.0f * f11));
        canvas.drawPicture(this.Q0);
        canvas.restore();
        canvas.restore();
        n(canvas, f10, L * f11);
    }

    @Override
    public final void setLayerType(int i7, Paint paint) {
        this.S0 = i7;
        this.T0 = paint;
        if (this.Q0 == null) {
            super.setLayerType(i7, paint);
        }
    }
}
