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
public abstract class jx0 extends View implements org.telegram.messenger.us {
    public int D;
    public ValueAnimator E;
    public sh.b F;
    public float G;
    public ValueAnimator H;
    public RectF f27510a;
    public ix0[] f27511b;
    public float[] f27512c;
    public float[] d;
    public float[] e;
    public float f27513f;
    public ImageReceiver h;
    public Long f27514n;
    public e6 f27515r;
    public e6 f27516s;
    public CharSequence f27517w;
    public TextPaint f27518x;
    public StaticLayout f27519y;

    public final long a() {
        if (this.f27511b == null) {
            return 0L;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < this.f27511b.length; i10++) {
            long f7 = this.F.f(i10);
            ix0 ix0Var = this.f27511b[i10];
            if (ix0Var != null && (ix0Var.f27121c || f7 > 0)) {
                if (f7 <= 0) {
                    f7 = ix0Var.f27119a;
                }
                j10 += f7;
            }
        }
        return j10;
    }

    public abstract void b();

    public final void c(boolean z10) {
        boolean z11;
        ix0[] ix0VarArr = this.f27511b;
        if (ix0VarArr == null) {
            return;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < ix0VarArr.length; i10++) {
            long f7 = this.F.f(i10);
            ix0 ix0Var = ix0VarArr[i10];
            if (ix0Var != null && (ix0Var.f27121c || f7 > 0)) {
                if (f7 <= 0) {
                    f7 = ix0Var.f27119a;
                }
                j10 += f7;
            }
        }
        this.D = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < ix0VarArr.length; i11++) {
            long f12 = this.F.f(i11);
            ix0 ix0Var2 = ix0VarArr[i11];
            if (ix0Var2 != null && (ix0Var2.f27121c || f12 > 0)) {
                this.D++;
            }
            if (ix0Var2 != null && ((z11 = ix0Var2.f27121c) || f12 > 0)) {
                int i12 = (f12 > 0L ? 1 : (f12 == 0L ? 0 : -1));
                if (i12 <= 0) {
                    f12 = ix0Var2.f27119a;
                }
                float f13 = ((float) f12) / ((float) j10);
                if (f13 < 0.02777f) {
                    f13 = 0.02777f;
                }
                f10 += f13;
                if (f13 > f11 && (z11 || i12 > 0)) {
                    f11 = f13;
                }
                this.d[i11] = f13;
            } else {
                this.d[i11] = 0.0f;
            }
        }
        if (f10 > 1.0f) {
            float f14 = 1.0f / f10;
            for (int i13 = 0; i13 < ix0VarArr.length; i13++) {
                if (ix0VarArr[i13] != null) {
                    float[] fArr = this.d;
                    fArr[i13] = fArr[i13] * f14;
                }
            }
        }
        if (!z10) {
            System.arraycopy(this.d, 0, this.f27512c, 0, ix0VarArr.length);
            return;
        }
        System.arraycopy(this.f27512c, 0, this.e, 0, ix0VarArr.length);
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.E.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new ag.p2(16, this, ix0VarArr));
        this.E.addListener(new t60(ix0VarArr, 25));
        this.E.setDuration(450L);
        this.E.setInterpolator(new u1.a());
        this.E.start();
    }

    public final long d() {
        String str;
        long a2 = a();
        String str2 = " ";
        String[] split = org.telegram.messenger.i0.i0(a2, false, false).split(" ");
        if (split.length > 1) {
            e6 e6Var = this.f27515r;
            int i10 = (a2 > 0L ? 1 : (a2 == 0L ? 0 : -1));
            if (i10 == 0) {
                str = " ";
            } else {
                str = split[0];
            }
            e6Var.t(str, true, false);
            e6 e6Var2 = this.f27516s;
            if (i10 != 0) {
                str2 = split[1];
            }
            e6Var2.t(str2, true, false);
        }
        return a2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19630i4) {
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
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19630i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19630i4);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        float f10;
        int i11;
        float f11;
        float f12;
        int i12;
        e6 e6Var = this.f27516s;
        ImageReceiver imageReceiver = this.h;
        e6 e6Var2 = this.f27515r;
        RectF rectF = this.f27510a;
        if (this.f27511b != null) {
            float f13 = 1.0f;
            float f14 = 0.0f;
            if (imageReceiver != null) {
                canvas.save();
                if (isPressed()) {
                    float f15 = this.G;
                    if (f15 != 1.0f) {
                        float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.i0.f16027r) / 100.0f) + f15;
                        this.G = min;
                        this.G = Utilities.i(min, 1.0f, 0.0f);
                        invalidate();
                    }
                }
                float z10 = c3.i0.z(1.0f, this.G, 0.15f, 0.85f);
                canvas.scale(z10, z10, imageReceiver.r(), imageReceiver.s());
            }
            if (this.D > 1) {
                float f16 = this.f27513f;
                if (f16 > 0.0f) {
                    float f17 = (float) (f16 - 0.04d);
                    this.f27513f = f17;
                    if (f17 < 0.0f) {
                        this.f27513f = 0.0f;
                    }
                }
            } else {
                float f18 = this.f27513f;
                if (f18 < 1.0f) {
                    float f19 = (float) (f18 + 0.04d);
                    this.f27513f = f19;
                    if (f19 > 1.0f) {
                        this.f27513f = 1.0f;
                    }
                }
            }
            boolean z11 = false;
            float f20 = 0.0f;
            int i13 = 0;
            while (true) {
                ix0[] ix0VarArr = this.f27511b;
                i10 = 255;
                f7 = 10.0f;
                f10 = f14;
                if (i13 >= ix0VarArr.length) {
                    break;
                }
                ix0 ix0Var = ix0VarArr[i13];
                if (ix0Var != null) {
                    float f21 = this.f27512c[i13];
                    if (f21 != f10) {
                        if (ix0Var.d) {
                            float z12 = c3.i0.z(f13, this.f27513f, 10.0f, f21 * (-360.0f));
                            if (z12 > f10) {
                                z12 = f10;
                            }
                            ((Paint) ix0Var.e).setColor(org.telegram.ui.ActionBar.t6.x0(null, ix0Var.f27120b, z11));
                            ((Paint) this.f27511b[i13].e).setAlpha(255);
                            double width = rectF.width() / 2.0f;
                            i12 = i13;
                            if (Math.abs((float) (((3.141592653589793d * width) / 180.0d) * z12)) <= f13) {
                                double d = (-90.0f) - (360.0f * f20);
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d)) * width)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d)) * width)), (Paint) this.f27511b[i12].e);
                            } else {
                                ((Paint) this.f27511b[i12].e).setStyle(Paint.Style.STROKE);
                                canvas.drawArc(rectF, (-90.0f) - (360.0f * f20), z12, false, (Paint) this.f27511b[i12].e);
                            }
                        } else {
                            i12 = i13;
                        }
                        f20 += f21;
                        i13 = i12 + 1;
                        f14 = f10;
                        f13 = 1.0f;
                        z11 = false;
                    }
                }
                i12 = i13;
                i13 = i12 + 1;
                f14 = f10;
                f13 = 1.0f;
                z11 = false;
            }
            float f22 = f10;
            int i14 = 0;
            while (true) {
                ix0[] ix0VarArr2 = this.f27511b;
                if (i14 >= ix0VarArr2.length) {
                    break;
                }
                ix0 ix0Var2 = ix0VarArr2[i14];
                if (ix0Var2 != null) {
                    float f23 = this.f27512c[i14];
                    if (f23 != f10) {
                        if (!ix0Var2.d) {
                            float z13 = c3.i0.z(1.0f, this.f27513f, f7, f23 * (-360.0f));
                            if (z13 > f10) {
                                z13 = f10;
                            }
                            ((Paint) ix0Var2.e).setColor(org.telegram.ui.ActionBar.t6.x0(null, ix0Var2.f27120b, false));
                            ((Paint) this.f27511b[i14].e).setAlpha(i10);
                            double width2 = rectF.width() / 2.0f;
                            f12 = f23;
                            if (Math.abs((float) (z13 * ((width2 * 3.141592653589793d) / 180.0d))) <= 1.0f) {
                                double d10 = (-90.0f) - (f22 * 360.0f);
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d10)) * width2)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d10)) * width2)), (Paint) this.f27511b[i14].e);
                                f11 = 10.0f;
                                i11 = 255;
                            } else {
                                ((Paint) this.f27511b[i14].e).setStyle(Paint.Style.STROKE);
                                f11 = 10.0f;
                                i11 = 255;
                                canvas.drawArc(rectF, (-90.0f) - (f22 * 360.0f), z13, false, (Paint) this.f27511b[i14].e);
                            }
                        } else {
                            i11 = i10;
                            f11 = f7;
                            f12 = f23;
                        }
                        f22 += f12;
                        i14++;
                        f7 = f11;
                        i10 = i11;
                    }
                }
                i11 = i10;
                f11 = f7;
                i14++;
                f7 = f11;
                i10 = i11;
            }
            if (imageReceiver != null) {
                imageReceiver.h(canvas, null);
                canvas.restore();
            }
            if (e6Var2 != null) {
                int i15 = org.telegram.ui.ActionBar.t6.f21037j5;
                e6Var2.u(org.telegram.ui.ActionBar.t6.x0(null, i15, false));
                e6Var.u(org.telegram.ui.ActionBar.t6.x0(null, i15, false));
                if (this.f27514n != null) {
                    float c10 = e6Var.c() + e6Var2.c() + org.telegram.messenger.i0.L(4.0f);
                    float width3 = (getWidth() - c10) / 2.0f;
                    e6Var2.setBounds(0, org.telegram.messenger.i0.L(115.0f), (int) (e6Var2.c() + width3), org.telegram.messenger.i0.L(145.0f));
                    e6Var.setBounds((int) ((width3 + c10) - e6Var.c()), org.telegram.messenger.i0.L(118.0f), getWidth(), org.telegram.messenger.i0.L(148.0f));
                }
                e6Var2.draw(canvas);
                e6Var.draw(canvas);
            }
            if (this.f27519y != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(148.0f) - ((this.f27519y.getHeight() - org.telegram.messenger.i0.L(13.0f)) / 2.0f));
                this.f27518x.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21037j5, false));
                this.f27519y.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        CharSequence charSequence = this.f27517w;
        ImageReceiver imageReceiver = this.h;
        RectF rectF = this.f27510a;
        e6 e6Var = this.f27516s;
        e6 e6Var2 = this.f27515r;
        Long l4 = this.f27514n;
        if (l4 != null) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(166.0f), 1073741824));
            i12 = org.telegram.messenger.z20.y(110.0f, View.MeasureSpec.getSize(i10), 2);
            rectF.set(org.telegram.messenger.i0.L(3.0f) + i12, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(107.0f) + i12, org.telegram.messenger.i0.L(107.0f));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(110.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(110.0f), 1073741824));
            rectF.set(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(107.0f), org.telegram.messenger.i0.L(107.0f));
            i12 = 0;
        }
        gr grVar = gr.h;
        e6Var2.n(0.18f, 300L, grVar);
        e6Var2.w(org.telegram.messenger.i0.L(24.0f));
        e6Var2.x(org.telegram.messenger.i0.o());
        e6Var.n(0.18f, 300L, grVar);
        if (l4 != null) {
            e6Var.w(org.telegram.messenger.i0.L(16.0f));
            e6Var2.f25695b = 5;
            e6Var.f25695b = 3;
        } else {
            e6Var.w(org.telegram.messenger.i0.L(13.0f));
            int textSize = (int) e6Var2.f25693a.getTextSize();
            int textSize2 = (int) e6Var.f25693a.getTextSize();
            int L = ((org.telegram.messenger.i0.L(110.0f) - textSize) - textSize2) / 2;
            int i13 = textSize + L;
            e6Var2.setBounds(0, L, getMeasuredWidth(), i13);
            e6Var.setBounds(0, org.telegram.messenger.i0.L(2.0f) + i13, getMeasuredWidth(), org.telegram.messenger.i0.L(2.0f) + i13 + textSize2);
            e6Var2.f25695b = 17;
            e6Var.f25695b = 17;
        }
        if (charSequence != null) {
            if (this.f27518x == null) {
                this.f27518x = new TextPaint(1);
            }
            this.f27518x.setTextSize(org.telegram.messenger.i0.L(13.0f));
            int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(60.0f);
            TextPaint textPaint = this.f27518x;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f27519y = ov0.d(charSequence, textPaint, false, size, 1);
        }
        if (imageReceiver != null) {
            imageReceiver.y0(org.telegram.messenger.i0.L(10.0f) + i12, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(90.0f), org.telegram.messenger.i0.L(90.0f));
            imageReceiver.J0(org.telegram.messenger.i0.L(45.0f));
        }
        d();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        Long l4;
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null && (l4 = this.f27514n) != null && l4.longValue() != Long.MAX_VALUE && motionEvent.getX() > imageReceiver.K0 && motionEvent.getX() <= imageReceiver.y() && motionEvent.getY() > imageReceiver.L0 && motionEvent.getY() <= imageReceiver.A()) {
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
                org.telegram.messenger.i0.h3(new uo0(this, 13), 80L);
            }
            setPressed(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCacheModel(sh.b bVar) {
        this.F = bVar;
    }

    @Override
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.H) != null) {
                valueAnimator.removeAllListeners();
                this.H.cancel();
            }
            if (!z10) {
                float f7 = this.G;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.H = ofFloat;
                    ofFloat.addUpdateListener(new r60(this, 24));
                    this.H.addListener(new t60(this, 26));
                    org.telegram.messenger.z20.j(2.0f, this.H);
                    this.H.setDuration(350L);
                    this.H.start();
                }
            }
        }
    }
}
