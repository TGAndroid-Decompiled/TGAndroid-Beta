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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public abstract class kz0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public ValueAnimator E;
    public zh.b F;
    public float G;
    public ValueAnimator H;
    public RectF f27967a;
    public jz0[] f27968b;
    public float[] f27969c;
    public float[] d;
    public float[] f27970e;
    public float f27971f;
    public ImageReceiver h;
    public Long f27972n;
    public q6 f27973r;
    public q6 f27974s;
    public CharSequence v;
    public TextPaint f27975w;
    public StaticLayout f27976x;
    public int f27977y;

    public final long a() {
        if (this.f27968b == null) {
            return 0L;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < this.f27968b.length; i10++) {
            long f7 = this.F.f(i10);
            jz0 jz0Var = this.f27968b[i10];
            if (jz0Var != null && (jz0Var.f27682c || f7 > 0)) {
                if (f7 <= 0) {
                    f7 = jz0Var.f27680a;
                }
                j3 += f7;
            }
        }
        return j3;
    }

    public abstract void b();

    public final void c(boolean z10) {
        boolean z11;
        jz0[] jz0VarArr = this.f27968b;
        if (jz0VarArr == null) {
            return;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < jz0VarArr.length; i10++) {
            long f7 = this.F.f(i10);
            jz0 jz0Var = jz0VarArr[i10];
            if (jz0Var != null && (jz0Var.f27682c || f7 > 0)) {
                if (f7 <= 0) {
                    f7 = jz0Var.f27680a;
                }
                j3 += f7;
            }
        }
        this.f27977y = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < jz0VarArr.length; i11++) {
            long f12 = this.F.f(i11);
            jz0 jz0Var2 = jz0VarArr[i11];
            if (jz0Var2 != null && (jz0Var2.f27682c || f12 > 0)) {
                this.f27977y++;
            }
            if (jz0Var2 != null && ((z11 = jz0Var2.f27682c) || f12 > 0)) {
                int i12 = (f12 > 0L ? 1 : (f12 == 0L ? 0 : -1));
                if (i12 <= 0) {
                    f12 = jz0Var2.f27680a;
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
            for (int i13 = 0; i13 < jz0VarArr.length; i13++) {
                if (jz0VarArr[i13] != null) {
                    float[] fArr = this.d;
                    fArr[i13] = fArr[i13] * f14;
                }
            }
        }
        if (!z10) {
            System.arraycopy(this.d, 0, this.f27969c, 0, jz0VarArr.length);
            return;
        }
        System.arraycopy(this.f27969c, 0, this.f27970e, 0, jz0VarArr.length);
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.E.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new ai.x(16, this, jz0VarArr));
        this.E.addListener(new zd0(jz0VarArr, 19));
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
            q6 q6Var = this.f27973r;
            int i10 = (a2 > 0L ? 1 : (a2 == 0L ? 0 : -1));
            if (i10 == 0) {
                str = " ";
            } else {
                str = split[0];
            }
            q6Var.t(str, true, false);
            q6 q6Var2 = this.f27974s;
            if (i10 != 0) {
                str2 = split[1];
            }
            q6Var2.t(str2, true, false);
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
        float f11;
        float f12;
        int i12;
        q6 q6Var = this.f27974s;
        ImageReceiver imageReceiver = this.h;
        q6 q6Var2 = this.f27973r;
        RectF rectF = this.f27967a;
        if (this.f27968b != null) {
            float f13 = 1.0f;
            float f14 = 0.0f;
            if (imageReceiver != null) {
                canvas.save();
                if (isPressed()) {
                    float f15 = this.G;
                    if (f15 != 1.0f) {
                        float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f15;
                        this.G = min;
                        this.G = Utilities.clamp(min, 1.0f, 0.0f);
                        invalidate();
                    }
                }
                float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, this.G, 0.15f, 0.85f);
                canvas.scale(y3, y3, imageReceiver.getCenterX(), imageReceiver.getCenterY());
            }
            if (this.f27977y > 1) {
                float f16 = this.f27971f;
                if (f16 > 0.0f) {
                    float f17 = (float) (f16 - 0.04d);
                    this.f27971f = f17;
                    if (f17 < 0.0f) {
                        this.f27971f = 0.0f;
                    }
                }
            } else {
                float f18 = this.f27971f;
                if (f18 < 1.0f) {
                    float f19 = (float) (f18 + 0.04d);
                    this.f27971f = f19;
                    if (f19 > 1.0f) {
                        this.f27971f = 1.0f;
                    }
                }
            }
            boolean z10 = false;
            float f20 = 0.0f;
            int i13 = 0;
            while (true) {
                jz0[] jz0VarArr = this.f27968b;
                i10 = 255;
                f7 = 10.0f;
                f10 = f14;
                if (i13 >= jz0VarArr.length) {
                    break;
                }
                jz0 jz0Var = jz0VarArr[i13];
                if (jz0Var != null) {
                    float f21 = this.f27969c[i13];
                    if (f21 != f10) {
                        if (jz0Var.d) {
                            float y10 = com.google.android.gms.internal.vision.e2.y(f13, this.f27971f, 10.0f, f21 * (-360.0f));
                            if (y10 > f10) {
                                y10 = f10;
                            }
                            ((Paint) jz0Var.f27683e).setColor(org.telegram.ui.ActionBar.h6.x0(null, jz0Var.f27681b, z10));
                            ((Paint) this.f27968b[i13].f27683e).setAlpha(255);
                            double width = rectF.width() / 2.0f;
                            i12 = i13;
                            if (Math.abs((float) (((3.141592653589793d * width) / 180.0d) * y10)) <= f13) {
                                double d = (-90.0f) - (360.0f * f20);
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d)) * width)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d)) * width)), (Paint) this.f27968b[i12].f27683e);
                            } else {
                                ((Paint) this.f27968b[i12].f27683e).setStyle(Paint.Style.STROKE);
                                canvas.drawArc(rectF, (-90.0f) - (360.0f * f20), y10, false, (Paint) this.f27968b[i12].f27683e);
                            }
                        } else {
                            i12 = i13;
                        }
                        f20 += f21;
                        i13 = i12 + 1;
                        f14 = f10;
                        f13 = 1.0f;
                        z10 = false;
                    }
                }
                i12 = i13;
                i13 = i12 + 1;
                f14 = f10;
                f13 = 1.0f;
                z10 = false;
            }
            float f22 = f10;
            int i14 = 0;
            while (true) {
                jz0[] jz0VarArr2 = this.f27968b;
                if (i14 >= jz0VarArr2.length) {
                    break;
                }
                jz0 jz0Var2 = jz0VarArr2[i14];
                if (jz0Var2 != null) {
                    float f23 = this.f27969c[i14];
                    if (f23 != f10) {
                        if (!jz0Var2.d) {
                            float y11 = com.google.android.gms.internal.vision.e2.y(1.0f, this.f27971f, f7, f23 * (-360.0f));
                            if (y11 > f10) {
                                y11 = f10;
                            }
                            ((Paint) jz0Var2.f27683e).setColor(org.telegram.ui.ActionBar.h6.x0(null, jz0Var2.f27681b, false));
                            ((Paint) this.f27968b[i14].f27683e).setAlpha(i10);
                            double width2 = rectF.width() / 2.0f;
                            f12 = f23;
                            if (Math.abs((float) (y11 * ((width2 * 3.141592653589793d) / 180.0d))) <= 1.0f) {
                                double d10 = (-90.0f) - (f22 * 360.0f);
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d10)) * width2)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d10)) * width2)), (Paint) this.f27968b[i14].f27683e);
                                f11 = 10.0f;
                                i11 = 255;
                            } else {
                                ((Paint) this.f27968b[i14].f27683e).setStyle(Paint.Style.STROKE);
                                f11 = 10.0f;
                                i11 = 255;
                                canvas.drawArc(rectF, (-90.0f) - (f22 * 360.0f), y11, false, (Paint) this.f27968b[i14].f27683e);
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
                imageReceiver.draw(canvas);
                canvas.restore();
            }
            if (q6Var2 != null) {
                int i15 = org.telegram.ui.ActionBar.h6.f20667j5;
                q6Var2.u(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
                q6Var.u(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
                if (this.f27972n != null) {
                    float c10 = q6Var.c() + q6Var2.c() + AndroidUtilities.dp(4.0f);
                    float width3 = (getWidth() - c10) / 2.0f;
                    q6Var2.setBounds(0, AndroidUtilities.dp(115.0f), (int) (q6Var2.c() + width3), AndroidUtilities.dp(145.0f));
                    q6Var.setBounds((int) ((width3 + c10) - q6Var.c()), AndroidUtilities.dp(118.0f), getWidth(), AndroidUtilities.dp(148.0f));
                }
                q6Var2.draw(canvas);
                q6Var.draw(canvas);
            }
            if (this.f27976x != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(148.0f) - ((this.f27976x.getHeight() - AndroidUtilities.dp(13.0f)) / 2.0f));
                this.f27975w.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20667j5, false));
                this.f27976x.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        CharSequence charSequence = this.v;
        ImageReceiver imageReceiver = this.h;
        RectF rectF = this.f27967a;
        q6 q6Var = this.f27974s;
        q6 q6Var2 = this.f27973r;
        Long l4 = this.f27972n;
        if (l4 != null) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(166.0f), 1073741824));
            i12 = org.telegram.messenger.am.A(110.0f, View.MeasureSpec.getSize(i10), 2);
            rectF.set(AndroidUtilities.dp(3.0f) + i12, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f) + i12, AndroidUtilities.dp(107.0f));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), 1073741824));
            rectF.set(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f), AndroidUtilities.dp(107.0f));
            i12 = 0;
        }
        js jsVar = js.h;
        q6Var2.n(0.18f, 300L, jsVar);
        q6Var2.w(AndroidUtilities.dp(24.0f));
        q6Var2.x(AndroidUtilities.bold());
        q6Var.n(0.18f, 300L, jsVar);
        if (l4 != null) {
            q6Var.w(AndroidUtilities.dp(16.0f));
            q6Var2.f29712b = 5;
            q6Var.f29712b = 3;
        } else {
            q6Var.w(AndroidUtilities.dp(13.0f));
            int textSize = (int) q6Var2.f29710a.getTextSize();
            int textSize2 = (int) q6Var.f29710a.getTextSize();
            int dp = ((AndroidUtilities.dp(110.0f) - textSize) - textSize2) / 2;
            int i13 = textSize + dp;
            q6Var2.setBounds(0, dp, getMeasuredWidth(), i13);
            q6Var.setBounds(0, AndroidUtilities.dp(2.0f) + i13, getMeasuredWidth(), AndroidUtilities.dp(2.0f) + i13 + textSize2);
            q6Var2.f29712b = 17;
            q6Var.f29712b = 17;
        }
        if (charSequence != null) {
            if (this.f27975w == null) {
                this.f27975w = new TextPaint(1);
            }
            this.f27975w.setTextSize(AndroidUtilities.dp(13.0f));
            int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(60.0f);
            TextPaint textPaint = this.f27975w;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f27976x = sx0.d(charSequence, textPaint, false, size, 1);
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
        if (imageReceiver != null && (l4 = this.f27972n) != null && l4.longValue() != Long.MAX_VALUE && motionEvent.getX() > imageReceiver.getImageX() && motionEvent.getX() <= imageReceiver.getImageX2() && motionEvent.getY() > imageReceiver.getImageY() && motionEvent.getY() <= imageReceiver.getImageY2()) {
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
                AndroidUtilities.runOnUIThread(new ur0(this, 11), 80L);
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
                    ofFloat.addUpdateListener(new m80(this, 26));
                    this.H.addListener(new zd0(this, 20));
                    org.telegram.messenger.am.l(2.0f, this.H);
                    this.H.setDuration(350L);
                    this.H.start();
                }
            }
        }
    }
}
