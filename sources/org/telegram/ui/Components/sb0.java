package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class sb0 extends bj0 implements org.telegram.messenger.y5 {
    public static final Paint I;
    public static final Paint J;
    public static final TextPaint K;
    public static final TextPaint L;
    public static final TextPaint M;
    public static final TextPaint N;
    public static final TextPaint O;
    public static final TextPaint P;
    public static final DecelerateInterpolator Q;
    public String E;
    public String F;
    public String G;
    public String H;
    public long f39555a;
    public float f39556b;
    public float f39557c;
    public long d;
    public float f39558e;
    public float f39559f;
    public boolean h;
    public View f39560n;
    public org.telegram.messenger.fj f39561r;
    public int f39562s;
    public boolean f39563w;
    public boolean f39564x;
    public Drawable f39565y;

    static {
        Paint paint = new Paint();
        I = paint;
        Paint paint2 = new Paint(1);
        J = paint2;
        TextPaint textPaint = new TextPaint(1);
        K = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        L = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        M = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        N = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        O = textPaint5;
        TextPaint textPaint6 = new TextPaint(1);
        P = textPaint6;
        Q = new DecelerateInterpolator();
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-14209998);
        textPaint.setColor(-1);
        textPaint2.setColor(-1);
        textPaint3.setColor(-10327179);
        textPaint4.setColor(-10327179);
        textPaint5.setColor(-1);
        textPaint6.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint4.setTypeface(org.telegram.messenger.g0.o());
        textPaint5.setTypeface(org.telegram.messenger.g0.o());
        textPaint6.setTypeface(org.telegram.messenger.g0.o());
    }

    @Override
    public final void C(boolean z10) {
        a();
    }

    @Override
    public final void N(String str) {
        b(true, 1.0f);
        a();
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sb0.a():void");
    }

    public final void b(boolean z10, float f10) {
        if (!z10) {
            this.f39558e = f10;
            this.f39557c = f10;
        } else {
            this.f39557c = this.f39558e;
        }
        this.H = String.format("%d%%", Integer.valueOf((int) (100.0f * f10)));
        if (f10 != 1.0f) {
            this.f39559f = 1.0f;
        }
        this.f39556b = f10;
        this.d = 0L;
        this.f39555a = System.currentTimeMillis();
        this.f39560n.invalidate();
    }

    @Override
    public final void draw(Canvas canvas) {
        String str;
        TextPaint textPaint;
        String str2;
        TextPaint textPaint2;
        String str3;
        TextPaint textPaint3;
        String N0;
        int L2;
        TextPaint textPaint4;
        String str4;
        TextPaint textPaint5;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        canvas.drawRect(0.0f, 0.0f, width, height, I);
        int z10 = org.telegram.messenger.m10.z(240.0f, height, 2);
        int z11 = org.telegram.messenger.m10.z(48.0f, width, 2);
        Drawable drawable = this.f39565y;
        drawable.setBounds(z11, z10, org.telegram.messenger.g0.L(48.0f) + z11, org.telegram.messenger.g0.L(48.0f) + z10);
        drawable.draw(canvas);
        canvas.drawText(this.E, (width - ((int) Math.ceil(textPaint.measureText(str)))) / 2, org.telegram.messenger.g0.L(31.0f) + z10, K);
        canvas.drawText(this.F, (width - ((int) Math.ceil(textPaint2.measureText(str2)))) / 2, org.telegram.messenger.g0.L(96.0f) + z10, L);
        canvas.drawText(this.G, (width - ((int) Math.ceil(textPaint3.measureText(str3)))) / 2, org.telegram.messenger.g0.L(125.0f) + z10, M);
        if (this.f39564x) {
            N0 = org.telegram.messenger.gd.N0(2131747612, null);
            textPaint4 = P;
            L2 = 0;
        } else {
            if (this.f39563w) {
                N0 = org.telegram.messenger.gd.N0(2131752577, null).toUpperCase();
            } else {
                N0 = org.telegram.messenger.gd.N0(2131744013, null);
            }
            L2 = org.telegram.messenger.g0.L(28.0f);
            textPaint4 = N;
        }
        canvas.drawText(N0, (width - ((int) Math.ceil(textPaint4.measureText(N0)))) / 2, org.telegram.messenger.f3.C(235.0f, z10, L2), textPaint4);
        if (this.h) {
            if (this.H != null) {
                canvas.drawText(this.H, (width - ((int) Math.ceil(textPaint5.measureText(str4)))) / 2, org.telegram.messenger.g0.L(210.0f) + z10, O);
            }
            int z12 = org.telegram.messenger.m10.z(240.0f, width, 2);
            int L3 = org.telegram.messenger.g0.L(232.0f) + z10;
            Paint paint = J;
            paint.setColor(-10327179);
            paint.setAlpha((int) (this.f39559f * 255.0f));
            float f10 = L3;
            canvas.drawRect(((int) (org.telegram.messenger.g0.L(240.0f) * this.f39558e)) + z12, f10, org.telegram.messenger.g0.L(240.0f) + z12, org.telegram.messenger.g0.L(2.0f) + L3, paint);
            paint.setColor(-1);
            paint.setAlpha((int) (this.f39559f * 255.0f));
            float f11 = z12;
            canvas.drawRect(f11, f10, (org.telegram.messenger.g0.L(240.0f) * this.f39558e) + f11, org.telegram.messenger.g0.L(2.0f) + L3, paint);
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f39555a;
            this.f39555a = currentTimeMillis;
            float f12 = this.f39558e;
            if (f12 != 1.0f) {
                float f13 = this.f39556b;
                if (f12 != f13) {
                    float f14 = this.f39557c;
                    float f15 = f13 - f14;
                    if (f15 > 0.0f) {
                        long j10 = this.d + j3;
                        this.d = j10;
                        if (j10 >= 300) {
                            this.f39558e = f13;
                            this.f39557c = f13;
                            this.d = 0L;
                        } else {
                            this.f39558e = (Q.getInterpolation(((float) j10) / 300.0f) * f15) + f14;
                        }
                    }
                    this.f39560n.invalidate();
                }
            }
            int i7 = (this.f39558e > 1.0f ? 1 : (this.f39558e == 1.0f ? 0 : -1));
            if (i7 >= 0 && i7 == 0) {
                float f16 = this.f39559f;
                if (f16 != 0.0f) {
                    float f17 = f16 - (((float) j3) / 200.0f);
                    this.f39559f = f17;
                    if (f17 <= 0.0f) {
                        this.f39559f = 0.0f;
                    }
                    this.f39560n.invalidate();
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f39560n.getMeasuredHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f39560n.getMeasuredWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f39560n.getMeasuredHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f39560n.getMeasuredWidth();
    }

    @Override
    public final int getObserverTag() {
        return this.f39562s;
    }

    @Override
    public final int getOpacity() {
        return -1;
    }

    @Override
    public final void i(long j3, long j10) {
        if (!this.h) {
            a();
        }
        b(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
    }

    @Override
    public final void setAlpha(int i7) {
        Drawable drawable = this.f39565y;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
        I.setAlpha(i7);
        K.setAlpha(i7);
        L.setAlpha(i7);
        M.setAlpha(i7);
        N.setAlpha(i7);
        O.setAlpha(i7);
        P.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
