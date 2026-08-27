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
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;

public abstract class mx0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public ValueAnimator A;
    public ih.b B;
    public float C;
    public ValueAnimator D;

    public RectF f30765a;

    public lx0[] f30766b;

    public float[] f30767c;
    public float[] d;

    public float[] f30768e;

    public float f30769f;
    public ImageReceiver h;

    public Long f30770n;

    public i6 f30771r;

    public i6 f30772s;
    public CharSequence v;

    public TextPaint f30773w;

    public StaticLayout f30774x;

    public int f30775y;

    public final long a() {
        if (this.f30766b == null) {
            return 0L;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < this.f30766b.length; i10++) {
            long jF = this.B.f(i10);
            lx0 lx0Var = this.f30766b[i10];
            if (lx0Var != null && (lx0Var.f30485c || jF > 0)) {
                if (jF <= 0) {
                    jF = lx0Var.f30486e;
                }
                j10 += jF;
            }
        }
        return j10;
    }

    public abstract void b();

    public final void c(boolean z10) {
        boolean z11;
        lx0[] lx0VarArr = this.f30766b;
        if (lx0VarArr == null) {
            return;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < lx0VarArr.length; i10++) {
            long jF = this.B.f(i10);
            lx0 lx0Var = lx0VarArr[i10];
            if (lx0Var != null && (lx0Var.f30485c || jF > 0)) {
                if (jF <= 0) {
                    jF = lx0Var.f30486e;
                }
                j10 += jF;
            }
        }
        this.f30775y = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < lx0VarArr.length; i11++) {
            long jF2 = this.B.f(i11);
            lx0 lx0Var2 = lx0VarArr[i11];
            if (lx0Var2 != null && (lx0Var2.f30485c || jF2 > 0)) {
                this.f30775y++;
            }
            if (lx0Var2 == null || (!(z11 = lx0Var2.f30485c) && jF2 <= 0)) {
                this.d[i11] = 0.0f;
            } else {
                if (jF2 <= 0) {
                    jF2 = lx0Var2.f30486e;
                }
                float f12 = jF2 / j10;
                if (f12 < 0.02777f) {
                    f12 = 0.02777f;
                }
                f10 += f12;
                if (f12 > f11 && (z11 || jF2 > 0)) {
                    f11 = f12;
                }
                this.d[i11] = f12;
            }
        }
        if (f10 > 1.0f) {
            float f13 = 1.0f / f10;
            for (int i12 = 0; i12 < lx0VarArr.length; i12++) {
                if (lx0VarArr[i12] != null) {
                    float[] fArr = this.d;
                    fArr[i12] = fArr[i12] * f13;
                }
            }
        }
        if (!z10) {
            System.arraycopy(this.d, 0, this.f30767c, 0, lx0VarArr.length);
            return;
        }
        System.arraycopy(this.f30767c, 0, this.f30768e, 0, lx0VarArr.length);
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.A.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ag.t2(13, this, lx0VarArr));
        this.A.addListener(new sz(lx0VarArr, 26));
        this.A.setDuration(450L);
        this.A.setInterpolator(new u1.a());
        this.A.start();
    }

    public final long d() {
        long jA = a();
        String[] strArrSplit = AndroidUtilities.formatFileSize(jA).split(" ");
        if (strArrSplit.length > 1) {
            this.f30771r.q(jA == 0 ? " " : strArrSplit[0], true, false);
            this.f30772s.q(jA != 0 ? strArrSplit[1] : " ", true, false);
        }
        return jA;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        float f11;
        int i11;
        i6 i6Var = this.f30772s;
        ImageReceiver imageReceiver = this.h;
        i6 i6Var2 = this.f30771r;
        RectF rectF = this.f30765a;
        if (this.f30766b == null) {
            return;
        }
        float f12 = 1.0f;
        if (imageReceiver != null) {
            canvas.save();
            if (isPressed()) {
                float f13 = this.C;
                if (f13 != 1.0f) {
                    float fMin = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f13;
                    this.C = fMin;
                    this.C = Utilities.clamp(fMin, 1.0f, 0.0f);
                    invalidate();
                }
            }
            float fZ = com.google.android.recaptcha.internal.a.z(1.0f, this.C, 0.15f, 0.85f);
            canvas.scale(fZ, fZ, imageReceiver.getCenterX(), imageReceiver.getCenterY());
        }
        if (this.f30775y > 1) {
            float f14 = this.f30769f;
            if (f14 > 0.0f) {
                float f15 = (float) (((double) f14) - 0.04d);
                this.f30769f = f15;
                if (f15 < 0.0f) {
                    this.f30769f = 0.0f;
                }
            }
        } else {
            float f16 = this.f30769f;
            if (f16 < 1.0f) {
                float f17 = (float) (((double) f16) + 0.04d);
                this.f30769f = f17;
                if (f17 > 1.0f) {
                    this.f30769f = 1.0f;
                }
            }
        }
        boolean z10 = false;
        int i12 = 0;
        float f18 = 0.0f;
        while (true) {
            lx0[] lx0VarArr = this.f30766b;
            i10 = 255;
            f10 = 10.0f;
            if (i12 >= lx0VarArr.length) {
                break;
            }
            lx0 lx0Var = lx0VarArr[i12];
            if (lx0Var != null) {
                float f19 = this.f30767c[i12];
                if (f19 == 0.0f) {
                    i11 = i12;
                } else {
                    if (lx0Var.d) {
                        float fZ2 = com.google.android.recaptcha.internal.a.z(f12, this.f30769f, 10.0f, f19 * (-360.0f));
                        if (fZ2 > 0.0f) {
                            fZ2 = 0.0f;
                        }
                        lx0Var.f30484b.setColor(org.telegram.ui.ActionBar.g6.w0(null, lx0Var.f30483a, z10));
                        this.f30766b[i12].f30484b.setAlpha(255);
                        double dWidth = rectF.width() / 2.0f;
                        i11 = i12;
                        if (Math.abs((float) (((3.141592653589793d * dWidth) / 180.0d) * ((double) fZ2))) <= f12) {
                            double d = (-90.0f) - (360.0f * f18);
                            canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d)) * dWidth)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d)) * dWidth)), this.f30766b[i11].f30484b);
                        } else {
                            this.f30766b[i11].f30484b.setStyle(Paint.Style.STROKE);
                            canvas.drawArc(rectF, (-90.0f) - (360.0f * f18), fZ2, false, this.f30766b[i11].f30484b);
                        }
                    } else {
                        i11 = i12;
                    }
                    f18 += f19;
                }
            } else {
                i11 = i12;
            }
            i12 = i11 + 1;
            f12 = 1.0f;
            z10 = false;
        }
        int i13 = 0;
        float f20 = 0.0f;
        while (true) {
            lx0[] lx0VarArr2 = this.f30766b;
            if (i13 >= lx0VarArr2.length) {
                break;
            }
            lx0 lx0Var2 = lx0VarArr2[i13];
            if (lx0Var2 != null) {
                float f21 = this.f30767c[i13];
                if (f21 != 0.0f) {
                    if (lx0Var2.d) {
                        f11 = f21;
                    } else {
                        float fZ3 = com.google.android.recaptcha.internal.a.z(1.0f, this.f30769f, f10, f21 * (-360.0f));
                        if (fZ3 > 0.0f) {
                            fZ3 = 0.0f;
                        }
                        lx0Var2.f30484b.setColor(org.telegram.ui.ActionBar.g6.w0(null, lx0Var2.f30483a, false));
                        this.f30766b[i13].f30484b.setAlpha(i10);
                        double dWidth2 = rectF.width() / 2.0f;
                        f11 = f21;
                        if (Math.abs((float) (((double) fZ3) * ((dWidth2 * 3.141592653589793d) / 180.0d))) <= 1.0f) {
                            double d10 = (-90.0f) - (f20 * 360.0f);
                            canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d10)) * dWidth2)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d10)) * dWidth2)), this.f30766b[i13].f30484b);
                        } else {
                            this.f30766b[i13].f30484b.setStyle(Paint.Style.STROKE);
                            canvas.drawArc(rectF, (-90.0f) - (f20 * 360.0f), fZ3, false, this.f30766b[i13].f30484b);
                        }
                        f20 += f11;
                    }
                    f20 += f11;
                }
            }
            i13++;
            i10 = 255;
            f10 = 10.0f;
        }
        if (imageReceiver != null) {
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        if (i6Var2 != null) {
            int i14 = org.telegram.ui.ActionBar.g6.f23161j5;
            i6Var2.r(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            i6Var.r(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            if (this.f30770n != null) {
                float fD = i6Var.d() + i6Var2.d() + AndroidUtilities.dp(4.0f);
                float width = (getWidth() - fD) / 2.0f;
                i6Var2.setBounds(0, AndroidUtilities.dp(115.0f), (int) (i6Var2.d() + width), AndroidUtilities.dp(145.0f));
                i6Var.setBounds((int) ((width + fD) - i6Var.d()), AndroidUtilities.dp(118.0f), getWidth(), AndroidUtilities.dp(148.0f));
            }
            i6Var2.draw(canvas);
            i6Var.draw(canvas);
        }
        if (this.f30774x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(148.0f) - ((this.f30774x.getHeight() - AndroidUtilities.dp(13.0f)) / 2.0f));
            this.f30773w.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
            this.f30774x.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iX;
        ImageReceiver imageReceiver = this.h;
        RectF rectF = this.f30765a;
        i6 i6Var = this.f30772s;
        i6 i6Var2 = this.f30771r;
        Long l10 = this.f30770n;
        if (l10 != null) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(166.0f), 1073741824));
            iX = org.telegram.messenger.rl.x(110.0f, View.MeasureSpec.getSize(i10), 2);
            rectF.set(AndroidUtilities.dp(3.0f) + iX, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f) + iX, AndroidUtilities.dp(107.0f));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), 1073741824));
            rectF.set(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f), AndroidUtilities.dp(107.0f));
            iX = 0;
        }
        er erVar = er.h;
        i6Var2.k(0.18f, 300L, erVar);
        i6Var2.t(AndroidUtilities.dp(24.0f));
        i6Var2.u(AndroidUtilities.bold());
        i6Var.k(0.18f, 300L, erVar);
        if (l10 != null) {
            i6Var.t(AndroidUtilities.dp(16.0f));
            i6Var2.f29239b = 5;
            i6Var.f29239b = 3;
        } else {
            i6Var.t(AndroidUtilities.dp(13.0f));
            int textSize = (int) i6Var2.f29238a.getTextSize();
            int textSize2 = (int) i6Var.f29238a.getTextSize();
            int iDp = ((AndroidUtilities.dp(110.0f) - textSize) - textSize2) / 2;
            int i12 = textSize + iDp;
            i6Var2.setBounds(0, iDp, getMeasuredWidth(), i12);
            i6Var.setBounds(0, AndroidUtilities.dp(2.0f) + i12, getMeasuredWidth(), AndroidUtilities.dp(2.0f) + i12 + textSize2);
            i6Var2.f29239b = 17;
            i6Var.f29239b = 17;
        }
        if (this.v != null) {
            if (this.f30773w == null) {
                this.f30773w = new TextPaint(1);
            }
            this.f30773w.setTextSize(AndroidUtilities.dp(13.0f));
            int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(60.0f);
            CharSequence charSequence = this.v;
            TextPaint textPaint = this.f30773w;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f30774x = tv0.d(charSequence, textPaint, size, false, size, 1);
        }
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(AndroidUtilities.dp(10.0f) + iX, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            imageReceiver.setRoundRadius(AndroidUtilities.dp(45.0f));
        }
        d();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Long l10;
        ImageReceiver imageReceiver = this.h;
        boolean z10 = imageReceiver != null && (l10 = this.f30770n) != null && l10.longValue() != Long.MAX_VALUE && motionEvent.getX() > imageReceiver.getImageX() && motionEvent.getX() <= imageReceiver.getImageX2() && motionEvent.getY() > imageReceiver.getImageY() && motionEvent.getY() <= imageReceiver.getImageY2();
        if (motionEvent.getAction() == 0) {
            if (z10) {
                setPressed(true);
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (z10 && motionEvent.getAction() != 3) {
                AndroidUtilities.runOnUIThread(new up0(this, 10), 80L);
            }
            setPressed(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCacheModel(ih.b bVar) {
        this.B = bVar;
    }

    @Override
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.D) != null) {
                valueAnimator.removeAllListeners();
                this.D.cancel();
            }
            if (z10) {
                return;
            }
            float f10 = this.C;
            if (f10 != 0.0f) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.D = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new v60(this, 25));
                this.D.addListener(new sz(this, 27));
                this.D.setInterpolator(new OvershootInterpolator(2.0f));
                this.D.setDuration(350L);
                this.D.start();
            }
        }
    }
}
