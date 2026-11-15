package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class ig extends View {
    public ch0 E;
    public final float[] F;
    public long G;
    public final Paint H;
    public long I;
    public final ChatActivityEnterView J;
    public float f35606a;
    public boolean f35607b;
    public boolean f35608c;
    public final ch0 d;
    public boolean f35609e;
    public boolean f35610f;
    public long h;
    public boolean f35611n;
    public long f35612r;
    public float f35613s;
    public float f35614w;
    public float f35615x;
    public float f35616y;

    public ig(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.J = chatActivityEnterView;
        this.h = -1L;
        this.F = new float[3];
        this.G = -1L;
        this.H = new Paint(1);
        ch0 ch0Var = new ch0(2131623975, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.d = ch0Var;
        ch0Var.f33592p0 = true;
        g();
    }

    public static void a(ig igVar) {
        igVar.f35609e = true;
    }

    public static float b(long j3) {
        return (((float) Math.cos((((float) (j3 % 1300)) / 1300.0f) * 3.141592653589793d * 2.0d)) * 0.5f) + 0.5f;
    }

    public final void c() {
        this.f35608c = true;
        this.I = SystemClock.uptimeMillis();
        ch0 ch0Var = this.d;
        ch0Var.T(true, 0.0f);
        if (this.f35607b) {
            ch0Var.start();
        }
    }

    public final void d() {
        h();
    }

    public final void e() {
        ChatActivityEnterView chatActivityEnterView = this.J;
        chatActivityEnterView.f32188e4.setColor(chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.f28801ag));
        this.f35606a = 1.0f;
        System.currentTimeMillis();
        this.G = -1L;
        this.h = -1L;
        this.f35608c = false;
        this.d.stop();
        this.f35611n = false;
        this.f35616y = 0.0f;
        this.f35615x = 0.0f;
        this.f35614w = 0.0f;
        invalidate();
    }

    public final float f() {
        float i7 = (1.0f - Utilities.i(this.f35615x / 0.8f, 1.0f, 0.0f)) * this.f35614w;
        return com.google.android.gms.internal.vision.e2.C(i7, 2.0f, 3.0f, 12.0f * i7 * i7);
    }

    public final void g() {
        int i7 = org.telegram.ui.ActionBar.j6.f28801ag;
        int i10 = ChatActivityEnterView.N6;
        ChatActivityEnterView chatActivityEnterView = this.J;
        int u02 = chatActivityEnterView.u0(i7);
        int u03 = chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.Je);
        int u04 = chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.Vf);
        chatActivityEnterView.f32188e4.setColor(u02);
        ch0 ch0Var = this.d;
        ch0Var.f33573a0 = true;
        ch0Var.Q(u04, "Cup Red");
        ch0Var.Q(u04, "Box Red");
        ch0Var.Q(u04, "Cup Grey");
        ch0Var.Q(u04, "Box Grey");
        ch0Var.Q(u04, "Box_Grey 2");
        ch0Var.Q(u04, "Line 1");
        ch0Var.Q(u04, "Line 2");
        ch0Var.Q(u04, "Line 3");
        ch0Var.Q(u03, "Line 1 Dup");
        ch0Var.Q(u03, "Line 2 Dup");
        ch0Var.Q(u03, "Line 3 Dup");
        ch0Var.o();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ch0Var.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    public final ch0 h() {
        if (this.E == null) {
            ch0 ch0Var = new ch0(2131623977, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
            this.E = ch0Var;
            ch0Var.J(true);
            this.E.f33592p0 = false;
            int i7 = org.telegram.ui.ActionBar.j6.Vf;
            int i10 = ChatActivityEnterView.N6;
            int u02 = this.J.u0(i7);
            ch0 ch0Var2 = this.E;
            ch0Var2.f33573a0 = true;
            ch0Var2.Q(u02, "Cup Grey");
            this.E.Q(u02, "Box_Grey 2");
            this.E.Q(u02, "Box Grey");
            this.E.o();
            this.E.R(this);
            this.E.T(true, 0.0f);
        }
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35607b = true;
        boolean z10 = this.f35608c;
        ch0 ch0Var = this.d;
        if (z10) {
            ch0Var.start();
        }
        ch0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35607b = false;
        ch0 ch0Var = this.d;
        ch0Var.stop();
        ch0Var.R(null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        char c10;
        ChatActivityEnterView chatActivityEnterView = this.J;
        Paint paint = chatActivityEnterView.f32188e4;
        if (this.f35611n) {
            float min = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f35612r)) / 240.0f);
            float f16 = this.f35616y;
            int i7 = ChatActivityEnterView.N6;
            float interpolation = er.f34421i.getInterpolation(Utilities.i(f16 / 0.6f, 1.0f, 0.0f));
            float[] fArr = this.F;
            fArr[0] = 1.0f - ChatActivityEnterView.u2(0.05f, 0.55f, f16);
            fArr[1] = org.telegram.messenger.g0.T1(1.0f, 0.55f, interpolation);
            fArr[2] = interpolation * 20.0f;
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            ch0 h = h();
            float f17 = this.f35615x;
            if (f17 > 0.0f) {
                f15 = (Math.min(1.0f, f17) * 14.0f) + 30.0f;
            } else {
                f15 = this.f35614w * 8.0f;
            }
            h.T(true, f15 / 52.0f);
            h.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            canvas.save();
            float f18 = fArr[1];
            canvas.scale(f18, f18, measuredWidth, measuredHeight);
            canvas.rotate(fArr[2], measuredWidth, measuredHeight);
            canvas.rotate(f(), measuredWidth, org.telegram.messenger.g0.L(12.0f) + measuredHeight);
            float min2 = Math.min(1.0f, 1.8f * min);
            float u22 = 1.0f - ChatActivityEnterView.u2(0.25f, 0.85f, min);
            float interpolation2 = er.f34420g.getInterpolation(min);
            if (u22 > 0.0f) {
                c10 = 0;
                paint.setColor(i0.a.f(min2, chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.f28801ag), chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.Vf)));
                paint.setAlpha((int) (u22 * 255.0f * fArr[0]));
                canvas.drawCircle(measuredWidth, (org.telegram.messenger.g0.L(2.0f) * interpolation2) + measuredHeight, org.telegram.messenger.g0.T1(this.f35613s, org.telegram.messenger.g0.L(1.5f), interpolation2), paint);
            } else {
                c10 = 0;
            }
            float u23 = ChatActivityEnterView.u2(0.05f, 0.6f, min) * fArr[c10];
            if (u23 > 0.0f && h.u()) {
                float i10 = Utilities.i(min, 1.0f, 0.0f) - 1.0f;
                float T1 = org.telegram.messenger.g0.T1(0.45f, 1.0f, com.google.android.gms.internal.vision.e2.x(i10, 1.1f, i10, (2.1f * i10 * i10 * i10) + 1.0f));
                canvas.save();
                canvas.scale(T1, T1, measuredWidth, measuredHeight + org.telegram.messenger.g0.L(2.0f));
                h.setAlpha((int) (u23 * 255.0f));
                h.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            if (min < 1.0f || !h.u()) {
                invalidate();
                return;
            }
            return;
        }
        if (!this.f35610f) {
            long uptimeMillis = SystemClock.uptimeMillis();
            boolean z10 = this.f35609e;
            if (z10 || this.G < 0) {
                this.G = uptimeMillis;
            }
            if (!z10 && !this.f35608c) {
                f14 = b(uptimeMillis - this.G);
            } else {
                f14 = 1.0f;
            }
            this.f35606a = f14;
        }
        if (this.f35608c) {
            f10 = 1.0f;
            f11 = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.I)) / 160.0f);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        boolean z11 = this.f35608c;
        ch0 ch0Var = this.d;
        if (z11) {
            ch0Var.setAlpha((int) (f11 * 255.0f));
            ch0Var.draw(canvas);
            if (f11 < f10) {
                invalidate();
            }
        }
        if (!this.f35608c || f11 < f10 || !ch0Var.u()) {
            boolean z12 = this.f35608c;
            if (z12) {
                f12 = 1.0f;
            } else {
                f12 = this.f35606a;
            }
            if (z12 && ch0Var.u()) {
                f13 = 1.0f - f11;
            } else {
                f13 = 1.0f;
            }
            if (f13 <= 0.0f) {
                if (!this.f35610f) {
                    invalidate();
                    return;
                }
                return;
            }
            canvas.save();
            float T12 = org.telegram.messenger.g0.T1(0.4f, 1.0f, f13);
            canvas.scale(T12, T12, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            float measuredWidth2 = getMeasuredWidth() / 2.0f;
            float measuredHeight2 = getMeasuredHeight() / 2.0f;
            float T13 = org.telegram.messenger.g0.T1(0.85f, 1.0f, f12) * org.telegram.messenger.g0.L(5.0f);
            if (this.f35608c) {
                paint.setColor(i0.a.f(Math.min(1.0f, f11 * 2.5f), chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.f28801ag), chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.Vf)));
            }
            int color = paint.getColor();
            Paint paint2 = this.H;
            paint2.setColor(color);
            paint2.setAlpha((int) (40.8f * f12 * f13));
            canvas.drawCircle(measuredWidth2, measuredHeight2, org.telegram.messenger.g0.T1(1.35f, 1.75f, f12) * T13, paint2);
            paint.setAlpha((int) (org.telegram.messenger.g0.T1(0.6f, 1.0f, f12) * 255.0f * f13));
            canvas.drawCircle(measuredWidth2, measuredHeight2, T13, paint);
            canvas.restore();
        }
        if (!this.f35610f) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
