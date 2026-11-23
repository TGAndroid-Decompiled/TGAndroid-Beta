package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class sg extends View {
    public nh0 E;
    public final float[] F;
    public boolean G;
    public long H;
    public final Paint I;
    public long J;
    public final ChatActivityEnterView K;
    public float f39604a;
    public boolean f39605b;
    public boolean f39606c;
    public final nh0 d;
    public boolean f39607e;
    public boolean f39608f;
    public long h;
    public boolean f39609n;
    public long f39610r;
    public float f39611s;
    public float f39612w;
    public float f39613x;
    public float f39614y;

    public sg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.K = chatActivityEnterView;
        this.h = -1L;
        this.F = new float[3];
        this.H = -1L;
        this.I = new Paint(1);
        nh0 nh0Var = new nh0(2131623975, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.d = nh0Var;
        nh0Var.f37818p0 = true;
        h();
    }

    public static void a(sg sgVar) {
        sgVar.f39607e = true;
    }

    public static float b(long j3) {
        return (((float) Math.cos((((float) (j3 % 1300)) / 1300.0f) * 3.141592653589793d * 2.0d)) * 0.5f) + 0.5f;
    }

    public final void c() {
        this.f39606c = true;
        this.J = SystemClock.uptimeMillis();
        nh0 nh0Var = this.d;
        nh0Var.T(true, 0.0f);
        if (this.f39605b) {
            nh0Var.start();
        }
    }

    public final void d() {
        i();
    }

    public final void e() {
        ChatActivityEnterView chatActivityEnterView = this.K;
        chatActivityEnterView.f32733m4.setColor(chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.f29403ag));
        this.f39604a = 1.0f;
        System.currentTimeMillis();
        this.H = -1L;
        this.h = -1L;
        this.f39606c = false;
        this.d.stop();
        this.f39609n = false;
        this.f39614y = 0.0f;
        this.f39613x = 0.0f;
        this.f39612w = 0.0f;
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
        float i7 = (1.0f - Utilities.i(this.f39613x / 0.8f, 1.0f, 0.0f)) * this.f39612w;
        return com.google.android.gms.internal.vision.e2.C(i7, 2.0f, 3.0f, 12.0f * i7 * i7);
    }

    public final void h() {
        int i7 = org.telegram.ui.ActionBar.n6.f29403ag;
        int i10 = ChatActivityEnterView.f32633s7;
        ChatActivityEnterView chatActivityEnterView = this.K;
        int G0 = chatActivityEnterView.G0(i7);
        int G02 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.Je);
        int G03 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.Vf);
        chatActivityEnterView.f32733m4.setColor(G0);
        nh0 nh0Var = this.d;
        nh0Var.f37799a0 = true;
        nh0Var.Q(G03, "Cup Red");
        nh0Var.Q(G03, "Box Red");
        nh0Var.Q(G03, "Cup Grey");
        nh0Var.Q(G03, "Box Grey");
        nh0Var.Q(G03, "Box_Grey 2");
        nh0Var.Q(G03, "Line 1");
        nh0Var.Q(G03, "Line 2");
        nh0Var.Q(G03, "Line 3");
        nh0Var.Q(G02, "Line 1 Dup");
        nh0Var.Q(G02, "Line 2 Dup");
        nh0Var.Q(G02, "Line 3 Dup");
        nh0Var.o();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        nh0Var.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    public final nh0 i() {
        if (this.E == null) {
            nh0 nh0Var = new nh0(2131623977, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
            this.E = nh0Var;
            nh0Var.J(true);
            this.E.f37818p0 = false;
            int i7 = org.telegram.ui.ActionBar.n6.Vf;
            int i10 = ChatActivityEnterView.f32633s7;
            int G0 = this.K.G0(i7);
            nh0 nh0Var2 = this.E;
            nh0Var2.f37799a0 = true;
            nh0Var2.Q(G0, "Cup Grey");
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
        this.f39605b = true;
        boolean z10 = this.f39606c;
        nh0 nh0Var = this.d;
        if (z10) {
            nh0Var.start();
        }
        nh0Var.R(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39605b = false;
        nh0 nh0Var = this.d;
        nh0Var.stop();
        nh0Var.R(null);
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
        Paint paint = chatActivityEnterView.f32733m4;
        if (this.f39609n) {
            float min = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f39610r)) / 240.0f);
            float f16 = this.f39614y;
            int i7 = ChatActivityEnterView.f32633s7;
            float interpolation = kr.f36860i.getInterpolation(Utilities.i(f16 / 0.6f, 1.0f, 0.0f));
            float[] fArr = this.F;
            fArr[0] = 1.0f - ChatActivityEnterView.K2(0.05f, 0.55f, f16);
            fArr[1] = org.telegram.messenger.g0.T1(1.0f, 0.55f, interpolation);
            fArr[2] = interpolation * 20.0f;
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            nh0 i10 = i();
            float f17 = this.f39613x;
            if (f17 > 0.0f) {
                f15 = (Math.min(1.0f, f17) * 14.0f) + 30.0f;
            } else {
                f15 = this.f39612w * 8.0f;
            }
            i10.T(true, f15 / 52.0f);
            i10.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            canvas.save();
            float f18 = fArr[1];
            canvas.scale(f18, f18, measuredWidth, measuredHeight);
            canvas.rotate(fArr[2], measuredWidth, measuredHeight);
            canvas.rotate(g(), measuredWidth, org.telegram.messenger.g0.L(12.0f) + measuredHeight);
            float min2 = Math.min(1.0f, 1.8f * min);
            float K2 = 1.0f - ChatActivityEnterView.K2(0.25f, 0.85f, min);
            float interpolation2 = kr.f36859g.getInterpolation(min);
            if (K2 > 0.0f) {
                c10 = 0;
                paint.setColor(i0.a.f(min2, chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.f29403ag), chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.Vf)));
                paint.setAlpha((int) (K2 * 255.0f * fArr[0]));
                canvas.drawCircle(measuredWidth, (org.telegram.messenger.g0.L(2.0f) * interpolation2) + measuredHeight, org.telegram.messenger.g0.T1(this.f39611s, org.telegram.messenger.g0.L(1.5f), interpolation2), paint);
            } else {
                c10 = 0;
            }
            float K22 = ChatActivityEnterView.K2(0.05f, 0.6f, min) * fArr[c10];
            if (K22 > 0.0f && i10.u()) {
                float i11 = Utilities.i(min, 1.0f, 0.0f) - 1.0f;
                float T1 = org.telegram.messenger.g0.T1(0.45f, 1.0f, com.google.android.gms.internal.vision.e2.x(i11, 1.1f, i11, (2.1f * i11 * i11 * i11) + 1.0f));
                canvas.save();
                canvas.scale(T1, T1, measuredWidth, measuredHeight + org.telegram.messenger.g0.L(2.0f));
                i10.setAlpha((int) (K22 * 255.0f));
                i10.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            if (min < 1.0f || !i10.u()) {
                invalidate();
            }
        } else if (this.G) {
            nh0 i12 = i();
            i12.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            i12.setAlpha(255);
            i12.draw(canvas);
        } else {
            if (!this.f39608f) {
                long uptimeMillis = SystemClock.uptimeMillis();
                boolean z10 = this.f39607e;
                if (z10 || this.H < 0) {
                    this.H = uptimeMillis;
                }
                if (!z10 && !this.f39606c) {
                    f14 = b(uptimeMillis - this.H);
                } else {
                    f14 = 1.0f;
                }
                this.f39604a = f14;
            }
            if (this.f39606c) {
                f10 = 1.0f;
                f11 = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.J)) / 160.0f);
            } else {
                f10 = 1.0f;
                f11 = 0.0f;
            }
            boolean z11 = this.f39606c;
            nh0 nh0Var = this.d;
            if (z11) {
                nh0Var.setAlpha((int) (f11 * 255.0f));
                nh0Var.draw(canvas);
                if (f11 < f10) {
                    invalidate();
                }
            }
            if (!this.f39606c || f11 < f10 || !nh0Var.u()) {
                boolean z12 = this.f39606c;
                if (z12) {
                    f12 = 1.0f;
                } else {
                    f12 = this.f39604a;
                }
                if (z12 && nh0Var.u()) {
                    f13 = 1.0f - f11;
                } else {
                    f13 = 1.0f;
                }
                if (f13 <= 0.0f) {
                    if (!this.f39608f) {
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
                if (this.f39606c) {
                    paint.setColor(i0.a.f(Math.min(1.0f, f11 * 2.5f), chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.f29403ag), chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.Vf)));
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
            if (!this.f39608f) {
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
