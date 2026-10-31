package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class cc0 extends pj0 implements org.telegram.messenger.z5 {
    public static final Paint H;
    public static final Paint I;
    public static final TextPaint J;
    public static final TextPaint K;
    public static final TextPaint L;
    public static final TextPaint M;
    public static final TextPaint N;
    public static final TextPaint O;
    public static final DecelerateInterpolator P;
    public String D;
    public String E;
    public String F;
    public String G;
    public long f25044a;
    public float f25045b;
    public float f25046c;
    public long d;
    public float e;
    public float f25047f;
    public boolean h;
    public View f25048n;
    public org.telegram.messenger.jj f25049r;
    public int f25050s;
    public boolean f25051w;
    public boolean f25052x;
    public Drawable f25053y;

    static {
        Paint paint = new Paint();
        H = paint;
        Paint paint2 = new Paint(1);
        I = paint2;
        TextPaint textPaint = new TextPaint(1);
        J = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        K = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        L = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        M = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        N = textPaint5;
        TextPaint textPaint6 = new TextPaint(1);
        O = textPaint6;
        P = new DecelerateInterpolator();
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-14209998);
        textPaint.setColor(-1);
        textPaint2.setColor(-1);
        textPaint3.setColor(-10327179);
        textPaint4.setColor(-10327179);
        textPaint5.setColor(-1);
        textPaint6.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint2.setTypeface(org.telegram.messenger.i0.o());
        textPaint4.setTypeface(org.telegram.messenger.i0.o());
        textPaint5.setTypeface(org.telegram.messenger.i0.o());
        textPaint6.setTypeface(org.telegram.messenger.i0.o());
    }

    @Override
    public final void C(boolean z10) {
        a();
    }

    @Override
    public final void M(String str) {
        b(true, 1.0f);
        a();
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cc0.a():void");
    }

    public final void b(boolean z10, float f7) {
        if (!z10) {
            this.e = f7;
            this.f25046c = f7;
        } else {
            this.f25046c = this.e;
        }
        this.G = String.format("%d%%", Integer.valueOf((int) (100.0f * f7)));
        if (f7 != 1.0f) {
            this.f25047f = 1.0f;
        }
        this.f25045b = f7;
        this.d = 0L;
        this.f25044a = System.currentTimeMillis();
        this.f25048n.invalidate();
    }

    @Override
    public final void draw(Canvas canvas) {
        String str;
        TextPaint textPaint;
        String str2;
        TextPaint textPaint2;
        String str3;
        TextPaint textPaint3;
        String L0;
        int L2;
        TextPaint textPaint4;
        String str4;
        TextPaint textPaint5;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        canvas.drawRect(0.0f, 0.0f, width, height, H);
        int y3 = org.telegram.messenger.z20.y(240.0f, height, 2);
        int y10 = org.telegram.messenger.z20.y(48.0f, width, 2);
        Drawable drawable = this.f25053y;
        drawable.setBounds(y10, y3, org.telegram.messenger.i0.L(48.0f) + y10, org.telegram.messenger.i0.L(48.0f) + y3);
        drawable.draw(canvas);
        canvas.drawText(this.D, (width - ((int) Math.ceil(textPaint.measureText(str)))) / 2, org.telegram.messenger.i0.L(31.0f) + y3, J);
        canvas.drawText(this.E, (width - ((int) Math.ceil(textPaint2.measureText(str2)))) / 2, org.telegram.messenger.i0.L(96.0f) + y3, K);
        canvas.drawText(this.F, (width - ((int) Math.ceil(textPaint3.measureText(str3)))) / 2, org.telegram.messenger.i0.L(125.0f) + y3, L);
        if (this.f25052x) {
            L0 = org.telegram.messenger.cd.L0(2131747822, null);
            textPaint4 = O;
            L2 = 0;
        } else {
            if (this.f25051w) {
                L0 = org.telegram.messenger.cd.L0(2131752589, null).toUpperCase();
            } else {
                L0 = org.telegram.messenger.cd.L0(2131744284, null);
            }
            L2 = org.telegram.messenger.i0.L(28.0f);
            textPaint4 = M;
        }
        canvas.drawText(L0, (width - ((int) Math.ceil(textPaint4.measureText(L0)))) / 2, org.telegram.messenger.m5.C(235.0f, y3, L2), textPaint4);
        if (this.h) {
            if (this.G != null) {
                canvas.drawText(this.G, (width - ((int) Math.ceil(textPaint5.measureText(str4)))) / 2, org.telegram.messenger.i0.L(210.0f) + y3, N);
            }
            int y11 = org.telegram.messenger.z20.y(240.0f, width, 2);
            int L3 = org.telegram.messenger.i0.L(232.0f) + y3;
            Paint paint = I;
            paint.setColor(-10327179);
            paint.setAlpha((int) (this.f25047f * 255.0f));
            float f7 = L3;
            canvas.drawRect(((int) (org.telegram.messenger.i0.L(240.0f) * this.e)) + y11, f7, org.telegram.messenger.i0.L(240.0f) + y11, org.telegram.messenger.i0.L(2.0f) + L3, paint);
            paint.setColor(-1);
            paint.setAlpha((int) (this.f25047f * 255.0f));
            float f10 = y11;
            canvas.drawRect(f10, f7, (org.telegram.messenger.i0.L(240.0f) * this.e) + f10, org.telegram.messenger.i0.L(2.0f) + L3, paint);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f25044a;
            this.f25044a = currentTimeMillis;
            float f11 = this.e;
            if (f11 != 1.0f) {
                float f12 = this.f25045b;
                if (f11 != f12) {
                    float f13 = this.f25046c;
                    float f14 = f12 - f13;
                    if (f14 > 0.0f) {
                        long j11 = this.d + j10;
                        this.d = j11;
                        if (j11 >= 300) {
                            this.e = f12;
                            this.f25046c = f12;
                            this.d = 0L;
                        } else {
                            this.e = (P.getInterpolation(((float) j11) / 300.0f) * f14) + f13;
                        }
                    }
                    this.f25048n.invalidate();
                }
            }
            int i10 = (this.e > 1.0f ? 1 : (this.e == 1.0f ? 0 : -1));
            if (i10 >= 0 && i10 == 0) {
                float f15 = this.f25047f;
                if (f15 != 0.0f) {
                    float f16 = f15 - (((float) j10) / 200.0f);
                    this.f25047f = f16;
                    if (f16 <= 0.0f) {
                        this.f25047f = 0.0f;
                    }
                    this.f25048n.invalidate();
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f25048n.getMeasuredHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f25048n.getMeasuredWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f25048n.getMeasuredHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f25048n.getMeasuredWidth();
    }

    @Override
    public final int getObserverTag() {
        return this.f25050s;
    }

    @Override
    public final int getOpacity() {
        return -1;
    }

    @Override
    public final void i(long j10, long j11) {
        if (!this.h) {
            a();
        }
        b(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = this.f25053y;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
        H.setAlpha(i10);
        J.setAlpha(i10);
        K.setAlpha(i10);
        L.setAlpha(i10);
        M.setAlpha(i10);
        N.setAlpha(i10);
        O.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public final void n(long j10, long j11) {
    }
}
