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
public abstract class rw0 extends View implements org.telegram.messenger.gs {
    public int E;
    public ValueAnimator F;
    public ei.c G;
    public float H;
    public ValueAnimator I;
    public RectF f39357a;
    public qw0[] f39358b;
    public float[] f39359c;
    public float[] d;
    public float[] f39360e;
    public float f39361f;
    public ImageReceiver h;
    public Long f39362n;
    public n6 f39363r;
    public n6 f39364s;
    public CharSequence f39365w;
    public TextPaint f39366x;
    public StaticLayout f39367y;

    public final long a() {
        if (this.f39358b == null) {
            return 0L;
        }
        long j3 = 0;
        for (int i7 = 0; i7 < this.f39358b.length; i7++) {
            long f10 = this.G.f(i7);
            qw0 qw0Var = this.f39358b[i7];
            if (qw0Var != null && (qw0Var.f39008c || f10 > 0)) {
                if (f10 <= 0) {
                    f10 = qw0Var.f39006a;
                }
                j3 += f10;
            }
        }
        return j3;
    }

    public abstract void b();

    public final void c(boolean z10) {
        boolean z11;
        qw0[] qw0VarArr = this.f39358b;
        if (qw0VarArr == null) {
            return;
        }
        long j3 = 0;
        for (int i7 = 0; i7 < qw0VarArr.length; i7++) {
            long f10 = this.G.f(i7);
            qw0 qw0Var = qw0VarArr[i7];
            if (qw0Var != null && (qw0Var.f39008c || f10 > 0)) {
                if (f10 <= 0) {
                    f10 = qw0Var.f39006a;
                }
                j3 += f10;
            }
        }
        this.E = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (int i10 = 0; i10 < qw0VarArr.length; i10++) {
            long f13 = this.G.f(i10);
            qw0 qw0Var2 = qw0VarArr[i10];
            if (qw0Var2 != null && (qw0Var2.f39008c || f13 > 0)) {
                this.E++;
            }
            if (qw0Var2 != null && ((z11 = qw0Var2.f39008c) || f13 > 0)) {
                int i11 = (f13 > 0L ? 1 : (f13 == 0L ? 0 : -1));
                if (i11 <= 0) {
                    f13 = qw0Var2.f39006a;
                }
                float f14 = ((float) f13) / ((float) j3);
                if (f14 < 0.02777f) {
                    f14 = 0.02777f;
                }
                f11 += f14;
                if (f14 > f12 && (z11 || i11 > 0)) {
                    f12 = f14;
                }
                this.d[i10] = f14;
            } else {
                this.d[i10] = 0.0f;
            }
        }
        if (f11 > 1.0f) {
            float f15 = 1.0f / f11;
            for (int i12 = 0; i12 < qw0VarArr.length; i12++) {
                if (qw0VarArr[i12] != null) {
                    float[] fArr = this.d;
                    fArr[i12] = fArr[i12] * f15;
                }
            }
        }
        if (!z10) {
            System.arraycopy(this.d, 0, this.f39359c, 0, qw0VarArr.length);
            return;
        }
        System.arraycopy(this.f39359c, 0, this.f39360e, 0, qw0VarArr.length);
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.F.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new ch.w(16, this, qw0VarArr));
        this.F.addListener(new s60(qw0VarArr, 25));
        this.F.setDuration(450L);
        this.F.setInterpolator(new x1.a());
        this.F.start();
    }

    public final long d() {
        String str;
        long a10 = a();
        String str2 = " ";
        String[] split = org.telegram.messenger.g0.i0(a10, false, false).split(" ");
        if (split.length > 1) {
            n6 n6Var = this.f39363r;
            int i7 = (a10 > 0L ? 1 : (a10 == 0L ? 0 : -1));
            if (i7 == 0) {
                str = " ";
            } else {
                str = split[0];
            }
            n6Var.t(str, true, false);
            n6 n6Var2 = this.f39364s;
            if (i7 != 0) {
                str2 = split[1];
            }
            n6Var2.t(str2, true, false);
        }
        return a10;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.f25342l4) {
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
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25342l4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25342l4);
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
        n6 n6Var = this.f39364s;
        ImageReceiver imageReceiver = this.h;
        n6 n6Var2 = this.f39363r;
        RectF rectF = this.f39357a;
        if (this.f39358b != null) {
            float f14 = 1.0f;
            float f15 = 0.0f;
            if (imageReceiver != null) {
                canvas.save();
                if (isPressed()) {
                    float f16 = this.H;
                    if (f16 != 1.0f) {
                        float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f24047r) / 100.0f) + f16;
                        this.H = min;
                        this.H = Utilities.i(min, 1.0f, 0.0f);
                        invalidate();
                    }
                }
                float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.H, 0.15f, 0.85f);
                canvas.scale(z10, z10, imageReceiver.r(), imageReceiver.s());
            }
            if (this.E > 1) {
                float f17 = this.f39361f;
                if (f17 > 0.0f) {
                    float f18 = (float) (f17 - 0.04d);
                    this.f39361f = f18;
                    if (f18 < 0.0f) {
                        this.f39361f = 0.0f;
                    }
                }
            } else {
                float f19 = this.f39361f;
                if (f19 < 1.0f) {
                    float f20 = (float) (f19 + 0.04d);
                    this.f39361f = f20;
                    if (f20 > 1.0f) {
                        this.f39361f = 1.0f;
                    }
                }
            }
            boolean z11 = false;
            float f21 = 0.0f;
            int i12 = 0;
            while (true) {
                qw0[] qw0VarArr = this.f39358b;
                i7 = 255;
                f10 = 10.0f;
                f11 = f15;
                if (i12 >= qw0VarArr.length) {
                    break;
                }
                qw0 qw0Var = qw0VarArr[i12];
                if (qw0Var != null) {
                    float f22 = this.f39359c[i12];
                    if (f22 != f11) {
                        if (qw0Var.d) {
                            float z12 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f39361f, 10.0f, f22 * (-360.0f));
                            if (z12 > f11) {
                                z12 = f11;
                            }
                            ((Paint) qw0Var.f39009e).setColor(org.telegram.ui.ActionBar.m6.x0(null, qw0Var.f39007b, z11));
                            ((Paint) this.f39358b[i12].f39009e).setAlpha(255);
                            double width = rectF.width() / 2.0f;
                            i11 = i12;
                            if (Math.abs((float) (z12 * ((3.141592653589793d * width) / 180.0d))) <= 1.0f) {
                                double d = (-90.0f) - (360.0f * f21);
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d)) * width)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d)) * width)), (Paint) this.f39358b[i11].f39009e);
                            } else {
                                ((Paint) this.f39358b[i11].f39009e).setStyle(Paint.Style.STROKE);
                                canvas.drawArc(rectF, (-90.0f) - (360.0f * f21), z12, false, (Paint) this.f39358b[i11].f39009e);
                            }
                        } else {
                            i11 = i12;
                        }
                        f21 += f22;
                        i12 = i11 + 1;
                        f15 = f11;
                        z11 = false;
                    }
                }
                i11 = i12;
                i12 = i11 + 1;
                f15 = f11;
                z11 = false;
            }
            float f23 = f11;
            int i13 = 0;
            while (true) {
                qw0[] qw0VarArr2 = this.f39358b;
                if (i13 >= qw0VarArr2.length) {
                    break;
                }
                qw0 qw0Var2 = qw0VarArr2[i13];
                if (qw0Var2 != null) {
                    float f24 = this.f39359c[i13];
                    if (f24 != f11) {
                        if (!qw0Var2.d) {
                            float z13 = com.google.android.gms.internal.vision.e2.z(f14, this.f39361f, f10, f24 * (-360.0f));
                            if (z13 > f11) {
                                z13 = f11;
                            }
                            ((Paint) qw0Var2.f39009e).setColor(org.telegram.ui.ActionBar.m6.x0(null, qw0Var2.f39007b, false));
                            ((Paint) this.f39358b[i13].f39009e).setAlpha(i7);
                            double width2 = rectF.width() / 2.0f;
                            f13 = f14;
                            if (Math.abs((float) (z13 * ((width2 * 3.141592653589793d) / 180.0d))) <= f13) {
                                double d2 = (-90.0f) - (f23 * 360.0f);
                                RectF rectF2 = rectF;
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d2)) * width2)), rectF2.centerY() + ((float) (Math.sin(Math.toRadians(d2)) * width2)), (Paint) this.f39358b[i13].f39009e);
                                rectF = rectF2;
                                f12 = 10.0f;
                                i10 = 255;
                            } else {
                                ((Paint) this.f39358b[i13].f39009e).setStyle(Paint.Style.STROKE);
                                rectF = rectF;
                                f12 = 10.0f;
                                i10 = 255;
                                canvas.drawArc(rectF, (-90.0f) - (f23 * 360.0f), z13, false, (Paint) this.f39358b[i13].f39009e);
                            }
                        } else {
                            i10 = i7;
                            f12 = f10;
                            f13 = f14;
                        }
                        f23 += f24;
                        i13++;
                        f10 = f12;
                        i7 = i10;
                        f14 = f13;
                    }
                }
                i10 = i7;
                f12 = f10;
                f13 = f14;
                i13++;
                f10 = f12;
                i7 = i10;
                f14 = f13;
            }
            if (imageReceiver != null) {
                imageReceiver.h(canvas, null);
                canvas.restore();
            }
            if (n6Var2 != null) {
                int i14 = org.telegram.ui.ActionBar.m6.f29489j5;
                n6Var2.u(org.telegram.ui.ActionBar.m6.x0(null, i14, false));
                n6Var.u(org.telegram.ui.ActionBar.m6.x0(null, i14, false));
                if (this.f39362n != null) {
                    float c10 = n6Var.c() + n6Var2.c() + org.telegram.messenger.g0.L(4.0f);
                    float width3 = (getWidth() - c10) / 2.0f;
                    n6Var2.setBounds(0, org.telegram.messenger.g0.L(115.0f), (int) (n6Var2.c() + width3), org.telegram.messenger.g0.L(145.0f));
                    n6Var.setBounds((int) ((width3 + c10) - n6Var.c()), org.telegram.messenger.g0.L(118.0f), getWidth(), org.telegram.messenger.g0.L(148.0f));
                }
                n6Var2.draw(canvas);
                n6Var.draw(canvas);
            }
            if (this.f39367y != null) {
                canvas.save();
                org.telegram.messenger.o10.k(this.f39367y.getHeight() - org.telegram.messenger.g0.L(13.0f), 2.0f, org.telegram.messenger.g0.L(148.0f), org.telegram.messenger.g0.L(30.0f), canvas);
                this.f39366x.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29489j5, false));
                this.f39367y.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        CharSequence charSequence = this.f39365w;
        ImageReceiver imageReceiver = this.h;
        RectF rectF = this.f39357a;
        n6 n6Var = this.f39364s;
        n6 n6Var2 = this.f39363r;
        Long l10 = this.f39362n;
        if (l10 != null) {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(166.0f), 1073741824));
            i11 = org.telegram.messenger.o10.z(110.0f, View.MeasureSpec.getSize(i7), 2);
            rectF.set(org.telegram.messenger.g0.L(3.0f) + i11, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(107.0f) + i11, org.telegram.messenger.g0.L(107.0f));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(110.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(110.0f), 1073741824));
            rectF.set(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(107.0f), org.telegram.messenger.g0.L(107.0f));
            i11 = 0;
        }
        nr nrVar = nr.h;
        n6Var2.n(0.18f, 300L, nrVar);
        n6Var2.w(org.telegram.messenger.g0.L(24.0f));
        n6Var2.x(org.telegram.messenger.g0.o());
        n6Var.n(0.18f, 300L, nrVar);
        if (l10 != null) {
            n6Var.w(org.telegram.messenger.g0.L(16.0f));
            n6Var2.f37796b = 5;
            n6Var.f37796b = 3;
        } else {
            n6Var.w(org.telegram.messenger.g0.L(13.0f));
            int textSize = (int) n6Var2.f37794a.getTextSize();
            int textSize2 = (int) n6Var.f37794a.getTextSize();
            int L = ((org.telegram.messenger.g0.L(110.0f) - textSize) - textSize2) / 2;
            int i12 = textSize + L;
            n6Var2.setBounds(0, L, getMeasuredWidth(), i12);
            n6Var.setBounds(0, org.telegram.messenger.g0.L(2.0f) + i12, getMeasuredWidth(), org.telegram.messenger.g0.L(2.0f) + i12 + textSize2);
            n6Var2.f37796b = 17;
            n6Var.f37796b = 17;
        }
        if (charSequence != null) {
            if (this.f39366x == null) {
                this.f39366x = new TextPaint(1);
            }
            this.f39366x.setTextSize(org.telegram.messenger.g0.L(13.0f));
            int size = View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(60.0f);
            TextPaint textPaint = this.f39366x;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f39367y = zu0.d(charSequence, textPaint, false, size, 1);
        }
        if (imageReceiver != null) {
            imageReceiver.y0(org.telegram.messenger.g0.L(10.0f) + i11, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f));
            imageReceiver.J0(org.telegram.messenger.g0.L(45.0f));
        }
        d();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        Long l10;
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null && (l10 = this.f39362n) != null && l10.longValue() != Long.MAX_VALUE && motionEvent.getX() > imageReceiver.L0 && motionEvent.getX() <= imageReceiver.y() && motionEvent.getY() > imageReceiver.M0 && motionEvent.getY() <= imageReceiver.A()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (motionEvent.getAction() == 0) {
            if (z10) {
                setPressed(true);
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (z10 && motionEvent.getAction() != 3) {
                org.telegram.messenger.g0.h3(new cp0(this, 11), 80L);
            }
            setPressed(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCacheModel(ei.c cVar) {
        this.G = cVar;
    }

    @Override
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.I) != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
            }
            if (!z10) {
                float f10 = this.H;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.I = ofFloat;
                    ofFloat.addUpdateListener(new h60(this, 25));
                    this.I.addListener(new s60(this, 26));
                    org.telegram.ui.Cells.c0.q(2.0f, this.I);
                    this.I.setDuration(350L);
                    this.I.start();
                }
            }
        }
    }
}
