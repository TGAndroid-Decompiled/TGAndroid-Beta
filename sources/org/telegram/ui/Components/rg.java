package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class rg extends View {
    public mh0 E;
    public final float[] F;
    public boolean G;
    public long H;
    public final Paint I;
    public long J;
    public final ChatActivityEnterView K;
    public float f39130a;
    public boolean f39131b;
    public boolean f39132c;
    public final mh0 d;
    public boolean f39133e;
    public boolean f39134f;
    public long h;
    public boolean f39135n;
    public long f39136r;
    public float f39137s;
    public float f39138w;
    public float f39139x;
    public float f39140y;

    public rg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.K = chatActivityEnterView;
        this.h = -1L;
        this.F = new float[3];
        this.H = -1L;
        this.I = new Paint(1);
        mh0 mh0Var = new mh0(2131623975, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.d = mh0Var;
        mh0Var.f37499p0 = true;
        h();
    }

    public static void a(rg rgVar) {
        rgVar.f39133e = true;
    }

    public static float b(long j3) {
        return (((float) Math.cos((((float) (j3 % 1300)) / 1300.0f) * 3.141592653589793d * 2.0d)) * 0.5f) + 0.5f;
    }

    public final void c() {
        this.f39132c = true;
        this.J = SystemClock.uptimeMillis();
        mh0 mh0Var = this.d;
        mh0Var.T(true, 0.0f);
        if (this.f39131b) {
            mh0Var.start();
        }
    }

    public final void d() {
        i();
    }

    public final void e() {
        ChatActivityEnterView chatActivityEnterView = this.K;
        chatActivityEnterView.f32624k4.setColor(chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.f29348ag));
        this.f39130a = 1.0f;
        System.currentTimeMillis();
        this.H = -1L;
        this.h = -1L;
        this.f39132c = false;
        this.d.stop();
        this.f39135n = false;
        this.f39140y = 0.0f;
        this.f39139x = 0.0f;
        this.f39138w = 0.0f;
        invalidate();
    }

    public final void f(boolean z10) {
        if (this.G == z10) {
            return;
        }
        this.G = z10;
        if (z10) {
            i();
        }
        invalidate();
    }

    public final float g() {
        float i7 = (1.0f - Utilities.i(this.f39139x / 0.8f, 1.0f, 0.0f)) * this.f39138w;
        return com.google.android.gms.internal.vision.e2.C(i7, 2.0f, 3.0f, 12.0f * i7 * i7);
    }

    public final void h() {
        int i7 = org.telegram.ui.ActionBar.n6.f29348ag;
        int i10 = ChatActivityEnterView.f32538n7;
        ChatActivityEnterView chatActivityEnterView = this.K;
        int C0 = chatActivityEnterView.C0(i7);
        int C02 = chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.Je);
        int C03 = chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.Vf);
        chatActivityEnterView.f32624k4.setColor(C0);
        mh0 mh0Var = this.d;
        mh0Var.f37480a0 = true;
        mh0Var.Q(C03, "Cup Red");
        mh0Var.Q(C03, "Box Red");
        mh0Var.Q(C03, "Cup Grey");
        mh0Var.Q(C03, "Box Grey");
        mh0Var.Q(C03, "Box_Grey 2");
        mh0Var.Q(C03, "Line 1");
        mh0Var.Q(C03, "Line 2");
        mh0Var.Q(C03, "Line 3");
        mh0Var.Q(C02, "Line 1 Dup");
        mh0Var.Q(C02, "Line 2 Dup");
        mh0Var.Q(C02, "Line 3 Dup");
        mh0Var.o();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        mh0Var.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    public final mh0 i() {
        if (this.E == null) {
            mh0 mh0Var = new mh0(2131623977, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
            this.E = mh0Var;
            mh0Var.J(true);
            this.E.f37499p0 = false;
            int i7 = org.telegram.ui.ActionBar.n6.Vf;
            int i10 = ChatActivityEnterView.f32538n7;
            int C0 = this.K.C0(i7);
            mh0 mh0Var2 = this.E;
            mh0Var2.f37480a0 = true;
            mh0Var2.Q(C0, "Cup Grey");
            this.E.Q(C0, "Box_Grey 2");
            this.E.Q(C0, "Box Grey");
            this.E.o();
            this.E.R(this);
            this.E.T(true, 0.0f);
        }
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39131b = true;
        boolean z10 = this.f39132c;
        mh0 mh0Var = this.d;
        if (z10) {
            mh0Var.start();
        }
        mh0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39131b = false;
        mh0 mh0Var = this.d;
        mh0Var.stop();
        mh0Var.R(null);
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
        ChatActivityEnterView chatActivityEnterView = this.K;
        Paint paint = chatActivityEnterView.f32624k4;
        if (this.f39135n) {
            float min = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f39136r)) / 240.0f);
            float f16 = this.f39140y;
            int i7 = ChatActivityEnterView.f32538n7;
            float interpolation = lr.f37210i.getInterpolation(Utilities.i(f16 / 0.6f, 1.0f, 0.0f));
            float[] fArr = this.F;
            fArr[0] = 1.0f - ChatActivityEnterView.E2(0.05f, 0.55f, f16);
            fArr[1] = org.telegram.messenger.g0.T1(1.0f, 0.55f, interpolation);
            fArr[2] = interpolation * 20.0f;
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            mh0 i10 = i();
            float f17 = this.f39139x;
            if (f17 > 0.0f) {
                f15 = (Math.min(1.0f, f17) * 14.0f) + 30.0f;
            } else {
                f15 = this.f39138w * 8.0f;
            }
            i10.T(true, f15 / 52.0f);
            i10.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            canvas.save();
            float f18 = fArr[1];
            canvas.scale(f18, f18, measuredWidth, measuredHeight);
            canvas.rotate(fArr[2], measuredWidth, measuredHeight);
            canvas.rotate(g(), measuredWidth, org.telegram.messenger.g0.L(12.0f) + measuredHeight);
            float min2 = Math.min(1.0f, 1.8f * min);
            float E2 = 1.0f - ChatActivityEnterView.E2(0.25f, 0.85f, min);
            float interpolation2 = lr.f37209g.getInterpolation(min);
            if (E2 > 0.0f) {
                c10 = 0;
                paint.setColor(i0.a.f(min2, chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.f29348ag), chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.Vf)));
                paint.setAlpha((int) (E2 * 255.0f * fArr[0]));
                canvas.drawCircle(measuredWidth, (org.telegram.messenger.g0.L(2.0f) * interpolation2) + measuredHeight, org.telegram.messenger.g0.T1(this.f39137s, org.telegram.messenger.g0.L(1.5f), interpolation2), paint);
            } else {
                c10 = 0;
            }
            float E22 = ChatActivityEnterView.E2(0.05f, 0.6f, min) * fArr[c10];
            if (E22 > 0.0f && i10.u()) {
                float i11 = Utilities.i(min, 1.0f, 0.0f) - 1.0f;
                float T1 = org.telegram.messenger.g0.T1(0.45f, 1.0f, com.google.android.gms.internal.vision.e2.x(i11, 1.1f, i11, (2.1f * i11 * i11 * i11) + 1.0f));
                canvas.save();
                canvas.scale(T1, T1, measuredWidth, measuredHeight + org.telegram.messenger.g0.L(2.0f));
                i10.setAlpha((int) (E22 * 255.0f));
                i10.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            if (min < 1.0f || !i10.u()) {
                invalidate();
            }
        } else if (this.G) {
            mh0 i12 = i();
            i12.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            i12.setAlpha(255);
            i12.draw(canvas);
        } else {
            if (!this.f39134f) {
                long uptimeMillis = SystemClock.uptimeMillis();
                boolean z10 = this.f39133e;
                if (z10 || this.H < 0) {
                    this.H = uptimeMillis;
                }
                if (!z10 && !this.f39132c) {
                    f14 = b(uptimeMillis - this.H);
                } else {
                    f14 = 1.0f;
                }
                this.f39130a = f14;
            }
            if (this.f39132c) {
                f10 = 1.0f;
                f11 = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.J)) / 160.0f);
            } else {
                f10 = 1.0f;
                f11 = 0.0f;
            }
            boolean z11 = this.f39132c;
            mh0 mh0Var = this.d;
            if (z11) {
                mh0Var.setAlpha((int) (f11 * 255.0f));
                mh0Var.draw(canvas);
                if (f11 < f10) {
                    invalidate();
                }
            }
            if (!this.f39132c || f11 < f10 || !mh0Var.u()) {
                boolean z12 = this.f39132c;
                if (z12) {
                    f12 = 1.0f;
                } else {
                    f12 = this.f39130a;
                }
                if (z12 && mh0Var.u()) {
                    f13 = 1.0f - f11;
                } else {
                    f13 = 1.0f;
                }
                if (f13 <= 0.0f) {
                    if (!this.f39134f) {
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
                if (this.f39132c) {
                    paint.setColor(i0.a.f(Math.min(1.0f, f11 * 2.5f), chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.f29348ag), chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.Vf)));
                }
                int color = paint.getColor();
                Paint paint2 = this.I;
                paint2.setColor(color);
                paint2.setAlpha((int) (40.8f * f12 * f13));
                canvas.drawCircle(measuredWidth2, measuredHeight2, org.telegram.messenger.g0.T1(1.35f, 1.75f, f12) * T13, paint2);
                paint.setAlpha((int) (org.telegram.messenger.g0.T1(0.6f, 1.0f, f12) * 255.0f * f13));
                canvas.drawCircle(measuredWidth2, measuredHeight2, T13, paint);
                canvas.restore();
            }
            if (!this.f39134f) {
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
