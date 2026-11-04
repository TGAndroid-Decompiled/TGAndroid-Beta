package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class eb0 extends oi0 implements org.telegram.messenger.x5 {
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
    public long f33334a;
    public float f33335b;
    public float f33336c;
    public long d;
    public float f33337e;
    public float f33338f;
    public boolean h;
    public View f33339n;
    public org.telegram.messenger.zi f33340r;
    public int f33341s;
    public boolean f33342w;
    public boolean f33343x;
    public Drawable f33344y;

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
    public final void M(String str) {
        b(true, 1.0f);
        a();
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eb0.a():void");
    }

    public final void b(boolean z10, float f10) {
        if (!z10) {
            this.f33337e = f10;
            this.f33336c = f10;
        } else {
            this.f33336c = this.f33337e;
        }
        this.H = String.format("%d%%", Integer.valueOf((int) (100.0f * f10)));
        if (f10 != 1.0f) {
            this.f33338f = 1.0f;
        }
        this.f33335b = f10;
        this.d = 0L;
        this.f33334a = System.currentTimeMillis();
        this.f33339n.invalidate();
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
        canvas.drawRect(0.0f, 0.0f, width, height, I);
        int y9 = org.telegram.messenger.camera.q.y(240.0f, height, 2);
        int y10 = org.telegram.messenger.camera.q.y(48.0f, width, 2);
        Drawable drawable = this.f33344y;
        drawable.setBounds(y10, y9, org.telegram.messenger.g0.L(48.0f) + y10, org.telegram.messenger.g0.L(48.0f) + y9);
        drawable.draw(canvas);
        canvas.drawText(this.E, (width - ((int) Math.ceil(textPaint.measureText(str)))) / 2, org.telegram.messenger.g0.L(31.0f) + y9, K);
        canvas.drawText(this.F, (width - ((int) Math.ceil(textPaint2.measureText(str2)))) / 2, org.telegram.messenger.g0.L(96.0f) + y9, L);
        canvas.drawText(this.G, (width - ((int) Math.ceil(textPaint3.measureText(str3)))) / 2, org.telegram.messenger.g0.L(125.0f) + y9, M);
        if (this.f33343x) {
            M0 = org.telegram.messenger.bd.M0(2131747814, null);
            textPaint4 = P;
            L2 = 0;
        } else {
            if (this.f33342w) {
                M0 = org.telegram.messenger.bd.M0(2131752589, null).toUpperCase();
            } else {
                M0 = org.telegram.messenger.bd.M0(2131744268, null);
            }
            L2 = org.telegram.messenger.g0.L(28.0f);
            textPaint4 = N;
        }
        canvas.drawText(M0, (width - ((int) Math.ceil(textPaint4.measureText(M0)))) / 2, org.telegram.messenger.k5.C(235.0f, y9, L2), textPaint4);
        if (this.h) {
            if (this.H != null) {
                canvas.drawText(this.H, (width - ((int) Math.ceil(textPaint5.measureText(str4)))) / 2, org.telegram.messenger.g0.L(210.0f) + y9, O);
            }
            int y11 = org.telegram.messenger.camera.q.y(240.0f, width, 2);
            int L3 = org.telegram.messenger.g0.L(232.0f) + y9;
            Paint paint = J;
            paint.setColor(-10327179);
            paint.setAlpha((int) (this.f33338f * 255.0f));
            float f10 = L3;
            canvas.drawRect(((int) (org.telegram.messenger.g0.L(240.0f) * this.f33337e)) + y11, f10, org.telegram.messenger.g0.L(240.0f) + y11, org.telegram.messenger.g0.L(2.0f) + L3, paint);
            paint.setColor(-1);
            paint.setAlpha((int) (this.f33338f * 255.0f));
            float f11 = y11;
            canvas.drawRect(f11, f10, (org.telegram.messenger.g0.L(240.0f) * this.f33337e) + f11, org.telegram.messenger.g0.L(2.0f) + L3, paint);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f33334a;
            this.f33334a = currentTimeMillis;
            float f12 = this.f33337e;
            if (f12 != 1.0f) {
                float f13 = this.f33335b;
                if (f12 != f13) {
                    float f14 = this.f33336c;
                    float f15 = f13 - f14;
                    if (f15 > 0.0f) {
                        long j11 = this.d + j10;
                        this.d = j11;
                        if (j11 >= 300) {
                            this.f33337e = f13;
                            this.f33336c = f13;
                            this.d = 0L;
                        } else {
                            this.f33337e = (Q.getInterpolation(((float) j11) / 300.0f) * f15) + f14;
                        }
                    }
                    this.f33339n.invalidate();
                }
            }
            int i3 = (this.f33337e > 1.0f ? 1 : (this.f33337e == 1.0f ? 0 : -1));
            if (i3 >= 0 && i3 == 0) {
                float f16 = this.f33338f;
                if (f16 != 0.0f) {
                    float f17 = f16 - (((float) j10) / 200.0f);
                    this.f33338f = f17;
                    if (f17 <= 0.0f) {
                        this.f33338f = 0.0f;
                    }
                    this.f33339n.invalidate();
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f33339n.getMeasuredHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f33339n.getMeasuredWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f33339n.getMeasuredHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f33339n.getMeasuredWidth();
    }

    @Override
    public final int getObserverTag() {
        return this.f33341s;
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
    public final void setAlpha(int i3) {
        Drawable drawable = this.f33344y;
        if (drawable != null) {
            drawable.setAlpha(i3);
        }
        I.setAlpha(i3);
        K.setAlpha(i3);
        L.setAlpha(i3);
        M.setAlpha(i3);
        N.setAlpha(i3);
        O.setAlpha(i3);
        P.setAlpha(i3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
