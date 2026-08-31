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
public abstract class gy0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public ValueAnimator B;
    public nh.b C;
    public float D;
    public ValueAnimator E;
    public RectF f27324a;
    public fy0[] f27325b;
    public float[] f27326c;
    public float[] d;
    public float[] f27327e;
    public float f27328f;
    public ImageReceiver h;
    public Long f27329n;
    public j6 f27330r;
    public j6 f27331s;
    public CharSequence v;
    public TextPaint f27332w;
    public StaticLayout f27333x;
    public int f27334y;

    public final long a() {
        if (this.f27325b == null) {
            return 0L;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < this.f27325b.length; i10++) {
            long f10 = this.C.f(i10);
            fy0 fy0Var = this.f27325b[i10];
            if (fy0Var != null && (fy0Var.f27038c || f10 > 0)) {
                if (f10 <= 0) {
                    f10 = fy0Var.f27039e;
                }
                j10 += f10;
            }
        }
        return j10;
    }

    public abstract void b();

    public final void c(boolean z4) {
        boolean z10;
        fy0[] fy0VarArr = this.f27325b;
        if (fy0VarArr == null) {
            return;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < fy0VarArr.length; i10++) {
            long f10 = this.C.f(i10);
            fy0 fy0Var = fy0VarArr[i10];
            if (fy0Var != null && (fy0Var.f27038c || f10 > 0)) {
                if (f10 <= 0) {
                    f10 = fy0Var.f27039e;
                }
                j10 += f10;
            }
        }
        this.f27334y = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (int i11 = 0; i11 < fy0VarArr.length; i11++) {
            long f13 = this.C.f(i11);
            fy0 fy0Var2 = fy0VarArr[i11];
            if (fy0Var2 != null && (fy0Var2.f27038c || f13 > 0)) {
                this.f27334y++;
            }
            if (fy0Var2 != null && ((z10 = fy0Var2.f27038c) || f13 > 0)) {
                int i12 = (f13 > 0L ? 1 : (f13 == 0L ? 0 : -1));
                if (i12 <= 0) {
                    f13 = fy0Var2.f27039e;
                }
                float f14 = ((float) f13) / ((float) j10);
                if (f14 < 0.02777f) {
                    f14 = 0.02777f;
                }
                f11 += f14;
                if (f14 > f12 && (z10 || i12 > 0)) {
                    f12 = f14;
                }
                this.d[i11] = f14;
            } else {
                this.d[i11] = 0.0f;
            }
        }
        if (f11 > 1.0f) {
            float f15 = 1.0f / f11;
            for (int i13 = 0; i13 < fy0VarArr.length; i13++) {
                if (fy0VarArr[i13] != null) {
                    float[] fArr = this.d;
                    fArr[i13] = fArr[i13] * f15;
                }
            }
        }
        if (!z4) {
            System.arraycopy(this.d, 0, this.f27326c, 0, fy0VarArr.length);
            return;
        }
        System.arraycopy(this.f27326c, 0, this.f27327e, 0, fy0VarArr.length);
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.B.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B = ofFloat;
        ofFloat.addUpdateListener(new bg.a(15, this, fy0VarArr));
        this.B.addListener(new pd0(fy0VarArr, 17));
        this.B.setDuration(450L);
        this.B.setInterpolator(new u1.a());
        this.B.start();
    }

    public final long d() {
        String str;
        long a2 = a();
        String str2 = " ";
        String[] split = AndroidUtilities.formatFileSize(a2).split(" ");
        if (split.length > 1) {
            j6 j6Var = this.f27330r;
            int i10 = (a2 > 0L ? 1 : (a2 == 0L ? 0 : -1));
            if (i10 == 0) {
                str = " ";
            } else {
                str = split[0];
            }
            j6Var.q(str, true, false);
            j6 j6Var2 = this.f27331s;
            if (i10 != 0) {
                str2 = split[1];
            }
            j6Var2.q(str2, true, false);
        }
        return a2;
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
        j6 j6Var = this.f27331s;
        ImageReceiver imageReceiver = this.h;
        j6 j6Var2 = this.f27330r;
        RectF rectF = this.f27324a;
        if (this.f27325b != null) {
            float f12 = 1.0f;
            if (imageReceiver != null) {
                canvas.save();
                if (isPressed()) {
                    float f13 = this.D;
                    if (f13 != 1.0f) {
                        float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f13;
                        this.D = min;
                        this.D = Utilities.clamp(min, 1.0f, 0.0f);
                        invalidate();
                    }
                }
                float w10 = e2.c.w(1.0f, this.D, 0.15f, 0.85f);
                canvas.scale(w10, w10, imageReceiver.getCenterX(), imageReceiver.getCenterY());
            }
            if (this.f27334y > 1) {
                float f14 = this.f27328f;
                if (f14 > 0.0f) {
                    float f15 = (float) (f14 - 0.04d);
                    this.f27328f = f15;
                    if (f15 < 0.0f) {
                        this.f27328f = 0.0f;
                    }
                }
            } else {
                float f16 = this.f27328f;
                if (f16 < 1.0f) {
                    float f17 = (float) (f16 + 0.04d);
                    this.f27328f = f17;
                    if (f17 > 1.0f) {
                        this.f27328f = 1.0f;
                    }
                }
            }
            boolean z4 = false;
            int i12 = 0;
            float f18 = 0.0f;
            while (true) {
                fy0[] fy0VarArr = this.f27325b;
                i10 = 255;
                f10 = 10.0f;
                if (i12 >= fy0VarArr.length) {
                    break;
                }
                fy0 fy0Var = fy0VarArr[i12];
                if (fy0Var != null) {
                    float f19 = this.f27326c[i12];
                    if (f19 != 0.0f) {
                        if (fy0Var.d) {
                            float w11 = e2.c.w(f12, this.f27328f, 10.0f, f19 * (-360.0f));
                            if (w11 > 0.0f) {
                                w11 = 0.0f;
                            }
                            fy0Var.f27037b.setColor(org.telegram.ui.ActionBar.k6.w0(null, fy0Var.f27036a, z4));
                            this.f27325b[i12].f27037b.setAlpha(255);
                            double width = rectF.width() / 2.0f;
                            i11 = i12;
                            if (Math.abs((float) (((3.141592653589793d * width) / 180.0d) * w11)) <= f12) {
                                double d = (-90.0f) - (360.0f * f18);
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d)) * width)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d)) * width)), this.f27325b[i11].f27037b);
                            } else {
                                this.f27325b[i11].f27037b.setStyle(Paint.Style.STROKE);
                                canvas.drawArc(rectF, (-90.0f) - (360.0f * f18), w11, false, this.f27325b[i11].f27037b);
                            }
                        } else {
                            i11 = i12;
                        }
                        f18 += f19;
                        i12 = i11 + 1;
                        f12 = 1.0f;
                        z4 = false;
                    }
                }
                i11 = i12;
                i12 = i11 + 1;
                f12 = 1.0f;
                z4 = false;
            }
            int i13 = 0;
            float f20 = 0.0f;
            while (true) {
                fy0[] fy0VarArr2 = this.f27325b;
                if (i13 >= fy0VarArr2.length) {
                    break;
                }
                fy0 fy0Var2 = fy0VarArr2[i13];
                if (fy0Var2 != null) {
                    float f21 = this.f27326c[i13];
                    if (f21 != 0.0f) {
                        if (!fy0Var2.d) {
                            float w12 = e2.c.w(1.0f, this.f27328f, f10, f21 * (-360.0f));
                            if (w12 > 0.0f) {
                                w12 = 0.0f;
                            }
                            fy0Var2.f27037b.setColor(org.telegram.ui.ActionBar.k6.w0(null, fy0Var2.f27036a, false));
                            this.f27325b[i13].f27037b.setAlpha(i10);
                            double width2 = rectF.width() / 2.0f;
                            f11 = f21;
                            if (Math.abs((float) (w12 * ((width2 * 3.141592653589793d) / 180.0d))) <= 1.0f) {
                                double d10 = (-90.0f) - (f20 * 360.0f);
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d10)) * width2)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d10)) * width2)), this.f27325b[i13].f27037b);
                            } else {
                                this.f27325b[i13].f27037b.setStyle(Paint.Style.STROKE);
                                canvas.drawArc(rectF, (-90.0f) - (f20 * 360.0f), w12, false, this.f27325b[i13].f27037b);
                                f20 += f11;
                                i13++;
                                i10 = 255;
                                f10 = 10.0f;
                            }
                        } else {
                            f11 = f21;
                        }
                        f20 += f11;
                        i13++;
                        i10 = 255;
                        f10 = 10.0f;
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
            if (j6Var2 != null) {
                int i14 = org.telegram.ui.ActionBar.k6.f21766j5;
                j6Var2.r(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
                j6Var.r(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
                if (this.f27329n != null) {
                    float d11 = j6Var.d() + j6Var2.d() + AndroidUtilities.dp(4.0f);
                    float width3 = (getWidth() - d11) / 2.0f;
                    j6Var2.setBounds(0, AndroidUtilities.dp(115.0f), (int) (j6Var2.d() + width3), AndroidUtilities.dp(145.0f));
                    j6Var.setBounds((int) ((width3 + d11) - j6Var.d()), AndroidUtilities.dp(118.0f), getWidth(), AndroidUtilities.dp(148.0f));
                }
                j6Var2.draw(canvas);
                j6Var.draw(canvas);
            }
            if (this.f27333x != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(148.0f) - ((this.f27333x.getHeight() - AndroidUtilities.dp(13.0f)) / 2.0f));
                this.f27332w.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false));
                this.f27333x.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        ImageReceiver imageReceiver = this.h;
        RectF rectF = this.f27324a;
        j6 j6Var = this.f27331s;
        j6 j6Var2 = this.f27330r;
        Long l10 = this.f27329n;
        if (l10 != null) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(166.0f), 1073741824));
            i12 = org.telegram.ui.b.x(110.0f, View.MeasureSpec.getSize(i10), 2);
            rectF.set(AndroidUtilities.dp(3.0f) + i12, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f) + i12, AndroidUtilities.dp(107.0f));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), 1073741824));
            rectF.set(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f), AndroidUtilities.dp(107.0f));
            i12 = 0;
        }
        pr prVar = pr.h;
        j6Var2.k(0.18f, 300L, prVar);
        j6Var2.t(AndroidUtilities.dp(24.0f));
        j6Var2.u(AndroidUtilities.bold());
        j6Var.k(0.18f, 300L, prVar);
        if (l10 != null) {
            j6Var.t(AndroidUtilities.dp(16.0f));
            j6Var2.f28029b = 5;
            j6Var.f28029b = 3;
        } else {
            j6Var.t(AndroidUtilities.dp(13.0f));
            int textSize = (int) j6Var2.f28028a.getTextSize();
            int textSize2 = (int) j6Var.f28028a.getTextSize();
            int dp = ((AndroidUtilities.dp(110.0f) - textSize) - textSize2) / 2;
            int i13 = textSize + dp;
            j6Var2.setBounds(0, dp, getMeasuredWidth(), i13);
            j6Var.setBounds(0, AndroidUtilities.dp(2.0f) + i13, getMeasuredWidth(), AndroidUtilities.dp(2.0f) + i13 + textSize2);
            j6Var2.f28029b = 17;
            j6Var.f28029b = 17;
        }
        if (this.v != null) {
            if (this.f27332w == null) {
                this.f27332w = new TextPaint(1);
            }
            this.f27332w.setTextSize(AndroidUtilities.dp(13.0f));
            int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(60.0f);
            CharSequence charSequence = this.v;
            TextPaint textPaint = this.f27332w;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f27333x = lw0.d(charSequence, textPaint, size, false, size, 1);
        }
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(AndroidUtilities.dp(10.0f) + i12, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            imageReceiver.setRoundRadius(AndroidUtilities.dp(45.0f));
        }
        d();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        Long l10;
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null && (l10 = this.f27329n) != null && l10.longValue() != Long.MAX_VALUE && motionEvent.getX() > imageReceiver.getImageX() && motionEvent.getX() <= imageReceiver.getImageX2() && motionEvent.getY() > imageReceiver.getImageY() && motionEvent.getY() <= imageReceiver.getImageY2()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (motionEvent.getAction() == 0) {
            if (z4) {
                setPressed(true);
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (z4 && motionEvent.getAction() != 3) {
                AndroidUtilities.runOnUIThread(new oq0(this, 10), 80L);
            }
            setPressed(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCacheModel(nh.b bVar) {
        this.C = bVar;
    }

    @Override
    public void setPressed(boolean z4) {
        ValueAnimator valueAnimator;
        if (isPressed() != z4) {
            super.setPressed(z4);
            invalidate();
            if (z4 && (valueAnimator = this.E) != null) {
                valueAnimator.removeAllListeners();
                this.E.cancel();
            }
            if (!z4) {
                float f10 = this.D;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.E = ofFloat;
                    ofFloat.addUpdateListener(new k70(this, 25));
                    this.E.addListener(new pd0(this, 18));
                    this.E.setInterpolator(new OvershootInterpolator(2.0f));
                    this.E.setDuration(350L);
                    this.E.start();
                }
            }
        }
    }
}
