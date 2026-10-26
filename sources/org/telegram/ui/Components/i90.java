package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class i90 extends View {
    public static DecelerateInterpolator v;
    public static Paint f29229w;
    public long f29230a;
    public float f29231b;
    public float f29232c;
    public long d;
    public float e;
    public float f29233f;
    public int h;
    public int f29234n;
    public final RectF f29235r;
    public org.telegram.ui.Components.voip.h f29236s;

    public i90(Context context) {
        super(context);
        this.f29233f = 1.0f;
        this.f29235r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f29229w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f29229w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f7, boolean z10) {
        if (!z10) {
            this.e = f7;
            this.f29232c = f7;
        } else {
            this.f29232c = this.e;
        }
        if (f7 != 1.0f) {
            this.f29233f = 1.0f;
        }
        this.f29231b = f7;
        this.d = 0L;
        this.f29230a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f29231b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.f29235r;
        if (i10 != 0 && this.e != 1.0f) {
            f29229w.setColor(i10);
            f29229w.setAlpha((int) (this.f29233f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f29229w);
        }
        f29229w.setColor(this.f29234n);
        f29229w.setAlpha((int) (this.f29233f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f29229w);
        if (this.f29233f > 0.0f) {
            if (this.f29236s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f29236s = hVar;
                hVar.f33824k = false;
                hVar.f33827n = 0.8f;
                hVar.f33826m = 1.2f;
            }
            this.f29236s.f33820f = getMeasuredWidth();
            this.f29236s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f29230a;
        this.f29230a = currentTimeMillis;
        float f7 = this.e;
        if (f7 != 1.0f) {
            float f10 = this.f29231b;
            if (f7 != f10) {
                float f11 = this.f29232c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j11 = this.d + j10;
                    this.d = j11;
                    if (j11 >= 300) {
                        this.e = f10;
                        this.f29232c = f10;
                        this.d = 0L;
                    } else {
                        this.e = (v.getInterpolation(((float) j11) / 300.0f) * f12) + f11;
                    }
                }
                invalidate();
            }
        }
        int i11 = (this.e > 1.0f ? 1 : (this.e == 1.0f ? 0 : -1));
        if (i11 >= 0 && i11 == 0) {
            float f13 = this.f29233f;
            if (f13 != 0.0f) {
                float f14 = f13 - (((float) j10) / 200.0f);
                this.f29233f = f14;
                if (f14 <= 0.0f) {
                    this.f29233f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.f29234n = i10;
    }
}
