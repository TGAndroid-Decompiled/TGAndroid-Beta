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
public abstract class dy0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public ValueAnimator E;
    public zh.b F;
    public float G;
    public ValueAnimator H;
    public RectF f23415a;
    public cy0[] f23416b;
    public float[] f23417c;
    public float[] d;
    public float[] e;
    public float f23418f;
    public ImageReceiver h;
    public Long f23419n;
    public m6 f23420r;
    public m6 f23421s;
    public CharSequence v;
    public TextPaint f23422w;
    public StaticLayout f23423x;
    public int f23424y;

    public final long a() {
        if (this.f23416b == null) {
            return 0L;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < this.f23416b.length; i10++) {
            long f7 = this.F.f(i10);
            cy0 cy0Var = this.f23416b[i10];
            if (cy0Var != null && (cy0Var.f23164c || f7 > 0)) {
                if (f7 <= 0) {
                    f7 = cy0Var.e;
                }
                j3 += f7;
            }
        }
        return j3;
    }

    public abstract void b();

    public final void c(boolean z10) {
        boolean z11;
        cy0[] cy0VarArr = this.f23416b;
        if (cy0VarArr == null) {
            return;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < cy0VarArr.length; i10++) {
            long f7 = this.F.f(i10);
            cy0 cy0Var = cy0VarArr[i10];
            if (cy0Var != null && (cy0Var.f23164c || f7 > 0)) {
                if (f7 <= 0) {
                    f7 = cy0Var.e;
                }
                j3 += f7;
            }
        }
        this.f23424y = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < cy0VarArr.length; i11++) {
            long f12 = this.F.f(i11);
            cy0 cy0Var2 = cy0VarArr[i11];
            if (cy0Var2 != null && (cy0Var2.f23164c || f12 > 0)) {
                this.f23424y++;
            }
            if (cy0Var2 != null && ((z11 = cy0Var2.f23164c) || f12 > 0)) {
                int i12 = (f12 > 0L ? 1 : (f12 == 0L ? 0 : -1));
                if (i12 <= 0) {
                    f12 = cy0Var2.e;
                }
                float f13 = ((float) f12) / ((float) j3);
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
            for (int i13 = 0; i13 < cy0VarArr.length; i13++) {
                if (cy0VarArr[i13] != null) {
                    float[] fArr = this.d;
                    fArr[i13] = fArr[i13] * f14;
                }
            }
        }
        if (!z10) {
            System.arraycopy(this.d, 0, this.f23417c, 0, cy0VarArr.length);
            return;
        }
        System.arraycopy(this.f23417c, 0, this.e, 0, cy0VarArr.length);
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.E.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new ai.x(16, this, cy0VarArr));
        this.E.addListener(new jd0(cy0VarArr, 18));
        this.E.setDuration(450L);
        this.E.setInterpolator(new u1.a());
        this.E.start();
    }

    public final long d() {
        String str;
        long a2 = a();
        String str2 = " ";
        String[] split = AndroidUtilities.formatFileSize(a2).split(" ");
        if (split.length > 1) {
            m6 m6Var = this.f23420r;
            int i10 = (a2 > 0L ? 1 : (a2 == 0L ? 0 : -1));
            if (i10 == 0) {
                str = " ";
            } else {
                str = split[0];
            }
            m6Var.q(str, true, false);
            m6 m6Var2 = this.f23421s;
            if (i10 != 0) {
                str2 = split[1];
            }
            m6Var2.q(str2, true, false);
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
        float f7;
        float f10;
        int i11;
        m6 m6Var = this.f23421s;
        ImageReceiver imageReceiver = this.h;
        m6 m6Var2 = this.f23420r;
        RectF rectF = this.f23415a;
        if (this.f23416b != null) {
            float f11 = 1.0f;
            if (imageReceiver != null) {
                canvas.save();
                if (isPressed()) {
                    float f12 = this.G;
                    if (f12 != 1.0f) {
                        float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f12;
                        this.G = min;
                        this.G = Utilities.clamp(min, 1.0f, 0.0f);
                        invalidate();
                    }
                }
                float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.G, 0.15f, 0.85f);
                canvas.scale(z10, z10, imageReceiver.getCenterX(), imageReceiver.getCenterY());
            }
            if (this.f23424y > 1) {
                float f13 = this.f23418f;
                if (f13 > 0.0f) {
                    float f14 = (float) (f13 - 0.04d);
                    this.f23418f = f14;
                    if (f14 < 0.0f) {
                        this.f23418f = 0.0f;
                    }
                }
            } else {
                float f15 = this.f23418f;
                if (f15 < 1.0f) {
                    float f16 = (float) (f15 + 0.04d);
                    this.f23418f = f16;
                    if (f16 > 1.0f) {
                        this.f23418f = 1.0f;
                    }
                }
            }
            boolean z11 = false;
            int i12 = 0;
            float f17 = 0.0f;
            while (true) {
                cy0[] cy0VarArr = this.f23416b;
                i10 = 255;
                f7 = 10.0f;
                if (i12 >= cy0VarArr.length) {
                    break;
                }
                cy0 cy0Var = cy0VarArr[i12];
                if (cy0Var != null) {
                    float f18 = this.f23417c[i12];
                    if (f18 != 0.0f) {
                        if (cy0Var.d) {
                            float z12 = com.google.android.gms.internal.vision.e2.z(f11, this.f23418f, 10.0f, f18 * (-360.0f));
                            if (z12 > 0.0f) {
                                z12 = 0.0f;
                            }
                            cy0Var.f23163b.setColor(org.telegram.ui.ActionBar.i6.w0(null, cy0Var.f23162a, z11));
                            this.f23416b[i12].f23163b.setAlpha(255);
                            double width = rectF.width() / 2.0f;
                            i11 = i12;
                            if (Math.abs((float) (((3.141592653589793d * width) / 180.0d) * z12)) <= f11) {
                                double d = (-90.0f) - (360.0f * f17);
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d)) * width)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d)) * width)), this.f23416b[i11].f23163b);
                            } else {
                                this.f23416b[i11].f23163b.setStyle(Paint.Style.STROKE);
                                canvas.drawArc(rectF, (-90.0f) - (360.0f * f17), z12, false, this.f23416b[i11].f23163b);
                            }
                        } else {
                            i11 = i12;
                        }
                        f17 += f18;
                        i12 = i11 + 1;
                        f11 = 1.0f;
                        z11 = false;
                    }
                }
                i11 = i12;
                i12 = i11 + 1;
                f11 = 1.0f;
                z11 = false;
            }
            int i13 = 0;
            float f19 = 0.0f;
            while (true) {
                cy0[] cy0VarArr2 = this.f23416b;
                if (i13 >= cy0VarArr2.length) {
                    break;
                }
                cy0 cy0Var2 = cy0VarArr2[i13];
                if (cy0Var2 != null) {
                    float f20 = this.f23417c[i13];
                    if (f20 != 0.0f) {
                        if (!cy0Var2.d) {
                            float z13 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f23418f, f7, f20 * (-360.0f));
                            if (z13 > 0.0f) {
                                z13 = 0.0f;
                            }
                            cy0Var2.f23163b.setColor(org.telegram.ui.ActionBar.i6.w0(null, cy0Var2.f23162a, false));
                            this.f23416b[i13].f23163b.setAlpha(i10);
                            double width2 = rectF.width() / 2.0f;
                            f10 = f20;
                            if (Math.abs((float) (z13 * ((width2 * 3.141592653589793d) / 180.0d))) <= 1.0f) {
                                double d10 = (-90.0f) - (f19 * 360.0f);
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d10)) * width2)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d10)) * width2)), this.f23416b[i13].f23163b);
                            } else {
                                this.f23416b[i13].f23163b.setStyle(Paint.Style.STROKE);
                                canvas.drawArc(rectF, (-90.0f) - (f19 * 360.0f), z13, false, this.f23416b[i13].f23163b);
                                f19 += f10;
                                i13++;
                                i10 = 255;
                                f7 = 10.0f;
                            }
                        } else {
                            f10 = f20;
                        }
                        f19 += f10;
                        i13++;
                        i10 = 255;
                        f7 = 10.0f;
                    }
                }
                i13++;
                i10 = 255;
                f7 = 10.0f;
            }
            if (imageReceiver != null) {
                imageReceiver.draw(canvas);
                canvas.restore();
            }
            if (m6Var2 != null) {
                int i14 = org.telegram.ui.ActionBar.i6.f18940j5;
                m6Var2.r(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
                m6Var.r(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
                if (this.f23419n != null) {
                    float d11 = m6Var.d() + m6Var2.d() + AndroidUtilities.dp(4.0f);
                    float width3 = (getWidth() - d11) / 2.0f;
                    m6Var2.setBounds(0, AndroidUtilities.dp(115.0f), (int) (m6Var2.d() + width3), AndroidUtilities.dp(145.0f));
                    m6Var.setBounds((int) ((width3 + d11) - m6Var.d()), AndroidUtilities.dp(118.0f), getWidth(), AndroidUtilities.dp(148.0f));
                }
                m6Var2.draw(canvas);
                m6Var.draw(canvas);
            }
            if (this.f23423x != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(148.0f) - ((this.f23423x.getHeight() - AndroidUtilities.dp(13.0f)) / 2.0f));
                this.f23422w.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18940j5, false));
                this.f23423x.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        ImageReceiver imageReceiver = this.h;
        RectF rectF = this.f23415a;
        m6 m6Var = this.f23421s;
        m6 m6Var2 = this.f23420r;
        Long l4 = this.f23419n;
        if (l4 != null) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(166.0f), 1073741824));
            i12 = org.telegram.messenger.vl.y(110.0f, View.MeasureSpec.getSize(i10), 2);
            rectF.set(AndroidUtilities.dp(3.0f) + i12, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f) + i12, AndroidUtilities.dp(107.0f));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), 1073741824));
            rectF.set(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f), AndroidUtilities.dp(107.0f));
            i12 = 0;
        }
        qr qrVar = qr.h;
        m6Var2.k(0.18f, 300L, qrVar);
        m6Var2.t(AndroidUtilities.dp(24.0f));
        m6Var2.u(AndroidUtilities.bold());
        m6Var.k(0.18f, 300L, qrVar);
        if (l4 != null) {
            m6Var.t(AndroidUtilities.dp(16.0f));
            m6Var2.f26085b = 5;
            m6Var.f26085b = 3;
        } else {
            m6Var.t(AndroidUtilities.dp(13.0f));
            int textSize = (int) m6Var2.f26084a.getTextSize();
            int textSize2 = (int) m6Var.f26084a.getTextSize();
            int dp = ((AndroidUtilities.dp(110.0f) - textSize) - textSize2) / 2;
            int i13 = textSize + dp;
            m6Var2.setBounds(0, dp, getMeasuredWidth(), i13);
            m6Var.setBounds(0, AndroidUtilities.dp(2.0f) + i13, getMeasuredWidth(), AndroidUtilities.dp(2.0f) + i13 + textSize2);
            m6Var2.f26085b = 17;
            m6Var.f26085b = 17;
        }
        if (this.v != null) {
            if (this.f23422w == null) {
                this.f23422w = new TextPaint(1);
            }
            this.f23422w.setTextSize(AndroidUtilities.dp(13.0f));
            int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(60.0f);
            CharSequence charSequence = this.v;
            TextPaint textPaint = this.f23422w;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f23423x = jw0.d(charSequence, textPaint, size, false, size, 1);
        }
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(AndroidUtilities.dp(10.0f) + i12, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            imageReceiver.setRoundRadius(AndroidUtilities.dp(45.0f));
        }
        d();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        Long l4;
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null && (l4 = this.f23419n) != null && l4.longValue() != Long.MAX_VALUE && motionEvent.getX() > imageReceiver.getImageX() && motionEvent.getX() <= imageReceiver.getImageX2() && motionEvent.getY() > imageReceiver.getImageY() && motionEvent.getY() <= imageReceiver.getImageY2()) {
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
                AndroidUtilities.runOnUIThread(new jq0(this, 10), 80L);
            }
            setPressed(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCacheModel(zh.b bVar) {
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
                    ofFloat.addUpdateListener(new h70(this, 25));
                    this.H.addListener(new jd0(this, 19));
                    this.H.setInterpolator(new OvershootInterpolator(2.0f));
                    this.H.setDuration(350L);
                    this.H.start();
                }
            }
        }
    }
}
