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
public abstract class py0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public ValueAnimator E;
    public yh.b F;
    public float G;
    public ValueAnimator H;
    public RectF f26263a;
    public oy0[] f26264b;
    public float[] f26265c;
    public float[] d;
    public float[] e;
    public float f26266f;
    public ImageReceiver h;
    public Long f26267n;
    public n6 f26268r;
    public n6 f26269s;
    public CharSequence v;
    public TextPaint f26270w;
    public StaticLayout f26271x;
    public int f26272y;

    public final long a() {
        if (this.f26264b == null) {
            return 0L;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < this.f26264b.length; i10++) {
            long f7 = this.F.f(i10);
            oy0 oy0Var = this.f26264b[i10];
            if (oy0Var != null && (oy0Var.f25942c || f7 > 0)) {
                if (f7 <= 0) {
                    f7 = oy0Var.e;
                }
                j3 += f7;
            }
        }
        return j3;
    }

    public abstract void b();

    public final void c(boolean z10) {
        boolean z11;
        oy0[] oy0VarArr = this.f26264b;
        if (oy0VarArr == null) {
            return;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < oy0VarArr.length; i10++) {
            long f7 = this.F.f(i10);
            oy0 oy0Var = oy0VarArr[i10];
            if (oy0Var != null && (oy0Var.f25942c || f7 > 0)) {
                if (f7 <= 0) {
                    f7 = oy0Var.e;
                }
                j3 += f7;
            }
        }
        this.f26272y = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < oy0VarArr.length; i11++) {
            long f12 = this.F.f(i11);
            oy0 oy0Var2 = oy0VarArr[i11];
            if (oy0Var2 != null && (oy0Var2.f25942c || f12 > 0)) {
                this.f26272y++;
            }
            if (oy0Var2 != null && ((z11 = oy0Var2.f25942c) || f12 > 0)) {
                int i12 = (f12 > 0L ? 1 : (f12 == 0L ? 0 : -1));
                if (i12 <= 0) {
                    f12 = oy0Var2.e;
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
            for (int i13 = 0; i13 < oy0VarArr.length; i13++) {
                if (oy0VarArr[i13] != null) {
                    float[] fArr = this.d;
                    fArr[i13] = fArr[i13] * f14;
                }
            }
        }
        if (!z10) {
            System.arraycopy(this.d, 0, this.f26265c, 0, oy0VarArr.length);
            return;
        }
        System.arraycopy(this.f26265c, 0, this.e, 0, oy0VarArr.length);
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.E.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new gg.t1(14, this, oy0VarArr));
        this.E.addListener(new zn0(oy0VarArr, 8));
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
            n6 n6Var = this.f26268r;
            int i10 = (a2 > 0L ? 1 : (a2 == 0L ? 0 : -1));
            if (i10 == 0) {
                str = " ";
            } else {
                str = split[0];
            }
            n6Var.q(str, true, false);
            n6 n6Var2 = this.f26269s;
            if (i10 != 0) {
                str2 = split[1];
            }
            n6Var2.q(str2, true, false);
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
        n6 n6Var = this.f26269s;
        ImageReceiver imageReceiver = this.h;
        n6 n6Var2 = this.f26268r;
        RectF rectF = this.f26263a;
        if (this.f26264b != null) {
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
            if (this.f26272y > 1) {
                float f13 = this.f26266f;
                if (f13 > 0.0f) {
                    float f14 = (float) (f13 - 0.04d);
                    this.f26266f = f14;
                    if (f14 < 0.0f) {
                        this.f26266f = 0.0f;
                    }
                }
            } else {
                float f15 = this.f26266f;
                if (f15 < 1.0f) {
                    float f16 = (float) (f15 + 0.04d);
                    this.f26266f = f16;
                    if (f16 > 1.0f) {
                        this.f26266f = 1.0f;
                    }
                }
            }
            boolean z11 = false;
            int i12 = 0;
            float f17 = 0.0f;
            while (true) {
                oy0[] oy0VarArr = this.f26264b;
                i10 = 255;
                f7 = 10.0f;
                if (i12 >= oy0VarArr.length) {
                    break;
                }
                oy0 oy0Var = oy0VarArr[i12];
                if (oy0Var != null) {
                    float f18 = this.f26265c[i12];
                    if (f18 != 0.0f) {
                        if (oy0Var.d) {
                            float z12 = com.google.android.gms.internal.vision.e2.z(f11, this.f26266f, 10.0f, f18 * (-360.0f));
                            if (z12 > 0.0f) {
                                z12 = 0.0f;
                            }
                            oy0Var.f25941b.setColor(org.telegram.ui.ActionBar.j6.w0(null, oy0Var.f25940a, z11));
                            this.f26264b[i12].f25941b.setAlpha(255);
                            double width = rectF.width() / 2.0f;
                            i11 = i12;
                            if (Math.abs((float) (((3.141592653589793d * width) / 180.0d) * z12)) <= f11) {
                                double d = (-90.0f) - (360.0f * f17);
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d)) * width)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d)) * width)), this.f26264b[i11].f25941b);
                            } else {
                                this.f26264b[i11].f25941b.setStyle(Paint.Style.STROKE);
                                canvas.drawArc(rectF, (-90.0f) - (360.0f * f17), z12, false, this.f26264b[i11].f25941b);
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
                oy0[] oy0VarArr2 = this.f26264b;
                if (i13 >= oy0VarArr2.length) {
                    break;
                }
                oy0 oy0Var2 = oy0VarArr2[i13];
                if (oy0Var2 != null) {
                    float f20 = this.f26265c[i13];
                    if (f20 != 0.0f) {
                        if (!oy0Var2.d) {
                            float z13 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f26266f, f7, f20 * (-360.0f));
                            if (z13 > 0.0f) {
                                z13 = 0.0f;
                            }
                            oy0Var2.f25941b.setColor(org.telegram.ui.ActionBar.j6.w0(null, oy0Var2.f25940a, false));
                            this.f26264b[i13].f25941b.setAlpha(i10);
                            double width2 = rectF.width() / 2.0f;
                            f10 = f20;
                            if (Math.abs((float) (z13 * ((width2 * 3.141592653589793d) / 180.0d))) <= 1.0f) {
                                double d10 = (-90.0f) - (f19 * 360.0f);
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d10)) * width2)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d10)) * width2)), this.f26264b[i13].f25941b);
                            } else {
                                this.f26264b[i13].f25941b.setStyle(Paint.Style.STROKE);
                                canvas.drawArc(rectF, (-90.0f) - (f19 * 360.0f), z13, false, this.f26264b[i13].f25941b);
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
            if (n6Var2 != null) {
                int i14 = org.telegram.ui.ActionBar.j6.f18034j5;
                n6Var2.r(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                n6Var.r(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                if (this.f26267n != null) {
                    float d11 = n6Var.d() + n6Var2.d() + AndroidUtilities.dp(4.0f);
                    float width3 = (getWidth() - d11) / 2.0f;
                    n6Var2.setBounds(0, AndroidUtilities.dp(115.0f), (int) (n6Var2.d() + width3), AndroidUtilities.dp(145.0f));
                    n6Var.setBounds((int) ((width3 + d11) - n6Var.d()), AndroidUtilities.dp(118.0f), getWidth(), AndroidUtilities.dp(148.0f));
                }
                n6Var2.draw(canvas);
                n6Var.draw(canvas);
            }
            if (this.f26271x != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(148.0f) - ((this.f26271x.getHeight() - AndroidUtilities.dp(13.0f)) / 2.0f));
                this.f26270w.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false));
                this.f26271x.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        ImageReceiver imageReceiver = this.h;
        RectF rectF = this.f26263a;
        n6 n6Var = this.f26269s;
        n6 n6Var2 = this.f26268r;
        Long l4 = this.f26267n;
        if (l4 != null) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(166.0f), 1073741824));
            i12 = org.telegram.messenger.em.y(110.0f, View.MeasureSpec.getSize(i10), 2);
            rectF.set(AndroidUtilities.dp(3.0f) + i12, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f) + i12, AndroidUtilities.dp(107.0f));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), 1073741824));
            rectF.set(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f), AndroidUtilities.dp(107.0f));
            i12 = 0;
        }
        wr wrVar = wr.h;
        n6Var2.k(0.18f, 300L, wrVar);
        n6Var2.t(AndroidUtilities.dp(24.0f));
        n6Var2.u(AndroidUtilities.bold());
        n6Var.k(0.18f, 300L, wrVar);
        if (l4 != null) {
            n6Var.t(AndroidUtilities.dp(16.0f));
            n6Var2.f25425b = 5;
            n6Var.f25425b = 3;
        } else {
            n6Var.t(AndroidUtilities.dp(13.0f));
            int textSize = (int) n6Var2.f25424a.getTextSize();
            int textSize2 = (int) n6Var.f25424a.getTextSize();
            int dp = ((AndroidUtilities.dp(110.0f) - textSize) - textSize2) / 2;
            int i13 = textSize + dp;
            n6Var2.setBounds(0, dp, getMeasuredWidth(), i13);
            n6Var.setBounds(0, AndroidUtilities.dp(2.0f) + i13, getMeasuredWidth(), AndroidUtilities.dp(2.0f) + i13 + textSize2);
            n6Var2.f25425b = 17;
            n6Var.f25425b = 17;
        }
        if (this.v != null) {
            if (this.f26270w == null) {
                this.f26270w = new TextPaint(1);
            }
            this.f26270w.setTextSize(AndroidUtilities.dp(13.0f));
            int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(60.0f);
            CharSequence charSequence = this.v;
            TextPaint textPaint = this.f26270w;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f26271x = uw0.d(charSequence, textPaint, size, false, size, 1);
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
        if (imageReceiver != null && (l4 = this.f26267n) != null && l4.longValue() != Long.MAX_VALUE && motionEvent.getX() > imageReceiver.getImageX() && motionEvent.getX() <= imageReceiver.getImageX2() && motionEvent.getY() > imageReceiver.getImageY() && motionEvent.getY() <= imageReceiver.getImageY2()) {
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
                AndroidUtilities.runOnUIThread(new uq0(this, 10), 80L);
            }
            setPressed(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCacheModel(yh.b bVar) {
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
                    ofFloat.addUpdateListener(new q70(this, 25));
                    this.H.addListener(new zn0(this, 9));
                    this.H.setInterpolator(new OvershootInterpolator(2.0f));
                    this.H.setDuration(350L);
                    this.H.start();
                }
            }
        }
    }
}
