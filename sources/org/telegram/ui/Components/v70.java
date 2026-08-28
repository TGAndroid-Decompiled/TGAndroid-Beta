package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class v70 extends View {
    public static DecelerateInterpolator v;
    public static Paint f33297w;
    public long f33298a;
    public float f33299b;
    public float f33300c;
    public long d;
    public float f33301e;
    public float f33302f;
    public int h;
    public int f33303n;
    public final RectF f33304r;
    public org.telegram.ui.Components.voip.h f33305s;

    public v70(Context context) {
        super(context);
        this.f33302f = 1.0f;
        this.f33304r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            f33297w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            f33297w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f10, boolean z10) {
        if (!z10) {
            this.f33301e = f10;
            this.f33300c = f10;
        } else {
            this.f33300c = this.f33301e;
        }
        if (f10 != 1.0f) {
            this.f33302f = 1.0f;
        }
        this.f33299b = f10;
        this.d = 0L;
        this.f33298a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.f33299b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9 = this.h;
        RectF rectF = this.f33304r;
        if (i9 != 0 && this.f33301e != 1.0f) {
            f33297w.setColor(i9);
            f33297w.setAlpha((int) (this.f33302f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f33297w);
        }
        f33297w.setColor(this.f33303n);
        f33297w.setAlpha((int) (this.f33302f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.f33301e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, f33297w);
        if (this.f33302f > 0.0f) {
            if (this.f33305s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.f33305s = hVar;
                hVar.f33545k = false;
                hVar.f33548n = 0.8f;
                hVar.f33547m = 1.2f;
            }
            this.f33305s.f33541f = getMeasuredWidth();
            this.f33305s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f33298a;
        this.f33298a = currentTimeMillis;
        float f10 = this.f33301e;
        if (f10 != 1.0f) {
            float f11 = this.f33299b;
            if (f10 != f11) {
                float f12 = this.f33300c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j11 = this.d + j10;
                    this.d = j11;
                    if (j11 >= 300) {
                        this.f33301e = f11;
                        this.f33300c = f11;
                        this.d = 0L;
                    } else {
                        this.f33301e = (v.getInterpolation(((float) j11) / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        int i10 = (this.f33301e > 1.0f ? 1 : (this.f33301e == 1.0f ? 0 : -1));
        if (i10 >= 0 && i10 == 0) {
            float f14 = this.f33302f;
            if (f14 != 0.0f) {
                float f15 = f14 - (((float) j10) / 200.0f);
                this.f33302f = f15;
                if (f15 <= 0.0f) {
                    this.f33302f = 0.0f;
                }
                invalidate();
            }
        }
    }

    public void setBackColor(int i9) {
        this.h = i9;
    }

    public void setProgressColor(int i9) {
        this.f33303n = i9;
    }
}
