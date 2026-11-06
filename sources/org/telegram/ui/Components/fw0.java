package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public abstract class fw0 extends View implements org.telegram.messenger.ls {
    public int D;
    public ValueAnimator E;
    public ci.c F;
    public float G;
    public ValueAnimator H;
    public RectF f33651a;
    public ew0[] f33652b;
    public float[] f33653c;
    public float[] d;
    public float[] f33654e;
    public float f33655f;
    public ImageReceiver h;
    public Long f33656n;
    public i6 f33657r;
    public i6 f33658s;
    public CharSequence f33659w;
    public TextPaint f33660x;
    public StaticLayout f33661y;

    public final long a() {
        if (this.f33652b == null) {
            return 0L;
        }
        long j3 = 0;
        for (int i7 = 0; i7 < this.f33652b.length; i7++) {
            long f10 = this.F.f(i7);
            ew0 ew0Var = this.f33652b[i7];
            if (ew0Var != null && (ew0Var.f33360c || f10 > 0)) {
                if (f10 <= 0) {
                    f10 = ew0Var.f33358a;
                }
                j3 += f10;
            }
        }
        return j3;
    }

    public abstract void b();

    public final void c(boolean z9) {
        boolean z10;
        ew0[] ew0VarArr = this.f33652b;
        if (ew0VarArr == null) {
            return;
        }
        long j3 = 0;
        for (int i7 = 0; i7 < ew0VarArr.length; i7++) {
            long f10 = this.F.f(i7);
            ew0 ew0Var = ew0VarArr[i7];
            if (ew0Var != null && (ew0Var.f33360c || f10 > 0)) {
                if (f10 <= 0) {
                    f10 = ew0Var.f33358a;
                }
                j3 += f10;
            }
        }
        this.D = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (int i10 = 0; i10 < ew0VarArr.length; i10++) {
            long f13 = this.F.f(i10);
            ew0 ew0Var2 = ew0VarArr[i10];
            if (ew0Var2 != null && (ew0Var2.f33360c || f13 > 0)) {
                this.D++;
            }
            if (ew0Var2 != null && ((z10 = ew0Var2.f33360c) || f13 > 0)) {
                int i11 = (f13 > 0L ? 1 : (f13 == 0L ? 0 : -1));
                if (i11 <= 0) {
                    f13 = ew0Var2.f33358a;
                }
                float f14 = ((float) f13) / ((float) j3);
                if (f14 < 0.02777f) {
                    f14 = 0.02777f;
                }
                f11 += f14;
                if (f14 > f12 && (z10 || i11 > 0)) {
                    f12 = f14;
                }
                this.d[i10] = f14;
            } else {
                this.d[i10] = 0.0f;
            }
        }
        if (f11 > 1.0f) {
            float f15 = 1.0f / f11;
            for (int i12 = 0; i12 < ew0VarArr.length; i12++) {
                if (ew0VarArr[i12] != null) {
                    float[] fArr = this.d;
                    fArr[i12] = fArr[i12] * f15;
                }
            }
        }
        if (!z9) {
            System.arraycopy(this.d, 0, this.f33653c, 0, ew0VarArr.length);
            return;
        }
        System.arraycopy(this.f33653c, 0, this.f33654e, 0, ew0VarArr.length);
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.E.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new bi.de(17, this, ew0VarArr));
        this.E.addListener(new e60(ew0VarArr, 25));
        this.E.setDuration(450L);
        this.E.setInterpolator(new x1.a());
        this.E.start();
    }

    public final long d() {
        String str;
        long a10 = a();
        String str2 = " ";
        String[] split = org.telegram.messenger.g0.i0(a10, false, false).split(" ");
        if (split.length > 1) {
            i6 i6Var = this.f33657r;
            int i7 = (a10 > 0L ? 1 : (a10 == 0L ? 0 : -1));
            if (i7 == 0) {
                str = " ";
            } else {
                str = split[0];
            }
            i6Var.t(str, true, false);
            i6 i6Var2 = this.f33658s;
            if (i7 != 0) {
                str2 = split[1];
            }
            i6Var2.t(str2, true, false);
        }
        return a10;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25009i4) {
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25009i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25009i4);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        int i11;
        i6 i6Var = this.f33658s;
        ImageReceiver imageReceiver = this.h;
        i6 i6Var2 = this.f33657r;
        RectF rectF = this.f33651a;
        if (this.f33652b != null) {
            float f14 = 1.0f;
            float f15 = 0.0f;
            if (imageReceiver != null) {
                canvas.save();
                if (isPressed()) {
                    float f16 = this.G;
                    if (f16 != 1.0f) {
                        float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f22545r) / 100.0f) + f16;
                        this.G = min;
                        this.G = Utilities.i(min, 1.0f, 0.0f);
                        invalidate();
                    }
                }
                float z9 = com.google.android.recaptcha.internal.a.z(1.0f, this.G, 0.15f, 0.85f);
                canvas.scale(z9, z9, imageReceiver.r(), imageReceiver.s());
            }
            if (this.D > 1) {
                float f17 = this.f33655f;
                if (f17 > 0.0f) {
                    float f18 = (float) (f17 - 0.04d);
                    this.f33655f = f18;
                    if (f18 < 0.0f) {
                        this.f33655f = 0.0f;
                    }
                }
            } else {
                float f19 = this.f33655f;
                if (f19 < 1.0f) {
                    float f20 = (float) (f19 + 0.04d);
                    this.f33655f = f20;
                    if (f20 > 1.0f) {
                        this.f33655f = 1.0f;
                    }
                }
            }
            boolean z10 = false;
            float f21 = 0.0f;
            int i12 = 0;
            while (true) {
                ew0[] ew0VarArr = this.f33652b;
                i7 = 255;
                f10 = 10.0f;
                f11 = f15;
                if (i12 >= ew0VarArr.length) {
                    break;
                }
                ew0 ew0Var = ew0VarArr[i12];
                if (ew0Var != null) {
                    float f22 = this.f33653c[i12];
                    if (f22 != f11) {
                        if (ew0Var.d) {
                            float z11 = com.google.android.recaptcha.internal.a.z(f14, this.f33655f, 10.0f, f22 * (-360.0f));
                            if (z11 > f11) {
                                z11 = f11;
                            }
                            ((Paint) ew0Var.f33361e).setColor(org.telegram.ui.ActionBar.k6.x0(null, ew0Var.f33359b, z10));
                            ((Paint) this.f33652b[i12].f33361e).setAlpha(255);
                            double width = rectF.width() / 2.0f;
                            i11 = i12;
                            if (Math.abs((float) (((3.141592653589793d * width) / 180.0d) * z11)) <= f14) {
                                double d = (-90.0f) - (360.0f * f21);
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d)) * width)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d)) * width)), (Paint) this.f33652b[i11].f33361e);
                            } else {
                                ((Paint) this.f33652b[i11].f33361e).setStyle(Paint.Style.STROKE);
                                canvas.drawArc(rectF, (-90.0f) - (360.0f * f21), z11, false, (Paint) this.f33652b[i11].f33361e);
                            }
                        } else {
                            i11 = i12;
                        }
                        f21 += f22;
                        i12 = i11 + 1;
                        f15 = f11;
                        f14 = 1.0f;
                        z10 = false;
                    }
                }
                i11 = i12;
                i12 = i11 + 1;
                f15 = f11;
                f14 = 1.0f;
                z10 = false;
            }
            float f23 = f11;
            int i13 = 0;
            while (true) {
                ew0[] ew0VarArr2 = this.f33652b;
                if (i13 >= ew0VarArr2.length) {
                    break;
                }
                ew0 ew0Var2 = ew0VarArr2[i13];
                if (ew0Var2 != null) {
                    float f24 = this.f33653c[i13];
                    if (f24 != f11) {
                        if (!ew0Var2.d) {
                            float z12 = com.google.android.recaptcha.internal.a.z(1.0f, this.f33655f, f10, f24 * (-360.0f));
                            if (z12 > f11) {
                                z12 = f11;
                            }
                            ((Paint) ew0Var2.f33361e).setColor(org.telegram.ui.ActionBar.k6.x0(null, ew0Var2.f33359b, false));
                            ((Paint) this.f33652b[i13].f33361e).setAlpha(i7);
                            double width2 = rectF.width() / 2.0f;
                            f13 = f24;
                            if (Math.abs((float) (z12 * ((width2 * 3.141592653589793d) / 180.0d))) <= 1.0f) {
                                double d2 = (-90.0f) - (f23 * 360.0f);
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d2)) * width2)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d2)) * width2)), (Paint) this.f33652b[i13].f33361e);
                                f12 = 10.0f;
                                i10 = 255;
                            } else {
                                ((Paint) this.f33652b[i13].f33361e).setStyle(Paint.Style.STROKE);
                                f12 = 10.0f;
                                i10 = 255;
                                canvas.drawArc(rectF, (-90.0f) - (f23 * 360.0f), z12, false, (Paint) this.f33652b[i13].f33361e);
                            }
                        } else {
                            i10 = i7;
                            f12 = f10;
                            f13 = f24;
                        }
                        f23 += f13;
                        i13++;
                        f10 = f12;
                        i7 = i10;
                    }
                }
                i10 = i7;
                f12 = f10;
                i13++;
                f10 = f12;
                i7 = i10;
            }
            if (imageReceiver != null) {
                imageReceiver.h(canvas, null);
                canvas.restore();
            }
            if (i6Var2 != null) {
                int i14 = org.telegram.ui.ActionBar.k6.f27957j5;
                i6Var2.u(org.telegram.ui.ActionBar.k6.x0(null, i14, false));
                i6Var.u(org.telegram.ui.ActionBar.k6.x0(null, i14, false));
                if (this.f33656n != null) {
                    float c10 = i6Var.c() + i6Var2.c() + org.telegram.messenger.g0.L(4.0f);
                    float width3 = (getWidth() - c10) / 2.0f;
                    i6Var2.setBounds(0, org.telegram.messenger.g0.L(115.0f), (int) (i6Var2.c() + width3), org.telegram.messenger.g0.L(145.0f));
                    i6Var.setBounds((int) ((width3 + c10) - i6Var.c()), org.telegram.messenger.g0.L(118.0f), getWidth(), org.telegram.messenger.g0.L(148.0f));
                }
                i6Var2.draw(canvas);
                i6Var.draw(canvas);
            }
            if (this.f33661y != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(148.0f) - ((this.f33661y.getHeight() - org.telegram.messenger.g0.L(13.0f)) / 2.0f));
                this.f33660x.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27957j5, false));
                this.f33661y.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        CharSequence charSequence = this.f33659w;
        ImageReceiver imageReceiver = this.h;
        RectF rectF = this.f33651a;
        i6 i6Var = this.f33658s;
        i6 i6Var2 = this.f33657r;
        Long l10 = this.f33656n;
        if (l10 != null) {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(166.0f), 1073741824));
            i11 = org.telegram.messenger.camera.q.y(110.0f, View.MeasureSpec.getSize(i7), 2);
            rectF.set(org.telegram.messenger.g0.L(3.0f) + i11, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(107.0f) + i11, org.telegram.messenger.g0.L(107.0f));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(110.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(110.0f), 1073741824));
            rectF.set(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(107.0f), org.telegram.messenger.g0.L(107.0f));
            i11 = 0;
        }
        xq xqVar = xq.h;
        i6Var2.n(0.18f, 300L, xqVar);
        i6Var2.w(org.telegram.messenger.g0.L(24.0f));
        i6Var2.x(org.telegram.messenger.g0.o());
        i6Var.n(0.18f, 300L, xqVar);
        if (l10 != null) {
            i6Var.w(org.telegram.messenger.g0.L(16.0f));
            i6Var2.f34508b = 5;
            i6Var.f34508b = 3;
        } else {
            i6Var.w(org.telegram.messenger.g0.L(13.0f));
            int textSize = (int) i6Var2.f34506a.getTextSize();
            int textSize2 = (int) i6Var.f34506a.getTextSize();
            int L = ((org.telegram.messenger.g0.L(110.0f) - textSize) - textSize2) / 2;
            int i12 = textSize + L;
            i6Var2.setBounds(0, L, getMeasuredWidth(), i12);
            i6Var.setBounds(0, org.telegram.messenger.g0.L(2.0f) + i12, getMeasuredWidth(), org.telegram.messenger.g0.L(2.0f) + i12 + textSize2);
            i6Var2.f34508b = 17;
            i6Var.f34508b = 17;
        }
        if (charSequence != null) {
            if (this.f33660x == null) {
                this.f33660x = new TextPaint(1);
            }
            this.f33660x.setTextSize(org.telegram.messenger.g0.L(13.0f));
            int size = View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(60.0f);
            TextPaint textPaint = this.f33660x;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f33661y = mu0.d(charSequence, textPaint, false, size, 1);
        }
        if (imageReceiver != null) {
            imageReceiver.y0(org.telegram.messenger.g0.L(10.0f) + i11, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f));
            imageReceiver.J0(org.telegram.messenger.g0.L(45.0f));
        }
        d();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        Long l10;
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null && (l10 = this.f33656n) != null && l10.longValue() != Long.MAX_VALUE && motionEvent.getX() > imageReceiver.K0 && motionEvent.getX() <= imageReceiver.y() && motionEvent.getY() > imageReceiver.L0 && motionEvent.getY() <= imageReceiver.A()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (motionEvent.getAction() == 0) {
            if (z9) {
                setPressed(true);
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (z9 && motionEvent.getAction() != 3) {
                org.telegram.messenger.g0.i3(new ir0(this, 8), 80L);
            }
            setPressed(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCacheModel(ci.c cVar) {
        this.F = cVar;
    }

    @Override
    public void setPressed(boolean z9) {
        ValueAnimator valueAnimator;
        if (isPressed() != z9) {
            super.setPressed(z9);
            invalidate();
            if (z9 && (valueAnimator = this.H) != null) {
                valueAnimator.removeAllListeners();
                this.H.cancel();
            }
            if (!z9) {
                float f10 = this.G;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.H = ofFloat;
                    ofFloat.addUpdateListener(new c60(this, 23));
                    this.H.addListener(new e60(this, 26));
                    org.telegram.messenger.camera.q.i(2.0f, this.H);
                    this.H.setDuration(350L);
                    this.H.start();
                }
            }
        }
    }
}
