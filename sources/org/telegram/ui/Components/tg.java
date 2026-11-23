package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class tg extends View {
    public oh0 E;
    public final float[] F;
    public boolean G;
    public long H;
    public final Paint I;
    public long J;
    public final ChatActivityEnterView K;
    public float f39897a;
    public boolean f39898b;
    public boolean f39899c;
    public final oh0 d;
    public boolean f39900e;
    public boolean f39901f;
    public long h;
    public boolean f39902n;
    public long f39903r;
    public float f39904s;
    public float f39905w;
    public float f39906x;
    public float f39907y;

    public tg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.K = chatActivityEnterView;
        this.h = -1L;
        this.F = new float[3];
        this.H = -1L;
        this.I = new Paint(1);
        oh0 oh0Var = new oh0(2131623975, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.d = oh0Var;
        oh0Var.f38224p0 = true;
        h();
    }

    public static void a(tg tgVar) {
        tgVar.f39900e = true;
    }

    public static float b(long j3) {
        return (((float) Math.cos((((float) (j3 % 1300)) / 1300.0f) * 3.141592653589793d * 2.0d)) * 0.5f) + 0.5f;
    }

    public final void c() {
        this.f39899c = true;
        this.J = SystemClock.uptimeMillis();
        oh0 oh0Var = this.d;
        oh0Var.T(true, 0.0f);
        if (this.f39898b) {
            oh0Var.start();
        }
    }

    public final void d() {
        i();
    }

    public final void e() {
        ChatActivityEnterView chatActivityEnterView = this.K;
        chatActivityEnterView.f32669m4.setColor(chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.f29333ag));
        this.f39897a = 1.0f;
        System.currentTimeMillis();
        this.H = -1L;
        this.h = -1L;
        this.f39899c = false;
        this.d.stop();
        this.f39902n = false;
        this.f39907y = 0.0f;
        this.f39906x = 0.0f;
        this.f39905w = 0.0f;
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
        float i7 = (1.0f - Utilities.i(this.f39906x / 0.8f, 1.0f, 0.0f)) * this.f39905w;
        return com.google.android.gms.internal.vision.e2.C(i7, 2.0f, 3.0f, 12.0f * i7 * i7);
    }

    public final void h() {
        int i7 = org.telegram.ui.ActionBar.m6.f29333ag;
        int i10 = ChatActivityEnterView.f32569s7;
        ChatActivityEnterView chatActivityEnterView = this.K;
        int G0 = chatActivityEnterView.G0(i7);
        int G02 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.Je);
        int G03 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.Vf);
        chatActivityEnterView.f32669m4.setColor(G0);
        oh0 oh0Var = this.d;
        oh0Var.f38205a0 = true;
        oh0Var.Q(G03, "Cup Red");
        oh0Var.Q(G03, "Box Red");
        oh0Var.Q(G03, "Cup Grey");
        oh0Var.Q(G03, "Box Grey");
        oh0Var.Q(G03, "Box_Grey 2");
        oh0Var.Q(G03, "Line 1");
        oh0Var.Q(G03, "Line 2");
        oh0Var.Q(G03, "Line 3");
        oh0Var.Q(G02, "Line 1 Dup");
        oh0Var.Q(G02, "Line 2 Dup");
        oh0Var.Q(G02, "Line 3 Dup");
        oh0Var.o();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        oh0Var.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    public final oh0 i() {
        if (this.E == null) {
            oh0 oh0Var = new oh0(2131623977, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
            this.E = oh0Var;
            oh0Var.J(true);
            this.E.f38224p0 = false;
            int i7 = org.telegram.ui.ActionBar.m6.Vf;
            int i10 = ChatActivityEnterView.f32569s7;
            int G0 = this.K.G0(i7);
            oh0 oh0Var2 = this.E;
            oh0Var2.f38205a0 = true;
            oh0Var2.Q(G0, "Cup Grey");
            this.E.Q(G0, "Box_Grey 2");
            this.E.Q(G0, "Box Grey");
            this.E.o();
            this.E.R(this);
            this.E.T(true, 0.0f);
        }
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39898b = true;
        boolean z10 = this.f39899c;
        oh0 oh0Var = this.d;
        if (z10) {
            oh0Var.start();
        }
        oh0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39898b = false;
        oh0 oh0Var = this.d;
        oh0Var.stop();
        oh0Var.R(null);
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
        Paint paint = chatActivityEnterView.f32669m4;
        if (this.f39902n) {
            float min = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f39903r)) / 240.0f);
            float f16 = this.f39907y;
            int i7 = ChatActivityEnterView.f32569s7;
            float interpolation = nr.f37963i.getInterpolation(Utilities.i(f16 / 0.6f, 1.0f, 0.0f));
            float[] fArr = this.F;
            fArr[0] = 1.0f - ChatActivityEnterView.H2(0.05f, 0.55f, f16);
            fArr[1] = org.telegram.messenger.g0.T1(1.0f, 0.55f, interpolation);
            fArr[2] = interpolation * 20.0f;
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            oh0 i10 = i();
            float f17 = this.f39906x;
            if (f17 > 0.0f) {
                f15 = (Math.min(1.0f, f17) * 14.0f) + 30.0f;
            } else {
                f15 = this.f39905w * 8.0f;
            }
            i10.T(true, f15 / 52.0f);
            i10.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            canvas.save();
            float f18 = fArr[1];
            canvas.scale(f18, f18, measuredWidth, measuredHeight);
            canvas.rotate(fArr[2], measuredWidth, measuredHeight);
            canvas.rotate(g(), measuredWidth, org.telegram.messenger.g0.L(12.0f) + measuredHeight);
            float min2 = Math.min(1.0f, 1.8f * min);
            float H2 = 1.0f - ChatActivityEnterView.H2(0.25f, 0.85f, min);
            float interpolation2 = nr.f37962g.getInterpolation(min);
            if (H2 > 0.0f) {
                c10 = 0;
                paint.setColor(i0.a.f(min2, chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.f29333ag), chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.Vf)));
                paint.setAlpha((int) (H2 * 255.0f * fArr[0]));
                canvas.drawCircle(measuredWidth, (org.telegram.messenger.g0.L(2.0f) * interpolation2) + measuredHeight, org.telegram.messenger.g0.T1(this.f39904s, org.telegram.messenger.g0.L(1.5f), interpolation2), paint);
            } else {
                c10 = 0;
            }
            float H22 = ChatActivityEnterView.H2(0.05f, 0.6f, min) * fArr[c10];
            if (H22 > 0.0f && i10.u()) {
                float i11 = Utilities.i(min, 1.0f, 0.0f) - 1.0f;
                float T1 = org.telegram.messenger.g0.T1(0.45f, 1.0f, com.google.android.gms.internal.vision.e2.x(i11, 1.1f, i11, (2.1f * i11 * i11 * i11) + 1.0f));
                canvas.save();
                canvas.scale(T1, T1, measuredWidth, measuredHeight + org.telegram.messenger.g0.L(2.0f));
                i10.setAlpha((int) (H22 * 255.0f));
                i10.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            if (min < 1.0f || !i10.u()) {
                invalidate();
            }
        } else if (this.G) {
            oh0 i12 = i();
            i12.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            i12.setAlpha(255);
            i12.draw(canvas);
        } else {
            if (!this.f39901f) {
                long uptimeMillis = SystemClock.uptimeMillis();
                boolean z10 = this.f39900e;
                if (z10 || this.H < 0) {
                    this.H = uptimeMillis;
                }
                if (!z10 && !this.f39899c) {
                    f14 = b(uptimeMillis - this.H);
                } else {
                    f14 = 1.0f;
                }
                this.f39897a = f14;
            }
            if (this.f39899c) {
                f10 = 1.0f;
                f11 = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.J)) / 160.0f);
            } else {
                f10 = 1.0f;
                f11 = 0.0f;
            }
            boolean z11 = this.f39899c;
            oh0 oh0Var = this.d;
            if (z11) {
                oh0Var.setAlpha((int) (f11 * 255.0f));
                oh0Var.draw(canvas);
                if (f11 < f10) {
                    invalidate();
                }
            }
            if (!this.f39899c || f11 < f10 || !oh0Var.u()) {
                boolean z12 = this.f39899c;
                if (z12) {
                    f12 = 1.0f;
                } else {
                    f12 = this.f39897a;
                }
                if (z12 && oh0Var.u()) {
                    f13 = 1.0f - f11;
                } else {
                    f13 = 1.0f;
                }
                if (f13 <= 0.0f) {
                    if (!this.f39901f) {
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
                if (this.f39899c) {
                    paint.setColor(i0.a.f(Math.min(1.0f, f11 * 2.5f), chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.f29333ag), chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.Vf)));
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
            if (!this.f39901f) {
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
