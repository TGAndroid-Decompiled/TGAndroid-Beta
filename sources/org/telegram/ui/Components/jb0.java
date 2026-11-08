package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class jb0 extends li0 implements org.telegram.messenger.x5 {
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
    public long f34942a;
    public float f34943b;
    public float f34944c;
    public long d;
    public float f34945e;
    public float f34946f;
    public boolean h;
    public View f34947n;
    public org.telegram.messenger.ij f34948r;
    public int f34949s;
    public boolean f34950w;
    public boolean f34951x;
    public Drawable f34952y;

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
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint4.setTypeface(org.telegram.messenger.g0.o());
        textPaint5.setTypeface(org.telegram.messenger.g0.o());
        textPaint6.setTypeface(org.telegram.messenger.g0.o());
    }

    @Override
    public final void C(boolean z9) {
        a();
    }

    @Override
    public final void M(String str) {
        b(true, 1.0f);
        a();
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jb0.a():void");
    }

    public final void b(boolean z9, float f10) {
        if (!z9) {
            this.f34945e = f10;
            this.f34944c = f10;
        } else {
            this.f34944c = this.f34945e;
        }
        this.G = String.format("%d%%", Integer.valueOf((int) (100.0f * f10)));
        if (f10 != 1.0f) {
            this.f34946f = 1.0f;
        }
        this.f34943b = f10;
        this.d = 0L;
        this.f34942a = System.currentTimeMillis();
        this.f34947n.invalidate();
    }

    @Override
    public final void draw(Canvas canvas) {
        String str;
        TextPaint textPaint;
        String str2;
        TextPaint textPaint2;
        String str3;
        TextPaint textPaint3;
        String M0;
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
        int y10 = org.telegram.messenger.camera.q.y(240.0f, height, 2);
        int y11 = org.telegram.messenger.camera.q.y(48.0f, width, 2);
        Drawable drawable = this.f34952y;
        drawable.setBounds(y11, y10, org.telegram.messenger.g0.L(48.0f) + y11, org.telegram.messenger.g0.L(48.0f) + y10);
        drawable.draw(canvas);
        canvas.drawText(this.D, (width - ((int) Math.ceil(textPaint.measureText(str)))) / 2, org.telegram.messenger.g0.L(31.0f) + y10, J);
        canvas.drawText(this.E, (width - ((int) Math.ceil(textPaint2.measureText(str2)))) / 2, org.telegram.messenger.g0.L(96.0f) + y10, K);
        canvas.drawText(this.F, (width - ((int) Math.ceil(textPaint3.measureText(str3)))) / 2, org.telegram.messenger.g0.L(125.0f) + y10, L);
        if (this.f34951x) {
            M0 = org.telegram.messenger.id.M0(2131747807, null);
            textPaint4 = O;
            L2 = 0;
        } else {
            if (this.f34950w) {
                M0 = org.telegram.messenger.id.M0(2131752589, null).toUpperCase();
            } else {
                M0 = org.telegram.messenger.id.M0(2131744261, null);
            }
            L2 = org.telegram.messenger.g0.L(28.0f);
            textPaint4 = M;
        }
        canvas.drawText(M0, (width - ((int) Math.ceil(textPaint4.measureText(M0)))) / 2, org.telegram.messenger.k5.C(235.0f, y10, L2), textPaint4);
        if (this.h) {
            if (this.G != null) {
                canvas.drawText(this.G, (width - ((int) Math.ceil(textPaint5.measureText(str4)))) / 2, org.telegram.messenger.g0.L(210.0f) + y10, N);
            }
            int y12 = org.telegram.messenger.camera.q.y(240.0f, width, 2);
            int L3 = org.telegram.messenger.g0.L(232.0f) + y10;
            Paint paint = I;
            paint.setColor(-10327179);
            paint.setAlpha((int) (this.f34946f * 255.0f));
            float f10 = L3;
            canvas.drawRect(((int) (org.telegram.messenger.g0.L(240.0f) * this.f34945e)) + y12, f10, org.telegram.messenger.g0.L(240.0f) + y12, org.telegram.messenger.g0.L(2.0f) + L3, paint);
            paint.setColor(-1);
            paint.setAlpha((int) (this.f34946f * 255.0f));
            float f11 = y12;
            canvas.drawRect(f11, f10, (org.telegram.messenger.g0.L(240.0f) * this.f34945e) + f11, org.telegram.messenger.g0.L(2.0f) + L3, paint);
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f34942a;
            this.f34942a = currentTimeMillis;
            float f12 = this.f34945e;
            if (f12 != 1.0f) {
                float f13 = this.f34943b;
                if (f12 != f13) {
                    float f14 = this.f34944c;
                    float f15 = f13 - f14;
                    if (f15 > 0.0f) {
                        long j10 = this.d + j3;
                        this.d = j10;
                        if (j10 >= 300) {
                            this.f34945e = f13;
                            this.f34944c = f13;
                            this.d = 0L;
                        } else {
                            this.f34945e = (P.getInterpolation(((float) j10) / 300.0f) * f15) + f14;
                        }
                    }
                    this.f34947n.invalidate();
                }
            }
            int i7 = (this.f34945e > 1.0f ? 1 : (this.f34945e == 1.0f ? 0 : -1));
            if (i7 >= 0 && i7 == 0) {
                float f16 = this.f34946f;
                if (f16 != 0.0f) {
                    float f17 = f16 - (((float) j3) / 200.0f);
                    this.f34946f = f17;
                    if (f17 <= 0.0f) {
                        this.f34946f = 0.0f;
                    }
                    this.f34947n.invalidate();
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f34947n.getMeasuredHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f34947n.getMeasuredWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f34947n.getMeasuredHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f34947n.getMeasuredWidth();
    }

    @Override
    public final int getObserverTag() {
        return this.f34949s;
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
        Drawable drawable = this.f34952y;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
        H.setAlpha(i7);
        J.setAlpha(i7);
        K.setAlpha(i7);
        L.setAlpha(i7);
        M.setAlpha(i7);
        N.setAlpha(i7);
        O.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
